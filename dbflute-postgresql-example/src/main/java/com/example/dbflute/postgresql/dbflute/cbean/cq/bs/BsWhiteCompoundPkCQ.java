package com.example.dbflute.postgresql.dbflute.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.postgresql.dbflute.cbean.cq.ciq.*;
import com.example.dbflute.postgresql.dbflute.cbean.*;
import com.example.dbflute.postgresql.dbflute.cbean.cq.*;

/**
 * The base condition-query of white_compound_pk.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteCompoundPkCQ extends AbstractBsWhiteCompoundPkCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteCompoundPkCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteCompoundPkCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_compound_pk) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteCompoundPkCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteCompoundPkCIQ xcreateCIQ() {
        WhiteCompoundPkCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteCompoundPkCIQ xnewCIQ() {
        return new WhiteCompoundPkCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_compound_pk on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteCompoundPkCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteCompoundPkCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _pkFirstId;
    public ConditionValue getPkFirstId() {
        if (_pkFirstId == null) { _pkFirstId = nCV(); }
        return _pkFirstId;
    }
    protected ConditionValue getCValuePkFirstId() { return getPkFirstId(); }

    /** 
     * Add order-by as ascend. <br />
     * pk_first_id: {PK, NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkCQ addOrderBy_PkFirstId_Asc() { regOBA("pk_first_id"); return this; }

    /**
     * Add order-by as descend. <br />
     * pk_first_id: {PK, NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkCQ addOrderBy_PkFirstId_Desc() { regOBD("pk_first_id"); return this; }

    protected ConditionValue _pkSecondId;
    public ConditionValue getPkSecondId() {
        if (_pkSecondId == null) { _pkSecondId = nCV(); }
        return _pkSecondId;
    }
    protected ConditionValue getCValuePkSecondId() { return getPkSecondId(); }

    /** 
     * Add order-by as ascend. <br />
     * pk_second_id: {PK, NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkCQ addOrderBy_PkSecondId_Asc() { regOBA("pk_second_id"); return this; }

    /**
     * Add order-by as descend. <br />
     * pk_second_id: {PK, NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkCQ addOrderBy_PkSecondId_Desc() { regOBD("pk_second_id"); return this; }

    protected ConditionValue _pkName;
    public ConditionValue getPkName() {
        if (_pkName == null) { _pkName = nCV(); }
        return _pkName;
    }
    protected ConditionValue getCValuePkName() { return getPkName(); }

    /** 
     * Add order-by as ascend. <br />
     * pk_name: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkCQ addOrderBy_PkName_Asc() { regOBA("pk_name"); return this; }

    /**
     * Add order-by as descend. <br />
     * pk_name: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkCQ addOrderBy_PkName_Desc() { regOBD("pk_name"); return this; }

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
     * }, <span style="color: #FD4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #FD4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #FD4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #FD4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #FD4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #FD4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                       Compound PK's Exists Referrer
    //                                                       =============================
    /**
     * Set up 'exists-referrer' (co-related sub-query). <br />
     * {exists (select ... from white_compound_pk_ref where ...)}
     * @param subQuery The sub-query of WhiteCompoundPkRefList for 'exists'. (NotNull)
     */
    public void existsWhiteCompoundPkRefList(SubQuery<WhiteCompoundPkRefCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteCompoundPkRefCB>", subQuery);
        WhiteCompoundPkRefCB cb = new WhiteCompoundPkRefCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String pp = keepTwoOrMorePk_ExistsReferrer_WhiteCompoundPkRefList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "pk_first_id, pk_second_id", "ref_first_id, ref_second_id", pp, "whiteCompoundPkRefList");
    }
    protected Map<String, WhiteCompoundPkRefCQ> _twoOrMorePk_ExistsReferrer_WhiteCompoundPkRefListMap;
    public Map<String, WhiteCompoundPkRefCQ> getTwoOrMorePk_ExistsReferrer_WhiteCompoundPkRefList() { return _twoOrMorePk_ExistsReferrer_WhiteCompoundPkRefListMap; }
    public String keepTwoOrMorePk_ExistsReferrer_WhiteCompoundPkRefList(WhiteCompoundPkRefCQ sq) {
        if (_twoOrMorePk_ExistsReferrer_WhiteCompoundPkRefListMap == null) { _twoOrMorePk_ExistsReferrer_WhiteCompoundPkRefListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_twoOrMorePk_ExistsReferrer_WhiteCompoundPkRefListMap.size() + 1);
        _twoOrMorePk_ExistsReferrer_WhiteCompoundPkRefListMap.put(ky, sq); return "twoOrMorePk_ExistsReferrer_WhiteCompoundPkRefList." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteCompoundPkCB.class.getName(); }
    protected String xCQ() { return WhiteCompoundPkCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
