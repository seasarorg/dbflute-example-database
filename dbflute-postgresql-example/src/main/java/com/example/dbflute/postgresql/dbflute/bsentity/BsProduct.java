package com.example.dbflute.postgresql.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import com.example.dbflute.postgresql.dbflute.allcommon.EntityDefinedCommonColumn;
import com.example.dbflute.postgresql.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.postgresql.dbflute.exentity.*;

/**
 * The entity of (商品)product as TABLE. <br />
 * <pre>
 * [primary-key]
 *     product_id
 * 
 * [column]
 *     product_id, product_name, product_handle_code, product_category_code, product_status_code, regular_price, register_datetime, register_user, register_process, update_datetime, update_user, update_process, version_no
 * 
 * [sequence]
 *     product_product_id_seq
 * 
 * [identity]
 *     
 * 
 * [version-no]
 *     version_no
 * 
 * [foreign table]
 *     product_category, product_status
 * 
 * [referrer table]
 *     purchase
 * 
 * [foreign property]
 *     productCategory, productStatus
 * 
 * [referrer property]
 *     purchaseList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer productId = entity.getProductId();
 * String productName = entity.getProductName();
 * String productHandleCode = entity.getProductHandleCode();
 * String productCategoryCode = entity.getProductCategoryCode();
 * String productStatusCode = entity.getProductStatusCode();
 * Integer regularPrice = entity.getRegularPrice();
 * java.sql.Timestamp registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * String registerProcess = entity.getRegisterProcess();
 * java.sql.Timestamp updateDatetime = entity.getUpdateDatetime();
 * String updateUser = entity.getUpdateUser();
 * String updateProcess = entity.getUpdateProcess();
 * Long versionNo = entity.getVersionNo();
 * entity.setProductId(productId);
 * entity.setProductName(productName);
 * entity.setProductHandleCode(productHandleCode);
 * entity.setProductCategoryCode(productCategoryCode);
 * entity.setProductStatusCode(productStatusCode);
 * entity.setRegularPrice(regularPrice);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterUser(registerUser);
 * entity.setRegisterProcess(registerProcess);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateUser(updateUser);
 * entity.setUpdateProcess(updateProcess);
 * entity.setVersionNo(versionNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsProduct extends AbstractEntity implements EntityDefinedCommonColumn {

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
    /** product_id: {PK, ID, NotNull, serial(10)} */
    protected Integer _productId;

    /** (商品名称)product_name: {IX, NotNull, varchar(50)} */
    protected String _productName;

    /** (商品ハンドルコード)product_handle_code: {UQ, NotNull, varchar(100)} */
    protected String _productHandleCode;

    /** product_category_code: {NotNull, bpchar(3), FK to product_category} */
    protected String _productCategoryCode;

    /** product_status_code: {NotNull, bpchar(3), FK to product_status} */
    protected String _productStatusCode;

    /** regular_price: {NotNull, int4(10)} */
    protected Integer _regularPrice;

    /** register_datetime: {NotNull, timestamp(26, 3)} */
    protected java.sql.Timestamp _registerDatetime;

    /** register_user: {NotNull, varchar(200)} */
    protected String _registerUser;

    /** register_process: {NotNull, varchar(200)} */
    protected String _registerProcess;

    /** update_datetime: {NotNull, timestamp(26, 3)} */
    protected java.sql.Timestamp _updateDatetime;

    /** update_user: {NotNull, varchar(200)} */
    protected String _updateUser;

    /** update_process: {NotNull, varchar(200)} */
    protected String _updateProcess;

    /** version_no: {NotNull, int8(19)} */
    protected Long _versionNo;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** Is common column auto set up effective? */
    protected boolean __canCommonColumnAutoSetup = true;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "product";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "product";
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
     * @param productHandleCode (商品ハンドルコード): UQ, NotNull, varchar(100). (NotNull)
     */
    public void uniqueBy(String productHandleCode) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("productHandleCode");
        setProductHandleCode(productHandleCode);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** (商品カテゴリ)product_category by my product_category_code, named 'productCategory'. */
    protected ProductCategory _productCategory;

    /**
     * [get] (商品カテゴリ)product_category by my product_category_code, named 'productCategory'.
     * @return The entity of foreign property 'productCategory'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public ProductCategory getProductCategory() {
        return _productCategory;
    }

    /**
     * [set] (商品カテゴリ)product_category by my product_category_code, named 'productCategory'.
     * @param productCategory The entity of foreign property 'productCategory'. (NullAllowed)
     */
    public void setProductCategory(ProductCategory productCategory) {
        _productCategory = productCategory;
    }

    /** (商品ステータス)product_status by my product_status_code, named 'productStatus'. */
    protected ProductStatus _productStatus;

    /**
     * [get] (商品ステータス)product_status by my product_status_code, named 'productStatus'.
     * @return The entity of foreign property 'productStatus'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public ProductStatus getProductStatus() {
        return _productStatus;
    }

    /**
     * [set] (商品ステータス)product_status by my product_status_code, named 'productStatus'.
     * @param productStatus The entity of foreign property 'productStatus'. (NullAllowed)
     */
    public void setProductStatus(ProductStatus productStatus) {
        _productStatus = productStatus;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** (購入)purchase by product_id, named 'purchaseList'. */
    protected List<Purchase> _purchaseList;

    /**
     * [get] (購入)purchase by product_id, named 'purchaseList'.
     * @return The entity list of referrer property 'purchaseList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Purchase> getPurchaseList() {
        if (_purchaseList == null) { _purchaseList = newReferrerList(); }
        return _purchaseList;
    }

    /**
     * [set] (購入)purchase by product_id, named 'purchaseList'.
     * @param purchaseList The entity list of referrer property 'purchaseList'. (NullAllowed)
     */
    public void setPurchaseList(List<Purchase> purchaseList) {
        _purchaseList = purchaseList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                       Common Column
    //                                                                       =============
    /**
     * {@inheritDoc}
     */
    public void enableCommonColumnAutoSetup() {
        __canCommonColumnAutoSetup = true;
    }

    /**
     * {@inheritDoc}
     */
    public void disableCommonColumnAutoSetup() {
        __canCommonColumnAutoSetup = false;
    }

    /**
     * {@inheritDoc}
     */
    public boolean canCommonColumnAutoSetup() {
        return __canCommonColumnAutoSetup;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsProduct) {
            BsProduct other = (BsProduct)obj;
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
        if (_productCategory != null)
        { sb.append(li).append(xbRDS(_productCategory, "productCategory")); }
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
        sb.append(dm).append(xfND(_productCategoryCode));
        sb.append(dm).append(xfND(_productStatusCode));
        sb.append(dm).append(xfND(_regularPrice));
        sb.append(dm).append(xfND(_registerDatetime));
        sb.append(dm).append(xfND(_registerUser));
        sb.append(dm).append(xfND(_registerProcess));
        sb.append(dm).append(xfND(_updateDatetime));
        sb.append(dm).append(xfND(_updateUser));
        sb.append(dm).append(xfND(_updateProcess));
        sb.append(dm).append(xfND(_versionNo));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_productCategory != null)
        { sb.append(dm).append("productCategory"); }
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
    public Product clone() {
        return (Product)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] product_id: {PK, ID, NotNull, serial(10)} <br />
     * @return The value of the column 'product_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getProductId() {
        checkSpecifiedProperty("productId");
        return _productId;
    }

    /**
     * [set] product_id: {PK, ID, NotNull, serial(10)} <br />
     * @param productId The value of the column 'product_id'. (basically NotNull if update: for the constraint)
     */
    public void setProductId(Integer productId) {
        registerModifiedProperty("productId");
        _productId = productId;
    }

    /**
     * [get] (商品名称)product_name: {IX, NotNull, varchar(50)} <br />
     * ExampleDBとして、コメントの少ないケースを表現するため、<br />
     * あえてコメントを控えている。実業務ではしっかりとコメントを<br />
     * 入れることが強く強く推奨される。
     * @return The value of the column 'product_name'. (basically NotNull if selected: for the constraint)
     */
    public String getProductName() {
        checkSpecifiedProperty("productName");
        return _productName;
    }

    /**
     * [set] (商品名称)product_name: {IX, NotNull, varchar(50)} <br />
     * ExampleDBとして、コメントの少ないケースを表現するため、<br />
     * あえてコメントを控えている。実業務ではしっかりとコメントを<br />
     * 入れることが強く強く推奨される。
     * @param productName The value of the column 'product_name'. (basically NotNull if update: for the constraint)
     */
    public void setProductName(String productName) {
        registerModifiedProperty("productName");
        _productName = productName;
    }

    /**
     * [get] (商品ハンドルコード)product_handle_code: {UQ, NotNull, varchar(100)} <br />
     * 商品を識別する業務上のコード。
     * @return The value of the column 'product_handle_code'. (basically NotNull if selected: for the constraint)
     */
    public String getProductHandleCode() {
        checkSpecifiedProperty("productHandleCode");
        return _productHandleCode;
    }

    /**
     * [set] (商品ハンドルコード)product_handle_code: {UQ, NotNull, varchar(100)} <br />
     * 商品を識別する業務上のコード。
     * @param productHandleCode The value of the column 'product_handle_code'. (basically NotNull if update: for the constraint)
     */
    public void setProductHandleCode(String productHandleCode) {
        registerModifiedProperty("productHandleCode");
        _productHandleCode = productHandleCode;
    }

    /**
     * [get] product_category_code: {NotNull, bpchar(3), FK to product_category} <br />
     * @return The value of the column 'product_category_code'. (basically NotNull if selected: for the constraint)
     */
    public String getProductCategoryCode() {
        checkSpecifiedProperty("productCategoryCode");
        return _productCategoryCode;
    }

    /**
     * [set] product_category_code: {NotNull, bpchar(3), FK to product_category} <br />
     * @param productCategoryCode The value of the column 'product_category_code'. (basically NotNull if update: for the constraint)
     */
    public void setProductCategoryCode(String productCategoryCode) {
        registerModifiedProperty("productCategoryCode");
        _productCategoryCode = productCategoryCode;
    }

    /**
     * [get] product_status_code: {NotNull, bpchar(3), FK to product_status} <br />
     * @return The value of the column 'product_status_code'. (basically NotNull if selected: for the constraint)
     */
    public String getProductStatusCode() {
        checkSpecifiedProperty("productStatusCode");
        return _productStatusCode;
    }

    /**
     * [set] product_status_code: {NotNull, bpchar(3), FK to product_status} <br />
     * @param productStatusCode The value of the column 'product_status_code'. (basically NotNull if update: for the constraint)
     */
    public void setProductStatusCode(String productStatusCode) {
        registerModifiedProperty("productStatusCode");
        _productStatusCode = productStatusCode;
    }

    /**
     * [get] regular_price: {NotNull, int4(10)} <br />
     * @return The value of the column 'regular_price'. (basically NotNull if selected: for the constraint)
     */
    public Integer getRegularPrice() {
        checkSpecifiedProperty("regularPrice");
        return _regularPrice;
    }

    /**
     * [set] regular_price: {NotNull, int4(10)} <br />
     * @param regularPrice The value of the column 'regular_price'. (basically NotNull if update: for the constraint)
     */
    public void setRegularPrice(Integer regularPrice) {
        registerModifiedProperty("regularPrice");
        _regularPrice = regularPrice;
    }

    /**
     * [get] register_datetime: {NotNull, timestamp(26, 3)} <br />
     * @return The value of the column 'register_datetime'. (basically NotNull if selected: for the constraint)
     */
    public java.sql.Timestamp getRegisterDatetime() {
        checkSpecifiedProperty("registerDatetime");
        return _registerDatetime;
    }

    /**
     * [set] register_datetime: {NotNull, timestamp(26, 3)} <br />
     * @param registerDatetime The value of the column 'register_datetime'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterDatetime(java.sql.Timestamp registerDatetime) {
        registerModifiedProperty("registerDatetime");
        _registerDatetime = registerDatetime;
    }

    /**
     * [get] register_user: {NotNull, varchar(200)} <br />
     * @return The value of the column 'register_user'. (basically NotNull if selected: for the constraint)
     */
    public String getRegisterUser() {
        checkSpecifiedProperty("registerUser");
        return _registerUser;
    }

    /**
     * [set] register_user: {NotNull, varchar(200)} <br />
     * @param registerUser The value of the column 'register_user'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterUser(String registerUser) {
        registerModifiedProperty("registerUser");
        _registerUser = registerUser;
    }

    /**
     * [get] register_process: {NotNull, varchar(200)} <br />
     * @return The value of the column 'register_process'. (basically NotNull if selected: for the constraint)
     */
    public String getRegisterProcess() {
        checkSpecifiedProperty("registerProcess");
        return _registerProcess;
    }

    /**
     * [set] register_process: {NotNull, varchar(200)} <br />
     * @param registerProcess The value of the column 'register_process'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterProcess(String registerProcess) {
        registerModifiedProperty("registerProcess");
        _registerProcess = registerProcess;
    }

    /**
     * [get] update_datetime: {NotNull, timestamp(26, 3)} <br />
     * @return The value of the column 'update_datetime'. (basically NotNull if selected: for the constraint)
     */
    public java.sql.Timestamp getUpdateDatetime() {
        checkSpecifiedProperty("updateDatetime");
        return _updateDatetime;
    }

    /**
     * [set] update_datetime: {NotNull, timestamp(26, 3)} <br />
     * @param updateDatetime The value of the column 'update_datetime'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateDatetime(java.sql.Timestamp updateDatetime) {
        registerModifiedProperty("updateDatetime");
        _updateDatetime = updateDatetime;
    }

    /**
     * [get] update_user: {NotNull, varchar(200)} <br />
     * @return The value of the column 'update_user'. (basically NotNull if selected: for the constraint)
     */
    public String getUpdateUser() {
        checkSpecifiedProperty("updateUser");
        return _updateUser;
    }

    /**
     * [set] update_user: {NotNull, varchar(200)} <br />
     * @param updateUser The value of the column 'update_user'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateUser(String updateUser) {
        registerModifiedProperty("updateUser");
        _updateUser = updateUser;
    }

    /**
     * [get] update_process: {NotNull, varchar(200)} <br />
     * @return The value of the column 'update_process'. (basically NotNull if selected: for the constraint)
     */
    public String getUpdateProcess() {
        checkSpecifiedProperty("updateProcess");
        return _updateProcess;
    }

    /**
     * [set] update_process: {NotNull, varchar(200)} <br />
     * @param updateProcess The value of the column 'update_process'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateProcess(String updateProcess) {
        registerModifiedProperty("updateProcess");
        _updateProcess = updateProcess;
    }

    /**
     * [get] version_no: {NotNull, int8(19)} <br />
     * @return The value of the column 'version_no'. (basically NotNull if selected: for the constraint)
     */
    public Long getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] version_no: {NotNull, int8(19)} <br />
     * @param versionNo The value of the column 'version_no'. (basically NotNull if update: for the constraint)
     */
    public void setVersionNo(Long versionNo) {
        registerModifiedProperty("versionNo");
        _versionNo = versionNo;
    }
}
