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
 * The abstract condition-query of vendor_uuid_foo.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsVendorUuidFooCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsVendorUuidFooCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "vendor_uuid_foo";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * foo_id: {PK, NotNull, uuid(2147483647)}
     * @param fooId The value of fooId as equal. (NullAllowed: if null, no condition)
     */
    public void setFooId_Equal(java.util.UUID fooId) {
        regFooId(CK_EQ, fooId);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * foo_id: {PK, NotNull, uuid(2147483647)}
     * @param fooIdList The collection of fooId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFooId_InScope(Collection<java.util.UUID> fooIdList) {
        regINS(CK_INS, cTL(fooIdList), getCValueFooId(), "foo_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * foo_id: {PK, NotNull, uuid(2147483647)}
     */
    public void setFooId_IsNull() { regFooId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * foo_id: {PK, NotNull, uuid(2147483647)}
     */
    public void setFooId_IsNotNull() { regFooId(CK_ISNN, DOBJ); }

    protected void regFooId(ConditionKey k, Object v) { regQ(k, v, getCValueFooId(), "foo_id"); }
    abstract protected ConditionValue getCValueFooId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * foo_name: {NotNull, varchar(2147483647)}
     * @param fooName The value of fooName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setFooName_Equal(String fooName) {
        doSetFooName_Equal(fRES(fooName));
    }

    protected void doSetFooName_Equal(String fooName) {
        regFooName(CK_EQ, fooName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * foo_name: {NotNull, varchar(2147483647)}
     * @param fooName The value of fooName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setFooName_NotEqual(String fooName) {
        doSetFooName_NotEqual(fRES(fooName));
    }

    protected void doSetFooName_NotEqual(String fooName) {
        regFooName(CK_NES, fooName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * foo_name: {NotNull, varchar(2147483647)}
     * @param fooNameList The collection of fooName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFooName_InScope(Collection<String> fooNameList) {
        doSetFooName_InScope(fooNameList);
    }

    public void doSetFooName_InScope(Collection<String> fooNameList) {
        regINS(CK_INS, cTL(fooNameList), getCValueFooName(), "foo_name");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * foo_name: {NotNull, varchar(2147483647)}
     * @param fooNameList The collection of fooName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFooName_NotInScope(Collection<String> fooNameList) {
        doSetFooName_NotInScope(fooNameList);
    }

    public void doSetFooName_NotInScope(Collection<String> fooNameList) {
        regINS(CK_NINS, cTL(fooNameList), getCValueFooName(), "foo_name");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * foo_name: {NotNull, varchar(2147483647)}
     * @param fooName The value of fooName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setFooName_PrefixSearch(String fooName) {
        setFooName_LikeSearch(fooName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * foo_name: {NotNull, varchar(2147483647)} <br />
     * <pre>e.g. setFooName_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fooName The value of fooName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFooName_LikeSearch(String fooName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fooName), getCValueFooName(), "foo_name", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * foo_name: {NotNull, varchar(2147483647)}
     * @param fooName The value of fooName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFooName_NotLikeSearch(String fooName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fooName), getCValueFooName(), "foo_name", likeSearchOption);
    }

    protected void regFooName(ConditionKey k, Object v) { regQ(k, v, getCValueFooName(), "foo_name"); }
    abstract protected ConditionValue getCValueFooName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * bar_id: {NotNull, uuid(2147483647), FK to vendor_uuid_bar}
     * @param barId The value of barId as equal. (NullAllowed: if null, no condition)
     */
    public void setBarId_Equal(java.util.UUID barId) {
        regBarId(CK_EQ, barId);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * bar_id: {NotNull, uuid(2147483647), FK to vendor_uuid_bar}
     * @param barIdList The collection of barId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setBarId_InScope(Collection<java.util.UUID> barIdList) {
        regINS(CK_INS, cTL(barIdList), getCValueBarId(), "bar_id");
    }

    protected void regBarId(ConditionKey k, Object v) { regQ(k, v, getCValueBarId(), "bar_id"); }
    abstract protected ConditionValue getCValueBarId();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;VendorUuidFooCB&gt;() {
     *     public void query(VendorUuidFooCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorUuidFooCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;VendorUuidFooCB&gt;() {
     *     public void query(VendorUuidFooCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorUuidFooCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;VendorUuidFooCB&gt;() {
     *     public void query(VendorUuidFooCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorUuidFooCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;VendorUuidFooCB&gt;() {
     *     public void query(VendorUuidFooCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorUuidFooCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;VendorUuidFooCB&gt;() {
     *     public void query(VendorUuidFooCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorUuidFooCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;VendorUuidFooCB&gt;() {
     *     public void query(VendorUuidFooCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorUuidFooCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<VendorUuidFooCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<VendorUuidFooCB>(new HpSSQSetupper<VendorUuidFooCB>() {
            public void setup(String function, SubQuery<VendorUuidFooCB> subQuery, HpSSQOption<VendorUuidFooCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<VendorUuidFooCB> subQuery, String operand, HpSSQOption<VendorUuidFooCB> option) {
        assertObjectNotNull("subQuery<VendorUuidFooCB>", subQuery);
        VendorUuidFooCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(VendorUuidFooCQ subQuery);

    protected VendorUuidFooCB xcreateScalarConditionCB() {
        VendorUuidFooCB cb = new VendorUuidFooCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected VendorUuidFooCB xcreateScalarConditionPartitionByCB() {
        VendorUuidFooCB cb = new VendorUuidFooCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<VendorUuidFooCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<VendorUuidFooCB>", subQuery);
        VendorUuidFooCB cb = new VendorUuidFooCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "foo_id", "foo_id", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(VendorUuidFooCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<VendorUuidFooCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<VendorUuidFooCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<VendorUuidFooCB>(new HpQDRSetupper<VendorUuidFooCB>() {
            public void setup(String function, SubQuery<VendorUuidFooCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<VendorUuidFooCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<VendorUuidFooCB>", subQuery);
        VendorUuidFooCB cb = new VendorUuidFooCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "foo_id", "foo_id", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(VendorUuidFooCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<VendorUuidFooCB> subQuery) {
        assertObjectNotNull("subQuery<VendorUuidFooCB>", subQuery);
        VendorUuidFooCB cb = new VendorUuidFooCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(VendorUuidFooCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<VendorUuidFooCB> subQuery) {
        assertObjectNotNull("subQuery<VendorUuidFooCB>", subQuery);
        VendorUuidFooCB cb = new VendorUuidFooCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(VendorUuidFooCQ subQuery);

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
    protected String xabCB() { return VendorUuidFooCB.class.getName(); }
    protected String xabCQ() { return VendorUuidFooCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
