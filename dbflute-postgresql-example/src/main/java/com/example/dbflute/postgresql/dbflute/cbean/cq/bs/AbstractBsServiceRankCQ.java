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
 * The abstract condition-query of service_rank.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsServiceRankCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsServiceRankCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "service_rank";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (サービスランクコード)service_rank_code: {PK, NotNull, bpchar(3)}
     * @param serviceRankCode The value of serviceRankCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setServiceRankCode_Equal(String serviceRankCode) {
        doSetServiceRankCode_Equal(fRES(serviceRankCode));
    }

    protected void doSetServiceRankCode_Equal(String serviceRankCode) {
        regServiceRankCode(CK_EQ, serviceRankCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (サービスランクコード)service_rank_code: {PK, NotNull, bpchar(3)}
     * @param serviceRankCode The value of serviceRankCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setServiceRankCode_NotEqual(String serviceRankCode) {
        doSetServiceRankCode_NotEqual(fRES(serviceRankCode));
    }

    protected void doSetServiceRankCode_NotEqual(String serviceRankCode) {
        regServiceRankCode(CK_NES, serviceRankCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (サービスランクコード)service_rank_code: {PK, NotNull, bpchar(3)}
     * @param serviceRankCodeList The collection of serviceRankCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setServiceRankCode_InScope(Collection<String> serviceRankCodeList) {
        doSetServiceRankCode_InScope(serviceRankCodeList);
    }

    public void doSetServiceRankCode_InScope(Collection<String> serviceRankCodeList) {
        regINS(CK_INS, cTL(serviceRankCodeList), getCValueServiceRankCode(), "service_rank_code");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (サービスランクコード)service_rank_code: {PK, NotNull, bpchar(3)}
     * @param serviceRankCodeList The collection of serviceRankCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setServiceRankCode_NotInScope(Collection<String> serviceRankCodeList) {
        doSetServiceRankCode_NotInScope(serviceRankCodeList);
    }

    public void doSetServiceRankCode_NotInScope(Collection<String> serviceRankCodeList) {
        regINS(CK_NINS, cTL(serviceRankCodeList), getCValueServiceRankCode(), "service_rank_code");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (サービスランクコード)service_rank_code: {PK, NotNull, bpchar(3)}
     * @param serviceRankCode The value of serviceRankCode as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setServiceRankCode_PrefixSearch(String serviceRankCode) {
        setServiceRankCode_LikeSearch(serviceRankCode, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (サービスランクコード)service_rank_code: {PK, NotNull, bpchar(3)} <br />
     * <pre>e.g. setServiceRankCode_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param serviceRankCode The value of serviceRankCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setServiceRankCode_LikeSearch(String serviceRankCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(serviceRankCode), getCValueServiceRankCode(), "service_rank_code", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (サービスランクコード)service_rank_code: {PK, NotNull, bpchar(3)}
     * @param serviceRankCode The value of serviceRankCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setServiceRankCode_NotLikeSearch(String serviceRankCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(serviceRankCode), getCValueServiceRankCode(), "service_rank_code", likeSearchOption);
    }

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select service_rank_code from member_service where ...)} <br />
     * (会員サービス)member_service by service_rank_code, named 'memberServiceAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsMemberServiceList</span>(new SubQuery&lt;MemberServiceCB&gt;() {
     *     public void query(MemberServiceCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of MemberServiceList for 'exists'. (NotNull)
     */
    public void existsMemberServiceList(SubQuery<MemberServiceCB> subQuery) {
        assertObjectNotNull("subQuery<MemberServiceCB>", subQuery);
        MemberServiceCB cb = new MemberServiceCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepServiceRankCode_ExistsReferrer_MemberServiceList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "service_rank_code", "service_rank_code", subQueryPropertyName, "memberServiceList");
    }
    public abstract String keepServiceRankCode_ExistsReferrer_MemberServiceList(MemberServiceCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select service_rank_code from member_service where ...)} <br />
     * (会員サービス)member_service by service_rank_code, named 'memberServiceAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsMemberServiceList</span>(new SubQuery&lt;MemberServiceCB&gt;() {
     *     public void query(MemberServiceCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of ServiceRankCode_NotExistsReferrer_MemberServiceList for 'not exists'. (NotNull)
     */
    public void notExistsMemberServiceList(SubQuery<MemberServiceCB> subQuery) {
        assertObjectNotNull("subQuery<MemberServiceCB>", subQuery);
        MemberServiceCB cb = new MemberServiceCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepServiceRankCode_NotExistsReferrer_MemberServiceList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "service_rank_code", "service_rank_code", subQueryPropertyName, "memberServiceList");
    }
    public abstract String keepServiceRankCode_NotExistsReferrer_MemberServiceList(MemberServiceCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select service_rank_code from member_service where ...)} <br />
     * (会員サービス)member_service by service_rank_code, named 'memberServiceAsOne'.
     * @param subQuery The sub-query of MemberServiceList for 'in-scope'. (NotNull)
     */
    public void inScopeMemberServiceList(SubQuery<MemberServiceCB> subQuery) {
        assertObjectNotNull("subQuery<MemberServiceCB>", subQuery);
        MemberServiceCB cb = new MemberServiceCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepServiceRankCode_InScopeRelation_MemberServiceList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "service_rank_code", "service_rank_code", subQueryPropertyName, "memberServiceList");
    }
    public abstract String keepServiceRankCode_InScopeRelation_MemberServiceList(MemberServiceCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select service_rank_code from member_service where ...)} <br />
     * (会員サービス)member_service by service_rank_code, named 'memberServiceAsOne'.
     * @param subQuery The sub-query of MemberServiceList for 'not in-scope'. (NotNull)
     */
    public void notInScopeMemberServiceList(SubQuery<MemberServiceCB> subQuery) {
        assertObjectNotNull("subQuery<MemberServiceCB>", subQuery);
        MemberServiceCB cb = new MemberServiceCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepServiceRankCode_NotInScopeRelation_MemberServiceList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "service_rank_code", "service_rank_code", subQueryPropertyName, "memberServiceList");
    }
    public abstract String keepServiceRankCode_NotInScopeRelation_MemberServiceList(MemberServiceCQ subQuery);

    public void xsderiveMemberServiceList(String function, SubQuery<MemberServiceCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<MemberServiceCB>", subQuery);
        MemberServiceCB cb = new MemberServiceCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepServiceRankCode_SpecifyDerivedReferrer_MemberServiceList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "service_rank_code", "service_rank_code", subQueryPropertyName, "memberServiceList", aliasName, option);
    }
    public abstract String keepServiceRankCode_SpecifyDerivedReferrer_MemberServiceList(MemberServiceCQ subQuery);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from member_service where ...)} <br />
     * (会員サービス)member_service by service_rank_code, named 'memberServiceAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">derivedMemberServiceList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;MemberServiceCB&gt;() {
     *     public void query(MemberServiceCB subCB) {
     *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #FD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MemberServiceCB> derivedMemberServiceList() {
        return xcreateQDRFunctionMemberServiceList();
    }
    protected HpQDRFunction<MemberServiceCB> xcreateQDRFunctionMemberServiceList() {
        return new HpQDRFunction<MemberServiceCB>(new HpQDRSetupper<MemberServiceCB>() {
            public void setup(String function, SubQuery<MemberServiceCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMemberServiceList(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMemberServiceList(String function, SubQuery<MemberServiceCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<MemberServiceCB>", subQuery);
        MemberServiceCB cb = new MemberServiceCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepServiceRankCode_QueryDerivedReferrer_MemberServiceList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepServiceRankCode_QueryDerivedReferrer_MemberServiceListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "service_rank_code", "service_rank_code", subQueryPropertyName, "memberServiceList", operand, value, parameterPropertyName, option);
    }
    public abstract String keepServiceRankCode_QueryDerivedReferrer_MemberServiceList(MemberServiceCQ subQuery);
    public abstract String keepServiceRankCode_QueryDerivedReferrer_MemberServiceListParameter(Object parameterValue);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * (サービスランクコード)service_rank_code: {PK, NotNull, bpchar(3)}
     */
    public void setServiceRankCode_IsNull() { regServiceRankCode(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * (サービスランクコード)service_rank_code: {PK, NotNull, bpchar(3)}
     */
    public void setServiceRankCode_IsNotNull() { regServiceRankCode(CK_ISNN, DOBJ); }

    protected void regServiceRankCode(ConditionKey k, Object v) { regQ(k, v, getCValueServiceRankCode(), "service_rank_code"); }
    abstract protected ConditionValue getCValueServiceRankCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (サービスランク名称)service_rank_name: {NotNull, varchar(50)}
     * @param serviceRankName The value of serviceRankName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setServiceRankName_Equal(String serviceRankName) {
        doSetServiceRankName_Equal(fRES(serviceRankName));
    }

    protected void doSetServiceRankName_Equal(String serviceRankName) {
        regServiceRankName(CK_EQ, serviceRankName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (サービスランク名称)service_rank_name: {NotNull, varchar(50)}
     * @param serviceRankName The value of serviceRankName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setServiceRankName_NotEqual(String serviceRankName) {
        doSetServiceRankName_NotEqual(fRES(serviceRankName));
    }

    protected void doSetServiceRankName_NotEqual(String serviceRankName) {
        regServiceRankName(CK_NES, serviceRankName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (サービスランク名称)service_rank_name: {NotNull, varchar(50)}
     * @param serviceRankNameList The collection of serviceRankName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setServiceRankName_InScope(Collection<String> serviceRankNameList) {
        doSetServiceRankName_InScope(serviceRankNameList);
    }

    public void doSetServiceRankName_InScope(Collection<String> serviceRankNameList) {
        regINS(CK_INS, cTL(serviceRankNameList), getCValueServiceRankName(), "service_rank_name");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (サービスランク名称)service_rank_name: {NotNull, varchar(50)}
     * @param serviceRankNameList The collection of serviceRankName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setServiceRankName_NotInScope(Collection<String> serviceRankNameList) {
        doSetServiceRankName_NotInScope(serviceRankNameList);
    }

    public void doSetServiceRankName_NotInScope(Collection<String> serviceRankNameList) {
        regINS(CK_NINS, cTL(serviceRankNameList), getCValueServiceRankName(), "service_rank_name");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (サービスランク名称)service_rank_name: {NotNull, varchar(50)}
     * @param serviceRankName The value of serviceRankName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setServiceRankName_PrefixSearch(String serviceRankName) {
        setServiceRankName_LikeSearch(serviceRankName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (サービスランク名称)service_rank_name: {NotNull, varchar(50)} <br />
     * <pre>e.g. setServiceRankName_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param serviceRankName The value of serviceRankName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setServiceRankName_LikeSearch(String serviceRankName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(serviceRankName), getCValueServiceRankName(), "service_rank_name", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (サービスランク名称)service_rank_name: {NotNull, varchar(50)}
     * @param serviceRankName The value of serviceRankName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setServiceRankName_NotLikeSearch(String serviceRankName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(serviceRankName), getCValueServiceRankName(), "service_rank_name", likeSearchOption);
    }

    protected void regServiceRankName(ConditionKey k, Object v) { regQ(k, v, getCValueServiceRankName(), "service_rank_name"); }
    abstract protected ConditionValue getCValueServiceRankName();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (サービスポイント発生率)service_point_incidence: {NotNull, numeric(5, 3)}
     * @param servicePointIncidence The value of servicePointIncidence as equal. (NullAllowed: if null, no condition)
     */
    public void setServicePointIncidence_Equal(java.math.BigDecimal servicePointIncidence) {
        doSetServicePointIncidence_Equal(servicePointIncidence);
    }

    protected void doSetServicePointIncidence_Equal(java.math.BigDecimal servicePointIncidence) {
        regServicePointIncidence(CK_EQ, servicePointIncidence);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (サービスポイント発生率)service_point_incidence: {NotNull, numeric(5, 3)}
     * @param servicePointIncidence The value of servicePointIncidence as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setServicePointIncidence_GreaterThan(java.math.BigDecimal servicePointIncidence) {
        regServicePointIncidence(CK_GT, servicePointIncidence);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (サービスポイント発生率)service_point_incidence: {NotNull, numeric(5, 3)}
     * @param servicePointIncidence The value of servicePointIncidence as lessThan. (NullAllowed: if null, no condition)
     */
    public void setServicePointIncidence_LessThan(java.math.BigDecimal servicePointIncidence) {
        regServicePointIncidence(CK_LT, servicePointIncidence);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (サービスポイント発生率)service_point_incidence: {NotNull, numeric(5, 3)}
     * @param servicePointIncidence The value of servicePointIncidence as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setServicePointIncidence_GreaterEqual(java.math.BigDecimal servicePointIncidence) {
        regServicePointIncidence(CK_GE, servicePointIncidence);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (サービスポイント発生率)service_point_incidence: {NotNull, numeric(5, 3)}
     * @param servicePointIncidence The value of servicePointIncidence as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setServicePointIncidence_LessEqual(java.math.BigDecimal servicePointIncidence) {
        regServicePointIncidence(CK_LE, servicePointIncidence);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (サービスポイント発生率)service_point_incidence: {NotNull, numeric(5, 3)}
     * @param minNumber The min number of servicePointIncidence. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of servicePointIncidence. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setServicePointIncidence_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueServicePointIncidence(), "service_point_incidence", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (サービスポイント発生率)service_point_incidence: {NotNull, numeric(5, 3)}
     * @param servicePointIncidenceList The collection of servicePointIncidence as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setServicePointIncidence_InScope(Collection<java.math.BigDecimal> servicePointIncidenceList) {
        doSetServicePointIncidence_InScope(servicePointIncidenceList);
    }

    protected void doSetServicePointIncidence_InScope(Collection<java.math.BigDecimal> servicePointIncidenceList) {
        regINS(CK_INS, cTL(servicePointIncidenceList), getCValueServicePointIncidence(), "service_point_incidence");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (サービスポイント発生率)service_point_incidence: {NotNull, numeric(5, 3)}
     * @param servicePointIncidenceList The collection of servicePointIncidence as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setServicePointIncidence_NotInScope(Collection<java.math.BigDecimal> servicePointIncidenceList) {
        doSetServicePointIncidence_NotInScope(servicePointIncidenceList);
    }

    protected void doSetServicePointIncidence_NotInScope(Collection<java.math.BigDecimal> servicePointIncidenceList) {
        regINS(CK_NINS, cTL(servicePointIncidenceList), getCValueServicePointIncidence(), "service_point_incidence");
    }

    protected void regServicePointIncidence(ConditionKey k, Object v) { regQ(k, v, getCValueServicePointIncidence(), "service_point_incidence"); }
    abstract protected ConditionValue getCValueServicePointIncidence();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (新規受け入れ可能フラグ)new_acceptable_flg: {NotNull, int4(10), classification=Flg}
     * @param newAcceptableFlg The value of newAcceptableFlg as equal. (NullAllowed: if null, no condition)
     */
    protected void setNewAcceptableFlg_Equal(Integer newAcceptableFlg) {
        doSetNewAcceptableFlg_Equal(newAcceptableFlg);
    }

    /**
     * Equal(=). As Flg. And NullIgnored, OnlyOnceRegistered. <br />
     * (新規受け入れ可能フラグ)new_acceptable_flg: {NotNull, int4(10), classification=Flg} <br />
     * general boolean classification for every flg-column
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    public void setNewAcceptableFlg_Equal_AsFlg(CDef.Flg cdef) {
        doSetNewAcceptableFlg_Equal(cTNum(cdef != null ? cdef.code() : null, Integer.class));
    }

    /**
     * Equal(=). As True (1). And NullIgnored, OnlyOnceRegistered. <br />
     * Yes: means valid
     */
    public void setNewAcceptableFlg_Equal_True() {
        setNewAcceptableFlg_Equal_AsFlg(CDef.Flg.True);
    }

    /**
     * Equal(=). As False (0). And NullIgnored, OnlyOnceRegistered. <br />
     * No: means invalid
     */
    public void setNewAcceptableFlg_Equal_False() {
        setNewAcceptableFlg_Equal_AsFlg(CDef.Flg.False);
    }

    protected void doSetNewAcceptableFlg_Equal(Integer newAcceptableFlg) {
        regNewAcceptableFlg(CK_EQ, newAcceptableFlg);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (新規受け入れ可能フラグ)new_acceptable_flg: {NotNull, int4(10), classification=Flg}
     * @param newAcceptableFlgList The collection of newAcceptableFlg as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNewAcceptableFlg_InScope(Collection<Integer> newAcceptableFlgList) {
        doSetNewAcceptableFlg_InScope(newAcceptableFlgList);
    }

    /**
     * InScope {in (1, 2)}. As Flg. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (新規受け入れ可能フラグ)new_acceptable_flg: {NotNull, int4(10), classification=Flg} <br />
     * general boolean classification for every flg-column
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setNewAcceptableFlg_InScope_AsFlg(Collection<CDef.Flg> cdefList) {
        doSetNewAcceptableFlg_InScope(cTNumL(cdefList, Integer.class));
    }

    protected void doSetNewAcceptableFlg_InScope(Collection<Integer> newAcceptableFlgList) {
        regINS(CK_INS, cTL(newAcceptableFlgList), getCValueNewAcceptableFlg(), "new_acceptable_flg");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (新規受け入れ可能フラグ)new_acceptable_flg: {NotNull, int4(10), classification=Flg}
     * @param newAcceptableFlgList The collection of newAcceptableFlg as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNewAcceptableFlg_NotInScope(Collection<Integer> newAcceptableFlgList) {
        doSetNewAcceptableFlg_NotInScope(newAcceptableFlgList);
    }

    /**
     * NotInScope {not in (1, 2)}. As Flg. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (新規受け入れ可能フラグ)new_acceptable_flg: {NotNull, int4(10), classification=Flg} <br />
     * general boolean classification for every flg-column
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setNewAcceptableFlg_NotInScope_AsFlg(Collection<CDef.Flg> cdefList) {
        doSetNewAcceptableFlg_NotInScope(cTNumL(cdefList, Integer.class));
    }

    protected void doSetNewAcceptableFlg_NotInScope(Collection<Integer> newAcceptableFlgList) {
        regINS(CK_NINS, cTL(newAcceptableFlgList), getCValueNewAcceptableFlg(), "new_acceptable_flg");
    }

    protected void regNewAcceptableFlg(ConditionKey k, Object v) { regQ(k, v, getCValueNewAcceptableFlg(), "new_acceptable_flg"); }
    abstract protected ConditionValue getCValueNewAcceptableFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (説明)description: {NotNull, varchar(200)}
     * @param description The value of description as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setDescription_Equal(String description) {
        doSetDescription_Equal(fRES(description));
    }

    protected void doSetDescription_Equal(String description) {
        regDescription(CK_EQ, description);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (説明)description: {NotNull, varchar(200)}
     * @param description The value of description as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setDescription_NotEqual(String description) {
        doSetDescription_NotEqual(fRES(description));
    }

    protected void doSetDescription_NotEqual(String description) {
        regDescription(CK_NES, description);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (説明)description: {NotNull, varchar(200)}
     * @param descriptionList The collection of description as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDescription_InScope(Collection<String> descriptionList) {
        doSetDescription_InScope(descriptionList);
    }

    public void doSetDescription_InScope(Collection<String> descriptionList) {
        regINS(CK_INS, cTL(descriptionList), getCValueDescription(), "description");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (説明)description: {NotNull, varchar(200)}
     * @param descriptionList The collection of description as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDescription_NotInScope(Collection<String> descriptionList) {
        doSetDescription_NotInScope(descriptionList);
    }

    public void doSetDescription_NotInScope(Collection<String> descriptionList) {
        regINS(CK_NINS, cTL(descriptionList), getCValueDescription(), "description");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (説明)description: {NotNull, varchar(200)}
     * @param description The value of description as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setDescription_PrefixSearch(String description) {
        setDescription_LikeSearch(description, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (説明)description: {NotNull, varchar(200)} <br />
     * <pre>e.g. setDescription_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param description The value of description as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDescription_LikeSearch(String description, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(description), getCValueDescription(), "description", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (説明)description: {NotNull, varchar(200)}
     * @param description The value of description as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDescription_NotLikeSearch(String description, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(description), getCValueDescription(), "description", likeSearchOption);
    }

    protected void regDescription(ConditionKey k, Object v) { regQ(k, v, getCValueDescription(), "description"); }
    abstract protected ConditionValue getCValueDescription();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (表示順)display_order: {UQ, NotNull, int4(10)}
     * @param displayOrder The value of displayOrder as equal. (NullAllowed: if null, no condition)
     */
    public void setDisplayOrder_Equal(Integer displayOrder) {
        doSetDisplayOrder_Equal(displayOrder);
    }

    protected void doSetDisplayOrder_Equal(Integer displayOrder) {
        regDisplayOrder(CK_EQ, displayOrder);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (表示順)display_order: {UQ, NotNull, int4(10)}
     * @param displayOrder The value of displayOrder as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setDisplayOrder_GreaterThan(Integer displayOrder) {
        regDisplayOrder(CK_GT, displayOrder);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (表示順)display_order: {UQ, NotNull, int4(10)}
     * @param displayOrder The value of displayOrder as lessThan. (NullAllowed: if null, no condition)
     */
    public void setDisplayOrder_LessThan(Integer displayOrder) {
        regDisplayOrder(CK_LT, displayOrder);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (表示順)display_order: {UQ, NotNull, int4(10)}
     * @param displayOrder The value of displayOrder as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setDisplayOrder_GreaterEqual(Integer displayOrder) {
        regDisplayOrder(CK_GE, displayOrder);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (表示順)display_order: {UQ, NotNull, int4(10)}
     * @param displayOrder The value of displayOrder as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setDisplayOrder_LessEqual(Integer displayOrder) {
        regDisplayOrder(CK_LE, displayOrder);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (表示順)display_order: {UQ, NotNull, int4(10)}
     * @param minNumber The min number of displayOrder. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of displayOrder. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDisplayOrder_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueDisplayOrder(), "display_order", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (表示順)display_order: {UQ, NotNull, int4(10)}
     * @param displayOrderList The collection of displayOrder as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDisplayOrder_InScope(Collection<Integer> displayOrderList) {
        doSetDisplayOrder_InScope(displayOrderList);
    }

    protected void doSetDisplayOrder_InScope(Collection<Integer> displayOrderList) {
        regINS(CK_INS, cTL(displayOrderList), getCValueDisplayOrder(), "display_order");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (表示順)display_order: {UQ, NotNull, int4(10)}
     * @param displayOrderList The collection of displayOrder as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDisplayOrder_NotInScope(Collection<Integer> displayOrderList) {
        doSetDisplayOrder_NotInScope(displayOrderList);
    }

    protected void doSetDisplayOrder_NotInScope(Collection<Integer> displayOrderList) {
        regINS(CK_NINS, cTL(displayOrderList), getCValueDisplayOrder(), "display_order");
    }

    protected void regDisplayOrder(ConditionKey k, Object v) { regQ(k, v, getCValueDisplayOrder(), "display_order"); }
    abstract protected ConditionValue getCValueDisplayOrder();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;ServiceRankCB&gt;() {
     *     public void query(ServiceRankCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ServiceRankCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;ServiceRankCB&gt;() {
     *     public void query(ServiceRankCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ServiceRankCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;ServiceRankCB&gt;() {
     *     public void query(ServiceRankCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ServiceRankCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;ServiceRankCB&gt;() {
     *     public void query(ServiceRankCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ServiceRankCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;ServiceRankCB&gt;() {
     *     public void query(ServiceRankCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ServiceRankCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;ServiceRankCB&gt;() {
     *     public void query(ServiceRankCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ServiceRankCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<ServiceRankCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<ServiceRankCB>(new HpSSQSetupper<ServiceRankCB>() {
            public void setup(String function, SubQuery<ServiceRankCB> subQuery, HpSSQOption<ServiceRankCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<ServiceRankCB> subQuery, String operand, HpSSQOption<ServiceRankCB> option) {
        assertObjectNotNull("subQuery<ServiceRankCB>", subQuery);
        ServiceRankCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(ServiceRankCQ subQuery);

    protected ServiceRankCB xcreateScalarConditionCB() {
        ServiceRankCB cb = new ServiceRankCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected ServiceRankCB xcreateScalarConditionPartitionByCB() {
        ServiceRankCB cb = new ServiceRankCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<ServiceRankCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<ServiceRankCB>", subQuery);
        ServiceRankCB cb = new ServiceRankCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "service_rank_code", "service_rank_code", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(ServiceRankCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<ServiceRankCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<ServiceRankCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<ServiceRankCB>(new HpQDRSetupper<ServiceRankCB>() {
            public void setup(String function, SubQuery<ServiceRankCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<ServiceRankCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<ServiceRankCB>", subQuery);
        ServiceRankCB cb = new ServiceRankCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "service_rank_code", "service_rank_code", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(ServiceRankCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<ServiceRankCB> subQuery) {
        assertObjectNotNull("subQuery<ServiceRankCB>", subQuery);
        ServiceRankCB cb = new ServiceRankCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(ServiceRankCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<ServiceRankCB> subQuery) {
        assertObjectNotNull("subQuery<ServiceRankCB>", subQuery);
        ServiceRankCB cb = new ServiceRankCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(ServiceRankCQ subQuery);

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
    protected String xabCB() { return ServiceRankCB.class.getName(); }
    protected String xabCQ() { return ServiceRankCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
