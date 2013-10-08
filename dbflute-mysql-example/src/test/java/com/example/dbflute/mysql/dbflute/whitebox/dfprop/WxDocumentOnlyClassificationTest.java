package com.example.dbflute.mysql.dbflute.whitebox.dfprop;

import org.seasar.dbflute.unit.core.PlainTestCase;
import org.seasar.dbflute.util.DfReflectionUtil;

import com.example.dbflute.mysql.dbflute.allcommon.CDef;

/**
 * @author jflute1
 */
public class WxDocumentOnlyClassificationTest extends PlainTestCase {

    public void test_DocumentOnly_basic() throws Exception {
        assertNotNull(DfReflectionUtil.getWholeField(CDef.DefMeta.class, "MemberStatus"));
        assertNull(DfReflectionUtil.getWholeField(CDef.DefMeta.class, "DocumentOnly"));
        assertNotNull(DfReflectionUtil.getWholeField(CDef.DefMeta.class, "QuxCls"));
        assertNull(DfReflectionUtil.getWholeField(CDef.DefMeta.class, "CorgeCls"));
    }
}
