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
 * The entity of WHITE_SPLIT_MULTIPLE_FK_BASE as TABLE. <br />
 * <pre>
 * [primary-key]
 *     BASE_ID
 * 
 * [column]
 *     BASE_ID, FIRST_ID, NEXT_ID, SPLIT_NAME
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
 *     white_split_multiple_fk_next, WHITE_SPLIT_MULTIPLE_FK_REF(AsSplitMultipleFkTest)
 * 
 * [referrer table]
 *     white_split_multiple_fk_child
 * 
 * [foreign property]
 *     whiteSplitMultipleFkNext, whiteSplitMultipleFkRefAsSplitMultipleFkTest
 * 
 * [referrer property]
 *     whiteSplitMultipleFkChildList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long baseId = entity.getBaseId();
 * Integer firstId = entity.getFirstId();
 * Long nextId = entity.getNextId();
 * String splitName = entity.getSplitName();
 * entity.setBaseId(baseId);
 * entity.setFirstId(firstId);
 * entity.setNextId(nextId);
 * entity.setSplitName(splitName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteSplitMultipleFkBase implements Entity, Serializable, Cloneable {

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
    /** BASE_ID: {PK, NotNull, BIGINT(19)} */
    protected Long _baseId;

    /** FIRST_ID: {NotNull, INT(10), FK to WHITE_SPLIT_MULTIPLE_FK_REF} */
    protected Integer _firstId;

    /** NEXT_ID: {IX, NotNull, BIGINT(19), FK to white_split_multiple_fk_next} */
    protected Long _nextId;

    /** SPLIT_NAME: {NotNull, VARCHAR(200)} */
    protected String _splitName;

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
        return "white_split_multiple_fk_base";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteSplitMultipleFkBase";
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
        if (getBaseId() == null) { return false; }
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
    /** white_split_multiple_fk_next by my NEXT_ID, named 'whiteSplitMultipleFkNext'. */
    protected WhiteSplitMultipleFkNext _whiteSplitMultipleFkNext;

    /**
     * [get] white_split_multiple_fk_next by my NEXT_ID, named 'whiteSplitMultipleFkNext'.
     * @return The entity of foreign property 'whiteSplitMultipleFkNext'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteSplitMultipleFkNext getWhiteSplitMultipleFkNext() {
        return _whiteSplitMultipleFkNext;
    }

    /**
     * [set] white_split_multiple_fk_next by my NEXT_ID, named 'whiteSplitMultipleFkNext'.
     * @param whiteSplitMultipleFkNext The entity of foreign property 'whiteSplitMultipleFkNext'. (NullAllowed)
     */
    public void setWhiteSplitMultipleFkNext(WhiteSplitMultipleFkNext whiteSplitMultipleFkNext) {
        _whiteSplitMultipleFkNext = whiteSplitMultipleFkNext;
    }

    /** white_split_multiple_fk_ref by my FIRST_ID, named 'whiteSplitMultipleFkRefAsSplitMultipleFkTest'. */
    protected WhiteSplitMultipleFkRef _whiteSplitMultipleFkRefAsSplitMultipleFkTest;

    /**
     * [get] white_split_multiple_fk_ref by my FIRST_ID, named 'whiteSplitMultipleFkRefAsSplitMultipleFkTest'.
     * @return The entity of foreign property 'whiteSplitMultipleFkRefAsSplitMultipleFkTest'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteSplitMultipleFkRef getWhiteSplitMultipleFkRefAsSplitMultipleFkTest() {
        return _whiteSplitMultipleFkRefAsSplitMultipleFkTest;
    }

    /**
     * [set] white_split_multiple_fk_ref by my FIRST_ID, named 'whiteSplitMultipleFkRefAsSplitMultipleFkTest'.
     * @param whiteSplitMultipleFkRefAsSplitMultipleFkTest The entity of foreign property 'whiteSplitMultipleFkRefAsSplitMultipleFkTest'. (NullAllowed)
     */
    public void setWhiteSplitMultipleFkRefAsSplitMultipleFkTest(WhiteSplitMultipleFkRef whiteSplitMultipleFkRefAsSplitMultipleFkTest) {
        _whiteSplitMultipleFkRefAsSplitMultipleFkTest = whiteSplitMultipleFkRefAsSplitMultipleFkTest;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** white_split_multiple_fk_child by BASE_ID, named 'whiteSplitMultipleFkChildList'. */
    protected List<WhiteSplitMultipleFkChild> _whiteSplitMultipleFkChildList;

    /**
     * [get] white_split_multiple_fk_child by BASE_ID, named 'whiteSplitMultipleFkChildList'.
     * @return The entity list of referrer property 'whiteSplitMultipleFkChildList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteSplitMultipleFkChild> getWhiteSplitMultipleFkChildList() {
        if (_whiteSplitMultipleFkChildList == null) { _whiteSplitMultipleFkChildList = newReferrerList(); }
        return _whiteSplitMultipleFkChildList;
    }

    /**
     * [set] white_split_multiple_fk_child by BASE_ID, named 'whiteSplitMultipleFkChildList'.
     * @param whiteSplitMultipleFkChildList The entity list of referrer property 'whiteSplitMultipleFkChildList'. (NullAllowed)
     */
    public void setWhiteSplitMultipleFkChildList(List<WhiteSplitMultipleFkChild> whiteSplitMultipleFkChildList) {
        _whiteSplitMultipleFkChildList = whiteSplitMultipleFkChildList;
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
        if (obj == null || !(obj instanceof BsWhiteSplitMultipleFkBase)) { return false; }
        BsWhiteSplitMultipleFkBase other = (BsWhiteSplitMultipleFkBase)obj;
        if (!xSV(getBaseId(), other.getBaseId())) { return false; }
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
        hs = xCH(hs, getBaseId());
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
        if (_whiteSplitMultipleFkNext != null)
        { sb.append(li).append(xbRDS(_whiteSplitMultipleFkNext, "whiteSplitMultipleFkNext")); }
        if (_whiteSplitMultipleFkRefAsSplitMultipleFkTest != null)
        { sb.append(li).append(xbRDS(_whiteSplitMultipleFkRefAsSplitMultipleFkTest, "whiteSplitMultipleFkRefAsSplitMultipleFkTest")); }
        if (_whiteSplitMultipleFkChildList != null) { for (Entity et : _whiteSplitMultipleFkChildList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whiteSplitMultipleFkChildList")); } } }
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
        sb.append(dm).append(getBaseId());
        sb.append(dm).append(getFirstId());
        sb.append(dm).append(getNextId());
        sb.append(dm).append(getSplitName());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String cm = ",";
        if (_whiteSplitMultipleFkNext != null) { sb.append(cm).append("whiteSplitMultipleFkNext"); }
        if (_whiteSplitMultipleFkRefAsSplitMultipleFkTest != null) { sb.append(cm).append("whiteSplitMultipleFkRefAsSplitMultipleFkTest"); }
        if (_whiteSplitMultipleFkChildList != null && !_whiteSplitMultipleFkChildList.isEmpty())
        { sb.append(cm).append("whiteSplitMultipleFkChildList"); }
        if (sb.length() > cm.length()) {
            sb.delete(0, cm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public WhiteSplitMultipleFkBase clone() {
        try {
            return (WhiteSplitMultipleFkBase)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] BASE_ID: {PK, NotNull, BIGINT(19)} <br />
     * @return The value of the column 'BASE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getBaseId() {
        return _baseId;
    }

    /**
     * [set] BASE_ID: {PK, NotNull, BIGINT(19)} <br />
     * @param baseId The value of the column 'BASE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setBaseId(Long baseId) {
        __modifiedProperties.addPropertyName("baseId");
        _baseId = baseId;
    }

    /**
     * [get] FIRST_ID: {NotNull, INT(10), FK to WHITE_SPLIT_MULTIPLE_FK_REF} <br />
     * @return The value of the column 'FIRST_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getFirstId() {
        return _firstId;
    }

    /**
     * [set] FIRST_ID: {NotNull, INT(10), FK to WHITE_SPLIT_MULTIPLE_FK_REF} <br />
     * @param firstId The value of the column 'FIRST_ID'. (basically NotNull if update: for the constraint)
     */
    public void setFirstId(Integer firstId) {
        __modifiedProperties.addPropertyName("firstId");
        _firstId = firstId;
    }

    /**
     * [get] NEXT_ID: {IX, NotNull, BIGINT(19), FK to white_split_multiple_fk_next} <br />
     * @return The value of the column 'NEXT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getNextId() {
        return _nextId;
    }

    /**
     * [set] NEXT_ID: {IX, NotNull, BIGINT(19), FK to white_split_multiple_fk_next} <br />
     * @param nextId The value of the column 'NEXT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setNextId(Long nextId) {
        __modifiedProperties.addPropertyName("nextId");
        _nextId = nextId;
    }

    /**
     * [get] SPLIT_NAME: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'SPLIT_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getSplitName() {
        return _splitName;
    }

    /**
     * [set] SPLIT_NAME: {NotNull, VARCHAR(200)} <br />
     * @param splitName The value of the column 'SPLIT_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setSplitName(String splitName) {
        __modifiedProperties.addPropertyName("splitName");
        _splitName = splitName;
    }
}
