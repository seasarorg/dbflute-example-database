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
import java.util.Date;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.Entity;
import com.example.dbflute.mysql.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.mysql.dbflute.exentity.*;

/**
 * The entity of WHITE_DELIMITER as TABLE. <br />
 * <pre>
 * [primary-key]
 *     DELIMITER_ID
 * 
 * [column]
 *     DELIMITER_ID, NUMBER_NULLABLE, STRING_CONVERTED, STRING_NON_CONVERTED, DATE_DEFAULT
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     DELIMITER_ID
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
 * Long delimiterId = entity.getDelimiterId();
 * Integer numberNullable = entity.getNumberNullable();
 * String stringConverted = entity.getStringConverted();
 * String stringNonConverted = entity.getStringNonConverted();
 * java.util.Date dateDefault = entity.getDateDefault();
 * entity.setDelimiterId(delimiterId);
 * entity.setNumberNullable(numberNullable);
 * entity.setStringConverted(stringConverted);
 * entity.setStringNonConverted(stringNonConverted);
 * entity.setDateDefault(dateDefault);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteDelimiter implements Entity, Serializable, Cloneable {

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
    /** DELIMITER_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _delimiterId;

    /** NUMBER_NULLABLE: {INT(10)} */
    protected Integer _numberNullable;

    /** STRING_CONVERTED: {VARCHAR(200)} */
    protected String _stringConverted;

    /** STRING_NON_CONVERTED: {VARCHAR(200)} */
    protected String _stringNonConverted;

    /** DATE_DEFAULT: {NotNull, DATE(10)} */
    protected java.util.Date _dateDefault;

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
        return "white_delimiter";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteDelimiter";
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
        if (getDelimiterId() == null) { return false; }
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
        if (obj == null || !(obj instanceof BsWhiteDelimiter)) { return false; }
        BsWhiteDelimiter other = (BsWhiteDelimiter)obj;
        if (!xSV(getDelimiterId(), other.getDelimiterId())) { return false; }
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
        hs = xCH(hs, getDelimiterId());
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
        sb.append(dm).append(getDelimiterId());
        sb.append(dm).append(getNumberNullable());
        sb.append(dm).append(getStringConverted());
        sb.append(dm).append(getStringNonConverted());
        sb.append(dm).append(xfUD(getDateDefault()));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String xfUD(Date date) { // formatUtilDate()
        return FunCustodial.toString(date, xgDP());
    }
    protected String xgDP() { // getDatePattern
        return "yyyy-MM-dd";
    }
    protected String buildRelationString() {
        return "";
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public WhiteDelimiter clone() {
        try {
            return (WhiteDelimiter)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] DELIMITER_ID: {PK, ID, NotNull, BIGINT(19)} <br />
     * @return The value of the column 'DELIMITER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getDelimiterId() {
        return _delimiterId;
    }

    /**
     * [set] DELIMITER_ID: {PK, ID, NotNull, BIGINT(19)} <br />
     * @param delimiterId The value of the column 'DELIMITER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setDelimiterId(Long delimiterId) {
        __modifiedProperties.addPropertyName("delimiterId");
        this._delimiterId = delimiterId;
    }

    /**
     * [get] NUMBER_NULLABLE: {INT(10)} <br />
     * @return The value of the column 'NUMBER_NULLABLE'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getNumberNullable() {
        return _numberNullable;
    }

    /**
     * [set] NUMBER_NULLABLE: {INT(10)} <br />
     * @param numberNullable The value of the column 'NUMBER_NULLABLE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNumberNullable(Integer numberNullable) {
        __modifiedProperties.addPropertyName("numberNullable");
        this._numberNullable = numberNullable;
    }

    /**
     * [get] STRING_CONVERTED: {VARCHAR(200)} <br />
     * @return The value of the column 'STRING_CONVERTED'. (NullAllowed even if selected: for no constraint)
     */
    public String getStringConverted() {
        return _stringConverted;
    }

    /**
     * [set] STRING_CONVERTED: {VARCHAR(200)} <br />
     * @param stringConverted The value of the column 'STRING_CONVERTED'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStringConverted(String stringConverted) {
        __modifiedProperties.addPropertyName("stringConverted");
        this._stringConverted = stringConverted;
    }

    /**
     * [get] STRING_NON_CONVERTED: {VARCHAR(200)} <br />
     * @return The value of the column 'STRING_NON_CONVERTED'. (NullAllowed even if selected: for no constraint)
     */
    public String getStringNonConverted() {
        return _stringNonConverted;
    }

    /**
     * [set] STRING_NON_CONVERTED: {VARCHAR(200)} <br />
     * @param stringNonConverted The value of the column 'STRING_NON_CONVERTED'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStringNonConverted(String stringNonConverted) {
        __modifiedProperties.addPropertyName("stringNonConverted");
        this._stringNonConverted = stringNonConverted;
    }

    /**
     * [get] DATE_DEFAULT: {NotNull, DATE(10)} <br />
     * @return The value of the column 'DATE_DEFAULT'. (basically NotNull if selected: for the constraint)
     */
    public java.util.Date getDateDefault() {
        return _dateDefault;
    }

    /**
     * [set] DATE_DEFAULT: {NotNull, DATE(10)} <br />
     * @param dateDefault The value of the column 'DATE_DEFAULT'. (basically NotNull if update: for the constraint)
     */
    public void setDateDefault(java.util.Date dateDefault) {
        __modifiedProperties.addPropertyName("dateDefault");
        this._dateDefault = dateDefault;
    }
}
