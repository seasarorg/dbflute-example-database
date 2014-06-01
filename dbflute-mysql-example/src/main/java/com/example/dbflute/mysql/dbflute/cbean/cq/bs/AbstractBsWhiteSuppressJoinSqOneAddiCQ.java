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
 * The abstract condition-query of white_suppress_join_sq_one_addi.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteSuppressJoinSqOneAddiCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteSuppressJoinSqOneAddiCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_suppress_join_sq_one_addi";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * ONE_ADDI_ID: {PK, NotNull, INT(10)}
     * @param oneAddiId The value of oneAddiId as equal. (NullAllowed: if null, no condition)
     */
    public void setOneAddiId_Equal(Integer oneAddiId) {
        doSetOneAddiId_Equal(oneAddiId);
    }

    protected void doSetOneAddiId_Equal(Integer oneAddiId) {
        regOneAddiId(CK_EQ, oneAddiId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ONE_ADDI_ID: {PK, NotNull, INT(10)}
     * @param oneAddiId The value of oneAddiId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setOneAddiId_GreaterThan(Integer oneAddiId) {
        regOneAddiId(CK_GT, oneAddiId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ONE_ADDI_ID: {PK, NotNull, INT(10)}
     * @param oneAddiId The value of oneAddiId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setOneAddiId_LessThan(Integer oneAddiId) {
        regOneAddiId(CK_LT, oneAddiId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * ONE_ADDI_ID: {PK, NotNull, INT(10)}
     * @param oneAddiId The value of oneAddiId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setOneAddiId_GreaterEqual(Integer oneAddiId) {
        regOneAddiId(CK_GE, oneAddiId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * ONE_ADDI_ID: {PK, NotNull, INT(10)}
     * @param oneAddiId The value of oneAddiId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setOneAddiId_LessEqual(Integer oneAddiId) {
        regOneAddiId(CK_LE, oneAddiId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * ONE_ADDI_ID: {PK, NotNull, INT(10)}
     * @param minNumber The min number of oneAddiId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of oneAddiId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setOneAddiId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueOneAddiId(), "ONE_ADDI_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * ONE_ADDI_ID: {PK, NotNull, INT(10)}
     * @param oneAddiIdList The collection of oneAddiId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setOneAddiId_InScope(Collection<Integer> oneAddiIdList) {
        doSetOneAddiId_InScope(oneAddiIdList);
    }

    protected void doSetOneAddiId_InScope(Collection<Integer> oneAddiIdList) {
        regINS(CK_INS, cTL(oneAddiIdList), getCValueOneAddiId(), "ONE_ADDI_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * ONE_ADDI_ID: {PK, NotNull, INT(10)}
     * @param oneAddiIdList The collection of oneAddiId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setOneAddiId_NotInScope(Collection<Integer> oneAddiIdList) {
        doSetOneAddiId_NotInScope(oneAddiIdList);
    }

    protected void doSetOneAddiId_NotInScope(Collection<Integer> oneAddiIdList) {
        regINS(CK_NINS, cTL(oneAddiIdList), getCValueOneAddiId(), "ONE_ADDI_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * ONE_ADDI_ID: {PK, NotNull, INT(10)}
     */
    public void setOneAddiId_IsNull() { regOneAddiId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * ONE_ADDI_ID: {PK, NotNull, INT(10)}
     */
    public void setOneAddiId_IsNotNull() { regOneAddiId(CK_ISNN, DOBJ); }

    protected void regOneAddiId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueOneAddiId(), "ONE_ADDI_ID"); }
    protected abstract ConditionValue getCValueOneAddiId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * ONE_ADDI_NAME: {NotNull, VARCHAR(200)}
     * @param oneAddiName The value of oneAddiName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setOneAddiName_Equal(String oneAddiName) {
        doSetOneAddiName_Equal(fRES(oneAddiName));
    }

    protected void doSetOneAddiName_Equal(String oneAddiName) {
        regOneAddiName(CK_EQ, oneAddiName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * ONE_ADDI_NAME: {NotNull, VARCHAR(200)}
     * @param oneAddiName The value of oneAddiName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setOneAddiName_NotEqual(String oneAddiName) {
        doSetOneAddiName_NotEqual(fRES(oneAddiName));
    }

    protected void doSetOneAddiName_NotEqual(String oneAddiName) {
        regOneAddiName(CK_NES, oneAddiName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * ONE_ADDI_NAME: {NotNull, VARCHAR(200)}
     * @param oneAddiNameList The collection of oneAddiName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setOneAddiName_InScope(Collection<String> oneAddiNameList) {
        doSetOneAddiName_InScope(oneAddiNameList);
    }

    public void doSetOneAddiName_InScope(Collection<String> oneAddiNameList) {
        regINS(CK_INS, cTL(oneAddiNameList), getCValueOneAddiName(), "ONE_ADDI_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * ONE_ADDI_NAME: {NotNull, VARCHAR(200)}
     * @param oneAddiNameList The collection of oneAddiName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setOneAddiName_NotInScope(Collection<String> oneAddiNameList) {
        doSetOneAddiName_NotInScope(oneAddiNameList);
    }

    public void doSetOneAddiName_NotInScope(Collection<String> oneAddiNameList) {
        regINS(CK_NINS, cTL(oneAddiNameList), getCValueOneAddiName(), "ONE_ADDI_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * ONE_ADDI_NAME: {NotNull, VARCHAR(200)}
     * @param oneAddiName The value of oneAddiName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setOneAddiName_PrefixSearch(String oneAddiName) {
        setOneAddiName_LikeSearch(oneAddiName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * ONE_ADDI_NAME: {NotNull, VARCHAR(200)} <br />
     * <pre>e.g. setOneAddiName_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param oneAddiName The value of oneAddiName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOneAddiName_LikeSearch(String oneAddiName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(oneAddiName), getCValueOneAddiName(), "ONE_ADDI_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * ONE_ADDI_NAME: {NotNull, VARCHAR(200)}
     * @param oneAddiName The value of oneAddiName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOneAddiName_NotLikeSearch(String oneAddiName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(oneAddiName), getCValueOneAddiName(), "ONE_ADDI_NAME", likeSearchOption);
    }

    protected void regOneAddiName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueOneAddiName(), "ONE_ADDI_NAME"); }
    protected abstract ConditionValue getCValueOneAddiName();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteSuppressJoinSqOneAddiCB&gt;() {
     *     public void query(WhiteSuppressJoinSqOneAddiCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSuppressJoinSqOneAddiCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand(), WhiteSuppressJoinSqOneAddiCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteSuppressJoinSqOneAddiCB&gt;() {
     *     public void query(WhiteSuppressJoinSqOneAddiCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSuppressJoinSqOneAddiCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand(), WhiteSuppressJoinSqOneAddiCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteSuppressJoinSqOneAddiCB&gt;() {
     *     public void query(WhiteSuppressJoinSqOneAddiCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSuppressJoinSqOneAddiCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand(), WhiteSuppressJoinSqOneAddiCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteSuppressJoinSqOneAddiCB&gt;() {
     *     public void query(WhiteSuppressJoinSqOneAddiCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSuppressJoinSqOneAddiCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand(), WhiteSuppressJoinSqOneAddiCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteSuppressJoinSqOneAddiCB&gt;() {
     *     public void query(WhiteSuppressJoinSqOneAddiCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSuppressJoinSqOneAddiCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand(), WhiteSuppressJoinSqOneAddiCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteSuppressJoinSqOneAddiCB&gt;() {
     *     public void query(WhiteSuppressJoinSqOneAddiCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSuppressJoinSqOneAddiCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand(), WhiteSuppressJoinSqOneAddiCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSuppressJoinSqOneAddiCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhiteSuppressJoinSqOneAddiCQ sq);

    protected WhiteSuppressJoinSqOneAddiCB xcreateScalarConditionCB() {
        WhiteSuppressJoinSqOneAddiCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteSuppressJoinSqOneAddiCB xcreateScalarConditionPartitionByCB() {
        WhiteSuppressJoinSqOneAddiCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteSuppressJoinSqOneAddiCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSuppressJoinSqOneAddiCB cb = new WhiteSuppressJoinSqOneAddiCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "ONE_ADDI_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteSuppressJoinSqOneAddiCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteSuppressJoinSqOneAddiCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteSuppressJoinSqOneAddiCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSuppressJoinSqOneAddiCB cb = new WhiteSuppressJoinSqOneAddiCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "ONE_ADDI_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteSuppressJoinSqOneAddiCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteSuppressJoinSqOneAddiCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteSuppressJoinSqOneAddiCB cb = new WhiteSuppressJoinSqOneAddiCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteSuppressJoinSqOneAddiCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteSuppressJoinSqOneAddiCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteSuppressJoinSqOneAddiCB cb = new WhiteSuppressJoinSqOneAddiCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(WhiteSuppressJoinSqOneAddiCQ sq);

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

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected WhiteSuppressJoinSqOneAddiCB newMyCB() {
        return new WhiteSuppressJoinSqOneAddiCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return WhiteSuppressJoinSqOneAddiCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
