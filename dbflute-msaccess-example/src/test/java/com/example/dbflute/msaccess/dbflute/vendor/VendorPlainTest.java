package com.example.dbflute.msaccess.dbflute.vendor;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

import com.example.dbflute.msaccess.unit.ContainerTestCase;

/**
 * @author jflute
 */
public class VendorPlainTest extends ContainerTestCase {

    // ===================================================================================
    //                                                                           ResultSet
    //                                                                           =========
    @Test
    public void test_ResultSet_sameColumn_twiceGetting() throws SQLException {
        String sql = "select MEMBER_ID, MEMBER_NAME from MEMBER";
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            conn = getDataSource().getConnection();
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            boolean exists = false;
            while (rs.next()) {
                exists = true;
                String first = rs.getString("MEMBER_NAME");
                try {
                    rs.getString("MEMBER_NAME");

                    fail();
                } catch (SQLException e) {
                    // OK
                    log(first + " -- " + e.getMessage());
                    assertTrue(e.getMessage().contains("No data found"));
                }
            }
            assertTrue(exists);
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (st != null) {
                st.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }
}
