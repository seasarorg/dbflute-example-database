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
 * The abstract condition-query of white_compound_pk_ref.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteCompoundPkRefCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteCompoundPkRefCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_compound_pk_ref";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * multiple_first_id: {PK, NotNull, int4(10)}
     * @param multipleFirstId The value of multipleFirstId as equal. (NullAllowed: if null, no condition)
     */
    public void setMultipleFirstId_Equal(Integer multipleFirstId) {
        doSetMultipleFirstId_Equal(multipleFirstId);
    }

    protected void doSetMultipleFirstId_Equal(Integer multipleFirstId) {
        regMultipleFirstId(CK_EQ, multipleFirstId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * multiple_first_id: {PK, NotNull, int4(10)}
     * @param multipleFirstId The value of multipleFirstId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setMultipleFirstId_GreaterThan(Integer multipleFirstId) {
        regMultipleFirstId(CK_GT, multipleFirstId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * multiple_first_id: {PK, NotNull, int4(10)}
     * @param multipleFirstId The value of multipleFirstId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setMultipleFirstId_LessThan(Integer multipleFirstId) {
        regMultipleFirstId(CK_LT, multipleFirstId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * multiple_first_id: {PK, NotNull, int4(10)}
     * @param multipleFirstId The value of multipleFirstId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setMultipleFirstId_GreaterEqual(Integer multipleFirstId) {
        regMultipleFirstId(CK_GE, multipleFirstId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * multiple_first_id: {PK, NotNull, int4(10)}
     * @param multipleFirstId The value of multipleFirstId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setMultipleFirstId_LessEqual(Integer multipleFirstId) {
        regMultipleFirstId(CK_LE, multipleFirstId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * multiple_first_id: {PK, NotNull, int4(10)}
     * @param minNumber The min number of multipleFirstId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of multipleFirstId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMultipleFirstId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueMultipleFirstId(), "multiple_first_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * multiple_first_id: {PK, NotNull, int4(10)}
     * @param multipleFirstIdList The collection of multipleFirstId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMultipleFirstId_InScope(Collection<Integer> multipleFirstIdList) {
        doSetMultipleFirstId_InScope(multipleFirstIdList);
    }

    protected void doSetMultipleFirstId_InScope(Collection<Integer> multipleFirstIdList) {
        regINS(CK_INS, cTL(multipleFirstIdList), getCValueMultipleFirstId(), "multiple_first_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * multiple_first_id: {PK, NotNull, int4(10)}
     * @param multipleFirstIdList The collection of multipleFirstId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMultipleFirstId_NotInScope(Collection<Integer> multipleFirstIdList) {
        doSetMultipleFirstId_NotInScope(multipleFirstIdList);
    }

    protected void doSetMultipleFirstId_NotInScope(Collection<Integer> multipleFirstIdList) {
        regINS(CK_NINS, cTL(multipleFirstIdList), getCValueMultipleFirstId(), "multiple_first_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * multiple_first_id: {PK, NotNull, int4(10)}
     */
    public void setMultipleFirstId_IsNull() { regMultipleFirstId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * multiple_first_id: {PK, NotNull, int4(10)}
     */
    public void setMultipleFirstId_IsNotNull() { regMultipleFirstId(CK_ISNN, DOBJ); }

    protected void regMultipleFirstId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueMultipleFirstId(), "multiple_first_id"); }
    protected abstract ConditionValue getCValueMultipleFirstId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * multiple_second_id: {PK, NotNull, int4(10)}
     * @param multipleSecondId The value of multipleSecondId as equal. (NullAllowed: if null, no condition)
     */
    public void setMultipleSecondId_Equal(Integer multipleSecondId) {
        doSetMultipleSecondId_Equal(multipleSecondId);
    }

    protected void doSetMultipleSecondId_Equal(Integer multipleSecondId) {
        regMultipleSecondId(CK_EQ, multipleSecondId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * multiple_second_id: {PK, NotNull, int4(10)}
     * @param multipleSecondId The value of multipleSecondId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setMultipleSecondId_GreaterThan(Integer multipleSecondId) {
        regMultipleSecondId(CK_GT, multipleSecondId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * multiple_second_id: {PK, NotNull, int4(10)}
     * @param multipleSecondId The value of multipleSecondId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setMultipleSecondId_LessThan(Integer multipleSecondId) {
        regMultipleSecondId(CK_LT, multipleSecondId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * multiple_second_id: {PK, NotNull, int4(10)}
     * @param multipleSecondId The value of multipleSecondId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setMultipleSecondId_GreaterEqual(Integer multipleSecondId) {
        regMultipleSecondId(CK_GE, multipleSecondId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * multiple_second_id: {PK, NotNull, int4(10)}
     * @param multipleSecondId The value of multipleSecondId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setMultipleSecondId_LessEqual(Integer multipleSecondId) {
        regMultipleSecondId(CK_LE, multipleSecondId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * multiple_second_id: {PK, NotNull, int4(10)}
     * @param minNumber The min number of multipleSecondId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of multipleSecondId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMultipleSecondId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueMultipleSecondId(), "multiple_second_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * multiple_second_id: {PK, NotNull, int4(10)}
     * @param multipleSecondIdList The collection of multipleSecondId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMultipleSecondId_InScope(Collection<Integer> multipleSecondIdList) {
        doSetMultipleSecondId_InScope(multipleSecondIdList);
    }

    protected void doSetMultipleSecondId_InScope(Collection<Integer> multipleSecondIdList) {
        regINS(CK_INS, cTL(multipleSecondIdList), getCValueMultipleSecondId(), "multiple_second_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * multiple_second_id: {PK, NotNull, int4(10)}
     * @param multipleSecondIdList The collection of multipleSecondId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMultipleSecondId_NotInScope(Collection<Integer> multipleSecondIdList) {
        doSetMultipleSecondId_NotInScope(multipleSecondIdList);
    }

    protected void doSetMultipleSecondId_NotInScope(Collection<Integer> multipleSecondIdList) {
        regINS(CK_NINS, cTL(multipleSecondIdList), getCValueMultipleSecondId(), "multiple_second_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * multiple_second_id: {PK, NotNull, int4(10)}
     */
    public void setMultipleSecondId_IsNull() { regMultipleSecondId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * multiple_second_id: {PK, NotNull, int4(10)}
     */
    public void setMultipleSecondId_IsNotNull() { regMultipleSecondId(CK_ISNN, DOBJ); }

    protected void regMultipleSecondId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueMultipleSecondId(), "multiple_second_id"); }
    protected abstract ConditionValue getCValueMultipleSecondId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * ref_first_id: {NotNull, int4(10), FK to white_compound_pk}
     * @param refFirstId The value of refFirstId as equal. (NullAllowed: if null, no condition)
     */
    public void setRefFirstId_Equal(Integer refFirstId) {
        doSetRefFirstId_Equal(refFirstId);
    }

    protected void doSetRefFirstId_Equal(Integer refFirstId) {
        regRefFirstId(CK_EQ, refFirstId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ref_first_id: {NotNull, int4(10), FK to white_compound_pk}
     * @param refFirstId The value of refFirstId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setRefFirstId_GreaterThan(Integer refFirstId) {
        regRefFirstId(CK_GT, refFirstId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ref_first_id: {NotNull, int4(10), FK to white_compound_pk}
     * @param refFirstId The value of refFirstId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setRefFirstId_LessThan(Integer refFirstId) {
        regRefFirstId(CK_LT, refFirstId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * ref_first_id: {NotNull, int4(10), FK to white_compound_pk}
     * @param refFirstId The value of refFirstId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setRefFirstId_GreaterEqual(Integer refFirstId) {
        regRefFirstId(CK_GE, refFirstId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * ref_first_id: {NotNull, int4(10), FK to white_compound_pk}
     * @param refFirstId The value of refFirstId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setRefFirstId_LessEqual(Integer refFirstId) {
        regRefFirstId(CK_LE, refFirstId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * ref_first_id: {NotNull, int4(10), FK to white_compound_pk}
     * @param minNumber The min number of refFirstId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of refFirstId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRefFirstId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueRefFirstId(), "ref_first_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * ref_first_id: {NotNull, int4(10), FK to white_compound_pk}
     * @param refFirstIdList The collection of refFirstId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRefFirstId_InScope(Collection<Integer> refFirstIdList) {
        doSetRefFirstId_InScope(refFirstIdList);
    }

    protected void doSetRefFirstId_InScope(Collection<Integer> refFirstIdList) {
        regINS(CK_INS, cTL(refFirstIdList), getCValueRefFirstId(), "ref_first_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * ref_first_id: {NotNull, int4(10), FK to white_compound_pk}
     * @param refFirstIdList The collection of refFirstId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRefFirstId_NotInScope(Collection<Integer> refFirstIdList) {
        doSetRefFirstId_NotInScope(refFirstIdList);
    }

    protected void doSetRefFirstId_NotInScope(Collection<Integer> refFirstIdList) {
        regINS(CK_NINS, cTL(refFirstIdList), getCValueRefFirstId(), "ref_first_id");
    }

    protected void regRefFirstId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueRefFirstId(), "ref_first_id"); }
    protected abstract ConditionValue getCValueRefFirstId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * ref_second_id: {NotNull, int4(10), FK to white_compound_pk}
     * @param refSecondId The value of refSecondId as equal. (NullAllowed: if null, no condition)
     */
    public void setRefSecondId_Equal(Integer refSecondId) {
        doSetRefSecondId_Equal(refSecondId);
    }

    protected void doSetRefSecondId_Equal(Integer refSecondId) {
        regRefSecondId(CK_EQ, refSecondId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ref_second_id: {NotNull, int4(10), FK to white_compound_pk}
     * @param refSecondId The value of refSecondId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setRefSecondId_GreaterThan(Integer refSecondId) {
        regRefSecondId(CK_GT, refSecondId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ref_second_id: {NotNull, int4(10), FK to white_compound_pk}
     * @param refSecondId The value of refSecondId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setRefSecondId_LessThan(Integer refSecondId) {
        regRefSecondId(CK_LT, refSecondId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * ref_second_id: {NotNull, int4(10), FK to white_compound_pk}
     * @param refSecondId The value of refSecondId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setRefSecondId_GreaterEqual(Integer refSecondId) {
        regRefSecondId(CK_GE, refSecondId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * ref_second_id: {NotNull, int4(10), FK to white_compound_pk}
     * @param refSecondId The value of refSecondId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setRefSecondId_LessEqual(Integer refSecondId) {
        regRefSecondId(CK_LE, refSecondId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * ref_second_id: {NotNull, int4(10), FK to white_compound_pk}
     * @param minNumber The min number of refSecondId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of refSecondId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRefSecondId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueRefSecondId(), "ref_second_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * ref_second_id: {NotNull, int4(10), FK to white_compound_pk}
     * @param refSecondIdList The collection of refSecondId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRefSecondId_InScope(Collection<Integer> refSecondIdList) {
        doSetRefSecondId_InScope(refSecondIdList);
    }

    protected void doSetRefSecondId_InScope(Collection<Integer> refSecondIdList) {
        regINS(CK_INS, cTL(refSecondIdList), getCValueRefSecondId(), "ref_second_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * ref_second_id: {NotNull, int4(10), FK to white_compound_pk}
     * @param refSecondIdList The collection of refSecondId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRefSecondId_NotInScope(Collection<Integer> refSecondIdList) {
        doSetRefSecondId_NotInScope(refSecondIdList);
    }

    protected void doSetRefSecondId_NotInScope(Collection<Integer> refSecondIdList) {
        regINS(CK_NINS, cTL(refSecondIdList), getCValueRefSecondId(), "ref_second_id");
    }

    protected void regRefSecondId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueRefSecondId(), "ref_second_id"); }
    protected abstract ConditionValue getCValueRefSecondId();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteCompoundPkRefCB&gt;() {
     *     public void query(WhiteCompoundPkRefCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteCompoundPkRefCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, WhiteCompoundPkRefCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteCompoundPkRefCB&gt;() {
     *     public void query(WhiteCompoundPkRefCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteCompoundPkRefCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, WhiteCompoundPkRefCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteCompoundPkRefCB&gt;() {
     *     public void query(WhiteCompoundPkRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteCompoundPkRefCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, WhiteCompoundPkRefCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteCompoundPkRefCB&gt;() {
     *     public void query(WhiteCompoundPkRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteCompoundPkRefCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, WhiteCompoundPkRefCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteCompoundPkRefCB&gt;() {
     *     public void query(WhiteCompoundPkRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteCompoundPkRefCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, WhiteCompoundPkRefCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteCompoundPkRefCB&gt;() {
     *     public void query(WhiteCompoundPkRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteCompoundPkRefCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, WhiteCompoundPkRefCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WhiteCompoundPkRefCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhiteCompoundPkRefCQ sq);

    protected WhiteCompoundPkRefCB xcreateScalarConditionCB() {
        WhiteCompoundPkRefCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteCompoundPkRefCB xcreateScalarConditionPartitionByCB() {
        WhiteCompoundPkRefCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

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
    protected WhiteCompoundPkRefCB newMyCB() {
        return new WhiteCompoundPkRefCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return WhiteCompoundPkRefCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
