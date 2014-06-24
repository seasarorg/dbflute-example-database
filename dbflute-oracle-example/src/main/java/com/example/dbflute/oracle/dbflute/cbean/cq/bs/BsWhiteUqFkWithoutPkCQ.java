package com.example.dbflute.oracle.dbflute.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.oracle.dbflute.cbean.cq.ciq.*;
import com.example.dbflute.oracle.dbflute.cbean.*;
import com.example.dbflute.oracle.dbflute.cbean.cq.*;

/**
 * The base condition-query of WHITE_UQ_FK_WITHOUT_PK.
 * @author oracleman
 */
public class BsWhiteUqFkWithoutPkCQ extends AbstractBsWhiteUqFkWithoutPkCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteUqFkWithoutPkCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteUqFkWithoutPkCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from WHITE_UQ_FK_WITHOUT_PK) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteUqFkWithoutPkCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteUqFkWithoutPkCIQ xcreateCIQ() {
        WhiteUqFkWithoutPkCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteUqFkWithoutPkCIQ xnewCIQ() {
        return new WhiteUqFkWithoutPkCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join WHITE_UQ_FK_WITHOUT_PK on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteUqFkWithoutPkCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteUqFkWithoutPkCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _uqFkCode;
    public ConditionValue getUqFkCode()
    { if (_uqFkCode == null) { _uqFkCode = nCV(); }
      return _uqFkCode; }
    protected ConditionValue getCValueUqFkCode() { return getUqFkCode(); }

    public Map<String, WhiteUqFkWithoutPkRefCQ> getUqFkCode_ExistsReferrer_WhiteUqFkWithoutPkRefList() { return xgetSQueMap("uqFkCode_ExistsReferrer_WhiteUqFkWithoutPkRefList"); }
    public String keepUqFkCode_ExistsReferrer_WhiteUqFkWithoutPkRefList(WhiteUqFkWithoutPkRefCQ sq) { return xkeepSQue("uqFkCode_ExistsReferrer_WhiteUqFkWithoutPkRefList", sq); }

    public Map<String, WhiteUqFkWithoutPkRefCQ> getUqFkCode_NotExistsReferrer_WhiteUqFkWithoutPkRefList() { return xgetSQueMap("uqFkCode_NotExistsReferrer_WhiteUqFkWithoutPkRefList"); }
    public String keepUqFkCode_NotExistsReferrer_WhiteUqFkWithoutPkRefList(WhiteUqFkWithoutPkRefCQ sq) { return xkeepSQue("uqFkCode_NotExistsReferrer_WhiteUqFkWithoutPkRefList", sq); }

    public Map<String, WhiteUqFkWithoutPkRefCQ> getUqFkCode_InScopeRelation_WhiteUqFkWithoutPkRefList() { return xgetSQueMap("uqFkCode_InScopeRelation_WhiteUqFkWithoutPkRefList"); }
    public String keepUqFkCode_InScopeRelation_WhiteUqFkWithoutPkRefList(WhiteUqFkWithoutPkRefCQ sq) { return xkeepSQue("uqFkCode_InScopeRelation_WhiteUqFkWithoutPkRefList", sq); }

    public Map<String, WhiteUqFkWithoutPkRefCQ> getUqFkCode_NotInScopeRelation_WhiteUqFkWithoutPkRefList() { return xgetSQueMap("uqFkCode_NotInScopeRelation_WhiteUqFkWithoutPkRefList"); }
    public String keepUqFkCode_NotInScopeRelation_WhiteUqFkWithoutPkRefList(WhiteUqFkWithoutPkRefCQ sq) { return xkeepSQue("uqFkCode_NotInScopeRelation_WhiteUqFkWithoutPkRefList", sq); }

    public Map<String, WhiteUqFkWithoutPkRefCQ> getUqFkCode_SpecifyDerivedReferrer_WhiteUqFkWithoutPkRefList() { return xgetSQueMap("uqFkCode_SpecifyDerivedReferrer_WhiteUqFkWithoutPkRefList"); }
    public String keepUqFkCode_SpecifyDerivedReferrer_WhiteUqFkWithoutPkRefList(WhiteUqFkWithoutPkRefCQ sq) { return xkeepSQue("uqFkCode_SpecifyDerivedReferrer_WhiteUqFkWithoutPkRefList", sq); }

    public Map<String, WhiteUqFkWithoutPkRefCQ> getUqFkCode_QueryDerivedReferrer_WhiteUqFkWithoutPkRefList() { return xgetSQueMap("uqFkCode_QueryDerivedReferrer_WhiteUqFkWithoutPkRefList"); }
    public String keepUqFkCode_QueryDerivedReferrer_WhiteUqFkWithoutPkRefList(WhiteUqFkWithoutPkRefCQ sq) { return xkeepSQue("uqFkCode_QueryDerivedReferrer_WhiteUqFkWithoutPkRefList", sq); }
    public Map<String, Object> getUqFkCode_QueryDerivedReferrer_WhiteUqFkWithoutPkRefListParameter() { return xgetSQuePmMap("uqFkCode_QueryDerivedReferrer_WhiteUqFkWithoutPkRefList"); }
    public String keepUqFkCode_QueryDerivedReferrer_WhiteUqFkWithoutPkRefListParameter(Object pm) { return xkeepSQuePm("uqFkCode_QueryDerivedReferrer_WhiteUqFkWithoutPkRefList", pm); }

    /** 
     * Add order-by as ascend. <br />
     * UQ_FK_CODE: {UQ, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsWhiteUqFkWithoutPkCQ addOrderBy_UqFkCode_Asc() { regOBA("UQ_FK_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * UQ_FK_CODE: {UQ, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsWhiteUqFkWithoutPkCQ addOrderBy_UqFkCode_Desc() { regOBD("UQ_FK_CODE"); return this; }

    protected ConditionValue _uqFkName;
    public ConditionValue getUqFkName()
    { if (_uqFkName == null) { _uqFkName = nCV(); }
      return _uqFkName; }
    protected ConditionValue getCValueUqFkName() { return getUqFkName(); }

    /** 
     * Add order-by as ascend. <br />
     * UQ_FK_NAME: {NotNull, VARCHAR2(64)}
     * @return this. (NotNull)
     */
    public BsWhiteUqFkWithoutPkCQ addOrderBy_UqFkName_Asc() { regOBA("UQ_FK_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * UQ_FK_NAME: {NotNull, VARCHAR2(64)}
     * @return this. (NotNull)
     */
    public BsWhiteUqFkWithoutPkCQ addOrderBy_UqFkName_Desc() { regOBD("UQ_FK_NAME"); return this; }

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
    public BsWhiteUqFkWithoutPkCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteUqFkWithoutPkCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, WhiteUqFkWithoutPkCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteUqFkWithoutPkCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteUqFkWithoutPkCB.class.getName(); }
    protected String xCQ() { return WhiteUqFkWithoutPkCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
