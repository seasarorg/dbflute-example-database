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
 * The entity of WHITE_COMPOUND_PK_REF_NEST as TABLE. <br />
 * <pre>
 * [primary-key]
 *     COMPOUND_PK_REF_NEST_ID
 * 
 * [column]
 *     COMPOUND_PK_REF_NEST_ID, FOO_MULTIPLE_ID, BAR_MULTIPLE_ID, QUX_MULTIPLE_ID, NEST_NAME
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
 *     white_compound_pk_ref
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     whiteCompoundPkRefByQuxMultipleId, whiteCompoundPkRefByFooMultipleId
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer compoundPkRefNestId = entity.getCompoundPkRefNestId();
 * Integer fooMultipleId = entity.getFooMultipleId();
 * Integer barMultipleId = entity.getBarMultipleId();
 * Integer quxMultipleId = entity.getQuxMultipleId();
 * String nestName = entity.getNestName();
 * entity.setCompoundPkRefNestId(compoundPkRefNestId);
 * entity.setFooMultipleId(fooMultipleId);
 * entity.setBarMultipleId(barMultipleId);
 * entity.setQuxMultipleId(quxMultipleId);
 * entity.setNestName(nestName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteCompoundPkRefNest implements Entity, Serializable, Cloneable {

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
    /** COMPOUND_PK_REF_NEST_ID: {PK, NotNull, INT(10)} */
    protected Integer _compoundPkRefNestId;

    /** FOO_MULTIPLE_ID: {IX, NotNull, INT(10), FK to white_compound_pk_ref} */
    protected Integer _fooMultipleId;

    /** BAR_MULTIPLE_ID: {IX, NotNull, INT(10), FK to white_compound_pk_ref} */
    protected Integer _barMultipleId;

    /** QUX_MULTIPLE_ID: {IX+, NotNull, INT(10), FK to white_compound_pk_ref} */
    protected Integer _quxMultipleId;

    /** NEST_NAME: {NotNull, VARCHAR(50)} */
    protected String _nestName;

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
        return "white_compound_pk_ref_nest";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteCompoundPkRefNest";
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
        if (getCompoundPkRefNestId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** white_compound_pk_ref by my BAR_MULTIPLE_ID, QUX_MULTIPLE_ID, named 'whiteCompoundPkRefByQuxMultipleId'. */
    protected WhiteCompoundPkRef _whiteCompoundPkRefByQuxMultipleId;

    /**
     * white_compound_pk_ref by my BAR_MULTIPLE_ID, QUX_MULTIPLE_ID, named 'whiteCompoundPkRefByQuxMultipleId'.
     * @return The entity of foreign property 'whiteCompoundPkRefByQuxMultipleId'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteCompoundPkRef getWhiteCompoundPkRefByQuxMultipleId() {
        return _whiteCompoundPkRefByQuxMultipleId;
    }

    /**
     * white_compound_pk_ref by my BAR_MULTIPLE_ID, QUX_MULTIPLE_ID, named 'whiteCompoundPkRefByQuxMultipleId'.
     * @param whiteCompoundPkRefByQuxMultipleId The entity of foreign property 'whiteCompoundPkRefByQuxMultipleId'. (NullAllowed)
     */
    public void setWhiteCompoundPkRefByQuxMultipleId(WhiteCompoundPkRef whiteCompoundPkRefByQuxMultipleId) {
        _whiteCompoundPkRefByQuxMultipleId = whiteCompoundPkRefByQuxMultipleId;
    }

    /** white_compound_pk_ref by my FOO_MULTIPLE_ID, BAR_MULTIPLE_ID, named 'whiteCompoundPkRefByFooMultipleId'. */
    protected WhiteCompoundPkRef _whiteCompoundPkRefByFooMultipleId;

    /**
     * white_compound_pk_ref by my FOO_MULTIPLE_ID, BAR_MULTIPLE_ID, named 'whiteCompoundPkRefByFooMultipleId'.
     * @return The entity of foreign property 'whiteCompoundPkRefByFooMultipleId'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteCompoundPkRef getWhiteCompoundPkRefByFooMultipleId() {
        return _whiteCompoundPkRefByFooMultipleId;
    }

    /**
     * white_compound_pk_ref by my FOO_MULTIPLE_ID, BAR_MULTIPLE_ID, named 'whiteCompoundPkRefByFooMultipleId'.
     * @param whiteCompoundPkRefByFooMultipleId The entity of foreign property 'whiteCompoundPkRefByFooMultipleId'. (NullAllowed)
     */
    public void setWhiteCompoundPkRefByFooMultipleId(WhiteCompoundPkRef whiteCompoundPkRefByFooMultipleId) {
        _whiteCompoundPkRefByFooMultipleId = whiteCompoundPkRefByFooMultipleId;
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
        if (other == null || !(other instanceof BsWhiteCompoundPkRefNest)) { return false; }
        BsWhiteCompoundPkRefNest otherEntity = (BsWhiteCompoundPkRefNest)other;
        if (!xSV(getCompoundPkRefNestId(), otherEntity.getCompoundPkRefNestId())) { return false; }
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
        result = xCH(result, getCompoundPkRefNestId());
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
        if (_whiteCompoundPkRefByQuxMultipleId != null)
        { sb.append(l).append(xbRDS(_whiteCompoundPkRefByQuxMultipleId, "whiteCompoundPkRefByQuxMultipleId")); }
        if (_whiteCompoundPkRefByFooMultipleId != null)
        { sb.append(l).append(xbRDS(_whiteCompoundPkRefByFooMultipleId, "whiteCompoundPkRefByFooMultipleId")); }
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
        sb.append(delimiter).append(getCompoundPkRefNestId());
        sb.append(delimiter).append(getFooMultipleId());
        sb.append(delimiter).append(getBarMultipleId());
        sb.append(delimiter).append(getQuxMultipleId());
        sb.append(delimiter).append(getNestName());
        if (sb.length() > delimiter.length()) {
            sb.delete(0, delimiter.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String c = ",";
        if (_whiteCompoundPkRefByQuxMultipleId != null) { sb.append(c).append("whiteCompoundPkRefByQuxMultipleId"); }
        if (_whiteCompoundPkRefByFooMultipleId != null) { sb.append(c).append("whiteCompoundPkRefByFooMultipleId"); }
        if (sb.length() > c.length()) {
            sb.delete(0, c.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public WhiteCompoundPkRefNest clone() {
        try {
            return (WhiteCompoundPkRefNest)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] COMPOUND_PK_REF_NEST_ID: {PK, NotNull, INT(10)} <br />
     * @return The value of the column 'COMPOUND_PK_REF_NEST_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getCompoundPkRefNestId() {
        return _compoundPkRefNestId;
    }

    /**
     * [set] COMPOUND_PK_REF_NEST_ID: {PK, NotNull, INT(10)} <br />
     * @param compoundPkRefNestId The value of the column 'COMPOUND_PK_REF_NEST_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCompoundPkRefNestId(Integer compoundPkRefNestId) {
        __modifiedProperties.addPropertyName("compoundPkRefNestId");
        this._compoundPkRefNestId = compoundPkRefNestId;
    }

    /**
     * [get] FOO_MULTIPLE_ID: {IX, NotNull, INT(10), FK to white_compound_pk_ref} <br />
     * @return The value of the column 'FOO_MULTIPLE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getFooMultipleId() {
        return _fooMultipleId;
    }

    /**
     * [set] FOO_MULTIPLE_ID: {IX, NotNull, INT(10), FK to white_compound_pk_ref} <br />
     * @param fooMultipleId The value of the column 'FOO_MULTIPLE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setFooMultipleId(Integer fooMultipleId) {
        __modifiedProperties.addPropertyName("fooMultipleId");
        this._fooMultipleId = fooMultipleId;
    }

    /**
     * [get] BAR_MULTIPLE_ID: {IX, NotNull, INT(10), FK to white_compound_pk_ref} <br />
     * @return The value of the column 'BAR_MULTIPLE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getBarMultipleId() {
        return _barMultipleId;
    }

    /**
     * [set] BAR_MULTIPLE_ID: {IX, NotNull, INT(10), FK to white_compound_pk_ref} <br />
     * @param barMultipleId The value of the column 'BAR_MULTIPLE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setBarMultipleId(Integer barMultipleId) {
        __modifiedProperties.addPropertyName("barMultipleId");
        this._barMultipleId = barMultipleId;
    }

    /**
     * [get] QUX_MULTIPLE_ID: {IX+, NotNull, INT(10), FK to white_compound_pk_ref} <br />
     * @return The value of the column 'QUX_MULTIPLE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getQuxMultipleId() {
        return _quxMultipleId;
    }

    /**
     * [set] QUX_MULTIPLE_ID: {IX+, NotNull, INT(10), FK to white_compound_pk_ref} <br />
     * @param quxMultipleId The value of the column 'QUX_MULTIPLE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setQuxMultipleId(Integer quxMultipleId) {
        __modifiedProperties.addPropertyName("quxMultipleId");
        this._quxMultipleId = quxMultipleId;
    }

    /**
     * [get] NEST_NAME: {NotNull, VARCHAR(50)} <br />
     * @return The value of the column 'NEST_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getNestName() {
        return _nestName;
    }

    /**
     * [set] NEST_NAME: {NotNull, VARCHAR(50)} <br />
     * @param nestName The value of the column 'NEST_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setNestName(String nestName) {
        __modifiedProperties.addPropertyName("nestName");
        this._nestName = nestName;
    }
}
