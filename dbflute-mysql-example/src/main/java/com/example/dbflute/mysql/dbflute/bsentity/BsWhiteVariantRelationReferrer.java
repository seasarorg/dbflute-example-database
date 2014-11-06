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
package com.example.dbflute.mysql.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import com.example.dbflute.mysql.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.mysql.dbflute.allcommon.CDef;
import com.example.dbflute.mysql.dbflute.exentity.*;

/**
 * The entity of WHITE_VARIANT_RELATION_REFERRER as TABLE. <br />
 * <pre>
 * [primary-key]
 *     REFERRER_ID
 * 
 * [column]
 *     REFERRER_ID, VARIANT_MASTER_ID, MASTER_TYPE_CODE
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     
 * 
 * [version-no]
 *     
 * 
 * [foreign table]
 *     WHITE_VARIANT_RELATION_MASTER_FOO(AsVariant), WHITE_VARIANT_RELATION_MASTER_BAR(AsVariant), WHITE_VARIANT_RELATION_MASTER_QUX(AsVariantByQue), WHITE_VARIANT_RELATION_MASTER_CORGE(AsVariantByQuxType)
 * 
 * [referrer table]
 *     white_variant_relation_referrer_ref
 * 
 * [foreign property]
 *     whiteVariantRelationMasterFooAsVariant, whiteVariantRelationMasterBarAsVariant, whiteVariantRelationMasterQuxAsVariantByQue, whiteVariantRelationMasterCorgeAsVariantByQuxType
 * 
 * [referrer property]
 *     whiteVariantRelationReferrerRefList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long referrerId = entity.getReferrerId();
 * Long variantMasterId = entity.getVariantMasterId();
 * String masterTypeCode = entity.getMasterTypeCode();
 * entity.setReferrerId(referrerId);
 * entity.setVariantMasterId(variantMasterId);
 * entity.setMasterTypeCode(masterTypeCode);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteVariantRelationReferrer extends AbstractEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** REFERRER_ID: {PK, NotNull, BIGINT(19)} */
    protected Long _referrerId;

    /** VARIANT_MASTER_ID: {NotNull, BIGINT(19), FK to WHITE_VARIANT_RELATION_MASTER_FOO} */
    protected Long _variantMasterId;

    /** MASTER_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationMasterType} */
    protected String _masterTypeCode;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "white_variant_relation_referrer";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteVariantRelationReferrer";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /**
     * {@inheritDoc}
     */
    public DBMeta getDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(getTableDbName());
    }

    // ===================================================================================
    //                                                                         Primary Key
    //                                                                         ===========
    /**
     * {@inheritDoc}
     */
    public boolean hasPrimaryKeyValue() {
        if (getReferrerId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of masterTypeCode as the classification of VariantRelationMasterType. <br />
     * MASTER_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationMasterType} <br />
     * master type of variant relation (biz-many-to-one)
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.VariantRelationMasterType getMasterTypeCodeAsVariantRelationMasterType() {
        return CDef.VariantRelationMasterType.codeOf(getMasterTypeCode());
    }

    /**
     * Set the value of masterTypeCode as the classification of VariantRelationMasterType. <br />
     * MASTER_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationMasterType} <br />
     * master type of variant relation (biz-many-to-one)
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setMasterTypeCodeAsVariantRelationMasterType(CDef.VariantRelationMasterType cdef) {
        setMasterTypeCode(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of masterTypeCode as FooCls (FOO). <br />
     * FooCls
     */
    public void setMasterTypeCode_FooCls() {
        setMasterTypeCodeAsVariantRelationMasterType(CDef.VariantRelationMasterType.FooCls);
    }

    /**
     * Set the value of masterTypeCode as BarCls (BAR). <br />
     * BarCls
     */
    public void setMasterTypeCode_BarCls() {
        setMasterTypeCodeAsVariantRelationMasterType(CDef.VariantRelationMasterType.BarCls);
    }

    /**
     * Set the value of masterTypeCode as QuxCls (QUX). <br />
     * QuxCls
     */
    public void setMasterTypeCode_QuxCls() {
        setMasterTypeCodeAsVariantRelationMasterType(CDef.VariantRelationMasterType.QuxCls);
    }

    /**
     * Set the value of masterTypeCode as CorgeCls (CORGE). <br />
     * CorgeCls
     */
    public void setMasterTypeCode_CorgeCls() {
        setMasterTypeCodeAsVariantRelationMasterType(CDef.VariantRelationMasterType.CorgeCls);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of masterTypeCode FooCls? <br />
     * FooCls
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMasterTypeCodeFooCls() {
        CDef.VariantRelationMasterType cdef = getMasterTypeCodeAsVariantRelationMasterType();
        return cdef != null ? cdef.equals(CDef.VariantRelationMasterType.FooCls) : false;
    }

    /**
     * Is the value of masterTypeCode BarCls? <br />
     * BarCls
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMasterTypeCodeBarCls() {
        CDef.VariantRelationMasterType cdef = getMasterTypeCodeAsVariantRelationMasterType();
        return cdef != null ? cdef.equals(CDef.VariantRelationMasterType.BarCls) : false;
    }

    /**
     * Is the value of masterTypeCode QuxCls? <br />
     * QuxCls
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMasterTypeCodeQuxCls() {
        CDef.VariantRelationMasterType cdef = getMasterTypeCodeAsVariantRelationMasterType();
        return cdef != null ? cdef.equals(CDef.VariantRelationMasterType.QuxCls) : false;
    }

    /**
     * Is the value of masterTypeCode CorgeCls? <br />
     * CorgeCls
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMasterTypeCodeCorgeCls() {
        CDef.VariantRelationMasterType cdef = getMasterTypeCodeAsVariantRelationMasterType();
        return cdef != null ? cdef.equals(CDef.VariantRelationMasterType.CorgeCls) : false;
    }

    /**
     * Foo or Bar or Qux <br />
     * The group elements:[FooCls, BarCls, QuxCls]
     * @return The determination, true or false.
     */
    public boolean isMasterTypeCode_FooBarQux() {
        CDef.VariantRelationMasterType cdef = getMasterTypeCodeAsVariantRelationMasterType();
        return cdef != null && cdef.isFooBarQux();
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'masterTypeCode' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getMasterTypeCodeName() {
        CDef.VariantRelationMasterType cdef = getMasterTypeCodeAsVariantRelationMasterType();
        return cdef != null ? cdef.name() : null;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** white_variant_relation_master_foo by my VARIANT_MASTER_ID, named 'whiteVariantRelationMasterFooAsVariant'. */
    protected WhiteVariantRelationMasterFoo _whiteVariantRelationMasterFooAsVariant;

    /**
     * [get] white_variant_relation_master_foo by my VARIANT_MASTER_ID, named 'whiteVariantRelationMasterFooAsVariant'.
     * @return The entity of foreign property 'whiteVariantRelationMasterFooAsVariant'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteVariantRelationMasterFoo getWhiteVariantRelationMasterFooAsVariant() {
        return _whiteVariantRelationMasterFooAsVariant;
    }

    /**
     * [set] white_variant_relation_master_foo by my VARIANT_MASTER_ID, named 'whiteVariantRelationMasterFooAsVariant'.
     * @param whiteVariantRelationMasterFooAsVariant The entity of foreign property 'whiteVariantRelationMasterFooAsVariant'. (NullAllowed)
     */
    public void setWhiteVariantRelationMasterFooAsVariant(WhiteVariantRelationMasterFoo whiteVariantRelationMasterFooAsVariant) {
        _whiteVariantRelationMasterFooAsVariant = whiteVariantRelationMasterFooAsVariant;
    }

    /** white_variant_relation_master_bar by my VARIANT_MASTER_ID, named 'whiteVariantRelationMasterBarAsVariant'. */
    protected WhiteVariantRelationMasterBar _whiteVariantRelationMasterBarAsVariant;

    /**
     * [get] white_variant_relation_master_bar by my VARIANT_MASTER_ID, named 'whiteVariantRelationMasterBarAsVariant'.
     * @return The entity of foreign property 'whiteVariantRelationMasterBarAsVariant'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteVariantRelationMasterBar getWhiteVariantRelationMasterBarAsVariant() {
        return _whiteVariantRelationMasterBarAsVariant;
    }

    /**
     * [set] white_variant_relation_master_bar by my VARIANT_MASTER_ID, named 'whiteVariantRelationMasterBarAsVariant'.
     * @param whiteVariantRelationMasterBarAsVariant The entity of foreign property 'whiteVariantRelationMasterBarAsVariant'. (NullAllowed)
     */
    public void setWhiteVariantRelationMasterBarAsVariant(WhiteVariantRelationMasterBar whiteVariantRelationMasterBarAsVariant) {
        _whiteVariantRelationMasterBarAsVariant = whiteVariantRelationMasterBarAsVariant;
    }

    /** white_variant_relation_master_qux by my VARIANT_MASTER_ID, named 'whiteVariantRelationMasterQuxAsVariantByQue'. */
    protected WhiteVariantRelationMasterQux _whiteVariantRelationMasterQuxAsVariantByQue;

    /**
     * [get] white_variant_relation_master_qux by my VARIANT_MASTER_ID, named 'whiteVariantRelationMasterQuxAsVariantByQue'.
     * @return The entity of foreign property 'whiteVariantRelationMasterQuxAsVariantByQue'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteVariantRelationMasterQux getWhiteVariantRelationMasterQuxAsVariantByQue() {
        return _whiteVariantRelationMasterQuxAsVariantByQue;
    }

    /**
     * [set] white_variant_relation_master_qux by my VARIANT_MASTER_ID, named 'whiteVariantRelationMasterQuxAsVariantByQue'.
     * @param whiteVariantRelationMasterQuxAsVariantByQue The entity of foreign property 'whiteVariantRelationMasterQuxAsVariantByQue'. (NullAllowed)
     */
    public void setWhiteVariantRelationMasterQuxAsVariantByQue(WhiteVariantRelationMasterQux whiteVariantRelationMasterQuxAsVariantByQue) {
        _whiteVariantRelationMasterQuxAsVariantByQue = whiteVariantRelationMasterQuxAsVariantByQue;
    }

    /** white_variant_relation_master_corge by my VARIANT_MASTER_ID, named 'whiteVariantRelationMasterCorgeAsVariantByQuxType'. */
    protected WhiteVariantRelationMasterCorge _whiteVariantRelationMasterCorgeAsVariantByQuxType;

    /**
     * [get] white_variant_relation_master_corge by my VARIANT_MASTER_ID, named 'whiteVariantRelationMasterCorgeAsVariantByQuxType'.
     * @return The entity of foreign property 'whiteVariantRelationMasterCorgeAsVariantByQuxType'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteVariantRelationMasterCorge getWhiteVariantRelationMasterCorgeAsVariantByQuxType() {
        return _whiteVariantRelationMasterCorgeAsVariantByQuxType;
    }

    /**
     * [set] white_variant_relation_master_corge by my VARIANT_MASTER_ID, named 'whiteVariantRelationMasterCorgeAsVariantByQuxType'.
     * @param whiteVariantRelationMasterCorgeAsVariantByQuxType The entity of foreign property 'whiteVariantRelationMasterCorgeAsVariantByQuxType'. (NullAllowed)
     */
    public void setWhiteVariantRelationMasterCorgeAsVariantByQuxType(WhiteVariantRelationMasterCorge whiteVariantRelationMasterCorgeAsVariantByQuxType) {
        _whiteVariantRelationMasterCorgeAsVariantByQuxType = whiteVariantRelationMasterCorgeAsVariantByQuxType;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** white_variant_relation_referrer_ref by REFERRER_ID, named 'whiteVariantRelationReferrerRefList'. */
    protected List<WhiteVariantRelationReferrerRef> _whiteVariantRelationReferrerRefList;

    /**
     * [get] white_variant_relation_referrer_ref by REFERRER_ID, named 'whiteVariantRelationReferrerRefList'.
     * @return The entity list of referrer property 'whiteVariantRelationReferrerRefList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteVariantRelationReferrerRef> getWhiteVariantRelationReferrerRefList() {
        if (_whiteVariantRelationReferrerRefList == null) { _whiteVariantRelationReferrerRefList = newReferrerList(); }
        return _whiteVariantRelationReferrerRefList;
    }

    /**
     * [set] white_variant_relation_referrer_ref by REFERRER_ID, named 'whiteVariantRelationReferrerRefList'.
     * @param whiteVariantRelationReferrerRefList The entity list of referrer property 'whiteVariantRelationReferrerRefList'. (NullAllowed)
     */
    public void setWhiteVariantRelationReferrerRefList(List<WhiteVariantRelationReferrerRef> whiteVariantRelationReferrerRefList) {
        _whiteVariantRelationReferrerRefList = whiteVariantRelationReferrerRefList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsWhiteVariantRelationReferrer) {
            BsWhiteVariantRelationReferrer other = (BsWhiteVariantRelationReferrer)obj;
            if (!xSV(_referrerId, other._referrerId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _referrerId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteVariantRelationMasterFooAsVariant != null)
        { sb.append(li).append(xbRDS(_whiteVariantRelationMasterFooAsVariant, "whiteVariantRelationMasterFooAsVariant")); }
        if (_whiteVariantRelationMasterBarAsVariant != null)
        { sb.append(li).append(xbRDS(_whiteVariantRelationMasterBarAsVariant, "whiteVariantRelationMasterBarAsVariant")); }
        if (_whiteVariantRelationMasterQuxAsVariantByQue != null)
        { sb.append(li).append(xbRDS(_whiteVariantRelationMasterQuxAsVariantByQue, "whiteVariantRelationMasterQuxAsVariantByQue")); }
        if (_whiteVariantRelationMasterCorgeAsVariantByQuxType != null)
        { sb.append(li).append(xbRDS(_whiteVariantRelationMasterCorgeAsVariantByQuxType, "whiteVariantRelationMasterCorgeAsVariantByQuxType")); }
        if (_whiteVariantRelationReferrerRefList != null) { for (WhiteVariantRelationReferrerRef et : _whiteVariantRelationReferrerRefList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whiteVariantRelationReferrerRefList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_referrerId));
        sb.append(dm).append(xfND(_variantMasterId));
        sb.append(dm).append(xfND(_masterTypeCode));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteVariantRelationMasterFooAsVariant != null)
        { sb.append(dm).append("whiteVariantRelationMasterFooAsVariant"); }
        if (_whiteVariantRelationMasterBarAsVariant != null)
        { sb.append(dm).append("whiteVariantRelationMasterBarAsVariant"); }
        if (_whiteVariantRelationMasterQuxAsVariantByQue != null)
        { sb.append(dm).append("whiteVariantRelationMasterQuxAsVariantByQue"); }
        if (_whiteVariantRelationMasterCorgeAsVariantByQuxType != null)
        { sb.append(dm).append("whiteVariantRelationMasterCorgeAsVariantByQuxType"); }
        if (_whiteVariantRelationReferrerRefList != null && !_whiteVariantRelationReferrerRefList.isEmpty())
        { sb.append(dm).append("whiteVariantRelationReferrerRefList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteVariantRelationReferrer clone() {
        return (WhiteVariantRelationReferrer)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] REFERRER_ID: {PK, NotNull, BIGINT(19)} <br />
     * @return The value of the column 'REFERRER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getReferrerId() {
        checkSpecifiedProperty("referrerId");
        return _referrerId;
    }

    /**
     * [set] REFERRER_ID: {PK, NotNull, BIGINT(19)} <br />
     * @param referrerId The value of the column 'REFERRER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setReferrerId(Long referrerId) {
        registerModifiedProperty("referrerId");
        _referrerId = referrerId;
    }

    /**
     * [get] VARIANT_MASTER_ID: {NotNull, BIGINT(19), FK to WHITE_VARIANT_RELATION_MASTER_FOO} <br />
     * @return The value of the column 'VARIANT_MASTER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getVariantMasterId() {
        checkSpecifiedProperty("variantMasterId");
        return _variantMasterId;
    }

    /**
     * [set] VARIANT_MASTER_ID: {NotNull, BIGINT(19), FK to WHITE_VARIANT_RELATION_MASTER_FOO} <br />
     * @param variantMasterId The value of the column 'VARIANT_MASTER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setVariantMasterId(Long variantMasterId) {
        registerModifiedProperty("variantMasterId");
        _variantMasterId = variantMasterId;
    }

    /**
     * [get] MASTER_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationMasterType} <br />
     * @return The value of the column 'MASTER_TYPE_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getMasterTypeCode() {
        checkSpecifiedProperty("masterTypeCode");
        return _masterTypeCode;
    }

    /**
     * [set] MASTER_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationMasterType} <br />
     * @param masterTypeCode The value of the column 'MASTER_TYPE_CODE'. (basically NotNull if update: for the constraint)
     */
    protected void setMasterTypeCode(String masterTypeCode) {
        checkClassificationCode("MASTER_TYPE_CODE", CDef.DefMeta.VariantRelationMasterType, masterTypeCode);
        registerModifiedProperty("masterTypeCode");
        _masterTypeCode = masterTypeCode;
    }

    /**
     * For framework so basically DON'T use this method.
     * @param masterTypeCode The value of the column 'MASTER_TYPE_CODE'. (basically NotNull if update: for the constraint)
     */
    public void mynativeMappingMasterTypeCode(String masterTypeCode) {
        setMasterTypeCode(masterTypeCode);
    }
}
