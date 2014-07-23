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
 * The entity of WHITE_STILETTO_ALIAS_REF as TABLE. <br />
 * <pre>
 * [primary-key]
 *     REF_ID
 * 
 * [column]
 *     REF_ID, FOO0, FOO_1, FOO2, FOO3, FOO_4, STILETTO_ALIAS_ID
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
 *     white_stiletto_alias
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     whiteStilettoAlias
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer refId = entity.getRefId();
 * String foo0 = entity.getFoo0();
 * String foo1 = entity.getFoo1();
 * String foo2 = entity.getFoo2();
 * String foo3 = entity.getFoo3();
 * String foo4 = entity.getFoo4();
 * Integer stilettoAliasId = entity.getStilettoAliasId();
 * entity.setRefId(refId);
 * entity.setFoo0(foo0);
 * entity.setFoo1(foo1);
 * entity.setFoo2(foo2);
 * entity.setFoo3(foo3);
 * entity.setFoo4(foo4);
 * entity.setStilettoAliasId(stilettoAliasId);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteStilettoAliasRef implements Entity, Serializable, Cloneable {

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
    /** REF_ID: {PK, NotNull, INT(10)} */
    protected Integer _refId;

    /** FOO0: {VARCHAR(200)} */
    protected String _foo0;

    /** FOO_1: {VARCHAR(200)} */
    protected String _foo1;

    /** FOO2: {VARCHAR(200)} */
    protected String _foo2;

    /** FOO3: {VARCHAR(200)} */
    protected String _foo3;

    /** FOO_4: {VARCHAR(200)} */
    protected String _foo4;

    /** STILETTO_ALIAS_ID: {IX, INT(10), FK to white_stiletto_alias} */
    protected Integer _stilettoAliasId;

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
        return "white_stiletto_alias_ref";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteStilettoAliasRef";
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
        if (getRefId() == null) { return false; }
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
    /** white_stiletto_alias by my STILETTO_ALIAS_ID, named 'whiteStilettoAlias'. */
    protected WhiteStilettoAlias _whiteStilettoAlias;

    /**
     * [get] white_stiletto_alias by my STILETTO_ALIAS_ID, named 'whiteStilettoAlias'.
     * @return The entity of foreign property 'whiteStilettoAlias'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteStilettoAlias getWhiteStilettoAlias() {
        return _whiteStilettoAlias;
    }

    /**
     * [set] white_stiletto_alias by my STILETTO_ALIAS_ID, named 'whiteStilettoAlias'.
     * @param whiteStilettoAlias The entity of foreign property 'whiteStilettoAlias'. (NullAllowed)
     */
    public void setWhiteStilettoAlias(WhiteStilettoAlias whiteStilettoAlias) {
        _whiteStilettoAlias = whiteStilettoAlias;
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
        if (obj == null || !(obj instanceof BsWhiteStilettoAliasRef)) { return false; }
        BsWhiteStilettoAliasRef other = (BsWhiteStilettoAliasRef)obj;
        if (!xSV(getRefId(), other.getRefId())) { return false; }
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
        hs = xCH(hs, getRefId());
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
        if (_whiteStilettoAlias != null)
        { sb.append(li).append(xbRDS(_whiteStilettoAlias, "whiteStilettoAlias")); }
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
        sb.append(dm).append(getRefId());
        sb.append(dm).append(getFoo0());
        sb.append(dm).append(getFoo1());
        sb.append(dm).append(getFoo2());
        sb.append(dm).append(getFoo3());
        sb.append(dm).append(getFoo4());
        sb.append(dm).append(getStilettoAliasId());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String cm = ",";
        if (_whiteStilettoAlias != null) { sb.append(cm).append("whiteStilettoAlias"); }
        if (sb.length() > cm.length()) {
            sb.delete(0, cm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public WhiteStilettoAliasRef clone() {
        try {
            return (WhiteStilettoAliasRef)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] REF_ID: {PK, NotNull, INT(10)} <br />
     * @return The value of the column 'REF_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getRefId() {
        return _refId;
    }

    /**
     * [set] REF_ID: {PK, NotNull, INT(10)} <br />
     * @param refId The value of the column 'REF_ID'. (basically NotNull if update: for the constraint)
     */
    public void setRefId(Integer refId) {
        __modifiedProperties.addPropertyName("refId");
        _refId = refId;
    }

    /**
     * [get] FOO0: {VARCHAR(200)} <br />
     * @return The value of the column 'FOO0'. (NullAllowed even if selected: for no constraint)
     */
    public String getFoo0() {
        return _foo0;
    }

    /**
     * [set] FOO0: {VARCHAR(200)} <br />
     * @param foo0 The value of the column 'FOO0'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFoo0(String foo0) {
        __modifiedProperties.addPropertyName("foo0");
        _foo0 = foo0;
    }

    /**
     * [get] FOO_1: {VARCHAR(200)} <br />
     * @return The value of the column 'FOO_1'. (NullAllowed even if selected: for no constraint)
     */
    public String getFoo1() {
        return _foo1;
    }

    /**
     * [set] FOO_1: {VARCHAR(200)} <br />
     * @param foo1 The value of the column 'FOO_1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFoo1(String foo1) {
        __modifiedProperties.addPropertyName("foo1");
        _foo1 = foo1;
    }

    /**
     * [get] FOO2: {VARCHAR(200)} <br />
     * @return The value of the column 'FOO2'. (NullAllowed even if selected: for no constraint)
     */
    public String getFoo2() {
        return _foo2;
    }

    /**
     * [set] FOO2: {VARCHAR(200)} <br />
     * @param foo2 The value of the column 'FOO2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFoo2(String foo2) {
        __modifiedProperties.addPropertyName("foo2");
        _foo2 = foo2;
    }

    /**
     * [get] FOO3: {VARCHAR(200)} <br />
     * @return The value of the column 'FOO3'. (NullAllowed even if selected: for no constraint)
     */
    public String getFoo3() {
        return _foo3;
    }

    /**
     * [set] FOO3: {VARCHAR(200)} <br />
     * @param foo3 The value of the column 'FOO3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFoo3(String foo3) {
        __modifiedProperties.addPropertyName("foo3");
        _foo3 = foo3;
    }

    /**
     * [get] FOO_4: {VARCHAR(200)} <br />
     * @return The value of the column 'FOO_4'. (NullAllowed even if selected: for no constraint)
     */
    public String getFoo4() {
        return _foo4;
    }

    /**
     * [set] FOO_4: {VARCHAR(200)} <br />
     * @param foo4 The value of the column 'FOO_4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFoo4(String foo4) {
        __modifiedProperties.addPropertyName("foo4");
        _foo4 = foo4;
    }

    /**
     * [get] STILETTO_ALIAS_ID: {IX, INT(10), FK to white_stiletto_alias} <br />
     * @return The value of the column 'STILETTO_ALIAS_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getStilettoAliasId() {
        return _stilettoAliasId;
    }

    /**
     * [set] STILETTO_ALIAS_ID: {IX, INT(10), FK to white_stiletto_alias} <br />
     * @param stilettoAliasId The value of the column 'STILETTO_ALIAS_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStilettoAliasId(Integer stilettoAliasId) {
        __modifiedProperties.addPropertyName("stilettoAliasId");
        _stilettoAliasId = stilettoAliasId;
    }
}
