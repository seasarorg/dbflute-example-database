package com.example.dbflute.msaccess.dbflute.howto;

import static org.junit.Assert.*;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.seasar.dbflute.bhv.ConditionBeanSetupper;
import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.dbflute.cbean.PagingResultBean;
import org.seasar.dbflute.cbean.SubQuery;
import org.seasar.dbflute.cbean.UnionQuery;
import org.seasar.dbflute.cbean.coption.LikeSearchOption;

import com.example.dbflute.msaccess.dbflute.cbean.MemberCB;
import com.example.dbflute.msaccess.dbflute.cbean.PurchaseCB;
import com.example.dbflute.msaccess.dbflute.exbhv.MemberBhv;
import com.example.dbflute.msaccess.dbflute.exbhv.PurchaseBhv;
import com.example.dbflute.msaccess.dbflute.exentity.Member;
import com.example.dbflute.msaccess.dbflute.exentity.MemberWithdrawal;
import com.example.dbflute.msaccess.dbflute.exentity.Product;
import com.example.dbflute.msaccess.dbflute.exentity.ProductStatus;
import com.example.dbflute.msaccess.dbflute.exentity.Purchase;
import com.example.dbflute.msaccess.dbflute.exentity.WithdrawalReason;
import com.example.dbflute.msaccess.unit.ContainerTestCase;

/**
 * @author jflute
 */
public class ConditionBeanMiddleTest extends ContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The behavior of Member. (Injection Object) */
    private MemberBhv memberBhv;

    /** The behavior of Purchase. (Injection Object) */
    private PurchaseBhv purchaseBhv;

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    /**
     * many(one)-to-one-to-one(親の親)を結合して取得する検索: setupSelect_Xxx().withXxx().
     * 「会員ステータス」と「会員退会情報」ならびに「退会理由」をSetupSelectして検索。
     */
    @Test
    public void test_setupSelect() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.setupSelect_MemberWithdrawalAsOne().withWithdrawalReason();

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, memberList.size());
        boolean existsWithdrawalReason = false;
        for (Member member : memberList) {
            log("[MEMBER]: " + member.getMemberName());
            MemberWithdrawal memberWithdrawalAsOne = member.getMemberWithdrawalAsOne();
            if (memberWithdrawalAsOne != null) {// {1 : 0...1}の関連なのでnullチェック
                WithdrawalReason withdrawalReason = memberWithdrawalAsOne.getWithdrawalReason();
                if (withdrawalReason != null) {// NullableなFKなのでnullチェック
                    String withdrawalReasonCode = memberWithdrawalAsOne.getWithdrawalReasonCode();
                    String withdrawalReasonText = withdrawalReason.getWithdrawalReasonText();
                    log("    [WITHDRAWAL]" + withdrawalReasonCode + " - " + withdrawalReasonText);
                    existsWithdrawalReason = true;
                } else {
                    log("    [WITHDRAWAL]" + memberWithdrawalAsOne);
                }
            }
        }
        assertTrue(existsWithdrawalReason);

        // [Description]
        // A. setupSelect_Xxx()した後に続いてwithXxx()と指定することでさらに上の階層を指定できる。
        // B. 指定できる階層は無限階層である。(withXxx().withXxx().withXxx()...)
    }

    /**
     * many(one)-to-one-to-one-to-one(親の親の親)を結合して取得する検索:
     * setupSelect_Xxx().withXxx().withXxx().
     * 購入から会員、会員から会員退会情報、会員退会情報から退会理由までの３階層を結合して取得。
     * 実務ではあまりこういった検索はないと思われるが、説明材料のExampleとして実装している。
     */
    @Test
    public void test_setupSelect_withForeign_withForeign() {
        // ## Arrange ##
        PurchaseCB cb = new PurchaseCB();
        cb.setupSelect_Member().withMemberWithdrawalAsOne().withWithdrawalReason();// *Point!
        cb.setupSelect_Member().withMemberStatus();
        cb.setupSelect_Product().withProductStatus();
        cb.query().addOrderBy_PurchaseDatetime_Desc().addOrderBy_PurchaseId_Asc();

        // ## Act ##
        ListResultBean<Purchase> purchaseList = purchaseBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, purchaseList.size());
        boolean existsWithdrawal = false;
        for (Purchase purchase : purchaseList) {
            Product product = purchase.getProduct();
            ProductStatus productStatus = product.getProductStatus();
            assertNotNull(product);
            assertNotNull(productStatus);
            log("[PURCHASE]: " + purchase.getPurchaseId() + ", " + product.getProductName() + ", " + productStatus);
            Member member = purchase.getMember();
            assertNotNull(member);
            assertNotNull(member.getMemberStatus());

            MemberWithdrawal memberWithdrawalAsOne = member.getMemberWithdrawalAsOne();
            if (memberWithdrawalAsOne != null) {
                WithdrawalReason withdrawalReason = memberWithdrawalAsOne.getWithdrawalReason();
                if (withdrawalReason != null) {
                    String reasonText = withdrawalReason.getWithdrawalReasonText();
                    log("    [MEMBER]: " + member.getMemberId() + ", " + member.getMemberName() + ", " + reasonText);
                    assertNotNull(reasonText);
                    existsWithdrawal = true;
                }
            }
        }
        assertTrue("退会者が少なくとも一人以上は存在してないとテストにならない", existsWithdrawal);
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    // -----------------------------------------------------
    //                                                 Equal
    //                                                 -----
    @Test
    public void test_query_setMemberStatusCode_Equal_Classification() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.query().setMemberStatusCode_Equal_Formalized();// *Point!

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, memberList.size());
        for (Member member : memberList) {
            assertTrue(member.isMemberStatusCodeFormalized());
        }
    }

    // -----------------------------------------------------
    //                                              NotEqual
    //                                              --------
    @Test
    public void test_query_NotEqual() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.query().setMemberId_NotEqual(3);// *Point!

        // ## Act ##
        List<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertNotNull(memberList);
        assertNotSame(0, memberList.size());
        for (Member member : memberList) {
            assertNotSame(String.valueOf(3), String.valueOf(member.getMemberId()));
        }
    }

    @Test
    public void test_query_NotEqual_Classification() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.query().setMemberStatusCode_NotEqual_Formalized();// *Point!

        // ## Act ##
        List<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertNotNull(memberList);
        assertNotSame(0, memberList.size());
        for (Member member : memberList) {
            assertFalse(member.isMemberStatusCodeFormalized());
        }
    }

    // -----------------------------------------------------
    //                                           GreaterThan
    //                                           -----------
    @Test
    public void test_query_GreaterThan() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.query().setMemberId_GreaterThan(3);// *Point!

        // ## Act ##
        List<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertNotNull(memberList);
        assertNotSame(0, memberList.size());
        for (Member member : memberList) {
            assertTrue(member.getMemberId() > 3);
        }

        // [SQL]
        // where MEMBER_ID > 3
    }

    // -----------------------------------------------------
    //                                          GreaterEqual
    //                                          ------------
    @Test
    public void test_query_GreaterEqual() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.query().setMemberId_GreaterEqual(3);// *Point!

        // ## Act ##
        List<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertNotNull(memberList);
        assertNotSame(0, memberList.size());
        for (Member member : memberList) {
            assertTrue(member.getMemberId() >= 3);
        }

        // [SQL]
        // where MEMBER_ID >= 3
    }

    // -----------------------------------------------------
    //                                              LessThan
    //                                              --------
    @Test
    public void test_query_LessThan() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.query().setMemberId_LessThan(3);// *Point!

        // ## Act ##
        List<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertNotNull(memberList);
        assertNotSame(0, memberList.size());
        for (Member member : memberList) {
            assertTrue(member.getMemberId() < 3);
        }

        // [SQL]
        // where MEMBER_ID < 3
    }

    // -----------------------------------------------------
    //                                             LessEqual
    //                                             ---------
    @Test
    public void test_query_LessEqual() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.query().setMemberId_LessEqual(3);// *Point!

        // ## Act ##
        List<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertNotNull(memberList);
        assertNotSame(0, memberList.size());
        for (Member member : memberList) {
            assertTrue(member.getMemberId() <= 3);
        }

        // [SQL]
        // where MEMBER_ID <= 3
    }

    // -----------------------------------------------------
    //                                          PrefixSearch
    //                                          ------------
    @Test
    public void test_query_PrefixSearch() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.query().setMemberName_PrefixSearch("S");// *Point!

        // ## Act ##
        List<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertNotNull(memberList);
        assertNotSame(0, memberList.size());
        for (Member member : memberList) {
            log("memberName=" + member.getMemberName());
            assertTrue(member.getMemberName().startsWith("S"));
        }

        // [SQL]
        // where MEMBER_NAME like 'S%'

        // [Description]
        // A. ワイルドカード'%'は内部的に自動付与される。
        // B. エスケープ処理はされない。
        // --> エスケープ処理はLikeSearchを利用
    }

    // -----------------------------------------------------
    //                                               InScope
    //                                               -------
    @Test
    public void test_query_InScope() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        List<Integer> expectedMemberIdList = new ArrayList<Integer>();
        expectedMemberIdList.add(3);
        expectedMemberIdList.add(6);
        expectedMemberIdList.add(7);
        cb.query().setMemberId_InScope(expectedMemberIdList);// *Point!

        // ## Act ##
        List<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertNotNull(memberList);
        assertNotSame(0, memberList.size());
        for (Member member : memberList) {
            log("memberId=" + member.getMemberId());
            assertTrue(expectedMemberIdList.contains(member.getMemberId()));
        }
    }

    // -----------------------------------------------------
    //                                            NotInScope
    //                                            ----------
    @Test
    public void test_query_NotInScope() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        List<Integer> expectedMemberIdList = new ArrayList<Integer>();
        expectedMemberIdList.add(3);
        expectedMemberIdList.add(6);
        expectedMemberIdList.add(7);
        cb.query().setMemberId_NotInScope(expectedMemberIdList);// *Point!

        // ## Act ##
        List<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertNotNull(memberList);
        assertNotSame(0, memberList.size());
        for (Member member : memberList) {
            log("memberId=" + member.getMemberId());
            if (expectedMemberIdList.contains(member.getMemberId())) {
                fail();
            }
        }
    }

    // -----------------------------------------------------
    //                                            LikeSearch
    //                                            ----------
    @Test
    public void test_query_LikeSearch_likePrefix() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();

        // *Point!
        LikeSearchOption option = new LikeSearchOption().likePrefix();
        cb.query().setMemberName_LikeSearch("S", option);

        // ## Act ##
        List<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertNotNull(memberList);
        assertNotSame(0, memberList.size());
        for (Member member : memberList) {
            log("memberName=" + member.getMemberName());
            assertTrue(member.getMemberName().startsWith("S"));
        }
    }

    @Test
    public void test_query_LikeSearch_likeContain() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();

        // *Point!
        LikeSearchOption option = new LikeSearchOption().likeContain();
        cb.query().setMemberName_LikeSearch("v", option);

        // ## Act ##
        List<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertNotNull(memberList);
        assertNotSame(0, memberList.size());
        for (Member member : memberList) {
            log("memberName=" + member.getMemberName());
            assertTrue(member.getMemberName().contains("v"));
        }

        // [Description]
        // A. LikeSearchOptionの指定は必須。(nullは例外)
    }

    @Test
    public void test_query_LikeSearch_likeSuffix() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();

        // *Point!
        LikeSearchOption option = new LikeSearchOption().likeSuffix();
        cb.query().setMemberName_LikeSearch("r", option);

        // ## Act ##
        List<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertNotNull(memberList);
        assertNotSame(0, memberList.size());
        for (Member member : memberList) {
            log("memberName=" + member.getMemberName());
            assertTrue(member.getMemberName().endsWith("r"));
        }
    }

    @Ignore
    public void test_query_LikeSearch_likeContain_escapeByPipeline_AllEscape() {
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
        checkCB.query().setMemberName_LikeSearch(keyword, new LikeSearchOption().likeContain());
        assertEquals("escapeなしで2件ともHITすること", 2, memberBhv.selectList(checkCB).size());

        // /- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
        // - - - - - -
        MemberCB cb = new MemberCB();
        LikeSearchOption option = new LikeSearchOption().likeContain().escapeByPipeLine();// *Point!
        cb.query().setMemberName_LikeSearch(keyword, option);
        // - - - - - - - - - -/

        // ## Act ##
        List<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertNotNull(memberList);
        assertEquals(1, memberList.size());// このキーワードにHITする人は１人しかいない
        Member actualMember = memberList.get(0);
        log(actualMember);
        assertEquals(expectedMemberName, actualMember.getMemberName());

        // [SQL]
        // select ...
        // from MEMBER
        // where MEMBER_NAME like '%100|%ジュース||和歌山|_テ%' escape '|'
    }

    // -----------------------------------------------------
    //                                        ExistsSubQuery
    //                                        --------------
    @Test
    public void test_query_exists_ReferrerCondition() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();

        // *Point!
        cb.query().existsPurchaseList(new SubQuery<PurchaseCB>() {
            public void query(PurchaseCB subCB) {
                subCB.query().setPurchaseCount_GreaterThan(2);
            }
        });

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        memberBhv.loadPurchaseList(memberList, new ConditionBeanSetupper<PurchaseCB>() {
            public void setup(PurchaseCB subCB) {
                subCB.setupSelect_Product();
            }
        });
        for (Member member : memberList) {
            log("[MEMBER] " + member.getMemberId() + ", " + member.getMemberName());
            List<Purchase> purchaseList = member.getPurchaseList();
            boolean existsPurchase = false;
            for (Purchase purchase : purchaseList) {
                Product product = purchase.getProduct();
                Integer purchaseCount = purchase.getPurchaseCount();
                String productName = product.getProductName();
                log("    [PURCHASE] " + purchase.getPurchaseId() + ", " + purchaseCount + ", " + productName);
                if (purchaseCount > 2) {
                    existsPurchase = true;
                }
            }
            assertTrue(existsPurchase);
        }
    }

    @Test
    public void test_query_exists_ManyToManyCondition() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();

        // *Point!
        cb.query().existsPurchaseList(new SubQuery<PurchaseCB>() {
            public void query(PurchaseCB subCB) {
                subCB.query().queryProduct().setProductName_PrefixSearch("Storm");
            }
        });

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        memberBhv.loadPurchaseList(memberList, new ConditionBeanSetupper<PurchaseCB>() {
            public void setup(PurchaseCB subCB) {
                subCB.setupSelect_Product();
            }
        });
        for (Member member : memberList) {
            log("[MEMBER] " + member.getMemberId() + ", " + member.getMemberName());
            List<Purchase> purchaseList = member.getPurchaseList();
            boolean existsProduct = false;
            for (Purchase purchase : purchaseList) {
                Product product = purchase.getProduct();
                Integer purchaseCount = purchase.getPurchaseCount();
                String productName = product.getProductName();
                log("    [PURCHASE] " + purchase.getPurchaseId() + ", " + purchaseCount + ", " + productName);
                if (productName.startsWith("Storm")) {
                    existsProduct = true;
                }
            }
            assertTrue(existsProduct);
        }
    }

    @Test
    public void test_query_notExists_ReferrerCondition() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();

        // *Point!
        cb.query().notExistsPurchaseList(new SubQuery<PurchaseCB>() {
            public void query(PurchaseCB subCB) {
                subCB.query().setPurchaseCount_GreaterThan(2);
            }
        });

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        ConditionBeanSetupper<PurchaseCB> setuppper = new ConditionBeanSetupper<PurchaseCB>() {
            public void setup(PurchaseCB subCB) {
                subCB.setupSelect_Product();
            }
        };
        memberBhv.loadPurchaseList(memberList, setuppper);
        for (Member member : memberList) {
            log("[MEMBER] " + member.getMemberId() + ", " + member.getMemberName());
            List<Purchase> purchaseList = member.getPurchaseList();
            boolean existsPurchase = false;
            for (Purchase purchase : purchaseList) {
                Product product = purchase.getProduct();
                Integer purchaseCount = purchase.getPurchaseCount();
                String productName = product.getProductName();
                log("    [PURCHASE] " + purchase.getPurchaseId() + ", " + purchaseCount + ", " + productName);
                if (purchaseCount > 2) {
                    existsPurchase = true;
                }
            }
            assertFalse(existsPurchase);
        }
    }

    // -----------------------------------------------------
    //                                       InScopeSubQuery
    //                                       ---------------
    @Test
    public void test_query_inScope_ReferrerCondition() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();

        // *Point!
        cb.query().inScopePurchaseList(new SubQuery<PurchaseCB>() {
            public void query(PurchaseCB subCB) {
                subCB.query().setPurchaseCount_GreaterThan(2);
            }
        });

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        memberBhv.loadPurchaseList(memberList, new ConditionBeanSetupper<PurchaseCB>() {
            public void setup(PurchaseCB subCB) {
                subCB.setupSelect_Product();
            }
        });
        for (Member member : memberList) {
            log("[MEMBER] " + member.getMemberId() + ", " + member.getMemberName());
            List<Purchase> purchaseList = member.getPurchaseList();
            boolean existsPurchase = false;
            for (Purchase purchase : purchaseList) {
                Product product = purchase.getProduct();
                Integer purchaseCount = purchase.getPurchaseCount();
                String productName = product.getProductName();
                log("    [PURCHASE] " + purchase.getPurchaseId() + ", " + purchaseCount + ", " + productName);
                if (purchaseCount > 2) {
                    existsPurchase = true;
                }
            }
            assertTrue(existsPurchase);
        }
    }

    @Test
    public void test_query_inScope_ManyToManyCondition() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();

        // *Point!
        cb.query().inScopePurchaseList(new SubQuery<PurchaseCB>() {
            public void query(PurchaseCB subCB) {
                subCB.query().queryProduct().setProductName_PrefixSearch("Storm");
            }
        });

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        memberBhv.loadPurchaseList(memberList, new ConditionBeanSetupper<PurchaseCB>() {
            public void setup(PurchaseCB subCB) {
                subCB.setupSelect_Product();
            }
        });
        for (Member member : memberList) {
            log("[MEMBER] " + member.getMemberId() + ", " + member.getMemberName());
            List<Purchase> purchaseList = member.getPurchaseList();
            boolean existsProduct = false;
            for (Purchase purchase : purchaseList) {
                Product product = purchase.getProduct();
                Integer purchaseCount = purchase.getPurchaseCount();
                String productName = product.getProductName();
                log("    [PURCHASE] " + purchase.getPurchaseId() + ", " + purchaseCount + ", " + productName);
                if (productName.startsWith("Storm")) {
                    existsProduct = true;
                }
            }
            assertTrue(existsProduct);
        }
    }

    @Test
    public void test_query_notInScope_ReferrerCondition() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();

        // *Point!
        cb.query().notInScopePurchaseList(new SubQuery<PurchaseCB>() {
            public void query(PurchaseCB subCB) {
                subCB.query().setPurchaseCount_GreaterThan(2);
            }
        });

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        memberBhv.loadPurchaseList(memberList, new ConditionBeanSetupper<PurchaseCB>() {
            public void setup(PurchaseCB subCB) {
                subCB.setupSelect_Product();
            }
        });
        for (Member member : memberList) {
            log("[MEMBER] " + member.getMemberId() + ", " + member.getMemberName());
            List<Purchase> purchaseList = member.getPurchaseList();
            boolean existsPurchase = false;
            for (Purchase purchase : purchaseList) {
                Product product = purchase.getProduct();
                Integer purchaseCount = purchase.getPurchaseCount();
                String productName = product.getProductName();
                log("    [PURCHASE] " + purchase.getPurchaseId() + ", " + purchaseCount + ", " + productName);
                if (purchaseCount > 2) {
                    existsPurchase = true;
                }
            }
            assertFalse(existsPurchase);
        }
    }

    // -----------------------------------------------------
    //                                            DateFromTo
    //                                            ----------
    @Test
    public void test_query_DateFromTo() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        Calendar cal = Calendar.getInstance();
        cal.set(2007, 10, 26);// 2007/11/26
        Date fromDate = new Date(cal.getTimeInMillis());
        cal.set(2007, 11, 1);// 2007/12/01
        Date toDate = new Date(cal.getTimeInMillis());
        cb.query().setMemberFormalizedDatetime_DateFromTo(fromDate, toDate);// *Point!

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, memberList.size());
        for (Member member : memberList) {
            log(member.getMemberName() + ", " + member.getMemberFormalizedDatetime());
        }
    }

    // ===================================================================================
    //                                                                               Union
    //                                                                               =====
    @Test
    public void test_union() {
        MemberCB cb = new MemberCB();
        cb.setupSelect_MemberStatus();
        cb.query().setMemberStatusCode_Equal_Provisional();
        cb.union(new UnionQuery<MemberCB>() {
            public void query(MemberCB unionCB) {
                unionCB.query().setMemberName_PrefixSearch("St");
            }
        });
        cb.query().addOrderBy_MemberName_Desc();

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        for (Member member : memberList) {
            String memberName = member.getMemberName();
            String memberStatusName = member.getMemberStatus().getMemberStatusName();
            if (!memberName.startsWith("St")) {
                log("[Provisional]: " + memberName + ", " + memberStatusName);
                assertTrue(member.isMemberStatusCodeProvisional());
            } else if (!member.isMemberStatusCodeProvisional()) {
                log("[Starts with St]: " + memberName + ", " + memberStatusName);
                assertTrue(memberName.startsWith("St"));
            } else {
                log("[Both]: " + memberName + ", " + memberStatusName);
            }
        }
    }

    @Test
    public void test_unionAll() {
        MemberCB cb = new MemberCB();
        Calendar cal = Calendar.getInstance();
        cal.set(1967, 0, 1);// 1967/01/01
        cb.query().setMemberBirthday_LessThan(new Timestamp(cal.getTimeInMillis()));
        cb.unionAll(new UnionQuery<MemberCB>() {
            public void query(MemberCB unionCB) {
                unionCB.query().setMemberBirthday_IsNull();
            }
        });
        cb.query().addOrderBy_MemberBirthday_Desc();
        cb.query().addOrderBy_MemberName_Asc();

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        for (Member member : memberList) {
            log("[MEMBER]: " + member.getMemberName() + ", " + member.getMemberBirthday());
        }
    }

    // ===================================================================================
    //                                                                              Paging
    //                                                                              ======
    @Test
    public void test_paging() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.query().addOrderBy_MemberName_Asc();
        cb.paging(4, 3);// The page size is 4 records per 1 page, and The page
        // number is 3.

        // ## Act ##
        PagingResultBean<Member> page3 = memberBhv.selectPage(cb);

        // ## Assert ##
        assertNotSame(0, page3.size());
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
    //                                                                       Fetch Setting
    //                                                                       =============
    /**
     * 先頭のn件を検索: cb.fetchFirst(fetchSize). 生年月日の降順で先頭の会員を検索。
     */
    @Test
    public void test_fetchFirst() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.query().addOrderBy_MemberBirthday_Desc();
        cb.fetchFirst(1);// *Point!

        // ## Act ##
        Member member = memberBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        log(member.getMemberName() + ", " + member.getMemberBirthday());

        // [Description]
        // A. DBFlute-0.7.3よりサポートされたpaging()メソッドでも同様のことが可能。
        // paging(1, 1);
        // 
        // B. 引数のfetchSizeは、マイナス値や０が指定されると例外発生
    }

    // ===================================================================================
    //                                                                        Lock Setting
    //                                                                        ============
    @Ignore
    public void test_lockForUpdate() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.query().setMemberId_Equal(3);
        cb.lockForUpdate();

        // ## Act ##
        Member member = memberBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        assertNotNull(member);
    }

    // ===================================================================================
    //                                                                         Display SQL
    //                                                                         ===========
    @Test
    public void test_toDisplaySql() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.setupSelect_MemberStatus();
        cb.query().setMemberName_LikeSearch("S", new LikeSearchOption().likePrefix().escapeByAtMark());
        cb.query().addOrderBy_MemberBirthday_Desc().addOrderBy_MemberId_Asc();
        cb.fetchFirst(2);
        cb.fetchPage(3);

        // ## Act ##
        String displaySql = cb.toDisplaySql();// *Point!

        // ## Assert ##
        StringBuilder sb = new StringBuilder();
        sb.append("{SQL}" + getLineSeparator());
        sb.append("***************************************************************");
        sb.append(getLineSeparator());
        sb.append(displaySql);
        sb.append(getLineSeparator());
        sb.append("**************************************************************");
        log(sb);
        assertTrue(displaySql.contains("'S%'"));
        assertTrue(displaySql.contains(" order by "));
    }

    @Test
    public void test_toDisplaySql_SubQuery() {
        MemberCB cb = new MemberCB();
        cb.setupSelect_MemberStatus();
        cb.query().existsPurchaseList(new SubQuery<PurchaseCB>() {
            public void query(PurchaseCB subCB) {
                subCB.query().setPurchaseDatetime_LessThan(currentTimestamp());
                subCB.query().setPurchaseCount_GreaterEqual(2);
            }
        });
        cb.query().existsPurchaseList(new SubQuery<PurchaseCB>() {
            public void query(PurchaseCB subCB) {
                subCB.query().setPurchaseDatetime_LessThan(currentTimestamp());
                subCB.query().setPurchaseCount_GreaterEqual(6);
            }
        });

        // ## Act ##
        String displaySql = cb.toDisplaySql();

        // ## Assert ##
        StringBuilder sb = new StringBuilder();
        sb.append("{SQL}" + getLineSeparator());
        sb.append("*******************************************").append(getLineSeparator());
        sb.append(displaySql + getLineSeparator());
        sb.append("*******************************************");
        log(sb);
        assertTrue(displaySql.contains(">= 2"));
        assertTrue(displaySql.contains(" exists "));
    }
}
