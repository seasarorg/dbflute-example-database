package com.example.dbflute.oracle.dbflute.whitebox.dfprop;

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

import com.example.dbflute.oracle.dbflute.bsentity.dbmeta.MemberDbm;
import com.example.dbflute.oracle.dbflute.bsentity.dbmeta.MemberLoginDbm;
import com.example.dbflute.oracle.dbflute.bsentity.dbmeta.NextSchemaProductDbm;
import com.example.dbflute.oracle.dbflute.bsentity.dbmeta.ProductDbm;
import com.example.dbflute.oracle.dbflute.exbhv.MemberBhv;
import com.example.dbflute.oracle.dbflute.exbhv.MemberLoginBhv;
import com.example.dbflute.oracle.dbflute.exbhv.NextSchemaProductBhv;
import com.example.dbflute.oracle.dbflute.exbhv.ProductBhv;
import com.example.dbflute.oracle.dbflute.exentity.Member;
import com.example.dbflute.oracle.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.6.1 (2009/11/17 Tuesday)
 */
public class WxSequenceCacheTest extends UnitContainerTestCase {

    private MemberBhv memberBhv;
    private MemberLoginBhv memberLoginBhv;
    private ProductBhv productBhv;
    private NextSchemaProductBhv nextSchemaProductBhv;

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    public void test_dbmeta() {
        assertTrue(MemberDbm.getInstance().hasSequence());
        assertEquals(Integer.valueOf(5), MemberDbm.getInstance().getSequenceCacheSize());
        assertNotNull(MemberDbm.getInstance().getSequenceIncrementSize());
        assertTrue(MemberLoginDbm.getInstance().hasSequence());
        assertEquals(Integer.valueOf(12), MemberLoginDbm.getInstance().getSequenceCacheSize());
        assertNotNull(MemberLoginDbm.getInstance().getSequenceIncrementSize());

        // Sequence Synonym
        assertTrue(ProductDbm.getInstance().hasSequence());
        assertEquals(Integer.valueOf(24), ProductDbm.getInstance().getSequenceCacheSize());
        assertNotNull(ProductDbm.getInstance().getSequenceIncrementSize());

        // Additional Schema Sequence
        assertTrue(NextSchemaProductDbm.getInstance().hasSequence());
        assertEquals(Integer.valueOf(36), NextSchemaProductDbm.getInstance().getSequenceCacheSize());
        assertNotNull(NextSchemaProductDbm.getInstance().getSequenceIncrementSize());
    }

    // ===================================================================================
    //                                                                      Select NextVal
    //                                                                      ==============
    public void test_selectNextVal_loop_incrementWay() {
        Set<Long> resultSet = new TreeSet<Long>();
        List<Long> resultList = new ArrayList<Long>();
        for (int i = 0; i < 40; i++) {
            Long nextVal = memberBhv.selectNextVal();
            resultSet.add(nextVal);
            resultList.add(nextVal);
        }
        log(resultSet);
        assertEquals(40, resultSet.size());
        assertEquals(40, resultList.size());
        assertEquals(Long.valueOf(resultList.get(0) + 39L), resultList.get(39));
    }

    public void test_selectNextVal_loop_batchWay_basic() {
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
        Long expectedLastNum = Long.valueOf(resultList.get(0) + 39L);
        Long actualLastNum = resultList.get(39);
        // not always match because of same sequence by synonym
        // sometimes it has empty space of numbers 
        assertTrue(expectedLastNum + "<=" + actualLastNum, expectedLastNum <= actualLastNum);
    }

    public void test_selectNextVal_loop_batchWay_synonym() {
        Set<Long> resultSet = new TreeSet<Long>();
        List<Long> resultList = new ArrayList<Long>();
        for (int i = 0; i < 40; i++) {
            Long nextVal = productBhv.selectNextVal();
            resultSet.add(nextVal);
            resultList.add(nextVal);
        }
        log(resultSet);
        assertEquals(40, resultSet.size());
        assertEquals(40, resultList.size());
        Long expectedLastNum = Long.valueOf(resultList.get(0) + 39L);
        Long actualLastNum = resultList.get(39);
        // not always match because of same sequence by synonym
        // sometimes it has empty space of numbers 
        assertTrue(expectedLastNum + "<=" + actualLastNum, expectedLastNum <= actualLastNum);
    }

    public void test_selectNextVal_loop_batchWay_additionalSchema() {
        Set<Long> resultSet = new TreeSet<Long>();
        List<Long> resultList = new ArrayList<Long>();
        for (int i = 0; i < 40; i++) {
            Long nextVal = nextSchemaProductBhv.selectNextVal();
            resultSet.add(nextVal);
            resultList.add(nextVal);
        }
        log(resultSet);
        assertEquals(40, resultSet.size());
        assertEquals(40, resultList.size());
        // not always match because of same sequence by synonym
        // sometimes it has empty space of numbers 
        //assertEquals(Long.valueOf(resultList.get(0) + 39L), resultList.get(39));
    }

    public void test_selectNextVal_loop_batchWay_sameSequence() {
        Set<Long> allSet = new TreeSet<Long>();
        Set<Long> resultSet1 = new TreeSet<Long>();
        List<Long> resultList1 = new ArrayList<Long>();
        Set<Long> resultSet2 = new TreeSet<Long>();
        List<Long> resultList2 = new ArrayList<Long>();
        for (int i = 0; i < 40; i++) {
            Long nextVal1 = productBhv.selectNextVal();
            allSet.add(nextVal1);
            resultSet1.add(nextVal1);
            resultList1.add(nextVal1);
            Long nextVal2 = nextSchemaProductBhv.selectNextVal();
            allSet.add(nextVal2);
            resultSet2.add(nextVal2);
            resultList2.add(nextVal2);
        }
        log(resultSet1);
        log(resultSet2);
        assertEquals(80, allSet.size());
        assertEquals(40, resultSet1.size());
        assertEquals(40, resultList1.size());
        assertEquals(40, resultSet2.size());
        assertEquals(40, resultList2.size());
    }

    public void test_selectNextVal_threadSafe_incrementWay() {
        ExecutionCreator<List<Long>> creator = new ExecutionCreator<List<Long>>() {
            public Execution<List<Long>> create() {
                return new Execution<List<Long>>() {
                    public List<Long> execute() {
                        List<Long> ls = new ArrayList<Long>();
                        for (int i = 0; i < 30; i++) {
                            ls.add(memberBhv.selectNextVal());
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
                    sb.append(ln()).append(resultList);
                }
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
                    sb.append(ln()).append(resultList);
                }
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
            Member member = new Member();
            member.setMemberName("FOO");
            member.setMemberAccount("FOO");
            member.setMemberStatusCode_Provisional();

            // ## Act ##
            memberBhv.insert(member);

            // ## Assert ##
            log(member);
            Long memberId = member.getMemberId();
            assertNotNull(memberId);
        }
        {
            // ## Arrange ##
            Member member = new Member();
            member.setMemberName("BAR");
            member.setMemberAccount("BAR");
            member.setMemberStatusCode_Provisional();

            // ## Act ##
            memberBhv.insert(member);

            // ## Assert ##
            log(member);
            Long memberId = member.getMemberId();
            assertNotNull(memberId);
        }
    }

    public void test_batchInsert_basic() {
        // ## Arrange ##
        List<Member> memberList = new ArrayList<Member>();
        {
            Member member = new Member();
            member.setMemberName("FOO");
            member.setMemberAccount("FOO");
            member.setMemberStatusCode_Provisional();
            memberList.add(member);
        }
        {
            Member member = new Member();
            member.setMemberName("BAR");
            member.setMemberAccount("BAR");
            member.setMemberStatusCode_Provisional();
            memberList.add(member);
        }

        // ## Act ##
        memberBhv.batchInsert(memberList);

        // ## Assert ##
        for (Member member : memberList) {
            log(member);
            Long memberId = member.getMemberId();
            assertNotNull(memberId);
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
