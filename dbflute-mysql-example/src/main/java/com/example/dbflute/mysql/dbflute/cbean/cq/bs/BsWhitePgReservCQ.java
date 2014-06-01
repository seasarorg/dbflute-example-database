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
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.mysql.dbflute.cbean.cq.ciq.*;
import com.example.dbflute.mysql.dbflute.cbean.*;
import com.example.dbflute.mysql.dbflute.cbean.cq.*;

/**
 * The base condition-query of white_pg_reserv.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhitePgReservCQ extends AbstractBsWhitePgReservCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhitePgReservCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhitePgReservCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from white_pg_reserv) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhitePgReservCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhitePgReservCIQ xcreateCIQ() {
        WhitePgReservCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhitePgReservCIQ xnewCIQ() {
        return new WhitePgReservCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join white_pg_reserv on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhitePgReservCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhitePgReservCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _classSynonym;
    public ConditionValue getClassSynonym() {
        if (_classSynonym == null) { _classSynonym = nCV(); }
        return _classSynonym;
    }
    protected ConditionValue getCValueClassSynonym() { return getClassSynonym(); }

    protected Map<String, WhitePgReservRefCQ> _classSynonym_ExistsReferrer_WhitePgReservRefListMap;
    public Map<String, WhitePgReservRefCQ> getClassSynonym_ExistsReferrer_WhitePgReservRefList() { return _classSynonym_ExistsReferrer_WhitePgReservRefListMap; }
    public String keepClassSynonym_ExistsReferrer_WhitePgReservRefList(WhitePgReservRefCQ sq) {
        if (_classSynonym_ExistsReferrer_WhitePgReservRefListMap == null) { _classSynonym_ExistsReferrer_WhitePgReservRefListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_classSynonym_ExistsReferrer_WhitePgReservRefListMap.size() + 1);
        _classSynonym_ExistsReferrer_WhitePgReservRefListMap.put(ky, sq); return "classSynonym_ExistsReferrer_WhitePgReservRefList." + ky;
    }

    protected Map<String, WhitePgReservRefCQ> _classSynonym_NotExistsReferrer_WhitePgReservRefListMap;
    public Map<String, WhitePgReservRefCQ> getClassSynonym_NotExistsReferrer_WhitePgReservRefList() { return _classSynonym_NotExistsReferrer_WhitePgReservRefListMap; }
    public String keepClassSynonym_NotExistsReferrer_WhitePgReservRefList(WhitePgReservRefCQ sq) {
        if (_classSynonym_NotExistsReferrer_WhitePgReservRefListMap == null) { _classSynonym_NotExistsReferrer_WhitePgReservRefListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_classSynonym_NotExistsReferrer_WhitePgReservRefListMap.size() + 1);
        _classSynonym_NotExistsReferrer_WhitePgReservRefListMap.put(ky, sq); return "classSynonym_NotExistsReferrer_WhitePgReservRefList." + ky;
    }

    protected Map<String, WhitePgReservRefCQ> _classSynonym_SpecifyDerivedReferrer_WhitePgReservRefListMap;
    public Map<String, WhitePgReservRefCQ> getClassSynonym_SpecifyDerivedReferrer_WhitePgReservRefList() { return _classSynonym_SpecifyDerivedReferrer_WhitePgReservRefListMap; }
    public String keepClassSynonym_SpecifyDerivedReferrer_WhitePgReservRefList(WhitePgReservRefCQ sq) {
        if (_classSynonym_SpecifyDerivedReferrer_WhitePgReservRefListMap == null) { _classSynonym_SpecifyDerivedReferrer_WhitePgReservRefListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_classSynonym_SpecifyDerivedReferrer_WhitePgReservRefListMap.size() + 1);
        _classSynonym_SpecifyDerivedReferrer_WhitePgReservRefListMap.put(ky, sq); return "classSynonym_SpecifyDerivedReferrer_WhitePgReservRefList." + ky;
    }

    protected Map<String, WhitePgReservRefCQ> _classSynonym_InScopeRelation_WhitePgReservRefListMap;
    public Map<String, WhitePgReservRefCQ> getClassSynonym_InScopeRelation_WhitePgReservRefList() { return _classSynonym_InScopeRelation_WhitePgReservRefListMap; }
    public String keepClassSynonym_InScopeRelation_WhitePgReservRefList(WhitePgReservRefCQ sq) {
        if (_classSynonym_InScopeRelation_WhitePgReservRefListMap == null) { _classSynonym_InScopeRelation_WhitePgReservRefListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_classSynonym_InScopeRelation_WhitePgReservRefListMap.size() + 1);
        _classSynonym_InScopeRelation_WhitePgReservRefListMap.put(ky, sq); return "classSynonym_InScopeRelation_WhitePgReservRefList." + ky;
    }

    protected Map<String, WhitePgReservRefCQ> _classSynonym_NotInScopeRelation_WhitePgReservRefListMap;
    public Map<String, WhitePgReservRefCQ> getClassSynonym_NotInScopeRelation_WhitePgReservRefList() { return _classSynonym_NotInScopeRelation_WhitePgReservRefListMap; }
    public String keepClassSynonym_NotInScopeRelation_WhitePgReservRefList(WhitePgReservRefCQ sq) {
        if (_classSynonym_NotInScopeRelation_WhitePgReservRefListMap == null) { _classSynonym_NotInScopeRelation_WhitePgReservRefListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_classSynonym_NotInScopeRelation_WhitePgReservRefListMap.size() + 1);
        _classSynonym_NotInScopeRelation_WhitePgReservRefListMap.put(ky, sq); return "classSynonym_NotInScopeRelation_WhitePgReservRefList." + ky;
    }

    protected Map<String, WhitePgReservRefCQ> _classSynonym_QueryDerivedReferrer_WhitePgReservRefListMap;
    public Map<String, WhitePgReservRefCQ> getClassSynonym_QueryDerivedReferrer_WhitePgReservRefList() { return _classSynonym_QueryDerivedReferrer_WhitePgReservRefListMap; }
    public String keepClassSynonym_QueryDerivedReferrer_WhitePgReservRefList(WhitePgReservRefCQ sq) {
        if (_classSynonym_QueryDerivedReferrer_WhitePgReservRefListMap == null) { _classSynonym_QueryDerivedReferrer_WhitePgReservRefListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_classSynonym_QueryDerivedReferrer_WhitePgReservRefListMap.size() + 1);
        _classSynonym_QueryDerivedReferrer_WhitePgReservRefListMap.put(ky, sq); return "classSynonym_QueryDerivedReferrer_WhitePgReservRefList." + ky;
    }
    protected Map<String, Object> _classSynonym_QueryDerivedReferrer_WhitePgReservRefListParameterMap;
    public Map<String, Object> getClassSynonym_QueryDerivedReferrer_WhitePgReservRefListParameter() { return _classSynonym_QueryDerivedReferrer_WhitePgReservRefListParameterMap; }
    public String keepClassSynonym_QueryDerivedReferrer_WhitePgReservRefListParameter(Object vl) {
        if (_classSynonym_QueryDerivedReferrer_WhitePgReservRefListParameterMap == null) { _classSynonym_QueryDerivedReferrer_WhitePgReservRefListParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_classSynonym_QueryDerivedReferrer_WhitePgReservRefListParameterMap.size() + 1);
        _classSynonym_QueryDerivedReferrer_WhitePgReservRefListParameterMap.put(ky, vl); return "classSynonym_QueryDerivedReferrer_WhitePgReservRefListParameter." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * ((using DBFlute synonym))CLASS: {PK, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_ClassSynonym_Asc() { regOBA("CLASS"); return this; }

    /**
     * Add order-by as descend. <br />
     * ((using DBFlute synonym))CLASS: {PK, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_ClassSynonym_Desc() { regOBD("CLASS"); return this; }

    protected ConditionValue _caseSynonym;
    public ConditionValue getCaseSynonym() {
        if (_caseSynonym == null) { _caseSynonym = nCV(); }
        return _caseSynonym;
    }
    protected ConditionValue getCValueCaseSynonym() { return getCaseSynonym(); }

    /** 
     * Add order-by as ascend. <br />
     * ((using DBFlute synonym))CASE: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_CaseSynonym_Asc() { regOBA("CASE"); return this; }

    /**
     * Add order-by as descend. <br />
     * ((using DBFlute synonym))CASE: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_CaseSynonym_Desc() { regOBD("CASE"); return this; }

    protected ConditionValue _packageSynonym;
    public ConditionValue getPackageSynonym() {
        if (_packageSynonym == null) { _packageSynonym = nCV(); }
        return _packageSynonym;
    }
    protected ConditionValue getCValuePackageSynonym() { return getPackageSynonym(); }

    /** 
     * Add order-by as ascend. <br />
     * ((using DBFlute synonym))PACKAGE: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_PackageSynonym_Asc() { regOBA("PACKAGE"); return this; }

    /**
     * Add order-by as descend. <br />
     * ((using DBFlute synonym))PACKAGE: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_PackageSynonym_Desc() { regOBD("PACKAGE"); return this; }

    protected ConditionValue _defaultSynonym;
    public ConditionValue getDefaultSynonym() {
        if (_defaultSynonym == null) { _defaultSynonym = nCV(); }
        return _defaultSynonym;
    }
    protected ConditionValue getCValueDefaultSynonym() { return getDefaultSynonym(); }

    /** 
     * Add order-by as ascend. <br />
     * ((using DBFlute synonym))DEFAULT: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_DefaultSynonym_Asc() { regOBA("DEFAULT"); return this; }

    /**
     * Add order-by as descend. <br />
     * ((using DBFlute synonym))DEFAULT: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_DefaultSynonym_Desc() { regOBD("DEFAULT"); return this; }

    protected ConditionValue _newSynonym;
    public ConditionValue getNewSynonym() {
        if (_newSynonym == null) { _newSynonym = nCV(); }
        return _newSynonym;
    }
    protected ConditionValue getCValueNewSynonym() { return getNewSynonym(); }

    /** 
     * Add order-by as ascend. <br />
     * ((using DBFlute synonym))NEW: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_NewSynonym_Asc() { regOBA("NEW"); return this; }

    /**
     * Add order-by as descend. <br />
     * ((using DBFlute synonym))NEW: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_NewSynonym_Desc() { regOBD("NEW"); return this; }

    protected ConditionValue _nativeSynonym;
    public ConditionValue getNativeSynonym() {
        if (_nativeSynonym == null) { _nativeSynonym = nCV(); }
        return _nativeSynonym;
    }
    protected ConditionValue getCValueNativeSynonym() { return getNativeSynonym(); }

    /** 
     * Add order-by as ascend. <br />
     * ((using DBFlute synonym))NATIVE: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_NativeSynonym_Asc() { regOBA("NATIVE"); return this; }

    /**
     * Add order-by as descend. <br />
     * ((using DBFlute synonym))NATIVE: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_NativeSynonym_Desc() { regOBD("NATIVE"); return this; }

    protected ConditionValue _voidSynonym;
    public ConditionValue getVoidSynonym() {
        if (_voidSynonym == null) { _voidSynonym = nCV(); }
        return _voidSynonym;
    }
    protected ConditionValue getCValueVoidSynonym() { return getVoidSynonym(); }

    /** 
     * Add order-by as ascend. <br />
     * ((using DBFlute synonym))VOID: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_VoidSynonym_Asc() { regOBA("VOID"); return this; }

    /**
     * Add order-by as descend. <br />
     * ((using DBFlute synonym))VOID: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_VoidSynonym_Desc() { regOBD("VOID"); return this; }

    protected ConditionValue _publicSynonym;
    public ConditionValue getPublicSynonym() {
        if (_publicSynonym == null) { _publicSynonym = nCV(); }
        return _publicSynonym;
    }
    protected ConditionValue getCValuePublicSynonym() { return getPublicSynonym(); }

    /** 
     * Add order-by as ascend. <br />
     * ((using DBFlute synonym))PUBLIC: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_PublicSynonym_Asc() { regOBA("PUBLIC"); return this; }

    /**
     * Add order-by as descend. <br />
     * ((using DBFlute synonym))PUBLIC: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_PublicSynonym_Desc() { regOBD("PUBLIC"); return this; }

    protected ConditionValue _protectedSynonym;
    public ConditionValue getProtectedSynonym() {
        if (_protectedSynonym == null) { _protectedSynonym = nCV(); }
        return _protectedSynonym;
    }
    protected ConditionValue getCValueProtectedSynonym() { return getProtectedSynonym(); }

    /** 
     * Add order-by as ascend. <br />
     * ((using DBFlute synonym))PROTECTED: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_ProtectedSynonym_Asc() { regOBA("PROTECTED"); return this; }

    /**
     * Add order-by as descend. <br />
     * ((using DBFlute synonym))PROTECTED: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_ProtectedSynonym_Desc() { regOBD("PROTECTED"); return this; }

    protected ConditionValue _privateSynonym;
    public ConditionValue getPrivateSynonym() {
        if (_privateSynonym == null) { _privateSynonym = nCV(); }
        return _privateSynonym;
    }
    protected ConditionValue getCValuePrivateSynonym() { return getPrivateSynonym(); }

    /** 
     * Add order-by as ascend. <br />
     * ((using DBFlute synonym))PRIVATE: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_PrivateSynonym_Asc() { regOBA("PRIVATE"); return this; }

    /**
     * Add order-by as descend. <br />
     * ((using DBFlute synonym))PRIVATE: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_PrivateSynonym_Desc() { regOBD("PRIVATE"); return this; }

    protected ConditionValue _interfaceSynonym;
    public ConditionValue getInterfaceSynonym() {
        if (_interfaceSynonym == null) { _interfaceSynonym = nCV(); }
        return _interfaceSynonym;
    }
    protected ConditionValue getCValueInterfaceSynonym() { return getInterfaceSynonym(); }

    /** 
     * Add order-by as ascend. <br />
     * ((using DBFlute synonym))INTERFACE: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_InterfaceSynonym_Asc() { regOBA("INTERFACE"); return this; }

    /**
     * Add order-by as descend. <br />
     * ((using DBFlute synonym))INTERFACE: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_InterfaceSynonym_Desc() { regOBD("INTERFACE"); return this; }

    protected ConditionValue _abstractSynonym;
    public ConditionValue getAbstractSynonym() {
        if (_abstractSynonym == null) { _abstractSynonym = nCV(); }
        return _abstractSynonym;
    }
    protected ConditionValue getCValueAbstractSynonym() { return getAbstractSynonym(); }

    /** 
     * Add order-by as ascend. <br />
     * ((using DBFlute synonym))ABSTRACT: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_AbstractSynonym_Asc() { regOBA("ABSTRACT"); return this; }

    /**
     * Add order-by as descend. <br />
     * ((using DBFlute synonym))ABSTRACT: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_AbstractSynonym_Desc() { regOBD("ABSTRACT"); return this; }

    protected ConditionValue _finalSynonym;
    public ConditionValue getFinalSynonym() {
        if (_finalSynonym == null) { _finalSynonym = nCV(); }
        return _finalSynonym;
    }
    protected ConditionValue getCValueFinalSynonym() { return getFinalSynonym(); }

    /** 
     * Add order-by as ascend. <br />
     * ((using DBFlute synonym))FINAL: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_FinalSynonym_Asc() { regOBA("FINAL"); return this; }

    /**
     * Add order-by as descend. <br />
     * ((using DBFlute synonym))FINAL: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_FinalSynonym_Desc() { regOBD("FINAL"); return this; }

    protected ConditionValue _finallySynonym;
    public ConditionValue getFinallySynonym() {
        if (_finallySynonym == null) { _finallySynonym = nCV(); }
        return _finallySynonym;
    }
    protected ConditionValue getCValueFinallySynonym() { return getFinallySynonym(); }

    /** 
     * Add order-by as ascend. <br />
     * ((using DBFlute synonym))FINALLY: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_FinallySynonym_Asc() { regOBA("FINALLY"); return this; }

    /**
     * Add order-by as descend. <br />
     * ((using DBFlute synonym))FINALLY: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_FinallySynonym_Desc() { regOBD("FINALLY"); return this; }

    protected ConditionValue _returnSynonym;
    public ConditionValue getReturnSynonym() {
        if (_returnSynonym == null) { _returnSynonym = nCV(); }
        return _returnSynonym;
    }
    protected ConditionValue getCValueReturnSynonym() { return getReturnSynonym(); }

    /** 
     * Add order-by as ascend. <br />
     * ((using DBFlute synonym))RETURN: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_ReturnSynonym_Asc() { regOBA("RETURN"); return this; }

    /**
     * Add order-by as descend. <br />
     * ((using DBFlute synonym))RETURN: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_ReturnSynonym_Desc() { regOBD("RETURN"); return this; }

    protected ConditionValue _doubleSynonym;
    public ConditionValue getDoubleSynonym() {
        if (_doubleSynonym == null) { _doubleSynonym = nCV(); }
        return _doubleSynonym;
    }
    protected ConditionValue getCValueDoubleSynonym() { return getDoubleSynonym(); }

    /** 
     * Add order-by as ascend. <br />
     * ((using DBFlute synonym))DOUBLE: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_DoubleSynonym_Asc() { regOBA("DOUBLE"); return this; }

    /**
     * Add order-by as descend. <br />
     * ((using DBFlute synonym))DOUBLE: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_DoubleSynonym_Desc() { regOBD("DOUBLE"); return this; }

    protected ConditionValue _floatSynonym;
    public ConditionValue getFloatSynonym() {
        if (_floatSynonym == null) { _floatSynonym = nCV(); }
        return _floatSynonym;
    }
    protected ConditionValue getCValueFloatSynonym() { return getFloatSynonym(); }

    /** 
     * Add order-by as ascend. <br />
     * ((using DBFlute synonym))FLOAT: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_FloatSynonym_Asc() { regOBA("FLOAT"); return this; }

    /**
     * Add order-by as descend. <br />
     * ((using DBFlute synonym))FLOAT: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_FloatSynonym_Desc() { regOBD("FLOAT"); return this; }

    protected ConditionValue _shortSynonym;
    public ConditionValue getShortSynonym() {
        if (_shortSynonym == null) { _shortSynonym = nCV(); }
        return _shortSynonym;
    }
    protected ConditionValue getCValueShortSynonym() { return getShortSynonym(); }

    /** 
     * Add order-by as ascend. <br />
     * ((using DBFlute synonym))SHORT: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_ShortSynonym_Asc() { regOBA("SHORT"); return this; }

    /**
     * Add order-by as descend. <br />
     * ((using DBFlute synonym))SHORT: {INT(10)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_ShortSynonym_Desc() { regOBD("SHORT"); return this; }

    protected ConditionValue _type;
    public ConditionValue getType() {
        if (_type == null) { _type = nCV(); }
        return _type;
    }
    protected ConditionValue getCValueType() { return getType(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE: {CHAR(3)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_Type_Asc() { regOBA("TYPE"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE: {CHAR(3)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_Type_Desc() { regOBD("TYPE"); return this; }

    protected ConditionValue _reservName;
    public ConditionValue getReservName() {
        if (_reservName == null) { _reservName = nCV(); }
        return _reservName;
    }
    protected ConditionValue getCValueReservName() { return getReservName(); }

    /** 
     * Add order-by as ascend. <br />
     * RESERV_NAME: {NotNull, VARCHAR(32)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_ReservName_Asc() { regOBA("RESERV_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * RESERV_NAME: {NotNull, VARCHAR(32)}
     * @return this. (NotNull)
     */
    public BsWhitePgReservCQ addOrderBy_ReservName_Desc() { regOBD("RESERV_NAME"); return this; }

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
    public BsWhitePgReservCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsWhitePgReservCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
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
    protected Map<String, WhitePgReservCQ> _scalarConditionMap;
    public Map<String, WhitePgReservCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(WhitePgReservCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, WhitePgReservCQ> _specifyMyselfDerivedMap;
    public Map<String, WhitePgReservCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(WhitePgReservCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, WhitePgReservCQ> _queryMyselfDerivedMap;
    public Map<String, WhitePgReservCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(WhitePgReservCQ sq) {
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
    protected Map<String, WhitePgReservCQ> _myselfExistsMap;
    public Map<String, WhitePgReservCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(WhitePgReservCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, WhitePgReservCQ> _myselfInScopeMap;
    public Map<String, WhitePgReservCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(WhitePgReservCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhitePgReservCB.class.getName(); }
    protected String xCQ() { return WhitePgReservCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
