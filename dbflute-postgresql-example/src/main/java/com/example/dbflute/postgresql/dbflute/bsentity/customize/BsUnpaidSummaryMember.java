package com.example.dbflute.postgresql.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import com.example.dbflute.postgresql.dbflute.exentity.customize.*;
import com.example.dbflute.postgresql.dbflute.exentity.*;

/**
 * The entity of UnpaidSummaryMember. <br />
 * <pre>
 * [primary-key]
 *     unpaid_man_id
 * 
 * [column]
 *     unpaid_man_id, unpaid_man_name, unpaid_price_summary, status_name
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
 * Long unpaidPriceSummary = entity.getUnpaidPriceSummary();
 * String statusName = entity.getStatusName();
 * entity.setUnpaidManId(unpaidManId);
 * entity.setUnpaidManName(unpaidManName);
 * entity.setUnpaidPriceSummary(unpaidPriceSummary);
 * entity.setStatusName(statusName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsUnpaidSummaryMember extends AbstractEntity {

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
    /** unpaid_man_id: {PK, int4(10), refers to member} */
    protected Integer _unpaidManId;

    /** unpaid_man_name: {varchar(200)} */
    protected String _unpaidManName;

    /** unpaid_price_summary: {int8(19)} */
    protected Long _unpaidPriceSummary;

    /** status_name: {varchar(50)} */
    protected String _statusName;

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
        return com.example.dbflute.postgresql.dbflute.bsentity.customize.dbmeta.UnpaidSummaryMemberDbm.getInstance();
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
     * (会員住所情報)member_address by member_id, named 'memberAddressList'.
     * @return The entity list of referrer property 'memberAddressList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<MemberAddress> getMemberAddressList() {
        return innerDomain().getMemberAddressList();
    }

    /**
     * (会員ログイン)member_login by member_id, named 'memberLoginList'.
     * @return The entity list of referrer property 'memberLoginList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<MemberLogin> getMemberLoginList() {
        return innerDomain().getMemberLoginList();
    }

    /**
     * (購入)purchase by member_id, named 'purchaseList'.
     * @return The entity list of referrer property 'purchaseList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<Purchase> getPurchaseList() {
        return innerDomain().getPurchaseList();
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsUnpaidSummaryMember) {
            BsUnpaidSummaryMember other = (BsUnpaidSummaryMember)obj;
            if (!xSV(_unpaidManId, other._unpaidManId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _unpaidManId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_unpaidManId));
        sb.append(dm).append(xfND(_unpaidManName));
        sb.append(dm).append(xfND(_unpaidPriceSummary));
        sb.append(dm).append(xfND(_statusName));
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
    public UnpaidSummaryMember clone() {
        return (UnpaidSummaryMember)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] unpaid_man_id: {PK, int4(10), refers to member} <br />
     * @return The value of the column 'unpaid_man_id'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getUnpaidManId() {
        checkSpecifiedProperty("unpaidManId");
        return _unpaidManId;
    }

    /**
     * [set] unpaid_man_id: {PK, int4(10), refers to member} <br />
     * @param unpaidManId The value of the column 'unpaid_man_id'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUnpaidManId(Integer unpaidManId) {
        __modifiedProperties.addPropertyName("unpaidManId");
        _unpaidManId = unpaidManId;
    }

    /**
     * [get] unpaid_man_name: {varchar(200)} <br />
     * @return The value of the column 'unpaid_man_name'. (NullAllowed even if selected: for no constraint)
     */
    public String getUnpaidManName() {
        checkSpecifiedProperty("unpaidManName");
        return _unpaidManName;
    }

    /**
     * [set] unpaid_man_name: {varchar(200)} <br />
     * @param unpaidManName The value of the column 'unpaid_man_name'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUnpaidManName(String unpaidManName) {
        __modifiedProperties.addPropertyName("unpaidManName");
        _unpaidManName = unpaidManName;
    }

    /**
     * [get] unpaid_price_summary: {int8(19)} <br />
     * @return The value of the column 'unpaid_price_summary'. (NullAllowed even if selected: for no constraint)
     */
    public Long getUnpaidPriceSummary() {
        checkSpecifiedProperty("unpaidPriceSummary");
        return _unpaidPriceSummary;
    }

    /**
     * [set] unpaid_price_summary: {int8(19)} <br />
     * @param unpaidPriceSummary The value of the column 'unpaid_price_summary'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUnpaidPriceSummary(Long unpaidPriceSummary) {
        __modifiedProperties.addPropertyName("unpaidPriceSummary");
        _unpaidPriceSummary = unpaidPriceSummary;
    }

    /**
     * [get] status_name: {varchar(50)} <br />
     * @return The value of the column 'status_name'. (NullAllowed even if selected: for no constraint)
     */
    public String getStatusName() {
        checkSpecifiedProperty("statusName");
        return _statusName;
    }

    /**
     * [set] status_name: {varchar(50)} <br />
     * @param statusName The value of the column 'status_name'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStatusName(String statusName) {
        __modifiedProperties.addPropertyName("statusName");
        _statusName = statusName;
    }
}
