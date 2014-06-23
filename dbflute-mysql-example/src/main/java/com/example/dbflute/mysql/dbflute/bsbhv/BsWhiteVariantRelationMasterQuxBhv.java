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
 * The behavior of WHITE_VARIANT_RELATION_MASTER_QUX as TABLE. <br />
 * <pre>
 * [primary key]
 *     MASTER_QUX_ID
 *
 * [column]
 *     MASTER_QUX_ID, MASTER_QUX_NAME, QUX_TYPE_CODE
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
public abstract class BsWhiteVariantRelationMasterQuxBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_variant_relation_master_qux"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public DBMeta getDBMeta() { return WhiteVariantRelationMasterQuxDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteVariantRelationMasterQuxDbm getMyDBMeta() { return WhiteVariantRelationMasterQuxDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhiteVariantRelationMasterQux newEntity() { return new WhiteVariantRelationMasterQux(); }

    /** {@inheritDoc} */
    public WhiteVariantRelationMasterQuxCB newConditionBean() { return new WhiteVariantRelationMasterQuxCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteVariantRelationMasterQux newMyEntity() { return new WhiteVariantRelationMasterQux(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteVariantRelationMasterQuxCB newMyConditionBean() { return new WhiteVariantRelationMasterQuxCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteVariantRelationMasterQuxCB cb = new WhiteVariantRelationMasterQuxCB();
     * cb.query().setFoo...(value);
     * int count = whiteVariantRelationMasterQuxBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationMasterQux. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteVariantRelationMasterQuxCB cb) {
        return facadeSelectCount(cb);
    }

    protected int facadeSelectCount(WhiteVariantRelationMasterQuxCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteVariantRelationMasterQuxCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteVariantRelationMasterQuxCB cb) { // called by selectPage(cb)
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
     * WhiteVariantRelationMasterQuxCB cb = new WhiteVariantRelationMasterQuxCB();
     * cb.query().setFoo...(value);
     * WhiteVariantRelationMasterQux whiteVariantRelationMasterQux = whiteVariantRelationMasterQuxBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (whiteVariantRelationMasterQux != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = whiteVariantRelationMasterQux.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationMasterQux. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteVariantRelationMasterQux selectEntity(WhiteVariantRelationMasterQuxCB cb) {
        return facadeSelectEntity(cb);
    }

    protected WhiteVariantRelationMasterQux facadeSelectEntity(WhiteVariantRelationMasterQuxCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteVariantRelationMasterQux> ENTITY doSelectEntity(WhiteVariantRelationMasterQuxCB cb, Class<ENTITY> tp) {
        return helpSelectEntityInternally(cb, tp);
    }

    protected <ENTITY extends WhiteVariantRelationMasterQux> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteVariantRelationMasterQuxCB cb, Class<ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * WhiteVariantRelationMasterQuxCB cb = new WhiteVariantRelationMasterQuxCB();
     * cb.query().setFoo...(value);
     * WhiteVariantRelationMasterQux whiteVariantRelationMasterQux = whiteVariantRelationMasterQuxBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteVariantRelationMasterQux.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationMasterQux. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteVariantRelationMasterQux selectEntityWithDeletedCheck(WhiteVariantRelationMasterQuxCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    protected WhiteVariantRelationMasterQux facadeSelectEntityWithDeletedCheck(WhiteVariantRelationMasterQuxCB cb) {
        return doSelectEntityWithDeletedCheck(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteVariantRelationMasterQux> ENTITY doSelectEntityWithDeletedCheck(WhiteVariantRelationMasterQuxCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp);
    }

    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) { return facadeSelectEntityWithDeletedCheck(downcast(cb)); }

    /**
     * Select the entity by the primary-key value.
     * @param masterQuxId : PK, NotNull, BIGINT(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteVariantRelationMasterQux selectByPKValue(Long masterQuxId) {
        return facadeSelectByPKValue(masterQuxId);
    }

    protected WhiteVariantRelationMasterQux facadeSelectByPKValue(Long masterQuxId) {
        return doSelectByPK(masterQuxId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteVariantRelationMasterQux> ENTITY doSelectByPK(Long masterQuxId, Class<ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(masterQuxId), tp);
    }

    protected <ENTITY extends WhiteVariantRelationMasterQux> OptionalEntity<ENTITY> doSelectOptionalByPK(Long masterQuxId, Class<ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(masterQuxId, tp), masterQuxId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param masterQuxId : PK, NotNull, BIGINT(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteVariantRelationMasterQux selectByPKValueWithDeletedCheck(Long masterQuxId) {
        return doSelectByPKWithDeletedCheck(masterQuxId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteVariantRelationMasterQux> ENTITY doSelectByPKWithDeletedCheck(Long masterQuxId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(masterQuxId), tp);
    }

    protected WhiteVariantRelationMasterQuxCB xprepareCBAsPK(Long masterQuxId) {
        assertObjectNotNull("masterQuxId", masterQuxId);
        return newConditionBean().acceptPK(masterQuxId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteVariantRelationMasterQuxCB cb = new WhiteVariantRelationMasterQuxCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteVariantRelationMasterQux&gt; whiteVariantRelationMasterQuxList = whiteVariantRelationMasterQuxBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteVariantRelationMasterQux whiteVariantRelationMasterQux : whiteVariantRelationMasterQuxList) {
     *     ... = whiteVariantRelationMasterQux.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationMasterQux. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteVariantRelationMasterQux> selectList(WhiteVariantRelationMasterQuxCB cb) {
        return facadeSelectList(cb);
    }

    protected ListResultBean<WhiteVariantRelationMasterQux> facadeSelectList(WhiteVariantRelationMasterQuxCB cb) {
        return doSelectList(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteVariantRelationMasterQux> ListResultBean<ENTITY> doSelectList(WhiteVariantRelationMasterQuxCB cb, Class<ENTITY> tp) {
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
     * WhiteVariantRelationMasterQuxCB cb = new WhiteVariantRelationMasterQuxCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteVariantRelationMasterQux&gt; page = whiteVariantRelationMasterQuxBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteVariantRelationMasterQux whiteVariantRelationMasterQux : page) {
     *     ... = whiteVariantRelationMasterQux.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationMasterQux. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteVariantRelationMasterQux> selectPage(WhiteVariantRelationMasterQuxCB cb) {
        return facadeSelectPage(cb);
    }

    protected PagingResultBean<WhiteVariantRelationMasterQux> facadeSelectPage(WhiteVariantRelationMasterQuxCB cb) {
        return doSelectPage(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteVariantRelationMasterQux> PagingResultBean<ENTITY> doSelectPage(WhiteVariantRelationMasterQuxCB cb, Class<ENTITY> tp) {
        return helpSelectPageInternally(cb, tp);
    }

    protected PagingResultBean<? extends Entity> doReadPage(ConditionBean cb) { return facadeSelectPage(downcast(cb)); }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteVariantRelationMasterQuxCB cb = new WhiteVariantRelationMasterQuxCB();
     * cb.query().setFoo...(value);
     * whiteVariantRelationMasterQuxBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteVariantRelationMasterQux&gt;() {
     *     public void handle(WhiteVariantRelationMasterQux entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationMasterQux. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteVariantRelationMasterQux. (NotNull)
     */
    public void selectCursor(WhiteVariantRelationMasterQuxCB cb, EntityRowHandler<WhiteVariantRelationMasterQux> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    protected void facadeSelectCursor(WhiteVariantRelationMasterQuxCB cb, EntityRowHandler<WhiteVariantRelationMasterQux> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteVariantRelationMasterQux> void doSelectCursor(WhiteVariantRelationMasterQuxCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
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
     * whiteVariantRelationMasterQuxBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteVariantRelationMasterQuxCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhiteVariantRelationMasterQuxCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    protected <RESULT> HpSLSFunction<WhiteVariantRelationMasterQuxCB, RESULT> facadeScalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newConditionBean());
    }

    protected <RESULT, CB extends WhiteVariantRelationMasterQuxCB> HpSLSFunction<CB, RESULT> doScalarSelect(final Class<RESULT> tp, final CB cb) {
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
     * @param whiteVariantRelationMasterQuxList The entity list of whiteVariantRelationMasterQux. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhiteVariantRelationMasterQux> whiteVariantRelationMasterQuxList, ReferrerLoaderHandler<LoaderOfWhiteVariantRelationMasterQux> handler) {
        xassLRArg(whiteVariantRelationMasterQuxList, handler);
        handler.handle(new LoaderOfWhiteVariantRelationMasterQux().ready(whiteVariantRelationMasterQuxList, _behaviorSelector));
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
     * @param whiteVariantRelationMasterQux The entity of whiteVariantRelationMasterQux. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhiteVariantRelationMasterQux whiteVariantRelationMasterQux, ReferrerLoaderHandler<LoaderOfWhiteVariantRelationMasterQux> handler) {
        xassLRArg(whiteVariantRelationMasterQux, handler);
        handler.handle(new LoaderOfWhiteVariantRelationMasterQux().ready(xnewLRAryLs(whiteVariantRelationMasterQux), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key masterQuxId.
     * @param whiteVariantRelationMasterQuxList The list of whiteVariantRelationMasterQux. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractMasterQuxIdList(List<WhiteVariantRelationMasterQux> whiteVariantRelationMasterQuxList)
    { return helpExtractListInternally(whiteVariantRelationMasterQuxList, "masterQuxId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteVariantRelationMasterQux whiteVariantRelationMasterQux = new WhiteVariantRelationMasterQux();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteVariantRelationMasterQux.setFoo...(value);
     * whiteVariantRelationMasterQux.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterQux.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterQux.set...;</span>
     * whiteVariantRelationMasterQuxBhv.<span style="color: #DD4747">insert</span>(whiteVariantRelationMasterQux);
     * ... = whiteVariantRelationMasterQux.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteVariantRelationMasterQux The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteVariantRelationMasterQux whiteVariantRelationMasterQux) {
        doInsert(whiteVariantRelationMasterQux, null);
    }

    protected void doInsert(WhiteVariantRelationMasterQux et, InsertOption<WhiteVariantRelationMasterQuxCB> op) {
        assertObjectNotNull("whiteVariantRelationMasterQux", et); prepareInsertOption(op); delegateInsert(et, op);
    }

    protected void prepareInsertOption(InsertOption<WhiteVariantRelationMasterQuxCB> op) {
        if (op == null) { return; } assertInsertOptionStatus(op);
        if (op.hasSpecifiedInsertColumn()) { op.resolveInsertColumnSpecification(createCBForSpecifiedUpdate()); }
    }

    protected void doCreate(Entity et, InsertOption<? extends ConditionBean> op) { doInsert(downcast(et), downcast(op)); }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteVariantRelationMasterQux whiteVariantRelationMasterQux = new WhiteVariantRelationMasterQux();
     * whiteVariantRelationMasterQux.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteVariantRelationMasterQux.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterQux.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterQux.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteVariantRelationMasterQux.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteVariantRelationMasterQuxBhv.<span style="color: #DD4747">update</span>(whiteVariantRelationMasterQux);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteVariantRelationMasterQux The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhiteVariantRelationMasterQux whiteVariantRelationMasterQux) {
        doUpdate(whiteVariantRelationMasterQux, null);
    }

    protected void doUpdate(WhiteVariantRelationMasterQux et, UpdateOption<WhiteVariantRelationMasterQuxCB> op) {
        assertObjectNotNull("whiteVariantRelationMasterQux", et); prepareUpdateOption(op); helpUpdateInternally(et, op);
    }

    protected void prepareUpdateOption(UpdateOption<WhiteVariantRelationMasterQuxCB> op) {
        if (op == null) { return; } assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) { op.resolveSelfSpecification(createCBForVaryingUpdate()); }
        if (op.hasSpecifiedUpdateColumn()) { op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate()); }
    }

    protected WhiteVariantRelationMasterQuxCB createCBForVaryingUpdate()
    { WhiteVariantRelationMasterQuxCB cb = newConditionBean(); cb.xsetupForVaryingUpdate(); return cb; }

    protected WhiteVariantRelationMasterQuxCB createCBForSpecifiedUpdate()
    { WhiteVariantRelationMasterQuxCB cb = newConditionBean(); cb.xsetupForSpecifiedUpdate(); return cb; }

    protected void doModify(Entity et, UpdateOption<? extends ConditionBean> op) { doUpdate(downcast(et), downcast(op)); }

    protected void doModifyNonstrict(Entity et, UpdateOption<? extends ConditionBean> op)
    { doModify(et, op); }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param whiteVariantRelationMasterQux The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteVariantRelationMasterQux whiteVariantRelationMasterQux) {
        doInsertOrUpdate(whiteVariantRelationMasterQux, null, null);
    }

    protected void doInsertOrUpdate(WhiteVariantRelationMasterQux et, InsertOption<WhiteVariantRelationMasterQuxCB> iop, UpdateOption<WhiteVariantRelationMasterQuxCB> uop) {
        assertObjectNotNull("whiteVariantRelationMasterQux", et); helpInsertOrUpdateInternally(et, iop, uop);
    }

    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop)
    { doInsertOrUpdate(downcast(et), downcast(iop), downcast(uop)); }

    protected void doCreateOrModifyNonstrict(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop)
    { doCreateOrModify(et, iop, uop); }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteVariantRelationMasterQux whiteVariantRelationMasterQux = new WhiteVariantRelationMasterQux();
     * whiteVariantRelationMasterQux.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteVariantRelationMasterQux.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteVariantRelationMasterQuxBhv.<span style="color: #DD4747">delete</span>(whiteVariantRelationMasterQux);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteVariantRelationMasterQux The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteVariantRelationMasterQux whiteVariantRelationMasterQux) {
        doDelete(whiteVariantRelationMasterQux, null);
    }

    protected void doDelete(WhiteVariantRelationMasterQux et, final DeleteOption<WhiteVariantRelationMasterQuxCB> op) {
        assertObjectNotNull("whiteVariantRelationMasterQux", et); prepareDeleteOption(op); helpDeleteInternally(et, op);
    }

    protected void prepareDeleteOption(DeleteOption<WhiteVariantRelationMasterQuxCB> op) { if (op != null) { assertDeleteOptionStatus(op); } }

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
     *     WhiteVariantRelationMasterQux whiteVariantRelationMasterQux = new WhiteVariantRelationMasterQux();
     *     whiteVariantRelationMasterQux.setFooName("foo");
     *     if (...) {
     *         whiteVariantRelationMasterQux.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteVariantRelationMasterQuxList.add(whiteVariantRelationMasterQux);
     * }
     * whiteVariantRelationMasterQuxBhv.<span style="color: #DD4747">batchInsert</span>(whiteVariantRelationMasterQuxList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteVariantRelationMasterQuxList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteVariantRelationMasterQux> whiteVariantRelationMasterQuxList) {
        return doBatchInsert(whiteVariantRelationMasterQuxList, null);
    }

    protected int[] doBatchInsert(List<WhiteVariantRelationMasterQux> ls, InsertOption<WhiteVariantRelationMasterQuxCB> op) {
        assertObjectNotNull("whiteVariantRelationMasterQuxList", ls);
        InsertOption<WhiteVariantRelationMasterQuxCB> rlop; if (op != null) { rlop = op; } else { rlop = createPlainInsertOption(); }
        prepareBatchInsertOption(ls, rlop); // required
        return delegateBatchInsert(ls, rlop);
    }

    protected void prepareBatchInsertOption(List<WhiteVariantRelationMasterQux> ls, InsertOption<WhiteVariantRelationMasterQuxCB> op) {
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
     *     WhiteVariantRelationMasterQux whiteVariantRelationMasterQux = new WhiteVariantRelationMasterQux();
     *     whiteVariantRelationMasterQux.setFooName("foo");
     *     if (...) {
     *         whiteVariantRelationMasterQux.setFooPrice(123);
     *     } else {
     *         whiteVariantRelationMasterQux.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteVariantRelationMasterQux.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteVariantRelationMasterQuxList.add(whiteVariantRelationMasterQux);
     * }
     * whiteVariantRelationMasterQuxBhv.<span style="color: #DD4747">batchUpdate</span>(whiteVariantRelationMasterQuxList);
     * </pre>
     * @param whiteVariantRelationMasterQuxList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteVariantRelationMasterQux> whiteVariantRelationMasterQuxList) {
        return doBatchUpdate(whiteVariantRelationMasterQuxList, null);
    }

    protected int[] doBatchUpdate(List<WhiteVariantRelationMasterQux> ls, UpdateOption<WhiteVariantRelationMasterQuxCB> op) {
        assertObjectNotNull("whiteVariantRelationMasterQuxList", ls);
        UpdateOption<WhiteVariantRelationMasterQuxCB> rlop; if (op != null) { rlop = op; } else { rlop = createPlainUpdateOption(); }
        prepareBatchUpdateOption(ls, rlop); // required
        return delegateBatchUpdate(ls, rlop);
    }

    protected void prepareBatchUpdateOption(List<WhiteVariantRelationMasterQux> ls, UpdateOption<WhiteVariantRelationMasterQuxCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(ls);
        prepareUpdateOption(op);
    }

    protected int[] doLumpModify(List<Entity> ls, UpdateOption<? extends ConditionBean> op) { return doBatchUpdate(downcast(ls), downcast(op)); }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * whiteVariantRelationMasterQuxBhv.<span style="color: #DD4747">batchUpdate</span>(whiteVariantRelationMasterQuxList, new SpecifyQuery<WhiteVariantRelationMasterQuxCB>() {
     *     public void specify(WhiteVariantRelationMasterQuxCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteVariantRelationMasterQuxBhv.<span style="color: #DD4747">batchUpdate</span>(whiteVariantRelationMasterQuxList, new SpecifyQuery<WhiteVariantRelationMasterQuxCB>() {
     *     public void specify(WhiteVariantRelationMasterQuxCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteVariantRelationMasterQuxList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteVariantRelationMasterQux> whiteVariantRelationMasterQuxList, SpecifyQuery<WhiteVariantRelationMasterQuxCB> updateColumnSpec) {
        return doBatchUpdate(whiteVariantRelationMasterQuxList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op)
    { return doLumpModify(ls, op); }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteVariantRelationMasterQuxList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteVariantRelationMasterQux> whiteVariantRelationMasterQuxList) {
        return doBatchDelete(whiteVariantRelationMasterQuxList, null);
    }

    protected int[] doBatchDelete(List<WhiteVariantRelationMasterQux> ls, DeleteOption<WhiteVariantRelationMasterQuxCB> op) {
        assertObjectNotNull("whiteVariantRelationMasterQuxList", ls);
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
     * whiteVariantRelationMasterQuxBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteVariantRelationMasterQux, WhiteVariantRelationMasterQuxCB&gt;() {
     *     public ConditionBean setup(whiteVariantRelationMasterQux entity, WhiteVariantRelationMasterQuxCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteVariantRelationMasterQux, WhiteVariantRelationMasterQuxCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteVariantRelationMasterQux, WhiteVariantRelationMasterQuxCB> sp, InsertOption<WhiteVariantRelationMasterQuxCB> op) {
        assertObjectNotNull("setupper", sp); prepareInsertOption(op);
        WhiteVariantRelationMasterQux et = newEntity(); WhiteVariantRelationMasterQuxCB cb = createCBForQueryInsert();
        return delegateQueryInsert(et, cb, sp.setup(et, cb), op);
    }

    protected WhiteVariantRelationMasterQuxCB createCBForQueryInsert()
    { WhiteVariantRelationMasterQuxCB cb = newConditionBean(); cb.xsetupForQueryInsert(); return cb; }

    protected int doRangeCreate(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> setupper, InsertOption<? extends ConditionBean> op)
    { return doQueryInsert(downcast(setupper), downcast(op)); }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteVariantRelationMasterQux whiteVariantRelationMasterQux = new WhiteVariantRelationMasterQux();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterQux.setPK...(value);</span>
     * whiteVariantRelationMasterQux.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterQux.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterQux.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterQux.setVersionNo(value);</span>
     * WhiteVariantRelationMasterQuxCB cb = new WhiteVariantRelationMasterQuxCB();
     * cb.query().setFoo...(value);
     * whiteVariantRelationMasterQuxBhv.<span style="color: #DD4747">queryUpdate</span>(whiteVariantRelationMasterQux, cb);
     * </pre>
     * @param whiteVariantRelationMasterQux The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteVariantRelationMasterQux. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteVariantRelationMasterQux whiteVariantRelationMasterQux, WhiteVariantRelationMasterQuxCB cb) {
        return doQueryUpdate(whiteVariantRelationMasterQux, cb, null);
    }

    protected int doQueryUpdate(WhiteVariantRelationMasterQux et, WhiteVariantRelationMasterQuxCB cb, UpdateOption<WhiteVariantRelationMasterQuxCB> op) {
        assertObjectNotNull("whiteVariantRelationMasterQux", et); assertCBStateValid(cb); prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(et, cb, op) : 0;
    }

    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op)
    { return doQueryUpdate(downcast(et), downcast(cb), downcast(op)); }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteVariantRelationMasterQuxCB cb = new WhiteVariantRelationMasterQuxCB();
     * cb.query().setFoo...(value);
     * whiteVariantRelationMasterQuxBhv.<span style="color: #DD4747">queryDelete</span>(whiteVariantRelationMasterQux, cb);
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationMasterQux. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteVariantRelationMasterQuxCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteVariantRelationMasterQuxCB cb, DeleteOption<WhiteVariantRelationMasterQuxCB> op) {
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
     * WhiteVariantRelationMasterQux whiteVariantRelationMasterQux = new WhiteVariantRelationMasterQux();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteVariantRelationMasterQux.setFoo...(value);
     * whiteVariantRelationMasterQux.setBar...(value);
     * InsertOption<WhiteVariantRelationMasterQuxCB> option = new InsertOption<WhiteVariantRelationMasterQuxCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteVariantRelationMasterQuxBhv.<span style="color: #DD4747">varyingInsert</span>(whiteVariantRelationMasterQux, option);
     * ... = whiteVariantRelationMasterQux.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteVariantRelationMasterQux The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteVariantRelationMasterQux whiteVariantRelationMasterQux, InsertOption<WhiteVariantRelationMasterQuxCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteVariantRelationMasterQux, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteVariantRelationMasterQux whiteVariantRelationMasterQux = new WhiteVariantRelationMasterQux();
     * whiteVariantRelationMasterQux.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteVariantRelationMasterQux.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteVariantRelationMasterQux.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteVariantRelationMasterQuxCB&gt; option = new UpdateOption&lt;WhiteVariantRelationMasterQuxCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteVariantRelationMasterQuxCB&gt;() {
     *         public void specify(WhiteVariantRelationMasterQuxCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteVariantRelationMasterQuxBhv.<span style="color: #DD4747">varyingUpdate</span>(whiteVariantRelationMasterQux, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteVariantRelationMasterQux The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteVariantRelationMasterQux whiteVariantRelationMasterQux, UpdateOption<WhiteVariantRelationMasterQuxCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteVariantRelationMasterQux, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteVariantRelationMasterQux The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteVariantRelationMasterQux whiteVariantRelationMasterQux, InsertOption<WhiteVariantRelationMasterQuxCB> insertOption, UpdateOption<WhiteVariantRelationMasterQuxCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdate(whiteVariantRelationMasterQux, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteVariantRelationMasterQux The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteVariantRelationMasterQux whiteVariantRelationMasterQux, DeleteOption<WhiteVariantRelationMasterQuxCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteVariantRelationMasterQux, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteVariantRelationMasterQuxList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteVariantRelationMasterQux> whiteVariantRelationMasterQuxList, InsertOption<WhiteVariantRelationMasterQuxCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteVariantRelationMasterQuxList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteVariantRelationMasterQuxList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteVariantRelationMasterQux> whiteVariantRelationMasterQuxList, UpdateOption<WhiteVariantRelationMasterQuxCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteVariantRelationMasterQuxList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteVariantRelationMasterQuxList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteVariantRelationMasterQux> whiteVariantRelationMasterQuxList, DeleteOption<WhiteVariantRelationMasterQuxCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteVariantRelationMasterQuxList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteVariantRelationMasterQux, WhiteVariantRelationMasterQuxCB> setupper, InsertOption<WhiteVariantRelationMasterQuxCB> option) {
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
     * WhiteVariantRelationMasterQux whiteVariantRelationMasterQux = new WhiteVariantRelationMasterQux();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterQux.setPK...(value);</span>
     * whiteVariantRelationMasterQux.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterQux.setVersionNo(value);</span>
     * WhiteVariantRelationMasterQuxCB cb = new WhiteVariantRelationMasterQuxCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteVariantRelationMasterQuxCB&gt; option = new UpdateOption&lt;WhiteVariantRelationMasterQuxCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteVariantRelationMasterQuxCB&gt;() {
     *     public void specify(WhiteVariantRelationMasterQuxCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteVariantRelationMasterQuxBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteVariantRelationMasterQux, cb, option);
     * </pre>
     * @param whiteVariantRelationMasterQux The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteVariantRelationMasterQux. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteVariantRelationMasterQux whiteVariantRelationMasterQux, WhiteVariantRelationMasterQuxCB cb, UpdateOption<WhiteVariantRelationMasterQuxCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteVariantRelationMasterQux, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteVariantRelationMasterQux. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteVariantRelationMasterQuxCB cb, DeleteOption<WhiteVariantRelationMasterQuxCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteVariantRelationMasterQuxBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    protected Class<WhiteVariantRelationMasterQux> typeOfSelectedEntity() { return WhiteVariantRelationMasterQux.class; }
    protected WhiteVariantRelationMasterQux downcast(Entity et) { return helpEntityDowncastInternally(et, WhiteVariantRelationMasterQux.class); }
    protected WhiteVariantRelationMasterQuxCB downcast(ConditionBean cb) { return helpConditionBeanDowncastInternally(cb, WhiteVariantRelationMasterQuxCB.class); }
    @SuppressWarnings("unchecked")
    protected List<WhiteVariantRelationMasterQux> downcast(List<? extends Entity> ls) { return (List<WhiteVariantRelationMasterQux>)ls; }
    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteVariantRelationMasterQuxCB> downcast(InsertOption<? extends ConditionBean> op) { return (InsertOption<WhiteVariantRelationMasterQuxCB>)op; }
    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteVariantRelationMasterQuxCB> downcast(UpdateOption<? extends ConditionBean> op) { return (UpdateOption<WhiteVariantRelationMasterQuxCB>)op; }
    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteVariantRelationMasterQuxCB> downcast(DeleteOption<? extends ConditionBean> op) { return (DeleteOption<WhiteVariantRelationMasterQuxCB>)op; }
    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteVariantRelationMasterQux, WhiteVariantRelationMasterQuxCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp)
    { return (QueryInsertSetupper<WhiteVariantRelationMasterQux, WhiteVariantRelationMasterQuxCB>)sp; }
}
