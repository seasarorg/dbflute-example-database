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
 * The abstract condition-query of vendor_inherit_neko.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsVendorInheritNekoCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsVendorInheritNekoCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "vendor_inherit_neko";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * inu_id: {NotNull, int4(10)}
     * @param inuId The value of inuId as equal. (NullAllowed: if null, no condition)
     */
    public void setInuId_Equal(Integer inuId) {
        doSetInuId_Equal(inuId);
    }

    protected void doSetInuId_Equal(Integer inuId) {
        regInuId(CK_EQ, inuId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * inu_id: {NotNull, int4(10)}
     * @param inuId The value of inuId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setInuId_GreaterThan(Integer inuId) {
        regInuId(CK_GT, inuId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * inu_id: {NotNull, int4(10)}
     * @param inuId The value of inuId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setInuId_LessThan(Integer inuId) {
        regInuId(CK_LT, inuId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * inu_id: {NotNull, int4(10)}
     * @param inuId The value of inuId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setInuId_GreaterEqual(Integer inuId) {
        regInuId(CK_GE, inuId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * inu_id: {NotNull, int4(10)}
     * @param inuId The value of inuId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setInuId_LessEqual(Integer inuId) {
        regInuId(CK_LE, inuId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * inu_id: {NotNull, int4(10)}
     * @param minNumber The min number of inuId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of inuId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInuId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueInuId(), "inu_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * inu_id: {NotNull, int4(10)}
     * @param inuIdList The collection of inuId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setInuId_InScope(Collection<Integer> inuIdList) {
        doSetInuId_InScope(inuIdList);
    }

    protected void doSetInuId_InScope(Collection<Integer> inuIdList) {
        regINS(CK_INS, cTL(inuIdList), getCValueInuId(), "inu_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * inu_id: {NotNull, int4(10)}
     * @param inuIdList The collection of inuId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setInuId_NotInScope(Collection<Integer> inuIdList) {
        doSetInuId_NotInScope(inuIdList);
    }

    protected void doSetInuId_NotInScope(Collection<Integer> inuIdList) {
        regINS(CK_NINS, cTL(inuIdList), getCValueInuId(), "inu_id");
    }

    protected void regInuId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueInuId(), "inu_id"); }
    protected abstract ConditionValue getCValueInuId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * inu_name: {NotNull, varchar(2147483647)}
     * @param inuName The value of inuName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setInuName_Equal(String inuName) {
        doSetInuName_Equal(fRES(inuName));
    }

    protected void doSetInuName_Equal(String inuName) {
        regInuName(CK_EQ, inuName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * inu_name: {NotNull, varchar(2147483647)}
     * @param inuName The value of inuName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setInuName_NotEqual(String inuName) {
        doSetInuName_NotEqual(fRES(inuName));
    }

    protected void doSetInuName_NotEqual(String inuName) {
        regInuName(CK_NES, inuName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * inu_name: {NotNull, varchar(2147483647)}
     * @param inuNameList The collection of inuName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setInuName_InScope(Collection<String> inuNameList) {
        doSetInuName_InScope(inuNameList);
    }

    public void doSetInuName_InScope(Collection<String> inuNameList) {
        regINS(CK_INS, cTL(inuNameList), getCValueInuName(), "inu_name");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * inu_name: {NotNull, varchar(2147483647)}
     * @param inuNameList The collection of inuName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setInuName_NotInScope(Collection<String> inuNameList) {
        doSetInuName_NotInScope(inuNameList);
    }

    public void doSetInuName_NotInScope(Collection<String> inuNameList) {
        regINS(CK_NINS, cTL(inuNameList), getCValueInuName(), "inu_name");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * inu_name: {NotNull, varchar(2147483647)}
     * @param inuName The value of inuName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setInuName_PrefixSearch(String inuName) {
        setInuName_LikeSearch(inuName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * inu_name: {NotNull, varchar(2147483647)} <br />
     * <pre>e.g. setInuName_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param inuName The value of inuName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInuName_LikeSearch(String inuName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(inuName), getCValueInuName(), "inu_name", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * inu_name: {NotNull, varchar(2147483647)}
     * @param inuName The value of inuName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInuName_NotLikeSearch(String inuName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(inuName), getCValueInuName(), "inu_name", likeSearchOption);
    }

    protected void regInuName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueInuName(), "inu_name"); }
    protected abstract ConditionValue getCValueInuName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * inu_date: {date(13)}
     * @param inuDate The value of inuDate as equal. (NullAllowed: if null, no condition)
     */
    public void setInuDate_Equal(java.util.Date inuDate) {
        regInuDate(CK_EQ,  fCTPD(inuDate));
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * inu_date: {date(13)}
     * @param inuDate The value of inuDate as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setInuDate_GreaterThan(java.util.Date inuDate) {
        regInuDate(CK_GT,  fCTPD(inuDate));
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * inu_date: {date(13)}
     * @param inuDate The value of inuDate as lessThan. (NullAllowed: if null, no condition)
     */
    public void setInuDate_LessThan(java.util.Date inuDate) {
        regInuDate(CK_LT,  fCTPD(inuDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * inu_date: {date(13)}
     * @param inuDate The value of inuDate as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setInuDate_GreaterEqual(java.util.Date inuDate) {
        regInuDate(CK_GE,  fCTPD(inuDate));
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * inu_date: {date(13)}
     * @param inuDate The value of inuDate as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setInuDate_LessEqual(java.util.Date inuDate) {
        regInuDate(CK_LE, fCTPD(inuDate));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * inu_date: {date(13)}
     * <pre>e.g. setInuDate_FromTo(fromDate, toDate, new <span style="color: #DD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of inuDate. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of inuDate. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setInuDate_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ(fCTPD(fromDatetime), fCTPD(toDatetime), getCValueInuDate(), "inu_date", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * inu_date: {date(13)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #DD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of inuDate. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of inuDate. (NullAllowed: if null, no to-condition)
     */
    public void setInuDate_DateFromTo(Date fromDate, Date toDate) {
        setInuDate_FromTo(fromDate, toDate, new FromToOption().compareAsDate());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * inu_date: {date(13)}
     */
    public void setInuDate_IsNull() { regInuDate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * inu_date: {date(13)}
     */
    public void setInuDate_IsNotNull() { regInuDate(CK_ISNN, DOBJ); }

    protected void regInuDate(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueInuDate(), "inu_date"); }
    protected abstract ConditionValue getCValueInuDate();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * neko_id: {PK, NotNull, int4(10)}
     * @param nekoId The value of nekoId as equal. (NullAllowed: if null, no condition)
     */
    public void setNekoId_Equal(Integer nekoId) {
        doSetNekoId_Equal(nekoId);
    }

    protected void doSetNekoId_Equal(Integer nekoId) {
        regNekoId(CK_EQ, nekoId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * neko_id: {PK, NotNull, int4(10)}
     * @param nekoId The value of nekoId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setNekoId_GreaterThan(Integer nekoId) {
        regNekoId(CK_GT, nekoId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * neko_id: {PK, NotNull, int4(10)}
     * @param nekoId The value of nekoId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setNekoId_LessThan(Integer nekoId) {
        regNekoId(CK_LT, nekoId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * neko_id: {PK, NotNull, int4(10)}
     * @param nekoId The value of nekoId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setNekoId_GreaterEqual(Integer nekoId) {
        regNekoId(CK_GE, nekoId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * neko_id: {PK, NotNull, int4(10)}
     * @param nekoId The value of nekoId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setNekoId_LessEqual(Integer nekoId) {
        regNekoId(CK_LE, nekoId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * neko_id: {PK, NotNull, int4(10)}
     * @param minNumber The min number of nekoId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of nekoId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNekoId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueNekoId(), "neko_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * neko_id: {PK, NotNull, int4(10)}
     * @param nekoIdList The collection of nekoId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNekoId_InScope(Collection<Integer> nekoIdList) {
        doSetNekoId_InScope(nekoIdList);
    }

    protected void doSetNekoId_InScope(Collection<Integer> nekoIdList) {
        regINS(CK_INS, cTL(nekoIdList), getCValueNekoId(), "neko_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * neko_id: {PK, NotNull, int4(10)}
     * @param nekoIdList The collection of nekoId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNekoId_NotInScope(Collection<Integer> nekoIdList) {
        doSetNekoId_NotInScope(nekoIdList);
    }

    protected void doSetNekoId_NotInScope(Collection<Integer> nekoIdList) {
        regINS(CK_NINS, cTL(nekoIdList), getCValueNekoId(), "neko_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * neko_id: {PK, NotNull, int4(10)}
     */
    public void setNekoId_IsNull() { regNekoId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * neko_id: {PK, NotNull, int4(10)}
     */
    public void setNekoId_IsNotNull() { regNekoId(CK_ISNN, DOBJ); }

    protected void regNekoId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueNekoId(), "neko_id"); }
    protected abstract ConditionValue getCValueNekoId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * neko_name: {NotNull, varchar(2147483647)}
     * @param nekoName The value of nekoName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setNekoName_Equal(String nekoName) {
        doSetNekoName_Equal(fRES(nekoName));
    }

    protected void doSetNekoName_Equal(String nekoName) {
        regNekoName(CK_EQ, nekoName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * neko_name: {NotNull, varchar(2147483647)}
     * @param nekoName The value of nekoName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setNekoName_NotEqual(String nekoName) {
        doSetNekoName_NotEqual(fRES(nekoName));
    }

    protected void doSetNekoName_NotEqual(String nekoName) {
        regNekoName(CK_NES, nekoName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * neko_name: {NotNull, varchar(2147483647)}
     * @param nekoNameList The collection of nekoName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNekoName_InScope(Collection<String> nekoNameList) {
        doSetNekoName_InScope(nekoNameList);
    }

    public void doSetNekoName_InScope(Collection<String> nekoNameList) {
        regINS(CK_INS, cTL(nekoNameList), getCValueNekoName(), "neko_name");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * neko_name: {NotNull, varchar(2147483647)}
     * @param nekoNameList The collection of nekoName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNekoName_NotInScope(Collection<String> nekoNameList) {
        doSetNekoName_NotInScope(nekoNameList);
    }

    public void doSetNekoName_NotInScope(Collection<String> nekoNameList) {
        regINS(CK_NINS, cTL(nekoNameList), getCValueNekoName(), "neko_name");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * neko_name: {NotNull, varchar(2147483647)}
     * @param nekoName The value of nekoName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setNekoName_PrefixSearch(String nekoName) {
        setNekoName_LikeSearch(nekoName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * neko_name: {NotNull, varchar(2147483647)} <br />
     * <pre>e.g. setNekoName_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param nekoName The value of nekoName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNekoName_LikeSearch(String nekoName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(nekoName), getCValueNekoName(), "neko_name", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * neko_name: {NotNull, varchar(2147483647)}
     * @param nekoName The value of nekoName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNekoName_NotLikeSearch(String nekoName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(nekoName), getCValueNekoName(), "neko_name", likeSearchOption);
    }

    protected void regNekoName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueNekoName(), "neko_name"); }
    protected abstract ConditionValue getCValueNekoName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * neko_date: {date(13)}
     * @param nekoDate The value of nekoDate as equal. (NullAllowed: if null, no condition)
     */
    public void setNekoDate_Equal(java.util.Date nekoDate) {
        regNekoDate(CK_EQ,  fCTPD(nekoDate));
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * neko_date: {date(13)}
     * @param nekoDate The value of nekoDate as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setNekoDate_GreaterThan(java.util.Date nekoDate) {
        regNekoDate(CK_GT,  fCTPD(nekoDate));
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * neko_date: {date(13)}
     * @param nekoDate The value of nekoDate as lessThan. (NullAllowed: if null, no condition)
     */
    public void setNekoDate_LessThan(java.util.Date nekoDate) {
        regNekoDate(CK_LT,  fCTPD(nekoDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * neko_date: {date(13)}
     * @param nekoDate The value of nekoDate as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setNekoDate_GreaterEqual(java.util.Date nekoDate) {
        regNekoDate(CK_GE,  fCTPD(nekoDate));
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * neko_date: {date(13)}
     * @param nekoDate The value of nekoDate as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setNekoDate_LessEqual(java.util.Date nekoDate) {
        regNekoDate(CK_LE, fCTPD(nekoDate));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * neko_date: {date(13)}
     * <pre>e.g. setNekoDate_FromTo(fromDate, toDate, new <span style="color: #DD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of nekoDate. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of nekoDate. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setNekoDate_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ(fCTPD(fromDatetime), fCTPD(toDatetime), getCValueNekoDate(), "neko_date", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * neko_date: {date(13)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #DD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of nekoDate. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of nekoDate. (NullAllowed: if null, no to-condition)
     */
    public void setNekoDate_DateFromTo(Date fromDate, Date toDate) {
        setNekoDate_FromTo(fromDate, toDate, new FromToOption().compareAsDate());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * neko_date: {date(13)}
     */
    public void setNekoDate_IsNull() { regNekoDate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * neko_date: {date(13)}
     */
    public void setNekoDate_IsNotNull() { regNekoDate(CK_ISNN, DOBJ); }

    protected void regNekoDate(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueNekoDate(), "neko_date"); }
    protected abstract ConditionValue getCValueNekoDate();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;VendorInheritNekoCB&gt;() {
     *     public void query(VendorInheritNekoCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorInheritNekoCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, VendorInheritNekoCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;VendorInheritNekoCB&gt;() {
     *     public void query(VendorInheritNekoCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorInheritNekoCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, VendorInheritNekoCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;VendorInheritNekoCB&gt;() {
     *     public void query(VendorInheritNekoCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorInheritNekoCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, VendorInheritNekoCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;VendorInheritNekoCB&gt;() {
     *     public void query(VendorInheritNekoCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorInheritNekoCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, VendorInheritNekoCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;VendorInheritNekoCB&gt;() {
     *     public void query(VendorInheritNekoCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorInheritNekoCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, VendorInheritNekoCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;VendorInheritNekoCB&gt;() {
     *     public void query(VendorInheritNekoCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorInheritNekoCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, VendorInheritNekoCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        VendorInheritNekoCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(VendorInheritNekoCQ sq);

    protected VendorInheritNekoCB xcreateScalarConditionCB() {
        VendorInheritNekoCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected VendorInheritNekoCB xcreateScalarConditionPartitionByCB() {
        VendorInheritNekoCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<VendorInheritNekoCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorInheritNekoCB cb = new VendorInheritNekoCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "neko_id";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(VendorInheritNekoCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<VendorInheritNekoCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(VendorInheritNekoCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorInheritNekoCB cb = new VendorInheritNekoCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "neko_id";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(VendorInheritNekoCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<VendorInheritNekoCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        VendorInheritNekoCB cb = new VendorInheritNekoCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(VendorInheritNekoCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfInScope(SubQuery<VendorInheritNekoCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        VendorInheritNekoCB cb = new VendorInheritNekoCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(VendorInheritNekoCQ sq);

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
    protected VendorInheritNekoCB newMyCB() {
        return new VendorInheritNekoCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return VendorInheritNekoCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
