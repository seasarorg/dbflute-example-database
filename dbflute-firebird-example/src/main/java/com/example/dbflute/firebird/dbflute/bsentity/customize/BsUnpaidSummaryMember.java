package com.example.dbflute.firebird.dbflute.bsentity.customize;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;

import com.example.dbflute.firebird.dbflute.exentity.*;
import com.example.dbflute.firebird.dbflute.exentity.customize.*;

/**
 * The entity of UnpaidSummaryMember. <br />
 * <pre>
 * [primary-key]
 *     UNPAID_MAN_ID
 * 
 * [column]
 *     UNPAID_MAN_ID, UNPAID_MAN_NAME, UNPAID_PRICE_SUMMARY, STATUS_NAME
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
 * Integer unpaidManId = entity.getUnpaidManId();
 * String unpaidManName = entity.getUnpaidManName();
 * String unpaidPriceSummary = entity.getUnpaidPriceSummary();
 * String statusName = entity.getStatusName();
 * entity.setUnpaidManId(unpaidManId);
 * entity.setUnpaidManName(unpaidManName);
 * entity.setUnpaidPriceSummary(unpaidPriceSummary);
 * entity.setStatusName(statusName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsUnpaidSummaryMember implements Entity, Serializable, Cloneable {

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
    /** UNPAID_MAN_ID: {PK, null(2147483647), refers to MEMBER} */
    protected Integer _unpaidManId;

    /** UNPAID_MAN_NAME: {null(2147483647), refers to MEMBER} */
    protected String _unpaidManName;

    /** UNPAID_PRICE_SUMMARY: {null(2147483647)} */
    protected String _unpaidPriceSummary;

    /** STATUS_NAME: {null(2147483647), refers to MEMBER_STATUS} */
    protected String _statusName;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The unique-driven properties for this entity. (NotNull) */
    protected final EntityUniqueDrivenProperties __uniqueDrivenProperties = newUniqueDrivenProperties();

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
        return "UnpaidSummaryMember";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "unpaidSummaryMember";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /**
     * {@inheritDoc}
     */
    public DBMeta getDBMeta() {
        return com.example.dbflute.firebird.dbflute.bsentity.customize.dbmeta.UnpaidSummaryMemberDbm.getInstance();
    }

    // ===================================================================================
    //                                                                         Primary Key
    //                                                                         ===========
    /**
     * {@inheritDoc}
     */
    public boolean hasPrimaryKeyValue() {
        if (getUnpaidManId() == null) { return false; }
        return true;
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
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected Member __innerDomain;

    protected Member innerDomain() {
        if (__innerDomain == null) {
            __innerDomain = new Member();
        }
        return __innerDomain;
    }

    /**
     * Prepare the inner instance of domain entity (basically for LoadReferrer).
     * <pre>
     * List&lt;UnpaidSummaryMember&gt; memberList = memberBhv.outsideSql()...;
     * List&lt;Member&gt; domainList = new ArrayList&lt;Member&gt;();
     * for (UnpaidSummaryMember member : memberList) {
     *     domainList.add(member.<span style="color: #DD4747">prepareDomain()</span>);
     * }
     * memberBhv.<span style="color: #DD4747">loadPurchaseList</span>(domainList, new ConditionBeanSetupper...);
     * for (UnpaidSummaryMember member : memberList) {
     *     Purchase purchase = member.<span style="color: #DD4747">getPurchaseList()</span>; <span style="color: #3F7E5E">// you can get it</span>
     *     ...
     * }
     * </pre>
     * @return The domain entity for this customize entity. (NotNull)
     */
    public Member prepareDomain() {
        innerDomain().setMemberId(getUnpaidManId());
        return innerDomain();
    }

    /**
     * MEMBER_ADDRESS by MEMBER_ID, named 'memberAddressList'.
     * @return The entity list of referrer property 'memberAddressList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<MemberAddress> getMemberAddressList() {
        return innerDomain().getMemberAddressList();
    }

    /**
     * MEMBER_LOGIN by MEMBER_ID, named 'memberLoginList'.
     * @return The entity list of referrer property 'memberLoginList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<MemberLogin> getMemberLoginList() {
        return innerDomain().getMemberLoginList();
    }

    /**
     * MEMBER_SERVICE by MEMBER_ID, named 'memberServiceList'.
     * @return The entity list of referrer property 'memberServiceList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<MemberService> getMemberServiceList() {
        return innerDomain().getMemberServiceList();
    }

    /**
     * PURCHASE by MEMBER_ID, named 'purchaseList'.
     * @return The entity list of referrer property 'purchaseList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<Purchase> getPurchaseList() {
        return innerDomain().getPurchaseList();
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
        if (obj == null || !(obj instanceof BsUnpaidSummaryMember)) { return false; }
        BsUnpaidSummaryMember other = (BsUnpaidSummaryMember)obj;
        if (!xSV(getUnpaidManId(), other.getUnpaidManId())) { return false; }
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
        hs = xCH(hs, getUnpaidManId());
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
        String dm = ", ";
        sb.append(dm).append(getUnpaidManId());
        sb.append(dm).append(getUnpaidManName());
        sb.append(dm).append(getUnpaidPriceSummary());
        sb.append(dm).append(getStatusName());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
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
    public UnpaidSummaryMember clone() {
        try {
            return (UnpaidSummaryMember)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] UNPAID_MAN_ID: {PK, null(2147483647), refers to MEMBER} <br />
     * @return The value of the column 'UNPAID_MAN_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getUnpaidManId() {
        return _unpaidManId;
    }

    /**
     * [set] UNPAID_MAN_ID: {PK, null(2147483647), refers to MEMBER} <br />
     * @param unpaidManId The value of the column 'UNPAID_MAN_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUnpaidManId(Integer unpaidManId) {
        __modifiedProperties.addPropertyName("unpaidManId");
        _unpaidManId = unpaidManId;
    }

    /**
     * [get] UNPAID_MAN_NAME: {null(2147483647), refers to MEMBER} <br />
     * @return The value of the column 'UNPAID_MAN_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getUnpaidManName() {
        return _unpaidManName;
    }

    /**
     * [set] UNPAID_MAN_NAME: {null(2147483647), refers to MEMBER} <br />
     * @param unpaidManName The value of the column 'UNPAID_MAN_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUnpaidManName(String unpaidManName) {
        __modifiedProperties.addPropertyName("unpaidManName");
        _unpaidManName = unpaidManName;
    }

    /**
     * [get] UNPAID_PRICE_SUMMARY: {null(2147483647)} <br />
     * @return The value of the column 'UNPAID_PRICE_SUMMARY'. (NullAllowed even if selected: for no constraint)
     */
    public String getUnpaidPriceSummary() {
        return _unpaidPriceSummary;
    }

    /**
     * [set] UNPAID_PRICE_SUMMARY: {null(2147483647)} <br />
     * @param unpaidPriceSummary The value of the column 'UNPAID_PRICE_SUMMARY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUnpaidPriceSummary(String unpaidPriceSummary) {
        __modifiedProperties.addPropertyName("unpaidPriceSummary");
        _unpaidPriceSummary = unpaidPriceSummary;
    }

    /**
     * [get] STATUS_NAME: {null(2147483647), refers to MEMBER_STATUS} <br />
     * @return The value of the column 'STATUS_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getStatusName() {
        return _statusName;
    }

    /**
     * [set] STATUS_NAME: {null(2147483647), refers to MEMBER_STATUS} <br />
     * @param statusName The value of the column 'STATUS_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStatusName(String statusName) {
        __modifiedProperties.addPropertyName("statusName");
        _statusName = statusName;
    }
}
