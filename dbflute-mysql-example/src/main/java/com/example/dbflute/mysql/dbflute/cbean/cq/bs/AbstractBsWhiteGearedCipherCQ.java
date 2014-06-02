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
 * The abstract condition-query of white_geared_cipher.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteGearedCipherCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteGearedCipherCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_geared_cipher";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * CIPHER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param cipherId The value of cipherId as equal. (NullAllowed: if null, no condition)
     */
    public void setCipherId_Equal(Long cipherId) {
        doSetCipherId_Equal(cipherId);
    }

    protected void doSetCipherId_Equal(Long cipherId) {
        regCipherId(CK_EQ, cipherId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * CIPHER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param cipherId The value of cipherId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setCipherId_GreaterThan(Long cipherId) {
        regCipherId(CK_GT, cipherId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * CIPHER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param cipherId The value of cipherId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setCipherId_LessThan(Long cipherId) {
        regCipherId(CK_LT, cipherId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * CIPHER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param cipherId The value of cipherId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setCipherId_GreaterEqual(Long cipherId) {
        regCipherId(CK_GE, cipherId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * CIPHER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param cipherId The value of cipherId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setCipherId_LessEqual(Long cipherId) {
        regCipherId(CK_LE, cipherId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * CIPHER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of cipherId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of cipherId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCipherId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueCipherId(), "CIPHER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * CIPHER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param cipherIdList The collection of cipherId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCipherId_InScope(Collection<Long> cipherIdList) {
        doSetCipherId_InScope(cipherIdList);
    }

    protected void doSetCipherId_InScope(Collection<Long> cipherIdList) {
        regINS(CK_INS, cTL(cipherIdList), getCValueCipherId(), "CIPHER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * CIPHER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param cipherIdList The collection of cipherId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCipherId_NotInScope(Collection<Long> cipherIdList) {
        doSetCipherId_NotInScope(cipherIdList);
    }

    protected void doSetCipherId_NotInScope(Collection<Long> cipherIdList) {
        regINS(CK_NINS, cTL(cipherIdList), getCValueCipherId(), "CIPHER_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * CIPHER_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setCipherId_IsNull() { regCipherId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * CIPHER_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setCipherId_IsNotNull() { regCipherId(CK_ISNN, DOBJ); }

    protected void regCipherId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueCipherId(), "CIPHER_ID"); }
    protected abstract ConditionValue getCValueCipherId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * CIPHER_INTEGER: {VARCHAR(100)}
     * @param cipherInteger The value of cipherInteger as equal. (NullAllowed: if null, no condition)
     */
    public void setCipherInteger_Equal(Integer cipherInteger) {
        doSetCipherInteger_Equal(cipherInteger);
    }

    protected void doSetCipherInteger_Equal(Integer cipherInteger) {
        regCipherInteger(CK_EQ, cipherInteger);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * CIPHER_INTEGER: {VARCHAR(100)}
     * @param cipherInteger The value of cipherInteger as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setCipherInteger_GreaterThan(Integer cipherInteger) {
        regCipherInteger(CK_GT, cipherInteger);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * CIPHER_INTEGER: {VARCHAR(100)}
     * @param cipherInteger The value of cipherInteger as lessThan. (NullAllowed: if null, no condition)
     */
    public void setCipherInteger_LessThan(Integer cipherInteger) {
        regCipherInteger(CK_LT, cipherInteger);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * CIPHER_INTEGER: {VARCHAR(100)}
     * @param cipherInteger The value of cipherInteger as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setCipherInteger_GreaterEqual(Integer cipherInteger) {
        regCipherInteger(CK_GE, cipherInteger);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * CIPHER_INTEGER: {VARCHAR(100)}
     * @param cipherInteger The value of cipherInteger as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setCipherInteger_LessEqual(Integer cipherInteger) {
        regCipherInteger(CK_LE, cipherInteger);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * CIPHER_INTEGER: {VARCHAR(100)}
     * @param minNumber The min number of cipherInteger. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of cipherInteger. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCipherInteger_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueCipherInteger(), "CIPHER_INTEGER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * CIPHER_INTEGER: {VARCHAR(100)}
     * @param cipherIntegerList The collection of cipherInteger as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCipherInteger_InScope(Collection<Integer> cipherIntegerList) {
        doSetCipherInteger_InScope(cipherIntegerList);
    }

    protected void doSetCipherInteger_InScope(Collection<Integer> cipherIntegerList) {
        regINS(CK_INS, cTL(cipherIntegerList), getCValueCipherInteger(), "CIPHER_INTEGER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * CIPHER_INTEGER: {VARCHAR(100)}
     * @param cipherIntegerList The collection of cipherInteger as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCipherInteger_NotInScope(Collection<Integer> cipherIntegerList) {
        doSetCipherInteger_NotInScope(cipherIntegerList);
    }

    protected void doSetCipherInteger_NotInScope(Collection<Integer> cipherIntegerList) {
        regINS(CK_NINS, cTL(cipherIntegerList), getCValueCipherInteger(), "CIPHER_INTEGER");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * CIPHER_INTEGER: {VARCHAR(100)}
     */
    public void setCipherInteger_IsNull() { regCipherInteger(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * CIPHER_INTEGER: {VARCHAR(100)}
     */
    public void setCipherInteger_IsNotNull() { regCipherInteger(CK_ISNN, DOBJ); }

    protected void regCipherInteger(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueCipherInteger(), "CIPHER_INTEGER"); }
    protected abstract ConditionValue getCValueCipherInteger();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * CIPHER_VARCHAR: {VARCHAR(100)}
     * @param cipherVarchar The value of cipherVarchar as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setCipherVarchar_Equal(String cipherVarchar) {
        doSetCipherVarchar_Equal(fRES(cipherVarchar));
    }

    protected void doSetCipherVarchar_Equal(String cipherVarchar) {
        regCipherVarchar(CK_EQ, cipherVarchar);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * CIPHER_VARCHAR: {VARCHAR(100)}
     * @param cipherVarchar The value of cipherVarchar as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setCipherVarchar_NotEqual(String cipherVarchar) {
        doSetCipherVarchar_NotEqual(fRES(cipherVarchar));
    }

    protected void doSetCipherVarchar_NotEqual(String cipherVarchar) {
        regCipherVarchar(CK_NES, cipherVarchar);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * CIPHER_VARCHAR: {VARCHAR(100)}
     * @param cipherVarcharList The collection of cipherVarchar as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCipherVarchar_InScope(Collection<String> cipherVarcharList) {
        doSetCipherVarchar_InScope(cipherVarcharList);
    }

    public void doSetCipherVarchar_InScope(Collection<String> cipherVarcharList) {
        regINS(CK_INS, cTL(cipherVarcharList), getCValueCipherVarchar(), "CIPHER_VARCHAR");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * CIPHER_VARCHAR: {VARCHAR(100)}
     * @param cipherVarcharList The collection of cipherVarchar as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCipherVarchar_NotInScope(Collection<String> cipherVarcharList) {
        doSetCipherVarchar_NotInScope(cipherVarcharList);
    }

    public void doSetCipherVarchar_NotInScope(Collection<String> cipherVarcharList) {
        regINS(CK_NINS, cTL(cipherVarcharList), getCValueCipherVarchar(), "CIPHER_VARCHAR");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * CIPHER_VARCHAR: {VARCHAR(100)}
     * @param cipherVarchar The value of cipherVarchar as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setCipherVarchar_PrefixSearch(String cipherVarchar) {
        setCipherVarchar_LikeSearch(cipherVarchar, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * CIPHER_VARCHAR: {VARCHAR(100)} <br />
     * <pre>e.g. setCipherVarchar_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param cipherVarchar The value of cipherVarchar as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCipherVarchar_LikeSearch(String cipherVarchar, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(cipherVarchar), getCValueCipherVarchar(), "CIPHER_VARCHAR", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * CIPHER_VARCHAR: {VARCHAR(100)}
     * @param cipherVarchar The value of cipherVarchar as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCipherVarchar_NotLikeSearch(String cipherVarchar, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(cipherVarchar), getCValueCipherVarchar(), "CIPHER_VARCHAR", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * CIPHER_VARCHAR: {VARCHAR(100)}
     */
    public void setCipherVarchar_IsNull() { regCipherVarchar(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * CIPHER_VARCHAR: {VARCHAR(100)}
     */
    public void setCipherVarchar_IsNullOrEmpty() { regCipherVarchar(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * CIPHER_VARCHAR: {VARCHAR(100)}
     */
    public void setCipherVarchar_IsNotNull() { regCipherVarchar(CK_ISNN, DOBJ); }

    protected void regCipherVarchar(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueCipherVarchar(), "CIPHER_VARCHAR"); }
    protected abstract ConditionValue getCValueCipherVarchar();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * CIPHER__DATE: {VARCHAR(100)}
     * @param cipherDate The value of cipherDate as equal. (NullAllowed: if null, no condition)
     */
    public void setCipherDate_Equal(java.util.Date cipherDate) {
        regCipherDate(CK_EQ,  fCTPD(cipherDate));
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * CIPHER__DATE: {VARCHAR(100)}
     * @param cipherDate The value of cipherDate as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setCipherDate_GreaterThan(java.util.Date cipherDate) {
        regCipherDate(CK_GT,  fCTPD(cipherDate));
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * CIPHER__DATE: {VARCHAR(100)}
     * @param cipherDate The value of cipherDate as lessThan. (NullAllowed: if null, no condition)
     */
    public void setCipherDate_LessThan(java.util.Date cipherDate) {
        regCipherDate(CK_LT,  fCTPD(cipherDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * CIPHER__DATE: {VARCHAR(100)}
     * @param cipherDate The value of cipherDate as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setCipherDate_GreaterEqual(java.util.Date cipherDate) {
        regCipherDate(CK_GE,  fCTPD(cipherDate));
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * CIPHER__DATE: {VARCHAR(100)}
     * @param cipherDate The value of cipherDate as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setCipherDate_LessEqual(java.util.Date cipherDate) {
        regCipherDate(CK_LE, fCTPD(cipherDate));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * CIPHER__DATE: {VARCHAR(100)}
     * <pre>e.g. setCipherDate_FromTo(fromDate, toDate, new <span style="color: #DD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of cipherDate. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of cipherDate. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setCipherDate_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ(fCTPD(fromDatetime), fCTPD(toDatetime), getCValueCipherDate(), "CIPHER__DATE", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * CIPHER__DATE: {VARCHAR(100)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #DD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of cipherDate. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of cipherDate. (NullAllowed: if null, no to-condition)
     */
    public void setCipherDate_DateFromTo(Date fromDate, Date toDate) {
        setCipherDate_FromTo(fromDate, toDate, new FromToOption().compareAsDate());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * CIPHER__DATE: {VARCHAR(100)}
     */
    public void setCipherDate_IsNull() { regCipherDate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * CIPHER__DATE: {VARCHAR(100)}
     */
    public void setCipherDate_IsNotNull() { regCipherDate(CK_ISNN, DOBJ); }

    protected void regCipherDate(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueCipherDate(), "CIPHER__DATE"); }
    protected abstract ConditionValue getCValueCipherDate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * CIPHER__DATETIME: {VARCHAR(100)}
     * @param cipherDatetime The value of cipherDatetime as equal. (NullAllowed: if null, no condition)
     */
    public void setCipherDatetime_Equal(java.sql.Timestamp cipherDatetime) {
        regCipherDatetime(CK_EQ,  cipherDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * CIPHER__DATETIME: {VARCHAR(100)}
     * @param cipherDatetime The value of cipherDatetime as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setCipherDatetime_GreaterThan(java.sql.Timestamp cipherDatetime) {
        regCipherDatetime(CK_GT,  cipherDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * CIPHER__DATETIME: {VARCHAR(100)}
     * @param cipherDatetime The value of cipherDatetime as lessThan. (NullAllowed: if null, no condition)
     */
    public void setCipherDatetime_LessThan(java.sql.Timestamp cipherDatetime) {
        regCipherDatetime(CK_LT,  cipherDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * CIPHER__DATETIME: {VARCHAR(100)}
     * @param cipherDatetime The value of cipherDatetime as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setCipherDatetime_GreaterEqual(java.sql.Timestamp cipherDatetime) {
        regCipherDatetime(CK_GE,  cipherDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * CIPHER__DATETIME: {VARCHAR(100)}
     * @param cipherDatetime The value of cipherDatetime as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setCipherDatetime_LessEqual(java.sql.Timestamp cipherDatetime) {
        regCipherDatetime(CK_LE, cipherDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * CIPHER__DATETIME: {VARCHAR(100)}
     * <pre>e.g. setCipherDatetime_FromTo(fromDate, toDate, new <span style="color: #DD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of cipherDatetime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of cipherDatetime. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setCipherDatetime_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), getCValueCipherDatetime(), "CIPHER__DATETIME", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * CIPHER__DATETIME: {VARCHAR(100)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #DD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of cipherDatetime. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of cipherDatetime. (NullAllowed: if null, no to-condition)
     */
    public void setCipherDatetime_DateFromTo(Date fromDate, Date toDate) {
        setCipherDatetime_FromTo(fromDate, toDate, new FromToOption().compareAsDate());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * CIPHER__DATETIME: {VARCHAR(100)}
     */
    public void setCipherDatetime_IsNull() { regCipherDatetime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * CIPHER__DATETIME: {VARCHAR(100)}
     */
    public void setCipherDatetime_IsNotNull() { regCipherDatetime(CK_ISNN, DOBJ); }

    protected void regCipherDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueCipherDatetime(), "CIPHER__DATETIME"); }
    protected abstract ConditionValue getCValueCipherDatetime();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteGearedCipherCB&gt;() {
     *     public void query(WhiteGearedCipherCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteGearedCipherCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand(), WhiteGearedCipherCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteGearedCipherCB&gt;() {
     *     public void query(WhiteGearedCipherCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteGearedCipherCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand(), WhiteGearedCipherCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteGearedCipherCB&gt;() {
     *     public void query(WhiteGearedCipherCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteGearedCipherCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand(), WhiteGearedCipherCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteGearedCipherCB&gt;() {
     *     public void query(WhiteGearedCipherCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteGearedCipherCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand(), WhiteGearedCipherCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteGearedCipherCB&gt;() {
     *     public void query(WhiteGearedCipherCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteGearedCipherCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand(), WhiteGearedCipherCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteGearedCipherCB&gt;() {
     *     public void query(WhiteGearedCipherCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteGearedCipherCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand(), WhiteGearedCipherCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WhiteGearedCipherCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhiteGearedCipherCQ sq);

    protected WhiteGearedCipherCB xcreateScalarConditionCB() {
        WhiteGearedCipherCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteGearedCipherCB xcreateScalarConditionPartitionByCB() {
        WhiteGearedCipherCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteGearedCipherCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteGearedCipherCB cb = new WhiteGearedCipherCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "CIPHER_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteGearedCipherCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteGearedCipherCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteGearedCipherCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteGearedCipherCB cb = new WhiteGearedCipherCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "CIPHER_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteGearedCipherCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteGearedCipherCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteGearedCipherCB cb = new WhiteGearedCipherCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteGearedCipherCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteGearedCipherCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteGearedCipherCB cb = new WhiteGearedCipherCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(WhiteGearedCipherCQ sq);

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
    protected WhiteGearedCipherCB newMyCB() {
        return new WhiteGearedCipherCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return WhiteGearedCipherCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
