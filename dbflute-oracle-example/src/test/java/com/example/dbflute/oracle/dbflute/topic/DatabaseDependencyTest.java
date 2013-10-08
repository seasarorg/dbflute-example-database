package com.example.dbflute.oracle.dbflute.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.seasar.dbflute.dbmeta.info.ColumnInfo;
import org.seasar.dbflute.exception.SQLFailureException;

import com.example.dbflute.oracle.dbflute.bsentity.dbmeta.MemberDbm;
import com.example.dbflute.oracle.dbflute.bsentity.dbmeta.PurchaseDbm;
import com.example.dbflute.oracle.dbflute.cbean.MemberCB;
import com.example.dbflute.oracle.dbflute.exbhv.MemberBhv;
import com.example.dbflute.oracle.dbflute.exentity.Member;
import com.example.dbflute.oracle.unit.UnitContainerTestCase;

/**
 * The test of the property 'isAvailableDatabaseDependency' in 'littleAdjustmentMap.dfprop'.
 * @author jflute
 * @since 0.9.5 (2009/04/31 Friday)
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
        cb.query().setMemberId_Equal(1L);
        cb.lockForUpdateNoWait();

        // ## Act ##
        final Member member = memberBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        assertNotNull(member);
        assertTrue(cb.toDisplaySql().contains(" for update"));
        assertTrue(cb.toDisplaySql().contains(" nowait"));
    }

    public void test_ConditionBean_lockForUpdateWait() throws Exception {
        // ## Arrange ##
        final MemberCB cb = new MemberCB();
        cb.query().setMemberId_Equal(1L);
        cb.lockForUpdateWait(3);

        // ## Act ##
        final Member member = memberBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        assertNotNull(member);
        assertTrue(cb.toDisplaySql().contains(" for update"));
        assertTrue(cb.toDisplaySql().contains(" wait 3"));
    }

    // ===================================================================================
    //                                                                    Full-Text Search
    //                                                                    ================
    public void test_match_basic_singleColumn() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        MemberDbm dbm = MemberDbm.getInstance();

        // ## Act ##
        cb.query().match(dbm.columnMemberName(), "foo");

        // ## Assert ##
        String sql = cb.toDisplaySql();
        log(sql);
        assertTrue(sql.contains("contains("));
        assertTrue(sql.contains(MemberDbm.getInstance().columnMemberName().getColumnDbName() + ", "));
        assertTrue(sql.contains("{foo}"));

        try {
            memberBhv.selectList(cb);
            fail();
        } catch (SQLFailureException e) {
            // OK
            log(e.getMessage());
            assertTrue(e.getMessage().contains("ORA-20000: Oracle Text error"));
        }
    }

    public void test_match_duplicateColumn_containsEndBrace() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        MemberDbm dbm = MemberDbm.getInstance();

        // ## Act ##
        cb.query().match(Arrays.asList(dbm.columnMemberName(), dbm.columnMemberAccount()), "f{o}o");

        // ## Assert ##
        String sql = cb.toDisplaySql();
        log(sql);
        assertTrue(sql.contains("contains("));
        assertTrue(sql.contains(MemberDbm.getInstance().columnMemberName().getColumnDbName() + ", "));
        assertTrue(sql.contains(" or "));
        assertTrue(sql.contains(MemberDbm.getInstance().columnMemberAccount().getColumnDbName() + ", "));
        assertTrue(sql.contains("{f{o}}o}"));

        try {
            memberBhv.selectList(cb);
            fail();
        } catch (SQLFailureException e) {
            // OK
            log(e.getMessage());
            assertTrue(e.getMessage().contains("ORA-20000: Oracle Text error"));
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
    
    public void test_match_notTargetTableColumn() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        MemberDbm dbm = MemberDbm.getInstance();
        List<ColumnInfo> textColumnList = new ArrayList<ColumnInfo>();
        textColumnList.add(dbm.columnMemberName());
        textColumnList.add(dbm.columnBirthdate());
        textColumnList.add(PurchaseDbm.getInstance().columnRegisterUser());
        
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
