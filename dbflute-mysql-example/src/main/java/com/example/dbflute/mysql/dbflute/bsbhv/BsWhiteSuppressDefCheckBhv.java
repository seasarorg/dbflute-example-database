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
 * The behavior of WHITE_SUPPRESS_DEF_CHECK as TABLE. <br />
 * <pre>
 * [primary key]
 *     DEF_CHECK_ID
 *
 * [column]
 *     DEF_CHECK_ID, DEF_CHECK_NAME
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
public abstract class BsWhiteSuppressDefCheckBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_suppress_def_check"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return WhiteSuppressDefCheckDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteSuppressDefCheckDbm getMyDBMeta() { return WhiteSuppressDefCheckDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteSuppressDefCheck newMyEntity() { return new WhiteSuppressDefCheck(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteSuppressDefCheckCB newMyConditionBean() { return new WhiteSuppressDefCheckCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteSuppressDefCheckCB cb = new WhiteSuppressDefCheckCB();
     * cb.query().setFoo...(value);
     * int count = whiteSuppressDefCheckBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteSuppressDefCheck. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteSuppressDefCheckCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteSuppressDefCheckCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteSuppressDefCheckCB cb) { // called by selectPage(cb)
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
     * WhiteSuppressDefCheckCB cb = new WhiteSuppressDefCheckCB();
     * cb.query().setFoo...(value);
     * WhiteSuppressDefCheck whiteSuppressDefCheck = whiteSuppressDefCheckBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (whiteSuppressDefCheck != null) {
     *     ... = whiteSuppressDefCheck.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSuppressDefCheck. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSuppressDefCheck selectEntity(WhiteSuppressDefCheckCB cb) {
        return doSelectEntity(cb, WhiteSuppressDefCheck.class);
    }

    protected <ENTITY extends WhiteSuppressDefCheck> ENTITY doSelectEntity(WhiteSuppressDefCheckCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, WhiteSuppressDefCheckCB>() {
            public List<ENTITY> callbackSelectList(WhiteSuppressDefCheckCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * WhiteSuppressDefCheckCB cb = new WhiteSuppressDefCheckCB();
     * cb.query().setFoo...(value);
     * WhiteSuppressDefCheck whiteSuppressDefCheck = whiteSuppressDefCheckBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteSuppressDefCheck.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteSuppressDefCheck. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSuppressDefCheck selectEntityWithDeletedCheck(WhiteSuppressDefCheckCB cb) {
        return doSelectEntityWithDeletedCheck(cb, WhiteSuppressDefCheck.class);
    }

    protected <ENTITY extends WhiteSuppressDefCheck> ENTITY doSelectEntityWithDeletedCheck(WhiteSuppressDefCheckCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteSuppressDefCheckCB>() {
            public List<ENTITY> callbackSelectList(WhiteSuppressDefCheckCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param defCheckId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSuppressDefCheck selectByPKValue(Long defCheckId) {
        return doSelectByPKValue(defCheckId, WhiteSuppressDefCheck.class);
    }

    protected <ENTITY extends WhiteSuppressDefCheck> ENTITY doSelectByPKValue(Long defCheckId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(defCheckId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param defCheckId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSuppressDefCheck selectByPKValueWithDeletedCheck(Long defCheckId) {
        return doSelectByPKValueWithDeletedCheck(defCheckId, WhiteSuppressDefCheck.class);
    }

    protected <ENTITY extends WhiteSuppressDefCheck> ENTITY doSelectByPKValueWithDeletedCheck(Long defCheckId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(defCheckId), entityType);
    }

    private WhiteSuppressDefCheckCB buildPKCB(Long defCheckId) {
        assertObjectNotNull("defCheckId", defCheckId);
        WhiteSuppressDefCheckCB cb = newMyConditionBean();
        cb.query().setDefCheckId_Equal(defCheckId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteSuppressDefCheckCB cb = new WhiteSuppressDefCheckCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteSuppressDefCheck&gt; whiteSuppressDefCheckList = whiteSuppressDefCheckBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (WhiteSuppressDefCheck whiteSuppressDefCheck : whiteSuppressDefCheckList) {
     *     ... = whiteSuppressDefCheck.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSuppressDefCheck. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteSuppressDefCheck> selectList(WhiteSuppressDefCheckCB cb) {
        return doSelectList(cb, WhiteSuppressDefCheck.class);
    }

    protected <ENTITY extends WhiteSuppressDefCheck> ListResultBean<ENTITY> doSelectList(WhiteSuppressDefCheckCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, WhiteSuppressDefCheckCB>() {
            public List<ENTITY> callbackSelectList(WhiteSuppressDefCheckCB lcb, Class<ENTITY> ltp) { return delegateSelectList(lcb, ltp); } });
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
     * WhiteSuppressDefCheckCB cb = new WhiteSuppressDefCheckCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteSuppressDefCheck&gt; page = whiteSuppressDefCheckBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteSuppressDefCheck whiteSuppressDefCheck : page) {
     *     ... = whiteSuppressDefCheck.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSuppressDefCheck. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteSuppressDefCheck> selectPage(WhiteSuppressDefCheckCB cb) {
        return doSelectPage(cb, WhiteSuppressDefCheck.class);
    }

    protected <ENTITY extends WhiteSuppressDefCheck> PagingResultBean<ENTITY> doSelectPage(WhiteSuppressDefCheckCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, WhiteSuppressDefCheckCB>() {
            public int callbackSelectCount(WhiteSuppressDefCheckCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteSuppressDefCheckCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * WhiteSuppressDefCheckCB cb = new WhiteSuppressDefCheckCB();
     * cb.query().setFoo...(value);
     * whiteSuppressDefCheckBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteSuppressDefCheck&gt;() {
     *     public void handle(WhiteSuppressDefCheck entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteSuppressDefCheck. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteSuppressDefCheck. (NotNull)
     */
    public void selectCursor(WhiteSuppressDefCheckCB cb, EntityRowHandler<WhiteSuppressDefCheck> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, WhiteSuppressDefCheck.class);
    }

    protected <ENTITY extends WhiteSuppressDefCheck> void doSelectCursor(WhiteSuppressDefCheckCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, WhiteSuppressDefCheckCB>() {
            public void callbackSelectCursor(WhiteSuppressDefCheckCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(WhiteSuppressDefCheckCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteSuppressDefCheckBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteSuppressDefCheckCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<WhiteSuppressDefCheckCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends WhiteSuppressDefCheckCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends WhiteSuppressDefCheckCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
     * Extract the value list of (single) primary key defCheckId.
     * @param whiteSuppressDefCheckList The list of whiteSuppressDefCheck. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractDefCheckIdList(List<WhiteSuppressDefCheck> whiteSuppressDefCheckList) {
        return helpExtractListInternally(whiteSuppressDefCheckList, new InternalExtractCallback<WhiteSuppressDefCheck, Long>() {
            public Long getCV(WhiteSuppressDefCheck et) { return et.getDefCheckId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteSuppressDefCheck whiteSuppressDefCheck = new WhiteSuppressDefCheck();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteSuppressDefCheck.setFoo...(value);
     * whiteSuppressDefCheck.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSuppressDefCheck.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSuppressDefCheck.set...;</span>
     * whiteSuppressDefCheckBhv.<span style="color: #FD4747">insert</span>(whiteSuppressDefCheck);
     * ... = whiteSuppressDefCheck.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteSuppressDefCheck The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteSuppressDefCheck whiteSuppressDefCheck) {
        doInsert(whiteSuppressDefCheck, null);
    }

    protected void doInsert(WhiteSuppressDefCheck whiteSuppressDefCheck, InsertOption<WhiteSuppressDefCheckCB> op) {
        assertObjectNotNull("whiteSuppressDefCheck", whiteSuppressDefCheck);
        prepareInsertOption(op);
        delegateInsert(whiteSuppressDefCheck, op);
    }

    protected void prepareInsertOption(InsertOption<WhiteSuppressDefCheckCB> op) {
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
     * WhiteSuppressDefCheck whiteSuppressDefCheck = new WhiteSuppressDefCheck();
     * whiteSuppressDefCheck.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteSuppressDefCheck.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSuppressDefCheck.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSuppressDefCheck.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteSuppressDefCheck.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteSuppressDefCheckBhv.<span style="color: #FD4747">update</span>(whiteSuppressDefCheck);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSuppressDefCheck The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final WhiteSuppressDefCheck whiteSuppressDefCheck) {
        doUpdate(whiteSuppressDefCheck, null);
    }

    protected void doUpdate(WhiteSuppressDefCheck whiteSuppressDefCheck, final UpdateOption<WhiteSuppressDefCheckCB> op) {
        assertObjectNotNull("whiteSuppressDefCheck", whiteSuppressDefCheck);
        prepareUpdateOption(op);
        helpUpdateInternally(whiteSuppressDefCheck, new InternalUpdateCallback<WhiteSuppressDefCheck>() {
            public int callbackDelegateUpdate(WhiteSuppressDefCheck et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhiteSuppressDefCheckCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected WhiteSuppressDefCheckCB createCBForVaryingUpdate() {
        WhiteSuppressDefCheckCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected WhiteSuppressDefCheckCB createCBForSpecifiedUpdate() {
        WhiteSuppressDefCheckCB cb = newMyConditionBean();
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
     * @param whiteSuppressDefCheck The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteSuppressDefCheck whiteSuppressDefCheck) {
        doInesrtOrUpdate(whiteSuppressDefCheck, null, null);
    }

    protected void doInesrtOrUpdate(WhiteSuppressDefCheck whiteSuppressDefCheck, final InsertOption<WhiteSuppressDefCheckCB> iop, final UpdateOption<WhiteSuppressDefCheckCB> uop) {
        helpInsertOrUpdateInternally(whiteSuppressDefCheck, new InternalInsertOrUpdateCallback<WhiteSuppressDefCheck, WhiteSuppressDefCheckCB>() {
            public void callbackInsert(WhiteSuppressDefCheck et) { doInsert(et, iop); }
            public void callbackUpdate(WhiteSuppressDefCheck et) { doUpdate(et, uop); }
            public WhiteSuppressDefCheckCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(WhiteSuppressDefCheckCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<WhiteSuppressDefCheckCB>();
            uop = uop != null ? uop : new UpdateOption<WhiteSuppressDefCheckCB>();
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
     * WhiteSuppressDefCheck whiteSuppressDefCheck = new WhiteSuppressDefCheck();
     * whiteSuppressDefCheck.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteSuppressDefCheck.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteSuppressDefCheckBhv.<span style="color: #FD4747">delete</span>(whiteSuppressDefCheck);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSuppressDefCheck The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteSuppressDefCheck whiteSuppressDefCheck) {
        doDelete(whiteSuppressDefCheck, null);
    }

    protected void doDelete(WhiteSuppressDefCheck whiteSuppressDefCheck, final DeleteOption<WhiteSuppressDefCheckCB> op) {
        assertObjectNotNull("whiteSuppressDefCheck", whiteSuppressDefCheck);
        prepareDeleteOption(op);
        helpDeleteInternally(whiteSuppressDefCheck, new InternalDeleteCallback<WhiteSuppressDefCheck>() {
            public int callbackDelegateDelete(WhiteSuppressDefCheck et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhiteSuppressDefCheckCB> op) {
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
     *     WhiteSuppressDefCheck whiteSuppressDefCheck = new WhiteSuppressDefCheck();
     *     whiteSuppressDefCheck.setFooName("foo");
     *     if (...) {
     *         whiteSuppressDefCheck.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteSuppressDefCheckList.add(whiteSuppressDefCheck);
     * }
     * whiteSuppressDefCheckBhv.<span style="color: #FD4747">batchInsert</span>(whiteSuppressDefCheckList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteSuppressDefCheckList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteSuppressDefCheck> whiteSuppressDefCheckList) {
        InsertOption<WhiteSuppressDefCheckCB> op = createInsertUpdateOption();
        return doBatchInsert(whiteSuppressDefCheckList, op);
    }

    protected int[] doBatchInsert(List<WhiteSuppressDefCheck> whiteSuppressDefCheckList, InsertOption<WhiteSuppressDefCheckCB> op) {
        assertObjectNotNull("whiteSuppressDefCheckList", whiteSuppressDefCheckList);
        prepareBatchInsertOption(whiteSuppressDefCheckList, op);
        return delegateBatchInsert(whiteSuppressDefCheckList, op);
    }

    protected void prepareBatchInsertOption(List<WhiteSuppressDefCheck> whiteSuppressDefCheckList, InsertOption<WhiteSuppressDefCheckCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(whiteSuppressDefCheckList);
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
     *     WhiteSuppressDefCheck whiteSuppressDefCheck = new WhiteSuppressDefCheck();
     *     whiteSuppressDefCheck.setFooName("foo");
     *     if (...) {
     *         whiteSuppressDefCheck.setFooPrice(123);
     *     } else {
     *         whiteSuppressDefCheck.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteSuppressDefCheck.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteSuppressDefCheckList.add(whiteSuppressDefCheck);
     * }
     * whiteSuppressDefCheckBhv.<span style="color: #FD4747">batchUpdate</span>(whiteSuppressDefCheckList);
     * </pre>
     * @param whiteSuppressDefCheckList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteSuppressDefCheck> whiteSuppressDefCheckList) {
        UpdateOption<WhiteSuppressDefCheckCB> op = createPlainUpdateOption();
        return doBatchUpdate(whiteSuppressDefCheckList, op);
    }

    protected int[] doBatchUpdate(List<WhiteSuppressDefCheck> whiteSuppressDefCheckList, UpdateOption<WhiteSuppressDefCheckCB> op) {
        assertObjectNotNull("whiteSuppressDefCheckList", whiteSuppressDefCheckList);
        prepareBatchUpdateOption(whiteSuppressDefCheckList, op);
        return delegateBatchUpdate(whiteSuppressDefCheckList, op);
    }

    protected void prepareBatchUpdateOption(List<WhiteSuppressDefCheck> whiteSuppressDefCheckList, UpdateOption<WhiteSuppressDefCheckCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(whiteSuppressDefCheckList);
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
     * whiteSuppressDefCheckBhv.<span style="color: #FD4747">batchUpdate</span>(whiteSuppressDefCheckList, new SpecifyQuery<WhiteSuppressDefCheckCB>() {
     *     public void specify(WhiteSuppressDefCheckCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteSuppressDefCheckBhv.<span style="color: #FD4747">batchUpdate</span>(whiteSuppressDefCheckList, new SpecifyQuery<WhiteSuppressDefCheckCB>() {
     *     public void specify(WhiteSuppressDefCheckCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteSuppressDefCheckList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteSuppressDefCheck> whiteSuppressDefCheckList, SpecifyQuery<WhiteSuppressDefCheckCB> updateColumnSpec) {
        return doBatchUpdate(whiteSuppressDefCheckList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteSuppressDefCheckList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteSuppressDefCheck> whiteSuppressDefCheckList) {
        return doBatchDelete(whiteSuppressDefCheckList, null);
    }

    protected int[] doBatchDelete(List<WhiteSuppressDefCheck> whiteSuppressDefCheckList, DeleteOption<WhiteSuppressDefCheckCB> op) {
        assertObjectNotNull("whiteSuppressDefCheckList", whiteSuppressDefCheckList);
        prepareDeleteOption(op);
        return delegateBatchDelete(whiteSuppressDefCheckList, op);
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
     * whiteSuppressDefCheckBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteSuppressDefCheck, WhiteSuppressDefCheckCB&gt;() {
     *     public ConditionBean setup(whiteSuppressDefCheck entity, WhiteSuppressDefCheckCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteSuppressDefCheck, WhiteSuppressDefCheckCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteSuppressDefCheck, WhiteSuppressDefCheckCB> sp, InsertOption<WhiteSuppressDefCheckCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        WhiteSuppressDefCheck e = new WhiteSuppressDefCheck();
        WhiteSuppressDefCheckCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected WhiteSuppressDefCheckCB createCBForQueryInsert() {
        WhiteSuppressDefCheckCB cb = newMyConditionBean();
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
     * WhiteSuppressDefCheck whiteSuppressDefCheck = new WhiteSuppressDefCheck();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSuppressDefCheck.setPK...(value);</span>
     * whiteSuppressDefCheck.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSuppressDefCheck.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSuppressDefCheck.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSuppressDefCheck.setVersionNo(value);</span>
     * WhiteSuppressDefCheckCB cb = new WhiteSuppressDefCheckCB();
     * cb.query().setFoo...(value);
     * whiteSuppressDefCheckBhv.<span style="color: #FD4747">queryUpdate</span>(whiteSuppressDefCheck, cb);
     * </pre>
     * @param whiteSuppressDefCheck The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteSuppressDefCheck. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteSuppressDefCheck whiteSuppressDefCheck, WhiteSuppressDefCheckCB cb) {
        return doQueryUpdate(whiteSuppressDefCheck, cb, null);
    }

    protected int doQueryUpdate(WhiteSuppressDefCheck whiteSuppressDefCheck, WhiteSuppressDefCheckCB cb, UpdateOption<WhiteSuppressDefCheckCB> op) {
        assertObjectNotNull("whiteSuppressDefCheck", whiteSuppressDefCheck); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(whiteSuppressDefCheck, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (WhiteSuppressDefCheckCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (WhiteSuppressDefCheckCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteSuppressDefCheckCB cb = new WhiteSuppressDefCheckCB();
     * cb.query().setFoo...(value);
     * whiteSuppressDefCheckBhv.<span style="color: #FD4747">queryDelete</span>(whiteSuppressDefCheck, cb);
     * </pre>
     * @param cb The condition-bean of WhiteSuppressDefCheck. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteSuppressDefCheckCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteSuppressDefCheckCB cb, DeleteOption<WhiteSuppressDefCheckCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((WhiteSuppressDefCheckCB)cb); }
        else { return varyingQueryDelete((WhiteSuppressDefCheckCB)cb, downcast(op)); }
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
     * WhiteSuppressDefCheck whiteSuppressDefCheck = new WhiteSuppressDefCheck();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteSuppressDefCheck.setFoo...(value);
     * whiteSuppressDefCheck.setBar...(value);
     * InsertOption<WhiteSuppressDefCheckCB> option = new InsertOption<WhiteSuppressDefCheckCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteSuppressDefCheckBhv.<span style="color: #FD4747">varyingInsert</span>(whiteSuppressDefCheck, option);
     * ... = whiteSuppressDefCheck.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteSuppressDefCheck The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteSuppressDefCheck whiteSuppressDefCheck, InsertOption<WhiteSuppressDefCheckCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteSuppressDefCheck, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteSuppressDefCheck whiteSuppressDefCheck = new WhiteSuppressDefCheck();
     * whiteSuppressDefCheck.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteSuppressDefCheck.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteSuppressDefCheck.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteSuppressDefCheckCB&gt; option = new UpdateOption&lt;WhiteSuppressDefCheckCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteSuppressDefCheckCB&gt;() {
     *         public void specify(WhiteSuppressDefCheckCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteSuppressDefCheckBhv.<span style="color: #FD4747">varyingUpdate</span>(whiteSuppressDefCheck, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSuppressDefCheck The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteSuppressDefCheck whiteSuppressDefCheck, UpdateOption<WhiteSuppressDefCheckCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteSuppressDefCheck, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteSuppressDefCheck The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteSuppressDefCheck whiteSuppressDefCheck, InsertOption<WhiteSuppressDefCheckCB> insertOption, UpdateOption<WhiteSuppressDefCheckCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(whiteSuppressDefCheck, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteSuppressDefCheck The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteSuppressDefCheck whiteSuppressDefCheck, DeleteOption<WhiteSuppressDefCheckCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteSuppressDefCheck, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteSuppressDefCheckList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteSuppressDefCheck> whiteSuppressDefCheckList, InsertOption<WhiteSuppressDefCheckCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteSuppressDefCheckList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteSuppressDefCheckList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteSuppressDefCheck> whiteSuppressDefCheckList, UpdateOption<WhiteSuppressDefCheckCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteSuppressDefCheckList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteSuppressDefCheckList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteSuppressDefCheck> whiteSuppressDefCheckList, DeleteOption<WhiteSuppressDefCheckCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteSuppressDefCheckList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteSuppressDefCheck, WhiteSuppressDefCheckCB> setupper, InsertOption<WhiteSuppressDefCheckCB> option) {
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
     * WhiteSuppressDefCheck whiteSuppressDefCheck = new WhiteSuppressDefCheck();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSuppressDefCheck.setPK...(value);</span>
     * whiteSuppressDefCheck.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSuppressDefCheck.setVersionNo(value);</span>
     * WhiteSuppressDefCheckCB cb = new WhiteSuppressDefCheckCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteSuppressDefCheckCB&gt; option = new UpdateOption&lt;WhiteSuppressDefCheckCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteSuppressDefCheckCB&gt;() {
     *     public void specify(WhiteSuppressDefCheckCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteSuppressDefCheckBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(whiteSuppressDefCheck, cb, option);
     * </pre>
     * @param whiteSuppressDefCheck The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteSuppressDefCheck. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteSuppressDefCheck whiteSuppressDefCheck, WhiteSuppressDefCheckCB cb, UpdateOption<WhiteSuppressDefCheckCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteSuppressDefCheck, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteSuppressDefCheck. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteSuppressDefCheckCB cb, DeleteOption<WhiteSuppressDefCheckCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteSuppressDefCheckBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhiteSuppressDefCheckCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhiteSuppressDefCheckCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhiteSuppressDefCheck> void delegateSelectCursor(WhiteSuppressDefCheckCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends WhiteSuppressDefCheck> List<ENTITY> delegateSelectList(WhiteSuppressDefCheckCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhiteSuppressDefCheck et, InsertOption<WhiteSuppressDefCheckCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(WhiteSuppressDefCheck et, UpdateOption<WhiteSuppressDefCheckCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(WhiteSuppressDefCheck et, UpdateOption<WhiteSuppressDefCheckCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(WhiteSuppressDefCheck et, DeleteOption<WhiteSuppressDefCheckCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(WhiteSuppressDefCheck et, DeleteOption<WhiteSuppressDefCheckCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<WhiteSuppressDefCheck> ls, InsertOption<WhiteSuppressDefCheckCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhiteSuppressDefCheck> ls, UpdateOption<WhiteSuppressDefCheckCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhiteSuppressDefCheck> ls, UpdateOption<WhiteSuppressDefCheckCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhiteSuppressDefCheck> ls, DeleteOption<WhiteSuppressDefCheckCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhiteSuppressDefCheck> ls, DeleteOption<WhiteSuppressDefCheckCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhiteSuppressDefCheck et, WhiteSuppressDefCheckCB inCB, ConditionBean resCB, InsertOption<WhiteSuppressDefCheckCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhiteSuppressDefCheck et, WhiteSuppressDefCheckCB cb, UpdateOption<WhiteSuppressDefCheckCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(WhiteSuppressDefCheckCB cb, DeleteOption<WhiteSuppressDefCheckCB> op)
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
    protected WhiteSuppressDefCheck downcast(Entity et) {
        return helpEntityDowncastInternally(et, WhiteSuppressDefCheck.class);
    }

    protected WhiteSuppressDefCheckCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, WhiteSuppressDefCheckCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<WhiteSuppressDefCheck> downcast(List<? extends Entity> ls) {
        return (List<WhiteSuppressDefCheck>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteSuppressDefCheckCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<WhiteSuppressDefCheckCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteSuppressDefCheckCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<WhiteSuppressDefCheckCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteSuppressDefCheckCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<WhiteSuppressDefCheckCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteSuppressDefCheck, WhiteSuppressDefCheckCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<WhiteSuppressDefCheck, WhiteSuppressDefCheckCB>)sp;
    }
}
