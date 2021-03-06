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
 * The behavior of WHITE_ALL_IN_ONE_CLS_CATEGORY as TABLE. <br />
 * <pre>
 * [primary key]
 *     CLS_CATEGORY_CODE
 *
 * [column]
 *     CLS_CATEGORY_CODE, CLS_CATEGORY_NAME, DESCRIPTION
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
 *     white_all_in_one_cls_element
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whiteAllInOneClsElementList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteAllInOneClsCategoryBhv extends AbstractBehaviorWritable<WhiteAllInOneClsCategory, WhiteAllInOneClsCategoryCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public WhiteAllInOneClsCategoryDbm getDBMeta() { return WhiteAllInOneClsCategoryDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteAllInOneClsCategoryDbm getMyDBMeta() { return WhiteAllInOneClsCategoryDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhiteAllInOneClsCategoryCB newConditionBean() { return new WhiteAllInOneClsCategoryCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteAllInOneClsCategory newMyEntity() { return new WhiteAllInOneClsCategory(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteAllInOneClsCategoryCB newMyConditionBean() { return new WhiteAllInOneClsCategoryCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteAllInOneClsCategoryCB cb = new WhiteAllInOneClsCategoryCB();
     * cb.query().setFoo...(value);
     * int count = whiteAllInOneClsCategoryBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteAllInOneClsCategory. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteAllInOneClsCategoryCB cb) {
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
     * WhiteAllInOneClsCategoryCB cb = new WhiteAllInOneClsCategoryCB();
     * cb.query().setFoo...(value);
     * WhiteAllInOneClsCategory whiteAllInOneClsCategory = whiteAllInOneClsCategoryBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (whiteAllInOneClsCategory != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = whiteAllInOneClsCategory.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteAllInOneClsCategory. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteAllInOneClsCategory selectEntity(WhiteAllInOneClsCategoryCB cb) {
        return facadeSelectEntity(cb);
    }

    protected WhiteAllInOneClsCategory facadeSelectEntity(WhiteAllInOneClsCategoryCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteAllInOneClsCategory> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteAllInOneClsCategoryCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * WhiteAllInOneClsCategoryCB cb = new WhiteAllInOneClsCategoryCB();
     * cb.query().setFoo...(value);
     * WhiteAllInOneClsCategory whiteAllInOneClsCategory = whiteAllInOneClsCategoryBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteAllInOneClsCategory.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteAllInOneClsCategory. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteAllInOneClsCategory selectEntityWithDeletedCheck(WhiteAllInOneClsCategoryCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param clsCategoryCode : PK, NotNull, CHAR(3). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteAllInOneClsCategory selectByPKValue(String clsCategoryCode) {
        return facadeSelectByPKValue(clsCategoryCode);
    }

    protected WhiteAllInOneClsCategory facadeSelectByPKValue(String clsCategoryCode) {
        return doSelectByPK(clsCategoryCode, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteAllInOneClsCategory> ENTITY doSelectByPK(String clsCategoryCode, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(clsCategoryCode), tp);
    }

    protected <ENTITY extends WhiteAllInOneClsCategory> OptionalEntity<ENTITY> doSelectOptionalByPK(String clsCategoryCode, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(clsCategoryCode, tp), clsCategoryCode);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param clsCategoryCode : PK, NotNull, CHAR(3). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteAllInOneClsCategory selectByPKValueWithDeletedCheck(String clsCategoryCode) {
        return doSelectByPKWithDeletedCheck(clsCategoryCode, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteAllInOneClsCategory> ENTITY doSelectByPKWithDeletedCheck(String clsCategoryCode, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(clsCategoryCode), tp);
    }

    protected WhiteAllInOneClsCategoryCB xprepareCBAsPK(String clsCategoryCode) {
        assertObjectNotNull("clsCategoryCode", clsCategoryCode);
        return newConditionBean().acceptPK(clsCategoryCode);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteAllInOneClsCategoryCB cb = new WhiteAllInOneClsCategoryCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteAllInOneClsCategory&gt; whiteAllInOneClsCategoryList = whiteAllInOneClsCategoryBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteAllInOneClsCategory whiteAllInOneClsCategory : whiteAllInOneClsCategoryList) {
     *     ... = whiteAllInOneClsCategory.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteAllInOneClsCategory. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteAllInOneClsCategory> selectList(WhiteAllInOneClsCategoryCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * WhiteAllInOneClsCategoryCB cb = new WhiteAllInOneClsCategoryCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteAllInOneClsCategory&gt; page = whiteAllInOneClsCategoryBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteAllInOneClsCategory whiteAllInOneClsCategory : page) {
     *     ... = whiteAllInOneClsCategory.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteAllInOneClsCategory. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteAllInOneClsCategory> selectPage(WhiteAllInOneClsCategoryCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteAllInOneClsCategoryCB cb = new WhiteAllInOneClsCategoryCB();
     * cb.query().setFoo...(value);
     * whiteAllInOneClsCategoryBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteAllInOneClsCategory&gt;() {
     *     public void handle(WhiteAllInOneClsCategory entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteAllInOneClsCategory. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteAllInOneClsCategory. (NotNull)
     */
    public void selectCursor(WhiteAllInOneClsCategoryCB cb, EntityRowHandler<WhiteAllInOneClsCategory> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteAllInOneClsCategoryBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteAllInOneClsCategoryCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhiteAllInOneClsCategoryCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param whiteAllInOneClsCategoryList The entity list of whiteAllInOneClsCategory. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhiteAllInOneClsCategory> whiteAllInOneClsCategoryList, ReferrerLoaderHandler<LoaderOfWhiteAllInOneClsCategory> handler) {
        xassLRArg(whiteAllInOneClsCategoryList, handler);
        handler.handle(new LoaderOfWhiteAllInOneClsCategory().ready(whiteAllInOneClsCategoryList, _behaviorSelector));
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
     * @param whiteAllInOneClsCategory The entity of whiteAllInOneClsCategory. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhiteAllInOneClsCategory whiteAllInOneClsCategory, ReferrerLoaderHandler<LoaderOfWhiteAllInOneClsCategory> handler) {
        xassLRArg(whiteAllInOneClsCategory, handler);
        handler.handle(new LoaderOfWhiteAllInOneClsCategory().ready(xnewLRAryLs(whiteAllInOneClsCategory), _behaviorSelector));
    }

    /**
     * Load referrer of whiteAllInOneClsElementList by the set-upper of referrer. <br />
     * white_all_in_one_cls_element by CLS_CATEGORY_CODE, named 'whiteAllInOneClsElementList'.
     * <pre>
     * whiteAllInOneClsCategoryBhv.<span style="color: #DD4747">loadWhiteAllInOneClsElementList</span>(whiteAllInOneClsCategoryList, new ConditionBeanSetupper&lt;WhiteAllInOneClsElementCB&gt;() {
     *     public void setup(WhiteAllInOneClsElementCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (WhiteAllInOneClsCategory whiteAllInOneClsCategory : whiteAllInOneClsCategoryList) {
     *     ... = whiteAllInOneClsCategory.<span style="color: #DD4747">getWhiteAllInOneClsElementList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClsCategoryCode_InScope(pkList);
     * cb.query().addOrderBy_ClsCategoryCode_Asc();
     * </pre>
     * @param whiteAllInOneClsCategoryList The entity list of whiteAllInOneClsCategory. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteAllInOneClsElement> loadWhiteAllInOneClsElementList(List<WhiteAllInOneClsCategory> whiteAllInOneClsCategoryList, ConditionBeanSetupper<WhiteAllInOneClsElementCB> setupper) {
        xassLRArg(whiteAllInOneClsCategoryList, setupper);
        return doLoadWhiteAllInOneClsElementList(whiteAllInOneClsCategoryList, new LoadReferrerOption<WhiteAllInOneClsElementCB, WhiteAllInOneClsElement>().xinit(setupper));
    }

    /**
     * Load referrer of whiteAllInOneClsElementList by the set-upper of referrer. <br />
     * white_all_in_one_cls_element by CLS_CATEGORY_CODE, named 'whiteAllInOneClsElementList'.
     * <pre>
     * whiteAllInOneClsCategoryBhv.<span style="color: #DD4747">loadWhiteAllInOneClsElementList</span>(whiteAllInOneClsCategoryList, new ConditionBeanSetupper&lt;WhiteAllInOneClsElementCB&gt;() {
     *     public void setup(WhiteAllInOneClsElementCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = whiteAllInOneClsCategory.<span style="color: #DD4747">getWhiteAllInOneClsElementList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClsCategoryCode_InScope(pkList);
     * cb.query().addOrderBy_ClsCategoryCode_Asc();
     * </pre>
     * @param whiteAllInOneClsCategory The entity of whiteAllInOneClsCategory. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteAllInOneClsElement> loadWhiteAllInOneClsElementList(WhiteAllInOneClsCategory whiteAllInOneClsCategory, ConditionBeanSetupper<WhiteAllInOneClsElementCB> setupper) {
        xassLRArg(whiteAllInOneClsCategory, setupper);
        return doLoadWhiteAllInOneClsElementList(xnewLRLs(whiteAllInOneClsCategory), new LoadReferrerOption<WhiteAllInOneClsElementCB, WhiteAllInOneClsElement>().xinit(setupper));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param whiteAllInOneClsCategory The entity of whiteAllInOneClsCategory. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteAllInOneClsElement> loadWhiteAllInOneClsElementList(WhiteAllInOneClsCategory whiteAllInOneClsCategory, LoadReferrerOption<WhiteAllInOneClsElementCB, WhiteAllInOneClsElement> loadReferrerOption) {
        xassLRArg(whiteAllInOneClsCategory, loadReferrerOption);
        return loadWhiteAllInOneClsElementList(xnewLRLs(whiteAllInOneClsCategory), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param whiteAllInOneClsCategoryList The entity list of whiteAllInOneClsCategory. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WhiteAllInOneClsElement> loadWhiteAllInOneClsElementList(List<WhiteAllInOneClsCategory> whiteAllInOneClsCategoryList, LoadReferrerOption<WhiteAllInOneClsElementCB, WhiteAllInOneClsElement> loadReferrerOption) {
        xassLRArg(whiteAllInOneClsCategoryList, loadReferrerOption);
        if (whiteAllInOneClsCategoryList.isEmpty()) { return (NestedReferrerListGateway<WhiteAllInOneClsElement>)EMPTY_NREF_LGWAY; }
        return doLoadWhiteAllInOneClsElementList(whiteAllInOneClsCategoryList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WhiteAllInOneClsElement> doLoadWhiteAllInOneClsElementList(List<WhiteAllInOneClsCategory> whiteAllInOneClsCategoryList, LoadReferrerOption<WhiteAllInOneClsElementCB, WhiteAllInOneClsElement> option) {
        return helpLoadReferrerInternally(whiteAllInOneClsCategoryList, option, "whiteAllInOneClsElementList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key clsCategoryCode.
     * @param whiteAllInOneClsCategoryList The list of whiteAllInOneClsCategory. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractClsCategoryCodeList(List<WhiteAllInOneClsCategory> whiteAllInOneClsCategoryList)
    { return helpExtractListInternally(whiteAllInOneClsCategoryList, "clsCategoryCode"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteAllInOneClsCategory whiteAllInOneClsCategory = new WhiteAllInOneClsCategory();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteAllInOneClsCategory.setFoo...(value);
     * whiteAllInOneClsCategory.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsCategory.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsCategory.set...;</span>
     * whiteAllInOneClsCategoryBhv.<span style="color: #DD4747">insert</span>(whiteAllInOneClsCategory);
     * ... = whiteAllInOneClsCategory.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteAllInOneClsCategory The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteAllInOneClsCategory whiteAllInOneClsCategory) {
        doInsert(whiteAllInOneClsCategory, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteAllInOneClsCategory whiteAllInOneClsCategory = new WhiteAllInOneClsCategory();
     * whiteAllInOneClsCategory.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteAllInOneClsCategory.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsCategory.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsCategory.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteAllInOneClsCategory.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteAllInOneClsCategoryBhv.<span style="color: #DD4747">update</span>(whiteAllInOneClsCategory);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteAllInOneClsCategory The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhiteAllInOneClsCategory whiteAllInOneClsCategory) {
        doUpdate(whiteAllInOneClsCategory, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param whiteAllInOneClsCategory The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteAllInOneClsCategory whiteAllInOneClsCategory) {
        doInsertOrUpdate(whiteAllInOneClsCategory, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteAllInOneClsCategory whiteAllInOneClsCategory = new WhiteAllInOneClsCategory();
     * whiteAllInOneClsCategory.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteAllInOneClsCategory.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteAllInOneClsCategoryBhv.<span style="color: #DD4747">delete</span>(whiteAllInOneClsCategory);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteAllInOneClsCategory The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteAllInOneClsCategory whiteAllInOneClsCategory) {
        doDelete(whiteAllInOneClsCategory, null);
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
     *     WhiteAllInOneClsCategory whiteAllInOneClsCategory = new WhiteAllInOneClsCategory();
     *     whiteAllInOneClsCategory.setFooName("foo");
     *     if (...) {
     *         whiteAllInOneClsCategory.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteAllInOneClsCategoryList.add(whiteAllInOneClsCategory);
     * }
     * whiteAllInOneClsCategoryBhv.<span style="color: #DD4747">batchInsert</span>(whiteAllInOneClsCategoryList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteAllInOneClsCategoryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteAllInOneClsCategory> whiteAllInOneClsCategoryList) {
        return doBatchInsert(whiteAllInOneClsCategoryList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhiteAllInOneClsCategory whiteAllInOneClsCategory = new WhiteAllInOneClsCategory();
     *     whiteAllInOneClsCategory.setFooName("foo");
     *     if (...) {
     *         whiteAllInOneClsCategory.setFooPrice(123);
     *     } else {
     *         whiteAllInOneClsCategory.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteAllInOneClsCategory.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteAllInOneClsCategoryList.add(whiteAllInOneClsCategory);
     * }
     * whiteAllInOneClsCategoryBhv.<span style="color: #DD4747">batchUpdate</span>(whiteAllInOneClsCategoryList);
     * </pre>
     * @param whiteAllInOneClsCategoryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteAllInOneClsCategory> whiteAllInOneClsCategoryList) {
        return doBatchUpdate(whiteAllInOneClsCategoryList, null);
    }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * whiteAllInOneClsCategoryBhv.<span style="color: #DD4747">batchUpdate</span>(whiteAllInOneClsCategoryList, new SpecifyQuery<WhiteAllInOneClsCategoryCB>() {
     *     public void specify(WhiteAllInOneClsCategoryCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteAllInOneClsCategoryBhv.<span style="color: #DD4747">batchUpdate</span>(whiteAllInOneClsCategoryList, new SpecifyQuery<WhiteAllInOneClsCategoryCB>() {
     *     public void specify(WhiteAllInOneClsCategoryCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteAllInOneClsCategoryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteAllInOneClsCategory> whiteAllInOneClsCategoryList, SpecifyQuery<WhiteAllInOneClsCategoryCB> updateColumnSpec) {
        return doBatchUpdate(whiteAllInOneClsCategoryList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteAllInOneClsCategoryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteAllInOneClsCategory> whiteAllInOneClsCategoryList) {
        return doBatchDelete(whiteAllInOneClsCategoryList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * whiteAllInOneClsCategoryBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteAllInOneClsCategory, WhiteAllInOneClsCategoryCB&gt;() {
     *     public ConditionBean setup(WhiteAllInOneClsCategory entity, WhiteAllInOneClsCategoryCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteAllInOneClsCategory, WhiteAllInOneClsCategoryCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteAllInOneClsCategory whiteAllInOneClsCategory = new WhiteAllInOneClsCategory();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsCategory.setPK...(value);</span>
     * whiteAllInOneClsCategory.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsCategory.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsCategory.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsCategory.setVersionNo(value);</span>
     * WhiteAllInOneClsCategoryCB cb = new WhiteAllInOneClsCategoryCB();
     * cb.query().setFoo...(value);
     * whiteAllInOneClsCategoryBhv.<span style="color: #DD4747">queryUpdate</span>(whiteAllInOneClsCategory, cb);
     * </pre>
     * @param whiteAllInOneClsCategory The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteAllInOneClsCategory. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteAllInOneClsCategory whiteAllInOneClsCategory, WhiteAllInOneClsCategoryCB cb) {
        return doQueryUpdate(whiteAllInOneClsCategory, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteAllInOneClsCategoryCB cb = new WhiteAllInOneClsCategoryCB();
     * cb.query().setFoo...(value);
     * whiteAllInOneClsCategoryBhv.<span style="color: #DD4747">queryDelete</span>(whiteAllInOneClsCategory, cb);
     * </pre>
     * @param cb The condition-bean of WhiteAllInOneClsCategory. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteAllInOneClsCategoryCB cb) {
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
     * WhiteAllInOneClsCategory whiteAllInOneClsCategory = new WhiteAllInOneClsCategory();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteAllInOneClsCategory.setFoo...(value);
     * whiteAllInOneClsCategory.setBar...(value);
     * InsertOption<WhiteAllInOneClsCategoryCB> option = new InsertOption<WhiteAllInOneClsCategoryCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteAllInOneClsCategoryBhv.<span style="color: #DD4747">varyingInsert</span>(whiteAllInOneClsCategory, option);
     * ... = whiteAllInOneClsCategory.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteAllInOneClsCategory The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteAllInOneClsCategory whiteAllInOneClsCategory, InsertOption<WhiteAllInOneClsCategoryCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteAllInOneClsCategory, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteAllInOneClsCategory whiteAllInOneClsCategory = new WhiteAllInOneClsCategory();
     * whiteAllInOneClsCategory.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteAllInOneClsCategory.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteAllInOneClsCategory.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteAllInOneClsCategoryCB&gt; option = new UpdateOption&lt;WhiteAllInOneClsCategoryCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteAllInOneClsCategoryCB&gt;() {
     *         public void specify(WhiteAllInOneClsCategoryCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteAllInOneClsCategoryBhv.<span style="color: #DD4747">varyingUpdate</span>(whiteAllInOneClsCategory, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteAllInOneClsCategory The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteAllInOneClsCategory whiteAllInOneClsCategory, UpdateOption<WhiteAllInOneClsCategoryCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteAllInOneClsCategory, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteAllInOneClsCategory The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteAllInOneClsCategory whiteAllInOneClsCategory, InsertOption<WhiteAllInOneClsCategoryCB> insertOption, UpdateOption<WhiteAllInOneClsCategoryCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdate(whiteAllInOneClsCategory, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteAllInOneClsCategory The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteAllInOneClsCategory whiteAllInOneClsCategory, DeleteOption<WhiteAllInOneClsCategoryCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteAllInOneClsCategory, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteAllInOneClsCategoryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteAllInOneClsCategory> whiteAllInOneClsCategoryList, InsertOption<WhiteAllInOneClsCategoryCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteAllInOneClsCategoryList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteAllInOneClsCategoryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteAllInOneClsCategory> whiteAllInOneClsCategoryList, UpdateOption<WhiteAllInOneClsCategoryCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteAllInOneClsCategoryList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteAllInOneClsCategoryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteAllInOneClsCategory> whiteAllInOneClsCategoryList, DeleteOption<WhiteAllInOneClsCategoryCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteAllInOneClsCategoryList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteAllInOneClsCategory, WhiteAllInOneClsCategoryCB> setupper, InsertOption<WhiteAllInOneClsCategoryCB> option) {
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
     * WhiteAllInOneClsCategory whiteAllInOneClsCategory = new WhiteAllInOneClsCategory();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsCategory.setPK...(value);</span>
     * whiteAllInOneClsCategory.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsCategory.setVersionNo(value);</span>
     * WhiteAllInOneClsCategoryCB cb = new WhiteAllInOneClsCategoryCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteAllInOneClsCategoryCB&gt; option = new UpdateOption&lt;WhiteAllInOneClsCategoryCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteAllInOneClsCategoryCB&gt;() {
     *     public void specify(WhiteAllInOneClsCategoryCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteAllInOneClsCategoryBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteAllInOneClsCategory, cb, option);
     * </pre>
     * @param whiteAllInOneClsCategory The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteAllInOneClsCategory. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteAllInOneClsCategory whiteAllInOneClsCategory, WhiteAllInOneClsCategoryCB cb, UpdateOption<WhiteAllInOneClsCategoryCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteAllInOneClsCategory, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of WhiteAllInOneClsCategory. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteAllInOneClsCategoryCB cb, DeleteOption<WhiteAllInOneClsCategoryCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteAllInOneClsCategoryBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<WhiteAllInOneClsCategoryBhv> facadeExecutor = doOutsideSql();
        return facadeExecutor.xbasicExecutor(); // variable to resolve generic type
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends WhiteAllInOneClsCategory> typeOfSelectedEntity() { return WhiteAllInOneClsCategory.class; }
    protected Class<WhiteAllInOneClsCategory> typeOfHandlingEntity() { return WhiteAllInOneClsCategory.class; }
    protected Class<WhiteAllInOneClsCategoryCB> typeOfHandlingConditionBean() { return WhiteAllInOneClsCategoryCB.class; }
}
