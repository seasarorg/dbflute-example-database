package com.example.dbflute.tricky.dbflute.whitebox;

import com.example.dbflute.tricky.dbflute.cbean.MemberCB;
import com.example.dbflute.tricky.dbflute.exbhv.MemberBhv;
import com.example.dbflute.tricky.dbflute.exentity.Member;
import com.example.dbflute.tricky.unit.AppContainerTestCase;

/**
 * @author jflute
 * @since 0.9.6.9 (2010/05/12 Wednesday)
 */
public class WxEmptyStringTest extends AppContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private MemberBhv memberBhv;

    // ===================================================================================
    //                                                                       ConditionBean
    //                                                                       =============
    public void test_extended_emptyStringCondition() {
        // ## Arrange ##
        Member member = new Member();
        member.setMemberId(3);
        member.setMemberName("");
        memberBhv.updateNonstrict(member);

        // ## Act ##
        MemberCB cb = new MemberCB();
        cb.query().setMemberName_Equal_EmptyString();
        Member actual = memberBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        assertEquals("", actual.getMemberName());
    }

    public void test_generated_emptyStringCondition() {
        // ## Arrange ##
        Member member = new Member();
        member.setMemberId(3);
        member.setMemberAccount("");
        memberBhv.updateNonstrict(member);

        // ## Act ##
        MemberCB cb = new MemberCB();
        cb.query().setMemberAccount_Equal_EmptyString();
        Member actual = memberBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        assertEquals("", actual.getMemberAccount());
    }
}
