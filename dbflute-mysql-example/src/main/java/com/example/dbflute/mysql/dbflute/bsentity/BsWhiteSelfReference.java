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
 * The entity of WHITE_SELF_REFERENCE as TABLE. <br />
 * <pre>
 * [primary-key]
 *     SELF_REFERENCE_ID
 * 
 * [column]
 *     SELF_REFERENCE_ID, SELF_REFERENCE_NAME, PARENT_ID
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
 *     white_self_reference, white_self_reference_ref_one(ByParentId)
 * 
 * [referrer table]
 *     white_self_reference, white_self_reference_ref_one
 * 
 * [foreign property]
 *     whiteSelfReferenceSelf, whiteSelfReferenceRefOneByParentId, whiteSelfReferenceRefOneAsOne
 * 
 * [referrer property]
 *     whiteSelfReferenceSelfList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long selfReferenceId = entity.getSelfReferenceId();
 * String selfReferenceName = entity.getSelfReferenceName();
 * Long parentId = entity.getParentId();
 * entity.setSelfReferenceId(selfReferenceId);
 * entity.setSelfReferenceName(selfReferenceName);
 * entity.setParentId(parentId);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteSelfReference implements Entity, Serializable, Cloneable {

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
    /** SELF_REFERENCE_ID: {PK, NotNull, DECIMAL(16)} */
    protected Long _selfReferenceId;

    /** SELF_REFERENCE_NAME: {NotNull, VARCHAR(200)} */
    protected String _selfReferenceName;

    /** PARENT_ID: {IX, DECIMAL(16), FK to white_self_reference} */
    protected Long _parentId;

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
        return "white_self_reference";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteSelfReference";
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
    /** white_self_reference by my PARENT_ID, named 'whiteSelfReferenceSelf'. */
    protected WhiteSelfReference _whiteSelfReferenceSelf;

    /**
     * [get] white_self_reference by my PARENT_ID, named 'whiteSelfReferenceSelf'.
     * @return The entity of foreign property 'whiteSelfReferenceSelf'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteSelfReference getWhiteSelfReferenceSelf() {
        return _whiteSelfReferenceSelf;
    }

    /**
     * [set] white_self_reference by my PARENT_ID, named 'whiteSelfReferenceSelf'.
     * @param whiteSelfReferenceSelf The entity of foreign property 'whiteSelfReferenceSelf'. (NullAllowed)
     */
    public void setWhiteSelfReferenceSelf(WhiteSelfReference whiteSelfReferenceSelf) {
        _whiteSelfReferenceSelf = whiteSelfReferenceSelf;
    }

    /** white_self_reference_ref_one by my PARENT_ID, named 'whiteSelfReferenceRefOneByParentId'. */
    protected WhiteSelfReferenceRefOne _whiteSelfReferenceRefOneByParentId;

    /**
     * [get] white_self_reference_ref_one by my PARENT_ID, named 'whiteSelfReferenceRefOneByParentId'. <br />
     * Implicit Reverse FK to FK_WHITE_SELF_REFERENCE_REF_ONE_DIRECT_PARENT
     * @return The entity of foreign property 'whiteSelfReferenceRefOneByParentId'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteSelfReferenceRefOne getWhiteSelfReferenceRefOneByParentId() {
        return _whiteSelfReferenceRefOneByParentId;
    }

    /**
     * [set] white_self_reference_ref_one by my PARENT_ID, named 'whiteSelfReferenceRefOneByParentId'. <br />
     * Implicit Reverse FK to FK_WHITE_SELF_REFERENCE_REF_ONE_DIRECT_PARENT
     * @param whiteSelfReferenceRefOneByParentId The entity of foreign property 'whiteSelfReferenceRefOneByParentId'. (NullAllowed)
     */
    public void setWhiteSelfReferenceRefOneByParentId(WhiteSelfReferenceRefOne whiteSelfReferenceRefOneByParentId) {
        _whiteSelfReferenceRefOneByParentId = whiteSelfReferenceRefOneByParentId;
    }

    /** white_self_reference_ref_one by SELF_REFERENCE_ID, named 'whiteSelfReferenceRefOneAsOne'. */
    protected WhiteSelfReferenceRefOne _whiteSelfReferenceRefOneAsOne;

    /**
     * [get] white_self_reference_ref_one by SELF_REFERENCE_ID, named 'whiteSelfReferenceRefOneAsOne'.
     * @return the entity of foreign property(referrer-as-one) 'whiteSelfReferenceRefOneAsOne'. (NullAllowed: when e.g. no data, no setupSelect)
     */
    public WhiteSelfReferenceRefOne getWhiteSelfReferenceRefOneAsOne() {
        return _whiteSelfReferenceRefOneAsOne;
    }

    /**
     * [set] white_self_reference_ref_one by SELF_REFERENCE_ID, named 'whiteSelfReferenceRefOneAsOne'.
     * @param whiteSelfReferenceRefOneAsOne The entity of foreign property(referrer-as-one) 'whiteSelfReferenceRefOneAsOne'. (NullAllowed)
     */
    public void setWhiteSelfReferenceRefOneAsOne(WhiteSelfReferenceRefOne whiteSelfReferenceRefOneAsOne) {
        _whiteSelfReferenceRefOneAsOne = whiteSelfReferenceRefOneAsOne;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** white_self_reference by PARENT_ID, named 'whiteSelfReferenceSelfList'. */
    protected List<WhiteSelfReference> _whiteSelfReferenceSelfList;

    /**
     * [get] white_self_reference by PARENT_ID, named 'whiteSelfReferenceSelfList'.
     * @return The entity list of referrer property 'whiteSelfReferenceSelfList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteSelfReference> getWhiteSelfReferenceSelfList() {
        if (_whiteSelfReferenceSelfList == null) { _whiteSelfReferenceSelfList = newReferrerList(); }
        return _whiteSelfReferenceSelfList;
    }

    /**
     * [set] white_self_reference by PARENT_ID, named 'whiteSelfReferenceSelfList'.
     * @param whiteSelfReferenceSelfList The entity list of referrer property 'whiteSelfReferenceSelfList'. (NullAllowed)
     */
    public void setWhiteSelfReferenceSelfList(List<WhiteSelfReference> whiteSelfReferenceSelfList) {
        _whiteSelfReferenceSelfList = whiteSelfReferenceSelfList;
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
        if (obj == null || !(obj instanceof BsWhiteSelfReference)) { return false; }
        BsWhiteSelfReference other = (BsWhiteSelfReference)obj;
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
        if (_whiteSelfReferenceSelf != null)
        { sb.append(li).append(xbRDS(_whiteSelfReferenceSelf, "whiteSelfReferenceSelf")); }
        if (_whiteSelfReferenceRefOneByParentId != null)
        { sb.append(li).append(xbRDS(_whiteSelfReferenceRefOneByParentId, "whiteSelfReferenceRefOneByParentId")); }
        if (_whiteSelfReferenceRefOneAsOne != null)
        { sb.append(li).append(xbRDS(_whiteSelfReferenceRefOneAsOne, "whiteSelfReferenceRefOneAsOne")); }
        if (_whiteSelfReferenceSelfList != null) { for (Entity et : _whiteSelfReferenceSelfList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whiteSelfReferenceSelfList")); } } }
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
        sb.append(dm).append(getSelfReferenceName());
        sb.append(dm).append(getParentId());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String cm = ",";
        if (_whiteSelfReferenceSelf != null) { sb.append(cm).append("whiteSelfReferenceSelf"); }
        if (_whiteSelfReferenceRefOneByParentId != null) { sb.append(cm).append("whiteSelfReferenceRefOneByParentId"); }
        if (_whiteSelfReferenceRefOneAsOne != null) { sb.append(cm).append("whiteSelfReferenceRefOneAsOne"); }
        if (_whiteSelfReferenceSelfList != null && !_whiteSelfReferenceSelfList.isEmpty())
        { sb.append(cm).append("whiteSelfReferenceSelfList"); }
        if (sb.length() > cm.length()) {
            sb.delete(0, cm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public WhiteSelfReference clone() {
        try {
            return (WhiteSelfReference)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SELF_REFERENCE_ID: {PK, NotNull, DECIMAL(16)} <br />
     * @return The value of the column 'SELF_REFERENCE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getSelfReferenceId() {
        return _selfReferenceId;
    }

    /**
     * [set] SELF_REFERENCE_ID: {PK, NotNull, DECIMAL(16)} <br />
     * @param selfReferenceId The value of the column 'SELF_REFERENCE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setSelfReferenceId(Long selfReferenceId) {
        __modifiedProperties.addPropertyName("selfReferenceId");
        _selfReferenceId = selfReferenceId;
    }

    /**
     * [get] SELF_REFERENCE_NAME: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'SELF_REFERENCE_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getSelfReferenceName() {
        return _selfReferenceName;
    }

    /**
     * [set] SELF_REFERENCE_NAME: {NotNull, VARCHAR(200)} <br />
     * @param selfReferenceName The value of the column 'SELF_REFERENCE_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setSelfReferenceName(String selfReferenceName) {
        __modifiedProperties.addPropertyName("selfReferenceName");
        _selfReferenceName = selfReferenceName;
    }

    /**
     * [get] PARENT_ID: {IX, DECIMAL(16), FK to white_self_reference} <br />
     * @return The value of the column 'PARENT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getParentId() {
        return _parentId;
    }

    /**
     * [set] PARENT_ID: {IX, DECIMAL(16), FK to white_self_reference} <br />
     * @param parentId The value of the column 'PARENT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setParentId(Long parentId) {
        __modifiedProperties.addPropertyName("parentId");
        _parentId = parentId;
    }
}
