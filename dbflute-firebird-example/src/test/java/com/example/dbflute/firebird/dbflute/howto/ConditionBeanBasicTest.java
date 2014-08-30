package com.example.dbflute.firebird.dbflute.howto;

import java.util.List;

import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.dbflute.exception.SelectEntityConditionNotFoundException;

import com.example.dbflute.firebird.dbflute.cbean.MemberCB;
import com.example.dbflute.firebird.dbflute.exbhv.MemberBhv;
import com.example.dbflute.firebird.dbflute.exentity.Member;
import com.example.dbflute.firebird.dbflute.exentity.MemberStatus;
import com.example.dbflute.firebird.unit.AppContainerTestCase;

public class ConditionBeanBasicTest extends AppContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The behavior of Member. (Injection Object) */
    private MemberBhv memberBhv;

    // ===================================================================================
    //                                                                               Basic
    //                                                                               =====
    public void test_basic() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.setupSelect_MemberStatus();
        cb.query().setMemberName_PrefixSearch("S");
        cb.query().addOrderBy_Birthdate_Desc();

        // ## Act ##
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

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    // -----------------------------------------------------
    //                                                 Equal
    //                                                 -----
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

    public void test_query_Equal_TwoOrMoreCondition() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.query().setMemberId_Equal(1);// *Point!
        cb.query().setMemberAccount_Equal("Pixy");// *Point!

        // ## Act ##
        Member member = memberBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        assertNotNull(member);
        assertEquals((Integer) 1, member.getMemberId());
        assertEquals("Pixy", member.getMemberAccount());
    }

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

    public void test_query_Equal_ArgumentEmptyString() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.query().setMemberName_Equal("");// *Point!

        // ## Act ##
        int count = memberBhv.selectCount(cb);

        // ## Assert ##
        assertEquals("条件なしの件数と同じであること", memberBhv.selectCount(new MemberCB()), count);
    }

    // -----------------------------------------------------
    //                                               OrderBy
    //                                               -------
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

    public void test_query_addOrderBy_Desc_addOrderBy_Asc() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.query().addOrderBy_Birthdate_Desc();// *Point!
        cb.query().addOrderBy_MemberAccount_Desc();// *Point!

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, memberList.size());
        for (Member member : memberList) {
            log(member.getBirthdate() + ", " + member.getMemberAccount());
        }
    }

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
