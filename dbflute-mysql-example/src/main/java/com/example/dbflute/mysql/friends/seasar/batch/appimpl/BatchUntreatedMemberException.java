package com.example.dbflute.mysql.friends.seasar.batch.appimpl;

import java.util.List;

import com.example.dbflute.mysql.friends.seasar.batch.allcore.BatchException;
import com.example.dbflute.mysql.friends.seasar.batch.allcore.BatchReturn;

/**
 * @author jflute
 * @since 0.9.1 (2009/02/07 Saturday)
 */
public class BatchUntreatedMemberException extends BatchException {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    private static final long serialVersionUID = 1L;
    private static final BatchReturn FIXED_RETURN = BatchReturn.create(8);

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<BatchUntreatedMemberInfo> untreatedMemberList;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BatchUntreatedMemberException(String msg, List<BatchUntreatedMemberInfo> untreatedMemberList) {
        super(msg, FIXED_RETURN);
        this.untreatedMemberList = untreatedMemberList;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<BatchUntreatedMemberInfo> getUntreatedMemberList() {
        return untreatedMemberList;
    }
}
