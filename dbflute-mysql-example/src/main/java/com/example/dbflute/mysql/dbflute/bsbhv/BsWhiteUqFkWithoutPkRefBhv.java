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
public abstract class BsWhiteUqFkWithoutPkRefBhv extends AbstractBehaviorReadable<WhiteUqFkWithoutPkRef, WhiteUqFkWithoutPkRefCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public WhiteUqFkWithoutPkRefDbm getDBMeta() { return WhiteUqFkWithoutPkRefDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteUqFkWithoutPkRefDbm getMyDBMeta() { return WhiteUqFkWithoutPkRefDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
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

    protected <ENTITY extends WhiteUqFkWithoutPkRef> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteUqFkWithoutPkRefCB cb, Class<? extends ENTITY> tp) {
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
        OutsideSqlAllFacadeExecutor<WhiteUqFkWithoutPkRefBhv> facadeExecutor = doOutsideSql();
        return facadeExecutor.xbasicExecutor(); // variable to resolve generic type
    }

    // ===================================================================================
    //                                                                         Hyper Patch
    //                                                                         ===========
    @Override
    protected <RESULT extends WhiteUqFkWithoutPkRef> org.seasar.dbflute.bhv.core.command.SelectListCBCommand<RESULT> newSelectListCBCommand() {
        return new com.example.dbflute.mysql.dbflute.allcommon.DBFluteConfig.SelectListCBCommandHyperPatch<RESULT>();
    }

    @Override
    protected <RESULT extends WhiteUqFkWithoutPkRef> org.seasar.dbflute.bhv.core.command.SelectCursorCBCommand<RESULT> newSelectCursorCBCommand() {
        return new com.example.dbflute.mysql.dbflute.allcommon.DBFluteConfig.SelectCursorCBCommandHyperPatch<RESULT>();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends WhiteUqFkWithoutPkRef> typeOfSelectedEntity() { return WhiteUqFkWithoutPkRef.class; }
    protected Class<WhiteUqFkWithoutPkRef> typeOfHandlingEntity() { return WhiteUqFkWithoutPkRef.class; }
    protected Class<WhiteUqFkWithoutPkRefCB> typeOfHandlingConditionBean() { return WhiteUqFkWithoutPkRefCB.class; }
}
