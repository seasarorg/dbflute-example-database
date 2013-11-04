package com.example.dbflute.oracle.dbflute.whitebox;

import org.seasar.dbflute.cbean.SubQuery;

import com.example.dbflute.oracle.dbflute.cbean.WhiteUqFkCB;
import com.example.dbflute.oracle.dbflute.cbean.WhiteUqFkRefCB;
import com.example.dbflute.oracle.dbflute.cbean.WhiteUqFkRefNestCB;
import com.example.dbflute.oracle.dbflute.cbean.WhiteUqFkWithoutPkCB;
import com.example.dbflute.oracle.dbflute.cbean.WhiteUqFkWithoutPkRefCB;
import com.example.dbflute.oracle.dbflute.exbhv.WhiteUqFkBhv;
import com.example.dbflute.oracle.dbflute.exbhv.WhiteUqFkWithoutPkBhv;
import com.example.dbflute.oracle.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 1.0.5A (2013/11/04 Monday)
 */
public class WxUniqueKeyFkTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private WhiteUqFkBhv whiteUqFkBhv;
    private WhiteUqFkWithoutPkBhv whiteUqFkWithoutPkBhv;

    // ===================================================================================
    //                                                                           Generated
    //                                                                           =========
    public void test_generated_basic() throws Exception {
        // ## Arrange ##
        WhiteUqFkCB cb = new WhiteUqFkCB();
        cb.query().existsWhiteUqFkRefByFkToUqCodeList(new SubQuery<WhiteUqFkRefCB>() {
            public void query(WhiteUqFkRefCB subCB) {
                subCB.query().existsWhiteUqFkRefNestList(new SubQuery<WhiteUqFkRefNestCB>() {
                    public void query(WhiteUqFkRefNestCB subCB) {
                        subCB.query().queryWhiteUqFkRef().queryWhiteUqFkByFkToUqCode().setUqFkId_Equal(3L);
                    }
                });
            }
        });

        // ## Act ##
        // ## Assert ##
        whiteUqFkBhv.selectList(cb); // expect no exception
    }

    public void test_generated_withoutPk() throws Exception {
        // ## Arrange ##
        WhiteUqFkWithoutPkCB cb = new WhiteUqFkWithoutPkCB();
        cb.query().existsWhiteUqFkWithoutPkRefList(new SubQuery<WhiteUqFkWithoutPkRefCB>() {
            public void query(WhiteUqFkWithoutPkRefCB subCB) {
                subCB.query().queryWhiteUqFkWithoutPk().setUqFkCode_Equal("FOO");
            }
        });

        // ## Act ##
        // ## Assert ##
        whiteUqFkWithoutPkBhv.selectList(cb); // expect no exception
    }
}
