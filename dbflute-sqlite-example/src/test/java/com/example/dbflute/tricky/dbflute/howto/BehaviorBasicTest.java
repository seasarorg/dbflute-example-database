package com.example.dbflute.tricky.dbflute.howto;

import java.sql.Timestamp;
import java.util.List;

import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.dbflute.exception.EntityAlreadyDeletedException;
import org.seasar.dbflute.util.DfTypeUtil;

import com.example.dbflute.tricky.dbflute.cbean.MemberCB;
import com.example.dbflute.tricky.dbflute.exbhv.MemberBhv;
import com.example.dbflute.tricky.dbflute.exbhv.pmbean.SimpleMemberPmb;
import com.example.dbflute.tricky.dbflute.exentity.Member;
import com.example.dbflute.tricky.dbflute.exentity.customize.SimpleMember;
import com.example.dbflute.tricky.unit.AppContainerTestCase;

public class BehaviorBasicTest extends AppContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The behavior of Member. (Injection Component) */
    private MemberBhv memberBhv;

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
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
    }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
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
    public void test_insert() {
        // ## Arrange ##
        Member member = new Member();
        member.setMemberName("testName");
        member.setMemberAccount("testAccount");
        member.classifyMemberStatusCodeFormalizedMember();
        member.setBirthdate(DfTypeUtil.toDate("2010-03-31"));

        // ## Act ##
        memberBhv.insert(member);

        // ## Assert ##
        Member actual = memberBhv.selectByPKValueWithDeletedCheck(member.getMemberId());
        log(actual);
    }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    public void test_update() {
        // ## Arrange ##
        Member beforeMember = memberBhv.selectByPKValueWithDeletedCheck(3);
        Integer versionNo = beforeMember.getVersionNo();

        Member member = new Member();
        member.setMemberId(3);
        member.setMemberName("testName");
        member.setVersionNo(versionNo);
        Timestamp updateDatetime = member.getMemberUpdateDatetime();
        String updateUser = member.getMemberUpdateUser();
        String updateProcess = member.getMemberUpdateProcess();

        // ## Act ##
        memberBhv.update(member);

        // ## Assert ##
        assertNotSame(updateDatetime, member.getMemberUpdateDatetime());
        assertNotSame(updateUser, member.getMemberUpdateUser());
        assertNotSame(updateProcess, member.getMemberUpdateProcess());
    }

    // -----------------------------------------------------
    //                                                Delete
    //                                                ------
    public void test_delete() {
        // ## Arrange ##
        deleteMemberReferrer();

        Member beforeMember = memberBhv.selectByPKValueWithDeletedCheck(3);
        Integer versionNo = beforeMember.getVersionNo();

        Member member = new Member();
        member.setMemberId(3);
        member.setVersionNo(versionNo);

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

    public void test_deleteNonstrict() {
        // ## Arrange ##
        deleteMemberReferrer();

        Member member = new Member();
        member.setMemberId(3);

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

    public void test_deleteNonstrictIgnoreDeleted() {
        // ## Arrange ##
        Member member = new Member();
        member.setMemberId(99999);

        // ## Act ##
        memberBhv.deleteNonstrictIgnoreDeleted(member);

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
    public void test_outsideSql_selectList_selectSimpleMember() {
        // ## Arrange ##
        String path = MemberBhv.PATH_selectSimpleMember;
        SimpleMemberPmb pmb = new SimpleMemberPmb();
        pmb.setMemberName_PrefixSearch("S");
        Class<SimpleMember> entityType = SimpleMember.class;

        // ## Act ##ß
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
    public void test_outsideSql_execute_updateMemberChangedToWithdrawalForcedly() {
        // ## Arrange ##
        String path = MemberBhv.PATH_updateMemberChangedToWithdrawalForcedly;
        String pmb = "S";

        // ## Act ##
        int updatedCount = memberBhv.outsideSql().execute(path, pmb);

        // ## Assert ##
        log("updatedCount=" + updatedCount);
        assertNotSame(0, updatedCount);
    }
}
