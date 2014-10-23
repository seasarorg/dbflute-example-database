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
import com.example.dbflute.mysql.dbflute.exentity.*;

/**
 * The entity of WHITE_VARIANT_RELATION_MASTER_BAR as TABLE. <br />
 * <pre>
 * [primary-key]
 *     MASTER_BAR_ID
 * 
 * [column]
 *     MASTER_BAR_ID, MASTER_BAR_NAME
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
 *     
 * 
 * [referrer table]
 *     white_variant_relation_referrer
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     whiteVariantRelationReferrerAsVariantList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long masterBarId = entity.getMasterBarId();
 * String masterBarName = entity.getMasterBarName();
 * entity.setMasterBarId(masterBarId);
 * entity.setMasterBarName(masterBarName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteVariantRelationMasterBar extends AbstractEntity {

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
    /** MASTER_BAR_ID: {PK, NotNull, BIGINT(19)} */
    protected Long _masterBarId;

    /** MASTER_BAR_NAME: {NotNull, VARCHAR(200)} */
    protected String _masterBarName;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "white_variant_relation_master_bar";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteVariantRelationMasterBar";
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
        if (getMasterBarId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** white_variant_relation_referrer by VARIANT_MASTER_ID, named 'whiteVariantRelationReferrerAsVariantList'. */
    protected List<WhiteVariantRelationReferrer> _whiteVariantRelationReferrerAsVariantList;

    /**
     * [get] white_variant_relation_referrer by VARIANT_MASTER_ID, named 'whiteVariantRelationReferrerAsVariantList'.
     * @return The entity list of referrer property 'whiteVariantRelationReferrerAsVariantList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteVariantRelationReferrer> getWhiteVariantRelationReferrerAsVariantList() {
        if (_whiteVariantRelationReferrerAsVariantList == null) { _whiteVariantRelationReferrerAsVariantList = newReferrerList(); }
        return _whiteVariantRelationReferrerAsVariantList;
    }

    /**
     * [set] white_variant_relation_referrer by VARIANT_MASTER_ID, named 'whiteVariantRelationReferrerAsVariantList'.
     * @param whiteVariantRelationReferrerAsVariantList The entity list of referrer property 'whiteVariantRelationReferrerAsVariantList'. (NullAllowed)
     */
    public void setWhiteVariantRelationReferrerAsVariantList(List<WhiteVariantRelationReferrer> whiteVariantRelationReferrerAsVariantList) {
        _whiteVariantRelationReferrerAsVariantList = whiteVariantRelationReferrerAsVariantList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsWhiteVariantRelationMasterBar) {
            BsWhiteVariantRelationMasterBar other = (BsWhiteVariantRelationMasterBar)obj;
            if (!xSV(_masterBarId, other._masterBarId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _masterBarId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteVariantRelationReferrerAsVariantList != null) { for (WhiteVariantRelationReferrer et : _whiteVariantRelationReferrerAsVariantList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whiteVariantRelationReferrerAsVariantList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_masterBarId));
        sb.append(dm).append(xfND(_masterBarName));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteVariantRelationReferrerAsVariantList != null && !_whiteVariantRelationReferrerAsVariantList.isEmpty())
        { sb.append(dm).append("whiteVariantRelationReferrerAsVariantList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteVariantRelationMasterBar clone() {
        return (WhiteVariantRelationMasterBar)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MASTER_BAR_ID: {PK, NotNull, BIGINT(19)} <br />
     * @return The value of the column 'MASTER_BAR_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getMasterBarId() {
        checkSpecifiedProperty("masterBarId");
        return _masterBarId;
    }

    /**
     * [set] MASTER_BAR_ID: {PK, NotNull, BIGINT(19)} <br />
     * @param masterBarId The value of the column 'MASTER_BAR_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMasterBarId(Long masterBarId) {
        __modifiedProperties.addPropertyName("masterBarId");
        _masterBarId = masterBarId;
    }

    /**
     * [get] MASTER_BAR_NAME: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'MASTER_BAR_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getMasterBarName() {
        checkSpecifiedProperty("masterBarName");
        return _masterBarName;
    }

    /**
     * [set] MASTER_BAR_NAME: {NotNull, VARCHAR(200)} <br />
     * @param masterBarName The value of the column 'MASTER_BAR_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setMasterBarName(String masterBarName) {
        __modifiedProperties.addPropertyName("masterBarName");
        _masterBarName = masterBarName;
    }
}
