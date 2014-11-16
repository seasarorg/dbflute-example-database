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
 * The behavior of WHITE_SPLIT_MULTIPLE_FK_BASE as TABLE. <br />
 * <pre>
 * [primary key]
 *     BASE_ID
 *
 * [column]
 *     BASE_ID, FIRST_ID, NEXT_ID, SPLIT_NAME
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
 *     white_split_multiple_fk_next, WHITE_SPLIT_MULTIPLE_FK_REF(AsSplitMultipleFkTest)
 *
 * [referrer table]
 *     white_split_multiple_fk_child
 *
 * [foreign property]
 *     whiteSplitMultipleFkNext, whiteSplitMultipleFkRefAsSplitMultipleFkTest
 *
 * [referrer property]
 *     whiteSplitMultipleFkChildList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteSplitMultipleFkBaseBhv extends AbstractBehaviorWritable<WhiteSplitMultipleFkBase, WhiteSplitMultipleFkBaseCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public WhiteSplitMultipleFkBaseDbm getDBMeta() { return WhiteSplitMultipleFkBaseDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteSplitMultipleFkBaseDbm getMyDBMeta() { return WhiteSplitMultipleFkBaseDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhiteSplitMultipleFkBaseCB newConditionBean() { return new WhiteSplitMultipleFkBaseCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteSplitMultipleFkBase newMyEntity() { return new WhiteSplitMultipleFkBase(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteSplitMultipleFkBaseCB newMyConditionBean() { return new WhiteSplitMultipleFkBaseCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteSplitMultipleFkBaseCB cb = new WhiteSplitMultipleFkBaseCB();
     * cb.query().setFoo...(value);
     * int count = whiteSplitMultipleFkBaseBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteSplitMultipleFkBase. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteSplitMultipleFkBaseCB cb) {
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
     * WhiteSplitMultipleFkBaseCB cb = new WhiteSplitMultipleFkBaseCB();
     * cb.query().setFoo...(value);
     * WhiteSplitMultipleFkBase whiteSplitMultipleFkBase = whiteSplitMultipleFkBaseBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (whiteSplitMultipleFkBase != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = whiteSplitMultipleFkBase.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSplitMultipleFkBase. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSplitMultipleFkBase selectEntity(WhiteSplitMultipleFkBaseCB cb) {
        return facadeSelectEntity(cb);
    }

    protected WhiteSplitMultipleFkBase facadeSelectEntity(WhiteSplitMultipleFkBaseCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteSplitMultipleFkBase> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteSplitMultipleFkBaseCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * WhiteSplitMultipleFkBaseCB cb = new WhiteSplitMultipleFkBaseCB();
     * cb.query().setFoo...(value);
     * WhiteSplitMultipleFkBase whiteSplitMultipleFkBase = whiteSplitMultipleFkBaseBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteSplitMultipleFkBase.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteSplitMultipleFkBase. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSplitMultipleFkBase selectEntityWithDeletedCheck(WhiteSplitMultipleFkBaseCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param baseId : PK, NotNull, BIGINT(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSplitMultipleFkBase selectByPKValue(Long baseId) {
        return facadeSelectByPKValue(baseId);
    }

    protected WhiteSplitMultipleFkBase facadeSelectByPKValue(Long baseId) {
        return doSelectByPK(baseId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteSplitMultipleFkBase> ENTITY doSelectByPK(Long baseId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(baseId), tp);
    }

    protected <ENTITY extends WhiteSplitMultipleFkBase> OptionalEntity<ENTITY> doSelectOptionalByPK(Long baseId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(baseId, tp), baseId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param baseId : PK, NotNull, BIGINT(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSplitMultipleFkBase selectByPKValueWithDeletedCheck(Long baseId) {
        return doSelectByPKWithDeletedCheck(baseId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteSplitMultipleFkBase> ENTITY doSelectByPKWithDeletedCheck(Long baseId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(baseId), tp);
    }

    protected WhiteSplitMultipleFkBaseCB xprepareCBAsPK(Long baseId) {
        assertObjectNotNull("baseId", baseId);
        return newConditionBean().acceptPK(baseId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteSplitMultipleFkBaseCB cb = new WhiteSplitMultipleFkBaseCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteSplitMultipleFkBase&gt; whiteSplitMultipleFkBaseList = whiteSplitMultipleFkBaseBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteSplitMultipleFkBase whiteSplitMultipleFkBase : whiteSplitMultipleFkBaseList) {
     *     ... = whiteSplitMultipleFkBase.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSplitMultipleFkBase. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteSplitMultipleFkBase> selectList(WhiteSplitMultipleFkBaseCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * WhiteSplitMultipleFkBaseCB cb = new WhiteSplitMultipleFkBaseCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteSplitMultipleFkBase&gt; page = whiteSplitMultipleFkBaseBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteSplitMultipleFkBase whiteSplitMultipleFkBase : page) {
     *     ... = whiteSplitMultipleFkBase.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSplitMultipleFkBase. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteSplitMultipleFkBase> selectPage(WhiteSplitMultipleFkBaseCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteSplitMultipleFkBaseCB cb = new WhiteSplitMultipleFkBaseCB();
     * cb.query().setFoo...(value);
     * whiteSplitMultipleFkBaseBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteSplitMultipleFkBase&gt;() {
     *     public void handle(WhiteSplitMultipleFkBase entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteSplitMultipleFkBase. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteSplitMultipleFkBase. (NotNull)
     */
    public void selectCursor(WhiteSplitMultipleFkBaseCB cb, EntityRowHandler<WhiteSplitMultipleFkBase> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteSplitMultipleFkBaseBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteSplitMultipleFkBaseCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhiteSplitMultipleFkBaseCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param whiteSplitMultipleFkBaseList The entity list of whiteSplitMultipleFkBase. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhiteSplitMultipleFkBase> whiteSplitMultipleFkBaseList, ReferrerLoaderHandler<LoaderOfWhiteSplitMultipleFkBase> handler) {
        xassLRArg(whiteSplitMultipleFkBaseList, handler);
        handler.handle(new LoaderOfWhiteSplitMultipleFkBase().ready(whiteSplitMultipleFkBaseList, _behaviorSelector));
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
     * @param whiteSplitMultipleFkBase The entity of whiteSplitMultipleFkBase. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhiteSplitMultipleFkBase whiteSplitMultipleFkBase, ReferrerLoaderHandler<LoaderOfWhiteSplitMultipleFkBase> handler) {
        xassLRArg(whiteSplitMultipleFkBase, handler);
        handler.handle(new LoaderOfWhiteSplitMultipleFkBase().ready(xnewLRAryLs(whiteSplitMultipleFkBase), _behaviorSelector));
    }

    /**
     * Load referrer of whiteSplitMultipleFkChildList by the set-upper of referrer. <br />
     * white_split_multiple_fk_child by BASE_ID, named 'whiteSplitMultipleFkChildList'.
     * <pre>
     * whiteSplitMultipleFkBaseBhv.<span style="color: #DD4747">loadWhiteSplitMultipleFkChildList</span>(whiteSplitMultipleFkBaseList, new ConditionBeanSetupper&lt;WhiteSplitMultipleFkChildCB&gt;() {
     *     public void setup(WhiteSplitMultipleFkChildCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (WhiteSplitMultipleFkBase whiteSplitMultipleFkBase : whiteSplitMultipleFkBaseList) {
     *     ... = whiteSplitMultipleFkBase.<span style="color: #DD4747">getWhiteSplitMultipleFkChildList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setBaseId_InScope(pkList);
     * cb.query().addOrderBy_BaseId_Asc();
     * </pre>
     * @param whiteSplitMultipleFkBaseList The entity list of whiteSplitMultipleFkBase. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteSplitMultipleFkChild> loadWhiteSplitMultipleFkChildList(List<WhiteSplitMultipleFkBase> whiteSplitMultipleFkBaseList, ConditionBeanSetupper<WhiteSplitMultipleFkChildCB> setupper) {
        xassLRArg(whiteSplitMultipleFkBaseList, setupper);
        return doLoadWhiteSplitMultipleFkChildList(whiteSplitMultipleFkBaseList, new LoadReferrerOption<WhiteSplitMultipleFkChildCB, WhiteSplitMultipleFkChild>().xinit(setupper));
    }

    /**
     * Load referrer of whiteSplitMultipleFkChildList by the set-upper of referrer. <br />
     * white_split_multiple_fk_child by BASE_ID, named 'whiteSplitMultipleFkChildList'.
     * <pre>
     * whiteSplitMultipleFkBaseBhv.<span style="color: #DD4747">loadWhiteSplitMultipleFkChildList</span>(whiteSplitMultipleFkBaseList, new ConditionBeanSetupper&lt;WhiteSplitMultipleFkChildCB&gt;() {
     *     public void setup(WhiteSplitMultipleFkChildCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = whiteSplitMultipleFkBase.<span style="color: #DD4747">getWhiteSplitMultipleFkChildList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setBaseId_InScope(pkList);
     * cb.query().addOrderBy_BaseId_Asc();
     * </pre>
     * @param whiteSplitMultipleFkBase The entity of whiteSplitMultipleFkBase. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteSplitMultipleFkChild> loadWhiteSplitMultipleFkChildList(WhiteSplitMultipleFkBase whiteSplitMultipleFkBase, ConditionBeanSetupper<WhiteSplitMultipleFkChildCB> setupper) {
        xassLRArg(whiteSplitMultipleFkBase, setupper);
        return doLoadWhiteSplitMultipleFkChildList(xnewLRLs(whiteSplitMultipleFkBase), new LoadReferrerOption<WhiteSplitMultipleFkChildCB, WhiteSplitMultipleFkChild>().xinit(setupper));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param whiteSplitMultipleFkBase The entity of whiteSplitMultipleFkBase. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteSplitMultipleFkChild> loadWhiteSplitMultipleFkChildList(WhiteSplitMultipleFkBase whiteSplitMultipleFkBase, LoadReferrerOption<WhiteSplitMultipleFkChildCB, WhiteSplitMultipleFkChild> loadReferrerOption) {
        xassLRArg(whiteSplitMultipleFkBase, loadReferrerOption);
        return loadWhiteSplitMultipleFkChildList(xnewLRLs(whiteSplitMultipleFkBase), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param whiteSplitMultipleFkBaseList The entity list of whiteSplitMultipleFkBase. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WhiteSplitMultipleFkChild> loadWhiteSplitMultipleFkChildList(List<WhiteSplitMultipleFkBase> whiteSplitMultipleFkBaseList, LoadReferrerOption<WhiteSplitMultipleFkChildCB, WhiteSplitMultipleFkChild> loadReferrerOption) {
        xassLRArg(whiteSplitMultipleFkBaseList, loadReferrerOption);
        if (whiteSplitMultipleFkBaseList.isEmpty()) { return (NestedReferrerListGateway<WhiteSplitMultipleFkChild>)EMPTY_NREF_LGWAY; }
        return doLoadWhiteSplitMultipleFkChildList(whiteSplitMultipleFkBaseList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WhiteSplitMultipleFkChild> doLoadWhiteSplitMultipleFkChildList(List<WhiteSplitMultipleFkBase> whiteSplitMultipleFkBaseList, LoadReferrerOption<WhiteSplitMultipleFkChildCB, WhiteSplitMultipleFkChild> option) {
        return helpLoadReferrerInternally(whiteSplitMultipleFkBaseList, option, "whiteSplitMultipleFkChildList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'WhiteSplitMultipleFkNext'.
     * @param whiteSplitMultipleFkBaseList The list of whiteSplitMultipleFkBase. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteSplitMultipleFkNext> pulloutWhiteSplitMultipleFkNext(List<WhiteSplitMultipleFkBase> whiteSplitMultipleFkBaseList)
    { return helpPulloutInternally(whiteSplitMultipleFkBaseList, "whiteSplitMultipleFkNext"); }

    /**
     * Pull out the list of foreign table 'WhiteSplitMultipleFkRef'.
     * @param whiteSplitMultipleFkBaseList The list of whiteSplitMultipleFkBase. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteSplitMultipleFkRef> pulloutWhiteSplitMultipleFkRefAsSplitMultipleFkTest(List<WhiteSplitMultipleFkBase> whiteSplitMultipleFkBaseList)
    { return helpPulloutInternally(whiteSplitMultipleFkBaseList, "whiteSplitMultipleFkRefAsSplitMultipleFkTest"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key baseId.
     * @param whiteSplitMultipleFkBaseList The list of whiteSplitMultipleFkBase. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractBaseIdList(List<WhiteSplitMultipleFkBase> whiteSplitMultipleFkBaseList)
    { return helpExtractListInternally(whiteSplitMultipleFkBaseList, "baseId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteSplitMultipleFkBase whiteSplitMultipleFkBase = new WhiteSplitMultipleFkBase();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteSplitMultipleFkBase.setFoo...(value);
     * whiteSplitMultipleFkBase.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkBase.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkBase.set...;</span>
     * whiteSplitMultipleFkBaseBhv.<span style="color: #DD4747">insert</span>(whiteSplitMultipleFkBase);
     * ... = whiteSplitMultipleFkBase.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteSplitMultipleFkBase The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteSplitMultipleFkBase whiteSplitMultipleFkBase) {
        doInsert(whiteSplitMultipleFkBase, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteSplitMultipleFkBase whiteSplitMultipleFkBase = new WhiteSplitMultipleFkBase();
     * whiteSplitMultipleFkBase.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteSplitMultipleFkBase.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkBase.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkBase.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteSplitMultipleFkBase.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteSplitMultipleFkBaseBhv.<span style="color: #DD4747">update</span>(whiteSplitMultipleFkBase);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSplitMultipleFkBase The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhiteSplitMultipleFkBase whiteSplitMultipleFkBase) {
        doUpdate(whiteSplitMultipleFkBase, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param whiteSplitMultipleFkBase The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteSplitMultipleFkBase whiteSplitMultipleFkBase) {
        doInsertOrUpdate(whiteSplitMultipleFkBase, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteSplitMultipleFkBase whiteSplitMultipleFkBase = new WhiteSplitMultipleFkBase();
     * whiteSplitMultipleFkBase.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteSplitMultipleFkBase.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteSplitMultipleFkBaseBhv.<span style="color: #DD4747">delete</span>(whiteSplitMultipleFkBase);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSplitMultipleFkBase The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteSplitMultipleFkBase whiteSplitMultipleFkBase) {
        doDelete(whiteSplitMultipleFkBase, null);
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
     *     WhiteSplitMultipleFkBase whiteSplitMultipleFkBase = new WhiteSplitMultipleFkBase();
     *     whiteSplitMultipleFkBase.setFooName("foo");
     *     if (...) {
     *         whiteSplitMultipleFkBase.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteSplitMultipleFkBaseList.add(whiteSplitMultipleFkBase);
     * }
     * whiteSplitMultipleFkBaseBhv.<span style="color: #DD4747">batchInsert</span>(whiteSplitMultipleFkBaseList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteSplitMultipleFkBaseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteSplitMultipleFkBase> whiteSplitMultipleFkBaseList) {
        return doBatchInsert(whiteSplitMultipleFkBaseList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhiteSplitMultipleFkBase whiteSplitMultipleFkBase = new WhiteSplitMultipleFkBase();
     *     whiteSplitMultipleFkBase.setFooName("foo");
     *     if (...) {
     *         whiteSplitMultipleFkBase.setFooPrice(123);
     *     } else {
     *         whiteSplitMultipleFkBase.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteSplitMultipleFkBase.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteSplitMultipleFkBaseList.add(whiteSplitMultipleFkBase);
     * }
     * whiteSplitMultipleFkBaseBhv.<span style="color: #DD4747">batchUpdate</span>(whiteSplitMultipleFkBaseList);
     * </pre>
     * @param whiteSplitMultipleFkBaseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteSplitMultipleFkBase> whiteSplitMultipleFkBaseList) {
        return doBatchUpdate(whiteSplitMultipleFkBaseList, null);
    }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * whiteSplitMultipleFkBaseBhv.<span style="color: #DD4747">batchUpdate</span>(whiteSplitMultipleFkBaseList, new SpecifyQuery<WhiteSplitMultipleFkBaseCB>() {
     *     public void specify(WhiteSplitMultipleFkBaseCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteSplitMultipleFkBaseBhv.<span style="color: #DD4747">batchUpdate</span>(whiteSplitMultipleFkBaseList, new SpecifyQuery<WhiteSplitMultipleFkBaseCB>() {
     *     public void specify(WhiteSplitMultipleFkBaseCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteSplitMultipleFkBaseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteSplitMultipleFkBase> whiteSplitMultipleFkBaseList, SpecifyQuery<WhiteSplitMultipleFkBaseCB> updateColumnSpec) {
        return doBatchUpdate(whiteSplitMultipleFkBaseList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteSplitMultipleFkBaseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteSplitMultipleFkBase> whiteSplitMultipleFkBaseList) {
        return doBatchDelete(whiteSplitMultipleFkBaseList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * whiteSplitMultipleFkBaseBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteSplitMultipleFkBase, WhiteSplitMultipleFkBaseCB&gt;() {
     *     public ConditionBean setup(WhiteSplitMultipleFkBase entity, WhiteSplitMultipleFkBaseCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteSplitMultipleFkBase, WhiteSplitMultipleFkBaseCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteSplitMultipleFkBase whiteSplitMultipleFkBase = new WhiteSplitMultipleFkBase();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkBase.setPK...(value);</span>
     * whiteSplitMultipleFkBase.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkBase.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkBase.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkBase.setVersionNo(value);</span>
     * WhiteSplitMultipleFkBaseCB cb = new WhiteSplitMultipleFkBaseCB();
     * cb.query().setFoo...(value);
     * whiteSplitMultipleFkBaseBhv.<span style="color: #DD4747">queryUpdate</span>(whiteSplitMultipleFkBase, cb);
     * </pre>
     * @param whiteSplitMultipleFkBase The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteSplitMultipleFkBase. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteSplitMultipleFkBase whiteSplitMultipleFkBase, WhiteSplitMultipleFkBaseCB cb) {
        return doQueryUpdate(whiteSplitMultipleFkBase, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteSplitMultipleFkBaseCB cb = new WhiteSplitMultipleFkBaseCB();
     * cb.query().setFoo...(value);
     * whiteSplitMultipleFkBaseBhv.<span style="color: #DD4747">queryDelete</span>(whiteSplitMultipleFkBase, cb);
     * </pre>
     * @param cb The condition-bean of WhiteSplitMultipleFkBase. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteSplitMultipleFkBaseCB cb) {
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
     * WhiteSplitMultipleFkBase whiteSplitMultipleFkBase = new WhiteSplitMultipleFkBase();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteSplitMultipleFkBase.setFoo...(value);
     * whiteSplitMultipleFkBase.setBar...(value);
     * InsertOption<WhiteSplitMultipleFkBaseCB> option = new InsertOption<WhiteSplitMultipleFkBaseCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteSplitMultipleFkBaseBhv.<span style="color: #DD4747">varyingInsert</span>(whiteSplitMultipleFkBase, option);
     * ... = whiteSplitMultipleFkBase.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteSplitMultipleFkBase The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteSplitMultipleFkBase whiteSplitMultipleFkBase, InsertOption<WhiteSplitMultipleFkBaseCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteSplitMultipleFkBase, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteSplitMultipleFkBase whiteSplitMultipleFkBase = new WhiteSplitMultipleFkBase();
     * whiteSplitMultipleFkBase.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteSplitMultipleFkBase.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteSplitMultipleFkBase.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteSplitMultipleFkBaseCB&gt; option = new UpdateOption&lt;WhiteSplitMultipleFkBaseCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteSplitMultipleFkBaseCB&gt;() {
     *         public void specify(WhiteSplitMultipleFkBaseCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteSplitMultipleFkBaseBhv.<span style="color: #DD4747">varyingUpdate</span>(whiteSplitMultipleFkBase, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSplitMultipleFkBase The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteSplitMultipleFkBase whiteSplitMultipleFkBase, UpdateOption<WhiteSplitMultipleFkBaseCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteSplitMultipleFkBase, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteSplitMultipleFkBase The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteSplitMultipleFkBase whiteSplitMultipleFkBase, InsertOption<WhiteSplitMultipleFkBaseCB> insertOption, UpdateOption<WhiteSplitMultipleFkBaseCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdate(whiteSplitMultipleFkBase, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteSplitMultipleFkBase The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteSplitMultipleFkBase whiteSplitMultipleFkBase, DeleteOption<WhiteSplitMultipleFkBaseCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteSplitMultipleFkBase, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteSplitMultipleFkBaseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteSplitMultipleFkBase> whiteSplitMultipleFkBaseList, InsertOption<WhiteSplitMultipleFkBaseCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteSplitMultipleFkBaseList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteSplitMultipleFkBaseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteSplitMultipleFkBase> whiteSplitMultipleFkBaseList, UpdateOption<WhiteSplitMultipleFkBaseCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteSplitMultipleFkBaseList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteSplitMultipleFkBaseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteSplitMultipleFkBase> whiteSplitMultipleFkBaseList, DeleteOption<WhiteSplitMultipleFkBaseCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteSplitMultipleFkBaseList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteSplitMultipleFkBase, WhiteSplitMultipleFkBaseCB> setupper, InsertOption<WhiteSplitMultipleFkBaseCB> option) {
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
     * WhiteSplitMultipleFkBase whiteSplitMultipleFkBase = new WhiteSplitMultipleFkBase();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkBase.setPK...(value);</span>
     * whiteSplitMultipleFkBase.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkBase.setVersionNo(value);</span>
     * WhiteSplitMultipleFkBaseCB cb = new WhiteSplitMultipleFkBaseCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteSplitMultipleFkBaseCB&gt; option = new UpdateOption&lt;WhiteSplitMultipleFkBaseCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteSplitMultipleFkBaseCB&gt;() {
     *     public void specify(WhiteSplitMultipleFkBaseCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteSplitMultipleFkBaseBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteSplitMultipleFkBase, cb, option);
     * </pre>
     * @param whiteSplitMultipleFkBase The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteSplitMultipleFkBase. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteSplitMultipleFkBase whiteSplitMultipleFkBase, WhiteSplitMultipleFkBaseCB cb, UpdateOption<WhiteSplitMultipleFkBaseCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteSplitMultipleFkBase, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteSplitMultipleFkBase. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteSplitMultipleFkBaseCB cb, DeleteOption<WhiteSplitMultipleFkBaseCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteSplitMultipleFkBaseBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<WhiteSplitMultipleFkBaseBhv> facadeExecutor = doOutsideSql();
        return facadeExecutor.xbasicExecutor(); // variable to resolve generic type
    }

    // ===================================================================================
    //                                                                         Hyper Patch
    //                                                                         ===========
    @Override
    protected <RESULT extends WhiteSplitMultipleFkBase> org.seasar.dbflute.bhv.core.command.SelectCursorCBCommand<RESULT> newSelectCursorCBCommand() {
        return new com.example.dbflute.mysql.dbflute.allcommon.DBFluteConfig.SelectCursorCBCommandHyperPatch<RESULT>();
    }

    @Override
    protected <RESULT extends WhiteSplitMultipleFkBase> org.seasar.dbflute.bhv.core.command.SelectListCBCommand<RESULT> newSelectListCBCommand() {
        return new com.example.dbflute.mysql.dbflute.allcommon.DBFluteConfig.SelectListCBCommandHyperPatch<RESULT>();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends WhiteSplitMultipleFkBase> typeOfSelectedEntity() { return WhiteSplitMultipleFkBase.class; }
    protected Class<WhiteSplitMultipleFkBase> typeOfHandlingEntity() { return WhiteSplitMultipleFkBase.class; }
    protected Class<WhiteSplitMultipleFkBaseCB> typeOfHandlingConditionBean() { return WhiteSplitMultipleFkBaseCB.class; }
}
