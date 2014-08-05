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
 * The abstract condition-query of white_additional.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteAdditionalCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteAdditionalCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_additional";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * foo_id: {PK, ID, NotNull, INTEGER}
     * @param fooId The value of fooId as equal. (NullAllowed: if null, no condition)
     */
    public void setFooId_Equal(Integer fooId) {
        doSetFooId_Equal(fooId);
    }

    protected void doSetFooId_Equal(Integer fooId) {
        regFooId(CK_EQ, fooId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * foo_id: {PK, ID, NotNull, INTEGER}
     * @param fooId The value of fooId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setFooId_GreaterThan(Integer fooId) {
        regFooId(CK_GT, fooId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * foo_id: {PK, ID, NotNull, INTEGER}
     * @param fooId The value of fooId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setFooId_LessThan(Integer fooId) {
        regFooId(CK_LT, fooId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * foo_id: {PK, ID, NotNull, INTEGER}
     * @param fooId The value of fooId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setFooId_GreaterEqual(Integer fooId) {
        regFooId(CK_GE, fooId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * foo_id: {PK, ID, NotNull, INTEGER}
     * @param fooId The value of fooId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setFooId_LessEqual(Integer fooId) {
        regFooId(CK_LE, fooId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * foo_id: {PK, ID, NotNull, INTEGER}
     * @param minNumber The min number of fooId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of fooId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setFooId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueFooId(), "foo_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * foo_id: {PK, ID, NotNull, INTEGER}
     * @param fooIdList The collection of fooId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFooId_InScope(Collection<Integer> fooIdList) {
        doSetFooId_InScope(fooIdList);
    }

    protected void doSetFooId_InScope(Collection<Integer> fooIdList) {
        regINS(CK_INS, cTL(fooIdList), getCValueFooId(), "foo_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * foo_id: {PK, ID, NotNull, INTEGER}
     * @param fooIdList The collection of fooId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFooId_NotInScope(Collection<Integer> fooIdList) {
        doSetFooId_NotInScope(fooIdList);
    }

    protected void doSetFooId_NotInScope(Collection<Integer> fooIdList) {
        regINS(CK_NINS, cTL(fooIdList), getCValueFooId(), "foo_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * foo_id: {PK, ID, NotNull, INTEGER}
     */
    public void setFooId_IsNull() { regFooId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * foo_id: {PK, ID, NotNull, INTEGER}
     */
    public void setFooId_IsNotNull() { regFooId(CK_ISNN, DOBJ); }

    protected void regFooId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueFooId(), "foo_id"); }
    protected abstract ConditionValue getCValueFooId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (Mr.FOO's name)foo_name: {NotNull, UnknownType(123)}
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
     * (Mr.FOO's name)foo_name: {NotNull, UnknownType(123)}
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
     * (Mr.FOO's name)foo_name: {NotNull, UnknownType(123)}
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
     * (Mr.FOO's name)foo_name: {NotNull, UnknownType(123)}
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
     * (Mr.FOO's name)foo_name: {NotNull, UnknownType(123)}
     * @param fooName The value of fooName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setFooName_PrefixSearch(String fooName) {
        setFooName_LikeSearch(fooName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (Mr.FOO's name)foo_name: {NotNull, UnknownType(123)} <br />
     * <pre>e.g. setFooName_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fooName The value of fooName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFooName_LikeSearch(String fooName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fooName), getCValueFooName(), "foo_name", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (Mr.FOO's name)foo_name: {NotNull, UnknownType(123)}
     * @param fooName The value of fooName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFooName_NotLikeSearch(String fooName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fooName), getCValueFooName(), "foo_name", likeSearchOption);
    }

    protected void regFooName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueFooName(), "foo_name"); }
    protected abstract ConditionValue getCValueFooName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * foo_date: {UnknownType}
     * @param fooDate The value of fooDate as equal. (NullAllowed: if null, no condition)
     */
    public void setFooDate_Equal(java.util.Date fooDate) {
        regFooDate(CK_EQ,  fCTPD(fooDate));
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * foo_date: {UnknownType}
     * @param fooDate The value of fooDate as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setFooDate_GreaterThan(java.util.Date fooDate) {
        regFooDate(CK_GT,  fCTPD(fooDate));
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * foo_date: {UnknownType}
     * @param fooDate The value of fooDate as lessThan. (NullAllowed: if null, no condition)
     */
    public void setFooDate_LessThan(java.util.Date fooDate) {
        regFooDate(CK_LT,  fCTPD(fooDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * foo_date: {UnknownType}
     * @param fooDate The value of fooDate as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setFooDate_GreaterEqual(java.util.Date fooDate) {
        regFooDate(CK_GE,  fCTPD(fooDate));
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * foo_date: {UnknownType}
     * @param fooDate The value of fooDate as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setFooDate_LessEqual(java.util.Date fooDate) {
        regFooDate(CK_LE, fCTPD(fooDate));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * foo_date: {UnknownType}
     * <pre>e.g. setFooDate_FromTo(fromDate, toDate, new <span style="color: #DD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of fooDate. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of fooDate. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setFooDate_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ(fCTPD(fromDatetime), fCTPD(toDatetime), getCValueFooDate(), "foo_date", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * foo_date: {UnknownType}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #DD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of fooDate. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of fooDate. (NullAllowed: if null, no to-condition)
     */
    public void setFooDate_DateFromTo(Date fromDate, Date toDate) {
        setFooDate_FromTo(fromDate, toDate, new FromToOption().compareAsDate());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * foo_date: {UnknownType}
     */
    public void setFooDate_IsNull() { regFooDate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * foo_date: {UnknownType}
     */
    public void setFooDate_IsNotNull() { regFooDate(CK_ISNN, DOBJ); }

    protected void regFooDate(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueFooDate(), "foo_date"); }
    protected abstract ConditionValue getCValueFooDate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * register_datetime: {DATETIME, default=[CURRENT_TIMESTAMP]}
     * @param registerDatetime The value of registerDatetime as equal. (NullAllowed: if null, no condition)
     */
    public void setRegisterDatetime_Equal(java.sql.Timestamp registerDatetime) {
        regRegisterDatetime(CK_EQ,  registerDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * register_datetime: {DATETIME, default=[CURRENT_TIMESTAMP]}
     * @param registerDatetime The value of registerDatetime as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setRegisterDatetime_GreaterThan(java.sql.Timestamp registerDatetime) {
        regRegisterDatetime(CK_GT,  registerDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * register_datetime: {DATETIME, default=[CURRENT_TIMESTAMP]}
     * @param registerDatetime The value of registerDatetime as lessThan. (NullAllowed: if null, no condition)
     */
    public void setRegisterDatetime_LessThan(java.sql.Timestamp registerDatetime) {
        regRegisterDatetime(CK_LT,  registerDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * register_datetime: {DATETIME, default=[CURRENT_TIMESTAMP]}
     * @param registerDatetime The value of registerDatetime as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setRegisterDatetime_GreaterEqual(java.sql.Timestamp registerDatetime) {
        regRegisterDatetime(CK_GE,  registerDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * register_datetime: {DATETIME, default=[CURRENT_TIMESTAMP]}
     * <pre>e.g. setRegisterDatetime_FromTo(fromDate, toDate, new <span style="color: #DD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setRegisterDatetime_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), getCValueRegisterDatetime(), "register_datetime", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * register_datetime: {DATETIME, default=[CURRENT_TIMESTAMP]}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #DD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of registerDatetime. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of registerDatetime. (NullAllowed: if null, no to-condition)
     */
    public void setRegisterDatetime_DateFromTo(Date fromDate, Date toDate) {
        setRegisterDatetime_FromTo(fromDate, toDate, new FromToOption().compareAsDate());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * register_datetime: {DATETIME, default=[CURRENT_TIMESTAMP]}
     */
    public void setRegisterDatetime_IsNull() { regRegisterDatetime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * register_datetime: {DATETIME, default=[CURRENT_TIMESTAMP]}
     */
    public void setRegisterDatetime_IsNotNull() { regRegisterDatetime(CK_ISNN, DOBJ); }

    protected void regRegisterDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueRegisterDatetime(), "register_datetime"); }
    protected abstract ConditionValue getCValueRegisterDatetime();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteAdditionalCB&gt;() {
     *     public void query(WhiteAdditionalCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteAdditionalCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, WhiteAdditionalCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteAdditionalCB&gt;() {
     *     public void query(WhiteAdditionalCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteAdditionalCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, WhiteAdditionalCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteAdditionalCB&gt;() {
     *     public void query(WhiteAdditionalCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteAdditionalCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, WhiteAdditionalCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteAdditionalCB&gt;() {
     *     public void query(WhiteAdditionalCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteAdditionalCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, WhiteAdditionalCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteAdditionalCB&gt;() {
     *     public void query(WhiteAdditionalCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteAdditionalCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, WhiteAdditionalCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteAdditionalCB&gt;() {
     *     public void query(WhiteAdditionalCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteAdditionalCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, WhiteAdditionalCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WhiteAdditionalCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhiteAdditionalCQ sq);

    protected WhiteAdditionalCB xcreateScalarConditionCB() {
        WhiteAdditionalCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteAdditionalCB xcreateScalarConditionPartitionByCB() {
        WhiteAdditionalCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteAdditionalCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteAdditionalCB cb = new WhiteAdditionalCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "foo_id";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteAdditionalCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteAdditionalCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteAdditionalCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteAdditionalCB cb = new WhiteAdditionalCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "foo_id";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteAdditionalCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteAdditionalCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteAdditionalCB cb = new WhiteAdditionalCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteAdditionalCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteAdditionalCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteAdditionalCB cb = new WhiteAdditionalCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(WhiteAdditionalCQ sq);

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

    @Override
    protected void filterFromToOption(FromToOption option) {
        option.allowOneSide();
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected WhiteAdditionalCB newMyCB() {
        return new WhiteAdditionalCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return WhiteAdditionalCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
