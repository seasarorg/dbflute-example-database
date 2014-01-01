package com.example.dbflute.oracle.dbflute.vendor;

import java.util.ArrayList;
import java.util.List;

import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.dbflute.cbean.OrQuery;
import org.seasar.dbflute.cbean.coption.LikeSearchOption;
import org.seasar.dbflute.dbway.DBWay;
import org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException;
import org.seasar.dbflute.exception.EntityAlreadyDeletedException;
import org.seasar.dbflute.exception.EntityAlreadyUpdatedException;

import com.example.dbflute.oracle.dbflute.allcommon.DBCurrent;
import com.example.dbflute.oracle.dbflute.cbean.MemberCB;
import com.example.dbflute.oracle.dbflute.exbhv.MemberBhv;
import com.example.dbflute.oracle.dbflute.exbhv.pmbean.SimpleMemberPmb;
import com.example.dbflute.oracle.dbflute.exentity.Member;
import com.example.dbflute.oracle.dbflute.exentity.customize.SimpleMember;
import com.example.dbflute.oracle.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.6.1 (2008/01/23 Wednesday)
 */
public class VendorCheckTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private MemberBhv memberBhv;

    // ===================================================================================
    //                                                                       ConditionBean
    //                                                                       =============
    // -----------------------------------------------------
    //                                                  Lock
    //                                                  ----
    public void test_ConditionBean_lockForUpdate() throws Exception {
        // ## Arrange ##
        final MemberCB cb = new MemberCB();
        cb.query().setMemberId_Equal(1L);
        cb.lockForUpdate();

        // ## Act ##
        final Member member = memberBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        assertNotNull(member);
        assertTrue(cb.toDisplaySql().contains(" for update of "));
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    public void test_insert_byAutoSequence() throws Exception {
        // ## Arrange ##
        final Member member = new Member();
        member.setMemberName("Billy Joel");
        member.setMemberAccount("billyjoel");
        member.setMemberStatusCode_Formalized();

        // ## Act ##
        memberBhv.insert(member);

        // ## Assert ##
        final Member actualMember = memberBhv.selectByPKValueWithDeletedCheck(member.getMemberId());
        assertNotNull(actualMember);
        assertEquals("Billy Joel", actualMember.getMemberName());
    }

    public void test_insert_byManualSequence() throws Exception {
        // ## Arrange ##
        final Member member = new Member();
        member.setMemberId(memberBhv.selectNextVal());
        member.setMemberName("Billy Joel");
        member.setMemberAccount("billyjoel");
        member.setMemberStatusCode_Formalized();

        // ## Act ##
        memberBhv.insert(member);

        // ## Assert ##
        final Member actualMember = memberBhv.selectByPKValueWithDeletedCheck(member.getMemberId());
        assertNotNull(actualMember);
        assertEquals("Billy Joel", actualMember.getMemberName());
    }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    public void test_batchUpdate_and_batchDelete_AlreadyUpdated() {
        // ## Arrange ##
        List<Long> memberIdList = new ArrayList<Long>();
        memberIdList.add(1L);
        memberIdList.add(3L);
        memberIdList.add(7L);
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
        List<Long> memberIdList = new ArrayList<Long>();
        memberIdList.add(1L);
        memberIdList.add(3L);
        memberIdList.add(7L);
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
                member.setMemberId(9999999L);
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
    /**
     * Oracle特有の「全角の％と＿もWildcardとして扱う」のExample実装
     */
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
        assertEquals("escapeなしで2件ともHITすること", 2, memberBhv.selectList(checkCB).size());

        // /- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
        MemberCB cb = new MemberCB();
        LikeSearchOption option = new LikeSearchOption().likeContain(); // *Point!
        cb.query().setMemberName_LikeSearch(keyword, option);
        // - - - - - - - - - -/

        String displaySql = cb.toDisplaySql();
        assertTrue(displaySql.contains("100|％ジュース||和歌山|＿テ"));

        // ## Act ##
        List<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertNotNull(memberList);
        assertEquals(1, memberList.size());// このキーワードにHITする人は１人しかいない
        Member actualMember = memberList.get(0);
        log(actualMember);
        assertEquals(expectedMemberName, actualMember.getMemberName());
    }

    public void test_LikeSearch_WildCard_variousChar_selectByCB() {
        // ## Arrange ##
        Member member = new Member();
        member.setMemberId(3L);
        member.setMemberName("fo[v]％c%o");
        memberBhv.updateNonstrict(member);
        member.setMemberId(4L);
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
        member.setMemberId(3L);
        member.setMemberName("[v]％c%o");
        memberBhv.updateNonstrict(member);
        member.setMemberId(4L);
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
        assertEquals("ABC|％CBA", option.generateRealValue("ABC％CBA"));
        assertEquals("ABC|＿CBA", option.generateRealValue("ABC＿CBA"));
        assertEquals("ABC|％CB|%A", option.generateRealValue("ABC％CB%A"));
        assertEquals("ABC|＿CB|_A", option.generateRealValue("ABC＿CB_A"));
        assertEquals("ABC|＿C[]B|_A", option.generateRealValue("ABC＿C[]B_A"));
    }
    /**
     * Oracleのバージョン対応の「全角の％と＿もWildcardとして扱わない」のExample実装
     */
    public void test_LikeSearch_WildCard_DoubleByte_suppress() {
        // TODO jflute
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
        assertEquals("escapeなしで2件ともHITすること", 2, memberBhv.selectList(checkCB).size());

        // /- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
        MemberCB cb = new MemberCB();
        LikeSearchOption option = new LikeSearchOption().likeContain(); // *Point!
        cb.query().setMemberName_LikeSearch(keyword, option);
        // - - - - - - - - - -/

        String displaySql = cb.toDisplaySql();
        assertTrue(displaySql.contains("100|％ジュース||和歌山|＿テ"));

        // ## Act ##
        List<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertNotNull(memberList);
        assertEquals(1, memberList.size());// このキーワードにHITする人は１人しかいない
        Member actualMember = memberList.get(0);
        log(actualMember);
        assertEquals(expectedMemberName, actualMember.getMemberName());
    }

    // ===================================================================================
    //                                                                        InScopeQuery
    //                                                                        ============
    public void test_query_InScope_SeveralRegistered_basic() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        List<Long> memberIdList = new ArrayList<Long>();
        for (long i = 0; i < 3123; i++) {
            memberIdList.add(i);
        }
        cb.query().setMemberStatusCode_Equal_Formalized();
        cb.query().setMemberId_InScope(memberIdList);

        // ## Act ##
        List<Member> memberList = memberBhv.selectList(cb); // Except no exception

        // ## Assert ##
        assertNotNull(memberList);
        assertNotSame(0, memberList.size());
        String displaySql = cb.toDisplaySql();
        assertTrue(displaySql.contains(" in ("));
        assertTrue(displaySql.contains(" or "));
        assertTrue(displaySql.contains(", 999)"));
        assertTrue(displaySql.contains("(1000, "));
        assertTrue(displaySql.contains(", 1999)"));
        assertTrue(displaySql.contains("(2000, "));
        assertTrue(displaySql.contains(", 2999)"));
        assertTrue(displaySql.contains("(3000, "));
        assertTrue(displaySql.contains(", 3122)"));
    }

    public void test_query_InScope_SeveralRegistered_just() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        List<Long> memberIdList = new ArrayList<Long>();
        for (long i = 0; i < 1000; i++) {
            memberIdList.add(i);
        }
        cb.query().setMemberStatusCode_Equal_Formalized();
        cb.query().setMemberId_InScope(memberIdList);

        // ## Act ##
        List<Member> memberList = memberBhv.selectList(cb); // Except no exception

        // ## Assert ##
        assertNotNull(memberList);
        assertNotSame(0, memberList.size());
        String displaySql = cb.toDisplaySql();
        assertTrue(displaySql.contains(" in ("));
        assertFalse(displaySql.contains(" or "));
        assertTrue(displaySql.contains(", 999)"));
    }

    public void test_query_InScope_SeveralRegistered_justPlus() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        List<Long> memberIdList = new ArrayList<Long>();
        for (long i = 0; i < 1001; i++) {
            memberIdList.add(i);
        }
        cb.query().setMemberStatusCode_Equal_Formalized();
        cb.query().setMemberId_InScope(memberIdList);

        // ## Act ##
        List<Member> memberList = memberBhv.selectList(cb); // Except no exception

        // ## Assert ##
        assertNotNull(memberList);
        assertNotSame(0, memberList.size());
        String displaySql = cb.toDisplaySql();
        assertTrue(displaySql.contains(" in ("));
        assertTrue(displaySql.contains(" or "));
        assertTrue(displaySql.contains(", 999)"));
        assertTrue(displaySql.contains("(1000)"));
    }

    public void test_query_InScope_SeveralRegistered_secondJust() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        List<Long> memberIdList = new ArrayList<Long>();
        for (long i = 0; i < 2000; i++) {
            memberIdList.add(i);
        }
        cb.query().setMemberStatusCode_Equal_Formalized();
        cb.query().setMemberId_InScope(memberIdList);

        // ## Act ##
        List<Member> memberList = memberBhv.selectList(cb); // Except no exception

        // ## Assert ##
        assertNotNull(memberList);
        assertNotSame(0, memberList.size());
        String displaySql = cb.toDisplaySql();
        assertTrue(displaySql.contains(" in ("));
        assertTrue(displaySql.contains(" or "));
        assertTrue(displaySql.contains(", 999)"));
        assertTrue(displaySql.contains("(1000, "));
    }

    public void test_query_InScope_with_OrScopeQuery_() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        final List<Long> memberIdList = new ArrayList<Long>();
        for (long i = 0; i < 3123; i++) {
            memberIdList.add(i);
        }
        cb.query().setFormalizedDatetime_IsNotNull();
        cb.orScopeQuery(new OrQuery<MemberCB>() {
            public void query(MemberCB orCB) {
                orCB.query().setMemberStatusCode_Equal_Formalized();
                orCB.query().setMemberId_InScope(memberIdList);
            }
        });

        // ## Act ##
        List<Member> memberList = memberBhv.selectList(cb); // Except no exception

        // ## Assert ##
        assertNotNull(memberList);
        assertNotSame(0, memberList.size());
        String displaySql = cb.toDisplaySql();
        assertTrue(displaySql.contains(" in ("));
        assertTrue(displaySql.contains(" or "));
        assertTrue(displaySql.contains(", 999)"));
        assertTrue(displaySql.contains("(1000, "));
        assertTrue(displaySql.contains(", 1999)"));
        assertTrue(displaySql.contains("(2000, "));
        assertTrue(displaySql.contains(", 2999)"));
        assertTrue(displaySql.contains("(3000, "));
        assertTrue(displaySql.contains(", 3122)"));
    }

    // ===================================================================================
    //                                                                     NotInScopeQuery
    //                                                                     ===============
    public void test_query_NotInScope_SeveralRegistered_basic() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        List<Long> memberIdList = new ArrayList<Long>();
        for (long i = 0; i < 3123; i++) {
            memberIdList.add(i);
        }
        cb.query().setMemberStatusCode_Equal_Formalized();
        cb.query().setMemberId_NotInScope(memberIdList);

        // ## Act ##
        List<Member> memberList = memberBhv.selectList(cb); // Except no exception

        // ## Assert ##
        assertNotNull(memberList);
        assertTrue(memberList.isEmpty());
        String displaySql = cb.toDisplaySql();
        assertTrue(displaySql.contains(" not in ("));
        assertTrue(displaySql.contains(" and "));
        assertTrue(displaySql.contains(", 999)"));
        assertTrue(displaySql.contains("(1000, "));
        assertTrue(displaySql.contains(", 1999)"));
        assertTrue(displaySql.contains("(2000, "));
        assertTrue(displaySql.contains(", 2999)"));
        assertTrue(displaySql.contains("(3000, "));
        assertTrue(displaySql.contains(", 3122)"));
    }

    public void test_query_NotInScope_SeveralRegistered_just() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        List<Long> memberIdList = new ArrayList<Long>();
        for (long i = 0; i < 1000; i++) {
            memberIdList.add(i);
        }
        cb.query().setMemberStatusCode_Equal_Formalized();
        cb.query().setMemberId_NotInScope(memberIdList);

        // ## Act ##
        List<Member> memberList = memberBhv.selectList(cb); // Except no exception

        // ## Assert ##
        assertNotNull(memberList);
        assertTrue(memberList.isEmpty());
        String displaySql = cb.toDisplaySql();
        assertTrue(displaySql.contains(" not in ("));
        assertTrue(displaySql.contains(", 999)"));
    }

    public void test_query_NotInScope_SeveralRegistered_justPlus() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        List<Long> memberIdList = new ArrayList<Long>();
        for (long i = 0; i < 1001; i++) {
            memberIdList.add(i);
        }
        cb.query().setMemberStatusCode_Equal_Formalized();
        cb.query().setMemberId_NotInScope(memberIdList);

        // ## Act ##
        List<Member> memberList = memberBhv.selectList(cb); // Except no exception

        // ## Assert ##
        assertNotNull(memberList);
        assertTrue(memberList.isEmpty());
        String displaySql = cb.toDisplaySql();
        assertTrue(displaySql.contains(" not in ("));
        assertTrue(displaySql.contains(" and "));
        assertTrue(displaySql.contains(", 999)"));
        assertTrue(displaySql.contains("(1000)"));
    }

    public void test_query_NotInScope_SeveralRegistered_secondJust() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        List<Long> memberIdList = new ArrayList<Long>();
        for (long i = 0; i < 2000; i++) {
            memberIdList.add(i);
        }
        cb.query().setMemberStatusCode_Equal_Formalized();
        cb.query().setMemberId_NotInScope(memberIdList);

        // ## Act ##
        List<Member> memberList = memberBhv.selectList(cb); // Except no exception

        // ## Assert ##
        assertNotNull(memberList);
        assertTrue(memberList.isEmpty());
        String displaySql = cb.toDisplaySql();
        assertTrue(displaySql.contains(" not in ("));
        assertTrue(displaySql.contains(" and "));
        assertTrue(displaySql.contains(", 999)"));
        assertTrue(displaySql.contains("(1000, "));
    }

    public void test_query_NotInScope_with_OrScopeQuery() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        final List<Long> memberIdList = new ArrayList<Long>();
        for (long i = 0; i < 3123; i++) {
            memberIdList.add(i);
        }
        cb.query().setFormalizedDatetime_IsNotNull();
        cb.orScopeQuery(new OrQuery<MemberCB>() {
            public void query(MemberCB orCB) {
                orCB.query().setMemberId_NotInScope(memberIdList);
            }
        });

        // ## Act ##
        List<Member> memberList = memberBhv.selectList(cb); // Except no exception

        // ## Assert ##
        assertNotNull(memberList);
        assertTrue(memberList.isEmpty());
        String displaySql = cb.toDisplaySql();
        assertTrue(displaySql.contains(" not in ("));
        assertTrue(displaySql.contains(" and "));
        assertTrue(displaySql.contains(", 999)"));
        assertTrue(displaySql.contains("(1000, "));
        assertTrue(displaySql.contains(", 1999)"));
        assertTrue(displaySql.contains("(2000, "));
        assertTrue(displaySql.contains(", 2999)"));
        assertTrue(displaySql.contains("(3000, "));
        assertTrue(displaySql.contains(", 3122)"));
    }
}