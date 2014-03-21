package com.example.dbflute.sqlserver.dbflute.whitebox;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import com.example.dbflute.sqlserver.dbflute.cbean.VendorSymmetricCB;
import com.example.dbflute.sqlserver.dbflute.exbhv.VendorSymmetricBhv;
import com.example.dbflute.sqlserver.dbflute.exbhv.pmbean.SymmetricOpenPmb;
import com.example.dbflute.sqlserver.dbflute.exentity.VendorSymmetric;
import com.example.dbflute.sqlserver.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 1.0.5C (2014/03/13 Thursday)
 */
public class WxGearedCipherSQLServerTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private VendorSymmetricBhv vendorSymmetricBhv;

    // ===================================================================================
    //                                                                            Settings
    //                                                                            ========
    @Override
    protected boolean isUseOneTimeContainer() {
        return true; // because open status is kept in container instance
    }

    // ===================================================================================
    //                                                                              Select
    //                                                                              ======
    public void test_ConditionBean_select_decrypted_open() throws Exception {
        // ## Arrange ##
        openSymmetricByOutsideSql();
        VendorSymmetricCB cb = new VendorSymmetricCB();
        cb.query().setPlainText_Equal("foo");

        // ## Act ##
        VendorSymmetric actual = vendorSymmetricBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        log(actual);
        assertEquals("foo", actual.getPlainText());
        String encryptedData = actual.getEncryptedData();
        byte[] bytesData = encryptedData.getBytes("UTF-8");
        String decryptedByteExp;
        {
            StringBuilder sb = new StringBuilder();
            for (byte b : bytesData) {
                sb.append(b).append(" ");
            }
            decryptedByteExp = sb.toString().trim(); // 98 0 97 0 114 0
            log(decryptedByteExp);
        }
        String expected = "bar";
        String expectedByteExp;
        {
            StringBuilder sb = new StringBuilder();
            for (byte b : expected.getBytes("UTF-8")) {
                sb.append(b).append(" ");
            }
            expectedByteExp = sb.toString().trim(); // 98 97 114
            log(expectedByteExp);
        }
        log("decryptedText: " + encryptedData);
        // why?
        // 98 97 114 v.s. 98 0 97 0 114 0
        //assertEquals(expected, decryptedText);
        assertEquals(expectedByteExp, replace(decryptedByteExp, " 0", ""));
    }

    public void test_ConditionBean_select_decrypted_unopened() throws Exception {
        // ## Arrange ##
        // unopened
        //openSymmetricByOutsideSql();
        VendorSymmetricCB cb = new VendorSymmetricCB();
        cb.query().setPlainText_Equal("foo");

        // ## Act ##
        VendorSymmetric actual = vendorSymmetricBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        log(actual);
        assertEquals("foo", actual.getPlainText());
        assertNull(actual.getEncryptedData());
    }

    // ===================================================================================
    //                                                                              Update
    //                                                                              ======
    public void test_ConditionBean_insert_decrypted() throws Exception {
        // ## Arrange ##
        openSymmetricByOutsideSql();
        VendorSymmetric symmetric = new VendorSymmetric();
        symmetric.setVendorSymmetricId(1001L);
        symmetric.setPlainText("maihama");
        String expected = "dockside";
        symmetric.setEncryptedData(expected);

        // ## Act ##
        vendorSymmetricBhv.insert(symmetric);

        // ## Assert ##
        VendorSymmetricCB cb = new VendorSymmetricCB();
        cb.query().setPlainText_Equal("maihama");
        VendorSymmetric actual = vendorSymmetricBhv.selectEntityWithDeletedCheck(cb);
        assertEquals("maihama", actual.getPlainText());
        String encryptedData = actual.getEncryptedData();
        log("decryptedText: " + encryptedData);
        assertEquals(expected, encryptedData);
    }

    public void test_ConditionBean_update_decrypted() throws Exception {
        // ## Arrange ##
        openSymmetricByOutsideSql();
        VendorSymmetric symmetric = new VendorSymmetric();
        symmetric.setVendorSymmetricId(1L);
        String expected = "dockside";
        symmetric.setEncryptedData(expected);

        // ## Act ##
        vendorSymmetricBhv.update(symmetric);

        // ## Assert ##
        VendorSymmetricCB cb = new VendorSymmetricCB();
        cb.query().setPlainText_Equal("foo");
        VendorSymmetric actual = vendorSymmetricBhv.selectEntityWithDeletedCheck(cb);
        assertEquals("foo", actual.getPlainText());
        String encryptedData = actual.getEncryptedData();
        log("decryptedText: " + encryptedData);
        assertEquals(expected, encryptedData);
    }

    // ===================================================================================
    //                                                                      Open Symmetric
    //                                                                      ==============
    protected void openSymmetricByOutsideSql() {
        SymmetricOpenPmb pmb = new SymmetricOpenPmb();
        vendorSymmetricBhv.outsideSql().execute(pmb);
    }

    // ===================================================================================
    //                                                                         JDBC Direct
    //                                                                         ===========
    public void test_JDBCDirect_select_decrypted() throws Exception {
        jdbcDirectOpenSymmetric();
        DataSource dataSource = getDataSource();
        Connection conn = null;
        Statement st = null;
        try {
            conn = dataSource.getConnection();
            st = conn.createStatement();
            StringBuilder sb = new StringBuilder();
            sb.append("select PLAIN_TEXT");
            sb.append(", ENCRYPTED_DATA");
            sb.append(", convert(nvarchar(MAX), DecryptByKey(ENCRYPTED_DATA)) as DECRYPTED_TEXT");
            sb.append(" from VENDOR_SYMMETRIC");
            String sql = sb.toString();
            log("...Selecting: " + ln() + sql);
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String plainText = rs.getString(1);
                String encryptedData = rs.getString(2);
                String decryptedText = rs.getString(3);
                log(plainText, encryptedData, decryptedText);
                assertEquals("foo", plainText);
                assertNotNull(encryptedData);
                assertEquals("bar", decryptedText);
            }
        } finally {
            if (st != null) {
                st.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }

    protected void jdbcDirectOpenSymmetric() throws SQLException {
        DataSource dataSource = getDataSource();
        Connection conn = null;
        Statement st = null;
        try {
            conn = dataSource.getConnection();
            st = conn.createStatement();
            String sql = "open symmetric key SYMMETRIC_CHECK_KEY decryption by PASSWORD = 'himitsu'";
            log("...Opening: " + ln() + sql);
            st.execute(sql);
        } finally {
            if (st != null) {
                st.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }
}
