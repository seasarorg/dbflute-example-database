package com.example.dbflute.mysql.dbflute.whitebox;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.seasar.dbflute.CallbackContext;
import org.seasar.dbflute.cbean.PagingResultBean;
import org.seasar.dbflute.cbean.UnionQuery;
import org.seasar.dbflute.jdbc.SqlLogHandler;
import org.seasar.dbflute.jdbc.SqlLogInfo;
import org.seasar.dbflute.util.Srl;

import com.example.dbflute.mysql.dbflute.cbean.MemberCB;
import com.example.dbflute.mysql.dbflute.exbhv.MemberBhv;
import com.example.dbflute.mysql.dbflute.exentity.Member;
import com.example.dbflute.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 */
public class WxPagingCountLaterMySQLTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private MemberBhv memberBhv;

    // ===================================================================================
    //                                                                               Basic
    //                                                                               =====
    public void test_PagingCountLater_basic() {
        // ## Arrange ##
        PagingResultBean<Member> expectedPage3;
        {
            MemberCB cb = new MemberCB();
            cb.query().addOrderBy_MemberName_Asc();
            cb.paging(4, 3);
            cb.disablePagingCountLater();
            expectedPage3 = memberBhv.selectPage(cb);
        }
        MemberCB cb = new MemberCB();
        cb.query().addOrderBy_MemberName_Asc();
        cb.paging(4, 3);
        //cb.enablePagingCountLater(); because default is enabled
        CallbackContext context = new CallbackContext();
        final List<String> displaySqlList = new ArrayList<String>();
        context.setSqlLogHandler(new SqlLogHandler() {
            public void handle(SqlLogInfo info) {
                displaySqlList.add(info.getDisplaySql());
            }
        });
        CallbackContext.setCallbackContextOnThread(context);

        try {
            // ## Act ##
            PagingResultBean<Member> page3 = memberBhv.selectPage(cb);

            // ## Assert ##
            assertNotSame(0, page3.size());
            assertEquals(4, page3.size());
            for (Member member : page3) {
                log(member.toString());
            }
            log("allRecordCount=" + page3.getAllRecordCount());
            log("allPageCount=" + page3.getAllPageCount());
            log("currentPageNumber=" + page3.getCurrentPageNumber());
            log("currentStartRecordNumber=" + page3.getCurrentStartRecordNumber());
            log("currentEndRecordNumber=" + page3.getCurrentEndRecordNumber());
            log("isExistPrePage=" + page3.isExistPrePage());
            log("isExistNextPage=" + page3.isExistNextPage());
            assertEquals(expectedPage3, page3);
            assertEquals(expectedPage3.getAllRecordCount(), page3.getAllRecordCount());
            assertEquals(expectedPage3.getAllPageCount(), page3.getAllPageCount());
            assertTrue(Srl.contains(displaySqlList.get(0), " sql_calc_found_rows "));
            assertTrue(Srl.contains(displaySqlList.get(1), " found_rows()"));
        } finally {
            CallbackContext.clearCallbackContextOnThread();
        }
    }

    public void test_PagingCountLater_query() {
        // ## Arrange ##
        PagingResultBean<Member> expectedPage3;
        {
            MemberCB cb = new MemberCB();
            cb.query().setBirthdate_IsNotNull();
            cb.query().addOrderBy_MemberName_Asc();
            cb.paging(4, 3);
            cb.disablePagingCountLater();
            expectedPage3 = memberBhv.selectPage(cb);
        }
        MemberCB cb = new MemberCB();
        cb.query().setBirthdate_IsNotNull();
        cb.query().addOrderBy_MemberName_Asc();
        cb.paging(4, 3);
        //cb.enablePagingCountLater(); because default is enabled
        CallbackContext context = new CallbackContext();
        final List<String> displaySqlList = new ArrayList<String>();
        context.setSqlLogHandler(new SqlLogHandler() {
            public void handle(SqlLogInfo info) {
                displaySqlList.add(info.getDisplaySql());
            }
        });
        CallbackContext.setCallbackContextOnThread(context);

        try {
            // ## Act ##
            PagingResultBean<Member> page3 = memberBhv.selectPage(cb);

            // ## Assert ##
            assertNotSame(0, page3.size());
            assertEquals(4, page3.size());
            for (Member member : page3) {
                log(member.toString());
            }
            log("allRecordCount=" + page3.getAllRecordCount());
            log("allPageCount=" + page3.getAllPageCount());
            log("currentPageNumber=" + page3.getCurrentPageNumber());
            log("currentStartRecordNumber=" + page3.getCurrentStartRecordNumber());
            log("currentEndRecordNumber=" + page3.getCurrentEndRecordNumber());
            log("isExistPrePage=" + page3.isExistPrePage());
            log("isExistNextPage=" + page3.isExistNextPage());
            assertEquals(expectedPage3, page3);
            assertEquals(expectedPage3.getAllRecordCount(), page3.getAllRecordCount());
            assertEquals(expectedPage3.getAllPageCount(), page3.getAllPageCount());
            assertTrue(Srl.contains(displaySqlList.get(0), " sql_calc_found_rows "));
            assertTrue(Srl.contains(displaySqlList.get(1), " found_rows()"));
        } finally {
            CallbackContext.clearCallbackContextOnThread();
        }
    }

    // ===================================================================================
    //                                                                           Re-Select
    //                                                                           =========
    public void test_PagingCountLater_reselect() {
        // ## Arrange ##
        PagingResultBean<Member> expectedPageMax;
        {
            MemberCB cb = new MemberCB();
            int countAll = memberBhv.selectCount(cb);
            cb.query().addOrderBy_MemberName_Asc();
            cb.paging(4, (countAll / 4) + ((countAll % 4) > 0 ? 1 : 0));
            cb.disablePagingCountLater();
            expectedPageMax = memberBhv.selectPage(cb);
        }
        MemberCB cb = new MemberCB();
        cb.query().addOrderBy_MemberName_Asc();
        cb.paging(4, 99999);
        //cb.enablePagingCountLater(); because default is enabled
        CallbackContext context = new CallbackContext();
        final List<String> displaySqlList = new ArrayList<String>();
        context.setSqlLogHandler(new SqlLogHandler() {
            public void handle(SqlLogInfo info) {
                displaySqlList.add(info.getDisplaySql());
            }
        });
        CallbackContext.setCallbackContextOnThread(context);

        try {
            // ## Act ##
            PagingResultBean<Member> actualPageMax = memberBhv.selectPage(cb);

            // ## Assert ##
            assertNotSame(0, actualPageMax.size());
            assertEquals(4, actualPageMax.size());
            for (Member member : actualPageMax) {
                log(member.toString());
            }
            log("allRecordCount=" + actualPageMax.getAllRecordCount());
            log("allPageCount=" + actualPageMax.getAllPageCount());
            log("currentPageNumber=" + actualPageMax.getCurrentPageNumber());
            log("currentStartRecordNumber=" + actualPageMax.getCurrentStartRecordNumber());
            log("currentEndRecordNumber=" + actualPageMax.getCurrentEndRecordNumber());
            log("isExistPrePage=" + actualPageMax.isExistPrePage());
            log("isExistNextPage=" + actualPageMax.isExistNextPage());
            assertEquals(expectedPageMax, actualPageMax);
            assertEquals(expectedPageMax.getAllRecordCount(), actualPageMax.getAllRecordCount());
            assertEquals(expectedPageMax.getAllPageCount(), actualPageMax.getAllPageCount());
            assertTrue(Srl.contains(displaySqlList.get(0), " sql_calc_found_rows "));
            assertTrue(Srl.contains(displaySqlList.get(1), " found_rows()"));
        } finally {
            CallbackContext.clearCallbackContextOnThread();
        }
    }

    // ===================================================================================
    //                                                                               Union
    //                                                                               =====
    public void test_PagingCountLater_union() {
        // ## Arrange ##
        PagingResultBean<Member> expectedPage3;
        {
            MemberCB cb = new MemberCB();
            cb.union(new UnionQuery<MemberCB>() {
                public void query(MemberCB unionCB) {
                }
            });
            cb.query().addOrderBy_MemberName_Asc();
            cb.paging(4, 3);
            cb.disablePagingCountLater();
            expectedPage3 = memberBhv.selectPage(cb);
        }
        MemberCB cb = new MemberCB();
        cb.union(new UnionQuery<MemberCB>() {
            public void query(MemberCB unionCB) {
            }
        });
        cb.query().addOrderBy_MemberName_Asc();
        cb.paging(4, 3);
        //cb.enablePagingCountLater(); because default is enabled
        CallbackContext context = new CallbackContext();
        final List<String> displaySqlList = new ArrayList<String>();
        context.setSqlLogHandler(new SqlLogHandler() {
            public void handle(SqlLogInfo info) {
                displaySqlList.add(info.getDisplaySql());
            }
        });
        CallbackContext.setCallbackContextOnThread(context);

        try {
            // ## Act ##
            PagingResultBean<Member> page3 = memberBhv.selectPage(cb);

            // ## Assert ##
            assertNotSame(0, page3.size());
            assertEquals(4, page3.size());
            for (Member member : page3) {
                log(member.toString());
            }
            log("allRecordCount=" + page3.getAllRecordCount());
            log("allPageCount=" + page3.getAllPageCount());
            log("currentPageNumber=" + page3.getCurrentPageNumber());
            log("currentStartRecordNumber=" + page3.getCurrentStartRecordNumber());
            log("currentEndRecordNumber=" + page3.getCurrentEndRecordNumber());
            log("isExistPrePage=" + page3.isExistPrePage());
            log("isExistNextPage=" + page3.isExistNextPage());
            assertEquals(expectedPage3, page3);
            assertFalse(Srl.contains(displaySqlList.get(0), " sql_calc_found_rows "));
            assertFalse(Srl.contains(displaySqlList.get(1), " found_rows()"));
        } finally {
            CallbackContext.clearCallbackContextOnThread();
        }
    }

    // ===================================================================================
    //                                                                          ThreadSafe
    //                                                                          ==========
    public void test_PagingCountLater_threadSafe() {
        ExecutionCreator<List<Member>> creator = new ExecutionCreator<List<Member>>() {
            public Execution<List<Member>> create() {
                return new Execution<List<Member>>() {
                    int _count = 0;

                    public List<Member> execute() {
                        // ## Arrange ##
                        ++_count;
                        String prefix = _count % 2 == 0 ? "S" : "M";
                        MemberCB cb = new MemberCB();
                        cb.setupSelect_MemberStatus();
                        cb.query().setMemberName_PrefixSearch(prefix);
                        cb.query().addOrderBy_Birthdate_Desc().addOrderBy_MemberId_Asc();
                        int expectedCount = memberBhv.selectCount(cb);
                        cb.paging(3, 1);
                        cb.enablePagingCountLater();

                        // ## Act ##
                        PagingResultBean<Member> memberPage = memberBhv.selectPage(cb);

                        // ## Assert ##
                        assertFalse(memberPage.isEmpty());
                        for (Member member : memberPage) {
                            assertTrue(member.getMemberName().startsWith(prefix));
                        }
                        assertEquals(expectedCount, memberPage.getAllRecordCount());
                        return memberPage;
                    }
                };
            }
        };
        for (int i = 0; i < 5; i++) {
            fireSameExecution(creator, false);
        }
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    private <RESULT> void fireSameExecution(ExecutionCreator<RESULT> creator, boolean sameCheck) {
        // ## Arrange ##
        ExecutorService service = Executors.newCachedThreadPool();
        int threadCount = 20;
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
        if (sameCheck) {
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
