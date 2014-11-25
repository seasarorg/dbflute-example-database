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
 * The behavior of WHITE_QUOTED as TABLE. <br />
 * <pre>
 * [primary key]
 *     SELECT
 *
 * [column]
 *     SELECT, FROM
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
 *     white_quoted_ref
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whiteQuotedRefList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteQuotedBhv extends AbstractBehaviorWritable<WhiteQuoted, WhiteQuotedCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public WhiteQuotedDbm getDBMeta() { return WhiteQuotedDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteQuotedDbm getMyDBMeta() { return WhiteQuotedDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhiteQuotedCB newConditionBean() { return new WhiteQuotedCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteQuoted newMyEntity() { return new WhiteQuoted(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteQuotedCB newMyConditionBean() { return new WhiteQuotedCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteQuotedCB cb = new WhiteQuotedCB();
     * cb.query().setFoo...(value);
     * int count = whiteQuotedBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteQuoted. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteQuotedCB cb) {
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
     * WhiteQuotedCB cb = new WhiteQuotedCB();
     * cb.query().setFoo...(value);
     * WhiteQuoted whiteQuoted = whiteQuotedBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (whiteQuoted != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = whiteQuoted.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteQuoted. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteQuoted selectEntity(WhiteQuotedCB cb) {
        return facadeSelectEntity(cb);
    }

    protected WhiteQuoted facadeSelectEntity(WhiteQuotedCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteQuoted> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteQuotedCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * WhiteQuotedCB cb = new WhiteQuotedCB();
     * cb.query().setFoo...(value);
     * WhiteQuoted whiteQuoted = whiteQuotedBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteQuoted.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteQuoted. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteQuoted selectEntityWithDeletedCheck(WhiteQuotedCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param select : PK, NotNull, INT(10). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteQuoted selectByPKValue(Integer select) {
        return facadeSelectByPKValue(select);
    }

    protected WhiteQuoted facadeSelectByPKValue(Integer select) {
        return doSelectByPK(select, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteQuoted> ENTITY doSelectByPK(Integer select, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(select), tp);
    }

    protected <ENTITY extends WhiteQuoted> OptionalEntity<ENTITY> doSelectOptionalByPK(Integer select, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(select, tp), select);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param select : PK, NotNull, INT(10). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteQuoted selectByPKValueWithDeletedCheck(Integer select) {
        return doSelectByPKWithDeletedCheck(select, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteQuoted> ENTITY doSelectByPKWithDeletedCheck(Integer select, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(select), tp);
    }

    protected WhiteQuotedCB xprepareCBAsPK(Integer select) {
        assertObjectNotNull("select", select);
        return newConditionBean().acceptPK(select);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteQuotedCB cb = new WhiteQuotedCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteQuoted&gt; whiteQuotedList = whiteQuotedBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteQuoted whiteQuoted : whiteQuotedList) {
     *     ... = whiteQuoted.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteQuoted. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteQuoted> selectList(WhiteQuotedCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * WhiteQuotedCB cb = new WhiteQuotedCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteQuoted&gt; page = whiteQuotedBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteQuoted whiteQuoted : page) {
     *     ... = whiteQuoted.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteQuoted. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteQuoted> selectPage(WhiteQuotedCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteQuotedCB cb = new WhiteQuotedCB();
     * cb.query().setFoo...(value);
     * whiteQuotedBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteQuoted&gt;() {
     *     public void handle(WhiteQuoted entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteQuoted. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteQuoted. (NotNull)
     */
    public void selectCursor(WhiteQuotedCB cb, EntityRowHandler<WhiteQuoted> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteQuotedBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteQuotedCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhiteQuotedCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param whiteQuotedList The entity list of whiteQuoted. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhiteQuoted> whiteQuotedList, ReferrerLoaderHandler<LoaderOfWhiteQuoted> handler) {
        xassLRArg(whiteQuotedList, handler);
        handler.handle(new LoaderOfWhiteQuoted().ready(whiteQuotedList, _behaviorSelector));
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
     * @param whiteQuoted The entity of whiteQuoted. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhiteQuoted whiteQuoted, ReferrerLoaderHandler<LoaderOfWhiteQuoted> handler) {
        xassLRArg(whiteQuoted, handler);
        handler.handle(new LoaderOfWhiteQuoted().ready(xnewLRAryLs(whiteQuoted), _behaviorSelector));
    }

    /**
     * Load referrer of whiteQuotedRefList by the set-upper of referrer. <br />
     * white_quoted_ref by ORDER, named 'whiteQuotedRefList'.
     * <pre>
     * whiteQuotedBhv.<span style="color: #DD4747">loadWhiteQuotedRefList</span>(whiteQuotedList, new ConditionBeanSetupper&lt;WhiteQuotedRefCB&gt;() {
     *     public void setup(WhiteQuotedRefCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (WhiteQuoted whiteQuoted : whiteQuotedList) {
     *     ... = whiteQuoted.<span style="color: #DD4747">getWhiteQuotedRefList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setOrder_InScope(pkList);
     * cb.query().addOrderBy_Order_Asc();
     * </pre>
     * @param whiteQuotedList The entity list of whiteQuoted. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteQuotedRef> loadWhiteQuotedRefList(List<WhiteQuoted> whiteQuotedList, ConditionBeanSetupper<WhiteQuotedRefCB> setupper) {
        xassLRArg(whiteQuotedList, setupper);
        return doLoadWhiteQuotedRefList(whiteQuotedList, new LoadReferrerOption<WhiteQuotedRefCB, WhiteQuotedRef>().xinit(setupper));
    }

    /**
     * Load referrer of whiteQuotedRefList by the set-upper of referrer. <br />
     * white_quoted_ref by ORDER, named 'whiteQuotedRefList'.
     * <pre>
     * whiteQuotedBhv.<span style="color: #DD4747">loadWhiteQuotedRefList</span>(whiteQuotedList, new ConditionBeanSetupper&lt;WhiteQuotedRefCB&gt;() {
     *     public void setup(WhiteQuotedRefCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = whiteQuoted.<span style="color: #DD4747">getWhiteQuotedRefList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setOrder_InScope(pkList);
     * cb.query().addOrderBy_Order_Asc();
     * </pre>
     * @param whiteQuoted The entity of whiteQuoted. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteQuotedRef> loadWhiteQuotedRefList(WhiteQuoted whiteQuoted, ConditionBeanSetupper<WhiteQuotedRefCB> setupper) {
        xassLRArg(whiteQuoted, setupper);
        return doLoadWhiteQuotedRefList(xnewLRLs(whiteQuoted), new LoadReferrerOption<WhiteQuotedRefCB, WhiteQuotedRef>().xinit(setupper));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param whiteQuoted The entity of whiteQuoted. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteQuotedRef> loadWhiteQuotedRefList(WhiteQuoted whiteQuoted, LoadReferrerOption<WhiteQuotedRefCB, WhiteQuotedRef> loadReferrerOption) {
        xassLRArg(whiteQuoted, loadReferrerOption);
        return loadWhiteQuotedRefList(xnewLRLs(whiteQuoted), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param whiteQuotedList The entity list of whiteQuoted. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WhiteQuotedRef> loadWhiteQuotedRefList(List<WhiteQuoted> whiteQuotedList, LoadReferrerOption<WhiteQuotedRefCB, WhiteQuotedRef> loadReferrerOption) {
        xassLRArg(whiteQuotedList, loadReferrerOption);
        if (whiteQuotedList.isEmpty()) { return (NestedReferrerListGateway<WhiteQuotedRef>)EMPTY_NREF_LGWAY; }
        return doLoadWhiteQuotedRefList(whiteQuotedList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WhiteQuotedRef> doLoadWhiteQuotedRefList(List<WhiteQuoted> whiteQuotedList, LoadReferrerOption<WhiteQuotedRefCB, WhiteQuotedRef> option) {
        return helpLoadReferrerInternally(whiteQuotedList, option, "whiteQuotedRefList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key select.
     * @param whiteQuotedList The list of whiteQuoted. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractSelectList(List<WhiteQuoted> whiteQuotedList)
    { return helpExtractListInternally(whiteQuotedList, "select"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteQuoted whiteQuoted = new WhiteQuoted();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteQuoted.setFoo...(value);
     * whiteQuoted.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteQuoted.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteQuoted.set...;</span>
     * whiteQuotedBhv.<span style="color: #DD4747">insert</span>(whiteQuoted);
     * ... = whiteQuoted.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteQuoted The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteQuoted whiteQuoted) {
        doInsert(whiteQuoted, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteQuoted whiteQuoted = new WhiteQuoted();
     * whiteQuoted.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteQuoted.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteQuoted.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteQuoted.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteQuoted.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteQuotedBhv.<span style="color: #DD4747">update</span>(whiteQuoted);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteQuoted The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhiteQuoted whiteQuoted) {
        doUpdate(whiteQuoted, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param whiteQuoted The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteQuoted whiteQuoted) {
        doInsertOrUpdate(whiteQuoted, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteQuoted whiteQuoted = new WhiteQuoted();
     * whiteQuoted.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteQuoted.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteQuotedBhv.<span style="color: #DD4747">delete</span>(whiteQuoted);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteQuoted The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteQuoted whiteQuoted) {
        doDelete(whiteQuoted, null);
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
     *     WhiteQuoted whiteQuoted = new WhiteQuoted();
     *     whiteQuoted.setFooName("foo");
     *     if (...) {
     *         whiteQuoted.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteQuotedList.add(whiteQuoted);
     * }
     * whiteQuotedBhv.<span style="color: #DD4747">batchInsert</span>(whiteQuotedList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteQuotedList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteQuoted> whiteQuotedList) {
        return doBatchInsert(whiteQuotedList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhiteQuoted whiteQuoted = new WhiteQuoted();
     *     whiteQuoted.setFooName("foo");
     *     if (...) {
     *         whiteQuoted.setFooPrice(123);
     *     } else {
     *         whiteQuoted.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteQuoted.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteQuotedList.add(whiteQuoted);
     * }
     * whiteQuotedBhv.<span style="color: #DD4747">batchUpdate</span>(whiteQuotedList);
     * </pre>
     * @param whiteQuotedList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteQuoted> whiteQuotedList) {
        return doBatchUpdate(whiteQuotedList, null);
    }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * whiteQuotedBhv.<span style="color: #DD4747">batchUpdate</span>(whiteQuotedList, new SpecifyQuery<WhiteQuotedCB>() {
     *     public void specify(WhiteQuotedCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteQuotedBhv.<span style="color: #DD4747">batchUpdate</span>(whiteQuotedList, new SpecifyQuery<WhiteQuotedCB>() {
     *     public void specify(WhiteQuotedCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteQuotedList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteQuoted> whiteQuotedList, SpecifyQuery<WhiteQuotedCB> updateColumnSpec) {
        return doBatchUpdate(whiteQuotedList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteQuotedList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteQuoted> whiteQuotedList) {
        return doBatchDelete(whiteQuotedList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * whiteQuotedBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteQuoted, WhiteQuotedCB&gt;() {
     *     public ConditionBean setup(WhiteQuoted entity, WhiteQuotedCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteQuoted, WhiteQuotedCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteQuoted whiteQuoted = new WhiteQuoted();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteQuoted.setPK...(value);</span>
     * whiteQuoted.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteQuoted.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteQuoted.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteQuoted.setVersionNo(value);</span>
     * WhiteQuotedCB cb = new WhiteQuotedCB();
     * cb.query().setFoo...(value);
     * whiteQuotedBhv.<span style="color: #DD4747">queryUpdate</span>(whiteQuoted, cb);
     * </pre>
     * @param whiteQuoted The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteQuoted. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteQuoted whiteQuoted, WhiteQuotedCB cb) {
        return doQueryUpdate(whiteQuoted, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteQuotedCB cb = new WhiteQuotedCB();
     * cb.query().setFoo...(value);
     * whiteQuotedBhv.<span style="color: #DD4747">queryDelete</span>(whiteQuoted, cb);
     * </pre>
     * @param cb The condition-bean of WhiteQuoted. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteQuotedCB cb) {
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
     * WhiteQuoted whiteQuoted = new WhiteQuoted();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteQuoted.setFoo...(value);
     * whiteQuoted.setBar...(value);
     * InsertOption<WhiteQuotedCB> option = new InsertOption<WhiteQuotedCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteQuotedBhv.<span style="color: #DD4747">varyingInsert</span>(whiteQuoted, option);
     * ... = whiteQuoted.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteQuoted The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteQuoted whiteQuoted, InsertOption<WhiteQuotedCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteQuoted, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteQuoted whiteQuoted = new WhiteQuoted();
     * whiteQuoted.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteQuoted.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteQuoted.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteQuotedCB&gt; option = new UpdateOption&lt;WhiteQuotedCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteQuotedCB&gt;() {
     *         public void specify(WhiteQuotedCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteQuotedBhv.<span style="color: #DD4747">varyingUpdate</span>(whiteQuoted, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteQuoted The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteQuoted whiteQuoted, UpdateOption<WhiteQuotedCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteQuoted, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteQuoted The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteQuoted whiteQuoted, InsertOption<WhiteQuotedCB> insertOption, UpdateOption<WhiteQuotedCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdate(whiteQuoted, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteQuoted The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteQuoted whiteQuoted, DeleteOption<WhiteQuotedCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteQuoted, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteQuotedList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteQuoted> whiteQuotedList, InsertOption<WhiteQuotedCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteQuotedList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteQuotedList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteQuoted> whiteQuotedList, UpdateOption<WhiteQuotedCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteQuotedList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteQuotedList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteQuoted> whiteQuotedList, DeleteOption<WhiteQuotedCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteQuotedList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteQuoted, WhiteQuotedCB> setupper, InsertOption<WhiteQuotedCB> option) {
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
     * WhiteQuoted whiteQuoted = new WhiteQuoted();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteQuoted.setPK...(value);</span>
     * whiteQuoted.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteQuoted.setVersionNo(value);</span>
     * WhiteQuotedCB cb = new WhiteQuotedCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteQuotedCB&gt; option = new UpdateOption&lt;WhiteQuotedCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteQuotedCB&gt;() {
     *     public void specify(WhiteQuotedCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteQuotedBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteQuoted, cb, option);
     * </pre>
     * @param whiteQuoted The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteQuoted. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteQuoted whiteQuoted, WhiteQuotedCB cb, UpdateOption<WhiteQuotedCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteQuoted, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of WhiteQuoted. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteQuotedCB cb, DeleteOption<WhiteQuotedCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteQuotedBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<WhiteQuotedBhv> facadeExecutor = doOutsideSql();
        return facadeExecutor.xbasicExecutor(); // variable to resolve generic type
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends WhiteQuoted> typeOfSelectedEntity() { return WhiteQuoted.class; }
    protected Class<WhiteQuoted> typeOfHandlingEntity() { return WhiteQuoted.class; }
    protected Class<WhiteQuotedCB> typeOfHandlingConditionBean() { return WhiteQuotedCB.class; }
}
