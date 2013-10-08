package com.example.dbflute.oracle.dbflute.vendor;

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

import com.example.dbflute.oracle.dbflute.bsentity.dbmeta.MemberDbm;
import com.example.dbflute.oracle.dbflute.bsentity.dbmeta.PurchaseDbm;
import com.example.dbflute.oracle.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.8.8 (2009/01/06 Tuesday)
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
    public void test_DatabaseMetaData_getTables_mainSchemaSynonym() throws SQLException {
        DatabaseMetaData metaData = _conn.getMetaData();
        ResultSet rs = metaData.getTables(null, "EXAMPLEDB", null, new String[] { "SYNONYM" });
        log("[EXAMPLEDB]");
        while (rs.next()) {
            String tableName = rs.getString(3);
            String tableType = rs.getString(4);
            String schema = rs.getString("TABLE_SCHEM");
            log(schema + "." + tableName + "(" + tableType + ")");
        }
    }

    public void test_DatabaseMetaData_getTables_nextSchemaSynonym_withAuth() throws SQLException {
        DatabaseMetaData metaData = _conn.getMetaData();
        ResultSet rs = metaData.getTables(null, "NEXTEXAMPLEDB", null, new String[] { "SYNONYM" });
        boolean exists = false;
        log("[NEXTEXAMPLEDB]");
        while (rs.next()) {
            String tableName = rs.getString(3);
            String tableType = rs.getString(4);
            String schema = rs.getString("TABLE_SCHEM");
            log(schema + "." + tableName + "(" + tableType + ")");
            if (tableName.equalsIgnoreCase("VD_NEXT_SYNONYM_SECRET_AUTH")) {
                exists = true;
            }
        }
        assertFalse(exists); // Oops!
    }

    // -----------------------------------------------------
    //                                          getColumns()
    //                                          ------------
    public void test_DatabaseMetaData_getColumns_sameNameTable_basic() throws SQLException {
        DatabaseMetaData metaData = _conn.getMetaData();

        ResultSet rs = metaData.getColumns(null, "EXAMPLEDB", "WHITE_SAME_NAME_REF_REF", null);
        boolean exists = false;
        while (rs.next()) {
            exists = true;
            String schemaName = rs.getString("TABLE_SCHEM");
            String tableName = rs.getString("TABLE_NAME");
            String columnName = rs.getString("COLUMN_NAME");
            log(schemaName + "." + tableName + "." + columnName);
        }
        assertTrue(exists);
    }

    public void test_DatabaseMetaData_getColumns_Synonym_basic() throws SQLException {
        DatabaseMetaData metaData = _conn.getMetaData();

        ResultSet rs = metaData.getColumns(null, "EXAMPLEDB", "SYNONYM_MEMBER", null);
        boolean exists = false;
        while (rs.next()) {
            exists = true;
            String schemaName = rs.getString("TABLE_SCHEM");
            String tableName = rs.getString("TABLE_NAME");
            String columnName = rs.getString("COLUMN_NAME");
            log(schemaName + "." + tableName + "." + columnName);
        }
        assertTrue(exists);
    }

    // -- for the test of synonym referring to the same-name table as one on this schema
    // -- LoadDataReverse is unsupported in this pattern so comment it out
    //public void test_DatabaseMetaData_getColumns_Synonym_sameName() throws SQLException {
    //    DatabaseMetaData metaData = _conn.getMetaData();
    //
    //    ResultSet rs = metaData.getColumns(null, "EXAMPLEDB", "SYNONYM_NEXT_SAME_NAME_DIFF", null);
    //    boolean exists = false;
    //    while (rs.next()) {
    //        exists = true;
    //        String schemaName = rs.getString("TABLE_SCHEM");
    //        String tableName = rs.getString("TABLE_NAME");
    //        String columnName = rs.getString("COLUMN_NAME");
    //        log(schemaName + "." + tableName + "." + columnName);
    //    }
    //    assertTrue(exists);
    //}

    public void test_DatabaseMetaData_getColumns_Synonym_DBLink() throws SQLException {
        DatabaseMetaData metaData = _conn.getMetaData();

        ResultSet rs = metaData.getColumns(null, "EXAMPLEDB", "SYNONYM_NEXT_LINK_SECRET", null);
        boolean exists = false;
        while (rs.next()) {
            exists = true;
            String schemaName = rs.getString("TABLE_SCHEM");
            String tableName = rs.getString("TABLE_NAME");
            String columnName = rs.getString("COLUMN_NAME");
            log(schemaName + "." + tableName + "." + columnName);
        }
        assertFalse(exists); // cannot get columns of DB link from JDBC!
    }

    // -----------------------------------------------------
    //                                      getPrimaryKeys()
    //                                      ----------------
    public void test_DatabaseMetaData_getPrimaryKeys() throws SQLException {
        DatabaseMetaData metaData = _conn.getMetaData();
        ResultSet rs = metaData.getPrimaryKeys(null, null, MemberDbm.getInstance().getTableDbName());
        log("[PrimaryKey]");
        boolean exists = false;
        while (rs.next()) {
            exists = true;
            String pkName = rs.getString("PK_NAME");
            String columnName = rs.getString("COLUMN_NAME");
            log(pkName + ": " + columnName);
        }
        assertTrue(exists);
    }

    // -----------------------------------------------------
    //                                     getImportedKeys()
    //                                     -----------------
    public void test_DatabaseMetaData_getImportedKeys_basic() throws SQLException {
        DatabaseMetaData metaData = _conn.getMetaData();
        String tableDbName = PurchaseDbm.getInstance().getTableDbName();
        ResultSet rs = metaData.getImportedKeys(null, "EXAMPLEDB", tableDbName);
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
        // Oracle does NOT returns to-SYNONYM foreign key (It's normal)
        assertEquals(count, fkSet.size());
    }

    // -----------------------------------------------------
    //                                       getProcedures()
    //                                       ---------------
    public void test_DatabaseMetaData_getProcedures_mainSchema() throws SQLException {
        DatabaseMetaData metaData = _conn.getMetaData();
        ResultSet rs = metaData.getProcedures(null, "EXAMPLEDB", null);
        boolean exists = false;
        boolean existsCatalog = false;
        boolean notexistsCatalog = false;
        log("[Procedure]");
        while (rs.next()) {
            exists = true;
            String catalog = rs.getString("PROCEDURE_CAT"); // package
            String schema = rs.getString("PROCEDURE_SCHEM");
            String procedure = rs.getString("PROCEDURE_NAME");
            Integer procedureType = new Integer(rs.getString("PROCEDURE_TYPE"));
            log(schema + "." + catalog + "." + procedure + ", type=" + procedureType);
            if (catalog != null) {
                existsCatalog = true;
            } else {
                notexistsCatalog = true;
            }
            assertNotNull(schema);
            assertNotNull(procedure);
            assertNotNull(procedureType);
        }
        assertTrue(exists);
        assertTrue(existsCatalog);
        assertTrue(notexistsCatalog);
    }

    public void test_DatabaseMetaData_getProcedures_nextSchema() throws SQLException {
        DatabaseMetaData metaData = _conn.getMetaData();
        ResultSet rs = metaData.getProcedures(null, "NEXTEXAMPLEDB", null);
        boolean exists = false;
        boolean existsCatalog = false;
        boolean notexistsCatalog = false;
        log("[Procedure]");
        while (rs.next()) {
            exists = true;
            String catalog = rs.getString("PROCEDURE_CAT"); // package
            String schema = rs.getString("PROCEDURE_SCHEM");
            String procedure = rs.getString("PROCEDURE_NAME");
            Integer procedureType = new Integer(rs.getString("PROCEDURE_TYPE"));
            log(schema + "." + catalog + "." + procedure + ", type=" + procedureType);
            if (catalog != null) {
                existsCatalog = true;
            } else {
                notexistsCatalog = true;
            }
            assertNotNull(schema);
            assertNotNull(procedure);
            assertNotNull(procedureType);
        }
        assertTrue(exists);
        assertTrue(existsCatalog);
        assertTrue(notexistsCatalog);
    }

    // -----------------------------------------------------
    //                                 getProcedureColumns()
    //                                 ---------------------
    public void test_DatabaseMetaData_getProcedureColumns_mainSchema_basic() throws SQLException {
        DatabaseMetaData metaData = _conn.getMetaData();
        ResultSet rs = metaData.getProcedures(null, "EXAMPLEDB", null);
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
                //assertNotNull(columnName); null or not null
                assertNotNull(columnType);
                assertNotNull(typeName);
                //assertNull(precision); null or not null
                //assertNull(length); null or not null
                assertNull(scale);
                assertNotNull(dataType);
            }
        }
        assertTrue(exists);
    }

    public void test_DatabaseMetaData_getProcedureColumns_mainSchema_package_basic() throws SQLException {
        DatabaseMetaData metaData = _conn.getMetaData();
        ResultSet rs = metaData.getProcedures("MAIN_PKG", "EXAMPLEDB", null);
        boolean exists = false;
        log("[Procedure]");
        while (rs.next()) {
            String catalog = rs.getString("PROCEDURE_CAT");
            String schema = rs.getString("PROCEDURE_SCHEM");
            String procedure = rs.getString("PROCEDURE_NAME");
            // if catalog argument is null, it also gets same name procedure of other package
            ResultSet columnRs = metaData.getProcedureColumns("MAIN_PKG", schema, procedure, null);
            log("catalog=" + catalog + ", schema=" + schema + ", procedure=" + procedure);
            while (columnRs.next()) {
                exists = true;
                String columnName = columnRs.getString("COLUMN_NAME");
                String typeName = columnRs.getString("TYPE_NAME");
                log("  column=" + columnName + ", type=" + typeName);
            }
        }
        assertTrue(exists);
    }

    public void test_DatabaseMetaData_getProcedureColumns_mainSchema_package_qualifiedName() throws SQLException {
        DatabaseMetaData metaData = _conn.getMetaData();
        ResultSet rs = metaData.getProcedures("MAIN_PKG", "EXAMPLEDB", null);
        log("[Procedure]");
        while (rs.next()) {
            String catalog = rs.getString("PROCEDURE_CAT");
            String schema = rs.getString("PROCEDURE_SCHEM");
            String procedure = rs.getString("PROCEDURE_NAME");
            // don't use qualified name for procedure name argument
            String qualifiedName = catalog + "." + procedure;
            ResultSet columnRs = metaData.getProcedureColumns("MAIN_PKG", schema, qualifiedName, null);
            log("catalog=" + catalog + ", schema=" + schema + ", procedure=" + procedure);
            while (columnRs.next()) {
                fail();
            }
        }
    }

    public void test_DatabaseMetaData_getProcedureColumns_nextSchema_basic() throws SQLException {
        DatabaseMetaData metaData = _conn.getMetaData();
        ResultSet rs = metaData.getProcedures(null, "NEXTEXAMPLEDB", null);
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
                //assertNotNull(columnName); null or not null
                assertNotNull(columnType);
                assertNotNull(typeName);
                //assertNull(precision); null or not null
                //assertNull(length); null or not null
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
    public void test_ResultSetMetaData_resultSetParameter_more() throws SQLException {
        ValueType valueType = TnValueTypes.ORACLE_RESULT_SET;
        Connection conn = null;
        CallableStatement cs = null;
        ResultSet rs = null;
        try {
            conn = getDataSource().getConnection();
            cs = conn.prepareCall("{call SP_RESULT_SET_PARAMETER_MORE(?, ?)}");
            cs.registerOutParameter(1, valueType.getSqlType());
            cs.registerOutParameter(2, valueType.getSqlType());
            boolean executed = cs.execute();
            log("executed = " + executed);
            rs = (ResultSet) valueType.getValue(cs, 1);
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();
            log("columnCount = " + columnCount);
            for (int i = 0; i < columnCount; i++) {
                String columnLabel = metaData.getColumnLabel(i + 1);
                log(columnLabel);
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (cs != null) {
                cs.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }

    // -----------------------------------------------------
    //                                               DB Link
    //                                               -------
    public void test_ResultSetMetaData_for_DBLink() throws SQLException {
        Connection conn = getDataSource().getConnection();
        Statement st = null;
        ResultSet rs = null;
        try {
            st = conn.createStatement();
            rs = st.executeQuery("select * from EXAMPLEDB.SYNONYM_NEXT_LINK_SECRET where 0=1");
            ResultSetMetaData metaData = rs.getMetaData();
            int count = metaData.getColumnCount();
            boolean exists = false;
            for (int i = 0; i < count; i++) {
                exists = true;
                int index = i + 1;
                String columnName = metaData.getColumnName(index);
                int columnType = metaData.getColumnType(index);
                String columnTypeName = metaData.getColumnTypeName(index);
                int precision = metaData.getPrecision(index);
                int scale = metaData.getScale(index);
                log(columnName + ", " + columnType + ", " + columnTypeName + "(" + precision + "," + scale + ")");
            }
            assertTrue(exists);
        } finally {
            if (conn != null) {
                conn.close();
            }
            if (st != null) {
                st.close();
            }
            if (rs != null) {
                rs.close();
            }
        }
    }
}