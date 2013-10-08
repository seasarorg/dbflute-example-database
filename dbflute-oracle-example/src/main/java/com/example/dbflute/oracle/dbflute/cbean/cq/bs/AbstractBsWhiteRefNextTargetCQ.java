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
    public AbstractBsWhiteRefNextTargetCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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

    protected void regRefNextTargetId(ConditionKey k, Object v) { regQ(k, v, getCValueRefNextTargetId(), "REF_NEXT_TARGET_ID"); }
    abstract protected ConditionValue getCValueRefNextTargetId();

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
     * <pre>e.g. setNextTargetCode_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
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
        assertObjectNotNull("subQuery<NextSchemaProductStatusCB>", subQuery);
        NextSchemaProductStatusCB cb = new NextSchemaProductStatusCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepNextTargetCode_InScopeRelation_NextSchemaProductStatus(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "NEXT_TARGET_CODE", "PRODUCT_STATUS_CODE", subQueryPropertyName, "nextSchemaProductStatus");
    }
    public abstract String keepNextTargetCode_InScopeRelation_NextSchemaProductStatus(NextSchemaProductStatusCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select NEXT_TARGET_CODE from NEXT_SCHEMA_PRODUCT_STATUS where ...)} <br />
     * (隣のスキステ)NEXT_SCHEMA_PRODUCT_STATUS by my NEXT_TARGET_CODE, named 'nextSchemaProductStatus'.
     * @param subQuery The sub-query of NextSchemaProductStatus for 'not in-scope'. (NotNull)
     */
    public void notInScopeNextSchemaProductStatus(SubQuery<NextSchemaProductStatusCB> subQuery) {
        assertObjectNotNull("subQuery<NextSchemaProductStatusCB>", subQuery);
        NextSchemaProductStatusCB cb = new NextSchemaProductStatusCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepNextTargetCode_NotInScopeRelation_NextSchemaProductStatus(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "NEXT_TARGET_CODE", "PRODUCT_STATUS_CODE", subQueryPropertyName, "nextSchemaProductStatus");
    }
    public abstract String keepNextTargetCode_NotInScopeRelation_NextSchemaProductStatus(NextSchemaProductStatusCQ subQuery);

    protected void regNextTargetCode(ConditionKey k, Object v) { regQ(k, v, getCValueNextTargetCode(), "NEXT_TARGET_CODE"); }
    abstract protected ConditionValue getCValueNextTargetCode();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteRefNextTargetCB&gt;() {
     *     public void query(WhiteRefNextTargetCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteRefNextTargetCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteRefNextTargetCB&gt;() {
     *     public void query(WhiteRefNextTargetCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteRefNextTargetCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteRefNextTargetCB&gt;() {
     *     public void query(WhiteRefNextTargetCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteRefNextTargetCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteRefNextTargetCB&gt;() {
     *     public void query(WhiteRefNextTargetCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteRefNextTargetCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteRefNextTargetCB&gt;() {
     *     public void query(WhiteRefNextTargetCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteRefNextTargetCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteRefNextTargetCB&gt;() {
     *     public void query(WhiteRefNextTargetCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteRefNextTargetCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<WhiteRefNextTargetCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<WhiteRefNextTargetCB>(new HpSSQSetupper<WhiteRefNextTargetCB>() {
            public void setup(String function, SubQuery<WhiteRefNextTargetCB> subQuery, HpSSQOption<WhiteRefNextTargetCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<WhiteRefNextTargetCB> subQuery, String operand, HpSSQOption<WhiteRefNextTargetCB> option) {
        assertObjectNotNull("subQuery<WhiteRefNextTargetCB>", subQuery);
        WhiteRefNextTargetCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(WhiteRefNextTargetCQ subQuery);

    protected WhiteRefNextTargetCB xcreateScalarConditionCB() {
        WhiteRefNextTargetCB cb = new WhiteRefNextTargetCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected WhiteRefNextTargetCB xcreateScalarConditionPartitionByCB() {
        WhiteRefNextTargetCB cb = new WhiteRefNextTargetCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<WhiteRefNextTargetCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<WhiteRefNextTargetCB>", subQuery);
        WhiteRefNextTargetCB cb = new WhiteRefNextTargetCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "REF_NEXT_TARGET_ID", "REF_NEXT_TARGET_ID", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteRefNextTargetCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteRefNextTargetCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<WhiteRefNextTargetCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<WhiteRefNextTargetCB>(new HpQDRSetupper<WhiteRefNextTargetCB>() {
            public void setup(String function, SubQuery<WhiteRefNextTargetCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<WhiteRefNextTargetCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<WhiteRefNextTargetCB>", subQuery);
        WhiteRefNextTargetCB cb = new WhiteRefNextTargetCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "REF_NEXT_TARGET_ID", "REF_NEXT_TARGET_ID", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(WhiteRefNextTargetCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteRefNextTargetCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteRefNextTargetCB>", subQuery);
        WhiteRefNextTargetCB cb = new WhiteRefNextTargetCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(WhiteRefNextTargetCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteRefNextTargetCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteRefNextTargetCB>", subQuery);
        WhiteRefNextTargetCB cb = new WhiteRefNextTargetCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(WhiteRefNextTargetCQ subQuery);

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
    public void match(java.util.List<org.seasar.dbflute.dbmeta.info.ColumnInfo> textColumnList, String conditionValue) {
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
    protected String xabCB() { return WhiteRefNextTargetCB.class.getName(); }
    protected String xabCQ() { return WhiteRefNextTargetCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
