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
 * The behavior of WHITE_PG_RESERV as TABLE. <br />
 * <pre>
 * [primary key]
 *     CLASS
 *
 * [column]
 *     CLASS, CASE, PACKAGE, DEFAULT, NEW, NATIVE, VOID, PUBLIC, PROTECTED, PRIVATE, INTERFACE, ABSTRACT, FINAL, FINALLY, RETURN, DOUBLE, FLOAT, SHORT, TYPE, RESERV_NAME
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
 *     white_pg_reserv_ref
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whitePgReservRefList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhitePgReservBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_pg_reserv"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public DBMeta getDBMeta() { return WhitePgReservDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhitePgReservDbm getMyDBMeta() { return WhitePgReservDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhitePgReserv newEntity() { return new WhitePgReserv(); }

    /** {@inheritDoc} */
    public WhitePgReservCB newConditionBean() { return new WhitePgReservCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhitePgReserv newMyEntity() { return new WhitePgReserv(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhitePgReservCB newMyConditionBean() { return new WhitePgReservCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhitePgReservCB cb = new WhitePgReservCB();
     * cb.query().setFoo...(value);
     * int count = whitePgReservBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhitePgReserv. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhitePgReservCB cb) {
        return facadeSelectCount(cb);
    }

    protected int facadeSelectCount(WhitePgReservCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhitePgReservCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhitePgReservCB cb) { // called by selectPage(cb)
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
     * WhitePgReservCB cb = new WhitePgReservCB();
     * cb.query().setFoo...(value);
     * WhitePgReserv whitePgReserv = whitePgReservBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (whitePgReserv != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = whitePgReserv.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhitePgReserv. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhitePgReserv selectEntity(WhitePgReservCB cb) {
        return facadeSelectEntity(cb);
    }

    protected WhitePgReserv facadeSelectEntity(WhitePgReservCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhitePgReserv> ENTITY doSelectEntity(WhitePgReservCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, WhitePgReservCB>() {
            public List<ENTITY> callbackSelectList(WhitePgReservCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    protected <ENTITY extends WhitePgReserv> OptionalEntity<ENTITY> doSelectOptionalEntity(WhitePgReservCB cb, Class<ENTITY> tp) {
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
     * WhitePgReservCB cb = new WhitePgReservCB();
     * cb.query().setFoo...(value);
     * WhitePgReserv whitePgReserv = whitePgReservBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whitePgReserv.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhitePgReserv. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhitePgReserv selectEntityWithDeletedCheck(WhitePgReservCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    protected WhitePgReserv facadeSelectEntityWithDeletedCheck(WhitePgReservCB cb) {
        return doSelectEntityWithDeletedCheck(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhitePgReserv> ENTITY doSelectEntityWithDeletedCheck(WhitePgReservCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhitePgReservCB>() {
            public List<ENTITY> callbackSelectList(WhitePgReservCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return facadeSelectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param classSynonym ((using DBFlute synonym)): PK, NotNull, INT(10). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhitePgReserv selectByPKValue(Integer classSynonym) {
        return facadeSelectByPKValue(classSynonym);
    }

    protected WhitePgReserv facadeSelectByPKValue(Integer classSynonym) {
        return doSelectByPK(classSynonym, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhitePgReserv> ENTITY doSelectByPK(Integer classSynonym, Class<ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(classSynonym), tp);
    }

    protected <ENTITY extends WhitePgReserv> OptionalEntity<ENTITY> doSelectOptionalByPK(Integer classSynonym, Class<ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(classSynonym, tp), classSynonym);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param classSynonym ((using DBFlute synonym)): PK, NotNull, INT(10). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhitePgReserv selectByPKValueWithDeletedCheck(Integer classSynonym) {
        return doSelectByPKWithDeletedCheck(classSynonym, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhitePgReserv> ENTITY doSelectByPKWithDeletedCheck(Integer classSynonym, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(classSynonym), tp);
    }

    protected WhitePgReservCB xprepareCBAsPK(Integer classSynonym) {
        assertObjectNotNull("classSynonym", classSynonym);
        return newConditionBean().acceptPK(classSynonym);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhitePgReservCB cb = new WhitePgReservCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhitePgReserv&gt; whitePgReservList = whitePgReservBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhitePgReserv whitePgReserv : whitePgReservList) {
     *     ... = whitePgReserv.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhitePgReserv. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhitePgReserv> selectList(WhitePgReservCB cb) {
        return facadeSelectList(cb);
    }

    protected ListResultBean<WhitePgReserv> facadeSelectList(WhitePgReservCB cb) {
        return doSelectList(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhitePgReserv> ListResultBean<ENTITY> doSelectList(WhitePgReservCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, WhitePgReservCB>() {
            public List<ENTITY> callbackSelectList(WhitePgReservCB lcb, Class<ENTITY> ltp) { return delegateSelectList(lcb, ltp); } });
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
     * WhitePgReservCB cb = new WhitePgReservCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhitePgReserv&gt; page = whitePgReservBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhitePgReserv whitePgReserv : page) {
     *     ... = whitePgReserv.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhitePgReserv. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhitePgReserv> selectPage(WhitePgReservCB cb) {
        return facadeSelectPage(cb);
    }

    protected PagingResultBean<WhitePgReserv> facadeSelectPage(WhitePgReservCB cb) {
        return doSelectPage(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhitePgReserv> PagingResultBean<ENTITY> doSelectPage(WhitePgReservCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, WhitePgReservCB>() {
            public int callbackSelectCount(WhitePgReservCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhitePgReservCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * WhitePgReservCB cb = new WhitePgReservCB();
     * cb.query().setFoo...(value);
     * whitePgReservBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhitePgReserv&gt;() {
     *     public void handle(WhitePgReserv entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhitePgReserv. (NotNull)
     * @param entityRowHandler The handler of entity row of WhitePgReserv. (NotNull)
     */
    public void selectCursor(WhitePgReservCB cb, EntityRowHandler<WhitePgReserv> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    protected void facadeSelectCursor(WhitePgReservCB cb, EntityRowHandler<WhitePgReserv> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhitePgReserv> void doSelectCursor(WhitePgReservCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, WhitePgReservCB>() {
            public void callbackSelectCursor(WhitePgReservCB lcb, EntityRowHandler<ENTITY> lhandler, Class<ENTITY> ltp) { delegateSelectCursor(lcb, lhandler, ltp); }
            public List<ENTITY> callbackSelectList(WhitePgReservCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whitePgReservBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhitePgReservCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhitePgReservCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    protected <RESULT> HpSLSFunction<WhitePgReservCB, RESULT> facadeScalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newConditionBean());
    }

    protected <RESULT, CB extends WhitePgReservCB> HpSLSFunction<CB, RESULT> doScalarSelect(final Class<RESULT> tp, final CB cb) {
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
     * @param whitePgReservList The entity list of whitePgReserv. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhitePgReserv> whitePgReservList, ReferrerLoaderHandler<LoaderOfWhitePgReserv> handler) {
        xassLRArg(whitePgReservList, handler);
        handler.handle(new LoaderOfWhitePgReserv().ready(whitePgReservList, _behaviorSelector));
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
     * @param whitePgReserv The entity of whitePgReserv. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhitePgReserv whitePgReserv, ReferrerLoaderHandler<LoaderOfWhitePgReserv> handler) {
        xassLRArg(whitePgReserv, handler);
        handler.handle(new LoaderOfWhitePgReserv().ready(xnewLRAryLs(whitePgReserv), _behaviorSelector));
    }

    /**
     * Load referrer of whitePgReservRefList by the set-upper of referrer. <br />
     * white_pg_reserv_ref by CLASS, named 'whitePgReservRefList'.
     * <pre>
     * whitePgReservBhv.<span style="color: #DD4747">loadWhitePgReservRefList</span>(whitePgReservList, new ConditionBeanSetupper&lt;WhitePgReservRefCB&gt;() {
     *     public void setup(WhitePgReservRefCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (WhitePgReserv whitePgReserv : whitePgReservList) {
     *     ... = whitePgReserv.<span style="color: #DD4747">getWhitePgReservRefList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClassSynonym_InScope(pkList);
     * cb.query().addOrderBy_ClassSynonym_Asc();
     * </pre>
     * @param whitePgReservList The entity list of whitePgReserv. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhitePgReservRef> loadWhitePgReservRefList(List<WhitePgReserv> whitePgReservList, ConditionBeanSetupper<WhitePgReservRefCB> setupper) {
        xassLRArg(whitePgReservList, setupper);
        return doLoadWhitePgReservRefList(whitePgReservList, new LoadReferrerOption<WhitePgReservRefCB, WhitePgReservRef>().xinit(setupper));
    }

    /**
     * Load referrer of whitePgReservRefList by the set-upper of referrer. <br />
     * white_pg_reserv_ref by CLASS, named 'whitePgReservRefList'.
     * <pre>
     * whitePgReservBhv.<span style="color: #DD4747">loadWhitePgReservRefList</span>(whitePgReservList, new ConditionBeanSetupper&lt;WhitePgReservRefCB&gt;() {
     *     public void setup(WhitePgReservRefCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = whitePgReserv.<span style="color: #DD4747">getWhitePgReservRefList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClassSynonym_InScope(pkList);
     * cb.query().addOrderBy_ClassSynonym_Asc();
     * </pre>
     * @param whitePgReserv The entity of whitePgReserv. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhitePgReservRef> loadWhitePgReservRefList(WhitePgReserv whitePgReserv, ConditionBeanSetupper<WhitePgReservRefCB> setupper) {
        xassLRArg(whitePgReserv, setupper);
        return doLoadWhitePgReservRefList(xnewLRLs(whitePgReserv), new LoadReferrerOption<WhitePgReservRefCB, WhitePgReservRef>().xinit(setupper));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param whitePgReserv The entity of whitePgReserv. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhitePgReservRef> loadWhitePgReservRefList(WhitePgReserv whitePgReserv, LoadReferrerOption<WhitePgReservRefCB, WhitePgReservRef> loadReferrerOption) {
        xassLRArg(whitePgReserv, loadReferrerOption);
        return loadWhitePgReservRefList(xnewLRLs(whitePgReserv), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean setupper.} #beforejava8
     * @param whitePgReservList The entity list of whitePgReserv. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WhitePgReservRef> loadWhitePgReservRefList(List<WhitePgReserv> whitePgReservList, LoadReferrerOption<WhitePgReservRefCB, WhitePgReservRef> loadReferrerOption) {
        xassLRArg(whitePgReservList, loadReferrerOption);
        if (whitePgReservList.isEmpty()) { return (NestedReferrerListGateway<WhitePgReservRef>)EMPTY_NREF_LGWAY; }
        return doLoadWhitePgReservRefList(whitePgReservList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WhitePgReservRef> doLoadWhitePgReservRefList(List<WhitePgReserv> whitePgReservList, LoadReferrerOption<WhitePgReservRefCB, WhitePgReservRef> option) {
        final WhitePgReservRefBhv referrerBhv = xgetBSFLR().select(WhitePgReservRefBhv.class);
        return helpLoadReferrerInternally(whitePgReservList, option, new InternalLoadReferrerCallback<WhitePgReserv, Integer, WhitePgReservRefCB, WhitePgReservRef>() {
            public Integer getPKVal(WhitePgReserv et)
            { return et.getClassSynonym(); }
            public void setRfLs(WhitePgReserv et, List<WhitePgReservRef> ls)
            { et.setWhitePgReservRefList(ls); }
            public WhitePgReservRefCB newMyCB() { return referrerBhv.newConditionBean(); }
            public void qyFKIn(WhitePgReservRefCB cb, List<Integer> ls)
            { cb.query().setClassSynonym_InScope(ls); }
            public void qyOdFKAsc(WhitePgReservRefCB cb) { cb.query().addOrderBy_ClassSynonym_Asc(); }
            public void spFKCol(WhitePgReservRefCB cb) { cb.specify().columnClassSynonym(); }
            public List<WhitePgReservRef> selRfLs(WhitePgReservRefCB cb) { return referrerBhv.selectList(cb); }
            public Integer getFKVal(WhitePgReservRef re) { return re.getClassSynonym(); }
            public void setlcEt(WhitePgReservRef re, WhitePgReserv le)
            { re.setWhitePgReserv(le); }
            public String getRfPrNm() { return "whitePgReservRefList"; }
        });
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key classSynonym.
     * @param whitePgReservList The list of whitePgReserv. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractClassSynonymList(List<WhitePgReserv> whitePgReservList) {
        return helpExtractListInternally(whitePgReservList, new InternalExtractCallback<WhitePgReserv, Integer>() {
            public Integer getCV(WhitePgReserv et) { return et.getClassSynonym(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhitePgReserv whitePgReserv = new WhitePgReserv();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whitePgReserv.setFoo...(value);
     * whitePgReserv.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whitePgReserv.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whitePgReserv.set...;</span>
     * whitePgReservBhv.<span style="color: #DD4747">insert</span>(whitePgReserv);
     * ... = whitePgReserv.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whitePgReserv The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhitePgReserv whitePgReserv) {
        doInsert(whitePgReserv, null);
    }

    protected void doInsert(WhitePgReserv et, InsertOption<WhitePgReservCB> op) {
        assertObjectNotNull("whitePgReserv", et);
        prepareInsertOption(op);
        delegateInsert(et, op);
    }

    protected void prepareInsertOption(InsertOption<WhitePgReservCB> op) {
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
     * WhitePgReserv whitePgReserv = new WhitePgReserv();
     * whitePgReserv.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whitePgReserv.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whitePgReserv.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whitePgReserv.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whitePgReserv.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whitePgReservBhv.<span style="color: #DD4747">update</span>(whitePgReserv);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whitePgReserv The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhitePgReserv whitePgReserv) {
        doUpdate(whitePgReserv, null);
    }

    protected void doUpdate(WhitePgReserv et, final UpdateOption<WhitePgReservCB> op) {
        assertObjectNotNull("whitePgReserv", et);
        prepareUpdateOption(op);
        helpUpdateInternally(et, new InternalUpdateCallback<WhitePgReserv>() {
            public int callbackDelegateUpdate(WhitePgReserv let) { return delegateUpdate(let, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhitePgReservCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) { op.resolveSelfSpecification(createCBForVaryingUpdate()); }
        if (op.hasSpecifiedUpdateColumn()) { op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate()); }
    }

    protected WhitePgReservCB createCBForVaryingUpdate()
    { WhitePgReservCB cb = newConditionBean(); cb.xsetupForVaryingUpdate(); return cb; }

    protected WhitePgReservCB createCBForSpecifiedUpdate()
    { WhitePgReservCB cb = newConditionBean(); cb.xsetupForSpecifiedUpdate(); return cb; }

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
     * @param whitePgReserv The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhitePgReserv whitePgReserv) {
        doInsertOrUpdate(whitePgReserv, null, null);
    }

    protected void doInsertOrUpdate(WhitePgReserv et, final InsertOption<WhitePgReservCB> iop, final UpdateOption<WhitePgReservCB> uop) {
        assertObjectNotNull("whitePgReserv", et);
        helpInsertOrUpdateInternally(et, new InternalInsertOrUpdateCallback<WhitePgReserv, WhitePgReservCB>() {
            public void callbackInsert(WhitePgReserv let) { doInsert(let, iop); }
            public void callbackUpdate(WhitePgReserv let) { doUpdate(let, uop); }
            public WhitePgReservCB callbackNewMyConditionBean() { return newConditionBean(); }
            public int callbackSelectCount(WhitePgReservCB cb) { return selectCount(cb); }
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
     * WhitePgReserv whitePgReserv = new WhitePgReserv();
     * whitePgReserv.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whitePgReserv.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whitePgReservBhv.<span style="color: #DD4747">delete</span>(whitePgReserv);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whitePgReserv The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhitePgReserv whitePgReserv) {
        doDelete(whitePgReserv, null);
    }

    protected void doDelete(WhitePgReserv et, final DeleteOption<WhitePgReservCB> op) {
        assertObjectNotNull("whitePgReserv", et);
        prepareDeleteOption(op);
        helpDeleteInternally(et, new InternalDeleteCallback<WhitePgReserv>() {
            public int callbackDelegateDelete(WhitePgReserv let) { return delegateDelete(let, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhitePgReservCB> op)
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
     *     WhitePgReserv whitePgReserv = new WhitePgReserv();
     *     whitePgReserv.setFooName("foo");
     *     if (...) {
     *         whitePgReserv.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whitePgReservList.add(whitePgReserv);
     * }
     * whitePgReservBhv.<span style="color: #DD4747">batchInsert</span>(whitePgReservList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whitePgReservList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhitePgReserv> whitePgReservList) {
        return doBatchInsert(whitePgReservList, null);
    }

    protected int[] doBatchInsert(List<WhitePgReserv> ls, InsertOption<WhitePgReservCB> op) {
        assertObjectNotNull("whitePgReservList", ls);
        InsertOption<WhitePgReservCB> rlop; if (op != null) { rlop = op; } else { rlop = createPlainInsertOption(); }
        prepareBatchInsertOption(ls, rlop); // required
        return delegateBatchInsert(ls, rlop);
    }

    protected void prepareBatchInsertOption(List<WhitePgReserv> ls, InsertOption<WhitePgReservCB> op) {
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
     *     WhitePgReserv whitePgReserv = new WhitePgReserv();
     *     whitePgReserv.setFooName("foo");
     *     if (...) {
     *         whitePgReserv.setFooPrice(123);
     *     } else {
     *         whitePgReserv.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whitePgReserv.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whitePgReservList.add(whitePgReserv);
     * }
     * whitePgReservBhv.<span style="color: #DD4747">batchUpdate</span>(whitePgReservList);
     * </pre>
     * @param whitePgReservList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhitePgReserv> whitePgReservList) {
        return doBatchUpdate(whitePgReservList, null);
    }

    protected int[] doBatchUpdate(List<WhitePgReserv> ls, UpdateOption<WhitePgReservCB> op) {
        assertObjectNotNull("whitePgReservList", ls);
        UpdateOption<WhitePgReservCB> rlop; if (op != null) { rlop = op; } else { rlop = createPlainUpdateOption(); }
        prepareBatchUpdateOption(ls, rlop); // required
        return delegateBatchUpdate(ls, rlop);
    }

    protected void prepareBatchUpdateOption(List<WhitePgReserv> ls, UpdateOption<WhitePgReservCB> op) {
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
     * whitePgReservBhv.<span style="color: #DD4747">batchUpdate</span>(whitePgReservList, new SpecifyQuery<WhitePgReservCB>() {
     *     public void specify(WhitePgReservCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whitePgReservBhv.<span style="color: #DD4747">batchUpdate</span>(whitePgReservList, new SpecifyQuery<WhitePgReservCB>() {
     *     public void specify(WhitePgReservCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whitePgReservList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhitePgReserv> whitePgReservList, SpecifyQuery<WhitePgReservCB> updateColumnSpec) {
        return doBatchUpdate(whitePgReservList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whitePgReservList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhitePgReserv> whitePgReservList) {
        return doBatchDelete(whitePgReservList, null);
    }

    protected int[] doBatchDelete(List<WhitePgReserv> ls, DeleteOption<WhitePgReservCB> op) {
        assertObjectNotNull("whitePgReservList", ls);
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
     * whitePgReservBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhitePgReserv, WhitePgReservCB&gt;() {
     *     public ConditionBean setup(whitePgReserv entity, WhitePgReservCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhitePgReserv, WhitePgReservCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhitePgReserv, WhitePgReservCB> sp, InsertOption<WhitePgReservCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        WhitePgReserv et = newEntity();
        WhitePgReservCB cb = createCBForQueryInsert();
        return delegateQueryInsert(et, cb, sp.setup(et, cb), op);
    }

    protected WhitePgReservCB createCBForQueryInsert()
    { WhitePgReservCB cb = newConditionBean(); cb.xsetupForQueryInsert(); return cb; }

    @Override
    protected int doRangeCreate(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> setupper, InsertOption<? extends ConditionBean> op) {
        return doQueryInsert(downcast(setupper), downcast(op));
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhitePgReserv whitePgReserv = new WhitePgReserv();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whitePgReserv.setPK...(value);</span>
     * whitePgReserv.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whitePgReserv.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whitePgReserv.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whitePgReserv.setVersionNo(value);</span>
     * WhitePgReservCB cb = new WhitePgReservCB();
     * cb.query().setFoo...(value);
     * whitePgReservBhv.<span style="color: #DD4747">queryUpdate</span>(whitePgReserv, cb);
     * </pre>
     * @param whitePgReserv The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhitePgReserv. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhitePgReserv whitePgReserv, WhitePgReservCB cb) {
        return doQueryUpdate(whitePgReserv, cb, null);
    }

    protected int doQueryUpdate(WhitePgReserv et, WhitePgReservCB cb, UpdateOption<WhitePgReservCB> op) {
        assertObjectNotNull("whitePgReserv", et); assertCBStateValid(cb);
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
     * WhitePgReservCB cb = new WhitePgReservCB();
     * cb.query().setFoo...(value);
     * whitePgReservBhv.<span style="color: #DD4747">queryDelete</span>(whitePgReserv, cb);
     * </pre>
     * @param cb The condition-bean of WhitePgReserv. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhitePgReservCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhitePgReservCB cb, DeleteOption<WhitePgReservCB> op) {
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
     * WhitePgReserv whitePgReserv = new WhitePgReserv();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whitePgReserv.setFoo...(value);
     * whitePgReserv.setBar...(value);
     * InsertOption<WhitePgReservCB> option = new InsertOption<WhitePgReservCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whitePgReservBhv.<span style="color: #DD4747">varyingInsert</span>(whitePgReserv, option);
     * ... = whitePgReserv.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whitePgReserv The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhitePgReserv whitePgReserv, InsertOption<WhitePgReservCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whitePgReserv, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhitePgReserv whitePgReserv = new WhitePgReserv();
     * whitePgReserv.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whitePgReserv.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whitePgReserv.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhitePgReservCB&gt; option = new UpdateOption&lt;WhitePgReservCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhitePgReservCB&gt;() {
     *         public void specify(WhitePgReservCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whitePgReservBhv.<span style="color: #DD4747">varyingUpdate</span>(whitePgReserv, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whitePgReserv The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhitePgReserv whitePgReserv, UpdateOption<WhitePgReservCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whitePgReserv, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whitePgReserv The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhitePgReserv whitePgReserv, InsertOption<WhitePgReservCB> insertOption, UpdateOption<WhitePgReservCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdate(whitePgReserv, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whitePgReserv The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhitePgReserv whitePgReserv, DeleteOption<WhitePgReservCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whitePgReserv, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whitePgReservList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhitePgReserv> whitePgReservList, InsertOption<WhitePgReservCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whitePgReservList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whitePgReservList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhitePgReserv> whitePgReservList, UpdateOption<WhitePgReservCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whitePgReservList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whitePgReservList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhitePgReserv> whitePgReservList, DeleteOption<WhitePgReservCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whitePgReservList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhitePgReserv, WhitePgReservCB> setupper, InsertOption<WhitePgReservCB> option) {
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
     * WhitePgReserv whitePgReserv = new WhitePgReserv();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whitePgReserv.setPK...(value);</span>
     * whitePgReserv.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whitePgReserv.setVersionNo(value);</span>
     * WhitePgReservCB cb = new WhitePgReservCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhitePgReservCB&gt; option = new UpdateOption&lt;WhitePgReservCB&gt;();
     * option.self(new SpecifyQuery&lt;WhitePgReservCB&gt;() {
     *     public void specify(WhitePgReservCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whitePgReservBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whitePgReserv, cb, option);
     * </pre>
     * @param whitePgReserv The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhitePgReserv. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhitePgReserv whitePgReserv, WhitePgReservCB cb, UpdateOption<WhitePgReservCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whitePgReserv, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhitePgReserv. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhitePgReservCB cb, DeleteOption<WhitePgReservCB> option) {
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
    public OutsideSqlBasicExecutor<WhitePgReservBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhitePgReservCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhitePgReservCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhitePgReserv> void delegateSelectCursor(WhitePgReservCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends WhitePgReserv> List<ENTITY> delegateSelectList(WhitePgReservCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhitePgReserv et, InsertOption<WhitePgReservCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(WhitePgReserv et, UpdateOption<WhitePgReservCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(WhitePgReserv et, UpdateOption<WhitePgReservCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(WhitePgReserv et, DeleteOption<WhitePgReservCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(WhitePgReserv et, DeleteOption<WhitePgReservCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<WhitePgReserv> ls, InsertOption<WhitePgReservCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhitePgReserv> ls, UpdateOption<WhitePgReservCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhitePgReserv> ls, UpdateOption<WhitePgReservCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhitePgReserv> ls, DeleteOption<WhitePgReservCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhitePgReserv> ls, DeleteOption<WhitePgReservCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhitePgReserv et, WhitePgReservCB inCB, ConditionBean resCB, InsertOption<WhitePgReservCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhitePgReserv et, WhitePgReservCB cb, UpdateOption<WhitePgReservCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(WhitePgReservCB cb, DeleteOption<WhitePgReservCB> op)
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
    protected Class<WhitePgReserv> typeOfSelectedEntity()
    { return WhitePgReserv.class; }

    protected WhitePgReserv downcast(Entity et)
    { return helpEntityDowncastInternally(et, WhitePgReserv.class); }

    protected WhitePgReservCB downcast(ConditionBean cb)
    { return helpConditionBeanDowncastInternally(cb, WhitePgReservCB.class); }

    @SuppressWarnings("unchecked")
    protected List<WhitePgReserv> downcast(List<? extends Entity> ls)
    { return (List<WhitePgReserv>)ls; }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhitePgReservCB> downcast(InsertOption<? extends ConditionBean> op)
    { return (InsertOption<WhitePgReservCB>)op; }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhitePgReservCB> downcast(UpdateOption<? extends ConditionBean> op)
    { return (UpdateOption<WhitePgReservCB>)op; }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhitePgReservCB> downcast(DeleteOption<? extends ConditionBean> op)
    { return (DeleteOption<WhitePgReservCB>)op; }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhitePgReserv, WhitePgReservCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp)
    { return (QueryInsertSetupper<WhitePgReserv, WhitePgReservCB>)sp; }
}
