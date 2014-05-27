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
 * The entity of WHITE_IMPLICIT_REVERSE_FK_SUPPRESS as TABLE. <br />
 * <pre>
 * [primary-key]
 *     WHITE_IMPLICIT_REVERSE_FK_SUPPRESS_ID
 * 
 * [column]
 *     WHITE_IMPLICIT_REVERSE_FK_SUPPRESS_ID, WHITE_IMPLICIT_REVERSE_FK_ID, VALID_BEGIN_DATE, VALID_END_DATE
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     WHITE_IMPLICIT_REVERSE_FK_SUPPRESS_ID
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
 * Integer whiteImplicitReverseFkSuppressId = entity.getWhiteImplicitReverseFkSuppressId();
 * Integer whiteImplicitReverseFkId = entity.getWhiteImplicitReverseFkId();
 * java.util.Date validBeginDate = entity.getValidBeginDate();
 * java.util.Date validEndDate = entity.getValidEndDate();
 * entity.setWhiteImplicitReverseFkSuppressId(whiteImplicitReverseFkSuppressId);
 * entity.setWhiteImplicitReverseFkId(whiteImplicitReverseFkId);
 * entity.setValidBeginDate(validBeginDate);
 * entity.setValidEndDate(validEndDate);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteImplicitReverseFkSuppress implements Entity, Serializable, Cloneable {

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
    /** WHITE_IMPLICIT_REVERSE_FK_SUPPRESS_ID: {PK, ID, NotNull, INT(10)} */
    protected Integer _whiteImplicitReverseFkSuppressId;

    /** WHITE_IMPLICIT_REVERSE_FK_ID: {UQ+, NotNull, INT(10)} */
    protected Integer _whiteImplicitReverseFkId;

    /** VALID_BEGIN_DATE: {+UQ, NotNull, DATE(10)} */
    protected java.util.Date _validBeginDate;

    /** VALID_END_DATE: {NotNull, DATE(10)} */
    protected java.util.Date _validEndDate;

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
        return "white_implicit_reverse_fk_suppress";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteImplicitReverseFkSuppress";
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
        if (getWhiteImplicitReverseFkSuppressId() == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br />
     * You can update the entity by the key when entity update (NOT batch update).
     * @param whiteImplicitReverseFkId : UQ+, NotNull, INT(10). (NotNull)
     * @param validBeginDate : +UQ, NotNull, DATE(10). (NotNull)
     */
    public void uniqueBy(Integer whiteImplicitReverseFkId, java.util.Date validBeginDate) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("whiteImplicitReverseFkId");
        _whiteImplicitReverseFkId = whiteImplicitReverseFkId;
        __uniqueDrivenProperties.addPropertyName("validBeginDate");
        _validBeginDate = validBeginDate;
    }

    /**
     * {@inheritDoc}
     */
    public Set<String> uniqueDrivenProperties() {
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
        if (obj == null || !(obj instanceof BsWhiteImplicitReverseFkSuppress)) { return false; }
        BsWhiteImplicitReverseFkSuppress other = (BsWhiteImplicitReverseFkSuppress)obj;
        if (!xSV(getWhiteImplicitReverseFkSuppressId(), other.getWhiteImplicitReverseFkSuppressId())) { return false; }
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
        hs = xCH(hs, getWhiteImplicitReverseFkSuppressId());
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
        sb.append(dm).append(getWhiteImplicitReverseFkSuppressId());
        sb.append(dm).append(getWhiteImplicitReverseFkId());
        sb.append(dm).append(xfUD(getValidBeginDate()));
        sb.append(dm).append(xfUD(getValidEndDate()));
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
    public WhiteImplicitReverseFkSuppress clone() {
        try {
            return (WhiteImplicitReverseFkSuppress)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] WHITE_IMPLICIT_REVERSE_FK_SUPPRESS_ID: {PK, ID, NotNull, INT(10)} <br />
     * @return The value of the column 'WHITE_IMPLICIT_REVERSE_FK_SUPPRESS_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getWhiteImplicitReverseFkSuppressId() {
        return _whiteImplicitReverseFkSuppressId;
    }

    /**
     * [set] WHITE_IMPLICIT_REVERSE_FK_SUPPRESS_ID: {PK, ID, NotNull, INT(10)} <br />
     * @param whiteImplicitReverseFkSuppressId The value of the column 'WHITE_IMPLICIT_REVERSE_FK_SUPPRESS_ID'. (basically NotNull if update: for the constraint)
     */
    public void setWhiteImplicitReverseFkSuppressId(Integer whiteImplicitReverseFkSuppressId) {
        __modifiedProperties.addPropertyName("whiteImplicitReverseFkSuppressId");
        this._whiteImplicitReverseFkSuppressId = whiteImplicitReverseFkSuppressId;
    }

    /**
     * [get] WHITE_IMPLICIT_REVERSE_FK_ID: {UQ+, NotNull, INT(10)} <br />
     * @return The value of the column 'WHITE_IMPLICIT_REVERSE_FK_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getWhiteImplicitReverseFkId() {
        return _whiteImplicitReverseFkId;
    }

    /**
     * [set] WHITE_IMPLICIT_REVERSE_FK_ID: {UQ+, NotNull, INT(10)} <br />
     * @param whiteImplicitReverseFkId The value of the column 'WHITE_IMPLICIT_REVERSE_FK_ID'. (basically NotNull if update: for the constraint)
     */
    public void setWhiteImplicitReverseFkId(Integer whiteImplicitReverseFkId) {
        __modifiedProperties.addPropertyName("whiteImplicitReverseFkId");
        this._whiteImplicitReverseFkId = whiteImplicitReverseFkId;
    }

    /**
     * [get] VALID_BEGIN_DATE: {+UQ, NotNull, DATE(10)} <br />
     * @return The value of the column 'VALID_BEGIN_DATE'. (basically NotNull if selected: for the constraint)
     */
    public java.util.Date getValidBeginDate() {
        return _validBeginDate;
    }

    /**
     * [set] VALID_BEGIN_DATE: {+UQ, NotNull, DATE(10)} <br />
     * @param validBeginDate The value of the column 'VALID_BEGIN_DATE'. (basically NotNull if update: for the constraint)
     */
    public void setValidBeginDate(java.util.Date validBeginDate) {
        __modifiedProperties.addPropertyName("validBeginDate");
        this._validBeginDate = validBeginDate;
    }

    /**
     * [get] VALID_END_DATE: {NotNull, DATE(10)} <br />
     * @return The value of the column 'VALID_END_DATE'. (basically NotNull if selected: for the constraint)
     */
    public java.util.Date getValidEndDate() {
        return _validEndDate;
    }

    /**
     * [set] VALID_END_DATE: {NotNull, DATE(10)} <br />
     * @param validEndDate The value of the column 'VALID_END_DATE'. (basically NotNull if update: for the constraint)
     */
    public void setValidEndDate(java.util.Date validEndDate) {
        __modifiedProperties.addPropertyName("validEndDate");
        this._validEndDate = validEndDate;
    }
}
