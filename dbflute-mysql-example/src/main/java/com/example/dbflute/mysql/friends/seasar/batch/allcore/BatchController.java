package com.example.dbflute.mysql.friends.seasar.batch.allcore;

import java.util.List;

/**
 * @author jflute
 * @since 0.9.1 (2009/02/07 Saturday)
 */
public interface BatchController {

    /**
     * Execute this batch.
     * @param argList The list of arguments. (NotNull, EmptyAllowed)
     * @throws BatchException When the batch was interrupted.
     */
    void execute(List<String> argList) throws BatchException;
}
