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
 * The entity of WHITE_PERROTTA_OVER_TRACE as TABLE. <br />
 * <pre>
 * [primary-key]
 *     TRACE_ID
 * 
 * [column]
 *     TRACE_ID, PREVIOUS_PRODUCT_ID, NEXT_PRODUCT_ID, TRACE_TYPE_CODE
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
 *     white_perrotta_over_product
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     whitePerrottaOverProductByNextProductId, whitePerrottaOverProductByPreviousProductId
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long traceId = entity.getTraceId();
 * Long previousProductId = entity.getPreviousProductId();
 * Long nextProductId = entity.getNextProductId();
 * String traceTypeCode = entity.getTraceTypeCode();
 * entity.setTraceId(traceId);
 * entity.setPreviousProductId(previousProductId);
 * entity.setNextProductId(nextProductId);
 * entity.setTraceTypeCode(traceTypeCode);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhitePerrottaOverTrace implements Entity, Serializable, Cloneable {

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
    /** TRACE_ID: {PK, NotNull, BIGINT(19)} */
    protected Long _traceId;

    /** PREVIOUS_PRODUCT_ID: {UQ+, NotNull, BIGINT(19), FK to white_perrotta_over_product} */
    protected Long _previousProductId;

    /** NEXT_PRODUCT_ID: {+UQ, IX, NotNull, BIGINT(19), FK to white_perrotta_over_product} */
    protected Long _nextProductId;

    /** TRACE_TYPE_CODE: {NotNull, CHAR(3)} */
    protected String _traceTypeCode;

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
        return "white_perrotta_over_trace";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whitePerrottaOverTrace";
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
        if (getTraceId() == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br />
     * You can update the entity by the key when entity update (NOT batch update).
     * @param previousProductId : UQ+, NotNull, BIGINT(19), FK to white_perrotta_over_product. (NotNull)
     * @param nextProductId : +UQ, IX, NotNull, BIGINT(19), FK to white_perrotta_over_product. (NotNull)
     */
    public void uniqueBy(Long previousProductId, Long nextProductId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("previousProductId");
        __uniqueDrivenProperties.addPropertyName("nextProductId");
        setPreviousProductId(previousProductId);setNextProductId(nextProductId);
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
    /** white_perrotta_over_product by my NEXT_PRODUCT_ID, named 'whitePerrottaOverProductByNextProductId'. */
    protected WhitePerrottaOverProduct _whitePerrottaOverProductByNextProductId;

    /**
     * [get] white_perrotta_over_product by my NEXT_PRODUCT_ID, named 'whitePerrottaOverProductByNextProductId'.
     * @return The entity of foreign property 'whitePerrottaOverProductByNextProductId'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhitePerrottaOverProduct getWhitePerrottaOverProductByNextProductId() {
        return _whitePerrottaOverProductByNextProductId;
    }

    /**
     * [set] white_perrotta_over_product by my NEXT_PRODUCT_ID, named 'whitePerrottaOverProductByNextProductId'.
     * @param whitePerrottaOverProductByNextProductId The entity of foreign property 'whitePerrottaOverProductByNextProductId'. (NullAllowed)
     */
    public void setWhitePerrottaOverProductByNextProductId(WhitePerrottaOverProduct whitePerrottaOverProductByNextProductId) {
        _whitePerrottaOverProductByNextProductId = whitePerrottaOverProductByNextProductId;
    }

    /** white_perrotta_over_product by my PREVIOUS_PRODUCT_ID, named 'whitePerrottaOverProductByPreviousProductId'. */
    protected WhitePerrottaOverProduct _whitePerrottaOverProductByPreviousProductId;

    /**
     * [get] white_perrotta_over_product by my PREVIOUS_PRODUCT_ID, named 'whitePerrottaOverProductByPreviousProductId'.
     * @return The entity of foreign property 'whitePerrottaOverProductByPreviousProductId'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhitePerrottaOverProduct getWhitePerrottaOverProductByPreviousProductId() {
        return _whitePerrottaOverProductByPreviousProductId;
    }

    /**
     * [set] white_perrotta_over_product by my PREVIOUS_PRODUCT_ID, named 'whitePerrottaOverProductByPreviousProductId'.
     * @param whitePerrottaOverProductByPreviousProductId The entity of foreign property 'whitePerrottaOverProductByPreviousProductId'. (NullAllowed)
     */
    public void setWhitePerrottaOverProductByPreviousProductId(WhitePerrottaOverProduct whitePerrottaOverProductByPreviousProductId) {
        _whitePerrottaOverProductByPreviousProductId = whitePerrottaOverProductByPreviousProductId;
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
        if (obj == null || !(obj instanceof BsWhitePerrottaOverTrace)) { return false; }
        BsWhitePerrottaOverTrace other = (BsWhitePerrottaOverTrace)obj;
        if (!xSV(getTraceId(), other.getTraceId())) { return false; }
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
        hs = xCH(hs, getTraceId());
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
        if (_whitePerrottaOverProductByNextProductId != null)
        { sb.append(li).append(xbRDS(_whitePerrottaOverProductByNextProductId, "whitePerrottaOverProductByNextProductId")); }
        if (_whitePerrottaOverProductByPreviousProductId != null)
        { sb.append(li).append(xbRDS(_whitePerrottaOverProductByPreviousProductId, "whitePerrottaOverProductByPreviousProductId")); }
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
        sb.append(dm).append(getTraceId());
        sb.append(dm).append(getPreviousProductId());
        sb.append(dm).append(getNextProductId());
        sb.append(dm).append(getTraceTypeCode());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String cm = ",";
        if (_whitePerrottaOverProductByNextProductId != null) { sb.append(cm).append("whitePerrottaOverProductByNextProductId"); }
        if (_whitePerrottaOverProductByPreviousProductId != null) { sb.append(cm).append("whitePerrottaOverProductByPreviousProductId"); }
        if (sb.length() > cm.length()) {
            sb.delete(0, cm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public WhitePerrottaOverTrace clone() {
        try {
            return (WhitePerrottaOverTrace)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] TRACE_ID: {PK, NotNull, BIGINT(19)} <br />
     * @return The value of the column 'TRACE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTraceId() {
        return _traceId;
    }

    /**
     * [set] TRACE_ID: {PK, NotNull, BIGINT(19)} <br />
     * @param traceId The value of the column 'TRACE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTraceId(Long traceId) {
        __modifiedProperties.addPropertyName("traceId");
        _traceId = traceId;
    }

    /**
     * [get] PREVIOUS_PRODUCT_ID: {UQ+, NotNull, BIGINT(19), FK to white_perrotta_over_product} <br />
     * @return The value of the column 'PREVIOUS_PRODUCT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getPreviousProductId() {
        return _previousProductId;
    }

    /**
     * [set] PREVIOUS_PRODUCT_ID: {UQ+, NotNull, BIGINT(19), FK to white_perrotta_over_product} <br />
     * @param previousProductId The value of the column 'PREVIOUS_PRODUCT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setPreviousProductId(Long previousProductId) {
        __modifiedProperties.addPropertyName("previousProductId");
        _previousProductId = previousProductId;
    }

    /**
     * [get] NEXT_PRODUCT_ID: {+UQ, IX, NotNull, BIGINT(19), FK to white_perrotta_over_product} <br />
     * @return The value of the column 'NEXT_PRODUCT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getNextProductId() {
        return _nextProductId;
    }

    /**
     * [set] NEXT_PRODUCT_ID: {+UQ, IX, NotNull, BIGINT(19), FK to white_perrotta_over_product} <br />
     * @param nextProductId The value of the column 'NEXT_PRODUCT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setNextProductId(Long nextProductId) {
        __modifiedProperties.addPropertyName("nextProductId");
        _nextProductId = nextProductId;
    }

    /**
     * [get] TRACE_TYPE_CODE: {NotNull, CHAR(3)} <br />
     * @return The value of the column 'TRACE_TYPE_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getTraceTypeCode() {
        return _traceTypeCode;
    }

    /**
     * [set] TRACE_TYPE_CODE: {NotNull, CHAR(3)} <br />
     * @param traceTypeCode The value of the column 'TRACE_TYPE_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setTraceTypeCode(String traceTypeCode) {
        __modifiedProperties.addPropertyName("traceTypeCode");
        _traceTypeCode = traceTypeCode;
    }
}
