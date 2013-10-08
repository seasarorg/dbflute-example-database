package com.example.dbflute.mysql.dbflute.thematic;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.dbflute.cbean.coption.LikeSearchOption;

import com.example.dbflute.mysql.dbflute.cbean.MemberCB;
import com.example.dbflute.mysql.dbflute.cbean.MemberWithdrawalCB;
import com.example.dbflute.mysql.dbflute.exbhv.MemberBhv;
import com.example.dbflute.mysql.dbflute.exbhv.MemberWithdrawalBhv;
import com.example.dbflute.mysql.dbflute.exbhv.pmbean.MapLikeSearchPmb;
import com.example.dbflute.mysql.dbflute.exentity.Member;
import com.example.dbflute.mysql.dbflute.exentity.MemberLogin;
import com.example.dbflute.mysql.dbflute.exentity.MemberWithdrawal;
import com.example.dbflute.mysql.dbflute.exentity.customize.SimpleMember;
import com.example.dbflute.mysql.unit.UnitContainerTestCase;

/**
 * 「諸刃の刃」機能のExample実装。
 * <pre>
 * コンテンツは以下の通り：
 *   o BehaviorFilter-beforeInsert: behaviorFilterMap.dfprop, beforeInsertMap.
 *   o 外だしSQLでMapParameterBeanを利用した検索: new HashMap().
 *   o ParameterBeanのMap型プロパティでLikeSearchOption: setXxxMap(map, likeSearchOption).
 *   o 固定条件one-to-oneの検索: additionalForeignKey, fixedCondition.
 * </pre>
 * ※「諸刃の刃」機能とは、いざってときに役立つが注意深く利用する必要がある機能である。
 * @author jflute
 * @since 0.7.5 (2008/06/26 Thursday)
 */
public class TwoEdgedSwordTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The behavior of Member. (Injection Object) */
    private MemberBhv memberBhv;
    private MemberWithdrawalBhv memberWithdrawalBhv;

    // ===================================================================================
    //                                                                     Behavior Filter
    //                                                                     ===============
    /**
     * BehaviorFilter-beforeInsert: behaviorFilterMap.dfprop, beforeInsertMap.
     * 会員退会のBehaviorに会員退会日時の自動登録のFilterをかけてInsertする。
     *  
     * behaviorFilterMap.dfpropで指定されたカラムを持つ全てのテーブルにFilterが掛かる。
     * このExampleでは適切なカラムが存在しなかったのだが、基本的には
     * 「複数テーブルにまたがるカラムで、しかしながら、共通カラムに当てはならないカラム」
     * を対象とする。
     *  
     * 共通カラムの自動設定との違いは、非常に簡易的で単純な仕組みの機能であること。
     * あくまでいざというときの補助機能である。
     * やりすぎるとFilterが複雑に絡んで誤動作を生みかねないので、
     * 諸刃の刃であることを理解して利用すること。
     *  
     * 自動設定を動的に解除するようなオプションは存在しない。
     * (共通カラムの自動設定はそういったオプションが存在する)
     */
    public void BehaviorFilter_beforeInsert() {
        // ## Arrange ##
        MemberWithdrawal withdrawal = new MemberWithdrawal();
        withdrawal.setMemberId(8);

        // ## Act ##
        memberWithdrawalBhv.insert(withdrawal);

        // ## Assert ##
        MemberWithdrawalCB cb = new MemberWithdrawalCB();
        cb.query().setMemberId_Equal(withdrawal.getMemberId());
        MemberWithdrawal actualWithdrawal = memberWithdrawalBhv.selectEntityWithDeletedCheck(cb);
        log("WithdrawalDatetime=" + actualWithdrawal.getWithdrawalDatetime());
        assertNotNull(actualWithdrawal.getWithdrawalDatetime());
        SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        assertEquals(f.format(getAccessContext().getAccessTimestamp()),
                f.format(actualWithdrawal.getWithdrawalDatetime()));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    // -----------------------------------------------------
    //                                      MapParameterBean
    //                                      ----------------
    /**
     * 外だしSQLでMapParameterBeanを利用した検索: new HashMap().
     * ParameterBeanとしてMap(MapParameterBean)をそのまま利用。
     * <p>
     * キー値を指定しないものはOGNL上null扱いになるが、Boolean値だけは
     * 必ずtrueかfalseかの指定が必須である(OGNLが正常に判定ができないため)。
     * この例題ではBoolean値は存在していない。
     * </p>
     */
    public void test_outsideSql_selectList_selectSimpleMember_UsingMapParameterBean() {
        // ## Arrange ##
        // SQLのパス
        String path = MemberBhv.PATH_selectSimpleMember;

        // 検索条件
        // - - - - - - - - - - - - - - - - - - - - - - - - - 
        // 通常のParameterBeanではなくMapParameterBeanを利用
        // - - - - - - - - - - - - - - - - - - - - - - - - -
        // SimpleMemberPmb pmb = new SimpleMemberPmb();
        Map<String, Object> pmb = new HashMap<String, Object>();
        pmb.put("memberName", "S%");

        // 戻り値Entityの型
        Class<SimpleMember> entityType = SimpleMember.class;

        // ## Act ##
        // SQL実行！
        List<SimpleMember> resultList = memberBhv.outsideSql().selectList(path, pmb, entityType);

        // ## Assert ##
        assertNotSame(0, resultList.size());
        log("{SimpleMember}");
        for (SimpleMember entity : resultList) {
            Integer memberId = entity.getMemberId();
            String memberName = entity.getMemberName();
            String memberStatusName = entity.getMemberStatusName();
            log("    " + memberId + ", " + memberName + ", " + memberStatusName);
            assertNotNull(memberId);
            assertNotNull(memberName);
            assertNotNull(memberStatusName);
            assertTrue(memberName.startsWith("S"));
        }
    }

    /**
     * ParameterBeanのMap型プロパティでLikeSearchOption: setXxxMap(map, likeSearchOption).
     * ParameterBeanにMap型のプロパティを定義してLikeSearchOptionを利用。
     */
    public void test_outsideSql_selectList_selectMapLikeSearch() {
        // ## Arrange ##
        String keyword = "100%ジュース|和歌山_テ";
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

        // *Point!
        checkCB.query().setMemberName_LikeSearch(keyword, new LikeSearchOption().likeContain().notEscape());
        assertEquals("escapeなしで2件ともHITすること", 2, memberBhv.selectList(checkCB).size());

        // SQLのパス
        String path = MemberBhv.PATH_whitebox_pmbean_selectMapLikeSearch;

        // 検索条件
        MapLikeSearchPmb pmb = new MapLikeSearchPmb();
        Map<String, Object> conditionMap = new HashMap<String, Object>();
        conditionMap.put("memberName", keyword);
        pmb.setConditionMap(conditionMap, new LikeSearchOption().likeContain());

        // 戻り値Entityの型
        Class<SimpleMember> entityType = SimpleMember.class;

        // ## Act ##
        // SQL実行！
        List<SimpleMember> memberList = memberBhv.outsideSql().selectList(path, pmb, entityType);

        // ## Assert ##
        assertNotNull(memberList);
        assertEquals(1, memberList.size());// このキーワードにHITする人は１人しかいない
        SimpleMember actualMember = memberList.get(0);
        log(actualMember);
        assertEquals(expectedMemberName, actualMember.getMemberName());
    }

    // ===================================================================================
    //                                                                     FiexedCondition
    //                                                                     ===============
    /**
     * 固定条件one-to-oneの検索: additionalForeignKey, fixedCondition.
     * 会員の最終ログイン日時を取得。(最後にログインしたときの会員ログインを結合して取得)
     * 「結合時の固定の条件付きFK」を{DBFluteClient}/dfprop/additionalForeignKeyMap.dfpropにて
     * 定義して自動生成することで、one-to-manyをone-to-oneにとして扱えるようになる。
     * <pre>
     * ; FK_MEMBER_MEMBER_LOGIN_LATEST  = map:{
     *     ; localTableName  = MEMBER    ; foreignTableName  = MEMBER_LOGIN
     *     ; localColumnName = MEMBER_ID ; foreignColumnName = MEMBER_ID
     *     ; fixedCondition  = 
     *
     *   # on句の固定条件として「結合先ログイン情報が該当会員の最終ログイン日時であること」を追加
     *   # 以下の変数を使うことでテーブルのAlias名がSQL実行時に自動解決。
     *   #   $$localAlias$$   = 基点テーブルのAlias名
     *   #   $$foreignAlias$$ = 結合テーブルのAlias名
     *   $$foreignAlias$$.LOGIN_DATETIME = (select max(LOGIN_DATETIME) from MEMBER_LOGIN where MEMBER_ID = $$localAlias$$.MEMBER_ID)
     * 
     *     ; fixedSuffix = AsLatest
     * }
     * </pre>
     * one-to-manyに何かの固定の条件を付けるとone-to-oneになるという場合に有効である。
     * 例えば、「有効フラグがtrueであること」という条件を付けるとone-to-oneになったり、
     * 「とある区分がXXXであること」という条件を付けるとone-to-oneになったり、というような
     * RDBとしての制約のない業務的な決まりがある場合にこのFixedConditionが活躍する。
     * <pre>
     *   ex) 固定の条件が「有効フラグがtrueであること」
     *     ; fixedCondition  = $$foreignAlias$$.VALID_FLG = 1 ; fixedSuffix = AsValid
     * 
     *   ex) 固定の条件が「とある区分がXXXであること」
     *     ; fixedCondition  = $$foreignAlias$$.ONE_TYPE = 'xxx' ; fixedSuffix = AsXxx
     * </pre>
     */
    public void test_setupSelect_FixedCondition() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.setupSelect_MemberLoginAsLatest().withMemberStatus(); // *Point!
        cb.query().setMemberName_PrefixSearch("S");

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, memberList.size());
        boolean existsNotLoginMember = false;
        for (Member member : memberList) {
            MemberLogin memberLoginAsLatest = member.getMemberLoginAsLatest();
            Timestamp latestLogin = null;
            String memberStatusName = null;
            if (memberLoginAsLatest != null) {
                latestLogin = memberLoginAsLatest.getLoginDatetime();
                memberStatusName = memberLoginAsLatest.getMemberStatus().getMemberStatusName();
            } else {
                existsNotLoginMember = true;
            }
            log(member.getMemberName() + ": {" + latestLogin + "}, {" + memberStatusName + "}");
        }
        assertTrue("The evidence of 'left outer join'", existsNotLoginMember);

        // [SQL]
        // select ...
        //   from MEMBER dflocal
        //     left outer join MEMBER_LOGIN dfrelation_1
        //       on dflocal.MEMBER_ID = dfrelation_1.MEMBER_ID
        //      and dfrelation_1.LOGIN_DATETIME = (select max(LOGIN_DATETIME)
        //                                           from MEMBER_LOGIN
        //                                          where MEMBER_ID = dflocal.MEMBER_ID
        //                                        )
        //     left outer join member_status dfrelation_2_1
        //       on dfrelation_2.LOGIN_MEMBER_STATUS_CODE = dfrelation_2_1.MEMBER_STATUS_CODE 
        //  where dflocal.MEMBER_NAME like 'S%' escape '|'
    }
}
