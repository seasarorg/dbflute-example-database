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
 * The behavior of WHITE_COLUMN_EXCEPT as TABLE. <br />
 * <pre>
 * [primary key]
 *     EXCEPT_COLUMN_ID
 *
 * [column]
 *     EXCEPT_COLUMN_ID, COLUMN_EXCEPT_TEST
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
public abstract class BsWhiteColumnExceptBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_column_except"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return WhiteColumnExceptDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteColumnExceptDbm getMyDBMeta() { return WhiteColumnExceptDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteColumnExcept newMyEntity() { return new WhiteColumnExcept(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteColumnExceptCB newMyConditionBean() { return new WhiteColumnExceptCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteColumnExceptCB cb = new WhiteColumnExceptCB();
     * cb.query().setFoo...(value);
     * int count = whiteColumnExceptBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteColumnExcept. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteColumnExceptCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteColumnExceptCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteColumnExceptCB cb) { // called by selectPage(cb)
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
     * WhiteColumnExceptCB cb = new WhiteColumnExceptCB();
     * cb.query().setFoo...(value);
     * WhiteColumnExcept whiteColumnExcept = whiteColumnExceptBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (whiteColumnExcept != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = whiteColumnExcept.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteColumnExcept. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteColumnExcept selectEntity(WhiteColumnExceptCB cb) {
        return doSelectEntity(cb, WhiteColumnExcept.class);
    }

    protected <ENTITY extends WhiteColumnExcept> ENTITY doSelectEntity(WhiteColumnExceptCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, WhiteColumnExceptCB>() {
            public List<ENTITY> callbackSelectList(WhiteColumnExceptCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    protected <ENTITY extends WhiteColumnExcept> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteColumnExceptCB cb, Class<ENTITY> tp) {
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
     * WhiteColumnExceptCB cb = new WhiteColumnExceptCB();
     * cb.query().setFoo...(value);
     * WhiteColumnExcept whiteColumnExcept = whiteColumnExceptBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteColumnExcept.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteColumnExcept. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (point is not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteColumnExcept selectEntityWithDeletedCheck(WhiteColumnExceptCB cb) {
        return doSelectEntityWithDeletedCheck(cb, WhiteColumnExcept.class);
    }

    protected <ENTITY extends WhiteColumnExcept> ENTITY doSelectEntityWithDeletedCheck(WhiteColumnExceptCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteColumnExceptCB>() {
            public List<ENTITY> callbackSelectList(WhiteColumnExceptCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param exceptColumnId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteColumnExcept selectByPKValue(Long exceptColumnId) {
        return doSelectByPKValue(exceptColumnId, WhiteColumnExcept.class);
    }

    protected <ENTITY extends WhiteColumnExcept> ENTITY doSelectByPKValue(Long exceptColumnId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(exceptColumnId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param exceptColumnId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteColumnExcept selectByPKValueWithDeletedCheck(Long exceptColumnId) {
        return doSelectByPKValueWithDeletedCheck(exceptColumnId, WhiteColumnExcept.class);
    }

    protected <ENTITY extends WhiteColumnExcept> ENTITY doSelectByPKValueWithDeletedCheck(Long exceptColumnId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(exceptColumnId), entityType);
    }

    private WhiteColumnExceptCB buildPKCB(Long exceptColumnId) {
        assertObjectNotNull("exceptColumnId", exceptColumnId);
        WhiteColumnExceptCB cb = newMyConditionBean();
        cb.query().setExceptColumnId_Equal(exceptColumnId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteColumnExceptCB cb = new WhiteColumnExceptCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteColumnExcept&gt; whiteColumnExceptList = whiteColumnExceptBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteColumnExcept whiteColumnExcept : whiteColumnExceptList) {
     *     ... = whiteColumnExcept.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteColumnExcept. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteColumnExcept> selectList(WhiteColumnExceptCB cb) {
        return doSelectList(cb, WhiteColumnExcept.class);
    }

    protected <ENTITY extends WhiteColumnExcept> ListResultBean<ENTITY> doSelectList(WhiteColumnExceptCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, WhiteColumnExceptCB>() {
            public List<ENTITY> callbackSelectList(WhiteColumnExceptCB lcb, Class<ENTITY> ltp) { return delegateSelectList(lcb, ltp); } });
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
     * WhiteColumnExceptCB cb = new WhiteColumnExceptCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteColumnExcept&gt; page = whiteColumnExceptBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteColumnExcept whiteColumnExcept : page) {
     *     ... = whiteColumnExcept.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteColumnExcept. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteColumnExcept> selectPage(WhiteColumnExceptCB cb) {
        return doSelectPage(cb, WhiteColumnExcept.class);
    }

    protected <ENTITY extends WhiteColumnExcept> PagingResultBean<ENTITY> doSelectPage(WhiteColumnExceptCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, WhiteColumnExceptCB>() {
            public int callbackSelectCount(WhiteColumnExceptCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteColumnExceptCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * WhiteColumnExceptCB cb = new WhiteColumnExceptCB();
     * cb.query().setFoo...(value);
     * whiteColumnExceptBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteColumnExcept&gt;() {
     *     public void handle(WhiteColumnExcept entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteColumnExcept. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteColumnExcept. (NotNull)
     */
    public void selectCursor(WhiteColumnExceptCB cb, EntityRowHandler<WhiteColumnExcept> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, WhiteColumnExcept.class);
    }

    protected <ENTITY extends WhiteColumnExcept> void doSelectCursor(WhiteColumnExceptCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, WhiteColumnExceptCB>() {
            public void callbackSelectCursor(WhiteColumnExceptCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(WhiteColumnExceptCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteColumnExceptBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteColumnExceptCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<WhiteColumnExceptCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends WhiteColumnExceptCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends WhiteColumnExceptCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
     * Extract the value list of (single) primary key exceptColumnId.
     * @param whiteColumnExceptList The list of whiteColumnExcept. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractExceptColumnIdList(List<WhiteColumnExcept> whiteColumnExceptList) {
        return helpExtractListInternally(whiteColumnExceptList, new InternalExtractCallback<WhiteColumnExcept, Long>() {
            public Long getCV(WhiteColumnExcept et) { return et.getExceptColumnId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteColumnExcept whiteColumnExcept = new WhiteColumnExcept();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteColumnExcept.setFoo...(value);
     * whiteColumnExcept.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteColumnExcept.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteColumnExcept.set...;</span>
     * whiteColumnExceptBhv.<span style="color: #DD4747">insert</span>(whiteColumnExcept);
     * ... = whiteColumnExcept.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteColumnExcept The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteColumnExcept whiteColumnExcept) {
        doInsert(whiteColumnExcept, null);
    }

    protected void doInsert(WhiteColumnExcept whiteColumnExcept, InsertOption<WhiteColumnExceptCB> op) {
        assertObjectNotNull("whiteColumnExcept", whiteColumnExcept);
        prepareInsertOption(op);
        delegateInsert(whiteColumnExcept, op);
    }

    protected void prepareInsertOption(InsertOption<WhiteColumnExceptCB> op) {
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
     * WhiteColumnExcept whiteColumnExcept = new WhiteColumnExcept();
     * whiteColumnExcept.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteColumnExcept.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteColumnExcept.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteColumnExcept.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteColumnExcept.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteColumnExceptBhv.<span style="color: #DD4747">update</span>(whiteColumnExcept);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteColumnExcept The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final WhiteColumnExcept whiteColumnExcept) {
        doUpdate(whiteColumnExcept, null);
    }

    protected void doUpdate(WhiteColumnExcept whiteColumnExcept, final UpdateOption<WhiteColumnExceptCB> op) {
        assertObjectNotNull("whiteColumnExcept", whiteColumnExcept);
        prepareUpdateOption(op);
        helpUpdateInternally(whiteColumnExcept, new InternalUpdateCallback<WhiteColumnExcept>() {
            public int callbackDelegateUpdate(WhiteColumnExcept et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhiteColumnExceptCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected WhiteColumnExceptCB createCBForVaryingUpdate() {
        WhiteColumnExceptCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected WhiteColumnExceptCB createCBForSpecifiedUpdate() {
        WhiteColumnExceptCB cb = newMyConditionBean();
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
     * @param whiteColumnExcept The entity of insert or update target. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteColumnExcept whiteColumnExcept) {
        doInesrtOrUpdate(whiteColumnExcept, null, null);
    }

    protected void doInesrtOrUpdate(WhiteColumnExcept whiteColumnExcept, final InsertOption<WhiteColumnExceptCB> iop, final UpdateOption<WhiteColumnExceptCB> uop) {
        helpInsertOrUpdateInternally(whiteColumnExcept, new InternalInsertOrUpdateCallback<WhiteColumnExcept, WhiteColumnExceptCB>() {
            public void callbackInsert(WhiteColumnExcept et) { doInsert(et, iop); }
            public void callbackUpdate(WhiteColumnExcept et) { doUpdate(et, uop); }
            public WhiteColumnExceptCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(WhiteColumnExceptCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<WhiteColumnExceptCB>();
            uop = uop != null ? uop : new UpdateOption<WhiteColumnExceptCB>();
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
     * WhiteColumnExcept whiteColumnExcept = new WhiteColumnExcept();
     * whiteColumnExcept.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteColumnExcept.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteColumnExceptBhv.<span style="color: #DD4747">delete</span>(whiteColumnExcept);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteColumnExcept The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteColumnExcept whiteColumnExcept) {
        doDelete(whiteColumnExcept, null);
    }

    protected void doDelete(WhiteColumnExcept whiteColumnExcept, final DeleteOption<WhiteColumnExceptCB> op) {
        assertObjectNotNull("whiteColumnExcept", whiteColumnExcept);
        prepareDeleteOption(op);
        helpDeleteInternally(whiteColumnExcept, new InternalDeleteCallback<WhiteColumnExcept>() {
            public int callbackDelegateDelete(WhiteColumnExcept et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhiteColumnExceptCB> op) {
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
     *     WhiteColumnExcept whiteColumnExcept = new WhiteColumnExcept();
     *     whiteColumnExcept.setFooName("foo");
     *     if (...) {
     *         whiteColumnExcept.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteColumnExceptList.add(whiteColumnExcept);
     * }
     * whiteColumnExceptBhv.<span style="color: #DD4747">batchInsert</span>(whiteColumnExceptList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteColumnExceptList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteColumnExcept> whiteColumnExceptList) {
        InsertOption<WhiteColumnExceptCB> op = createInsertUpdateOption();
        return doBatchInsert(whiteColumnExceptList, op);
    }

    protected int[] doBatchInsert(List<WhiteColumnExcept> whiteColumnExceptList, InsertOption<WhiteColumnExceptCB> op) {
        assertObjectNotNull("whiteColumnExceptList", whiteColumnExceptList);
        prepareBatchInsertOption(whiteColumnExceptList, op);
        return delegateBatchInsert(whiteColumnExceptList, op);
    }

    protected void prepareBatchInsertOption(List<WhiteColumnExcept> whiteColumnExceptList, InsertOption<WhiteColumnExceptCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(whiteColumnExceptList);
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
     *     WhiteColumnExcept whiteColumnExcept = new WhiteColumnExcept();
     *     whiteColumnExcept.setFooName("foo");
     *     if (...) {
     *         whiteColumnExcept.setFooPrice(123);
     *     } else {
     *         whiteColumnExcept.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteColumnExcept.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteColumnExceptList.add(whiteColumnExcept);
     * }
     * whiteColumnExceptBhv.<span style="color: #DD4747">batchUpdate</span>(whiteColumnExceptList);
     * </pre>
     * @param whiteColumnExceptList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteColumnExcept> whiteColumnExceptList) {
        UpdateOption<WhiteColumnExceptCB> op = createPlainUpdateOption();
        return doBatchUpdate(whiteColumnExceptList, op);
    }

    protected int[] doBatchUpdate(List<WhiteColumnExcept> whiteColumnExceptList, UpdateOption<WhiteColumnExceptCB> op) {
        assertObjectNotNull("whiteColumnExceptList", whiteColumnExceptList);
        prepareBatchUpdateOption(whiteColumnExceptList, op);
        return delegateBatchUpdate(whiteColumnExceptList, op);
    }

    protected void prepareBatchUpdateOption(List<WhiteColumnExcept> whiteColumnExceptList, UpdateOption<WhiteColumnExceptCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(whiteColumnExceptList);
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
     * whiteColumnExceptBhv.<span style="color: #DD4747">batchUpdate</span>(whiteColumnExceptList, new SpecifyQuery<WhiteColumnExceptCB>() {
     *     public void specify(WhiteColumnExceptCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteColumnExceptBhv.<span style="color: #DD4747">batchUpdate</span>(whiteColumnExceptList, new SpecifyQuery<WhiteColumnExceptCB>() {
     *     public void specify(WhiteColumnExceptCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteColumnExceptList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteColumnExcept> whiteColumnExceptList, SpecifyQuery<WhiteColumnExceptCB> updateColumnSpec) {
        return doBatchUpdate(whiteColumnExceptList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteColumnExceptList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteColumnExcept> whiteColumnExceptList) {
        return doBatchDelete(whiteColumnExceptList, null);
    }

    protected int[] doBatchDelete(List<WhiteColumnExcept> whiteColumnExceptList, DeleteOption<WhiteColumnExceptCB> op) {
        assertObjectNotNull("whiteColumnExceptList", whiteColumnExceptList);
        prepareDeleteOption(op);
        return delegateBatchDelete(whiteColumnExceptList, op);
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
     * whiteColumnExceptBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteColumnExcept, WhiteColumnExceptCB&gt;() {
     *     public ConditionBean setup(whiteColumnExcept entity, WhiteColumnExceptCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteColumnExcept, WhiteColumnExceptCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteColumnExcept, WhiteColumnExceptCB> sp, InsertOption<WhiteColumnExceptCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        WhiteColumnExcept e = new WhiteColumnExcept();
        WhiteColumnExceptCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected WhiteColumnExceptCB createCBForQueryInsert() {
        WhiteColumnExceptCB cb = newMyConditionBean();
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
     * WhiteColumnExcept whiteColumnExcept = new WhiteColumnExcept();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteColumnExcept.setPK...(value);</span>
     * whiteColumnExcept.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteColumnExcept.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteColumnExcept.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteColumnExcept.setVersionNo(value);</span>
     * WhiteColumnExceptCB cb = new WhiteColumnExceptCB();
     * cb.query().setFoo...(value);
     * whiteColumnExceptBhv.<span style="color: #DD4747">queryUpdate</span>(whiteColumnExcept, cb);
     * </pre>
     * @param whiteColumnExcept The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteColumnExcept. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteColumnExcept whiteColumnExcept, WhiteColumnExceptCB cb) {
        return doQueryUpdate(whiteColumnExcept, cb, null);
    }

    protected int doQueryUpdate(WhiteColumnExcept whiteColumnExcept, WhiteColumnExceptCB cb, UpdateOption<WhiteColumnExceptCB> op) {
        assertObjectNotNull("whiteColumnExcept", whiteColumnExcept); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(whiteColumnExcept, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (WhiteColumnExceptCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (WhiteColumnExceptCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteColumnExceptCB cb = new WhiteColumnExceptCB();
     * cb.query().setFoo...(value);
     * whiteColumnExceptBhv.<span style="color: #DD4747">queryDelete</span>(whiteColumnExcept, cb);
     * </pre>
     * @param cb The condition-bean of WhiteColumnExcept. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteColumnExceptCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteColumnExceptCB cb, DeleteOption<WhiteColumnExceptCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((WhiteColumnExceptCB)cb); }
        else { return varyingQueryDelete((WhiteColumnExceptCB)cb, downcast(op)); }
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
     * WhiteColumnExcept whiteColumnExcept = new WhiteColumnExcept();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteColumnExcept.setFoo...(value);
     * whiteColumnExcept.setBar...(value);
     * InsertOption<WhiteColumnExceptCB> option = new InsertOption<WhiteColumnExceptCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteColumnExceptBhv.<span style="color: #DD4747">varyingInsert</span>(whiteColumnExcept, option);
     * ... = whiteColumnExcept.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteColumnExcept The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteColumnExcept whiteColumnExcept, InsertOption<WhiteColumnExceptCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteColumnExcept, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteColumnExcept whiteColumnExcept = new WhiteColumnExcept();
     * whiteColumnExcept.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteColumnExcept.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteColumnExcept.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteColumnExceptCB&gt; option = new UpdateOption&lt;WhiteColumnExceptCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteColumnExceptCB&gt;() {
     *         public void specify(WhiteColumnExceptCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteColumnExceptBhv.<span style="color: #DD4747">varyingUpdate</span>(whiteColumnExcept, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteColumnExcept The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteColumnExcept whiteColumnExcept, UpdateOption<WhiteColumnExceptCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteColumnExcept, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteColumnExcept The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteColumnExcept whiteColumnExcept, InsertOption<WhiteColumnExceptCB> insertOption, UpdateOption<WhiteColumnExceptCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(whiteColumnExcept, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteColumnExcept The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteColumnExcept whiteColumnExcept, DeleteOption<WhiteColumnExceptCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteColumnExcept, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteColumnExceptList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteColumnExcept> whiteColumnExceptList, InsertOption<WhiteColumnExceptCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteColumnExceptList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteColumnExceptList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteColumnExcept> whiteColumnExceptList, UpdateOption<WhiteColumnExceptCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteColumnExceptList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteColumnExceptList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteColumnExcept> whiteColumnExceptList, DeleteOption<WhiteColumnExceptCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteColumnExceptList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteColumnExcept, WhiteColumnExceptCB> setupper, InsertOption<WhiteColumnExceptCB> option) {
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
     * WhiteColumnExcept whiteColumnExcept = new WhiteColumnExcept();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteColumnExcept.setPK...(value);</span>
     * whiteColumnExcept.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteColumnExcept.setVersionNo(value);</span>
     * WhiteColumnExceptCB cb = new WhiteColumnExceptCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteColumnExceptCB&gt; option = new UpdateOption&lt;WhiteColumnExceptCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteColumnExceptCB&gt;() {
     *     public void specify(WhiteColumnExceptCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteColumnExceptBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteColumnExcept, cb, option);
     * </pre>
     * @param whiteColumnExcept The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteColumnExcept. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteColumnExcept whiteColumnExcept, WhiteColumnExceptCB cb, UpdateOption<WhiteColumnExceptCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteColumnExcept, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteColumnExcept. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteColumnExceptCB cb, DeleteOption<WhiteColumnExceptCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteColumnExceptBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhiteColumnExceptCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhiteColumnExceptCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhiteColumnExcept> void delegateSelectCursor(WhiteColumnExceptCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends WhiteColumnExcept> List<ENTITY> delegateSelectList(WhiteColumnExceptCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhiteColumnExcept et, InsertOption<WhiteColumnExceptCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(WhiteColumnExcept et, UpdateOption<WhiteColumnExceptCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(WhiteColumnExcept et, UpdateOption<WhiteColumnExceptCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(WhiteColumnExcept et, DeleteOption<WhiteColumnExceptCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(WhiteColumnExcept et, DeleteOption<WhiteColumnExceptCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<WhiteColumnExcept> ls, InsertOption<WhiteColumnExceptCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhiteColumnExcept> ls, UpdateOption<WhiteColumnExceptCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhiteColumnExcept> ls, UpdateOption<WhiteColumnExceptCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhiteColumnExcept> ls, DeleteOption<WhiteColumnExceptCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhiteColumnExcept> ls, DeleteOption<WhiteColumnExceptCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhiteColumnExcept et, WhiteColumnExceptCB inCB, ConditionBean resCB, InsertOption<WhiteColumnExceptCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhiteColumnExcept et, WhiteColumnExceptCB cb, UpdateOption<WhiteColumnExceptCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(WhiteColumnExceptCB cb, DeleteOption<WhiteColumnExceptCB> op)
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
    protected WhiteColumnExcept downcast(Entity et) {
        return helpEntityDowncastInternally(et, WhiteColumnExcept.class);
    }

    protected WhiteColumnExceptCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, WhiteColumnExceptCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<WhiteColumnExcept> downcast(List<? extends Entity> ls) {
        return (List<WhiteColumnExcept>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteColumnExceptCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<WhiteColumnExceptCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteColumnExceptCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<WhiteColumnExceptCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteColumnExceptCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<WhiteColumnExceptCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteColumnExcept, WhiteColumnExceptCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<WhiteColumnExcept, WhiteColumnExceptCB>)sp;
    }
}
