package com.example.dbflute.mysql.friends.seasar.batch.appimpl;

import java.util.List;

import javax.transaction.NotSupportedException;
import javax.transaction.SystemException;
import javax.transaction.TransactionManager;

import org.seasar.framework.container.SingletonS2Container;

import com.example.dbflute.mysql.friends.seasar.batch.allcore.BatchController;
import com.example.dbflute.mysql.friends.seasar.batch.allcore.BatchException;
import com.example.dbflute.mysql.friends.seasar.batch.allcore.BatchInvoker;
import com.example.dbflute.mysql.friends.seasar.batch.allcore.BatchReturn;

/**
 * @author kubo_masahiko
 * @since 1.0.0 (2009/06/23 Tuesday)
 */
public class BatchS2ContainerTxRollbackStarter extends BatchS2ContainerStarter {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BatchS2ContainerTxRollbackStarter(BatchReturn defaultBatchReturn) {
        super(defaultBatchReturn);
        noexit();
    }

    // ===================================================================================
    //                                                                Transaction Override
    //                                                                ====================
    @Override
    protected void dispatchInvoker(final BatchInvoker invoker, final String componentKey,
            final BatchController controller, final List<String> argList) throws BatchException {
        delegateTransaction(new BatchTransaction() {
            public void callback() throws BatchException {
                delegateInvoker(invoker, componentKey, controller, argList);
            }
        });
    }

    protected void delegateInvoker(BatchInvoker invoker, String componentKey, BatchController controller,
            List<String> argList) throws BatchException {
        super.dispatchInvoker(invoker, componentKey, controller, argList);
    }

    // ===================================================================================
    //                                                                Transaction Callback
    //                                                                ====================
    protected static interface BatchTransaction {
        void callback() throws BatchException;
    }

    private void delegateTransaction(BatchTransaction callback) throws BatchException {
        final TransactionManager transactionManager = SingletonS2Container.getComponent(TransactionManager.class);
        try {
            try {
                transactionManager.begin();
            } catch (NotSupportedException e) {
                throw new IllegalStateException(e);
            } catch (SystemException e) {
                throw new IllegalStateException(e);
            }
            callback.callback();
        } finally {
            try {
                transactionManager.rollback();
            } catch (IllegalStateException e) {
                throw new IllegalStateException(e);
            } catch (SecurityException e) {
                throw new IllegalStateException(e);
            } catch (SystemException e) {
                throw new IllegalStateException(e);
            }
        }
    }
}
