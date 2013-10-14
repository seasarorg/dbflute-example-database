package com.example.dbflute.sqlserver.dbflute.vendor;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import com.example.dbflute.sqlserver.dbflute.bsentity.dbmeta.PurchaseDbm;
import com.example.dbflute.sqlserver.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.6.1 (2008/01/23 Wednesday)
 */
public class VendorMetaDataTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private Connection _conn;

    // ===================================================================================
    //                                                                            Settings
    //                                                                            ========
    @Override
    public void setUp() throws Exception {
        super.setUp();
        _conn = getDataSource().getConnection();
    }

    @Override
    public void tearDown() throws Exception {
        if (_conn != null) {
            _conn.close();
            _conn = null;
        }
        super.tearDown();
    }

    // ===================================================================================
    //                                                                    DatabaseMetaData
    //                                                                    ================
    // -----------------------------------------------------
    //                                             DBMS Info
    //                                             ---------
    public void test_DatabaseMetaData_databaseInfo() throws SQLException {
        DatabaseMetaData metaData = _conn.getMetaData();
        log("getDatabaseProductName(): " + metaData.getDatabaseProductName());
        log("getDatabaseProductVersion(): " + metaData.getDatabaseProductVersion());
        log("getDatabaseMajorVersion(): " + metaData.getDatabaseMajorVersion());
        log("getDatabaseMinorVersion(): " + metaData.getDatabaseMinorVersion());
    }

    // -----------------------------------------------------
    //                                             JDBC Info
    //                                             ---------
    public void test_DatabaseMetaData_jdbcInfo() throws SQLException {
        DatabaseMetaData metaData = _conn.getMetaData();
        log("getDriverName(): " + metaData.getDriverName());
        log("getDriverVersion(): " + metaData.getDriverVersion());
        log("getJDBCMajorVersion(): " + metaData.getJDBCMajorVersion());
        log("getJDBCMinorVersion(): " + metaData.getJDBCMinorVersion());
    }

    // -----------------------------------------------------
    //                                             Max Thing
    //                                             ---------
    public void test_DatabaseMetaData_maxThing() throws SQLException {
        DatabaseMetaData metaData = _conn.getMetaData();
        log("getMaxStatementLength(): " + metaData.getMaxStatementLength());
        log("getMaxTableNameLength(): " + metaData.getMaxTableNameLength());
    }

    // -----------------------------------------------------
    //                                                  Term
    //                                                  ----
    public void test_DatabaseMetaData_term() throws SQLException {
        DatabaseMetaData metaData = _conn.getMetaData();
        log("getCatalogTerm(): " + metaData.getCatalogTerm());
        log("getSchemaTerm(): " + metaData.getSchemaTerm());
        log("getProcedureTerm(): " + metaData.getProcedureTerm());
    }

    // -----------------------------------------------------
    //                                     getImportedKeys()
    //                                     -----------------
    public void test_DatabaseMetaData_getImportedKeys_basic() throws SQLException {
        DatabaseMetaData metaData = _conn.getMetaData();
        String tableDbName = PurchaseDbm.getInstance().getTableDbName();
        ResultSet rs = metaData.getImportedKeys("exampledb", "dbo", tableDbName);
        boolean exists = false;
        int count = 0;
        Set<String> fkSet = new HashSet<String>();
        while (rs.next()) {
            exists = true;
            String catalog = rs.getString(1);
            String schema = rs.getString(2);
            String foreignTable = rs.getString(3);
            String foreignColumn = rs.getString(4);
            String fkName = rs.getString(12);

            ++count;
            fkSet.add(fkName);

            log("[" + fkName + "]");
            log("  catalog=" + catalog + ", schema=" + schema);
            log("  foreignTable=" + foreignTable + ", foreignColumn=" + foreignColumn);
            assertNotNull(fkName);
            assertNotNull(catalog);
            assertNotNull(schema);
            assertNotNull(foreignTable);
            assertNotNull(foreignColumn);
        }
        assertTrue(exists);
        assertEquals(count, fkSet.size());
    }

    // -----------------------------------------------------
    //                                       getProcedures()
    //                                       ---------------
    public void test_DatabaseMetaData_getProcedures_mainSchema() throws SQLException {
        DatabaseMetaData metaData = _conn.getMetaData();
        ResultSet rs = metaData.getProcedures("exampledb", "dbo", null);
        boolean exists = false;
        log("[Procedure]");
        while (rs.next()) {
            exists = true;
            String catalog = rs.getString("PROCEDURE_CAT");
            String schema = rs.getString("PROCEDURE_SCHEM");
            String procedure = rs.getString("PROCEDURE_NAME");
            Integer procedureType = new Integer(rs.getString("PROCEDURE_TYPE"));
            log(catalog + "." + schema + "." + procedure + ", type=" + procedureType);
            assertNotNull(catalog);
            assertNotNull(schema);
            assertNotNull(procedure);
            assertNotNull(procedureType);
        }
        assertTrue(exists);
    }

    // -----------------------------------------------------
    //                                 getProcedureColumns()
    //                                 ---------------------
    public void test_DatabaseMetaData_getProcedureColumns_mainSchema() throws SQLException {
        DatabaseMetaData metaData = _conn.getMetaData();
        ResultSet rs = metaData.getProcedures("exampledb", "dbo", null);
        boolean exists = false;
        log("[Procedure]");
        while (rs.next()) {
            String catalog = rs.getString("PROCEDURE_CAT");
            String schema = rs.getString("PROCEDURE_SCHEM");
            String procedure = rs.getString("PROCEDURE_NAME");
            ResultSet columnRs = metaData.getProcedureColumns(catalog, schema, procedure, null);
            log(catalog + "." + schema + "." + procedure);
            while (columnRs.next()) {
                exists = true;
                String columnName = columnRs.getString("COLUMN_NAME");
                String columnType = columnRs.getString("COLUMN_TYPE");
                String typeName = columnRs.getString("TYPE_NAME");
                String precision = columnRs.getString("PRECISION");
                String length = columnRs.getString("LENGTH");
                String scale = columnRs.getString("SCALE");
                String dataType;
                if (columnName.toLowerCase().contains("@TABLE_RETURN_VALUE".toLowerCase())) {
                    // if a function returns table type, don't call this:
                    // o getString() throws NumberFormatException(null)
                    // o getInt() throws NullPointerException
                    dataType = null;
                } else {
                    dataType = columnRs.getString("DATA_TYPE");
                }
                String remarks = columnRs.getString("REMARKS");
                log("  " + columnName + "(" + columnType + ") " + typeName + "(" + precision + ", " + length + ", "
                        + scale + ") dataType=" + dataType + " // " + remarks);
                assertNotNull(columnName);
                assertNotNull(columnType);
                assertNotNull(typeName);
                assertNotNull(precision);
                assertNotNull(length);
                //assertNotNull(scale); null or not null
                //assertNotNull(dataType); null if table function
            }
        }
        assertTrue(exists);
    }

    public void test_DatabaseMetaData_getProcedureColumns_tableValuedFunction() throws SQLException {
        DatabaseMetaData metaData = _conn.getMetaData();
        ResultSet rs = metaData.getProcedures("exampledb", "dbo", null);
        boolean existsNumberFormat = false;
        boolean existsNullPointer = false;
        log("[Procedure]");
        while (rs.next()) {
            String catalog = rs.getString("PROCEDURE_CAT");
            String schema = rs.getString("PROCEDURE_SCHEM");
            String procedure = rs.getString("PROCEDURE_NAME");
            ResultSet columnRs = metaData.getProcedureColumns(catalog, schema, procedure, null);
            if (!procedure.toLowerCase().contains("fn_return_table")) {
                continue;
            }
            log(catalog + "." + schema + "." + procedure);
            columnRs.next(); // first parameter only checked
            String name = columnRs.getString("COLUMN_NAME");
            String type = columnRs.getString("COLUMN_TYPE");
            log("  returns " + name + " (" + type + ")");
            assertEquals("@TABLE_RETURN_VALUE", name); // Why?
            assertEquals(String.valueOf(DatabaseMetaData.procedureColumnResult), type); // Oh!?
            try {
                columnRs.getString("DATA_TYPE");

                fail();
            } catch (NumberFormatException e) {
                // Why?
                log("Number: " + e.getMessage());
                existsNumberFormat = true;
            }
            try {
                columnRs.getInt("DATA_TYPE");

                fail();
            } catch (NullPointerException e) {
                // Why?
                log("Null: " + e.getMessage());
                existsNullPointer = true;
            }
        }
        assertTrue(existsNumberFormat);
        assertTrue(existsNullPointer);
    }
}
