package com.example.dbflute.oracle.dbflute.vendor;

import com.example.dbflute.oracle.dbflute.cbean.Vendor$DollarCB;
import com.example.dbflute.oracle.dbflute.cbean.VendorLargeName901234567890CB;
import com.example.dbflute.oracle.dbflute.cbean.VendorLargeName90123456RefCB;
import com.example.dbflute.oracle.dbflute.exbhv.Vendor$DollarBhv;
import com.example.dbflute.oracle.dbflute.exbhv.VendorLargeName901234567890Bhv;
import com.example.dbflute.oracle.dbflute.exbhv.VendorLargeName90123456RefBhv;
import com.example.dbflute.oracle.dbflute.exentity.Vendor$Dollar;
import com.example.dbflute.oracle.dbflute.exentity.VendorLargeName901234567890;
import com.example.dbflute.oracle.dbflute.exentity.VendorLargeName90123456Ref;
import com.example.dbflute.oracle.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.7.2 (2010/06/14 Monday)
 */
public class VendorNameTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private VendorLargeName901234567890Bhv vendorLargeName901234567890Bhv;
    private VendorLargeName90123456RefBhv vendorLargeName90123456RefBhv;
    private Vendor$DollarBhv vendor$DollarBhv;

    // ===================================================================================
    //                                                                          Large Name
    //                                                                          ==========
    public void test_LargeName_insert_select() throws Exception {
        // ## Arrange ##
        VendorLargeName901234567890 large = new VendorLargeName901234567890();
        large.setVendorLargeName901234567Id(99999L);
        large.setVendorLargeName9012345Name("Pixy");
        vendorLargeName901234567890Bhv.insert(large);
        VendorLargeName901234567890CB cb = new VendorLargeName901234567890CB();
        cb.query().setVendorLargeName901234567Id_Equal(large.getVendorLargeName901234567Id());

        // ## Act ##
        VendorLargeName901234567890 actual = vendorLargeName901234567890Bhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        assertNotNull(actual);
        assertEquals("Pixy", actual.getVendorLargeName9012345Name());
    }

    public void test_LargeName_setupSelect() throws Exception {
        // ## Arrange ##
        VendorLargeName901234567890 large = new VendorLargeName901234567890();
        large.setVendorLargeName901234567Id(99999L);
        large.setVendorLargeName9012345Name("Pixy");
        vendorLargeName901234567890Bhv.insert(large);
        VendorLargeName90123456Ref ref = new VendorLargeName90123456Ref();
        ref.setVendorLargeName90123RefId(88888L);
        ref.setVendorLargeName901RefName("Genius");
        ref.setVendorLargeName901234567Id(large.getVendorLargeName901234567Id());
        vendorLargeName90123456RefBhv.insert(ref);
        VendorLargeName90123456RefCB cb = new VendorLargeName90123456RefCB();
        cb.setupSelect_VendorLargeName901234567890();
        cb.query().setVendorLargeName901234567Id_Equal(large.getVendorLargeName901234567Id());

        // ## Act ##
        VendorLargeName90123456Ref actual = vendorLargeName90123456RefBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        assertNotNull(actual);
        assertNotNull(actual.getVendorLargeName901234567890());
        assertEquals("Pixy", actual.getVendorLargeName901234567890().getVendorLargeName9012345Name());
        assertEquals("Genius", actual.getVendorLargeName901RefName());
    }

    // ===================================================================================
    //                                                                              Dollar
    //                                                                              ======
    public void test_Dollar_insert_select() throws Exception {
        // ## Arrange ##
        Vendor$Dollar dollar = new Vendor$Dollar();
        dollar.setVendor$DollarId(99999L);
        dollar.setVendor$DollarName("Pixy");
        vendor$DollarBhv.insert(dollar);
        Vendor$DollarCB cb = new Vendor$DollarCB();
        cb.query().setVendor$DollarId_Equal(dollar.getVendor$DollarId());

        // ## Act ##
        Vendor$Dollar actual = vendor$DollarBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        assertNotNull(actual);
        assertEquals("Pixy", actual.getVendor$DollarName());
    }
}