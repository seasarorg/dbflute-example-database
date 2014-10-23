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
 * The behavior of WHITE_PURCHASE_REFERRER as TABLE. <br />
 * <pre>
 * [primary key]
 *     PURCHASE_REFERRER_ID
 *
 * [column]
 *     PURCHASE_REFERRER_ID, PURCHASE_REFERRER_NAME
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PURCHASE_REFERRER_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     purchase
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     purchase
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhitePurchaseReferrerBhv extends AbstractBehaviorWritable<WhitePurchaseReferrer, WhitePurchaseReferrerCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public WhitePurchaseReferrerDbm getDBMeta() { return WhitePurchaseReferrerDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhitePurchaseReferrerDbm getMyDBMeta() { return WhitePurchaseReferrerDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhitePurchaseReferrerCB newConditionBean() { return new WhitePurchaseReferrerCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhitePurchaseReferrer newMyEntity() { return new WhitePurchaseReferrer(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhitePurchaseReferrerCB newMyConditionBean() { return new WhitePurchaseReferrerCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhitePurchaseReferrerCB cb = new WhitePurchaseReferrerCB();
     * cb.query().setFoo...(value);
     * int count = whitePurchaseReferrerBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhitePurchaseReferrer. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhitePurchaseReferrerCB cb) {
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
     * WhitePurchaseReferrerCB cb = new WhitePurchaseReferrerCB();
     * cb.query().setFoo...(value);
     * WhitePurchaseReferrer whitePurchaseReferrer = whitePurchaseReferrerBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (whitePurchaseReferrer != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = whitePurchaseReferrer.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhitePurchaseReferrer. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhitePurchaseReferrer selectEntity(WhitePurchaseReferrerCB cb) {
        return facadeSelectEntity(cb);
    }

    protected WhitePurchaseReferrer facadeSelectEntity(WhitePurchaseReferrerCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhitePurchaseReferrer> OptionalEntity<ENTITY> doSelectOptionalEntity(WhitePurchaseReferrerCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * WhitePurchaseReferrerCB cb = new WhitePurchaseReferrerCB();
     * cb.query().setFoo...(value);
     * WhitePurchaseReferrer whitePurchaseReferrer = whitePurchaseReferrerBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whitePurchaseReferrer.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhitePurchaseReferrer. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhitePurchaseReferrer selectEntityWithDeletedCheck(WhitePurchaseReferrerCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param purchaseReferrerId : PK, ID, NotNull, BIGINT(19), FK to purchase. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhitePurchaseReferrer selectByPKValue(Long purchaseReferrerId) {
        return facadeSelectByPKValue(purchaseReferrerId);
    }

    protected WhitePurchaseReferrer facadeSelectByPKValue(Long purchaseReferrerId) {
        return doSelectByPK(purchaseReferrerId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhitePurchaseReferrer> ENTITY doSelectByPK(Long purchaseReferrerId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(purchaseReferrerId), tp);
    }

    protected <ENTITY extends WhitePurchaseReferrer> OptionalEntity<ENTITY> doSelectOptionalByPK(Long purchaseReferrerId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(purchaseReferrerId, tp), purchaseReferrerId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param purchaseReferrerId : PK, ID, NotNull, BIGINT(19), FK to purchase. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhitePurchaseReferrer selectByPKValueWithDeletedCheck(Long purchaseReferrerId) {
        return doSelectByPKWithDeletedCheck(purchaseReferrerId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhitePurchaseReferrer> ENTITY doSelectByPKWithDeletedCheck(Long purchaseReferrerId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(purchaseReferrerId), tp);
    }

    protected WhitePurchaseReferrerCB xprepareCBAsPK(Long purchaseReferrerId) {
        assertObjectNotNull("purchaseReferrerId", purchaseReferrerId);
        return newConditionBean().acceptPK(purchaseReferrerId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhitePurchaseReferrerCB cb = new WhitePurchaseReferrerCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhitePurchaseReferrer&gt; whitePurchaseReferrerList = whitePurchaseReferrerBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhitePurchaseReferrer whitePurchaseReferrer : whitePurchaseReferrerList) {
     *     ... = whitePurchaseReferrer.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhitePurchaseReferrer. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhitePurchaseReferrer> selectList(WhitePurchaseReferrerCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * WhitePurchaseReferrerCB cb = new WhitePurchaseReferrerCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhitePurchaseReferrer&gt; page = whitePurchaseReferrerBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhitePurchaseReferrer whitePurchaseReferrer : page) {
     *     ... = whitePurchaseReferrer.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhitePurchaseReferrer. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhitePurchaseReferrer> selectPage(WhitePurchaseReferrerCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhitePurchaseReferrerCB cb = new WhitePurchaseReferrerCB();
     * cb.query().setFoo...(value);
     * whitePurchaseReferrerBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhitePurchaseReferrer&gt;() {
     *     public void handle(WhitePurchaseReferrer entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhitePurchaseReferrer. (NotNull)
     * @param entityRowHandler The handler of entity row of WhitePurchaseReferrer. (NotNull)
     */
    public void selectCursor(WhitePurchaseReferrerCB cb, EntityRowHandler<WhitePurchaseReferrer> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whitePurchaseReferrerBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhitePurchaseReferrerCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhitePurchaseReferrerCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param whitePurchaseReferrerList The entity list of whitePurchaseReferrer. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhitePurchaseReferrer> whitePurchaseReferrerList, ReferrerLoaderHandler<LoaderOfWhitePurchaseReferrer> handler) {
        xassLRArg(whitePurchaseReferrerList, handler);
        handler.handle(new LoaderOfWhitePurchaseReferrer().ready(whitePurchaseReferrerList, _behaviorSelector));
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
     * @param whitePurchaseReferrer The entity of whitePurchaseReferrer. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhitePurchaseReferrer whitePurchaseReferrer, ReferrerLoaderHandler<LoaderOfWhitePurchaseReferrer> handler) {
        xassLRArg(whitePurchaseReferrer, handler);
        handler.handle(new LoaderOfWhitePurchaseReferrer().ready(xnewLRAryLs(whitePurchaseReferrer), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'Purchase'.
     * @param whitePurchaseReferrerList The list of whitePurchaseReferrer. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Purchase> pulloutPurchase(List<WhitePurchaseReferrer> whitePurchaseReferrerList)
    { return helpPulloutInternally(whitePurchaseReferrerList, "purchase"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key purchaseReferrerId.
     * @param whitePurchaseReferrerList The list of whitePurchaseReferrer. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractPurchaseReferrerIdList(List<WhitePurchaseReferrer> whitePurchaseReferrerList)
    { return helpExtractListInternally(whitePurchaseReferrerList, "purchaseReferrerId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhitePurchaseReferrer whitePurchaseReferrer = new WhitePurchaseReferrer();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whitePurchaseReferrer.setFoo...(value);
     * whitePurchaseReferrer.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whitePurchaseReferrer.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whitePurchaseReferrer.set...;</span>
     * whitePurchaseReferrerBhv.<span style="color: #DD4747">insert</span>(whitePurchaseReferrer);
     * ... = whitePurchaseReferrer.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whitePurchaseReferrer The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhitePurchaseReferrer whitePurchaseReferrer) {
        doInsert(whitePurchaseReferrer, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhitePurchaseReferrer whitePurchaseReferrer = new WhitePurchaseReferrer();
     * whitePurchaseReferrer.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whitePurchaseReferrer.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whitePurchaseReferrer.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whitePurchaseReferrer.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whitePurchaseReferrer.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whitePurchaseReferrerBhv.<span style="color: #DD4747">update</span>(whitePurchaseReferrer);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whitePurchaseReferrer The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhitePurchaseReferrer whitePurchaseReferrer) {
        doUpdate(whitePurchaseReferrer, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param whitePurchaseReferrer The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhitePurchaseReferrer whitePurchaseReferrer) {
        doInsertOrUpdate(whitePurchaseReferrer, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhitePurchaseReferrer whitePurchaseReferrer = new WhitePurchaseReferrer();
     * whitePurchaseReferrer.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whitePurchaseReferrer.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whitePurchaseReferrerBhv.<span style="color: #DD4747">delete</span>(whitePurchaseReferrer);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whitePurchaseReferrer The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhitePurchaseReferrer whitePurchaseReferrer) {
        doDelete(whitePurchaseReferrer, null);
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
     *     WhitePurchaseReferrer whitePurchaseReferrer = new WhitePurchaseReferrer();
     *     whitePurchaseReferrer.setFooName("foo");
     *     if (...) {
     *         whitePurchaseReferrer.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whitePurchaseReferrerList.add(whitePurchaseReferrer);
     * }
     * whitePurchaseReferrerBhv.<span style="color: #DD4747">batchInsert</span>(whitePurchaseReferrerList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whitePurchaseReferrerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhitePurchaseReferrer> whitePurchaseReferrerList) {
        return doBatchInsert(whitePurchaseReferrerList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhitePurchaseReferrer whitePurchaseReferrer = new WhitePurchaseReferrer();
     *     whitePurchaseReferrer.setFooName("foo");
     *     if (...) {
     *         whitePurchaseReferrer.setFooPrice(123);
     *     } else {
     *         whitePurchaseReferrer.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whitePurchaseReferrer.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whitePurchaseReferrerList.add(whitePurchaseReferrer);
     * }
     * whitePurchaseReferrerBhv.<span style="color: #DD4747">batchUpdate</span>(whitePurchaseReferrerList);
     * </pre>
     * @param whitePurchaseReferrerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhitePurchaseReferrer> whitePurchaseReferrerList) {
        return doBatchUpdate(whitePurchaseReferrerList, null);
    }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * whitePurchaseReferrerBhv.<span style="color: #DD4747">batchUpdate</span>(whitePurchaseReferrerList, new SpecifyQuery<WhitePurchaseReferrerCB>() {
     *     public void specify(WhitePurchaseReferrerCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whitePurchaseReferrerBhv.<span style="color: #DD4747">batchUpdate</span>(whitePurchaseReferrerList, new SpecifyQuery<WhitePurchaseReferrerCB>() {
     *     public void specify(WhitePurchaseReferrerCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whitePurchaseReferrerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhitePurchaseReferrer> whitePurchaseReferrerList, SpecifyQuery<WhitePurchaseReferrerCB> updateColumnSpec) {
        return doBatchUpdate(whitePurchaseReferrerList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whitePurchaseReferrerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhitePurchaseReferrer> whitePurchaseReferrerList) {
        return doBatchDelete(whitePurchaseReferrerList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * whitePurchaseReferrerBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhitePurchaseReferrer, WhitePurchaseReferrerCB&gt;() {
     *     public ConditionBean setup(WhitePurchaseReferrer entity, WhitePurchaseReferrerCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhitePurchaseReferrer, WhitePurchaseReferrerCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhitePurchaseReferrer whitePurchaseReferrer = new WhitePurchaseReferrer();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whitePurchaseReferrer.setPK...(value);</span>
     * whitePurchaseReferrer.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whitePurchaseReferrer.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whitePurchaseReferrer.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whitePurchaseReferrer.setVersionNo(value);</span>
     * WhitePurchaseReferrerCB cb = new WhitePurchaseReferrerCB();
     * cb.query().setFoo...(value);
     * whitePurchaseReferrerBhv.<span style="color: #DD4747">queryUpdate</span>(whitePurchaseReferrer, cb);
     * </pre>
     * @param whitePurchaseReferrer The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhitePurchaseReferrer. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhitePurchaseReferrer whitePurchaseReferrer, WhitePurchaseReferrerCB cb) {
        return doQueryUpdate(whitePurchaseReferrer, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhitePurchaseReferrerCB cb = new WhitePurchaseReferrerCB();
     * cb.query().setFoo...(value);
     * whitePurchaseReferrerBhv.<span style="color: #DD4747">queryDelete</span>(whitePurchaseReferrer, cb);
     * </pre>
     * @param cb The condition-bean of WhitePurchaseReferrer. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhitePurchaseReferrerCB cb) {
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
     * WhitePurchaseReferrer whitePurchaseReferrer = new WhitePurchaseReferrer();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whitePurchaseReferrer.setFoo...(value);
     * whitePurchaseReferrer.setBar...(value);
     * InsertOption<WhitePurchaseReferrerCB> option = new InsertOption<WhitePurchaseReferrerCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whitePurchaseReferrerBhv.<span style="color: #DD4747">varyingInsert</span>(whitePurchaseReferrer, option);
     * ... = whitePurchaseReferrer.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whitePurchaseReferrer The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhitePurchaseReferrer whitePurchaseReferrer, InsertOption<WhitePurchaseReferrerCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whitePurchaseReferrer, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhitePurchaseReferrer whitePurchaseReferrer = new WhitePurchaseReferrer();
     * whitePurchaseReferrer.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whitePurchaseReferrer.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whitePurchaseReferrer.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhitePurchaseReferrerCB&gt; option = new UpdateOption&lt;WhitePurchaseReferrerCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhitePurchaseReferrerCB&gt;() {
     *         public void specify(WhitePurchaseReferrerCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whitePurchaseReferrerBhv.<span style="color: #DD4747">varyingUpdate</span>(whitePurchaseReferrer, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whitePurchaseReferrer The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhitePurchaseReferrer whitePurchaseReferrer, UpdateOption<WhitePurchaseReferrerCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whitePurchaseReferrer, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whitePurchaseReferrer The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhitePurchaseReferrer whitePurchaseReferrer, InsertOption<WhitePurchaseReferrerCB> insertOption, UpdateOption<WhitePurchaseReferrerCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdate(whitePurchaseReferrer, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whitePurchaseReferrer The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhitePurchaseReferrer whitePurchaseReferrer, DeleteOption<WhitePurchaseReferrerCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whitePurchaseReferrer, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whitePurchaseReferrerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhitePurchaseReferrer> whitePurchaseReferrerList, InsertOption<WhitePurchaseReferrerCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whitePurchaseReferrerList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whitePurchaseReferrerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhitePurchaseReferrer> whitePurchaseReferrerList, UpdateOption<WhitePurchaseReferrerCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whitePurchaseReferrerList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whitePurchaseReferrerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhitePurchaseReferrer> whitePurchaseReferrerList, DeleteOption<WhitePurchaseReferrerCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whitePurchaseReferrerList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhitePurchaseReferrer, WhitePurchaseReferrerCB> setupper, InsertOption<WhitePurchaseReferrerCB> option) {
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
     * WhitePurchaseReferrer whitePurchaseReferrer = new WhitePurchaseReferrer();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whitePurchaseReferrer.setPK...(value);</span>
     * whitePurchaseReferrer.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whitePurchaseReferrer.setVersionNo(value);</span>
     * WhitePurchaseReferrerCB cb = new WhitePurchaseReferrerCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhitePurchaseReferrerCB&gt; option = new UpdateOption&lt;WhitePurchaseReferrerCB&gt;();
     * option.self(new SpecifyQuery&lt;WhitePurchaseReferrerCB&gt;() {
     *     public void specify(WhitePurchaseReferrerCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whitePurchaseReferrerBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whitePurchaseReferrer, cb, option);
     * </pre>
     * @param whitePurchaseReferrer The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhitePurchaseReferrer. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhitePurchaseReferrer whitePurchaseReferrer, WhitePurchaseReferrerCB cb, UpdateOption<WhitePurchaseReferrerCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whitePurchaseReferrer, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhitePurchaseReferrer. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhitePurchaseReferrerCB cb, DeleteOption<WhitePurchaseReferrerCB> option) {
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
    public OutsideSqlBasicExecutor<WhitePurchaseReferrerBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<WhitePurchaseReferrerBhv> facadeExecutor = doOutsideSql();
        return facadeExecutor.xbasicExecutor(); // variable to resolve generic type
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends WhitePurchaseReferrer> typeOfSelectedEntity() { return WhitePurchaseReferrer.class; }
    protected Class<WhitePurchaseReferrer> typeOfHandlingEntity() { return WhitePurchaseReferrer.class; }
    protected Class<WhitePurchaseReferrerCB> typeOfHandlingConditionBean() { return WhitePurchaseReferrerCB.class; }
}
