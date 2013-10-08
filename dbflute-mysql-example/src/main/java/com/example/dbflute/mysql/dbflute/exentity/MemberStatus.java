/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package com.example.dbflute.mysql.dbflute.exentity;

import com.example.dbflute.mysql.dbflute.bsentity.BsMemberStatus;

/**
 * The entity of member_status.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class MemberStatus extends BsMemberStatus {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    public static final String ALIAS_maxPurchasePrice = "MAX_PURCHASE_PRICE";

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected Integer _maxPurchasePrice;

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public Integer getMaxPurchasePrice() {
        return _maxPurchasePrice;
    }

    public void setMaxPurchasePrice(Integer maxPurchasePrice) {
        this._maxPurchasePrice = maxPurchasePrice;
    }
}
