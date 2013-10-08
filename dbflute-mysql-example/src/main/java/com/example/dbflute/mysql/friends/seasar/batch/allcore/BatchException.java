package com.example.dbflute.mysql.friends.seasar.batch.allcore;

/**
 * @author jflute
 * @since 0.9.1 (2009/02/07 Saturday)
 */
public class BatchException extends Exception {

    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BatchReturn batchReturn;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BatchException(String msg, BatchReturn batchReturn) {
        super(msg);
        if (batchReturn == null) {
            throw new IllegalArgumentException("The argument 'batchReturn' should not be null!");
        }
        this.batchReturn = batchReturn;
    }

    public BatchException(String msg, BatchReturn batchReturn, Throwable e) {
        super(msg, e);
        if (batchReturn == null) {
            throw new IllegalArgumentException("The argument 'batchReturn' should not be null!");
        }
        this.batchReturn = batchReturn;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public BatchReturn getBatchReturn() {
        return batchReturn;
    }
}
