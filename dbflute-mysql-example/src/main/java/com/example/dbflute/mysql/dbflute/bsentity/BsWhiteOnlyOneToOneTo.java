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
 * The entity of WHITE_ONLY_ONE_TO_ONE_TO as TABLE. <br />
 * <pre>
 * [primary-key]
 *     TO_ID
 * 
 * [column]
 *     TO_ID, TO_NAME, FROM_ID
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     TO_ID
 * 
 * [version-no]
 *     
 * 
 * [foreign table]
 *     white_only_one_to_one_from
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     whiteOnlyOneToOneFrom
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long toId = entity.getToId();
 * String toName = entity.getToName();
 * Long fromId = entity.getFromId();
 * entity.setToId(toId);
 * entity.setToName(toName);
 * entity.setFromId(fromId);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteOnlyOneToOneTo implements Entity, Serializable, Cloneable {

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
    /** TO_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _toId;

    /** TO_NAME: {NotNull, VARCHAR(200)} */
    protected String _toName;

    /** FROM_ID: {UQ, NotNull, BIGINT(19), FK to white_only_one_to_one_from} */
    protected Long _fromId;

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
        return "white_only_one_to_one_to";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteOnlyOneToOneTo";
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
        if (getToId() == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br />
     * You can update the entity by the key when entity update (NOT batch update).
     * @param fromId : UQ, NotNull, BIGINT(19), FK to white_only_one_to_one_from. (NotNull)
     */
    public void uniqueBy(Long fromId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("fromId");
        _fromId = fromId;
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
    /** white_only_one_to_one_from by my FROM_ID, named 'whiteOnlyOneToOneFrom'. */
    protected WhiteOnlyOneToOneFrom _whiteOnlyOneToOneFrom;

    /**
     * white_only_one_to_one_from by my FROM_ID, named 'whiteOnlyOneToOneFrom'.
     * @return The entity of foreign property 'whiteOnlyOneToOneFrom'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteOnlyOneToOneFrom getWhiteOnlyOneToOneFrom() {
        return _whiteOnlyOneToOneFrom;
    }

    /**
     * white_only_one_to_one_from by my FROM_ID, named 'whiteOnlyOneToOneFrom'.
     * @param whiteOnlyOneToOneFrom The entity of foreign property 'whiteOnlyOneToOneFrom'. (NullAllowed)
     */
    public void setWhiteOnlyOneToOneFrom(WhiteOnlyOneToOneFrom whiteOnlyOneToOneFrom) {
        _whiteOnlyOneToOneFrom = whiteOnlyOneToOneFrom;
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
        if (obj == null || !(obj instanceof BsWhiteOnlyOneToOneTo)) { return false; }
        BsWhiteOnlyOneToOneTo other = (BsWhiteOnlyOneToOneTo)obj;
        if (!xSV(getToId(), other.getToId())) { return false; }
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
        hs = xCH(hs, getToId());
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
        if (_whiteOnlyOneToOneFrom != null)
        { sb.append(li).append(xbRDS(_whiteOnlyOneToOneFrom, "whiteOnlyOneToOneFrom")); }
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
        sb.append(dm).append(getToId());
        sb.append(dm).append(getToName());
        sb.append(dm).append(getFromId());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String cm = ",";
        if (_whiteOnlyOneToOneFrom != null) { sb.append(cm).append("whiteOnlyOneToOneFrom"); }
        if (sb.length() > cm.length()) {
            sb.delete(0, cm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public WhiteOnlyOneToOneTo clone() {
        try {
            return (WhiteOnlyOneToOneTo)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] TO_ID: {PK, ID, NotNull, BIGINT(19)} <br />
     * @return The value of the column 'TO_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getToId() {
        return _toId;
    }

    /**
     * [set] TO_ID: {PK, ID, NotNull, BIGINT(19)} <br />
     * @param toId The value of the column 'TO_ID'. (basically NotNull if update: for the constraint)
     */
    public void setToId(Long toId) {
        __modifiedProperties.addPropertyName("toId");
        this._toId = toId;
    }

    /**
     * [get] TO_NAME: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'TO_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getToName() {
        return _toName;
    }

    /**
     * [set] TO_NAME: {NotNull, VARCHAR(200)} <br />
     * @param toName The value of the column 'TO_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setToName(String toName) {
        __modifiedProperties.addPropertyName("toName");
        this._toName = toName;
    }

    /**
     * [get] FROM_ID: {UQ, NotNull, BIGINT(19), FK to white_only_one_to_one_from} <br />
     * @return The value of the column 'FROM_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getFromId() {
        return _fromId;
    }

    /**
     * [set] FROM_ID: {UQ, NotNull, BIGINT(19), FK to white_only_one_to_one_from} <br />
     * @param fromId The value of the column 'FROM_ID'. (basically NotNull if update: for the constraint)
     */
    public void setFromId(Long fromId) {
        __modifiedProperties.addPropertyName("fromId");
        this._fromId = fromId;
    }
}
