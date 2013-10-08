package com.example.dbflute.mysql.dbflute.vendor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.dbflute.cbean.UnionQuery;
import org.seasar.dbflute.exception.IllegalClassificationCodeException;
import org.seasar.dbflute.util.DfTypeUtil;

import com.example.dbflute.mysql.dbflute.allcommon.CDef;
import com.example.dbflute.mysql.dbflute.allcommon.CDef.BooleanFlg;
import com.example.dbflute.mysql.dbflute.cbean.MemberCB;
import com.example.dbflute.mysql.dbflute.cbean.MemberWithdrawalCB;
import com.example.dbflute.mysql.dbflute.cbean.VendorCheckCB;
import com.example.dbflute.mysql.dbflute.exbhv.MemberBhv;
import com.example.dbflute.mysql.dbflute.exbhv.MemberWithdrawalBhv;
import com.example.dbflute.mysql.dbflute.exbhv.VendorCheckBhv;
import com.example.dbflute.mysql.dbflute.exbhv.pmbean.CompareDatePmb;
import com.example.dbflute.mysql.dbflute.exbhv.pmbean.SimpleVendorCheckPmb;
import com.example.dbflute.mysql.dbflute.exbhv.pmbean.UnionVendorCheckPmb;
import com.example.dbflute.mysql.dbflute.exentity.Member;
import com.example.dbflute.mysql.dbflute.exentity.MemberWithdrawal;
import com.example.dbflute.mysql.dbflute.exentity.VendorCheck;
import com.example.dbflute.mysql.dbflute.exentity.customize.SimpleVendorCheck;
import com.example.dbflute.mysql.dbflute.exentity.customize.VendorCheckDecimalSum;
import com.example.dbflute.mysql.dbflute.exentity.customize.VendorCheckIntegerSum;
import com.example.dbflute.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.6.1 (2008/01/23 Wednesday)
 */
public class VendorTypeTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private VendorCheckBhv vendorCheckBhv;
    private MemberBhv memberBhv;
    private MemberWithdrawalBhv memberWithdrawalBhv;

    // ===================================================================================
    //                                                                         String Type
    //                                                                         ===========
    public void test_TEXT_union() {
        // ## Arrange ##
        MemberWithdrawalCB cb = new MemberWithdrawalCB();
        cb.specify().columnWithdrawalReasonInputText();
        cb.union(new UnionQuery<MemberWithdrawalCB>() {
            public void query(MemberWithdrawalCB unionCB) {
            }
        });

        // ## Act ##
        ListResultBean<MemberWithdrawal> withdrawalList = memberWithdrawalBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, withdrawalList.size());
    }

    // ===================================================================================
    //                                                                         Number Type
    //                                                                         ===========

    // ===================================================================================
    //                                                                        Boolean Type
    //                                                                        ============
    public void test_BOOLEAN_ConditionBean_Equal() {
        // ## Arrange ##
        VendorCheck vendorCheck = registerTrueAndFalse();
        VendorCheckCB cb = new VendorCheckCB();
        cb.query().setTypeOfBoolean_Equal(true);

        // ## Act ##
        VendorCheck actual = vendorCheckBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        log(actual);
        assertEquals(vendorCheck.getVendorCheckId(), actual.getVendorCheckId());
        assertEquals(vendorCheck.getTypeOfBoolean(), actual.getTypeOfBoolean());
        assertTrue(actual.getTypeOfBoolean());
    }

    public void test_BOOLEAN_ConditionBean_OrderBy_true() {
        // ## Arrange ##
        registerTrueAndFalse();
        VendorCheckCB cb = new VendorCheckCB();
        List<BooleanFlg> orderValueList = Arrays.asList(CDef.BooleanFlg.True);
        cb.query().addOrderBy_TypeOfBoolean_Asc().withManualOrder(orderValueList);

        // ## Act ##
        ListResultBean<VendorCheck> checkList = vendorCheckBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(checkList);
        for (VendorCheck check : checkList) {
            log(check.getVendorCheckId() + ", " + check.getTypeOfBoolean());
        }
        assertEquals(2, checkList.size());
        assertTrue(checkList.get(0).getTypeOfBoolean());
        assertFalse(checkList.get(1).getTypeOfBoolean());
    }

    public void test_BOOLEAN_ConditionBean_OrderBy_false() {
        // ## Arrange ##
        registerTrueAndFalse();
        VendorCheckCB cb = new VendorCheckCB();
        List<BooleanFlg> orderValueList = Arrays.asList(CDef.BooleanFlg.False);
        cb.query().addOrderBy_TypeOfBoolean_Asc().withManualOrder(orderValueList);

        // ## Act ##
        ListResultBean<VendorCheck> checkList = vendorCheckBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(checkList);
        for (VendorCheck check : checkList) {
            log(check.getVendorCheckId() + ", " + check.getTypeOfBoolean());
        }
        assertEquals(2, checkList.size());
        assertFalse(checkList.get(0).getTypeOfBoolean());
        assertTrue(checkList.get(1).getTypeOfBoolean());
    }

    public void test_BOOLEAN_OutsideSql_simple() {
        // ## Arrange ##
        VendorCheck vendorCheck = registerTrueAndFalse();
        SimpleVendorCheckPmb pmb = new SimpleVendorCheckPmb();

        // ## Act ##
        ListResultBean<SimpleVendorCheck> vendorCheckList = vendorCheckBhv.outsideSql().selectList(pmb);

        // ## Assert ##
        assertHasAnyElement(vendorCheckList);
        assertEquals(2, vendorCheckList.size());
        boolean existsTrue = false;
        boolean existsFalse = false;
        for (SimpleVendorCheck actual : vendorCheckList) {
            if (vendorCheck.getVendorCheckId().equals(actual.getVendorCheckId())) {
                log("true: " + actual);
                assertEquals(vendorCheck.getTypeOfBoolean(), actual.getTypeOfBoolean());
                assertTrue(actual.getTypeOfBoolean());
                existsTrue = true;
            } else {
                log("false: " + actual);
                assertFalse(actual.getTypeOfBoolean());
                existsFalse = true;
            }
        }
        assertTrue(existsTrue);
        assertTrue(existsFalse);
    }

    public void test_BOOLEAN_OutsideSql_union() {
        // ## Arrange ##
        registerTrueAndFalse();
        UnionVendorCheckPmb pmb = new UnionVendorCheckPmb();

        // ## Act ##
        try {
            vendorCheckBhv.outsideSql().selectList(pmb);

            // ## Assert ##
            fail();
        } catch (IllegalClassificationCodeException e) {
            // OK
            log(e.getMessage());
        }

        // ## Assert ##
        //assertListNotEmpty(vendorCheckList);
        //assertEquals(2, vendorCheckList.size());
        //boolean existsTrue = false;
        //boolean existsFalse = false;
        //for (UnionVendorCheck actual : vendorCheckList) {
        //    if (vendorCheck.getVendorCheckId().equals(actual.getVendorCheckId())) {
        //        log("true: " + actual);
        //        assertEquals(vendorCheck.getTypeOfBoolean(), actual.getTypeOfBoolean());
        //        assertEquals(1, actual.getTypeOfBoolean());
        //        existsTrue = true;
        //    } else {
        //        log("false: " + actual);
        //        assertEquals(0, actual.getTypeOfBoolean());
        //        existsFalse = true;
        //    }
        //}
        //assertTrue(existsTrue);
        //assertTrue(existsFalse);
    }

    protected VendorCheck registerTrueAndFalse() {
        VendorCheckCB deleteCB = new VendorCheckCB();
        deleteCB.query().setTypeOfBoolean_Equal(true);
        log("deleted(true)=" + vendorCheckBhv.queryDelete(deleteCB));
        deleteCB.query().setTypeOfBoolean_Equal(false);
        log("deleted(false)=" + vendorCheckBhv.queryDelete(deleteCB));

        VendorCheck vendorCheck = new VendorCheck();
        vendorCheck.setVendorCheckId(new Long(8881));
        vendorCheck.setTypeOfNumericDecimal(new BigDecimal(12.23));
        vendorCheck.setTypeOfNumericInteger(new Integer(123));
        vendorCheck.setTypeOfNumericBigint(new Long(123));
        vendorCheck.setTypeOfText("abc");
        vendorCheck.setTypeOfBoolean(true);

        vendorCheckBhv.insert(vendorCheck);
        {
            VendorCheck twice = new VendorCheck();
            twice.setVendorCheckId(new Long(8882));
            twice.setTypeOfNumericDecimal(new BigDecimal(13.34));
            twice.setTypeOfNumericInteger(new Integer(41));
            vendorCheck.setTypeOfNumericBigint(new Long(32));
            twice.setTypeOfText("abc");
            twice.setTypeOfBoolean(false);
            vendorCheckBhv.insert(twice);
        }
        return vendorCheck; // is true
    }

    // ===================================================================================
    //                                                                           Date Type
    //                                                                           =========
    public void test_DATE_HHmmss_conditionBean() { // *Important!
        // ## Arrange ##
        Calendar cal = Calendar.getInstance();
        cal.set(2008, 5, 15, 12, 34, 56);
        cal.set(Calendar.MILLISECOND, 123);
        Member member = new Member();
        member.setMemberId(3);
        member.setBirthdate(new Date(cal.getTimeInMillis()));
        memberBhv.updateNonstrict(member);

        // ## Act ##
        cal.set(2008, 5, 15, 12, 34, 57); // plus one second
        {
            MemberCB cb = new MemberCB();
            cb.query().setMemberId_Equal(3);
            cb.query().setBirthdate_GreaterEqual(new Date(cal.getTimeInMillis()));
            Member actual = memberBhv.selectEntityWithDeletedCheck(cb);

            // ## Assert ##
            Date actualValue = actual.getBirthdate();
            String formatted = DfTypeUtil.toString(actualValue, "yyyy/MM/dd HH:mm:ss.SSS");
            log("actualValue = " + formatted);
            assertEquals("2008/06/15 00:00:00.000", formatted);
        }
        {
            MemberCB cb = new MemberCB();
            cb.query().setMemberId_Equal(3);
            cb.query().setBirthdate_GreaterEqual(new java.sql.Date(cal.getTimeInMillis()));
            Member actual = memberBhv.selectEntityWithDeletedCheck(cb);

            // ## Assert ##
            Date actualValue = actual.getBirthdate();
            String formatted = DfTypeUtil.toString(actualValue, "yyyy/MM/dd HH:mm:ss.SSS");
            log("actualValue = " + formatted);
            assertEquals("2008/06/15 00:00:00.000", formatted);
        }
        {
            MemberCB cb = new MemberCB();
            cb.query().setMemberId_Equal(3);
            cb.query().setBirthdate_GreaterEqual(new Timestamp(cal.getTimeInMillis()));
            Member actual = memberBhv.selectEntityWithDeletedCheck(cb);

            // ## Assert ##
            Date actualValue = actual.getBirthdate();
            String formatted = DfTypeUtil.toString(actualValue, "yyyy/MM/dd HH:mm:ss.SSS");
            log("actualValue = " + formatted);
            assertEquals("2008/06/15 00:00:00.000", formatted);
        }
    }

    public void test_DATE_HHmmss_outsideSql() throws Exception {
        // ## Arrange ##
        Calendar cal = Calendar.getInstance();
        cal.set(9001, 5, 15, 12, 34, 56);
        cal.set(Calendar.MILLISECOND, 0);
        Member member = new Member();
        member.setMemberId(3);
        member.setBirthdate(new Date(cal.getTimeInMillis()));
        memberBhv.updateNonstrict(member);

        String path = MemberBhv.PATH_whitebox_pmbean_selectCompareDate;

        CompareDatePmb pmb = new CompareDatePmb();
        pmb.setMemberId(3);
        cal.set(9001, 5, 15, 23, 45, 57);
        pmb.setBirthdateFrom(new Date(cal.getTimeInMillis()));

        Class<Member> entityType = Member.class;

        // ## Act ##
        List<Member> memberList = memberBhv.outsideSql().selectList(path, pmb, entityType);

        // ## Assert ##
        assertNotSame(0, memberList.size());
        for (Member actual : memberList) {
            log(actual.getMemberName() + " : " + actual.getBirthdate());
        }
    }

    public void test_DATE_selectPureDate() { // *Important!
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.query().setBirthdate_IsNotNull();

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, memberList.size());
        for (Member member : memberList) {
            Date birthdate = member.getBirthdate();
            assertTrue(java.util.Date.class.equals(birthdate.getClass()));
            assertFalse(birthdate instanceof java.sql.Date);
            assertFalse(birthdate instanceof Timestamp);
        }
    }

    public void test_DATE_SqlDate_HHmmss_outsideSql() throws Exception {
        // ## Arrange ##
        Calendar cal = Calendar.getInstance();
        cal.set(9001, 5, 15, 12, 34, 56);
        cal.set(Calendar.MILLISECOND, 0);
        Member member = new Member();
        member.setMemberId(3);
        member.setBirthdate(new Date(cal.getTimeInMillis()));
        memberBhv.updateNonstrict(member);

        String path = MemberBhv.PATH_whitebox_pmbean_selectCompareDate;

        CompareDatePmb pmb = new CompareDatePmb();
        pmb.setMemberId(3);
        cal.set(9001, 5, 15, 23, 45, 57);
        pmb.setBirthdateFrom(new java.sql.Date(cal.getTimeInMillis()));

        Class<Member> entityType = Member.class;

        // ## Act ##
        Member actual = memberBhv.outsideSql().entityHandling().selectEntityWithDeletedCheck(path, pmb, entityType);

        // ## Assert ##
        Date actualValue = actual.getBirthdate();
        String formatted = DfTypeUtil.toString(actualValue, "yyyy/MM/dd HH:mm:ss.SSS");
        log("actualValue = " + formatted);
        assertEquals("9001/06/15 00:00:00.000", formatted);
    }

    // ===================================================================================
    //                                                                         Binary Type
    //                                                                         ===========
    // -----------------------------------------------------
    //                                                  BLOB
    //                                                  ----
    public void test_BLOB_insert_select() {
        // ## Arrange ##
        String expected = "foo";
        Member member = memberBhv.selectByPKValue(3);
        member.setMemberName(expected);
        VendorCheck vendorCheck = createVendorCheck();
        vendorCheck.setTypeOfBlob(serialize(member));

        // ## Act ##
        vendorCheckBhv.insert(vendorCheck);
        VendorCheckCB cb = new VendorCheckCB();
        cb.query().setVendorCheckId_Equal(vendorCheck.getVendorCheckId());
        VendorCheck selected = vendorCheckBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        byte[] bytes = selected.getTypeOfBlob();
        assertNotNull(bytes);
        Member deserialized = (Member) deserialize(bytes);
        log("deserialized=" + deserialized);
        assertEquals(expected, deserialized.getMemberName());
    }

    // ===================================================================================
    //                                                                        Various Type
    //                                                                        ============
    // -----------------------------------------------------
    //                                                  ENUM
    //                                                  ----
    public void test_typeHandling_ENUM() {
        // ## Arrange ##
        VendorCheck vendorCheck = createVendorCheck();
        vendorCheck.setTypeOfEnum("red");

        // ## Act ##
        vendorCheckBhv.insert(vendorCheck);

        // ## Assert ##
        VendorCheckCB cb = new VendorCheckCB();
        cb.query().setTypeOfEnum_Equal("red");
        VendorCheck actual = vendorCheckBhv.selectEntityWithDeletedCheck(cb);
        assertEquals("red", actual.getTypeOfEnum());
    }

    public void test_typeHandling_SET_oneElement() {
        // ## Arrange ##
        VendorCheck vendorCheck = createVendorCheck();
        vendorCheck.setTypeOfSet("red");

        // ## Act ##
        vendorCheckBhv.insert(vendorCheck);

        // ## Assert ##
        VendorCheckCB cb = new VendorCheckCB();
        cb.query().setTypeOfSet_Equal("red");
        VendorCheck actual = vendorCheckBhv.selectEntityWithDeletedCheck(cb);
        assertEquals("red", actual.getTypeOfSet());
    }

    public void test_typeHandling_SET_severalElement() {
        // ## Arrange ##
        VendorCheck vendorCheck = createVendorCheck();
        vendorCheck.setTypeOfSet("red,blue");

        // ## Act ##
        vendorCheckBhv.insert(vendorCheck);

        // ## Assert ##
        VendorCheckCB cb = new VendorCheckCB();
        cb.query().setTypeOfSet_Equal("red,blue");
        VendorCheck actual = vendorCheckBhv.selectEntityWithDeletedCheck(cb);
        assertEquals("red,blue", actual.getTypeOfSet());
    }

    // -----------------------------------------------------
    //                                         SUM(function)
    //                                         -------------
    @SuppressWarnings("unused")
    public void test_SUM_of_function() throws Exception {
        {
            VendorCheckDecimalSum vendorCheck = new VendorCheckDecimalSum();
            BigDecimal integerNonDigit = vendorCheck.getDecimalDigitSum();
        }
        {
            VendorCheckIntegerSum vendorCheck = new VendorCheckIntegerSum();
            BigDecimal integerNonDigit = vendorCheck.getIntegerNonDigitSum();
        }
    }

    // ===================================================================================
    //                                                                       Type Handling
    //                                                                       =============
    @SuppressWarnings("unused")
    public void test_typeHandling_various_types() {
        {
            VendorCheck vendorCheck = new VendorCheck();
            Integer integerNonDigit = vendorCheck.getTypeOfInteger();
            Long numericBigint = vendorCheck.getTypeOfNumericBigint();
            BigDecimal decimalDigit = vendorCheck.getTypeOfNumericDecimal();
            Boolean typeOfBoolean = vendorCheck.getTypeOfBoolean();
            String typeOfLongtext = vendorCheck.getTypeOfLongtext();
            Date typeOfDate = vendorCheck.getTypeOfDate();
            Timestamp typeOfDatetime = vendorCheck.getTypeOfDatetime();
            Time typeOfTime = vendorCheck.getTypeOfTime();
        }
        {
            SimpleVendorCheck vendorCheck = new SimpleVendorCheck();
            Integer integerNonDigit = vendorCheck.getTypeOfNumericInteger();
            BigDecimal decimalDigit = vendorCheck.getTypeOfNumericDecimal();
        }
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    protected VendorCheck createVendorCheck() {
        VendorCheck vendorCheck = new VendorCheck();
        vendorCheck.setVendorCheckId(new Long(99999));
        return vendorCheck;
    }

    protected VendorCheck createVendorCheck(Integer id) {
        VendorCheck vendorCheck = new VendorCheck();
        vendorCheck.setVendorCheckId(new Long(id));
        return vendorCheck;
    }

    protected byte[] serialize(Serializable obj) {
        return DfTypeUtil.toBinary(obj);
    }

    protected Serializable deserialize(byte[] bytes) {
        return DfTypeUtil.toSerializable(bytes);
    }
}
