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
 * The entity of VENDOR_CONSTRAINT_NAME_AUTO_REF as TABLE. <br />
 * <pre>
 * [primary-key]
 *     CONSTRAINT_NAME_AUTO_REF_ID
 * 
 * [column]
 *     CONSTRAINT_NAME_AUTO_REF_ID, CONSTRAINT_NAME_AUTO_FOO_ID, CONSTRAINT_NAME_AUTO_BAR_ID, CONSTRAINT_NAME_AUTO_QUX_ID, CONSTRAINT_NAME_AUTO_CORGE_ID, CONSTRAINT_NAME_AUTO_UNIQUE
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
 *     vendor_constraint_name_auto_foo, vendor_constraint_name_auto_bar, vendor_constraint_name_auto_qux
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     vendorConstraintNameAutoFoo, vendorConstraintNameAutoBar, vendorConstraintNameAutoQux
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long constraintNameAutoRefId = entity.getConstraintNameAutoRefId();
 * Long constraintNameAutoFooId = entity.getConstraintNameAutoFooId();
 * Long constraintNameAutoBarId = entity.getConstraintNameAutoBarId();
 * Long constraintNameAutoQuxId = entity.getConstraintNameAutoQuxId();
 * Long constraintNameAutoCorgeId = entity.getConstraintNameAutoCorgeId();
 * String constraintNameAutoUnique = entity.getConstraintNameAutoUnique();
 * entity.setConstraintNameAutoRefId(constraintNameAutoRefId);
 * entity.setConstraintNameAutoFooId(constraintNameAutoFooId);
 * entity.setConstraintNameAutoBarId(constraintNameAutoBarId);
 * entity.setConstraintNameAutoQuxId(constraintNameAutoQuxId);
 * entity.setConstraintNameAutoCorgeId(constraintNameAutoCorgeId);
 * entity.setConstraintNameAutoUnique(constraintNameAutoUnique);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsVendorConstraintNameAutoRef implements Entity, Serializable, Cloneable {

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
    /** CONSTRAINT_NAME_AUTO_REF_ID: {PK, NotNull, DECIMAL(16)} */
    protected Long _constraintNameAutoRefId;

    /** CONSTRAINT_NAME_AUTO_FOO_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_foo} */
    protected Long _constraintNameAutoFooId;

    /** CONSTRAINT_NAME_AUTO_BAR_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_bar} */
    protected Long _constraintNameAutoBarId;

    /** CONSTRAINT_NAME_AUTO_QUX_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_qux} */
    protected Long _constraintNameAutoQuxId;

    /** CONSTRAINT_NAME_AUTO_CORGE_ID: {NotNull, DECIMAL(16)} */
    protected Long _constraintNameAutoCorgeId;

    /** CONSTRAINT_NAME_AUTO_UNIQUE: {UQ, NotNull, VARCHAR(50)} */
    protected String _constraintNameAutoUnique;

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
        return "vendor_constraint_name_auto_ref";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "vendorConstraintNameAutoRef";
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
        if (getConstraintNameAutoRefId() == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br />
     * You can update the entity by the key when entity update (NOT batch update).
     * @param constraintNameAutoUnique : UQ, NotNull, VARCHAR(50). (NotNull)
     */
    public void uniqueBy(String constraintNameAutoUnique) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("constraintNameAutoUnique");
        _constraintNameAutoUnique = constraintNameAutoUnique;
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
    /** vendor_constraint_name_auto_foo by my CONSTRAINT_NAME_AUTO_FOO_ID, named 'vendorConstraintNameAutoFoo'. */
    protected VendorConstraintNameAutoFoo _vendorConstraintNameAutoFoo;

    /**
     * vendor_constraint_name_auto_foo by my CONSTRAINT_NAME_AUTO_FOO_ID, named 'vendorConstraintNameAutoFoo'.
     * @return The entity of foreign property 'vendorConstraintNameAutoFoo'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public VendorConstraintNameAutoFoo getVendorConstraintNameAutoFoo() {
        return _vendorConstraintNameAutoFoo;
    }

    /**
     * vendor_constraint_name_auto_foo by my CONSTRAINT_NAME_AUTO_FOO_ID, named 'vendorConstraintNameAutoFoo'.
     * @param vendorConstraintNameAutoFoo The entity of foreign property 'vendorConstraintNameAutoFoo'. (NullAllowed)
     */
    public void setVendorConstraintNameAutoFoo(VendorConstraintNameAutoFoo vendorConstraintNameAutoFoo) {
        _vendorConstraintNameAutoFoo = vendorConstraintNameAutoFoo;
    }

    /** vendor_constraint_name_auto_bar by my CONSTRAINT_NAME_AUTO_BAR_ID, named 'vendorConstraintNameAutoBar'. */
    protected VendorConstraintNameAutoBar _vendorConstraintNameAutoBar;

    /**
     * vendor_constraint_name_auto_bar by my CONSTRAINT_NAME_AUTO_BAR_ID, named 'vendorConstraintNameAutoBar'.
     * @return The entity of foreign property 'vendorConstraintNameAutoBar'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public VendorConstraintNameAutoBar getVendorConstraintNameAutoBar() {
        return _vendorConstraintNameAutoBar;
    }

    /**
     * vendor_constraint_name_auto_bar by my CONSTRAINT_NAME_AUTO_BAR_ID, named 'vendorConstraintNameAutoBar'.
     * @param vendorConstraintNameAutoBar The entity of foreign property 'vendorConstraintNameAutoBar'. (NullAllowed)
     */
    public void setVendorConstraintNameAutoBar(VendorConstraintNameAutoBar vendorConstraintNameAutoBar) {
        _vendorConstraintNameAutoBar = vendorConstraintNameAutoBar;
    }

    /** vendor_constraint_name_auto_qux by my CONSTRAINT_NAME_AUTO_QUX_ID, named 'vendorConstraintNameAutoQux'. */
    protected VendorConstraintNameAutoQux _vendorConstraintNameAutoQux;

    /**
     * vendor_constraint_name_auto_qux by my CONSTRAINT_NAME_AUTO_QUX_ID, named 'vendorConstraintNameAutoQux'.
     * @return The entity of foreign property 'vendorConstraintNameAutoQux'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public VendorConstraintNameAutoQux getVendorConstraintNameAutoQux() {
        return _vendorConstraintNameAutoQux;
    }

    /**
     * vendor_constraint_name_auto_qux by my CONSTRAINT_NAME_AUTO_QUX_ID, named 'vendorConstraintNameAutoQux'.
     * @param vendorConstraintNameAutoQux The entity of foreign property 'vendorConstraintNameAutoQux'. (NullAllowed)
     */
    public void setVendorConstraintNameAutoQux(VendorConstraintNameAutoQux vendorConstraintNameAutoQux) {
        _vendorConstraintNameAutoQux = vendorConstraintNameAutoQux;
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
        if (obj == null || !(obj instanceof BsVendorConstraintNameAutoRef)) { return false; }
        BsVendorConstraintNameAutoRef other = (BsVendorConstraintNameAutoRef)obj;
        if (!xSV(getConstraintNameAutoRefId(), other.getConstraintNameAutoRefId())) { return false; }
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
        hs = xCH(hs, getConstraintNameAutoRefId());
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
        if (_vendorConstraintNameAutoFoo != null)
        { sb.append(li).append(xbRDS(_vendorConstraintNameAutoFoo, "vendorConstraintNameAutoFoo")); }
        if (_vendorConstraintNameAutoBar != null)
        { sb.append(li).append(xbRDS(_vendorConstraintNameAutoBar, "vendorConstraintNameAutoBar")); }
        if (_vendorConstraintNameAutoQux != null)
        { sb.append(li).append(xbRDS(_vendorConstraintNameAutoQux, "vendorConstraintNameAutoQux")); }
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
        sb.append(dm).append(getConstraintNameAutoRefId());
        sb.append(dm).append(getConstraintNameAutoFooId());
        sb.append(dm).append(getConstraintNameAutoBarId());
        sb.append(dm).append(getConstraintNameAutoQuxId());
        sb.append(dm).append(getConstraintNameAutoCorgeId());
        sb.append(dm).append(getConstraintNameAutoUnique());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String cm = ",";
        if (_vendorConstraintNameAutoFoo != null) { sb.append(cm).append("vendorConstraintNameAutoFoo"); }
        if (_vendorConstraintNameAutoBar != null) { sb.append(cm).append("vendorConstraintNameAutoBar"); }
        if (_vendorConstraintNameAutoQux != null) { sb.append(cm).append("vendorConstraintNameAutoQux"); }
        if (sb.length() > cm.length()) {
            sb.delete(0, cm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public VendorConstraintNameAutoRef clone() {
        try {
            return (VendorConstraintNameAutoRef)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CONSTRAINT_NAME_AUTO_REF_ID: {PK, NotNull, DECIMAL(16)} <br />
     * @return The value of the column 'CONSTRAINT_NAME_AUTO_REF_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getConstraintNameAutoRefId() {
        return _constraintNameAutoRefId;
    }

    /**
     * [set] CONSTRAINT_NAME_AUTO_REF_ID: {PK, NotNull, DECIMAL(16)} <br />
     * @param constraintNameAutoRefId The value of the column 'CONSTRAINT_NAME_AUTO_REF_ID'. (basically NotNull if update: for the constraint)
     */
    public void setConstraintNameAutoRefId(Long constraintNameAutoRefId) {
        __modifiedProperties.addPropertyName("constraintNameAutoRefId");
        this._constraintNameAutoRefId = constraintNameAutoRefId;
    }

    /**
     * [get] CONSTRAINT_NAME_AUTO_FOO_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_foo} <br />
     * @return The value of the column 'CONSTRAINT_NAME_AUTO_FOO_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getConstraintNameAutoFooId() {
        return _constraintNameAutoFooId;
    }

    /**
     * [set] CONSTRAINT_NAME_AUTO_FOO_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_foo} <br />
     * @param constraintNameAutoFooId The value of the column 'CONSTRAINT_NAME_AUTO_FOO_ID'. (basically NotNull if update: for the constraint)
     */
    public void setConstraintNameAutoFooId(Long constraintNameAutoFooId) {
        __modifiedProperties.addPropertyName("constraintNameAutoFooId");
        this._constraintNameAutoFooId = constraintNameAutoFooId;
    }

    /**
     * [get] CONSTRAINT_NAME_AUTO_BAR_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_bar} <br />
     * @return The value of the column 'CONSTRAINT_NAME_AUTO_BAR_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getConstraintNameAutoBarId() {
        return _constraintNameAutoBarId;
    }

    /**
     * [set] CONSTRAINT_NAME_AUTO_BAR_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_bar} <br />
     * @param constraintNameAutoBarId The value of the column 'CONSTRAINT_NAME_AUTO_BAR_ID'. (basically NotNull if update: for the constraint)
     */
    public void setConstraintNameAutoBarId(Long constraintNameAutoBarId) {
        __modifiedProperties.addPropertyName("constraintNameAutoBarId");
        this._constraintNameAutoBarId = constraintNameAutoBarId;
    }

    /**
     * [get] CONSTRAINT_NAME_AUTO_QUX_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_qux} <br />
     * @return The value of the column 'CONSTRAINT_NAME_AUTO_QUX_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getConstraintNameAutoQuxId() {
        return _constraintNameAutoQuxId;
    }

    /**
     * [set] CONSTRAINT_NAME_AUTO_QUX_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_qux} <br />
     * @param constraintNameAutoQuxId The value of the column 'CONSTRAINT_NAME_AUTO_QUX_ID'. (basically NotNull if update: for the constraint)
     */
    public void setConstraintNameAutoQuxId(Long constraintNameAutoQuxId) {
        __modifiedProperties.addPropertyName("constraintNameAutoQuxId");
        this._constraintNameAutoQuxId = constraintNameAutoQuxId;
    }

    /**
     * [get] CONSTRAINT_NAME_AUTO_CORGE_ID: {NotNull, DECIMAL(16)} <br />
     * @return The value of the column 'CONSTRAINT_NAME_AUTO_CORGE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getConstraintNameAutoCorgeId() {
        return _constraintNameAutoCorgeId;
    }

    /**
     * [set] CONSTRAINT_NAME_AUTO_CORGE_ID: {NotNull, DECIMAL(16)} <br />
     * @param constraintNameAutoCorgeId The value of the column 'CONSTRAINT_NAME_AUTO_CORGE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setConstraintNameAutoCorgeId(Long constraintNameAutoCorgeId) {
        __modifiedProperties.addPropertyName("constraintNameAutoCorgeId");
        this._constraintNameAutoCorgeId = constraintNameAutoCorgeId;
    }

    /**
     * [get] CONSTRAINT_NAME_AUTO_UNIQUE: {UQ, NotNull, VARCHAR(50)} <br />
     * @return The value of the column 'CONSTRAINT_NAME_AUTO_UNIQUE'. (basically NotNull if selected: for the constraint)
     */
    public String getConstraintNameAutoUnique() {
        return _constraintNameAutoUnique;
    }

    /**
     * [set] CONSTRAINT_NAME_AUTO_UNIQUE: {UQ, NotNull, VARCHAR(50)} <br />
     * @param constraintNameAutoUnique The value of the column 'CONSTRAINT_NAME_AUTO_UNIQUE'. (basically NotNull if update: for the constraint)
     */
    public void setConstraintNameAutoUnique(String constraintNameAutoUnique) {
        __modifiedProperties.addPropertyName("constraintNameAutoUnique");
        this._constraintNameAutoUnique = constraintNameAutoUnique;
    }
}
