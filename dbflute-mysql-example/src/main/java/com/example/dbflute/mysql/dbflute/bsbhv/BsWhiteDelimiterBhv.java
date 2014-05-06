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
 * The behavior of WHITE_DELIMITER as TABLE. <br />
 * <pre>
 * [primary key]
 *     DELIMITER_ID
 *
 * [column]
 *     DELIMITER_ID, NUMBER_NULLABLE, STRING_CONVERTED, STRING_NON_CONVERTED, DATE_DEFAULT
 *
 * [sequence]
 *     
 *
 * [identity]
 *     DELIMITER_ID
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
public abstract class BsWhiteDelimiterBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_delimiter"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return WhiteDelimiterDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteDelimiterDbm getMyDBMeta() { return WhiteDelimiterDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteDelimiter newMyEntity() { return new WhiteDelimiter(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteDelimiterCB newMyConditionBean() { return new WhiteDelimiterCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteDelimiterCB cb = new WhiteDelimiterCB();
     * cb.query().setFoo...(value);
     * int count = whiteDelimiterBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteDelimiter. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteDelimiterCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteDelimiterCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteDelimiterCB cb) { // called by selectPage(cb)
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
     * WhiteDelimiterCB cb = new WhiteDelimiterCB();
     * cb.query().setFoo...(value);
     * WhiteDelimiter whiteDelimiter = whiteDelimiterBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (whiteDelimiter != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = whiteDelimiter.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteDelimiter. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteDelimiter selectEntity(WhiteDelimiterCB cb) {
        return doSelectEntity(cb, WhiteDelimiter.class);
    }

    protected <ENTITY extends WhiteDelimiter> ENTITY doSelectEntity(WhiteDelimiterCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, WhiteDelimiterCB>() {
            public List<ENTITY> callbackSelectList(WhiteDelimiterCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * WhiteDelimiterCB cb = new WhiteDelimiterCB();
     * cb.query().setFoo...(value);
     * WhiteDelimiter whiteDelimiter = whiteDelimiterBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteDelimiter.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteDelimiter. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (point is not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteDelimiter selectEntityWithDeletedCheck(WhiteDelimiterCB cb) {
        return doSelectEntityWithDeletedCheck(cb, WhiteDelimiter.class);
    }

    protected <ENTITY extends WhiteDelimiter> ENTITY doSelectEntityWithDeletedCheck(WhiteDelimiterCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteDelimiterCB>() {
            public List<ENTITY> callbackSelectList(WhiteDelimiterCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param delimiterId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteDelimiter selectByPKValue(Long delimiterId) {
        return doSelectByPKValue(delimiterId, WhiteDelimiter.class);
    }

    protected <ENTITY extends WhiteDelimiter> ENTITY doSelectByPKValue(Long delimiterId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(delimiterId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param delimiterId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteDelimiter selectByPKValueWithDeletedCheck(Long delimiterId) {
        return doSelectByPKValueWithDeletedCheck(delimiterId, WhiteDelimiter.class);
    }

    protected <ENTITY extends WhiteDelimiter> ENTITY doSelectByPKValueWithDeletedCheck(Long delimiterId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(delimiterId), entityType);
    }

    private WhiteDelimiterCB buildPKCB(Long delimiterId) {
        assertObjectNotNull("delimiterId", delimiterId);
        WhiteDelimiterCB cb = newMyConditionBean();
        cb.query().setDelimiterId_Equal(delimiterId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteDelimiterCB cb = new WhiteDelimiterCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteDelimiter&gt; whiteDelimiterList = whiteDelimiterBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteDelimiter whiteDelimiter : whiteDelimiterList) {
     *     ... = whiteDelimiter.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteDelimiter. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteDelimiter> selectList(WhiteDelimiterCB cb) {
        return doSelectList(cb, WhiteDelimiter.class);
    }

    protected <ENTITY extends WhiteDelimiter> ListResultBean<ENTITY> doSelectList(WhiteDelimiterCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, WhiteDelimiterCB>() {
            public List<ENTITY> callbackSelectList(WhiteDelimiterCB lcb, Class<ENTITY> ltp) { return delegateSelectList(lcb, ltp); } });
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
     * WhiteDelimiterCB cb = new WhiteDelimiterCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteDelimiter&gt; page = whiteDelimiterBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteDelimiter whiteDelimiter : page) {
     *     ... = whiteDelimiter.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteDelimiter. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteDelimiter> selectPage(WhiteDelimiterCB cb) {
        return doSelectPage(cb, WhiteDelimiter.class);
    }

    protected <ENTITY extends WhiteDelimiter> PagingResultBean<ENTITY> doSelectPage(WhiteDelimiterCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, WhiteDelimiterCB>() {
            public int callbackSelectCount(WhiteDelimiterCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteDelimiterCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * WhiteDelimiterCB cb = new WhiteDelimiterCB();
     * cb.query().setFoo...(value);
     * whiteDelimiterBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteDelimiter&gt;() {
     *     public void handle(WhiteDelimiter entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteDelimiter. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteDelimiter. (NotNull)
     */
    public void selectCursor(WhiteDelimiterCB cb, EntityRowHandler<WhiteDelimiter> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, WhiteDelimiter.class);
    }

    protected <ENTITY extends WhiteDelimiter> void doSelectCursor(WhiteDelimiterCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, WhiteDelimiterCB>() {
            public void callbackSelectCursor(WhiteDelimiterCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(WhiteDelimiterCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteDelimiterBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteDelimiterCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<WhiteDelimiterCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends WhiteDelimiterCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends WhiteDelimiterCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
     * Extract the value list of (single) primary key delimiterId.
     * @param whiteDelimiterList The list of whiteDelimiter. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractDelimiterIdList(List<WhiteDelimiter> whiteDelimiterList) {
        return helpExtractListInternally(whiteDelimiterList, new InternalExtractCallback<WhiteDelimiter, Long>() {
            public Long getCV(WhiteDelimiter et) { return et.getDelimiterId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteDelimiter whiteDelimiter = new WhiteDelimiter();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteDelimiter.setFoo...(value);
     * whiteDelimiter.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteDelimiter.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteDelimiter.set...;</span>
     * whiteDelimiterBhv.<span style="color: #DD4747">insert</span>(whiteDelimiter);
     * ... = whiteDelimiter.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteDelimiter The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteDelimiter whiteDelimiter) {
        doInsert(whiteDelimiter, null);
    }

    protected void doInsert(WhiteDelimiter whiteDelimiter, InsertOption<WhiteDelimiterCB> op) {
        assertObjectNotNull("whiteDelimiter", whiteDelimiter);
        prepareInsertOption(op);
        delegateInsert(whiteDelimiter, op);
    }

    protected void prepareInsertOption(InsertOption<WhiteDelimiterCB> op) {
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
     * WhiteDelimiter whiteDelimiter = new WhiteDelimiter();
     * whiteDelimiter.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteDelimiter.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteDelimiter.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteDelimiter.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteDelimiter.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteDelimiterBhv.<span style="color: #DD4747">update</span>(whiteDelimiter);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteDelimiter The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final WhiteDelimiter whiteDelimiter) {
        doUpdate(whiteDelimiter, null);
    }

    protected void doUpdate(WhiteDelimiter whiteDelimiter, final UpdateOption<WhiteDelimiterCB> op) {
        assertObjectNotNull("whiteDelimiter", whiteDelimiter);
        prepareUpdateOption(op);
        helpUpdateInternally(whiteDelimiter, new InternalUpdateCallback<WhiteDelimiter>() {
            public int callbackDelegateUpdate(WhiteDelimiter et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhiteDelimiterCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected WhiteDelimiterCB createCBForVaryingUpdate() {
        WhiteDelimiterCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected WhiteDelimiterCB createCBForSpecifiedUpdate() {
        WhiteDelimiterCB cb = newMyConditionBean();
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
     * @param whiteDelimiter The entity of insert or update target. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteDelimiter whiteDelimiter) {
        doInesrtOrUpdate(whiteDelimiter, null, null);
    }

    protected void doInesrtOrUpdate(WhiteDelimiter whiteDelimiter, final InsertOption<WhiteDelimiterCB> iop, final UpdateOption<WhiteDelimiterCB> uop) {
        helpInsertOrUpdateInternally(whiteDelimiter, new InternalInsertOrUpdateCallback<WhiteDelimiter, WhiteDelimiterCB>() {
            public void callbackInsert(WhiteDelimiter et) { doInsert(et, iop); }
            public void callbackUpdate(WhiteDelimiter et) { doUpdate(et, uop); }
            public WhiteDelimiterCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(WhiteDelimiterCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<WhiteDelimiterCB>();
            uop = uop != null ? uop : new UpdateOption<WhiteDelimiterCB>();
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
     * WhiteDelimiter whiteDelimiter = new WhiteDelimiter();
     * whiteDelimiter.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteDelimiter.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteDelimiterBhv.<span style="color: #DD4747">delete</span>(whiteDelimiter);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteDelimiter The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteDelimiter whiteDelimiter) {
        doDelete(whiteDelimiter, null);
    }

    protected void doDelete(WhiteDelimiter whiteDelimiter, final DeleteOption<WhiteDelimiterCB> op) {
        assertObjectNotNull("whiteDelimiter", whiteDelimiter);
        prepareDeleteOption(op);
        helpDeleteInternally(whiteDelimiter, new InternalDeleteCallback<WhiteDelimiter>() {
            public int callbackDelegateDelete(WhiteDelimiter et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhiteDelimiterCB> op) {
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
     *     WhiteDelimiter whiteDelimiter = new WhiteDelimiter();
     *     whiteDelimiter.setFooName("foo");
     *     if (...) {
     *         whiteDelimiter.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteDelimiterList.add(whiteDelimiter);
     * }
     * whiteDelimiterBhv.<span style="color: #DD4747">batchInsert</span>(whiteDelimiterList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteDelimiterList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteDelimiter> whiteDelimiterList) {
        InsertOption<WhiteDelimiterCB> op = createInsertUpdateOption();
        return doBatchInsert(whiteDelimiterList, op);
    }

    protected int[] doBatchInsert(List<WhiteDelimiter> whiteDelimiterList, InsertOption<WhiteDelimiterCB> op) {
        assertObjectNotNull("whiteDelimiterList", whiteDelimiterList);
        prepareBatchInsertOption(whiteDelimiterList, op);
        return delegateBatchInsert(whiteDelimiterList, op);
    }

    protected void prepareBatchInsertOption(List<WhiteDelimiter> whiteDelimiterList, InsertOption<WhiteDelimiterCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(whiteDelimiterList);
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
     *     WhiteDelimiter whiteDelimiter = new WhiteDelimiter();
     *     whiteDelimiter.setFooName("foo");
     *     if (...) {
     *         whiteDelimiter.setFooPrice(123);
     *     } else {
     *         whiteDelimiter.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteDelimiter.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteDelimiterList.add(whiteDelimiter);
     * }
     * whiteDelimiterBhv.<span style="color: #DD4747">batchUpdate</span>(whiteDelimiterList);
     * </pre>
     * @param whiteDelimiterList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteDelimiter> whiteDelimiterList) {
        UpdateOption<WhiteDelimiterCB> op = createPlainUpdateOption();
        return doBatchUpdate(whiteDelimiterList, op);
    }

    protected int[] doBatchUpdate(List<WhiteDelimiter> whiteDelimiterList, UpdateOption<WhiteDelimiterCB> op) {
        assertObjectNotNull("whiteDelimiterList", whiteDelimiterList);
        prepareBatchUpdateOption(whiteDelimiterList, op);
        return delegateBatchUpdate(whiteDelimiterList, op);
    }

    protected void prepareBatchUpdateOption(List<WhiteDelimiter> whiteDelimiterList, UpdateOption<WhiteDelimiterCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(whiteDelimiterList);
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
     * whiteDelimiterBhv.<span style="color: #DD4747">batchUpdate</span>(whiteDelimiterList, new SpecifyQuery<WhiteDelimiterCB>() {
     *     public void specify(WhiteDelimiterCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteDelimiterBhv.<span style="color: #DD4747">batchUpdate</span>(whiteDelimiterList, new SpecifyQuery<WhiteDelimiterCB>() {
     *     public void specify(WhiteDelimiterCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteDelimiterList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteDelimiter> whiteDelimiterList, SpecifyQuery<WhiteDelimiterCB> updateColumnSpec) {
        return doBatchUpdate(whiteDelimiterList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteDelimiterList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteDelimiter> whiteDelimiterList) {
        return doBatchDelete(whiteDelimiterList, null);
    }

    protected int[] doBatchDelete(List<WhiteDelimiter> whiteDelimiterList, DeleteOption<WhiteDelimiterCB> op) {
        assertObjectNotNull("whiteDelimiterList", whiteDelimiterList);
        prepareDeleteOption(op);
        return delegateBatchDelete(whiteDelimiterList, op);
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
     * whiteDelimiterBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteDelimiter, WhiteDelimiterCB&gt;() {
     *     public ConditionBean setup(whiteDelimiter entity, WhiteDelimiterCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteDelimiter, WhiteDelimiterCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteDelimiter, WhiteDelimiterCB> sp, InsertOption<WhiteDelimiterCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        WhiteDelimiter e = new WhiteDelimiter();
        WhiteDelimiterCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected WhiteDelimiterCB createCBForQueryInsert() {
        WhiteDelimiterCB cb = newMyConditionBean();
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
     * WhiteDelimiter whiteDelimiter = new WhiteDelimiter();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteDelimiter.setPK...(value);</span>
     * whiteDelimiter.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteDelimiter.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteDelimiter.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteDelimiter.setVersionNo(value);</span>
     * WhiteDelimiterCB cb = new WhiteDelimiterCB();
     * cb.query().setFoo...(value);
     * whiteDelimiterBhv.<span style="color: #DD4747">queryUpdate</span>(whiteDelimiter, cb);
     * </pre>
     * @param whiteDelimiter The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteDelimiter. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteDelimiter whiteDelimiter, WhiteDelimiterCB cb) {
        return doQueryUpdate(whiteDelimiter, cb, null);
    }

    protected int doQueryUpdate(WhiteDelimiter whiteDelimiter, WhiteDelimiterCB cb, UpdateOption<WhiteDelimiterCB> op) {
        assertObjectNotNull("whiteDelimiter", whiteDelimiter); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(whiteDelimiter, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (WhiteDelimiterCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (WhiteDelimiterCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteDelimiterCB cb = new WhiteDelimiterCB();
     * cb.query().setFoo...(value);
     * whiteDelimiterBhv.<span style="color: #DD4747">queryDelete</span>(whiteDelimiter, cb);
     * </pre>
     * @param cb The condition-bean of WhiteDelimiter. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteDelimiterCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteDelimiterCB cb, DeleteOption<WhiteDelimiterCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((WhiteDelimiterCB)cb); }
        else { return varyingQueryDelete((WhiteDelimiterCB)cb, downcast(op)); }
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
     * WhiteDelimiter whiteDelimiter = new WhiteDelimiter();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteDelimiter.setFoo...(value);
     * whiteDelimiter.setBar...(value);
     * InsertOption<WhiteDelimiterCB> option = new InsertOption<WhiteDelimiterCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteDelimiterBhv.<span style="color: #DD4747">varyingInsert</span>(whiteDelimiter, option);
     * ... = whiteDelimiter.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteDelimiter The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteDelimiter whiteDelimiter, InsertOption<WhiteDelimiterCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteDelimiter, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteDelimiter whiteDelimiter = new WhiteDelimiter();
     * whiteDelimiter.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteDelimiter.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteDelimiter.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteDelimiterCB&gt; option = new UpdateOption&lt;WhiteDelimiterCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteDelimiterCB&gt;() {
     *         public void specify(WhiteDelimiterCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteDelimiterBhv.<span style="color: #DD4747">varyingUpdate</span>(whiteDelimiter, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteDelimiter The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteDelimiter whiteDelimiter, UpdateOption<WhiteDelimiterCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteDelimiter, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteDelimiter The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteDelimiter whiteDelimiter, InsertOption<WhiteDelimiterCB> insertOption, UpdateOption<WhiteDelimiterCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(whiteDelimiter, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteDelimiter The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteDelimiter whiteDelimiter, DeleteOption<WhiteDelimiterCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteDelimiter, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteDelimiterList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteDelimiter> whiteDelimiterList, InsertOption<WhiteDelimiterCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteDelimiterList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteDelimiterList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteDelimiter> whiteDelimiterList, UpdateOption<WhiteDelimiterCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteDelimiterList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteDelimiterList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteDelimiter> whiteDelimiterList, DeleteOption<WhiteDelimiterCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteDelimiterList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteDelimiter, WhiteDelimiterCB> setupper, InsertOption<WhiteDelimiterCB> option) {
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
     * WhiteDelimiter whiteDelimiter = new WhiteDelimiter();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteDelimiter.setPK...(value);</span>
     * whiteDelimiter.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteDelimiter.setVersionNo(value);</span>
     * WhiteDelimiterCB cb = new WhiteDelimiterCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteDelimiterCB&gt; option = new UpdateOption&lt;WhiteDelimiterCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteDelimiterCB&gt;() {
     *     public void specify(WhiteDelimiterCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteDelimiterBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteDelimiter, cb, option);
     * </pre>
     * @param whiteDelimiter The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteDelimiter. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteDelimiter whiteDelimiter, WhiteDelimiterCB cb, UpdateOption<WhiteDelimiterCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteDelimiter, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteDelimiter. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteDelimiterCB cb, DeleteOption<WhiteDelimiterCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteDelimiterBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhiteDelimiterCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhiteDelimiterCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhiteDelimiter> void delegateSelectCursor(WhiteDelimiterCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends WhiteDelimiter> List<ENTITY> delegateSelectList(WhiteDelimiterCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhiteDelimiter et, InsertOption<WhiteDelimiterCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(WhiteDelimiter et, UpdateOption<WhiteDelimiterCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(WhiteDelimiter et, UpdateOption<WhiteDelimiterCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(WhiteDelimiter et, DeleteOption<WhiteDelimiterCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(WhiteDelimiter et, DeleteOption<WhiteDelimiterCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<WhiteDelimiter> ls, InsertOption<WhiteDelimiterCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhiteDelimiter> ls, UpdateOption<WhiteDelimiterCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhiteDelimiter> ls, UpdateOption<WhiteDelimiterCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhiteDelimiter> ls, DeleteOption<WhiteDelimiterCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhiteDelimiter> ls, DeleteOption<WhiteDelimiterCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhiteDelimiter et, WhiteDelimiterCB inCB, ConditionBean resCB, InsertOption<WhiteDelimiterCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhiteDelimiter et, WhiteDelimiterCB cb, UpdateOption<WhiteDelimiterCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(WhiteDelimiterCB cb, DeleteOption<WhiteDelimiterCB> op)
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
    protected WhiteDelimiter downcast(Entity et) {
        return helpEntityDowncastInternally(et, WhiteDelimiter.class);
    }

    protected WhiteDelimiterCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, WhiteDelimiterCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<WhiteDelimiter> downcast(List<? extends Entity> ls) {
        return (List<WhiteDelimiter>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteDelimiterCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<WhiteDelimiterCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteDelimiterCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<WhiteDelimiterCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteDelimiterCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<WhiteDelimiterCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteDelimiter, WhiteDelimiterCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<WhiteDelimiter, WhiteDelimiterCB>)sp;
    }
}
