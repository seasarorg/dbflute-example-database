/*
 * Copyright 2004-2013 the Seasar Foundation and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package com.example.dbflute.mysql.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import org.seasar.dbflute.dbmeta.accessory.CustomizeEntity;
import com.example.dbflute.mysql.dbflute.exentity.customize.*;
import com.example.dbflute.mysql.dbflute.exentity.*;

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
 * java.math.BigDecimal unpaidPriceSummary = entity.getUnpaidPriceSummary();
 * String statusName = entity.getStatusName();
 * entity.setUnpaidManId(unpaidManId);
 * entity.setUnpaidManName(unpaidManName);
 * entity.setUnpaidPriceSummary(unpaidPriceSummary);
 * entity.setStatusName(statusName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsUnpaidSummaryMember extends AbstractEntity implements CustomizeEntity {

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
    /** (会員ID)UNPAID_MAN_ID: {PK, INT(11), refers to member.MEMBER_ID} */
    protected Integer _unpaidManId;

    /** (会員名称)UNPAID_MAN_NAME: {VARCHAR(180), refers to member.MEMBER_NAME} */
    protected String _unpaidManName;

    /** UNPAID_PRICE_SUMMARY: {DECIMAL(32)} */
    protected java.math.BigDecimal _unpaidPriceSummary;

    /** (会員ステータス名称)STATUS_NAME: {VARCHAR(50), refers to member_status.MEMBER_STATUS_NAME} */
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
        return com.example.dbflute.mysql.dbflute.bsentity.customize.dbmeta.UnpaidSummaryMemberDbm.getInstance();
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
     * (会員住所情報)member_address by MEMBER_ID, named 'memberAddressList'.
     * @return The entity list of referrer property 'memberAddressList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<MemberAddress> getMemberAddressList() {
        return innerDomain().getMemberAddressList();
    }

    /**
     * (会員ログイン情報)member_login by MEMBER_ID, named 'memberLoginList'.
     * @return The entity list of referrer property 'memberLoginList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<MemberLogin> getMemberLoginList() {
        return innerDomain().getMemberLoginList();
    }

    /**
     * (購入)purchase by MEMBER_ID, named 'purchaseList'.
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
     * [get] (会員ID)UNPAID_MAN_ID: {PK, INT(11), refers to member.MEMBER_ID} <br />
     * 会員を識別するID。連番として基本的に自動採番される。<br />
     * （会員IDだけに限らず）採番方法はDBMSによって変わる。
     * @return The value of the column 'UNPAID_MAN_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getUnpaidManId() {
        checkSpecifiedProperty("unpaidManId");
        return _unpaidManId;
    }

    /**
     * [set] (会員ID)UNPAID_MAN_ID: {PK, INT(11), refers to member.MEMBER_ID} <br />
     * 会員を識別するID。連番として基本的に自動採番される。<br />
     * （会員IDだけに限らず）採番方法はDBMSによって変わる。
     * @param unpaidManId The value of the column 'UNPAID_MAN_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUnpaidManId(Integer unpaidManId) {
        registerModifiedProperty("unpaidManId");
        _unpaidManId = unpaidManId;
    }

    /**
     * [get] (会員名称)UNPAID_MAN_NAME: {VARCHAR(180), refers to member.MEMBER_NAME} <br />
     * 会員のフルネームの名称。
     * @return The value of the column 'UNPAID_MAN_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getUnpaidManName() {
        checkSpecifiedProperty("unpaidManName");
        return _unpaidManName;
    }

    /**
     * [set] (会員名称)UNPAID_MAN_NAME: {VARCHAR(180), refers to member.MEMBER_NAME} <br />
     * 会員のフルネームの名称。
     * @param unpaidManName The value of the column 'UNPAID_MAN_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUnpaidManName(String unpaidManName) {
        registerModifiedProperty("unpaidManName");
        _unpaidManName = unpaidManName;
    }

    /**
     * [get] UNPAID_PRICE_SUMMARY: {DECIMAL(32)} <br />
     * @return The value of the column 'UNPAID_PRICE_SUMMARY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getUnpaidPriceSummary() {
        checkSpecifiedProperty("unpaidPriceSummary");
        return _unpaidPriceSummary;
    }

    /**
     * [set] UNPAID_PRICE_SUMMARY: {DECIMAL(32)} <br />
     * @param unpaidPriceSummary The value of the column 'UNPAID_PRICE_SUMMARY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUnpaidPriceSummary(java.math.BigDecimal unpaidPriceSummary) {
        registerModifiedProperty("unpaidPriceSummary");
        _unpaidPriceSummary = unpaidPriceSummary;
    }

    /**
     * [get] (会員ステータス名称)STATUS_NAME: {VARCHAR(50), refers to member_status.MEMBER_STATUS_NAME} <br />
     * @return The value of the column 'STATUS_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getStatusName() {
        checkSpecifiedProperty("statusName");
        return _statusName;
    }

    /**
     * [set] (会員ステータス名称)STATUS_NAME: {VARCHAR(50), refers to member_status.MEMBER_STATUS_NAME} <br />
     * @param statusName The value of the column 'STATUS_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStatusName(String statusName) {
        registerModifiedProperty("statusName");
        _statusName = statusName;
    }
}
