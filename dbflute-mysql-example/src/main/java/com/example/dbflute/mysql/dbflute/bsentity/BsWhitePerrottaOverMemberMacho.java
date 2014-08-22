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
 * The entity of WHITE_PERROTTA_OVER_MEMBER_MACHO as TABLE. <br />
 * <pre>
 * [primary-key]
 *     MACHO_CODE
 * 
 * [column]
 *     MACHO_CODE, MACHO_NAME
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
 *     white_perrotta_over_member
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     whitePerrottaOverMemberList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * String machoCode = entity.getMachoCode();
 * String machoName = entity.getMachoName();
 * entity.setMachoCode(machoCode);
 * entity.setMachoName(machoName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhitePerrottaOverMemberMacho implements Entity, Serializable, Cloneable {

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
    /** MACHO_CODE: {PK, NotNull, CHAR(3)} */
    protected String _machoCode;

    /** MACHO_NAME: {NotNull, VARCHAR(200)} */
    protected String _machoName;

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
        return "white_perrotta_over_member_macho";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whitePerrottaOverMemberMacho";
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
        if (getMachoCode() == null) { return false; }
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
    /** white_perrotta_over_member by MACHO_CODE, named 'whitePerrottaOverMemberList'. */
    protected List<WhitePerrottaOverMember> _whitePerrottaOverMemberList;

    /**
     * [get] white_perrotta_over_member by MACHO_CODE, named 'whitePerrottaOverMemberList'.
     * @return The entity list of referrer property 'whitePerrottaOverMemberList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhitePerrottaOverMember> getWhitePerrottaOverMemberList() {
        if (_whitePerrottaOverMemberList == null) { _whitePerrottaOverMemberList = newReferrerList(); }
        return _whitePerrottaOverMemberList;
    }

    /**
     * [set] white_perrotta_over_member by MACHO_CODE, named 'whitePerrottaOverMemberList'.
     * @param whitePerrottaOverMemberList The entity list of referrer property 'whitePerrottaOverMemberList'. (NullAllowed)
     */
    public void setWhitePerrottaOverMemberList(List<WhitePerrottaOverMember> whitePerrottaOverMemberList) {
        _whitePerrottaOverMemberList = whitePerrottaOverMemberList;
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
        if (obj == null || !(obj instanceof BsWhitePerrottaOverMemberMacho)) { return false; }
        BsWhitePerrottaOverMemberMacho other = (BsWhitePerrottaOverMemberMacho)obj;
        if (!xSV(getMachoCode(), other.getMachoCode())) { return false; }
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
        hs = xCH(hs, getMachoCode());
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
        if (_whitePerrottaOverMemberList != null) { for (Entity et : _whitePerrottaOverMemberList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whitePerrottaOverMemberList")); } } }
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
        sb.append(dm).append(getMachoCode());
        sb.append(dm).append(getMachoName());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String cm = ",";
        if (_whitePerrottaOverMemberList != null && !_whitePerrottaOverMemberList.isEmpty())
        { sb.append(cm).append("whitePerrottaOverMemberList"); }
        if (sb.length() > cm.length()) {
            sb.delete(0, cm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public WhitePerrottaOverMemberMacho clone() {
        try {
            return (WhitePerrottaOverMemberMacho)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MACHO_CODE: {PK, NotNull, CHAR(3)} <br />
     * @return The value of the column 'MACHO_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getMachoCode() {
        return _machoCode;
    }

    /**
     * [set] MACHO_CODE: {PK, NotNull, CHAR(3)} <br />
     * @param machoCode The value of the column 'MACHO_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setMachoCode(String machoCode) {
        __modifiedProperties.addPropertyName("machoCode");
        _machoCode = machoCode;
    }

    /**
     * [get] MACHO_NAME: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'MACHO_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getMachoName() {
        return _machoName;
    }

    /**
     * [set] MACHO_NAME: {NotNull, VARCHAR(200)} <br />
     * @param machoName The value of the column 'MACHO_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setMachoName(String machoName) {
        __modifiedProperties.addPropertyName("machoName");
        _machoName = machoName;
    }
}
