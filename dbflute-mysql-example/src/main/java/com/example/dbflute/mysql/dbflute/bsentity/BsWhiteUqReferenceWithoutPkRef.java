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
import com.example.dbflute.mysql.dbflute.exentity.*;

/**
 * The entity of WHITE_UQ_REFERENCE_WITHOUT_PK_REF as TABLE. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     UQ_REFERENCE_REF_ID, UQ_REFERENCE_CODE
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
 *     white_uq_reference_without_pk
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     whiteUqReferenceWithoutPk
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long uqReferenceRefId = entity.getUqReferenceRefId();
 * String uqReferenceCode = entity.getUqReferenceCode();
 * entity.setUqReferenceRefId(uqReferenceRefId);
 * entity.setUqReferenceCode(uqReferenceCode);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteUqReferenceWithoutPkRef implements Entity, Serializable, Cloneable {

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
    /** UQ_REFERENCE_REF_ID: {NotNull, DECIMAL(16)} */
    protected Long _uqReferenceRefId;

    /** UQ_REFERENCE_CODE: {IX, NotNull, CHAR(3), FK to white_uq_reference_without_pk} */
    protected String _uqReferenceCode;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
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
        return "white_uq_reference_without_pk_ref";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteUqReferenceWithoutPkRef";
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
        return false;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** white_uq_reference_without_pk by my UQ_REFERENCE_CODE, named 'whiteUqReferenceWithoutPk'. */
    protected WhiteUqReferenceWithoutPk _whiteUqReferenceWithoutPk;

    /**
     * white_uq_reference_without_pk by my UQ_REFERENCE_CODE, named 'whiteUqReferenceWithoutPk'.
     * @return The entity of foreign property 'whiteUqReferenceWithoutPk'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteUqReferenceWithoutPk getWhiteUqReferenceWithoutPk() {
        return _whiteUqReferenceWithoutPk;
    }

    /**
     * white_uq_reference_without_pk by my UQ_REFERENCE_CODE, named 'whiteUqReferenceWithoutPk'.
     * @param whiteUqReferenceWithoutPk The entity of foreign property 'whiteUqReferenceWithoutPk'. (NullAllowed)
     */
    public void setWhiteUqReferenceWithoutPk(WhiteUqReferenceWithoutPk whiteUqReferenceWithoutPk) {
        _whiteUqReferenceWithoutPk = whiteUqReferenceWithoutPk;
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
     * @param other The other entity. (NullAllowed: if null, returns false fixedly)
     * @return Comparing result.
     */
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsWhiteUqReferenceWithoutPkRef)) { return false; }
        BsWhiteUqReferenceWithoutPkRef otherEntity = (BsWhiteUqReferenceWithoutPkRef)other;
        if (!xSV(getUqReferenceRefId(), otherEntity.getUqReferenceRefId())) { return false; }
        if (!xSV(getUqReferenceCode(), otherEntity.getUqReferenceCode())) { return false; }
        return true;
    }
    protected boolean xSV(Object value1, Object value2) { // isSameValue()
        return InternalUtil.isSameValue(value1, value2);
    }

    /**
     * Calculate the hash-code from primary-keys or columns.
     * @return The hash-code from primary-key or columns.
     */
    public int hashCode() {
        int result = 17;
        result = xCH(result, getTableDbName());
        result = xCH(result, getUqReferenceRefId());
        result = xCH(result, getUqReferenceCode());
        return result;
    }
    protected int xCH(int result, Object value) { // calculateHashcode()
        return InternalUtil.calculateHashcode(result, value);
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
        return buildDisplayString(InternalUtil.toClassTitle(this), true, true);
    }

    /**
     * {@inheritDoc}
     */
    public String toStringWithRelation() {
        StringBuilder sb = new StringBuilder();
        sb.append(toString());
        String l = "\n  ";
        if (_whiteUqReferenceWithoutPk != null)
        { sb.append(l).append(xbRDS(_whiteUqReferenceWithoutPk, "whiteUqReferenceWithoutPk")); }
        return sb.toString();
    }
    protected String xbRDS(Entity e, String name) { // buildRelationDisplayString()
        return e.buildDisplayString(name, true, true);
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
        String delimiter = ", ";
        sb.append(delimiter).append(getUqReferenceRefId());
        sb.append(delimiter).append(getUqReferenceCode());
        if (sb.length() > delimiter.length()) {
            sb.delete(0, delimiter.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String c = ",";
        if (_whiteUqReferenceWithoutPk != null) { sb.append(c).append("whiteUqReferenceWithoutPk"); }
        if (sb.length() > c.length()) {
            sb.delete(0, c.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public WhiteUqReferenceWithoutPkRef clone() {
        try {
            return (WhiteUqReferenceWithoutPkRef)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] UQ_REFERENCE_REF_ID: {NotNull, DECIMAL(16)} <br />
     * @return The value of the column 'UQ_REFERENCE_REF_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getUqReferenceRefId() {
        return _uqReferenceRefId;
    }

    /**
     * [set] UQ_REFERENCE_REF_ID: {NotNull, DECIMAL(16)} <br />
     * @param uqReferenceRefId The value of the column 'UQ_REFERENCE_REF_ID'. (basically NotNull if update: for the constraint)
     */
    public void setUqReferenceRefId(Long uqReferenceRefId) {
        __modifiedProperties.addPropertyName("uqReferenceRefId");
        this._uqReferenceRefId = uqReferenceRefId;
    }

    /**
     * [get] UQ_REFERENCE_CODE: {IX, NotNull, CHAR(3), FK to white_uq_reference_without_pk} <br />
     * @return The value of the column 'UQ_REFERENCE_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getUqReferenceCode() {
        return _uqReferenceCode;
    }

    /**
     * [set] UQ_REFERENCE_CODE: {IX, NotNull, CHAR(3), FK to white_uq_reference_without_pk} <br />
     * @param uqReferenceCode The value of the column 'UQ_REFERENCE_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setUqReferenceCode(String uqReferenceCode) {
        __modifiedProperties.addPropertyName("uqReferenceCode");
        this._uqReferenceCode = uqReferenceCode;
    }
}
