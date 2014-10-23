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
 * The entity of WHITE_PERROTTA_OVER_PRODUCT_NESTED as TABLE. <br />
 * <pre>
 * [primary-key]
 *     PRODUCT_NESTED_CODE
 * 
 * [column]
 *     PRODUCT_NESTED_CODE, PRODUCT_NESTED_NAME
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
 *     white_perrotta_over_product
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     whitePerrottaOverProductList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * String productNestedCode = entity.getProductNestedCode();
 * String productNestedName = entity.getProductNestedName();
 * entity.setProductNestedCode(productNestedCode);
 * entity.setProductNestedName(productNestedName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhitePerrottaOverProductNested extends AbstractEntity {

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
    /** PRODUCT_NESTED_CODE: {PK, NotNull, CHAR(3)} */
    protected String _productNestedCode;

    /** PRODUCT_NESTED_NAME: {NotNull, VARCHAR(200)} */
    protected String _productNestedName;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "white_perrotta_over_product_nested";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whitePerrottaOverProductNested";
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
        if (getProductNestedCode() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** white_perrotta_over_product by PRODUCT_NESTED_CODE, named 'whitePerrottaOverProductList'. */
    protected List<WhitePerrottaOverProduct> _whitePerrottaOverProductList;

    /**
     * [get] white_perrotta_over_product by PRODUCT_NESTED_CODE, named 'whitePerrottaOverProductList'.
     * @return The entity list of referrer property 'whitePerrottaOverProductList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhitePerrottaOverProduct> getWhitePerrottaOverProductList() {
        if (_whitePerrottaOverProductList == null) { _whitePerrottaOverProductList = newReferrerList(); }
        return _whitePerrottaOverProductList;
    }

    /**
     * [set] white_perrotta_over_product by PRODUCT_NESTED_CODE, named 'whitePerrottaOverProductList'.
     * @param whitePerrottaOverProductList The entity list of referrer property 'whitePerrottaOverProductList'. (NullAllowed)
     */
    public void setWhitePerrottaOverProductList(List<WhitePerrottaOverProduct> whitePerrottaOverProductList) {
        _whitePerrottaOverProductList = whitePerrottaOverProductList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsWhitePerrottaOverProductNested) {
            BsWhitePerrottaOverProductNested other = (BsWhitePerrottaOverProductNested)obj;
            if (!xSV(_productNestedCode, other._productNestedCode)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _productNestedCode);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whitePerrottaOverProductList != null) { for (WhitePerrottaOverProduct et : _whitePerrottaOverProductList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whitePerrottaOverProductList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_productNestedCode));
        sb.append(dm).append(xfND(_productNestedName));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whitePerrottaOverProductList != null && !_whitePerrottaOverProductList.isEmpty())
        { sb.append(dm).append("whitePerrottaOverProductList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhitePerrottaOverProductNested clone() {
        return (WhitePerrottaOverProductNested)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PRODUCT_NESTED_CODE: {PK, NotNull, CHAR(3)} <br />
     * @return The value of the column 'PRODUCT_NESTED_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getProductNestedCode() {
        checkSpecifiedProperty("productNestedCode");
        return _productNestedCode;
    }

    /**
     * [set] PRODUCT_NESTED_CODE: {PK, NotNull, CHAR(3)} <br />
     * @param productNestedCode The value of the column 'PRODUCT_NESTED_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setProductNestedCode(String productNestedCode) {
        __modifiedProperties.addPropertyName("productNestedCode");
        _productNestedCode = productNestedCode;
    }

    /**
     * [get] PRODUCT_NESTED_NAME: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'PRODUCT_NESTED_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getProductNestedName() {
        checkSpecifiedProperty("productNestedName");
        return _productNestedName;
    }

    /**
     * [set] PRODUCT_NESTED_NAME: {NotNull, VARCHAR(200)} <br />
     * @param productNestedName The value of the column 'PRODUCT_NESTED_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setProductNestedName(String productNestedName) {
        __modifiedProperties.addPropertyName("productNestedName");
        _productNestedName = productNestedName;
    }
}
