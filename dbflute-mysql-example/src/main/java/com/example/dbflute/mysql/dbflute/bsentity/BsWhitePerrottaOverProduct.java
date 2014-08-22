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
 * The entity of WHITE_PERROTTA_OVER_PRODUCT as TABLE. <br />
 * <pre>
 * [primary-key]
 *     PRODUCT_ID
 * 
 * [column]
 *     PRODUCT_ID, PRODUCT_NAME, PRODUCT_NESTED_CODE
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
 *     white_perrotta_over_product_nested, WHITE_PERROTTA_OVER_TRACE(AsPerrotta)
 * 
 * [referrer table]
 *     white_perrotta_over_member, white_perrotta_over_trace
 * 
 * [foreign property]
 *     whitePerrottaOverProductNested, whitePerrottaOverTraceAsPerrotta
 * 
 * [referrer property]
 *     whitePerrottaOverMemberList, whitePerrottaOverTraceByNextProductIdList, whitePerrottaOverTraceByPreviousProductIdList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long productId = entity.getProductId();
 * String productName = entity.getProductName();
 * String productNestedCode = entity.getProductNestedCode();
 * entity.setProductId(productId);
 * entity.setProductName(productName);
 * entity.setProductNestedCode(productNestedCode);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhitePerrottaOverProduct implements Entity, Serializable, Cloneable {

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
    /** PRODUCT_ID: {PK, NotNull, BIGINT(19), FK to WHITE_PERROTTA_OVER_TRACE} */
    protected Long _productId;

    /** PRODUCT_NAME: {NotNull, VARCHAR(200)} */
    protected String _productName;

    /** PRODUCT_NESTED_CODE: {IX, NotNull, CHAR(3), FK to white_perrotta_over_product_nested} */
    protected String _productNestedCode;

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
        return "white_perrotta_over_product";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whitePerrottaOverProduct";
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
        if (getProductId() == null) { return false; }
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
    /** white_perrotta_over_product_nested by my PRODUCT_NESTED_CODE, named 'whitePerrottaOverProductNested'. */
    protected WhitePerrottaOverProductNested _whitePerrottaOverProductNested;

    /**
     * [get] white_perrotta_over_product_nested by my PRODUCT_NESTED_CODE, named 'whitePerrottaOverProductNested'.
     * @return The entity of foreign property 'whitePerrottaOverProductNested'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhitePerrottaOverProductNested getWhitePerrottaOverProductNested() {
        return _whitePerrottaOverProductNested;
    }

    /**
     * [set] white_perrotta_over_product_nested by my PRODUCT_NESTED_CODE, named 'whitePerrottaOverProductNested'.
     * @param whitePerrottaOverProductNested The entity of foreign property 'whitePerrottaOverProductNested'. (NullAllowed)
     */
    public void setWhitePerrottaOverProductNested(WhitePerrottaOverProductNested whitePerrottaOverProductNested) {
        _whitePerrottaOverProductNested = whitePerrottaOverProductNested;
    }

    /** white_perrotta_over_trace by my PRODUCT_ID, named 'whitePerrottaOverTraceAsPerrotta'. */
    protected WhitePerrottaOverTrace _whitePerrottaOverTraceAsPerrotta;

    /**
     * [get] white_perrotta_over_trace by my PRODUCT_ID, named 'whitePerrottaOverTraceAsPerrotta'.
     * @return The entity of foreign property 'whitePerrottaOverTraceAsPerrotta'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhitePerrottaOverTrace getWhitePerrottaOverTraceAsPerrotta() {
        return _whitePerrottaOverTraceAsPerrotta;
    }

    /**
     * [set] white_perrotta_over_trace by my PRODUCT_ID, named 'whitePerrottaOverTraceAsPerrotta'.
     * @param whitePerrottaOverTraceAsPerrotta The entity of foreign property 'whitePerrottaOverTraceAsPerrotta'. (NullAllowed)
     */
    public void setWhitePerrottaOverTraceAsPerrotta(WhitePerrottaOverTrace whitePerrottaOverTraceAsPerrotta) {
        _whitePerrottaOverTraceAsPerrotta = whitePerrottaOverTraceAsPerrotta;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** white_perrotta_over_member by PRODUCT_ID, named 'whitePerrottaOverMemberList'. */
    protected List<WhitePerrottaOverMember> _whitePerrottaOverMemberList;

    /**
     * [get] white_perrotta_over_member by PRODUCT_ID, named 'whitePerrottaOverMemberList'.
     * @return The entity list of referrer property 'whitePerrottaOverMemberList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhitePerrottaOverMember> getWhitePerrottaOverMemberList() {
        if (_whitePerrottaOverMemberList == null) { _whitePerrottaOverMemberList = newReferrerList(); }
        return _whitePerrottaOverMemberList;
    }

    /**
     * [set] white_perrotta_over_member by PRODUCT_ID, named 'whitePerrottaOverMemberList'.
     * @param whitePerrottaOverMemberList The entity list of referrer property 'whitePerrottaOverMemberList'. (NullAllowed)
     */
    public void setWhitePerrottaOverMemberList(List<WhitePerrottaOverMember> whitePerrottaOverMemberList) {
        _whitePerrottaOverMemberList = whitePerrottaOverMemberList;
    }

    /** white_perrotta_over_trace by NEXT_PRODUCT_ID, named 'whitePerrottaOverTraceByNextProductIdList'. */
    protected List<WhitePerrottaOverTrace> _whitePerrottaOverTraceByNextProductIdList;

    /**
     * [get] white_perrotta_over_trace by NEXT_PRODUCT_ID, named 'whitePerrottaOverTraceByNextProductIdList'.
     * @return The entity list of referrer property 'whitePerrottaOverTraceByNextProductIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhitePerrottaOverTrace> getWhitePerrottaOverTraceByNextProductIdList() {
        if (_whitePerrottaOverTraceByNextProductIdList == null) { _whitePerrottaOverTraceByNextProductIdList = newReferrerList(); }
        return _whitePerrottaOverTraceByNextProductIdList;
    }

    /**
     * [set] white_perrotta_over_trace by NEXT_PRODUCT_ID, named 'whitePerrottaOverTraceByNextProductIdList'.
     * @param whitePerrottaOverTraceByNextProductIdList The entity list of referrer property 'whitePerrottaOverTraceByNextProductIdList'. (NullAllowed)
     */
    public void setWhitePerrottaOverTraceByNextProductIdList(List<WhitePerrottaOverTrace> whitePerrottaOverTraceByNextProductIdList) {
        _whitePerrottaOverTraceByNextProductIdList = whitePerrottaOverTraceByNextProductIdList;
    }

    /** white_perrotta_over_trace by PREVIOUS_PRODUCT_ID, named 'whitePerrottaOverTraceByPreviousProductIdList'. */
    protected List<WhitePerrottaOverTrace> _whitePerrottaOverTraceByPreviousProductIdList;

    /**
     * [get] white_perrotta_over_trace by PREVIOUS_PRODUCT_ID, named 'whitePerrottaOverTraceByPreviousProductIdList'.
     * @return The entity list of referrer property 'whitePerrottaOverTraceByPreviousProductIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhitePerrottaOverTrace> getWhitePerrottaOverTraceByPreviousProductIdList() {
        if (_whitePerrottaOverTraceByPreviousProductIdList == null) { _whitePerrottaOverTraceByPreviousProductIdList = newReferrerList(); }
        return _whitePerrottaOverTraceByPreviousProductIdList;
    }

    /**
     * [set] white_perrotta_over_trace by PREVIOUS_PRODUCT_ID, named 'whitePerrottaOverTraceByPreviousProductIdList'.
     * @param whitePerrottaOverTraceByPreviousProductIdList The entity list of referrer property 'whitePerrottaOverTraceByPreviousProductIdList'. (NullAllowed)
     */
    public void setWhitePerrottaOverTraceByPreviousProductIdList(List<WhitePerrottaOverTrace> whitePerrottaOverTraceByPreviousProductIdList) {
        _whitePerrottaOverTraceByPreviousProductIdList = whitePerrottaOverTraceByPreviousProductIdList;
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
        if (obj == null || !(obj instanceof BsWhitePerrottaOverProduct)) { return false; }
        BsWhitePerrottaOverProduct other = (BsWhitePerrottaOverProduct)obj;
        if (!xSV(getProductId(), other.getProductId())) { return false; }
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
        hs = xCH(hs, getProductId());
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
        if (_whitePerrottaOverProductNested != null)
        { sb.append(li).append(xbRDS(_whitePerrottaOverProductNested, "whitePerrottaOverProductNested")); }
        if (_whitePerrottaOverTraceAsPerrotta != null)
        { sb.append(li).append(xbRDS(_whitePerrottaOverTraceAsPerrotta, "whitePerrottaOverTraceAsPerrotta")); }
        if (_whitePerrottaOverMemberList != null) { for (Entity et : _whitePerrottaOverMemberList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whitePerrottaOverMemberList")); } } }
        if (_whitePerrottaOverTraceByNextProductIdList != null) { for (Entity et : _whitePerrottaOverTraceByNextProductIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whitePerrottaOverTraceByNextProductIdList")); } } }
        if (_whitePerrottaOverTraceByPreviousProductIdList != null) { for (Entity et : _whitePerrottaOverTraceByPreviousProductIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whitePerrottaOverTraceByPreviousProductIdList")); } } }
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
        sb.append(dm).append(getProductId());
        sb.append(dm).append(getProductName());
        sb.append(dm).append(getProductNestedCode());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String cm = ",";
        if (_whitePerrottaOverProductNested != null) { sb.append(cm).append("whitePerrottaOverProductNested"); }
        if (_whitePerrottaOverTraceAsPerrotta != null) { sb.append(cm).append("whitePerrottaOverTraceAsPerrotta"); }
        if (_whitePerrottaOverMemberList != null && !_whitePerrottaOverMemberList.isEmpty())
        { sb.append(cm).append("whitePerrottaOverMemberList"); }
        if (_whitePerrottaOverTraceByNextProductIdList != null && !_whitePerrottaOverTraceByNextProductIdList.isEmpty())
        { sb.append(cm).append("whitePerrottaOverTraceByNextProductIdList"); }
        if (_whitePerrottaOverTraceByPreviousProductIdList != null && !_whitePerrottaOverTraceByPreviousProductIdList.isEmpty())
        { sb.append(cm).append("whitePerrottaOverTraceByPreviousProductIdList"); }
        if (sb.length() > cm.length()) {
            sb.delete(0, cm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public WhitePerrottaOverProduct clone() {
        try {
            return (WhitePerrottaOverProduct)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PRODUCT_ID: {PK, NotNull, BIGINT(19), FK to WHITE_PERROTTA_OVER_TRACE} <br />
     * @return The value of the column 'PRODUCT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getProductId() {
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {PK, NotNull, BIGINT(19), FK to WHITE_PERROTTA_OVER_TRACE} <br />
     * @param productId The value of the column 'PRODUCT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setProductId(Long productId) {
        __modifiedProperties.addPropertyName("productId");
        _productId = productId;
    }

    /**
     * [get] PRODUCT_NAME: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'PRODUCT_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getProductName() {
        return _productName;
    }

    /**
     * [set] PRODUCT_NAME: {NotNull, VARCHAR(200)} <br />
     * @param productName The value of the column 'PRODUCT_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setProductName(String productName) {
        __modifiedProperties.addPropertyName("productName");
        _productName = productName;
    }

    /**
     * [get] PRODUCT_NESTED_CODE: {IX, NotNull, CHAR(3), FK to white_perrotta_over_product_nested} <br />
     * @return The value of the column 'PRODUCT_NESTED_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getProductNestedCode() {
        return _productNestedCode;
    }

    /**
     * [set] PRODUCT_NESTED_CODE: {IX, NotNull, CHAR(3), FK to white_perrotta_over_product_nested} <br />
     * @param productNestedCode The value of the column 'PRODUCT_NESTED_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setProductNestedCode(String productNestedCode) {
        __modifiedProperties.addPropertyName("productNestedCode");
        _productNestedCode = productNestedCode;
    }
}
