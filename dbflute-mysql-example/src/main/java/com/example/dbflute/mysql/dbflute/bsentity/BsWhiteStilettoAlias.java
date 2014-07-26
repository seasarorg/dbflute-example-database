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
 * The entity of WHITE_STILETTO_ALIAS as TABLE. <br />
 * <pre>
 * [primary-key]
 *     STILETTO_ALIAS_ID
 * 
 * [column]
 *     STILETTO_ALIAS_ID, FOO, FOO_0, FOO_1, FOO2, FOO_3, FOO4, BAR, QUX
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
 *     white_stiletto_alias_ref
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     whiteStilettoAliasRefList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer stilettoAliasId = entity.getStilettoAliasId();
 * String foo = entity.getFoo();
 * String foo0 = entity.getFoo0();
 * String foo1 = entity.getFoo1();
 * String foo2 = entity.getFoo2();
 * String foo3 = entity.getFoo3();
 * String foo4 = entity.getFoo4();
 * String bar = entity.getBar();
 * String qux = entity.getQux();
 * entity.setStilettoAliasId(stilettoAliasId);
 * entity.setFoo(foo);
 * entity.setFoo0(foo0);
 * entity.setFoo1(foo1);
 * entity.setFoo2(foo2);
 * entity.setFoo3(foo3);
 * entity.setFoo4(foo4);
 * entity.setBar(bar);
 * entity.setQux(qux);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteStilettoAlias implements Entity, Serializable, Cloneable {

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
    /** STILETTO_ALIAS_ID: {PK, NotNull, INT(10)} */
    protected Integer _stilettoAliasId;

    /** FOO: {VARCHAR(200)} */
    protected String _foo;

    /** FOO_0: {VARCHAR(200)} */
    protected String _foo0;

    /** FOO_1: {VARCHAR(200)} */
    protected String _foo1;

    /** FOO2: {VARCHAR(200)} */
    protected String _foo2;

    /** FOO_3: {VARCHAR(200)} */
    protected String _foo3;

    /** FOO4: {VARCHAR(200)} */
    protected String _foo4;

    /** BAR: {VARCHAR(200)} */
    protected String _bar;

    /** QUX: {VARCHAR(200)} */
    protected String _qux;

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
        return "white_stiletto_alias";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteStilettoAlias";
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
        if (getStilettoAliasId() == null) { return false; }
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
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** white_stiletto_alias_ref by STILETTO_ALIAS_ID, named 'whiteStilettoAliasRefList'. */
    protected List<WhiteStilettoAliasRef> _whiteStilettoAliasRefList;

    /**
     * [get] white_stiletto_alias_ref by STILETTO_ALIAS_ID, named 'whiteStilettoAliasRefList'.
     * @return The entity list of referrer property 'whiteStilettoAliasRefList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteStilettoAliasRef> getWhiteStilettoAliasRefList() {
        if (_whiteStilettoAliasRefList == null) { _whiteStilettoAliasRefList = newReferrerList(); }
        return _whiteStilettoAliasRefList;
    }

    /**
     * [set] white_stiletto_alias_ref by STILETTO_ALIAS_ID, named 'whiteStilettoAliasRefList'.
     * @param whiteStilettoAliasRefList The entity list of referrer property 'whiteStilettoAliasRefList'. (NullAllowed)
     */
    public void setWhiteStilettoAliasRefList(List<WhiteStilettoAliasRef> whiteStilettoAliasRefList) {
        _whiteStilettoAliasRefList = whiteStilettoAliasRefList;
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
        if (obj == null || !(obj instanceof BsWhiteStilettoAlias)) { return false; }
        BsWhiteStilettoAlias other = (BsWhiteStilettoAlias)obj;
        if (!xSV(getStilettoAliasId(), other.getStilettoAliasId())) { return false; }
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
        hs = xCH(hs, getStilettoAliasId());
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
        if (_whiteStilettoAliasRefList != null) { for (Entity et : _whiteStilettoAliasRefList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whiteStilettoAliasRefList")); } } }
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
        sb.append(dm).append(getStilettoAliasId());
        sb.append(dm).append(getFoo());
        sb.append(dm).append(getFoo0());
        sb.append(dm).append(getFoo1());
        sb.append(dm).append(getFoo2());
        sb.append(dm).append(getFoo3());
        sb.append(dm).append(getFoo4());
        sb.append(dm).append(getBar());
        sb.append(dm).append(getQux());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String cm = ",";
        if (_whiteStilettoAliasRefList != null && !_whiteStilettoAliasRefList.isEmpty())
        { sb.append(cm).append("whiteStilettoAliasRefList"); }
        if (sb.length() > cm.length()) {
            sb.delete(0, cm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public WhiteStilettoAlias clone() {
        try {
            return (WhiteStilettoAlias)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] STILETTO_ALIAS_ID: {PK, NotNull, INT(10)} <br />
     * @return The value of the column 'STILETTO_ALIAS_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getStilettoAliasId() {
        return _stilettoAliasId;
    }

    /**
     * [set] STILETTO_ALIAS_ID: {PK, NotNull, INT(10)} <br />
     * @param stilettoAliasId The value of the column 'STILETTO_ALIAS_ID'. (basically NotNull if update: for the constraint)
     */
    public void setStilettoAliasId(Integer stilettoAliasId) {
        __modifiedProperties.addPropertyName("stilettoAliasId");
        _stilettoAliasId = stilettoAliasId;
    }

    /**
     * [get] FOO: {VARCHAR(200)} <br />
     * @return The value of the column 'FOO'. (NullAllowed even if selected: for no constraint)
     */
    public String getFoo() {
        return _foo;
    }

    /**
     * [set] FOO: {VARCHAR(200)} <br />
     * @param foo The value of the column 'FOO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFoo(String foo) {
        __modifiedProperties.addPropertyName("foo");
        _foo = foo;
    }

    /**
     * [get] FOO_0: {VARCHAR(200)} <br />
     * @return The value of the column 'FOO_0'. (NullAllowed even if selected: for no constraint)
     */
    public String getFoo0() {
        return _foo0;
    }

    /**
     * [set] FOO_0: {VARCHAR(200)} <br />
     * @param foo0 The value of the column 'FOO_0'. (NullAllowed: null update allowed for no constraint)
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
     * [get] FOO_3: {VARCHAR(200)} <br />
     * @return The value of the column 'FOO_3'. (NullAllowed even if selected: for no constraint)
     */
    public String getFoo3() {
        return _foo3;
    }

    /**
     * [set] FOO_3: {VARCHAR(200)} <br />
     * @param foo3 The value of the column 'FOO_3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFoo3(String foo3) {
        __modifiedProperties.addPropertyName("foo3");
        _foo3 = foo3;
    }

    /**
     * [get] FOO4: {VARCHAR(200)} <br />
     * @return The value of the column 'FOO4'. (NullAllowed even if selected: for no constraint)
     */
    public String getFoo4() {
        return _foo4;
    }

    /**
     * [set] FOO4: {VARCHAR(200)} <br />
     * @param foo4 The value of the column 'FOO4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFoo4(String foo4) {
        __modifiedProperties.addPropertyName("foo4");
        _foo4 = foo4;
    }

    /**
     * [get] BAR: {VARCHAR(200)} <br />
     * @return The value of the column 'BAR'. (NullAllowed even if selected: for no constraint)
     */
    public String getBar() {
        return _bar;
    }

    /**
     * [set] BAR: {VARCHAR(200)} <br />
     * @param bar The value of the column 'BAR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBar(String bar) {
        __modifiedProperties.addPropertyName("bar");
        _bar = bar;
    }

    /**
     * [get] QUX: {VARCHAR(200)} <br />
     * @return The value of the column 'QUX'. (NullAllowed even if selected: for no constraint)
     */
    public String getQux() {
        return _qux;
    }

    /**
     * [set] QUX: {VARCHAR(200)} <br />
     * @param qux The value of the column 'QUX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setQux(String qux) {
        __modifiedProperties.addPropertyName("qux");
        _qux = qux;
    }
}
