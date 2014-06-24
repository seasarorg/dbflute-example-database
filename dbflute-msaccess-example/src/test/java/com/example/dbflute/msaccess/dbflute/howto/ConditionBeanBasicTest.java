package com.example.dbflute.msaccess.dbflute.howto;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.dbflute.exception.SelectEntityConditionNotFoundException;

import com.example.dbflute.msaccess.dbflute.cbean.MemberCB;
import com.example.dbflute.msaccess.dbflute.exbhv.MemberBhv;
import com.example.dbflute.msaccess.dbflute.exentity.Member;
import com.example.dbflute.msaccess.dbflute.exentity.MemberStatus;
import com.example.dbflute.msaccess.dbflute.exentity.MemberWithdrawal;
import com.example.dbflute.msaccess.unit.ContainerTestCase;

/**
 * @author jflute
 * @since 0.7.3 (2008/06/01 Sunday)
 */
public class ConditionBeanBasicTest extends ContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The behavior of Member. (Injection Object) */
    private MemberBhv memberBhv;

    // [Description]
    // A. Seasar-2.4の場合はプロパティ名が「クラス名に先頭を小文字にしたもの」であること。
    // B. Spring-2.5の場合は型でインジェクションされる。

    // ===================================================================================
    //                                                                               Basic
    //                                                                               =====
    /**
     * ConditionBeanを使った基本的な検索: selectList().
     * 
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
    @Test
    public void test_basic() {
        // ## Arrange ##
        // = = = = = = = = = = = = = = = = =
        // A. 基点テーブルのConditionBeanを生成
        // --> select句, from句)
        // = = = = = = = = = = = = = = = = =
        MemberCB cb = new MemberCB();// 基点テーブルは「会員」

        // = = = = = = = = = = = = = = = =
        // B. 取得したい関連テーブルを指定
        // --> select句, from句, join句)
        // = = = = = = = = = = = = = = = =
        cb.setupSelect_MemberStatus();// 「会員ステータス」を結合してSelect句に展開

        // = = = = = = = = = = = = = = = = = = = = = =
        // C. 絞り込み条件・ソート条件を設定
        // --> where句, order-by句(, from句, join句)
        // = = = = = = = = = = = = = = = = = = = = = =
        cb.query().setMemberName_PrefixSearch("S");// 会員名が'S'で始まること
        cb.query().addOrderBy_MemberBirthday_Desc();// 会員の生年月日の降順で並べる

        // ## Act ##
        // = = = = = = = = = = = = =
        // D. Behaviorのメソッドを呼ぶ
        // = = = = = = = = = = = = =
        List<Member> memberList = memberBhv.selectList(cb);// リスト検索

        // ## Assert ##
        assertNotSame(0, memberList.size());
        for (Member member : memberList) {
            log(member.toString());
            assertTrue(member.getMemberName().startsWith("S"));
        }
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    @Test
    public void test_setupSelect_Foreign() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.setupSelect_MemberStatus();// *Point!

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, memberList.size());
        for (Member member : memberList) {
            MemberStatus memberStatus = member.getMemberStatus();
            assertNotNull("NotNull制約のFKなのでnullはありえない", memberStatus);
            log(member.getMemberName() + ", " + memberStatus.getMemberStatusName());
        }
    }

    @Test
    public void test_setupSelect_AsOne() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.setupSelect_MemberWithdrawalAsOne();// *Point!

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, memberList.size());
        boolean existsMemberWithdrawal = false;
        for (Member member : memberList) {
            log("[MEMBER]: " + member.getMemberName());
            MemberWithdrawal memberWithdrawalAsOne = member.getMemberWithdrawalAsOne();// *Point!
            if (memberWithdrawalAsOne != null) {// {1 : 0...1}の関連なのでnullチェック
                log("    [MEMBER_WITHDRAWAL]: " + memberWithdrawalAsOne);
                existsMemberWithdrawal = true;
            }
        }
        assertTrue(existsMemberWithdrawal);
    }

    // /- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // 子テーブル(Referrer)の取得に関しては、BehaviorMiddleTestのLoadReferrerにて
    // - - - - - - - - - -/

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    // -----------------------------------------------------
    //                                                 Equal
    //                                                 -----
    @Test
    public void test_query_Equal() {
        // ## Arrange ##
        Integer expectedMemberId = 3;
        MemberCB cb = new MemberCB();
        cb.query().setMemberId_Equal(expectedMemberId);// *Point!

        // ## Act ##
        Member member = memberBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        assertNotNull(member);
        assertEquals(expectedMemberId, member.getMemberId());
    }

    @Test
    public void test_query_Equal_TwoOrMoreCondition() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.query().setMemberId_Equal(1);// *Point!
        cb.query().setMemberAccount_Equal("Pixy");// *Point!

        // ## Act ##
        Member member = memberBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        assertNotNull(member);
        assertEquals(new Integer(1), member.getMemberId());
        assertEquals("Pixy", member.getMemberAccount());
    }

    @Test
    public void test_query_Equal_ArgumentNull() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.query().setMemberId_Equal(null);// *Point!

        // ## Act & Assert ##
        try {
            memberBhv.selectEntityWithDeletedCheck(cb);
            fail();
        } catch (SelectEntityConditionNotFoundException e) {
            // OK
            log(e.getMessage());
        }

        // [Description]
        // A. nullのものを検索したい場合は、setXxx_IsNull()を利用。
    }

    @Test
    public void test_query_Equal_ArgumentEmptyString() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.query().setMemberName_Equal("");// *Point!

        // ## Act ##
        int count = memberBhv.selectCount(cb);

        // ## Assert ##
        assertEquals("条件なしの件数と同じであること", memberBhv.selectCount(new MemberCB()), count);
    }

    @Test
    public void test_query_Equal_OverrideCondition() {
        // ## Arrange ##
        Integer beforeMemberId = 3;
        Integer afterMemberId = 4;
        MemberCB cb = new MemberCB();
        cb.query().setMemberId_Equal(beforeMemberId);
        cb.query().setMemberId_Equal(afterMemberId);// *Point!

        // ## Act ##
        Member member = memberBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        assertNotNull(member);
        assertEquals("後に設定した値が有効になること", afterMemberId, member.getMemberId());
    }

    @Test
    public void test_query_Equal_AbsolutelySameCondition() {
        // ## Arrange ##
        Integer beforeMemberId = 3;
        Integer afterMemberId = beforeMemberId;
        MemberCB cb = new MemberCB();
        cb.query().setMemberId_Equal(beforeMemberId);
        cb.query().setMemberId_Equal(afterMemberId);// *Point!

        // ## Act ##
        Member member = memberBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        assertNotNull(member);
        assertEquals(beforeMemberId, member.getMemberId());
    }

    @Test
    public void test_query_queryForeign_Equal() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.query().queryMemberWithdrawalAsOne().setWithdrawalReasonCode_Equal("PRD");// *Point!

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, memberList.size());
        for (Member member : memberList) {
            log(member.toString());
            assertNull("条件(query)利用のみの結合である", member.getMemberWithdrawalAsOne());
        }
    }

    // -----------------------------------------------------
    //                                               OrderBy
    //                                               -------
    @Test
    public void test_query_addOrderBy_Asc() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.query().addOrderBy_MemberAccount_Desc();// *Point!

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, memberList.size());
        for (Member member : memberList) {
            log(member.getMemberAccount());
        }
    }

    @Test
    public void test_query_addOrderBy_Desc() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.query().addOrderBy_MemberAccount_Desc();// *Point!

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, memberList.size());
        for (Member member : memberList) {
            log(member.getMemberAccount());
        }
    }

    @Test
    public void test_query_addOrderBy_Desc_addOrderBy_Asc() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.query().addOrderBy_MemberBirthday_Desc();// *Point!
        cb.query().addOrderBy_MemberAccount_Desc();// *Point!

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, memberList.size());
        for (Member member : memberList) {
            log(member.getMemberBirthday() + ", " + member.getMemberAccount());
        }
    }

    @Test
    public void test_query_queryForeign_addOrderBy_Asc() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.query().queryMemberStatus().addOrderBy_DisplayOrder_Asc();// *Point!

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, memberList.size());
        for (Member member : memberList) {
            log(member.getMemberName() + ", " + member.getMemberStatusCode());
            assertNull("ソート利用のみの結合である", member.getMemberStatus());
        }
    }
}
