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
 * The base condition-query of next_schema_product.
 * @author DBFlute(AutoGenerator)
 */
public class BsNextSchemaProductCQ extends AbstractBsNextSchemaProductCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected NextSchemaProductCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsNextSchemaProductCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from next_schema_product) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public NextSchemaProductCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected NextSchemaProductCIQ xcreateCIQ() {
        NextSchemaProductCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected NextSchemaProductCIQ xnewCIQ() {
        return new NextSchemaProductCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join next_schema_product on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public NextSchemaProductCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        NextSchemaProductCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _productId;
    public ConditionValue getProductId()
    { if (_productId == null) { _productId = nCV(); }
      return _productId; }
    protected ConditionValue getCValueProductId() { return getProductId(); }

    public Map<String, WhiteSameNameCQ> getProductId_ExistsReferrer_WhiteSameNameList() { return xgetSQueMap("productId_ExistsReferrer_WhiteSameNameList"); }
    public String keepProductId_ExistsReferrer_WhiteSameNameList(WhiteSameNameCQ sq) { return xkeepSQue("productId_ExistsReferrer_WhiteSameNameList", sq); }

    public Map<String, WhiteSameNameCQ> getProductId_NotExistsReferrer_WhiteSameNameList() { return xgetSQueMap("productId_NotExistsReferrer_WhiteSameNameList"); }
    public String keepProductId_NotExistsReferrer_WhiteSameNameList(WhiteSameNameCQ sq) { return xkeepSQue("productId_NotExistsReferrer_WhiteSameNameList", sq); }

    public Map<String, WhiteSameNameCQ> getProductId_SpecifyDerivedReferrer_WhiteSameNameList() { return xgetSQueMap("productId_SpecifyDerivedReferrer_WhiteSameNameList"); }
    public String keepProductId_SpecifyDerivedReferrer_WhiteSameNameList(WhiteSameNameCQ sq) { return xkeepSQue("productId_SpecifyDerivedReferrer_WhiteSameNameList", sq); }

    public Map<String, WhiteSameNameCQ> getProductId_InScopeRelation_WhiteSameNameList() { return xgetSQueMap("productId_InScopeRelation_WhiteSameNameList"); }
    public String keepProductId_InScopeRelation_WhiteSameNameList(WhiteSameNameCQ sq) { return xkeepSQue("productId_InScopeRelation_WhiteSameNameList", sq); }

    public Map<String, WhiteSameNameCQ> getProductId_NotInScopeRelation_WhiteSameNameList() { return xgetSQueMap("productId_NotInScopeRelation_WhiteSameNameList"); }
    public String keepProductId_NotInScopeRelation_WhiteSameNameList(WhiteSameNameCQ sq) { return xkeepSQue("productId_NotInScopeRelation_WhiteSameNameList", sq); }

    public Map<String, WhiteSameNameCQ> getProductId_QueryDerivedReferrer_WhiteSameNameList() { return xgetSQueMap("productId_QueryDerivedReferrer_WhiteSameNameList"); }
    public String keepProductId_QueryDerivedReferrer_WhiteSameNameList(WhiteSameNameCQ sq) { return xkeepSQue("productId_QueryDerivedReferrer_WhiteSameNameList", sq); }
    public Map<String, Object> getProductId_QueryDerivedReferrer_WhiteSameNameListParameter() { return xgetSQuePmMap("productId_QueryDerivedReferrer_WhiteSameNameList"); }
    public String keepProductId_QueryDerivedReferrer_WhiteSameNameListParameter(Object pm) { return xkeepSQuePm("productId_QueryDerivedReferrer_WhiteSameNameList", pm); }

    /** 
     * Add order-by as ascend. <br />
     * product_id: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsNextSchemaProductCQ addOrderBy_ProductId_Asc() { regOBA("product_id"); return this; }

    /**
     * Add order-by as descend. <br />
     * product_id: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsNextSchemaProductCQ addOrderBy_ProductId_Desc() { regOBD("product_id"); return this; }

    protected ConditionValue _productName;
    public ConditionValue getProductName()
    { if (_productName == null) { _productName = nCV(); }
      return _productName; }
    protected ConditionValue getCValueProductName() { return getProductName(); }

    /** 
     * Add order-by as ascend. <br />
     * product_name: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsNextSchemaProductCQ addOrderBy_ProductName_Asc() { regOBA("product_name"); return this; }

    /**
     * Add order-by as descend. <br />
     * product_name: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsNextSchemaProductCQ addOrderBy_ProductName_Desc() { regOBD("product_name"); return this; }

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
    public BsNextSchemaProductCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsNextSchemaProductCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, NextSchemaProductCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(NextSchemaProductCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, NextSchemaProductCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(NextSchemaProductCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, NextSchemaProductCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(NextSchemaProductCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, NextSchemaProductCQ> _myselfExistsMap;
    public Map<String, NextSchemaProductCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(NextSchemaProductCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, NextSchemaProductCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(NextSchemaProductCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return NextSchemaProductCB.class.getName(); }
    protected String xCQ() { return NextSchemaProductCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
