package com.example.dbflute.oracle.dbflute.cbean.cq.bs;

import java.util.*;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.dbmeta.DBMetaProvider;
import com.example.dbflute.oracle.dbflute.allcommon.*;
import com.example.dbflute.oracle.dbflute.cbean.*;
import com.example.dbflute.oracle.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of SYNONYM_EXCEPT.
 * @author oracleman
 */
public abstract class AbstractBsSynonymExceptCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsSynonymExceptCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "SYNONYM_EXCEPT";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * EXCEPT_ID: {PK, NotNull, NUMBER(16)}
     * @param exceptId The value of exceptId as equal. (NullAllowed: if null, no condition)
     */
    public void setExceptId_Equal(Long exceptId) {
        doSetExceptId_Equal(exceptId);
    }

    protected void doSetExceptId_Equal(Long exceptId) {
        regExceptId(CK_EQ, exceptId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * EXCEPT_ID: {PK, NotNull, NUMBER(16)}
     * @param exceptId The value of exceptId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setExceptId_GreaterThan(Long exceptId) {
        regExceptId(CK_GT, exceptId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * EXCEPT_ID: {PK, NotNull, NUMBER(16)}
     * @param exceptId The value of exceptId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setExceptId_LessThan(Long exceptId) {
        regExceptId(CK_LT, exceptId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * EXCEPT_ID: {PK, NotNull, NUMBER(16)}
     * @param exceptId The value of exceptId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setExceptId_GreaterEqual(Long exceptId) {
        regExceptId(CK_GE, exceptId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * EXCEPT_ID: {PK, NotNull, NUMBER(16)}
     * @param exceptId The value of exceptId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setExceptId_LessEqual(Long exceptId) {
        regExceptId(CK_LE, exceptId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * EXCEPT_ID: {PK, NotNull, NUMBER(16)}
     * @param minNumber The min number of exceptId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of exceptId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setExceptId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueExceptId(), "EXCEPT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * EXCEPT_ID: {PK, NotNull, NUMBER(16)}
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
     * EXCEPT_ID: {PK, NotNull, NUMBER(16)}
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
     * {exists (select EXCEPT_ID from SYNONYM_REF_EXCEPT where ...)} <br />
     * SYNONYM_REF_EXCEPT by EXCEPT_ID, named 'synonymRefExceptAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsSynonymRefExceptList</span>(new SubQuery&lt;SynonymRefExceptCB&gt;() {
     *     public void query(SynonymRefExceptCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of SynonymRefExceptList for 'exists'. (NotNull)
     */
    public void existsSynonymRefExceptList(SubQuery<SynonymRefExceptCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        SynonymRefExceptCB cb = new SynonymRefExceptCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String pp = keepExceptId_ExistsReferrer_SynonymRefExceptList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "EXCEPT_ID", "EXCEPT_ID", pp, "synonymRefExceptList");
    }
    public abstract String keepExceptId_ExistsReferrer_SynonymRefExceptList(SynonymRefExceptCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select EXCEPT_ID from SYNONYM_REF_EXCEPT where ...)} <br />
     * SYNONYM_REF_EXCEPT by EXCEPT_ID, named 'synonymRefExceptAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsSynonymRefExceptList</span>(new SubQuery&lt;SynonymRefExceptCB&gt;() {
     *     public void query(SynonymRefExceptCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of ExceptId_NotExistsReferrer_SynonymRefExceptList for 'not exists'. (NotNull)
     */
    public void notExistsSynonymRefExceptList(SubQuery<SynonymRefExceptCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        SynonymRefExceptCB cb = new SynonymRefExceptCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String pp = keepExceptId_NotExistsReferrer_SynonymRefExceptList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "EXCEPT_ID", "EXCEPT_ID", pp, "synonymRefExceptList");
    }
    public abstract String keepExceptId_NotExistsReferrer_SynonymRefExceptList(SynonymRefExceptCQ sq);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select EXCEPT_ID from SYNONYM_REF_EXCEPT where ...)} <br />
     * SYNONYM_REF_EXCEPT by EXCEPT_ID, named 'synonymRefExceptAsOne'.
     * @param subQuery The sub-query of SynonymRefExceptList for 'in-scope'. (NotNull)
     */
    public void inScopeSynonymRefExceptList(SubQuery<SynonymRefExceptCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        SynonymRefExceptCB cb = new SynonymRefExceptCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepExceptId_InScopeRelation_SynonymRefExceptList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "EXCEPT_ID", "EXCEPT_ID", pp, "synonymRefExceptList");
    }
    public abstract String keepExceptId_InScopeRelation_SynonymRefExceptList(SynonymRefExceptCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select EXCEPT_ID from SYNONYM_REF_EXCEPT where ...)} <br />
     * SYNONYM_REF_EXCEPT by EXCEPT_ID, named 'synonymRefExceptAsOne'.
     * @param subQuery The sub-query of SynonymRefExceptList for 'not in-scope'. (NotNull)
     */
    public void notInScopeSynonymRefExceptList(SubQuery<SynonymRefExceptCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        SynonymRefExceptCB cb = new SynonymRefExceptCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepExceptId_NotInScopeRelation_SynonymRefExceptList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "EXCEPT_ID", "EXCEPT_ID", pp, "synonymRefExceptList");
    }
    public abstract String keepExceptId_NotInScopeRelation_SynonymRefExceptList(SynonymRefExceptCQ sq);

    public void xsderiveSynonymRefExceptList(String fn, SubQuery<SynonymRefExceptCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        SynonymRefExceptCB cb = new SynonymRefExceptCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String pp = keepExceptId_SpecifyDerivedReferrer_SynonymRefExceptList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(fn, cb.query(), "EXCEPT_ID", "EXCEPT_ID", pp, "synonymRefExceptList", al, op);
    }
    public abstract String keepExceptId_SpecifyDerivedReferrer_SynonymRefExceptList(SynonymRefExceptCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from SYNONYM_REF_EXCEPT where ...)} <br />
     * SYNONYM_REF_EXCEPT by EXCEPT_ID, named 'synonymRefExceptAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">derivedSynonymRefExceptList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;SynonymRefExceptCB&gt;() {
     *     public void query(SynonymRefExceptCB subCB) {
     *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #FD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<SynonymRefExceptCB> derivedSynonymRefExceptList() {
        return xcreateQDRFunctionSynonymRefExceptList();
    }
    protected HpQDRFunction<SynonymRefExceptCB> xcreateQDRFunctionSynonymRefExceptList() {
        return new HpQDRFunction<SynonymRefExceptCB>(new HpQDRSetupper<SynonymRefExceptCB>() {
            public void setup(String fn, SubQuery<SynonymRefExceptCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveSynonymRefExceptList(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveSynonymRefExceptList(String fn, SubQuery<SynonymRefExceptCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        SynonymRefExceptCB cb = new SynonymRefExceptCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String sqpp = keepExceptId_QueryDerivedReferrer_SynonymRefExceptList(cb.query()); // for saving query-value.
        String prpp = keepExceptId_QueryDerivedReferrer_SynonymRefExceptListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "EXCEPT_ID", "EXCEPT_ID", sqpp, "synonymRefExceptList", rd, vl, prpp, op);
    }
    public abstract String keepExceptId_QueryDerivedReferrer_SynonymRefExceptList(SynonymRefExceptCQ sq);
    public abstract String keepExceptId_QueryDerivedReferrer_SynonymRefExceptListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * EXCEPT_ID: {PK, NotNull, NUMBER(16)}
     */
    public void setExceptId_IsNull() { regExceptId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * EXCEPT_ID: {PK, NotNull, NUMBER(16)}
     */
    public void setExceptId_IsNotNull() { regExceptId(CK_ISNN, DOBJ); }

    protected void regExceptId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueExceptId(), "EXCEPT_ID"); }
    protected abstract ConditionValue getCValueExceptId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * EXCEPT_NAME: {VARCHAR2(256)}
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
     * EXCEPT_NAME: {VARCHAR2(256)}
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
     * EXCEPT_NAME: {VARCHAR2(256)}
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
     * EXCEPT_NAME: {VARCHAR2(256)}
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
     * EXCEPT_NAME: {VARCHAR2(256)}
     * @param exceptName The value of exceptName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setExceptName_PrefixSearch(String exceptName) {
        setExceptName_LikeSearch(exceptName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * EXCEPT_NAME: {VARCHAR2(256)} <br />
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
     * EXCEPT_NAME: {VARCHAR2(256)}
     * @param exceptName The value of exceptName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setExceptName_NotLikeSearch(String exceptName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(exceptName), getCValueExceptName(), "EXCEPT_NAME", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * EXCEPT_NAME: {VARCHAR2(256)}
     */
    public void setExceptName_IsNull() { regExceptName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * EXCEPT_NAME: {VARCHAR2(256)}
     */
    public void setExceptName_IsNullOrEmpty() { regExceptName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * EXCEPT_NAME: {VARCHAR2(256)}
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
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;SynonymExceptCB&gt;() {
     *     public void query(SynonymExceptCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<SynonymExceptCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand(), SynonymExceptCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;SynonymExceptCB&gt;() {
     *     public void query(SynonymExceptCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<SynonymExceptCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand(), SynonymExceptCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;SynonymExceptCB&gt;() {
     *     public void query(SynonymExceptCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<SynonymExceptCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand(), SynonymExceptCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;SynonymExceptCB&gt;() {
     *     public void query(SynonymExceptCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<SynonymExceptCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand(), SynonymExceptCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;SynonymExceptCB&gt;() {
     *     public void query(SynonymExceptCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<SynonymExceptCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand(), SynonymExceptCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;SynonymExceptCB&gt;() {
     *     public void query(SynonymExceptCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<SynonymExceptCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand(), SynonymExceptCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        SynonymExceptCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(SynonymExceptCQ sq);

    protected SynonymExceptCB xcreateScalarConditionCB() {
        SynonymExceptCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected SynonymExceptCB xcreateScalarConditionPartitionByCB() {
        SynonymExceptCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<SynonymExceptCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        SynonymExceptCB cb = new SynonymExceptCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String pk = "EXCEPT_ID";
        String pp = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(SynonymExceptCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<SynonymExceptCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(SynonymExceptCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        SynonymExceptCB cb = new SynonymExceptCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "EXCEPT_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(SynonymExceptCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<SynonymExceptCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        SynonymExceptCB cb = new SynonymExceptCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String pp = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(SynonymExceptCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<SynonymExceptCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        SynonymExceptCB cb = new SynonymExceptCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String pp = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(SynonymExceptCQ sq);

    // ===================================================================================
    //                                                                    Full Text Search
    //                                                                    ================
    /**
     * Match for full-text search. <br />
     * @param textColumn The text column. (NotNull, StringColumn, TargetTableColumn)
     * @param conditionValue The condition value. (NullAllowed: if null or empty, no condition)
     */
    public void match(org.seasar.dbflute.dbmeta.info.ColumnInfo textColumn, String conditionValue) {
        assertObjectNotNull("textColumn", textColumn);
        match(newArrayList(textColumn), conditionValue);
    }

    /**
     * Match for full-text search. <br />
     * The specified condition value is escaped in this method automatically.
     * @param textColumnList The list of text column. (NotNull, NotEmpty, StringColumn, TargetTableColumn)
     * @param conditionValue The condition value. (NullAllowed: if null or empty, no condition)
     */
    public void match(List<org.seasar.dbflute.dbmeta.info.ColumnInfo> textColumnList, String conditionValue) {
        xdoMatchByLikeSearch(textColumnList, conditionValue);
    }

    @Override
    protected String xescapeFullTextSearchValue(String conditionValue) {
        return xescapeOracleFullTextSearchValue(conditionValue);
    }

    @Override
    protected LikeSearchOption xcreateMatchLikeSearch() {
        return new OracleMatchLikeSearch();
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected SynonymExceptCB newMyCB() {
        return new SynonymExceptCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return SynonymExceptCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
