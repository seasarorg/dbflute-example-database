package com.example.dbflute.mysql.dbflute.whitebox;

import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.dbflute.exception.EntityAlreadyDeletedException;
import org.seasar.dbflute.exception.EntityDuplicatedException;

import com.example.dbflute.mysql.dbflute.cbean.VendorLargeDataRefCB;
import com.example.dbflute.mysql.dbflute.exbhv.VendorLargeDataRefBhv;
import com.example.dbflute.mysql.dbflute.exentity.VendorLargeDataRef;
import com.example.dbflute.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 1.1.0 (2014/11/11 Tuesday)
 */
public class WxEntitySelectMySQLTest extends UnitContainerTestCase {

    private VendorLargeDataRefBhv vendorLargeDataRefBhv;

    // ===================================================================================
    //                                                                            Settings
    //                                                                            ========
    @Override
    public void setUp() throws Exception {
        super.setUp();
    }

    @Override
    public void tearDown() throws Exception {
        vendorLargeDataRefBhv.getFetchSizeMap().clear();
        vendorLargeDataRefBhv.getRowDataClassMap().clear();
        super.tearDown();
    }

    // ===================================================================================
    //                                                                          Fetch Size
    //                                                                          ==========
    public void test_entitySelectFetchSize_defaultFetchSize() throws Exception {
        VendorLargeDataRefCB cb = new VendorLargeDataRefCB();
        cb.query().setLargeDataRefId_IsNotNull(); // to avoid no condition exception

        try {
            vendorLargeDataRefBhv.selectEntityWithDeletedCheck(cb);
            fail();
        } catch (EntityAlreadyDeletedException e) { // because large data is not required 
            log(e.getMessage());
        } catch (EntityDuplicatedException e) { // needs manual test by large data
            log(e.getMessage());
        }
        assertEquals(Integer.MIN_VALUE, vendorLargeDataRefBhv.getFetchSizeMap().get("selectList"));
        assertEquals(com.mysql.jdbc.RowDataDynamic.class, vendorLargeDataRefBhv.getRowDataClassMap().get("selectList"));
    }

    public void test_entitySelectFetchSize_selectList_static() {
        // ## Arrange ##
        VendorLargeDataRefCB cb = new VendorLargeDataRefCB();
        cb.query().setLargeDataId_Equal(1L);
        int countAll = vendorLargeDataRefBhv.selectCount(cb);

        // ## Act ##
        ListResultBean<VendorLargeDataRef> memberList = vendorLargeDataRefBhv.selectList(cb);

        // ## Assert ##
        // because large data is not required
        //assertHasAnyElement(memberList);
        assertEquals(countAll, memberList.size());
        assertEquals(0, vendorLargeDataRefBhv.getFetchSizeMap().get("selectList"));
        assertEquals(com.mysql.jdbc.RowDataStatic.class, vendorLargeDataRefBhv.getRowDataClassMap().get("selectList"));
    }
}
