package com.example.dbflute.mysql.dbflute.vendor;

import java.lang.reflect.Method;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.seasar.dbflute.exception.EntityAlreadyExistsException;
import org.seasar.dbflute.exception.SQLFailureException;
import org.seasar.dbflute.util.DfReflectionUtil;

import com.example.dbflute.mysql.dbflute.bsentity.dbmeta.MemberDbm;
import com.example.dbflute.mysql.dbflute.cbean.MemberCB;
import com.example.dbflute.mysql.dbflute.exbhv.MemberBhv;
import com.example.dbflute.mysql.dbflute.exentity.Member;
import com.example.dbflute.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.7.7 (2008/07/23 Wednesday)
 */
public class VendorConstraintTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    private static final String MY_SQLSTATE = "23000";
    private static final int MY_ERRORCODE = 1062;
    private static final String MY_NOTNULL_SQLSTATE = "HY000";
    private static final int MY_NOTNULL_ERRORCODE = 1364;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private MemberBhv memberBhv;
    private final int memberIdTwo = 2;
    private final int memberIdThree = 3;

    // ===================================================================================
    //                                                                   Unique Constraint
    //                                                                   =================
    // -----------------------------------------------------
    //                                                Insert
    //                                                ------
    public void test_insert_unique_constraint_OriginalException() {
        // ## Arrange ##
        Member member = new Member();
        member.setMemberName("testName");
        member.setMemberAccount("testAccount");
        member.setMemberStatusCode_Formalized(); // 正式会員

        // ## Act & Assert ##
        memberBhv.insert(member);
        try {
            memberBhv.insert(member);
            fail();
        } catch (EntityAlreadyExistsException e) {
            SQLException cause = e.getSQLException();
            log(e.getMessage());
            log("/* * * * * * * * * * * * * * * * *");
            log("SQLState=" + cause.getSQLState() + ", ErrorCode=" + cause.getErrorCode());
            log("* * * * * * * * * */");
            assertEquals(MY_SQLSTATE, cause.getSQLState());
            assertEquals(MY_ERRORCODE, cause.getErrorCode());
        }
    }

    public void test_batchInsert_unique_constraint_OriginalException() {
        // ## Arrange ##
        List<Member> memberList = new ArrayList<Member>();
        {
            Member member = new Member();
            member.setMemberName("testName1");
            member.setMemberAccount("testAccount1");
            member.setMemberStatusCode_Formalized(); // 正式会員
            memberList.add(member);
        }
        {
            Member member = new Member();
            member.setMemberName("testName2");
            member.setMemberAccount("testAccount2");
            member.setMemberStatusCode_Formalized(); // 正式会員
            memberList.add(member);
        }

        // ## Act & Assert ##
        memberBhv.batchInsert(memberList);
        try {
            memberBhv.batchInsert(memberList);
            fail();
        } catch (EntityAlreadyExistsException e) {
            SQLException cause = e.getSQLException();
            log(e.getMessage());
            log("/* * * * * * * * * * * * * * * * *");
            log("SQLState=" + cause.getSQLState() + ", ErrorCode=" + cause.getErrorCode());
            log("* * * * * * * * * */");
            assertEquals(MY_SQLSTATE, cause.getSQLState());
            assertEquals(MY_ERRORCODE, cause.getErrorCode());
        }
    }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    public void test_update_unique_constraint_OriginalException() {
        // ## Arrange ##
        Member member = memberBhv.selectByPKValueWithDeletedCheck(memberIdThree);
        member.setMemberAccount("Pixy");

        // ## Act & Assert ##
        try {
            memberBhv.update(member);
            fail();
        } catch (EntityAlreadyExistsException e) {
            SQLException cause = e.getSQLException();
            log(e.getMessage());
            log("/* * * * * * * * * * * * * * * * *");
            log("SQLState=" + cause.getSQLState() + ", ErrorCode=" + cause.getErrorCode());
            log("* * * * * * * * * */");
            assertEquals(MY_SQLSTATE, cause.getSQLState());
            assertEquals(MY_ERRORCODE, cause.getErrorCode());
        }
    }

    public void test_updateNonstrict_unique_constraint_OriginalException() {
        // ## Arrange ##
        Member member = new Member();
        member.setMemberId(memberIdThree);
        member.setMemberAccount("Pixy");

        // ## Act & Assert ##
        try {
            memberBhv.updateNonstrict(member);
            fail();
        } catch (EntityAlreadyExistsException e) {
            SQLException cause = e.getSQLException();
            log(e.getMessage());
            log("/* * * * * * * * * * * * * * * * *");
            log("SQLState=" + cause.getSQLState() + ", ErrorCode=" + cause.getErrorCode());
            log("* * * * * * * * * */");
            assertEquals(MY_SQLSTATE, cause.getSQLState());
            assertEquals(MY_ERRORCODE, cause.getErrorCode());
        }
    }

    public void test_queryUpdate_unique_constraint_OriginalException() {
        // ## Arrange ##
        Member member = new Member();
        member.setMemberAccount("Pixy");

        MemberCB cb = new MemberCB();
        cb.query().setMemberName_PrefixSearch("S");

        // ## Act & Assert ##
        try {
            memberBhv.queryUpdate(member, cb);
            fail();
        } catch (EntityAlreadyExistsException e) {
            SQLException cause = e.getSQLException();
            log(e.getMessage());
            log("/* * * * * * * * * * * * * * * * *");
            log("SQLState=" + cause.getSQLState() + ", ErrorCode=" + cause.getErrorCode());
            log("* * * * * * * * * */");
            assertEquals(MY_SQLSTATE, cause.getSQLState());
            assertEquals(MY_ERRORCODE, cause.getErrorCode());
        }
    }

    public void test_batchUpdate_unique_constraint_OriginalException() {
        // ## Arrange ##
        List<Member> memberList = new ArrayList<Member>();
        {
            Member member = memberBhv.selectByPKValueWithDeletedCheck(memberIdTwo);
            member.setMemberAccount("AAA");
            memberList.add(member);
        }
        {
            Member member = memberBhv.selectByPKValueWithDeletedCheck(memberIdThree);
            member.setMemberAccount("Pixy");
            memberList.add(member);
        }

        // ## Act & Assert ##
        try {
            memberBhv.batchUpdate(memberList);
            fail();
        } catch (EntityAlreadyExistsException e) {
            SQLException cause = e.getSQLException();
            log(e.getMessage());
            log("/* * * * * * * * * * * * * * * * *");
            log("SQLState=" + cause.getSQLState() + ", ErrorCode=" + cause.getErrorCode());
            log("* * * * * * * * * */");
            assertEquals(MY_SQLSTATE, cause.getSQLState());
            assertEquals(MY_ERRORCODE, cause.getErrorCode());
        }
    }

    public void test_batchUpdateNonstrict_unique_constraint_OriginalException() {
        // ## Arrange ##
        List<Member> memberList = new ArrayList<Member>();
        {
            Member member = memberBhv.selectByPKValueWithDeletedCheck(memberIdTwo);
            member.setMemberAccount("AAA");
            memberList.add(member);
        }
        {
            Member member = memberBhv.selectByPKValueWithDeletedCheck(memberIdThree);
            member.setMemberAccount("Pixy");
            memberList.add(member);
        }

        // ## Act & Assert ##
        try {
            memberBhv.batchUpdateNonstrict(memberList);
            fail();
        } catch (EntityAlreadyExistsException e) {
            SQLException cause = e.getSQLException();
            log(e.getMessage());
            log("/* * * * * * * * * * * * * * * * *");
            log("SQLState=" + cause.getSQLState() + ", ErrorCode=" + cause.getErrorCode());
            log("* * * * * * * * * */");
            assertEquals(MY_SQLSTATE, cause.getSQLState());
            assertEquals(MY_ERRORCODE, cause.getErrorCode());
        }
    }

    // -----------------------------------------------------
    //                                               NotNull
    //                                               -------
    public void test_insert_notnull_constraint_OriginalException() {
        // ## Arrange ##
        Member member = new Member();
        member.setMemberName("testName");
        member.setMemberAccount("testAccount");

        // ## Act & Assert ##
        try {
            memberBhv.insert(member);
            fail();
        } catch (SQLFailureException e) {
            SQLException cause = e.getSQLException();
            log(e.getMessage());
            log("/* * * * * * * * * * * * * * * * *");
            log("SQLState=" + cause.getSQLState() + ", ErrorCode=" + cause.getErrorCode());
            log("* * * * * * * * * */");
            assertEquals(MY_NOTNULL_SQLSTATE, cause.getSQLState());
            assertEquals(MY_NOTNULL_ERRORCODE, cause.getErrorCode());
        }
    }

    // -----------------------------------------------------
    //                                           Foreign Key
    //                                           -----------
    public void test_insert_foreign_constraint_OriginalException() {
        // ## Arrange ##
        Member member = new Member();
        member.setMemberName("testName");
        member.setMemberAccount("testAccount");
        Method writeMethod = MemberDbm.getInstance().columnMemberStatusCode().getWriteMethod();
        DfReflectionUtil.invokeForcedly(writeMethod, member, new Object[] { "NO_EXIST" });
        assertEquals("NO_EXIST", member.getMemberStatusCode());

        // ## Act & Assert ##
        try {
            memberBhv.insert(member);
            fail();
        } catch (SQLFailureException e) {
            SQLException cause = e.getSQLException();
            log(e.getMessage());
            log("/* * * * * * * * * * * * * * * * *");
            log("SQLState=" + cause.getSQLState() + ", ErrorCode=" + cause.getErrorCode());
            log("* * * * * * * * * */");
        }
    }
}
