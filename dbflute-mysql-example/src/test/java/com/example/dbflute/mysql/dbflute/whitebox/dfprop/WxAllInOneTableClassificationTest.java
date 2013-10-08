package com.example.dbflute.mysql.dbflute.whitebox.dfprop;

import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.dbflute.util.DfReflectionUtil;

import com.example.dbflute.mysql.dbflute.allcommon.CDef;
import com.example.dbflute.mysql.dbflute.cbean.WhiteAllInOneClsCompoundPkRefCB;
import com.example.dbflute.mysql.dbflute.exbhv.WhiteAllInOneClsCompoundPkRefBhv;
import com.example.dbflute.mysql.dbflute.exbhv.WhiteAllInOneClsNormalColRefBhv;
import com.example.dbflute.mysql.dbflute.exentity.WhiteAllInOneClsCompoundPkRef;
import com.example.dbflute.mysql.dbflute.exentity.WhiteAllInOneClsElement;
import com.example.dbflute.mysql.dbflute.exentity.WhiteAllInOneClsNormalColRef;
import com.example.dbflute.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 */
public class WxAllInOneTableClassificationTest extends UnitContainerTestCase {

    private WhiteAllInOneClsCompoundPkRefBhv whiteAllInOneClsCompoundPkRefBhv;
    private WhiteAllInOneClsNormalColRefBhv whiteAllInOneClsNormalColRefBhv;

    // ===================================================================================
    //                                                                               Basic
    //                                                                               =====
    public void test_AllInOneCls_SetupSelect_basic() {
        // ## Arrange ##
        registerTestData();
        WhiteAllInOneClsCompoundPkRefCB cb = new WhiteAllInOneClsCompoundPkRefCB();
        cb.setupSelect_WhiteAllInOneClsElementAsFoo();

        // ## Act ##
        ListResultBean<WhiteAllInOneClsCompoundPkRef> refList = whiteAllInOneClsCompoundPkRefBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, refList.size());
        StringBuilder logSb = new StringBuilder();
        for (WhiteAllInOneClsCompoundPkRef ref : refList) {
            WhiteAllInOneClsElement asFoo = ref.getWhiteAllInOneClsElementAsFoo();
            assertEquals("FOO", asFoo.getClsCategoryCode());
            assertEquals(ref.getFooCode(), asFoo.getClsElementCode());
        }
        log(logSb);
    }

    // ===================================================================================
    //                                                                                CDef
    //                                                                                ====
    public void test_AllInOneCls_basic() {
        assertEquals("F03", CDef.FooCls.FooThree.code());
        assertEquals("B02", CDef.BarCls.BarTwo.code());
        assertEquals("Q01", CDef.QuxCls.QuxOne.code());
        assertNull(DfReflectionUtil.getWholeField(CDef.DefMeta.class, "CorgeCls"));
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    private void registerTestData() {
        // 1 to 0...*
        xregisterWhiteAllInOneCompoundPkClsRef("F01", "B02", "Q03");
        xregisterWhiteAllInOneCompoundPkClsRef("F02", "B03", "Q04");
        xregisterWhiteAllInOneCompoundPkClsRef("F03", "B04", "Q01");
        xregisterWhiteAllInOneCompoundPkClsRef("F04", "B01", "Q02");
        xregisterWhiteAllInOneCompoundPkClsRef("F01", "B02", "Q02");

        // 1 to 0...*
        xregisterWhiteAllInOneNormalColClsRef(1, "F01", "B02", "Q03");
        xregisterWhiteAllInOneNormalColClsRef(2, "F02", "B03", "Q04");
        xregisterWhiteAllInOneNormalColClsRef(3, "F03", "B04", "Q01");
        xregisterWhiteAllInOneNormalColClsRef(4, "F04", "B01", "Q02");
        xregisterWhiteAllInOneNormalColClsRef(5, "F01", "B02", "Q02");
    }

    private WhiteAllInOneClsCompoundPkRef xregisterWhiteAllInOneCompoundPkClsRef(String fooCode, String barCode,
            String quxCode) {
        WhiteAllInOneClsCompoundPkRef ref = new WhiteAllInOneClsCompoundPkRef();
        ref.setFooCode(fooCode);
        ref.setBarCode(barCode);
        ref.setQuxCode(quxCode);
        whiteAllInOneClsCompoundPkRefBhv.insert(ref);
        return ref;
    }

    private WhiteAllInOneClsNormalColRef xregisterWhiteAllInOneNormalColClsRef(int refId, String fooCode,
            String barCode, String quxCode) {
        WhiteAllInOneClsNormalColRef ref = new WhiteAllInOneClsNormalColRef();
        ref.setClsRefId(refId);
        ref.setFooCode(fooCode);
        ref.setBarCode(barCode);
        ref.setQuxCode(quxCode);
        whiteAllInOneClsNormalColRefBhv.insert(ref);
        return ref;
    }
}