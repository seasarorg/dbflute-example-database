package com.example.dbflute.mysql.dbflute.nogen;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.bhv.core.BehaviorCommandInvoker;
import org.seasar.dbflute.cbean.cipher.CipherFunctionFilter;
import org.seasar.dbflute.cbean.cipher.GearedCipherManager;
import org.seasar.dbflute.dbmeta.info.ColumnInfo;
import org.seasar.dbflute.jdbc.StatementConfig;
import org.seasar.dbflute.outsidesql.OutsideSqlOption;
import org.seasar.dbflute.outsidesql.executor.OutsideSqlBasicExecutor;
import org.seasar.dbflute.outsidesql.factory.DefaultOutsideSqlExecutorFactory;

import com.example.dbflute.mysql.dbflute.allcommon.DBFluteConfig;
import com.example.dbflute.mysql.dbflute.allcommon.DBFluteInitializer;
import com.example.dbflute.mysql.dbflute.bsentity.dbmeta.MemberDbm;
import com.example.dbflute.mysql.dbflute.bsentity.dbmeta.MemberSecurityDbm;
import com.example.dbflute.mysql.dbflute.bsentity.dbmeta.PurchaseDbm;

/**
 * @author jflute
 */
public class ExtendedDBFluteInitializer extends DBFluteInitializer {

    public ExtendedDBFluteInitializer() {
    }

    @Override
    protected void prologue() { // the example for fixed DBFluteConfig settings
        super.prologue(); // you need to call this

        final DBFluteConfig config = DBFluteConfig.getInstance();
        config.unlock();

        config.setOutsideSqlExecutorFactory(new DefaultOutsideSqlExecutorFactory() {
            @Override
            public <BEHAVIOR> OutsideSqlBasicExecutor<BEHAVIOR> createBasic(
                    BehaviorCommandInvoker behaviorCommandInvoker, String tableDbName, DBDef currentDBDef,
                    StatementConfig defaultStatementConfig, OutsideSqlOption outsideSqlOption) {
                final OutsideSqlBasicExecutor<BEHAVIOR> executor = super.createBasic(behaviorCommandInvoker,
                        tableDbName, currentDBDef, defaultStatementConfig, outsideSqlOption);
                return executor.formatSql(); // format only here (tests of removing are other example)
            }
        });

        final GearedCipherManager manager = new GearedCipherManager();
        final ColumnInfo loginPassword = MemberSecurityDbm.getInstance().columnLoginPassword();
        manager.addFunctionFilter(loginPassword, new CipherFunctionFilter() {
            public String encrypt(String valueExp) {
                String exp = "sha1(%1$s)";
                return String.format(exp, valueExp);
            }

            public String decrypt(String valueExp) {
                return valueExp; // because of non-invertible
            }
        });
        final String secretKey = "himitsu"; // don't mock me (it's just an example)
        final ColumnInfo updateUser = MemberDbm.getInstance().columnUpdateUser();
        manager.addFunctionFilter(updateUser, new CipherFunctionFilter() {
            public String encrypt(String valueExp) {
                String exp = "hex(aes_encrypt(%1$s, '%2$s'))";
                return String.format(exp, valueExp, secretKey);
            }

            public String decrypt(String valueExp) {
                String exp = "convert(aes_decrypt(unhex(%1$s), '%2$s') using utf8)";
                return String.format(exp, valueExp, secretKey);
            }
        });
        final ColumnInfo purchasePrice = PurchaseDbm.getInstance().columnPurchasePrice();
        manager.addFunctionFilter(purchasePrice, new CipherFunctionFilter() {
            public String encrypt(String valueExp) {
                return "(" + valueExp + " + 13)";
            }

            public String decrypt(String valueExp) {
                return "(" + valueExp + " - 13)";
            }
        });
        config.setGearedCipherManager(manager);

        config.lock();
    }
}
