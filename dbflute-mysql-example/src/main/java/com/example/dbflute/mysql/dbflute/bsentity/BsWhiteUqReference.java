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
 * The entity of WHITE_UQ_REFERENCE as TABLE. <br />
 * <pre>
 * [primary-key]
 *     UQ_REFERENCE_ID
 * 
 * [column]
 *     UQ_REFERENCE_ID, UQ_REFERENCE_CODE
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
 *     white_uq_reference_ref
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     whiteUqReferenceRefByFkToPkIdList, whiteUqReferenceRefByFkToUqCodeList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long uqReferenceId = entity.getUqReferenceId();
 * String uqReferenceCode = entity.getUqReferenceCode();
 * entity.setUqReferenceId(uqReferenceId);
 * entity.setUqReferenceCode(uqReferenceCode);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteUqReference implements Entity, Serializable, Cloneable {

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
    /** UQ_REFERENCE_ID: {PK, NotNull, DECIMAL(16)} */
    protected Long _uqReferenceId;

    /** UQ_REFERENCE_CODE: {UQ, NotNull, CHAR(3)} */
    protected String _uqReferenceCode;

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
        return "white_uq_reference";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteUqReference";
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
        if (getUqReferenceId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** white_uq_reference_ref by FK_TO_PK_ID, named 'whiteUqReferenceRefByFkToPkIdList'. */
    protected List<WhiteUqReferenceRef> _whiteUqReferenceRefByFkToPkIdList;

    /**
     * white_uq_reference_ref by FK_TO_PK_ID, named 'whiteUqReferenceRefByFkToPkIdList'.
     * @return The entity list of referrer property 'whiteUqReferenceRefByFkToPkIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteUqReferenceRef> getWhiteUqReferenceRefByFkToPkIdList() {
        if (_whiteUqReferenceRefByFkToPkIdList == null) { _whiteUqReferenceRefByFkToPkIdList = newReferrerList(); }
        return _whiteUqReferenceRefByFkToPkIdList;
    }

    /**
     * white_uq_reference_ref by FK_TO_PK_ID, named 'whiteUqReferenceRefByFkToPkIdList'.
     * @param whiteUqReferenceRefByFkToPkIdList The entity list of referrer property 'whiteUqReferenceRefByFkToPkIdList'. (NullAllowed)
     */
    public void setWhiteUqReferenceRefByFkToPkIdList(List<WhiteUqReferenceRef> whiteUqReferenceRefByFkToPkIdList) {
        _whiteUqReferenceRefByFkToPkIdList = whiteUqReferenceRefByFkToPkIdList;
    }

    /** white_uq_reference_ref by FK_TO_UQ_CODE, named 'whiteUqReferenceRefByFkToUqCodeList'. */
    protected List<WhiteUqReferenceRef> _whiteUqReferenceRefByFkToUqCodeList;

    /**
     * white_uq_reference_ref by FK_TO_UQ_CODE, named 'whiteUqReferenceRefByFkToUqCodeList'.
     * @return The entity list of referrer property 'whiteUqReferenceRefByFkToUqCodeList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteUqReferenceRef> getWhiteUqReferenceRefByFkToUqCodeList() {
        if (_whiteUqReferenceRefByFkToUqCodeList == null) { _whiteUqReferenceRefByFkToUqCodeList = newReferrerList(); }
        return _whiteUqReferenceRefByFkToUqCodeList;
    }

    /**
     * white_uq_reference_ref by FK_TO_UQ_CODE, named 'whiteUqReferenceRefByFkToUqCodeList'.
     * @param whiteUqReferenceRefByFkToUqCodeList The entity list of referrer property 'whiteUqReferenceRefByFkToUqCodeList'. (NullAllowed)
     */
    public void setWhiteUqReferenceRefByFkToUqCodeList(List<WhiteUqReferenceRef> whiteUqReferenceRefByFkToUqCodeList) {
        _whiteUqReferenceRefByFkToUqCodeList = whiteUqReferenceRefByFkToUqCodeList;
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
        if (other == null || !(other instanceof BsWhiteUqReference)) { return false; }
        BsWhiteUqReference otherEntity = (BsWhiteUqReference)other;
        if (!xSV(getUqReferenceId(), otherEntity.getUqReferenceId())) { return false; }
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
        result = xCH(result, getUqReferenceId());
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
        if (_whiteUqReferenceRefByFkToPkIdList != null) { for (Entity e : _whiteUqReferenceRefByFkToPkIdList)
        { if (e != null) { sb.append(l).append(xbRDS(e, "whiteUqReferenceRefByFkToPkIdList")); } } }
        if (_whiteUqReferenceRefByFkToUqCodeList != null) { for (Entity e : _whiteUqReferenceRefByFkToUqCodeList)
        { if (e != null) { sb.append(l).append(xbRDS(e, "whiteUqReferenceRefByFkToUqCodeList")); } } }
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
        sb.append(delimiter).append(getUqReferenceId());
        sb.append(delimiter).append(getUqReferenceCode());
        if (sb.length() > delimiter.length()) {
            sb.delete(0, delimiter.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String c = ",";
        if (_whiteUqReferenceRefByFkToPkIdList != null && !_whiteUqReferenceRefByFkToPkIdList.isEmpty())
        { sb.append(c).append("whiteUqReferenceRefByFkToPkIdList"); }
        if (_whiteUqReferenceRefByFkToUqCodeList != null && !_whiteUqReferenceRefByFkToUqCodeList.isEmpty())
        { sb.append(c).append("whiteUqReferenceRefByFkToUqCodeList"); }
        if (sb.length() > c.length()) {
            sb.delete(0, c.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public WhiteUqReference clone() {
        try {
            return (WhiteUqReference)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] UQ_REFERENCE_ID: {PK, NotNull, DECIMAL(16)} <br />
     * @return The value of the column 'UQ_REFERENCE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getUqReferenceId() {
        return _uqReferenceId;
    }

    /**
     * [set] UQ_REFERENCE_ID: {PK, NotNull, DECIMAL(16)} <br />
     * @param uqReferenceId The value of the column 'UQ_REFERENCE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setUqReferenceId(Long uqReferenceId) {
        __modifiedProperties.addPropertyName("uqReferenceId");
        this._uqReferenceId = uqReferenceId;
    }

    /**
     * [get] UQ_REFERENCE_CODE: {UQ, NotNull, CHAR(3)} <br />
     * @return The value of the column 'UQ_REFERENCE_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getUqReferenceCode() {
        return _uqReferenceCode;
    }

    /**
     * [set] UQ_REFERENCE_CODE: {UQ, NotNull, CHAR(3)} <br />
     * @param uqReferenceCode The value of the column 'UQ_REFERENCE_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setUqReferenceCode(String uqReferenceCode) {
        __modifiedProperties.addPropertyName("uqReferenceCode");
        this._uqReferenceCode = uqReferenceCode;
    }
}
