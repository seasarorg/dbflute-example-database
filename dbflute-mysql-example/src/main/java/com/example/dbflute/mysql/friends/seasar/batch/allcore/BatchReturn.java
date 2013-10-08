package com.example.dbflute.mysql.friends.seasar.batch.allcore;

/**
 * @author jflute
 * @since 0.9.1 (2009/02/07 Saturday)
 */
public class BatchReturn {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private int batchReturnCode;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    private BatchReturn(int batchReturnCode) {
        this.batchReturnCode = batchReturnCode;
    }

    public static BatchReturn create(int batchErrorCode) {
        return new BatchReturn(batchErrorCode);
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    public String toString() {
        return "{" + batchReturnCode + "}";
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public int getBatchReturnCode() {
        return batchReturnCode;
    }
}
