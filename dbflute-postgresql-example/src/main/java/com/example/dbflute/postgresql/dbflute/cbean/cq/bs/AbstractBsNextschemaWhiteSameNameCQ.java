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
 * The abstract condition-query of nextschema.white_same_name.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsNextschemaWhiteSameNameCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsNextschemaWhiteSameNameCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "nextschema.white_same_name";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * same_name_id: {PK, NotNull, int4(10)}
     * @param sameNameId The value of sameNameId as equal. (NullAllowed: if null, no condition)
     */
    public void setSameNameId_Equal(Integer sameNameId) {
        doSetSameNameId_Equal(sameNameId);
    }

    protected void doSetSameNameId_Equal(Integer sameNameId) {
        regSameNameId(CK_EQ, sameNameId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * same_name_id: {PK, NotNull, int4(10)}
     * @param sameNameId The value of sameNameId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setSameNameId_GreaterThan(Integer sameNameId) {
        regSameNameId(CK_GT, sameNameId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * same_name_id: {PK, NotNull, int4(10)}
     * @param sameNameId The value of sameNameId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setSameNameId_LessThan(Integer sameNameId) {
        regSameNameId(CK_LT, sameNameId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * same_name_id: {PK, NotNull, int4(10)}
     * @param sameNameId The value of sameNameId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setSameNameId_GreaterEqual(Integer sameNameId) {
        regSameNameId(CK_GE, sameNameId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * same_name_id: {PK, NotNull, int4(10)}
     * @param sameNameId The value of sameNameId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setSameNameId_LessEqual(Integer sameNameId) {
        regSameNameId(CK_LE, sameNameId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * same_name_id: {PK, NotNull, int4(10)}
     * @param minNumber The min number of sameNameId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of sameNameId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSameNameId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueSameNameId(), "same_name_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * same_name_id: {PK, NotNull, int4(10)}
     * @param sameNameIdList The collection of sameNameId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSameNameId_InScope(Collection<Integer> sameNameIdList) {
        doSetSameNameId_InScope(sameNameIdList);
    }

    protected void doSetSameNameId_InScope(Collection<Integer> sameNameIdList) {
        regINS(CK_INS, cTL(sameNameIdList), getCValueSameNameId(), "same_name_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * same_name_id: {PK, NotNull, int4(10)}
     * @param sameNameIdList The collection of sameNameId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSameNameId_NotInScope(Collection<Integer> sameNameIdList) {
        doSetSameNameId_NotInScope(sameNameIdList);
    }

    protected void doSetSameNameId_NotInScope(Collection<Integer> sameNameIdList) {
        regINS(CK_NINS, cTL(sameNameIdList), getCValueSameNameId(), "same_name_id");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br />
     * {exists (select same_name_id from nextschema.white_same_name_ref where ...)} <br />
     * nextschema.white_same_name_ref by same_name_id, named 'whiteSameNameRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">existsWhiteSameNameRefList</span>(new SubQuery&lt;NextschemaWhiteSameNameRefCB&gt;() {
     *     public void query(NextschemaWhiteSameNameRefCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of WhiteSameNameRefList for 'exists'. (NotNull)
     */
    public void existsWhiteSameNameRefList(SubQuery<NextschemaWhiteSameNameRefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        NextschemaWhiteSameNameRefCB cb = new NextschemaWhiteSameNameRefCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepSameNameId_ExistsReferrer_WhiteSameNameRefList(cb.query());
        registerExistsReferrer(cb.query(), "same_name_id", "same_name_id", pp, "whiteSameNameRefList");
    }
    public abstract String keepSameNameId_ExistsReferrer_WhiteSameNameRefList(NextschemaWhiteSameNameRefCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select same_name_id from nextschema.white_same_name_ref where ...)} <br />
     * nextschema.white_same_name_ref by same_name_id, named 'whiteSameNameRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">notExistsWhiteSameNameRefList</span>(new SubQuery&lt;NextschemaWhiteSameNameRefCB&gt;() {
     *     public void query(NextschemaWhiteSameNameRefCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of SameNameId_NotExistsReferrer_WhiteSameNameRefList for 'not exists'. (NotNull)
     */
    public void notExistsWhiteSameNameRefList(SubQuery<NextschemaWhiteSameNameRefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        NextschemaWhiteSameNameRefCB cb = new NextschemaWhiteSameNameRefCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepSameNameId_NotExistsReferrer_WhiteSameNameRefList(cb.query());
        registerNotExistsReferrer(cb.query(), "same_name_id", "same_name_id", pp, "whiteSameNameRefList");
    }
    public abstract String keepSameNameId_NotExistsReferrer_WhiteSameNameRefList(NextschemaWhiteSameNameRefCQ sq);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select same_name_id from nextschema.white_same_name_ref where ...)} <br />
     * nextschema.white_same_name_ref by same_name_id, named 'whiteSameNameRefAsOne'.
     * @param subQuery The sub-query of WhiteSameNameRefList for 'in-scope'. (NotNull)
     */
    public void inScopeWhiteSameNameRefList(SubQuery<NextschemaWhiteSameNameRefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        NextschemaWhiteSameNameRefCB cb = new NextschemaWhiteSameNameRefCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepSameNameId_InScopeRelation_WhiteSameNameRefList(cb.query());
        registerInScopeRelation(cb.query(), "same_name_id", "same_name_id", pp, "whiteSameNameRefList");
    }
    public abstract String keepSameNameId_InScopeRelation_WhiteSameNameRefList(NextschemaWhiteSameNameRefCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select same_name_id from nextschema.white_same_name_ref where ...)} <br />
     * nextschema.white_same_name_ref by same_name_id, named 'whiteSameNameRefAsOne'.
     * @param subQuery The sub-query of WhiteSameNameRefList for 'not in-scope'. (NotNull)
     */
    public void notInScopeWhiteSameNameRefList(SubQuery<NextschemaWhiteSameNameRefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        NextschemaWhiteSameNameRefCB cb = new NextschemaWhiteSameNameRefCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepSameNameId_NotInScopeRelation_WhiteSameNameRefList(cb.query());
        registerNotInScopeRelation(cb.query(), "same_name_id", "same_name_id", pp, "whiteSameNameRefList");
    }
    public abstract String keepSameNameId_NotInScopeRelation_WhiteSameNameRefList(NextschemaWhiteSameNameRefCQ sq);

    public void xsderiveWhiteSameNameRefList(String fn, SubQuery<NextschemaWhiteSameNameRefCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        NextschemaWhiteSameNameRefCB cb = new NextschemaWhiteSameNameRefCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSameNameId_SpecifyDerivedReferrer_WhiteSameNameRefList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "same_name_id", "same_name_id", pp, "whiteSameNameRefList", al, op);
    }
    public abstract String keepSameNameId_SpecifyDerivedReferrer_WhiteSameNameRefList(NextschemaWhiteSameNameRefCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br />
     * {FOO &lt;= (select max(BAR) from nextschema.white_same_name_ref where ...)} <br />
     * nextschema.white_same_name_ref by same_name_id, named 'whiteSameNameRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">derivedWhiteSameNameRefList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;NextschemaWhiteSameNameRefCB&gt;() {
     *     public void query(NextschemaWhiteSameNameRefCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #DD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<NextschemaWhiteSameNameRefCB> derivedWhiteSameNameRefList() {
        return xcreateQDRFunctionWhiteSameNameRefList();
    }
    protected HpQDRFunction<NextschemaWhiteSameNameRefCB> xcreateQDRFunctionWhiteSameNameRefList() {
        return new HpQDRFunction<NextschemaWhiteSameNameRefCB>(new HpQDRSetupper<NextschemaWhiteSameNameRefCB>() {
            public void setup(String fn, SubQuery<NextschemaWhiteSameNameRefCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveWhiteSameNameRefList(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveWhiteSameNameRefList(String fn, SubQuery<NextschemaWhiteSameNameRefCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        NextschemaWhiteSameNameRefCB cb = new NextschemaWhiteSameNameRefCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String sqpp = keepSameNameId_QueryDerivedReferrer_WhiteSameNameRefList(cb.query()); String prpp = keepSameNameId_QueryDerivedReferrer_WhiteSameNameRefListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "same_name_id", "same_name_id", sqpp, "whiteSameNameRefList", rd, vl, prpp, op);
    }
    public abstract String keepSameNameId_QueryDerivedReferrer_WhiteSameNameRefList(NextschemaWhiteSameNameRefCQ sq);
    public abstract String keepSameNameId_QueryDerivedReferrer_WhiteSameNameRefListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * same_name_id: {PK, NotNull, int4(10)}
     */
    public void setSameNameId_IsNull() { regSameNameId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * same_name_id: {PK, NotNull, int4(10)}
     */
    public void setSameNameId_IsNotNull() { regSameNameId(CK_ISNN, DOBJ); }

    protected void regSameNameId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueSameNameId(), "same_name_id"); }
    protected abstract ConditionValue getCValueSameNameId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * same_name_name: {varchar(100)}
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
     * same_name_name: {varchar(100)}
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
     * same_name_name: {varchar(100)}
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
     * same_name_name: {varchar(100)}
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
     * same_name_name: {varchar(100)}
     * @param sameNameName The value of sameNameName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setSameNameName_PrefixSearch(String sameNameName) {
        setSameNameName_LikeSearch(sameNameName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * same_name_name: {varchar(100)} <br />
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
     * same_name_name: {varchar(100)}
     * @param sameNameName The value of sameNameName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSameNameName_NotLikeSearch(String sameNameName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sameNameName), getCValueSameNameName(), "same_name_name", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * same_name_name: {varchar(100)}
     */
    public void setSameNameName_IsNull() { regSameNameName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * same_name_name: {varchar(100)}
     */
    public void setSameNameName_IsNullOrEmpty() { regSameNameName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * same_name_name: {varchar(100)}
     */
    public void setSameNameName_IsNotNull() { regSameNameName(CK_ISNN, DOBJ); }

    protected void regSameNameName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueSameNameName(), "same_name_name"); }
    protected abstract ConditionValue getCValueSameNameName();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * same_name_long: {int8(19)}
     * @param sameNameLong The value of sameNameLong as equal. (NullAllowed: if null, no condition)
     */
    public void setSameNameLong_Equal(Long sameNameLong) {
        doSetSameNameLong_Equal(sameNameLong);
    }

    protected void doSetSameNameLong_Equal(Long sameNameLong) {
        regSameNameLong(CK_EQ, sameNameLong);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * same_name_long: {int8(19)}
     * @param sameNameLong The value of sameNameLong as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setSameNameLong_GreaterThan(Long sameNameLong) {
        regSameNameLong(CK_GT, sameNameLong);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * same_name_long: {int8(19)}
     * @param sameNameLong The value of sameNameLong as lessThan. (NullAllowed: if null, no condition)
     */
    public void setSameNameLong_LessThan(Long sameNameLong) {
        regSameNameLong(CK_LT, sameNameLong);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * same_name_long: {int8(19)}
     * @param sameNameLong The value of sameNameLong as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setSameNameLong_GreaterEqual(Long sameNameLong) {
        regSameNameLong(CK_GE, sameNameLong);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * same_name_long: {int8(19)}
     * @param sameNameLong The value of sameNameLong as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setSameNameLong_LessEqual(Long sameNameLong) {
        regSameNameLong(CK_LE, sameNameLong);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * same_name_long: {int8(19)}
     * @param minNumber The min number of sameNameLong. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of sameNameLong. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSameNameLong_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueSameNameLong(), "same_name_long", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * same_name_long: {int8(19)}
     * @param sameNameLongList The collection of sameNameLong as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSameNameLong_InScope(Collection<Long> sameNameLongList) {
        doSetSameNameLong_InScope(sameNameLongList);
    }

    protected void doSetSameNameLong_InScope(Collection<Long> sameNameLongList) {
        regINS(CK_INS, cTL(sameNameLongList), getCValueSameNameLong(), "same_name_long");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * same_name_long: {int8(19)}
     * @param sameNameLongList The collection of sameNameLong as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSameNameLong_NotInScope(Collection<Long> sameNameLongList) {
        doSetSameNameLong_NotInScope(sameNameLongList);
    }

    protected void doSetSameNameLong_NotInScope(Collection<Long> sameNameLongList) {
        regINS(CK_NINS, cTL(sameNameLongList), getCValueSameNameLong(), "same_name_long");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * same_name_long: {int8(19)}
     */
    public void setSameNameLong_IsNull() { regSameNameLong(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * same_name_long: {int8(19)}
     */
    public void setSameNameLong_IsNotNull() { regSameNameLong(CK_ISNN, DOBJ); }

    protected void regSameNameLong(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueSameNameLong(), "same_name_long"); }
    protected abstract ConditionValue getCValueSameNameLong();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;NextschemaWhiteSameNameCB&gt;() {
     *     public void query(NextschemaWhiteSameNameCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<NextschemaWhiteSameNameCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, NextschemaWhiteSameNameCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;NextschemaWhiteSameNameCB&gt;() {
     *     public void query(NextschemaWhiteSameNameCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<NextschemaWhiteSameNameCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, NextschemaWhiteSameNameCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;NextschemaWhiteSameNameCB&gt;() {
     *     public void query(NextschemaWhiteSameNameCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<NextschemaWhiteSameNameCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, NextschemaWhiteSameNameCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;NextschemaWhiteSameNameCB&gt;() {
     *     public void query(NextschemaWhiteSameNameCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<NextschemaWhiteSameNameCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, NextschemaWhiteSameNameCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;NextschemaWhiteSameNameCB&gt;() {
     *     public void query(NextschemaWhiteSameNameCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<NextschemaWhiteSameNameCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, NextschemaWhiteSameNameCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;NextschemaWhiteSameNameCB&gt;() {
     *     public void query(NextschemaWhiteSameNameCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<NextschemaWhiteSameNameCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, NextschemaWhiteSameNameCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        NextschemaWhiteSameNameCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(NextschemaWhiteSameNameCQ sq);

    protected NextschemaWhiteSameNameCB xcreateScalarConditionCB() {
        NextschemaWhiteSameNameCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected NextschemaWhiteSameNameCB xcreateScalarConditionPartitionByCB() {
        NextschemaWhiteSameNameCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<NextschemaWhiteSameNameCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        NextschemaWhiteSameNameCB cb = new NextschemaWhiteSameNameCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "same_name_id";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(NextschemaWhiteSameNameCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<NextschemaWhiteSameNameCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(NextschemaWhiteSameNameCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        NextschemaWhiteSameNameCB cb = new NextschemaWhiteSameNameCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "same_name_id";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(NextschemaWhiteSameNameCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<NextschemaWhiteSameNameCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        NextschemaWhiteSameNameCB cb = new NextschemaWhiteSameNameCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(NextschemaWhiteSameNameCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfInScope(SubQuery<NextschemaWhiteSameNameCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        NextschemaWhiteSameNameCB cb = new NextschemaWhiteSameNameCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(NextschemaWhiteSameNameCQ sq);

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
    protected NextschemaWhiteSameNameCB newMyCB() {
        return new NextschemaWhiteSameNameCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return NextschemaWhiteSameNameCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
