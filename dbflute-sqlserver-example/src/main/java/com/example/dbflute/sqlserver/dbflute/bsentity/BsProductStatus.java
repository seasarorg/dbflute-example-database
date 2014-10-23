package com.example.dbflute.sqlserver.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import com.example.dbflute.sqlserver.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.sqlserver.dbflute.exentity.*;

/**
 * The entity of PRODUCT_STATUS as TABLE. <br />
 * <pre>
 * [primary-key]
 *     PRODUCT_STATUS_CODE
 * 
 * [column]
 *     PRODUCT_STATUS_CODE, PRODUCT_STATUS_NAME, DISPLAY_ORDER
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
 *     PRODUCT
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     productList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * String productStatusCode = entity.getProductStatusCode();
 * String productStatusName = entity.getProductStatusName();
 * Integer displayOrder = entity.getDisplayOrder();
 * entity.setProductStatusCode(productStatusCode);
 * entity.setProductStatusName(productStatusName);
 * entity.setDisplayOrder(displayOrder);
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
    /** PRODUCT_STATUS_CODE: {PK, NotNull, char(3)} */
    protected String _productStatusCode;

    /** PRODUCT_STATUS_NAME: {NotNull, nvarchar(50)} */
    protected String _productStatusName;

    /** DISPLAY_ORDER: {UQ, NotNull, int(10)} */
    protected Integer _displayOrder;

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

    /**
     * To be unique by the unique column. <br />
     * You can update the entity by the key when entity update (NOT batch update).
     * @param displayOrder : UQ, NotNull, int(10). (NotNull)
     */
    public void uniqueBy(Integer displayOrder) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("displayOrder");
        setDisplayOrder(displayOrder);
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
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_productStatusCode));
        sb.append(dm).append(xfND(_productStatusName));
        sb.append(dm).append(xfND(_displayOrder));
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
     * [get] PRODUCT_STATUS_CODE: {PK, NotNull, char(3)} <br />
     * @return The value of the column 'PRODUCT_STATUS_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getProductStatusCode() {
        checkSpecifiedProperty("productStatusCode");
        return _productStatusCode;
    }

    /**
     * [set] PRODUCT_STATUS_CODE: {PK, NotNull, char(3)} <br />
     * @param productStatusCode The value of the column 'PRODUCT_STATUS_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setProductStatusCode(String productStatusCode) {
        __modifiedProperties.addPropertyName("productStatusCode");
        _productStatusCode = productStatusCode;
    }

    /**
     * [get] PRODUCT_STATUS_NAME: {NotNull, nvarchar(50)} <br />
     * @return The value of the column 'PRODUCT_STATUS_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getProductStatusName() {
        checkSpecifiedProperty("productStatusName");
        return _productStatusName;
    }

    /**
     * [set] PRODUCT_STATUS_NAME: {NotNull, nvarchar(50)} <br />
     * @param productStatusName The value of the column 'PRODUCT_STATUS_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setProductStatusName(String productStatusName) {
        __modifiedProperties.addPropertyName("productStatusName");
        _productStatusName = productStatusName;
    }

    /**
     * [get] DISPLAY_ORDER: {UQ, NotNull, int(10)} <br />
     * @return The value of the column 'DISPLAY_ORDER'. (basically NotNull if selected: for the constraint)
     */
    public Integer getDisplayOrder() {
        checkSpecifiedProperty("displayOrder");
        return _displayOrder;
    }

    /**
     * [set] DISPLAY_ORDER: {UQ, NotNull, int(10)} <br />
     * @param displayOrder The value of the column 'DISPLAY_ORDER'. (basically NotNull if update: for the constraint)
     */
    public void setDisplayOrder(Integer displayOrder) {
        __modifiedProperties.addPropertyName("displayOrder");
        _displayOrder = displayOrder;
    }
}
