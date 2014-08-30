package com.example.dbflute.firebird.dbflute.whitebox.dfprop;

import java.util.ArrayList;
import java.util.List;

import org.seasar.dbflute.CallbackContext;
import org.seasar.dbflute.jdbc.SqlLogHandler;
import org.seasar.dbflute.jdbc.SqlLogInfo;
import org.seasar.dbflute.util.Srl;

import com.example.dbflute.firebird.dbflute.exbhv.MemberBhv;
import com.example.dbflute.firebird.dbflute.exentity.Member;
import com.example.dbflute.firebird.unit.AppContainerTestCase;

/**
 * @author jflute
 */
public class WxCompatibleEntityUpdateTest extends AppContainerTestCase {

    private MemberBhv memberBhv;

    // ===================================================================================
    //                                                                          After Care
    //                                                                          ==========
    @Override
    public void tearDown() throws Exception {
        super.tearDown();
        clearSqlLogHandler();
    }

    protected void clearSqlLogHandler() {
        CallbackContext.clearSqlLogHandlerOnThread();
        CallbackContext.clearSqlResultHandlerOnThread();
        assertFalse(CallbackContext.isExistCallbackContextOnThread());
        assertFalse(CallbackContext.isExistBehaviorCommandHookOnThread());
        assertFalse(CallbackContext.isExistSqlLogHandlerOnThread());
        assertFalse(CallbackContext.isExistSqlResultHandlerOnThread());
    }

    // ===================================================================================
    //                                                                        Basic Insert
    //                                                                        ============
    public void test_Insert_NotNullOnly() {
        // ## Arrange ##
        Member member = new Member();
        member.setMemberName("testName1");
        member.setMemberAccount("testAccount1");
        member.setMemberStatusCode_FormalizedMember();
        member.setBirthdate(null);
        final List<String> displaySqlList = new ArrayList<String>();
        CallbackContext.setSqlLogHandlerOnThread(new SqlLogHandler() {
            public void handle(SqlLogInfo info) {
                displaySqlList.add(info.getDisplaySql());
            }
        });

        // ## Act ##
        memberBhv.insert(member);

        // ## Assert ##
        String sql = displaySqlList.get(0);
        assertFalse(Srl.containsIgnoreCase(sql, "birthdate"));
    }
}
