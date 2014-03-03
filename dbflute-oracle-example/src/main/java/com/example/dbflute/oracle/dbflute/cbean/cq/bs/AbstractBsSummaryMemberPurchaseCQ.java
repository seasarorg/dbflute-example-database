package com.example.dbflute.oracle.dbflute.cbean.cq.bs;

import java.util.*;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.dbmeta.DBMetaProvider;
import com.example.dbflute.oracle.dbflute.allcommon.*;
import com.example.dbflute.oracle.dbflute.cbean.*;
import com.example.dbflute.oracle.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of SUMMARY_MEMBER_PURCHASE.
 * @author oracleman
 */
public abstract class AbstractBsSummaryMemberPurchaseCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsSummaryMemberPurchaseCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "SUMMARY_MEMBER_PURCHASE";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ID: {NotNull, NUMBER(16)}
     * @param memberId The value of memberId as equal. (NullAllowed: if null, no condition)
     */
    public void setMemberId_Equal(Long memberId) {
        doSetMemberId_Equal(memberId);
    }

    protected void doSetMemberId_Equal(Long memberId) {
        regMemberId(CK_EQ, memberId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ID: {NotNull, NUMBER(16)}
     * @param memberId The value of memberId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setMemberId_GreaterThan(Long memberId) {
        regMemberId(CK_GT, memberId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ID: {NotNull, NUMBER(16)}
     * @param memberId The value of memberId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setMemberId_LessThan(Long memberId) {
        regMemberId(CK_LT, memberId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ID: {NotNull, NUMBER(16)}
     * @param memberId The value of memberId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setMemberId_GreaterEqual(Long memberId) {
        regMemberId(CK_GE, memberId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ID: {NotNull, NUMBER(16)}
     * @param memberId The value of memberId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setMemberId_LessEqual(Long memberId) {
        regMemberId(CK_LE, memberId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ID: {NotNull, NUMBER(16)}
     * @param minNumber The min number of memberId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of memberId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMemberId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueMemberId(), "MEMBER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * MEMBER_ID: {NotNull, NUMBER(16)}
     * @param memberIdList The collection of memberId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberId_InScope(Collection<Long> memberIdList) {
        doSetMemberId_InScope(memberIdList);
    }

    protected void doSetMemberId_InScope(Collection<Long> memberIdList) {
        regINS(CK_INS, cTL(memberIdList), getCValueMemberId(), "MEMBER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * MEMBER_ID: {NotNull, NUMBER(16)}
     * @param memberIdList The collection of memberId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberId_NotInScope(Collection<Long> memberIdList) {
        doSetMemberId_NotInScope(memberIdList);
    }

    protected void doSetMemberId_NotInScope(Collection<Long> memberIdList) {
        regINS(CK_NINS, cTL(memberIdList), getCValueMemberId(), "MEMBER_ID");
    }

    protected void regMemberId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueMemberId(), "MEMBER_ID"); }
    protected abstract ConditionValue getCValueMemberId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * ALLSUM_PURCHASE_PRICE: {NUMBER(22)}
     * @param allsumPurchasePrice The value of allsumPurchasePrice as equal. (NullAllowed: if null, no condition)
     */
    public void setAllsumPurchasePrice_Equal(java.math.BigDecimal allsumPurchasePrice) {
        doSetAllsumPurchasePrice_Equal(allsumPurchasePrice);
    }

    protected void doSetAllsumPurchasePrice_Equal(java.math.BigDecimal allsumPurchasePrice) {
        regAllsumPurchasePrice(CK_EQ, allsumPurchasePrice);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ALLSUM_PURCHASE_PRICE: {NUMBER(22)}
     * @param allsumPurchasePrice The value of allsumPurchasePrice as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setAllsumPurchasePrice_GreaterThan(java.math.BigDecimal allsumPurchasePrice) {
        regAllsumPurchasePrice(CK_GT, allsumPurchasePrice);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ALLSUM_PURCHASE_PRICE: {NUMBER(22)}
     * @param allsumPurchasePrice The value of allsumPurchasePrice as lessThan. (NullAllowed: if null, no condition)
     */
    public void setAllsumPurchasePrice_LessThan(java.math.BigDecimal allsumPurchasePrice) {
        regAllsumPurchasePrice(CK_LT, allsumPurchasePrice);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * ALLSUM_PURCHASE_PRICE: {NUMBER(22)}
     * @param allsumPurchasePrice The value of allsumPurchasePrice as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setAllsumPurchasePrice_GreaterEqual(java.math.BigDecimal allsumPurchasePrice) {
        regAllsumPurchasePrice(CK_GE, allsumPurchasePrice);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * ALLSUM_PURCHASE_PRICE: {NUMBER(22)}
     * @param allsumPurchasePrice The value of allsumPurchasePrice as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setAllsumPurchasePrice_LessEqual(java.math.BigDecimal allsumPurchasePrice) {
        regAllsumPurchasePrice(CK_LE, allsumPurchasePrice);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * ALLSUM_PURCHASE_PRICE: {NUMBER(22)}
     * @param minNumber The min number of allsumPurchasePrice. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of allsumPurchasePrice. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAllsumPurchasePrice_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueAllsumPurchasePrice(), "ALLSUM_PURCHASE_PRICE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * ALLSUM_PURCHASE_PRICE: {NUMBER(22)}
     * @param allsumPurchasePriceList The collection of allsumPurchasePrice as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setAllsumPurchasePrice_InScope(Collection<java.math.BigDecimal> allsumPurchasePriceList) {
        doSetAllsumPurchasePrice_InScope(allsumPurchasePriceList);
    }

    protected void doSetAllsumPurchasePrice_InScope(Collection<java.math.BigDecimal> allsumPurchasePriceList) {
        regINS(CK_INS, cTL(allsumPurchasePriceList), getCValueAllsumPurchasePrice(), "ALLSUM_PURCHASE_PRICE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * ALLSUM_PURCHASE_PRICE: {NUMBER(22)}
     * @param allsumPurchasePriceList The collection of allsumPurchasePrice as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setAllsumPurchasePrice_NotInScope(Collection<java.math.BigDecimal> allsumPurchasePriceList) {
        doSetAllsumPurchasePrice_NotInScope(allsumPurchasePriceList);
    }

    protected void doSetAllsumPurchasePrice_NotInScope(Collection<java.math.BigDecimal> allsumPurchasePriceList) {
        regINS(CK_NINS, cTL(allsumPurchasePriceList), getCValueAllsumPurchasePrice(), "ALLSUM_PURCHASE_PRICE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * ALLSUM_PURCHASE_PRICE: {NUMBER(22)}
     */
    public void setAllsumPurchasePrice_IsNull() { regAllsumPurchasePrice(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * ALLSUM_PURCHASE_PRICE: {NUMBER(22)}
     */
    public void setAllsumPurchasePrice_IsNotNull() { regAllsumPurchasePrice(CK_ISNN, DOBJ); }

    protected void regAllsumPurchasePrice(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueAllsumPurchasePrice(), "ALLSUM_PURCHASE_PRICE"); }
    protected abstract ConditionValue getCValueAllsumPurchasePrice();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * LATEST_PURCHASE_DATETIME: {TIMESTAMP(3)(11, 3)}
     * @param latestPurchaseDatetime The value of latestPurchaseDatetime as equal. (NullAllowed: if null, no condition)
     */
    public void setLatestPurchaseDatetime_Equal(java.sql.Timestamp latestPurchaseDatetime) {
        regLatestPurchaseDatetime(CK_EQ,  latestPurchaseDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * LATEST_PURCHASE_DATETIME: {TIMESTAMP(3)(11, 3)}
     * @param latestPurchaseDatetime The value of latestPurchaseDatetime as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setLatestPurchaseDatetime_GreaterThan(java.sql.Timestamp latestPurchaseDatetime) {
        regLatestPurchaseDatetime(CK_GT,  latestPurchaseDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * LATEST_PURCHASE_DATETIME: {TIMESTAMP(3)(11, 3)}
     * @param latestPurchaseDatetime The value of latestPurchaseDatetime as lessThan. (NullAllowed: if null, no condition)
     */
    public void setLatestPurchaseDatetime_LessThan(java.sql.Timestamp latestPurchaseDatetime) {
        regLatestPurchaseDatetime(CK_LT,  latestPurchaseDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * LATEST_PURCHASE_DATETIME: {TIMESTAMP(3)(11, 3)}
     * @param latestPurchaseDatetime The value of latestPurchaseDatetime as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setLatestPurchaseDatetime_GreaterEqual(java.sql.Timestamp latestPurchaseDatetime) {
        regLatestPurchaseDatetime(CK_GE,  latestPurchaseDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * LATEST_PURCHASE_DATETIME: {TIMESTAMP(3)(11, 3)}
     * @param latestPurchaseDatetime The value of latestPurchaseDatetime as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setLatestPurchaseDatetime_LessEqual(java.sql.Timestamp latestPurchaseDatetime) {
        regLatestPurchaseDatetime(CK_LE, latestPurchaseDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * LATEST_PURCHASE_DATETIME: {TIMESTAMP(3)(11, 3)}
     * <pre>e.g. setLatestPurchaseDatetime_FromTo(fromDate, toDate, new <span style="color: #FD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of latestPurchaseDatetime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of latestPurchaseDatetime. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setLatestPurchaseDatetime_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), getCValueLatestPurchaseDatetime(), "LATEST_PURCHASE_DATETIME", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * LATEST_PURCHASE_DATETIME: {TIMESTAMP(3)(11, 3)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #FD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of latestPurchaseDatetime. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of latestPurchaseDatetime. (NullAllowed: if null, no to-condition)
     */
    public void setLatestPurchaseDatetime_DateFromTo(Date fromDate, Date toDate) {
        setLatestPurchaseDatetime_FromTo(fromDate, toDate, new FromToOption().compareAsDate());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * LATEST_PURCHASE_DATETIME: {TIMESTAMP(3)(11, 3)}
     */
    public void setLatestPurchaseDatetime_IsNull() { regLatestPurchaseDatetime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * LATEST_PURCHASE_DATETIME: {TIMESTAMP(3)(11, 3)}
     */
    public void setLatestPurchaseDatetime_IsNotNull() { regLatestPurchaseDatetime(CK_ISNN, DOBJ); }

    protected void regLatestPurchaseDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueLatestPurchaseDatetime(), "LATEST_PURCHASE_DATETIME"); }
    protected abstract ConditionValue getCValueLatestPurchaseDatetime();

    // ===================================================================================
    //                                                                    Full Text Search
    //                                                                    ================
    /**
     * Match for full-text search. <br />
     * @param textColumn The text column. (NotNull, StringColumn, TargetTableColumn)
     * @param conditionValue The condition value. (NullAllowed: if null or empty, no condition)
     */
    public void match(org.seasar.dbflute.dbmeta.info.ColumnInfo textColumn, String conditionValue) {
        assertObjectNotNull("textColumn", textColumn);
        match(newArrayList(textColumn), conditionValue);
    }

    /**
     * Match for full-text search. <br />
     * The specified condition value is escaped in this method automatically.
     * @param textColumnList The list of text column. (NotNull, NotEmpty, StringColumn, TargetTableColumn)
     * @param conditionValue The condition value. (NullAllowed: if null or empty, no condition)
     */
    public void match(List<org.seasar.dbflute.dbmeta.info.ColumnInfo> textColumnList, String conditionValue) {
        xdoMatchByLikeSearch(textColumnList, conditionValue);
    }

    @Override
    protected String xescapeFullTextSearchValue(String conditionValue) {
        return xescapeOracleFullTextSearchValue(conditionValue);
    }

    @Override
    protected LikeSearchOption xcreateMatchLikeSearch() {
        return new OracleMatchLikeSearch();
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected SummaryMemberPurchaseCB newMyCB() {
        return new SummaryMemberPurchaseCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return SummaryMemberPurchaseCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
