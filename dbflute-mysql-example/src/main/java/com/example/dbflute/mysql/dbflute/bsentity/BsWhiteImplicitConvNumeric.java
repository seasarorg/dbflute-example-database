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
 * The entity of WHITE_IMPLICIT_CONV_NUMERIC as TABLE. <br />
 * <pre>
 * [primary-key]
 *     IMPLICIT_CONV_NUMERIC_ID
 * 
 * [column]
 *     IMPLICIT_CONV_NUMERIC_ID, IMPLICIT_CONV_INTEGER_ID, IMPLICIT_CONV_STRING_ID, IMPLICIT_CONV_NAME
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
 *     WHITE_IMPLICIT_CONV_INTEGER, WHITE_IMPLICIT_CONV_STRING
 * 
 * [referrer table]
 *     white_implicit_conv_integer, white_implicit_conv_string
 * 
 * [foreign property]
 *     whiteImplicitConvInteger, whiteImplicitConvString
 * 
 * [referrer property]
 *     whiteImplicitConvIntegerList, whiteImplicitConvStringList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * java.math.BigDecimal implicitConvNumericId = entity.getImplicitConvNumericId();
 * java.math.BigDecimal implicitConvIntegerId = entity.getImplicitConvIntegerId();
 * java.math.BigDecimal implicitConvStringId = entity.getImplicitConvStringId();
 * String implicitConvName = entity.getImplicitConvName();
 * entity.setImplicitConvNumericId(implicitConvNumericId);
 * entity.setImplicitConvIntegerId(implicitConvIntegerId);
 * entity.setImplicitConvStringId(implicitConvStringId);
 * entity.setImplicitConvName(implicitConvName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteImplicitConvNumeric implements Entity, Serializable, Cloneable {

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
    /** IMPLICIT_CONV_NUMERIC_ID: {PK, NotNull, DECIMAL(20)} */
    protected java.math.BigDecimal _implicitConvNumericId;

    /** IMPLICIT_CONV_INTEGER_ID: {NotNull, DECIMAL(20), FK to WHITE_IMPLICIT_CONV_INTEGER} */
    protected java.math.BigDecimal _implicitConvIntegerId;

    /** IMPLICIT_CONV_STRING_ID: {NotNull, DECIMAL(20), FK to WHITE_IMPLICIT_CONV_STRING} */
    protected java.math.BigDecimal _implicitConvStringId;

    /** IMPLICIT_CONV_NAME: {NotNull, VARCHAR(200)} */
    protected String _implicitConvName;

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
        return "white_implicit_conv_numeric";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteImplicitConvNumeric";
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
        if (getImplicitConvNumericId() == null) { return false; }
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
    /** white_implicit_conv_integer by my IMPLICIT_CONV_INTEGER_ID, named 'whiteImplicitConvInteger'. */
    protected WhiteImplicitConvInteger _whiteImplicitConvInteger;

    /**
     * [get] white_implicit_conv_integer by my IMPLICIT_CONV_INTEGER_ID, named 'whiteImplicitConvInteger'.
     * @return The entity of foreign property 'whiteImplicitConvInteger'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteImplicitConvInteger getWhiteImplicitConvInteger() {
        return _whiteImplicitConvInteger;
    }

    /**
     * [set] white_implicit_conv_integer by my IMPLICIT_CONV_INTEGER_ID, named 'whiteImplicitConvInteger'.
     * @param whiteImplicitConvInteger The entity of foreign property 'whiteImplicitConvInteger'. (NullAllowed)
     */
    public void setWhiteImplicitConvInteger(WhiteImplicitConvInteger whiteImplicitConvInteger) {
        _whiteImplicitConvInteger = whiteImplicitConvInteger;
    }

    /** white_implicit_conv_string by my IMPLICIT_CONV_STRING_ID, named 'whiteImplicitConvString'. */
    protected WhiteImplicitConvString _whiteImplicitConvString;

    /**
     * [get] white_implicit_conv_string by my IMPLICIT_CONV_STRING_ID, named 'whiteImplicitConvString'.
     * @return The entity of foreign property 'whiteImplicitConvString'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteImplicitConvString getWhiteImplicitConvString() {
        return _whiteImplicitConvString;
    }

    /**
     * [set] white_implicit_conv_string by my IMPLICIT_CONV_STRING_ID, named 'whiteImplicitConvString'.
     * @param whiteImplicitConvString The entity of foreign property 'whiteImplicitConvString'. (NullAllowed)
     */
    public void setWhiteImplicitConvString(WhiteImplicitConvString whiteImplicitConvString) {
        _whiteImplicitConvString = whiteImplicitConvString;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** white_implicit_conv_integer by IMPLICIT_CONV_NUMERIC_ID, named 'whiteImplicitConvIntegerList'. */
    protected List<WhiteImplicitConvInteger> _whiteImplicitConvIntegerList;

    /**
     * [get] white_implicit_conv_integer by IMPLICIT_CONV_NUMERIC_ID, named 'whiteImplicitConvIntegerList'.
     * @return The entity list of referrer property 'whiteImplicitConvIntegerList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteImplicitConvInteger> getWhiteImplicitConvIntegerList() {
        if (_whiteImplicitConvIntegerList == null) { _whiteImplicitConvIntegerList = newReferrerList(); }
        return _whiteImplicitConvIntegerList;
    }

    /**
     * [set] white_implicit_conv_integer by IMPLICIT_CONV_NUMERIC_ID, named 'whiteImplicitConvIntegerList'.
     * @param whiteImplicitConvIntegerList The entity list of referrer property 'whiteImplicitConvIntegerList'. (NullAllowed)
     */
    public void setWhiteImplicitConvIntegerList(List<WhiteImplicitConvInteger> whiteImplicitConvIntegerList) {
        _whiteImplicitConvIntegerList = whiteImplicitConvIntegerList;
    }

    /** white_implicit_conv_string by IMPLICIT_CONV_NUMERIC_ID, named 'whiteImplicitConvStringList'. */
    protected List<WhiteImplicitConvString> _whiteImplicitConvStringList;

    /**
     * [get] white_implicit_conv_string by IMPLICIT_CONV_NUMERIC_ID, named 'whiteImplicitConvStringList'.
     * @return The entity list of referrer property 'whiteImplicitConvStringList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteImplicitConvString> getWhiteImplicitConvStringList() {
        if (_whiteImplicitConvStringList == null) { _whiteImplicitConvStringList = newReferrerList(); }
        return _whiteImplicitConvStringList;
    }

    /**
     * [set] white_implicit_conv_string by IMPLICIT_CONV_NUMERIC_ID, named 'whiteImplicitConvStringList'.
     * @param whiteImplicitConvStringList The entity list of referrer property 'whiteImplicitConvStringList'. (NullAllowed)
     */
    public void setWhiteImplicitConvStringList(List<WhiteImplicitConvString> whiteImplicitConvStringList) {
        _whiteImplicitConvStringList = whiteImplicitConvStringList;
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
        if (obj == null || !(obj instanceof BsWhiteImplicitConvNumeric)) { return false; }
        BsWhiteImplicitConvNumeric other = (BsWhiteImplicitConvNumeric)obj;
        if (!xSV(getImplicitConvNumericId(), other.getImplicitConvNumericId())) { return false; }
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
        hs = xCH(hs, getImplicitConvNumericId());
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
        if (_whiteImplicitConvInteger != null)
        { sb.append(li).append(xbRDS(_whiteImplicitConvInteger, "whiteImplicitConvInteger")); }
        if (_whiteImplicitConvString != null)
        { sb.append(li).append(xbRDS(_whiteImplicitConvString, "whiteImplicitConvString")); }
        if (_whiteImplicitConvIntegerList != null) { for (Entity et : _whiteImplicitConvIntegerList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whiteImplicitConvIntegerList")); } } }
        if (_whiteImplicitConvStringList != null) { for (Entity et : _whiteImplicitConvStringList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whiteImplicitConvStringList")); } } }
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
        sb.append(dm).append(getImplicitConvNumericId());
        sb.append(dm).append(getImplicitConvIntegerId());
        sb.append(dm).append(getImplicitConvStringId());
        sb.append(dm).append(getImplicitConvName());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String cm = ",";
        if (_whiteImplicitConvInteger != null) { sb.append(cm).append("whiteImplicitConvInteger"); }
        if (_whiteImplicitConvString != null) { sb.append(cm).append("whiteImplicitConvString"); }
        if (_whiteImplicitConvIntegerList != null && !_whiteImplicitConvIntegerList.isEmpty())
        { sb.append(cm).append("whiteImplicitConvIntegerList"); }
        if (_whiteImplicitConvStringList != null && !_whiteImplicitConvStringList.isEmpty())
        { sb.append(cm).append("whiteImplicitConvStringList"); }
        if (sb.length() > cm.length()) {
            sb.delete(0, cm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public WhiteImplicitConvNumeric clone() {
        try {
            return (WhiteImplicitConvNumeric)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] IMPLICIT_CONV_NUMERIC_ID: {PK, NotNull, DECIMAL(20)} <br />
     * @return The value of the column 'IMPLICIT_CONV_NUMERIC_ID'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getImplicitConvNumericId() {
        return _implicitConvNumericId;
    }

    /**
     * [set] IMPLICIT_CONV_NUMERIC_ID: {PK, NotNull, DECIMAL(20)} <br />
     * @param implicitConvNumericId The value of the column 'IMPLICIT_CONV_NUMERIC_ID'. (basically NotNull if update: for the constraint)
     */
    public void setImplicitConvNumericId(java.math.BigDecimal implicitConvNumericId) {
        __modifiedProperties.addPropertyName("implicitConvNumericId");
        _implicitConvNumericId = implicitConvNumericId;
    }

    /**
     * [get] IMPLICIT_CONV_INTEGER_ID: {NotNull, DECIMAL(20), FK to WHITE_IMPLICIT_CONV_INTEGER} <br />
     * @return The value of the column 'IMPLICIT_CONV_INTEGER_ID'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getImplicitConvIntegerId() {
        return _implicitConvIntegerId;
    }

    /**
     * [set] IMPLICIT_CONV_INTEGER_ID: {NotNull, DECIMAL(20), FK to WHITE_IMPLICIT_CONV_INTEGER} <br />
     * @param implicitConvIntegerId The value of the column 'IMPLICIT_CONV_INTEGER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setImplicitConvIntegerId(java.math.BigDecimal implicitConvIntegerId) {
        __modifiedProperties.addPropertyName("implicitConvIntegerId");
        _implicitConvIntegerId = implicitConvIntegerId;
    }

    /**
     * [get] IMPLICIT_CONV_STRING_ID: {NotNull, DECIMAL(20), FK to WHITE_IMPLICIT_CONV_STRING} <br />
     * @return The value of the column 'IMPLICIT_CONV_STRING_ID'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getImplicitConvStringId() {
        return _implicitConvStringId;
    }

    /**
     * [set] IMPLICIT_CONV_STRING_ID: {NotNull, DECIMAL(20), FK to WHITE_IMPLICIT_CONV_STRING} <br />
     * @param implicitConvStringId The value of the column 'IMPLICIT_CONV_STRING_ID'. (basically NotNull if update: for the constraint)
     */
    public void setImplicitConvStringId(java.math.BigDecimal implicitConvStringId) {
        __modifiedProperties.addPropertyName("implicitConvStringId");
        _implicitConvStringId = implicitConvStringId;
    }

    /**
     * [get] IMPLICIT_CONV_NAME: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'IMPLICIT_CONV_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getImplicitConvName() {
        return _implicitConvName;
    }

    /**
     * [set] IMPLICIT_CONV_NAME: {NotNull, VARCHAR(200)} <br />
     * @param implicitConvName The value of the column 'IMPLICIT_CONV_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setImplicitConvName(String implicitConvName) {
        __modifiedProperties.addPropertyName("implicitConvName");
        _implicitConvName = implicitConvName;
    }
}
