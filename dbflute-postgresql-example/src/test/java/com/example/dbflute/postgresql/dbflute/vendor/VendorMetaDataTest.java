package com.example.dbflute.postgresql.dbflute.vendor;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

import org.seasar.dbflute.jdbc.ValueType;
import org.seasar.dbflute.s2dao.valuetype.TnValueTypes;

import com.example.dbflute.postgresql.dbflute.bsentity.dbmeta.NextSchemaProductDbm;
import com.example.dbflute.postgresql.dbflute.bsentity.dbmeta.PurchaseDbm;
import com.example.dbflute.postgresql.unit.UnitContainerTestCase;

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
        ResultSet rs = metaData.getTables("exampledb", "public", "%", new String[] { "TABLE", "VIEW" });
        log("[Table]");
        boolean exists = false;
        while (rs.next()) {
            exists = true;
            String catalog = rs.getString("TABLE_CAT"); // null
            String schema = rs.getString("TABLE_SCHEM");
            String table = rs.getString("TABLE_NAME");
            String comment = rs.getString("REMARKS");
            log("catalog=" + catalog + ", schema=" + schema + ", table=" + table + ", comment=" + comment);
            assertNull(catalog);
            assertNotNull(schema);
            assertNotNull(table);
        }
        assertTrue(exists);
    }

    public void test_DatabaseMetaData_getTables_catalog() throws SQLException {
        DatabaseMetaData metaData = _conn.getMetaData();
        // catalog does not work!
        ResultSet rs = metaData.getTables("nextexampledb", "public", "%", new String[] { "TABLE", "VIEW" });
        log("[Table]");
        boolean exists = false;
        while (rs.next()) {
            exists = true;
            String catalog = rs.getString("TABLE_CAT"); // null
            String schema = rs.getString("TABLE_SCHEM");
            String table = rs.getString("TABLE_NAME");
            String comment = rs.getString("REMARKS");
            log("catalog=" + catalog + ", schema=" + schema + ", table=" + table + ", comment=" + comment);
            assertNull(catalog);
            assertNotNull(schema);
            assertEquals("public", schema);
            assertNotNull(table);
        }
        assertTrue(exists);
    }

    public void test_DatabaseMetaData_getTables_schema() throws SQLException {
        DatabaseMetaData metaData = _conn.getMetaData();
        // catalog does not work!
        ResultSet rs = metaData.getTables("exampledb", "nextschema", "%", new String[] { "TABLE", "VIEW" });
        log("[Table]");
        boolean exists = false;
        while (rs.next()) {
            exists = true;
            String catalog = rs.getString("TABLE_CAT"); // null
            String schema = rs.getString("TABLE_SCHEM");
            String table = rs.getString("TABLE_NAME");
            String comment = rs.getString("REMARKS");
            log("catalog=" + catalog + ", schema=" + schema + ", table=" + table + ", comment=" + comment);
            assertNull(catalog);
            assertNotNull(schema);
            assertEquals("nextschema", schema);
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
            String catalog = rs.getString("TABLE_CAT"); // null
            String schema = rs.getString("TABLE_SCHEM");
            String table = rs.getString("TABLE_NAME");
            String comment = rs.getString("REMARKS");
            log("catalog=" + catalog + ", schema=" + schema + ", table=" + table + ", comment=" + comment);
            assertNull(catalog);
            assertNotNull(schema);
            assertTrue("public".equals(schema) || "nextschema".equals(schema));
            assertNotNull(table);
        }
        assertTrue(exists);
    }

    public void test_DatabaseMetaData_getTables_schema_null() throws SQLException {
        DatabaseMetaData metaData = _conn.getMetaData();
        ResultSet rs = metaData.getTables("exampledb", null, "%", new String[] { "TABLE", "VIEW" });
        log("[Table]");
        boolean exists = false;
        while (rs.next()) {
            exists = true;
            String catalog = rs.getString("TABLE_CAT"); // null
            String schema = rs.getString("TABLE_SCHEM");
            String table = rs.getString("TABLE_NAME");
            String comment = rs.getString("REMARKS");
            log("catalog=" + catalog + ", schema=" + schema + ", table=" + table + ", comment=" + comment);
            assertNull(catalog);
            assertNotNull(schema);
            assertTrue("public".equals(schema) || "nextschema".equals(schema));
            assertNotNull(table);
        }
        assertTrue(exists);
    }

    // -----------------------------------------------------
    //                                          getColumns()
    //                                          ------------
    public void test_DatabaseMetaData_getColumns() throws SQLException {
        DatabaseMetaData metaData = _conn.getMetaData();
        ResultSet rs = metaData.getColumns("exampledb", "public", "member", null);
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
            assertNull(catalog);
            assertNotNull(schema);
            assertNotNull(column);
        }
        assertTrue(exists);
    }

    public void test_DatabaseMetaData_getColumns_nextSchema() throws SQLException {
        DatabaseMetaData metaData = _conn.getMetaData();
        String tableDbName = NextSchemaProductDbm.getInstance().getTableDbName();
        ResultSet rs = metaData.getColumns(null, "nextschema", tableDbName, null);
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
            assertNull(catalog);
            assertNotNull(schema);
            assertNotNull(column);
        }
        assertTrue(exists);
    }

    // -----------------------------------------------------
    //                                     getImportedKeys()
    //                                     -----------------
    public void test_DatabaseMetaData_getImportedKeys_basic() throws SQLException {
        DatabaseMetaData metaData = getDataSource().getConnection().getMetaData();
        String tableDbName = PurchaseDbm.getInstance().getTableDbName();
        ResultSet rs = metaData.getImportedKeys("exampledb", "public", tableDbName);
        boolean exists = false;
        int count = 0;
        Set<String> fkSet = new HashSet<String>();
        while (rs.next()) {
            exists = true;
            String catalog = rs.getString(1); // null
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
            assertNull(catalog);
            assertNotNull(schema);
            assertNotNull(foreignTable);
            assertNotNull(foreignColumn);
        }
        assertTrue(exists);
        assertEquals(count, fkSet.size());
    }

    // -----------------------------------------------------
    //                                        getIndexInfo()
    //                                        --------------
    public void test_DatabaseMetaData_getIndexInfo_unique() throws SQLException {
        DatabaseMetaData metaData = getDataSource().getConnection().getMetaData();
        String tableDbName = PurchaseDbm.getInstance().getTableDbName();
        ResultSet rs = metaData.getIndexInfo("exampledb", "public", tableDbName, true, true);
        boolean exists = false;
        while (rs.next()) {
            exists = true;
            String catalog = rs.getString(1); // null
            String schema = rs.getString(2);
            Boolean nonUnique = rs.getBoolean(4);
            String unique = rs.getString(6);
            String position = rs.getString(8);
            String columnName = rs.getString(9);

            log("[" + unique + "]");
            log("  " + catalog + "." + schema + ": " + columnName + ", " + position + ", " + nonUnique);
            assertNull(catalog);
            assertNotNull(schema);
            assertNotNull(unique);
            assertFalse(nonUnique);
        }
        assertTrue(exists);
    }

    public void test_DatabaseMetaData_getIndexInfo_with_nonUnique() throws SQLException {
        DatabaseMetaData metaData = getDataSource().getConnection().getMetaData();
        String tableDbName = PurchaseDbm.getInstance().getTableDbName();
        ResultSet rs = metaData.getIndexInfo("exampledb", "public", tableDbName, false, true);
        boolean exists = false;
        boolean existsNonUnique = false;
        while (rs.next()) {
            exists = true;
            String catalog = rs.getString(1); // null
            String schema = rs.getString(2);
            Boolean nonUnique = rs.getBoolean(4);
            String index = rs.getString(6);
            String position = rs.getString(8);
            String columnName = rs.getString(9);

            log("[" + index + "]");
            log("  " + catalog + "." + schema + ": " + columnName + ", " + position + ", " + nonUnique);
            assertNull(catalog);
            assertNotNull(schema);
            assertNotNull(index);
            assertNotNull(nonUnique);
            if (nonUnique) {
                existsNonUnique = true;
            }
        }
        assertTrue(exists);
        assertTrue(existsNonUnique);
    }

    // -----------------------------------------------------
    //                                       getProcedures()
    //                                       ---------------
    public void test_DatabaseMetaData_getProcedures_mainSchema() throws SQLException {
        DatabaseMetaData metaData = _conn.getMetaData();
        ResultSet rs = metaData.getProcedures("exampledb", "public", null);
        boolean exists = false;
        log("[Procedure]");
        while (rs.next()) {
            exists = true;
            String catalog = rs.getString("PROCEDURE_CAT"); // null
            String schema = rs.getString("PROCEDURE_SCHEM");
            String procedure = rs.getString("PROCEDURE_NAME");
            Integer procedureType = new Integer(rs.getString("PROCEDURE_TYPE"));
            log(catalog + "." + schema + "." + procedure + ", type=" + procedureType);
            assertNull(catalog);
            assertNotNull(schema);
            assertNotNull(procedure);
            assertNotNull(procedureType);
        }
        assertTrue(exists);
    }

    public void test_DatabaseMetaData_getProcedures_nextSchema() throws SQLException {
        DatabaseMetaData metaData = _conn.getMetaData();
        ResultSet rs = metaData.getProcedures("exampledb", "nextschema", null);
        boolean exists = false;
        log("[Procedure]");
        while (rs.next()) {
            exists = true;
            String catalog = rs.getString("PROCEDURE_CAT"); // null
            String schema = rs.getString("PROCEDURE_SCHEM");
            String procedure = rs.getString("PROCEDURE_NAME");
            Integer procedureType = new Integer(rs.getString("PROCEDURE_TYPE"));
            log(catalog + "." + schema + "." + procedure + ", type=" + procedureType);
            assertNull(catalog);
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
        ResultSet rs = metaData.getProcedures("exampledb", "public", null);
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
                assertNull(precision);
                assertNull(length);
                assertNull(scale);
                assertNotNull(dataType);
            }
        }
        assertTrue(exists);
    }

    public void test_DatabaseMetaData_getProcedureColumns_nextSchema() throws SQLException {
        DatabaseMetaData metaData = _conn.getMetaData();
        ResultSet rs = metaData.getProcedures("exampledb", "nextschema", null);
        boolean exists = false;
        log("[Procedure]");
        while (rs.next()) {
            String catalog = rs.getString("PROCEDURE_CAT");
            String schema = rs.getString("PROCEDURE_SCHEM");
            String procedure = rs.getString("PROCEDURE_NAME");
            log(catalog + "." + schema + "." + procedure);
            ResultSet columnRs = metaData.getProcedureColumns(catalog, null, procedure, null);
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
                assertNull(precision);
                assertNull(length);
                assertNull(scale);
                assertNotNull(dataType);
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
    public void test_ResultSetMetaData_ReusltSetParameter() throws SQLException {
        ValueType valueType = TnValueTypes.POSTGRESQL_RESULT_SET;
        CallableStatement cs = null;
        ResultSet rs = null;
        try {
            cs = _conn.prepareCall("{call SP_RESULT_SET_PARAMETER(?)}");
            cs.registerOutParameter(1, valueType.getSqlType());
            boolean executed = cs.execute();
            log("executed = " + executed);
            rs = (ResultSet) valueType.getValue(cs, 1);
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();
            log("columnCount = " + columnCount);
            for (int i = 0; i < columnCount; i++) {
                int paramIndex = (i + 1);
                String columnLabel = metaData.getColumnLabel(paramIndex);
                String tableName = metaData.getTableName(paramIndex);
                log(tableName + "." + columnLabel);
                assertEquals("", tableName); // couldn't get related table
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

    public void test_ResultSetMetaData_returnValue() throws SQLException {
        ValueType valueType = TnValueTypes.POSTGRESQL_RESULT_SET;
        CallableStatement cs = null;
        ResultSet rs = null;
        try {
            _conn = getDataSource().getConnection();
            cs = _conn.prepareCall("{? = call SP_RETURN_RESULT_SET()}");
            cs.registerOutParameter(1, valueType.getSqlType());
            boolean executed = cs.execute();
            log("executed = " + executed);
            rs = (ResultSet) valueType.getValue(cs, 1);
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();
            log("columnCount = " + columnCount);
            for (int i = 0; i < columnCount; i++) {
                int paramIndex = (i + 1);
                String columnLabel = metaData.getColumnLabel(paramIndex);
                String columnName = metaData.getColumnName(paramIndex);
                String tableName = metaData.getTableName(paramIndex);
                log(tableName + "." + columnLabel + "(" + columnName + ")");
                assertEquals("", tableName); // couldn't get related table
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

    // ===================================================================================
    //                                                                   InformationSchema
    //                                                                   =================
    public void test_InformationSchema_sequences() throws SQLException {
        String sql = "select sequence_name, sequence_schema from information_schema.sequences";
        Statement st = null;
        ResultSet rs = null;
        try {
            _conn = getDataSource().getConnection();
            st = _conn.createStatement();
            rs = st.executeQuery(sql);
            log("[Sequence]");
            while (rs.next()) {
                String sequenceName = rs.getString("sequence_name");
                String sequenceSchema = rs.getString("sequence_schema");
                log(sequenceSchema + "." + sequenceName);
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (st != null) {
                st.close();
            }
        }
    }
}
