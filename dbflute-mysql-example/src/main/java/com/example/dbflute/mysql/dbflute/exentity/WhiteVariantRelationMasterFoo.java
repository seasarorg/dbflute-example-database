/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package com.example.dbflute.mysql.dbflute.exentity;

import com.example.dbflute.mysql.dbflute.bsentity.BsWhiteVariantRelationMasterFoo;

/**
 * The entity of white_variant_relation_master_foo.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class WhiteVariantRelationMasterFoo extends BsWhiteVariantRelationMasterFoo {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    public static final String ALIAS_highestPurchasePrice = "HIGHEST_PURCHASE_PRICE";

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected Integer _highestPurchasePrice;

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public Integer getHighestPurchasePrice() {
        return _highestPurchasePrice;
    }

    public void setHighestPurchasePrice(Integer highestPurchasePrice) {
        this._highestPurchasePrice = highestPurchasePrice;
    }
}
