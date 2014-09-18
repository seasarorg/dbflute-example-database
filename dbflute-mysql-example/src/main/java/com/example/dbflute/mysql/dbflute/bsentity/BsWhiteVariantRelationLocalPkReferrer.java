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

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;
import com.example.dbflute.mysql.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.mysql.dbflute.exentity.*;

/**
 * The entity of WHITE_VARIANT_RELATION_LOCAL_PK_REFERRER as TABLE. <br />
 * <pre>
 * [primary-key]
 *     REVERSEFK_SUPPRESSED_ID
 * 
 * [column]
 *     REVERSEFK_SUPPRESSED_ID, MASTER_TYPE_CODE
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
 *     WHITE_VARIANT_RELATION_MASTER_FOO(AsBizManyToOneLikeBizOneToOne)
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     whiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long reversefkSuppressedId = entity.getReversefkSuppressedId();
 * String masterTypeCode = entity.getMasterTypeCode();
 * entity.setReversefkSuppressedId(reversefkSuppressedId);
 * entity.setMasterTypeCode(masterTypeCode);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteVariantRelationLocalPkReferrer implements Entity, Serializable, Cloneable {

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
    /** REVERSEFK_SUPPRESSED_ID: {PK, NotNull, BIGINT(19), FK to WHITE_VARIANT_RELATION_MASTER_FOO} */
    protected Long _reversefkSuppressedId;

    /** MASTER_TYPE_CODE: {NotNull, CHAR(3)} */
    protected String _masterTypeCode;

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
        return "white_variant_relation_local_pk_referrer";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteVariantRelationLocalPkReferrer";
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
        if (getReversefkSuppressedId() == null) { return false; }
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
    //                                                                    Foreign Property
    //                                                                    ================
    /** white_variant_relation_master_foo by my REVERSEFK_SUPPRESSED_ID, named 'whiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne'. */
    protected WhiteVariantRelationMasterFoo _whiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne;

    /**
     * [get] white_variant_relation_master_foo by my REVERSEFK_SUPPRESSED_ID, named 'whiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne'.
     * @return The entity of foreign property 'whiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteVariantRelationMasterFoo getWhiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne() {
        return _whiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne;
    }

    /**
     * [set] white_variant_relation_master_foo by my REVERSEFK_SUPPRESSED_ID, named 'whiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne'.
     * @param whiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne The entity of foreign property 'whiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne'. (NullAllowed)
     */
    public void setWhiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne(WhiteVariantRelationMasterFoo whiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne) {
        _whiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne = whiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne;
    }

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
        if (obj == null || !(obj instanceof BsWhiteVariantRelationLocalPkReferrer)) { return false; }
        BsWhiteVariantRelationLocalPkReferrer other = (BsWhiteVariantRelationLocalPkReferrer)obj;
        if (!xSV(getReversefkSuppressedId(), other.getReversefkSuppressedId())) { return false; }
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
        hs = xCH(hs, getReversefkSuppressedId());
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
        String li = "\n  ";
        if (_whiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne != null)
        { sb.append(li).append(xbRDS(_whiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne, "whiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne")); }
        return sb.toString();
    }
    protected String xbRDS(Entity et, String name) { // buildRelationDisplayString()
        return et.buildDisplayString(name, true, true);
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
        sb.append(dm).append(getReversefkSuppressedId());
        sb.append(dm).append(getMasterTypeCode());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String cm = ",";
        if (_whiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne != null) { sb.append(cm).append("whiteVariantRelationMasterFooAsBizManyToOneLikeBizOneToOne"); }
        if (sb.length() > cm.length()) {
            sb.delete(0, cm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public WhiteVariantRelationLocalPkReferrer clone() {
        try {
            return (WhiteVariantRelationLocalPkReferrer)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] REVERSEFK_SUPPRESSED_ID: {PK, NotNull, BIGINT(19), FK to WHITE_VARIANT_RELATION_MASTER_FOO} <br />
     * @return The value of the column 'REVERSEFK_SUPPRESSED_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getReversefkSuppressedId() {
        return _reversefkSuppressedId;
    }

    /**
     * [set] REVERSEFK_SUPPRESSED_ID: {PK, NotNull, BIGINT(19), FK to WHITE_VARIANT_RELATION_MASTER_FOO} <br />
     * @param reversefkSuppressedId The value of the column 'REVERSEFK_SUPPRESSED_ID'. (basically NotNull if update: for the constraint)
     */
    public void setReversefkSuppressedId(Long reversefkSuppressedId) {
        __modifiedProperties.addPropertyName("reversefkSuppressedId");
        _reversefkSuppressedId = reversefkSuppressedId;
    }

    /**
     * [get] MASTER_TYPE_CODE: {NotNull, CHAR(3)} <br />
     * @return The value of the column 'MASTER_TYPE_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getMasterTypeCode() {
        return _masterTypeCode;
    }

    /**
     * [set] MASTER_TYPE_CODE: {NotNull, CHAR(3)} <br />
     * @param masterTypeCode The value of the column 'MASTER_TYPE_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setMasterTypeCode(String masterTypeCode) {
        __modifiedProperties.addPropertyName("masterTypeCode");
        _masterTypeCode = masterTypeCode;
    }
}
