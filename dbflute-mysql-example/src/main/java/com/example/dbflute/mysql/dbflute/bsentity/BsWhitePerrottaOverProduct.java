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
public abstract class BsWhitePerrottaOverProduct extends AbstractEntity {

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
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsWhitePerrottaOverProduct) {
            BsWhitePerrottaOverProduct other = (BsWhitePerrottaOverProduct)obj;
            if (!xSV(_productId, other._productId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _productId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whitePerrottaOverProductNested != null)
        { sb.append(li).append(xbRDS(_whitePerrottaOverProductNested, "whitePerrottaOverProductNested")); }
        if (_whitePerrottaOverTraceAsPerrotta != null)
        { sb.append(li).append(xbRDS(_whitePerrottaOverTraceAsPerrotta, "whitePerrottaOverTraceAsPerrotta")); }
        if (_whitePerrottaOverMemberList != null) { for (WhitePerrottaOverMember et : _whitePerrottaOverMemberList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whitePerrottaOverMemberList")); } } }
        if (_whitePerrottaOverTraceByNextProductIdList != null) { for (WhitePerrottaOverTrace et : _whitePerrottaOverTraceByNextProductIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whitePerrottaOverTraceByNextProductIdList")); } } }
        if (_whitePerrottaOverTraceByPreviousProductIdList != null) { for (WhitePerrottaOverTrace et : _whitePerrottaOverTraceByPreviousProductIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whitePerrottaOverTraceByPreviousProductIdList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_productId));
        sb.append(dm).append(xfND(_productName));
        sb.append(dm).append(xfND(_productNestedCode));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whitePerrottaOverProductNested != null)
        { sb.append(dm).append("whitePerrottaOverProductNested"); }
        if (_whitePerrottaOverTraceAsPerrotta != null)
        { sb.append(dm).append("whitePerrottaOverTraceAsPerrotta"); }
        if (_whitePerrottaOverMemberList != null && !_whitePerrottaOverMemberList.isEmpty())
        { sb.append(dm).append("whitePerrottaOverMemberList"); }
        if (_whitePerrottaOverTraceByNextProductIdList != null && !_whitePerrottaOverTraceByNextProductIdList.isEmpty())
        { sb.append(dm).append("whitePerrottaOverTraceByNextProductIdList"); }
        if (_whitePerrottaOverTraceByPreviousProductIdList != null && !_whitePerrottaOverTraceByPreviousProductIdList.isEmpty())
        { sb.append(dm).append("whitePerrottaOverTraceByPreviousProductIdList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhitePerrottaOverProduct clone() {
        return (WhitePerrottaOverProduct)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PRODUCT_ID: {PK, NotNull, BIGINT(19), FK to WHITE_PERROTTA_OVER_TRACE} <br />
     * @return The value of the column 'PRODUCT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getProductId() {
        checkSpecifiedProperty("productId");
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {PK, NotNull, BIGINT(19), FK to WHITE_PERROTTA_OVER_TRACE} <br />
     * @param productId The value of the column 'PRODUCT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setProductId(Long productId) {
        registerModifiedProperty("productId");
        _productId = productId;
    }

    /**
     * [get] PRODUCT_NAME: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'PRODUCT_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getProductName() {
        checkSpecifiedProperty("productName");
        return _productName;
    }

    /**
     * [set] PRODUCT_NAME: {NotNull, VARCHAR(200)} <br />
     * @param productName The value of the column 'PRODUCT_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setProductName(String productName) {
        registerModifiedProperty("productName");
        _productName = productName;
    }

    /**
     * [get] PRODUCT_NESTED_CODE: {IX, NotNull, CHAR(3), FK to white_perrotta_over_product_nested} <br />
     * @return The value of the column 'PRODUCT_NESTED_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getProductNestedCode() {
        checkSpecifiedProperty("productNestedCode");
        return _productNestedCode;
    }

    /**
     * [set] PRODUCT_NESTED_CODE: {IX, NotNull, CHAR(3), FK to white_perrotta_over_product_nested} <br />
     * @param productNestedCode The value of the column 'PRODUCT_NESTED_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setProductNestedCode(String productNestedCode) {
        registerModifiedProperty("productNestedCode");
        _productNestedCode = productNestedCode;
    }
}
