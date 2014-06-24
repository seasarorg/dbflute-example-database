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
 * The abstract condition-query of SYNONYM_NEXT_LINK_SECRET.
 * @author oracleman
 */
public abstract class AbstractBsSynonymNextLinkSecretCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsSynonymNextLinkSecretCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "SYNONYM_NEXT_LINK_SECRET";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * SECRET_CODE: {PK, NotNull, CHAR(3)}
     * @param secretCode The value of secretCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setSecretCode_Equal(String secretCode) {
        doSetSecretCode_Equal(fRES(secretCode));
    }

    protected void doSetSecretCode_Equal(String secretCode) {
        regSecretCode(CK_EQ, hSC("SECRET_CODE", secretCode, 3, "R"));
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * SECRET_CODE: {PK, NotNull, CHAR(3)}
     * @param secretCode The value of secretCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setSecretCode_NotEqual(String secretCode) {
        doSetSecretCode_NotEqual(fRES(secretCode));
    }

    protected void doSetSecretCode_NotEqual(String secretCode) {
        regSecretCode(CK_NES, hSC("SECRET_CODE", secretCode, 3, "R"));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * SECRET_CODE: {PK, NotNull, CHAR(3)}
     * @param secretCodeList The collection of secretCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSecretCode_InScope(Collection<String> secretCodeList) {
        doSetSecretCode_InScope(secretCodeList);
    }

    public void doSetSecretCode_InScope(Collection<String> secretCodeList) {
        regINS(CK_INS, cTL(secretCodeList), getCValueSecretCode(), "SECRET_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * SECRET_CODE: {PK, NotNull, CHAR(3)}
     * @param secretCodeList The collection of secretCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSecretCode_NotInScope(Collection<String> secretCodeList) {
        doSetSecretCode_NotInScope(secretCodeList);
    }

    public void doSetSecretCode_NotInScope(Collection<String> secretCodeList) {
        regINS(CK_NINS, cTL(secretCodeList), getCValueSecretCode(), "SECRET_CODE");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * SECRET_CODE: {PK, NotNull, CHAR(3)}
     * @param secretCode The value of secretCode as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setSecretCode_PrefixSearch(String secretCode) {
        setSecretCode_LikeSearch(secretCode, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * SECRET_CODE: {PK, NotNull, CHAR(3)} <br />
     * <pre>e.g. setSecretCode_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param secretCode The value of secretCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSecretCode_LikeSearch(String secretCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(secretCode), getCValueSecretCode(), "SECRET_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * SECRET_CODE: {PK, NotNull, CHAR(3)}
     * @param secretCode The value of secretCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSecretCode_NotLikeSearch(String secretCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(secretCode), getCValueSecretCode(), "SECRET_CODE", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * SECRET_CODE: {PK, NotNull, CHAR(3)}
     */
    public void setSecretCode_IsNull() { regSecretCode(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * SECRET_CODE: {PK, NotNull, CHAR(3)}
     */
    public void setSecretCode_IsNotNull() { regSecretCode(CK_ISNN, DOBJ); }

    protected void regSecretCode(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueSecretCode(), "SECRET_CODE"); }
    protected abstract ConditionValue getCValueSecretCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * SECRET_NAME: {UQ, NotNull, VARCHAR2(50)}
     * @param secretName The value of secretName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setSecretName_Equal(String secretName) {
        doSetSecretName_Equal(fRES(secretName));
    }

    protected void doSetSecretName_Equal(String secretName) {
        regSecretName(CK_EQ, secretName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * SECRET_NAME: {UQ, NotNull, VARCHAR2(50)}
     * @param secretName The value of secretName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setSecretName_NotEqual(String secretName) {
        doSetSecretName_NotEqual(fRES(secretName));
    }

    protected void doSetSecretName_NotEqual(String secretName) {
        regSecretName(CK_NES, secretName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * SECRET_NAME: {UQ, NotNull, VARCHAR2(50)}
     * @param secretNameList The collection of secretName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSecretName_InScope(Collection<String> secretNameList) {
        doSetSecretName_InScope(secretNameList);
    }

    public void doSetSecretName_InScope(Collection<String> secretNameList) {
        regINS(CK_INS, cTL(secretNameList), getCValueSecretName(), "SECRET_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * SECRET_NAME: {UQ, NotNull, VARCHAR2(50)}
     * @param secretNameList The collection of secretName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSecretName_NotInScope(Collection<String> secretNameList) {
        doSetSecretName_NotInScope(secretNameList);
    }

    public void doSetSecretName_NotInScope(Collection<String> secretNameList) {
        regINS(CK_NINS, cTL(secretNameList), getCValueSecretName(), "SECRET_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * SECRET_NAME: {UQ, NotNull, VARCHAR2(50)}
     * @param secretName The value of secretName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setSecretName_PrefixSearch(String secretName) {
        setSecretName_LikeSearch(secretName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * SECRET_NAME: {UQ, NotNull, VARCHAR2(50)} <br />
     * <pre>e.g. setSecretName_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param secretName The value of secretName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSecretName_LikeSearch(String secretName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(secretName), getCValueSecretName(), "SECRET_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * SECRET_NAME: {UQ, NotNull, VARCHAR2(50)}
     * @param secretName The value of secretName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSecretName_NotLikeSearch(String secretName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(secretName), getCValueSecretName(), "SECRET_NAME", likeSearchOption);
    }

    protected void regSecretName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueSecretName(), "SECRET_NAME"); }
    protected abstract ConditionValue getCValueSecretName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * SECRET_AUTH_CODE: {CHAR(3)}
     * @param secretAuthCode The value of secretAuthCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setSecretAuthCode_Equal(String secretAuthCode) {
        doSetSecretAuthCode_Equal(fRES(secretAuthCode));
    }

    protected void doSetSecretAuthCode_Equal(String secretAuthCode) {
        regSecretAuthCode(CK_EQ, hSC("SECRET_AUTH_CODE", secretAuthCode, 3, "R"));
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * SECRET_AUTH_CODE: {CHAR(3)}
     * @param secretAuthCode The value of secretAuthCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setSecretAuthCode_NotEqual(String secretAuthCode) {
        doSetSecretAuthCode_NotEqual(fRES(secretAuthCode));
    }

    protected void doSetSecretAuthCode_NotEqual(String secretAuthCode) {
        regSecretAuthCode(CK_NES, hSC("SECRET_AUTH_CODE", secretAuthCode, 3, "R"));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * SECRET_AUTH_CODE: {CHAR(3)}
     * @param secretAuthCodeList The collection of secretAuthCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSecretAuthCode_InScope(Collection<String> secretAuthCodeList) {
        doSetSecretAuthCode_InScope(secretAuthCodeList);
    }

    public void doSetSecretAuthCode_InScope(Collection<String> secretAuthCodeList) {
        regINS(CK_INS, cTL(secretAuthCodeList), getCValueSecretAuthCode(), "SECRET_AUTH_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * SECRET_AUTH_CODE: {CHAR(3)}
     * @param secretAuthCodeList The collection of secretAuthCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSecretAuthCode_NotInScope(Collection<String> secretAuthCodeList) {
        doSetSecretAuthCode_NotInScope(secretAuthCodeList);
    }

    public void doSetSecretAuthCode_NotInScope(Collection<String> secretAuthCodeList) {
        regINS(CK_NINS, cTL(secretAuthCodeList), getCValueSecretAuthCode(), "SECRET_AUTH_CODE");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * SECRET_AUTH_CODE: {CHAR(3)}
     * @param secretAuthCode The value of secretAuthCode as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setSecretAuthCode_PrefixSearch(String secretAuthCode) {
        setSecretAuthCode_LikeSearch(secretAuthCode, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * SECRET_AUTH_CODE: {CHAR(3)} <br />
     * <pre>e.g. setSecretAuthCode_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param secretAuthCode The value of secretAuthCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSecretAuthCode_LikeSearch(String secretAuthCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(secretAuthCode), getCValueSecretAuthCode(), "SECRET_AUTH_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * SECRET_AUTH_CODE: {CHAR(3)}
     * @param secretAuthCode The value of secretAuthCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSecretAuthCode_NotLikeSearch(String secretAuthCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(secretAuthCode), getCValueSecretAuthCode(), "SECRET_AUTH_CODE", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * SECRET_AUTH_CODE: {CHAR(3)}
     */
    public void setSecretAuthCode_IsNull() { regSecretAuthCode(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * SECRET_AUTH_CODE: {CHAR(3)}
     */
    public void setSecretAuthCode_IsNullOrEmpty() { regSecretAuthCode(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * SECRET_AUTH_CODE: {CHAR(3)}
     */
    public void setSecretAuthCode_IsNotNull() { regSecretAuthCode(CK_ISNN, DOBJ); }

    protected void regSecretAuthCode(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueSecretAuthCode(), "SECRET_AUTH_CODE"); }
    protected abstract ConditionValue getCValueSecretAuthCode();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;SynonymNextLinkSecretCB&gt;() {
     *     public void query(SynonymNextLinkSecretCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<SynonymNextLinkSecretCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, SynonymNextLinkSecretCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;SynonymNextLinkSecretCB&gt;() {
     *     public void query(SynonymNextLinkSecretCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<SynonymNextLinkSecretCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, SynonymNextLinkSecretCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;SynonymNextLinkSecretCB&gt;() {
     *     public void query(SynonymNextLinkSecretCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<SynonymNextLinkSecretCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, SynonymNextLinkSecretCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;SynonymNextLinkSecretCB&gt;() {
     *     public void query(SynonymNextLinkSecretCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<SynonymNextLinkSecretCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, SynonymNextLinkSecretCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;SynonymNextLinkSecretCB&gt;() {
     *     public void query(SynonymNextLinkSecretCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<SynonymNextLinkSecretCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, SynonymNextLinkSecretCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;SynonymNextLinkSecretCB&gt;() {
     *     public void query(SynonymNextLinkSecretCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<SynonymNextLinkSecretCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, SynonymNextLinkSecretCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        SynonymNextLinkSecretCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(SynonymNextLinkSecretCQ sq);

    protected SynonymNextLinkSecretCB xcreateScalarConditionCB() {
        SynonymNextLinkSecretCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected SynonymNextLinkSecretCB xcreateScalarConditionPartitionByCB() {
        SynonymNextLinkSecretCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<SynonymNextLinkSecretCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        SynonymNextLinkSecretCB cb = new SynonymNextLinkSecretCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "SECRET_CODE";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(SynonymNextLinkSecretCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<SynonymNextLinkSecretCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(SynonymNextLinkSecretCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        SynonymNextLinkSecretCB cb = new SynonymNextLinkSecretCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "SECRET_CODE";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(SynonymNextLinkSecretCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<SynonymNextLinkSecretCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        SynonymNextLinkSecretCB cb = new SynonymNextLinkSecretCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(SynonymNextLinkSecretCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfInScope(SubQuery<SynonymNextLinkSecretCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        SynonymNextLinkSecretCB cb = new SynonymNextLinkSecretCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(SynonymNextLinkSecretCQ sq);

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
    protected SynonymNextLinkSecretCB newMyCB() {
        return new SynonymNextLinkSecretCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return SynonymNextLinkSecretCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
