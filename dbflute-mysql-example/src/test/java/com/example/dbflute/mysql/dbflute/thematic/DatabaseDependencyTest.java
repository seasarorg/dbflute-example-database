package com.example.dbflute.mysql.dbflute.thematic;

import java.util.ArrayList;
import java.util.List;

import org.seasar.dbflute.dbmeta.info.ColumnInfo;
import org.seasar.dbflute.dbway.WayOfMySQL;
import org.seasar.dbflute.exception.SQLFailureException;

import com.example.dbflute.mysql.dbflute.bsentity.dbmeta.MemberDbm;
import com.example.dbflute.mysql.dbflute.cbean.MemberCB;
import com.example.dbflute.mysql.dbflute.exbhv.MemberBhv;
import com.example.dbflute.mysql.unit.UnitContainerTestCase;

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
    //                                                                    Full-Text Search
    //                                                                    ================
    public void test_match_basic_singleColumn_nonModifier() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        MemberDbm dbm = MemberDbm.getInstance();

        // ## Act ##
        cb.query().match(dbm.columnMemberName(), "foo", null);

        // ## Assert ##
        String sql = cb.toDisplaySql();
        log(sql);
        assertTrue(sql.contains("match("));
        assertTrue(sql.contains(MemberDbm.getInstance().columnMemberName().getColumnDbName()));
        assertTrue(sql.contains(") against ('foo')"));

        try {
            memberBhv.selectList(cb);
            fail();
        } catch (SQLFailureException e) {
            // OK
            log(e.getMessage());
            assertTrue(e.getMessage().contains("FULLTEXT"));
        }
    }

    public void test_match_duplicateColumn_inBooleanModeModifier() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        MemberDbm dbm = MemberDbm.getInstance();
        List<ColumnInfo> textColumnList = new ArrayList<ColumnInfo>();
        textColumnList.add(dbm.columnMemberName());
        textColumnList.add(dbm.columnMemberAccount());

        // ## Act ##
        cb.query().match(textColumnList, "foo", WayOfMySQL.FullTextSearchModifier.InBooleanMode);

        // ## Assert ##
        String sql = cb.toDisplaySql();
        log(sql);
        assertTrue(sql.contains("match("));
        assertTrue(sql.contains(MemberDbm.getInstance().columnMemberName().getColumnDbName()));
        assertTrue(sql.contains(MemberDbm.getInstance().columnMemberAccount().getColumnDbName()));
        assertTrue(sql.contains(") against ('foo' in boolean mode)"));

        try {
            memberBhv.selectList(cb);
            fail();
        } catch (SQLFailureException e) {
            // OK
            log(e.getMessage());
            assertTrue(e.getMessage().contains("FULLTEXT"));
        }
    }

    public void test_match_otherConditionTogether() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        MemberDbm dbm = MemberDbm.getInstance();
        List<ColumnInfo> textColumnList = new ArrayList<ColumnInfo>();
        textColumnList.add(dbm.columnMemberName());
        textColumnList.add(dbm.columnMemberAccount());

        // ## Act ##
        cb.query().setBirthdate_LessEqual(currentDate());
        cb.query().match(textColumnList, "foo", WayOfMySQL.FullTextSearchModifier.WithQueryExpansion);

        // ## Assert ##
        String sql = cb.toDisplaySql();
        log(sql);
        assertTrue(sql.contains("and match("));
        assertTrue(sql.contains(MemberDbm.getInstance().columnMemberName().getColumnDbName()));
        assertTrue(sql.contains(MemberDbm.getInstance().columnMemberAccount().getColumnDbName()));
        assertTrue(sql.contains(") against ('foo' with query expansion)"));

        try {
            memberBhv.selectList(cb);
            fail();
        } catch (SQLFailureException e) {
            // OK
            log(e.getMessage());
            assertTrue(e.getMessage().contains("FULLTEXT"));
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
            cb.query().match(textColumnList, "foo", WayOfMySQL.FullTextSearchModifier.InBooleanMode);
            // ## Assert ##
            fail();
        } catch (IllegalArgumentException e) {
            // OK
            log(e.getMessage());
        }
    }

    public void test_match_escape() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        MemberDbm dbm = MemberDbm.getInstance();

        // ## Act ##
        cb.query().match(dbm.columnMemberName(), "f'o\\'o", null);

        // ## Assert ##
        String sql = cb.toDisplaySql();
        log(sql);
        assertTrue(sql.contains("match("));
        assertTrue(sql.contains(MemberDbm.getInstance().columnMemberName().getColumnDbName()));
        assertTrue(sql.contains(") against ('f''o\\\\''o')"));

        try {
            memberBhv.selectList(cb);
            fail();
        } catch (SQLFailureException e) {
            // OK
            log(e.getMessage());
            assertTrue(e.getMessage().contains("FULLTEXT"));
        }
    }
}
