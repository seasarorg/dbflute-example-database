package com.example.dbflute.mysql.dbflute.allcommon;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.dbflute.jdbc.StatementConfig;
import org.seasar.dbflute.s2dao.extension.TnSqlLogRegistry;

import com.example.dbflute.mysql.dbflute.cbean.MemberCB;
import com.example.dbflute.mysql.dbflute.exbhv.MemberBhv;
import com.example.dbflute.mysql.dbflute.exentity.Member;
import com.example.dbflute.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.6.2 (2008/01/26 Saturday)
 */
public class DBFluteConfigTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MemberBhv memberBhv;

    // ===================================================================================
    //                                                                              Set up
    //                                                                              ======
    /**
     * DBFluteConfigの設定をする実装。
     * <p>
     * 必ずContainerの初期化前に設定をすること。
     * </p>
     * <p>
     * デフォルトでロックが掛かっているので、そのロックを外してから設定する。
     * Containerの初期化時に自動的に再度ロックが掛かるようになっている。
     * </p>
     * 設定できる項目は以下の通り：
     * </p>
     * <ul>
     *     <li>StatementConfig</li>
     *     <li>InternalDebug</li>
     *     <li>UseSqlLogRegistry</li>
     * </ul>
     * <p>
     * StatementConfigは以下の通り：
     * </p>
     * <ul>
     *     <li>ResultSetType</li>
     *     <li>QueryTimeout</li>
     *     <li>FetchSize</li>
     *     <li>MaxRows</li>
     * </ul>
     * <p>
     * InternalDebugは「DBFluteの内部的なデバッグログ出力を有効にするか否か」を示すが、
     * よほどのことがない限り開発中でもtrueにする必要はない。
     * </p>
     * @throws Throwable
     */
    @Override
    public void setUp() throws Exception {
        // ロックを外す
        DBFluteConfig.getInstance().unlock();

        // StatementConfig(お試しとしてここでは色々設定)
        final StatementConfig config = new StatementConfig();
        config.typeForwardOnly().queryTimeout(10).fetchSize(7).maxRows(3);
        DBFluteConfig.getInstance().setDefaultStatementConfig(config);

        // InternalDebug(テストということでここではtrue)
        DBFluteConfig.getInstance().setInternalDebug(true);

        // UseSqlLogRegistry(テストということでここではtrue)
        DBFluteConfig.getInstance().setUseSqlLogRegistry(true);

        // Containerの初期化が始まり、再度ロックが掛かる
        super.setUp();
    }

    /**
     * JUnit上だけの話ではあるが、最後にクリアすること。
     * でないと、一括実行時に他のテストに影響してしまうため。
     * @throws Exception 
     */
    @Override
    public void tearDown() throws Exception {
        super.tearDown();
        DBFluteConfig.getInstance().unlock();
        DBFluteConfig.getInstance().setDefaultStatementConfig(null);
        DBFluteConfig.getInstance().setInternalDebug(false);
        DBFluteConfig.getInstance().setUseSqlLogRegistry(false);
        DBFluteConfig.getInstance().lock();
    }

    @Override
    protected boolean isUseOneTimeContainer() {
        return true;
    }

    // ===================================================================================
    //                                                                                Lock
    //                                                                                ====
    public void test_defaultStatementConfig() throws Exception {
        // ## Arrange & Act & Assert ##
        assertNotNull(DBFluteConfig.getInstance().getDefaultStatementConfig());
    }

    public void test_setInternalDebug_Locked() throws Exception {
        // ## Arrange & Act & Assert ##
        assertTrue(DBFluteConfig.getInstance().isInternalDebug());
    }

    /**
     * DBFluteConfigで設定することで利用可能なはず
     */
    public void test_SqlLogRegistry() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.query().setMemberName_PrefixSearch("S");
        memberBhv.selectList(cb);
        memberBhv.selectCount(cb);
        cb.fetchFirst(3);
        memberBhv.selectList(cb);
        memberBhv.selectCount(cb);

        // ## Act ##
        String displaySql = TnSqlLogRegistry.peekCompleteSql();

        // ## Assert ##
        log(displaySql);
        assertNotNull(displaySql);
    }

    // ===================================================================================
    //                                                                    Statement Config
    //                                                                    ================
    public void test_ConditionBean_configure_Config_is_Request() throws Exception {
        // ## Arrange ##
        final MemberCB cb = new MemberCB();
        final StatementConfig statementConfig = new StatementConfig();
        statementConfig.typeScrollSensitive().fetchSize(123).maxRows(1);
        cb.configure(statementConfig);

        // ## Act ##
        final ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertEquals(1, memberList.size());
    }

    public void test_ConditionBean_no_configure_Config_is_Default() throws Exception {
        // ## Arrange ##
        final MemberCB cb = new MemberCB();

        // ## Act ##
        final ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertEquals(3, memberList.size());
    }

    public void test_StatementConfig_check_select_insert_update_delete() {
        // ## Arrange ##
        Member member = new Member();
        member.setMemberName("testName");
        member.setMemberAccount("testAccount");
        member.setMemberStatusCode_Formalized();

        // ## Act & Assert ##
        // Expect no exception!
        memberBhv.selectByPKValueWithDeletedCheck(3);
        memberBhv.insert(member);
        memberBhv.updateNonstrict(member);
        memberBhv.deleteNonstrict(member);
    }

    // ===================================================================================
    //                                                                          Log Format
    //                                                                          ==========
    public void test_LogDateFormat_basic() {
        // ## Arrange ##
        Calendar cal = Calendar.getInstance();
        cal.set(2008, 5, 15, 12, 34, 56);
        cal.set(Calendar.MILLISECOND, 123);
        MemberCB cb = new MemberCB();
        cb.query().setBirthdate_GreaterEqual(new Date(cal.getTimeInMillis()));
        String beforeSql = cb.toDisplaySql();
        log(beforeSql);
        assertTrue(beforeSql.contains("'2008-06-15'"));
        try {
            DBFluteConfig.getInstance().unlock();
            DBFluteConfig.getInstance().setLogDateFormat("yyyy/MM/dd HH$mm$ss.SSS");
            // ## Act & Assert ##
            String sql = cb.toDisplaySql();
            log(sql);
            assertTrue("sql:\n" + sql, sql.contains("'2008/06/15 12$34$56.123'"));
        } finally {
            DBFluteConfig.getInstance().setLogDateFormat(null);
            DBFluteConfig.getInstance().lock();
        }
    }

    public void test_LogDateFormat_prefixSuffix() {
        // ## Arrange ##
        Calendar cal = Calendar.getInstance();
        cal.set(2008, 5, 15, 12, 34, 56);
        cal.set(Calendar.MILLISECOND, 123);
        MemberCB cb = new MemberCB();
        cb.query().setBirthdate_GreaterEqual(new Date(cal.getTimeInMillis()));
        String beforeSql = cb.toDisplaySql();
        log(beforeSql);
        assertTrue(beforeSql.contains("'2008-06-15'"));
        try {
            DBFluteConfig.getInstance().unlock();
            DBFluteConfig.getInstance().setLogDateFormat("date $df:{yyyy/MM/dd HH$mm$ss.SSS}");
            // ## Act & Assert ##
            String sql = cb.toDisplaySql();
            log(sql);
            assertTrue("sql:\n" + sql, sql.contains("date '2008/06/15 12$34$56.123'"));
        } finally {
            DBFluteConfig.getInstance().setLogDateFormat(null);
            DBFluteConfig.getInstance().lock();
        }
    }

    public void test_LogTimestampFormat_basic() {
        // ## Arrange ##
        Calendar cal = Calendar.getInstance();
        cal.set(2008, 5, 15, 12, 34, 56);
        cal.set(Calendar.MILLISECOND, 123);
        MemberCB cb = new MemberCB();
        cb.query().setFormalizedDatetime_GreaterEqual(new Timestamp(cal.getTimeInMillis()));
        String beforeSql = cb.toDisplaySql();
        log(beforeSql);
        assertTrue(beforeSql.contains("'2008-06-15 12:34:56.123'"));
        try {
            DBFluteConfig.getInstance().unlock();
            DBFluteConfig.getInstance().setLogTimestampFormat("yyyy/MM/dd HH-mm-ss.SSS");
            // ## Act & Assert ##
            String sql = cb.toDisplaySql();
            log(sql);
            assertTrue(sql.contains("'2008/06/15 12-34-56.123'"));
        } finally {
            DBFluteConfig.getInstance().setLogTimestampFormat(null);
            DBFluteConfig.getInstance().lock();
        }
    }

    public void test_LogTimestampFormat_prefixSuffix() {
        // ## Arrange ##
        Calendar cal = Calendar.getInstance();
        cal.set(2008, 5, 15, 12, 34, 56);
        cal.set(Calendar.MILLISECOND, 123);
        MemberCB cb = new MemberCB();
        cb.query().setFormalizedDatetime_GreaterEqual(new Timestamp(cal.getTimeInMillis()));
        String beforeSql = cb.toDisplaySql();
        log(beforeSql);
        assertTrue(beforeSql.contains("'2008-06-15 12:34:56.123'"));
        try {
            DBFluteConfig.getInstance().unlock();
            DBFluteConfig.getInstance().setLogTimestampFormat("timestamp $df:{yyyy/MM/dd HH-mm-ss.SSS}");
            // ## Act & Assert ##
            String sql = cb.toDisplaySql();
            log(sql);
            assertTrue(sql.contains("timestamp '2008/06/15 12-34-56.123'"));
        } finally {
            DBFluteConfig.getInstance().setLogTimestampFormat(null);
            DBFluteConfig.getInstance().lock();
        }
    }
}
