package com.example.dbflute.db2.dbflute.cbean.cq.bs;

import java.util.*;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.dbmeta.DBMetaProvider;
import com.example.dbflute.db2.dbflute.allcommon.*;
import com.example.dbflute.db2.dbflute.cbean.*;
import com.example.dbflute.db2.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of ALIAS_MEMBER.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsAliasMemberCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsAliasMemberCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "ALIAS_MEMBER";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {PK, NotNull, INTEGER(10)}
     * @param memberId The value of memberId as equal. (NullAllowed: if null, no condition)
     */
    public void setMemberId_Equal(Integer memberId) {
        doSetMemberId_Equal(memberId);
    }

    protected void doSetMemberId_Equal(Integer memberId) {
        regMemberId(CK_EQ, memberId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {PK, NotNull, INTEGER(10)}
     * @param memberId The value of memberId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setMemberId_NotEqual(Integer memberId) {
        doSetMemberId_NotEqual(memberId);
    }

    protected void doSetMemberId_NotEqual(Integer memberId) {
        regMemberId(CK_NES, memberId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {PK, NotNull, INTEGER(10)}
     * @param memberId The value of memberId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setMemberId_GreaterThan(Integer memberId) {
        regMemberId(CK_GT, memberId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {PK, NotNull, INTEGER(10)}
     * @param memberId The value of memberId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setMemberId_LessThan(Integer memberId) {
        regMemberId(CK_LT, memberId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {PK, NotNull, INTEGER(10)}
     * @param memberId The value of memberId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setMemberId_GreaterEqual(Integer memberId) {
        regMemberId(CK_GE, memberId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {PK, NotNull, INTEGER(10)}
     * @param memberId The value of memberId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setMemberId_LessEqual(Integer memberId) {
        regMemberId(CK_LE, memberId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {PK, NotNull, INTEGER(10)}
     * @param minNumber The min number of memberId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of memberId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMemberId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueMemberId(), "MEMBER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (会員ID)MEMBER_ID: {PK, NotNull, INTEGER(10)}
     * @param memberIdList The collection of memberId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberId_InScope(Collection<Integer> memberIdList) {
        doSetMemberId_InScope(memberIdList);
    }

    protected void doSetMemberId_InScope(Collection<Integer> memberIdList) {
        regINS(CK_INS, cTL(memberIdList), getCValueMemberId(), "MEMBER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (会員ID)MEMBER_ID: {PK, NotNull, INTEGER(10)}
     * @param memberIdList The collection of memberId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberId_NotInScope(Collection<Integer> memberIdList) {
        doSetMemberId_NotInScope(memberIdList);
    }

    protected void doSetMemberId_NotInScope(Collection<Integer> memberIdList) {
        regINS(CK_NINS, cTL(memberIdList), getCValueMemberId(), "MEMBER_ID");
    }

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select MEMBER_ID from ALIAS_MEMBER_LOGIN where ...)} <br />
     * ALIAS_MEMBER_LOGIN by MEMBER_ID, named 'aliasMemberLoginAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsAliasMemberLoginList</span>(new SubQuery&lt;AliasMemberLoginCB&gt;() {
     *     public void query(AliasMemberLoginCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of AliasMemberLoginList for 'exists'. (NotNull)
     */
    public void existsAliasMemberLoginList(SubQuery<AliasMemberLoginCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        AliasMemberLoginCB cb = new AliasMemberLoginCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String pp = keepMemberId_ExistsReferrer_AliasMemberLoginList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "aliasMemberLoginList");
    }
    public abstract String keepMemberId_ExistsReferrer_AliasMemberLoginList(AliasMemberLoginCQ sq);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select MEMBER_ID from ALIAS_MEMBER_LOGIN where ...)} <br />
     * ALIAS_MEMBER_LOGIN by MEMBER_ID, named 'aliasMemberLoginAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsAliasMemberLoginList</span>(new SubQuery&lt;AliasMemberLoginCB&gt;() {
     *     public void query(AliasMemberLoginCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of MemberId_NotExistsReferrer_AliasMemberLoginList for 'not exists'. (NotNull)
     */
    public void notExistsAliasMemberLoginList(SubQuery<AliasMemberLoginCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        AliasMemberLoginCB cb = new AliasMemberLoginCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String pp = keepMemberId_NotExistsReferrer_AliasMemberLoginList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "aliasMemberLoginList");
    }
    public abstract String keepMemberId_NotExistsReferrer_AliasMemberLoginList(AliasMemberLoginCQ sq);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select MEMBER_ID from ALIAS_MEMBER_LOGIN where ...)} <br />
     * ALIAS_MEMBER_LOGIN by MEMBER_ID, named 'aliasMemberLoginAsOne'.
     * @param subQuery The sub-query of AliasMemberLoginList for 'in-scope'. (NotNull)
     */
    public void inScopeAliasMemberLoginList(SubQuery<AliasMemberLoginCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        AliasMemberLoginCB cb = new AliasMemberLoginCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepMemberId_InScopeRelation_AliasMemberLoginList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "aliasMemberLoginList");
    }
    public abstract String keepMemberId_InScopeRelation_AliasMemberLoginList(AliasMemberLoginCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select MEMBER_ID from ALIAS_MEMBER_LOGIN where ...)} <br />
     * ALIAS_MEMBER_LOGIN by MEMBER_ID, named 'aliasMemberLoginAsOne'.
     * @param subQuery The sub-query of AliasMemberLoginList for 'not in-scope'. (NotNull)
     */
    public void notInScopeAliasMemberLoginList(SubQuery<AliasMemberLoginCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        AliasMemberLoginCB cb = new AliasMemberLoginCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepMemberId_NotInScopeRelation_AliasMemberLoginList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "aliasMemberLoginList");
    }
    public abstract String keepMemberId_NotInScopeRelation_AliasMemberLoginList(AliasMemberLoginCQ sq);

    public void xsderiveAliasMemberLoginList(String fn, SubQuery<AliasMemberLoginCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        AliasMemberLoginCB cb = new AliasMemberLoginCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String pp = keepMemberId_SpecifyDerivedReferrer_AliasMemberLoginList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(fn, cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "aliasMemberLoginList", al, op);
    }
    public abstract String keepMemberId_SpecifyDerivedReferrer_AliasMemberLoginList(AliasMemberLoginCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from ALIAS_MEMBER_LOGIN where ...)} <br />
     * ALIAS_MEMBER_LOGIN by MEMBER_ID, named 'aliasMemberLoginAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">derivedAliasMemberLoginList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;AliasMemberLoginCB&gt;() {
     *     public void query(AliasMemberLoginCB subCB) {
     *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #FD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<AliasMemberLoginCB> derivedAliasMemberLoginList() {
        return xcreateQDRFunctionAliasMemberLoginList();
    }
    protected HpQDRFunction<AliasMemberLoginCB> xcreateQDRFunctionAliasMemberLoginList() {
        return new HpQDRFunction<AliasMemberLoginCB>(new HpQDRSetupper<AliasMemberLoginCB>() {
            public void setup(String fn, SubQuery<AliasMemberLoginCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveAliasMemberLoginList(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveAliasMemberLoginList(String fn, SubQuery<AliasMemberLoginCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        AliasMemberLoginCB cb = new AliasMemberLoginCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String sqpp = keepMemberId_QueryDerivedReferrer_AliasMemberLoginList(cb.query()); // for saving query-value.
        String prpp = keepMemberId_QueryDerivedReferrer_AliasMemberLoginListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "MEMBER_ID", "MEMBER_ID", sqpp, "aliasMemberLoginList", rd, vl, prpp, op);
    }
    public abstract String keepMemberId_QueryDerivedReferrer_AliasMemberLoginList(AliasMemberLoginCQ sq);
    public abstract String keepMemberId_QueryDerivedReferrer_AliasMemberLoginListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {PK, NotNull, INTEGER(10)}
     */
    public void setMemberId_IsNull() { regMemberId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {PK, NotNull, INTEGER(10)}
     */
    public void setMemberId_IsNotNull() { regMemberId(CK_ISNN, DOBJ); }

    protected void regMemberId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueMemberId(), "MEMBER_ID"); }
    protected abstract ConditionValue getCValueMemberId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (会員名称)MEMBER_NAME: {IX, NotNull, VARCHAR(200)}
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
     * (会員名称)MEMBER_NAME: {IX, NotNull, VARCHAR(200)}
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
     * (会員名称)MEMBER_NAME: {IX, NotNull, VARCHAR(200)}
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
     * (会員名称)MEMBER_NAME: {IX, NotNull, VARCHAR(200)}
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
     * (会員名称)MEMBER_NAME: {IX, NotNull, VARCHAR(200)}
     * @param memberName The value of memberName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberName_PrefixSearch(String memberName) {
        setMemberName_LikeSearch(memberName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (会員名称)MEMBER_NAME: {IX, NotNull, VARCHAR(200)} <br />
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
     * (会員名称)MEMBER_NAME: {IX, NotNull, VARCHAR(200)}
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
     * (会員アカウント)MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(50)}
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
     * (会員アカウント)MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(50)}
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
     * (会員アカウント)MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(50)}
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
     * (会員アカウント)MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(50)}
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
     * (会員アカウント)MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(50)}
     * @param memberAccount The value of memberAccount as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberAccount_PrefixSearch(String memberAccount) {
        setMemberAccount_LikeSearch(memberAccount, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (会員アカウント)MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(50)} <br />
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
     * (会員アカウント)MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(50)}
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
        regMemberStatusCode(CK_EQ, memberStatusCode);
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
        regMemberStatusCode(CK_NES, memberStatusCode);
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
     * (正式会員日時)FORMALIZED_DATETIME: {IX, TIMESTAMP(26, 6)}
     * @param formalizedDatetime The value of formalizedDatetime as equal. (NullAllowed: if null, no condition)
     */
    public void setFormalizedDatetime_Equal(java.sql.Timestamp formalizedDatetime) {
        regFormalizedDatetime(CK_EQ,  formalizedDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (正式会員日時)FORMALIZED_DATETIME: {IX, TIMESTAMP(26, 6)}
     * @param formalizedDatetime The value of formalizedDatetime as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setFormalizedDatetime_GreaterThan(java.sql.Timestamp formalizedDatetime) {
        regFormalizedDatetime(CK_GT,  formalizedDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (正式会員日時)FORMALIZED_DATETIME: {IX, TIMESTAMP(26, 6)}
     * @param formalizedDatetime The value of formalizedDatetime as lessThan. (NullAllowed: if null, no condition)
     */
    public void setFormalizedDatetime_LessThan(java.sql.Timestamp formalizedDatetime) {
        regFormalizedDatetime(CK_LT,  formalizedDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (正式会員日時)FORMALIZED_DATETIME: {IX, TIMESTAMP(26, 6)}
     * @param formalizedDatetime The value of formalizedDatetime as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setFormalizedDatetime_GreaterEqual(java.sql.Timestamp formalizedDatetime) {
        regFormalizedDatetime(CK_GE,  formalizedDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (正式会員日時)FORMALIZED_DATETIME: {IX, TIMESTAMP(26, 6)}
     * @param formalizedDatetime The value of formalizedDatetime as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setFormalizedDatetime_LessEqual(java.sql.Timestamp formalizedDatetime) {
        regFormalizedDatetime(CK_LE, formalizedDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (正式会員日時)FORMALIZED_DATETIME: {IX, TIMESTAMP(26, 6)}
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
     * (正式会員日時)FORMALIZED_DATETIME: {IX, TIMESTAMP(26, 6)}
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
     * (正式会員日時)FORMALIZED_DATETIME: {IX, TIMESTAMP(26, 6)}
     */
    public void setFormalizedDatetime_IsNull() { regFormalizedDatetime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * (正式会員日時)FORMALIZED_DATETIME: {IX, TIMESTAMP(26, 6)}
     */
    public void setFormalizedDatetime_IsNotNull() { regFormalizedDatetime(CK_ISNN, DOBJ); }

    protected void regFormalizedDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueFormalizedDatetime(), "FORMALIZED_DATETIME"); }
    protected abstract ConditionValue getCValueFormalizedDatetime();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (生年月日)BIRTHDATE: {DATE(10)}
     * @param birthdate The value of birthdate as equal. (NullAllowed: if null, no condition)
     */
    public void setBirthdate_Equal(java.util.Date birthdate) {
        regBirthdate(CK_EQ,  fCTPD(birthdate));
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (生年月日)BIRTHDATE: {DATE(10)}
     * @param birthdate The value of birthdate as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setBirthdate_GreaterThan(java.util.Date birthdate) {
        regBirthdate(CK_GT,  fCTPD(birthdate));
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (生年月日)BIRTHDATE: {DATE(10)}
     * @param birthdate The value of birthdate as lessThan. (NullAllowed: if null, no condition)
     */
    public void setBirthdate_LessThan(java.util.Date birthdate) {
        regBirthdate(CK_LT,  fCTPD(birthdate));
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (生年月日)BIRTHDATE: {DATE(10)}
     * @param birthdate The value of birthdate as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setBirthdate_GreaterEqual(java.util.Date birthdate) {
        regBirthdate(CK_GE,  fCTPD(birthdate));
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (生年月日)BIRTHDATE: {DATE(10)}
     * @param birthdate The value of birthdate as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setBirthdate_LessEqual(java.util.Date birthdate) {
        regBirthdate(CK_LE, fCTPD(birthdate));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (生年月日)BIRTHDATE: {DATE(10)}
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
     * (生年月日)BIRTHDATE: {DATE(10)}
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
     * (生年月日)BIRTHDATE: {DATE(10)}
     */
    public void setBirthdate_IsNull() { regBirthdate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * (生年月日)BIRTHDATE: {DATE(10)}
     */
    public void setBirthdate_IsNotNull() { regBirthdate(CK_ISNN, DOBJ); }

    protected void regBirthdate(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueBirthdate(), "BIRTHDATE"); }
    protected abstract ConditionValue getCValueBirthdate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (登録日時)REGISTER_DATETIME: {NotNull, TIMESTAMP(26, 6)}
     * @param registerDatetime The value of registerDatetime as equal. (NullAllowed: if null, no condition)
     */
    public void setRegisterDatetime_Equal(java.sql.Timestamp registerDatetime) {
        regRegisterDatetime(CK_EQ,  registerDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (登録日時)REGISTER_DATETIME: {NotNull, TIMESTAMP(26, 6)}
     * @param registerDatetime The value of registerDatetime as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setRegisterDatetime_GreaterThan(java.sql.Timestamp registerDatetime) {
        regRegisterDatetime(CK_GT,  registerDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (登録日時)REGISTER_DATETIME: {NotNull, TIMESTAMP(26, 6)}
     * @param registerDatetime The value of registerDatetime as lessThan. (NullAllowed: if null, no condition)
     */
    public void setRegisterDatetime_LessThan(java.sql.Timestamp registerDatetime) {
        regRegisterDatetime(CK_LT,  registerDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (登録日時)REGISTER_DATETIME: {NotNull, TIMESTAMP(26, 6)}
     * @param registerDatetime The value of registerDatetime as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setRegisterDatetime_GreaterEqual(java.sql.Timestamp registerDatetime) {
        regRegisterDatetime(CK_GE,  registerDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (登録日時)REGISTER_DATETIME: {NotNull, TIMESTAMP(26, 6)}
     * @param registerDatetime The value of registerDatetime as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setRegisterDatetime_LessEqual(java.sql.Timestamp registerDatetime) {
        regRegisterDatetime(CK_LE, registerDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (登録日時)REGISTER_DATETIME: {NotNull, TIMESTAMP(26, 6)}
     * <pre>e.g. setRegisterDatetime_FromTo(fromDate, toDate, new <span style="color: #FD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setRegisterDatetime_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), getCValueRegisterDatetime(), "REGISTER_DATETIME", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (登録日時)REGISTER_DATETIME: {NotNull, TIMESTAMP(26, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #FD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of registerDatetime. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of registerDatetime. (NullAllowed: if null, no to-condition)
     */
    public void setRegisterDatetime_DateFromTo(Date fromDate, Date toDate) {
        setRegisterDatetime_FromTo(fromDate, toDate, new FromToOption().compareAsDate());
    }

    protected void regRegisterDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueRegisterDatetime(), "REGISTER_DATETIME"); }
    protected abstract ConditionValue getCValueRegisterDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (登録ユーザ)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @param registerUser The value of registerUser as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterUser_Equal(String registerUser) {
        doSetRegisterUser_Equal(fRES(registerUser));
    }

    protected void doSetRegisterUser_Equal(String registerUser) {
        regRegisterUser(CK_EQ, registerUser);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (登録ユーザ)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @param registerUser The value of registerUser as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterUser_NotEqual(String registerUser) {
        doSetRegisterUser_NotEqual(fRES(registerUser));
    }

    protected void doSetRegisterUser_NotEqual(String registerUser) {
        regRegisterUser(CK_NES, registerUser);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (登録ユーザ)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @param registerUserList The collection of registerUser as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterUser_InScope(Collection<String> registerUserList) {
        doSetRegisterUser_InScope(registerUserList);
    }

    public void doSetRegisterUser_InScope(Collection<String> registerUserList) {
        regINS(CK_INS, cTL(registerUserList), getCValueRegisterUser(), "REGISTER_USER");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (登録ユーザ)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @param registerUserList The collection of registerUser as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterUser_NotInScope(Collection<String> registerUserList) {
        doSetRegisterUser_NotInScope(registerUserList);
    }

    public void doSetRegisterUser_NotInScope(Collection<String> registerUserList) {
        regINS(CK_NINS, cTL(registerUserList), getCValueRegisterUser(), "REGISTER_USER");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (登録ユーザ)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @param registerUser The value of registerUser as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterUser_PrefixSearch(String registerUser) {
        setRegisterUser_LikeSearch(registerUser, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (登録ユーザ)REGISTER_USER: {NotNull, VARCHAR(200)} <br />
     * <pre>e.g. setRegisterUser_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param registerUser The value of registerUser as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRegisterUser_LikeSearch(String registerUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(registerUser), getCValueRegisterUser(), "REGISTER_USER", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (登録ユーザ)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @param registerUser The value of registerUser as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRegisterUser_NotLikeSearch(String registerUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(registerUser), getCValueRegisterUser(), "REGISTER_USER", likeSearchOption);
    }

    protected void regRegisterUser(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueRegisterUser(), "REGISTER_USER"); }
    protected abstract ConditionValue getCValueRegisterUser();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (更新日時)UPDATE_DATETIME: {NotNull, TIMESTAMP(26, 6)}
     * @param updateDatetime The value of updateDatetime as equal. (NullAllowed: if null, no condition)
     */
    public void setUpdateDatetime_Equal(java.sql.Timestamp updateDatetime) {
        regUpdateDatetime(CK_EQ,  updateDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (更新日時)UPDATE_DATETIME: {NotNull, TIMESTAMP(26, 6)}
     * @param updateDatetime The value of updateDatetime as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setUpdateDatetime_GreaterThan(java.sql.Timestamp updateDatetime) {
        regUpdateDatetime(CK_GT,  updateDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (更新日時)UPDATE_DATETIME: {NotNull, TIMESTAMP(26, 6)}
     * @param updateDatetime The value of updateDatetime as lessThan. (NullAllowed: if null, no condition)
     */
    public void setUpdateDatetime_LessThan(java.sql.Timestamp updateDatetime) {
        regUpdateDatetime(CK_LT,  updateDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (更新日時)UPDATE_DATETIME: {NotNull, TIMESTAMP(26, 6)}
     * @param updateDatetime The value of updateDatetime as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setUpdateDatetime_GreaterEqual(java.sql.Timestamp updateDatetime) {
        regUpdateDatetime(CK_GE,  updateDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (更新日時)UPDATE_DATETIME: {NotNull, TIMESTAMP(26, 6)}
     * @param updateDatetime The value of updateDatetime as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setUpdateDatetime_LessEqual(java.sql.Timestamp updateDatetime) {
        regUpdateDatetime(CK_LE, updateDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (更新日時)UPDATE_DATETIME: {NotNull, TIMESTAMP(26, 6)}
     * <pre>e.g. setUpdateDatetime_FromTo(fromDate, toDate, new <span style="color: #FD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setUpdateDatetime_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), getCValueUpdateDatetime(), "UPDATE_DATETIME", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (更新日時)UPDATE_DATETIME: {NotNull, TIMESTAMP(26, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #FD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of updateDatetime. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of updateDatetime. (NullAllowed: if null, no to-condition)
     */
    public void setUpdateDatetime_DateFromTo(Date fromDate, Date toDate) {
        setUpdateDatetime_FromTo(fromDate, toDate, new FromToOption().compareAsDate());
    }

    protected void regUpdateDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueUpdateDatetime(), "UPDATE_DATETIME"); }
    protected abstract ConditionValue getCValueUpdateDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @param updateUser The value of updateUser as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateUser_Equal(String updateUser) {
        doSetUpdateUser_Equal(fRES(updateUser));
    }

    protected void doSetUpdateUser_Equal(String updateUser) {
        regUpdateUser(CK_EQ, updateUser);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @param updateUser The value of updateUser as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateUser_NotEqual(String updateUser) {
        doSetUpdateUser_NotEqual(fRES(updateUser));
    }

    protected void doSetUpdateUser_NotEqual(String updateUser) {
        regUpdateUser(CK_NES, updateUser);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @param updateUserList The collection of updateUser as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateUser_InScope(Collection<String> updateUserList) {
        doSetUpdateUser_InScope(updateUserList);
    }

    public void doSetUpdateUser_InScope(Collection<String> updateUserList) {
        regINS(CK_INS, cTL(updateUserList), getCValueUpdateUser(), "UPDATE_USER");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @param updateUserList The collection of updateUser as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateUser_NotInScope(Collection<String> updateUserList) {
        doSetUpdateUser_NotInScope(updateUserList);
    }

    public void doSetUpdateUser_NotInScope(Collection<String> updateUserList) {
        regINS(CK_NINS, cTL(updateUserList), getCValueUpdateUser(), "UPDATE_USER");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @param updateUser The value of updateUser as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateUser_PrefixSearch(String updateUser) {
        setUpdateUser_LikeSearch(updateUser, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR(200)} <br />
     * <pre>e.g. setUpdateUser_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param updateUser The value of updateUser as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUpdateUser_LikeSearch(String updateUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(updateUser), getCValueUpdateUser(), "UPDATE_USER", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @param updateUser The value of updateUser as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUpdateUser_NotLikeSearch(String updateUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(updateUser), getCValueUpdateUser(), "UPDATE_USER", likeSearchOption);
    }

    protected void regUpdateUser(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueUpdateUser(), "UPDATE_USER"); }
    protected abstract ConditionValue getCValueUpdateUser();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (バージョンNO)VERSION_NO: {NotNull, BIGINT(19)}
     * @param versionNo The value of versionNo as equal. (NullAllowed: if null, no condition)
     */
    public void setVersionNo_Equal(Long versionNo) {
        doSetVersionNo_Equal(versionNo);
    }

    protected void doSetVersionNo_Equal(Long versionNo) {
        regVersionNo(CK_EQ, versionNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (バージョンNO)VERSION_NO: {NotNull, BIGINT(19)}
     * @param versionNo The value of versionNo as notEqual. (NullAllowed: if null, no condition)
     */
    public void setVersionNo_NotEqual(Long versionNo) {
        doSetVersionNo_NotEqual(versionNo);
    }

    protected void doSetVersionNo_NotEqual(Long versionNo) {
        regVersionNo(CK_NES, versionNo);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (バージョンNO)VERSION_NO: {NotNull, BIGINT(19)}
     * @param versionNo The value of versionNo as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setVersionNo_GreaterThan(Long versionNo) {
        regVersionNo(CK_GT, versionNo);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (バージョンNO)VERSION_NO: {NotNull, BIGINT(19)}
     * @param versionNo The value of versionNo as lessThan. (NullAllowed: if null, no condition)
     */
    public void setVersionNo_LessThan(Long versionNo) {
        regVersionNo(CK_LT, versionNo);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (バージョンNO)VERSION_NO: {NotNull, BIGINT(19)}
     * @param versionNo The value of versionNo as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setVersionNo_GreaterEqual(Long versionNo) {
        regVersionNo(CK_GE, versionNo);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (バージョンNO)VERSION_NO: {NotNull, BIGINT(19)}
     * @param versionNo The value of versionNo as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setVersionNo_LessEqual(Long versionNo) {
        regVersionNo(CK_LE, versionNo);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (バージョンNO)VERSION_NO: {NotNull, BIGINT(19)}
     * @param minNumber The min number of versionNo. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of versionNo. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setVersionNo_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueVersionNo(), "VERSION_NO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (バージョンNO)VERSION_NO: {NotNull, BIGINT(19)}
     * @param versionNoList The collection of versionNo as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setVersionNo_InScope(Collection<Long> versionNoList) {
        doSetVersionNo_InScope(versionNoList);
    }

    protected void doSetVersionNo_InScope(Collection<Long> versionNoList) {
        regINS(CK_INS, cTL(versionNoList), getCValueVersionNo(), "VERSION_NO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (バージョンNO)VERSION_NO: {NotNull, BIGINT(19)}
     * @param versionNoList The collection of versionNo as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setVersionNo_NotInScope(Collection<Long> versionNoList) {
        doSetVersionNo_NotInScope(versionNoList);
    }

    protected void doSetVersionNo_NotInScope(Collection<Long> versionNoList) {
        regINS(CK_NINS, cTL(versionNoList), getCValueVersionNo(), "VERSION_NO");
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
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;AliasMemberCB&gt;() {
     *     public void query(AliasMemberCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<AliasMemberCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand(), AliasMemberCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;AliasMemberCB&gt;() {
     *     public void query(AliasMemberCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<AliasMemberCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand(), AliasMemberCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;AliasMemberCB&gt;() {
     *     public void query(AliasMemberCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<AliasMemberCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand(), AliasMemberCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;AliasMemberCB&gt;() {
     *     public void query(AliasMemberCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<AliasMemberCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand(), AliasMemberCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;AliasMemberCB&gt;() {
     *     public void query(AliasMemberCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<AliasMemberCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand(), AliasMemberCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;AliasMemberCB&gt;() {
     *     public void query(AliasMemberCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<AliasMemberCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand(), AliasMemberCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        AliasMemberCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(AliasMemberCQ sq);

    protected AliasMemberCB xcreateScalarConditionCB() {
        AliasMemberCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected AliasMemberCB xcreateScalarConditionPartitionByCB() {
        AliasMemberCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<AliasMemberCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        AliasMemberCB cb = new AliasMemberCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String pk = "MEMBER_ID";
        String pp = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(AliasMemberCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<AliasMemberCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(AliasMemberCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        AliasMemberCB cb = new AliasMemberCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "MEMBER_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(AliasMemberCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<AliasMemberCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        AliasMemberCB cb = new AliasMemberCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String pp = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(AliasMemberCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<AliasMemberCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        AliasMemberCB cb = new AliasMemberCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String pp = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(AliasMemberCQ sq);

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected AliasMemberCB newMyCB() {
        return new AliasMemberCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return AliasMemberCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
