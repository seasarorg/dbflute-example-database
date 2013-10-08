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
import com.example.dbflute.mysql.dbflute.allcommon.CDef;
import com.example.dbflute.mysql.dbflute.exentity.*;

/**
 * The entity of WHITE_DEPRECATED_CLS_ELEMENT as TABLE. <br />
 * <pre>
 * [primary-key]
 *     DEPRECATED_CLS_ELEMENT_CODE
 * 
 * [column]
 *     DEPRECATED_CLS_ELEMENT_CODE, DEPRECATED_CLS_ELEMENT_NAME
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
 * String deprecatedClsElementCode = entity.getDeprecatedClsElementCode();
 * String deprecatedClsElementName = entity.getDeprecatedClsElementName();
 * entity.setDeprecatedClsElementCode(deprecatedClsElementCode);
 * entity.setDeprecatedClsElementName(deprecatedClsElementName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteDeprecatedClsElement implements Entity, Serializable, Cloneable {

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
    /** DEPRECATED_CLS_ELEMENT_CODE: {PK, NotNull, CHAR(3), classification=DeprecatedMapCollaborationType} */
    protected String _deprecatedClsElementCode;

    /** DEPRECATED_CLS_ELEMENT_NAME: {VARCHAR(20)} */
    protected String _deprecatedClsElementName;

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
        return "white_deprecated_cls_element";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteDeprecatedClsElement";
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
        if (getDeprecatedClsElementCode() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of deprecatedClsElementCode as the classification of DeprecatedMapCollaborationType. <br />
     * DEPRECATED_CLS_ELEMENT_CODE: {PK, NotNull, CHAR(3), classification=DeprecatedMapCollaborationType} <br />
     * has deprecated element
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.DeprecatedMapCollaborationType getDeprecatedClsElementCodeAsDeprecatedMapCollaborationType() {
        return CDef.DeprecatedMapCollaborationType.codeOf(getDeprecatedClsElementCode());
    }

    /**
     * Set the value of deprecatedClsElementCode as the classification of DeprecatedMapCollaborationType. <br />
     * DEPRECATED_CLS_ELEMENT_CODE: {PK, NotNull, CHAR(3), classification=DeprecatedMapCollaborationType} <br />
     * has deprecated element
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setDeprecatedClsElementCodeAsDeprecatedMapCollaborationType(CDef.DeprecatedMapCollaborationType cdef) {
        setDeprecatedClsElementCode(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of deprecatedClsElementCode as FooName (FOO). <br />
     * FooName
     */
    public void setDeprecatedClsElementCode_FooName() {
        setDeprecatedClsElementCodeAsDeprecatedMapCollaborationType(CDef.DeprecatedMapCollaborationType.FooName);
    }

    /**
     * Set the value of deprecatedClsElementCode as BarName (BAR). <br />
     * BarName: here here (deprecated: test of deprecated)
     */
    @Deprecated
    public void setDeprecatedClsElementCode_BarName() {
        setDeprecatedClsElementCodeAsDeprecatedMapCollaborationType(CDef.DeprecatedMapCollaborationType.BarName);
    }

    /**
     * Set the value of deprecatedClsElementCode as QuxName (QUX). <br />
     * QuxName: (deprecated: no original comment)
     */
    @Deprecated
    public void setDeprecatedClsElementCode_QuxName() {
        setDeprecatedClsElementCodeAsDeprecatedMapCollaborationType(CDef.DeprecatedMapCollaborationType.QuxName);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of deprecatedClsElementCode FooName? <br />
     * FooName
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDeprecatedClsElementCodeFooName() {
        CDef.DeprecatedMapCollaborationType cdef = getDeprecatedClsElementCodeAsDeprecatedMapCollaborationType();
        return cdef != null ? cdef.equals(CDef.DeprecatedMapCollaborationType.FooName) : false;
    }

    /**
     * Is the value of deprecatedClsElementCode BarName? <br />
     * BarName: here here (deprecated: test of deprecated)
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    @Deprecated
    public boolean isDeprecatedClsElementCodeBarName() {
        CDef.DeprecatedMapCollaborationType cdef = getDeprecatedClsElementCodeAsDeprecatedMapCollaborationType();
        return cdef != null ? cdef.equals(CDef.DeprecatedMapCollaborationType.BarName) : false;
    }

    /**
     * Is the value of deprecatedClsElementCode QuxName? <br />
     * QuxName: (deprecated: no original comment)
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    @Deprecated
    public boolean isDeprecatedClsElementCodeQuxName() {
        CDef.DeprecatedMapCollaborationType cdef = getDeprecatedClsElementCodeAsDeprecatedMapCollaborationType();
        return cdef != null ? cdef.equals(CDef.DeprecatedMapCollaborationType.QuxName) : false;
    }

    /**
     * contains deprecated element here <br />
     * The group elements:[FooName, BarName]
     * @return The determination, true or false.
     */
    public boolean isDeprecatedClsElementCode_ContainsDeprecated() {
        CDef.DeprecatedMapCollaborationType cdef = getDeprecatedClsElementCodeAsDeprecatedMapCollaborationType();
        return cdef != null && cdef.isContainsDeprecated();
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'deprecatedClsElementCode' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getDeprecatedClsElementCodeName() {
        CDef.DeprecatedMapCollaborationType cdef = getDeprecatedClsElementCodeAsDeprecatedMapCollaborationType();
        return cdef != null ? cdef.name() : null;
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
        if (other == null || !(other instanceof BsWhiteDeprecatedClsElement)) { return false; }
        BsWhiteDeprecatedClsElement otherEntity = (BsWhiteDeprecatedClsElement)other;
        if (!xSV(getDeprecatedClsElementCode(), otherEntity.getDeprecatedClsElementCode())) { return false; }
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
        result = xCH(result, getDeprecatedClsElementCode());
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
        sb.append(delimiter).append(getDeprecatedClsElementCode());
        sb.append(delimiter).append(getDeprecatedClsElementName());
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
    public WhiteDeprecatedClsElement clone() {
        try {
            return (WhiteDeprecatedClsElement)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] DEPRECATED_CLS_ELEMENT_CODE: {PK, NotNull, CHAR(3), classification=DeprecatedMapCollaborationType} <br />
     * @return The value of the column 'DEPRECATED_CLS_ELEMENT_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getDeprecatedClsElementCode() {
        return _deprecatedClsElementCode;
    }

    /**
     * [set] DEPRECATED_CLS_ELEMENT_CODE: {PK, NotNull, CHAR(3), classification=DeprecatedMapCollaborationType} <br />
     * @param deprecatedClsElementCode The value of the column 'DEPRECATED_CLS_ELEMENT_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setDeprecatedClsElementCode(String deprecatedClsElementCode) {
        checkImplicitSet("DEPRECATED_CLS_ELEMENT_CODE", CDef.DefMeta.DeprecatedMapCollaborationType, deprecatedClsElementCode);
        __modifiedProperties.addPropertyName("deprecatedClsElementCode");
        this._deprecatedClsElementCode = deprecatedClsElementCode;
    }

    /**
     * [get] DEPRECATED_CLS_ELEMENT_NAME: {VARCHAR(20)} <br />
     * @return The value of the column 'DEPRECATED_CLS_ELEMENT_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getDeprecatedClsElementName() {
        return _deprecatedClsElementName;
    }

    /**
     * [set] DEPRECATED_CLS_ELEMENT_NAME: {VARCHAR(20)} <br />
     * @param deprecatedClsElementName The value of the column 'DEPRECATED_CLS_ELEMENT_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeprecatedClsElementName(String deprecatedClsElementName) {
        __modifiedProperties.addPropertyName("deprecatedClsElementName");
        this._deprecatedClsElementName = deprecatedClsElementName;
    }

    protected void checkImplicitSet(String columnDbName, CDef.DefMeta meta, Object value) {
        InternalUtil.checkImplicitSet(this, columnDbName, meta, value);
    }
}
