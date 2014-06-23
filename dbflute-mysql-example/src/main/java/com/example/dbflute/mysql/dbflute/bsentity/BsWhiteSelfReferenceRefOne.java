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
 * The entity of WHITE_SELF_REFERENCE_REF_ONE as TABLE. <br />
 * <pre>
 * [primary-key]
 *     SELF_REFERENCE_ID
 * 
 * [column]
 *     SELF_REFERENCE_ID, SELF_REFERENCE_REF_ONE_NAME
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
 *     white_self_reference, WHITE_SELF_REFERENCE(AsDirectParent)
 * 
 * [referrer table]
 *     white_self_reference
 * 
 * [foreign property]
 *     whiteSelfReference, whiteSelfReferenceAsDirectParent
 * 
 * [referrer property]
 *     whiteSelfReferenceByParentIdList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long selfReferenceId = entity.getSelfReferenceId();
 * String selfReferenceRefOneName = entity.getSelfReferenceRefOneName();
 * entity.setSelfReferenceId(selfReferenceId);
 * entity.setSelfReferenceRefOneName(selfReferenceRefOneName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteSelfReferenceRefOne implements Entity, Serializable, Cloneable {

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
    /** SELF_REFERENCE_ID: {PK, NotNull, DECIMAL(16), FK to white_self_reference} */
    protected Long _selfReferenceId;

    /** SELF_REFERENCE_REF_ONE_NAME: {NotNull, VARCHAR(200)} */
    protected String _selfReferenceRefOneName;

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
        return "white_self_reference_ref_one";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteSelfReferenceRefOne";
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
        if (getSelfReferenceId() == null) { return false; }
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
    /** white_self_reference by my SELF_REFERENCE_ID, named 'whiteSelfReference'. */
    protected WhiteSelfReference _whiteSelfReference;

    /**
     * [get] white_self_reference by my SELF_REFERENCE_ID, named 'whiteSelfReference'.
     * @return The entity of foreign property 'whiteSelfReference'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteSelfReference getWhiteSelfReference() {
        return _whiteSelfReference;
    }

    /**
     * [set] white_self_reference by my SELF_REFERENCE_ID, named 'whiteSelfReference'.
     * @param whiteSelfReference The entity of foreign property 'whiteSelfReference'. (NullAllowed)
     */
    public void setWhiteSelfReference(WhiteSelfReference whiteSelfReference) {
        _whiteSelfReference = whiteSelfReference;
    }

    /** white_self_reference by my SELF_REFERENCE_ID, named 'whiteSelfReferenceAsDirectParent'. */
    protected WhiteSelfReference _whiteSelfReferenceAsDirectParent;

    /**
     * [get] white_self_reference by my SELF_REFERENCE_ID, named 'whiteSelfReferenceAsDirectParent'.
     * @return The entity of foreign property 'whiteSelfReferenceAsDirectParent'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteSelfReference getWhiteSelfReferenceAsDirectParent() {
        return _whiteSelfReferenceAsDirectParent;
    }

    /**
     * [set] white_self_reference by my SELF_REFERENCE_ID, named 'whiteSelfReferenceAsDirectParent'.
     * @param whiteSelfReferenceAsDirectParent The entity of foreign property 'whiteSelfReferenceAsDirectParent'. (NullAllowed)
     */
    public void setWhiteSelfReferenceAsDirectParent(WhiteSelfReference whiteSelfReferenceAsDirectParent) {
        _whiteSelfReferenceAsDirectParent = whiteSelfReferenceAsDirectParent;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** white_self_reference by PARENT_ID, named 'whiteSelfReferenceByParentIdList'. */
    protected List<WhiteSelfReference> _whiteSelfReferenceByParentIdList;

    /**
     * [get] white_self_reference by PARENT_ID, named 'whiteSelfReferenceByParentIdList'. <br />
     * This relation is auto-detected as implicit reverse FK.
     * @return The entity list of referrer property 'whiteSelfReferenceByParentIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteSelfReference> getWhiteSelfReferenceByParentIdList() {
        if (_whiteSelfReferenceByParentIdList == null) { _whiteSelfReferenceByParentIdList = newReferrerList(); }
        return _whiteSelfReferenceByParentIdList;
    }

    /**
     * [set] white_self_reference by PARENT_ID, named 'whiteSelfReferenceByParentIdList'. <br />
     * This relation is auto-detected as implicit reverse FK.
     * @param whiteSelfReferenceByParentIdList The entity list of referrer property 'whiteSelfReferenceByParentIdList'. (NullAllowed)
     */
    public void setWhiteSelfReferenceByParentIdList(List<WhiteSelfReference> whiteSelfReferenceByParentIdList) {
        _whiteSelfReferenceByParentIdList = whiteSelfReferenceByParentIdList;
    }

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
        if (obj == null || !(obj instanceof BsWhiteSelfReferenceRefOne)) { return false; }
        BsWhiteSelfReferenceRefOne other = (BsWhiteSelfReferenceRefOne)obj;
        if (!xSV(getSelfReferenceId(), other.getSelfReferenceId())) { return false; }
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
        hs = xCH(hs, getSelfReferenceId());
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
        if (_whiteSelfReference != null)
        { sb.append(li).append(xbRDS(_whiteSelfReference, "whiteSelfReference")); }
        if (_whiteSelfReferenceAsDirectParent != null)
        { sb.append(li).append(xbRDS(_whiteSelfReferenceAsDirectParent, "whiteSelfReferenceAsDirectParent")); }
        if (_whiteSelfReferenceByParentIdList != null) { for (Entity et : _whiteSelfReferenceByParentIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whiteSelfReferenceByParentIdList")); } } }
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
        sb.append(dm).append(getSelfReferenceId());
        sb.append(dm).append(getSelfReferenceRefOneName());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String cm = ",";
        if (_whiteSelfReference != null) { sb.append(cm).append("whiteSelfReference"); }
        if (_whiteSelfReferenceAsDirectParent != null) { sb.append(cm).append("whiteSelfReferenceAsDirectParent"); }
        if (_whiteSelfReferenceByParentIdList != null && !_whiteSelfReferenceByParentIdList.isEmpty())
        { sb.append(cm).append("whiteSelfReferenceByParentIdList"); }
        if (sb.length() > cm.length()) {
            sb.delete(0, cm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public WhiteSelfReferenceRefOne clone() {
        try {
            return (WhiteSelfReferenceRefOne)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SELF_REFERENCE_ID: {PK, NotNull, DECIMAL(16), FK to white_self_reference} <br />
     * @return The value of the column 'SELF_REFERENCE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getSelfReferenceId() {
        return _selfReferenceId;
    }

    /**
     * [set] SELF_REFERENCE_ID: {PK, NotNull, DECIMAL(16), FK to white_self_reference} <br />
     * @param selfReferenceId The value of the column 'SELF_REFERENCE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setSelfReferenceId(Long selfReferenceId) {
        __modifiedProperties.addPropertyName("selfReferenceId");
        _selfReferenceId = selfReferenceId;
    }

    /**
     * [get] SELF_REFERENCE_REF_ONE_NAME: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'SELF_REFERENCE_REF_ONE_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getSelfReferenceRefOneName() {
        return _selfReferenceRefOneName;
    }

    /**
     * [set] SELF_REFERENCE_REF_ONE_NAME: {NotNull, VARCHAR(200)} <br />
     * @param selfReferenceRefOneName The value of the column 'SELF_REFERENCE_REF_ONE_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setSelfReferenceRefOneName(String selfReferenceRefOneName) {
        __modifiedProperties.addPropertyName("selfReferenceRefOneName");
        _selfReferenceRefOneName = selfReferenceRefOneName;
    }
}
