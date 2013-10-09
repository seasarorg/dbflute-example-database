package com.example.dbflute.postgresql.dbflute.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.seasar.dbflute.dbmeta.info.ColumnInfo;
import org.seasar.dbflute.exception.SQLFailureException;

import com.example.dbflute.postgresql.dbflute.allcommon.DBFluteConfig;
import com.example.dbflute.postgresql.dbflute.bsentity.dbmeta.MemberDbm;
import com.example.dbflute.postgresql.dbflute.cbean.MemberCB;
import com.example.dbflute.postgresql.dbflute.exbhv.MemberBhv;
import com.example.dbflute.postgresql.dbflute.exentity.Member;
import com.example.dbflute.postgresql.unit.UnitContainerTestCase;

/**
 * The test of the property 'isAvailableDatabaseDependency' in 'littleAdjustmentMap.dfprop'.
 * @author jflute
 * @since 0.9.5 (2009/04/30 Thursday)
 */
public class DatabaseDependencyTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private MemberBhv memberBhv;

    // ===================================================================================
    //                                                                           Lock Wait
    //                                                                           =========
    public void test_ConditionBean_lockForUpdateNoWait() throws Exception {
        // ## Arrange ##
        final MemberCB cb = new MemberCB();
        cb.query().setMemberId_Equal(1);
        cb.lockForUpdateNoWait();

        // ## Act ##
        final Member member = memberBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        assertNotNull(member);
        assertTrue(cb.toDisplaySql().contains(" for update"));
        assertTrue(cb.toDisplaySql().contains(" nowait"));
    }

    // ===================================================================================
    //                                                                    Full-Text Search
    //                                                                    ================
    public void test_match_basic_singleColumn_nonModifier() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        MemberDbm dbm = MemberDbm.getInstance();

        // ## Act ##
        cb.query().match(dbm.columnMemberName(), "foo");

        // ## Assert ##
        String sql = cb.toDisplaySql();
        log(sql);
        assertTrue(sql.contains(MemberDbm.getInstance().columnMemberName().getColumnDbName() + " %% "));

        try {
            memberBhv.selectList(cb);
            fail();
        } catch (SQLFailureException e) {
            // OK
            log(e.getMessage());
            assertTrue(e.getMessage().contains("operator does not exist: character varying %% character varying"));
        }
    }

    public void test_match_duplicateColumn_inBooleanModeModifier() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        MemberDbm dbm = MemberDbm.getInstance();

        // ## Act ##
        cb.query().match(Arrays.asList(dbm.columnMemberName(), dbm.columnMemberAccount()), "foo");

        // ## Assert ##
        String sql = cb.toDisplaySql();
        log(sql);
        assertTrue(sql.contains(MemberDbm.getInstance().columnMemberName().getColumnDbName() + " %% "));
        assertTrue(sql.contains(" or "));
        assertTrue(sql.contains(MemberDbm.getInstance().columnMemberAccount().getColumnDbName() + " %% "));

        try {
            memberBhv.selectList(cb);
            fail();
        } catch (SQLFailureException e) {
            // OK
            log(e.getMessage());
            assertTrue(e.getMessage().contains("operator does not exist: character varying %% character varying"));
        }
    }

    public void test_match_old_basic_singleColumn_nonModifier() {
        // ## Arrange ##
        DBFluteConfig.getInstance().unlock();
        DBFluteConfig.getInstance().useOldFullTextSearchOperand();
        try {
            MemberCB cb = new MemberCB();
            MemberDbm dbm = MemberDbm.getInstance();

            // ## Act ##
            cb.query().match(dbm.columnMemberName(), "foo");

            // ## Assert ##
            String sql = cb.toDisplaySql();
            log(sql);
            assertTrue(sql.contains(MemberDbm.getInstance().columnMemberName().getColumnDbName() + " @@ "));

            //try {
            memberBhv.selectList(cb);
            //    fail();
            //} catch (SQLFailureException e) {
            //    // OK
            //    log(e.getMessage());
            //    assertTrue(e.getMessage().contains("The used table type doesn't support FULLTEXT indexes"));
            //}
        } finally {
            DBFluteConfig.getInstance().useDefaultFullTextSearchOperand();
            DBFluteConfig.getInstance().lock();
        }
    }

    public void test_match_old_duplicateColumn_inBooleanModeModifier() {
        // ## Arrange ##
        DBFluteConfig.getInstance().unlock();
        DBFluteConfig.getInstance().useOldFullTextSearchOperand();
        try {
            MemberCB cb = new MemberCB();
            MemberDbm dbm = MemberDbm.getInstance();

            // ## Act ##
            cb.query().match(Arrays.asList(dbm.columnMemberName(), dbm.columnMemberAccount()), "foo");

            // ## Assert ##
            String sql = cb.toDisplaySql();
            log(sql);
            assertTrue(sql.contains(MemberDbm.getInstance().columnMemberName().getColumnDbName() + " @@ "));
            assertTrue(sql.contains(" or "));
            assertTrue(sql.contains(MemberDbm.getInstance().columnMemberAccount().getColumnDbName() + " @@ "));

            //try {
            memberBhv.selectList(cb);
            //    fail();
            //} catch (SQLFailureException e) {
            //    // OK
            //    log(e.getMessage());
            //    assertTrue(e.getMessage().contains("The used table type doesn't support FULLTEXT indexes"));
            //}
        } finally {
            DBFluteConfig.getInstance().useDefaultFullTextSearchOperand();
            DBFluteConfig.getInstance().lock();
        }
    }

    public void test_match_notStringColumn() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        MemberDbm dbm = MemberDbm.getInstance();
        List<ColumnInfo> textColumnList = new ArrayList<ColumnInfo>();
        textColumnList.add(dbm.columnMemberName());
        textColumnList.add(dbm.columnBirthdate());

        // ## Act ##
        try {
            cb.query().match(textColumnList, "foo");
            // ## Assert ##
            fail();
        } catch (IllegalArgumentException e) {
            // OK
            log(e.getMessage());
        }
    }
}
