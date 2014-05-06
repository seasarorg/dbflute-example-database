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
 * The entity of WHITE_COMPOUND_PK_REF as TABLE. <br />
 * <pre>
 * [primary-key]
 *     MULTIPLE_FIRST_ID, MULTIPLE_SECOND_ID
 * 
 * [column]
 *     MULTIPLE_FIRST_ID, MULTIPLE_SECOND_ID, REF_FIRST_ID, REF_SECOND_ID, REF_NAME
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
 *     white_compound_pk
 * 
 * [referrer table]
 *     white_compound_pk_ref_nest
 * 
 * [foreign property]
 *     whiteCompoundPk
 * 
 * [referrer property]
 *     whiteCompoundPkRefNestByQuxMultipleIdList, whiteCompoundPkRefNestByFooMultipleIdList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer multipleFirstId = entity.getMultipleFirstId();
 * Integer multipleSecondId = entity.getMultipleSecondId();
 * Integer refFirstId = entity.getRefFirstId();
 * Integer refSecondId = entity.getRefSecondId();
 * String refName = entity.getRefName();
 * entity.setMultipleFirstId(multipleFirstId);
 * entity.setMultipleSecondId(multipleSecondId);
 * entity.setRefFirstId(refFirstId);
 * entity.setRefSecondId(refSecondId);
 * entity.setRefName(refName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteCompoundPkRef implements Entity, Serializable, Cloneable {

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
    /** MULTIPLE_FIRST_ID: {PK, NotNull, INT(10)} */
    protected Integer _multipleFirstId;

    /** MULTIPLE_SECOND_ID: {PK, NotNull, INT(10)} */
    protected Integer _multipleSecondId;

    /** REF_FIRST_ID: {IX, NotNull, INT(10), FK to white_compound_pk} */
    protected Integer _refFirstId;

    /** REF_SECOND_ID: {IX+, NotNull, INT(10), FK to white_compound_pk} */
    protected Integer _refSecondId;

    /** REF_NAME: {NotNull, VARCHAR(50)} */
    protected String _refName;

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
        return "white_compound_pk_ref";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteCompoundPkRef";
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
        if (getMultipleFirstId() == null) { return false; }
        if (getMultipleSecondId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** white_compound_pk by my REF_FIRST_ID, REF_SECOND_ID, named 'whiteCompoundPk'. */
    protected WhiteCompoundPk _whiteCompoundPk;

    /**
     * white_compound_pk by my REF_FIRST_ID, REF_SECOND_ID, named 'whiteCompoundPk'.
     * @return The entity of foreign property 'whiteCompoundPk'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteCompoundPk getWhiteCompoundPk() {
        return _whiteCompoundPk;
    }

    /**
     * white_compound_pk by my REF_FIRST_ID, REF_SECOND_ID, named 'whiteCompoundPk'.
     * @param whiteCompoundPk The entity of foreign property 'whiteCompoundPk'. (NullAllowed)
     */
    public void setWhiteCompoundPk(WhiteCompoundPk whiteCompoundPk) {
        _whiteCompoundPk = whiteCompoundPk;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** white_compound_pk_ref_nest by BAR_MULTIPLE_ID, QUX_MULTIPLE_ID, named 'whiteCompoundPkRefNestByQuxMultipleIdList'. */
    protected List<WhiteCompoundPkRefNest> _whiteCompoundPkRefNestByQuxMultipleIdList;

    /**
     * white_compound_pk_ref_nest by BAR_MULTIPLE_ID, QUX_MULTIPLE_ID, named 'whiteCompoundPkRefNestByQuxMultipleIdList'.
     * @return The entity list of referrer property 'whiteCompoundPkRefNestByQuxMultipleIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteCompoundPkRefNest> getWhiteCompoundPkRefNestByQuxMultipleIdList() {
        if (_whiteCompoundPkRefNestByQuxMultipleIdList == null) { _whiteCompoundPkRefNestByQuxMultipleIdList = newReferrerList(); }
        return _whiteCompoundPkRefNestByQuxMultipleIdList;
    }

    /**
     * white_compound_pk_ref_nest by BAR_MULTIPLE_ID, QUX_MULTIPLE_ID, named 'whiteCompoundPkRefNestByQuxMultipleIdList'.
     * @param whiteCompoundPkRefNestByQuxMultipleIdList The entity list of referrer property 'whiteCompoundPkRefNestByQuxMultipleIdList'. (NullAllowed)
     */
    public void setWhiteCompoundPkRefNestByQuxMultipleIdList(List<WhiteCompoundPkRefNest> whiteCompoundPkRefNestByQuxMultipleIdList) {
        _whiteCompoundPkRefNestByQuxMultipleIdList = whiteCompoundPkRefNestByQuxMultipleIdList;
    }

    /** white_compound_pk_ref_nest by FOO_MULTIPLE_ID, BAR_MULTIPLE_ID, named 'whiteCompoundPkRefNestByFooMultipleIdList'. */
    protected List<WhiteCompoundPkRefNest> _whiteCompoundPkRefNestByFooMultipleIdList;

    /**
     * white_compound_pk_ref_nest by FOO_MULTIPLE_ID, BAR_MULTIPLE_ID, named 'whiteCompoundPkRefNestByFooMultipleIdList'.
     * @return The entity list of referrer property 'whiteCompoundPkRefNestByFooMultipleIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteCompoundPkRefNest> getWhiteCompoundPkRefNestByFooMultipleIdList() {
        if (_whiteCompoundPkRefNestByFooMultipleIdList == null) { _whiteCompoundPkRefNestByFooMultipleIdList = newReferrerList(); }
        return _whiteCompoundPkRefNestByFooMultipleIdList;
    }

    /**
     * white_compound_pk_ref_nest by FOO_MULTIPLE_ID, BAR_MULTIPLE_ID, named 'whiteCompoundPkRefNestByFooMultipleIdList'.
     * @param whiteCompoundPkRefNestByFooMultipleIdList The entity list of referrer property 'whiteCompoundPkRefNestByFooMultipleIdList'. (NullAllowed)
     */
    public void setWhiteCompoundPkRefNestByFooMultipleIdList(List<WhiteCompoundPkRefNest> whiteCompoundPkRefNestByFooMultipleIdList) {
        _whiteCompoundPkRefNestByFooMultipleIdList = whiteCompoundPkRefNestByFooMultipleIdList;
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
        if (obj == null || !(obj instanceof BsWhiteCompoundPkRef)) { return false; }
        BsWhiteCompoundPkRef other = (BsWhiteCompoundPkRef)obj;
        if (!xSV(getMultipleFirstId(), other.getMultipleFirstId())) { return false; }
        if (!xSV(getMultipleSecondId(), other.getMultipleSecondId())) { return false; }
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
        result = xCH(result, getMultipleFirstId());
        result = xCH(result, getMultipleSecondId());
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
        String l = "\n  ";
        if (_whiteCompoundPk != null)
        { sb.append(l).append(xbRDS(_whiteCompoundPk, "whiteCompoundPk")); }
        if (_whiteCompoundPkRefNestByQuxMultipleIdList != null) { for (Entity e : _whiteCompoundPkRefNestByQuxMultipleIdList)
        { if (e != null) { sb.append(l).append(xbRDS(e, "whiteCompoundPkRefNestByQuxMultipleIdList")); } } }
        if (_whiteCompoundPkRefNestByFooMultipleIdList != null) { for (Entity e : _whiteCompoundPkRefNestByFooMultipleIdList)
        { if (e != null) { sb.append(l).append(xbRDS(e, "whiteCompoundPkRefNestByFooMultipleIdList")); } } }
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
        sb.append(delimiter).append(getMultipleFirstId());
        sb.append(delimiter).append(getMultipleSecondId());
        sb.append(delimiter).append(getRefFirstId());
        sb.append(delimiter).append(getRefSecondId());
        sb.append(delimiter).append(getRefName());
        if (sb.length() > delimiter.length()) {
            sb.delete(0, delimiter.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String c = ",";
        if (_whiteCompoundPk != null) { sb.append(c).append("whiteCompoundPk"); }
        if (_whiteCompoundPkRefNestByQuxMultipleIdList != null && !_whiteCompoundPkRefNestByQuxMultipleIdList.isEmpty())
        { sb.append(c).append("whiteCompoundPkRefNestByQuxMultipleIdList"); }
        if (_whiteCompoundPkRefNestByFooMultipleIdList != null && !_whiteCompoundPkRefNestByFooMultipleIdList.isEmpty())
        { sb.append(c).append("whiteCompoundPkRefNestByFooMultipleIdList"); }
        if (sb.length() > c.length()) {
            sb.delete(0, c.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public WhiteCompoundPkRef clone() {
        try {
            return (WhiteCompoundPkRef)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MULTIPLE_FIRST_ID: {PK, NotNull, INT(10)} <br />
     * @return The value of the column 'MULTIPLE_FIRST_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMultipleFirstId() {
        return _multipleFirstId;
    }

    /**
     * [set] MULTIPLE_FIRST_ID: {PK, NotNull, INT(10)} <br />
     * @param multipleFirstId The value of the column 'MULTIPLE_FIRST_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMultipleFirstId(Integer multipleFirstId) {
        __modifiedProperties.addPropertyName("multipleFirstId");
        this._multipleFirstId = multipleFirstId;
    }

    /**
     * [get] MULTIPLE_SECOND_ID: {PK, NotNull, INT(10)} <br />
     * @return The value of the column 'MULTIPLE_SECOND_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMultipleSecondId() {
        return _multipleSecondId;
    }

    /**
     * [set] MULTIPLE_SECOND_ID: {PK, NotNull, INT(10)} <br />
     * @param multipleSecondId The value of the column 'MULTIPLE_SECOND_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMultipleSecondId(Integer multipleSecondId) {
        __modifiedProperties.addPropertyName("multipleSecondId");
        this._multipleSecondId = multipleSecondId;
    }

    /**
     * [get] REF_FIRST_ID: {IX, NotNull, INT(10), FK to white_compound_pk} <br />
     * @return The value of the column 'REF_FIRST_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getRefFirstId() {
        return _refFirstId;
    }

    /**
     * [set] REF_FIRST_ID: {IX, NotNull, INT(10), FK to white_compound_pk} <br />
     * @param refFirstId The value of the column 'REF_FIRST_ID'. (basically NotNull if update: for the constraint)
     */
    public void setRefFirstId(Integer refFirstId) {
        __modifiedProperties.addPropertyName("refFirstId");
        this._refFirstId = refFirstId;
    }

    /**
     * [get] REF_SECOND_ID: {IX+, NotNull, INT(10), FK to white_compound_pk} <br />
     * @return The value of the column 'REF_SECOND_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getRefSecondId() {
        return _refSecondId;
    }

    /**
     * [set] REF_SECOND_ID: {IX+, NotNull, INT(10), FK to white_compound_pk} <br />
     * @param refSecondId The value of the column 'REF_SECOND_ID'. (basically NotNull if update: for the constraint)
     */
    public void setRefSecondId(Integer refSecondId) {
        __modifiedProperties.addPropertyName("refSecondId");
        this._refSecondId = refSecondId;
    }

    /**
     * [get] REF_NAME: {NotNull, VARCHAR(50)} <br />
     * @return The value of the column 'REF_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getRefName() {
        return _refName;
    }

    /**
     * [set] REF_NAME: {NotNull, VARCHAR(50)} <br />
     * @param refName The value of the column 'REF_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setRefName(String refName) {
        __modifiedProperties.addPropertyName("refName");
        this._refName = refName;
    }
}
