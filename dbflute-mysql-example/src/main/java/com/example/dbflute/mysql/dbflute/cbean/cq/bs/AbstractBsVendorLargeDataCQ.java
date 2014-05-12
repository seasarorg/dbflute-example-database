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
 * The abstract condition-query of vendor_large_data.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsVendorLargeDataCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsVendorLargeDataCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "vendor_large_data";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * LARGE_DATA_ID: {PK, NotNull, BIGINT(19)}
     * @param largeDataId The value of largeDataId as equal. (NullAllowed: if null, no condition)
     */
    public void setLargeDataId_Equal(Long largeDataId) {
        doSetLargeDataId_Equal(largeDataId);
    }

    protected void doSetLargeDataId_Equal(Long largeDataId) {
        regLargeDataId(CK_EQ, largeDataId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * LARGE_DATA_ID: {PK, NotNull, BIGINT(19)}
     * @param largeDataId The value of largeDataId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setLargeDataId_GreaterThan(Long largeDataId) {
        regLargeDataId(CK_GT, largeDataId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * LARGE_DATA_ID: {PK, NotNull, BIGINT(19)}
     * @param largeDataId The value of largeDataId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setLargeDataId_LessThan(Long largeDataId) {
        regLargeDataId(CK_LT, largeDataId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * LARGE_DATA_ID: {PK, NotNull, BIGINT(19)}
     * @param largeDataId The value of largeDataId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setLargeDataId_GreaterEqual(Long largeDataId) {
        regLargeDataId(CK_GE, largeDataId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * LARGE_DATA_ID: {PK, NotNull, BIGINT(19)}
     * @param largeDataId The value of largeDataId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setLargeDataId_LessEqual(Long largeDataId) {
        regLargeDataId(CK_LE, largeDataId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * LARGE_DATA_ID: {PK, NotNull, BIGINT(19)}
     * @param minNumber The min number of largeDataId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of largeDataId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLargeDataId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueLargeDataId(), "LARGE_DATA_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * LARGE_DATA_ID: {PK, NotNull, BIGINT(19)}
     * @param largeDataIdList The collection of largeDataId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLargeDataId_InScope(Collection<Long> largeDataIdList) {
        doSetLargeDataId_InScope(largeDataIdList);
    }

    protected void doSetLargeDataId_InScope(Collection<Long> largeDataIdList) {
        regINS(CK_INS, cTL(largeDataIdList), getCValueLargeDataId(), "LARGE_DATA_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * LARGE_DATA_ID: {PK, NotNull, BIGINT(19)}
     * @param largeDataIdList The collection of largeDataId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLargeDataId_NotInScope(Collection<Long> largeDataIdList) {
        doSetLargeDataId_NotInScope(largeDataIdList);
    }

    protected void doSetLargeDataId_NotInScope(Collection<Long> largeDataIdList) {
        regINS(CK_NINS, cTL(largeDataIdList), getCValueLargeDataId(), "LARGE_DATA_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br />
     * {exists (select LARGE_DATA_ID from vendor_large_data_ref where ...)} <br />
     * vendor_large_data_ref by LARGE_DATA_ID, named 'vendorLargeDataRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">existsVendorLargeDataRefList</span>(new SubQuery&lt;VendorLargeDataRefCB&gt;() {
     *     public void query(VendorLargeDataRefCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of VendorLargeDataRefList for 'exists'. (NotNull)
     */
    public void existsVendorLargeDataRefList(SubQuery<VendorLargeDataRefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        VendorLargeDataRefCB cb = new VendorLargeDataRefCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepLargeDataId_ExistsReferrer_VendorLargeDataRefList(cb.query());
        registerExistsReferrer(cb.query(), "LARGE_DATA_ID", "LARGE_DATA_ID", pp, "vendorLargeDataRefList");
    }
    public abstract String keepLargeDataId_ExistsReferrer_VendorLargeDataRefList(VendorLargeDataRefCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select LARGE_DATA_ID from vendor_large_data_ref where ...)} <br />
     * vendor_large_data_ref by LARGE_DATA_ID, named 'vendorLargeDataRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">notExistsVendorLargeDataRefList</span>(new SubQuery&lt;VendorLargeDataRefCB&gt;() {
     *     public void query(VendorLargeDataRefCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of LargeDataId_NotExistsReferrer_VendorLargeDataRefList for 'not exists'. (NotNull)
     */
    public void notExistsVendorLargeDataRefList(SubQuery<VendorLargeDataRefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        VendorLargeDataRefCB cb = new VendorLargeDataRefCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepLargeDataId_NotExistsReferrer_VendorLargeDataRefList(cb.query());
        registerNotExistsReferrer(cb.query(), "LARGE_DATA_ID", "LARGE_DATA_ID", pp, "vendorLargeDataRefList");
    }
    public abstract String keepLargeDataId_NotExistsReferrer_VendorLargeDataRefList(VendorLargeDataRefCQ sq);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select LARGE_DATA_ID from vendor_large_data_ref where ...)} <br />
     * vendor_large_data_ref by LARGE_DATA_ID, named 'vendorLargeDataRefAsOne'.
     * @param subQuery The sub-query of VendorLargeDataRefList for 'in-scope'. (NotNull)
     */
    public void inScopeVendorLargeDataRefList(SubQuery<VendorLargeDataRefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        VendorLargeDataRefCB cb = new VendorLargeDataRefCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepLargeDataId_InScopeRelation_VendorLargeDataRefList(cb.query());
        registerInScopeRelation(cb.query(), "LARGE_DATA_ID", "LARGE_DATA_ID", pp, "vendorLargeDataRefList");
    }
    public abstract String keepLargeDataId_InScopeRelation_VendorLargeDataRefList(VendorLargeDataRefCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select LARGE_DATA_ID from vendor_large_data_ref where ...)} <br />
     * vendor_large_data_ref by LARGE_DATA_ID, named 'vendorLargeDataRefAsOne'.
     * @param subQuery The sub-query of VendorLargeDataRefList for 'not in-scope'. (NotNull)
     */
    public void notInScopeVendorLargeDataRefList(SubQuery<VendorLargeDataRefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        VendorLargeDataRefCB cb = new VendorLargeDataRefCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepLargeDataId_NotInScopeRelation_VendorLargeDataRefList(cb.query());
        registerNotInScopeRelation(cb.query(), "LARGE_DATA_ID", "LARGE_DATA_ID", pp, "vendorLargeDataRefList");
    }
    public abstract String keepLargeDataId_NotInScopeRelation_VendorLargeDataRefList(VendorLargeDataRefCQ sq);

    public void xsderiveVendorLargeDataRefList(String fn, SubQuery<VendorLargeDataRefCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorLargeDataRefCB cb = new VendorLargeDataRefCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepLargeDataId_SpecifyDerivedReferrer_VendorLargeDataRefList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "LARGE_DATA_ID", "LARGE_DATA_ID", pp, "vendorLargeDataRefList", al, op);
    }
    public abstract String keepLargeDataId_SpecifyDerivedReferrer_VendorLargeDataRefList(VendorLargeDataRefCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from vendor_large_data_ref where ...)} <br />
     * vendor_large_data_ref by LARGE_DATA_ID, named 'vendorLargeDataRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">derivedVendorLargeDataRefList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;VendorLargeDataRefCB&gt;() {
     *     public void query(VendorLargeDataRefCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #DD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<VendorLargeDataRefCB> derivedVendorLargeDataRefList() {
        return xcreateQDRFunctionVendorLargeDataRefList();
    }
    protected HpQDRFunction<VendorLargeDataRefCB> xcreateQDRFunctionVendorLargeDataRefList() {
        return new HpQDRFunction<VendorLargeDataRefCB>(new HpQDRSetupper<VendorLargeDataRefCB>() {
            public void setup(String fn, SubQuery<VendorLargeDataRefCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveVendorLargeDataRefList(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveVendorLargeDataRefList(String fn, SubQuery<VendorLargeDataRefCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorLargeDataRefCB cb = new VendorLargeDataRefCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String sqpp = keepLargeDataId_QueryDerivedReferrer_VendorLargeDataRefList(cb.query()); String prpp = keepLargeDataId_QueryDerivedReferrer_VendorLargeDataRefListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "LARGE_DATA_ID", "LARGE_DATA_ID", sqpp, "vendorLargeDataRefList", rd, vl, prpp, op);
    }
    public abstract String keepLargeDataId_QueryDerivedReferrer_VendorLargeDataRefList(VendorLargeDataRefCQ sq);
    public abstract String keepLargeDataId_QueryDerivedReferrer_VendorLargeDataRefListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * LARGE_DATA_ID: {PK, NotNull, BIGINT(19)}
     */
    public void setLargeDataId_IsNull() { regLargeDataId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * LARGE_DATA_ID: {PK, NotNull, BIGINT(19)}
     */
    public void setLargeDataId_IsNotNull() { regLargeDataId(CK_ISNN, DOBJ); }

    protected void regLargeDataId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueLargeDataId(), "LARGE_DATA_ID"); }
    protected abstract ConditionValue getCValueLargeDataId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * STRING_INDEX: {IX, NotNull, VARCHAR(180)}
     * @param stringIndex The value of stringIndex as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setStringIndex_Equal(String stringIndex) {
        doSetStringIndex_Equal(fRES(stringIndex));
    }

    protected void doSetStringIndex_Equal(String stringIndex) {
        regStringIndex(CK_EQ, stringIndex);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * STRING_INDEX: {IX, NotNull, VARCHAR(180)}
     * @param stringIndex The value of stringIndex as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setStringIndex_NotEqual(String stringIndex) {
        doSetStringIndex_NotEqual(fRES(stringIndex));
    }

    protected void doSetStringIndex_NotEqual(String stringIndex) {
        regStringIndex(CK_NES, stringIndex);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * STRING_INDEX: {IX, NotNull, VARCHAR(180)}
     * @param stringIndexList The collection of stringIndex as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setStringIndex_InScope(Collection<String> stringIndexList) {
        doSetStringIndex_InScope(stringIndexList);
    }

    public void doSetStringIndex_InScope(Collection<String> stringIndexList) {
        regINS(CK_INS, cTL(stringIndexList), getCValueStringIndex(), "STRING_INDEX");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * STRING_INDEX: {IX, NotNull, VARCHAR(180)}
     * @param stringIndexList The collection of stringIndex as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setStringIndex_NotInScope(Collection<String> stringIndexList) {
        doSetStringIndex_NotInScope(stringIndexList);
    }

    public void doSetStringIndex_NotInScope(Collection<String> stringIndexList) {
        regINS(CK_NINS, cTL(stringIndexList), getCValueStringIndex(), "STRING_INDEX");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * STRING_INDEX: {IX, NotNull, VARCHAR(180)}
     * @param stringIndex The value of stringIndex as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setStringIndex_PrefixSearch(String stringIndex) {
        setStringIndex_LikeSearch(stringIndex, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * STRING_INDEX: {IX, NotNull, VARCHAR(180)} <br />
     * <pre>e.g. setStringIndex_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param stringIndex The value of stringIndex as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStringIndex_LikeSearch(String stringIndex, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(stringIndex), getCValueStringIndex(), "STRING_INDEX", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * STRING_INDEX: {IX, NotNull, VARCHAR(180)}
     * @param stringIndex The value of stringIndex as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStringIndex_NotLikeSearch(String stringIndex, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(stringIndex), getCValueStringIndex(), "STRING_INDEX", likeSearchOption);
    }

    protected void regStringIndex(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueStringIndex(), "STRING_INDEX"); }
    protected abstract ConditionValue getCValueStringIndex();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * STRING_NO_INDEX: {NotNull, VARCHAR(180)}
     * @param stringNoIndex The value of stringNoIndex as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setStringNoIndex_Equal(String stringNoIndex) {
        doSetStringNoIndex_Equal(fRES(stringNoIndex));
    }

    protected void doSetStringNoIndex_Equal(String stringNoIndex) {
        regStringNoIndex(CK_EQ, stringNoIndex);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * STRING_NO_INDEX: {NotNull, VARCHAR(180)}
     * @param stringNoIndex The value of stringNoIndex as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setStringNoIndex_NotEqual(String stringNoIndex) {
        doSetStringNoIndex_NotEqual(fRES(stringNoIndex));
    }

    protected void doSetStringNoIndex_NotEqual(String stringNoIndex) {
        regStringNoIndex(CK_NES, stringNoIndex);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * STRING_NO_INDEX: {NotNull, VARCHAR(180)}
     * @param stringNoIndexList The collection of stringNoIndex as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setStringNoIndex_InScope(Collection<String> stringNoIndexList) {
        doSetStringNoIndex_InScope(stringNoIndexList);
    }

    public void doSetStringNoIndex_InScope(Collection<String> stringNoIndexList) {
        regINS(CK_INS, cTL(stringNoIndexList), getCValueStringNoIndex(), "STRING_NO_INDEX");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * STRING_NO_INDEX: {NotNull, VARCHAR(180)}
     * @param stringNoIndexList The collection of stringNoIndex as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setStringNoIndex_NotInScope(Collection<String> stringNoIndexList) {
        doSetStringNoIndex_NotInScope(stringNoIndexList);
    }

    public void doSetStringNoIndex_NotInScope(Collection<String> stringNoIndexList) {
        regINS(CK_NINS, cTL(stringNoIndexList), getCValueStringNoIndex(), "STRING_NO_INDEX");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * STRING_NO_INDEX: {NotNull, VARCHAR(180)}
     * @param stringNoIndex The value of stringNoIndex as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setStringNoIndex_PrefixSearch(String stringNoIndex) {
        setStringNoIndex_LikeSearch(stringNoIndex, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * STRING_NO_INDEX: {NotNull, VARCHAR(180)} <br />
     * <pre>e.g. setStringNoIndex_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param stringNoIndex The value of stringNoIndex as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStringNoIndex_LikeSearch(String stringNoIndex, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(stringNoIndex), getCValueStringNoIndex(), "STRING_NO_INDEX", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * STRING_NO_INDEX: {NotNull, VARCHAR(180)}
     * @param stringNoIndex The value of stringNoIndex as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStringNoIndex_NotLikeSearch(String stringNoIndex, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(stringNoIndex), getCValueStringNoIndex(), "STRING_NO_INDEX", likeSearchOption);
    }

    protected void regStringNoIndex(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueStringNoIndex(), "STRING_NO_INDEX"); }
    protected abstract ConditionValue getCValueStringNoIndex();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * STRING_UNIQUE_INDEX: {UQ, NotNull, VARCHAR(180)}
     * @param stringUniqueIndex The value of stringUniqueIndex as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setStringUniqueIndex_Equal(String stringUniqueIndex) {
        doSetStringUniqueIndex_Equal(fRES(stringUniqueIndex));
    }

    protected void doSetStringUniqueIndex_Equal(String stringUniqueIndex) {
        regStringUniqueIndex(CK_EQ, stringUniqueIndex);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * STRING_UNIQUE_INDEX: {UQ, NotNull, VARCHAR(180)}
     * @param stringUniqueIndex The value of stringUniqueIndex as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setStringUniqueIndex_NotEqual(String stringUniqueIndex) {
        doSetStringUniqueIndex_NotEqual(fRES(stringUniqueIndex));
    }

    protected void doSetStringUniqueIndex_NotEqual(String stringUniqueIndex) {
        regStringUniqueIndex(CK_NES, stringUniqueIndex);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * STRING_UNIQUE_INDEX: {UQ, NotNull, VARCHAR(180)}
     * @param stringUniqueIndexList The collection of stringUniqueIndex as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setStringUniqueIndex_InScope(Collection<String> stringUniqueIndexList) {
        doSetStringUniqueIndex_InScope(stringUniqueIndexList);
    }

    public void doSetStringUniqueIndex_InScope(Collection<String> stringUniqueIndexList) {
        regINS(CK_INS, cTL(stringUniqueIndexList), getCValueStringUniqueIndex(), "STRING_UNIQUE_INDEX");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * STRING_UNIQUE_INDEX: {UQ, NotNull, VARCHAR(180)}
     * @param stringUniqueIndexList The collection of stringUniqueIndex as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setStringUniqueIndex_NotInScope(Collection<String> stringUniqueIndexList) {
        doSetStringUniqueIndex_NotInScope(stringUniqueIndexList);
    }

    public void doSetStringUniqueIndex_NotInScope(Collection<String> stringUniqueIndexList) {
        regINS(CK_NINS, cTL(stringUniqueIndexList), getCValueStringUniqueIndex(), "STRING_UNIQUE_INDEX");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * STRING_UNIQUE_INDEX: {UQ, NotNull, VARCHAR(180)}
     * @param stringUniqueIndex The value of stringUniqueIndex as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setStringUniqueIndex_PrefixSearch(String stringUniqueIndex) {
        setStringUniqueIndex_LikeSearch(stringUniqueIndex, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * STRING_UNIQUE_INDEX: {UQ, NotNull, VARCHAR(180)} <br />
     * <pre>e.g. setStringUniqueIndex_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param stringUniqueIndex The value of stringUniqueIndex as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStringUniqueIndex_LikeSearch(String stringUniqueIndex, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(stringUniqueIndex), getCValueStringUniqueIndex(), "STRING_UNIQUE_INDEX", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * STRING_UNIQUE_INDEX: {UQ, NotNull, VARCHAR(180)}
     * @param stringUniqueIndex The value of stringUniqueIndex as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStringUniqueIndex_NotLikeSearch(String stringUniqueIndex, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(stringUniqueIndex), getCValueStringUniqueIndex(), "STRING_UNIQUE_INDEX", likeSearchOption);
    }

    protected void regStringUniqueIndex(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueStringUniqueIndex(), "STRING_UNIQUE_INDEX"); }
    protected abstract ConditionValue getCValueStringUniqueIndex();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * INTFLG_INDEX: {NotNull, INT(10)}
     * @param intflgIndex The value of intflgIndex as equal. (NullAllowed: if null, no condition)
     */
    public void setIntflgIndex_Equal(Integer intflgIndex) {
        doSetIntflgIndex_Equal(intflgIndex);
    }

    protected void doSetIntflgIndex_Equal(Integer intflgIndex) {
        regIntflgIndex(CK_EQ, intflgIndex);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * INTFLG_INDEX: {NotNull, INT(10)}
     * @param intflgIndex The value of intflgIndex as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setIntflgIndex_GreaterThan(Integer intflgIndex) {
        regIntflgIndex(CK_GT, intflgIndex);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * INTFLG_INDEX: {NotNull, INT(10)}
     * @param intflgIndex The value of intflgIndex as lessThan. (NullAllowed: if null, no condition)
     */
    public void setIntflgIndex_LessThan(Integer intflgIndex) {
        regIntflgIndex(CK_LT, intflgIndex);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * INTFLG_INDEX: {NotNull, INT(10)}
     * @param intflgIndex The value of intflgIndex as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setIntflgIndex_GreaterEqual(Integer intflgIndex) {
        regIntflgIndex(CK_GE, intflgIndex);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * INTFLG_INDEX: {NotNull, INT(10)}
     * @param intflgIndex The value of intflgIndex as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setIntflgIndex_LessEqual(Integer intflgIndex) {
        regIntflgIndex(CK_LE, intflgIndex);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * INTFLG_INDEX: {NotNull, INT(10)}
     * @param minNumber The min number of intflgIndex. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of intflgIndex. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setIntflgIndex_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueIntflgIndex(), "INTFLG_INDEX", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * INTFLG_INDEX: {NotNull, INT(10)}
     * @param intflgIndexList The collection of intflgIndex as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setIntflgIndex_InScope(Collection<Integer> intflgIndexList) {
        doSetIntflgIndex_InScope(intflgIndexList);
    }

    protected void doSetIntflgIndex_InScope(Collection<Integer> intflgIndexList) {
        regINS(CK_INS, cTL(intflgIndexList), getCValueIntflgIndex(), "INTFLG_INDEX");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * INTFLG_INDEX: {NotNull, INT(10)}
     * @param intflgIndexList The collection of intflgIndex as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setIntflgIndex_NotInScope(Collection<Integer> intflgIndexList) {
        doSetIntflgIndex_NotInScope(intflgIndexList);
    }

    protected void doSetIntflgIndex_NotInScope(Collection<Integer> intflgIndexList) {
        regINS(CK_NINS, cTL(intflgIndexList), getCValueIntflgIndex(), "INTFLG_INDEX");
    }

    protected void regIntflgIndex(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueIntflgIndex(), "INTFLG_INDEX"); }
    protected abstract ConditionValue getCValueIntflgIndex();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * NUMERIC_INTEGER_INDEX: {IX, NotNull, DECIMAL(8)}
     * @param numericIntegerIndex The value of numericIntegerIndex as equal. (NullAllowed: if null, no condition)
     */
    public void setNumericIntegerIndex_Equal(Integer numericIntegerIndex) {
        doSetNumericIntegerIndex_Equal(numericIntegerIndex);
    }

    protected void doSetNumericIntegerIndex_Equal(Integer numericIntegerIndex) {
        regNumericIntegerIndex(CK_EQ, numericIntegerIndex);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * NUMERIC_INTEGER_INDEX: {IX, NotNull, DECIMAL(8)}
     * @param numericIntegerIndex The value of numericIntegerIndex as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setNumericIntegerIndex_GreaterThan(Integer numericIntegerIndex) {
        regNumericIntegerIndex(CK_GT, numericIntegerIndex);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * NUMERIC_INTEGER_INDEX: {IX, NotNull, DECIMAL(8)}
     * @param numericIntegerIndex The value of numericIntegerIndex as lessThan. (NullAllowed: if null, no condition)
     */
    public void setNumericIntegerIndex_LessThan(Integer numericIntegerIndex) {
        regNumericIntegerIndex(CK_LT, numericIntegerIndex);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * NUMERIC_INTEGER_INDEX: {IX, NotNull, DECIMAL(8)}
     * @param numericIntegerIndex The value of numericIntegerIndex as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setNumericIntegerIndex_GreaterEqual(Integer numericIntegerIndex) {
        regNumericIntegerIndex(CK_GE, numericIntegerIndex);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * NUMERIC_INTEGER_INDEX: {IX, NotNull, DECIMAL(8)}
     * @param numericIntegerIndex The value of numericIntegerIndex as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setNumericIntegerIndex_LessEqual(Integer numericIntegerIndex) {
        regNumericIntegerIndex(CK_LE, numericIntegerIndex);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * NUMERIC_INTEGER_INDEX: {IX, NotNull, DECIMAL(8)}
     * @param minNumber The min number of numericIntegerIndex. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of numericIntegerIndex. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNumericIntegerIndex_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueNumericIntegerIndex(), "NUMERIC_INTEGER_INDEX", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * NUMERIC_INTEGER_INDEX: {IX, NotNull, DECIMAL(8)}
     * @param numericIntegerIndexList The collection of numericIntegerIndex as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNumericIntegerIndex_InScope(Collection<Integer> numericIntegerIndexList) {
        doSetNumericIntegerIndex_InScope(numericIntegerIndexList);
    }

    protected void doSetNumericIntegerIndex_InScope(Collection<Integer> numericIntegerIndexList) {
        regINS(CK_INS, cTL(numericIntegerIndexList), getCValueNumericIntegerIndex(), "NUMERIC_INTEGER_INDEX");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * NUMERIC_INTEGER_INDEX: {IX, NotNull, DECIMAL(8)}
     * @param numericIntegerIndexList The collection of numericIntegerIndex as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNumericIntegerIndex_NotInScope(Collection<Integer> numericIntegerIndexList) {
        doSetNumericIntegerIndex_NotInScope(numericIntegerIndexList);
    }

    protected void doSetNumericIntegerIndex_NotInScope(Collection<Integer> numericIntegerIndexList) {
        regINS(CK_NINS, cTL(numericIntegerIndexList), getCValueNumericIntegerIndex(), "NUMERIC_INTEGER_INDEX");
    }

    protected void regNumericIntegerIndex(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueNumericIntegerIndex(), "NUMERIC_INTEGER_INDEX"); }
    protected abstract ConditionValue getCValueNumericIntegerIndex();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * NUMERIC_INTEGER_NO_INDEX: {NotNull, DECIMAL(8)}
     * @param numericIntegerNoIndex The value of numericIntegerNoIndex as equal. (NullAllowed: if null, no condition)
     */
    public void setNumericIntegerNoIndex_Equal(Integer numericIntegerNoIndex) {
        doSetNumericIntegerNoIndex_Equal(numericIntegerNoIndex);
    }

    protected void doSetNumericIntegerNoIndex_Equal(Integer numericIntegerNoIndex) {
        regNumericIntegerNoIndex(CK_EQ, numericIntegerNoIndex);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * NUMERIC_INTEGER_NO_INDEX: {NotNull, DECIMAL(8)}
     * @param numericIntegerNoIndex The value of numericIntegerNoIndex as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setNumericIntegerNoIndex_GreaterThan(Integer numericIntegerNoIndex) {
        regNumericIntegerNoIndex(CK_GT, numericIntegerNoIndex);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * NUMERIC_INTEGER_NO_INDEX: {NotNull, DECIMAL(8)}
     * @param numericIntegerNoIndex The value of numericIntegerNoIndex as lessThan. (NullAllowed: if null, no condition)
     */
    public void setNumericIntegerNoIndex_LessThan(Integer numericIntegerNoIndex) {
        regNumericIntegerNoIndex(CK_LT, numericIntegerNoIndex);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * NUMERIC_INTEGER_NO_INDEX: {NotNull, DECIMAL(8)}
     * @param numericIntegerNoIndex The value of numericIntegerNoIndex as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setNumericIntegerNoIndex_GreaterEqual(Integer numericIntegerNoIndex) {
        regNumericIntegerNoIndex(CK_GE, numericIntegerNoIndex);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * NUMERIC_INTEGER_NO_INDEX: {NotNull, DECIMAL(8)}
     * @param numericIntegerNoIndex The value of numericIntegerNoIndex as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setNumericIntegerNoIndex_LessEqual(Integer numericIntegerNoIndex) {
        regNumericIntegerNoIndex(CK_LE, numericIntegerNoIndex);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * NUMERIC_INTEGER_NO_INDEX: {NotNull, DECIMAL(8)}
     * @param minNumber The min number of numericIntegerNoIndex. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of numericIntegerNoIndex. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNumericIntegerNoIndex_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueNumericIntegerNoIndex(), "NUMERIC_INTEGER_NO_INDEX", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * NUMERIC_INTEGER_NO_INDEX: {NotNull, DECIMAL(8)}
     * @param numericIntegerNoIndexList The collection of numericIntegerNoIndex as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNumericIntegerNoIndex_InScope(Collection<Integer> numericIntegerNoIndexList) {
        doSetNumericIntegerNoIndex_InScope(numericIntegerNoIndexList);
    }

    protected void doSetNumericIntegerNoIndex_InScope(Collection<Integer> numericIntegerNoIndexList) {
        regINS(CK_INS, cTL(numericIntegerNoIndexList), getCValueNumericIntegerNoIndex(), "NUMERIC_INTEGER_NO_INDEX");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * NUMERIC_INTEGER_NO_INDEX: {NotNull, DECIMAL(8)}
     * @param numericIntegerNoIndexList The collection of numericIntegerNoIndex as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNumericIntegerNoIndex_NotInScope(Collection<Integer> numericIntegerNoIndexList) {
        doSetNumericIntegerNoIndex_NotInScope(numericIntegerNoIndexList);
    }

    protected void doSetNumericIntegerNoIndex_NotInScope(Collection<Integer> numericIntegerNoIndexList) {
        regINS(CK_NINS, cTL(numericIntegerNoIndexList), getCValueNumericIntegerNoIndex(), "NUMERIC_INTEGER_NO_INDEX");
    }

    protected void regNumericIntegerNoIndex(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueNumericIntegerNoIndex(), "NUMERIC_INTEGER_NO_INDEX"); }
    protected abstract ConditionValue getCValueNumericIntegerNoIndex();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;VendorLargeDataCB&gt;() {
     *     public void query(VendorLargeDataCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorLargeDataCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand(), VendorLargeDataCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;VendorLargeDataCB&gt;() {
     *     public void query(VendorLargeDataCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorLargeDataCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand(), VendorLargeDataCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;VendorLargeDataCB&gt;() {
     *     public void query(VendorLargeDataCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorLargeDataCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand(), VendorLargeDataCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;VendorLargeDataCB&gt;() {
     *     public void query(VendorLargeDataCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorLargeDataCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand(), VendorLargeDataCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;VendorLargeDataCB&gt;() {
     *     public void query(VendorLargeDataCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorLargeDataCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand(), VendorLargeDataCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;VendorLargeDataCB&gt;() {
     *     public void query(VendorLargeDataCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorLargeDataCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand(), VendorLargeDataCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        VendorLargeDataCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(VendorLargeDataCQ sq);

    protected VendorLargeDataCB xcreateScalarConditionCB() {
        VendorLargeDataCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected VendorLargeDataCB xcreateScalarConditionPartitionByCB() {
        VendorLargeDataCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<VendorLargeDataCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorLargeDataCB cb = new VendorLargeDataCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "LARGE_DATA_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(VendorLargeDataCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<VendorLargeDataCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(VendorLargeDataCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorLargeDataCB cb = new VendorLargeDataCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "LARGE_DATA_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(VendorLargeDataCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<VendorLargeDataCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        VendorLargeDataCB cb = new VendorLargeDataCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(VendorLargeDataCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<VendorLargeDataCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        VendorLargeDataCB cb = new VendorLargeDataCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(VendorLargeDataCQ sq);

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
    protected VendorLargeDataCB newMyCB() {
        return new VendorLargeDataCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return VendorLargeDataCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
