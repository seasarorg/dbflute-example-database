package com.example.dbflute.mysql.dbflute.vendor;

import java.util.List;

import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.dbflute.cbean.UnionQuery;

import com.example.dbflute.mysql.dbflute.cbean.VendorTheLongAndWindingTableAndColumnRefCB;
import com.example.dbflute.mysql.dbflute.exbhv.VendorTheLongAndWindingTableAndColumnBhv;
import com.example.dbflute.mysql.dbflute.exbhv.VendorTheLongAndWindingTableAndColumnRefBhv;
import com.example.dbflute.mysql.dbflute.exentity.VendorTheLongAndWindingTableAndColumn;
import com.example.dbflute.mysql.dbflute.exentity.VendorTheLongAndWindingTableAndColumnRef;
import com.example.dbflute.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.9.1B (2011/10/17 Monday)
 */
public class VendorNameTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private VendorTheLongAndWindingTableAndColumnBhv vendorTheLongAndWindingTableAndColumnBhv;
    private VendorTheLongAndWindingTableAndColumnRefBhv vendorTheLongAndWindingTableAndColumnRefBhv;

    // ===================================================================================
    //                                                                           Long Name
    //                                                                           =========
    public void test_LongName_basic() throws Exception {
        // ## Arrange ##
        registerTheLongAndWindingData();
        VendorTheLongAndWindingTableAndColumnRefCB cb = new VendorTheLongAndWindingTableAndColumnRefCB();
        cb.setupSelect_VendorTheLongAndWindingTableAndColumn();
        cb.query().addOrderBy_TheLongAndWindingTableAndColumnRefDate_Asc();

        // ## Act ##
        ListResultBean<VendorTheLongAndWindingTableAndColumnRef> refList = vendorTheLongAndWindingTableAndColumnRefBhv
                .selectList(cb);

        // ## Assert ##
        assertHasAnyElement(refList);
        for (VendorTheLongAndWindingTableAndColumnRef ref : refList) {
            log(ref);
            assertNotNull(ref.getTheLongAndWindingTableAndColumnRefId());
            assertNotNull(ref.getTheLongAndWindingTableAndColumnRefDate());
            assertNotNull(ref.getShortDate());
            assertEquals("2011/10", toString(ref.getTheLongAndWindingTableAndColumnRefDate(), "yyyy/MM"));
            assertEquals("2000/01", toString(ref.getShortDate(), "yyyy/MM"));
            VendorTheLongAndWindingTableAndColumn main = ref.getVendorTheLongAndWindingTableAndColumn();
            assertNotNull(main);
            assertNotNull(main.getTheLongAndWindingTableAndColumnId());
            assertEquals("longName", main.getTheLongAndWindingTableAndColumnName());
            assertEquals("shortName", main.getShortName());
            assertEquals(3, main.getShortSize());
        }
    }

    public void test_LongName_union() throws Exception {
        // ## Arrange ##
        registerTheLongAndWindingData();
        VendorTheLongAndWindingTableAndColumnRefCB cb = new VendorTheLongAndWindingTableAndColumnRefCB();
        cb.setupSelect_VendorTheLongAndWindingTableAndColumn();
        cb.union(new UnionQuery<VendorTheLongAndWindingTableAndColumnRefCB>() {
            public void query(VendorTheLongAndWindingTableAndColumnRefCB unionCB) {
            }
        });
        cb.query().addOrderBy_TheLongAndWindingTableAndColumnRefDate_Asc();
        cb.query().addOrderBy_TheLongAndWindingTableAndColumnRefId_Asc();

        // ## Act ##
        ListResultBean<VendorTheLongAndWindingTableAndColumnRef> refList = vendorTheLongAndWindingTableAndColumnRefBhv
                .selectList(cb);

        // ## Assert ##
        assertHasAnyElement(refList);
        for (VendorTheLongAndWindingTableAndColumnRef ref : refList) {
            log(ref);
            assertNotNull(ref.getTheLongAndWindingTableAndColumnRefId());
            assertNotNull(ref.getTheLongAndWindingTableAndColumnRefDate());
            assertNotNull(ref.getShortDate());
            assertEquals("2011/10", toString(ref.getTheLongAndWindingTableAndColumnRefDate(), "yyyy/MM"));
            assertEquals("2000/01", toString(ref.getShortDate(), "yyyy/MM"));
            VendorTheLongAndWindingTableAndColumn main = ref.getVendorTheLongAndWindingTableAndColumn();
            assertNotNull(main);
            assertNotNull(main.getTheLongAndWindingTableAndColumnId());
            assertEquals("longName", main.getTheLongAndWindingTableAndColumnName());
            assertEquals("shortName", main.getShortName());
            assertEquals(3, main.getShortSize());
        }
    }

    protected VendorTheLongAndWindingTableAndColumn registerTheLongAndWindingData() {
        VendorTheLongAndWindingTableAndColumn main = new VendorTheLongAndWindingTableAndColumn();
        main.setTheLongAndWindingTableAndColumnId(1L);
        main.setTheLongAndWindingTableAndColumnName("longName");
        main.setShortName("shortName");
        main.setShortSize(3);
        vendorTheLongAndWindingTableAndColumnBhv.insert(main);

        List<VendorTheLongAndWindingTableAndColumnRef> refList = newArrayList();
        {
            VendorTheLongAndWindingTableAndColumnRef ref = new VendorTheLongAndWindingTableAndColumnRef();
            ref.setTheLongAndWindingTableAndColumnRefId(3L);
            ref.setTheLongAndWindingTableAndColumnId(1L);
            ref.setTheLongAndWindingTableAndColumnRefDate(toDate("2011/10/17"));
            ref.setShortDate(toDate("2000/01/01"));
            vendorTheLongAndWindingTableAndColumnRefBhv.insert(ref);
            refList.add(ref);
        }
        {
            VendorTheLongAndWindingTableAndColumnRef ref = new VendorTheLongAndWindingTableAndColumnRef();
            ref.setTheLongAndWindingTableAndColumnRefId(4L);
            ref.setTheLongAndWindingTableAndColumnId(1L);
            ref.setTheLongAndWindingTableAndColumnRefDate(toDate("2011/10/18"));
            ref.setShortDate(toDate("2000/01/02"));
            vendorTheLongAndWindingTableAndColumnRefBhv.insert(ref);
            refList.add(ref);
        }

        main.setVendorTheLongAndWindingTableAndColumnRefList(refList);
        return main;
    }
}
