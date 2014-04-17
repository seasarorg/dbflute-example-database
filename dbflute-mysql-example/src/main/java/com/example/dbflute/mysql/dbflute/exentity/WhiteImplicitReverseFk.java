/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package com.example.dbflute.mysql.dbflute.exentity;

import com.example.dbflute.mysql.dbflute.bsentity.BsWhiteImplicitReverseFk;

/**
 * The entity of white_implicit_reverse_fk.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 * @author jflute
 */
public class WhiteImplicitReverseFk extends BsWhiteImplicitReverseFk {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;
    /** MAX_BEGIN_DATE: Derived Referrer Alias. */
    public static final String ALIAS_maxBeginDate = "MAX_BEGIN_DATE";
    /** MAX_BEGIN_DATE: (Derived Referrer) */
    protected Integer _maxBeginDate;
    /**
     * [get] MAX_BEGIN_DATE: (Derived Referrer)
     * @return The value of the column 'MAX_BEGIN_DATE'. (NullAllowed)
     */
    public Integer getMaxBeginDate() {
        return _maxBeginDate;
    }
    /**
     * [set] MAX_BEGIN_DATE: (Derived Referrer)
     * @param maxBeginDate The value of the column 'MAX_BEGIN_DATE'. (NullAllowed)
     */
    public void setMaxBeginDate(Integer maxBeginDate) {
        _maxBeginDate = maxBeginDate;
    }
}
