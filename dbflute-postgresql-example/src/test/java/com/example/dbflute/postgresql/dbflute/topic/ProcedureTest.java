package com.example.dbflute.postgresql.dbflute.topic;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.seasar.dbflute.util.DfTypeUtil;

import com.example.dbflute.postgresql.dbflute.allcommon.CDef;
import com.example.dbflute.postgresql.dbflute.exbhv.MemberLoginBhv;
import com.example.dbflute.postgresql.dbflute.exbhv.VendorCheckBhv;
import com.example.dbflute.postgresql.dbflute.exbhv.pmbean.SpInOutParameterPmb;
import com.example.dbflute.postgresql.dbflute.exbhv.pmbean.SpNextInOutParameterPmb;
import com.example.dbflute.postgresql.dbflute.exbhv.pmbean.SpNextNoParameterPmb;
import com.example.dbflute.postgresql.dbflute.exbhv.pmbean.SpResultSetParameterMorePmb;
import com.example.dbflute.postgresql.dbflute.exbhv.pmbean.SpResultSetParameterPmb;
import com.example.dbflute.postgresql.dbflute.exbhv.pmbean.SpReturnParameterPmb;
import com.example.dbflute.postgresql.dbflute.exbhv.pmbean.SpReturnResultSetPmb;
import com.example.dbflute.postgresql.dbflute.exbhv.pmbean.SpReturnResultSetWithPmb;
import com.example.dbflute.postgresql.dbflute.exbhv.pmbean.SpTransactionInheritPmb;
import com.example.dbflute.postgresql.dbflute.exbhv.pmbean.SpVariousTypeParameterPmb;
import com.example.dbflute.postgresql.dbflute.exbhv.pmbean.SpcamelcaseprocedurePmb;
import com.example.dbflute.postgresql.dbflute.exentity.customize.SpResultSetParameterCurMember;
import com.example.dbflute.postgresql.dbflute.exentity.customize.SpResultSetParameterMoreCurMember;
import com.example.dbflute.postgresql.dbflute.exentity.customize.SpResultSetParameterMoreCurMemberStatus;
import com.example.dbflute.postgresql.dbflute.exentity.customize.SpReturnResultSetReturnValue;
import com.example.dbflute.postgresql.dbflute.exentity.customize.SpReturnResultSetWithReturnValue;
import com.example.dbflute.postgresql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.6.1 (2008/01/23 Wednesday)
 */
public class ProcedureTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private VendorCheckBhv vendorCheckBhv;
    private MemberLoginBhv memberLoginBhv;

    // ===================================================================================
    //                                                                               Basic
    //                                                                               =====
    // PostgreSQL's function needs a parameter or a return parameter
    // so SP_NO_PARAMETER does not exist

    public void test_call_Procedure_InOutParameter() {
        // ## Arrange ##
        SpInOutParameterPmb pmb = new SpInOutParameterPmb();
        pmb.setVInVarchar("foo");
        pmb.setVOutVarchar("bar"); // basically no point (for test, expects overridden later)
        pmb.setVInoutVarchar("baz"); // can set as IN and get as OUT

        // ## Act ##
        vendorCheckBhv.outsideSql().call(pmb);

        // ## Assert ##
        log("in=" + pmb.getVInVarchar() + ", out=" + pmb.getVOutVarchar() + ", inout=" + pmb.getVInoutVarchar());
        assertEquals("foo", pmb.getVInVarchar()); // remains
        assertEquals("baz", pmb.getVOutVarchar()); // overridden in procedure
        assertEquals("foo", pmb.getVInoutVarchar()); // overridden in procedure
    }

    public void test_call_Procedure_ReturnParameter() {
        // ## Arrange ##
        SpReturnParameterPmb pmb = new SpReturnParameterPmb();

        // ## Act ##
        vendorCheckBhv.outsideSql().call(pmb); // expect no exception

        // ## Assert ##
        assertEquals((Integer) 1, pmb.getReturnValue());
    }

    public void test_call_Procedure_VariousTypeParameter() throws Exception {
        // ## Arrange ##
        SpVariousTypeParameterPmb pmb = new SpVariousTypeParameterPmb();
        pmb.setVInVarchar("foo");
        pmb.setVOutVarchar("bar");
        pmb.setVOutChar("baz");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            sb.append("abcdefghij");
        }
        pmb.setVInText(sb.toString());
        assertNull(pmb.getVOutText());
        pmb.setVvInNumericInteger(new BigDecimal(123));
        pmb.setVvInNumericBigint(new BigDecimal(234));
        pmb.setVvInNumericDecimal(new BigDecimal("34.567"));
        assertNull(pmb.getVvOutDecimal());
        pmb.setVvOutInteger(1234);
        pmb.setVvInoutInteger(2345);
        pmb.setVvOutBigint(3456L);
        pmb.setVvInoutBigint(4567L);
        pmb.setVvvInDate(currentDate());
        assertNull(pmb.getVvvOutTimestamp());
        pmb.setVvvInTime(DfTypeUtil.toTime(currentDate()));
        pmb.setVvvvInBool(true);
        pmb.setVvvvInBytea("corge".getBytes("UTF-8"));
        pmb.setVvvvInUuid(UUID.fromString("A0EEBC99-9C0B-4EF8-BB6D-6BB9BD380A11"));
        pmb.setVvvvInOid("grault".getBytes("UTF-8"));

        // ## Act ##
        vendorCheckBhv.outsideSql().call(pmb);

        // ## Assert ##
        log(pmb.toString());
        assertEquals("foo", pmb.getVOutVarchar());
        assertEquals("qux", pmb.getVOutChar().trim()); // needs to trim
        assertEquals(pmb.getVInText(), pmb.getVOutText());
        assertEquals(new BigDecimal("987.654"), pmb.getVvOutDecimal());
        assertEquals(Integer.valueOf(6789), pmb.getVvOutInteger());
        assertEquals(Integer.valueOf(4567), pmb.getVvInoutInteger());
        assertEquals(Long.valueOf(2345), pmb.getVvOutBigint());
        assertNull(pmb.getVvInoutBigint());
        // expect no changed
        assertEquals(pmb.getVvvvInBool(), pmb.getVvvvInBool());
        assertEquals(pmb.getVvvvInBytea(), pmb.getVvvvInBytea());
        assertEquals(pmb.getVvvvInUuid(), pmb.getVvvvInUuid());
        assertEquals(pmb.getVvvvInOid(), pmb.getVvvvInOid());
    }

    // ===================================================================================
    //                                                                 ResultSet Parameter
    //                                                                 ===================
    // /- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // if no transaction, PSQLException: ERROR: cursor "<unnamed portal 1>" does not exist
    // I don't know why
    // - - - - - - - - - -/
    public void test_call_Procedure_ResultSetParameter() {
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
            Integer memberId = member.getMemberId();
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

    public void test_call_Procedure_ResultSetParameter_more() {
        // ## Arrange ##
        SpResultSetParameterMorePmb pmb = new SpResultSetParameterMorePmb();

        // ## Act ##
        vendorCheckBhv.outsideSql().call(pmb);

        // ## Assert ##
        List<SpResultSetParameterMoreCurMember> memberList = pmb.getCurMember();
        assertTrue(memberList.size() > 0);
        for (SpResultSetParameterMoreCurMember member : memberList) {
            log(member);
            assertNotNull(member.getMemberId());
            assertNotNull(member.getMemberName());
        }
        List<SpResultSetParameterMoreCurMemberStatus> statusList = pmb.getCurMemberStatus();
        assertTrue(statusList.size() > 0);
        for (SpResultSetParameterMoreCurMemberStatus status : statusList) {
            log(status);
            assertNotNull(status.getMemberStatusCode());
            assertNotNull(status.getMemberStatusName());
        }
    }

    // ===================================================================================
    //                                                                    Return ResultSet
    //                                                                    ================
    public void test_call_Procedure_ReturnResultSet() {
        // ## Arrange ##
        SpReturnResultSetPmb pmb = new SpReturnResultSetPmb();

        // ## Act ##
        vendorCheckBhv.outsideSql().call(pmb);

        // ## Assert ##
        List<SpReturnResultSetReturnValue> memberList = pmb.getReturnValue();
        assertTrue(memberList.size() > 0);
        for (SpReturnResultSetReturnValue member : memberList) {
            log(member);
            assertNotNull(member.getMemberId());
            assertNotNull(member.getMemberName());
        }
    }

    public void test_call_Procedure_ReturnResultSet_with() {
        // ## Arrange ##
        SpReturnResultSetWithPmb pmb = new SpReturnResultSetWithPmb();
        pmb.setVInChar(CDef.MemberStatus.Formalized.code());
        pmb.setVOutVarchar("bbb");
        pmb.setVInoutVarchar("ccc");

        // ## Act ##
        vendorCheckBhv.outsideSql().call(pmb);

        // ## Assert ##
        List<SpReturnResultSetWithReturnValue> memberList = pmb.getReturnValue();
        assertTrue(memberList.size() > 0);
        for (SpReturnResultSetWithReturnValue member : memberList) {
            log(member);
            assertNotNull(member.getMemberId());
            assertNotNull(member.getMemberName());
        }
        // It causes an error when creating the procedure
        // if it overrides out-parameter in the procedure. 
        //assertEquals("ddd", pmb.getVOutVarchar());
        //assertEquals("eee", pmb.getVInoutVarchar());
        assertEquals("bbb", pmb.getVOutVarchar()); // no handled out-parameter
        assertEquals("ccc", pmb.getVInoutVarchar());
    }

    // ===================================================================================
    //                                                                               Basic
    //                                                                               =====
    public void test_call_Procedure_NextNoParameter() {
        // ## Arrange ##
        SpNextNoParameterPmb pmb = new SpNextNoParameterPmb();

        // ## Act ##
        vendorCheckBhv.outsideSql().call(pmb); // expect no exception

        // ## Assert ##
        assertEquals((Integer) 1, pmb.getReturnValue());
    }

    public void test_call_Procedure_NextInOutParameter() {
        // ## Arrange ##
        SpNextInOutParameterPmb pmb = new SpNextInOutParameterPmb();
        pmb.setVInVarchar("aaa");
        pmb.setVOutVarchar("bbb");
        pmb.setVInoutVarchar("ccc");

        // ## Act ##
        vendorCheckBhv.outsideSql().call(pmb);

        // ## Assert ##
        log("in=" + pmb.getVInVarchar() + ", out=" + pmb.getVOutVarchar() + ", inout=" + pmb.getVInoutVarchar());
        assertEquals("ddd", pmb.getVOutVarchar());
        assertEquals("eee", pmb.getVInoutVarchar());
    }

    // ===================================================================================
    //                                                                         Transaction
    //                                                                         ===========
    public void test_call_Procedure_Transaction_inherit() {
        // ## Arrange ##
        int before = memberLoginBhv.selectCount(memberLoginBhv.newMyConditionBean());
        assertNotSame(0, before);
        SpTransactionInheritPmb pmb = new SpTransactionInheritPmb();

        // ## Act ##
        vendorCheckBhv.outsideSql().call(pmb);

        // ## Assert ##
        int after = memberLoginBhv.selectCount(memberLoginBhv.newMyConditionBean());
        log("before = " + before);
        log("after  = " + after);
        assertEquals(0, after);
    }

    public void test_call_Procedure_Transaction_Inherit_thenAfter() {
        int thenAfter = memberLoginBhv.selectCount(memberLoginBhv.newMyConditionBean());
        assertNotSame(0, thenAfter);
        log("thenAfter = " + thenAfter);
    }

    // ===================================================================================
    //                                                                              Naming
    //                                                                              ======
    public void test_call_Procedure_CamelCaseProcedure() {
        // ## Arrange ##
        SpcamelcaseprocedurePmb pmb = new SpcamelcaseprocedurePmb();
        pmb.setFooparam("foo");
        pmb.setBarparam("bar");
        pmb.setVdonparam("don");
        pmb.setVheeparam("hee");
        pmb.setPooParamname("poo");

        // ## Act ##
        vendorCheckBhv.outsideSql().call(pmb);

        // ## Assert ##
        assertEquals("ddd", pmb.getVdonparam());
        assertEquals("eee", pmb.getPooParamname());
    }
}
