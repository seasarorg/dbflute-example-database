package com.example.dbflute.mysql.dbflute.vendor;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.seasar.dbflute.dbmeta.DBMeta;

import com.example.dbflute.mysql.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.mysql.dbflute.bsentity.dbmeta.NextSchemaProductDbm;
import com.example.dbflute.mysql.dbflute.bsentity.dbmeta.PurchaseDbm;
import com.example.dbflute.mysql.unit.UnitContainerTestCase;

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
    //                                           getTables()
    //                                           -----------
    public void test_DatabaseMetaData_getTables_basic() throws SQLException {
        DatabaseMetaData metaData = _conn.getMetaData();
        ResultSet rs = metaData.getTables("exampledb", null, "%", new String[] { "TABLE", "VIEW" });
        log("[Table]");
        boolean exists = false;
        while (rs.next()) {
            exists = true;
            String catalog = rs.getString("TABLE_CAT");
            String schema = rs.getString("TABLE_SCHEM"); // null
            String table = rs.getString("TABLE_NAME");
            String comment = rs.getString("REMARKS");
            log("catalog=" + catalog + ", schema=" + schema + ", table=" + table + ", comment=" + comment);
            assertNotNull(catalog);
            assertEquals("exampledb", catalog);
            assertNull(schema);
            assertNotNull(table);
        }
        assertTrue(exists);
    }

    public void test_DatabaseMetaData_getTables_schema_empty() throws SQLException {
        DatabaseMetaData metaData = _conn.getMetaData();
        ResultSet rs = metaData.getTables("exampledb", "", "%", new String[] { "TABLE", "VIEW" });
        log("[Table]");
        boolean exists = false;
        while (rs.next()) {
            exists = true;
            String catalog = rs.getString("TABLE_CAT");
            String schema = rs.getString("TABLE_SCHEM"); // null
            String table = rs.getString("TABLE_NAME");
            String comment = rs.getString("REMARKS");
            log("catalog=" + catalog + ", schema=" + schema + ", table=" + table + ", comment=" + comment);
            assertNotNull(catalog);
            assertEquals("exampledb", catalog);
            assertNull(schema);
            assertNotNull(table);
        }
        assertTrue(exists);
    }

    // -----------------------------------------------------
    //                                          getColumns()
    //                                          ------------
    public void test_DatabaseMetaData_getColumns() throws SQLException {
        DatabaseMetaData metaData = _conn.getMetaData();
        ResultSet rs = metaData.getColumns("exampledb", null, "member", null);
        log("[Column]");
        boolean exists = false;
        while (rs.next()) {
            exists = true;
            String catalog = rs.getString("TABLE_CAT"); // null
            String schema = rs.getString("TABLE_SCHEM");
            String table = rs.getString("TABLE_NAME");
            String column = rs.getString("COLUMN_NAME");
            String dbType = rs.getString("TYPE_NAME");
            String comment = rs.getString("REMARKS");
            log(catalog + "." + schema + "." + table + "." + column + ", " + dbType + ", comment=" + comment);
            assertNotNull(catalog);
            assertNull(schema);
            assertNotNull(column);
        }
        assertTrue(exists);
    }

    public void test_DatabaseMetaData_getColumns_nextSchema() throws SQLException {
        DatabaseMetaData metaData = _conn.getMetaData();
        String tableDbName = NextSchemaProductDbm.getInstance().getTableDbName();
        ResultSet rs = metaData.getColumns("nextexampledb", null, tableDbName, null);
        log("[Column]");
        boolean exists = false;
        while (rs.next()) {
            exists = true;
            String catalog = rs.getString("TABLE_CAT"); // null
            String schema = rs.getString("TABLE_SCHEM");
            String table = rs.getString("TABLE_NAME");
            String column = rs.getString("COLUMN_NAME");
            String comment = rs.getString("REMARKS");
            log(catalog + "." + schema + "." + table + "." + column + ", comment=" + comment);
            assertNotNull(catalog);
            assertNull(schema);
            assertNotNull(column);
        }
        assertTrue(exists);
    }

    // -----------------------------------------------------
    //                                     getImportedKeys()
    //                                     -----------------
    public void test_DatabaseMetaData_getImportedKeys_basic() throws SQLException {
        DatabaseMetaData metaData = _conn.getMetaData();
        String tableDbName = PurchaseDbm.getInstance().getTableDbName();
        ResultSet rs = metaData.getImportedKeys("exampledb", null, tableDbName);
        boolean exists = false;
        int count = 0;
        Set<String> fkSet = new HashSet<String>();
        while (rs.next()) {
            exists = true;
            String catalog = rs.getString(1);
            String schema = rs.getString(2); // null
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
            assertNull(schema);
            assertNotNull(foreignTable);
            assertNotNull(foreignColumn);
        }
        assertTrue(exists);
        assertEquals(count, fkSet.size());
    }

    public void test_DatabaseMetaData_getImportedKeys_order() throws SQLException {
        DatabaseMetaData metaData = _conn.getMetaData();
        Map<String, DBMeta> dbmetaMap = DBMetaInstanceHandler.getUnmodifiableDBMetaMap();
        for (Entry<String, DBMeta> entry : dbmetaMap.entrySet()) {
            String tableDbName = entry.getKey();
            if (entry.getValue().getForeignInfoList().size() < 2) {
                continue;
            }
            ResultSet rs = metaData.getImportedKeys("exampledb", null, tableDbName);
            log("");
            log("= = = = = = = = = = = = = = = " + tableDbName);
            while (rs.next()) {
                String catalog = rs.getString(1);
                String schema = rs.getString(2); // null
                String foreignTable = rs.getString(3);
                String foreignColumn = rs.getString(4);
                String fkName = rs.getString(12);

                log("[" + fkName + "]");
                log("  catalog=" + catalog + ", schema=" + schema);
                log("  foreignTable=" + foreignTable + ", foreignColumn=" + foreignColumn);
            }
        }
    }

    // -----------------------------------------------------
    //                                       getProcedures()
    //                                       ---------------
    public void test_DatabaseMetaData_getProcedures_mainSchema() throws SQLException {
        DatabaseMetaData metaData = _conn.getMetaData();
        ResultSet rs = metaData.getProcedures("exampledb", null, null);
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
            assertNull(schema);
            assertNotNull(procedure);
            assertNotNull(procedureType);
        }
        assertTrue(exists);
    }

    public void test_DatabaseMetaData_getProcedures_nextSchema() throws SQLException {
        DatabaseMetaData metaData = _conn.getMetaData();
        ResultSet rs = metaData.getProcedures("nextexampledb", null, null);
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
            assertNull(schema);
            assertNotNull(procedure);
            assertNotNull(procedureType);
        }
        assertTrue(exists);
    }

    // -----------------------------------------------------
    //                                 getProcedureColumns()
    //                                 ---------------------
    public void test_DatabaseMetaData_getProcedureColumns_mainSchema_basic() throws SQLException {
        DatabaseMetaData metaData = _conn.getMetaData();
        ResultSet rs = metaData.getProcedures("exampledb", null, null);
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
                String dataType = columnRs.getString("DATA_TYPE");
                String remarks = columnRs.getString("REMARKS");
                log("  " + columnName + "(" + columnType + ") " + typeName + "(" + precision + ", " + length + ", "
                        + scale + ") dataType=" + dataType + " // " + remarks);
                assertNotNull(columnName);
                assertNotNull(columnType);
                assertNotNull(typeName);
                assertNotNull(precision);
                assertNotNull(length);
                //assertNotNull(scale); null or not null
                assertNotNull(dataType);
            }
        }
        assertTrue(exists);
    }

    public void test_DatabaseMetaData_getProcedureColumns_mainSchema_fullQualified() throws SQLException {
        DatabaseMetaData metaData = _conn.getMetaData();
        ResultSet rs = metaData.getProcedures("exampledb", null, null);
        boolean exists = false;
        log("[Procedure]");
        while (rs.next()) {
            String catalog = rs.getString("PROCEDURE_CAT");
            String schema = rs.getString("PROCEDURE_SCHEM");
            String procedure = rs.getString("PROCEDURE_NAME");
            String qualifiedName = catalog + "." + procedure;
            ResultSet columnRs = metaData.getProcedureColumns(catalog, schema, qualifiedName, null);
            log(catalog + "." + schema + "." + procedure);
            while (columnRs.next()) {
                exists = true;
                String columnName = columnRs.getString("COLUMN_NAME");
                String typeName = columnRs.getString("TYPE_NAME");
                log("  column=" + columnName + ", type=" + typeName);
            }
        }
        assertTrue(exists);
    }

    public void test_DatabaseMetaData_getProcedureColumns_nextSchema_basic() throws SQLException {
        // ## Arrange ##
        DatabaseMetaData metaData = _conn.getMetaData();
        ResultSet rs = metaData.getProcedures("nextexampledb", null, null);
        log("[Procedure]");
        while (rs.next()) {
            String catalog = rs.getString("PROCEDURE_CAT");
            String schema = rs.getString("PROCEDURE_SCHEM");
            String procedure = rs.getString("PROCEDURE_NAME");
            log(catalog + "." + schema + "." + procedure);

            // ## Act ##
            try {
                // getProcedureColumns() of MySQL requires qualified procedure name when other catalog
                metaData.getProcedureColumns(catalog, null, procedure, null);

                // ## Assert ##
                fail();
            } catch (SQLException e) {
                // OK
                log(e.getMessage());
            }
        }
    }

    public void test_DatabaseMetaData_getProcedureColumns_nextSchema_fullQualified() throws SQLException {
        DatabaseMetaData metaData = _conn.getMetaData();
        ResultSet rs = metaData.getProcedures("nextexampledb", null, null);
        boolean exists = false;
        log("[Procedure]");
        while (rs.next()) {
            String catalog = rs.getString("PROCEDURE_CAT");
            String schema = rs.getString("PROCEDURE_SCHEM");
            String procedure = rs.getString("PROCEDURE_NAME");
            log(catalog + "." + schema + "." + procedure);
            String qualifiedName = catalog + "." + procedure;
            try {
                ResultSet columnRs = metaData.getProcedureColumns(catalog, null, qualifiedName, null);
                while (columnRs.next()) {
                    exists = true;
                    String columnName = columnRs.getString("COLUMN_NAME");
                    String typeName = columnRs.getString("TYPE_NAME");
                    log("  column=" + columnName + ", type=" + typeName);
                }
            } catch (SQLException e) {
                // Is authentication short?
                log(procedure + ": " + e.getMessage());
                return;
            }
        }
        assertTrue(exists);
    }

    // ===================================================================================
    //                                                                   ResultSetMetaData
    //                                                                   =================
    // -----------------------------------------------------
    //                                             Procedure
    //                                             ---------
    public void test_ResultSetMetaData_returnValue_closetResult() throws SQLException {
        CallableStatement cs = null;
        ResultSet rs = null;
        try {
            cs = _conn.prepareCall("{call SP_RETURN_RESULT_SET()}");
            boolean executed = cs.execute();
            log("executed = " + executed);
            rs = cs.getResultSet();
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();
            log("columnCount = " + columnCount);
            for (int i = 0; i < columnCount; i++) {
                int paramIndex = (i + 1);
                String columnLabel = metaData.getColumnLabel(paramIndex);
                String tableName = metaData.getTableName(paramIndex);
                log(tableName + "." + columnLabel);
                assertNotNull(tableName); // OK! classification is available
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (cs != null) {
                cs.close();
            }
        }
    }
}
