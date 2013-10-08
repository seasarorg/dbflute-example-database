package com.example.dbflute.mysql.friends.seasar.batch.allcore;

import java.util.List;

/**
 * @author jflute
 * @since 0.9.1 (2009/02/07 Saturday)
 */
public interface BatchInvoker {

    /**
     * Invoke the batch controller. <br />
     * All batch controllers must be invoked through this invoker.
     * @param componentKey The component key of batch. (NotNull)
     * @param controller The controller of batch. (NotNull)
     * @param argList The list of arguments. (NotNull, EmptyAllowed)
     * @throws BatchException When the batch was interrupted.
     */
    void invoke(String componentKey, BatchController controller, List<String> argList) throws BatchException;
}
