package com.example.dbflute.postgresql.dbflute.whitebox.dfprop;

import com.example.dbflute.postgresql.dbflute.cbean.WhiteNotPkCB;
import com.example.dbflute.postgresql.dbflute.exbhv.WhiteNotPkBhv;
import com.example.dbflute.postgresql.dbflute.exentity.WhiteNotPk;
import com.example.dbflute.postgresql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.5.3 (2009/08/01 Saturdayy)
 */
public class WxNonPrimaryKeyInsertTest extends UnitContainerTestCase {

    private WhiteNotPkBhv whiteNotPkBhv;

    public void test_integer_null() {
        // ## Arrange ##
        WhiteNotPk vendorNotPk = new WhiteNotPk();
        vendorNotPk.setNotPkId(99999L);

        // ## Act ##
        whiteNotPkBhv.insert(vendorNotPk);

        // ## Assert ##
        WhiteNotPkCB cb = new WhiteNotPkCB();
        cb.query().setNotPkId_Equal(99999L);
        WhiteNotPk actual = whiteNotPkBhv.selectEntityWithDeletedCheck(cb);
        assertNull(actual.getNotPkInteger());
    }
}