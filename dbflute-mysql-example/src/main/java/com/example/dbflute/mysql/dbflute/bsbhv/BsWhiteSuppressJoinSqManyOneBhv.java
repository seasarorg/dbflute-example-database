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
import org.seasar.dbflute.optional.OptionalEntity;
import org.seasar.dbflute.outsidesql.executor.*;
import com.example.dbflute.mysql.dbflute.exbhv.*;
import com.example.dbflute.mysql.dbflute.exentity.*;
import com.example.dbflute.mysql.dbflute.bsentity.dbmeta.*;
import com.example.dbflute.mysql.dbflute.cbean.*;

/**
 * The behavior of WHITE_SUPPRESS_JOIN_SQ_MANY_ONE as TABLE. <br />
 * <pre>
 * [primary key]
 *     MANY_ONE_ID
 *
 * [column]
 *     MANY_ONE_ID, MANY_ONE_NAME, MANY_ONE_ONE_ID
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
 *     white_suppress_join_sq_many_one_one
 *
 * [referrer table]
 *     white_suppress_join_sq_many
 *
 * [foreign property]
 *     whiteSuppressJoinSqManyOneOne
 *
 * [referrer property]
 *     whiteSuppressJoinSqManyList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteSuppressJoinSqManyOneBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_suppress_join_sq_many_one"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return WhiteSuppressJoinSqManyOneDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteSuppressJoinSqManyOneDbm getMyDBMeta() { return WhiteSuppressJoinSqManyOneDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteSuppressJoinSqManyOne newMyEntity() { return new WhiteSuppressJoinSqManyOne(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteSuppressJoinSqManyOneCB newMyConditionBean() { return new WhiteSuppressJoinSqManyOneCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteSuppressJoinSqManyOneCB cb = new WhiteSuppressJoinSqManyOneCB();
     * cb.query().setFoo...(value);
     * int count = whiteSuppressJoinSqManyOneBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteSuppressJoinSqManyOne. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteSuppressJoinSqManyOneCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteSuppressJoinSqManyOneCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteSuppressJoinSqManyOneCB cb) { // called by selectPage(cb)
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
     * WhiteSuppressJoinSqManyOneCB cb = new WhiteSuppressJoinSqManyOneCB();
     * cb.query().setFoo...(value);
     * WhiteSuppressJoinSqManyOne whiteSuppressJoinSqManyOne = whiteSuppressJoinSqManyOneBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (whiteSuppressJoinSqManyOne != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = whiteSuppressJoinSqManyOne.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSuppressJoinSqManyOne. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSuppressJoinSqManyOne selectEntity(WhiteSuppressJoinSqManyOneCB cb) {
        return doSelectEntity(cb, WhiteSuppressJoinSqManyOne.class);
    }

    protected <ENTITY extends WhiteSuppressJoinSqManyOne> ENTITY doSelectEntity(WhiteSuppressJoinSqManyOneCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, WhiteSuppressJoinSqManyOneCB>() {
            public List<ENTITY> callbackSelectList(WhiteSuppressJoinSqManyOneCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    protected <ENTITY extends WhiteSuppressJoinSqManyOne> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteSuppressJoinSqManyOneCB cb, Class<ENTITY> tp) {
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
     * WhiteSuppressJoinSqManyOneCB cb = new WhiteSuppressJoinSqManyOneCB();
     * cb.query().setFoo...(value);
     * WhiteSuppressJoinSqManyOne whiteSuppressJoinSqManyOne = whiteSuppressJoinSqManyOneBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteSuppressJoinSqManyOne.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteSuppressJoinSqManyOne. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSuppressJoinSqManyOne selectEntityWithDeletedCheck(WhiteSuppressJoinSqManyOneCB cb) {
        return doSelectEntityWithDeletedCheck(cb, WhiteSuppressJoinSqManyOne.class);
    }

    protected <ENTITY extends WhiteSuppressJoinSqManyOne> ENTITY doSelectEntityWithDeletedCheck(WhiteSuppressJoinSqManyOneCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteSuppressJoinSqManyOneCB>() {
            public List<ENTITY> callbackSelectList(WhiteSuppressJoinSqManyOneCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param manyOneId : PK, NotNull, INT(10). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSuppressJoinSqManyOne selectByPKValue(Integer manyOneId) {
        return doSelectByPK(manyOneId, WhiteSuppressJoinSqManyOne.class);
    }

    protected <ENTITY extends WhiteSuppressJoinSqManyOne> ENTITY doSelectByPK(Integer manyOneId, Class<ENTITY> entityType) {
        return doSelectEntity(xprepareCBAsPK(manyOneId), entityType);
    }

    protected <ENTITY extends WhiteSuppressJoinSqManyOne> OptionalEntity<ENTITY> doSelectOptionalByPK(Integer manyOneId, Class<ENTITY> entityType) {
        return createOptionalEntity(doSelectByPK(manyOneId, entityType), manyOneId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param manyOneId : PK, NotNull, INT(10). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSuppressJoinSqManyOne selectByPKValueWithDeletedCheck(Integer manyOneId) {
        return doSelectByPKWithDeletedCheck(manyOneId, WhiteSuppressJoinSqManyOne.class);
    }

    protected <ENTITY extends WhiteSuppressJoinSqManyOne> ENTITY doSelectByPKWithDeletedCheck(Integer manyOneId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(manyOneId), entityType);
    }

    protected WhiteSuppressJoinSqManyOneCB xprepareCBAsPK(Integer manyOneId) {
        assertObjectNotNull("manyOneId", manyOneId);
        WhiteSuppressJoinSqManyOneCB cb = newMyConditionBean(); cb.acceptPrimaryKey(manyOneId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteSuppressJoinSqManyOneCB cb = new WhiteSuppressJoinSqManyOneCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteSuppressJoinSqManyOne&gt; whiteSuppressJoinSqManyOneList = whiteSuppressJoinSqManyOneBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteSuppressJoinSqManyOne whiteSuppressJoinSqManyOne : whiteSuppressJoinSqManyOneList) {
     *     ... = whiteSuppressJoinSqManyOne.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSuppressJoinSqManyOne. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteSuppressJoinSqManyOne> selectList(WhiteSuppressJoinSqManyOneCB cb) {
        return doSelectList(cb, WhiteSuppressJoinSqManyOne.class);
    }

    protected <ENTITY extends WhiteSuppressJoinSqManyOne> ListResultBean<ENTITY> doSelectList(WhiteSuppressJoinSqManyOneCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, WhiteSuppressJoinSqManyOneCB>() {
            public List<ENTITY> callbackSelectList(WhiteSuppressJoinSqManyOneCB lcb, Class<ENTITY> ltp) { return delegateSelectList(lcb, ltp); } });
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
     * WhiteSuppressJoinSqManyOneCB cb = new WhiteSuppressJoinSqManyOneCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteSuppressJoinSqManyOne&gt; page = whiteSuppressJoinSqManyOneBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteSuppressJoinSqManyOne whiteSuppressJoinSqManyOne : page) {
     *     ... = whiteSuppressJoinSqManyOne.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSuppressJoinSqManyOne. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteSuppressJoinSqManyOne> selectPage(WhiteSuppressJoinSqManyOneCB cb) {
        return doSelectPage(cb, WhiteSuppressJoinSqManyOne.class);
    }

    protected <ENTITY extends WhiteSuppressJoinSqManyOne> PagingResultBean<ENTITY> doSelectPage(WhiteSuppressJoinSqManyOneCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, WhiteSuppressJoinSqManyOneCB>() {
            public int callbackSelectCount(WhiteSuppressJoinSqManyOneCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteSuppressJoinSqManyOneCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * WhiteSuppressJoinSqManyOneCB cb = new WhiteSuppressJoinSqManyOneCB();
     * cb.query().setFoo...(value);
     * whiteSuppressJoinSqManyOneBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteSuppressJoinSqManyOne&gt;() {
     *     public void handle(WhiteSuppressJoinSqManyOne entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteSuppressJoinSqManyOne. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteSuppressJoinSqManyOne. (NotNull)
     */
    public void selectCursor(WhiteSuppressJoinSqManyOneCB cb, EntityRowHandler<WhiteSuppressJoinSqManyOne> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, WhiteSuppressJoinSqManyOne.class);
    }

    protected <ENTITY extends WhiteSuppressJoinSqManyOne> void doSelectCursor(WhiteSuppressJoinSqManyOneCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, WhiteSuppressJoinSqManyOneCB>() {
            public void callbackSelectCursor(WhiteSuppressJoinSqManyOneCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(WhiteSuppressJoinSqManyOneCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteSuppressJoinSqManyOneBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteSuppressJoinSqManyOneCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<WhiteSuppressJoinSqManyOneCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends WhiteSuppressJoinSqManyOneCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends WhiteSuppressJoinSqManyOneCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
     * Load referrer of whiteSuppressJoinSqManyList by the set-upper of referrer. <br />
     * white_suppress_join_sq_many by MANY_ONE_ID, named 'whiteSuppressJoinSqManyList'.
     * <pre>
     * whiteSuppressJoinSqManyOneBhv.<span style="color: #DD4747">loadWhiteSuppressJoinSqManyList</span>(whiteSuppressJoinSqManyOneList, new ConditionBeanSetupper&lt;WhiteSuppressJoinSqManyCB&gt;() {
     *     public void setup(WhiteSuppressJoinSqManyCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (WhiteSuppressJoinSqManyOne whiteSuppressJoinSqManyOne : whiteSuppressJoinSqManyOneList) {
     *     ... = whiteSuppressJoinSqManyOne.<span style="color: #DD4747">getWhiteSuppressJoinSqManyList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setManyOneId_InScope(pkList);
     * cb.query().addOrderBy_ManyOneId_Asc();
     * </pre>
     * @param whiteSuppressJoinSqManyOneList The entity list of whiteSuppressJoinSqManyOne. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<WhiteSuppressJoinSqMany> loadWhiteSuppressJoinSqManyList(List<WhiteSuppressJoinSqManyOne> whiteSuppressJoinSqManyOneList, ConditionBeanSetupper<WhiteSuppressJoinSqManyCB> setupper) {
        xassLRArg(whiteSuppressJoinSqManyOneList, setupper);
        return doLoadWhiteSuppressJoinSqManyList(whiteSuppressJoinSqManyOneList, new LoadReferrerOption<WhiteSuppressJoinSqManyCB, WhiteSuppressJoinSqMany>().xinit(setupper));
    }

    /**
     * Load referrer of whiteSuppressJoinSqManyList by the set-upper of referrer. <br />
     * white_suppress_join_sq_many by MANY_ONE_ID, named 'whiteSuppressJoinSqManyList'.
     * <pre>
     * whiteSuppressJoinSqManyOneBhv.<span style="color: #DD4747">loadWhiteSuppressJoinSqManyList</span>(whiteSuppressJoinSqManyOneList, new ConditionBeanSetupper&lt;WhiteSuppressJoinSqManyCB&gt;() {
     *     public void setup(WhiteSuppressJoinSqManyCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = whiteSuppressJoinSqManyOne.<span style="color: #DD4747">getWhiteSuppressJoinSqManyList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setManyOneId_InScope(pkList);
     * cb.query().addOrderBy_ManyOneId_Asc();
     * </pre>
     * @param whiteSuppressJoinSqManyOne The entity of whiteSuppressJoinSqManyOne. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<WhiteSuppressJoinSqMany> loadWhiteSuppressJoinSqManyList(WhiteSuppressJoinSqManyOne whiteSuppressJoinSqManyOne, ConditionBeanSetupper<WhiteSuppressJoinSqManyCB> setupper) {
        xassLRArg(whiteSuppressJoinSqManyOne, setupper);
        return doLoadWhiteSuppressJoinSqManyList(xnewLRLs(whiteSuppressJoinSqManyOne), new LoadReferrerOption<WhiteSuppressJoinSqManyCB, WhiteSuppressJoinSqMany>().xinit(setupper));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param whiteSuppressJoinSqManyOne The entity of whiteSuppressJoinSqManyOne. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<WhiteSuppressJoinSqMany> loadWhiteSuppressJoinSqManyList(WhiteSuppressJoinSqManyOne whiteSuppressJoinSqManyOne, LoadReferrerOption<WhiteSuppressJoinSqManyCB, WhiteSuppressJoinSqMany> loadReferrerOption) {
        xassLRArg(whiteSuppressJoinSqManyOne, loadReferrerOption);
        return loadWhiteSuppressJoinSqManyList(xnewLRLs(whiteSuppressJoinSqManyOne), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean setupper.} #beforejava8
     * @param whiteSuppressJoinSqManyOneList The entity list of whiteSuppressJoinSqManyOne. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerLoader<WhiteSuppressJoinSqMany> loadWhiteSuppressJoinSqManyList(List<WhiteSuppressJoinSqManyOne> whiteSuppressJoinSqManyOneList, LoadReferrerOption<WhiteSuppressJoinSqManyCB, WhiteSuppressJoinSqMany> loadReferrerOption) {
        xassLRArg(whiteSuppressJoinSqManyOneList, loadReferrerOption);
        if (whiteSuppressJoinSqManyOneList.isEmpty()) { return (NestedReferrerLoader<WhiteSuppressJoinSqMany>)EMPTY_LOADER; }
        return doLoadWhiteSuppressJoinSqManyList(whiteSuppressJoinSqManyOneList, loadReferrerOption);
    }

    protected NestedReferrerLoader<WhiteSuppressJoinSqMany> doLoadWhiteSuppressJoinSqManyList(List<WhiteSuppressJoinSqManyOne> whiteSuppressJoinSqManyOneList, LoadReferrerOption<WhiteSuppressJoinSqManyCB, WhiteSuppressJoinSqMany> option) {
        final WhiteSuppressJoinSqManyBhv referrerBhv = xgetBSFLR().select(WhiteSuppressJoinSqManyBhv.class);
        return helpLoadReferrerInternally(whiteSuppressJoinSqManyOneList, option, new InternalLoadReferrerCallback<WhiteSuppressJoinSqManyOne, Integer, WhiteSuppressJoinSqManyCB, WhiteSuppressJoinSqMany>() {
            public Integer getPKVal(WhiteSuppressJoinSqManyOne et)
            { return et.getManyOneId(); }
            public void setRfLs(WhiteSuppressJoinSqManyOne et, List<WhiteSuppressJoinSqMany> ls)
            { et.setWhiteSuppressJoinSqManyList(ls); }
            public WhiteSuppressJoinSqManyCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(WhiteSuppressJoinSqManyCB cb, List<Integer> ls)
            { cb.query().setManyOneId_InScope(ls); }
            public void qyOdFKAsc(WhiteSuppressJoinSqManyCB cb) { cb.query().addOrderBy_ManyOneId_Asc(); }
            public void spFKCol(WhiteSuppressJoinSqManyCB cb) { cb.specify().columnManyOneId(); }
            public List<WhiteSuppressJoinSqMany> selRfLs(WhiteSuppressJoinSqManyCB cb) { return referrerBhv.selectList(cb); }
            public Integer getFKVal(WhiteSuppressJoinSqMany re) { return re.getManyOneId(); }
            public void setlcEt(WhiteSuppressJoinSqMany re, WhiteSuppressJoinSqManyOne le)
            { re.setWhiteSuppressJoinSqManyOne(le); }
            public String getRfPrNm() { return "whiteSuppressJoinSqManyList"; }
        });
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'WhiteSuppressJoinSqManyOneOne'.
     * @param whiteSuppressJoinSqManyOneList The list of whiteSuppressJoinSqManyOne. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteSuppressJoinSqManyOneOne> pulloutWhiteSuppressJoinSqManyOneOne(List<WhiteSuppressJoinSqManyOne> whiteSuppressJoinSqManyOneList) {
        return helpPulloutInternally(whiteSuppressJoinSqManyOneList, new InternalPulloutCallback<WhiteSuppressJoinSqManyOne, WhiteSuppressJoinSqManyOneOne>() {
            public WhiteSuppressJoinSqManyOneOne getFr(WhiteSuppressJoinSqManyOne et)
            { return et.getWhiteSuppressJoinSqManyOneOne(); }
            public boolean hasRf() { return true; }
            public void setRfLs(WhiteSuppressJoinSqManyOneOne et, List<WhiteSuppressJoinSqManyOne> ls)
            { et.setWhiteSuppressJoinSqManyOneList(ls); }
        });
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key manyOneId.
     * @param whiteSuppressJoinSqManyOneList The list of whiteSuppressJoinSqManyOne. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractManyOneIdList(List<WhiteSuppressJoinSqManyOne> whiteSuppressJoinSqManyOneList) {
        return helpExtractListInternally(whiteSuppressJoinSqManyOneList, new InternalExtractCallback<WhiteSuppressJoinSqManyOne, Integer>() {
            public Integer getCV(WhiteSuppressJoinSqManyOne et) { return et.getManyOneId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteSuppressJoinSqManyOne whiteSuppressJoinSqManyOne = new WhiteSuppressJoinSqManyOne();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteSuppressJoinSqManyOne.setFoo...(value);
     * whiteSuppressJoinSqManyOne.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqManyOne.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqManyOne.set...;</span>
     * whiteSuppressJoinSqManyOneBhv.<span style="color: #DD4747">insert</span>(whiteSuppressJoinSqManyOne);
     * ... = whiteSuppressJoinSqManyOne.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteSuppressJoinSqManyOne The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteSuppressJoinSqManyOne whiteSuppressJoinSqManyOne) {
        doInsert(whiteSuppressJoinSqManyOne, null);
    }

    protected void doInsert(WhiteSuppressJoinSqManyOne whiteSuppressJoinSqManyOne, InsertOption<WhiteSuppressJoinSqManyOneCB> op) {
        assertObjectNotNull("whiteSuppressJoinSqManyOne", whiteSuppressJoinSqManyOne);
        prepareInsertOption(op);
        delegateInsert(whiteSuppressJoinSqManyOne, op);
    }

    protected void prepareInsertOption(InsertOption<WhiteSuppressJoinSqManyOneCB> op) {
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
     * WhiteSuppressJoinSqManyOne whiteSuppressJoinSqManyOne = new WhiteSuppressJoinSqManyOne();
     * whiteSuppressJoinSqManyOne.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteSuppressJoinSqManyOne.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqManyOne.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqManyOne.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteSuppressJoinSqManyOne.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteSuppressJoinSqManyOneBhv.<span style="color: #DD4747">update</span>(whiteSuppressJoinSqManyOne);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSuppressJoinSqManyOne The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final WhiteSuppressJoinSqManyOne whiteSuppressJoinSqManyOne) {
        doUpdate(whiteSuppressJoinSqManyOne, null);
    }

    protected void doUpdate(WhiteSuppressJoinSqManyOne whiteSuppressJoinSqManyOne, final UpdateOption<WhiteSuppressJoinSqManyOneCB> op) {
        assertObjectNotNull("whiteSuppressJoinSqManyOne", whiteSuppressJoinSqManyOne);
        prepareUpdateOption(op);
        helpUpdateInternally(whiteSuppressJoinSqManyOne, new InternalUpdateCallback<WhiteSuppressJoinSqManyOne>() {
            public int callbackDelegateUpdate(WhiteSuppressJoinSqManyOne et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhiteSuppressJoinSqManyOneCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected WhiteSuppressJoinSqManyOneCB createCBForVaryingUpdate() {
        WhiteSuppressJoinSqManyOneCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected WhiteSuppressJoinSqManyOneCB createCBForSpecifiedUpdate() {
        WhiteSuppressJoinSqManyOneCB cb = newMyConditionBean();
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
     * @param whiteSuppressJoinSqManyOne The entity of insert or update target. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteSuppressJoinSqManyOne whiteSuppressJoinSqManyOne) {
        doInesrtOrUpdate(whiteSuppressJoinSqManyOne, null, null);
    }

    protected void doInesrtOrUpdate(WhiteSuppressJoinSqManyOne whiteSuppressJoinSqManyOne, final InsertOption<WhiteSuppressJoinSqManyOneCB> iop, final UpdateOption<WhiteSuppressJoinSqManyOneCB> uop) {
        helpInsertOrUpdateInternally(whiteSuppressJoinSqManyOne, new InternalInsertOrUpdateCallback<WhiteSuppressJoinSqManyOne, WhiteSuppressJoinSqManyOneCB>() {
            public void callbackInsert(WhiteSuppressJoinSqManyOne et) { doInsert(et, iop); }
            public void callbackUpdate(WhiteSuppressJoinSqManyOne et) { doUpdate(et, uop); }
            public WhiteSuppressJoinSqManyOneCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(WhiteSuppressJoinSqManyOneCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<WhiteSuppressJoinSqManyOneCB>();
            uop = uop != null ? uop : new UpdateOption<WhiteSuppressJoinSqManyOneCB>();
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
     * WhiteSuppressJoinSqManyOne whiteSuppressJoinSqManyOne = new WhiteSuppressJoinSqManyOne();
     * whiteSuppressJoinSqManyOne.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteSuppressJoinSqManyOne.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteSuppressJoinSqManyOneBhv.<span style="color: #DD4747">delete</span>(whiteSuppressJoinSqManyOne);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSuppressJoinSqManyOne The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteSuppressJoinSqManyOne whiteSuppressJoinSqManyOne) {
        doDelete(whiteSuppressJoinSqManyOne, null);
    }

    protected void doDelete(WhiteSuppressJoinSqManyOne whiteSuppressJoinSqManyOne, final DeleteOption<WhiteSuppressJoinSqManyOneCB> op) {
        assertObjectNotNull("whiteSuppressJoinSqManyOne", whiteSuppressJoinSqManyOne);
        prepareDeleteOption(op);
        helpDeleteInternally(whiteSuppressJoinSqManyOne, new InternalDeleteCallback<WhiteSuppressJoinSqManyOne>() {
            public int callbackDelegateDelete(WhiteSuppressJoinSqManyOne et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhiteSuppressJoinSqManyOneCB> op) {
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
     *     WhiteSuppressJoinSqManyOne whiteSuppressJoinSqManyOne = new WhiteSuppressJoinSqManyOne();
     *     whiteSuppressJoinSqManyOne.setFooName("foo");
     *     if (...) {
     *         whiteSuppressJoinSqManyOne.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteSuppressJoinSqManyOneList.add(whiteSuppressJoinSqManyOne);
     * }
     * whiteSuppressJoinSqManyOneBhv.<span style="color: #DD4747">batchInsert</span>(whiteSuppressJoinSqManyOneList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteSuppressJoinSqManyOneList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteSuppressJoinSqManyOne> whiteSuppressJoinSqManyOneList) {
        InsertOption<WhiteSuppressJoinSqManyOneCB> op = createInsertUpdateOption();
        return doBatchInsert(whiteSuppressJoinSqManyOneList, op);
    }

    protected int[] doBatchInsert(List<WhiteSuppressJoinSqManyOne> whiteSuppressJoinSqManyOneList, InsertOption<WhiteSuppressJoinSqManyOneCB> op) {
        assertObjectNotNull("whiteSuppressJoinSqManyOneList", whiteSuppressJoinSqManyOneList);
        prepareBatchInsertOption(whiteSuppressJoinSqManyOneList, op);
        return delegateBatchInsert(whiteSuppressJoinSqManyOneList, op);
    }

    protected void prepareBatchInsertOption(List<WhiteSuppressJoinSqManyOne> whiteSuppressJoinSqManyOneList, InsertOption<WhiteSuppressJoinSqManyOneCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(whiteSuppressJoinSqManyOneList);
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
     *     WhiteSuppressJoinSqManyOne whiteSuppressJoinSqManyOne = new WhiteSuppressJoinSqManyOne();
     *     whiteSuppressJoinSqManyOne.setFooName("foo");
     *     if (...) {
     *         whiteSuppressJoinSqManyOne.setFooPrice(123);
     *     } else {
     *         whiteSuppressJoinSqManyOne.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteSuppressJoinSqManyOne.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteSuppressJoinSqManyOneList.add(whiteSuppressJoinSqManyOne);
     * }
     * whiteSuppressJoinSqManyOneBhv.<span style="color: #DD4747">batchUpdate</span>(whiteSuppressJoinSqManyOneList);
     * </pre>
     * @param whiteSuppressJoinSqManyOneList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteSuppressJoinSqManyOne> whiteSuppressJoinSqManyOneList) {
        UpdateOption<WhiteSuppressJoinSqManyOneCB> op = createPlainUpdateOption();
        return doBatchUpdate(whiteSuppressJoinSqManyOneList, op);
    }

    protected int[] doBatchUpdate(List<WhiteSuppressJoinSqManyOne> whiteSuppressJoinSqManyOneList, UpdateOption<WhiteSuppressJoinSqManyOneCB> op) {
        assertObjectNotNull("whiteSuppressJoinSqManyOneList", whiteSuppressJoinSqManyOneList);
        prepareBatchUpdateOption(whiteSuppressJoinSqManyOneList, op);
        return delegateBatchUpdate(whiteSuppressJoinSqManyOneList, op);
    }

    protected void prepareBatchUpdateOption(List<WhiteSuppressJoinSqManyOne> whiteSuppressJoinSqManyOneList, UpdateOption<WhiteSuppressJoinSqManyOneCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(whiteSuppressJoinSqManyOneList);
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
     * whiteSuppressJoinSqManyOneBhv.<span style="color: #DD4747">batchUpdate</span>(whiteSuppressJoinSqManyOneList, new SpecifyQuery<WhiteSuppressJoinSqManyOneCB>() {
     *     public void specify(WhiteSuppressJoinSqManyOneCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteSuppressJoinSqManyOneBhv.<span style="color: #DD4747">batchUpdate</span>(whiteSuppressJoinSqManyOneList, new SpecifyQuery<WhiteSuppressJoinSqManyOneCB>() {
     *     public void specify(WhiteSuppressJoinSqManyOneCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteSuppressJoinSqManyOneList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteSuppressJoinSqManyOne> whiteSuppressJoinSqManyOneList, SpecifyQuery<WhiteSuppressJoinSqManyOneCB> updateColumnSpec) {
        return doBatchUpdate(whiteSuppressJoinSqManyOneList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteSuppressJoinSqManyOneList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteSuppressJoinSqManyOne> whiteSuppressJoinSqManyOneList) {
        return doBatchDelete(whiteSuppressJoinSqManyOneList, null);
    }

    protected int[] doBatchDelete(List<WhiteSuppressJoinSqManyOne> whiteSuppressJoinSqManyOneList, DeleteOption<WhiteSuppressJoinSqManyOneCB> op) {
        assertObjectNotNull("whiteSuppressJoinSqManyOneList", whiteSuppressJoinSqManyOneList);
        prepareDeleteOption(op);
        return delegateBatchDelete(whiteSuppressJoinSqManyOneList, op);
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
     * whiteSuppressJoinSqManyOneBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteSuppressJoinSqManyOne, WhiteSuppressJoinSqManyOneCB&gt;() {
     *     public ConditionBean setup(whiteSuppressJoinSqManyOne entity, WhiteSuppressJoinSqManyOneCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteSuppressJoinSqManyOne, WhiteSuppressJoinSqManyOneCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteSuppressJoinSqManyOne, WhiteSuppressJoinSqManyOneCB> sp, InsertOption<WhiteSuppressJoinSqManyOneCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        WhiteSuppressJoinSqManyOne e = new WhiteSuppressJoinSqManyOne();
        WhiteSuppressJoinSqManyOneCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected WhiteSuppressJoinSqManyOneCB createCBForQueryInsert() {
        WhiteSuppressJoinSqManyOneCB cb = newMyConditionBean();
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
     * WhiteSuppressJoinSqManyOne whiteSuppressJoinSqManyOne = new WhiteSuppressJoinSqManyOne();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqManyOne.setPK...(value);</span>
     * whiteSuppressJoinSqManyOne.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqManyOne.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqManyOne.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqManyOne.setVersionNo(value);</span>
     * WhiteSuppressJoinSqManyOneCB cb = new WhiteSuppressJoinSqManyOneCB();
     * cb.query().setFoo...(value);
     * whiteSuppressJoinSqManyOneBhv.<span style="color: #DD4747">queryUpdate</span>(whiteSuppressJoinSqManyOne, cb);
     * </pre>
     * @param whiteSuppressJoinSqManyOne The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteSuppressJoinSqManyOne. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteSuppressJoinSqManyOne whiteSuppressJoinSqManyOne, WhiteSuppressJoinSqManyOneCB cb) {
        return doQueryUpdate(whiteSuppressJoinSqManyOne, cb, null);
    }

    protected int doQueryUpdate(WhiteSuppressJoinSqManyOne whiteSuppressJoinSqManyOne, WhiteSuppressJoinSqManyOneCB cb, UpdateOption<WhiteSuppressJoinSqManyOneCB> op) {
        assertObjectNotNull("whiteSuppressJoinSqManyOne", whiteSuppressJoinSqManyOne); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(whiteSuppressJoinSqManyOne, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (WhiteSuppressJoinSqManyOneCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (WhiteSuppressJoinSqManyOneCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteSuppressJoinSqManyOneCB cb = new WhiteSuppressJoinSqManyOneCB();
     * cb.query().setFoo...(value);
     * whiteSuppressJoinSqManyOneBhv.<span style="color: #DD4747">queryDelete</span>(whiteSuppressJoinSqManyOne, cb);
     * </pre>
     * @param cb The condition-bean of WhiteSuppressJoinSqManyOne. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteSuppressJoinSqManyOneCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteSuppressJoinSqManyOneCB cb, DeleteOption<WhiteSuppressJoinSqManyOneCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((WhiteSuppressJoinSqManyOneCB)cb); }
        else { return varyingQueryDelete((WhiteSuppressJoinSqManyOneCB)cb, downcast(op)); }
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
     * WhiteSuppressJoinSqManyOne whiteSuppressJoinSqManyOne = new WhiteSuppressJoinSqManyOne();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteSuppressJoinSqManyOne.setFoo...(value);
     * whiteSuppressJoinSqManyOne.setBar...(value);
     * InsertOption<WhiteSuppressJoinSqManyOneCB> option = new InsertOption<WhiteSuppressJoinSqManyOneCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteSuppressJoinSqManyOneBhv.<span style="color: #DD4747">varyingInsert</span>(whiteSuppressJoinSqManyOne, option);
     * ... = whiteSuppressJoinSqManyOne.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteSuppressJoinSqManyOne The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteSuppressJoinSqManyOne whiteSuppressJoinSqManyOne, InsertOption<WhiteSuppressJoinSqManyOneCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteSuppressJoinSqManyOne, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteSuppressJoinSqManyOne whiteSuppressJoinSqManyOne = new WhiteSuppressJoinSqManyOne();
     * whiteSuppressJoinSqManyOne.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteSuppressJoinSqManyOne.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteSuppressJoinSqManyOne.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteSuppressJoinSqManyOneCB&gt; option = new UpdateOption&lt;WhiteSuppressJoinSqManyOneCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteSuppressJoinSqManyOneCB&gt;() {
     *         public void specify(WhiteSuppressJoinSqManyOneCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteSuppressJoinSqManyOneBhv.<span style="color: #DD4747">varyingUpdate</span>(whiteSuppressJoinSqManyOne, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSuppressJoinSqManyOne The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteSuppressJoinSqManyOne whiteSuppressJoinSqManyOne, UpdateOption<WhiteSuppressJoinSqManyOneCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteSuppressJoinSqManyOne, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteSuppressJoinSqManyOne The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteSuppressJoinSqManyOne whiteSuppressJoinSqManyOne, InsertOption<WhiteSuppressJoinSqManyOneCB> insertOption, UpdateOption<WhiteSuppressJoinSqManyOneCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(whiteSuppressJoinSqManyOne, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteSuppressJoinSqManyOne The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteSuppressJoinSqManyOne whiteSuppressJoinSqManyOne, DeleteOption<WhiteSuppressJoinSqManyOneCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteSuppressJoinSqManyOne, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteSuppressJoinSqManyOneList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteSuppressJoinSqManyOne> whiteSuppressJoinSqManyOneList, InsertOption<WhiteSuppressJoinSqManyOneCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteSuppressJoinSqManyOneList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteSuppressJoinSqManyOneList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteSuppressJoinSqManyOne> whiteSuppressJoinSqManyOneList, UpdateOption<WhiteSuppressJoinSqManyOneCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteSuppressJoinSqManyOneList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteSuppressJoinSqManyOneList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteSuppressJoinSqManyOne> whiteSuppressJoinSqManyOneList, DeleteOption<WhiteSuppressJoinSqManyOneCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteSuppressJoinSqManyOneList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteSuppressJoinSqManyOne, WhiteSuppressJoinSqManyOneCB> setupper, InsertOption<WhiteSuppressJoinSqManyOneCB> option) {
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
     * WhiteSuppressJoinSqManyOne whiteSuppressJoinSqManyOne = new WhiteSuppressJoinSqManyOne();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqManyOne.setPK...(value);</span>
     * whiteSuppressJoinSqManyOne.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqManyOne.setVersionNo(value);</span>
     * WhiteSuppressJoinSqManyOneCB cb = new WhiteSuppressJoinSqManyOneCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteSuppressJoinSqManyOneCB&gt; option = new UpdateOption&lt;WhiteSuppressJoinSqManyOneCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteSuppressJoinSqManyOneCB&gt;() {
     *     public void specify(WhiteSuppressJoinSqManyOneCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteSuppressJoinSqManyOneBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteSuppressJoinSqManyOne, cb, option);
     * </pre>
     * @param whiteSuppressJoinSqManyOne The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteSuppressJoinSqManyOne. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteSuppressJoinSqManyOne whiteSuppressJoinSqManyOne, WhiteSuppressJoinSqManyOneCB cb, UpdateOption<WhiteSuppressJoinSqManyOneCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteSuppressJoinSqManyOne, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteSuppressJoinSqManyOne. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteSuppressJoinSqManyOneCB cb, DeleteOption<WhiteSuppressJoinSqManyOneCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteSuppressJoinSqManyOneBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhiteSuppressJoinSqManyOneCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhiteSuppressJoinSqManyOneCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhiteSuppressJoinSqManyOne> void delegateSelectCursor(WhiteSuppressJoinSqManyOneCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends WhiteSuppressJoinSqManyOne> List<ENTITY> delegateSelectList(WhiteSuppressJoinSqManyOneCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhiteSuppressJoinSqManyOne et, InsertOption<WhiteSuppressJoinSqManyOneCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(WhiteSuppressJoinSqManyOne et, UpdateOption<WhiteSuppressJoinSqManyOneCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(WhiteSuppressJoinSqManyOne et, UpdateOption<WhiteSuppressJoinSqManyOneCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(WhiteSuppressJoinSqManyOne et, DeleteOption<WhiteSuppressJoinSqManyOneCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(WhiteSuppressJoinSqManyOne et, DeleteOption<WhiteSuppressJoinSqManyOneCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<WhiteSuppressJoinSqManyOne> ls, InsertOption<WhiteSuppressJoinSqManyOneCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhiteSuppressJoinSqManyOne> ls, UpdateOption<WhiteSuppressJoinSqManyOneCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhiteSuppressJoinSqManyOne> ls, UpdateOption<WhiteSuppressJoinSqManyOneCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhiteSuppressJoinSqManyOne> ls, DeleteOption<WhiteSuppressJoinSqManyOneCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhiteSuppressJoinSqManyOne> ls, DeleteOption<WhiteSuppressJoinSqManyOneCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhiteSuppressJoinSqManyOne et, WhiteSuppressJoinSqManyOneCB inCB, ConditionBean resCB, InsertOption<WhiteSuppressJoinSqManyOneCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhiteSuppressJoinSqManyOne et, WhiteSuppressJoinSqManyOneCB cb, UpdateOption<WhiteSuppressJoinSqManyOneCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(WhiteSuppressJoinSqManyOneCB cb, DeleteOption<WhiteSuppressJoinSqManyOneCB> op)
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
    protected WhiteSuppressJoinSqManyOne downcast(Entity et) {
        return helpEntityDowncastInternally(et, WhiteSuppressJoinSqManyOne.class);
    }

    protected WhiteSuppressJoinSqManyOneCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, WhiteSuppressJoinSqManyOneCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<WhiteSuppressJoinSqManyOne> downcast(List<? extends Entity> ls) {
        return (List<WhiteSuppressJoinSqManyOne>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteSuppressJoinSqManyOneCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<WhiteSuppressJoinSqManyOneCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteSuppressJoinSqManyOneCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<WhiteSuppressJoinSqManyOneCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteSuppressJoinSqManyOneCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<WhiteSuppressJoinSqManyOneCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteSuppressJoinSqManyOne, WhiteSuppressJoinSqManyOneCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<WhiteSuppressJoinSqManyOne, WhiteSuppressJoinSqManyOneCB>)sp;
    }
}
