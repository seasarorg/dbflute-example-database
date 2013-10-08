package com.example.dbflute.mysql.dbflute.whitebox.dfprop;

import org.seasar.dbflute.cbean.ListResultBean;

import com.example.dbflute.mysql.dbflute.allcommon.CDef;
import com.example.dbflute.mysql.dbflute.cbean.MemberLoginCB;
import com.example.dbflute.mysql.dbflute.exbhv.MemberLoginBhv;
import com.example.dbflute.mysql.dbflute.exentity.MemberLogin;
import com.example.dbflute.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.9.7A (2012/07/21 Saturday)
 */
public class WxGroupingMapClassificationTest extends UnitContainerTestCase {

    private MemberLoginBhv memberLoginBhv;

    // ===================================================================================
    //                                                                              Entity
    //                                                                              ======
    public void test_groupingMap_entity_basic() throws Exception {
        // ## Arrange ##
        MemberLogin login = new MemberLogin();
        login.setLoginMemberStatusCode_正式会員();

        // ## Act & Assert ##
        assertTrue(login.isLoginMemberStatusCode_ServiceAvailable());
        login.setLoginMemberStatusCode_仮会員();
        assertTrue(login.isLoginMemberStatusCode_ServiceAvailable());
        login.setLoginMemberStatusCode_退会会員();
        assertFalse(login.isLoginMemberStatusCode_ServiceAvailable());
    }

    // ===================================================================================
    //                                                                       ConditionBean
    //                                                                       =============
    public void test_groupingMap_conditionBean_basic_ServiceAvailable() throws Exception {
        // ## Arrange ##
        prepareWithdrawalMemberLogin();
        MemberLoginCB cb = new MemberLoginCB();
        cb.query().setLoginMemberStatusCode_InScope_ServiceAvailable();

        // ## Act ##
        ListResultBean<MemberLogin> loginList = memberLoginBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(loginList);
        for (MemberLogin login : loginList) {
            log(login.getMemberLoginId() + ", " + login.getLoginMemberStatusCode());
            assertTrue(login.isLoginMemberStatusCode正式会員() || login.isLoginMemberStatusCode仮会員());
            assertTrue(login.isLoginMemberStatusCode_ServiceAvailable());
            assertFalse(login.isLoginMemberStatusCode_LastestStatus());
        }
    }

    public void test_groupingMap_conditionBean_basic_second_LastestStatus() throws Exception {
        // ## Arrange ##
        prepareWithdrawalMemberLogin();
        MemberLoginCB cb = new MemberLoginCB();
        cb.query().setLoginMemberStatusCode_InScope_LastestStatus();

        // ## Act ##
        ListResultBean<MemberLogin> loginList = memberLoginBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(loginList);
        for (MemberLogin login : loginList) {
            log(login.getMemberLoginId() + ", " + login.getLoginMemberStatusCode());
            assertTrue(login.isLoginMemberStatusCode退会会員());
            assertTrue(login.isLoginMemberStatusCode_LastestStatus());
            assertFalse(login.isLoginMemberStatusCode_ServiceAvailable());
        }
    }

    protected void prepareWithdrawalMemberLogin() {
        MemberLogin login = new MemberLogin();
        login.setLoginMemberStatusCode_退会会員();
        MemberLoginCB cb = new MemberLoginCB();
        cb.query().setMemberId_InScope(newArrayList(3, 7));
        cb.query().addOrderBy_LoginDatetime_Desc();
        memberLoginBhv.queryUpdate(login, cb);
    }

    // ===================================================================================
    //                                                                                CDef
    //                                                                                ====
    public void test_groupingMap_CDef_basic() throws Exception {
        assertTrue(CDef.SubItemTable.正式会員.isServiceAvailable());
        assertTrue(CDef.SubItemTable.仮会員.isServiceAvailable());
        assertFalse(CDef.SubItemTable.退会会員.isServiceAvailable());
    }
}
