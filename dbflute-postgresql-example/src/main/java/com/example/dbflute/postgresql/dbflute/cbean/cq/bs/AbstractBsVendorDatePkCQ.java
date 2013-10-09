package com.example.dbflute.postgresql.dbflute.cbean.cq.bs;

import java.util.*;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.dbmeta.DBMetaProvider;
import com.example.dbflute.postgresql.dbflute.allcommon.*;
import com.example.dbflute.postgresql.dbflute.cbean.*;
import com.example.dbflute.postgresql.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of vendor_date_pk.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsVendorDatePkCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsVendorDatePkCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "vendor_date_pk";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * foo_date: {PK, NotNull, date(13)}
     * @param fooDate The value of fooDate as equal. (NullAllowed: if null, no condition)
     */
    public void setFooDate_Equal(java.util.Date fooDate) {
        regFooDate(CK_EQ,  fCTPD(fooDate));
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * foo_date: {PK, NotNull, date(13)}
     * @param fooDate The value of fooDate as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setFooDate_GreaterThan(java.util.Date fooDate) {
        regFooDate(CK_GT,  fCTPD(fooDate));
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * foo_date: {PK, NotNull, date(13)}
     * @param fooDate The value of fooDate as lessThan. (NullAllowed: if null, no condition)
     */
    public void setFooDate_LessThan(java.util.Date fooDate) {
        regFooDate(CK_LT,  fCTPD(fooDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * foo_date: {PK, NotNull, date(13)}
     * @param fooDate The value of fooDate as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setFooDate_GreaterEqual(java.util.Date fooDate) {
        regFooDate(CK_GE,  fCTPD(fooDate));
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * foo_date: {PK, NotNull, date(13)}
     * @param fooDate The value of fooDate as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setFooDate_LessEqual(java.util.Date fooDate) {
        regFooDate(CK_LE, fCTPD(fooDate));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * foo_date: {PK, NotNull, date(13)}
     * <pre>e.g. setFooDate_FromTo(fromDate, toDate, new <span style="color: #FD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of fooDate. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of fooDate. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setFooDate_FromTo(java.util.Date fromDatetime, java.util.Date toDatetime, FromToOption fromToOption) {
        regFTQ(fCTPD(fromDatetime), fCTPD(toDatetime), getCValueFooDate(), "foo_date", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * foo_date: {PK, NotNull, date(13)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #FD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of fooDate. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of fooDate. (NullAllowed: if null, no to-condition)
     */
    public void setFooDate_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
        setFooDate_FromTo(fromDate, toDate, new FromToOption().compareAsDate());
    }

    /**
     * InScope {in ('1965-03-03', '1966-09-15')}. And NullOrEmptyIgnored, NullElementIgnored, SeveralRegistered. <br />
     * foo_date: {PK, NotNull, date(13)}
     * @param fooDateList The collection of fooDate as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFooDate_InScope(Collection<java.util.Date> fooDateList) {
        doSetFooDate_InScope(fooDateList);
    }

    protected void doSetFooDate_InScope(Collection<java.util.Date> fooDateList) {
        regINS(CK_INS, cTL(fooDateList), getCValueFooDate(), "foo_date");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * foo_date: {PK, NotNull, date(13)}
     */
    public void setFooDate_IsNull() { regFooDate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * foo_date: {PK, NotNull, date(13)}
     */
    public void setFooDate_IsNotNull() { regFooDate(CK_ISNN, DOBJ); }

    protected void regFooDate(ConditionKey k, Object v) { regQ(k, v, getCValueFooDate(), "foo_date"); }
    abstract protected ConditionValue getCValueFooDate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * foo_name: {NotNull, varchar(2147483647)}
     * @param fooName The value of fooName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setFooName_Equal(String fooName) {
        doSetFooName_Equal(fRES(fooName));
    }

    protected void doSetFooName_Equal(String fooName) {
        regFooName(CK_EQ, fooName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * foo_name: {NotNull, varchar(2147483647)}
     * @param fooName The value of fooName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setFooName_NotEqual(String fooName) {
        doSetFooName_NotEqual(fRES(fooName));
    }

    protected void doSetFooName_NotEqual(String fooName) {
        regFooName(CK_NES, fooName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * foo_name: {NotNull, varchar(2147483647)}
     * @param fooNameList The collection of fooName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFooName_InScope(Collection<String> fooNameList) {
        doSetFooName_InScope(fooNameList);
    }

    public void doSetFooName_InScope(Collection<String> fooNameList) {
        regINS(CK_INS, cTL(fooNameList), getCValueFooName(), "foo_name");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * foo_name: {NotNull, varchar(2147483647)}
     * @param fooNameList The collection of fooName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFooName_NotInScope(Collection<String> fooNameList) {
        doSetFooName_NotInScope(fooNameList);
    }

    public void doSetFooName_NotInScope(Collection<String> fooNameList) {
        regINS(CK_NINS, cTL(fooNameList), getCValueFooName(), "foo_name");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * foo_name: {NotNull, varchar(2147483647)}
     * @param fooName The value of fooName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setFooName_PrefixSearch(String fooName) {
        setFooName_LikeSearch(fooName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * foo_name: {NotNull, varchar(2147483647)} <br />
     * <pre>e.g. setFooName_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fooName The value of fooName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFooName_LikeSearch(String fooName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fooName), getCValueFooName(), "foo_name", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * foo_name: {NotNull, varchar(2147483647)}
     * @param fooName The value of fooName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFooName_NotLikeSearch(String fooName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fooName), getCValueFooName(), "foo_name", likeSearchOption);
    }

    protected void regFooName(ConditionKey k, Object v) { regQ(k, v, getCValueFooName(), "foo_name"); }
    abstract protected ConditionValue getCValueFooName();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;VendorDatePkCB&gt;() {
     *     public void query(VendorDatePkCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorDatePkCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;VendorDatePkCB&gt;() {
     *     public void query(VendorDatePkCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorDatePkCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;VendorDatePkCB&gt;() {
     *     public void query(VendorDatePkCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorDatePkCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;VendorDatePkCB&gt;() {
     *     public void query(VendorDatePkCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorDatePkCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;VendorDatePkCB&gt;() {
     *     public void query(VendorDatePkCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorDatePkCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;VendorDatePkCB&gt;() {
     *     public void query(VendorDatePkCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorDatePkCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<VendorDatePkCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<VendorDatePkCB>(new HpSSQSetupper<VendorDatePkCB>() {
            public void setup(String function, SubQuery<VendorDatePkCB> subQuery, HpSSQOption<VendorDatePkCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<VendorDatePkCB> subQuery, String operand, HpSSQOption<VendorDatePkCB> option) {
        assertObjectNotNull("subQuery<VendorDatePkCB>", subQuery);
        VendorDatePkCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(VendorDatePkCQ subQuery);

    protected VendorDatePkCB xcreateScalarConditionCB() {
        VendorDatePkCB cb = new VendorDatePkCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected VendorDatePkCB xcreateScalarConditionPartitionByCB() {
        VendorDatePkCB cb = new VendorDatePkCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<VendorDatePkCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<VendorDatePkCB>", subQuery);
        VendorDatePkCB cb = new VendorDatePkCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "foo_date", "foo_date", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(VendorDatePkCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<VendorDatePkCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<VendorDatePkCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<VendorDatePkCB>(new HpQDRSetupper<VendorDatePkCB>() {
            public void setup(String function, SubQuery<VendorDatePkCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<VendorDatePkCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<VendorDatePkCB>", subQuery);
        VendorDatePkCB cb = new VendorDatePkCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "foo_date", "foo_date", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(VendorDatePkCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<VendorDatePkCB> subQuery) {
        assertObjectNotNull("subQuery<VendorDatePkCB>", subQuery);
        VendorDatePkCB cb = new VendorDatePkCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(VendorDatePkCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<VendorDatePkCB> subQuery) {
        assertObjectNotNull("subQuery<VendorDatePkCB>", subQuery);
        VendorDatePkCB cb = new VendorDatePkCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(VendorDatePkCQ subQuery);

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
     * @param textColumnList The list of text column. (NotNull, NotEmpty, StringColumn, TargetTableColumn)
     * @param conditionValue The condition value. (NullAllowed: if null or empty, no condition)
     */
    public void match(java.util.List<org.seasar.dbflute.dbmeta.info.ColumnInfo> textColumnList, String conditionValue) {
        xdoMatchByLikeSearch(textColumnList, conditionValue);
    }

    @Override
    protected String xescapeFullTextSearchValue(String conditionValue) {
        return conditionValue; // non escape
    }

    @Override
    protected LikeSearchOption xcreateMatchLikeSearch() {
        return new PostgreSQLMatchLikeSearch();
    }

    @Override
    protected org.seasar.dbflute.dbway.ExtensionOperand xgetPostgreSQLMatchOperand() {
        return DBFluteConfig.getInstance().getFullTextSearchOperand();
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCB() { return VendorDatePkCB.class.getName(); }
    protected String xabCQ() { return VendorDatePkCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
