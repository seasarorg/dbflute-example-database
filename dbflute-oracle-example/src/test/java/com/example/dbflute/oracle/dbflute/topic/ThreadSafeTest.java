package com.example.dbflute.oracle.dbflute.topic;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.dbflute.exception.EntityAlreadyUpdatedException;
import org.seasar.dbflute.unit.core.transaction.TransactionResource;
import org.seasar.dbflute.util.DfCollectionUtil;

import com.example.dbflute.oracle.dbflute.cbean.MemberCB;
import com.example.dbflute.oracle.dbflute.exbhv.MemberBhv;
import com.example.dbflute.oracle.dbflute.exbhv.PurchaseBhv;
import com.example.dbflute.oracle.dbflute.exbhv.pmbean.SimpleMemberPmb;
import com.example.dbflute.oracle.dbflute.exentity.Member;
import com.example.dbflute.oracle.dbflute.exentity.Purchase;
import com.example.dbflute.oracle.dbflute.exentity.customize.SimpleMember;
import com.example.dbflute.oracle.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.5.1 (2009/06/20 Saturday)
 */
public class ThreadSafeTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private MemberBhv memberBhv;
    private PurchaseBhv purchaseBhv;

    // ===================================================================================
    //                                                                       ConditionBean
    //                                                                       =============
    public void test_conditionBean_threadSafe_sameExecution() {
        ExecutionCreator<List<Member>> creator = new ExecutionCreator<List<Member>>() {
            public Execution<List<Member>> create() {
                return new Execution<List<Member>>() {
                    public List<Member> execute() {
                        // ## Arrange ##
                        MemberCB cb = new MemberCB();
                        cb.setupSelect_MemberStatus();
                        cb.query().setMemberName_PrefixSearch("S");
                        cb.query().addOrderBy_Birthdate_Desc().addOrderBy_MemberId_Asc();

                        // ## Act ##
                        ListResultBean<Member> memberList = memberBhv.selectList(cb);

                        // ## Assert ##
                        assertFalse(memberList.isEmpty());
                        for (Member member : memberList) {
                            assertTrue(member.getMemberName().startsWith("S"));
                        }
                        return memberList;
                    }
                };
            }
        };
        for (int i = 0; i < 5; i++) {
            fireSameExecution(creator);
        }
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    public void test_outsideSql_threadSafe_sameExecution() {
        ExecutionCreator<List<SimpleMember>> creator = new ExecutionCreator<List<SimpleMember>>() {
            public Execution<List<SimpleMember>> create() {
                return new Execution<List<SimpleMember>>() {
                    public List<SimpleMember> execute() {
                        // ## Arrange ##
                        String path = MemberBhv.PATH_selectSimpleMember;

                        SimpleMemberPmb pmb = new SimpleMemberPmb();
                        pmb.setMemberName_PrefixSearch("S");

                        Class<SimpleMember> entityType = SimpleMember.class;

                        // ## Act ##
                        List<SimpleMember> memberList = memberBhv.outsideSql().selectList(path, pmb, entityType);

                        // ## Assert ##
                        assertNotSame(0, memberList.size());
                        log("{SimpleMember}");
                        for (SimpleMember entity : memberList) {
                            Long memberId = entity.getMemberId();
                            String memberName = entity.getMemberName();
                            String memberStatusName = entity.getMemberStatusName();
                            log("    " + memberId + ", " + memberName + ", " + memberStatusName);
                            assertNotNull(memberId);
                            assertNotNull(memberName);
                            assertNotNull(memberStatusName);
                            assertTrue(memberName.startsWith("S"));
                        }
                        return memberList;
                    }
                };
            }
        };
        for (int i = 0; i < 5; i++) {
            fireSameExecution(creator);
        }
    }

    // ===================================================================================
    //                                                                              Update
    //                                                                              ======
    public void test_update_threadSafe_sameExecution() { // uses original transactions
        final long memberId = 3L;
        final Member before = memberBhv.selectByPKValue(memberId);
        final Long versionNo = before.getVersionNo();
        final Set<String> markSet = DfCollectionUtil.newHashSet();
        ExecutionCreator<List<Member>> creator = new ExecutionCreator<List<Member>>() {
            public Execution<List<Member>> create() {
                return new Execution<List<Member>>() {
                    public List<Member> execute() {
                        xprepareAccessContext();
                        TransactionResource transaction = beginNewTransaction();
                        try {
                            final long threadId = Thread.currentThread().getId();
                            Purchase purchase = new Purchase();
                            purchase.setMemberId(3L);
                            long currentMillis = currentTimestamp().getTime();
                            long keyMillis = currentMillis - (threadId * 10000000);
                            purchase.setPurchaseDatetime(new Timestamp(keyMillis));
                            purchase.setPurchaseCount(1234L);
                            purchase.setPurchasePrice(1234L);
                            purchase.setPaymentCompleteFlg_True();
                            purchase.setProductId(3L);
                            purchaseBhv.insert(purchase);
                            // deadlock if update is executed after insert
                            // (updateNonstrict() too)
                            // ShareLock and ExclusiveLock are points
                            Member member = new Member();
                            member.setMemberId(memberId);
                            member.setVersionNo(versionNo);
                            memberBhv.update(member);
                            markSet.add("success: " + threadId);
                        } finally {
                            try {
                                transaction.commit();
                            } catch (Exception ignored) {
                            }
                        }
                        return DfCollectionUtil.emptyList();
                    }
                };
            }
        };
        try {
            for (int i = 0; i < 5; i++) {
                try {
                    fireSameExecution(creator);
                } catch (ThreadFireException e) {
                    Throwable cause = e.getCause();
                    log(cause.getMessage());
                    if (cause instanceof EntityAlreadyUpdatedException) {
                        // OK
                        return;
                    }
                    throw e;
                }
            }
            fail();
        } finally {
            log(markSet);
        }
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    private <RESULT> void fireSameExecution(ExecutionCreator<RESULT> creator) {
        // ## Arrange ##
        ExecutorService service = Executors.newCachedThreadPool();
        int threadCount = 10;
        CountDownLatch ready = new CountDownLatch(threadCount);
        CountDownLatch start = new CountDownLatch(1);
        CountDownLatch goal = new CountDownLatch(threadCount);
        Execution<RESULT> execution = creator.create();
        List<Future<RESULT>> futureList = new ArrayList<Future<RESULT>>();
        for (int i = 0; i < threadCount; i++) {
            Future<RESULT> future = service.submit(createCallable(execution, ready, start, goal));
            futureList.add(future);
        }

        // ## Act ##
        // Start!
        start.countDown();
        try {
            // Wait until all threads are finished!
            goal.await();
        } catch (InterruptedException e) {
            String msg = "goal.await() was interrupted!";
            throw new IllegalStateException(msg, e);
        }
        log("All threads are finished!");

        // ## Assert ##
        List<RESULT> resultList = new ArrayList<RESULT>();
        for (Future<RESULT> future : futureList) {
            try {
                RESULT result = future.get();
                assertNotNull(result);
                resultList.add(result);
            } catch (InterruptedException e) {
                String msg = "future.get() was interrupted!";
                throw new IllegalStateException(msg, e);
            } catch (ExecutionException e) {
                String msg = "Failed to execute!";
                throw new ThreadFireException(msg, e.getCause());
            }
        }
        RESULT preResult = null;
        for (RESULT result : resultList) {
            log(result);
            if (preResult == null) {
                preResult = result;
                continue;
            }
            assertEquals(preResult, result);
        }
    }

    protected static class ThreadFireException extends RuntimeException {
        private static final long serialVersionUID = 1L;

        public ThreadFireException(String msg, Throwable e) {
            super(msg, e);
        }
    }

    private static interface ExecutionCreator<RESULT> {
        Execution<RESULT> create();
    }

    private static interface Execution<RESULT> {
        RESULT execute();
    }

    private <RESULT> Callable<RESULT> createCallable(final Execution<RESULT> execution, final CountDownLatch ready,
            final CountDownLatch start, final CountDownLatch goal) {
        return new Callable<RESULT>() {
            public RESULT call() {
                try {
                    ready.countDown();
                    try {
                        start.await();
                    } catch (InterruptedException e) {
                        String msg = "start.await() was interrupted!";
                        throw new IllegalStateException(msg, e);
                    }
                    RESULT result = execution.execute();
                    return result;
                } finally {
                    goal.countDown();
                }
            }
        };
    }
}
