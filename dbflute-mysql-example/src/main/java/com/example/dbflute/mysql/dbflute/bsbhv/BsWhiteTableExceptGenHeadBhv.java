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
 * The behavior of WHITE_TABLE_EXCEPT_GEN_HEAD as TABLE. <br />
 * <pre>
 * [primary key]
 *     GEN_HEAD_ID
 *
 * [column]
 *     GEN_HEAD_ID, GEN_HEAD_NAME, NOMETA_ID
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
public abstract class BsWhiteTableExceptGenHeadBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_table_except_gen_head"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return WhiteTableExceptGenHeadDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteTableExceptGenHeadDbm getMyDBMeta() { return WhiteTableExceptGenHeadDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteTableExceptGenHead newMyEntity() { return new WhiteTableExceptGenHead(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteTableExceptGenHeadCB newMyConditionBean() { return new WhiteTableExceptGenHeadCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteTableExceptGenHeadCB cb = new WhiteTableExceptGenHeadCB();
     * cb.query().setFoo...(value);
     * int count = whiteTableExceptGenHeadBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteTableExceptGenHead. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteTableExceptGenHeadCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteTableExceptGenHeadCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteTableExceptGenHeadCB cb) { // called by selectPage(cb)
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
     * WhiteTableExceptGenHeadCB cb = new WhiteTableExceptGenHeadCB();
     * cb.query().setFoo...(value);
     * WhiteTableExceptGenHead whiteTableExceptGenHead = whiteTableExceptGenHeadBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (whiteTableExceptGenHead != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = whiteTableExceptGenHead.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteTableExceptGenHead. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteTableExceptGenHead selectEntity(WhiteTableExceptGenHeadCB cb) {
        return doSelectEntity(cb, WhiteTableExceptGenHead.class);
    }

    protected <ENTITY extends WhiteTableExceptGenHead> ENTITY doSelectEntity(WhiteTableExceptGenHeadCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, WhiteTableExceptGenHeadCB>() {
            public List<ENTITY> callbackSelectList(WhiteTableExceptGenHeadCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    protected <ENTITY extends WhiteTableExceptGenHead> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteTableExceptGenHeadCB cb, Class<ENTITY> tp) {
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
     * WhiteTableExceptGenHeadCB cb = new WhiteTableExceptGenHeadCB();
     * cb.query().setFoo...(value);
     * WhiteTableExceptGenHead whiteTableExceptGenHead = whiteTableExceptGenHeadBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteTableExceptGenHead.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteTableExceptGenHead. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteTableExceptGenHead selectEntityWithDeletedCheck(WhiteTableExceptGenHeadCB cb) {
        return doSelectEntityWithDeletedCheck(cb, WhiteTableExceptGenHead.class);
    }

    protected <ENTITY extends WhiteTableExceptGenHead> ENTITY doSelectEntityWithDeletedCheck(WhiteTableExceptGenHeadCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteTableExceptGenHeadCB>() {
            public List<ENTITY> callbackSelectList(WhiteTableExceptGenHeadCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param genHeadId : PK, NotNull, DECIMAL(16). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteTableExceptGenHead selectByPKValue(Long genHeadId) {
        return doSelectByPK(genHeadId, WhiteTableExceptGenHead.class);
    }

    protected <ENTITY extends WhiteTableExceptGenHead> ENTITY doSelectByPK(Long genHeadId, Class<ENTITY> entityType) {
        return doSelectEntity(xprepareCBAsPK(genHeadId), entityType);
    }

    protected <ENTITY extends WhiteTableExceptGenHead> OptionalEntity<ENTITY> doSelectOptionalByPK(Long genHeadId, Class<ENTITY> entityType) {
        return createOptionalEntity(doSelectByPK(genHeadId, entityType), genHeadId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param genHeadId : PK, NotNull, DECIMAL(16). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteTableExceptGenHead selectByPKValueWithDeletedCheck(Long genHeadId) {
        return doSelectByPKWithDeletedCheck(genHeadId, WhiteTableExceptGenHead.class);
    }

    protected <ENTITY extends WhiteTableExceptGenHead> ENTITY doSelectByPKWithDeletedCheck(Long genHeadId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(genHeadId), entityType);
    }

    protected WhiteTableExceptGenHeadCB xprepareCBAsPK(Long genHeadId) {
        assertObjectNotNull("genHeadId", genHeadId);
        WhiteTableExceptGenHeadCB cb = newMyConditionBean(); cb.acceptPrimaryKey(genHeadId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteTableExceptGenHeadCB cb = new WhiteTableExceptGenHeadCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteTableExceptGenHead&gt; whiteTableExceptGenHeadList = whiteTableExceptGenHeadBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteTableExceptGenHead whiteTableExceptGenHead : whiteTableExceptGenHeadList) {
     *     ... = whiteTableExceptGenHead.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteTableExceptGenHead. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteTableExceptGenHead> selectList(WhiteTableExceptGenHeadCB cb) {
        return doSelectList(cb, WhiteTableExceptGenHead.class);
    }

    protected <ENTITY extends WhiteTableExceptGenHead> ListResultBean<ENTITY> doSelectList(WhiteTableExceptGenHeadCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, WhiteTableExceptGenHeadCB>() {
            public List<ENTITY> callbackSelectList(WhiteTableExceptGenHeadCB lcb, Class<ENTITY> ltp) { return delegateSelectList(lcb, ltp); } });
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
     * WhiteTableExceptGenHeadCB cb = new WhiteTableExceptGenHeadCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteTableExceptGenHead&gt; page = whiteTableExceptGenHeadBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteTableExceptGenHead whiteTableExceptGenHead : page) {
     *     ... = whiteTableExceptGenHead.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteTableExceptGenHead. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteTableExceptGenHead> selectPage(WhiteTableExceptGenHeadCB cb) {
        return doSelectPage(cb, WhiteTableExceptGenHead.class);
    }

    protected <ENTITY extends WhiteTableExceptGenHead> PagingResultBean<ENTITY> doSelectPage(WhiteTableExceptGenHeadCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, WhiteTableExceptGenHeadCB>() {
            public int callbackSelectCount(WhiteTableExceptGenHeadCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteTableExceptGenHeadCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * WhiteTableExceptGenHeadCB cb = new WhiteTableExceptGenHeadCB();
     * cb.query().setFoo...(value);
     * whiteTableExceptGenHeadBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteTableExceptGenHead&gt;() {
     *     public void handle(WhiteTableExceptGenHead entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteTableExceptGenHead. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteTableExceptGenHead. (NotNull)
     */
    public void selectCursor(WhiteTableExceptGenHeadCB cb, EntityRowHandler<WhiteTableExceptGenHead> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, WhiteTableExceptGenHead.class);
    }

    protected <ENTITY extends WhiteTableExceptGenHead> void doSelectCursor(WhiteTableExceptGenHeadCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, WhiteTableExceptGenHeadCB>() {
            public void callbackSelectCursor(WhiteTableExceptGenHeadCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(WhiteTableExceptGenHeadCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteTableExceptGenHeadBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteTableExceptGenHeadCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<WhiteTableExceptGenHeadCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends WhiteTableExceptGenHeadCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends WhiteTableExceptGenHeadCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
     * Extract the value list of (single) primary key genHeadId.
     * @param whiteTableExceptGenHeadList The list of whiteTableExceptGenHead. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractGenHeadIdList(List<WhiteTableExceptGenHead> whiteTableExceptGenHeadList) {
        return helpExtractListInternally(whiteTableExceptGenHeadList, new InternalExtractCallback<WhiteTableExceptGenHead, Long>() {
            public Long getCV(WhiteTableExceptGenHead et) { return et.getGenHeadId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteTableExceptGenHead whiteTableExceptGenHead = new WhiteTableExceptGenHead();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteTableExceptGenHead.setFoo...(value);
     * whiteTableExceptGenHead.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteTableExceptGenHead.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteTableExceptGenHead.set...;</span>
     * whiteTableExceptGenHeadBhv.<span style="color: #DD4747">insert</span>(whiteTableExceptGenHead);
     * ... = whiteTableExceptGenHead.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteTableExceptGenHead The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteTableExceptGenHead whiteTableExceptGenHead) {
        doInsert(whiteTableExceptGenHead, null);
    }

    protected void doInsert(WhiteTableExceptGenHead whiteTableExceptGenHead, InsertOption<WhiteTableExceptGenHeadCB> op) {
        assertObjectNotNull("whiteTableExceptGenHead", whiteTableExceptGenHead);
        prepareInsertOption(op);
        delegateInsert(whiteTableExceptGenHead, op);
    }

    protected void prepareInsertOption(InsertOption<WhiteTableExceptGenHeadCB> op) {
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
     * WhiteTableExceptGenHead whiteTableExceptGenHead = new WhiteTableExceptGenHead();
     * whiteTableExceptGenHead.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteTableExceptGenHead.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteTableExceptGenHead.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteTableExceptGenHead.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteTableExceptGenHead.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteTableExceptGenHeadBhv.<span style="color: #DD4747">update</span>(whiteTableExceptGenHead);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteTableExceptGenHead The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final WhiteTableExceptGenHead whiteTableExceptGenHead) {
        doUpdate(whiteTableExceptGenHead, null);
    }

    protected void doUpdate(WhiteTableExceptGenHead whiteTableExceptGenHead, final UpdateOption<WhiteTableExceptGenHeadCB> op) {
        assertObjectNotNull("whiteTableExceptGenHead", whiteTableExceptGenHead);
        prepareUpdateOption(op);
        helpUpdateInternally(whiteTableExceptGenHead, new InternalUpdateCallback<WhiteTableExceptGenHead>() {
            public int callbackDelegateUpdate(WhiteTableExceptGenHead et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhiteTableExceptGenHeadCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected WhiteTableExceptGenHeadCB createCBForVaryingUpdate() {
        WhiteTableExceptGenHeadCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected WhiteTableExceptGenHeadCB createCBForSpecifiedUpdate() {
        WhiteTableExceptGenHeadCB cb = newMyConditionBean();
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
     * @param whiteTableExceptGenHead The entity of insert or update target. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteTableExceptGenHead whiteTableExceptGenHead) {
        doInesrtOrUpdate(whiteTableExceptGenHead, null, null);
    }

    protected void doInesrtOrUpdate(WhiteTableExceptGenHead whiteTableExceptGenHead, final InsertOption<WhiteTableExceptGenHeadCB> iop, final UpdateOption<WhiteTableExceptGenHeadCB> uop) {
        helpInsertOrUpdateInternally(whiteTableExceptGenHead, new InternalInsertOrUpdateCallback<WhiteTableExceptGenHead, WhiteTableExceptGenHeadCB>() {
            public void callbackInsert(WhiteTableExceptGenHead et) { doInsert(et, iop); }
            public void callbackUpdate(WhiteTableExceptGenHead et) { doUpdate(et, uop); }
            public WhiteTableExceptGenHeadCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(WhiteTableExceptGenHeadCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<WhiteTableExceptGenHeadCB>();
            uop = uop != null ? uop : new UpdateOption<WhiteTableExceptGenHeadCB>();
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
     * WhiteTableExceptGenHead whiteTableExceptGenHead = new WhiteTableExceptGenHead();
     * whiteTableExceptGenHead.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteTableExceptGenHead.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteTableExceptGenHeadBhv.<span style="color: #DD4747">delete</span>(whiteTableExceptGenHead);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteTableExceptGenHead The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteTableExceptGenHead whiteTableExceptGenHead) {
        doDelete(whiteTableExceptGenHead, null);
    }

    protected void doDelete(WhiteTableExceptGenHead whiteTableExceptGenHead, final DeleteOption<WhiteTableExceptGenHeadCB> op) {
        assertObjectNotNull("whiteTableExceptGenHead", whiteTableExceptGenHead);
        prepareDeleteOption(op);
        helpDeleteInternally(whiteTableExceptGenHead, new InternalDeleteCallback<WhiteTableExceptGenHead>() {
            public int callbackDelegateDelete(WhiteTableExceptGenHead et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhiteTableExceptGenHeadCB> op) {
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
     *     WhiteTableExceptGenHead whiteTableExceptGenHead = new WhiteTableExceptGenHead();
     *     whiteTableExceptGenHead.setFooName("foo");
     *     if (...) {
     *         whiteTableExceptGenHead.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteTableExceptGenHeadList.add(whiteTableExceptGenHead);
     * }
     * whiteTableExceptGenHeadBhv.<span style="color: #DD4747">batchInsert</span>(whiteTableExceptGenHeadList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteTableExceptGenHeadList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteTableExceptGenHead> whiteTableExceptGenHeadList) {
        InsertOption<WhiteTableExceptGenHeadCB> op = createInsertUpdateOption();
        return doBatchInsert(whiteTableExceptGenHeadList, op);
    }

    protected int[] doBatchInsert(List<WhiteTableExceptGenHead> whiteTableExceptGenHeadList, InsertOption<WhiteTableExceptGenHeadCB> op) {
        assertObjectNotNull("whiteTableExceptGenHeadList", whiteTableExceptGenHeadList);
        prepareBatchInsertOption(whiteTableExceptGenHeadList, op);
        return delegateBatchInsert(whiteTableExceptGenHeadList, op);
    }

    protected void prepareBatchInsertOption(List<WhiteTableExceptGenHead> whiteTableExceptGenHeadList, InsertOption<WhiteTableExceptGenHeadCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(whiteTableExceptGenHeadList);
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
     *     WhiteTableExceptGenHead whiteTableExceptGenHead = new WhiteTableExceptGenHead();
     *     whiteTableExceptGenHead.setFooName("foo");
     *     if (...) {
     *         whiteTableExceptGenHead.setFooPrice(123);
     *     } else {
     *         whiteTableExceptGenHead.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteTableExceptGenHead.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteTableExceptGenHeadList.add(whiteTableExceptGenHead);
     * }
     * whiteTableExceptGenHeadBhv.<span style="color: #DD4747">batchUpdate</span>(whiteTableExceptGenHeadList);
     * </pre>
     * @param whiteTableExceptGenHeadList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteTableExceptGenHead> whiteTableExceptGenHeadList) {
        UpdateOption<WhiteTableExceptGenHeadCB> op = createPlainUpdateOption();
        return doBatchUpdate(whiteTableExceptGenHeadList, op);
    }

    protected int[] doBatchUpdate(List<WhiteTableExceptGenHead> whiteTableExceptGenHeadList, UpdateOption<WhiteTableExceptGenHeadCB> op) {
        assertObjectNotNull("whiteTableExceptGenHeadList", whiteTableExceptGenHeadList);
        prepareBatchUpdateOption(whiteTableExceptGenHeadList, op);
        return delegateBatchUpdate(whiteTableExceptGenHeadList, op);
    }

    protected void prepareBatchUpdateOption(List<WhiteTableExceptGenHead> whiteTableExceptGenHeadList, UpdateOption<WhiteTableExceptGenHeadCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(whiteTableExceptGenHeadList);
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
     * whiteTableExceptGenHeadBhv.<span style="color: #DD4747">batchUpdate</span>(whiteTableExceptGenHeadList, new SpecifyQuery<WhiteTableExceptGenHeadCB>() {
     *     public void specify(WhiteTableExceptGenHeadCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteTableExceptGenHeadBhv.<span style="color: #DD4747">batchUpdate</span>(whiteTableExceptGenHeadList, new SpecifyQuery<WhiteTableExceptGenHeadCB>() {
     *     public void specify(WhiteTableExceptGenHeadCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteTableExceptGenHeadList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteTableExceptGenHead> whiteTableExceptGenHeadList, SpecifyQuery<WhiteTableExceptGenHeadCB> updateColumnSpec) {
        return doBatchUpdate(whiteTableExceptGenHeadList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteTableExceptGenHeadList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteTableExceptGenHead> whiteTableExceptGenHeadList) {
        return doBatchDelete(whiteTableExceptGenHeadList, null);
    }

    protected int[] doBatchDelete(List<WhiteTableExceptGenHead> whiteTableExceptGenHeadList, DeleteOption<WhiteTableExceptGenHeadCB> op) {
        assertObjectNotNull("whiteTableExceptGenHeadList", whiteTableExceptGenHeadList);
        prepareDeleteOption(op);
        return delegateBatchDelete(whiteTableExceptGenHeadList, op);
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
     * whiteTableExceptGenHeadBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteTableExceptGenHead, WhiteTableExceptGenHeadCB&gt;() {
     *     public ConditionBean setup(whiteTableExceptGenHead entity, WhiteTableExceptGenHeadCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteTableExceptGenHead, WhiteTableExceptGenHeadCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteTableExceptGenHead, WhiteTableExceptGenHeadCB> sp, InsertOption<WhiteTableExceptGenHeadCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        WhiteTableExceptGenHead e = new WhiteTableExceptGenHead();
        WhiteTableExceptGenHeadCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected WhiteTableExceptGenHeadCB createCBForQueryInsert() {
        WhiteTableExceptGenHeadCB cb = newMyConditionBean();
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
     * WhiteTableExceptGenHead whiteTableExceptGenHead = new WhiteTableExceptGenHead();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteTableExceptGenHead.setPK...(value);</span>
     * whiteTableExceptGenHead.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteTableExceptGenHead.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteTableExceptGenHead.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteTableExceptGenHead.setVersionNo(value);</span>
     * WhiteTableExceptGenHeadCB cb = new WhiteTableExceptGenHeadCB();
     * cb.query().setFoo...(value);
     * whiteTableExceptGenHeadBhv.<span style="color: #DD4747">queryUpdate</span>(whiteTableExceptGenHead, cb);
     * </pre>
     * @param whiteTableExceptGenHead The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteTableExceptGenHead. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteTableExceptGenHead whiteTableExceptGenHead, WhiteTableExceptGenHeadCB cb) {
        return doQueryUpdate(whiteTableExceptGenHead, cb, null);
    }

    protected int doQueryUpdate(WhiteTableExceptGenHead whiteTableExceptGenHead, WhiteTableExceptGenHeadCB cb, UpdateOption<WhiteTableExceptGenHeadCB> op) {
        assertObjectNotNull("whiteTableExceptGenHead", whiteTableExceptGenHead); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(whiteTableExceptGenHead, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (WhiteTableExceptGenHeadCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (WhiteTableExceptGenHeadCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteTableExceptGenHeadCB cb = new WhiteTableExceptGenHeadCB();
     * cb.query().setFoo...(value);
     * whiteTableExceptGenHeadBhv.<span style="color: #DD4747">queryDelete</span>(whiteTableExceptGenHead, cb);
     * </pre>
     * @param cb The condition-bean of WhiteTableExceptGenHead. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteTableExceptGenHeadCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteTableExceptGenHeadCB cb, DeleteOption<WhiteTableExceptGenHeadCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((WhiteTableExceptGenHeadCB)cb); }
        else { return varyingQueryDelete((WhiteTableExceptGenHeadCB)cb, downcast(op)); }
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
     * WhiteTableExceptGenHead whiteTableExceptGenHead = new WhiteTableExceptGenHead();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteTableExceptGenHead.setFoo...(value);
     * whiteTableExceptGenHead.setBar...(value);
     * InsertOption<WhiteTableExceptGenHeadCB> option = new InsertOption<WhiteTableExceptGenHeadCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteTableExceptGenHeadBhv.<span style="color: #DD4747">varyingInsert</span>(whiteTableExceptGenHead, option);
     * ... = whiteTableExceptGenHead.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteTableExceptGenHead The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteTableExceptGenHead whiteTableExceptGenHead, InsertOption<WhiteTableExceptGenHeadCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteTableExceptGenHead, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteTableExceptGenHead whiteTableExceptGenHead = new WhiteTableExceptGenHead();
     * whiteTableExceptGenHead.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteTableExceptGenHead.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteTableExceptGenHead.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteTableExceptGenHeadCB&gt; option = new UpdateOption&lt;WhiteTableExceptGenHeadCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteTableExceptGenHeadCB&gt;() {
     *         public void specify(WhiteTableExceptGenHeadCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteTableExceptGenHeadBhv.<span style="color: #DD4747">varyingUpdate</span>(whiteTableExceptGenHead, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteTableExceptGenHead The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteTableExceptGenHead whiteTableExceptGenHead, UpdateOption<WhiteTableExceptGenHeadCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteTableExceptGenHead, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteTableExceptGenHead The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteTableExceptGenHead whiteTableExceptGenHead, InsertOption<WhiteTableExceptGenHeadCB> insertOption, UpdateOption<WhiteTableExceptGenHeadCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(whiteTableExceptGenHead, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteTableExceptGenHead The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteTableExceptGenHead whiteTableExceptGenHead, DeleteOption<WhiteTableExceptGenHeadCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteTableExceptGenHead, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteTableExceptGenHeadList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteTableExceptGenHead> whiteTableExceptGenHeadList, InsertOption<WhiteTableExceptGenHeadCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteTableExceptGenHeadList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteTableExceptGenHeadList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteTableExceptGenHead> whiteTableExceptGenHeadList, UpdateOption<WhiteTableExceptGenHeadCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteTableExceptGenHeadList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteTableExceptGenHeadList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteTableExceptGenHead> whiteTableExceptGenHeadList, DeleteOption<WhiteTableExceptGenHeadCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteTableExceptGenHeadList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteTableExceptGenHead, WhiteTableExceptGenHeadCB> setupper, InsertOption<WhiteTableExceptGenHeadCB> option) {
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
     * WhiteTableExceptGenHead whiteTableExceptGenHead = new WhiteTableExceptGenHead();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteTableExceptGenHead.setPK...(value);</span>
     * whiteTableExceptGenHead.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteTableExceptGenHead.setVersionNo(value);</span>
     * WhiteTableExceptGenHeadCB cb = new WhiteTableExceptGenHeadCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteTableExceptGenHeadCB&gt; option = new UpdateOption&lt;WhiteTableExceptGenHeadCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteTableExceptGenHeadCB&gt;() {
     *     public void specify(WhiteTableExceptGenHeadCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteTableExceptGenHeadBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteTableExceptGenHead, cb, option);
     * </pre>
     * @param whiteTableExceptGenHead The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteTableExceptGenHead. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteTableExceptGenHead whiteTableExceptGenHead, WhiteTableExceptGenHeadCB cb, UpdateOption<WhiteTableExceptGenHeadCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteTableExceptGenHead, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteTableExceptGenHead. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteTableExceptGenHeadCB cb, DeleteOption<WhiteTableExceptGenHeadCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteTableExceptGenHeadBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhiteTableExceptGenHeadCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhiteTableExceptGenHeadCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhiteTableExceptGenHead> void delegateSelectCursor(WhiteTableExceptGenHeadCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends WhiteTableExceptGenHead> List<ENTITY> delegateSelectList(WhiteTableExceptGenHeadCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhiteTableExceptGenHead et, InsertOption<WhiteTableExceptGenHeadCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(WhiteTableExceptGenHead et, UpdateOption<WhiteTableExceptGenHeadCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(WhiteTableExceptGenHead et, UpdateOption<WhiteTableExceptGenHeadCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(WhiteTableExceptGenHead et, DeleteOption<WhiteTableExceptGenHeadCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(WhiteTableExceptGenHead et, DeleteOption<WhiteTableExceptGenHeadCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<WhiteTableExceptGenHead> ls, InsertOption<WhiteTableExceptGenHeadCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhiteTableExceptGenHead> ls, UpdateOption<WhiteTableExceptGenHeadCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhiteTableExceptGenHead> ls, UpdateOption<WhiteTableExceptGenHeadCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhiteTableExceptGenHead> ls, DeleteOption<WhiteTableExceptGenHeadCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhiteTableExceptGenHead> ls, DeleteOption<WhiteTableExceptGenHeadCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhiteTableExceptGenHead et, WhiteTableExceptGenHeadCB inCB, ConditionBean resCB, InsertOption<WhiteTableExceptGenHeadCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhiteTableExceptGenHead et, WhiteTableExceptGenHeadCB cb, UpdateOption<WhiteTableExceptGenHeadCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(WhiteTableExceptGenHeadCB cb, DeleteOption<WhiteTableExceptGenHeadCB> op)
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
    protected WhiteTableExceptGenHead downcast(Entity et) {
        return helpEntityDowncastInternally(et, WhiteTableExceptGenHead.class);
    }

    protected WhiteTableExceptGenHeadCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, WhiteTableExceptGenHeadCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<WhiteTableExceptGenHead> downcast(List<? extends Entity> ls) {
        return (List<WhiteTableExceptGenHead>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteTableExceptGenHeadCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<WhiteTableExceptGenHeadCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteTableExceptGenHeadCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<WhiteTableExceptGenHeadCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteTableExceptGenHeadCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<WhiteTableExceptGenHeadCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteTableExceptGenHead, WhiteTableExceptGenHeadCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<WhiteTableExceptGenHead, WhiteTableExceptGenHeadCB>)sp;
    }
}
