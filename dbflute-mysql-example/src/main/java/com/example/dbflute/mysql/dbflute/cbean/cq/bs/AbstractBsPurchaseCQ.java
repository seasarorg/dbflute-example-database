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
package com.example.dbflute.mysql.dbflute.cbean.cq.bs;

import java.util.*;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.dbmeta.DBMetaProvider;
import com.example.dbflute.mysql.dbflute.allcommon.*;
import com.example.dbflute.mysql.dbflute.cbean.*;
import com.example.dbflute.mysql.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of purchase.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsPurchaseCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsPurchaseCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                     DBMeta Provider
    //                                                                     ===============
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "purchase";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入ID)PURCHASE_ID: {PK, ID, NotNull, BIGINT(19), FK to PURCHASE}
     * @param purchaseId The value of purchaseId as equal. (NullAllowed: if null, no condition)
     */
    public void setPurchaseId_Equal(Long purchaseId) {
        doSetPurchaseId_Equal(purchaseId);
    }

    protected void doSetPurchaseId_Equal(Long purchaseId) {
        regPurchaseId(CK_EQ, purchaseId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入ID)PURCHASE_ID: {PK, ID, NotNull, BIGINT(19), FK to PURCHASE}
     * @param purchaseId The value of purchaseId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setPurchaseId_GreaterThan(Long purchaseId) {
        regPurchaseId(CK_GT, purchaseId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入ID)PURCHASE_ID: {PK, ID, NotNull, BIGINT(19), FK to PURCHASE}
     * @param purchaseId The value of purchaseId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setPurchaseId_LessThan(Long purchaseId) {
        regPurchaseId(CK_LT, purchaseId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入ID)PURCHASE_ID: {PK, ID, NotNull, BIGINT(19), FK to PURCHASE}
     * @param purchaseId The value of purchaseId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setPurchaseId_GreaterEqual(Long purchaseId) {
        regPurchaseId(CK_GE, purchaseId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入ID)PURCHASE_ID: {PK, ID, NotNull, BIGINT(19), FK to PURCHASE}
     * @param purchaseId The value of purchaseId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setPurchaseId_LessEqual(Long purchaseId) {
        regPurchaseId(CK_LE, purchaseId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (購入ID)PURCHASE_ID: {PK, ID, NotNull, BIGINT(19), FK to PURCHASE}
     * @param minNumber The min number of purchaseId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of purchaseId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPurchaseId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValuePurchaseId(), "PURCHASE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (購入ID)PURCHASE_ID: {PK, ID, NotNull, BIGINT(19), FK to PURCHASE}
     * @param purchaseIdList The collection of purchaseId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseId_InScope(Collection<Long> purchaseIdList) {
        doSetPurchaseId_InScope(purchaseIdList);
    }

    protected void doSetPurchaseId_InScope(Collection<Long> purchaseIdList) {
        regINS(CK_INS, cTL(purchaseIdList), getCValuePurchaseId(), "PURCHASE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (購入ID)PURCHASE_ID: {PK, ID, NotNull, BIGINT(19), FK to PURCHASE}
     * @param purchaseIdList The collection of purchaseId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseId_NotInScope(Collection<Long> purchaseIdList) {
        doSetPurchaseId_NotInScope(purchaseIdList);
    }

    protected void doSetPurchaseId_NotInScope(Collection<Long> purchaseIdList) {
        regINS(CK_NINS, cTL(purchaseIdList), getCValuePurchaseId(), "PURCHASE_ID");
    }

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select PURCHASE_REFERRER_ID from white_purchase_referrer where ...)} <br />
     * white_purchase_referrer by PURCHASE_REFERRER_ID, named 'whitePurchaseReferrerAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsWhitePurchaseReferrerAsOne</span>(new SubQuery&lt;WhitePurchaseReferrerCB&gt;() {
     *     public void query(WhitePurchaseReferrerCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of WhitePurchaseReferrerAsOne for 'exists'. (NotNull)
     */
    public void existsWhitePurchaseReferrerAsOne(SubQuery<WhitePurchaseReferrerCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhitePurchaseReferrerCB cb = new WhitePurchaseReferrerCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String pp = keepPurchaseId_ExistsReferrer_WhitePurchaseReferrerAsOne(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "PURCHASE_ID", "PURCHASE_REFERRER_ID", pp, "whitePurchaseReferrerAsOne");
    }
    public abstract String keepPurchaseId_ExistsReferrer_WhitePurchaseReferrerAsOne(WhitePurchaseReferrerCQ sq);

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select PURCHASE_ID from purchase where ...)} <br />
     * (購入)purchase by PURCHASE_ID, named 'purchaseSelfAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsPurchaseSelfAsOne</span>(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of PurchaseSelfAsOne for 'exists'. (NotNull)
     */
    public void existsPurchaseSelfAsOne(SubQuery<PurchaseCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        PurchaseCB cb = new PurchaseCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String pp = keepPurchaseId_ExistsReferrer_PurchaseSelfAsOne(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "PURCHASE_ID", "PURCHASE_ID", pp, "purchaseSelfAsOne");
    }
    public abstract String keepPurchaseId_ExistsReferrer_PurchaseSelfAsOne(PurchaseCQ sq);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select PURCHASE_REFERRER_ID from white_purchase_referrer where ...)} <br />
     * white_purchase_referrer by PURCHASE_REFERRER_ID, named 'whitePurchaseReferrerAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsWhitePurchaseReferrerAsOne</span>(new SubQuery&lt;WhitePurchaseReferrerCB&gt;() {
     *     public void query(WhitePurchaseReferrerCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of PurchaseId_NotExistsReferrer_WhitePurchaseReferrerAsOne for 'not exists'. (NotNull)
     */
    public void notExistsWhitePurchaseReferrerAsOne(SubQuery<WhitePurchaseReferrerCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhitePurchaseReferrerCB cb = new WhitePurchaseReferrerCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String pp = keepPurchaseId_NotExistsReferrer_WhitePurchaseReferrerAsOne(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "PURCHASE_ID", "PURCHASE_REFERRER_ID", pp, "whitePurchaseReferrerAsOne");
    }
    public abstract String keepPurchaseId_NotExistsReferrer_WhitePurchaseReferrerAsOne(WhitePurchaseReferrerCQ sq);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select PURCHASE_ID from purchase where ...)} <br />
     * (購入)purchase by PURCHASE_ID, named 'purchaseSelfAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsPurchaseSelfAsOne</span>(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of PurchaseId_NotExistsReferrer_PurchaseSelfAsOne for 'not exists'. (NotNull)
     */
    public void notExistsPurchaseSelfAsOne(SubQuery<PurchaseCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        PurchaseCB cb = new PurchaseCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String pp = keepPurchaseId_NotExistsReferrer_PurchaseSelfAsOne(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "PURCHASE_ID", "PURCHASE_ID", pp, "purchaseSelfAsOne");
    }
    public abstract String keepPurchaseId_NotExistsReferrer_PurchaseSelfAsOne(PurchaseCQ sq);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PURCHASE_ID from purchase where ...)} <br />
     * (購入)purchase by my PURCHASE_ID, named 'purchaseSelf'.
     * @param subQuery The sub-query of PurchaseSelf for 'in-scope'. (NotNull)
     */
    public void inScopePurchaseSelf(SubQuery<PurchaseCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        PurchaseCB cb = new PurchaseCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepPurchaseId_InScopeRelation_PurchaseSelf(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "PURCHASE_ID", "PURCHASE_ID", pp, "purchaseSelf");
    }
    public abstract String keepPurchaseId_InScopeRelation_PurchaseSelf(PurchaseCQ sq);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PURCHASE_REFERRER_ID from white_purchase_referrer where ...)} <br />
     * white_purchase_referrer by PURCHASE_REFERRER_ID, named 'whitePurchaseReferrerAsOne'.
     * @param subQuery The sub-query of WhitePurchaseReferrerAsOne for 'in-scope'. (NotNull)
     */
    public void inScopeWhitePurchaseReferrerAsOne(SubQuery<WhitePurchaseReferrerCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhitePurchaseReferrerCB cb = new WhitePurchaseReferrerCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepPurchaseId_InScopeRelation_WhitePurchaseReferrerAsOne(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "PURCHASE_ID", "PURCHASE_REFERRER_ID", pp, "whitePurchaseReferrerAsOne");
    }
    public abstract String keepPurchaseId_InScopeRelation_WhitePurchaseReferrerAsOne(WhitePurchaseReferrerCQ sq);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PURCHASE_ID from purchase where ...)} <br />
     * (購入)purchase by PURCHASE_ID, named 'purchaseSelfAsOne'.
     * @param subQuery The sub-query of PurchaseSelfAsOne for 'in-scope'. (NotNull)
     */
    public void inScopePurchaseSelfAsOne(SubQuery<PurchaseCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        PurchaseCB cb = new PurchaseCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepPurchaseId_InScopeRelation_PurchaseSelfAsOne(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "PURCHASE_ID", "PURCHASE_ID", pp, "purchaseSelfAsOne");
    }
    public abstract String keepPurchaseId_InScopeRelation_PurchaseSelfAsOne(PurchaseCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PURCHASE_ID from purchase where ...)} <br />
     * (購入)purchase by my PURCHASE_ID, named 'purchaseSelf'.
     * @param subQuery The sub-query of PurchaseSelf for 'not in-scope'. (NotNull)
     */
    public void notInScopePurchaseSelf(SubQuery<PurchaseCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        PurchaseCB cb = new PurchaseCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepPurchaseId_NotInScopeRelation_PurchaseSelf(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "PURCHASE_ID", "PURCHASE_ID", pp, "purchaseSelf");
    }
    public abstract String keepPurchaseId_NotInScopeRelation_PurchaseSelf(PurchaseCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PURCHASE_REFERRER_ID from white_purchase_referrer where ...)} <br />
     * white_purchase_referrer by PURCHASE_REFERRER_ID, named 'whitePurchaseReferrerAsOne'.
     * @param subQuery The sub-query of WhitePurchaseReferrerAsOne for 'not in-scope'. (NotNull)
     */
    public void notInScopeWhitePurchaseReferrerAsOne(SubQuery<WhitePurchaseReferrerCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhitePurchaseReferrerCB cb = new WhitePurchaseReferrerCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepPurchaseId_NotInScopeRelation_WhitePurchaseReferrerAsOne(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "PURCHASE_ID", "PURCHASE_REFERRER_ID", pp, "whitePurchaseReferrerAsOne");
    }
    public abstract String keepPurchaseId_NotInScopeRelation_WhitePurchaseReferrerAsOne(WhitePurchaseReferrerCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PURCHASE_ID from purchase where ...)} <br />
     * (購入)purchase by PURCHASE_ID, named 'purchaseSelfAsOne'.
     * @param subQuery The sub-query of PurchaseSelfAsOne for 'not in-scope'. (NotNull)
     */
    public void notInScopePurchaseSelfAsOne(SubQuery<PurchaseCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        PurchaseCB cb = new PurchaseCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepPurchaseId_NotInScopeRelation_PurchaseSelfAsOne(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "PURCHASE_ID", "PURCHASE_ID", pp, "purchaseSelfAsOne");
    }
    public abstract String keepPurchaseId_NotInScopeRelation_PurchaseSelfAsOne(PurchaseCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * (購入ID)PURCHASE_ID: {PK, ID, NotNull, BIGINT(19), FK to PURCHASE}
     */
    public void setPurchaseId_IsNull() { regPurchaseId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * (購入ID)PURCHASE_ID: {PK, ID, NotNull, BIGINT(19), FK to PURCHASE}
     */
    public void setPurchaseId_IsNotNull() { regPurchaseId(CK_ISNN, DOBJ); }

    protected void regPurchaseId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValuePurchaseId(), "PURCHASE_ID"); }
    protected abstract ConditionValue getCValuePurchaseId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {UQ, IX, NotNull, INT(10), FK to member}
     * @param memberId The value of memberId as equal. (NullAllowed: if null, no condition)
     */
    public void setMemberId_Equal(Integer memberId) {
        doSetMemberId_Equal(memberId);
    }

    protected void doSetMemberId_Equal(Integer memberId) {
        regMemberId(CK_EQ, memberId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {UQ, IX, NotNull, INT(10), FK to member}
     * @param memberId The value of memberId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setMemberId_GreaterThan(Integer memberId) {
        regMemberId(CK_GT, memberId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {UQ, IX, NotNull, INT(10), FK to member}
     * @param memberId The value of memberId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setMemberId_LessThan(Integer memberId) {
        regMemberId(CK_LT, memberId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {UQ, IX, NotNull, INT(10), FK to member}
     * @param memberId The value of memberId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setMemberId_GreaterEqual(Integer memberId) {
        regMemberId(CK_GE, memberId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {UQ, IX, NotNull, INT(10), FK to member}
     * @param memberId The value of memberId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setMemberId_LessEqual(Integer memberId) {
        regMemberId(CK_LE, memberId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {UQ, IX, NotNull, INT(10), FK to member}
     * @param minNumber The min number of memberId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of memberId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMemberId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueMemberId(), "MEMBER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (会員ID)MEMBER_ID: {UQ, IX, NotNull, INT(10), FK to member}
     * @param memberIdList The collection of memberId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberId_InScope(Collection<Integer> memberIdList) {
        doSetMemberId_InScope(memberIdList);
    }

    protected void doSetMemberId_InScope(Collection<Integer> memberIdList) {
        regINS(CK_INS, cTL(memberIdList), getCValueMemberId(), "MEMBER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (会員ID)MEMBER_ID: {UQ, IX, NotNull, INT(10), FK to member}
     * @param memberIdList The collection of memberId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberId_NotInScope(Collection<Integer> memberIdList) {
        doSetMemberId_NotInScope(memberIdList);
    }

    protected void doSetMemberId_NotInScope(Collection<Integer> memberIdList) {
        regINS(CK_NINS, cTL(memberIdList), getCValueMemberId(), "MEMBER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select MEMBER_ID from member where ...)} <br />
     * (会員)member by my MEMBER_ID, named 'member'.
     * @param subQuery The sub-query of Member for 'in-scope'. (NotNull)
     */
    public void inScopeMember(SubQuery<MemberCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        MemberCB cb = new MemberCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepMemberId_InScopeRelation_Member(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "member");
    }
    public abstract String keepMemberId_InScopeRelation_Member(MemberCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select MEMBER_ID from member where ...)} <br />
     * (会員)member by my MEMBER_ID, named 'member'.
     * @param subQuery The sub-query of Member for 'not in-scope'. (NotNull)
     */
    public void notInScopeMember(SubQuery<MemberCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        MemberCB cb = new MemberCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepMemberId_NotInScopeRelation_Member(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "member");
    }
    public abstract String keepMemberId_NotInScopeRelation_Member(MemberCQ sq);

    protected void regMemberId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueMemberId(), "MEMBER_ID"); }
    protected abstract ConditionValue getCValueMemberId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (商品ID)PRODUCT_ID: {UQ+, IX, NotNull, INT(10), FK to product}
     * @param productId The value of productId as equal. (NullAllowed: if null, no condition)
     */
    public void setProductId_Equal(Integer productId) {
        doSetProductId_Equal(productId);
    }

    protected void doSetProductId_Equal(Integer productId) {
        regProductId(CK_EQ, productId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (商品ID)PRODUCT_ID: {UQ+, IX, NotNull, INT(10), FK to product}
     * @param productId The value of productId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setProductId_GreaterThan(Integer productId) {
        regProductId(CK_GT, productId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (商品ID)PRODUCT_ID: {UQ+, IX, NotNull, INT(10), FK to product}
     * @param productId The value of productId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setProductId_LessThan(Integer productId) {
        regProductId(CK_LT, productId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (商品ID)PRODUCT_ID: {UQ+, IX, NotNull, INT(10), FK to product}
     * @param productId The value of productId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setProductId_GreaterEqual(Integer productId) {
        regProductId(CK_GE, productId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (商品ID)PRODUCT_ID: {UQ+, IX, NotNull, INT(10), FK to product}
     * @param productId The value of productId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setProductId_LessEqual(Integer productId) {
        regProductId(CK_LE, productId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (商品ID)PRODUCT_ID: {UQ+, IX, NotNull, INT(10), FK to product}
     * @param minNumber The min number of productId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of productId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setProductId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueProductId(), "PRODUCT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (商品ID)PRODUCT_ID: {UQ+, IX, NotNull, INT(10), FK to product}
     * @param productIdList The collection of productId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductId_InScope(Collection<Integer> productIdList) {
        doSetProductId_InScope(productIdList);
    }

    protected void doSetProductId_InScope(Collection<Integer> productIdList) {
        regINS(CK_INS, cTL(productIdList), getCValueProductId(), "PRODUCT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (商品ID)PRODUCT_ID: {UQ+, IX, NotNull, INT(10), FK to product}
     * @param productIdList The collection of productId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductId_NotInScope(Collection<Integer> productIdList) {
        doSetProductId_NotInScope(productIdList);
    }

    protected void doSetProductId_NotInScope(Collection<Integer> productIdList) {
        regINS(CK_NINS, cTL(productIdList), getCValueProductId(), "PRODUCT_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PRODUCT_ID from product where ...)} <br />
     * (商品)product by my PRODUCT_ID, named 'product'.
     * @param subQuery The sub-query of Product for 'in-scope'. (NotNull)
     */
    public void inScopeProduct(SubQuery<ProductCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        ProductCB cb = new ProductCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepProductId_InScopeRelation_Product(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "product");
    }
    public abstract String keepProductId_InScopeRelation_Product(ProductCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PRODUCT_ID from product where ...)} <br />
     * (商品)product by my PRODUCT_ID, named 'product'.
     * @param subQuery The sub-query of Product for 'not in-scope'. (NotNull)
     */
    public void notInScopeProduct(SubQuery<ProductCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        ProductCB cb = new ProductCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepProductId_NotInScopeRelation_Product(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "product");
    }
    public abstract String keepProductId_NotInScopeRelation_Product(ProductCQ sq);

    protected void regProductId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueProductId(), "PRODUCT_ID"); }
    protected abstract ConditionValue getCValueProductId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入日時)PURCHASE_DATETIME: {UQ+, IX, NotNull, DATETIME(19)}
     * @param purchaseDatetime The value of purchaseDatetime as equal. (NullAllowed: if null, no condition)
     */
    public void setPurchaseDatetime_Equal(java.sql.Timestamp purchaseDatetime) {
        regPurchaseDatetime(CK_EQ,  purchaseDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入日時)PURCHASE_DATETIME: {UQ+, IX, NotNull, DATETIME(19)}
     * @param purchaseDatetime The value of purchaseDatetime as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setPurchaseDatetime_GreaterThan(java.sql.Timestamp purchaseDatetime) {
        regPurchaseDatetime(CK_GT,  purchaseDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入日時)PURCHASE_DATETIME: {UQ+, IX, NotNull, DATETIME(19)}
     * @param purchaseDatetime The value of purchaseDatetime as lessThan. (NullAllowed: if null, no condition)
     */
    public void setPurchaseDatetime_LessThan(java.sql.Timestamp purchaseDatetime) {
        regPurchaseDatetime(CK_LT,  purchaseDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入日時)PURCHASE_DATETIME: {UQ+, IX, NotNull, DATETIME(19)}
     * @param purchaseDatetime The value of purchaseDatetime as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setPurchaseDatetime_GreaterEqual(java.sql.Timestamp purchaseDatetime) {
        regPurchaseDatetime(CK_GE,  purchaseDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入日時)PURCHASE_DATETIME: {UQ+, IX, NotNull, DATETIME(19)}
     * @param purchaseDatetime The value of purchaseDatetime as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setPurchaseDatetime_LessEqual(java.sql.Timestamp purchaseDatetime) {
        regPurchaseDatetime(CK_LE, purchaseDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (購入日時)PURCHASE_DATETIME: {UQ+, IX, NotNull, DATETIME(19)}
     * <pre>e.g. setPurchaseDatetime_FromTo(fromDate, toDate, new <span style="color: #FD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of purchaseDatetime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of purchaseDatetime. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setPurchaseDatetime_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), getCValuePurchaseDatetime(), "PURCHASE_DATETIME", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (購入日時)PURCHASE_DATETIME: {UQ+, IX, NotNull, DATETIME(19)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #FD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of purchaseDatetime. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of purchaseDatetime. (NullAllowed: if null, no to-condition)
     */
    public void setPurchaseDatetime_DateFromTo(Date fromDate, Date toDate) {
        setPurchaseDatetime_FromTo(fromDate, toDate, new FromToOption().compareAsDate());
    }

    protected void regPurchaseDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, getCValuePurchaseDatetime(), "PURCHASE_DATETIME"); }
    protected abstract ConditionValue getCValuePurchaseDatetime();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入数量)PURCHASE_COUNT: {NotNull, INT(10)}
     * @param purchaseCount The value of purchaseCount as equal. (NullAllowed: if null, no condition)
     */
    public void setPurchaseCount_Equal(Integer purchaseCount) {
        doSetPurchaseCount_Equal(purchaseCount);
    }

    protected void doSetPurchaseCount_Equal(Integer purchaseCount) {
        regPurchaseCount(CK_EQ, purchaseCount);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入数量)PURCHASE_COUNT: {NotNull, INT(10)}
     * @param purchaseCount The value of purchaseCount as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setPurchaseCount_GreaterThan(Integer purchaseCount) {
        regPurchaseCount(CK_GT, purchaseCount);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入数量)PURCHASE_COUNT: {NotNull, INT(10)}
     * @param purchaseCount The value of purchaseCount as lessThan. (NullAllowed: if null, no condition)
     */
    public void setPurchaseCount_LessThan(Integer purchaseCount) {
        regPurchaseCount(CK_LT, purchaseCount);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入数量)PURCHASE_COUNT: {NotNull, INT(10)}
     * @param purchaseCount The value of purchaseCount as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setPurchaseCount_GreaterEqual(Integer purchaseCount) {
        regPurchaseCount(CK_GE, purchaseCount);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入数量)PURCHASE_COUNT: {NotNull, INT(10)}
     * @param purchaseCount The value of purchaseCount as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setPurchaseCount_LessEqual(Integer purchaseCount) {
        regPurchaseCount(CK_LE, purchaseCount);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (購入数量)PURCHASE_COUNT: {NotNull, INT(10)}
     * @param minNumber The min number of purchaseCount. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of purchaseCount. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPurchaseCount_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValuePurchaseCount(), "PURCHASE_COUNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (購入数量)PURCHASE_COUNT: {NotNull, INT(10)}
     * @param purchaseCountList The collection of purchaseCount as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseCount_InScope(Collection<Integer> purchaseCountList) {
        doSetPurchaseCount_InScope(purchaseCountList);
    }

    protected void doSetPurchaseCount_InScope(Collection<Integer> purchaseCountList) {
        regINS(CK_INS, cTL(purchaseCountList), getCValuePurchaseCount(), "PURCHASE_COUNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (購入数量)PURCHASE_COUNT: {NotNull, INT(10)}
     * @param purchaseCountList The collection of purchaseCount as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseCount_NotInScope(Collection<Integer> purchaseCountList) {
        doSetPurchaseCount_NotInScope(purchaseCountList);
    }

    protected void doSetPurchaseCount_NotInScope(Collection<Integer> purchaseCountList) {
        regINS(CK_NINS, cTL(purchaseCountList), getCValuePurchaseCount(), "PURCHASE_COUNT");
    }

    protected void regPurchaseCount(ConditionKey ky, Object vl) { regQ(ky, vl, getCValuePurchaseCount(), "PURCHASE_COUNT"); }
    protected abstract ConditionValue getCValuePurchaseCount();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入価格)PURCHASE_PRICE: {IX, NotNull, INT(10)}
     * @param purchasePrice The value of purchasePrice as equal. (NullAllowed: if null, no condition)
     */
    public void setPurchasePrice_Equal(Integer purchasePrice) {
        doSetPurchasePrice_Equal(purchasePrice);
    }

    protected void doSetPurchasePrice_Equal(Integer purchasePrice) {
        regPurchasePrice(CK_EQ, purchasePrice);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入価格)PURCHASE_PRICE: {IX, NotNull, INT(10)}
     * @param purchasePrice The value of purchasePrice as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setPurchasePrice_GreaterThan(Integer purchasePrice) {
        regPurchasePrice(CK_GT, purchasePrice);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入価格)PURCHASE_PRICE: {IX, NotNull, INT(10)}
     * @param purchasePrice The value of purchasePrice as lessThan. (NullAllowed: if null, no condition)
     */
    public void setPurchasePrice_LessThan(Integer purchasePrice) {
        regPurchasePrice(CK_LT, purchasePrice);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入価格)PURCHASE_PRICE: {IX, NotNull, INT(10)}
     * @param purchasePrice The value of purchasePrice as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setPurchasePrice_GreaterEqual(Integer purchasePrice) {
        regPurchasePrice(CK_GE, purchasePrice);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入価格)PURCHASE_PRICE: {IX, NotNull, INT(10)}
     * @param purchasePrice The value of purchasePrice as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setPurchasePrice_LessEqual(Integer purchasePrice) {
        regPurchasePrice(CK_LE, purchasePrice);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (購入価格)PURCHASE_PRICE: {IX, NotNull, INT(10)}
     * @param minNumber The min number of purchasePrice. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of purchasePrice. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPurchasePrice_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValuePurchasePrice(), "PURCHASE_PRICE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (購入価格)PURCHASE_PRICE: {IX, NotNull, INT(10)}
     * @param purchasePriceList The collection of purchasePrice as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchasePrice_InScope(Collection<Integer> purchasePriceList) {
        doSetPurchasePrice_InScope(purchasePriceList);
    }

    protected void doSetPurchasePrice_InScope(Collection<Integer> purchasePriceList) {
        regINS(CK_INS, cTL(purchasePriceList), getCValuePurchasePrice(), "PURCHASE_PRICE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (購入価格)PURCHASE_PRICE: {IX, NotNull, INT(10)}
     * @param purchasePriceList The collection of purchasePrice as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchasePrice_NotInScope(Collection<Integer> purchasePriceList) {
        doSetPurchasePrice_NotInScope(purchasePriceList);
    }

    protected void doSetPurchasePrice_NotInScope(Collection<Integer> purchasePriceList) {
        regINS(CK_NINS, cTL(purchasePriceList), getCValuePurchasePrice(), "PURCHASE_PRICE");
    }

    protected void regPurchasePrice(ConditionKey ky, Object vl) { regQ(ky, vl, getCValuePurchasePrice(), "PURCHASE_PRICE"); }
    protected abstract ConditionValue getCValuePurchasePrice();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (支払完了フラグ)PAYMENT_COMPLETE_FLG: {NotNull, INT(10), classification=Flg}
     * @param paymentCompleteFlg The value of paymentCompleteFlg as equal. (NullAllowed: if null, no condition)
     */
    public void setPaymentCompleteFlg_Equal(Integer paymentCompleteFlg) {
        doSetPaymentCompleteFlg_Equal(paymentCompleteFlg);
    }

    /**
     * Equal(=). As Flg. And NullIgnored, OnlyOnceRegistered. <br />
     * (支払完了フラグ)PAYMENT_COMPLETE_FLG: {NotNull, INT(10), classification=Flg} <br />
     * フラグを示す
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    public void setPaymentCompleteFlg_Equal_AsFlg(CDef.Flg cdef) {
        doSetPaymentCompleteFlg_Equal(cTNum(cdef != null ? cdef.code() : null, Integer.class));
    }

    /**
     * Equal(=). As True (1). And NullIgnored, OnlyOnceRegistered. <br />
     * はい: 有効を示す
     */
    public void setPaymentCompleteFlg_Equal_True() {
        setPaymentCompleteFlg_Equal_AsFlg(CDef.Flg.True);
    }

    /**
     * Equal(=). As False (0). And NullIgnored, OnlyOnceRegistered. <br />
     * いいえ: 無効を示す
     */
    public void setPaymentCompleteFlg_Equal_False() {
        setPaymentCompleteFlg_Equal_AsFlg(CDef.Flg.False);
    }

    protected void doSetPaymentCompleteFlg_Equal(Integer paymentCompleteFlg) {
        regPaymentCompleteFlg(CK_EQ, paymentCompleteFlg);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (支払完了フラグ)PAYMENT_COMPLETE_FLG: {NotNull, INT(10), classification=Flg}
     * @param paymentCompleteFlgList The collection of paymentCompleteFlg as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPaymentCompleteFlg_InScope(Collection<Integer> paymentCompleteFlgList) {
        doSetPaymentCompleteFlg_InScope(paymentCompleteFlgList);
    }

    /**
     * InScope {in (1, 2)}. As Flg. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (支払完了フラグ)PAYMENT_COMPLETE_FLG: {NotNull, INT(10), classification=Flg} <br />
     * フラグを示す
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setPaymentCompleteFlg_InScope_AsFlg(Collection<CDef.Flg> cdefList) {
        doSetPaymentCompleteFlg_InScope(cTNumL(cdefList, Integer.class));
    }

    protected void doSetPaymentCompleteFlg_InScope(Collection<Integer> paymentCompleteFlgList) {
        regINS(CK_INS, cTL(paymentCompleteFlgList), getCValuePaymentCompleteFlg(), "PAYMENT_COMPLETE_FLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (支払完了フラグ)PAYMENT_COMPLETE_FLG: {NotNull, INT(10), classification=Flg}
     * @param paymentCompleteFlgList The collection of paymentCompleteFlg as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPaymentCompleteFlg_NotInScope(Collection<Integer> paymentCompleteFlgList) {
        doSetPaymentCompleteFlg_NotInScope(paymentCompleteFlgList);
    }

    /**
     * NotInScope {not in (1, 2)}. As Flg. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (支払完了フラグ)PAYMENT_COMPLETE_FLG: {NotNull, INT(10), classification=Flg} <br />
     * フラグを示す
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setPaymentCompleteFlg_NotInScope_AsFlg(Collection<CDef.Flg> cdefList) {
        doSetPaymentCompleteFlg_NotInScope(cTNumL(cdefList, Integer.class));
    }

    protected void doSetPaymentCompleteFlg_NotInScope(Collection<Integer> paymentCompleteFlgList) {
        regINS(CK_NINS, cTL(paymentCompleteFlgList), getCValuePaymentCompleteFlg(), "PAYMENT_COMPLETE_FLG");
    }

    protected void regPaymentCompleteFlg(ConditionKey ky, Object vl) { regQ(ky, vl, getCValuePaymentCompleteFlg(), "PAYMENT_COMPLETE_FLG"); }
    protected abstract ConditionValue getCValuePaymentCompleteFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @param registerDatetime The value of registerDatetime as equal. (NullAllowed: if null, no condition)
     */
    public void setRegisterDatetime_Equal(java.sql.Timestamp registerDatetime) {
        regRegisterDatetime(CK_EQ,  registerDatetime);
    }

    protected void regRegisterDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueRegisterDatetime(), "REGISTER_DATETIME"); }
    protected abstract ConditionValue getCValueRegisterDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * REGISTER_USER: {NotNull, VARCHAR(200)}
     * @param registerUser The value of registerUser as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterUser_Equal(String registerUser) {
        doSetRegisterUser_Equal(fRES(registerUser));
    }

    protected void doSetRegisterUser_Equal(String registerUser) {
        regRegisterUser(CK_EQ, registerUser);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * REGISTER_USER: {NotNull, VARCHAR(200)} <br />
     * <pre>e.g. setRegisterUser_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param registerUser The value of registerUser as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRegisterUser_LikeSearch(String registerUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(registerUser), getCValueRegisterUser(), "REGISTER_USER", likeSearchOption);
    }

    protected void regRegisterUser(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueRegisterUser(), "REGISTER_USER"); }
    protected abstract ConditionValue getCValueRegisterUser();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @param updateDatetime The value of updateDatetime as equal. (NullAllowed: if null, no condition)
     */
    public void setUpdateDatetime_Equal(java.sql.Timestamp updateDatetime) {
        regUpdateDatetime(CK_EQ,  updateDatetime);
    }

    protected void regUpdateDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueUpdateDatetime(), "UPDATE_DATETIME"); }
    protected abstract ConditionValue getCValueUpdateDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * UPDATE_USER: {NotNull, VARCHAR(200)}
     * @param updateUser The value of updateUser as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateUser_Equal(String updateUser) {
        doSetUpdateUser_Equal(fRES(updateUser));
    }

    protected void doSetUpdateUser_Equal(String updateUser) {
        regUpdateUser(CK_EQ, updateUser);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * UPDATE_USER: {NotNull, VARCHAR(200)} <br />
     * <pre>e.g. setUpdateUser_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param updateUser The value of updateUser as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUpdateUser_LikeSearch(String updateUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(updateUser), getCValueUpdateUser(), "UPDATE_USER", likeSearchOption);
    }

    protected void regUpdateUser(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueUpdateUser(), "UPDATE_USER"); }
    protected abstract ConditionValue getCValueUpdateUser();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * VERSION_NO: {NotNull, BIGINT(19)}
     * @param versionNo The value of versionNo as equal. (NullAllowed: if null, no condition)
     */
    public void setVersionNo_Equal(Long versionNo) {
        doSetVersionNo_Equal(versionNo);
    }

    protected void doSetVersionNo_Equal(Long versionNo) {
        regVersionNo(CK_EQ, versionNo);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * VERSION_NO: {NotNull, BIGINT(19)}
     * @param minNumber The min number of versionNo. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of versionNo. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setVersionNo_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueVersionNo(), "VERSION_NO", rangeOfOption);
    }

    protected void regVersionNo(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueVersionNo(), "VERSION_NO"); }
    protected abstract ConditionValue getCValueVersionNo();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<PurchaseCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<PurchaseCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<PurchaseCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<PurchaseCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<PurchaseCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<PurchaseCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<PurchaseCB> xcreateSSQFunction(final String rd) {
        return new HpSSQFunction<PurchaseCB>(new HpSSQSetupper<PurchaseCB>() {
            public void setup(String fn, SubQuery<PurchaseCB> sq, HpSSQOption<PurchaseCB> op) {
                xscalarCondition(fn, sq, rd, op);
            }
        });
    }

    protected void xscalarCondition(String fn, SubQuery<PurchaseCB> sq, String rd, HpSSQOption<PurchaseCB> op) {
        assertObjectNotNull("subQuery", sq);
        PurchaseCB cb = xcreateScalarConditionCB(); sq.query(cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(PurchaseCQ sq);

    protected PurchaseCB xcreateScalarConditionCB() {
        PurchaseCB cb = new PurchaseCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected PurchaseCB xcreateScalarConditionPartitionByCB() {
        PurchaseCB cb = new PurchaseCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<PurchaseCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PurchaseCB cb = new PurchaseCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String pk = "PURCHASE_ID";
        String pp = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(PurchaseCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<PurchaseCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<PurchaseCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<PurchaseCB>(new HpQDRSetupper<PurchaseCB>() {
            public void setup(String fn, SubQuery<PurchaseCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveMyselfDerived(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveMyselfDerived(String fn, SubQuery<PurchaseCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PurchaseCB cb = new PurchaseCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String pk = "PURCHASE_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(PurchaseCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<PurchaseCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        PurchaseCB cb = new PurchaseCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String pp = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(PurchaseCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<PurchaseCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        PurchaseCB cb = new PurchaseCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String pp = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(PurchaseCQ sq);

    // ===================================================================================
    //                                                                    Full Text Search
    //                                                                    ================
    /**
     * Match for full-text search. <br />
     * Bind variable is unused because the condition value should be literal in MySQL.
     * @param textColumn The text column. (NotNull, StringColumn, TargetTableColumn)
     * @param conditionValue The condition value embedded without binding (by MySQL restriction) but escaped. (NullAllowed: if null or empty, no condition)
     * @param modifier The modifier of full-text search. (NullAllowed: If the value is null, No modifier specified)
     */
    public void match(org.seasar.dbflute.dbmeta.info.ColumnInfo textColumn
                    , String conditionValue
                    , org.seasar.dbflute.dbway.WayOfMySQL.FullTextSearchModifier modifier) {
        assertObjectNotNull("textColumn", textColumn);
        match(newArrayList(textColumn), conditionValue, modifier);
    }

    /**
     * Match for full-text search. <br />
     * Bind variable is unused because the condition value should be literal in MySQL.
     * @param textColumnList The list of text column. (NotNull, NotEmpty, StringColumn, TargetTableColumn)
     * @param conditionValue The condition value embedded without binding (by MySQL restriction) but escaped. (NullAllowed: if null or empty, no condition)
     * @param modifier The modifier of full-text search. (NullAllowed: If the value is null, no modifier specified)
     */
    public void match(List<org.seasar.dbflute.dbmeta.info.ColumnInfo> textColumnList
                    , String conditionValue
                    , org.seasar.dbflute.dbway.WayOfMySQL.FullTextSearchModifier modifier) {
        xdoMatchForMySQL(textColumnList, conditionValue, modifier);
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCB() { return PurchaseCB.class.getName(); }
    protected String xabCQ() { return PurchaseCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
