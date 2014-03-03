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
 * The abstract condition-query of SYNONYM_REF_EXCEPT.
 * @author oracleman
 */
public abstract class AbstractBsSynonymRefExceptCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsSynonymRefExceptCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "SYNONYM_REF_EXCEPT";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_EXCEPT_ID: {PK, NotNull, NUMBER(16)}
     * @param refExceptId The value of refExceptId as equal. (NullAllowed: if null, no condition)
     */
    public void setRefExceptId_Equal(Long refExceptId) {
        doSetRefExceptId_Equal(refExceptId);
    }

    protected void doSetRefExceptId_Equal(Long refExceptId) {
        regRefExceptId(CK_EQ, refExceptId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_EXCEPT_ID: {PK, NotNull, NUMBER(16)}
     * @param refExceptId The value of refExceptId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setRefExceptId_GreaterThan(Long refExceptId) {
        regRefExceptId(CK_GT, refExceptId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_EXCEPT_ID: {PK, NotNull, NUMBER(16)}
     * @param refExceptId The value of refExceptId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setRefExceptId_LessThan(Long refExceptId) {
        regRefExceptId(CK_LT, refExceptId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_EXCEPT_ID: {PK, NotNull, NUMBER(16)}
     * @param refExceptId The value of refExceptId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setRefExceptId_GreaterEqual(Long refExceptId) {
        regRefExceptId(CK_GE, refExceptId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_EXCEPT_ID: {PK, NotNull, NUMBER(16)}
     * @param refExceptId The value of refExceptId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setRefExceptId_LessEqual(Long refExceptId) {
        regRefExceptId(CK_LE, refExceptId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * REF_EXCEPT_ID: {PK, NotNull, NUMBER(16)}
     * @param minNumber The min number of refExceptId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of refExceptId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRefExceptId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueRefExceptId(), "REF_EXCEPT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * REF_EXCEPT_ID: {PK, NotNull, NUMBER(16)}
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
     * REF_EXCEPT_ID: {PK, NotNull, NUMBER(16)}
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
     * REF_EXCEPT_ID: {PK, NotNull, NUMBER(16)}
     */
    public void setRefExceptId_IsNull() { regRefExceptId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * REF_EXCEPT_ID: {PK, NotNull, NUMBER(16)}
     */
    public void setRefExceptId_IsNotNull() { regRefExceptId(CK_ISNN, DOBJ); }

    protected void regRefExceptId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueRefExceptId(), "REF_EXCEPT_ID"); }
    protected abstract ConditionValue getCValueRefExceptId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * EXCEPT_ID: {NotNull, NUMBER(16), FK to SYNONYM_EXCEPT}
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
     * EXCEPT_ID: {NotNull, NUMBER(16), FK to SYNONYM_EXCEPT}
     * @param exceptId The value of exceptId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setExceptId_GreaterThan(Long exceptId) {
        regExceptId(CK_GT, exceptId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * EXCEPT_ID: {NotNull, NUMBER(16), FK to SYNONYM_EXCEPT}
     * @param exceptId The value of exceptId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setExceptId_LessThan(Long exceptId) {
        regExceptId(CK_LT, exceptId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * EXCEPT_ID: {NotNull, NUMBER(16), FK to SYNONYM_EXCEPT}
     * @param exceptId The value of exceptId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setExceptId_GreaterEqual(Long exceptId) {
        regExceptId(CK_GE, exceptId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * EXCEPT_ID: {NotNull, NUMBER(16), FK to SYNONYM_EXCEPT}
     * @param exceptId The value of exceptId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setExceptId_LessEqual(Long exceptId) {
        regExceptId(CK_LE, exceptId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * EXCEPT_ID: {NotNull, NUMBER(16), FK to SYNONYM_EXCEPT}
     * @param minNumber The min number of exceptId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of exceptId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setExceptId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueExceptId(), "EXCEPT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * EXCEPT_ID: {NotNull, NUMBER(16), FK to SYNONYM_EXCEPT}
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
     * EXCEPT_ID: {NotNull, NUMBER(16), FK to SYNONYM_EXCEPT}
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
     * {in (select EXCEPT_ID from SYNONYM_EXCEPT where ...)} <br />
     * SYNONYM_EXCEPT by my EXCEPT_ID, named 'synonymExcept'.
     * @param subQuery The sub-query of SynonymExcept for 'in-scope'. (NotNull)
     */
    public void inScopeSynonymExcept(SubQuery<SynonymExceptCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        SynonymExceptCB cb = new SynonymExceptCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepExceptId_InScopeRelation_SynonymExcept(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "EXCEPT_ID", "EXCEPT_ID", pp, "synonymExcept");
    }
    public abstract String keepExceptId_InScopeRelation_SynonymExcept(SynonymExceptCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select EXCEPT_ID from SYNONYM_EXCEPT where ...)} <br />
     * SYNONYM_EXCEPT by my EXCEPT_ID, named 'synonymExcept'.
     * @param subQuery The sub-query of SynonymExcept for 'not in-scope'. (NotNull)
     */
    public void notInScopeSynonymExcept(SubQuery<SynonymExceptCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        SynonymExceptCB cb = new SynonymExceptCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepExceptId_NotInScopeRelation_SynonymExcept(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "EXCEPT_ID", "EXCEPT_ID", pp, "synonymExcept");
    }
    public abstract String keepExceptId_NotInScopeRelation_SynonymExcept(SynonymExceptCQ sq);

    protected void regExceptId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueExceptId(), "EXCEPT_ID"); }
    protected abstract ConditionValue getCValueExceptId();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;SynonymRefExceptCB&gt;() {
     *     public void query(SynonymRefExceptCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<SynonymRefExceptCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand(), SynonymRefExceptCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;SynonymRefExceptCB&gt;() {
     *     public void query(SynonymRefExceptCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<SynonymRefExceptCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand(), SynonymRefExceptCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;SynonymRefExceptCB&gt;() {
     *     public void query(SynonymRefExceptCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<SynonymRefExceptCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand(), SynonymRefExceptCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;SynonymRefExceptCB&gt;() {
     *     public void query(SynonymRefExceptCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<SynonymRefExceptCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand(), SynonymRefExceptCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;SynonymRefExceptCB&gt;() {
     *     public void query(SynonymRefExceptCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<SynonymRefExceptCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand(), SynonymRefExceptCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;SynonymRefExceptCB&gt;() {
     *     public void query(SynonymRefExceptCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<SynonymRefExceptCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand(), SynonymRefExceptCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        SynonymRefExceptCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(SynonymRefExceptCQ sq);

    protected SynonymRefExceptCB xcreateScalarConditionCB() {
        SynonymRefExceptCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected SynonymRefExceptCB xcreateScalarConditionPartitionByCB() {
        SynonymRefExceptCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<SynonymRefExceptCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        SynonymRefExceptCB cb = new SynonymRefExceptCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String pk = "REF_EXCEPT_ID";
        String pp = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(SynonymRefExceptCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<SynonymRefExceptCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(SynonymRefExceptCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        SynonymRefExceptCB cb = new SynonymRefExceptCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "REF_EXCEPT_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(SynonymRefExceptCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<SynonymRefExceptCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        SynonymRefExceptCB cb = new SynonymRefExceptCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String pp = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(SynonymRefExceptCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<SynonymRefExceptCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        SynonymRefExceptCB cb = new SynonymRefExceptCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String pp = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(SynonymRefExceptCQ sq);

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
    protected SynonymRefExceptCB newMyCB() {
        return new SynonymRefExceptCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return SynonymRefExceptCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
