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

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.Entity;
import com.example.dbflute.mysql.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.mysql.dbflute.allcommon.CDef;
import com.example.dbflute.mysql.dbflute.exentity.*;

/**
 * The entity of WHITE_VARIANT_RELATION_MASTER_CORGE as TABLE. <br />
 * <pre>
 * [primary-key]
 *     MASTER_CORGE_ID
 * 
 * [column]
 *     MASTER_CORGE_ID, MASTER_CORGE_NAME, CORGE_TYPE_CODE
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
 * Long masterCorgeId = entity.getMasterCorgeId();
 * String masterCorgeName = entity.getMasterCorgeName();
 * String corgeTypeCode = entity.getCorgeTypeCode();
 * entity.setMasterCorgeId(masterCorgeId);
 * entity.setMasterCorgeName(masterCorgeName);
 * entity.setCorgeTypeCode(corgeTypeCode);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteVariantRelationMasterCorge implements Entity, Serializable, Cloneable {

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
    /** MASTER_CORGE_ID: {PK, NotNull, BIGINT(19)} */
    protected Long _masterCorgeId;

    /** MASTER_CORGE_NAME: {NotNull, VARCHAR(200)} */
    protected String _masterCorgeName;

    /** CORGE_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationQuxType} */
    protected String _corgeTypeCode;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The unique-driven properties for this entity. (NotNull) */
    protected final EntityUniqueDrivenProperties __uniqueDrivenProperties = newUniqueDrivenProperties();

    /** The modified properties for this entity. (NotNull) */
    protected final EntityModifiedProperties __modifiedProperties = newModifiedProperties();

    /** Is the entity created by DBFlute select process? */
    protected boolean __createdBySelect;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "white_variant_relation_master_corge";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteVariantRelationMasterCorge";
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
        if (getMasterCorgeId() == null) { return false; }
        return true;
    }

    /**
     * {@inheritDoc}
     */
    public Set<String> myuniqueDrivenProperties() {
        return __uniqueDrivenProperties.getPropertyNames();
    }

    protected EntityUniqueDrivenProperties newUniqueDrivenProperties() {
        return new EntityUniqueDrivenProperties();
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of corgeTypeCode as the classification of VariantRelationQuxType. <br />
     * CORGE_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationQuxType} <br />
     * qux type of variant relation (biz-many-to-one)
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.VariantRelationQuxType getCorgeTypeCodeAsVariantRelationQuxType() {
        return CDef.VariantRelationQuxType.codeOf(getCorgeTypeCode());
    }

    /**
     * Set the value of corgeTypeCode as the classification of VariantRelationQuxType. <br />
     * CORGE_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationQuxType} <br />
     * qux type of variant relation (biz-many-to-one)
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setCorgeTypeCodeAsVariantRelationQuxType(CDef.VariantRelationQuxType cdef) {
        setCorgeTypeCode(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of corgeTypeCode as Qua (Qua). <br />
     * Qua
     */
    public void setCorgeTypeCode_Qua() {
        setCorgeTypeCodeAsVariantRelationQuxType(CDef.VariantRelationQuxType.Qua);
    }

    /**
     * Set the value of corgeTypeCode as Que (Que). <br />
     * Que
     */
    public void setCorgeTypeCode_Que() {
        setCorgeTypeCodeAsVariantRelationQuxType(CDef.VariantRelationQuxType.Que);
    }

    /**
     * Set the value of corgeTypeCode as Quo (Quo). <br />
     * Quo
     */
    public void setCorgeTypeCode_Quo() {
        setCorgeTypeCodeAsVariantRelationQuxType(CDef.VariantRelationQuxType.Quo);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of corgeTypeCode Qua? <br />
     * Qua
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isCorgeTypeCodeQua() {
        CDef.VariantRelationQuxType cdef = getCorgeTypeCodeAsVariantRelationQuxType();
        return cdef != null ? cdef.equals(CDef.VariantRelationQuxType.Qua) : false;
    }

    /**
     * Is the value of corgeTypeCode Que? <br />
     * Que
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isCorgeTypeCodeQue() {
        CDef.VariantRelationQuxType cdef = getCorgeTypeCodeAsVariantRelationQuxType();
        return cdef != null ? cdef.equals(CDef.VariantRelationQuxType.Que) : false;
    }

    /**
     * Is the value of corgeTypeCode Quo? <br />
     * Quo
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isCorgeTypeCodeQuo() {
        CDef.VariantRelationQuxType cdef = getCorgeTypeCodeAsVariantRelationQuxType();
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
    //                                                                 Modified Properties
    //                                                                 ===================
    /**
     * {@inheritDoc}
     */
    public Set<String> modifiedProperties() {
        return __modifiedProperties.getPropertyNames();
    }

    /**
     * {@inheritDoc}
     */
    public void clearModifiedInfo() {
        __modifiedProperties.clear();
    }

    /**
     * {@inheritDoc}
     */
    public boolean hasModification() {
        return !__modifiedProperties.isEmpty();
    }

    protected EntityModifiedProperties newModifiedProperties() {
        return new EntityModifiedProperties();
    }

    // ===================================================================================
    //                                                                     Birthplace Mark
    //                                                                     ===============
    /**
     * {@inheritDoc}
     */
    public void markAsSelect() {
        __createdBySelect = true;
    }

    /**
     * {@inheritDoc}
     */
    public boolean createdBySelect() {
        return __createdBySelect;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    /**
     * Determine the object is equal with this. <br />
     * If primary-keys or columns of the other are same as this one, returns true.
     * @param obj The object as other entity. (NullAllowed: if null, returns false fixedly)
     * @return Comparing result.
     */
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BsWhiteVariantRelationMasterCorge)) { return false; }
        BsWhiteVariantRelationMasterCorge other = (BsWhiteVariantRelationMasterCorge)obj;
        if (!xSV(getMasterCorgeId(), other.getMasterCorgeId())) { return false; }
        return true;
    }
    protected boolean xSV(Object v1, Object v2) {
        return FunCustodial.isSameValue(v1, v2);
    }

    /**
     * Calculate the hash-code from primary-keys or columns.
     * @return The hash-code from primary-key or columns.
     */
    public int hashCode() {
        int hs = 17;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, getMasterCorgeId());
        return hs;
    }
    protected int xCH(int hs, Object vl) {
        return FunCustodial.calculateHashcode(hs, vl);
    }

    /**
     * {@inheritDoc}
     */
    public int instanceHash() {
        return super.hashCode();
    }

    /**
     * Convert to display string of entity's data. (no relation data)
     * @return The display string of all columns and relation existences. (NotNull)
     */
    public String toString() {
        return buildDisplayString(FunCustodial.toClassTitle(this), true, true);
    }

    /**
     * {@inheritDoc}
     */
    public String toStringWithRelation() {
        StringBuilder sb = new StringBuilder();
        sb.append(toString());
        return sb.toString();
    }

    /**
     * {@inheritDoc}
     */
    public String buildDisplayString(String name, boolean column, boolean relation) {
        StringBuilder sb = new StringBuilder();
        if (name != null) { sb.append(name).append(column || relation ? ":" : ""); }
        if (column) { sb.append(buildColumnString()); }
        if (relation) { sb.append(buildRelationString()); }
        sb.append("@").append(Integer.toHexString(hashCode()));
        return sb.toString();
    }
    protected String buildColumnString() {
        StringBuilder sb = new StringBuilder();
        String dm = ", ";
        sb.append(dm).append(getMasterCorgeId());
        sb.append(dm).append(getMasterCorgeName());
        sb.append(dm).append(getCorgeTypeCode());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        return "";
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public WhiteVariantRelationMasterCorge clone() {
        try {
            return (WhiteVariantRelationMasterCorge)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MASTER_CORGE_ID: {PK, NotNull, BIGINT(19)} <br />
     * @return The value of the column 'MASTER_CORGE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getMasterCorgeId() {
        return _masterCorgeId;
    }

    /**
     * [set] MASTER_CORGE_ID: {PK, NotNull, BIGINT(19)} <br />
     * @param masterCorgeId The value of the column 'MASTER_CORGE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMasterCorgeId(Long masterCorgeId) {
        __modifiedProperties.addPropertyName("masterCorgeId");
        _masterCorgeId = masterCorgeId;
    }

    /**
     * [get] MASTER_CORGE_NAME: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'MASTER_CORGE_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getMasterCorgeName() {
        return _masterCorgeName;
    }

    /**
     * [set] MASTER_CORGE_NAME: {NotNull, VARCHAR(200)} <br />
     * @param masterCorgeName The value of the column 'MASTER_CORGE_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setMasterCorgeName(String masterCorgeName) {
        __modifiedProperties.addPropertyName("masterCorgeName");
        _masterCorgeName = masterCorgeName;
    }

    /**
     * [get] CORGE_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationQuxType} <br />
     * @return The value of the column 'CORGE_TYPE_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getCorgeTypeCode() {
        return _corgeTypeCode;
    }

    /**
     * [set] CORGE_TYPE_CODE: {NotNull, CHAR(3), classification=VariantRelationQuxType} <br />
     * @param corgeTypeCode The value of the column 'CORGE_TYPE_CODE'. (basically NotNull if update: for the constraint)
     */
    protected void setCorgeTypeCode(String corgeTypeCode) {
        checkImplicitSet("CORGE_TYPE_CODE", CDef.DefMeta.VariantRelationQuxType, corgeTypeCode);
        __modifiedProperties.addPropertyName("corgeTypeCode");
        _corgeTypeCode = corgeTypeCode;
    }

    protected void checkImplicitSet(String columnDbName, CDef.DefMeta meta, Object value) {
        FunCustodial.checkImplicitSet(this, columnDbName, meta, value);
    }
}
