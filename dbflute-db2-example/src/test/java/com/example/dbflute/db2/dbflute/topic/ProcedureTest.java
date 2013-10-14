package com.example.dbflute.db2.dbflute.topic;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import com.example.dbflute.db2.dbflute.allcommon.CDef;
import com.example.dbflute.db2.dbflute.exbhv.VendorCheckBhv;
import com.example.dbflute.db2.dbflute.exbhv.pmbean.SpInOutParameterPmb;
import com.example.dbflute.db2.dbflute.exbhv.pmbean.SpInOutReturnPmb;
import com.example.dbflute.db2.dbflute.exbhv.pmbean.SpNoParameterPmb;
import com.example.dbflute.db2.dbflute.exbhv.pmbean.SpReturnResultSetMorePmb;
import com.example.dbflute.db2.dbflute.exbhv.pmbean.SpReturnResultSetPmb;
import com.example.dbflute.db2.dbflute.exbhv.pmbean.SpReturnResultSetWithPmb;
import com.example.dbflute.db2.dbflute.exbhv.pmbean.SpVariousTypeParameterPmb;
import com.example.dbflute.db2.dbflute.exentity.customize.SpReturnResultSetMoreNotParamResult1;
import com.example.dbflute.db2.dbflute.exentity.customize.SpReturnResultSetMoreNotParamResult2;
import com.example.dbflute.db2.dbflute.exentity.customize.SpReturnResultSetNotParamResult1;
import com.example.dbflute.db2.dbflute.exentity.customize.SpReturnResultSetWithNotParamResult1;
import com.example.dbflute.db2.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.6.2 (2009/12/12 Saturday)
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

        // ## Act & Assert ##
        vendorCheckBhv.outsideSql().call(pmb); // Expect no exception
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
        log("in=" + pmb.getVInVarchar() + ", out=" + pmb.getVOutVarchar() + ", inout=" + pmb.getVInoutVarchar()
                + ", return=" + pmb.getReturnValue());
        assertEquals("qux", pmb.getVOutVarchar());
        assertEquals("quux", pmb.getVInoutVarchar());

        // DB2 JDBC driver does not give us an information about a return value.
        // So it defines a return value information at the extended parameter-bean manually.
        assertEquals(Integer.valueOf(1), pmb.getReturnValue());
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
        pmb.setVInClob(sb.toString());
        assertNull(pmb.getVOutClob());
        pmb.setVvInNumericInteger(123);
        pmb.setVvInNumericBigint(234L);
        pmb.setVvInNumericDecimal(new BigDecimal("34.567"));
        //assertNull(pmb.getVvOutDecimal());
        pmb.setVvInoutInteger(1234);
        pmb.setVvOutBigint(2345L);
        pmb.setVvvInDate(currentDate());
        assertNull(pmb.getVvvOutTimestamp());

        // ## Act ##
        vendorCheckBhv.outsideSql().call(pmb);

        // ## Assert ##
        log(pmb.toString());
        assertEquals("foo", pmb.getVOutVarchar());
        assertEquals("qux", pmb.getVOutChar().trim()); // needs to trim
        assertEquals(pmb.getVInClob(), pmb.getVOutClob());
        //assertEquals(new BigDecimal("987.654"), pmb.getVvOutDecimal());
        assertEquals(Integer.valueOf(6789), pmb.getVvInoutInteger());
        assertEquals(Long.valueOf(1234), pmb.getVvOutBigint());
        log(pmb.toString());
        assertNotNull(pmb.getVvvOutTimestamp());
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
        // not allowed with out-parameter and return
        //pmb.setVOutVarchar("bbb"); // no point but for test overridden later
        //pmb.setVInoutVarchar("ccc");

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
        // not allowed with out-parameter and return
        //log("in=" + pmb.getVInChar() + ", out=" + pmb.getVOutVarchar() + ", inout=" + pmb.getVInoutVarchar());
        //assertEquals("ddd", pmb.getVOutVarchar());
        //assertEquals("eee", pmb.getVInoutVarchar());
    }
}
