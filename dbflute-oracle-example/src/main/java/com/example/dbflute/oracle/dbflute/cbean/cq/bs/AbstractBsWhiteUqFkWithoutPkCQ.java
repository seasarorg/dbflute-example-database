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
 * The abstract condition-query of WHITE_UQ_FK_WITHOUT_PK.
 * @author oracleman
 */
public abstract class AbstractBsWhiteUqFkWithoutPkCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteUqFkWithoutPkCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "WHITE_UQ_FK_WITHOUT_PK";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

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
     * {exists (select FK_TO_UQ_CODE from WHITE_UQ_FK_WITHOUT_PK_REF where ...)} <br />
     * WHITE_UQ_FK_WITHOUT_PK_REF by FK_TO_UQ_CODE, named 'whiteUqFkWithoutPkRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">existsWhiteUqFkWithoutPkRefList</span>(new SubQuery&lt;WhiteUqFkWithoutPkRefCB&gt;() {
     *     public void query(WhiteUqFkWithoutPkRefCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of WhiteUqFkWithoutPkRefList for 'exists'. (NotNull)
     */
    public void existsWhiteUqFkWithoutPkRefList(SubQuery<WhiteUqFkWithoutPkRefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteUqFkWithoutPkRefCB cb = new WhiteUqFkWithoutPkRefCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepUqFkCode_ExistsReferrer_WhiteUqFkWithoutPkRefList(cb.query());
        registerExistsReferrer(cb.query(), "UQ_FK_CODE", "FK_TO_UQ_CODE", pp, "whiteUqFkWithoutPkRefList");
    }
    public abstract String keepUqFkCode_ExistsReferrer_WhiteUqFkWithoutPkRefList(WhiteUqFkWithoutPkRefCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select FK_TO_UQ_CODE from WHITE_UQ_FK_WITHOUT_PK_REF where ...)} <br />
     * WHITE_UQ_FK_WITHOUT_PK_REF by FK_TO_UQ_CODE, named 'whiteUqFkWithoutPkRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">notExistsWhiteUqFkWithoutPkRefList</span>(new SubQuery&lt;WhiteUqFkWithoutPkRefCB&gt;() {
     *     public void query(WhiteUqFkWithoutPkRefCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of UqFkCode_NotExistsReferrer_WhiteUqFkWithoutPkRefList for 'not exists'. (NotNull)
     */
    public void notExistsWhiteUqFkWithoutPkRefList(SubQuery<WhiteUqFkWithoutPkRefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteUqFkWithoutPkRefCB cb = new WhiteUqFkWithoutPkRefCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepUqFkCode_NotExistsReferrer_WhiteUqFkWithoutPkRefList(cb.query());
        registerNotExistsReferrer(cb.query(), "UQ_FK_CODE", "FK_TO_UQ_CODE", pp, "whiteUqFkWithoutPkRefList");
    }
    public abstract String keepUqFkCode_NotExistsReferrer_WhiteUqFkWithoutPkRefList(WhiteUqFkWithoutPkRefCQ sq);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select FK_TO_UQ_CODE from WHITE_UQ_FK_WITHOUT_PK_REF where ...)} <br />
     * WHITE_UQ_FK_WITHOUT_PK_REF by FK_TO_UQ_CODE, named 'whiteUqFkWithoutPkRefAsOne'.
     * @param subQuery The sub-query of WhiteUqFkWithoutPkRefList for 'in-scope'. (NotNull)
     */
    public void inScopeWhiteUqFkWithoutPkRefList(SubQuery<WhiteUqFkWithoutPkRefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteUqFkWithoutPkRefCB cb = new WhiteUqFkWithoutPkRefCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepUqFkCode_InScopeRelation_WhiteUqFkWithoutPkRefList(cb.query());
        registerInScopeRelation(cb.query(), "UQ_FK_CODE", "FK_TO_UQ_CODE", pp, "whiteUqFkWithoutPkRefList");
    }
    public abstract String keepUqFkCode_InScopeRelation_WhiteUqFkWithoutPkRefList(WhiteUqFkWithoutPkRefCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select FK_TO_UQ_CODE from WHITE_UQ_FK_WITHOUT_PK_REF where ...)} <br />
     * WHITE_UQ_FK_WITHOUT_PK_REF by FK_TO_UQ_CODE, named 'whiteUqFkWithoutPkRefAsOne'.
     * @param subQuery The sub-query of WhiteUqFkWithoutPkRefList for 'not in-scope'. (NotNull)
     */
    public void notInScopeWhiteUqFkWithoutPkRefList(SubQuery<WhiteUqFkWithoutPkRefCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteUqFkWithoutPkRefCB cb = new WhiteUqFkWithoutPkRefCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepUqFkCode_NotInScopeRelation_WhiteUqFkWithoutPkRefList(cb.query());
        registerNotInScopeRelation(cb.query(), "UQ_FK_CODE", "FK_TO_UQ_CODE", pp, "whiteUqFkWithoutPkRefList");
    }
    public abstract String keepUqFkCode_NotInScopeRelation_WhiteUqFkWithoutPkRefList(WhiteUqFkWithoutPkRefCQ sq);

    public void xsderiveWhiteUqFkWithoutPkRefList(String fn, SubQuery<WhiteUqFkWithoutPkRefCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteUqFkWithoutPkRefCB cb = new WhiteUqFkWithoutPkRefCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepUqFkCode_SpecifyDerivedReferrer_WhiteUqFkWithoutPkRefList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "UQ_FK_CODE", "FK_TO_UQ_CODE", pp, "whiteUqFkWithoutPkRefList", al, op);
    }
    public abstract String keepUqFkCode_SpecifyDerivedReferrer_WhiteUqFkWithoutPkRefList(WhiteUqFkWithoutPkRefCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from WHITE_UQ_FK_WITHOUT_PK_REF where ...)} <br />
     * WHITE_UQ_FK_WITHOUT_PK_REF by FK_TO_UQ_CODE, named 'whiteUqFkWithoutPkRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">derivedWhiteUqFkWithoutPkRefList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;WhiteUqFkWithoutPkRefCB&gt;() {
     *     public void query(WhiteUqFkWithoutPkRefCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #DD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WhiteUqFkWithoutPkRefCB> derivedWhiteUqFkWithoutPkRefList() {
        return xcreateQDRFunctionWhiteUqFkWithoutPkRefList();
    }
    protected HpQDRFunction<WhiteUqFkWithoutPkRefCB> xcreateQDRFunctionWhiteUqFkWithoutPkRefList() {
        return new HpQDRFunction<WhiteUqFkWithoutPkRefCB>(new HpQDRSetupper<WhiteUqFkWithoutPkRefCB>() {
            public void setup(String fn, SubQuery<WhiteUqFkWithoutPkRefCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveWhiteUqFkWithoutPkRefList(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveWhiteUqFkWithoutPkRefList(String fn, SubQuery<WhiteUqFkWithoutPkRefCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteUqFkWithoutPkRefCB cb = new WhiteUqFkWithoutPkRefCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String sqpp = keepUqFkCode_QueryDerivedReferrer_WhiteUqFkWithoutPkRefList(cb.query()); String prpp = keepUqFkCode_QueryDerivedReferrer_WhiteUqFkWithoutPkRefListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "UQ_FK_CODE", "FK_TO_UQ_CODE", sqpp, "whiteUqFkWithoutPkRefList", rd, vl, prpp, op);
    }
    public abstract String keepUqFkCode_QueryDerivedReferrer_WhiteUqFkWithoutPkRefList(WhiteUqFkWithoutPkRefCQ sq);
    public abstract String keepUqFkCode_QueryDerivedReferrer_WhiteUqFkWithoutPkRefListParameter(Object vl);

    protected void regUqFkCode(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueUqFkCode(), "UQ_FK_CODE"); }
    protected abstract ConditionValue getCValueUqFkCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * UQ_FK_NAME: {NotNull, VARCHAR2(64)}
     * @param uqFkName The value of uqFkName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setUqFkName_Equal(String uqFkName) {
        doSetUqFkName_Equal(fRES(uqFkName));
    }

    protected void doSetUqFkName_Equal(String uqFkName) {
        regUqFkName(CK_EQ, uqFkName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * UQ_FK_NAME: {NotNull, VARCHAR2(64)}
     * @param uqFkName The value of uqFkName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUqFkName_NotEqual(String uqFkName) {
        doSetUqFkName_NotEqual(fRES(uqFkName));
    }

    protected void doSetUqFkName_NotEqual(String uqFkName) {
        regUqFkName(CK_NES, uqFkName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * UQ_FK_NAME: {NotNull, VARCHAR2(64)}
     * @param uqFkNameList The collection of uqFkName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUqFkName_InScope(Collection<String> uqFkNameList) {
        doSetUqFkName_InScope(uqFkNameList);
    }

    public void doSetUqFkName_InScope(Collection<String> uqFkNameList) {
        regINS(CK_INS, cTL(uqFkNameList), getCValueUqFkName(), "UQ_FK_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * UQ_FK_NAME: {NotNull, VARCHAR2(64)}
     * @param uqFkNameList The collection of uqFkName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUqFkName_NotInScope(Collection<String> uqFkNameList) {
        doSetUqFkName_NotInScope(uqFkNameList);
    }

    public void doSetUqFkName_NotInScope(Collection<String> uqFkNameList) {
        regINS(CK_NINS, cTL(uqFkNameList), getCValueUqFkName(), "UQ_FK_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * UQ_FK_NAME: {NotNull, VARCHAR2(64)}
     * @param uqFkName The value of uqFkName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setUqFkName_PrefixSearch(String uqFkName) {
        setUqFkName_LikeSearch(uqFkName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * UQ_FK_NAME: {NotNull, VARCHAR2(64)} <br />
     * <pre>e.g. setUqFkName_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param uqFkName The value of uqFkName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUqFkName_LikeSearch(String uqFkName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(uqFkName), getCValueUqFkName(), "UQ_FK_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * UQ_FK_NAME: {NotNull, VARCHAR2(64)}
     * @param uqFkName The value of uqFkName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUqFkName_NotLikeSearch(String uqFkName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(uqFkName), getCValueUqFkName(), "UQ_FK_NAME", likeSearchOption);
    }

    protected void regUqFkName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueUqFkName(), "UQ_FK_NAME"); }
    protected abstract ConditionValue getCValueUqFkName();

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
    protected WhiteUqFkWithoutPkCB newMyCB() {
        return new WhiteUqFkWithoutPkCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return WhiteUqFkWithoutPkCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
