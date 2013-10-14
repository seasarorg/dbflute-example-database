package com.example.dbflute.db2.dbflute.topic;

import com.example.dbflute.db2.dbflute.cbean.VendorCheckCB;
import com.example.dbflute.db2.dbflute.exbhv.VendorCheckBhv;
import com.example.dbflute.db2.unit.UnitContainerTestCase;

/**
 * The test of the property 'isAvailableDatabaseDependency' in 'littleAdjustmentMap.dfprop'.
 * @author jflute
 * @since 0.9.5 (2009/04/30 Thursday)
 */
public class DatabaseDependencyTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private VendorCheckBhv vendorCheckBhv;

    // ===================================================================================
    //                                                                     Isolation Level
    //                                                                     ===============
    // It it necessary to set property 'isAvailableDatabaseDependency = true'.
    /**
     * @since 0.7.9
     */
    public void test_lockWithRR() {
        // ## Arrange ##
        VendorCheckCB cb = new VendorCheckCB();
        cb.lockWithRR();

        // ## Act ##
        vendorCheckBhv.selectList(cb);// Expect no exception!

        // ## Assert ##
        assertTrue(cb.toDisplaySql().contains("with RR"));
    }

    /**
     * @since 0.7.9
     */
    public void test_lockWithRS() {
        // ## Arrange ##
        VendorCheckCB cb = new VendorCheckCB();
        cb.lockWithRS();

        // ## Act ##
        vendorCheckBhv.selectList(cb);// Expect no exception!

        // ## Assert ##
        assertTrue(cb.toDisplaySql().contains("with RS"));
    }

    /**
     * @since 0.7.9
     */
    public void test_lockWithCS() {
        // ## Arrange ##
        VendorCheckCB cb = new VendorCheckCB();
        cb.lockWithCS();

        // ## Act ##
        vendorCheckBhv.selectList(cb);// Expect no exception!

        // ## Assert ##
        assertTrue(cb.toDisplaySql().contains("with CS"));
    }

    /**
     * @since 0.7.9
     */
    public void test_lockWithUR() {
        // ## Arrange ##
        VendorCheckCB cb = new VendorCheckCB();
        cb.lockWithUR();

        // ## Act ##
        vendorCheckBhv.selectList(cb);// Expect no exception!

        // ## Assert ##
        assertTrue(cb.toDisplaySql().contains("with UR"));
    }

    // This method is valid without the property 'torque.isAvailableDatabaseDependency = true'
    public void test_lockForUpdate() {
        // ## Arrange ##
        VendorCheckCB cb = new VendorCheckCB();
        cb.lockForUpdate();

        // ## Act ##
        vendorCheckBhv.selectList(cb);// Expect no exception!

        // ## Assert ##
        assertTrue(cb.toDisplaySql().contains("for update with RS"));
    }
}
