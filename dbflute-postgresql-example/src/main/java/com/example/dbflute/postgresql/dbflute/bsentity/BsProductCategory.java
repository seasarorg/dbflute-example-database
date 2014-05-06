package com.example.dbflute.postgresql.dbflute.bsentity;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.Entity;
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
public abstract class BsProductCategory implements Entity, Serializable, Cloneable {

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

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
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
     * (商品カテゴリ)product_category by my parent_category_code, named 'productCategorySelf'.
     * @return The entity of foreign property 'productCategorySelf'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public ProductCategory getProductCategorySelf() {
        return _productCategorySelf;
    }

    /**
     * (商品カテゴリ)product_category by my parent_category_code, named 'productCategorySelf'.
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
     * (商品)product by product_category_code, named 'productList'.
     * @return The entity list of referrer property 'productList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Product> getProductList() {
        if (_productList == null) { _productList = newReferrerList(); }
        return _productList;
    }

    /**
     * (商品)product by product_category_code, named 'productList'.
     * @param productList The entity list of referrer property 'productList'. (NullAllowed)
     */
    public void setProductList(List<Product> productList) {
        _productList = productList;
    }

    /** (商品カテゴリ)product_category by parent_category_code, named 'productCategorySelfList'. */
    protected List<ProductCategory> _productCategorySelfList;

    /**
     * (商品カテゴリ)product_category by parent_category_code, named 'productCategorySelfList'.
     * @return The entity list of referrer property 'productCategorySelfList'. (NotNull: even if no loading, returns empty list)
     */
    public List<ProductCategory> getProductCategorySelfList() {
        if (_productCategorySelfList == null) { _productCategorySelfList = newReferrerList(); }
        return _productCategorySelfList;
    }

    /**
     * (商品カテゴリ)product_category by parent_category_code, named 'productCategorySelfList'.
     * @param productCategorySelfList The entity list of referrer property 'productCategorySelfList'. (NullAllowed)
     */
    public void setProductCategorySelfList(List<ProductCategory> productCategorySelfList) {
        _productCategorySelfList = productCategorySelfList;
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
        if (obj == null || !(obj instanceof BsProductCategory)) { return false; }
        BsProductCategory other = (BsProductCategory)obj;
        if (!xSV(getProductCategoryCode(), other.getProductCategoryCode())) { return false; }
        return true;
    }
    protected boolean xSV(Object value1, Object value2) {
        return FunCustodial.isSameValue(value1, value2);
    }

    /**
     * Calculate the hash-code from primary-keys or columns.
     * @return The hash-code from primary-key or columns.
     */
    public int hashCode() {
        int result = 17;
        result = xCH(result, getTableDbName());
        result = xCH(result, getProductCategoryCode());
        return result;
    }
    protected int xCH(int result, Object value) {
        return FunCustodial.calculateHashcode(result, value);
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
        String l = "\n  ";
        if (_productCategorySelf != null)
        { sb.append(l).append(xbRDS(_productCategorySelf, "productCategorySelf")); }
        if (_productList != null) { for (Entity e : _productList)
        { if (e != null) { sb.append(l).append(xbRDS(e, "productList")); } } }
        if (_productCategorySelfList != null) { for (Entity e : _productCategorySelfList)
        { if (e != null) { sb.append(l).append(xbRDS(e, "productCategorySelfList")); } } }
        return sb.toString();
    }
    protected String xbRDS(Entity e, String name) { // buildRelationDisplayString()
        return e.buildDisplayString(name, true, true);
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
        String delimiter = ", ";
        sb.append(delimiter).append(getProductCategoryCode());
        sb.append(delimiter).append(getProductCategoryName());
        sb.append(delimiter).append(getParentCategoryCode());
        if (sb.length() > delimiter.length()) {
            sb.delete(0, delimiter.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String c = ",";
        if (_productCategorySelf != null) { sb.append(c).append("productCategorySelf"); }
        if (_productList != null && !_productList.isEmpty())
        { sb.append(c).append("productList"); }
        if (_productCategorySelfList != null && !_productCategorySelfList.isEmpty())
        { sb.append(c).append("productCategorySelfList"); }
        if (sb.length() > c.length()) {
            sb.delete(0, c.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public ProductCategory clone() {
        try {
            return (ProductCategory)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (商品カテゴリコード)product_category_code: {PK, NotNull, bpchar(3)} <br />
     * @return The value of the column 'product_category_code'. (basically NotNull if selected: for the constraint)
     */
    public String getProductCategoryCode() {
        return _productCategoryCode;
    }

    /**
     * [set] (商品カテゴリコード)product_category_code: {PK, NotNull, bpchar(3)} <br />
     * @param productCategoryCode The value of the column 'product_category_code'. (basically NotNull if update: for the constraint)
     */
    public void setProductCategoryCode(String productCategoryCode) {
        __modifiedProperties.addPropertyName("productCategoryCode");
        this._productCategoryCode = productCategoryCode;
    }

    /**
     * [get] (商品カテゴリ名称)product_category_name: {NotNull, varchar(50)} <br />
     * @return The value of the column 'product_category_name'. (basically NotNull if selected: for the constraint)
     */
    public String getProductCategoryName() {
        return _productCategoryName;
    }

    /**
     * [set] (商品カテゴリ名称)product_category_name: {NotNull, varchar(50)} <br />
     * @param productCategoryName The value of the column 'product_category_name'. (basically NotNull if update: for the constraint)
     */
    public void setProductCategoryName(String productCategoryName) {
        __modifiedProperties.addPropertyName("productCategoryName");
        this._productCategoryName = productCategoryName;
    }

    /**
     * [get] (親カテゴリコード)parent_category_code: {bpchar(3), FK to product_category} <br />
     * 最上位の場合はデータなし。
     * @return The value of the column 'parent_category_code'. (NullAllowed even if selected: for no constraint)
     */
    public String getParentCategoryCode() {
        return _parentCategoryCode;
    }

    /**
     * [set] (親カテゴリコード)parent_category_code: {bpchar(3), FK to product_category} <br />
     * 最上位の場合はデータなし。
     * @param parentCategoryCode The value of the column 'parent_category_code'. (NullAllowed: null update allowed for no constraint)
     */
    public void setParentCategoryCode(String parentCategoryCode) {
        __modifiedProperties.addPropertyName("parentCategoryCode");
        this._parentCategoryCode = parentCategoryCode;
    }
}
