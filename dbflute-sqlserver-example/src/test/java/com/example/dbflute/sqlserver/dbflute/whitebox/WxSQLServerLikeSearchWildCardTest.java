package com.example.dbflute.sqlserver.dbflute.whitebox;

import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.dbflute.cbean.coption.LikeSearchOption;
import org.seasar.dbflute.util.Srl;

import com.example.dbflute.sqlserver.dbflute.cbean.MemberCB;
import com.example.dbflute.sqlserver.dbflute.exbhv.MemberBhv;
import com.example.dbflute.sqlserver.dbflute.exentity.Member;
import com.example.dbflute.sqlserver.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.8.4 (2011/05/30 Monday)
 */
public class WxSQLServerLikeSearchWildCardTest extends UnitContainerTestCase {

    private MemberBhv memberBhv;

    // ===================================================================================
    //                                                                  Regular Expression
    //                                                                  ==================
    public void test_LikeSearch_RegularExpression_basic_Tx() throws Exception {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.query().setMemberName_LikeSearch("%[sv]%", new LikeSearchOption());

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertFalse(memberList.isEmpty());
        for (Member actual : memberList) {
            String memberName = actual.getMemberName();
            log(memberName);
            assertTrue(Srl.containsAnyIgnoreCase(memberName, "s", "v"));
        }
    }

    public void test_LikeSearch_RegularExpression_escape_basic_Tx() throws Exception {
        // ## Arrange ##
        Member member = new Member();
        member.setMemberId(3);
        member.setMemberName("Stojko[v]ic");
        memberBhv.updateNonstrict(member);

        MemberCB cb = new MemberCB();
        cb.query().setMemberName_LikeSearch("[v]", new LikeSearchOption().likeContain());

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertFalse(memberList.isEmpty());
        for (Member actual : memberList) {
            String memberName = actual.getMemberName();
            log(memberName);
            assertTrue(Srl.containsIgnoreCase(memberName, "[v]"));
        }
    }

    public void test_LikeSearch_RegularExpression_escape_scope_Tx() throws Exception {
        // ## Arrange ##
        Member member = new Member();
        member.setMemberId(3);
        member.setMemberName("Stojko[^v]ic");
        memberBhv.updateNonstrict(member);
        
        MemberCB cb = new MemberCB();
        cb.query().setMemberName_LikeSearch("[^v]", new LikeSearchOption().likeContain());
        
        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);
        
        // ## Assert ##
        assertFalse(memberList.isEmpty());
        for (Member actual : memberList) {
            String memberName = actual.getMemberName();
            log(memberName);
            assertTrue(Srl.containsIgnoreCase(memberName, "[^v]"));
        }
    }

}