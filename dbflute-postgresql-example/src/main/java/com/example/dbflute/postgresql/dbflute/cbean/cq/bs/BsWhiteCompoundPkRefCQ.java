package com.example.dbflute.postgresql.dbflute.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.postgresql.dbflute.cbean.cq.ciq.*;
import com.example.dbflute.postgresql.dbflute.cbean.*;
import com.example.dbflute.postgresql.dbflute.cbean.cq.*;

/**
 * The base condition-query of white_compound_pk_ref.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteCompoundPkRefCQ extends AbstractBsWhiteCompoundPkRefCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteCompoundPkRefCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteCompoundPkRefCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_compound_pk_ref) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteCompoundPkRefCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteCompoundPkRefCIQ xcreateCIQ() {
        WhiteCompoundPkRefCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteCompoundPkRefCIQ xnewCIQ() {
        return new WhiteCompoundPkRefCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_compound_pk_ref on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteCompoundPkRefCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteCompoundPkRefCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _multipleFirstId;
    public ConditionValue getMultipleFirstId()
    { if (_multipleFirstId == null) { _multipleFirstId = nCV(); }
      return _multipleFirstId; }
    protected ConditionValue getCValueMultipleFirstId() { return getMultipleFirstId(); }

    /** 
     * Add order-by as ascend. <br />
     * multiple_first_id: {PK, NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkRefCQ addOrderBy_MultipleFirstId_Asc() { regOBA("multiple_first_id"); return this; }

    /**
     * Add order-by as descend. <br />
     * multiple_first_id: {PK, NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkRefCQ addOrderBy_MultipleFirstId_Desc() { regOBD("multiple_first_id"); return this; }

    protected ConditionValue _multipleSecondId;
    public ConditionValue getMultipleSecondId()
    { if (_multipleSecondId == null) { _multipleSecondId = nCV(); }
      return _multipleSecondId; }
    protected ConditionValue getCValueMultipleSecondId() { return getMultipleSecondId(); }

    /** 
     * Add order-by as ascend. <br />
     * multiple_second_id: {PK, NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkRefCQ addOrderBy_MultipleSecondId_Asc() { regOBA("multiple_second_id"); return this; }

    /**
     * Add order-by as descend. <br />
     * multiple_second_id: {PK, NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkRefCQ addOrderBy_MultipleSecondId_Desc() { regOBD("multiple_second_id"); return this; }

    protected ConditionValue _refFirstId;
    public ConditionValue getRefFirstId()
    { if (_refFirstId == null) { _refFirstId = nCV(); }
      return _refFirstId; }
    protected ConditionValue getCValueRefFirstId() { return getRefFirstId(); }

    /** 
     * Add order-by as ascend. <br />
     * ref_first_id: {NotNull, int4(10), FK to white_compound_pk}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkRefCQ addOrderBy_RefFirstId_Asc() { regOBA("ref_first_id"); return this; }

    /**
     * Add order-by as descend. <br />
     * ref_first_id: {NotNull, int4(10), FK to white_compound_pk}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkRefCQ addOrderBy_RefFirstId_Desc() { regOBD("ref_first_id"); return this; }

    protected ConditionValue _refSecondId;
    public ConditionValue getRefSecondId()
    { if (_refSecondId == null) { _refSecondId = nCV(); }
      return _refSecondId; }
    protected ConditionValue getCValueRefSecondId() { return getRefSecondId(); }

    /** 
     * Add order-by as ascend. <br />
     * ref_second_id: {NotNull, int4(10), FK to white_compound_pk}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkRefCQ addOrderBy_RefSecondId_Asc() { regOBA("ref_second_id"); return this; }

    /**
     * Add order-by as descend. <br />
     * ref_second_id: {NotNull, int4(10), FK to white_compound_pk}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkRefCQ addOrderBy_RefSecondId_Desc() { regOBD("ref_second_id"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #DD4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #DD4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #DD4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkRefCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #DD4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #DD4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #DD4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkRefCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        WhiteCompoundPkRefCQ bq = (WhiteCompoundPkRefCQ)bqs;
        WhiteCompoundPkRefCQ uq = (WhiteCompoundPkRefCQ)uqs;
        if (bq.hasConditionQueryWhiteCompoundPk()) {
            uq.queryWhiteCompoundPk().reflectRelationOnUnionQuery(bq.queryWhiteCompoundPk(), uq.queryWhiteCompoundPk());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * white_compound_pk by my ref_first_id, ref_second_id, named 'whiteCompoundPk'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteCompoundPkCQ queryWhiteCompoundPk() {
        return getConditionQueryWhiteCompoundPk();
    }
    public WhiteCompoundPkCQ getConditionQueryWhiteCompoundPk() {
        String prop = "whiteCompoundPk";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhiteCompoundPk()); xsetupOuterJoinWhiteCompoundPk(); }
        return xgetQueRlMap(prop);
    }
    protected WhiteCompoundPkCQ xcreateQueryWhiteCompoundPk() {
        String nrp = xresolveNRP("white_compound_pk_ref", "whiteCompoundPk"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhiteCompoundPkCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whiteCompoundPk", nrp);
    }
    protected void xsetupOuterJoinWhiteCompoundPk() { xregOutJo("whiteCompoundPk"); }
    public boolean hasConditionQueryWhiteCompoundPk() { return xhasQueRlMap("whiteCompoundPk"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, WhiteCompoundPkRefCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteCompoundPkRefCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteCompoundPkRefCB.class.getName(); }
    protected String xCQ() { return WhiteCompoundPkRefCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
