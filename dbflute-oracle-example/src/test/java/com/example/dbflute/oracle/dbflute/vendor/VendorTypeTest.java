package com.example.dbflute.oracle.dbflute.vendor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import org.seasar.dbflute.bhv.DeleteOption;
import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.dbflute.cbean.SubQuery;
import org.seasar.dbflute.cbean.UnionQuery;
import org.seasar.dbflute.cbean.coption.FromToOption;
import org.seasar.dbflute.dbmeta.info.ColumnInfo;
import org.seasar.dbflute.exception.EntityAlreadyDeletedException;
import org.seasar.dbflute.exception.SQLFailureException;
import org.seasar.dbflute.util.DfTypeUtil;

import com.example.dbflute.oracle.dbflute.bsentity.customize.dbmeta.SimpleVendorCheckDbm;
import com.example.dbflute.oracle.dbflute.bsentity.dbmeta.VendorCheckDbm;
import com.example.dbflute.oracle.dbflute.cbean.MemberCB;
import com.example.dbflute.oracle.dbflute.cbean.MemberWithdrawalCB;
import com.example.dbflute.oracle.dbflute.cbean.PurchaseCB;
import com.example.dbflute.oracle.dbflute.cbean.VendorCheckCB;
import com.example.dbflute.oracle.dbflute.exbhv.MemberBhv;
import com.example.dbflute.oracle.dbflute.exbhv.MemberWithdrawalBhv;
import com.example.dbflute.oracle.dbflute.exbhv.PurchaseBhv;
import com.example.dbflute.oracle.dbflute.exbhv.VendorCheckBhv;
import com.example.dbflute.oracle.dbflute.exbhv.pmbean.CompareDatePmb;
import com.example.dbflute.oracle.dbflute.exentity.Member;
import com.example.dbflute.oracle.dbflute.exentity.MemberWithdrawal;
import com.example.dbflute.oracle.dbflute.exentity.Purchase;
import com.example.dbflute.oracle.dbflute.exentity.VendorCheck;
import com.example.dbflute.oracle.dbflute.exentity.customize.SimpleVendorCheck;
import com.example.dbflute.oracle.dbflute.exentity.customize.VendorCheckDecimalSum;
import com.example.dbflute.oracle.dbflute.exentity.customize.VendorCheckIntegerSum;
import com.example.dbflute.oracle.unit.UnitContainerTestCase;

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
    private PurchaseBhv purchaseBhv;
    private MemberWithdrawalBhv memberWithdrawalBhv;
    private DataSource dataSource;

    // ===================================================================================
    //                                                                         String Type
    //                                                                         ===========
    // -----------------------------------------------------
    //                                                  CLOB
    //                                                  ----
    public void test_CLOB_largeSize() {
        // ## Arrange ##
        MemberWithdrawal withdrawal = new MemberWithdrawal();
        withdrawal.setMemberId(3L);
        withdrawal.setWithdrawalDatetime(currentTimestamp());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            sb.append("1234567890");
        }
        withdrawal.setWithdrawalReasonInputText(sb.toString());
        memberWithdrawalBhv.insertOrUpdateNonstrict(withdrawal);

        MemberWithdrawalCB cb = new MemberWithdrawalCB();
        cb.specify().columnWithdrawalReasonInputText();
        cb.query().setMemberId_Equal(3L);

        // ## Act ##
        MemberWithdrawal actualWithdrawal = memberWithdrawalBhv.selectEntity(cb);

        // ## Assert ##
        assertNotNull(actualWithdrawal);
        String actualText = actualWithdrawal.getWithdrawalReasonInputText();
        assertNotNull(actualText);
        assertEquals(sb.toString().length(), actualText.length());
    }

    public void test_CLOB_union_unsupported_at_Oracle() {
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

    public void test_NCLOB_largeSize() {
        // ## Arrange ##
        VendorCheck vendorCheck = createVendorCheck();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            sb.append("1234567890");
        }
        vendorCheck.setTypeOfNclob(sb.toString());
        vendorCheckBhv.insert(vendorCheck);

        // ## Act ##
        VendorCheck actual = vendorCheckBhv.selectByPKValue(vendorCheck.getVendorCheckId());

        // ## Assert ##
        assertNotNull(actual);
        String actualText = actual.getTypeOfNclob();
        assertNotNull(actualText);
        assertEquals(sb.toString().length(), actualText.length());
    }

    // -----------------------------------------------------
    //                                                  LONG
    //                                                  ----
    public void test_LONG_insert_select() {
        // ## Arrange ##
        VendorCheck vendorCheck = new VendorCheck();
        vendorCheck.setVendorCheckId(99999L);
        vendorCheck.setTypeOfLong("test");

        // ## Act ##
        vendorCheckBhv.insert(vendorCheck);

        // ## Assert ##
        VendorCheckCB cb = new VendorCheckCB();
        cb.query().setVendorCheckId_Equal(99999L);
        try {
            vendorCheckBhv.selectEntityWithDeletedCheck(cb);

            // LONG column should be accessed first in selected columns on JDBC process 
            fail("LONG should be unsupported!");
        } catch (SQLFailureException e) {
            // OK
            log(e.getMessage());
        }
    }

    // ===================================================================================
    //                                                                         Number Type
    //                                                                         ===========
    public void test_NUMBER_AutoMapping_DomainEntity() throws Exception {
        // ## Arrange ##
        VendorCheck vendorCheck = new VendorCheck();

        // ## Act & Assert ##
        final Integer typeOfNumberInteger = vendorCheck.getTypeOfNumberInteger();
        final Long typeOfNumberBigint = vendorCheck.getTypeOfNumberBigint();
        final BigDecimal typeOfNumberDecimal = vendorCheck.getTypeOfNumberDecimal();
        final Integer typeOfNumberIntegerMin = vendorCheck.getTypeOfNumberIntegerMin();
        final Integer typeOfNumberIntegerMax = vendorCheck.getTypeOfNumberIntegerMax();
        final Long typeOfNumberBigintMin = vendorCheck.getTypeOfNumberBigintMin();
        final Long typeOfNumberBigintMax = vendorCheck.getTypeOfNumberBigintMax();
        final BigDecimal typeOfNumberSuperintMin = vendorCheck.getTypeOfNumberSuperintMin();
        final BigDecimal typeOfNumberSuperintMax = vendorCheck.getTypeOfNumberSuperintMax();
        assertNull(typeOfNumberBigint);
        assertNull(typeOfNumberInteger);
        assertNull(typeOfNumberDecimal);
        assertNull(typeOfNumberIntegerMin);
        assertNull(typeOfNumberIntegerMax);
        assertNull(typeOfNumberBigintMin);
        assertNull(typeOfNumberBigintMax);
        assertNull(typeOfNumberSuperintMin);
        assertNull(typeOfNumberSuperintMax);
    }

    public void test_NUMBER_AutoMapping_CustomizeEntity() throws Exception {
        // ## Arrange ##
        SimpleVendorCheck vendorCheck = new SimpleVendorCheck();

        // ## Act & Assert ##
        final Integer typeOfNumberInteger = vendorCheck.getTypeOfNumberInteger();
        final Long typeOfNumberBigint = vendorCheck.getTypeOfNumberBigint();
        final BigDecimal typeOfNumberDecimal = vendorCheck.getTypeOfNumberDecimal();
        final Integer typeOfNumberIntegerMin = vendorCheck.getTypeOfNumberIntegerMin();
        final Integer typeOfNumberIntegerMax = vendorCheck.getTypeOfNumberIntegerMax();
        final Long typeOfNumberBigintMin = vendorCheck.getTypeOfNumberBigintMin();
        final Long typeOfNumberBigintMax = vendorCheck.getTypeOfNumberBigintMax();
        final BigDecimal typeOfNumberSuperintMin = vendorCheck.getTypeOfNumberSuperintMin();
        final BigDecimal typeOfNumberSuperintMax = vendorCheck.getTypeOfNumberSuperintMax();
        assertNull(typeOfNumberBigint);
        assertNull(typeOfNumberInteger);
        assertNull(typeOfNumberDecimal);
        assertNull(typeOfNumberIntegerMin);
        assertNull(typeOfNumberIntegerMax);
        assertNull(typeOfNumberBigintMin);
        assertNull(typeOfNumberBigintMax);
        assertNull(typeOfNumberSuperintMin);
        assertNull(typeOfNumberSuperintMax);
    }

    public void test_Generate_DecimalDigit_is_BigDecimal() throws Exception {
        // ## Arrange ##
        final ColumnInfo columnDecimalDigit = VendorCheckDbm.getInstance().columnTypeOfNumberDecimal();

        // ## Act ##
        final Integer columnSize = columnDecimalDigit.getColumnSize();
        final Integer columnDecimalDigits = columnDecimalDigit.getDecimalDigits();
        final Class<?> propertyType = columnDecimalDigit.getPropertyAccessType();

        // ## Assert ##
        assertNotNull(columnSize);
        assertNotNull(columnDecimalDigits);
        assertNotSame(0, columnSize);
        assertNotSame(0, columnDecimalDigits);
        assertEquals(SimpleVendorCheckDbm.getInstance().columnTypeOfNumberDecimal().getPropertyAccessType(), propertyType);
        final BigDecimal decimalDigit = new VendorCheck().getTypeOfNumberDecimal();
        assertNull(decimalDigit);
    }

    public void test_Generate_TypeOfNumberInteger_is_Integer() throws Exception {
        // ## Arrange ##
        final ColumnInfo columnTypeOfNumberInteger = VendorCheckDbm.getInstance().columnTypeOfNumberInteger();

        // ## Act ##
        final Integer columnSize = columnTypeOfNumberInteger.getColumnSize();
        final Integer columnDecimalDigits = columnTypeOfNumberInteger.getDecimalDigits();
        final Class<?> propertyType = columnTypeOfNumberInteger.getPropertyAccessType();

        // ## Assert ##
        assertNotNull(columnSize);
        assertNotNull(columnDecimalDigits);
        assertNotSame(0, columnSize);
        assertNotSame(0, columnTypeOfNumberInteger);
        assertEquals(SimpleVendorCheckDbm.getInstance().columnTypeOfNumberInteger().getPropertyAccessType(), propertyType);
        final Integer integerNonDigit = new VendorCheck().getTypeOfNumberInteger();
        assertNull(integerNonDigit);
    }

    public void test_Generate_TypeOfNumberBigint_is_Long() throws Exception {
        // ## Arrange ##
        final ColumnInfo columnTypeOfNumberBigint = VendorCheckDbm.getInstance().columnTypeOfNumberBigint();

        // ## Act ##
        final Integer columnSize = columnTypeOfNumberBigint.getColumnSize();
        final Integer columnDecimalDigits = columnTypeOfNumberBigint.getDecimalDigits();
        final Class<?> propertyType = columnTypeOfNumberBigint.getPropertyAccessType();

        // ## Assert ##
        assertNotNull(columnSize);
        assertNotNull(columnDecimalDigits);
        assertNotSame(0, columnSize);
        assertNotSame(0, columnTypeOfNumberBigint);
        assertEquals(SimpleVendorCheckDbm.getInstance().columnTypeOfNumberBigint().getPropertyAccessType(), propertyType);
        final Long bigintNonDigit = new VendorCheck().getTypeOfNumberBigint();
        assertNull(bigintNonDigit);
    }

    public void test_Generate_TypeOfNumberSuperint_is_BigDecimal() throws Exception {
        // ## Arrange ##
        final ColumnInfo columnTypeOfNumberSuperint = VendorCheckDbm.getInstance().columnTypeOfNumberSuperintMax();

        // ## Act ##
        final Integer columnSize = columnTypeOfNumberSuperint.getColumnSize();
        final Integer columnDecimalDigits = columnTypeOfNumberSuperint.getDecimalDigits();
        final Class<?> propertyType = columnTypeOfNumberSuperint.getPropertyAccessType();

        // ## Assert ##
        assertNotNull(columnSize);
        assertNotNull(columnDecimalDigits);
        assertNotSame(0, columnSize);
        assertNotSame(0, columnTypeOfNumberSuperint);
        assertEquals(SimpleVendorCheckDbm.getInstance().columnTypeOfNumberSuperintMax().getPropertyAccessType(), propertyType);
        final BigDecimal bigintNonDigit = new VendorCheck().getTypeOfNumberSuperintMax();
        assertNull(bigintNonDigit);
    }

    public void test_Sql2Entity_DecimalDigit_is_BigDecimal() throws Exception {
        // ## Arrange ##
        final ColumnInfo columnDecimalDigit = SimpleVendorCheckDbm.getInstance().columnTypeOfNumberDecimal();

        // ## Act ##
        final Integer columnSize = columnDecimalDigit.getColumnSize();
        final Integer columnDecimalDigits = columnDecimalDigit.getDecimalDigits();
        final Class<?> propertyType = columnDecimalDigit.getPropertyAccessType();

        // ## Assert ##
        assertNotNull(columnSize);
        assertNotNull(columnDecimalDigits);
        assertNotSame(0, columnSize);
        assertNotSame(0, columnDecimalDigits);
        assertEquals(VendorCheckDbm.getInstance().columnTypeOfNumberDecimal().getPropertyAccessType(), propertyType);
        final BigDecimal decimalDigit = new SimpleVendorCheck().getTypeOfNumberDecimal();
        assertNull(decimalDigit);
    }

    public void test_Sql2Entity_TypeOfNumberInteger_is_Integer() throws Exception {
        // ## Arrange ##
        final ColumnInfo columnTypeOfNumberInteger = SimpleVendorCheckDbm.getInstance().columnTypeOfNumberInteger();

        // ## Act ##
        final Integer columnSize = columnTypeOfNumberInteger.getColumnSize();
        final Integer columnDecimalDigits = columnTypeOfNumberInteger.getDecimalDigits();
        final Class<?> propertyType = columnTypeOfNumberInteger.getPropertyAccessType();

        // ## Assert ##
        assertNotNull(columnSize);
        assertNotNull(columnDecimalDigits);
        assertNotSame(0, columnSize);
        assertNotSame(0, columnTypeOfNumberInteger);
        assertEquals(VendorCheckDbm.getInstance().columnTypeOfNumberInteger().getPropertyAccessType(), propertyType);
        final Integer integerNonDigit = new SimpleVendorCheck().getTypeOfNumberInteger();
        assertNull(integerNonDigit);
    }

    public void test_Sql2Entity_Selectable() throws Exception {
        // ## Arrange ##
        deleteAll();
        final VendorCheck vendorCheck = new VendorCheck();
        vendorCheck.setVendorCheckId(99999L);
        final BigDecimal expectedDecimalDigit = new BigDecimal("12.345");
        vendorCheck.setTypeOfNumberDecimal(expectedDecimalDigit);
        final Integer expectedTypeOfNumberInteger = 3;
        vendorCheck.setTypeOfNumberInteger(expectedTypeOfNumberInteger);
        vendorCheck.setTypeOfClob("test");
        vendorCheckBhv.insert(vendorCheck);

        final String path = VendorCheckBhv.PATH_various_vendorcheck_selectSimpleVendorCheck;
        final Class<SimpleVendorCheck> entityType = SimpleVendorCheck.class;

        // ## Act ##
        final SimpleVendorCheck entity = vendorCheckBhv.outsideSql().entityHandling()
                .selectEntityWithDeletedCheck(path, null, entityType);

        // ## Assert ##
        final BigDecimal actualDecimalDigit = entity.getTypeOfNumberDecimal();
        final Integer actualTypeOfNumberInteger = entity.getTypeOfNumberInteger();
        log("Selected decimalDigit is " + actualDecimalDigit);
        log("Selected integerNonDigit is " + actualTypeOfNumberInteger);
        assertNotNull(actualDecimalDigit);
        assertEquals(expectedDecimalDigit, actualDecimalDigit);
        assertEquals(expectedTypeOfNumberInteger, actualTypeOfNumberInteger);
    }

    public void test_Sql2Entity_IntegerSum() throws Exception {
        // ## Arrange ##
        registerSimpleTestData();

        final String path = VendorCheckBhv.PATH_various_vendorcheck_selectVendorCheckIntegerSum;
        final Class<VendorCheckIntegerSum> entityType = VendorCheckIntegerSum.class;

        // ## Act ##
        final VendorCheckIntegerSum sum = vendorCheckBhv.outsideSql().entityHandling()
                .selectEntityWithDeletedCheck(path, null, entityType);

        // ## Assert ##
        assertNotNull(sum);
        log("sum.getTypeOfNumberIntegerSum()=" + sum.getIntegerNonDigitSum());
        assertNotNull(sum.getIntegerNonDigitSum());
        BigDecimal actual = sum.getIntegerNonDigitSum();
        assertEquals(new BigDecimal("12"), actual);
    }

    public void test_Sql2Entity_DecimalSum() throws Exception {
        // ## Arrange ##
        registerSimpleTestData();

        final String path = VendorCheckBhv.PATH_various_vendorcheck_selectVendorCheckDecimalSum;
        final Class<VendorCheckDecimalSum> entityType = VendorCheckDecimalSum.class;

        // ## Act ##
        final VendorCheckDecimalSum sum = vendorCheckBhv.outsideSql().entityHandling()
                .selectEntityWithDeletedCheck(path, null, entityType);

        // ## Assert ##
        assertNotNull(sum);
        log("sum.getDecimalDigitSum()=" + sum.getDecimalDigitSum());
        assertNotNull(sum.getDecimalDigitSum());

        BigDecimal actual = sum.getDecimalDigitSum();
        assertEquals(new BigDecimal("70.701"), actual);
    }

    public void test_Sql2Entity_DecimalSum_byDirectType() throws Exception {
        // ## Arrange ##
        registerSimpleTestData();

        final String path = VendorCheckBhv.PATH_various_vendorcheck_selectVendorCheckDecimalSum;
        final Class<BigDecimal> entityType = BigDecimal.class;

        // ## Act ##
        final BigDecimal sum = vendorCheckBhv.outsideSql().entityHandling()
                .selectEntityWithDeletedCheck(path, null, entityType);

        // ## Assert ##
        assertNotNull(sum);
        log("sum=" + sum);
        assertEquals(new BigDecimal("70.701"), sum);
    }

    public void test_OracleDateColumn() throws Exception {
        Class<?> type = VendorCheckDbm.getInstance().columnTypeOfDate().getPropertyAccessType();
        assertEquals(Date.class, type);
    }

    protected void deleteAll() {
        vendorCheckBhv.varyingQueryDelete(new VendorCheckCB(), new DeleteOption<VendorCheckCB>().allowNonQueryDelete());
    }

    protected void registerSimpleTestData() {
        deleteAll();
        {
            final VendorCheck vendorCheck = new VendorCheck();
            vendorCheck.setVendorCheckId(99991L);
            vendorCheck.setTypeOfNumberDecimal(new BigDecimal("12.345"));
            vendorCheck.setTypeOfNumberInteger(3);
            vendorCheck.setTypeOfClob("test1");
            vendorCheckBhv.insert(vendorCheck);
        }
        {
            final VendorCheck vendorCheck = new VendorCheck();
            vendorCheck.setVendorCheckId(99992L);
            vendorCheck.setTypeOfNumberDecimal(new BigDecimal("23.567"));
            vendorCheck.setTypeOfNumberInteger(4);
            vendorCheck.setTypeOfClob("test2");
            vendorCheckBhv.insert(vendorCheck);
        }
        {
            final VendorCheck vendorCheck = new VendorCheck();
            vendorCheck.setVendorCheckId(99993L);
            vendorCheck.setTypeOfNumberDecimal(new BigDecimal("34.789"));
            vendorCheck.setTypeOfNumberInteger(5);
            vendorCheck.setTypeOfClob("test3");
            vendorCheckBhv.insert(vendorCheck);
        }
    }

    public void test_PreparedStatement_with_DifferenceType() throws Exception {
        // ## Arrange ##
        registerDigitTestData();

        final String sql = "select * from VENDOR_CHECK where TYPE_OF_NUMBER_DECIMAL > ?";
        final Connection conn = dataSource.getConnection();
        final PreparedStatement ps = conn.prepareStatement(sql);

        // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
        // DECIMAL_DIGIT is BigDecimal but it uses setString() of PreparedStatement!
        // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
        ps.setString(1, "2");
        // ps.setBigDecimal(1 ,new BigDecimal("1"));

        // ## Act ##
        log(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            String id = rs.getString("VENDOR_CHECK_ID");
            String digit = rs.getString("TYPE_OF_NUMBER_DECIMAL");
            log("VENDOR_CHECK_ID=" + id + ", TYPE_OF_NUMBER_DECIMAL=" + digit);
        }
    }

    protected void registerDigitTestData() {
        deleteAll();
        {
            VendorCheck vendorCheck = new VendorCheck();
            vendorCheck.setVendorCheckId(999L);
            vendorCheck.setTypeOfNumberDecimal(new BigDecimal(1));
            vendorCheck.setTypeOfNumberInteger(2);
            vendorCheck.setTypeOfDate(new Date());
            vendorCheckBhv.insert(vendorCheck);
        }
        {
            VendorCheck vendorCheck = new VendorCheck();
            vendorCheck.setVendorCheckId(9999L);
            vendorCheck.setTypeOfNumberDecimal(new BigDecimal(3));
            vendorCheck.setTypeOfNumberInteger(22);
            vendorCheck.setTypeOfDate(new Date());
            vendorCheckBhv.insert(vendorCheck);
        }
    }

    public void test_Timestamp_Millisecond() throws Exception {
        // ## Arrange ##
        PurchaseCB cb = new PurchaseCB();

        // ## Act ##
        ListResultBean<Purchase> purchaseList = purchaseBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(purchaseList);
        boolean exists = false;
        for (Purchase purchase : purchaseList) {
            Timestamp purchaseDatetime = purchase.getPurchaseDatetime();
            log(purchase.getProductId(), purchaseDatetime);
            Integer millis = toInteger(toString(purchaseDatetime, "SSS"));
            if (millis > 0) {
                exists = true;
            }
        }
        assertTrue(exists);
    }

    // -----------------------------------------------------
    //                                                BINARY
    //                                                ------
    public void test_BINARY_FLOAT_insert_select() {
        // ## Arrange ##
        VendorCheck vendorCheck = new VendorCheck();
        vendorCheck.setVendorCheckId(99999L);
        vendorCheck.setTypeOfBinaryFloat("123.45");

        // ## Act ##
        vendorCheckBhv.insert(vendorCheck);

        // ## Assert ##
        VendorCheckCB cb = new VendorCheckCB();
        cb.query().setVendorCheckId_Equal(99999L);
        VendorCheck actual = vendorCheckBhv.selectEntityWithDeletedCheck(cb);
        assertEquals(vendorCheck.getTypeOfBinaryFloat(), actual.getTypeOfBinaryFloat());
    }

    public void test_BINARY_DOUBLE_insert_select() {
        // ## Arrange ##
        VendorCheck vendorCheck = new VendorCheck();
        vendorCheck.setVendorCheckId(99999L);
        vendorCheck.setTypeOfBinaryDouble("123.45");

        // ## Act ##
        vendorCheckBhv.insert(vendorCheck);

        // ## Assert ##
        VendorCheckCB cb = new VendorCheckCB();
        cb.query().setVendorCheckId_Equal(99999L);
        VendorCheck actual = vendorCheckBhv.selectEntityWithDeletedCheck(cb);
        assertEquals("123.45", actual.getTypeOfBinaryDouble());
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
        member.setMemberId(3L);
        member.setBirthdate(new Date(cal.getTimeInMillis()));
        memberBhv.updateNonstrict(member);

        // ## Act ##
        cal.set(2008, 5, 15, 12, 34, 57); // plus one second
        {
            MemberCB cb = new MemberCB();
            cb.query().setMemberId_Equal(3L);
            cb.query().setBirthdate_GreaterEqual(new Date(cal.getTimeInMillis()));
            log("***: " + cb.query().getBirthdate().getFixedQuery().get("greaterEqual"));
            try {
                memberBhv.selectEntityWithDeletedCheck(cb);
                // ## Assert ##
                fail();
            } catch (EntityAlreadyDeletedException e) {
                // OK
                // Because Oracle Date type have time parts. 
            }
        }
        {
            MemberCB cb = new MemberCB();
            cb.query().setMemberId_Equal(3L);
            cb.query().setBirthdate_GreaterEqual(new java.sql.Date(cal.getTimeInMillis()));
            try {
                memberBhv.selectEntityWithDeletedCheck(cb);
                // ## Assert ##
                fail();
            } catch (EntityAlreadyDeletedException e) {
                // OK
                // Because java.sql.Date is converted to java.util.Date in ConditionBean. 
            }
        }
        {
            MemberCB cb = new MemberCB();
            cb.query().setMemberId_Equal(3L);
            cb.query().setBirthdate_GreaterEqual(new Timestamp(cal.getTimeInMillis()));
            try {
                memberBhv.selectEntityWithDeletedCheck(cb);
                // ## Assert ##
                fail();
            } catch (EntityAlreadyDeletedException e) {
                // OK
                // Because Oracle Date type have time parts. 
            }
        }
        cal.set(2008, 5, 15, 12, 34, 56); // just time
        cal.set(Calendar.MILLISECOND, 0); // Don't format!
        {
            MemberCB cb = new MemberCB();
            cb.query().setMemberId_Equal(3L);
            cb.query().setBirthdate_GreaterEqual(new Date(cal.getTimeInMillis()));

            // ## Act ##
            Member actual = memberBhv.selectEntityWithDeletedCheck(cb);

            // ## Assert ##
            Date actualValue = actual.getBirthdate();
            String formatted = DfTypeUtil.toString(actualValue, "yyyy/MM/dd HH:mm:ss.SSS");
            log("actualValue = " + formatted);
            assertEquals("2008/06/15 12:34:56.000", formatted);
        }
        {
            MemberCB cb = new MemberCB();
            cb.query().setMemberId_Equal(3L);
            cb.query().setBirthdate_GreaterEqual(new java.sql.Date(cal.getTimeInMillis()));

            // ## Act ##
            Member actual = memberBhv.selectEntityWithDeletedCheck(cb);

            // ## Assert ##
            Date actualValue = actual.getBirthdate();
            String formatted = DfTypeUtil.toString(actualValue, "yyyy/MM/dd HH:mm:ss.SSS");
            log("actualValue = " + formatted);
            assertEquals("2008/06/15 12:34:56.000", formatted);
        }
        {
            MemberCB cb = new MemberCB();
            cb.query().setMemberId_Equal(3L);
            cb.query().setBirthdate_GreaterEqual(new java.sql.Timestamp(cal.getTimeInMillis()));

            // ## Act ##
            Member actual = memberBhv.selectEntityWithDeletedCheck(cb);

            // ## Assert ##
            Date actualValue = actual.getBirthdate();
            String formatted = DfTypeUtil.toString(actualValue, "yyyy/MM/dd HH:mm:ss.SSS");
            log("actualValue = " + formatted);
            assertEquals("2008/06/15 12:34:56.000", formatted);
        }
    }

    public void test_DATE_HHmmss_outsideSql() throws Exception {
        // ## Arrange ##
        Calendar cal = Calendar.getInstance();
        cal.set(9001, 5, 15, 0, 0, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Member member = new Member();
        member.setMemberId(3L);
        member.setBirthdate(new Date(cal.getTimeInMillis()));
        memberBhv.updateNonstrict(member);

        String path = MemberBhv.PATH_various_pmbcheck_selectCompareDate;

        CompareDatePmb pmb = new CompareDatePmb();
        pmb.setMemberId(3L);
        cal.set(9001, 5, 15, 12, 34, 56);
        pmb.setBirthdateFrom(new Date(cal.getTimeInMillis()));

        Class<Member> entityType = Member.class;

        // ## Act ##
        try {
            memberBhv.outsideSql().entityHandling().selectEntityWithDeletedCheck(path, pmb, entityType);

            // ## Assert ##
            fail();
        } catch (EntityAlreadyDeletedException e) {
            // OK
            // Because Oracle Date type have time parts. 
        }
        cal.set(9001, 5, 15, 0, 0, 0); // just time
        {
            pmb.setBirthdateFrom(new Date(cal.getTimeInMillis()));

            // ## Act ##
            Member actual = memberBhv.outsideSql().entityHandling().selectEntityWithDeletedCheck(path, pmb, entityType);

            // ## Assert ##
            Date actualValue = actual.getBirthdate();
            String formatted = DfTypeUtil.toString(actualValue, "yyyy/MM/dd HH:mm:ss.SSS");
            log("actualValue = " + formatted);
            assertEquals("9001/06/15 00:00:00.000", formatted);
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
        member.setMemberId(3L);
        member.setBirthdate(new Date(cal.getTimeInMillis()));
        memberBhv.updateNonstrict(member);

        String path = MemberBhv.PATH_various_pmbcheck_selectCompareDate;

        CompareDatePmb pmb = new CompareDatePmb();
        pmb.setMemberId(3L);
        cal.set(9001, 5, 15, 23, 45, 57);
        pmb.setBirthdateFrom(new java.sql.Date(cal.getTimeInMillis()));

        Class<Member> entityType = Member.class;

        // ## Act ##
        try {
            memberBhv.outsideSql().entityHandling().selectEntityWithDeletedCheck(path, pmb, entityType);

            // ## Assert ##
            fail();
        } catch (EntityAlreadyDeletedException e) {
            // OK
            // Because Oracle Date type have time parts. 
        }
        cal.set(9001, 5, 15, 12, 34, 56); // just time
        {
            pmb.setBirthdateFrom(new Date(cal.getTimeInMillis()));

            // ## Act ##
            Member actual = memberBhv.outsideSql().entityHandling().selectEntityWithDeletedCheck(path, pmb, entityType);

            // ## Assert ##
            Date actualValue = actual.getBirthdate();
            String formatted = DfTypeUtil.toString(actualValue, "yyyy/MM/dd HH:mm:ss.SSS");
            log("actualValue = " + formatted);
            assertEquals("9001/06/15 12:34:56.000", formatted);
        }
    }

    // -----------------------------------------------------
    //                                           Oracle Date
    //                                           -----------
    public void test_Oracle_Date_HHmmss() { // *Important!
        // ## Arrange ##
        Calendar cal = Calendar.getInstance();
        cal.set(2008, 5, 15, 12, 34, 56);
        cal.set(Calendar.MILLISECOND, 123);
        Member member = new Member();
        member.setMemberId(3L);
        member.setBirthdate(new Date(cal.getTimeInMillis()));
        memberBhv.updateNonstrict(member);

        // ## Act ##
        cal.set(2008, 5, 15, 12, 34, 57);
        {
            MemberCB cb = new MemberCB();
            cb.query().setMemberId_Equal(3L);
            cb.query().setBirthdate_LessThan(new Date(cal.getTimeInMillis()));
            Member actual = memberBhv.selectEntityWithDeletedCheck(cb);

            // ## Assert ##
            Date actualValue = actual.getBirthdate();
            String formatted = DfTypeUtil.toString(actualValue, "yyyy/MM/dd HH:mm:ss.SSS");
            log("actualValue = " + formatted);
            assertEquals("2008/06/15 12:34:56.000", formatted);
        }
        {
            MemberCB cb = new MemberCB();
            cb.query().setMemberId_Equal(3L);
            cb.query().setBirthdate_LessThan(new Timestamp(cal.getTimeInMillis()));
            Member actual = memberBhv.selectEntityWithDeletedCheck(cb);

            // ## Assert ##
            Date actualValue = actual.getBirthdate();
            String formatted = DfTypeUtil.toString(actualValue, "yyyy/MM/dd HH:mm:ss.SSS");
            log("actualValue = " + formatted);
            assertEquals("2008/06/15 12:34:56.000", formatted);
        }
    }

    public void test_Oracle_Timestamp_FromToByDate_HHmmss() {
        // ## Arrange ##
        final VendorCheck vendorCheck = new VendorCheck();
        vendorCheck.setVendorCheckId(99999L);
        vendorCheck.setTypeOfNumberDecimal(new BigDecimal("12.345"));
        vendorCheck.setTypeOfNumberInteger(3);
        vendorCheck.setTypeOfClob("test1");
        Calendar cal = Calendar.getInstance();
        cal.set(2008, 5, 15, 12, 34, 56);
        cal.set(Calendar.MILLISECOND, 123);
        vendorCheck.setTypeOfTimestamp(new Timestamp(cal.getTimeInMillis()));
        vendorCheckBhv.insert(vendorCheck);

        // ## Act ##
        VendorCheckCB cb = new VendorCheckCB();
        cb.query().setVendorCheckId_Equal(99999L);
        cal.set(2008, 5, 15, 12, 34, 55);
        Date fromDate = new Date(cal.getTimeInMillis());
        cal.set(2008, 5, 15, 12, 34, 57);
        Date toDate = new Date(cal.getTimeInMillis());
        cb.query().setTypeOfTimestamp_FromTo(fromDate, toDate, new FromToOption().greaterThan().lessThan());
        VendorCheck actual = vendorCheckBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        String formatted = DfTypeUtil.toString(actual.getTypeOfTimestamp(), "yyyy/MM/dd HH:mm:ss.SSS");
        log("actualValue = " + formatted);
        assertEquals("2008/06/15 12:34:56.123", formatted);
    }

    public void test_Oracle_Date_GreaterEqual() { // *Important!
        // ## Arrange ##
        Calendar cal = Calendar.getInstance();
        cal.set(2008, 5, 15, 12, 34, 56);
        Member member = new Member();
        member.setMemberId(3L);
        member.setBirthdate(new Date(cal.getTimeInMillis()));
        memberBhv.updateNonstrict(member);

        // ## Act ##
        cal.set(2008, 5, 15, 12, 34, 56);
        cal.set(Calendar.MILLISECOND, 0); // *Required!
        {
            MemberCB cb = new MemberCB();
            cb.query().setMemberId_Equal(3L);
            cb.query().setBirthdate_GreaterEqual(new Date(cal.getTimeInMillis()));
            memberBhv.selectEntityWithDeletedCheck(cb);
        }
        {
            MemberCB cb = new MemberCB();
            cb.query().setMemberId_Equal(3L);
            cb.query().setBirthdate_GreaterEqual(new Timestamp(cal.getTimeInMillis()));
            memberBhv.selectEntityWithDeletedCheck(cb);
        }
    }

    public void test_pmbcheck_selectCompareDate_Date() throws Exception {
        // ## Arrange ##
        Calendar cal = Calendar.getInstance();
        cal.set(9001, 5, 15, 12, 34, 56);
        Member member = new Member();
        member.setMemberId(3L);
        member.setBirthdate(new Date(cal.getTimeInMillis()));
        memberBhv.updateNonstrict(member);

        String path = MemberBhv.PATH_various_pmbcheck_selectCompareDate;

        CompareDatePmb pmb = new CompareDatePmb();
        pmb.setMemberId(3L);
        cal.set(9001, 5, 15, 12, 34, 56);
        cal.set(Calendar.MILLISECOND, 0); // *Required!
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

    // -----------------------------------------------------
    //                                              INTERVAL
    //                                              --------
    public void test_INTERVAL_YEAR_TO_MONTH_insert_select() {
        // ## Arrange ##
        VendorCheck vendorCheck = new VendorCheck();
        vendorCheck.setVendorCheckId(99999L);
        vendorCheck.setTypeOfIntervalYearToMonth("32-10");

        // ## Act ##
        vendorCheckBhv.insert(vendorCheck);

        // ## Assert ##
        VendorCheckCB cb = new VendorCheckCB();
        cb.query().setVendorCheckId_Equal(99999L);
        VendorCheck actual = vendorCheckBhv.selectEntityWithDeletedCheck(cb);
        assertEquals("32-10", actual.getTypeOfIntervalYearToMonth());
    }

    public void test_INTERVAL_DAY_TO_SECOND_insert_select() {
        // ## Arrange ##
        VendorCheck vendorCheck = new VendorCheck();
        vendorCheck.setVendorCheckId(99999L);
        vendorCheck.setTypeOfIntervalDayToSecond("1 0:0:1.0");

        // ## Act ##
        vendorCheckBhv.insert(vendorCheck);

        // ## Assert ##
        VendorCheckCB cb = new VendorCheckCB();
        cb.query().setVendorCheckId_Equal(99999L);
        VendorCheck actual = vendorCheckBhv.selectEntityWithDeletedCheck(cb);
        assertEquals("1 0:0:1.0", actual.getTypeOfIntervalDayToSecond());
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
        Member member = memberBhv.selectByPKValue(3L);
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
    public void test_ROWID_insert_select() {
        // ## Arrange ##
        VendorCheck vendorCheck = new VendorCheck();
        vendorCheck.setVendorCheckId(99999L);
        vendorCheck.setTypeOfRowid("123456789012345678");

        // ## Act ##
        try {
            vendorCheckBhv.insert(vendorCheck);

            // ## Assert ##
            fail("Now unsupported");
        } catch (SQLFailureException e) {
            // OK
            log(e.getMessage());
        }
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
