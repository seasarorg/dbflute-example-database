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
 * The abstract condition-query of vendor_part_man.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsVendorPartManCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsVendorPartManCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "vendor_part_man";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * part_man_id: {PK, NotNull, int4(10)}
     * @param partManId The value of partManId as equal. (NullAllowed: if null, no condition)
     */
    public void setPartManId_Equal(Integer partManId) {
        doSetPartManId_Equal(partManId);
    }

    protected void doSetPartManId_Equal(Integer partManId) {
        regPartManId(CK_EQ, partManId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * part_man_id: {PK, NotNull, int4(10)}
     * @param partManId The value of partManId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setPartManId_GreaterThan(Integer partManId) {
        regPartManId(CK_GT, partManId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * part_man_id: {PK, NotNull, int4(10)}
     * @param partManId The value of partManId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setPartManId_LessThan(Integer partManId) {
        regPartManId(CK_LT, partManId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * part_man_id: {PK, NotNull, int4(10)}
     * @param partManId The value of partManId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setPartManId_GreaterEqual(Integer partManId) {
        regPartManId(CK_GE, partManId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * part_man_id: {PK, NotNull, int4(10)}
     * @param partManId The value of partManId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setPartManId_LessEqual(Integer partManId) {
        regPartManId(CK_LE, partManId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * part_man_id: {PK, NotNull, int4(10)}
     * @param minNumber The min number of partManId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of partManId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPartManId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValuePartManId(), "part_man_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * part_man_id: {PK, NotNull, int4(10)}
     * @param partManIdList The collection of partManId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPartManId_InScope(Collection<Integer> partManIdList) {
        doSetPartManId_InScope(partManIdList);
    }

    protected void doSetPartManId_InScope(Collection<Integer> partManIdList) {
        regINS(CK_INS, cTL(partManIdList), getCValuePartManId(), "part_man_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * part_man_id: {PK, NotNull, int4(10)}
     * @param partManIdList The collection of partManId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPartManId_NotInScope(Collection<Integer> partManIdList) {
        doSetPartManId_NotInScope(partManIdList);
    }

    protected void doSetPartManId_NotInScope(Collection<Integer> partManIdList) {
        regINS(CK_NINS, cTL(partManIdList), getCValuePartManId(), "part_man_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * part_man_id: {PK, NotNull, int4(10)}
     */
    public void setPartManId_IsNull() { regPartManId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * part_man_id: {PK, NotNull, int4(10)}
     */
    public void setPartManId_IsNotNull() { regPartManId(CK_ISNN, DOBJ); }

    protected void regPartManId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValuePartManId(), "part_man_id"); }
    protected abstract ConditionValue getCValuePartManId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * part_man_name: {NotNull, varchar(2147483647)}
     * @param partManName The value of partManName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setPartManName_Equal(String partManName) {
        doSetPartManName_Equal(fRES(partManName));
    }

    protected void doSetPartManName_Equal(String partManName) {
        regPartManName(CK_EQ, partManName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * part_man_name: {NotNull, varchar(2147483647)}
     * @param partManName The value of partManName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setPartManName_NotEqual(String partManName) {
        doSetPartManName_NotEqual(fRES(partManName));
    }

    protected void doSetPartManName_NotEqual(String partManName) {
        regPartManName(CK_NES, partManName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * part_man_name: {NotNull, varchar(2147483647)}
     * @param partManNameList The collection of partManName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPartManName_InScope(Collection<String> partManNameList) {
        doSetPartManName_InScope(partManNameList);
    }

    public void doSetPartManName_InScope(Collection<String> partManNameList) {
        regINS(CK_INS, cTL(partManNameList), getCValuePartManName(), "part_man_name");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * part_man_name: {NotNull, varchar(2147483647)}
     * @param partManNameList The collection of partManName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPartManName_NotInScope(Collection<String> partManNameList) {
        doSetPartManName_NotInScope(partManNameList);
    }

    public void doSetPartManName_NotInScope(Collection<String> partManNameList) {
        regINS(CK_NINS, cTL(partManNameList), getCValuePartManName(), "part_man_name");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * part_man_name: {NotNull, varchar(2147483647)}
     * @param partManName The value of partManName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setPartManName_PrefixSearch(String partManName) {
        setPartManName_LikeSearch(partManName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * part_man_name: {NotNull, varchar(2147483647)} <br />
     * <pre>e.g. setPartManName_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param partManName The value of partManName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPartManName_LikeSearch(String partManName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(partManName), getCValuePartManName(), "part_man_name", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * part_man_name: {NotNull, varchar(2147483647)}
     * @param partManName The value of partManName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPartManName_NotLikeSearch(String partManName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(partManName), getCValuePartManName(), "part_man_name", likeSearchOption);
    }

    protected void regPartManName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValuePartManName(), "part_man_name"); }
    protected abstract ConditionValue getCValuePartManName();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * part_man_point: {NotNull, int4(10)}
     * @param partManPoint The value of partManPoint as equal. (NullAllowed: if null, no condition)
     */
    public void setPartManPoint_Equal(Integer partManPoint) {
        doSetPartManPoint_Equal(partManPoint);
    }

    protected void doSetPartManPoint_Equal(Integer partManPoint) {
        regPartManPoint(CK_EQ, partManPoint);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * part_man_point: {NotNull, int4(10)}
     * @param partManPoint The value of partManPoint as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setPartManPoint_GreaterThan(Integer partManPoint) {
        regPartManPoint(CK_GT, partManPoint);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * part_man_point: {NotNull, int4(10)}
     * @param partManPoint The value of partManPoint as lessThan. (NullAllowed: if null, no condition)
     */
    public void setPartManPoint_LessThan(Integer partManPoint) {
        regPartManPoint(CK_LT, partManPoint);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * part_man_point: {NotNull, int4(10)}
     * @param partManPoint The value of partManPoint as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setPartManPoint_GreaterEqual(Integer partManPoint) {
        regPartManPoint(CK_GE, partManPoint);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * part_man_point: {NotNull, int4(10)}
     * @param partManPoint The value of partManPoint as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setPartManPoint_LessEqual(Integer partManPoint) {
        regPartManPoint(CK_LE, partManPoint);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * part_man_point: {NotNull, int4(10)}
     * @param minNumber The min number of partManPoint. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of partManPoint. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPartManPoint_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValuePartManPoint(), "part_man_point", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * part_man_point: {NotNull, int4(10)}
     * @param partManPointList The collection of partManPoint as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPartManPoint_InScope(Collection<Integer> partManPointList) {
        doSetPartManPoint_InScope(partManPointList);
    }

    protected void doSetPartManPoint_InScope(Collection<Integer> partManPointList) {
        regINS(CK_INS, cTL(partManPointList), getCValuePartManPoint(), "part_man_point");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * part_man_point: {NotNull, int4(10)}
     * @param partManPointList The collection of partManPoint as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPartManPoint_NotInScope(Collection<Integer> partManPointList) {
        doSetPartManPoint_NotInScope(partManPointList);
    }

    protected void doSetPartManPoint_NotInScope(Collection<Integer> partManPointList) {
        regINS(CK_NINS, cTL(partManPointList), getCValuePartManPoint(), "part_man_point");
    }

    protected void regPartManPoint(ConditionKey ky, Object vl) { regQ(ky, vl, getCValuePartManPoint(), "part_man_point"); }
    protected abstract ConditionValue getCValuePartManPoint();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * part_man_date: {date(13)}
     * @param partManDate The value of partManDate as equal. (NullAllowed: if null, no condition)
     */
    public void setPartManDate_Equal(java.util.Date partManDate) {
        regPartManDate(CK_EQ,  fCTPD(partManDate));
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * part_man_date: {date(13)}
     * @param partManDate The value of partManDate as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setPartManDate_GreaterThan(java.util.Date partManDate) {
        regPartManDate(CK_GT,  fCTPD(partManDate));
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * part_man_date: {date(13)}
     * @param partManDate The value of partManDate as lessThan. (NullAllowed: if null, no condition)
     */
    public void setPartManDate_LessThan(java.util.Date partManDate) {
        regPartManDate(CK_LT,  fCTPD(partManDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * part_man_date: {date(13)}
     * @param partManDate The value of partManDate as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setPartManDate_GreaterEqual(java.util.Date partManDate) {
        regPartManDate(CK_GE,  fCTPD(partManDate));
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * part_man_date: {date(13)}
     * @param partManDate The value of partManDate as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setPartManDate_LessEqual(java.util.Date partManDate) {
        regPartManDate(CK_LE, fCTPD(partManDate));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * part_man_date: {date(13)}
     * <pre>e.g. setPartManDate_FromTo(fromDate, toDate, new <span style="color: #DD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of partManDate. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of partManDate. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setPartManDate_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ(fCTPD(fromDatetime), fCTPD(toDatetime), getCValuePartManDate(), "part_man_date", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * part_man_date: {date(13)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #DD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of partManDate. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of partManDate. (NullAllowed: if null, no to-condition)
     */
    public void setPartManDate_DateFromTo(Date fromDate, Date toDate) {
        setPartManDate_FromTo(fromDate, toDate, new FromToOption().compareAsDate());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * part_man_date: {date(13)}
     */
    public void setPartManDate_IsNull() { regPartManDate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * part_man_date: {date(13)}
     */
    public void setPartManDate_IsNotNull() { regPartManDate(CK_ISNN, DOBJ); }

    protected void regPartManDate(ConditionKey ky, Object vl) { regQ(ky, vl, getCValuePartManDate(), "part_man_date"); }
    protected abstract ConditionValue getCValuePartManDate();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;VendorPartManCB&gt;() {
     *     public void query(VendorPartManCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorPartManCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, VendorPartManCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;VendorPartManCB&gt;() {
     *     public void query(VendorPartManCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorPartManCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, VendorPartManCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;VendorPartManCB&gt;() {
     *     public void query(VendorPartManCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorPartManCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, VendorPartManCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;VendorPartManCB&gt;() {
     *     public void query(VendorPartManCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorPartManCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, VendorPartManCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;VendorPartManCB&gt;() {
     *     public void query(VendorPartManCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorPartManCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, VendorPartManCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;VendorPartManCB&gt;() {
     *     public void query(VendorPartManCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorPartManCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, VendorPartManCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        VendorPartManCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(VendorPartManCQ sq);

    protected VendorPartManCB xcreateScalarConditionCB() {
        VendorPartManCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected VendorPartManCB xcreateScalarConditionPartitionByCB() {
        VendorPartManCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<VendorPartManCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorPartManCB cb = new VendorPartManCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "part_man_id";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(VendorPartManCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<VendorPartManCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(VendorPartManCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorPartManCB cb = new VendorPartManCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "part_man_id";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(VendorPartManCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<VendorPartManCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        VendorPartManCB cb = new VendorPartManCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(VendorPartManCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfInScope(SubQuery<VendorPartManCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        VendorPartManCB cb = new VendorPartManCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(VendorPartManCQ sq);

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
    public void match(List<org.seasar.dbflute.dbmeta.info.ColumnInfo> textColumnList, String conditionValue) {
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
    //                                                                          Compatible
    //                                                                          ==========
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

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected VendorPartManCB newMyCB() {
        return new VendorPartManCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return VendorPartManCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
