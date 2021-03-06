package com.example.dbflute.postgresql.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import org.seasar.dbflute.dbmeta.accessory.DomainEntity;
import com.example.dbflute.postgresql.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.postgresql.dbflute.exentity.*;

/**
 * The entity of (商品カテゴリ)product_category as TABLE. <br />
 * 商品のカテゴリを表現するマスタ。<br />
 * 自己参照の階層になっている。
 * <pre>
 * [primary-key]
 *     product_category_code
 * 
 * [column]
 *     product_category_code, product_category_name, parent_category_code
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
 *     product_category
 * 
 * [referrer table]
 *     product, product_category
 * 
 * [foreign property]
 *     productCategorySelf
 * 
 * [referrer property]
 *     productList, productCategorySelfList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * String productCategoryCode = entity.getProductCategoryCode();
 * String productCategoryName = entity.getProductCategoryName();
 * String parentCategoryCode = entity.getParentCategoryCode();
 * entity.setProductCategoryCode(productCategoryCode);
 * entity.setProductCategoryName(productCategoryName);
 * entity.setParentCategoryCode(parentCategoryCode);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsProductCategory extends AbstractEntity implements DomainEntity {

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
    /** (商品カテゴリコード)product_category_code: {PK, NotNull, bpchar(3)} */
    protected String _productCategoryCode;

    /** (商品カテゴリ名称)product_category_name: {NotNull, varchar(50)} */
    protected String _productCategoryName;

    /** (親カテゴリコード)parent_category_code: {bpchar(3), FK to product_category} */
    protected String _parentCategoryCode;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "product_category";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "productCategory";
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
        if (getProductCategoryCode() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** (商品カテゴリ)product_category by my parent_category_code, named 'productCategorySelf'. */
    protected ProductCategory _productCategorySelf;

    /**
     * [get] (商品カテゴリ)product_category by my parent_category_code, named 'productCategorySelf'.
     * @return The entity of foreign property 'productCategorySelf'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public ProductCategory getProductCategorySelf() {
        return _productCategorySelf;
    }

    /**
     * [set] (商品カテゴリ)product_category by my parent_category_code, named 'productCategorySelf'.
     * @param productCategorySelf The entity of foreign property 'productCategorySelf'. (NullAllowed)
     */
    public void setProductCategorySelf(ProductCategory productCategorySelf) {
        _productCategorySelf = productCategorySelf;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** (商品)product by product_category_code, named 'productList'. */
    protected List<Product> _productList;

    /**
     * [get] (商品)product by product_category_code, named 'productList'.
     * @return The entity list of referrer property 'productList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Product> getProductList() {
        if (_productList == null) { _productList = newReferrerList(); }
        return _productList;
    }

    /**
     * [set] (商品)product by product_category_code, named 'productList'.
     * @param productList The entity list of referrer property 'productList'. (NullAllowed)
     */
    public void setProductList(List<Product> productList) {
        _productList = productList;
    }

    /** (商品カテゴリ)product_category by parent_category_code, named 'productCategorySelfList'. */
    protected List<ProductCategory> _productCategorySelfList;

    /**
     * [get] (商品カテゴリ)product_category by parent_category_code, named 'productCategorySelfList'.
     * @return The entity list of referrer property 'productCategorySelfList'. (NotNull: even if no loading, returns empty list)
     */
    public List<ProductCategory> getProductCategorySelfList() {
        if (_productCategorySelfList == null) { _productCategorySelfList = newReferrerList(); }
        return _productCategorySelfList;
    }

    /**
     * [set] (商品カテゴリ)product_category by parent_category_code, named 'productCategorySelfList'.
     * @param productCategorySelfList The entity list of referrer property 'productCategorySelfList'. (NullAllowed)
     */
    public void setProductCategorySelfList(List<ProductCategory> productCategorySelfList) {
        _productCategorySelfList = productCategorySelfList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsProductCategory) {
            BsProductCategory other = (BsProductCategory)obj;
            if (!xSV(_productCategoryCode, other._productCategoryCode)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _productCategoryCode);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_productCategorySelf != null)
        { sb.append(li).append(xbRDS(_productCategorySelf, "productCategorySelf")); }
        if (_productList != null) { for (Product et : _productList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "productList")); } } }
        if (_productCategorySelfList != null) { for (ProductCategory et : _productCategorySelfList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "productCategorySelfList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_productCategoryCode));
        sb.append(dm).append(xfND(_productCategoryName));
        sb.append(dm).append(xfND(_parentCategoryCode));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_productCategorySelf != null)
        { sb.append(dm).append("productCategorySelf"); }
        if (_productList != null && !_productList.isEmpty())
        { sb.append(dm).append("productList"); }
        if (_productCategorySelfList != null && !_productCategorySelfList.isEmpty())
        { sb.append(dm).append("productCategorySelfList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public ProductCategory clone() {
        return (ProductCategory)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (商品カテゴリコード)product_category_code: {PK, NotNull, bpchar(3)} <br />
     * @return The value of the column 'product_category_code'. (basically NotNull if selected: for the constraint)
     */
    public String getProductCategoryCode() {
        checkSpecifiedProperty("productCategoryCode");
        return _productCategoryCode;
    }

    /**
     * [set] (商品カテゴリコード)product_category_code: {PK, NotNull, bpchar(3)} <br />
     * @param productCategoryCode The value of the column 'product_category_code'. (basically NotNull if update: for the constraint)
     */
    public void setProductCategoryCode(String productCategoryCode) {
        registerModifiedProperty("productCategoryCode");
        _productCategoryCode = productCategoryCode;
    }

    /**
     * [get] (商品カテゴリ名称)product_category_name: {NotNull, varchar(50)} <br />
     * @return The value of the column 'product_category_name'. (basically NotNull if selected: for the constraint)
     */
    public String getProductCategoryName() {
        checkSpecifiedProperty("productCategoryName");
        return _productCategoryName;
    }

    /**
     * [set] (商品カテゴリ名称)product_category_name: {NotNull, varchar(50)} <br />
     * @param productCategoryName The value of the column 'product_category_name'. (basically NotNull if update: for the constraint)
     */
    public void setProductCategoryName(String productCategoryName) {
        registerModifiedProperty("productCategoryName");
        _productCategoryName = productCategoryName;
    }

    /**
     * [get] (親カテゴリコード)parent_category_code: {bpchar(3), FK to product_category} <br />
     * 最上位の場合はデータなし。
     * @return The value of the column 'parent_category_code'. (NullAllowed even if selected: for no constraint)
     */
    public String getParentCategoryCode() {
        checkSpecifiedProperty("parentCategoryCode");
        return _parentCategoryCode;
    }

    /**
     * [set] (親カテゴリコード)parent_category_code: {bpchar(3), FK to product_category} <br />
     * 最上位の場合はデータなし。
     * @param parentCategoryCode The value of the column 'parent_category_code'. (NullAllowed: null update allowed for no constraint)
     */
    public void setParentCategoryCode(String parentCategoryCode) {
        registerModifiedProperty("parentCategoryCode");
        _parentCategoryCode = parentCategoryCode;
    }
}
