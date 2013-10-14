package com.example.dbflute.sqlserver.dbflute.whitebox.dfprop;

import com.example.dbflute.sqlserver.dbflute.bsentity.dbmeta.MemberDbm;
import com.example.dbflute.sqlserver.dbflute.exbhv.pmbean.SpNoParameterPmb;
import com.example.dbflute.sqlserver.unit.PlainTestCase;

/**
 * @author jflute
 * @since 0.9.6.8 (2010/04/18 Sunday)
 */
public class WxAddingSchemaPrefixTest extends PlainTestCase {

    public void test_table() {
        assertFalse(MemberDbm.getInstance().getTableSqlName().toString().contains("."));
    }

    public void test_procedure() {
        assertFalse(new SpNoParameterPmb().getProcedureName().contains("."));
    }
}