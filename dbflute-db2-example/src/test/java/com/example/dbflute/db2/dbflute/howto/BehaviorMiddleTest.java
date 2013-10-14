package com.example.dbflute.db2.dbflute.howto;

import java.sql.Timestamp;
import java.util.List;

import org.seasar.dbflute.bhv.ConditionBeanSetupper;
import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.dbflute.cbean.PagingResultBean;
import org.seasar.dbflute.exception.EntityAlreadyDeletedException;
import org.seasar.dbflute.util.DfTypeUtil;

import com.example.dbflute.db2.dbflute.cbean.MemberCB;
import com.example.dbflute.db2.dbflute.cbean.PurchaseCB;
import com.example.dbflute.db2.dbflute.exbhv.MemberBhv;
import com.example.dbflute.db2.dbflute.exbhv.pmbean.OptionMemberPmb;
import com.example.dbflute.db2.dbflute.exbhv.pmbean.PurchaseMaxPriceMemberPmb;
import com.example.dbflute.db2.dbflute.exbhv.pmbean.SimpleMemberPmb;
import com.example.dbflute.db2.dbflute.exbhv.pmbean.UnpaidSummaryMemberPmb;
import com.example.dbflute.db2.dbflute.exentity.Member;
import com.example.dbflute.db2.dbflute.exentity.Purchase;
import com.example.dbflute.db2.dbflute.exentity.customize.OptionMember;
import com.example.dbflute.db2.dbflute.exentity.customize.PurchaseMaxPriceMember;
import com.example.dbflute.db2.dbflute.exentity.customize.UnpaidSummaryMember;
import com.example.dbflute.db2.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.7.3 (2008/05/31 Saturday)
 */
public class BehaviorMiddleTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The behavior of Member. (Injection Component) */
    private MemberBhv memberBhv;

    // ===================================================================================
    //                                                                 Paging(Page Select)
    //                                                                 ===================
    public void test_selectPage() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.query().addOrderBy_MemberName_Asc();
        cb.paging(4, 3);// The page size is 4 records per 1 page, and The page number is 3.

        // ## Act ##
        PagingResultBean<Member> page3 = memberBhv.selectPage(cb);

        // ## Assert ##
        assertNotSame(0, page3.size());
        assertEquals(4, page3.size());
        log("PagingResultBean.toString():" + ln() + " " + page3);
        for (Member member : page3) {
            log(member.toString());
        }
        log("allRecordCount=" + page3.getAllRecordCount());
        log("allPageCount=" + page3.getAllPageCount());
        log("currentPageNumber=" + page3.getCurrentPageNumber());
        log("currentStartRecordNumber=" + page3.getCurrentStartRecordNumber());
        log("currentEndRecordNumber=" + page3.getCurrentEndRecordNumber());
        log("isExistPrePage=" + page3.isExistPrePage());
        log("isExistNextPage=" + page3.isExistNextPage());
    }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    public void test_loadReferrer() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();

        // At first, it selects the list of Member.
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Act ##
        // And it loads the list of Purchase with its conditions.
        memberBhv.loadPurchaseList(memberList, new ConditionBeanSetupper<PurchaseCB>() {
            public void setup(PurchaseCB cb) {
                cb.query().setPurchaseCount_GreaterEqual(2);
                cb.query().addOrderBy_PurchaseCount_Desc();
            }
        });

        // ## Assert ##
        assertNotSame(0, memberList.size());
        for (Member member : memberList) {
            log("[MEMBER]: " + member.getMemberName());
            List<Purchase> purchaseList = member.getPurchaseList();// *Point!
            for (Purchase purchase : purchaseList) {
                log("    [PURCHASE]: " + purchase.toString());
            }
        }

        // [SQL]
        // {1}: memberBhv.selectList(cb);
        // select ... 
        //   from MEMBER dflocal
        // 
        // {2}: memberBhv.loadPurchaseList(memberList, ...); 
        // select ... 
        //   from PURCHASE dflocal 
        //  where dflocal.MEMBER_ID in (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
        //    and dflocal.PURCHASE_COUNT >= 2 
        //  order by dflocal.MEMBER_ID asc, dflocal.PURCHASE_COUNT desc
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    // -----------------------------------------------------
    //                                        InsertOrUpdate
    //                                        --------------
    /**
     * 一件登録もしくは排他制御ありの一件更新: insertOrUpdate().
     */
    public void test_insertOrUpdate() {
        // ## Arrange ##
        Member member = new Member();
        member.setMemberName("testName");
        member.setMemberAccount("testAccount");
        member.setMemberStatusCode_Formalized();

        // ## Act ##
        memberBhv.insertOrUpdate(member);
        member.setMemberName("testName2");
        memberBhv.insertOrUpdate(member);

        // ## Assert ##
        MemberCB cb = new MemberCB();
        cb.query().setMemberId_Equal(member.getMemberId());
        Member actual = memberBhv.selectEntityWithDeletedCheck(cb);
        log(actual);
        assertEquals("testName2", actual.getMemberName());

        // [Description]
        // A. 登録処理はinsert()、更新処理はupdate()に委譲する。
        // B. PKの値が存在しない場合は、自動採番と判断し問答無用で登録処理となる。
        // C. PK値が存在する場合は、先に更新処理をしてから結果を判断して登録処理をする。
    }

    /**
     * 一件登録もしくは排他制御なし一件更新: insertOrUpdateNonstrict().
     */
    public void test_insertOrUpdateNonstrict() {
        // ## Arrange ##
        Member member = new Member();
        member.setMemberName("testName");
        member.setMemberAccount("testAccount");
        member.setMemberStatusCode_Formalized();

        // ## Act ##
        memberBhv.insertOrUpdateNonstrict(member);
        member.setMemberName("testName2");
        member.setVersionNo(null);
        memberBhv.insertOrUpdateNonstrict(member);

        // ## Assert ##
        MemberCB cb = new MemberCB();
        cb.query().setMemberId_Equal(member.getMemberId());
        Member actual = memberBhv.selectEntityWithDeletedCheck(cb);
        log(actual);
        assertEquals("testName2", actual.getMemberName());

        // [Description]
        // A. 登録処理はinsert()、更新処理はupdateNonstrict()に委譲する。
        // B. PKの値が存在しない場合は、自動採番と判断し問答無用で登録処理となる。
        // C. PK値が存在する場合は、先に更新処理をしてから結果を判断して登録処理をする。
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Queryを使った更新: queryUpdate().
     * 会員ステータスが正式会員の会員を全て仮会員にする。
     * ConditionBeanで設定した条件で一括削除が可能である。(排他制御はない)
     * @since 0.7.5
     */
    public void test_queryUpdate() {
        // ## Arrange ##
        Member member = new Member();
        member.setMemberStatusCode_Provisional();// 会員ステータスを「仮会員」に
        member.setFormalizedDatetime(null);// 正式会員日時を「null」に

        MemberCB cb = new MemberCB();
        cb.query().setMemberStatusCode_Equal_Formalized();// 正式会員

        // ## Act ##
        int updatedCount = memberBhv.queryUpdate(member, cb);

        // ## Assert ##
        assertNotSame(0, updatedCount);
        MemberCB actualCB = new MemberCB();
        actualCB.query().setMemberStatusCode_Equal_Provisional();
        actualCB.query().setFormalizedDatetime_IsNull();
        actualCB.query().setUpdateUser_Equal(getAccessContext().getAccessUser()); // Common Column
        ListResultBean<Member> actualList = memberBhv.selectList(actualCB);
        assertEquals(actualList.size(), updatedCount);

        // [Description]
        // A. 条件として、結合先のカラムによる条件やexists句を使ったサブクエリーなども利用可能。
        // B. setupSelect_Xxx()やaddOrderBy_Xxx()を呼び出しても意味はない。
        // C. 排他制御はせずに問答無用で更新する。(バージョンNOは自動インクリメント)
        // D. 更新結果が0件でも特に例外は発生しない。
        // E. 共通カラム(CommonColumn)の自動設定は有効。
    }

    /**
     * Queryを使った削除: queryDelete().
     * 会員ステータスが正式会員の会員を全て削除する。
     * ConditionBeanで設定した条件で一括削除が可能である。(排他制御はない)
     */
    public void test_queryDelete() {
        // ## Arrange ##
        deleteMemberReferrer();// for Test

        MemberCB cb = new MemberCB();
        cb.query().setMemberStatusCode_Equal_Formalized();// 正式会員

        // ## Act ##
        int deletedCount = memberBhv.queryDelete(cb);

        // ## Assert ##
        assertNotSame(0, deletedCount);
        assertEquals(0, memberBhv.selectCount(cb));

        // [Description]
        // A. 条件として、結合先のカラムによる条件やexists句を使ったサブクエリーなども利用可能。
        // B. setupSelect_Xxx()やaddOrderBy_Xxx()を呼び出しても意味はない。
        // C. 排他制御はせずに問答無用で削除する。
        // D. 削除結果が0件でも特に例外は発生しない。
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    // -----------------------------------------------------
    //                                                  List
    //                                                  ----
    // /- - - - - - - - - - - - - - - - - - - - - - - - - - -
    // 基本的なselectList()に関しては、BehaviorBasicTestにて
    // - - - - - - - - - -/

    /**
     * 外だしSQLでカラム一つだけのリスト検索: outsideSql().selectList().
     */
    public void test_outsideSql_selectList_selectMemberName() {
        // ## Arrange ##
        // SQLのパス
        String path = MemberBhv.PATH_selectMemberName;

        // 検索条件
        SimpleMemberPmb pmb = new SimpleMemberPmb();
        pmb.setMemberName_PrefixSearch("S");

        // 戻り値Entityの型(String)
        Class<String> entityType = String.class;// *Point!

        // ## Act ##
        // SQL実行！
        List<String> memberNameList = memberBhv.outsideSql().selectList(path, pmb, entityType);

        // ## Assert ##
        assertNotSame(0, memberNameList.size());
        log("{MemberName}");
        for (String memberName : memberNameList) {
            log("    " + memberName);
            assertNotNull(memberName);
            assertTrue(memberName.startsWith("S"));
        }
    }

    // -----------------------------------------------------
    //                                                Option
    //                                                ------
    /**
     * 外だしSQLでエスケープ付き曖昧検索のリスト検索: outsideSql().selectList().
     * <pre>
     * ParameterBeanの定義にて、以下のようにオプション「:like」を付与すると利用可能になる。
     * -- !OptionMemberPmb!
     * -- !!Integer memberId!!
     * -- !!String memberName:like!!
     * </pre>
     */
    public void test_outsideSql_selectList_selectOptionMember_LikeSearchOption() {
        // ## Arrange ##
        // テストのためにワイルドカード含みのテスト会員を作成
        Member testMember1 = new Member();
        testMember1.setMemberId(1);
        testMember1.setMemberName("ストイコ100%ビッチ_その１");
        memberBhv.updateNonstrict(testMember1);
        Member testMember4 = new Member();
        testMember4.setMemberId(4);
        testMember4.setMemberName("ストイコ100%ビッチ_その４");
        memberBhv.updateNonstrict(testMember4);

        // SQLのパス
        String path = "selectOptionMember";

        // 検索条件
        OptionMemberPmb pmb = new OptionMemberPmb();
        pmb.setMemberName_PrefixSearch("ストイコ100%ビッチ_その");

        // 戻り値Entityの型
        Class<OptionMember> entityType = OptionMember.class;

        // ## Act ##
        // SQL実行！
        List<OptionMember> memberList = memberBhv.outsideSql().selectList(path, pmb, entityType);

        // ## Assert ##
        assertNotSame("テストの成立のため１件以上は必ずあること: " + memberList.size(), 0, memberList.size());
        log("{OptionMember}");
        for (OptionMember member : memberList) {
            Integer memberId = member.getMemberId();
            String memberName = member.getMemberName();
            String memberStatusName = member.getMemberStatusName();
            log("    " + memberId + ", " + memberName + ", " + memberStatusName + " - Formalized="
                    + member.isMemberStatusCodeFormalized());// Sql2EntityでもClassification機能が利用可能
            assertNotNull(memberId);
            assertNotNull(memberName);
            assertNotNull(memberStatusName);
            assertTrue(memberName.startsWith("ストイコ100%ビッチ_その"));
        }
    }

    public void test_outsideSql_selectList_selectOptionMember_DateFromTo() {
        // ## Arrange ##
        final String firstDate = "2003-02-25";
        final String lastDate = "2006-09-04";
        final String lastNextDate = "2006-09-05";
        String path = MemberBhv.PATH_selectOptionMember;
        OptionMemberPmb pmb = new OptionMemberPmb();
        pmb.setFromFormalizedDate_FromDate(DfTypeUtil.toTimestamp("2003-02-25"));
        pmb.setToFormalizedDate_ToDate(DfTypeUtil.toTimestamp(lastDate));
        Class<OptionMember> entityType = OptionMember.class;

        // ## Act ##
        List<OptionMember> memberList = memberBhv.outsideSql().selectList(path, pmb, entityType);

        // ## Assert ##
        assertNotSame(0, memberList.size());
        boolean existsLastDate = false;
        for (OptionMember member : memberList) {
            String memberName = member.getMemberName();
            Timestamp formalizedDatetime = member.getFormalizedDatetime();
            log(memberName + ", " + formalizedDatetime);
            if (DfTypeUtil.toString(formalizedDatetime, "yyyy-MM-dd").equals(lastDate)) {
                existsLastDate = true;
            }
        }
        assertEquals(firstDate, DfTypeUtil.toString(pmb.getFromFormalizedDate(), "yyyy-MM-dd"));
        assertEquals(lastNextDate, DfTypeUtil.toString(pmb.getToFormalizedDate(), "yyyy-MM-dd"));
        assertTrue(existsLastDate);
    }

    // -----------------------------------------------------
    //                                                Paging
    //                                                ------
    /**
     * 外だしSQLの自動ページング検索: outsideSql().autoPaging().selectPage().
     * 未払い合計金額の会員一覧を検索。
     * <pre>
     * ParameterBean.paging(pageSize, pageNumber)にてページング条件を指定：
     *   o pageSize : ページサイズ(１ページあたりのレコード数)
     *   o pageNumber : ページ番号(検索する対象のページ)
     *   
     *   ※SQL上のParameterBeanの定義にて、以下のようにSimplePagingBeanを継承すること。
     *      -- !XxxPmb extends SPB!
     * 
     * selectPage()だけでページングの基本が全て実行される：
     *   1. ページングなし件数取得
     *   2. ページング実データ検索
     *   3. ページング結果計算処理
     * 
     * PagingResultBeanから様々な要素が取得可能：
     *   o ページングなし総件数
     *   o 現在ページ番号
     *   o 総ページ数
     *   o 前ページの有無判定
     *   o 次ページの有無判定
     *   o ページングナビゲーション要素ページリスト
     *   o などなど
     * </pre>
     */
    @SuppressWarnings("unchecked")
    public void test_outsideSql_autoPaging_selectPage() {
        // ## Arrange ##
        // SQLのパス
        String path = MemberBhv.PATH_selectUnpaidSummaryMember;

        // 検索条件
        UnpaidSummaryMemberPmb pmb = new UnpaidSummaryMemberPmb();
        pmb.setMemberStatusCode_Formalized();// 正式会員

        // 戻り値Entityの型
        Class<UnpaidSummaryMember> entityType = UnpaidSummaryMember.class;

        // ## Act ##
        // SQL実行！
        int pageSize = 3;
        pmb.paging(pageSize, 1);// 1st page
        PagingResultBean<UnpaidSummaryMember> page1 = memberBhv.outsideSql().autoPaging()
                .selectPage(path, pmb, entityType);

        pmb.paging(pageSize, 2);// 2st page
        PagingResultBean<UnpaidSummaryMember> page2 = memberBhv.outsideSql().autoPaging()
                .selectPage(path, pmb, entityType);

        pmb.paging(pageSize, 3);// 3st page
        PagingResultBean<UnpaidSummaryMember> page3 = memberBhv.outsideSql().autoPaging()
                .selectPage(path, pmb, entityType);

        pmb.paging(pageSize, page1.getAllPageCount());// latest page
        PagingResultBean<UnpaidSummaryMember> lastPage = memberBhv.outsideSql().autoPaging()
                .selectPage(path, pmb, entityType);

        // ## Assert ##
        showPage(page1, page2, page3, lastPage);
        assertEquals(3, page1.size());
        assertEquals(3, page2.size());
        assertEquals(3, page3.size());
        assertNotSame(page1.get(0).getUnpaidManId(), page2.get(0).getUnpaidManId());
        assertNotSame(page2.get(0).getUnpaidManId(), page3.get(0).getUnpaidManId());
        assertEquals(1, page1.getCurrentPageNumber());
        assertEquals(2, page2.getCurrentPageNumber());
        assertEquals(3, page3.getCurrentPageNumber());
        assertEquals(page1.getAllRecordCount(), page2.getAllRecordCount());
        assertEquals(page2.getAllRecordCount(), page3.getAllRecordCount());
        assertEquals(page1.getAllPageCount(), page2.getAllPageCount());
        assertEquals(page2.getAllPageCount(), page3.getAllPageCount());
        assertFalse(page1.isExistPrePage());
        assertTrue(page1.isExistNextPage());
        assertTrue(lastPage.isExistPrePage());
        assertFalse(lastPage.isExistNextPage());

        // [Description]
        // A. paging()メソッドはDBFlute-0.7.3よりサポート。
        //    DBFlute-0.7.2までは以下の通り：
        //      pmb.fetchFirst(3);
        //      pmb.fetchPage(1);
        // 
        // B. 手動ページングをしたい場合は以下の通り。
        //   1. SQL上でページング絞り条件を記述
        //      /*IF pmb.isPaging()*/
        //      limit /*$pmb.pageStartIndex*/80, /*$pmb.fetchSize*/20
        //      /*END*/
        // 
        //   2. autoPaging()をmanualPaging()に変更
        //      memberBhv.outsideSql().manualPaging().selectPage(...);
        // 
        // C. カーソルタイプは「INSENSITIVE」でスキップ処理でResultSet.absolute()を利用。
        //    --> ループでぐるぐる回すわけではない。*但しカーソルをサポートしているDBのみ
        // 
        // D. ParameterBeanでも区分値機能は利用可能 {上級編}
        //    : member.isMemberStatusCodeFormalized()
        // 
        //    ParameterBeanにて
        //    -- !!String memberStatusCode:cls(MemberStatus)!!
        //    と指定
        // 
        // X. ConditionBeanと外だしSQLの境目ポイント！ {上級編}
        //    o Select句の相関サブクエリで子テーブルのsum()はConditionBeanで可能
        //      --> SpecifyDerivedReferrerを利用(詳しくはConditionBeanPlatinumTestにて)
        // 
        //    o Select句の相関サブクエリで導出した値で並び替えるのはConditionBeanで可能
        //      --> SpecifyDerivedReferrerで利用(詳しくはConditionBeanPlatinumTestにて)
        // 
        //    o Where句の相関サブクエリで子テーブルの条件で絞り込みをするのはConditionBeanで可能
        //      --> ExistsSubQueryを利用(詳しくはConditionBeanMiddleTestにて)
        // 
        //    o Select句の相関サブクエリで導出した値で絞り込みをするのは外だしSQL
        //      --> 今回の例題では導出値を利用した絞り込みはやっていない
        //      
        //        ※実はこの例題のSQLはConditionBeanで実装可能
        //        /- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
        //        MemberCB cb = new MemberCB();
        //        cb.setupSelect_MemberStatus();
        //        cb.specify().derivedPurchaseList().sum(new SubQuery<PurchaseCB>() {
        //            public void query(PurchaseCB subCB) {
        //                subCB.specify().columnPurchasePrice();
        //                subCB.query().setPaymentCompleteFlg_Equal_False();
        //            }
        //        }, "UNPAID_PRICE_SUMMARY");
        //        cb.query().setMemberId_Equal(3);
        //        cb.query().setMemberName_PrefixSearch("S");
        //        cb.query().setMemberStatusCode_NotEqual_Formalized();
        //        cb.query().existsPurchaseList(new SubQuery<PurchaseCB>() {
        //            public void query(PurchaseCB subCB) {
        //                subCB.query().setPaymentCompleteFlg_Equal_False();
        //            }
        //        });
        //        cb.query().addSpecifiedDerivedOrderBy_Desc("UNPAID_PRICE_SUMMARY");
        //        cb.query().addOrderBy_MemberId_Asc();
        //        cb.paging(3, 1);
        //        PagingResultBean<Member> page = memberBhv.selectPage(cb);
        //        - - - - - - - - - -/
    }

    /**
     * 外だしSQLの手動ページング検索: outsideSql().manualPaging().selectPage().
     * 最大購入価格の会員一覧を検索。
     * <pre>
     * ParameterBean.paging(pageSize, pageNumber)にてページング条件を指定：
     *   o pageSize : ページサイズ(１ページあたりのレコード数)
     *   o pageNumber : ページ番号(検索する対象のページ)
     *   
     *   ※SQL上のParameterBeanの定義にて、以下のようにSimplePagingBeanを継承すること。
     *      -- !XxxPmb extends SPB!
     * 
     * selectPage()だけでページングの基本が全て実行される：
     *   1. ページングなし件数取得
     *   2. ページング実データ検索
     *   3. ページング結果計算処理
     * 
     * PagingResultBeanから様々な要素が取得可能：
     *   o ページングなし総件数
     *   o 現在ページ番号
     *   o 総ページ数
     *   o 前ページの有無判定
     *   o 次ページの有無判定
     *   o ページングナビゲーション要素ページリスト
     *   o などなど
     * </pre>
     */
    @SuppressWarnings("unchecked")
    public void test_outsideSql_manualPaging_selectPage() {
        // ## Arrange ##
        // SQLのパス
        String path = MemberBhv.PATH_selectPurchaseMaxPriceMember;

        // 検索条件(絞り込み条件は特になし)
        PurchaseMaxPriceMemberPmb pmb = new PurchaseMaxPriceMemberPmb();

        // 戻り値Entityの型
        Class<PurchaseMaxPriceMember> entityType = PurchaseMaxPriceMember.class;

        // ## Act ##
        // SQL実行！
        int pageSize = 3;
        pmb.paging(pageSize, 1);// 1st page
        PagingResultBean<PurchaseMaxPriceMember> page1 = memberBhv.outsideSql().manualPaging()
                .selectPage(path, pmb, entityType);

        pmb.paging(pageSize, 2);// 2st page
        PagingResultBean<PurchaseMaxPriceMember> page2 = memberBhv.outsideSql().manualPaging()
                .selectPage(path, pmb, entityType);

        pmb.paging(pageSize, 3);// 3st page
        PagingResultBean<PurchaseMaxPriceMember> page3 = memberBhv.outsideSql().manualPaging()
                .selectPage(path, pmb, entityType);

        pmb.paging(pageSize, page1.getAllPageCount());// latest page
        PagingResultBean<PurchaseMaxPriceMember> lastPage = memberBhv.outsideSql().manualPaging()
                .selectPage(path, pmb, entityType);

        // ## Assert ##
        showPage(page1, page2, page3, lastPage);
        assertEquals(3, page1.size());
        assertEquals(3, page2.size());
        assertEquals(3, page3.size());
        assertNotSame(page1.get(0).getMemberId(), page2.get(0).getMemberId());
        assertNotSame(page2.get(0).getMemberId(), page3.get(0).getMemberId());
        assertEquals(1, page1.getCurrentPageNumber());
        assertEquals(2, page2.getCurrentPageNumber());
        assertEquals(3, page3.getCurrentPageNumber());
        assertEquals(page1.getAllRecordCount(), page2.getAllRecordCount());
        assertEquals(page2.getAllRecordCount(), page3.getAllRecordCount());
        assertEquals(page1.getAllPageCount(), page2.getAllPageCount());
        assertEquals(page2.getAllPageCount(), page3.getAllPageCount());
        assertFalse(page1.isExistPrePage());
        assertTrue(page1.isExistNextPage());
        assertTrue(lastPage.isExistPrePage());
        assertFalse(lastPage.isExistNextPage());

        // [Description]
        // A. paging()メソッドはDBFlute-0.7.3よりサポート。
        //    DBFlute-0.7.2までは以下の通り：
        //      pmb.fetchFirst(3);
        //      pmb.fetchPage(1);
        // 
        // B. 自動ページングをしたい場合は以下の通り。
        //   1. SQL上でページング絞り条件を削除
        //   2. manualPaging()をautoPaging()に変更
        // 
        // X. ConditionBeanと外だしSQLの境目ポイント！ {上級編}
        //    o ページング絞りをSQLで行うのはConditionBeanで可能
        //      --> ConditionBeanのページングはSQLでのページング絞りを実現
        // 
        //    o Select句の相関サブクエリで子テーブルのmax()はConditionBeanで可能
        //      --> SpecifyDerivedReferrerを利用(詳しくはConditionBeanPlatinumTestにて)
        // 
        //    o Select句の相関サブクエリで導出した値で並び替えるのはConditionBeanで可能
        //      --> SpecifyDerivedReferrerで利用(詳しくはConditionBeanPlatinumTestにて)
        // 
        //        ※実はこの例題のSQLはConditionBeanで実装可能
        //        /- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
        //        MemberCB cb = new MemberCB();
        //        cb.setupSelect_MemberStatus();
        //        cb.specify().derivedPurchaseList().max(new SubQuery<PurchaseCB>() {
        //            public void query(PurchaseCB subCB) {
        //                subCB.specify().columnPurchasePrice();
        //                subCB.query().setPaymentCompleteFlg_Equal_False();
        //            }
        //        }, "PURCHASE_MAX_PRICE");
        //        cb.query().setMemberId_Equal(3);
        //        cb.query().setMemberName_PrefixSearch("S");
        //        cb.query().addSpecifiedDerivedOrderBy_Desc("PURCHASE_MAX_PRICE");
        //        cb.query().addOrderBy_MemberId_Asc();
        //        cb.paging(3, 1);
        //        PagingResultBean<Member> page = memberBhv.selectPage(cb);
        //        - - - - - - - - - -/
    }

    // -----------------------------------------------------
    //                                                Entity
    //                                                ------
    /**
     * 外だしSQLで一件検索: outsideSql().entitnHandling().selectEntity().
     */
    public void test_outsideSql_selectEntity_selectUnpaidSummaryMember() {
        // ## Arrange ##
        // SQLのパス
        String path = MemberBhv.PATH_selectUnpaidSummaryMember;

        // 検索条件
        UnpaidSummaryMemberPmb pmb = new UnpaidSummaryMemberPmb();
        pmb.setMemberId(3);

        // 戻り値Entityの型
        Class<UnpaidSummaryMember> entityType = UnpaidSummaryMember.class;

        // ## Act ##
        UnpaidSummaryMember member = memberBhv.outsideSql().entityHandling().selectEntity(path, pmb, entityType);

        // ## Assert ##
        log("unpaidSummaryMember=" + member);
        assertNotNull(member);
        assertEquals(3, member.getUnpaidManId().intValue());

        // [Description]
        // A. 存在しないIDを指定した場合はnullが戻る。
        // B. 結果が複数件の場合は例外発生。{EntityDuplicatedException}
    }

    /**
     * 外だしSQLでチェック付き一件検索: outsideSql().entitnHandling().selectEntityWithDeletedCheck().
     */
    public void test_outsideSql_selectEntityWithDeletedCheck_selectUnpaidSummaryMember() {
        // ## Arrange ##
        // SQLのパス
        String path = MemberBhv.PATH_selectUnpaidSummaryMember;

        // 検索条件
        UnpaidSummaryMemberPmb pmb = new UnpaidSummaryMemberPmb();
        pmb.setMemberId(99999);

        // 戻り値Entityの型
        Class<UnpaidSummaryMember> entityType = UnpaidSummaryMember.class;

        // ## Act & Assert ##
        try {
            memberBhv.outsideSql().entityHandling().selectEntityWithDeletedCheck(path, pmb, entityType);
            fail();
        } catch (EntityAlreadyDeletedException e) {
            // OK
            log(e.getMessage());
        }

        // 【Description】
        // A. 存在しないIDを指定した場合は例外発生。{EntityAlreadyDeletedException}
        // B. 結果が複数件の場合は例外発生。{EntityDuplicatedException}
    }

    /**
     * 外だしSQLでカラム一つだけの一件検索: outsideSql().entitnHandling().selectEntity().
     */
    public void test_outsideSql_SelectEntityWithDeletedCheck_selectLatestFormalizedDatetime() {
        // ## Arrange ##
        // SQLのパス
        String path = MemberBhv.PATH_selectLatestFormalizedDatetime;

        // 検索条件
        Object pmb = null;

        // 戻り値Entityの型
        Class<Timestamp> entityType = Timestamp.class;// *Point!

        // ## Act ##
        Timestamp maxValue = memberBhv.outsideSql().entityHandling().selectEntity(path, pmb, entityType);

        // ## Assert ##
        log("maxValue=" + maxValue);
        assertNotNull(maxValue);
    }
}
