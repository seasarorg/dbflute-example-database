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
    public AbstractBsAliasExceptCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
     * Set up ExistsReferrer (correlated sub-query). <br />
     * {exists (select EXCEPT_ID from ALIAS_REF_EXCEPT where ...)} <br />
     * ALIAS_REF_EXCEPT by EXCEPT_ID, named 'aliasRefExceptAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">existsAliasRefExceptList</span>(new SubQuery&lt;AliasRefExceptCB&gt;() {
     *     public void query(AliasRefExceptCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of AliasRefExceptList for 'exists'. (NotNull)
     */
    public void existsAliasRefExceptList(SubQuery<AliasRefExceptCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        AliasRefExceptCB cb = new AliasRefExceptCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepExceptId_ExistsReferrer_AliasRefExceptList(cb.query());
        registerExistsReferrer(cb.query(), "EXCEPT_ID", "EXCEPT_ID", pp, "aliasRefExceptList");
    }
    public abstract String keepExceptId_ExistsReferrer_AliasRefExceptList(AliasRefExceptCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select EXCEPT_ID from ALIAS_REF_EXCEPT where ...)} <br />
     * ALIAS_REF_EXCEPT by EXCEPT_ID, named 'aliasRefExceptAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">notExistsAliasRefExceptList</span>(new SubQuery&lt;AliasRefExceptCB&gt;() {
     *     public void query(AliasRefExceptCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of ExceptId_NotExistsReferrer_AliasRefExceptList for 'not exists'. (NotNull)
     */
    public void notExistsAliasRefExceptList(SubQuery<AliasRefExceptCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        AliasRefExceptCB cb = new AliasRefExceptCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepExceptId_NotExistsReferrer_AliasRefExceptList(cb.query());
        registerNotExistsReferrer(cb.query(), "EXCEPT_ID", "EXCEPT_ID", pp, "aliasRefExceptList");
    }
    public abstract String keepExceptId_NotExistsReferrer_AliasRefExceptList(AliasRefExceptCQ sq);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select EXCEPT_ID from ALIAS_REF_EXCEPT where ...)} <br />
     * ALIAS_REF_EXCEPT by EXCEPT_ID, named 'aliasRefExceptAsOne'.
     * @param subQuery The sub-query of AliasRefExceptList for 'in-scope'. (NotNull)
     */
    public void inScopeAliasRefExceptList(SubQuery<AliasRefExceptCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        AliasRefExceptCB cb = new AliasRefExceptCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepExceptId_InScopeRelation_AliasRefExceptList(cb.query());
        registerInScopeRelation(cb.query(), "EXCEPT_ID", "EXCEPT_ID", pp, "aliasRefExceptList");
    }
    public abstract String keepExceptId_InScopeRelation_AliasRefExceptList(AliasRefExceptCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select EXCEPT_ID from ALIAS_REF_EXCEPT where ...)} <br />
     * ALIAS_REF_EXCEPT by EXCEPT_ID, named 'aliasRefExceptAsOne'.
     * @param subQuery The sub-query of AliasRefExceptList for 'not in-scope'. (NotNull)
     */
    public void notInScopeAliasRefExceptList(SubQuery<AliasRefExceptCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        AliasRefExceptCB cb = new AliasRefExceptCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepExceptId_NotInScopeRelation_AliasRefExceptList(cb.query());
        registerNotInScopeRelation(cb.query(), "EXCEPT_ID", "EXCEPT_ID", pp, "aliasRefExceptList");
    }
    public abstract String keepExceptId_NotInScopeRelation_AliasRefExceptList(AliasRefExceptCQ sq);

    public void xsderiveAliasRefExceptList(String fn, SubQuery<AliasRefExceptCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        AliasRefExceptCB cb = new AliasRefExceptCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepExceptId_SpecifyDerivedReferrer_AliasRefExceptList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "EXCEPT_ID", "EXCEPT_ID", pp, "aliasRefExceptList", al, op);
    }
    public abstract String keepExceptId_SpecifyDerivedReferrer_AliasRefExceptList(AliasRefExceptCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br />
     * {FOO &lt;= (select max(BAR) from ALIAS_REF_EXCEPT where ...)} <br />
     * ALIAS_REF_EXCEPT by EXCEPT_ID, named 'aliasRefExceptAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">derivedAliasRefExceptList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;AliasRefExceptCB&gt;() {
     *     public void query(AliasRefExceptCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #DD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<AliasRefExceptCB> derivedAliasRefExceptList() {
        return xcreateQDRFunctionAliasRefExceptList();
    }
    protected HpQDRFunction<AliasRefExceptCB> xcreateQDRFunctionAliasRefExceptList() {
        return new HpQDRFunction<AliasRefExceptCB>(new HpQDRSetupper<AliasRefExceptCB>() {
            public void setup(String fn, SubQuery<AliasRefExceptCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveAliasRefExceptList(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveAliasRefExceptList(String fn, SubQuery<AliasRefExceptCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        AliasRefExceptCB cb = new AliasRefExceptCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String sqpp = keepExceptId_QueryDerivedReferrer_AliasRefExceptList(cb.query()); String prpp = keepExceptId_QueryDerivedReferrer_AliasRefExceptListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "EXCEPT_ID", "EXCEPT_ID", sqpp, "aliasRefExceptList", rd, vl, prpp, op);
    }
    public abstract String keepExceptId_QueryDerivedReferrer_AliasRefExceptList(AliasRefExceptCQ sq);
    public abstract String keepExceptId_QueryDerivedReferrer_AliasRefExceptListParameter(Object vl);

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

    protected void regExceptId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueExceptId(), "EXCEPT_ID"); }
    protected abstract ConditionValue getCValueExceptId();

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
     * <pre>e.g. setExceptName_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
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

    protected void regExceptName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueExceptName(), "EXCEPT_NAME"); }
    protected abstract ConditionValue getCValueExceptName();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;AliasExceptCB&gt;() {
     *     public void query(AliasExceptCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<AliasExceptCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, AliasExceptCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;AliasExceptCB&gt;() {
     *     public void query(AliasExceptCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<AliasExceptCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, AliasExceptCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;AliasExceptCB&gt;() {
     *     public void query(AliasExceptCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<AliasExceptCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, AliasExceptCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;AliasExceptCB&gt;() {
     *     public void query(AliasExceptCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<AliasExceptCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, AliasExceptCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;AliasExceptCB&gt;() {
     *     public void query(AliasExceptCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<AliasExceptCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, AliasExceptCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;AliasExceptCB&gt;() {
     *     public void query(AliasExceptCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<AliasExceptCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, AliasExceptCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        AliasExceptCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(AliasExceptCQ sq);

    protected AliasExceptCB xcreateScalarConditionCB() {
        AliasExceptCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected AliasExceptCB xcreateScalarConditionPartitionByCB() {
        AliasExceptCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<AliasExceptCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        AliasExceptCB cb = new AliasExceptCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "EXCEPT_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(AliasExceptCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<AliasExceptCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(AliasExceptCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        AliasExceptCB cb = new AliasExceptCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "EXCEPT_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(AliasExceptCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<AliasExceptCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        AliasExceptCB cb = new AliasExceptCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(AliasExceptCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfInScope(SubQuery<AliasExceptCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        AliasExceptCB cb = new AliasExceptCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(AliasExceptCQ sq);

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
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
    //                                                                    Small Adjustment
    //                                                                    ================
    /**
     * Order along the list of manual values. #beforejava8 <br />
     * This function with Union is unsupported! <br />
     * The order values are bound (treated as bind parameter).
     * <pre>
     * MemberCB cb = new MemberCB();
     * List&lt;CDef.MemberStatus&gt; orderValueList = new ArrayList&lt;CDef.MemberStatus&gt;();
     * orderValueList.add(CDef.MemberStatus.Withdrawal);
     * orderValueList.add(CDef.MemberStatus.Formalized);
     * orderValueList.add(CDef.MemberStatus.Provisional);
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #DD4747">withManualOrder(orderValueList)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * @param orderValueList The list of order values for manual ordering. (NotNull)
     */
    public void withManualOrder(List<? extends Object> orderValueList) { // is user public!
        assertObjectNotNull("withManualOrder(orderValueList)", orderValueList);
        final ManualOrderBean manualOrderBean = new ManualOrderBean();
        manualOrderBean.acceptOrderValueList(orderValueList);
        withManualOrder(manualOrderBean);
    }

    @Override
    protected void filterFromToOption(FromToOption option) {
        option.allowOneSide();
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected AliasExceptCB newMyCB() {
        return new AliasExceptCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return AliasExceptCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
