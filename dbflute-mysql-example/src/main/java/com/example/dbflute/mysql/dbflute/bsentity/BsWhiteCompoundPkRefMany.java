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
 * The entity of WHITE_COMPOUND_PK_REF_MANY as TABLE. <br />
 * <pre>
 * [primary-key]
 *     MULTIPLE_FIRST_ID, MULTIPLE_SECOND_ID
 * 
 * [column]
 *     MULTIPLE_FIRST_ID, MULTIPLE_SECOND_ID, REF_MANY_FIRST_ID, REF_MANY_SECOND_ID, REF_MANY_CODE, REF_MANY_NAME, REF_MANY_DATETIME
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
 *     WHITE_COMPOUND_PK(ToPK)
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     whiteCompoundPkToPK
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer multipleFirstId = entity.getMultipleFirstId();
 * Integer multipleSecondId = entity.getMultipleSecondId();
 * Integer refManyFirstId = entity.getRefManyFirstId();
 * Integer refManySecondId = entity.getRefManySecondId();
 * String refManyCode = entity.getRefManyCode();
 * String refManyName = entity.getRefManyName();
 * java.sql.Timestamp refManyDatetime = entity.getRefManyDatetime();
 * entity.setMultipleFirstId(multipleFirstId);
 * entity.setMultipleSecondId(multipleSecondId);
 * entity.setRefManyFirstId(refManyFirstId);
 * entity.setRefManySecondId(refManySecondId);
 * entity.setRefManyCode(refManyCode);
 * entity.setRefManyName(refManyName);
 * entity.setRefManyDatetime(refManyDatetime);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteCompoundPkRefMany implements Entity, Serializable, Cloneable {

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
    /** MULTIPLE_FIRST_ID: {PK, NotNull, INT(10)} */
    protected Integer _multipleFirstId;

    /** MULTIPLE_SECOND_ID: {PK, NotNull, INT(10)} */
    protected Integer _multipleSecondId;

    /** REF_MANY_FIRST_ID: {NotNull, INT(10), FK to WHITE_COMPOUND_PK} */
    protected Integer _refManyFirstId;

    /** REF_MANY_SECOND_ID: {NotNull, INT(10), FK to WHITE_COMPOUND_PK} */
    protected Integer _refManySecondId;

    /** REF_MANY_CODE: {NotNull, CHAR(3)} */
    protected String _refManyCode;

    /** REF_MANY_NAME: {NotNull, VARCHAR(50)} */
    protected String _refManyName;

    /** REF_MANY_DATETIME: {NotNull, DATETIME(19)} */
    protected java.sql.Timestamp _refManyDatetime;

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
        return "white_compound_pk_ref_many";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteCompoundPkRefMany";
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
        if (getMultipleFirstId() == null) { return false; }
        if (getMultipleSecondId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** white_compound_pk by my REF_MANY_FIRST_ID, REF_MANY_SECOND_ID, named 'whiteCompoundPkToPK'. */
    protected WhiteCompoundPk _whiteCompoundPkToPK;

    /**
     * white_compound_pk by my REF_MANY_FIRST_ID, REF_MANY_SECOND_ID, named 'whiteCompoundPkToPK'.
     * @return The entity of foreign property 'whiteCompoundPkToPK'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteCompoundPk getWhiteCompoundPkToPK() {
        return _whiteCompoundPkToPK;
    }

    /**
     * white_compound_pk by my REF_MANY_FIRST_ID, REF_MANY_SECOND_ID, named 'whiteCompoundPkToPK'.
     * @param whiteCompoundPkToPK The entity of foreign property 'whiteCompoundPkToPK'. (NullAllowed)
     */
    public void setWhiteCompoundPkToPK(WhiteCompoundPk whiteCompoundPkToPK) {
        _whiteCompoundPkToPK = whiteCompoundPkToPK;
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
        if (other == null || !(other instanceof BsWhiteCompoundPkRefMany)) { return false; }
        BsWhiteCompoundPkRefMany otherEntity = (BsWhiteCompoundPkRefMany)other;
        if (!xSV(getMultipleFirstId(), otherEntity.getMultipleFirstId())) { return false; }
        if (!xSV(getMultipleSecondId(), otherEntity.getMultipleSecondId())) { return false; }
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
        result = xCH(result, getMultipleFirstId());
        result = xCH(result, getMultipleSecondId());
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
        if (_whiteCompoundPkToPK != null)
        { sb.append(l).append(xbRDS(_whiteCompoundPkToPK, "whiteCompoundPkToPK")); }
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
        sb.append(delimiter).append(getMultipleFirstId());
        sb.append(delimiter).append(getMultipleSecondId());
        sb.append(delimiter).append(getRefManyFirstId());
        sb.append(delimiter).append(getRefManySecondId());
        sb.append(delimiter).append(getRefManyCode());
        sb.append(delimiter).append(getRefManyName());
        sb.append(delimiter).append(getRefManyDatetime());
        if (sb.length() > delimiter.length()) {
            sb.delete(0, delimiter.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String c = ",";
        if (_whiteCompoundPkToPK != null) { sb.append(c).append("whiteCompoundPkToPK"); }
        if (sb.length() > c.length()) {
            sb.delete(0, c.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public WhiteCompoundPkRefMany clone() {
        try {
            return (WhiteCompoundPkRefMany)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MULTIPLE_FIRST_ID: {PK, NotNull, INT(10)} <br />
     * @return The value of the column 'MULTIPLE_FIRST_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMultipleFirstId() {
        return _multipleFirstId;
    }

    /**
     * [set] MULTIPLE_FIRST_ID: {PK, NotNull, INT(10)} <br />
     * @param multipleFirstId The value of the column 'MULTIPLE_FIRST_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMultipleFirstId(Integer multipleFirstId) {
        __modifiedProperties.addPropertyName("multipleFirstId");
        this._multipleFirstId = multipleFirstId;
    }

    /**
     * [get] MULTIPLE_SECOND_ID: {PK, NotNull, INT(10)} <br />
     * @return The value of the column 'MULTIPLE_SECOND_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMultipleSecondId() {
        return _multipleSecondId;
    }

    /**
     * [set] MULTIPLE_SECOND_ID: {PK, NotNull, INT(10)} <br />
     * @param multipleSecondId The value of the column 'MULTIPLE_SECOND_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMultipleSecondId(Integer multipleSecondId) {
        __modifiedProperties.addPropertyName("multipleSecondId");
        this._multipleSecondId = multipleSecondId;
    }

    /**
     * [get] REF_MANY_FIRST_ID: {NotNull, INT(10), FK to WHITE_COMPOUND_PK} <br />
     * @return The value of the column 'REF_MANY_FIRST_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getRefManyFirstId() {
        return _refManyFirstId;
    }

    /**
     * [set] REF_MANY_FIRST_ID: {NotNull, INT(10), FK to WHITE_COMPOUND_PK} <br />
     * @param refManyFirstId The value of the column 'REF_MANY_FIRST_ID'. (basically NotNull if update: for the constraint)
     */
    public void setRefManyFirstId(Integer refManyFirstId) {
        __modifiedProperties.addPropertyName("refManyFirstId");
        this._refManyFirstId = refManyFirstId;
    }

    /**
     * [get] REF_MANY_SECOND_ID: {NotNull, INT(10), FK to WHITE_COMPOUND_PK} <br />
     * @return The value of the column 'REF_MANY_SECOND_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getRefManySecondId() {
        return _refManySecondId;
    }

    /**
     * [set] REF_MANY_SECOND_ID: {NotNull, INT(10), FK to WHITE_COMPOUND_PK} <br />
     * @param refManySecondId The value of the column 'REF_MANY_SECOND_ID'. (basically NotNull if update: for the constraint)
     */
    public void setRefManySecondId(Integer refManySecondId) {
        __modifiedProperties.addPropertyName("refManySecondId");
        this._refManySecondId = refManySecondId;
    }

    /**
     * [get] REF_MANY_CODE: {NotNull, CHAR(3)} <br />
     * @return The value of the column 'REF_MANY_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getRefManyCode() {
        return _refManyCode;
    }

    /**
     * [set] REF_MANY_CODE: {NotNull, CHAR(3)} <br />
     * @param refManyCode The value of the column 'REF_MANY_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setRefManyCode(String refManyCode) {
        __modifiedProperties.addPropertyName("refManyCode");
        this._refManyCode = refManyCode;
    }

    /**
     * [get] REF_MANY_NAME: {NotNull, VARCHAR(50)} <br />
     * @return The value of the column 'REF_MANY_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getRefManyName() {
        return _refManyName;
    }

    /**
     * [set] REF_MANY_NAME: {NotNull, VARCHAR(50)} <br />
     * @param refManyName The value of the column 'REF_MANY_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setRefManyName(String refManyName) {
        __modifiedProperties.addPropertyName("refManyName");
        this._refManyName = refManyName;
    }

    /**
     * [get] REF_MANY_DATETIME: {NotNull, DATETIME(19)} <br />
     * @return The value of the column 'REF_MANY_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.sql.Timestamp getRefManyDatetime() {
        return _refManyDatetime;
    }

    /**
     * [set] REF_MANY_DATETIME: {NotNull, DATETIME(19)} <br />
     * @param refManyDatetime The value of the column 'REF_MANY_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setRefManyDatetime(java.sql.Timestamp refManyDatetime) {
        __modifiedProperties.addPropertyName("refManyDatetime");
        this._refManyDatetime = refManyDatetime;
    }
}
