package com.example.dbflute.mysql.dbflute.allcommon;

import java.lang.reflect.Method;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.info.ColumnInfo;
import org.seasar.framework.util.MethodUtil;

import com.example.dbflute.mysql.dbflute.bsentity.dbmeta.MemberDbm;
import com.example.dbflute.mysql.dbflute.bsentity.dbmeta.MemberStatusDbm;
import com.example.dbflute.mysql.dbflute.exentity.Member;
import com.example.dbflute.mysql.unit.UnitContainerTestCase;

/**
 * The test of dbmetaInstanceHandler for Basic Example.
 * @author jflute
 * @since 0.5.8 (2007/11/28 Wednesday)
 */
public class DBMetaInstanceHandlerTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                          findDBMeta
    //                                                                          ==========
    /**
     * DB上のテーブル名からDBMetaを取得して、プロパティ名を取得。
     */
    public void test_findDBMeta_byTableDbName_getTablePropertyName() {
        // ## Arrange ##
        final String tableDbName = "MEMBER_STATUS";

        // ## Act ##
        final DBMeta dbmeta = DBMetaInstanceHandler.findDBMeta(tableDbName);
        final String tablePropertyName = dbmeta.getTablePropertyName();

        // ## Assert ##
        assertNotNull(tablePropertyName);
        log("tablePropertyName=" + tablePropertyName);
        assertNotNull(tablePropertyName);
        assertEquals(MemberStatusDbm.getInstance().getTablePropertyName(), tablePropertyName);
        assertNotSame(MemberStatusDbm.getInstance().getTableDbName(), tablePropertyName);
    }

    /**
     * プロパティ名からDBMetaを取得して、DB上のテーブル名を取得。
     */
    public void test_findDBMeta_byTablePropertyName_getTableDbName() {
        // ## Arrange ##
        final String tablePropertyName = "memberStatus";

        // ## Act ##
        final DBMeta dbmeta = DBMetaInstanceHandler.findDBMeta(tablePropertyName);
        final String tableDbName = dbmeta.getTableDbName();

        // ## Assert ##
        assertNotNull(tableDbName);
        log("tableDbName=" + tableDbName);
        assertNotNull(tableDbName);
        assertEquals(MemberStatusDbm.getInstance().getTablePropertyName(), tablePropertyName);
        assertNotSame(MemberStatusDbm.getInstance().getTableDbName(), tablePropertyName);
    }

    public void test_findDBMeta_byTableDbName_newEntity() throws Exception {
        // ## Arrange ##
        final String tableDbName = "MEMBER";

        // ## Act ##
        final DBMeta dbmeta = DBMetaInstanceHandler.findDBMeta(tableDbName);
        final Entity member = dbmeta.newEntity();

        // ## Assert ##
        assertEquals(Member.class, member.getClass());
    }

    public void test_findDBMeta_byTableDbName_findColumnInfo_byPropertyname_getColumnDbName() throws Exception {
        // ## Arrange ##
        final String tableDbName = "MEMBER";
        final String memberAccountPropertyName = "memberAccount";

        // ## Act ##
        final DBMeta dbmeta = DBMetaInstanceHandler.findDBMeta(tableDbName);
        final ColumnInfo memberAccontColumnInfo = dbmeta.findColumnInfo(memberAccountPropertyName);
        final String columnDbName = memberAccontColumnInfo.getColumnDbName();

        // ## Assert ##
        assertNotNull(columnDbName);
        log("/********************************");
        log("columnDbName=" + columnDbName);
        log("**********/");
        assertEquals(MemberDbm.getInstance().columnMemberAccount().getColumnDbName(), columnDbName);
    }

    public void test_findDBMeta_byTableDbName_findColumnInfo_byPropertyname_EntityGetSet() throws Exception {
        // ## Arrange ##
        final String tableDbName = "MEMBER";
        final String memberAccountPropertyName = "memberAccount";
        final String expectedMemberAccountValue = "test";

        // ## Act ##
        final DBMeta dbmeta = DBMetaInstanceHandler.findDBMeta(tableDbName);
        final ColumnInfo memberAccontColumnInfo = dbmeta.findColumnInfo(memberAccountPropertyName);
        final Method writer = memberAccontColumnInfo.getWriteMethod();
        final Entity entity = dbmeta.newEntity();
        MethodUtil.invoke(writer, entity, new Object[] { expectedMemberAccountValue });
        final Method reader = memberAccontColumnInfo.getReadMethod();
        final Object resultValue = MethodUtil.invoke(reader, entity, null);

        // ## Assert ##
        assertNotNull(resultValue);
        log("resultValue=" + resultValue);
        assertEquals(expectedMemberAccountValue, resultValue);
    }

    public void test_findDBMeta_quoted() {
        // ## Arrange & Act & Assert ##
        assertNotNull(DBMetaInstanceHandler.findDBMeta("\"MEMBER_STATUS\""));
        assertNotNull(DBMetaInstanceHandler.findDBMeta("[MEMBER_STATUS]"));
    }

    public void test_findDBMeta_schema() {
        // ## Arrange & Act & Assert ##
        assertNotNull(DBMetaInstanceHandler.findDBMeta("FOO.MEMBER_STATUS"));
        assertNotNull(DBMetaInstanceHandler.findDBMeta("FOO.\"MEMBER_STATUS\""));
        assertNotNull(DBMetaInstanceHandler.findDBMeta("BAR.[MEMBER_STATUS]"));
    }
}
