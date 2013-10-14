package com.example.dbflute.db2.dbflute.vendor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.seasar.dbflute.bhv.DeleteOption;
import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.dbflute.cbean.PagingResultBean;
import org.seasar.dbflute.cbean.SubQuery;
import org.seasar.dbflute.cbean.UnionQuery;
import org.seasar.dbflute.exception.SQLFailureException;
import org.seasar.dbflute.jdbc.StatementConfig;
import org.seasar.dbflute.util.DfTypeUtil;

import com.example.dbflute.db2.dbflute.cbean.MemberCB;
import com.example.dbflute.db2.dbflute.cbean.MemberWithdrawalCB;
import com.example.dbflute.db2.dbflute.cbean.VendorCheckCB;
import com.example.dbflute.db2.dbflute.exbhv.MemberBhv;
import com.example.dbflute.db2.dbflute.exbhv.MemberWithdrawalBhv;
import com.example.dbflute.db2.dbflute.exbhv.VendorCheckBhv;
import com.example.dbflute.db2.dbflute.exbhv.pmbean.CompareDatePmb;
import com.example.dbflute.db2.dbflute.exentity.Member;
import com.example.dbflute.db2.dbflute.exentity.MemberWithdrawal;
import com.example.dbflute.db2.dbflute.exentity.VendorCheck;
import com.example.dbflute.db2.dbflute.exentity.customize.VendorCheckDecimalSum;
import com.example.dbflute.db2.dbflute.exentity.customize.VendorCheckIntegerSum;
import com.example.dbflute.db2.unit.UnitContainerTestCase;

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
    // -----------------------------------------------------
    //                                                  CLOB
    //                                                  ----
    public void test_CLOB_largeSize() {
        // ## Arrange ##
        MemberWithdrawal withdrawal = new MemberWithdrawal();
        withdrawal.setMemberId(3);
        withdrawal.setWithdrawalDatetime(currentTimestamp());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            sb.append("1234567890");
        }
        withdrawal.setWithdrawalReasonInputText(sb.toString());
        memberWithdrawalBhv.insertOrUpdateNonstrict(withdrawal);

        MemberWithdrawalCB cb = new MemberWithdrawalCB();
        cb.specify().columnWithdrawalReasonInputText();
        cb.query().setMemberId_Equal(3);

        // ## Act ##
        MemberWithdrawal actualWithdrawal = memberWithdrawalBhv.selectEntity(cb);

        // ## Assert ##
        assertNotNull(actualWithdrawal);
        String actualText = actualWithdrawal.getWithdrawalReasonInputText();
        assertNotNull(actualText);
        assertEquals(sb.toString().length(), actualText.length());
    }

    public void test_CLOG_insert_select_paging() {
        // ## Arrange ##
        vendorCheckBhv.varyingQueryDelete(new VendorCheckCB(), new DeleteOption<VendorCheckCB>().allowNonQueryDelete());
        VendorCheck vendorCheck = createVendorCheck();
        for (int i = 0; i < 100; i++) {
            VendorCheck plus = createVendorCheck(vendorCheck.getVendorCheckId().intValue() + (i + 1));
            plus.setTypeOfInteger(1000 + (i + 1));
            vendorCheckBhv.insert(plus);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            sb.append("1234567890");
        }
        String expected = sb.toString();
        vendorCheck.setTypeOfClob(expected);
        vendorCheck.setTypeOfInteger(1010);
        vendorCheckBhv.insert(vendorCheck);
        VendorCheckCB cb = new VendorCheckCB();
        cb.query().setVendorCheckId_Equal(vendorCheck.getVendorCheckId());
        cb.query().addOrderBy_TypeOfInteger_Asc();
        cb.paging(4, 3); // result set type is auto set as forward only

        // ## Act ##
        PagingResultBean<VendorCheck> page3 = vendorCheckBhv.selectPage(cb);

        // ## Assert ##
        assertNotSame(0, page3.size());
        boolean exists = false;
        for (VendorCheck selected : page3) {
            String actual = selected.getTypeOfClob();
            if (actual != null) {
                log("actual=" + actual);
                assertEquals(expected, actual);
                exists = true;
                break;
            }
        }
        assertTrue("list=" + page3.getSelectedList(), exists);

        // if scroll-able, exception
        cb.configure(new StatementConfig().typeScrollInsensitive());
        try {
            vendorCheckBhv.selectPage(cb);

            fail();
        } catch (SQLFailureException e) {
            // OK
            log(e.getMessage());
        }
    }

    public void test_union_CLOB() {
        // ## Arrange ##
        MemberWithdrawalCB cb = new MemberWithdrawalCB();
        cb.specify().columnWithdrawalReasonInputText();
        cb.union(new UnionQuery<MemberWithdrawalCB>() {
            public void query(MemberWithdrawalCB unionCB) {
            }
        });

        try {
            // ## Act ##
            memberWithdrawalBhv.selectList(cb);

            // ## Assert ##
            fail();
        } catch (SQLFailureException e) {
            // OK
            log(e.getMessage());
        }
    }

    public void test_CLOB_union_resolved_by_myselfInScopeSubQuery() {
        // ## Arrange ##
        MemberWithdrawalCB cb = new MemberWithdrawalCB();
        cb.specify().columnWithdrawalReasonInputText();
        cb.query().myselfInScope(new SubQuery<MemberWithdrawalCB>() {
            public void query(MemberWithdrawalCB subCB) {
                subCB.union(new UnionQuery<MemberWithdrawalCB>() {
                    public void query(MemberWithdrawalCB unionCB) {
                    }
                });
            }
        });

        // ## Act ##
        ListResultBean<MemberWithdrawal> withdrawalList = memberWithdrawalBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, withdrawalList.size());
    }

    public void test_CLOB_unionAll() {
        // ## Arrange ##
        MemberWithdrawalCB cb = new MemberWithdrawalCB();
        cb.specify().columnWithdrawalReasonInputText();
        cb.unionAll(new UnionQuery<MemberWithdrawalCB>() {
            public void query(MemberWithdrawalCB unionCB) {
            }
        });

        // ## Act ##
        ListResultBean<MemberWithdrawal> withdrawalList = memberWithdrawalBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, withdrawalList.size());
    }

    // -----------------------------------------------------
    //                                                DBCLOB
    //                                                ------
    public void test_DBCLOB_insert_select() {
        // ## Arrange ##
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            sb.append("1234567890");
        }
        String expected = sb.toString();
        VendorCheck vendorCheck = createVendorCheck();
        vendorCheck.setTypeOfDbclob(expected);

        // ## Act ##
        vendorCheckBhv.insert(vendorCheck);

        // ## Assert ##
        VendorCheckCB cb = new VendorCheckCB();
        cb.query().setVendorCheckId_Equal(vendorCheck.getVendorCheckId());
        VendorCheck selected = vendorCheckBhv.selectEntityWithDeletedCheck(cb);
        String actual = selected.getTypeOfDbclob();
        log("actual=" + actual);
        assertNotNull(actual);
        assertEquals(expected, actual);
    }

    // ===================================================================================
    //                                                                         Number Type
    //                                                                         ===========

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
        cal.set(2008, 5, 15, 12, 34, 57);
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
        Member member = new Member();
        member.setMemberId(3);
        member.setBirthdate(new Date(cal.getTimeInMillis()));
        memberBhv.updateNonstrict(member);

        String path = MemberBhv.PATH_various_pmbcheck_selectCompareDate;

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

        String path = MemberBhv.PATH_various_pmbcheck_selectCompareDate;

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

    public void test_BLOG_insert_select_paging() {
        // ## Arrange ##
        vendorCheckBhv.varyingQueryDelete(new VendorCheckCB(), new DeleteOption<VendorCheckCB>().allowNonQueryDelete());
        VendorCheck vendorCheck = createVendorCheck();
        for (int i = 0; i < 100; i++) {
            VendorCheck plus = createVendorCheck(vendorCheck.getVendorCheckId().intValue() + (i + 1));
            plus.setTypeOfInteger(1000 + (i + 1));
            vendorCheckBhv.insert(plus);
        }
        Member expected = new Member();
        expected.setMemberName("foo");
        vendorCheck.setTypeOfBlob(serialize(expected));
        vendorCheck.setTypeOfInteger(1010);
        vendorCheckBhv.insert(vendorCheck);
        VendorCheckCB cb = new VendorCheckCB();
        cb.query().setVendorCheckId_Equal(vendorCheck.getVendorCheckId());
        cb.query().addOrderBy_TypeOfInteger_Asc();
        cb.paging(4, 3); // result set type is auto set as forward only

        // ## Act ##
        PagingResultBean<VendorCheck> page3 = vendorCheckBhv.selectPage(cb);

        // ## Assert ##
        assertNotSame(0, page3.size());
        boolean exists = false;
        for (VendorCheck selected : page3) {
            Member actual = (Member) deserialize(selected.getTypeOfBlob());
            if (actual != null) {
                log("actual=" + actual);
                assertEquals(expected.getMemberName(), actual.getMemberName());
                exists = true;
                break;
            }
        }
        assertTrue("list=" + page3.getSelectedList(), exists);

        // if scroll-able, exception
        cb.configure(new StatementConfig().typeScrollInsensitive());
        try {
            vendorCheckBhv.selectPage(cb);

            fail();
        } catch (SQLFailureException e) {
            // OK
            log(e.getMessage());
        }
    }

    // ===================================================================================
    //                                                                        Various Type
    //                                                                        ============
    // -----------------------------------------------------
    //                                               GRAPHIC
    //                                               -------
    public void test_GRAPHIC_insert_select() {
        // ## Arrange ##
        String expected = "abc";
        VendorCheck vendorCheck = createVendorCheck();
        vendorCheck.setTypeOfGraphic(expected);

        // ## Act ##
        try {
            vendorCheckBhv.insert(vendorCheck);

            // ## Assert ##
            fail();
        } catch (SQLFailureException e) {
            // OK
            log(e.getMessage());
        }

        //VendorCheckCB cb = new VendorCheckCB();
        //cb.query().setVendorCheckId_Equal(vendorCheck.getVendorCheckId());
        //cb.query().setTypeOfGraphic_Equal(expected);
        //VendorCheck selected = vendorCheckBhv.selectEntityWithDeletedCheck(cb);
        //String actual = selected.getTypeOfDbclob();
        //log("actualDbclob=" + actual);
        //assertNotNull(actual);
        //assertEquals(expected, actual);
    }

    // -----------------------------------------------------
    //                                         SUM(function)
    //                                         -------------
    @SuppressWarnings("unused")
    public void test_SUM_of_function() throws Exception {
        {
            VendorCheckDecimalSum vendorCheck = new VendorCheckDecimalSum();
            BigDecimal decimalDigit = vendorCheck.getDecimalDigitSum();
        }
        {
            VendorCheckIntegerSum vendorCheck = new VendorCheckIntegerSum();
            BigDecimal integerNonDigit = vendorCheck.getIntegerNonDigitSum();
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
