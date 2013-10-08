package com.example.dbflute.oracle.dbflute.whitebox.dfprop;

import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.dbflute.exception.EntityAlreadyDeletedException;

import com.example.dbflute.oracle.dbflute.bsentity.dbmeta.MemberDbm;
import com.example.dbflute.oracle.dbflute.bsentity.dbmeta.NextSchemaProductDbm;
import com.example.dbflute.oracle.dbflute.bsentity.dbmeta.WhiteRefNextExceptDbm;
import com.example.dbflute.oracle.dbflute.cbean.NextSchemaProductCB;
import com.example.dbflute.oracle.dbflute.cbean.WhiteRefNextTargetCB;
import com.example.dbflute.oracle.dbflute.exbhv.NextSchemaProductBhv;
import com.example.dbflute.oracle.dbflute.exbhv.NextSchemaProductStatusBhv;
import com.example.dbflute.oracle.dbflute.exbhv.WhiteRefNextTargetBhv;
import com.example.dbflute.oracle.dbflute.exbhv.pmbean.SpNextNoParameterPmb;
import com.example.dbflute.oracle.dbflute.exbhv.pmbean.SpNoParameterPmb;
import com.example.dbflute.oracle.dbflute.exentity.NextSchemaProduct;
import com.example.dbflute.oracle.dbflute.exentity.NextSchemaProductStatus;
import com.example.dbflute.oracle.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.6.1 (2008/01/23 Wednesday)
 */
public class AdditionalSchemaTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private NextSchemaProductBhv nextSchemaProductBhv;
    private NextSchemaProductStatusBhv nextSchemaProductStatusBhv;
    private WhiteRefNextTargetBhv whiteRefNextTargetBhv;

    // ===================================================================================
    //                                                                               Basic
    //                                                                               =====
    public void test_selectList() {
        // ## Arrange ##
        registerAdditionalSchemaData();

        NextSchemaProductCB cb = new NextSchemaProductCB();
        cb.setupSelect_NextSchemaProductStatus();
        cb.query().setProductName_PrefixSearch("P");

        // ## Act ##
        ListResultBean<NextSchemaProduct> schemaList = nextSchemaProductBhv.selectList(cb);

        // ## Assert ##
        assertFalse(schemaList.isEmpty());
        for (NextSchemaProduct schema : schemaList) {
            log(schema + " : " + schema.getNextSchemaProductStatus());
            assertTrue(schema.getProductName().startsWith("P"));
            assertNotNull(schema.getNextSchemaProductStatus());
        }
    }

    public void test_insert_using_sequence_cached() {
        // ## Arrange ##
        NextSchemaProduct registered = registerAdditionalSchemaData();
        NextSchemaProduct product = new NextSchemaProduct();
        product.setProductName("FOO");
        product.setProductHandleCode("BAR");
        product.setProductStatusCode(registered.getProductStatusCode());

        // ## Act ##
        nextSchemaProductBhv.insert(product);

        NextSchemaProductCB cb = new NextSchemaProductCB();
        cb.setupSelect_NextSchemaProductStatus();
        cb.query().setProductName_PrefixSearch("P");

        // ## Assert ##
        NextSchemaProduct actual = nextSchemaProductBhv.selectByPKValueWithDeletedCheck(product.getProductId());
        assertEquals("FOO", actual.getProductName());
    }

    public void test_update_delete() {
        // ## Arrange ##
        NextSchemaProduct registered = registerAdditionalSchemaData();
        NextSchemaProduct nextSchemaProduct = new NextSchemaProduct();
        nextSchemaProduct.setProductId(99999L);
        nextSchemaProduct.setProductHandleCode("update");
        nextSchemaProduct.setVersionNo(registered.getVersionNo());

        NextSchemaProductCB cb = new NextSchemaProductCB();
        cb.query().setProductId_Equal(99999L);

        // ## Act ##
        nextSchemaProductBhv.update(nextSchemaProduct);

        // ## Assert ##
        NextSchemaProduct actual = nextSchemaProductBhv.selectEntityWithDeletedCheck(cb);
        assertEquals("update", actual.getProductHandleCode());

        // ## Act ##
        nextSchemaProductBhv.delete(nextSchemaProduct);

        // ## Assert ##
        try {
            nextSchemaProductBhv.selectEntityWithDeletedCheck(cb);
            fail();
        } catch (EntityAlreadyDeletedException e) {
            // OK
            log(e.getMessage());
        }
    }

    public void test_queryUpdate() {
        // ## Arrange ##
        registerAdditionalSchemaData();

        NextSchemaProduct nextSchemaProduct = new NextSchemaProduct();
        nextSchemaProduct.setProductId(99999L);
        nextSchemaProduct.setProductHandleCode("queryUpdate");

        NextSchemaProductCB cb = new NextSchemaProductCB();
        cb.query().setProductId_Equal(99999L);

        // ## Act ##
        int updated = nextSchemaProductBhv.queryUpdate(nextSchemaProduct, cb);

        // ## Assert ##
        assertEquals(1, updated);
        NextSchemaProduct actual = nextSchemaProductBhv.selectEntityWithDeletedCheck(cb);
        assertEquals("queryUpdate", actual.getProductHandleCode());
    }

    public void test_queryDelete() {
        // ## Arrange ##
        registerAdditionalSchemaData();

        NextSchemaProductCB cb = new NextSchemaProductCB();
        cb.query().setProductName_PrefixSearch("P");

        // ## Act ##
        int deleted = nextSchemaProductBhv.queryDelete(cb);

        // ## Assert ##
        assertEquals(1, deleted);
        try {
            nextSchemaProductBhv.selectEntityWithDeletedCheck(cb);
            fail();
        } catch (EntityAlreadyDeletedException e) {
            // OK
            log(e.getMessage());
        }
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    public void test_DBMeta_tableSqlName_with_schema() throws Exception {
        // ## Arrange ##
        NextSchemaProductDbm dbm = NextSchemaProductDbm.getInstance();

        // ## Act & Assert ##
        log("name=" + dbm.getTableSqlName());
        assertNotNull(dbm.getTableSqlName());
        assertTrue(dbm.getTableSqlName().toString().contains("."));
        assertFalse(MemberDbm.getInstance().getTableSqlName().toString().contains(".")); // compare
        assertEquals("NEXTEXAMPLEDB." + dbm.getTableDbName(), dbm.getTableSqlName().toString());
    }

    public void test_DBMeta_commonColumn_valid() throws Exception {
        // ## Arrange ##
        NextSchemaProductDbm dbm = NextSchemaProductDbm.getInstance();

        // ## Act & Assert ##
        assertTrue(dbm.hasCommonColumn()); // because isSuppressCommonColumn = false
    }

    // ===================================================================================
    //                                                                           Procedure
    //                                                                           =========
    public void test_Procedure_valid() throws Exception {
        assertTrue(new SpNextNoParameterPmb().getProcedureName().contains("."));
        assertFalse(new SpNoParameterPmb().getProcedureName().contains(".")); // compare
    }

    // ===================================================================================
    //                                                                       Except/Target
    //                                                                       =============
    public void test_exceptReference() {
        // no method
        //VendorRefNextExceptCB cb = new VendorRefNextExceptCB();
        //cb.setup

        WhiteRefNextExceptDbm dbm = WhiteRefNextExceptDbm.getInstance();
        assertFalse(dbm.hasForeign("nextSchemaProductSecretAuth"));
    }

    public void test_targetReference() {
        // ## Arrange ##
        WhiteRefNextTargetCB cb = new WhiteRefNextTargetCB();
        cb.setupSelect_NextSchemaProductStatus();

        // ## Act & Assert ##
        whiteRefNextTargetBhv.selectList(cb); // except no exception
    }

    // ===================================================================================
    //                                                                         Data Helper
    //                                                                         ===========
    protected NextSchemaProduct registerAdditionalSchemaData() {
        NextSchemaProductStatus nextSchemaProductStatus = new NextSchemaProductStatus();
        nextSchemaProductStatus.setProductStatusCode("XYZ");
        nextSchemaProductStatus.setProductStatusName("TEST-XYZ");
        nextSchemaProductStatusBhv.insert(nextSchemaProductStatus);

        NextSchemaProduct nextSchemaProduct = new NextSchemaProduct();
        nextSchemaProduct.setProductId(99999L);
        nextSchemaProduct.setProductName("PStarts");
        nextSchemaProduct.setProductHandleCode("Test");
        nextSchemaProduct.setProductStatusCode("XYZ");
        nextSchemaProductBhv.insert(nextSchemaProduct);
        return nextSchemaProduct;
    }
}