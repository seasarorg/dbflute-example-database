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
 * The abstract condition-query of vendor_uuid_bar.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsVendorUuidBarCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsVendorUuidBarCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "vendor_uuid_bar";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * bar_id: {PK, NotNull, uuid(2147483647)}
     * @param barId The value of barId as equal. (NullAllowed: if null, no condition)
     */
    public void setBarId_Equal(java.util.UUID barId) {
        regBarId(CK_EQ, barId);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * bar_id: {PK, NotNull, uuid(2147483647)}
     * @param barIdList The collection of barId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setBarId_InScope(Collection<java.util.UUID> barIdList) {
        regINS(CK_INS, cTL(barIdList), getCValueBarId(), "bar_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * bar_id: {PK, NotNull, uuid(2147483647)}
     */
    public void setBarId_IsNull() { regBarId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * bar_id: {PK, NotNull, uuid(2147483647)}
     */
    public void setBarId_IsNotNull() { regBarId(CK_ISNN, DOBJ); }

    protected void regBarId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueBarId(), "bar_id"); }
    protected abstract ConditionValue getCValueBarId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * bar_name: {NotNull, varchar(2147483647)}
     * @param barName The value of barName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setBarName_Equal(String barName) {
        doSetBarName_Equal(fRES(barName));
    }

    protected void doSetBarName_Equal(String barName) {
        regBarName(CK_EQ, barName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * bar_name: {NotNull, varchar(2147483647)}
     * @param barName The value of barName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setBarName_NotEqual(String barName) {
        doSetBarName_NotEqual(fRES(barName));
    }

    protected void doSetBarName_NotEqual(String barName) {
        regBarName(CK_NES, barName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * bar_name: {NotNull, varchar(2147483647)}
     * @param barNameList The collection of barName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setBarName_InScope(Collection<String> barNameList) {
        doSetBarName_InScope(barNameList);
    }

    public void doSetBarName_InScope(Collection<String> barNameList) {
        regINS(CK_INS, cTL(barNameList), getCValueBarName(), "bar_name");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * bar_name: {NotNull, varchar(2147483647)}
     * @param barNameList The collection of barName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setBarName_NotInScope(Collection<String> barNameList) {
        doSetBarName_NotInScope(barNameList);
    }

    public void doSetBarName_NotInScope(Collection<String> barNameList) {
        regINS(CK_NINS, cTL(barNameList), getCValueBarName(), "bar_name");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * bar_name: {NotNull, varchar(2147483647)}
     * @param barName The value of barName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setBarName_PrefixSearch(String barName) {
        setBarName_LikeSearch(barName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * bar_name: {NotNull, varchar(2147483647)} <br />
     * <pre>e.g. setBarName_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param barName The value of barName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBarName_LikeSearch(String barName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(barName), getCValueBarName(), "bar_name", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * bar_name: {NotNull, varchar(2147483647)}
     * @param barName The value of barName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBarName_NotLikeSearch(String barName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(barName), getCValueBarName(), "bar_name", likeSearchOption);
    }

    protected void regBarName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueBarName(), "bar_name"); }
    protected abstract ConditionValue getCValueBarName();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;VendorUuidBarCB&gt;() {
     *     public void query(VendorUuidBarCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorUuidBarCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;VendorUuidBarCB&gt;() {
     *     public void query(VendorUuidBarCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorUuidBarCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;VendorUuidBarCB&gt;() {
     *     public void query(VendorUuidBarCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorUuidBarCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;VendorUuidBarCB&gt;() {
     *     public void query(VendorUuidBarCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorUuidBarCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;VendorUuidBarCB&gt;() {
     *     public void query(VendorUuidBarCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorUuidBarCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;VendorUuidBarCB&gt;() {
     *     public void query(VendorUuidBarCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorUuidBarCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<VendorUuidBarCB> xcreateSSQFunction(final String rd) {
        return new HpSSQFunction<VendorUuidBarCB>(new HpSSQSetupper<VendorUuidBarCB>() {
            public void setup(String fn, SubQuery<VendorUuidBarCB> sq, HpSSQOption<VendorUuidBarCB> op) {
                xscalarCondition(fn, sq, rd, op);
            }
        });
    }

    protected void xscalarCondition(String fn, SubQuery<VendorUuidBarCB> sq, String rd, HpSSQOption<VendorUuidBarCB> op) {
        assertObjectNotNull("subQuery", sq);
        VendorUuidBarCB cb = xcreateScalarConditionCB(); sq.query(cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(VendorUuidBarCQ sq);

    protected VendorUuidBarCB xcreateScalarConditionCB() {
        VendorUuidBarCB cb = new VendorUuidBarCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected VendorUuidBarCB xcreateScalarConditionPartitionByCB() {
        VendorUuidBarCB cb = new VendorUuidBarCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<VendorUuidBarCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorUuidBarCB cb = new VendorUuidBarCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String pk = "bar_id";
        String pp = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(VendorUuidBarCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<VendorUuidBarCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<VendorUuidBarCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<VendorUuidBarCB>(new HpQDRSetupper<VendorUuidBarCB>() {
            public void setup(String fn, SubQuery<VendorUuidBarCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveMyselfDerived(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveMyselfDerived(String fn, SubQuery<VendorUuidBarCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorUuidBarCB cb = new VendorUuidBarCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String pk = "bar_id";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(VendorUuidBarCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<VendorUuidBarCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        VendorUuidBarCB cb = new VendorUuidBarCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String pp = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(VendorUuidBarCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<VendorUuidBarCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        VendorUuidBarCB cb = new VendorUuidBarCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String pp = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(VendorUuidBarCQ sq);

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
    public void match(List<org.seasar.dbflute.dbmeta.info.ColumnInfo> textColumnList, String conditionValue) {
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
    protected String xabCB() { return VendorUuidBarCB.class.getName(); }
    protected String xabCQ() { return VendorUuidBarCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
