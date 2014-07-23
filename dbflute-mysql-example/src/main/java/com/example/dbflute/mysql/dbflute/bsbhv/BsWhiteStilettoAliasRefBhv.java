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
 * The behavior of WHITE_STILETTO_ALIAS_REF as TABLE. <br />
 * <pre>
 * [primary key]
 *     REF_ID
 *
 * [column]
 *     REF_ID, FOO0, FOO_1, FOO2, FOO3, FOO_4, STILETTO_ALIAS_ID
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
 *     white_stiletto_alias
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     whiteStilettoAlias
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteStilettoAliasRefBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_stiletto_alias_ref"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public DBMeta getDBMeta() { return WhiteStilettoAliasRefDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteStilettoAliasRefDbm getMyDBMeta() { return WhiteStilettoAliasRefDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhiteStilettoAliasRef newEntity() { return new WhiteStilettoAliasRef(); }

    /** {@inheritDoc} */
    public WhiteStilettoAliasRefCB newConditionBean() { return new WhiteStilettoAliasRefCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteStilettoAliasRef newMyEntity() { return new WhiteStilettoAliasRef(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteStilettoAliasRefCB newMyConditionBean() { return new WhiteStilettoAliasRefCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteStilettoAliasRefCB cb = new WhiteStilettoAliasRefCB();
     * cb.query().setFoo...(value);
     * int count = whiteStilettoAliasRefBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteStilettoAliasRef. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteStilettoAliasRefCB cb) {
        return facadeSelectCount(cb);
    }

    protected int facadeSelectCount(WhiteStilettoAliasRefCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteStilettoAliasRefCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteStilettoAliasRefCB cb) { // called by selectPage(cb)
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
     * WhiteStilettoAliasRefCB cb = new WhiteStilettoAliasRefCB();
     * cb.query().setFoo...(value);
     * WhiteStilettoAliasRef whiteStilettoAliasRef = whiteStilettoAliasRefBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (whiteStilettoAliasRef != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = whiteStilettoAliasRef.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteStilettoAliasRef. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteStilettoAliasRef selectEntity(WhiteStilettoAliasRefCB cb) {
        return facadeSelectEntity(cb);
    }

    protected WhiteStilettoAliasRef facadeSelectEntity(WhiteStilettoAliasRefCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteStilettoAliasRef> ENTITY doSelectEntity(WhiteStilettoAliasRefCB cb, Class<ENTITY> tp) {
        return helpSelectEntityInternally(cb, tp);
    }

    protected <ENTITY extends WhiteStilettoAliasRef> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteStilettoAliasRefCB cb, Class<ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * WhiteStilettoAliasRefCB cb = new WhiteStilettoAliasRefCB();
     * cb.query().setFoo...(value);
     * WhiteStilettoAliasRef whiteStilettoAliasRef = whiteStilettoAliasRefBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteStilettoAliasRef.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteStilettoAliasRef. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteStilettoAliasRef selectEntityWithDeletedCheck(WhiteStilettoAliasRefCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    protected WhiteStilettoAliasRef facadeSelectEntityWithDeletedCheck(WhiteStilettoAliasRefCB cb) {
        return doSelectEntityWithDeletedCheck(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteStilettoAliasRef> ENTITY doSelectEntityWithDeletedCheck(WhiteStilettoAliasRefCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp);
    }

    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) { return facadeSelectEntityWithDeletedCheck(downcast(cb)); }

    /**
     * Select the entity by the primary-key value.
     * @param refId : PK, NotNull, INT(10). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteStilettoAliasRef selectByPKValue(Integer refId) {
        return facadeSelectByPKValue(refId);
    }

    protected WhiteStilettoAliasRef facadeSelectByPKValue(Integer refId) {
        return doSelectByPK(refId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteStilettoAliasRef> ENTITY doSelectByPK(Integer refId, Class<ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(refId), tp);
    }

    protected <ENTITY extends WhiteStilettoAliasRef> OptionalEntity<ENTITY> doSelectOptionalByPK(Integer refId, Class<ENTITY> tp) {
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
    public WhiteStilettoAliasRef selectByPKValueWithDeletedCheck(Integer refId) {
        return doSelectByPKWithDeletedCheck(refId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteStilettoAliasRef> ENTITY doSelectByPKWithDeletedCheck(Integer refId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(refId), tp);
    }

    protected WhiteStilettoAliasRefCB xprepareCBAsPK(Integer refId) {
        assertObjectNotNull("refId", refId);
        return newConditionBean().acceptPK(refId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteStilettoAliasRefCB cb = new WhiteStilettoAliasRefCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteStilettoAliasRef&gt; whiteStilettoAliasRefList = whiteStilettoAliasRefBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteStilettoAliasRef whiteStilettoAliasRef : whiteStilettoAliasRefList) {
     *     ... = whiteStilettoAliasRef.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteStilettoAliasRef. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteStilettoAliasRef> selectList(WhiteStilettoAliasRefCB cb) {
        return facadeSelectList(cb);
    }

    protected ListResultBean<WhiteStilettoAliasRef> facadeSelectList(WhiteStilettoAliasRefCB cb) {
        return doSelectList(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteStilettoAliasRef> ListResultBean<ENTITY> doSelectList(WhiteStilettoAliasRefCB cb, Class<ENTITY> tp) {
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
     * WhiteStilettoAliasRefCB cb = new WhiteStilettoAliasRefCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteStilettoAliasRef&gt; page = whiteStilettoAliasRefBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteStilettoAliasRef whiteStilettoAliasRef : page) {
     *     ... = whiteStilettoAliasRef.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteStilettoAliasRef. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteStilettoAliasRef> selectPage(WhiteStilettoAliasRefCB cb) {
        return facadeSelectPage(cb);
    }

    protected PagingResultBean<WhiteStilettoAliasRef> facadeSelectPage(WhiteStilettoAliasRefCB cb) {
        return doSelectPage(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteStilettoAliasRef> PagingResultBean<ENTITY> doSelectPage(WhiteStilettoAliasRefCB cb, Class<ENTITY> tp) {
        return helpSelectPageInternally(cb, tp);
    }

    protected PagingResultBean<? extends Entity> doReadPage(ConditionBean cb) { return facadeSelectPage(downcast(cb)); }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteStilettoAliasRefCB cb = new WhiteStilettoAliasRefCB();
     * cb.query().setFoo...(value);
     * whiteStilettoAliasRefBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteStilettoAliasRef&gt;() {
     *     public void handle(WhiteStilettoAliasRef entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteStilettoAliasRef. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteStilettoAliasRef. (NotNull)
     */
    public void selectCursor(WhiteStilettoAliasRefCB cb, EntityRowHandler<WhiteStilettoAliasRef> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    protected void facadeSelectCursor(WhiteStilettoAliasRefCB cb, EntityRowHandler<WhiteStilettoAliasRef> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteStilettoAliasRef> void doSelectCursor(WhiteStilettoAliasRefCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
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
     * whiteStilettoAliasRefBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteStilettoAliasRefCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhiteStilettoAliasRefCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    protected <RESULT> HpSLSFunction<WhiteStilettoAliasRefCB, RESULT> facadeScalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newConditionBean());
    }

    protected <RESULT, CB extends WhiteStilettoAliasRefCB> HpSLSFunction<CB, RESULT> doScalarSelect(final Class<RESULT> tp, final CB cb) {
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
     * @param whiteStilettoAliasRefList The entity list of whiteStilettoAliasRef. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhiteStilettoAliasRef> whiteStilettoAliasRefList, ReferrerLoaderHandler<LoaderOfWhiteStilettoAliasRef> handler) {
        xassLRArg(whiteStilettoAliasRefList, handler);
        handler.handle(new LoaderOfWhiteStilettoAliasRef().ready(whiteStilettoAliasRefList, _behaviorSelector));
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
     * @param whiteStilettoAliasRef The entity of whiteStilettoAliasRef. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhiteStilettoAliasRef whiteStilettoAliasRef, ReferrerLoaderHandler<LoaderOfWhiteStilettoAliasRef> handler) {
        xassLRArg(whiteStilettoAliasRef, handler);
        handler.handle(new LoaderOfWhiteStilettoAliasRef().ready(xnewLRAryLs(whiteStilettoAliasRef), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'WhiteStilettoAlias'.
     * @param whiteStilettoAliasRefList The list of whiteStilettoAliasRef. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteStilettoAlias> pulloutWhiteStilettoAlias(List<WhiteStilettoAliasRef> whiteStilettoAliasRefList)
    { return helpPulloutInternally(whiteStilettoAliasRefList, "whiteStilettoAlias"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key refId.
     * @param whiteStilettoAliasRefList The list of whiteStilettoAliasRef. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractRefIdList(List<WhiteStilettoAliasRef> whiteStilettoAliasRefList)
    { return helpExtractListInternally(whiteStilettoAliasRefList, "refId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteStilettoAliasRef whiteStilettoAliasRef = new WhiteStilettoAliasRef();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteStilettoAliasRef.setFoo...(value);
     * whiteStilettoAliasRef.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteStilettoAliasRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteStilettoAliasRef.set...;</span>
     * whiteStilettoAliasRefBhv.<span style="color: #DD4747">insert</span>(whiteStilettoAliasRef);
     * ... = whiteStilettoAliasRef.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteStilettoAliasRef The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteStilettoAliasRef whiteStilettoAliasRef) {
        doInsert(whiteStilettoAliasRef, null);
    }

    protected void doInsert(WhiteStilettoAliasRef et, InsertOption<WhiteStilettoAliasRefCB> op) {
        assertObjectNotNull("whiteStilettoAliasRef", et); prepareInsertOption(op); delegateInsert(et, op);
    }

    protected void prepareInsertOption(InsertOption<WhiteStilettoAliasRefCB> op) {
        if (op == null) { return; } assertInsertOptionStatus(op);
        if (op.hasSpecifiedInsertColumn()) { op.resolveInsertColumnSpecification(createCBForSpecifiedUpdate()); }
    }

    protected void doCreate(Entity et, InsertOption<? extends ConditionBean> op) { doInsert(downcast(et), downcast(op)); }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteStilettoAliasRef whiteStilettoAliasRef = new WhiteStilettoAliasRef();
     * whiteStilettoAliasRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteStilettoAliasRef.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteStilettoAliasRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteStilettoAliasRef.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteStilettoAliasRef.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteStilettoAliasRefBhv.<span style="color: #DD4747">update</span>(whiteStilettoAliasRef);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteStilettoAliasRef The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhiteStilettoAliasRef whiteStilettoAliasRef) {
        doUpdate(whiteStilettoAliasRef, null);
    }

    protected void doUpdate(WhiteStilettoAliasRef et, UpdateOption<WhiteStilettoAliasRefCB> op) {
        assertObjectNotNull("whiteStilettoAliasRef", et); prepareUpdateOption(op); helpUpdateInternally(et, op);
    }

    protected void prepareUpdateOption(UpdateOption<WhiteStilettoAliasRefCB> op) {
        if (op == null) { return; } assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) { op.resolveSelfSpecification(createCBForVaryingUpdate()); }
        if (op.hasSpecifiedUpdateColumn()) { op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate()); }
    }

    protected WhiteStilettoAliasRefCB createCBForVaryingUpdate()
    { WhiteStilettoAliasRefCB cb = newConditionBean(); cb.xsetupForVaryingUpdate(); return cb; }

    protected WhiteStilettoAliasRefCB createCBForSpecifiedUpdate()
    { WhiteStilettoAliasRefCB cb = newConditionBean(); cb.xsetupForSpecifiedUpdate(); return cb; }

    protected void doModify(Entity et, UpdateOption<? extends ConditionBean> op) { doUpdate(downcast(et), downcast(op)); }

    protected void doModifyNonstrict(Entity et, UpdateOption<? extends ConditionBean> op)
    { doModify(et, op); }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param whiteStilettoAliasRef The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteStilettoAliasRef whiteStilettoAliasRef) {
        doInsertOrUpdate(whiteStilettoAliasRef, null, null);
    }

    protected void doInsertOrUpdate(WhiteStilettoAliasRef et, InsertOption<WhiteStilettoAliasRefCB> iop, UpdateOption<WhiteStilettoAliasRefCB> uop) {
        assertObjectNotNull("whiteStilettoAliasRef", et); helpInsertOrUpdateInternally(et, iop, uop);
    }

    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop)
    { doInsertOrUpdate(downcast(et), downcast(iop), downcast(uop)); }

    protected void doCreateOrModifyNonstrict(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop)
    { doCreateOrModify(et, iop, uop); }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteStilettoAliasRef whiteStilettoAliasRef = new WhiteStilettoAliasRef();
     * whiteStilettoAliasRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteStilettoAliasRef.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteStilettoAliasRefBhv.<span style="color: #DD4747">delete</span>(whiteStilettoAliasRef);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteStilettoAliasRef The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteStilettoAliasRef whiteStilettoAliasRef) {
        doDelete(whiteStilettoAliasRef, null);
    }

    protected void doDelete(WhiteStilettoAliasRef et, final DeleteOption<WhiteStilettoAliasRefCB> op) {
        assertObjectNotNull("whiteStilettoAliasRef", et); prepareDeleteOption(op); helpDeleteInternally(et, op);
    }

    protected void prepareDeleteOption(DeleteOption<WhiteStilettoAliasRefCB> op) { if (op != null) { assertDeleteOptionStatus(op); } }

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
     *     WhiteStilettoAliasRef whiteStilettoAliasRef = new WhiteStilettoAliasRef();
     *     whiteStilettoAliasRef.setFooName("foo");
     *     if (...) {
     *         whiteStilettoAliasRef.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteStilettoAliasRefList.add(whiteStilettoAliasRef);
     * }
     * whiteStilettoAliasRefBhv.<span style="color: #DD4747">batchInsert</span>(whiteStilettoAliasRefList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteStilettoAliasRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteStilettoAliasRef> whiteStilettoAliasRefList) {
        return doBatchInsert(whiteStilettoAliasRefList, null);
    }

    protected int[] doBatchInsert(List<WhiteStilettoAliasRef> ls, InsertOption<WhiteStilettoAliasRefCB> op) {
        assertObjectNotNull("whiteStilettoAliasRefList", ls);
        InsertOption<WhiteStilettoAliasRefCB> rlop; if (op != null) { rlop = op; } else { rlop = createPlainInsertOption(); }
        prepareBatchInsertOption(ls, rlop); // required
        return delegateBatchInsert(ls, rlop);
    }

    protected void prepareBatchInsertOption(List<WhiteStilettoAliasRef> ls, InsertOption<WhiteStilettoAliasRefCB> op) {
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
     *     WhiteStilettoAliasRef whiteStilettoAliasRef = new WhiteStilettoAliasRef();
     *     whiteStilettoAliasRef.setFooName("foo");
     *     if (...) {
     *         whiteStilettoAliasRef.setFooPrice(123);
     *     } else {
     *         whiteStilettoAliasRef.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteStilettoAliasRef.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteStilettoAliasRefList.add(whiteStilettoAliasRef);
     * }
     * whiteStilettoAliasRefBhv.<span style="color: #DD4747">batchUpdate</span>(whiteStilettoAliasRefList);
     * </pre>
     * @param whiteStilettoAliasRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteStilettoAliasRef> whiteStilettoAliasRefList) {
        return doBatchUpdate(whiteStilettoAliasRefList, null);
    }

    protected int[] doBatchUpdate(List<WhiteStilettoAliasRef> ls, UpdateOption<WhiteStilettoAliasRefCB> op) {
        assertObjectNotNull("whiteStilettoAliasRefList", ls);
        UpdateOption<WhiteStilettoAliasRefCB> rlop; if (op != null) { rlop = op; } else { rlop = createPlainUpdateOption(); }
        prepareBatchUpdateOption(ls, rlop); // required
        return delegateBatchUpdate(ls, rlop);
    }

    protected void prepareBatchUpdateOption(List<WhiteStilettoAliasRef> ls, UpdateOption<WhiteStilettoAliasRefCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(ls);
        prepareUpdateOption(op);
    }

    protected int[] doLumpModify(List<Entity> ls, UpdateOption<? extends ConditionBean> op) { return doBatchUpdate(downcast(ls), downcast(op)); }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * whiteStilettoAliasRefBhv.<span style="color: #DD4747">batchUpdate</span>(whiteStilettoAliasRefList, new SpecifyQuery<WhiteStilettoAliasRefCB>() {
     *     public void specify(WhiteStilettoAliasRefCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteStilettoAliasRefBhv.<span style="color: #DD4747">batchUpdate</span>(whiteStilettoAliasRefList, new SpecifyQuery<WhiteStilettoAliasRefCB>() {
     *     public void specify(WhiteStilettoAliasRefCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteStilettoAliasRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteStilettoAliasRef> whiteStilettoAliasRefList, SpecifyQuery<WhiteStilettoAliasRefCB> updateColumnSpec) {
        return doBatchUpdate(whiteStilettoAliasRefList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op)
    { return doLumpModify(ls, op); }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteStilettoAliasRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteStilettoAliasRef> whiteStilettoAliasRefList) {
        return doBatchDelete(whiteStilettoAliasRefList, null);
    }

    protected int[] doBatchDelete(List<WhiteStilettoAliasRef> ls, DeleteOption<WhiteStilettoAliasRefCB> op) {
        assertObjectNotNull("whiteStilettoAliasRefList", ls);
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
     * whiteStilettoAliasRefBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteStilettoAliasRef, WhiteStilettoAliasRefCB&gt;() {
     *     public ConditionBean setup(whiteStilettoAliasRef entity, WhiteStilettoAliasRefCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteStilettoAliasRef, WhiteStilettoAliasRefCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteStilettoAliasRef, WhiteStilettoAliasRefCB> sp, InsertOption<WhiteStilettoAliasRefCB> op) {
        assertObjectNotNull("setupper", sp); prepareInsertOption(op);
        WhiteStilettoAliasRef et = newEntity(); WhiteStilettoAliasRefCB cb = createCBForQueryInsert();
        return delegateQueryInsert(et, cb, sp.setup(et, cb), op);
    }

    protected WhiteStilettoAliasRefCB createCBForQueryInsert()
    { WhiteStilettoAliasRefCB cb = newConditionBean(); cb.xsetupForQueryInsert(); return cb; }

    protected int doRangeCreate(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> setupper, InsertOption<? extends ConditionBean> op)
    { return doQueryInsert(downcast(setupper), downcast(op)); }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteStilettoAliasRef whiteStilettoAliasRef = new WhiteStilettoAliasRef();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteStilettoAliasRef.setPK...(value);</span>
     * whiteStilettoAliasRef.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteStilettoAliasRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteStilettoAliasRef.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteStilettoAliasRef.setVersionNo(value);</span>
     * WhiteStilettoAliasRefCB cb = new WhiteStilettoAliasRefCB();
     * cb.query().setFoo...(value);
     * whiteStilettoAliasRefBhv.<span style="color: #DD4747">queryUpdate</span>(whiteStilettoAliasRef, cb);
     * </pre>
     * @param whiteStilettoAliasRef The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteStilettoAliasRef. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteStilettoAliasRef whiteStilettoAliasRef, WhiteStilettoAliasRefCB cb) {
        return doQueryUpdate(whiteStilettoAliasRef, cb, null);
    }

    protected int doQueryUpdate(WhiteStilettoAliasRef et, WhiteStilettoAliasRefCB cb, UpdateOption<WhiteStilettoAliasRefCB> op) {
        assertObjectNotNull("whiteStilettoAliasRef", et); assertCBStateValid(cb); prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(et, cb, op) : 0;
    }

    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op)
    { return doQueryUpdate(downcast(et), downcast(cb), downcast(op)); }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteStilettoAliasRefCB cb = new WhiteStilettoAliasRefCB();
     * cb.query().setFoo...(value);
     * whiteStilettoAliasRefBhv.<span style="color: #DD4747">queryDelete</span>(whiteStilettoAliasRef, cb);
     * </pre>
     * @param cb The condition-bean of WhiteStilettoAliasRef. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteStilettoAliasRefCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteStilettoAliasRefCB cb, DeleteOption<WhiteStilettoAliasRefCB> op) {
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
     * WhiteStilettoAliasRef whiteStilettoAliasRef = new WhiteStilettoAliasRef();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteStilettoAliasRef.setFoo...(value);
     * whiteStilettoAliasRef.setBar...(value);
     * InsertOption<WhiteStilettoAliasRefCB> option = new InsertOption<WhiteStilettoAliasRefCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteStilettoAliasRefBhv.<span style="color: #DD4747">varyingInsert</span>(whiteStilettoAliasRef, option);
     * ... = whiteStilettoAliasRef.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteStilettoAliasRef The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteStilettoAliasRef whiteStilettoAliasRef, InsertOption<WhiteStilettoAliasRefCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteStilettoAliasRef, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteStilettoAliasRef whiteStilettoAliasRef = new WhiteStilettoAliasRef();
     * whiteStilettoAliasRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteStilettoAliasRef.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteStilettoAliasRef.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteStilettoAliasRefCB&gt; option = new UpdateOption&lt;WhiteStilettoAliasRefCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteStilettoAliasRefCB&gt;() {
     *         public void specify(WhiteStilettoAliasRefCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteStilettoAliasRefBhv.<span style="color: #DD4747">varyingUpdate</span>(whiteStilettoAliasRef, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteStilettoAliasRef The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteStilettoAliasRef whiteStilettoAliasRef, UpdateOption<WhiteStilettoAliasRefCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteStilettoAliasRef, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteStilettoAliasRef The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteStilettoAliasRef whiteStilettoAliasRef, InsertOption<WhiteStilettoAliasRefCB> insertOption, UpdateOption<WhiteStilettoAliasRefCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdate(whiteStilettoAliasRef, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteStilettoAliasRef The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteStilettoAliasRef whiteStilettoAliasRef, DeleteOption<WhiteStilettoAliasRefCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteStilettoAliasRef, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteStilettoAliasRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteStilettoAliasRef> whiteStilettoAliasRefList, InsertOption<WhiteStilettoAliasRefCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteStilettoAliasRefList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteStilettoAliasRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteStilettoAliasRef> whiteStilettoAliasRefList, UpdateOption<WhiteStilettoAliasRefCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteStilettoAliasRefList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteStilettoAliasRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteStilettoAliasRef> whiteStilettoAliasRefList, DeleteOption<WhiteStilettoAliasRefCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteStilettoAliasRefList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteStilettoAliasRef, WhiteStilettoAliasRefCB> setupper, InsertOption<WhiteStilettoAliasRefCB> option) {
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
     * WhiteStilettoAliasRef whiteStilettoAliasRef = new WhiteStilettoAliasRef();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteStilettoAliasRef.setPK...(value);</span>
     * whiteStilettoAliasRef.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteStilettoAliasRef.setVersionNo(value);</span>
     * WhiteStilettoAliasRefCB cb = new WhiteStilettoAliasRefCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteStilettoAliasRefCB&gt; option = new UpdateOption&lt;WhiteStilettoAliasRefCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteStilettoAliasRefCB&gt;() {
     *     public void specify(WhiteStilettoAliasRefCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteStilettoAliasRefBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteStilettoAliasRef, cb, option);
     * </pre>
     * @param whiteStilettoAliasRef The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteStilettoAliasRef. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteStilettoAliasRef whiteStilettoAliasRef, WhiteStilettoAliasRefCB cb, UpdateOption<WhiteStilettoAliasRefCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteStilettoAliasRef, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteStilettoAliasRef. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteStilettoAliasRefCB cb, DeleteOption<WhiteStilettoAliasRefCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteStilettoAliasRefBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    protected Class<WhiteStilettoAliasRef> typeOfSelectedEntity() { return WhiteStilettoAliasRef.class; }
    protected WhiteStilettoAliasRef downcast(Entity et) { return helpEntityDowncastInternally(et, WhiteStilettoAliasRef.class); }
    protected WhiteStilettoAliasRefCB downcast(ConditionBean cb) { return helpConditionBeanDowncastInternally(cb, WhiteStilettoAliasRefCB.class); }
    @SuppressWarnings("unchecked")
    protected List<WhiteStilettoAliasRef> downcast(List<? extends Entity> ls) { return (List<WhiteStilettoAliasRef>)ls; }
    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteStilettoAliasRefCB> downcast(InsertOption<? extends ConditionBean> op) { return (InsertOption<WhiteStilettoAliasRefCB>)op; }
    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteStilettoAliasRefCB> downcast(UpdateOption<? extends ConditionBean> op) { return (UpdateOption<WhiteStilettoAliasRefCB>)op; }
    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteStilettoAliasRefCB> downcast(DeleteOption<? extends ConditionBean> op) { return (DeleteOption<WhiteStilettoAliasRefCB>)op; }
    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteStilettoAliasRef, WhiteStilettoAliasRefCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp)
    { return (QueryInsertSetupper<WhiteStilettoAliasRef, WhiteStilettoAliasRefCB>)sp; }
}