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
 * The base condition-query of white_not_pk.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteNotPkCQ extends AbstractBsWhiteNotPkCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteNotPkCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteNotPkCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_not_pk) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteNotPkCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteNotPkCIQ xcreateCIQ() {
        WhiteNotPkCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteNotPkCIQ xnewCIQ() {
        return new WhiteNotPkCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_not_pk on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteNotPkCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteNotPkCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _notPkId;
    public ConditionValue getNotPkId() {
        if (_notPkId == null) { _notPkId = nCV(); }
        return _notPkId;
    }
    protected ConditionValue getCValueNotPkId() { return getNotPkId(); }

    /** 
     * Add order-by as ascend. <br />
     * not_pk_id: {NotNull, int8(19)}
     * @return this. (NotNull)
     */
    public BsWhiteNotPkCQ addOrderBy_NotPkId_Asc() { regOBA("not_pk_id"); return this; }

    /**
     * Add order-by as descend. <br />
     * not_pk_id: {NotNull, int8(19)}
     * @return this. (NotNull)
     */
    public BsWhiteNotPkCQ addOrderBy_NotPkId_Desc() { regOBD("not_pk_id"); return this; }

    protected ConditionValue _notPkName;
    public ConditionValue getNotPkName() {
        if (_notPkName == null) { _notPkName = nCV(); }
        return _notPkName;
    }
    protected ConditionValue getCValueNotPkName() { return getNotPkName(); }

    /** 
     * Add order-by as ascend. <br />
     * not_pk_name: {varchar(2147483647)}
     * @return this. (NotNull)
     */
    public BsWhiteNotPkCQ addOrderBy_NotPkName_Asc() { regOBA("not_pk_name"); return this; }

    /**
     * Add order-by as descend. <br />
     * not_pk_name: {varchar(2147483647)}
     * @return this. (NotNull)
     */
    public BsWhiteNotPkCQ addOrderBy_NotPkName_Desc() { regOBD("not_pk_name"); return this; }

    protected ConditionValue _notPkInteger;
    public ConditionValue getNotPkInteger() {
        if (_notPkInteger == null) { _notPkInteger = nCV(); }
        return _notPkInteger;
    }
    protected ConditionValue getCValueNotPkInteger() { return getNotPkInteger(); }

    /** 
     * Add order-by as ascend. <br />
     * not_pk_integer: {int4(10)}
     * @return this. (NotNull)
     */
    public BsWhiteNotPkCQ addOrderBy_NotPkInteger_Asc() { regOBA("not_pk_integer"); return this; }

    /**
     * Add order-by as descend. <br />
     * not_pk_integer: {int4(10)}
     * @return this. (NotNull)
     */
    public BsWhiteNotPkCQ addOrderBy_NotPkInteger_Desc() { regOBD("not_pk_integer"); return this; }

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
    public BsWhiteNotPkCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsWhiteNotPkCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
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
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteNotPkCB.class.getName(); }
    protected String xCQ() { return WhiteNotPkCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
