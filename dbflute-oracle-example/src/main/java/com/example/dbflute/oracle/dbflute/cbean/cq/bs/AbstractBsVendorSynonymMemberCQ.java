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
 * The abstract condition-query of VENDOR_SYNONYM_MEMBER.
 * @author oracleman
 */
public abstract class AbstractBsVendorSynonymMemberCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsVendorSynonymMemberCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "VENDOR_SYNONYM_MEMBER";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {PK, NotNull, NUMBER(16)}
     * @param memberId The value of memberId as equal. (NullAllowed: if null, no condition)
     */
    public void setMemberId_Equal(Long memberId) {
        doSetMemberId_Equal(memberId);
    }

    protected void doSetMemberId_Equal(Long memberId) {
        regMemberId(CK_EQ, memberId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {PK, NotNull, NUMBER(16)}
     * @param memberId The value of memberId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setMemberId_GreaterThan(Long memberId) {
        regMemberId(CK_GT, memberId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {PK, NotNull, NUMBER(16)}
     * @param memberId The value of memberId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setMemberId_LessThan(Long memberId) {
        regMemberId(CK_LT, memberId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {PK, NotNull, NUMBER(16)}
     * @param memberId The value of memberId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setMemberId_GreaterEqual(Long memberId) {
        regMemberId(CK_GE, memberId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {PK, NotNull, NUMBER(16)}
     * @param memberId The value of memberId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setMemberId_LessEqual(Long memberId) {
        regMemberId(CK_LE, memberId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {PK, NotNull, NUMBER(16)}
     * @param minNumber The min number of memberId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of memberId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMemberId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueMemberId(), "MEMBER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (会員ID)MEMBER_ID: {PK, NotNull, NUMBER(16)}
     * @param memberIdList The collection of memberId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberId_InScope(Collection<Long> memberIdList) {
        doSetMemberId_InScope(memberIdList);
    }

    protected void doSetMemberId_InScope(Collection<Long> memberIdList) {
        regINS(CK_INS, cTL(memberIdList), getCValueMemberId(), "MEMBER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (会員ID)MEMBER_ID: {PK, NotNull, NUMBER(16)}
     * @param memberIdList The collection of memberId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberId_NotInScope(Collection<Long> memberIdList) {
        doSetMemberId_NotInScope(memberIdList);
    }

    protected void doSetMemberId_NotInScope(Collection<Long> memberIdList) {
        regINS(CK_NINS, cTL(memberIdList), getCValueMemberId(), "MEMBER_ID");
    }

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select MEMBER_ID from SYNONYM_MEMBER_LOGIN where ...)} <br />
     * (会員ログイン)SYNONYM_MEMBER_LOGIN by MEMBER_ID, named 'synonymMemberLoginAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsSynonymMemberLoginList</span>(new SubQuery&lt;SynonymMemberLoginCB&gt;() {
     *     public void query(SynonymMemberLoginCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of SynonymMemberLoginList for 'exists'. (NotNull)
     */
    public void existsSynonymMemberLoginList(SubQuery<SynonymMemberLoginCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        SynonymMemberLoginCB cb = new SynonymMemberLoginCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String pp = keepMemberId_ExistsReferrer_SynonymMemberLoginList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "synonymMemberLoginList");
    }
    public abstract String keepMemberId_ExistsReferrer_SynonymMemberLoginList(SynonymMemberLoginCQ sq);

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select MEMBER_ID from SYNONYM_MEMBER_WITHDRAWAL where ...)} <br />
     * SYNONYM_MEMBER_WITHDRAWAL by MEMBER_ID, named 'synonymMemberWithdrawalAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsSynonymMemberWithdrawalAsOne</span>(new SubQuery&lt;SynonymMemberWithdrawalCB&gt;() {
     *     public void query(SynonymMemberWithdrawalCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of SynonymMemberWithdrawalAsOne for 'exists'. (NotNull)
     */
    public void existsSynonymMemberWithdrawalAsOne(SubQuery<SynonymMemberWithdrawalCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        SynonymMemberWithdrawalCB cb = new SynonymMemberWithdrawalCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String pp = keepMemberId_ExistsReferrer_SynonymMemberWithdrawalAsOne(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "synonymMemberWithdrawalAsOne");
    }
    public abstract String keepMemberId_ExistsReferrer_SynonymMemberWithdrawalAsOne(SynonymMemberWithdrawalCQ sq);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select MEMBER_ID from SYNONYM_MEMBER_LOGIN where ...)} <br />
     * (会員ログイン)SYNONYM_MEMBER_LOGIN by MEMBER_ID, named 'synonymMemberLoginAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsSynonymMemberLoginList</span>(new SubQuery&lt;SynonymMemberLoginCB&gt;() {
     *     public void query(SynonymMemberLoginCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of MemberId_NotExistsReferrer_SynonymMemberLoginList for 'not exists'. (NotNull)
     */
    public void notExistsSynonymMemberLoginList(SubQuery<SynonymMemberLoginCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        SynonymMemberLoginCB cb = new SynonymMemberLoginCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String pp = keepMemberId_NotExistsReferrer_SynonymMemberLoginList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "synonymMemberLoginList");
    }
    public abstract String keepMemberId_NotExistsReferrer_SynonymMemberLoginList(SynonymMemberLoginCQ sq);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select MEMBER_ID from SYNONYM_MEMBER_WITHDRAWAL where ...)} <br />
     * SYNONYM_MEMBER_WITHDRAWAL by MEMBER_ID, named 'synonymMemberWithdrawalAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsSynonymMemberWithdrawalAsOne</span>(new SubQuery&lt;SynonymMemberWithdrawalCB&gt;() {
     *     public void query(SynonymMemberWithdrawalCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of MemberId_NotExistsReferrer_SynonymMemberWithdrawalAsOne for 'not exists'. (NotNull)
     */
    public void notExistsSynonymMemberWithdrawalAsOne(SubQuery<SynonymMemberWithdrawalCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        SynonymMemberWithdrawalCB cb = new SynonymMemberWithdrawalCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String pp = keepMemberId_NotExistsReferrer_SynonymMemberWithdrawalAsOne(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "synonymMemberWithdrawalAsOne");
    }
    public abstract String keepMemberId_NotExistsReferrer_SynonymMemberWithdrawalAsOne(SynonymMemberWithdrawalCQ sq);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select MEMBER_ID from SYNONYM_MEMBER_LOGIN where ...)} <br />
     * (会員ログイン)SYNONYM_MEMBER_LOGIN by MEMBER_ID, named 'synonymMemberLoginAsOne'.
     * @param subQuery The sub-query of SynonymMemberLoginList for 'in-scope'. (NotNull)
     */
    public void inScopeSynonymMemberLoginList(SubQuery<SynonymMemberLoginCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        SynonymMemberLoginCB cb = new SynonymMemberLoginCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepMemberId_InScopeRelation_SynonymMemberLoginList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "synonymMemberLoginList");
    }
    public abstract String keepMemberId_InScopeRelation_SynonymMemberLoginList(SynonymMemberLoginCQ sq);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select MEMBER_ID from SYNONYM_MEMBER_WITHDRAWAL where ...)} <br />
     * SYNONYM_MEMBER_WITHDRAWAL by MEMBER_ID, named 'synonymMemberWithdrawalAsOne'.
     * @param subQuery The sub-query of SynonymMemberWithdrawalAsOne for 'in-scope'. (NotNull)
     */
    public void inScopeSynonymMemberWithdrawalAsOne(SubQuery<SynonymMemberWithdrawalCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        SynonymMemberWithdrawalCB cb = new SynonymMemberWithdrawalCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepMemberId_InScopeRelation_SynonymMemberWithdrawalAsOne(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "synonymMemberWithdrawalAsOne");
    }
    public abstract String keepMemberId_InScopeRelation_SynonymMemberWithdrawalAsOne(SynonymMemberWithdrawalCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select MEMBER_ID from SYNONYM_MEMBER_LOGIN where ...)} <br />
     * (会員ログイン)SYNONYM_MEMBER_LOGIN by MEMBER_ID, named 'synonymMemberLoginAsOne'.
     * @param subQuery The sub-query of SynonymMemberLoginList for 'not in-scope'. (NotNull)
     */
    public void notInScopeSynonymMemberLoginList(SubQuery<SynonymMemberLoginCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        SynonymMemberLoginCB cb = new SynonymMemberLoginCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepMemberId_NotInScopeRelation_SynonymMemberLoginList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "synonymMemberLoginList");
    }
    public abstract String keepMemberId_NotInScopeRelation_SynonymMemberLoginList(SynonymMemberLoginCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select MEMBER_ID from SYNONYM_MEMBER_WITHDRAWAL where ...)} <br />
     * SYNONYM_MEMBER_WITHDRAWAL by MEMBER_ID, named 'synonymMemberWithdrawalAsOne'.
     * @param subQuery The sub-query of SynonymMemberWithdrawalAsOne for 'not in-scope'. (NotNull)
     */
    public void notInScopeSynonymMemberWithdrawalAsOne(SubQuery<SynonymMemberWithdrawalCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        SynonymMemberWithdrawalCB cb = new SynonymMemberWithdrawalCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepMemberId_NotInScopeRelation_SynonymMemberWithdrawalAsOne(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "synonymMemberWithdrawalAsOne");
    }
    public abstract String keepMemberId_NotInScopeRelation_SynonymMemberWithdrawalAsOne(SynonymMemberWithdrawalCQ sq);

    public void xsderiveSynonymMemberLoginList(String fn, SubQuery<SynonymMemberLoginCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        SynonymMemberLoginCB cb = new SynonymMemberLoginCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String pp = keepMemberId_SpecifyDerivedReferrer_SynonymMemberLoginList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(fn, cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "synonymMemberLoginList", al, op);
    }
    public abstract String keepMemberId_SpecifyDerivedReferrer_SynonymMemberLoginList(SynonymMemberLoginCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from SYNONYM_MEMBER_LOGIN where ...)} <br />
     * (会員ログイン)SYNONYM_MEMBER_LOGIN by MEMBER_ID, named 'synonymMemberLoginAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">derivedSynonymMemberLoginList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;SynonymMemberLoginCB&gt;() {
     *     public void query(SynonymMemberLoginCB subCB) {
     *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #FD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<SynonymMemberLoginCB> derivedSynonymMemberLoginList() {
        return xcreateQDRFunctionSynonymMemberLoginList();
    }
    protected HpQDRFunction<SynonymMemberLoginCB> xcreateQDRFunctionSynonymMemberLoginList() {
        return new HpQDRFunction<SynonymMemberLoginCB>(new HpQDRSetupper<SynonymMemberLoginCB>() {
            public void setup(String fn, SubQuery<SynonymMemberLoginCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveSynonymMemberLoginList(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveSynonymMemberLoginList(String fn, SubQuery<SynonymMemberLoginCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        SynonymMemberLoginCB cb = new SynonymMemberLoginCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String sqpp = keepMemberId_QueryDerivedReferrer_SynonymMemberLoginList(cb.query()); // for saving query-value.
        String prpp = keepMemberId_QueryDerivedReferrer_SynonymMemberLoginListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "MEMBER_ID", "MEMBER_ID", sqpp, "synonymMemberLoginList", rd, vl, prpp, op);
    }
    public abstract String keepMemberId_QueryDerivedReferrer_SynonymMemberLoginList(SynonymMemberLoginCQ sq);
    public abstract String keepMemberId_QueryDerivedReferrer_SynonymMemberLoginListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {PK, NotNull, NUMBER(16)}
     */
    public void setMemberId_IsNull() { regMemberId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {PK, NotNull, NUMBER(16)}
     */
    public void setMemberId_IsNotNull() { regMemberId(CK_ISNN, DOBJ); }

    protected void regMemberId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueMemberId(), "MEMBER_ID"); }
    protected abstract ConditionValue getCValueMemberId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (会員名称)MEMBER_NAME: {IX, NotNull, VARCHAR2(200)}
     * @param memberName The value of memberName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberName_Equal(String memberName) {
        doSetMemberName_Equal(fRES(memberName));
    }

    protected void doSetMemberName_Equal(String memberName) {
        regMemberName(CK_EQ, memberName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (会員名称)MEMBER_NAME: {IX, NotNull, VARCHAR2(200)}
     * @param memberName The value of memberName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberName_NotEqual(String memberName) {
        doSetMemberName_NotEqual(fRES(memberName));
    }

    protected void doSetMemberName_NotEqual(String memberName) {
        regMemberName(CK_NES, memberName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (会員名称)MEMBER_NAME: {IX, NotNull, VARCHAR2(200)}
     * @param memberNameList The collection of memberName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberName_InScope(Collection<String> memberNameList) {
        doSetMemberName_InScope(memberNameList);
    }

    public void doSetMemberName_InScope(Collection<String> memberNameList) {
        regINS(CK_INS, cTL(memberNameList), getCValueMemberName(), "MEMBER_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (会員名称)MEMBER_NAME: {IX, NotNull, VARCHAR2(200)}
     * @param memberNameList The collection of memberName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberName_NotInScope(Collection<String> memberNameList) {
        doSetMemberName_NotInScope(memberNameList);
    }

    public void doSetMemberName_NotInScope(Collection<String> memberNameList) {
        regINS(CK_NINS, cTL(memberNameList), getCValueMemberName(), "MEMBER_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (会員名称)MEMBER_NAME: {IX, NotNull, VARCHAR2(200)}
     * @param memberName The value of memberName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberName_PrefixSearch(String memberName) {
        setMemberName_LikeSearch(memberName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (会員名称)MEMBER_NAME: {IX, NotNull, VARCHAR2(200)} <br />
     * <pre>e.g. setMemberName_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param memberName The value of memberName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMemberName_LikeSearch(String memberName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(memberName), getCValueMemberName(), "MEMBER_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (会員名称)MEMBER_NAME: {IX, NotNull, VARCHAR2(200)}
     * @param memberName The value of memberName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMemberName_NotLikeSearch(String memberName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(memberName), getCValueMemberName(), "MEMBER_NAME", likeSearchOption);
    }

    protected void regMemberName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueMemberName(), "MEMBER_NAME"); }
    protected abstract ConditionValue getCValueMemberName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (会員アカウント)MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR2(50)}
     * @param memberAccount The value of memberAccount as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberAccount_Equal(String memberAccount) {
        doSetMemberAccount_Equal(fRES(memberAccount));
    }

    protected void doSetMemberAccount_Equal(String memberAccount) {
        regMemberAccount(CK_EQ, memberAccount);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (会員アカウント)MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR2(50)}
     * @param memberAccount The value of memberAccount as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberAccount_NotEqual(String memberAccount) {
        doSetMemberAccount_NotEqual(fRES(memberAccount));
    }

    protected void doSetMemberAccount_NotEqual(String memberAccount) {
        regMemberAccount(CK_NES, memberAccount);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (会員アカウント)MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR2(50)}
     * @param memberAccountList The collection of memberAccount as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberAccount_InScope(Collection<String> memberAccountList) {
        doSetMemberAccount_InScope(memberAccountList);
    }

    public void doSetMemberAccount_InScope(Collection<String> memberAccountList) {
        regINS(CK_INS, cTL(memberAccountList), getCValueMemberAccount(), "MEMBER_ACCOUNT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (会員アカウント)MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR2(50)}
     * @param memberAccountList The collection of memberAccount as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberAccount_NotInScope(Collection<String> memberAccountList) {
        doSetMemberAccount_NotInScope(memberAccountList);
    }

    public void doSetMemberAccount_NotInScope(Collection<String> memberAccountList) {
        regINS(CK_NINS, cTL(memberAccountList), getCValueMemberAccount(), "MEMBER_ACCOUNT");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (会員アカウント)MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR2(50)}
     * @param memberAccount The value of memberAccount as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberAccount_PrefixSearch(String memberAccount) {
        setMemberAccount_LikeSearch(memberAccount, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (会員アカウント)MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR2(50)} <br />
     * <pre>e.g. setMemberAccount_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param memberAccount The value of memberAccount as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMemberAccount_LikeSearch(String memberAccount, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(memberAccount), getCValueMemberAccount(), "MEMBER_ACCOUNT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (会員アカウント)MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR2(50)}
     * @param memberAccount The value of memberAccount as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMemberAccount_NotLikeSearch(String memberAccount, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(memberAccount), getCValueMemberAccount(), "MEMBER_ACCOUNT", likeSearchOption);
    }

    protected void regMemberAccount(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueMemberAccount(), "MEMBER_ACCOUNT"); }
    protected abstract ConditionValue getCValueMemberAccount();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (会員ステータスコード)MEMBER_STATUS_CODE: {NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus}
     * @param memberStatusCode The value of memberStatusCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberStatusCode_Equal(String memberStatusCode) {
        doSetMemberStatusCode_Equal(fRES(memberStatusCode));
    }

    /**
     * Equal(=). As MemberStatus. And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (会員ステータスコード)MEMBER_STATUS_CODE: {NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus} <br />
     * status of member from entry to withdrawal
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    public void setMemberStatusCode_Equal_AsMemberStatus(CDef.MemberStatus cdef) {
        doSetMemberStatusCode_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As Formalized (FML). And OnlyOnceRegistered. <br />
     * FORMALIZED: as formal member, allowed to use all service
     */
    public void setMemberStatusCode_Equal_Formalized() {
        setMemberStatusCode_Equal_AsMemberStatus(CDef.MemberStatus.Formalized);
    }

    /**
     * Equal(=). As Withdrawal (WDL). And OnlyOnceRegistered. <br />
     * WITHDRAWAL: withdrawal is fixed, not allowed to use service
     */
    public void setMemberStatusCode_Equal_Withdrawal() {
        setMemberStatusCode_Equal_AsMemberStatus(CDef.MemberStatus.Withdrawal);
    }

    /**
     * Equal(=). As Provisional (PRV). And OnlyOnceRegistered. <br />
     * PROVISIONAL: first status after entry, allowed to use only part of service
     */
    public void setMemberStatusCode_Equal_Provisional() {
        setMemberStatusCode_Equal_AsMemberStatus(CDef.MemberStatus.Provisional);
    }

    protected void doSetMemberStatusCode_Equal(String memberStatusCode) {
        regMemberStatusCode(CK_EQ, hSC("MEMBER_STATUS_CODE", memberStatusCode, 3, "R"));
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (会員ステータスコード)MEMBER_STATUS_CODE: {NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus}
     * @param memberStatusCode The value of memberStatusCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberStatusCode_NotEqual(String memberStatusCode) {
        doSetMemberStatusCode_NotEqual(fRES(memberStatusCode));
    }

    /**
     * NotEqual(&lt;&gt;). As MemberStatus. And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (会員ステータスコード)MEMBER_STATUS_CODE: {NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus} <br />
     * status of member from entry to withdrawal
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    public void setMemberStatusCode_NotEqual_AsMemberStatus(CDef.MemberStatus cdef) {
        doSetMemberStatusCode_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As Formalized (FML). And OnlyOnceRegistered. <br />
     * FORMALIZED: as formal member, allowed to use all service
     */
    public void setMemberStatusCode_NotEqual_Formalized() {
        setMemberStatusCode_NotEqual_AsMemberStatus(CDef.MemberStatus.Formalized);
    }

    /**
     * NotEqual(&lt;&gt;). As Withdrawal (WDL). And OnlyOnceRegistered. <br />
     * WITHDRAWAL: withdrawal is fixed, not allowed to use service
     */
    public void setMemberStatusCode_NotEqual_Withdrawal() {
        setMemberStatusCode_NotEqual_AsMemberStatus(CDef.MemberStatus.Withdrawal);
    }

    /**
     * NotEqual(&lt;&gt;). As Provisional (PRV). And OnlyOnceRegistered. <br />
     * PROVISIONAL: first status after entry, allowed to use only part of service
     */
    public void setMemberStatusCode_NotEqual_Provisional() {
        setMemberStatusCode_NotEqual_AsMemberStatus(CDef.MemberStatus.Provisional);
    }

    protected void doSetMemberStatusCode_NotEqual(String memberStatusCode) {
        regMemberStatusCode(CK_NES, hSC("MEMBER_STATUS_CODE", memberStatusCode, 3, "R"));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (会員ステータスコード)MEMBER_STATUS_CODE: {NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus}
     * @param memberStatusCodeList The collection of memberStatusCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberStatusCode_InScope(Collection<String> memberStatusCodeList) {
        doSetMemberStatusCode_InScope(memberStatusCodeList);
    }

    /**
     * InScope {in ('a', 'b')}. As MemberStatus. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (会員ステータスコード)MEMBER_STATUS_CODE: {NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus} <br />
     * status of member from entry to withdrawal
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberStatusCode_InScope_AsMemberStatus(Collection<CDef.MemberStatus> cdefList) {
        doSetMemberStatusCode_InScope(cTStrL(cdefList));
    }

    public void doSetMemberStatusCode_InScope(Collection<String> memberStatusCodeList) {
        regINS(CK_INS, cTL(memberStatusCodeList), getCValueMemberStatusCode(), "MEMBER_STATUS_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (会員ステータスコード)MEMBER_STATUS_CODE: {NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus}
     * @param memberStatusCodeList The collection of memberStatusCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberStatusCode_NotInScope(Collection<String> memberStatusCodeList) {
        doSetMemberStatusCode_NotInScope(memberStatusCodeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As MemberStatus. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (会員ステータスコード)MEMBER_STATUS_CODE: {NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus} <br />
     * status of member from entry to withdrawal
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberStatusCode_NotInScope_AsMemberStatus(Collection<CDef.MemberStatus> cdefList) {
        doSetMemberStatusCode_NotInScope(cTStrL(cdefList));
    }

    public void doSetMemberStatusCode_NotInScope(Collection<String> memberStatusCodeList) {
        regINS(CK_NINS, cTL(memberStatusCodeList), getCValueMemberStatusCode(), "MEMBER_STATUS_CODE");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select MEMBER_STATUS_CODE from MEMBER_STATUS where ...)} <br />
     * (会員ステータス)MEMBER_STATUS by my MEMBER_STATUS_CODE, named 'memberStatus'.
     * @param subQuery The sub-query of MemberStatus for 'in-scope'. (NotNull)
     */
    public void inScopeMemberStatus(SubQuery<MemberStatusCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        MemberStatusCB cb = new MemberStatusCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepMemberStatusCode_InScopeRelation_MemberStatus(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "MEMBER_STATUS_CODE", "MEMBER_STATUS_CODE", pp, "memberStatus");
    }
    public abstract String keepMemberStatusCode_InScopeRelation_MemberStatus(MemberStatusCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select MEMBER_STATUS_CODE from MEMBER_STATUS where ...)} <br />
     * (会員ステータス)MEMBER_STATUS by my MEMBER_STATUS_CODE, named 'memberStatus'.
     * @param subQuery The sub-query of MemberStatus for 'not in-scope'. (NotNull)
     */
    public void notInScopeMemberStatus(SubQuery<MemberStatusCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        MemberStatusCB cb = new MemberStatusCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepMemberStatusCode_NotInScopeRelation_MemberStatus(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "MEMBER_STATUS_CODE", "MEMBER_STATUS_CODE", pp, "memberStatus");
    }
    public abstract String keepMemberStatusCode_NotInScopeRelation_MemberStatus(MemberStatusCQ sq);

    protected void regMemberStatusCode(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueMemberStatusCode(), "MEMBER_STATUS_CODE"); }
    protected abstract ConditionValue getCValueMemberStatusCode();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (正式会員日時)FORMALIZED_DATETIME: {IX, TIMESTAMP(3)(11, 3)}
     * @param formalizedDatetime The value of formalizedDatetime as equal. (NullAllowed: if null, no condition)
     */
    public void setFormalizedDatetime_Equal(java.sql.Timestamp formalizedDatetime) {
        regFormalizedDatetime(CK_EQ,  formalizedDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (正式会員日時)FORMALIZED_DATETIME: {IX, TIMESTAMP(3)(11, 3)}
     * @param formalizedDatetime The value of formalizedDatetime as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setFormalizedDatetime_GreaterThan(java.sql.Timestamp formalizedDatetime) {
        regFormalizedDatetime(CK_GT,  formalizedDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (正式会員日時)FORMALIZED_DATETIME: {IX, TIMESTAMP(3)(11, 3)}
     * @param formalizedDatetime The value of formalizedDatetime as lessThan. (NullAllowed: if null, no condition)
     */
    public void setFormalizedDatetime_LessThan(java.sql.Timestamp formalizedDatetime) {
        regFormalizedDatetime(CK_LT,  formalizedDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (正式会員日時)FORMALIZED_DATETIME: {IX, TIMESTAMP(3)(11, 3)}
     * @param formalizedDatetime The value of formalizedDatetime as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setFormalizedDatetime_GreaterEqual(java.sql.Timestamp formalizedDatetime) {
        regFormalizedDatetime(CK_GE,  formalizedDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (正式会員日時)FORMALIZED_DATETIME: {IX, TIMESTAMP(3)(11, 3)}
     * @param formalizedDatetime The value of formalizedDatetime as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setFormalizedDatetime_LessEqual(java.sql.Timestamp formalizedDatetime) {
        regFormalizedDatetime(CK_LE, formalizedDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (正式会員日時)FORMALIZED_DATETIME: {IX, TIMESTAMP(3)(11, 3)}
     * <pre>e.g. setFormalizedDatetime_FromTo(fromDate, toDate, new <span style="color: #FD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of formalizedDatetime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of formalizedDatetime. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setFormalizedDatetime_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), getCValueFormalizedDatetime(), "FORMALIZED_DATETIME", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (正式会員日時)FORMALIZED_DATETIME: {IX, TIMESTAMP(3)(11, 3)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #FD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of formalizedDatetime. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of formalizedDatetime. (NullAllowed: if null, no to-condition)
     */
    public void setFormalizedDatetime_DateFromTo(Date fromDate, Date toDate) {
        setFormalizedDatetime_FromTo(fromDate, toDate, new FromToOption().compareAsDate());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * (正式会員日時)FORMALIZED_DATETIME: {IX, TIMESTAMP(3)(11, 3)}
     */
    public void setFormalizedDatetime_IsNull() { regFormalizedDatetime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * (正式会員日時)FORMALIZED_DATETIME: {IX, TIMESTAMP(3)(11, 3)}
     */
    public void setFormalizedDatetime_IsNotNull() { regFormalizedDatetime(CK_ISNN, DOBJ); }

    protected void regFormalizedDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueFormalizedDatetime(), "FORMALIZED_DATETIME"); }
    protected abstract ConditionValue getCValueFormalizedDatetime();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (生年月日)BIRTHDATE: {DATE(7)}
     * @param birthdate The value of birthdate as equal. (NullAllowed: if null, no condition)
     */
    public void setBirthdate_Equal(java.util.Date birthdate) {
        regBirthdate(CK_EQ,  fCTPD(birthdate));
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (生年月日)BIRTHDATE: {DATE(7)}
     * @param birthdate The value of birthdate as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setBirthdate_GreaterThan(java.util.Date birthdate) {
        regBirthdate(CK_GT,  fCTPD(birthdate));
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (生年月日)BIRTHDATE: {DATE(7)}
     * @param birthdate The value of birthdate as lessThan. (NullAllowed: if null, no condition)
     */
    public void setBirthdate_LessThan(java.util.Date birthdate) {
        regBirthdate(CK_LT,  fCTPD(birthdate));
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (生年月日)BIRTHDATE: {DATE(7)}
     * @param birthdate The value of birthdate as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setBirthdate_GreaterEqual(java.util.Date birthdate) {
        regBirthdate(CK_GE,  fCTPD(birthdate));
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (生年月日)BIRTHDATE: {DATE(7)}
     * @param birthdate The value of birthdate as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setBirthdate_LessEqual(java.util.Date birthdate) {
        regBirthdate(CK_LE, fCTPD(birthdate));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (生年月日)BIRTHDATE: {DATE(7)}
     * <pre>e.g. setBirthdate_FromTo(fromDate, toDate, new <span style="color: #FD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of birthdate. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of birthdate. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setBirthdate_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ(fCTPD(fromDatetime), fCTPD(toDatetime), getCValueBirthdate(), "BIRTHDATE", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (生年月日)BIRTHDATE: {DATE(7)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #FD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of birthdate. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of birthdate. (NullAllowed: if null, no to-condition)
     */
    public void setBirthdate_DateFromTo(Date fromDate, Date toDate) {
        setBirthdate_FromTo(fromDate, toDate, new FromToOption().compareAsDate());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * (生年月日)BIRTHDATE: {DATE(7)}
     */
    public void setBirthdate_IsNull() { regBirthdate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * (生年月日)BIRTHDATE: {DATE(7)}
     */
    public void setBirthdate_IsNotNull() { regBirthdate(CK_ISNN, DOBJ); }

    protected void regBirthdate(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueBirthdate(), "BIRTHDATE"); }
    protected abstract ConditionValue getCValueBirthdate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (登録日時)REGISTER_DATETIME: {NotNull, DATE(7)}
     * @param registerDatetime The value of registerDatetime as equal. (NullAllowed: if null, no condition)
     */
    public void setRegisterDatetime_Equal(java.util.Date registerDatetime) {
        regRegisterDatetime(CK_EQ,  fCTPD(registerDatetime));
    }

    protected void regRegisterDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueRegisterDatetime(), "REGISTER_DATETIME"); }
    protected abstract ConditionValue getCValueRegisterDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (登録ユーザ)REGISTER_USER: {NotNull, VARCHAR2(200)}
     * @param registerUser The value of registerUser as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterUser_Equal(String registerUser) {
        doSetRegisterUser_Equal(fRES(registerUser));
    }

    protected void doSetRegisterUser_Equal(String registerUser) {
        regRegisterUser(CK_EQ, registerUser);
    }

    protected void regRegisterUser(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueRegisterUser(), "REGISTER_USER"); }
    protected abstract ConditionValue getCValueRegisterUser();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (登録プロセス)REGISTER_PROCESS: {NotNull, VARCHAR2(200)}
     * @param registerProcess The value of registerProcess as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterProcess_Equal(String registerProcess) {
        doSetRegisterProcess_Equal(fRES(registerProcess));
    }

    protected void doSetRegisterProcess_Equal(String registerProcess) {
        regRegisterProcess(CK_EQ, registerProcess);
    }

    protected void regRegisterProcess(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueRegisterProcess(), "REGISTER_PROCESS"); }
    protected abstract ConditionValue getCValueRegisterProcess();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (更新日時)UPDATE_DATETIME: {NotNull, DATE(7)}
     * @param updateDatetime The value of updateDatetime as equal. (NullAllowed: if null, no condition)
     */
    public void setUpdateDatetime_Equal(java.util.Date updateDatetime) {
        regUpdateDatetime(CK_EQ,  fCTPD(updateDatetime));
    }

    protected void regUpdateDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueUpdateDatetime(), "UPDATE_DATETIME"); }
    protected abstract ConditionValue getCValueUpdateDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR2(200)}
     * @param updateUser The value of updateUser as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateUser_Equal(String updateUser) {
        doSetUpdateUser_Equal(fRES(updateUser));
    }

    protected void doSetUpdateUser_Equal(String updateUser) {
        regUpdateUser(CK_EQ, updateUser);
    }

    protected void regUpdateUser(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueUpdateUser(), "UPDATE_USER"); }
    protected abstract ConditionValue getCValueUpdateUser();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (更新プロセス)UPDATE_PROCESS: {NotNull, VARCHAR2(200)}
     * @param updateProcess The value of updateProcess as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateProcess_Equal(String updateProcess) {
        doSetUpdateProcess_Equal(fRES(updateProcess));
    }

    protected void doSetUpdateProcess_Equal(String updateProcess) {
        regUpdateProcess(CK_EQ, updateProcess);
    }

    protected void regUpdateProcess(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueUpdateProcess(), "UPDATE_PROCESS"); }
    protected abstract ConditionValue getCValueUpdateProcess();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (バージョンNO)VERSION_NO: {NotNull, NUMBER(16)}
     * @param versionNo The value of versionNo as equal. (NullAllowed: if null, no condition)
     */
    public void setVersionNo_Equal(Long versionNo) {
        doSetVersionNo_Equal(versionNo);
    }

    protected void doSetVersionNo_Equal(Long versionNo) {
        regVersionNo(CK_EQ, versionNo);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (バージョンNO)VERSION_NO: {NotNull, NUMBER(16)}
     * @param minNumber The min number of versionNo. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of versionNo. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setVersionNo_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueVersionNo(), "VERSION_NO", rangeOfOption);
    }

    protected void regVersionNo(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueVersionNo(), "VERSION_NO"); }
    protected abstract ConditionValue getCValueVersionNo();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;VendorSynonymMemberCB&gt;() {
     *     public void query(VendorSynonymMemberCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorSynonymMemberCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;VendorSynonymMemberCB&gt;() {
     *     public void query(VendorSynonymMemberCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorSynonymMemberCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;VendorSynonymMemberCB&gt;() {
     *     public void query(VendorSynonymMemberCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorSynonymMemberCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;VendorSynonymMemberCB&gt;() {
     *     public void query(VendorSynonymMemberCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorSynonymMemberCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;VendorSynonymMemberCB&gt;() {
     *     public void query(VendorSynonymMemberCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorSynonymMemberCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;VendorSynonymMemberCB&gt;() {
     *     public void query(VendorSynonymMemberCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorSynonymMemberCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<VendorSynonymMemberCB> xcreateSSQFunction(final String rd) {
        return new HpSSQFunction<VendorSynonymMemberCB>(new HpSSQSetupper<VendorSynonymMemberCB>() {
            public void setup(String fn, SubQuery<VendorSynonymMemberCB> sq, HpSSQOption<VendorSynonymMemberCB> op) {
                xscalarCondition(fn, sq, rd, op);
            }
        });
    }

    protected void xscalarCondition(String fn, SubQuery<VendorSynonymMemberCB> sq, String rd, HpSSQOption<VendorSynonymMemberCB> op) {
        assertObjectNotNull("subQuery", sq);
        VendorSynonymMemberCB cb = xcreateScalarConditionCB(); sq.query(cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(VendorSynonymMemberCQ sq);

    protected VendorSynonymMemberCB xcreateScalarConditionCB() {
        VendorSynonymMemberCB cb = new VendorSynonymMemberCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected VendorSynonymMemberCB xcreateScalarConditionPartitionByCB() {
        VendorSynonymMemberCB cb = new VendorSynonymMemberCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<VendorSynonymMemberCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorSynonymMemberCB cb = new VendorSynonymMemberCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String pk = "MEMBER_ID";
        String pp = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(VendorSynonymMemberCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<VendorSynonymMemberCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<VendorSynonymMemberCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<VendorSynonymMemberCB>(new HpQDRSetupper<VendorSynonymMemberCB>() {
            public void setup(String fn, SubQuery<VendorSynonymMemberCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveMyselfDerived(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveMyselfDerived(String fn, SubQuery<VendorSynonymMemberCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorSynonymMemberCB cb = new VendorSynonymMemberCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String pk = "MEMBER_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(VendorSynonymMemberCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<VendorSynonymMemberCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        VendorSynonymMemberCB cb = new VendorSynonymMemberCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String pp = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(VendorSynonymMemberCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<VendorSynonymMemberCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        VendorSynonymMemberCB cb = new VendorSynonymMemberCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String pp = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(VendorSynonymMemberCQ sq);

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
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCB() { return VendorSynonymMemberCB.class.getName(); }
    protected String xabCQ() { return VendorSynonymMemberCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
