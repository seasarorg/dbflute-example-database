package com.example.dbflute.mysql.dbflute.whitebox.runtime;

import org.seasar.dbflute.dbmeta.alter.AlterGeneratorMySql;
import org.seasar.dbflute.dbmeta.info.ColumnInfo;
import org.seasar.dbflute.unit.core.PlainTestCase;

import com.example.dbflute.mysql.dbflute.bsentity.dbmeta.MemberDbm;

/**
 * @author jflute
 */
public class WxAlterBuilderMySqlTest extends PlainTestCase {

    public void test_buildColumnNameChange() throws Exception {
        // ## Arrange ##
        AlterGeneratorMySql builder = new AlterGeneratorMySql();

        // ## Act ##
        ColumnInfo memberAccount = MemberDbm.getInstance().columnMemberAccount();
        String alter = builder.generateColumnRename("TOMBER_ACCOUNT", memberAccount);

        // ## Assert ##
        log(alter);
    }
}
