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
import org.seasar.dbflute.dbmeta.accessory.DomainEntity;
import com.example.dbflute.mysql.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.mysql.dbflute.exentity.*;

/**
 * The entity of WHITE_VARIANT_RELATION_MASTER_FOO as TABLE. <br />
 * <pre>
 * [primary-key]
 *     MASTER_FOO_ID
 * 
 * [column]
 *     MASTER_FOO_ID, MASTER_FOO_NAME
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
 *     WHITE_VARIANT_RELATION_REFERRER(AsBizOneToOneForBizManyToOne), white_variant_relation_local_pk_referrer(AsOne)
 * 
 * [referrer table]
 *     white_variant_relation_referrer, white_variant_relation_local_pk_referrer
 * 
 * [foreign property]
 *     whiteVariantRelationReferrerAsBizOneToOneForBizManyToOne, whiteVariantRelationLocalPkReferrerAsOne
 * 
 * [referrer property]
 *     whiteVariantRelationReferrerAsVariantList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long masterFooId = entity.getMasterFooId();
 * String masterFooName = entity.getMasterFooName();
 * entity.setMasterFooId(masterFooId);
 * entity.setMasterFooName(masterFooName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteVariantRelationMasterFoo extends AbstractEntity implements DomainEntity {

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
    /** MASTER_FOO_ID: {PK, NotNull, BIGINT(19), FK to WHITE_VARIANT_RELATION_REFERRER} */
    protected Long _masterFooId;

    /** MASTER_FOO_NAME: {NotNull, VARCHAR(200)} */
    protected String _masterFooName;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "white_variant_relation_master_foo";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteVariantRelationMasterFoo";
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
        if (getMasterFooId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** white_variant_relation_referrer by my MASTER_FOO_ID, named 'whiteVariantRelationReferrerAsBizOneToOneForBizManyToOne'. */
    protected WhiteVariantRelationReferrer _whiteVariantRelationReferrerAsBizOneToOneForBizManyToOne;

    /**
     * [get] white_variant_relation_referrer by my MASTER_FOO_ID, named 'whiteVariantRelationReferrerAsBizOneToOneForBizManyToOne'.
     * @return The entity of foreign property 'whiteVariantRelationReferrerAsBizOneToOneForBizManyToOne'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteVariantRelationReferrer getWhiteVariantRelationReferrerAsBizOneToOneForBizManyToOne() {
        return _whiteVariantRelationReferrerAsBizOneToOneForBizManyToOne;
    }

    /**
     * [set] white_variant_relation_referrer by my MASTER_FOO_ID, named 'whiteVariantRelationReferrerAsBizOneToOneForBizManyToOne'.
     * @param whiteVariantRelationReferrerAsBizOneToOneForBizManyToOne The entity of foreign property 'whiteVariantRelationReferrerAsBizOneToOneForBizManyToOne'. (NullAllowed)
     */
    public void setWhiteVariantRelationReferrerAsBizOneToOneForBizManyToOne(WhiteVariantRelationReferrer whiteVariantRelationReferrerAsBizOneToOneForBizManyToOne) {
        _whiteVariantRelationReferrerAsBizOneToOneForBizManyToOne = whiteVariantRelationReferrerAsBizOneToOneForBizManyToOne;
    }

    /** white_variant_relation_local_pk_referrer by REVERSEFK_SUPPRESSED_ID, named 'whiteVariantRelationLocalPkReferrerAsOne'. */
    protected WhiteVariantRelationLocalPkReferrer _whiteVariantRelationLocalPkReferrerAsOne;

    /**
     * [get] white_variant_relation_local_pk_referrer by REVERSEFK_SUPPRESSED_ID, named 'whiteVariantRelationLocalPkReferrerAsOne'.
     * @return the entity of foreign property(referrer-as-one) 'whiteVariantRelationLocalPkReferrerAsOne'. (NullAllowed: when e.g. no data, no setupSelect)
     */
    public WhiteVariantRelationLocalPkReferrer getWhiteVariantRelationLocalPkReferrerAsOne() {
        return _whiteVariantRelationLocalPkReferrerAsOne;
    }

    /**
     * [set] white_variant_relation_local_pk_referrer by REVERSEFK_SUPPRESSED_ID, named 'whiteVariantRelationLocalPkReferrerAsOne'.
     * @param whiteVariantRelationLocalPkReferrerAsOne The entity of foreign property(referrer-as-one) 'whiteVariantRelationLocalPkReferrerAsOne'. (NullAllowed)
     */
    public void setWhiteVariantRelationLocalPkReferrerAsOne(WhiteVariantRelationLocalPkReferrer whiteVariantRelationLocalPkReferrerAsOne) {
        _whiteVariantRelationLocalPkReferrerAsOne = whiteVariantRelationLocalPkReferrerAsOne;
    }

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
        if (obj instanceof BsWhiteVariantRelationMasterFoo) {
            BsWhiteVariantRelationMasterFoo other = (BsWhiteVariantRelationMasterFoo)obj;
            if (!xSV(_masterFooId, other._masterFooId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _masterFooId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteVariantRelationReferrerAsBizOneToOneForBizManyToOne != null)
        { sb.append(li).append(xbRDS(_whiteVariantRelationReferrerAsBizOneToOneForBizManyToOne, "whiteVariantRelationReferrerAsBizOneToOneForBizManyToOne")); }
        if (_whiteVariantRelationLocalPkReferrerAsOne != null)
        { sb.append(li).append(xbRDS(_whiteVariantRelationLocalPkReferrerAsOne, "whiteVariantRelationLocalPkReferrerAsOne")); }
        if (_whiteVariantRelationReferrerAsVariantList != null) { for (WhiteVariantRelationReferrer et : _whiteVariantRelationReferrerAsVariantList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whiteVariantRelationReferrerAsVariantList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_masterFooId));
        sb.append(dm).append(xfND(_masterFooName));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteVariantRelationReferrerAsBizOneToOneForBizManyToOne != null)
        { sb.append(dm).append("whiteVariantRelationReferrerAsBizOneToOneForBizManyToOne"); }
        if (_whiteVariantRelationLocalPkReferrerAsOne != null)
        { sb.append(dm).append("whiteVariantRelationLocalPkReferrerAsOne"); }
        if (_whiteVariantRelationReferrerAsVariantList != null && !_whiteVariantRelationReferrerAsVariantList.isEmpty())
        { sb.append(dm).append("whiteVariantRelationReferrerAsVariantList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteVariantRelationMasterFoo clone() {
        return (WhiteVariantRelationMasterFoo)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MASTER_FOO_ID: {PK, NotNull, BIGINT(19), FK to WHITE_VARIANT_RELATION_REFERRER} <br />
     * @return The value of the column 'MASTER_FOO_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getMasterFooId() {
        checkSpecifiedProperty("masterFooId");
        return _masterFooId;
    }

    /**
     * [set] MASTER_FOO_ID: {PK, NotNull, BIGINT(19), FK to WHITE_VARIANT_RELATION_REFERRER} <br />
     * @param masterFooId The value of the column 'MASTER_FOO_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMasterFooId(Long masterFooId) {
        registerModifiedProperty("masterFooId");
        _masterFooId = masterFooId;
    }

    /**
     * [get] MASTER_FOO_NAME: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'MASTER_FOO_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getMasterFooName() {
        checkSpecifiedProperty("masterFooName");
        return _masterFooName;
    }

    /**
     * [set] MASTER_FOO_NAME: {NotNull, VARCHAR(200)} <br />
     * @param masterFooName The value of the column 'MASTER_FOO_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setMasterFooName(String masterFooName) {
        registerModifiedProperty("masterFooName");
        _masterFooName = masterFooName;
    }
}
