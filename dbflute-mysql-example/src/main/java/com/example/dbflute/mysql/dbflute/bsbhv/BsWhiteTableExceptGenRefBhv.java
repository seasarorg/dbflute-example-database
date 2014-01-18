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
 * The behavior of WHITE_TABLE_EXCEPT_GEN_REF as TABLE. <br />
 * <pre>
 * [primary key]
 *     GEN_REF_ID
 *
 * [column]
 *     GEN_REF_ID, GEN_REF_NAME, GEN_ONLY_ID
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
public abstract class BsWhiteTableExceptGenRefBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_table_except_gen_ref"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return WhiteTableExceptGenRefDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteTableExceptGenRefDbm getMyDBMeta() { return WhiteTableExceptGenRefDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteTableExceptGenRef newMyEntity() { return new WhiteTableExceptGenRef(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteTableExceptGenRefCB newMyConditionBean() { return new WhiteTableExceptGenRefCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteTableExceptGenRefCB cb = new WhiteTableExceptGenRefCB();
     * cb.query().setFoo...(value);
     * int count = whiteTableExceptGenRefBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteTableExceptGenRef. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteTableExceptGenRefCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteTableExceptGenRefCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteTableExceptGenRefCB cb) { // called by selectPage(cb)
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
     * WhiteTableExceptGenRefCB cb = new WhiteTableExceptGenRefCB();
     * cb.query().setFoo...(value);
     * WhiteTableExceptGenRef whiteTableExceptGenRef = whiteTableExceptGenRefBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (whiteTableExceptGenRef != null) {
     *     ... = whiteTableExceptGenRef.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteTableExceptGenRef. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteTableExceptGenRef selectEntity(WhiteTableExceptGenRefCB cb) {
        return doSelectEntity(cb, WhiteTableExceptGenRef.class);
    }

    protected <ENTITY extends WhiteTableExceptGenRef> ENTITY doSelectEntity(final WhiteTableExceptGenRefCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, entityType, new InternalSelectEntityCallback<ENTITY, WhiteTableExceptGenRefCB>() {
            public List<ENTITY> callbackSelectList(WhiteTableExceptGenRefCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * WhiteTableExceptGenRefCB cb = new WhiteTableExceptGenRefCB();
     * cb.query().setFoo...(value);
     * WhiteTableExceptGenRef whiteTableExceptGenRef = whiteTableExceptGenRefBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteTableExceptGenRef.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteTableExceptGenRef. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteTableExceptGenRef selectEntityWithDeletedCheck(WhiteTableExceptGenRefCB cb) {
        return doSelectEntityWithDeletedCheck(cb, WhiteTableExceptGenRef.class);
    }

    protected <ENTITY extends WhiteTableExceptGenRef> ENTITY doSelectEntityWithDeletedCheck(final WhiteTableExceptGenRefCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, entityType, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteTableExceptGenRefCB>() {
            public List<ENTITY> callbackSelectList(WhiteTableExceptGenRefCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param genRefId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteTableExceptGenRef selectByPKValue(Long genRefId) {
        return doSelectByPKValue(genRefId, WhiteTableExceptGenRef.class);
    }

    protected <ENTITY extends WhiteTableExceptGenRef> ENTITY doSelectByPKValue(Long genRefId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(genRefId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param genRefId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteTableExceptGenRef selectByPKValueWithDeletedCheck(Long genRefId) {
        return doSelectByPKValueWithDeletedCheck(genRefId, WhiteTableExceptGenRef.class);
    }

    protected <ENTITY extends WhiteTableExceptGenRef> ENTITY doSelectByPKValueWithDeletedCheck(Long genRefId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(genRefId), entityType);
    }

    private WhiteTableExceptGenRefCB buildPKCB(Long genRefId) {
        assertObjectNotNull("genRefId", genRefId);
        WhiteTableExceptGenRefCB cb = newMyConditionBean();
        cb.query().setGenRefId_Equal(genRefId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteTableExceptGenRefCB cb = new WhiteTableExceptGenRefCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteTableExceptGenRef&gt; whiteTableExceptGenRefList = whiteTableExceptGenRefBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (WhiteTableExceptGenRef whiteTableExceptGenRef : whiteTableExceptGenRefList) {
     *     ... = whiteTableExceptGenRef.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteTableExceptGenRef. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteTableExceptGenRef> selectList(WhiteTableExceptGenRefCB cb) {
        return doSelectList(cb, WhiteTableExceptGenRef.class);
    }

    protected <ENTITY extends WhiteTableExceptGenRef> ListResultBean<ENTITY> doSelectList(WhiteTableExceptGenRefCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, WhiteTableExceptGenRefCB>() {
            public List<ENTITY> callbackSelectList(WhiteTableExceptGenRefCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * WhiteTableExceptGenRefCB cb = new WhiteTableExceptGenRefCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteTableExceptGenRef&gt; page = whiteTableExceptGenRefBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteTableExceptGenRef whiteTableExceptGenRef : page) {
     *     ... = whiteTableExceptGenRef.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteTableExceptGenRef. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteTableExceptGenRef> selectPage(WhiteTableExceptGenRefCB cb) {
        return doSelectPage(cb, WhiteTableExceptGenRef.class);
    }

    protected <ENTITY extends WhiteTableExceptGenRef> PagingResultBean<ENTITY> doSelectPage(WhiteTableExceptGenRefCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, WhiteTableExceptGenRefCB>() {
            public int callbackSelectCount(WhiteTableExceptGenRefCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteTableExceptGenRefCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * WhiteTableExceptGenRefCB cb = new WhiteTableExceptGenRefCB();
     * cb.query().setFoo...(value);
     * whiteTableExceptGenRefBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteTableExceptGenRef&gt;() {
     *     public void handle(WhiteTableExceptGenRef entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteTableExceptGenRef. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteTableExceptGenRef. (NotNull)
     */
    public void selectCursor(WhiteTableExceptGenRefCB cb, EntityRowHandler<WhiteTableExceptGenRef> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, WhiteTableExceptGenRef.class);
    }

    protected <ENTITY extends WhiteTableExceptGenRef> void doSelectCursor(WhiteTableExceptGenRefCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<WhiteTableExceptGenRef>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        helpSelectCursorInternally(cb, entityRowHandler, entityType, new InternalSelectCursorCallback<ENTITY, WhiteTableExceptGenRefCB>() {
            public void callbackSelectCursor(WhiteTableExceptGenRefCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) { delegateSelectCursor(cb, entityRowHandler, entityType); }
            public List<ENTITY> callbackSelectList(WhiteTableExceptGenRefCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteTableExceptGenRefBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteTableExceptGenRefCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<WhiteTableExceptGenRefCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends WhiteTableExceptGenRefCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
        assertObjectNotNull("resultType", resultType); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, resultType);
    }

    protected <RESULT, CB extends WhiteTableExceptGenRefCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> resultType) {
        return new SLFunction<CB, RESULT>(cb, resultType);
    }

    protected <RESULT> SLFunction<? extends ConditionBean, RESULT> doReadScalar(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
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
     * Extract the value list of (single) primary key genRefId.
     * @param whiteTableExceptGenRefList The list of whiteTableExceptGenRef. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractGenRefIdList(List<WhiteTableExceptGenRef> whiteTableExceptGenRefList) {
        return helpExtractListInternally(whiteTableExceptGenRefList, new InternalExtractCallback<WhiteTableExceptGenRef, Long>() {
            public Long getCV(WhiteTableExceptGenRef e) { return e.getGenRefId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteTableExceptGenRef whiteTableExceptGenRef = new WhiteTableExceptGenRef();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteTableExceptGenRef.setFoo...(value);
     * whiteTableExceptGenRef.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteTableExceptGenRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteTableExceptGenRef.set...;</span>
     * whiteTableExceptGenRefBhv.<span style="color: #FD4747">insert</span>(whiteTableExceptGenRef);
     * ... = whiteTableExceptGenRef.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteTableExceptGenRef The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteTableExceptGenRef whiteTableExceptGenRef) {
        doInsert(whiteTableExceptGenRef, null);
    }

    protected void doInsert(WhiteTableExceptGenRef whiteTableExceptGenRef, InsertOption<WhiteTableExceptGenRefCB> option) {
        assertObjectNotNull("whiteTableExceptGenRef", whiteTableExceptGenRef);
        prepareInsertOption(option);
        delegateInsert(whiteTableExceptGenRef, option);
    }

    protected void prepareInsertOption(InsertOption<WhiteTableExceptGenRefCB> option) {
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
     * WhiteTableExceptGenRef whiteTableExceptGenRef = new WhiteTableExceptGenRef();
     * whiteTableExceptGenRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteTableExceptGenRef.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteTableExceptGenRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteTableExceptGenRef.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteTableExceptGenRef.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteTableExceptGenRefBhv.<span style="color: #FD4747">update</span>(whiteTableExceptGenRef);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteTableExceptGenRef The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final WhiteTableExceptGenRef whiteTableExceptGenRef) {
        doUpdate(whiteTableExceptGenRef, null);
    }

    protected void doUpdate(WhiteTableExceptGenRef whiteTableExceptGenRef, final UpdateOption<WhiteTableExceptGenRefCB> option) {
        assertObjectNotNull("whiteTableExceptGenRef", whiteTableExceptGenRef);
        prepareUpdateOption(option);
        helpUpdateInternally(whiteTableExceptGenRef, new InternalUpdateCallback<WhiteTableExceptGenRef>() {
            public int callbackDelegateUpdate(WhiteTableExceptGenRef entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhiteTableExceptGenRefCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected WhiteTableExceptGenRefCB createCBForVaryingUpdate() {
        WhiteTableExceptGenRefCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected WhiteTableExceptGenRefCB createCBForSpecifiedUpdate() {
        WhiteTableExceptGenRefCB cb = newMyConditionBean();
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
     * @param whiteTableExceptGenRef The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteTableExceptGenRef whiteTableExceptGenRef) {
        doInesrtOrUpdate(whiteTableExceptGenRef, null, null);
    }

    protected void doInesrtOrUpdate(WhiteTableExceptGenRef whiteTableExceptGenRef, final InsertOption<WhiteTableExceptGenRefCB> insertOption, final UpdateOption<WhiteTableExceptGenRefCB> updateOption) {
        helpInsertOrUpdateInternally(whiteTableExceptGenRef, new InternalInsertOrUpdateCallback<WhiteTableExceptGenRef, WhiteTableExceptGenRefCB>() {
            public void callbackInsert(WhiteTableExceptGenRef entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(WhiteTableExceptGenRef entity) { doUpdate(entity, updateOption); }
            public WhiteTableExceptGenRefCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(WhiteTableExceptGenRefCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<WhiteTableExceptGenRefCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<WhiteTableExceptGenRefCB>() : updateOption;
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
     * WhiteTableExceptGenRef whiteTableExceptGenRef = new WhiteTableExceptGenRef();
     * whiteTableExceptGenRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteTableExceptGenRef.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteTableExceptGenRefBhv.<span style="color: #FD4747">delete</span>(whiteTableExceptGenRef);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteTableExceptGenRef The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteTableExceptGenRef whiteTableExceptGenRef) {
        doDelete(whiteTableExceptGenRef, null);
    }

    protected void doDelete(WhiteTableExceptGenRef whiteTableExceptGenRef, final DeleteOption<WhiteTableExceptGenRefCB> option) {
        assertObjectNotNull("whiteTableExceptGenRef", whiteTableExceptGenRef);
        prepareDeleteOption(option);
        helpDeleteInternally(whiteTableExceptGenRef, new InternalDeleteCallback<WhiteTableExceptGenRef>() {
            public int callbackDelegateDelete(WhiteTableExceptGenRef entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhiteTableExceptGenRefCB> option) {
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
     *     WhiteTableExceptGenRef whiteTableExceptGenRef = new WhiteTableExceptGenRef();
     *     whiteTableExceptGenRef.setFooName("foo");
     *     if (...) {
     *         whiteTableExceptGenRef.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteTableExceptGenRefList.add(whiteTableExceptGenRef);
     * }
     * whiteTableExceptGenRefBhv.<span style="color: #FD4747">batchInsert</span>(whiteTableExceptGenRefList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteTableExceptGenRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteTableExceptGenRef> whiteTableExceptGenRefList) {
        InsertOption<WhiteTableExceptGenRefCB> option = createInsertUpdateOption();
        return doBatchInsert(whiteTableExceptGenRefList, option);
    }

    protected int[] doBatchInsert(List<WhiteTableExceptGenRef> whiteTableExceptGenRefList, InsertOption<WhiteTableExceptGenRefCB> option) {
        assertObjectNotNull("whiteTableExceptGenRefList", whiteTableExceptGenRefList);
        prepareBatchInsertOption(whiteTableExceptGenRefList, option);
        return delegateBatchInsert(whiteTableExceptGenRefList, option);
    }

    protected void prepareBatchInsertOption(List<WhiteTableExceptGenRef> whiteTableExceptGenRefList, InsertOption<WhiteTableExceptGenRefCB> option) {
        option.xallowInsertColumnModifiedPropertiesFragmented();
        option.xacceptInsertColumnModifiedPropertiesIfNeeds(whiteTableExceptGenRefList);
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
     *     WhiteTableExceptGenRef whiteTableExceptGenRef = new WhiteTableExceptGenRef();
     *     whiteTableExceptGenRef.setFooName("foo");
     *     if (...) {
     *         whiteTableExceptGenRef.setFooPrice(123);
     *     } else {
     *         whiteTableExceptGenRef.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteTableExceptGenRef.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteTableExceptGenRefList.add(whiteTableExceptGenRef);
     * }
     * whiteTableExceptGenRefBhv.<span style="color: #FD4747">batchUpdate</span>(whiteTableExceptGenRefList);
     * </pre>
     * @param whiteTableExceptGenRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteTableExceptGenRef> whiteTableExceptGenRefList) {
        UpdateOption<WhiteTableExceptGenRefCB> option = createPlainUpdateOption();
        return doBatchUpdate(whiteTableExceptGenRefList, option);
    }

    protected int[] doBatchUpdate(List<WhiteTableExceptGenRef> whiteTableExceptGenRefList, UpdateOption<WhiteTableExceptGenRefCB> option) {
        assertObjectNotNull("whiteTableExceptGenRefList", whiteTableExceptGenRefList);
        prepareBatchUpdateOption(whiteTableExceptGenRefList, option);
        return delegateBatchUpdate(whiteTableExceptGenRefList, option);
    }

    protected void prepareBatchUpdateOption(List<WhiteTableExceptGenRef> whiteTableExceptGenRefList, UpdateOption<WhiteTableExceptGenRefCB> option) {
        option.xacceptUpdateColumnModifiedPropertiesIfNeeds(whiteTableExceptGenRefList);
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
     * whiteTableExceptGenRefBhv.<span style="color: #FD4747">batchUpdate</span>(whiteTableExceptGenRefList, new SpecifyQuery<WhiteTableExceptGenRefCB>() {
     *     public void specify(WhiteTableExceptGenRefCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteTableExceptGenRefBhv.<span style="color: #FD4747">batchUpdate</span>(whiteTableExceptGenRefList, new SpecifyQuery<WhiteTableExceptGenRefCB>() {
     *     public void specify(WhiteTableExceptGenRefCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteTableExceptGenRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteTableExceptGenRef> whiteTableExceptGenRefList, SpecifyQuery<WhiteTableExceptGenRefCB> updateColumnSpec) {
        return doBatchUpdate(whiteTableExceptGenRefList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        return doLumpModify(ls, option);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteTableExceptGenRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteTableExceptGenRef> whiteTableExceptGenRefList) {
        return doBatchDelete(whiteTableExceptGenRefList, null);
    }

    protected int[] doBatchDelete(List<WhiteTableExceptGenRef> whiteTableExceptGenRefList, DeleteOption<WhiteTableExceptGenRefCB> option) {
        assertObjectNotNull("whiteTableExceptGenRefList", whiteTableExceptGenRefList);
        prepareDeleteOption(option);
        return delegateBatchDelete(whiteTableExceptGenRefList, option);
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
     * whiteTableExceptGenRefBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteTableExceptGenRef, WhiteTableExceptGenRefCB&gt;() {
     *     public ConditionBean setup(whiteTableExceptGenRef entity, WhiteTableExceptGenRefCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteTableExceptGenRef, WhiteTableExceptGenRefCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteTableExceptGenRef, WhiteTableExceptGenRefCB> setupper, InsertOption<WhiteTableExceptGenRefCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        WhiteTableExceptGenRef entity = new WhiteTableExceptGenRef();
        WhiteTableExceptGenRefCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected WhiteTableExceptGenRefCB createCBForQueryInsert() {
        WhiteTableExceptGenRefCB cb = newMyConditionBean();
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
     * WhiteTableExceptGenRef whiteTableExceptGenRef = new WhiteTableExceptGenRef();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteTableExceptGenRef.setPK...(value);</span>
     * whiteTableExceptGenRef.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteTableExceptGenRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteTableExceptGenRef.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteTableExceptGenRef.setVersionNo(value);</span>
     * WhiteTableExceptGenRefCB cb = new WhiteTableExceptGenRefCB();
     * cb.query().setFoo...(value);
     * whiteTableExceptGenRefBhv.<span style="color: #FD4747">queryUpdate</span>(whiteTableExceptGenRef, cb);
     * </pre>
     * @param whiteTableExceptGenRef The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteTableExceptGenRef. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteTableExceptGenRef whiteTableExceptGenRef, WhiteTableExceptGenRefCB cb) {
        return doQueryUpdate(whiteTableExceptGenRef, cb, null);
    }

    protected int doQueryUpdate(WhiteTableExceptGenRef whiteTableExceptGenRef, WhiteTableExceptGenRefCB cb, UpdateOption<WhiteTableExceptGenRefCB> option) {
        assertObjectNotNull("whiteTableExceptGenRef", whiteTableExceptGenRef); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(whiteTableExceptGenRef, cb, option) : 0;
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (WhiteTableExceptGenRefCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (WhiteTableExceptGenRefCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteTableExceptGenRefCB cb = new WhiteTableExceptGenRefCB();
     * cb.query().setFoo...(value);
     * whiteTableExceptGenRefBhv.<span style="color: #FD4747">queryDelete</span>(whiteTableExceptGenRef, cb);
     * </pre>
     * @param cb The condition-bean of WhiteTableExceptGenRef. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteTableExceptGenRefCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteTableExceptGenRefCB cb, DeleteOption<WhiteTableExceptGenRefCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, option) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((WhiteTableExceptGenRefCB)cb); }
        else { return varyingQueryDelete((WhiteTableExceptGenRefCB)cb, downcast(option)); }
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
     * WhiteTableExceptGenRef whiteTableExceptGenRef = new WhiteTableExceptGenRef();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteTableExceptGenRef.setFoo...(value);
     * whiteTableExceptGenRef.setBar...(value);
     * InsertOption<WhiteTableExceptGenRefCB> option = new InsertOption<WhiteTableExceptGenRefCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteTableExceptGenRefBhv.<span style="color: #FD4747">varyingInsert</span>(whiteTableExceptGenRef, option);
     * ... = whiteTableExceptGenRef.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteTableExceptGenRef The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteTableExceptGenRef whiteTableExceptGenRef, InsertOption<WhiteTableExceptGenRefCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteTableExceptGenRef, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteTableExceptGenRef whiteTableExceptGenRef = new WhiteTableExceptGenRef();
     * whiteTableExceptGenRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteTableExceptGenRef.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteTableExceptGenRef.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteTableExceptGenRefCB&gt; option = new UpdateOption&lt;WhiteTableExceptGenRefCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteTableExceptGenRefCB&gt;() {
     *         public void specify(WhiteTableExceptGenRefCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteTableExceptGenRefBhv.<span style="color: #FD4747">varyingUpdate</span>(whiteTableExceptGenRef, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteTableExceptGenRef The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteTableExceptGenRef whiteTableExceptGenRef, UpdateOption<WhiteTableExceptGenRefCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteTableExceptGenRef, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteTableExceptGenRef The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteTableExceptGenRef whiteTableExceptGenRef, InsertOption<WhiteTableExceptGenRefCB> insertOption, UpdateOption<WhiteTableExceptGenRefCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(whiteTableExceptGenRef, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteTableExceptGenRef The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteTableExceptGenRef whiteTableExceptGenRef, DeleteOption<WhiteTableExceptGenRefCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteTableExceptGenRef, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteTableExceptGenRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteTableExceptGenRef> whiteTableExceptGenRefList, InsertOption<WhiteTableExceptGenRefCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteTableExceptGenRefList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteTableExceptGenRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteTableExceptGenRef> whiteTableExceptGenRefList, UpdateOption<WhiteTableExceptGenRefCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteTableExceptGenRefList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteTableExceptGenRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteTableExceptGenRef> whiteTableExceptGenRefList, DeleteOption<WhiteTableExceptGenRefCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteTableExceptGenRefList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteTableExceptGenRef, WhiteTableExceptGenRefCB> setupper, InsertOption<WhiteTableExceptGenRefCB> option) {
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
     * WhiteTableExceptGenRef whiteTableExceptGenRef = new WhiteTableExceptGenRef();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteTableExceptGenRef.setPK...(value);</span>
     * whiteTableExceptGenRef.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteTableExceptGenRef.setVersionNo(value);</span>
     * WhiteTableExceptGenRefCB cb = new WhiteTableExceptGenRefCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteTableExceptGenRefCB&gt; option = new UpdateOption&lt;WhiteTableExceptGenRefCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteTableExceptGenRefCB&gt;() {
     *     public void specify(WhiteTableExceptGenRefCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteTableExceptGenRefBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(whiteTableExceptGenRef, cb, option);
     * </pre>
     * @param whiteTableExceptGenRef The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteTableExceptGenRef. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteTableExceptGenRef whiteTableExceptGenRef, WhiteTableExceptGenRefCB cb, UpdateOption<WhiteTableExceptGenRefCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteTableExceptGenRef, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteTableExceptGenRef. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteTableExceptGenRefCB cb, DeleteOption<WhiteTableExceptGenRefCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteTableExceptGenRefBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhiteTableExceptGenRefCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhiteTableExceptGenRefCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhiteTableExceptGenRef> void delegateSelectCursor(WhiteTableExceptGenRefCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends WhiteTableExceptGenRef> List<ENTITY> delegateSelectList(WhiteTableExceptGenRefCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhiteTableExceptGenRef e, InsertOption<WhiteTableExceptGenRefCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(WhiteTableExceptGenRef e, UpdateOption<WhiteTableExceptGenRefCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return delegateUpdateNonstrict(e, op); }
    protected int delegateUpdateNonstrict(WhiteTableExceptGenRef e, UpdateOption<WhiteTableExceptGenRefCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(WhiteTableExceptGenRef e, DeleteOption<WhiteTableExceptGenRefCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return delegateDeleteNonstrict(e, op); }
    protected int delegateDeleteNonstrict(WhiteTableExceptGenRef e, DeleteOption<WhiteTableExceptGenRefCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<WhiteTableExceptGenRef> ls, InsertOption<WhiteTableExceptGenRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhiteTableExceptGenRef> ls, UpdateOption<WhiteTableExceptGenRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhiteTableExceptGenRef> ls, UpdateOption<WhiteTableExceptGenRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhiteTableExceptGenRef> ls, DeleteOption<WhiteTableExceptGenRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhiteTableExceptGenRef> ls, DeleteOption<WhiteTableExceptGenRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhiteTableExceptGenRef e, WhiteTableExceptGenRefCB inCB, ConditionBean resCB, InsertOption<WhiteTableExceptGenRefCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhiteTableExceptGenRef e, WhiteTableExceptGenRefCB cb, UpdateOption<WhiteTableExceptGenRefCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(WhiteTableExceptGenRefCB cb, DeleteOption<WhiteTableExceptGenRefCB> op)
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
    protected WhiteTableExceptGenRef downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, WhiteTableExceptGenRef.class);
    }

    protected WhiteTableExceptGenRefCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, WhiteTableExceptGenRefCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<WhiteTableExceptGenRef> downcast(List<? extends Entity> entityList) {
        return (List<WhiteTableExceptGenRef>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteTableExceptGenRefCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<WhiteTableExceptGenRefCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteTableExceptGenRefCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<WhiteTableExceptGenRefCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteTableExceptGenRefCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<WhiteTableExceptGenRefCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteTableExceptGenRef, WhiteTableExceptGenRefCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<WhiteTableExceptGenRef, WhiteTableExceptGenRefCB>)option;
    }
}
