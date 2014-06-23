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

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;
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
public abstract class BsWhitePurchaseReferrer implements Entity, Serializable, Cloneable {

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
        if (obj == null || !(obj instanceof BsWhitePurchaseReferrer)) { return false; }
        BsWhitePurchaseReferrer other = (BsWhitePurchaseReferrer)obj;
        if (!xSV(getPurchaseReferrerId(), other.getPurchaseReferrerId())) { return false; }
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
        hs = xCH(hs, getPurchaseReferrerId());
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
        if (_purchase != null)
        { sb.append(li).append(xbRDS(_purchase, "purchase")); }
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
        sb.append(dm).append(getPurchaseReferrerId());
        sb.append(dm).append(getPurchaseReferrerName());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String cm = ",";
        if (_purchase != null) { sb.append(cm).append("purchase"); }
        if (sb.length() > cm.length()) {
            sb.delete(0, cm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public WhitePurchaseReferrer clone() {
        try {
            return (WhitePurchaseReferrer)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PURCHASE_REFERRER_ID: {PK, ID, NotNull, BIGINT(19), FK to purchase} <br />
     * @return The value of the column 'PURCHASE_REFERRER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getPurchaseReferrerId() {
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
