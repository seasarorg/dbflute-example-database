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
 * The abstract condition-query of VENDOR_DEFAULT_VALUE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsVendorDefaultValueCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsVendorDefaultValueCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
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
        return "VENDOR_DEFAULT_VALUE";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * DEFAULT_VALUE_ID: {PK, NotNull, DECIMAL(16)}
     * @param defaultValueId The value of defaultValueId as equal. (NullAllowed: if null, no condition)
     */
    public void setDefaultValueId_Equal(Long defaultValueId) {
        doSetDefaultValueId_Equal(defaultValueId);
    }

    protected void doSetDefaultValueId_Equal(Long defaultValueId) {
        regDefaultValueId(CK_EQ, defaultValueId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * DEFAULT_VALUE_ID: {PK, NotNull, DECIMAL(16)}
     * @param defaultValueId The value of defaultValueId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setDefaultValueId_NotEqual(Long defaultValueId) {
        doSetDefaultValueId_NotEqual(defaultValueId);
    }

    protected void doSetDefaultValueId_NotEqual(Long defaultValueId) {
        regDefaultValueId(CK_NES, defaultValueId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * DEFAULT_VALUE_ID: {PK, NotNull, DECIMAL(16)}
     * @param defaultValueId The value of defaultValueId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setDefaultValueId_GreaterThan(Long defaultValueId) {
        regDefaultValueId(CK_GT, defaultValueId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * DEFAULT_VALUE_ID: {PK, NotNull, DECIMAL(16)}
     * @param defaultValueId The value of defaultValueId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setDefaultValueId_LessThan(Long defaultValueId) {
        regDefaultValueId(CK_LT, defaultValueId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * DEFAULT_VALUE_ID: {PK, NotNull, DECIMAL(16)}
     * @param defaultValueId The value of defaultValueId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setDefaultValueId_GreaterEqual(Long defaultValueId) {
        regDefaultValueId(CK_GE, defaultValueId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * DEFAULT_VALUE_ID: {PK, NotNull, DECIMAL(16)}
     * @param defaultValueId The value of defaultValueId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setDefaultValueId_LessEqual(Long defaultValueId) {
        regDefaultValueId(CK_LE, defaultValueId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * DEFAULT_VALUE_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of defaultValueId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of defaultValueId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDefaultValueId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueDefaultValueId(), "DEFAULT_VALUE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * DEFAULT_VALUE_ID: {PK, NotNull, DECIMAL(16)}
     * @param defaultValueIdList The collection of defaultValueId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDefaultValueId_InScope(Collection<Long> defaultValueIdList) {
        doSetDefaultValueId_InScope(defaultValueIdList);
    }

    protected void doSetDefaultValueId_InScope(Collection<Long> defaultValueIdList) {
        regINS(CK_INS, cTL(defaultValueIdList), getCValueDefaultValueId(), "DEFAULT_VALUE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * DEFAULT_VALUE_ID: {PK, NotNull, DECIMAL(16)}
     * @param defaultValueIdList The collection of defaultValueId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDefaultValueId_NotInScope(Collection<Long> defaultValueIdList) {
        doSetDefaultValueId_NotInScope(defaultValueIdList);
    }

    protected void doSetDefaultValueId_NotInScope(Collection<Long> defaultValueIdList) {
        regINS(CK_NINS, cTL(defaultValueIdList), getCValueDefaultValueId(), "DEFAULT_VALUE_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * DEFAULT_VALUE_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setDefaultValueId_IsNull() { regDefaultValueId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * DEFAULT_VALUE_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setDefaultValueId_IsNotNull() { regDefaultValueId(CK_ISNN, DOBJ); }

    protected void regDefaultValueId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueDefaultValueId(), "DEFAULT_VALUE_ID"); }
    protected abstract ConditionValue getCValueDefaultValueId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * DEFAULT_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[9999-12-31-23.59.59.999999]}
     * @param defaultTimestamp The value of defaultTimestamp as equal. (NullAllowed: if null, no condition)
     */
    public void setDefaultTimestamp_Equal(java.sql.Timestamp defaultTimestamp) {
        regDefaultTimestamp(CK_EQ,  defaultTimestamp);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * DEFAULT_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[9999-12-31-23.59.59.999999]}
     * @param defaultTimestamp The value of defaultTimestamp as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setDefaultTimestamp_GreaterThan(java.sql.Timestamp defaultTimestamp) {
        regDefaultTimestamp(CK_GT,  defaultTimestamp);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * DEFAULT_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[9999-12-31-23.59.59.999999]}
     * @param defaultTimestamp The value of defaultTimestamp as lessThan. (NullAllowed: if null, no condition)
     */
    public void setDefaultTimestamp_LessThan(java.sql.Timestamp defaultTimestamp) {
        regDefaultTimestamp(CK_LT,  defaultTimestamp);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * DEFAULT_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[9999-12-31-23.59.59.999999]}
     * @param defaultTimestamp The value of defaultTimestamp as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setDefaultTimestamp_GreaterEqual(java.sql.Timestamp defaultTimestamp) {
        regDefaultTimestamp(CK_GE,  defaultTimestamp);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * DEFAULT_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[9999-12-31-23.59.59.999999]}
     * @param defaultTimestamp The value of defaultTimestamp as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setDefaultTimestamp_LessEqual(java.sql.Timestamp defaultTimestamp) {
        regDefaultTimestamp(CK_LE, defaultTimestamp);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * DEFAULT_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[9999-12-31-23.59.59.999999]}
     * <pre>e.g. setDefaultTimestamp_FromTo(fromDate, toDate, new <span style="color: #DD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of defaultTimestamp. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of defaultTimestamp. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setDefaultTimestamp_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), getCValueDefaultTimestamp(), "DEFAULT_TIMESTAMP", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * DEFAULT_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[9999-12-31-23.59.59.999999]}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #DD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of defaultTimestamp. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of defaultTimestamp. (NullAllowed: if null, no to-condition)
     */
    public void setDefaultTimestamp_DateFromTo(Date fromDate, Date toDate) {
        setDefaultTimestamp_FromTo(fromDate, toDate, new FromToOption().compareAsDate());
    }

    protected void regDefaultTimestamp(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueDefaultTimestamp(), "DEFAULT_TIMESTAMP"); }
    protected abstract ConditionValue getCValueDefaultTimestamp();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;VendorDefaultValueCB&gt;() {
     *     public void query(VendorDefaultValueCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorDefaultValueCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, VendorDefaultValueCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;VendorDefaultValueCB&gt;() {
     *     public void query(VendorDefaultValueCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorDefaultValueCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, VendorDefaultValueCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;VendorDefaultValueCB&gt;() {
     *     public void query(VendorDefaultValueCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorDefaultValueCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, VendorDefaultValueCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;VendorDefaultValueCB&gt;() {
     *     public void query(VendorDefaultValueCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorDefaultValueCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, VendorDefaultValueCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;VendorDefaultValueCB&gt;() {
     *     public void query(VendorDefaultValueCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorDefaultValueCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, VendorDefaultValueCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;VendorDefaultValueCB&gt;() {
     *     public void query(VendorDefaultValueCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorDefaultValueCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, VendorDefaultValueCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        VendorDefaultValueCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(VendorDefaultValueCQ sq);

    protected VendorDefaultValueCB xcreateScalarConditionCB() {
        VendorDefaultValueCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected VendorDefaultValueCB xcreateScalarConditionPartitionByCB() {
        VendorDefaultValueCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<VendorDefaultValueCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorDefaultValueCB cb = new VendorDefaultValueCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "DEFAULT_VALUE_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(VendorDefaultValueCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<VendorDefaultValueCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(VendorDefaultValueCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorDefaultValueCB cb = new VendorDefaultValueCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "DEFAULT_VALUE_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(VendorDefaultValueCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<VendorDefaultValueCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        VendorDefaultValueCB cb = new VendorDefaultValueCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(VendorDefaultValueCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfInScope(SubQuery<VendorDefaultValueCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        VendorDefaultValueCB cb = new VendorDefaultValueCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(VendorDefaultValueCQ sq);

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * MemberCB cb = new MemberCB();
     * ManualOrderBean mob = new ManualOrderBean();
     * mob.<span style="color: #DD4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #DD4747">withManualOrder(mob)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * MemberCB cb = new MemberCB();
     * ManualOrderBean mob = new ManualOrderBean();
     * mob.<span style="color: #DD4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     * mob.<span style="color: #DD4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     * mob.<span style="color: #DD4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #DD4747">withManualOrder(mob)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param mob The bean of manual order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderBean mob) { // is user public!
        xdoWithManualOrder(mob);
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    /**
     * Order along the list of manual values. #beforejava8 <br />
     * This function with Union is unsupported! <br />
     * The order values are bound (treated as bind parameter).
     * <pre>
     * MemberCB cb = new MemberCB();
     * List&lt;CDef.MemberStatus&gt; orderValueList = new ArrayList&lt;CDef.MemberStatus&gt;();
     * orderValueList.add(CDef.MemberStatus.Withdrawal);
     * orderValueList.add(CDef.MemberStatus.Formalized);
     * orderValueList.add(CDef.MemberStatus.Provisional);
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #DD4747">withManualOrder(orderValueList)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * @param orderValueList The list of order values for manual ordering. (NotNull)
     */
    public void withManualOrder(List<? extends Object> orderValueList) { // is user public!
        assertObjectNotNull("withManualOrder(orderValueList)", orderValueList);
        final ManualOrderBean manualOrderBean = new ManualOrderBean();
        manualOrderBean.acceptOrderValueList(orderValueList);
        withManualOrder(manualOrderBean);
    }

    @Override
    protected void filterFromToOption(FromToOption option) {
        option.allowOneSide();
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected VendorDefaultValueCB newMyCB() {
        return new VendorDefaultValueCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return VendorDefaultValueCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
