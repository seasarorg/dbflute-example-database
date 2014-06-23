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
 * The entity of WHITE_MYSELF as TABLE. <br />
 * <pre>
 * [primary-key]
 *     MYSELF_ID
 * 
 * [column]
 *     MYSELF_ID, MYSELF_NAME
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
 *     white_myself_check
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     whiteMyselfCheckList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer myselfId = entity.getMyselfId();
 * String myselfName = entity.getMyselfName();
 * entity.setMyselfId(myselfId);
 * entity.setMyselfName(myselfName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteMyself implements Entity, Serializable, Cloneable {

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
    /** MYSELF_ID: {PK, NotNull, INT(10)} */
    protected Integer _myselfId;

    /** MYSELF_NAME: {NotNull, VARCHAR(80)} */
    protected String _myselfName;

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
        return "white_myself";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteMyself";
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
        if (getMyselfId() == null) { return false; }
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
    /** white_myself_check by MYSELF_ID, named 'whiteMyselfCheckList'. */
    protected List<WhiteMyselfCheck> _whiteMyselfCheckList;

    /**
     * [get] white_myself_check by MYSELF_ID, named 'whiteMyselfCheckList'.
     * @return The entity list of referrer property 'whiteMyselfCheckList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteMyselfCheck> getWhiteMyselfCheckList() {
        if (_whiteMyselfCheckList == null) { _whiteMyselfCheckList = newReferrerList(); }
        return _whiteMyselfCheckList;
    }

    /**
     * [set] white_myself_check by MYSELF_ID, named 'whiteMyselfCheckList'.
     * @param whiteMyselfCheckList The entity list of referrer property 'whiteMyselfCheckList'. (NullAllowed)
     */
    public void setWhiteMyselfCheckList(List<WhiteMyselfCheck> whiteMyselfCheckList) {
        _whiteMyselfCheckList = whiteMyselfCheckList;
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
        if (obj == null || !(obj instanceof BsWhiteMyself)) { return false; }
        BsWhiteMyself other = (BsWhiteMyself)obj;
        if (!xSV(getMyselfId(), other.getMyselfId())) { return false; }
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
        hs = xCH(hs, getMyselfId());
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
        if (_whiteMyselfCheckList != null) { for (Entity et : _whiteMyselfCheckList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whiteMyselfCheckList")); } } }
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
        sb.append(dm).append(getMyselfId());
        sb.append(dm).append(getMyselfName());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String cm = ",";
        if (_whiteMyselfCheckList != null && !_whiteMyselfCheckList.isEmpty())
        { sb.append(cm).append("whiteMyselfCheckList"); }
        if (sb.length() > cm.length()) {
            sb.delete(0, cm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public WhiteMyself clone() {
        try {
            return (WhiteMyself)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MYSELF_ID: {PK, NotNull, INT(10)} <br />
     * @return The value of the column 'MYSELF_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMyselfId() {
        return _myselfId;
    }

    /**
     * [set] MYSELF_ID: {PK, NotNull, INT(10)} <br />
     * @param myselfId The value of the column 'MYSELF_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMyselfId(Integer myselfId) {
        __modifiedProperties.addPropertyName("myselfId");
        _myselfId = myselfId;
    }

    /**
     * [get] MYSELF_NAME: {NotNull, VARCHAR(80)} <br />
     * @return The value of the column 'MYSELF_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getMyselfName() {
        return _myselfName;
    }

    /**
     * [set] MYSELF_NAME: {NotNull, VARCHAR(80)} <br />
     * @param myselfName The value of the column 'MYSELF_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setMyselfName(String myselfName) {
        __modifiedProperties.addPropertyName("myselfName");
        _myselfName = myselfName;
    }
}
