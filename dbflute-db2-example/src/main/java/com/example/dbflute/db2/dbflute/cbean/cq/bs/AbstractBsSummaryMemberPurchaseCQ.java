package com.example.dbflute.db2.dbflute.cbean.cq.bs;

import java.util.*;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.dbmeta.DBMetaProvider;
import com.example.dbflute.db2.dbflute.allcommon.*;
import com.example.dbflute.db2.dbflute.cbean.*;
import com.example.dbflute.db2.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of SUMMARY_MEMBER_PURCHASE.
 * @author DBFlute(AutoGenerator)
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
     * MEMBER_ID: {PK, ID, NotNull, UnknownType}
     * @param memberId The value of memberId as equal. (NullAllowed: if null, no condition)
     */
    public void setMemberId_Equal(Integer memberId) {
        doSetMemberId_Equal(memberId);
    }

    protected void doSetMemberId_Equal(Integer memberId) {
        regMemberId(CK_EQ, memberId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ID: {PK, ID, NotNull, UnknownType}
     * @param memberId The value of memberId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setMemberId_NotEqual(Integer memberId) {
        doSetMemberId_NotEqual(memberId);
    }

    protected void doSetMemberId_NotEqual(Integer memberId) {
        regMemberId(CK_NES, memberId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ID: {PK, ID, NotNull, UnknownType}
     * @param memberId The value of memberId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setMemberId_GreaterThan(Integer memberId) {
        regMemberId(CK_GT, memberId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ID: {PK, ID, NotNull, UnknownType}
     * @param memberId The value of memberId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setMemberId_LessThan(Integer memberId) {
        regMemberId(CK_LT, memberId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ID: {PK, ID, NotNull, UnknownType}
     * @param memberId The value of memberId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setMemberId_GreaterEqual(Integer memberId) {
        regMemberId(CK_GE, memberId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ID: {PK, ID, NotNull, UnknownType}
     * @param memberId The value of memberId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setMemberId_LessEqual(Integer memberId) {
        regMemberId(CK_LE, memberId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ID: {PK, ID, NotNull, UnknownType}
     * @param minNumber The min number of memberId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of memberId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMemberId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueMemberId(), "MEMBER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * MEMBER_ID: {PK, ID, NotNull, UnknownType}
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
     * MEMBER_ID: {PK, ID, NotNull, UnknownType}
     * @param memberIdList The collection of memberId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberId_NotInScope(Collection<Integer> memberIdList) {
        doSetMemberId_NotInScope(memberIdList);
    }

    protected void doSetMemberId_NotInScope(Collection<Integer> memberIdList) {
        regINS(CK_NINS, cTL(memberIdList), getCValueMemberId(), "MEMBER_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * MEMBER_ID: {PK, ID, NotNull, UnknownType}
     */
    public void setMemberId_IsNull() { regMemberId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * MEMBER_ID: {PK, ID, NotNull, UnknownType}
     */
    public void setMemberId_IsNotNull() { regMemberId(CK_ISNN, DOBJ); }

    protected void regMemberId(ConditionKey k, Object v) { regQ(k, v, getCValueMemberId(), "MEMBER_ID"); }
    abstract protected ConditionValue getCValueMemberId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * ALLSUM_PURCHASE_PRICE: {UnknownType}
     * @param allsumPurchasePrice The value of allsumPurchasePrice as equal. (NullAllowed: if null, no condition)
     */
    public void setAllsumPurchasePrice_Equal(Integer allsumPurchasePrice) {
        doSetAllsumPurchasePrice_Equal(allsumPurchasePrice);
    }

    protected void doSetAllsumPurchasePrice_Equal(Integer allsumPurchasePrice) {
        regAllsumPurchasePrice(CK_EQ, allsumPurchasePrice);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ALLSUM_PURCHASE_PRICE: {UnknownType}
     * @param allsumPurchasePrice The value of allsumPurchasePrice as notEqual. (NullAllowed: if null, no condition)
     */
    public void setAllsumPurchasePrice_NotEqual(Integer allsumPurchasePrice) {
        doSetAllsumPurchasePrice_NotEqual(allsumPurchasePrice);
    }

    protected void doSetAllsumPurchasePrice_NotEqual(Integer allsumPurchasePrice) {
        regAllsumPurchasePrice(CK_NES, allsumPurchasePrice);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ALLSUM_PURCHASE_PRICE: {UnknownType}
     * @param allsumPurchasePrice The value of allsumPurchasePrice as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setAllsumPurchasePrice_GreaterThan(Integer allsumPurchasePrice) {
        regAllsumPurchasePrice(CK_GT, allsumPurchasePrice);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ALLSUM_PURCHASE_PRICE: {UnknownType}
     * @param allsumPurchasePrice The value of allsumPurchasePrice as lessThan. (NullAllowed: if null, no condition)
     */
    public void setAllsumPurchasePrice_LessThan(Integer allsumPurchasePrice) {
        regAllsumPurchasePrice(CK_LT, allsumPurchasePrice);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * ALLSUM_PURCHASE_PRICE: {UnknownType}
     * @param allsumPurchasePrice The value of allsumPurchasePrice as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setAllsumPurchasePrice_GreaterEqual(Integer allsumPurchasePrice) {
        regAllsumPurchasePrice(CK_GE, allsumPurchasePrice);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * ALLSUM_PURCHASE_PRICE: {UnknownType}
     * @param allsumPurchasePrice The value of allsumPurchasePrice as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setAllsumPurchasePrice_LessEqual(Integer allsumPurchasePrice) {
        regAllsumPurchasePrice(CK_LE, allsumPurchasePrice);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * ALLSUM_PURCHASE_PRICE: {UnknownType}
     * @param minNumber The min number of allsumPurchasePrice. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of allsumPurchasePrice. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAllsumPurchasePrice_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueAllsumPurchasePrice(), "ALLSUM_PURCHASE_PRICE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * ALLSUM_PURCHASE_PRICE: {UnknownType}
     * @param allsumPurchasePriceList The collection of allsumPurchasePrice as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setAllsumPurchasePrice_InScope(Collection<Integer> allsumPurchasePriceList) {
        doSetAllsumPurchasePrice_InScope(allsumPurchasePriceList);
    }

    protected void doSetAllsumPurchasePrice_InScope(Collection<Integer> allsumPurchasePriceList) {
        regINS(CK_INS, cTL(allsumPurchasePriceList), getCValueAllsumPurchasePrice(), "ALLSUM_PURCHASE_PRICE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * ALLSUM_PURCHASE_PRICE: {UnknownType}
     * @param allsumPurchasePriceList The collection of allsumPurchasePrice as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setAllsumPurchasePrice_NotInScope(Collection<Integer> allsumPurchasePriceList) {
        doSetAllsumPurchasePrice_NotInScope(allsumPurchasePriceList);
    }

    protected void doSetAllsumPurchasePrice_NotInScope(Collection<Integer> allsumPurchasePriceList) {
        regINS(CK_NINS, cTL(allsumPurchasePriceList), getCValueAllsumPurchasePrice(), "ALLSUM_PURCHASE_PRICE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * ALLSUM_PURCHASE_PRICE: {UnknownType}
     */
    public void setAllsumPurchasePrice_IsNull() { regAllsumPurchasePrice(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * ALLSUM_PURCHASE_PRICE: {UnknownType}
     */
    public void setAllsumPurchasePrice_IsNotNull() { regAllsumPurchasePrice(CK_ISNN, DOBJ); }

    protected void regAllsumPurchasePrice(ConditionKey k, Object v) { regQ(k, v, getCValueAllsumPurchasePrice(), "ALLSUM_PURCHASE_PRICE"); }
    abstract protected ConditionValue getCValueAllsumPurchasePrice();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * LATEST_PURCHASE_DATETIME: {UnknownType}
     * @param latestPurchaseDatetime The value of latestPurchaseDatetime as equal. (NullAllowed: if null, no condition)
     */
    public void setLatestPurchaseDatetime_Equal(java.util.Date latestPurchaseDatetime) {
        regLatestPurchaseDatetime(CK_EQ,  fCTPD(latestPurchaseDatetime));
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * LATEST_PURCHASE_DATETIME: {UnknownType}
     * @param latestPurchaseDatetime The value of latestPurchaseDatetime as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setLatestPurchaseDatetime_GreaterThan(java.util.Date latestPurchaseDatetime) {
        regLatestPurchaseDatetime(CK_GT,  fCTPD(latestPurchaseDatetime));
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * LATEST_PURCHASE_DATETIME: {UnknownType}
     * @param latestPurchaseDatetime The value of latestPurchaseDatetime as lessThan. (NullAllowed: if null, no condition)
     */
    public void setLatestPurchaseDatetime_LessThan(java.util.Date latestPurchaseDatetime) {
        regLatestPurchaseDatetime(CK_LT,  fCTPD(latestPurchaseDatetime));
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * LATEST_PURCHASE_DATETIME: {UnknownType}
     * @param latestPurchaseDatetime The value of latestPurchaseDatetime as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setLatestPurchaseDatetime_GreaterEqual(java.util.Date latestPurchaseDatetime) {
        regLatestPurchaseDatetime(CK_GE,  fCTPD(latestPurchaseDatetime));
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * LATEST_PURCHASE_DATETIME: {UnknownType}
     * @param latestPurchaseDatetime The value of latestPurchaseDatetime as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setLatestPurchaseDatetime_LessEqual(java.util.Date latestPurchaseDatetime) {
        regLatestPurchaseDatetime(CK_LE, fCTPD(latestPurchaseDatetime));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * LATEST_PURCHASE_DATETIME: {UnknownType}
     * <pre>e.g. setLatestPurchaseDatetime_FromTo(fromDate, toDate, new <span style="color: #FD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of latestPurchaseDatetime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of latestPurchaseDatetime. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setLatestPurchaseDatetime_FromTo(java.util.Date fromDatetime, java.util.Date toDatetime, FromToOption fromToOption) {
        regFTQ(fCTPD(fromDatetime), fCTPD(toDatetime), getCValueLatestPurchaseDatetime(), "LATEST_PURCHASE_DATETIME", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * LATEST_PURCHASE_DATETIME: {UnknownType}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #FD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of latestPurchaseDatetime. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of latestPurchaseDatetime. (NullAllowed: if null, no to-condition)
     */
    public void setLatestPurchaseDatetime_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
        setLatestPurchaseDatetime_FromTo(fromDate, toDate, new FromToOption().compareAsDate());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * LATEST_PURCHASE_DATETIME: {UnknownType}
     */
    public void setLatestPurchaseDatetime_IsNull() { regLatestPurchaseDatetime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * LATEST_PURCHASE_DATETIME: {UnknownType}
     */
    public void setLatestPurchaseDatetime_IsNotNull() { regLatestPurchaseDatetime(CK_ISNN, DOBJ); }

    protected void regLatestPurchaseDatetime(ConditionKey k, Object v) { regQ(k, v, getCValueLatestPurchaseDatetime(), "LATEST_PURCHASE_DATETIME"); }
    abstract protected ConditionValue getCValueLatestPurchaseDatetime();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;SummaryMemberPurchaseCB&gt;() {
     *     public void query(SummaryMemberPurchaseCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<SummaryMemberPurchaseCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;SummaryMemberPurchaseCB&gt;() {
     *     public void query(SummaryMemberPurchaseCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<SummaryMemberPurchaseCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;SummaryMemberPurchaseCB&gt;() {
     *     public void query(SummaryMemberPurchaseCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<SummaryMemberPurchaseCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;SummaryMemberPurchaseCB&gt;() {
     *     public void query(SummaryMemberPurchaseCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<SummaryMemberPurchaseCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;SummaryMemberPurchaseCB&gt;() {
     *     public void query(SummaryMemberPurchaseCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<SummaryMemberPurchaseCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;SummaryMemberPurchaseCB&gt;() {
     *     public void query(SummaryMemberPurchaseCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<SummaryMemberPurchaseCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<SummaryMemberPurchaseCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<SummaryMemberPurchaseCB>(new HpSSQSetupper<SummaryMemberPurchaseCB>() {
            public void setup(String function, SubQuery<SummaryMemberPurchaseCB> subQuery, HpSSQOption<SummaryMemberPurchaseCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<SummaryMemberPurchaseCB> subQuery, String operand, HpSSQOption<SummaryMemberPurchaseCB> option) {
        assertObjectNotNull("subQuery<SummaryMemberPurchaseCB>", subQuery);
        SummaryMemberPurchaseCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(SummaryMemberPurchaseCQ subQuery);

    protected SummaryMemberPurchaseCB xcreateScalarConditionCB() {
        SummaryMemberPurchaseCB cb = new SummaryMemberPurchaseCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected SummaryMemberPurchaseCB xcreateScalarConditionPartitionByCB() {
        SummaryMemberPurchaseCB cb = new SummaryMemberPurchaseCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<SummaryMemberPurchaseCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<SummaryMemberPurchaseCB>", subQuery);
        SummaryMemberPurchaseCB cb = new SummaryMemberPurchaseCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(SummaryMemberPurchaseCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<SummaryMemberPurchaseCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<SummaryMemberPurchaseCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<SummaryMemberPurchaseCB>(new HpQDRSetupper<SummaryMemberPurchaseCB>() {
            public void setup(String function, SubQuery<SummaryMemberPurchaseCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<SummaryMemberPurchaseCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<SummaryMemberPurchaseCB>", subQuery);
        SummaryMemberPurchaseCB cb = new SummaryMemberPurchaseCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "MEMBER_ID", "MEMBER_ID", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(SummaryMemberPurchaseCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<SummaryMemberPurchaseCB> subQuery) {
        assertObjectNotNull("subQuery<SummaryMemberPurchaseCB>", subQuery);
        SummaryMemberPurchaseCB cb = new SummaryMemberPurchaseCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(SummaryMemberPurchaseCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<SummaryMemberPurchaseCB> subQuery) {
        assertObjectNotNull("subQuery<SummaryMemberPurchaseCB>", subQuery);
        SummaryMemberPurchaseCB cb = new SummaryMemberPurchaseCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(SummaryMemberPurchaseCQ subQuery);

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCB() { return SummaryMemberPurchaseCB.class.getName(); }
    protected String xabCQ() { return SummaryMemberPurchaseCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
