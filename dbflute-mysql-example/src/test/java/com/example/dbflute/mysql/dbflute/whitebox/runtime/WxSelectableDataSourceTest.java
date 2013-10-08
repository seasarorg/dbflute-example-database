package com.example.dbflute.mysql.dbflute.whitebox.runtime;

import java.util.List;

import org.dbflute.saflute.db.replication.SlaveDBAccessor;
import org.dbflute.saflute.db.replication.SlaveDBCallback;

import com.example.dbflute.mysql.dbflute.cbean.MemberCB;
import com.example.dbflute.mysql.dbflute.exbhv.MemberBhv;
import com.example.dbflute.mysql.dbflute.exentity.Member;
import com.example.dbflute.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 */
public class WxSelectableDataSourceTest extends UnitContainerTestCase {

    protected MemberBhv memberBhv;
    protected SlaveDBAccessor slaveDBAccessor;

    public void test_accessFixedly_select_Tx() {
        // ## Arrange ##
        final MemberCB cb = new MemberCB();
        cb.query().setMemberName_PrefixSearch("S");

        // ## Act ##
        List<Member> memberList = slaveDBAccessor.accessFixedly(new SlaveDBCallback<List<Member>>() {
            public List<Member> callback() {
                return memberBhv.selectList(cb);
            }
        });

        // ## Assert ##
        assertFalse(memberList.isEmpty());
        for (Member member : memberList) {
            log(member);
            assertTrue(member.getMemberName().startsWith("S"));
        }
    }

    public void test_accessFixedly_update_Tx() {
        // ## Arrange ##
        final Member member = new Member();
        member.setMemberId(3);
        member.setMemberName("accessFixedly");

        // ## Act ##
        slaveDBAccessor.accessFixedly(new SlaveDBCallback<Void>() {
            public Void callback() {
                memberBhv.updateNonstrict(member);
                return null;
            }
        });

        // ## Assert ##
        Member actual = memberBhv.selectByPKValueWithDeletedCheck(3);
        assertEquals("accessFixedly", actual.getMemberName());
    }
}
