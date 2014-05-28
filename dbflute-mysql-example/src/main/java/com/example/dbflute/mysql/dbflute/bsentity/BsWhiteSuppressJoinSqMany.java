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
 * The entity of WHITE_SUPPRESS_JOIN_SQ_MANY as TABLE. <br />
 * <pre>
 * [primary-key]
 *     MANY_ID
 * 
 * [column]
 *     MANY_ID, MANY_NAME, SUPPRESS_JOIN_SQ_ID, MANY_ONE_ID
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
 *     white_suppress_join_sq_many_one, white_suppress_join_sq
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     whiteSuppressJoinSqManyOne, whiteSuppressJoinSq
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer manyId = entity.getManyId();
 * String manyName = entity.getManyName();
 * Integer suppressJoinSqId = entity.getSuppressJoinSqId();
 * Integer manyOneId = entity.getManyOneId();
 * entity.setManyId(manyId);
 * entity.setManyName(manyName);
 * entity.setSuppressJoinSqId(suppressJoinSqId);
 * entity.setManyOneId(manyOneId);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteSuppressJoinSqMany implements Entity, Serializable, Cloneable {

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
    /** MANY_ID: {PK, NotNull, INT(10)} */
    protected Integer _manyId;

    /** MANY_NAME: {NotNull, VARCHAR(200)} */
    protected String _manyName;

    /** SUPPRESS_JOIN_SQ_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq} */
    protected Integer _suppressJoinSqId;

    /** MANY_ONE_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq_many_one} */
    protected Integer _manyOneId;

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
        return "white_suppress_join_sq_many";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteSuppressJoinSqMany";
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
        if (getManyId() == null) { return false; }
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
    /** white_suppress_join_sq_many_one by my MANY_ONE_ID, named 'whiteSuppressJoinSqManyOne'. */
    protected WhiteSuppressJoinSqManyOne _whiteSuppressJoinSqManyOne;

    /**
     * white_suppress_join_sq_many_one by my MANY_ONE_ID, named 'whiteSuppressJoinSqManyOne'.
     * @return The entity of foreign property 'whiteSuppressJoinSqManyOne'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteSuppressJoinSqManyOne getWhiteSuppressJoinSqManyOne() {
        return _whiteSuppressJoinSqManyOne;
    }

    /**
     * white_suppress_join_sq_many_one by my MANY_ONE_ID, named 'whiteSuppressJoinSqManyOne'.
     * @param whiteSuppressJoinSqManyOne The entity of foreign property 'whiteSuppressJoinSqManyOne'. (NullAllowed)
     */
    public void setWhiteSuppressJoinSqManyOne(WhiteSuppressJoinSqManyOne whiteSuppressJoinSqManyOne) {
        _whiteSuppressJoinSqManyOne = whiteSuppressJoinSqManyOne;
    }

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
        if (obj == null || !(obj instanceof BsWhiteSuppressJoinSqMany)) { return false; }
        BsWhiteSuppressJoinSqMany other = (BsWhiteSuppressJoinSqMany)obj;
        if (!xSV(getManyId(), other.getManyId())) { return false; }
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
        hs = xCH(hs, getManyId());
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
        if (_whiteSuppressJoinSqManyOne != null)
        { sb.append(li).append(xbRDS(_whiteSuppressJoinSqManyOne, "whiteSuppressJoinSqManyOne")); }
        if (_whiteSuppressJoinSq != null)
        { sb.append(li).append(xbRDS(_whiteSuppressJoinSq, "whiteSuppressJoinSq")); }
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
        sb.append(dm).append(getManyId());
        sb.append(dm).append(getManyName());
        sb.append(dm).append(getSuppressJoinSqId());
        sb.append(dm).append(getManyOneId());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String cm = ",";
        if (_whiteSuppressJoinSqManyOne != null) { sb.append(cm).append("whiteSuppressJoinSqManyOne"); }
        if (_whiteSuppressJoinSq != null) { sb.append(cm).append("whiteSuppressJoinSq"); }
        if (sb.length() > cm.length()) {
            sb.delete(0, cm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public WhiteSuppressJoinSqMany clone() {
        try {
            return (WhiteSuppressJoinSqMany)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MANY_ID: {PK, NotNull, INT(10)} <br />
     * @return The value of the column 'MANY_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getManyId() {
        return _manyId;
    }

    /**
     * [set] MANY_ID: {PK, NotNull, INT(10)} <br />
     * @param manyId The value of the column 'MANY_ID'. (basically NotNull if update: for the constraint)
     */
    public void setManyId(Integer manyId) {
        __modifiedProperties.addPropertyName("manyId");
        this._manyId = manyId;
    }

    /**
     * [get] MANY_NAME: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'MANY_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getManyName() {
        return _manyName;
    }

    /**
     * [set] MANY_NAME: {NotNull, VARCHAR(200)} <br />
     * @param manyName The value of the column 'MANY_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setManyName(String manyName) {
        __modifiedProperties.addPropertyName("manyName");
        this._manyName = manyName;
    }

    /**
     * [get] SUPPRESS_JOIN_SQ_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq} <br />
     * @return The value of the column 'SUPPRESS_JOIN_SQ_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getSuppressJoinSqId() {
        return _suppressJoinSqId;
    }

    /**
     * [set] SUPPRESS_JOIN_SQ_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq} <br />
     * @param suppressJoinSqId The value of the column 'SUPPRESS_JOIN_SQ_ID'. (basically NotNull if update: for the constraint)
     */
    public void setSuppressJoinSqId(Integer suppressJoinSqId) {
        __modifiedProperties.addPropertyName("suppressJoinSqId");
        this._suppressJoinSqId = suppressJoinSqId;
    }

    /**
     * [get] MANY_ONE_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq_many_one} <br />
     * @return The value of the column 'MANY_ONE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getManyOneId() {
        return _manyOneId;
    }

    /**
     * [set] MANY_ONE_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq_many_one} <br />
     * @param manyOneId The value of the column 'MANY_ONE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setManyOneId(Integer manyOneId) {
        __modifiedProperties.addPropertyName("manyOneId");
        this._manyOneId = manyOneId;
    }
}
