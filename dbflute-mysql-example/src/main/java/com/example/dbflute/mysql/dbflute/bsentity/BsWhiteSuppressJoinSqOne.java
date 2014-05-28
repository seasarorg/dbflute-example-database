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
 * The entity of WHITE_SUPPRESS_JOIN_SQ_ONE as TABLE. <br />
 * <pre>
 * [primary-key]
 *     ONE_ID
 * 
 * [column]
 *     ONE_ID, ONE_NAME, SUPPRESS_JOIN_SQ_ID, ONE_ADDI_ID
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
 *     white_suppress_join_sq, WHITE_SUPPRESS_JOIN_SQ_ONE_ADDI
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     whiteSuppressJoinSq, whiteSuppressJoinSqOneAddi
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer oneId = entity.getOneId();
 * String oneName = entity.getOneName();
 * Integer suppressJoinSqId = entity.getSuppressJoinSqId();
 * Integer oneAddiId = entity.getOneAddiId();
 * entity.setOneId(oneId);
 * entity.setOneName(oneName);
 * entity.setSuppressJoinSqId(suppressJoinSqId);
 * entity.setOneAddiId(oneAddiId);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteSuppressJoinSqOne implements Entity, Serializable, Cloneable {

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
    /** ONE_ID: {PK, NotNull, INT(10)} */
    protected Integer _oneId;

    /** ONE_NAME: {NotNull, VARCHAR(200)} */
    protected String _oneName;

    /** SUPPRESS_JOIN_SQ_ID: {UQ, NotNull, INT(10), FK to white_suppress_join_sq} */
    protected Integer _suppressJoinSqId;

    /** ONE_ADDI_ID: {NotNull, INT(10), FK to WHITE_SUPPRESS_JOIN_SQ_ONE_ADDI} */
    protected Integer _oneAddiId;

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
        return "white_suppress_join_sq_one";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteSuppressJoinSqOne";
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
        if (getOneId() == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br />
     * You can update the entity by the key when entity update (NOT batch update).
     * @param suppressJoinSqId : UQ, NotNull, INT(10), FK to white_suppress_join_sq. (NotNull)
     */
    public void uniqueBy(Integer suppressJoinSqId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("suppressJoinSqId");
        setSuppressJoinSqId(suppressJoinSqId);
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
    /** white_suppress_join_sq by my SUPPRESS_JOIN_SQ_ID, named 'whiteSuppressJoinSq'. */
    protected WhiteSuppressJoinSq _whiteSuppressJoinSq;

    /**
     * white_suppress_join_sq by my SUPPRESS_JOIN_SQ_ID, named 'whiteSuppressJoinSq'.
     * @return The entity of foreign property 'whiteSuppressJoinSq'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteSuppressJoinSq getWhiteSuppressJoinSq() {
        return _whiteSuppressJoinSq;
    }

    /**
     * white_suppress_join_sq by my SUPPRESS_JOIN_SQ_ID, named 'whiteSuppressJoinSq'.
     * @param whiteSuppressJoinSq The entity of foreign property 'whiteSuppressJoinSq'. (NullAllowed)
     */
    public void setWhiteSuppressJoinSq(WhiteSuppressJoinSq whiteSuppressJoinSq) {
        _whiteSuppressJoinSq = whiteSuppressJoinSq;
    }

    /** white_suppress_join_sq_one_addi by my ONE_ADDI_ID, named 'whiteSuppressJoinSqOneAddi'. */
    protected WhiteSuppressJoinSqOneAddi _whiteSuppressJoinSqOneAddi;

    /**
     * white_suppress_join_sq_one_addi by my ONE_ADDI_ID, named 'whiteSuppressJoinSqOneAddi'.
     * @return The entity of foreign property 'whiteSuppressJoinSqOneAddi'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteSuppressJoinSqOneAddi getWhiteSuppressJoinSqOneAddi() {
        return _whiteSuppressJoinSqOneAddi;
    }

    /**
     * white_suppress_join_sq_one_addi by my ONE_ADDI_ID, named 'whiteSuppressJoinSqOneAddi'.
     * @param whiteSuppressJoinSqOneAddi The entity of foreign property 'whiteSuppressJoinSqOneAddi'. (NullAllowed)
     */
    public void setWhiteSuppressJoinSqOneAddi(WhiteSuppressJoinSqOneAddi whiteSuppressJoinSqOneAddi) {
        _whiteSuppressJoinSqOneAddi = whiteSuppressJoinSqOneAddi;
    }

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
        if (obj == null || !(obj instanceof BsWhiteSuppressJoinSqOne)) { return false; }
        BsWhiteSuppressJoinSqOne other = (BsWhiteSuppressJoinSqOne)obj;
        if (!xSV(getOneId(), other.getOneId())) { return false; }
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
        hs = xCH(hs, getOneId());
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
        if (_whiteSuppressJoinSq != null)
        { sb.append(li).append(xbRDS(_whiteSuppressJoinSq, "whiteSuppressJoinSq")); }
        if (_whiteSuppressJoinSqOneAddi != null)
        { sb.append(li).append(xbRDS(_whiteSuppressJoinSqOneAddi, "whiteSuppressJoinSqOneAddi")); }
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
        sb.append(dm).append(getOneId());
        sb.append(dm).append(getOneName());
        sb.append(dm).append(getSuppressJoinSqId());
        sb.append(dm).append(getOneAddiId());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String cm = ",";
        if (_whiteSuppressJoinSq != null) { sb.append(cm).append("whiteSuppressJoinSq"); }
        if (_whiteSuppressJoinSqOneAddi != null) { sb.append(cm).append("whiteSuppressJoinSqOneAddi"); }
        if (sb.length() > cm.length()) {
            sb.delete(0, cm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public WhiteSuppressJoinSqOne clone() {
        try {
            return (WhiteSuppressJoinSqOne)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] ONE_ID: {PK, NotNull, INT(10)} <br />
     * @return The value of the column 'ONE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getOneId() {
        return _oneId;
    }

    /**
     * [set] ONE_ID: {PK, NotNull, INT(10)} <br />
     * @param oneId The value of the column 'ONE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setOneId(Integer oneId) {
        __modifiedProperties.addPropertyName("oneId");
        this._oneId = oneId;
    }

    /**
     * [get] ONE_NAME: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'ONE_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getOneName() {
        return _oneName;
    }

    /**
     * [set] ONE_NAME: {NotNull, VARCHAR(200)} <br />
     * @param oneName The value of the column 'ONE_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setOneName(String oneName) {
        __modifiedProperties.addPropertyName("oneName");
        this._oneName = oneName;
    }

    /**
     * [get] SUPPRESS_JOIN_SQ_ID: {UQ, NotNull, INT(10), FK to white_suppress_join_sq} <br />
     * @return The value of the column 'SUPPRESS_JOIN_SQ_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getSuppressJoinSqId() {
        return _suppressJoinSqId;
    }

    /**
     * [set] SUPPRESS_JOIN_SQ_ID: {UQ, NotNull, INT(10), FK to white_suppress_join_sq} <br />
     * @param suppressJoinSqId The value of the column 'SUPPRESS_JOIN_SQ_ID'. (basically NotNull if update: for the constraint)
     */
    public void setSuppressJoinSqId(Integer suppressJoinSqId) {
        __modifiedProperties.addPropertyName("suppressJoinSqId");
        this._suppressJoinSqId = suppressJoinSqId;
    }

    /**
     * [get] ONE_ADDI_ID: {NotNull, INT(10), FK to WHITE_SUPPRESS_JOIN_SQ_ONE_ADDI} <br />
     * @return The value of the column 'ONE_ADDI_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getOneAddiId() {
        return _oneAddiId;
    }

    /**
     * [set] ONE_ADDI_ID: {NotNull, INT(10), FK to WHITE_SUPPRESS_JOIN_SQ_ONE_ADDI} <br />
     * @param oneAddiId The value of the column 'ONE_ADDI_ID'. (basically NotNull if update: for the constraint)
     */
    public void setOneAddiId(Integer oneAddiId) {
        __modifiedProperties.addPropertyName("oneAddiId");
        this._oneAddiId = oneAddiId;
    }
}
