package com.example.dbflute.postgresql.dbflute.whitebox;

import org.seasar.dbflute.cbean.SubQuery;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;

import com.example.dbflute.postgresql.dbflute.cbean.WhiteCompoundPkCB;
import com.example.dbflute.postgresql.dbflute.cbean.WhiteCompoundPkRefCB;
import com.example.dbflute.postgresql.dbflute.exbhv.WhiteCompoundPkBhv;
import com.example.dbflute.postgresql.dbflute.exentity.WhiteCompoundPk;
import com.example.dbflute.postgresql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.5 (2009/04/30 Thursday)
 */
public class WxBhvQueryUpdateCompoundPKTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private WhiteCompoundPkBhv whiteCompoundPkBhv;

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    public void test_queryUpdate_basic() {
        // ## Arrange ##
        registerTestData();
        WhiteCompoundPk compoundPK = new WhiteCompoundPk();
        compoundPK.setPkName("updated");

        WhiteCompoundPkCB cb = new WhiteCompoundPkCB();
        cb.query().setPkName_Equal("queryUpdate");

        // ## Act ##
        int updatedCount = whiteCompoundPkBhv.queryUpdate(compoundPK, cb);

        // ## Assert ##
        assertNotSame(0, updatedCount);
        WhiteCompoundPkCB actualCB = new WhiteCompoundPkCB();
        cb.query().setPkName_Equal("updated");
        assertNotSame(0, whiteCompoundPkBhv.selectCount(actualCB));
    }

    public void test_queryUpdate_ExistsReferrer() {
        // ## Arrange ##
        registerTestData();
        WhiteCompoundPk compoundPK = new WhiteCompoundPk();
        compoundPK.setPkName("updated");

        WhiteCompoundPkCB cb = new WhiteCompoundPkCB();
        cb.query().existsWhiteCompoundPkRefList(new SubQuery<WhiteCompoundPkRefCB>() {
            public void query(WhiteCompoundPkRefCB subCB) {
            }
        });

        // ## Act ##
        try {
            whiteCompoundPkBhv.queryUpdate(compoundPK, cb);

            // ## Assert ##
            fail();
        } catch (IllegalConditionBeanOperationException e) {
            // OK
            log(e.getMessage());
        }
    }

    // ===================================================================================
    //                                                                         Test Helper
    //                                                                         ===========
    protected void registerTestData() {
        WhiteCompoundPk compoundPK = new WhiteCompoundPk();
        compoundPK.setPkFirstId(1);
        compoundPK.setPkSecondId(2);
        compoundPK.setPkName("queryUpdate");
        whiteCompoundPkBhv.insert(compoundPK);
    }
}
