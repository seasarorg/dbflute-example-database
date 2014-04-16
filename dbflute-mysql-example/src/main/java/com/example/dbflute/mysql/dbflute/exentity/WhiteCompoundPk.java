/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package com.example.dbflute.mysql.dbflute.exentity;

import com.example.dbflute.mysql.dbflute.bsentity.BsWhiteCompoundPk;

/**
 * The entity of white_compound_pk.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 * @author jflute
 */
public class WhiteCompoundPk extends BsWhiteCompoundPk {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;
    /** MAX_ID: Derived Referrer Alias. */
    public static final String ALIAS_maxId = "MAX_ID";
    /** MAX_ID: (Derived Referrer) */
    protected Integer _maxId;
    /**
     * [get] MAX_ID: (Derived Referrer)
     * @return The value of the column 'MAX_ID'. (NullAllowed)
     */
    public Integer getMaxId() {
        return _maxId;
    }
    /**
     * [set] MAX_ID: (Derived Referrer)
     * @param maxId The value of the column 'MAX_ID'. (NullAllowed)
     */
    public void setMaxId(Integer maxId) {
        _maxId = maxId;
    }
}
