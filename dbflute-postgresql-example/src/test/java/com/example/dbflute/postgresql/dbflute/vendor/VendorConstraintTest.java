package com.example.dbflute.postgresql.dbflute.vendor;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.seasar.dbflute.exception.EntityAlreadyExistsException;
import org.seasar.dbflute.exception.SQLFailureException;

import com.example.dbflute.postgresql.dbflute.bsentity.dbmeta.MemberDbm;
import com.example.dbflute.postgresql.dbflute.cbean.MemberCB;
import com.example.dbflute.postgresql.dbflute.exbhv.MemberBhv;
import com.example.dbflute.postgresql.dbflute.exentity.Member;
import com.example.dbflute.postgresql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.7.7 (2008/07/23 Wednesday)
 */
public class VendorConstraintTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    private static final String MY_SQLSTATE = "23505";
    private static final int MY_ERRORCODE = 0;
    private static final String MY_NOTNULL_SQLSTATE = "23502";
    private static final int MY_NOTNULL_ERRORCODE = 0;

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
            assertEquals(MY_SQLSTATE, extractSQLState(cause));
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
            log("SQLState=" + extractSQLState(cause) + ", ErrorCode=" + cause.getErrorCode());
            log("* * * * * * * * * */");
            assertEquals(MY_SQLSTATE, extractSQLState(cause));
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
            log("SQLState=" + extractSQLState(cause) + ", ErrorCode=" + cause.getErrorCode());
            log("* * * * * * * * * */");
            assertEquals(MY_SQLSTATE, extractSQLState(cause));
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

        // because it forces classification setting at this project
        MemberDbm.getInstance().columnMemberStatusCode().write(member, "NO_EXIST");

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

    protected String extractSQLState(SQLException e) {
        String sqlState = e.getSQLState();
        if (sqlState != null) {
            return sqlState;
        }

        // Next
        SQLException nextEx = e.getNextException();
        if (nextEx == null) {
            return null;
        }
        sqlState = nextEx.getSQLState();
        if (sqlState != null) {
            return sqlState;
        }

        // Next Next
        SQLException nextNextEx = nextEx.getNextException();
        if (nextNextEx == null) {
            return null;
        }
        sqlState = nextNextEx.getSQLState();
        if (sqlState != null) {
            return sqlState;
        }

        // Next Next Next
        SQLException nextNextNextEx = nextNextEx.getNextException();
        if (nextNextNextEx == null) {
            return null;
        }
        sqlState = nextNextNextEx.getSQLState();
        if (sqlState != null) {
            return sqlState;
        }

        // It doesn't use recursive call by design because JDBC is unpredictable fellow.
        return null;
    }
}
