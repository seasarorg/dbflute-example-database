/*
 * Copyright 2004-2013 the Seasar Foundation and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package com.example.dbflute.mysql.dbflute.bsbhv;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.HpSLSFunction;
import org.seasar.dbflute.exception.*;
import org.seasar.dbflute.optional.OptionalEntity;
import org.seasar.dbflute.outsidesql.executor.*;
import com.example.dbflute.mysql.dbflute.exbhv.*;
import com.example.dbflute.mysql.dbflute.bsbhv.loader.*;
import com.example.dbflute.mysql.dbflute.exentity.*;
import com.example.dbflute.mysql.dbflute.bsentity.dbmeta.*;
import com.example.dbflute.mysql.dbflute.cbean.*;

/**
 * The behavior of WHITE_PERROTTA_OVER_PRODUCT_NESTED as TABLE. <br />
 * <pre>
 * [primary key]
 *     PRODUCT_NESTED_CODE
 *
 * [column]
 *     PRODUCT_NESTED_CODE, PRODUCT_NESTED_NAME
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     white_perrotta_over_product
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whitePerrottaOverProductList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhitePerrottaOverProductNestedBhv extends AbstractBehaviorWritable<WhitePerrottaOverProductNested, WhitePerrottaOverProductNestedCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public WhitePerrottaOverProductNestedDbm getDBMeta() { return WhitePerrottaOverProductNestedDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhitePerrottaOverProductNestedDbm getMyDBMeta() { return WhitePerrottaOverProductNestedDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhitePerrottaOverProductNestedCB newConditionBean() { return new WhitePerrottaOverProductNestedCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhitePerrottaOverProductNested newMyEntity() { return new WhitePerrottaOverProductNested(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhitePerrottaOverProductNestedCB newMyConditionBean() { return new WhitePerrottaOverProductNestedCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhitePerrottaOverProductNestedCB cb = new WhitePerrottaOverProductNestedCB();
     * cb.query().setFoo...(value);
     * int count = whitePerrottaOverProductNestedBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhitePerrottaOverProductNested. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhitePerrottaOverProductNestedCB cb) {
        return facadeSelectCount(cb);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean. #beforejava8 <br />
     * <span style="color: #AD4747; font-size: 120%">The return might be null if no data, so you should have null check.</span> <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, use selectEntityWithDeletedCheck().</span>
     * <pre>
     * WhitePerrottaOverProductNestedCB cb = new WhitePerrottaOverProductNestedCB();
     * cb.query().setFoo...(value);
     * WhitePerrottaOverProductNested whitePerrottaOverProductNested = whitePerrottaOverProductNestedBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (whitePerrottaOverProductNested != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = whitePerrottaOverProductNested.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhitePerrottaOverProductNested. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhitePerrottaOverProductNested selectEntity(WhitePerrottaOverProductNestedCB cb) {
        return facadeSelectEntity(cb);
    }

    protected WhitePerrottaOverProductNested facadeSelectEntity(WhitePerrottaOverProductNestedCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhitePerrottaOverProductNested> OptionalEntity<ENTITY> doSelectOptionalEntity(WhitePerrottaOverProductNestedCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * WhitePerrottaOverProductNestedCB cb = new WhitePerrottaOverProductNestedCB();
     * cb.query().setFoo...(value);
     * WhitePerrottaOverProductNested whitePerrottaOverProductNested = whitePerrottaOverProductNestedBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whitePerrottaOverProductNested.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhitePerrottaOverProductNested. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhitePerrottaOverProductNested selectEntityWithDeletedCheck(WhitePerrottaOverProductNestedCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param productNestedCode : PK, NotNull, CHAR(3). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhitePerrottaOverProductNested selectByPKValue(String productNestedCode) {
        return facadeSelectByPKValue(productNestedCode);
    }

    protected WhitePerrottaOverProductNested facadeSelectByPKValue(String productNestedCode) {
        return doSelectByPK(productNestedCode, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhitePerrottaOverProductNested> ENTITY doSelectByPK(String productNestedCode, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(productNestedCode), tp);
    }

    protected <ENTITY extends WhitePerrottaOverProductNested> OptionalEntity<ENTITY> doSelectOptionalByPK(String productNestedCode, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(productNestedCode, tp), productNestedCode);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param productNestedCode : PK, NotNull, CHAR(3). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhitePerrottaOverProductNested selectByPKValueWithDeletedCheck(String productNestedCode) {
        return doSelectByPKWithDeletedCheck(productNestedCode, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhitePerrottaOverProductNested> ENTITY doSelectByPKWithDeletedCheck(String productNestedCode, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(productNestedCode), tp);
    }

    protected WhitePerrottaOverProductNestedCB xprepareCBAsPK(String productNestedCode) {
        assertObjectNotNull("productNestedCode", productNestedCode);
        return newConditionBean().acceptPK(productNestedCode);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhitePerrottaOverProductNestedCB cb = new WhitePerrottaOverProductNestedCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhitePerrottaOverProductNested&gt; whitePerrottaOverProductNestedList = whitePerrottaOverProductNestedBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhitePerrottaOverProductNested whitePerrottaOverProductNested : whitePerrottaOverProductNestedList) {
     *     ... = whitePerrottaOverProductNested.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhitePerrottaOverProductNested. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhitePerrottaOverProductNested> selectList(WhitePerrottaOverProductNestedCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * WhitePerrottaOverProductNestedCB cb = new WhitePerrottaOverProductNestedCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhitePerrottaOverProductNested&gt; page = whitePerrottaOverProductNestedBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhitePerrottaOverProductNested whitePerrottaOverProductNested : page) {
     *     ... = whitePerrottaOverProductNested.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhitePerrottaOverProductNested. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhitePerrottaOverProductNested> selectPage(WhitePerrottaOverProductNestedCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhitePerrottaOverProductNestedCB cb = new WhitePerrottaOverProductNestedCB();
     * cb.query().setFoo...(value);
     * whitePerrottaOverProductNestedBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhitePerrottaOverProductNested&gt;() {
     *     public void handle(WhitePerrottaOverProductNested entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhitePerrottaOverProductNested. (NotNull)
     * @param entityRowHandler The handler of entity row of WhitePerrottaOverProductNested. (NotNull)
     */
    public void selectCursor(WhitePerrottaOverProductNestedCB cb, EntityRowHandler<WhitePerrottaOverProductNested> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whitePerrottaOverProductNestedBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhitePerrottaOverProductNestedCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhitePerrottaOverProductNestedCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    // ===================================================================================
    //                                                                            Sequence
    //                                                                            ========
    @Override
    protected Number doReadNextVal() {
        String msg = "This table is NOT related to sequence: " + getTableDbName();
        throw new UnsupportedOperationException(msg);
    }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    /**
     * Load referrer by the the referrer loader. <br />
     * <pre>
     * MemberCB cb = new MemberCB();
     * cb.query().set...
     * List&lt;Member&gt; memberList = memberBhv.selectList(cb);
     * memberBhv.<span style="color: #DD4747">load</span>(memberList, loader -&gt; {
     *     loader.<span style="color: #DD4747">loadPurchaseList</span>(purchaseCB -&gt; {
     *         purchaseCB.query().set...
     *         purchaseCB.query().addOrderBy_PurchasePrice_Desc();
     *     }); <span style="color: #3F7E5E">// you can also load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedList(purchaseLoader -&gt {</span>
     *     <span style="color: #3F7E5E">//    purchaseLoader.loadPurchasePaymentList(...);</span>
     *     <span style="color: #3F7E5E">//});</span>
     *
     *     <span style="color: #3F7E5E">// you can also pull out foreign table and load its referrer</span>
     *     <span style="color: #3F7E5E">// (setupSelect of the foreign table should be called)</span>
     *     <span style="color: #3F7E5E">//loader.pulloutMemberStatus().loadMemberLoginList(...)</span>
     * }
     * for (Member member : memberList) {
     *     List&lt;Purchase&gt; purchaseList = member.<span style="color: #DD4747">getPurchaseList()</span>;
     *     for (Purchase purchase : purchaseList) {
     *         ...
     *     }
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param whitePerrottaOverProductNestedList The entity list of whitePerrottaOverProductNested. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhitePerrottaOverProductNested> whitePerrottaOverProductNestedList, ReferrerLoaderHandler<LoaderOfWhitePerrottaOverProductNested> handler) {
        xassLRArg(whitePerrottaOverProductNestedList, handler);
        handler.handle(new LoaderOfWhitePerrottaOverProductNested().ready(whitePerrottaOverProductNestedList, _behaviorSelector));
    }

    /**
     * Load referrer of ${referrer.referrerJavaBeansRulePropertyName} by the referrer loader. <br />
     * <pre>
     * MemberCB cb = new MemberCB();
     * cb.query().set...
     * Member member = memberBhv.selectEntityWithDeletedCheck(cb);
     * memberBhv.<span style="color: #DD4747">load</span>(member, loader -&gt; {
     *     loader.<span style="color: #DD4747">loadPurchaseList</span>(purchaseCB -&gt; {
     *         purchaseCB.query().set...
     *         purchaseCB.query().addOrderBy_PurchasePrice_Desc();
     *     }); <span style="color: #3F7E5E">// you can also load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedList(purchaseLoader -&gt {</span>
     *     <span style="color: #3F7E5E">//    purchaseLoader.loadPurchasePaymentList(...);</span>
     *     <span style="color: #3F7E5E">//});</span>
     *
     *     <span style="color: #3F7E5E">// you can also pull out foreign table and load its referrer</span>
     *     <span style="color: #3F7E5E">// (setupSelect of the foreign table should be called)</span>
     *     <span style="color: #3F7E5E">//loader.pulloutMemberStatus().loadMemberLoginList(...)</span>
     * }
     * for (Member member : memberList) {
     *     List&lt;Purchase&gt; purchaseList = member.<span style="color: #DD4747">getPurchaseList()</span>;
     *     for (Purchase purchase : purchaseList) {
     *         ...
     *     }
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param whitePerrottaOverProductNested The entity of whitePerrottaOverProductNested. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhitePerrottaOverProductNested whitePerrottaOverProductNested, ReferrerLoaderHandler<LoaderOfWhitePerrottaOverProductNested> handler) {
        xassLRArg(whitePerrottaOverProductNested, handler);
        handler.handle(new LoaderOfWhitePerrottaOverProductNested().ready(xnewLRAryLs(whitePerrottaOverProductNested), _behaviorSelector));
    }

    /**
     * Load referrer of whitePerrottaOverProductList by the set-upper of referrer. <br />
     * white_perrotta_over_product by PRODUCT_NESTED_CODE, named 'whitePerrottaOverProductList'.
     * <pre>
     * whitePerrottaOverProductNestedBhv.<span style="color: #DD4747">loadWhitePerrottaOverProductList</span>(whitePerrottaOverProductNestedList, new ConditionBeanSetupper&lt;WhitePerrottaOverProductCB&gt;() {
     *     public void setup(WhitePerrottaOverProductCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (WhitePerrottaOverProductNested whitePerrottaOverProductNested : whitePerrottaOverProductNestedList) {
     *     ... = whitePerrottaOverProductNested.<span style="color: #DD4747">getWhitePerrottaOverProductList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductNestedCode_InScope(pkList);
     * cb.query().addOrderBy_ProductNestedCode_Asc();
     * </pre>
     * @param whitePerrottaOverProductNestedList The entity list of whitePerrottaOverProductNested. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhitePerrottaOverProduct> loadWhitePerrottaOverProductList(List<WhitePerrottaOverProductNested> whitePerrottaOverProductNestedList, ConditionBeanSetupper<WhitePerrottaOverProductCB> setupper) {
        xassLRArg(whitePerrottaOverProductNestedList, setupper);
        return doLoadWhitePerrottaOverProductList(whitePerrottaOverProductNestedList, new LoadReferrerOption<WhitePerrottaOverProductCB, WhitePerrottaOverProduct>().xinit(setupper));
    }

    /**
     * Load referrer of whitePerrottaOverProductList by the set-upper of referrer. <br />
     * white_perrotta_over_product by PRODUCT_NESTED_CODE, named 'whitePerrottaOverProductList'.
     * <pre>
     * whitePerrottaOverProductNestedBhv.<span style="color: #DD4747">loadWhitePerrottaOverProductList</span>(whitePerrottaOverProductNestedList, new ConditionBeanSetupper&lt;WhitePerrottaOverProductCB&gt;() {
     *     public void setup(WhitePerrottaOverProductCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = whitePerrottaOverProductNested.<span style="color: #DD4747">getWhitePerrottaOverProductList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductNestedCode_InScope(pkList);
     * cb.query().addOrderBy_ProductNestedCode_Asc();
     * </pre>
     * @param whitePerrottaOverProductNested The entity of whitePerrottaOverProductNested. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhitePerrottaOverProduct> loadWhitePerrottaOverProductList(WhitePerrottaOverProductNested whitePerrottaOverProductNested, ConditionBeanSetupper<WhitePerrottaOverProductCB> setupper) {
        xassLRArg(whitePerrottaOverProductNested, setupper);
        return doLoadWhitePerrottaOverProductList(xnewLRLs(whitePerrottaOverProductNested), new LoadReferrerOption<WhitePerrottaOverProductCB, WhitePerrottaOverProduct>().xinit(setupper));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param whitePerrottaOverProductNested The entity of whitePerrottaOverProductNested. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhitePerrottaOverProduct> loadWhitePerrottaOverProductList(WhitePerrottaOverProductNested whitePerrottaOverProductNested, LoadReferrerOption<WhitePerrottaOverProductCB, WhitePerrottaOverProduct> loadReferrerOption) {
        xassLRArg(whitePerrottaOverProductNested, loadReferrerOption);
        return loadWhitePerrottaOverProductList(xnewLRLs(whitePerrottaOverProductNested), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param whitePerrottaOverProductNestedList The entity list of whitePerrottaOverProductNested. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WhitePerrottaOverProduct> loadWhitePerrottaOverProductList(List<WhitePerrottaOverProductNested> whitePerrottaOverProductNestedList, LoadReferrerOption<WhitePerrottaOverProductCB, WhitePerrottaOverProduct> loadReferrerOption) {
        xassLRArg(whitePerrottaOverProductNestedList, loadReferrerOption);
        if (whitePerrottaOverProductNestedList.isEmpty()) { return (NestedReferrerListGateway<WhitePerrottaOverProduct>)EMPTY_NREF_LGWAY; }
        return doLoadWhitePerrottaOverProductList(whitePerrottaOverProductNestedList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WhitePerrottaOverProduct> doLoadWhitePerrottaOverProductList(List<WhitePerrottaOverProductNested> whitePerrottaOverProductNestedList, LoadReferrerOption<WhitePerrottaOverProductCB, WhitePerrottaOverProduct> option) {
        return helpLoadReferrerInternally(whitePerrottaOverProductNestedList, option, "whitePerrottaOverProductList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key productNestedCode.
     * @param whitePerrottaOverProductNestedList The list of whitePerrottaOverProductNested. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractProductNestedCodeList(List<WhitePerrottaOverProductNested> whitePerrottaOverProductNestedList)
    { return helpExtractListInternally(whitePerrottaOverProductNestedList, "productNestedCode"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhitePerrottaOverProductNested whitePerrottaOverProductNested = new WhitePerrottaOverProductNested();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whitePerrottaOverProductNested.setFoo...(value);
     * whitePerrottaOverProductNested.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverProductNested.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverProductNested.set...;</span>
     * whitePerrottaOverProductNestedBhv.<span style="color: #DD4747">insert</span>(whitePerrottaOverProductNested);
     * ... = whitePerrottaOverProductNested.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whitePerrottaOverProductNested The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhitePerrottaOverProductNested whitePerrottaOverProductNested) {
        doInsert(whitePerrottaOverProductNested, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhitePerrottaOverProductNested whitePerrottaOverProductNested = new WhitePerrottaOverProductNested();
     * whitePerrottaOverProductNested.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whitePerrottaOverProductNested.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverProductNested.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverProductNested.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whitePerrottaOverProductNested.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whitePerrottaOverProductNestedBhv.<span style="color: #DD4747">update</span>(whitePerrottaOverProductNested);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whitePerrottaOverProductNested The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhitePerrottaOverProductNested whitePerrottaOverProductNested) {
        doUpdate(whitePerrottaOverProductNested, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param whitePerrottaOverProductNested The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhitePerrottaOverProductNested whitePerrottaOverProductNested) {
        doInsertOrUpdate(whitePerrottaOverProductNested, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhitePerrottaOverProductNested whitePerrottaOverProductNested = new WhitePerrottaOverProductNested();
     * whitePerrottaOverProductNested.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whitePerrottaOverProductNested.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whitePerrottaOverProductNestedBhv.<span style="color: #DD4747">delete</span>(whitePerrottaOverProductNested);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whitePerrottaOverProductNested The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhitePerrottaOverProductNested whitePerrottaOverProductNested) {
        doDelete(whitePerrottaOverProductNested, null);
    }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch-insert the entity list modified-only of same-set columns. (DefaultConstraintsEnabled) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <p><span style="color: #DD4747; font-size: 120%">The columns of least common multiple are registered like this:</span></p>
     * <pre>
     * for (... : ...) {
     *     WhitePerrottaOverProductNested whitePerrottaOverProductNested = new WhitePerrottaOverProductNested();
     *     whitePerrottaOverProductNested.setFooName("foo");
     *     if (...) {
     *         whitePerrottaOverProductNested.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whitePerrottaOverProductNestedList.add(whitePerrottaOverProductNested);
     * }
     * whitePerrottaOverProductNestedBhv.<span style="color: #DD4747">batchInsert</span>(whitePerrottaOverProductNestedList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whitePerrottaOverProductNestedList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhitePerrottaOverProductNested> whitePerrottaOverProductNestedList) {
        return doBatchInsert(whitePerrottaOverProductNestedList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhitePerrottaOverProductNested whitePerrottaOverProductNested = new WhitePerrottaOverProductNested();
     *     whitePerrottaOverProductNested.setFooName("foo");
     *     if (...) {
     *         whitePerrottaOverProductNested.setFooPrice(123);
     *     } else {
     *         whitePerrottaOverProductNested.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whitePerrottaOverProductNested.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whitePerrottaOverProductNestedList.add(whitePerrottaOverProductNested);
     * }
     * whitePerrottaOverProductNestedBhv.<span style="color: #DD4747">batchUpdate</span>(whitePerrottaOverProductNestedList);
     * </pre>
     * @param whitePerrottaOverProductNestedList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhitePerrottaOverProductNested> whitePerrottaOverProductNestedList) {
        return doBatchUpdate(whitePerrottaOverProductNestedList, null);
    }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * whitePerrottaOverProductNestedBhv.<span style="color: #DD4747">batchUpdate</span>(whitePerrottaOverProductNestedList, new SpecifyQuery<WhitePerrottaOverProductNestedCB>() {
     *     public void specify(WhitePerrottaOverProductNestedCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whitePerrottaOverProductNestedBhv.<span style="color: #DD4747">batchUpdate</span>(whitePerrottaOverProductNestedList, new SpecifyQuery<WhitePerrottaOverProductNestedCB>() {
     *     public void specify(WhitePerrottaOverProductNestedCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whitePerrottaOverProductNestedList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhitePerrottaOverProductNested> whitePerrottaOverProductNestedList, SpecifyQuery<WhitePerrottaOverProductNestedCB> updateColumnSpec) {
        return doBatchUpdate(whitePerrottaOverProductNestedList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whitePerrottaOverProductNestedList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhitePerrottaOverProductNested> whitePerrottaOverProductNestedList) {
        return doBatchDelete(whitePerrottaOverProductNestedList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * whitePerrottaOverProductNestedBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhitePerrottaOverProductNested, WhitePerrottaOverProductNestedCB&gt;() {
     *     public ConditionBean setup(WhitePerrottaOverProductNested entity, WhitePerrottaOverProductNestedCB intoCB) {
     *         FooCB cb = FooCB();
     *         cb.setupSelect_Bar();
     *
     *         <span style="color: #3F7E5E">// mapping</span>
     *         intoCB.specify().columnMyName().mappedFrom(cb.specify().columnFooName());
     *         intoCB.specify().columnMyCount().mappedFrom(cb.specify().columnFooCount());
     *         intoCB.specify().columnMyDate().mappedFrom(cb.specify().specifyBar().columnBarDate());
     *         entity.setMyFixedValue("foo"); <span style="color: #3F7E5E">// fixed value</span>
     *         <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     *         <span style="color: #3F7E5E">//entity.setRegisterUser(value);</span>
     *         <span style="color: #3F7E5E">//entity.set...;</span>
     *         <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     *         <span style="color: #3F7E5E">//entity.setVersionNo(value);</span>
     *
     *         return cb;
     *     }
     * });
     * </pre>
     * @param setupper The set-upper of query-insert. (NotNull)
     * @return The inserted count.
     */
    public int queryInsert(QueryInsertSetupper<WhitePerrottaOverProductNested, WhitePerrottaOverProductNestedCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhitePerrottaOverProductNested whitePerrottaOverProductNested = new WhitePerrottaOverProductNested();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverProductNested.setPK...(value);</span>
     * whitePerrottaOverProductNested.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverProductNested.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverProductNested.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverProductNested.setVersionNo(value);</span>
     * WhitePerrottaOverProductNestedCB cb = new WhitePerrottaOverProductNestedCB();
     * cb.query().setFoo...(value);
     * whitePerrottaOverProductNestedBhv.<span style="color: #DD4747">queryUpdate</span>(whitePerrottaOverProductNested, cb);
     * </pre>
     * @param whitePerrottaOverProductNested The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhitePerrottaOverProductNested. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhitePerrottaOverProductNested whitePerrottaOverProductNested, WhitePerrottaOverProductNestedCB cb) {
        return doQueryUpdate(whitePerrottaOverProductNested, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhitePerrottaOverProductNestedCB cb = new WhitePerrottaOverProductNestedCB();
     * cb.query().setFoo...(value);
     * whitePerrottaOverProductNestedBhv.<span style="color: #DD4747">queryDelete</span>(whitePerrottaOverProductNested, cb);
     * </pre>
     * @param cb The condition-bean of WhitePerrottaOverProductNested. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhitePerrottaOverProductNestedCB cb) {
        return doQueryDelete(cb, null);
    }

    // ===================================================================================
    //                                                                      Varying Update
    //                                                                      ==============
    // -----------------------------------------------------
    //                                         Entity Update
    //                                         -------------
    /**
     * Insert the entity with varying requests. <br />
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br />
     * Other specifications are same as insert(entity).
     * <pre>
     * WhitePerrottaOverProductNested whitePerrottaOverProductNested = new WhitePerrottaOverProductNested();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whitePerrottaOverProductNested.setFoo...(value);
     * whitePerrottaOverProductNested.setBar...(value);
     * InsertOption<WhitePerrottaOverProductNestedCB> option = new InsertOption<WhitePerrottaOverProductNestedCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whitePerrottaOverProductNestedBhv.<span style="color: #DD4747">varyingInsert</span>(whitePerrottaOverProductNested, option);
     * ... = whitePerrottaOverProductNested.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whitePerrottaOverProductNested The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhitePerrottaOverProductNested whitePerrottaOverProductNested, InsertOption<WhitePerrottaOverProductNestedCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whitePerrottaOverProductNested, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhitePerrottaOverProductNested whitePerrottaOverProductNested = new WhitePerrottaOverProductNested();
     * whitePerrottaOverProductNested.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whitePerrottaOverProductNested.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whitePerrottaOverProductNested.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhitePerrottaOverProductNestedCB&gt; option = new UpdateOption&lt;WhitePerrottaOverProductNestedCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhitePerrottaOverProductNestedCB&gt;() {
     *         public void specify(WhitePerrottaOverProductNestedCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whitePerrottaOverProductNestedBhv.<span style="color: #DD4747">varyingUpdate</span>(whitePerrottaOverProductNested, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whitePerrottaOverProductNested The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhitePerrottaOverProductNested whitePerrottaOverProductNested, UpdateOption<WhitePerrottaOverProductNestedCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whitePerrottaOverProductNested, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whitePerrottaOverProductNested The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhitePerrottaOverProductNested whitePerrottaOverProductNested, InsertOption<WhitePerrottaOverProductNestedCB> insertOption, UpdateOption<WhitePerrottaOverProductNestedCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdate(whitePerrottaOverProductNested, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whitePerrottaOverProductNested The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhitePerrottaOverProductNested whitePerrottaOverProductNested, DeleteOption<WhitePerrottaOverProductNestedCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whitePerrottaOverProductNested, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whitePerrottaOverProductNestedList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhitePerrottaOverProductNested> whitePerrottaOverProductNestedList, InsertOption<WhitePerrottaOverProductNestedCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whitePerrottaOverProductNestedList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whitePerrottaOverProductNestedList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhitePerrottaOverProductNested> whitePerrottaOverProductNestedList, UpdateOption<WhitePerrottaOverProductNestedCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whitePerrottaOverProductNestedList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whitePerrottaOverProductNestedList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhitePerrottaOverProductNested> whitePerrottaOverProductNestedList, DeleteOption<WhitePerrottaOverProductNestedCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whitePerrottaOverProductNestedList, option);
    }

    // -----------------------------------------------------
    //                                          Query Update
    //                                          ------------
    /**
     * Insert the several entities by query with varying requests (modified-only for fixed value). <br />
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br />
     * Other specifications are same as queryInsert(entity, setupper).
     * @param setupper The set-upper of query-insert. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The inserted count.
     */
    public int varyingQueryInsert(QueryInsertSetupper<WhitePerrottaOverProductNested, WhitePerrottaOverProductNestedCB> setupper, InsertOption<WhitePerrottaOverProductNestedCB> option) {
        assertInsertOptionNotNull(option);
        return doQueryInsert(setupper, option);
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br />
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhitePerrottaOverProductNested whitePerrottaOverProductNested = new WhitePerrottaOverProductNested();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverProductNested.setPK...(value);</span>
     * whitePerrottaOverProductNested.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whitePerrottaOverProductNested.setVersionNo(value);</span>
     * WhitePerrottaOverProductNestedCB cb = new WhitePerrottaOverProductNestedCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhitePerrottaOverProductNestedCB&gt; option = new UpdateOption&lt;WhitePerrottaOverProductNestedCB&gt;();
     * option.self(new SpecifyQuery&lt;WhitePerrottaOverProductNestedCB&gt;() {
     *     public void specify(WhitePerrottaOverProductNestedCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whitePerrottaOverProductNestedBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whitePerrottaOverProductNested, cb, option);
     * </pre>
     * @param whitePerrottaOverProductNested The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhitePerrottaOverProductNested. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhitePerrottaOverProductNested whitePerrottaOverProductNested, WhitePerrottaOverProductNestedCB cb, UpdateOption<WhitePerrottaOverProductNestedCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whitePerrottaOverProductNested, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of WhitePerrottaOverProductNested. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhitePerrottaOverProductNestedCB cb, DeleteOption<WhitePerrottaOverProductNestedCB> option) {
        assertDeleteOptionNotNull(option);
        return doQueryDelete(cb, option);
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the basic executor of outside-SQL to execute it. <br />
     * The invoker of behavior command should be not null when you call this method.
     * <pre>
     * You can use the methods for outside-SQL are as follows:
     * {Basic}
     *   o selectList()
     *   o execute()
     *   o call()
     *
     * {Entity}
     *   o entityHandling().selectEntity()
     *   o entityHandling().selectEntityWithDeletedCheck()
     *
     * {Paging}
     *   o autoPaging().selectList()
     *   o autoPaging().selectPage()
     *   o manualPaging().selectList()
     *   o manualPaging().selectPage()
     *
     * {Cursor}
     *   o cursorHandling().selectCursor()
     *
     * {Option}
     *   o dynamicBinding().selectList()
     *   o removeBlockComment().selectList()
     *   o removeLineComment().selectList()
     *   o formatSql().selectList()
     * </pre>
     * @return The basic executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<WhitePerrottaOverProductNestedBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<WhitePerrottaOverProductNestedBhv> facadeExecutor = doOutsideSql();
        return facadeExecutor.xbasicExecutor(); // variable to resolve generic type
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends WhitePerrottaOverProductNested> typeOfSelectedEntity() { return WhitePerrottaOverProductNested.class; }
    protected Class<WhitePerrottaOverProductNested> typeOfHandlingEntity() { return WhitePerrottaOverProductNested.class; }
    protected Class<WhitePerrottaOverProductNestedCB> typeOfHandlingConditionBean() { return WhitePerrottaOverProductNestedCB.class; }
}
