package com.example.dbflute.tricky.dbflute.cbean.cq.bs;

import java.util.*;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.dbmeta.DBMetaProvider;
import com.example.dbflute.tricky.dbflute.allcommon.*;
import com.example.dbflute.tricky.dbflute.cbean.*;
import com.example.dbflute.tricky.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of PURCHASE.
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
        return "PURCHASE";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * PURCHASE_ID: {PK, ID, NotNull, INTEGER(2000000000, 10)}
     * @param purchaseId The value of purchaseId as equal. (NullAllowed: if null, no condition)
     */
    public void setPurchaseId_Equal(Integer purchaseId) {
        doSetPurchaseId_Equal(purchaseId);
    }

    protected void doSetPurchaseId_Equal(Integer purchaseId) {
        regPurchaseId(CK_EQ, purchaseId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * PURCHASE_ID: {PK, ID, NotNull, INTEGER(2000000000, 10)}
     * @param purchaseId The value of purchaseId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setPurchaseId_GreaterThan(Integer purchaseId) {
        regPurchaseId(CK_GT, purchaseId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * PURCHASE_ID: {PK, ID, NotNull, INTEGER(2000000000, 10)}
     * @param purchaseId The value of purchaseId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setPurchaseId_LessThan(Integer purchaseId) {
        regPurchaseId(CK_LT, purchaseId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * PURCHASE_ID: {PK, ID, NotNull, INTEGER(2000000000, 10)}
     * @param purchaseId The value of purchaseId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setPurchaseId_GreaterEqual(Integer purchaseId) {
        regPurchaseId(CK_GE, purchaseId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * PURCHASE_ID: {PK, ID, NotNull, INTEGER(2000000000, 10)}
     * @param purchaseId The value of purchaseId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setPurchaseId_LessEqual(Integer purchaseId) {
        regPurchaseId(CK_LE, purchaseId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * PURCHASE_ID: {PK, ID, NotNull, INTEGER(2000000000, 10)}
     * @param minNumber The min number of purchaseId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of purchaseId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPurchaseId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValuePurchaseId(), "PURCHASE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * PURCHASE_ID: {PK, ID, NotNull, INTEGER(2000000000, 10)}
     * @param purchaseIdList The collection of purchaseId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseId_InScope(Collection<Integer> purchaseIdList) {
        doSetPurchaseId_InScope(purchaseIdList);
    }

    protected void doSetPurchaseId_InScope(Collection<Integer> purchaseIdList) {
        regINS(CK_INS, cTL(purchaseIdList), getCValuePurchaseId(), "PURCHASE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * PURCHASE_ID: {PK, ID, NotNull, INTEGER(2000000000, 10)}
     * @param purchaseIdList The collection of purchaseId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseId_NotInScope(Collection<Integer> purchaseIdList) {
        doSetPurchaseId_NotInScope(purchaseIdList);
    }

    protected void doSetPurchaseId_NotInScope(Collection<Integer> purchaseIdList) {
        regINS(CK_NINS, cTL(purchaseIdList), getCValuePurchaseId(), "PURCHASE_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * PURCHASE_ID: {PK, ID, NotNull, INTEGER(2000000000, 10)}
     */
    public void setPurchaseId_IsNull() { regPurchaseId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * PURCHASE_ID: {PK, ID, NotNull, INTEGER(2000000000, 10)}
     */
    public void setPurchaseId_IsNotNull() { regPurchaseId(CK_ISNN, DOBJ); }

    protected void regPurchaseId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValuePurchaseId(), "PURCHASE_ID"); }
    protected abstract ConditionValue getCValuePurchaseId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ID: {NotNull, INTEGER(2000000000, 10), FK to MEMBER}
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
     * MEMBER_ID: {NotNull, INTEGER(2000000000, 10), FK to MEMBER}
     * @param memberId The value of memberId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setMemberId_GreaterThan(Integer memberId) {
        regMemberId(CK_GT, memberId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ID: {NotNull, INTEGER(2000000000, 10), FK to MEMBER}
     * @param memberId The value of memberId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setMemberId_LessThan(Integer memberId) {
        regMemberId(CK_LT, memberId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ID: {NotNull, INTEGER(2000000000, 10), FK to MEMBER}
     * @param memberId The value of memberId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setMemberId_GreaterEqual(Integer memberId) {
        regMemberId(CK_GE, memberId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ID: {NotNull, INTEGER(2000000000, 10), FK to MEMBER}
     * @param memberId The value of memberId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setMemberId_LessEqual(Integer memberId) {
        regMemberId(CK_LE, memberId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ID: {NotNull, INTEGER(2000000000, 10), FK to MEMBER}
     * @param minNumber The min number of memberId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of memberId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMemberId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueMemberId(), "MEMBER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * MEMBER_ID: {NotNull, INTEGER(2000000000, 10), FK to MEMBER}
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
     * MEMBER_ID: {NotNull, INTEGER(2000000000, 10), FK to MEMBER}
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
     * {in (select MEMBER_ID from MEMBER where ...)} <br />
     * MEMBER by my MEMBER_ID, named 'member'.
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
     * {not in (select MEMBER_ID from MEMBER where ...)} <br />
     * MEMBER by my MEMBER_ID, named 'member'.
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
     * PRODUCT_ID: {NotNull, INTEGER(2000000000, 10), FK to PRODUCT}
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
     * PRODUCT_ID: {NotNull, INTEGER(2000000000, 10), FK to PRODUCT}
     * @param productId The value of productId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setProductId_GreaterThan(Integer productId) {
        regProductId(CK_GT, productId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * PRODUCT_ID: {NotNull, INTEGER(2000000000, 10), FK to PRODUCT}
     * @param productId The value of productId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setProductId_LessThan(Integer productId) {
        regProductId(CK_LT, productId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * PRODUCT_ID: {NotNull, INTEGER(2000000000, 10), FK to PRODUCT}
     * @param productId The value of productId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setProductId_GreaterEqual(Integer productId) {
        regProductId(CK_GE, productId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * PRODUCT_ID: {NotNull, INTEGER(2000000000, 10), FK to PRODUCT}
     * @param productId The value of productId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setProductId_LessEqual(Integer productId) {
        regProductId(CK_LE, productId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * PRODUCT_ID: {NotNull, INTEGER(2000000000, 10), FK to PRODUCT}
     * @param minNumber The min number of productId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of productId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setProductId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueProductId(), "PRODUCT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * PRODUCT_ID: {NotNull, INTEGER(2000000000, 10), FK to PRODUCT}
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
     * PRODUCT_ID: {NotNull, INTEGER(2000000000, 10), FK to PRODUCT}
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
     * {in (select PRODUCT_ID from PRODUCT where ...)} <br />
     * PRODUCT by my PRODUCT_ID, named 'product'.
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
     * {not in (select PRODUCT_ID from PRODUCT where ...)} <br />
     * PRODUCT by my PRODUCT_ID, named 'product'.
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
     * PURCHASE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @param purchaseDatetime The value of purchaseDatetime as equal. (NullAllowed: if null, no condition)
     */
    public void setPurchaseDatetime_Equal(java.sql.Timestamp purchaseDatetime) {
        regPurchaseDatetime(CK_EQ,  purchaseDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * PURCHASE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @param purchaseDatetime The value of purchaseDatetime as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setPurchaseDatetime_GreaterThan(java.sql.Timestamp purchaseDatetime) {
        regPurchaseDatetime(CK_GT,  purchaseDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * PURCHASE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @param purchaseDatetime The value of purchaseDatetime as lessThan. (NullAllowed: if null, no condition)
     */
    public void setPurchaseDatetime_LessThan(java.sql.Timestamp purchaseDatetime) {
        regPurchaseDatetime(CK_LT,  purchaseDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * PURCHASE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @param purchaseDatetime The value of purchaseDatetime as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setPurchaseDatetime_GreaterEqual(java.sql.Timestamp purchaseDatetime) {
        regPurchaseDatetime(CK_GE,  purchaseDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * PURCHASE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @param purchaseDatetime The value of purchaseDatetime as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setPurchaseDatetime_LessEqual(java.sql.Timestamp purchaseDatetime) {
        regPurchaseDatetime(CK_LE, purchaseDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * PURCHASE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
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
     * PURCHASE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
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

    /**
     * InScope {in ('1965-03-03', '1966-09-15')}. And NullOrEmptyIgnored, NullElementIgnored, SeveralRegistered. <br />
     * PURCHASE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @param purchaseDatetimeList The collection of purchaseDatetime as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseDatetime_InScope(Collection<java.sql.Timestamp> purchaseDatetimeList) {
        doSetPurchaseDatetime_InScope(purchaseDatetimeList);
    }

    protected void doSetPurchaseDatetime_InScope(Collection<java.sql.Timestamp> purchaseDatetimeList) {
        regINS(CK_INS, cTL(purchaseDatetimeList), getCValuePurchaseDatetime(), "PURCHASE_DATETIME");
    }

    /**
     * NotInScope {not in ('1965-03-03', '1966-09-15')}. And NullOrEmptyIgnored, NullElementIgnored, SeveralRegistered. <br />
     * PURCHASE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @param purchaseDatetimeList The collection of purchaseDatetime as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseDatetime_NotInScope(Collection<java.sql.Timestamp> purchaseDatetimeList) {
        doSetPurchaseDatetime_NotInScope(purchaseDatetimeList);
    }

    protected void doSetPurchaseDatetime_NotInScope(Collection<java.sql.Timestamp> purchaseDatetimeList) {
        regINS(CK_NINS, cTL(purchaseDatetimeList), getCValuePurchaseDatetime(), "PURCHASE_DATETIME");
    }

    protected void regPurchaseDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, getCValuePurchaseDatetime(), "PURCHASE_DATETIME"); }
    protected abstract ConditionValue getCValuePurchaseDatetime();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * PURCHASE_COUNT: {NotNull, INTEGER(2000000000, 10)}
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
     * PURCHASE_COUNT: {NotNull, INTEGER(2000000000, 10)}
     * @param purchaseCount The value of purchaseCount as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setPurchaseCount_GreaterThan(Integer purchaseCount) {
        regPurchaseCount(CK_GT, purchaseCount);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * PURCHASE_COUNT: {NotNull, INTEGER(2000000000, 10)}
     * @param purchaseCount The value of purchaseCount as lessThan. (NullAllowed: if null, no condition)
     */
    public void setPurchaseCount_LessThan(Integer purchaseCount) {
        regPurchaseCount(CK_LT, purchaseCount);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * PURCHASE_COUNT: {NotNull, INTEGER(2000000000, 10)}
     * @param purchaseCount The value of purchaseCount as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setPurchaseCount_GreaterEqual(Integer purchaseCount) {
        regPurchaseCount(CK_GE, purchaseCount);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * PURCHASE_COUNT: {NotNull, INTEGER(2000000000, 10)}
     * @param purchaseCount The value of purchaseCount as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setPurchaseCount_LessEqual(Integer purchaseCount) {
        regPurchaseCount(CK_LE, purchaseCount);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * PURCHASE_COUNT: {NotNull, INTEGER(2000000000, 10)}
     * @param minNumber The min number of purchaseCount. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of purchaseCount. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPurchaseCount_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValuePurchaseCount(), "PURCHASE_COUNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * PURCHASE_COUNT: {NotNull, INTEGER(2000000000, 10)}
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
     * PURCHASE_COUNT: {NotNull, INTEGER(2000000000, 10)}
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
     * PURCHASE_PRICE: {NotNull, INTEGER(2000000000, 10)}
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
     * PURCHASE_PRICE: {NotNull, INTEGER(2000000000, 10)}
     * @param purchasePrice The value of purchasePrice as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setPurchasePrice_GreaterThan(Integer purchasePrice) {
        regPurchasePrice(CK_GT, purchasePrice);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * PURCHASE_PRICE: {NotNull, INTEGER(2000000000, 10)}
     * @param purchasePrice The value of purchasePrice as lessThan. (NullAllowed: if null, no condition)
     */
    public void setPurchasePrice_LessThan(Integer purchasePrice) {
        regPurchasePrice(CK_LT, purchasePrice);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * PURCHASE_PRICE: {NotNull, INTEGER(2000000000, 10)}
     * @param purchasePrice The value of purchasePrice as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setPurchasePrice_GreaterEqual(Integer purchasePrice) {
        regPurchasePrice(CK_GE, purchasePrice);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * PURCHASE_PRICE: {NotNull, INTEGER(2000000000, 10)}
     * @param purchasePrice The value of purchasePrice as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setPurchasePrice_LessEqual(Integer purchasePrice) {
        regPurchasePrice(CK_LE, purchasePrice);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * PURCHASE_PRICE: {NotNull, INTEGER(2000000000, 10)}
     * @param minNumber The min number of purchasePrice. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of purchasePrice. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPurchasePrice_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValuePurchasePrice(), "PURCHASE_PRICE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * PURCHASE_PRICE: {NotNull, INTEGER(2000000000, 10)}
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
     * PURCHASE_PRICE: {NotNull, INTEGER(2000000000, 10)}
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
     * PAYMENT_COMPLETE_FLG: {NotNull, INTEGER(2000000000, 10), classification=Flg}
     * @param paymentCompleteFlg The value of paymentCompleteFlg as equal. (NullAllowed: if null, no condition)
     */
    public void setPaymentCompleteFlg_Equal(Integer paymentCompleteFlg) {
        doSetPaymentCompleteFlg_Equal(paymentCompleteFlg);
    }

    /**
     * Equal(=). As Flg. And NullIgnored, OnlyOnceRegistered. <br />
     * PAYMENT_COMPLETE_FLG: {NotNull, INTEGER(2000000000, 10), classification=Flg} <br />
     * general boolean classification for every flg-column
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    public void setPaymentCompleteFlg_Equal_AsFlg(CDef.Flg cdef) {
        doSetPaymentCompleteFlg_Equal(cTNum(cdef != null ? cdef.code() : null, Integer.class));
    }

    /**
     * Equal(=). As True (1). And NullIgnored, OnlyOnceRegistered. <br />
     * Yes: means valid
     */
    public void setPaymentCompleteFlg_Equal_True() {
        setPaymentCompleteFlg_Equal_AsFlg(CDef.Flg.True);
    }

    /**
     * Equal(=). As False (0). And NullIgnored, OnlyOnceRegistered. <br />
     * No: means invalid
     */
    public void setPaymentCompleteFlg_Equal_False() {
        setPaymentCompleteFlg_Equal_AsFlg(CDef.Flg.False);
    }

    protected void doSetPaymentCompleteFlg_Equal(Integer paymentCompleteFlg) {
        regPaymentCompleteFlg(CK_EQ, paymentCompleteFlg);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * PAYMENT_COMPLETE_FLG: {NotNull, INTEGER(2000000000, 10), classification=Flg}
     * @param paymentCompleteFlgList The collection of paymentCompleteFlg as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPaymentCompleteFlg_InScope(Collection<Integer> paymentCompleteFlgList) {
        doSetPaymentCompleteFlg_InScope(paymentCompleteFlgList);
    }

    /**
     * InScope {in (1, 2)}. As Flg. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * PAYMENT_COMPLETE_FLG: {NotNull, INTEGER(2000000000, 10), classification=Flg} <br />
     * general boolean classification for every flg-column
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
     * PAYMENT_COMPLETE_FLG: {NotNull, INTEGER(2000000000, 10), classification=Flg}
     * @param paymentCompleteFlgList The collection of paymentCompleteFlg as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPaymentCompleteFlg_NotInScope(Collection<Integer> paymentCompleteFlgList) {
        doSetPaymentCompleteFlg_NotInScope(paymentCompleteFlgList);
    }

    /**
     * NotInScope {not in (1, 2)}. As Flg. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * PAYMENT_COMPLETE_FLG: {NotNull, INTEGER(2000000000, 10), classification=Flg} <br />
     * general boolean classification for every flg-column
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
     * PURCHASE_REGISTER_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @param purchaseRegisterDatetime The value of purchaseRegisterDatetime as equal. (NullAllowed: if null, no condition)
     */
    public void setPurchaseRegisterDatetime_Equal(java.sql.Timestamp purchaseRegisterDatetime) {
        regPurchaseRegisterDatetime(CK_EQ,  purchaseRegisterDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * PURCHASE_REGISTER_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @param purchaseRegisterDatetime The value of purchaseRegisterDatetime as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setPurchaseRegisterDatetime_GreaterThan(java.sql.Timestamp purchaseRegisterDatetime) {
        regPurchaseRegisterDatetime(CK_GT,  purchaseRegisterDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * PURCHASE_REGISTER_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @param purchaseRegisterDatetime The value of purchaseRegisterDatetime as lessThan. (NullAllowed: if null, no condition)
     */
    public void setPurchaseRegisterDatetime_LessThan(java.sql.Timestamp purchaseRegisterDatetime) {
        regPurchaseRegisterDatetime(CK_LT,  purchaseRegisterDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * PURCHASE_REGISTER_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @param purchaseRegisterDatetime The value of purchaseRegisterDatetime as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setPurchaseRegisterDatetime_GreaterEqual(java.sql.Timestamp purchaseRegisterDatetime) {
        regPurchaseRegisterDatetime(CK_GE,  purchaseRegisterDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * PURCHASE_REGISTER_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @param purchaseRegisterDatetime The value of purchaseRegisterDatetime as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setPurchaseRegisterDatetime_LessEqual(java.sql.Timestamp purchaseRegisterDatetime) {
        regPurchaseRegisterDatetime(CK_LE, purchaseRegisterDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * PURCHASE_REGISTER_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * <pre>e.g. setPurchaseRegisterDatetime_FromTo(fromDate, toDate, new <span style="color: #FD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of purchaseRegisterDatetime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of purchaseRegisterDatetime. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setPurchaseRegisterDatetime_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), getCValuePurchaseRegisterDatetime(), "PURCHASE_REGISTER_DATETIME", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * PURCHASE_REGISTER_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #FD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of purchaseRegisterDatetime. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of purchaseRegisterDatetime. (NullAllowed: if null, no to-condition)
     */
    public void setPurchaseRegisterDatetime_DateFromTo(Date fromDate, Date toDate) {
        setPurchaseRegisterDatetime_FromTo(fromDate, toDate, new FromToOption().compareAsDate());
    }

    /**
     * InScope {in ('1965-03-03', '1966-09-15')}. And NullOrEmptyIgnored, NullElementIgnored, SeveralRegistered. <br />
     * PURCHASE_REGISTER_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @param purchaseRegisterDatetimeList The collection of purchaseRegisterDatetime as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseRegisterDatetime_InScope(Collection<java.sql.Timestamp> purchaseRegisterDatetimeList) {
        doSetPurchaseRegisterDatetime_InScope(purchaseRegisterDatetimeList);
    }

    protected void doSetPurchaseRegisterDatetime_InScope(Collection<java.sql.Timestamp> purchaseRegisterDatetimeList) {
        regINS(CK_INS, cTL(purchaseRegisterDatetimeList), getCValuePurchaseRegisterDatetime(), "PURCHASE_REGISTER_DATETIME");
    }

    /**
     * NotInScope {not in ('1965-03-03', '1966-09-15')}. And NullOrEmptyIgnored, NullElementIgnored, SeveralRegistered. <br />
     * PURCHASE_REGISTER_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @param purchaseRegisterDatetimeList The collection of purchaseRegisterDatetime as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseRegisterDatetime_NotInScope(Collection<java.sql.Timestamp> purchaseRegisterDatetimeList) {
        doSetPurchaseRegisterDatetime_NotInScope(purchaseRegisterDatetimeList);
    }

    protected void doSetPurchaseRegisterDatetime_NotInScope(Collection<java.sql.Timestamp> purchaseRegisterDatetimeList) {
        regINS(CK_NINS, cTL(purchaseRegisterDatetimeList), getCValuePurchaseRegisterDatetime(), "PURCHASE_REGISTER_DATETIME");
    }

    protected void regPurchaseRegisterDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, getCValuePurchaseRegisterDatetime(), "PURCHASE_REGISTER_DATETIME"); }
    protected abstract ConditionValue getCValuePurchaseRegisterDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * PURCHASE_REGISTER_USER: {NotNull, TEXT(2000000000, 10)}
     * @param purchaseRegisterUser The value of purchaseRegisterUser as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseRegisterUser_Equal(String purchaseRegisterUser) {
        doSetPurchaseRegisterUser_Equal(fRES(purchaseRegisterUser));
    }

    protected void doSetPurchaseRegisterUser_Equal(String purchaseRegisterUser) {
        regPurchaseRegisterUser(CK_EQ, purchaseRegisterUser);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * PURCHASE_REGISTER_USER: {NotNull, TEXT(2000000000, 10)}
     * @param purchaseRegisterUser The value of purchaseRegisterUser as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseRegisterUser_NotEqual(String purchaseRegisterUser) {
        doSetPurchaseRegisterUser_NotEqual(fRES(purchaseRegisterUser));
    }

    protected void doSetPurchaseRegisterUser_NotEqual(String purchaseRegisterUser) {
        regPurchaseRegisterUser(CK_NES, purchaseRegisterUser);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * PURCHASE_REGISTER_USER: {NotNull, TEXT(2000000000, 10)}
     * @param purchaseRegisterUserList The collection of purchaseRegisterUser as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseRegisterUser_InScope(Collection<String> purchaseRegisterUserList) {
        doSetPurchaseRegisterUser_InScope(purchaseRegisterUserList);
    }

    public void doSetPurchaseRegisterUser_InScope(Collection<String> purchaseRegisterUserList) {
        regINS(CK_INS, cTL(purchaseRegisterUserList), getCValuePurchaseRegisterUser(), "PURCHASE_REGISTER_USER");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * PURCHASE_REGISTER_USER: {NotNull, TEXT(2000000000, 10)}
     * @param purchaseRegisterUserList The collection of purchaseRegisterUser as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseRegisterUser_NotInScope(Collection<String> purchaseRegisterUserList) {
        doSetPurchaseRegisterUser_NotInScope(purchaseRegisterUserList);
    }

    public void doSetPurchaseRegisterUser_NotInScope(Collection<String> purchaseRegisterUserList) {
        regINS(CK_NINS, cTL(purchaseRegisterUserList), getCValuePurchaseRegisterUser(), "PURCHASE_REGISTER_USER");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PURCHASE_REGISTER_USER: {NotNull, TEXT(2000000000, 10)}
     * @param purchaseRegisterUser The value of purchaseRegisterUser as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseRegisterUser_PrefixSearch(String purchaseRegisterUser) {
        setPurchaseRegisterUser_LikeSearch(purchaseRegisterUser, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PURCHASE_REGISTER_USER: {NotNull, TEXT(2000000000, 10)} <br />
     * <pre>e.g. setPurchaseRegisterUser_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param purchaseRegisterUser The value of purchaseRegisterUser as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPurchaseRegisterUser_LikeSearch(String purchaseRegisterUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(purchaseRegisterUser), getCValuePurchaseRegisterUser(), "PURCHASE_REGISTER_USER", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PURCHASE_REGISTER_USER: {NotNull, TEXT(2000000000, 10)}
     * @param purchaseRegisterUser The value of purchaseRegisterUser as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPurchaseRegisterUser_NotLikeSearch(String purchaseRegisterUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(purchaseRegisterUser), getCValuePurchaseRegisterUser(), "PURCHASE_REGISTER_USER", likeSearchOption);
    }

    protected void regPurchaseRegisterUser(ConditionKey ky, Object vl) { regQ(ky, vl, getCValuePurchaseRegisterUser(), "PURCHASE_REGISTER_USER"); }
    protected abstract ConditionValue getCValuePurchaseRegisterUser();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * PURCHASE_REGISTER_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @param purchaseRegisterProcess The value of purchaseRegisterProcess as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseRegisterProcess_Equal(String purchaseRegisterProcess) {
        doSetPurchaseRegisterProcess_Equal(fRES(purchaseRegisterProcess));
    }

    protected void doSetPurchaseRegisterProcess_Equal(String purchaseRegisterProcess) {
        regPurchaseRegisterProcess(CK_EQ, purchaseRegisterProcess);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * PURCHASE_REGISTER_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @param purchaseRegisterProcess The value of purchaseRegisterProcess as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseRegisterProcess_NotEqual(String purchaseRegisterProcess) {
        doSetPurchaseRegisterProcess_NotEqual(fRES(purchaseRegisterProcess));
    }

    protected void doSetPurchaseRegisterProcess_NotEqual(String purchaseRegisterProcess) {
        regPurchaseRegisterProcess(CK_NES, purchaseRegisterProcess);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * PURCHASE_REGISTER_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @param purchaseRegisterProcessList The collection of purchaseRegisterProcess as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseRegisterProcess_InScope(Collection<String> purchaseRegisterProcessList) {
        doSetPurchaseRegisterProcess_InScope(purchaseRegisterProcessList);
    }

    public void doSetPurchaseRegisterProcess_InScope(Collection<String> purchaseRegisterProcessList) {
        regINS(CK_INS, cTL(purchaseRegisterProcessList), getCValuePurchaseRegisterProcess(), "PURCHASE_REGISTER_PROCESS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * PURCHASE_REGISTER_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @param purchaseRegisterProcessList The collection of purchaseRegisterProcess as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseRegisterProcess_NotInScope(Collection<String> purchaseRegisterProcessList) {
        doSetPurchaseRegisterProcess_NotInScope(purchaseRegisterProcessList);
    }

    public void doSetPurchaseRegisterProcess_NotInScope(Collection<String> purchaseRegisterProcessList) {
        regINS(CK_NINS, cTL(purchaseRegisterProcessList), getCValuePurchaseRegisterProcess(), "PURCHASE_REGISTER_PROCESS");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PURCHASE_REGISTER_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @param purchaseRegisterProcess The value of purchaseRegisterProcess as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseRegisterProcess_PrefixSearch(String purchaseRegisterProcess) {
        setPurchaseRegisterProcess_LikeSearch(purchaseRegisterProcess, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PURCHASE_REGISTER_PROCESS: {NotNull, TEXT(2000000000, 10)} <br />
     * <pre>e.g. setPurchaseRegisterProcess_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param purchaseRegisterProcess The value of purchaseRegisterProcess as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPurchaseRegisterProcess_LikeSearch(String purchaseRegisterProcess, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(purchaseRegisterProcess), getCValuePurchaseRegisterProcess(), "PURCHASE_REGISTER_PROCESS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PURCHASE_REGISTER_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @param purchaseRegisterProcess The value of purchaseRegisterProcess as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPurchaseRegisterProcess_NotLikeSearch(String purchaseRegisterProcess, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(purchaseRegisterProcess), getCValuePurchaseRegisterProcess(), "PURCHASE_REGISTER_PROCESS", likeSearchOption);
    }

    protected void regPurchaseRegisterProcess(ConditionKey ky, Object vl) { regQ(ky, vl, getCValuePurchaseRegisterProcess(), "PURCHASE_REGISTER_PROCESS"); }
    protected abstract ConditionValue getCValuePurchaseRegisterProcess();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * PURCHASE_UPDATE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @param purchaseUpdateDatetime The value of purchaseUpdateDatetime as equal. (NullAllowed: if null, no condition)
     */
    public void setPurchaseUpdateDatetime_Equal(java.sql.Timestamp purchaseUpdateDatetime) {
        regPurchaseUpdateDatetime(CK_EQ,  purchaseUpdateDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * PURCHASE_UPDATE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @param purchaseUpdateDatetime The value of purchaseUpdateDatetime as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setPurchaseUpdateDatetime_GreaterThan(java.sql.Timestamp purchaseUpdateDatetime) {
        regPurchaseUpdateDatetime(CK_GT,  purchaseUpdateDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * PURCHASE_UPDATE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @param purchaseUpdateDatetime The value of purchaseUpdateDatetime as lessThan. (NullAllowed: if null, no condition)
     */
    public void setPurchaseUpdateDatetime_LessThan(java.sql.Timestamp purchaseUpdateDatetime) {
        regPurchaseUpdateDatetime(CK_LT,  purchaseUpdateDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * PURCHASE_UPDATE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @param purchaseUpdateDatetime The value of purchaseUpdateDatetime as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setPurchaseUpdateDatetime_GreaterEqual(java.sql.Timestamp purchaseUpdateDatetime) {
        regPurchaseUpdateDatetime(CK_GE,  purchaseUpdateDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * PURCHASE_UPDATE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @param purchaseUpdateDatetime The value of purchaseUpdateDatetime as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setPurchaseUpdateDatetime_LessEqual(java.sql.Timestamp purchaseUpdateDatetime) {
        regPurchaseUpdateDatetime(CK_LE, purchaseUpdateDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * PURCHASE_UPDATE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * <pre>e.g. setPurchaseUpdateDatetime_FromTo(fromDate, toDate, new <span style="color: #FD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of purchaseUpdateDatetime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of purchaseUpdateDatetime. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setPurchaseUpdateDatetime_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), getCValuePurchaseUpdateDatetime(), "PURCHASE_UPDATE_DATETIME", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * PURCHASE_UPDATE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #FD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of purchaseUpdateDatetime. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of purchaseUpdateDatetime. (NullAllowed: if null, no to-condition)
     */
    public void setPurchaseUpdateDatetime_DateFromTo(Date fromDate, Date toDate) {
        setPurchaseUpdateDatetime_FromTo(fromDate, toDate, new FromToOption().compareAsDate());
    }

    /**
     * InScope {in ('1965-03-03', '1966-09-15')}. And NullOrEmptyIgnored, NullElementIgnored, SeveralRegistered. <br />
     * PURCHASE_UPDATE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @param purchaseUpdateDatetimeList The collection of purchaseUpdateDatetime as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseUpdateDatetime_InScope(Collection<java.sql.Timestamp> purchaseUpdateDatetimeList) {
        doSetPurchaseUpdateDatetime_InScope(purchaseUpdateDatetimeList);
    }

    protected void doSetPurchaseUpdateDatetime_InScope(Collection<java.sql.Timestamp> purchaseUpdateDatetimeList) {
        regINS(CK_INS, cTL(purchaseUpdateDatetimeList), getCValuePurchaseUpdateDatetime(), "PURCHASE_UPDATE_DATETIME");
    }

    /**
     * NotInScope {not in ('1965-03-03', '1966-09-15')}. And NullOrEmptyIgnored, NullElementIgnored, SeveralRegistered. <br />
     * PURCHASE_UPDATE_DATETIME: {NotNull, DATETIME(2000000000, 10)}
     * @param purchaseUpdateDatetimeList The collection of purchaseUpdateDatetime as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseUpdateDatetime_NotInScope(Collection<java.sql.Timestamp> purchaseUpdateDatetimeList) {
        doSetPurchaseUpdateDatetime_NotInScope(purchaseUpdateDatetimeList);
    }

    protected void doSetPurchaseUpdateDatetime_NotInScope(Collection<java.sql.Timestamp> purchaseUpdateDatetimeList) {
        regINS(CK_NINS, cTL(purchaseUpdateDatetimeList), getCValuePurchaseUpdateDatetime(), "PURCHASE_UPDATE_DATETIME");
    }

    protected void regPurchaseUpdateDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, getCValuePurchaseUpdateDatetime(), "PURCHASE_UPDATE_DATETIME"); }
    protected abstract ConditionValue getCValuePurchaseUpdateDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * PURCHASE_UPDATE_USER: {NotNull, TEXT(2000000000, 10)}
     * @param purchaseUpdateUser The value of purchaseUpdateUser as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseUpdateUser_Equal(String purchaseUpdateUser) {
        doSetPurchaseUpdateUser_Equal(fRES(purchaseUpdateUser));
    }

    protected void doSetPurchaseUpdateUser_Equal(String purchaseUpdateUser) {
        regPurchaseUpdateUser(CK_EQ, purchaseUpdateUser);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * PURCHASE_UPDATE_USER: {NotNull, TEXT(2000000000, 10)}
     * @param purchaseUpdateUser The value of purchaseUpdateUser as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseUpdateUser_NotEqual(String purchaseUpdateUser) {
        doSetPurchaseUpdateUser_NotEqual(fRES(purchaseUpdateUser));
    }

    protected void doSetPurchaseUpdateUser_NotEqual(String purchaseUpdateUser) {
        regPurchaseUpdateUser(CK_NES, purchaseUpdateUser);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * PURCHASE_UPDATE_USER: {NotNull, TEXT(2000000000, 10)}
     * @param purchaseUpdateUserList The collection of purchaseUpdateUser as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseUpdateUser_InScope(Collection<String> purchaseUpdateUserList) {
        doSetPurchaseUpdateUser_InScope(purchaseUpdateUserList);
    }

    public void doSetPurchaseUpdateUser_InScope(Collection<String> purchaseUpdateUserList) {
        regINS(CK_INS, cTL(purchaseUpdateUserList), getCValuePurchaseUpdateUser(), "PURCHASE_UPDATE_USER");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * PURCHASE_UPDATE_USER: {NotNull, TEXT(2000000000, 10)}
     * @param purchaseUpdateUserList The collection of purchaseUpdateUser as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseUpdateUser_NotInScope(Collection<String> purchaseUpdateUserList) {
        doSetPurchaseUpdateUser_NotInScope(purchaseUpdateUserList);
    }

    public void doSetPurchaseUpdateUser_NotInScope(Collection<String> purchaseUpdateUserList) {
        regINS(CK_NINS, cTL(purchaseUpdateUserList), getCValuePurchaseUpdateUser(), "PURCHASE_UPDATE_USER");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PURCHASE_UPDATE_USER: {NotNull, TEXT(2000000000, 10)}
     * @param purchaseUpdateUser The value of purchaseUpdateUser as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseUpdateUser_PrefixSearch(String purchaseUpdateUser) {
        setPurchaseUpdateUser_LikeSearch(purchaseUpdateUser, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PURCHASE_UPDATE_USER: {NotNull, TEXT(2000000000, 10)} <br />
     * <pre>e.g. setPurchaseUpdateUser_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param purchaseUpdateUser The value of purchaseUpdateUser as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPurchaseUpdateUser_LikeSearch(String purchaseUpdateUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(purchaseUpdateUser), getCValuePurchaseUpdateUser(), "PURCHASE_UPDATE_USER", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PURCHASE_UPDATE_USER: {NotNull, TEXT(2000000000, 10)}
     * @param purchaseUpdateUser The value of purchaseUpdateUser as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPurchaseUpdateUser_NotLikeSearch(String purchaseUpdateUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(purchaseUpdateUser), getCValuePurchaseUpdateUser(), "PURCHASE_UPDATE_USER", likeSearchOption);
    }

    protected void regPurchaseUpdateUser(ConditionKey ky, Object vl) { regQ(ky, vl, getCValuePurchaseUpdateUser(), "PURCHASE_UPDATE_USER"); }
    protected abstract ConditionValue getCValuePurchaseUpdateUser();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * PURCHASE_UPDATE_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @param purchaseUpdateProcess The value of purchaseUpdateProcess as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseUpdateProcess_Equal(String purchaseUpdateProcess) {
        doSetPurchaseUpdateProcess_Equal(fRES(purchaseUpdateProcess));
    }

    protected void doSetPurchaseUpdateProcess_Equal(String purchaseUpdateProcess) {
        regPurchaseUpdateProcess(CK_EQ, purchaseUpdateProcess);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * PURCHASE_UPDATE_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @param purchaseUpdateProcess The value of purchaseUpdateProcess as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseUpdateProcess_NotEqual(String purchaseUpdateProcess) {
        doSetPurchaseUpdateProcess_NotEqual(fRES(purchaseUpdateProcess));
    }

    protected void doSetPurchaseUpdateProcess_NotEqual(String purchaseUpdateProcess) {
        regPurchaseUpdateProcess(CK_NES, purchaseUpdateProcess);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * PURCHASE_UPDATE_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @param purchaseUpdateProcessList The collection of purchaseUpdateProcess as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseUpdateProcess_InScope(Collection<String> purchaseUpdateProcessList) {
        doSetPurchaseUpdateProcess_InScope(purchaseUpdateProcessList);
    }

    public void doSetPurchaseUpdateProcess_InScope(Collection<String> purchaseUpdateProcessList) {
        regINS(CK_INS, cTL(purchaseUpdateProcessList), getCValuePurchaseUpdateProcess(), "PURCHASE_UPDATE_PROCESS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * PURCHASE_UPDATE_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @param purchaseUpdateProcessList The collection of purchaseUpdateProcess as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseUpdateProcess_NotInScope(Collection<String> purchaseUpdateProcessList) {
        doSetPurchaseUpdateProcess_NotInScope(purchaseUpdateProcessList);
    }

    public void doSetPurchaseUpdateProcess_NotInScope(Collection<String> purchaseUpdateProcessList) {
        regINS(CK_NINS, cTL(purchaseUpdateProcessList), getCValuePurchaseUpdateProcess(), "PURCHASE_UPDATE_PROCESS");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PURCHASE_UPDATE_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @param purchaseUpdateProcess The value of purchaseUpdateProcess as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseUpdateProcess_PrefixSearch(String purchaseUpdateProcess) {
        setPurchaseUpdateProcess_LikeSearch(purchaseUpdateProcess, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PURCHASE_UPDATE_PROCESS: {NotNull, TEXT(2000000000, 10)} <br />
     * <pre>e.g. setPurchaseUpdateProcess_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param purchaseUpdateProcess The value of purchaseUpdateProcess as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPurchaseUpdateProcess_LikeSearch(String purchaseUpdateProcess, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(purchaseUpdateProcess), getCValuePurchaseUpdateProcess(), "PURCHASE_UPDATE_PROCESS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PURCHASE_UPDATE_PROCESS: {NotNull, TEXT(2000000000, 10)}
     * @param purchaseUpdateProcess The value of purchaseUpdateProcess as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPurchaseUpdateProcess_NotLikeSearch(String purchaseUpdateProcess, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(purchaseUpdateProcess), getCValuePurchaseUpdateProcess(), "PURCHASE_UPDATE_PROCESS", likeSearchOption);
    }

    protected void regPurchaseUpdateProcess(ConditionKey ky, Object vl) { regQ(ky, vl, getCValuePurchaseUpdateProcess(), "PURCHASE_UPDATE_PROCESS"); }
    protected abstract ConditionValue getCValuePurchaseUpdateProcess();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * VERSION_NO: {NotNull, INTEGER(2000000000, 10)}
     * @param versionNo The value of versionNo as equal. (NullAllowed: if null, no condition)
     */
    public void setVersionNo_Equal(Integer versionNo) {
        doSetVersionNo_Equal(versionNo);
    }

    protected void doSetVersionNo_Equal(Integer versionNo) {
        regVersionNo(CK_EQ, versionNo);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * VERSION_NO: {NotNull, INTEGER(2000000000, 10)}
     * @param versionNo The value of versionNo as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setVersionNo_GreaterThan(Integer versionNo) {
        regVersionNo(CK_GT, versionNo);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * VERSION_NO: {NotNull, INTEGER(2000000000, 10)}
     * @param versionNo The value of versionNo as lessThan. (NullAllowed: if null, no condition)
     */
    public void setVersionNo_LessThan(Integer versionNo) {
        regVersionNo(CK_LT, versionNo);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * VERSION_NO: {NotNull, INTEGER(2000000000, 10)}
     * @param versionNo The value of versionNo as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setVersionNo_GreaterEqual(Integer versionNo) {
        regVersionNo(CK_GE, versionNo);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * VERSION_NO: {NotNull, INTEGER(2000000000, 10)}
     * @param versionNo The value of versionNo as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setVersionNo_LessEqual(Integer versionNo) {
        regVersionNo(CK_LE, versionNo);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * VERSION_NO: {NotNull, INTEGER(2000000000, 10)}
     * @param minNumber The min number of versionNo. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of versionNo. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setVersionNo_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueVersionNo(), "VERSION_NO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * VERSION_NO: {NotNull, INTEGER(2000000000, 10)}
     * @param versionNoList The collection of versionNo as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setVersionNo_InScope(Collection<Integer> versionNoList) {
        doSetVersionNo_InScope(versionNoList);
    }

    protected void doSetVersionNo_InScope(Collection<Integer> versionNoList) {
        regINS(CK_INS, cTL(versionNoList), getCValueVersionNo(), "VERSION_NO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * VERSION_NO: {NotNull, INTEGER(2000000000, 10)}
     * @param versionNoList The collection of versionNo as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setVersionNo_NotInScope(Collection<Integer> versionNoList) {
        doSetVersionNo_NotInScope(versionNoList);
    }

    protected void doSetVersionNo_NotInScope(Collection<Integer> versionNoList) {
        regINS(CK_NINS, cTL(versionNoList), getCValueVersionNo(), "VERSION_NO");
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
        return xcreateSSQFunction(CK_EQ.getOperand(), PurchaseCB.class);
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
        return xcreateSSQFunction(CK_NES.getOperand(), PurchaseCB.class);
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
        return xcreateSSQFunction(CK_GT.getOperand(), PurchaseCB.class);
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
        return xcreateSSQFunction(CK_LT.getOperand(), PurchaseCB.class);
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
        return xcreateSSQFunction(CK_GE.getOperand(), PurchaseCB.class);
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
        return xcreateSSQFunction(CK_LE.getOperand(), PurchaseCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        PurchaseCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(PurchaseCQ sq);

    protected PurchaseCB xcreateScalarConditionCB() {
        PurchaseCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected PurchaseCB xcreateScalarConditionPartitionByCB() {
        PurchaseCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
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
        return xcreateQDRFunctionMyselfDerived(PurchaseCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PurchaseCB cb = new PurchaseCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
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
    //                                                                       Very Internal
    //                                                                       =============
    protected PurchaseCB newMyCB() {
        return new PurchaseCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return PurchaseCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
