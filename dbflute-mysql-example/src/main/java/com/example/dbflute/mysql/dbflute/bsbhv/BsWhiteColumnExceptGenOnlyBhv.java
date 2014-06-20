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
 * The behavior of WHITE_COLUMN_EXCEPT_GEN_ONLY as TABLE. <br />
 * <pre>
 * [primary key]
 *     GEN_ONLY_ID
 *
 * [column]
 *     GEN_ONLY_ID, GEN_ONLY_NAME
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
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteColumnExceptGenOnlyBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_column_except_gen_only"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public DBMeta getDBMeta() { return WhiteColumnExceptGenOnlyDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteColumnExceptGenOnlyDbm getMyDBMeta() { return WhiteColumnExceptGenOnlyDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhiteColumnExceptGenOnly newEntity() { return new WhiteColumnExceptGenOnly(); }

    /** {@inheritDoc} */
    public WhiteColumnExceptGenOnlyCB newConditionBean() { return new WhiteColumnExceptGenOnlyCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteColumnExceptGenOnly newMyEntity() { return new WhiteColumnExceptGenOnly(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteColumnExceptGenOnlyCB newMyConditionBean() { return new WhiteColumnExceptGenOnlyCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteColumnExceptGenOnlyCB cb = new WhiteColumnExceptGenOnlyCB();
     * cb.query().setFoo...(value);
     * int count = whiteColumnExceptGenOnlyBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteColumnExceptGenOnly. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteColumnExceptGenOnlyCB cb) {
        return facadeSelectCount(cb);
    }

    protected int facadeSelectCount(WhiteColumnExceptGenOnlyCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteColumnExceptGenOnlyCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteColumnExceptGenOnlyCB cb) { // called by selectPage(cb)
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
     * WhiteColumnExceptGenOnlyCB cb = new WhiteColumnExceptGenOnlyCB();
     * cb.query().setFoo...(value);
     * WhiteColumnExceptGenOnly whiteColumnExceptGenOnly = whiteColumnExceptGenOnlyBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (whiteColumnExceptGenOnly != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = whiteColumnExceptGenOnly.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteColumnExceptGenOnly. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteColumnExceptGenOnly selectEntity(WhiteColumnExceptGenOnlyCB cb) {
        return facadeSelectEntity(cb);
    }

    protected WhiteColumnExceptGenOnly facadeSelectEntity(WhiteColumnExceptGenOnlyCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteColumnExceptGenOnly> ENTITY doSelectEntity(WhiteColumnExceptGenOnlyCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, WhiteColumnExceptGenOnlyCB>() {
            public List<ENTITY> callbackSelectList(WhiteColumnExceptGenOnlyCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    protected <ENTITY extends WhiteColumnExceptGenOnly> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteColumnExceptGenOnlyCB cb, Class<ENTITY> tp) {
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
     * WhiteColumnExceptGenOnlyCB cb = new WhiteColumnExceptGenOnlyCB();
     * cb.query().setFoo...(value);
     * WhiteColumnExceptGenOnly whiteColumnExceptGenOnly = whiteColumnExceptGenOnlyBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteColumnExceptGenOnly.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteColumnExceptGenOnly. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteColumnExceptGenOnly selectEntityWithDeletedCheck(WhiteColumnExceptGenOnlyCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    protected WhiteColumnExceptGenOnly facadeSelectEntityWithDeletedCheck(WhiteColumnExceptGenOnlyCB cb) {
        return doSelectEntityWithDeletedCheck(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteColumnExceptGenOnly> ENTITY doSelectEntityWithDeletedCheck(WhiteColumnExceptGenOnlyCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteColumnExceptGenOnlyCB>() {
            public List<ENTITY> callbackSelectList(WhiteColumnExceptGenOnlyCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return facadeSelectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param genOnlyId : PK, NotNull, DECIMAL(16). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteColumnExceptGenOnly selectByPKValue(Long genOnlyId) {
        return facadeSelectByPKValue(genOnlyId);
    }

    protected WhiteColumnExceptGenOnly facadeSelectByPKValue(Long genOnlyId) {
        return doSelectByPK(genOnlyId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteColumnExceptGenOnly> ENTITY doSelectByPK(Long genOnlyId, Class<ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(genOnlyId), tp);
    }

    protected <ENTITY extends WhiteColumnExceptGenOnly> OptionalEntity<ENTITY> doSelectOptionalByPK(Long genOnlyId, Class<ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(genOnlyId, tp), genOnlyId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param genOnlyId : PK, NotNull, DECIMAL(16). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteColumnExceptGenOnly selectByPKValueWithDeletedCheck(Long genOnlyId) {
        return doSelectByPKWithDeletedCheck(genOnlyId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteColumnExceptGenOnly> ENTITY doSelectByPKWithDeletedCheck(Long genOnlyId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(genOnlyId), tp);
    }

    protected WhiteColumnExceptGenOnlyCB xprepareCBAsPK(Long genOnlyId) {
        assertObjectNotNull("genOnlyId", genOnlyId);
        return newConditionBean().acceptPK(genOnlyId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteColumnExceptGenOnlyCB cb = new WhiteColumnExceptGenOnlyCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteColumnExceptGenOnly&gt; whiteColumnExceptGenOnlyList = whiteColumnExceptGenOnlyBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteColumnExceptGenOnly whiteColumnExceptGenOnly : whiteColumnExceptGenOnlyList) {
     *     ... = whiteColumnExceptGenOnly.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteColumnExceptGenOnly. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteColumnExceptGenOnly> selectList(WhiteColumnExceptGenOnlyCB cb) {
        return facadeSelectList(cb);
    }

    protected ListResultBean<WhiteColumnExceptGenOnly> facadeSelectList(WhiteColumnExceptGenOnlyCB cb) {
        return doSelectList(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteColumnExceptGenOnly> ListResultBean<ENTITY> doSelectList(WhiteColumnExceptGenOnlyCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, WhiteColumnExceptGenOnlyCB>() {
            public List<ENTITY> callbackSelectList(WhiteColumnExceptGenOnlyCB lcb, Class<ENTITY> ltp) { return delegateSelectList(lcb, ltp); } });
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
     * WhiteColumnExceptGenOnlyCB cb = new WhiteColumnExceptGenOnlyCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteColumnExceptGenOnly&gt; page = whiteColumnExceptGenOnlyBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteColumnExceptGenOnly whiteColumnExceptGenOnly : page) {
     *     ... = whiteColumnExceptGenOnly.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteColumnExceptGenOnly. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteColumnExceptGenOnly> selectPage(WhiteColumnExceptGenOnlyCB cb) {
        return facadeSelectPage(cb);
    }

    protected PagingResultBean<WhiteColumnExceptGenOnly> facadeSelectPage(WhiteColumnExceptGenOnlyCB cb) {
        return doSelectPage(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteColumnExceptGenOnly> PagingResultBean<ENTITY> doSelectPage(WhiteColumnExceptGenOnlyCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, WhiteColumnExceptGenOnlyCB>() {
            public int callbackSelectCount(WhiteColumnExceptGenOnlyCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteColumnExceptGenOnlyCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * WhiteColumnExceptGenOnlyCB cb = new WhiteColumnExceptGenOnlyCB();
     * cb.query().setFoo...(value);
     * whiteColumnExceptGenOnlyBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteColumnExceptGenOnly&gt;() {
     *     public void handle(WhiteColumnExceptGenOnly entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteColumnExceptGenOnly. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteColumnExceptGenOnly. (NotNull)
     */
    public void selectCursor(WhiteColumnExceptGenOnlyCB cb, EntityRowHandler<WhiteColumnExceptGenOnly> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    protected void facadeSelectCursor(WhiteColumnExceptGenOnlyCB cb, EntityRowHandler<WhiteColumnExceptGenOnly> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteColumnExceptGenOnly> void doSelectCursor(WhiteColumnExceptGenOnlyCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, WhiteColumnExceptGenOnlyCB>() {
            public void callbackSelectCursor(WhiteColumnExceptGenOnlyCB lcb, EntityRowHandler<ENTITY> lhandler, Class<ENTITY> ltp) { delegateSelectCursor(lcb, lhandler, ltp); }
            public List<ENTITY> callbackSelectList(WhiteColumnExceptGenOnlyCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteColumnExceptGenOnlyBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteColumnExceptGenOnlyCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhiteColumnExceptGenOnlyCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    protected <RESULT> HpSLSFunction<WhiteColumnExceptGenOnlyCB, RESULT> facadeScalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newConditionBean());
    }

    protected <RESULT, CB extends WhiteColumnExceptGenOnlyCB> HpSLSFunction<CB, RESULT> doScalarSelect(final Class<RESULT> tp, final CB cb) {
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
     * @param whiteColumnExceptGenOnlyList The entity list of whiteColumnExceptGenOnly. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhiteColumnExceptGenOnly> whiteColumnExceptGenOnlyList, ReferrerLoaderHandler<LoaderOfWhiteColumnExceptGenOnly> handler) {
        xassLRArg(whiteColumnExceptGenOnlyList, handler);
        handler.handle(new LoaderOfWhiteColumnExceptGenOnly().ready(whiteColumnExceptGenOnlyList, _behaviorSelector));
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
     * @param whiteColumnExceptGenOnly The entity of whiteColumnExceptGenOnly. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhiteColumnExceptGenOnly whiteColumnExceptGenOnly, ReferrerLoaderHandler<LoaderOfWhiteColumnExceptGenOnly> handler) {
        xassLRArg(whiteColumnExceptGenOnly, handler);
        handler.handle(new LoaderOfWhiteColumnExceptGenOnly().ready(xnewLRAryLs(whiteColumnExceptGenOnly), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key genOnlyId.
     * @param whiteColumnExceptGenOnlyList The list of whiteColumnExceptGenOnly. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractGenOnlyIdList(List<WhiteColumnExceptGenOnly> whiteColumnExceptGenOnlyList) {
        return helpExtractListInternally(whiteColumnExceptGenOnlyList, new InternalExtractCallback<WhiteColumnExceptGenOnly, Long>() {
            public Long getCV(WhiteColumnExceptGenOnly et) { return et.getGenOnlyId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteColumnExceptGenOnly whiteColumnExceptGenOnly = new WhiteColumnExceptGenOnly();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteColumnExceptGenOnly.setFoo...(value);
     * whiteColumnExceptGenOnly.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteColumnExceptGenOnly.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteColumnExceptGenOnly.set...;</span>
     * whiteColumnExceptGenOnlyBhv.<span style="color: #DD4747">insert</span>(whiteColumnExceptGenOnly);
     * ... = whiteColumnExceptGenOnly.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteColumnExceptGenOnly The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteColumnExceptGenOnly whiteColumnExceptGenOnly) {
        doInsert(whiteColumnExceptGenOnly, null);
    }

    protected void doInsert(WhiteColumnExceptGenOnly et, InsertOption<WhiteColumnExceptGenOnlyCB> op) {
        assertObjectNotNull("whiteColumnExceptGenOnly", et);
        prepareInsertOption(op);
        delegateInsert(et, op);
    }

    protected void prepareInsertOption(InsertOption<WhiteColumnExceptGenOnlyCB> op) {
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
     * WhiteColumnExceptGenOnly whiteColumnExceptGenOnly = new WhiteColumnExceptGenOnly();
     * whiteColumnExceptGenOnly.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteColumnExceptGenOnly.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteColumnExceptGenOnly.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteColumnExceptGenOnly.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteColumnExceptGenOnly.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteColumnExceptGenOnlyBhv.<span style="color: #DD4747">update</span>(whiteColumnExceptGenOnly);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteColumnExceptGenOnly The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhiteColumnExceptGenOnly whiteColumnExceptGenOnly) {
        doUpdate(whiteColumnExceptGenOnly, null);
    }

    protected void doUpdate(WhiteColumnExceptGenOnly et, final UpdateOption<WhiteColumnExceptGenOnlyCB> op) {
        assertObjectNotNull("whiteColumnExceptGenOnly", et);
        prepareUpdateOption(op);
        helpUpdateInternally(et, new InternalUpdateCallback<WhiteColumnExceptGenOnly>() {
            public int callbackDelegateUpdate(WhiteColumnExceptGenOnly let) { return delegateUpdate(let, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhiteColumnExceptGenOnlyCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) { op.resolveSelfSpecification(createCBForVaryingUpdate()); }
        if (op.hasSpecifiedUpdateColumn()) { op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate()); }
    }

    protected WhiteColumnExceptGenOnlyCB createCBForVaryingUpdate()
    { WhiteColumnExceptGenOnlyCB cb = newConditionBean(); cb.xsetupForVaryingUpdate(); return cb; }

    protected WhiteColumnExceptGenOnlyCB createCBForSpecifiedUpdate()
    { WhiteColumnExceptGenOnlyCB cb = newConditionBean(); cb.xsetupForSpecifiedUpdate(); return cb; }

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
     * @param whiteColumnExceptGenOnly The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteColumnExceptGenOnly whiteColumnExceptGenOnly) {
        doInsertOrUpdate(whiteColumnExceptGenOnly, null, null);
    }

    protected void doInsertOrUpdate(WhiteColumnExceptGenOnly et, final InsertOption<WhiteColumnExceptGenOnlyCB> iop, final UpdateOption<WhiteColumnExceptGenOnlyCB> uop) {
        assertObjectNotNull("whiteColumnExceptGenOnly", et);
        helpInsertOrUpdateInternally(et, new InternalInsertOrUpdateCallback<WhiteColumnExceptGenOnly, WhiteColumnExceptGenOnlyCB>() {
            public void callbackInsert(WhiteColumnExceptGenOnly let) { doInsert(let, iop); }
            public void callbackUpdate(WhiteColumnExceptGenOnly let) { doUpdate(let, uop); }
            public WhiteColumnExceptGenOnlyCB callbackNewMyConditionBean() { return newConditionBean(); }
            public int callbackSelectCount(WhiteColumnExceptGenOnlyCB cb) { return selectCount(cb); }
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
     * WhiteColumnExceptGenOnly whiteColumnExceptGenOnly = new WhiteColumnExceptGenOnly();
     * whiteColumnExceptGenOnly.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteColumnExceptGenOnly.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteColumnExceptGenOnlyBhv.<span style="color: #DD4747">delete</span>(whiteColumnExceptGenOnly);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteColumnExceptGenOnly The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteColumnExceptGenOnly whiteColumnExceptGenOnly) {
        doDelete(whiteColumnExceptGenOnly, null);
    }

    protected void doDelete(WhiteColumnExceptGenOnly et, final DeleteOption<WhiteColumnExceptGenOnlyCB> op) {
        assertObjectNotNull("whiteColumnExceptGenOnly", et);
        prepareDeleteOption(op);
        helpDeleteInternally(et, new InternalDeleteCallback<WhiteColumnExceptGenOnly>() {
            public int callbackDelegateDelete(WhiteColumnExceptGenOnly let) { return delegateDelete(let, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhiteColumnExceptGenOnlyCB> op)
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
     *     WhiteColumnExceptGenOnly whiteColumnExceptGenOnly = new WhiteColumnExceptGenOnly();
     *     whiteColumnExceptGenOnly.setFooName("foo");
     *     if (...) {
     *         whiteColumnExceptGenOnly.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteColumnExceptGenOnlyList.add(whiteColumnExceptGenOnly);
     * }
     * whiteColumnExceptGenOnlyBhv.<span style="color: #DD4747">batchInsert</span>(whiteColumnExceptGenOnlyList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteColumnExceptGenOnlyList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteColumnExceptGenOnly> whiteColumnExceptGenOnlyList) {
        return doBatchInsert(whiteColumnExceptGenOnlyList, null);
    }

    protected int[] doBatchInsert(List<WhiteColumnExceptGenOnly> ls, InsertOption<WhiteColumnExceptGenOnlyCB> op) {
        assertObjectNotNull("whiteColumnExceptGenOnlyList", ls);
        InsertOption<WhiteColumnExceptGenOnlyCB> rlop; if (op != null) { rlop = op; } else { rlop = createPlainInsertOption(); }
        prepareBatchInsertOption(ls, rlop); // required
        return delegateBatchInsert(ls, rlop);
    }

    protected void prepareBatchInsertOption(List<WhiteColumnExceptGenOnly> ls, InsertOption<WhiteColumnExceptGenOnlyCB> op) {
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
     *     WhiteColumnExceptGenOnly whiteColumnExceptGenOnly = new WhiteColumnExceptGenOnly();
     *     whiteColumnExceptGenOnly.setFooName("foo");
     *     if (...) {
     *         whiteColumnExceptGenOnly.setFooPrice(123);
     *     } else {
     *         whiteColumnExceptGenOnly.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteColumnExceptGenOnly.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteColumnExceptGenOnlyList.add(whiteColumnExceptGenOnly);
     * }
     * whiteColumnExceptGenOnlyBhv.<span style="color: #DD4747">batchUpdate</span>(whiteColumnExceptGenOnlyList);
     * </pre>
     * @param whiteColumnExceptGenOnlyList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteColumnExceptGenOnly> whiteColumnExceptGenOnlyList) {
        return doBatchUpdate(whiteColumnExceptGenOnlyList, null);
    }

    protected int[] doBatchUpdate(List<WhiteColumnExceptGenOnly> ls, UpdateOption<WhiteColumnExceptGenOnlyCB> op) {
        assertObjectNotNull("whiteColumnExceptGenOnlyList", ls);
        UpdateOption<WhiteColumnExceptGenOnlyCB> rlop; if (op != null) { rlop = op; } else { rlop = createPlainUpdateOption(); }
        prepareBatchUpdateOption(ls, rlop); // required
        return delegateBatchUpdate(ls, rlop);
    }

    protected void prepareBatchUpdateOption(List<WhiteColumnExceptGenOnly> ls, UpdateOption<WhiteColumnExceptGenOnlyCB> op) {
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
     * whiteColumnExceptGenOnlyBhv.<span style="color: #DD4747">batchUpdate</span>(whiteColumnExceptGenOnlyList, new SpecifyQuery<WhiteColumnExceptGenOnlyCB>() {
     *     public void specify(WhiteColumnExceptGenOnlyCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteColumnExceptGenOnlyBhv.<span style="color: #DD4747">batchUpdate</span>(whiteColumnExceptGenOnlyList, new SpecifyQuery<WhiteColumnExceptGenOnlyCB>() {
     *     public void specify(WhiteColumnExceptGenOnlyCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteColumnExceptGenOnlyList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteColumnExceptGenOnly> whiteColumnExceptGenOnlyList, SpecifyQuery<WhiteColumnExceptGenOnlyCB> updateColumnSpec) {
        return doBatchUpdate(whiteColumnExceptGenOnlyList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteColumnExceptGenOnlyList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteColumnExceptGenOnly> whiteColumnExceptGenOnlyList) {
        return doBatchDelete(whiteColumnExceptGenOnlyList, null);
    }

    protected int[] doBatchDelete(List<WhiteColumnExceptGenOnly> ls, DeleteOption<WhiteColumnExceptGenOnlyCB> op) {
        assertObjectNotNull("whiteColumnExceptGenOnlyList", ls);
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
     * whiteColumnExceptGenOnlyBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteColumnExceptGenOnly, WhiteColumnExceptGenOnlyCB&gt;() {
     *     public ConditionBean setup(whiteColumnExceptGenOnly entity, WhiteColumnExceptGenOnlyCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteColumnExceptGenOnly, WhiteColumnExceptGenOnlyCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteColumnExceptGenOnly, WhiteColumnExceptGenOnlyCB> sp, InsertOption<WhiteColumnExceptGenOnlyCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        WhiteColumnExceptGenOnly et = newEntity();
        WhiteColumnExceptGenOnlyCB cb = createCBForQueryInsert();
        return delegateQueryInsert(et, cb, sp.setup(et, cb), op);
    }

    protected WhiteColumnExceptGenOnlyCB createCBForQueryInsert()
    { WhiteColumnExceptGenOnlyCB cb = newConditionBean(); cb.xsetupForQueryInsert(); return cb; }

    @Override
    protected int doRangeCreate(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> setupper, InsertOption<? extends ConditionBean> op) {
        return doQueryInsert(downcast(setupper), downcast(op));
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteColumnExceptGenOnly whiteColumnExceptGenOnly = new WhiteColumnExceptGenOnly();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteColumnExceptGenOnly.setPK...(value);</span>
     * whiteColumnExceptGenOnly.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteColumnExceptGenOnly.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteColumnExceptGenOnly.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteColumnExceptGenOnly.setVersionNo(value);</span>
     * WhiteColumnExceptGenOnlyCB cb = new WhiteColumnExceptGenOnlyCB();
     * cb.query().setFoo...(value);
     * whiteColumnExceptGenOnlyBhv.<span style="color: #DD4747">queryUpdate</span>(whiteColumnExceptGenOnly, cb);
     * </pre>
     * @param whiteColumnExceptGenOnly The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteColumnExceptGenOnly. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteColumnExceptGenOnly whiteColumnExceptGenOnly, WhiteColumnExceptGenOnlyCB cb) {
        return doQueryUpdate(whiteColumnExceptGenOnly, cb, null);
    }

    protected int doQueryUpdate(WhiteColumnExceptGenOnly et, WhiteColumnExceptGenOnlyCB cb, UpdateOption<WhiteColumnExceptGenOnlyCB> op) {
        assertObjectNotNull("whiteColumnExceptGenOnly", et); assertCBStateValid(cb);
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
     * WhiteColumnExceptGenOnlyCB cb = new WhiteColumnExceptGenOnlyCB();
     * cb.query().setFoo...(value);
     * whiteColumnExceptGenOnlyBhv.<span style="color: #DD4747">queryDelete</span>(whiteColumnExceptGenOnly, cb);
     * </pre>
     * @param cb The condition-bean of WhiteColumnExceptGenOnly. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteColumnExceptGenOnlyCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteColumnExceptGenOnlyCB cb, DeleteOption<WhiteColumnExceptGenOnlyCB> op) {
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
     * WhiteColumnExceptGenOnly whiteColumnExceptGenOnly = new WhiteColumnExceptGenOnly();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteColumnExceptGenOnly.setFoo...(value);
     * whiteColumnExceptGenOnly.setBar...(value);
     * InsertOption<WhiteColumnExceptGenOnlyCB> option = new InsertOption<WhiteColumnExceptGenOnlyCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteColumnExceptGenOnlyBhv.<span style="color: #DD4747">varyingInsert</span>(whiteColumnExceptGenOnly, option);
     * ... = whiteColumnExceptGenOnly.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteColumnExceptGenOnly The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteColumnExceptGenOnly whiteColumnExceptGenOnly, InsertOption<WhiteColumnExceptGenOnlyCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteColumnExceptGenOnly, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteColumnExceptGenOnly whiteColumnExceptGenOnly = new WhiteColumnExceptGenOnly();
     * whiteColumnExceptGenOnly.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteColumnExceptGenOnly.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteColumnExceptGenOnly.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteColumnExceptGenOnlyCB&gt; option = new UpdateOption&lt;WhiteColumnExceptGenOnlyCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteColumnExceptGenOnlyCB&gt;() {
     *         public void specify(WhiteColumnExceptGenOnlyCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteColumnExceptGenOnlyBhv.<span style="color: #DD4747">varyingUpdate</span>(whiteColumnExceptGenOnly, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteColumnExceptGenOnly The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteColumnExceptGenOnly whiteColumnExceptGenOnly, UpdateOption<WhiteColumnExceptGenOnlyCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteColumnExceptGenOnly, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteColumnExceptGenOnly The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteColumnExceptGenOnly whiteColumnExceptGenOnly, InsertOption<WhiteColumnExceptGenOnlyCB> insertOption, UpdateOption<WhiteColumnExceptGenOnlyCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdate(whiteColumnExceptGenOnly, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteColumnExceptGenOnly The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteColumnExceptGenOnly whiteColumnExceptGenOnly, DeleteOption<WhiteColumnExceptGenOnlyCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteColumnExceptGenOnly, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteColumnExceptGenOnlyList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteColumnExceptGenOnly> whiteColumnExceptGenOnlyList, InsertOption<WhiteColumnExceptGenOnlyCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteColumnExceptGenOnlyList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteColumnExceptGenOnlyList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteColumnExceptGenOnly> whiteColumnExceptGenOnlyList, UpdateOption<WhiteColumnExceptGenOnlyCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteColumnExceptGenOnlyList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteColumnExceptGenOnlyList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteColumnExceptGenOnly> whiteColumnExceptGenOnlyList, DeleteOption<WhiteColumnExceptGenOnlyCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteColumnExceptGenOnlyList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteColumnExceptGenOnly, WhiteColumnExceptGenOnlyCB> setupper, InsertOption<WhiteColumnExceptGenOnlyCB> option) {
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
     * WhiteColumnExceptGenOnly whiteColumnExceptGenOnly = new WhiteColumnExceptGenOnly();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteColumnExceptGenOnly.setPK...(value);</span>
     * whiteColumnExceptGenOnly.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteColumnExceptGenOnly.setVersionNo(value);</span>
     * WhiteColumnExceptGenOnlyCB cb = new WhiteColumnExceptGenOnlyCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteColumnExceptGenOnlyCB&gt; option = new UpdateOption&lt;WhiteColumnExceptGenOnlyCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteColumnExceptGenOnlyCB&gt;() {
     *     public void specify(WhiteColumnExceptGenOnlyCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteColumnExceptGenOnlyBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteColumnExceptGenOnly, cb, option);
     * </pre>
     * @param whiteColumnExceptGenOnly The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteColumnExceptGenOnly. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteColumnExceptGenOnly whiteColumnExceptGenOnly, WhiteColumnExceptGenOnlyCB cb, UpdateOption<WhiteColumnExceptGenOnlyCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteColumnExceptGenOnly, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteColumnExceptGenOnly. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteColumnExceptGenOnlyCB cb, DeleteOption<WhiteColumnExceptGenOnlyCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteColumnExceptGenOnlyBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhiteColumnExceptGenOnlyCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhiteColumnExceptGenOnlyCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhiteColumnExceptGenOnly> void delegateSelectCursor(WhiteColumnExceptGenOnlyCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends WhiteColumnExceptGenOnly> List<ENTITY> delegateSelectList(WhiteColumnExceptGenOnlyCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhiteColumnExceptGenOnly et, InsertOption<WhiteColumnExceptGenOnlyCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(WhiteColumnExceptGenOnly et, UpdateOption<WhiteColumnExceptGenOnlyCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(WhiteColumnExceptGenOnly et, UpdateOption<WhiteColumnExceptGenOnlyCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(WhiteColumnExceptGenOnly et, DeleteOption<WhiteColumnExceptGenOnlyCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(WhiteColumnExceptGenOnly et, DeleteOption<WhiteColumnExceptGenOnlyCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<WhiteColumnExceptGenOnly> ls, InsertOption<WhiteColumnExceptGenOnlyCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhiteColumnExceptGenOnly> ls, UpdateOption<WhiteColumnExceptGenOnlyCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhiteColumnExceptGenOnly> ls, UpdateOption<WhiteColumnExceptGenOnlyCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhiteColumnExceptGenOnly> ls, DeleteOption<WhiteColumnExceptGenOnlyCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhiteColumnExceptGenOnly> ls, DeleteOption<WhiteColumnExceptGenOnlyCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhiteColumnExceptGenOnly et, WhiteColumnExceptGenOnlyCB inCB, ConditionBean resCB, InsertOption<WhiteColumnExceptGenOnlyCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhiteColumnExceptGenOnly et, WhiteColumnExceptGenOnlyCB cb, UpdateOption<WhiteColumnExceptGenOnlyCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(WhiteColumnExceptGenOnlyCB cb, DeleteOption<WhiteColumnExceptGenOnlyCB> op)
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
    protected Class<WhiteColumnExceptGenOnly> typeOfSelectedEntity()
    { return WhiteColumnExceptGenOnly.class; }

    protected WhiteColumnExceptGenOnly downcast(Entity et)
    { return helpEntityDowncastInternally(et, WhiteColumnExceptGenOnly.class); }

    protected WhiteColumnExceptGenOnlyCB downcast(ConditionBean cb)
    { return helpConditionBeanDowncastInternally(cb, WhiteColumnExceptGenOnlyCB.class); }

    @SuppressWarnings("unchecked")
    protected List<WhiteColumnExceptGenOnly> downcast(List<? extends Entity> ls)
    { return (List<WhiteColumnExceptGenOnly>)ls; }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteColumnExceptGenOnlyCB> downcast(InsertOption<? extends ConditionBean> op)
    { return (InsertOption<WhiteColumnExceptGenOnlyCB>)op; }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteColumnExceptGenOnlyCB> downcast(UpdateOption<? extends ConditionBean> op)
    { return (UpdateOption<WhiteColumnExceptGenOnlyCB>)op; }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteColumnExceptGenOnlyCB> downcast(DeleteOption<? extends ConditionBean> op)
    { return (DeleteOption<WhiteColumnExceptGenOnlyCB>)op; }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteColumnExceptGenOnly, WhiteColumnExceptGenOnlyCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp)
    { return (QueryInsertSetupper<WhiteColumnExceptGenOnly, WhiteColumnExceptGenOnlyCB>)sp; }
}
