/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package com.example.dbflute.mysql.dbflute.exbhv.pmbean;

import com.example.dbflute.mysql.dbflute.bsbhv.pmbean.BsMemberNamePmb;

/**
 * <!-- df:beginClassDescription -->
 * The typed parameter-bean of MemberName. <span style="color: #AD4747">(typed to list, entity)</span><br />
 * This is related to "<span style="color: #AD4747">selectMemberName</span>" on MemberBhv, <br />
 * described as "The example for scalar select".
 * <!-- df:endClassDescription -->
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class MemberNamePmb extends BsMemberNamePmb {

    // for the test of alternate boolean method
    protected boolean _existsBirthdate;

    @Override
    public boolean existsBirthdate() {
        return _existsBirthdate; // complex logic in business
    }

    public void requireBirthdate() {
        _existsBirthdate = true;
    }
}
