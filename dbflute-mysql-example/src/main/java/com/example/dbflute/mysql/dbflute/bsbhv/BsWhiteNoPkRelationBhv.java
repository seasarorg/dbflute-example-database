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
 * The behavior of (VIEW)WHITE_NO_PK_RELATION as VIEW. <br />
 * <pre>
 * [primary key]
 *     
 *
 * [column]
 *     PRODUCT_ID, PRODUCT_NAME, PRODUCT_HANDLE_CODE, PRODUCT_STATUS_CODE, LATEST_PURCHASE_DATETIME
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
public abstract class BsWhiteNoPkRelationBhv extends AbstractBehaviorReadable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_no_pk_relation"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public DBMeta getDBMeta() { return WhiteNoPkRelationDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteNoPkRelationDbm getMyDBMeta() { return WhiteNoPkRelationDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhiteNoPkRelation newEntity() { return new WhiteNoPkRelation(); }

    /** {@inheritDoc} */
    public WhiteNoPkRelationCB newConditionBean() { return new WhiteNoPkRelationCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteNoPkRelation newMyEntity() { return new WhiteNoPkRelation(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteNoPkRelationCB newMyConditionBean() { return new WhiteNoPkRelationCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteNoPkRelationCB cb = new WhiteNoPkRelationCB();
     * cb.query().setFoo...(value);
     * int count = whiteNoPkRelationBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteNoPkRelation. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteNoPkRelationCB cb) {
        return facadeSelectCount(cb);
    }

    protected int facadeSelectCount(WhiteNoPkRelationCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteNoPkRelationCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteNoPkRelationCB cb) { // called by selectPage(cb)
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
     * WhiteNoPkRelationCB cb = new WhiteNoPkRelationCB();
     * cb.query().setFoo...(value);
     * WhiteNoPkRelation whiteNoPkRelation = whiteNoPkRelationBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (whiteNoPkRelation != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = whiteNoPkRelation.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteNoPkRelation. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteNoPkRelation selectEntity(WhiteNoPkRelationCB cb) {
        return facadeSelectEntity(cb);
    }

    protected WhiteNoPkRelation facadeSelectEntity(WhiteNoPkRelationCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteNoPkRelation> ENTITY doSelectEntity(WhiteNoPkRelationCB cb, Class<ENTITY> tp) {
        return helpSelectEntityInternally(cb, tp);
    }

    protected <ENTITY extends WhiteNoPkRelation> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteNoPkRelationCB cb, Class<ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * WhiteNoPkRelationCB cb = new WhiteNoPkRelationCB();
     * cb.query().setFoo...(value);
     * WhiteNoPkRelation whiteNoPkRelation = whiteNoPkRelationBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteNoPkRelation.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteNoPkRelation. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteNoPkRelation selectEntityWithDeletedCheck(WhiteNoPkRelationCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    protected WhiteNoPkRelation facadeSelectEntityWithDeletedCheck(WhiteNoPkRelationCB cb) {
        return doSelectEntityWithDeletedCheck(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteNoPkRelation> ENTITY doSelectEntityWithDeletedCheck(WhiteNoPkRelationCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp);
    }

    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) { return facadeSelectEntityWithDeletedCheck(downcast(cb)); }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteNoPkRelationCB cb = new WhiteNoPkRelationCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteNoPkRelation&gt; whiteNoPkRelationList = whiteNoPkRelationBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteNoPkRelation whiteNoPkRelation : whiteNoPkRelationList) {
     *     ... = whiteNoPkRelation.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteNoPkRelation. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteNoPkRelation> selectList(WhiteNoPkRelationCB cb) {
        return facadeSelectList(cb);
    }

    protected ListResultBean<WhiteNoPkRelation> facadeSelectList(WhiteNoPkRelationCB cb) {
        return doSelectList(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteNoPkRelation> ListResultBean<ENTITY> doSelectList(WhiteNoPkRelationCB cb, Class<ENTITY> tp) {
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
     * WhiteNoPkRelationCB cb = new WhiteNoPkRelationCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteNoPkRelation&gt; page = whiteNoPkRelationBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteNoPkRelation whiteNoPkRelation : page) {
     *     ... = whiteNoPkRelation.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteNoPkRelation. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteNoPkRelation> selectPage(WhiteNoPkRelationCB cb) {
        return facadeSelectPage(cb);
    }

    protected PagingResultBean<WhiteNoPkRelation> facadeSelectPage(WhiteNoPkRelationCB cb) {
        return doSelectPage(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteNoPkRelation> PagingResultBean<ENTITY> doSelectPage(WhiteNoPkRelationCB cb, Class<ENTITY> tp) {
        return helpSelectPageInternally(cb, tp);
    }

    protected PagingResultBean<? extends Entity> doReadPage(ConditionBean cb) { return facadeSelectPage(downcast(cb)); }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteNoPkRelationCB cb = new WhiteNoPkRelationCB();
     * cb.query().setFoo...(value);
     * whiteNoPkRelationBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteNoPkRelation&gt;() {
     *     public void handle(WhiteNoPkRelation entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteNoPkRelation. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteNoPkRelation. (NotNull)
     */
    public void selectCursor(WhiteNoPkRelationCB cb, EntityRowHandler<WhiteNoPkRelation> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    protected void facadeSelectCursor(WhiteNoPkRelationCB cb, EntityRowHandler<WhiteNoPkRelation> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteNoPkRelation> void doSelectCursor(WhiteNoPkRelationCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
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
     * whiteNoPkRelationBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteNoPkRelationCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhiteNoPkRelationCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    protected <RESULT> HpSLSFunction<WhiteNoPkRelationCB, RESULT> facadeScalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newConditionBean());
    }

    protected <RESULT, CB extends WhiteNoPkRelationCB> HpSLSFunction<CB, RESULT> doScalarSelect(final Class<RESULT> tp, final CB cb) {
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
     * @param whiteNoPkRelationList The entity list of whiteNoPkRelation. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhiteNoPkRelation> whiteNoPkRelationList, ReferrerLoaderHandler<LoaderOfWhiteNoPkRelation> handler) {
        xassLRArg(whiteNoPkRelationList, handler);
        handler.handle(new LoaderOfWhiteNoPkRelation().ready(whiteNoPkRelationList, _behaviorSelector));
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
     * @param whiteNoPkRelation The entity of whiteNoPkRelation. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhiteNoPkRelation whiteNoPkRelation, ReferrerLoaderHandler<LoaderOfWhiteNoPkRelation> handler) {
        xassLRArg(whiteNoPkRelation, handler);
        handler.handle(new LoaderOfWhiteNoPkRelation().ready(xnewLRAryLs(whiteNoPkRelation), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============

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
    public OutsideSqlBasicExecutor<WhiteNoPkRelationBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    protected Class<WhiteNoPkRelation> typeOfSelectedEntity() { return WhiteNoPkRelation.class; }
    protected WhiteNoPkRelation downcast(Entity et) { return helpEntityDowncastInternally(et, WhiteNoPkRelation.class); }
    protected WhiteNoPkRelationCB downcast(ConditionBean cb) { return helpConditionBeanDowncastInternally(cb, WhiteNoPkRelationCB.class); }
    @SuppressWarnings("unchecked")
    protected List<WhiteNoPkRelation> downcast(List<? extends Entity> ls) { return (List<WhiteNoPkRelation>)ls; }
}
