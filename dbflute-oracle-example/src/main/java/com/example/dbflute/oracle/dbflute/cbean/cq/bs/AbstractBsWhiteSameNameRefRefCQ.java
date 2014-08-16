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
 * The abstract condition-query of WHITE_SAME_NAME_REF_REF.
 * @author oracleman
 */
public abstract class AbstractBsWhiteSameNameRefRefCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteSameNameRefRefCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "WHITE_SAME_NAME_REF_REF";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_REF_ID: {PK, NotNull, NUMBER(16)}
     * @param refRefId The value of refRefId as equal. (NullAllowed: if null, no condition)
     */
    public void setRefRefId_Equal(Long refRefId) {
        doSetRefRefId_Equal(refRefId);
    }

    protected void doSetRefRefId_Equal(Long refRefId) {
        regRefRefId(CK_EQ, refRefId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_REF_ID: {PK, NotNull, NUMBER(16)}
     * @param refRefId The value of refRefId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setRefRefId_GreaterThan(Long refRefId) {
        regRefRefId(CK_GT, refRefId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_REF_ID: {PK, NotNull, NUMBER(16)}
     * @param refRefId The value of refRefId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setRefRefId_LessThan(Long refRefId) {
        regRefRefId(CK_LT, refRefId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_REF_ID: {PK, NotNull, NUMBER(16)}
     * @param refRefId The value of refRefId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setRefRefId_GreaterEqual(Long refRefId) {
        regRefRefId(CK_GE, refRefId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_REF_ID: {PK, NotNull, NUMBER(16)}
     * @param refRefId The value of refRefId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setRefRefId_LessEqual(Long refRefId) {
        regRefRefId(CK_LE, refRefId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * REF_REF_ID: {PK, NotNull, NUMBER(16)}
     * @param minNumber The min number of refRefId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of refRefId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRefRefId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueRefRefId(), "REF_REF_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * REF_REF_ID: {PK, NotNull, NUMBER(16)}
     * @param refRefIdList The collection of refRefId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRefRefId_InScope(Collection<Long> refRefIdList) {
        doSetRefRefId_InScope(refRefIdList);
    }

    protected void doSetRefRefId_InScope(Collection<Long> refRefIdList) {
        regINS(CK_INS, cTL(refRefIdList), getCValueRefRefId(), "REF_REF_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * REF_REF_ID: {PK, NotNull, NUMBER(16)}
     * @param refRefIdList The collection of refRefId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRefRefId_NotInScope(Collection<Long> refRefIdList) {
        doSetRefRefId_NotInScope(refRefIdList);
    }

    protected void doSetRefRefId_NotInScope(Collection<Long> refRefIdList) {
        regINS(CK_NINS, cTL(refRefIdList), getCValueRefRefId(), "REF_REF_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * REF_REF_ID: {PK, NotNull, NUMBER(16)}
     */
    public void setRefRefId_IsNull() { regRefRefId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * REF_REF_ID: {PK, NotNull, NUMBER(16)}
     */
    public void setRefRefId_IsNotNull() { regRefRefId(CK_ISNN, DOBJ); }

    protected void regRefRefId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueRefRefId(), "REF_REF_ID"); }
    protected abstract ConditionValue getCValueRefRefId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * REF_REF_NAME: {NotNull, VARCHAR2(100)}
     * @param refRefName The value of refRefName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setRefRefName_Equal(String refRefName) {
        doSetRefRefName_Equal(fRES(refRefName));
    }

    protected void doSetRefRefName_Equal(String refRefName) {
        regRefRefName(CK_EQ, refRefName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * REF_REF_NAME: {NotNull, VARCHAR2(100)}
     * @param refRefName The value of refRefName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setRefRefName_NotEqual(String refRefName) {
        doSetRefRefName_NotEqual(fRES(refRefName));
    }

    protected void doSetRefRefName_NotEqual(String refRefName) {
        regRefRefName(CK_NES, refRefName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * REF_REF_NAME: {NotNull, VARCHAR2(100)}
     * @param refRefNameList The collection of refRefName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRefRefName_InScope(Collection<String> refRefNameList) {
        doSetRefRefName_InScope(refRefNameList);
    }

    public void doSetRefRefName_InScope(Collection<String> refRefNameList) {
        regINS(CK_INS, cTL(refRefNameList), getCValueRefRefName(), "REF_REF_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * REF_REF_NAME: {NotNull, VARCHAR2(100)}
     * @param refRefNameList The collection of refRefName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRefRefName_NotInScope(Collection<String> refRefNameList) {
        doSetRefRefName_NotInScope(refRefNameList);
    }

    public void doSetRefRefName_NotInScope(Collection<String> refRefNameList) {
        regINS(CK_NINS, cTL(refRefNameList), getCValueRefRefName(), "REF_REF_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * REF_REF_NAME: {NotNull, VARCHAR2(100)}
     * @param refRefName The value of refRefName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setRefRefName_PrefixSearch(String refRefName) {
        setRefRefName_LikeSearch(refRefName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * REF_REF_NAME: {NotNull, VARCHAR2(100)} <br />
     * <pre>e.g. setRefRefName_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param refRefName The value of refRefName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRefRefName_LikeSearch(String refRefName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(refRefName), getCValueRefRefName(), "REF_REF_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * REF_REF_NAME: {NotNull, VARCHAR2(100)}
     * @param refRefName The value of refRefName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRefRefName_NotLikeSearch(String refRefName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(refRefName), getCValueRefRefName(), "REF_REF_NAME", likeSearchOption);
    }

    protected void regRefRefName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueRefRefName(), "REF_REF_NAME"); }
    protected abstract ConditionValue getCValueRefRefName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_REF_DATE: {NotNull, DATE(7)}
     * @param refRefDate The value of refRefDate as equal. (NullAllowed: if null, no condition)
     */
    public void setRefRefDate_Equal(java.util.Date refRefDate) {
        regRefRefDate(CK_EQ,  fCTPD(refRefDate));
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_REF_DATE: {NotNull, DATE(7)}
     * @param refRefDate The value of refRefDate as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setRefRefDate_GreaterThan(java.util.Date refRefDate) {
        regRefRefDate(CK_GT,  fCTPD(refRefDate));
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_REF_DATE: {NotNull, DATE(7)}
     * @param refRefDate The value of refRefDate as lessThan. (NullAllowed: if null, no condition)
     */
    public void setRefRefDate_LessThan(java.util.Date refRefDate) {
        regRefRefDate(CK_LT,  fCTPD(refRefDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_REF_DATE: {NotNull, DATE(7)}
     * @param refRefDate The value of refRefDate as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setRefRefDate_GreaterEqual(java.util.Date refRefDate) {
        regRefRefDate(CK_GE,  fCTPD(refRefDate));
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_REF_DATE: {NotNull, DATE(7)}
     * @param refRefDate The value of refRefDate as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setRefRefDate_LessEqual(java.util.Date refRefDate) {
        regRefRefDate(CK_LE, fCTPD(refRefDate));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * REF_REF_DATE: {NotNull, DATE(7)}
     * <pre>e.g. setRefRefDate_FromTo(fromDate, toDate, new <span style="color: #DD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of refRefDate. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of refRefDate. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setRefRefDate_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ(fCTPD(fromDatetime), fCTPD(toDatetime), getCValueRefRefDate(), "REF_REF_DATE", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * REF_REF_DATE: {NotNull, DATE(7)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #DD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of refRefDate. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of refRefDate. (NullAllowed: if null, no to-condition)
     */
    public void setRefRefDate_DateFromTo(Date fromDate, Date toDate) {
        setRefRefDate_FromTo(fromDate, toDate, new FromToOption().compareAsDate());
    }

    protected void regRefRefDate(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueRefRefDate(), "REF_REF_DATE"); }
    protected abstract ConditionValue getCValueRefRefDate();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteSameNameRefRefCB&gt;() {
     *     public void query(WhiteSameNameRefRefCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSameNameRefRefCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, WhiteSameNameRefRefCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteSameNameRefRefCB&gt;() {
     *     public void query(WhiteSameNameRefRefCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSameNameRefRefCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, WhiteSameNameRefRefCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteSameNameRefRefCB&gt;() {
     *     public void query(WhiteSameNameRefRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSameNameRefRefCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, WhiteSameNameRefRefCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteSameNameRefRefCB&gt;() {
     *     public void query(WhiteSameNameRefRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSameNameRefRefCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, WhiteSameNameRefRefCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteSameNameRefRefCB&gt;() {
     *     public void query(WhiteSameNameRefRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSameNameRefRefCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, WhiteSameNameRefRefCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteSameNameRefRefCB&gt;() {
     *     public void query(WhiteSameNameRefRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSameNameRefRefCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, WhiteSameNameRefRefCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSameNameRefRefCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhiteSameNameRefRefCQ sq);

    protected WhiteSameNameRefRefCB xcreateScalarConditionCB() {
        WhiteSameNameRefRefCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteSameNameRefRefCB xcreateScalarConditionPartitionByCB() {
        WhiteSameNameRefRefCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteSameNameRefRefCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSameNameRefRefCB cb = new WhiteSameNameRefRefCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "REF_REF_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteSameNameRefRefCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteSameNameRefRefCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteSameNameRefRefCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSameNameRefRefCB cb = new WhiteSameNameRefRefCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "REF_REF_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteSameNameRefRefCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteSameNameRefRefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteSameNameRefRefCB cb = new WhiteSameNameRefRefCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteSameNameRefRefCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteSameNameRefRefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteSameNameRefRefCB cb = new WhiteSameNameRefRefCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(WhiteSameNameRefRefCQ sq);

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
    protected WhiteSameNameRefRefCB newMyCB() {
        return new WhiteSameNameRefRefCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteSameNameRefRefCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
