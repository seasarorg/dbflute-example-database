package com.example.dbflute.sqlserver.dbflute.vendor;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.dbflute.cbean.ScalarQuery;
import org.seasar.dbflute.cbean.SubQuery;
import org.seasar.dbflute.cbean.UnionQuery;
import org.seasar.dbflute.cbean.coption.LikeSearchOption;
import org.seasar.dbflute.dbway.DBWay;
import org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException;
import org.seasar.dbflute.exception.EntityAlreadyDeletedException;
import org.seasar.dbflute.exception.EntityAlreadyUpdatedException;
import org.seasar.dbflute.exception.SQLFailureException;

import com.example.dbflute.sqlserver.dbflute.allcommon.DBCurrent;
import com.example.dbflute.sqlserver.dbflute.cbean.MemberCB;
import com.example.dbflute.sqlserver.dbflute.cbean.MemberWithdrawalCB;
import com.example.dbflute.sqlserver.dbflute.cbean.PurchaseCB;
import com.example.dbflute.sqlserver.dbflute.cbean.SummaryWithdrawalCB;
import com.example.dbflute.sqlserver.dbflute.exbhv.MemberBhv;
import com.example.dbflute.sqlserver.dbflute.exbhv.MemberWithdrawalBhv;
import com.example.dbflute.sqlserver.dbflute.exbhv.SummaryWithdrawalBhv;
import com.example.dbflute.sqlserver.dbflute.exbhv.pmbean.SimpleMemberPmb;
import com.example.dbflute.sqlserver.dbflute.exentity.Member;
import com.example.dbflute.sqlserver.dbflute.exentity.MemberWithdrawal;
import com.example.dbflute.sqlserver.dbflute.exentity.customize.SimpleMember;
import com.example.dbflute.sqlserver.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.6.1 (2008/01/23 Wednesday)
 */
public class VendorCheckTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private MemberBhv memberBhv;
    private MemberWithdrawalBhv memberWithdrawalBhv;
    private SummaryWithdrawalBhv summaryWithdrawalBhv;

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    public void test_batchUpdate_and_batchDelete_AlreadyUpdated() {
        // ## Arrange ##
        List<Integer> memberIdList = new ArrayList<Integer>();
        memberIdList.add(1);
        memberIdList.add(3);
        memberIdList.add(7);
        MemberCB cb = new MemberCB();
        cb.query().setMemberId_InScope(memberIdList);
        ListResultBean<Member> memberList = memberBhv.selectList(cb);
        int count = 0;
        for (Member member : memberList) {
            member.setMemberName("testName" + count);
            member.setMemberAccount("testAccount" + count);
            member.setMemberStatusCode_Provisional();
            member.setFormalizedDatetime(currentTimestamp());
            member.setBirthdate(currentTimestamp());
            if (count == 1) {
                member.setVersionNo(999999999L);
            } else {
                member.setVersionNo(member.getVersionNo()); // to keep same-set columns
            }
            ++count;
        }

        // ## Act & Assert ##
        try {
            memberBhv.batchUpdate(memberList);
            fail();
        } catch (EntityAlreadyUpdatedException e) {
            // OK
            log(e.getMessage());
            assertTrue(e instanceof BatchEntityAlreadyUpdatedException);
            log("batchUpdateCount=" + ((BatchEntityAlreadyUpdatedException) e).getBatchUpdateCount());
        }
        deleteMemberReferrer();
        try {
            memberBhv.batchDelete(memberList);
            fail();
        } catch (EntityAlreadyUpdatedException e) {
            // OK
            log(e.getMessage());
            assertTrue(e instanceof BatchEntityAlreadyUpdatedException);
            log("batchUpdateCount=" + ((BatchEntityAlreadyUpdatedException) e).getBatchUpdateCount());
        }
    }

    public void test_batchUpdateNonstrict_and_batchDeleteNonstrict_AlreadyDeleted() {
        // ## Arrange ##
        List<Integer> memberIdList = new ArrayList<Integer>();
        memberIdList.add(1);
        memberIdList.add(3);
        memberIdList.add(7);
        MemberCB cb = new MemberCB();
        cb.query().setMemberId_InScope(memberIdList);
        ListResultBean<Member> memberList = memberBhv.selectList(cb);
        int count = 0;
        for (Member member : memberList) {
            member.setMemberName("testName" + count);
            member.setMemberAccount("testAccount" + count);
            member.setMemberStatusCode_Provisional();
            member.setFormalizedDatetime(currentTimestamp());
            member.setBirthdate(currentTimestamp());
            if (count == 1) {
                member.setMemberId(9999999);
            } else {
                member.setMemberId(member.getMemberId()); // to keep same-set columns
            }
            ++count;
        }

        // ## Act & Assert ##
        try {
            memberBhv.batchUpdateNonstrict(memberList);
            fail();
        } catch (EntityAlreadyDeletedException e) {
            // OK
            log(e.getMessage());
        }
        deleteMemberReferrer();
        try {
            memberBhv.batchDeleteNonstrict(memberList);
            fail();
        } catch (EntityAlreadyDeletedException e) {
            // OK
            log(e.getMessage());
        }
    }

    // ===================================================================================
    //                                                                 LikeSearch WildCard
    //                                                                 ===================
    public void test_LikeSearch_WildCard_DoubleByte_select() {
        // ## Arrange ##
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
        assertEquals("escapeなしでも1件だけHITすること", 1, memberBhv.selectList(checkCB).size());

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
        assertEquals(1, memberList.size()); // escapeしてもHITすること
        Member actualMember = memberList.get(0);
        log(actualMember);
        assertEquals(expectedMemberName, actualMember.getMemberName());
    }

    public void test_LikeSearch_WildCard_variousChar_selectByCB() {
        // ## Arrange ##
        Member member = new Member();
        member.setMemberId(3);
        member.setMemberName("fo[v]％c%o");
        memberBhv.updateNonstrict(member);
        member.setMemberId(4);
        member.setMemberName("fo[v]％barc%o");
        memberBhv.updateNonstrict(member);
        MemberCB cb = new MemberCB();
        cb.query().setMemberName_LikeSearch("[v]％c", new LikeSearchOption().likeContain());

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertFalse(memberList.isEmpty());
        assertEquals(1, memberList.size());
        assertEquals("fo[v]％c%o", memberList.get(0).getMemberName());
        // unused escape char should be ignored
    }

    public void test_LikeSearch_WildCard_variousChar_selectByPmb() {
        // ## Arrange ##
        Member member = new Member();
        member.setMemberId(3);
        member.setMemberName("[v]％c%o");
        memberBhv.updateNonstrict(member);
        member.setMemberId(4);
        member.setMemberName("[v]％barc%o");
        memberBhv.updateNonstrict(member);
        SimpleMemberPmb pmb = new SimpleMemberPmb();
        pmb.setMemberName_PrefixSearch("[v]％c%");

        // ## Act ##
        ListResultBean<SimpleMember> memberList = memberBhv.outsideSql().selectList(pmb);

        // ## Assert ##
        assertFalse(memberList.isEmpty());
        assertEquals(1, memberList.size());
        assertEquals("[v]％c%o", memberList.get(0).getMemberName());
        // unused escape char should be ignored
    }

    public void test_LikeSearch_WildCard_variousChar_whiteOption() {
        // ## Arrange ##
        LikeSearchOption option = new LikeSearchOption();
        option.escapeByPipeLine();

        // ## Act & Assert ##
        assertEquals("ABC％CBA", option.generateRealValue("ABC％CBA"));
        assertEquals("ABC＿CBA", option.generateRealValue("ABC＿CBA"));
        assertEquals("ABC％CB|%A", option.generateRealValue("ABC％CB%A"));
        assertEquals("ABC＿CB|_A", option.generateRealValue("ABC＿CB_A"));
        assertEquals("ABC＿C[]B|_A", option.generateRealValue("ABC＿C[]B_A"));

        // ## Arrange ##
        DBWay dbway = DBCurrent.getInstance().currentDBDef().dbway();
        option.acceptOriginalWildCardList(dbway.getOriginalWildCardList());

        // ## Act & Assert ##
        assertEquals("ABC％CBA", option.generateRealValue("ABC％CBA"));
        assertEquals("ABC＿CBA", option.generateRealValue("ABC＿CBA"));
        assertEquals("ABC％CB|%A", option.generateRealValue("ABC％CB%A"));
        assertEquals("ABC＿CB|_A", option.generateRealValue("ABC＿CB_A"));
        assertEquals("ABC＿C|[|]B|_A", option.generateRealValue("ABC＿C[]B_A"));
    }

    // ===================================================================================
    //                                                                        InScopeQuery
    //                                                                        ============
    public void test_query_InScope_SeveralRegistered() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        List<Integer> memberIdList = new ArrayList<Integer>();
        for (int i = 0; i < 3123; i++) {
            memberIdList.add(i);
        }
        cb.query().setMemberStatusCode_Equal_Formalized();
        cb.query().setMemberId_InScope(memberIdList);

        // ## Act ##
        try {
            memberBhv.selectList(cb);

            // ## Assert ##
            fail();
        } catch (SQLFailureException e) {
            // OK
            // After all, SQLServer can bind until 2100.
            Throwable cause = e.getCause();
            if (cause instanceof SQLException) {
                log(((SQLException) cause).getNextException());
            } else {
                log(cause);
            }
        }
    }

    // ===================================================================================
    //                                                                        ScalarSelect
    //                                                                        ============
    public void test_scalarSelect_with_UnionQuery_text_basic() {
        // ## Arrange ##
        MemberWithdrawalCB cb = new MemberWithdrawalCB();
        ListResultBean<MemberWithdrawal> withdrawalList = memberWithdrawalBhv.selectList(cb);
        Timestamp expected = null;
        for (MemberWithdrawal withdrawal : withdrawalList) {
            Timestamp withdrawalDatetime = withdrawal.getWithdrawalDatetime();
            log("withdrawalDatetime = " + withdrawalDatetime);
            if (expected == null) {
                expected = withdrawalDatetime;
            } else {
                if (withdrawalDatetime.after(expected)) {
                    expected = withdrawalDatetime;
                }
            }
        }

        // ## Act ##
        Timestamp max = memberWithdrawalBhv.scalarSelect(Timestamp.class).max(new ScalarQuery<MemberWithdrawalCB>() {
            public void query(MemberWithdrawalCB cb) {
                cb.specify().columnWithdrawalDatetime();
                cb.union(new UnionQuery<MemberWithdrawalCB>() {
                    public void query(MemberWithdrawalCB unionCB) {
                    }
                });
            }
        }); // expected no exception about text in union

        // ## Assert ##
        log("max = " + max);
        assertEquals(expected, max);
    }

    public void test_scalarSelect_with_UnionQuery_text_noPrimaryKey() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.specify().derivedPurchaseList().max(new SubQuery<PurchaseCB>() {
            public void query(PurchaseCB subCB) {
                subCB.specify().columnPurchasePrice();
            }
        }, Member.ALIAS_productKindCount);
        cb.query().setMemberStatusCode_Equal_Withdrawal();
        cb.query().addSpecifiedDerivedOrderBy_Desc(Member.ALIAS_productKindCount);
        ListResultBean<Member> memberList = memberBhv.selectList(cb);
        Integer expected = 0;
        for (Member member : memberList) {
            Integer maxPurchasePrice = member.getProductKindCount();
            log("maxPurchasePrice = " + maxPurchasePrice);
            expected = expected + maxPurchasePrice;
        }

        // ## Act ##
        try {
            Integer sum = summaryWithdrawalBhv.scalarSelect(Integer.class).sum(new ScalarQuery<SummaryWithdrawalCB>() {
                public void query(SummaryWithdrawalCB cb) {
                    cb.specify().columnMaxPurchasePrice();
                    cb.union(new UnionQuery<SummaryWithdrawalCB>() {
                        public void query(SummaryWithdrawalCB unionCB) {
                        }
                    });
                }
            });

            // ## Assert ##
            fail("sum = " + sum);
        } catch (SQLFailureException e) { // because text type cannot be selected as distinct
            // OK
            log(e.getMessage());
        }
    }
}
