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
 * The base condition-query of white_implicit_conv_integer.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteImplicitConvIntegerCQ extends AbstractBsWhiteImplicitConvIntegerCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteImplicitConvIntegerCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteImplicitConvIntegerCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_implicit_conv_integer) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteImplicitConvIntegerCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteImplicitConvIntegerCIQ xcreateCIQ() {
        WhiteImplicitConvIntegerCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteImplicitConvIntegerCIQ xnewCIQ() {
        return new WhiteImplicitConvIntegerCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_implicit_conv_integer on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteImplicitConvIntegerCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteImplicitConvIntegerCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _implicitConvIntegerId;
    public ConditionValue getImplicitConvIntegerId() {
        if (_implicitConvIntegerId == null) { _implicitConvIntegerId = nCV(); }
        return _implicitConvIntegerId;
    }
    protected ConditionValue getCValueImplicitConvIntegerId() { return getImplicitConvIntegerId(); }

    protected Map<String, WhiteImplicitConvNumericCQ> _implicitConvIntegerId_ExistsReferrer_WhiteImplicitConvNumericListMap;
    public Map<String, WhiteImplicitConvNumericCQ> getImplicitConvIntegerId_ExistsReferrer_WhiteImplicitConvNumericList() { return _implicitConvIntegerId_ExistsReferrer_WhiteImplicitConvNumericListMap; }
    public String keepImplicitConvIntegerId_ExistsReferrer_WhiteImplicitConvNumericList(WhiteImplicitConvNumericCQ sq) {
        if (_implicitConvIntegerId_ExistsReferrer_WhiteImplicitConvNumericListMap == null) { _implicitConvIntegerId_ExistsReferrer_WhiteImplicitConvNumericListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_implicitConvIntegerId_ExistsReferrer_WhiteImplicitConvNumericListMap.size() + 1);
        _implicitConvIntegerId_ExistsReferrer_WhiteImplicitConvNumericListMap.put(ky, sq); return "implicitConvIntegerId_ExistsReferrer_WhiteImplicitConvNumericList." + ky;
    }

    protected Map<String, WhiteImplicitConvStringCQ> _implicitConvIntegerId_ExistsReferrer_WhiteImplicitConvStringListMap;
    public Map<String, WhiteImplicitConvStringCQ> getImplicitConvIntegerId_ExistsReferrer_WhiteImplicitConvStringList() { return _implicitConvIntegerId_ExistsReferrer_WhiteImplicitConvStringListMap; }
    public String keepImplicitConvIntegerId_ExistsReferrer_WhiteImplicitConvStringList(WhiteImplicitConvStringCQ sq) {
        if (_implicitConvIntegerId_ExistsReferrer_WhiteImplicitConvStringListMap == null) { _implicitConvIntegerId_ExistsReferrer_WhiteImplicitConvStringListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_implicitConvIntegerId_ExistsReferrer_WhiteImplicitConvStringListMap.size() + 1);
        _implicitConvIntegerId_ExistsReferrer_WhiteImplicitConvStringListMap.put(ky, sq); return "implicitConvIntegerId_ExistsReferrer_WhiteImplicitConvStringList." + ky;
    }

    protected Map<String, WhiteImplicitConvNumericCQ> _implicitConvIntegerId_NotExistsReferrer_WhiteImplicitConvNumericListMap;
    public Map<String, WhiteImplicitConvNumericCQ> getImplicitConvIntegerId_NotExistsReferrer_WhiteImplicitConvNumericList() { return _implicitConvIntegerId_NotExistsReferrer_WhiteImplicitConvNumericListMap; }
    public String keepImplicitConvIntegerId_NotExistsReferrer_WhiteImplicitConvNumericList(WhiteImplicitConvNumericCQ sq) {
        if (_implicitConvIntegerId_NotExistsReferrer_WhiteImplicitConvNumericListMap == null) { _implicitConvIntegerId_NotExistsReferrer_WhiteImplicitConvNumericListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_implicitConvIntegerId_NotExistsReferrer_WhiteImplicitConvNumericListMap.size() + 1);
        _implicitConvIntegerId_NotExistsReferrer_WhiteImplicitConvNumericListMap.put(ky, sq); return "implicitConvIntegerId_NotExistsReferrer_WhiteImplicitConvNumericList." + ky;
    }

    protected Map<String, WhiteImplicitConvStringCQ> _implicitConvIntegerId_NotExistsReferrer_WhiteImplicitConvStringListMap;
    public Map<String, WhiteImplicitConvStringCQ> getImplicitConvIntegerId_NotExistsReferrer_WhiteImplicitConvStringList() { return _implicitConvIntegerId_NotExistsReferrer_WhiteImplicitConvStringListMap; }
    public String keepImplicitConvIntegerId_NotExistsReferrer_WhiteImplicitConvStringList(WhiteImplicitConvStringCQ sq) {
        if (_implicitConvIntegerId_NotExistsReferrer_WhiteImplicitConvStringListMap == null) { _implicitConvIntegerId_NotExistsReferrer_WhiteImplicitConvStringListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_implicitConvIntegerId_NotExistsReferrer_WhiteImplicitConvStringListMap.size() + 1);
        _implicitConvIntegerId_NotExistsReferrer_WhiteImplicitConvStringListMap.put(ky, sq); return "implicitConvIntegerId_NotExistsReferrer_WhiteImplicitConvStringList." + ky;
    }

    protected Map<String, WhiteImplicitConvNumericCQ> _implicitConvIntegerId_SpecifyDerivedReferrer_WhiteImplicitConvNumericListMap;
    public Map<String, WhiteImplicitConvNumericCQ> getImplicitConvIntegerId_SpecifyDerivedReferrer_WhiteImplicitConvNumericList() { return _implicitConvIntegerId_SpecifyDerivedReferrer_WhiteImplicitConvNumericListMap; }
    public String keepImplicitConvIntegerId_SpecifyDerivedReferrer_WhiteImplicitConvNumericList(WhiteImplicitConvNumericCQ sq) {
        if (_implicitConvIntegerId_SpecifyDerivedReferrer_WhiteImplicitConvNumericListMap == null) { _implicitConvIntegerId_SpecifyDerivedReferrer_WhiteImplicitConvNumericListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_implicitConvIntegerId_SpecifyDerivedReferrer_WhiteImplicitConvNumericListMap.size() + 1);
        _implicitConvIntegerId_SpecifyDerivedReferrer_WhiteImplicitConvNumericListMap.put(ky, sq); return "implicitConvIntegerId_SpecifyDerivedReferrer_WhiteImplicitConvNumericList." + ky;
    }

    protected Map<String, WhiteImplicitConvStringCQ> _implicitConvIntegerId_SpecifyDerivedReferrer_WhiteImplicitConvStringListMap;
    public Map<String, WhiteImplicitConvStringCQ> getImplicitConvIntegerId_SpecifyDerivedReferrer_WhiteImplicitConvStringList() { return _implicitConvIntegerId_SpecifyDerivedReferrer_WhiteImplicitConvStringListMap; }
    public String keepImplicitConvIntegerId_SpecifyDerivedReferrer_WhiteImplicitConvStringList(WhiteImplicitConvStringCQ sq) {
        if (_implicitConvIntegerId_SpecifyDerivedReferrer_WhiteImplicitConvStringListMap == null) { _implicitConvIntegerId_SpecifyDerivedReferrer_WhiteImplicitConvStringListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_implicitConvIntegerId_SpecifyDerivedReferrer_WhiteImplicitConvStringListMap.size() + 1);
        _implicitConvIntegerId_SpecifyDerivedReferrer_WhiteImplicitConvStringListMap.put(ky, sq); return "implicitConvIntegerId_SpecifyDerivedReferrer_WhiteImplicitConvStringList." + ky;
    }

    protected Map<String, WhiteImplicitConvNumericCQ> _implicitConvIntegerId_InScopeRelation_WhiteImplicitConvNumericListMap;
    public Map<String, WhiteImplicitConvNumericCQ> getImplicitConvIntegerId_InScopeRelation_WhiteImplicitConvNumericList() { return _implicitConvIntegerId_InScopeRelation_WhiteImplicitConvNumericListMap; }
    public String keepImplicitConvIntegerId_InScopeRelation_WhiteImplicitConvNumericList(WhiteImplicitConvNumericCQ sq) {
        if (_implicitConvIntegerId_InScopeRelation_WhiteImplicitConvNumericListMap == null) { _implicitConvIntegerId_InScopeRelation_WhiteImplicitConvNumericListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_implicitConvIntegerId_InScopeRelation_WhiteImplicitConvNumericListMap.size() + 1);
        _implicitConvIntegerId_InScopeRelation_WhiteImplicitConvNumericListMap.put(ky, sq); return "implicitConvIntegerId_InScopeRelation_WhiteImplicitConvNumericList." + ky;
    }

    protected Map<String, WhiteImplicitConvStringCQ> _implicitConvIntegerId_InScopeRelation_WhiteImplicitConvStringListMap;
    public Map<String, WhiteImplicitConvStringCQ> getImplicitConvIntegerId_InScopeRelation_WhiteImplicitConvStringList() { return _implicitConvIntegerId_InScopeRelation_WhiteImplicitConvStringListMap; }
    public String keepImplicitConvIntegerId_InScopeRelation_WhiteImplicitConvStringList(WhiteImplicitConvStringCQ sq) {
        if (_implicitConvIntegerId_InScopeRelation_WhiteImplicitConvStringListMap == null) { _implicitConvIntegerId_InScopeRelation_WhiteImplicitConvStringListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_implicitConvIntegerId_InScopeRelation_WhiteImplicitConvStringListMap.size() + 1);
        _implicitConvIntegerId_InScopeRelation_WhiteImplicitConvStringListMap.put(ky, sq); return "implicitConvIntegerId_InScopeRelation_WhiteImplicitConvStringList." + ky;
    }

    protected Map<String, WhiteImplicitConvNumericCQ> _implicitConvIntegerId_NotInScopeRelation_WhiteImplicitConvNumericListMap;
    public Map<String, WhiteImplicitConvNumericCQ> getImplicitConvIntegerId_NotInScopeRelation_WhiteImplicitConvNumericList() { return _implicitConvIntegerId_NotInScopeRelation_WhiteImplicitConvNumericListMap; }
    public String keepImplicitConvIntegerId_NotInScopeRelation_WhiteImplicitConvNumericList(WhiteImplicitConvNumericCQ sq) {
        if (_implicitConvIntegerId_NotInScopeRelation_WhiteImplicitConvNumericListMap == null) { _implicitConvIntegerId_NotInScopeRelation_WhiteImplicitConvNumericListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_implicitConvIntegerId_NotInScopeRelation_WhiteImplicitConvNumericListMap.size() + 1);
        _implicitConvIntegerId_NotInScopeRelation_WhiteImplicitConvNumericListMap.put(ky, sq); return "implicitConvIntegerId_NotInScopeRelation_WhiteImplicitConvNumericList." + ky;
    }

    protected Map<String, WhiteImplicitConvStringCQ> _implicitConvIntegerId_NotInScopeRelation_WhiteImplicitConvStringListMap;
    public Map<String, WhiteImplicitConvStringCQ> getImplicitConvIntegerId_NotInScopeRelation_WhiteImplicitConvStringList() { return _implicitConvIntegerId_NotInScopeRelation_WhiteImplicitConvStringListMap; }
    public String keepImplicitConvIntegerId_NotInScopeRelation_WhiteImplicitConvStringList(WhiteImplicitConvStringCQ sq) {
        if (_implicitConvIntegerId_NotInScopeRelation_WhiteImplicitConvStringListMap == null) { _implicitConvIntegerId_NotInScopeRelation_WhiteImplicitConvStringListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_implicitConvIntegerId_NotInScopeRelation_WhiteImplicitConvStringListMap.size() + 1);
        _implicitConvIntegerId_NotInScopeRelation_WhiteImplicitConvStringListMap.put(ky, sq); return "implicitConvIntegerId_NotInScopeRelation_WhiteImplicitConvStringList." + ky;
    }

    protected Map<String, WhiteImplicitConvNumericCQ> _implicitConvIntegerId_QueryDerivedReferrer_WhiteImplicitConvNumericListMap;
    public Map<String, WhiteImplicitConvNumericCQ> getImplicitConvIntegerId_QueryDerivedReferrer_WhiteImplicitConvNumericList() { return _implicitConvIntegerId_QueryDerivedReferrer_WhiteImplicitConvNumericListMap; }
    public String keepImplicitConvIntegerId_QueryDerivedReferrer_WhiteImplicitConvNumericList(WhiteImplicitConvNumericCQ sq) {
        if (_implicitConvIntegerId_QueryDerivedReferrer_WhiteImplicitConvNumericListMap == null) { _implicitConvIntegerId_QueryDerivedReferrer_WhiteImplicitConvNumericListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_implicitConvIntegerId_QueryDerivedReferrer_WhiteImplicitConvNumericListMap.size() + 1);
        _implicitConvIntegerId_QueryDerivedReferrer_WhiteImplicitConvNumericListMap.put(ky, sq); return "implicitConvIntegerId_QueryDerivedReferrer_WhiteImplicitConvNumericList." + ky;
    }
    protected Map<String, Object> _implicitConvIntegerId_QueryDerivedReferrer_WhiteImplicitConvNumericListParameterMap;
    public Map<String, Object> getImplicitConvIntegerId_QueryDerivedReferrer_WhiteImplicitConvNumericListParameter() { return _implicitConvIntegerId_QueryDerivedReferrer_WhiteImplicitConvNumericListParameterMap; }
    public String keepImplicitConvIntegerId_QueryDerivedReferrer_WhiteImplicitConvNumericListParameter(Object vl) {
        if (_implicitConvIntegerId_QueryDerivedReferrer_WhiteImplicitConvNumericListParameterMap == null) { _implicitConvIntegerId_QueryDerivedReferrer_WhiteImplicitConvNumericListParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_implicitConvIntegerId_QueryDerivedReferrer_WhiteImplicitConvNumericListParameterMap.size() + 1);
        _implicitConvIntegerId_QueryDerivedReferrer_WhiteImplicitConvNumericListParameterMap.put(ky, vl); return "implicitConvIntegerId_QueryDerivedReferrer_WhiteImplicitConvNumericListParameter." + ky;
    }

    protected Map<String, WhiteImplicitConvStringCQ> _implicitConvIntegerId_QueryDerivedReferrer_WhiteImplicitConvStringListMap;
    public Map<String, WhiteImplicitConvStringCQ> getImplicitConvIntegerId_QueryDerivedReferrer_WhiteImplicitConvStringList() { return _implicitConvIntegerId_QueryDerivedReferrer_WhiteImplicitConvStringListMap; }
    public String keepImplicitConvIntegerId_QueryDerivedReferrer_WhiteImplicitConvStringList(WhiteImplicitConvStringCQ sq) {
        if (_implicitConvIntegerId_QueryDerivedReferrer_WhiteImplicitConvStringListMap == null) { _implicitConvIntegerId_QueryDerivedReferrer_WhiteImplicitConvStringListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_implicitConvIntegerId_QueryDerivedReferrer_WhiteImplicitConvStringListMap.size() + 1);
        _implicitConvIntegerId_QueryDerivedReferrer_WhiteImplicitConvStringListMap.put(ky, sq); return "implicitConvIntegerId_QueryDerivedReferrer_WhiteImplicitConvStringList." + ky;
    }
    protected Map<String, Object> _implicitConvIntegerId_QueryDerivedReferrer_WhiteImplicitConvStringListParameterMap;
    public Map<String, Object> getImplicitConvIntegerId_QueryDerivedReferrer_WhiteImplicitConvStringListParameter() { return _implicitConvIntegerId_QueryDerivedReferrer_WhiteImplicitConvStringListParameterMap; }
    public String keepImplicitConvIntegerId_QueryDerivedReferrer_WhiteImplicitConvStringListParameter(Object vl) {
        if (_implicitConvIntegerId_QueryDerivedReferrer_WhiteImplicitConvStringListParameterMap == null) { _implicitConvIntegerId_QueryDerivedReferrer_WhiteImplicitConvStringListParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_implicitConvIntegerId_QueryDerivedReferrer_WhiteImplicitConvStringListParameterMap.size() + 1);
        _implicitConvIntegerId_QueryDerivedReferrer_WhiteImplicitConvStringListParameterMap.put(ky, vl); return "implicitConvIntegerId_QueryDerivedReferrer_WhiteImplicitConvStringListParameter." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * IMPLICIT_CONV_INTEGER_ID: {PK, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteImplicitConvIntegerCQ addOrderBy_ImplicitConvIntegerId_Asc() { regOBA("IMPLICIT_CONV_INTEGER_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * IMPLICIT_CONV_INTEGER_ID: {PK, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhiteImplicitConvIntegerCQ addOrderBy_ImplicitConvIntegerId_Desc() { regOBD("IMPLICIT_CONV_INTEGER_ID"); return this; }

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
     * IMPLICIT_CONV_NUMERIC_ID: {NotNull, INT(10), FK to WHITE_IMPLICIT_CONV_NUMERIC}
     * @return this. (NotNull)
     */
    public BsWhiteImplicitConvIntegerCQ addOrderBy_ImplicitConvNumericId_Asc() { regOBA("IMPLICIT_CONV_NUMERIC_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * IMPLICIT_CONV_NUMERIC_ID: {NotNull, INT(10), FK to WHITE_IMPLICIT_CONV_NUMERIC}
     * @return this. (NotNull)
     */
    public BsWhiteImplicitConvIntegerCQ addOrderBy_ImplicitConvNumericId_Desc() { regOBD("IMPLICIT_CONV_NUMERIC_ID"); return this; }

    protected ConditionValue _implicitConvStringId;
    public ConditionValue getImplicitConvStringId() {
        if (_implicitConvStringId == null) { _implicitConvStringId = nCV(); }
        return _implicitConvStringId;
    }
    protected ConditionValue getCValueImplicitConvStringId() { return getImplicitConvStringId(); }

    protected Map<String, WhiteImplicitConvStringCQ> _implicitConvStringId_InScopeRelation_WhiteImplicitConvStringMap;
    public Map<String, WhiteImplicitConvStringCQ> getImplicitConvStringId_InScopeRelation_WhiteImplicitConvString() { return _implicitConvStringId_InScopeRelation_WhiteImplicitConvStringMap; }
    public String keepImplicitConvStringId_InScopeRelation_WhiteImplicitConvString(WhiteImplicitConvStringCQ sq) {
        if (_implicitConvStringId_InScopeRelation_WhiteImplicitConvStringMap == null) { _implicitConvStringId_InScopeRelation_WhiteImplicitConvStringMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_implicitConvStringId_InScopeRelation_WhiteImplicitConvStringMap.size() + 1);
        _implicitConvStringId_InScopeRelation_WhiteImplicitConvStringMap.put(ky, sq); return "implicitConvStringId_InScopeRelation_WhiteImplicitConvString." + ky;
    }

    protected Map<String, WhiteImplicitConvStringCQ> _implicitConvStringId_NotInScopeRelation_WhiteImplicitConvStringMap;
    public Map<String, WhiteImplicitConvStringCQ> getImplicitConvStringId_NotInScopeRelation_WhiteImplicitConvString() { return _implicitConvStringId_NotInScopeRelation_WhiteImplicitConvStringMap; }
    public String keepImplicitConvStringId_NotInScopeRelation_WhiteImplicitConvString(WhiteImplicitConvStringCQ sq) {
        if (_implicitConvStringId_NotInScopeRelation_WhiteImplicitConvStringMap == null) { _implicitConvStringId_NotInScopeRelation_WhiteImplicitConvStringMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_implicitConvStringId_NotInScopeRelation_WhiteImplicitConvStringMap.size() + 1);
        _implicitConvStringId_NotInScopeRelation_WhiteImplicitConvStringMap.put(ky, sq); return "implicitConvStringId_NotInScopeRelation_WhiteImplicitConvString." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * IMPLICIT_CONV_STRING_ID: {NotNull, INT(10), FK to WHITE_IMPLICIT_CONV_STRING}
     * @return this. (NotNull)
     */
    public BsWhiteImplicitConvIntegerCQ addOrderBy_ImplicitConvStringId_Asc() { regOBA("IMPLICIT_CONV_STRING_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * IMPLICIT_CONV_STRING_ID: {NotNull, INT(10), FK to WHITE_IMPLICIT_CONV_STRING}
     * @return this. (NotNull)
     */
    public BsWhiteImplicitConvIntegerCQ addOrderBy_ImplicitConvStringId_Desc() { regOBD("IMPLICIT_CONV_STRING_ID"); return this; }

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
    public BsWhiteImplicitConvIntegerCQ addOrderBy_ImplicitConvName_Asc() { regOBA("IMPLICIT_CONV_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * IMPLICIT_CONV_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteImplicitConvIntegerCQ addOrderBy_ImplicitConvName_Desc() { regOBD("IMPLICIT_CONV_NAME"); return this; }

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
    public BsWhiteImplicitConvIntegerCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsWhiteImplicitConvIntegerCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        WhiteImplicitConvIntegerCQ bq = (WhiteImplicitConvIntegerCQ)bqs;
        WhiteImplicitConvIntegerCQ uq = (WhiteImplicitConvIntegerCQ)uqs;
        if (bq.hasConditionQueryWhiteImplicitConvNumeric()) {
            uq.queryWhiteImplicitConvNumeric().reflectRelationOnUnionQuery(bq.queryWhiteImplicitConvNumeric(), uq.queryWhiteImplicitConvNumeric());
        }
        if (bq.hasConditionQueryWhiteImplicitConvString()) {
            uq.queryWhiteImplicitConvString().reflectRelationOnUnionQuery(bq.queryWhiteImplicitConvString(), uq.queryWhiteImplicitConvString());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
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
        String nrp = resolveNextRelationPath("white_implicit_conv_integer", "whiteImplicitConvNumeric");
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

    /**
     * Get the condition-query for relation table. <br />
     * white_implicit_conv_string by my IMPLICIT_CONV_STRING_ID, named 'whiteImplicitConvString'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteImplicitConvStringCQ queryWhiteImplicitConvString() {
        return getConditionQueryWhiteImplicitConvString();
    }
    protected WhiteImplicitConvStringCQ _conditionQueryWhiteImplicitConvString;
    public WhiteImplicitConvStringCQ getConditionQueryWhiteImplicitConvString() {
        if (_conditionQueryWhiteImplicitConvString == null) {
            _conditionQueryWhiteImplicitConvString = xcreateQueryWhiteImplicitConvString();
            xsetupOuterJoinWhiteImplicitConvString();
        }
        return _conditionQueryWhiteImplicitConvString;
    }
    protected WhiteImplicitConvStringCQ xcreateQueryWhiteImplicitConvString() {
        String nrp = resolveNextRelationPath("white_implicit_conv_integer", "whiteImplicitConvString");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        WhiteImplicitConvStringCQ cq = new WhiteImplicitConvStringCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("whiteImplicitConvString");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinWhiteImplicitConvString() {
        WhiteImplicitConvStringCQ cq = getConditionQueryWhiteImplicitConvString();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("IMPLICIT_CONV_STRING_ID", "IMPLICIT_CONV_STRING_ID");
        registerOuterJoin(cq, joinOnMap, "whiteImplicitConvString");
    }
    public boolean hasConditionQueryWhiteImplicitConvString() {
        return _conditionQueryWhiteImplicitConvString != null;
    }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, WhiteImplicitConvIntegerCQ> _scalarConditionMap;
    public Map<String, WhiteImplicitConvIntegerCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(WhiteImplicitConvIntegerCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, WhiteImplicitConvIntegerCQ> _specifyMyselfDerivedMap;
    public Map<String, WhiteImplicitConvIntegerCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(WhiteImplicitConvIntegerCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, WhiteImplicitConvIntegerCQ> _queryMyselfDerivedMap;
    public Map<String, WhiteImplicitConvIntegerCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(WhiteImplicitConvIntegerCQ sq) {
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
    protected Map<String, WhiteImplicitConvIntegerCQ> _myselfExistsMap;
    public Map<String, WhiteImplicitConvIntegerCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(WhiteImplicitConvIntegerCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, WhiteImplicitConvIntegerCQ> _myselfInScopeMap;
    public Map<String, WhiteImplicitConvIntegerCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(WhiteImplicitConvIntegerCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteImplicitConvIntegerCB.class.getName(); }
    protected String xCQ() { return WhiteImplicitConvIntegerCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
