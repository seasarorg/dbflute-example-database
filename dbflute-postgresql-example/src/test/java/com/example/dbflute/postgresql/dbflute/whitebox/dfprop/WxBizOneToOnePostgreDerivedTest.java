package com.example.dbflute.postgresql.dbflute.whitebox.dfprop;

import java.util.List;

import org.seasar.dbflute.bhv.ConditionBeanSetupper;
import org.seasar.dbflute.cbean.ListResultBean;

import com.example.dbflute.postgresql.dbflute.cbean.MemberCB;
import com.example.dbflute.postgresql.dbflute.cbean.MemberLoginCB;
import com.example.dbflute.postgresql.dbflute.exbhv.MemberBhv;
import com.example.dbflute.postgresql.dbflute.exentity.Member;
import com.example.dbflute.postgresql.dbflute.exentity.MemberLogin;
import com.example.dbflute.postgresql.unit.UnitContainerTestCase;

/**
 * @author jflute
 */
public class WxBizOneToOnePostgreDerivedTest extends UnitContainerTestCase {

    private MemberBhv memberBhv;

    // ===================================================================================
    //                                                                  Basic (InlineView)
    //                                                                  ==================
    public void test_DerivedOneToOne_basic() throws Exception {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.setupSelect_MemberLoginAsLatest();

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(memberList);
        memberBhv.loadMemberLoginList(memberList, new ConditionBeanSetupper<MemberLoginCB>() {
            public void setup(MemberLoginCB cb) {
                cb.query().addOrderBy_LoginDatetime_Desc();
            }
        });
        StringBuilder sb = new StringBuilder();
        boolean existsNull = false;
        for (Member member : memberList) {
            MemberLogin actualLogin = member.getMemberLoginAsLatest();
            if (actualLogin == null) {
                existsNull = true;
            }
            List<MemberLogin> loginList = member.getMemberLoginList();
            MemberLogin expectedLogin = !loginList.isEmpty() ? loginList.get(0) : null;
            assertEquals(expectedLogin, actualLogin);
            sb.append(ln());
            sb.append(" ").append(member.getMemberName());
            sb.append(", ").append(actualLogin);
        }
        log(sb.toString());
        assertTrue(existsNull);
    }
}