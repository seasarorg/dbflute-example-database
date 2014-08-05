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
import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.exception.*;
import org.seasar.dbflute.optional.OptionalEntity;
import org.seasar.dbflute.outsidesql.executor.*;
import com.example.dbflute.mysql.dbflute.exbhv.*;
import com.example.dbflute.mysql.dbflute.bsbhv.loader.*;
import com.example.dbflute.mysql.dbflute.exentity.*;
import com.example.dbflute.mysql.dbflute.bsentity.dbmeta.*;
import com.example.dbflute.mysql.dbflute.cbean.*;

/**
 * The behavior of WHITE_ALL_IN_ONE_CLS_ELEMENT as TABLE. <br />
 * <pre>
 * [primary key]
 *     CLS_CATEGORY_CODE, CLS_ELEMENT_CODE
 *
 * [column]
 *     CLS_CATEGORY_CODE, CLS_ELEMENT_CODE, CLS_ELEMENT_NAME, ATTRIBUTE_EXP
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
 *     white_all_in_one_cls_category
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     whiteAllInOneClsCategory
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteAllInOneClsElementBhv extends AbstractBehaviorWritable<WhiteAllInOneClsElement, WhiteAllInOneClsElementCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public DBMeta getDBMeta() { return WhiteAllInOneClsElementDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteAllInOneClsElementDbm getMyDBMeta() { return WhiteAllInOneClsElementDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhiteAllInOneClsElementCB newConditionBean() { return new WhiteAllInOneClsElementCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteAllInOneClsElement newMyEntity() { return new WhiteAllInOneClsElement(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteAllInOneClsElementCB newMyConditionBean() { return new WhiteAllInOneClsElementCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteAllInOneClsElementCB cb = new WhiteAllInOneClsElementCB();
     * cb.query().setFoo...(value);
     * int count = whiteAllInOneClsElementBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteAllInOneClsElement. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteAllInOneClsElementCB cb) {
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
     * WhiteAllInOneClsElementCB cb = new WhiteAllInOneClsElementCB();
     * cb.query().setFoo...(value);
     * WhiteAllInOneClsElement whiteAllInOneClsElement = whiteAllInOneClsElementBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (whiteAllInOneClsElement != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = whiteAllInOneClsElement.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteAllInOneClsElement. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteAllInOneClsElement selectEntity(WhiteAllInOneClsElementCB cb) {
        return facadeSelectEntity(cb);
    }

    protected WhiteAllInOneClsElement facadeSelectEntity(WhiteAllInOneClsElementCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteAllInOneClsElement> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteAllInOneClsElementCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * WhiteAllInOneClsElementCB cb = new WhiteAllInOneClsElementCB();
     * cb.query().setFoo...(value);
     * WhiteAllInOneClsElement whiteAllInOneClsElement = whiteAllInOneClsElementBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteAllInOneClsElement.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteAllInOneClsElement. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteAllInOneClsElement selectEntityWithDeletedCheck(WhiteAllInOneClsElementCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param clsCategoryCode : PK, NotNull, CHAR(3), FK to white_all_in_one_cls_category. (NotNull)
     * @param clsElementCode : PK, NotNull, CHAR(3). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteAllInOneClsElement selectByPKValue(String clsCategoryCode, String clsElementCode) {
        return facadeSelectByPKValue(clsCategoryCode, clsElementCode);
    }

    protected WhiteAllInOneClsElement facadeSelectByPKValue(String clsCategoryCode, String clsElementCode) {
        return doSelectByPK(clsCategoryCode, clsElementCode, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteAllInOneClsElement> ENTITY doSelectByPK(String clsCategoryCode, String clsElementCode, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(clsCategoryCode, clsElementCode), tp);
    }

    protected <ENTITY extends WhiteAllInOneClsElement> OptionalEntity<ENTITY> doSelectOptionalByPK(String clsCategoryCode, String clsElementCode, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(clsCategoryCode, clsElementCode, tp), clsCategoryCode, clsElementCode);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param clsCategoryCode : PK, NotNull, CHAR(3), FK to white_all_in_one_cls_category. (NotNull)
     * @param clsElementCode : PK, NotNull, CHAR(3). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteAllInOneClsElement selectByPKValueWithDeletedCheck(String clsCategoryCode, String clsElementCode) {
        return doSelectByPKWithDeletedCheck(clsCategoryCode, clsElementCode, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteAllInOneClsElement> ENTITY doSelectByPKWithDeletedCheck(String clsCategoryCode, String clsElementCode, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(clsCategoryCode, clsElementCode), tp);
    }

    protected WhiteAllInOneClsElementCB xprepareCBAsPK(String clsCategoryCode, String clsElementCode) {
        assertObjectNotNull("clsCategoryCode", clsCategoryCode);assertObjectNotNull("clsElementCode", clsElementCode);
        return newConditionBean().acceptPK(clsCategoryCode, clsElementCode);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteAllInOneClsElementCB cb = new WhiteAllInOneClsElementCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteAllInOneClsElement&gt; whiteAllInOneClsElementList = whiteAllInOneClsElementBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteAllInOneClsElement whiteAllInOneClsElement : whiteAllInOneClsElementList) {
     *     ... = whiteAllInOneClsElement.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteAllInOneClsElement. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteAllInOneClsElement> selectList(WhiteAllInOneClsElementCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * WhiteAllInOneClsElementCB cb = new WhiteAllInOneClsElementCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteAllInOneClsElement&gt; page = whiteAllInOneClsElementBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteAllInOneClsElement whiteAllInOneClsElement : page) {
     *     ... = whiteAllInOneClsElement.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteAllInOneClsElement. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteAllInOneClsElement> selectPage(WhiteAllInOneClsElementCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteAllInOneClsElementCB cb = new WhiteAllInOneClsElementCB();
     * cb.query().setFoo...(value);
     * whiteAllInOneClsElementBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteAllInOneClsElement&gt;() {
     *     public void handle(WhiteAllInOneClsElement entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteAllInOneClsElement. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteAllInOneClsElement. (NotNull)
     */
    public void selectCursor(WhiteAllInOneClsElementCB cb, EntityRowHandler<WhiteAllInOneClsElement> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteAllInOneClsElementBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteAllInOneClsElementCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhiteAllInOneClsElementCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param whiteAllInOneClsElementList The entity list of whiteAllInOneClsElement. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhiteAllInOneClsElement> whiteAllInOneClsElementList, ReferrerLoaderHandler<LoaderOfWhiteAllInOneClsElement> handler) {
        xassLRArg(whiteAllInOneClsElementList, handler);
        handler.handle(new LoaderOfWhiteAllInOneClsElement().ready(whiteAllInOneClsElementList, _behaviorSelector));
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
     * @param whiteAllInOneClsElement The entity of whiteAllInOneClsElement. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhiteAllInOneClsElement whiteAllInOneClsElement, ReferrerLoaderHandler<LoaderOfWhiteAllInOneClsElement> handler) {
        xassLRArg(whiteAllInOneClsElement, handler);
        handler.handle(new LoaderOfWhiteAllInOneClsElement().ready(xnewLRAryLs(whiteAllInOneClsElement), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'WhiteAllInOneClsCategory'.
     * @param whiteAllInOneClsElementList The list of whiteAllInOneClsElement. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteAllInOneClsCategory> pulloutWhiteAllInOneClsCategory(List<WhiteAllInOneClsElement> whiteAllInOneClsElementList)
    { return helpPulloutInternally(whiteAllInOneClsElementList, "whiteAllInOneClsCategory"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteAllInOneClsElement whiteAllInOneClsElement = new WhiteAllInOneClsElement();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteAllInOneClsElement.setFoo...(value);
     * whiteAllInOneClsElement.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsElement.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsElement.set...;</span>
     * whiteAllInOneClsElementBhv.<span style="color: #DD4747">insert</span>(whiteAllInOneClsElement);
     * ... = whiteAllInOneClsElement.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteAllInOneClsElement The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteAllInOneClsElement whiteAllInOneClsElement) {
        doInsert(whiteAllInOneClsElement, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteAllInOneClsElement whiteAllInOneClsElement = new WhiteAllInOneClsElement();
     * whiteAllInOneClsElement.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteAllInOneClsElement.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsElement.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsElement.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteAllInOneClsElement.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteAllInOneClsElementBhv.<span style="color: #DD4747">update</span>(whiteAllInOneClsElement);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteAllInOneClsElement The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhiteAllInOneClsElement whiteAllInOneClsElement) {
        doUpdate(whiteAllInOneClsElement, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param whiteAllInOneClsElement The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteAllInOneClsElement whiteAllInOneClsElement) {
        doInsertOrUpdate(whiteAllInOneClsElement, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteAllInOneClsElement whiteAllInOneClsElement = new WhiteAllInOneClsElement();
     * whiteAllInOneClsElement.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteAllInOneClsElement.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteAllInOneClsElementBhv.<span style="color: #DD4747">delete</span>(whiteAllInOneClsElement);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteAllInOneClsElement The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteAllInOneClsElement whiteAllInOneClsElement) {
        doDelete(whiteAllInOneClsElement, null);
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
     *     WhiteAllInOneClsElement whiteAllInOneClsElement = new WhiteAllInOneClsElement();
     *     whiteAllInOneClsElement.setFooName("foo");
     *     if (...) {
     *         whiteAllInOneClsElement.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteAllInOneClsElementList.add(whiteAllInOneClsElement);
     * }
     * whiteAllInOneClsElementBhv.<span style="color: #DD4747">batchInsert</span>(whiteAllInOneClsElementList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteAllInOneClsElementList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteAllInOneClsElement> whiteAllInOneClsElementList) {
        return doBatchInsert(whiteAllInOneClsElementList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhiteAllInOneClsElement whiteAllInOneClsElement = new WhiteAllInOneClsElement();
     *     whiteAllInOneClsElement.setFooName("foo");
     *     if (...) {
     *         whiteAllInOneClsElement.setFooPrice(123);
     *     } else {
     *         whiteAllInOneClsElement.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteAllInOneClsElement.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteAllInOneClsElementList.add(whiteAllInOneClsElement);
     * }
     * whiteAllInOneClsElementBhv.<span style="color: #DD4747">batchUpdate</span>(whiteAllInOneClsElementList);
     * </pre>
     * @param whiteAllInOneClsElementList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteAllInOneClsElement> whiteAllInOneClsElementList) {
        return doBatchUpdate(whiteAllInOneClsElementList, null);
    }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * whiteAllInOneClsElementBhv.<span style="color: #DD4747">batchUpdate</span>(whiteAllInOneClsElementList, new SpecifyQuery<WhiteAllInOneClsElementCB>() {
     *     public void specify(WhiteAllInOneClsElementCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteAllInOneClsElementBhv.<span style="color: #DD4747">batchUpdate</span>(whiteAllInOneClsElementList, new SpecifyQuery<WhiteAllInOneClsElementCB>() {
     *     public void specify(WhiteAllInOneClsElementCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteAllInOneClsElementList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteAllInOneClsElement> whiteAllInOneClsElementList, SpecifyQuery<WhiteAllInOneClsElementCB> updateColumnSpec) {
        return doBatchUpdate(whiteAllInOneClsElementList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteAllInOneClsElementList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteAllInOneClsElement> whiteAllInOneClsElementList) {
        return doBatchDelete(whiteAllInOneClsElementList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * whiteAllInOneClsElementBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteAllInOneClsElement, WhiteAllInOneClsElementCB&gt;() {
     *     public ConditionBean setup(WhiteAllInOneClsElement entity, WhiteAllInOneClsElementCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteAllInOneClsElement, WhiteAllInOneClsElementCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteAllInOneClsElement whiteAllInOneClsElement = new WhiteAllInOneClsElement();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsElement.setPK...(value);</span>
     * whiteAllInOneClsElement.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsElement.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsElement.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsElement.setVersionNo(value);</span>
     * WhiteAllInOneClsElementCB cb = new WhiteAllInOneClsElementCB();
     * cb.query().setFoo...(value);
     * whiteAllInOneClsElementBhv.<span style="color: #DD4747">queryUpdate</span>(whiteAllInOneClsElement, cb);
     * </pre>
     * @param whiteAllInOneClsElement The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteAllInOneClsElement. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteAllInOneClsElement whiteAllInOneClsElement, WhiteAllInOneClsElementCB cb) {
        return doQueryUpdate(whiteAllInOneClsElement, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteAllInOneClsElementCB cb = new WhiteAllInOneClsElementCB();
     * cb.query().setFoo...(value);
     * whiteAllInOneClsElementBhv.<span style="color: #DD4747">queryDelete</span>(whiteAllInOneClsElement, cb);
     * </pre>
     * @param cb The condition-bean of WhiteAllInOneClsElement. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteAllInOneClsElementCB cb) {
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
     * WhiteAllInOneClsElement whiteAllInOneClsElement = new WhiteAllInOneClsElement();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteAllInOneClsElement.setFoo...(value);
     * whiteAllInOneClsElement.setBar...(value);
     * InsertOption<WhiteAllInOneClsElementCB> option = new InsertOption<WhiteAllInOneClsElementCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteAllInOneClsElementBhv.<span style="color: #DD4747">varyingInsert</span>(whiteAllInOneClsElement, option);
     * ... = whiteAllInOneClsElement.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteAllInOneClsElement The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteAllInOneClsElement whiteAllInOneClsElement, InsertOption<WhiteAllInOneClsElementCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteAllInOneClsElement, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteAllInOneClsElement whiteAllInOneClsElement = new WhiteAllInOneClsElement();
     * whiteAllInOneClsElement.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteAllInOneClsElement.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteAllInOneClsElement.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteAllInOneClsElementCB&gt; option = new UpdateOption&lt;WhiteAllInOneClsElementCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteAllInOneClsElementCB&gt;() {
     *         public void specify(WhiteAllInOneClsElementCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteAllInOneClsElementBhv.<span style="color: #DD4747">varyingUpdate</span>(whiteAllInOneClsElement, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteAllInOneClsElement The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteAllInOneClsElement whiteAllInOneClsElement, UpdateOption<WhiteAllInOneClsElementCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteAllInOneClsElement, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteAllInOneClsElement The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteAllInOneClsElement whiteAllInOneClsElement, InsertOption<WhiteAllInOneClsElementCB> insertOption, UpdateOption<WhiteAllInOneClsElementCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdate(whiteAllInOneClsElement, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteAllInOneClsElement The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteAllInOneClsElement whiteAllInOneClsElement, DeleteOption<WhiteAllInOneClsElementCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteAllInOneClsElement, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteAllInOneClsElementList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteAllInOneClsElement> whiteAllInOneClsElementList, InsertOption<WhiteAllInOneClsElementCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteAllInOneClsElementList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteAllInOneClsElementList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteAllInOneClsElement> whiteAllInOneClsElementList, UpdateOption<WhiteAllInOneClsElementCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteAllInOneClsElementList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteAllInOneClsElementList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteAllInOneClsElement> whiteAllInOneClsElementList, DeleteOption<WhiteAllInOneClsElementCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteAllInOneClsElementList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteAllInOneClsElement, WhiteAllInOneClsElementCB> setupper, InsertOption<WhiteAllInOneClsElementCB> option) {
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
     * WhiteAllInOneClsElement whiteAllInOneClsElement = new WhiteAllInOneClsElement();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsElement.setPK...(value);</span>
     * whiteAllInOneClsElement.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsElement.setVersionNo(value);</span>
     * WhiteAllInOneClsElementCB cb = new WhiteAllInOneClsElementCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteAllInOneClsElementCB&gt; option = new UpdateOption&lt;WhiteAllInOneClsElementCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteAllInOneClsElementCB&gt;() {
     *     public void specify(WhiteAllInOneClsElementCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteAllInOneClsElementBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteAllInOneClsElement, cb, option);
     * </pre>
     * @param whiteAllInOneClsElement The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteAllInOneClsElement. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteAllInOneClsElement whiteAllInOneClsElement, WhiteAllInOneClsElementCB cb, UpdateOption<WhiteAllInOneClsElementCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteAllInOneClsElement, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteAllInOneClsElement. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteAllInOneClsElementCB cb, DeleteOption<WhiteAllInOneClsElementCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteAllInOneClsElementBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends WhiteAllInOneClsElement> typeOfSelectedEntity() { return WhiteAllInOneClsElement.class; }
    protected Class<WhiteAllInOneClsElement> typeOfHandlingEntity() { return WhiteAllInOneClsElement.class; }
    protected Class<WhiteAllInOneClsElementCB> typeOfHandlingConditionBean() { return WhiteAllInOneClsElementCB.class; }
    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteAllInOneClsElementCB> downcast(InsertOption<? extends ConditionBean> op) { return (InsertOption<WhiteAllInOneClsElementCB>)op; }
    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteAllInOneClsElementCB> downcast(UpdateOption<? extends ConditionBean> op) { return (UpdateOption<WhiteAllInOneClsElementCB>)op; }
    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteAllInOneClsElementCB> downcast(DeleteOption<? extends ConditionBean> op) { return (DeleteOption<WhiteAllInOneClsElementCB>)op; }
    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteAllInOneClsElement, WhiteAllInOneClsElementCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp)
    { return (QueryInsertSetupper<WhiteAllInOneClsElement, WhiteAllInOneClsElementCB>)sp; }
}
