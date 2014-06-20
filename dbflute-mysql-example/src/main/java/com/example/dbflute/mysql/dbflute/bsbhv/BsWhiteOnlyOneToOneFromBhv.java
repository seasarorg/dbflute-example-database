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
 * The behavior of WHITE_ONLY_ONE_TO_ONE_FROM as TABLE. <br />
 * <pre>
 * [primary key]
 *     FROM_ID
 *
 * [column]
 *     FROM_ID, FROM_NAME
 *
 * [sequence]
 *     
 *
 * [identity]
 *     FROM_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     white_only_one_to_one_to(AsOne)
 *
 * [referrer table]
 *     white_only_one_to_one_to
 *
 * [foreign property]
 *     whiteOnlyOneToOneToAsOne
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteOnlyOneToOneFromBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_only_one_to_one_from"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public DBMeta getDBMeta() { return WhiteOnlyOneToOneFromDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteOnlyOneToOneFromDbm getMyDBMeta() { return WhiteOnlyOneToOneFromDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhiteOnlyOneToOneFrom newEntity() { return new WhiteOnlyOneToOneFrom(); }

    /** {@inheritDoc} */
    public WhiteOnlyOneToOneFromCB newConditionBean() { return new WhiteOnlyOneToOneFromCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteOnlyOneToOneFrom newMyEntity() { return new WhiteOnlyOneToOneFrom(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteOnlyOneToOneFromCB newMyConditionBean() { return new WhiteOnlyOneToOneFromCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteOnlyOneToOneFromCB cb = new WhiteOnlyOneToOneFromCB();
     * cb.query().setFoo...(value);
     * int count = whiteOnlyOneToOneFromBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteOnlyOneToOneFrom. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteOnlyOneToOneFromCB cb) {
        return facadeSelectCount(cb);
    }

    protected int facadeSelectCount(WhiteOnlyOneToOneFromCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteOnlyOneToOneFromCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteOnlyOneToOneFromCB cb) { // called by selectPage(cb)
        assertCBStateValid(cb);
        return delegateSelectCountPlainly(cb);
    }

    @Override
    protected int doReadCount(ConditionBean cb) {
        return facadeSelectCount(downcast(cb));
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean. #beforejava8 <br />
     * <span style="color: #AD4747; font-size: 120%">The return might be null if no data, so you should have null check.</span> <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, use selectEntityWithDeletedCheck().</span>
     * <pre>
     * WhiteOnlyOneToOneFromCB cb = new WhiteOnlyOneToOneFromCB();
     * cb.query().setFoo...(value);
     * WhiteOnlyOneToOneFrom whiteOnlyOneToOneFrom = whiteOnlyOneToOneFromBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (whiteOnlyOneToOneFrom != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = whiteOnlyOneToOneFrom.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteOnlyOneToOneFrom. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteOnlyOneToOneFrom selectEntity(WhiteOnlyOneToOneFromCB cb) {
        return facadeSelectEntity(cb);
    }

    protected WhiteOnlyOneToOneFrom facadeSelectEntity(WhiteOnlyOneToOneFromCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteOnlyOneToOneFrom> ENTITY doSelectEntity(WhiteOnlyOneToOneFromCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, WhiteOnlyOneToOneFromCB>() {
            public List<ENTITY> callbackSelectList(WhiteOnlyOneToOneFromCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    protected <ENTITY extends WhiteOnlyOneToOneFrom> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteOnlyOneToOneFromCB cb, Class<ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return facadeSelectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * WhiteOnlyOneToOneFromCB cb = new WhiteOnlyOneToOneFromCB();
     * cb.query().setFoo...(value);
     * WhiteOnlyOneToOneFrom whiteOnlyOneToOneFrom = whiteOnlyOneToOneFromBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteOnlyOneToOneFrom.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteOnlyOneToOneFrom. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteOnlyOneToOneFrom selectEntityWithDeletedCheck(WhiteOnlyOneToOneFromCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    protected WhiteOnlyOneToOneFrom facadeSelectEntityWithDeletedCheck(WhiteOnlyOneToOneFromCB cb) {
        return doSelectEntityWithDeletedCheck(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteOnlyOneToOneFrom> ENTITY doSelectEntityWithDeletedCheck(WhiteOnlyOneToOneFromCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteOnlyOneToOneFromCB>() {
            public List<ENTITY> callbackSelectList(WhiteOnlyOneToOneFromCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return facadeSelectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param fromId : PK, ID, NotNull, BIGINT(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteOnlyOneToOneFrom selectByPKValue(Long fromId) {
        return facadeSelectByPKValue(fromId);
    }

    protected WhiteOnlyOneToOneFrom facadeSelectByPKValue(Long fromId) {
        return doSelectByPK(fromId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteOnlyOneToOneFrom> ENTITY doSelectByPK(Long fromId, Class<ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(fromId), tp);
    }

    protected <ENTITY extends WhiteOnlyOneToOneFrom> OptionalEntity<ENTITY> doSelectOptionalByPK(Long fromId, Class<ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(fromId, tp), fromId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param fromId : PK, ID, NotNull, BIGINT(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteOnlyOneToOneFrom selectByPKValueWithDeletedCheck(Long fromId) {
        return doSelectByPKWithDeletedCheck(fromId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteOnlyOneToOneFrom> ENTITY doSelectByPKWithDeletedCheck(Long fromId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(fromId), tp);
    }

    protected WhiteOnlyOneToOneFromCB xprepareCBAsPK(Long fromId) {
        assertObjectNotNull("fromId", fromId);
        return newConditionBean().acceptPK(fromId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteOnlyOneToOneFromCB cb = new WhiteOnlyOneToOneFromCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteOnlyOneToOneFrom&gt; whiteOnlyOneToOneFromList = whiteOnlyOneToOneFromBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteOnlyOneToOneFrom whiteOnlyOneToOneFrom : whiteOnlyOneToOneFromList) {
     *     ... = whiteOnlyOneToOneFrom.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteOnlyOneToOneFrom. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteOnlyOneToOneFrom> selectList(WhiteOnlyOneToOneFromCB cb) {
        return facadeSelectList(cb);
    }

    protected ListResultBean<WhiteOnlyOneToOneFrom> facadeSelectList(WhiteOnlyOneToOneFromCB cb) {
        return doSelectList(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteOnlyOneToOneFrom> ListResultBean<ENTITY> doSelectList(WhiteOnlyOneToOneFromCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, WhiteOnlyOneToOneFromCB>() {
            public List<ENTITY> callbackSelectList(WhiteOnlyOneToOneFromCB lcb, Class<ENTITY> ltp) { return delegateSelectList(lcb, ltp); } });
    }

    @Override
    protected ListResultBean<? extends Entity> doReadList(ConditionBean cb) {
        return facadeSelectList(downcast(cb));
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * WhiteOnlyOneToOneFromCB cb = new WhiteOnlyOneToOneFromCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteOnlyOneToOneFrom&gt; page = whiteOnlyOneToOneFromBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteOnlyOneToOneFrom whiteOnlyOneToOneFrom : page) {
     *     ... = whiteOnlyOneToOneFrom.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteOnlyOneToOneFrom. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteOnlyOneToOneFrom> selectPage(WhiteOnlyOneToOneFromCB cb) {
        return facadeSelectPage(cb);
    }

    protected PagingResultBean<WhiteOnlyOneToOneFrom> facadeSelectPage(WhiteOnlyOneToOneFromCB cb) {
        return doSelectPage(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteOnlyOneToOneFrom> PagingResultBean<ENTITY> doSelectPage(WhiteOnlyOneToOneFromCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, WhiteOnlyOneToOneFromCB>() {
            public int callbackSelectCount(WhiteOnlyOneToOneFromCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteOnlyOneToOneFromCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    @Override
    protected PagingResultBean<? extends Entity> doReadPage(ConditionBean cb) {
        return facadeSelectPage(downcast(cb));
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteOnlyOneToOneFromCB cb = new WhiteOnlyOneToOneFromCB();
     * cb.query().setFoo...(value);
     * whiteOnlyOneToOneFromBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteOnlyOneToOneFrom&gt;() {
     *     public void handle(WhiteOnlyOneToOneFrom entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteOnlyOneToOneFrom. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteOnlyOneToOneFrom. (NotNull)
     */
    public void selectCursor(WhiteOnlyOneToOneFromCB cb, EntityRowHandler<WhiteOnlyOneToOneFrom> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    protected void facadeSelectCursor(WhiteOnlyOneToOneFromCB cb, EntityRowHandler<WhiteOnlyOneToOneFrom> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteOnlyOneToOneFrom> void doSelectCursor(WhiteOnlyOneToOneFromCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, WhiteOnlyOneToOneFromCB>() {
            public void callbackSelectCursor(WhiteOnlyOneToOneFromCB lcb, EntityRowHandler<ENTITY> lhandler, Class<ENTITY> ltp) { delegateSelectCursor(lcb, lhandler, ltp); }
            public List<ENTITY> callbackSelectList(WhiteOnlyOneToOneFromCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteOnlyOneToOneFromBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteOnlyOneToOneFromCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhiteOnlyOneToOneFromCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    protected <RESULT> HpSLSFunction<WhiteOnlyOneToOneFromCB, RESULT> facadeScalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newConditionBean());
    }

    protected <RESULT, CB extends WhiteOnlyOneToOneFromCB> HpSLSFunction<CB, RESULT> doScalarSelect(final Class<RESULT> tp, final CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        HpSLSExecutor<CB, RESULT> executor = createHpSLSExecutor(); // variable to resolve generic
        return createSLSFunction(cb, tp, executor);
    }

    protected <RESULT> HpSLSFunction<? extends ConditionBean, RESULT> doReadScalar(Class<RESULT> tp) {
        return facadeScalarSelect(tp);
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
     * @param whiteOnlyOneToOneFromList The entity list of whiteOnlyOneToOneFrom. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhiteOnlyOneToOneFrom> whiteOnlyOneToOneFromList, ReferrerLoaderHandler<LoaderOfWhiteOnlyOneToOneFrom> handler) {
        xassLRArg(whiteOnlyOneToOneFromList, handler);
        handler.handle(new LoaderOfWhiteOnlyOneToOneFrom().ready(whiteOnlyOneToOneFromList, _behaviorSelector));
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
     * @param whiteOnlyOneToOneFrom The entity of whiteOnlyOneToOneFrom. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhiteOnlyOneToOneFrom whiteOnlyOneToOneFrom, ReferrerLoaderHandler<LoaderOfWhiteOnlyOneToOneFrom> handler) {
        xassLRArg(whiteOnlyOneToOneFrom, handler);
        handler.handle(new LoaderOfWhiteOnlyOneToOneFrom().ready(xnewLRAryLs(whiteOnlyOneToOneFrom), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of referrer-as-one table 'WhiteOnlyOneToOneTo'.
     * @param whiteOnlyOneToOneFromList The list of whiteOnlyOneToOneFrom. (NotNull, EmptyAllowed)
     * @return The list of referrer-as-one table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteOnlyOneToOneTo> pulloutWhiteOnlyOneToOneToAsOne(List<WhiteOnlyOneToOneFrom> whiteOnlyOneToOneFromList) {
        return helpPulloutInternally(whiteOnlyOneToOneFromList, new InternalPulloutCallback<WhiteOnlyOneToOneFrom, WhiteOnlyOneToOneTo>() {
            public WhiteOnlyOneToOneTo getFr(WhiteOnlyOneToOneFrom et)
            { return et.getWhiteOnlyOneToOneToAsOne(); }
            public boolean hasRf() { return true; }
            public void setRfLs(WhiteOnlyOneToOneTo et, List<WhiteOnlyOneToOneFrom> ls)
            { if (!ls.isEmpty()) { et.setWhiteOnlyOneToOneFrom(ls.get(0)); } }
        });
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key fromId.
     * @param whiteOnlyOneToOneFromList The list of whiteOnlyOneToOneFrom. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractFromIdList(List<WhiteOnlyOneToOneFrom> whiteOnlyOneToOneFromList) {
        return helpExtractListInternally(whiteOnlyOneToOneFromList, new InternalExtractCallback<WhiteOnlyOneToOneFrom, Long>() {
            public Long getCV(WhiteOnlyOneToOneFrom et) { return et.getFromId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteOnlyOneToOneFrom whiteOnlyOneToOneFrom = new WhiteOnlyOneToOneFrom();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteOnlyOneToOneFrom.setFoo...(value);
     * whiteOnlyOneToOneFrom.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteOnlyOneToOneFrom.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteOnlyOneToOneFrom.set...;</span>
     * whiteOnlyOneToOneFromBhv.<span style="color: #DD4747">insert</span>(whiteOnlyOneToOneFrom);
     * ... = whiteOnlyOneToOneFrom.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteOnlyOneToOneFrom The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteOnlyOneToOneFrom whiteOnlyOneToOneFrom) {
        doInsert(whiteOnlyOneToOneFrom, null);
    }

    protected void doInsert(WhiteOnlyOneToOneFrom et, InsertOption<WhiteOnlyOneToOneFromCB> op) {
        assertObjectNotNull("whiteOnlyOneToOneFrom", et);
        prepareInsertOption(op);
        delegateInsert(et, op);
    }

    protected void prepareInsertOption(InsertOption<WhiteOnlyOneToOneFromCB> op) {
        if (op == null) { return; }
        assertInsertOptionStatus(op);
        if (op.hasSpecifiedInsertColumn()) {
            op.resolveInsertColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    @Override
    protected void doCreate(Entity et, InsertOption<? extends ConditionBean> op) {
        doInsert(downcast(et), downcast(op));
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteOnlyOneToOneFrom whiteOnlyOneToOneFrom = new WhiteOnlyOneToOneFrom();
     * whiteOnlyOneToOneFrom.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteOnlyOneToOneFrom.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteOnlyOneToOneFrom.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteOnlyOneToOneFrom.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteOnlyOneToOneFrom.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteOnlyOneToOneFromBhv.<span style="color: #DD4747">update</span>(whiteOnlyOneToOneFrom);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteOnlyOneToOneFrom The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhiteOnlyOneToOneFrom whiteOnlyOneToOneFrom) {
        doUpdate(whiteOnlyOneToOneFrom, null);
    }

    protected void doUpdate(WhiteOnlyOneToOneFrom et, final UpdateOption<WhiteOnlyOneToOneFromCB> op) {
        assertObjectNotNull("whiteOnlyOneToOneFrom", et);
        prepareUpdateOption(op);
        helpUpdateInternally(et, new InternalUpdateCallback<WhiteOnlyOneToOneFrom>() {
            public int callbackDelegateUpdate(WhiteOnlyOneToOneFrom let) { return delegateUpdate(let, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhiteOnlyOneToOneFromCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) { op.resolveSelfSpecification(createCBForVaryingUpdate()); }
        if (op.hasSpecifiedUpdateColumn()) { op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate()); }
    }

    protected WhiteOnlyOneToOneFromCB createCBForVaryingUpdate()
    { WhiteOnlyOneToOneFromCB cb = newConditionBean(); cb.xsetupForVaryingUpdate(); return cb; }

    protected WhiteOnlyOneToOneFromCB createCBForSpecifiedUpdate()
    { WhiteOnlyOneToOneFromCB cb = newConditionBean(); cb.xsetupForSpecifiedUpdate(); return cb; }

    @Override
    protected void doModify(Entity et, UpdateOption<? extends ConditionBean> op) {
        doUpdate(downcast(et), downcast(op));
    }

    @Override
    protected void doModifyNonstrict(Entity et, UpdateOption<? extends ConditionBean> op) {
        doModify(et, op);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param whiteOnlyOneToOneFrom The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteOnlyOneToOneFrom whiteOnlyOneToOneFrom) {
        doInsertOrUpdate(whiteOnlyOneToOneFrom, null, null);
    }

    protected void doInsertOrUpdate(WhiteOnlyOneToOneFrom et, final InsertOption<WhiteOnlyOneToOneFromCB> iop, final UpdateOption<WhiteOnlyOneToOneFromCB> uop) {
        assertObjectNotNull("whiteOnlyOneToOneFrom", et);
        helpInsertOrUpdateInternally(et, new InternalInsertOrUpdateCallback<WhiteOnlyOneToOneFrom, WhiteOnlyOneToOneFromCB>() {
            public void callbackInsert(WhiteOnlyOneToOneFrom let) { doInsert(let, iop); }
            public void callbackUpdate(WhiteOnlyOneToOneFrom let) { doUpdate(let, uop); }
            public WhiteOnlyOneToOneFromCB callbackNewMyConditionBean() { return newConditionBean(); }
            public int callbackSelectCount(WhiteOnlyOneToOneFromCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        doInsertOrUpdate(downcast(et), downcast(iop), downcast(uop));
    }

    @Override
    protected void doCreateOrModifyNonstrict(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        doCreateOrModify(et, iop, uop);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteOnlyOneToOneFrom whiteOnlyOneToOneFrom = new WhiteOnlyOneToOneFrom();
     * whiteOnlyOneToOneFrom.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteOnlyOneToOneFrom.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteOnlyOneToOneFromBhv.<span style="color: #DD4747">delete</span>(whiteOnlyOneToOneFrom);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteOnlyOneToOneFrom The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteOnlyOneToOneFrom whiteOnlyOneToOneFrom) {
        doDelete(whiteOnlyOneToOneFrom, null);
    }

    protected void doDelete(WhiteOnlyOneToOneFrom et, final DeleteOption<WhiteOnlyOneToOneFromCB> op) {
        assertObjectNotNull("whiteOnlyOneToOneFrom", et);
        prepareDeleteOption(op);
        helpDeleteInternally(et, new InternalDeleteCallback<WhiteOnlyOneToOneFrom>() {
            public int callbackDelegateDelete(WhiteOnlyOneToOneFrom let) { return delegateDelete(let, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhiteOnlyOneToOneFromCB> op)
    { if (op != null) { assertDeleteOptionStatus(op); } }

    @Override
    protected void doRemove(Entity et, DeleteOption<? extends ConditionBean> op) {
        doDelete(downcast(et), downcast(op));
    }

    @Override
    protected void doRemoveNonstrict(Entity et, DeleteOption<? extends ConditionBean> op) {
        doRemove(et, op);
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
     *     WhiteOnlyOneToOneFrom whiteOnlyOneToOneFrom = new WhiteOnlyOneToOneFrom();
     *     whiteOnlyOneToOneFrom.setFooName("foo");
     *     if (...) {
     *         whiteOnlyOneToOneFrom.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteOnlyOneToOneFromList.add(whiteOnlyOneToOneFrom);
     * }
     * whiteOnlyOneToOneFromBhv.<span style="color: #DD4747">batchInsert</span>(whiteOnlyOneToOneFromList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteOnlyOneToOneFromList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteOnlyOneToOneFrom> whiteOnlyOneToOneFromList) {
        return doBatchInsert(whiteOnlyOneToOneFromList, null);
    }

    protected int[] doBatchInsert(List<WhiteOnlyOneToOneFrom> ls, InsertOption<WhiteOnlyOneToOneFromCB> op) {
        assertObjectNotNull("whiteOnlyOneToOneFromList", ls);
        InsertOption<WhiteOnlyOneToOneFromCB> rlop; if (op != null) { rlop = op; } else { rlop = createPlainInsertOption(); }
        prepareBatchInsertOption(ls, rlop); // required
        return delegateBatchInsert(ls, rlop);
    }

    protected void prepareBatchInsertOption(List<WhiteOnlyOneToOneFrom> ls, InsertOption<WhiteOnlyOneToOneFromCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(ls);
        prepareInsertOption(op);
    }

    @Override
    protected int[] doLumpCreate(List<Entity> ls, InsertOption<? extends ConditionBean> op) {
        return doBatchInsert(downcast(ls), downcast(op));
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhiteOnlyOneToOneFrom whiteOnlyOneToOneFrom = new WhiteOnlyOneToOneFrom();
     *     whiteOnlyOneToOneFrom.setFooName("foo");
     *     if (...) {
     *         whiteOnlyOneToOneFrom.setFooPrice(123);
     *     } else {
     *         whiteOnlyOneToOneFrom.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteOnlyOneToOneFrom.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteOnlyOneToOneFromList.add(whiteOnlyOneToOneFrom);
     * }
     * whiteOnlyOneToOneFromBhv.<span style="color: #DD4747">batchUpdate</span>(whiteOnlyOneToOneFromList);
     * </pre>
     * @param whiteOnlyOneToOneFromList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteOnlyOneToOneFrom> whiteOnlyOneToOneFromList) {
        return doBatchUpdate(whiteOnlyOneToOneFromList, null);
    }

    protected int[] doBatchUpdate(List<WhiteOnlyOneToOneFrom> ls, UpdateOption<WhiteOnlyOneToOneFromCB> op) {
        assertObjectNotNull("whiteOnlyOneToOneFromList", ls);
        UpdateOption<WhiteOnlyOneToOneFromCB> rlop; if (op != null) { rlop = op; } else { rlop = createPlainUpdateOption(); }
        prepareBatchUpdateOption(ls, rlop); // required
        return delegateBatchUpdate(ls, rlop);
    }

    protected void prepareBatchUpdateOption(List<WhiteOnlyOneToOneFrom> ls, UpdateOption<WhiteOnlyOneToOneFromCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(ls);
        prepareUpdateOption(op);
    }

    @Override
    protected int[] doLumpModify(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doBatchUpdate(downcast(ls), downcast(op));
    }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * whiteOnlyOneToOneFromBhv.<span style="color: #DD4747">batchUpdate</span>(whiteOnlyOneToOneFromList, new SpecifyQuery<WhiteOnlyOneToOneFromCB>() {
     *     public void specify(WhiteOnlyOneToOneFromCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteOnlyOneToOneFromBhv.<span style="color: #DD4747">batchUpdate</span>(whiteOnlyOneToOneFromList, new SpecifyQuery<WhiteOnlyOneToOneFromCB>() {
     *     public void specify(WhiteOnlyOneToOneFromCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteOnlyOneToOneFromList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteOnlyOneToOneFrom> whiteOnlyOneToOneFromList, SpecifyQuery<WhiteOnlyOneToOneFromCB> updateColumnSpec) {
        return doBatchUpdate(whiteOnlyOneToOneFromList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteOnlyOneToOneFromList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteOnlyOneToOneFrom> whiteOnlyOneToOneFromList) {
        return doBatchDelete(whiteOnlyOneToOneFromList, null);
    }

    protected int[] doBatchDelete(List<WhiteOnlyOneToOneFrom> ls, DeleteOption<WhiteOnlyOneToOneFromCB> op) {
        assertObjectNotNull("whiteOnlyOneToOneFromList", ls);
        prepareDeleteOption(op);
        return delegateBatchDelete(ls, op);
    }

    @Override
    protected int[] doLumpRemove(List<Entity> ls, DeleteOption<? extends ConditionBean> op) {
        return doBatchDelete(downcast(ls), downcast(op));
    }

    @Override
    protected int[] doLumpRemoveNonstrict(List<Entity> ls, DeleteOption<? extends ConditionBean> op) {
        return doLumpRemove(ls, op);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * whiteOnlyOneToOneFromBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteOnlyOneToOneFrom, WhiteOnlyOneToOneFromCB&gt;() {
     *     public ConditionBean setup(whiteOnlyOneToOneFrom entity, WhiteOnlyOneToOneFromCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteOnlyOneToOneFrom, WhiteOnlyOneToOneFromCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteOnlyOneToOneFrom, WhiteOnlyOneToOneFromCB> sp, InsertOption<WhiteOnlyOneToOneFromCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        WhiteOnlyOneToOneFrom et = newEntity();
        WhiteOnlyOneToOneFromCB cb = createCBForQueryInsert();
        return delegateQueryInsert(et, cb, sp.setup(et, cb), op);
    }

    protected WhiteOnlyOneToOneFromCB createCBForQueryInsert()
    { WhiteOnlyOneToOneFromCB cb = newConditionBean(); cb.xsetupForQueryInsert(); return cb; }

    @Override
    protected int doRangeCreate(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> setupper, InsertOption<? extends ConditionBean> op) {
        return doQueryInsert(downcast(setupper), downcast(op));
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteOnlyOneToOneFrom whiteOnlyOneToOneFrom = new WhiteOnlyOneToOneFrom();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteOnlyOneToOneFrom.setPK...(value);</span>
     * whiteOnlyOneToOneFrom.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteOnlyOneToOneFrom.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteOnlyOneToOneFrom.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteOnlyOneToOneFrom.setVersionNo(value);</span>
     * WhiteOnlyOneToOneFromCB cb = new WhiteOnlyOneToOneFromCB();
     * cb.query().setFoo...(value);
     * whiteOnlyOneToOneFromBhv.<span style="color: #DD4747">queryUpdate</span>(whiteOnlyOneToOneFrom, cb);
     * </pre>
     * @param whiteOnlyOneToOneFrom The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteOnlyOneToOneFrom. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteOnlyOneToOneFrom whiteOnlyOneToOneFrom, WhiteOnlyOneToOneFromCB cb) {
        return doQueryUpdate(whiteOnlyOneToOneFrom, cb, null);
    }

    protected int doQueryUpdate(WhiteOnlyOneToOneFrom et, WhiteOnlyOneToOneFromCB cb, UpdateOption<WhiteOnlyOneToOneFromCB> op) {
        assertObjectNotNull("whiteOnlyOneToOneFrom", et); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(et, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        return doQueryUpdate(downcast(et), downcast(cb), downcast(op));
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteOnlyOneToOneFromCB cb = new WhiteOnlyOneToOneFromCB();
     * cb.query().setFoo...(value);
     * whiteOnlyOneToOneFromBhv.<span style="color: #DD4747">queryDelete</span>(whiteOnlyOneToOneFrom, cb);
     * </pre>
     * @param cb The condition-bean of WhiteOnlyOneToOneFrom. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteOnlyOneToOneFromCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteOnlyOneToOneFromCB cb, DeleteOption<WhiteOnlyOneToOneFromCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        return doQueryDelete(downcast(cb), downcast(op));
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
     * WhiteOnlyOneToOneFrom whiteOnlyOneToOneFrom = new WhiteOnlyOneToOneFrom();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteOnlyOneToOneFrom.setFoo...(value);
     * whiteOnlyOneToOneFrom.setBar...(value);
     * InsertOption<WhiteOnlyOneToOneFromCB> option = new InsertOption<WhiteOnlyOneToOneFromCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteOnlyOneToOneFromBhv.<span style="color: #DD4747">varyingInsert</span>(whiteOnlyOneToOneFrom, option);
     * ... = whiteOnlyOneToOneFrom.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteOnlyOneToOneFrom The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteOnlyOneToOneFrom whiteOnlyOneToOneFrom, InsertOption<WhiteOnlyOneToOneFromCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteOnlyOneToOneFrom, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteOnlyOneToOneFrom whiteOnlyOneToOneFrom = new WhiteOnlyOneToOneFrom();
     * whiteOnlyOneToOneFrom.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteOnlyOneToOneFrom.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteOnlyOneToOneFrom.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteOnlyOneToOneFromCB&gt; option = new UpdateOption&lt;WhiteOnlyOneToOneFromCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteOnlyOneToOneFromCB&gt;() {
     *         public void specify(WhiteOnlyOneToOneFromCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteOnlyOneToOneFromBhv.<span style="color: #DD4747">varyingUpdate</span>(whiteOnlyOneToOneFrom, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteOnlyOneToOneFrom The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteOnlyOneToOneFrom whiteOnlyOneToOneFrom, UpdateOption<WhiteOnlyOneToOneFromCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteOnlyOneToOneFrom, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteOnlyOneToOneFrom The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteOnlyOneToOneFrom whiteOnlyOneToOneFrom, InsertOption<WhiteOnlyOneToOneFromCB> insertOption, UpdateOption<WhiteOnlyOneToOneFromCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdate(whiteOnlyOneToOneFrom, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteOnlyOneToOneFrom The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteOnlyOneToOneFrom whiteOnlyOneToOneFrom, DeleteOption<WhiteOnlyOneToOneFromCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteOnlyOneToOneFrom, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteOnlyOneToOneFromList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteOnlyOneToOneFrom> whiteOnlyOneToOneFromList, InsertOption<WhiteOnlyOneToOneFromCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteOnlyOneToOneFromList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteOnlyOneToOneFromList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteOnlyOneToOneFrom> whiteOnlyOneToOneFromList, UpdateOption<WhiteOnlyOneToOneFromCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteOnlyOneToOneFromList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteOnlyOneToOneFromList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteOnlyOneToOneFrom> whiteOnlyOneToOneFromList, DeleteOption<WhiteOnlyOneToOneFromCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteOnlyOneToOneFromList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteOnlyOneToOneFrom, WhiteOnlyOneToOneFromCB> setupper, InsertOption<WhiteOnlyOneToOneFromCB> option) {
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
     * WhiteOnlyOneToOneFrom whiteOnlyOneToOneFrom = new WhiteOnlyOneToOneFrom();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteOnlyOneToOneFrom.setPK...(value);</span>
     * whiteOnlyOneToOneFrom.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteOnlyOneToOneFrom.setVersionNo(value);</span>
     * WhiteOnlyOneToOneFromCB cb = new WhiteOnlyOneToOneFromCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteOnlyOneToOneFromCB&gt; option = new UpdateOption&lt;WhiteOnlyOneToOneFromCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteOnlyOneToOneFromCB&gt;() {
     *     public void specify(WhiteOnlyOneToOneFromCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteOnlyOneToOneFromBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteOnlyOneToOneFrom, cb, option);
     * </pre>
     * @param whiteOnlyOneToOneFrom The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteOnlyOneToOneFrom. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteOnlyOneToOneFrom whiteOnlyOneToOneFrom, WhiteOnlyOneToOneFromCB cb, UpdateOption<WhiteOnlyOneToOneFromCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteOnlyOneToOneFrom, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteOnlyOneToOneFrom. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteOnlyOneToOneFromCB cb, DeleteOption<WhiteOnlyOneToOneFromCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteOnlyOneToOneFromBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhiteOnlyOneToOneFromCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhiteOnlyOneToOneFromCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhiteOnlyOneToOneFrom> void delegateSelectCursor(WhiteOnlyOneToOneFromCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends WhiteOnlyOneToOneFrom> List<ENTITY> delegateSelectList(WhiteOnlyOneToOneFromCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhiteOnlyOneToOneFrom et, InsertOption<WhiteOnlyOneToOneFromCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(WhiteOnlyOneToOneFrom et, UpdateOption<WhiteOnlyOneToOneFromCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(WhiteOnlyOneToOneFrom et, UpdateOption<WhiteOnlyOneToOneFromCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(WhiteOnlyOneToOneFrom et, DeleteOption<WhiteOnlyOneToOneFromCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(WhiteOnlyOneToOneFrom et, DeleteOption<WhiteOnlyOneToOneFromCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<WhiteOnlyOneToOneFrom> ls, InsertOption<WhiteOnlyOneToOneFromCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhiteOnlyOneToOneFrom> ls, UpdateOption<WhiteOnlyOneToOneFromCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhiteOnlyOneToOneFrom> ls, UpdateOption<WhiteOnlyOneToOneFromCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhiteOnlyOneToOneFrom> ls, DeleteOption<WhiteOnlyOneToOneFromCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhiteOnlyOneToOneFrom> ls, DeleteOption<WhiteOnlyOneToOneFromCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhiteOnlyOneToOneFrom et, WhiteOnlyOneToOneFromCB inCB, ConditionBean resCB, InsertOption<WhiteOnlyOneToOneFromCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhiteOnlyOneToOneFrom et, WhiteOnlyOneToOneFromCB cb, UpdateOption<WhiteOnlyOneToOneFromCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(WhiteOnlyOneToOneFromCB cb, DeleteOption<WhiteOnlyOneToOneFromCB> op)
    { if (!processBeforeQueryDelete(cb, op)) { return 0; } return invoke(createQueryDeleteCBCommand(cb, op));  }

    // ===================================================================================
    //                                                                Optimistic Lock Info
    //                                                                ====================
    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean hasVersionNoValue(Entity et) {
        return false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean hasUpdateDateValue(Entity et) {
        return false;
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    protected Class<WhiteOnlyOneToOneFrom> typeOfSelectedEntity()
    { return WhiteOnlyOneToOneFrom.class; }

    protected WhiteOnlyOneToOneFrom downcast(Entity et)
    { return helpEntityDowncastInternally(et, WhiteOnlyOneToOneFrom.class); }

    protected WhiteOnlyOneToOneFromCB downcast(ConditionBean cb)
    { return helpConditionBeanDowncastInternally(cb, WhiteOnlyOneToOneFromCB.class); }

    @SuppressWarnings("unchecked")
    protected List<WhiteOnlyOneToOneFrom> downcast(List<? extends Entity> ls)
    { return (List<WhiteOnlyOneToOneFrom>)ls; }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteOnlyOneToOneFromCB> downcast(InsertOption<? extends ConditionBean> op)
    { return (InsertOption<WhiteOnlyOneToOneFromCB>)op; }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteOnlyOneToOneFromCB> downcast(UpdateOption<? extends ConditionBean> op)
    { return (UpdateOption<WhiteOnlyOneToOneFromCB>)op; }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteOnlyOneToOneFromCB> downcast(DeleteOption<? extends ConditionBean> op)
    { return (DeleteOption<WhiteOnlyOneToOneFromCB>)op; }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteOnlyOneToOneFrom, WhiteOnlyOneToOneFromCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp)
    { return (QueryInsertSetupper<WhiteOnlyOneToOneFrom, WhiteOnlyOneToOneFromCB>)sp; }
}
