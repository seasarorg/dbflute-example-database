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
import com.example.dbflute.mysql.dbflute.allcommon.CDef;
import com.example.dbflute.mysql.dbflute.exentity.*;

/**
 * The entity of WHITE_GROUPING_REFERENCE as TABLE. <br />
 * <pre>
 * [primary-key]
 *     GROUPING_REFERENCE_ID
 * 
 * [column]
 *     GROUPING_REFERENCE_ID, GROUPING_REFERENCE_CODE
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     GROUPING_REFERENCE_ID
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
 * Long groupingReferenceId = entity.getGroupingReferenceId();
 * String groupingReferenceCode = entity.getGroupingReferenceCode();
 * entity.setGroupingReferenceId(groupingReferenceId);
 * entity.setGroupingReferenceCode(groupingReferenceCode);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteGroupingReference implements Entity, Serializable, Cloneable {

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
    /** GROUPING_REFERENCE_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _groupingReferenceId;

    /** GROUPING_REFERENCE_CODE: {NotNull, CHAR(3), classification=GroupingReference} */
    protected String _groupingReferenceCode;

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
        return "white_grouping_reference";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteGroupingReference";
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
        if (getGroupingReferenceId() == null) { return false; }
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
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of groupingReferenceCode as the classification of GroupingReference. <br />
     * GROUPING_REFERENCE_CODE: {NotNull, CHAR(3), classification=GroupingReference} <br />
     * the test of reference variable in grouping map
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.GroupingReference getGroupingReferenceCodeAsGroupingReference() {
        return CDef.GroupingReference.codeOf(getGroupingReferenceCode());
    }

    /**
     * Set the value of groupingReferenceCode as the classification of GroupingReference. <br />
     * GROUPING_REFERENCE_CODE: {NotNull, CHAR(3), classification=GroupingReference} <br />
     * the test of reference variable in grouping map
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setGroupingReferenceCodeAsGroupingReference(CDef.GroupingReference cdef) {
        setGroupingReferenceCode(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of groupingReferenceCode as LAND_NAME (LND). <br />
     * LAND_NAME
     */
    public void setGroupingReferenceCode_LAND_NAME() {
        setGroupingReferenceCodeAsGroupingReference(CDef.GroupingReference.LAND_NAME);
    }

    /**
     * Set the value of groupingReferenceCode as SEA_NAME (SEA). <br />
     * SEA_NAME
     */
    public void setGroupingReferenceCode_SEA_NAME() {
        setGroupingReferenceCodeAsGroupingReference(CDef.GroupingReference.SEA_NAME);
    }

    /**
     * Set the value of groupingReferenceCode as IKSPIARY_NAME (IKS). <br />
     * IKSPIARY_NAME
     */
    public void setGroupingReferenceCode_IKSPIARY_NAME() {
        setGroupingReferenceCodeAsGroupingReference(CDef.GroupingReference.IKSPIARY_NAME);
    }

    /**
     * Set the value of groupingReferenceCode as AMPHI_NAME (AMP). <br />
     * AMPHI_NAME
     */
    public void setGroupingReferenceCode_AMPHI_NAME() {
        setGroupingReferenceCodeAsGroupingReference(CDef.GroupingReference.AMPHI_NAME);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of groupingReferenceCode LAND_NAME? <br />
     * LAND_NAME
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isGroupingReferenceCodeLAND_NAME() {
        CDef.GroupingReference cdef = getGroupingReferenceCodeAsGroupingReference();
        return cdef != null ? cdef.equals(CDef.GroupingReference.LAND_NAME) : false;
    }

    /**
     * Is the value of groupingReferenceCode SEA_NAME? <br />
     * SEA_NAME
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isGroupingReferenceCodeSEA_NAME() {
        CDef.GroupingReference cdef = getGroupingReferenceCodeAsGroupingReference();
        return cdef != null ? cdef.equals(CDef.GroupingReference.SEA_NAME) : false;
    }

    /**
     * Is the value of groupingReferenceCode IKSPIARY_NAME? <br />
     * IKSPIARY_NAME
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isGroupingReferenceCodeIKSPIARY_NAME() {
        CDef.GroupingReference cdef = getGroupingReferenceCodeAsGroupingReference();
        return cdef != null ? cdef.equals(CDef.GroupingReference.IKSPIARY_NAME) : false;
    }

    /**
     * Is the value of groupingReferenceCode AMPHI_NAME? <br />
     * AMPHI_NAME
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isGroupingReferenceCodeAMPHI_NAME() {
        CDef.GroupingReference cdef = getGroupingReferenceCodeAsGroupingReference();
        return cdef != null ? cdef.equals(CDef.GroupingReference.AMPHI_NAME) : false;
    }

    /**
     * サービスが利用できる会員 <br />
     * The group elements:[LAND_NAME, SEA_NAME]
     * @return The determination, true or false.
     */
    public boolean isGroupingReferenceCode_ServiceAvailable() {
        CDef.GroupingReference cdef = getGroupingReferenceCodeAsGroupingReference();
        return cdef != null && cdef.isServiceAvailable();
    }

    public boolean isGroupingReferenceCode_ServicePlus() {
        CDef.GroupingReference cdef = getGroupingReferenceCodeAsGroupingReference();
        return cdef != null && cdef.isServicePlus();
    }

    public boolean isGroupingReferenceCode_NestedPlus() {
        CDef.GroupingReference cdef = getGroupingReferenceCodeAsGroupingReference();
        return cdef != null && cdef.isNestedPlus();
    }

    public boolean isGroupingReferenceCode_OneDef() {
        CDef.GroupingReference cdef = getGroupingReferenceCodeAsGroupingReference();
        return cdef != null && cdef.isOneDef();
    }

    public boolean isGroupingReferenceCode_DupRef() {
        CDef.GroupingReference cdef = getGroupingReferenceCodeAsGroupingReference();
        return cdef != null && cdef.isDupRef();
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'groupingReferenceCode' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getGroupingReferenceCodeName() {
        CDef.GroupingReference cdef = getGroupingReferenceCodeAsGroupingReference();
        return cdef != null ? cdef.name() : null;
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
        if (obj == null || !(obj instanceof BsWhiteGroupingReference)) { return false; }
        BsWhiteGroupingReference other = (BsWhiteGroupingReference)obj;
        if (!xSV(getGroupingReferenceId(), other.getGroupingReferenceId())) { return false; }
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
        hs = xCH(hs, getGroupingReferenceId());
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
        sb.append(dm).append(getGroupingReferenceId());
        sb.append(dm).append(getGroupingReferenceCode());
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
    public WhiteGroupingReference clone() {
        try {
            return (WhiteGroupingReference)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] GROUPING_REFERENCE_ID: {PK, ID, NotNull, BIGINT(19)} <br />
     * @return The value of the column 'GROUPING_REFERENCE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getGroupingReferenceId() {
        return _groupingReferenceId;
    }

    /**
     * [set] GROUPING_REFERENCE_ID: {PK, ID, NotNull, BIGINT(19)} <br />
     * @param groupingReferenceId The value of the column 'GROUPING_REFERENCE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setGroupingReferenceId(Long groupingReferenceId) {
        __modifiedProperties.addPropertyName("groupingReferenceId");
        _groupingReferenceId = groupingReferenceId;
    }

    /**
     * [get] GROUPING_REFERENCE_CODE: {NotNull, CHAR(3), classification=GroupingReference} <br />
     * @return The value of the column 'GROUPING_REFERENCE_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getGroupingReferenceCode() {
        return _groupingReferenceCode;
    }

    /**
     * [set] GROUPING_REFERENCE_CODE: {NotNull, CHAR(3), classification=GroupingReference} <br />
     * @param groupingReferenceCode The value of the column 'GROUPING_REFERENCE_CODE'. (basically NotNull if update: for the constraint)
     */
    protected void setGroupingReferenceCode(String groupingReferenceCode) {
        __modifiedProperties.addPropertyName("groupingReferenceCode");
        _groupingReferenceCode = groupingReferenceCode;
    }

    /**
     * For framework so basically DON'T use this method.
     * @param groupingReferenceCode The value of the column 'GROUPING_REFERENCE_CODE'. (basically NotNull if update: for the constraint)
     */
    public void mynativeMappingGroupingReferenceCode(String groupingReferenceCode) {
        setGroupingReferenceCode(groupingReferenceCode);
    }
}
