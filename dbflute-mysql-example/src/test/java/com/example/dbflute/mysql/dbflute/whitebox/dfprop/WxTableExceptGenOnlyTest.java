package com.example.dbflute.mysql.dbflute.whitebox.dfprop;

import org.seasar.dbflute.exception.DBMetaNotFoundException;

import com.example.dbflute.mysql.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.8.2 (2011/04/07 Thursday)
 */
public class WxTableExceptGenOnlyTest extends UnitContainerTestCase {

    public void test_except_generateOnly() {
        // ## Arrange ##
        final String tableName = "white_table_except_gen_only";

        // ## Act ##
        try {
            DBMetaInstanceHandler.findDBMeta(tableName);

            // ## Assert ##
            fail("The table should be generate-only excepted: " + tableName);
        } catch (DBMetaNotFoundException e) {
            // OK
            log(e.getMessage());
        }
    }
}
