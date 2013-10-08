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
 * The entity of WHITE_UQ_REFERENCE_REF as TABLE. <br />
 * <pre>
 * [primary-key]
 *     UQ_REFERENCE_REF_ID
 * 
 * [column]
 *     UQ_REFERENCE_REF_ID, FK_TO_PK_ID, FK_TO_UQ_CODE, COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE
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
 *     white_uq_reference
 * 
 * [referrer table]
 *     white_uq_reference_ref_nest
 * 
 * [foreign property]
 *     whiteUqReferenceByFkToPkId, whiteUqReferenceByFkToUqCode
 * 
 * [referrer property]
 *     whiteUqReferenceRefNestList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long uqReferenceRefId = entity.getUqReferenceRefId();
 * Long fkToPkId = entity.getFkToPkId();
 * String fkToUqCode = entity.getFkToUqCode();
 * String compoundUqFirstCode = entity.getCompoundUqFirstCode();
 * String compoundUqSecondCode = entity.getCompoundUqSecondCode();
 * entity.setUqReferenceRefId(uqReferenceRefId);
 * entity.setFkToPkId(fkToPkId);
 * entity.setFkToUqCode(fkToUqCode);
 * entity.setCompoundUqFirstCode(compoundUqFirstCode);
 * entity.setCompoundUqSecondCode(compoundUqSecondCode);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteUqReferenceRef implements Entity, Serializable, Cloneable {

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
    /** UQ_REFERENCE_REF_ID: {PK, NotNull, DECIMAL(16)} */
    protected Long _uqReferenceRefId;

    /** FK_TO_PK_ID: {IX, NotNull, DECIMAL(16), FK to white_uq_reference} */
    protected Long _fkToPkId;

    /** FK_TO_UQ_CODE: {IX, NotNull, CHAR(3), FK to white_uq_reference} */
    protected String _fkToUqCode;

    /** COMPOUND_UQ_FIRST_CODE: {UQ, NotNull, CHAR(3)} */
    protected String _compoundUqFirstCode;

    /** COMPOUND_UQ_SECOND_CODE: {UQ+, NotNull, CHAR(3)} */
    protected String _compoundUqSecondCode;

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
        return "white_uq_reference_ref";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteUqReferenceRef";
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
        if (getUqReferenceRefId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** white_uq_reference by my FK_TO_PK_ID, named 'whiteUqReferenceByFkToPkId'. */
    protected WhiteUqReference _whiteUqReferenceByFkToPkId;

    /**
     * white_uq_reference by my FK_TO_PK_ID, named 'whiteUqReferenceByFkToPkId'.
     * @return The entity of foreign property 'whiteUqReferenceByFkToPkId'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteUqReference getWhiteUqReferenceByFkToPkId() {
        return _whiteUqReferenceByFkToPkId;
    }

    /**
     * white_uq_reference by my FK_TO_PK_ID, named 'whiteUqReferenceByFkToPkId'.
     * @param whiteUqReferenceByFkToPkId The entity of foreign property 'whiteUqReferenceByFkToPkId'. (NullAllowed)
     */
    public void setWhiteUqReferenceByFkToPkId(WhiteUqReference whiteUqReferenceByFkToPkId) {
        _whiteUqReferenceByFkToPkId = whiteUqReferenceByFkToPkId;
    }

    /** white_uq_reference by my FK_TO_UQ_CODE, named 'whiteUqReferenceByFkToUqCode'. */
    protected WhiteUqReference _whiteUqReferenceByFkToUqCode;

    /**
     * white_uq_reference by my FK_TO_UQ_CODE, named 'whiteUqReferenceByFkToUqCode'.
     * @return The entity of foreign property 'whiteUqReferenceByFkToUqCode'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteUqReference getWhiteUqReferenceByFkToUqCode() {
        return _whiteUqReferenceByFkToUqCode;
    }

    /**
     * white_uq_reference by my FK_TO_UQ_CODE, named 'whiteUqReferenceByFkToUqCode'.
     * @param whiteUqReferenceByFkToUqCode The entity of foreign property 'whiteUqReferenceByFkToUqCode'. (NullAllowed)
     */
    public void setWhiteUqReferenceByFkToUqCode(WhiteUqReference whiteUqReferenceByFkToUqCode) {
        _whiteUqReferenceByFkToUqCode = whiteUqReferenceByFkToUqCode;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** white_uq_reference_ref_nest by COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE, named 'whiteUqReferenceRefNestList'. */
    protected List<WhiteUqReferenceRefNest> _whiteUqReferenceRefNestList;

    /**
     * white_uq_reference_ref_nest by COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE, named 'whiteUqReferenceRefNestList'.
     * @return The entity list of referrer property 'whiteUqReferenceRefNestList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteUqReferenceRefNest> getWhiteUqReferenceRefNestList() {
        if (_whiteUqReferenceRefNestList == null) { _whiteUqReferenceRefNestList = newReferrerList(); }
        return _whiteUqReferenceRefNestList;
    }

    /**
     * white_uq_reference_ref_nest by COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE, named 'whiteUqReferenceRefNestList'.
     * @param whiteUqReferenceRefNestList The entity list of referrer property 'whiteUqReferenceRefNestList'. (NullAllowed)
     */
    public void setWhiteUqReferenceRefNestList(List<WhiteUqReferenceRefNest> whiteUqReferenceRefNestList) {
        _whiteUqReferenceRefNestList = whiteUqReferenceRefNestList;
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
        if (other == null || !(other instanceof BsWhiteUqReferenceRef)) { return false; }
        BsWhiteUqReferenceRef otherEntity = (BsWhiteUqReferenceRef)other;
        if (!xSV(getUqReferenceRefId(), otherEntity.getUqReferenceRefId())) { return false; }
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
        result = xCH(result, getUqReferenceRefId());
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
        if (_whiteUqReferenceByFkToPkId != null)
        { sb.append(l).append(xbRDS(_whiteUqReferenceByFkToPkId, "whiteUqReferenceByFkToPkId")); }
        if (_whiteUqReferenceByFkToUqCode != null)
        { sb.append(l).append(xbRDS(_whiteUqReferenceByFkToUqCode, "whiteUqReferenceByFkToUqCode")); }
        if (_whiteUqReferenceRefNestList != null) { for (Entity e : _whiteUqReferenceRefNestList)
        { if (e != null) { sb.append(l).append(xbRDS(e, "whiteUqReferenceRefNestList")); } } }
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
        sb.append(delimiter).append(getUqReferenceRefId());
        sb.append(delimiter).append(getFkToPkId());
        sb.append(delimiter).append(getFkToUqCode());
        sb.append(delimiter).append(getCompoundUqFirstCode());
        sb.append(delimiter).append(getCompoundUqSecondCode());
        if (sb.length() > delimiter.length()) {
            sb.delete(0, delimiter.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String c = ",";
        if (_whiteUqReferenceByFkToPkId != null) { sb.append(c).append("whiteUqReferenceByFkToPkId"); }
        if (_whiteUqReferenceByFkToUqCode != null) { sb.append(c).append("whiteUqReferenceByFkToUqCode"); }
        if (_whiteUqReferenceRefNestList != null && !_whiteUqReferenceRefNestList.isEmpty())
        { sb.append(c).append("whiteUqReferenceRefNestList"); }
        if (sb.length() > c.length()) {
            sb.delete(0, c.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public WhiteUqReferenceRef clone() {
        try {
            return (WhiteUqReferenceRef)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] UQ_REFERENCE_REF_ID: {PK, NotNull, DECIMAL(16)} <br />
     * @return The value of the column 'UQ_REFERENCE_REF_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getUqReferenceRefId() {
        return _uqReferenceRefId;
    }

    /**
     * [set] UQ_REFERENCE_REF_ID: {PK, NotNull, DECIMAL(16)} <br />
     * @param uqReferenceRefId The value of the column 'UQ_REFERENCE_REF_ID'. (basically NotNull if update: for the constraint)
     */
    public void setUqReferenceRefId(Long uqReferenceRefId) {
        __modifiedProperties.addPropertyName("uqReferenceRefId");
        this._uqReferenceRefId = uqReferenceRefId;
    }

    /**
     * [get] FK_TO_PK_ID: {IX, NotNull, DECIMAL(16), FK to white_uq_reference} <br />
     * @return The value of the column 'FK_TO_PK_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getFkToPkId() {
        return _fkToPkId;
    }

    /**
     * [set] FK_TO_PK_ID: {IX, NotNull, DECIMAL(16), FK to white_uq_reference} <br />
     * @param fkToPkId The value of the column 'FK_TO_PK_ID'. (basically NotNull if update: for the constraint)
     */
    public void setFkToPkId(Long fkToPkId) {
        __modifiedProperties.addPropertyName("fkToPkId");
        this._fkToPkId = fkToPkId;
    }

    /**
     * [get] FK_TO_UQ_CODE: {IX, NotNull, CHAR(3), FK to white_uq_reference} <br />
     * @return The value of the column 'FK_TO_UQ_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getFkToUqCode() {
        return _fkToUqCode;
    }

    /**
     * [set] FK_TO_UQ_CODE: {IX, NotNull, CHAR(3), FK to white_uq_reference} <br />
     * @param fkToUqCode The value of the column 'FK_TO_UQ_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setFkToUqCode(String fkToUqCode) {
        __modifiedProperties.addPropertyName("fkToUqCode");
        this._fkToUqCode = fkToUqCode;
    }

    /**
     * [get] COMPOUND_UQ_FIRST_CODE: {UQ, NotNull, CHAR(3)} <br />
     * @return The value of the column 'COMPOUND_UQ_FIRST_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getCompoundUqFirstCode() {
        return _compoundUqFirstCode;
    }

    /**
     * [set] COMPOUND_UQ_FIRST_CODE: {UQ, NotNull, CHAR(3)} <br />
     * @param compoundUqFirstCode The value of the column 'COMPOUND_UQ_FIRST_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setCompoundUqFirstCode(String compoundUqFirstCode) {
        __modifiedProperties.addPropertyName("compoundUqFirstCode");
        this._compoundUqFirstCode = compoundUqFirstCode;
    }

    /**
     * [get] COMPOUND_UQ_SECOND_CODE: {UQ+, NotNull, CHAR(3)} <br />
     * @return The value of the column 'COMPOUND_UQ_SECOND_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getCompoundUqSecondCode() {
        return _compoundUqSecondCode;
    }

    /**
     * [set] COMPOUND_UQ_SECOND_CODE: {UQ+, NotNull, CHAR(3)} <br />
     * @param compoundUqSecondCode The value of the column 'COMPOUND_UQ_SECOND_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setCompoundUqSecondCode(String compoundUqSecondCode) {
        __modifiedProperties.addPropertyName("compoundUqSecondCode");
        this._compoundUqSecondCode = compoundUqSecondCode;
    }
}
