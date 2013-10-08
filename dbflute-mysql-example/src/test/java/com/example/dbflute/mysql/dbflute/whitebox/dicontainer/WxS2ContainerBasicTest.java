package com.example.dbflute.mysql.dbflute.whitebox.dicontainer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import javax.sql.DataSource;

import org.seasar.extension.jdbc.SqlLog;
import org.seasar.extension.jdbc.SqlLogRegistry;
import org.seasar.extension.jdbc.SqlLogRegistryLocator;
import org.seasar.extension.jdbc.impl.SqlLogRegistryImpl;

import com.example.dbflute.mysql.dbflute.allcommon.DBFluteConfig;
import com.example.dbflute.mysql.dbflute.allcommon.DBFluteInitializer;
import com.example.dbflute.mysql.dbflute.cbean.MemberCB;
import com.example.dbflute.mysql.dbflute.exbhv.MemberBhv;
import com.example.dbflute.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.5 (2009/04/08 Wednesday)
 */
public class WxS2ContainerBasicTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private MemberBhv memberBhv;

    // ===================================================================================
    //                                                                  DBFluteInitializer
    //                                                                  ==================
    public void test_DBFluteInitializer_initializing() {
        // ## Arrange ##
        final Set<String> markSet = new HashSet<String>();
        final DBFluteConfig config = DBFluteConfig.getInstance();
        config.unlock();

        // ## Act ##
        new DBFluteInitializer() {
            @Override
            protected void loadCoolClasses() {
                markSet.add("loadCoolClasses");
                super.loadCoolClasses();
            }

            @Override
            protected void handleSqlLogRegistry() {
                markSet.add("handleSqlLogRegistry");
                super.handleSqlLogRegistry();
            }
        };

        // ## Assert ##
        assertTrue(config.isLocked());
        assertTrue(markSet.contains("loadCoolClasses"));
        assertTrue(markSet.contains("handleSqlLogRegistry"));
    }

    // ===================================================================================
    //                                                                       SqlLogRegistr
    //                                                                       =============
    public void test_SqlLogRegistry_HowToUse() {
        { // Confirm default setting at first
            final SqlLogRegistry sqlLogRegistry = SqlLogRegistryLocator.getInstance();
            assertNull(sqlLogRegistry);
        }
        { // Initialize
            SqlLogRegistryLocator.setInstance(new SqlLogRegistryImpl());
        }
        { // Nothing before executing SQL
            final SqlLogRegistry sqlLogRegistry = SqlLogRegistryLocator.getInstance();
            assertNotNull(sqlLogRegistry);
            final SqlLog lastSqlLog = sqlLogRegistry.getLast();
            assertNull(lastSqlLog);
        }
        { // Execute SQL
            final MemberCB cb = new MemberCB();
            cb.query().setMemberAccount_PrefixSearch("Sto");
            memberBhv.selectList(cb);
        }
        final String firstSql;
        { // Get sqlLog after executing SQL
            final SqlLogRegistry sqlLogRegistry = SqlLogRegistryLocator.getInstance();
            assertNotNull(sqlLogRegistry);
            final SqlLog lastSqlLog = sqlLogRegistry.getLast();
            assertNotNull(lastSqlLog);
            final String completeSql = lastSqlLog.getCompleteSql();
            final StringBuilder sb = new StringBuilder();
            sb.append(ln());
            sb.append("/= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = ").append(ln());
            sb.append(completeSql).append(ln());
            sb.append("= = = = = = = = = =/");
            log(sb);
            assertNotNull(completeSql);
            firstSql = completeSql;
        }
        {// Execute SQL again
            final MemberCB cb = new MemberCB();
            cb.query().setMemberId_GreaterEqual(123);
            cb.query().addOrderBy_Birthdate_Desc();
            cb.fetchFirst(3);
            cb.fetchPage(2);
            memberBhv.selectList(cb);
        }
        final String secondSql;
        { // Get sqlLog again
            final SqlLogRegistry sqlLogRegistry = SqlLogRegistryLocator.getInstance();
            assertNotNull(sqlLogRegistry);
            final SqlLog lastSqlLog = sqlLogRegistry.getLast();
            assertNotNull(lastSqlLog);
            final String completeSql = lastSqlLog.getCompleteSql();
            final StringBuilder sb = new StringBuilder();
            sb.append(ln());
            sb.append("/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ").append(ln());
            sb.append(completeSql).append(ln());
            sb.append("* * * * * * * * * */");
            log(sb);
            assertNotNull(completeSql);
            secondSql = completeSql;
        }
        assertNotSame(firstSql, secondSql);
    }

    // ===================================================================================
    //                                                                          DataSource
    //                                                                          ==========
    public void test_DataSource_Connection_always_close() throws SQLException {
        Connection conn = null;
        DataSource dataSource = getDataSource();

        conn = dataSource.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("select * from MEMBER");
            ps.execute();
            ps.close();
        } finally {
            conn.close();
        }
        conn = dataSource.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("update MEMBER set MEMBER_NAME = ? where MEMBER_ID = 3");
            ps.setString(1, "aaa");
            ps.execute();
            ps.close();
        } finally {
            conn.close();
        }
        conn = dataSource.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("select * from MEMBER");
            ps.execute();
            ps.close();
        } finally {
            conn.close();
        }
    }

    public void test_DataSource_same_Connection() throws SQLException {
        Connection conn = null;
        DataSource dataSource = getDataSource();

        conn = dataSource.getConnection();
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("select * from MEMBER");
            ps.execute();
            ps.close();
            ps = conn.prepareStatement("update MEMBER set MEMBER_NAME = ? where MEMBER_ID = 3");
            ps.setString(1, "aaa");
            ps.execute();
            ps.close();
            ps = conn.prepareStatement("select * from MEMBER");
            ps.execute();
            ps.close();
        } finally {
            conn.close();
        }
    }
}
