package com.example.dbflute.mysql.dbflute.whitebox.dfprop;

import org.seasar.dbflute.exception.EntityAlreadyExistsException;

import com.example.dbflute.mysql.dbflute.exbhv.MemberBhv;
import com.example.dbflute.mysql.dbflute.exentity.Member;
import com.example.dbflute.mysql.dbflute.nogen.ExtendedInvokerAssistant;
import com.example.dbflute.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 */
public class WxInvokerAssistantExtensionTest extends UnitContainerTestCase {

    private MemberBhv memberBhv;

    public void test_exceptionMessage_normalEnvironment() {
        // ## Arrange ##
        Member member = new Member();
        member.setMemberName("testName");
        member.setMemberAccount("testAccount");
        member.setMemberStatusCode_Formalized();

        // ## Act ##
        memberBhv.insert(member);
        try {
            memberBhv.insert(member);
            fail();
        } catch (EntityAlreadyExistsException e) {
            log(e.getMessage());

            // ## Assert ##
            assertFalse(e.getMessage().contains("Executed SQL"));
            assertFalse(e.getMessage().contains("*NOT use displaySql for security"));
            assertTrue(e.getMessage().contains("Display SQL"));
            assertTrue(e.getMessage().contains("testName"));
        }
    }

    public void test_exceptionMessage_realEnvironment() {
        // ## Arrange ##
        Member member = new Member();
        member.setMemberName("testName");
        member.setMemberAccount("testAccount");
        member.setMemberStatusCode_Formalized();

        // ## Act ##
        memberBhv.insert(member);
        try {
            ExtendedInvokerAssistant.setRealEnvironment(true);
            memberBhv.insert(member);
            fail();
        } catch (EntityAlreadyExistsException e) {
            log(e.getMessage());

            // ## Assert ##
            assertTrue(e.getMessage().contains("Executed SQL"));
            assertTrue(e.getMessage().contains("*NOT use displaySql for security"));
            assertFalse(e.getMessage().contains("Display SQL"));
            assertFalse(e.getMessage().contains("testName"));
        } finally {
            ExtendedInvokerAssistant.setRealEnvironment(false);
        }
    }
}
