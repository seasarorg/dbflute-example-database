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
 * The behavior of WHITE_PG_RESERV_REF as TABLE. <br />
 * <pre>
 * [primary key]
 *     REF_ID
 *
 * [column]
 *     REF_ID, CLASS
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
 *     white_pg_reserv
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     whitePgReserv
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhitePgReservRefBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_pg_reserv_ref"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public DBMeta getDBMeta() { return WhitePgReservRefDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhitePgReservRefDbm getMyDBMeta() { return WhitePgReservRefDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhitePgReservRef newEntity() { return new WhitePgReservRef(); }

    /** {@inheritDoc} */
    public WhitePgReservRefCB newConditionBean() { return new WhitePgReservRefCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhitePgReservRef newMyEntity() { return new WhitePgReservRef(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhitePgReservRefCB newMyConditionBean() { return new WhitePgReservRefCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhitePgReservRefCB cb = new WhitePgReservRefCB();
     * cb.query().setFoo...(value);
     * int count = whitePgReservRefBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhitePgReservRef. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhitePgReservRefCB cb) {
        return facadeSelectCount(cb);
    }

    protected int facadeSelectCount(WhitePgReservRefCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhitePgReservRefCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhitePgReservRefCB cb) { // called by selectPage(cb)
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
     * WhitePgReservRefCB cb = new WhitePgReservRefCB();
     * cb.query().setFoo...(value);
     * WhitePgReservRef whitePgReservRef = whitePgReservRefBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (whitePgReservRef != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = whitePgReservRef.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhitePgReservRef. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhitePgReservRef selectEntity(WhitePgReservRefCB cb) {
        return facadeSelectEntity(cb);
    }

    protected WhitePgReservRef facadeSelectEntity(WhitePgReservRefCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhitePgReservRef> ENTITY doSelectEntity(WhitePgReservRefCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, WhitePgReservRefCB>() {
            public List<ENTITY> callbackSelectList(WhitePgReservRefCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    protected <ENTITY extends WhitePgReservRef> OptionalEntity<ENTITY> doSelectOptionalEntity(WhitePgReservRefCB cb, Class<ENTITY> tp) {
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
     * WhitePgReservRefCB cb = new WhitePgReservRefCB();
     * cb.query().setFoo...(value);
     * WhitePgReservRef whitePgReservRef = whitePgReservRefBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whitePgReservRef.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhitePgReservRef. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhitePgReservRef selectEntityWithDeletedCheck(WhitePgReservRefCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    protected WhitePgReservRef facadeSelectEntityWithDeletedCheck(WhitePgReservRefCB cb) {
        return doSelectEntityWithDeletedCheck(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhitePgReservRef> ENTITY doSelectEntityWithDeletedCheck(WhitePgReservRefCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhitePgReservRefCB>() {
            public List<ENTITY> callbackSelectList(WhitePgReservRefCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return facadeSelectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param refId : PK, NotNull, INT(10). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhitePgReservRef selectByPKValue(Integer refId) {
        return facadeSelectByPKValue(refId);
    }

    protected WhitePgReservRef facadeSelectByPKValue(Integer refId) {
        return doSelectByPK(refId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhitePgReservRef> ENTITY doSelectByPK(Integer refId, Class<ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(refId), tp);
    }

    protected <ENTITY extends WhitePgReservRef> OptionalEntity<ENTITY> doSelectOptionalByPK(Integer refId, Class<ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(refId, tp), refId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param refId : PK, NotNull, INT(10). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhitePgReservRef selectByPKValueWithDeletedCheck(Integer refId) {
        return doSelectByPKWithDeletedCheck(refId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhitePgReservRef> ENTITY doSelectByPKWithDeletedCheck(Integer refId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(refId), tp);
    }

    protected WhitePgReservRefCB xprepareCBAsPK(Integer refId) {
        assertObjectNotNull("refId", refId);
        return newConditionBean().acceptPK(refId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhitePgReservRefCB cb = new WhitePgReservRefCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhitePgReservRef&gt; whitePgReservRefList = whitePgReservRefBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhitePgReservRef whitePgReservRef : whitePgReservRefList) {
     *     ... = whitePgReservRef.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhitePgReservRef. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhitePgReservRef> selectList(WhitePgReservRefCB cb) {
        return facadeSelectList(cb);
    }

    protected ListResultBean<WhitePgReservRef> facadeSelectList(WhitePgReservRefCB cb) {
        return doSelectList(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhitePgReservRef> ListResultBean<ENTITY> doSelectList(WhitePgReservRefCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, WhitePgReservRefCB>() {
            public List<ENTITY> callbackSelectList(WhitePgReservRefCB lcb, Class<ENTITY> ltp) { return delegateSelectList(lcb, ltp); } });
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
     * WhitePgReservRefCB cb = new WhitePgReservRefCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhitePgReservRef&gt; page = whitePgReservRefBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhitePgReservRef whitePgReservRef : page) {
     *     ... = whitePgReservRef.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhitePgReservRef. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhitePgReservRef> selectPage(WhitePgReservRefCB cb) {
        return facadeSelectPage(cb);
    }

    protected PagingResultBean<WhitePgReservRef> facadeSelectPage(WhitePgReservRefCB cb) {
        return doSelectPage(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhitePgReservRef> PagingResultBean<ENTITY> doSelectPage(WhitePgReservRefCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, WhitePgReservRefCB>() {
            public int callbackSelectCount(WhitePgReservRefCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhitePgReservRefCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * WhitePgReservRefCB cb = new WhitePgReservRefCB();
     * cb.query().setFoo...(value);
     * whitePgReservRefBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhitePgReservRef&gt;() {
     *     public void handle(WhitePgReservRef entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhitePgReservRef. (NotNull)
     * @param entityRowHandler The handler of entity row of WhitePgReservRef. (NotNull)
     */
    public void selectCursor(WhitePgReservRefCB cb, EntityRowHandler<WhitePgReservRef> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    protected void facadeSelectCursor(WhitePgReservRefCB cb, EntityRowHandler<WhitePgReservRef> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhitePgReservRef> void doSelectCursor(WhitePgReservRefCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, WhitePgReservRefCB>() {
            public void callbackSelectCursor(WhitePgReservRefCB lcb, EntityRowHandler<ENTITY> lhandler, Class<ENTITY> ltp) { delegateSelectCursor(lcb, lhandler, ltp); }
            public List<ENTITY> callbackSelectList(WhitePgReservRefCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whitePgReservRefBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhitePgReservRefCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhitePgReservRefCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    protected <RESULT> HpSLSFunction<WhitePgReservRefCB, RESULT> facadeScalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newConditionBean());
    }

    protected <RESULT, CB extends WhitePgReservRefCB> HpSLSFunction<CB, RESULT> doScalarSelect(final Class<RESULT> tp, final CB cb) {
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
     * @param whitePgReservRefList The entity list of whitePgReservRef. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhitePgReservRef> whitePgReservRefList, ReferrerLoaderHandler<LoaderOfWhitePgReservRef> handler) {
        xassLRArg(whitePgReservRefList, handler);
        handler.handle(new LoaderOfWhitePgReservRef().ready(whitePgReservRefList, _behaviorSelector));
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
     * @param whitePgReservRef The entity of whitePgReservRef. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhitePgReservRef whitePgReservRef, ReferrerLoaderHandler<LoaderOfWhitePgReservRef> handler) {
        xassLRArg(whitePgReservRef, handler);
        handler.handle(new LoaderOfWhitePgReservRef().ready(xnewLRAryLs(whitePgReservRef), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'WhitePgReserv'.
     * @param whitePgReservRefList The list of whitePgReservRef. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhitePgReserv> pulloutWhitePgReserv(List<WhitePgReservRef> whitePgReservRefList) {
        return helpPulloutInternally(whitePgReservRefList, new InternalPulloutCallback<WhitePgReservRef, WhitePgReserv>() {
            public WhitePgReserv getFr(WhitePgReservRef et)
            { return et.getWhitePgReserv(); }
            public boolean hasRf() { return true; }
            public void setRfLs(WhitePgReserv et, List<WhitePgReservRef> ls)
            { et.setWhitePgReservRefList(ls); }
        });
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key refId.
     * @param whitePgReservRefList The list of whitePgReservRef. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractRefIdList(List<WhitePgReservRef> whitePgReservRefList) {
        return helpExtractListInternally(whitePgReservRefList, new InternalExtractCallback<WhitePgReservRef, Integer>() {
            public Integer getCV(WhitePgReservRef et) { return et.getRefId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhitePgReservRef whitePgReservRef = new WhitePgReservRef();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whitePgReservRef.setFoo...(value);
     * whitePgReservRef.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whitePgReservRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whitePgReservRef.set...;</span>
     * whitePgReservRefBhv.<span style="color: #DD4747">insert</span>(whitePgReservRef);
     * ... = whitePgReservRef.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whitePgReservRef The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhitePgReservRef whitePgReservRef) {
        doInsert(whitePgReservRef, null);
    }

    protected void doInsert(WhitePgReservRef et, InsertOption<WhitePgReservRefCB> op) {
        assertObjectNotNull("whitePgReservRef", et);
        prepareInsertOption(op);
        delegateInsert(et, op);
    }

    protected void prepareInsertOption(InsertOption<WhitePgReservRefCB> op) {
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
     * WhitePgReservRef whitePgReservRef = new WhitePgReservRef();
     * whitePgReservRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whitePgReservRef.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whitePgReservRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whitePgReservRef.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whitePgReservRef.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whitePgReservRefBhv.<span style="color: #DD4747">update</span>(whitePgReservRef);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whitePgReservRef The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhitePgReservRef whitePgReservRef) {
        doUpdate(whitePgReservRef, null);
    }

    protected void doUpdate(WhitePgReservRef et, final UpdateOption<WhitePgReservRefCB> op) {
        assertObjectNotNull("whitePgReservRef", et);
        prepareUpdateOption(op);
        helpUpdateInternally(et, new InternalUpdateCallback<WhitePgReservRef>() {
            public int callbackDelegateUpdate(WhitePgReservRef let) { return delegateUpdate(let, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhitePgReservRefCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) { op.resolveSelfSpecification(createCBForVaryingUpdate()); }
        if (op.hasSpecifiedUpdateColumn()) { op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate()); }
    }

    protected WhitePgReservRefCB createCBForVaryingUpdate()
    { WhitePgReservRefCB cb = newConditionBean(); cb.xsetupForVaryingUpdate(); return cb; }

    protected WhitePgReservRefCB createCBForSpecifiedUpdate()
    { WhitePgReservRefCB cb = newConditionBean(); cb.xsetupForSpecifiedUpdate(); return cb; }

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
     * @param whitePgReservRef The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhitePgReservRef whitePgReservRef) {
        doInsertOrUpdate(whitePgReservRef, null, null);
    }

    protected void doInsertOrUpdate(WhitePgReservRef et, final InsertOption<WhitePgReservRefCB> iop, final UpdateOption<WhitePgReservRefCB> uop) {
        assertObjectNotNull("whitePgReservRef", et);
        helpInsertOrUpdateInternally(et, new InternalInsertOrUpdateCallback<WhitePgReservRef, WhitePgReservRefCB>() {
            public void callbackInsert(WhitePgReservRef let) { doInsert(let, iop); }
            public void callbackUpdate(WhitePgReservRef let) { doUpdate(let, uop); }
            public WhitePgReservRefCB callbackNewMyConditionBean() { return newConditionBean(); }
            public int callbackSelectCount(WhitePgReservRefCB cb) { return selectCount(cb); }
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
     * WhitePgReservRef whitePgReservRef = new WhitePgReservRef();
     * whitePgReservRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whitePgReservRef.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whitePgReservRefBhv.<span style="color: #DD4747">delete</span>(whitePgReservRef);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whitePgReservRef The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhitePgReservRef whitePgReservRef) {
        doDelete(whitePgReservRef, null);
    }

    protected void doDelete(WhitePgReservRef et, final DeleteOption<WhitePgReservRefCB> op) {
        assertObjectNotNull("whitePgReservRef", et);
        prepareDeleteOption(op);
        helpDeleteInternally(et, new InternalDeleteCallback<WhitePgReservRef>() {
            public int callbackDelegateDelete(WhitePgReservRef let) { return delegateDelete(let, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhitePgReservRefCB> op)
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
     *     WhitePgReservRef whitePgReservRef = new WhitePgReservRef();
     *     whitePgReservRef.setFooName("foo");
     *     if (...) {
     *         whitePgReservRef.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whitePgReservRefList.add(whitePgReservRef);
     * }
     * whitePgReservRefBhv.<span style="color: #DD4747">batchInsert</span>(whitePgReservRefList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whitePgReservRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhitePgReservRef> whitePgReservRefList) {
        return doBatchInsert(whitePgReservRefList, null);
    }

    protected int[] doBatchInsert(List<WhitePgReservRef> ls, InsertOption<WhitePgReservRefCB> op) {
        assertObjectNotNull("whitePgReservRefList", ls);
        InsertOption<WhitePgReservRefCB> rlop; if (op != null) { rlop = op; } else { rlop = createPlainInsertOption(); }
        prepareBatchInsertOption(ls, rlop); // required
        return delegateBatchInsert(ls, rlop);
    }

    protected void prepareBatchInsertOption(List<WhitePgReservRef> ls, InsertOption<WhitePgReservRefCB> op) {
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
     *     WhitePgReservRef whitePgReservRef = new WhitePgReservRef();
     *     whitePgReservRef.setFooName("foo");
     *     if (...) {
     *         whitePgReservRef.setFooPrice(123);
     *     } else {
     *         whitePgReservRef.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whitePgReservRef.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whitePgReservRefList.add(whitePgReservRef);
     * }
     * whitePgReservRefBhv.<span style="color: #DD4747">batchUpdate</span>(whitePgReservRefList);
     * </pre>
     * @param whitePgReservRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhitePgReservRef> whitePgReservRefList) {
        return doBatchUpdate(whitePgReservRefList, null);
    }

    protected int[] doBatchUpdate(List<WhitePgReservRef> ls, UpdateOption<WhitePgReservRefCB> op) {
        assertObjectNotNull("whitePgReservRefList", ls);
        UpdateOption<WhitePgReservRefCB> rlop; if (op != null) { rlop = op; } else { rlop = createPlainUpdateOption(); }
        prepareBatchUpdateOption(ls, rlop); // required
        return delegateBatchUpdate(ls, rlop);
    }

    protected void prepareBatchUpdateOption(List<WhitePgReservRef> ls, UpdateOption<WhitePgReservRefCB> op) {
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
     * whitePgReservRefBhv.<span style="color: #DD4747">batchUpdate</span>(whitePgReservRefList, new SpecifyQuery<WhitePgReservRefCB>() {
     *     public void specify(WhitePgReservRefCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whitePgReservRefBhv.<span style="color: #DD4747">batchUpdate</span>(whitePgReservRefList, new SpecifyQuery<WhitePgReservRefCB>() {
     *     public void specify(WhitePgReservRefCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whitePgReservRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhitePgReservRef> whitePgReservRefList, SpecifyQuery<WhitePgReservRefCB> updateColumnSpec) {
        return doBatchUpdate(whitePgReservRefList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whitePgReservRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhitePgReservRef> whitePgReservRefList) {
        return doBatchDelete(whitePgReservRefList, null);
    }

    protected int[] doBatchDelete(List<WhitePgReservRef> ls, DeleteOption<WhitePgReservRefCB> op) {
        assertObjectNotNull("whitePgReservRefList", ls);
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
     * whitePgReservRefBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhitePgReservRef, WhitePgReservRefCB&gt;() {
     *     public ConditionBean setup(whitePgReservRef entity, WhitePgReservRefCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhitePgReservRef, WhitePgReservRefCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhitePgReservRef, WhitePgReservRefCB> sp, InsertOption<WhitePgReservRefCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        WhitePgReservRef et = newEntity();
        WhitePgReservRefCB cb = createCBForQueryInsert();
        return delegateQueryInsert(et, cb, sp.setup(et, cb), op);
    }

    protected WhitePgReservRefCB createCBForQueryInsert()
    { WhitePgReservRefCB cb = newConditionBean(); cb.xsetupForQueryInsert(); return cb; }

    @Override
    protected int doRangeCreate(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> setupper, InsertOption<? extends ConditionBean> op) {
        return doQueryInsert(downcast(setupper), downcast(op));
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhitePgReservRef whitePgReservRef = new WhitePgReservRef();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whitePgReservRef.setPK...(value);</span>
     * whitePgReservRef.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whitePgReservRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whitePgReservRef.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whitePgReservRef.setVersionNo(value);</span>
     * WhitePgReservRefCB cb = new WhitePgReservRefCB();
     * cb.query().setFoo...(value);
     * whitePgReservRefBhv.<span style="color: #DD4747">queryUpdate</span>(whitePgReservRef, cb);
     * </pre>
     * @param whitePgReservRef The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhitePgReservRef. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhitePgReservRef whitePgReservRef, WhitePgReservRefCB cb) {
        return doQueryUpdate(whitePgReservRef, cb, null);
    }

    protected int doQueryUpdate(WhitePgReservRef et, WhitePgReservRefCB cb, UpdateOption<WhitePgReservRefCB> op) {
        assertObjectNotNull("whitePgReservRef", et); assertCBStateValid(cb);
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
     * WhitePgReservRefCB cb = new WhitePgReservRefCB();
     * cb.query().setFoo...(value);
     * whitePgReservRefBhv.<span style="color: #DD4747">queryDelete</span>(whitePgReservRef, cb);
     * </pre>
     * @param cb The condition-bean of WhitePgReservRef. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhitePgReservRefCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhitePgReservRefCB cb, DeleteOption<WhitePgReservRefCB> op) {
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
     * WhitePgReservRef whitePgReservRef = new WhitePgReservRef();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whitePgReservRef.setFoo...(value);
     * whitePgReservRef.setBar...(value);
     * InsertOption<WhitePgReservRefCB> option = new InsertOption<WhitePgReservRefCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whitePgReservRefBhv.<span style="color: #DD4747">varyingInsert</span>(whitePgReservRef, option);
     * ... = whitePgReservRef.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whitePgReservRef The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhitePgReservRef whitePgReservRef, InsertOption<WhitePgReservRefCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whitePgReservRef, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhitePgReservRef whitePgReservRef = new WhitePgReservRef();
     * whitePgReservRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whitePgReservRef.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whitePgReservRef.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhitePgReservRefCB&gt; option = new UpdateOption&lt;WhitePgReservRefCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhitePgReservRefCB&gt;() {
     *         public void specify(WhitePgReservRefCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whitePgReservRefBhv.<span style="color: #DD4747">varyingUpdate</span>(whitePgReservRef, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whitePgReservRef The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhitePgReservRef whitePgReservRef, UpdateOption<WhitePgReservRefCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whitePgReservRef, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whitePgReservRef The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhitePgReservRef whitePgReservRef, InsertOption<WhitePgReservRefCB> insertOption, UpdateOption<WhitePgReservRefCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdate(whitePgReservRef, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whitePgReservRef The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhitePgReservRef whitePgReservRef, DeleteOption<WhitePgReservRefCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whitePgReservRef, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whitePgReservRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhitePgReservRef> whitePgReservRefList, InsertOption<WhitePgReservRefCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whitePgReservRefList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whitePgReservRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhitePgReservRef> whitePgReservRefList, UpdateOption<WhitePgReservRefCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whitePgReservRefList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whitePgReservRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhitePgReservRef> whitePgReservRefList, DeleteOption<WhitePgReservRefCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whitePgReservRefList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhitePgReservRef, WhitePgReservRefCB> setupper, InsertOption<WhitePgReservRefCB> option) {
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
     * WhitePgReservRef whitePgReservRef = new WhitePgReservRef();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whitePgReservRef.setPK...(value);</span>
     * whitePgReservRef.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whitePgReservRef.setVersionNo(value);</span>
     * WhitePgReservRefCB cb = new WhitePgReservRefCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhitePgReservRefCB&gt; option = new UpdateOption&lt;WhitePgReservRefCB&gt;();
     * option.self(new SpecifyQuery&lt;WhitePgReservRefCB&gt;() {
     *     public void specify(WhitePgReservRefCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whitePgReservRefBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whitePgReservRef, cb, option);
     * </pre>
     * @param whitePgReservRef The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhitePgReservRef. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhitePgReservRef whitePgReservRef, WhitePgReservRefCB cb, UpdateOption<WhitePgReservRefCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whitePgReservRef, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhitePgReservRef. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhitePgReservRefCB cb, DeleteOption<WhitePgReservRefCB> option) {
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
    public OutsideSqlBasicExecutor<WhitePgReservRefBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhitePgReservRefCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhitePgReservRefCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhitePgReservRef> void delegateSelectCursor(WhitePgReservRefCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends WhitePgReservRef> List<ENTITY> delegateSelectList(WhitePgReservRefCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhitePgReservRef et, InsertOption<WhitePgReservRefCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(WhitePgReservRef et, UpdateOption<WhitePgReservRefCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(WhitePgReservRef et, UpdateOption<WhitePgReservRefCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(WhitePgReservRef et, DeleteOption<WhitePgReservRefCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(WhitePgReservRef et, DeleteOption<WhitePgReservRefCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<WhitePgReservRef> ls, InsertOption<WhitePgReservRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhitePgReservRef> ls, UpdateOption<WhitePgReservRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhitePgReservRef> ls, UpdateOption<WhitePgReservRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhitePgReservRef> ls, DeleteOption<WhitePgReservRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhitePgReservRef> ls, DeleteOption<WhitePgReservRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhitePgReservRef et, WhitePgReservRefCB inCB, ConditionBean resCB, InsertOption<WhitePgReservRefCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhitePgReservRef et, WhitePgReservRefCB cb, UpdateOption<WhitePgReservRefCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(WhitePgReservRefCB cb, DeleteOption<WhitePgReservRefCB> op)
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
    protected Class<WhitePgReservRef> typeOfSelectedEntity()
    { return WhitePgReservRef.class; }

    protected WhitePgReservRef downcast(Entity et)
    { return helpEntityDowncastInternally(et, WhitePgReservRef.class); }

    protected WhitePgReservRefCB downcast(ConditionBean cb)
    { return helpConditionBeanDowncastInternally(cb, WhitePgReservRefCB.class); }

    @SuppressWarnings("unchecked")
    protected List<WhitePgReservRef> downcast(List<? extends Entity> ls)
    { return (List<WhitePgReservRef>)ls; }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhitePgReservRefCB> downcast(InsertOption<? extends ConditionBean> op)
    { return (InsertOption<WhitePgReservRefCB>)op; }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhitePgReservRefCB> downcast(UpdateOption<? extends ConditionBean> op)
    { return (UpdateOption<WhitePgReservRefCB>)op; }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhitePgReservRefCB> downcast(DeleteOption<? extends ConditionBean> op)
    { return (DeleteOption<WhitePgReservRefCB>)op; }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhitePgReservRef, WhitePgReservRefCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp)
    { return (QueryInsertSetupper<WhitePgReservRef, WhitePgReservRefCB>)sp; }
}
