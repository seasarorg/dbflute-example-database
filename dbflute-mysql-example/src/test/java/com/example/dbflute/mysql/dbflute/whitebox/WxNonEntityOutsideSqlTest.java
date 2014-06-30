package com.example.dbflute.mysql.dbflute.whitebox;

import org.seasar.dbflute.cbean.ListResultBean;

import com.example.dbflute.mysql.dbflute.exbhv.MemberBhv;
import com.example.dbflute.mysql.dbflute.exbhv.pmbean.NonEntitySql2EntityPmb;
import com.example.dbflute.mysql.dbflute.exbhv.pmbean.SimpleMemberPmb;
import com.example.dbflute.mysql.dbflute.exentity.customize.NonEntitySql2Entity;
import com.example.dbflute.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 1.0.5J (2014/06/30 Monday)
 */
public class WxNonEntityOutsideSqlTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private MemberBhv memberBhv;

    // ===================================================================================
    //                                                                       Behavior Name
    //                                                                       =============
    public void test_NonEntity_behaviorName() {
        // ## Arrange ##
        SimpleMemberPmb pmb = new SimpleMemberPmb();
        pmb.setMemberName_PrefixSearch("S");
        Class<NonEntitySimpleMember> entityType = NonEntitySimpleMember.class;

        // ## Act ##
        ListResultBean<NonEntitySimpleMember> memberList = memberBhv.outsideSql().selectList(
                "sqlblack/MemberBhv_selectBlackWay.sql", pmb, entityType);

        // ## Assert ##
        assertHasAnyElement(memberList);
        for (NonEntitySimpleMember member : memberList) {
            log(member.getMemberName());
        }
    }

    // ===================================================================================
    //                                                                       FreeName Name
    //                                                                       =============
    public void test_NonEntity_simple() {
        // ## Arrange ##
        SimpleMemberPmb pmb = new SimpleMemberPmb();
        pmb.setMemberName_PrefixSearch("S");
        Class<NonEntitySimpleMember> entityType = NonEntitySimpleMember.class;

        // ## Act ##
        ListResultBean<NonEntitySimpleMember> memberList = memberBhv.outsideSql().selectList(
                "sqlblack/NonEntitySimple.sql", pmb, entityType);

        // ## Assert ##
        assertHasAnyElement(memberList);
        for (NonEntitySimpleMember member : memberList) {
            log(member.getMemberName());
        }
    }

    public void test_NonEntity_sql2entity() {
        // ## Arrange ##
        NonEntitySql2EntityPmb pmb = new NonEntitySql2EntityPmb();
        pmb.setMemberName("S%");
        Class<NonEntitySql2Entity> entityType = NonEntitySql2Entity.class;

        // ## Act ##
        ListResultBean<NonEntitySql2Entity> memberList = memberBhv.outsideSql().selectList(
                "sqlblack/NonEntitySimple.sql", pmb, entityType);

        // ## Assert ##
        assertHasAnyElement(memberList);
        for (NonEntitySql2Entity member : memberList) {
            log(member.getMemberName());
        }
    }

    public static class NonEntitySimpleMember {
        protected Integer memberId;
        protected String memberName;

        public Integer getMemberId() {
            return memberId;
        }

        public void setMemberId(Integer memberId) {
            this.memberId = memberId;
        }

        public String getMemberName() {
            return memberName;
        }

        public void setMemberName(String memberName) {
            this.memberName = memberName;
        }
    }
}
