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
import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.exception.*;
import org.seasar.dbflute.outsidesql.executor.*;
import com.example.dbflute.mysql.dbflute.exbhv.*;
import com.example.dbflute.mysql.dbflute.exentity.*;
import com.example.dbflute.mysql.dbflute.bsentity.dbmeta.*;
import com.example.dbflute.mysql.dbflute.cbean.*;

/**
 * The behavior of WHITE_SPLIT_MULTIPLE_FK_BASE as TABLE. <br />
 * <pre>
 * [primary key]
 *     BASE_ID
 *
 * [column]
 *     BASE_ID, FIRST_ID, NEXT_ID, SPLIT_NAME
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
 *     white_split_multiple_fk_next, WHITE_SPLIT_MULTIPLE_FK_REF(AsSplitMultipleFkTest)
 *
 * [referrer table]
 *     white_split_multiple_fk_child
 *
 * [foreign property]
 *     whiteSplitMultipleFkNext, whiteSplitMultipleFkRefAsSplitMultipleFkTest
 *
 * [referrer property]
 *     whiteSplitMultipleFkChildList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteSplitMultipleFkBaseBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_split_multiple_fk_base"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return WhiteSplitMultipleFkBaseDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteSplitMultipleFkBaseDbm getMyDBMeta() { return WhiteSplitMultipleFkBaseDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteSplitMultipleFkBase newMyEntity() { return new WhiteSplitMultipleFkBase(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteSplitMultipleFkBaseCB newMyConditionBean() { return new WhiteSplitMultipleFkBaseCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteSplitMultipleFkBaseCB cb = new WhiteSplitMultipleFkBaseCB();
     * cb.query().setFoo...(value);
     * int count = whiteSplitMultipleFkBaseBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteSplitMultipleFkBase. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteSplitMultipleFkBaseCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteSplitMultipleFkBaseCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteSplitMultipleFkBaseCB cb) { // called by selectPage(cb)
        assertCBStateValid(cb);
        return delegateSelectCountPlainly(cb);
    }

    @Override
    protected int doReadCount(ConditionBean cb) {
        return selectCount(downcast(cb));
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean. <br />
     * <span style="color: #AD4747; font-size: 120%">The return might be null if no data, so you should have null check.</span> <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, use selectEntityWithDeletedCheck().</span>
     * <pre>
     * WhiteSplitMultipleFkBaseCB cb = new WhiteSplitMultipleFkBaseCB();
     * cb.query().setFoo...(value);
     * WhiteSplitMultipleFkBase whiteSplitMultipleFkBase = whiteSplitMultipleFkBaseBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (whiteSplitMultipleFkBase != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = whiteSplitMultipleFkBase.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSplitMultipleFkBase. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSplitMultipleFkBase selectEntity(WhiteSplitMultipleFkBaseCB cb) {
        return doSelectEntity(cb, WhiteSplitMultipleFkBase.class);
    }

    protected <ENTITY extends WhiteSplitMultipleFkBase> ENTITY doSelectEntity(WhiteSplitMultipleFkBaseCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, WhiteSplitMultipleFkBaseCB>() {
            public List<ENTITY> callbackSelectList(WhiteSplitMultipleFkBaseCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * WhiteSplitMultipleFkBaseCB cb = new WhiteSplitMultipleFkBaseCB();
     * cb.query().setFoo...(value);
     * WhiteSplitMultipleFkBase whiteSplitMultipleFkBase = whiteSplitMultipleFkBaseBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteSplitMultipleFkBase.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteSplitMultipleFkBase. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (point is not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSplitMultipleFkBase selectEntityWithDeletedCheck(WhiteSplitMultipleFkBaseCB cb) {
        return doSelectEntityWithDeletedCheck(cb, WhiteSplitMultipleFkBase.class);
    }

    protected <ENTITY extends WhiteSplitMultipleFkBase> ENTITY doSelectEntityWithDeletedCheck(WhiteSplitMultipleFkBaseCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteSplitMultipleFkBaseCB>() {
            public List<ENTITY> callbackSelectList(WhiteSplitMultipleFkBaseCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param baseId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSplitMultipleFkBase selectByPKValue(Long baseId) {
        return doSelectByPKValue(baseId, WhiteSplitMultipleFkBase.class);
    }

    protected <ENTITY extends WhiteSplitMultipleFkBase> ENTITY doSelectByPKValue(Long baseId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(baseId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param baseId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSplitMultipleFkBase selectByPKValueWithDeletedCheck(Long baseId) {
        return doSelectByPKValueWithDeletedCheck(baseId, WhiteSplitMultipleFkBase.class);
    }

    protected <ENTITY extends WhiteSplitMultipleFkBase> ENTITY doSelectByPKValueWithDeletedCheck(Long baseId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(baseId), entityType);
    }

    private WhiteSplitMultipleFkBaseCB buildPKCB(Long baseId) {
        assertObjectNotNull("baseId", baseId);
        WhiteSplitMultipleFkBaseCB cb = newMyConditionBean();
        cb.query().setBaseId_Equal(baseId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteSplitMultipleFkBaseCB cb = new WhiteSplitMultipleFkBaseCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteSplitMultipleFkBase&gt; whiteSplitMultipleFkBaseList = whiteSplitMultipleFkBaseBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteSplitMultipleFkBase whiteSplitMultipleFkBase : whiteSplitMultipleFkBaseList) {
     *     ... = whiteSplitMultipleFkBase.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSplitMultipleFkBase. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteSplitMultipleFkBase> selectList(WhiteSplitMultipleFkBaseCB cb) {
        return doSelectList(cb, WhiteSplitMultipleFkBase.class);
    }

    protected <ENTITY extends WhiteSplitMultipleFkBase> ListResultBean<ENTITY> doSelectList(WhiteSplitMultipleFkBaseCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, WhiteSplitMultipleFkBaseCB>() {
            public List<ENTITY> callbackSelectList(WhiteSplitMultipleFkBaseCB lcb, Class<ENTITY> ltp) { return delegateSelectList(lcb, ltp); } });
    }

    @Override
    protected ListResultBean<? extends Entity> doReadList(ConditionBean cb) {
        return selectList(downcast(cb));
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * WhiteSplitMultipleFkBaseCB cb = new WhiteSplitMultipleFkBaseCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteSplitMultipleFkBase&gt; page = whiteSplitMultipleFkBaseBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteSplitMultipleFkBase whiteSplitMultipleFkBase : page) {
     *     ... = whiteSplitMultipleFkBase.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSplitMultipleFkBase. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteSplitMultipleFkBase> selectPage(WhiteSplitMultipleFkBaseCB cb) {
        return doSelectPage(cb, WhiteSplitMultipleFkBase.class);
    }

    protected <ENTITY extends WhiteSplitMultipleFkBase> PagingResultBean<ENTITY> doSelectPage(WhiteSplitMultipleFkBaseCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, WhiteSplitMultipleFkBaseCB>() {
            public int callbackSelectCount(WhiteSplitMultipleFkBaseCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteSplitMultipleFkBaseCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    @Override
    protected PagingResultBean<? extends Entity> doReadPage(ConditionBean cb) {
        return selectPage(downcast(cb));
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteSplitMultipleFkBaseCB cb = new WhiteSplitMultipleFkBaseCB();
     * cb.query().setFoo...(value);
     * whiteSplitMultipleFkBaseBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteSplitMultipleFkBase&gt;() {
     *     public void handle(WhiteSplitMultipleFkBase entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteSplitMultipleFkBase. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteSplitMultipleFkBase. (NotNull)
     */
    public void selectCursor(WhiteSplitMultipleFkBaseCB cb, EntityRowHandler<WhiteSplitMultipleFkBase> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, WhiteSplitMultipleFkBase.class);
    }

    protected <ENTITY extends WhiteSplitMultipleFkBase> void doSelectCursor(WhiteSplitMultipleFkBaseCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, WhiteSplitMultipleFkBaseCB>() {
            public void callbackSelectCursor(WhiteSplitMultipleFkBaseCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(WhiteSplitMultipleFkBaseCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteSplitMultipleFkBaseBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteSplitMultipleFkBaseCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<WhiteSplitMultipleFkBaseCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends WhiteSplitMultipleFkBaseCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends WhiteSplitMultipleFkBaseCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
        return new SLFunction<CB, RESULT>(cb, tp);
    }

    protected <RESULT> SLFunction<? extends ConditionBean, RESULT> doReadScalar(Class<RESULT> tp) {
        return doScalarSelect(tp, newMyConditionBean());
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
     * Load referrer of whiteSplitMultipleFkChildList by the set-upper of referrer. <br />
     * white_split_multiple_fk_child by BASE_ID, named 'whiteSplitMultipleFkChildList'.
     * <pre>
     * whiteSplitMultipleFkBaseBhv.<span style="color: #DD4747">loadWhiteSplitMultipleFkChildList</span>(whiteSplitMultipleFkBaseList, new ConditionBeanSetupper&lt;WhiteSplitMultipleFkChildCB&gt;() {
     *     public void setup(WhiteSplitMultipleFkChildCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here by calling like '}).withNestedList(new ...)'</span>
     * for (WhiteSplitMultipleFkBase whiteSplitMultipleFkBase : whiteSplitMultipleFkBaseList) {
     *     ... = whiteSplitMultipleFkBase.<span style="color: #DD4747">getWhiteSplitMultipleFkChildList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setBaseId_InScope(pkList);
     * cb.query().addOrderBy_BaseId_Asc();
     * </pre>
     * @param whiteSplitMultipleFkBase The entity of whiteSplitMultipleFkBase. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<WhiteSplitMultipleFkChild> loadWhiteSplitMultipleFkChildList(WhiteSplitMultipleFkBase whiteSplitMultipleFkBase, ConditionBeanSetupper<WhiteSplitMultipleFkChildCB> conditionBeanSetupper) {
        xassLRArg(whiteSplitMultipleFkBase, conditionBeanSetupper);
        return loadWhiteSplitMultipleFkChildList(xnewLRLs(whiteSplitMultipleFkBase), conditionBeanSetupper);
    }

    /**
     * Load referrer of whiteSplitMultipleFkChildList by the set-upper of referrer. <br />
     * white_split_multiple_fk_child by BASE_ID, named 'whiteSplitMultipleFkChildList'.
     * <pre>
     * whiteSplitMultipleFkBaseBhv.<span style="color: #DD4747">loadWhiteSplitMultipleFkChildList</span>(whiteSplitMultipleFkBaseList, new ConditionBeanSetupper&lt;WhiteSplitMultipleFkChildCB&gt;() {
     *     public void setup(WhiteSplitMultipleFkChildCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here by calling like '}).withNestedList(new ...)'</span>
     * for (WhiteSplitMultipleFkBase whiteSplitMultipleFkBase : whiteSplitMultipleFkBaseList) {
     *     ... = whiteSplitMultipleFkBase.<span style="color: #DD4747">getWhiteSplitMultipleFkChildList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setBaseId_InScope(pkList);
     * cb.query().addOrderBy_BaseId_Asc();
     * </pre>
     * @param whiteSplitMultipleFkBaseList The entity list of whiteSplitMultipleFkBase. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<WhiteSplitMultipleFkChild> loadWhiteSplitMultipleFkChildList(List<WhiteSplitMultipleFkBase> whiteSplitMultipleFkBaseList, ConditionBeanSetupper<WhiteSplitMultipleFkChildCB> conditionBeanSetupper) {
        xassLRArg(whiteSplitMultipleFkBaseList, conditionBeanSetupper);
        return loadWhiteSplitMultipleFkChildList(whiteSplitMultipleFkBaseList, new LoadReferrerOption<WhiteSplitMultipleFkChildCB, WhiteSplitMultipleFkChild>().xinit(conditionBeanSetupper));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param whiteSplitMultipleFkBase The entity of whiteSplitMultipleFkBase. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<WhiteSplitMultipleFkChild> loadWhiteSplitMultipleFkChildList(WhiteSplitMultipleFkBase whiteSplitMultipleFkBase, LoadReferrerOption<WhiteSplitMultipleFkChildCB, WhiteSplitMultipleFkChild> loadReferrerOption) {
        xassLRArg(whiteSplitMultipleFkBase, loadReferrerOption);
        return loadWhiteSplitMultipleFkChildList(xnewLRLs(whiteSplitMultipleFkBase), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param whiteSplitMultipleFkBaseList The entity list of whiteSplitMultipleFkBase. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerLoader<WhiteSplitMultipleFkChild> loadWhiteSplitMultipleFkChildList(List<WhiteSplitMultipleFkBase> whiteSplitMultipleFkBaseList, LoadReferrerOption<WhiteSplitMultipleFkChildCB, WhiteSplitMultipleFkChild> loadReferrerOption) {
        xassLRArg(whiteSplitMultipleFkBaseList, loadReferrerOption);
        if (whiteSplitMultipleFkBaseList.isEmpty()) { return (NestedReferrerLoader<WhiteSplitMultipleFkChild>)EMPTY_LOADER; }
        return doLoadWhiteSplitMultipleFkChildList(whiteSplitMultipleFkBaseList, loadReferrerOption);
    }

    protected NestedReferrerLoader<WhiteSplitMultipleFkChild> doLoadWhiteSplitMultipleFkChildList(List<WhiteSplitMultipleFkBase> whiteSplitMultipleFkBaseList, LoadReferrerOption<WhiteSplitMultipleFkChildCB, WhiteSplitMultipleFkChild> option) {
        final WhiteSplitMultipleFkChildBhv referrerBhv = xgetBSFLR().select(WhiteSplitMultipleFkChildBhv.class);
        return helpLoadReferrerInternally(whiteSplitMultipleFkBaseList, option, new InternalLoadReferrerCallback<WhiteSplitMultipleFkBase, Long, WhiteSplitMultipleFkChildCB, WhiteSplitMultipleFkChild>() {
            public Long getPKVal(WhiteSplitMultipleFkBase et)
            { return et.getBaseId(); }
            public void setRfLs(WhiteSplitMultipleFkBase et, List<WhiteSplitMultipleFkChild> ls)
            { et.setWhiteSplitMultipleFkChildList(ls); }
            public WhiteSplitMultipleFkChildCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(WhiteSplitMultipleFkChildCB cb, List<Long> ls)
            { cb.query().setBaseId_InScope(ls); }
            public void qyOdFKAsc(WhiteSplitMultipleFkChildCB cb) { cb.query().addOrderBy_BaseId_Asc(); }
            public void spFKCol(WhiteSplitMultipleFkChildCB cb) { cb.specify().columnBaseId(); }
            public List<WhiteSplitMultipleFkChild> selRfLs(WhiteSplitMultipleFkChildCB cb) { return referrerBhv.selectList(cb); }
            public Long getFKVal(WhiteSplitMultipleFkChild re) { return re.getBaseId(); }
            public void setlcEt(WhiteSplitMultipleFkChild re, WhiteSplitMultipleFkBase le)
            { re.setWhiteSplitMultipleFkBase(le); }
            public String getRfPrNm() { return "whiteSplitMultipleFkChildList"; }
        });
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'WhiteSplitMultipleFkNext'.
     * @param whiteSplitMultipleFkBaseList The list of whiteSplitMultipleFkBase. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteSplitMultipleFkNext> pulloutWhiteSplitMultipleFkNext(List<WhiteSplitMultipleFkBase> whiteSplitMultipleFkBaseList) {
        return helpPulloutInternally(whiteSplitMultipleFkBaseList, new InternalPulloutCallback<WhiteSplitMultipleFkBase, WhiteSplitMultipleFkNext>() {
            public WhiteSplitMultipleFkNext getFr(WhiteSplitMultipleFkBase et) { return et.getWhiteSplitMultipleFkNext(); }
            public boolean hasRf() { return true; }
            public void setRfLs(WhiteSplitMultipleFkNext et, List<WhiteSplitMultipleFkBase> ls)
            { et.setWhiteSplitMultipleFkBaseList(ls); }
        });
    }
    /**
     * Pull out the list of foreign table 'WhiteSplitMultipleFkRef'.
     * @param whiteSplitMultipleFkBaseList The list of whiteSplitMultipleFkBase. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteSplitMultipleFkRef> pulloutWhiteSplitMultipleFkRefAsSplitMultipleFkTest(List<WhiteSplitMultipleFkBase> whiteSplitMultipleFkBaseList) {
        return helpPulloutInternally(whiteSplitMultipleFkBaseList, new InternalPulloutCallback<WhiteSplitMultipleFkBase, WhiteSplitMultipleFkRef>() {
            public WhiteSplitMultipleFkRef getFr(WhiteSplitMultipleFkBase et) { return et.getWhiteSplitMultipleFkRefAsSplitMultipleFkTest(); }
            public boolean hasRf() { return false; }
            public void setRfLs(WhiteSplitMultipleFkRef et, List<WhiteSplitMultipleFkBase> ls)
            { throw new UnsupportedOperationException(); }
        });
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key baseId.
     * @param whiteSplitMultipleFkBaseList The list of whiteSplitMultipleFkBase. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractBaseIdList(List<WhiteSplitMultipleFkBase> whiteSplitMultipleFkBaseList) {
        return helpExtractListInternally(whiteSplitMultipleFkBaseList, new InternalExtractCallback<WhiteSplitMultipleFkBase, Long>() {
            public Long getCV(WhiteSplitMultipleFkBase et) { return et.getBaseId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteSplitMultipleFkBase whiteSplitMultipleFkBase = new WhiteSplitMultipleFkBase();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteSplitMultipleFkBase.setFoo...(value);
     * whiteSplitMultipleFkBase.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkBase.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkBase.set...;</span>
     * whiteSplitMultipleFkBaseBhv.<span style="color: #DD4747">insert</span>(whiteSplitMultipleFkBase);
     * ... = whiteSplitMultipleFkBase.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteSplitMultipleFkBase The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteSplitMultipleFkBase whiteSplitMultipleFkBase) {
        doInsert(whiteSplitMultipleFkBase, null);
    }

    protected void doInsert(WhiteSplitMultipleFkBase whiteSplitMultipleFkBase, InsertOption<WhiteSplitMultipleFkBaseCB> op) {
        assertObjectNotNull("whiteSplitMultipleFkBase", whiteSplitMultipleFkBase);
        prepareInsertOption(op);
        delegateInsert(whiteSplitMultipleFkBase, op);
    }

    protected void prepareInsertOption(InsertOption<WhiteSplitMultipleFkBaseCB> op) {
        if (op == null) { return; }
        assertInsertOptionStatus(op);
        if (op.hasSpecifiedInsertColumn()) {
            op.resolveInsertColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    @Override
    protected void doCreate(Entity et, InsertOption<? extends ConditionBean> op) {
        if (op == null) { insert(downcast(et)); }
        else { varyingInsert(downcast(et), downcast(op)); }
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteSplitMultipleFkBase whiteSplitMultipleFkBase = new WhiteSplitMultipleFkBase();
     * whiteSplitMultipleFkBase.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteSplitMultipleFkBase.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkBase.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkBase.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteSplitMultipleFkBase.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteSplitMultipleFkBaseBhv.<span style="color: #DD4747">update</span>(whiteSplitMultipleFkBase);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSplitMultipleFkBase The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final WhiteSplitMultipleFkBase whiteSplitMultipleFkBase) {
        doUpdate(whiteSplitMultipleFkBase, null);
    }

    protected void doUpdate(WhiteSplitMultipleFkBase whiteSplitMultipleFkBase, final UpdateOption<WhiteSplitMultipleFkBaseCB> op) {
        assertObjectNotNull("whiteSplitMultipleFkBase", whiteSplitMultipleFkBase);
        prepareUpdateOption(op);
        helpUpdateInternally(whiteSplitMultipleFkBase, new InternalUpdateCallback<WhiteSplitMultipleFkBase>() {
            public int callbackDelegateUpdate(WhiteSplitMultipleFkBase et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhiteSplitMultipleFkBaseCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected WhiteSplitMultipleFkBaseCB createCBForVaryingUpdate() {
        WhiteSplitMultipleFkBaseCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected WhiteSplitMultipleFkBaseCB createCBForSpecifiedUpdate() {
        WhiteSplitMultipleFkBaseCB cb = newMyConditionBean();
        cb.xsetupForSpecifiedUpdate();
        return cb;
    }

    @Override
    protected void doModify(Entity et, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { update(downcast(et)); }
        else { varyingUpdate(downcast(et), downcast(op)); }
    }

    @Override
    protected void doModifyNonstrict(Entity et, UpdateOption<? extends ConditionBean> op) {
        doModify(et, op);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param whiteSplitMultipleFkBase The entity of insert or update target. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteSplitMultipleFkBase whiteSplitMultipleFkBase) {
        doInesrtOrUpdate(whiteSplitMultipleFkBase, null, null);
    }

    protected void doInesrtOrUpdate(WhiteSplitMultipleFkBase whiteSplitMultipleFkBase, final InsertOption<WhiteSplitMultipleFkBaseCB> iop, final UpdateOption<WhiteSplitMultipleFkBaseCB> uop) {
        helpInsertOrUpdateInternally(whiteSplitMultipleFkBase, new InternalInsertOrUpdateCallback<WhiteSplitMultipleFkBase, WhiteSplitMultipleFkBaseCB>() {
            public void callbackInsert(WhiteSplitMultipleFkBase et) { doInsert(et, iop); }
            public void callbackUpdate(WhiteSplitMultipleFkBase et) { doUpdate(et, uop); }
            public WhiteSplitMultipleFkBaseCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(WhiteSplitMultipleFkBaseCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<WhiteSplitMultipleFkBaseCB>();
            uop = uop != null ? uop : new UpdateOption<WhiteSplitMultipleFkBaseCB>();
            varyingInsertOrUpdate(downcast(et), downcast(iop), downcast(uop));
        }
    }

    @Override
    protected void doCreateOrModifyNonstrict(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        doCreateOrModify(et, iop, uop);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteSplitMultipleFkBase whiteSplitMultipleFkBase = new WhiteSplitMultipleFkBase();
     * whiteSplitMultipleFkBase.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteSplitMultipleFkBase.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteSplitMultipleFkBaseBhv.<span style="color: #DD4747">delete</span>(whiteSplitMultipleFkBase);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSplitMultipleFkBase The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteSplitMultipleFkBase whiteSplitMultipleFkBase) {
        doDelete(whiteSplitMultipleFkBase, null);
    }

    protected void doDelete(WhiteSplitMultipleFkBase whiteSplitMultipleFkBase, final DeleteOption<WhiteSplitMultipleFkBaseCB> op) {
        assertObjectNotNull("whiteSplitMultipleFkBase", whiteSplitMultipleFkBase);
        prepareDeleteOption(op);
        helpDeleteInternally(whiteSplitMultipleFkBase, new InternalDeleteCallback<WhiteSplitMultipleFkBase>() {
            public int callbackDelegateDelete(WhiteSplitMultipleFkBase et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhiteSplitMultipleFkBaseCB> op) {
        if (op == null) { return; }
        assertDeleteOptionStatus(op);
    }

    @Override
    protected void doRemove(Entity et, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { delete(downcast(et)); }
        else { varyingDelete(downcast(et), downcast(op)); }
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
     *     WhiteSplitMultipleFkBase whiteSplitMultipleFkBase = new WhiteSplitMultipleFkBase();
     *     whiteSplitMultipleFkBase.setFooName("foo");
     *     if (...) {
     *         whiteSplitMultipleFkBase.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteSplitMultipleFkBaseList.add(whiteSplitMultipleFkBase);
     * }
     * whiteSplitMultipleFkBaseBhv.<span style="color: #DD4747">batchInsert</span>(whiteSplitMultipleFkBaseList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteSplitMultipleFkBaseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteSplitMultipleFkBase> whiteSplitMultipleFkBaseList) {
        InsertOption<WhiteSplitMultipleFkBaseCB> op = createInsertUpdateOption();
        return doBatchInsert(whiteSplitMultipleFkBaseList, op);
    }

    protected int[] doBatchInsert(List<WhiteSplitMultipleFkBase> whiteSplitMultipleFkBaseList, InsertOption<WhiteSplitMultipleFkBaseCB> op) {
        assertObjectNotNull("whiteSplitMultipleFkBaseList", whiteSplitMultipleFkBaseList);
        prepareBatchInsertOption(whiteSplitMultipleFkBaseList, op);
        return delegateBatchInsert(whiteSplitMultipleFkBaseList, op);
    }

    protected void prepareBatchInsertOption(List<WhiteSplitMultipleFkBase> whiteSplitMultipleFkBaseList, InsertOption<WhiteSplitMultipleFkBaseCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(whiteSplitMultipleFkBaseList);
        prepareInsertOption(op);
    }

    @Override
    protected int[] doLumpCreate(List<Entity> ls, InsertOption<? extends ConditionBean> op) {
        if (op == null) { return batchInsert(downcast(ls)); }
        else { return varyingBatchInsert(downcast(ls), downcast(op)); }
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhiteSplitMultipleFkBase whiteSplitMultipleFkBase = new WhiteSplitMultipleFkBase();
     *     whiteSplitMultipleFkBase.setFooName("foo");
     *     if (...) {
     *         whiteSplitMultipleFkBase.setFooPrice(123);
     *     } else {
     *         whiteSplitMultipleFkBase.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteSplitMultipleFkBase.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteSplitMultipleFkBaseList.add(whiteSplitMultipleFkBase);
     * }
     * whiteSplitMultipleFkBaseBhv.<span style="color: #DD4747">batchUpdate</span>(whiteSplitMultipleFkBaseList);
     * </pre>
     * @param whiteSplitMultipleFkBaseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteSplitMultipleFkBase> whiteSplitMultipleFkBaseList) {
        UpdateOption<WhiteSplitMultipleFkBaseCB> op = createPlainUpdateOption();
        return doBatchUpdate(whiteSplitMultipleFkBaseList, op);
    }

    protected int[] doBatchUpdate(List<WhiteSplitMultipleFkBase> whiteSplitMultipleFkBaseList, UpdateOption<WhiteSplitMultipleFkBaseCB> op) {
        assertObjectNotNull("whiteSplitMultipleFkBaseList", whiteSplitMultipleFkBaseList);
        prepareBatchUpdateOption(whiteSplitMultipleFkBaseList, op);
        return delegateBatchUpdate(whiteSplitMultipleFkBaseList, op);
    }

    protected void prepareBatchUpdateOption(List<WhiteSplitMultipleFkBase> whiteSplitMultipleFkBaseList, UpdateOption<WhiteSplitMultipleFkBaseCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(whiteSplitMultipleFkBaseList);
        prepareUpdateOption(op);
    }

    @Override
    protected int[] doLumpModify(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return batchUpdate(downcast(ls)); }
        else { return varyingBatchUpdate(downcast(ls), downcast(op)); }
    }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * whiteSplitMultipleFkBaseBhv.<span style="color: #DD4747">batchUpdate</span>(whiteSplitMultipleFkBaseList, new SpecifyQuery<WhiteSplitMultipleFkBaseCB>() {
     *     public void specify(WhiteSplitMultipleFkBaseCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteSplitMultipleFkBaseBhv.<span style="color: #DD4747">batchUpdate</span>(whiteSplitMultipleFkBaseList, new SpecifyQuery<WhiteSplitMultipleFkBaseCB>() {
     *     public void specify(WhiteSplitMultipleFkBaseCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteSplitMultipleFkBaseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteSplitMultipleFkBase> whiteSplitMultipleFkBaseList, SpecifyQuery<WhiteSplitMultipleFkBaseCB> updateColumnSpec) {
        return doBatchUpdate(whiteSplitMultipleFkBaseList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteSplitMultipleFkBaseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteSplitMultipleFkBase> whiteSplitMultipleFkBaseList) {
        return doBatchDelete(whiteSplitMultipleFkBaseList, null);
    }

    protected int[] doBatchDelete(List<WhiteSplitMultipleFkBase> whiteSplitMultipleFkBaseList, DeleteOption<WhiteSplitMultipleFkBaseCB> op) {
        assertObjectNotNull("whiteSplitMultipleFkBaseList", whiteSplitMultipleFkBaseList);
        prepareDeleteOption(op);
        return delegateBatchDelete(whiteSplitMultipleFkBaseList, op);
    }

    @Override
    protected int[] doLumpRemove(List<Entity> ls, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return batchDelete(downcast(ls)); }
        else { return varyingBatchDelete(downcast(ls), downcast(op)); }
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
     * whiteSplitMultipleFkBaseBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteSplitMultipleFkBase, WhiteSplitMultipleFkBaseCB&gt;() {
     *     public ConditionBean setup(whiteSplitMultipleFkBase entity, WhiteSplitMultipleFkBaseCB intoCB) {
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
     *         <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     *         <span style="color: #3F7E5E">//entity.setVersionNo(value);</span>
     *
     *         return cb;
     *     }
     * });
     * </pre>
     * @param setupper The setup-per of query-insert. (NotNull)
     * @return The inserted count.
     */
    public int queryInsert(QueryInsertSetupper<WhiteSplitMultipleFkBase, WhiteSplitMultipleFkBaseCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteSplitMultipleFkBase, WhiteSplitMultipleFkBaseCB> sp, InsertOption<WhiteSplitMultipleFkBaseCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        WhiteSplitMultipleFkBase e = new WhiteSplitMultipleFkBase();
        WhiteSplitMultipleFkBaseCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected WhiteSplitMultipleFkBaseCB createCBForQueryInsert() {
        WhiteSplitMultipleFkBaseCB cb = newMyConditionBean();
        cb.xsetupForQueryInsert();
        return cb;
    }

    @Override
    protected int doRangeCreate(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> setupper, InsertOption<? extends ConditionBean> option) {
        if (option == null) { return queryInsert(downcast(setupper)); }
        else { return varyingQueryInsert(downcast(setupper), downcast(option)); }
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteSplitMultipleFkBase whiteSplitMultipleFkBase = new WhiteSplitMultipleFkBase();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkBase.setPK...(value);</span>
     * whiteSplitMultipleFkBase.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkBase.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkBase.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkBase.setVersionNo(value);</span>
     * WhiteSplitMultipleFkBaseCB cb = new WhiteSplitMultipleFkBaseCB();
     * cb.query().setFoo...(value);
     * whiteSplitMultipleFkBaseBhv.<span style="color: #DD4747">queryUpdate</span>(whiteSplitMultipleFkBase, cb);
     * </pre>
     * @param whiteSplitMultipleFkBase The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteSplitMultipleFkBase. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteSplitMultipleFkBase whiteSplitMultipleFkBase, WhiteSplitMultipleFkBaseCB cb) {
        return doQueryUpdate(whiteSplitMultipleFkBase, cb, null);
    }

    protected int doQueryUpdate(WhiteSplitMultipleFkBase whiteSplitMultipleFkBase, WhiteSplitMultipleFkBaseCB cb, UpdateOption<WhiteSplitMultipleFkBaseCB> op) {
        assertObjectNotNull("whiteSplitMultipleFkBase", whiteSplitMultipleFkBase); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(whiteSplitMultipleFkBase, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (WhiteSplitMultipleFkBaseCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (WhiteSplitMultipleFkBaseCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteSplitMultipleFkBaseCB cb = new WhiteSplitMultipleFkBaseCB();
     * cb.query().setFoo...(value);
     * whiteSplitMultipleFkBaseBhv.<span style="color: #DD4747">queryDelete</span>(whiteSplitMultipleFkBase, cb);
     * </pre>
     * @param cb The condition-bean of WhiteSplitMultipleFkBase. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteSplitMultipleFkBaseCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteSplitMultipleFkBaseCB cb, DeleteOption<WhiteSplitMultipleFkBaseCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((WhiteSplitMultipleFkBaseCB)cb); }
        else { return varyingQueryDelete((WhiteSplitMultipleFkBaseCB)cb, downcast(op)); }
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
     * WhiteSplitMultipleFkBase whiteSplitMultipleFkBase = new WhiteSplitMultipleFkBase();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteSplitMultipleFkBase.setFoo...(value);
     * whiteSplitMultipleFkBase.setBar...(value);
     * InsertOption<WhiteSplitMultipleFkBaseCB> option = new InsertOption<WhiteSplitMultipleFkBaseCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteSplitMultipleFkBaseBhv.<span style="color: #DD4747">varyingInsert</span>(whiteSplitMultipleFkBase, option);
     * ... = whiteSplitMultipleFkBase.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteSplitMultipleFkBase The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteSplitMultipleFkBase whiteSplitMultipleFkBase, InsertOption<WhiteSplitMultipleFkBaseCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteSplitMultipleFkBase, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteSplitMultipleFkBase whiteSplitMultipleFkBase = new WhiteSplitMultipleFkBase();
     * whiteSplitMultipleFkBase.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteSplitMultipleFkBase.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteSplitMultipleFkBase.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteSplitMultipleFkBaseCB&gt; option = new UpdateOption&lt;WhiteSplitMultipleFkBaseCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteSplitMultipleFkBaseCB&gt;() {
     *         public void specify(WhiteSplitMultipleFkBaseCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteSplitMultipleFkBaseBhv.<span style="color: #DD4747">varyingUpdate</span>(whiteSplitMultipleFkBase, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSplitMultipleFkBase The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteSplitMultipleFkBase whiteSplitMultipleFkBase, UpdateOption<WhiteSplitMultipleFkBaseCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteSplitMultipleFkBase, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteSplitMultipleFkBase The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteSplitMultipleFkBase whiteSplitMultipleFkBase, InsertOption<WhiteSplitMultipleFkBaseCB> insertOption, UpdateOption<WhiteSplitMultipleFkBaseCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(whiteSplitMultipleFkBase, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteSplitMultipleFkBase The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteSplitMultipleFkBase whiteSplitMultipleFkBase, DeleteOption<WhiteSplitMultipleFkBaseCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteSplitMultipleFkBase, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteSplitMultipleFkBaseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteSplitMultipleFkBase> whiteSplitMultipleFkBaseList, InsertOption<WhiteSplitMultipleFkBaseCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteSplitMultipleFkBaseList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteSplitMultipleFkBaseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteSplitMultipleFkBase> whiteSplitMultipleFkBaseList, UpdateOption<WhiteSplitMultipleFkBaseCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteSplitMultipleFkBaseList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteSplitMultipleFkBaseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteSplitMultipleFkBase> whiteSplitMultipleFkBaseList, DeleteOption<WhiteSplitMultipleFkBaseCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteSplitMultipleFkBaseList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteSplitMultipleFkBase, WhiteSplitMultipleFkBaseCB> setupper, InsertOption<WhiteSplitMultipleFkBaseCB> option) {
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
     * WhiteSplitMultipleFkBase whiteSplitMultipleFkBase = new WhiteSplitMultipleFkBase();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkBase.setPK...(value);</span>
     * whiteSplitMultipleFkBase.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkBase.setVersionNo(value);</span>
     * WhiteSplitMultipleFkBaseCB cb = new WhiteSplitMultipleFkBaseCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteSplitMultipleFkBaseCB&gt; option = new UpdateOption&lt;WhiteSplitMultipleFkBaseCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteSplitMultipleFkBaseCB&gt;() {
     *     public void specify(WhiteSplitMultipleFkBaseCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteSplitMultipleFkBaseBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteSplitMultipleFkBase, cb, option);
     * </pre>
     * @param whiteSplitMultipleFkBase The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteSplitMultipleFkBase. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteSplitMultipleFkBase whiteSplitMultipleFkBase, WhiteSplitMultipleFkBaseCB cb, UpdateOption<WhiteSplitMultipleFkBaseCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteSplitMultipleFkBase, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteSplitMultipleFkBase. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteSplitMultipleFkBaseCB cb, DeleteOption<WhiteSplitMultipleFkBaseCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteSplitMultipleFkBaseBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhiteSplitMultipleFkBaseCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhiteSplitMultipleFkBaseCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhiteSplitMultipleFkBase> void delegateSelectCursor(WhiteSplitMultipleFkBaseCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends WhiteSplitMultipleFkBase> List<ENTITY> delegateSelectList(WhiteSplitMultipleFkBaseCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhiteSplitMultipleFkBase et, InsertOption<WhiteSplitMultipleFkBaseCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(WhiteSplitMultipleFkBase et, UpdateOption<WhiteSplitMultipleFkBaseCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(WhiteSplitMultipleFkBase et, UpdateOption<WhiteSplitMultipleFkBaseCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(WhiteSplitMultipleFkBase et, DeleteOption<WhiteSplitMultipleFkBaseCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(WhiteSplitMultipleFkBase et, DeleteOption<WhiteSplitMultipleFkBaseCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<WhiteSplitMultipleFkBase> ls, InsertOption<WhiteSplitMultipleFkBaseCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhiteSplitMultipleFkBase> ls, UpdateOption<WhiteSplitMultipleFkBaseCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhiteSplitMultipleFkBase> ls, UpdateOption<WhiteSplitMultipleFkBaseCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhiteSplitMultipleFkBase> ls, DeleteOption<WhiteSplitMultipleFkBaseCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhiteSplitMultipleFkBase> ls, DeleteOption<WhiteSplitMultipleFkBaseCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhiteSplitMultipleFkBase et, WhiteSplitMultipleFkBaseCB inCB, ConditionBean resCB, InsertOption<WhiteSplitMultipleFkBaseCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhiteSplitMultipleFkBase et, WhiteSplitMultipleFkBaseCB cb, UpdateOption<WhiteSplitMultipleFkBaseCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(WhiteSplitMultipleFkBaseCB cb, DeleteOption<WhiteSplitMultipleFkBaseCB> op)
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
    //                                                                     Downcast Helper
    //                                                                     ===============
    protected WhiteSplitMultipleFkBase downcast(Entity et) {
        return helpEntityDowncastInternally(et, WhiteSplitMultipleFkBase.class);
    }

    protected WhiteSplitMultipleFkBaseCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, WhiteSplitMultipleFkBaseCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<WhiteSplitMultipleFkBase> downcast(List<? extends Entity> ls) {
        return (List<WhiteSplitMultipleFkBase>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteSplitMultipleFkBaseCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<WhiteSplitMultipleFkBaseCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteSplitMultipleFkBaseCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<WhiteSplitMultipleFkBaseCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteSplitMultipleFkBaseCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<WhiteSplitMultipleFkBaseCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteSplitMultipleFkBase, WhiteSplitMultipleFkBaseCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<WhiteSplitMultipleFkBase, WhiteSplitMultipleFkBaseCB>)sp;
    }
}
