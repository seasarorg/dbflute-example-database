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
 * The entity of WHITE_VARIANT_RELATION_MASTER_QUX as TABLE. <br />
 * <pre>
 * [primary-key]
 *     MASTER_QUX_ID
 * 
 * [column]
 *     MASTER_QUX_ID, MASTER_QUX_NAME, QUX_TYPE_CODE
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
 *     
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long masterQuxId = entity.getMasterQuxId();
 * String masterQuxName = entity.getMasterQuxName();
 * String quxTypeCode = entity.getQuxTypeCode();
 * entity.setMasterQuxId(masterQuxId);
 * entity.setMasterQuxName(masterQuxName);
 * entity.setQuxTypeCode(quxTypeCode);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteVariantRelationMasterQux extends AbstractEntity {

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
    /** MASTER_QUX_ID: {PK, NotNull, BIGINT(19)} */
    protected Long _masterQuxId;

    /** MASTER_QUX_NAME: {NotNull, VARCHAR(200)} */
    protected String _masterQuxName;

    /** QUX_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationQuxType} */
    protected String _quxTypeCode;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "white_variant_relation_master_qux";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteVariantRelationMasterQux";
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
        if (getMasterQuxId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of quxTypeCode as the classification of VariantRelationQuxType. <br />
     * QUX_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationQuxType} <br />
     * qux type of variant relation (biz-many-to-one)
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.VariantRelationQuxType getQuxTypeCodeAsVariantRelationQuxType() {
        return CDef.VariantRelationQuxType.codeOf(getQuxTypeCode());
    }

    /**
     * Set the value of quxTypeCode as the classification of VariantRelationQuxType. <br />
     * QUX_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationQuxType} <br />
     * qux type of variant relation (biz-many-to-one)
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setQuxTypeCodeAsVariantRelationQuxType(CDef.VariantRelationQuxType cdef) {
        setQuxTypeCode(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of quxTypeCode as Qua (Qua). <br />
     * Qua
     */
    public void setQuxTypeCode_Qua() {
        setQuxTypeCodeAsVariantRelationQuxType(CDef.VariantRelationQuxType.Qua);
    }

    /**
     * Set the value of quxTypeCode as Que (Que). <br />
     * Que
     */
    public void setQuxTypeCode_Que() {
        setQuxTypeCodeAsVariantRelationQuxType(CDef.VariantRelationQuxType.Que);
    }

    /**
     * Set the value of quxTypeCode as Quo (Quo). <br />
     * Quo
     */
    public void setQuxTypeCode_Quo() {
        setQuxTypeCodeAsVariantRelationQuxType(CDef.VariantRelationQuxType.Quo);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of quxTypeCode Qua? <br />
     * Qua
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isQuxTypeCodeQua() {
        CDef.VariantRelationQuxType cdef = getQuxTypeCodeAsVariantRelationQuxType();
        return cdef != null ? cdef.equals(CDef.VariantRelationQuxType.Qua) : false;
    }

    /**
     * Is the value of quxTypeCode Que? <br />
     * Que
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isQuxTypeCodeQue() {
        CDef.VariantRelationQuxType cdef = getQuxTypeCodeAsVariantRelationQuxType();
        return cdef != null ? cdef.equals(CDef.VariantRelationQuxType.Que) : false;
    }

    /**
     * Is the value of quxTypeCode Quo? <br />
     * Quo
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isQuxTypeCodeQuo() {
        CDef.VariantRelationQuxType cdef = getQuxTypeCodeAsVariantRelationQuxType();
        return cdef != null ? cdef.equals(CDef.VariantRelationQuxType.Quo) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsWhiteVariantRelationMasterQux) {
            BsWhiteVariantRelationMasterQux other = (BsWhiteVariantRelationMasterQux)obj;
            if (!xSV(_masterQuxId, other._masterQuxId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _masterQuxId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_masterQuxId));
        sb.append(dm).append(xfND(_masterQuxName));
        sb.append(dm).append(xfND(_quxTypeCode));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public WhiteVariantRelationMasterQux clone() {
        return (WhiteVariantRelationMasterQux)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MASTER_QUX_ID: {PK, NotNull, BIGINT(19)} <br />
     * @return The value of the column 'MASTER_QUX_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getMasterQuxId() {
        checkSpecifiedProperty("masterQuxId");
        return _masterQuxId;
    }

    /**
     * [set] MASTER_QUX_ID: {PK, NotNull, BIGINT(19)} <br />
     * @param masterQuxId The value of the column 'MASTER_QUX_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMasterQuxId(Long masterQuxId) {
        registerModifiedProperty("masterQuxId");
        _masterQuxId = masterQuxId;
    }

    /**
     * [get] MASTER_QUX_NAME: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'MASTER_QUX_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getMasterQuxName() {
        checkSpecifiedProperty("masterQuxName");
        return _masterQuxName;
    }

    /**
     * [set] MASTER_QUX_NAME: {NotNull, VARCHAR(200)} <br />
     * @param masterQuxName The value of the column 'MASTER_QUX_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setMasterQuxName(String masterQuxName) {
        registerModifiedProperty("masterQuxName");
        _masterQuxName = masterQuxName;
    }

    /**
     * [get] QUX_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationQuxType} <br />
     * @return The value of the column 'QUX_TYPE_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getQuxTypeCode() {
        checkSpecifiedProperty("quxTypeCode");
        return _quxTypeCode;
    }

    /**
     * [set] QUX_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationQuxType} <br />
     * @param quxTypeCode The value of the column 'QUX_TYPE_CODE'. (basically NotNull if update: for the constraint)
     */
    protected void setQuxTypeCode(String quxTypeCode) {
        checkClassificationCode("QUX_TYPE_CODE", CDef.DefMeta.VariantRelationQuxType, quxTypeCode);
        registerModifiedProperty("quxTypeCode");
        _quxTypeCode = quxTypeCode;
    }

    /**
     * For framework so basically DON'T use this method.
     * @param quxTypeCode The value of the column 'QUX_TYPE_CODE'. (basically NotNull if update: for the constraint)
     */
    public void mynativeMappingQuxTypeCode(String quxTypeCode) {
        setQuxTypeCode(quxTypeCode);
    }
}
