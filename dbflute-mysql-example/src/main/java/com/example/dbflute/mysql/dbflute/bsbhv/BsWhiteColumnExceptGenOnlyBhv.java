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
 * The behavior of WHITE_COLUMN_EXCEPT_GEN_ONLY as TABLE. <br />
 * <pre>
 * [primary key]
 *     GEN_ONLY_ID
 *
 * [column]
 *     GEN_ONLY_ID, GEN_ONLY_NAME
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
public abstract class BsWhiteColumnExceptGenOnlyBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_column_except_gen_only"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return WhiteColumnExceptGenOnlyDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteColumnExceptGenOnlyDbm getMyDBMeta() { return WhiteColumnExceptGenOnlyDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteColumnExceptGenOnly newMyEntity() { return new WhiteColumnExceptGenOnly(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteColumnExceptGenOnlyCB newMyConditionBean() { return new WhiteColumnExceptGenOnlyCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteColumnExceptGenOnlyCB cb = new WhiteColumnExceptGenOnlyCB();
     * cb.query().setFoo...(value);
     * int count = whiteColumnExceptGenOnlyBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteColumnExceptGenOnly. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteColumnExceptGenOnlyCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteColumnExceptGenOnlyCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteColumnExceptGenOnlyCB cb) { // called by selectPage(cb)
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
     * WhiteColumnExceptGenOnlyCB cb = new WhiteColumnExceptGenOnlyCB();
     * cb.query().setFoo...(value);
     * WhiteColumnExceptGenOnly whiteColumnExceptGenOnly = whiteColumnExceptGenOnlyBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (whiteColumnExceptGenOnly != null) {
     *     ... = whiteColumnExceptGenOnly.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteColumnExceptGenOnly. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteColumnExceptGenOnly selectEntity(WhiteColumnExceptGenOnlyCB cb) {
        return doSelectEntity(cb, WhiteColumnExceptGenOnly.class);
    }

    protected <ENTITY extends WhiteColumnExceptGenOnly> ENTITY doSelectEntity(final WhiteColumnExceptGenOnlyCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, WhiteColumnExceptGenOnlyCB>() {
            public List<ENTITY> callbackSelectList(WhiteColumnExceptGenOnlyCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * WhiteColumnExceptGenOnlyCB cb = new WhiteColumnExceptGenOnlyCB();
     * cb.query().setFoo...(value);
     * WhiteColumnExceptGenOnly whiteColumnExceptGenOnly = whiteColumnExceptGenOnlyBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteColumnExceptGenOnly.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteColumnExceptGenOnly. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteColumnExceptGenOnly selectEntityWithDeletedCheck(WhiteColumnExceptGenOnlyCB cb) {
        return doSelectEntityWithDeletedCheck(cb, WhiteColumnExceptGenOnly.class);
    }

    protected <ENTITY extends WhiteColumnExceptGenOnly> ENTITY doSelectEntityWithDeletedCheck(final WhiteColumnExceptGenOnlyCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteColumnExceptGenOnlyCB>() {
            public List<ENTITY> callbackSelectList(WhiteColumnExceptGenOnlyCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param genOnlyId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteColumnExceptGenOnly selectByPKValue(Long genOnlyId) {
        return doSelectByPKValue(genOnlyId, WhiteColumnExceptGenOnly.class);
    }

    protected <ENTITY extends WhiteColumnExceptGenOnly> ENTITY doSelectByPKValue(Long genOnlyId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(genOnlyId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param genOnlyId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteColumnExceptGenOnly selectByPKValueWithDeletedCheck(Long genOnlyId) {
        return doSelectByPKValueWithDeletedCheck(genOnlyId, WhiteColumnExceptGenOnly.class);
    }

    protected <ENTITY extends WhiteColumnExceptGenOnly> ENTITY doSelectByPKValueWithDeletedCheck(Long genOnlyId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(genOnlyId), entityType);
    }

    private WhiteColumnExceptGenOnlyCB buildPKCB(Long genOnlyId) {
        assertObjectNotNull("genOnlyId", genOnlyId);
        WhiteColumnExceptGenOnlyCB cb = newMyConditionBean();
        cb.query().setGenOnlyId_Equal(genOnlyId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteColumnExceptGenOnlyCB cb = new WhiteColumnExceptGenOnlyCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteColumnExceptGenOnly&gt; whiteColumnExceptGenOnlyList = whiteColumnExceptGenOnlyBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (WhiteColumnExceptGenOnly whiteColumnExceptGenOnly : whiteColumnExceptGenOnlyList) {
     *     ... = whiteColumnExceptGenOnly.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteColumnExceptGenOnly. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteColumnExceptGenOnly> selectList(WhiteColumnExceptGenOnlyCB cb) {
        return doSelectList(cb, WhiteColumnExceptGenOnly.class);
    }

    protected <ENTITY extends WhiteColumnExceptGenOnly> ListResultBean<ENTITY> doSelectList(WhiteColumnExceptGenOnlyCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, WhiteColumnExceptGenOnlyCB>() {
            public List<ENTITY> callbackSelectList(WhiteColumnExceptGenOnlyCB cb, Class<ENTITY> tp) { return delegateSelectList(cb, tp); } });
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
     * WhiteColumnExceptGenOnlyCB cb = new WhiteColumnExceptGenOnlyCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteColumnExceptGenOnly&gt; page = whiteColumnExceptGenOnlyBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteColumnExceptGenOnly whiteColumnExceptGenOnly : page) {
     *     ... = whiteColumnExceptGenOnly.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteColumnExceptGenOnly. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteColumnExceptGenOnly> selectPage(WhiteColumnExceptGenOnlyCB cb) {
        return doSelectPage(cb, WhiteColumnExceptGenOnly.class);
    }

    protected <ENTITY extends WhiteColumnExceptGenOnly> PagingResultBean<ENTITY> doSelectPage(WhiteColumnExceptGenOnlyCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, WhiteColumnExceptGenOnlyCB>() {
            public int callbackSelectCount(WhiteColumnExceptGenOnlyCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteColumnExceptGenOnlyCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * WhiteColumnExceptGenOnlyCB cb = new WhiteColumnExceptGenOnlyCB();
     * cb.query().setFoo...(value);
     * whiteColumnExceptGenOnlyBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteColumnExceptGenOnly&gt;() {
     *     public void handle(WhiteColumnExceptGenOnly entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteColumnExceptGenOnly. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteColumnExceptGenOnly. (NotNull)
     */
    public void selectCursor(WhiteColumnExceptGenOnlyCB cb, EntityRowHandler<WhiteColumnExceptGenOnly> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, WhiteColumnExceptGenOnly.class);
    }

    protected <ENTITY extends WhiteColumnExceptGenOnly> void doSelectCursor(WhiteColumnExceptGenOnlyCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, WhiteColumnExceptGenOnlyCB>() {
            public void callbackSelectCursor(WhiteColumnExceptGenOnlyCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(WhiteColumnExceptGenOnlyCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteColumnExceptGenOnlyBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteColumnExceptGenOnlyCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<WhiteColumnExceptGenOnlyCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends WhiteColumnExceptGenOnlyCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends WhiteColumnExceptGenOnlyCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
     * Extract the value list of (single) primary key genOnlyId.
     * @param whiteColumnExceptGenOnlyList The list of whiteColumnExceptGenOnly. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractGenOnlyIdList(List<WhiteColumnExceptGenOnly> whiteColumnExceptGenOnlyList) {
        return helpExtractListInternally(whiteColumnExceptGenOnlyList, new InternalExtractCallback<WhiteColumnExceptGenOnly, Long>() {
            public Long getCV(WhiteColumnExceptGenOnly et) { return et.getGenOnlyId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteColumnExceptGenOnly whiteColumnExceptGenOnly = new WhiteColumnExceptGenOnly();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteColumnExceptGenOnly.setFoo...(value);
     * whiteColumnExceptGenOnly.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteColumnExceptGenOnly.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteColumnExceptGenOnly.set...;</span>
     * whiteColumnExceptGenOnlyBhv.<span style="color: #FD4747">insert</span>(whiteColumnExceptGenOnly);
     * ... = whiteColumnExceptGenOnly.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteColumnExceptGenOnly The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteColumnExceptGenOnly whiteColumnExceptGenOnly) {
        doInsert(whiteColumnExceptGenOnly, null);
    }

    protected void doInsert(WhiteColumnExceptGenOnly whiteColumnExceptGenOnly, InsertOption<WhiteColumnExceptGenOnlyCB> op) {
        assertObjectNotNull("whiteColumnExceptGenOnly", whiteColumnExceptGenOnly);
        prepareInsertOption(op);
        delegateInsert(whiteColumnExceptGenOnly, op);
    }

    protected void prepareInsertOption(InsertOption<WhiteColumnExceptGenOnlyCB> op) {
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
     * WhiteColumnExceptGenOnly whiteColumnExceptGenOnly = new WhiteColumnExceptGenOnly();
     * whiteColumnExceptGenOnly.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteColumnExceptGenOnly.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteColumnExceptGenOnly.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteColumnExceptGenOnly.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteColumnExceptGenOnly.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteColumnExceptGenOnlyBhv.<span style="color: #FD4747">update</span>(whiteColumnExceptGenOnly);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteColumnExceptGenOnly The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final WhiteColumnExceptGenOnly whiteColumnExceptGenOnly) {
        doUpdate(whiteColumnExceptGenOnly, null);
    }

    protected void doUpdate(WhiteColumnExceptGenOnly whiteColumnExceptGenOnly, final UpdateOption<WhiteColumnExceptGenOnlyCB> op) {
        assertObjectNotNull("whiteColumnExceptGenOnly", whiteColumnExceptGenOnly);
        prepareUpdateOption(op);
        helpUpdateInternally(whiteColumnExceptGenOnly, new InternalUpdateCallback<WhiteColumnExceptGenOnly>() {
            public int callbackDelegateUpdate(WhiteColumnExceptGenOnly et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhiteColumnExceptGenOnlyCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected WhiteColumnExceptGenOnlyCB createCBForVaryingUpdate() {
        WhiteColumnExceptGenOnlyCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected WhiteColumnExceptGenOnlyCB createCBForSpecifiedUpdate() {
        WhiteColumnExceptGenOnlyCB cb = newMyConditionBean();
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
     * @param whiteColumnExceptGenOnly The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteColumnExceptGenOnly whiteColumnExceptGenOnly) {
        doInesrtOrUpdate(whiteColumnExceptGenOnly, null, null);
    }

    protected void doInesrtOrUpdate(WhiteColumnExceptGenOnly whiteColumnExceptGenOnly, final InsertOption<WhiteColumnExceptGenOnlyCB> iop, final UpdateOption<WhiteColumnExceptGenOnlyCB> uop) {
        helpInsertOrUpdateInternally(whiteColumnExceptGenOnly, new InternalInsertOrUpdateCallback<WhiteColumnExceptGenOnly, WhiteColumnExceptGenOnlyCB>() {
            public void callbackInsert(WhiteColumnExceptGenOnly et) { doInsert(et, iop); }
            public void callbackUpdate(WhiteColumnExceptGenOnly et) { doUpdate(et, uop); }
            public WhiteColumnExceptGenOnlyCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(WhiteColumnExceptGenOnlyCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<WhiteColumnExceptGenOnlyCB>();
            uop = uop != null ? uop : new UpdateOption<WhiteColumnExceptGenOnlyCB>();
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
     * WhiteColumnExceptGenOnly whiteColumnExceptGenOnly = new WhiteColumnExceptGenOnly();
     * whiteColumnExceptGenOnly.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteColumnExceptGenOnly.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteColumnExceptGenOnlyBhv.<span style="color: #FD4747">delete</span>(whiteColumnExceptGenOnly);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteColumnExceptGenOnly The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteColumnExceptGenOnly whiteColumnExceptGenOnly) {
        doDelete(whiteColumnExceptGenOnly, null);
    }

    protected void doDelete(WhiteColumnExceptGenOnly whiteColumnExceptGenOnly, final DeleteOption<WhiteColumnExceptGenOnlyCB> op) {
        assertObjectNotNull("whiteColumnExceptGenOnly", whiteColumnExceptGenOnly);
        prepareDeleteOption(op);
        helpDeleteInternally(whiteColumnExceptGenOnly, new InternalDeleteCallback<WhiteColumnExceptGenOnly>() {
            public int callbackDelegateDelete(WhiteColumnExceptGenOnly et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhiteColumnExceptGenOnlyCB> op) {
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
     *     WhiteColumnExceptGenOnly whiteColumnExceptGenOnly = new WhiteColumnExceptGenOnly();
     *     whiteColumnExceptGenOnly.setFooName("foo");
     *     if (...) {
     *         whiteColumnExceptGenOnly.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteColumnExceptGenOnlyList.add(whiteColumnExceptGenOnly);
     * }
     * whiteColumnExceptGenOnlyBhv.<span style="color: #FD4747">batchInsert</span>(whiteColumnExceptGenOnlyList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteColumnExceptGenOnlyList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteColumnExceptGenOnly> whiteColumnExceptGenOnlyList) {
        InsertOption<WhiteColumnExceptGenOnlyCB> op = createInsertUpdateOption();
        return doBatchInsert(whiteColumnExceptGenOnlyList, op);
    }

    protected int[] doBatchInsert(List<WhiteColumnExceptGenOnly> whiteColumnExceptGenOnlyList, InsertOption<WhiteColumnExceptGenOnlyCB> op) {
        assertObjectNotNull("whiteColumnExceptGenOnlyList", whiteColumnExceptGenOnlyList);
        prepareBatchInsertOption(whiteColumnExceptGenOnlyList, op);
        return delegateBatchInsert(whiteColumnExceptGenOnlyList, op);
    }

    protected void prepareBatchInsertOption(List<WhiteColumnExceptGenOnly> whiteColumnExceptGenOnlyList, InsertOption<WhiteColumnExceptGenOnlyCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(whiteColumnExceptGenOnlyList);
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
     *     WhiteColumnExceptGenOnly whiteColumnExceptGenOnly = new WhiteColumnExceptGenOnly();
     *     whiteColumnExceptGenOnly.setFooName("foo");
     *     if (...) {
     *         whiteColumnExceptGenOnly.setFooPrice(123);
     *     } else {
     *         whiteColumnExceptGenOnly.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteColumnExceptGenOnly.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteColumnExceptGenOnlyList.add(whiteColumnExceptGenOnly);
     * }
     * whiteColumnExceptGenOnlyBhv.<span style="color: #FD4747">batchUpdate</span>(whiteColumnExceptGenOnlyList);
     * </pre>
     * @param whiteColumnExceptGenOnlyList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteColumnExceptGenOnly> whiteColumnExceptGenOnlyList) {
        UpdateOption<WhiteColumnExceptGenOnlyCB> op = createPlainUpdateOption();
        return doBatchUpdate(whiteColumnExceptGenOnlyList, op);
    }

    protected int[] doBatchUpdate(List<WhiteColumnExceptGenOnly> whiteColumnExceptGenOnlyList, UpdateOption<WhiteColumnExceptGenOnlyCB> op) {
        assertObjectNotNull("whiteColumnExceptGenOnlyList", whiteColumnExceptGenOnlyList);
        prepareBatchUpdateOption(whiteColumnExceptGenOnlyList, op);
        return delegateBatchUpdate(whiteColumnExceptGenOnlyList, op);
    }

    protected void prepareBatchUpdateOption(List<WhiteColumnExceptGenOnly> whiteColumnExceptGenOnlyList, UpdateOption<WhiteColumnExceptGenOnlyCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(whiteColumnExceptGenOnlyList);
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
     * whiteColumnExceptGenOnlyBhv.<span style="color: #FD4747">batchUpdate</span>(whiteColumnExceptGenOnlyList, new SpecifyQuery<WhiteColumnExceptGenOnlyCB>() {
     *     public void specify(WhiteColumnExceptGenOnlyCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteColumnExceptGenOnlyBhv.<span style="color: #FD4747">batchUpdate</span>(whiteColumnExceptGenOnlyList, new SpecifyQuery<WhiteColumnExceptGenOnlyCB>() {
     *     public void specify(WhiteColumnExceptGenOnlyCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteColumnExceptGenOnlyList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteColumnExceptGenOnly> whiteColumnExceptGenOnlyList, SpecifyQuery<WhiteColumnExceptGenOnlyCB> updateColumnSpec) {
        return doBatchUpdate(whiteColumnExceptGenOnlyList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteColumnExceptGenOnlyList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteColumnExceptGenOnly> whiteColumnExceptGenOnlyList) {
        return doBatchDelete(whiteColumnExceptGenOnlyList, null);
    }

    protected int[] doBatchDelete(List<WhiteColumnExceptGenOnly> whiteColumnExceptGenOnlyList, DeleteOption<WhiteColumnExceptGenOnlyCB> op) {
        assertObjectNotNull("whiteColumnExceptGenOnlyList", whiteColumnExceptGenOnlyList);
        prepareDeleteOption(op);
        return delegateBatchDelete(whiteColumnExceptGenOnlyList, op);
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
     * whiteColumnExceptGenOnlyBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteColumnExceptGenOnly, WhiteColumnExceptGenOnlyCB&gt;() {
     *     public ConditionBean setup(whiteColumnExceptGenOnly entity, WhiteColumnExceptGenOnlyCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteColumnExceptGenOnly, WhiteColumnExceptGenOnlyCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteColumnExceptGenOnly, WhiteColumnExceptGenOnlyCB> sp, InsertOption<WhiteColumnExceptGenOnlyCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        WhiteColumnExceptGenOnly e = new WhiteColumnExceptGenOnly();
        WhiteColumnExceptGenOnlyCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected WhiteColumnExceptGenOnlyCB createCBForQueryInsert() {
        WhiteColumnExceptGenOnlyCB cb = newMyConditionBean();
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
     * WhiteColumnExceptGenOnly whiteColumnExceptGenOnly = new WhiteColumnExceptGenOnly();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteColumnExceptGenOnly.setPK...(value);</span>
     * whiteColumnExceptGenOnly.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteColumnExceptGenOnly.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteColumnExceptGenOnly.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteColumnExceptGenOnly.setVersionNo(value);</span>
     * WhiteColumnExceptGenOnlyCB cb = new WhiteColumnExceptGenOnlyCB();
     * cb.query().setFoo...(value);
     * whiteColumnExceptGenOnlyBhv.<span style="color: #FD4747">queryUpdate</span>(whiteColumnExceptGenOnly, cb);
     * </pre>
     * @param whiteColumnExceptGenOnly The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteColumnExceptGenOnly. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteColumnExceptGenOnly whiteColumnExceptGenOnly, WhiteColumnExceptGenOnlyCB cb) {
        return doQueryUpdate(whiteColumnExceptGenOnly, cb, null);
    }

    protected int doQueryUpdate(WhiteColumnExceptGenOnly whiteColumnExceptGenOnly, WhiteColumnExceptGenOnlyCB cb, UpdateOption<WhiteColumnExceptGenOnlyCB> op) {
        assertObjectNotNull("whiteColumnExceptGenOnly", whiteColumnExceptGenOnly); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(whiteColumnExceptGenOnly, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (WhiteColumnExceptGenOnlyCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (WhiteColumnExceptGenOnlyCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteColumnExceptGenOnlyCB cb = new WhiteColumnExceptGenOnlyCB();
     * cb.query().setFoo...(value);
     * whiteColumnExceptGenOnlyBhv.<span style="color: #FD4747">queryDelete</span>(whiteColumnExceptGenOnly, cb);
     * </pre>
     * @param cb The condition-bean of WhiteColumnExceptGenOnly. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteColumnExceptGenOnlyCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteColumnExceptGenOnlyCB cb, DeleteOption<WhiteColumnExceptGenOnlyCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((WhiteColumnExceptGenOnlyCB)cb); }
        else { return varyingQueryDelete((WhiteColumnExceptGenOnlyCB)cb, downcast(op)); }
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
     * WhiteColumnExceptGenOnly whiteColumnExceptGenOnly = new WhiteColumnExceptGenOnly();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteColumnExceptGenOnly.setFoo...(value);
     * whiteColumnExceptGenOnly.setBar...(value);
     * InsertOption<WhiteColumnExceptGenOnlyCB> option = new InsertOption<WhiteColumnExceptGenOnlyCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteColumnExceptGenOnlyBhv.<span style="color: #FD4747">varyingInsert</span>(whiteColumnExceptGenOnly, option);
     * ... = whiteColumnExceptGenOnly.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteColumnExceptGenOnly The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteColumnExceptGenOnly whiteColumnExceptGenOnly, InsertOption<WhiteColumnExceptGenOnlyCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteColumnExceptGenOnly, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteColumnExceptGenOnly whiteColumnExceptGenOnly = new WhiteColumnExceptGenOnly();
     * whiteColumnExceptGenOnly.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteColumnExceptGenOnly.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteColumnExceptGenOnly.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteColumnExceptGenOnlyCB&gt; option = new UpdateOption&lt;WhiteColumnExceptGenOnlyCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteColumnExceptGenOnlyCB&gt;() {
     *         public void specify(WhiteColumnExceptGenOnlyCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteColumnExceptGenOnlyBhv.<span style="color: #FD4747">varyingUpdate</span>(whiteColumnExceptGenOnly, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteColumnExceptGenOnly The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteColumnExceptGenOnly whiteColumnExceptGenOnly, UpdateOption<WhiteColumnExceptGenOnlyCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteColumnExceptGenOnly, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteColumnExceptGenOnly The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteColumnExceptGenOnly whiteColumnExceptGenOnly, InsertOption<WhiteColumnExceptGenOnlyCB> insertOption, UpdateOption<WhiteColumnExceptGenOnlyCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(whiteColumnExceptGenOnly, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteColumnExceptGenOnly The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteColumnExceptGenOnly whiteColumnExceptGenOnly, DeleteOption<WhiteColumnExceptGenOnlyCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteColumnExceptGenOnly, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteColumnExceptGenOnlyList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteColumnExceptGenOnly> whiteColumnExceptGenOnlyList, InsertOption<WhiteColumnExceptGenOnlyCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteColumnExceptGenOnlyList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteColumnExceptGenOnlyList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteColumnExceptGenOnly> whiteColumnExceptGenOnlyList, UpdateOption<WhiteColumnExceptGenOnlyCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteColumnExceptGenOnlyList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteColumnExceptGenOnlyList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteColumnExceptGenOnly> whiteColumnExceptGenOnlyList, DeleteOption<WhiteColumnExceptGenOnlyCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteColumnExceptGenOnlyList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteColumnExceptGenOnly, WhiteColumnExceptGenOnlyCB> setupper, InsertOption<WhiteColumnExceptGenOnlyCB> option) {
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
     * WhiteColumnExceptGenOnly whiteColumnExceptGenOnly = new WhiteColumnExceptGenOnly();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteColumnExceptGenOnly.setPK...(value);</span>
     * whiteColumnExceptGenOnly.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteColumnExceptGenOnly.setVersionNo(value);</span>
     * WhiteColumnExceptGenOnlyCB cb = new WhiteColumnExceptGenOnlyCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteColumnExceptGenOnlyCB&gt; option = new UpdateOption&lt;WhiteColumnExceptGenOnlyCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteColumnExceptGenOnlyCB&gt;() {
     *     public void specify(WhiteColumnExceptGenOnlyCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteColumnExceptGenOnlyBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(whiteColumnExceptGenOnly, cb, option);
     * </pre>
     * @param whiteColumnExceptGenOnly The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteColumnExceptGenOnly. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteColumnExceptGenOnly whiteColumnExceptGenOnly, WhiteColumnExceptGenOnlyCB cb, UpdateOption<WhiteColumnExceptGenOnlyCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteColumnExceptGenOnly, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteColumnExceptGenOnly. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteColumnExceptGenOnlyCB cb, DeleteOption<WhiteColumnExceptGenOnlyCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteColumnExceptGenOnlyBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhiteColumnExceptGenOnlyCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhiteColumnExceptGenOnlyCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhiteColumnExceptGenOnly> void delegateSelectCursor(WhiteColumnExceptGenOnlyCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends WhiteColumnExceptGenOnly> List<ENTITY> delegateSelectList(WhiteColumnExceptGenOnlyCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhiteColumnExceptGenOnly et, InsertOption<WhiteColumnExceptGenOnlyCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(WhiteColumnExceptGenOnly et, UpdateOption<WhiteColumnExceptGenOnlyCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(WhiteColumnExceptGenOnly et, UpdateOption<WhiteColumnExceptGenOnlyCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(WhiteColumnExceptGenOnly et, DeleteOption<WhiteColumnExceptGenOnlyCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(WhiteColumnExceptGenOnly et, DeleteOption<WhiteColumnExceptGenOnlyCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<WhiteColumnExceptGenOnly> ls, InsertOption<WhiteColumnExceptGenOnlyCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhiteColumnExceptGenOnly> ls, UpdateOption<WhiteColumnExceptGenOnlyCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhiteColumnExceptGenOnly> ls, UpdateOption<WhiteColumnExceptGenOnlyCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhiteColumnExceptGenOnly> ls, DeleteOption<WhiteColumnExceptGenOnlyCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhiteColumnExceptGenOnly> ls, DeleteOption<WhiteColumnExceptGenOnlyCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhiteColumnExceptGenOnly et, WhiteColumnExceptGenOnlyCB inCB, ConditionBean resCB, InsertOption<WhiteColumnExceptGenOnlyCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhiteColumnExceptGenOnly et, WhiteColumnExceptGenOnlyCB cb, UpdateOption<WhiteColumnExceptGenOnlyCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(WhiteColumnExceptGenOnlyCB cb, DeleteOption<WhiteColumnExceptGenOnlyCB> op)
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
    protected WhiteColumnExceptGenOnly downcast(Entity et) {
        return helpEntityDowncastInternally(et, WhiteColumnExceptGenOnly.class);
    }

    protected WhiteColumnExceptGenOnlyCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, WhiteColumnExceptGenOnlyCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<WhiteColumnExceptGenOnly> downcast(List<? extends Entity> ls) {
        return (List<WhiteColumnExceptGenOnly>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteColumnExceptGenOnlyCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<WhiteColumnExceptGenOnlyCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteColumnExceptGenOnlyCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<WhiteColumnExceptGenOnlyCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteColumnExceptGenOnlyCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<WhiteColumnExceptGenOnlyCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteColumnExceptGenOnly, WhiteColumnExceptGenOnlyCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<WhiteColumnExceptGenOnly, WhiteColumnExceptGenOnlyCB>)sp;
    }
}
