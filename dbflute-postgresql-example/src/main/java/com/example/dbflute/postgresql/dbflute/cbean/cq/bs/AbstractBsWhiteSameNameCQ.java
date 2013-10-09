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
    public AbstractBsWhiteSameNameCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select same_name_id from white_same_name_ref where ...)} <br />
     * white_same_name_ref by same_name_id, named 'whiteSameNameRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsWhiteSameNameRefList</span>(new SubQuery&lt;WhiteSameNameRefCB&gt;() {
     *     public void query(WhiteSameNameCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of WhiteSameNameRefList for 'exists'. (NotNull)
     */
    public void existsWhiteSameNameRefList(SubQuery<WhiteSameNameRefCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteSameNameRefCB>", subQuery);
        WhiteSameNameRefCB cb = new WhiteSameNameRefCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSameNameId_ExistsReferrer_WhiteSameNameRefList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "same_name_id", "same_name_id", subQueryPropertyName, "whiteSameNameRefList");
    }
    public abstract String keepSameNameId_ExistsReferrer_WhiteSameNameRefList(WhiteSameNameRefCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select same_name_id from white_same_name_ref where ...)} <br />
     * white_same_name_ref by same_name_id, named 'whiteSameNameRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsWhiteSameNameRefList</span>(new SubQuery&lt;WhiteSameNameRefCB&gt;() {
     *     public void query(WhiteSameNameCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of SameNameId_NotExistsReferrer_WhiteSameNameRefList for 'not exists'. (NotNull)
     */
    public void notExistsWhiteSameNameRefList(SubQuery<WhiteSameNameRefCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteSameNameRefCB>", subQuery);
        WhiteSameNameRefCB cb = new WhiteSameNameRefCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSameNameId_NotExistsReferrer_WhiteSameNameRefList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "same_name_id", "same_name_id", subQueryPropertyName, "whiteSameNameRefList");
    }
    public abstract String keepSameNameId_NotExistsReferrer_WhiteSameNameRefList(WhiteSameNameRefCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select same_name_id from white_same_name_ref where ...)} <br />
     * white_same_name_ref by same_name_id, named 'whiteSameNameRefAsOne'.
     * @param subQuery The sub-query of WhiteSameNameRefList for 'in-scope'. (NotNull)
     */
    public void inScopeWhiteSameNameRefList(SubQuery<WhiteSameNameRefCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteSameNameRefCB>", subQuery);
        WhiteSameNameRefCB cb = new WhiteSameNameRefCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepSameNameId_InScopeRelation_WhiteSameNameRefList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "same_name_id", "same_name_id", subQueryPropertyName, "whiteSameNameRefList");
    }
    public abstract String keepSameNameId_InScopeRelation_WhiteSameNameRefList(WhiteSameNameRefCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select same_name_id from white_same_name_ref where ...)} <br />
     * white_same_name_ref by same_name_id, named 'whiteSameNameRefAsOne'.
     * @param subQuery The sub-query of WhiteSameNameRefList for 'not in-scope'. (NotNull)
     */
    public void notInScopeWhiteSameNameRefList(SubQuery<WhiteSameNameRefCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteSameNameRefCB>", subQuery);
        WhiteSameNameRefCB cb = new WhiteSameNameRefCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepSameNameId_NotInScopeRelation_WhiteSameNameRefList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "same_name_id", "same_name_id", subQueryPropertyName, "whiteSameNameRefList");
    }
    public abstract String keepSameNameId_NotInScopeRelation_WhiteSameNameRefList(WhiteSameNameRefCQ subQuery);

    public void xsderiveWhiteSameNameRefList(String function, SubQuery<WhiteSameNameRefCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<WhiteSameNameRefCB>", subQuery);
        WhiteSameNameRefCB cb = new WhiteSameNameRefCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSameNameId_SpecifyDerivedReferrer_WhiteSameNameRefList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "same_name_id", "same_name_id", subQueryPropertyName, "whiteSameNameRefList", aliasName, option);
    }
    public abstract String keepSameNameId_SpecifyDerivedReferrer_WhiteSameNameRefList(WhiteSameNameRefCQ subQuery);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from white_same_name_ref where ...)} <br />
     * white_same_name_ref by same_name_id, named 'whiteSameNameRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">derivedWhiteSameNameRefList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;WhiteSameNameRefCB&gt;() {
     *     public void query(WhiteSameNameRefCB subCB) {
     *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #FD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WhiteSameNameRefCB> derivedWhiteSameNameRefList() {
        return xcreateQDRFunctionWhiteSameNameRefList();
    }
    protected HpQDRFunction<WhiteSameNameRefCB> xcreateQDRFunctionWhiteSameNameRefList() {
        return new HpQDRFunction<WhiteSameNameRefCB>(new HpQDRSetupper<WhiteSameNameRefCB>() {
            public void setup(String function, SubQuery<WhiteSameNameRefCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveWhiteSameNameRefList(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveWhiteSameNameRefList(String function, SubQuery<WhiteSameNameRefCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<WhiteSameNameRefCB>", subQuery);
        WhiteSameNameRefCB cb = new WhiteSameNameRefCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSameNameId_QueryDerivedReferrer_WhiteSameNameRefList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepSameNameId_QueryDerivedReferrer_WhiteSameNameRefListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "same_name_id", "same_name_id", subQueryPropertyName, "whiteSameNameRefList", operand, value, parameterPropertyName, option);
    }
    public abstract String keepSameNameId_QueryDerivedReferrer_WhiteSameNameRefList(WhiteSameNameRefCQ subQuery);
    public abstract String keepSameNameId_QueryDerivedReferrer_WhiteSameNameRefListParameter(Object parameterValue);

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

    protected void regSameNameId(ConditionKey k, Object v) { regQ(k, v, getCValueSameNameId(), "same_name_id"); }
    abstract protected ConditionValue getCValueSameNameId();

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
     * <pre>e.g. setSameNameName_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
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

    protected void regSameNameName(ConditionKey k, Object v) { regQ(k, v, getCValueSameNameName(), "same_name_name"); }
    abstract protected ConditionValue getCValueSameNameName();
    
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

    protected void regSameNameInteger(ConditionKey k, Object v) { regQ(k, v, getCValueSameNameInteger(), "same_name_integer"); }
    abstract protected ConditionValue getCValueSameNameInteger();
    
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
        assertObjectNotNull("subQuery<NextSchemaProductCB>", subQuery);
        NextSchemaProductCB cb = new NextSchemaProductCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepNextSchemaProductId_InScopeRelation_NextSchemaProduct(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "next_schema_product_id", "PRODUCT_ID", subQueryPropertyName, "nextSchemaProduct");
    }
    public abstract String keepNextSchemaProductId_InScopeRelation_NextSchemaProduct(NextSchemaProductCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select NEXT_SCHEMA_PRODUCT_ID from next_schema_product where ...)} <br />
     * next_schema_product by my next_schema_product_id, named 'nextSchemaProduct'.
     * @param subQuery The sub-query of NextSchemaProduct for 'not in-scope'. (NotNull)
     */
    public void notInScopeNextSchemaProduct(SubQuery<NextSchemaProductCB> subQuery) {
        assertObjectNotNull("subQuery<NextSchemaProductCB>", subQuery);
        NextSchemaProductCB cb = new NextSchemaProductCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepNextSchemaProductId_NotInScopeRelation_NextSchemaProduct(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "next_schema_product_id", "PRODUCT_ID", subQueryPropertyName, "nextSchemaProduct");
    }
    public abstract String keepNextSchemaProductId_NotInScopeRelation_NextSchemaProduct(NextSchemaProductCQ subQuery);

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

    protected void regNextSchemaProductId(ConditionKey k, Object v) { regQ(k, v, getCValueNextSchemaProductId(), "next_schema_product_id"); }
    abstract protected ConditionValue getCValueNextSchemaProductId();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteSameNameCB&gt;() {
     *     public void query(WhiteSameNameCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSameNameCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteSameNameCB&gt;() {
     *     public void query(WhiteSameNameCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSameNameCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteSameNameCB&gt;() {
     *     public void query(WhiteSameNameCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSameNameCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteSameNameCB&gt;() {
     *     public void query(WhiteSameNameCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSameNameCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteSameNameCB&gt;() {
     *     public void query(WhiteSameNameCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSameNameCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteSameNameCB&gt;() {
     *     public void query(WhiteSameNameCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteSameNameCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<WhiteSameNameCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<WhiteSameNameCB>(new HpSSQSetupper<WhiteSameNameCB>() {
            public void setup(String function, SubQuery<WhiteSameNameCB> subQuery, HpSSQOption<WhiteSameNameCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<WhiteSameNameCB> subQuery, String operand, HpSSQOption<WhiteSameNameCB> option) {
        assertObjectNotNull("subQuery<WhiteSameNameCB>", subQuery);
        WhiteSameNameCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(WhiteSameNameCQ subQuery);

    protected WhiteSameNameCB xcreateScalarConditionCB() {
        WhiteSameNameCB cb = new WhiteSameNameCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected WhiteSameNameCB xcreateScalarConditionPartitionByCB() {
        WhiteSameNameCB cb = new WhiteSameNameCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<WhiteSameNameCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<WhiteSameNameCB>", subQuery);
        WhiteSameNameCB cb = new WhiteSameNameCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "same_name_id", "same_name_id", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteSameNameCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteSameNameCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<WhiteSameNameCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<WhiteSameNameCB>(new HpQDRSetupper<WhiteSameNameCB>() {
            public void setup(String function, SubQuery<WhiteSameNameCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<WhiteSameNameCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<WhiteSameNameCB>", subQuery);
        WhiteSameNameCB cb = new WhiteSameNameCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "same_name_id", "same_name_id", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(WhiteSameNameCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteSameNameCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteSameNameCB>", subQuery);
        WhiteSameNameCB cb = new WhiteSameNameCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(WhiteSameNameCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteSameNameCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteSameNameCB>", subQuery);
        WhiteSameNameCB cb = new WhiteSameNameCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(WhiteSameNameCQ subQuery);

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
    protected String xabCB() { return WhiteSameNameCB.class.getName(); }
    protected String xabCQ() { return WhiteSameNameCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
