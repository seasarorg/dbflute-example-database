package com.example.dbflute.mysql.dbflute.whitebox;

import org.seasar.dbflute.cbean.ListResultBean;

import com.example.dbflute.mysql.dbflute.cbean.WhiteDelimiterCB;
import com.example.dbflute.mysql.dbflute.exbhv.WhiteDelimiterBhv;
import com.example.dbflute.mysql.dbflute.exentity.WhiteDelimiter;
import com.example.dbflute.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.7.5 (2010/10/23 Saturday)
 */
public class WxRepsDelimiterConvertTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private WhiteDelimiterBhv whiteDelimiterBhv;

    // ===================================================================================
    //                                                                               Basic
    //                                                                               =====
    public void test_replaceSchema_TSV() throws Exception {
        // ## Arrange ##
        WhiteDelimiterCB cb = new WhiteDelimiterCB();

        // ## Act ##
        ListResultBean<WhiteDelimiter> delimiterList = whiteDelimiterBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, delimiterList.size());
        assertEquals(15, delimiterList.size());
        for (WhiteDelimiter vendorDelimiter : delimiterList) {
            log(vendorDelimiter);
        }
        assertEquals((Integer) 1, delimiterList.get(0).getNumberNullable());
        assertNull(delimiterList.get(1).getNumberNullable());
        assertEquals((Integer) 3, delimiterList.get(2).getNumberNullable());
        assertNull(delimiterList.get(3).getNumberNullable());
        assertEquals((Integer) 5, delimiterList.get(4).getNumberNullable());
        assertEquals((Integer) 6, delimiterList.get(5).getNumberNullable());
        assertEquals((Integer) 7, delimiterList.get(6).getNumberNullable());
        assertNull(delimiterList.get(7).getNumberNullable());
        assertEquals((Integer) 9, delimiterList.get(8).getNumberNullable());
        assertEquals("bar", delimiterList.get(0).getStringConverted());
        assertEquals("bar", delimiterList.get(1).getStringConverted());
        assertEquals("f\"oo", delimiterList.get(2).getStringConverted());
        assertEquals("f\to\no", delimiterList.get(3).getStringConverted());
        assertEquals("f\"\to\no\t", delimiterList.get(4).getStringConverted());
        assertNull(delimiterList.get(5).getStringConverted()); // converted to null
        assertEquals("", delimiterList.get(6).getStringConverted()); // empty converted
        assertEquals("", delimiterList.get(7).getStringConverted()); // empty converted
        assertEquals("foo\"", delimiterList.get(8).getStringConverted());
        assertEquals("foo", delimiterList.get(0).getStringNonConverted());
        assertEquals("foo", delimiterList.get(1).getStringNonConverted());
        assertEquals("f\"oo", delimiterList.get(2).getStringNonConverted());
        assertEquals("f\to\no", delimiterList.get(3).getStringNonConverted());
        assertEquals("f\"\to\no\t", delimiterList.get(4).getStringNonConverted());
        assertNull(delimiterList.get(5).getStringNonConverted()); // default not defined
        assertNull(delimiterList.get(6).getStringNonConverted());
        assertNull(delimiterList.get(7).getStringNonConverted());
        assertEquals("foo\"", delimiterList.get(8).getStringNonConverted());
        assertNotNull(delimiterList.get(0).getDateDefault());
    }
}
