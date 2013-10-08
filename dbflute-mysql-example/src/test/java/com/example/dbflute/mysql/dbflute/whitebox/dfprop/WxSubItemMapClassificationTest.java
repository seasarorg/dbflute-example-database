package com.example.dbflute.mysql.dbflute.whitebox.dfprop;

import java.util.Map;

import org.seasar.dbflute.unit.core.PlainTestCase;

import com.example.dbflute.mysql.dbflute.allcommon.CDef;

/**
 * @author jflute
 * @since 0.9.9.3B (2012/03/08 Thursday)
 */
public class WxSubItemMapClassificationTest extends PlainTestCase {

    // ===================================================================================
    //                                                                               Basic
    //                                                                               =====
    public void test_subItemMap_basic() throws Exception {
        {
            Map<String, Object> subItemMap = CDef.SubItemImplicit.Foo.subItemMap();
            assertEquals("value1<tag>", CDef.SubItemImplicit.Foo.regularStringItem());
            assertEquals("value1<tag>", subItemMap.get("regularStringItem"));
            // TODO jflute
            //Object value2 = subItemMap.get("key2");
            //MapListString mapListString = new MapListString();
            //List<Object> list = mapListString.generateList((String) value2);
            //assertEquals("aa", list.get(0));
            //assertEquals("bb", list.get(1));
            //assertEquals("cc", list.get(2));
        }
        {
            // TODO jflute
            //Map<String, Object> subItemMap = CDef.SubItemImplicit.Bar.subItemMap();
            //Object value1 = subItemMap.get("key1");
            //MapListString mapListString = new MapListString();
            //Map<String, Object> map = mapListString.generateMap((String) value1);
            //assertEquals("value11", map.get("key11"));
            //Object value2 = subItemMap.get("key2");
            //assertNull(value2);
        }
    }

    public void test_subItemMap_noSetting() throws Exception {
        Map<String, Object> subItemMap = CDef.MemberStatus.Formalized.subItemMap();
        assertTrue(subItemMap.isEmpty());
    }
}
