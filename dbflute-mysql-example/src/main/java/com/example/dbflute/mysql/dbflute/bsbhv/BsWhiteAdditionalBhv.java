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
 * The behavior of (WXADD)WHITE_ADDITIONAL as TABLE. <br />
 * <pre>
 * [primary key]
 *     foo_id
 * 
 * [column]
 *     foo_id, foo_name, foo_date, register_datetime
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     foo_id
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
public abstract class BsWhiteAdditionalBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_additional"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return WhiteAdditionalDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteAdditionalDbm getMyDBMeta() { return WhiteAdditionalDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteAdditional newMyEntity() { return new WhiteAdditional(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteAdditionalCB newMyConditionBean() { return new WhiteAdditionalCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteAdditionalCB cb = new WhiteAdditionalCB();
     * cb.query().setFoo...(value);
     * int count = whiteAdditionalBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteAdditional. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteAdditionalCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteAdditionalCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteAdditionalCB cb) { // called by selectPage(cb)
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
     * WhiteAdditionalCB cb = new WhiteAdditionalCB();
     * cb.query().setFoo...(value);
     * WhiteAdditional whiteAdditional = whiteAdditionalBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (whiteAdditional != null) {
     *     ... = whiteAdditional.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteAdditional. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteAdditional selectEntity(WhiteAdditionalCB cb) {
        return doSelectEntity(cb, WhiteAdditional.class);
    }

    protected <ENTITY extends WhiteAdditional> ENTITY doSelectEntity(final WhiteAdditionalCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, entityType, new InternalSelectEntityCallback<ENTITY, WhiteAdditionalCB>() {
            public List<ENTITY> callbackSelectList(WhiteAdditionalCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * WhiteAdditionalCB cb = new WhiteAdditionalCB();
     * cb.query().setFoo...(value);
     * WhiteAdditional whiteAdditional = whiteAdditionalBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteAdditional.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteAdditional. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteAdditional selectEntityWithDeletedCheck(WhiteAdditionalCB cb) {
        return doSelectEntityWithDeletedCheck(cb, WhiteAdditional.class);
    }

    protected <ENTITY extends WhiteAdditional> ENTITY doSelectEntityWithDeletedCheck(final WhiteAdditionalCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, entityType, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteAdditionalCB>() {
            public List<ENTITY> callbackSelectList(WhiteAdditionalCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param fooId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteAdditional selectByPKValue(Integer fooId) {
        return doSelectByPKValue(fooId, WhiteAdditional.class);
    }

    protected <ENTITY extends WhiteAdditional> ENTITY doSelectByPKValue(Integer fooId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(fooId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param fooId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteAdditional selectByPKValueWithDeletedCheck(Integer fooId) {
        return doSelectByPKValueWithDeletedCheck(fooId, WhiteAdditional.class);
    }

    protected <ENTITY extends WhiteAdditional> ENTITY doSelectByPKValueWithDeletedCheck(Integer fooId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(fooId), entityType);
    }

    private WhiteAdditionalCB buildPKCB(Integer fooId) {
        assertObjectNotNull("fooId", fooId);
        WhiteAdditionalCB cb = newMyConditionBean();
        cb.query().setFooId_Equal(fooId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteAdditionalCB cb = new WhiteAdditionalCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteAdditional&gt; whiteAdditionalList = whiteAdditionalBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (WhiteAdditional whiteAdditional : whiteAdditionalList) {
     *     ... = whiteAdditional.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteAdditional. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteAdditional> selectList(WhiteAdditionalCB cb) {
        return doSelectList(cb, WhiteAdditional.class);
    }

    protected <ENTITY extends WhiteAdditional> ListResultBean<ENTITY> doSelectList(WhiteAdditionalCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, WhiteAdditionalCB>() {
            public List<ENTITY> callbackSelectList(WhiteAdditionalCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * WhiteAdditionalCB cb = new WhiteAdditionalCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteAdditional&gt; page = whiteAdditionalBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteAdditional whiteAdditional : page) {
     *     ... = whiteAdditional.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteAdditional. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteAdditional> selectPage(WhiteAdditionalCB cb) {
        return doSelectPage(cb, WhiteAdditional.class);
    }

    protected <ENTITY extends WhiteAdditional> PagingResultBean<ENTITY> doSelectPage(WhiteAdditionalCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, WhiteAdditionalCB>() {
            public int callbackSelectCount(WhiteAdditionalCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteAdditionalCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * WhiteAdditionalCB cb = new WhiteAdditionalCB();
     * cb.query().setFoo...(value);
     * whiteAdditionalBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteAdditional&gt;() {
     *     public void handle(WhiteAdditional entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteAdditional. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteAdditional. (NotNull)
     */
    public void selectCursor(WhiteAdditionalCB cb, EntityRowHandler<WhiteAdditional> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, WhiteAdditional.class);
    }

    protected <ENTITY extends WhiteAdditional> void doSelectCursor(WhiteAdditionalCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<WhiteAdditional>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        helpSelectCursorInternally(cb, entityRowHandler, entityType, new InternalSelectCursorCallback<ENTITY, WhiteAdditionalCB>() {
            public void callbackSelectCursor(WhiteAdditionalCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) { delegateSelectCursor(cb, entityRowHandler, entityType); }
            public List<ENTITY> callbackSelectList(WhiteAdditionalCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteAdditionalBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteAdditionalCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (NullAllowed)
     */
    public <RESULT> SLFunction<WhiteAdditionalCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends WhiteAdditionalCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
        assertObjectNotNull("resultType", resultType); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return new SLFunction<CB, RESULT>(cb, resultType);
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
     * Extract the value list of (single) primary key fooId.
     * @param whiteAdditionalList The list of whiteAdditional. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractFooIdList(List<WhiteAdditional> whiteAdditionalList) {
        return helpExtractListInternally(whiteAdditionalList, new InternalExtractCallback<WhiteAdditional, Integer>() {
            public Integer getCV(WhiteAdditional e) { return e.getFooId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteAdditional whiteAdditional = new WhiteAdditional();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteAdditional.setFoo...(value);
     * whiteAdditional.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteAdditional.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteAdditional.set...;</span>
     * whiteAdditionalBhv.<span style="color: #FD4747">insert</span>(whiteAdditional);
     * ... = whiteAdditional.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteAdditional The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteAdditional whiteAdditional) {
        doInsert(whiteAdditional, null);
    }

    protected void doInsert(WhiteAdditional whiteAdditional, InsertOption<WhiteAdditionalCB> option) {
        assertObjectNotNull("whiteAdditional", whiteAdditional);
        prepareInsertOption(option);
        delegateInsert(whiteAdditional, option);
    }

    protected void prepareInsertOption(InsertOption<WhiteAdditionalCB> option) {
        if (option == null) { return; }
        assertInsertOptionStatus(option);
        if (option.hasSpecifiedInsertColumn()) {
            option.resolveInsertColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    @Override
    protected void doCreate(Entity entity, InsertOption<? extends ConditionBean> option) {
        if (option == null) { insert(downcast(entity)); }
        else { varyingInsert(downcast(entity), downcast(option)); }
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteAdditional whiteAdditional = new WhiteAdditional();
     * whiteAdditional.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteAdditional.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteAdditional.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteAdditional.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteAdditional.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteAdditionalBhv.<span style="color: #FD4747">update</span>(whiteAdditional);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param whiteAdditional The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final WhiteAdditional whiteAdditional) {
        doUpdate(whiteAdditional, null);
    }

    protected void doUpdate(WhiteAdditional whiteAdditional, final UpdateOption<WhiteAdditionalCB> option) {
        assertObjectNotNull("whiteAdditional", whiteAdditional);
        prepareUpdateOption(option);
        helpUpdateInternally(whiteAdditional, new InternalUpdateCallback<WhiteAdditional>() {
            public int callbackDelegateUpdate(WhiteAdditional entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhiteAdditionalCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected WhiteAdditionalCB createCBForVaryingUpdate() {
        WhiteAdditionalCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected WhiteAdditionalCB createCBForSpecifiedUpdate() {
        WhiteAdditionalCB cb = newMyConditionBean();
        cb.xsetupForSpecifiedUpdate();
        return cb;
    }

    @Override
    protected void doModify(Entity entity, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { update(downcast(entity)); }
        else { varyingUpdate(downcast(entity), downcast(option)); }
    }

    @Override
    protected void doModifyNonstrict(Entity entity, UpdateOption<? extends ConditionBean> option) {
        doModify(entity, option);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #FD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param whiteAdditional The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteAdditional whiteAdditional) {
        doInesrtOrUpdate(whiteAdditional, null, null);
    }

    protected void doInesrtOrUpdate(WhiteAdditional whiteAdditional, final InsertOption<WhiteAdditionalCB> insertOption, final UpdateOption<WhiteAdditionalCB> updateOption) {
        helpInsertOrUpdateInternally(whiteAdditional, new InternalInsertOrUpdateCallback<WhiteAdditional, WhiteAdditionalCB>() {
            public void callbackInsert(WhiteAdditional entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(WhiteAdditional entity) { doUpdate(entity, updateOption); }
            public WhiteAdditionalCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(WhiteAdditionalCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<WhiteAdditionalCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<WhiteAdditionalCB>() : updateOption;
            varyingInsertOrUpdate(downcast(entity), downcast(insertOption), downcast(updateOption));
        }
    }

    @Override
    protected void doCreateOrModifyNonstrict(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        doCreateOrModify(entity, insertOption, updateOption);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteAdditional whiteAdditional = new WhiteAdditional();
     * whiteAdditional.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteAdditional.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteAdditionalBhv.<span style="color: #FD4747">delete</span>(whiteAdditional);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param whiteAdditional The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteAdditional whiteAdditional) {
        doDelete(whiteAdditional, null);
    }

    protected void doDelete(WhiteAdditional whiteAdditional, final DeleteOption<WhiteAdditionalCB> option) {
        assertObjectNotNull("whiteAdditional", whiteAdditional);
        prepareDeleteOption(option);
        helpDeleteInternally(whiteAdditional, new InternalDeleteCallback<WhiteAdditional>() {
            public int callbackDelegateDelete(WhiteAdditional entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhiteAdditionalCB> option) {
        if (option == null) { return; }
        assertDeleteOptionStatus(option);
    }

    @Override
    protected void doRemove(Entity entity, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { delete(downcast(entity)); }
        else { varyingDelete(downcast(entity), downcast(option)); }
    }

    @Override
    protected void doRemoveNonstrict(Entity entity, DeleteOption<? extends ConditionBean> option) {
        doRemove(entity, option);
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
     *     WhiteAdditional whiteAdditional = new WhiteAdditional();
     *     whiteAdditional.setFooName("foo");
     *     if (...) {
     *         whiteAdditional.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteAdditionalList.add(whiteAdditional);
     * }
     * whiteAdditionalBhv.<span style="color: #FD4747">batchInsert</span>(whiteAdditionalList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteAdditionalList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteAdditional> whiteAdditionalList) {
        InsertOption<WhiteAdditionalCB> option = createInsertUpdateOption();
        return doBatchInsert(whiteAdditionalList, option);
    }

    protected int[] doBatchInsert(List<WhiteAdditional> whiteAdditionalList, InsertOption<WhiteAdditionalCB> option) {
        assertObjectNotNull("whiteAdditionalList", whiteAdditionalList);
        prepareBatchInsertOption(whiteAdditionalList, option);
        return delegateBatchInsert(whiteAdditionalList, option);
    }

    protected void prepareBatchInsertOption(List<WhiteAdditional> whiteAdditionalList, InsertOption<WhiteAdditionalCB> option) {
        option.xallowInsertColumnModifiedPropertiesFragmented();
        option.xacceptInsertColumnModifiedPropertiesIfNeeds(whiteAdditionalList);
        prepareInsertOption(option);
    }

    @Override
    protected int[] doLumpCreate(List<Entity> ls, InsertOption<? extends ConditionBean> option) {
        if (option == null) { return batchInsert(downcast(ls)); }
        else { return varyingBatchInsert(downcast(ls), downcast(option)); }
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #FD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhiteAdditional whiteAdditional = new WhiteAdditional();
     *     whiteAdditional.setFooName("foo");
     *     if (...) {
     *         whiteAdditional.setFooPrice(123);
     *     } else {
     *         whiteAdditional.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteAdditional.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteAdditionalList.add(whiteAdditional);
     * }
     * whiteAdditionalBhv.<span style="color: #FD4747">batchUpdate</span>(whiteAdditionalList);
     * </pre>
     * @param whiteAdditionalList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteAdditional> whiteAdditionalList) {
        UpdateOption<WhiteAdditionalCB> option = createPlainUpdateOption();
        return doBatchUpdate(whiteAdditionalList, option);
    }

    protected int[] doBatchUpdate(List<WhiteAdditional> whiteAdditionalList, UpdateOption<WhiteAdditionalCB> option) {
        assertObjectNotNull("whiteAdditionalList", whiteAdditionalList);
        prepareBatchUpdateOption(whiteAdditionalList, option);
        return delegateBatchUpdate(whiteAdditionalList, option);
    }

    protected void prepareBatchUpdateOption(List<WhiteAdditional> whiteAdditionalList, UpdateOption<WhiteAdditionalCB> option) {
        option.xacceptUpdateColumnModifiedPropertiesIfNeeds(whiteAdditionalList);
        prepareUpdateOption(option);
    }

    @Override
    protected int[] doLumpModify(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return batchUpdate(downcast(ls)); }
        else { return varyingBatchUpdate(downcast(ls), downcast(option)); }
    }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span> 
     * whiteAdditionalBhv.<span style="color: #FD4747">batchUpdate</span>(whiteAdditionalList, new SpecifyQuery<WhiteAdditionalCB>() {
     *     public void specify(WhiteAdditionalCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span> 
     * whiteAdditionalBhv.<span style="color: #FD4747">batchUpdate</span>(whiteAdditionalList, new SpecifyQuery<WhiteAdditionalCB>() {
     *     public void specify(WhiteAdditionalCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteAdditionalList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteAdditional> whiteAdditionalList, SpecifyQuery<WhiteAdditionalCB> updateColumnSpec) {
        return doBatchUpdate(whiteAdditionalList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        return doLumpModify(ls, option);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteAdditionalList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteAdditional> whiteAdditionalList) {
        return doBatchDelete(whiteAdditionalList, null);
    }

    protected int[] doBatchDelete(List<WhiteAdditional> whiteAdditionalList, DeleteOption<WhiteAdditionalCB> option) {
        assertObjectNotNull("whiteAdditionalList", whiteAdditionalList);
        prepareDeleteOption(option);
        return delegateBatchDelete(whiteAdditionalList, option);
    }

    @Override
    protected int[] doLumpRemove(List<Entity> ls, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return batchDelete(downcast(ls)); }
        else { return varyingBatchDelete(downcast(ls), downcast(option)); }
    }

    @Override
    protected int[] doLumpRemoveNonstrict(List<Entity> ls, DeleteOption<? extends ConditionBean> option) {
        return doLumpRemove(ls, option);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * whiteAdditionalBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteAdditional, WhiteAdditionalCB&gt;() {
     *     public ConditionBean setup(whiteAdditional entity, WhiteAdditionalCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteAdditional, WhiteAdditionalCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteAdditional, WhiteAdditionalCB> setupper, InsertOption<WhiteAdditionalCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        WhiteAdditional entity = new WhiteAdditional();
        WhiteAdditionalCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected WhiteAdditionalCB createCBForQueryInsert() {
        WhiteAdditionalCB cb = newMyConditionBean();
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
     * WhiteAdditional whiteAdditional = new WhiteAdditional();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteAdditional.setPK...(value);</span>
     * whiteAdditional.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteAdditional.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteAdditional.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteAdditional.setVersionNo(value);</span>
     * WhiteAdditionalCB cb = new WhiteAdditionalCB();
     * cb.query().setFoo...(value);
     * whiteAdditionalBhv.<span style="color: #FD4747">queryUpdate</span>(whiteAdditional, cb);
     * </pre>
     * @param whiteAdditional The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteAdditional. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteAdditional whiteAdditional, WhiteAdditionalCB cb) {
        return doQueryUpdate(whiteAdditional, cb, null);
    }

    protected int doQueryUpdate(WhiteAdditional whiteAdditional, WhiteAdditionalCB cb, UpdateOption<WhiteAdditionalCB> option) {
        assertObjectNotNull("whiteAdditional", whiteAdditional); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(whiteAdditional, cb, option) : 0;
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (WhiteAdditionalCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (WhiteAdditionalCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteAdditionalCB cb = new WhiteAdditionalCB();
     * cb.query().setFoo...(value);
     * whiteAdditionalBhv.<span style="color: #FD4747">queryDelete</span>(whiteAdditional, cb);
     * </pre>
     * @param cb The condition-bean of WhiteAdditional. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteAdditionalCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteAdditionalCB cb, DeleteOption<WhiteAdditionalCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, option) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((WhiteAdditionalCB)cb); }
        else { return varyingQueryDelete((WhiteAdditionalCB)cb, downcast(option)); }
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
     * WhiteAdditional whiteAdditional = new WhiteAdditional();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteAdditional.setFoo...(value);
     * whiteAdditional.setBar...(value);
     * InsertOption<WhiteAdditionalCB> option = new InsertOption<WhiteAdditionalCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteAdditionalBhv.<span style="color: #FD4747">varyingInsert</span>(whiteAdditional, option);
     * ... = whiteAdditional.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteAdditional The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteAdditional whiteAdditional, InsertOption<WhiteAdditionalCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteAdditional, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteAdditional whiteAdditional = new WhiteAdditional();
     * whiteAdditional.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteAdditional.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteAdditional.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteAdditionalCB&gt; option = new UpdateOption&lt;WhiteAdditionalCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteAdditionalCB&gt;() {
     *         public void specify(WhiteAdditionalCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteAdditionalBhv.<span style="color: #FD4747">varyingUpdate</span>(whiteAdditional, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteAdditional The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteAdditional whiteAdditional, UpdateOption<WhiteAdditionalCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteAdditional, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteAdditional The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteAdditional whiteAdditional, InsertOption<WhiteAdditionalCB> insertOption, UpdateOption<WhiteAdditionalCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(whiteAdditional, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteAdditional The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteAdditional whiteAdditional, DeleteOption<WhiteAdditionalCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteAdditional, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteAdditionalList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteAdditional> whiteAdditionalList, InsertOption<WhiteAdditionalCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteAdditionalList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteAdditionalList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteAdditional> whiteAdditionalList, UpdateOption<WhiteAdditionalCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteAdditionalList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteAdditionalList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteAdditional> whiteAdditionalList, DeleteOption<WhiteAdditionalCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteAdditionalList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteAdditional, WhiteAdditionalCB> setupper, InsertOption<WhiteAdditionalCB> option) {
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
     * WhiteAdditional whiteAdditional = new WhiteAdditional();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteAdditional.setPK...(value);</span>
     * whiteAdditional.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteAdditional.setVersionNo(value);</span>
     * WhiteAdditionalCB cb = new WhiteAdditionalCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteAdditionalCB&gt; option = new UpdateOption&lt;WhiteAdditionalCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteAdditionalCB&gt;() {
     *     public void specify(WhiteAdditionalCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteAdditionalBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(whiteAdditional, cb, option);
     * </pre>
     * @param whiteAdditional The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteAdditional. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteAdditional whiteAdditional, WhiteAdditionalCB cb, UpdateOption<WhiteAdditionalCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteAdditional, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteAdditional. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteAdditionalCB cb, DeleteOption<WhiteAdditionalCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteAdditionalBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhiteAdditionalCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhiteAdditionalCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhiteAdditional> void delegateSelectCursor(WhiteAdditionalCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends WhiteAdditional> List<ENTITY> delegateSelectList(WhiteAdditionalCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhiteAdditional e, InsertOption<WhiteAdditionalCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(WhiteAdditional e, UpdateOption<WhiteAdditionalCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return delegateUpdateNonstrict(e, op); }
    protected int delegateUpdateNonstrict(WhiteAdditional e, UpdateOption<WhiteAdditionalCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(WhiteAdditional e, DeleteOption<WhiteAdditionalCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return delegateDeleteNonstrict(e, op); }
    protected int delegateDeleteNonstrict(WhiteAdditional e, DeleteOption<WhiteAdditionalCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<WhiteAdditional> ls, InsertOption<WhiteAdditionalCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhiteAdditional> ls, UpdateOption<WhiteAdditionalCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhiteAdditional> ls, UpdateOption<WhiteAdditionalCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhiteAdditional> ls, DeleteOption<WhiteAdditionalCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhiteAdditional> ls, DeleteOption<WhiteAdditionalCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhiteAdditional e, WhiteAdditionalCB inCB, ConditionBean resCB, InsertOption<WhiteAdditionalCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhiteAdditional e, WhiteAdditionalCB cb, UpdateOption<WhiteAdditionalCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(WhiteAdditionalCB cb, DeleteOption<WhiteAdditionalCB> op)
    { if (!processBeforeQueryDelete(cb, op)) { return 0; } return invoke(createQueryDeleteCBCommand(cb, op));  }

    // ===================================================================================
    //                                                                Optimistic Lock Info
    //                                                                ====================
    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean hasVersionNoValue(Entity entity) {
        return false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean hasUpdateDateValue(Entity entity) {
        return false;
    }

    // ===================================================================================
    //                                                                     Downcast Helper
    //                                                                     ===============
    protected WhiteAdditional downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, WhiteAdditional.class);
    }

    protected WhiteAdditionalCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, WhiteAdditionalCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<WhiteAdditional> downcast(List<? extends Entity> entityList) {
        return (List<WhiteAdditional>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteAdditionalCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<WhiteAdditionalCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteAdditionalCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<WhiteAdditionalCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteAdditionalCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<WhiteAdditionalCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteAdditional, WhiteAdditionalCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<WhiteAdditional, WhiteAdditionalCB>)option;
    }
}
