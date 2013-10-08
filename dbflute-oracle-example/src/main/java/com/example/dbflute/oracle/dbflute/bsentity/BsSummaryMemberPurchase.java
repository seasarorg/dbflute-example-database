package com.example.dbflute.oracle.dbflute.bsentity;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.Entity;
import com.example.dbflute.oracle.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.oracle.dbflute.exentity.*;

/**
 * The entity of (会員購入さまりまてびゅー)SUMMARY_MEMBER_PURCHASE as TABLE. <br />
 * まてびゅーのコメントはALL_MVIEW_COMMENTSだって
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     MEMBER_ID, ALLSUM_PURCHASE_PRICE, LATEST_PURCHASE_DATETIME
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
 * Long memberId = entity.getMemberId();
 * java.math.BigDecimal allsumPurchasePrice = entity.getAllsumPurchasePrice();
 * java.sql.Timestamp latestPurchaseDatetime = entity.getLatestPurchaseDatetime();
 * entity.setMemberId(memberId);
 * entity.setAllsumPurchasePrice(allsumPurchasePrice);
 * entity.setLatestPurchaseDatetime(latestPurchaseDatetime);
 * = = = = = = = = = =/
 * </pre>
 * @author oracleman
 */
public abstract class BsSummaryMemberPurchase implements Entity, Serializable, Cloneable {

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
    /** MEMBER_ID: {NotNull, NUMBER(16)} */
    protected Long _memberId;

    /** ALLSUM_PURCHASE_PRICE: {NUMBER(22)} */
    protected java.math.BigDecimal _allsumPurchasePrice;

    /** LATEST_PURCHASE_DATETIME: {TIMESTAMP(3)(11, 3)} */
    protected java.sql.Timestamp _latestPurchaseDatetime;

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
        return "SUMMARY_MEMBER_PURCHASE";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "summaryMemberPurchase";
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
        return false;
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
     * @param other The other entity. (NullAllowed: if null, returns false fixedly)
     * @return Comparing result.
     */
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsSummaryMemberPurchase)) { return false; }
        BsSummaryMemberPurchase otherEntity = (BsSummaryMemberPurchase)other;
        if (!xSV(getMemberId(), otherEntity.getMemberId())) { return false; }
        if (!xSV(getAllsumPurchasePrice(), otherEntity.getAllsumPurchasePrice())) { return false; }
        if (!xSV(getLatestPurchaseDatetime(), otherEntity.getLatestPurchaseDatetime())) { return false; }
        return true;
    }
    protected boolean xSV(Object value1, Object value2) { // isSameValue()
        return InternalUtil.isSameValue(value1, value2);
    }

    /**
     * Calculate the hash-code from primary-keys or columns.
     * @return The hash-code from primary-key or columns.
     */
    public int hashCode() {
        int result = 17;
        result = xCH(result, getTableDbName());
        result = xCH(result, getMemberId());
        result = xCH(result, getAllsumPurchasePrice());
        result = xCH(result, getLatestPurchaseDatetime());
        return result;
    }
    protected int xCH(int result, Object value) { // calculateHashcode()
        return InternalUtil.calculateHashcode(result, value);
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
        return buildDisplayString(InternalUtil.toClassTitle(this), true, true);
    }

    /**
     * {@inheritDoc}
     */
    public String toStringWithRelation() {
        StringBuilder sb = new StringBuilder();
        sb.append(toString());
        return sb.toString();
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
        sb.append(delimiter).append(getMemberId());
        sb.append(delimiter).append(getAllsumPurchasePrice());
        sb.append(delimiter).append(getLatestPurchaseDatetime());
        if (sb.length() > delimiter.length()) {
            sb.delete(0, delimiter.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        return "";
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public SummaryMemberPurchase clone() {
        try {
            return (SummaryMemberPurchase)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MEMBER_ID: {NotNull, NUMBER(16)} <br />
     * @return The value of the column 'MEMBER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getMemberId() {
        return _memberId;
    }

    /**
     * [set] MEMBER_ID: {NotNull, NUMBER(16)} <br />
     * @param memberId The value of the column 'MEMBER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMemberId(Long memberId) {
        __modifiedProperties.addPropertyName("memberId");
        this._memberId = memberId;
    }

    /**
     * [get] ALLSUM_PURCHASE_PRICE: {NUMBER(22)} <br />
     * @return The value of the column 'ALLSUM_PURCHASE_PRICE'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getAllsumPurchasePrice() {
        return _allsumPurchasePrice;
    }

    /**
     * [set] ALLSUM_PURCHASE_PRICE: {NUMBER(22)} <br />
     * @param allsumPurchasePrice The value of the column 'ALLSUM_PURCHASE_PRICE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAllsumPurchasePrice(java.math.BigDecimal allsumPurchasePrice) {
        __modifiedProperties.addPropertyName("allsumPurchasePrice");
        this._allsumPurchasePrice = allsumPurchasePrice;
    }

    /**
     * [get] LATEST_PURCHASE_DATETIME: {TIMESTAMP(3)(11, 3)} <br />
     * @return The value of the column 'LATEST_PURCHASE_DATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getLatestPurchaseDatetime() {
        return _latestPurchaseDatetime;
    }

    /**
     * [set] LATEST_PURCHASE_DATETIME: {TIMESTAMP(3)(11, 3)} <br />
     * @param latestPurchaseDatetime The value of the column 'LATEST_PURCHASE_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLatestPurchaseDatetime(java.sql.Timestamp latestPurchaseDatetime) {
        __modifiedProperties.addPropertyName("latestPurchaseDatetime");
        this._latestPurchaseDatetime = latestPurchaseDatetime;
    }
}
