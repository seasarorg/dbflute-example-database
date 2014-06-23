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
 * The behavior of WHITE_UQ_FK_WITHOUT_PK_REF as TABLE. <br />
 * <pre>
 * [primary key]
 *     
 *
 * [column]
 *     UQ_FK_REF_ID, FK_TO_UQ_CODE
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
 *     white_uq_fk_without_pk
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     whiteUqFkWithoutPk
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteUqFkWithoutPkRefBhv extends AbstractBehaviorReadable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_uq_fk_without_pk_ref"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public DBMeta getDBMeta() { return WhiteUqFkWithoutPkRefDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteUqFkWithoutPkRefDbm getMyDBMeta() { return WhiteUqFkWithoutPkRefDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhiteUqFkWithoutPkRef newEntity() { return new WhiteUqFkWithoutPkRef(); }

    /** {@inheritDoc} */
    public WhiteUqFkWithoutPkRefCB newConditionBean() { return new WhiteUqFkWithoutPkRefCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteUqFkWithoutPkRef newMyEntity() { return new WhiteUqFkWithoutPkRef(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteUqFkWithoutPkRefCB newMyConditionBean() { return new WhiteUqFkWithoutPkRefCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteUqFkWithoutPkRefCB cb = new WhiteUqFkWithoutPkRefCB();
     * cb.query().setFoo...(value);
     * int count = whiteUqFkWithoutPkRefBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteUqFkWithoutPkRef. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteUqFkWithoutPkRefCB cb) {
        return facadeSelectCount(cb);
    }

    protected int facadeSelectCount(WhiteUqFkWithoutPkRefCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteUqFkWithoutPkRefCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteUqFkWithoutPkRefCB cb) { // called by selectPage(cb)
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
     * WhiteUqFkWithoutPkRefCB cb = new WhiteUqFkWithoutPkRefCB();
     * cb.query().setFoo...(value);
     * WhiteUqFkWithoutPkRef whiteUqFkWithoutPkRef = whiteUqFkWithoutPkRefBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (whiteUqFkWithoutPkRef != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = whiteUqFkWithoutPkRef.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteUqFkWithoutPkRef. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteUqFkWithoutPkRef selectEntity(WhiteUqFkWithoutPkRefCB cb) {
        return facadeSelectEntity(cb);
    }

    protected WhiteUqFkWithoutPkRef facadeSelectEntity(WhiteUqFkWithoutPkRefCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteUqFkWithoutPkRef> ENTITY doSelectEntity(WhiteUqFkWithoutPkRefCB cb, Class<ENTITY> tp) {
        return helpSelectEntityInternally(cb, tp);
    }

    protected <ENTITY extends WhiteUqFkWithoutPkRef> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteUqFkWithoutPkRefCB cb, Class<ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * WhiteUqFkWithoutPkRefCB cb = new WhiteUqFkWithoutPkRefCB();
     * cb.query().setFoo...(value);
     * WhiteUqFkWithoutPkRef whiteUqFkWithoutPkRef = whiteUqFkWithoutPkRefBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteUqFkWithoutPkRef.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteUqFkWithoutPkRef. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteUqFkWithoutPkRef selectEntityWithDeletedCheck(WhiteUqFkWithoutPkRefCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    protected WhiteUqFkWithoutPkRef facadeSelectEntityWithDeletedCheck(WhiteUqFkWithoutPkRefCB cb) {
        return doSelectEntityWithDeletedCheck(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteUqFkWithoutPkRef> ENTITY doSelectEntityWithDeletedCheck(WhiteUqFkWithoutPkRefCB cb, Class<ENTITY> tp) {
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
     * WhiteUqFkWithoutPkRefCB cb = new WhiteUqFkWithoutPkRefCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteUqFkWithoutPkRef&gt; whiteUqFkWithoutPkRefList = whiteUqFkWithoutPkRefBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteUqFkWithoutPkRef whiteUqFkWithoutPkRef : whiteUqFkWithoutPkRefList) {
     *     ... = whiteUqFkWithoutPkRef.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteUqFkWithoutPkRef. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteUqFkWithoutPkRef> selectList(WhiteUqFkWithoutPkRefCB cb) {
        return facadeSelectList(cb);
    }

    protected ListResultBean<WhiteUqFkWithoutPkRef> facadeSelectList(WhiteUqFkWithoutPkRefCB cb) {
        return doSelectList(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteUqFkWithoutPkRef> ListResultBean<ENTITY> doSelectList(WhiteUqFkWithoutPkRefCB cb, Class<ENTITY> tp) {
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
     * WhiteUqFkWithoutPkRefCB cb = new WhiteUqFkWithoutPkRefCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteUqFkWithoutPkRef&gt; page = whiteUqFkWithoutPkRefBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteUqFkWithoutPkRef whiteUqFkWithoutPkRef : page) {
     *     ... = whiteUqFkWithoutPkRef.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteUqFkWithoutPkRef. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteUqFkWithoutPkRef> selectPage(WhiteUqFkWithoutPkRefCB cb) {
        return facadeSelectPage(cb);
    }

    protected PagingResultBean<WhiteUqFkWithoutPkRef> facadeSelectPage(WhiteUqFkWithoutPkRefCB cb) {
        return doSelectPage(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteUqFkWithoutPkRef> PagingResultBean<ENTITY> doSelectPage(WhiteUqFkWithoutPkRefCB cb, Class<ENTITY> tp) {
        return helpSelectPageInternally(cb, tp);
    }

    protected PagingResultBean<? extends Entity> doReadPage(ConditionBean cb) { return facadeSelectPage(downcast(cb)); }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteUqFkWithoutPkRefCB cb = new WhiteUqFkWithoutPkRefCB();
     * cb.query().setFoo...(value);
     * whiteUqFkWithoutPkRefBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteUqFkWithoutPkRef&gt;() {
     *     public void handle(WhiteUqFkWithoutPkRef entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteUqFkWithoutPkRef. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteUqFkWithoutPkRef. (NotNull)
     */
    public void selectCursor(WhiteUqFkWithoutPkRefCB cb, EntityRowHandler<WhiteUqFkWithoutPkRef> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    protected void facadeSelectCursor(WhiteUqFkWithoutPkRefCB cb, EntityRowHandler<WhiteUqFkWithoutPkRef> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteUqFkWithoutPkRef> void doSelectCursor(WhiteUqFkWithoutPkRefCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
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
     * whiteUqFkWithoutPkRefBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteUqFkWithoutPkRefCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhiteUqFkWithoutPkRefCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    protected <RESULT> HpSLSFunction<WhiteUqFkWithoutPkRefCB, RESULT> facadeScalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newConditionBean());
    }

    protected <RESULT, CB extends WhiteUqFkWithoutPkRefCB> HpSLSFunction<CB, RESULT> doScalarSelect(final Class<RESULT> tp, final CB cb) {
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
     * @param whiteUqFkWithoutPkRefList The entity list of whiteUqFkWithoutPkRef. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhiteUqFkWithoutPkRef> whiteUqFkWithoutPkRefList, ReferrerLoaderHandler<LoaderOfWhiteUqFkWithoutPkRef> handler) {
        xassLRArg(whiteUqFkWithoutPkRefList, handler);
        handler.handle(new LoaderOfWhiteUqFkWithoutPkRef().ready(whiteUqFkWithoutPkRefList, _behaviorSelector));
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
     * @param whiteUqFkWithoutPkRef The entity of whiteUqFkWithoutPkRef. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhiteUqFkWithoutPkRef whiteUqFkWithoutPkRef, ReferrerLoaderHandler<LoaderOfWhiteUqFkWithoutPkRef> handler) {
        xassLRArg(whiteUqFkWithoutPkRef, handler);
        handler.handle(new LoaderOfWhiteUqFkWithoutPkRef().ready(xnewLRAryLs(whiteUqFkWithoutPkRef), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'WhiteUqFkWithoutPk'.
     * @param whiteUqFkWithoutPkRefList The list of whiteUqFkWithoutPkRef. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteUqFkWithoutPk> pulloutWhiteUqFkWithoutPk(List<WhiteUqFkWithoutPkRef> whiteUqFkWithoutPkRefList)
    { return helpPulloutInternally(whiteUqFkWithoutPkRefList, "whiteUqFkWithoutPk"); }

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
    public OutsideSqlBasicExecutor<WhiteUqFkWithoutPkRefBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    protected Class<WhiteUqFkWithoutPkRef> typeOfSelectedEntity() { return WhiteUqFkWithoutPkRef.class; }
    protected WhiteUqFkWithoutPkRef downcast(Entity et) { return helpEntityDowncastInternally(et, WhiteUqFkWithoutPkRef.class); }
    protected WhiteUqFkWithoutPkRefCB downcast(ConditionBean cb) { return helpConditionBeanDowncastInternally(cb, WhiteUqFkWithoutPkRefCB.class); }
    @SuppressWarnings("unchecked")
    protected List<WhiteUqFkWithoutPkRef> downcast(List<? extends Entity> ls) { return (List<WhiteUqFkWithoutPkRef>)ls; }
}
