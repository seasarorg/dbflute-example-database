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
 * The abstract condition-query of WHITE_TARGET.
 * @author oracleman
 */
public abstract class AbstractBsWhiteTargetCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteTargetCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "WHITE_TARGET";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * TARGET_ID: {PK, NotNull, NUMBER(16)}
     * @param targetId The value of targetId as equal. (NullAllowed: if null, no condition)
     */
    public void setTargetId_Equal(Long targetId) {
        doSetTargetId_Equal(targetId);
    }

    protected void doSetTargetId_Equal(Long targetId) {
        regTargetId(CK_EQ, targetId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TARGET_ID: {PK, NotNull, NUMBER(16)}
     * @param targetId The value of targetId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setTargetId_GreaterThan(Long targetId) {
        regTargetId(CK_GT, targetId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TARGET_ID: {PK, NotNull, NUMBER(16)}
     * @param targetId The value of targetId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setTargetId_LessThan(Long targetId) {
        regTargetId(CK_LT, targetId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TARGET_ID: {PK, NotNull, NUMBER(16)}
     * @param targetId The value of targetId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setTargetId_GreaterEqual(Long targetId) {
        regTargetId(CK_GE, targetId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TARGET_ID: {PK, NotNull, NUMBER(16)}
     * @param targetId The value of targetId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setTargetId_LessEqual(Long targetId) {
        regTargetId(CK_LE, targetId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * TARGET_ID: {PK, NotNull, NUMBER(16)}
     * @param minNumber The min number of targetId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of targetId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTargetId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueTargetId(), "TARGET_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * TARGET_ID: {PK, NotNull, NUMBER(16)}
     * @param targetIdList The collection of targetId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTargetId_InScope(Collection<Long> targetIdList) {
        doSetTargetId_InScope(targetIdList);
    }

    protected void doSetTargetId_InScope(Collection<Long> targetIdList) {
        regINS(CK_INS, cTL(targetIdList), getCValueTargetId(), "TARGET_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * TARGET_ID: {PK, NotNull, NUMBER(16)}
     * @param targetIdList The collection of targetId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTargetId_NotInScope(Collection<Long> targetIdList) {
        doSetTargetId_NotInScope(targetIdList);
    }

    protected void doSetTargetId_NotInScope(Collection<Long> targetIdList) {
        regINS(CK_NINS, cTL(targetIdList), getCValueTargetId(), "TARGET_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br />
     * {exists (select TARGET_ID from WHITE_REF_TARGET where ...)} <br />
     * WHITE_REF_TARGET by TARGET_ID, named 'whiteRefTargetAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">existsWhiteRefTargetList</span>(new SubQuery&lt;WhiteRefTargetCB&gt;() {
     *     public void query(WhiteRefTargetCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of WhiteRefTargetList for 'exists'. (NotNull)
     */
    public void existsWhiteRefTargetList(SubQuery<WhiteRefTargetCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteRefTargetCB cb = new WhiteRefTargetCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepTargetId_ExistsReferrer_WhiteRefTargetList(cb.query());
        registerExistsReferrer(cb.query(), "TARGET_ID", "TARGET_ID", pp, "whiteRefTargetList");
    }
    public abstract String keepTargetId_ExistsReferrer_WhiteRefTargetList(WhiteRefTargetCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select TARGET_ID from WHITE_REF_TARGET where ...)} <br />
     * WHITE_REF_TARGET by TARGET_ID, named 'whiteRefTargetAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">notExistsWhiteRefTargetList</span>(new SubQuery&lt;WhiteRefTargetCB&gt;() {
     *     public void query(WhiteRefTargetCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of TargetId_NotExistsReferrer_WhiteRefTargetList for 'not exists'. (NotNull)
     */
    public void notExistsWhiteRefTargetList(SubQuery<WhiteRefTargetCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteRefTargetCB cb = new WhiteRefTargetCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepTargetId_NotExistsReferrer_WhiteRefTargetList(cb.query());
        registerNotExistsReferrer(cb.query(), "TARGET_ID", "TARGET_ID", pp, "whiteRefTargetList");
    }
    public abstract String keepTargetId_NotExistsReferrer_WhiteRefTargetList(WhiteRefTargetCQ sq);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select TARGET_ID from WHITE_REF_TARGET where ...)} <br />
     * WHITE_REF_TARGET by TARGET_ID, named 'whiteRefTargetAsOne'.
     * @param subQuery The sub-query of WhiteRefTargetList for 'in-scope'. (NotNull)
     */
    public void inScopeWhiteRefTargetList(SubQuery<WhiteRefTargetCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteRefTargetCB cb = new WhiteRefTargetCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepTargetId_InScopeRelation_WhiteRefTargetList(cb.query());
        registerInScopeRelation(cb.query(), "TARGET_ID", "TARGET_ID", pp, "whiteRefTargetList");
    }
    public abstract String keepTargetId_InScopeRelation_WhiteRefTargetList(WhiteRefTargetCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select TARGET_ID from WHITE_REF_TARGET where ...)} <br />
     * WHITE_REF_TARGET by TARGET_ID, named 'whiteRefTargetAsOne'.
     * @param subQuery The sub-query of WhiteRefTargetList for 'not in-scope'. (NotNull)
     */
    public void notInScopeWhiteRefTargetList(SubQuery<WhiteRefTargetCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteRefTargetCB cb = new WhiteRefTargetCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepTargetId_NotInScopeRelation_WhiteRefTargetList(cb.query());
        registerNotInScopeRelation(cb.query(), "TARGET_ID", "TARGET_ID", pp, "whiteRefTargetList");
    }
    public abstract String keepTargetId_NotInScopeRelation_WhiteRefTargetList(WhiteRefTargetCQ sq);

    public void xsderiveWhiteRefTargetList(String fn, SubQuery<WhiteRefTargetCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteRefTargetCB cb = new WhiteRefTargetCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepTargetId_SpecifyDerivedReferrer_WhiteRefTargetList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "TARGET_ID", "TARGET_ID", pp, "whiteRefTargetList", al, op);
    }
    public abstract String keepTargetId_SpecifyDerivedReferrer_WhiteRefTargetList(WhiteRefTargetCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from WHITE_REF_TARGET where ...)} <br />
     * WHITE_REF_TARGET by TARGET_ID, named 'whiteRefTargetAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">derivedWhiteRefTargetList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;WhiteRefTargetCB&gt;() {
     *     public void query(WhiteRefTargetCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #DD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WhiteRefTargetCB> derivedWhiteRefTargetList() {
        return xcreateQDRFunctionWhiteRefTargetList();
    }
    protected HpQDRFunction<WhiteRefTargetCB> xcreateQDRFunctionWhiteRefTargetList() {
        return new HpQDRFunction<WhiteRefTargetCB>(new HpQDRSetupper<WhiteRefTargetCB>() {
            public void setup(String fn, SubQuery<WhiteRefTargetCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveWhiteRefTargetList(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveWhiteRefTargetList(String fn, SubQuery<WhiteRefTargetCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteRefTargetCB cb = new WhiteRefTargetCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String sqpp = keepTargetId_QueryDerivedReferrer_WhiteRefTargetList(cb.query()); String prpp = keepTargetId_QueryDerivedReferrer_WhiteRefTargetListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "TARGET_ID", "TARGET_ID", sqpp, "whiteRefTargetList", rd, vl, prpp, op);
    }
    public abstract String keepTargetId_QueryDerivedReferrer_WhiteRefTargetList(WhiteRefTargetCQ sq);
    public abstract String keepTargetId_QueryDerivedReferrer_WhiteRefTargetListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TARGET_ID: {PK, NotNull, NUMBER(16)}
     */
    public void setTargetId_IsNull() { regTargetId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TARGET_ID: {PK, NotNull, NUMBER(16)}
     */
    public void setTargetId_IsNotNull() { regTargetId(CK_ISNN, DOBJ); }

    protected void regTargetId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTargetId(), "TARGET_ID"); }
    protected abstract ConditionValue getCValueTargetId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TARGET_NAME: {VARCHAR2(256)}
     * @param targetName The value of targetName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setTargetName_Equal(String targetName) {
        doSetTargetName_Equal(fRES(targetName));
    }

    protected void doSetTargetName_Equal(String targetName) {
        regTargetName(CK_EQ, targetName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TARGET_NAME: {VARCHAR2(256)}
     * @param targetName The value of targetName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTargetName_NotEqual(String targetName) {
        doSetTargetName_NotEqual(fRES(targetName));
    }

    protected void doSetTargetName_NotEqual(String targetName) {
        regTargetName(CK_NES, targetName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * TARGET_NAME: {VARCHAR2(256)}
     * @param targetNameList The collection of targetName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTargetName_InScope(Collection<String> targetNameList) {
        doSetTargetName_InScope(targetNameList);
    }

    public void doSetTargetName_InScope(Collection<String> targetNameList) {
        regINS(CK_INS, cTL(targetNameList), getCValueTargetName(), "TARGET_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * TARGET_NAME: {VARCHAR2(256)}
     * @param targetNameList The collection of targetName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTargetName_NotInScope(Collection<String> targetNameList) {
        doSetTargetName_NotInScope(targetNameList);
    }

    public void doSetTargetName_NotInScope(Collection<String> targetNameList) {
        regINS(CK_NINS, cTL(targetNameList), getCValueTargetName(), "TARGET_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TARGET_NAME: {VARCHAR2(256)}
     * @param targetName The value of targetName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setTargetName_PrefixSearch(String targetName) {
        setTargetName_LikeSearch(targetName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TARGET_NAME: {VARCHAR2(256)} <br />
     * <pre>e.g. setTargetName_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param targetName The value of targetName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTargetName_LikeSearch(String targetName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(targetName), getCValueTargetName(), "TARGET_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TARGET_NAME: {VARCHAR2(256)}
     * @param targetName The value of targetName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTargetName_NotLikeSearch(String targetName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(targetName), getCValueTargetName(), "TARGET_NAME", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TARGET_NAME: {VARCHAR2(256)}
     */
    public void setTargetName_IsNull() { regTargetName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * TARGET_NAME: {VARCHAR2(256)}
     */
    public void setTargetName_IsNullOrEmpty() { regTargetName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TARGET_NAME: {VARCHAR2(256)}
     */
    public void setTargetName_IsNotNull() { regTargetName(CK_ISNN, DOBJ); }

    protected void regTargetName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTargetName(), "TARGET_NAME"); }
    protected abstract ConditionValue getCValueTargetName();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteTargetCB&gt;() {
     *     public void query(WhiteTargetCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteTargetCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand(), WhiteTargetCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteTargetCB&gt;() {
     *     public void query(WhiteTargetCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteTargetCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand(), WhiteTargetCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteTargetCB&gt;() {
     *     public void query(WhiteTargetCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteTargetCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand(), WhiteTargetCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteTargetCB&gt;() {
     *     public void query(WhiteTargetCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteTargetCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand(), WhiteTargetCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteTargetCB&gt;() {
     *     public void query(WhiteTargetCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteTargetCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand(), WhiteTargetCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteTargetCB&gt;() {
     *     public void query(WhiteTargetCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteTargetCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand(), WhiteTargetCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WhiteTargetCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhiteTargetCQ sq);

    protected WhiteTargetCB xcreateScalarConditionCB() {
        WhiteTargetCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteTargetCB xcreateScalarConditionPartitionByCB() {
        WhiteTargetCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteTargetCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteTargetCB cb = new WhiteTargetCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "TARGET_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteTargetCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteTargetCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteTargetCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteTargetCB cb = new WhiteTargetCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "TARGET_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteTargetCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteTargetCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteTargetCB cb = new WhiteTargetCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteTargetCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteTargetCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteTargetCB cb = new WhiteTargetCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(WhiteTargetCQ sq);

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
    //                                                                          Compatible
    //                                                                          ==========
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

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected WhiteTargetCB newMyCB() {
        return new WhiteTargetCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return WhiteTargetCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
