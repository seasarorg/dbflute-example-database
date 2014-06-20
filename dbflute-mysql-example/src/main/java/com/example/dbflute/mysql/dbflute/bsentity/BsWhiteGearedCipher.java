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
import java.util.Date;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.Entity;
import com.example.dbflute.mysql.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.mysql.dbflute.exentity.*;

/**
 * The entity of WHITE_GEARED_CIPHER as TABLE. <br />
 * <pre>
 * [primary-key]
 *     CIPHER_ID
 * 
 * [column]
 *     CIPHER_ID, CIPHER_INTEGER, CIPHER_VARCHAR, CIPHER_DATE, CIPHER_DATETIME
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     CIPHER_ID
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
 * Long cipherId = entity.getCipherId();
 * Integer cipherInteger = entity.getCipherInteger();
 * String cipherVarchar = entity.getCipherVarchar();
 * java.util.Date cipherDate = entity.getCipherDate();
 * java.sql.Timestamp cipherDatetime = entity.getCipherDatetime();
 * entity.setCipherId(cipherId);
 * entity.setCipherInteger(cipherInteger);
 * entity.setCipherVarchar(cipherVarchar);
 * entity.setCipherDate(cipherDate);
 * entity.setCipherDatetime(cipherDatetime);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteGearedCipher implements Entity, Serializable, Cloneable {

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
    /** CIPHER_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _cipherId;

    /** CIPHER_INTEGER: {VARCHAR(100)} */
    protected Integer _cipherInteger;

    /** CIPHER_VARCHAR: {VARCHAR(100)} */
    protected String _cipherVarchar;

    /** CIPHER_DATE: {VARCHAR(100)} */
    protected java.util.Date _cipherDate;

    /** CIPHER_DATETIME: {VARCHAR(100)} */
    protected java.sql.Timestamp _cipherDatetime;

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
        return "white_geared_cipher";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteGearedCipher";
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
        if (getCipherId() == null) { return false; }
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
        if (obj == null || !(obj instanceof BsWhiteGearedCipher)) { return false; }
        BsWhiteGearedCipher other = (BsWhiteGearedCipher)obj;
        if (!xSV(getCipherId(), other.getCipherId())) { return false; }
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
        hs = xCH(hs, getCipherId());
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
        sb.append(dm).append(getCipherId());
        sb.append(dm).append(getCipherInteger());
        sb.append(dm).append(getCipherVarchar());
        sb.append(dm).append(xfUD(getCipherDate()));
        sb.append(dm).append(getCipherDatetime());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String xfUD(Date date) { // formatUtilDate()
        return FunCustodial.toString(date, xgDP());
    }
    protected String xgDP() { // getDatePattern
        return "yyyy-MM-dd";
    }
    protected String buildRelationString() {
        return "";
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public WhiteGearedCipher clone() {
        try {
            return (WhiteGearedCipher)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CIPHER_ID: {PK, ID, NotNull, BIGINT(19)} <br />
     * @return The value of the column 'CIPHER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCipherId() {
        return _cipherId;
    }

    /**
     * [set] CIPHER_ID: {PK, ID, NotNull, BIGINT(19)} <br />
     * @param cipherId The value of the column 'CIPHER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCipherId(Long cipherId) {
        __modifiedProperties.addPropertyName("cipherId");
        _cipherId = cipherId;
    }

    /**
     * [get] CIPHER_INTEGER: {VARCHAR(100)} <br />
     * @return The value of the column 'CIPHER_INTEGER'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getCipherInteger() {
        return _cipherInteger;
    }

    /**
     * [set] CIPHER_INTEGER: {VARCHAR(100)} <br />
     * @param cipherInteger The value of the column 'CIPHER_INTEGER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCipherInteger(Integer cipherInteger) {
        __modifiedProperties.addPropertyName("cipherInteger");
        _cipherInteger = cipherInteger;
    }

    /**
     * [get] CIPHER_VARCHAR: {VARCHAR(100)} <br />
     * @return The value of the column 'CIPHER_VARCHAR'. (NullAllowed even if selected: for no constraint)
     */
    public String getCipherVarchar() {
        return _cipherVarchar;
    }

    /**
     * [set] CIPHER_VARCHAR: {VARCHAR(100)} <br />
     * @param cipherVarchar The value of the column 'CIPHER_VARCHAR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCipherVarchar(String cipherVarchar) {
        __modifiedProperties.addPropertyName("cipherVarchar");
        _cipherVarchar = cipherVarchar;
    }

    /**
     * [get] CIPHER_DATE: {VARCHAR(100)} <br />
     * @return The value of the column 'CIPHER_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public java.util.Date getCipherDate() {
        return _cipherDate;
    }

    /**
     * [set] CIPHER_DATE: {VARCHAR(100)} <br />
     * @param cipherDate The value of the column 'CIPHER_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCipherDate(java.util.Date cipherDate) {
        __modifiedProperties.addPropertyName("cipherDate");
        _cipherDate = cipherDate;
    }

    /**
     * [get] CIPHER_DATETIME: {VARCHAR(100)} <br />
     * @return The value of the column 'CIPHER_DATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getCipherDatetime() {
        return _cipherDatetime;
    }

    /**
     * [set] CIPHER_DATETIME: {VARCHAR(100)} <br />
     * @param cipherDatetime The value of the column 'CIPHER_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCipherDatetime(java.sql.Timestamp cipherDatetime) {
        __modifiedProperties.addPropertyName("cipherDatetime");
        _cipherDatetime = cipherDatetime;
    }
}
