/*
 * Copyright 2004-2013 the Seasar Foundation and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package com.example.dbflute.mysql.dbflute.cbean.cq.bs;

import java.util.*;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.dbmeta.DBMetaProvider;
import com.example.dbflute.mysql.dbflute.allcommon.*;
import com.example.dbflute.mysql.dbflute.cbean.*;
import com.example.dbflute.mysql.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of white_db_comment.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteDbCommentCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteDbCommentCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                     DBMeta Provider
    //                                                                     ===============
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "white_db_comment";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (Normal)DB_COMMENT_CODE: {PK, NotNull, CHAR(3)}
     * @param dbCommentCode The value of dbCommentCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setDbCommentCode_Equal(String dbCommentCode) {
        doSetDbCommentCode_Equal(fRES(dbCommentCode));
    }

    protected void doSetDbCommentCode_Equal(String dbCommentCode) {
        regDbCommentCode(CK_EQ, dbCommentCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (Normal)DB_COMMENT_CODE: {PK, NotNull, CHAR(3)}
     * @param dbCommentCode The value of dbCommentCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setDbCommentCode_NotEqual(String dbCommentCode) {
        doSetDbCommentCode_NotEqual(fRES(dbCommentCode));
    }

    protected void doSetDbCommentCode_NotEqual(String dbCommentCode) {
        regDbCommentCode(CK_NES, dbCommentCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (Normal)DB_COMMENT_CODE: {PK, NotNull, CHAR(3)}
     * @param dbCommentCodeList The collection of dbCommentCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDbCommentCode_InScope(Collection<String> dbCommentCodeList) {
        doSetDbCommentCode_InScope(dbCommentCodeList);
    }

    public void doSetDbCommentCode_InScope(Collection<String> dbCommentCodeList) {
        regINS(CK_INS, cTL(dbCommentCodeList), getCValueDbCommentCode(), "DB_COMMENT_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (Normal)DB_COMMENT_CODE: {PK, NotNull, CHAR(3)}
     * @param dbCommentCodeList The collection of dbCommentCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDbCommentCode_NotInScope(Collection<String> dbCommentCodeList) {
        doSetDbCommentCode_NotInScope(dbCommentCodeList);
    }

    public void doSetDbCommentCode_NotInScope(Collection<String> dbCommentCodeList) {
        regINS(CK_NINS, cTL(dbCommentCodeList), getCValueDbCommentCode(), "DB_COMMENT_CODE");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (Normal)DB_COMMENT_CODE: {PK, NotNull, CHAR(3)}
     * @param dbCommentCode The value of dbCommentCode as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setDbCommentCode_PrefixSearch(String dbCommentCode) {
        setDbCommentCode_LikeSearch(dbCommentCode, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (Normal)DB_COMMENT_CODE: {PK, NotNull, CHAR(3)} <br />
     * <pre>e.g. setDbCommentCode_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dbCommentCode The value of dbCommentCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDbCommentCode_LikeSearch(String dbCommentCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dbCommentCode), getCValueDbCommentCode(), "DB_COMMENT_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (Normal)DB_COMMENT_CODE: {PK, NotNull, CHAR(3)}
     * @param dbCommentCode The value of dbCommentCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDbCommentCode_NotLikeSearch(String dbCommentCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dbCommentCode), getCValueDbCommentCode(), "DB_COMMENT_CODE", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * (Normal)DB_COMMENT_CODE: {PK, NotNull, CHAR(3)}
     */
    public void setDbCommentCode_IsNull() { regDbCommentCode(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * (Normal)DB_COMMENT_CODE: {PK, NotNull, CHAR(3)}
     */
    public void setDbCommentCode_IsNotNull() { regDbCommentCode(CK_ISNN, DOBJ); }

    protected void regDbCommentCode(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueDbCommentCode(), "DB_COMMENT_CODE"); }
    protected abstract ConditionValue getCValueDbCommentCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (JavaDocHeadache)DB_COMMENT_NAME: {VARCHAR(20)}
     * @param dbCommentName The value of dbCommentName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setDbCommentName_Equal(String dbCommentName) {
        doSetDbCommentName_Equal(fRES(dbCommentName));
    }

    protected void doSetDbCommentName_Equal(String dbCommentName) {
        regDbCommentName(CK_EQ, dbCommentName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (JavaDocHeadache)DB_COMMENT_NAME: {VARCHAR(20)}
     * @param dbCommentName The value of dbCommentName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setDbCommentName_NotEqual(String dbCommentName) {
        doSetDbCommentName_NotEqual(fRES(dbCommentName));
    }

    protected void doSetDbCommentName_NotEqual(String dbCommentName) {
        regDbCommentName(CK_NES, dbCommentName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (JavaDocHeadache)DB_COMMENT_NAME: {VARCHAR(20)}
     * @param dbCommentNameList The collection of dbCommentName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDbCommentName_InScope(Collection<String> dbCommentNameList) {
        doSetDbCommentName_InScope(dbCommentNameList);
    }

    public void doSetDbCommentName_InScope(Collection<String> dbCommentNameList) {
        regINS(CK_INS, cTL(dbCommentNameList), getCValueDbCommentName(), "DB_COMMENT_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (JavaDocHeadache)DB_COMMENT_NAME: {VARCHAR(20)}
     * @param dbCommentNameList The collection of dbCommentName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDbCommentName_NotInScope(Collection<String> dbCommentNameList) {
        doSetDbCommentName_NotInScope(dbCommentNameList);
    }

    public void doSetDbCommentName_NotInScope(Collection<String> dbCommentNameList) {
        regINS(CK_NINS, cTL(dbCommentNameList), getCValueDbCommentName(), "DB_COMMENT_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (JavaDocHeadache)DB_COMMENT_NAME: {VARCHAR(20)}
     * @param dbCommentName The value of dbCommentName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setDbCommentName_PrefixSearch(String dbCommentName) {
        setDbCommentName_LikeSearch(dbCommentName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (JavaDocHeadache)DB_COMMENT_NAME: {VARCHAR(20)} <br />
     * <pre>e.g. setDbCommentName_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dbCommentName The value of dbCommentName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDbCommentName_LikeSearch(String dbCommentName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dbCommentName), getCValueDbCommentName(), "DB_COMMENT_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (JavaDocHeadache)DB_COMMENT_NAME: {VARCHAR(20)}
     * @param dbCommentName The value of dbCommentName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDbCommentName_NotLikeSearch(String dbCommentName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dbCommentName), getCValueDbCommentName(), "DB_COMMENT_NAME", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * (JavaDocHeadache)DB_COMMENT_NAME: {VARCHAR(20)}
     */
    public void setDbCommentName_IsNull() { regDbCommentName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * (JavaDocHeadache)DB_COMMENT_NAME: {VARCHAR(20)}
     */
    public void setDbCommentName_IsNullOrEmpty() { regDbCommentName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * (JavaDocHeadache)DB_COMMENT_NAME: {VARCHAR(20)}
     */
    public void setDbCommentName_IsNotNull() { regDbCommentName(CK_ISNN, DOBJ); }

    protected void regDbCommentName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueDbCommentName(), "DB_COMMENT_NAME"); }
    protected abstract ConditionValue getCValueDbCommentName();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteDbCommentCB&gt;() {
     *     public void query(WhiteDbCommentCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteDbCommentCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, WhiteDbCommentCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteDbCommentCB&gt;() {
     *     public void query(WhiteDbCommentCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteDbCommentCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, WhiteDbCommentCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteDbCommentCB&gt;() {
     *     public void query(WhiteDbCommentCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteDbCommentCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, WhiteDbCommentCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteDbCommentCB&gt;() {
     *     public void query(WhiteDbCommentCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteDbCommentCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, WhiteDbCommentCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteDbCommentCB&gt;() {
     *     public void query(WhiteDbCommentCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteDbCommentCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, WhiteDbCommentCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteDbCommentCB&gt;() {
     *     public void query(WhiteDbCommentCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteDbCommentCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, WhiteDbCommentCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WhiteDbCommentCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhiteDbCommentCQ sq);

    protected WhiteDbCommentCB xcreateScalarConditionCB() {
        WhiteDbCommentCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteDbCommentCB xcreateScalarConditionPartitionByCB() {
        WhiteDbCommentCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteDbCommentCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteDbCommentCB cb = new WhiteDbCommentCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "DB_COMMENT_CODE";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteDbCommentCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteDbCommentCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteDbCommentCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteDbCommentCB cb = new WhiteDbCommentCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "DB_COMMENT_CODE";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteDbCommentCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteDbCommentCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteDbCommentCB cb = new WhiteDbCommentCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteDbCommentCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteDbCommentCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteDbCommentCB cb = new WhiteDbCommentCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(WhiteDbCommentCQ sq);

    // ===================================================================================
    //                                                                    Full Text Search
    //                                                                    ================
    /**
     * Match for full-text search. <br />
     * Bind variable is unused because the condition value should be literal in MySQL.
     * @param textColumn The text column. (NotNull, StringColumn, TargetTableColumn)
     * @param conditionValue The condition value embedded without binding (by MySQL restriction) but escaped. (NullAllowed: if null or empty, no condition)
     * @param modifier The modifier of full-text search. (NullAllowed: If the value is null, No modifier specified)
     */
    public void match(org.seasar.dbflute.dbmeta.info.ColumnInfo textColumn
                    , String conditionValue
                    , org.seasar.dbflute.dbway.WayOfMySQL.FullTextSearchModifier modifier) {
        assertObjectNotNull("textColumn", textColumn);
        match(newArrayList(textColumn), conditionValue, modifier);
    }

    /**
     * Match for full-text search. <br />
     * Bind variable is unused because the condition value should be literal in MySQL.
     * @param textColumnList The list of text column. (NotNull, NotEmpty, StringColumn, TargetTableColumn)
     * @param conditionValue The condition value embedded without binding (by MySQL restriction) but escaped. (NullAllowed: if null or empty, no condition)
     * @param modifier The modifier of full-text search. (NullAllowed: If the value is null, no modifier specified)
     */
    public void match(List<org.seasar.dbflute.dbmeta.info.ColumnInfo> textColumnList
                    , String conditionValue
                    , org.seasar.dbflute.dbway.WayOfMySQL.FullTextSearchModifier modifier) {
        xdoMatchForMySQL(textColumnList, conditionValue, modifier);
    }

    /**
     * Order along manual ordering information.
     * <pre>
     * MemberCB cb = new MemberCB();
     * ManualOrderBean mob = new ManualOrderBean();
     * mob.<span style="color: #DD4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #DD4747">withManualOrder(mob)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * MemberCB cb = new MemberCB();
     * ManualOrderBean mob = new ManualOrderBean();
     * mob.<span style="color: #DD4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     * mob.<span style="color: #DD4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     * mob.<span style="color: #DD4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #DD4747">withManualOrder(mob)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param mob The bean of manual order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderBean mob) { // is user public!
        xdoWithManualOrder(mob);
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected WhiteDbCommentCB newMyCB() {
        return new WhiteDbCommentCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return WhiteDbCommentCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
