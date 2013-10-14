package com.example.dbflute.db2.dbflute.cbean.cq.bs;

import java.util.*;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.dbmeta.DBMetaProvider;
import com.example.dbflute.db2.dbflute.allcommon.*;
import com.example.dbflute.db2.dbflute.cbean.*;
import com.example.dbflute.db2.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of ALIAS_EXCEPT.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsAliasExceptCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsAliasExceptCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "ALIAS_EXCEPT";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * EXCEPT_ID: {PK, NotNull, DECIMAL(16)}
     * @param exceptId The value of exceptId as equal. (NullAllowed: if null, no condition)
     */
    public void setExceptId_Equal(Long exceptId) {
        doSetExceptId_Equal(exceptId);
    }

    protected void doSetExceptId_Equal(Long exceptId) {
        regExceptId(CK_EQ, exceptId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * EXCEPT_ID: {PK, NotNull, DECIMAL(16)}
     * @param exceptId The value of exceptId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setExceptId_NotEqual(Long exceptId) {
        doSetExceptId_NotEqual(exceptId);
    }

    protected void doSetExceptId_NotEqual(Long exceptId) {
        regExceptId(CK_NES, exceptId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * EXCEPT_ID: {PK, NotNull, DECIMAL(16)}
     * @param exceptId The value of exceptId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setExceptId_GreaterThan(Long exceptId) {
        regExceptId(CK_GT, exceptId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * EXCEPT_ID: {PK, NotNull, DECIMAL(16)}
     * @param exceptId The value of exceptId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setExceptId_LessThan(Long exceptId) {
        regExceptId(CK_LT, exceptId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * EXCEPT_ID: {PK, NotNull, DECIMAL(16)}
     * @param exceptId The value of exceptId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setExceptId_GreaterEqual(Long exceptId) {
        regExceptId(CK_GE, exceptId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * EXCEPT_ID: {PK, NotNull, DECIMAL(16)}
     * @param exceptId The value of exceptId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setExceptId_LessEqual(Long exceptId) {
        regExceptId(CK_LE, exceptId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * EXCEPT_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of exceptId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of exceptId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setExceptId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueExceptId(), "EXCEPT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * EXCEPT_ID: {PK, NotNull, DECIMAL(16)}
     * @param exceptIdList The collection of exceptId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setExceptId_InScope(Collection<Long> exceptIdList) {
        doSetExceptId_InScope(exceptIdList);
    }

    protected void doSetExceptId_InScope(Collection<Long> exceptIdList) {
        regINS(CK_INS, cTL(exceptIdList), getCValueExceptId(), "EXCEPT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * EXCEPT_ID: {PK, NotNull, DECIMAL(16)}
     * @param exceptIdList The collection of exceptId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setExceptId_NotInScope(Collection<Long> exceptIdList) {
        doSetExceptId_NotInScope(exceptIdList);
    }

    protected void doSetExceptId_NotInScope(Collection<Long> exceptIdList) {
        regINS(CK_NINS, cTL(exceptIdList), getCValueExceptId(), "EXCEPT_ID");
    }

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select EXCEPT_ID from ALIAS_REF_EXCEPT where ...)} <br />
     * ALIAS_REF_EXCEPT by EXCEPT_ID, named 'aliasRefExceptAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsAliasRefExceptList</span>(new SubQuery&lt;AliasRefExceptCB&gt;() {
     *     public void query(AliasExceptCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of AliasRefExceptList for 'exists'. (NotNull)
     */
    public void existsAliasRefExceptList(SubQuery<AliasRefExceptCB> subQuery) {
        assertObjectNotNull("subQuery<AliasRefExceptCB>", subQuery);
        AliasRefExceptCB cb = new AliasRefExceptCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepExceptId_ExistsReferrer_AliasRefExceptList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "EXCEPT_ID", "EXCEPT_ID", subQueryPropertyName, "aliasRefExceptList");
    }
    public abstract String keepExceptId_ExistsReferrer_AliasRefExceptList(AliasRefExceptCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select EXCEPT_ID from ALIAS_REF_EXCEPT where ...)} <br />
     * ALIAS_REF_EXCEPT by EXCEPT_ID, named 'aliasRefExceptAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsAliasRefExceptList</span>(new SubQuery&lt;AliasRefExceptCB&gt;() {
     *     public void query(AliasExceptCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of ExceptId_NotExistsReferrer_AliasRefExceptList for 'not exists'. (NotNull)
     */
    public void notExistsAliasRefExceptList(SubQuery<AliasRefExceptCB> subQuery) {
        assertObjectNotNull("subQuery<AliasRefExceptCB>", subQuery);
        AliasRefExceptCB cb = new AliasRefExceptCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepExceptId_NotExistsReferrer_AliasRefExceptList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "EXCEPT_ID", "EXCEPT_ID", subQueryPropertyName, "aliasRefExceptList");
    }
    public abstract String keepExceptId_NotExistsReferrer_AliasRefExceptList(AliasRefExceptCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select EXCEPT_ID from ALIAS_REF_EXCEPT where ...)} <br />
     * ALIAS_REF_EXCEPT by EXCEPT_ID, named 'aliasRefExceptAsOne'.
     * @param subQuery The sub-query of AliasRefExceptList for 'in-scope'. (NotNull)
     */
    public void inScopeAliasRefExceptList(SubQuery<AliasRefExceptCB> subQuery) {
        assertObjectNotNull("subQuery<AliasRefExceptCB>", subQuery);
        AliasRefExceptCB cb = new AliasRefExceptCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepExceptId_InScopeRelation_AliasRefExceptList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "EXCEPT_ID", "EXCEPT_ID", subQueryPropertyName, "aliasRefExceptList");
    }
    public abstract String keepExceptId_InScopeRelation_AliasRefExceptList(AliasRefExceptCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select EXCEPT_ID from ALIAS_REF_EXCEPT where ...)} <br />
     * ALIAS_REF_EXCEPT by EXCEPT_ID, named 'aliasRefExceptAsOne'.
     * @param subQuery The sub-query of AliasRefExceptList for 'not in-scope'. (NotNull)
     */
    public void notInScopeAliasRefExceptList(SubQuery<AliasRefExceptCB> subQuery) {
        assertObjectNotNull("subQuery<AliasRefExceptCB>", subQuery);
        AliasRefExceptCB cb = new AliasRefExceptCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepExceptId_NotInScopeRelation_AliasRefExceptList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "EXCEPT_ID", "EXCEPT_ID", subQueryPropertyName, "aliasRefExceptList");
    }
    public abstract String keepExceptId_NotInScopeRelation_AliasRefExceptList(AliasRefExceptCQ subQuery);

    public void xsderiveAliasRefExceptList(String function, SubQuery<AliasRefExceptCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<AliasRefExceptCB>", subQuery);
        AliasRefExceptCB cb = new AliasRefExceptCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepExceptId_SpecifyDerivedReferrer_AliasRefExceptList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "EXCEPT_ID", "EXCEPT_ID", subQueryPropertyName, "aliasRefExceptList", aliasName, option);
    }
    public abstract String keepExceptId_SpecifyDerivedReferrer_AliasRefExceptList(AliasRefExceptCQ subQuery);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from ALIAS_REF_EXCEPT where ...)} <br />
     * ALIAS_REF_EXCEPT by EXCEPT_ID, named 'aliasRefExceptAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">derivedAliasRefExceptList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;AliasRefExceptCB&gt;() {
     *     public void query(AliasRefExceptCB subCB) {
     *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #FD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<AliasRefExceptCB> derivedAliasRefExceptList() {
        return xcreateQDRFunctionAliasRefExceptList();
    }
    protected HpQDRFunction<AliasRefExceptCB> xcreateQDRFunctionAliasRefExceptList() {
        return new HpQDRFunction<AliasRefExceptCB>(new HpQDRSetupper<AliasRefExceptCB>() {
            public void setup(String function, SubQuery<AliasRefExceptCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveAliasRefExceptList(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveAliasRefExceptList(String function, SubQuery<AliasRefExceptCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<AliasRefExceptCB>", subQuery);
        AliasRefExceptCB cb = new AliasRefExceptCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepExceptId_QueryDerivedReferrer_AliasRefExceptList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepExceptId_QueryDerivedReferrer_AliasRefExceptListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "EXCEPT_ID", "EXCEPT_ID", subQueryPropertyName, "aliasRefExceptList", operand, value, parameterPropertyName, option);
    }
    public abstract String keepExceptId_QueryDerivedReferrer_AliasRefExceptList(AliasRefExceptCQ subQuery);
    public abstract String keepExceptId_QueryDerivedReferrer_AliasRefExceptListParameter(Object parameterValue);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * EXCEPT_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setExceptId_IsNull() { regExceptId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * EXCEPT_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setExceptId_IsNotNull() { regExceptId(CK_ISNN, DOBJ); }

    protected void regExceptId(ConditionKey k, Object v) { regQ(k, v, getCValueExceptId(), "EXCEPT_ID"); }
    abstract protected ConditionValue getCValueExceptId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * EXCEPT_NAME: {VARCHAR(256)}
     * @param exceptName The value of exceptName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setExceptName_Equal(String exceptName) {
        doSetExceptName_Equal(fRES(exceptName));
    }

    protected void doSetExceptName_Equal(String exceptName) {
        regExceptName(CK_EQ, exceptName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * EXCEPT_NAME: {VARCHAR(256)}
     * @param exceptName The value of exceptName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setExceptName_NotEqual(String exceptName) {
        doSetExceptName_NotEqual(fRES(exceptName));
    }

    protected void doSetExceptName_NotEqual(String exceptName) {
        regExceptName(CK_NES, exceptName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * EXCEPT_NAME: {VARCHAR(256)}
     * @param exceptNameList The collection of exceptName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setExceptName_InScope(Collection<String> exceptNameList) {
        doSetExceptName_InScope(exceptNameList);
    }

    public void doSetExceptName_InScope(Collection<String> exceptNameList) {
        regINS(CK_INS, cTL(exceptNameList), getCValueExceptName(), "EXCEPT_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * EXCEPT_NAME: {VARCHAR(256)}
     * @param exceptNameList The collection of exceptName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setExceptName_NotInScope(Collection<String> exceptNameList) {
        doSetExceptName_NotInScope(exceptNameList);
    }

    public void doSetExceptName_NotInScope(Collection<String> exceptNameList) {
        regINS(CK_NINS, cTL(exceptNameList), getCValueExceptName(), "EXCEPT_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * EXCEPT_NAME: {VARCHAR(256)}
     * @param exceptName The value of exceptName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setExceptName_PrefixSearch(String exceptName) {
        setExceptName_LikeSearch(exceptName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * EXCEPT_NAME: {VARCHAR(256)} <br />
     * <pre>e.g. setExceptName_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param exceptName The value of exceptName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setExceptName_LikeSearch(String exceptName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(exceptName), getCValueExceptName(), "EXCEPT_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * EXCEPT_NAME: {VARCHAR(256)}
     * @param exceptName The value of exceptName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setExceptName_NotLikeSearch(String exceptName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(exceptName), getCValueExceptName(), "EXCEPT_NAME", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * EXCEPT_NAME: {VARCHAR(256)}
     */
    public void setExceptName_IsNull() { regExceptName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * EXCEPT_NAME: {VARCHAR(256)}
     */
    public void setExceptName_IsNullOrEmpty() { regExceptName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * EXCEPT_NAME: {VARCHAR(256)}
     */
    public void setExceptName_IsNotNull() { regExceptName(CK_ISNN, DOBJ); }

    protected void regExceptName(ConditionKey k, Object v) { regQ(k, v, getCValueExceptName(), "EXCEPT_NAME"); }
    abstract protected ConditionValue getCValueExceptName();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;AliasExceptCB&gt;() {
     *     public void query(AliasExceptCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<AliasExceptCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;AliasExceptCB&gt;() {
     *     public void query(AliasExceptCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<AliasExceptCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;AliasExceptCB&gt;() {
     *     public void query(AliasExceptCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<AliasExceptCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;AliasExceptCB&gt;() {
     *     public void query(AliasExceptCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<AliasExceptCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;AliasExceptCB&gt;() {
     *     public void query(AliasExceptCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<AliasExceptCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;AliasExceptCB&gt;() {
     *     public void query(AliasExceptCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<AliasExceptCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<AliasExceptCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<AliasExceptCB>(new HpSSQSetupper<AliasExceptCB>() {
            public void setup(String function, SubQuery<AliasExceptCB> subQuery, HpSSQOption<AliasExceptCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<AliasExceptCB> subQuery, String operand, HpSSQOption<AliasExceptCB> option) {
        assertObjectNotNull("subQuery<AliasExceptCB>", subQuery);
        AliasExceptCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(AliasExceptCQ subQuery);

    protected AliasExceptCB xcreateScalarConditionCB() {
        AliasExceptCB cb = new AliasExceptCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected AliasExceptCB xcreateScalarConditionPartitionByCB() {
        AliasExceptCB cb = new AliasExceptCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<AliasExceptCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<AliasExceptCB>", subQuery);
        AliasExceptCB cb = new AliasExceptCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "EXCEPT_ID", "EXCEPT_ID", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(AliasExceptCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<AliasExceptCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<AliasExceptCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<AliasExceptCB>(new HpQDRSetupper<AliasExceptCB>() {
            public void setup(String function, SubQuery<AliasExceptCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<AliasExceptCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<AliasExceptCB>", subQuery);
        AliasExceptCB cb = new AliasExceptCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "EXCEPT_ID", "EXCEPT_ID", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(AliasExceptCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<AliasExceptCB> subQuery) {
        assertObjectNotNull("subQuery<AliasExceptCB>", subQuery);
        AliasExceptCB cb = new AliasExceptCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(AliasExceptCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<AliasExceptCB> subQuery) {
        assertObjectNotNull("subQuery<AliasExceptCB>", subQuery);
        AliasExceptCB cb = new AliasExceptCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(AliasExceptCQ subQuery);

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCB() { return AliasExceptCB.class.getName(); }
    protected String xabCQ() { return AliasExceptCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
