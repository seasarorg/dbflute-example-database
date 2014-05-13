package com.example.dbflute.oracle.dbflute.whitebox;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.seasar.dbflute.CallbackContext;
import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.cbean.coption.LikeSearchOption;
import org.seasar.dbflute.dbway.DBWay;
import org.seasar.dbflute.dbway.WayOfOracle;
import org.seasar.dbflute.jdbc.SqlLogHandler;
import org.seasar.dbflute.jdbc.SqlLogInfo;
import org.seasar.dbflute.util.DfCollectionUtil;

import com.example.dbflute.oracle.dbflute.allcommon.DBCurrent;
import com.example.dbflute.oracle.dbflute.cbean.MemberCB;
import com.example.dbflute.oracle.dbflute.exbhv.MemberBhv;
import com.example.dbflute.oracle.dbflute.exbhv.pmbean.SimpleMemberPmb;
import com.example.dbflute.oracle.dbflute.exentity.Member;
import com.example.dbflute.oracle.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 1.0.5B (2013/01/03 Friday)
 */
public class WxSwitchDBWayTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private MemberBhv memberBhv;

    // ===================================================================================
    //                                                                             Setting
    //                                                                             =======
    @Override
    public void tearDown() throws Exception {
        DBCurrent.getInstance().currentDBDef().lock();
        super.tearDown();
    }

    // ===================================================================================
    //                                                                       ConditionBean
    //                                                                       =============
    public void test_LikeSearch_WildCard_DoubleByte_ConditionBean_default() {
        // ## Arrange ##
        final Set<SqlLogInfo> logInfoSet = new HashSet<SqlLogInfo>();
        CallbackContext.setSqlLogHandlerOnThread(new SqlLogHandler() {
            public void handle(SqlLogInfo info) {
                logInfoSet.add(info);
            }
        });
        try {
            // ## Act ##
            String keyword = "100％ジュー%ス|和歌_山＿テ";
            MemberCB cb = new MemberCB();
            cb.query().setMemberName_LikeSearch(keyword, new LikeSearchOption().likeContain());
            memberBhv.selectList(cb);

            // ## Assert ##
            SqlLogInfo logInfo = logInfoSet.iterator().next();
            String sql = logInfo.getDisplaySql();
            assertTrue(sql.contains("100|％ジュー|%ス||和歌|_山|＿テ"));
        } finally {
            CallbackContext.clearCallbackContextOnThread();
        }
    }

    public void test_LikeSearch_WildCard_DoubleByte_ConditionBean_suppress_query() {
        // ## Arrange ##
        DBDef currentDBDef = DBCurrent.getInstance().currentDBDef();
        DBWay original = switchOracleDBWay(currentDBDef);
        final Set<SqlLogInfo> logInfoSet = new HashSet<SqlLogInfo>();
        CallbackContext.setSqlLogHandlerOnThread(new SqlLogHandler() {
            public void handle(SqlLogInfo info) {
                logInfoSet.add(info);
            }
        });
        try {
            // ## Act ##
            String keyword = "100％ジュー%ス|和歌_山＿テ";
            MemberCB cb = new MemberCB();
            cb.query().setMemberName_LikeSearch(keyword, new LikeSearchOption().likeContain());
            memberBhv.selectList(cb);

            // ## Assert ##
            SqlLogInfo logInfo = logInfoSet.iterator().next();
            String sql = logInfo.getDisplaySql();
            assertTrue(sql.contains("100％ジュー|%ス||和歌|_山＿テ"));
        } finally {
            CallbackContext.clearCallbackContextOnThread();
            backToDefaultDBWay(currentDBDef, original);
        }
    }

    public void test_LikeSearch_WildCard_DoubleByte_ConditionBean_suppress_select() {
        // ## Arrange ##
        DBDef currentDBDef = DBCurrent.getInstance().currentDBDef();
        DBWay original = switchOracleDBWay(currentDBDef);
        try {
            String keyword = "100％ジュース|和歌山＿テ";
            String expectedMemberName = "果汁" + keyword + "スト";
            String dummyMemberName = "果汁100パーセントジュース|和歌山Aテスト";

            // escape処理の必要な会員がいなかったので、ここで一時的に登録
            Member escapeMember = new Member();
            escapeMember.setMemberName(expectedMemberName);
            escapeMember.setMemberAccount("temporaryAccount");
            escapeMember.setMemberStatusCode_Formalized();
            memberBhv.insert(escapeMember);

            // escape処理をしない場合にHITする会員も登録
            Member nonEscapeOnlyMember = new Member();
            nonEscapeOnlyMember.setMemberName(dummyMemberName);
            nonEscapeOnlyMember.setMemberAccount("temporaryAccount2");
            nonEscapeOnlyMember.setMemberStatusCode_Formalized();
            memberBhv.insert(nonEscapeOnlyMember);

            // 一時的に登録した会員が想定しているものかどうかをチェック
            MemberCB checkCB = new MemberCB();

            // Check!
            checkCB.query().setMemberName_LikeSearch(keyword, new LikeSearchOption().likeContain().notEscape());
            assertEquals("escapeなしで2件ともHITすること", 2, memberBhv.selectList(checkCB).size());

            // /- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
            MemberCB cb = new MemberCB();
            LikeSearchOption option = new LikeSearchOption().likeContain(); // *Point!
            cb.query().setMemberName_LikeSearch(keyword, option);
            // - - - - - - - - - -/

            String displaySql = cb.toDisplaySql();
            assertTrue(displaySql.contains("100％ジュース||和歌山＿テ"));

            // ## Act ##
            List<Member> memberList = memberBhv.selectList(cb);

            // ## Assert ##
            assertNotNull(memberList);
            assertEquals(2, memberList.size());// このキーワードにHITする人は１人しかいない
        } finally {
            backToDefaultDBWay(currentDBDef, original);
        }
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    public void test_LikeSearch_WildCard_DoubleByte_OutsideSql_default() {
        // ## Arrange ##
        final Set<SqlLogInfo> logInfoSet = new HashSet<SqlLogInfo>();
        CallbackContext.setSqlLogHandlerOnThread(new SqlLogHandler() {
            public void handle(SqlLogInfo info) {
                logInfoSet.add(info);
            }
        });
        try {
            // ## Act ##
            String keyword = "100％ジュー%ス|和歌_山＿テ";
            SimpleMemberPmb pmb = new SimpleMemberPmb();
            pmb.setMemberName_PrefixSearch(keyword);
            memberBhv.outsideSql().selectList(pmb);

            // ## Assert ##
            SqlLogInfo logInfo = logInfoSet.iterator().next();
            String sql = logInfo.getDisplaySql();
            assertTrue(sql.contains("100|％ジュー|%ス||和歌|_山|＿テ"));
        } finally {
            CallbackContext.clearCallbackContextOnThread();
        }
    }

    public void test_LikeSearch_WildCard_DoubleByte_suppress_OutsideSql() {
        // ## Arrange ##
        DBDef currentDBDef = DBCurrent.getInstance().currentDBDef();
        DBWay original = switchOracleDBWay(currentDBDef);
        final Set<SqlLogInfo> logInfoSet = new HashSet<SqlLogInfo>();
        CallbackContext.setSqlLogHandlerOnThread(new SqlLogHandler() {
            public void handle(SqlLogInfo info) {
                logInfoSet.add(info);
            }
        });
        try {
            // ## Act ##
            String keyword = "100％ジュー%ス|和歌_山＿テ";
            SimpleMemberPmb pmb = new SimpleMemberPmb();
            pmb.setMemberName_PrefixSearch(keyword);
            memberBhv.outsideSql().selectList(pmb);

            // ## Assert ##
            SqlLogInfo logInfo = logInfoSet.iterator().next();
            String sql = logInfo.getDisplaySql();
            assertTrue(sql.contains("100％ジュー|%ス||和歌|_山＿テ"));
        } finally {
            CallbackContext.clearCallbackContextOnThread();
            backToDefaultDBWay(currentDBDef, original);
        }
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    protected DBWay switchOracleDBWay(DBDef currentDBDef) {
        DBWay original = currentDBDef.dbway();
        currentDBDef.unlock();
        currentDBDef.switchDBWay(new WayOfOracle() {
            private static final long serialVersionUID = 1L;

            @Override
            public List<String> getOriginalWildCardList() {
                // suppress double-byte wild-cards
                return DfCollectionUtil.emptyList();
            }
        });
        return original;
    }

    protected DBWay backToDefaultDBWay(DBDef currentDBDef, DBWay defaultDBWay) {
        DBWay original = currentDBDef.dbway();
        currentDBDef.unlock();
        currentDBDef.switchDBWay(defaultDBWay);
        return original;
    }
}
