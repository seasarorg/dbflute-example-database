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
 * The abstract condition-query of ALIAS_REF_EXCEPT.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsAliasRefExceptCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsAliasRefExceptCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "ALIAS_REF_EXCEPT";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_EXCEPT_ID: {PK, NotNull, DECIMAL(16)}
     * @param refExceptId The value of refExceptId as equal. (NullAllowed: if null, no condition)
     */
    public void setRefExceptId_Equal(Long refExceptId) {
        doSetRefExceptId_Equal(refExceptId);
    }

    protected void doSetRefExceptId_Equal(Long refExceptId) {
        regRefExceptId(CK_EQ, refExceptId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_EXCEPT_ID: {PK, NotNull, DECIMAL(16)}
     * @param refExceptId The value of refExceptId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setRefExceptId_NotEqual(Long refExceptId) {
        doSetRefExceptId_NotEqual(refExceptId);
    }

    protected void doSetRefExceptId_NotEqual(Long refExceptId) {
        regRefExceptId(CK_NES, refExceptId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_EXCEPT_ID: {PK, NotNull, DECIMAL(16)}
     * @param refExceptId The value of refExceptId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setRefExceptId_GreaterThan(Long refExceptId) {
        regRefExceptId(CK_GT, refExceptId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_EXCEPT_ID: {PK, NotNull, DECIMAL(16)}
     * @param refExceptId The value of refExceptId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setRefExceptId_LessThan(Long refExceptId) {
        regRefExceptId(CK_LT, refExceptId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_EXCEPT_ID: {PK, NotNull, DECIMAL(16)}
     * @param refExceptId The value of refExceptId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setRefExceptId_GreaterEqual(Long refExceptId) {
        regRefExceptId(CK_GE, refExceptId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_EXCEPT_ID: {PK, NotNull, DECIMAL(16)}
     * @param refExceptId The value of refExceptId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setRefExceptId_LessEqual(Long refExceptId) {
        regRefExceptId(CK_LE, refExceptId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * REF_EXCEPT_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of refExceptId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of refExceptId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRefExceptId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueRefExceptId(), "REF_EXCEPT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * REF_EXCEPT_ID: {PK, NotNull, DECIMAL(16)}
     * @param refExceptIdList The collection of refExceptId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRefExceptId_InScope(Collection<Long> refExceptIdList) {
        doSetRefExceptId_InScope(refExceptIdList);
    }

    protected void doSetRefExceptId_InScope(Collection<Long> refExceptIdList) {
        regINS(CK_INS, cTL(refExceptIdList), getCValueRefExceptId(), "REF_EXCEPT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * REF_EXCEPT_ID: {PK, NotNull, DECIMAL(16)}
     * @param refExceptIdList The collection of refExceptId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRefExceptId_NotInScope(Collection<Long> refExceptIdList) {
        doSetRefExceptId_NotInScope(refExceptIdList);
    }

    protected void doSetRefExceptId_NotInScope(Collection<Long> refExceptIdList) {
        regINS(CK_NINS, cTL(refExceptIdList), getCValueRefExceptId(), "REF_EXCEPT_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * REF_EXCEPT_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setRefExceptId_IsNull() { regRefExceptId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * REF_EXCEPT_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setRefExceptId_IsNotNull() { regRefExceptId(CK_ISNN, DOBJ); }

    protected void regRefExceptId(ConditionKey k, Object v) { regQ(k, v, getCValueRefExceptId(), "REF_EXCEPT_ID"); }
    abstract protected ConditionValue getCValueRefExceptId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * EXCEPT_ID: {NotNull, DECIMAL(16), FK to ALIAS_EXCEPT}
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
     * EXCEPT_ID: {NotNull, DECIMAL(16), FK to ALIAS_EXCEPT}
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
     * EXCEPT_ID: {NotNull, DECIMAL(16), FK to ALIAS_EXCEPT}
     * @param exceptId The value of exceptId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setExceptId_GreaterThan(Long exceptId) {
        regExceptId(CK_GT, exceptId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * EXCEPT_ID: {NotNull, DECIMAL(16), FK to ALIAS_EXCEPT}
     * @param exceptId The value of exceptId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setExceptId_LessThan(Long exceptId) {
        regExceptId(CK_LT, exceptId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * EXCEPT_ID: {NotNull, DECIMAL(16), FK to ALIAS_EXCEPT}
     * @param exceptId The value of exceptId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setExceptId_GreaterEqual(Long exceptId) {
        regExceptId(CK_GE, exceptId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * EXCEPT_ID: {NotNull, DECIMAL(16), FK to ALIAS_EXCEPT}
     * @param exceptId The value of exceptId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setExceptId_LessEqual(Long exceptId) {
        regExceptId(CK_LE, exceptId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * EXCEPT_ID: {NotNull, DECIMAL(16), FK to ALIAS_EXCEPT}
     * @param minNumber The min number of exceptId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of exceptId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setExceptId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueExceptId(), "EXCEPT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * EXCEPT_ID: {NotNull, DECIMAL(16), FK to ALIAS_EXCEPT}
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
     * EXCEPT_ID: {NotNull, DECIMAL(16), FK to ALIAS_EXCEPT}
     * @param exceptIdList The collection of exceptId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setExceptId_NotInScope(Collection<Long> exceptIdList) {
        doSetExceptId_NotInScope(exceptIdList);
    }

    protected void doSetExceptId_NotInScope(Collection<Long> exceptIdList) {
        regINS(CK_NINS, cTL(exceptIdList), getCValueExceptId(), "EXCEPT_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select EXCEPT_ID from ALIAS_EXCEPT where ...)} <br />
     * ALIAS_EXCEPT by my EXCEPT_ID, named 'aliasExcept'.
     * @param subQuery The sub-query of AliasExcept for 'in-scope'. (NotNull)
     */
    public void inScopeAliasExcept(SubQuery<AliasExceptCB> subQuery) {
        assertObjectNotNull("subQuery<AliasExceptCB>", subQuery);
        AliasExceptCB cb = new AliasExceptCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepExceptId_InScopeRelation_AliasExcept(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "EXCEPT_ID", "EXCEPT_ID", subQueryPropertyName, "aliasExcept");
    }
    public abstract String keepExceptId_InScopeRelation_AliasExcept(AliasExceptCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select EXCEPT_ID from ALIAS_EXCEPT where ...)} <br />
     * ALIAS_EXCEPT by my EXCEPT_ID, named 'aliasExcept'.
     * @param subQuery The sub-query of AliasExcept for 'not in-scope'. (NotNull)
     */
    public void notInScopeAliasExcept(SubQuery<AliasExceptCB> subQuery) {
        assertObjectNotNull("subQuery<AliasExceptCB>", subQuery);
        AliasExceptCB cb = new AliasExceptCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepExceptId_NotInScopeRelation_AliasExcept(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "EXCEPT_ID", "EXCEPT_ID", subQueryPropertyName, "aliasExcept");
    }
    public abstract String keepExceptId_NotInScopeRelation_AliasExcept(AliasExceptCQ subQuery);

    protected void regExceptId(ConditionKey k, Object v) { regQ(k, v, getCValueExceptId(), "EXCEPT_ID"); }
    abstract protected ConditionValue getCValueExceptId();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;AliasRefExceptCB&gt;() {
     *     public void query(AliasRefExceptCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<AliasRefExceptCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;AliasRefExceptCB&gt;() {
     *     public void query(AliasRefExceptCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<AliasRefExceptCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;AliasRefExceptCB&gt;() {
     *     public void query(AliasRefExceptCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<AliasRefExceptCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;AliasRefExceptCB&gt;() {
     *     public void query(AliasRefExceptCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<AliasRefExceptCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;AliasRefExceptCB&gt;() {
     *     public void query(AliasRefExceptCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<AliasRefExceptCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;AliasRefExceptCB&gt;() {
     *     public void query(AliasRefExceptCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<AliasRefExceptCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<AliasRefExceptCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<AliasRefExceptCB>(new HpSSQSetupper<AliasRefExceptCB>() {
            public void setup(String function, SubQuery<AliasRefExceptCB> subQuery, HpSSQOption<AliasRefExceptCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<AliasRefExceptCB> subQuery, String operand, HpSSQOption<AliasRefExceptCB> option) {
        assertObjectNotNull("subQuery<AliasRefExceptCB>", subQuery);
        AliasRefExceptCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(AliasRefExceptCQ subQuery);

    protected AliasRefExceptCB xcreateScalarConditionCB() {
        AliasRefExceptCB cb = new AliasRefExceptCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected AliasRefExceptCB xcreateScalarConditionPartitionByCB() {
        AliasRefExceptCB cb = new AliasRefExceptCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<AliasRefExceptCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<AliasRefExceptCB>", subQuery);
        AliasRefExceptCB cb = new AliasRefExceptCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "REF_EXCEPT_ID", "REF_EXCEPT_ID", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(AliasRefExceptCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<AliasRefExceptCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<AliasRefExceptCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<AliasRefExceptCB>(new HpQDRSetupper<AliasRefExceptCB>() {
            public void setup(String function, SubQuery<AliasRefExceptCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<AliasRefExceptCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<AliasRefExceptCB>", subQuery);
        AliasRefExceptCB cb = new AliasRefExceptCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "REF_EXCEPT_ID", "REF_EXCEPT_ID", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(AliasRefExceptCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<AliasRefExceptCB> subQuery) {
        assertObjectNotNull("subQuery<AliasRefExceptCB>", subQuery);
        AliasRefExceptCB cb = new AliasRefExceptCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(AliasRefExceptCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<AliasRefExceptCB> subQuery) {
        assertObjectNotNull("subQuery<AliasRefExceptCB>", subQuery);
        AliasRefExceptCB cb = new AliasRefExceptCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(AliasRefExceptCQ subQuery);

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCB() { return AliasRefExceptCB.class.getName(); }
    protected String xabCQ() { return AliasRefExceptCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
