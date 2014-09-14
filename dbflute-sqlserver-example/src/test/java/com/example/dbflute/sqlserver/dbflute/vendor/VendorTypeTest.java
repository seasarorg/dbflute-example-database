package com.example.dbflute.sqlserver.dbflute.vendor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.UUID;

import org.seasar.dbflute.bhv.DeleteOption;
import org.seasar.dbflute.exception.EntityAlreadyDeletedException;
import org.seasar.dbflute.util.DfTypeUtil;

import com.example.dbflute.sqlserver.dbflute.cbean.VendorCheckCB;
import com.example.dbflute.sqlserver.dbflute.exbhv.MemberBhv;
import com.example.dbflute.sqlserver.dbflute.exbhv.VendorCheckBhv;
import com.example.dbflute.sqlserver.dbflute.exentity.Member;
import com.example.dbflute.sqlserver.dbflute.exentity.VendorCheck;
import com.example.dbflute.sqlserver.dbflute.exentity.customize.VendorCheckDecimalSum;
import com.example.dbflute.sqlserver.dbflute.exentity.customize.VendorCheckIntegerSum;
import com.example.dbflute.sqlserver.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.6.1 (2008/01/23 Wednesday)
 */
public class VendorTypeTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private MemberBhv memberBhv;
    private VendorCheckBhv vendorCheckBhv;

    // ===================================================================================
    //                                                                         Number Type
    //                                                                         ===========

    // ===================================================================================
    //                                                                           Date Type
    //                                                                           =========
    public void test_typeHadling_datetime_millisecondMagic() throws Exception {
        // ## Arrange ##
        Timestamp datetimeNonMillis = DfTypeUtil.toTimestamp("2009/12/24 00:00:00.000");
        Timestamp datetimeFullMillis = DfTypeUtil.toTimestamp("2009/12/23 23:59:59.999");
        VendorCheck vendorCheck = new VendorCheck();
        vendorCheck.setVendorCheckId(99999L);
        vendorCheck.setTypeOfDatetime(datetimeNonMillis);

        // ## Act ##
        vendorCheckBhv.insert(vendorCheck);

        // ## Assert ##
        VendorCheckCB cb = new VendorCheckCB();
        cb.query().setVendorCheckId_Equal(99999L);
        cb.query().setTypeOfDatetime_LessEqual(datetimeFullMillis);
        try {
            vendorCheckBhv.selectEntityWithDeletedCheck(cb);
            fail();
        } catch (EntityAlreadyDeletedException e) {
            log(e.getMessage());
        }
        // changed by new JDBC driveer
        // becomes '2009/12/24 00:00:00.000' by SQLServer
        //VendorCheck actual = vendorCheckBhv.selectEntityWithDeletedCheck(cb);
        //assertEquals(datetimeNonMillis, actual.getTypeOfDatetime());
    }

    // ===================================================================================
    //                                                                        Boolean Type
    //                                                                        ============
    // -----------------------------------------------------
    //                                                   BIT
    //                                                   ---
    public void test_BIT_insert_select() throws Exception {
        // ## Arrange ##
        boolean expected = true;
        DeleteOption<VendorCheckCB> option = new DeleteOption<VendorCheckCB>().allowNonQueryDelete();
        vendorCheckBhv.varyingQueryDelete(new VendorCheckCB(), option);
        VendorCheck vendorCheck = new VendorCheck();
        vendorCheck.setVendorCheckId(99999L);
        vendorCheck.setTypeOfBit(expected);

        // ## Act ##
        vendorCheckBhv.insert(vendorCheck);
        VendorCheckCB cb = new VendorCheckCB();
        cb.query().setTypeOfBit_Equal(expected);
        VendorCheck selected = vendorCheckBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        assertEquals(expected, selected.getTypeOfBit().booleanValue());
    }

    // ===================================================================================
    //                                                                         Binary Type
    //                                                                         ===========
    // -----------------------------------------------------
    //                                                BINARY
    //                                                ------
    public void test_BINARY_insert_select() {
        // ## Arrange ##
        String expected = "foo";
        Member member = memberBhv.selectByPKValue(3);
        member.setMemberName(expected);
        VendorCheck vendorCheck = createVendorCheck();
        vendorCheck.setTypeOfBinary(serialize(member));

        // ## Act ##
        vendorCheckBhv.insert(vendorCheck);
        VendorCheckCB cb = new VendorCheckCB();
        cb.query().setVendorCheckId_Equal(vendorCheck.getVendorCheckId());
        VendorCheck selected = vendorCheckBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        byte[] bytes = selected.getTypeOfBinary();
        assertNotNull(bytes);
        Member deserialized = (Member) deserialize(bytes);
        log("deserialized=" + deserialized);
        assertEquals(expected, deserialized.getMemberName());
    }

    public void test_VARBINARY_insert_select() {
        // ## Arrange ##
        String expected = "foo";
        Member member = memberBhv.selectByPKValue(3);
        member.setMemberName(expected);
        VendorCheck vendorCheck = createVendorCheck();
        vendorCheck.setTypeOfVarbinary(serialize(member));

        // ## Act ##
        vendorCheckBhv.insert(vendorCheck);
        VendorCheckCB cb = new VendorCheckCB();
        cb.query().setVendorCheckId_Equal(vendorCheck.getVendorCheckId());
        VendorCheck selected = vendorCheckBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        byte[] bytes = selected.getTypeOfVarbinary();
        assertNotNull(bytes);
        Member deserialized = (Member) deserialize(bytes);
        log("deserialized=" + deserialized);
        assertEquals(expected, deserialized.getMemberName());
    }

    // ===================================================================================
    //                                                                        Various Type
    //                                                                        ============
    // -----------------------------------------------------
    //                                                  UUID
    //                                                  ----
    public void test_UniqueIdentifier_insert_select() throws Exception {
        // ## Arrange ##
        UUID expected = UUID.fromString("FD8C7155-3A0A-DB11-BAC4-0011F5099158");
        VendorCheck vendorCheck = createVendorCheck();
        vendorCheck.setTypeOfUniqueidentifier(expected);

        // ## Act ##
        vendorCheckBhv.insert(vendorCheck);
        VendorCheckCB cb = new VendorCheckCB();
        cb.query().setTypeOfUniqueidentifier_Equal(expected);
        VendorCheck selected = vendorCheckBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        assertEquals(expected, selected.getTypeOfUniqueidentifier());
    }

    // -----------------------------------------------------
    //                                                   XML
    //                                                   ---
    public void test_XML_insert_select() {
        // ## Arrange ##
        String expected = "<foo/>";
        VendorCheck vendorCheck = createVendorCheck();
        vendorCheck.setTypeOfXml(expected);

        // ## Act ##
        vendorCheckBhv.insert(vendorCheck);
        VendorCheckCB cb = new VendorCheckCB();
        cb.query().setVendorCheckId_Equal(vendorCheck.getVendorCheckId());
        VendorCheck selected = vendorCheckBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        String actual = selected.getTypeOfXml();
        assertNotNull(actual);
        log("actual=" + actual);
        assertEquals(expected, actual);
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
