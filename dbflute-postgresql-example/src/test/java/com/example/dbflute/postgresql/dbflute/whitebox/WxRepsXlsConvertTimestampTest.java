package com.example.dbflute.postgresql.dbflute.whitebox;

import java.sql.Timestamp;

import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.dbflute.util.DfTypeUtil;

import com.example.dbflute.postgresql.dbflute.cbean.WhiteXlsManCB;
import com.example.dbflute.postgresql.dbflute.exbhv.WhiteXlsManBhv;
import com.example.dbflute.postgresql.dbflute.exentity.WhiteXlsMan;
import com.example.dbflute.postgresql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.7.5 (2010/10/23 Saturday)
 */
public class WxRepsXlsConvertTimestampTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private WhiteXlsManBhv whiteXlsManBhv;

    // ===================================================================================
    //                                                                               Basic
    //                                                                               =====
    public void test_replaceSchema_TSV() throws Exception {
        // ## Arrange ##
        WhiteXlsManCB cb = new WhiteXlsManCB();

        // ## Act ##
        ListResultBean<WhiteXlsMan> delimiterList = whiteXlsManBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, delimiterList.size());
        assertEquals(6, delimiterList.size());
        for (WhiteXlsMan vendorXlsMan : delimiterList) {
            log(vendorXlsMan);
        }
        assertEquals("before\\nafter", delimiterList.get(4).getStringConverted()); // converted to "\n"

        // 2011-07-30 10:21:12.01
        assertEquals("2011/07/30 10:21:12.001", fmt(delimiterList.get(0).getTimestampZeroDefaultMillis()));
        assertEquals("2011/07/30 10:21:12.001", fmt(delimiterList.get(0).getTimestampZeroPrefixMillis()));
        assertEquals("2011/07/30 10:21:12.010", fmt(delimiterList.get(0).getTimestampZeroSuffixMillis()));

        // 2011/07/30 10:21:12.8
        assertEquals("2011/07/30 10:21:12.008", fmt(delimiterList.get(1).getTimestampZeroDefaultMillis()));
        assertEquals("2011/07/30 10:21:12.008", fmt(delimiterList.get(1).getTimestampZeroPrefixMillis()));
        assertEquals("2011/07/30 10:21:12.800", fmt(delimiterList.get(1).getTimestampZeroSuffixMillis()));

        // 2011/07/30 10:21:12.1234
        assertEquals("2011/07/30 10:21:12.123", fmt(delimiterList.get(2).getTimestampZeroDefaultMillis()));
        assertEquals("2011/07/30 10:21:12.123", fmt(delimiterList.get(2).getTimestampZeroPrefixMillis()));
        assertEquals("2011/07/30 10:21:12.123", fmt(delimiterList.get(2).getTimestampZeroSuffixMillis()));

        // 2011/07/30 10:21:12.12
        assertEquals("2011/07/30 10:21:12.012", fmt(delimiterList.get(3).getTimestampZeroDefaultMillis()));
        assertEquals("2011/07/30 10:21:12.012", fmt(delimiterList.get(3).getTimestampZeroPrefixMillis()));
        assertEquals("2011/07/30 10:21:12.120", fmt(delimiterList.get(3).getTimestampZeroSuffixMillis()));

        // 2011/07/30 10:21:12
        assertEquals("2011/07/30 10:21:12.000", fmt(delimiterList.get(4).getTimestampZeroDefaultMillis()));
        assertEquals("2011/07/30 10:21:12.000", fmt(delimiterList.get(4).getTimestampZeroPrefixMillis()));
        assertEquals("2011/07/30 10:21:12.000", fmt(delimiterList.get(4).getTimestampZeroSuffixMillis()));

        // (empty)
        assertEquals(null, fmt(delimiterList.get(5).getTimestampZeroDefaultMillis()));
        assertEquals(null, fmt(delimiterList.get(5).getTimestampZeroPrefixMillis()));
        assertEquals(null, fmt(delimiterList.get(5).getTimestampZeroSuffixMillis()));
    }

    protected String fmt(Timestamp timestamp) {
        return DfTypeUtil.toString(timestamp, "yyyy/MM/dd HH:mm:ss.SSS");
    }
}
