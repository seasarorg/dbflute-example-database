package com.example.dbflute.mysql.friends.seasar.batch.unit;

import java.util.List;

import org.seasar.dbflute.unit.core.PlainTestCase;

import com.example.dbflute.mysql.friends.seasar.batch.allcore.BatchController;
import com.example.dbflute.mysql.friends.seasar.batch.allcore.BatchException;
import com.example.dbflute.mysql.friends.seasar.batch.allcore.BatchInvoker;
import com.example.dbflute.mysql.friends.seasar.batch.allcore.BatchReturn;
import com.example.dbflute.mysql.friends.seasar.batch.appimpl.BatchS2ContainerTxRollbackStarter;

/**
 * @author jflute
 * @since 1.0.0 (2009/07/01 Wednesday)
 */
public abstract class BatchAllThroughTestCase extends PlainTestCase {

    // ===================================================================================
    //                                                                          Fire Batch
    //                                                                          ==========
    protected void fire(String[] args, final Arrangement arragememntCallback, final Assertion assertionCallback) {
        final BatchReturn defaultError = BatchReturn.create(9);
        BatchS2ContainerTxRollbackStarter starter = new BatchS2ContainerTxRollbackStarter(defaultError) {
            @Override
            protected void delegateInvoker(BatchInvoker invoker, String componentKey, BatchController controller,
                    List<String> argList) throws BatchException { // in transaction
                // ## Arrange ##
                logArrange();
                arragememntCallback.callback();

                Throwable exception = null;
                try {
                    // ## Act ##
                    logAct();
                    super.delegateInvoker(invoker, componentKey, controller, argList);
                } catch (BatchException e) {
                    exception = e;
                } catch (Throwable e) {
                    exception = e;
                }

                // ## Assert ##
                logAssert();
                assertionCallback.callback(exception);
            }

            @Override
            protected void handleException(BatchReturn batchError, String msg, Throwable e) {
                super.handleException(batchError, msg, e);
                if (e instanceof BatchTestFailureException) {
                    throw (BatchTestFailureException) e;
                }
                throw new BatchTestFailureException(e);
            }
        };
        starter.fire(args);
    }

    protected static interface Arrangement {
        void callback();
    }

    protected static interface Assertion {
        void callback(Throwable exception);
    }

    protected static class BatchTestFailureException extends RuntimeException {
        private static final long serialVersionUID = 1L;

        public BatchTestFailureException(Throwable e) {
            super(e);
        }
    }

    protected void logArrange() {
        log("==========================================================================================");
        log("                                                                                   Arrange");
        log("                                                                                   =======");
    }

    protected void logAct() {
        log("==========================================================================================");
        log("                                                                                       Act");
        log("                                                                                       ===");
    }

    protected void logAssert() {
        log("==========================================================================================");
        log("                                                                                    Assert");
        log("                                                                                    ======");
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    // -----------------------------------------------------
    //                                                 Basic
    //                                                 -----
    protected void throwExceptionIfNotNull(Throwable exception) {
        if (exception != null) {
            throw new BatchTestFailureException(exception);
        }
    }
}
