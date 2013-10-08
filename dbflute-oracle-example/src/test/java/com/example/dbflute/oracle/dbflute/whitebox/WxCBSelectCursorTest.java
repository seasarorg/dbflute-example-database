package com.example.dbflute.oracle.dbflute.whitebox;

import java.util.ArrayList;
import java.util.List;

import org.seasar.dbflute.bhv.core.ContextStack;
import org.seasar.dbflute.cbean.ConditionBeanContext;
import org.seasar.dbflute.cbean.EntityRowHandler;
import org.seasar.dbflute.outsidesql.OutsideSqlContext;

import com.example.dbflute.oracle.dbflute.cbean.MemberCB;
import com.example.dbflute.oracle.dbflute.cbean.MemberStatusCB;
import com.example.dbflute.oracle.dbflute.exbhv.MemberBhv;
import com.example.dbflute.oracle.dbflute.exbhv.MemberStatusBhv;
import com.example.dbflute.oracle.dbflute.exentity.Member;
import com.example.dbflute.oracle.dbflute.exentity.MemberStatus;
import com.example.dbflute.oracle.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.6.5 (2010/02/05 Friday)
 */
public class WxCBSelectCursorTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private MemberBhv memberBhv;
    private MemberStatusBhv memberStatusBhv;

    // ===================================================================================
    //                                                                    Insert in Cursor
    //                                                                    ================
    public void test_insert_in_selectCursor_of_conditionBean_sameTable() throws Exception {
        // ## Arrange ##
        final List<Long> memberIdList = new ArrayList<Long>();
        MemberCB cb = new MemberCB();

        // ## Act ##
        memberBhv.selectCursor(cb, new EntityRowHandler<Member>() {
            int count = 0;

            public void handle(Member entity) {
                if (count == 0) {
                    assertFalse(ContextStack.isExistContextStackOnThread());
                } else {
                    assertTrue(ContextStack.isExistContextStackOnThread());
                    assertTrue(ContextStack.getContextStackOnThread().isEmpty());
                }
                assertTrue(ConditionBeanContext.isExistConditionBeanOnThread());
                String memberName = entity.getMemberName();
                Member member = new Member();
                member.setMemberName(memberName + count);
                member.setMemberAccount(memberName + count);
                member.setMemberStatusCode_Formalized();
                memberBhv.insert(member);
                memberIdList.add(member.getMemberId());
                assertTrue(ConditionBeanContext.isExistConditionBeanOnThread());
                ++count;
            }
        });

        // ## Assert ##
        assertFalse(ContextStack.isExistContextStackOnThread());
        assertFalse(ConditionBeanContext.isExistConditionBeanOnThread());
        assertFalse(OutsideSqlContext.isExistOutsideSqlContextOnThread());
        cb.query().setMemberId_InScope(memberIdList);
        assertNotSame(0, memberBhv.selectCount(cb));
    }

    public void test_insert_in_selectCursor_of_conditionBean_diffTable() throws Exception {
        // ## Arrange ##
        final List<String> codeList = new ArrayList<String>();
        MemberCB cb = new MemberCB();

        // ## Act ##
        memberBhv.selectCursor(cb, new EntityRowHandler<Member>() {
            int count = 0;

            public void handle(Member entity) {
                if (count == 0) {
                    assertFalse(ContextStack.isExistContextStackOnThread());
                } else {
                    assertTrue(ContextStack.isExistContextStackOnThread());
                    assertTrue(ContextStack.getContextStackOnThread().isEmpty());
                }
                assertTrue(ConditionBeanContext.isExistConditionBeanOnThread());
                String memberName = entity.getMemberName();
                MemberStatus memberStatus = new MemberStatus();
                String memberStatusCode;
                if (count >= 100) {
                    memberStatusCode = String.valueOf(count);
                } else if (count >= 10) {
                    memberStatusCode = "0" + count;
                } else {
                    memberStatusCode = "00" + count;
                }
                memberStatus.setMemberStatusCode(memberStatusCode);
                memberStatus.setMemberStatusName(memberName + count);
                memberStatus.setDescription("foo");
                memberStatus.setDisplayOrder(99999L + count);
                memberStatusBhv.insert(memberStatus);
                codeList.add(memberStatus.getMemberStatusCode());
                assertTrue(ConditionBeanContext.isExistConditionBeanOnThread());
                ++count;
            }
        });

        // ## Assert ##
        assertFalse(ContextStack.isExistContextStackOnThread());
        assertFalse(ConditionBeanContext.isExistConditionBeanOnThread());
        assertFalse(OutsideSqlContext.isExistOutsideSqlContextOnThread());
        MemberStatusCB statusCB = new MemberStatusCB();
        statusCB.query().setMemberStatusCode_InScope(codeList);
        assertNotSame(0, memberStatusBhv.selectCount(statusCB));
    }
}
