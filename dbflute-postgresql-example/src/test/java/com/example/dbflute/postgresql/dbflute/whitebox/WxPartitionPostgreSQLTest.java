package com.example.dbflute.postgresql.dbflute.whitebox;

import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.dbflute.exception.SQLFailureException;

import com.example.dbflute.postgresql.dbflute.cbean.VendorPartManHighCB;
import com.example.dbflute.postgresql.dbflute.exbhv.VendorPartManBhv;
import com.example.dbflute.postgresql.dbflute.exbhv.VendorPartManHighBhv;
import com.example.dbflute.postgresql.dbflute.exentity.VendorPartMan;
import com.example.dbflute.postgresql.dbflute.exentity.VendorPartManHigh;
import com.example.dbflute.postgresql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 1.0.5K (2014/07/30 Wednesday)
 */
public class WxPartitionPostgreSQLTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private VendorPartManBhv vendorPartManBhv;
    private VendorPartManHighBhv vendorPartManHighBhv;

    // ===================================================================================
    //                                                                              Insert
    //                                                                              ======
    public void test_insert_sync() throws Exception {
        // ## Arrange ##
        assertEquals(0, vendorPartManHighBhv.selectCount(new VendorPartManHighCB()));
        VendorPartMan partMan = new VendorPartMan();
        partMan.setPartManId(1);
        partMan.setPartManName("sea");
        partMan.setPartManPoint(71);
        partMan.setPartManDate(currentDate());

        // ## Act ##
        vendorPartManBhv.insert(partMan);

        // ## Assert ##
        VendorPartManHighCB highCB = new VendorPartManHighCB();
        ListResultBean<VendorPartManHigh> highList = vendorPartManHighBhv.selectList(highCB);
        assertHasOnlyOneElement(highList);
        for (VendorPartManHigh high : highList) {
            log(high);
            assertEquals("sea", high.getPartManName());
        }
    }

    public void test_insert_violate_constraint() throws Exception {
        // ## Arrange ##
        assertEquals(0, vendorPartManHighBhv.selectCount(new VendorPartManHighCB()));
        VendorPartMan partMan = new VendorPartMan();
        partMan.setPartManId(1);
        partMan.setPartManName("sea");
        partMan.setPartManPoint(40);
        partMan.setPartManDate(currentDate());

        // ## Act ##
        try {
            vendorPartManBhv.insert(partMan);
            // ## Assert ##
            fail();
        } catch (SQLFailureException e) {
            String msg = e.getMessage();
            log(msg);
            assertTrue(msg.contains("violates check constraint"));
        }
    }

    // ===================================================================================
    //                                                                              Update
    //                                                                              ======
    public void test_update_sync() throws Exception {
        // ## Arrange ##
        assertEquals(0, vendorPartManHighBhv.selectCount(new VendorPartManHighCB()));
        VendorPartMan partMan = new VendorPartMan();
        partMan.setPartManId(1);
        partMan.setPartManName("sea");
        partMan.setPartManPoint(71);
        partMan.setPartManDate(currentDate());
        vendorPartManBhv.insert(partMan);
        partMan.setPartManName("land");

        // ## Act ##
        vendorPartManBhv.update(partMan);

        // ## Assert ##
        VendorPartManHighCB highCB = new VendorPartManHighCB();
        ListResultBean<VendorPartManHigh> highList = vendorPartManHighBhv.selectList(highCB);
        assertHasOnlyOneElement(highList);
        for (VendorPartManHigh high : highList) {
            log(high);
            assertEquals("land", high.getPartManName());
        }
    }
}
