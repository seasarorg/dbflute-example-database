package com.example.dbflute.tricky.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import com.example.dbflute.tricky.dbflute.allcommon.EntityDefinedCommonColumn;
import com.example.dbflute.tricky.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.tricky.dbflute.allcommon.CDef;
import com.example.dbflute.tricky.dbflute.exentity.*;

/**
 * The entity of PURCHASE as TABLE. <br />
 * <pre>
 * [primary-key]
 *     PURCHASE_ID
 * 
 * [column]
 *     PURCHASE_ID, MEMBER_ID, PRODUCT_ID, PURCHASE_DATETIME, PURCHASE_COUNT, PURCHASE_PRICE, PAYMENT_COMPLETE_FLG, PURCHASE_REGISTER_DATETIME, PURCHASE_REGISTER_USER, PURCHASE_REGISTER_PROCESS, PURCHASE_UPDATE_DATETIME, PURCHASE_UPDATE_USER, PURCHASE_UPDATE_PROCESS, VERSION_NO
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     PURCHASE_ID
 * 
 * [version-no]
 *     VERSION_NO
 * 
 * [foreign table]
 *     MEMBER, PRODUCT, SUMMARY_PRODUCT
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     member, product, summaryProduct
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer purchaseId = entity.getPurchaseId();
 * Integer memberId = entity.getMemberId();
 * Integer productId = entity.getProductId();
 * java.sql.Timestamp purchaseDatetime = entity.getPurchaseDatetime();
 * Integer purchaseCount = entity.getPurchaseCount();
 * Integer purchasePrice = entity.getPurchasePrice();
 * Integer paymentCompleteFlg = entity.getPaymentCompleteFlg();
 * java.sql.Timestamp purchaseRegisterDatetime = entity.getPurchaseRegisterDatetime();
 * String purchaseRegisterUser = entity.getPurchaseRegisterUser();
 * String purchaseRegisterProcess = entity.getPurchaseRegisterProcess();
 * java.sql.Timestamp purchaseUpdateDatetime = entity.getPurchaseUpdateDatetime();
 * String purchaseUpdateUser = entity.getPurchaseUpdateUser();
 * String purchaseUpdateProcess = entity.getPurchaseUpdateProcess();
 * Integer versionNo = entity.getVersionNo();
 * entity.setPurchaseId(purchaseId);
 * entity.setMemberId(memberId);
 * entity.setProductId(productId);
 * entity.setPurchaseDatetime(purchaseDatetime);
 * entity.setPurchaseCount(purchaseCount);
 * entity.setPurchasePrice(purchasePrice);
 * entity.setPaymentCompleteFlg(paymentCompleteFlg);
 * entity.setPurchaseRegisterDatetime(purchaseRegisterDatetime);
 * entity.setPurchaseRegisterUser(purchaseRegisterUser);
 * entity.setPurchaseRegisterProcess(purchaseRegisterProcess);
 * entity.setPurchaseUpdateDatetime(purchaseUpdateDatetime);
 * entity.setPurchaseUpdateUser(purchaseUpdateUser);
 * entity.setPurchaseUpdateProcess(purchaseUpdateProcess);
 * entity.setVersionNo(versionNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsPurchase extends AbstractEntity implements EntityDefinedCommonColumn {

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
    /** PURCHASE_ID: {PK, ID, NotNull, INTEGER(2000000000, 10)} */
    protected Integer _purchaseId;

    /** MEMBER_ID: {NotNull, INTEGER(2000000000, 10), FK to MEMBER} */
    protected Integer _memberId;

    /** PRODUCT_ID: {NotNull, INTEGER(2000000000, 10), FK to PRODUCT} */
    protected Integer _productId;

    /** PURCHASE_DATETIME: {NotNull, DATETIME(2000000000, 10)} */
    protected java.sql.Timestamp _purchaseDatetime;

    /** PURCHASE_COUNT: {NotNull, INTEGER(2000000000, 10)} */
    protected Integer _purchaseCount;

    /** PURCHASE_PRICE: {NotNull, INTEGER(2000000000, 10)} */
    protected Integer _purchasePrice;

    /** PAYMENT_COMPLETE_FLG: {NotNull, INTEGER(2000000000, 10), classification=Flg} */
    protected Integer _paymentCompleteFlg;

    /** PURCHASE_REGISTER_DATETIME: {NotNull, DATETIME(2000000000, 10)} */
    protected java.sql.Timestamp _purchaseRegisterDatetime;

    /** PURCHASE_REGISTER_USER: {NotNull, TEXT(2000000000, 10)} */
    protected String _purchaseRegisterUser;

    /** PURCHASE_REGISTER_PROCESS: {NotNull, TEXT(2000000000, 10)} */
    protected String _purchaseRegisterProcess;

    /** PURCHASE_UPDATE_DATETIME: {NotNull, DATETIME(2000000000, 10)} */
    protected java.sql.Timestamp _purchaseUpdateDatetime;

    /** PURCHASE_UPDATE_USER: {NotNull, TEXT(2000000000, 10)} */
    protected String _purchaseUpdateUser;

    /** PURCHASE_UPDATE_PROCESS: {NotNull, TEXT(2000000000, 10)} */
    protected String _purchaseUpdateProcess;

    /** VERSION_NO: {NotNull, INTEGER(2000000000, 10)} */
    protected Integer _versionNo;

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
        return "PURCHASE";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "purchase";
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
        if (getPurchaseId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of paymentCompleteFlg as the classification of Flg. <br />
     * PAYMENT_COMPLETE_FLG: {NotNull, INTEGER(2000000000, 10), classification=Flg} <br />
     * general boolean classification for every flg-column
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.Flg getPaymentCompleteFlgAsFlg() {
        return CDef.Flg.codeOf(getPaymentCompleteFlg());
    }

    /**
     * Set the value of paymentCompleteFlg as the classification of Flg. <br />
     * PAYMENT_COMPLETE_FLG: {NotNull, INTEGER(2000000000, 10), classification=Flg} <br />
     * general boolean classification for every flg-column
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setPaymentCompleteFlgAsFlg(CDef.Flg cdef) {
        setPaymentCompleteFlg(cdef != null ? toNumber(cdef.code(), Integer.class) : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of paymentCompleteFlg as True (1). <br />
     * Yes: means valid
     */
    public void setPaymentCompleteFlg_True() {
        setPaymentCompleteFlgAsFlg(CDef.Flg.True);
    }

    /**
     * Same as setPaymentCompleteFlg_True. <br />
     * Yes: means valid
     */
    public void classifyPaymentCompleteFlgTrue() {
        setPaymentCompleteFlg_True();
    }

    /**
     * Set the value of paymentCompleteFlg as False (0). <br />
     * No: means invalid
     */
    public void setPaymentCompleteFlg_False() {
        setPaymentCompleteFlgAsFlg(CDef.Flg.False);
    }

    /**
     * Same as setPaymentCompleteFlg_False. <br />
     * No: means invalid
     */
    public void classifyPaymentCompleteFlgFalse() {
        setPaymentCompleteFlg_False();
    }

    /**
     * Same as setPaymentCompleteFlgAsFlg(cdef). <br />
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed)
     */
    public void classifyPaymentCompleteFlg(CDef.Flg cdef) {
        setPaymentCompleteFlgAsFlg(cdef);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of paymentCompleteFlg True? <br />
     * Yes: means valid
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPaymentCompleteFlgTrue() {
        CDef.Flg cdef = getPaymentCompleteFlgAsFlg();
        return cdef != null ? cdef.equals(CDef.Flg.True) : false;
    }

    /**
     * Is the value of paymentCompleteFlg False? <br />
     * No: means invalid
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPaymentCompleteFlgFalse() {
        CDef.Flg cdef = getPaymentCompleteFlgAsFlg();
        return cdef != null ? cdef.equals(CDef.Flg.False) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'paymentCompleteFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getPaymentCompleteFlgName() {
        CDef.Flg cdef = getPaymentCompleteFlgAsFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'paymentCompleteFlg' as classification alias.
     * @return The string of classification alias. (NullAllowed: when the column value is null)
     */
    public String getPaymentCompleteFlgAlias() {
        CDef.Flg cdef = getPaymentCompleteFlgAsFlg();
        return cdef != null ? cdef.alias() : null;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** MEMBER by my MEMBER_ID, named 'member'. */
    protected Member _member;

    /**
     * [get] MEMBER by my MEMBER_ID, named 'member'.
     * @return The entity of foreign property 'member'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public Member getMember() {
        return _member;
    }

    /**
     * [set] MEMBER by my MEMBER_ID, named 'member'.
     * @param member The entity of foreign property 'member'. (NullAllowed)
     */
    public void setMember(Member member) {
        _member = member;
    }

    public Member chaseMember() {
        return _member != null ? _member : new Member();
    }

    /** PRODUCT by my PRODUCT_ID, named 'product'. */
    protected Product _product;

    /**
     * [get] PRODUCT by my PRODUCT_ID, named 'product'.
     * @return The entity of foreign property 'product'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public Product getProduct() {
        return _product;
    }

    /**
     * [set] PRODUCT by my PRODUCT_ID, named 'product'.
     * @param product The entity of foreign property 'product'. (NullAllowed)
     */
    public void setProduct(Product product) {
        _product = product;
    }

    public Product chaseProduct() {
        return _product != null ? _product : new Product();
    }

    /** SUMMARY_PRODUCT by my PRODUCT_ID, named 'summaryProduct'. */
    protected SummaryProduct _summaryProduct;

    /**
     * [get] SUMMARY_PRODUCT by my PRODUCT_ID, named 'summaryProduct'.
     * @return The entity of foreign property 'summaryProduct'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public SummaryProduct getSummaryProduct() {
        return _summaryProduct;
    }

    /**
     * [set] SUMMARY_PRODUCT by my PRODUCT_ID, named 'summaryProduct'.
     * @param summaryProduct The entity of foreign property 'summaryProduct'. (NullAllowed)
     */
    public void setSummaryProduct(SummaryProduct summaryProduct) {
        _summaryProduct = summaryProduct;
    }

    public SummaryProduct chaseSummaryProduct() {
        return _summaryProduct != null ? _summaryProduct : new SummaryProduct();
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
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
        if (obj instanceof BsPurchase) {
            BsPurchase other = (BsPurchase)obj;
            if (!xSV(_purchaseId, other._purchaseId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _purchaseId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_member != null)
        { sb.append(li).append(xbRDS(_member, "member")); }
        if (_product != null)
        { sb.append(li).append(xbRDS(_product, "product")); }
        if (_summaryProduct != null)
        { sb.append(li).append(xbRDS(_summaryProduct, "summaryProduct")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_purchaseId));
        sb.append(dm).append(xfND(_memberId));
        sb.append(dm).append(xfND(_productId));
        sb.append(dm).append(xfND(_purchaseDatetime));
        sb.append(dm).append(xfND(_purchaseCount));
        sb.append(dm).append(xfND(_purchasePrice));
        sb.append(dm).append(xfND(_paymentCompleteFlg));
        sb.append(dm).append(xfND(_purchaseRegisterDatetime));
        sb.append(dm).append(xfND(_purchaseRegisterUser));
        sb.append(dm).append(xfND(_purchaseRegisterProcess));
        sb.append(dm).append(xfND(_purchaseUpdateDatetime));
        sb.append(dm).append(xfND(_purchaseUpdateUser));
        sb.append(dm).append(xfND(_purchaseUpdateProcess));
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
        if (_member != null) { sb.append(dm).append("member"); }
        if (_product != null) { sb.append(dm).append("product"); }
        if (_summaryProduct != null) { sb.append(dm).append("summaryProduct"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public Purchase clone() {
        return (Purchase)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PURCHASE_ID: {PK, ID, NotNull, INTEGER(2000000000, 10)} <br />
     * @return The value of the column 'PURCHASE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getPurchaseId() {
        checkSpecifiedProperty("purchaseId");
        return _purchaseId;
    }

    /**
     * [set] PURCHASE_ID: {PK, ID, NotNull, INTEGER(2000000000, 10)} <br />
     * @param purchaseId The value of the column 'PURCHASE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setPurchaseId(Integer purchaseId) {
        __modifiedProperties.addPropertyName("purchaseId");
        _purchaseId = purchaseId;
    }

    /**
     * [get] MEMBER_ID: {NotNull, INTEGER(2000000000, 10), FK to MEMBER} <br />
     * @return The value of the column 'MEMBER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMemberId() {
        checkSpecifiedProperty("memberId");
        return _memberId;
    }

    /**
     * [set] MEMBER_ID: {NotNull, INTEGER(2000000000, 10), FK to MEMBER} <br />
     * @param memberId The value of the column 'MEMBER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMemberId(Integer memberId) {
        __modifiedProperties.addPropertyName("memberId");
        _memberId = memberId;
    }

    /**
     * [get] PRODUCT_ID: {NotNull, INTEGER(2000000000, 10), FK to PRODUCT} <br />
     * @return The value of the column 'PRODUCT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getProductId() {
        checkSpecifiedProperty("productId");
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {NotNull, INTEGER(2000000000, 10), FK to PRODUCT} <br />
     * @param productId The value of the column 'PRODUCT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setProductId(Integer productId) {
        __modifiedProperties.addPropertyName("productId");
        _productId = productId;
    }

    /**
     * [get] PURCHASE_DATETIME: {NotNull, DATETIME(2000000000, 10)} <br />
     * @return The value of the column 'PURCHASE_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.sql.Timestamp getPurchaseDatetime() {
        checkSpecifiedProperty("purchaseDatetime");
        return _purchaseDatetime;
    }

    /**
     * [set] PURCHASE_DATETIME: {NotNull, DATETIME(2000000000, 10)} <br />
     * @param purchaseDatetime The value of the column 'PURCHASE_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setPurchaseDatetime(java.sql.Timestamp purchaseDatetime) {
        __modifiedProperties.addPropertyName("purchaseDatetime");
        _purchaseDatetime = purchaseDatetime;
    }

    /**
     * [get] PURCHASE_COUNT: {NotNull, INTEGER(2000000000, 10)} <br />
     * @return The value of the column 'PURCHASE_COUNT'. (basically NotNull if selected: for the constraint)
     */
    public Integer getPurchaseCount() {
        checkSpecifiedProperty("purchaseCount");
        return _purchaseCount;
    }

    /**
     * [set] PURCHASE_COUNT: {NotNull, INTEGER(2000000000, 10)} <br />
     * @param purchaseCount The value of the column 'PURCHASE_COUNT'. (basically NotNull if update: for the constraint)
     */
    public void setPurchaseCount(Integer purchaseCount) {
        __modifiedProperties.addPropertyName("purchaseCount");
        _purchaseCount = purchaseCount;
    }

    /**
     * [get] PURCHASE_PRICE: {NotNull, INTEGER(2000000000, 10)} <br />
     * @return The value of the column 'PURCHASE_PRICE'. (basically NotNull if selected: for the constraint)
     */
    public Integer getPurchasePrice() {
        checkSpecifiedProperty("purchasePrice");
        return _purchasePrice;
    }

    /**
     * [set] PURCHASE_PRICE: {NotNull, INTEGER(2000000000, 10)} <br />
     * @param purchasePrice The value of the column 'PURCHASE_PRICE'. (basically NotNull if update: for the constraint)
     */
    public void setPurchasePrice(Integer purchasePrice) {
        __modifiedProperties.addPropertyName("purchasePrice");
        _purchasePrice = purchasePrice;
    }

    /**
     * [get] PAYMENT_COMPLETE_FLG: {NotNull, INTEGER(2000000000, 10), classification=Flg} <br />
     * @return The value of the column 'PAYMENT_COMPLETE_FLG'. (basically NotNull if selected: for the constraint)
     */
    public Integer getPaymentCompleteFlg() {
        checkSpecifiedProperty("paymentCompleteFlg");
        return _paymentCompleteFlg;
    }

    /**
     * [set] PAYMENT_COMPLETE_FLG: {NotNull, INTEGER(2000000000, 10), classification=Flg} <br />
     * @param paymentCompleteFlg The value of the column 'PAYMENT_COMPLETE_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setPaymentCompleteFlg(Integer paymentCompleteFlg) {
        __modifiedProperties.addPropertyName("paymentCompleteFlg");
        _paymentCompleteFlg = paymentCompleteFlg;
    }

    /**
     * [get] PURCHASE_REGISTER_DATETIME: {NotNull, DATETIME(2000000000, 10)} <br />
     * @return The value of the column 'PURCHASE_REGISTER_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.sql.Timestamp getPurchaseRegisterDatetime() {
        checkSpecifiedProperty("purchaseRegisterDatetime");
        return _purchaseRegisterDatetime;
    }

    /**
     * [set] PURCHASE_REGISTER_DATETIME: {NotNull, DATETIME(2000000000, 10)} <br />
     * @param purchaseRegisterDatetime The value of the column 'PURCHASE_REGISTER_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setPurchaseRegisterDatetime(java.sql.Timestamp purchaseRegisterDatetime) {
        __modifiedProperties.addPropertyName("purchaseRegisterDatetime");
        _purchaseRegisterDatetime = purchaseRegisterDatetime;
    }

    /**
     * [get] PURCHASE_REGISTER_USER: {NotNull, TEXT(2000000000, 10)} <br />
     * @return The value of the column 'PURCHASE_REGISTER_USER'. (basically NotNull if selected: for the constraint)
     */
    public String getPurchaseRegisterUser() {
        checkSpecifiedProperty("purchaseRegisterUser");
        return _purchaseRegisterUser;
    }

    /**
     * [set] PURCHASE_REGISTER_USER: {NotNull, TEXT(2000000000, 10)} <br />
     * @param purchaseRegisterUser The value of the column 'PURCHASE_REGISTER_USER'. (basically NotNull if update: for the constraint)
     */
    public void setPurchaseRegisterUser(String purchaseRegisterUser) {
        __modifiedProperties.addPropertyName("purchaseRegisterUser");
        _purchaseRegisterUser = purchaseRegisterUser;
    }

    /**
     * [get] PURCHASE_REGISTER_PROCESS: {NotNull, TEXT(2000000000, 10)} <br />
     * @return The value of the column 'PURCHASE_REGISTER_PROCESS'. (basically NotNull if selected: for the constraint)
     */
    public String getPurchaseRegisterProcess() {
        checkSpecifiedProperty("purchaseRegisterProcess");
        return _purchaseRegisterProcess;
    }

    /**
     * [set] PURCHASE_REGISTER_PROCESS: {NotNull, TEXT(2000000000, 10)} <br />
     * @param purchaseRegisterProcess The value of the column 'PURCHASE_REGISTER_PROCESS'. (basically NotNull if update: for the constraint)
     */
    public void setPurchaseRegisterProcess(String purchaseRegisterProcess) {
        __modifiedProperties.addPropertyName("purchaseRegisterProcess");
        _purchaseRegisterProcess = purchaseRegisterProcess;
    }

    /**
     * [get] PURCHASE_UPDATE_DATETIME: {NotNull, DATETIME(2000000000, 10)} <br />
     * @return The value of the column 'PURCHASE_UPDATE_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.sql.Timestamp getPurchaseUpdateDatetime() {
        checkSpecifiedProperty("purchaseUpdateDatetime");
        return _purchaseUpdateDatetime;
    }

    /**
     * [set] PURCHASE_UPDATE_DATETIME: {NotNull, DATETIME(2000000000, 10)} <br />
     * @param purchaseUpdateDatetime The value of the column 'PURCHASE_UPDATE_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setPurchaseUpdateDatetime(java.sql.Timestamp purchaseUpdateDatetime) {
        __modifiedProperties.addPropertyName("purchaseUpdateDatetime");
        _purchaseUpdateDatetime = purchaseUpdateDatetime;
    }

    /**
     * [get] PURCHASE_UPDATE_USER: {NotNull, TEXT(2000000000, 10)} <br />
     * @return The value of the column 'PURCHASE_UPDATE_USER'. (basically NotNull if selected: for the constraint)
     */
    public String getPurchaseUpdateUser() {
        checkSpecifiedProperty("purchaseUpdateUser");
        return _purchaseUpdateUser;
    }

    /**
     * [set] PURCHASE_UPDATE_USER: {NotNull, TEXT(2000000000, 10)} <br />
     * @param purchaseUpdateUser The value of the column 'PURCHASE_UPDATE_USER'. (basically NotNull if update: for the constraint)
     */
    public void setPurchaseUpdateUser(String purchaseUpdateUser) {
        __modifiedProperties.addPropertyName("purchaseUpdateUser");
        _purchaseUpdateUser = purchaseUpdateUser;
    }

    /**
     * [get] PURCHASE_UPDATE_PROCESS: {NotNull, TEXT(2000000000, 10)} <br />
     * @return The value of the column 'PURCHASE_UPDATE_PROCESS'. (basically NotNull if selected: for the constraint)
     */
    public String getPurchaseUpdateProcess() {
        checkSpecifiedProperty("purchaseUpdateProcess");
        return _purchaseUpdateProcess;
    }

    /**
     * [set] PURCHASE_UPDATE_PROCESS: {NotNull, TEXT(2000000000, 10)} <br />
     * @param purchaseUpdateProcess The value of the column 'PURCHASE_UPDATE_PROCESS'. (basically NotNull if update: for the constraint)
     */
    public void setPurchaseUpdateProcess(String purchaseUpdateProcess) {
        __modifiedProperties.addPropertyName("purchaseUpdateProcess");
        _purchaseUpdateProcess = purchaseUpdateProcess;
    }

    /**
     * [get] VERSION_NO: {NotNull, INTEGER(2000000000, 10)} <br />
     * @return The value of the column 'VERSION_NO'. (basically NotNull if selected: for the constraint)
     */
    public Integer getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, INTEGER(2000000000, 10)} <br />
     * @param versionNo The value of the column 'VERSION_NO'. (basically NotNull if update: for the constraint)
     */
    public void setVersionNo(Integer versionNo) {
        __modifiedProperties.addPropertyName("versionNo");
        _versionNo = versionNo;
    }

    /**
     * {@inheritDoc}
     */
    public java.sql.Timestamp getTableNameRegisterDatetime() {
        return getPurchaseRegisterDatetime();
    }

    /**
     * {@inheritDoc}
     */
    public void setTableNameRegisterDatetime(java.sql.Timestamp tableNameRegisterDatetime) {
        setPurchaseRegisterDatetime(tableNameRegisterDatetime);
    }

    /**
     * {@inheritDoc}
     */
    public String getTableNameRegisterUser() {
        return getPurchaseRegisterUser();
    }

    /**
     * {@inheritDoc}
     */
    public void setTableNameRegisterUser(String tableNameRegisterUser) {
        setPurchaseRegisterUser(tableNameRegisterUser);
    }

    /**
     * {@inheritDoc}
     */
    public String getTableNameRegisterProcess() {
        return getPurchaseRegisterProcess();
    }

    /**
     * {@inheritDoc}
     */
    public void setTableNameRegisterProcess(String tableNameRegisterProcess) {
        setPurchaseRegisterProcess(tableNameRegisterProcess);
    }

    /**
     * {@inheritDoc}
     */
    public java.sql.Timestamp getTableNameUpdateDatetime() {
        return getPurchaseUpdateDatetime();
    }

    /**
     * {@inheritDoc}
     */
    public void setTableNameUpdateDatetime(java.sql.Timestamp tableNameUpdateDatetime) {
        setPurchaseUpdateDatetime(tableNameUpdateDatetime);
    }

    /**
     * {@inheritDoc}
     */
    public String getTableNameUpdateUser() {
        return getPurchaseUpdateUser();
    }

    /**
     * {@inheritDoc}
     */
    public void setTableNameUpdateUser(String tableNameUpdateUser) {
        setPurchaseUpdateUser(tableNameUpdateUser);
    }

    /**
     * {@inheritDoc}
     */
    public String getTableNameUpdateProcess() {
        return getPurchaseUpdateProcess();
    }

    /**
     * {@inheritDoc}
     */
    public void setTableNameUpdateProcess(String tableNameUpdateProcess) {
        setPurchaseUpdateProcess(tableNameUpdateProcess);
    }
}
