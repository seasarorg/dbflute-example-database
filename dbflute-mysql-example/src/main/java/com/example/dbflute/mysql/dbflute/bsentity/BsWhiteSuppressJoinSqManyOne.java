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
 * The entity of WHITE_SUPPRESS_JOIN_SQ_MANY_ONE as TABLE. <br />
 * <pre>
 * [primary-key]
 *     MANY_ONE_ID
 * 
 * [column]
 *     MANY_ONE_ID, MANY_ONE_NAME, MANY_ONE_ONE_ID
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
 *     white_suppress_join_sq_many_one_one
 * 
 * [referrer table]
 *     white_suppress_join_sq_many
 * 
 * [foreign property]
 *     whiteSuppressJoinSqManyOneOne
 * 
 * [referrer property]
 *     whiteSuppressJoinSqManyList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer manyOneId = entity.getManyOneId();
 * String manyOneName = entity.getManyOneName();
 * Integer manyOneOneId = entity.getManyOneOneId();
 * entity.setManyOneId(manyOneId);
 * entity.setManyOneName(manyOneName);
 * entity.setManyOneOneId(manyOneOneId);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteSuppressJoinSqManyOne implements Entity, Serializable, Cloneable {

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
    /** MANY_ONE_ID: {PK, NotNull, INT(10)} */
    protected Integer _manyOneId;

    /** MANY_ONE_NAME: {NotNull, VARCHAR(200)} */
    protected String _manyOneName;

    /** MANY_ONE_ONE_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq_many_one_one} */
    protected Integer _manyOneOneId;

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
        return "white_suppress_join_sq_many_one";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteSuppressJoinSqManyOne";
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
        if (getManyOneId() == null) { return false; }
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
    /** white_suppress_join_sq_many_one_one by my MANY_ONE_ONE_ID, named 'whiteSuppressJoinSqManyOneOne'. */
    protected WhiteSuppressJoinSqManyOneOne _whiteSuppressJoinSqManyOneOne;

    /**
     * [get] white_suppress_join_sq_many_one_one by my MANY_ONE_ONE_ID, named 'whiteSuppressJoinSqManyOneOne'.
     * @return The entity of foreign property 'whiteSuppressJoinSqManyOneOne'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteSuppressJoinSqManyOneOne getWhiteSuppressJoinSqManyOneOne() {
        return _whiteSuppressJoinSqManyOneOne;
    }

    /**
     * [set] white_suppress_join_sq_many_one_one by my MANY_ONE_ONE_ID, named 'whiteSuppressJoinSqManyOneOne'.
     * @param whiteSuppressJoinSqManyOneOne The entity of foreign property 'whiteSuppressJoinSqManyOneOne'. (NullAllowed)
     */
    public void setWhiteSuppressJoinSqManyOneOne(WhiteSuppressJoinSqManyOneOne whiteSuppressJoinSqManyOneOne) {
        _whiteSuppressJoinSqManyOneOne = whiteSuppressJoinSqManyOneOne;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** white_suppress_join_sq_many by MANY_ONE_ID, named 'whiteSuppressJoinSqManyList'. */
    protected List<WhiteSuppressJoinSqMany> _whiteSuppressJoinSqManyList;

    /**
     * [get] white_suppress_join_sq_many by MANY_ONE_ID, named 'whiteSuppressJoinSqManyList'.
     * @return The entity list of referrer property 'whiteSuppressJoinSqManyList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteSuppressJoinSqMany> getWhiteSuppressJoinSqManyList() {
        if (_whiteSuppressJoinSqManyList == null) { _whiteSuppressJoinSqManyList = newReferrerList(); }
        return _whiteSuppressJoinSqManyList;
    }

    /**
     * [set] white_suppress_join_sq_many by MANY_ONE_ID, named 'whiteSuppressJoinSqManyList'.
     * @param whiteSuppressJoinSqManyList The entity list of referrer property 'whiteSuppressJoinSqManyList'. (NullAllowed)
     */
    public void setWhiteSuppressJoinSqManyList(List<WhiteSuppressJoinSqMany> whiteSuppressJoinSqManyList) {
        _whiteSuppressJoinSqManyList = whiteSuppressJoinSqManyList;
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
        if (obj == null || !(obj instanceof BsWhiteSuppressJoinSqManyOne)) { return false; }
        BsWhiteSuppressJoinSqManyOne other = (BsWhiteSuppressJoinSqManyOne)obj;
        if (!xSV(getManyOneId(), other.getManyOneId())) { return false; }
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
        hs = xCH(hs, getManyOneId());
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
        if (_whiteSuppressJoinSqManyOneOne != null)
        { sb.append(li).append(xbRDS(_whiteSuppressJoinSqManyOneOne, "whiteSuppressJoinSqManyOneOne")); }
        if (_whiteSuppressJoinSqManyList != null) { for (Entity et : _whiteSuppressJoinSqManyList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whiteSuppressJoinSqManyList")); } } }
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
        sb.append(dm).append(getManyOneId());
        sb.append(dm).append(getManyOneName());
        sb.append(dm).append(getManyOneOneId());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String cm = ",";
        if (_whiteSuppressJoinSqManyOneOne != null) { sb.append(cm).append("whiteSuppressJoinSqManyOneOne"); }
        if (_whiteSuppressJoinSqManyList != null && !_whiteSuppressJoinSqManyList.isEmpty())
        { sb.append(cm).append("whiteSuppressJoinSqManyList"); }
        if (sb.length() > cm.length()) {
            sb.delete(0, cm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public WhiteSuppressJoinSqManyOne clone() {
        try {
            return (WhiteSuppressJoinSqManyOne)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MANY_ONE_ID: {PK, NotNull, INT(10)} <br />
     * @return The value of the column 'MANY_ONE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getManyOneId() {
        return _manyOneId;
    }

    /**
     * [set] MANY_ONE_ID: {PK, NotNull, INT(10)} <br />
     * @param manyOneId The value of the column 'MANY_ONE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setManyOneId(Integer manyOneId) {
        __modifiedProperties.addPropertyName("manyOneId");
        _manyOneId = manyOneId;
    }

    /**
     * [get] MANY_ONE_NAME: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'MANY_ONE_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getManyOneName() {
        return _manyOneName;
    }

    /**
     * [set] MANY_ONE_NAME: {NotNull, VARCHAR(200)} <br />
     * @param manyOneName The value of the column 'MANY_ONE_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setManyOneName(String manyOneName) {
        __modifiedProperties.addPropertyName("manyOneName");
        _manyOneName = manyOneName;
    }

    /**
     * [get] MANY_ONE_ONE_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq_many_one_one} <br />
     * @return The value of the column 'MANY_ONE_ONE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getManyOneOneId() {
        return _manyOneOneId;
    }

    /**
     * [set] MANY_ONE_ONE_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq_many_one_one} <br />
     * @param manyOneOneId The value of the column 'MANY_ONE_ONE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setManyOneOneId(Integer manyOneOneId) {
        __modifiedProperties.addPropertyName("manyOneOneId");
        _manyOneOneId = manyOneOneId;
    }
}
