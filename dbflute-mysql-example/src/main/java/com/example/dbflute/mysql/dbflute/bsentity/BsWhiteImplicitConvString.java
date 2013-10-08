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
 * The entity of WHITE_IMPLICIT_CONV_STRING as TABLE. <br />
 * <pre>
 * [primary-key]
 *     IMPLICIT_CONV_STRING_ID
 * 
 * [column]
 *     IMPLICIT_CONV_STRING_ID, IMPLICIT_CONV_INTEGER_ID, IMPLICIT_CONV_NUMERIC_ID, IMPLICIT_CONV_NAME
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
 *     WHITE_IMPLICIT_CONV_INTEGER, WHITE_IMPLICIT_CONV_NUMERIC
 * 
 * [referrer table]
 *     white_implicit_conv_integer, white_implicit_conv_numeric
 * 
 * [foreign property]
 *     whiteImplicitConvInteger, whiteImplicitConvNumeric
 * 
 * [referrer property]
 *     whiteImplicitConvIntegerList, whiteImplicitConvNumericList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * String implicitConvStringId = entity.getImplicitConvStringId();
 * String implicitConvIntegerId = entity.getImplicitConvIntegerId();
 * String implicitConvNumericId = entity.getImplicitConvNumericId();
 * String implicitConvName = entity.getImplicitConvName();
 * entity.setImplicitConvStringId(implicitConvStringId);
 * entity.setImplicitConvIntegerId(implicitConvIntegerId);
 * entity.setImplicitConvNumericId(implicitConvNumericId);
 * entity.setImplicitConvName(implicitConvName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteImplicitConvString implements Entity, Serializable, Cloneable {

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
    /** IMPLICIT_CONV_STRING_ID: {PK, NotNull, VARCHAR(10)} */
    protected String _implicitConvStringId;

    /** IMPLICIT_CONV_INTEGER_ID: {NotNull, VARCHAR(10), FK to WHITE_IMPLICIT_CONV_INTEGER} */
    protected String _implicitConvIntegerId;

    /** IMPLICIT_CONV_NUMERIC_ID: {NotNull, VARCHAR(10), FK to WHITE_IMPLICIT_CONV_NUMERIC} */
    protected String _implicitConvNumericId;

    /** IMPLICIT_CONV_NAME: {NotNull, VARCHAR(200)} */
    protected String _implicitConvName;

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
        return "white_implicit_conv_string";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteImplicitConvString";
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
        if (getImplicitConvStringId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** white_implicit_conv_integer by my IMPLICIT_CONV_INTEGER_ID, named 'whiteImplicitConvInteger'. */
    protected WhiteImplicitConvInteger _whiteImplicitConvInteger;

    /**
     * white_implicit_conv_integer by my IMPLICIT_CONV_INTEGER_ID, named 'whiteImplicitConvInteger'.
     * @return The entity of foreign property 'whiteImplicitConvInteger'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteImplicitConvInteger getWhiteImplicitConvInteger() {
        return _whiteImplicitConvInteger;
    }

    /**
     * white_implicit_conv_integer by my IMPLICIT_CONV_INTEGER_ID, named 'whiteImplicitConvInteger'.
     * @param whiteImplicitConvInteger The entity of foreign property 'whiteImplicitConvInteger'. (NullAllowed)
     */
    public void setWhiteImplicitConvInteger(WhiteImplicitConvInteger whiteImplicitConvInteger) {
        _whiteImplicitConvInteger = whiteImplicitConvInteger;
    }

    /** white_implicit_conv_numeric by my IMPLICIT_CONV_NUMERIC_ID, named 'whiteImplicitConvNumeric'. */
    protected WhiteImplicitConvNumeric _whiteImplicitConvNumeric;

    /**
     * white_implicit_conv_numeric by my IMPLICIT_CONV_NUMERIC_ID, named 'whiteImplicitConvNumeric'.
     * @return The entity of foreign property 'whiteImplicitConvNumeric'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteImplicitConvNumeric getWhiteImplicitConvNumeric() {
        return _whiteImplicitConvNumeric;
    }

    /**
     * white_implicit_conv_numeric by my IMPLICIT_CONV_NUMERIC_ID, named 'whiteImplicitConvNumeric'.
     * @param whiteImplicitConvNumeric The entity of foreign property 'whiteImplicitConvNumeric'. (NullAllowed)
     */
    public void setWhiteImplicitConvNumeric(WhiteImplicitConvNumeric whiteImplicitConvNumeric) {
        _whiteImplicitConvNumeric = whiteImplicitConvNumeric;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** white_implicit_conv_integer by IMPLICIT_CONV_STRING_ID, named 'whiteImplicitConvIntegerList'. */
    protected List<WhiteImplicitConvInteger> _whiteImplicitConvIntegerList;

    /**
     * white_implicit_conv_integer by IMPLICIT_CONV_STRING_ID, named 'whiteImplicitConvIntegerList'.
     * @return The entity list of referrer property 'whiteImplicitConvIntegerList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteImplicitConvInteger> getWhiteImplicitConvIntegerList() {
        if (_whiteImplicitConvIntegerList == null) { _whiteImplicitConvIntegerList = newReferrerList(); }
        return _whiteImplicitConvIntegerList;
    }

    /**
     * white_implicit_conv_integer by IMPLICIT_CONV_STRING_ID, named 'whiteImplicitConvIntegerList'.
     * @param whiteImplicitConvIntegerList The entity list of referrer property 'whiteImplicitConvIntegerList'. (NullAllowed)
     */
    public void setWhiteImplicitConvIntegerList(List<WhiteImplicitConvInteger> whiteImplicitConvIntegerList) {
        _whiteImplicitConvIntegerList = whiteImplicitConvIntegerList;
    }

    /** white_implicit_conv_numeric by IMPLICIT_CONV_STRING_ID, named 'whiteImplicitConvNumericList'. */
    protected List<WhiteImplicitConvNumeric> _whiteImplicitConvNumericList;

    /**
     * white_implicit_conv_numeric by IMPLICIT_CONV_STRING_ID, named 'whiteImplicitConvNumericList'.
     * @return The entity list of referrer property 'whiteImplicitConvNumericList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteImplicitConvNumeric> getWhiteImplicitConvNumericList() {
        if (_whiteImplicitConvNumericList == null) { _whiteImplicitConvNumericList = newReferrerList(); }
        return _whiteImplicitConvNumericList;
    }

    /**
     * white_implicit_conv_numeric by IMPLICIT_CONV_STRING_ID, named 'whiteImplicitConvNumericList'.
     * @param whiteImplicitConvNumericList The entity list of referrer property 'whiteImplicitConvNumericList'. (NullAllowed)
     */
    public void setWhiteImplicitConvNumericList(List<WhiteImplicitConvNumeric> whiteImplicitConvNumericList) {
        _whiteImplicitConvNumericList = whiteImplicitConvNumericList;
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
     * @param other The other entity. (NullAllowed: if null, returns false fixedly)
     * @return Comparing result.
     */
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsWhiteImplicitConvString)) { return false; }
        BsWhiteImplicitConvString otherEntity = (BsWhiteImplicitConvString)other;
        if (!xSV(getImplicitConvStringId(), otherEntity.getImplicitConvStringId())) { return false; }
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
        result = xCH(result, getImplicitConvStringId());
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
        String l = "\n  ";
        if (_whiteImplicitConvInteger != null)
        { sb.append(l).append(xbRDS(_whiteImplicitConvInteger, "whiteImplicitConvInteger")); }
        if (_whiteImplicitConvNumeric != null)
        { sb.append(l).append(xbRDS(_whiteImplicitConvNumeric, "whiteImplicitConvNumeric")); }
        if (_whiteImplicitConvIntegerList != null) { for (Entity e : _whiteImplicitConvIntegerList)
        { if (e != null) { sb.append(l).append(xbRDS(e, "whiteImplicitConvIntegerList")); } } }
        if (_whiteImplicitConvNumericList != null) { for (Entity e : _whiteImplicitConvNumericList)
        { if (e != null) { sb.append(l).append(xbRDS(e, "whiteImplicitConvNumericList")); } } }
        return sb.toString();
    }
    protected String xbRDS(Entity e, String name) { // buildRelationDisplayString()
        return e.buildDisplayString(name, true, true);
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
        sb.append(delimiter).append(getImplicitConvStringId());
        sb.append(delimiter).append(getImplicitConvIntegerId());
        sb.append(delimiter).append(getImplicitConvNumericId());
        sb.append(delimiter).append(getImplicitConvName());
        if (sb.length() > delimiter.length()) {
            sb.delete(0, delimiter.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String c = ",";
        if (_whiteImplicitConvInteger != null) { sb.append(c).append("whiteImplicitConvInteger"); }
        if (_whiteImplicitConvNumeric != null) { sb.append(c).append("whiteImplicitConvNumeric"); }
        if (_whiteImplicitConvIntegerList != null && !_whiteImplicitConvIntegerList.isEmpty())
        { sb.append(c).append("whiteImplicitConvIntegerList"); }
        if (_whiteImplicitConvNumericList != null && !_whiteImplicitConvNumericList.isEmpty())
        { sb.append(c).append("whiteImplicitConvNumericList"); }
        if (sb.length() > c.length()) {
            sb.delete(0, c.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public WhiteImplicitConvString clone() {
        try {
            return (WhiteImplicitConvString)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] IMPLICIT_CONV_STRING_ID: {PK, NotNull, VARCHAR(10)} <br />
     * @return The value of the column 'IMPLICIT_CONV_STRING_ID'. (basically NotNull if selected: for the constraint)
     */
    public String getImplicitConvStringId() {
        return _implicitConvStringId;
    }

    /**
     * [set] IMPLICIT_CONV_STRING_ID: {PK, NotNull, VARCHAR(10)} <br />
     * @param implicitConvStringId The value of the column 'IMPLICIT_CONV_STRING_ID'. (basically NotNull if update: for the constraint)
     */
    public void setImplicitConvStringId(String implicitConvStringId) {
        __modifiedProperties.addPropertyName("implicitConvStringId");
        this._implicitConvStringId = implicitConvStringId;
    }

    /**
     * [get] IMPLICIT_CONV_INTEGER_ID: {NotNull, VARCHAR(10), FK to WHITE_IMPLICIT_CONV_INTEGER} <br />
     * @return The value of the column 'IMPLICIT_CONV_INTEGER_ID'. (basically NotNull if selected: for the constraint)
     */
    public String getImplicitConvIntegerId() {
        return _implicitConvIntegerId;
    }

    /**
     * [set] IMPLICIT_CONV_INTEGER_ID: {NotNull, VARCHAR(10), FK to WHITE_IMPLICIT_CONV_INTEGER} <br />
     * @param implicitConvIntegerId The value of the column 'IMPLICIT_CONV_INTEGER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setImplicitConvIntegerId(String implicitConvIntegerId) {
        __modifiedProperties.addPropertyName("implicitConvIntegerId");
        this._implicitConvIntegerId = implicitConvIntegerId;
    }

    /**
     * [get] IMPLICIT_CONV_NUMERIC_ID: {NotNull, VARCHAR(10), FK to WHITE_IMPLICIT_CONV_NUMERIC} <br />
     * @return The value of the column 'IMPLICIT_CONV_NUMERIC_ID'. (basically NotNull if selected: for the constraint)
     */
    public String getImplicitConvNumericId() {
        return _implicitConvNumericId;
    }

    /**
     * [set] IMPLICIT_CONV_NUMERIC_ID: {NotNull, VARCHAR(10), FK to WHITE_IMPLICIT_CONV_NUMERIC} <br />
     * @param implicitConvNumericId The value of the column 'IMPLICIT_CONV_NUMERIC_ID'. (basically NotNull if update: for the constraint)
     */
    public void setImplicitConvNumericId(String implicitConvNumericId) {
        __modifiedProperties.addPropertyName("implicitConvNumericId");
        this._implicitConvNumericId = implicitConvNumericId;
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
        this._implicitConvName = implicitConvName;
    }
}
