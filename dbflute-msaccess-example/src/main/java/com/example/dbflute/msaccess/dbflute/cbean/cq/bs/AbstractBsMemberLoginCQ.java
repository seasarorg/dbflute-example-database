package com.example.dbflute.msaccess.dbflute.cbean.cq.bs;

import java.util.*;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.dbmeta.DBMetaProvider;
import com.example.dbflute.msaccess.dbflute.allcommon.*;
import com.example.dbflute.msaccess.dbflute.cbean.*;
import com.example.dbflute.msaccess.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of MEMBER_LOGIN.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMemberLoginCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMemberLoginCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "MEMBER_LOGIN";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_LOGIN_ID: {PK, ID, NotNull, COUNTER(10)}
     * @param memberLoginId The value of memberLoginId as equal. (NullAllowed: if null, no condition)
     */
    public void setMemberLoginId_Equal(Integer memberLoginId) {
        doSetMemberLoginId_Equal(memberLoginId);
    }

    protected void doSetMemberLoginId_Equal(Integer memberLoginId) {
        regMemberLoginId(CK_EQ, memberLoginId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_LOGIN_ID: {PK, ID, NotNull, COUNTER(10)}
     * @param memberLoginId The value of memberLoginId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setMemberLoginId_NotEqual(Integer memberLoginId) {
        doSetMemberLoginId_NotEqual(memberLoginId);
    }

    protected void doSetMemberLoginId_NotEqual(Integer memberLoginId) {
        regMemberLoginId(CK_NES, memberLoginId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_LOGIN_ID: {PK, ID, NotNull, COUNTER(10)}
     * @param memberLoginId The value of memberLoginId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setMemberLoginId_GreaterThan(Integer memberLoginId) {
        regMemberLoginId(CK_GT, memberLoginId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_LOGIN_ID: {PK, ID, NotNull, COUNTER(10)}
     * @param memberLoginId The value of memberLoginId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setMemberLoginId_LessThan(Integer memberLoginId) {
        regMemberLoginId(CK_LT, memberLoginId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_LOGIN_ID: {PK, ID, NotNull, COUNTER(10)}
     * @param memberLoginId The value of memberLoginId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setMemberLoginId_GreaterEqual(Integer memberLoginId) {
        regMemberLoginId(CK_GE, memberLoginId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_LOGIN_ID: {PK, ID, NotNull, COUNTER(10)}
     * @param memberLoginId The value of memberLoginId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setMemberLoginId_LessEqual(Integer memberLoginId) {
        regMemberLoginId(CK_LE, memberLoginId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_LOGIN_ID: {PK, ID, NotNull, COUNTER(10)}
     * @param minNumber The min number of memberLoginId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of memberLoginId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMemberLoginId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueMemberLoginId(), "MEMBER_LOGIN_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * MEMBER_LOGIN_ID: {PK, ID, NotNull, COUNTER(10)}
     * @param memberLoginIdList The collection of memberLoginId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberLoginId_InScope(Collection<Integer> memberLoginIdList) {
        doSetMemberLoginId_InScope(memberLoginIdList);
    }

    protected void doSetMemberLoginId_InScope(Collection<Integer> memberLoginIdList) {
        regINS(CK_INS, cTL(memberLoginIdList), getCValueMemberLoginId(), "MEMBER_LOGIN_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * MEMBER_LOGIN_ID: {PK, ID, NotNull, COUNTER(10)}
     * @param memberLoginIdList The collection of memberLoginId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberLoginId_NotInScope(Collection<Integer> memberLoginIdList) {
        doSetMemberLoginId_NotInScope(memberLoginIdList);
    }

    protected void doSetMemberLoginId_NotInScope(Collection<Integer> memberLoginIdList) {
        regINS(CK_NINS, cTL(memberLoginIdList), getCValueMemberLoginId(), "MEMBER_LOGIN_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * MEMBER_LOGIN_ID: {PK, ID, NotNull, COUNTER(10)}
     */
    public void setMemberLoginId_IsNull() { regMemberLoginId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * MEMBER_LOGIN_ID: {PK, ID, NotNull, COUNTER(10)}
     */
    public void setMemberLoginId_IsNotNull() { regMemberLoginId(CK_ISNN, DOBJ); }

    protected void regMemberLoginId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueMemberLoginId(), "MEMBER_LOGIN_ID"); }
    protected abstract ConditionValue getCValueMemberLoginId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ID: {IX, INTEGER(10), FK to MEMBER}
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
     * MEMBER_ID: {IX, INTEGER(10), FK to MEMBER}
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
     * MEMBER_ID: {IX, INTEGER(10), FK to MEMBER}
     * @param memberId The value of memberId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setMemberId_GreaterThan(Integer memberId) {
        regMemberId(CK_GT, memberId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ID: {IX, INTEGER(10), FK to MEMBER}
     * @param memberId The value of memberId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setMemberId_LessThan(Integer memberId) {
        regMemberId(CK_LT, memberId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ID: {IX, INTEGER(10), FK to MEMBER}
     * @param memberId The value of memberId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setMemberId_GreaterEqual(Integer memberId) {
        regMemberId(CK_GE, memberId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ID: {IX, INTEGER(10), FK to MEMBER}
     * @param memberId The value of memberId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setMemberId_LessEqual(Integer memberId) {
        regMemberId(CK_LE, memberId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ID: {IX, INTEGER(10), FK to MEMBER}
     * @param minNumber The min number of memberId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of memberId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMemberId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueMemberId(), "MEMBER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * MEMBER_ID: {IX, INTEGER(10), FK to MEMBER}
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
     * MEMBER_ID: {IX, INTEGER(10), FK to MEMBER}
     * @param memberIdList The collection of memberId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberId_NotInScope(Collection<Integer> memberIdList) {
        doSetMemberId_NotInScope(memberIdList);
    }

    protected void doSetMemberId_NotInScope(Collection<Integer> memberIdList) {
        regINS(CK_NINS, cTL(memberIdList), getCValueMemberId(), "MEMBER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select MEMBER_ID from MEMBER where ...)} <br />
     * MEMBER by my MEMBER_ID, named 'member'.
     * @param subQuery The sub-query of Member for 'in-scope'. (NotNull)
     */
    public void inScopeMember(SubQuery<MemberCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        MemberCB cb = new MemberCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMemberId_InScopeRelation_Member(cb.query());
        registerInScopeRelation(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "member");
    }
    public abstract String keepMemberId_InScopeRelation_Member(MemberCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select MEMBER_ID from MEMBER where ...)} <br />
     * MEMBER by my MEMBER_ID, named 'member'.
     * @param subQuery The sub-query of Member for 'not in-scope'. (NotNull)
     */
    public void notInScopeMember(SubQuery<MemberCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        MemberCB cb = new MemberCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMemberId_NotInScopeRelation_Member(cb.query());
        registerNotInScopeRelation(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "member");
    }
    public abstract String keepMemberId_NotInScopeRelation_Member(MemberCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * MEMBER_ID: {IX, INTEGER(10), FK to MEMBER}
     */
    public void setMemberId_IsNull() { regMemberId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * MEMBER_ID: {IX, INTEGER(10), FK to MEMBER}
     */
    public void setMemberId_IsNotNull() { regMemberId(CK_ISNN, DOBJ); }

    protected void regMemberId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueMemberId(), "MEMBER_ID"); }
    protected abstract ConditionValue getCValueMemberId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * LOGIN_DATETIME: {VARCHAR(255)}
     * @param loginDatetime The value of loginDatetime as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setLoginDatetime_Equal(String loginDatetime) {
        doSetLoginDatetime_Equal(fRES(loginDatetime));
    }

    protected void doSetLoginDatetime_Equal(String loginDatetime) {
        regLoginDatetime(CK_EQ, loginDatetime);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * LOGIN_DATETIME: {VARCHAR(255)}
     * @param loginDatetime The value of loginDatetime as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setLoginDatetime_NotEqual(String loginDatetime) {
        doSetLoginDatetime_NotEqual(fRES(loginDatetime));
    }

    protected void doSetLoginDatetime_NotEqual(String loginDatetime) {
        regLoginDatetime(CK_NES, loginDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * LOGIN_DATETIME: {VARCHAR(255)}
     * @param loginDatetime The value of loginDatetime as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setLoginDatetime_GreaterThan(String loginDatetime) {
        regLoginDatetime(CK_GT, fRES(loginDatetime));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * LOGIN_DATETIME: {VARCHAR(255)}
     * @param loginDatetime The value of loginDatetime as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setLoginDatetime_LessThan(String loginDatetime) {
        regLoginDatetime(CK_LT, fRES(loginDatetime));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * LOGIN_DATETIME: {VARCHAR(255)}
     * @param loginDatetime The value of loginDatetime as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setLoginDatetime_GreaterEqual(String loginDatetime) {
        regLoginDatetime(CK_GE, fRES(loginDatetime));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * LOGIN_DATETIME: {VARCHAR(255)}
     * @param loginDatetime The value of loginDatetime as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setLoginDatetime_LessEqual(String loginDatetime) {
        regLoginDatetime(CK_LE, fRES(loginDatetime));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * LOGIN_DATETIME: {VARCHAR(255)}
     * @param loginDatetimeList The collection of loginDatetime as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLoginDatetime_InScope(Collection<String> loginDatetimeList) {
        doSetLoginDatetime_InScope(loginDatetimeList);
    }

    public void doSetLoginDatetime_InScope(Collection<String> loginDatetimeList) {
        regINS(CK_INS, cTL(loginDatetimeList), getCValueLoginDatetime(), "LOGIN_DATETIME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * LOGIN_DATETIME: {VARCHAR(255)}
     * @param loginDatetimeList The collection of loginDatetime as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLoginDatetime_NotInScope(Collection<String> loginDatetimeList) {
        doSetLoginDatetime_NotInScope(loginDatetimeList);
    }

    public void doSetLoginDatetime_NotInScope(Collection<String> loginDatetimeList) {
        regINS(CK_NINS, cTL(loginDatetimeList), getCValueLoginDatetime(), "LOGIN_DATETIME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * LOGIN_DATETIME: {VARCHAR(255)}
     * @param loginDatetime The value of loginDatetime as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setLoginDatetime_PrefixSearch(String loginDatetime) {
        setLoginDatetime_LikeSearch(loginDatetime, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * LOGIN_DATETIME: {VARCHAR(255)} <br />
     * <pre>e.g. setLoginDatetime_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param loginDatetime The value of loginDatetime as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLoginDatetime_LikeSearch(String loginDatetime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(loginDatetime), getCValueLoginDatetime(), "LOGIN_DATETIME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * LOGIN_DATETIME: {VARCHAR(255)}
     * @param loginDatetime The value of loginDatetime as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLoginDatetime_NotLikeSearch(String loginDatetime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(loginDatetime), getCValueLoginDatetime(), "LOGIN_DATETIME", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * LOGIN_DATETIME: {VARCHAR(255)}
     */
    public void setLoginDatetime_IsNull() { regLoginDatetime(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * LOGIN_DATETIME: {VARCHAR(255)}
     */
    public void setLoginDatetime_IsNullOrEmpty() { regLoginDatetime(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * LOGIN_DATETIME: {VARCHAR(255)}
     */
    public void setLoginDatetime_IsNotNull() { regLoginDatetime(CK_ISNN, DOBJ); }

    protected void regLoginDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueLoginDatetime(), "LOGIN_DATETIME"); }
    protected abstract ConditionValue getCValueLoginDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * LOGIN_MOBILE_FLG: {VARCHAR(255), classification=Flg}
     * @param loginMobileFlg The value of loginMobileFlg as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setLoginMobileFlg_Equal(String loginMobileFlg) {
        doSetLoginMobileFlg_Equal(fRES(loginMobileFlg));
    }

    /**
     * Equal(=). As Flg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * LOGIN_MOBILE_FLG: {VARCHAR(255), classification=Flg} <br />
     * フラグを示す
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    public void setLoginMobileFlg_Equal_AsFlg(CDef.Flg cdef) {
        doSetLoginMobileFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As True (1). And OnlyOnceRegistered. <br />
     * はい: 有効を示す
     */
    public void setLoginMobileFlg_Equal_True() {
        setLoginMobileFlg_Equal_AsFlg(CDef.Flg.True);
    }

    /**
     * Equal(=). As False (0). And OnlyOnceRegistered. <br />
     * いいえ: 無効を示す
     */
    public void setLoginMobileFlg_Equal_False() {
        setLoginMobileFlg_Equal_AsFlg(CDef.Flg.False);
    }

    protected void doSetLoginMobileFlg_Equal(String loginMobileFlg) {
        regLoginMobileFlg(CK_EQ, loginMobileFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * LOGIN_MOBILE_FLG: {VARCHAR(255), classification=Flg}
     * @param loginMobileFlg The value of loginMobileFlg as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setLoginMobileFlg_NotEqual(String loginMobileFlg) {
        doSetLoginMobileFlg_NotEqual(fRES(loginMobileFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As Flg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * LOGIN_MOBILE_FLG: {VARCHAR(255), classification=Flg} <br />
     * フラグを示す
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    public void setLoginMobileFlg_NotEqual_AsFlg(CDef.Flg cdef) {
        doSetLoginMobileFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As True (1). And OnlyOnceRegistered. <br />
     * はい: 有効を示す
     */
    public void setLoginMobileFlg_NotEqual_True() {
        setLoginMobileFlg_NotEqual_AsFlg(CDef.Flg.True);
    }

    /**
     * NotEqual(&lt;&gt;). As False (0). And OnlyOnceRegistered. <br />
     * いいえ: 無効を示す
     */
    public void setLoginMobileFlg_NotEqual_False() {
        setLoginMobileFlg_NotEqual_AsFlg(CDef.Flg.False);
    }

    protected void doSetLoginMobileFlg_NotEqual(String loginMobileFlg) {
        regLoginMobileFlg(CK_NES, loginMobileFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * LOGIN_MOBILE_FLG: {VARCHAR(255), classification=Flg}
     * @param loginMobileFlgList The collection of loginMobileFlg as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLoginMobileFlg_InScope(Collection<String> loginMobileFlgList) {
        doSetLoginMobileFlg_InScope(loginMobileFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As Flg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * LOGIN_MOBILE_FLG: {VARCHAR(255), classification=Flg} <br />
     * フラグを示す
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setLoginMobileFlg_InScope_AsFlg(Collection<CDef.Flg> cdefList) {
        doSetLoginMobileFlg_InScope(cTStrL(cdefList));
    }

    public void doSetLoginMobileFlg_InScope(Collection<String> loginMobileFlgList) {
        regINS(CK_INS, cTL(loginMobileFlgList), getCValueLoginMobileFlg(), "LOGIN_MOBILE_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * LOGIN_MOBILE_FLG: {VARCHAR(255), classification=Flg}
     * @param loginMobileFlgList The collection of loginMobileFlg as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLoginMobileFlg_NotInScope(Collection<String> loginMobileFlgList) {
        doSetLoginMobileFlg_NotInScope(loginMobileFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As Flg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * LOGIN_MOBILE_FLG: {VARCHAR(255), classification=Flg} <br />
     * フラグを示す
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setLoginMobileFlg_NotInScope_AsFlg(Collection<CDef.Flg> cdefList) {
        doSetLoginMobileFlg_NotInScope(cTStrL(cdefList));
    }

    public void doSetLoginMobileFlg_NotInScope(Collection<String> loginMobileFlgList) {
        regINS(CK_NINS, cTL(loginMobileFlgList), getCValueLoginMobileFlg(), "LOGIN_MOBILE_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * LOGIN_MOBILE_FLG: {VARCHAR(255), classification=Flg}
     */
    public void setLoginMobileFlg_IsNull() { regLoginMobileFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * LOGIN_MOBILE_FLG: {VARCHAR(255), classification=Flg}
     */
    public void setLoginMobileFlg_IsNullOrEmpty() { regLoginMobileFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * LOGIN_MOBILE_FLG: {VARCHAR(255), classification=Flg}
     */
    public void setLoginMobileFlg_IsNotNull() { regLoginMobileFlg(CK_ISNN, DOBJ); }

    protected void regLoginMobileFlg(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueLoginMobileFlg(), "LOGIN_MOBILE_FLG"); }
    protected abstract ConditionValue getCValueLoginMobileFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * LOGIN_MEMBER_STATUS_CODE: {VARCHAR(255), FK to MEMBER_STATUS}
     * @param loginMemberStatusCode The value of loginMemberStatusCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setLoginMemberStatusCode_Equal(String loginMemberStatusCode) {
        doSetLoginMemberStatusCode_Equal(fRES(loginMemberStatusCode));
    }

    protected void doSetLoginMemberStatusCode_Equal(String loginMemberStatusCode) {
        regLoginMemberStatusCode(CK_EQ, loginMemberStatusCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * LOGIN_MEMBER_STATUS_CODE: {VARCHAR(255), FK to MEMBER_STATUS}
     * @param loginMemberStatusCode The value of loginMemberStatusCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setLoginMemberStatusCode_NotEqual(String loginMemberStatusCode) {
        doSetLoginMemberStatusCode_NotEqual(fRES(loginMemberStatusCode));
    }

    protected void doSetLoginMemberStatusCode_NotEqual(String loginMemberStatusCode) {
        regLoginMemberStatusCode(CK_NES, loginMemberStatusCode);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * LOGIN_MEMBER_STATUS_CODE: {VARCHAR(255), FK to MEMBER_STATUS}
     * @param loginMemberStatusCode The value of loginMemberStatusCode as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setLoginMemberStatusCode_GreaterThan(String loginMemberStatusCode) {
        regLoginMemberStatusCode(CK_GT, fRES(loginMemberStatusCode));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * LOGIN_MEMBER_STATUS_CODE: {VARCHAR(255), FK to MEMBER_STATUS}
     * @param loginMemberStatusCode The value of loginMemberStatusCode as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setLoginMemberStatusCode_LessThan(String loginMemberStatusCode) {
        regLoginMemberStatusCode(CK_LT, fRES(loginMemberStatusCode));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * LOGIN_MEMBER_STATUS_CODE: {VARCHAR(255), FK to MEMBER_STATUS}
     * @param loginMemberStatusCode The value of loginMemberStatusCode as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setLoginMemberStatusCode_GreaterEqual(String loginMemberStatusCode) {
        regLoginMemberStatusCode(CK_GE, fRES(loginMemberStatusCode));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * LOGIN_MEMBER_STATUS_CODE: {VARCHAR(255), FK to MEMBER_STATUS}
     * @param loginMemberStatusCode The value of loginMemberStatusCode as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setLoginMemberStatusCode_LessEqual(String loginMemberStatusCode) {
        regLoginMemberStatusCode(CK_LE, fRES(loginMemberStatusCode));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * LOGIN_MEMBER_STATUS_CODE: {VARCHAR(255), FK to MEMBER_STATUS}
     * @param loginMemberStatusCodeList The collection of loginMemberStatusCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLoginMemberStatusCode_InScope(Collection<String> loginMemberStatusCodeList) {
        doSetLoginMemberStatusCode_InScope(loginMemberStatusCodeList);
    }

    public void doSetLoginMemberStatusCode_InScope(Collection<String> loginMemberStatusCodeList) {
        regINS(CK_INS, cTL(loginMemberStatusCodeList), getCValueLoginMemberStatusCode(), "LOGIN_MEMBER_STATUS_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * LOGIN_MEMBER_STATUS_CODE: {VARCHAR(255), FK to MEMBER_STATUS}
     * @param loginMemberStatusCodeList The collection of loginMemberStatusCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLoginMemberStatusCode_NotInScope(Collection<String> loginMemberStatusCodeList) {
        doSetLoginMemberStatusCode_NotInScope(loginMemberStatusCodeList);
    }

    public void doSetLoginMemberStatusCode_NotInScope(Collection<String> loginMemberStatusCodeList) {
        regINS(CK_NINS, cTL(loginMemberStatusCodeList), getCValueLoginMemberStatusCode(), "LOGIN_MEMBER_STATUS_CODE");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * LOGIN_MEMBER_STATUS_CODE: {VARCHAR(255), FK to MEMBER_STATUS}
     * @param loginMemberStatusCode The value of loginMemberStatusCode as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setLoginMemberStatusCode_PrefixSearch(String loginMemberStatusCode) {
        setLoginMemberStatusCode_LikeSearch(loginMemberStatusCode, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * LOGIN_MEMBER_STATUS_CODE: {VARCHAR(255), FK to MEMBER_STATUS} <br />
     * <pre>e.g. setLoginMemberStatusCode_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param loginMemberStatusCode The value of loginMemberStatusCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLoginMemberStatusCode_LikeSearch(String loginMemberStatusCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(loginMemberStatusCode), getCValueLoginMemberStatusCode(), "LOGIN_MEMBER_STATUS_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * LOGIN_MEMBER_STATUS_CODE: {VARCHAR(255), FK to MEMBER_STATUS}
     * @param loginMemberStatusCode The value of loginMemberStatusCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLoginMemberStatusCode_NotLikeSearch(String loginMemberStatusCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(loginMemberStatusCode), getCValueLoginMemberStatusCode(), "LOGIN_MEMBER_STATUS_CODE", likeSearchOption);
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select LOGIN_MEMBER_STATUS_CODE from MEMBER_STATUS where ...)} <br />
     * MEMBER_STATUS by my LOGIN_MEMBER_STATUS_CODE, named 'memberStatus'.
     * @param subQuery The sub-query of MemberStatus for 'in-scope'. (NotNull)
     */
    public void inScopeMemberStatus(SubQuery<MemberStatusCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        MemberStatusCB cb = new MemberStatusCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepLoginMemberStatusCode_InScopeRelation_MemberStatus(cb.query());
        registerInScopeRelation(cb.query(), "LOGIN_MEMBER_STATUS_CODE", "MEMBER_STATUS_CODE", pp, "memberStatus");
    }
    public abstract String keepLoginMemberStatusCode_InScopeRelation_MemberStatus(MemberStatusCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select LOGIN_MEMBER_STATUS_CODE from MEMBER_STATUS where ...)} <br />
     * MEMBER_STATUS by my LOGIN_MEMBER_STATUS_CODE, named 'memberStatus'.
     * @param subQuery The sub-query of MemberStatus for 'not in-scope'. (NotNull)
     */
    public void notInScopeMemberStatus(SubQuery<MemberStatusCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        MemberStatusCB cb = new MemberStatusCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepLoginMemberStatusCode_NotInScopeRelation_MemberStatus(cb.query());
        registerNotInScopeRelation(cb.query(), "LOGIN_MEMBER_STATUS_CODE", "MEMBER_STATUS_CODE", pp, "memberStatus");
    }
    public abstract String keepLoginMemberStatusCode_NotInScopeRelation_MemberStatus(MemberStatusCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * LOGIN_MEMBER_STATUS_CODE: {VARCHAR(255), FK to MEMBER_STATUS}
     */
    public void setLoginMemberStatusCode_IsNull() { regLoginMemberStatusCode(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * LOGIN_MEMBER_STATUS_CODE: {VARCHAR(255), FK to MEMBER_STATUS}
     */
    public void setLoginMemberStatusCode_IsNullOrEmpty() { regLoginMemberStatusCode(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * LOGIN_MEMBER_STATUS_CODE: {VARCHAR(255), FK to MEMBER_STATUS}
     */
    public void setLoginMemberStatusCode_IsNotNull() { regLoginMemberStatusCode(CK_ISNN, DOBJ); }

    protected void regLoginMemberStatusCode(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueLoginMemberStatusCode(), "LOGIN_MEMBER_STATUS_CODE"); }
    protected abstract ConditionValue getCValueLoginMemberStatusCode();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * REGISTER_DATETIME: {DATETIME(19)}
     * @param registerDatetime The value of registerDatetime as equal. (NullAllowed: if null, no condition)
     */
    public void setRegisterDatetime_Equal(java.sql.Timestamp registerDatetime) {
        regRegisterDatetime(CK_EQ,  registerDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * REGISTER_DATETIME: {DATETIME(19)}
     * @param registerDatetime The value of registerDatetime as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setRegisterDatetime_GreaterThan(java.sql.Timestamp registerDatetime) {
        regRegisterDatetime(CK_GT,  registerDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * REGISTER_DATETIME: {DATETIME(19)}
     * @param registerDatetime The value of registerDatetime as lessThan. (NullAllowed: if null, no condition)
     */
    public void setRegisterDatetime_LessThan(java.sql.Timestamp registerDatetime) {
        regRegisterDatetime(CK_LT,  registerDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * REGISTER_DATETIME: {DATETIME(19)}
     * @param registerDatetime The value of registerDatetime as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setRegisterDatetime_GreaterEqual(java.sql.Timestamp registerDatetime) {
        regRegisterDatetime(CK_GE,  registerDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * REGISTER_DATETIME: {DATETIME(19)}
     * @param registerDatetime The value of registerDatetime as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setRegisterDatetime_LessEqual(java.sql.Timestamp registerDatetime) {
        regRegisterDatetime(CK_LE, registerDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * REGISTER_DATETIME: {DATETIME(19)}
     * <pre>e.g. setRegisterDatetime_FromTo(fromDate, toDate, new <span style="color: #DD4747">FromToOption</span>().compareAsDate());</pre>
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
     * REGISTER_DATETIME: {DATETIME(19)}
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
     * InScope {in ('1965-03-03', '1966-09-15')}. And NullOrEmptyIgnored, NullElementIgnored, SeveralRegistered. <br />
     * REGISTER_DATETIME: {DATETIME(19)}
     * @param registerDatetimeList The collection of registerDatetime as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterDatetime_InScope(Collection<java.sql.Timestamp> registerDatetimeList) {
        doSetRegisterDatetime_InScope(registerDatetimeList);
    }

    protected void doSetRegisterDatetime_InScope(Collection<java.sql.Timestamp> registerDatetimeList) {
        regINS(CK_INS, cTL(registerDatetimeList), getCValueRegisterDatetime(), "REGISTER_DATETIME");
    }

    /**
     * NotInScope {not in ('1965-03-03', '1966-09-15')}. And NullOrEmptyIgnored, NullElementIgnored, SeveralRegistered. <br />
     * REGISTER_DATETIME: {DATETIME(19)}
     * @param registerDatetimeList The collection of registerDatetime as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterDatetime_NotInScope(Collection<java.sql.Timestamp> registerDatetimeList) {
        doSetRegisterDatetime_NotInScope(registerDatetimeList);
    }

    protected void doSetRegisterDatetime_NotInScope(Collection<java.sql.Timestamp> registerDatetimeList) {
        regINS(CK_NINS, cTL(registerDatetimeList), getCValueRegisterDatetime(), "REGISTER_DATETIME");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * REGISTER_DATETIME: {DATETIME(19)}
     */
    public void setRegisterDatetime_IsNull() { regRegisterDatetime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * REGISTER_DATETIME: {DATETIME(19)}
     */
    public void setRegisterDatetime_IsNotNull() { regRegisterDatetime(CK_ISNN, DOBJ); }

    protected void regRegisterDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueRegisterDatetime(), "REGISTER_DATETIME"); }
    protected abstract ConditionValue getCValueRegisterDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * REGISTER_USER: {VARCHAR(255)}
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
     * REGISTER_USER: {VARCHAR(255)}
     * @param registerUser The value of registerUser as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterUser_NotEqual(String registerUser) {
        doSetRegisterUser_NotEqual(fRES(registerUser));
    }

    protected void doSetRegisterUser_NotEqual(String registerUser) {
        regRegisterUser(CK_NES, registerUser);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * REGISTER_USER: {VARCHAR(255)}
     * @param registerUser The value of registerUser as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterUser_GreaterThan(String registerUser) {
        regRegisterUser(CK_GT, fRES(registerUser));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * REGISTER_USER: {VARCHAR(255)}
     * @param registerUser The value of registerUser as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterUser_LessThan(String registerUser) {
        regRegisterUser(CK_LT, fRES(registerUser));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * REGISTER_USER: {VARCHAR(255)}
     * @param registerUser The value of registerUser as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterUser_GreaterEqual(String registerUser) {
        regRegisterUser(CK_GE, fRES(registerUser));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * REGISTER_USER: {VARCHAR(255)}
     * @param registerUser The value of registerUser as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterUser_LessEqual(String registerUser) {
        regRegisterUser(CK_LE, fRES(registerUser));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * REGISTER_USER: {VARCHAR(255)}
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
     * REGISTER_USER: {VARCHAR(255)}
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
     * REGISTER_USER: {VARCHAR(255)}
     * @param registerUser The value of registerUser as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterUser_PrefixSearch(String registerUser) {
        setRegisterUser_LikeSearch(registerUser, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * REGISTER_USER: {VARCHAR(255)} <br />
     * <pre>e.g. setRegisterUser_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param registerUser The value of registerUser as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRegisterUser_LikeSearch(String registerUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(registerUser), getCValueRegisterUser(), "REGISTER_USER", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * REGISTER_USER: {VARCHAR(255)}
     * @param registerUser The value of registerUser as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRegisterUser_NotLikeSearch(String registerUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(registerUser), getCValueRegisterUser(), "REGISTER_USER", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * REGISTER_USER: {VARCHAR(255)}
     */
    public void setRegisterUser_IsNull() { regRegisterUser(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * REGISTER_USER: {VARCHAR(255)}
     */
    public void setRegisterUser_IsNullOrEmpty() { regRegisterUser(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * REGISTER_USER: {VARCHAR(255)}
     */
    public void setRegisterUser_IsNotNull() { regRegisterUser(CK_ISNN, DOBJ); }

    protected void regRegisterUser(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueRegisterUser(), "REGISTER_USER"); }
    protected abstract ConditionValue getCValueRegisterUser();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * REGISTER_PROCESS: {VARCHAR(255)}
     * @param registerProcess The value of registerProcess as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterProcess_Equal(String registerProcess) {
        doSetRegisterProcess_Equal(fRES(registerProcess));
    }

    protected void doSetRegisterProcess_Equal(String registerProcess) {
        regRegisterProcess(CK_EQ, registerProcess);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * REGISTER_PROCESS: {VARCHAR(255)}
     * @param registerProcess The value of registerProcess as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterProcess_NotEqual(String registerProcess) {
        doSetRegisterProcess_NotEqual(fRES(registerProcess));
    }

    protected void doSetRegisterProcess_NotEqual(String registerProcess) {
        regRegisterProcess(CK_NES, registerProcess);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * REGISTER_PROCESS: {VARCHAR(255)}
     * @param registerProcess The value of registerProcess as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterProcess_GreaterThan(String registerProcess) {
        regRegisterProcess(CK_GT, fRES(registerProcess));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * REGISTER_PROCESS: {VARCHAR(255)}
     * @param registerProcess The value of registerProcess as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterProcess_LessThan(String registerProcess) {
        regRegisterProcess(CK_LT, fRES(registerProcess));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * REGISTER_PROCESS: {VARCHAR(255)}
     * @param registerProcess The value of registerProcess as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterProcess_GreaterEqual(String registerProcess) {
        regRegisterProcess(CK_GE, fRES(registerProcess));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * REGISTER_PROCESS: {VARCHAR(255)}
     * @param registerProcess The value of registerProcess as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterProcess_LessEqual(String registerProcess) {
        regRegisterProcess(CK_LE, fRES(registerProcess));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * REGISTER_PROCESS: {VARCHAR(255)}
     * @param registerProcessList The collection of registerProcess as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterProcess_InScope(Collection<String> registerProcessList) {
        doSetRegisterProcess_InScope(registerProcessList);
    }

    public void doSetRegisterProcess_InScope(Collection<String> registerProcessList) {
        regINS(CK_INS, cTL(registerProcessList), getCValueRegisterProcess(), "REGISTER_PROCESS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * REGISTER_PROCESS: {VARCHAR(255)}
     * @param registerProcessList The collection of registerProcess as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterProcess_NotInScope(Collection<String> registerProcessList) {
        doSetRegisterProcess_NotInScope(registerProcessList);
    }

    public void doSetRegisterProcess_NotInScope(Collection<String> registerProcessList) {
        regINS(CK_NINS, cTL(registerProcessList), getCValueRegisterProcess(), "REGISTER_PROCESS");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * REGISTER_PROCESS: {VARCHAR(255)}
     * @param registerProcess The value of registerProcess as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterProcess_PrefixSearch(String registerProcess) {
        setRegisterProcess_LikeSearch(registerProcess, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * REGISTER_PROCESS: {VARCHAR(255)} <br />
     * <pre>e.g. setRegisterProcess_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param registerProcess The value of registerProcess as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRegisterProcess_LikeSearch(String registerProcess, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(registerProcess), getCValueRegisterProcess(), "REGISTER_PROCESS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * REGISTER_PROCESS: {VARCHAR(255)}
     * @param registerProcess The value of registerProcess as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRegisterProcess_NotLikeSearch(String registerProcess, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(registerProcess), getCValueRegisterProcess(), "REGISTER_PROCESS", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * REGISTER_PROCESS: {VARCHAR(255)}
     */
    public void setRegisterProcess_IsNull() { regRegisterProcess(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * REGISTER_PROCESS: {VARCHAR(255)}
     */
    public void setRegisterProcess_IsNullOrEmpty() { regRegisterProcess(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * REGISTER_PROCESS: {VARCHAR(255)}
     */
    public void setRegisterProcess_IsNotNull() { regRegisterProcess(CK_ISNN, DOBJ); }

    protected void regRegisterProcess(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueRegisterProcess(), "REGISTER_PROCESS"); }
    protected abstract ConditionValue getCValueRegisterProcess();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * UPDATE_DATETIME: {DATETIME(19)}
     * @param updateDatetime The value of updateDatetime as equal. (NullAllowed: if null, no condition)
     */
    public void setUpdateDatetime_Equal(java.sql.Timestamp updateDatetime) {
        regUpdateDatetime(CK_EQ,  updateDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * UPDATE_DATETIME: {DATETIME(19)}
     * @param updateDatetime The value of updateDatetime as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setUpdateDatetime_GreaterThan(java.sql.Timestamp updateDatetime) {
        regUpdateDatetime(CK_GT,  updateDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * UPDATE_DATETIME: {DATETIME(19)}
     * @param updateDatetime The value of updateDatetime as lessThan. (NullAllowed: if null, no condition)
     */
    public void setUpdateDatetime_LessThan(java.sql.Timestamp updateDatetime) {
        regUpdateDatetime(CK_LT,  updateDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * UPDATE_DATETIME: {DATETIME(19)}
     * @param updateDatetime The value of updateDatetime as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setUpdateDatetime_GreaterEqual(java.sql.Timestamp updateDatetime) {
        regUpdateDatetime(CK_GE,  updateDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * UPDATE_DATETIME: {DATETIME(19)}
     * @param updateDatetime The value of updateDatetime as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setUpdateDatetime_LessEqual(java.sql.Timestamp updateDatetime) {
        regUpdateDatetime(CK_LE, updateDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * UPDATE_DATETIME: {DATETIME(19)}
     * <pre>e.g. setUpdateDatetime_FromTo(fromDate, toDate, new <span style="color: #DD4747">FromToOption</span>().compareAsDate());</pre>
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
     * UPDATE_DATETIME: {DATETIME(19)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #DD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of updateDatetime. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of updateDatetime. (NullAllowed: if null, no to-condition)
     */
    public void setUpdateDatetime_DateFromTo(Date fromDate, Date toDate) {
        setUpdateDatetime_FromTo(fromDate, toDate, new FromToOption().compareAsDate());
    }

    /**
     * InScope {in ('1965-03-03', '1966-09-15')}. And NullOrEmptyIgnored, NullElementIgnored, SeveralRegistered. <br />
     * UPDATE_DATETIME: {DATETIME(19)}
     * @param updateDatetimeList The collection of updateDatetime as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateDatetime_InScope(Collection<java.sql.Timestamp> updateDatetimeList) {
        doSetUpdateDatetime_InScope(updateDatetimeList);
    }

    protected void doSetUpdateDatetime_InScope(Collection<java.sql.Timestamp> updateDatetimeList) {
        regINS(CK_INS, cTL(updateDatetimeList), getCValueUpdateDatetime(), "UPDATE_DATETIME");
    }

    /**
     * NotInScope {not in ('1965-03-03', '1966-09-15')}. And NullOrEmptyIgnored, NullElementIgnored, SeveralRegistered. <br />
     * UPDATE_DATETIME: {DATETIME(19)}
     * @param updateDatetimeList The collection of updateDatetime as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateDatetime_NotInScope(Collection<java.sql.Timestamp> updateDatetimeList) {
        doSetUpdateDatetime_NotInScope(updateDatetimeList);
    }

    protected void doSetUpdateDatetime_NotInScope(Collection<java.sql.Timestamp> updateDatetimeList) {
        regINS(CK_NINS, cTL(updateDatetimeList), getCValueUpdateDatetime(), "UPDATE_DATETIME");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * UPDATE_DATETIME: {DATETIME(19)}
     */
    public void setUpdateDatetime_IsNull() { regUpdateDatetime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * UPDATE_DATETIME: {DATETIME(19)}
     */
    public void setUpdateDatetime_IsNotNull() { regUpdateDatetime(CK_ISNN, DOBJ); }

    protected void regUpdateDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueUpdateDatetime(), "UPDATE_DATETIME"); }
    protected abstract ConditionValue getCValueUpdateDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * UPDATE_USER: {VARCHAR(255)}
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
     * UPDATE_USER: {VARCHAR(255)}
     * @param updateUser The value of updateUser as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateUser_NotEqual(String updateUser) {
        doSetUpdateUser_NotEqual(fRES(updateUser));
    }

    protected void doSetUpdateUser_NotEqual(String updateUser) {
        regUpdateUser(CK_NES, updateUser);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * UPDATE_USER: {VARCHAR(255)}
     * @param updateUser The value of updateUser as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateUser_GreaterThan(String updateUser) {
        regUpdateUser(CK_GT, fRES(updateUser));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * UPDATE_USER: {VARCHAR(255)}
     * @param updateUser The value of updateUser as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateUser_LessThan(String updateUser) {
        regUpdateUser(CK_LT, fRES(updateUser));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * UPDATE_USER: {VARCHAR(255)}
     * @param updateUser The value of updateUser as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateUser_GreaterEqual(String updateUser) {
        regUpdateUser(CK_GE, fRES(updateUser));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * UPDATE_USER: {VARCHAR(255)}
     * @param updateUser The value of updateUser as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateUser_LessEqual(String updateUser) {
        regUpdateUser(CK_LE, fRES(updateUser));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * UPDATE_USER: {VARCHAR(255)}
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
     * UPDATE_USER: {VARCHAR(255)}
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
     * UPDATE_USER: {VARCHAR(255)}
     * @param updateUser The value of updateUser as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateUser_PrefixSearch(String updateUser) {
        setUpdateUser_LikeSearch(updateUser, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * UPDATE_USER: {VARCHAR(255)} <br />
     * <pre>e.g. setUpdateUser_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param updateUser The value of updateUser as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUpdateUser_LikeSearch(String updateUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(updateUser), getCValueUpdateUser(), "UPDATE_USER", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * UPDATE_USER: {VARCHAR(255)}
     * @param updateUser The value of updateUser as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUpdateUser_NotLikeSearch(String updateUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(updateUser), getCValueUpdateUser(), "UPDATE_USER", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * UPDATE_USER: {VARCHAR(255)}
     */
    public void setUpdateUser_IsNull() { regUpdateUser(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * UPDATE_USER: {VARCHAR(255)}
     */
    public void setUpdateUser_IsNullOrEmpty() { regUpdateUser(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * UPDATE_USER: {VARCHAR(255)}
     */
    public void setUpdateUser_IsNotNull() { regUpdateUser(CK_ISNN, DOBJ); }

    protected void regUpdateUser(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueUpdateUser(), "UPDATE_USER"); }
    protected abstract ConditionValue getCValueUpdateUser();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * UPDATE_PROCESS: {VARCHAR(255)}
     * @param updateProcess The value of updateProcess as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateProcess_Equal(String updateProcess) {
        doSetUpdateProcess_Equal(fRES(updateProcess));
    }

    protected void doSetUpdateProcess_Equal(String updateProcess) {
        regUpdateProcess(CK_EQ, updateProcess);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * UPDATE_PROCESS: {VARCHAR(255)}
     * @param updateProcess The value of updateProcess as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateProcess_NotEqual(String updateProcess) {
        doSetUpdateProcess_NotEqual(fRES(updateProcess));
    }

    protected void doSetUpdateProcess_NotEqual(String updateProcess) {
        regUpdateProcess(CK_NES, updateProcess);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * UPDATE_PROCESS: {VARCHAR(255)}
     * @param updateProcess The value of updateProcess as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateProcess_GreaterThan(String updateProcess) {
        regUpdateProcess(CK_GT, fRES(updateProcess));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * UPDATE_PROCESS: {VARCHAR(255)}
     * @param updateProcess The value of updateProcess as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateProcess_LessThan(String updateProcess) {
        regUpdateProcess(CK_LT, fRES(updateProcess));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * UPDATE_PROCESS: {VARCHAR(255)}
     * @param updateProcess The value of updateProcess as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateProcess_GreaterEqual(String updateProcess) {
        regUpdateProcess(CK_GE, fRES(updateProcess));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * UPDATE_PROCESS: {VARCHAR(255)}
     * @param updateProcess The value of updateProcess as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateProcess_LessEqual(String updateProcess) {
        regUpdateProcess(CK_LE, fRES(updateProcess));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * UPDATE_PROCESS: {VARCHAR(255)}
     * @param updateProcessList The collection of updateProcess as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateProcess_InScope(Collection<String> updateProcessList) {
        doSetUpdateProcess_InScope(updateProcessList);
    }

    public void doSetUpdateProcess_InScope(Collection<String> updateProcessList) {
        regINS(CK_INS, cTL(updateProcessList), getCValueUpdateProcess(), "UPDATE_PROCESS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * UPDATE_PROCESS: {VARCHAR(255)}
     * @param updateProcessList The collection of updateProcess as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateProcess_NotInScope(Collection<String> updateProcessList) {
        doSetUpdateProcess_NotInScope(updateProcessList);
    }

    public void doSetUpdateProcess_NotInScope(Collection<String> updateProcessList) {
        regINS(CK_NINS, cTL(updateProcessList), getCValueUpdateProcess(), "UPDATE_PROCESS");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * UPDATE_PROCESS: {VARCHAR(255)}
     * @param updateProcess The value of updateProcess as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateProcess_PrefixSearch(String updateProcess) {
        setUpdateProcess_LikeSearch(updateProcess, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * UPDATE_PROCESS: {VARCHAR(255)} <br />
     * <pre>e.g. setUpdateProcess_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param updateProcess The value of updateProcess as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUpdateProcess_LikeSearch(String updateProcess, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(updateProcess), getCValueUpdateProcess(), "UPDATE_PROCESS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * UPDATE_PROCESS: {VARCHAR(255)}
     * @param updateProcess The value of updateProcess as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUpdateProcess_NotLikeSearch(String updateProcess, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(updateProcess), getCValueUpdateProcess(), "UPDATE_PROCESS", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * UPDATE_PROCESS: {VARCHAR(255)}
     */
    public void setUpdateProcess_IsNull() { regUpdateProcess(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * UPDATE_PROCESS: {VARCHAR(255)}
     */
    public void setUpdateProcess_IsNullOrEmpty() { regUpdateProcess(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * UPDATE_PROCESS: {VARCHAR(255)}
     */
    public void setUpdateProcess_IsNotNull() { regUpdateProcess(CK_ISNN, DOBJ); }

    protected void regUpdateProcess(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueUpdateProcess(), "UPDATE_PROCESS"); }
    protected abstract ConditionValue getCValueUpdateProcess();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * VERSION_NO: {INTEGER(10)}
     * @param versionNo The value of versionNo as equal. (NullAllowed: if null, no condition)
     */
    public void setVersionNo_Equal(Integer versionNo) {
        doSetVersionNo_Equal(versionNo);
    }

    protected void doSetVersionNo_Equal(Integer versionNo) {
        regVersionNo(CK_EQ, versionNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * VERSION_NO: {INTEGER(10)}
     * @param versionNo The value of versionNo as notEqual. (NullAllowed: if null, no condition)
     */
    public void setVersionNo_NotEqual(Integer versionNo) {
        doSetVersionNo_NotEqual(versionNo);
    }

    protected void doSetVersionNo_NotEqual(Integer versionNo) {
        regVersionNo(CK_NES, versionNo);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * VERSION_NO: {INTEGER(10)}
     * @param versionNo The value of versionNo as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setVersionNo_GreaterThan(Integer versionNo) {
        regVersionNo(CK_GT, versionNo);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * VERSION_NO: {INTEGER(10)}
     * @param versionNo The value of versionNo as lessThan. (NullAllowed: if null, no condition)
     */
    public void setVersionNo_LessThan(Integer versionNo) {
        regVersionNo(CK_LT, versionNo);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * VERSION_NO: {INTEGER(10)}
     * @param versionNo The value of versionNo as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setVersionNo_GreaterEqual(Integer versionNo) {
        regVersionNo(CK_GE, versionNo);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * VERSION_NO: {INTEGER(10)}
     * @param versionNo The value of versionNo as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setVersionNo_LessEqual(Integer versionNo) {
        regVersionNo(CK_LE, versionNo);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * VERSION_NO: {INTEGER(10)}
     * @param minNumber The min number of versionNo. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of versionNo. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setVersionNo_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueVersionNo(), "VERSION_NO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * VERSION_NO: {INTEGER(10)}
     * @param versionNoList The collection of versionNo as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setVersionNo_InScope(Collection<Integer> versionNoList) {
        doSetVersionNo_InScope(versionNoList);
    }

    protected void doSetVersionNo_InScope(Collection<Integer> versionNoList) {
        regINS(CK_INS, cTL(versionNoList), getCValueVersionNo(), "VERSION_NO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * VERSION_NO: {INTEGER(10)}
     * @param versionNoList The collection of versionNo as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setVersionNo_NotInScope(Collection<Integer> versionNoList) {
        doSetVersionNo_NotInScope(versionNoList);
    }

    protected void doSetVersionNo_NotInScope(Collection<Integer> versionNoList) {
        regINS(CK_NINS, cTL(versionNoList), getCValueVersionNo(), "VERSION_NO");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * VERSION_NO: {INTEGER(10)}
     */
    public void setVersionNo_IsNull() { regVersionNo(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * VERSION_NO: {INTEGER(10)}
     */
    public void setVersionNo_IsNotNull() { regVersionNo(CK_ISNN, DOBJ); }

    protected void regVersionNo(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueVersionNo(), "VERSION_NO"); }
    protected abstract ConditionValue getCValueVersionNo();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;MemberLoginCB&gt;() {
     *     public void query(MemberLoginCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberLoginCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, MemberLoginCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;MemberLoginCB&gt;() {
     *     public void query(MemberLoginCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberLoginCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, MemberLoginCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;MemberLoginCB&gt;() {
     *     public void query(MemberLoginCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberLoginCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, MemberLoginCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;MemberLoginCB&gt;() {
     *     public void query(MemberLoginCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberLoginCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, MemberLoginCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;MemberLoginCB&gt;() {
     *     public void query(MemberLoginCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberLoginCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, MemberLoginCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MemberLoginCB&gt;() {
     *     public void query(MemberLoginCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberLoginCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, MemberLoginCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        MemberLoginCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(MemberLoginCQ sq);

    protected MemberLoginCB xcreateScalarConditionCB() {
        MemberLoginCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MemberLoginCB xcreateScalarConditionPartitionByCB() {
        MemberLoginCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MemberLoginCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MemberLoginCB cb = new MemberLoginCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "MEMBER_LOGIN_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MemberLoginCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MemberLoginCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MemberLoginCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MemberLoginCB cb = new MemberLoginCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "MEMBER_LOGIN_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MemberLoginCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MemberLoginCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        MemberLoginCB cb = new MemberLoginCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MemberLoginCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfInScope(SubQuery<MemberLoginCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        MemberLoginCB cb = new MemberLoginCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(MemberLoginCQ sq);

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
    protected MemberLoginCB newMyCB() {
        return new MemberLoginCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return MemberLoginCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
    @Override
    protected boolean xsuppressEscape() { return true; } // bacause MS-Access does not support escape
}
