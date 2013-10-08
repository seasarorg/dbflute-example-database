package com.example.dbflute.mysql.dbflute.thematic;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import com.example.dbflute.mysql.dbflute.allcommon.CDef;
import com.example.dbflute.mysql.dbflute.exbhv.MemberLoginBhv;
import com.example.dbflute.mysql.dbflute.exbhv.VendorCheckBhv;
import com.example.dbflute.mysql.dbflute.exbhv.pmbean.SpInOutParameterPmb;
import com.example.dbflute.mysql.dbflute.exbhv.pmbean.SpNoParameterPmb;
import com.example.dbflute.mysql.dbflute.exbhv.pmbean.SpReturnResultSetMorePmb;
import com.example.dbflute.mysql.dbflute.exbhv.pmbean.SpReturnResultSetPmb;
import com.example.dbflute.mysql.dbflute.exbhv.pmbean.SpReturnResultSetWithPmb;
import com.example.dbflute.mysql.dbflute.exbhv.pmbean.SpTransactionInheritPmb;
import com.example.dbflute.mysql.dbflute.exbhv.pmbean.SpVariousTypeParameterPmb;
import com.example.dbflute.mysql.dbflute.exentity.customize.SpReturnResultSetMoreNotParamResult1;
import com.example.dbflute.mysql.dbflute.exentity.customize.SpReturnResultSetMoreNotParamResult2;
import com.example.dbflute.mysql.dbflute.exentity.customize.SpReturnResultSetNotParamResult1;
import com.example.dbflute.mysql.dbflute.exentity.customize.SpReturnResultSetWithNotParamResult1;
import com.example.dbflute.mysql.unit.UnitContainerTestCase;

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
    public void test_call_Procedure_NoParameter() {
        // ## Arrange ##
        SpNoParameterPmb pmb = new SpNoParameterPmb();

        // ## Act & Assert ##
        vendorCheckBhv.outsideSql().call(pmb); // expect no exception
    }

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

    public void test_call_Procedure_VariousTypeParameter() {
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
        pmb.setVvInNumericInteger(123);
        pmb.setVvInNumericBigint(234L);
        pmb.setVvInNumericDecimal(new BigDecimal("34.567"));
        assertNull(pmb.getVvOutDecimal());
        pmb.setVvOutInteger(1234);
        pmb.setVvInoutInteger(2345);
        pmb.setVvOutBigint(3456L);
        pmb.setVvInoutBigint(4567L);
        pmb.setVvvInDate(currentDate());
        assertNull(pmb.getVvvOutDatetime());

        // ## Act ##
        vendorCheckBhv.outsideSql().call(pmb);

        // ## Assert ##
        log(pmb.toString());
        assertEquals("foo", pmb.getVOutVarchar());
        assertEquals("qux", pmb.getVOutChar().trim()); // needs to trim
        assertEquals(pmb.getVInText(), pmb.getVOutText());
        // simple decimal is mapped to Long (so 987.654 to Long with round)
        assertEquals(Long.valueOf("988"), pmb.getVvOutDecimal());
        assertEquals(Integer.valueOf(6789), pmb.getVvOutInteger());
        assertEquals(Integer.valueOf(4567), pmb.getVvInoutInteger());
        assertEquals(Long.valueOf(2345), pmb.getVvOutBigint());
        assertNull(pmb.getVvInoutBigint());
        log(pmb.toString());
        assertNotNull(pmb.getVvvOutDatetime());
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
        List<SpReturnResultSetNotParamResult1> memberList = pmb.getNotParamResult1();
        assertTrue(memberList.size() > 0);
        boolean existsBirthdate = false;
        boolean existsFormalizedDatetime = false;
        for (SpReturnResultSetNotParamResult1 member : memberList) {
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
            assertNotNull(member.getMemberStatusCodeAsMemberStatus());
        }
        assertTrue(existsBirthdate);
        assertTrue(existsFormalizedDatetime);
    }

    public void test_call_Procedure_ReturnResultSet_more() {
        // ## Arrange ##
        SpReturnResultSetMorePmb pmb = new SpReturnResultSetMorePmb();

        // ## Act ##
        vendorCheckBhv.outsideSql().call(pmb);

        // ## Assert ##
        List<SpReturnResultSetMoreNotParamResult1> memberList = pmb.getNotParamResult1();
        for (SpReturnResultSetMoreNotParamResult1 member : memberList) {
            log(member);
            assertNotNull(member.getMemberId());
            assertNotNull(member.getMemberName());
        }
        List<SpReturnResultSetMoreNotParamResult2> memberStatusList = pmb.getNotParamResult2();
        for (SpReturnResultSetMoreNotParamResult2 memberStatus : memberStatusList) {
            log(memberStatus);
            assertNotNull(memberStatus.getMemberStatusCode());
            assertNotNull(memberStatus.getMemberStatusName());
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
        List<SpReturnResultSetWithNotParamResult1> memberList = pmb.getNotParamResult1();
        for (SpReturnResultSetWithNotParamResult1 member : memberList) {
            log(member);
            assertNotNull(member.getMemberId());
            assertNotNull(member.getMemberName());
            assertTrue(member.isMemberStatusCodeFormalized());
        }
        log("in=" + pmb.getVInChar() + ", out=" + pmb.getVOutVarchar() + ", inout=" + pmb.getVInoutVarchar());
        assertEquals("qux", pmb.getVOutVarchar());
        assertEquals("quux", pmb.getVInoutVarchar());
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
}
