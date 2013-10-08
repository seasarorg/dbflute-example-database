/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package com.example.dbflute.mysql.dbflute.exentity;

import com.example.dbflute.mysql.dbflute.bsentity.BsServiceRank;

/**
 * The entity of service_rank.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class ServiceRank extends BsServiceRank {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    public static final String ALIAS_memberCount = "MEMBER_COUNT";
    public static final String ALIAS_maxPurchasePrice = "MAX_PURCHASE_PRICE";
    public static final String ALIAS_avgPurchasePrice = "AVG_PURCHASE_PRICE";
    public static final String ALIAS_sumPointCount = "SUM_POINT_COUNT";
    public static final String ALIAS_loginCount = "LOGIN_COUNT";

    protected Integer memberCount;
    protected Integer maxPurchasePrice;
    protected Integer avgPurchasePrice;
    protected Integer sumPointCount;
    protected Integer loginCount;

    public Integer getMemberCount() {
        return memberCount;
    }

    public void setMemberCount(Integer memberCount) {
        this.memberCount = memberCount;
    }

    public Integer getMaxPurchasePrice() {
        return maxPurchasePrice;
    }

    public void setMaxPurchasePrice(Integer maxPurchasePrice) {
        this.maxPurchasePrice = maxPurchasePrice;
    }

    public Integer getAvgPurchasePrice() {
        return avgPurchasePrice;
    }

    public void setAvgPurchasePrice(Integer avgPurchasePrice) {
        this.avgPurchasePrice = avgPurchasePrice;
    }

    public Integer getSumPointCount() {
        return sumPointCount;
    }

    public void setSumPointCount(Integer sumPointCount) {
        this.sumPointCount = sumPointCount;
    }

    public Integer getLoginCount() {
        return loginCount;
    }

    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }
}
