package com.example.dbflute.tricky.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import com.example.dbflute.tricky.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.tricky.dbflute.exentity.*;

/**
 * The entity of PRODUCT_STATUS as TABLE. <br />
 * <pre>
 * [primary-key]
 *     PRODUCT_STATUS_CODE
 * 
 * [column]
 *     PRODUCT_STATUS_CODE, PRODUCT_STATUS_NAME
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
 *     PRODUCT, SUMMARY_PRODUCT
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     productList, summaryProductList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * String productStatusCode = entity.getProductStatusCode();
 * String productStatusName = entity.getProductStatusName();
 * entity.setProductStatusCode(productStatusCode);
 * entity.setProductStatusName(productStatusName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsProductStatus extends AbstractEntity {

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
    /** PRODUCT_STATUS_CODE: {PK, NotNull, TEXT(2000000000, 10)} */
    protected String _productStatusCode;

    /** PRODUCT_STATUS_NAME: {NotNull, TEXT(2000000000, 10)} */
    protected String _productStatusName;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "PRODUCT_STATUS";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "productStatus";
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
        if (getProductStatusCode() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** PRODUCT by PRODUCT_STATUS_CODE, named 'productList'. */
    protected List<Product> _productList;

    /**
     * [get] PRODUCT by PRODUCT_STATUS_CODE, named 'productList'.
     * @return The entity list of referrer property 'productList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Product> getProductList() {
        if (_productList == null) { _productList = newReferrerList(); }
        return _productList;
    }

    /**
     * [set] PRODUCT by PRODUCT_STATUS_CODE, named 'productList'.
     * @param productList The entity list of referrer property 'productList'. (NullAllowed)
     */
    public void setProductList(List<Product> productList) {
        _productList = productList;
    }

    /** SUMMARY_PRODUCT by PRODUCT_STATUS_CODE, named 'summaryProductList'. */
    protected List<SummaryProduct> _summaryProductList;

    /**
     * [get] SUMMARY_PRODUCT by PRODUCT_STATUS_CODE, named 'summaryProductList'.
     * @return The entity list of referrer property 'summaryProductList'. (NotNull: even if no loading, returns empty list)
     */
    public List<SummaryProduct> getSummaryProductList() {
        if (_summaryProductList == null) { _summaryProductList = newReferrerList(); }
        return _summaryProductList;
    }

    /**
     * [set] SUMMARY_PRODUCT by PRODUCT_STATUS_CODE, named 'summaryProductList'.
     * @param summaryProductList The entity list of referrer property 'summaryProductList'. (NullAllowed)
     */
    public void setSummaryProductList(List<SummaryProduct> summaryProductList) {
        _summaryProductList = summaryProductList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsProductStatus) {
            BsProductStatus other = (BsProductStatus)obj;
            if (!xSV(_productStatusCode, other._productStatusCode)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _productStatusCode);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_productList != null) { for (Product et : _productList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "productList")); } } }
        if (_summaryProductList != null) { for (SummaryProduct et : _summaryProductList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "summaryProductList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_productStatusCode));
        sb.append(dm).append(xfND(_productStatusName));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_productList != null && !_productList.isEmpty())
        { sb.append(dm).append("productList"); }
        if (_summaryProductList != null && !_summaryProductList.isEmpty())
        { sb.append(dm).append("summaryProductList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public ProductStatus clone() {
        return (ProductStatus)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PRODUCT_STATUS_CODE: {PK, NotNull, TEXT(2000000000, 10)} <br />
     * @return The value of the column 'PRODUCT_STATUS_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getProductStatusCode() {
        checkSpecifiedProperty("productStatusCode");
        return _productStatusCode;
    }

    /**
     * [set] PRODUCT_STATUS_CODE: {PK, NotNull, TEXT(2000000000, 10)} <br />
     * @param productStatusCode The value of the column 'PRODUCT_STATUS_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setProductStatusCode(String productStatusCode) {
        __modifiedProperties.addPropertyName("productStatusCode");
        _productStatusCode = productStatusCode;
    }

    /**
     * [get] PRODUCT_STATUS_NAME: {NotNull, TEXT(2000000000, 10)} <br />
     * @return The value of the column 'PRODUCT_STATUS_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getProductStatusName() {
        checkSpecifiedProperty("productStatusName");
        return _productStatusName;
    }

    /**
     * [set] PRODUCT_STATUS_NAME: {NotNull, TEXT(2000000000, 10)} <br />
     * @param productStatusName The value of the column 'PRODUCT_STATUS_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setProductStatusName(String productStatusName) {
        __modifiedProperties.addPropertyName("productStatusName");
        _productStatusName = productStatusName;
    }
}
