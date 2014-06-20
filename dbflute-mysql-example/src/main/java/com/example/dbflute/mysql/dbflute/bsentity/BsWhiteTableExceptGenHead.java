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
 * The entity of WHITE_TABLE_EXCEPT_GEN_HEAD as TABLE. <br />
 * <pre>
 * [primary-key]
 *     GEN_HEAD_ID
 * 
 * [column]
 *     GEN_HEAD_ID, GEN_HEAD_NAME, NOMETA_ID
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
 *     
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long genHeadId = entity.getGenHeadId();
 * String genHeadName = entity.getGenHeadName();
 * Long nometaId = entity.getNometaId();
 * entity.setGenHeadId(genHeadId);
 * entity.setGenHeadName(genHeadName);
 * entity.setNometaId(nometaId);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteTableExceptGenHead implements Entity, Serializable, Cloneable {

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
    /** GEN_HEAD_ID: {PK, NotNull, DECIMAL(16)} */
    protected Long _genHeadId;

    /** GEN_HEAD_NAME: {NotNull, VARCHAR(200)} */
    protected String _genHeadName;

    /** NOMETA_ID: {IX, DECIMAL(16)} */
    protected Long _nometaId;

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
        return "white_table_except_gen_head";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteTableExceptGenHead";
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
        if (getGenHeadId() == null) { return false; }
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
        if (obj == null || !(obj instanceof BsWhiteTableExceptGenHead)) { return false; }
        BsWhiteTableExceptGenHead other = (BsWhiteTableExceptGenHead)obj;
        if (!xSV(getGenHeadId(), other.getGenHeadId())) { return false; }
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
        hs = xCH(hs, getGenHeadId());
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
        return sb.toString();
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
        sb.append(dm).append(getGenHeadId());
        sb.append(dm).append(getGenHeadName());
        sb.append(dm).append(getNometaId());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        return "";
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public WhiteTableExceptGenHead clone() {
        try {
            return (WhiteTableExceptGenHead)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] GEN_HEAD_ID: {PK, NotNull, DECIMAL(16)} <br />
     * @return The value of the column 'GEN_HEAD_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getGenHeadId() {
        return _genHeadId;
    }

    /**
     * [set] GEN_HEAD_ID: {PK, NotNull, DECIMAL(16)} <br />
     * @param genHeadId The value of the column 'GEN_HEAD_ID'. (basically NotNull if update: for the constraint)
     */
    public void setGenHeadId(Long genHeadId) {
        __modifiedProperties.addPropertyName("genHeadId");
        _genHeadId = genHeadId;
    }

    /**
     * [get] GEN_HEAD_NAME: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'GEN_HEAD_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getGenHeadName() {
        return _genHeadName;
    }

    /**
     * [set] GEN_HEAD_NAME: {NotNull, VARCHAR(200)} <br />
     * @param genHeadName The value of the column 'GEN_HEAD_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setGenHeadName(String genHeadName) {
        __modifiedProperties.addPropertyName("genHeadName");
        _genHeadName = genHeadName;
    }

    /**
     * [get] NOMETA_ID: {IX, DECIMAL(16)} <br />
     * @return The value of the column 'NOMETA_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getNometaId() {
        return _nometaId;
    }

    /**
     * [set] NOMETA_ID: {IX, DECIMAL(16)} <br />
     * @param nometaId The value of the column 'NOMETA_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNometaId(Long nometaId) {
        __modifiedProperties.addPropertyName("nometaId");
        _nometaId = nometaId;
    }
}
