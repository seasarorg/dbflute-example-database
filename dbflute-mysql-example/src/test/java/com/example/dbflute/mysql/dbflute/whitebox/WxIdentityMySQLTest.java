package com.example.dbflute.mysql.dbflute.whitebox;

import com.example.dbflute.mysql.dbflute.cbean.MemberCB;
import com.example.dbflute.mysql.dbflute.exbhv.MemberBhv;
import com.example.dbflute.mysql.dbflute.exentity.Member;
import com.example.dbflute.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.9.3F (2012/04/05 Thursday)
 */
public class WxIdentityMySQLTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private MemberBhv memberBhv;

    // ===================================================================================
    //                                                                               Basic
    //                                                                               =====
    public void test_identity_after_insertbasic() {
        // ## Arrange ##
        Member member = new Member();
        member.setMemberName("foo");
        member.setMemberAccount("bar");
        member.setMemberStatusCode_Formalized();
        assertNull(member.getMemberId());

        // ## Act ##
        memberBhv.insert(member);

        // ## Assert ##
        assertNotNull(member.getMemberId());
        MemberCB cb = new MemberCB();
        cb.query().addOrderBy_MemberId_Desc();
        cb.fetchFirst(1);
        Member max = memberBhv.selectEntityWithDeletedCheck(cb);
        assertEquals(max.getMemberId(), member.getMemberId());
    }
}
