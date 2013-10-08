package com.example.dbflute.mysql.friends.seasar.batch.appimpl;

import java.util.List;

import com.example.dbflute.mysql.friends.seasar.batch.allcore.BatchController;
import com.example.dbflute.mysql.friends.seasar.batch.allcore.BatchException;
import com.example.dbflute.mysql.friends.seasar.batch.allcore.BatchInvoker;

/**
 * @author jflute
 * @since 0.9.1 (2009/02/07 Saturday)
 */
public class BatchAppInvoker implements BatchInvoker {

    /**
     * {@inheritDoc}
     */
    public void invoke(String componentKey, BatchController controller, List<String> argList) throws BatchException {
        // Execute the batch, and after that, close the execution finally.
        try {
            controller.execute(argList);
        } catch (BatchUntreatedMemberException e) {
            handleUntreatedMemberException(componentKey, controller, e);
        } catch (BatchException e) {
            handleBatchException(componentKey, controller, e);
        } finally {
            closeBatchExecution(componentKey, controller);
        }
    }

    protected void checkDoubleBoot(String componentKey, BatchController controller) throws BatchException {
        // Do something for application
    }

    protected void handleUntreatedMemberException(String componentKey, BatchController controller,
            BatchUntreatedMemberException e) throws BatchException {
        // Do something for application
        throw e;
    }

    protected void handleBatchException(String componentKey, BatchController controller, BatchException e)
            throws BatchException {
        // Do something for application
        throw e;
    }

    protected void closeBatchExecution(String componentKey, BatchController controller) {
        // Do something for application
    }
}
