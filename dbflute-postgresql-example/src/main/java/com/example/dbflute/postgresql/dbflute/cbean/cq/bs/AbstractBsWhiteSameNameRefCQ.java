package com.example.dbflute.postgresql.dbflute.cbean.cq.bs;

import java.util.*;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.dbmeta.DBMetaProvider;
import com.example.dbflute.postgresql.dbflute.allcommon.*;
import com.example.dbflute.postgresql.dbflute.cbean.*;
import com.example.dbflute.postgresql.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of white_same_name_ref.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteSameNameRefCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteSameNameRefCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_same_name_ref";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * same_name_ref_id: {PK, NotNull, int4(10)}
     * @param sameNameRefId The value of sameNameRefId as equal. (NullAllowed: if null, no condition)
     */
    public void setSameNameRefId_Equal(Integer sameNameRefId) {
        doSetSameNameRefId_Equal(sameNameRefId);
    }

    protected void doSetSameNameRefId_Equal(Integer sameNameRefId) {
        regSameNameRefId(CK_EQ, sameNameRefId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * same_name_ref_id: {PK, NotNull, int4(10)}
     * @param sameNameRefId The value of sameNameRefId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setSameNameRefId_GreaterThan(Integer sameNameRefId) {
        regSameNameRefId(CK_GT, sameNameRefId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * same_name_ref_id: {PK, NotNull, int4(10)}
     * @param sameNameRefId The value of sameNameRefId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setSameNameRefId_LessThan(Integer sameNameRefId) {
        regSameNameRefId(CK_LT, sameNameRefId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * same_name_ref_id: {PK, NotNull, int4(10)}
     * @param sameNameRefId The value of sameNameRefId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setSameNameRefId_GreaterEqual(Integer sameNameRefId) {
        regSameNameRefId(CK_GE, sameNameRefId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * same_name_ref_id: {PK, NotNull, int4(10)}
     * @param sameNameRefId The value of sameNameRefId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setSameNameRefId_LessEqual(Integer sameNameRefId) {
        regSameNameRefId(CK_LE, sameNameRefId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * same_name_ref_id: {PK, NotNull, int4(10)}
     * @param minNumber The min number of sameNameRefId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of sameNameRefId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSameNameRefId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueSameNameRefId(), "same_name_ref_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * same_name_ref_id: {PK, NotNull, int4(10)}
     * @param sameNameRefIdList The collection of sameNameRefId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSameNameRefId_InScope(Collection<Integer> sameNameRefIdList) {
        doSetSameNameRefId_InScope(sameNameRefIdList);
    }

    protected void doSetSameNameRefId_InScope(Collection<Integer> sameNameRefIdList) {
        regINS(CK_INS, cTL(sameNameRefIdList), getCValueSameNameRefId(), "same_name_ref_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * same_name_ref_id: {PK, NotNull, int4(10)}
     * @param sameNameRefIdList The collection of sameNameRefId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSameNameRefId_NotInScope(Collection<Integer> sameNameRefIdList) {
        doSetSameNameRefId_NotInScope(sameNameRefIdList);
    }

    protected void doSetSameNameRefId_NotInScope(Collection<Integer> sameNameRefIdList) {
        regINS(CK_NINS, cTL(sameNameRefIdList), getCValueSameNameRefId(), "same_name_ref_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * same_name_ref_id: {PK, NotNull, int4(10)}
     */
    public void setSameNameRefId_IsNull() { regSameNameRefId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * same_name_ref_id: {PK, NotNull, int4(10)}
     */
    public void setSameNameRefId_IsNotNull() { regSameNameRefId(CK_ISNN, DOBJ); }

    protected void regSameNameRefId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueSameNameRefId(), "same_name_ref_id"); }
    protected abstract ConditionValue getCValueSameNameRefId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * same_name_id: {NotNull, int8(19), FK to white_same_name}
     * @param sameNameId The value of sameNameId as equal. (NullAllowed: if null, no condition)
     */
    public void setSameNameId_Equal(Long sameNameId) {
        doSetSameNameId_Equal(sameNameId);
    }

    protected void doSetSameNameId_Equal(Long sameNameId) {
        regSameNameId(CK_EQ, sameNameId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * same_name_id: {NotNull, int8(19), FK to white_same_name}
     * @param sameNameId The value of sameNameId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setSameNameId_GreaterThan(Long sameNameId) {
        regSameNameId(CK_GT, sameNameId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * same_name_id: {NotNull, int8(19), FK to white_same_name}
     * @param sameNameId The value of sameNameId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setSameNameId_LessThan(Long sameNameId) {
        regSameNameId(CK_LT, sameNameId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * same_name_id: {NotNull, int8(19), FK to white_same_name}
     * @param sameNameId The value of sameNameId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setSameNameId_GreaterEqual(Long sameNameId) {
        regSameNameId(CK_GE, sameNameId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * same_name_id: {NotNull, int8(19), FK to white_same_name}
     * @param sameNameId The value of sameNameId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setSameNameId_LessEqual(Long sameNameId) {
        regSameNameId(CK_LE, sameNameId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * same_name_id: {NotNull, int8(19), FK to white_same_name}
     * @param minNumber The min number of sameNameId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of sameNameId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSameNameId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueSameNameId(), "same_name_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * same_name_id: {NotNull, int8(19), FK to white_same_name}
     * @param sameNameIdList The collection of sameNameId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSameNameId_InScope(Collection<Long> sameNameIdList) {
        doSetSameNameId_InScope(sameNameIdList);
    }

    protected void doSetSameNameId_InScope(Collection<Long> sameNameIdList) {
        regINS(CK_INS, cTL(sameNameIdList), getCValueSameNameId(), "same_name_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * same_name_id: {NotNull, int8(19), FK to white_same_name}
     * @param sameNameIdList The collection of sameNameId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSameNameId_NotInScope(Collection<Long> sameNameIdList) {
        doSetSameNameId_NotInScope(sameNameIdList);
    }

    protected void doSetSameNameId_NotInScope(Collection<Long> sameNameIdList) {
        regINS(CK_NINS, cTL(sameNameIdList), getCValueSameNameId(), "same_name_id");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select same_name_id from white_same_name where ...)} <br />
     * white_same_name by my same_name_id, named 'whiteSameName'.
     * @param subQuery The sub-query of WhiteSameName for 'in-scope'. (NotNull)
     */
    public void inScopeWhiteSameName(SubQuery<WhiteSameNameCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteSameNameCB cb = new WhiteSameNameCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepSameNameId_InScopeRelation_WhiteSameName(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "same_name_id", "same_name_id", pp, "whiteSameName");
    }
    public abstract String keepSameNameId_InScopeRelation_WhiteSameName(WhiteSameNameCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select same_name_id from white_same_name where ...)} <br />
     * white_same_name by my same_name_id, named 'whiteSameName'.
     * @param subQuery The sub-query of WhiteSameName for 'not in-scope'. (NotNull)
     */
    public void notInScopeWhiteSameName(SubQuery<WhiteSameNameCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteSameNameCB cb = new WhiteSameNameCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepSameNameId_NotInScopeRelation_WhiteSameName(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "same_name_id", "same_name_id", pp, "whiteSameName");
    }
    public abstract String keepSameNameId_NotInScopeRelation_WhiteSameName(WhiteSameNameCQ sq);

    protected void regSameNameId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueSameNameId(), "same_name_id"); }
    protected abstract ConditionValue getCValueSameNameId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * next_same_name_id: {NotNull, int8(19)}
     * @param nextSameNameId The value of nextSameNameId as equal. (NullAllowed: if null, no condition)
     */
    public void setNextSameNameId_Equal(Long nextSameNameId) {
        doSetNextSameNameId_Equal(nextSameNameId);
    }

    protected void doSetNextSameNameId_Equal(Long nextSameNameId) {
        regNextSameNameId(CK_EQ, nextSameNameId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * next_same_name_id: {NotNull, int8(19)}
     * @param nextSameNameId The value of nextSameNameId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setNextSameNameId_GreaterThan(Long nextSameNameId) {
        regNextSameNameId(CK_GT, nextSameNameId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * next_same_name_id: {NotNull, int8(19)}
     * @param nextSameNameId The value of nextSameNameId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setNextSameNameId_LessThan(Long nextSameNameId) {
        regNextSameNameId(CK_LT, nextSameNameId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * next_same_name_id: {NotNull, int8(19)}
     * @param nextSameNameId The value of nextSameNameId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setNextSameNameId_GreaterEqual(Long nextSameNameId) {
        regNextSameNameId(CK_GE, nextSameNameId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * next_same_name_id: {NotNull, int8(19)}
     * @param nextSameNameId The value of nextSameNameId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setNextSameNameId_LessEqual(Long nextSameNameId) {
        regNextSameNameId(CK_LE, nextSameNameId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * next_same_name_id: {NotNull, int8(19)}
     * @param minNumber The min number of nextSameNameId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of nextSameNameId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNextSameNameId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueNextSameNameId(), "next_same_name_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * next_same_name_id: {NotNull, int8(19)}
     * @param nextSameNameIdList The collection of nextSameNameId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNextSameNameId_InScope(Collection<Long> nextSameNameIdList) {
        doSetNextSameNameId_InScope(nextSameNameIdList);
    }

    protected void doSetNextSameNameId_InScope(Collection<Long> nextSameNameIdList) {
        regINS(CK_INS, cTL(nextSameNameIdList), getCValueNextSameNameId(), "next_same_name_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * next_same_name_id: {NotNull, int8(19)}
     * @param nextSameNameIdList The collection of nextSameNameId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNextSameNameId_NotInScope(Collection<Long> nextSameNameIdList) {
        doSetNextSameNameId_NotInScope(nextSameNameIdList);
    }

    protected void doSetNextSameNameId_NotInScope(Collection<Long> nextSameNameIdList) {
        regINS(CK_NINS, cTL(nextSameNameIdList), getCValueNextSameNameId(), "next_same_name_id");
    }

    protected void regNextSameNameId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueNextSameNameId(), "next_same_name_id"); }
    protected abstract ConditionValue getCValueNextSameNameId();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteSameNameRefCB&gt;() {
     *     public void query(WhiteSameNameRefCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSameNameRefCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteSameNameRefCB&gt;() {
     *     public void query(WhiteSameNameRefCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSameNameRefCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteSameNameRefCB&gt;() {
     *     public void query(WhiteSameNameRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSameNameRefCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteSameNameRefCB&gt;() {
     *     public void query(WhiteSameNameRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSameNameRefCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteSameNameRefCB&gt;() {
     *     public void query(WhiteSameNameRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSameNameRefCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteSameNameRefCB&gt;() {
     *     public void query(WhiteSameNameRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSameNameRefCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<WhiteSameNameRefCB> xcreateSSQFunction(final String rd) {
        return new HpSSQFunction<WhiteSameNameRefCB>(new HpSSQSetupper<WhiteSameNameRefCB>() {
            public void setup(String fn, SubQuery<WhiteSameNameRefCB> sq, HpSSQOption<WhiteSameNameRefCB> op) {
                xscalarCondition(fn, sq, rd, op);
            }
        });
    }

    protected void xscalarCondition(String fn, SubQuery<WhiteSameNameRefCB> sq, String rd, HpSSQOption<WhiteSameNameRefCB> op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSameNameRefCB cb = xcreateScalarConditionCB(); sq.query(cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhiteSameNameRefCQ sq);

    protected WhiteSameNameRefCB xcreateScalarConditionCB() {
        WhiteSameNameRefCB cb = new WhiteSameNameRefCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected WhiteSameNameRefCB xcreateScalarConditionPartitionByCB() {
        WhiteSameNameRefCB cb = new WhiteSameNameRefCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteSameNameRefCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSameNameRefCB cb = new WhiteSameNameRefCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String pk = "same_name_ref_id";
        String pp = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteSameNameRefCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteSameNameRefCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<WhiteSameNameRefCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<WhiteSameNameRefCB>(new HpQDRSetupper<WhiteSameNameRefCB>() {
            public void setup(String fn, SubQuery<WhiteSameNameRefCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveMyselfDerived(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveMyselfDerived(String fn, SubQuery<WhiteSameNameRefCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSameNameRefCB cb = new WhiteSameNameRefCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String pk = "same_name_ref_id";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteSameNameRefCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteSameNameRefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteSameNameRefCB cb = new WhiteSameNameRefCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String pp = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteSameNameRefCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteSameNameRefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteSameNameRefCB cb = new WhiteSameNameRefCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String pp = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(WhiteSameNameRefCQ sq);

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
     * @param textColumnList The list of text column. (NotNull, NotEmpty, StringColumn, TargetTableColumn)
     * @param conditionValue The condition value. (NullAllowed: if null or empty, no condition)
     */
    public void match(List<org.seasar.dbflute.dbmeta.info.ColumnInfo> textColumnList, String conditionValue) {
        xdoMatchByLikeSearch(textColumnList, conditionValue);
    }

    @Override
    protected String xescapeFullTextSearchValue(String conditionValue) {
        return conditionValue; // non escape
    }

    @Override
    protected LikeSearchOption xcreateMatchLikeSearch() {
        return new PostgreSQLMatchLikeSearch();
    }

    @Override
    protected org.seasar.dbflute.dbway.ExtensionOperand xgetPostgreSQLMatchOperand() {
        return DBFluteConfig.getInstance().getFullTextSearchOperand();
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCB() { return WhiteSameNameRefCB.class.getName(); }
    protected String xabCQ() { return WhiteSameNameRefCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
