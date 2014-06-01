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
 * The base condition-query of MEMBER_STATUS.
 * @author oracleman
 */
public class BsMemberStatusCQ extends AbstractBsMemberStatusCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MemberStatusCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMemberStatusCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from MEMBER_STATUS) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MemberStatusCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MemberStatusCIQ xcreateCIQ() {
        MemberStatusCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MemberStatusCIQ xnewCIQ() {
        return new MemberStatusCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join MEMBER_STATUS on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MemberStatusCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MemberStatusCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _memberStatusCode;
    public ConditionValue getMemberStatusCode() {
        if (_memberStatusCode == null) { _memberStatusCode = nCV(); }
        return _memberStatusCode;
    }
    protected ConditionValue getCValueMemberStatusCode() { return getMemberStatusCode(); }

    protected Map<String, MemberCQ> _memberStatusCode_ExistsReferrer_MemberListMap;
    public Map<String, MemberCQ> getMemberStatusCode_ExistsReferrer_MemberList() { return _memberStatusCode_ExistsReferrer_MemberListMap; }
    public String keepMemberStatusCode_ExistsReferrer_MemberList(MemberCQ sq) {
        if (_memberStatusCode_ExistsReferrer_MemberListMap == null) { _memberStatusCode_ExistsReferrer_MemberListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberStatusCode_ExistsReferrer_MemberListMap.size() + 1);
        _memberStatusCode_ExistsReferrer_MemberListMap.put(ky, sq); return "memberStatusCode_ExistsReferrer_MemberList." + ky;
    }

    protected Map<String, MemberLoginCQ> _memberStatusCode_ExistsReferrer_MemberLoginListMap;
    public Map<String, MemberLoginCQ> getMemberStatusCode_ExistsReferrer_MemberLoginList() { return _memberStatusCode_ExistsReferrer_MemberLoginListMap; }
    public String keepMemberStatusCode_ExistsReferrer_MemberLoginList(MemberLoginCQ sq) {
        if (_memberStatusCode_ExistsReferrer_MemberLoginListMap == null) { _memberStatusCode_ExistsReferrer_MemberLoginListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberStatusCode_ExistsReferrer_MemberLoginListMap.size() + 1);
        _memberStatusCode_ExistsReferrer_MemberLoginListMap.put(ky, sq); return "memberStatusCode_ExistsReferrer_MemberLoginList." + ky;
    }

    protected Map<String, MemberVendorSynonymCQ> _memberStatusCode_ExistsReferrer_MemberVendorSynonymListMap;
    public Map<String, MemberVendorSynonymCQ> getMemberStatusCode_ExistsReferrer_MemberVendorSynonymList() { return _memberStatusCode_ExistsReferrer_MemberVendorSynonymListMap; }
    public String keepMemberStatusCode_ExistsReferrer_MemberVendorSynonymList(MemberVendorSynonymCQ sq) {
        if (_memberStatusCode_ExistsReferrer_MemberVendorSynonymListMap == null) { _memberStatusCode_ExistsReferrer_MemberVendorSynonymListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberStatusCode_ExistsReferrer_MemberVendorSynonymListMap.size() + 1);
        _memberStatusCode_ExistsReferrer_MemberVendorSynonymListMap.put(ky, sq); return "memberStatusCode_ExistsReferrer_MemberVendorSynonymList." + ky;
    }

    protected Map<String, SynonymMemberCQ> _memberStatusCode_ExistsReferrer_SynonymMemberListMap;
    public Map<String, SynonymMemberCQ> getMemberStatusCode_ExistsReferrer_SynonymMemberList() { return _memberStatusCode_ExistsReferrer_SynonymMemberListMap; }
    public String keepMemberStatusCode_ExistsReferrer_SynonymMemberList(SynonymMemberCQ sq) {
        if (_memberStatusCode_ExistsReferrer_SynonymMemberListMap == null) { _memberStatusCode_ExistsReferrer_SynonymMemberListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberStatusCode_ExistsReferrer_SynonymMemberListMap.size() + 1);
        _memberStatusCode_ExistsReferrer_SynonymMemberListMap.put(ky, sq); return "memberStatusCode_ExistsReferrer_SynonymMemberList." + ky;
    }

    protected Map<String, SynonymMemberLoginCQ> _memberStatusCode_ExistsReferrer_SynonymMemberLoginListMap;
    public Map<String, SynonymMemberLoginCQ> getMemberStatusCode_ExistsReferrer_SynonymMemberLoginList() { return _memberStatusCode_ExistsReferrer_SynonymMemberLoginListMap; }
    public String keepMemberStatusCode_ExistsReferrer_SynonymMemberLoginList(SynonymMemberLoginCQ sq) {
        if (_memberStatusCode_ExistsReferrer_SynonymMemberLoginListMap == null) { _memberStatusCode_ExistsReferrer_SynonymMemberLoginListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberStatusCode_ExistsReferrer_SynonymMemberLoginListMap.size() + 1);
        _memberStatusCode_ExistsReferrer_SynonymMemberLoginListMap.put(ky, sq); return "memberStatusCode_ExistsReferrer_SynonymMemberLoginList." + ky;
    }

    protected Map<String, VendorSynonymMemberCQ> _memberStatusCode_ExistsReferrer_VendorSynonymMemberListMap;
    public Map<String, VendorSynonymMemberCQ> getMemberStatusCode_ExistsReferrer_VendorSynonymMemberList() { return _memberStatusCode_ExistsReferrer_VendorSynonymMemberListMap; }
    public String keepMemberStatusCode_ExistsReferrer_VendorSynonymMemberList(VendorSynonymMemberCQ sq) {
        if (_memberStatusCode_ExistsReferrer_VendorSynonymMemberListMap == null) { _memberStatusCode_ExistsReferrer_VendorSynonymMemberListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberStatusCode_ExistsReferrer_VendorSynonymMemberListMap.size() + 1);
        _memberStatusCode_ExistsReferrer_VendorSynonymMemberListMap.put(ky, sq); return "memberStatusCode_ExistsReferrer_VendorSynonymMemberList." + ky;
    }

    protected Map<String, MemberCQ> _memberStatusCode_NotExistsReferrer_MemberListMap;
    public Map<String, MemberCQ> getMemberStatusCode_NotExistsReferrer_MemberList() { return _memberStatusCode_NotExistsReferrer_MemberListMap; }
    public String keepMemberStatusCode_NotExistsReferrer_MemberList(MemberCQ sq) {
        if (_memberStatusCode_NotExistsReferrer_MemberListMap == null) { _memberStatusCode_NotExistsReferrer_MemberListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberStatusCode_NotExistsReferrer_MemberListMap.size() + 1);
        _memberStatusCode_NotExistsReferrer_MemberListMap.put(ky, sq); return "memberStatusCode_NotExistsReferrer_MemberList." + ky;
    }

    protected Map<String, MemberLoginCQ> _memberStatusCode_NotExistsReferrer_MemberLoginListMap;
    public Map<String, MemberLoginCQ> getMemberStatusCode_NotExistsReferrer_MemberLoginList() { return _memberStatusCode_NotExistsReferrer_MemberLoginListMap; }
    public String keepMemberStatusCode_NotExistsReferrer_MemberLoginList(MemberLoginCQ sq) {
        if (_memberStatusCode_NotExistsReferrer_MemberLoginListMap == null) { _memberStatusCode_NotExistsReferrer_MemberLoginListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberStatusCode_NotExistsReferrer_MemberLoginListMap.size() + 1);
        _memberStatusCode_NotExistsReferrer_MemberLoginListMap.put(ky, sq); return "memberStatusCode_NotExistsReferrer_MemberLoginList." + ky;
    }

    protected Map<String, MemberVendorSynonymCQ> _memberStatusCode_NotExistsReferrer_MemberVendorSynonymListMap;
    public Map<String, MemberVendorSynonymCQ> getMemberStatusCode_NotExistsReferrer_MemberVendorSynonymList() { return _memberStatusCode_NotExistsReferrer_MemberVendorSynonymListMap; }
    public String keepMemberStatusCode_NotExistsReferrer_MemberVendorSynonymList(MemberVendorSynonymCQ sq) {
        if (_memberStatusCode_NotExistsReferrer_MemberVendorSynonymListMap == null) { _memberStatusCode_NotExistsReferrer_MemberVendorSynonymListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberStatusCode_NotExistsReferrer_MemberVendorSynonymListMap.size() + 1);
        _memberStatusCode_NotExistsReferrer_MemberVendorSynonymListMap.put(ky, sq); return "memberStatusCode_NotExistsReferrer_MemberVendorSynonymList." + ky;
    }

    protected Map<String, SynonymMemberCQ> _memberStatusCode_NotExistsReferrer_SynonymMemberListMap;
    public Map<String, SynonymMemberCQ> getMemberStatusCode_NotExistsReferrer_SynonymMemberList() { return _memberStatusCode_NotExistsReferrer_SynonymMemberListMap; }
    public String keepMemberStatusCode_NotExistsReferrer_SynonymMemberList(SynonymMemberCQ sq) {
        if (_memberStatusCode_NotExistsReferrer_SynonymMemberListMap == null) { _memberStatusCode_NotExistsReferrer_SynonymMemberListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberStatusCode_NotExistsReferrer_SynonymMemberListMap.size() + 1);
        _memberStatusCode_NotExistsReferrer_SynonymMemberListMap.put(ky, sq); return "memberStatusCode_NotExistsReferrer_SynonymMemberList." + ky;
    }

    protected Map<String, SynonymMemberLoginCQ> _memberStatusCode_NotExistsReferrer_SynonymMemberLoginListMap;
    public Map<String, SynonymMemberLoginCQ> getMemberStatusCode_NotExistsReferrer_SynonymMemberLoginList() { return _memberStatusCode_NotExistsReferrer_SynonymMemberLoginListMap; }
    public String keepMemberStatusCode_NotExistsReferrer_SynonymMemberLoginList(SynonymMemberLoginCQ sq) {
        if (_memberStatusCode_NotExistsReferrer_SynonymMemberLoginListMap == null) { _memberStatusCode_NotExistsReferrer_SynonymMemberLoginListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberStatusCode_NotExistsReferrer_SynonymMemberLoginListMap.size() + 1);
        _memberStatusCode_NotExistsReferrer_SynonymMemberLoginListMap.put(ky, sq); return "memberStatusCode_NotExistsReferrer_SynonymMemberLoginList." + ky;
    }

    protected Map<String, VendorSynonymMemberCQ> _memberStatusCode_NotExistsReferrer_VendorSynonymMemberListMap;
    public Map<String, VendorSynonymMemberCQ> getMemberStatusCode_NotExistsReferrer_VendorSynonymMemberList() { return _memberStatusCode_NotExistsReferrer_VendorSynonymMemberListMap; }
    public String keepMemberStatusCode_NotExistsReferrer_VendorSynonymMemberList(VendorSynonymMemberCQ sq) {
        if (_memberStatusCode_NotExistsReferrer_VendorSynonymMemberListMap == null) { _memberStatusCode_NotExistsReferrer_VendorSynonymMemberListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberStatusCode_NotExistsReferrer_VendorSynonymMemberListMap.size() + 1);
        _memberStatusCode_NotExistsReferrer_VendorSynonymMemberListMap.put(ky, sq); return "memberStatusCode_NotExistsReferrer_VendorSynonymMemberList." + ky;
    }

    protected Map<String, MemberCQ> _memberStatusCode_InScopeRelation_MemberListMap;
    public Map<String, MemberCQ> getMemberStatusCode_InScopeRelation_MemberList() { return _memberStatusCode_InScopeRelation_MemberListMap; }
    public String keepMemberStatusCode_InScopeRelation_MemberList(MemberCQ sq) {
        if (_memberStatusCode_InScopeRelation_MemberListMap == null) { _memberStatusCode_InScopeRelation_MemberListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberStatusCode_InScopeRelation_MemberListMap.size() + 1);
        _memberStatusCode_InScopeRelation_MemberListMap.put(ky, sq); return "memberStatusCode_InScopeRelation_MemberList." + ky;
    }

    protected Map<String, MemberLoginCQ> _memberStatusCode_InScopeRelation_MemberLoginListMap;
    public Map<String, MemberLoginCQ> getMemberStatusCode_InScopeRelation_MemberLoginList() { return _memberStatusCode_InScopeRelation_MemberLoginListMap; }
    public String keepMemberStatusCode_InScopeRelation_MemberLoginList(MemberLoginCQ sq) {
        if (_memberStatusCode_InScopeRelation_MemberLoginListMap == null) { _memberStatusCode_InScopeRelation_MemberLoginListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberStatusCode_InScopeRelation_MemberLoginListMap.size() + 1);
        _memberStatusCode_InScopeRelation_MemberLoginListMap.put(ky, sq); return "memberStatusCode_InScopeRelation_MemberLoginList." + ky;
    }

    protected Map<String, MemberVendorSynonymCQ> _memberStatusCode_InScopeRelation_MemberVendorSynonymListMap;
    public Map<String, MemberVendorSynonymCQ> getMemberStatusCode_InScopeRelation_MemberVendorSynonymList() { return _memberStatusCode_InScopeRelation_MemberVendorSynonymListMap; }
    public String keepMemberStatusCode_InScopeRelation_MemberVendorSynonymList(MemberVendorSynonymCQ sq) {
        if (_memberStatusCode_InScopeRelation_MemberVendorSynonymListMap == null) { _memberStatusCode_InScopeRelation_MemberVendorSynonymListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberStatusCode_InScopeRelation_MemberVendorSynonymListMap.size() + 1);
        _memberStatusCode_InScopeRelation_MemberVendorSynonymListMap.put(ky, sq); return "memberStatusCode_InScopeRelation_MemberVendorSynonymList." + ky;
    }

    protected Map<String, SynonymMemberCQ> _memberStatusCode_InScopeRelation_SynonymMemberListMap;
    public Map<String, SynonymMemberCQ> getMemberStatusCode_InScopeRelation_SynonymMemberList() { return _memberStatusCode_InScopeRelation_SynonymMemberListMap; }
    public String keepMemberStatusCode_InScopeRelation_SynonymMemberList(SynonymMemberCQ sq) {
        if (_memberStatusCode_InScopeRelation_SynonymMemberListMap == null) { _memberStatusCode_InScopeRelation_SynonymMemberListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberStatusCode_InScopeRelation_SynonymMemberListMap.size() + 1);
        _memberStatusCode_InScopeRelation_SynonymMemberListMap.put(ky, sq); return "memberStatusCode_InScopeRelation_SynonymMemberList." + ky;
    }

    protected Map<String, SynonymMemberLoginCQ> _memberStatusCode_InScopeRelation_SynonymMemberLoginListMap;
    public Map<String, SynonymMemberLoginCQ> getMemberStatusCode_InScopeRelation_SynonymMemberLoginList() { return _memberStatusCode_InScopeRelation_SynonymMemberLoginListMap; }
    public String keepMemberStatusCode_InScopeRelation_SynonymMemberLoginList(SynonymMemberLoginCQ sq) {
        if (_memberStatusCode_InScopeRelation_SynonymMemberLoginListMap == null) { _memberStatusCode_InScopeRelation_SynonymMemberLoginListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberStatusCode_InScopeRelation_SynonymMemberLoginListMap.size() + 1);
        _memberStatusCode_InScopeRelation_SynonymMemberLoginListMap.put(ky, sq); return "memberStatusCode_InScopeRelation_SynonymMemberLoginList." + ky;
    }

    protected Map<String, VendorSynonymMemberCQ> _memberStatusCode_InScopeRelation_VendorSynonymMemberListMap;
    public Map<String, VendorSynonymMemberCQ> getMemberStatusCode_InScopeRelation_VendorSynonymMemberList() { return _memberStatusCode_InScopeRelation_VendorSynonymMemberListMap; }
    public String keepMemberStatusCode_InScopeRelation_VendorSynonymMemberList(VendorSynonymMemberCQ sq) {
        if (_memberStatusCode_InScopeRelation_VendorSynonymMemberListMap == null) { _memberStatusCode_InScopeRelation_VendorSynonymMemberListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberStatusCode_InScopeRelation_VendorSynonymMemberListMap.size() + 1);
        _memberStatusCode_InScopeRelation_VendorSynonymMemberListMap.put(ky, sq); return "memberStatusCode_InScopeRelation_VendorSynonymMemberList." + ky;
    }

    protected Map<String, MemberCQ> _memberStatusCode_NotInScopeRelation_MemberListMap;
    public Map<String, MemberCQ> getMemberStatusCode_NotInScopeRelation_MemberList() { return _memberStatusCode_NotInScopeRelation_MemberListMap; }
    public String keepMemberStatusCode_NotInScopeRelation_MemberList(MemberCQ sq) {
        if (_memberStatusCode_NotInScopeRelation_MemberListMap == null) { _memberStatusCode_NotInScopeRelation_MemberListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberStatusCode_NotInScopeRelation_MemberListMap.size() + 1);
        _memberStatusCode_NotInScopeRelation_MemberListMap.put(ky, sq); return "memberStatusCode_NotInScopeRelation_MemberList." + ky;
    }

    protected Map<String, MemberLoginCQ> _memberStatusCode_NotInScopeRelation_MemberLoginListMap;
    public Map<String, MemberLoginCQ> getMemberStatusCode_NotInScopeRelation_MemberLoginList() { return _memberStatusCode_NotInScopeRelation_MemberLoginListMap; }
    public String keepMemberStatusCode_NotInScopeRelation_MemberLoginList(MemberLoginCQ sq) {
        if (_memberStatusCode_NotInScopeRelation_MemberLoginListMap == null) { _memberStatusCode_NotInScopeRelation_MemberLoginListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberStatusCode_NotInScopeRelation_MemberLoginListMap.size() + 1);
        _memberStatusCode_NotInScopeRelation_MemberLoginListMap.put(ky, sq); return "memberStatusCode_NotInScopeRelation_MemberLoginList." + ky;
    }

    protected Map<String, MemberVendorSynonymCQ> _memberStatusCode_NotInScopeRelation_MemberVendorSynonymListMap;
    public Map<String, MemberVendorSynonymCQ> getMemberStatusCode_NotInScopeRelation_MemberVendorSynonymList() { return _memberStatusCode_NotInScopeRelation_MemberVendorSynonymListMap; }
    public String keepMemberStatusCode_NotInScopeRelation_MemberVendorSynonymList(MemberVendorSynonymCQ sq) {
        if (_memberStatusCode_NotInScopeRelation_MemberVendorSynonymListMap == null) { _memberStatusCode_NotInScopeRelation_MemberVendorSynonymListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberStatusCode_NotInScopeRelation_MemberVendorSynonymListMap.size() + 1);
        _memberStatusCode_NotInScopeRelation_MemberVendorSynonymListMap.put(ky, sq); return "memberStatusCode_NotInScopeRelation_MemberVendorSynonymList." + ky;
    }

    protected Map<String, SynonymMemberCQ> _memberStatusCode_NotInScopeRelation_SynonymMemberListMap;
    public Map<String, SynonymMemberCQ> getMemberStatusCode_NotInScopeRelation_SynonymMemberList() { return _memberStatusCode_NotInScopeRelation_SynonymMemberListMap; }
    public String keepMemberStatusCode_NotInScopeRelation_SynonymMemberList(SynonymMemberCQ sq) {
        if (_memberStatusCode_NotInScopeRelation_SynonymMemberListMap == null) { _memberStatusCode_NotInScopeRelation_SynonymMemberListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberStatusCode_NotInScopeRelation_SynonymMemberListMap.size() + 1);
        _memberStatusCode_NotInScopeRelation_SynonymMemberListMap.put(ky, sq); return "memberStatusCode_NotInScopeRelation_SynonymMemberList." + ky;
    }

    protected Map<String, SynonymMemberLoginCQ> _memberStatusCode_NotInScopeRelation_SynonymMemberLoginListMap;
    public Map<String, SynonymMemberLoginCQ> getMemberStatusCode_NotInScopeRelation_SynonymMemberLoginList() { return _memberStatusCode_NotInScopeRelation_SynonymMemberLoginListMap; }
    public String keepMemberStatusCode_NotInScopeRelation_SynonymMemberLoginList(SynonymMemberLoginCQ sq) {
        if (_memberStatusCode_NotInScopeRelation_SynonymMemberLoginListMap == null) { _memberStatusCode_NotInScopeRelation_SynonymMemberLoginListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberStatusCode_NotInScopeRelation_SynonymMemberLoginListMap.size() + 1);
        _memberStatusCode_NotInScopeRelation_SynonymMemberLoginListMap.put(ky, sq); return "memberStatusCode_NotInScopeRelation_SynonymMemberLoginList." + ky;
    }

    protected Map<String, VendorSynonymMemberCQ> _memberStatusCode_NotInScopeRelation_VendorSynonymMemberListMap;
    public Map<String, VendorSynonymMemberCQ> getMemberStatusCode_NotInScopeRelation_VendorSynonymMemberList() { return _memberStatusCode_NotInScopeRelation_VendorSynonymMemberListMap; }
    public String keepMemberStatusCode_NotInScopeRelation_VendorSynonymMemberList(VendorSynonymMemberCQ sq) {
        if (_memberStatusCode_NotInScopeRelation_VendorSynonymMemberListMap == null) { _memberStatusCode_NotInScopeRelation_VendorSynonymMemberListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberStatusCode_NotInScopeRelation_VendorSynonymMemberListMap.size() + 1);
        _memberStatusCode_NotInScopeRelation_VendorSynonymMemberListMap.put(ky, sq); return "memberStatusCode_NotInScopeRelation_VendorSynonymMemberList." + ky;
    }

    protected Map<String, MemberCQ> _memberStatusCode_SpecifyDerivedReferrer_MemberListMap;
    public Map<String, MemberCQ> getMemberStatusCode_SpecifyDerivedReferrer_MemberList() { return _memberStatusCode_SpecifyDerivedReferrer_MemberListMap; }
    public String keepMemberStatusCode_SpecifyDerivedReferrer_MemberList(MemberCQ sq) {
        if (_memberStatusCode_SpecifyDerivedReferrer_MemberListMap == null) { _memberStatusCode_SpecifyDerivedReferrer_MemberListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberStatusCode_SpecifyDerivedReferrer_MemberListMap.size() + 1);
        _memberStatusCode_SpecifyDerivedReferrer_MemberListMap.put(ky, sq); return "memberStatusCode_SpecifyDerivedReferrer_MemberList." + ky;
    }

    protected Map<String, MemberLoginCQ> _memberStatusCode_SpecifyDerivedReferrer_MemberLoginListMap;
    public Map<String, MemberLoginCQ> getMemberStatusCode_SpecifyDerivedReferrer_MemberLoginList() { return _memberStatusCode_SpecifyDerivedReferrer_MemberLoginListMap; }
    public String keepMemberStatusCode_SpecifyDerivedReferrer_MemberLoginList(MemberLoginCQ sq) {
        if (_memberStatusCode_SpecifyDerivedReferrer_MemberLoginListMap == null) { _memberStatusCode_SpecifyDerivedReferrer_MemberLoginListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberStatusCode_SpecifyDerivedReferrer_MemberLoginListMap.size() + 1);
        _memberStatusCode_SpecifyDerivedReferrer_MemberLoginListMap.put(ky, sq); return "memberStatusCode_SpecifyDerivedReferrer_MemberLoginList." + ky;
    }

    protected Map<String, MemberVendorSynonymCQ> _memberStatusCode_SpecifyDerivedReferrer_MemberVendorSynonymListMap;
    public Map<String, MemberVendorSynonymCQ> getMemberStatusCode_SpecifyDerivedReferrer_MemberVendorSynonymList() { return _memberStatusCode_SpecifyDerivedReferrer_MemberVendorSynonymListMap; }
    public String keepMemberStatusCode_SpecifyDerivedReferrer_MemberVendorSynonymList(MemberVendorSynonymCQ sq) {
        if (_memberStatusCode_SpecifyDerivedReferrer_MemberVendorSynonymListMap == null) { _memberStatusCode_SpecifyDerivedReferrer_MemberVendorSynonymListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberStatusCode_SpecifyDerivedReferrer_MemberVendorSynonymListMap.size() + 1);
        _memberStatusCode_SpecifyDerivedReferrer_MemberVendorSynonymListMap.put(ky, sq); return "memberStatusCode_SpecifyDerivedReferrer_MemberVendorSynonymList." + ky;
    }

    protected Map<String, SynonymMemberCQ> _memberStatusCode_SpecifyDerivedReferrer_SynonymMemberListMap;
    public Map<String, SynonymMemberCQ> getMemberStatusCode_SpecifyDerivedReferrer_SynonymMemberList() { return _memberStatusCode_SpecifyDerivedReferrer_SynonymMemberListMap; }
    public String keepMemberStatusCode_SpecifyDerivedReferrer_SynonymMemberList(SynonymMemberCQ sq) {
        if (_memberStatusCode_SpecifyDerivedReferrer_SynonymMemberListMap == null) { _memberStatusCode_SpecifyDerivedReferrer_SynonymMemberListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberStatusCode_SpecifyDerivedReferrer_SynonymMemberListMap.size() + 1);
        _memberStatusCode_SpecifyDerivedReferrer_SynonymMemberListMap.put(ky, sq); return "memberStatusCode_SpecifyDerivedReferrer_SynonymMemberList." + ky;
    }

    protected Map<String, SynonymMemberLoginCQ> _memberStatusCode_SpecifyDerivedReferrer_SynonymMemberLoginListMap;
    public Map<String, SynonymMemberLoginCQ> getMemberStatusCode_SpecifyDerivedReferrer_SynonymMemberLoginList() { return _memberStatusCode_SpecifyDerivedReferrer_SynonymMemberLoginListMap; }
    public String keepMemberStatusCode_SpecifyDerivedReferrer_SynonymMemberLoginList(SynonymMemberLoginCQ sq) {
        if (_memberStatusCode_SpecifyDerivedReferrer_SynonymMemberLoginListMap == null) { _memberStatusCode_SpecifyDerivedReferrer_SynonymMemberLoginListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberStatusCode_SpecifyDerivedReferrer_SynonymMemberLoginListMap.size() + 1);
        _memberStatusCode_SpecifyDerivedReferrer_SynonymMemberLoginListMap.put(ky, sq); return "memberStatusCode_SpecifyDerivedReferrer_SynonymMemberLoginList." + ky;
    }

    protected Map<String, VendorSynonymMemberCQ> _memberStatusCode_SpecifyDerivedReferrer_VendorSynonymMemberListMap;
    public Map<String, VendorSynonymMemberCQ> getMemberStatusCode_SpecifyDerivedReferrer_VendorSynonymMemberList() { return _memberStatusCode_SpecifyDerivedReferrer_VendorSynonymMemberListMap; }
    public String keepMemberStatusCode_SpecifyDerivedReferrer_VendorSynonymMemberList(VendorSynonymMemberCQ sq) {
        if (_memberStatusCode_SpecifyDerivedReferrer_VendorSynonymMemberListMap == null) { _memberStatusCode_SpecifyDerivedReferrer_VendorSynonymMemberListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberStatusCode_SpecifyDerivedReferrer_VendorSynonymMemberListMap.size() + 1);
        _memberStatusCode_SpecifyDerivedReferrer_VendorSynonymMemberListMap.put(ky, sq); return "memberStatusCode_SpecifyDerivedReferrer_VendorSynonymMemberList." + ky;
    }

    protected Map<String, MemberCQ> _memberStatusCode_QueryDerivedReferrer_MemberListMap;
    public Map<String, MemberCQ> getMemberStatusCode_QueryDerivedReferrer_MemberList() { return _memberStatusCode_QueryDerivedReferrer_MemberListMap; }
    public String keepMemberStatusCode_QueryDerivedReferrer_MemberList(MemberCQ sq) {
        if (_memberStatusCode_QueryDerivedReferrer_MemberListMap == null) { _memberStatusCode_QueryDerivedReferrer_MemberListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberStatusCode_QueryDerivedReferrer_MemberListMap.size() + 1);
        _memberStatusCode_QueryDerivedReferrer_MemberListMap.put(ky, sq); return "memberStatusCode_QueryDerivedReferrer_MemberList." + ky;
    }
    protected Map<String, Object> _memberStatusCode_QueryDerivedReferrer_MemberListParameterMap;
    public Map<String, Object> getMemberStatusCode_QueryDerivedReferrer_MemberListParameter() { return _memberStatusCode_QueryDerivedReferrer_MemberListParameterMap; }
    public String keepMemberStatusCode_QueryDerivedReferrer_MemberListParameter(Object vl) {
        if (_memberStatusCode_QueryDerivedReferrer_MemberListParameterMap == null) { _memberStatusCode_QueryDerivedReferrer_MemberListParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_memberStatusCode_QueryDerivedReferrer_MemberListParameterMap.size() + 1);
        _memberStatusCode_QueryDerivedReferrer_MemberListParameterMap.put(ky, vl); return "memberStatusCode_QueryDerivedReferrer_MemberListParameter." + ky;
    }

    protected Map<String, MemberLoginCQ> _memberStatusCode_QueryDerivedReferrer_MemberLoginListMap;
    public Map<String, MemberLoginCQ> getMemberStatusCode_QueryDerivedReferrer_MemberLoginList() { return _memberStatusCode_QueryDerivedReferrer_MemberLoginListMap; }
    public String keepMemberStatusCode_QueryDerivedReferrer_MemberLoginList(MemberLoginCQ sq) {
        if (_memberStatusCode_QueryDerivedReferrer_MemberLoginListMap == null) { _memberStatusCode_QueryDerivedReferrer_MemberLoginListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberStatusCode_QueryDerivedReferrer_MemberLoginListMap.size() + 1);
        _memberStatusCode_QueryDerivedReferrer_MemberLoginListMap.put(ky, sq); return "memberStatusCode_QueryDerivedReferrer_MemberLoginList." + ky;
    }
    protected Map<String, Object> _memberStatusCode_QueryDerivedReferrer_MemberLoginListParameterMap;
    public Map<String, Object> getMemberStatusCode_QueryDerivedReferrer_MemberLoginListParameter() { return _memberStatusCode_QueryDerivedReferrer_MemberLoginListParameterMap; }
    public String keepMemberStatusCode_QueryDerivedReferrer_MemberLoginListParameter(Object vl) {
        if (_memberStatusCode_QueryDerivedReferrer_MemberLoginListParameterMap == null) { _memberStatusCode_QueryDerivedReferrer_MemberLoginListParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_memberStatusCode_QueryDerivedReferrer_MemberLoginListParameterMap.size() + 1);
        _memberStatusCode_QueryDerivedReferrer_MemberLoginListParameterMap.put(ky, vl); return "memberStatusCode_QueryDerivedReferrer_MemberLoginListParameter." + ky;
    }

    protected Map<String, MemberVendorSynonymCQ> _memberStatusCode_QueryDerivedReferrer_MemberVendorSynonymListMap;
    public Map<String, MemberVendorSynonymCQ> getMemberStatusCode_QueryDerivedReferrer_MemberVendorSynonymList() { return _memberStatusCode_QueryDerivedReferrer_MemberVendorSynonymListMap; }
    public String keepMemberStatusCode_QueryDerivedReferrer_MemberVendorSynonymList(MemberVendorSynonymCQ sq) {
        if (_memberStatusCode_QueryDerivedReferrer_MemberVendorSynonymListMap == null) { _memberStatusCode_QueryDerivedReferrer_MemberVendorSynonymListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberStatusCode_QueryDerivedReferrer_MemberVendorSynonymListMap.size() + 1);
        _memberStatusCode_QueryDerivedReferrer_MemberVendorSynonymListMap.put(ky, sq); return "memberStatusCode_QueryDerivedReferrer_MemberVendorSynonymList." + ky;
    }
    protected Map<String, Object> _memberStatusCode_QueryDerivedReferrer_MemberVendorSynonymListParameterMap;
    public Map<String, Object> getMemberStatusCode_QueryDerivedReferrer_MemberVendorSynonymListParameter() { return _memberStatusCode_QueryDerivedReferrer_MemberVendorSynonymListParameterMap; }
    public String keepMemberStatusCode_QueryDerivedReferrer_MemberVendorSynonymListParameter(Object vl) {
        if (_memberStatusCode_QueryDerivedReferrer_MemberVendorSynonymListParameterMap == null) { _memberStatusCode_QueryDerivedReferrer_MemberVendorSynonymListParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_memberStatusCode_QueryDerivedReferrer_MemberVendorSynonymListParameterMap.size() + 1);
        _memberStatusCode_QueryDerivedReferrer_MemberVendorSynonymListParameterMap.put(ky, vl); return "memberStatusCode_QueryDerivedReferrer_MemberVendorSynonymListParameter." + ky;
    }

    protected Map<String, SynonymMemberCQ> _memberStatusCode_QueryDerivedReferrer_SynonymMemberListMap;
    public Map<String, SynonymMemberCQ> getMemberStatusCode_QueryDerivedReferrer_SynonymMemberList() { return _memberStatusCode_QueryDerivedReferrer_SynonymMemberListMap; }
    public String keepMemberStatusCode_QueryDerivedReferrer_SynonymMemberList(SynonymMemberCQ sq) {
        if (_memberStatusCode_QueryDerivedReferrer_SynonymMemberListMap == null) { _memberStatusCode_QueryDerivedReferrer_SynonymMemberListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberStatusCode_QueryDerivedReferrer_SynonymMemberListMap.size() + 1);
        _memberStatusCode_QueryDerivedReferrer_SynonymMemberListMap.put(ky, sq); return "memberStatusCode_QueryDerivedReferrer_SynonymMemberList." + ky;
    }
    protected Map<String, Object> _memberStatusCode_QueryDerivedReferrer_SynonymMemberListParameterMap;
    public Map<String, Object> getMemberStatusCode_QueryDerivedReferrer_SynonymMemberListParameter() { return _memberStatusCode_QueryDerivedReferrer_SynonymMemberListParameterMap; }
    public String keepMemberStatusCode_QueryDerivedReferrer_SynonymMemberListParameter(Object vl) {
        if (_memberStatusCode_QueryDerivedReferrer_SynonymMemberListParameterMap == null) { _memberStatusCode_QueryDerivedReferrer_SynonymMemberListParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_memberStatusCode_QueryDerivedReferrer_SynonymMemberListParameterMap.size() + 1);
        _memberStatusCode_QueryDerivedReferrer_SynonymMemberListParameterMap.put(ky, vl); return "memberStatusCode_QueryDerivedReferrer_SynonymMemberListParameter." + ky;
    }

    protected Map<String, SynonymMemberLoginCQ> _memberStatusCode_QueryDerivedReferrer_SynonymMemberLoginListMap;
    public Map<String, SynonymMemberLoginCQ> getMemberStatusCode_QueryDerivedReferrer_SynonymMemberLoginList() { return _memberStatusCode_QueryDerivedReferrer_SynonymMemberLoginListMap; }
    public String keepMemberStatusCode_QueryDerivedReferrer_SynonymMemberLoginList(SynonymMemberLoginCQ sq) {
        if (_memberStatusCode_QueryDerivedReferrer_SynonymMemberLoginListMap == null) { _memberStatusCode_QueryDerivedReferrer_SynonymMemberLoginListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberStatusCode_QueryDerivedReferrer_SynonymMemberLoginListMap.size() + 1);
        _memberStatusCode_QueryDerivedReferrer_SynonymMemberLoginListMap.put(ky, sq); return "memberStatusCode_QueryDerivedReferrer_SynonymMemberLoginList." + ky;
    }
    protected Map<String, Object> _memberStatusCode_QueryDerivedReferrer_SynonymMemberLoginListParameterMap;
    public Map<String, Object> getMemberStatusCode_QueryDerivedReferrer_SynonymMemberLoginListParameter() { return _memberStatusCode_QueryDerivedReferrer_SynonymMemberLoginListParameterMap; }
    public String keepMemberStatusCode_QueryDerivedReferrer_SynonymMemberLoginListParameter(Object vl) {
        if (_memberStatusCode_QueryDerivedReferrer_SynonymMemberLoginListParameterMap == null) { _memberStatusCode_QueryDerivedReferrer_SynonymMemberLoginListParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_memberStatusCode_QueryDerivedReferrer_SynonymMemberLoginListParameterMap.size() + 1);
        _memberStatusCode_QueryDerivedReferrer_SynonymMemberLoginListParameterMap.put(ky, vl); return "memberStatusCode_QueryDerivedReferrer_SynonymMemberLoginListParameter." + ky;
    }

    protected Map<String, VendorSynonymMemberCQ> _memberStatusCode_QueryDerivedReferrer_VendorSynonymMemberListMap;
    public Map<String, VendorSynonymMemberCQ> getMemberStatusCode_QueryDerivedReferrer_VendorSynonymMemberList() { return _memberStatusCode_QueryDerivedReferrer_VendorSynonymMemberListMap; }
    public String keepMemberStatusCode_QueryDerivedReferrer_VendorSynonymMemberList(VendorSynonymMemberCQ sq) {
        if (_memberStatusCode_QueryDerivedReferrer_VendorSynonymMemberListMap == null) { _memberStatusCode_QueryDerivedReferrer_VendorSynonymMemberListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberStatusCode_QueryDerivedReferrer_VendorSynonymMemberListMap.size() + 1);
        _memberStatusCode_QueryDerivedReferrer_VendorSynonymMemberListMap.put(ky, sq); return "memberStatusCode_QueryDerivedReferrer_VendorSynonymMemberList." + ky;
    }
    protected Map<String, Object> _memberStatusCode_QueryDerivedReferrer_VendorSynonymMemberListParameterMap;
    public Map<String, Object> getMemberStatusCode_QueryDerivedReferrer_VendorSynonymMemberListParameter() { return _memberStatusCode_QueryDerivedReferrer_VendorSynonymMemberListParameterMap; }
    public String keepMemberStatusCode_QueryDerivedReferrer_VendorSynonymMemberListParameter(Object vl) {
        if (_memberStatusCode_QueryDerivedReferrer_VendorSynonymMemberListParameterMap == null) { _memberStatusCode_QueryDerivedReferrer_VendorSynonymMemberListParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_memberStatusCode_QueryDerivedReferrer_VendorSynonymMemberListParameterMap.size() + 1);
        _memberStatusCode_QueryDerivedReferrer_VendorSynonymMemberListParameterMap.put(ky, vl); return "memberStatusCode_QueryDerivedReferrer_VendorSynonymMemberListParameter." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * MEMBER_STATUS_CODE: {PK, NotNull, CHAR(3), classification=MemberStatus}
     * @return this. (NotNull)
     */
    public BsMemberStatusCQ addOrderBy_MemberStatusCode_Asc() { regOBA("MEMBER_STATUS_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * MEMBER_STATUS_CODE: {PK, NotNull, CHAR(3), classification=MemberStatus}
     * @return this. (NotNull)
     */
    public BsMemberStatusCQ addOrderBy_MemberStatusCode_Desc() { regOBD("MEMBER_STATUS_CODE"); return this; }

    protected ConditionValue _memberStatusName;
    public ConditionValue getMemberStatusName() {
        if (_memberStatusName == null) { _memberStatusName = nCV(); }
        return _memberStatusName;
    }
    protected ConditionValue getCValueMemberStatusName() { return getMemberStatusName(); }

    /** 
     * Add order-by as ascend. <br />
     * MEMBER_STATUS_NAME: {UQ, NotNull, VARCHAR2(50)}
     * @return this. (NotNull)
     */
    public BsMemberStatusCQ addOrderBy_MemberStatusName_Asc() { regOBA("MEMBER_STATUS_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * MEMBER_STATUS_NAME: {UQ, NotNull, VARCHAR2(50)}
     * @return this. (NotNull)
     */
    public BsMemberStatusCQ addOrderBy_MemberStatusName_Desc() { regOBD("MEMBER_STATUS_NAME"); return this; }

    protected ConditionValue _description;
    public ConditionValue getDescription() {
        if (_description == null) { _description = nCV(); }
        return _description;
    }
    protected ConditionValue getCValueDescription() { return getDescription(); }

    /** 
     * Add order-by as ascend. <br />
     * DESCRIPTION: {NotNull, VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsMemberStatusCQ addOrderBy_Description_Asc() { regOBA("DESCRIPTION"); return this; }

    /**
     * Add order-by as descend. <br />
     * DESCRIPTION: {NotNull, VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsMemberStatusCQ addOrderBy_Description_Desc() { regOBD("DESCRIPTION"); return this; }

    protected ConditionValue _displayOrder;
    public ConditionValue getDisplayOrder() {
        if (_displayOrder == null) { _displayOrder = nCV(); }
        return _displayOrder;
    }
    protected ConditionValue getCValueDisplayOrder() { return getDisplayOrder(); }

    /** 
     * Add order-by as ascend. <br />
     * DISPLAY_ORDER: {UQ, NotNull, NUMBER(16)}
     * @return this. (NotNull)
     */
    public BsMemberStatusCQ addOrderBy_DisplayOrder_Asc() { regOBA("DISPLAY_ORDER"); return this; }

    /**
     * Add order-by as descend. <br />
     * DISPLAY_ORDER: {UQ, NotNull, NUMBER(16)}
     * @return this. (NotNull)
     */
    public BsMemberStatusCQ addOrderBy_DisplayOrder_Desc() { regOBD("DISPLAY_ORDER"); return this; }

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
    public BsMemberStatusCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsMemberStatusCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
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
    protected Map<String, MemberStatusCQ> _scalarConditionMap;
    public Map<String, MemberStatusCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(MemberStatusCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, MemberStatusCQ> _specifyMyselfDerivedMap;
    public Map<String, MemberStatusCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(MemberStatusCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, MemberStatusCQ> _queryMyselfDerivedMap;
    public Map<String, MemberStatusCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(MemberStatusCQ sq) {
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
    protected Map<String, MemberStatusCQ> _myselfExistsMap;
    public Map<String, MemberStatusCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(MemberStatusCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, MemberStatusCQ> _myselfInScopeMap;
    public Map<String, MemberStatusCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(MemberStatusCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MemberStatusCB.class.getName(); }
    protected String xCQ() { return MemberStatusCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
