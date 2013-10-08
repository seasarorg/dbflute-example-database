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
 * The abstract condition-query of WHITE_REF_NEXT_EXCEPT.
 * @author oracleman
 */
public abstract class AbstractBsWhiteRefNextExceptCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteRefNextExceptCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "WHITE_REF_NEXT_EXCEPT";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_NEXT_EXCEPT_ID: {PK, NotNull, NUMBER(16)}
     * @param refNextExceptId The value of refNextExceptId as equal. (NullAllowed: if null, no condition)
     */
    public void setRefNextExceptId_Equal(Long refNextExceptId) {
        doSetRefNextExceptId_Equal(refNextExceptId);
    }

    protected void doSetRefNextExceptId_Equal(Long refNextExceptId) {
        regRefNextExceptId(CK_EQ, refNextExceptId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_NEXT_EXCEPT_ID: {PK, NotNull, NUMBER(16)}
     * @param refNextExceptId The value of refNextExceptId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setRefNextExceptId_GreaterThan(Long refNextExceptId) {
        regRefNextExceptId(CK_GT, refNextExceptId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_NEXT_EXCEPT_ID: {PK, NotNull, NUMBER(16)}
     * @param refNextExceptId The value of refNextExceptId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setRefNextExceptId_LessThan(Long refNextExceptId) {
        regRefNextExceptId(CK_LT, refNextExceptId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_NEXT_EXCEPT_ID: {PK, NotNull, NUMBER(16)}
     * @param refNextExceptId The value of refNextExceptId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setRefNextExceptId_GreaterEqual(Long refNextExceptId) {
        regRefNextExceptId(CK_GE, refNextExceptId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_NEXT_EXCEPT_ID: {PK, NotNull, NUMBER(16)}
     * @param refNextExceptId The value of refNextExceptId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setRefNextExceptId_LessEqual(Long refNextExceptId) {
        regRefNextExceptId(CK_LE, refNextExceptId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * REF_NEXT_EXCEPT_ID: {PK, NotNull, NUMBER(16)}
     * @param minNumber The min number of refNextExceptId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of refNextExceptId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRefNextExceptId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueRefNextExceptId(), "REF_NEXT_EXCEPT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * REF_NEXT_EXCEPT_ID: {PK, NotNull, NUMBER(16)}
     * @param refNextExceptIdList The collection of refNextExceptId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRefNextExceptId_InScope(Collection<Long> refNextExceptIdList) {
        doSetRefNextExceptId_InScope(refNextExceptIdList);
    }

    protected void doSetRefNextExceptId_InScope(Collection<Long> refNextExceptIdList) {
        regINS(CK_INS, cTL(refNextExceptIdList), getCValueRefNextExceptId(), "REF_NEXT_EXCEPT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * REF_NEXT_EXCEPT_ID: {PK, NotNull, NUMBER(16)}
     * @param refNextExceptIdList The collection of refNextExceptId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRefNextExceptId_NotInScope(Collection<Long> refNextExceptIdList) {
        doSetRefNextExceptId_NotInScope(refNextExceptIdList);
    }

    protected void doSetRefNextExceptId_NotInScope(Collection<Long> refNextExceptIdList) {
        regINS(CK_NINS, cTL(refNextExceptIdList), getCValueRefNextExceptId(), "REF_NEXT_EXCEPT_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * REF_NEXT_EXCEPT_ID: {PK, NotNull, NUMBER(16)}
     */
    public void setRefNextExceptId_IsNull() { regRefNextExceptId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * REF_NEXT_EXCEPT_ID: {PK, NotNull, NUMBER(16)}
     */
    public void setRefNextExceptId_IsNotNull() { regRefNextExceptId(CK_ISNN, DOBJ); }

    protected void regRefNextExceptId(ConditionKey k, Object v) { regQ(k, v, getCValueRefNextExceptId(), "REF_NEXT_EXCEPT_ID"); }
    abstract protected ConditionValue getCValueRefNextExceptId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * NEXT_EXCEPT_CODE: {NotNull, CHAR(3)}
     * @param nextExceptCode The value of nextExceptCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setNextExceptCode_Equal(String nextExceptCode) {
        doSetNextExceptCode_Equal(fRES(nextExceptCode));
    }

    protected void doSetNextExceptCode_Equal(String nextExceptCode) {
        regNextExceptCode(CK_EQ, hSC("NEXT_EXCEPT_CODE", nextExceptCode, 3, "R"));
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * NEXT_EXCEPT_CODE: {NotNull, CHAR(3)}
     * @param nextExceptCode The value of nextExceptCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setNextExceptCode_NotEqual(String nextExceptCode) {
        doSetNextExceptCode_NotEqual(fRES(nextExceptCode));
    }

    protected void doSetNextExceptCode_NotEqual(String nextExceptCode) {
        regNextExceptCode(CK_NES, hSC("NEXT_EXCEPT_CODE", nextExceptCode, 3, "R"));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * NEXT_EXCEPT_CODE: {NotNull, CHAR(3)}
     * @param nextExceptCodeList The collection of nextExceptCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNextExceptCode_InScope(Collection<String> nextExceptCodeList) {
        doSetNextExceptCode_InScope(nextExceptCodeList);
    }

    public void doSetNextExceptCode_InScope(Collection<String> nextExceptCodeList) {
        regINS(CK_INS, cTL(nextExceptCodeList), getCValueNextExceptCode(), "NEXT_EXCEPT_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * NEXT_EXCEPT_CODE: {NotNull, CHAR(3)}
     * @param nextExceptCodeList The collection of nextExceptCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNextExceptCode_NotInScope(Collection<String> nextExceptCodeList) {
        doSetNextExceptCode_NotInScope(nextExceptCodeList);
    }

    public void doSetNextExceptCode_NotInScope(Collection<String> nextExceptCodeList) {
        regINS(CK_NINS, cTL(nextExceptCodeList), getCValueNextExceptCode(), "NEXT_EXCEPT_CODE");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * NEXT_EXCEPT_CODE: {NotNull, CHAR(3)}
     * @param nextExceptCode The value of nextExceptCode as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setNextExceptCode_PrefixSearch(String nextExceptCode) {
        setNextExceptCode_LikeSearch(nextExceptCode, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * NEXT_EXCEPT_CODE: {NotNull, CHAR(3)} <br />
     * <pre>e.g. setNextExceptCode_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param nextExceptCode The value of nextExceptCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNextExceptCode_LikeSearch(String nextExceptCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(nextExceptCode), getCValueNextExceptCode(), "NEXT_EXCEPT_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * NEXT_EXCEPT_CODE: {NotNull, CHAR(3)}
     * @param nextExceptCode The value of nextExceptCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNextExceptCode_NotLikeSearch(String nextExceptCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(nextExceptCode), getCValueNextExceptCode(), "NEXT_EXCEPT_CODE", likeSearchOption);
    }

    protected void regNextExceptCode(ConditionKey k, Object v) { regQ(k, v, getCValueNextExceptCode(), "NEXT_EXCEPT_CODE"); }
    abstract protected ConditionValue getCValueNextExceptCode();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteRefNextExceptCB&gt;() {
     *     public void query(WhiteRefNextExceptCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteRefNextExceptCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteRefNextExceptCB&gt;() {
     *     public void query(WhiteRefNextExceptCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteRefNextExceptCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteRefNextExceptCB&gt;() {
     *     public void query(WhiteRefNextExceptCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteRefNextExceptCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteRefNextExceptCB&gt;() {
     *     public void query(WhiteRefNextExceptCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteRefNextExceptCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteRefNextExceptCB&gt;() {
     *     public void query(WhiteRefNextExceptCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteRefNextExceptCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteRefNextExceptCB&gt;() {
     *     public void query(WhiteRefNextExceptCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteRefNextExceptCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<WhiteRefNextExceptCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<WhiteRefNextExceptCB>(new HpSSQSetupper<WhiteRefNextExceptCB>() {
            public void setup(String function, SubQuery<WhiteRefNextExceptCB> subQuery, HpSSQOption<WhiteRefNextExceptCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<WhiteRefNextExceptCB> subQuery, String operand, HpSSQOption<WhiteRefNextExceptCB> option) {
        assertObjectNotNull("subQuery<WhiteRefNextExceptCB>", subQuery);
        WhiteRefNextExceptCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(WhiteRefNextExceptCQ subQuery);

    protected WhiteRefNextExceptCB xcreateScalarConditionCB() {
        WhiteRefNextExceptCB cb = new WhiteRefNextExceptCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected WhiteRefNextExceptCB xcreateScalarConditionPartitionByCB() {
        WhiteRefNextExceptCB cb = new WhiteRefNextExceptCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<WhiteRefNextExceptCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<WhiteRefNextExceptCB>", subQuery);
        WhiteRefNextExceptCB cb = new WhiteRefNextExceptCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "REF_NEXT_EXCEPT_ID", "REF_NEXT_EXCEPT_ID", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteRefNextExceptCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteRefNextExceptCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<WhiteRefNextExceptCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<WhiteRefNextExceptCB>(new HpQDRSetupper<WhiteRefNextExceptCB>() {
            public void setup(String function, SubQuery<WhiteRefNextExceptCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<WhiteRefNextExceptCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<WhiteRefNextExceptCB>", subQuery);
        WhiteRefNextExceptCB cb = new WhiteRefNextExceptCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "REF_NEXT_EXCEPT_ID", "REF_NEXT_EXCEPT_ID", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(WhiteRefNextExceptCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteRefNextExceptCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteRefNextExceptCB>", subQuery);
        WhiteRefNextExceptCB cb = new WhiteRefNextExceptCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(WhiteRefNextExceptCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteRefNextExceptCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteRefNextExceptCB>", subQuery);
        WhiteRefNextExceptCB cb = new WhiteRefNextExceptCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(WhiteRefNextExceptCQ subQuery);

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
    protected String xabCB() { return WhiteRefNextExceptCB.class.getName(); }
    protected String xabCQ() { return WhiteRefNextExceptCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
