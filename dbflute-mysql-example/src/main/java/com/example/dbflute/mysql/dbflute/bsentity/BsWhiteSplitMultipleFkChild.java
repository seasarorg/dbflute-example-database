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
 * The entity of WHITE_SPLIT_MULTIPLE_FK_CHILD as TABLE. <br />
 * <pre>
 * [primary-key]
 *     CHILD_ID
 * 
 * [column]
 *     CHILD_ID, BASE_ID, CHILD_NAME
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
 *     white_split_multiple_fk_base
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     whiteSplitMultipleFkBase
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long childId = entity.getChildId();
 * Long baseId = entity.getBaseId();
 * String childName = entity.getChildName();
 * entity.setChildId(childId);
 * entity.setBaseId(baseId);
 * entity.setChildName(childName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteSplitMultipleFkChild implements Entity, Serializable, Cloneable {

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
    /** CHILD_ID: {PK, NotNull, BIGINT(19)} */
    protected Long _childId;

    /** BASE_ID: {IX, NotNull, BIGINT(19), FK to white_split_multiple_fk_base} */
    protected Long _baseId;

    /** CHILD_NAME: {NotNull, VARCHAR(200)} */
    protected String _childName;

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
        return "white_split_multiple_fk_child";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteSplitMultipleFkChild";
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
        if (getChildId() == null) { return false; }
        return true;
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
    /** white_split_multiple_fk_base by my BASE_ID, named 'whiteSplitMultipleFkBase'. */
    protected WhiteSplitMultipleFkBase _whiteSplitMultipleFkBase;

    /**
     * white_split_multiple_fk_base by my BASE_ID, named 'whiteSplitMultipleFkBase'.
     * @return The entity of foreign property 'whiteSplitMultipleFkBase'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteSplitMultipleFkBase getWhiteSplitMultipleFkBase() {
        return _whiteSplitMultipleFkBase;
    }

    /**
     * white_split_multiple_fk_base by my BASE_ID, named 'whiteSplitMultipleFkBase'.
     * @param whiteSplitMultipleFkBase The entity of foreign property 'whiteSplitMultipleFkBase'. (NullAllowed)
     */
    public void setWhiteSplitMultipleFkBase(WhiteSplitMultipleFkBase whiteSplitMultipleFkBase) {
        _whiteSplitMultipleFkBase = whiteSplitMultipleFkBase;
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
        if (obj == null || !(obj instanceof BsWhiteSplitMultipleFkChild)) { return false; }
        BsWhiteSplitMultipleFkChild other = (BsWhiteSplitMultipleFkChild)obj;
        if (!xSV(getChildId(), other.getChildId())) { return false; }
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
        hs = xCH(hs, getChildId());
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
        if (_whiteSplitMultipleFkBase != null)
        { sb.append(li).append(xbRDS(_whiteSplitMultipleFkBase, "whiteSplitMultipleFkBase")); }
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
        sb.append(dm).append(getChildId());
        sb.append(dm).append(getBaseId());
        sb.append(dm).append(getChildName());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String cm = ",";
        if (_whiteSplitMultipleFkBase != null) { sb.append(cm).append("whiteSplitMultipleFkBase"); }
        if (sb.length() > cm.length()) {
            sb.delete(0, cm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public WhiteSplitMultipleFkChild clone() {
        try {
            return (WhiteSplitMultipleFkChild)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CHILD_ID: {PK, NotNull, BIGINT(19)} <br />
     * @return The value of the column 'CHILD_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getChildId() {
        return _childId;
    }

    /**
     * [set] CHILD_ID: {PK, NotNull, BIGINT(19)} <br />
     * @param childId The value of the column 'CHILD_ID'. (basically NotNull if update: for the constraint)
     */
    public void setChildId(Long childId) {
        __modifiedProperties.addPropertyName("childId");
        this._childId = childId;
    }

    /**
     * [get] BASE_ID: {IX, NotNull, BIGINT(19), FK to white_split_multiple_fk_base} <br />
     * @return The value of the column 'BASE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getBaseId() {
        return _baseId;
    }

    /**
     * [set] BASE_ID: {IX, NotNull, BIGINT(19), FK to white_split_multiple_fk_base} <br />
     * @param baseId The value of the column 'BASE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setBaseId(Long baseId) {
        __modifiedProperties.addPropertyName("baseId");
        this._baseId = baseId;
    }

    /**
     * [get] CHILD_NAME: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'CHILD_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getChildName() {
        return _childName;
    }

    /**
     * [set] CHILD_NAME: {NotNull, VARCHAR(200)} <br />
     * @param childName The value of the column 'CHILD_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setChildName(String childName) {
        __modifiedProperties.addPropertyName("childName");
        this._childName = childName;
    }
}
