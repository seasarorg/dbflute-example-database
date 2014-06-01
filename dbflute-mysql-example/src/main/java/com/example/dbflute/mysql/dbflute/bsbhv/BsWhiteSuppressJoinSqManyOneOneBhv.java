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
import org.seasar.dbflute.optional.*;
import org.seasar.dbflute.outsidesql.executor.*;
import com.example.dbflute.mysql.dbflute.exbhv.*;
import com.example.dbflute.mysql.dbflute.exentity.*;
import com.example.dbflute.mysql.dbflute.bsentity.dbmeta.*;
import com.example.dbflute.mysql.dbflute.cbean.*;

/**
 * The behavior of WHITE_SUPPRESS_JOIN_SQ_MANY_ONE_ONE as TABLE. <br />
 * <pre>
 * [primary key]
 *     MANY_ONE_ONE_ID
 *
 * [column]
 *     MANY_ONE_ONE_ID, MANY_ONE_ONE_NAME
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
 *     white_suppress_join_sq_many_one
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whiteSuppressJoinSqManyOneList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteSuppressJoinSqManyOneOneBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_suppress_join_sq_many_one_one"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return WhiteSuppressJoinSqManyOneOneDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteSuppressJoinSqManyOneOneDbm getMyDBMeta() { return WhiteSuppressJoinSqManyOneOneDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteSuppressJoinSqManyOneOne newMyEntity() { return new WhiteSuppressJoinSqManyOneOne(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteSuppressJoinSqManyOneOneCB newMyConditionBean() { return new WhiteSuppressJoinSqManyOneOneCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteSuppressJoinSqManyOneOneCB cb = new WhiteSuppressJoinSqManyOneOneCB();
     * cb.query().setFoo...(value);
     * int count = whiteSuppressJoinSqManyOneOneBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteSuppressJoinSqManyOneOne. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteSuppressJoinSqManyOneOneCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteSuppressJoinSqManyOneOneCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteSuppressJoinSqManyOneOneCB cb) { // called by selectPage(cb)
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
     * Select the entity by the condition-bean. #beforejava8 <br />
     * <span style="color: #AD4747; font-size: 120%">The return might be null if no data, so you should have null check.</span> <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, use selectEntityWithDeletedCheck().</span>
     * <pre>
     * WhiteSuppressJoinSqManyOneOneCB cb = new WhiteSuppressJoinSqManyOneOneCB();
     * cb.query().setFoo...(value);
     * WhiteSuppressJoinSqManyOneOne whiteSuppressJoinSqManyOneOne = whiteSuppressJoinSqManyOneOneBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (whiteSuppressJoinSqManyOneOne != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = whiteSuppressJoinSqManyOneOne.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSuppressJoinSqManyOneOne. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSuppressJoinSqManyOneOne selectEntity(WhiteSuppressJoinSqManyOneOneCB cb) {
        return doSelectEntity(cb, WhiteSuppressJoinSqManyOneOne.class);
    }

    protected <ENTITY extends WhiteSuppressJoinSqManyOneOne> ENTITY doSelectEntity(WhiteSuppressJoinSqManyOneOneCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, WhiteSuppressJoinSqManyOneOneCB>() {
            public List<ENTITY> callbackSelectList(WhiteSuppressJoinSqManyOneOneCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    protected <ENTITY extends WhiteSuppressJoinSqManyOneOne> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteSuppressJoinSqManyOneOneCB cb, Class<ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * WhiteSuppressJoinSqManyOneOneCB cb = new WhiteSuppressJoinSqManyOneOneCB();
     * cb.query().setFoo...(value);
     * WhiteSuppressJoinSqManyOneOne whiteSuppressJoinSqManyOneOne = whiteSuppressJoinSqManyOneOneBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteSuppressJoinSqManyOneOne.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteSuppressJoinSqManyOneOne. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSuppressJoinSqManyOneOne selectEntityWithDeletedCheck(WhiteSuppressJoinSqManyOneOneCB cb) {
        return doSelectEntityWithDeletedCheck(cb, WhiteSuppressJoinSqManyOneOne.class);
    }

    protected <ENTITY extends WhiteSuppressJoinSqManyOneOne> ENTITY doSelectEntityWithDeletedCheck(WhiteSuppressJoinSqManyOneOneCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteSuppressJoinSqManyOneOneCB>() {
            public List<ENTITY> callbackSelectList(WhiteSuppressJoinSqManyOneOneCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param manyOneOneId : PK, NotNull, INT(10). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSuppressJoinSqManyOneOne selectByPKValue(Integer manyOneOneId) {
        return doSelectByPK(manyOneOneId, WhiteSuppressJoinSqManyOneOne.class);
    }

    protected <ENTITY extends WhiteSuppressJoinSqManyOneOne> ENTITY doSelectByPK(Integer manyOneOneId, Class<ENTITY> entityType) {
        return doSelectEntity(xprepareCBAsPK(manyOneOneId), entityType);
    }

    protected <ENTITY extends WhiteSuppressJoinSqManyOneOne> OptionalEntity<ENTITY> doSelectOptionalByPK(Integer manyOneOneId, Class<ENTITY> entityType) {
        return createOptionalEntity(doSelectByPK(manyOneOneId, entityType), manyOneOneId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param manyOneOneId : PK, NotNull, INT(10). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSuppressJoinSqManyOneOne selectByPKValueWithDeletedCheck(Integer manyOneOneId) {
        return doSelectByPKWithDeletedCheck(manyOneOneId, WhiteSuppressJoinSqManyOneOne.class);
    }

    protected <ENTITY extends WhiteSuppressJoinSqManyOneOne> ENTITY doSelectByPKWithDeletedCheck(Integer manyOneOneId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(manyOneOneId), entityType);
    }

    protected WhiteSuppressJoinSqManyOneOneCB xprepareCBAsPK(Integer manyOneOneId) {
        assertObjectNotNull("manyOneOneId", manyOneOneId);
        WhiteSuppressJoinSqManyOneOneCB cb = newMyConditionBean(); cb.acceptPrimaryKey(manyOneOneId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteSuppressJoinSqManyOneOneCB cb = new WhiteSuppressJoinSqManyOneOneCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteSuppressJoinSqManyOneOne&gt; whiteSuppressJoinSqManyOneOneList = whiteSuppressJoinSqManyOneOneBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteSuppressJoinSqManyOneOne whiteSuppressJoinSqManyOneOne : whiteSuppressJoinSqManyOneOneList) {
     *     ... = whiteSuppressJoinSqManyOneOne.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSuppressJoinSqManyOneOne. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteSuppressJoinSqManyOneOne> selectList(WhiteSuppressJoinSqManyOneOneCB cb) {
        return doSelectList(cb, WhiteSuppressJoinSqManyOneOne.class);
    }

    protected <ENTITY extends WhiteSuppressJoinSqManyOneOne> ListResultBean<ENTITY> doSelectList(WhiteSuppressJoinSqManyOneOneCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, WhiteSuppressJoinSqManyOneOneCB>() {
            public List<ENTITY> callbackSelectList(WhiteSuppressJoinSqManyOneOneCB lcb, Class<ENTITY> ltp) { return delegateSelectList(lcb, ltp); } });
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
     * WhiteSuppressJoinSqManyOneOneCB cb = new WhiteSuppressJoinSqManyOneOneCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteSuppressJoinSqManyOneOne&gt; page = whiteSuppressJoinSqManyOneOneBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteSuppressJoinSqManyOneOne whiteSuppressJoinSqManyOneOne : page) {
     *     ... = whiteSuppressJoinSqManyOneOne.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSuppressJoinSqManyOneOne. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteSuppressJoinSqManyOneOne> selectPage(WhiteSuppressJoinSqManyOneOneCB cb) {
        return doSelectPage(cb, WhiteSuppressJoinSqManyOneOne.class);
    }

    protected <ENTITY extends WhiteSuppressJoinSqManyOneOne> PagingResultBean<ENTITY> doSelectPage(WhiteSuppressJoinSqManyOneOneCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, WhiteSuppressJoinSqManyOneOneCB>() {
            public int callbackSelectCount(WhiteSuppressJoinSqManyOneOneCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteSuppressJoinSqManyOneOneCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * WhiteSuppressJoinSqManyOneOneCB cb = new WhiteSuppressJoinSqManyOneOneCB();
     * cb.query().setFoo...(value);
     * whiteSuppressJoinSqManyOneOneBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteSuppressJoinSqManyOneOne&gt;() {
     *     public void handle(WhiteSuppressJoinSqManyOneOne entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteSuppressJoinSqManyOneOne. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteSuppressJoinSqManyOneOne. (NotNull)
     */
    public void selectCursor(WhiteSuppressJoinSqManyOneOneCB cb, EntityRowHandler<WhiteSuppressJoinSqManyOneOne> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, WhiteSuppressJoinSqManyOneOne.class);
    }

    protected <ENTITY extends WhiteSuppressJoinSqManyOneOne> void doSelectCursor(WhiteSuppressJoinSqManyOneOneCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, WhiteSuppressJoinSqManyOneOneCB>() {
            public void callbackSelectCursor(WhiteSuppressJoinSqManyOneOneCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(WhiteSuppressJoinSqManyOneOneCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteSuppressJoinSqManyOneOneBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteSuppressJoinSqManyOneOneCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<WhiteSuppressJoinSqManyOneOneCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends WhiteSuppressJoinSqManyOneOneCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends WhiteSuppressJoinSqManyOneOneCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
     * Load referrer of whiteSuppressJoinSqManyOneList by the set-upper of referrer. <br />
     * white_suppress_join_sq_many_one by MANY_ONE_ONE_ID, named 'whiteSuppressJoinSqManyOneList'.
     * <pre>
     * whiteSuppressJoinSqManyOneOneBhv.<span style="color: #DD4747">loadWhiteSuppressJoinSqManyOneList</span>(whiteSuppressJoinSqManyOneOneList, new ConditionBeanSetupper&lt;WhiteSuppressJoinSqManyOneCB&gt;() {
     *     public void setup(WhiteSuppressJoinSqManyOneCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (WhiteSuppressJoinSqManyOneOne whiteSuppressJoinSqManyOneOne : whiteSuppressJoinSqManyOneOneList) {
     *     ... = whiteSuppressJoinSqManyOneOne.<span style="color: #DD4747">getWhiteSuppressJoinSqManyOneList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setManyOneOneId_InScope(pkList);
     * cb.query().addOrderBy_ManyOneOneId_Asc();
     * </pre>
     * @param whiteSuppressJoinSqManyOneOneList The entity list of whiteSuppressJoinSqManyOneOne. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<WhiteSuppressJoinSqManyOne> loadWhiteSuppressJoinSqManyOneList(List<WhiteSuppressJoinSqManyOneOne> whiteSuppressJoinSqManyOneOneList, ConditionBeanSetupper<WhiteSuppressJoinSqManyOneCB> setupper) {
        xassLRArg(whiteSuppressJoinSqManyOneOneList, setupper);
        return doLoadWhiteSuppressJoinSqManyOneList(whiteSuppressJoinSqManyOneOneList, new LoadReferrerOption<WhiteSuppressJoinSqManyOneCB, WhiteSuppressJoinSqManyOne>().xinit(setupper));
    }

    /**
     * Load referrer of whiteSuppressJoinSqManyOneList by the set-upper of referrer. <br />
     * white_suppress_join_sq_many_one by MANY_ONE_ONE_ID, named 'whiteSuppressJoinSqManyOneList'.
     * <pre>
     * whiteSuppressJoinSqManyOneOneBhv.<span style="color: #DD4747">loadWhiteSuppressJoinSqManyOneList</span>(whiteSuppressJoinSqManyOneOneList, new ConditionBeanSetupper&lt;WhiteSuppressJoinSqManyOneCB&gt;() {
     *     public void setup(WhiteSuppressJoinSqManyOneCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = whiteSuppressJoinSqManyOneOne.<span style="color: #DD4747">getWhiteSuppressJoinSqManyOneList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setManyOneOneId_InScope(pkList);
     * cb.query().addOrderBy_ManyOneOneId_Asc();
     * </pre>
     * @param whiteSuppressJoinSqManyOneOne The entity of whiteSuppressJoinSqManyOneOne. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<WhiteSuppressJoinSqManyOne> loadWhiteSuppressJoinSqManyOneList(WhiteSuppressJoinSqManyOneOne whiteSuppressJoinSqManyOneOne, ConditionBeanSetupper<WhiteSuppressJoinSqManyOneCB> setupper) {
        xassLRArg(whiteSuppressJoinSqManyOneOne, setupper);
        return doLoadWhiteSuppressJoinSqManyOneList(xnewLRLs(whiteSuppressJoinSqManyOneOne), new LoadReferrerOption<WhiteSuppressJoinSqManyOneCB, WhiteSuppressJoinSqManyOne>().xinit(setupper));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param whiteSuppressJoinSqManyOneOne The entity of whiteSuppressJoinSqManyOneOne. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<WhiteSuppressJoinSqManyOne> loadWhiteSuppressJoinSqManyOneList(WhiteSuppressJoinSqManyOneOne whiteSuppressJoinSqManyOneOne, LoadReferrerOption<WhiteSuppressJoinSqManyOneCB, WhiteSuppressJoinSqManyOne> loadReferrerOption) {
        xassLRArg(whiteSuppressJoinSqManyOneOne, loadReferrerOption);
        return loadWhiteSuppressJoinSqManyOneList(xnewLRLs(whiteSuppressJoinSqManyOneOne), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean setupper.} #beforejava8
     * @param whiteSuppressJoinSqManyOneOneList The entity list of whiteSuppressJoinSqManyOneOne. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerLoader<WhiteSuppressJoinSqManyOne> loadWhiteSuppressJoinSqManyOneList(List<WhiteSuppressJoinSqManyOneOne> whiteSuppressJoinSqManyOneOneList, LoadReferrerOption<WhiteSuppressJoinSqManyOneCB, WhiteSuppressJoinSqManyOne> loadReferrerOption) {
        xassLRArg(whiteSuppressJoinSqManyOneOneList, loadReferrerOption);
        if (whiteSuppressJoinSqManyOneOneList.isEmpty()) { return (NestedReferrerLoader<WhiteSuppressJoinSqManyOne>)EMPTY_LOADER; }
        return doLoadWhiteSuppressJoinSqManyOneList(whiteSuppressJoinSqManyOneOneList, loadReferrerOption);
    }

    protected NestedReferrerLoader<WhiteSuppressJoinSqManyOne> doLoadWhiteSuppressJoinSqManyOneList(List<WhiteSuppressJoinSqManyOneOne> whiteSuppressJoinSqManyOneOneList, LoadReferrerOption<WhiteSuppressJoinSqManyOneCB, WhiteSuppressJoinSqManyOne> option) {
        final WhiteSuppressJoinSqManyOneBhv referrerBhv = xgetBSFLR().select(WhiteSuppressJoinSqManyOneBhv.class);
        return helpLoadReferrerInternally(whiteSuppressJoinSqManyOneOneList, option, new InternalLoadReferrerCallback<WhiteSuppressJoinSqManyOneOne, Integer, WhiteSuppressJoinSqManyOneCB, WhiteSuppressJoinSqManyOne>() {
            public Integer getPKVal(WhiteSuppressJoinSqManyOneOne et)
            { return et.getManyOneOneId(); }
            public void setRfLs(WhiteSuppressJoinSqManyOneOne et, List<WhiteSuppressJoinSqManyOne> ls)
            { et.setWhiteSuppressJoinSqManyOneList(ls); }
            public WhiteSuppressJoinSqManyOneCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(WhiteSuppressJoinSqManyOneCB cb, List<Integer> ls)
            { cb.query().setManyOneOneId_InScope(ls); }
            public void qyOdFKAsc(WhiteSuppressJoinSqManyOneCB cb) { cb.query().addOrderBy_ManyOneOneId_Asc(); }
            public void spFKCol(WhiteSuppressJoinSqManyOneCB cb) { cb.specify().columnManyOneOneId(); }
            public List<WhiteSuppressJoinSqManyOne> selRfLs(WhiteSuppressJoinSqManyOneCB cb) { return referrerBhv.selectList(cb); }
            public Integer getFKVal(WhiteSuppressJoinSqManyOne re) { return re.getManyOneOneId(); }
            public void setlcEt(WhiteSuppressJoinSqManyOne re, WhiteSuppressJoinSqManyOneOne le)
            { re.setWhiteSuppressJoinSqManyOneOne(le); }
            public String getRfPrNm() { return "whiteSuppressJoinSqManyOneList"; }
        });
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key manyOneOneId.
     * @param whiteSuppressJoinSqManyOneOneList The list of whiteSuppressJoinSqManyOneOne. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractManyOneOneIdList(List<WhiteSuppressJoinSqManyOneOne> whiteSuppressJoinSqManyOneOneList) {
        return helpExtractListInternally(whiteSuppressJoinSqManyOneOneList, new InternalExtractCallback<WhiteSuppressJoinSqManyOneOne, Integer>() {
            public Integer getCV(WhiteSuppressJoinSqManyOneOne et) { return et.getManyOneOneId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteSuppressJoinSqManyOneOne whiteSuppressJoinSqManyOneOne = new WhiteSuppressJoinSqManyOneOne();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteSuppressJoinSqManyOneOne.setFoo...(value);
     * whiteSuppressJoinSqManyOneOne.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqManyOneOne.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqManyOneOne.set...;</span>
     * whiteSuppressJoinSqManyOneOneBhv.<span style="color: #DD4747">insert</span>(whiteSuppressJoinSqManyOneOne);
     * ... = whiteSuppressJoinSqManyOneOne.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteSuppressJoinSqManyOneOne The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteSuppressJoinSqManyOneOne whiteSuppressJoinSqManyOneOne) {
        doInsert(whiteSuppressJoinSqManyOneOne, null);
    }

    protected void doInsert(WhiteSuppressJoinSqManyOneOne whiteSuppressJoinSqManyOneOne, InsertOption<WhiteSuppressJoinSqManyOneOneCB> op) {
        assertObjectNotNull("whiteSuppressJoinSqManyOneOne", whiteSuppressJoinSqManyOneOne);
        prepareInsertOption(op);
        delegateInsert(whiteSuppressJoinSqManyOneOne, op);
    }

    protected void prepareInsertOption(InsertOption<WhiteSuppressJoinSqManyOneOneCB> op) {
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
     * WhiteSuppressJoinSqManyOneOne whiteSuppressJoinSqManyOneOne = new WhiteSuppressJoinSqManyOneOne();
     * whiteSuppressJoinSqManyOneOne.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteSuppressJoinSqManyOneOne.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqManyOneOne.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqManyOneOne.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteSuppressJoinSqManyOneOne.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteSuppressJoinSqManyOneOneBhv.<span style="color: #DD4747">update</span>(whiteSuppressJoinSqManyOneOne);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSuppressJoinSqManyOneOne The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final WhiteSuppressJoinSqManyOneOne whiteSuppressJoinSqManyOneOne) {
        doUpdate(whiteSuppressJoinSqManyOneOne, null);
    }

    protected void doUpdate(WhiteSuppressJoinSqManyOneOne whiteSuppressJoinSqManyOneOne, final UpdateOption<WhiteSuppressJoinSqManyOneOneCB> op) {
        assertObjectNotNull("whiteSuppressJoinSqManyOneOne", whiteSuppressJoinSqManyOneOne);
        prepareUpdateOption(op);
        helpUpdateInternally(whiteSuppressJoinSqManyOneOne, new InternalUpdateCallback<WhiteSuppressJoinSqManyOneOne>() {
            public int callbackDelegateUpdate(WhiteSuppressJoinSqManyOneOne et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhiteSuppressJoinSqManyOneOneCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected WhiteSuppressJoinSqManyOneOneCB createCBForVaryingUpdate() {
        WhiteSuppressJoinSqManyOneOneCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected WhiteSuppressJoinSqManyOneOneCB createCBForSpecifiedUpdate() {
        WhiteSuppressJoinSqManyOneOneCB cb = newMyConditionBean();
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
     * @param whiteSuppressJoinSqManyOneOne The entity of insert or update target. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteSuppressJoinSqManyOneOne whiteSuppressJoinSqManyOneOne) {
        doInesrtOrUpdate(whiteSuppressJoinSqManyOneOne, null, null);
    }

    protected void doInesrtOrUpdate(WhiteSuppressJoinSqManyOneOne whiteSuppressJoinSqManyOneOne, final InsertOption<WhiteSuppressJoinSqManyOneOneCB> iop, final UpdateOption<WhiteSuppressJoinSqManyOneOneCB> uop) {
        helpInsertOrUpdateInternally(whiteSuppressJoinSqManyOneOne, new InternalInsertOrUpdateCallback<WhiteSuppressJoinSqManyOneOne, WhiteSuppressJoinSqManyOneOneCB>() {
            public void callbackInsert(WhiteSuppressJoinSqManyOneOne et) { doInsert(et, iop); }
            public void callbackUpdate(WhiteSuppressJoinSqManyOneOne et) { doUpdate(et, uop); }
            public WhiteSuppressJoinSqManyOneOneCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(WhiteSuppressJoinSqManyOneOneCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<WhiteSuppressJoinSqManyOneOneCB>();
            uop = uop != null ? uop : new UpdateOption<WhiteSuppressJoinSqManyOneOneCB>();
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
     * WhiteSuppressJoinSqManyOneOne whiteSuppressJoinSqManyOneOne = new WhiteSuppressJoinSqManyOneOne();
     * whiteSuppressJoinSqManyOneOne.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteSuppressJoinSqManyOneOne.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteSuppressJoinSqManyOneOneBhv.<span style="color: #DD4747">delete</span>(whiteSuppressJoinSqManyOneOne);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSuppressJoinSqManyOneOne The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteSuppressJoinSqManyOneOne whiteSuppressJoinSqManyOneOne) {
        doDelete(whiteSuppressJoinSqManyOneOne, null);
    }

    protected void doDelete(WhiteSuppressJoinSqManyOneOne whiteSuppressJoinSqManyOneOne, final DeleteOption<WhiteSuppressJoinSqManyOneOneCB> op) {
        assertObjectNotNull("whiteSuppressJoinSqManyOneOne", whiteSuppressJoinSqManyOneOne);
        prepareDeleteOption(op);
        helpDeleteInternally(whiteSuppressJoinSqManyOneOne, new InternalDeleteCallback<WhiteSuppressJoinSqManyOneOne>() {
            public int callbackDelegateDelete(WhiteSuppressJoinSqManyOneOne et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhiteSuppressJoinSqManyOneOneCB> op) {
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
     *     WhiteSuppressJoinSqManyOneOne whiteSuppressJoinSqManyOneOne = new WhiteSuppressJoinSqManyOneOne();
     *     whiteSuppressJoinSqManyOneOne.setFooName("foo");
     *     if (...) {
     *         whiteSuppressJoinSqManyOneOne.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteSuppressJoinSqManyOneOneList.add(whiteSuppressJoinSqManyOneOne);
     * }
     * whiteSuppressJoinSqManyOneOneBhv.<span style="color: #DD4747">batchInsert</span>(whiteSuppressJoinSqManyOneOneList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteSuppressJoinSqManyOneOneList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteSuppressJoinSqManyOneOne> whiteSuppressJoinSqManyOneOneList) {
        InsertOption<WhiteSuppressJoinSqManyOneOneCB> op = createInsertUpdateOption();
        return doBatchInsert(whiteSuppressJoinSqManyOneOneList, op);
    }

    protected int[] doBatchInsert(List<WhiteSuppressJoinSqManyOneOne> whiteSuppressJoinSqManyOneOneList, InsertOption<WhiteSuppressJoinSqManyOneOneCB> op) {
        assertObjectNotNull("whiteSuppressJoinSqManyOneOneList", whiteSuppressJoinSqManyOneOneList);
        prepareBatchInsertOption(whiteSuppressJoinSqManyOneOneList, op);
        return delegateBatchInsert(whiteSuppressJoinSqManyOneOneList, op);
    }

    protected void prepareBatchInsertOption(List<WhiteSuppressJoinSqManyOneOne> whiteSuppressJoinSqManyOneOneList, InsertOption<WhiteSuppressJoinSqManyOneOneCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(whiteSuppressJoinSqManyOneOneList);
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
     *     WhiteSuppressJoinSqManyOneOne whiteSuppressJoinSqManyOneOne = new WhiteSuppressJoinSqManyOneOne();
     *     whiteSuppressJoinSqManyOneOne.setFooName("foo");
     *     if (...) {
     *         whiteSuppressJoinSqManyOneOne.setFooPrice(123);
     *     } else {
     *         whiteSuppressJoinSqManyOneOne.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteSuppressJoinSqManyOneOne.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteSuppressJoinSqManyOneOneList.add(whiteSuppressJoinSqManyOneOne);
     * }
     * whiteSuppressJoinSqManyOneOneBhv.<span style="color: #DD4747">batchUpdate</span>(whiteSuppressJoinSqManyOneOneList);
     * </pre>
     * @param whiteSuppressJoinSqManyOneOneList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteSuppressJoinSqManyOneOne> whiteSuppressJoinSqManyOneOneList) {
        UpdateOption<WhiteSuppressJoinSqManyOneOneCB> op = createPlainUpdateOption();
        return doBatchUpdate(whiteSuppressJoinSqManyOneOneList, op);
    }

    protected int[] doBatchUpdate(List<WhiteSuppressJoinSqManyOneOne> whiteSuppressJoinSqManyOneOneList, UpdateOption<WhiteSuppressJoinSqManyOneOneCB> op) {
        assertObjectNotNull("whiteSuppressJoinSqManyOneOneList", whiteSuppressJoinSqManyOneOneList);
        prepareBatchUpdateOption(whiteSuppressJoinSqManyOneOneList, op);
        return delegateBatchUpdate(whiteSuppressJoinSqManyOneOneList, op);
    }

    protected void prepareBatchUpdateOption(List<WhiteSuppressJoinSqManyOneOne> whiteSuppressJoinSqManyOneOneList, UpdateOption<WhiteSuppressJoinSqManyOneOneCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(whiteSuppressJoinSqManyOneOneList);
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
     * whiteSuppressJoinSqManyOneOneBhv.<span style="color: #DD4747">batchUpdate</span>(whiteSuppressJoinSqManyOneOneList, new SpecifyQuery<WhiteSuppressJoinSqManyOneOneCB>() {
     *     public void specify(WhiteSuppressJoinSqManyOneOneCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteSuppressJoinSqManyOneOneBhv.<span style="color: #DD4747">batchUpdate</span>(whiteSuppressJoinSqManyOneOneList, new SpecifyQuery<WhiteSuppressJoinSqManyOneOneCB>() {
     *     public void specify(WhiteSuppressJoinSqManyOneOneCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteSuppressJoinSqManyOneOneList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteSuppressJoinSqManyOneOne> whiteSuppressJoinSqManyOneOneList, SpecifyQuery<WhiteSuppressJoinSqManyOneOneCB> updateColumnSpec) {
        return doBatchUpdate(whiteSuppressJoinSqManyOneOneList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteSuppressJoinSqManyOneOneList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteSuppressJoinSqManyOneOne> whiteSuppressJoinSqManyOneOneList) {
        return doBatchDelete(whiteSuppressJoinSqManyOneOneList, null);
    }

    protected int[] doBatchDelete(List<WhiteSuppressJoinSqManyOneOne> whiteSuppressJoinSqManyOneOneList, DeleteOption<WhiteSuppressJoinSqManyOneOneCB> op) {
        assertObjectNotNull("whiteSuppressJoinSqManyOneOneList", whiteSuppressJoinSqManyOneOneList);
        prepareDeleteOption(op);
        return delegateBatchDelete(whiteSuppressJoinSqManyOneOneList, op);
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
     * whiteSuppressJoinSqManyOneOneBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteSuppressJoinSqManyOneOne, WhiteSuppressJoinSqManyOneOneCB&gt;() {
     *     public ConditionBean setup(whiteSuppressJoinSqManyOneOne entity, WhiteSuppressJoinSqManyOneOneCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteSuppressJoinSqManyOneOne, WhiteSuppressJoinSqManyOneOneCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteSuppressJoinSqManyOneOne, WhiteSuppressJoinSqManyOneOneCB> sp, InsertOption<WhiteSuppressJoinSqManyOneOneCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        WhiteSuppressJoinSqManyOneOne e = new WhiteSuppressJoinSqManyOneOne();
        WhiteSuppressJoinSqManyOneOneCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected WhiteSuppressJoinSqManyOneOneCB createCBForQueryInsert() {
        WhiteSuppressJoinSqManyOneOneCB cb = newMyConditionBean();
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
     * WhiteSuppressJoinSqManyOneOne whiteSuppressJoinSqManyOneOne = new WhiteSuppressJoinSqManyOneOne();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqManyOneOne.setPK...(value);</span>
     * whiteSuppressJoinSqManyOneOne.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqManyOneOne.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqManyOneOne.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqManyOneOne.setVersionNo(value);</span>
     * WhiteSuppressJoinSqManyOneOneCB cb = new WhiteSuppressJoinSqManyOneOneCB();
     * cb.query().setFoo...(value);
     * whiteSuppressJoinSqManyOneOneBhv.<span style="color: #DD4747">queryUpdate</span>(whiteSuppressJoinSqManyOneOne, cb);
     * </pre>
     * @param whiteSuppressJoinSqManyOneOne The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteSuppressJoinSqManyOneOne. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteSuppressJoinSqManyOneOne whiteSuppressJoinSqManyOneOne, WhiteSuppressJoinSqManyOneOneCB cb) {
        return doQueryUpdate(whiteSuppressJoinSqManyOneOne, cb, null);
    }

    protected int doQueryUpdate(WhiteSuppressJoinSqManyOneOne whiteSuppressJoinSqManyOneOne, WhiteSuppressJoinSqManyOneOneCB cb, UpdateOption<WhiteSuppressJoinSqManyOneOneCB> op) {
        assertObjectNotNull("whiteSuppressJoinSqManyOneOne", whiteSuppressJoinSqManyOneOne); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(whiteSuppressJoinSqManyOneOne, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (WhiteSuppressJoinSqManyOneOneCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (WhiteSuppressJoinSqManyOneOneCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteSuppressJoinSqManyOneOneCB cb = new WhiteSuppressJoinSqManyOneOneCB();
     * cb.query().setFoo...(value);
     * whiteSuppressJoinSqManyOneOneBhv.<span style="color: #DD4747">queryDelete</span>(whiteSuppressJoinSqManyOneOne, cb);
     * </pre>
     * @param cb The condition-bean of WhiteSuppressJoinSqManyOneOne. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteSuppressJoinSqManyOneOneCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteSuppressJoinSqManyOneOneCB cb, DeleteOption<WhiteSuppressJoinSqManyOneOneCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((WhiteSuppressJoinSqManyOneOneCB)cb); }
        else { return varyingQueryDelete((WhiteSuppressJoinSqManyOneOneCB)cb, downcast(op)); }
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
     * WhiteSuppressJoinSqManyOneOne whiteSuppressJoinSqManyOneOne = new WhiteSuppressJoinSqManyOneOne();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteSuppressJoinSqManyOneOne.setFoo...(value);
     * whiteSuppressJoinSqManyOneOne.setBar...(value);
     * InsertOption<WhiteSuppressJoinSqManyOneOneCB> option = new InsertOption<WhiteSuppressJoinSqManyOneOneCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteSuppressJoinSqManyOneOneBhv.<span style="color: #DD4747">varyingInsert</span>(whiteSuppressJoinSqManyOneOne, option);
     * ... = whiteSuppressJoinSqManyOneOne.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteSuppressJoinSqManyOneOne The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteSuppressJoinSqManyOneOne whiteSuppressJoinSqManyOneOne, InsertOption<WhiteSuppressJoinSqManyOneOneCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteSuppressJoinSqManyOneOne, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteSuppressJoinSqManyOneOne whiteSuppressJoinSqManyOneOne = new WhiteSuppressJoinSqManyOneOne();
     * whiteSuppressJoinSqManyOneOne.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteSuppressJoinSqManyOneOne.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteSuppressJoinSqManyOneOne.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteSuppressJoinSqManyOneOneCB&gt; option = new UpdateOption&lt;WhiteSuppressJoinSqManyOneOneCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteSuppressJoinSqManyOneOneCB&gt;() {
     *         public void specify(WhiteSuppressJoinSqManyOneOneCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteSuppressJoinSqManyOneOneBhv.<span style="color: #DD4747">varyingUpdate</span>(whiteSuppressJoinSqManyOneOne, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSuppressJoinSqManyOneOne The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteSuppressJoinSqManyOneOne whiteSuppressJoinSqManyOneOne, UpdateOption<WhiteSuppressJoinSqManyOneOneCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteSuppressJoinSqManyOneOne, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteSuppressJoinSqManyOneOne The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteSuppressJoinSqManyOneOne whiteSuppressJoinSqManyOneOne, InsertOption<WhiteSuppressJoinSqManyOneOneCB> insertOption, UpdateOption<WhiteSuppressJoinSqManyOneOneCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(whiteSuppressJoinSqManyOneOne, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteSuppressJoinSqManyOneOne The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteSuppressJoinSqManyOneOne whiteSuppressJoinSqManyOneOne, DeleteOption<WhiteSuppressJoinSqManyOneOneCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteSuppressJoinSqManyOneOne, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteSuppressJoinSqManyOneOneList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteSuppressJoinSqManyOneOne> whiteSuppressJoinSqManyOneOneList, InsertOption<WhiteSuppressJoinSqManyOneOneCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteSuppressJoinSqManyOneOneList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteSuppressJoinSqManyOneOneList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteSuppressJoinSqManyOneOne> whiteSuppressJoinSqManyOneOneList, UpdateOption<WhiteSuppressJoinSqManyOneOneCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteSuppressJoinSqManyOneOneList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteSuppressJoinSqManyOneOneList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteSuppressJoinSqManyOneOne> whiteSuppressJoinSqManyOneOneList, DeleteOption<WhiteSuppressJoinSqManyOneOneCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteSuppressJoinSqManyOneOneList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteSuppressJoinSqManyOneOne, WhiteSuppressJoinSqManyOneOneCB> setupper, InsertOption<WhiteSuppressJoinSqManyOneOneCB> option) {
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
     * WhiteSuppressJoinSqManyOneOne whiteSuppressJoinSqManyOneOne = new WhiteSuppressJoinSqManyOneOne();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqManyOneOne.setPK...(value);</span>
     * whiteSuppressJoinSqManyOneOne.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqManyOneOne.setVersionNo(value);</span>
     * WhiteSuppressJoinSqManyOneOneCB cb = new WhiteSuppressJoinSqManyOneOneCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteSuppressJoinSqManyOneOneCB&gt; option = new UpdateOption&lt;WhiteSuppressJoinSqManyOneOneCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteSuppressJoinSqManyOneOneCB&gt;() {
     *     public void specify(WhiteSuppressJoinSqManyOneOneCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteSuppressJoinSqManyOneOneBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteSuppressJoinSqManyOneOne, cb, option);
     * </pre>
     * @param whiteSuppressJoinSqManyOneOne The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteSuppressJoinSqManyOneOne. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteSuppressJoinSqManyOneOne whiteSuppressJoinSqManyOneOne, WhiteSuppressJoinSqManyOneOneCB cb, UpdateOption<WhiteSuppressJoinSqManyOneOneCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteSuppressJoinSqManyOneOne, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteSuppressJoinSqManyOneOne. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteSuppressJoinSqManyOneOneCB cb, DeleteOption<WhiteSuppressJoinSqManyOneOneCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteSuppressJoinSqManyOneOneBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhiteSuppressJoinSqManyOneOneCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhiteSuppressJoinSqManyOneOneCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhiteSuppressJoinSqManyOneOne> void delegateSelectCursor(WhiteSuppressJoinSqManyOneOneCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends WhiteSuppressJoinSqManyOneOne> List<ENTITY> delegateSelectList(WhiteSuppressJoinSqManyOneOneCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhiteSuppressJoinSqManyOneOne et, InsertOption<WhiteSuppressJoinSqManyOneOneCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(WhiteSuppressJoinSqManyOneOne et, UpdateOption<WhiteSuppressJoinSqManyOneOneCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(WhiteSuppressJoinSqManyOneOne et, UpdateOption<WhiteSuppressJoinSqManyOneOneCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(WhiteSuppressJoinSqManyOneOne et, DeleteOption<WhiteSuppressJoinSqManyOneOneCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(WhiteSuppressJoinSqManyOneOne et, DeleteOption<WhiteSuppressJoinSqManyOneOneCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<WhiteSuppressJoinSqManyOneOne> ls, InsertOption<WhiteSuppressJoinSqManyOneOneCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhiteSuppressJoinSqManyOneOne> ls, UpdateOption<WhiteSuppressJoinSqManyOneOneCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhiteSuppressJoinSqManyOneOne> ls, UpdateOption<WhiteSuppressJoinSqManyOneOneCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhiteSuppressJoinSqManyOneOne> ls, DeleteOption<WhiteSuppressJoinSqManyOneOneCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhiteSuppressJoinSqManyOneOne> ls, DeleteOption<WhiteSuppressJoinSqManyOneOneCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhiteSuppressJoinSqManyOneOne et, WhiteSuppressJoinSqManyOneOneCB inCB, ConditionBean resCB, InsertOption<WhiteSuppressJoinSqManyOneOneCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhiteSuppressJoinSqManyOneOne et, WhiteSuppressJoinSqManyOneOneCB cb, UpdateOption<WhiteSuppressJoinSqManyOneOneCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(WhiteSuppressJoinSqManyOneOneCB cb, DeleteOption<WhiteSuppressJoinSqManyOneOneCB> op)
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
    protected WhiteSuppressJoinSqManyOneOne downcast(Entity et) {
        return helpEntityDowncastInternally(et, WhiteSuppressJoinSqManyOneOne.class);
    }

    protected WhiteSuppressJoinSqManyOneOneCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, WhiteSuppressJoinSqManyOneOneCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<WhiteSuppressJoinSqManyOneOne> downcast(List<? extends Entity> ls) {
        return (List<WhiteSuppressJoinSqManyOneOne>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteSuppressJoinSqManyOneOneCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<WhiteSuppressJoinSqManyOneOneCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteSuppressJoinSqManyOneOneCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<WhiteSuppressJoinSqManyOneOneCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteSuppressJoinSqManyOneOneCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<WhiteSuppressJoinSqManyOneOneCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteSuppressJoinSqManyOneOne, WhiteSuppressJoinSqManyOneOneCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<WhiteSuppressJoinSqManyOneOne, WhiteSuppressJoinSqManyOneOneCB>)sp;
    }
}