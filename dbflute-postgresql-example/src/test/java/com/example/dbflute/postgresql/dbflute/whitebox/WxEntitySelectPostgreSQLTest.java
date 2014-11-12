package com.example.dbflute.postgresql.dbflute.whitebox;

import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.dbflute.exception.EntityAlreadyDeletedException;
import org.seasar.dbflute.exception.EntityDuplicatedException;

import com.example.dbflute.postgresql.dbflute.allcommon.DBFluteConfig;
import com.example.dbflute.postgresql.dbflute.cbean.VendorLargeDataRefCB;
import com.example.dbflute.postgresql.dbflute.exbhv.VendorLargeDataRefBhv;
import com.example.dbflute.postgresql.dbflute.exentity.VendorLargeDataRef;
import com.example.dbflute.postgresql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 1.1.0 (2014/11/11 Tuesday)
 */
public class WxEntitySelectPostgreSQLTest extends UnitContainerTestCase {

    private VendorLargeDataRefBhv vendorLargeDataRefBhv;

    // ===================================================================================
    //                                                                            Settings
    //                                                                            ========
    @Override
    public void setUp() throws Exception {
        xclearCachedContainer();
        DBFluteConfig.getInstance().unlock();
        DBFluteConfig.getInstance().setEntitySelectFetchSize(1);
        super.setUp();
    }

    @Override
    public void tearDown() throws Exception {
        vendorLargeDataRefBhv.getFetchSizeMap().clear();
        vendorLargeDataRefBhv.getRowDataClassMap().clear();
        super.tearDown();
        DBFluteConfig.getInstance().unlock();
        DBFluteConfig.getInstance().setEntitySelectFetchSize(null);
        DBFluteConfig.getInstance().lock();
    }

    @Override
    protected boolean isUseOneTimeContainer() {
        return true;
    }

    @Override
    protected boolean isDestroyContainerAtTearDown() {
        return true;
    }

    // ===================================================================================
    //                                                                          Fetch Size
    //                                                                          ==========
    public void test_entitySelectFetchSize_defaultFetchSize() throws Exception {
        VendorLargeDataRefCB cb = new VendorLargeDataRefCB();
        cb.query().setLargeDataRefId_IsNotNull(); // to avoid no condition exception

        try {
            vendorLargeDataRefBhv.selectEntity(cb);
            fail();
        } catch (EntityAlreadyDeletedException e) { // because large data is not required 
            log(e.getMessage());
        } catch (EntityDuplicatedException e) { // needs manual test by large data
            log(e.getMessage());
        }
        assertEquals(1, vendorLargeDataRefBhv.getFetchSizeMap().get("selectList"));
        assertEquals(1, vendorLargeDataRefBhv.getRowDataClassMap().get("selectList").size());
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
        assertEquals(countAll, vendorLargeDataRefBhv.getRowDataClassMap().get("selectList").size());
    }
}
