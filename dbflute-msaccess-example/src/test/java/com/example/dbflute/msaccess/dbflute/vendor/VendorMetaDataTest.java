package com.example.dbflute.msaccess.dbflute.vendor;

import static org.junit.Assert.*;

import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Assert;

import com.example.dbflute.msaccess.dbflute.bsentity.dbmeta.MemberDbm;
import com.example.dbflute.msaccess.dbflute.bsentity.dbmeta.PurchaseDbm;
import com.example.dbflute.msaccess.unit.ContainerTestCase;

/**
 * @author jflute
 */
public class VendorMetaDataTest extends ContainerTestCase {

    // ===================================================================================
    //                                                                    DatabaseMetaData
    //                                                                    ================
    // -----------------------------------------------------
    //                                             DBMS Info
    //                                             ---------
    public void test_DatabaseMetaData_databaseInfo() throws SQLException {
        DatabaseMetaData metaData = getDataSource().getConnection().getMetaData();
        log("getDatabaseProductName(): " + metaData.getDatabaseProductName());
        log("getDatabaseProductVersion(): " + metaData.getDatabaseProductVersion());
        try {
            log("getDatabaseMajorVersion(): " + metaData.getDatabaseMajorVersion());

            fail();
        } catch (UnsupportedOperationException e) {
            // OK
            log(e.getMessage());
        }
        try {
            log("getDatabaseMinorVersion(): " + metaData.getDatabaseMinorVersion());

            fail();
        } catch (UnsupportedOperationException e) {
            // OK
            log(e.getMessage());
        }
    }

    // -----------------------------------------------------
    //                                             JDBC Info
    //                                             ---------
    public void test_DatabaseMetaData_jdbcInfo() throws SQLException {
        DatabaseMetaData metaData = getDatabaseMetaData();
        log("getDriverName(): " + metaData.getDriverName());
        log("getDriverVersion(): " + metaData.getDriverVersion());
        log("getJDBCMajorVersion(): " + metaData.getJDBCMajorVersion());
        log("getJDBCMinorVersion(): " + metaData.getJDBCMinorVersion());
    }

    // -----------------------------------------------------
    //                                             Max Thing
    //                                             ---------
    public void test_DatabaseMetaData_maxThing() throws SQLException {
        DatabaseMetaData metaData = getDataSource().getConnection().getMetaData();
        log("getMaxStatementLength(): " + metaData.getMaxStatementLength());
        log("getMaxTableNameLength(): " + metaData.getMaxTableNameLength());
    }

    // -----------------------------------------------------
    //                                                  Term
    //                                                  ----
    public void test_DatabaseMetaData_term() throws SQLException {
        DatabaseMetaData metaData = getDataSource().getConnection().getMetaData();
        log("getCatalogTerm(): " + metaData.getCatalogTerm());
        log("getSchemaTerm(): " + metaData.getSchemaTerm());
        log("getProcedureTerm(): " + metaData.getProcedureTerm());
    }

    // -----------------------------------------------------
    //                                           getTables()
    //                                           -----------
    public void test_DatabaseMetaData_getTables_basic() throws SQLException {
        DatabaseMetaData metaData = getDatabaseMetaData();
        ResultSet rs = metaData.getTables(null, null, "%", new String[] { "TABLE", "VIEW" });
        log("[Table]");
        boolean exists = false;
        while (rs.next()) {
            exists = true;
            String catalog = rs.getString("TABLE_CAT"); // full-path to file
            String schema = rs.getString("TABLE_SCHEM"); // null
            String name = rs.getString("TABLE_NAME");
            String comment = rs.getString("REMARKS");
            log("catalog=" + catalog + ", schema=" + schema + ", table=" + name + ", comment=" + comment);
            assertNotNull(catalog);
            assertNull(schema);
            assertNotNull(name);
        }
        assertTrue(exists);
    }

    public void test_DatabaseMetaData_getTables_schema_empty() throws SQLException {
        DatabaseMetaData metaData = getDatabaseMetaData();
        try {
            metaData.getTables(null, "", "%", new String[] { "TABLE", "VIEW" });

            fail();
        } catch (SQLException e) {
            // OK
            log(e.getMessage());
        }
    }

    // -----------------------------------------------------
    //                                      getPrimaryKeys()
    //                                      ----------------
    public void test_DatabaseMetaData_getPrimaryKeys() throws SQLException {
        DatabaseMetaData metaData = getDatabaseMetaData();
        try {
            metaData.getPrimaryKeys(null, null, MemberDbm.getInstance().getTableDbName());

            fail();
        } catch (SQLException e) { // unsupported at MS Access
            // OK
            log(e.getMessage());
        }
    }

    // -----------------------------------------------------
    //                                     getImportedKeys()
    //                                     -----------------
    public void test_DatabaseMetaData_getImportedKeys_basic() throws SQLException {
        DatabaseMetaData metaData = getDataSource().getConnection().getMetaData();
        String tableDbName = PurchaseDbm.getInstance().getTableDbName();
        try {
            metaData.getImportedKeys(null, null, tableDbName);

            fail();
        } catch (SQLException e) { // unsupported at MS Access
            // OK
            log(e.getMessage());
        }
    }

    // -----------------------------------------------------
    //                                        getIndexInfo()
    //                                        --------------
    public void test_DatabaseMetaData_getIndexInfo_unique() throws SQLException {
        DatabaseMetaData metaData = getDatabaseMetaData();
        String table = MemberDbm.getInstance().getTableDbName();
        ResultSet rs = metaData.getIndexInfo(null, null, table, true, true);
        log("[UniqueKey]");
        boolean exists = false;
        while (rs.next()) {
            exists = true;
            String pkName = rs.getString("INDEX_NAME");
            String columnName = rs.getString("COLUMN_NAME");
            log(pkName + ": " + columnName);
        }
        assertTrue(exists);
    }

    public void test_DatabaseMetaData_getIndexInfo_nonUnique() throws SQLException {
        DatabaseMetaData metaData = getDatabaseMetaData();
        String table = MemberDbm.getInstance().getTableDbName();
        ResultSet rs = metaData.getIndexInfo(null, null, table, false, true);
        log("[Index]");
        boolean exists = false;
        while (rs.next()) {
            exists = true;
            String pkName = rs.getString("INDEX_NAME");
            String columnName = rs.getString("COLUMN_NAME");
            log(pkName + ": " + columnName);
        }
        assertTrue(exists);
    }

    // -----------------------------------------------------
    //                                       getProcedures()
    //                                       ---------------
    public void test_DatabaseMetaData_getProcedures_mainSchema() throws SQLException {
        DatabaseMetaData metaData = getDataSource().getConnection().getMetaData();
        ResultSet rs = metaData.getProcedures(null, null, null);
        boolean exists = false;
        log("[Procedure]");
        while (rs.next()) {
            exists = true;
            String catalog = rs.getString("PROCEDURE_CAT"); // null
            String schema = rs.getString("PROCEDURE_SCHEM");
            String name = rs.getString("PROCEDURE_NAME");
            Assert.assertNotNull(catalog);
            assertNotNull(schema);
            assertNotNull(name);
            log("catalog=" + catalog + ", schema=" + schema + ", procedure=" + name);
        }
        assertFalse(exists); // not make procedure
    }
}
