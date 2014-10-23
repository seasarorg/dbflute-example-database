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
package com.example.dbflute.mysql.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import com.example.dbflute.mysql.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.mysql.dbflute.exentity.*;

/**
 * The entity of WHITE_PURCHASE_REFERRER as TABLE. <br />
 * <pre>
 * [primary-key]
 *     PURCHASE_REFERRER_ID
 * 
 * [column]
 *     PURCHASE_REFERRER_ID, PURCHASE_REFERRER_NAME
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     PURCHASE_REFERRER_ID
 * 
 * [version-no]
 *     
 * 
 * [foreign table]
 *     purchase
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     purchase
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long purchaseReferrerId = entity.getPurchaseReferrerId();
 * String purchaseReferrerName = entity.getPurchaseReferrerName();
 * entity.setPurchaseReferrerId(purchaseReferrerId);
 * entity.setPurchaseReferrerName(purchaseReferrerName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhitePurchaseReferrer extends AbstractEntity {

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
    /** PURCHASE_REFERRER_ID: {PK, ID, NotNull, BIGINT(19), FK to purchase} */
    protected Long _purchaseReferrerId;

    /** PURCHASE_REFERRER_NAME: {NotNull, VARCHAR(200)} */
    protected String _purchaseReferrerName;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "white_purchase_referrer";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whitePurchaseReferrer";
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
        if (getPurchaseReferrerId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** (購入)purchase by my PURCHASE_REFERRER_ID, named 'purchase'. */
    protected Purchase _purchase;

    /**
     * [get] (購入)purchase by my PURCHASE_REFERRER_ID, named 'purchase'.
     * @return The entity of foreign property 'purchase'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public Purchase getPurchase() {
        return _purchase;
    }

    /**
     * [set] (購入)purchase by my PURCHASE_REFERRER_ID, named 'purchase'.
     * @param purchase The entity of foreign property 'purchase'. (NullAllowed)
     */
    public void setPurchase(Purchase purchase) {
        _purchase = purchase;
    }

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
        if (obj instanceof BsWhitePurchaseReferrer) {
            BsWhitePurchaseReferrer other = (BsWhitePurchaseReferrer)obj;
            if (!xSV(_purchaseReferrerId, other._purchaseReferrerId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _purchaseReferrerId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_purchase != null)
        { sb.append(li).append(xbRDS(_purchase, "purchase")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_purchaseReferrerId));
        sb.append(dm).append(xfND(_purchaseReferrerName));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_purchase != null) { sb.append(dm).append("purchase"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhitePurchaseReferrer clone() {
        return (WhitePurchaseReferrer)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PURCHASE_REFERRER_ID: {PK, ID, NotNull, BIGINT(19), FK to purchase} <br />
     * @return The value of the column 'PURCHASE_REFERRER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getPurchaseReferrerId() {
        checkSpecifiedProperty("purchaseReferrerId");
        return _purchaseReferrerId;
    }

    /**
     * [set] PURCHASE_REFERRER_ID: {PK, ID, NotNull, BIGINT(19), FK to purchase} <br />
     * @param purchaseReferrerId The value of the column 'PURCHASE_REFERRER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setPurchaseReferrerId(Long purchaseReferrerId) {
        __modifiedProperties.addPropertyName("purchaseReferrerId");
        _purchaseReferrerId = purchaseReferrerId;
    }

    /**
     * [get] PURCHASE_REFERRER_NAME: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'PURCHASE_REFERRER_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getPurchaseReferrerName() {
        checkSpecifiedProperty("purchaseReferrerName");
        return _purchaseReferrerName;
    }

    /**
     * [set] PURCHASE_REFERRER_NAME: {NotNull, VARCHAR(200)} <br />
     * @param purchaseReferrerName The value of the column 'PURCHASE_REFERRER_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setPurchaseReferrerName(String purchaseReferrerName) {
        __modifiedProperties.addPropertyName("purchaseReferrerName");
        _purchaseReferrerName = purchaseReferrerName;
    }
}
