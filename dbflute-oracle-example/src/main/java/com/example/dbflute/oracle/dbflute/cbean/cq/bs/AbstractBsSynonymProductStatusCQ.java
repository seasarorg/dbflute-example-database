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
 * The abstract condition-query of SYNONYM_PRODUCT_STATUS.
 * @author oracleman
 */
public abstract class AbstractBsSynonymProductStatusCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsSynonymProductStatusCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "SYNONYM_PRODUCT_STATUS";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3)}
     * @param productStatusCode The value of productStatusCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductStatusCode_Equal(String productStatusCode) {
        doSetProductStatusCode_Equal(fRES(productStatusCode));
    }

    protected void doSetProductStatusCode_Equal(String productStatusCode) {
        regProductStatusCode(CK_EQ, hSC("PRODUCT_STATUS_CODE", productStatusCode, 3, "R"));
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3)}
     * @param productStatusCode The value of productStatusCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductStatusCode_NotEqual(String productStatusCode) {
        doSetProductStatusCode_NotEqual(fRES(productStatusCode));
    }

    protected void doSetProductStatusCode_NotEqual(String productStatusCode) {
        regProductStatusCode(CK_NES, hSC("PRODUCT_STATUS_CODE", productStatusCode, 3, "R"));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3)}
     * @param productStatusCodeList The collection of productStatusCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductStatusCode_InScope(Collection<String> productStatusCodeList) {
        doSetProductStatusCode_InScope(productStatusCodeList);
    }

    public void doSetProductStatusCode_InScope(Collection<String> productStatusCodeList) {
        regINS(CK_INS, cTL(productStatusCodeList), getCValueProductStatusCode(), "PRODUCT_STATUS_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3)}
     * @param productStatusCodeList The collection of productStatusCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductStatusCode_NotInScope(Collection<String> productStatusCodeList) {
        doSetProductStatusCode_NotInScope(productStatusCodeList);
    }

    public void doSetProductStatusCode_NotInScope(Collection<String> productStatusCodeList) {
        regINS(CK_NINS, cTL(productStatusCodeList), getCValueProductStatusCode(), "PRODUCT_STATUS_CODE");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3)}
     * @param productStatusCode The value of productStatusCode as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductStatusCode_PrefixSearch(String productStatusCode) {
        setProductStatusCode_LikeSearch(productStatusCode, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3)} <br />
     * <pre>e.g. setProductStatusCode_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productStatusCode The value of productStatusCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductStatusCode_LikeSearch(String productStatusCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productStatusCode), getCValueProductStatusCode(), "PRODUCT_STATUS_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3)}
     * @param productStatusCode The value of productStatusCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductStatusCode_NotLikeSearch(String productStatusCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productStatusCode), getCValueProductStatusCode(), "PRODUCT_STATUS_CODE", likeSearchOption);
    }

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select PRODUCT_STATUS_CODE from SYNONYM_PRODUCT where ...)} <br />
     * (商品)SYNONYM_PRODUCT by PRODUCT_STATUS_CODE, named 'synonymProductAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsSynonymProductList</span>(new SubQuery&lt;SynonymProductCB&gt;() {
     *     public void query(SynonymProductCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of SynonymProductList for 'exists'. (NotNull)
     */
    public void existsSynonymProductList(SubQuery<SynonymProductCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        SynonymProductCB cb = new SynonymProductCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String pp = keepProductStatusCode_ExistsReferrer_SynonymProductList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "PRODUCT_STATUS_CODE", "PRODUCT_STATUS_CODE", pp, "synonymProductList");
    }
    public abstract String keepProductStatusCode_ExistsReferrer_SynonymProductList(SynonymProductCQ sq);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select PRODUCT_STATUS_CODE from SYNONYM_PRODUCT where ...)} <br />
     * (商品)SYNONYM_PRODUCT by PRODUCT_STATUS_CODE, named 'synonymProductAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsSynonymProductList</span>(new SubQuery&lt;SynonymProductCB&gt;() {
     *     public void query(SynonymProductCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of ProductStatusCode_NotExistsReferrer_SynonymProductList for 'not exists'. (NotNull)
     */
    public void notExistsSynonymProductList(SubQuery<SynonymProductCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        SynonymProductCB cb = new SynonymProductCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String pp = keepProductStatusCode_NotExistsReferrer_SynonymProductList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "PRODUCT_STATUS_CODE", "PRODUCT_STATUS_CODE", pp, "synonymProductList");
    }
    public abstract String keepProductStatusCode_NotExistsReferrer_SynonymProductList(SynonymProductCQ sq);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PRODUCT_STATUS_CODE from SYNONYM_PRODUCT where ...)} <br />
     * (商品)SYNONYM_PRODUCT by PRODUCT_STATUS_CODE, named 'synonymProductAsOne'.
     * @param subQuery The sub-query of SynonymProductList for 'in-scope'. (NotNull)
     */
    public void inScopeSynonymProductList(SubQuery<SynonymProductCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        SynonymProductCB cb = new SynonymProductCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepProductStatusCode_InScopeRelation_SynonymProductList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "PRODUCT_STATUS_CODE", "PRODUCT_STATUS_CODE", pp, "synonymProductList");
    }
    public abstract String keepProductStatusCode_InScopeRelation_SynonymProductList(SynonymProductCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PRODUCT_STATUS_CODE from SYNONYM_PRODUCT where ...)} <br />
     * (商品)SYNONYM_PRODUCT by PRODUCT_STATUS_CODE, named 'synonymProductAsOne'.
     * @param subQuery The sub-query of SynonymProductList for 'not in-scope'. (NotNull)
     */
    public void notInScopeSynonymProductList(SubQuery<SynonymProductCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        SynonymProductCB cb = new SynonymProductCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepProductStatusCode_NotInScopeRelation_SynonymProductList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "PRODUCT_STATUS_CODE", "PRODUCT_STATUS_CODE", pp, "synonymProductList");
    }
    public abstract String keepProductStatusCode_NotInScopeRelation_SynonymProductList(SynonymProductCQ sq);

    public void xsderiveSynonymProductList(String fn, SubQuery<SynonymProductCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        SynonymProductCB cb = new SynonymProductCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String pp = keepProductStatusCode_SpecifyDerivedReferrer_SynonymProductList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_STATUS_CODE", "PRODUCT_STATUS_CODE", pp, "synonymProductList", al, op);
    }
    public abstract String keepProductStatusCode_SpecifyDerivedReferrer_SynonymProductList(SynonymProductCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from SYNONYM_PRODUCT where ...)} <br />
     * (商品)SYNONYM_PRODUCT by PRODUCT_STATUS_CODE, named 'synonymProductAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">derivedSynonymProductList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;SynonymProductCB&gt;() {
     *     public void query(SynonymProductCB subCB) {
     *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #FD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<SynonymProductCB> derivedSynonymProductList() {
        return xcreateQDRFunctionSynonymProductList();
    }
    protected HpQDRFunction<SynonymProductCB> xcreateQDRFunctionSynonymProductList() {
        return new HpQDRFunction<SynonymProductCB>(new HpQDRSetupper<SynonymProductCB>() {
            public void setup(String fn, SubQuery<SynonymProductCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveSynonymProductList(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveSynonymProductList(String fn, SubQuery<SynonymProductCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        SynonymProductCB cb = new SynonymProductCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String sqpp = keepProductStatusCode_QueryDerivedReferrer_SynonymProductList(cb.query()); // for saving query-value.
        String prpp = keepProductStatusCode_QueryDerivedReferrer_SynonymProductListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_STATUS_CODE", "PRODUCT_STATUS_CODE", sqpp, "synonymProductList", rd, vl, prpp, op);
    }
    public abstract String keepProductStatusCode_QueryDerivedReferrer_SynonymProductList(SynonymProductCQ sq);
    public abstract String keepProductStatusCode_QueryDerivedReferrer_SynonymProductListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3)}
     */
    public void setProductStatusCode_IsNull() { regProductStatusCode(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3)}
     */
    public void setProductStatusCode_IsNotNull() { regProductStatusCode(CK_ISNN, DOBJ); }

    protected void regProductStatusCode(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueProductStatusCode(), "PRODUCT_STATUS_CODE"); }
    protected abstract ConditionValue getCValueProductStatusCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * PRODUCT_STATUS_NAME: {UQ, NotNull, VARCHAR2(50)}
     * @param productStatusName The value of productStatusName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductStatusName_Equal(String productStatusName) {
        doSetProductStatusName_Equal(fRES(productStatusName));
    }

    protected void doSetProductStatusName_Equal(String productStatusName) {
        regProductStatusName(CK_EQ, productStatusName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * PRODUCT_STATUS_NAME: {UQ, NotNull, VARCHAR2(50)}
     * @param productStatusName The value of productStatusName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductStatusName_NotEqual(String productStatusName) {
        doSetProductStatusName_NotEqual(fRES(productStatusName));
    }

    protected void doSetProductStatusName_NotEqual(String productStatusName) {
        regProductStatusName(CK_NES, productStatusName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * PRODUCT_STATUS_NAME: {UQ, NotNull, VARCHAR2(50)}
     * @param productStatusNameList The collection of productStatusName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductStatusName_InScope(Collection<String> productStatusNameList) {
        doSetProductStatusName_InScope(productStatusNameList);
    }

    public void doSetProductStatusName_InScope(Collection<String> productStatusNameList) {
        regINS(CK_INS, cTL(productStatusNameList), getCValueProductStatusName(), "PRODUCT_STATUS_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * PRODUCT_STATUS_NAME: {UQ, NotNull, VARCHAR2(50)}
     * @param productStatusNameList The collection of productStatusName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductStatusName_NotInScope(Collection<String> productStatusNameList) {
        doSetProductStatusName_NotInScope(productStatusNameList);
    }

    public void doSetProductStatusName_NotInScope(Collection<String> productStatusNameList) {
        regINS(CK_NINS, cTL(productStatusNameList), getCValueProductStatusName(), "PRODUCT_STATUS_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PRODUCT_STATUS_NAME: {UQ, NotNull, VARCHAR2(50)}
     * @param productStatusName The value of productStatusName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductStatusName_PrefixSearch(String productStatusName) {
        setProductStatusName_LikeSearch(productStatusName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PRODUCT_STATUS_NAME: {UQ, NotNull, VARCHAR2(50)} <br />
     * <pre>e.g. setProductStatusName_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productStatusName The value of productStatusName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductStatusName_LikeSearch(String productStatusName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productStatusName), getCValueProductStatusName(), "PRODUCT_STATUS_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PRODUCT_STATUS_NAME: {UQ, NotNull, VARCHAR2(50)}
     * @param productStatusName The value of productStatusName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductStatusName_NotLikeSearch(String productStatusName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productStatusName), getCValueProductStatusName(), "PRODUCT_STATUS_NAME", likeSearchOption);
    }

    protected void regProductStatusName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueProductStatusName(), "PRODUCT_STATUS_NAME"); }
    protected abstract ConditionValue getCValueProductStatusName();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * DISPLAY_ORDER: {NotNull, NUMBER(22)}
     * @param displayOrder The value of displayOrder as equal. (NullAllowed: if null, no condition)
     */
    public void setDisplayOrder_Equal(java.math.BigDecimal displayOrder) {
        doSetDisplayOrder_Equal(displayOrder);
    }

    protected void doSetDisplayOrder_Equal(java.math.BigDecimal displayOrder) {
        regDisplayOrder(CK_EQ, displayOrder);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * DISPLAY_ORDER: {NotNull, NUMBER(22)}
     * @param displayOrder The value of displayOrder as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setDisplayOrder_GreaterThan(java.math.BigDecimal displayOrder) {
        regDisplayOrder(CK_GT, displayOrder);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * DISPLAY_ORDER: {NotNull, NUMBER(22)}
     * @param displayOrder The value of displayOrder as lessThan. (NullAllowed: if null, no condition)
     */
    public void setDisplayOrder_LessThan(java.math.BigDecimal displayOrder) {
        regDisplayOrder(CK_LT, displayOrder);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * DISPLAY_ORDER: {NotNull, NUMBER(22)}
     * @param displayOrder The value of displayOrder as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setDisplayOrder_GreaterEqual(java.math.BigDecimal displayOrder) {
        regDisplayOrder(CK_GE, displayOrder);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * DISPLAY_ORDER: {NotNull, NUMBER(22)}
     * @param displayOrder The value of displayOrder as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setDisplayOrder_LessEqual(java.math.BigDecimal displayOrder) {
        regDisplayOrder(CK_LE, displayOrder);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * DISPLAY_ORDER: {NotNull, NUMBER(22)}
     * @param minNumber The min number of displayOrder. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of displayOrder. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDisplayOrder_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueDisplayOrder(), "DISPLAY_ORDER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * DISPLAY_ORDER: {NotNull, NUMBER(22)}
     * @param displayOrderList The collection of displayOrder as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDisplayOrder_InScope(Collection<java.math.BigDecimal> displayOrderList) {
        doSetDisplayOrder_InScope(displayOrderList);
    }

    protected void doSetDisplayOrder_InScope(Collection<java.math.BigDecimal> displayOrderList) {
        regINS(CK_INS, cTL(displayOrderList), getCValueDisplayOrder(), "DISPLAY_ORDER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * DISPLAY_ORDER: {NotNull, NUMBER(22)}
     * @param displayOrderList The collection of displayOrder as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDisplayOrder_NotInScope(Collection<java.math.BigDecimal> displayOrderList) {
        doSetDisplayOrder_NotInScope(displayOrderList);
    }

    protected void doSetDisplayOrder_NotInScope(Collection<java.math.BigDecimal> displayOrderList) {
        regINS(CK_NINS, cTL(displayOrderList), getCValueDisplayOrder(), "DISPLAY_ORDER");
    }

    protected void regDisplayOrder(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueDisplayOrder(), "DISPLAY_ORDER"); }
    protected abstract ConditionValue getCValueDisplayOrder();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;SynonymProductStatusCB&gt;() {
     *     public void query(SynonymProductStatusCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<SynonymProductStatusCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;SynonymProductStatusCB&gt;() {
     *     public void query(SynonymProductStatusCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<SynonymProductStatusCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;SynonymProductStatusCB&gt;() {
     *     public void query(SynonymProductStatusCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<SynonymProductStatusCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;SynonymProductStatusCB&gt;() {
     *     public void query(SynonymProductStatusCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<SynonymProductStatusCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;SynonymProductStatusCB&gt;() {
     *     public void query(SynonymProductStatusCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<SynonymProductStatusCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;SynonymProductStatusCB&gt;() {
     *     public void query(SynonymProductStatusCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<SynonymProductStatusCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<SynonymProductStatusCB> xcreateSSQFunction(final String rd) {
        return new HpSSQFunction<SynonymProductStatusCB>(new HpSSQSetupper<SynonymProductStatusCB>() {
            public void setup(String fn, SubQuery<SynonymProductStatusCB> sq, HpSSQOption<SynonymProductStatusCB> op) {
                xscalarCondition(fn, sq, rd, op);
            }
        });
    }

    protected void xscalarCondition(String fn, SubQuery<SynonymProductStatusCB> sq, String rd, HpSSQOption<SynonymProductStatusCB> op) {
        assertObjectNotNull("subQuery", sq);
        SynonymProductStatusCB cb = xcreateScalarConditionCB(); sq.query(cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(SynonymProductStatusCQ sq);

    protected SynonymProductStatusCB xcreateScalarConditionCB() {
        SynonymProductStatusCB cb = new SynonymProductStatusCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected SynonymProductStatusCB xcreateScalarConditionPartitionByCB() {
        SynonymProductStatusCB cb = new SynonymProductStatusCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<SynonymProductStatusCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        SynonymProductStatusCB cb = new SynonymProductStatusCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String pk = "PRODUCT_STATUS_CODE";
        String pp = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(SynonymProductStatusCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<SynonymProductStatusCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<SynonymProductStatusCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<SynonymProductStatusCB>(new HpQDRSetupper<SynonymProductStatusCB>() {
            public void setup(String fn, SubQuery<SynonymProductStatusCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveMyselfDerived(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveMyselfDerived(String fn, SubQuery<SynonymProductStatusCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        SynonymProductStatusCB cb = new SynonymProductStatusCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String pk = "PRODUCT_STATUS_CODE";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(SynonymProductStatusCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<SynonymProductStatusCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        SynonymProductStatusCB cb = new SynonymProductStatusCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String pp = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(SynonymProductStatusCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<SynonymProductStatusCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        SynonymProductStatusCB cb = new SynonymProductStatusCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String pp = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(SynonymProductStatusCQ sq);

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
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCB() { return SynonymProductStatusCB.class.getName(); }
    protected String xabCQ() { return SynonymProductStatusCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
