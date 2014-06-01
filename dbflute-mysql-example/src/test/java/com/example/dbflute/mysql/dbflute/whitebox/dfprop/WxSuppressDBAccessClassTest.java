package com.example.dbflute.mysql.dbflute.whitebox.dfprop;

import org.seasar.dbflute.BehaviorSelector;
import org.seasar.dbflute.exception.IllegalBehaviorStateException;

import com.example.dbflute.mysql.dbflute.bsentity.dbmeta.WithdrawalReasonDbm;
import com.example.dbflute.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 1.0.5G (2014/06/01 Sunday)
 */
public class WxSuppressDBAccessClassTest extends UnitContainerTestCase {

    private BehaviorSelector selector;

    public void test_suppressed() throws Exception {
        // ## Arrange ##
        String tableDbName = WithdrawalReasonDbm.getInstance().getTableDbName();

        // ## Act ##
        try {
            selector.byName(tableDbName);
            // ## Assert ##
            fail();
        } catch (IllegalBehaviorStateException e) {
            log(e.getMessage());
        }
    }
}
