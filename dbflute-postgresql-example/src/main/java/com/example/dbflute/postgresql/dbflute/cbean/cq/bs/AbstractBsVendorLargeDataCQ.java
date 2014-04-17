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
     * large_data_id: {PK, NotNull, int8(19)}
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
     * large_data_id: {PK, NotNull, int8(19)}
     * @param largeDataId The value of largeDataId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setLargeDataId_GreaterThan(Long largeDataId) {
        regLargeDataId(CK_GT, largeDataId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * large_data_id: {PK, NotNull, int8(19)}
     * @param largeDataId The value of largeDataId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setLargeDataId_LessThan(Long largeDataId) {
        regLargeDataId(CK_LT, largeDataId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * large_data_id: {PK, NotNull, int8(19)}
     * @param largeDataId The value of largeDataId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setLargeDataId_GreaterEqual(Long largeDataId) {
        regLargeDataId(CK_GE, largeDataId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * large_data_id: {PK, NotNull, int8(19)}
     * @param largeDataId The value of largeDataId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setLargeDataId_LessEqual(Long largeDataId) {
        regLargeDataId(CK_LE, largeDataId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * large_data_id: {PK, NotNull, int8(19)}
     * @param minNumber The min number of largeDataId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of largeDataId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLargeDataId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueLargeDataId(), "large_data_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * large_data_id: {PK, NotNull, int8(19)}
     * @param largeDataIdList The collection of largeDataId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLargeDataId_InScope(Collection<Long> largeDataIdList) {
        doSetLargeDataId_InScope(largeDataIdList);
    }

    protected void doSetLargeDataId_InScope(Collection<Long> largeDataIdList) {
        regINS(CK_INS, cTL(largeDataIdList), getCValueLargeDataId(), "large_data_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * large_data_id: {PK, NotNull, int8(19)}
     * @param largeDataIdList The collection of largeDataId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLargeDataId_NotInScope(Collection<Long> largeDataIdList) {
        doSetLargeDataId_NotInScope(largeDataIdList);
    }

    protected void doSetLargeDataId_NotInScope(Collection<Long> largeDataIdList) {
        regINS(CK_NINS, cTL(largeDataIdList), getCValueLargeDataId(), "large_data_id");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br />
     * {exists (select large_data_id from vendor_large_data_ref where ...)} <br />
     * vendor_large_data_ref by large_data_id, named 'vendorLargeDataRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsVendorLargeDataRefList</span>(new SubQuery&lt;VendorLargeDataRefCB&gt;() {
     *     public void query(VendorLargeDataRefCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of VendorLargeDataRefList for 'exists'. (NotNull)
     */
    public void existsVendorLargeDataRefList(SubQuery<VendorLargeDataRefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        VendorLargeDataRefCB cb = new VendorLargeDataRefCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String pp = keepLargeDataId_ExistsReferrer_VendorLargeDataRefList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "large_data_id", "large_data_id", pp, "vendorLargeDataRefList");
    }
    public abstract String keepLargeDataId_ExistsReferrer_VendorLargeDataRefList(VendorLargeDataRefCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select large_data_id from vendor_large_data_ref where ...)} <br />
     * vendor_large_data_ref by large_data_id, named 'vendorLargeDataRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsVendorLargeDataRefList</span>(new SubQuery&lt;VendorLargeDataRefCB&gt;() {
     *     public void query(VendorLargeDataRefCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of LargeDataId_NotExistsReferrer_VendorLargeDataRefList for 'not exists'. (NotNull)
     */
    public void notExistsVendorLargeDataRefList(SubQuery<VendorLargeDataRefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        VendorLargeDataRefCB cb = new VendorLargeDataRefCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String pp = keepLargeDataId_NotExistsReferrer_VendorLargeDataRefList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "large_data_id", "large_data_id", pp, "vendorLargeDataRefList");
    }
    public abstract String keepLargeDataId_NotExistsReferrer_VendorLargeDataRefList(VendorLargeDataRefCQ sq);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select large_data_id from vendor_large_data_ref where ...)} <br />
     * vendor_large_data_ref by large_data_id, named 'vendorLargeDataRefAsOne'.
     * @param subQuery The sub-query of VendorLargeDataRefList for 'in-scope'. (NotNull)
     */
    public void inScopeVendorLargeDataRefList(SubQuery<VendorLargeDataRefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        VendorLargeDataRefCB cb = new VendorLargeDataRefCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepLargeDataId_InScopeRelation_VendorLargeDataRefList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "large_data_id", "large_data_id", pp, "vendorLargeDataRefList");
    }
    public abstract String keepLargeDataId_InScopeRelation_VendorLargeDataRefList(VendorLargeDataRefCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select large_data_id from vendor_large_data_ref where ...)} <br />
     * vendor_large_data_ref by large_data_id, named 'vendorLargeDataRefAsOne'.
     * @param subQuery The sub-query of VendorLargeDataRefList for 'not in-scope'. (NotNull)
     */
    public void notInScopeVendorLargeDataRefList(SubQuery<VendorLargeDataRefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        VendorLargeDataRefCB cb = new VendorLargeDataRefCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepLargeDataId_NotInScopeRelation_VendorLargeDataRefList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "large_data_id", "large_data_id", pp, "vendorLargeDataRefList");
    }
    public abstract String keepLargeDataId_NotInScopeRelation_VendorLargeDataRefList(VendorLargeDataRefCQ sq);

    public void xsderiveVendorLargeDataRefList(String fn, SubQuery<VendorLargeDataRefCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorLargeDataRefCB cb = new VendorLargeDataRefCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String pp = keepLargeDataId_SpecifyDerivedReferrer_VendorLargeDataRefList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(fn, cb.query(), "large_data_id", "large_data_id", pp, "vendorLargeDataRefList", al, op);
    }
    public abstract String keepLargeDataId_SpecifyDerivedReferrer_VendorLargeDataRefList(VendorLargeDataRefCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from vendor_large_data_ref where ...)} <br />
     * vendor_large_data_ref by large_data_id, named 'vendorLargeDataRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">derivedVendorLargeDataRefList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;VendorLargeDataRefCB&gt;() {
     *     public void query(VendorLargeDataRefCB subCB) {
     *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #FD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
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
        VendorLargeDataRefCB cb = new VendorLargeDataRefCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String sqpp = keepLargeDataId_QueryDerivedReferrer_VendorLargeDataRefList(cb.query()); // for saving query-value.
        String prpp = keepLargeDataId_QueryDerivedReferrer_VendorLargeDataRefListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "large_data_id", "large_data_id", sqpp, "vendorLargeDataRefList", rd, vl, prpp, op);
    }
    public abstract String keepLargeDataId_QueryDerivedReferrer_VendorLargeDataRefList(VendorLargeDataRefCQ sq);
    public abstract String keepLargeDataId_QueryDerivedReferrer_VendorLargeDataRefListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * large_data_id: {PK, NotNull, int8(19)}
     */
    public void setLargeDataId_IsNull() { regLargeDataId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * large_data_id: {PK, NotNull, int8(19)}
     */
    public void setLargeDataId_IsNotNull() { regLargeDataId(CK_ISNN, DOBJ); }

    protected void regLargeDataId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueLargeDataId(), "large_data_id"); }
    protected abstract ConditionValue getCValueLargeDataId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * string_index: {IX, NotNull, varchar(200)}
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
     * string_index: {IX, NotNull, varchar(200)}
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
     * string_index: {IX, NotNull, varchar(200)}
     * @param stringIndexList The collection of stringIndex as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setStringIndex_InScope(Collection<String> stringIndexList) {
        doSetStringIndex_InScope(stringIndexList);
    }

    public void doSetStringIndex_InScope(Collection<String> stringIndexList) {
        regINS(CK_INS, cTL(stringIndexList), getCValueStringIndex(), "string_index");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * string_index: {IX, NotNull, varchar(200)}
     * @param stringIndexList The collection of stringIndex as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setStringIndex_NotInScope(Collection<String> stringIndexList) {
        doSetStringIndex_NotInScope(stringIndexList);
    }

    public void doSetStringIndex_NotInScope(Collection<String> stringIndexList) {
        regINS(CK_NINS, cTL(stringIndexList), getCValueStringIndex(), "string_index");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * string_index: {IX, NotNull, varchar(200)}
     * @param stringIndex The value of stringIndex as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setStringIndex_PrefixSearch(String stringIndex) {
        setStringIndex_LikeSearch(stringIndex, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * string_index: {IX, NotNull, varchar(200)} <br />
     * <pre>e.g. setStringIndex_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param stringIndex The value of stringIndex as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStringIndex_LikeSearch(String stringIndex, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(stringIndex), getCValueStringIndex(), "string_index", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * string_index: {IX, NotNull, varchar(200)}
     * @param stringIndex The value of stringIndex as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStringIndex_NotLikeSearch(String stringIndex, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(stringIndex), getCValueStringIndex(), "string_index", likeSearchOption);
    }

    protected void regStringIndex(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueStringIndex(), "string_index"); }
    protected abstract ConditionValue getCValueStringIndex();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * string_no_index: {NotNull, varchar(200)}
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
     * string_no_index: {NotNull, varchar(200)}
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
     * string_no_index: {NotNull, varchar(200)}
     * @param stringNoIndexList The collection of stringNoIndex as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setStringNoIndex_InScope(Collection<String> stringNoIndexList) {
        doSetStringNoIndex_InScope(stringNoIndexList);
    }

    public void doSetStringNoIndex_InScope(Collection<String> stringNoIndexList) {
        regINS(CK_INS, cTL(stringNoIndexList), getCValueStringNoIndex(), "string_no_index");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * string_no_index: {NotNull, varchar(200)}
     * @param stringNoIndexList The collection of stringNoIndex as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setStringNoIndex_NotInScope(Collection<String> stringNoIndexList) {
        doSetStringNoIndex_NotInScope(stringNoIndexList);
    }

    public void doSetStringNoIndex_NotInScope(Collection<String> stringNoIndexList) {
        regINS(CK_NINS, cTL(stringNoIndexList), getCValueStringNoIndex(), "string_no_index");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * string_no_index: {NotNull, varchar(200)}
     * @param stringNoIndex The value of stringNoIndex as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setStringNoIndex_PrefixSearch(String stringNoIndex) {
        setStringNoIndex_LikeSearch(stringNoIndex, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * string_no_index: {NotNull, varchar(200)} <br />
     * <pre>e.g. setStringNoIndex_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param stringNoIndex The value of stringNoIndex as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStringNoIndex_LikeSearch(String stringNoIndex, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(stringNoIndex), getCValueStringNoIndex(), "string_no_index", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * string_no_index: {NotNull, varchar(200)}
     * @param stringNoIndex The value of stringNoIndex as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStringNoIndex_NotLikeSearch(String stringNoIndex, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(stringNoIndex), getCValueStringNoIndex(), "string_no_index", likeSearchOption);
    }

    protected void regStringNoIndex(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueStringNoIndex(), "string_no_index"); }
    protected abstract ConditionValue getCValueStringNoIndex();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * string_unique_index: {UQ, NotNull, varchar(200)}
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
     * string_unique_index: {UQ, NotNull, varchar(200)}
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
     * string_unique_index: {UQ, NotNull, varchar(200)}
     * @param stringUniqueIndexList The collection of stringUniqueIndex as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setStringUniqueIndex_InScope(Collection<String> stringUniqueIndexList) {
        doSetStringUniqueIndex_InScope(stringUniqueIndexList);
    }

    public void doSetStringUniqueIndex_InScope(Collection<String> stringUniqueIndexList) {
        regINS(CK_INS, cTL(stringUniqueIndexList), getCValueStringUniqueIndex(), "string_unique_index");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * string_unique_index: {UQ, NotNull, varchar(200)}
     * @param stringUniqueIndexList The collection of stringUniqueIndex as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setStringUniqueIndex_NotInScope(Collection<String> stringUniqueIndexList) {
        doSetStringUniqueIndex_NotInScope(stringUniqueIndexList);
    }

    public void doSetStringUniqueIndex_NotInScope(Collection<String> stringUniqueIndexList) {
        regINS(CK_NINS, cTL(stringUniqueIndexList), getCValueStringUniqueIndex(), "string_unique_index");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * string_unique_index: {UQ, NotNull, varchar(200)}
     * @param stringUniqueIndex The value of stringUniqueIndex as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setStringUniqueIndex_PrefixSearch(String stringUniqueIndex) {
        setStringUniqueIndex_LikeSearch(stringUniqueIndex, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * string_unique_index: {UQ, NotNull, varchar(200)} <br />
     * <pre>e.g. setStringUniqueIndex_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param stringUniqueIndex The value of stringUniqueIndex as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStringUniqueIndex_LikeSearch(String stringUniqueIndex, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(stringUniqueIndex), getCValueStringUniqueIndex(), "string_unique_index", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * string_unique_index: {UQ, NotNull, varchar(200)}
     * @param stringUniqueIndex The value of stringUniqueIndex as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStringUniqueIndex_NotLikeSearch(String stringUniqueIndex, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(stringUniqueIndex), getCValueStringUniqueIndex(), "string_unique_index", likeSearchOption);
    }

    protected void regStringUniqueIndex(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueStringUniqueIndex(), "string_unique_index"); }
    protected abstract ConditionValue getCValueStringUniqueIndex();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * intflg_index: {NotNull, int4(10)}
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
     * intflg_index: {NotNull, int4(10)}
     * @param intflgIndex The value of intflgIndex as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setIntflgIndex_GreaterThan(Integer intflgIndex) {
        regIntflgIndex(CK_GT, intflgIndex);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * intflg_index: {NotNull, int4(10)}
     * @param intflgIndex The value of intflgIndex as lessThan. (NullAllowed: if null, no condition)
     */
    public void setIntflgIndex_LessThan(Integer intflgIndex) {
        regIntflgIndex(CK_LT, intflgIndex);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * intflg_index: {NotNull, int4(10)}
     * @param intflgIndex The value of intflgIndex as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setIntflgIndex_GreaterEqual(Integer intflgIndex) {
        regIntflgIndex(CK_GE, intflgIndex);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * intflg_index: {NotNull, int4(10)}
     * @param intflgIndex The value of intflgIndex as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setIntflgIndex_LessEqual(Integer intflgIndex) {
        regIntflgIndex(CK_LE, intflgIndex);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * intflg_index: {NotNull, int4(10)}
     * @param minNumber The min number of intflgIndex. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of intflgIndex. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setIntflgIndex_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueIntflgIndex(), "intflg_index", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * intflg_index: {NotNull, int4(10)}
     * @param intflgIndexList The collection of intflgIndex as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setIntflgIndex_InScope(Collection<Integer> intflgIndexList) {
        doSetIntflgIndex_InScope(intflgIndexList);
    }

    protected void doSetIntflgIndex_InScope(Collection<Integer> intflgIndexList) {
        regINS(CK_INS, cTL(intflgIndexList), getCValueIntflgIndex(), "intflg_index");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * intflg_index: {NotNull, int4(10)}
     * @param intflgIndexList The collection of intflgIndex as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setIntflgIndex_NotInScope(Collection<Integer> intflgIndexList) {
        doSetIntflgIndex_NotInScope(intflgIndexList);
    }

    protected void doSetIntflgIndex_NotInScope(Collection<Integer> intflgIndexList) {
        regINS(CK_NINS, cTL(intflgIndexList), getCValueIntflgIndex(), "intflg_index");
    }

    protected void regIntflgIndex(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueIntflgIndex(), "intflg_index"); }
    protected abstract ConditionValue getCValueIntflgIndex();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * numeric_integer_index: {IX, NotNull, numeric(8)}
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
     * numeric_integer_index: {IX, NotNull, numeric(8)}
     * @param numericIntegerIndex The value of numericIntegerIndex as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setNumericIntegerIndex_GreaterThan(Integer numericIntegerIndex) {
        regNumericIntegerIndex(CK_GT, numericIntegerIndex);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * numeric_integer_index: {IX, NotNull, numeric(8)}
     * @param numericIntegerIndex The value of numericIntegerIndex as lessThan. (NullAllowed: if null, no condition)
     */
    public void setNumericIntegerIndex_LessThan(Integer numericIntegerIndex) {
        regNumericIntegerIndex(CK_LT, numericIntegerIndex);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * numeric_integer_index: {IX, NotNull, numeric(8)}
     * @param numericIntegerIndex The value of numericIntegerIndex as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setNumericIntegerIndex_GreaterEqual(Integer numericIntegerIndex) {
        regNumericIntegerIndex(CK_GE, numericIntegerIndex);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * numeric_integer_index: {IX, NotNull, numeric(8)}
     * @param numericIntegerIndex The value of numericIntegerIndex as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setNumericIntegerIndex_LessEqual(Integer numericIntegerIndex) {
        regNumericIntegerIndex(CK_LE, numericIntegerIndex);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * numeric_integer_index: {IX, NotNull, numeric(8)}
     * @param minNumber The min number of numericIntegerIndex. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of numericIntegerIndex. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNumericIntegerIndex_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueNumericIntegerIndex(), "numeric_integer_index", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * numeric_integer_index: {IX, NotNull, numeric(8)}
     * @param numericIntegerIndexList The collection of numericIntegerIndex as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNumericIntegerIndex_InScope(Collection<Integer> numericIntegerIndexList) {
        doSetNumericIntegerIndex_InScope(numericIntegerIndexList);
    }

    protected void doSetNumericIntegerIndex_InScope(Collection<Integer> numericIntegerIndexList) {
        regINS(CK_INS, cTL(numericIntegerIndexList), getCValueNumericIntegerIndex(), "numeric_integer_index");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * numeric_integer_index: {IX, NotNull, numeric(8)}
     * @param numericIntegerIndexList The collection of numericIntegerIndex as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNumericIntegerIndex_NotInScope(Collection<Integer> numericIntegerIndexList) {
        doSetNumericIntegerIndex_NotInScope(numericIntegerIndexList);
    }

    protected void doSetNumericIntegerIndex_NotInScope(Collection<Integer> numericIntegerIndexList) {
        regINS(CK_NINS, cTL(numericIntegerIndexList), getCValueNumericIntegerIndex(), "numeric_integer_index");
    }

    protected void regNumericIntegerIndex(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueNumericIntegerIndex(), "numeric_integer_index"); }
    protected abstract ConditionValue getCValueNumericIntegerIndex();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * numeric_integer_no_index: {NotNull, numeric(8)}
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
     * numeric_integer_no_index: {NotNull, numeric(8)}
     * @param numericIntegerNoIndex The value of numericIntegerNoIndex as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setNumericIntegerNoIndex_GreaterThan(Integer numericIntegerNoIndex) {
        regNumericIntegerNoIndex(CK_GT, numericIntegerNoIndex);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * numeric_integer_no_index: {NotNull, numeric(8)}
     * @param numericIntegerNoIndex The value of numericIntegerNoIndex as lessThan. (NullAllowed: if null, no condition)
     */
    public void setNumericIntegerNoIndex_LessThan(Integer numericIntegerNoIndex) {
        regNumericIntegerNoIndex(CK_LT, numericIntegerNoIndex);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * numeric_integer_no_index: {NotNull, numeric(8)}
     * @param numericIntegerNoIndex The value of numericIntegerNoIndex as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setNumericIntegerNoIndex_GreaterEqual(Integer numericIntegerNoIndex) {
        regNumericIntegerNoIndex(CK_GE, numericIntegerNoIndex);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * numeric_integer_no_index: {NotNull, numeric(8)}
     * @param numericIntegerNoIndex The value of numericIntegerNoIndex as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setNumericIntegerNoIndex_LessEqual(Integer numericIntegerNoIndex) {
        regNumericIntegerNoIndex(CK_LE, numericIntegerNoIndex);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * numeric_integer_no_index: {NotNull, numeric(8)}
     * @param minNumber The min number of numericIntegerNoIndex. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of numericIntegerNoIndex. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNumericIntegerNoIndex_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueNumericIntegerNoIndex(), "numeric_integer_no_index", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * numeric_integer_no_index: {NotNull, numeric(8)}
     * @param numericIntegerNoIndexList The collection of numericIntegerNoIndex as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNumericIntegerNoIndex_InScope(Collection<Integer> numericIntegerNoIndexList) {
        doSetNumericIntegerNoIndex_InScope(numericIntegerNoIndexList);
    }

    protected void doSetNumericIntegerNoIndex_InScope(Collection<Integer> numericIntegerNoIndexList) {
        regINS(CK_INS, cTL(numericIntegerNoIndexList), getCValueNumericIntegerNoIndex(), "numeric_integer_no_index");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * numeric_integer_no_index: {NotNull, numeric(8)}
     * @param numericIntegerNoIndexList The collection of numericIntegerNoIndex as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNumericIntegerNoIndex_NotInScope(Collection<Integer> numericIntegerNoIndexList) {
        doSetNumericIntegerNoIndex_NotInScope(numericIntegerNoIndexList);
    }

    protected void doSetNumericIntegerNoIndex_NotInScope(Collection<Integer> numericIntegerNoIndexList) {
        regINS(CK_NINS, cTL(numericIntegerNoIndexList), getCValueNumericIntegerNoIndex(), "numeric_integer_no_index");
    }

    protected void regNumericIntegerNoIndex(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueNumericIntegerNoIndex(), "numeric_integer_no_index"); }
    protected abstract ConditionValue getCValueNumericIntegerNoIndex();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;VendorLargeDataCB&gt;() {
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
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;VendorLargeDataCB&gt;() {
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
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;VendorLargeDataCB&gt;() {
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
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;VendorLargeDataCB&gt;() {
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
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;VendorLargeDataCB&gt;() {
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
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;VendorLargeDataCB&gt;() {
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
        VendorLargeDataCB cb = new VendorLargeDataCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String pk = "large_data_id";
        String pp = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
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
        String pk = "large_data_id";
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
        VendorLargeDataCB cb = new VendorLargeDataCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String pp = keepMyselfExists(cb.query()); // for saving query-value.
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
        VendorLargeDataCB cb = new VendorLargeDataCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String pp = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(VendorLargeDataCQ sq);

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
