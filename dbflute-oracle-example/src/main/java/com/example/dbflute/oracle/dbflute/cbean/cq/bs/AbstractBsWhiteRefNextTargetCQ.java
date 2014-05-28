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
 * The abstract condition-query of WHITE_REF_NEXT_TARGET.
 * @author oracleman
 */
public abstract class AbstractBsWhiteRefNextTargetCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteRefNextTargetCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "WHITE_REF_NEXT_TARGET";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_NEXT_TARGET_ID: {PK, NotNull, NUMBER(16)}
     * @param refNextTargetId The value of refNextTargetId as equal. (NullAllowed: if null, no condition)
     */
    public void setRefNextTargetId_Equal(Long refNextTargetId) {
        doSetRefNextTargetId_Equal(refNextTargetId);
    }

    protected void doSetRefNextTargetId_Equal(Long refNextTargetId) {
        regRefNextTargetId(CK_EQ, refNextTargetId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_NEXT_TARGET_ID: {PK, NotNull, NUMBER(16)}
     * @param refNextTargetId The value of refNextTargetId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setRefNextTargetId_GreaterThan(Long refNextTargetId) {
        regRefNextTargetId(CK_GT, refNextTargetId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_NEXT_TARGET_ID: {PK, NotNull, NUMBER(16)}
     * @param refNextTargetId The value of refNextTargetId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setRefNextTargetId_LessThan(Long refNextTargetId) {
        regRefNextTargetId(CK_LT, refNextTargetId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_NEXT_TARGET_ID: {PK, NotNull, NUMBER(16)}
     * @param refNextTargetId The value of refNextTargetId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setRefNextTargetId_GreaterEqual(Long refNextTargetId) {
        regRefNextTargetId(CK_GE, refNextTargetId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_NEXT_TARGET_ID: {PK, NotNull, NUMBER(16)}
     * @param refNextTargetId The value of refNextTargetId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setRefNextTargetId_LessEqual(Long refNextTargetId) {
        regRefNextTargetId(CK_LE, refNextTargetId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * REF_NEXT_TARGET_ID: {PK, NotNull, NUMBER(16)}
     * @param minNumber The min number of refNextTargetId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of refNextTargetId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRefNextTargetId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueRefNextTargetId(), "REF_NEXT_TARGET_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * REF_NEXT_TARGET_ID: {PK, NotNull, NUMBER(16)}
     * @param refNextTargetIdList The collection of refNextTargetId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRefNextTargetId_InScope(Collection<Long> refNextTargetIdList) {
        doSetRefNextTargetId_InScope(refNextTargetIdList);
    }

    protected void doSetRefNextTargetId_InScope(Collection<Long> refNextTargetIdList) {
        regINS(CK_INS, cTL(refNextTargetIdList), getCValueRefNextTargetId(), "REF_NEXT_TARGET_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * REF_NEXT_TARGET_ID: {PK, NotNull, NUMBER(16)}
     * @param refNextTargetIdList The collection of refNextTargetId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRefNextTargetId_NotInScope(Collection<Long> refNextTargetIdList) {
        doSetRefNextTargetId_NotInScope(refNextTargetIdList);
    }

    protected void doSetRefNextTargetId_NotInScope(Collection<Long> refNextTargetIdList) {
        regINS(CK_NINS, cTL(refNextTargetIdList), getCValueRefNextTargetId(), "REF_NEXT_TARGET_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * REF_NEXT_TARGET_ID: {PK, NotNull, NUMBER(16)}
     */
    public void setRefNextTargetId_IsNull() { regRefNextTargetId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * REF_NEXT_TARGET_ID: {PK, NotNull, NUMBER(16)}
     */
    public void setRefNextTargetId_IsNotNull() { regRefNextTargetId(CK_ISNN, DOBJ); }

    protected void regRefNextTargetId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueRefNextTargetId(), "REF_NEXT_TARGET_ID"); }
    protected abstract ConditionValue getCValueRefNextTargetId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * NEXT_TARGET_CODE: {NotNull, CHAR(3), FK to NEXT_SCHEMA_PRODUCT_STATUS}
     * @param nextTargetCode The value of nextTargetCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setNextTargetCode_Equal(String nextTargetCode) {
        doSetNextTargetCode_Equal(fRES(nextTargetCode));
    }

    protected void doSetNextTargetCode_Equal(String nextTargetCode) {
        regNextTargetCode(CK_EQ, hSC("NEXT_TARGET_CODE", nextTargetCode, 3, "R"));
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * NEXT_TARGET_CODE: {NotNull, CHAR(3), FK to NEXT_SCHEMA_PRODUCT_STATUS}
     * @param nextTargetCode The value of nextTargetCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setNextTargetCode_NotEqual(String nextTargetCode) {
        doSetNextTargetCode_NotEqual(fRES(nextTargetCode));
    }

    protected void doSetNextTargetCode_NotEqual(String nextTargetCode) {
        regNextTargetCode(CK_NES, hSC("NEXT_TARGET_CODE", nextTargetCode, 3, "R"));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * NEXT_TARGET_CODE: {NotNull, CHAR(3), FK to NEXT_SCHEMA_PRODUCT_STATUS}
     * @param nextTargetCodeList The collection of nextTargetCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNextTargetCode_InScope(Collection<String> nextTargetCodeList) {
        doSetNextTargetCode_InScope(nextTargetCodeList);
    }

    public void doSetNextTargetCode_InScope(Collection<String> nextTargetCodeList) {
        regINS(CK_INS, cTL(nextTargetCodeList), getCValueNextTargetCode(), "NEXT_TARGET_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * NEXT_TARGET_CODE: {NotNull, CHAR(3), FK to NEXT_SCHEMA_PRODUCT_STATUS}
     * @param nextTargetCodeList The collection of nextTargetCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNextTargetCode_NotInScope(Collection<String> nextTargetCodeList) {
        doSetNextTargetCode_NotInScope(nextTargetCodeList);
    }

    public void doSetNextTargetCode_NotInScope(Collection<String> nextTargetCodeList) {
        regINS(CK_NINS, cTL(nextTargetCodeList), getCValueNextTargetCode(), "NEXT_TARGET_CODE");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * NEXT_TARGET_CODE: {NotNull, CHAR(3), FK to NEXT_SCHEMA_PRODUCT_STATUS}
     * @param nextTargetCode The value of nextTargetCode as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setNextTargetCode_PrefixSearch(String nextTargetCode) {
        setNextTargetCode_LikeSearch(nextTargetCode, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * NEXT_TARGET_CODE: {NotNull, CHAR(3), FK to NEXT_SCHEMA_PRODUCT_STATUS} <br />
     * <pre>e.g. setNextTargetCode_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param nextTargetCode The value of nextTargetCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNextTargetCode_LikeSearch(String nextTargetCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(nextTargetCode), getCValueNextTargetCode(), "NEXT_TARGET_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * NEXT_TARGET_CODE: {NotNull, CHAR(3), FK to NEXT_SCHEMA_PRODUCT_STATUS}
     * @param nextTargetCode The value of nextTargetCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNextTargetCode_NotLikeSearch(String nextTargetCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(nextTargetCode), getCValueNextTargetCode(), "NEXT_TARGET_CODE", likeSearchOption);
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select NEXT_TARGET_CODE from NEXT_SCHEMA_PRODUCT_STATUS where ...)} <br />
     * (隣のスキステ)NEXT_SCHEMA_PRODUCT_STATUS by my NEXT_TARGET_CODE, named 'nextSchemaProductStatus'.
     * @param subQuery The sub-query of NextSchemaProductStatus for 'in-scope'. (NotNull)
     */
    public void inScopeNextSchemaProductStatus(SubQuery<NextSchemaProductStatusCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        NextSchemaProductStatusCB cb = new NextSchemaProductStatusCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepNextTargetCode_InScopeRelation_NextSchemaProductStatus(cb.query());
        registerInScopeRelation(cb.query(), "NEXT_TARGET_CODE", "PRODUCT_STATUS_CODE", pp, "nextSchemaProductStatus");
    }
    public abstract String keepNextTargetCode_InScopeRelation_NextSchemaProductStatus(NextSchemaProductStatusCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select NEXT_TARGET_CODE from NEXT_SCHEMA_PRODUCT_STATUS where ...)} <br />
     * (隣のスキステ)NEXT_SCHEMA_PRODUCT_STATUS by my NEXT_TARGET_CODE, named 'nextSchemaProductStatus'.
     * @param subQuery The sub-query of NextSchemaProductStatus for 'not in-scope'. (NotNull)
     */
    public void notInScopeNextSchemaProductStatus(SubQuery<NextSchemaProductStatusCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        NextSchemaProductStatusCB cb = new NextSchemaProductStatusCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepNextTargetCode_NotInScopeRelation_NextSchemaProductStatus(cb.query());
        registerNotInScopeRelation(cb.query(), "NEXT_TARGET_CODE", "PRODUCT_STATUS_CODE", pp, "nextSchemaProductStatus");
    }
    public abstract String keepNextTargetCode_NotInScopeRelation_NextSchemaProductStatus(NextSchemaProductStatusCQ sq);

    protected void regNextTargetCode(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueNextTargetCode(), "NEXT_TARGET_CODE"); }
    protected abstract ConditionValue getCValueNextTargetCode();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteRefNextTargetCB&gt;() {
     *     public void query(WhiteRefNextTargetCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteRefNextTargetCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand(), WhiteRefNextTargetCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteRefNextTargetCB&gt;() {
     *     public void query(WhiteRefNextTargetCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteRefNextTargetCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand(), WhiteRefNextTargetCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteRefNextTargetCB&gt;() {
     *     public void query(WhiteRefNextTargetCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteRefNextTargetCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand(), WhiteRefNextTargetCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteRefNextTargetCB&gt;() {
     *     public void query(WhiteRefNextTargetCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteRefNextTargetCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand(), WhiteRefNextTargetCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteRefNextTargetCB&gt;() {
     *     public void query(WhiteRefNextTargetCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteRefNextTargetCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand(), WhiteRefNextTargetCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteRefNextTargetCB&gt;() {
     *     public void query(WhiteRefNextTargetCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteRefNextTargetCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand(), WhiteRefNextTargetCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WhiteRefNextTargetCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhiteRefNextTargetCQ sq);

    protected WhiteRefNextTargetCB xcreateScalarConditionCB() {
        WhiteRefNextTargetCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteRefNextTargetCB xcreateScalarConditionPartitionByCB() {
        WhiteRefNextTargetCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteRefNextTargetCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteRefNextTargetCB cb = new WhiteRefNextTargetCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "REF_NEXT_TARGET_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteRefNextTargetCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteRefNextTargetCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteRefNextTargetCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteRefNextTargetCB cb = new WhiteRefNextTargetCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "REF_NEXT_TARGET_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteRefNextTargetCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteRefNextTargetCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteRefNextTargetCB cb = new WhiteRefNextTargetCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteRefNextTargetCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteRefNextTargetCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteRefNextTargetCB cb = new WhiteRefNextTargetCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(WhiteRefNextTargetCQ sq);

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
    protected WhiteRefNextTargetCB newMyCB() {
        return new WhiteRefNextTargetCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return WhiteRefNextTargetCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
