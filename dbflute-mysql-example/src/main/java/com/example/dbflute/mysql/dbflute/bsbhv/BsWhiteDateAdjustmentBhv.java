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
import org.seasar.dbflute.outsidesql.executor.*;
import com.example.dbflute.mysql.dbflute.exbhv.*;
import com.example.dbflute.mysql.dbflute.exentity.*;
import com.example.dbflute.mysql.dbflute.bsentity.dbmeta.*;
import com.example.dbflute.mysql.dbflute.cbean.*;

/**
 * The behavior of WHITE_DATE_ADJUSTMENT as TABLE. <br />
 * <pre>
 * [primary key]
 *     DATE_ADJUSTMENT_ID
 *
 * [column]
 *     DATE_ADJUSTMENT_ID, ADJUSTED_DATE, ADJUSTED_DATETIME, ADJUSTED_TIME, ADJUSTED_INTEGER, ADJUSTED_NAMED_STRING_LONG, ADJUSTED_NAMED_TYPED_LONG, ADJUSTED_PINPOINT_STRING_LONG, ADJUSTED_PINPOINT_TYPED_LONG, ADJUSTED_PLAIN_LONG, ADJUSTED_STRING
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
public abstract class BsWhiteDateAdjustmentBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_date_adjustment"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return WhiteDateAdjustmentDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteDateAdjustmentDbm getMyDBMeta() { return WhiteDateAdjustmentDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteDateAdjustment newMyEntity() { return new WhiteDateAdjustment(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteDateAdjustmentCB newMyConditionBean() { return new WhiteDateAdjustmentCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteDateAdjustmentCB cb = new WhiteDateAdjustmentCB();
     * cb.query().setFoo...(value);
     * int count = whiteDateAdjustmentBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteDateAdjustment. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteDateAdjustmentCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteDateAdjustmentCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteDateAdjustmentCB cb) { // called by selectPage(cb)
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
     * Select the entity by the condition-bean.
     * <pre>
     * WhiteDateAdjustmentCB cb = new WhiteDateAdjustmentCB();
     * cb.query().setFoo...(value);
     * WhiteDateAdjustment whiteDateAdjustment = whiteDateAdjustmentBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (whiteDateAdjustment != null) {
     *     ... = whiteDateAdjustment.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteDateAdjustment. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteDateAdjustment selectEntity(WhiteDateAdjustmentCB cb) {
        return doSelectEntity(cb, WhiteDateAdjustment.class);
    }

    protected <ENTITY extends WhiteDateAdjustment> ENTITY doSelectEntity(final WhiteDateAdjustmentCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, WhiteDateAdjustmentCB>() {
            public List<ENTITY> callbackSelectList(WhiteDateAdjustmentCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * WhiteDateAdjustmentCB cb = new WhiteDateAdjustmentCB();
     * cb.query().setFoo...(value);
     * WhiteDateAdjustment whiteDateAdjustment = whiteDateAdjustmentBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteDateAdjustment.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteDateAdjustment. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteDateAdjustment selectEntityWithDeletedCheck(WhiteDateAdjustmentCB cb) {
        return doSelectEntityWithDeletedCheck(cb, WhiteDateAdjustment.class);
    }

    protected <ENTITY extends WhiteDateAdjustment> ENTITY doSelectEntityWithDeletedCheck(final WhiteDateAdjustmentCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteDateAdjustmentCB>() {
            public List<ENTITY> callbackSelectList(WhiteDateAdjustmentCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param dateAdjustmentId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteDateAdjustment selectByPKValue(Long dateAdjustmentId) {
        return doSelectByPKValue(dateAdjustmentId, WhiteDateAdjustment.class);
    }

    protected <ENTITY extends WhiteDateAdjustment> ENTITY doSelectByPKValue(Long dateAdjustmentId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(dateAdjustmentId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param dateAdjustmentId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteDateAdjustment selectByPKValueWithDeletedCheck(Long dateAdjustmentId) {
        return doSelectByPKValueWithDeletedCheck(dateAdjustmentId, WhiteDateAdjustment.class);
    }

    protected <ENTITY extends WhiteDateAdjustment> ENTITY doSelectByPKValueWithDeletedCheck(Long dateAdjustmentId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(dateAdjustmentId), entityType);
    }

    private WhiteDateAdjustmentCB buildPKCB(Long dateAdjustmentId) {
        assertObjectNotNull("dateAdjustmentId", dateAdjustmentId);
        WhiteDateAdjustmentCB cb = newMyConditionBean();
        cb.query().setDateAdjustmentId_Equal(dateAdjustmentId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteDateAdjustmentCB cb = new WhiteDateAdjustmentCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteDateAdjustment&gt; whiteDateAdjustmentList = whiteDateAdjustmentBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (WhiteDateAdjustment whiteDateAdjustment : whiteDateAdjustmentList) {
     *     ... = whiteDateAdjustment.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteDateAdjustment. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteDateAdjustment> selectList(WhiteDateAdjustmentCB cb) {
        return doSelectList(cb, WhiteDateAdjustment.class);
    }

    protected <ENTITY extends WhiteDateAdjustment> ListResultBean<ENTITY> doSelectList(WhiteDateAdjustmentCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, WhiteDateAdjustmentCB>() {
            public List<ENTITY> callbackSelectList(WhiteDateAdjustmentCB cb, Class<ENTITY> tp) { return delegateSelectList(cb, tp); } });
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
     * WhiteDateAdjustmentCB cb = new WhiteDateAdjustmentCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteDateAdjustment&gt; page = whiteDateAdjustmentBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteDateAdjustment whiteDateAdjustment : page) {
     *     ... = whiteDateAdjustment.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteDateAdjustment. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteDateAdjustment> selectPage(WhiteDateAdjustmentCB cb) {
        return doSelectPage(cb, WhiteDateAdjustment.class);
    }

    protected <ENTITY extends WhiteDateAdjustment> PagingResultBean<ENTITY> doSelectPage(WhiteDateAdjustmentCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, WhiteDateAdjustmentCB>() {
            public int callbackSelectCount(WhiteDateAdjustmentCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteDateAdjustmentCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * WhiteDateAdjustmentCB cb = new WhiteDateAdjustmentCB();
     * cb.query().setFoo...(value);
     * whiteDateAdjustmentBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteDateAdjustment&gt;() {
     *     public void handle(WhiteDateAdjustment entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteDateAdjustment. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteDateAdjustment. (NotNull)
     */
    public void selectCursor(WhiteDateAdjustmentCB cb, EntityRowHandler<WhiteDateAdjustment> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, WhiteDateAdjustment.class);
    }

    protected <ENTITY extends WhiteDateAdjustment> void doSelectCursor(WhiteDateAdjustmentCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, WhiteDateAdjustmentCB>() {
            public void callbackSelectCursor(WhiteDateAdjustmentCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(WhiteDateAdjustmentCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteDateAdjustmentBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteDateAdjustmentCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<WhiteDateAdjustmentCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends WhiteDateAdjustmentCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends WhiteDateAdjustmentCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key dateAdjustmentId.
     * @param whiteDateAdjustmentList The list of whiteDateAdjustment. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractDateAdjustmentIdList(List<WhiteDateAdjustment> whiteDateAdjustmentList) {
        return helpExtractListInternally(whiteDateAdjustmentList, new InternalExtractCallback<WhiteDateAdjustment, Long>() {
            public Long getCV(WhiteDateAdjustment et) { return et.getDateAdjustmentId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteDateAdjustment whiteDateAdjustment = new WhiteDateAdjustment();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteDateAdjustment.setFoo...(value);
     * whiteDateAdjustment.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteDateAdjustment.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteDateAdjustment.set...;</span>
     * whiteDateAdjustmentBhv.<span style="color: #FD4747">insert</span>(whiteDateAdjustment);
     * ... = whiteDateAdjustment.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteDateAdjustment The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteDateAdjustment whiteDateAdjustment) {
        doInsert(whiteDateAdjustment, null);
    }

    protected void doInsert(WhiteDateAdjustment whiteDateAdjustment, InsertOption<WhiteDateAdjustmentCB> op) {
        assertObjectNotNull("whiteDateAdjustment", whiteDateAdjustment);
        prepareInsertOption(op);
        delegateInsert(whiteDateAdjustment, op);
    }

    protected void prepareInsertOption(InsertOption<WhiteDateAdjustmentCB> op) {
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
     * WhiteDateAdjustment whiteDateAdjustment = new WhiteDateAdjustment();
     * whiteDateAdjustment.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteDateAdjustment.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteDateAdjustment.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteDateAdjustment.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteDateAdjustment.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteDateAdjustmentBhv.<span style="color: #FD4747">update</span>(whiteDateAdjustment);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteDateAdjustment The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final WhiteDateAdjustment whiteDateAdjustment) {
        doUpdate(whiteDateAdjustment, null);
    }

    protected void doUpdate(WhiteDateAdjustment whiteDateAdjustment, final UpdateOption<WhiteDateAdjustmentCB> op) {
        assertObjectNotNull("whiteDateAdjustment", whiteDateAdjustment);
        prepareUpdateOption(op);
        helpUpdateInternally(whiteDateAdjustment, new InternalUpdateCallback<WhiteDateAdjustment>() {
            public int callbackDelegateUpdate(WhiteDateAdjustment et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhiteDateAdjustmentCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected WhiteDateAdjustmentCB createCBForVaryingUpdate() {
        WhiteDateAdjustmentCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected WhiteDateAdjustmentCB createCBForSpecifiedUpdate() {
        WhiteDateAdjustmentCB cb = newMyConditionBean();
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
     * <p><span style="color: #FD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param whiteDateAdjustment The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteDateAdjustment whiteDateAdjustment) {
        doInesrtOrUpdate(whiteDateAdjustment, null, null);
    }

    protected void doInesrtOrUpdate(WhiteDateAdjustment whiteDateAdjustment, final InsertOption<WhiteDateAdjustmentCB> iop, final UpdateOption<WhiteDateAdjustmentCB> uop) {
        helpInsertOrUpdateInternally(whiteDateAdjustment, new InternalInsertOrUpdateCallback<WhiteDateAdjustment, WhiteDateAdjustmentCB>() {
            public void callbackInsert(WhiteDateAdjustment et) { doInsert(et, iop); }
            public void callbackUpdate(WhiteDateAdjustment et) { doUpdate(et, uop); }
            public WhiteDateAdjustmentCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(WhiteDateAdjustmentCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<WhiteDateAdjustmentCB>();
            uop = uop != null ? uop : new UpdateOption<WhiteDateAdjustmentCB>();
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
     * WhiteDateAdjustment whiteDateAdjustment = new WhiteDateAdjustment();
     * whiteDateAdjustment.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteDateAdjustment.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteDateAdjustmentBhv.<span style="color: #FD4747">delete</span>(whiteDateAdjustment);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteDateAdjustment The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteDateAdjustment whiteDateAdjustment) {
        doDelete(whiteDateAdjustment, null);
    }

    protected void doDelete(WhiteDateAdjustment whiteDateAdjustment, final DeleteOption<WhiteDateAdjustmentCB> op) {
        assertObjectNotNull("whiteDateAdjustment", whiteDateAdjustment);
        prepareDeleteOption(op);
        helpDeleteInternally(whiteDateAdjustment, new InternalDeleteCallback<WhiteDateAdjustment>() {
            public int callbackDelegateDelete(WhiteDateAdjustment et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhiteDateAdjustmentCB> op) {
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
     * <p><span style="color: #FD4747; font-size: 120%">The columns of least common multiple are registered like this:</span></p>
     * <pre>
     * for (... : ...) {
     *     WhiteDateAdjustment whiteDateAdjustment = new WhiteDateAdjustment();
     *     whiteDateAdjustment.setFooName("foo");
     *     if (...) {
     *         whiteDateAdjustment.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteDateAdjustmentList.add(whiteDateAdjustment);
     * }
     * whiteDateAdjustmentBhv.<span style="color: #FD4747">batchInsert</span>(whiteDateAdjustmentList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteDateAdjustmentList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteDateAdjustment> whiteDateAdjustmentList) {
        InsertOption<WhiteDateAdjustmentCB> op = createInsertUpdateOption();
        return doBatchInsert(whiteDateAdjustmentList, op);
    }

    protected int[] doBatchInsert(List<WhiteDateAdjustment> whiteDateAdjustmentList, InsertOption<WhiteDateAdjustmentCB> op) {
        assertObjectNotNull("whiteDateAdjustmentList", whiteDateAdjustmentList);
        prepareBatchInsertOption(whiteDateAdjustmentList, op);
        return delegateBatchInsert(whiteDateAdjustmentList, op);
    }

    protected void prepareBatchInsertOption(List<WhiteDateAdjustment> whiteDateAdjustmentList, InsertOption<WhiteDateAdjustmentCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(whiteDateAdjustmentList);
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
     * <span style="color: #FD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhiteDateAdjustment whiteDateAdjustment = new WhiteDateAdjustment();
     *     whiteDateAdjustment.setFooName("foo");
     *     if (...) {
     *         whiteDateAdjustment.setFooPrice(123);
     *     } else {
     *         whiteDateAdjustment.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteDateAdjustment.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteDateAdjustmentList.add(whiteDateAdjustment);
     * }
     * whiteDateAdjustmentBhv.<span style="color: #FD4747">batchUpdate</span>(whiteDateAdjustmentList);
     * </pre>
     * @param whiteDateAdjustmentList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteDateAdjustment> whiteDateAdjustmentList) {
        UpdateOption<WhiteDateAdjustmentCB> op = createPlainUpdateOption();
        return doBatchUpdate(whiteDateAdjustmentList, op);
    }

    protected int[] doBatchUpdate(List<WhiteDateAdjustment> whiteDateAdjustmentList, UpdateOption<WhiteDateAdjustmentCB> op) {
        assertObjectNotNull("whiteDateAdjustmentList", whiteDateAdjustmentList);
        prepareBatchUpdateOption(whiteDateAdjustmentList, op);
        return delegateBatchUpdate(whiteDateAdjustmentList, op);
    }

    protected void prepareBatchUpdateOption(List<WhiteDateAdjustment> whiteDateAdjustmentList, UpdateOption<WhiteDateAdjustmentCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(whiteDateAdjustmentList);
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
     * whiteDateAdjustmentBhv.<span style="color: #FD4747">batchUpdate</span>(whiteDateAdjustmentList, new SpecifyQuery<WhiteDateAdjustmentCB>() {
     *     public void specify(WhiteDateAdjustmentCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteDateAdjustmentBhv.<span style="color: #FD4747">batchUpdate</span>(whiteDateAdjustmentList, new SpecifyQuery<WhiteDateAdjustmentCB>() {
     *     public void specify(WhiteDateAdjustmentCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteDateAdjustmentList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteDateAdjustment> whiteDateAdjustmentList, SpecifyQuery<WhiteDateAdjustmentCB> updateColumnSpec) {
        return doBatchUpdate(whiteDateAdjustmentList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteDateAdjustmentList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteDateAdjustment> whiteDateAdjustmentList) {
        return doBatchDelete(whiteDateAdjustmentList, null);
    }

    protected int[] doBatchDelete(List<WhiteDateAdjustment> whiteDateAdjustmentList, DeleteOption<WhiteDateAdjustmentCB> op) {
        assertObjectNotNull("whiteDateAdjustmentList", whiteDateAdjustmentList);
        prepareDeleteOption(op);
        return delegateBatchDelete(whiteDateAdjustmentList, op);
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
     * whiteDateAdjustmentBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteDateAdjustment, WhiteDateAdjustmentCB&gt;() {
     *     public ConditionBean setup(whiteDateAdjustment entity, WhiteDateAdjustmentCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteDateAdjustment, WhiteDateAdjustmentCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteDateAdjustment, WhiteDateAdjustmentCB> sp, InsertOption<WhiteDateAdjustmentCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        WhiteDateAdjustment e = new WhiteDateAdjustment();
        WhiteDateAdjustmentCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected WhiteDateAdjustmentCB createCBForQueryInsert() {
        WhiteDateAdjustmentCB cb = newMyConditionBean();
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
     * WhiteDateAdjustment whiteDateAdjustment = new WhiteDateAdjustment();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteDateAdjustment.setPK...(value);</span>
     * whiteDateAdjustment.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteDateAdjustment.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteDateAdjustment.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteDateAdjustment.setVersionNo(value);</span>
     * WhiteDateAdjustmentCB cb = new WhiteDateAdjustmentCB();
     * cb.query().setFoo...(value);
     * whiteDateAdjustmentBhv.<span style="color: #FD4747">queryUpdate</span>(whiteDateAdjustment, cb);
     * </pre>
     * @param whiteDateAdjustment The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteDateAdjustment. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteDateAdjustment whiteDateAdjustment, WhiteDateAdjustmentCB cb) {
        return doQueryUpdate(whiteDateAdjustment, cb, null);
    }

    protected int doQueryUpdate(WhiteDateAdjustment whiteDateAdjustment, WhiteDateAdjustmentCB cb, UpdateOption<WhiteDateAdjustmentCB> op) {
        assertObjectNotNull("whiteDateAdjustment", whiteDateAdjustment); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(whiteDateAdjustment, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (WhiteDateAdjustmentCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (WhiteDateAdjustmentCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteDateAdjustmentCB cb = new WhiteDateAdjustmentCB();
     * cb.query().setFoo...(value);
     * whiteDateAdjustmentBhv.<span style="color: #FD4747">queryDelete</span>(whiteDateAdjustment, cb);
     * </pre>
     * @param cb The condition-bean of WhiteDateAdjustment. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteDateAdjustmentCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteDateAdjustmentCB cb, DeleteOption<WhiteDateAdjustmentCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((WhiteDateAdjustmentCB)cb); }
        else { return varyingQueryDelete((WhiteDateAdjustmentCB)cb, downcast(op)); }
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
     * WhiteDateAdjustment whiteDateAdjustment = new WhiteDateAdjustment();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteDateAdjustment.setFoo...(value);
     * whiteDateAdjustment.setBar...(value);
     * InsertOption<WhiteDateAdjustmentCB> option = new InsertOption<WhiteDateAdjustmentCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteDateAdjustmentBhv.<span style="color: #FD4747">varyingInsert</span>(whiteDateAdjustment, option);
     * ... = whiteDateAdjustment.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteDateAdjustment The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteDateAdjustment whiteDateAdjustment, InsertOption<WhiteDateAdjustmentCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteDateAdjustment, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteDateAdjustment whiteDateAdjustment = new WhiteDateAdjustment();
     * whiteDateAdjustment.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteDateAdjustment.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteDateAdjustment.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteDateAdjustmentCB&gt; option = new UpdateOption&lt;WhiteDateAdjustmentCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteDateAdjustmentCB&gt;() {
     *         public void specify(WhiteDateAdjustmentCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteDateAdjustmentBhv.<span style="color: #FD4747">varyingUpdate</span>(whiteDateAdjustment, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteDateAdjustment The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteDateAdjustment whiteDateAdjustment, UpdateOption<WhiteDateAdjustmentCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteDateAdjustment, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteDateAdjustment The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteDateAdjustment whiteDateAdjustment, InsertOption<WhiteDateAdjustmentCB> insertOption, UpdateOption<WhiteDateAdjustmentCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(whiteDateAdjustment, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteDateAdjustment The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteDateAdjustment whiteDateAdjustment, DeleteOption<WhiteDateAdjustmentCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteDateAdjustment, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteDateAdjustmentList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteDateAdjustment> whiteDateAdjustmentList, InsertOption<WhiteDateAdjustmentCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteDateAdjustmentList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteDateAdjustmentList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteDateAdjustment> whiteDateAdjustmentList, UpdateOption<WhiteDateAdjustmentCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteDateAdjustmentList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteDateAdjustmentList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteDateAdjustment> whiteDateAdjustmentList, DeleteOption<WhiteDateAdjustmentCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteDateAdjustmentList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteDateAdjustment, WhiteDateAdjustmentCB> setupper, InsertOption<WhiteDateAdjustmentCB> option) {
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
     * WhiteDateAdjustment whiteDateAdjustment = new WhiteDateAdjustment();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteDateAdjustment.setPK...(value);</span>
     * whiteDateAdjustment.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteDateAdjustment.setVersionNo(value);</span>
     * WhiteDateAdjustmentCB cb = new WhiteDateAdjustmentCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteDateAdjustmentCB&gt; option = new UpdateOption&lt;WhiteDateAdjustmentCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteDateAdjustmentCB&gt;() {
     *     public void specify(WhiteDateAdjustmentCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteDateAdjustmentBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(whiteDateAdjustment, cb, option);
     * </pre>
     * @param whiteDateAdjustment The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteDateAdjustment. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteDateAdjustment whiteDateAdjustment, WhiteDateAdjustmentCB cb, UpdateOption<WhiteDateAdjustmentCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteDateAdjustment, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteDateAdjustment. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteDateAdjustmentCB cb, DeleteOption<WhiteDateAdjustmentCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteDateAdjustmentBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhiteDateAdjustmentCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhiteDateAdjustmentCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhiteDateAdjustment> void delegateSelectCursor(WhiteDateAdjustmentCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends WhiteDateAdjustment> List<ENTITY> delegateSelectList(WhiteDateAdjustmentCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhiteDateAdjustment et, InsertOption<WhiteDateAdjustmentCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(WhiteDateAdjustment et, UpdateOption<WhiteDateAdjustmentCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(WhiteDateAdjustment et, UpdateOption<WhiteDateAdjustmentCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(WhiteDateAdjustment et, DeleteOption<WhiteDateAdjustmentCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(WhiteDateAdjustment et, DeleteOption<WhiteDateAdjustmentCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<WhiteDateAdjustment> ls, InsertOption<WhiteDateAdjustmentCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhiteDateAdjustment> ls, UpdateOption<WhiteDateAdjustmentCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhiteDateAdjustment> ls, UpdateOption<WhiteDateAdjustmentCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhiteDateAdjustment> ls, DeleteOption<WhiteDateAdjustmentCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhiteDateAdjustment> ls, DeleteOption<WhiteDateAdjustmentCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhiteDateAdjustment et, WhiteDateAdjustmentCB inCB, ConditionBean resCB, InsertOption<WhiteDateAdjustmentCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhiteDateAdjustment et, WhiteDateAdjustmentCB cb, UpdateOption<WhiteDateAdjustmentCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(WhiteDateAdjustmentCB cb, DeleteOption<WhiteDateAdjustmentCB> op)
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
    protected WhiteDateAdjustment downcast(Entity et) {
        return helpEntityDowncastInternally(et, WhiteDateAdjustment.class);
    }

    protected WhiteDateAdjustmentCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, WhiteDateAdjustmentCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<WhiteDateAdjustment> downcast(List<? extends Entity> ls) {
        return (List<WhiteDateAdjustment>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteDateAdjustmentCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<WhiteDateAdjustmentCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteDateAdjustmentCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<WhiteDateAdjustmentCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteDateAdjustmentCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<WhiteDateAdjustmentCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteDateAdjustment, WhiteDateAdjustmentCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<WhiteDateAdjustment, WhiteDateAdjustmentCB>)sp;
    }
}