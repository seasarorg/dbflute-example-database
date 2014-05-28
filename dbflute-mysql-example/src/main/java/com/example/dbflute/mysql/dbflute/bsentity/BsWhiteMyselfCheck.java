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
 * The entity of WHITE_MYSELF_CHECK as TABLE. <br />
 * <pre>
 * [primary-key]
 *     MYSELF_CHECK_ID
 * 
 * [column]
 *     MYSELF_CHECK_ID, MYSELF_CHECK_NAME, MYSELF_ID
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
 *     white_myself
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     whiteMyself
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer myselfCheckId = entity.getMyselfCheckId();
 * String myselfCheckName = entity.getMyselfCheckName();
 * Integer myselfId = entity.getMyselfId();
 * entity.setMyselfCheckId(myselfCheckId);
 * entity.setMyselfCheckName(myselfCheckName);
 * entity.setMyselfId(myselfId);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteMyselfCheck implements Entity, Serializable, Cloneable {

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
    /** MYSELF_CHECK_ID: {PK, NotNull, INT(10)} */
    protected Integer _myselfCheckId;

    /** MYSELF_CHECK_NAME: {NotNull, VARCHAR(80)} */
    protected String _myselfCheckName;

    /** MYSELF_ID: {IX, INT(10), FK to white_myself} */
    protected Integer _myselfId;

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
        return "white_myself_check";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteMyselfCheck";
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
        if (getMyselfCheckId() == null) { return false; }
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
    /** white_myself by my MYSELF_ID, named 'whiteMyself'. */
    protected WhiteMyself _whiteMyself;

    /**
     * white_myself by my MYSELF_ID, named 'whiteMyself'.
     * @return The entity of foreign property 'whiteMyself'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteMyself getWhiteMyself() {
        return _whiteMyself;
    }

    /**
     * white_myself by my MYSELF_ID, named 'whiteMyself'.
     * @param whiteMyself The entity of foreign property 'whiteMyself'. (NullAllowed)
     */
    public void setWhiteMyself(WhiteMyself whiteMyself) {
        _whiteMyself = whiteMyself;
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
        if (obj == null || !(obj instanceof BsWhiteMyselfCheck)) { return false; }
        BsWhiteMyselfCheck other = (BsWhiteMyselfCheck)obj;
        if (!xSV(getMyselfCheckId(), other.getMyselfCheckId())) { return false; }
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
        hs = xCH(hs, getMyselfCheckId());
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
        if (_whiteMyself != null)
        { sb.append(li).append(xbRDS(_whiteMyself, "whiteMyself")); }
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
        sb.append(dm).append(getMyselfCheckId());
        sb.append(dm).append(getMyselfCheckName());
        sb.append(dm).append(getMyselfId());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String cm = ",";
        if (_whiteMyself != null) { sb.append(cm).append("whiteMyself"); }
        if (sb.length() > cm.length()) {
            sb.delete(0, cm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public WhiteMyselfCheck clone() {
        try {
            return (WhiteMyselfCheck)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MYSELF_CHECK_ID: {PK, NotNull, INT(10)} <br />
     * @return The value of the column 'MYSELF_CHECK_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMyselfCheckId() {
        return _myselfCheckId;
    }

    /**
     * [set] MYSELF_CHECK_ID: {PK, NotNull, INT(10)} <br />
     * @param myselfCheckId The value of the column 'MYSELF_CHECK_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMyselfCheckId(Integer myselfCheckId) {
        __modifiedProperties.addPropertyName("myselfCheckId");
        this._myselfCheckId = myselfCheckId;
    }

    /**
     * [get] MYSELF_CHECK_NAME: {NotNull, VARCHAR(80)} <br />
     * @return The value of the column 'MYSELF_CHECK_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getMyselfCheckName() {
        return _myselfCheckName;
    }

    /**
     * [set] MYSELF_CHECK_NAME: {NotNull, VARCHAR(80)} <br />
     * @param myselfCheckName The value of the column 'MYSELF_CHECK_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setMyselfCheckName(String myselfCheckName) {
        __modifiedProperties.addPropertyName("myselfCheckName");
        this._myselfCheckName = myselfCheckName;
    }

    /**
     * [get] MYSELF_ID: {IX, INT(10), FK to white_myself} <br />
     * @return The value of the column 'MYSELF_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getMyselfId() {
        return _myselfId;
    }

    /**
     * [set] MYSELF_ID: {IX, INT(10), FK to white_myself} <br />
     * @param myselfId The value of the column 'MYSELF_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMyselfId(Integer myselfId) {
        __modifiedProperties.addPropertyName("myselfId");
        this._myselfId = myselfId;
    }
}
