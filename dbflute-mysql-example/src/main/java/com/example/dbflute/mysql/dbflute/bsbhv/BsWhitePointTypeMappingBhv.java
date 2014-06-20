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
 * The behavior of WHITE_POINT_TYPE_MAPPING as TABLE. <br />
 * <pre>
 * [primary key]
 *     POINT_TYPE_MAPPING_ID
 *
 * [column]
 *     POINT_TYPE_MAPPING_ID, POINT_TYPE_MAPPING_MEMBER_NAME, POINT_TYPE_MAPPING_PRICE_COUNT, POINT_TYPE_MAPPING_SALE_DATE, POINT_TYPE_MAPPING_WANTED_DATETIME
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
public abstract class BsWhitePointTypeMappingBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_point_type_mapping"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public DBMeta getDBMeta() { return WhitePointTypeMappingDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhitePointTypeMappingDbm getMyDBMeta() { return WhitePointTypeMappingDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhitePointTypeMapping newEntity() { return new WhitePointTypeMapping(); }

    /** {@inheritDoc} */
    public WhitePointTypeMappingCB newConditionBean() { return new WhitePointTypeMappingCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhitePointTypeMapping newMyEntity() { return new WhitePointTypeMapping(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhitePointTypeMappingCB newMyConditionBean() { return new WhitePointTypeMappingCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhitePointTypeMappingCB cb = new WhitePointTypeMappingCB();
     * cb.query().setFoo...(value);
     * int count = whitePointTypeMappingBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhitePointTypeMapping. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhitePointTypeMappingCB cb) {
        return facadeSelectCount(cb);
    }

    protected int facadeSelectCount(WhitePointTypeMappingCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhitePointTypeMappingCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhitePointTypeMappingCB cb) { // called by selectPage(cb)
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
     * WhitePointTypeMappingCB cb = new WhitePointTypeMappingCB();
     * cb.query().setFoo...(value);
     * WhitePointTypeMapping whitePointTypeMapping = whitePointTypeMappingBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (whitePointTypeMapping != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = whitePointTypeMapping.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhitePointTypeMapping. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhitePointTypeMapping selectEntity(WhitePointTypeMappingCB cb) {
        return facadeSelectEntity(cb);
    }

    protected WhitePointTypeMapping facadeSelectEntity(WhitePointTypeMappingCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhitePointTypeMapping> ENTITY doSelectEntity(WhitePointTypeMappingCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, WhitePointTypeMappingCB>() {
            public List<ENTITY> callbackSelectList(WhitePointTypeMappingCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    protected <ENTITY extends WhitePointTypeMapping> OptionalEntity<ENTITY> doSelectOptionalEntity(WhitePointTypeMappingCB cb, Class<ENTITY> tp) {
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
     * WhitePointTypeMappingCB cb = new WhitePointTypeMappingCB();
     * cb.query().setFoo...(value);
     * WhitePointTypeMapping whitePointTypeMapping = whitePointTypeMappingBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whitePointTypeMapping.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhitePointTypeMapping. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhitePointTypeMapping selectEntityWithDeletedCheck(WhitePointTypeMappingCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    protected WhitePointTypeMapping facadeSelectEntityWithDeletedCheck(WhitePointTypeMappingCB cb) {
        return doSelectEntityWithDeletedCheck(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhitePointTypeMapping> ENTITY doSelectEntityWithDeletedCheck(WhitePointTypeMappingCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhitePointTypeMappingCB>() {
            public List<ENTITY> callbackSelectList(WhitePointTypeMappingCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return facadeSelectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param pointTypeMappingId : PK, NotNull, DECIMAL(16). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhitePointTypeMapping selectByPKValue(Long pointTypeMappingId) {
        return facadeSelectByPKValue(pointTypeMappingId);
    }

    protected WhitePointTypeMapping facadeSelectByPKValue(Long pointTypeMappingId) {
        return doSelectByPK(pointTypeMappingId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhitePointTypeMapping> ENTITY doSelectByPK(Long pointTypeMappingId, Class<ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(pointTypeMappingId), tp);
    }

    protected <ENTITY extends WhitePointTypeMapping> OptionalEntity<ENTITY> doSelectOptionalByPK(Long pointTypeMappingId, Class<ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(pointTypeMappingId, tp), pointTypeMappingId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param pointTypeMappingId : PK, NotNull, DECIMAL(16). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhitePointTypeMapping selectByPKValueWithDeletedCheck(Long pointTypeMappingId) {
        return doSelectByPKWithDeletedCheck(pointTypeMappingId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhitePointTypeMapping> ENTITY doSelectByPKWithDeletedCheck(Long pointTypeMappingId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(pointTypeMappingId), tp);
    }

    protected WhitePointTypeMappingCB xprepareCBAsPK(Long pointTypeMappingId) {
        assertObjectNotNull("pointTypeMappingId", pointTypeMappingId);
        return newConditionBean().acceptPK(pointTypeMappingId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhitePointTypeMappingCB cb = new WhitePointTypeMappingCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhitePointTypeMapping&gt; whitePointTypeMappingList = whitePointTypeMappingBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhitePointTypeMapping whitePointTypeMapping : whitePointTypeMappingList) {
     *     ... = whitePointTypeMapping.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhitePointTypeMapping. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhitePointTypeMapping> selectList(WhitePointTypeMappingCB cb) {
        return facadeSelectList(cb);
    }

    protected ListResultBean<WhitePointTypeMapping> facadeSelectList(WhitePointTypeMappingCB cb) {
        return doSelectList(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhitePointTypeMapping> ListResultBean<ENTITY> doSelectList(WhitePointTypeMappingCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, WhitePointTypeMappingCB>() {
            public List<ENTITY> callbackSelectList(WhitePointTypeMappingCB lcb, Class<ENTITY> ltp) { return delegateSelectList(lcb, ltp); } });
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
     * WhitePointTypeMappingCB cb = new WhitePointTypeMappingCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhitePointTypeMapping&gt; page = whitePointTypeMappingBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhitePointTypeMapping whitePointTypeMapping : page) {
     *     ... = whitePointTypeMapping.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhitePointTypeMapping. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhitePointTypeMapping> selectPage(WhitePointTypeMappingCB cb) {
        return facadeSelectPage(cb);
    }

    protected PagingResultBean<WhitePointTypeMapping> facadeSelectPage(WhitePointTypeMappingCB cb) {
        return doSelectPage(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhitePointTypeMapping> PagingResultBean<ENTITY> doSelectPage(WhitePointTypeMappingCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, WhitePointTypeMappingCB>() {
            public int callbackSelectCount(WhitePointTypeMappingCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhitePointTypeMappingCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * WhitePointTypeMappingCB cb = new WhitePointTypeMappingCB();
     * cb.query().setFoo...(value);
     * whitePointTypeMappingBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhitePointTypeMapping&gt;() {
     *     public void handle(WhitePointTypeMapping entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhitePointTypeMapping. (NotNull)
     * @param entityRowHandler The handler of entity row of WhitePointTypeMapping. (NotNull)
     */
    public void selectCursor(WhitePointTypeMappingCB cb, EntityRowHandler<WhitePointTypeMapping> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    protected void facadeSelectCursor(WhitePointTypeMappingCB cb, EntityRowHandler<WhitePointTypeMapping> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhitePointTypeMapping> void doSelectCursor(WhitePointTypeMappingCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, WhitePointTypeMappingCB>() {
            public void callbackSelectCursor(WhitePointTypeMappingCB lcb, EntityRowHandler<ENTITY> lhandler, Class<ENTITY> ltp) { delegateSelectCursor(lcb, lhandler, ltp); }
            public List<ENTITY> callbackSelectList(WhitePointTypeMappingCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whitePointTypeMappingBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhitePointTypeMappingCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhitePointTypeMappingCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    protected <RESULT> HpSLSFunction<WhitePointTypeMappingCB, RESULT> facadeScalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newConditionBean());
    }

    protected <RESULT, CB extends WhitePointTypeMappingCB> HpSLSFunction<CB, RESULT> doScalarSelect(final Class<RESULT> tp, final CB cb) {
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
     * @param whitePointTypeMappingList The entity list of whitePointTypeMapping. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhitePointTypeMapping> whitePointTypeMappingList, ReferrerLoaderHandler<LoaderOfWhitePointTypeMapping> handler) {
        xassLRArg(whitePointTypeMappingList, handler);
        handler.handle(new LoaderOfWhitePointTypeMapping().ready(whitePointTypeMappingList, _behaviorSelector));
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
     * @param whitePointTypeMapping The entity of whitePointTypeMapping. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhitePointTypeMapping whitePointTypeMapping, ReferrerLoaderHandler<LoaderOfWhitePointTypeMapping> handler) {
        xassLRArg(whitePointTypeMapping, handler);
        handler.handle(new LoaderOfWhitePointTypeMapping().ready(xnewLRAryLs(whitePointTypeMapping), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key pointTypeMappingId.
     * @param whitePointTypeMappingList The list of whitePointTypeMapping. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractPointTypeMappingIdList(List<WhitePointTypeMapping> whitePointTypeMappingList) {
        return helpExtractListInternally(whitePointTypeMappingList, new InternalExtractCallback<WhitePointTypeMapping, Long>() {
            public Long getCV(WhitePointTypeMapping et) { return et.getPointTypeMappingId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhitePointTypeMapping whitePointTypeMapping = new WhitePointTypeMapping();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whitePointTypeMapping.setFoo...(value);
     * whitePointTypeMapping.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whitePointTypeMapping.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whitePointTypeMapping.set...;</span>
     * whitePointTypeMappingBhv.<span style="color: #DD4747">insert</span>(whitePointTypeMapping);
     * ... = whitePointTypeMapping.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whitePointTypeMapping The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhitePointTypeMapping whitePointTypeMapping) {
        doInsert(whitePointTypeMapping, null);
    }

    protected void doInsert(WhitePointTypeMapping et, InsertOption<WhitePointTypeMappingCB> op) {
        assertObjectNotNull("whitePointTypeMapping", et);
        prepareInsertOption(op);
        delegateInsert(et, op);
    }

    protected void prepareInsertOption(InsertOption<WhitePointTypeMappingCB> op) {
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
     * WhitePointTypeMapping whitePointTypeMapping = new WhitePointTypeMapping();
     * whitePointTypeMapping.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whitePointTypeMapping.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whitePointTypeMapping.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whitePointTypeMapping.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whitePointTypeMapping.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whitePointTypeMappingBhv.<span style="color: #DD4747">update</span>(whitePointTypeMapping);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whitePointTypeMapping The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhitePointTypeMapping whitePointTypeMapping) {
        doUpdate(whitePointTypeMapping, null);
    }

    protected void doUpdate(WhitePointTypeMapping et, final UpdateOption<WhitePointTypeMappingCB> op) {
        assertObjectNotNull("whitePointTypeMapping", et);
        prepareUpdateOption(op);
        helpUpdateInternally(et, new InternalUpdateCallback<WhitePointTypeMapping>() {
            public int callbackDelegateUpdate(WhitePointTypeMapping let) { return delegateUpdate(let, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhitePointTypeMappingCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) { op.resolveSelfSpecification(createCBForVaryingUpdate()); }
        if (op.hasSpecifiedUpdateColumn()) { op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate()); }
    }

    protected WhitePointTypeMappingCB createCBForVaryingUpdate()
    { WhitePointTypeMappingCB cb = newConditionBean(); cb.xsetupForVaryingUpdate(); return cb; }

    protected WhitePointTypeMappingCB createCBForSpecifiedUpdate()
    { WhitePointTypeMappingCB cb = newConditionBean(); cb.xsetupForSpecifiedUpdate(); return cb; }

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
     * @param whitePointTypeMapping The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhitePointTypeMapping whitePointTypeMapping) {
        doInsertOrUpdate(whitePointTypeMapping, null, null);
    }

    protected void doInsertOrUpdate(WhitePointTypeMapping et, final InsertOption<WhitePointTypeMappingCB> iop, final UpdateOption<WhitePointTypeMappingCB> uop) {
        assertObjectNotNull("whitePointTypeMapping", et);
        helpInsertOrUpdateInternally(et, new InternalInsertOrUpdateCallback<WhitePointTypeMapping, WhitePointTypeMappingCB>() {
            public void callbackInsert(WhitePointTypeMapping let) { doInsert(let, iop); }
            public void callbackUpdate(WhitePointTypeMapping let) { doUpdate(let, uop); }
            public WhitePointTypeMappingCB callbackNewMyConditionBean() { return newConditionBean(); }
            public int callbackSelectCount(WhitePointTypeMappingCB cb) { return selectCount(cb); }
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
     * WhitePointTypeMapping whitePointTypeMapping = new WhitePointTypeMapping();
     * whitePointTypeMapping.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whitePointTypeMapping.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whitePointTypeMappingBhv.<span style="color: #DD4747">delete</span>(whitePointTypeMapping);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whitePointTypeMapping The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhitePointTypeMapping whitePointTypeMapping) {
        doDelete(whitePointTypeMapping, null);
    }

    protected void doDelete(WhitePointTypeMapping et, final DeleteOption<WhitePointTypeMappingCB> op) {
        assertObjectNotNull("whitePointTypeMapping", et);
        prepareDeleteOption(op);
        helpDeleteInternally(et, new InternalDeleteCallback<WhitePointTypeMapping>() {
            public int callbackDelegateDelete(WhitePointTypeMapping let) { return delegateDelete(let, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhitePointTypeMappingCB> op)
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
     *     WhitePointTypeMapping whitePointTypeMapping = new WhitePointTypeMapping();
     *     whitePointTypeMapping.setFooName("foo");
     *     if (...) {
     *         whitePointTypeMapping.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whitePointTypeMappingList.add(whitePointTypeMapping);
     * }
     * whitePointTypeMappingBhv.<span style="color: #DD4747">batchInsert</span>(whitePointTypeMappingList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whitePointTypeMappingList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhitePointTypeMapping> whitePointTypeMappingList) {
        return doBatchInsert(whitePointTypeMappingList, null);
    }

    protected int[] doBatchInsert(List<WhitePointTypeMapping> ls, InsertOption<WhitePointTypeMappingCB> op) {
        assertObjectNotNull("whitePointTypeMappingList", ls);
        InsertOption<WhitePointTypeMappingCB> rlop; if (op != null) { rlop = op; } else { rlop = createPlainInsertOption(); }
        prepareBatchInsertOption(ls, rlop); // required
        return delegateBatchInsert(ls, rlop);
    }

    protected void prepareBatchInsertOption(List<WhitePointTypeMapping> ls, InsertOption<WhitePointTypeMappingCB> op) {
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
     *     WhitePointTypeMapping whitePointTypeMapping = new WhitePointTypeMapping();
     *     whitePointTypeMapping.setFooName("foo");
     *     if (...) {
     *         whitePointTypeMapping.setFooPrice(123);
     *     } else {
     *         whitePointTypeMapping.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whitePointTypeMapping.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whitePointTypeMappingList.add(whitePointTypeMapping);
     * }
     * whitePointTypeMappingBhv.<span style="color: #DD4747">batchUpdate</span>(whitePointTypeMappingList);
     * </pre>
     * @param whitePointTypeMappingList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhitePointTypeMapping> whitePointTypeMappingList) {
        return doBatchUpdate(whitePointTypeMappingList, null);
    }

    protected int[] doBatchUpdate(List<WhitePointTypeMapping> ls, UpdateOption<WhitePointTypeMappingCB> op) {
        assertObjectNotNull("whitePointTypeMappingList", ls);
        UpdateOption<WhitePointTypeMappingCB> rlop; if (op != null) { rlop = op; } else { rlop = createPlainUpdateOption(); }
        prepareBatchUpdateOption(ls, rlop); // required
        return delegateBatchUpdate(ls, rlop);
    }

    protected void prepareBatchUpdateOption(List<WhitePointTypeMapping> ls, UpdateOption<WhitePointTypeMappingCB> op) {
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
     * whitePointTypeMappingBhv.<span style="color: #DD4747">batchUpdate</span>(whitePointTypeMappingList, new SpecifyQuery<WhitePointTypeMappingCB>() {
     *     public void specify(WhitePointTypeMappingCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whitePointTypeMappingBhv.<span style="color: #DD4747">batchUpdate</span>(whitePointTypeMappingList, new SpecifyQuery<WhitePointTypeMappingCB>() {
     *     public void specify(WhitePointTypeMappingCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whitePointTypeMappingList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhitePointTypeMapping> whitePointTypeMappingList, SpecifyQuery<WhitePointTypeMappingCB> updateColumnSpec) {
        return doBatchUpdate(whitePointTypeMappingList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whitePointTypeMappingList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhitePointTypeMapping> whitePointTypeMappingList) {
        return doBatchDelete(whitePointTypeMappingList, null);
    }

    protected int[] doBatchDelete(List<WhitePointTypeMapping> ls, DeleteOption<WhitePointTypeMappingCB> op) {
        assertObjectNotNull("whitePointTypeMappingList", ls);
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
     * whitePointTypeMappingBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhitePointTypeMapping, WhitePointTypeMappingCB&gt;() {
     *     public ConditionBean setup(whitePointTypeMapping entity, WhitePointTypeMappingCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhitePointTypeMapping, WhitePointTypeMappingCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhitePointTypeMapping, WhitePointTypeMappingCB> sp, InsertOption<WhitePointTypeMappingCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        WhitePointTypeMapping et = newEntity();
        WhitePointTypeMappingCB cb = createCBForQueryInsert();
        return delegateQueryInsert(et, cb, sp.setup(et, cb), op);
    }

    protected WhitePointTypeMappingCB createCBForQueryInsert()
    { WhitePointTypeMappingCB cb = newConditionBean(); cb.xsetupForQueryInsert(); return cb; }

    @Override
    protected int doRangeCreate(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> setupper, InsertOption<? extends ConditionBean> op) {
        return doQueryInsert(downcast(setupper), downcast(op));
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhitePointTypeMapping whitePointTypeMapping = new WhitePointTypeMapping();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whitePointTypeMapping.setPK...(value);</span>
     * whitePointTypeMapping.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whitePointTypeMapping.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whitePointTypeMapping.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whitePointTypeMapping.setVersionNo(value);</span>
     * WhitePointTypeMappingCB cb = new WhitePointTypeMappingCB();
     * cb.query().setFoo...(value);
     * whitePointTypeMappingBhv.<span style="color: #DD4747">queryUpdate</span>(whitePointTypeMapping, cb);
     * </pre>
     * @param whitePointTypeMapping The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhitePointTypeMapping. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhitePointTypeMapping whitePointTypeMapping, WhitePointTypeMappingCB cb) {
        return doQueryUpdate(whitePointTypeMapping, cb, null);
    }

    protected int doQueryUpdate(WhitePointTypeMapping et, WhitePointTypeMappingCB cb, UpdateOption<WhitePointTypeMappingCB> op) {
        assertObjectNotNull("whitePointTypeMapping", et); assertCBStateValid(cb);
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
     * WhitePointTypeMappingCB cb = new WhitePointTypeMappingCB();
     * cb.query().setFoo...(value);
     * whitePointTypeMappingBhv.<span style="color: #DD4747">queryDelete</span>(whitePointTypeMapping, cb);
     * </pre>
     * @param cb The condition-bean of WhitePointTypeMapping. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhitePointTypeMappingCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhitePointTypeMappingCB cb, DeleteOption<WhitePointTypeMappingCB> op) {
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
     * WhitePointTypeMapping whitePointTypeMapping = new WhitePointTypeMapping();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whitePointTypeMapping.setFoo...(value);
     * whitePointTypeMapping.setBar...(value);
     * InsertOption<WhitePointTypeMappingCB> option = new InsertOption<WhitePointTypeMappingCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whitePointTypeMappingBhv.<span style="color: #DD4747">varyingInsert</span>(whitePointTypeMapping, option);
     * ... = whitePointTypeMapping.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whitePointTypeMapping The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhitePointTypeMapping whitePointTypeMapping, InsertOption<WhitePointTypeMappingCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whitePointTypeMapping, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhitePointTypeMapping whitePointTypeMapping = new WhitePointTypeMapping();
     * whitePointTypeMapping.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whitePointTypeMapping.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whitePointTypeMapping.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhitePointTypeMappingCB&gt; option = new UpdateOption&lt;WhitePointTypeMappingCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhitePointTypeMappingCB&gt;() {
     *         public void specify(WhitePointTypeMappingCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whitePointTypeMappingBhv.<span style="color: #DD4747">varyingUpdate</span>(whitePointTypeMapping, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whitePointTypeMapping The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhitePointTypeMapping whitePointTypeMapping, UpdateOption<WhitePointTypeMappingCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whitePointTypeMapping, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whitePointTypeMapping The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhitePointTypeMapping whitePointTypeMapping, InsertOption<WhitePointTypeMappingCB> insertOption, UpdateOption<WhitePointTypeMappingCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdate(whitePointTypeMapping, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whitePointTypeMapping The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhitePointTypeMapping whitePointTypeMapping, DeleteOption<WhitePointTypeMappingCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whitePointTypeMapping, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whitePointTypeMappingList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhitePointTypeMapping> whitePointTypeMappingList, InsertOption<WhitePointTypeMappingCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whitePointTypeMappingList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whitePointTypeMappingList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhitePointTypeMapping> whitePointTypeMappingList, UpdateOption<WhitePointTypeMappingCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whitePointTypeMappingList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whitePointTypeMappingList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhitePointTypeMapping> whitePointTypeMappingList, DeleteOption<WhitePointTypeMappingCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whitePointTypeMappingList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhitePointTypeMapping, WhitePointTypeMappingCB> setupper, InsertOption<WhitePointTypeMappingCB> option) {
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
     * WhitePointTypeMapping whitePointTypeMapping = new WhitePointTypeMapping();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whitePointTypeMapping.setPK...(value);</span>
     * whitePointTypeMapping.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whitePointTypeMapping.setVersionNo(value);</span>
     * WhitePointTypeMappingCB cb = new WhitePointTypeMappingCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhitePointTypeMappingCB&gt; option = new UpdateOption&lt;WhitePointTypeMappingCB&gt;();
     * option.self(new SpecifyQuery&lt;WhitePointTypeMappingCB&gt;() {
     *     public void specify(WhitePointTypeMappingCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whitePointTypeMappingBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whitePointTypeMapping, cb, option);
     * </pre>
     * @param whitePointTypeMapping The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhitePointTypeMapping. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhitePointTypeMapping whitePointTypeMapping, WhitePointTypeMappingCB cb, UpdateOption<WhitePointTypeMappingCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whitePointTypeMapping, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhitePointTypeMapping. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhitePointTypeMappingCB cb, DeleteOption<WhitePointTypeMappingCB> option) {
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
    public OutsideSqlBasicExecutor<WhitePointTypeMappingBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhitePointTypeMappingCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhitePointTypeMappingCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhitePointTypeMapping> void delegateSelectCursor(WhitePointTypeMappingCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends WhitePointTypeMapping> List<ENTITY> delegateSelectList(WhitePointTypeMappingCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhitePointTypeMapping et, InsertOption<WhitePointTypeMappingCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(WhitePointTypeMapping et, UpdateOption<WhitePointTypeMappingCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(WhitePointTypeMapping et, UpdateOption<WhitePointTypeMappingCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(WhitePointTypeMapping et, DeleteOption<WhitePointTypeMappingCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(WhitePointTypeMapping et, DeleteOption<WhitePointTypeMappingCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<WhitePointTypeMapping> ls, InsertOption<WhitePointTypeMappingCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhitePointTypeMapping> ls, UpdateOption<WhitePointTypeMappingCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhitePointTypeMapping> ls, UpdateOption<WhitePointTypeMappingCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhitePointTypeMapping> ls, DeleteOption<WhitePointTypeMappingCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhitePointTypeMapping> ls, DeleteOption<WhitePointTypeMappingCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhitePointTypeMapping et, WhitePointTypeMappingCB inCB, ConditionBean resCB, InsertOption<WhitePointTypeMappingCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhitePointTypeMapping et, WhitePointTypeMappingCB cb, UpdateOption<WhitePointTypeMappingCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(WhitePointTypeMappingCB cb, DeleteOption<WhitePointTypeMappingCB> op)
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
    protected Class<WhitePointTypeMapping> typeOfSelectedEntity()
    { return WhitePointTypeMapping.class; }

    protected WhitePointTypeMapping downcast(Entity et)
    { return helpEntityDowncastInternally(et, WhitePointTypeMapping.class); }

    protected WhitePointTypeMappingCB downcast(ConditionBean cb)
    { return helpConditionBeanDowncastInternally(cb, WhitePointTypeMappingCB.class); }

    @SuppressWarnings("unchecked")
    protected List<WhitePointTypeMapping> downcast(List<? extends Entity> ls)
    { return (List<WhitePointTypeMapping>)ls; }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhitePointTypeMappingCB> downcast(InsertOption<? extends ConditionBean> op)
    { return (InsertOption<WhitePointTypeMappingCB>)op; }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhitePointTypeMappingCB> downcast(UpdateOption<? extends ConditionBean> op)
    { return (UpdateOption<WhitePointTypeMappingCB>)op; }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhitePointTypeMappingCB> downcast(DeleteOption<? extends ConditionBean> op)
    { return (DeleteOption<WhitePointTypeMappingCB>)op; }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhitePointTypeMapping, WhitePointTypeMappingCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp)
    { return (QueryInsertSetupper<WhitePointTypeMapping, WhitePointTypeMappingCB>)sp; }
}
