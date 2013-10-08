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
 * The entity of WHITE_NO_PK as TABLE. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     NO_PK_ID, NO_PK_NAME, NO_PK_INTEGER
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
 * Long noPkId = entity.getNoPkId();
 * String noPkName = entity.getNoPkName();
 * Integer noPkInteger = entity.getNoPkInteger();
 * entity.setNoPkId(noPkId);
 * entity.setNoPkName(noPkName);
 * entity.setNoPkInteger(noPkInteger);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteNoPk implements Entity, Serializable, Cloneable {

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
    /** NO_PK_ID: {NotNull, DECIMAL(16)} */
    protected Long _noPkId;

    /** NO_PK_NAME: {VARCHAR(32)} */
    protected String _noPkName;

    /** NO_PK_INTEGER: {INT(10)} */
    protected Integer _noPkInteger;

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
        return "white_no_pk";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteNoPk";
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
        if (other == null || !(other instanceof BsWhiteNoPk)) { return false; }
        BsWhiteNoPk otherEntity = (BsWhiteNoPk)other;
        if (!xSV(getNoPkId(), otherEntity.getNoPkId())) { return false; }
        if (!xSV(getNoPkName(), otherEntity.getNoPkName())) { return false; }
        if (!xSV(getNoPkInteger(), otherEntity.getNoPkInteger())) { return false; }
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
        result = xCH(result, getNoPkId());
        result = xCH(result, getNoPkName());
        result = xCH(result, getNoPkInteger());
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
        String delimiter = ", ";
        sb.append(delimiter).append(getNoPkId());
        sb.append(delimiter).append(getNoPkName());
        sb.append(delimiter).append(getNoPkInteger());
        if (sb.length() > delimiter.length()) {
            sb.delete(0, delimiter.length());
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
    public WhiteNoPk clone() {
        try {
            return (WhiteNoPk)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] NO_PK_ID: {NotNull, DECIMAL(16)} <br />
     * @return The value of the column 'NO_PK_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getNoPkId() {
        return _noPkId;
    }

    /**
     * [set] NO_PK_ID: {NotNull, DECIMAL(16)} <br />
     * @param noPkId The value of the column 'NO_PK_ID'. (basically NotNull if update: for the constraint)
     */
    public void setNoPkId(Long noPkId) {
        __modifiedProperties.addPropertyName("noPkId");
        this._noPkId = noPkId;
    }

    /**
     * [get] NO_PK_NAME: {VARCHAR(32)} <br />
     * @return The value of the column 'NO_PK_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getNoPkName() {
        return _noPkName;
    }

    /**
     * [set] NO_PK_NAME: {VARCHAR(32)} <br />
     * @param noPkName The value of the column 'NO_PK_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNoPkName(String noPkName) {
        __modifiedProperties.addPropertyName("noPkName");
        this._noPkName = noPkName;
    }

    /**
     * [get] NO_PK_INTEGER: {INT(10)} <br />
     * @return The value of the column 'NO_PK_INTEGER'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getNoPkInteger() {
        return _noPkInteger;
    }

    /**
     * [set] NO_PK_INTEGER: {INT(10)} <br />
     * @param noPkInteger The value of the column 'NO_PK_INTEGER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNoPkInteger(Integer noPkInteger) {
        __modifiedProperties.addPropertyName("noPkInteger");
        this._noPkInteger = noPkInteger;
    }
}
