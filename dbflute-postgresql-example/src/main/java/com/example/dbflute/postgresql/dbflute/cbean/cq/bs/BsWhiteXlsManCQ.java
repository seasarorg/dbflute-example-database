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
 * The base condition-query of white_xls_man.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteXlsManCQ extends AbstractBsWhiteXlsManCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteXlsManCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteXlsManCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_xls_man) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteXlsManCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteXlsManCIQ xcreateCIQ() {
        WhiteXlsManCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteXlsManCIQ xnewCIQ() {
        return new WhiteXlsManCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_xls_man on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteXlsManCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteXlsManCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _xlsManId;
    public ConditionValue getXlsManId() {
        if (_xlsManId == null) { _xlsManId = nCV(); }
        return _xlsManId;
    }
    protected ConditionValue getCValueXlsManId() { return getXlsManId(); }

    /** 
     * Add order-by as ascend. <br />
     * xls_man_id: {PK, NotNull, int8(19)}
     * @return this. (NotNull)
     */
    public BsWhiteXlsManCQ addOrderBy_XlsManId_Asc() { regOBA("xls_man_id"); return this; }

    /**
     * Add order-by as descend. <br />
     * xls_man_id: {PK, NotNull, int8(19)}
     * @return this. (NotNull)
     */
    public BsWhiteXlsManCQ addOrderBy_XlsManId_Desc() { regOBD("xls_man_id"); return this; }

    protected ConditionValue _stringConverted;
    public ConditionValue getStringConverted() {
        if (_stringConverted == null) { _stringConverted = nCV(); }
        return _stringConverted;
    }
    protected ConditionValue getCValueStringConverted() { return getStringConverted(); }

    /** 
     * Add order-by as ascend. <br />
     * string_converted: {varchar(2147483647)}
     * @return this. (NotNull)
     */
    public BsWhiteXlsManCQ addOrderBy_StringConverted_Asc() { regOBA("string_converted"); return this; }

    /**
     * Add order-by as descend. <br />
     * string_converted: {varchar(2147483647)}
     * @return this. (NotNull)
     */
    public BsWhiteXlsManCQ addOrderBy_StringConverted_Desc() { regOBD("string_converted"); return this; }

    protected ConditionValue _timestampZeroDefaultMillis;
    public ConditionValue getTimestampZeroDefaultMillis() {
        if (_timestampZeroDefaultMillis == null) { _timestampZeroDefaultMillis = nCV(); }
        return _timestampZeroDefaultMillis;
    }
    protected ConditionValue getCValueTimestampZeroDefaultMillis() { return getTimestampZeroDefaultMillis(); }

    /** 
     * Add order-by as ascend. <br />
     * timestamp_zero_default_millis: {timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsWhiteXlsManCQ addOrderBy_TimestampZeroDefaultMillis_Asc() { regOBA("timestamp_zero_default_millis"); return this; }

    /**
     * Add order-by as descend. <br />
     * timestamp_zero_default_millis: {timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsWhiteXlsManCQ addOrderBy_TimestampZeroDefaultMillis_Desc() { regOBD("timestamp_zero_default_millis"); return this; }

    protected ConditionValue _timestampZeroPrefixMillis;
    public ConditionValue getTimestampZeroPrefixMillis() {
        if (_timestampZeroPrefixMillis == null) { _timestampZeroPrefixMillis = nCV(); }
        return _timestampZeroPrefixMillis;
    }
    protected ConditionValue getCValueTimestampZeroPrefixMillis() { return getTimestampZeroPrefixMillis(); }

    /** 
     * Add order-by as ascend. <br />
     * timestamp_zero_prefix_millis: {timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsWhiteXlsManCQ addOrderBy_TimestampZeroPrefixMillis_Asc() { regOBA("timestamp_zero_prefix_millis"); return this; }

    /**
     * Add order-by as descend. <br />
     * timestamp_zero_prefix_millis: {timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsWhiteXlsManCQ addOrderBy_TimestampZeroPrefixMillis_Desc() { regOBD("timestamp_zero_prefix_millis"); return this; }

    protected ConditionValue _timestampZeroSuffixMillis;
    public ConditionValue getTimestampZeroSuffixMillis() {
        if (_timestampZeroSuffixMillis == null) { _timestampZeroSuffixMillis = nCV(); }
        return _timestampZeroSuffixMillis;
    }
    protected ConditionValue getCValueTimestampZeroSuffixMillis() { return getTimestampZeroSuffixMillis(); }

    /** 
     * Add order-by as ascend. <br />
     * timestamp_zero_suffix_millis: {timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsWhiteXlsManCQ addOrderBy_TimestampZeroSuffixMillis_Asc() { regOBA("timestamp_zero_suffix_millis"); return this; }

    /**
     * Add order-by as descend. <br />
     * timestamp_zero_suffix_millis: {timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsWhiteXlsManCQ addOrderBy_TimestampZeroSuffixMillis_Desc() { regOBD("timestamp_zero_suffix_millis"); return this; }

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
    public BsWhiteXlsManCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsWhiteXlsManCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    protected Map<String, WhiteXlsManCQ> _scalarConditionMap;
    public Map<String, WhiteXlsManCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(WhiteXlsManCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, WhiteXlsManCQ> _specifyMyselfDerivedMap;
    public Map<String, WhiteXlsManCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(WhiteXlsManCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, WhiteXlsManCQ> _queryMyselfDerivedMap;
    public Map<String, WhiteXlsManCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(WhiteXlsManCQ sq) {
        if (_queryMyselfDerivedMap == null) { _queryMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_queryMyselfDerivedMap.size() + 1);
        _queryMyselfDerivedMap.put(ky, sq); return "queryMyselfDerived." + ky;
    }
    protected Map<String, Object> _qyeryMyselfDerivedParameterMap;
    public Map<String, Object> getQueryMyselfDerivedParameter() { return _qyeryMyselfDerivedParameterMap; }
    public String keepQueryMyselfDerivedParameter(Object vl) {
        if (_qyeryMyselfDerivedParameterMap == null) { _qyeryMyselfDerivedParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_qyeryMyselfDerivedParameterMap.size() + 1);
        _qyeryMyselfDerivedParameterMap.put(ky, vl); return "queryMyselfDerivedParameter." + ky;
    }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteXlsManCQ> _myselfExistsMap;
    public Map<String, WhiteXlsManCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(WhiteXlsManCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, WhiteXlsManCQ> _myselfInScopeMap;
    public Map<String, WhiteXlsManCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(WhiteXlsManCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteXlsManCB.class.getName(); }
    protected String xCQ() { return WhiteXlsManCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
