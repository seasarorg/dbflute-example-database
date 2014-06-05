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
 * The behavior of WHITE_ONLY_ONE_TO_ONE_TO as TABLE. <br />
 * <pre>
 * [primary key]
 *     TO_ID
 *
 * [column]
 *     TO_ID, TO_NAME, FROM_ID
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TO_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     white_only_one_to_one_from
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     whiteOnlyOneToOneFrom
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteOnlyOneToOneToBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_only_one_to_one_to"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return WhiteOnlyOneToOneToDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteOnlyOneToOneToDbm getMyDBMeta() { return WhiteOnlyOneToOneToDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteOnlyOneToOneTo newMyEntity() { return new WhiteOnlyOneToOneTo(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteOnlyOneToOneToCB newMyConditionBean() { return new WhiteOnlyOneToOneToCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteOnlyOneToOneToCB cb = new WhiteOnlyOneToOneToCB();
     * cb.query().setFoo...(value);
     * int count = whiteOnlyOneToOneToBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteOnlyOneToOneTo. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteOnlyOneToOneToCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteOnlyOneToOneToCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteOnlyOneToOneToCB cb) { // called by selectPage(cb)
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
     * WhiteOnlyOneToOneToCB cb = new WhiteOnlyOneToOneToCB();
     * cb.query().setFoo...(value);
     * WhiteOnlyOneToOneTo whiteOnlyOneToOneTo = whiteOnlyOneToOneToBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (whiteOnlyOneToOneTo != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = whiteOnlyOneToOneTo.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteOnlyOneToOneTo. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteOnlyOneToOneTo selectEntity(WhiteOnlyOneToOneToCB cb) {
        return doSelectEntity(cb, WhiteOnlyOneToOneTo.class);
    }

    protected <ENTITY extends WhiteOnlyOneToOneTo> ENTITY doSelectEntity(WhiteOnlyOneToOneToCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, WhiteOnlyOneToOneToCB>() {
            public List<ENTITY> callbackSelectList(WhiteOnlyOneToOneToCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    protected <ENTITY extends WhiteOnlyOneToOneTo> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteOnlyOneToOneToCB cb, Class<ENTITY> tp) {
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
     * WhiteOnlyOneToOneToCB cb = new WhiteOnlyOneToOneToCB();
     * cb.query().setFoo...(value);
     * WhiteOnlyOneToOneTo whiteOnlyOneToOneTo = whiteOnlyOneToOneToBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteOnlyOneToOneTo.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteOnlyOneToOneTo. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteOnlyOneToOneTo selectEntityWithDeletedCheck(WhiteOnlyOneToOneToCB cb) {
        return doSelectEntityWithDeletedCheck(cb, WhiteOnlyOneToOneTo.class);
    }

    protected <ENTITY extends WhiteOnlyOneToOneTo> ENTITY doSelectEntityWithDeletedCheck(WhiteOnlyOneToOneToCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteOnlyOneToOneToCB>() {
            public List<ENTITY> callbackSelectList(WhiteOnlyOneToOneToCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param toId : PK, ID, NotNull, BIGINT(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteOnlyOneToOneTo selectByPKValue(Long toId) {
        return doSelectByPK(toId, WhiteOnlyOneToOneTo.class);
    }

    protected <ENTITY extends WhiteOnlyOneToOneTo> ENTITY doSelectByPK(Long toId, Class<ENTITY> entityType) {
        return doSelectEntity(xprepareCBAsPK(toId), entityType);
    }

    protected <ENTITY extends WhiteOnlyOneToOneTo> OptionalEntity<ENTITY> doSelectOptionalByPK(Long toId, Class<ENTITY> entityType) {
        return createOptionalEntity(doSelectByPK(toId, entityType), toId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param toId : PK, ID, NotNull, BIGINT(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteOnlyOneToOneTo selectByPKValueWithDeletedCheck(Long toId) {
        return doSelectByPKWithDeletedCheck(toId, WhiteOnlyOneToOneTo.class);
    }

    protected <ENTITY extends WhiteOnlyOneToOneTo> ENTITY doSelectByPKWithDeletedCheck(Long toId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(toId), entityType);
    }

    protected WhiteOnlyOneToOneToCB xprepareCBAsPK(Long toId) {
        assertObjectNotNull("toId", toId);
        WhiteOnlyOneToOneToCB cb = newMyConditionBean(); cb.acceptPrimaryKey(toId);
        return cb;
    }

    /**
     * Select the entity by the unique-key value.
     * @param fromId : UQ, NotNull, BIGINT(19), FK to white_only_one_to_one_from. (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteOnlyOneToOneTo> selectByUniqueOf(Long fromId) {
        return doSelectByUniqueOf(fromId, WhiteOnlyOneToOneTo.class);
    }

    protected <ENTITY extends WhiteOnlyOneToOneTo> OptionalEntity<ENTITY> doSelectByUniqueOf(Long fromId, Class<ENTITY> entityType) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(fromId), entityType), fromId);
    }

    protected WhiteOnlyOneToOneToCB xprepareCBAsUniqueOf(Long fromId) {
        assertObjectNotNull("fromId", fromId);
        WhiteOnlyOneToOneToCB cb = newMyConditionBean(); cb.acceptUniqueOf(fromId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteOnlyOneToOneToCB cb = new WhiteOnlyOneToOneToCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteOnlyOneToOneTo&gt; whiteOnlyOneToOneToList = whiteOnlyOneToOneToBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteOnlyOneToOneTo whiteOnlyOneToOneTo : whiteOnlyOneToOneToList) {
     *     ... = whiteOnlyOneToOneTo.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteOnlyOneToOneTo. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteOnlyOneToOneTo> selectList(WhiteOnlyOneToOneToCB cb) {
        return doSelectList(cb, WhiteOnlyOneToOneTo.class);
    }

    protected <ENTITY extends WhiteOnlyOneToOneTo> ListResultBean<ENTITY> doSelectList(WhiteOnlyOneToOneToCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, WhiteOnlyOneToOneToCB>() {
            public List<ENTITY> callbackSelectList(WhiteOnlyOneToOneToCB lcb, Class<ENTITY> ltp) { return delegateSelectList(lcb, ltp); } });
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
     * WhiteOnlyOneToOneToCB cb = new WhiteOnlyOneToOneToCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteOnlyOneToOneTo&gt; page = whiteOnlyOneToOneToBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteOnlyOneToOneTo whiteOnlyOneToOneTo : page) {
     *     ... = whiteOnlyOneToOneTo.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteOnlyOneToOneTo. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteOnlyOneToOneTo> selectPage(WhiteOnlyOneToOneToCB cb) {
        return doSelectPage(cb, WhiteOnlyOneToOneTo.class);
    }

    protected <ENTITY extends WhiteOnlyOneToOneTo> PagingResultBean<ENTITY> doSelectPage(WhiteOnlyOneToOneToCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, WhiteOnlyOneToOneToCB>() {
            public int callbackSelectCount(WhiteOnlyOneToOneToCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteOnlyOneToOneToCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * WhiteOnlyOneToOneToCB cb = new WhiteOnlyOneToOneToCB();
     * cb.query().setFoo...(value);
     * whiteOnlyOneToOneToBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteOnlyOneToOneTo&gt;() {
     *     public void handle(WhiteOnlyOneToOneTo entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteOnlyOneToOneTo. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteOnlyOneToOneTo. (NotNull)
     */
    public void selectCursor(WhiteOnlyOneToOneToCB cb, EntityRowHandler<WhiteOnlyOneToOneTo> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, WhiteOnlyOneToOneTo.class);
    }

    protected <ENTITY extends WhiteOnlyOneToOneTo> void doSelectCursor(WhiteOnlyOneToOneToCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, WhiteOnlyOneToOneToCB>() {
            public void callbackSelectCursor(WhiteOnlyOneToOneToCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(WhiteOnlyOneToOneToCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteOnlyOneToOneToBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteOnlyOneToOneToCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<WhiteOnlyOneToOneToCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends WhiteOnlyOneToOneToCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends WhiteOnlyOneToOneToCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
     * Pull out the list of foreign table 'WhiteOnlyOneToOneFrom'.
     * @param whiteOnlyOneToOneToList The list of whiteOnlyOneToOneTo. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteOnlyOneToOneFrom> pulloutWhiteOnlyOneToOneFrom(List<WhiteOnlyOneToOneTo> whiteOnlyOneToOneToList) {
        return helpPulloutInternally(whiteOnlyOneToOneToList, new InternalPulloutCallback<WhiteOnlyOneToOneTo, WhiteOnlyOneToOneFrom>() {
            public WhiteOnlyOneToOneFrom getFr(WhiteOnlyOneToOneTo et)
            { return et.getWhiteOnlyOneToOneFrom(); }
            public boolean hasRf() { return true; }
            public void setRfLs(WhiteOnlyOneToOneFrom et, List<WhiteOnlyOneToOneTo> ls)
            { if (!ls.isEmpty()) { et.setWhiteOnlyOneToOneToAsOne(ls.get(0)); } }
        });
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key toId.
     * @param whiteOnlyOneToOneToList The list of whiteOnlyOneToOneTo. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractToIdList(List<WhiteOnlyOneToOneTo> whiteOnlyOneToOneToList) {
        return helpExtractListInternally(whiteOnlyOneToOneToList, new InternalExtractCallback<WhiteOnlyOneToOneTo, Long>() {
            public Long getCV(WhiteOnlyOneToOneTo et) { return et.getToId(); }
        });
    }

    /**
     * Extract the value list of (single) unique key fromId.
     * @param whiteOnlyOneToOneToList The list of whiteOnlyOneToOneTo. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractFromIdList(List<WhiteOnlyOneToOneTo> whiteOnlyOneToOneToList) {
        return helpExtractListInternally(whiteOnlyOneToOneToList, new InternalExtractCallback<WhiteOnlyOneToOneTo, Long>() {
            public Long getCV(WhiteOnlyOneToOneTo et) { return et.getFromId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteOnlyOneToOneTo whiteOnlyOneToOneTo = new WhiteOnlyOneToOneTo();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteOnlyOneToOneTo.setFoo...(value);
     * whiteOnlyOneToOneTo.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteOnlyOneToOneTo.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteOnlyOneToOneTo.set...;</span>
     * whiteOnlyOneToOneToBhv.<span style="color: #DD4747">insert</span>(whiteOnlyOneToOneTo);
     * ... = whiteOnlyOneToOneTo.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteOnlyOneToOneTo The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteOnlyOneToOneTo whiteOnlyOneToOneTo) {
        doInsert(whiteOnlyOneToOneTo, null);
    }

    protected void doInsert(WhiteOnlyOneToOneTo whiteOnlyOneToOneTo, InsertOption<WhiteOnlyOneToOneToCB> op) {
        assertObjectNotNull("whiteOnlyOneToOneTo", whiteOnlyOneToOneTo);
        prepareInsertOption(op);
        delegateInsert(whiteOnlyOneToOneTo, op);
    }

    protected void prepareInsertOption(InsertOption<WhiteOnlyOneToOneToCB> op) {
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
     * WhiteOnlyOneToOneTo whiteOnlyOneToOneTo = new WhiteOnlyOneToOneTo();
     * whiteOnlyOneToOneTo.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteOnlyOneToOneTo.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteOnlyOneToOneTo.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteOnlyOneToOneTo.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteOnlyOneToOneTo.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteOnlyOneToOneToBhv.<span style="color: #DD4747">update</span>(whiteOnlyOneToOneTo);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteOnlyOneToOneTo The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final WhiteOnlyOneToOneTo whiteOnlyOneToOneTo) {
        doUpdate(whiteOnlyOneToOneTo, null);
    }

    protected void doUpdate(WhiteOnlyOneToOneTo whiteOnlyOneToOneTo, final UpdateOption<WhiteOnlyOneToOneToCB> op) {
        assertObjectNotNull("whiteOnlyOneToOneTo", whiteOnlyOneToOneTo);
        prepareUpdateOption(op);
        helpUpdateInternally(whiteOnlyOneToOneTo, new InternalUpdateCallback<WhiteOnlyOneToOneTo>() {
            public int callbackDelegateUpdate(WhiteOnlyOneToOneTo et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhiteOnlyOneToOneToCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected WhiteOnlyOneToOneToCB createCBForVaryingUpdate() {
        WhiteOnlyOneToOneToCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected WhiteOnlyOneToOneToCB createCBForSpecifiedUpdate() {
        WhiteOnlyOneToOneToCB cb = newMyConditionBean();
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
     * @param whiteOnlyOneToOneTo The entity of insert or update target. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteOnlyOneToOneTo whiteOnlyOneToOneTo) {
        doInesrtOrUpdate(whiteOnlyOneToOneTo, null, null);
    }

    protected void doInesrtOrUpdate(WhiteOnlyOneToOneTo whiteOnlyOneToOneTo, final InsertOption<WhiteOnlyOneToOneToCB> iop, final UpdateOption<WhiteOnlyOneToOneToCB> uop) {
        helpInsertOrUpdateInternally(whiteOnlyOneToOneTo, new InternalInsertOrUpdateCallback<WhiteOnlyOneToOneTo, WhiteOnlyOneToOneToCB>() {
            public void callbackInsert(WhiteOnlyOneToOneTo et) { doInsert(et, iop); }
            public void callbackUpdate(WhiteOnlyOneToOneTo et) { doUpdate(et, uop); }
            public WhiteOnlyOneToOneToCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(WhiteOnlyOneToOneToCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<WhiteOnlyOneToOneToCB>();
            uop = uop != null ? uop : new UpdateOption<WhiteOnlyOneToOneToCB>();
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
     * WhiteOnlyOneToOneTo whiteOnlyOneToOneTo = new WhiteOnlyOneToOneTo();
     * whiteOnlyOneToOneTo.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteOnlyOneToOneTo.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteOnlyOneToOneToBhv.<span style="color: #DD4747">delete</span>(whiteOnlyOneToOneTo);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteOnlyOneToOneTo The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteOnlyOneToOneTo whiteOnlyOneToOneTo) {
        doDelete(whiteOnlyOneToOneTo, null);
    }

    protected void doDelete(WhiteOnlyOneToOneTo whiteOnlyOneToOneTo, final DeleteOption<WhiteOnlyOneToOneToCB> op) {
        assertObjectNotNull("whiteOnlyOneToOneTo", whiteOnlyOneToOneTo);
        prepareDeleteOption(op);
        helpDeleteInternally(whiteOnlyOneToOneTo, new InternalDeleteCallback<WhiteOnlyOneToOneTo>() {
            public int callbackDelegateDelete(WhiteOnlyOneToOneTo et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhiteOnlyOneToOneToCB> op) {
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
     *     WhiteOnlyOneToOneTo whiteOnlyOneToOneTo = new WhiteOnlyOneToOneTo();
     *     whiteOnlyOneToOneTo.setFooName("foo");
     *     if (...) {
     *         whiteOnlyOneToOneTo.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteOnlyOneToOneToList.add(whiteOnlyOneToOneTo);
     * }
     * whiteOnlyOneToOneToBhv.<span style="color: #DD4747">batchInsert</span>(whiteOnlyOneToOneToList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteOnlyOneToOneToList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteOnlyOneToOneTo> whiteOnlyOneToOneToList) {
        InsertOption<WhiteOnlyOneToOneToCB> op = createInsertUpdateOption();
        return doBatchInsert(whiteOnlyOneToOneToList, op);
    }

    protected int[] doBatchInsert(List<WhiteOnlyOneToOneTo> whiteOnlyOneToOneToList, InsertOption<WhiteOnlyOneToOneToCB> op) {
        assertObjectNotNull("whiteOnlyOneToOneToList", whiteOnlyOneToOneToList);
        prepareBatchInsertOption(whiteOnlyOneToOneToList, op);
        return delegateBatchInsert(whiteOnlyOneToOneToList, op);
    }

    protected void prepareBatchInsertOption(List<WhiteOnlyOneToOneTo> whiteOnlyOneToOneToList, InsertOption<WhiteOnlyOneToOneToCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(whiteOnlyOneToOneToList);
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
     *     WhiteOnlyOneToOneTo whiteOnlyOneToOneTo = new WhiteOnlyOneToOneTo();
     *     whiteOnlyOneToOneTo.setFooName("foo");
     *     if (...) {
     *         whiteOnlyOneToOneTo.setFooPrice(123);
     *     } else {
     *         whiteOnlyOneToOneTo.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteOnlyOneToOneTo.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteOnlyOneToOneToList.add(whiteOnlyOneToOneTo);
     * }
     * whiteOnlyOneToOneToBhv.<span style="color: #DD4747">batchUpdate</span>(whiteOnlyOneToOneToList);
     * </pre>
     * @param whiteOnlyOneToOneToList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteOnlyOneToOneTo> whiteOnlyOneToOneToList) {
        UpdateOption<WhiteOnlyOneToOneToCB> op = createPlainUpdateOption();
        return doBatchUpdate(whiteOnlyOneToOneToList, op);
    }

    protected int[] doBatchUpdate(List<WhiteOnlyOneToOneTo> whiteOnlyOneToOneToList, UpdateOption<WhiteOnlyOneToOneToCB> op) {
        assertObjectNotNull("whiteOnlyOneToOneToList", whiteOnlyOneToOneToList);
        prepareBatchUpdateOption(whiteOnlyOneToOneToList, op);
        return delegateBatchUpdate(whiteOnlyOneToOneToList, op);
    }

    protected void prepareBatchUpdateOption(List<WhiteOnlyOneToOneTo> whiteOnlyOneToOneToList, UpdateOption<WhiteOnlyOneToOneToCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(whiteOnlyOneToOneToList);
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
     * whiteOnlyOneToOneToBhv.<span style="color: #DD4747">batchUpdate</span>(whiteOnlyOneToOneToList, new SpecifyQuery<WhiteOnlyOneToOneToCB>() {
     *     public void specify(WhiteOnlyOneToOneToCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteOnlyOneToOneToBhv.<span style="color: #DD4747">batchUpdate</span>(whiteOnlyOneToOneToList, new SpecifyQuery<WhiteOnlyOneToOneToCB>() {
     *     public void specify(WhiteOnlyOneToOneToCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteOnlyOneToOneToList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteOnlyOneToOneTo> whiteOnlyOneToOneToList, SpecifyQuery<WhiteOnlyOneToOneToCB> updateColumnSpec) {
        return doBatchUpdate(whiteOnlyOneToOneToList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteOnlyOneToOneToList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteOnlyOneToOneTo> whiteOnlyOneToOneToList) {
        return doBatchDelete(whiteOnlyOneToOneToList, null);
    }

    protected int[] doBatchDelete(List<WhiteOnlyOneToOneTo> whiteOnlyOneToOneToList, DeleteOption<WhiteOnlyOneToOneToCB> op) {
        assertObjectNotNull("whiteOnlyOneToOneToList", whiteOnlyOneToOneToList);
        prepareDeleteOption(op);
        return delegateBatchDelete(whiteOnlyOneToOneToList, op);
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
     * whiteOnlyOneToOneToBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteOnlyOneToOneTo, WhiteOnlyOneToOneToCB&gt;() {
     *     public ConditionBean setup(whiteOnlyOneToOneTo entity, WhiteOnlyOneToOneToCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteOnlyOneToOneTo, WhiteOnlyOneToOneToCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteOnlyOneToOneTo, WhiteOnlyOneToOneToCB> sp, InsertOption<WhiteOnlyOneToOneToCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        WhiteOnlyOneToOneTo e = new WhiteOnlyOneToOneTo();
        WhiteOnlyOneToOneToCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected WhiteOnlyOneToOneToCB createCBForQueryInsert() {
        WhiteOnlyOneToOneToCB cb = newMyConditionBean();
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
     * WhiteOnlyOneToOneTo whiteOnlyOneToOneTo = new WhiteOnlyOneToOneTo();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteOnlyOneToOneTo.setPK...(value);</span>
     * whiteOnlyOneToOneTo.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteOnlyOneToOneTo.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteOnlyOneToOneTo.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteOnlyOneToOneTo.setVersionNo(value);</span>
     * WhiteOnlyOneToOneToCB cb = new WhiteOnlyOneToOneToCB();
     * cb.query().setFoo...(value);
     * whiteOnlyOneToOneToBhv.<span style="color: #DD4747">queryUpdate</span>(whiteOnlyOneToOneTo, cb);
     * </pre>
     * @param whiteOnlyOneToOneTo The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteOnlyOneToOneTo. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteOnlyOneToOneTo whiteOnlyOneToOneTo, WhiteOnlyOneToOneToCB cb) {
        return doQueryUpdate(whiteOnlyOneToOneTo, cb, null);
    }

    protected int doQueryUpdate(WhiteOnlyOneToOneTo whiteOnlyOneToOneTo, WhiteOnlyOneToOneToCB cb, UpdateOption<WhiteOnlyOneToOneToCB> op) {
        assertObjectNotNull("whiteOnlyOneToOneTo", whiteOnlyOneToOneTo); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(whiteOnlyOneToOneTo, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (WhiteOnlyOneToOneToCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (WhiteOnlyOneToOneToCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteOnlyOneToOneToCB cb = new WhiteOnlyOneToOneToCB();
     * cb.query().setFoo...(value);
     * whiteOnlyOneToOneToBhv.<span style="color: #DD4747">queryDelete</span>(whiteOnlyOneToOneTo, cb);
     * </pre>
     * @param cb The condition-bean of WhiteOnlyOneToOneTo. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteOnlyOneToOneToCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteOnlyOneToOneToCB cb, DeleteOption<WhiteOnlyOneToOneToCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((WhiteOnlyOneToOneToCB)cb); }
        else { return varyingQueryDelete((WhiteOnlyOneToOneToCB)cb, downcast(op)); }
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
     * WhiteOnlyOneToOneTo whiteOnlyOneToOneTo = new WhiteOnlyOneToOneTo();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteOnlyOneToOneTo.setFoo...(value);
     * whiteOnlyOneToOneTo.setBar...(value);
     * InsertOption<WhiteOnlyOneToOneToCB> option = new InsertOption<WhiteOnlyOneToOneToCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteOnlyOneToOneToBhv.<span style="color: #DD4747">varyingInsert</span>(whiteOnlyOneToOneTo, option);
     * ... = whiteOnlyOneToOneTo.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteOnlyOneToOneTo The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteOnlyOneToOneTo whiteOnlyOneToOneTo, InsertOption<WhiteOnlyOneToOneToCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteOnlyOneToOneTo, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteOnlyOneToOneTo whiteOnlyOneToOneTo = new WhiteOnlyOneToOneTo();
     * whiteOnlyOneToOneTo.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteOnlyOneToOneTo.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteOnlyOneToOneTo.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteOnlyOneToOneToCB&gt; option = new UpdateOption&lt;WhiteOnlyOneToOneToCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteOnlyOneToOneToCB&gt;() {
     *         public void specify(WhiteOnlyOneToOneToCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteOnlyOneToOneToBhv.<span style="color: #DD4747">varyingUpdate</span>(whiteOnlyOneToOneTo, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteOnlyOneToOneTo The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteOnlyOneToOneTo whiteOnlyOneToOneTo, UpdateOption<WhiteOnlyOneToOneToCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteOnlyOneToOneTo, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteOnlyOneToOneTo The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteOnlyOneToOneTo whiteOnlyOneToOneTo, InsertOption<WhiteOnlyOneToOneToCB> insertOption, UpdateOption<WhiteOnlyOneToOneToCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(whiteOnlyOneToOneTo, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteOnlyOneToOneTo The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteOnlyOneToOneTo whiteOnlyOneToOneTo, DeleteOption<WhiteOnlyOneToOneToCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteOnlyOneToOneTo, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteOnlyOneToOneToList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteOnlyOneToOneTo> whiteOnlyOneToOneToList, InsertOption<WhiteOnlyOneToOneToCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteOnlyOneToOneToList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteOnlyOneToOneToList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteOnlyOneToOneTo> whiteOnlyOneToOneToList, UpdateOption<WhiteOnlyOneToOneToCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteOnlyOneToOneToList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteOnlyOneToOneToList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteOnlyOneToOneTo> whiteOnlyOneToOneToList, DeleteOption<WhiteOnlyOneToOneToCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteOnlyOneToOneToList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteOnlyOneToOneTo, WhiteOnlyOneToOneToCB> setupper, InsertOption<WhiteOnlyOneToOneToCB> option) {
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
     * WhiteOnlyOneToOneTo whiteOnlyOneToOneTo = new WhiteOnlyOneToOneTo();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteOnlyOneToOneTo.setPK...(value);</span>
     * whiteOnlyOneToOneTo.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteOnlyOneToOneTo.setVersionNo(value);</span>
     * WhiteOnlyOneToOneToCB cb = new WhiteOnlyOneToOneToCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteOnlyOneToOneToCB&gt; option = new UpdateOption&lt;WhiteOnlyOneToOneToCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteOnlyOneToOneToCB&gt;() {
     *     public void specify(WhiteOnlyOneToOneToCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteOnlyOneToOneToBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteOnlyOneToOneTo, cb, option);
     * </pre>
     * @param whiteOnlyOneToOneTo The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteOnlyOneToOneTo. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteOnlyOneToOneTo whiteOnlyOneToOneTo, WhiteOnlyOneToOneToCB cb, UpdateOption<WhiteOnlyOneToOneToCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteOnlyOneToOneTo, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteOnlyOneToOneTo. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteOnlyOneToOneToCB cb, DeleteOption<WhiteOnlyOneToOneToCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteOnlyOneToOneToBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhiteOnlyOneToOneToCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhiteOnlyOneToOneToCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhiteOnlyOneToOneTo> void delegateSelectCursor(WhiteOnlyOneToOneToCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends WhiteOnlyOneToOneTo> List<ENTITY> delegateSelectList(WhiteOnlyOneToOneToCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhiteOnlyOneToOneTo et, InsertOption<WhiteOnlyOneToOneToCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(WhiteOnlyOneToOneTo et, UpdateOption<WhiteOnlyOneToOneToCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(WhiteOnlyOneToOneTo et, UpdateOption<WhiteOnlyOneToOneToCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(WhiteOnlyOneToOneTo et, DeleteOption<WhiteOnlyOneToOneToCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(WhiteOnlyOneToOneTo et, DeleteOption<WhiteOnlyOneToOneToCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<WhiteOnlyOneToOneTo> ls, InsertOption<WhiteOnlyOneToOneToCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhiteOnlyOneToOneTo> ls, UpdateOption<WhiteOnlyOneToOneToCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhiteOnlyOneToOneTo> ls, UpdateOption<WhiteOnlyOneToOneToCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhiteOnlyOneToOneTo> ls, DeleteOption<WhiteOnlyOneToOneToCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhiteOnlyOneToOneTo> ls, DeleteOption<WhiteOnlyOneToOneToCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhiteOnlyOneToOneTo et, WhiteOnlyOneToOneToCB inCB, ConditionBean resCB, InsertOption<WhiteOnlyOneToOneToCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhiteOnlyOneToOneTo et, WhiteOnlyOneToOneToCB cb, UpdateOption<WhiteOnlyOneToOneToCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(WhiteOnlyOneToOneToCB cb, DeleteOption<WhiteOnlyOneToOneToCB> op)
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
    protected WhiteOnlyOneToOneTo downcast(Entity et) {
        return helpEntityDowncastInternally(et, WhiteOnlyOneToOneTo.class);
    }

    protected WhiteOnlyOneToOneToCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, WhiteOnlyOneToOneToCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<WhiteOnlyOneToOneTo> downcast(List<? extends Entity> ls) {
        return (List<WhiteOnlyOneToOneTo>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteOnlyOneToOneToCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<WhiteOnlyOneToOneToCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteOnlyOneToOneToCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<WhiteOnlyOneToOneToCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteOnlyOneToOneToCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<WhiteOnlyOneToOneToCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteOnlyOneToOneTo, WhiteOnlyOneToOneToCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<WhiteOnlyOneToOneTo, WhiteOnlyOneToOneToCB>)sp;
    }
}
