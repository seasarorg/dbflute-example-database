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
import com.example.dbflute.mysql.dbflute.allcommon.CDef;
import com.example.dbflute.mysql.dbflute.exentity.*;

/**
 * The entity of (VIEW)SUMMARY_PRODUCT as VIEW. <br />
 * <pre>
 * [primary-key]
 *     PRODUCT_ID
 * 
 * [column]
 *     PRODUCT_ID, PRODUCT_NAME, PRODUCT_HANDLE_CODE, PRODUCT_STATUS_CODE, LATEST_PURCHASE_DATETIME
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
 *     PRODUCT_STATUS
 * 
 * [referrer table]
 *     purchase
 * 
 * [foreign property]
 *     productStatus
 * 
 * [referrer property]
 *     purchaseList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer productId = entity.getProductId();
 * String productName = entity.getProductName();
 * String productHandleCode = entity.getProductHandleCode();
 * String productStatusCode = entity.getProductStatusCode();
 * java.sql.Timestamp latestPurchaseDatetime = entity.getLatestPurchaseDatetime();
 * entity.setProductId(productId);
 * entity.setProductName(productName);
 * entity.setProductHandleCode(productHandleCode);
 * entity.setProductStatusCode(productStatusCode);
 * entity.setLatestPurchaseDatetime(latestPurchaseDatetime);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSummaryProduct extends AbstractEntity {

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
    /** (商品ID)PRODUCT_ID: {PK, NotNull, INT(10), default=[0]} */
    protected Integer _productId;

    /** (商品名称)PRODUCT_NAME: {NotNull, VARCHAR(50)} */
    protected String _productName;

    /** (商品ハンドルコード)PRODUCT_HANDLE_CODE: {UQ, NotNull, VARCHAR(100)} */
    protected String _productHandleCode;

    /** PRODUCT_STATUS_CODE: {NotNull, CHAR(3), FK to PRODUCT_STATUS, classification=ProductStatus} */
    protected String _productStatusCode;

    /** LATEST_PURCHASE_DATETIME: {DATETIME(19)} */
    protected java.sql.Timestamp _latestPurchaseDatetime;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "summary_product";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "summaryProduct";
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
     * To be unique by the unique column. <br />
     * You can update the entity by the key when entity update (NOT batch update).
     * @param productHandleCode (商品ハンドルコード): UQ, NotNull, VARCHAR(100). (NotNull)
     */
    public void uniqueBy(String productHandleCode) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("productHandleCode");
        setProductHandleCode(productHandleCode);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of productStatusCode as the classification of ProductStatus. <br />
     * PRODUCT_STATUS_CODE: {NotNull, CHAR(3), FK to PRODUCT_STATUS, classification=ProductStatus} <br />
     * 商品ステータス: 商品の状態を示す
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ProductStatus getProductStatusCodeAsProductStatus() {
        return CDef.ProductStatus.codeOf(getProductStatusCode());
    }

    /**
     * Set the value of productStatusCode as the classification of ProductStatus. <br />
     * PRODUCT_STATUS_CODE: {NotNull, CHAR(3), FK to PRODUCT_STATUS, classification=ProductStatus} <br />
     * 商品ステータス: 商品の状態を示す
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setProductStatusCodeAsProductStatus(CDef.ProductStatus cdef) {
        setProductStatusCode(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of productStatusCode as OnSale (ONS). <br />
     * 生産販売可能
     */
    public void setProductStatusCode_OnSale() {
        setProductStatusCodeAsProductStatus(CDef.ProductStatus.OnSale);
    }

    /**
     * Set the value of productStatusCode as ProductStop (PST). <br />
     * 生産中止
     */
    public void setProductStatusCode_ProductStop() {
        setProductStatusCodeAsProductStatus(CDef.ProductStatus.ProductStop);
    }

    /**
     * Set the value of productStatusCode as SaleStop (SST). <br />
     * 販売中止
     */
    public void setProductStatusCode_SaleStop() {
        setProductStatusCodeAsProductStatus(CDef.ProductStatus.SaleStop);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of productStatusCode OnSale? <br />
     * 生産販売可能
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isProductStatusCodeOnSale() {
        CDef.ProductStatus cdef = getProductStatusCodeAsProductStatus();
        return cdef != null ? cdef.equals(CDef.ProductStatus.OnSale) : false;
    }

    /**
     * Is the value of productStatusCode ProductStop? <br />
     * 生産中止
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isProductStatusCodeProductStop() {
        CDef.ProductStatus cdef = getProductStatusCodeAsProductStatus();
        return cdef != null ? cdef.equals(CDef.ProductStatus.ProductStop) : false;
    }

    /**
     * Is the value of productStatusCode SaleStop? <br />
     * 販売中止
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isProductStatusCodeSaleStop() {
        CDef.ProductStatus cdef = getProductStatusCodeAsProductStatus();
        return cdef != null ? cdef.equals(CDef.ProductStatus.SaleStop) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'productStatusCode' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getProductStatusCodeName() {
        CDef.ProductStatus cdef = getProductStatusCodeAsProductStatus();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'productStatusCode' as classification alias.
     * @return The string of classification alias. (NullAllowed: when the column value is null)
     */
    public String getProductStatusCodeAlias() {
        CDef.ProductStatus cdef = getProductStatusCodeAsProductStatus();
        return cdef != null ? cdef.alias() : null;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** (商品ステータス)product_status by my PRODUCT_STATUS_CODE, named 'productStatus'. */
    protected ProductStatus _productStatus;

    /**
     * [get] (商品ステータス)product_status by my PRODUCT_STATUS_CODE, named 'productStatus'.
     * @return The entity of foreign property 'productStatus'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public ProductStatus getProductStatus() {
        return _productStatus;
    }

    /**
     * [set] (商品ステータス)product_status by my PRODUCT_STATUS_CODE, named 'productStatus'.
     * @param productStatus The entity of foreign property 'productStatus'. (NullAllowed)
     */
    public void setProductStatus(ProductStatus productStatus) {
        _productStatus = productStatus;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** (購入)purchase by PRODUCT_ID, named 'purchaseList'. */
    protected List<Purchase> _purchaseList;

    /**
     * [get] (購入)purchase by PRODUCT_ID, named 'purchaseList'.
     * @return The entity list of referrer property 'purchaseList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Purchase> getPurchaseList() {
        if (_purchaseList == null) { _purchaseList = newReferrerList(); }
        return _purchaseList;
    }

    /**
     * [set] (購入)purchase by PRODUCT_ID, named 'purchaseList'.
     * @param purchaseList The entity list of referrer property 'purchaseList'. (NullAllowed)
     */
    public void setPurchaseList(List<Purchase> purchaseList) {
        _purchaseList = purchaseList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsSummaryProduct) {
            BsSummaryProduct other = (BsSummaryProduct)obj;
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
        if (_productStatus != null)
        { sb.append(li).append(xbRDS(_productStatus, "productStatus")); }
        if (_purchaseList != null) { for (Purchase et : _purchaseList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "purchaseList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_productId));
        sb.append(dm).append(xfND(_productName));
        sb.append(dm).append(xfND(_productHandleCode));
        sb.append(dm).append(xfND(_productStatusCode));
        sb.append(dm).append(xfND(_latestPurchaseDatetime));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_productStatus != null)
        { sb.append(dm).append("productStatus"); }
        if (_purchaseList != null && !_purchaseList.isEmpty())
        { sb.append(dm).append("purchaseList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public SummaryProduct clone() {
        return (SummaryProduct)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (商品ID)PRODUCT_ID: {PK, NotNull, INT(10), default=[0]} <br />
     * @return The value of the column 'PRODUCT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getProductId() {
        checkSpecifiedProperty("productId");
        return _productId;
    }

    /**
     * [set] (商品ID)PRODUCT_ID: {PK, NotNull, INT(10), default=[0]} <br />
     * @param productId The value of the column 'PRODUCT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setProductId(Integer productId) {
        registerModifiedProperty("productId");
        _productId = productId;
    }

    /**
     * [get] (商品名称)PRODUCT_NAME: {NotNull, VARCHAR(50)} <br />
     * @return The value of the column 'PRODUCT_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getProductName() {
        checkSpecifiedProperty("productName");
        return _productName;
    }

    /**
     * [set] (商品名称)PRODUCT_NAME: {NotNull, VARCHAR(50)} <br />
     * @param productName The value of the column 'PRODUCT_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setProductName(String productName) {
        registerModifiedProperty("productName");
        _productName = productName;
    }

    /**
     * [get] (商品ハンドルコード)PRODUCT_HANDLE_CODE: {UQ, NotNull, VARCHAR(100)} <br />
     * 商品を識別する業務上のコード。
     * @return The value of the column 'PRODUCT_HANDLE_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getProductHandleCode() {
        checkSpecifiedProperty("productHandleCode");
        return _productHandleCode;
    }

    /**
     * [set] (商品ハンドルコード)PRODUCT_HANDLE_CODE: {UQ, NotNull, VARCHAR(100)} <br />
     * 商品を識別する業務上のコード。
     * @param productHandleCode The value of the column 'PRODUCT_HANDLE_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setProductHandleCode(String productHandleCode) {
        registerModifiedProperty("productHandleCode");
        _productHandleCode = productHandleCode;
    }

    /**
     * [get] PRODUCT_STATUS_CODE: {NotNull, CHAR(3), FK to PRODUCT_STATUS, classification=ProductStatus} <br />
     * @return The value of the column 'PRODUCT_STATUS_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getProductStatusCode() {
        checkSpecifiedProperty("productStatusCode");
        return _productStatusCode;
    }

    /**
     * [set] PRODUCT_STATUS_CODE: {NotNull, CHAR(3), FK to PRODUCT_STATUS, classification=ProductStatus} <br />
     * @param productStatusCode The value of the column 'PRODUCT_STATUS_CODE'. (basically NotNull if update: for the constraint)
     */
    protected void setProductStatusCode(String productStatusCode) {
        registerModifiedProperty("productStatusCode");
        _productStatusCode = productStatusCode;
    }

    /**
     * [get] LATEST_PURCHASE_DATETIME: {DATETIME(19)} <br />
     * @return The value of the column 'LATEST_PURCHASE_DATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getLatestPurchaseDatetime() {
        checkSpecifiedProperty("latestPurchaseDatetime");
        return _latestPurchaseDatetime;
    }

    /**
     * [set] LATEST_PURCHASE_DATETIME: {DATETIME(19)} <br />
     * @param latestPurchaseDatetime The value of the column 'LATEST_PURCHASE_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLatestPurchaseDatetime(java.sql.Timestamp latestPurchaseDatetime) {
        registerModifiedProperty("latestPurchaseDatetime");
        _latestPurchaseDatetime = latestPurchaseDatetime;
    }

    /**
     * For framework so basically DON'T use this method.
     * @param productStatusCode The value of the column 'PRODUCT_STATUS_CODE'. (basically NotNull if update: for the constraint)
     */
    public void mynativeMappingProductStatusCode(String productStatusCode) {
        setProductStatusCode(productStatusCode);
    }
}
