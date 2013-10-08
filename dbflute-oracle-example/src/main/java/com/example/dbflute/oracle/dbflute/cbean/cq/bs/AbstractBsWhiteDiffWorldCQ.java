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
 * The abstract condition-query of WHITE_DIFF_WORLD.
 * @author oracleman
 */
public abstract class AbstractBsWhiteDiffWorldCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteDiffWorldCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "WHITE_DIFF_WORLD";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * DIFF_WORLD_ID: {PK, NotNull, NUMBER(16)}
     * @param diffWorldId The value of diffWorldId as equal. (NullAllowed: if null, no condition)
     */
    public void setDiffWorldId_Equal(Long diffWorldId) {
        doSetDiffWorldId_Equal(diffWorldId);
    }

    protected void doSetDiffWorldId_Equal(Long diffWorldId) {
        regDiffWorldId(CK_EQ, diffWorldId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * DIFF_WORLD_ID: {PK, NotNull, NUMBER(16)}
     * @param diffWorldId The value of diffWorldId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setDiffWorldId_GreaterThan(Long diffWorldId) {
        regDiffWorldId(CK_GT, diffWorldId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * DIFF_WORLD_ID: {PK, NotNull, NUMBER(16)}
     * @param diffWorldId The value of diffWorldId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setDiffWorldId_LessThan(Long diffWorldId) {
        regDiffWorldId(CK_LT, diffWorldId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * DIFF_WORLD_ID: {PK, NotNull, NUMBER(16)}
     * @param diffWorldId The value of diffWorldId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setDiffWorldId_GreaterEqual(Long diffWorldId) {
        regDiffWorldId(CK_GE, diffWorldId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * DIFF_WORLD_ID: {PK, NotNull, NUMBER(16)}
     * @param diffWorldId The value of diffWorldId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setDiffWorldId_LessEqual(Long diffWorldId) {
        regDiffWorldId(CK_LE, diffWorldId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * DIFF_WORLD_ID: {PK, NotNull, NUMBER(16)}
     * @param minNumber The min number of diffWorldId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of diffWorldId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDiffWorldId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueDiffWorldId(), "DIFF_WORLD_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * DIFF_WORLD_ID: {PK, NotNull, NUMBER(16)}
     * @param diffWorldIdList The collection of diffWorldId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDiffWorldId_InScope(Collection<Long> diffWorldIdList) {
        doSetDiffWorldId_InScope(diffWorldIdList);
    }

    protected void doSetDiffWorldId_InScope(Collection<Long> diffWorldIdList) {
        regINS(CK_INS, cTL(diffWorldIdList), getCValueDiffWorldId(), "DIFF_WORLD_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * DIFF_WORLD_ID: {PK, NotNull, NUMBER(16)}
     * @param diffWorldIdList The collection of diffWorldId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDiffWorldId_NotInScope(Collection<Long> diffWorldIdList) {
        doSetDiffWorldId_NotInScope(diffWorldIdList);
    }

    protected void doSetDiffWorldId_NotInScope(Collection<Long> diffWorldIdList) {
        regINS(CK_NINS, cTL(diffWorldIdList), getCValueDiffWorldId(), "DIFF_WORLD_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * DIFF_WORLD_ID: {PK, NotNull, NUMBER(16)}
     */
    public void setDiffWorldId_IsNull() { regDiffWorldId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * DIFF_WORLD_ID: {PK, NotNull, NUMBER(16)}
     */
    public void setDiffWorldId_IsNotNull() { regDiffWorldId(CK_ISNN, DOBJ); }

    protected void regDiffWorldId(ConditionKey k, Object v) { regQ(k, v, getCValueDiffWorldId(), "DIFF_WORLD_ID"); }
    abstract protected ConditionValue getCValueDiffWorldId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * DIFF_WORLD_NAME: {NotNull, VARCHAR2(50)}
     * @param diffWorldName The value of diffWorldName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setDiffWorldName_Equal(String diffWorldName) {
        doSetDiffWorldName_Equal(fRES(diffWorldName));
    }

    protected void doSetDiffWorldName_Equal(String diffWorldName) {
        regDiffWorldName(CK_EQ, diffWorldName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * DIFF_WORLD_NAME: {NotNull, VARCHAR2(50)}
     * @param diffWorldName The value of diffWorldName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setDiffWorldName_NotEqual(String diffWorldName) {
        doSetDiffWorldName_NotEqual(fRES(diffWorldName));
    }

    protected void doSetDiffWorldName_NotEqual(String diffWorldName) {
        regDiffWorldName(CK_NES, diffWorldName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * DIFF_WORLD_NAME: {NotNull, VARCHAR2(50)}
     * @param diffWorldNameList The collection of diffWorldName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDiffWorldName_InScope(Collection<String> diffWorldNameList) {
        doSetDiffWorldName_InScope(diffWorldNameList);
    }

    public void doSetDiffWorldName_InScope(Collection<String> diffWorldNameList) {
        regINS(CK_INS, cTL(diffWorldNameList), getCValueDiffWorldName(), "DIFF_WORLD_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * DIFF_WORLD_NAME: {NotNull, VARCHAR2(50)}
     * @param diffWorldNameList The collection of diffWorldName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDiffWorldName_NotInScope(Collection<String> diffWorldNameList) {
        doSetDiffWorldName_NotInScope(diffWorldNameList);
    }

    public void doSetDiffWorldName_NotInScope(Collection<String> diffWorldNameList) {
        regINS(CK_NINS, cTL(diffWorldNameList), getCValueDiffWorldName(), "DIFF_WORLD_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * DIFF_WORLD_NAME: {NotNull, VARCHAR2(50)}
     * @param diffWorldName The value of diffWorldName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setDiffWorldName_PrefixSearch(String diffWorldName) {
        setDiffWorldName_LikeSearch(diffWorldName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * DIFF_WORLD_NAME: {NotNull, VARCHAR2(50)} <br />
     * <pre>e.g. setDiffWorldName_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param diffWorldName The value of diffWorldName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDiffWorldName_LikeSearch(String diffWorldName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(diffWorldName), getCValueDiffWorldName(), "DIFF_WORLD_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * DIFF_WORLD_NAME: {NotNull, VARCHAR2(50)}
     * @param diffWorldName The value of diffWorldName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDiffWorldName_NotLikeSearch(String diffWorldName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(diffWorldName), getCValueDiffWorldName(), "DIFF_WORLD_NAME", likeSearchOption);
    }

    protected void regDiffWorldName(ConditionKey k, Object v) { regQ(k, v, getCValueDiffWorldName(), "DIFF_WORLD_NAME"); }
    abstract protected ConditionValue getCValueDiffWorldName();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteDiffWorldCB&gt;() {
     *     public void query(WhiteDiffWorldCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteDiffWorldCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteDiffWorldCB&gt;() {
     *     public void query(WhiteDiffWorldCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteDiffWorldCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteDiffWorldCB&gt;() {
     *     public void query(WhiteDiffWorldCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteDiffWorldCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteDiffWorldCB&gt;() {
     *     public void query(WhiteDiffWorldCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteDiffWorldCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteDiffWorldCB&gt;() {
     *     public void query(WhiteDiffWorldCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteDiffWorldCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteDiffWorldCB&gt;() {
     *     public void query(WhiteDiffWorldCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteDiffWorldCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<WhiteDiffWorldCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<WhiteDiffWorldCB>(new HpSSQSetupper<WhiteDiffWorldCB>() {
            public void setup(String function, SubQuery<WhiteDiffWorldCB> subQuery, HpSSQOption<WhiteDiffWorldCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<WhiteDiffWorldCB> subQuery, String operand, HpSSQOption<WhiteDiffWorldCB> option) {
        assertObjectNotNull("subQuery<WhiteDiffWorldCB>", subQuery);
        WhiteDiffWorldCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(WhiteDiffWorldCQ subQuery);

    protected WhiteDiffWorldCB xcreateScalarConditionCB() {
        WhiteDiffWorldCB cb = new WhiteDiffWorldCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected WhiteDiffWorldCB xcreateScalarConditionPartitionByCB() {
        WhiteDiffWorldCB cb = new WhiteDiffWorldCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<WhiteDiffWorldCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<WhiteDiffWorldCB>", subQuery);
        WhiteDiffWorldCB cb = new WhiteDiffWorldCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "DIFF_WORLD_ID", "DIFF_WORLD_ID", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteDiffWorldCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteDiffWorldCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<WhiteDiffWorldCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<WhiteDiffWorldCB>(new HpQDRSetupper<WhiteDiffWorldCB>() {
            public void setup(String function, SubQuery<WhiteDiffWorldCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<WhiteDiffWorldCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<WhiteDiffWorldCB>", subQuery);
        WhiteDiffWorldCB cb = new WhiteDiffWorldCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "DIFF_WORLD_ID", "DIFF_WORLD_ID", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(WhiteDiffWorldCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteDiffWorldCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteDiffWorldCB>", subQuery);
        WhiteDiffWorldCB cb = new WhiteDiffWorldCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(WhiteDiffWorldCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteDiffWorldCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteDiffWorldCB>", subQuery);
        WhiteDiffWorldCB cb = new WhiteDiffWorldCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(WhiteDiffWorldCQ subQuery);

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
    protected String xabCB() { return WhiteDiffWorldCB.class.getName(); }
    protected String xabCQ() { return WhiteDiffWorldCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
