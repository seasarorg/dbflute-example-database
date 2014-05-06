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
 * The entity of WHITE_ESCAPED_DFPROP as TABLE. <br />
 * <pre>
 * [primary-key]
 *     ESCAPED_DFPROP_CODE
 * 
 * [column]
 *     ESCAPED_DFPROP_CODE, ESCAPED_DFPROP_NAME
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
 * String escapedDfpropCode = entity.getEscapedDfpropCode();
 * String escapedDfpropName = entity.getEscapedDfpropName();
 * entity.setEscapedDfpropCode(escapedDfpropCode);
 * entity.setEscapedDfpropName(escapedDfpropName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteEscapedDfprop implements Entity, Serializable, Cloneable {

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
    /** ESCAPED_DFPROP_CODE: {PK, NotNull, CHAR(3), classification=EscapedDfpropCls} */
    protected String _escapedDfpropCode;

    /** ESCAPED_DFPROP_NAME: {VARCHAR(20)} */
    protected String _escapedDfpropName;

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
        return "white_escaped_dfprop";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteEscapedDfprop";
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
        if (getEscapedDfpropCode() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of escapedDfpropCode as the classification of EscapedDfpropCls. <br />
     * ESCAPED_DFPROP_CODE: {PK, NotNull, CHAR(3), classification=EscapedDfpropCls} <br />
     * delimiter; & endBrace} & path\foo\bar
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.EscapedDfpropCls getEscapedDfpropCodeAsEscapedDfpropCls() {
        return CDef.EscapedDfpropCls.codeOf(getEscapedDfpropCode());
    }

    /**
     * Set the value of escapedDfpropCode as the classification of EscapedDfpropCls. <br />
     * ESCAPED_DFPROP_CODE: {PK, NotNull, CHAR(3), classification=EscapedDfpropCls} <br />
     * delimiter; & endBrace} & path\foo\bar
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setEscapedDfpropCodeAsEscapedDfpropCls(CDef.EscapedDfpropCls cdef) {
        setEscapedDfpropCode(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of escapedDfpropCode as First (;@\\). <br />
     * First: delimiter & rear escape char
     */
    public void setEscapedDfpropCode_First() {
        setEscapedDfpropCodeAsEscapedDfpropCls(CDef.EscapedDfpropCls.First);
    }

    /**
     * Set the value of escapedDfpropCode as Second (\\};). <br />
     * Second: escape char & endBrace & delimiter
     */
    public void setEscapedDfpropCode_Second() {
        setEscapedDfpropCodeAsEscapedDfpropCls(CDef.EscapedDfpropCls.Second);
    }

    /**
     * Set the value of escapedDfpropCode as Third ({=}). <br />
     * Third: startBrace & equal & endBrace
     */
    public void setEscapedDfpropCode_Third() {
        setEscapedDfpropCodeAsEscapedDfpropCls(CDef.EscapedDfpropCls.Third);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of escapedDfpropCode First? <br />
     * First: delimiter & rear escape char
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isEscapedDfpropCodeFirst() {
        CDef.EscapedDfpropCls cdef = getEscapedDfpropCodeAsEscapedDfpropCls();
        return cdef != null ? cdef.equals(CDef.EscapedDfpropCls.First) : false;
    }

    /**
     * Is the value of escapedDfpropCode Second? <br />
     * Second: escape char & endBrace & delimiter
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isEscapedDfpropCodeSecond() {
        CDef.EscapedDfpropCls cdef = getEscapedDfpropCodeAsEscapedDfpropCls();
        return cdef != null ? cdef.equals(CDef.EscapedDfpropCls.Second) : false;
    }

    /**
     * Is the value of escapedDfpropCode Third? <br />
     * Third: startBrace & equal & endBrace
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isEscapedDfpropCodeThird() {
        CDef.EscapedDfpropCls cdef = getEscapedDfpropCodeAsEscapedDfpropCls();
        return cdef != null ? cdef.equals(CDef.EscapedDfpropCls.Third) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'escapedDfpropCode' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getEscapedDfpropCodeName() {
        CDef.EscapedDfpropCls cdef = getEscapedDfpropCodeAsEscapedDfpropCls();
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
     * @param obj The object as other entity. (NullAllowed: if null, returns false fixedly)
     * @return Comparing result.
     */
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BsWhiteEscapedDfprop)) { return false; }
        BsWhiteEscapedDfprop other = (BsWhiteEscapedDfprop)obj;
        if (!xSV(getEscapedDfpropCode(), other.getEscapedDfpropCode())) { return false; }
        return true;
    }
    protected boolean xSV(Object value1, Object value2) {
        return FunCustodial.isSameValue(value1, value2);
    }

    /**
     * Calculate the hash-code from primary-keys or columns.
     * @return The hash-code from primary-key or columns.
     */
    public int hashCode() {
        int result = 17;
        result = xCH(result, getTableDbName());
        result = xCH(result, getEscapedDfpropCode());
        return result;
    }
    protected int xCH(int result, Object value) {
        return FunCustodial.calculateHashcode(result, value);
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
        String delimiter = ", ";
        sb.append(delimiter).append(getEscapedDfpropCode());
        sb.append(delimiter).append(getEscapedDfpropName());
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
    public WhiteEscapedDfprop clone() {
        try {
            return (WhiteEscapedDfprop)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] ESCAPED_DFPROP_CODE: {PK, NotNull, CHAR(3), classification=EscapedDfpropCls} <br />
     * @return The value of the column 'ESCAPED_DFPROP_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getEscapedDfpropCode() {
        return _escapedDfpropCode;
    }

    /**
     * [set] ESCAPED_DFPROP_CODE: {PK, NotNull, CHAR(3), classification=EscapedDfpropCls} <br />
     * @param escapedDfpropCode The value of the column 'ESCAPED_DFPROP_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setEscapedDfpropCode(String escapedDfpropCode) {
        __modifiedProperties.addPropertyName("escapedDfpropCode");
        this._escapedDfpropCode = escapedDfpropCode;
    }

    /**
     * [get] ESCAPED_DFPROP_NAME: {VARCHAR(20)} <br />
     * @return The value of the column 'ESCAPED_DFPROP_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getEscapedDfpropName() {
        return _escapedDfpropName;
    }

    /**
     * [set] ESCAPED_DFPROP_NAME: {VARCHAR(20)} <br />
     * @param escapedDfpropName The value of the column 'ESCAPED_DFPROP_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEscapedDfpropName(String escapedDfpropName) {
        __modifiedProperties.addPropertyName("escapedDfpropName");
        this._escapedDfpropName = escapedDfpropName;
    }
}
