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
 * The entity of WHITE_UQ_FK_REF_NEST as TABLE. <br />
 * <pre>
 * [primary-key]
 *     UQ_FK_REF_NEST_ID
 * 
 * [column]
 *     UQ_FK_REF_NEST_ID, COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE
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
 *     white_uq_fk_ref
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     whiteUqFkRef
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long uqFkRefNestId = entity.getUqFkRefNestId();
 * String compoundUqFirstCode = entity.getCompoundUqFirstCode();
 * String compoundUqSecondCode = entity.getCompoundUqSecondCode();
 * entity.setUqFkRefNestId(uqFkRefNestId);
 * entity.setCompoundUqFirstCode(compoundUqFirstCode);
 * entity.setCompoundUqSecondCode(compoundUqSecondCode);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteUqFkRefNest implements Entity, Serializable, Cloneable {

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
    /** UQ_FK_REF_NEST_ID: {PK, NotNull, DECIMAL(16)} */
    protected Long _uqFkRefNestId;

    /** COMPOUND_UQ_FIRST_CODE: {IX+, NotNull, CHAR(3), FK to white_uq_fk_ref} */
    protected String _compoundUqFirstCode;

    /** COMPOUND_UQ_SECOND_CODE: {NotNull, CHAR(3), FK to white_uq_fk_ref} */
    protected String _compoundUqSecondCode;

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
        return "white_uq_fk_ref_nest";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteUqFkRefNest";
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
        if (getUqFkRefNestId() == null) { return false; }
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
    /** white_uq_fk_ref by my COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE, named 'whiteUqFkRef'. */
    protected WhiteUqFkRef _whiteUqFkRef;

    /**
     * [get] white_uq_fk_ref by my COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE, named 'whiteUqFkRef'.
     * @return The entity of foreign property 'whiteUqFkRef'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteUqFkRef getWhiteUqFkRef() {
        return _whiteUqFkRef;
    }

    /**
     * [set] white_uq_fk_ref by my COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE, named 'whiteUqFkRef'.
     * @param whiteUqFkRef The entity of foreign property 'whiteUqFkRef'. (NullAllowed)
     */
    public void setWhiteUqFkRef(WhiteUqFkRef whiteUqFkRef) {
        _whiteUqFkRef = whiteUqFkRef;
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
        if (obj == null || !(obj instanceof BsWhiteUqFkRefNest)) { return false; }
        BsWhiteUqFkRefNest other = (BsWhiteUqFkRefNest)obj;
        if (!xSV(getUqFkRefNestId(), other.getUqFkRefNestId())) { return false; }
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
        hs = xCH(hs, getUqFkRefNestId());
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
        if (_whiteUqFkRef != null)
        { sb.append(li).append(xbRDS(_whiteUqFkRef, "whiteUqFkRef")); }
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
        sb.append(dm).append(getUqFkRefNestId());
        sb.append(dm).append(getCompoundUqFirstCode());
        sb.append(dm).append(getCompoundUqSecondCode());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String cm = ",";
        if (_whiteUqFkRef != null) { sb.append(cm).append("whiteUqFkRef"); }
        if (sb.length() > cm.length()) {
            sb.delete(0, cm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public WhiteUqFkRefNest clone() {
        try {
            return (WhiteUqFkRefNest)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] UQ_FK_REF_NEST_ID: {PK, NotNull, DECIMAL(16)} <br />
     * @return The value of the column 'UQ_FK_REF_NEST_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getUqFkRefNestId() {
        return _uqFkRefNestId;
    }

    /**
     * [set] UQ_FK_REF_NEST_ID: {PK, NotNull, DECIMAL(16)} <br />
     * @param uqFkRefNestId The value of the column 'UQ_FK_REF_NEST_ID'. (basically NotNull if update: for the constraint)
     */
    public void setUqFkRefNestId(Long uqFkRefNestId) {
        __modifiedProperties.addPropertyName("uqFkRefNestId");
        _uqFkRefNestId = uqFkRefNestId;
    }

    /**
     * [get] COMPOUND_UQ_FIRST_CODE: {IX+, NotNull, CHAR(3), FK to white_uq_fk_ref} <br />
     * @return The value of the column 'COMPOUND_UQ_FIRST_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getCompoundUqFirstCode() {
        return _compoundUqFirstCode;
    }

    /**
     * [set] COMPOUND_UQ_FIRST_CODE: {IX+, NotNull, CHAR(3), FK to white_uq_fk_ref} <br />
     * @param compoundUqFirstCode The value of the column 'COMPOUND_UQ_FIRST_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setCompoundUqFirstCode(String compoundUqFirstCode) {
        __modifiedProperties.addPropertyName("compoundUqFirstCode");
        _compoundUqFirstCode = compoundUqFirstCode;
    }

    /**
     * [get] COMPOUND_UQ_SECOND_CODE: {NotNull, CHAR(3), FK to white_uq_fk_ref} <br />
     * @return The value of the column 'COMPOUND_UQ_SECOND_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getCompoundUqSecondCode() {
        return _compoundUqSecondCode;
    }

    /**
     * [set] COMPOUND_UQ_SECOND_CODE: {NotNull, CHAR(3), FK to white_uq_fk_ref} <br />
     * @param compoundUqSecondCode The value of the column 'COMPOUND_UQ_SECOND_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setCompoundUqSecondCode(String compoundUqSecondCode) {
        __modifiedProperties.addPropertyName("compoundUqSecondCode");
        _compoundUqSecondCode = compoundUqSecondCode;
    }
}
