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
 * The entity of WHITE_ONLY_ONE_TO_ONE_FROM as TABLE. <br />
 * <pre>
 * [primary-key]
 *     FROM_ID
 * 
 * [column]
 *     FROM_ID, FROM_NAME
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     FROM_ID
 * 
 * [version-no]
 *     
 * 
 * [foreign table]
 *     white_only_one_to_one_to(AsOne)
 * 
 * [referrer table]
 *     white_only_one_to_one_to
 * 
 * [foreign property]
 *     whiteOnlyOneToOneToAsOne
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long fromId = entity.getFromId();
 * String fromName = entity.getFromName();
 * entity.setFromId(fromId);
 * entity.setFromName(fromName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteOnlyOneToOneFrom implements Entity, Serializable, Cloneable {

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
    /** FROM_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _fromId;

    /** FROM_NAME: {NotNull, VARCHAR(200)} */
    protected String _fromName;

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
        return "white_only_one_to_one_from";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteOnlyOneToOneFrom";
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
        if (getFromId() == null) { return false; }
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
    /** white_only_one_to_one_to by FROM_ID, named 'whiteOnlyOneToOneToAsOne'. */
    protected WhiteOnlyOneToOneTo _whiteOnlyOneToOneToAsOne;

    /**
     * [get] white_only_one_to_one_to by FROM_ID, named 'whiteOnlyOneToOneToAsOne'.
     * @return the entity of foreign property(referrer-as-one) 'whiteOnlyOneToOneToAsOne'. (NullAllowed: when e.g. no data, no setupSelect)
     */
    public WhiteOnlyOneToOneTo getWhiteOnlyOneToOneToAsOne() {
        return _whiteOnlyOneToOneToAsOne;
    }

    /**
     * [set] white_only_one_to_one_to by FROM_ID, named 'whiteOnlyOneToOneToAsOne'.
     * @param whiteOnlyOneToOneToAsOne The entity of foreign property(referrer-as-one) 'whiteOnlyOneToOneToAsOne'. (NullAllowed)
     */
    public void setWhiteOnlyOneToOneToAsOne(WhiteOnlyOneToOneTo whiteOnlyOneToOneToAsOne) {
        _whiteOnlyOneToOneToAsOne = whiteOnlyOneToOneToAsOne;
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
        if (obj == null || !(obj instanceof BsWhiteOnlyOneToOneFrom)) { return false; }
        BsWhiteOnlyOneToOneFrom other = (BsWhiteOnlyOneToOneFrom)obj;
        if (!xSV(getFromId(), other.getFromId())) { return false; }
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
        hs = xCH(hs, getFromId());
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
        if (_whiteOnlyOneToOneToAsOne != null)
        { sb.append(li).append(xbRDS(_whiteOnlyOneToOneToAsOne, "whiteOnlyOneToOneToAsOne")); }
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
        sb.append(dm).append(getFromId());
        sb.append(dm).append(getFromName());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String cm = ",";
        if (_whiteOnlyOneToOneToAsOne != null) { sb.append(cm).append("whiteOnlyOneToOneToAsOne"); }
        if (sb.length() > cm.length()) {
            sb.delete(0, cm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public WhiteOnlyOneToOneFrom clone() {
        try {
            return (WhiteOnlyOneToOneFrom)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] FROM_ID: {PK, ID, NotNull, BIGINT(19)} <br />
     * @return The value of the column 'FROM_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getFromId() {
        return _fromId;
    }

    /**
     * [set] FROM_ID: {PK, ID, NotNull, BIGINT(19)} <br />
     * @param fromId The value of the column 'FROM_ID'. (basically NotNull if update: for the constraint)
     */
    public void setFromId(Long fromId) {
        __modifiedProperties.addPropertyName("fromId");
        _fromId = fromId;
    }

    /**
     * [get] FROM_NAME: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'FROM_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getFromName() {
        return _fromName;
    }

    /**
     * [set] FROM_NAME: {NotNull, VARCHAR(200)} <br />
     * @param fromName The value of the column 'FROM_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setFromName(String fromName) {
        __modifiedProperties.addPropertyName("fromName");
        _fromName = fromName;
    }
}
