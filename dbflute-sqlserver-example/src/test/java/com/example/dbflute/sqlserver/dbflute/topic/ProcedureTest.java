package com.example.dbflute.sqlserver.dbflute.topic;

import java.util.List;
import java.util.UUID;

import org.seasar.dbflute.cbean.ListResultBean;

import com.example.dbflute.sqlserver.dbflute.allcommon.CDef;
import com.example.dbflute.sqlserver.dbflute.exbhv.VendorCheckBhv;
import com.example.dbflute.sqlserver.dbflute.exbhv.pmbean.FnInOutParameterPmb;
import com.example.dbflute.sqlserver.dbflute.exbhv.pmbean.FnNoParameterPmb;
import com.example.dbflute.sqlserver.dbflute.exbhv.pmbean.FnReturnTablePmb;
import com.example.dbflute.sqlserver.dbflute.exbhv.pmbean.ProcReturnResultSetMorePmb;
import com.example.dbflute.sqlserver.dbflute.exbhv.pmbean.SimpleTableFunctionPmb;
import com.example.dbflute.sqlserver.dbflute.exbhv.pmbean.SpInOutParameterPmb;
import com.example.dbflute.sqlserver.dbflute.exbhv.pmbean.SpInOutReturnPmb;
import com.example.dbflute.sqlserver.dbflute.exbhv.pmbean.SpNoParameterPmb;
import com.example.dbflute.sqlserver.dbflute.exbhv.pmbean.SpReturnResultSetMorePmb;
import com.example.dbflute.sqlserver.dbflute.exbhv.pmbean.SpReturnResultSetPmb;
import com.example.dbflute.sqlserver.dbflute.exbhv.pmbean.SpReturnResultSetWithPmb;
import com.example.dbflute.sqlserver.dbflute.exbhv.pmbean.SpVariousTypeParameterPmb;
import com.example.dbflute.sqlserver.dbflute.exentity.customize.FnReturnTableReturnResult;
import com.example.dbflute.sqlserver.dbflute.exentity.customize.ProcReturnResultSetMore;
import com.example.dbflute.sqlserver.dbflute.exentity.customize.SimpleTableFunction;
import com.example.dbflute.sqlserver.dbflute.exentity.customize.SpReturnResultSetMoreNotParamResult1;
import com.example.dbflute.sqlserver.dbflute.exentity.customize.SpReturnResultSetMoreNotParamResult2;
import com.example.dbflute.sqlserver.dbflute.exentity.customize.SpReturnResultSetNotParamResult1;
import com.example.dbflute.sqlserver.dbflute.exentity.customize.SpReturnResultSetWithNotParamResult1;
import com.example.dbflute.sqlserver.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.6.1 (2008/01/23 Wednesday)
 */
public class ProcedureTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private VendorCheckBhv vendorCheckBhv;

    // ===================================================================================
    //                                                                               Basic
    //                                                                               =====
    public void test_call_Procedure_NoParameter() {
        // ## Arrange ##
        SpNoParameterPmb pmb = new SpNoParameterPmb();

        // ## Act ##
        vendorCheckBhv.outsideSql().call(pmb); // Expect no exception

        // ## Assert ##
        assertEquals((Integer) 1, pmb.getReturnValue());
    }

    public void test_call_Procedure_InOutParameter() {
        // ## Arrange ##
        SpInOutParameterPmb pmb = new SpInOutParameterPmb();
        pmb.setVInVarchar("foo");
        pmb.setVOutVarchar("bar");
        pmb.setVInoutVarchar("baz");

        // ## Act ##
        vendorCheckBhv.outsideSql().call(pmb);

        // ## Assert ##
        log("in=" + pmb.getVInVarchar() + ", out=" + pmb.getVOutVarchar() + ", inout=" + pmb.getVInoutVarchar());
        assertEquals("baz", pmb.getVOutVarchar());
        assertEquals("foo", pmb.getVInoutVarchar());
    }

    public void test_call_Procedure_InOutReturn() {
        // ## Arrange ##
        SpInOutReturnPmb pmb = new SpInOutReturnPmb();
        pmb.setVInVarchar("foo");
        pmb.setVOutVarchar("bar");
        pmb.setVInoutVarchar("baz");

        // ## Act ##
        vendorCheckBhv.outsideSql().call(pmb);

        // ## Assert ##
        log("in=" + pmb.getVInVarchar() + ", out=" + pmb.getVOutVarchar() + ", inout=" + pmb.getVInoutVarchar());
        assertEquals("qux", pmb.getVOutVarchar());
        assertEquals("quux", pmb.getVInoutVarchar());
        assertEquals((Integer) 1, pmb.getReturnValue());
    }

    public void test_call_Procedure_VariousTypeParameter() {
        // ## Arrange ##
        SpVariousTypeParameterPmb pmb = new SpVariousTypeParameterPmb();
        pmb.setVInVarchar("foo");
        pmb.setVOutNvarchar("bar");
        pmb.setVOutChar("baz");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 500; i++) { // if 1000, overflow
            sb.append("abcdefghij");
        }
        pmb.setVInText(sb.toString());
        assertNull(pmb.getVOutText());
        pmb.setVvInNumericInteger(234);
        pmb.setVvInNumericBigint(345L);
        // *failed - SQLServerException: データ型 nvarchar を decimal に変換中にエラーが発生しました。
        // {? = call SP_VARIOUS_TYPE_PARAMETER;1('aaa', 'bbb', 'ccc', 123, 234, 345, 456.12299999999999045030563138425350189208984375, 567, '2010-06-09 14:23:27.796', 'FD8C7155-3A0A-DB11-BAC4-0011F5099158')}
        //pmb.setVvInNumericDecimal(new BigDecimal(456.123));
        // *failed - SQLServerException: データ型 decimal を numeric に変換中にエラーが発生しました。
        //pmb.setVvInNumericDecimal(new BigDecimal(456));
        // *failed - SQLServerException: numeric をデータ型 numeric に変換中に、算術オーバーフロー エラーが発生しました。
        //assertNull(pmb.getVvOutDecimal());
        pmb.setVvInoutInteger(1234);
        pmb.setVvOutBigint(2345L);
        pmb.setVvvInDatetime(currentTimestamp());
        assertNull(pmb.getVvvOutDatetime());
        pmb.setVvvvInUniqueidentifier(UUID.fromString("FD8C7155-3A0A-DB11-BAC4-0011F5099158"));

        // ## Act ##
        vendorCheckBhv.outsideSql().call(pmb);

        // ## Assert ##
        log(pmb.toString());
        assertEquals("foo", pmb.getVOutNvarchar());
        assertEquals("qux", pmb.getVOutChar());
        assertEquals(pmb.getVInText(), pmb.getVOutText());
        assertEquals(Long.valueOf(1234), pmb.getVvOutBigint());
        //assertEquals(new BigDecimal("987.654"), pmb.getVvOutDecimal());
        assertEquals(Integer.valueOf(6789), pmb.getVvInoutInteger());
        assertEquals(Long.valueOf(1234), pmb.getVvOutBigint());
        assertNotNull(pmb.getVvvOutDatetime());
    }

    // ===================================================================================
    //                                                                 ResultSet Parameter
    //                                                                 ===================
    // *JDBC driver returns "int" type from "cursor varying" type
    // 
    // http://social.msdn.microsoft.com/Forums/en/sqldataaccess/thread/14bd1190-1c42-4fdd-b49e-f39e6f59bce4
    // > Unfortunately, MS SQL Server 2005 JDBC Driver does not support retrieval
    // > of CURSOR parameters as out params from CallableStatement.

    // ===================================================================================
    //                                                                    Return ResultSet
    //                                                                    ================
    public void test_call_Procedure_ReturnResultSet() {
        // ## Arrange ##
        SpReturnResultSetPmb pmb = new SpReturnResultSetPmb();

        // ## Act ##
        vendorCheckBhv.outsideSql().call(pmb);

        // ## Assert ##
        List<SpReturnResultSetNotParamResult1> memberList = pmb.getNotParamResult1();
        assertNotSame(0, memberList.size());
        for (SpReturnResultSetNotParamResult1 member : memberList) {
            log(member);
            assertNotNull(member.getMemberName());
        }
    }

    public void test_call_Procedure_ReturnResultSet_more() {
        // ## Arrange ##
        SpReturnResultSetMorePmb pmb = new SpReturnResultSetMorePmb();
        pmb.setStatusCode(CDef.MemberStatus.Formalized.code());

        // ## Act ##
        vendorCheckBhv.outsideSql().call(pmb);

        // ## Assert ##
        List<SpReturnResultSetMoreNotParamResult1> memberList = pmb.getNotParamResult1();
        List<SpReturnResultSetMoreNotParamResult2> memberStatusList = pmb.getNotParamResult2();
        assertNotSame(0, memberList.size());
        assertNotSame(0, memberStatusList.size());
        {
            StringBuilder sb = new StringBuilder();
            for (SpReturnResultSetMoreNotParamResult1 member : memberList) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                Object value = member.getMemberName();
                assertNotNull(value);
                sb.append(value);
            }
            log(sb);
        }
        {
            StringBuilder sb = new StringBuilder();
            for (SpReturnResultSetMoreNotParamResult2 memberStatus : memberStatusList) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                Object value = memberStatus.getMemberStatusName();
                assertNotNull(value);
                sb.append(value);
            }
            log(sb);
        }
        // SQLServer returns 0 in spite of return not defined
        assertEquals(Integer.valueOf(0), pmb.getReturnValue());
    }

    public void test_call_Procedure_ReturnResultSet_with() {
        // ## Arrange ##
        SpReturnResultSetWithPmb pmb = new SpReturnResultSetWithPmb();
        pmb.setVInChar("FML");

        // ## Act ##
        vendorCheckBhv.outsideSql().call(pmb);

        // ## Assert ##
        List<SpReturnResultSetWithNotParamResult1> memberList = pmb.getNotParamResult1();
        assertNotSame(0, memberList.size());
        StringBuilder sb = new StringBuilder();
        for (SpReturnResultSetWithNotParamResult1 member : memberList) {
            if (sb.length() > 0) {
                sb.append(",");
            }
            String value = member.getMemberName();
            assertNotNull(value);
            assertEquals("FML", member.getMemberStatusCode());
            sb.append(value);
        }
        log(sb);
        assertEquals("qux", pmb.getVOutVarchar());
        assertEquals("quux", pmb.getVInoutVarchar());
        assertEquals(Integer.valueOf(1), pmb.getReturnValue());
    }

    // ===================================================================================
    //                                                                            Function
    //                                                                            ========
    public void test_call_Function_NoParameter() {
        // ## Arrange ##
        FnNoParameterPmb pmb = new FnNoParameterPmb();

        // ## Act ##
        vendorCheckBhv.outsideSql().call(pmb); // expect no exception

        // ## Assert ##
        assertEquals(Integer.valueOf(1), pmb.getReturnValue());
    }

    public void test_call_Function_InOutParameter() {
        // ## Arrange ##
        FnInOutParameterPmb pmb = new FnInOutParameterPmb();
        pmb.setVInVarchar("foo");
        assertNull(pmb.getReturnValue());

        // ## Act ##
        vendorCheckBhv.outsideSql().call(pmb); // expect no exception

        // ## Assert ##
        assertEquals("foo", pmb.getReturnValue());
    }

    public void test_call_Function_ReturnTable() {
        // ## Arrange ##
        FnReturnTablePmb pmb = new FnReturnTablePmb();
        pmb.setStatus("FML");

        // ## Act ##
        vendorCheckBhv.outsideSql().call(pmb);

        // ## Assert ##
        List<FnReturnTableReturnResult> returnResult = pmb.getReturnResult();

        assertNotSame(0, returnResult.size());
        for (FnReturnTableReturnResult result : returnResult) {
            log(result);
            assertTrue(result.isMemberStatusCodeFormalized());
        }
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    public void test_outsideSql_call_ReturnResultSetMore() {
        // ## Arrange ##
        String path = VendorCheckBhv.PATH_various_vendorcheck_callProcReturnResultSetMore;
        ProcReturnResultSetMorePmb pmb = new ProcReturnResultSetMorePmb();
        pmb.setMemberStatusCode_Formalized();
        Class<ProcReturnResultSetMore> entityType = ProcReturnResultSetMore.class;

        // ## Act ##
        ListResultBean<ProcReturnResultSetMore> memberList = vendorCheckBhv.outsideSql().selectList(path, pmb,
                entityType);

        // ## Assert ##
        assertNotSame(0, memberList.size());
        for (ProcReturnResultSetMore member : memberList) {
            log(member);
            assertTrue(member.isMemberStatusCodeFormalized());
        }

        // If you don't use OUT parameter, you can call procedures like this.
        // But you cannot get second result set. (first result set only)
    }

    public void test_outsideSql_select_SimpleTableFunction() {
        // ## Arrange ##
        String path = VendorCheckBhv.PATH_various_vendorcheck_callProcReturnResultSetMore;
        SimpleTableFunctionPmb pmb = new SimpleTableFunctionPmb();
        pmb.setMemberStatusCode_Formalized();
        Class<SimpleTableFunction> entityType = SimpleTableFunction.class;

        // ## Act ##
        ListResultBean<SimpleTableFunction> memberList = vendorCheckBhv.outsideSql().selectList(path, pmb, entityType);

        // ## Assert ##
        assertNotSame(0, memberList.size());
        for (SimpleTableFunction member : memberList) {
            log(member);
            assertTrue(member.isMemberStatusCodeFormalized());
        }
    }
}
