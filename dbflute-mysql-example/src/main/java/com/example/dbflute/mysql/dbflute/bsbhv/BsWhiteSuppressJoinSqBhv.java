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
import org.seasar.dbflute.cbean.chelper.HpSLSExecutor;
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
 * The behavior of WHITE_SUPPRESS_JOIN_SQ as TABLE. <br />
 * <pre>
 * [primary key]
 *     SUPPRESS_JOIN_SQ_ID
 *
 * [column]
 *     SUPPRESS_JOIN_SQ_ID, SUPPRESS_JOIN_SQ_NAME
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
 *     white_suppress_join_sq_one(AsOne)
 *
 * [referrer table]
 *     white_suppress_join_sq_many, white_suppress_join_sq_one
 *
 * [foreign property]
 *     whiteSuppressJoinSqOneAsOne
 *
 * [referrer property]
 *     whiteSuppressJoinSqManyList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteSuppressJoinSqBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_suppress_join_sq"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public DBMeta getDBMeta() { return WhiteSuppressJoinSqDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteSuppressJoinSqDbm getMyDBMeta() { return WhiteSuppressJoinSqDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhiteSuppressJoinSq newEntity() { return new WhiteSuppressJoinSq(); }

    /** {@inheritDoc} */
    public WhiteSuppressJoinSqCB newConditionBean() { return new WhiteSuppressJoinSqCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteSuppressJoinSq newMyEntity() { return new WhiteSuppressJoinSq(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteSuppressJoinSqCB newMyConditionBean() { return new WhiteSuppressJoinSqCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteSuppressJoinSqCB cb = new WhiteSuppressJoinSqCB();
     * cb.query().setFoo...(value);
     * int count = whiteSuppressJoinSqBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteSuppressJoinSq. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteSuppressJoinSqCB cb) {
        return facadeSelectCount(cb);
    }

    protected int facadeSelectCount(WhiteSuppressJoinSqCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteSuppressJoinSqCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteSuppressJoinSqCB cb) { // called by selectPage(cb)
        assertCBStateValid(cb);
        return delegateSelectCountPlainly(cb);
    }

    protected int doReadCount(ConditionBean cb) { return facadeSelectCount(downcast(cb)); }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean. #beforejava8 <br />
     * <span style="color: #AD4747; font-size: 120%">The return might be null if no data, so you should have null check.</span> <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, use selectEntityWithDeletedCheck().</span>
     * <pre>
     * WhiteSuppressJoinSqCB cb = new WhiteSuppressJoinSqCB();
     * cb.query().setFoo...(value);
     * WhiteSuppressJoinSq whiteSuppressJoinSq = whiteSuppressJoinSqBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (whiteSuppressJoinSq != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = whiteSuppressJoinSq.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSuppressJoinSq. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSuppressJoinSq selectEntity(WhiteSuppressJoinSqCB cb) {
        return facadeSelectEntity(cb);
    }

    protected WhiteSuppressJoinSq facadeSelectEntity(WhiteSuppressJoinSqCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteSuppressJoinSq> ENTITY doSelectEntity(WhiteSuppressJoinSqCB cb, Class<ENTITY> tp) {
        return helpSelectEntityInternally(cb, tp);
    }

    protected <ENTITY extends WhiteSuppressJoinSq> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteSuppressJoinSqCB cb, Class<ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * WhiteSuppressJoinSqCB cb = new WhiteSuppressJoinSqCB();
     * cb.query().setFoo...(value);
     * WhiteSuppressJoinSq whiteSuppressJoinSq = whiteSuppressJoinSqBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteSuppressJoinSq.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteSuppressJoinSq. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSuppressJoinSq selectEntityWithDeletedCheck(WhiteSuppressJoinSqCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    protected WhiteSuppressJoinSq facadeSelectEntityWithDeletedCheck(WhiteSuppressJoinSqCB cb) {
        return doSelectEntityWithDeletedCheck(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteSuppressJoinSq> ENTITY doSelectEntityWithDeletedCheck(WhiteSuppressJoinSqCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp);
    }

    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) { return facadeSelectEntityWithDeletedCheck(downcast(cb)); }

    /**
     * Select the entity by the primary-key value.
     * @param suppressJoinSqId : PK, NotNull, INT(10). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSuppressJoinSq selectByPKValue(Integer suppressJoinSqId) {
        return facadeSelectByPKValue(suppressJoinSqId);
    }

    protected WhiteSuppressJoinSq facadeSelectByPKValue(Integer suppressJoinSqId) {
        return doSelectByPK(suppressJoinSqId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteSuppressJoinSq> ENTITY doSelectByPK(Integer suppressJoinSqId, Class<ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(suppressJoinSqId), tp);
    }

    protected <ENTITY extends WhiteSuppressJoinSq> OptionalEntity<ENTITY> doSelectOptionalByPK(Integer suppressJoinSqId, Class<ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(suppressJoinSqId, tp), suppressJoinSqId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param suppressJoinSqId : PK, NotNull, INT(10). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSuppressJoinSq selectByPKValueWithDeletedCheck(Integer suppressJoinSqId) {
        return doSelectByPKWithDeletedCheck(suppressJoinSqId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteSuppressJoinSq> ENTITY doSelectByPKWithDeletedCheck(Integer suppressJoinSqId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(suppressJoinSqId), tp);
    }

    protected WhiteSuppressJoinSqCB xprepareCBAsPK(Integer suppressJoinSqId) {
        assertObjectNotNull("suppressJoinSqId", suppressJoinSqId);
        return newConditionBean().acceptPK(suppressJoinSqId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteSuppressJoinSqCB cb = new WhiteSuppressJoinSqCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteSuppressJoinSq&gt; whiteSuppressJoinSqList = whiteSuppressJoinSqBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteSuppressJoinSq whiteSuppressJoinSq : whiteSuppressJoinSqList) {
     *     ... = whiteSuppressJoinSq.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSuppressJoinSq. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteSuppressJoinSq> selectList(WhiteSuppressJoinSqCB cb) {
        return facadeSelectList(cb);
    }

    protected ListResultBean<WhiteSuppressJoinSq> facadeSelectList(WhiteSuppressJoinSqCB cb) {
        return doSelectList(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteSuppressJoinSq> ListResultBean<ENTITY> doSelectList(WhiteSuppressJoinSqCB cb, Class<ENTITY> tp) {
        return helpSelectListInternally(cb, tp);
    }

    protected ListResultBean<? extends Entity> doReadList(ConditionBean cb) { return facadeSelectList(downcast(cb)); }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * WhiteSuppressJoinSqCB cb = new WhiteSuppressJoinSqCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteSuppressJoinSq&gt; page = whiteSuppressJoinSqBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteSuppressJoinSq whiteSuppressJoinSq : page) {
     *     ... = whiteSuppressJoinSq.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSuppressJoinSq. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteSuppressJoinSq> selectPage(WhiteSuppressJoinSqCB cb) {
        return facadeSelectPage(cb);
    }

    protected PagingResultBean<WhiteSuppressJoinSq> facadeSelectPage(WhiteSuppressJoinSqCB cb) {
        return doSelectPage(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteSuppressJoinSq> PagingResultBean<ENTITY> doSelectPage(WhiteSuppressJoinSqCB cb, Class<ENTITY> tp) {
        return helpSelectPageInternally(cb, tp);
    }

    protected PagingResultBean<? extends Entity> doReadPage(ConditionBean cb) { return facadeSelectPage(downcast(cb)); }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteSuppressJoinSqCB cb = new WhiteSuppressJoinSqCB();
     * cb.query().setFoo...(value);
     * whiteSuppressJoinSqBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteSuppressJoinSq&gt;() {
     *     public void handle(WhiteSuppressJoinSq entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteSuppressJoinSq. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteSuppressJoinSq. (NotNull)
     */
    public void selectCursor(WhiteSuppressJoinSqCB cb, EntityRowHandler<WhiteSuppressJoinSq> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    protected void facadeSelectCursor(WhiteSuppressJoinSqCB cb, EntityRowHandler<WhiteSuppressJoinSq> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteSuppressJoinSq> void doSelectCursor(WhiteSuppressJoinSqCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteSuppressJoinSqBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteSuppressJoinSqCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhiteSuppressJoinSqCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    protected <RESULT> HpSLSFunction<WhiteSuppressJoinSqCB, RESULT> facadeScalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newConditionBean());
    }

    protected <RESULT, CB extends WhiteSuppressJoinSqCB> HpSLSFunction<CB, RESULT> doScalarSelect(final Class<RESULT> tp, final CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        HpSLSExecutor<CB, RESULT> executor = createHpSLSExecutor(); // variable to resolve generic
        return createSLSFunction(cb, tp, executor);
    }

    protected <RESULT> HpSLSFunction<? extends ConditionBean, RESULT> doReadScalar(Class<RESULT> tp) { return facadeScalarSelect(tp); }

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
     * @param whiteSuppressJoinSqList The entity list of whiteSuppressJoinSq. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhiteSuppressJoinSq> whiteSuppressJoinSqList, ReferrerLoaderHandler<LoaderOfWhiteSuppressJoinSq> handler) {
        xassLRArg(whiteSuppressJoinSqList, handler);
        handler.handle(new LoaderOfWhiteSuppressJoinSq().ready(whiteSuppressJoinSqList, _behaviorSelector));
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
     * @param whiteSuppressJoinSq The entity of whiteSuppressJoinSq. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhiteSuppressJoinSq whiteSuppressJoinSq, ReferrerLoaderHandler<LoaderOfWhiteSuppressJoinSq> handler) {
        xassLRArg(whiteSuppressJoinSq, handler);
        handler.handle(new LoaderOfWhiteSuppressJoinSq().ready(xnewLRAryLs(whiteSuppressJoinSq), _behaviorSelector));
    }

    /**
     * Load referrer of whiteSuppressJoinSqManyList by the set-upper of referrer. <br />
     * white_suppress_join_sq_many by SUPPRESS_JOIN_SQ_ID, named 'whiteSuppressJoinSqManyList'.
     * <pre>
     * whiteSuppressJoinSqBhv.<span style="color: #DD4747">loadWhiteSuppressJoinSqManyList</span>(whiteSuppressJoinSqList, new ConditionBeanSetupper&lt;WhiteSuppressJoinSqManyCB&gt;() {
     *     public void setup(WhiteSuppressJoinSqManyCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (WhiteSuppressJoinSq whiteSuppressJoinSq : whiteSuppressJoinSqList) {
     *     ... = whiteSuppressJoinSq.<span style="color: #DD4747">getWhiteSuppressJoinSqManyList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSuppressJoinSqId_InScope(pkList);
     * cb.query().addOrderBy_SuppressJoinSqId_Asc();
     * </pre>
     * @param whiteSuppressJoinSqList The entity list of whiteSuppressJoinSq. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteSuppressJoinSqMany> loadWhiteSuppressJoinSqManyList(List<WhiteSuppressJoinSq> whiteSuppressJoinSqList, ConditionBeanSetupper<WhiteSuppressJoinSqManyCB> setupper) {
        xassLRArg(whiteSuppressJoinSqList, setupper);
        return doLoadWhiteSuppressJoinSqManyList(whiteSuppressJoinSqList, new LoadReferrerOption<WhiteSuppressJoinSqManyCB, WhiteSuppressJoinSqMany>().xinit(setupper));
    }

    /**
     * Load referrer of whiteSuppressJoinSqManyList by the set-upper of referrer. <br />
     * white_suppress_join_sq_many by SUPPRESS_JOIN_SQ_ID, named 'whiteSuppressJoinSqManyList'.
     * <pre>
     * whiteSuppressJoinSqBhv.<span style="color: #DD4747">loadWhiteSuppressJoinSqManyList</span>(whiteSuppressJoinSqList, new ConditionBeanSetupper&lt;WhiteSuppressJoinSqManyCB&gt;() {
     *     public void setup(WhiteSuppressJoinSqManyCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = whiteSuppressJoinSq.<span style="color: #DD4747">getWhiteSuppressJoinSqManyList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSuppressJoinSqId_InScope(pkList);
     * cb.query().addOrderBy_SuppressJoinSqId_Asc();
     * </pre>
     * @param whiteSuppressJoinSq The entity of whiteSuppressJoinSq. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteSuppressJoinSqMany> loadWhiteSuppressJoinSqManyList(WhiteSuppressJoinSq whiteSuppressJoinSq, ConditionBeanSetupper<WhiteSuppressJoinSqManyCB> setupper) {
        xassLRArg(whiteSuppressJoinSq, setupper);
        return doLoadWhiteSuppressJoinSqManyList(xnewLRLs(whiteSuppressJoinSq), new LoadReferrerOption<WhiteSuppressJoinSqManyCB, WhiteSuppressJoinSqMany>().xinit(setupper));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param whiteSuppressJoinSq The entity of whiteSuppressJoinSq. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteSuppressJoinSqMany> loadWhiteSuppressJoinSqManyList(WhiteSuppressJoinSq whiteSuppressJoinSq, LoadReferrerOption<WhiteSuppressJoinSqManyCB, WhiteSuppressJoinSqMany> loadReferrerOption) {
        xassLRArg(whiteSuppressJoinSq, loadReferrerOption);
        return loadWhiteSuppressJoinSqManyList(xnewLRLs(whiteSuppressJoinSq), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean setupper.} #beforejava8
     * @param whiteSuppressJoinSqList The entity list of whiteSuppressJoinSq. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WhiteSuppressJoinSqMany> loadWhiteSuppressJoinSqManyList(List<WhiteSuppressJoinSq> whiteSuppressJoinSqList, LoadReferrerOption<WhiteSuppressJoinSqManyCB, WhiteSuppressJoinSqMany> loadReferrerOption) {
        xassLRArg(whiteSuppressJoinSqList, loadReferrerOption);
        if (whiteSuppressJoinSqList.isEmpty()) { return (NestedReferrerListGateway<WhiteSuppressJoinSqMany>)EMPTY_NREF_LGWAY; }
        return doLoadWhiteSuppressJoinSqManyList(whiteSuppressJoinSqList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WhiteSuppressJoinSqMany> doLoadWhiteSuppressJoinSqManyList(List<WhiteSuppressJoinSq> whiteSuppressJoinSqList, LoadReferrerOption<WhiteSuppressJoinSqManyCB, WhiteSuppressJoinSqMany> option) {
        return helpLoadReferrerInternally(whiteSuppressJoinSqList, option, "whiteSuppressJoinSqManyList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of referrer-as-one table 'WhiteSuppressJoinSqOne'.
     * @param whiteSuppressJoinSqList The list of whiteSuppressJoinSq. (NotNull, EmptyAllowed)
     * @return The list of referrer-as-one table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteSuppressJoinSqOne> pulloutWhiteSuppressJoinSqOneAsOne(List<WhiteSuppressJoinSq> whiteSuppressJoinSqList)
    { return helpPulloutInternally(whiteSuppressJoinSqList, "whiteSuppressJoinSqOneAsOne"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key suppressJoinSqId.
     * @param whiteSuppressJoinSqList The list of whiteSuppressJoinSq. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractSuppressJoinSqIdList(List<WhiteSuppressJoinSq> whiteSuppressJoinSqList)
    { return helpExtractListInternally(whiteSuppressJoinSqList, "suppressJoinSqId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteSuppressJoinSq whiteSuppressJoinSq = new WhiteSuppressJoinSq();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteSuppressJoinSq.setFoo...(value);
     * whiteSuppressJoinSq.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSq.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSq.set...;</span>
     * whiteSuppressJoinSqBhv.<span style="color: #DD4747">insert</span>(whiteSuppressJoinSq);
     * ... = whiteSuppressJoinSq.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteSuppressJoinSq The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteSuppressJoinSq whiteSuppressJoinSq) {
        doInsert(whiteSuppressJoinSq, null);
    }

    protected void doInsert(WhiteSuppressJoinSq et, InsertOption<WhiteSuppressJoinSqCB> op) {
        assertObjectNotNull("whiteSuppressJoinSq", et); prepareInsertOption(op); delegateInsert(et, op);
    }

    protected void prepareInsertOption(InsertOption<WhiteSuppressJoinSqCB> op) {
        if (op == null) { return; } assertInsertOptionStatus(op);
        if (op.hasSpecifiedInsertColumn()) { op.resolveInsertColumnSpecification(createCBForSpecifiedUpdate()); }
    }

    protected void doCreate(Entity et, InsertOption<? extends ConditionBean> op) { doInsert(downcast(et), downcast(op)); }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteSuppressJoinSq whiteSuppressJoinSq = new WhiteSuppressJoinSq();
     * whiteSuppressJoinSq.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteSuppressJoinSq.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSq.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSq.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteSuppressJoinSq.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteSuppressJoinSqBhv.<span style="color: #DD4747">update</span>(whiteSuppressJoinSq);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSuppressJoinSq The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhiteSuppressJoinSq whiteSuppressJoinSq) {
        doUpdate(whiteSuppressJoinSq, null);
    }

    protected void doUpdate(WhiteSuppressJoinSq et, UpdateOption<WhiteSuppressJoinSqCB> op) {
        assertObjectNotNull("whiteSuppressJoinSq", et); prepareUpdateOption(op); helpUpdateInternally(et, op);
    }

    protected void prepareUpdateOption(UpdateOption<WhiteSuppressJoinSqCB> op) {
        if (op == null) { return; } assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) { op.resolveSelfSpecification(createCBForVaryingUpdate()); }
        if (op.hasSpecifiedUpdateColumn()) { op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate()); }
    }

    protected WhiteSuppressJoinSqCB createCBForVaryingUpdate()
    { WhiteSuppressJoinSqCB cb = newConditionBean(); cb.xsetupForVaryingUpdate(); return cb; }

    protected WhiteSuppressJoinSqCB createCBForSpecifiedUpdate()
    { WhiteSuppressJoinSqCB cb = newConditionBean(); cb.xsetupForSpecifiedUpdate(); return cb; }

    protected void doModify(Entity et, UpdateOption<? extends ConditionBean> op) { doUpdate(downcast(et), downcast(op)); }

    protected void doModifyNonstrict(Entity et, UpdateOption<? extends ConditionBean> op)
    { doModify(et, op); }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param whiteSuppressJoinSq The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteSuppressJoinSq whiteSuppressJoinSq) {
        doInsertOrUpdate(whiteSuppressJoinSq, null, null);
    }

    protected void doInsertOrUpdate(WhiteSuppressJoinSq et, InsertOption<WhiteSuppressJoinSqCB> iop, UpdateOption<WhiteSuppressJoinSqCB> uop) {
        assertObjectNotNull("whiteSuppressJoinSq", et); helpInsertOrUpdateInternally(et, iop, uop);
    }

    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop)
    { doInsertOrUpdate(downcast(et), downcast(iop), downcast(uop)); }

    protected void doCreateOrModifyNonstrict(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop)
    { doCreateOrModify(et, iop, uop); }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteSuppressJoinSq whiteSuppressJoinSq = new WhiteSuppressJoinSq();
     * whiteSuppressJoinSq.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteSuppressJoinSq.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteSuppressJoinSqBhv.<span style="color: #DD4747">delete</span>(whiteSuppressJoinSq);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSuppressJoinSq The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteSuppressJoinSq whiteSuppressJoinSq) {
        doDelete(whiteSuppressJoinSq, null);
    }

    protected void doDelete(WhiteSuppressJoinSq et, final DeleteOption<WhiteSuppressJoinSqCB> op) {
        assertObjectNotNull("whiteSuppressJoinSq", et); prepareDeleteOption(op); helpDeleteInternally(et, op);
    }

    protected void prepareDeleteOption(DeleteOption<WhiteSuppressJoinSqCB> op) { if (op != null) { assertDeleteOptionStatus(op); } }

    protected void doRemove(Entity et, DeleteOption<? extends ConditionBean> op) { doDelete(downcast(et), downcast(op)); }

    protected void doRemoveNonstrict(Entity et, DeleteOption<? extends ConditionBean> op)
    { doRemove(et, op); }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch-insert the entity list modified-only of same-set columns. (DefaultConstraintsEnabled) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <p><span style="color: #DD4747; font-size: 120%">The columns of least common multiple are registered like this:</span></p>
     * <pre>
     * for (... : ...) {
     *     WhiteSuppressJoinSq whiteSuppressJoinSq = new WhiteSuppressJoinSq();
     *     whiteSuppressJoinSq.setFooName("foo");
     *     if (...) {
     *         whiteSuppressJoinSq.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteSuppressJoinSqList.add(whiteSuppressJoinSq);
     * }
     * whiteSuppressJoinSqBhv.<span style="color: #DD4747">batchInsert</span>(whiteSuppressJoinSqList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteSuppressJoinSqList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteSuppressJoinSq> whiteSuppressJoinSqList) {
        return doBatchInsert(whiteSuppressJoinSqList, null);
    }

    protected int[] doBatchInsert(List<WhiteSuppressJoinSq> ls, InsertOption<WhiteSuppressJoinSqCB> op) {
        assertObjectNotNull("whiteSuppressJoinSqList", ls);
        InsertOption<WhiteSuppressJoinSqCB> rlop; if (op != null) { rlop = op; } else { rlop = createPlainInsertOption(); }
        prepareBatchInsertOption(ls, rlop); // required
        return delegateBatchInsert(ls, rlop);
    }

    protected void prepareBatchInsertOption(List<WhiteSuppressJoinSq> ls, InsertOption<WhiteSuppressJoinSqCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(ls);
        prepareInsertOption(op);
    }

    protected int[] doLumpCreate(List<Entity> ls, InsertOption<? extends ConditionBean> op) { return doBatchInsert(downcast(ls), downcast(op)); }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhiteSuppressJoinSq whiteSuppressJoinSq = new WhiteSuppressJoinSq();
     *     whiteSuppressJoinSq.setFooName("foo");
     *     if (...) {
     *         whiteSuppressJoinSq.setFooPrice(123);
     *     } else {
     *         whiteSuppressJoinSq.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteSuppressJoinSq.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteSuppressJoinSqList.add(whiteSuppressJoinSq);
     * }
     * whiteSuppressJoinSqBhv.<span style="color: #DD4747">batchUpdate</span>(whiteSuppressJoinSqList);
     * </pre>
     * @param whiteSuppressJoinSqList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteSuppressJoinSq> whiteSuppressJoinSqList) {
        return doBatchUpdate(whiteSuppressJoinSqList, null);
    }

    protected int[] doBatchUpdate(List<WhiteSuppressJoinSq> ls, UpdateOption<WhiteSuppressJoinSqCB> op) {
        assertObjectNotNull("whiteSuppressJoinSqList", ls);
        UpdateOption<WhiteSuppressJoinSqCB> rlop; if (op != null) { rlop = op; } else { rlop = createPlainUpdateOption(); }
        prepareBatchUpdateOption(ls, rlop); // required
        return delegateBatchUpdate(ls, rlop);
    }

    protected void prepareBatchUpdateOption(List<WhiteSuppressJoinSq> ls, UpdateOption<WhiteSuppressJoinSqCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(ls);
        prepareUpdateOption(op);
    }

    protected int[] doLumpModify(List<Entity> ls, UpdateOption<? extends ConditionBean> op) { return doBatchUpdate(downcast(ls), downcast(op)); }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * whiteSuppressJoinSqBhv.<span style="color: #DD4747">batchUpdate</span>(whiteSuppressJoinSqList, new SpecifyQuery<WhiteSuppressJoinSqCB>() {
     *     public void specify(WhiteSuppressJoinSqCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteSuppressJoinSqBhv.<span style="color: #DD4747">batchUpdate</span>(whiteSuppressJoinSqList, new SpecifyQuery<WhiteSuppressJoinSqCB>() {
     *     public void specify(WhiteSuppressJoinSqCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteSuppressJoinSqList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteSuppressJoinSq> whiteSuppressJoinSqList, SpecifyQuery<WhiteSuppressJoinSqCB> updateColumnSpec) {
        return doBatchUpdate(whiteSuppressJoinSqList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op)
    { return doLumpModify(ls, op); }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteSuppressJoinSqList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteSuppressJoinSq> whiteSuppressJoinSqList) {
        return doBatchDelete(whiteSuppressJoinSqList, null);
    }

    protected int[] doBatchDelete(List<WhiteSuppressJoinSq> ls, DeleteOption<WhiteSuppressJoinSqCB> op) {
        assertObjectNotNull("whiteSuppressJoinSqList", ls);
        prepareDeleteOption(op);
        return delegateBatchDelete(ls, op);
    }

    protected int[] doLumpRemove(List<Entity> ls, DeleteOption<? extends ConditionBean> op) { return doBatchDelete(downcast(ls), downcast(op)); }

    protected int[] doLumpRemoveNonstrict(List<Entity> ls, DeleteOption<? extends ConditionBean> op)
    { return doLumpRemove(ls, op); }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * whiteSuppressJoinSqBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteSuppressJoinSq, WhiteSuppressJoinSqCB&gt;() {
     *     public ConditionBean setup(whiteSuppressJoinSq entity, WhiteSuppressJoinSqCB intoCB) {
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
     * @param setupper The setup-per of query-insert. (NotNull)
     * @return The inserted count.
     */
    public int queryInsert(QueryInsertSetupper<WhiteSuppressJoinSq, WhiteSuppressJoinSqCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteSuppressJoinSq, WhiteSuppressJoinSqCB> sp, InsertOption<WhiteSuppressJoinSqCB> op) {
        assertObjectNotNull("setupper", sp); prepareInsertOption(op);
        WhiteSuppressJoinSq et = newEntity(); WhiteSuppressJoinSqCB cb = createCBForQueryInsert();
        return delegateQueryInsert(et, cb, sp.setup(et, cb), op);
    }

    protected WhiteSuppressJoinSqCB createCBForQueryInsert()
    { WhiteSuppressJoinSqCB cb = newConditionBean(); cb.xsetupForQueryInsert(); return cb; }

    protected int doRangeCreate(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> setupper, InsertOption<? extends ConditionBean> op)
    { return doQueryInsert(downcast(setupper), downcast(op)); }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteSuppressJoinSq whiteSuppressJoinSq = new WhiteSuppressJoinSq();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSq.setPK...(value);</span>
     * whiteSuppressJoinSq.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSq.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSq.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSq.setVersionNo(value);</span>
     * WhiteSuppressJoinSqCB cb = new WhiteSuppressJoinSqCB();
     * cb.query().setFoo...(value);
     * whiteSuppressJoinSqBhv.<span style="color: #DD4747">queryUpdate</span>(whiteSuppressJoinSq, cb);
     * </pre>
     * @param whiteSuppressJoinSq The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteSuppressJoinSq. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteSuppressJoinSq whiteSuppressJoinSq, WhiteSuppressJoinSqCB cb) {
        return doQueryUpdate(whiteSuppressJoinSq, cb, null);
    }

    protected int doQueryUpdate(WhiteSuppressJoinSq et, WhiteSuppressJoinSqCB cb, UpdateOption<WhiteSuppressJoinSqCB> op) {
        assertObjectNotNull("whiteSuppressJoinSq", et); assertCBStateValid(cb); prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(et, cb, op) : 0;
    }

    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op)
    { return doQueryUpdate(downcast(et), downcast(cb), downcast(op)); }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteSuppressJoinSqCB cb = new WhiteSuppressJoinSqCB();
     * cb.query().setFoo...(value);
     * whiteSuppressJoinSqBhv.<span style="color: #DD4747">queryDelete</span>(whiteSuppressJoinSq, cb);
     * </pre>
     * @param cb The condition-bean of WhiteSuppressJoinSq. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteSuppressJoinSqCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteSuppressJoinSqCB cb, DeleteOption<WhiteSuppressJoinSqCB> op) {
        assertCBStateValid(cb); prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) { return doQueryDelete(downcast(cb), downcast(op)); }

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
     * WhiteSuppressJoinSq whiteSuppressJoinSq = new WhiteSuppressJoinSq();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteSuppressJoinSq.setFoo...(value);
     * whiteSuppressJoinSq.setBar...(value);
     * InsertOption<WhiteSuppressJoinSqCB> option = new InsertOption<WhiteSuppressJoinSqCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteSuppressJoinSqBhv.<span style="color: #DD4747">varyingInsert</span>(whiteSuppressJoinSq, option);
     * ... = whiteSuppressJoinSq.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteSuppressJoinSq The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteSuppressJoinSq whiteSuppressJoinSq, InsertOption<WhiteSuppressJoinSqCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteSuppressJoinSq, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteSuppressJoinSq whiteSuppressJoinSq = new WhiteSuppressJoinSq();
     * whiteSuppressJoinSq.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteSuppressJoinSq.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteSuppressJoinSq.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteSuppressJoinSqCB&gt; option = new UpdateOption&lt;WhiteSuppressJoinSqCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteSuppressJoinSqCB&gt;() {
     *         public void specify(WhiteSuppressJoinSqCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteSuppressJoinSqBhv.<span style="color: #DD4747">varyingUpdate</span>(whiteSuppressJoinSq, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSuppressJoinSq The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteSuppressJoinSq whiteSuppressJoinSq, UpdateOption<WhiteSuppressJoinSqCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteSuppressJoinSq, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteSuppressJoinSq The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteSuppressJoinSq whiteSuppressJoinSq, InsertOption<WhiteSuppressJoinSqCB> insertOption, UpdateOption<WhiteSuppressJoinSqCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdate(whiteSuppressJoinSq, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteSuppressJoinSq The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteSuppressJoinSq whiteSuppressJoinSq, DeleteOption<WhiteSuppressJoinSqCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteSuppressJoinSq, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteSuppressJoinSqList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteSuppressJoinSq> whiteSuppressJoinSqList, InsertOption<WhiteSuppressJoinSqCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteSuppressJoinSqList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteSuppressJoinSqList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteSuppressJoinSq> whiteSuppressJoinSqList, UpdateOption<WhiteSuppressJoinSqCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteSuppressJoinSqList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteSuppressJoinSqList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteSuppressJoinSq> whiteSuppressJoinSqList, DeleteOption<WhiteSuppressJoinSqCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteSuppressJoinSqList, option);
    }

    // -----------------------------------------------------
    //                                          Query Update
    //                                          ------------
    /**
     * Insert the several entities by query with varying requests (modified-only for fixed value). <br />
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br />
     * Other specifications are same as queryInsert(entity, setupper).
     * @param setupper The setup-per of query-insert. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The inserted count.
     */
    public int varyingQueryInsert(QueryInsertSetupper<WhiteSuppressJoinSq, WhiteSuppressJoinSqCB> setupper, InsertOption<WhiteSuppressJoinSqCB> option) {
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
     * WhiteSuppressJoinSq whiteSuppressJoinSq = new WhiteSuppressJoinSq();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSq.setPK...(value);</span>
     * whiteSuppressJoinSq.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSq.setVersionNo(value);</span>
     * WhiteSuppressJoinSqCB cb = new WhiteSuppressJoinSqCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteSuppressJoinSqCB&gt; option = new UpdateOption&lt;WhiteSuppressJoinSqCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteSuppressJoinSqCB&gt;() {
     *     public void specify(WhiteSuppressJoinSqCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteSuppressJoinSqBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteSuppressJoinSq, cb, option);
     * </pre>
     * @param whiteSuppressJoinSq The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteSuppressJoinSq. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteSuppressJoinSq whiteSuppressJoinSq, WhiteSuppressJoinSqCB cb, UpdateOption<WhiteSuppressJoinSqCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteSuppressJoinSq, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteSuppressJoinSq. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteSuppressJoinSqCB cb, DeleteOption<WhiteSuppressJoinSqCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteSuppressJoinSqBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    protected Class<WhiteSuppressJoinSq> typeOfSelectedEntity() { return WhiteSuppressJoinSq.class; }
    protected WhiteSuppressJoinSq downcast(Entity et) { return helpEntityDowncastInternally(et, WhiteSuppressJoinSq.class); }
    protected WhiteSuppressJoinSqCB downcast(ConditionBean cb) { return helpConditionBeanDowncastInternally(cb, WhiteSuppressJoinSqCB.class); }
    @SuppressWarnings("unchecked")
    protected List<WhiteSuppressJoinSq> downcast(List<? extends Entity> ls) { return (List<WhiteSuppressJoinSq>)ls; }
    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteSuppressJoinSqCB> downcast(InsertOption<? extends ConditionBean> op) { return (InsertOption<WhiteSuppressJoinSqCB>)op; }
    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteSuppressJoinSqCB> downcast(UpdateOption<? extends ConditionBean> op) { return (UpdateOption<WhiteSuppressJoinSqCB>)op; }
    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteSuppressJoinSqCB> downcast(DeleteOption<? extends ConditionBean> op) { return (DeleteOption<WhiteSuppressJoinSqCB>)op; }
    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteSuppressJoinSq, WhiteSuppressJoinSqCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp)
    { return (QueryInsertSetupper<WhiteSuppressJoinSq, WhiteSuppressJoinSqCB>)sp; }
}
