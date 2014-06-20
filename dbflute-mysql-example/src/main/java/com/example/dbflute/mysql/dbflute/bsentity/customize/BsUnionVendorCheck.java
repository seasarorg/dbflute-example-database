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
package com.example.dbflute.mysql.dbflute.bsentity.customize;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.Entity;
import com.example.dbflute.mysql.dbflute.allcommon.CDef;
import com.example.dbflute.mysql.dbflute.exentity.customize.*;

/**
 * The entity of UnionVendorCheck. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     VENDOR_CHECK_ID, TYPE_OF_TEXT, TYPE_OF_NUMERIC_DECIMAL, TYPE_OF_NUMERIC_INTEGER, TYPE_OF_NUMERIC_BIGINT, TYPE_OF_BOOLEAN, TYPE_OF_BLOB
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
 * Long vendorCheckId = entity.getVendorCheckId();
 * String typeOfText = entity.getTypeOfText();
 * java.math.BigDecimal typeOfNumericDecimal = entity.getTypeOfNumericDecimal();
 * Integer typeOfNumericInteger = entity.getTypeOfNumericInteger();
 * Long typeOfNumericBigint = entity.getTypeOfNumericBigint();
 * Integer typeOfBoolean = entity.getTypeOfBoolean();
 * byte[] typeOfBlob = entity.getTypeOfBlob();
 * entity.setVendorCheckId(vendorCheckId);
 * entity.setTypeOfText(typeOfText);
 * entity.setTypeOfNumericDecimal(typeOfNumericDecimal);
 * entity.setTypeOfNumericInteger(typeOfNumericInteger);
 * entity.setTypeOfNumericBigint(typeOfNumericBigint);
 * entity.setTypeOfBoolean(typeOfBoolean);
 * entity.setTypeOfBlob(typeOfBlob);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsUnionVendorCheck implements Entity, Serializable, Cloneable {

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
    /** VENDOR_CHECK_ID: {DECIMAL(16)} */
    protected Long _vendorCheckId;

    /** TYPE_OF_TEXT: {VARCHAR(65535)} */
    protected String _typeOfText;

    /** TYPE_OF_NUMERIC_DECIMAL: {DECIMAL(5, 3)} */
    protected java.math.BigDecimal _typeOfNumericDecimal;

    /** TYPE_OF_NUMERIC_INTEGER: {DECIMAL(5)} */
    protected Integer _typeOfNumericInteger;

    /** TYPE_OF_NUMERIC_BIGINT: {DECIMAL(12)} */
    protected Long _typeOfNumericBigint;

    /** TYPE_OF_BOOLEAN: {TINYINT(4), classification=BooleanFlg} */
    protected Integer _typeOfBoolean;

    /** TYPE_OF_BLOB: {BLOB(65535)} */
    protected byte[] _typeOfBlob;

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
        return "UnionVendorCheck";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "unionVendorCheck";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /**
     * {@inheritDoc}
     */
    public DBMeta getDBMeta() {
        return com.example.dbflute.mysql.dbflute.bsentity.customize.dbmeta.UnionVendorCheckDbm.getInstance();
    }

    // ===================================================================================
    //                                                                         Primary Key
    //                                                                         ===========
    /**
     * {@inheritDoc}
     */
    public boolean hasPrimaryKeyValue() {
        return false;
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
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of typeOfBoolean as the classification of BooleanFlg. <br />
     * TYPE_OF_BOOLEAN: {TINYINT(4), classification=BooleanFlg} <br />
     * boolean classification for boolean column
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.BooleanFlg getTypeOfBooleanAsBooleanFlg() {
        return CDef.BooleanFlg.codeOf(getTypeOfBoolean());
    }

    /**
     * Set the value of typeOfBoolean as the classification of BooleanFlg. <br />
     * TYPE_OF_BOOLEAN: {TINYINT(4), classification=BooleanFlg} <br />
     * boolean classification for boolean column
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setTypeOfBooleanAsBooleanFlg(CDef.BooleanFlg cdef) {
        setTypeOfBoolean(cdef != null ? FunCustodial.toNumber(cdef.code(), Integer.class) : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of typeOfBoolean as True (true). <br />
     * Checked: means yes
     */
    public void setTypeOfBoolean_True() {
        setTypeOfBooleanAsBooleanFlg(CDef.BooleanFlg.True);
    }

    /**
     * Set the value of typeOfBoolean as False (false). <br />
     * Unchecked: means no
     */
    public void setTypeOfBoolean_False() {
        setTypeOfBooleanAsBooleanFlg(CDef.BooleanFlg.False);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of typeOfBoolean True? <br />
     * Checked: means yes
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isTypeOfBooleanTrue() {
        CDef.BooleanFlg cdef = getTypeOfBooleanAsBooleanFlg();
        return cdef != null ? cdef.equals(CDef.BooleanFlg.True) : false;
    }

    /**
     * Is the value of typeOfBoolean False? <br />
     * Unchecked: means no
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isTypeOfBooleanFalse() {
        CDef.BooleanFlg cdef = getTypeOfBooleanAsBooleanFlg();
        return cdef != null ? cdef.equals(CDef.BooleanFlg.False) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'typeOfBoolean' as classification alias.
     * @return The string of classification alias. (NullAllowed: when the column value is null)
     */
    public String getTypeOfBooleanAlias() {
        CDef.BooleanFlg cdef = getTypeOfBooleanAsBooleanFlg();
        return cdef != null ? cdef.alias() : null;
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
     * @param obj The object as other entity. (NullAllowed: if null, returns false fixedly)
     * @return Comparing result.
     */
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BsUnionVendorCheck)) { return false; }
        BsUnionVendorCheck other = (BsUnionVendorCheck)obj;
        if (!xSV(getVendorCheckId(), other.getVendorCheckId())) { return false; }
        if (!xSV(getTypeOfText(), other.getTypeOfText())) { return false; }
        if (!xSV(getTypeOfNumericDecimal(), other.getTypeOfNumericDecimal())) { return false; }
        if (!xSV(getTypeOfNumericInteger(), other.getTypeOfNumericInteger())) { return false; }
        if (!xSV(getTypeOfNumericBigint(), other.getTypeOfNumericBigint())) { return false; }
        if (!xSV(getTypeOfBoolean(), other.getTypeOfBoolean())) { return false; }
        if (!xSV(getTypeOfBlob(), other.getTypeOfBlob())) { return false; }
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
        hs = xCH(hs, getVendorCheckId());
        hs = xCH(hs, getTypeOfText());
        hs = xCH(hs, getTypeOfNumericDecimal());
        hs = xCH(hs, getTypeOfNumericInteger());
        hs = xCH(hs, getTypeOfNumericBigint());
        hs = xCH(hs, getTypeOfBoolean());
        hs = xCH(hs, getTypeOfBlob());
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
        String dm = ", ";
        sb.append(dm).append(getVendorCheckId());
        sb.append(dm).append(getTypeOfText());
        sb.append(dm).append(getTypeOfNumericDecimal());
        sb.append(dm).append(getTypeOfNumericInteger());
        sb.append(dm).append(getTypeOfNumericBigint());
        sb.append(dm).append(getTypeOfBoolean());
        sb.append(dm).append(xfBA(getTypeOfBlob()));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String xfBA(byte[] bytes) { // formatByteArray()
        return FunCustodial.toString(bytes);
    }
    protected String buildRelationString() {
        return "";
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public UnionVendorCheck clone() {
        try {
            return (UnionVendorCheck)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] VENDOR_CHECK_ID: {DECIMAL(16)} <br />
     * @return The value of the column 'VENDOR_CHECK_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getVendorCheckId() {
        return _vendorCheckId;
    }

    /**
     * [set] VENDOR_CHECK_ID: {DECIMAL(16)} <br />
     * @param vendorCheckId The value of the column 'VENDOR_CHECK_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setVendorCheckId(Long vendorCheckId) {
        __modifiedProperties.addPropertyName("vendorCheckId");
        _vendorCheckId = vendorCheckId;
    }

    /**
     * [get] TYPE_OF_TEXT: {VARCHAR(65535)} <br />
     * @return The value of the column 'TYPE_OF_TEXT'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfText() {
        return _typeOfText;
    }

    /**
     * [set] TYPE_OF_TEXT: {VARCHAR(65535)} <br />
     * @param typeOfText The value of the column 'TYPE_OF_TEXT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfText(String typeOfText) {
        __modifiedProperties.addPropertyName("typeOfText");
        _typeOfText = typeOfText;
    }

    /**
     * [get] TYPE_OF_NUMERIC_DECIMAL: {DECIMAL(5, 3)} <br />
     * @return The value of the column 'TYPE_OF_NUMERIC_DECIMAL'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTypeOfNumericDecimal() {
        return _typeOfNumericDecimal;
    }

    /**
     * [set] TYPE_OF_NUMERIC_DECIMAL: {DECIMAL(5, 3)} <br />
     * @param typeOfNumericDecimal The value of the column 'TYPE_OF_NUMERIC_DECIMAL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfNumericDecimal(java.math.BigDecimal typeOfNumericDecimal) {
        __modifiedProperties.addPropertyName("typeOfNumericDecimal");
        _typeOfNumericDecimal = typeOfNumericDecimal;
    }

    /**
     * [get] TYPE_OF_NUMERIC_INTEGER: {DECIMAL(5)} <br />
     * @return The value of the column 'TYPE_OF_NUMERIC_INTEGER'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getTypeOfNumericInteger() {
        return _typeOfNumericInteger;
    }

    /**
     * [set] TYPE_OF_NUMERIC_INTEGER: {DECIMAL(5)} <br />
     * @param typeOfNumericInteger The value of the column 'TYPE_OF_NUMERIC_INTEGER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfNumericInteger(Integer typeOfNumericInteger) {
        __modifiedProperties.addPropertyName("typeOfNumericInteger");
        _typeOfNumericInteger = typeOfNumericInteger;
    }

    /**
     * [get] TYPE_OF_NUMERIC_BIGINT: {DECIMAL(12)} <br />
     * @return The value of the column 'TYPE_OF_NUMERIC_BIGINT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTypeOfNumericBigint() {
        return _typeOfNumericBigint;
    }

    /**
     * [set] TYPE_OF_NUMERIC_BIGINT: {DECIMAL(12)} <br />
     * @param typeOfNumericBigint The value of the column 'TYPE_OF_NUMERIC_BIGINT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfNumericBigint(Long typeOfNumericBigint) {
        __modifiedProperties.addPropertyName("typeOfNumericBigint");
        _typeOfNumericBigint = typeOfNumericBigint;
    }

    /**
     * [get] TYPE_OF_BOOLEAN: {TINYINT(4), classification=BooleanFlg} <br />
     * @return The value of the column 'TYPE_OF_BOOLEAN'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getTypeOfBoolean() {
        return _typeOfBoolean;
    }

    /**
     * [set] TYPE_OF_BOOLEAN: {TINYINT(4), classification=BooleanFlg} <br />
     * @param typeOfBoolean The value of the column 'TYPE_OF_BOOLEAN'. (NullAllowed: null update allowed for no constraint)
     */
    protected void setTypeOfBoolean(Integer typeOfBoolean) {
        __modifiedProperties.addPropertyName("typeOfBoolean");
        _typeOfBoolean = typeOfBoolean;
    }

    /**
     * [get] TYPE_OF_BLOB: {BLOB(65535)} <br />
     * @return The value of the column 'TYPE_OF_BLOB'. (NullAllowed even if selected: for no constraint)
     */
    public byte[] getTypeOfBlob() {
        return _typeOfBlob;
    }

    /**
     * [set] TYPE_OF_BLOB: {BLOB(65535)} <br />
     * @param typeOfBlob The value of the column 'TYPE_OF_BLOB'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfBlob(byte[] typeOfBlob) {
        __modifiedProperties.addPropertyName("typeOfBlob");
        _typeOfBlob = typeOfBlob;
    }
}
