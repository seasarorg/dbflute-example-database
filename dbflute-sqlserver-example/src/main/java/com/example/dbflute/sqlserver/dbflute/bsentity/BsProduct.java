package com.example.dbflute.sqlserver.dbflute.bsentity;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.Entity;
import com.example.dbflute.sqlserver.dbflute.allcommon.EntityDefinedCommonColumn;
import com.example.dbflute.sqlserver.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.sqlserver.dbflute.exentity.*;

/**
 * The entity of PRODUCT as TABLE. <br />
 * <pre>
 * [primary-key]
 *     PRODUCT_ID
 * 
 * [column]
 *     PRODUCT_ID, PRODUCT_NAME, PRODUCT_HANDLE_CODE, PRODUCT_CATEGORY_CODE, PRODUCT_STATUS_CODE, REGULAR_PRICE, REGISTER_DATETIME, REGISTER_USER, REGISTER_PROCESS, UPDATE_DATETIME, UPDATE_USER, UPDATE_PROCESS, VERSION_NO
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     PRODUCT_ID
 * 
 * [version-no]
 *     VERSION_NO
 * 
 * [foreign table]
 *     PRODUCT_CATEGORY, PRODUCT_STATUS
 * 
 * [referrer table]
 *     PURCHASE
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
public abstract class BsProduct implements EntityDefinedCommonColumn, Serializable, Cloneable {

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
    /** PRODUCT_ID: {PK, ID, NotNull, int identity(10)} */
    protected Integer _productId;

    /** PRODUCT_NAME: {NotNull, nvarchar(50)} */
    protected String _productName;

    /** PRODUCT_HANDLE_CODE: {UQ, NotNull, nvarchar(100)} */
    protected String _productHandleCode;

    /** PRODUCT_CATEGORY_CODE: {NotNull, char(3), FK to PRODUCT_CATEGORY} */
    protected String _productCategoryCode;

    /** PRODUCT_STATUS_CODE: {NotNull, char(3), FK to PRODUCT_STATUS} */
    protected String _productStatusCode;

    /** REGULAR_PRICE: {NotNull, int(10)} */
    protected Integer _regularPrice;

    /** REGISTER_DATETIME: {NotNull, datetime(23, 3)} */
    protected java.sql.Timestamp _registerDatetime;

    /** REGISTER_USER: {NotNull, nvarchar(200)} */
    protected String _registerUser;

    /** REGISTER_PROCESS: {NotNull, nvarchar(200)} */
    protected String _registerProcess;

    /** UPDATE_DATETIME: {NotNull, datetime(23, 3)} */
    protected java.sql.Timestamp _updateDatetime;

    /** UPDATE_USER: {NotNull, nvarchar(200)} */
    protected String _updateUser;

    /** UPDATE_PROCESS: {NotNull, nvarchar(200)} */
    protected String _updateProcess;

    /** VERSION_NO: {NotNull, bigint(19)} */
    protected Long _versionNo;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The unique-driven properties for this entity. (NotNull) */
    protected final EntityUniqueDrivenProperties __uniqueDrivenProperties = newUniqueDrivenProperties();

    /** The modified properties for this entity. (NotNull) */
    protected final EntityModifiedProperties __modifiedProperties = newModifiedProperties();

    /** Is common column auto set up effective? */
    protected boolean __canCommonColumnAutoSetup = true;

    /** Is the entity created by DBFlute select process? */
    protected boolean __createdBySelect;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "PRODUCT";
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
     * @param productHandleCode : UQ, NotNull, nvarchar(100). (NotNull)
     */
    public void uniqueBy(String productHandleCode) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("productHandleCode");
        setProductHandleCode(productHandleCode);
    }

    /**
     * {@inheritDoc}
     */
    public Set<String> myuniqueDrivenProperties() {
        return __uniqueDrivenProperties.getPropertyNames();
    }

    protected EntityUniqueDrivenProperties newUniqueDrivenProperties() {
        return new EntityUniqueDrivenProperties();
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** PRODUCT_CATEGORY by my PRODUCT_CATEGORY_CODE, named 'productCategory'. */
    protected ProductCategory _productCategory;

    /**
     * PRODUCT_CATEGORY by my PRODUCT_CATEGORY_CODE, named 'productCategory'.
     * @return The entity of foreign property 'productCategory'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public ProductCategory getProductCategory() {
        return _productCategory;
    }

    /**
     * PRODUCT_CATEGORY by my PRODUCT_CATEGORY_CODE, named 'productCategory'.
     * @param productCategory The entity of foreign property 'productCategory'. (NullAllowed)
     */
    public void setProductCategory(ProductCategory productCategory) {
        _productCategory = productCategory;
    }

    /** PRODUCT_STATUS by my PRODUCT_STATUS_CODE, named 'productStatus'. */
    protected ProductStatus _productStatus;

    /**
     * PRODUCT_STATUS by my PRODUCT_STATUS_CODE, named 'productStatus'.
     * @return The entity of foreign property 'productStatus'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public ProductStatus getProductStatus() {
        return _productStatus;
    }

    /**
     * PRODUCT_STATUS by my PRODUCT_STATUS_CODE, named 'productStatus'.
     * @param productStatus The entity of foreign property 'productStatus'. (NullAllowed)
     */
    public void setProductStatus(ProductStatus productStatus) {
        _productStatus = productStatus;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** PURCHASE by PRODUCT_ID, named 'purchaseList'. */
    protected List<Purchase> _purchaseList;

    /**
     * PURCHASE by PRODUCT_ID, named 'purchaseList'.
     * @return The entity list of referrer property 'purchaseList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Purchase> getPurchaseList() {
        if (_purchaseList == null) { _purchaseList = newReferrerList(); }
        return _purchaseList;
    }

    /**
     * PURCHASE by PRODUCT_ID, named 'purchaseList'.
     * @param purchaseList The entity list of referrer property 'purchaseList'. (NullAllowed)
     */
    public void setPurchaseList(List<Purchase> purchaseList) {
        _purchaseList = purchaseList;
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
    /**
     * Determine the object is equal with this. <br />
     * If primary-keys or columns of the other are same as this one, returns true.
     * @param obj The object as other entity. (NullAllowed: if null, returns false fixedly)
     * @return Comparing result.
     */
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BsProduct)) { return false; }
        BsProduct other = (BsProduct)obj;
        if (!xSV(getProductId(), other.getProductId())) { return false; }
        return true;
    }
    protected boolean xSV(Object v1, Object v2) {
        return FunCustodial.isSameValue(v1, v2);
    }

    /**
     * Calculate the hash-code from primary-keys or columns.
     * @return The hash-code from primary-key or columns.
     */
    public int hashCode() {
        int hs = 17;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, getProductId());
        return hs;
    }
    protected int xCH(int hs, Object vl) {
        return FunCustodial.calculateHashcode(hs, vl);
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
        String li = "\n  ";
        if (_productCategory != null)
        { sb.append(li).append(xbRDS(_productCategory, "productCategory")); }
        if (_productStatus != null)
        { sb.append(li).append(xbRDS(_productStatus, "productStatus")); }
        if (_purchaseList != null) { for (Entity et : _purchaseList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "purchaseList")); } } }
        return sb.toString();
    }
    protected String xbRDS(Entity et, String name) { // buildRelationDisplayString()
        return et.buildDisplayString(name, true, true);
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
        String dm = ", ";
        sb.append(dm).append(getProductId());
        sb.append(dm).append(getProductName());
        sb.append(dm).append(getProductHandleCode());
        sb.append(dm).append(getProductCategoryCode());
        sb.append(dm).append(getProductStatusCode());
        sb.append(dm).append(getRegularPrice());
        sb.append(dm).append(getRegisterDatetime());
        sb.append(dm).append(getRegisterUser());
        sb.append(dm).append(getRegisterProcess());
        sb.append(dm).append(getUpdateDatetime());
        sb.append(dm).append(getUpdateUser());
        sb.append(dm).append(getUpdateProcess());
        sb.append(dm).append(getVersionNo());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String cm = ",";
        if (_productCategory != null) { sb.append(cm).append("productCategory"); }
        if (_productStatus != null) { sb.append(cm).append("productStatus"); }
        if (_purchaseList != null && !_purchaseList.isEmpty())
        { sb.append(cm).append("purchaseList"); }
        if (sb.length() > cm.length()) {
            sb.delete(0, cm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public Product clone() {
        try {
            return (Product)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PRODUCT_ID: {PK, ID, NotNull, int identity(10)} <br />
     * @return The value of the column 'PRODUCT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getProductId() {
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {PK, ID, NotNull, int identity(10)} <br />
     * @param productId The value of the column 'PRODUCT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setProductId(Integer productId) {
        __modifiedProperties.addPropertyName("productId");
        this._productId = productId;
    }

    /**
     * [get] PRODUCT_NAME: {NotNull, nvarchar(50)} <br />
     * @return The value of the column 'PRODUCT_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getProductName() {
        return _productName;
    }

    /**
     * [set] PRODUCT_NAME: {NotNull, nvarchar(50)} <br />
     * @param productName The value of the column 'PRODUCT_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setProductName(String productName) {
        __modifiedProperties.addPropertyName("productName");
        this._productName = productName;
    }

    /**
     * [get] PRODUCT_HANDLE_CODE: {UQ, NotNull, nvarchar(100)} <br />
     * @return The value of the column 'PRODUCT_HANDLE_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getProductHandleCode() {
        return _productHandleCode;
    }

    /**
     * [set] PRODUCT_HANDLE_CODE: {UQ, NotNull, nvarchar(100)} <br />
     * @param productHandleCode The value of the column 'PRODUCT_HANDLE_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setProductHandleCode(String productHandleCode) {
        __modifiedProperties.addPropertyName("productHandleCode");
        this._productHandleCode = productHandleCode;
    }

    /**
     * [get] PRODUCT_CATEGORY_CODE: {NotNull, char(3), FK to PRODUCT_CATEGORY} <br />
     * @return The value of the column 'PRODUCT_CATEGORY_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getProductCategoryCode() {
        return _productCategoryCode;
    }

    /**
     * [set] PRODUCT_CATEGORY_CODE: {NotNull, char(3), FK to PRODUCT_CATEGORY} <br />
     * @param productCategoryCode The value of the column 'PRODUCT_CATEGORY_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setProductCategoryCode(String productCategoryCode) {
        __modifiedProperties.addPropertyName("productCategoryCode");
        this._productCategoryCode = productCategoryCode;
    }

    /**
     * [get] PRODUCT_STATUS_CODE: {NotNull, char(3), FK to PRODUCT_STATUS} <br />
     * @return The value of the column 'PRODUCT_STATUS_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getProductStatusCode() {
        return _productStatusCode;
    }

    /**
     * [set] PRODUCT_STATUS_CODE: {NotNull, char(3), FK to PRODUCT_STATUS} <br />
     * @param productStatusCode The value of the column 'PRODUCT_STATUS_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setProductStatusCode(String productStatusCode) {
        __modifiedProperties.addPropertyName("productStatusCode");
        this._productStatusCode = productStatusCode;
    }

    /**
     * [get] REGULAR_PRICE: {NotNull, int(10)} <br />
     * @return The value of the column 'REGULAR_PRICE'. (basically NotNull if selected: for the constraint)
     */
    public Integer getRegularPrice() {
        return _regularPrice;
    }

    /**
     * [set] REGULAR_PRICE: {NotNull, int(10)} <br />
     * @param regularPrice The value of the column 'REGULAR_PRICE'. (basically NotNull if update: for the constraint)
     */
    public void setRegularPrice(Integer regularPrice) {
        __modifiedProperties.addPropertyName("regularPrice");
        this._regularPrice = regularPrice;
    }

    /**
     * [get] REGISTER_DATETIME: {NotNull, datetime(23, 3)} <br />
     * @return The value of the column 'REGISTER_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.sql.Timestamp getRegisterDatetime() {
        return _registerDatetime;
    }

    /**
     * [set] REGISTER_DATETIME: {NotNull, datetime(23, 3)} <br />
     * @param registerDatetime The value of the column 'REGISTER_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterDatetime(java.sql.Timestamp registerDatetime) {
        __modifiedProperties.addPropertyName("registerDatetime");
        this._registerDatetime = registerDatetime;
    }

    /**
     * [get] REGISTER_USER: {NotNull, nvarchar(200)} <br />
     * @return The value of the column 'REGISTER_USER'. (basically NotNull if selected: for the constraint)
     */
    public String getRegisterUser() {
        return _registerUser;
    }

    /**
     * [set] REGISTER_USER: {NotNull, nvarchar(200)} <br />
     * @param registerUser The value of the column 'REGISTER_USER'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterUser(String registerUser) {
        __modifiedProperties.addPropertyName("registerUser");
        this._registerUser = registerUser;
    }

    /**
     * [get] REGISTER_PROCESS: {NotNull, nvarchar(200)} <br />
     * @return The value of the column 'REGISTER_PROCESS'. (basically NotNull if selected: for the constraint)
     */
    public String getRegisterProcess() {
        return _registerProcess;
    }

    /**
     * [set] REGISTER_PROCESS: {NotNull, nvarchar(200)} <br />
     * @param registerProcess The value of the column 'REGISTER_PROCESS'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterProcess(String registerProcess) {
        __modifiedProperties.addPropertyName("registerProcess");
        this._registerProcess = registerProcess;
    }

    /**
     * [get] UPDATE_DATETIME: {NotNull, datetime(23, 3)} <br />
     * @return The value of the column 'UPDATE_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.sql.Timestamp getUpdateDatetime() {
        return _updateDatetime;
    }

    /**
     * [set] UPDATE_DATETIME: {NotNull, datetime(23, 3)} <br />
     * @param updateDatetime The value of the column 'UPDATE_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateDatetime(java.sql.Timestamp updateDatetime) {
        __modifiedProperties.addPropertyName("updateDatetime");
        this._updateDatetime = updateDatetime;
    }

    /**
     * [get] UPDATE_USER: {NotNull, nvarchar(200)} <br />
     * @return The value of the column 'UPDATE_USER'. (basically NotNull if selected: for the constraint)
     */
    public String getUpdateUser() {
        return _updateUser;
    }

    /**
     * [set] UPDATE_USER: {NotNull, nvarchar(200)} <br />
     * @param updateUser The value of the column 'UPDATE_USER'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateUser(String updateUser) {
        __modifiedProperties.addPropertyName("updateUser");
        this._updateUser = updateUser;
    }

    /**
     * [get] UPDATE_PROCESS: {NotNull, nvarchar(200)} <br />
     * @return The value of the column 'UPDATE_PROCESS'. (basically NotNull if selected: for the constraint)
     */
    public String getUpdateProcess() {
        return _updateProcess;
    }

    /**
     * [set] UPDATE_PROCESS: {NotNull, nvarchar(200)} <br />
     * @param updateProcess The value of the column 'UPDATE_PROCESS'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateProcess(String updateProcess) {
        __modifiedProperties.addPropertyName("updateProcess");
        this._updateProcess = updateProcess;
    }

    /**
     * [get] VERSION_NO: {NotNull, bigint(19)} <br />
     * @return The value of the column 'VERSION_NO'. (basically NotNull if selected: for the constraint)
     */
    public Long getVersionNo() {
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, bigint(19)} <br />
     * @param versionNo The value of the column 'VERSION_NO'. (basically NotNull if update: for the constraint)
     */
    public void setVersionNo(Long versionNo) {
        __modifiedProperties.addPropertyName("versionNo");
        this._versionNo = versionNo;
    }
}
