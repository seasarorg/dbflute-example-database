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
 * The abstract condition-query of white_same_name.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteSameNameCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteSameNameCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_same_name";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * same_name_id: {PK, NotNull, int8(19)}
     * @param sameNameId The value of sameNameId as equal. (NullAllowed: if null, no condition)
     */
    public void setSameNameId_Equal(Long sameNameId) {
        doSetSameNameId_Equal(sameNameId);
    }

    protected void doSetSameNameId_Equal(Long sameNameId) {
        regSameNameId(CK_EQ, sameNameId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * same_name_id: {PK, NotNull, int8(19)}
     * @param sameNameId The value of sameNameId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setSameNameId_GreaterThan(Long sameNameId) {
        regSameNameId(CK_GT, sameNameId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * same_name_id: {PK, NotNull, int8(19)}
     * @param sameNameId The value of sameNameId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setSameNameId_LessThan(Long sameNameId) {
        regSameNameId(CK_LT, sameNameId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * same_name_id: {PK, NotNull, int8(19)}
     * @param sameNameId The value of sameNameId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setSameNameId_GreaterEqual(Long sameNameId) {
        regSameNameId(CK_GE, sameNameId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * same_name_id: {PK, NotNull, int8(19)}
     * @param sameNameId The value of sameNameId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setSameNameId_LessEqual(Long sameNameId) {
        regSameNameId(CK_LE, sameNameId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * same_name_id: {PK, NotNull, int8(19)}
     * @param minNumber The min number of sameNameId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of sameNameId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSameNameId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueSameNameId(), "same_name_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * same_name_id: {PK, NotNull, int8(19)}
     * @param sameNameIdList The collection of sameNameId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSameNameId_InScope(Collection<Long> sameNameIdList) {
        doSetSameNameId_InScope(sameNameIdList);
    }

    protected void doSetSameNameId_InScope(Collection<Long> sameNameIdList) {
        regINS(CK_INS, cTL(sameNameIdList), getCValueSameNameId(), "same_name_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * same_name_id: {PK, NotNull, int8(19)}
     * @param sameNameIdList The collection of sameNameId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSameNameId_NotInScope(Collection<Long> sameNameIdList) {
        doSetSameNameId_NotInScope(sameNameIdList);
    }

    protected void doSetSameNameId_NotInScope(Collection<Long> sameNameIdList) {
        regINS(CK_NINS, cTL(sameNameIdList), getCValueSameNameId(), "same_name_id");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br />
     * {exists (select same_name_id from white_same_name_ref where ...)} <br />
     * white_same_name_ref by same_name_id, named 'whiteSameNameRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">existsWhiteSameNameRefList</span>(new SubQuery&lt;WhiteSameNameRefCB&gt;() {
     *     public void query(WhiteSameNameRefCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of WhiteSameNameRefList for 'exists'. (NotNull)
     */
    public void existsWhiteSameNameRefList(SubQuery<WhiteSameNameRefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteSameNameRefCB cb = new WhiteSameNameRefCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepSameNameId_ExistsReferrer_WhiteSameNameRefList(cb.query());
        registerExistsReferrer(cb.query(), "same_name_id", "same_name_id", pp, "whiteSameNameRefList");
    }
    public abstract String keepSameNameId_ExistsReferrer_WhiteSameNameRefList(WhiteSameNameRefCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select same_name_id from white_same_name_ref where ...)} <br />
     * white_same_name_ref by same_name_id, named 'whiteSameNameRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">notExistsWhiteSameNameRefList</span>(new SubQuery&lt;WhiteSameNameRefCB&gt;() {
     *     public void query(WhiteSameNameRefCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of SameNameId_NotExistsReferrer_WhiteSameNameRefList for 'not exists'. (NotNull)
     */
    public void notExistsWhiteSameNameRefList(SubQuery<WhiteSameNameRefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteSameNameRefCB cb = new WhiteSameNameRefCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepSameNameId_NotExistsReferrer_WhiteSameNameRefList(cb.query());
        registerNotExistsReferrer(cb.query(), "same_name_id", "same_name_id", pp, "whiteSameNameRefList");
    }
    public abstract String keepSameNameId_NotExistsReferrer_WhiteSameNameRefList(WhiteSameNameRefCQ sq);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select same_name_id from white_same_name_ref where ...)} <br />
     * white_same_name_ref by same_name_id, named 'whiteSameNameRefAsOne'.
     * @param subQuery The sub-query of WhiteSameNameRefList for 'in-scope'. (NotNull)
     */
    public void inScopeWhiteSameNameRefList(SubQuery<WhiteSameNameRefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteSameNameRefCB cb = new WhiteSameNameRefCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepSameNameId_InScopeRelation_WhiteSameNameRefList(cb.query());
        registerInScopeRelation(cb.query(), "same_name_id", "same_name_id", pp, "whiteSameNameRefList");
    }
    public abstract String keepSameNameId_InScopeRelation_WhiteSameNameRefList(WhiteSameNameRefCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select same_name_id from white_same_name_ref where ...)} <br />
     * white_same_name_ref by same_name_id, named 'whiteSameNameRefAsOne'.
     * @param subQuery The sub-query of WhiteSameNameRefList for 'not in-scope'. (NotNull)
     */
    public void notInScopeWhiteSameNameRefList(SubQuery<WhiteSameNameRefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteSameNameRefCB cb = new WhiteSameNameRefCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepSameNameId_NotInScopeRelation_WhiteSameNameRefList(cb.query());
        registerNotInScopeRelation(cb.query(), "same_name_id", "same_name_id", pp, "whiteSameNameRefList");
    }
    public abstract String keepSameNameId_NotInScopeRelation_WhiteSameNameRefList(WhiteSameNameRefCQ sq);

    public void xsderiveWhiteSameNameRefList(String fn, SubQuery<WhiteSameNameRefCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSameNameRefCB cb = new WhiteSameNameRefCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSameNameId_SpecifyDerivedReferrer_WhiteSameNameRefList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "same_name_id", "same_name_id", pp, "whiteSameNameRefList", al, op);
    }
    public abstract String keepSameNameId_SpecifyDerivedReferrer_WhiteSameNameRefList(WhiteSameNameRefCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br />
     * {FOO &lt;= (select max(BAR) from white_same_name_ref where ...)} <br />
     * white_same_name_ref by same_name_id, named 'whiteSameNameRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">derivedWhiteSameNameRefList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;WhiteSameNameRefCB&gt;() {
     *     public void query(WhiteSameNameRefCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #DD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WhiteSameNameRefCB> derivedWhiteSameNameRefList() {
        return xcreateQDRFunctionWhiteSameNameRefList();
    }
    protected HpQDRFunction<WhiteSameNameRefCB> xcreateQDRFunctionWhiteSameNameRefList() {
        return new HpQDRFunction<WhiteSameNameRefCB>(new HpQDRSetupper<WhiteSameNameRefCB>() {
            public void setup(String fn, SubQuery<WhiteSameNameRefCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveWhiteSameNameRefList(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveWhiteSameNameRefList(String fn, SubQuery<WhiteSameNameRefCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSameNameRefCB cb = new WhiteSameNameRefCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String sqpp = keepSameNameId_QueryDerivedReferrer_WhiteSameNameRefList(cb.query()); String prpp = keepSameNameId_QueryDerivedReferrer_WhiteSameNameRefListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "same_name_id", "same_name_id", sqpp, "whiteSameNameRefList", rd, vl, prpp, op);
    }
    public abstract String keepSameNameId_QueryDerivedReferrer_WhiteSameNameRefList(WhiteSameNameRefCQ sq);
    public abstract String keepSameNameId_QueryDerivedReferrer_WhiteSameNameRefListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * same_name_id: {PK, NotNull, int8(19)}
     */
    public void setSameNameId_IsNull() { regSameNameId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * same_name_id: {PK, NotNull, int8(19)}
     */
    public void setSameNameId_IsNotNull() { regSameNameId(CK_ISNN, DOBJ); }

    protected void regSameNameId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueSameNameId(), "same_name_id"); }
    protected abstract ConditionValue getCValueSameNameId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * same_name_name: {varchar(200)}
     * @param sameNameName The value of sameNameName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setSameNameName_Equal(String sameNameName) {
        doSetSameNameName_Equal(fRES(sameNameName));
    }

    protected void doSetSameNameName_Equal(String sameNameName) {
        regSameNameName(CK_EQ, sameNameName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * same_name_name: {varchar(200)}
     * @param sameNameName The value of sameNameName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setSameNameName_NotEqual(String sameNameName) {
        doSetSameNameName_NotEqual(fRES(sameNameName));
    }

    protected void doSetSameNameName_NotEqual(String sameNameName) {
        regSameNameName(CK_NES, sameNameName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * same_name_name: {varchar(200)}
     * @param sameNameNameList The collection of sameNameName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSameNameName_InScope(Collection<String> sameNameNameList) {
        doSetSameNameName_InScope(sameNameNameList);
    }

    public void doSetSameNameName_InScope(Collection<String> sameNameNameList) {
        regINS(CK_INS, cTL(sameNameNameList), getCValueSameNameName(), "same_name_name");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * same_name_name: {varchar(200)}
     * @param sameNameNameList The collection of sameNameName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSameNameName_NotInScope(Collection<String> sameNameNameList) {
        doSetSameNameName_NotInScope(sameNameNameList);
    }

    public void doSetSameNameName_NotInScope(Collection<String> sameNameNameList) {
        regINS(CK_NINS, cTL(sameNameNameList), getCValueSameNameName(), "same_name_name");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * same_name_name: {varchar(200)}
     * @param sameNameName The value of sameNameName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setSameNameName_PrefixSearch(String sameNameName) {
        setSameNameName_LikeSearch(sameNameName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * same_name_name: {varchar(200)} <br />
     * <pre>e.g. setSameNameName_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sameNameName The value of sameNameName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSameNameName_LikeSearch(String sameNameName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sameNameName), getCValueSameNameName(), "same_name_name", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * same_name_name: {varchar(200)}
     * @param sameNameName The value of sameNameName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSameNameName_NotLikeSearch(String sameNameName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sameNameName), getCValueSameNameName(), "same_name_name", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * same_name_name: {varchar(200)}
     */
    public void setSameNameName_IsNull() { regSameNameName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * same_name_name: {varchar(200)}
     */
    public void setSameNameName_IsNullOrEmpty() { regSameNameName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * same_name_name: {varchar(200)}
     */
    public void setSameNameName_IsNotNull() { regSameNameName(CK_ISNN, DOBJ); }

    protected void regSameNameName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueSameNameName(), "same_name_name"); }
    protected abstract ConditionValue getCValueSameNameName();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * same_name_integer: {int4(10)}
     * @param sameNameInteger The value of sameNameInteger as equal. (NullAllowed: if null, no condition)
     */
    public void setSameNameInteger_Equal(Integer sameNameInteger) {
        doSetSameNameInteger_Equal(sameNameInteger);
    }

    protected void doSetSameNameInteger_Equal(Integer sameNameInteger) {
        regSameNameInteger(CK_EQ, sameNameInteger);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * same_name_integer: {int4(10)}
     * @param sameNameInteger The value of sameNameInteger as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setSameNameInteger_GreaterThan(Integer sameNameInteger) {
        regSameNameInteger(CK_GT, sameNameInteger);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * same_name_integer: {int4(10)}
     * @param sameNameInteger The value of sameNameInteger as lessThan. (NullAllowed: if null, no condition)
     */
    public void setSameNameInteger_LessThan(Integer sameNameInteger) {
        regSameNameInteger(CK_LT, sameNameInteger);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * same_name_integer: {int4(10)}
     * @param sameNameInteger The value of sameNameInteger as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setSameNameInteger_GreaterEqual(Integer sameNameInteger) {
        regSameNameInteger(CK_GE, sameNameInteger);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * same_name_integer: {int4(10)}
     * @param sameNameInteger The value of sameNameInteger as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setSameNameInteger_LessEqual(Integer sameNameInteger) {
        regSameNameInteger(CK_LE, sameNameInteger);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * same_name_integer: {int4(10)}
     * @param minNumber The min number of sameNameInteger. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of sameNameInteger. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSameNameInteger_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueSameNameInteger(), "same_name_integer", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * same_name_integer: {int4(10)}
     * @param sameNameIntegerList The collection of sameNameInteger as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSameNameInteger_InScope(Collection<Integer> sameNameIntegerList) {
        doSetSameNameInteger_InScope(sameNameIntegerList);
    }

    protected void doSetSameNameInteger_InScope(Collection<Integer> sameNameIntegerList) {
        regINS(CK_INS, cTL(sameNameIntegerList), getCValueSameNameInteger(), "same_name_integer");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * same_name_integer: {int4(10)}
     * @param sameNameIntegerList The collection of sameNameInteger as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSameNameInteger_NotInScope(Collection<Integer> sameNameIntegerList) {
        doSetSameNameInteger_NotInScope(sameNameIntegerList);
    }

    protected void doSetSameNameInteger_NotInScope(Collection<Integer> sameNameIntegerList) {
        regINS(CK_NINS, cTL(sameNameIntegerList), getCValueSameNameInteger(), "same_name_integer");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * same_name_integer: {int4(10)}
     */
    public void setSameNameInteger_IsNull() { regSameNameInteger(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * same_name_integer: {int4(10)}
     */
    public void setSameNameInteger_IsNotNull() { regSameNameInteger(CK_ISNN, DOBJ); }

    protected void regSameNameInteger(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueSameNameInteger(), "same_name_integer"); }
    protected abstract ConditionValue getCValueSameNameInteger();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * next_schema_product_id: {int4(10), FK to NEXT_SCHEMA_PRODUCT}
     * @param nextSchemaProductId The value of nextSchemaProductId as equal. (NullAllowed: if null, no condition)
     */
    public void setNextSchemaProductId_Equal(Integer nextSchemaProductId) {
        doSetNextSchemaProductId_Equal(nextSchemaProductId);
    }

    protected void doSetNextSchemaProductId_Equal(Integer nextSchemaProductId) {
        regNextSchemaProductId(CK_EQ, nextSchemaProductId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * next_schema_product_id: {int4(10), FK to NEXT_SCHEMA_PRODUCT}
     * @param nextSchemaProductId The value of nextSchemaProductId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setNextSchemaProductId_GreaterThan(Integer nextSchemaProductId) {
        regNextSchemaProductId(CK_GT, nextSchemaProductId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * next_schema_product_id: {int4(10), FK to NEXT_SCHEMA_PRODUCT}
     * @param nextSchemaProductId The value of nextSchemaProductId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setNextSchemaProductId_LessThan(Integer nextSchemaProductId) {
        regNextSchemaProductId(CK_LT, nextSchemaProductId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * next_schema_product_id: {int4(10), FK to NEXT_SCHEMA_PRODUCT}
     * @param nextSchemaProductId The value of nextSchemaProductId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setNextSchemaProductId_GreaterEqual(Integer nextSchemaProductId) {
        regNextSchemaProductId(CK_GE, nextSchemaProductId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * next_schema_product_id: {int4(10), FK to NEXT_SCHEMA_PRODUCT}
     * @param nextSchemaProductId The value of nextSchemaProductId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setNextSchemaProductId_LessEqual(Integer nextSchemaProductId) {
        regNextSchemaProductId(CK_LE, nextSchemaProductId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * next_schema_product_id: {int4(10), FK to NEXT_SCHEMA_PRODUCT}
     * @param minNumber The min number of nextSchemaProductId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of nextSchemaProductId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNextSchemaProductId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueNextSchemaProductId(), "next_schema_product_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * next_schema_product_id: {int4(10), FK to NEXT_SCHEMA_PRODUCT}
     * @param nextSchemaProductIdList The collection of nextSchemaProductId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNextSchemaProductId_InScope(Collection<Integer> nextSchemaProductIdList) {
        doSetNextSchemaProductId_InScope(nextSchemaProductIdList);
    }

    protected void doSetNextSchemaProductId_InScope(Collection<Integer> nextSchemaProductIdList) {
        regINS(CK_INS, cTL(nextSchemaProductIdList), getCValueNextSchemaProductId(), "next_schema_product_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * next_schema_product_id: {int4(10), FK to NEXT_SCHEMA_PRODUCT}
     * @param nextSchemaProductIdList The collection of nextSchemaProductId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNextSchemaProductId_NotInScope(Collection<Integer> nextSchemaProductIdList) {
        doSetNextSchemaProductId_NotInScope(nextSchemaProductIdList);
    }

    protected void doSetNextSchemaProductId_NotInScope(Collection<Integer> nextSchemaProductIdList) {
        regINS(CK_NINS, cTL(nextSchemaProductIdList), getCValueNextSchemaProductId(), "next_schema_product_id");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select NEXT_SCHEMA_PRODUCT_ID from next_schema_product where ...)} <br />
     * next_schema_product by my next_schema_product_id, named 'nextSchemaProduct'.
     * @param subQuery The sub-query of NextSchemaProduct for 'in-scope'. (NotNull)
     */
    public void inScopeNextSchemaProduct(SubQuery<NextSchemaProductCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        NextSchemaProductCB cb = new NextSchemaProductCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepNextSchemaProductId_InScopeRelation_NextSchemaProduct(cb.query());
        registerInScopeRelation(cb.query(), "next_schema_product_id", "PRODUCT_ID", pp, "nextSchemaProduct");
    }
    public abstract String keepNextSchemaProductId_InScopeRelation_NextSchemaProduct(NextSchemaProductCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select NEXT_SCHEMA_PRODUCT_ID from next_schema_product where ...)} <br />
     * next_schema_product by my next_schema_product_id, named 'nextSchemaProduct'.
     * @param subQuery The sub-query of NextSchemaProduct for 'not in-scope'. (NotNull)
     */
    public void notInScopeNextSchemaProduct(SubQuery<NextSchemaProductCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        NextSchemaProductCB cb = new NextSchemaProductCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepNextSchemaProductId_NotInScopeRelation_NextSchemaProduct(cb.query());
        registerNotInScopeRelation(cb.query(), "next_schema_product_id", "PRODUCT_ID", pp, "nextSchemaProduct");
    }
    public abstract String keepNextSchemaProductId_NotInScopeRelation_NextSchemaProduct(NextSchemaProductCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * next_schema_product_id: {int4(10), FK to NEXT_SCHEMA_PRODUCT}
     */
    public void setNextSchemaProductId_IsNull() { regNextSchemaProductId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * next_schema_product_id: {int4(10), FK to NEXT_SCHEMA_PRODUCT}
     */
    public void setNextSchemaProductId_IsNotNull() { regNextSchemaProductId(CK_ISNN, DOBJ); }

    protected void regNextSchemaProductId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueNextSchemaProductId(), "next_schema_product_id"); }
    protected abstract ConditionValue getCValueNextSchemaProductId();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteSameNameCB&gt;() {
     *     public void query(WhiteSameNameCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSameNameCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, WhiteSameNameCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteSameNameCB&gt;() {
     *     public void query(WhiteSameNameCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSameNameCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, WhiteSameNameCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteSameNameCB&gt;() {
     *     public void query(WhiteSameNameCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSameNameCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, WhiteSameNameCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteSameNameCB&gt;() {
     *     public void query(WhiteSameNameCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSameNameCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, WhiteSameNameCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteSameNameCB&gt;() {
     *     public void query(WhiteSameNameCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSameNameCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, WhiteSameNameCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteSameNameCB&gt;() {
     *     public void query(WhiteSameNameCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSameNameCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, WhiteSameNameCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSameNameCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhiteSameNameCQ sq);

    protected WhiteSameNameCB xcreateScalarConditionCB() {
        WhiteSameNameCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteSameNameCB xcreateScalarConditionPartitionByCB() {
        WhiteSameNameCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteSameNameCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSameNameCB cb = new WhiteSameNameCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "same_name_id";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteSameNameCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteSameNameCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteSameNameCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSameNameCB cb = new WhiteSameNameCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "same_name_id";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteSameNameCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteSameNameCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteSameNameCB cb = new WhiteSameNameCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteSameNameCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteSameNameCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteSameNameCB cb = new WhiteSameNameCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(WhiteSameNameCQ sq);

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
    protected WhiteSameNameCB newMyCB() {
        return new WhiteSameNameCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return WhiteSameNameCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
