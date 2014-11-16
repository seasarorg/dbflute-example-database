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
 * The behavior of WHITE_VARIANT_RELATION_MASTER_BAR as TABLE. <br />
 * <pre>
 * [primary key]
 *     MASTER_BAR_ID
 *
 * [column]
 *     MASTER_BAR_ID, MASTER_BAR_NAME
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
 *     white_variant_relation_referrer
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whiteVariantRelationReferrerAsVariantList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteVariantRelationMasterBarBhv extends AbstractBehaviorWritable<WhiteVariantRelationMasterBar, WhiteVariantRelationMasterBarCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public WhiteVariantRelationMasterBarDbm getDBMeta() { return WhiteVariantRelationMasterBarDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteVariantRelationMasterBarDbm getMyDBMeta() { return WhiteVariantRelationMasterBarDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhiteVariantRelationMasterBarCB newConditionBean() { return new WhiteVariantRelationMasterBarCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteVariantRelationMasterBar newMyEntity() { return new WhiteVariantRelationMasterBar(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteVariantRelationMasterBarCB newMyConditionBean() { return new WhiteVariantRelationMasterBarCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteVariantRelationMasterBarCB cb = new WhiteVariantRelationMasterBarCB();
     * cb.query().setFoo...(value);
     * int count = whiteVariantRelationMasterBarBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationMasterBar. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteVariantRelationMasterBarCB cb) {
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
     * WhiteVariantRelationMasterBarCB cb = new WhiteVariantRelationMasterBarCB();
     * cb.query().setFoo...(value);
     * WhiteVariantRelationMasterBar whiteVariantRelationMasterBar = whiteVariantRelationMasterBarBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (whiteVariantRelationMasterBar != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = whiteVariantRelationMasterBar.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationMasterBar. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteVariantRelationMasterBar selectEntity(WhiteVariantRelationMasterBarCB cb) {
        return facadeSelectEntity(cb);
    }

    protected WhiteVariantRelationMasterBar facadeSelectEntity(WhiteVariantRelationMasterBarCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteVariantRelationMasterBar> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteVariantRelationMasterBarCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * WhiteVariantRelationMasterBarCB cb = new WhiteVariantRelationMasterBarCB();
     * cb.query().setFoo...(value);
     * WhiteVariantRelationMasterBar whiteVariantRelationMasterBar = whiteVariantRelationMasterBarBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteVariantRelationMasterBar.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationMasterBar. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteVariantRelationMasterBar selectEntityWithDeletedCheck(WhiteVariantRelationMasterBarCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param masterBarId : PK, NotNull, BIGINT(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteVariantRelationMasterBar selectByPKValue(Long masterBarId) {
        return facadeSelectByPKValue(masterBarId);
    }

    protected WhiteVariantRelationMasterBar facadeSelectByPKValue(Long masterBarId) {
        return doSelectByPK(masterBarId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteVariantRelationMasterBar> ENTITY doSelectByPK(Long masterBarId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(masterBarId), tp);
    }

    protected <ENTITY extends WhiteVariantRelationMasterBar> OptionalEntity<ENTITY> doSelectOptionalByPK(Long masterBarId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(masterBarId, tp), masterBarId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param masterBarId : PK, NotNull, BIGINT(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteVariantRelationMasterBar selectByPKValueWithDeletedCheck(Long masterBarId) {
        return doSelectByPKWithDeletedCheck(masterBarId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteVariantRelationMasterBar> ENTITY doSelectByPKWithDeletedCheck(Long masterBarId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(masterBarId), tp);
    }

    protected WhiteVariantRelationMasterBarCB xprepareCBAsPK(Long masterBarId) {
        assertObjectNotNull("masterBarId", masterBarId);
        return newConditionBean().acceptPK(masterBarId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteVariantRelationMasterBarCB cb = new WhiteVariantRelationMasterBarCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteVariantRelationMasterBar&gt; whiteVariantRelationMasterBarList = whiteVariantRelationMasterBarBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteVariantRelationMasterBar whiteVariantRelationMasterBar : whiteVariantRelationMasterBarList) {
     *     ... = whiteVariantRelationMasterBar.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationMasterBar. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteVariantRelationMasterBar> selectList(WhiteVariantRelationMasterBarCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * WhiteVariantRelationMasterBarCB cb = new WhiteVariantRelationMasterBarCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteVariantRelationMasterBar&gt; page = whiteVariantRelationMasterBarBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteVariantRelationMasterBar whiteVariantRelationMasterBar : page) {
     *     ... = whiteVariantRelationMasterBar.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationMasterBar. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteVariantRelationMasterBar> selectPage(WhiteVariantRelationMasterBarCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteVariantRelationMasterBarCB cb = new WhiteVariantRelationMasterBarCB();
     * cb.query().setFoo...(value);
     * whiteVariantRelationMasterBarBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteVariantRelationMasterBar&gt;() {
     *     public void handle(WhiteVariantRelationMasterBar entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationMasterBar. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteVariantRelationMasterBar. (NotNull)
     */
    public void selectCursor(WhiteVariantRelationMasterBarCB cb, EntityRowHandler<WhiteVariantRelationMasterBar> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteVariantRelationMasterBarBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteVariantRelationMasterBarCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhiteVariantRelationMasterBarCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param whiteVariantRelationMasterBarList The entity list of whiteVariantRelationMasterBar. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhiteVariantRelationMasterBar> whiteVariantRelationMasterBarList, ReferrerLoaderHandler<LoaderOfWhiteVariantRelationMasterBar> handler) {
        xassLRArg(whiteVariantRelationMasterBarList, handler);
        handler.handle(new LoaderOfWhiteVariantRelationMasterBar().ready(whiteVariantRelationMasterBarList, _behaviorSelector));
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
     * @param whiteVariantRelationMasterBar The entity of whiteVariantRelationMasterBar. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhiteVariantRelationMasterBar whiteVariantRelationMasterBar, ReferrerLoaderHandler<LoaderOfWhiteVariantRelationMasterBar> handler) {
        xassLRArg(whiteVariantRelationMasterBar, handler);
        handler.handle(new LoaderOfWhiteVariantRelationMasterBar().ready(xnewLRAryLs(whiteVariantRelationMasterBar), _behaviorSelector));
    }

    /**
     * Load referrer of whiteVariantRelationReferrerAsVariantList by the set-upper of referrer. <br />
     * white_variant_relation_referrer by VARIANT_MASTER_ID, named 'whiteVariantRelationReferrerAsVariantList'.
     * <pre>
     * whiteVariantRelationMasterBarBhv.<span style="color: #DD4747">loadWhiteVariantRelationReferrerAsVariantList</span>(whiteVariantRelationMasterBarList, new ConditionBeanSetupper&lt;WhiteVariantRelationReferrerCB&gt;() {
     *     public void setup(WhiteVariantRelationReferrerCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (WhiteVariantRelationMasterBar whiteVariantRelationMasterBar : whiteVariantRelationMasterBarList) {
     *     ... = whiteVariantRelationMasterBar.<span style="color: #DD4747">getWhiteVariantRelationReferrerAsVariantList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setVariantMasterId_InScope(pkList);
     * cb.query().addOrderBy_VariantMasterId_Asc();
     * </pre>
     * @param whiteVariantRelationMasterBarList The entity list of whiteVariantRelationMasterBar. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteVariantRelationReferrer> loadWhiteVariantRelationReferrerAsVariantList(List<WhiteVariantRelationMasterBar> whiteVariantRelationMasterBarList, ConditionBeanSetupper<WhiteVariantRelationReferrerCB> setupper) {
        xassLRArg(whiteVariantRelationMasterBarList, setupper);
        return doLoadWhiteVariantRelationReferrerAsVariantList(whiteVariantRelationMasterBarList, new LoadReferrerOption<WhiteVariantRelationReferrerCB, WhiteVariantRelationReferrer>().xinit(setupper));
    }

    /**
     * Load referrer of whiteVariantRelationReferrerAsVariantList by the set-upper of referrer. <br />
     * white_variant_relation_referrer by VARIANT_MASTER_ID, named 'whiteVariantRelationReferrerAsVariantList'.
     * <pre>
     * whiteVariantRelationMasterBarBhv.<span style="color: #DD4747">loadWhiteVariantRelationReferrerAsVariantList</span>(whiteVariantRelationMasterBarList, new ConditionBeanSetupper&lt;WhiteVariantRelationReferrerCB&gt;() {
     *     public void setup(WhiteVariantRelationReferrerCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = whiteVariantRelationMasterBar.<span style="color: #DD4747">getWhiteVariantRelationReferrerAsVariantList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setVariantMasterId_InScope(pkList);
     * cb.query().addOrderBy_VariantMasterId_Asc();
     * </pre>
     * @param whiteVariantRelationMasterBar The entity of whiteVariantRelationMasterBar. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteVariantRelationReferrer> loadWhiteVariantRelationReferrerAsVariantList(WhiteVariantRelationMasterBar whiteVariantRelationMasterBar, ConditionBeanSetupper<WhiteVariantRelationReferrerCB> setupper) {
        xassLRArg(whiteVariantRelationMasterBar, setupper);
        return doLoadWhiteVariantRelationReferrerAsVariantList(xnewLRLs(whiteVariantRelationMasterBar), new LoadReferrerOption<WhiteVariantRelationReferrerCB, WhiteVariantRelationReferrer>().xinit(setupper));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param whiteVariantRelationMasterBar The entity of whiteVariantRelationMasterBar. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteVariantRelationReferrer> loadWhiteVariantRelationReferrerAsVariantList(WhiteVariantRelationMasterBar whiteVariantRelationMasterBar, LoadReferrerOption<WhiteVariantRelationReferrerCB, WhiteVariantRelationReferrer> loadReferrerOption) {
        xassLRArg(whiteVariantRelationMasterBar, loadReferrerOption);
        return loadWhiteVariantRelationReferrerAsVariantList(xnewLRLs(whiteVariantRelationMasterBar), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param whiteVariantRelationMasterBarList The entity list of whiteVariantRelationMasterBar. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WhiteVariantRelationReferrer> loadWhiteVariantRelationReferrerAsVariantList(List<WhiteVariantRelationMasterBar> whiteVariantRelationMasterBarList, LoadReferrerOption<WhiteVariantRelationReferrerCB, WhiteVariantRelationReferrer> loadReferrerOption) {
        xassLRArg(whiteVariantRelationMasterBarList, loadReferrerOption);
        if (whiteVariantRelationMasterBarList.isEmpty()) { return (NestedReferrerListGateway<WhiteVariantRelationReferrer>)EMPTY_NREF_LGWAY; }
        return doLoadWhiteVariantRelationReferrerAsVariantList(whiteVariantRelationMasterBarList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WhiteVariantRelationReferrer> doLoadWhiteVariantRelationReferrerAsVariantList(List<WhiteVariantRelationMasterBar> whiteVariantRelationMasterBarList, LoadReferrerOption<WhiteVariantRelationReferrerCB, WhiteVariantRelationReferrer> option) {
        return helpLoadReferrerInternally(whiteVariantRelationMasterBarList, option, "whiteVariantRelationReferrerAsVariantList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key masterBarId.
     * @param whiteVariantRelationMasterBarList The list of whiteVariantRelationMasterBar. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractMasterBarIdList(List<WhiteVariantRelationMasterBar> whiteVariantRelationMasterBarList)
    { return helpExtractListInternally(whiteVariantRelationMasterBarList, "masterBarId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteVariantRelationMasterBar whiteVariantRelationMasterBar = new WhiteVariantRelationMasterBar();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteVariantRelationMasterBar.setFoo...(value);
     * whiteVariantRelationMasterBar.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterBar.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterBar.set...;</span>
     * whiteVariantRelationMasterBarBhv.<span style="color: #DD4747">insert</span>(whiteVariantRelationMasterBar);
     * ... = whiteVariantRelationMasterBar.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteVariantRelationMasterBar The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteVariantRelationMasterBar whiteVariantRelationMasterBar) {
        doInsert(whiteVariantRelationMasterBar, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteVariantRelationMasterBar whiteVariantRelationMasterBar = new WhiteVariantRelationMasterBar();
     * whiteVariantRelationMasterBar.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteVariantRelationMasterBar.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterBar.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterBar.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteVariantRelationMasterBar.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteVariantRelationMasterBarBhv.<span style="color: #DD4747">update</span>(whiteVariantRelationMasterBar);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteVariantRelationMasterBar The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhiteVariantRelationMasterBar whiteVariantRelationMasterBar) {
        doUpdate(whiteVariantRelationMasterBar, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param whiteVariantRelationMasterBar The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteVariantRelationMasterBar whiteVariantRelationMasterBar) {
        doInsertOrUpdate(whiteVariantRelationMasterBar, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteVariantRelationMasterBar whiteVariantRelationMasterBar = new WhiteVariantRelationMasterBar();
     * whiteVariantRelationMasterBar.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteVariantRelationMasterBar.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteVariantRelationMasterBarBhv.<span style="color: #DD4747">delete</span>(whiteVariantRelationMasterBar);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteVariantRelationMasterBar The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteVariantRelationMasterBar whiteVariantRelationMasterBar) {
        doDelete(whiteVariantRelationMasterBar, null);
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
     *     WhiteVariantRelationMasterBar whiteVariantRelationMasterBar = new WhiteVariantRelationMasterBar();
     *     whiteVariantRelationMasterBar.setFooName("foo");
     *     if (...) {
     *         whiteVariantRelationMasterBar.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteVariantRelationMasterBarList.add(whiteVariantRelationMasterBar);
     * }
     * whiteVariantRelationMasterBarBhv.<span style="color: #DD4747">batchInsert</span>(whiteVariantRelationMasterBarList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteVariantRelationMasterBarList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteVariantRelationMasterBar> whiteVariantRelationMasterBarList) {
        return doBatchInsert(whiteVariantRelationMasterBarList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhiteVariantRelationMasterBar whiteVariantRelationMasterBar = new WhiteVariantRelationMasterBar();
     *     whiteVariantRelationMasterBar.setFooName("foo");
     *     if (...) {
     *         whiteVariantRelationMasterBar.setFooPrice(123);
     *     } else {
     *         whiteVariantRelationMasterBar.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteVariantRelationMasterBar.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteVariantRelationMasterBarList.add(whiteVariantRelationMasterBar);
     * }
     * whiteVariantRelationMasterBarBhv.<span style="color: #DD4747">batchUpdate</span>(whiteVariantRelationMasterBarList);
     * </pre>
     * @param whiteVariantRelationMasterBarList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteVariantRelationMasterBar> whiteVariantRelationMasterBarList) {
        return doBatchUpdate(whiteVariantRelationMasterBarList, null);
    }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * whiteVariantRelationMasterBarBhv.<span style="color: #DD4747">batchUpdate</span>(whiteVariantRelationMasterBarList, new SpecifyQuery<WhiteVariantRelationMasterBarCB>() {
     *     public void specify(WhiteVariantRelationMasterBarCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteVariantRelationMasterBarBhv.<span style="color: #DD4747">batchUpdate</span>(whiteVariantRelationMasterBarList, new SpecifyQuery<WhiteVariantRelationMasterBarCB>() {
     *     public void specify(WhiteVariantRelationMasterBarCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteVariantRelationMasterBarList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteVariantRelationMasterBar> whiteVariantRelationMasterBarList, SpecifyQuery<WhiteVariantRelationMasterBarCB> updateColumnSpec) {
        return doBatchUpdate(whiteVariantRelationMasterBarList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteVariantRelationMasterBarList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteVariantRelationMasterBar> whiteVariantRelationMasterBarList) {
        return doBatchDelete(whiteVariantRelationMasterBarList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * whiteVariantRelationMasterBarBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteVariantRelationMasterBar, WhiteVariantRelationMasterBarCB&gt;() {
     *     public ConditionBean setup(WhiteVariantRelationMasterBar entity, WhiteVariantRelationMasterBarCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteVariantRelationMasterBar, WhiteVariantRelationMasterBarCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteVariantRelationMasterBar whiteVariantRelationMasterBar = new WhiteVariantRelationMasterBar();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterBar.setPK...(value);</span>
     * whiteVariantRelationMasterBar.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterBar.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterBar.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterBar.setVersionNo(value);</span>
     * WhiteVariantRelationMasterBarCB cb = new WhiteVariantRelationMasterBarCB();
     * cb.query().setFoo...(value);
     * whiteVariantRelationMasterBarBhv.<span style="color: #DD4747">queryUpdate</span>(whiteVariantRelationMasterBar, cb);
     * </pre>
     * @param whiteVariantRelationMasterBar The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteVariantRelationMasterBar. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteVariantRelationMasterBar whiteVariantRelationMasterBar, WhiteVariantRelationMasterBarCB cb) {
        return doQueryUpdate(whiteVariantRelationMasterBar, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteVariantRelationMasterBarCB cb = new WhiteVariantRelationMasterBarCB();
     * cb.query().setFoo...(value);
     * whiteVariantRelationMasterBarBhv.<span style="color: #DD4747">queryDelete</span>(whiteVariantRelationMasterBar, cb);
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationMasterBar. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteVariantRelationMasterBarCB cb) {
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
     * WhiteVariantRelationMasterBar whiteVariantRelationMasterBar = new WhiteVariantRelationMasterBar();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteVariantRelationMasterBar.setFoo...(value);
     * whiteVariantRelationMasterBar.setBar...(value);
     * InsertOption<WhiteVariantRelationMasterBarCB> option = new InsertOption<WhiteVariantRelationMasterBarCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteVariantRelationMasterBarBhv.<span style="color: #DD4747">varyingInsert</span>(whiteVariantRelationMasterBar, option);
     * ... = whiteVariantRelationMasterBar.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteVariantRelationMasterBar The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteVariantRelationMasterBar whiteVariantRelationMasterBar, InsertOption<WhiteVariantRelationMasterBarCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteVariantRelationMasterBar, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteVariantRelationMasterBar whiteVariantRelationMasterBar = new WhiteVariantRelationMasterBar();
     * whiteVariantRelationMasterBar.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteVariantRelationMasterBar.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteVariantRelationMasterBar.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteVariantRelationMasterBarCB&gt; option = new UpdateOption&lt;WhiteVariantRelationMasterBarCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteVariantRelationMasterBarCB&gt;() {
     *         public void specify(WhiteVariantRelationMasterBarCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteVariantRelationMasterBarBhv.<span style="color: #DD4747">varyingUpdate</span>(whiteVariantRelationMasterBar, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteVariantRelationMasterBar The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteVariantRelationMasterBar whiteVariantRelationMasterBar, UpdateOption<WhiteVariantRelationMasterBarCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteVariantRelationMasterBar, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteVariantRelationMasterBar The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteVariantRelationMasterBar whiteVariantRelationMasterBar, InsertOption<WhiteVariantRelationMasterBarCB> insertOption, UpdateOption<WhiteVariantRelationMasterBarCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdate(whiteVariantRelationMasterBar, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteVariantRelationMasterBar The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteVariantRelationMasterBar whiteVariantRelationMasterBar, DeleteOption<WhiteVariantRelationMasterBarCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteVariantRelationMasterBar, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteVariantRelationMasterBarList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteVariantRelationMasterBar> whiteVariantRelationMasterBarList, InsertOption<WhiteVariantRelationMasterBarCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteVariantRelationMasterBarList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteVariantRelationMasterBarList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteVariantRelationMasterBar> whiteVariantRelationMasterBarList, UpdateOption<WhiteVariantRelationMasterBarCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteVariantRelationMasterBarList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteVariantRelationMasterBarList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteVariantRelationMasterBar> whiteVariantRelationMasterBarList, DeleteOption<WhiteVariantRelationMasterBarCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteVariantRelationMasterBarList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteVariantRelationMasterBar, WhiteVariantRelationMasterBarCB> setupper, InsertOption<WhiteVariantRelationMasterBarCB> option) {
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
     * WhiteVariantRelationMasterBar whiteVariantRelationMasterBar = new WhiteVariantRelationMasterBar();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterBar.setPK...(value);</span>
     * whiteVariantRelationMasterBar.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterBar.setVersionNo(value);</span>
     * WhiteVariantRelationMasterBarCB cb = new WhiteVariantRelationMasterBarCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteVariantRelationMasterBarCB&gt; option = new UpdateOption&lt;WhiteVariantRelationMasterBarCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteVariantRelationMasterBarCB&gt;() {
     *     public void specify(WhiteVariantRelationMasterBarCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteVariantRelationMasterBarBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteVariantRelationMasterBar, cb, option);
     * </pre>
     * @param whiteVariantRelationMasterBar The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteVariantRelationMasterBar. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteVariantRelationMasterBar whiteVariantRelationMasterBar, WhiteVariantRelationMasterBarCB cb, UpdateOption<WhiteVariantRelationMasterBarCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteVariantRelationMasterBar, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteVariantRelationMasterBar. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteVariantRelationMasterBarCB cb, DeleteOption<WhiteVariantRelationMasterBarCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteVariantRelationMasterBarBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<WhiteVariantRelationMasterBarBhv> facadeExecutor = doOutsideSql();
        return facadeExecutor.xbasicExecutor(); // variable to resolve generic type
    }

    // ===================================================================================
    //                                                                         Hyper Patch
    //                                                                         ===========
    @Override
    protected <RESULT extends WhiteVariantRelationMasterBar> org.seasar.dbflute.bhv.core.command.SelectCursorCBCommand<RESULT> newSelectCursorCBCommand() {
        return new com.example.dbflute.mysql.dbflute.allcommon.DBFluteConfig.SelectCursorCBCommandHyperPatch<RESULT>();
    }

    @Override
    protected <RESULT extends WhiteVariantRelationMasterBar> org.seasar.dbflute.bhv.core.command.SelectListCBCommand<RESULT> newSelectListCBCommand() {
        return new com.example.dbflute.mysql.dbflute.allcommon.DBFluteConfig.SelectListCBCommandHyperPatch<RESULT>();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends WhiteVariantRelationMasterBar> typeOfSelectedEntity() { return WhiteVariantRelationMasterBar.class; }
    protected Class<WhiteVariantRelationMasterBar> typeOfHandlingEntity() { return WhiteVariantRelationMasterBar.class; }
    protected Class<WhiteVariantRelationMasterBarCB> typeOfHandlingConditionBean() { return WhiteVariantRelationMasterBarCB.class; }
}
