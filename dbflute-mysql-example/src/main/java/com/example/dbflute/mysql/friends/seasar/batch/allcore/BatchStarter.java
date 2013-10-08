package com.example.dbflute.mysql.friends.seasar.batch.allcore;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Batch main class for executing batch controllers. <br />
 * This doesn't have scheduling system. Executing only.
 * @author jflute
 * @since 0.9.1 (2009/02/07 Saturday)
 */
public abstract class BatchStarter {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    private static final Log _log = LogFactory.getLog(BatchStarter.class);

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private BatchReturn defaultBatchReturn;
    private boolean exitIfError = true;
    private int exitCode = 0;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BatchStarter(BatchReturn defaultBatchReturn) {
        if (defaultBatchReturn == null) {
            String msg = "The argument 'defaultBatchReturn' should not be null!";
            throw new IllegalArgumentException(msg);
        }
        this.defaultBatchReturn = defaultBatchReturn;
    }

    // ===================================================================================
    //                                                                             Execute
    //                                                                             =======
    public void fire(String[] args) {
        if (args == null || args.length == 0) {
            String msg = "This main method should have batch component as argument!";
            throw new IllegalArgumentException(msg);
        }
        final List<String> argList = new ArrayList<String>();
        for (String arg : args) {
            argList.add(arg);
        }
        final String componentKey = argList.remove(0);

        initializeContainer();
        final BatchController controller = getBatchController(componentKey);
        final BatchInvoker invoker = getBatchInvoker();
        try {
            dispatchInvoker(invoker, componentKey, controller, argList);
        } catch (BatchException e) {
            String msg = "The batch exception:";
            msg = msg + " componentKey=" + componentKey + " exitCode=" + exitCode;
            handleException(e.getBatchReturn(), msg, e);
        } catch (Throwable t) {
            String msg = "The controller threw the exception:";
            msg = msg + " componentKey=" + componentKey + " exitCode=" + exitCode;
            handleException(defaultBatchReturn, msg, t);
        }
    }

    protected void dispatchInvoker(BatchInvoker invoker, String componentKey, BatchController controller,
            List<String> argList) throws BatchException {
        invoker.invoke(componentKey, controller, argList);
    }

    // ===================================================================================
    //                                                                  Container Handling
    //                                                                  ==================
    protected abstract void initializeContainer();

    protected abstract BatchInvoker getBatchInvoker();

    protected abstract BatchController getBatchController(String componentKey);

    // ===================================================================================
    //                                                                  Exception Handling
    //                                                                  ==================
    protected void handleException(BatchReturn batchError, String msg, Throwable t) {
        exitCode = batchError.getBatchReturnCode();
        _log.error(msg, t);
        existIfNeeds();
    }

    // ===================================================================================
    //                                                                                Exit
    //                                                                                ====
    protected void existIfNeeds() {
        if (exitIfError) {
            System.exit(exitCode);
        }
    }

    // ===================================================================================
    //                                                                  Exit Code Handling
    //                                                                  ==================
    public void noexit() {
        exitIfError = false;
    }

    public int getExitCode() {
        return exitCode;
    }
}
