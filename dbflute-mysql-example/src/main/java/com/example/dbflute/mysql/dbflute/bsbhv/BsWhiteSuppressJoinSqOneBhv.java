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
 * The behavior of WHITE_SUPPRESS_JOIN_SQ_ONE as TABLE. <br />
 * <pre>
 * [primary key]
 *     ONE_ID
 *
 * [column]
 *     ONE_ID, ONE_NAME, SUPPRESS_JOIN_SQ_ID, ONE_ADDI_ID
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
 *     white_suppress_join_sq, WHITE_SUPPRESS_JOIN_SQ_ONE_ADDI
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     whiteSuppressJoinSq, whiteSuppressJoinSqOneAddi
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteSuppressJoinSqOneBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_suppress_join_sq_one"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return WhiteSuppressJoinSqOneDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteSuppressJoinSqOneDbm getMyDBMeta() { return WhiteSuppressJoinSqOneDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteSuppressJoinSqOne newMyEntity() { return new WhiteSuppressJoinSqOne(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteSuppressJoinSqOneCB newMyConditionBean() { return new WhiteSuppressJoinSqOneCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteSuppressJoinSqOneCB cb = new WhiteSuppressJoinSqOneCB();
     * cb.query().setFoo...(value);
     * int count = whiteSuppressJoinSqOneBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteSuppressJoinSqOne. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteSuppressJoinSqOneCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteSuppressJoinSqOneCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteSuppressJoinSqOneCB cb) { // called by selectPage(cb)
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
     * WhiteSuppressJoinSqOneCB cb = new WhiteSuppressJoinSqOneCB();
     * cb.query().setFoo...(value);
     * WhiteSuppressJoinSqOne whiteSuppressJoinSqOne = whiteSuppressJoinSqOneBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (whiteSuppressJoinSqOne != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = whiteSuppressJoinSqOne.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSuppressJoinSqOne. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSuppressJoinSqOne selectEntity(WhiteSuppressJoinSqOneCB cb) {
        return doSelectEntity(cb, WhiteSuppressJoinSqOne.class);
    }

    protected <ENTITY extends WhiteSuppressJoinSqOne> ENTITY doSelectEntity(WhiteSuppressJoinSqOneCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, WhiteSuppressJoinSqOneCB>() {
            public List<ENTITY> callbackSelectList(WhiteSuppressJoinSqOneCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    protected <ENTITY extends WhiteSuppressJoinSqOne> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteSuppressJoinSqOneCB cb, Class<ENTITY> tp) {
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
     * WhiteSuppressJoinSqOneCB cb = new WhiteSuppressJoinSqOneCB();
     * cb.query().setFoo...(value);
     * WhiteSuppressJoinSqOne whiteSuppressJoinSqOne = whiteSuppressJoinSqOneBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteSuppressJoinSqOne.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteSuppressJoinSqOne. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSuppressJoinSqOne selectEntityWithDeletedCheck(WhiteSuppressJoinSqOneCB cb) {
        return doSelectEntityWithDeletedCheck(cb, WhiteSuppressJoinSqOne.class);
    }

    protected <ENTITY extends WhiteSuppressJoinSqOne> ENTITY doSelectEntityWithDeletedCheck(WhiteSuppressJoinSqOneCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteSuppressJoinSqOneCB>() {
            public List<ENTITY> callbackSelectList(WhiteSuppressJoinSqOneCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param oneId : PK, NotNull, INT(10). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSuppressJoinSqOne selectByPKValue(Integer oneId) {
        return doSelectByPK(oneId, WhiteSuppressJoinSqOne.class);
    }

    protected <ENTITY extends WhiteSuppressJoinSqOne> ENTITY doSelectByPK(Integer oneId, Class<ENTITY> entityType) {
        return doSelectEntity(xprepareCBAsPK(oneId), entityType);
    }

    protected <ENTITY extends WhiteSuppressJoinSqOne> OptionalEntity<ENTITY> doSelectOptionalByPK(Integer oneId, Class<ENTITY> entityType) {
        return createOptionalEntity(doSelectByPK(oneId, entityType), oneId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param oneId : PK, NotNull, INT(10). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSuppressJoinSqOne selectByPKValueWithDeletedCheck(Integer oneId) {
        return doSelectByPKWithDeletedCheck(oneId, WhiteSuppressJoinSqOne.class);
    }

    protected <ENTITY extends WhiteSuppressJoinSqOne> ENTITY doSelectByPKWithDeletedCheck(Integer oneId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(oneId), entityType);
    }

    protected WhiteSuppressJoinSqOneCB xprepareCBAsPK(Integer oneId) {
        assertObjectNotNull("oneId", oneId);
        WhiteSuppressJoinSqOneCB cb = newMyConditionBean(); cb.acceptPrimaryKey(oneId);
        return cb;
    }

    /**
     * Select the entity by the unique-key value.
     * @param suppressJoinSqId : UQ, NotNull, INT(10), FK to white_suppress_join_sq. (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteSuppressJoinSqOne> selectByUniqueOf(Integer suppressJoinSqId) {
        return doSelectByUniqueOf(suppressJoinSqId, WhiteSuppressJoinSqOne.class);
    }

    protected <ENTITY extends WhiteSuppressJoinSqOne> OptionalEntity<ENTITY> doSelectByUniqueOf(Integer suppressJoinSqId, Class<ENTITY> entityType) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(suppressJoinSqId), entityType), suppressJoinSqId);
    }

    protected WhiteSuppressJoinSqOneCB xprepareCBAsUniqueOf(Integer suppressJoinSqId) {
        assertObjectNotNull("suppressJoinSqId", suppressJoinSqId);
        WhiteSuppressJoinSqOneCB cb = newMyConditionBean(); cb.acceptUniqueOf(suppressJoinSqId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteSuppressJoinSqOneCB cb = new WhiteSuppressJoinSqOneCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteSuppressJoinSqOne&gt; whiteSuppressJoinSqOneList = whiteSuppressJoinSqOneBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteSuppressJoinSqOne whiteSuppressJoinSqOne : whiteSuppressJoinSqOneList) {
     *     ... = whiteSuppressJoinSqOne.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSuppressJoinSqOne. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteSuppressJoinSqOne> selectList(WhiteSuppressJoinSqOneCB cb) {
        return doSelectList(cb, WhiteSuppressJoinSqOne.class);
    }

    protected <ENTITY extends WhiteSuppressJoinSqOne> ListResultBean<ENTITY> doSelectList(WhiteSuppressJoinSqOneCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, WhiteSuppressJoinSqOneCB>() {
            public List<ENTITY> callbackSelectList(WhiteSuppressJoinSqOneCB lcb, Class<ENTITY> ltp) { return delegateSelectList(lcb, ltp); } });
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
     * WhiteSuppressJoinSqOneCB cb = new WhiteSuppressJoinSqOneCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteSuppressJoinSqOne&gt; page = whiteSuppressJoinSqOneBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteSuppressJoinSqOne whiteSuppressJoinSqOne : page) {
     *     ... = whiteSuppressJoinSqOne.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSuppressJoinSqOne. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteSuppressJoinSqOne> selectPage(WhiteSuppressJoinSqOneCB cb) {
        return doSelectPage(cb, WhiteSuppressJoinSqOne.class);
    }

    protected <ENTITY extends WhiteSuppressJoinSqOne> PagingResultBean<ENTITY> doSelectPage(WhiteSuppressJoinSqOneCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, WhiteSuppressJoinSqOneCB>() {
            public int callbackSelectCount(WhiteSuppressJoinSqOneCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteSuppressJoinSqOneCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * WhiteSuppressJoinSqOneCB cb = new WhiteSuppressJoinSqOneCB();
     * cb.query().setFoo...(value);
     * whiteSuppressJoinSqOneBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteSuppressJoinSqOne&gt;() {
     *     public void handle(WhiteSuppressJoinSqOne entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteSuppressJoinSqOne. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteSuppressJoinSqOne. (NotNull)
     */
    public void selectCursor(WhiteSuppressJoinSqOneCB cb, EntityRowHandler<WhiteSuppressJoinSqOne> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, WhiteSuppressJoinSqOne.class);
    }

    protected <ENTITY extends WhiteSuppressJoinSqOne> void doSelectCursor(WhiteSuppressJoinSqOneCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, WhiteSuppressJoinSqOneCB>() {
            public void callbackSelectCursor(WhiteSuppressJoinSqOneCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(WhiteSuppressJoinSqOneCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteSuppressJoinSqOneBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteSuppressJoinSqOneCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<WhiteSuppressJoinSqOneCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends WhiteSuppressJoinSqOneCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends WhiteSuppressJoinSqOneCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
     * Pull out the list of foreign table 'WhiteSuppressJoinSq'.
     * @param whiteSuppressJoinSqOneList The list of whiteSuppressJoinSqOne. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteSuppressJoinSq> pulloutWhiteSuppressJoinSq(List<WhiteSuppressJoinSqOne> whiteSuppressJoinSqOneList) {
        return helpPulloutInternally(whiteSuppressJoinSqOneList, new InternalPulloutCallback<WhiteSuppressJoinSqOne, WhiteSuppressJoinSq>() {
            public WhiteSuppressJoinSq getFr(WhiteSuppressJoinSqOne et)
            { return et.getWhiteSuppressJoinSq(); }
            public boolean hasRf() { return true; }
            public void setRfLs(WhiteSuppressJoinSq et, List<WhiteSuppressJoinSqOne> ls)
            { if (!ls.isEmpty()) { et.setWhiteSuppressJoinSqOneAsOne(ls.get(0)); } }
        });
    }
    /**
     * Pull out the list of foreign table 'WhiteSuppressJoinSqOneAddi'.
     * @param whiteSuppressJoinSqOneList The list of whiteSuppressJoinSqOne. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteSuppressJoinSqOneAddi> pulloutWhiteSuppressJoinSqOneAddi(List<WhiteSuppressJoinSqOne> whiteSuppressJoinSqOneList) {
        return helpPulloutInternally(whiteSuppressJoinSqOneList, new InternalPulloutCallback<WhiteSuppressJoinSqOne, WhiteSuppressJoinSqOneAddi>() {
            public WhiteSuppressJoinSqOneAddi getFr(WhiteSuppressJoinSqOne et)
            { return et.getWhiteSuppressJoinSqOneAddi(); }
            public boolean hasRf() { return true; }
            public void setRfLs(WhiteSuppressJoinSqOneAddi et, List<WhiteSuppressJoinSqOne> ls)
            { et.setWhiteSuppressJoinSqOneList(ls); }
        });
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key oneId.
     * @param whiteSuppressJoinSqOneList The list of whiteSuppressJoinSqOne. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractOneIdList(List<WhiteSuppressJoinSqOne> whiteSuppressJoinSqOneList) {
        return helpExtractListInternally(whiteSuppressJoinSqOneList, new InternalExtractCallback<WhiteSuppressJoinSqOne, Integer>() {
            public Integer getCV(WhiteSuppressJoinSqOne et) { return et.getOneId(); }
        });
    }

    /**
     * Extract the value list of (single) unique key suppressJoinSqId.
     * @param whiteSuppressJoinSqOneList The list of whiteSuppressJoinSqOne. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractSuppressJoinSqIdList(List<WhiteSuppressJoinSqOne> whiteSuppressJoinSqOneList) {
        return helpExtractListInternally(whiteSuppressJoinSqOneList, new InternalExtractCallback<WhiteSuppressJoinSqOne, Integer>() {
            public Integer getCV(WhiteSuppressJoinSqOne et) { return et.getSuppressJoinSqId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteSuppressJoinSqOne whiteSuppressJoinSqOne = new WhiteSuppressJoinSqOne();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteSuppressJoinSqOne.setFoo...(value);
     * whiteSuppressJoinSqOne.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqOne.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqOne.set...;</span>
     * whiteSuppressJoinSqOneBhv.<span style="color: #DD4747">insert</span>(whiteSuppressJoinSqOne);
     * ... = whiteSuppressJoinSqOne.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteSuppressJoinSqOne The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteSuppressJoinSqOne whiteSuppressJoinSqOne) {
        doInsert(whiteSuppressJoinSqOne, null);
    }

    protected void doInsert(WhiteSuppressJoinSqOne whiteSuppressJoinSqOne, InsertOption<WhiteSuppressJoinSqOneCB> op) {
        assertObjectNotNull("whiteSuppressJoinSqOne", whiteSuppressJoinSqOne);
        prepareInsertOption(op);
        delegateInsert(whiteSuppressJoinSqOne, op);
    }

    protected void prepareInsertOption(InsertOption<WhiteSuppressJoinSqOneCB> op) {
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
     * WhiteSuppressJoinSqOne whiteSuppressJoinSqOne = new WhiteSuppressJoinSqOne();
     * whiteSuppressJoinSqOne.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteSuppressJoinSqOne.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqOne.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqOne.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteSuppressJoinSqOne.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteSuppressJoinSqOneBhv.<span style="color: #DD4747">update</span>(whiteSuppressJoinSqOne);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSuppressJoinSqOne The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final WhiteSuppressJoinSqOne whiteSuppressJoinSqOne) {
        doUpdate(whiteSuppressJoinSqOne, null);
    }

    protected void doUpdate(WhiteSuppressJoinSqOne whiteSuppressJoinSqOne, final UpdateOption<WhiteSuppressJoinSqOneCB> op) {
        assertObjectNotNull("whiteSuppressJoinSqOne", whiteSuppressJoinSqOne);
        prepareUpdateOption(op);
        helpUpdateInternally(whiteSuppressJoinSqOne, new InternalUpdateCallback<WhiteSuppressJoinSqOne>() {
            public int callbackDelegateUpdate(WhiteSuppressJoinSqOne et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhiteSuppressJoinSqOneCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected WhiteSuppressJoinSqOneCB createCBForVaryingUpdate() {
        WhiteSuppressJoinSqOneCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected WhiteSuppressJoinSqOneCB createCBForSpecifiedUpdate() {
        WhiteSuppressJoinSqOneCB cb = newMyConditionBean();
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
     * @param whiteSuppressJoinSqOne The entity of insert or update target. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteSuppressJoinSqOne whiteSuppressJoinSqOne) {
        doInesrtOrUpdate(whiteSuppressJoinSqOne, null, null);
    }

    protected void doInesrtOrUpdate(WhiteSuppressJoinSqOne whiteSuppressJoinSqOne, final InsertOption<WhiteSuppressJoinSqOneCB> iop, final UpdateOption<WhiteSuppressJoinSqOneCB> uop) {
        helpInsertOrUpdateInternally(whiteSuppressJoinSqOne, new InternalInsertOrUpdateCallback<WhiteSuppressJoinSqOne, WhiteSuppressJoinSqOneCB>() {
            public void callbackInsert(WhiteSuppressJoinSqOne et) { doInsert(et, iop); }
            public void callbackUpdate(WhiteSuppressJoinSqOne et) { doUpdate(et, uop); }
            public WhiteSuppressJoinSqOneCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(WhiteSuppressJoinSqOneCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<WhiteSuppressJoinSqOneCB>();
            uop = uop != null ? uop : new UpdateOption<WhiteSuppressJoinSqOneCB>();
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
     * WhiteSuppressJoinSqOne whiteSuppressJoinSqOne = new WhiteSuppressJoinSqOne();
     * whiteSuppressJoinSqOne.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteSuppressJoinSqOne.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteSuppressJoinSqOneBhv.<span style="color: #DD4747">delete</span>(whiteSuppressJoinSqOne);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSuppressJoinSqOne The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteSuppressJoinSqOne whiteSuppressJoinSqOne) {
        doDelete(whiteSuppressJoinSqOne, null);
    }

    protected void doDelete(WhiteSuppressJoinSqOne whiteSuppressJoinSqOne, final DeleteOption<WhiteSuppressJoinSqOneCB> op) {
        assertObjectNotNull("whiteSuppressJoinSqOne", whiteSuppressJoinSqOne);
        prepareDeleteOption(op);
        helpDeleteInternally(whiteSuppressJoinSqOne, new InternalDeleteCallback<WhiteSuppressJoinSqOne>() {
            public int callbackDelegateDelete(WhiteSuppressJoinSqOne et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhiteSuppressJoinSqOneCB> op) {
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
     *     WhiteSuppressJoinSqOne whiteSuppressJoinSqOne = new WhiteSuppressJoinSqOne();
     *     whiteSuppressJoinSqOne.setFooName("foo");
     *     if (...) {
     *         whiteSuppressJoinSqOne.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteSuppressJoinSqOneList.add(whiteSuppressJoinSqOne);
     * }
     * whiteSuppressJoinSqOneBhv.<span style="color: #DD4747">batchInsert</span>(whiteSuppressJoinSqOneList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteSuppressJoinSqOneList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteSuppressJoinSqOne> whiteSuppressJoinSqOneList) {
        InsertOption<WhiteSuppressJoinSqOneCB> op = createInsertUpdateOption();
        return doBatchInsert(whiteSuppressJoinSqOneList, op);
    }

    protected int[] doBatchInsert(List<WhiteSuppressJoinSqOne> whiteSuppressJoinSqOneList, InsertOption<WhiteSuppressJoinSqOneCB> op) {
        assertObjectNotNull("whiteSuppressJoinSqOneList", whiteSuppressJoinSqOneList);
        prepareBatchInsertOption(whiteSuppressJoinSqOneList, op);
        return delegateBatchInsert(whiteSuppressJoinSqOneList, op);
    }

    protected void prepareBatchInsertOption(List<WhiteSuppressJoinSqOne> whiteSuppressJoinSqOneList, InsertOption<WhiteSuppressJoinSqOneCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(whiteSuppressJoinSqOneList);
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
     *     WhiteSuppressJoinSqOne whiteSuppressJoinSqOne = new WhiteSuppressJoinSqOne();
     *     whiteSuppressJoinSqOne.setFooName("foo");
     *     if (...) {
     *         whiteSuppressJoinSqOne.setFooPrice(123);
     *     } else {
     *         whiteSuppressJoinSqOne.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteSuppressJoinSqOne.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteSuppressJoinSqOneList.add(whiteSuppressJoinSqOne);
     * }
     * whiteSuppressJoinSqOneBhv.<span style="color: #DD4747">batchUpdate</span>(whiteSuppressJoinSqOneList);
     * </pre>
     * @param whiteSuppressJoinSqOneList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteSuppressJoinSqOne> whiteSuppressJoinSqOneList) {
        UpdateOption<WhiteSuppressJoinSqOneCB> op = createPlainUpdateOption();
        return doBatchUpdate(whiteSuppressJoinSqOneList, op);
    }

    protected int[] doBatchUpdate(List<WhiteSuppressJoinSqOne> whiteSuppressJoinSqOneList, UpdateOption<WhiteSuppressJoinSqOneCB> op) {
        assertObjectNotNull("whiteSuppressJoinSqOneList", whiteSuppressJoinSqOneList);
        prepareBatchUpdateOption(whiteSuppressJoinSqOneList, op);
        return delegateBatchUpdate(whiteSuppressJoinSqOneList, op);
    }

    protected void prepareBatchUpdateOption(List<WhiteSuppressJoinSqOne> whiteSuppressJoinSqOneList, UpdateOption<WhiteSuppressJoinSqOneCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(whiteSuppressJoinSqOneList);
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
     * whiteSuppressJoinSqOneBhv.<span style="color: #DD4747">batchUpdate</span>(whiteSuppressJoinSqOneList, new SpecifyQuery<WhiteSuppressJoinSqOneCB>() {
     *     public void specify(WhiteSuppressJoinSqOneCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteSuppressJoinSqOneBhv.<span style="color: #DD4747">batchUpdate</span>(whiteSuppressJoinSqOneList, new SpecifyQuery<WhiteSuppressJoinSqOneCB>() {
     *     public void specify(WhiteSuppressJoinSqOneCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteSuppressJoinSqOneList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteSuppressJoinSqOne> whiteSuppressJoinSqOneList, SpecifyQuery<WhiteSuppressJoinSqOneCB> updateColumnSpec) {
        return doBatchUpdate(whiteSuppressJoinSqOneList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteSuppressJoinSqOneList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteSuppressJoinSqOne> whiteSuppressJoinSqOneList) {
        return doBatchDelete(whiteSuppressJoinSqOneList, null);
    }

    protected int[] doBatchDelete(List<WhiteSuppressJoinSqOne> whiteSuppressJoinSqOneList, DeleteOption<WhiteSuppressJoinSqOneCB> op) {
        assertObjectNotNull("whiteSuppressJoinSqOneList", whiteSuppressJoinSqOneList);
        prepareDeleteOption(op);
        return delegateBatchDelete(whiteSuppressJoinSqOneList, op);
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
     * whiteSuppressJoinSqOneBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteSuppressJoinSqOne, WhiteSuppressJoinSqOneCB&gt;() {
     *     public ConditionBean setup(whiteSuppressJoinSqOne entity, WhiteSuppressJoinSqOneCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteSuppressJoinSqOne, WhiteSuppressJoinSqOneCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteSuppressJoinSqOne, WhiteSuppressJoinSqOneCB> sp, InsertOption<WhiteSuppressJoinSqOneCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        WhiteSuppressJoinSqOne e = new WhiteSuppressJoinSqOne();
        WhiteSuppressJoinSqOneCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected WhiteSuppressJoinSqOneCB createCBForQueryInsert() {
        WhiteSuppressJoinSqOneCB cb = newMyConditionBean();
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
     * WhiteSuppressJoinSqOne whiteSuppressJoinSqOne = new WhiteSuppressJoinSqOne();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqOne.setPK...(value);</span>
     * whiteSuppressJoinSqOne.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqOne.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqOne.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqOne.setVersionNo(value);</span>
     * WhiteSuppressJoinSqOneCB cb = new WhiteSuppressJoinSqOneCB();
     * cb.query().setFoo...(value);
     * whiteSuppressJoinSqOneBhv.<span style="color: #DD4747">queryUpdate</span>(whiteSuppressJoinSqOne, cb);
     * </pre>
     * @param whiteSuppressJoinSqOne The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteSuppressJoinSqOne. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteSuppressJoinSqOne whiteSuppressJoinSqOne, WhiteSuppressJoinSqOneCB cb) {
        return doQueryUpdate(whiteSuppressJoinSqOne, cb, null);
    }

    protected int doQueryUpdate(WhiteSuppressJoinSqOne whiteSuppressJoinSqOne, WhiteSuppressJoinSqOneCB cb, UpdateOption<WhiteSuppressJoinSqOneCB> op) {
        assertObjectNotNull("whiteSuppressJoinSqOne", whiteSuppressJoinSqOne); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(whiteSuppressJoinSqOne, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (WhiteSuppressJoinSqOneCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (WhiteSuppressJoinSqOneCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteSuppressJoinSqOneCB cb = new WhiteSuppressJoinSqOneCB();
     * cb.query().setFoo...(value);
     * whiteSuppressJoinSqOneBhv.<span style="color: #DD4747">queryDelete</span>(whiteSuppressJoinSqOne, cb);
     * </pre>
     * @param cb The condition-bean of WhiteSuppressJoinSqOne. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteSuppressJoinSqOneCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteSuppressJoinSqOneCB cb, DeleteOption<WhiteSuppressJoinSqOneCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((WhiteSuppressJoinSqOneCB)cb); }
        else { return varyingQueryDelete((WhiteSuppressJoinSqOneCB)cb, downcast(op)); }
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
     * WhiteSuppressJoinSqOne whiteSuppressJoinSqOne = new WhiteSuppressJoinSqOne();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteSuppressJoinSqOne.setFoo...(value);
     * whiteSuppressJoinSqOne.setBar...(value);
     * InsertOption<WhiteSuppressJoinSqOneCB> option = new InsertOption<WhiteSuppressJoinSqOneCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteSuppressJoinSqOneBhv.<span style="color: #DD4747">varyingInsert</span>(whiteSuppressJoinSqOne, option);
     * ... = whiteSuppressJoinSqOne.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteSuppressJoinSqOne The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteSuppressJoinSqOne whiteSuppressJoinSqOne, InsertOption<WhiteSuppressJoinSqOneCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteSuppressJoinSqOne, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteSuppressJoinSqOne whiteSuppressJoinSqOne = new WhiteSuppressJoinSqOne();
     * whiteSuppressJoinSqOne.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteSuppressJoinSqOne.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteSuppressJoinSqOne.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteSuppressJoinSqOneCB&gt; option = new UpdateOption&lt;WhiteSuppressJoinSqOneCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteSuppressJoinSqOneCB&gt;() {
     *         public void specify(WhiteSuppressJoinSqOneCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteSuppressJoinSqOneBhv.<span style="color: #DD4747">varyingUpdate</span>(whiteSuppressJoinSqOne, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSuppressJoinSqOne The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteSuppressJoinSqOne whiteSuppressJoinSqOne, UpdateOption<WhiteSuppressJoinSqOneCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteSuppressJoinSqOne, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteSuppressJoinSqOne The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteSuppressJoinSqOne whiteSuppressJoinSqOne, InsertOption<WhiteSuppressJoinSqOneCB> insertOption, UpdateOption<WhiteSuppressJoinSqOneCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(whiteSuppressJoinSqOne, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteSuppressJoinSqOne The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteSuppressJoinSqOne whiteSuppressJoinSqOne, DeleteOption<WhiteSuppressJoinSqOneCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteSuppressJoinSqOne, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteSuppressJoinSqOneList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteSuppressJoinSqOne> whiteSuppressJoinSqOneList, InsertOption<WhiteSuppressJoinSqOneCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteSuppressJoinSqOneList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteSuppressJoinSqOneList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteSuppressJoinSqOne> whiteSuppressJoinSqOneList, UpdateOption<WhiteSuppressJoinSqOneCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteSuppressJoinSqOneList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteSuppressJoinSqOneList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteSuppressJoinSqOne> whiteSuppressJoinSqOneList, DeleteOption<WhiteSuppressJoinSqOneCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteSuppressJoinSqOneList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteSuppressJoinSqOne, WhiteSuppressJoinSqOneCB> setupper, InsertOption<WhiteSuppressJoinSqOneCB> option) {
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
     * WhiteSuppressJoinSqOne whiteSuppressJoinSqOne = new WhiteSuppressJoinSqOne();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqOne.setPK...(value);</span>
     * whiteSuppressJoinSqOne.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqOne.setVersionNo(value);</span>
     * WhiteSuppressJoinSqOneCB cb = new WhiteSuppressJoinSqOneCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteSuppressJoinSqOneCB&gt; option = new UpdateOption&lt;WhiteSuppressJoinSqOneCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteSuppressJoinSqOneCB&gt;() {
     *     public void specify(WhiteSuppressJoinSqOneCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteSuppressJoinSqOneBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteSuppressJoinSqOne, cb, option);
     * </pre>
     * @param whiteSuppressJoinSqOne The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteSuppressJoinSqOne. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteSuppressJoinSqOne whiteSuppressJoinSqOne, WhiteSuppressJoinSqOneCB cb, UpdateOption<WhiteSuppressJoinSqOneCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteSuppressJoinSqOne, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteSuppressJoinSqOne. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteSuppressJoinSqOneCB cb, DeleteOption<WhiteSuppressJoinSqOneCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteSuppressJoinSqOneBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhiteSuppressJoinSqOneCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhiteSuppressJoinSqOneCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhiteSuppressJoinSqOne> void delegateSelectCursor(WhiteSuppressJoinSqOneCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends WhiteSuppressJoinSqOne> List<ENTITY> delegateSelectList(WhiteSuppressJoinSqOneCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhiteSuppressJoinSqOne et, InsertOption<WhiteSuppressJoinSqOneCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(WhiteSuppressJoinSqOne et, UpdateOption<WhiteSuppressJoinSqOneCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(WhiteSuppressJoinSqOne et, UpdateOption<WhiteSuppressJoinSqOneCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(WhiteSuppressJoinSqOne et, DeleteOption<WhiteSuppressJoinSqOneCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(WhiteSuppressJoinSqOne et, DeleteOption<WhiteSuppressJoinSqOneCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<WhiteSuppressJoinSqOne> ls, InsertOption<WhiteSuppressJoinSqOneCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhiteSuppressJoinSqOne> ls, UpdateOption<WhiteSuppressJoinSqOneCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhiteSuppressJoinSqOne> ls, UpdateOption<WhiteSuppressJoinSqOneCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhiteSuppressJoinSqOne> ls, DeleteOption<WhiteSuppressJoinSqOneCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhiteSuppressJoinSqOne> ls, DeleteOption<WhiteSuppressJoinSqOneCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhiteSuppressJoinSqOne et, WhiteSuppressJoinSqOneCB inCB, ConditionBean resCB, InsertOption<WhiteSuppressJoinSqOneCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhiteSuppressJoinSqOne et, WhiteSuppressJoinSqOneCB cb, UpdateOption<WhiteSuppressJoinSqOneCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(WhiteSuppressJoinSqOneCB cb, DeleteOption<WhiteSuppressJoinSqOneCB> op)
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
    protected WhiteSuppressJoinSqOne downcast(Entity et) {
        return helpEntityDowncastInternally(et, WhiteSuppressJoinSqOne.class);
    }

    protected WhiteSuppressJoinSqOneCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, WhiteSuppressJoinSqOneCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<WhiteSuppressJoinSqOne> downcast(List<? extends Entity> ls) {
        return (List<WhiteSuppressJoinSqOne>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteSuppressJoinSqOneCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<WhiteSuppressJoinSqOneCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteSuppressJoinSqOneCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<WhiteSuppressJoinSqOneCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteSuppressJoinSqOneCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<WhiteSuppressJoinSqOneCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteSuppressJoinSqOne, WhiteSuppressJoinSqOneCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<WhiteSuppressJoinSqOne, WhiteSuppressJoinSqOneCB>)sp;
    }
}
