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
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
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
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
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
     * }, <span style="color: #DD4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #DD4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #DD4747">aliasName</span>);
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
     * }, <span style="color: #DD4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #DD4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #DD4747">aliasName</span>);
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
    //                                                      ExistsReferrer for Compound PK
    //                                                      ==============================
    /**
     * Set up ExistsReferrer (correlated sub-query). <br />
     * {exists (select ... from white_compound_pk_ref where ...)}
     * @param subQuery The sub-query of WhiteCompoundPkRefList for 'exists'. (NotNull)
     */
    public void existsWhiteCompoundPkRefList(SubQuery<WhiteCompoundPkRefCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteCompoundPkRefCB>", subQuery);
        WhiteCompoundPkRefCB cb = new WhiteCompoundPkRefCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepTwoOrMorePk_ExistsReferrer_WhiteCompoundPkRefList(cb.query());
        registerExistsReferrer(cb.query(), "pk_first_id, pk_second_id", "ref_first_id, ref_second_id", pp, "whiteCompoundPkRefList");
    }
    protected Map<String, WhiteCompoundPkRefCQ> _twoOrMorePk_ExistsReferrer_WhiteCompoundPkRefListMap;
    public Map<String, WhiteCompoundPkRefCQ> getTwoOrMorePk_ExistsReferrer_WhiteCompoundPkRefList() { return _twoOrMorePk_ExistsReferrer_WhiteCompoundPkRefListMap; }
    public String keepTwoOrMorePk_ExistsReferrer_WhiteCompoundPkRefList(WhiteCompoundPkRefCQ sq) {
        if (_twoOrMorePk_ExistsReferrer_WhiteCompoundPkRefListMap == null) { _twoOrMorePk_ExistsReferrer_WhiteCompoundPkRefListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_twoOrMorePk_ExistsReferrer_WhiteCompoundPkRefListMap.size() + 1);
        _twoOrMorePk_ExistsReferrer_WhiteCompoundPkRefListMap.put(ky, sq); return "twoOrMorePk_ExistsReferrer_WhiteCompoundPkRefList." + ky;
    }

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select ... from white_compound_pk_ref where ...)}
     * @param subQuery The sub-query of WhiteCompoundPkRefList for 'not exists'. (NotNull)
     */
    public void notExistsWhiteCompoundPkRefList(SubQuery<WhiteCompoundPkRefCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteCompoundPkRefCB>", subQuery);
        WhiteCompoundPkRefCB cb = new WhiteCompoundPkRefCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepTwoOrMorePk_NotExistsReferrer_WhiteCompoundPkRefList(cb.query());
        registerNotExistsReferrer(cb.query(), "pk_first_id, pk_second_id", "ref_first_id, ref_second_id", pp, "whiteCompoundPkRefList");
    }
    protected Map<String, WhiteCompoundPkRefCQ> _twoOrMorePk_NotExistsReferrer_WhiteCompoundPkRefListMap;
    public Map<String, WhiteCompoundPkRefCQ> getTwoOrMorePk_NotExistsReferrer_WhiteCompoundPkRefList() { return _twoOrMorePk_NotExistsReferrer_WhiteCompoundPkRefListMap; }
    public String keepTwoOrMorePk_NotExistsReferrer_WhiteCompoundPkRefList(WhiteCompoundPkRefCQ sq) {
        if (_twoOrMorePk_NotExistsReferrer_WhiteCompoundPkRefListMap == null) { _twoOrMorePk_NotExistsReferrer_WhiteCompoundPkRefListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_twoOrMorePk_NotExistsReferrer_WhiteCompoundPkRefListMap.size() + 1);
        _twoOrMorePk_NotExistsReferrer_WhiteCompoundPkRefListMap.put(ky, sq); return "twoOrMorePk_NotExistsReferrer_WhiteCompoundPkRefList." + ky;
    }

    // ===================================================================================
    //                                            (Specify)DerivedReferrer for Compound PK
    //                                            ========================================
    public void xsderiveWhiteCompoundPkRefList(String fn, SubQuery<WhiteCompoundPkRefCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteCompoundPkRefCB cb = new WhiteCompoundPkRefCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepTwoOrMorePk_SpecifyDerivedReferrer_WhiteCompoundPkRefList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "pk_first_id, pk_second_id", "ref_first_id, ref_second_id", pp, "whiteCompoundPkRefList", al, op);
    }
    protected Map<String, WhiteCompoundPkRefCQ> _twoOrMorePk_SpecifyDerivedReferrer_WhiteCompoundPkRefListMap;
    public Map<String, WhiteCompoundPkRefCQ> getTwoOrMorePk_SpecifyDerivedReferrer_WhiteCompoundPkRefList() { return _twoOrMorePk_SpecifyDerivedReferrer_WhiteCompoundPkRefListMap; }
    public String keepTwoOrMorePk_SpecifyDerivedReferrer_WhiteCompoundPkRefList(WhiteCompoundPkRefCQ sq) {
        if (_twoOrMorePk_SpecifyDerivedReferrer_WhiteCompoundPkRefListMap == null) { _twoOrMorePk_SpecifyDerivedReferrer_WhiteCompoundPkRefListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_twoOrMorePk_SpecifyDerivedReferrer_WhiteCompoundPkRefListMap.size() + 1);
        _twoOrMorePk_SpecifyDerivedReferrer_WhiteCompoundPkRefListMap.put(ky, sq); return "twoOrMorePk_SpecifyDerivedReferrer_WhiteCompoundPkRefList." + ky;
    }

    // ===================================================================================
    //                                              (Query)DerivedReferrer for Compound PK
    //                                              ======================================
    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from white_compound_pk_ref where ...)} <br />
     * white_compound_pk_ref by ref_first_id, ref_second_id, named 'whiteCompoundPkRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">derivedWhiteCompoundPkRefList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;WhiteCompoundPkRefCB&gt;() {
     *     public void query(WhiteCompoundPkRefCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #DD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WhiteCompoundPkRefCB> derivedWhiteCompoundPkRefList() {
        return xcreateQDRFunctionWhiteCompoundPkRefList();
    }
    protected HpQDRFunction<WhiteCompoundPkRefCB> xcreateQDRFunctionWhiteCompoundPkRefList() {
        return new HpQDRFunction<WhiteCompoundPkRefCB>(new HpQDRSetupper<WhiteCompoundPkRefCB>() {
            public void setup(String fn, SubQuery<WhiteCompoundPkRefCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveWhiteCompoundPkRefList(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveWhiteCompoundPkRefList(String fn, SubQuery<WhiteCompoundPkRefCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteCompoundPkRefCB cb = new WhiteCompoundPkRefCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String sqpp = keepTwoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefList(cb.query()); String prpp = keepTwoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "pk_first_id, pk_second_id", "ref_first_id, ref_second_id", sqpp, "whiteCompoundPkRefList", rd, vl, prpp, op);
    }
    protected Map<String, WhiteCompoundPkRefCQ> _twoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefListMap;
    public Map<String, WhiteCompoundPkRefCQ> getTwoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefList() { return _twoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefListMap; }
    public String keepTwoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefList(WhiteCompoundPkRefCQ sq) {
        if (_twoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefListMap == null) { _twoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_twoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefListMap.size() + 1);
        _twoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefListMap.put(ky, sq); return "twoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefList." + ky;
    }
    protected Map<String, Object> _twoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefListParameterMap;
    public Map<String, Object> getTwoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefListParameter() { return _twoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefListParameterMap; }
    public String keepTwoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefListParameter(Object vl) {
        if (_twoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefListParameterMap == null) { _twoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefListParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_twoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefListParameterMap.size() + 1);
        _twoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefListParameterMap.put(ky, vl); return "twoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefListParameter." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteCompoundPkCB.class.getName(); }
    protected String xCQ() { return WhiteCompoundPkCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
