package com.example.dbflute.sqlserver.dbflute.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.sqlserver.dbflute.cbean.cq.ciq.*;
import com.example.dbflute.sqlserver.dbflute.cbean.*;
import com.example.dbflute.sqlserver.dbflute.cbean.cq.*;

/**
 * The base condition-query of VENDOR_SYMMETRIC.
 * @author DBFlute(AutoGenerator)
 */
public class BsVendorSymmetricCQ extends AbstractBsVendorSymmetricCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected VendorSymmetricCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsVendorSymmetricCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from VENDOR_SYMMETRIC) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public VendorSymmetricCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected VendorSymmetricCIQ xcreateCIQ() {
        VendorSymmetricCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected VendorSymmetricCIQ xnewCIQ() {
        return new VendorSymmetricCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join VENDOR_SYMMETRIC on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public VendorSymmetricCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        VendorSymmetricCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _vendorSymmetricId;
    public ConditionValue getVendorSymmetricId() {
        if (_vendorSymmetricId == null) { _vendorSymmetricId = nCV(); }
        return _vendorSymmetricId;
    }
    protected ConditionValue getCValueVendorSymmetricId() { return getVendorSymmetricId(); }

    /** 
     * Add order-by as ascend. <br />
     * VENDOR_SYMMETRIC_ID: {PK, NotNull, numeric(16)}
     * @return this. (NotNull)
     */
    public BsVendorSymmetricCQ addOrderBy_VendorSymmetricId_Asc() { regOBA("VENDOR_SYMMETRIC_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * VENDOR_SYMMETRIC_ID: {PK, NotNull, numeric(16)}
     * @return this. (NotNull)
     */
    public BsVendorSymmetricCQ addOrderBy_VendorSymmetricId_Desc() { regOBD("VENDOR_SYMMETRIC_ID"); return this; }

    protected ConditionValue _plainText;
    public ConditionValue getPlainText() {
        if (_plainText == null) { _plainText = nCV(); }
        return _plainText;
    }
    protected ConditionValue getCValuePlainText() { return getPlainText(); }

    /** 
     * Add order-by as ascend. <br />
     * PLAIN_TEXT: {nvarchar(100)}
     * @return this. (NotNull)
     */
    public BsVendorSymmetricCQ addOrderBy_PlainText_Asc() { regOBA("PLAIN_TEXT"); return this; }

    /**
     * Add order-by as descend. <br />
     * PLAIN_TEXT: {nvarchar(100)}
     * @return this. (NotNull)
     */
    public BsVendorSymmetricCQ addOrderBy_PlainText_Desc() { regOBD("PLAIN_TEXT"); return this; }

    protected ConditionValue _encryptedData;
    public ConditionValue getEncryptedData() {
        if (_encryptedData == null) { _encryptedData = nCV(); }
        return _encryptedData;
    }
    protected ConditionValue getCValueEncryptedData() { return getEncryptedData(); }

    /** 
     * Add order-by as ascend. <br />
     * ENCRYPTED_DATA: {image(2147483647)}
     * @return this. (NotNull)
     */
    public BsVendorSymmetricCQ addOrderBy_EncryptedData_Asc() { regOBA("ENCRYPTED_DATA"); return this; }

    /**
     * Add order-by as descend. <br />
     * ENCRYPTED_DATA: {image(2147483647)}
     * @return this. (NotNull)
     */
    public BsVendorSymmetricCQ addOrderBy_EncryptedData_Desc() { regOBD("ENCRYPTED_DATA"); return this; }

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
    public BsVendorSymmetricCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsVendorSymmetricCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
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
    protected Map<String, VendorSymmetricCQ> _scalarConditionMap;
    public Map<String, VendorSymmetricCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(VendorSymmetricCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, VendorSymmetricCQ> _specifyMyselfDerivedMap;
    public Map<String, VendorSymmetricCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(VendorSymmetricCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, VendorSymmetricCQ> _queryMyselfDerivedMap;
    public Map<String, VendorSymmetricCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(VendorSymmetricCQ sq) {
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
    protected Map<String, VendorSymmetricCQ> _myselfExistsMap;
    public Map<String, VendorSymmetricCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(VendorSymmetricCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, VendorSymmetricCQ> _myselfInScopeMap;
    public Map<String, VendorSymmetricCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(VendorSymmetricCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return VendorSymmetricCB.class.getName(); }
    protected String xCQ() { return VendorSymmetricCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
