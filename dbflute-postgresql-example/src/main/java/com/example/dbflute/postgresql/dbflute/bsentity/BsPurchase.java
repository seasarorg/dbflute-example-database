package com.example.dbflute.postgresql.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import com.example.dbflute.postgresql.dbflute.allcommon.EntityDefinedCommonColumn;
import com.example.dbflute.postgresql.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.postgresql.dbflute.allcommon.CDef;
import com.example.dbflute.postgresql.dbflute.exentity.*;

/**
 * The entity of (購入)purchase as TABLE. <br />
 * 一つの商品に対する購入を表現する。<br />
 * 実業務であれば購入詳細というテーブルを作り、「購入という行為」と「その中身（詳細）」を違う粒度のデータとしてそれぞれ管理するのが一般的と言えるでしょう。というか、注文とか請求とかそういうことを考え始めたらもっと複雑になるはずですが、ExampleDBということで割り切っています。
 * <pre>
 * [primary-key]
 *     purchase_id
 * 
 * [column]
 *     purchase_id, member_id, product_id, purchase_datetime, purchase_count, purchase_price, payment_complete_flg, register_datetime, register_user, register_process, update_datetime, update_user, update_process, version_no
 * 
 * [sequence]
 *     SEQ_PURCHASE
 * 
 * [identity]
 *     
 * 
 * [version-no]
 *     version_no
 * 
 * [foreign table]
 *     member, product
 * 
 * [referrer table]
 *     purchase_payment
 * 
 * [foreign property]
 *     member, product
 * 
 * [referrer property]
 *     purchasePaymentList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long purchaseId = entity.getPurchaseId();
 * Integer memberId = entity.getMemberId();
 * Integer productId = entity.getProductId();
 * java.sql.Timestamp purchaseDatetime = entity.getPurchaseDatetime();
 * Integer purchaseCount = entity.getPurchaseCount();
 * Integer purchasePrice = entity.getPurchasePrice();
 * Integer paymentCompleteFlg = entity.getPaymentCompleteFlg();
 * java.sql.Timestamp registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * String registerProcess = entity.getRegisterProcess();
 * java.sql.Timestamp updateDatetime = entity.getUpdateDatetime();
 * String updateUser = entity.getUpdateUser();
 * String updateProcess = entity.getUpdateProcess();
 * Long versionNo = entity.getVersionNo();
 * entity.setPurchaseId(purchaseId);
 * entity.setMemberId(memberId);
 * entity.setProductId(productId);
 * entity.setPurchaseDatetime(purchaseDatetime);
 * entity.setPurchaseCount(purchaseCount);
 * entity.setPurchasePrice(purchasePrice);
 * entity.setPaymentCompleteFlg(paymentCompleteFlg);
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
    /** purchase_id: {PK, ID, NotNull, bigserial(19)} */
    protected Long _purchaseId;

    /** (会員ID)member_id: {UQ+, NotNull, int4(10), FK to member} */
    protected Integer _memberId;

    /** (商品ID)product_id: {+UQ, IX+, NotNull, int4(10), FK to product} */
    protected Integer _productId;

    /** (購入日時)purchase_datetime: {+UQ, IX+, NotNull, timestamp(26, 3)} */
    protected java.sql.Timestamp _purchaseDatetime;

    /** (購入数量)purchase_count: {NotNull, int4(10)} */
    protected Integer _purchaseCount;

    /** (購入価格)purchase_price: {IX, NotNull, int4(10)} */
    protected Integer _purchasePrice;

    /** (支払完了フラグ)payment_complete_flg: {NotNull, int4(10), classification=Flg} */
    protected Integer _paymentCompleteFlg;

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
        return "purchase";
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

    /**
     * To be unique by the unique column. <br />
     * You can update the entity by the key when entity update (NOT batch update).
     * @param memberId (会員ID): UQ+, NotNull, int4(10), FK to member. (NotNull)
     * @param productId (商品ID): +UQ, IX+, NotNull, int4(10), FK to product. (NotNull)
     * @param purchaseDatetime (購入日時): +UQ, IX+, NotNull, timestamp(26, 3). (NotNull)
     */
    public void uniqueBy(Integer memberId, Integer productId, java.sql.Timestamp purchaseDatetime) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("memberId");
        __uniqueDrivenProperties.addPropertyName("productId");
        __uniqueDrivenProperties.addPropertyName("purchaseDatetime");
        setMemberId(memberId);setProductId(productId);setPurchaseDatetime(purchaseDatetime);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of paymentCompleteFlg as the classification of Flg. <br />
     * (支払完了フラグ)payment_complete_flg: {NotNull, int4(10), classification=Flg} <br />
     * general boolean classification for every flg-column
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.Flg getPaymentCompleteFlgAsFlg() {
        return CDef.Flg.codeOf(getPaymentCompleteFlg());
    }

    /**
     * Set the value of paymentCompleteFlg as the classification of Flg. <br />
     * (支払完了フラグ)payment_complete_flg: {NotNull, int4(10), classification=Flg} <br />
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
     * Set the value of paymentCompleteFlg as False (0). <br />
     * No: means invalid
     */
    public void setPaymentCompleteFlg_False() {
        setPaymentCompleteFlgAsFlg(CDef.Flg.False);
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
    /** (会員)member by my member_id, named 'member'. */
    protected Member _member;

    /**
     * [get] (会員)member by my member_id, named 'member'.
     * @return The entity of foreign property 'member'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public Member getMember() {
        return _member;
    }

    /**
     * [set] (会員)member by my member_id, named 'member'.
     * @param member The entity of foreign property 'member'. (NullAllowed)
     */
    public void setMember(Member member) {
        _member = member;
    }

    /** (商品)product by my product_id, named 'product'. */
    protected Product _product;

    /**
     * [get] (商品)product by my product_id, named 'product'.
     * @return The entity of foreign property 'product'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public Product getProduct() {
        return _product;
    }

    /**
     * [set] (商品)product by my product_id, named 'product'.
     * @param product The entity of foreign property 'product'. (NullAllowed)
     */
    public void setProduct(Product product) {
        _product = product;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** (購入支払)purchase_payment by purchase_id, named 'purchasePaymentList'. */
    protected List<PurchasePayment> _purchasePaymentList;

    /**
     * [get] (購入支払)purchase_payment by purchase_id, named 'purchasePaymentList'.
     * @return The entity list of referrer property 'purchasePaymentList'. (NotNull: even if no loading, returns empty list)
     */
    public List<PurchasePayment> getPurchasePaymentList() {
        if (_purchasePaymentList == null) { _purchasePaymentList = newReferrerList(); }
        return _purchasePaymentList;
    }

    /**
     * [set] (購入支払)purchase_payment by purchase_id, named 'purchasePaymentList'.
     * @param purchasePaymentList The entity list of referrer property 'purchasePaymentList'. (NullAllowed)
     */
    public void setPurchasePaymentList(List<PurchasePayment> purchasePaymentList) {
        _purchasePaymentList = purchasePaymentList;
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
        if (_purchasePaymentList != null) { for (PurchasePayment et : _purchasePaymentList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "purchasePaymentList")); } } }
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
        if (_member != null) { sb.append(dm).append("member"); }
        if (_product != null) { sb.append(dm).append("product"); }
        if (_purchasePaymentList != null && !_purchasePaymentList.isEmpty())
        { sb.append(dm).append("purchasePaymentList"); }
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
     * [get] purchase_id: {PK, ID, NotNull, bigserial(19)} <br />
     * @return The value of the column 'purchase_id'. (basically NotNull if selected: for the constraint)
     */
    public Long getPurchaseId() {
        checkSpecifiedProperty("purchaseId");
        return _purchaseId;
    }

    /**
     * [set] purchase_id: {PK, ID, NotNull, bigserial(19)} <br />
     * @param purchaseId The value of the column 'purchase_id'. (basically NotNull if update: for the constraint)
     */
    public void setPurchaseId(Long purchaseId) {
        __modifiedProperties.addPropertyName("purchaseId");
        _purchaseId = purchaseId;
    }

    /**
     * [get] (会員ID)member_id: {UQ+, NotNull, int4(10), FK to member} <br />
     * 会員を参照するID。<br />
     * 購入を識別する自然キー（複合ユニーク制約）の筆頭要素。
     * @return The value of the column 'member_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMemberId() {
        checkSpecifiedProperty("memberId");
        return _memberId;
    }

    /**
     * [set] (会員ID)member_id: {UQ+, NotNull, int4(10), FK to member} <br />
     * 会員を参照するID。<br />
     * 購入を識別する自然キー（複合ユニーク制約）の筆頭要素。
     * @param memberId The value of the column 'member_id'. (basically NotNull if update: for the constraint)
     */
    public void setMemberId(Integer memberId) {
        __modifiedProperties.addPropertyName("memberId");
        _memberId = memberId;
    }

    /**
     * [get] (商品ID)product_id: {+UQ, IX+, NotNull, int4(10), FK to product} <br />
     * 商品を参照するID。
     * @return The value of the column 'product_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getProductId() {
        checkSpecifiedProperty("productId");
        return _productId;
    }

    /**
     * [set] (商品ID)product_id: {+UQ, IX+, NotNull, int4(10), FK to product} <br />
     * 商品を参照するID。
     * @param productId The value of the column 'product_id'. (basically NotNull if update: for the constraint)
     */
    public void setProductId(Integer productId) {
        __modifiedProperties.addPropertyName("productId");
        _productId = productId;
    }

    /**
     * [get] (購入日時)purchase_datetime: {+UQ, IX+, NotNull, timestamp(26, 3)} <br />
     * 購入した瞬間の日時。
     * @return The value of the column 'purchase_datetime'. (basically NotNull if selected: for the constraint)
     */
    public java.sql.Timestamp getPurchaseDatetime() {
        checkSpecifiedProperty("purchaseDatetime");
        return _purchaseDatetime;
    }

    /**
     * [set] (購入日時)purchase_datetime: {+UQ, IX+, NotNull, timestamp(26, 3)} <br />
     * 購入した瞬間の日時。
     * @param purchaseDatetime The value of the column 'purchase_datetime'. (basically NotNull if update: for the constraint)
     */
    public void setPurchaseDatetime(java.sql.Timestamp purchaseDatetime) {
        __modifiedProperties.addPropertyName("purchaseDatetime");
        _purchaseDatetime = purchaseDatetime;
    }

    /**
     * [get] (購入数量)purchase_count: {NotNull, int4(10)} <br />
     * 購入した商品の（一回の購入における）数量。
     * @return The value of the column 'purchase_count'. (basically NotNull if selected: for the constraint)
     */
    public Integer getPurchaseCount() {
        checkSpecifiedProperty("purchaseCount");
        return _purchaseCount;
    }

    /**
     * [set] (購入数量)purchase_count: {NotNull, int4(10)} <br />
     * 購入した商品の（一回の購入における）数量。
     * @param purchaseCount The value of the column 'purchase_count'. (basically NotNull if update: for the constraint)
     */
    public void setPurchaseCount(Integer purchaseCount) {
        __modifiedProperties.addPropertyName("purchaseCount");
        _purchaseCount = purchaseCount;
    }

    /**
     * [get] (購入価格)purchase_price: {IX, NotNull, int4(10)} <br />
     * 購入によって実際に会員が支払った（支払う予定の）価格。<br />
     * 基本は商品の定価に購入数量を掛けたものになるが、<br />
     * ポイント利用や割引があったりと必ずしもそうはならない。
     * @return The value of the column 'purchase_price'. (basically NotNull if selected: for the constraint)
     */
    public Integer getPurchasePrice() {
        checkSpecifiedProperty("purchasePrice");
        return _purchasePrice;
    }

    /**
     * [set] (購入価格)purchase_price: {IX, NotNull, int4(10)} <br />
     * 購入によって実際に会員が支払った（支払う予定の）価格。<br />
     * 基本は商品の定価に購入数量を掛けたものになるが、<br />
     * ポイント利用や割引があったりと必ずしもそうはならない。
     * @param purchasePrice The value of the column 'purchase_price'. (basically NotNull if update: for the constraint)
     */
    public void setPurchasePrice(Integer purchasePrice) {
        __modifiedProperties.addPropertyName("purchasePrice");
        _purchasePrice = purchasePrice;
    }

    /**
     * [get] (支払完了フラグ)payment_complete_flg: {NotNull, int4(10), classification=Flg} <br />
     * この購入に関しての支払いが完了しているか否か。
     * @return The value of the column 'payment_complete_flg'. (basically NotNull if selected: for the constraint)
     */
    public Integer getPaymentCompleteFlg() {
        checkSpecifiedProperty("paymentCompleteFlg");
        return _paymentCompleteFlg;
    }

    /**
     * [set] (支払完了フラグ)payment_complete_flg: {NotNull, int4(10), classification=Flg} <br />
     * この購入に関しての支払いが完了しているか否か。
     * @param paymentCompleteFlg The value of the column 'payment_complete_flg'. (basically NotNull if update: for the constraint)
     */
    protected void setPaymentCompleteFlg(Integer paymentCompleteFlg) {
        __modifiedProperties.addPropertyName("paymentCompleteFlg");
        _paymentCompleteFlg = paymentCompleteFlg;
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
        __modifiedProperties.addPropertyName("registerDatetime");
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
        __modifiedProperties.addPropertyName("registerUser");
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
        __modifiedProperties.addPropertyName("registerProcess");
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
        __modifiedProperties.addPropertyName("updateDatetime");
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
        __modifiedProperties.addPropertyName("updateUser");
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
        __modifiedProperties.addPropertyName("updateProcess");
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
        __modifiedProperties.addPropertyName("versionNo");
        _versionNo = versionNo;
    }

    /**
     * For framework so basically DON'T use this method.
     * @param paymentCompleteFlg The value of the column 'payment_complete_flg'. (basically NotNull if update: for the constraint)
     */
    public void mynativeMappingPaymentCompleteFlg(Integer paymentCompleteFlg) {
        setPaymentCompleteFlg(paymentCompleteFlg);
    }
}
