package com.example.dbflute.tricky.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import com.example.dbflute.tricky.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.tricky.dbflute.exentity.*;

/**
 * The entity of PRODUCT_CATEGORY as TABLE. <br />
 * <pre>
 * [primary-key]
 *     PRODUCT_CATEGORY_CODE
 * 
 * [column]
 *     PRODUCT_CATEGORY_CODE, PRODUCT_CATEGORY_NAME, PARENT_CATEGORY_CODE
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
 *     
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     
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
public abstract class BsProductCategory extends AbstractEntity {

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
    /** PRODUCT_CATEGORY_CODE: {PK, NotNull, TEXT(2000000000, 10)} */
    protected String _productCategoryCode;

    /** PRODUCT_CATEGORY_NAME: {NotNull, TEXT(2000000000, 10)} */
    protected String _productCategoryName;

    /** PARENT_CATEGORY_CODE: {TEXT(2000000000, 10)} */
    protected String _parentCategoryCode;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "PRODUCT_CATEGORY";
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
        return "";
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
        return "";
    }

    @Override
    public ProductCategory clone() {
        return (ProductCategory)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PRODUCT_CATEGORY_CODE: {PK, NotNull, TEXT(2000000000, 10)} <br />
     * @return The value of the column 'PRODUCT_CATEGORY_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getProductCategoryCode() {
        checkSpecifiedProperty("productCategoryCode");
        return _productCategoryCode;
    }

    /**
     * [set] PRODUCT_CATEGORY_CODE: {PK, NotNull, TEXT(2000000000, 10)} <br />
     * @param productCategoryCode The value of the column 'PRODUCT_CATEGORY_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setProductCategoryCode(String productCategoryCode) {
        registerModifiedProperty("productCategoryCode");
        _productCategoryCode = productCategoryCode;
    }

    /**
     * [get] PRODUCT_CATEGORY_NAME: {NotNull, TEXT(2000000000, 10)} <br />
     * @return The value of the column 'PRODUCT_CATEGORY_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getProductCategoryName() {
        checkSpecifiedProperty("productCategoryName");
        return _productCategoryName;
    }

    /**
     * [set] PRODUCT_CATEGORY_NAME: {NotNull, TEXT(2000000000, 10)} <br />
     * @param productCategoryName The value of the column 'PRODUCT_CATEGORY_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setProductCategoryName(String productCategoryName) {
        registerModifiedProperty("productCategoryName");
        _productCategoryName = productCategoryName;
    }

    /**
     * [get] PARENT_CATEGORY_CODE: {TEXT(2000000000, 10)} <br />
     * @return The value of the column 'PARENT_CATEGORY_CODE'. (NullAllowed even if selected: for no constraint)
     */
    public String getParentCategoryCode() {
        checkSpecifiedProperty("parentCategoryCode");
        return _parentCategoryCode;
    }

    /**
     * [set] PARENT_CATEGORY_CODE: {TEXT(2000000000, 10)} <br />
     * @param parentCategoryCode The value of the column 'PARENT_CATEGORY_CODE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setParentCategoryCode(String parentCategoryCode) {
        registerModifiedProperty("parentCategoryCode");
        _parentCategoryCode = parentCategoryCode;
    }
}
