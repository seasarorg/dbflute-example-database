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
 * The entity of WHITE_COMPOUND_PK as TABLE. <br />
 * <pre>
 * [primary-key]
 *     PK_FIRST_ID, PK_SECOND_ID
 * 
 * [column]
 *     PK_FIRST_ID, PK_SECOND_ID, PK_NAME, REFERRED_ID
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
 *     WHITE_COMPOUND_REFERRED_NORMALLY, WHITE_COMPOUND_REFERRED_PRIMARY, WHITE_COMPOUND_PK_REF_MANY(AsMax)
 * 
 * [referrer table]
 *     white_compound_pk_ref, white_compound_pk_ref_many
 * 
 * [foreign property]
 *     whiteCompoundReferredNormally, whiteCompoundReferredPrimary, whiteCompoundPkRefManyAsMax, whiteCompoundPkRefManyAsMin
 * 
 * [referrer property]
 *     whiteCompoundPkRefList, whiteCompoundPkRefManyToPKList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer pkFirstId = entity.getPkFirstId();
 * Integer pkSecondId = entity.getPkSecondId();
 * String pkName = entity.getPkName();
 * Integer referredId = entity.getReferredId();
 * entity.setPkFirstId(pkFirstId);
 * entity.setPkSecondId(pkSecondId);
 * entity.setPkName(pkName);
 * entity.setReferredId(referredId);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteCompoundPk implements Entity, Serializable, Cloneable {

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
    /** PK_FIRST_ID: {PK, +UQ, NotNull, INT(10), FK to WHITE_COMPOUND_PK_REF_MANY} */
    protected Integer _pkFirstId;

    /** PK_SECOND_ID: {PK, UQ+, NotNull, INT(10), FK to WHITE_COMPOUND_REFERRED_PRIMARY} */
    protected Integer _pkSecondId;

    /** PK_NAME: {NotNull, VARCHAR(200)} */
    protected String _pkName;

    /** REFERRED_ID: {+UQ, NotNull, INT(10), FK to WHITE_COMPOUND_REFERRED_NORMALLY} */
    protected Integer _referredId;

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
        return "white_compound_pk";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteCompoundPk";
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
        if (getPkFirstId() == null) { return false; }
        if (getPkSecondId() == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br />
     * You can update the entity by the key when entity update (NOT batch update).
     * @param pkSecondId : PK, UQ+, NotNull, INT(10), FK to WHITE_COMPOUND_REFERRED_PRIMARY. (NotNull)
     * @param referredId : +UQ, NotNull, INT(10), FK to WHITE_COMPOUND_REFERRED_NORMALLY. (NotNull)
     */
    public void uniqueByPkSecondIdReferredId(Integer pkSecondId, Integer referredId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("pkSecondId");
        __uniqueDrivenProperties.addPropertyName("referredId");
        setPkSecondId(pkSecondId);setReferredId(referredId);
    }

    /**
     * To be unique by the unique column. <br />
     * You can update the entity by the key when entity update (NOT batch update).
     * @param pkSecondId : PK, UQ+, NotNull, INT(10), FK to WHITE_COMPOUND_REFERRED_PRIMARY. (NotNull)
     * @param pkFirstId : PK, +UQ, NotNull, INT(10), FK to WHITE_COMPOUND_PK_REF_MANY. (NotNull)
     */
    public void uniqueByPkSecondIdPkFirstId(Integer pkSecondId, Integer pkFirstId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("pkSecondId");
        __uniqueDrivenProperties.addPropertyName("pkFirstId");
        setPkSecondId(pkSecondId);setPkFirstId(pkFirstId);
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
    /** white_compound_referred_normally by my REFERRED_ID, named 'whiteCompoundReferredNormally'. */
    protected WhiteCompoundReferredNormally _whiteCompoundReferredNormally;

    /**
     * white_compound_referred_normally by my REFERRED_ID, named 'whiteCompoundReferredNormally'.
     * @return The entity of foreign property 'whiteCompoundReferredNormally'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteCompoundReferredNormally getWhiteCompoundReferredNormally() {
        return _whiteCompoundReferredNormally;
    }

    /**
     * white_compound_referred_normally by my REFERRED_ID, named 'whiteCompoundReferredNormally'.
     * @param whiteCompoundReferredNormally The entity of foreign property 'whiteCompoundReferredNormally'. (NullAllowed)
     */
    public void setWhiteCompoundReferredNormally(WhiteCompoundReferredNormally whiteCompoundReferredNormally) {
        _whiteCompoundReferredNormally = whiteCompoundReferredNormally;
    }

    /** white_compound_referred_primary by my PK_SECOND_ID, named 'whiteCompoundReferredPrimary'. */
    protected WhiteCompoundReferredPrimary _whiteCompoundReferredPrimary;

    /**
     * white_compound_referred_primary by my PK_SECOND_ID, named 'whiteCompoundReferredPrimary'.
     * @return The entity of foreign property 'whiteCompoundReferredPrimary'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteCompoundReferredPrimary getWhiteCompoundReferredPrimary() {
        return _whiteCompoundReferredPrimary;
    }

    /**
     * white_compound_referred_primary by my PK_SECOND_ID, named 'whiteCompoundReferredPrimary'.
     * @param whiteCompoundReferredPrimary The entity of foreign property 'whiteCompoundReferredPrimary'. (NullAllowed)
     */
    public void setWhiteCompoundReferredPrimary(WhiteCompoundReferredPrimary whiteCompoundReferredPrimary) {
        _whiteCompoundReferredPrimary = whiteCompoundReferredPrimary;
    }

    /** white_compound_pk_ref_many by my PK_FIRST_ID, PK_SECOND_ID, named 'whiteCompoundPkRefManyAsMax'. */
    protected WhiteCompoundPkRefMany _whiteCompoundPkRefManyAsMax;

    /**
     * white_compound_pk_ref_many by my PK_FIRST_ID, PK_SECOND_ID, named 'whiteCompoundPkRefManyAsMax'.
     * @return The entity of foreign property 'whiteCompoundPkRefManyAsMax'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteCompoundPkRefMany getWhiteCompoundPkRefManyAsMax() {
        return _whiteCompoundPkRefManyAsMax;
    }

    /**
     * white_compound_pk_ref_many by my PK_FIRST_ID, PK_SECOND_ID, named 'whiteCompoundPkRefManyAsMax'.
     * @param whiteCompoundPkRefManyAsMax The entity of foreign property 'whiteCompoundPkRefManyAsMax'. (NullAllowed)
     */
    public void setWhiteCompoundPkRefManyAsMax(WhiteCompoundPkRefMany whiteCompoundPkRefManyAsMax) {
        _whiteCompoundPkRefManyAsMax = whiteCompoundPkRefManyAsMax;
    }

    /** white_compound_pk_ref_many by my PK_FIRST_ID, PK_SECOND_ID, named 'whiteCompoundPkRefManyAsMin'. */
    protected WhiteCompoundPkRefMany _whiteCompoundPkRefManyAsMin;

    /**
     * white_compound_pk_ref_many by my PK_FIRST_ID, PK_SECOND_ID, named 'whiteCompoundPkRefManyAsMin'.
     * @return The entity of foreign property 'whiteCompoundPkRefManyAsMin'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteCompoundPkRefMany getWhiteCompoundPkRefManyAsMin() {
        return _whiteCompoundPkRefManyAsMin;
    }

    /**
     * white_compound_pk_ref_many by my PK_FIRST_ID, PK_SECOND_ID, named 'whiteCompoundPkRefManyAsMin'.
     * @param whiteCompoundPkRefManyAsMin The entity of foreign property 'whiteCompoundPkRefManyAsMin'. (NullAllowed)
     */
    public void setWhiteCompoundPkRefManyAsMin(WhiteCompoundPkRefMany whiteCompoundPkRefManyAsMin) {
        _whiteCompoundPkRefManyAsMin = whiteCompoundPkRefManyAsMin;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** white_compound_pk_ref by REF_FIRST_ID, REF_SECOND_ID, named 'whiteCompoundPkRefList'. */
    protected List<WhiteCompoundPkRef> _whiteCompoundPkRefList;

    /**
     * white_compound_pk_ref by REF_FIRST_ID, REF_SECOND_ID, named 'whiteCompoundPkRefList'.
     * @return The entity list of referrer property 'whiteCompoundPkRefList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteCompoundPkRef> getWhiteCompoundPkRefList() {
        if (_whiteCompoundPkRefList == null) { _whiteCompoundPkRefList = newReferrerList(); }
        return _whiteCompoundPkRefList;
    }

    /**
     * white_compound_pk_ref by REF_FIRST_ID, REF_SECOND_ID, named 'whiteCompoundPkRefList'.
     * @param whiteCompoundPkRefList The entity list of referrer property 'whiteCompoundPkRefList'. (NullAllowed)
     */
    public void setWhiteCompoundPkRefList(List<WhiteCompoundPkRef> whiteCompoundPkRefList) {
        _whiteCompoundPkRefList = whiteCompoundPkRefList;
    }

    /** white_compound_pk_ref_many by REF_MANY_FIRST_ID, REF_MANY_SECOND_ID, named 'whiteCompoundPkRefManyToPKList'. */
    protected List<WhiteCompoundPkRefMany> _whiteCompoundPkRefManyToPKList;

    /**
     * white_compound_pk_ref_many by REF_MANY_FIRST_ID, REF_MANY_SECOND_ID, named 'whiteCompoundPkRefManyToPKList'.
     * @return The entity list of referrer property 'whiteCompoundPkRefManyToPKList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteCompoundPkRefMany> getWhiteCompoundPkRefManyToPKList() {
        if (_whiteCompoundPkRefManyToPKList == null) { _whiteCompoundPkRefManyToPKList = newReferrerList(); }
        return _whiteCompoundPkRefManyToPKList;
    }

    /**
     * white_compound_pk_ref_many by REF_MANY_FIRST_ID, REF_MANY_SECOND_ID, named 'whiteCompoundPkRefManyToPKList'.
     * @param whiteCompoundPkRefManyToPKList The entity list of referrer property 'whiteCompoundPkRefManyToPKList'. (NullAllowed)
     */
    public void setWhiteCompoundPkRefManyToPKList(List<WhiteCompoundPkRefMany> whiteCompoundPkRefManyToPKList) {
        _whiteCompoundPkRefManyToPKList = whiteCompoundPkRefManyToPKList;
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
        if (obj == null || !(obj instanceof BsWhiteCompoundPk)) { return false; }
        BsWhiteCompoundPk other = (BsWhiteCompoundPk)obj;
        if (!xSV(getPkFirstId(), other.getPkFirstId())) { return false; }
        if (!xSV(getPkSecondId(), other.getPkSecondId())) { return false; }
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
        hs = xCH(hs, getPkFirstId());
        hs = xCH(hs, getPkSecondId());
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
        if (_whiteCompoundReferredNormally != null)
        { sb.append(li).append(xbRDS(_whiteCompoundReferredNormally, "whiteCompoundReferredNormally")); }
        if (_whiteCompoundReferredPrimary != null)
        { sb.append(li).append(xbRDS(_whiteCompoundReferredPrimary, "whiteCompoundReferredPrimary")); }
        if (_whiteCompoundPkRefManyAsMax != null)
        { sb.append(li).append(xbRDS(_whiteCompoundPkRefManyAsMax, "whiteCompoundPkRefManyAsMax")); }
        if (_whiteCompoundPkRefManyAsMin != null)
        { sb.append(li).append(xbRDS(_whiteCompoundPkRefManyAsMin, "whiteCompoundPkRefManyAsMin")); }
        if (_whiteCompoundPkRefList != null) { for (Entity et : _whiteCompoundPkRefList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whiteCompoundPkRefList")); } } }
        if (_whiteCompoundPkRefManyToPKList != null) { for (Entity et : _whiteCompoundPkRefManyToPKList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whiteCompoundPkRefManyToPKList")); } } }
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
        sb.append(dm).append(getPkFirstId());
        sb.append(dm).append(getPkSecondId());
        sb.append(dm).append(getPkName());
        sb.append(dm).append(getReferredId());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String cm = ",";
        if (_whiteCompoundReferredNormally != null) { sb.append(cm).append("whiteCompoundReferredNormally"); }
        if (_whiteCompoundReferredPrimary != null) { sb.append(cm).append("whiteCompoundReferredPrimary"); }
        if (_whiteCompoundPkRefManyAsMax != null) { sb.append(cm).append("whiteCompoundPkRefManyAsMax"); }
        if (_whiteCompoundPkRefManyAsMin != null) { sb.append(cm).append("whiteCompoundPkRefManyAsMin"); }
        if (_whiteCompoundPkRefList != null && !_whiteCompoundPkRefList.isEmpty())
        { sb.append(cm).append("whiteCompoundPkRefList"); }
        if (_whiteCompoundPkRefManyToPKList != null && !_whiteCompoundPkRefManyToPKList.isEmpty())
        { sb.append(cm).append("whiteCompoundPkRefManyToPKList"); }
        if (sb.length() > cm.length()) {
            sb.delete(0, cm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public WhiteCompoundPk clone() {
        try {
            return (WhiteCompoundPk)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PK_FIRST_ID: {PK, +UQ, NotNull, INT(10), FK to WHITE_COMPOUND_PK_REF_MANY} <br />
     * @return The value of the column 'PK_FIRST_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getPkFirstId() {
        return _pkFirstId;
    }

    /**
     * [set] PK_FIRST_ID: {PK, +UQ, NotNull, INT(10), FK to WHITE_COMPOUND_PK_REF_MANY} <br />
     * @param pkFirstId The value of the column 'PK_FIRST_ID'. (basically NotNull if update: for the constraint)
     */
    public void setPkFirstId(Integer pkFirstId) {
        __modifiedProperties.addPropertyName("pkFirstId");
        this._pkFirstId = pkFirstId;
    }

    /**
     * [get] PK_SECOND_ID: {PK, UQ+, NotNull, INT(10), FK to WHITE_COMPOUND_REFERRED_PRIMARY} <br />
     * @return The value of the column 'PK_SECOND_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getPkSecondId() {
        return _pkSecondId;
    }

    /**
     * [set] PK_SECOND_ID: {PK, UQ+, NotNull, INT(10), FK to WHITE_COMPOUND_REFERRED_PRIMARY} <br />
     * @param pkSecondId The value of the column 'PK_SECOND_ID'. (basically NotNull if update: for the constraint)
     */
    public void setPkSecondId(Integer pkSecondId) {
        __modifiedProperties.addPropertyName("pkSecondId");
        this._pkSecondId = pkSecondId;
    }

    /**
     * [get] PK_NAME: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'PK_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getPkName() {
        return _pkName;
    }

    /**
     * [set] PK_NAME: {NotNull, VARCHAR(200)} <br />
     * @param pkName The value of the column 'PK_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setPkName(String pkName) {
        __modifiedProperties.addPropertyName("pkName");
        this._pkName = pkName;
    }

    /**
     * [get] REFERRED_ID: {+UQ, NotNull, INT(10), FK to WHITE_COMPOUND_REFERRED_NORMALLY} <br />
     * @return The value of the column 'REFERRED_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getReferredId() {
        return _referredId;
    }

    /**
     * [set] REFERRED_ID: {+UQ, NotNull, INT(10), FK to WHITE_COMPOUND_REFERRED_NORMALLY} <br />
     * @param referredId The value of the column 'REFERRED_ID'. (basically NotNull if update: for the constraint)
     */
    public void setReferredId(Integer referredId) {
        __modifiedProperties.addPropertyName("referredId");
        this._referredId = referredId;
    }
}
