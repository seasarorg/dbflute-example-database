package com.example.dbflute.mysql.dbflute.whitebox;

import org.seasar.dbflute.exception.SQLFailureException;

import com.example.dbflute.mysql.dbflute.cbean.MemberCB;
import com.example.dbflute.mysql.dbflute.exbhv.MemberBhv;
import com.example.dbflute.mysql.dbflute.exentity.Member;
import com.example.dbflute.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.5 (2009/04/30 Thursday)
 */
public class WxExceptionAdviceMySQLTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private MemberBhv memberBhv;

    // ===================================================================================
    //                                                                     NotNull Setting
    //                                                                     ===============
    public void test_advice_NotNull_nullInsert() {
        // ## Arrange ##
        Member member = new Member();

        // ## Act ##
        try {
            memberBhv.insert(member);

            // ## Assert ##
            fail();
        } catch (SQLFailureException e) {
            // OK
            log(ln() + e.getMessage());
            assertTrue(e.getMessage().contains("*And also check "));
        }
    }

    public void test_advice_NotNull_nullUpdate() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.fetchFirst(1);
        Member member = memberBhv.selectEntityWithDeletedCheck(cb);
        member.setMemberName(null);

        // ## Act ##
        try {
            memberBhv.updateNonstrict(member);

            // ## Assert ##
            fail();
        } catch (SQLFailureException e) {
            // OK
            log(ln() + e.getMessage());
            assertTrue(e.getMessage().contains("*And also check "));
        }
    }
}
