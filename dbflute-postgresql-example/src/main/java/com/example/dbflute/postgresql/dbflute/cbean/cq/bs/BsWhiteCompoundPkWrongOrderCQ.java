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
 * The base condition-query of white_compound_pk_wrong_order.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteCompoundPkWrongOrderCQ extends AbstractBsWhiteCompoundPkWrongOrderCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteCompoundPkWrongOrderCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteCompoundPkWrongOrderCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_compound_pk_wrong_order) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteCompoundPkWrongOrderCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteCompoundPkWrongOrderCIQ xcreateCIQ() {
        WhiteCompoundPkWrongOrderCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteCompoundPkWrongOrderCIQ xnewCIQ() {
        return new WhiteCompoundPkWrongOrderCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_compound_pk_wrong_order on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteCompoundPkWrongOrderCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteCompoundPkWrongOrderCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _firstId;
    public ConditionValue getFirstId()
    { if (_firstId == null) { _firstId = nCV(); }
      return _firstId; }
    protected ConditionValue getCValueFirstId() { return getFirstId(); }

    /** 
     * Add order-by as ascend. <br />
     * first_id: {PK, NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkWrongOrderCQ addOrderBy_FirstId_Asc() { regOBA("first_id"); return this; }

    /**
     * Add order-by as descend. <br />
     * first_id: {PK, NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkWrongOrderCQ addOrderBy_FirstId_Desc() { regOBD("first_id"); return this; }

    protected ConditionValue _secondId;
    public ConditionValue getSecondId()
    { if (_secondId == null) { _secondId = nCV(); }
      return _secondId; }
    protected ConditionValue getCValueSecondId() { return getSecondId(); }

    /** 
     * Add order-by as ascend. <br />
     * second_id: {PK, NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkWrongOrderCQ addOrderBy_SecondId_Asc() { regOBA("second_id"); return this; }

    /**
     * Add order-by as descend. <br />
     * second_id: {PK, NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkWrongOrderCQ addOrderBy_SecondId_Desc() { regOBD("second_id"); return this; }

    protected ConditionValue _thirdId;
    public ConditionValue getThirdId()
    { if (_thirdId == null) { _thirdId = nCV(); }
      return _thirdId; }
    protected ConditionValue getCValueThirdId() { return getThirdId(); }

    /** 
     * Add order-by as ascend. <br />
     * third_id: {PK, NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkWrongOrderCQ addOrderBy_ThirdId_Asc() { regOBA("third_id"); return this; }

    /**
     * Add order-by as descend. <br />
     * third_id: {PK, NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkWrongOrderCQ addOrderBy_ThirdId_Desc() { regOBD("third_id"); return this; }

    protected ConditionValue _wrongName;
    public ConditionValue getWrongName()
    { if (_wrongName == null) { _wrongName = nCV(); }
      return _wrongName; }
    protected ConditionValue getCValueWrongName() { return getWrongName(); }

    /** 
     * Add order-by as ascend. <br />
     * wrong_name: {varchar(200)}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkWrongOrderCQ addOrderBy_WrongName_Asc() { regOBA("wrong_name"); return this; }

    /**
     * Add order-by as descend. <br />
     * wrong_name: {varchar(200)}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkWrongOrderCQ addOrderBy_WrongName_Desc() { regOBD("wrong_name"); return this; }

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
    public BsWhiteCompoundPkWrongOrderCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteCompoundPkWrongOrderCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, WhiteCompoundPkWrongOrderCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteCompoundPkWrongOrderCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteCompoundPkWrongOrderCB.class.getName(); }
    protected String xCQ() { return WhiteCompoundPkWrongOrderCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
