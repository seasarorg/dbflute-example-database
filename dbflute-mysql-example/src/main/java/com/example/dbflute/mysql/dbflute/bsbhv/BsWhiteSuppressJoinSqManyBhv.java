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
 * The behavior of WHITE_SUPPRESS_JOIN_SQ_MANY as TABLE. <br />
 * <pre>
 * [primary key]
 *     MANY_ID
 *
 * [column]
 *     MANY_ID, MANY_NAME, SUPPRESS_JOIN_SQ_ID, MANY_ONE_ID
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
 *     white_suppress_join_sq_many_one, white_suppress_join_sq
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     whiteSuppressJoinSqManyOne, whiteSuppressJoinSq
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteSuppressJoinSqManyBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_suppress_join_sq_many"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return WhiteSuppressJoinSqManyDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteSuppressJoinSqManyDbm getMyDBMeta() { return WhiteSuppressJoinSqManyDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteSuppressJoinSqMany newMyEntity() { return new WhiteSuppressJoinSqMany(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteSuppressJoinSqManyCB newMyConditionBean() { return new WhiteSuppressJoinSqManyCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteSuppressJoinSqManyCB cb = new WhiteSuppressJoinSqManyCB();
     * cb.query().setFoo...(value);
     * int count = whiteSuppressJoinSqManyBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteSuppressJoinSqMany. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteSuppressJoinSqManyCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteSuppressJoinSqManyCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteSuppressJoinSqManyCB cb) { // called by selectPage(cb)
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
     * WhiteSuppressJoinSqManyCB cb = new WhiteSuppressJoinSqManyCB();
     * cb.query().setFoo...(value);
     * WhiteSuppressJoinSqMany whiteSuppressJoinSqMany = whiteSuppressJoinSqManyBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (whiteSuppressJoinSqMany != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = whiteSuppressJoinSqMany.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSuppressJoinSqMany. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSuppressJoinSqMany selectEntity(WhiteSuppressJoinSqManyCB cb) {
        return doSelectEntity(cb, WhiteSuppressJoinSqMany.class);
    }

    protected <ENTITY extends WhiteSuppressJoinSqMany> ENTITY doSelectEntity(WhiteSuppressJoinSqManyCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, WhiteSuppressJoinSqManyCB>() {
            public List<ENTITY> callbackSelectList(WhiteSuppressJoinSqManyCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    protected <ENTITY extends WhiteSuppressJoinSqMany> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteSuppressJoinSqManyCB cb, Class<ENTITY> tp) {
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
     * WhiteSuppressJoinSqManyCB cb = new WhiteSuppressJoinSqManyCB();
     * cb.query().setFoo...(value);
     * WhiteSuppressJoinSqMany whiteSuppressJoinSqMany = whiteSuppressJoinSqManyBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteSuppressJoinSqMany.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteSuppressJoinSqMany. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSuppressJoinSqMany selectEntityWithDeletedCheck(WhiteSuppressJoinSqManyCB cb) {
        return doSelectEntityWithDeletedCheck(cb, WhiteSuppressJoinSqMany.class);
    }

    protected <ENTITY extends WhiteSuppressJoinSqMany> ENTITY doSelectEntityWithDeletedCheck(WhiteSuppressJoinSqManyCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteSuppressJoinSqManyCB>() {
            public List<ENTITY> callbackSelectList(WhiteSuppressJoinSqManyCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param manyId : PK, NotNull, INT(10). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSuppressJoinSqMany selectByPKValue(Integer manyId) {
        return doSelectByPK(manyId, WhiteSuppressJoinSqMany.class);
    }

    protected <ENTITY extends WhiteSuppressJoinSqMany> ENTITY doSelectByPK(Integer manyId, Class<ENTITY> entityType) {
        return doSelectEntity(xprepareCBAsPK(manyId), entityType);
    }

    protected <ENTITY extends WhiteSuppressJoinSqMany> OptionalEntity<ENTITY> doSelectOptionalByPK(Integer manyId, Class<ENTITY> entityType) {
        return createOptionalEntity(doSelectByPK(manyId, entityType), manyId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param manyId : PK, NotNull, INT(10). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSuppressJoinSqMany selectByPKValueWithDeletedCheck(Integer manyId) {
        return doSelectByPKWithDeletedCheck(manyId, WhiteSuppressJoinSqMany.class);
    }

    protected <ENTITY extends WhiteSuppressJoinSqMany> ENTITY doSelectByPKWithDeletedCheck(Integer manyId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(manyId), entityType);
    }

    protected WhiteSuppressJoinSqManyCB xprepareCBAsPK(Integer manyId) {
        assertObjectNotNull("manyId", manyId);
        WhiteSuppressJoinSqManyCB cb = newMyConditionBean(); cb.acceptPrimaryKey(manyId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteSuppressJoinSqManyCB cb = new WhiteSuppressJoinSqManyCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteSuppressJoinSqMany&gt; whiteSuppressJoinSqManyList = whiteSuppressJoinSqManyBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteSuppressJoinSqMany whiteSuppressJoinSqMany : whiteSuppressJoinSqManyList) {
     *     ... = whiteSuppressJoinSqMany.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSuppressJoinSqMany. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteSuppressJoinSqMany> selectList(WhiteSuppressJoinSqManyCB cb) {
        return doSelectList(cb, WhiteSuppressJoinSqMany.class);
    }

    protected <ENTITY extends WhiteSuppressJoinSqMany> ListResultBean<ENTITY> doSelectList(WhiteSuppressJoinSqManyCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, WhiteSuppressJoinSqManyCB>() {
            public List<ENTITY> callbackSelectList(WhiteSuppressJoinSqManyCB lcb, Class<ENTITY> ltp) { return delegateSelectList(lcb, ltp); } });
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
     * WhiteSuppressJoinSqManyCB cb = new WhiteSuppressJoinSqManyCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteSuppressJoinSqMany&gt; page = whiteSuppressJoinSqManyBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteSuppressJoinSqMany whiteSuppressJoinSqMany : page) {
     *     ... = whiteSuppressJoinSqMany.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSuppressJoinSqMany. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteSuppressJoinSqMany> selectPage(WhiteSuppressJoinSqManyCB cb) {
        return doSelectPage(cb, WhiteSuppressJoinSqMany.class);
    }

    protected <ENTITY extends WhiteSuppressJoinSqMany> PagingResultBean<ENTITY> doSelectPage(WhiteSuppressJoinSqManyCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, WhiteSuppressJoinSqManyCB>() {
            public int callbackSelectCount(WhiteSuppressJoinSqManyCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteSuppressJoinSqManyCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * WhiteSuppressJoinSqManyCB cb = new WhiteSuppressJoinSqManyCB();
     * cb.query().setFoo...(value);
     * whiteSuppressJoinSqManyBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteSuppressJoinSqMany&gt;() {
     *     public void handle(WhiteSuppressJoinSqMany entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteSuppressJoinSqMany. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteSuppressJoinSqMany. (NotNull)
     */
    public void selectCursor(WhiteSuppressJoinSqManyCB cb, EntityRowHandler<WhiteSuppressJoinSqMany> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, WhiteSuppressJoinSqMany.class);
    }

    protected <ENTITY extends WhiteSuppressJoinSqMany> void doSelectCursor(WhiteSuppressJoinSqManyCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, WhiteSuppressJoinSqManyCB>() {
            public void callbackSelectCursor(WhiteSuppressJoinSqManyCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(WhiteSuppressJoinSqManyCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteSuppressJoinSqManyBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteSuppressJoinSqManyCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<WhiteSuppressJoinSqManyCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends WhiteSuppressJoinSqManyCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends WhiteSuppressJoinSqManyCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'WhiteSuppressJoinSqManyOne'.
     * @param whiteSuppressJoinSqManyList The list of whiteSuppressJoinSqMany. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteSuppressJoinSqManyOne> pulloutWhiteSuppressJoinSqManyOne(List<WhiteSuppressJoinSqMany> whiteSuppressJoinSqManyList) {
        return helpPulloutInternally(whiteSuppressJoinSqManyList, new InternalPulloutCallback<WhiteSuppressJoinSqMany, WhiteSuppressJoinSqManyOne>() {
            public WhiteSuppressJoinSqManyOne getFr(WhiteSuppressJoinSqMany et)
            { return et.getWhiteSuppressJoinSqManyOne(); }
            public boolean hasRf() { return true; }
            public void setRfLs(WhiteSuppressJoinSqManyOne et, List<WhiteSuppressJoinSqMany> ls)
            { et.setWhiteSuppressJoinSqManyList(ls); }
        });
    }
    /**
     * Pull out the list of foreign table 'WhiteSuppressJoinSq'.
     * @param whiteSuppressJoinSqManyList The list of whiteSuppressJoinSqMany. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteSuppressJoinSq> pulloutWhiteSuppressJoinSq(List<WhiteSuppressJoinSqMany> whiteSuppressJoinSqManyList) {
        return helpPulloutInternally(whiteSuppressJoinSqManyList, new InternalPulloutCallback<WhiteSuppressJoinSqMany, WhiteSuppressJoinSq>() {
            public WhiteSuppressJoinSq getFr(WhiteSuppressJoinSqMany et)
            { return et.getWhiteSuppressJoinSq(); }
            public boolean hasRf() { return true; }
            public void setRfLs(WhiteSuppressJoinSq et, List<WhiteSuppressJoinSqMany> ls)
            { et.setWhiteSuppressJoinSqManyList(ls); }
        });
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key manyId.
     * @param whiteSuppressJoinSqManyList The list of whiteSuppressJoinSqMany. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractManyIdList(List<WhiteSuppressJoinSqMany> whiteSuppressJoinSqManyList) {
        return helpExtractListInternally(whiteSuppressJoinSqManyList, new InternalExtractCallback<WhiteSuppressJoinSqMany, Integer>() {
            public Integer getCV(WhiteSuppressJoinSqMany et) { return et.getManyId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteSuppressJoinSqMany whiteSuppressJoinSqMany = new WhiteSuppressJoinSqMany();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteSuppressJoinSqMany.setFoo...(value);
     * whiteSuppressJoinSqMany.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqMany.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqMany.set...;</span>
     * whiteSuppressJoinSqManyBhv.<span style="color: #DD4747">insert</span>(whiteSuppressJoinSqMany);
     * ... = whiteSuppressJoinSqMany.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteSuppressJoinSqMany The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteSuppressJoinSqMany whiteSuppressJoinSqMany) {
        doInsert(whiteSuppressJoinSqMany, null);
    }

    protected void doInsert(WhiteSuppressJoinSqMany whiteSuppressJoinSqMany, InsertOption<WhiteSuppressJoinSqManyCB> op) {
        assertObjectNotNull("whiteSuppressJoinSqMany", whiteSuppressJoinSqMany);
        prepareInsertOption(op);
        delegateInsert(whiteSuppressJoinSqMany, op);
    }

    protected void prepareInsertOption(InsertOption<WhiteSuppressJoinSqManyCB> op) {
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
     * WhiteSuppressJoinSqMany whiteSuppressJoinSqMany = new WhiteSuppressJoinSqMany();
     * whiteSuppressJoinSqMany.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteSuppressJoinSqMany.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqMany.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqMany.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteSuppressJoinSqMany.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteSuppressJoinSqManyBhv.<span style="color: #DD4747">update</span>(whiteSuppressJoinSqMany);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSuppressJoinSqMany The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final WhiteSuppressJoinSqMany whiteSuppressJoinSqMany) {
        doUpdate(whiteSuppressJoinSqMany, null);
    }

    protected void doUpdate(WhiteSuppressJoinSqMany whiteSuppressJoinSqMany, final UpdateOption<WhiteSuppressJoinSqManyCB> op) {
        assertObjectNotNull("whiteSuppressJoinSqMany", whiteSuppressJoinSqMany);
        prepareUpdateOption(op);
        helpUpdateInternally(whiteSuppressJoinSqMany, new InternalUpdateCallback<WhiteSuppressJoinSqMany>() {
            public int callbackDelegateUpdate(WhiteSuppressJoinSqMany et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhiteSuppressJoinSqManyCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected WhiteSuppressJoinSqManyCB createCBForVaryingUpdate() {
        WhiteSuppressJoinSqManyCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected WhiteSuppressJoinSqManyCB createCBForSpecifiedUpdate() {
        WhiteSuppressJoinSqManyCB cb = newMyConditionBean();
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
     * @param whiteSuppressJoinSqMany The entity of insert or update target. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteSuppressJoinSqMany whiteSuppressJoinSqMany) {
        doInesrtOrUpdate(whiteSuppressJoinSqMany, null, null);
    }

    protected void doInesrtOrUpdate(WhiteSuppressJoinSqMany whiteSuppressJoinSqMany, final InsertOption<WhiteSuppressJoinSqManyCB> iop, final UpdateOption<WhiteSuppressJoinSqManyCB> uop) {
        helpInsertOrUpdateInternally(whiteSuppressJoinSqMany, new InternalInsertOrUpdateCallback<WhiteSuppressJoinSqMany, WhiteSuppressJoinSqManyCB>() {
            public void callbackInsert(WhiteSuppressJoinSqMany et) { doInsert(et, iop); }
            public void callbackUpdate(WhiteSuppressJoinSqMany et) { doUpdate(et, uop); }
            public WhiteSuppressJoinSqManyCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(WhiteSuppressJoinSqManyCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<WhiteSuppressJoinSqManyCB>();
            uop = uop != null ? uop : new UpdateOption<WhiteSuppressJoinSqManyCB>();
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
     * WhiteSuppressJoinSqMany whiteSuppressJoinSqMany = new WhiteSuppressJoinSqMany();
     * whiteSuppressJoinSqMany.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteSuppressJoinSqMany.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteSuppressJoinSqManyBhv.<span style="color: #DD4747">delete</span>(whiteSuppressJoinSqMany);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSuppressJoinSqMany The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteSuppressJoinSqMany whiteSuppressJoinSqMany) {
        doDelete(whiteSuppressJoinSqMany, null);
    }

    protected void doDelete(WhiteSuppressJoinSqMany whiteSuppressJoinSqMany, final DeleteOption<WhiteSuppressJoinSqManyCB> op) {
        assertObjectNotNull("whiteSuppressJoinSqMany", whiteSuppressJoinSqMany);
        prepareDeleteOption(op);
        helpDeleteInternally(whiteSuppressJoinSqMany, new InternalDeleteCallback<WhiteSuppressJoinSqMany>() {
            public int callbackDelegateDelete(WhiteSuppressJoinSqMany et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhiteSuppressJoinSqManyCB> op) {
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
     *     WhiteSuppressJoinSqMany whiteSuppressJoinSqMany = new WhiteSuppressJoinSqMany();
     *     whiteSuppressJoinSqMany.setFooName("foo");
     *     if (...) {
     *         whiteSuppressJoinSqMany.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteSuppressJoinSqManyList.add(whiteSuppressJoinSqMany);
     * }
     * whiteSuppressJoinSqManyBhv.<span style="color: #DD4747">batchInsert</span>(whiteSuppressJoinSqManyList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteSuppressJoinSqManyList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteSuppressJoinSqMany> whiteSuppressJoinSqManyList) {
        InsertOption<WhiteSuppressJoinSqManyCB> op = createInsertUpdateOption();
        return doBatchInsert(whiteSuppressJoinSqManyList, op);
    }

    protected int[] doBatchInsert(List<WhiteSuppressJoinSqMany> whiteSuppressJoinSqManyList, InsertOption<WhiteSuppressJoinSqManyCB> op) {
        assertObjectNotNull("whiteSuppressJoinSqManyList", whiteSuppressJoinSqManyList);
        prepareBatchInsertOption(whiteSuppressJoinSqManyList, op);
        return delegateBatchInsert(whiteSuppressJoinSqManyList, op);
    }

    protected void prepareBatchInsertOption(List<WhiteSuppressJoinSqMany> whiteSuppressJoinSqManyList, InsertOption<WhiteSuppressJoinSqManyCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(whiteSuppressJoinSqManyList);
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
     *     WhiteSuppressJoinSqMany whiteSuppressJoinSqMany = new WhiteSuppressJoinSqMany();
     *     whiteSuppressJoinSqMany.setFooName("foo");
     *     if (...) {
     *         whiteSuppressJoinSqMany.setFooPrice(123);
     *     } else {
     *         whiteSuppressJoinSqMany.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteSuppressJoinSqMany.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteSuppressJoinSqManyList.add(whiteSuppressJoinSqMany);
     * }
     * whiteSuppressJoinSqManyBhv.<span style="color: #DD4747">batchUpdate</span>(whiteSuppressJoinSqManyList);
     * </pre>
     * @param whiteSuppressJoinSqManyList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteSuppressJoinSqMany> whiteSuppressJoinSqManyList) {
        UpdateOption<WhiteSuppressJoinSqManyCB> op = createPlainUpdateOption();
        return doBatchUpdate(whiteSuppressJoinSqManyList, op);
    }

    protected int[] doBatchUpdate(List<WhiteSuppressJoinSqMany> whiteSuppressJoinSqManyList, UpdateOption<WhiteSuppressJoinSqManyCB> op) {
        assertObjectNotNull("whiteSuppressJoinSqManyList", whiteSuppressJoinSqManyList);
        prepareBatchUpdateOption(whiteSuppressJoinSqManyList, op);
        return delegateBatchUpdate(whiteSuppressJoinSqManyList, op);
    }

    protected void prepareBatchUpdateOption(List<WhiteSuppressJoinSqMany> whiteSuppressJoinSqManyList, UpdateOption<WhiteSuppressJoinSqManyCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(whiteSuppressJoinSqManyList);
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
     * whiteSuppressJoinSqManyBhv.<span style="color: #DD4747">batchUpdate</span>(whiteSuppressJoinSqManyList, new SpecifyQuery<WhiteSuppressJoinSqManyCB>() {
     *     public void specify(WhiteSuppressJoinSqManyCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteSuppressJoinSqManyBhv.<span style="color: #DD4747">batchUpdate</span>(whiteSuppressJoinSqManyList, new SpecifyQuery<WhiteSuppressJoinSqManyCB>() {
     *     public void specify(WhiteSuppressJoinSqManyCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteSuppressJoinSqManyList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteSuppressJoinSqMany> whiteSuppressJoinSqManyList, SpecifyQuery<WhiteSuppressJoinSqManyCB> updateColumnSpec) {
        return doBatchUpdate(whiteSuppressJoinSqManyList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteSuppressJoinSqManyList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteSuppressJoinSqMany> whiteSuppressJoinSqManyList) {
        return doBatchDelete(whiteSuppressJoinSqManyList, null);
    }

    protected int[] doBatchDelete(List<WhiteSuppressJoinSqMany> whiteSuppressJoinSqManyList, DeleteOption<WhiteSuppressJoinSqManyCB> op) {
        assertObjectNotNull("whiteSuppressJoinSqManyList", whiteSuppressJoinSqManyList);
        prepareDeleteOption(op);
        return delegateBatchDelete(whiteSuppressJoinSqManyList, op);
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
     * whiteSuppressJoinSqManyBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteSuppressJoinSqMany, WhiteSuppressJoinSqManyCB&gt;() {
     *     public ConditionBean setup(whiteSuppressJoinSqMany entity, WhiteSuppressJoinSqManyCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteSuppressJoinSqMany, WhiteSuppressJoinSqManyCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteSuppressJoinSqMany, WhiteSuppressJoinSqManyCB> sp, InsertOption<WhiteSuppressJoinSqManyCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        WhiteSuppressJoinSqMany e = new WhiteSuppressJoinSqMany();
        WhiteSuppressJoinSqManyCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected WhiteSuppressJoinSqManyCB createCBForQueryInsert() {
        WhiteSuppressJoinSqManyCB cb = newMyConditionBean();
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
     * WhiteSuppressJoinSqMany whiteSuppressJoinSqMany = new WhiteSuppressJoinSqMany();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqMany.setPK...(value);</span>
     * whiteSuppressJoinSqMany.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqMany.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqMany.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqMany.setVersionNo(value);</span>
     * WhiteSuppressJoinSqManyCB cb = new WhiteSuppressJoinSqManyCB();
     * cb.query().setFoo...(value);
     * whiteSuppressJoinSqManyBhv.<span style="color: #DD4747">queryUpdate</span>(whiteSuppressJoinSqMany, cb);
     * </pre>
     * @param whiteSuppressJoinSqMany The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteSuppressJoinSqMany. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteSuppressJoinSqMany whiteSuppressJoinSqMany, WhiteSuppressJoinSqManyCB cb) {
        return doQueryUpdate(whiteSuppressJoinSqMany, cb, null);
    }

    protected int doQueryUpdate(WhiteSuppressJoinSqMany whiteSuppressJoinSqMany, WhiteSuppressJoinSqManyCB cb, UpdateOption<WhiteSuppressJoinSqManyCB> op) {
        assertObjectNotNull("whiteSuppressJoinSqMany", whiteSuppressJoinSqMany); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(whiteSuppressJoinSqMany, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (WhiteSuppressJoinSqManyCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (WhiteSuppressJoinSqManyCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteSuppressJoinSqManyCB cb = new WhiteSuppressJoinSqManyCB();
     * cb.query().setFoo...(value);
     * whiteSuppressJoinSqManyBhv.<span style="color: #DD4747">queryDelete</span>(whiteSuppressJoinSqMany, cb);
     * </pre>
     * @param cb The condition-bean of WhiteSuppressJoinSqMany. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteSuppressJoinSqManyCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteSuppressJoinSqManyCB cb, DeleteOption<WhiteSuppressJoinSqManyCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((WhiteSuppressJoinSqManyCB)cb); }
        else { return varyingQueryDelete((WhiteSuppressJoinSqManyCB)cb, downcast(op)); }
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
     * WhiteSuppressJoinSqMany whiteSuppressJoinSqMany = new WhiteSuppressJoinSqMany();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteSuppressJoinSqMany.setFoo...(value);
     * whiteSuppressJoinSqMany.setBar...(value);
     * InsertOption<WhiteSuppressJoinSqManyCB> option = new InsertOption<WhiteSuppressJoinSqManyCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteSuppressJoinSqManyBhv.<span style="color: #DD4747">varyingInsert</span>(whiteSuppressJoinSqMany, option);
     * ... = whiteSuppressJoinSqMany.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteSuppressJoinSqMany The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteSuppressJoinSqMany whiteSuppressJoinSqMany, InsertOption<WhiteSuppressJoinSqManyCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteSuppressJoinSqMany, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteSuppressJoinSqMany whiteSuppressJoinSqMany = new WhiteSuppressJoinSqMany();
     * whiteSuppressJoinSqMany.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteSuppressJoinSqMany.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteSuppressJoinSqMany.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteSuppressJoinSqManyCB&gt; option = new UpdateOption&lt;WhiteSuppressJoinSqManyCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteSuppressJoinSqManyCB&gt;() {
     *         public void specify(WhiteSuppressJoinSqManyCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteSuppressJoinSqManyBhv.<span style="color: #DD4747">varyingUpdate</span>(whiteSuppressJoinSqMany, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSuppressJoinSqMany The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteSuppressJoinSqMany whiteSuppressJoinSqMany, UpdateOption<WhiteSuppressJoinSqManyCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteSuppressJoinSqMany, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteSuppressJoinSqMany The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteSuppressJoinSqMany whiteSuppressJoinSqMany, InsertOption<WhiteSuppressJoinSqManyCB> insertOption, UpdateOption<WhiteSuppressJoinSqManyCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(whiteSuppressJoinSqMany, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteSuppressJoinSqMany The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteSuppressJoinSqMany whiteSuppressJoinSqMany, DeleteOption<WhiteSuppressJoinSqManyCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteSuppressJoinSqMany, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteSuppressJoinSqManyList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteSuppressJoinSqMany> whiteSuppressJoinSqManyList, InsertOption<WhiteSuppressJoinSqManyCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteSuppressJoinSqManyList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteSuppressJoinSqManyList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteSuppressJoinSqMany> whiteSuppressJoinSqManyList, UpdateOption<WhiteSuppressJoinSqManyCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteSuppressJoinSqManyList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteSuppressJoinSqManyList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteSuppressJoinSqMany> whiteSuppressJoinSqManyList, DeleteOption<WhiteSuppressJoinSqManyCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteSuppressJoinSqManyList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteSuppressJoinSqMany, WhiteSuppressJoinSqManyCB> setupper, InsertOption<WhiteSuppressJoinSqManyCB> option) {
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
     * WhiteSuppressJoinSqMany whiteSuppressJoinSqMany = new WhiteSuppressJoinSqMany();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqMany.setPK...(value);</span>
     * whiteSuppressJoinSqMany.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqMany.setVersionNo(value);</span>
     * WhiteSuppressJoinSqManyCB cb = new WhiteSuppressJoinSqManyCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteSuppressJoinSqManyCB&gt; option = new UpdateOption&lt;WhiteSuppressJoinSqManyCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteSuppressJoinSqManyCB&gt;() {
     *     public void specify(WhiteSuppressJoinSqManyCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteSuppressJoinSqManyBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteSuppressJoinSqMany, cb, option);
     * </pre>
     * @param whiteSuppressJoinSqMany The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteSuppressJoinSqMany. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteSuppressJoinSqMany whiteSuppressJoinSqMany, WhiteSuppressJoinSqManyCB cb, UpdateOption<WhiteSuppressJoinSqManyCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteSuppressJoinSqMany, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteSuppressJoinSqMany. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteSuppressJoinSqManyCB cb, DeleteOption<WhiteSuppressJoinSqManyCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteSuppressJoinSqManyBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhiteSuppressJoinSqManyCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhiteSuppressJoinSqManyCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhiteSuppressJoinSqMany> void delegateSelectCursor(WhiteSuppressJoinSqManyCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends WhiteSuppressJoinSqMany> List<ENTITY> delegateSelectList(WhiteSuppressJoinSqManyCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhiteSuppressJoinSqMany et, InsertOption<WhiteSuppressJoinSqManyCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(WhiteSuppressJoinSqMany et, UpdateOption<WhiteSuppressJoinSqManyCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(WhiteSuppressJoinSqMany et, UpdateOption<WhiteSuppressJoinSqManyCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(WhiteSuppressJoinSqMany et, DeleteOption<WhiteSuppressJoinSqManyCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(WhiteSuppressJoinSqMany et, DeleteOption<WhiteSuppressJoinSqManyCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<WhiteSuppressJoinSqMany> ls, InsertOption<WhiteSuppressJoinSqManyCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhiteSuppressJoinSqMany> ls, UpdateOption<WhiteSuppressJoinSqManyCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhiteSuppressJoinSqMany> ls, UpdateOption<WhiteSuppressJoinSqManyCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhiteSuppressJoinSqMany> ls, DeleteOption<WhiteSuppressJoinSqManyCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhiteSuppressJoinSqMany> ls, DeleteOption<WhiteSuppressJoinSqManyCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhiteSuppressJoinSqMany et, WhiteSuppressJoinSqManyCB inCB, ConditionBean resCB, InsertOption<WhiteSuppressJoinSqManyCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhiteSuppressJoinSqMany et, WhiteSuppressJoinSqManyCB cb, UpdateOption<WhiteSuppressJoinSqManyCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(WhiteSuppressJoinSqManyCB cb, DeleteOption<WhiteSuppressJoinSqManyCB> op)
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
    protected WhiteSuppressJoinSqMany downcast(Entity et) {
        return helpEntityDowncastInternally(et, WhiteSuppressJoinSqMany.class);
    }

    protected WhiteSuppressJoinSqManyCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, WhiteSuppressJoinSqManyCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<WhiteSuppressJoinSqMany> downcast(List<? extends Entity> ls) {
        return (List<WhiteSuppressJoinSqMany>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteSuppressJoinSqManyCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<WhiteSuppressJoinSqManyCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteSuppressJoinSqManyCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<WhiteSuppressJoinSqManyCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteSuppressJoinSqManyCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<WhiteSuppressJoinSqManyCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteSuppressJoinSqMany, WhiteSuppressJoinSqManyCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<WhiteSuppressJoinSqMany, WhiteSuppressJoinSqManyCB>)sp;
    }
}
