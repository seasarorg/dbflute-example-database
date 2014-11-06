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

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
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
public abstract class BsWhitePerrottaOverTrace extends AbstractEntity {

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
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsWhitePerrottaOverTrace) {
            BsWhitePerrottaOverTrace other = (BsWhitePerrottaOverTrace)obj;
            if (!xSV(_traceId, other._traceId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _traceId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whitePerrottaOverProductByNextProductId != null)
        { sb.append(li).append(xbRDS(_whitePerrottaOverProductByNextProductId, "whitePerrottaOverProductByNextProductId")); }
        if (_whitePerrottaOverProductByPreviousProductId != null)
        { sb.append(li).append(xbRDS(_whitePerrottaOverProductByPreviousProductId, "whitePerrottaOverProductByPreviousProductId")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_traceId));
        sb.append(dm).append(xfND(_previousProductId));
        sb.append(dm).append(xfND(_nextProductId));
        sb.append(dm).append(xfND(_traceTypeCode));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whitePerrottaOverProductByNextProductId != null)
        { sb.append(dm).append("whitePerrottaOverProductByNextProductId"); }
        if (_whitePerrottaOverProductByPreviousProductId != null)
        { sb.append(dm).append("whitePerrottaOverProductByPreviousProductId"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhitePerrottaOverTrace clone() {
        return (WhitePerrottaOverTrace)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] TRACE_ID: {PK, NotNull, BIGINT(19)} <br />
     * @return The value of the column 'TRACE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTraceId() {
        checkSpecifiedProperty("traceId");
        return _traceId;
    }

    /**
     * [set] TRACE_ID: {PK, NotNull, BIGINT(19)} <br />
     * @param traceId The value of the column 'TRACE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTraceId(Long traceId) {
        registerModifiedProperty("traceId");
        _traceId = traceId;
    }

    /**
     * [get] PREVIOUS_PRODUCT_ID: {UQ+, NotNull, BIGINT(19), FK to white_perrotta_over_product} <br />
     * @return The value of the column 'PREVIOUS_PRODUCT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getPreviousProductId() {
        checkSpecifiedProperty("previousProductId");
        return _previousProductId;
    }

    /**
     * [set] PREVIOUS_PRODUCT_ID: {UQ+, NotNull, BIGINT(19), FK to white_perrotta_over_product} <br />
     * @param previousProductId The value of the column 'PREVIOUS_PRODUCT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setPreviousProductId(Long previousProductId) {
        registerModifiedProperty("previousProductId");
        _previousProductId = previousProductId;
    }

    /**
     * [get] NEXT_PRODUCT_ID: {+UQ, IX, NotNull, BIGINT(19), FK to white_perrotta_over_product} <br />
     * @return The value of the column 'NEXT_PRODUCT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getNextProductId() {
        checkSpecifiedProperty("nextProductId");
        return _nextProductId;
    }

    /**
     * [set] NEXT_PRODUCT_ID: {+UQ, IX, NotNull, BIGINT(19), FK to white_perrotta_over_product} <br />
     * @param nextProductId The value of the column 'NEXT_PRODUCT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setNextProductId(Long nextProductId) {
        registerModifiedProperty("nextProductId");
        _nextProductId = nextProductId;
    }

    /**
     * [get] TRACE_TYPE_CODE: {NotNull, CHAR(3)} <br />
     * @return The value of the column 'TRACE_TYPE_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getTraceTypeCode() {
        checkSpecifiedProperty("traceTypeCode");
        return _traceTypeCode;
    }

    /**
     * [set] TRACE_TYPE_CODE: {NotNull, CHAR(3)} <br />
     * @param traceTypeCode The value of the column 'TRACE_TYPE_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setTraceTypeCode(String traceTypeCode) {
        registerModifiedProperty("traceTypeCode");
        _traceTypeCode = traceTypeCode;
    }
}
