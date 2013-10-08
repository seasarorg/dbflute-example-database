package com.example.dbflute.mysql.dbflute.whitebox.dfprop;

import org.seasar.dbflute.cbean.ListResultBean;

import com.example.dbflute.mysql.dbflute.allcommon.CDef;
import com.example.dbflute.mysql.dbflute.cbean.WhiteEscapedDfpropCB;
import com.example.dbflute.mysql.dbflute.exbhv.WhiteEscapedDfpropBhv;
import com.example.dbflute.mysql.dbflute.exentity.WhiteEscapedDfprop;
import com.example.dbflute.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 1.0.4A (2013/03/27 Wednesday)
 */
public class WxEscapedDfPropTest extends UnitContainerTestCase {

    private WhiteEscapedDfpropBhv whiteEscapedDfpropBhv;

    public void test_LoadData_basic() {
        // ## Arrange ##
        WhiteEscapedDfpropCB cb = new WhiteEscapedDfpropCB();

        // ## Act ##
        ListResultBean<WhiteEscapedDfprop> dfpropList = whiteEscapedDfpropBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(dfpropList);
        for (WhiteEscapedDfprop dfprop : dfpropList) {
            log(dfprop.getEscapedDfpropCode(), dfprop.getEscapedDfpropName());
        }
        WhiteEscapedDfprop first = dfpropList.get(0);
        assertEquals(";@\\", first.getEscapedDfpropCode());
        assertEquals("ab=cd", first.getEscapedDfpropName());
        WhiteEscapedDfprop second = dfpropList.get(1);
        assertEquals("\\};", second.getEscapedDfpropCode());
        assertEquals("}}{", second.getEscapedDfpropName());
        WhiteEscapedDfprop third = dfpropList.get(2);
        assertEquals("{=}", third.getEscapedDfpropCode());
        assertEquals(";\\\\", third.getEscapedDfpropName());
    }

    public void test_dfprop_hardcode() throws Exception {
        // confirm topComment by your eyes
        assertEquals(";@\\", CDef.EscapedDfpropCls.First.code());
        assertEquals("\\};", CDef.EscapedDfpropCls.Second.code());
        assertEquals("{=}", CDef.EscapedDfpropCls.Third.code());
    }
}
