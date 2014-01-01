package com.example.dbflute.msaccess.dbflute.howto;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.dbflute.exception.EntityAlreadyDeletedException;

import com.example.dbflute.msaccess.dbflute.cbean.MemberCB;
import com.example.dbflute.msaccess.dbflute.exbhv.MemberBhv;
import com.example.dbflute.msaccess.dbflute.exbhv.pmbean.SimpleMemberPmb;
import com.example.dbflute.msaccess.dbflute.exentity.Member;
import com.example.dbflute.msaccess.dbflute.exentity.customize.SimpleMember;
import com.example.dbflute.msaccess.unit.ContainerTestCase;

/**
 * Behaviorの初級編Example実装。
 * 
 * <pre>
 * ターゲットは以下の通り：
 *   o とりあえずDBFluteのDBアクセスのやり方について知りたい方
 *   o DBFluteで開発するけど今まで全く使ったことのない方
 * 
 * コンテンツは以下の通り：
 *   o 一件検索: selectEntity().
 *   o チェック付き一件検索(): selectEntityWithDeletedCheck().
 *   o リスト検索: selectList().
 *   o カウント検索: selectCount().
 *   o 一件登録: insert().
 *   o 排他制御あり一件更新: update().
 *   o 排他制御なし一件更新: updateNonstrict().
 *   o 排他制御あり一件削除: delete().
 *   o 排他制御なし一件削除: deleteNonstrict().
 *   o 既に削除済みであれば素通りする排他制御なし一件削除: deleteNonstrictIgnoreDeleted().
 *   o 外だしSQL(OutsideSql)の基本的な検索: outsideSql().selectList().
 *   o 外だしSQL(OutsideSql)の基本的な更新: outsideSql().execute().
 * </pre>
 * 
 * @author jflute
 * @author taktos
 * @since 0.7.3 (2008/05/31 Saturday)
 */
public class BehaviorBasicTest extends ContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The behavior of Member. (Injection Component) */
    private MemberBhv memberBhv;

    // [Description]
    // A. Seasar-2.4の場合はプロパティ名が「クラス名に先頭を小文字にしたもの」であること。
    // B. Spring-2.5の場合は型でインジェクションされる。

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    @Test
    public void test_selectEntity() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.query().setMemberId_Equal(3);

        // ## Act ##
        Member member = memberBhv.selectEntity(cb);

        // ## Assert ##
        log(member.toString());
        assertEquals((Integer) 3, member.getMemberId());
    }

    @Test
    public void test_selectEntityWithDeletedCheck() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.query().setMemberId_Equal(99999);

        // ## Act & Assert ##
        try {
            memberBhv.selectEntityWithDeletedCheck(cb);
            fail();
        } catch (EntityAlreadyDeletedException e) {
            // OK
            log(e.getMessage());
        }
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    @Test
    public void test_selectList() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.query().setMemberName_PrefixSearch("S");
        cb.query().addOrderBy_MemberId_Asc();

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, memberList.size());
        for (Member member : memberList) {
            log(member.toString());
            assertTrue(member.getMemberName().startsWith("S"));
        }

        // [Description]
        // A. 検索結果が無い場合は空のList。(nullは戻らない)
        // B. ListResultBeanは、java.util.Listの実装クラス。

        // [SQL]
        // where MEMBER_ACCOUNT like 'S%'
        // order by MEMBER_ID asc
    }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    @Test
    public void test_selectCount() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.query().setMemberName_PrefixSearch("S");

        // ## Act ##
        int count = memberBhv.selectCount(cb);

        // ## Assert ##
        assertNotSame(0, count);
        log("count = " + count);
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    // -----------------------------------------------------
    //                                                Insert
    //                                                ------
    @Test
    public void test_insert() {
        // ## Arrange ##
        Member member = new Member();
        member.setMemberId(12345);
        member.setMemberName("testName");
        member.setMemberAccount("testAccount");
        member.setMemberStatusCode_Formalized(); // 正式会員

        // ## Act ##
        memberBhv.insert(member);

        // ## Assert ##
        log(member.getMemberId());// Insertしたときに採番されたIDを取得
    }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    @Test
    public void test_update() {
        // ## Arrange ##
        Member beforeMember = memberBhv.selectByPKValueWithDeletedCheck(3);
        Integer versionNo = beforeMember.getVersionNo();// 排他制御のためにVersionNoを取得

        Member member = new Member();
        member.setMemberId(3);// 更新したい会員の会員ID
        member.setMemberName("testName");
        member.setVersionNo(versionNo);// 排他制御カラムの設定

        // ## Act ##
        memberBhv.update(member);

        // ## Assert ##
        Member afterMember = memberBhv.selectByPKValueWithDeletedCheck(3);
        log("onDatabase = " + afterMember.toString());
        log("onMemory   = " + member.toString());
        assertEquals(Integer.valueOf(versionNo + 1), member.getVersionNo());
        assertEquals(afterMember.getVersionNo(), member.getVersionNo());
    }

    @Test
    public void test_updateNonstrict() {
        // ## Arrange ##
        Member member = new Member();
        member.setMemberId(3);// 更新したい会員の会員ID
        member.setMemberName("testName");

        // ## Act ##
        memberBhv.updateNonstrict(member);

        // ## Assert ##
        Member afterMember = memberBhv.selectByPKValueWithDeletedCheck(3);
        log("onDatabase = " + afterMember.toString());
        log("onMemory   = " + member.toString());
        assertNull(member.getVersionNo());
        assertNotNull(afterMember.getVersionNo());
    }

    // -----------------------------------------------------
    //                                                Delete
    //                                                ------
    @Test
    public void test_delete() {
        // ## Arrange ##
        deleteMemberReferrer();// テストのためにReferrerを全部消す

        Member beforeMember = memberBhv.selectByPKValueWithDeletedCheck(3);
        Integer versionNo = beforeMember.getVersionNo();// 排他制御のためにVersionNoを取得

        Member member = new Member();
        member.setMemberId(3);// 削除したい会員の会員ID
        member.setVersionNo(versionNo);// 排他制御カラムの設定

        // ## Act ##
        memberBhv.delete(member);

        // ## Assert ##
        try {
            memberBhv.selectByPKValueWithDeletedCheck(3);
            fail();
        } catch (EntityAlreadyDeletedException e) {
            // OK
            log(e.getMessage());
        }
    }

    @Test
    public void test_deleteNonstrict() {
        // ## Arrange ##
        deleteMemberReferrer();// テストのためにReferrerを全部消す

        Member member = new Member();
        member.setMemberId(3);// 削除したい会員の会員ID

        // ## Act ##
        memberBhv.deleteNonstrict(member);

        // ## Assert ##
        try {
            memberBhv.selectByPKValueWithDeletedCheck(3);
            fail();
        } catch (EntityAlreadyDeletedException e) {
            // OK
            log(e.getMessage());
        }
    }

    @Test
    public void test_deleteNonstrictIgnoreDeleted() {
        // ## Arrange ##
        Member member = new Member();
        member.setMemberId(99999);// 存在しない会員の会員ID(既に削除されたと仮定)

        // ## Act ##
        memberBhv.deleteNonstrictIgnoreDeleted(member);// 例外は発生しない

        // ## Assert ##
        try {
            memberBhv.selectByPKValueWithDeletedCheck(99999);
            fail();
        } catch (EntityAlreadyDeletedException e) {
            // OK
            log(e.getMessage());
        }
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    // -----------------------------------------------------
    //                                                  List
    //                                                  ----
    /**
     * 外だしSQL(OutsideSql)の基本的な検索: outsideSql().selectList().
     * 会員名称が'S'で始まる会員をリスト検索。
     * 
     * <pre>
     * 【手順】
     * 1. exbhvパッケージにSQLファイルを作成する。
     * 
     * 　　パッケージ：src/main/resources配下のxxx.exbhvパッケージ
     * 　　ファイル名：[Behaviorクラス名]_[SQLを表現する任意の名称].sql
     *   　　ex) xxx/exbhv/MemberBhv_selectSimpleMember.sql
     * 　　エンコーディング：UTF-8 (デフォルトの設定)
     * 
     * 2. SQLファイルにSQLを2Way-SQLで実装する。
     * 
     * 　　＜意識すること＞
     * 　　o 2WaySQLで実装すること
     * 　　o 必要に応じてSql2Entityのコメントを追記すること
     * 
     *      ex) CustomizeEntity(戻り値)
     * 　　　 -- #Xxx#
     * 
     *      ex) ParameterBean(検索条件)
     * 　　　 -- !XxxPmb!
     * 　　　 -- !!String arg1!!
     * 
     * 　　※戻り値EntityがDomainEntityで事足りるならば、CustomizeEntity(戻り値)を生成する必要はない。
     * 　　※検索条件がない、もしくは、一つであるならば、ParameterBean(検索条件)を生成する必要はない。
     * 
     * 3. Sql2Entityを実行する。
     * 
     * 　　＜生成されるもの＞
     * 　　A. CustomizeEntity(戻り値)のクラス ※任意
     * 　　B. ParameterBean(検索条件)のクラス ※任意
     * 　　C. BehaviorQueryPath(SQLのパス)の定義
     * 
     * 4. BehaviorのoutsideSql()メソッドを利用してSQLを呼び出す。
     * 
     * 　　＜指定するもの＞
     * 　　第一引数(C)：SQLのパス
     * 　　第二引数(B)：検索条件
     * 　　第三引数(A)：戻り値の型
     * 
     * 　　※それぞれSql2Entityにて自動生成されたものを利用して指定する。
     * 　　※検索条件が無い場合は、第二引数にはnullを指定する。
     * 　　※検索条件が一つの場合は、第二引数には直接その値を指定する。
     * 　　　→ パラメータコメントの変数名も「pmb.xxx」ではなく「xxx」でよい。
     * 
     * 【特徴】
     * o SQLファイル名とプログラム上での指定が食い違うことがない。
     * 　- SQLファイル名を変更してSql2Entityを実行すると古いPath指定をコンパイルエラーで検知可能
     * 　- SQLファイル名の[Behaviorクラス名]で存在しないクラスを指定した場合は、Sql2Entityで明示的な例外
     * o SQLのSelect句定義と戻り値クラスの構造が食い違うことが無い。
     * o Sql2EntityでSQLの文法的な実行チェックが行われる。
     * o ParameterBeanでプロパティに空文字「&quot;&quot;」が設定されてもそのプロパティの値はnullと同等に扱われる。
     * </pre>
     */
    @Test
    public void test_outsideSql_selectList_selectSimpleMember() {
        // ## Arrange ##
        // SQLのパス
        String path = MemberBhv.PATH_selectSimpleMember;

        // 検索条件
        SimpleMemberPmb pmb = new SimpleMemberPmb();
        pmb.setMemberName("S");

        // 戻り値Entityの型
        Class<SimpleMember> entityType = SimpleMember.class;

        // ## Act ##ß
        // SQL実行！
        List<SimpleMember> memberList = memberBhv.outsideSql().selectList(path, pmb, entityType);

        // ## Assert ##
        assertNotSame(0, memberList.size());
        log("{SimpleMember}");
        for (SimpleMember entity : memberList) {
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

    // -----------------------------------------------------
    //                                               Execute
    //                                               -------
    @Test
    public void test_outsideSql_execute_updateForcedWithdrawal() {
        // ## Arrange ##
        // SQLのパス
        String path = MemberBhv.PATH_updateForcedWithdrawal;

        // 更新条件
        String pmb = "S";

        // ## Act ##
        int updatedCount = memberBhv.outsideSql().execute(path, pmb);

        // ## Assert ##
        log("updatedCount=" + updatedCount);
        assertNotSame(0, updatedCount);
    }
}
