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
 * The abstract condition-query of NEXT_SCHEMA_PRODUCT_STATUS.
 * @author oracleman
 */
public abstract class AbstractBsNextSchemaProductStatusCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsNextSchemaProductStatusCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "NEXT_SCHEMA_PRODUCT_STATUS";
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
     * Set up ExistsReferrer (correlated sub-query). <br />
     * {exists (select NEXT_TARGET_CODE from WHITE_REF_NEXT_TARGET where ...)} <br />
     * WHITE_REF_NEXT_TARGET by NEXT_TARGET_CODE, named 'whiteRefNextTargetAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsWhiteRefNextTargetList</span>(new SubQuery&lt;WhiteRefNextTargetCB&gt;() {
     *     public void query(WhiteRefNextTargetCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of WhiteRefNextTargetList for 'exists'. (NotNull)
     */
    public void existsWhiteRefNextTargetList(SubQuery<WhiteRefNextTargetCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteRefNextTargetCB cb = new WhiteRefNextTargetCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String pp = keepProductStatusCode_ExistsReferrer_WhiteRefNextTargetList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "PRODUCT_STATUS_CODE", "NEXT_TARGET_CODE", pp, "whiteRefNextTargetList");
    }
    public abstract String keepProductStatusCode_ExistsReferrer_WhiteRefNextTargetList(WhiteRefNextTargetCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br />
     * {exists (select PRODUCT_STATUS_CODE from NEXT_SCHEMA_PRODUCT where ...)} <br />
     * (隣のスキーマ)NEXT_SCHEMA_PRODUCT by PRODUCT_STATUS_CODE, named 'nextSchemaProductAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsNextSchemaProductList</span>(new SubQuery&lt;NextSchemaProductCB&gt;() {
     *     public void query(NextSchemaProductCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of NextSchemaProductList for 'exists'. (NotNull)
     */
    public void existsNextSchemaProductList(SubQuery<NextSchemaProductCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        NextSchemaProductCB cb = new NextSchemaProductCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String pp = keepProductStatusCode_ExistsReferrer_NextSchemaProductList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "PRODUCT_STATUS_CODE", "PRODUCT_STATUS_CODE", pp, "nextSchemaProductList");
    }
    public abstract String keepProductStatusCode_ExistsReferrer_NextSchemaProductList(NextSchemaProductCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select NEXT_TARGET_CODE from WHITE_REF_NEXT_TARGET where ...)} <br />
     * WHITE_REF_NEXT_TARGET by NEXT_TARGET_CODE, named 'whiteRefNextTargetAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsWhiteRefNextTargetList</span>(new SubQuery&lt;WhiteRefNextTargetCB&gt;() {
     *     public void query(WhiteRefNextTargetCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of ProductStatusCode_NotExistsReferrer_WhiteRefNextTargetList for 'not exists'. (NotNull)
     */
    public void notExistsWhiteRefNextTargetList(SubQuery<WhiteRefNextTargetCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteRefNextTargetCB cb = new WhiteRefNextTargetCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String pp = keepProductStatusCode_NotExistsReferrer_WhiteRefNextTargetList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "PRODUCT_STATUS_CODE", "NEXT_TARGET_CODE", pp, "whiteRefNextTargetList");
    }
    public abstract String keepProductStatusCode_NotExistsReferrer_WhiteRefNextTargetList(WhiteRefNextTargetCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select PRODUCT_STATUS_CODE from NEXT_SCHEMA_PRODUCT where ...)} <br />
     * (隣のスキーマ)NEXT_SCHEMA_PRODUCT by PRODUCT_STATUS_CODE, named 'nextSchemaProductAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsNextSchemaProductList</span>(new SubQuery&lt;NextSchemaProductCB&gt;() {
     *     public void query(NextSchemaProductCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of ProductStatusCode_NotExistsReferrer_NextSchemaProductList for 'not exists'. (NotNull)
     */
    public void notExistsNextSchemaProductList(SubQuery<NextSchemaProductCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        NextSchemaProductCB cb = new NextSchemaProductCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String pp = keepProductStatusCode_NotExistsReferrer_NextSchemaProductList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "PRODUCT_STATUS_CODE", "PRODUCT_STATUS_CODE", pp, "nextSchemaProductList");
    }
    public abstract String keepProductStatusCode_NotExistsReferrer_NextSchemaProductList(NextSchemaProductCQ sq);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select NEXT_TARGET_CODE from WHITE_REF_NEXT_TARGET where ...)} <br />
     * WHITE_REF_NEXT_TARGET by NEXT_TARGET_CODE, named 'whiteRefNextTargetAsOne'.
     * @param subQuery The sub-query of WhiteRefNextTargetList for 'in-scope'. (NotNull)
     */
    public void inScopeWhiteRefNextTargetList(SubQuery<WhiteRefNextTargetCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteRefNextTargetCB cb = new WhiteRefNextTargetCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepProductStatusCode_InScopeRelation_WhiteRefNextTargetList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "PRODUCT_STATUS_CODE", "NEXT_TARGET_CODE", pp, "whiteRefNextTargetList");
    }
    public abstract String keepProductStatusCode_InScopeRelation_WhiteRefNextTargetList(WhiteRefNextTargetCQ sq);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PRODUCT_STATUS_CODE from NEXT_SCHEMA_PRODUCT where ...)} <br />
     * (隣のスキーマ)NEXT_SCHEMA_PRODUCT by PRODUCT_STATUS_CODE, named 'nextSchemaProductAsOne'.
     * @param subQuery The sub-query of NextSchemaProductList for 'in-scope'. (NotNull)
     */
    public void inScopeNextSchemaProductList(SubQuery<NextSchemaProductCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        NextSchemaProductCB cb = new NextSchemaProductCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepProductStatusCode_InScopeRelation_NextSchemaProductList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "PRODUCT_STATUS_CODE", "PRODUCT_STATUS_CODE", pp, "nextSchemaProductList");
    }
    public abstract String keepProductStatusCode_InScopeRelation_NextSchemaProductList(NextSchemaProductCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select NEXT_TARGET_CODE from WHITE_REF_NEXT_TARGET where ...)} <br />
     * WHITE_REF_NEXT_TARGET by NEXT_TARGET_CODE, named 'whiteRefNextTargetAsOne'.
     * @param subQuery The sub-query of WhiteRefNextTargetList for 'not in-scope'. (NotNull)
     */
    public void notInScopeWhiteRefNextTargetList(SubQuery<WhiteRefNextTargetCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteRefNextTargetCB cb = new WhiteRefNextTargetCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepProductStatusCode_NotInScopeRelation_WhiteRefNextTargetList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "PRODUCT_STATUS_CODE", "NEXT_TARGET_CODE", pp, "whiteRefNextTargetList");
    }
    public abstract String keepProductStatusCode_NotInScopeRelation_WhiteRefNextTargetList(WhiteRefNextTargetCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PRODUCT_STATUS_CODE from NEXT_SCHEMA_PRODUCT where ...)} <br />
     * (隣のスキーマ)NEXT_SCHEMA_PRODUCT by PRODUCT_STATUS_CODE, named 'nextSchemaProductAsOne'.
     * @param subQuery The sub-query of NextSchemaProductList for 'not in-scope'. (NotNull)
     */
    public void notInScopeNextSchemaProductList(SubQuery<NextSchemaProductCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        NextSchemaProductCB cb = new NextSchemaProductCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepProductStatusCode_NotInScopeRelation_NextSchemaProductList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "PRODUCT_STATUS_CODE", "PRODUCT_STATUS_CODE", pp, "nextSchemaProductList");
    }
    public abstract String keepProductStatusCode_NotInScopeRelation_NextSchemaProductList(NextSchemaProductCQ sq);

    public void xsderiveWhiteRefNextTargetList(String fn, SubQuery<WhiteRefNextTargetCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteRefNextTargetCB cb = new WhiteRefNextTargetCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String pp = keepProductStatusCode_SpecifyDerivedReferrer_WhiteRefNextTargetList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_STATUS_CODE", "NEXT_TARGET_CODE", pp, "whiteRefNextTargetList", al, op);
    }
    public abstract String keepProductStatusCode_SpecifyDerivedReferrer_WhiteRefNextTargetList(WhiteRefNextTargetCQ sq);

    public void xsderiveNextSchemaProductList(String fn, SubQuery<NextSchemaProductCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        NextSchemaProductCB cb = new NextSchemaProductCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String pp = keepProductStatusCode_SpecifyDerivedReferrer_NextSchemaProductList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_STATUS_CODE", "PRODUCT_STATUS_CODE", pp, "nextSchemaProductList", al, op);
    }
    public abstract String keepProductStatusCode_SpecifyDerivedReferrer_NextSchemaProductList(NextSchemaProductCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from WHITE_REF_NEXT_TARGET where ...)} <br />
     * WHITE_REF_NEXT_TARGET by NEXT_TARGET_CODE, named 'whiteRefNextTargetAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">derivedWhiteRefNextTargetList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;WhiteRefNextTargetCB&gt;() {
     *     public void query(WhiteRefNextTargetCB subCB) {
     *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #FD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WhiteRefNextTargetCB> derivedWhiteRefNextTargetList() {
        return xcreateQDRFunctionWhiteRefNextTargetList();
    }
    protected HpQDRFunction<WhiteRefNextTargetCB> xcreateQDRFunctionWhiteRefNextTargetList() {
        return new HpQDRFunction<WhiteRefNextTargetCB>(new HpQDRSetupper<WhiteRefNextTargetCB>() {
            public void setup(String fn, SubQuery<WhiteRefNextTargetCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveWhiteRefNextTargetList(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveWhiteRefNextTargetList(String fn, SubQuery<WhiteRefNextTargetCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteRefNextTargetCB cb = new WhiteRefNextTargetCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String sqpp = keepProductStatusCode_QueryDerivedReferrer_WhiteRefNextTargetList(cb.query()); // for saving query-value.
        String prpp = keepProductStatusCode_QueryDerivedReferrer_WhiteRefNextTargetListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_STATUS_CODE", "NEXT_TARGET_CODE", sqpp, "whiteRefNextTargetList", rd, vl, prpp, op);
    }
    public abstract String keepProductStatusCode_QueryDerivedReferrer_WhiteRefNextTargetList(WhiteRefNextTargetCQ sq);
    public abstract String keepProductStatusCode_QueryDerivedReferrer_WhiteRefNextTargetListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from NEXT_SCHEMA_PRODUCT where ...)} <br />
     * (隣のスキーマ)NEXT_SCHEMA_PRODUCT by PRODUCT_STATUS_CODE, named 'nextSchemaProductAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">derivedNextSchemaProductList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;NextSchemaProductCB&gt;() {
     *     public void query(NextSchemaProductCB subCB) {
     *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #FD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<NextSchemaProductCB> derivedNextSchemaProductList() {
        return xcreateQDRFunctionNextSchemaProductList();
    }
    protected HpQDRFunction<NextSchemaProductCB> xcreateQDRFunctionNextSchemaProductList() {
        return new HpQDRFunction<NextSchemaProductCB>(new HpQDRSetupper<NextSchemaProductCB>() {
            public void setup(String fn, SubQuery<NextSchemaProductCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveNextSchemaProductList(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveNextSchemaProductList(String fn, SubQuery<NextSchemaProductCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        NextSchemaProductCB cb = new NextSchemaProductCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String sqpp = keepProductStatusCode_QueryDerivedReferrer_NextSchemaProductList(cb.query()); // for saving query-value.
        String prpp = keepProductStatusCode_QueryDerivedReferrer_NextSchemaProductListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_STATUS_CODE", "PRODUCT_STATUS_CODE", sqpp, "nextSchemaProductList", rd, vl, prpp, op);
    }
    public abstract String keepProductStatusCode_QueryDerivedReferrer_NextSchemaProductList(NextSchemaProductCQ sq);
    public abstract String keepProductStatusCode_QueryDerivedReferrer_NextSchemaProductListParameter(Object vl);

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

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;NextSchemaProductStatusCB&gt;() {
     *     public void query(NextSchemaProductStatusCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<NextSchemaProductStatusCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand(), NextSchemaProductStatusCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;NextSchemaProductStatusCB&gt;() {
     *     public void query(NextSchemaProductStatusCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<NextSchemaProductStatusCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand(), NextSchemaProductStatusCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;NextSchemaProductStatusCB&gt;() {
     *     public void query(NextSchemaProductStatusCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<NextSchemaProductStatusCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand(), NextSchemaProductStatusCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;NextSchemaProductStatusCB&gt;() {
     *     public void query(NextSchemaProductStatusCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<NextSchemaProductStatusCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand(), NextSchemaProductStatusCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;NextSchemaProductStatusCB&gt;() {
     *     public void query(NextSchemaProductStatusCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<NextSchemaProductStatusCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand(), NextSchemaProductStatusCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;NextSchemaProductStatusCB&gt;() {
     *     public void query(NextSchemaProductStatusCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<NextSchemaProductStatusCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand(), NextSchemaProductStatusCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        NextSchemaProductStatusCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(NextSchemaProductStatusCQ sq);

    protected NextSchemaProductStatusCB xcreateScalarConditionCB() {
        NextSchemaProductStatusCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected NextSchemaProductStatusCB xcreateScalarConditionPartitionByCB() {
        NextSchemaProductStatusCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<NextSchemaProductStatusCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        NextSchemaProductStatusCB cb = new NextSchemaProductStatusCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String pk = "PRODUCT_STATUS_CODE";
        String pp = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(NextSchemaProductStatusCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<NextSchemaProductStatusCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(NextSchemaProductStatusCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        NextSchemaProductStatusCB cb = new NextSchemaProductStatusCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "PRODUCT_STATUS_CODE";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(NextSchemaProductStatusCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<NextSchemaProductStatusCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        NextSchemaProductStatusCB cb = new NextSchemaProductStatusCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String pp = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(NextSchemaProductStatusCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<NextSchemaProductStatusCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        NextSchemaProductStatusCB cb = new NextSchemaProductStatusCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String pp = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(NextSchemaProductStatusCQ sq);

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
    protected NextSchemaProductStatusCB newMyCB() {
        return new NextSchemaProductStatusCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return NextSchemaProductStatusCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
