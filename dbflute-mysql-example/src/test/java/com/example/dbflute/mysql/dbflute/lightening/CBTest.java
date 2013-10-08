package com.example.dbflute.mysql.dbflute.lightening;

import java.util.List;

import com.example.dbflute.mysql.dbflute.cbean.MemberCB;
import com.example.dbflute.mysql.dbflute.exbhv.MemberBhv;
import com.example.dbflute.mysql.dbflute.exentity.Member;

/**
 * @author jflute
 */
public class CBTest extends LighteningTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The behavior of Member. (Injection Object) */
    private MemberBhv memberBhv;

    // ===================================================================================
    //                                                                               Basic
    //                                                                               =====
    /**
     * ConditionBeanを使った基本的な検索: selectList().
     * <pre>
     * 【実装手順】
     * A. 基点テーブルのConditionBeanを生成
     * B. 取得したい関連テーブルを指定
     * C. 絞り込み条件・ソート条件を設定
     * D. Behaviorのメソッドを呼ぶ
     * 
     * 【特徴】
     * ConditionBeanは、目的ベースにSQLを組み立てるオブジェクトである。
     * A. 「取得したいテーブル何か？」
     * B. 「取得したい関連テーブルは何か？」
     * C. 「どんな絞込みをしたいか？ソートをしたいか？」
     * D. 「一件検索なのか？リスト検索なのか？」
     * などの「目的」を指定することで、SQLを安全に実行することが可能である。
     * </pre>
     */
    public void test_basic() {
        // ## Arrange ##
        // = = = = = = = = = = = = = = = = =
        // A. 基点テーブルのConditionBeanを生成
        //    --> select句, from句)
        // = = = = = = = = = = = = = = = = =
        // MemberCB cb = new MemberCB();// 基点テーブルは「会員」

        // = = = = = = = = = = = = = = = =
        // B. 取得したい関連テーブルを指定
        //    --> select句, from句, join句)
        // = = = = = = = = = = = = = = = =
        // cb.setupSelect_MemberStatus();// 「会員ステータス」を結合してSelect句に展開

        // = = = = = = = = = = = = = = = = = = = = = =
        // C. 絞り込み条件・ソート条件を設定
        //    --> where句, order-by句(, from句, join句)
        // = = = = = = = = = = = = = = = = = = = = = =
        // cb.query().setMemberName_PrefixSearch("S");// 会員名が'S'で始まること
        // cb.query().addOrderBy_Birthdate_Desc();// 会員の生年月日の降順で並べる

        // ## Act ##
        // = = = = = = = = = = = = =
        // D. Behaviorのメソッドを呼ぶ
        // = = = = = = = = = = = = =
        // List<Member> memberList = memberBhv.selectList(cb);// リスト検索

        // ## Assert ##
        //        assertNotSame(0, memberList.size());
        //        for (Member member : memberList) {
        //            log(member.toString());
        //            assertTrue(member.getMemberName().startsWith("S"));
        //        }

        // [SQL]
        // select ...
        //   from MEMBER member
        //     left outer join MEMBER_STATUS status
        //       on member.MEMBER_STATUS_CODE = status.MEMBER_STATUS_CODE
        //  where member.MEMBER_NAME like 'S%'
        //  order by member.MEMBER_BIRTHDAY desc
    }

    public void test_various() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();

        // ## Act ##
        List<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        showMemberList(memberList, new VariousCallback() {
            public Object getVarious(Member member) {
                return member.getFormalizedDatetime();
            }
        });
    }

    // 【ERD】
    // http://dbflute.sandbox.seasar.org/view/exampledb/
    // 
    // 【進行手順】
    // 1. 手順・概念
    // 2. setupSelect (contains nest)
    // 3. query() (FK & ordinary comparing)
    // 4. addOrderBy
    // 5. Classification
    // 6. LikeSeasrch(Escapeも)
    // 7. Exists
    // 8. Union
    // 9. Nulls First/Last
    // 10. OnClause
    // 11. SpecifyColumn
    // 12. DerivedReferrer
    // 13. ScalarSubQuery
}
