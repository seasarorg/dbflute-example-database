package com.example.dbflute.oracle.dbflute.topic;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.seasar.dbflute.exception.SQLFailureException;
import org.seasar.dbflute.util.DfCollectionUtil;
import org.seasar.dbflute.util.DfTypeUtil;

import com.example.dbflute.oracle.dbflute.allcommon.CDef;
import com.example.dbflute.oracle.dbflute.exbhv.VendorCheckBhv;
import com.example.dbflute.oracle.dbflute.exbhv.pmbean.FnInOutParameterPmb;
import com.example.dbflute.oracle.dbflute.exbhv.pmbean.FnNextSynonymSameNamePmb;
import com.example.dbflute.oracle.dbflute.exbhv.pmbean.FnNoParameterPmb;
import com.example.dbflute.oracle.dbflute.exbhv.pmbean.MainPkgSpPkgInOutParameterPmb;
import com.example.dbflute.oracle.dbflute.exbhv.pmbean.MainPkgSpPkgNoParameterPmb;
import com.example.dbflute.oracle.dbflute.exbhv.pmbean.NextPkgSpPkgInOutParameterNextLinkPmb;
import com.example.dbflute.oracle.dbflute.exbhv.pmbean.NextPkgSpPkgNoParameterNextLinkPmb;
import com.example.dbflute.oracle.dbflute.exbhv.pmbean.NextPkgSpPkgNoParameterPmb;
import com.example.dbflute.oracle.dbflute.exbhv.pmbean.NextSynonymNoParameterPmb;
import com.example.dbflute.oracle.dbflute.exbhv.pmbean.SpInOutParameterPmb;
import com.example.dbflute.oracle.dbflute.exbhv.pmbean.SpNextNoParameterPmb;
import com.example.dbflute.oracle.dbflute.exbhv.pmbean.SpNextStructParameterPmb;
import com.example.dbflute.oracle.dbflute.exbhv.pmbean.SpNoParameterPmb;
import com.example.dbflute.oracle.dbflute.exbhv.pmbean.SpNullOutParameterPmb;
import com.example.dbflute.oracle.dbflute.exbhv.pmbean.SpOracleCharInoutParameterPmb;
import com.example.dbflute.oracle.dbflute.exbhv.pmbean.SpResultSetParameterMorePmb;
import com.example.dbflute.oracle.dbflute.exbhv.pmbean.SpResultSetParameterPmb;
import com.example.dbflute.oracle.dbflute.exbhv.pmbean.SpResultSetParameterWithPmb;
import com.example.dbflute.oracle.dbflute.exbhv.pmbean.SpStructBasicParameterPmb;
import com.example.dbflute.oracle.dbflute.exbhv.pmbean.SpStructListParameterPmb;
import com.example.dbflute.oracle.dbflute.exbhv.pmbean.SpStructNestedParameterPmb;
import com.example.dbflute.oracle.dbflute.exbhv.pmbean.SpStructNextParameterPmb;
import com.example.dbflute.oracle.dbflute.exbhv.pmbean.SpTableManualParameterPmb;
import com.example.dbflute.oracle.dbflute.exbhv.pmbean.SpTablePackedParameterPmb;
import com.example.dbflute.oracle.dbflute.exbhv.pmbean.SpVariousTypeParameterPmb;
import com.example.dbflute.oracle.dbflute.exbhv.pmbean.SpVarrayManualParameterPmb;
import com.example.dbflute.oracle.dbflute.exbhv.pmbean.SynonymNextFunctionPmb;
import com.example.dbflute.oracle.dbflute.exbhv.pmbean.SynonymNextLinkProcedurePmb;
import com.example.dbflute.oracle.dbflute.exbhv.pmbean.SynonymNextLinkProcsynPmb;
import com.example.dbflute.oracle.dbflute.exbhv.pmbean.SynonymNextProcedurePmb;
import com.example.dbflute.oracle.dbflute.exbhv.pmbean.SynonymProcedureInOutPmb;
import com.example.dbflute.oracle.dbflute.exentity.customize.BarBean;
import com.example.dbflute.oracle.dbflute.exentity.customize.CorgeBean;
import com.example.dbflute.oracle.dbflute.exentity.customize.FooBean;
import com.example.dbflute.oracle.dbflute.exentity.customize.NestedBarBean;
import com.example.dbflute.oracle.dbflute.exentity.customize.NestedBazBean;
import com.example.dbflute.oracle.dbflute.exentity.customize.NestedFooBean;
import com.example.dbflute.oracle.dbflute.exentity.customize.NextFooBean;
import com.example.dbflute.oracle.dbflute.exentity.customize.SpResultSetParameterCurMember;
import com.example.dbflute.oracle.dbflute.exentity.customize.SpResultSetParameterMoreCurMember;
import com.example.dbflute.oracle.dbflute.exentity.customize.SpResultSetParameterMoreCurMemberStatus;
import com.example.dbflute.oracle.dbflute.exentity.customize.SpResultSetParameterWithCurMember;
import com.example.dbflute.oracle.dbflute.exentity.customize.SpResultSetParameterWithCurMemberStatus;
import com.example.dbflute.oracle.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.6.1 (2008/01/23 Wednesday)
 */
public class ProcedureCallTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private VendorCheckBhv vendorCheckBhv;

    // ===================================================================================
    //                                                                               Basic
    //                                                                               =====
    public void test_call_Procedure_NoParameter_Tx() {
        // ## Arrange ##
        SpNoParameterPmb pmb = new SpNoParameterPmb();

        // ## Act & Assert ##
        vendorCheckBhv.outsideSql().call(pmb); // expect no exception
    }

    public void test_call_Procedure_InOutParameter_Tx() {
        // ## Arrange ##
        SpInOutParameterPmb pmb = new SpInOutParameterPmb();
        pmb.setVInVarchar("foo");
        pmb.setVOutVarchar("bar"); // no point but for test overridden later
        pmb.setVInoutVarchar("baz");

        // ## Act ##
        vendorCheckBhv.outsideSql().call(pmb);

        // ## Assert ##
        log("in=" + pmb.getVInVarchar() + ", out=" + pmb.getVOutVarchar() + ", inout=" + pmb.getVInoutVarchar());
        assertEquals("baz", pmb.getVOutVarchar());
        assertEquals("foo", pmb.getVInoutVarchar());
    }

    public void test_call_Procedure_NullOutParameter_Tx() {
        // ## Arrange ##
        SpNullOutParameterPmb pmb = new SpNullOutParameterPmb();
        pmb.setVOutVarchar("dummy");
        pmb.setVOutInteger(new BigDecimal(999));
        pmb.setVOutNumber(new BigDecimal(999));
        pmb.setVOutDate(currentDate());

        // ## Act ##
        vendorCheckBhv.outsideSql().call(pmb);

        // ## Assert ##
        log("varchar=" + pmb.getVOutVarchar() + ", integer=" + pmb.getVOutInteger() + ", number=" + pmb.getVOutNumber()
                + ", date=" + pmb.getVOutDate());
        assertNull(pmb.getVOutVarchar());
        assertNull(pmb.getVOutInteger());
        assertNull(pmb.getVOutNumber());
        assertNull(pmb.getVOutDate());
    }

    public void test_call_Procedure_VariousTypeParameter_Tx() {
        // ## Arrange ##
        SpVariousTypeParameterPmb pmb = new SpVariousTypeParameterPmb();
        pmb.setVInVarchar("foo");
        pmb.setVOutNvarchar("bar");
        pmb.setVOutChar("baz");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            sb.append("abcdefghij");
        }
        pmb.setVInClob(sb.toString());
        assertNull(pmb.getVOutClob());
        pmb.setVvInNumberInteger(new BigDecimal(234));
        pmb.setVvInNumberBigint(new BigDecimal(345));
        pmb.setVvInNumberDecimal(new BigDecimal(456.123));
        pmb.setVvInoutInteger(new BigDecimal(1234));
        pmb.setVvOutBigint(new BigDecimal(2345));
        assertNull(pmb.getVvOutDecimal());
        pmb.setVvvInDate(currentDate());
        assertNull(pmb.getVvvOutTimestamp());

        // ## Act ##
        vendorCheckBhv.outsideSql().call(pmb);

        // ## Assert ##
        log(pmb.toString());
        assertEquals("foo", pmb.getVOutNvarchar());
        assertEquals("qux", pmb.getVOutChar().trim()); // needs to trim
        assertEquals(pmb.getVInClob(), pmb.getVOutClob());
        assertEquals(new BigDecimal("987.654"), pmb.getVvOutDecimal());
        assertEquals(new BigDecimal(789), pmb.getVvInoutInteger());
        assertEquals(new BigDecimal(1234), pmb.getVvOutBigint());
        log(pmb.toString());
        assertNotNull(pmb.getVvvOutTimestamp());
    }

    // ===================================================================================
    //                                                                 ResultSet Parameter
    //                                                                 ===================
    /**
     * @since 0.7.8
     */
    public void test_call_Procedure_ResultSetParameter_Tx() {
        // ## Arrange ##
        SpResultSetParameterPmb pmb = new SpResultSetParameterPmb();

        // ## Act ##
        vendorCheckBhv.outsideSql().call(pmb);

        // ## Assert ##
        List<SpResultSetParameterCurMember> memberList = pmb.getCurMember();
        assertTrue(memberList.size() > 0);
        boolean existsBirthdate = false;
        boolean existsFormalizedDatetime = false;
        for (SpResultSetParameterCurMember member : memberList) {
            log(member);
            Long memberId = member.getMemberId();
            String memberName = member.getMemberName();
            Date birthdate = member.getBirthdate();
            if (birthdate != null) {
                existsBirthdate = true;
            }
            Timestamp formalizedDatetime = member.getFormalizedDatetime();
            if (formalizedDatetime != null) {
                existsFormalizedDatetime = true;
            }
            String memberStatusCode = member.getMemberStatusCode();
            assertNotNull(memberId);
            assertNotNull(memberName);
            assertNotNull(memberStatusCode);
        }
        assertTrue(existsBirthdate);
        assertTrue(existsFormalizedDatetime);
    }

    public void test_call_Procedure_ResultSetParameter_more_Tx() {
        // ## Arrange ##
        SpResultSetParameterMorePmb pmb = new SpResultSetParameterMorePmb();

        // ## Act ##
        vendorCheckBhv.outsideSql().call(pmb);

        // ## Assert ##
        List<SpResultSetParameterMoreCurMember> memberList = pmb.getCurMember();
        assertTrue(memberList.size() > 0);
        for (SpResultSetParameterMoreCurMember member : memberList) {
            Long memberId = member.getMemberId();
            String memberName = member.getMemberName();
            Date birthdate = member.getBirthdate();
            Timestamp formalizedDatetime = member.getFormalizedDatetime();
            log(memberId + ", " + memberName + ", " + birthdate + ", " + formalizedDatetime);
            assertNotNull(memberId);
            assertNotNull(memberName);
        }
        List<SpResultSetParameterMoreCurMemberStatus> statusList = pmb.getCurMemberStatus();
        assertTrue(statusList.size() > 0);
        for (SpResultSetParameterMoreCurMemberStatus status : statusList) {
            log(status);
            assertNotNull(status.getMemberStatusCode());
            assertNotNull(status.getMemberStatusName());
        }
    }

    public void test_call_Procedure_ResultSetParameter_with_Tx() {
        // ## Arrange ##
        SpResultSetParameterWithPmb pmb = new SpResultSetParameterWithPmb();
        pmb.setVInChar(CDef.MemberStatus.Formalized.code());
        pmb.setVOutVarchar("bar"); // no point but for test overridden later
        pmb.setVInoutVarchar("baz");

        // ## Act ##
        vendorCheckBhv.outsideSql().call(pmb);

        // ## Assert ##
        List<SpResultSetParameterWithCurMember> memberList = pmb.getCurMember();
        assertTrue(memberList.size() > 0);
        for (SpResultSetParameterWithCurMember member : memberList) {
            Long memberId = member.getMemberId();
            String memberName = member.getMemberName();
            Date birthdate = member.getBirthdate();
            Timestamp formalizedDatetime = member.getFormalizedDatetime();
            log(memberId + ", " + memberName + ", " + birthdate + ", " + formalizedDatetime);
            assertNotNull(memberId);
            assertNotNull(memberName);
        }
        List<SpResultSetParameterWithCurMemberStatus> statusList = pmb.getCurMemberStatus();
        assertTrue(statusList.size() > 0);
        for (SpResultSetParameterWithCurMemberStatus status : statusList) {
            log(status);
            assertNotNull(status.getMemberStatusCode());
            assertNotNull(status.getMemberStatusName());
        }
        // It causes an error when creating the procedure
        // if it overrides out-parameter in the procedure. 
        //assertEquals("qux", pmb.getVOutVarchar());
        //assertEquals("quux", pmb.getVInoutVarchar());
        assertNull(pmb.getVOutVarchar()); // no handled out-parameter
        assertEquals("baz", pmb.getVInoutVarchar());
    }

    // ===================================================================================
    //                                                                   Package Procedure
    //                                                                   =================
    public void test_call_Procedure_PkgNoParameter_Tx() {
        // ## Arrange ##
        MainPkgSpPkgNoParameterPmb pmb = new MainPkgSpPkgNoParameterPmb();

        // ## Act & Assert ##
        vendorCheckBhv.outsideSql().call(pmb); // Expect no exception
    }

    public void test_call_Procedure_PkgInOutParameter_Tx() {
        // ## Arrange ##
        MainPkgSpPkgInOutParameterPmb pmb = new MainPkgSpPkgInOutParameterPmb();
        pmb.setVInVarchar("foo");
        pmb.setVOutVarchar("bar");
        pmb.setVInoutVarchar("baz");

        // ## Act ##
        vendorCheckBhv.outsideSql().call(pmb);

        // ## Assert ##
        log("in=" + pmb.getVInVarchar() + ", out=" + pmb.getVOutVarchar() + ", inout=" + pmb.getVInoutVarchar());
        assertEquals("qux", pmb.getVOutVarchar());
        assertEquals("quux", pmb.getVInoutVarchar());
    }

    public void test_call_Procedure_NextNoParameter_Tx() {
        // ## Arrange ##
        SpNextNoParameterPmb pmb = new SpNextNoParameterPmb();

        // ## Act & Assert ##
        vendorCheckBhv.outsideSql().call(pmb); // Expect no exception
    }

    public void test_call_Procedure_NextPkgNoParameter_Tx() {
        // ## Arrange ##
        NextPkgSpPkgNoParameterPmb pmb = new NextPkgSpPkgNoParameterPmb();

        // ## Act & Assert ##
        vendorCheckBhv.outsideSql().call(pmb); // Expect no exception
    }

    // ===================================================================================
    //                                                                   Procedure Synonym
    //                                                                   =================
    public void test_call_ProcedureSynonym_MainSynonym_Tx() {
        // ## Arrange ##
        SynonymNextProcedurePmb pmb = new SynonymNextProcedurePmb();

        // ## Act & Assert ##
        vendorCheckBhv.outsideSql().call(pmb); // Expect no exception
    }

    public void test_call_ProcedureSynonym_NextSynonym_no_param_Tx() {
        // ## Arrange ##
        NextSynonymNoParameterPmb pmb = new NextSynonymNoParameterPmb();

        // ## Act & Assert ##
        vendorCheckBhv.outsideSql().call(pmb); // Expect no exception
    }

    public void test_call_ProcedureSynonym_InOutParameter_Tx() {
        // ## Arrange ##
        SynonymProcedureInOutPmb pmb = new SynonymProcedureInOutPmb();
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

    public void test_call_ProcedureSynonym_DBLink_Procedure_InOutParameter_Tx() {
        // ## Arrange ##
        SynonymNextLinkProcedurePmb pmb = new SynonymNextLinkProcedurePmb();
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

    public void test_call_ProcedureSynonym_DBLink_SynonymProcedure_InOutParameter_Tx() {
        // ## Arrange ##
        SynonymNextLinkProcsynPmb pmb = new SynonymNextLinkProcsynPmb();
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

    // ===================================================================================
    //                                                        Included Procedure to DBLink
    //                                                        ============================
    public void test_call_IncludedProcedureToDBLink_NoParameter_Tx() {
        // ## Arrange ##
        NextPkgSpPkgNoParameterNextLinkPmb pmb = new NextPkgSpPkgNoParameterNextLinkPmb();

        // ## Act & Assert ##
        vendorCheckBhv.outsideSql().call(pmb); // expect no exception
    }

    public void test_call_IncludedProcedureToDBLink_InOutParameter_Tx() {
        // ## Arrange ##
        NextPkgSpPkgInOutParameterNextLinkPmb pmb = new NextPkgSpPkgInOutParameterNextLinkPmb();
        pmb.setVInVarchar("foo");
        pmb.setVOutVarchar("bar");
        pmb.setVInoutVarchar("baz");

        // ## Act ##
        vendorCheckBhv.outsideSql().call(pmb);

        // ## Assert ##
        log("in=" + pmb.getVInVarchar() + ", out=" + pmb.getVOutVarchar() + ", inout=" + pmb.getVInoutVarchar());
        assertEquals("qux", pmb.getVOutVarchar());
        assertEquals("quux", pmb.getVInoutVarchar());
    }

    // ===================================================================================
    //                                                                          ARRAY Type
    //                                                                          ==========
    public void test_call_Procedure_TableManualParameter_basic_Tx() {
        // ## Arrange ##
        SpTableManualParameterPmb pmb = new SpTableManualParameterPmb();
        pmb.setVInVarcharArray(DfCollectionUtil.newArrayList("foo", "bar"));

        // ## Act ##
        vendorCheckBhv.outsideSql().call(pmb);

        // ## Assert ##
        assertEquals(pmb.getVInVarcharArray(), pmb.getVOutVarcharArray());
    }

    public void test_call_Procedure_TableManualParameter_emptyList_Tx() {
        // ## Arrange ##
        SpTableManualParameterPmb pmb = new SpTableManualParameterPmb();

        // ## Act ##
        vendorCheckBhv.outsideSql().call(pmb);

        // ## Assert ##
        assertNotNull(pmb.getVOutVarcharArray());
        assertEquals(0, pmb.getVOutVarcharArray().size());
    }

    public void test_call_Procedure_TablePackedParameter_Tx() {
        // ## Arrange ##
        SpTablePackedParameterPmb pmb = new SpTablePackedParameterPmb();
        Date firstDate = DfTypeUtil.toDate("2010-11-18");
        Date secondDate = DfTypeUtil.toDate("2010-11-19");
        List<Date> dateList = DfCollectionUtil.newArrayList(firstDate, secondDate);
        pmb.setVInDateArray(dateList);

        // ## Act ##
        try {
            vendorCheckBhv.outsideSql().call(pmb);
            fail();
        } catch (SQLFailureException e) {
            // Why?
            log(e.getMessage());
        }

        // ## Assert ##
        //assertEquals(pmb.getVInDateArray(), pmb.getVOutDateArray());
    }

    public void test_call_Procedure_VArrayManualParameter_Tx() {
        // ## Arrange ##
        SpVarrayManualParameterPmb pmb = new SpVarrayManualParameterPmb();
        pmb.setVInNumberArray(DfCollectionUtil.newArrayList(new BigDecimal(1), new BigDecimal(2)));

        // ## Act ##
        vendorCheckBhv.outsideSql().call(pmb);

        // ## Assert ##
        assertEquals(pmb.getVInNumberArray(), pmb.getVOutNumberArray());
    }

    // ===================================================================================
    //                                                                         STRUCT Type
    //                                                                         ===========
    public void test_call_Procedure_StructBasicParameter_basic_Tx() {
        // ## Arrange ##
        SpStructBasicParameterPmb pmb = new SpStructBasicParameterPmb();
        FooBean fooBean = new FooBean();
        fooBean.setFooId(1);
        fooBean.setFooName("foo");
        fooBean.setFooDecimal(new BigDecimal("3.4"));
        fooBean.setFooDate(DfTypeUtil.toDate("2010-11-20 12:34:56"));
        fooBean.setFooTimestamp(DfTypeUtil.toTimestamp("2010-11-21 02:13:45.852"));
        // CLOB is unsupported
        //fooBean.setFooClob("fooooo");
        pmb.setVInFooBean(fooBean);
        assertNull(pmb.getVOutFooBean());

        // ## Act ##
        vendorCheckBhv.outsideSql().call(pmb);

        // ## Assert ##
        assertEquals(fooBean.toString(), pmb.getVInFooBean().toString());
        FooBean outBean = pmb.getVOutFooBean();
        assertEquals(fooBean.getFooId(), outBean.getFooId());
        assertEquals(fooBean.getFooName(), outBean.getFooName());
        assertEquals(fooBean.getFooDecimal(), outBean.getFooDecimal());
        assertEquals(fooBean.getFooDate(), outBean.getFooDate());
        assertEquals(fooBean.getFooTimestamp(), outBean.getFooTimestamp());
        assertEquals(fooBean.getFooClob(), outBean.getFooClob());
    }

    public void test_call_Procedure_StructBasicParameter_nullValue_Tx() {
        // ## Arrange ##
        SpStructBasicParameterPmb pmb = new SpStructBasicParameterPmb();
        FooBean fooBean = new FooBean();
        fooBean.setFooName("foo");
        fooBean.setFooDate(DfTypeUtil.toDate("2010-11-20 12:34:56"));
        pmb.setVInFooBean(fooBean);
        assertNull(pmb.getVOutFooBean());

        // ## Act ##
        vendorCheckBhv.outsideSql().call(pmb);

        // ## Assert ##
        assertEquals(fooBean.toString(), pmb.getVInFooBean().toString());
        FooBean outBean = pmb.getVOutFooBean();
        assertNull(outBean.getFooId());
        assertEquals(fooBean.getFooName(), outBean.getFooName());
        assertNull(outBean.getFooDecimal());
        assertEquals(fooBean.getFooDate(), outBean.getFooDate());
        assertNull(outBean.getFooTimestamp());
        assertNull(outBean.getFooClob());
    }

    public void test_call_Procedure_StructListParameter_Tx() {
        // ## Arrange ##
        SpStructListParameterPmb pmb = new SpStructListParameterPmb();
        List<FooBean> vInFooList = new ArrayList<FooBean>();
        {
            FooBean fooBean = new FooBean();
            fooBean.setFooId(1);
            fooBean.setFooName("foo");
            fooBean.setFooDate(DfTypeUtil.toDate("2010-11-20 12:34:56"));
            vInFooList.add(fooBean);
        }
        {
            FooBean fooBean = new FooBean();
            fooBean.setFooId(2);
            fooBean.setFooName("bar");
            fooBean.setFooDate(DfTypeUtil.toDate("2010-11-21 04:53:13"));
            vInFooList.add(fooBean);
        }
        pmb.setVInFooList(vInFooList);
        assertNull(pmb.getVOutFooList());

        // ## Act ##
        vendorCheckBhv.outsideSql().call(pmb);

        // ## Assert ##
        assertEquals(pmb.getVInFooList(), pmb.getVOutFooList());
    }

    public void test_call_Procedure_StructNestedParameter_basic_Tx() throws SQLException {
        // = = = = = = = = = = = = = = = = = = = = = =
        // NESTED_FOO_BEAN (STRUCT)
        //  |-FOO_ID
        //  |-FOO_NAME
        //  |-FOO_DATE
        //  |-BAR_BEAN : NESTED_BAR_BEAN
        //  |  |-BAR_ID
        //  |  |-BAR_NAME
        //  |  |-BAR_DATE
        //  |  |-BAR_LIST : BAR_TABLE<BAR_BEAN>
        //  |  |-BAZ_BEAN1 : NESTED_BAZ_BEAN
        //  |  |  |-BAZ_ID
        //  |  |  |-BAZ_NAME
        //  |  |  |-BAZ_DATE
        //  |  |  |-BAZ_LIST : BAZ_TABLE<BAR_TABLE<BAR_BEAN>>
        //  |  |-BAZ_BEAN2 : NESTED_BAZ_BEAN
        //  |  |-QUX_LIST : QUX_TABLE<NUMBER(12)>
        //  |  |-QUUX_LIST : QUUX_TABLE<NUMBER(12)>
        //  |-QUX_LIST : QUX_TABLE<NUMBER(12)>
        //  |-QUUX_LIST : QUUX_TABLE<NUMBER(12)>
        //  |-CORGE_LIST : CORGE_TABLE<CORGE_BEAN>
        // = = = = = = = = = =/
        // ## Arrange ##
        SpStructNestedParameterPmb pmb = new SpStructNestedParameterPmb();
        {
            // struct in struct as IN parameter
            NestedFooBean fooBean = new NestedFooBean();
            fooBean.setFooId(1);
            fooBean.setFooName("foo");
            fooBean.setFooDate(DfTypeUtil.toDate("2010-11-20 12:34:56"));
            {
                // struct in struct
                NestedBarBean barBean = new NestedBarBean();
                barBean.setBarId(2);
                barBean.setBarName("bar");
                barBean.setBarDate(DfTypeUtil.toDate("2010-11-21 09:51:23"));

                // array<struct> in struct in struct
                List<BarBean> barList = DfCollectionUtil.newArrayList();
                {
                    BarBean elementBean = new BarBean();
                    elementBean.setBarId(71);
                    elementBean.setBarName("bar1");
                    barList.add(elementBean);
                }
                {
                    BarBean elementBean = new BarBean();
                    elementBean.setBarId(72);
                    elementBean.setBarName("bar2");
                    barList.add(elementBean);
                }
                barBean.setBarList(barList);

                // struct in struct in struct
                NestedBazBean bazBean1 = new NestedBazBean();
                bazBean1.setBazId(4321);
                bazBean1.setBazName("baz1");
                bazBean1.setBazDate(DfTypeUtil.toDate("2010-11-22 19:21:33"));
                // array<array> *unsupported
                //List<List<BarBean>> bazList = DfCollectionUtil.newArrayList();
                //bazList.add(barList);
                //bazBean1.setBazList(bazList);
                barBean.setBazBean1(bazBean1);

                // struct in struct in struct (no value)
                //barBean.setBazBean1(bazBean1);

                // array in struct in struct
                List<BigDecimal> quxList = DfCollectionUtil.newArrayList();
                quxList.add(new BigDecimal(1));
                quxList.add(new BigDecimal(2));
                barBean.setQuxList(quxList);

                // array in struct in struct (no value)
                //barBean(quuxList);

                fooBean.setBarBean(barBean);
            }

            // array in struct as IN parameter
            List<BigDecimal> quxList = DfCollectionUtil.newArrayList();
            quxList.add(new BigDecimal(3));
            quxList.add(new BigDecimal(4));
            quxList.add(new BigDecimal(5));
            fooBean.setQuxList(quxList);

            // array in struct as IN parameter (no value)
            //fooBean.setQuuxList(quuxList);

            // array<struct> in struct as IN parameter
            List<CorgeBean> corgeList = DfCollectionUtil.newArrayList();
            CorgeBean corgeBean = new CorgeBean();
            corgeBean.setCorgeId(123);
            corgeBean.setCorgeName("corge");
            corgeList.add(corgeBean);
            fooBean.setCorgeList(corgeList);

            pmb.setVInFooBean(fooBean);
        }
        assertNull(pmb.getVOutFooBean());

        // ## Act ##
        vendorCheckBhv.outsideSql().call(pmb);

        // ## Assert ##
        NestedFooBean inBean = pmb.getVInFooBean();
        NestedFooBean outBean = pmb.getVOutFooBean();
        assertEquals(inBean.getFooId(), outBean.getFooId());
        assertEquals(inBean.getFooName(), outBean.getFooName());
        assertEquals(inBean.getFooDate(), outBean.getFooDate());

        {
            // struct in struct as OUT parameter
            NestedBarBean barBean = outBean.getBarBean();
            log("fooBean.barBean = " + barBean);
            assertEquals(inBean.getBarBean().getBarId(), barBean.getBarId());
            assertEquals(inBean.getBarBean().getBarName(), barBean.getBarName());
            assertEquals(inBean.getBarBean().getBarDate(), barBean.getBarDate());
            {
                // array<struct> in struct in struct
                List<BarBean> barList = barBean.getBarList();
                log("fooBean.barBean.barList = " + barList);
                assertEquals(2, barList.size());
                log("fooBean.barBean.barList(0)=" + barList.get(0));
                log("fooBean.barBean.barList(1)=" + barList.get(1));
                assertEquals("71", barList.get(0).getBarId().toString());
                assertEquals("bar1", barList.get(0).getBarName());
                assertEquals("72", barList.get(1).getBarId().toString());
                assertEquals("bar2", barList.get(1).getBarName());
            }
            {
                // struct in struct in struct
                NestedBazBean bazBean1 = barBean.getBazBean1();
                log("fooBean.barBean.bazBean1 = " + bazBean1);
                assertNotNull(bazBean1);
                NestedBazBean inBazBean1 = inBean.getBarBean().getBazBean1();
                assertEquals(inBazBean1.getBazId(), bazBean1.getBazId());
                assertEquals(inBazBean1.getBazName(), bazBean1.getBazName());
                assertEquals(inBazBean1.getBazDate(), bazBean1.getBazDate());
            }
            {
                // struct in struct in struct (no value)
                NestedBazBean bazBean2 = barBean.getBazBean2();
                log("fooBean.barBean.bazBean2 = " + bazBean2);
                assertNull(bazBean2);
            }
            {
                // array in struct in struct
                List<BigDecimal> quxList = barBean.getQuxList();
                log("fooBean.barBean.quxList = " + quxList);
                assertFalse(quxList.isEmpty());
                assertEquals(inBean.getBarBean().getQuxList().size(), quxList.size());
            }
            {
                // array in struct in struct (no value)
                List<BigDecimal> quuxList = barBean.getQuuxList();
                log("fooBean.barBean.quuxList = " + quuxList);
                assertTrue(quuxList.isEmpty());
            }

            // array in struct as OUT parameter
            List<BigDecimal> quxList = outBean.getQuxList();
            log("fooBean.quxList = " + quxList);
            assertFalse(quxList.isEmpty());
            assertEquals(inBean.getQuxList().size(), quxList.size());

            // array in struct as OUT parameter (no value)
            List<BigDecimal> quuxList = outBean.getQuuxList();
            log("fooBean.quuxList = " + quuxList);
            assertTrue(quuxList.isEmpty());

            // array<struct> in struct as OUT parameter
            List<CorgeBean> corgeList = outBean.getCorgeList();
            log("fooBean.corgeList = " + corgeList);
            assertFalse(corgeList.isEmpty());
            assertEquals(1, corgeList.size());
            assertEquals("123", corgeList.get(0).getCorgeId().toString());
            assertEquals("corge", corgeList.get(0).getCorgeName());
            assertNull(corgeList.get(0).getCorgeDate());
        }
    }

    public void test_call_Procedure_StructNestedParameter_unsupported_arrayInArray_Tx() throws SQLException {
        // ## Arrange ##
        SpStructNestedParameterPmb pmb = new SpStructNestedParameterPmb();
        {
            // struct in struct as IN parameter
            NestedFooBean fooBean = new NestedFooBean();
            {
                // if column order and types are same, it works
                NestedBarBean barBean = new NestedBarBean();
                List<BarBean> barList = DfCollectionUtil.newArrayList();
                {
                    BarBean elementBean = new BarBean();
                    elementBean.setBarId(71);
                    elementBean.setBarName("bar1");
                    barList.add(elementBean);
                }
                NestedBazBean bazBean1 = new NestedBazBean();
                bazBean1.setBazDate(DfTypeUtil.toDate("2010-11-22 19:21:33"));

                // array in array *unsupported
                List<List<BarBean>> bazList = DfCollectionUtil.newArrayList();
                bazList.add(barList);
                bazBean1.setBazList(bazList);

                barBean.setBazBean1(bazBean1);
                fooBean.setBarBean(barBean);
            }
            pmb.setVInFooBean(fooBean);
        }

        // ## Act ##
        try {
            vendorCheckBhv.outsideSql().call(pmb);

            // ## Assert ##
            fail();
        } catch (UnsupportedOperationException e) {
            // OK
            log(e.getMessage());
        }
    }

    public void test_call_Procedure_StructNextParameter_basic_Tx() {
        // ## Arrange ##
        SpStructNextParameterPmb pmb = new SpStructNextParameterPmb();
        NextFooBean fooBean = new NextFooBean();
        fooBean.setFooId(1);
        fooBean.setFooName("foo");
        fooBean.setFooDecimal(new BigDecimal("3.4"));
        fooBean.setFooDate(DfTypeUtil.toDate("2010-11-20 12:34:56"));
        fooBean.setFooTimestamp(DfTypeUtil.toTimestamp("2010-11-21 02:13:45.852"));
        // CLOB is unsupported
        //fooBean.setFooClob("fooooo");
        pmb.setVInFooBean(fooBean);
        assertNull(pmb.getVOutFooBean());

        // ## Act ##
        vendorCheckBhv.outsideSql().call(pmb);

        // ## Assert ##
        assertEquals(fooBean.toString(), pmb.getVInFooBean().toString());
        NextFooBean outBean = pmb.getVOutFooBean();
        assertEquals(fooBean.getFooId(), outBean.getFooId());
        assertEquals(fooBean.getFooName(), outBean.getFooName());
        assertEquals(fooBean.getFooDecimal(), outBean.getFooDecimal());
        assertEquals(fooBean.getFooDate(), outBean.getFooDate());
        assertEquals(fooBean.getFooTimestamp(), outBean.getFooTimestamp());
        assertEquals(fooBean.getFooClob(), outBean.getFooClob());
    }

    public void test_call_Procedure_NextStructParameter_basic_Tx() {
        // ## Arrange ##
        SpNextStructParameterPmb pmb = new SpNextStructParameterPmb();
        NextFooBean fooBean = new NextFooBean();
        fooBean.setFooId(1);
        fooBean.setFooName("foo");
        fooBean.setFooDecimal(new BigDecimal("3.4"));
        fooBean.setFooDate(DfTypeUtil.toDate("2010-11-20 12:34:56"));
        fooBean.setFooTimestamp(DfTypeUtil.toTimestamp("2010-11-21 02:13:45.852"));
        // CLOB is unsupported
        //fooBean.setFooClob("fooooo");
        pmb.setVInFooBean(fooBean);
        assertNull(pmb.getVOutFooBean());

        // ## Act ##
        vendorCheckBhv.outsideSql().call(pmb);

        // ## Assert ##
        assertEquals(fooBean.toString(), pmb.getVInFooBean().toString());
        NextFooBean outBean = pmb.getVOutFooBean();
        assertEquals(fooBean.getFooId(), outBean.getFooId());
        assertEquals(fooBean.getFooName(), outBean.getFooName());
        assertEquals(fooBean.getFooDecimal(), outBean.getFooDecimal());
        assertEquals(fooBean.getFooDate(), outBean.getFooDate());
        assertEquals(fooBean.getFooTimestamp(), outBean.getFooTimestamp());
        assertEquals(fooBean.getFooClob(), outBean.getFooClob());
    }

    // ===================================================================================
    //                                                                      Irregular Case
    //                                                                      ==============
    public void test_call_Procedure_OracleCharInOutParameter_escapeAsDefault_Tx() {
        // ## Arrange ##
        SpOracleCharInoutParameterPmb pmb = new SpOracleCharInoutParameterPmb();
        pmb.setVInoutChar("foo");

        // ## Act ##
        try {
            vendorCheckBhv.outsideSql().call(pmb);

            // ## Assert ##
            fail();
        } catch (SQLFailureException e) {
            // OK
            log(e.getMessage());
        }
    }

    public void test_call_Procedure_OracleCharInOutParameter_suppressEscape_Tx() {
        /*
         The Oracle procedure, which has 'char' type parameter
         and executes SQL in its statement, causes a strange error.
         {ORA-01460, SQLState=72000, ErrorCode=1460}
         on Oracle 10g XE connected by ojdbc5.jar.
         If you don't use JDBC escape, you can execute this.
         So override ProcedurePmb's isEscapeStatement() if you need.
        */
        // ## Arrange ##
        SpOracleCharInoutParameterPmb pmb = new SpOracleCharInoutParameterPmb() {
            @Override
            public boolean isEscapeStatement() {
                return false;
            }
        };
        pmb.setVInoutChar("foo");

        // ## Act ##
        vendorCheckBhv.outsideSql().call(pmb);

        // ## Assert ##
        assertEquals("FML", pmb.getVInoutChar().trim()); // need to be trimmed because of no-size char
    }

    // ===================================================================================
    //                                                                            Function
    //                                                                            ========
    public void test_call_Function_NoParameter_Tx() {
        // ## Arrange ##
        FnNoParameterPmb pmb = new FnNoParameterPmb();

        // ## Act ##
        vendorCheckBhv.outsideSql().call(pmb);

        // ## Assert ##
        assertEquals("FN_NO_PARAMETER", pmb.getArg1());
    }

    public void test_call_Function_InOutParameter_Tx() {
        // ## Arrange ##
        FnInOutParameterPmb pmb = new FnInOutParameterPmb();
        pmb.setVInVarchar("foo");
        pmb.setVOutVarchar("bar");
        pmb.setVInoutVarchar("baz");

        // ## Act ##
        vendorCheckBhv.outsideSql().call(pmb);

        // ## Assert ##
        assertEquals("FN_IN_OUT_PARAMETER", pmb.getArg1());
        log("in=" + pmb.getVInVarchar() + ", out=" + pmb.getVOutVarchar() + ", inout=" + pmb.getVInoutVarchar());
        assertEquals("qux", pmb.getVOutVarchar());
        assertEquals("quux", pmb.getVInoutVarchar());
    }

    // -----------------------------------------------------
    //                                      Function Synonym
    //                                      ----------------
    public void test_call_FunctionSynonym_NextNoParameter_Tx() {
        // ## Arrange ##
        SynonymNextFunctionPmb pmb = new SynonymNextFunctionPmb();

        // ## Act ##
        vendorCheckBhv.outsideSql().call(pmb);

        // ## Assert ##
        assertEquals("FN_NEXT_NO_PARAMETER", pmb.getArg1());
    }

    public void test_call_FunctionSynonym_SameName_Tx() {
        // ## Arrange ##
        FnNextSynonymSameNamePmb pmb = new FnNextSynonymSameNamePmb();

        // ## Act ##
        vendorCheckBhv.outsideSql().call(pmb);

        // ## Assert ##
        assertFalse(pmb.getProcedureName().contains(".")); // should be one of main schema
        assertEquals("FN_NEXT_SYNONYM_SAME_NAME", pmb.getArg1());
    }
}
