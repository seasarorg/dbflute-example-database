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
 * The abstract condition-query of product_category.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsProductCategoryCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsProductCategoryCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "product_category";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (商品カテゴリコード)product_category_code: {PK, NotNull, bpchar(3)}
     * @param productCategoryCode The value of productCategoryCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductCategoryCode_Equal(String productCategoryCode) {
        doSetProductCategoryCode_Equal(fRES(productCategoryCode));
    }

    protected void doSetProductCategoryCode_Equal(String productCategoryCode) {
        regProductCategoryCode(CK_EQ, productCategoryCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (商品カテゴリコード)product_category_code: {PK, NotNull, bpchar(3)}
     * @param productCategoryCode The value of productCategoryCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductCategoryCode_NotEqual(String productCategoryCode) {
        doSetProductCategoryCode_NotEqual(fRES(productCategoryCode));
    }

    protected void doSetProductCategoryCode_NotEqual(String productCategoryCode) {
        regProductCategoryCode(CK_NES, productCategoryCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (商品カテゴリコード)product_category_code: {PK, NotNull, bpchar(3)}
     * @param productCategoryCodeList The collection of productCategoryCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductCategoryCode_InScope(Collection<String> productCategoryCodeList) {
        doSetProductCategoryCode_InScope(productCategoryCodeList);
    }

    public void doSetProductCategoryCode_InScope(Collection<String> productCategoryCodeList) {
        regINS(CK_INS, cTL(productCategoryCodeList), getCValueProductCategoryCode(), "product_category_code");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (商品カテゴリコード)product_category_code: {PK, NotNull, bpchar(3)}
     * @param productCategoryCodeList The collection of productCategoryCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductCategoryCode_NotInScope(Collection<String> productCategoryCodeList) {
        doSetProductCategoryCode_NotInScope(productCategoryCodeList);
    }

    public void doSetProductCategoryCode_NotInScope(Collection<String> productCategoryCodeList) {
        regINS(CK_NINS, cTL(productCategoryCodeList), getCValueProductCategoryCode(), "product_category_code");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (商品カテゴリコード)product_category_code: {PK, NotNull, bpchar(3)}
     * @param productCategoryCode The value of productCategoryCode as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductCategoryCode_PrefixSearch(String productCategoryCode) {
        setProductCategoryCode_LikeSearch(productCategoryCode, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (商品カテゴリコード)product_category_code: {PK, NotNull, bpchar(3)} <br />
     * <pre>e.g. setProductCategoryCode_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productCategoryCode The value of productCategoryCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductCategoryCode_LikeSearch(String productCategoryCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productCategoryCode), getCValueProductCategoryCode(), "product_category_code", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (商品カテゴリコード)product_category_code: {PK, NotNull, bpchar(3)}
     * @param productCategoryCode The value of productCategoryCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductCategoryCode_NotLikeSearch(String productCategoryCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productCategoryCode), getCValueProductCategoryCode(), "product_category_code", likeSearchOption);
    }

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select product_category_code from product where ...)} <br />
     * (商品)product by product_category_code, named 'productAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsProductList</span>(new SubQuery&lt;ProductCB&gt;() {
     *     public void query(ProductCategoryCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of ProductList for 'exists'. (NotNull)
     */
    public void existsProductList(SubQuery<ProductCB> subQuery) {
        assertObjectNotNull("subQuery<ProductCB>", subQuery);
        ProductCB cb = new ProductCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepProductCategoryCode_ExistsReferrer_ProductList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "product_category_code", "product_category_code", subQueryPropertyName, "productList");
    }
    public abstract String keepProductCategoryCode_ExistsReferrer_ProductList(ProductCQ subQuery);

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select parent_category_code from product_category where ...)} <br />
     * (商品カテゴリ)product_category by parent_category_code, named 'productCategorySelfAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsProductCategorySelfList</span>(new SubQuery&lt;ProductCategoryCB&gt;() {
     *     public void query(ProductCategoryCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of ProductCategorySelfList for 'exists'. (NotNull)
     */
    public void existsProductCategorySelfList(SubQuery<ProductCategoryCB> subQuery) {
        assertObjectNotNull("subQuery<ProductCategoryCB>", subQuery);
        ProductCategoryCB cb = new ProductCategoryCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepProductCategoryCode_ExistsReferrer_ProductCategorySelfList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "product_category_code", "parent_category_code", subQueryPropertyName, "productCategorySelfList");
    }
    public abstract String keepProductCategoryCode_ExistsReferrer_ProductCategorySelfList(ProductCategoryCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select product_category_code from product where ...)} <br />
     * (商品)product by product_category_code, named 'productAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsProductList</span>(new SubQuery&lt;ProductCB&gt;() {
     *     public void query(ProductCategoryCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of ProductCategoryCode_NotExistsReferrer_ProductList for 'not exists'. (NotNull)
     */
    public void notExistsProductList(SubQuery<ProductCB> subQuery) {
        assertObjectNotNull("subQuery<ProductCB>", subQuery);
        ProductCB cb = new ProductCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepProductCategoryCode_NotExistsReferrer_ProductList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "product_category_code", "product_category_code", subQueryPropertyName, "productList");
    }
    public abstract String keepProductCategoryCode_NotExistsReferrer_ProductList(ProductCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select parent_category_code from product_category where ...)} <br />
     * (商品カテゴリ)product_category by parent_category_code, named 'productCategorySelfAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsProductCategorySelfList</span>(new SubQuery&lt;ProductCategoryCB&gt;() {
     *     public void query(ProductCategoryCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of ProductCategoryCode_NotExistsReferrer_ProductCategorySelfList for 'not exists'. (NotNull)
     */
    public void notExistsProductCategorySelfList(SubQuery<ProductCategoryCB> subQuery) {
        assertObjectNotNull("subQuery<ProductCategoryCB>", subQuery);
        ProductCategoryCB cb = new ProductCategoryCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepProductCategoryCode_NotExistsReferrer_ProductCategorySelfList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "product_category_code", "parent_category_code", subQueryPropertyName, "productCategorySelfList");
    }
    public abstract String keepProductCategoryCode_NotExistsReferrer_ProductCategorySelfList(ProductCategoryCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select product_category_code from product where ...)} <br />
     * (商品)product by product_category_code, named 'productAsOne'.
     * @param subQuery The sub-query of ProductList for 'in-scope'. (NotNull)
     */
    public void inScopeProductList(SubQuery<ProductCB> subQuery) {
        assertObjectNotNull("subQuery<ProductCB>", subQuery);
        ProductCB cb = new ProductCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepProductCategoryCode_InScopeRelation_ProductList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "product_category_code", "product_category_code", subQueryPropertyName, "productList");
    }
    public abstract String keepProductCategoryCode_InScopeRelation_ProductList(ProductCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select parent_category_code from product_category where ...)} <br />
     * (商品カテゴリ)product_category by parent_category_code, named 'productCategorySelfAsOne'.
     * @param subQuery The sub-query of ProductCategorySelfList for 'in-scope'. (NotNull)
     */
    public void inScopeProductCategorySelfList(SubQuery<ProductCategoryCB> subQuery) {
        assertObjectNotNull("subQuery<ProductCategoryCB>", subQuery);
        ProductCategoryCB cb = new ProductCategoryCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepProductCategoryCode_InScopeRelation_ProductCategorySelfList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "product_category_code", "parent_category_code", subQueryPropertyName, "productCategorySelfList");
    }
    public abstract String keepProductCategoryCode_InScopeRelation_ProductCategorySelfList(ProductCategoryCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select product_category_code from product where ...)} <br />
     * (商品)product by product_category_code, named 'productAsOne'.
     * @param subQuery The sub-query of ProductList for 'not in-scope'. (NotNull)
     */
    public void notInScopeProductList(SubQuery<ProductCB> subQuery) {
        assertObjectNotNull("subQuery<ProductCB>", subQuery);
        ProductCB cb = new ProductCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepProductCategoryCode_NotInScopeRelation_ProductList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "product_category_code", "product_category_code", subQueryPropertyName, "productList");
    }
    public abstract String keepProductCategoryCode_NotInScopeRelation_ProductList(ProductCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select parent_category_code from product_category where ...)} <br />
     * (商品カテゴリ)product_category by parent_category_code, named 'productCategorySelfAsOne'.
     * @param subQuery The sub-query of ProductCategorySelfList for 'not in-scope'. (NotNull)
     */
    public void notInScopeProductCategorySelfList(SubQuery<ProductCategoryCB> subQuery) {
        assertObjectNotNull("subQuery<ProductCategoryCB>", subQuery);
        ProductCategoryCB cb = new ProductCategoryCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepProductCategoryCode_NotInScopeRelation_ProductCategorySelfList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "product_category_code", "parent_category_code", subQueryPropertyName, "productCategorySelfList");
    }
    public abstract String keepProductCategoryCode_NotInScopeRelation_ProductCategorySelfList(ProductCategoryCQ subQuery);

    public void xsderiveProductList(String function, SubQuery<ProductCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<ProductCB>", subQuery);
        ProductCB cb = new ProductCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepProductCategoryCode_SpecifyDerivedReferrer_ProductList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "product_category_code", "product_category_code", subQueryPropertyName, "productList", aliasName, option);
    }
    public abstract String keepProductCategoryCode_SpecifyDerivedReferrer_ProductList(ProductCQ subQuery);

    public void xsderiveProductCategorySelfList(String function, SubQuery<ProductCategoryCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<ProductCategoryCB>", subQuery);
        ProductCategoryCB cb = new ProductCategoryCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepProductCategoryCode_SpecifyDerivedReferrer_ProductCategorySelfList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "product_category_code", "parent_category_code", subQueryPropertyName, "productCategorySelfList", aliasName, option);
    }
    public abstract String keepProductCategoryCode_SpecifyDerivedReferrer_ProductCategorySelfList(ProductCategoryCQ subQuery);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from product where ...)} <br />
     * (商品)product by product_category_code, named 'productAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">derivedProductList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;ProductCB&gt;() {
     *     public void query(ProductCB subCB) {
     *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #FD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<ProductCB> derivedProductList() {
        return xcreateQDRFunctionProductList();
    }
    protected HpQDRFunction<ProductCB> xcreateQDRFunctionProductList() {
        return new HpQDRFunction<ProductCB>(new HpQDRSetupper<ProductCB>() {
            public void setup(String function, SubQuery<ProductCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveProductList(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveProductList(String function, SubQuery<ProductCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<ProductCB>", subQuery);
        ProductCB cb = new ProductCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepProductCategoryCode_QueryDerivedReferrer_ProductList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepProductCategoryCode_QueryDerivedReferrer_ProductListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "product_category_code", "product_category_code", subQueryPropertyName, "productList", operand, value, parameterPropertyName, option);
    }
    public abstract String keepProductCategoryCode_QueryDerivedReferrer_ProductList(ProductCQ subQuery);
    public abstract String keepProductCategoryCode_QueryDerivedReferrer_ProductListParameter(Object parameterValue);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from product_category where ...)} <br />
     * (商品カテゴリ)product_category by parent_category_code, named 'productCategorySelfAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">derivedProductCategorySelfList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;ProductCategoryCB&gt;() {
     *     public void query(ProductCategoryCB subCB) {
     *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #FD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<ProductCategoryCB> derivedProductCategorySelfList() {
        return xcreateQDRFunctionProductCategorySelfList();
    }
    protected HpQDRFunction<ProductCategoryCB> xcreateQDRFunctionProductCategorySelfList() {
        return new HpQDRFunction<ProductCategoryCB>(new HpQDRSetupper<ProductCategoryCB>() {
            public void setup(String function, SubQuery<ProductCategoryCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveProductCategorySelfList(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveProductCategorySelfList(String function, SubQuery<ProductCategoryCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<ProductCategoryCB>", subQuery);
        ProductCategoryCB cb = new ProductCategoryCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepProductCategoryCode_QueryDerivedReferrer_ProductCategorySelfList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepProductCategoryCode_QueryDerivedReferrer_ProductCategorySelfListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "product_category_code", "parent_category_code", subQueryPropertyName, "productCategorySelfList", operand, value, parameterPropertyName, option);
    }
    public abstract String keepProductCategoryCode_QueryDerivedReferrer_ProductCategorySelfList(ProductCategoryCQ subQuery);
    public abstract String keepProductCategoryCode_QueryDerivedReferrer_ProductCategorySelfListParameter(Object parameterValue);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * (商品カテゴリコード)product_category_code: {PK, NotNull, bpchar(3)}
     */
    public void setProductCategoryCode_IsNull() { regProductCategoryCode(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * (商品カテゴリコード)product_category_code: {PK, NotNull, bpchar(3)}
     */
    public void setProductCategoryCode_IsNotNull() { regProductCategoryCode(CK_ISNN, DOBJ); }

    protected void regProductCategoryCode(ConditionKey k, Object v) { regQ(k, v, getCValueProductCategoryCode(), "product_category_code"); }
    abstract protected ConditionValue getCValueProductCategoryCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (商品カテゴリ名称)product_category_name: {NotNull, varchar(50)}
     * @param productCategoryName The value of productCategoryName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductCategoryName_Equal(String productCategoryName) {
        doSetProductCategoryName_Equal(fRES(productCategoryName));
    }

    protected void doSetProductCategoryName_Equal(String productCategoryName) {
        regProductCategoryName(CK_EQ, productCategoryName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (商品カテゴリ名称)product_category_name: {NotNull, varchar(50)}
     * @param productCategoryName The value of productCategoryName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductCategoryName_NotEqual(String productCategoryName) {
        doSetProductCategoryName_NotEqual(fRES(productCategoryName));
    }

    protected void doSetProductCategoryName_NotEqual(String productCategoryName) {
        regProductCategoryName(CK_NES, productCategoryName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (商品カテゴリ名称)product_category_name: {NotNull, varchar(50)}
     * @param productCategoryNameList The collection of productCategoryName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductCategoryName_InScope(Collection<String> productCategoryNameList) {
        doSetProductCategoryName_InScope(productCategoryNameList);
    }

    public void doSetProductCategoryName_InScope(Collection<String> productCategoryNameList) {
        regINS(CK_INS, cTL(productCategoryNameList), getCValueProductCategoryName(), "product_category_name");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (商品カテゴリ名称)product_category_name: {NotNull, varchar(50)}
     * @param productCategoryNameList The collection of productCategoryName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductCategoryName_NotInScope(Collection<String> productCategoryNameList) {
        doSetProductCategoryName_NotInScope(productCategoryNameList);
    }

    public void doSetProductCategoryName_NotInScope(Collection<String> productCategoryNameList) {
        regINS(CK_NINS, cTL(productCategoryNameList), getCValueProductCategoryName(), "product_category_name");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (商品カテゴリ名称)product_category_name: {NotNull, varchar(50)}
     * @param productCategoryName The value of productCategoryName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductCategoryName_PrefixSearch(String productCategoryName) {
        setProductCategoryName_LikeSearch(productCategoryName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (商品カテゴリ名称)product_category_name: {NotNull, varchar(50)} <br />
     * <pre>e.g. setProductCategoryName_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productCategoryName The value of productCategoryName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductCategoryName_LikeSearch(String productCategoryName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productCategoryName), getCValueProductCategoryName(), "product_category_name", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (商品カテゴリ名称)product_category_name: {NotNull, varchar(50)}
     * @param productCategoryName The value of productCategoryName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductCategoryName_NotLikeSearch(String productCategoryName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productCategoryName), getCValueProductCategoryName(), "product_category_name", likeSearchOption);
    }

    protected void regProductCategoryName(ConditionKey k, Object v) { regQ(k, v, getCValueProductCategoryName(), "product_category_name"); }
    abstract protected ConditionValue getCValueProductCategoryName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (親カテゴリコード)parent_category_code: {bpchar(3), FK to product_category}
     * @param parentCategoryCode The value of parentCategoryCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setParentCategoryCode_Equal(String parentCategoryCode) {
        doSetParentCategoryCode_Equal(fRES(parentCategoryCode));
    }

    protected void doSetParentCategoryCode_Equal(String parentCategoryCode) {
        regParentCategoryCode(CK_EQ, parentCategoryCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (親カテゴリコード)parent_category_code: {bpchar(3), FK to product_category}
     * @param parentCategoryCode The value of parentCategoryCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setParentCategoryCode_NotEqual(String parentCategoryCode) {
        doSetParentCategoryCode_NotEqual(fRES(parentCategoryCode));
    }

    protected void doSetParentCategoryCode_NotEqual(String parentCategoryCode) {
        regParentCategoryCode(CK_NES, parentCategoryCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (親カテゴリコード)parent_category_code: {bpchar(3), FK to product_category}
     * @param parentCategoryCodeList The collection of parentCategoryCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setParentCategoryCode_InScope(Collection<String> parentCategoryCodeList) {
        doSetParentCategoryCode_InScope(parentCategoryCodeList);
    }

    public void doSetParentCategoryCode_InScope(Collection<String> parentCategoryCodeList) {
        regINS(CK_INS, cTL(parentCategoryCodeList), getCValueParentCategoryCode(), "parent_category_code");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (親カテゴリコード)parent_category_code: {bpchar(3), FK to product_category}
     * @param parentCategoryCodeList The collection of parentCategoryCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setParentCategoryCode_NotInScope(Collection<String> parentCategoryCodeList) {
        doSetParentCategoryCode_NotInScope(parentCategoryCodeList);
    }

    public void doSetParentCategoryCode_NotInScope(Collection<String> parentCategoryCodeList) {
        regINS(CK_NINS, cTL(parentCategoryCodeList), getCValueParentCategoryCode(), "parent_category_code");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (親カテゴリコード)parent_category_code: {bpchar(3), FK to product_category}
     * @param parentCategoryCode The value of parentCategoryCode as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setParentCategoryCode_PrefixSearch(String parentCategoryCode) {
        setParentCategoryCode_LikeSearch(parentCategoryCode, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (親カテゴリコード)parent_category_code: {bpchar(3), FK to product_category} <br />
     * <pre>e.g. setParentCategoryCode_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param parentCategoryCode The value of parentCategoryCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setParentCategoryCode_LikeSearch(String parentCategoryCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(parentCategoryCode), getCValueParentCategoryCode(), "parent_category_code", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (親カテゴリコード)parent_category_code: {bpchar(3), FK to product_category}
     * @param parentCategoryCode The value of parentCategoryCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setParentCategoryCode_NotLikeSearch(String parentCategoryCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(parentCategoryCode), getCValueParentCategoryCode(), "parent_category_code", likeSearchOption);
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select parent_category_code from product_category where ...)} <br />
     * (商品カテゴリ)product_category by my parent_category_code, named 'productCategorySelf'.
     * @param subQuery The sub-query of ProductCategorySelf for 'in-scope'. (NotNull)
     */
    public void inScopeProductCategorySelf(SubQuery<ProductCategoryCB> subQuery) {
        assertObjectNotNull("subQuery<ProductCategoryCB>", subQuery);
        ProductCategoryCB cb = new ProductCategoryCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepParentCategoryCode_InScopeRelation_ProductCategorySelf(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "parent_category_code", "product_category_code", subQueryPropertyName, "productCategorySelf");
    }
    public abstract String keepParentCategoryCode_InScopeRelation_ProductCategorySelf(ProductCategoryCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select parent_category_code from product_category where ...)} <br />
     * (商品カテゴリ)product_category by my parent_category_code, named 'productCategorySelf'.
     * @param subQuery The sub-query of ProductCategorySelf for 'not in-scope'. (NotNull)
     */
    public void notInScopeProductCategorySelf(SubQuery<ProductCategoryCB> subQuery) {
        assertObjectNotNull("subQuery<ProductCategoryCB>", subQuery);
        ProductCategoryCB cb = new ProductCategoryCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepParentCategoryCode_NotInScopeRelation_ProductCategorySelf(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "parent_category_code", "product_category_code", subQueryPropertyName, "productCategorySelf");
    }
    public abstract String keepParentCategoryCode_NotInScopeRelation_ProductCategorySelf(ProductCategoryCQ subQuery);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * (親カテゴリコード)parent_category_code: {bpchar(3), FK to product_category}
     */
    public void setParentCategoryCode_IsNull() { regParentCategoryCode(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * (親カテゴリコード)parent_category_code: {bpchar(3), FK to product_category}
     */
    public void setParentCategoryCode_IsNullOrEmpty() { regParentCategoryCode(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * (親カテゴリコード)parent_category_code: {bpchar(3), FK to product_category}
     */
    public void setParentCategoryCode_IsNotNull() { regParentCategoryCode(CK_ISNN, DOBJ); }

    protected void regParentCategoryCode(ConditionKey k, Object v) { regQ(k, v, getCValueParentCategoryCode(), "parent_category_code"); }
    abstract protected ConditionValue getCValueParentCategoryCode();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;ProductCategoryCB&gt;() {
     *     public void query(ProductCategoryCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ProductCategoryCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;ProductCategoryCB&gt;() {
     *     public void query(ProductCategoryCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ProductCategoryCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;ProductCategoryCB&gt;() {
     *     public void query(ProductCategoryCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ProductCategoryCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;ProductCategoryCB&gt;() {
     *     public void query(ProductCategoryCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ProductCategoryCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;ProductCategoryCB&gt;() {
     *     public void query(ProductCategoryCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ProductCategoryCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;ProductCategoryCB&gt;() {
     *     public void query(ProductCategoryCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ProductCategoryCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<ProductCategoryCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<ProductCategoryCB>(new HpSSQSetupper<ProductCategoryCB>() {
            public void setup(String function, SubQuery<ProductCategoryCB> subQuery, HpSSQOption<ProductCategoryCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<ProductCategoryCB> subQuery, String operand, HpSSQOption<ProductCategoryCB> option) {
        assertObjectNotNull("subQuery<ProductCategoryCB>", subQuery);
        ProductCategoryCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(ProductCategoryCQ subQuery);

    protected ProductCategoryCB xcreateScalarConditionCB() {
        ProductCategoryCB cb = new ProductCategoryCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected ProductCategoryCB xcreateScalarConditionPartitionByCB() {
        ProductCategoryCB cb = new ProductCategoryCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<ProductCategoryCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<ProductCategoryCB>", subQuery);
        ProductCategoryCB cb = new ProductCategoryCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "product_category_code", "product_category_code", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(ProductCategoryCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<ProductCategoryCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<ProductCategoryCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<ProductCategoryCB>(new HpQDRSetupper<ProductCategoryCB>() {
            public void setup(String function, SubQuery<ProductCategoryCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<ProductCategoryCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<ProductCategoryCB>", subQuery);
        ProductCategoryCB cb = new ProductCategoryCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "product_category_code", "product_category_code", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(ProductCategoryCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<ProductCategoryCB> subQuery) {
        assertObjectNotNull("subQuery<ProductCategoryCB>", subQuery);
        ProductCategoryCB cb = new ProductCategoryCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(ProductCategoryCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<ProductCategoryCB> subQuery) {
        assertObjectNotNull("subQuery<ProductCategoryCB>", subQuery);
        ProductCategoryCB cb = new ProductCategoryCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(ProductCategoryCQ subQuery);

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
    protected String xabCB() { return ProductCategoryCB.class.getName(); }
    protected String xabCQ() { return ProductCategoryCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
