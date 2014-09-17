package com.example.dbflute.mysql.dbflute.whitebox.dfprop;

import org.seasar.dbflute.cbean.ListResultBean;

import com.example.dbflute.mysql.dbflute.cbean.MemberCB;
import com.example.dbflute.mysql.dbflute.exbhv.MemberBhv;
import com.example.dbflute.mysql.dbflute.exentity.Member;
import com.example.dbflute.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 1.0.5L (2014/09/17 Wednesday)
 */
public class WxFixedConditionEmbeddedCommentClassificationTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private MemberBhv memberBhv;

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    public void test_VariantRelation_SetupSelect_basic() throws Exception {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.setupSelect_MemberLoginAsEmbeddedCommentClassificationTest();

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb); // expect no exception

        // ## Assert ##
        assertHasAnyElement(memberList);
        String sql = cb.toDisplaySql();
        assertContains(sql, "and dfrel_21.MOBILE_LOGIN_FLG = 1");
        assertContains(sql, "or dfrel_21.LOGIN_MEMBER_STATUS_CODE in ('FML', 'PRV')");
        assertContains(sql, "or dfrel_21.LOGIN_MEMBER_STATUS_CODE in ('WDL')");
    }
}
