package com.example.dbflute.db2.dbflute.whitebox.dfprop;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.seasar.dbflute.util.DfTypeUtil;

import com.example.dbflute.db2.dbflute.allcommon.CDef;
import com.example.dbflute.db2.dbflute.bsentity.dbmeta.MemberLoginDbm;
import com.example.dbflute.db2.dbflute.exbhv.MemberLoginBhv;
import com.example.dbflute.db2.dbflute.exbhv.PurchaseBhv;
import com.example.dbflute.db2.dbflute.exentity.MemberLogin;
import com.example.dbflute.db2.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.6.1 (2009/11/17 Tuesday)
 */
public class WxSequenceCacheTest extends UnitContainerTestCase {

    private MemberLoginBhv memberLoginBhv;
    private PurchaseBhv purchaseBhv;

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    public void test_dbmeta() {
        assertTrue(MemberLoginDbm.getInstance().hasSequence());
        assertEquals(Integer.valueOf(4), MemberLoginDbm.getInstance().getSequenceCacheSize());
    }

    // ===================================================================================
    //                                                                      Select NextVal
    //                                                                      ==============
    public void test_selectNextVal_loop_incrementWay() {
        Set<Long> resultSet = new TreeSet<Long>();
        List<Long> resultList = new ArrayList<Long>();
        for (int i = 0; i < 40; i++) {
            Long nextVal = memberLoginBhv.selectNextVal();
            resultSet.add(nextVal);
            resultList.add(nextVal);
        }
        log(resultSet);
        assertEquals(40, resultSet.size());
        assertEquals(40, resultList.size());
        assertEquals(Long.valueOf(resultList.get(0) + 39L), resultList.get(39));
    }

    public void test_selectNextVal_loop_batchWay() {
        Set<Long> resultSet = new TreeSet<Long>();
        List<Long> resultList = new ArrayList<Long>();
        for (int i = 0; i < 40; i++) {
            Long nextVal = purchaseBhv.selectNextVal();
            resultSet.add(nextVal);
            resultList.add(nextVal);
        }
        log(resultSet);
        assertEquals(40, resultSet.size());
        assertEquals(40, resultList.size());
        assertEquals(Long.valueOf(resultList.get(0) + 39L), resultList.get(39));
    }

    public void test_selectNextVal_threadSafe_incrementWay() {
        ExecutionCreator<List<Long>> creator = new ExecutionCreator<List<Long>>() {
            public Execution<List<Long>> create() {
                return new Execution<List<Long>>() {
                    public List<Long> execute() {
                        List<Long> ls = new ArrayList<Long>();
                        for (int i = 0; i < 30; i++) {
                            ls.add(memberLoginBhv.selectNextVal());
                        }
                        return ls;
                    }
                };
            }
        };
        StringBuilder sb = new StringBuilder();
        Set<Long> resultAllSet = new TreeSet<Long>();
        for (int i = 0; i < 10; i++) {
            List<List<Long>> resultListList = fireSameExecution(creator);
            for (List<Long> resultList : resultListList) {
                for (Long result : resultList) {
                    if (resultAllSet.contains(result)) {
                        fail("result: " + result);
                    }
                    resultAllSet.add(result);
                }
                sb.append(ln()).append(resultList);
            }
        }
        List<Long> resultAllList = new ArrayList<Long>(resultAllSet);
        Long min = resultAllList.get(0);
        Long max = Long.valueOf(resultAllList.get(resultAllList.size() - 1));
        log(sb.toString());
        log("min = " + min + ", max = " + max);
        assertEquals(3000, resultAllSet.size());
        assertEquals(Long.valueOf(min + (resultAllList.size() - 1)), max);
    }

    public void test_selectNextVal_threadSafe_batchWay() {
        ExecutionCreator<List<Long>> creator = new ExecutionCreator<List<Long>>() {
            public Execution<List<Long>> create() {
                return new Execution<List<Long>>() {
                    public List<Long> execute() {
                        List<Long> ls = new ArrayList<Long>();
                        for (int i = 0; i < 30; i++) {
                            ls.add(purchaseBhv.selectNextVal());
                        }
                        return ls;
                    }
                };
            }
        };
        StringBuilder sb = new StringBuilder();
        Set<Long> resultAllSet = new TreeSet<Long>();
        for (int i = 0; i < 10; i++) {
            List<List<Long>> resultListList = fireSameExecution(creator);
            for (List<Long> resultList : resultListList) {
                for (Long result : resultList) {
                    if (resultAllSet.contains(result)) {
                        fail("result: " + result);
                    }
                    resultAllSet.add(result);
                }
                sb.append(ln()).append(resultList);
            }
        }
        List<Long> resultAllList = new ArrayList<Long>(resultAllSet);
        Long min = resultAllList.get(0);
        Long max = Long.valueOf(resultAllList.get(resultAllList.size() - 1));
        log(sb.toString());
        log("min = " + min + ", max = " + max);
        assertEquals(3000, resultAllSet.size());
        assertEquals(Long.valueOf(min + (resultAllList.size() - 1)), max);
    }

    // ===================================================================================
    //                                                                              Insert
    //                                                                              ======
    public void test_insert_basic() {
        {
            // ## Arrange ##
            MemberLogin memberLogin = new MemberLogin();
            memberLogin.setLoginDatetime(DfTypeUtil.toTimestamp("2043/12/21 12:34:56"));
            memberLogin.setMemberId(3);
            memberLogin.setMobileLoginFlg_True();
            memberLogin.setLoginMemberStatusCodeAsMemberStatus(CDef.MemberStatus.Formalized);

            // ## Act ##
            memberLoginBhv.insert(memberLogin);

            // ## Assert ##
            log(memberLogin);
            Long memberLoginId = memberLogin.getMemberLoginId();
            assertNotNull(memberLoginId);
        }
        {
            // ## Arrange ##
            MemberLogin memberLogin = new MemberLogin();
            memberLogin.setLoginDatetime(DfTypeUtil.toTimestamp("2043/11/01 12:21:56"));
            memberLogin.setMemberId(4);
            memberLogin.setMobileLoginFlg_True();
            memberLogin.setLoginMemberStatusCodeAsMemberStatus(CDef.MemberStatus.Formalized);

            // ## Act ##
            memberLoginBhv.insert(memberLogin);

            // ## Assert ##
            log(memberLogin);
            Long memberLoginId = memberLogin.getMemberLoginId();
            assertNotNull(memberLoginId);
        }
    }

    public void test_batchInsert_basic() {
        // ## Arrange ##
        List<MemberLogin> memberLoginList = new ArrayList<MemberLogin>();
        {
            MemberLogin memberLogin = new MemberLogin();
            memberLogin.setLoginDatetime(DfTypeUtil.toTimestamp("2041/12/21 11:34:52"));
            memberLogin.setMemberId(4);
            memberLogin.setMobileLoginFlg_True();
            memberLogin.setLoginMemberStatusCodeAsMemberStatus(CDef.MemberStatus.Formalized);
            memberLoginList.add(memberLogin);
        }
        {
            MemberLogin memberLogin = new MemberLogin();
            memberLogin.setLoginDatetime(DfTypeUtil.toTimestamp("2063/11/11 12:31:56"));
            memberLogin.setMemberId(2);
            memberLogin.setMobileLoginFlg_True();
            memberLogin.setLoginMemberStatusCodeAsMemberStatus(CDef.MemberStatus.Formalized);
            memberLoginList.add(memberLogin);
        }

        // ## Act ##
        memberLoginBhv.batchInsert(memberLoginList);

        // ## Assert ##
        for (MemberLogin memberLogin : memberLoginList) {
            log(memberLogin);
            Long memberLoginId = memberLogin.getMemberLoginId();
            assertNotNull(memberLoginId);
        }
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    private <RESULT> List<RESULT> fireSameExecution(ExecutionCreator<RESULT> creator) {
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
                throw new IllegalStateException(msg, e.getCause());
            }
        }
        return resultList;
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
