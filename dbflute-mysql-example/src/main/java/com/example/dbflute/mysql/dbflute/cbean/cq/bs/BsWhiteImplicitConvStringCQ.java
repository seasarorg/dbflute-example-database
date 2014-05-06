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
 * The base condition-query of white_implicit_conv_string.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteImplicitConvStringCQ extends AbstractBsWhiteImplicitConvStringCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteImplicitConvStringCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteImplicitConvStringCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_implicit_conv_string) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteImplicitConvStringCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteImplicitConvStringCIQ xcreateCIQ() {
        WhiteImplicitConvStringCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteImplicitConvStringCIQ xnewCIQ() {
        return new WhiteImplicitConvStringCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_implicit_conv_string on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteImplicitConvStringCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteImplicitConvStringCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _implicitConvStringId;
    public ConditionValue getImplicitConvStringId() {
        if (_implicitConvStringId == null) { _implicitConvStringId = nCV(); }
        return _implicitConvStringId;
    }
    protected ConditionValue getCValueImplicitConvStringId() { return getImplicitConvStringId(); }

    protected Map<String, WhiteImplicitConvIntegerCQ> _implicitConvStringId_ExistsReferrer_WhiteImplicitConvIntegerListMap;
    public Map<String, WhiteImplicitConvIntegerCQ> getImplicitConvStringId_ExistsReferrer_WhiteImplicitConvIntegerList() { return _implicitConvStringId_ExistsReferrer_WhiteImplicitConvIntegerListMap; }
    public String keepImplicitConvStringId_ExistsReferrer_WhiteImplicitConvIntegerList(WhiteImplicitConvIntegerCQ sq) {
        if (_implicitConvStringId_ExistsReferrer_WhiteImplicitConvIntegerListMap == null) { _implicitConvStringId_ExistsReferrer_WhiteImplicitConvIntegerListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_implicitConvStringId_ExistsReferrer_WhiteImplicitConvIntegerListMap.size() + 1);
        _implicitConvStringId_ExistsReferrer_WhiteImplicitConvIntegerListMap.put(ky, sq); return "implicitConvStringId_ExistsReferrer_WhiteImplicitConvIntegerList." + ky;
    }

    protected Map<String, WhiteImplicitConvNumericCQ> _implicitConvStringId_ExistsReferrer_WhiteImplicitConvNumericListMap;
    public Map<String, WhiteImplicitConvNumericCQ> getImplicitConvStringId_ExistsReferrer_WhiteImplicitConvNumericList() { return _implicitConvStringId_ExistsReferrer_WhiteImplicitConvNumericListMap; }
    public String keepImplicitConvStringId_ExistsReferrer_WhiteImplicitConvNumericList(WhiteImplicitConvNumericCQ sq) {
        if (_implicitConvStringId_ExistsReferrer_WhiteImplicitConvNumericListMap == null) { _implicitConvStringId_ExistsReferrer_WhiteImplicitConvNumericListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_implicitConvStringId_ExistsReferrer_WhiteImplicitConvNumericListMap.size() + 1);
        _implicitConvStringId_ExistsReferrer_WhiteImplicitConvNumericListMap.put(ky, sq); return "implicitConvStringId_ExistsReferrer_WhiteImplicitConvNumericList." + ky;
    }

    protected Map<String, WhiteImplicitConvIntegerCQ> _implicitConvStringId_NotExistsReferrer_WhiteImplicitConvIntegerListMap;
    public Map<String, WhiteImplicitConvIntegerCQ> getImplicitConvStringId_NotExistsReferrer_WhiteImplicitConvIntegerList() { return _implicitConvStringId_NotExistsReferrer_WhiteImplicitConvIntegerListMap; }
    public String keepImplicitConvStringId_NotExistsReferrer_WhiteImplicitConvIntegerList(WhiteImplicitConvIntegerCQ sq) {
        if (_implicitConvStringId_NotExistsReferrer_WhiteImplicitConvIntegerListMap == null) { _implicitConvStringId_NotExistsReferrer_WhiteImplicitConvIntegerListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_implicitConvStringId_NotExistsReferrer_WhiteImplicitConvIntegerListMap.size() + 1);
        _implicitConvStringId_NotExistsReferrer_WhiteImplicitConvIntegerListMap.put(ky, sq); return "implicitConvStringId_NotExistsReferrer_WhiteImplicitConvIntegerList." + ky;
    }

    protected Map<String, WhiteImplicitConvNumericCQ> _implicitConvStringId_NotExistsReferrer_WhiteImplicitConvNumericListMap;
    public Map<String, WhiteImplicitConvNumericCQ> getImplicitConvStringId_NotExistsReferrer_WhiteImplicitConvNumericList() { return _implicitConvStringId_NotExistsReferrer_WhiteImplicitConvNumericListMap; }
    public String keepImplicitConvStringId_NotExistsReferrer_WhiteImplicitConvNumericList(WhiteImplicitConvNumericCQ sq) {
        if (_implicitConvStringId_NotExistsReferrer_WhiteImplicitConvNumericListMap == null) { _implicitConvStringId_NotExistsReferrer_WhiteImplicitConvNumericListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_implicitConvStringId_NotExistsReferrer_WhiteImplicitConvNumericListMap.size() + 1);
        _implicitConvStringId_NotExistsReferrer_WhiteImplicitConvNumericListMap.put(ky, sq); return "implicitConvStringId_NotExistsReferrer_WhiteImplicitConvNumericList." + ky;
    }

    protected Map<String, WhiteImplicitConvIntegerCQ> _implicitConvStringId_InScopeRelation_WhiteImplicitConvIntegerListMap;
    public Map<String, WhiteImplicitConvIntegerCQ> getImplicitConvStringId_InScopeRelation_WhiteImplicitConvIntegerList() { return _implicitConvStringId_InScopeRelation_WhiteImplicitConvIntegerListMap; }
    public String keepImplicitConvStringId_InScopeRelation_WhiteImplicitConvIntegerList(WhiteImplicitConvIntegerCQ sq) {
        if (_implicitConvStringId_InScopeRelation_WhiteImplicitConvIntegerListMap == null) { _implicitConvStringId_InScopeRelation_WhiteImplicitConvIntegerListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_implicitConvStringId_InScopeRelation_WhiteImplicitConvIntegerListMap.size() + 1);
        _implicitConvStringId_InScopeRelation_WhiteImplicitConvIntegerListMap.put(ky, sq); return "implicitConvStringId_InScopeRelation_WhiteImplicitConvIntegerList." + ky;
    }

    protected Map<String, WhiteImplicitConvNumericCQ> _implicitConvStringId_InScopeRelation_WhiteImplicitConvNumericListMap;
    public Map<String, WhiteImplicitConvNumericCQ> getImplicitConvStringId_InScopeRelation_WhiteImplicitConvNumericList() { return _implicitConvStringId_InScopeRelation_WhiteImplicitConvNumericListMap; }
    public String keepImplicitConvStringId_InScopeRelation_WhiteImplicitConvNumericList(WhiteImplicitConvNumericCQ sq) {
        if (_implicitConvStringId_InScopeRelation_WhiteImplicitConvNumericListMap == null) { _implicitConvStringId_InScopeRelation_WhiteImplicitConvNumericListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_implicitConvStringId_InScopeRelation_WhiteImplicitConvNumericListMap.size() + 1);
        _implicitConvStringId_InScopeRelation_WhiteImplicitConvNumericListMap.put(ky, sq); return "implicitConvStringId_InScopeRelation_WhiteImplicitConvNumericList." + ky;
    }

    protected Map<String, WhiteImplicitConvIntegerCQ> _implicitConvStringId_NotInScopeRelation_WhiteImplicitConvIntegerListMap;
    public Map<String, WhiteImplicitConvIntegerCQ> getImplicitConvStringId_NotInScopeRelation_WhiteImplicitConvIntegerList() { return _implicitConvStringId_NotInScopeRelation_WhiteImplicitConvIntegerListMap; }
    public String keepImplicitConvStringId_NotInScopeRelation_WhiteImplicitConvIntegerList(WhiteImplicitConvIntegerCQ sq) {
        if (_implicitConvStringId_NotInScopeRelation_WhiteImplicitConvIntegerListMap == null) { _implicitConvStringId_NotInScopeRelation_WhiteImplicitConvIntegerListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_implicitConvStringId_NotInScopeRelation_WhiteImplicitConvIntegerListMap.size() + 1);
        _implicitConvStringId_NotInScopeRelation_WhiteImplicitConvIntegerListMap.put(ky, sq); return "implicitConvStringId_NotInScopeRelation_WhiteImplicitConvIntegerList." + ky;
    }

    protected Map<String, WhiteImplicitConvNumericCQ> _implicitConvStringId_NotInScopeRelation_WhiteImplicitConvNumericListMap;
    public Map<String, WhiteImplicitConvNumericCQ> getImplicitConvStringId_NotInScopeRelation_WhiteImplicitConvNumericList() { return _implicitConvStringId_NotInScopeRelation_WhiteImplicitConvNumericListMap; }
    public String keepImplicitConvStringId_NotInScopeRelation_WhiteImplicitConvNumericList(WhiteImplicitConvNumericCQ sq) {
        if (_implicitConvStringId_NotInScopeRelation_WhiteImplicitConvNumericListMap == null) { _implicitConvStringId_NotInScopeRelation_WhiteImplicitConvNumericListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_implicitConvStringId_NotInScopeRelation_WhiteImplicitConvNumericListMap.size() + 1);
        _implicitConvStringId_NotInScopeRelation_WhiteImplicitConvNumericListMap.put(ky, sq); return "implicitConvStringId_NotInScopeRelation_WhiteImplicitConvNumericList." + ky;
    }

    protected Map<String, WhiteImplicitConvIntegerCQ> _implicitConvStringId_SpecifyDerivedReferrer_WhiteImplicitConvIntegerListMap;
    public Map<String, WhiteImplicitConvIntegerCQ> getImplicitConvStringId_SpecifyDerivedReferrer_WhiteImplicitConvIntegerList() { return _implicitConvStringId_SpecifyDerivedReferrer_WhiteImplicitConvIntegerListMap; }
    public String keepImplicitConvStringId_SpecifyDerivedReferrer_WhiteImplicitConvIntegerList(WhiteImplicitConvIntegerCQ sq) {
        if (_implicitConvStringId_SpecifyDerivedReferrer_WhiteImplicitConvIntegerListMap == null) { _implicitConvStringId_SpecifyDerivedReferrer_WhiteImplicitConvIntegerListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_implicitConvStringId_SpecifyDerivedReferrer_WhiteImplicitConvIntegerListMap.size() + 1);
        _implicitConvStringId_SpecifyDerivedReferrer_WhiteImplicitConvIntegerListMap.put(ky, sq); return "implicitConvStringId_SpecifyDerivedReferrer_WhiteImplicitConvIntegerList." + ky;
    }

    protected Map<String, WhiteImplicitConvNumericCQ> _implicitConvStringId_SpecifyDerivedReferrer_WhiteImplicitConvNumericListMap;
    public Map<String, WhiteImplicitConvNumericCQ> getImplicitConvStringId_SpecifyDerivedReferrer_WhiteImplicitConvNumericList() { return _implicitConvStringId_SpecifyDerivedReferrer_WhiteImplicitConvNumericListMap; }
    public String keepImplicitConvStringId_SpecifyDerivedReferrer_WhiteImplicitConvNumericList(WhiteImplicitConvNumericCQ sq) {
        if (_implicitConvStringId_SpecifyDerivedReferrer_WhiteImplicitConvNumericListMap == null) { _implicitConvStringId_SpecifyDerivedReferrer_WhiteImplicitConvNumericListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_implicitConvStringId_SpecifyDerivedReferrer_WhiteImplicitConvNumericListMap.size() + 1);
        _implicitConvStringId_SpecifyDerivedReferrer_WhiteImplicitConvNumericListMap.put(ky, sq); return "implicitConvStringId_SpecifyDerivedReferrer_WhiteImplicitConvNumericList." + ky;
    }

    protected Map<String, WhiteImplicitConvIntegerCQ> _implicitConvStringId_QueryDerivedReferrer_WhiteImplicitConvIntegerListMap;
    public Map<String, WhiteImplicitConvIntegerCQ> getImplicitConvStringId_QueryDerivedReferrer_WhiteImplicitConvIntegerList() { return _implicitConvStringId_QueryDerivedReferrer_WhiteImplicitConvIntegerListMap; }
    public String keepImplicitConvStringId_QueryDerivedReferrer_WhiteImplicitConvIntegerList(WhiteImplicitConvIntegerCQ sq) {
        if (_implicitConvStringId_QueryDerivedReferrer_WhiteImplicitConvIntegerListMap == null) { _implicitConvStringId_QueryDerivedReferrer_WhiteImplicitConvIntegerListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_implicitConvStringId_QueryDerivedReferrer_WhiteImplicitConvIntegerListMap.size() + 1);
        _implicitConvStringId_QueryDerivedReferrer_WhiteImplicitConvIntegerListMap.put(ky, sq); return "implicitConvStringId_QueryDerivedReferrer_WhiteImplicitConvIntegerList." + ky;
    }
    protected Map<String, Object> _implicitConvStringId_QueryDerivedReferrer_WhiteImplicitConvIntegerListParameterMap;
    public Map<String, Object> getImplicitConvStringId_QueryDerivedReferrer_WhiteImplicitConvIntegerListParameter() { return _implicitConvStringId_QueryDerivedReferrer_WhiteImplicitConvIntegerListParameterMap; }
    public String keepImplicitConvStringId_QueryDerivedReferrer_WhiteImplicitConvIntegerListParameter(Object vl) {
        if (_implicitConvStringId_QueryDerivedReferrer_WhiteImplicitConvIntegerListParameterMap == null) { _implicitConvStringId_QueryDerivedReferrer_WhiteImplicitConvIntegerListParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_implicitConvStringId_QueryDerivedReferrer_WhiteImplicitConvIntegerListParameterMap.size() + 1);
        _implicitConvStringId_QueryDerivedReferrer_WhiteImplicitConvIntegerListParameterMap.put(ky, vl); return "implicitConvStringId_QueryDerivedReferrer_WhiteImplicitConvIntegerListParameter." + ky;
    }

    protected Map<String, WhiteImplicitConvNumericCQ> _implicitConvStringId_QueryDerivedReferrer_WhiteImplicitConvNumericListMap;
    public Map<String, WhiteImplicitConvNumericCQ> getImplicitConvStringId_QueryDerivedReferrer_WhiteImplicitConvNumericList() { return _implicitConvStringId_QueryDerivedReferrer_WhiteImplicitConvNumericListMap; }
    public String keepImplicitConvStringId_QueryDerivedReferrer_WhiteImplicitConvNumericList(WhiteImplicitConvNumericCQ sq) {
        if (_implicitConvStringId_QueryDerivedReferrer_WhiteImplicitConvNumericListMap == null) { _implicitConvStringId_QueryDerivedReferrer_WhiteImplicitConvNumericListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_implicitConvStringId_QueryDerivedReferrer_WhiteImplicitConvNumericListMap.size() + 1);
        _implicitConvStringId_QueryDerivedReferrer_WhiteImplicitConvNumericListMap.put(ky, sq); return "implicitConvStringId_QueryDerivedReferrer_WhiteImplicitConvNumericList." + ky;
    }
    protected Map<String, Object> _implicitConvStringId_QueryDerivedReferrer_WhiteImplicitConvNumericListParameterMap;
    public Map<String, Object> getImplicitConvStringId_QueryDerivedReferrer_WhiteImplicitConvNumericListParameter() { return _implicitConvStringId_QueryDerivedReferrer_WhiteImplicitConvNumericListParameterMap; }
    public String keepImplicitConvStringId_QueryDerivedReferrer_WhiteImplicitConvNumericListParameter(Object vl) {
        if (_implicitConvStringId_QueryDerivedReferrer_WhiteImplicitConvNumericListParameterMap == null) { _implicitConvStringId_QueryDerivedReferrer_WhiteImplicitConvNumericListParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_implicitConvStringId_QueryDerivedReferrer_WhiteImplicitConvNumericListParameterMap.size() + 1);
        _implicitConvStringId_QueryDerivedReferrer_WhiteImplicitConvNumericListParameterMap.put(ky, vl); return "implicitConvStringId_QueryDerivedReferrer_WhiteImplicitConvNumericListParameter." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * IMPLICIT_CONV_STRING_ID: {PK, NotNull, VARCHAR(10)}
     * @return this. (NotNull)
     */
    public BsWhiteImplicitConvStringCQ addOrderBy_ImplicitConvStringId_Asc() { regOBA("IMPLICIT_CONV_STRING_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * IMPLICIT_CONV_STRING_ID: {PK, NotNull, VARCHAR(10)}
     * @return this. (NotNull)
     */
    public BsWhiteImplicitConvStringCQ addOrderBy_ImplicitConvStringId_Desc() { regOBD("IMPLICIT_CONV_STRING_ID"); return this; }

    protected ConditionValue _implicitConvIntegerId;
    public ConditionValue getImplicitConvIntegerId() {
        if (_implicitConvIntegerId == null) { _implicitConvIntegerId = nCV(); }
        return _implicitConvIntegerId;
    }
    protected ConditionValue getCValueImplicitConvIntegerId() { return getImplicitConvIntegerId(); }

    protected Map<String, WhiteImplicitConvIntegerCQ> _implicitConvIntegerId_InScopeRelation_WhiteImplicitConvIntegerMap;
    public Map<String, WhiteImplicitConvIntegerCQ> getImplicitConvIntegerId_InScopeRelation_WhiteImplicitConvInteger() { return _implicitConvIntegerId_InScopeRelation_WhiteImplicitConvIntegerMap; }
    public String keepImplicitConvIntegerId_InScopeRelation_WhiteImplicitConvInteger(WhiteImplicitConvIntegerCQ sq) {
        if (_implicitConvIntegerId_InScopeRelation_WhiteImplicitConvIntegerMap == null) { _implicitConvIntegerId_InScopeRelation_WhiteImplicitConvIntegerMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_implicitConvIntegerId_InScopeRelation_WhiteImplicitConvIntegerMap.size() + 1);
        _implicitConvIntegerId_InScopeRelation_WhiteImplicitConvIntegerMap.put(ky, sq); return "implicitConvIntegerId_InScopeRelation_WhiteImplicitConvInteger." + ky;
    }

    protected Map<String, WhiteImplicitConvIntegerCQ> _implicitConvIntegerId_NotInScopeRelation_WhiteImplicitConvIntegerMap;
    public Map<String, WhiteImplicitConvIntegerCQ> getImplicitConvIntegerId_NotInScopeRelation_WhiteImplicitConvInteger() { return _implicitConvIntegerId_NotInScopeRelation_WhiteImplicitConvIntegerMap; }
    public String keepImplicitConvIntegerId_NotInScopeRelation_WhiteImplicitConvInteger(WhiteImplicitConvIntegerCQ sq) {
        if (_implicitConvIntegerId_NotInScopeRelation_WhiteImplicitConvIntegerMap == null) { _implicitConvIntegerId_NotInScopeRelation_WhiteImplicitConvIntegerMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_implicitConvIntegerId_NotInScopeRelation_WhiteImplicitConvIntegerMap.size() + 1);
        _implicitConvIntegerId_NotInScopeRelation_WhiteImplicitConvIntegerMap.put(ky, sq); return "implicitConvIntegerId_NotInScopeRelation_WhiteImplicitConvInteger." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * IMPLICIT_CONV_INTEGER_ID: {NotNull, VARCHAR(10), FK to WHITE_IMPLICIT_CONV_INTEGER}
     * @return this. (NotNull)
     */
    public BsWhiteImplicitConvStringCQ addOrderBy_ImplicitConvIntegerId_Asc() { regOBA("IMPLICIT_CONV_INTEGER_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * IMPLICIT_CONV_INTEGER_ID: {NotNull, VARCHAR(10), FK to WHITE_IMPLICIT_CONV_INTEGER}
     * @return this. (NotNull)
     */
    public BsWhiteImplicitConvStringCQ addOrderBy_ImplicitConvIntegerId_Desc() { regOBD("IMPLICIT_CONV_INTEGER_ID"); return this; }

    protected ConditionValue _implicitConvNumericId;
    public ConditionValue getImplicitConvNumericId() {
        if (_implicitConvNumericId == null) { _implicitConvNumericId = nCV(); }
        return _implicitConvNumericId;
    }
    protected ConditionValue getCValueImplicitConvNumericId() { return getImplicitConvNumericId(); }

    protected Map<String, WhiteImplicitConvNumericCQ> _implicitConvNumericId_InScopeRelation_WhiteImplicitConvNumericMap;
    public Map<String, WhiteImplicitConvNumericCQ> getImplicitConvNumericId_InScopeRelation_WhiteImplicitConvNumeric() { return _implicitConvNumericId_InScopeRelation_WhiteImplicitConvNumericMap; }
    public String keepImplicitConvNumericId_InScopeRelation_WhiteImplicitConvNumeric(WhiteImplicitConvNumericCQ sq) {
        if (_implicitConvNumericId_InScopeRelation_WhiteImplicitConvNumericMap == null) { _implicitConvNumericId_InScopeRelation_WhiteImplicitConvNumericMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_implicitConvNumericId_InScopeRelation_WhiteImplicitConvNumericMap.size() + 1);
        _implicitConvNumericId_InScopeRelation_WhiteImplicitConvNumericMap.put(ky, sq); return "implicitConvNumericId_InScopeRelation_WhiteImplicitConvNumeric." + ky;
    }

    protected Map<String, WhiteImplicitConvNumericCQ> _implicitConvNumericId_NotInScopeRelation_WhiteImplicitConvNumericMap;
    public Map<String, WhiteImplicitConvNumericCQ> getImplicitConvNumericId_NotInScopeRelation_WhiteImplicitConvNumeric() { return _implicitConvNumericId_NotInScopeRelation_WhiteImplicitConvNumericMap; }
    public String keepImplicitConvNumericId_NotInScopeRelation_WhiteImplicitConvNumeric(WhiteImplicitConvNumericCQ sq) {
        if (_implicitConvNumericId_NotInScopeRelation_WhiteImplicitConvNumericMap == null) { _implicitConvNumericId_NotInScopeRelation_WhiteImplicitConvNumericMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_implicitConvNumericId_NotInScopeRelation_WhiteImplicitConvNumericMap.size() + 1);
        _implicitConvNumericId_NotInScopeRelation_WhiteImplicitConvNumericMap.put(ky, sq); return "implicitConvNumericId_NotInScopeRelation_WhiteImplicitConvNumeric." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * IMPLICIT_CONV_NUMERIC_ID: {NotNull, VARCHAR(10), FK to WHITE_IMPLICIT_CONV_NUMERIC}
     * @return this. (NotNull)
     */
    public BsWhiteImplicitConvStringCQ addOrderBy_ImplicitConvNumericId_Asc() { regOBA("IMPLICIT_CONV_NUMERIC_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * IMPLICIT_CONV_NUMERIC_ID: {NotNull, VARCHAR(10), FK to WHITE_IMPLICIT_CONV_NUMERIC}
     * @return this. (NotNull)
     */
    public BsWhiteImplicitConvStringCQ addOrderBy_ImplicitConvNumericId_Desc() { regOBD("IMPLICIT_CONV_NUMERIC_ID"); return this; }

    protected ConditionValue _implicitConvName;
    public ConditionValue getImplicitConvName() {
        if (_implicitConvName == null) { _implicitConvName = nCV(); }
        return _implicitConvName;
    }
    protected ConditionValue getCValueImplicitConvName() { return getImplicitConvName(); }

    /** 
     * Add order-by as ascend. <br />
     * IMPLICIT_CONV_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteImplicitConvStringCQ addOrderBy_ImplicitConvName_Asc() { regOBA("IMPLICIT_CONV_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * IMPLICIT_CONV_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteImplicitConvStringCQ addOrderBy_ImplicitConvName_Desc() { regOBD("IMPLICIT_CONV_NAME"); return this; }

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
    public BsWhiteImplicitConvStringCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsWhiteImplicitConvStringCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        WhiteImplicitConvStringCQ bq = (WhiteImplicitConvStringCQ)bqs;
        WhiteImplicitConvStringCQ uq = (WhiteImplicitConvStringCQ)uqs;
        if (bq.hasConditionQueryWhiteImplicitConvInteger()) {
            uq.queryWhiteImplicitConvInteger().reflectRelationOnUnionQuery(bq.queryWhiteImplicitConvInteger(), uq.queryWhiteImplicitConvInteger());
        }
        if (bq.hasConditionQueryWhiteImplicitConvNumeric()) {
            uq.queryWhiteImplicitConvNumeric().reflectRelationOnUnionQuery(bq.queryWhiteImplicitConvNumeric(), uq.queryWhiteImplicitConvNumeric());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * white_implicit_conv_integer by my IMPLICIT_CONV_INTEGER_ID, named 'whiteImplicitConvInteger'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteImplicitConvIntegerCQ queryWhiteImplicitConvInteger() {
        return getConditionQueryWhiteImplicitConvInteger();
    }
    protected WhiteImplicitConvIntegerCQ _conditionQueryWhiteImplicitConvInteger;
    public WhiteImplicitConvIntegerCQ getConditionQueryWhiteImplicitConvInteger() {
        if (_conditionQueryWhiteImplicitConvInteger == null) {
            _conditionQueryWhiteImplicitConvInteger = xcreateQueryWhiteImplicitConvInteger();
            xsetupOuterJoinWhiteImplicitConvInteger();
        }
        return _conditionQueryWhiteImplicitConvInteger;
    }
    protected WhiteImplicitConvIntegerCQ xcreateQueryWhiteImplicitConvInteger() {
        String nrp = resolveNextRelationPath("white_implicit_conv_string", "whiteImplicitConvInteger");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        WhiteImplicitConvIntegerCQ cq = new WhiteImplicitConvIntegerCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("whiteImplicitConvInteger");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinWhiteImplicitConvInteger() {
        WhiteImplicitConvIntegerCQ cq = getConditionQueryWhiteImplicitConvInteger();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("IMPLICIT_CONV_INTEGER_ID", "IMPLICIT_CONV_INTEGER_ID");
        registerOuterJoin(cq, joinOnMap, "whiteImplicitConvInteger");
    }
    public boolean hasConditionQueryWhiteImplicitConvInteger() {
        return _conditionQueryWhiteImplicitConvInteger != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * white_implicit_conv_numeric by my IMPLICIT_CONV_NUMERIC_ID, named 'whiteImplicitConvNumeric'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteImplicitConvNumericCQ queryWhiteImplicitConvNumeric() {
        return getConditionQueryWhiteImplicitConvNumeric();
    }
    protected WhiteImplicitConvNumericCQ _conditionQueryWhiteImplicitConvNumeric;
    public WhiteImplicitConvNumericCQ getConditionQueryWhiteImplicitConvNumeric() {
        if (_conditionQueryWhiteImplicitConvNumeric == null) {
            _conditionQueryWhiteImplicitConvNumeric = xcreateQueryWhiteImplicitConvNumeric();
            xsetupOuterJoinWhiteImplicitConvNumeric();
        }
        return _conditionQueryWhiteImplicitConvNumeric;
    }
    protected WhiteImplicitConvNumericCQ xcreateQueryWhiteImplicitConvNumeric() {
        String nrp = resolveNextRelationPath("white_implicit_conv_string", "whiteImplicitConvNumeric");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        WhiteImplicitConvNumericCQ cq = new WhiteImplicitConvNumericCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("whiteImplicitConvNumeric");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinWhiteImplicitConvNumeric() {
        WhiteImplicitConvNumericCQ cq = getConditionQueryWhiteImplicitConvNumeric();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("IMPLICIT_CONV_NUMERIC_ID", "IMPLICIT_CONV_NUMERIC_ID");
        registerOuterJoin(cq, joinOnMap, "whiteImplicitConvNumeric");
    }
    public boolean hasConditionQueryWhiteImplicitConvNumeric() {
        return _conditionQueryWhiteImplicitConvNumeric != null;
    }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, WhiteImplicitConvStringCQ> _scalarConditionMap;
    public Map<String, WhiteImplicitConvStringCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(WhiteImplicitConvStringCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, WhiteImplicitConvStringCQ> _specifyMyselfDerivedMap;
    public Map<String, WhiteImplicitConvStringCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(WhiteImplicitConvStringCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, WhiteImplicitConvStringCQ> _queryMyselfDerivedMap;
    public Map<String, WhiteImplicitConvStringCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(WhiteImplicitConvStringCQ sq) {
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
    protected Map<String, WhiteImplicitConvStringCQ> _myselfExistsMap;
    public Map<String, WhiteImplicitConvStringCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(WhiteImplicitConvStringCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, WhiteImplicitConvStringCQ> _myselfInScopeMap;
    public Map<String, WhiteImplicitConvStringCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(WhiteImplicitConvStringCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteImplicitConvStringCB.class.getName(); }
    protected String xCQ() { return WhiteImplicitConvStringCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
