package com.example.dbflute.sqlserver.dbflute.nogen;

import org.seasar.dbflute.cbean.cipher.CipherFunctionFilter;
import org.seasar.dbflute.cbean.cipher.GearedCipherManager;
import org.seasar.dbflute.dbmeta.info.ColumnInfo;

import com.example.dbflute.sqlserver.dbflute.allcommon.DBFluteConfig;
import com.example.dbflute.sqlserver.dbflute.allcommon.DBFluteInitializer;
import com.example.dbflute.sqlserver.dbflute.bsentity.dbmeta.VendorSymmetricDbm;

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

        final GearedCipherManager manager = new GearedCipherManager();
        final ColumnInfo encryptedData = VendorSymmetricDbm.getInstance().columnEncryptedData();
        manager.addFunctionFilter(encryptedData, new CipherFunctionFilter() {
            public String encrypt(String valueExp) {
                String exp = "EncryptByKey(Key_GUID('SYMMETRIC_CHECK_KEY'), %1$s)";
                return String.format(exp, valueExp);
            }

            public String decrypt(String valueExp) {
                String exp = "convert(nvarchar(max), DecryptByKey(%1$s))";
                return String.format(exp, valueExp);
            }
        });
        config.setGearedCipherManager(manager);

        config.lock();
    }
}
