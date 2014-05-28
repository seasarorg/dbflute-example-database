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
 * The abstract condition-query of WHITE_UQ_FK.
 * @author oracleman
 */
public abstract class AbstractBsWhiteUqFkCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteUqFkCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "WHITE_UQ_FK";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * UQ_FK_ID: {PK, NotNull, NUMBER(16)}
     * @param uqFkId The value of uqFkId as equal. (NullAllowed: if null, no condition)
     */
    public void setUqFkId_Equal(Long uqFkId) {
        doSetUqFkId_Equal(uqFkId);
    }

    protected void doSetUqFkId_Equal(Long uqFkId) {
        regUqFkId(CK_EQ, uqFkId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * UQ_FK_ID: {PK, NotNull, NUMBER(16)}
     * @param uqFkId The value of uqFkId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setUqFkId_GreaterThan(Long uqFkId) {
        regUqFkId(CK_GT, uqFkId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * UQ_FK_ID: {PK, NotNull, NUMBER(16)}
     * @param uqFkId The value of uqFkId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setUqFkId_LessThan(Long uqFkId) {
        regUqFkId(CK_LT, uqFkId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * UQ_FK_ID: {PK, NotNull, NUMBER(16)}
     * @param uqFkId The value of uqFkId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setUqFkId_GreaterEqual(Long uqFkId) {
        regUqFkId(CK_GE, uqFkId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * UQ_FK_ID: {PK, NotNull, NUMBER(16)}
     * @param uqFkId The value of uqFkId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setUqFkId_LessEqual(Long uqFkId) {
        regUqFkId(CK_LE, uqFkId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * UQ_FK_ID: {PK, NotNull, NUMBER(16)}
     * @param minNumber The min number of uqFkId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of uqFkId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setUqFkId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueUqFkId(), "UQ_FK_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * UQ_FK_ID: {PK, NotNull, NUMBER(16)}
     * @param uqFkIdList The collection of uqFkId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUqFkId_InScope(Collection<Long> uqFkIdList) {
        doSetUqFkId_InScope(uqFkIdList);
    }

    protected void doSetUqFkId_InScope(Collection<Long> uqFkIdList) {
        regINS(CK_INS, cTL(uqFkIdList), getCValueUqFkId(), "UQ_FK_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * UQ_FK_ID: {PK, NotNull, NUMBER(16)}
     * @param uqFkIdList The collection of uqFkId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUqFkId_NotInScope(Collection<Long> uqFkIdList) {
        doSetUqFkId_NotInScope(uqFkIdList);
    }

    protected void doSetUqFkId_NotInScope(Collection<Long> uqFkIdList) {
        regINS(CK_NINS, cTL(uqFkIdList), getCValueUqFkId(), "UQ_FK_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br />
     * {exists (select FK_TO_PK_ID from WHITE_UQ_FK_REF where ...)} <br />
     * WHITE_UQ_FK_REF by FK_TO_PK_ID, named 'whiteUqFkRefByFkToPkIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">existsWhiteUqFkRefByFkToPkIdList</span>(new SubQuery&lt;WhiteUqFkRefCB&gt;() {
     *     public void query(WhiteUqFkRefCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of WhiteUqFkRefByFkToPkIdList for 'exists'. (NotNull)
     */
    public void existsWhiteUqFkRefByFkToPkIdList(SubQuery<WhiteUqFkRefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteUqFkRefCB cb = new WhiteUqFkRefCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepUqFkId_ExistsReferrer_WhiteUqFkRefByFkToPkIdList(cb.query());
        registerExistsReferrer(cb.query(), "UQ_FK_ID", "FK_TO_PK_ID", pp, "whiteUqFkRefByFkToPkIdList");
    }
    public abstract String keepUqFkId_ExistsReferrer_WhiteUqFkRefByFkToPkIdList(WhiteUqFkRefCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select FK_TO_PK_ID from WHITE_UQ_FK_REF where ...)} <br />
     * WHITE_UQ_FK_REF by FK_TO_PK_ID, named 'whiteUqFkRefByFkToPkIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">notExistsWhiteUqFkRefByFkToPkIdList</span>(new SubQuery&lt;WhiteUqFkRefCB&gt;() {
     *     public void query(WhiteUqFkRefCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of UqFkId_NotExistsReferrer_WhiteUqFkRefByFkToPkIdList for 'not exists'. (NotNull)
     */
    public void notExistsWhiteUqFkRefByFkToPkIdList(SubQuery<WhiteUqFkRefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteUqFkRefCB cb = new WhiteUqFkRefCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepUqFkId_NotExistsReferrer_WhiteUqFkRefByFkToPkIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "UQ_FK_ID", "FK_TO_PK_ID", pp, "whiteUqFkRefByFkToPkIdList");
    }
    public abstract String keepUqFkId_NotExistsReferrer_WhiteUqFkRefByFkToPkIdList(WhiteUqFkRefCQ sq);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select FK_TO_PK_ID from WHITE_UQ_FK_REF where ...)} <br />
     * WHITE_UQ_FK_REF by FK_TO_PK_ID, named 'whiteUqFkRefByFkToPkIdAsOne'.
     * @param subQuery The sub-query of WhiteUqFkRefByFkToPkIdList for 'in-scope'. (NotNull)
     */
    public void inScopeWhiteUqFkRefByFkToPkIdList(SubQuery<WhiteUqFkRefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteUqFkRefCB cb = new WhiteUqFkRefCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepUqFkId_InScopeRelation_WhiteUqFkRefByFkToPkIdList(cb.query());
        registerInScopeRelation(cb.query(), "UQ_FK_ID", "FK_TO_PK_ID", pp, "whiteUqFkRefByFkToPkIdList");
    }
    public abstract String keepUqFkId_InScopeRelation_WhiteUqFkRefByFkToPkIdList(WhiteUqFkRefCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select FK_TO_PK_ID from WHITE_UQ_FK_REF where ...)} <br />
     * WHITE_UQ_FK_REF by FK_TO_PK_ID, named 'whiteUqFkRefByFkToPkIdAsOne'.
     * @param subQuery The sub-query of WhiteUqFkRefByFkToPkIdList for 'not in-scope'. (NotNull)
     */
    public void notInScopeWhiteUqFkRefByFkToPkIdList(SubQuery<WhiteUqFkRefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteUqFkRefCB cb = new WhiteUqFkRefCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepUqFkId_NotInScopeRelation_WhiteUqFkRefByFkToPkIdList(cb.query());
        registerNotInScopeRelation(cb.query(), "UQ_FK_ID", "FK_TO_PK_ID", pp, "whiteUqFkRefByFkToPkIdList");
    }
    public abstract String keepUqFkId_NotInScopeRelation_WhiteUqFkRefByFkToPkIdList(WhiteUqFkRefCQ sq);

    public void xsderiveWhiteUqFkRefByFkToPkIdList(String fn, SubQuery<WhiteUqFkRefCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteUqFkRefCB cb = new WhiteUqFkRefCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepUqFkId_SpecifyDerivedReferrer_WhiteUqFkRefByFkToPkIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "UQ_FK_ID", "FK_TO_PK_ID", pp, "whiteUqFkRefByFkToPkIdList", al, op);
    }
    public abstract String keepUqFkId_SpecifyDerivedReferrer_WhiteUqFkRefByFkToPkIdList(WhiteUqFkRefCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br />
     * {FOO &lt;= (select max(BAR) from WHITE_UQ_FK_REF where ...)} <br />
     * WHITE_UQ_FK_REF by FK_TO_PK_ID, named 'whiteUqFkRefByFkToPkIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">derivedWhiteUqFkRefByFkToPkIdList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;WhiteUqFkRefCB&gt;() {
     *     public void query(WhiteUqFkRefCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #DD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WhiteUqFkRefCB> derivedWhiteUqFkRefByFkToPkIdList() {
        return xcreateQDRFunctionWhiteUqFkRefByFkToPkIdList();
    }
    protected HpQDRFunction<WhiteUqFkRefCB> xcreateQDRFunctionWhiteUqFkRefByFkToPkIdList() {
        return new HpQDRFunction<WhiteUqFkRefCB>(new HpQDRSetupper<WhiteUqFkRefCB>() {
            public void setup(String fn, SubQuery<WhiteUqFkRefCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveWhiteUqFkRefByFkToPkIdList(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveWhiteUqFkRefByFkToPkIdList(String fn, SubQuery<WhiteUqFkRefCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteUqFkRefCB cb = new WhiteUqFkRefCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String sqpp = keepUqFkId_QueryDerivedReferrer_WhiteUqFkRefByFkToPkIdList(cb.query()); String prpp = keepUqFkId_QueryDerivedReferrer_WhiteUqFkRefByFkToPkIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "UQ_FK_ID", "FK_TO_PK_ID", sqpp, "whiteUqFkRefByFkToPkIdList", rd, vl, prpp, op);
    }
    public abstract String keepUqFkId_QueryDerivedReferrer_WhiteUqFkRefByFkToPkIdList(WhiteUqFkRefCQ sq);
    public abstract String keepUqFkId_QueryDerivedReferrer_WhiteUqFkRefByFkToPkIdListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * UQ_FK_ID: {PK, NotNull, NUMBER(16)}
     */
    public void setUqFkId_IsNull() { regUqFkId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * UQ_FK_ID: {PK, NotNull, NUMBER(16)}
     */
    public void setUqFkId_IsNotNull() { regUqFkId(CK_ISNN, DOBJ); }

    protected void regUqFkId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueUqFkId(), "UQ_FK_ID"); }
    protected abstract ConditionValue getCValueUqFkId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * UQ_FK_CODE: {UQ, NotNull, CHAR(3)}
     * @param uqFkCode The value of uqFkCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setUqFkCode_Equal(String uqFkCode) {
        doSetUqFkCode_Equal(fRES(uqFkCode));
    }

    protected void doSetUqFkCode_Equal(String uqFkCode) {
        regUqFkCode(CK_EQ, hSC("UQ_FK_CODE", uqFkCode, 3, "R"));
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * UQ_FK_CODE: {UQ, NotNull, CHAR(3)}
     * @param uqFkCode The value of uqFkCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUqFkCode_NotEqual(String uqFkCode) {
        doSetUqFkCode_NotEqual(fRES(uqFkCode));
    }

    protected void doSetUqFkCode_NotEqual(String uqFkCode) {
        regUqFkCode(CK_NES, hSC("UQ_FK_CODE", uqFkCode, 3, "R"));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * UQ_FK_CODE: {UQ, NotNull, CHAR(3)}
     * @param uqFkCodeList The collection of uqFkCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUqFkCode_InScope(Collection<String> uqFkCodeList) {
        doSetUqFkCode_InScope(uqFkCodeList);
    }

    public void doSetUqFkCode_InScope(Collection<String> uqFkCodeList) {
        regINS(CK_INS, cTL(uqFkCodeList), getCValueUqFkCode(), "UQ_FK_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * UQ_FK_CODE: {UQ, NotNull, CHAR(3)}
     * @param uqFkCodeList The collection of uqFkCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUqFkCode_NotInScope(Collection<String> uqFkCodeList) {
        doSetUqFkCode_NotInScope(uqFkCodeList);
    }

    public void doSetUqFkCode_NotInScope(Collection<String> uqFkCodeList) {
        regINS(CK_NINS, cTL(uqFkCodeList), getCValueUqFkCode(), "UQ_FK_CODE");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * UQ_FK_CODE: {UQ, NotNull, CHAR(3)}
     * @param uqFkCode The value of uqFkCode as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setUqFkCode_PrefixSearch(String uqFkCode) {
        setUqFkCode_LikeSearch(uqFkCode, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * UQ_FK_CODE: {UQ, NotNull, CHAR(3)} <br />
     * <pre>e.g. setUqFkCode_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param uqFkCode The value of uqFkCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUqFkCode_LikeSearch(String uqFkCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(uqFkCode), getCValueUqFkCode(), "UQ_FK_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * UQ_FK_CODE: {UQ, NotNull, CHAR(3)}
     * @param uqFkCode The value of uqFkCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUqFkCode_NotLikeSearch(String uqFkCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(uqFkCode), getCValueUqFkCode(), "UQ_FK_CODE", likeSearchOption);
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br />
     * {exists (select FK_TO_UQ_CODE from WHITE_UQ_FK_REF where ...)} <br />
     * WHITE_UQ_FK_REF by FK_TO_UQ_CODE, named 'whiteUqFkRefByFkToUqCodeAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">existsWhiteUqFkRefByFkToUqCodeList</span>(new SubQuery&lt;WhiteUqFkRefCB&gt;() {
     *     public void query(WhiteUqFkRefCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of WhiteUqFkRefByFkToUqCodeList for 'exists'. (NotNull)
     */
    public void existsWhiteUqFkRefByFkToUqCodeList(SubQuery<WhiteUqFkRefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteUqFkRefCB cb = new WhiteUqFkRefCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepUqFkCode_ExistsReferrer_WhiteUqFkRefByFkToUqCodeList(cb.query());
        registerExistsReferrer(cb.query(), "UQ_FK_CODE", "FK_TO_UQ_CODE", pp, "whiteUqFkRefByFkToUqCodeList");
    }
    public abstract String keepUqFkCode_ExistsReferrer_WhiteUqFkRefByFkToUqCodeList(WhiteUqFkRefCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select FK_TO_UQ_CODE from WHITE_UQ_FK_REF where ...)} <br />
     * WHITE_UQ_FK_REF by FK_TO_UQ_CODE, named 'whiteUqFkRefByFkToUqCodeAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">notExistsWhiteUqFkRefByFkToUqCodeList</span>(new SubQuery&lt;WhiteUqFkRefCB&gt;() {
     *     public void query(WhiteUqFkRefCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of UqFkCode_NotExistsReferrer_WhiteUqFkRefByFkToUqCodeList for 'not exists'. (NotNull)
     */
    public void notExistsWhiteUqFkRefByFkToUqCodeList(SubQuery<WhiteUqFkRefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteUqFkRefCB cb = new WhiteUqFkRefCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepUqFkCode_NotExistsReferrer_WhiteUqFkRefByFkToUqCodeList(cb.query());
        registerNotExistsReferrer(cb.query(), "UQ_FK_CODE", "FK_TO_UQ_CODE", pp, "whiteUqFkRefByFkToUqCodeList");
    }
    public abstract String keepUqFkCode_NotExistsReferrer_WhiteUqFkRefByFkToUqCodeList(WhiteUqFkRefCQ sq);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select FK_TO_UQ_CODE from WHITE_UQ_FK_REF where ...)} <br />
     * WHITE_UQ_FK_REF by FK_TO_UQ_CODE, named 'whiteUqFkRefByFkToUqCodeAsOne'.
     * @param subQuery The sub-query of WhiteUqFkRefByFkToUqCodeList for 'in-scope'. (NotNull)
     */
    public void inScopeWhiteUqFkRefByFkToUqCodeList(SubQuery<WhiteUqFkRefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteUqFkRefCB cb = new WhiteUqFkRefCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepUqFkCode_InScopeRelation_WhiteUqFkRefByFkToUqCodeList(cb.query());
        registerInScopeRelation(cb.query(), "UQ_FK_CODE", "FK_TO_UQ_CODE", pp, "whiteUqFkRefByFkToUqCodeList");
    }
    public abstract String keepUqFkCode_InScopeRelation_WhiteUqFkRefByFkToUqCodeList(WhiteUqFkRefCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select FK_TO_UQ_CODE from WHITE_UQ_FK_REF where ...)} <br />
     * WHITE_UQ_FK_REF by FK_TO_UQ_CODE, named 'whiteUqFkRefByFkToUqCodeAsOne'.
     * @param subQuery The sub-query of WhiteUqFkRefByFkToUqCodeList for 'not in-scope'. (NotNull)
     */
    public void notInScopeWhiteUqFkRefByFkToUqCodeList(SubQuery<WhiteUqFkRefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteUqFkRefCB cb = new WhiteUqFkRefCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepUqFkCode_NotInScopeRelation_WhiteUqFkRefByFkToUqCodeList(cb.query());
        registerNotInScopeRelation(cb.query(), "UQ_FK_CODE", "FK_TO_UQ_CODE", pp, "whiteUqFkRefByFkToUqCodeList");
    }
    public abstract String keepUqFkCode_NotInScopeRelation_WhiteUqFkRefByFkToUqCodeList(WhiteUqFkRefCQ sq);

    public void xsderiveWhiteUqFkRefByFkToUqCodeList(String fn, SubQuery<WhiteUqFkRefCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteUqFkRefCB cb = new WhiteUqFkRefCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepUqFkCode_SpecifyDerivedReferrer_WhiteUqFkRefByFkToUqCodeList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "UQ_FK_CODE", "FK_TO_UQ_CODE", pp, "whiteUqFkRefByFkToUqCodeList", al, op);
    }
    public abstract String keepUqFkCode_SpecifyDerivedReferrer_WhiteUqFkRefByFkToUqCodeList(WhiteUqFkRefCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br />
     * {FOO &lt;= (select max(BAR) from WHITE_UQ_FK_REF where ...)} <br />
     * WHITE_UQ_FK_REF by FK_TO_UQ_CODE, named 'whiteUqFkRefByFkToUqCodeAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">derivedWhiteUqFkRefByFkToUqCodeList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;WhiteUqFkRefCB&gt;() {
     *     public void query(WhiteUqFkRefCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #DD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WhiteUqFkRefCB> derivedWhiteUqFkRefByFkToUqCodeList() {
        return xcreateQDRFunctionWhiteUqFkRefByFkToUqCodeList();
    }
    protected HpQDRFunction<WhiteUqFkRefCB> xcreateQDRFunctionWhiteUqFkRefByFkToUqCodeList() {
        return new HpQDRFunction<WhiteUqFkRefCB>(new HpQDRSetupper<WhiteUqFkRefCB>() {
            public void setup(String fn, SubQuery<WhiteUqFkRefCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveWhiteUqFkRefByFkToUqCodeList(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveWhiteUqFkRefByFkToUqCodeList(String fn, SubQuery<WhiteUqFkRefCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteUqFkRefCB cb = new WhiteUqFkRefCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String sqpp = keepUqFkCode_QueryDerivedReferrer_WhiteUqFkRefByFkToUqCodeList(cb.query()); String prpp = keepUqFkCode_QueryDerivedReferrer_WhiteUqFkRefByFkToUqCodeListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "UQ_FK_CODE", "FK_TO_UQ_CODE", sqpp, "whiteUqFkRefByFkToUqCodeList", rd, vl, prpp, op);
    }
    public abstract String keepUqFkCode_QueryDerivedReferrer_WhiteUqFkRefByFkToUqCodeList(WhiteUqFkRefCQ sq);
    public abstract String keepUqFkCode_QueryDerivedReferrer_WhiteUqFkRefByFkToUqCodeListParameter(Object vl);

    protected void regUqFkCode(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueUqFkCode(), "UQ_FK_CODE"); }
    protected abstract ConditionValue getCValueUqFkCode();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteUqFkCB&gt;() {
     *     public void query(WhiteUqFkCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteUqFkCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand(), WhiteUqFkCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteUqFkCB&gt;() {
     *     public void query(WhiteUqFkCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteUqFkCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand(), WhiteUqFkCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteUqFkCB&gt;() {
     *     public void query(WhiteUqFkCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteUqFkCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand(), WhiteUqFkCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteUqFkCB&gt;() {
     *     public void query(WhiteUqFkCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteUqFkCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand(), WhiteUqFkCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteUqFkCB&gt;() {
     *     public void query(WhiteUqFkCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteUqFkCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand(), WhiteUqFkCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteUqFkCB&gt;() {
     *     public void query(WhiteUqFkCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteUqFkCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand(), WhiteUqFkCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WhiteUqFkCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhiteUqFkCQ sq);

    protected WhiteUqFkCB xcreateScalarConditionCB() {
        WhiteUqFkCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteUqFkCB xcreateScalarConditionPartitionByCB() {
        WhiteUqFkCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteUqFkCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteUqFkCB cb = new WhiteUqFkCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "UQ_FK_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteUqFkCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteUqFkCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteUqFkCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteUqFkCB cb = new WhiteUqFkCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "UQ_FK_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteUqFkCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteUqFkCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteUqFkCB cb = new WhiteUqFkCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteUqFkCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteUqFkCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteUqFkCB cb = new WhiteUqFkCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(WhiteUqFkCQ sq);

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
    protected WhiteUqFkCB newMyCB() {
        return new WhiteUqFkCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return WhiteUqFkCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
