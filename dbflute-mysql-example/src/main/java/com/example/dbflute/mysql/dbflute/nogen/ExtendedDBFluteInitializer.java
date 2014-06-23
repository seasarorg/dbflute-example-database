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
import com.example.dbflute.mysql.dbflute.bsentity.dbmeta.WhiteGearedCipherDbm;
import com.example.dbflute.mysql.mytype.MyMemberName;
import com.example.dbflute.mysql.mytype.MyPriceCount;
import com.example.dbflute.mysql.mytype.MySaleDate;
import com.example.dbflute.mysql.mytype.valuetype.MyTypeOfMemberName;
import com.example.dbflute.mysql.mytype.valuetype.MyTypeOfPriceCount;
import com.example.dbflute.mysql.mytype.valuetype.MyTypeOfSaleDate;

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

        // this format is parsed by tools test
        // /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
        final String secretKey = "himitsu"; // don't mock me (it's just an example)
        final ColumnInfo loginPassword = MemberSecurityDbm.getInstance().columnLoginPassword();
        manager.addFunctionFilter(loginPassword, createNonInvertibleFilter());
        final ColumnInfo updateUser = MemberDbm.getInstance().columnUpdateUser();
        manager.addFunctionFilter(updateUser, createInvertibleFilter(secretKey));
        final ColumnInfo cipherVarchar = WhiteGearedCipherDbm.getInstance().columnCipherVarchar();
        manager.addFunctionFilter(cipherVarchar, createInvertibleFilter(secretKey));
        final ColumnInfo cipherInteger = WhiteGearedCipherDbm.getInstance().columnCipherInteger();
        manager.addFunctionFilter(cipherInteger, createInvertibleFilter(secretKey));
        final ColumnInfo cipherDate = WhiteGearedCipherDbm.getInstance().columnCipherDate();
        manager.addFunctionFilter(cipherDate, createInvertibleFilter(secretKey));
        final ColumnInfo cipherDatetime = WhiteGearedCipherDbm.getInstance().columnCipherDatetime();
        manager.addFunctionFilter(cipherDatetime, createInvertibleFilter(secretKey));
        // = = = = = = = = = =/

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

        config.registerBasicValueType(MyMemberName.class, new MyTypeOfMemberName());
        config.registerBasicValueType(MyPriceCount.class, new MyTypeOfPriceCount());
        config.registerBasicValueType(MySaleDate.class, new MyTypeOfSaleDate());

        config.lock();
    }

    protected CipherFunctionFilter createNonInvertibleFilter() {
        return new CipherFunctionFilter() {
            public String encrypt(String valueExp) {
                String exp = "sha1(%1$s)";
                return String.format(exp, valueExp);
            }

            public String decrypt(String valueExp) {
                return valueExp; // because of non-invertible
            }
        };
    }

    protected CipherFunctionFilter createInvertibleFilter(final String secretKey) {
        return new CipherFunctionFilter() {
            public String encrypt(String valueExp) {
                String exp = "hex(aes_encrypt(%1$s, '%2$s'))";
                return String.format(exp, valueExp, secretKey);
            }

            public String decrypt(String valueExp) {
                String exp = "convert(aes_decrypt(unhex(%1$s), '%2$s') using utf8)";
                return String.format(exp, valueExp, secretKey);
            }
        };
    }
}
