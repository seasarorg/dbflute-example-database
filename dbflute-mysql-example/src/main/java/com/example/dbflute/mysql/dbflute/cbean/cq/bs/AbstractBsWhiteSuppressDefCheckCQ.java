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
 * The abstract condition-query of white_suppress_def_check.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteSuppressDefCheckCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteSuppressDefCheckCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
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
        return "white_suppress_def_check";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * DEF_CHECK_ID: {PK, NotNull, BIGINT(19)}
     * @param defCheckId The value of defCheckId as equal. (NullAllowed: if null, no condition)
     */
    public void setDefCheckId_Equal(Long defCheckId) {
        doSetDefCheckId_Equal(defCheckId);
    }

    protected void doSetDefCheckId_Equal(Long defCheckId) {
        regDefCheckId(CK_EQ, defCheckId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * DEF_CHECK_ID: {PK, NotNull, BIGINT(19)}
     * @param defCheckId The value of defCheckId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setDefCheckId_GreaterThan(Long defCheckId) {
        regDefCheckId(CK_GT, defCheckId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * DEF_CHECK_ID: {PK, NotNull, BIGINT(19)}
     * @param defCheckId The value of defCheckId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setDefCheckId_LessThan(Long defCheckId) {
        regDefCheckId(CK_LT, defCheckId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * DEF_CHECK_ID: {PK, NotNull, BIGINT(19)}
     * @param defCheckId The value of defCheckId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setDefCheckId_GreaterEqual(Long defCheckId) {
        regDefCheckId(CK_GE, defCheckId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * DEF_CHECK_ID: {PK, NotNull, BIGINT(19)}
     * @param defCheckId The value of defCheckId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setDefCheckId_LessEqual(Long defCheckId) {
        regDefCheckId(CK_LE, defCheckId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * DEF_CHECK_ID: {PK, NotNull, BIGINT(19)}
     * @param minNumber The min number of defCheckId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of defCheckId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDefCheckId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueDefCheckId(), "DEF_CHECK_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * DEF_CHECK_ID: {PK, NotNull, BIGINT(19)}
     * @param defCheckIdList The collection of defCheckId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDefCheckId_InScope(Collection<Long> defCheckIdList) {
        doSetDefCheckId_InScope(defCheckIdList);
    }

    protected void doSetDefCheckId_InScope(Collection<Long> defCheckIdList) {
        regINS(CK_INS, cTL(defCheckIdList), getCValueDefCheckId(), "DEF_CHECK_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * DEF_CHECK_ID: {PK, NotNull, BIGINT(19)}
     * @param defCheckIdList The collection of defCheckId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDefCheckId_NotInScope(Collection<Long> defCheckIdList) {
        doSetDefCheckId_NotInScope(defCheckIdList);
    }

    protected void doSetDefCheckId_NotInScope(Collection<Long> defCheckIdList) {
        regINS(CK_NINS, cTL(defCheckIdList), getCValueDefCheckId(), "DEF_CHECK_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * DEF_CHECK_ID: {PK, NotNull, BIGINT(19)}
     */
    public void setDefCheckId_IsNull() { regDefCheckId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * DEF_CHECK_ID: {PK, NotNull, BIGINT(19)}
     */
    public void setDefCheckId_IsNotNull() { regDefCheckId(CK_ISNN, DOBJ); }

    protected void regDefCheckId(ConditionKey k, Object v) { regQ(k, v, getCValueDefCheckId(), "DEF_CHECK_ID"); }
    abstract protected ConditionValue getCValueDefCheckId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * DEF_CHECK_NAME: {NotNull, VARCHAR(200)}
     * @param defCheckName The value of defCheckName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setDefCheckName_Equal(String defCheckName) {
        doSetDefCheckName_Equal(fRES(defCheckName));
    }

    protected void doSetDefCheckName_Equal(String defCheckName) {
        regDefCheckName(CK_EQ, defCheckName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * DEF_CHECK_NAME: {NotNull, VARCHAR(200)}
     * @param defCheckName The value of defCheckName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setDefCheckName_NotEqual(String defCheckName) {
        doSetDefCheckName_NotEqual(fRES(defCheckName));
    }

    protected void doSetDefCheckName_NotEqual(String defCheckName) {
        regDefCheckName(CK_NES, defCheckName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * DEF_CHECK_NAME: {NotNull, VARCHAR(200)}
     * @param defCheckNameList The collection of defCheckName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDefCheckName_InScope(Collection<String> defCheckNameList) {
        doSetDefCheckName_InScope(defCheckNameList);
    }

    public void doSetDefCheckName_InScope(Collection<String> defCheckNameList) {
        regINS(CK_INS, cTL(defCheckNameList), getCValueDefCheckName(), "DEF_CHECK_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * DEF_CHECK_NAME: {NotNull, VARCHAR(200)}
     * @param defCheckNameList The collection of defCheckName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDefCheckName_NotInScope(Collection<String> defCheckNameList) {
        doSetDefCheckName_NotInScope(defCheckNameList);
    }

    public void doSetDefCheckName_NotInScope(Collection<String> defCheckNameList) {
        regINS(CK_NINS, cTL(defCheckNameList), getCValueDefCheckName(), "DEF_CHECK_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * DEF_CHECK_NAME: {NotNull, VARCHAR(200)}
     * @param defCheckName The value of defCheckName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setDefCheckName_PrefixSearch(String defCheckName) {
        setDefCheckName_LikeSearch(defCheckName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * DEF_CHECK_NAME: {NotNull, VARCHAR(200)} <br />
     * <pre>e.g. setDefCheckName_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param defCheckName The value of defCheckName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDefCheckName_LikeSearch(String defCheckName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(defCheckName), getCValueDefCheckName(), "DEF_CHECK_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * DEF_CHECK_NAME: {NotNull, VARCHAR(200)}
     * @param defCheckName The value of defCheckName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDefCheckName_NotLikeSearch(String defCheckName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(defCheckName), getCValueDefCheckName(), "DEF_CHECK_NAME", likeSearchOption);
    }

    protected void regDefCheckName(ConditionKey k, Object v) { regQ(k, v, getCValueDefCheckName(), "DEF_CHECK_NAME"); }
    abstract protected ConditionValue getCValueDefCheckName();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteSuppressDefCheckCB&gt;() {
     *     public void query(WhiteSuppressDefCheckCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSuppressDefCheckCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteSuppressDefCheckCB&gt;() {
     *     public void query(WhiteSuppressDefCheckCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSuppressDefCheckCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteSuppressDefCheckCB&gt;() {
     *     public void query(WhiteSuppressDefCheckCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSuppressDefCheckCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteSuppressDefCheckCB&gt;() {
     *     public void query(WhiteSuppressDefCheckCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSuppressDefCheckCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteSuppressDefCheckCB&gt;() {
     *     public void query(WhiteSuppressDefCheckCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSuppressDefCheckCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteSuppressDefCheckCB&gt;() {
     *     public void query(WhiteSuppressDefCheckCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSuppressDefCheckCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<WhiteSuppressDefCheckCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<WhiteSuppressDefCheckCB>(new HpSSQSetupper<WhiteSuppressDefCheckCB>() {
            public void setup(String function, SubQuery<WhiteSuppressDefCheckCB> subQuery, HpSSQOption<WhiteSuppressDefCheckCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<WhiteSuppressDefCheckCB> subQuery, String operand, HpSSQOption<WhiteSuppressDefCheckCB> option) {
        assertObjectNotNull("subQuery<WhiteSuppressDefCheckCB>", subQuery);
        WhiteSuppressDefCheckCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(WhiteSuppressDefCheckCQ subQuery);

    protected WhiteSuppressDefCheckCB xcreateScalarConditionCB() {
        WhiteSuppressDefCheckCB cb = new WhiteSuppressDefCheckCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected WhiteSuppressDefCheckCB xcreateScalarConditionPartitionByCB() {
        WhiteSuppressDefCheckCB cb = new WhiteSuppressDefCheckCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<WhiteSuppressDefCheckCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<WhiteSuppressDefCheckCB>", subQuery);
        WhiteSuppressDefCheckCB cb = new WhiteSuppressDefCheckCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "DEF_CHECK_ID", "DEF_CHECK_ID", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteSuppressDefCheckCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteSuppressDefCheckCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<WhiteSuppressDefCheckCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<WhiteSuppressDefCheckCB>(new HpQDRSetupper<WhiteSuppressDefCheckCB>() {
            public void setup(String function, SubQuery<WhiteSuppressDefCheckCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<WhiteSuppressDefCheckCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<WhiteSuppressDefCheckCB>", subQuery);
        WhiteSuppressDefCheckCB cb = new WhiteSuppressDefCheckCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "DEF_CHECK_ID", "DEF_CHECK_ID", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(WhiteSuppressDefCheckCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteSuppressDefCheckCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteSuppressDefCheckCB>", subQuery);
        WhiteSuppressDefCheckCB cb = new WhiteSuppressDefCheckCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(WhiteSuppressDefCheckCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteSuppressDefCheckCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteSuppressDefCheckCB>", subQuery);
        WhiteSuppressDefCheckCB cb = new WhiteSuppressDefCheckCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(WhiteSuppressDefCheckCQ subQuery);

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
    public void match(java.util.List<org.seasar.dbflute.dbmeta.info.ColumnInfo> textColumnList
                    , String conditionValue
                    , org.seasar.dbflute.dbway.WayOfMySQL.FullTextSearchModifier modifier) {
        xdoMatchForMySQL(textColumnList, conditionValue, modifier);
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCB() { return WhiteSuppressDefCheckCB.class.getName(); }
    protected String xabCQ() { return WhiteSuppressDefCheckCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
