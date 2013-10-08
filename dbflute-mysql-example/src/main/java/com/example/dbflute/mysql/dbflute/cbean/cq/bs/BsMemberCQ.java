/*
 * Copyright 2004-2013 the Seasar Foundation and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package com.example.dbflute.mysql.dbflute.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.mysql.dbflute.cbean.cq.ciq.*;
import com.example.dbflute.mysql.dbflute.cbean.*;
import com.example.dbflute.mysql.dbflute.cbean.cq.*;

/**
 * The base condition-query of member.
 * @author DBFlute(AutoGenerator)
 */
public class BsMemberCQ extends AbstractBsMemberCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MemberCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMemberCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from member) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MemberCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MemberCIQ xcreateCIQ() {
        MemberCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MemberCIQ xnewCIQ() {
        return new MemberCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join member on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MemberCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MemberCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _memberId;
    public ConditionValue getMemberId() {
        if (_memberId == null) { _memberId = nCV(); }
        return _memberId;
    }
    protected ConditionValue getCValueMemberId() { return getMemberId(); }

    protected Map<String, MemberAddressCQ> _memberId_ExistsReferrer_MemberAddressListMap;
    public Map<String, MemberAddressCQ> getMemberId_ExistsReferrer_MemberAddressList() { return _memberId_ExistsReferrer_MemberAddressListMap; }
    public String keepMemberId_ExistsReferrer_MemberAddressList(MemberAddressCQ subQuery) {
        if (_memberId_ExistsReferrer_MemberAddressListMap == null) { _memberId_ExistsReferrer_MemberAddressListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_memberId_ExistsReferrer_MemberAddressListMap.size() + 1);
        _memberId_ExistsReferrer_MemberAddressListMap.put(key, subQuery); return "memberId_ExistsReferrer_MemberAddressList." + key;
    }

    protected Map<String, MemberLoginCQ> _memberId_ExistsReferrer_MemberLoginListMap;
    public Map<String, MemberLoginCQ> getMemberId_ExistsReferrer_MemberLoginList() { return _memberId_ExistsReferrer_MemberLoginListMap; }
    public String keepMemberId_ExistsReferrer_MemberLoginList(MemberLoginCQ subQuery) {
        if (_memberId_ExistsReferrer_MemberLoginListMap == null) { _memberId_ExistsReferrer_MemberLoginListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_memberId_ExistsReferrer_MemberLoginListMap.size() + 1);
        _memberId_ExistsReferrer_MemberLoginListMap.put(key, subQuery); return "memberId_ExistsReferrer_MemberLoginList." + key;
    }

    protected Map<String, MemberSecurityCQ> _memberId_ExistsReferrer_MemberSecurityAsOneMap;
    public Map<String, MemberSecurityCQ> getMemberId_ExistsReferrer_MemberSecurityAsOne() { return _memberId_ExistsReferrer_MemberSecurityAsOneMap; }
    public String keepMemberId_ExistsReferrer_MemberSecurityAsOne(MemberSecurityCQ subQuery) {
        if (_memberId_ExistsReferrer_MemberSecurityAsOneMap == null) { _memberId_ExistsReferrer_MemberSecurityAsOneMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_memberId_ExistsReferrer_MemberSecurityAsOneMap.size() + 1);
        _memberId_ExistsReferrer_MemberSecurityAsOneMap.put(key, subQuery); return "memberId_ExistsReferrer_MemberSecurityAsOne." + key;
    }

    protected Map<String, MemberServiceCQ> _memberId_ExistsReferrer_MemberServiceAsOneMap;
    public Map<String, MemberServiceCQ> getMemberId_ExistsReferrer_MemberServiceAsOne() { return _memberId_ExistsReferrer_MemberServiceAsOneMap; }
    public String keepMemberId_ExistsReferrer_MemberServiceAsOne(MemberServiceCQ subQuery) {
        if (_memberId_ExistsReferrer_MemberServiceAsOneMap == null) { _memberId_ExistsReferrer_MemberServiceAsOneMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_memberId_ExistsReferrer_MemberServiceAsOneMap.size() + 1);
        _memberId_ExistsReferrer_MemberServiceAsOneMap.put(key, subQuery); return "memberId_ExistsReferrer_MemberServiceAsOne." + key;
    }

    protected Map<String, MemberWithdrawalCQ> _memberId_ExistsReferrer_MemberWithdrawalAsOneMap;
    public Map<String, MemberWithdrawalCQ> getMemberId_ExistsReferrer_MemberWithdrawalAsOne() { return _memberId_ExistsReferrer_MemberWithdrawalAsOneMap; }
    public String keepMemberId_ExistsReferrer_MemberWithdrawalAsOne(MemberWithdrawalCQ subQuery) {
        if (_memberId_ExistsReferrer_MemberWithdrawalAsOneMap == null) { _memberId_ExistsReferrer_MemberWithdrawalAsOneMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_memberId_ExistsReferrer_MemberWithdrawalAsOneMap.size() + 1);
        _memberId_ExistsReferrer_MemberWithdrawalAsOneMap.put(key, subQuery); return "memberId_ExistsReferrer_MemberWithdrawalAsOne." + key;
    }

    protected Map<String, PurchaseCQ> _memberId_ExistsReferrer_PurchaseListMap;
    public Map<String, PurchaseCQ> getMemberId_ExistsReferrer_PurchaseList() { return _memberId_ExistsReferrer_PurchaseListMap; }
    public String keepMemberId_ExistsReferrer_PurchaseList(PurchaseCQ subQuery) {
        if (_memberId_ExistsReferrer_PurchaseListMap == null) { _memberId_ExistsReferrer_PurchaseListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_memberId_ExistsReferrer_PurchaseListMap.size() + 1);
        _memberId_ExistsReferrer_PurchaseListMap.put(key, subQuery); return "memberId_ExistsReferrer_PurchaseList." + key;
    }

    protected Map<String, MemberAddressCQ> _memberId_NotExistsReferrer_MemberAddressListMap;
    public Map<String, MemberAddressCQ> getMemberId_NotExistsReferrer_MemberAddressList() { return _memberId_NotExistsReferrer_MemberAddressListMap; }
    public String keepMemberId_NotExistsReferrer_MemberAddressList(MemberAddressCQ subQuery) {
        if (_memberId_NotExistsReferrer_MemberAddressListMap == null) { _memberId_NotExistsReferrer_MemberAddressListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_memberId_NotExistsReferrer_MemberAddressListMap.size() + 1);
        _memberId_NotExistsReferrer_MemberAddressListMap.put(key, subQuery); return "memberId_NotExistsReferrer_MemberAddressList." + key;
    }

    protected Map<String, MemberLoginCQ> _memberId_NotExistsReferrer_MemberLoginListMap;
    public Map<String, MemberLoginCQ> getMemberId_NotExistsReferrer_MemberLoginList() { return _memberId_NotExistsReferrer_MemberLoginListMap; }
    public String keepMemberId_NotExistsReferrer_MemberLoginList(MemberLoginCQ subQuery) {
        if (_memberId_NotExistsReferrer_MemberLoginListMap == null) { _memberId_NotExistsReferrer_MemberLoginListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_memberId_NotExistsReferrer_MemberLoginListMap.size() + 1);
        _memberId_NotExistsReferrer_MemberLoginListMap.put(key, subQuery); return "memberId_NotExistsReferrer_MemberLoginList." + key;
    }

    protected Map<String, MemberSecurityCQ> _memberId_NotExistsReferrer_MemberSecurityAsOneMap;
    public Map<String, MemberSecurityCQ> getMemberId_NotExistsReferrer_MemberSecurityAsOne() { return _memberId_NotExistsReferrer_MemberSecurityAsOneMap; }
    public String keepMemberId_NotExistsReferrer_MemberSecurityAsOne(MemberSecurityCQ subQuery) {
        if (_memberId_NotExistsReferrer_MemberSecurityAsOneMap == null) { _memberId_NotExistsReferrer_MemberSecurityAsOneMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_memberId_NotExistsReferrer_MemberSecurityAsOneMap.size() + 1);
        _memberId_NotExistsReferrer_MemberSecurityAsOneMap.put(key, subQuery); return "memberId_NotExistsReferrer_MemberSecurityAsOne." + key;
    }

    protected Map<String, MemberServiceCQ> _memberId_NotExistsReferrer_MemberServiceAsOneMap;
    public Map<String, MemberServiceCQ> getMemberId_NotExistsReferrer_MemberServiceAsOne() { return _memberId_NotExistsReferrer_MemberServiceAsOneMap; }
    public String keepMemberId_NotExistsReferrer_MemberServiceAsOne(MemberServiceCQ subQuery) {
        if (_memberId_NotExistsReferrer_MemberServiceAsOneMap == null) { _memberId_NotExistsReferrer_MemberServiceAsOneMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_memberId_NotExistsReferrer_MemberServiceAsOneMap.size() + 1);
        _memberId_NotExistsReferrer_MemberServiceAsOneMap.put(key, subQuery); return "memberId_NotExistsReferrer_MemberServiceAsOne." + key;
    }

    protected Map<String, MemberWithdrawalCQ> _memberId_NotExistsReferrer_MemberWithdrawalAsOneMap;
    public Map<String, MemberWithdrawalCQ> getMemberId_NotExistsReferrer_MemberWithdrawalAsOne() { return _memberId_NotExistsReferrer_MemberWithdrawalAsOneMap; }
    public String keepMemberId_NotExistsReferrer_MemberWithdrawalAsOne(MemberWithdrawalCQ subQuery) {
        if (_memberId_NotExistsReferrer_MemberWithdrawalAsOneMap == null) { _memberId_NotExistsReferrer_MemberWithdrawalAsOneMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_memberId_NotExistsReferrer_MemberWithdrawalAsOneMap.size() + 1);
        _memberId_NotExistsReferrer_MemberWithdrawalAsOneMap.put(key, subQuery); return "memberId_NotExistsReferrer_MemberWithdrawalAsOne." + key;
    }

    protected Map<String, PurchaseCQ> _memberId_NotExistsReferrer_PurchaseListMap;
    public Map<String, PurchaseCQ> getMemberId_NotExistsReferrer_PurchaseList() { return _memberId_NotExistsReferrer_PurchaseListMap; }
    public String keepMemberId_NotExistsReferrer_PurchaseList(PurchaseCQ subQuery) {
        if (_memberId_NotExistsReferrer_PurchaseListMap == null) { _memberId_NotExistsReferrer_PurchaseListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_memberId_NotExistsReferrer_PurchaseListMap.size() + 1);
        _memberId_NotExistsReferrer_PurchaseListMap.put(key, subQuery); return "memberId_NotExistsReferrer_PurchaseList." + key;
    }

    protected Map<String, MemberAddressCQ> _memberId_SpecifyDerivedReferrer_MemberAddressListMap;
    public Map<String, MemberAddressCQ> getMemberId_SpecifyDerivedReferrer_MemberAddressList() { return _memberId_SpecifyDerivedReferrer_MemberAddressListMap; }
    public String keepMemberId_SpecifyDerivedReferrer_MemberAddressList(MemberAddressCQ subQuery) {
        if (_memberId_SpecifyDerivedReferrer_MemberAddressListMap == null) { _memberId_SpecifyDerivedReferrer_MemberAddressListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_memberId_SpecifyDerivedReferrer_MemberAddressListMap.size() + 1);
        _memberId_SpecifyDerivedReferrer_MemberAddressListMap.put(key, subQuery); return "memberId_SpecifyDerivedReferrer_MemberAddressList." + key;
    }

    protected Map<String, MemberLoginCQ> _memberId_SpecifyDerivedReferrer_MemberLoginListMap;
    public Map<String, MemberLoginCQ> getMemberId_SpecifyDerivedReferrer_MemberLoginList() { return _memberId_SpecifyDerivedReferrer_MemberLoginListMap; }
    public String keepMemberId_SpecifyDerivedReferrer_MemberLoginList(MemberLoginCQ subQuery) {
        if (_memberId_SpecifyDerivedReferrer_MemberLoginListMap == null) { _memberId_SpecifyDerivedReferrer_MemberLoginListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_memberId_SpecifyDerivedReferrer_MemberLoginListMap.size() + 1);
        _memberId_SpecifyDerivedReferrer_MemberLoginListMap.put(key, subQuery); return "memberId_SpecifyDerivedReferrer_MemberLoginList." + key;
    }

    protected Map<String, PurchaseCQ> _memberId_SpecifyDerivedReferrer_PurchaseListMap;
    public Map<String, PurchaseCQ> getMemberId_SpecifyDerivedReferrer_PurchaseList() { return _memberId_SpecifyDerivedReferrer_PurchaseListMap; }
    public String keepMemberId_SpecifyDerivedReferrer_PurchaseList(PurchaseCQ subQuery) {
        if (_memberId_SpecifyDerivedReferrer_PurchaseListMap == null) { _memberId_SpecifyDerivedReferrer_PurchaseListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_memberId_SpecifyDerivedReferrer_PurchaseListMap.size() + 1);
        _memberId_SpecifyDerivedReferrer_PurchaseListMap.put(key, subQuery); return "memberId_SpecifyDerivedReferrer_PurchaseList." + key;
    }

    protected Map<String, MemberAddressCQ> _memberId_InScopeRelation_MemberAddressListMap;
    public Map<String, MemberAddressCQ> getMemberId_InScopeRelation_MemberAddressList() { return _memberId_InScopeRelation_MemberAddressListMap; }
    public String keepMemberId_InScopeRelation_MemberAddressList(MemberAddressCQ subQuery) {
        if (_memberId_InScopeRelation_MemberAddressListMap == null) { _memberId_InScopeRelation_MemberAddressListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_memberId_InScopeRelation_MemberAddressListMap.size() + 1);
        _memberId_InScopeRelation_MemberAddressListMap.put(key, subQuery); return "memberId_InScopeRelation_MemberAddressList." + key;
    }

    protected Map<String, MemberLoginCQ> _memberId_InScopeRelation_MemberLoginListMap;
    public Map<String, MemberLoginCQ> getMemberId_InScopeRelation_MemberLoginList() { return _memberId_InScopeRelation_MemberLoginListMap; }
    public String keepMemberId_InScopeRelation_MemberLoginList(MemberLoginCQ subQuery) {
        if (_memberId_InScopeRelation_MemberLoginListMap == null) { _memberId_InScopeRelation_MemberLoginListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_memberId_InScopeRelation_MemberLoginListMap.size() + 1);
        _memberId_InScopeRelation_MemberLoginListMap.put(key, subQuery); return "memberId_InScopeRelation_MemberLoginList." + key;
    }

    protected Map<String, MemberSecurityCQ> _memberId_InScopeRelation_MemberSecurityAsOneMap;
    public Map<String, MemberSecurityCQ> getMemberId_InScopeRelation_MemberSecurityAsOne() { return _memberId_InScopeRelation_MemberSecurityAsOneMap; }
    public String keepMemberId_InScopeRelation_MemberSecurityAsOne(MemberSecurityCQ subQuery) {
        if (_memberId_InScopeRelation_MemberSecurityAsOneMap == null) { _memberId_InScopeRelation_MemberSecurityAsOneMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_memberId_InScopeRelation_MemberSecurityAsOneMap.size() + 1);
        _memberId_InScopeRelation_MemberSecurityAsOneMap.put(key, subQuery); return "memberId_InScopeRelation_MemberSecurityAsOne." + key;
    }

    protected Map<String, MemberServiceCQ> _memberId_InScopeRelation_MemberServiceAsOneMap;
    public Map<String, MemberServiceCQ> getMemberId_InScopeRelation_MemberServiceAsOne() { return _memberId_InScopeRelation_MemberServiceAsOneMap; }
    public String keepMemberId_InScopeRelation_MemberServiceAsOne(MemberServiceCQ subQuery) {
        if (_memberId_InScopeRelation_MemberServiceAsOneMap == null) { _memberId_InScopeRelation_MemberServiceAsOneMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_memberId_InScopeRelation_MemberServiceAsOneMap.size() + 1);
        _memberId_InScopeRelation_MemberServiceAsOneMap.put(key, subQuery); return "memberId_InScopeRelation_MemberServiceAsOne." + key;
    }

    protected Map<String, MemberWithdrawalCQ> _memberId_InScopeRelation_MemberWithdrawalAsOneMap;
    public Map<String, MemberWithdrawalCQ> getMemberId_InScopeRelation_MemberWithdrawalAsOne() { return _memberId_InScopeRelation_MemberWithdrawalAsOneMap; }
    public String keepMemberId_InScopeRelation_MemberWithdrawalAsOne(MemberWithdrawalCQ subQuery) {
        if (_memberId_InScopeRelation_MemberWithdrawalAsOneMap == null) { _memberId_InScopeRelation_MemberWithdrawalAsOneMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_memberId_InScopeRelation_MemberWithdrawalAsOneMap.size() + 1);
        _memberId_InScopeRelation_MemberWithdrawalAsOneMap.put(key, subQuery); return "memberId_InScopeRelation_MemberWithdrawalAsOne." + key;
    }

    protected Map<String, PurchaseCQ> _memberId_InScopeRelation_PurchaseListMap;
    public Map<String, PurchaseCQ> getMemberId_InScopeRelation_PurchaseList() { return _memberId_InScopeRelation_PurchaseListMap; }
    public String keepMemberId_InScopeRelation_PurchaseList(PurchaseCQ subQuery) {
        if (_memberId_InScopeRelation_PurchaseListMap == null) { _memberId_InScopeRelation_PurchaseListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_memberId_InScopeRelation_PurchaseListMap.size() + 1);
        _memberId_InScopeRelation_PurchaseListMap.put(key, subQuery); return "memberId_InScopeRelation_PurchaseList." + key;
    }

    protected Map<String, MemberAddressCQ> _memberId_NotInScopeRelation_MemberAddressListMap;
    public Map<String, MemberAddressCQ> getMemberId_NotInScopeRelation_MemberAddressList() { return _memberId_NotInScopeRelation_MemberAddressListMap; }
    public String keepMemberId_NotInScopeRelation_MemberAddressList(MemberAddressCQ subQuery) {
        if (_memberId_NotInScopeRelation_MemberAddressListMap == null) { _memberId_NotInScopeRelation_MemberAddressListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_memberId_NotInScopeRelation_MemberAddressListMap.size() + 1);
        _memberId_NotInScopeRelation_MemberAddressListMap.put(key, subQuery); return "memberId_NotInScopeRelation_MemberAddressList." + key;
    }

    protected Map<String, MemberLoginCQ> _memberId_NotInScopeRelation_MemberLoginListMap;
    public Map<String, MemberLoginCQ> getMemberId_NotInScopeRelation_MemberLoginList() { return _memberId_NotInScopeRelation_MemberLoginListMap; }
    public String keepMemberId_NotInScopeRelation_MemberLoginList(MemberLoginCQ subQuery) {
        if (_memberId_NotInScopeRelation_MemberLoginListMap == null) { _memberId_NotInScopeRelation_MemberLoginListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_memberId_NotInScopeRelation_MemberLoginListMap.size() + 1);
        _memberId_NotInScopeRelation_MemberLoginListMap.put(key, subQuery); return "memberId_NotInScopeRelation_MemberLoginList." + key;
    }

    protected Map<String, MemberSecurityCQ> _memberId_NotInScopeRelation_MemberSecurityAsOneMap;
    public Map<String, MemberSecurityCQ> getMemberId_NotInScopeRelation_MemberSecurityAsOne() { return _memberId_NotInScopeRelation_MemberSecurityAsOneMap; }
    public String keepMemberId_NotInScopeRelation_MemberSecurityAsOne(MemberSecurityCQ subQuery) {
        if (_memberId_NotInScopeRelation_MemberSecurityAsOneMap == null) { _memberId_NotInScopeRelation_MemberSecurityAsOneMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_memberId_NotInScopeRelation_MemberSecurityAsOneMap.size() + 1);
        _memberId_NotInScopeRelation_MemberSecurityAsOneMap.put(key, subQuery); return "memberId_NotInScopeRelation_MemberSecurityAsOne." + key;
    }

    protected Map<String, MemberServiceCQ> _memberId_NotInScopeRelation_MemberServiceAsOneMap;
    public Map<String, MemberServiceCQ> getMemberId_NotInScopeRelation_MemberServiceAsOne() { return _memberId_NotInScopeRelation_MemberServiceAsOneMap; }
    public String keepMemberId_NotInScopeRelation_MemberServiceAsOne(MemberServiceCQ subQuery) {
        if (_memberId_NotInScopeRelation_MemberServiceAsOneMap == null) { _memberId_NotInScopeRelation_MemberServiceAsOneMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_memberId_NotInScopeRelation_MemberServiceAsOneMap.size() + 1);
        _memberId_NotInScopeRelation_MemberServiceAsOneMap.put(key, subQuery); return "memberId_NotInScopeRelation_MemberServiceAsOne." + key;
    }

    protected Map<String, MemberWithdrawalCQ> _memberId_NotInScopeRelation_MemberWithdrawalAsOneMap;
    public Map<String, MemberWithdrawalCQ> getMemberId_NotInScopeRelation_MemberWithdrawalAsOne() { return _memberId_NotInScopeRelation_MemberWithdrawalAsOneMap; }
    public String keepMemberId_NotInScopeRelation_MemberWithdrawalAsOne(MemberWithdrawalCQ subQuery) {
        if (_memberId_NotInScopeRelation_MemberWithdrawalAsOneMap == null) { _memberId_NotInScopeRelation_MemberWithdrawalAsOneMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_memberId_NotInScopeRelation_MemberWithdrawalAsOneMap.size() + 1);
        _memberId_NotInScopeRelation_MemberWithdrawalAsOneMap.put(key, subQuery); return "memberId_NotInScopeRelation_MemberWithdrawalAsOne." + key;
    }

    protected Map<String, PurchaseCQ> _memberId_NotInScopeRelation_PurchaseListMap;
    public Map<String, PurchaseCQ> getMemberId_NotInScopeRelation_PurchaseList() { return _memberId_NotInScopeRelation_PurchaseListMap; }
    public String keepMemberId_NotInScopeRelation_PurchaseList(PurchaseCQ subQuery) {
        if (_memberId_NotInScopeRelation_PurchaseListMap == null) { _memberId_NotInScopeRelation_PurchaseListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_memberId_NotInScopeRelation_PurchaseListMap.size() + 1);
        _memberId_NotInScopeRelation_PurchaseListMap.put(key, subQuery); return "memberId_NotInScopeRelation_PurchaseList." + key;
    }

    protected Map<String, MemberAddressCQ> _memberId_QueryDerivedReferrer_MemberAddressListMap;
    public Map<String, MemberAddressCQ> getMemberId_QueryDerivedReferrer_MemberAddressList() { return _memberId_QueryDerivedReferrer_MemberAddressListMap; }
    public String keepMemberId_QueryDerivedReferrer_MemberAddressList(MemberAddressCQ subQuery) {
        if (_memberId_QueryDerivedReferrer_MemberAddressListMap == null) { _memberId_QueryDerivedReferrer_MemberAddressListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_memberId_QueryDerivedReferrer_MemberAddressListMap.size() + 1);
        _memberId_QueryDerivedReferrer_MemberAddressListMap.put(key, subQuery); return "memberId_QueryDerivedReferrer_MemberAddressList." + key;
    }
    protected Map<String, Object> _memberId_QueryDerivedReferrer_MemberAddressListParameterMap;
    public Map<String, Object> getMemberId_QueryDerivedReferrer_MemberAddressListParameter() { return _memberId_QueryDerivedReferrer_MemberAddressListParameterMap; }
    public String keepMemberId_QueryDerivedReferrer_MemberAddressListParameter(Object parameterValue) {
        if (_memberId_QueryDerivedReferrer_MemberAddressListParameterMap == null) { _memberId_QueryDerivedReferrer_MemberAddressListParameterMap = newLinkedHashMapSized(4); }
        String key = "subQueryParameterKey" + (_memberId_QueryDerivedReferrer_MemberAddressListParameterMap.size() + 1);
        _memberId_QueryDerivedReferrer_MemberAddressListParameterMap.put(key, parameterValue); return "memberId_QueryDerivedReferrer_MemberAddressListParameter." + key;
    }

    protected Map<String, MemberLoginCQ> _memberId_QueryDerivedReferrer_MemberLoginListMap;
    public Map<String, MemberLoginCQ> getMemberId_QueryDerivedReferrer_MemberLoginList() { return _memberId_QueryDerivedReferrer_MemberLoginListMap; }
    public String keepMemberId_QueryDerivedReferrer_MemberLoginList(MemberLoginCQ subQuery) {
        if (_memberId_QueryDerivedReferrer_MemberLoginListMap == null) { _memberId_QueryDerivedReferrer_MemberLoginListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_memberId_QueryDerivedReferrer_MemberLoginListMap.size() + 1);
        _memberId_QueryDerivedReferrer_MemberLoginListMap.put(key, subQuery); return "memberId_QueryDerivedReferrer_MemberLoginList." + key;
    }
    protected Map<String, Object> _memberId_QueryDerivedReferrer_MemberLoginListParameterMap;
    public Map<String, Object> getMemberId_QueryDerivedReferrer_MemberLoginListParameter() { return _memberId_QueryDerivedReferrer_MemberLoginListParameterMap; }
    public String keepMemberId_QueryDerivedReferrer_MemberLoginListParameter(Object parameterValue) {
        if (_memberId_QueryDerivedReferrer_MemberLoginListParameterMap == null) { _memberId_QueryDerivedReferrer_MemberLoginListParameterMap = newLinkedHashMapSized(4); }
        String key = "subQueryParameterKey" + (_memberId_QueryDerivedReferrer_MemberLoginListParameterMap.size() + 1);
        _memberId_QueryDerivedReferrer_MemberLoginListParameterMap.put(key, parameterValue); return "memberId_QueryDerivedReferrer_MemberLoginListParameter." + key;
    }

    protected Map<String, PurchaseCQ> _memberId_QueryDerivedReferrer_PurchaseListMap;
    public Map<String, PurchaseCQ> getMemberId_QueryDerivedReferrer_PurchaseList() { return _memberId_QueryDerivedReferrer_PurchaseListMap; }
    public String keepMemberId_QueryDerivedReferrer_PurchaseList(PurchaseCQ subQuery) {
        if (_memberId_QueryDerivedReferrer_PurchaseListMap == null) { _memberId_QueryDerivedReferrer_PurchaseListMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_memberId_QueryDerivedReferrer_PurchaseListMap.size() + 1);
        _memberId_QueryDerivedReferrer_PurchaseListMap.put(key, subQuery); return "memberId_QueryDerivedReferrer_PurchaseList." + key;
    }
    protected Map<String, Object> _memberId_QueryDerivedReferrer_PurchaseListParameterMap;
    public Map<String, Object> getMemberId_QueryDerivedReferrer_PurchaseListParameter() { return _memberId_QueryDerivedReferrer_PurchaseListParameterMap; }
    public String keepMemberId_QueryDerivedReferrer_PurchaseListParameter(Object parameterValue) {
        if (_memberId_QueryDerivedReferrer_PurchaseListParameterMap == null) { _memberId_QueryDerivedReferrer_PurchaseListParameterMap = newLinkedHashMapSized(4); }
        String key = "subQueryParameterKey" + (_memberId_QueryDerivedReferrer_PurchaseListParameterMap.size() + 1);
        _memberId_QueryDerivedReferrer_PurchaseListParameterMap.put(key, parameterValue); return "memberId_QueryDerivedReferrer_PurchaseListParameter." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * (会員ID)MEMBER_ID: {PK, ID, NotNull, INT(10), FK to MEMBER_ADDRESS}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_MemberId_Asc() { regOBA("MEMBER_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * (会員ID)MEMBER_ID: {PK, ID, NotNull, INT(10), FK to MEMBER_ADDRESS}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_MemberId_Desc() { regOBD("MEMBER_ID"); return this; }

    protected ConditionValue _memberName;
    public ConditionValue getMemberName() {
        if (_memberName == null) { _memberName = nCV(); }
        return _memberName;
    }
    protected ConditionValue getCValueMemberName() { return getMemberName(); }

    /** 
     * Add order-by as ascend. <br />
     * (会員名称)MEMBER_NAME: {IX, NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_MemberName_Asc() { regOBA("MEMBER_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * (会員名称)MEMBER_NAME: {IX, NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_MemberName_Desc() { regOBD("MEMBER_NAME"); return this; }

    protected ConditionValue _memberAccount;
    public ConditionValue getMemberAccount() {
        if (_memberAccount == null) { _memberAccount = nCV(); }
        return _memberAccount;
    }
    protected ConditionValue getCValueMemberAccount() { return getMemberAccount(); }

    /** 
     * Add order-by as ascend. <br />
     * (会員アカウント)MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_MemberAccount_Asc() { regOBA("MEMBER_ACCOUNT"); return this; }

    /**
     * Add order-by as descend. <br />
     * (会員アカウント)MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_MemberAccount_Desc() { regOBD("MEMBER_ACCOUNT"); return this; }

    protected ConditionValue _memberStatusCode;
    public ConditionValue getMemberStatusCode() {
        if (_memberStatusCode == null) { _memberStatusCode = nCV(); }
        return _memberStatusCode;
    }
    protected ConditionValue getCValueMemberStatusCode() { return getMemberStatusCode(); }

    protected Map<String, MemberStatusCQ> _memberStatusCode_InScopeRelation_MemberStatusMap;
    public Map<String, MemberStatusCQ> getMemberStatusCode_InScopeRelation_MemberStatus() { return _memberStatusCode_InScopeRelation_MemberStatusMap; }
    public String keepMemberStatusCode_InScopeRelation_MemberStatus(MemberStatusCQ subQuery) {
        if (_memberStatusCode_InScopeRelation_MemberStatusMap == null) { _memberStatusCode_InScopeRelation_MemberStatusMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_memberStatusCode_InScopeRelation_MemberStatusMap.size() + 1);
        _memberStatusCode_InScopeRelation_MemberStatusMap.put(key, subQuery); return "memberStatusCode_InScopeRelation_MemberStatus." + key;
    }

    protected Map<String, MemberStatusCQ> _memberStatusCode_NotInScopeRelation_MemberStatusMap;
    public Map<String, MemberStatusCQ> getMemberStatusCode_NotInScopeRelation_MemberStatus() { return _memberStatusCode_NotInScopeRelation_MemberStatusMap; }
    public String keepMemberStatusCode_NotInScopeRelation_MemberStatus(MemberStatusCQ subQuery) {
        if (_memberStatusCode_NotInScopeRelation_MemberStatusMap == null) { _memberStatusCode_NotInScopeRelation_MemberStatusMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_memberStatusCode_NotInScopeRelation_MemberStatusMap.size() + 1);
        _memberStatusCode_NotInScopeRelation_MemberStatusMap.put(key, subQuery); return "memberStatusCode_NotInScopeRelation_MemberStatus." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * (会員ステータスコード)MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to member_status, classification=MemberStatus}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_MemberStatusCode_Asc() { regOBA("MEMBER_STATUS_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * (会員ステータスコード)MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to member_status, classification=MemberStatus}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_MemberStatusCode_Desc() { regOBD("MEMBER_STATUS_CODE"); return this; }

    protected ConditionValue _formalizedDatetime;
    public ConditionValue getFormalizedDatetime() {
        if (_formalizedDatetime == null) { _formalizedDatetime = nCV(); }
        return _formalizedDatetime;
    }
    protected ConditionValue getCValueFormalizedDatetime() { return getFormalizedDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * (正式会員日時)FORMALIZED_DATETIME: {IX, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_FormalizedDatetime_Asc() { regOBA("FORMALIZED_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * (正式会員日時)FORMALIZED_DATETIME: {IX, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_FormalizedDatetime_Desc() { regOBD("FORMALIZED_DATETIME"); return this; }

    protected ConditionValue _birthdate;
    public ConditionValue getBirthdate() {
        if (_birthdate == null) { _birthdate = nCV(); }
        return _birthdate;
    }
    protected ConditionValue getCValueBirthdate() { return getBirthdate(); }

    /** 
     * Add order-by as ascend. <br />
     * (生年月日)BIRTHDATE: {DATE(10)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_Birthdate_Asc() { regOBA("BIRTHDATE"); return this; }

    /**
     * Add order-by as descend. <br />
     * (生年月日)BIRTHDATE: {DATE(10)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_Birthdate_Desc() { regOBD("BIRTHDATE"); return this; }

    protected ConditionValue _registerDatetime;
    public ConditionValue getRegisterDatetime() {
        if (_registerDatetime == null) { _registerDatetime = nCV(); }
        return _registerDatetime;
    }
    protected ConditionValue getCValueRegisterDatetime() { return getRegisterDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

    protected ConditionValue _registerUser;
    public ConditionValue getRegisterUser() {
        if (_registerUser == null) { _registerUser = nCV(); }
        return _registerUser;
    }
    protected ConditionValue getCValueRegisterUser() { return getRegisterUser(); }

    /** 
     * Add order-by as ascend. <br />
     * (登録ユーザ)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_RegisterUser_Asc() { regOBA("REGISTER_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * (登録ユーザ)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_RegisterUser_Desc() { regOBD("REGISTER_USER"); return this; }

    protected ConditionValue _updateDatetime;
    public ConditionValue getUpdateDatetime() {
        if (_updateDatetime == null) { _updateDatetime = nCV(); }
        return _updateDatetime;
    }
    protected ConditionValue getCValueUpdateDatetime() { return getUpdateDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

    protected ConditionValue _updateUser;
    public ConditionValue getUpdateUser() {
        if (_updateUser == null) { _updateUser = nCV(); }
        return _updateUser;
    }
    protected ConditionValue getCValueUpdateUser() { return getUpdateUser(); }

    /** 
     * Add order-by as ascend. <br />
     * (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_UpdateUser_Asc() { regOBA("UPDATE_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_UpdateUser_Desc() { regOBD("UPDATE_USER"); return this; }

    protected ConditionValue _versionNo;
    public ConditionValue getVersionNo() {
        if (_versionNo == null) { _versionNo = nCV(); }
        return _versionNo;
    }
    protected ConditionValue getCValueVersionNo() { return getVersionNo(); }

    /** 
     * Add order-by as ascend. <br />
     * (バージョンNO)VERSION_NO: {NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br />
     * (バージョンNO)VERSION_NO: {NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsMemberCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsMemberCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
        MemberCQ baseQuery = (MemberCQ)baseQueryAsSuper;
        MemberCQ unionQuery = (MemberCQ)unionQueryAsSuper;
        if (baseQuery.hasConditionQueryMemberStatus()) {
            unionQuery.queryMemberStatus().reflectRelationOnUnionQuery(baseQuery.queryMemberStatus(), unionQuery.queryMemberStatus());
        }
        if (baseQuery.hasConditionQueryMemberAddressAsValid()) {
            unionQuery.xsetParameterMapMemberAddressAsValid(baseQuery.getParameterMapMemberAddressAsValid());
            unionQuery.getConditionQueryMemberAddressAsValid().reflectRelationOnUnionQuery(baseQuery.getConditionQueryMemberAddressAsValid(), unionQuery.getConditionQueryMemberAddressAsValid());
        }
        if (baseQuery.hasConditionQueryMemberAddressAsValidBefore()) {
            unionQuery.xsetParameterMapMemberAddressAsValidBefore(baseQuery.getParameterMapMemberAddressAsValidBefore());
            unionQuery.getConditionQueryMemberAddressAsValidBefore().reflectRelationOnUnionQuery(baseQuery.getConditionQueryMemberAddressAsValidBefore(), unionQuery.getConditionQueryMemberAddressAsValidBefore());
        }
        if (baseQuery.hasConditionQueryMemberLoginAsLoginStatus()) {
            unionQuery.xsetParameterMapMemberLoginAsLoginStatus(baseQuery.getParameterMapMemberLoginAsLoginStatus());
            unionQuery.getConditionQueryMemberLoginAsLoginStatus().reflectRelationOnUnionQuery(baseQuery.getConditionQueryMemberLoginAsLoginStatus(), unionQuery.getConditionQueryMemberLoginAsLoginStatus());
        }
        if (baseQuery.hasConditionQueryMemberAddressAsIfComment()) {
            unionQuery.xsetParameterMapMemberAddressAsIfComment(baseQuery.getParameterMapMemberAddressAsIfComment());
            unionQuery.getConditionQueryMemberAddressAsIfComment().reflectRelationOnUnionQuery(baseQuery.getConditionQueryMemberAddressAsIfComment(), unionQuery.getConditionQueryMemberAddressAsIfComment());
        }
        if (baseQuery.hasConditionQueryMemberAddressAsOnlyOneDate()) {
            unionQuery.xsetParameterMapMemberAddressAsOnlyOneDate(baseQuery.getParameterMapMemberAddressAsOnlyOneDate());
            unionQuery.getConditionQueryMemberAddressAsOnlyOneDate().reflectRelationOnUnionQuery(baseQuery.getConditionQueryMemberAddressAsOnlyOneDate(), unionQuery.getConditionQueryMemberAddressAsOnlyOneDate());
        }
        if (baseQuery.hasConditionQueryMemberLoginAsLocalForeignOverTest()) {
            unionQuery.queryMemberLoginAsLocalForeignOverTest().reflectRelationOnUnionQuery(baseQuery.queryMemberLoginAsLocalForeignOverTest(), unionQuery.queryMemberLoginAsLocalForeignOverTest());
        }
        if (baseQuery.hasConditionQueryMemberLoginAsForeignForeignEachOverTest()) {
            unionQuery.queryMemberLoginAsForeignForeignEachOverTest().reflectRelationOnUnionQuery(baseQuery.queryMemberLoginAsForeignForeignEachOverTest(), unionQuery.queryMemberLoginAsForeignForeignEachOverTest());
        }
        if (baseQuery.hasConditionQueryMemberLoginAsForeignForeignOptimizedBasicOverTest()) {
            unionQuery.queryMemberLoginAsForeignForeignOptimizedBasicOverTest().reflectRelationOnUnionQuery(baseQuery.queryMemberLoginAsForeignForeignOptimizedBasicOverTest(), unionQuery.queryMemberLoginAsForeignForeignOptimizedBasicOverTest());
        }
        if (baseQuery.hasConditionQueryMemberLoginAsForeignForeignOptimizedMarkOverTest()) {
            unionQuery.queryMemberLoginAsForeignForeignOptimizedMarkOverTest().reflectRelationOnUnionQuery(baseQuery.queryMemberLoginAsForeignForeignOptimizedMarkOverTest(), unionQuery.queryMemberLoginAsForeignForeignOptimizedMarkOverTest());
        }
        if (baseQuery.hasConditionQueryMemberLoginAsForeignForeignOptimizedPartOverTest()) {
            unionQuery.xsetParameterMapMemberLoginAsForeignForeignOptimizedPartOverTest(baseQuery.getParameterMapMemberLoginAsForeignForeignOptimizedPartOverTest());
            unionQuery.getConditionQueryMemberLoginAsForeignForeignOptimizedPartOverTest().reflectRelationOnUnionQuery(baseQuery.getConditionQueryMemberLoginAsForeignForeignOptimizedPartOverTest(), unionQuery.getConditionQueryMemberLoginAsForeignForeignOptimizedPartOverTest());
        }
        if (baseQuery.hasConditionQueryMemberLoginAsForeignForeignOptimizedWholeOverTest()) {
            unionQuery.queryMemberLoginAsForeignForeignOptimizedWholeOverTest().reflectRelationOnUnionQuery(baseQuery.queryMemberLoginAsForeignForeignOptimizedWholeOverTest(), unionQuery.queryMemberLoginAsForeignForeignOptimizedWholeOverTest());
        }
        if (baseQuery.hasConditionQueryMemberLoginAsForeignForeignParameterOverTest()) {
            unionQuery.xsetParameterMapMemberLoginAsForeignForeignParameterOverTest(baseQuery.getParameterMapMemberLoginAsForeignForeignParameterOverTest());
            unionQuery.getConditionQueryMemberLoginAsForeignForeignParameterOverTest().reflectRelationOnUnionQuery(baseQuery.getConditionQueryMemberLoginAsForeignForeignParameterOverTest(), unionQuery.getConditionQueryMemberLoginAsForeignForeignParameterOverTest());
        }
        if (baseQuery.hasConditionQueryMemberLoginAsForeignForeignVariousOverTest()) {
            unionQuery.queryMemberLoginAsForeignForeignVariousOverTest().reflectRelationOnUnionQuery(baseQuery.queryMemberLoginAsForeignForeignVariousOverTest(), unionQuery.queryMemberLoginAsForeignForeignVariousOverTest());
        }
        if (baseQuery.hasConditionQueryMemberLoginAsReferrerOverTest()) {
            unionQuery.queryMemberLoginAsReferrerOverTest().reflectRelationOnUnionQuery(baseQuery.queryMemberLoginAsReferrerOverTest(), unionQuery.queryMemberLoginAsReferrerOverTest());
        }
        if (baseQuery.hasConditionQueryMemberLoginAsReferrerForeignOverTest()) {
            unionQuery.queryMemberLoginAsReferrerForeignOverTest().reflectRelationOnUnionQuery(baseQuery.queryMemberLoginAsReferrerForeignOverTest(), unionQuery.queryMemberLoginAsReferrerForeignOverTest());
        }
        if (baseQuery.hasConditionQueryMemberAddressAsFormattedBasic()) {
            unionQuery.xsetParameterMapMemberAddressAsFormattedBasic(baseQuery.getParameterMapMemberAddressAsFormattedBasic());
            unionQuery.getConditionQueryMemberAddressAsFormattedBasic().reflectRelationOnUnionQuery(baseQuery.getConditionQueryMemberAddressAsFormattedBasic(), unionQuery.getConditionQueryMemberAddressAsFormattedBasic());
        }
        if (baseQuery.hasConditionQueryMemberAddressAsFormattedLong()) {
            unionQuery.xsetParameterMapMemberAddressAsFormattedLong(baseQuery.getParameterMapMemberAddressAsFormattedLong());
            unionQuery.getConditionQueryMemberAddressAsFormattedLong().reflectRelationOnUnionQuery(baseQuery.getConditionQueryMemberAddressAsFormattedLong(), unionQuery.getConditionQueryMemberAddressAsFormattedLong());
        }
        if (baseQuery.hasConditionQueryMemberLoginAsFormattedMany()) {
            unionQuery.queryMemberLoginAsFormattedMany().reflectRelationOnUnionQuery(baseQuery.queryMemberLoginAsFormattedMany(), unionQuery.queryMemberLoginAsFormattedMany());
        }
        if (baseQuery.hasConditionQueryMemberLoginAsLatest()) {
            unionQuery.queryMemberLoginAsLatest().reflectRelationOnUnionQuery(baseQuery.queryMemberLoginAsLatest(), unionQuery.queryMemberLoginAsLatest());
        }
        if (baseQuery.hasConditionQueryMemberSecurityAsOne()) {
            unionQuery.queryMemberSecurityAsOne().reflectRelationOnUnionQuery(baseQuery.queryMemberSecurityAsOne(), unionQuery.queryMemberSecurityAsOne());
        }
        if (baseQuery.hasConditionQueryMemberServiceAsOne()) {
            unionQuery.queryMemberServiceAsOne().reflectRelationOnUnionQuery(baseQuery.queryMemberServiceAsOne(), unionQuery.queryMemberServiceAsOne());
        }
        if (baseQuery.hasConditionQueryMemberWithdrawalAsOne()) {
            unionQuery.queryMemberWithdrawalAsOne().reflectRelationOnUnionQuery(baseQuery.queryMemberWithdrawalAsOne(), unionQuery.queryMemberWithdrawalAsOne());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * (会員ステータス)member_status by my MEMBER_STATUS_CODE, named 'memberStatus'.
     * @return The instance of condition-query. (NotNull)
     */
    public MemberStatusCQ queryMemberStatus() {
        return getConditionQueryMemberStatus();
    }
    protected MemberStatusCQ _conditionQueryMemberStatus;
    public MemberStatusCQ getConditionQueryMemberStatus() {
        if (_conditionQueryMemberStatus == null) {
            _conditionQueryMemberStatus = xcreateQueryMemberStatus();
            xsetupOuterJoinMemberStatus();
        }
        return _conditionQueryMemberStatus;
    }
    protected MemberStatusCQ xcreateQueryMemberStatus() {
        String nrp = resolveNextRelationPath("member", "memberStatus");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        MemberStatusCQ cq = new MemberStatusCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("memberStatus");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinMemberStatus() {
        MemberStatusCQ cq = getConditionQueryMemberStatus();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("MEMBER_STATUS_CODE", "MEMBER_STATUS_CODE");
        registerOuterJoin(cq, joinOnMap, "memberStatus");
    }
    public boolean hasConditionQueryMemberStatus() {
        return _conditionQueryMemberStatus != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsValid'.
     * @param targetDate The bind parameter of fixed condition for targetDate. (NotNull)
     * @return The instance of condition-query. (NotNull)
     */
    public MemberAddressCQ queryMemberAddressAsValid(java.util.Date targetDate) {
        Map<String, Object> parameterMap = getParameterMapMemberAddressAsValid();
        parameterMap.put("targetDate", fCTPD(targetDate));
        assertFixedConditionDynamicParameter("memberAddressAsValid", parameterMap);
        return getConditionQueryMemberAddressAsValid();
    }
    protected MemberAddressCQ _conditionQueryMemberAddressAsValid;
    public MemberAddressCQ getConditionQueryMemberAddressAsValid() {
        if (_conditionQueryMemberAddressAsValid == null) {
            _conditionQueryMemberAddressAsValid = xcreateQueryMemberAddressAsValid();
            xsetupOuterJoinMemberAddressAsValid();
        }
        return _conditionQueryMemberAddressAsValid;
    }
    protected Map<String, Object> _parameterMapMemberAddressAsValid;
    public Map<String, Object> getParameterMapMemberAddressAsValid() {
        if (_parameterMapMemberAddressAsValid == null) {
            _parameterMapMemberAddressAsValid = newLinkedHashMapSized(4);
        }
        return _parameterMapMemberAddressAsValid;
    }
    public void xsetParameterMapMemberAddressAsValid(Map<String, Object> parameterMap) {
        _parameterMapMemberAddressAsValid = parameterMap; // for UnionQuery
    }
    protected MemberAddressCQ xcreateQueryMemberAddressAsValid() {
        String nrp = resolveNextRelationPath("member", "memberAddressAsValid");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        MemberAddressCQ cq = new MemberAddressCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("memberAddressAsValid");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinMemberAddressAsValid() {
        MemberAddressCQ cq = getConditionQueryMemberAddressAsValid();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("MEMBER_ID", "MEMBER_ID");
        registerOuterJoin(cq, joinOnMap, "memberAddressAsValid");
    }
    public boolean hasConditionQueryMemberAddressAsValid() {
        return _conditionQueryMemberAddressAsValid != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsValidBefore'.
     * @param targetDate The bind parameter of fixed condition for targetDate. (NotNull)
     * @return The instance of condition-query. (NotNull)
     */
    public MemberAddressCQ queryMemberAddressAsValidBefore(java.util.Date targetDate) {
        Map<String, Object> parameterMap = getParameterMapMemberAddressAsValidBefore();
        parameterMap.put("targetDate", fCTPD(targetDate));
        assertFixedConditionDynamicParameter("memberAddressAsValidBefore", parameterMap);
        return getConditionQueryMemberAddressAsValidBefore();
    }
    protected MemberAddressCQ _conditionQueryMemberAddressAsValidBefore;
    public MemberAddressCQ getConditionQueryMemberAddressAsValidBefore() {
        if (_conditionQueryMemberAddressAsValidBefore == null) {
            _conditionQueryMemberAddressAsValidBefore = xcreateQueryMemberAddressAsValidBefore();
            xsetupOuterJoinMemberAddressAsValidBefore();
        }
        return _conditionQueryMemberAddressAsValidBefore;
    }
    protected Map<String, Object> _parameterMapMemberAddressAsValidBefore;
    public Map<String, Object> getParameterMapMemberAddressAsValidBefore() {
        if (_parameterMapMemberAddressAsValidBefore == null) {
            _parameterMapMemberAddressAsValidBefore = newLinkedHashMapSized(4);
        }
        return _parameterMapMemberAddressAsValidBefore;
    }
    public void xsetParameterMapMemberAddressAsValidBefore(Map<String, Object> parameterMap) {
        _parameterMapMemberAddressAsValidBefore = parameterMap; // for UnionQuery
    }
    protected MemberAddressCQ xcreateQueryMemberAddressAsValidBefore() {
        String nrp = resolveNextRelationPath("member", "memberAddressAsValidBefore");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        MemberAddressCQ cq = new MemberAddressCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("memberAddressAsValidBefore");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinMemberAddressAsValidBefore() {
        MemberAddressCQ cq = getConditionQueryMemberAddressAsValidBefore();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("MEMBER_ID", "MEMBER_ID");
        registerOuterJoin(cq, joinOnMap, "memberAddressAsValidBefore");
    }
    public boolean hasConditionQueryMemberAddressAsValidBefore() {
        return _conditionQueryMemberAddressAsValidBefore != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsLoginStatus'.
     * @param statusCode The bind parameter of fixed condition for statusCode. (NotNull)
     * @return The instance of condition-query. (NotNull)
     */
    public MemberLoginCQ queryMemberLoginAsLoginStatus(com.example.dbflute.mysql.dbflute.allcommon.CDef.MemberStatus statusCode) {
        Map<String, Object> parameterMap = getParameterMapMemberLoginAsLoginStatus();
        parameterMap.put("statusCode", statusCode);
        assertFixedConditionDynamicParameter("memberLoginAsLoginStatus", parameterMap);
        return getConditionQueryMemberLoginAsLoginStatus();
    }
    protected MemberLoginCQ _conditionQueryMemberLoginAsLoginStatus;
    public MemberLoginCQ getConditionQueryMemberLoginAsLoginStatus() {
        if (_conditionQueryMemberLoginAsLoginStatus == null) {
            _conditionQueryMemberLoginAsLoginStatus = xcreateQueryMemberLoginAsLoginStatus();
            xsetupOuterJoinMemberLoginAsLoginStatus();
        }
        return _conditionQueryMemberLoginAsLoginStatus;
    }
    protected Map<String, Object> _parameterMapMemberLoginAsLoginStatus;
    public Map<String, Object> getParameterMapMemberLoginAsLoginStatus() {
        if (_parameterMapMemberLoginAsLoginStatus == null) {
            _parameterMapMemberLoginAsLoginStatus = newLinkedHashMapSized(4);
        }
        return _parameterMapMemberLoginAsLoginStatus;
    }
    public void xsetParameterMapMemberLoginAsLoginStatus(Map<String, Object> parameterMap) {
        _parameterMapMemberLoginAsLoginStatus = parameterMap; // for UnionQuery
    }
    protected MemberLoginCQ xcreateQueryMemberLoginAsLoginStatus() {
        String nrp = resolveNextRelationPath("member", "memberLoginAsLoginStatus");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        MemberLoginCQ cq = new MemberLoginCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("memberLoginAsLoginStatus");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinMemberLoginAsLoginStatus() {
        MemberLoginCQ cq = getConditionQueryMemberLoginAsLoginStatus();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("MEMBER_ID", "MEMBER_ID");
        registerOuterJoin(cq, joinOnMap, "memberLoginAsLoginStatus");
    }
    public boolean hasConditionQueryMemberLoginAsLoginStatus() {
        return _conditionQueryMemberLoginAsLoginStatus != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsIfComment'.
     * @param targetDate The bind parameter of fixed condition for targetDate. (might be NullAllowed: IF comment exists in the fixed condition)
     * @param region The bind parameter of fixed condition for region. (might be NullAllowed: IF comment exists in the fixed condition)
     * @return The instance of condition-query. (NotNull)
     */
    public MemberAddressCQ queryMemberAddressAsIfComment(java.util.Date targetDate, com.example.dbflute.mysql.dbflute.allcommon.CDef.Region region) {
        Map<String, Object> parameterMap = getParameterMapMemberAddressAsIfComment();
        parameterMap.put("targetDate", fCTPD(targetDate));parameterMap.put("region", region);
        assertFixedConditionDynamicParameter("memberAddressAsIfComment", parameterMap);
        return getConditionQueryMemberAddressAsIfComment();
    }
    protected MemberAddressCQ _conditionQueryMemberAddressAsIfComment;
    public MemberAddressCQ getConditionQueryMemberAddressAsIfComment() {
        if (_conditionQueryMemberAddressAsIfComment == null) {
            _conditionQueryMemberAddressAsIfComment = xcreateQueryMemberAddressAsIfComment();
            xsetupOuterJoinMemberAddressAsIfComment();
        }
        return _conditionQueryMemberAddressAsIfComment;
    }
    protected Map<String, Object> _parameterMapMemberAddressAsIfComment;
    public Map<String, Object> getParameterMapMemberAddressAsIfComment() {
        if (_parameterMapMemberAddressAsIfComment == null) {
            _parameterMapMemberAddressAsIfComment = newLinkedHashMapSized(4);
        }
        return _parameterMapMemberAddressAsIfComment;
    }
    public void xsetParameterMapMemberAddressAsIfComment(Map<String, Object> parameterMap) {
        _parameterMapMemberAddressAsIfComment = parameterMap; // for UnionQuery
    }
    protected MemberAddressCQ xcreateQueryMemberAddressAsIfComment() {
        String nrp = resolveNextRelationPath("member", "memberAddressAsIfComment");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        MemberAddressCQ cq = new MemberAddressCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("memberAddressAsIfComment");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinMemberAddressAsIfComment() {
        MemberAddressCQ cq = getConditionQueryMemberAddressAsIfComment();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("MEMBER_ID", "MEMBER_ID");
        registerOuterJoin(cq, joinOnMap, "memberAddressAsIfComment");
    }
    public boolean hasConditionQueryMemberAddressAsIfComment() {
        return _conditionQueryMemberAddressAsIfComment != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsOnlyOneDate'.
     * @param targetDate The bind parameter of fixed condition for targetDate. (NotNull)
     * @return The instance of condition-query. (NotNull)
     */
    public MemberAddressCQ queryMemberAddressAsOnlyOneDate(java.util.Date targetDate) {
        Map<String, Object> parameterMap = getParameterMapMemberAddressAsOnlyOneDate();
        parameterMap.put("targetDate", fCTPD(targetDate));
        assertFixedConditionDynamicParameter("memberAddressAsOnlyOneDate", parameterMap);
        return getConditionQueryMemberAddressAsOnlyOneDate();
    }
    protected MemberAddressCQ _conditionQueryMemberAddressAsOnlyOneDate;
    public MemberAddressCQ getConditionQueryMemberAddressAsOnlyOneDate() {
        if (_conditionQueryMemberAddressAsOnlyOneDate == null) {
            _conditionQueryMemberAddressAsOnlyOneDate = xcreateQueryMemberAddressAsOnlyOneDate();
            xsetupOuterJoinMemberAddressAsOnlyOneDate();
        }
        return _conditionQueryMemberAddressAsOnlyOneDate;
    }
    protected Map<String, Object> _parameterMapMemberAddressAsOnlyOneDate;
    public Map<String, Object> getParameterMapMemberAddressAsOnlyOneDate() {
        if (_parameterMapMemberAddressAsOnlyOneDate == null) {
            _parameterMapMemberAddressAsOnlyOneDate = newLinkedHashMapSized(4);
        }
        return _parameterMapMemberAddressAsOnlyOneDate;
    }
    public void xsetParameterMapMemberAddressAsOnlyOneDate(Map<String, Object> parameterMap) {
        _parameterMapMemberAddressAsOnlyOneDate = parameterMap; // for UnionQuery
    }
    protected MemberAddressCQ xcreateQueryMemberAddressAsOnlyOneDate() {
        String nrp = resolveNextRelationPath("member", "memberAddressAsOnlyOneDate");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        MemberAddressCQ cq = new MemberAddressCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("memberAddressAsOnlyOneDate");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinMemberAddressAsOnlyOneDate() {
        MemberAddressCQ cq = getConditionQueryMemberAddressAsOnlyOneDate();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("MEMBER_ID", "MEMBER_ID");
        registerOuterJoin(cq, joinOnMap, "memberAddressAsOnlyOneDate");
    }
    public boolean hasConditionQueryMemberAddressAsOnlyOneDate() {
        return _conditionQueryMemberAddressAsOnlyOneDate != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsLocalForeignOverTest'.
     * @return The instance of condition-query. (NotNull)
     */
    public MemberLoginCQ queryMemberLoginAsLocalForeignOverTest() {
        return getConditionQueryMemberLoginAsLocalForeignOverTest();
    }
    protected MemberLoginCQ _conditionQueryMemberLoginAsLocalForeignOverTest;
    public MemberLoginCQ getConditionQueryMemberLoginAsLocalForeignOverTest() {
        if (_conditionQueryMemberLoginAsLocalForeignOverTest == null) {
            _conditionQueryMemberLoginAsLocalForeignOverTest = xcreateQueryMemberLoginAsLocalForeignOverTest();
            xsetupOuterJoinMemberLoginAsLocalForeignOverTest();
        }
        return _conditionQueryMemberLoginAsLocalForeignOverTest;
    }
    protected MemberLoginCQ xcreateQueryMemberLoginAsLocalForeignOverTest() {
        String nrp = resolveNextRelationPath("member", "memberLoginAsLocalForeignOverTest");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        MemberLoginCQ cq = new MemberLoginCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("memberLoginAsLocalForeignOverTest");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinMemberLoginAsLocalForeignOverTest() {
        MemberLoginCQ cq = getConditionQueryMemberLoginAsLocalForeignOverTest();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("MEMBER_ID", "MEMBER_ID");
        registerOuterJoin(cq, joinOnMap, "memberLoginAsLocalForeignOverTest");
    }
    public boolean hasConditionQueryMemberLoginAsLocalForeignOverTest() {
        return _conditionQueryMemberLoginAsLocalForeignOverTest != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignEachOverTest'.
     * @return The instance of condition-query. (NotNull)
     */
    public MemberLoginCQ queryMemberLoginAsForeignForeignEachOverTest() {
        return getConditionQueryMemberLoginAsForeignForeignEachOverTest();
    }
    protected MemberLoginCQ _conditionQueryMemberLoginAsForeignForeignEachOverTest;
    public MemberLoginCQ getConditionQueryMemberLoginAsForeignForeignEachOverTest() {
        if (_conditionQueryMemberLoginAsForeignForeignEachOverTest == null) {
            _conditionQueryMemberLoginAsForeignForeignEachOverTest = xcreateQueryMemberLoginAsForeignForeignEachOverTest();
            xsetupOuterJoinMemberLoginAsForeignForeignEachOverTest();
        }
        return _conditionQueryMemberLoginAsForeignForeignEachOverTest;
    }
    protected MemberLoginCQ xcreateQueryMemberLoginAsForeignForeignEachOverTest() {
        String nrp = resolveNextRelationPath("member", "memberLoginAsForeignForeignEachOverTest");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        MemberLoginCQ cq = new MemberLoginCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("memberLoginAsForeignForeignEachOverTest");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinMemberLoginAsForeignForeignEachOverTest() {
        MemberLoginCQ cq = getConditionQueryMemberLoginAsForeignForeignEachOverTest();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("MEMBER_ID", "MEMBER_ID");
        registerOuterJoin(cq, joinOnMap, "memberLoginAsForeignForeignEachOverTest");
    }
    public boolean hasConditionQueryMemberLoginAsForeignForeignEachOverTest() {
        return _conditionQueryMemberLoginAsForeignForeignEachOverTest != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignOptimizedBasicOverTest'.
     * @return The instance of condition-query. (NotNull)
     */
    public MemberLoginCQ queryMemberLoginAsForeignForeignOptimizedBasicOverTest() {
        return getConditionQueryMemberLoginAsForeignForeignOptimizedBasicOverTest();
    }
    protected MemberLoginCQ _conditionQueryMemberLoginAsForeignForeignOptimizedBasicOverTest;
    public MemberLoginCQ getConditionQueryMemberLoginAsForeignForeignOptimizedBasicOverTest() {
        if (_conditionQueryMemberLoginAsForeignForeignOptimizedBasicOverTest == null) {
            _conditionQueryMemberLoginAsForeignForeignOptimizedBasicOverTest = xcreateQueryMemberLoginAsForeignForeignOptimizedBasicOverTest();
            xsetupOuterJoinMemberLoginAsForeignForeignOptimizedBasicOverTest();
        }
        return _conditionQueryMemberLoginAsForeignForeignOptimizedBasicOverTest;
    }
    protected MemberLoginCQ xcreateQueryMemberLoginAsForeignForeignOptimizedBasicOverTest() {
        String nrp = resolveNextRelationPath("member", "memberLoginAsForeignForeignOptimizedBasicOverTest");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        MemberLoginCQ cq = new MemberLoginCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("memberLoginAsForeignForeignOptimizedBasicOverTest");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinMemberLoginAsForeignForeignOptimizedBasicOverTest() {
        MemberLoginCQ cq = getConditionQueryMemberLoginAsForeignForeignOptimizedBasicOverTest();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("MEMBER_ID", "MEMBER_ID");
        registerOuterJoin(cq, joinOnMap, "memberLoginAsForeignForeignOptimizedBasicOverTest");
    }
    public boolean hasConditionQueryMemberLoginAsForeignForeignOptimizedBasicOverTest() {
        return _conditionQueryMemberLoginAsForeignForeignOptimizedBasicOverTest != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignOptimizedMarkOverTest'.
     * @return The instance of condition-query. (NotNull)
     */
    public MemberLoginCQ queryMemberLoginAsForeignForeignOptimizedMarkOverTest() {
        return getConditionQueryMemberLoginAsForeignForeignOptimizedMarkOverTest();
    }
    protected MemberLoginCQ _conditionQueryMemberLoginAsForeignForeignOptimizedMarkOverTest;
    public MemberLoginCQ getConditionQueryMemberLoginAsForeignForeignOptimizedMarkOverTest() {
        if (_conditionQueryMemberLoginAsForeignForeignOptimizedMarkOverTest == null) {
            _conditionQueryMemberLoginAsForeignForeignOptimizedMarkOverTest = xcreateQueryMemberLoginAsForeignForeignOptimizedMarkOverTest();
            xsetupOuterJoinMemberLoginAsForeignForeignOptimizedMarkOverTest();
        }
        return _conditionQueryMemberLoginAsForeignForeignOptimizedMarkOverTest;
    }
    protected MemberLoginCQ xcreateQueryMemberLoginAsForeignForeignOptimizedMarkOverTest() {
        String nrp = resolveNextRelationPath("member", "memberLoginAsForeignForeignOptimizedMarkOverTest");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        MemberLoginCQ cq = new MemberLoginCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("memberLoginAsForeignForeignOptimizedMarkOverTest");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinMemberLoginAsForeignForeignOptimizedMarkOverTest() {
        MemberLoginCQ cq = getConditionQueryMemberLoginAsForeignForeignOptimizedMarkOverTest();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("MEMBER_ID", "MEMBER_ID");
        registerOuterJoin(cq, joinOnMap, "memberLoginAsForeignForeignOptimizedMarkOverTest");
    }
    public boolean hasConditionQueryMemberLoginAsForeignForeignOptimizedMarkOverTest() {
        return _conditionQueryMemberLoginAsForeignForeignOptimizedMarkOverTest != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignOptimizedPartOverTest'.
     * @param memberName The bind parameter of fixed condition for memberName. (NotNull)
     * @return The instance of condition-query. (NotNull)
     */
    public MemberLoginCQ queryMemberLoginAsForeignForeignOptimizedPartOverTest(String memberName) {
        Map<String, Object> parameterMap = getParameterMapMemberLoginAsForeignForeignOptimizedPartOverTest();
        parameterMap.put("memberName", memberName);
        assertFixedConditionDynamicParameter("memberLoginAsForeignForeignOptimizedPartOverTest", parameterMap);
        return getConditionQueryMemberLoginAsForeignForeignOptimizedPartOverTest();
    }
    protected MemberLoginCQ _conditionQueryMemberLoginAsForeignForeignOptimizedPartOverTest;
    public MemberLoginCQ getConditionQueryMemberLoginAsForeignForeignOptimizedPartOverTest() {
        if (_conditionQueryMemberLoginAsForeignForeignOptimizedPartOverTest == null) {
            _conditionQueryMemberLoginAsForeignForeignOptimizedPartOverTest = xcreateQueryMemberLoginAsForeignForeignOptimizedPartOverTest();
            xsetupOuterJoinMemberLoginAsForeignForeignOptimizedPartOverTest();
        }
        return _conditionQueryMemberLoginAsForeignForeignOptimizedPartOverTest;
    }
    protected Map<String, Object> _parameterMapMemberLoginAsForeignForeignOptimizedPartOverTest;
    public Map<String, Object> getParameterMapMemberLoginAsForeignForeignOptimizedPartOverTest() {
        if (_parameterMapMemberLoginAsForeignForeignOptimizedPartOverTest == null) {
            _parameterMapMemberLoginAsForeignForeignOptimizedPartOverTest = newLinkedHashMapSized(4);
        }
        return _parameterMapMemberLoginAsForeignForeignOptimizedPartOverTest;
    }
    public void xsetParameterMapMemberLoginAsForeignForeignOptimizedPartOverTest(Map<String, Object> parameterMap) {
        _parameterMapMemberLoginAsForeignForeignOptimizedPartOverTest = parameterMap; // for UnionQuery
    }
    protected MemberLoginCQ xcreateQueryMemberLoginAsForeignForeignOptimizedPartOverTest() {
        String nrp = resolveNextRelationPath("member", "memberLoginAsForeignForeignOptimizedPartOverTest");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        MemberLoginCQ cq = new MemberLoginCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("memberLoginAsForeignForeignOptimizedPartOverTest");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinMemberLoginAsForeignForeignOptimizedPartOverTest() {
        MemberLoginCQ cq = getConditionQueryMemberLoginAsForeignForeignOptimizedPartOverTest();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("MEMBER_ID", "MEMBER_ID");
        registerOuterJoin(cq, joinOnMap, "memberLoginAsForeignForeignOptimizedPartOverTest");
    }
    public boolean hasConditionQueryMemberLoginAsForeignForeignOptimizedPartOverTest() {
        return _conditionQueryMemberLoginAsForeignForeignOptimizedPartOverTest != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignOptimizedWholeOverTest'.
     * @return The instance of condition-query. (NotNull)
     */
    public MemberLoginCQ queryMemberLoginAsForeignForeignOptimizedWholeOverTest() {
        return getConditionQueryMemberLoginAsForeignForeignOptimizedWholeOverTest();
    }
    protected MemberLoginCQ _conditionQueryMemberLoginAsForeignForeignOptimizedWholeOverTest;
    public MemberLoginCQ getConditionQueryMemberLoginAsForeignForeignOptimizedWholeOverTest() {
        if (_conditionQueryMemberLoginAsForeignForeignOptimizedWholeOverTest == null) {
            _conditionQueryMemberLoginAsForeignForeignOptimizedWholeOverTest = xcreateQueryMemberLoginAsForeignForeignOptimizedWholeOverTest();
            xsetupOuterJoinMemberLoginAsForeignForeignOptimizedWholeOverTest();
        }
        return _conditionQueryMemberLoginAsForeignForeignOptimizedWholeOverTest;
    }
    protected MemberLoginCQ xcreateQueryMemberLoginAsForeignForeignOptimizedWholeOverTest() {
        String nrp = resolveNextRelationPath("member", "memberLoginAsForeignForeignOptimizedWholeOverTest");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        MemberLoginCQ cq = new MemberLoginCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("memberLoginAsForeignForeignOptimizedWholeOverTest");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinMemberLoginAsForeignForeignOptimizedWholeOverTest() {
        MemberLoginCQ cq = getConditionQueryMemberLoginAsForeignForeignOptimizedWholeOverTest();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("MEMBER_ID", "MEMBER_ID");
        registerOuterJoin(cq, joinOnMap, "memberLoginAsForeignForeignOptimizedWholeOverTest");
    }
    public boolean hasConditionQueryMemberLoginAsForeignForeignOptimizedWholeOverTest() {
        return _conditionQueryMemberLoginAsForeignForeignOptimizedWholeOverTest != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignParameterOverTest'.
     * @param targetDate The bind parameter of fixed condition for targetDate. (NotNull)
     * @return The instance of condition-query. (NotNull)
     */
    public MemberLoginCQ queryMemberLoginAsForeignForeignParameterOverTest(java.util.Date targetDate) {
        Map<String, Object> parameterMap = getParameterMapMemberLoginAsForeignForeignParameterOverTest();
        parameterMap.put("targetDate", fCTPD(targetDate));
        assertFixedConditionDynamicParameter("memberLoginAsForeignForeignParameterOverTest", parameterMap);
        return getConditionQueryMemberLoginAsForeignForeignParameterOverTest();
    }
    protected MemberLoginCQ _conditionQueryMemberLoginAsForeignForeignParameterOverTest;
    public MemberLoginCQ getConditionQueryMemberLoginAsForeignForeignParameterOverTest() {
        if (_conditionQueryMemberLoginAsForeignForeignParameterOverTest == null) {
            _conditionQueryMemberLoginAsForeignForeignParameterOverTest = xcreateQueryMemberLoginAsForeignForeignParameterOverTest();
            xsetupOuterJoinMemberLoginAsForeignForeignParameterOverTest();
        }
        return _conditionQueryMemberLoginAsForeignForeignParameterOverTest;
    }
    protected Map<String, Object> _parameterMapMemberLoginAsForeignForeignParameterOverTest;
    public Map<String, Object> getParameterMapMemberLoginAsForeignForeignParameterOverTest() {
        if (_parameterMapMemberLoginAsForeignForeignParameterOverTest == null) {
            _parameterMapMemberLoginAsForeignForeignParameterOverTest = newLinkedHashMapSized(4);
        }
        return _parameterMapMemberLoginAsForeignForeignParameterOverTest;
    }
    public void xsetParameterMapMemberLoginAsForeignForeignParameterOverTest(Map<String, Object> parameterMap) {
        _parameterMapMemberLoginAsForeignForeignParameterOverTest = parameterMap; // for UnionQuery
    }
    protected MemberLoginCQ xcreateQueryMemberLoginAsForeignForeignParameterOverTest() {
        String nrp = resolveNextRelationPath("member", "memberLoginAsForeignForeignParameterOverTest");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        MemberLoginCQ cq = new MemberLoginCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("memberLoginAsForeignForeignParameterOverTest");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinMemberLoginAsForeignForeignParameterOverTest() {
        MemberLoginCQ cq = getConditionQueryMemberLoginAsForeignForeignParameterOverTest();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("MEMBER_ID", "MEMBER_ID");
        registerOuterJoin(cq, joinOnMap, "memberLoginAsForeignForeignParameterOverTest");
    }
    public boolean hasConditionQueryMemberLoginAsForeignForeignParameterOverTest() {
        return _conditionQueryMemberLoginAsForeignForeignParameterOverTest != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignVariousOverTest'.
     * @return The instance of condition-query. (NotNull)
     */
    public MemberLoginCQ queryMemberLoginAsForeignForeignVariousOverTest() {
        return getConditionQueryMemberLoginAsForeignForeignVariousOverTest();
    }
    protected MemberLoginCQ _conditionQueryMemberLoginAsForeignForeignVariousOverTest;
    public MemberLoginCQ getConditionQueryMemberLoginAsForeignForeignVariousOverTest() {
        if (_conditionQueryMemberLoginAsForeignForeignVariousOverTest == null) {
            _conditionQueryMemberLoginAsForeignForeignVariousOverTest = xcreateQueryMemberLoginAsForeignForeignVariousOverTest();
            xsetupOuterJoinMemberLoginAsForeignForeignVariousOverTest();
        }
        return _conditionQueryMemberLoginAsForeignForeignVariousOverTest;
    }
    protected MemberLoginCQ xcreateQueryMemberLoginAsForeignForeignVariousOverTest() {
        String nrp = resolveNextRelationPath("member", "memberLoginAsForeignForeignVariousOverTest");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        MemberLoginCQ cq = new MemberLoginCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("memberLoginAsForeignForeignVariousOverTest");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinMemberLoginAsForeignForeignVariousOverTest() {
        MemberLoginCQ cq = getConditionQueryMemberLoginAsForeignForeignVariousOverTest();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("MEMBER_ID", "MEMBER_ID");
        registerOuterJoin(cq, joinOnMap, "memberLoginAsForeignForeignVariousOverTest");
    }
    public boolean hasConditionQueryMemberLoginAsForeignForeignVariousOverTest() {
        return _conditionQueryMemberLoginAsForeignForeignVariousOverTest != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsReferrerOverTest'.
     * @return The instance of condition-query. (NotNull)
     */
    public MemberLoginCQ queryMemberLoginAsReferrerOverTest() {
        return getConditionQueryMemberLoginAsReferrerOverTest();
    }
    protected MemberLoginCQ _conditionQueryMemberLoginAsReferrerOverTest;
    public MemberLoginCQ getConditionQueryMemberLoginAsReferrerOverTest() {
        if (_conditionQueryMemberLoginAsReferrerOverTest == null) {
            _conditionQueryMemberLoginAsReferrerOverTest = xcreateQueryMemberLoginAsReferrerOverTest();
            xsetupOuterJoinMemberLoginAsReferrerOverTest();
        }
        return _conditionQueryMemberLoginAsReferrerOverTest;
    }
    protected MemberLoginCQ xcreateQueryMemberLoginAsReferrerOverTest() {
        String nrp = resolveNextRelationPath("member", "memberLoginAsReferrerOverTest");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        MemberLoginCQ cq = new MemberLoginCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("memberLoginAsReferrerOverTest");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinMemberLoginAsReferrerOverTest() {
        MemberLoginCQ cq = getConditionQueryMemberLoginAsReferrerOverTest();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("MEMBER_ID", "MEMBER_ID");
        registerOuterJoin(cq, joinOnMap, "memberLoginAsReferrerOverTest");
    }
    public boolean hasConditionQueryMemberLoginAsReferrerOverTest() {
        return _conditionQueryMemberLoginAsReferrerOverTest != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsReferrerForeignOverTest'.
     * @return The instance of condition-query. (NotNull)
     */
    public MemberLoginCQ queryMemberLoginAsReferrerForeignOverTest() {
        return getConditionQueryMemberLoginAsReferrerForeignOverTest();
    }
    protected MemberLoginCQ _conditionQueryMemberLoginAsReferrerForeignOverTest;
    public MemberLoginCQ getConditionQueryMemberLoginAsReferrerForeignOverTest() {
        if (_conditionQueryMemberLoginAsReferrerForeignOverTest == null) {
            _conditionQueryMemberLoginAsReferrerForeignOverTest = xcreateQueryMemberLoginAsReferrerForeignOverTest();
            xsetupOuterJoinMemberLoginAsReferrerForeignOverTest();
        }
        return _conditionQueryMemberLoginAsReferrerForeignOverTest;
    }
    protected MemberLoginCQ xcreateQueryMemberLoginAsReferrerForeignOverTest() {
        String nrp = resolveNextRelationPath("member", "memberLoginAsReferrerForeignOverTest");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        MemberLoginCQ cq = new MemberLoginCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("memberLoginAsReferrerForeignOverTest");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinMemberLoginAsReferrerForeignOverTest() {
        MemberLoginCQ cq = getConditionQueryMemberLoginAsReferrerForeignOverTest();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("MEMBER_ID", "MEMBER_ID");
        registerOuterJoin(cq, joinOnMap, "memberLoginAsReferrerForeignOverTest");
    }
    public boolean hasConditionQueryMemberLoginAsReferrerForeignOverTest() {
        return _conditionQueryMemberLoginAsReferrerForeignOverTest != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsFormattedBasic'.
     * @param targetDate The bind parameter of fixed condition for targetDate. (NotNull)
     * @return The instance of condition-query. (NotNull)
     */
    public MemberAddressCQ queryMemberAddressAsFormattedBasic(java.util.Date targetDate) {
        Map<String, Object> parameterMap = getParameterMapMemberAddressAsFormattedBasic();
        parameterMap.put("targetDate", fCTPD(targetDate));
        assertFixedConditionDynamicParameter("memberAddressAsFormattedBasic", parameterMap);
        return getConditionQueryMemberAddressAsFormattedBasic();
    }
    protected MemberAddressCQ _conditionQueryMemberAddressAsFormattedBasic;
    public MemberAddressCQ getConditionQueryMemberAddressAsFormattedBasic() {
        if (_conditionQueryMemberAddressAsFormattedBasic == null) {
            _conditionQueryMemberAddressAsFormattedBasic = xcreateQueryMemberAddressAsFormattedBasic();
            xsetupOuterJoinMemberAddressAsFormattedBasic();
        }
        return _conditionQueryMemberAddressAsFormattedBasic;
    }
    protected Map<String, Object> _parameterMapMemberAddressAsFormattedBasic;
    public Map<String, Object> getParameterMapMemberAddressAsFormattedBasic() {
        if (_parameterMapMemberAddressAsFormattedBasic == null) {
            _parameterMapMemberAddressAsFormattedBasic = newLinkedHashMapSized(4);
        }
        return _parameterMapMemberAddressAsFormattedBasic;
    }
    public void xsetParameterMapMemberAddressAsFormattedBasic(Map<String, Object> parameterMap) {
        _parameterMapMemberAddressAsFormattedBasic = parameterMap; // for UnionQuery
    }
    protected MemberAddressCQ xcreateQueryMemberAddressAsFormattedBasic() {
        String nrp = resolveNextRelationPath("member", "memberAddressAsFormattedBasic");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        MemberAddressCQ cq = new MemberAddressCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("memberAddressAsFormattedBasic");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinMemberAddressAsFormattedBasic() {
        MemberAddressCQ cq = getConditionQueryMemberAddressAsFormattedBasic();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("MEMBER_ID", "MEMBER_ID");
        registerOuterJoin(cq, joinOnMap, "memberAddressAsFormattedBasic");
    }
    public boolean hasConditionQueryMemberAddressAsFormattedBasic() {
        return _conditionQueryMemberAddressAsFormattedBasic != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsFormattedLong'.
     * @param targetDate The bind parameter of fixed condition for targetDate. (NotNull)
     * @return The instance of condition-query. (NotNull)
     */
    public MemberAddressCQ queryMemberAddressAsFormattedLong(java.util.Date targetDate) {
        Map<String, Object> parameterMap = getParameterMapMemberAddressAsFormattedLong();
        parameterMap.put("targetDate", fCTPD(targetDate));
        assertFixedConditionDynamicParameter("memberAddressAsFormattedLong", parameterMap);
        return getConditionQueryMemberAddressAsFormattedLong();
    }
    protected MemberAddressCQ _conditionQueryMemberAddressAsFormattedLong;
    public MemberAddressCQ getConditionQueryMemberAddressAsFormattedLong() {
        if (_conditionQueryMemberAddressAsFormattedLong == null) {
            _conditionQueryMemberAddressAsFormattedLong = xcreateQueryMemberAddressAsFormattedLong();
            xsetupOuterJoinMemberAddressAsFormattedLong();
        }
        return _conditionQueryMemberAddressAsFormattedLong;
    }
    protected Map<String, Object> _parameterMapMemberAddressAsFormattedLong;
    public Map<String, Object> getParameterMapMemberAddressAsFormattedLong() {
        if (_parameterMapMemberAddressAsFormattedLong == null) {
            _parameterMapMemberAddressAsFormattedLong = newLinkedHashMapSized(4);
        }
        return _parameterMapMemberAddressAsFormattedLong;
    }
    public void xsetParameterMapMemberAddressAsFormattedLong(Map<String, Object> parameterMap) {
        _parameterMapMemberAddressAsFormattedLong = parameterMap; // for UnionQuery
    }
    protected MemberAddressCQ xcreateQueryMemberAddressAsFormattedLong() {
        String nrp = resolveNextRelationPath("member", "memberAddressAsFormattedLong");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        MemberAddressCQ cq = new MemberAddressCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("memberAddressAsFormattedLong");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinMemberAddressAsFormattedLong() {
        MemberAddressCQ cq = getConditionQueryMemberAddressAsFormattedLong();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("MEMBER_ID", "MEMBER_ID");
        registerOuterJoin(cq, joinOnMap, "memberAddressAsFormattedLong");
    }
    public boolean hasConditionQueryMemberAddressAsFormattedLong() {
        return _conditionQueryMemberAddressAsFormattedLong != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsFormattedMany'.
     * @return The instance of condition-query. (NotNull)
     */
    public MemberLoginCQ queryMemberLoginAsFormattedMany() {
        return getConditionQueryMemberLoginAsFormattedMany();
    }
    protected MemberLoginCQ _conditionQueryMemberLoginAsFormattedMany;
    public MemberLoginCQ getConditionQueryMemberLoginAsFormattedMany() {
        if (_conditionQueryMemberLoginAsFormattedMany == null) {
            _conditionQueryMemberLoginAsFormattedMany = xcreateQueryMemberLoginAsFormattedMany();
            xsetupOuterJoinMemberLoginAsFormattedMany();
        }
        return _conditionQueryMemberLoginAsFormattedMany;
    }
    protected MemberLoginCQ xcreateQueryMemberLoginAsFormattedMany() {
        String nrp = resolveNextRelationPath("member", "memberLoginAsFormattedMany");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        MemberLoginCQ cq = new MemberLoginCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("memberLoginAsFormattedMany");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinMemberLoginAsFormattedMany() {
        MemberLoginCQ cq = getConditionQueryMemberLoginAsFormattedMany();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("MEMBER_ID", "MEMBER_ID");
        registerOuterJoin(cq, joinOnMap, "memberLoginAsFormattedMany");
    }
    public boolean hasConditionQueryMemberLoginAsFormattedMany() {
        return _conditionQueryMemberLoginAsFormattedMany != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsLatest'.
     * @return The instance of condition-query. (NotNull)
     */
    public MemberLoginCQ queryMemberLoginAsLatest() {
        return getConditionQueryMemberLoginAsLatest();
    }
    protected MemberLoginCQ _conditionQueryMemberLoginAsLatest;
    public MemberLoginCQ getConditionQueryMemberLoginAsLatest() {
        if (_conditionQueryMemberLoginAsLatest == null) {
            _conditionQueryMemberLoginAsLatest = xcreateQueryMemberLoginAsLatest();
            xsetupOuterJoinMemberLoginAsLatest();
        }
        return _conditionQueryMemberLoginAsLatest;
    }
    protected MemberLoginCQ xcreateQueryMemberLoginAsLatest() {
        String nrp = resolveNextRelationPath("member", "memberLoginAsLatest");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        MemberLoginCQ cq = new MemberLoginCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("memberLoginAsLatest");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinMemberLoginAsLatest() {
        MemberLoginCQ cq = getConditionQueryMemberLoginAsLatest();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("MEMBER_ID", "MEMBER_ID");
        registerOuterJoin(cq, joinOnMap, "memberLoginAsLatest");
    }
    public boolean hasConditionQueryMemberLoginAsLatest() {
        return _conditionQueryMemberLoginAsLatest != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * (会員セキュリティ情報)member_security by MEMBER_ID, named 'memberSecurityAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public MemberSecurityCQ queryMemberSecurityAsOne() {
        return getConditionQueryMemberSecurityAsOne();
    }
    protected MemberSecurityCQ _conditionQueryMemberSecurityAsOne;
    public MemberSecurityCQ getConditionQueryMemberSecurityAsOne() {
        if (_conditionQueryMemberSecurityAsOne == null) {
            _conditionQueryMemberSecurityAsOne = xcreateQueryMemberSecurityAsOne();
            xsetupOuterJoinMemberSecurityAsOne();
        }
        return _conditionQueryMemberSecurityAsOne;
    }
    protected MemberSecurityCQ xcreateQueryMemberSecurityAsOne() {
        String nrp = resolveNextRelationPath("member", "memberSecurityAsOne");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        MemberSecurityCQ cq = new MemberSecurityCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("memberSecurityAsOne");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinMemberSecurityAsOne() {
        MemberSecurityCQ cq = getConditionQueryMemberSecurityAsOne();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("MEMBER_ID", "MEMBER_ID");
        registerOuterJoin(cq, joinOnMap, "memberSecurityAsOne");
    }
    public boolean hasConditionQueryMemberSecurityAsOne() {
        return _conditionQueryMemberSecurityAsOne != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * (会員サービス)member_service by MEMBER_ID, named 'memberServiceAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public MemberServiceCQ queryMemberServiceAsOne() {
        return getConditionQueryMemberServiceAsOne();
    }
    protected MemberServiceCQ _conditionQueryMemberServiceAsOne;
    public MemberServiceCQ getConditionQueryMemberServiceAsOne() {
        if (_conditionQueryMemberServiceAsOne == null) {
            _conditionQueryMemberServiceAsOne = xcreateQueryMemberServiceAsOne();
            xsetupOuterJoinMemberServiceAsOne();
        }
        return _conditionQueryMemberServiceAsOne;
    }
    protected MemberServiceCQ xcreateQueryMemberServiceAsOne() {
        String nrp = resolveNextRelationPath("member", "memberServiceAsOne");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        MemberServiceCQ cq = new MemberServiceCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("memberServiceAsOne");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinMemberServiceAsOne() {
        MemberServiceCQ cq = getConditionQueryMemberServiceAsOne();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("MEMBER_ID", "MEMBER_ID");
        registerOuterJoin(cq, joinOnMap, "memberServiceAsOne");
    }
    public boolean hasConditionQueryMemberServiceAsOne() {
        return _conditionQueryMemberServiceAsOne != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * (会員退会情報)member_withdrawal by MEMBER_ID, named 'memberWithdrawalAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public MemberWithdrawalCQ queryMemberWithdrawalAsOne() {
        return getConditionQueryMemberWithdrawalAsOne();
    }
    protected MemberWithdrawalCQ _conditionQueryMemberWithdrawalAsOne;
    public MemberWithdrawalCQ getConditionQueryMemberWithdrawalAsOne() {
        if (_conditionQueryMemberWithdrawalAsOne == null) {
            _conditionQueryMemberWithdrawalAsOne = xcreateQueryMemberWithdrawalAsOne();
            xsetupOuterJoinMemberWithdrawalAsOne();
        }
        return _conditionQueryMemberWithdrawalAsOne;
    }
    protected MemberWithdrawalCQ xcreateQueryMemberWithdrawalAsOne() {
        String nrp = resolveNextRelationPath("member", "memberWithdrawalAsOne");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        MemberWithdrawalCQ cq = new MemberWithdrawalCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("memberWithdrawalAsOne");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinMemberWithdrawalAsOne() {
        MemberWithdrawalCQ cq = getConditionQueryMemberWithdrawalAsOne();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("MEMBER_ID", "MEMBER_ID");
        registerOuterJoin(cq, joinOnMap, "memberWithdrawalAsOne");
    }
    public boolean hasConditionQueryMemberWithdrawalAsOne() {
        return _conditionQueryMemberWithdrawalAsOne != null;
    }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        if ("memberAddressAsValid".equalsIgnoreCase(property)) {
            return _parameterMapMemberAddressAsValid;
        }
        if ("memberAddressAsValidBefore".equalsIgnoreCase(property)) {
            return _parameterMapMemberAddressAsValidBefore;
        }
        if ("memberLoginAsLoginStatus".equalsIgnoreCase(property)) {
            return _parameterMapMemberLoginAsLoginStatus;
        }
        if ("memberAddressAsIfComment".equalsIgnoreCase(property)) {
            return _parameterMapMemberAddressAsIfComment;
        }
        if ("memberAddressAsOnlyOneDate".equalsIgnoreCase(property)) {
            return _parameterMapMemberAddressAsOnlyOneDate;
        }
        if ("memberLoginAsForeignForeignOptimizedPartOverTest".equalsIgnoreCase(property)) {
            return _parameterMapMemberLoginAsForeignForeignOptimizedPartOverTest;
        }
        if ("memberLoginAsForeignForeignParameterOverTest".equalsIgnoreCase(property)) {
            return _parameterMapMemberLoginAsForeignForeignParameterOverTest;
        }
        if ("memberAddressAsFormattedBasic".equalsIgnoreCase(property)) {
            return _parameterMapMemberAddressAsFormattedBasic;
        }
        if ("memberAddressAsFormattedLong".equalsIgnoreCase(property)) {
            return _parameterMapMemberAddressAsFormattedLong;
        }
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, MemberCQ> _scalarConditionMap;
    public Map<String, MemberCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(MemberCQ subQuery) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(key, subQuery); return "scalarCondition." + key;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, MemberCQ> _specifyMyselfDerivedMap;
    public Map<String, MemberCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(MemberCQ subQuery) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(key, subQuery); return "specifyMyselfDerived." + key;
    }

    protected Map<String, MemberCQ> _queryMyselfDerivedMap;
    public Map<String, MemberCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(MemberCQ subQuery) {
        if (_queryMyselfDerivedMap == null) { _queryMyselfDerivedMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_queryMyselfDerivedMap.size() + 1);
        _queryMyselfDerivedMap.put(key, subQuery); return "queryMyselfDerived." + key;
    }
    protected Map<String, Object> _qyeryMyselfDerivedParameterMap;
    public Map<String, Object> getQueryMyselfDerivedParameter() { return _qyeryMyselfDerivedParameterMap; }
    public String keepQueryMyselfDerivedParameter(Object parameterValue) {
        if (_qyeryMyselfDerivedParameterMap == null) { _qyeryMyselfDerivedParameterMap = newLinkedHashMapSized(4); }
        String key = "subQueryParameterKey" + (_qyeryMyselfDerivedParameterMap.size() + 1);
        _qyeryMyselfDerivedParameterMap.put(key, parameterValue); return "queryMyselfDerivedParameter." + key;
    }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MemberCQ> _myselfExistsMap;
    public Map<String, MemberCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(MemberCQ subQuery) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(key, subQuery); return "myselfExists." + key;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, MemberCQ> _myselfInScopeMap;
    public Map<String, MemberCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(MemberCQ subQuery) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(key, subQuery); return "myselfInScope." + key;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MemberCB.class.getName(); }
    protected String xCQ() { return MemberCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
