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
 * The abstract condition-query of WHITE_REF_TARGET.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteRefTargetCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteRefTargetCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "WHITE_REF_TARGET";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_TARGET_ID: {PK, NotNull, DECIMAL(16)}
     * @param refTargetId The value of refTargetId as equal. (NullAllowed: if null, no condition)
     */
    public void setRefTargetId_Equal(Long refTargetId) {
        doSetRefTargetId_Equal(refTargetId);
    }

    protected void doSetRefTargetId_Equal(Long refTargetId) {
        regRefTargetId(CK_EQ, refTargetId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_TARGET_ID: {PK, NotNull, DECIMAL(16)}
     * @param refTargetId The value of refTargetId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setRefTargetId_NotEqual(Long refTargetId) {
        doSetRefTargetId_NotEqual(refTargetId);
    }

    protected void doSetRefTargetId_NotEqual(Long refTargetId) {
        regRefTargetId(CK_NES, refTargetId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_TARGET_ID: {PK, NotNull, DECIMAL(16)}
     * @param refTargetId The value of refTargetId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setRefTargetId_GreaterThan(Long refTargetId) {
        regRefTargetId(CK_GT, refTargetId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_TARGET_ID: {PK, NotNull, DECIMAL(16)}
     * @param refTargetId The value of refTargetId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setRefTargetId_LessThan(Long refTargetId) {
        regRefTargetId(CK_LT, refTargetId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_TARGET_ID: {PK, NotNull, DECIMAL(16)}
     * @param refTargetId The value of refTargetId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setRefTargetId_GreaterEqual(Long refTargetId) {
        regRefTargetId(CK_GE, refTargetId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_TARGET_ID: {PK, NotNull, DECIMAL(16)}
     * @param refTargetId The value of refTargetId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setRefTargetId_LessEqual(Long refTargetId) {
        regRefTargetId(CK_LE, refTargetId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * REF_TARGET_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of refTargetId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of refTargetId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRefTargetId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueRefTargetId(), "REF_TARGET_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * REF_TARGET_ID: {PK, NotNull, DECIMAL(16)}
     * @param refTargetIdList The collection of refTargetId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRefTargetId_InScope(Collection<Long> refTargetIdList) {
        doSetRefTargetId_InScope(refTargetIdList);
    }

    protected void doSetRefTargetId_InScope(Collection<Long> refTargetIdList) {
        regINS(CK_INS, cTL(refTargetIdList), getCValueRefTargetId(), "REF_TARGET_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * REF_TARGET_ID: {PK, NotNull, DECIMAL(16)}
     * @param refTargetIdList The collection of refTargetId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRefTargetId_NotInScope(Collection<Long> refTargetIdList) {
        doSetRefTargetId_NotInScope(refTargetIdList);
    }

    protected void doSetRefTargetId_NotInScope(Collection<Long> refTargetIdList) {
        regINS(CK_NINS, cTL(refTargetIdList), getCValueRefTargetId(), "REF_TARGET_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * REF_TARGET_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setRefTargetId_IsNull() { regRefTargetId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * REF_TARGET_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setRefTargetId_IsNotNull() { regRefTargetId(CK_ISNN, DOBJ); }

    protected void regRefTargetId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueRefTargetId(), "REF_TARGET_ID"); }
    protected abstract ConditionValue getCValueRefTargetId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * TARGET_ID: {NotNull, DECIMAL(16), FK to WHITE_TARGET}
     * @param targetId The value of targetId as equal. (NullAllowed: if null, no condition)
     */
    public void setTargetId_Equal(Long targetId) {
        doSetTargetId_Equal(targetId);
    }

    protected void doSetTargetId_Equal(Long targetId) {
        regTargetId(CK_EQ, targetId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TARGET_ID: {NotNull, DECIMAL(16), FK to WHITE_TARGET}
     * @param targetId The value of targetId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setTargetId_NotEqual(Long targetId) {
        doSetTargetId_NotEqual(targetId);
    }

    protected void doSetTargetId_NotEqual(Long targetId) {
        regTargetId(CK_NES, targetId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TARGET_ID: {NotNull, DECIMAL(16), FK to WHITE_TARGET}
     * @param targetId The value of targetId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setTargetId_GreaterThan(Long targetId) {
        regTargetId(CK_GT, targetId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TARGET_ID: {NotNull, DECIMAL(16), FK to WHITE_TARGET}
     * @param targetId The value of targetId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setTargetId_LessThan(Long targetId) {
        regTargetId(CK_LT, targetId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TARGET_ID: {NotNull, DECIMAL(16), FK to WHITE_TARGET}
     * @param targetId The value of targetId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setTargetId_GreaterEqual(Long targetId) {
        regTargetId(CK_GE, targetId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TARGET_ID: {NotNull, DECIMAL(16), FK to WHITE_TARGET}
     * @param targetId The value of targetId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setTargetId_LessEqual(Long targetId) {
        regTargetId(CK_LE, targetId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * TARGET_ID: {NotNull, DECIMAL(16), FK to WHITE_TARGET}
     * @param minNumber The min number of targetId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of targetId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTargetId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueTargetId(), "TARGET_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * TARGET_ID: {NotNull, DECIMAL(16), FK to WHITE_TARGET}
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
     * TARGET_ID: {NotNull, DECIMAL(16), FK to WHITE_TARGET}
     * @param targetIdList The collection of targetId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTargetId_NotInScope(Collection<Long> targetIdList) {
        doSetTargetId_NotInScope(targetIdList);
    }

    protected void doSetTargetId_NotInScope(Collection<Long> targetIdList) {
        regINS(CK_NINS, cTL(targetIdList), getCValueTargetId(), "TARGET_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select TARGET_ID from WHITE_TARGET where ...)} <br />
     * WHITE_TARGET by my TARGET_ID, named 'whiteTarget'.
     * @param subQuery The sub-query of WhiteTarget for 'in-scope'. (NotNull)
     */
    public void inScopeWhiteTarget(SubQuery<WhiteTargetCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteTargetCB cb = new WhiteTargetCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepTargetId_InScopeRelation_WhiteTarget(cb.query());
        registerInScopeRelation(cb.query(), "TARGET_ID", "TARGET_ID", pp, "whiteTarget");
    }
    public abstract String keepTargetId_InScopeRelation_WhiteTarget(WhiteTargetCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select TARGET_ID from WHITE_TARGET where ...)} <br />
     * WHITE_TARGET by my TARGET_ID, named 'whiteTarget'.
     * @param subQuery The sub-query of WhiteTarget for 'not in-scope'. (NotNull)
     */
    public void notInScopeWhiteTarget(SubQuery<WhiteTargetCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteTargetCB cb = new WhiteTargetCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepTargetId_NotInScopeRelation_WhiteTarget(cb.query());
        registerNotInScopeRelation(cb.query(), "TARGET_ID", "TARGET_ID", pp, "whiteTarget");
    }
    public abstract String keepTargetId_NotInScopeRelation_WhiteTarget(WhiteTargetCQ sq);

    protected void regTargetId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTargetId(), "TARGET_ID"); }
    protected abstract ConditionValue getCValueTargetId();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteRefTargetCB&gt;() {
     *     public void query(WhiteRefTargetCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteRefTargetCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand(), WhiteRefTargetCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteRefTargetCB&gt;() {
     *     public void query(WhiteRefTargetCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteRefTargetCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand(), WhiteRefTargetCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteRefTargetCB&gt;() {
     *     public void query(WhiteRefTargetCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteRefTargetCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand(), WhiteRefTargetCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteRefTargetCB&gt;() {
     *     public void query(WhiteRefTargetCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteRefTargetCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand(), WhiteRefTargetCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteRefTargetCB&gt;() {
     *     public void query(WhiteRefTargetCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteRefTargetCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand(), WhiteRefTargetCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteRefTargetCB&gt;() {
     *     public void query(WhiteRefTargetCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteRefTargetCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand(), WhiteRefTargetCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WhiteRefTargetCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhiteRefTargetCQ sq);

    protected WhiteRefTargetCB xcreateScalarConditionCB() {
        WhiteRefTargetCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteRefTargetCB xcreateScalarConditionPartitionByCB() {
        WhiteRefTargetCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteRefTargetCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteRefTargetCB cb = new WhiteRefTargetCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "REF_TARGET_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteRefTargetCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteRefTargetCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteRefTargetCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteRefTargetCB cb = new WhiteRefTargetCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "REF_TARGET_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteRefTargetCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteRefTargetCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteRefTargetCB cb = new WhiteRefTargetCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteRefTargetCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteRefTargetCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteRefTargetCB cb = new WhiteRefTargetCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(WhiteRefTargetCQ sq);

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
    protected WhiteRefTargetCB newMyCB() {
        return new WhiteRefTargetCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return WhiteRefTargetCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
