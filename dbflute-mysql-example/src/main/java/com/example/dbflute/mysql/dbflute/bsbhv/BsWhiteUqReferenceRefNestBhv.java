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
 * The behavior of WHITE_UQ_REFERENCE_REF_NEST as TABLE. <br />
 * <pre>
 * [primary key]
 *     UQ_REFERENCE_REF_NEST_ID
 * 
 * [column]
 *     UQ_REFERENCE_REF_NEST_ID, COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE
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
 *     white_uq_reference_ref
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     whiteUqReferenceRef
 * 
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteUqReferenceRefNestBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_uq_reference_ref_nest"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return WhiteUqReferenceRefNestDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteUqReferenceRefNestDbm getMyDBMeta() { return WhiteUqReferenceRefNestDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteUqReferenceRefNest newMyEntity() { return new WhiteUqReferenceRefNest(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteUqReferenceRefNestCB newMyConditionBean() { return new WhiteUqReferenceRefNestCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteUqReferenceRefNestCB cb = new WhiteUqReferenceRefNestCB();
     * cb.query().setFoo...(value);
     * int count = whiteUqReferenceRefNestBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteUqReferenceRefNest. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteUqReferenceRefNestCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteUqReferenceRefNestCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteUqReferenceRefNestCB cb) { // called by selectPage(cb)
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
     * WhiteUqReferenceRefNestCB cb = new WhiteUqReferenceRefNestCB();
     * cb.query().setFoo...(value);
     * WhiteUqReferenceRefNest whiteUqReferenceRefNest = whiteUqReferenceRefNestBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (whiteUqReferenceRefNest != null) {
     *     ... = whiteUqReferenceRefNest.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteUqReferenceRefNest. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteUqReferenceRefNest selectEntity(WhiteUqReferenceRefNestCB cb) {
        return doSelectEntity(cb, WhiteUqReferenceRefNest.class);
    }

    protected <ENTITY extends WhiteUqReferenceRefNest> ENTITY doSelectEntity(final WhiteUqReferenceRefNestCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, entityType, new InternalSelectEntityCallback<ENTITY, WhiteUqReferenceRefNestCB>() {
            public List<ENTITY> callbackSelectList(WhiteUqReferenceRefNestCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * WhiteUqReferenceRefNestCB cb = new WhiteUqReferenceRefNestCB();
     * cb.query().setFoo...(value);
     * WhiteUqReferenceRefNest whiteUqReferenceRefNest = whiteUqReferenceRefNestBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteUqReferenceRefNest.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteUqReferenceRefNest. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteUqReferenceRefNest selectEntityWithDeletedCheck(WhiteUqReferenceRefNestCB cb) {
        return doSelectEntityWithDeletedCheck(cb, WhiteUqReferenceRefNest.class);
    }

    protected <ENTITY extends WhiteUqReferenceRefNest> ENTITY doSelectEntityWithDeletedCheck(final WhiteUqReferenceRefNestCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, entityType, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteUqReferenceRefNestCB>() {
            public List<ENTITY> callbackSelectList(WhiteUqReferenceRefNestCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param uqReferenceRefNestId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteUqReferenceRefNest selectByPKValue(Long uqReferenceRefNestId) {
        return doSelectByPKValue(uqReferenceRefNestId, WhiteUqReferenceRefNest.class);
    }

    protected <ENTITY extends WhiteUqReferenceRefNest> ENTITY doSelectByPKValue(Long uqReferenceRefNestId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(uqReferenceRefNestId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param uqReferenceRefNestId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteUqReferenceRefNest selectByPKValueWithDeletedCheck(Long uqReferenceRefNestId) {
        return doSelectByPKValueWithDeletedCheck(uqReferenceRefNestId, WhiteUqReferenceRefNest.class);
    }

    protected <ENTITY extends WhiteUqReferenceRefNest> ENTITY doSelectByPKValueWithDeletedCheck(Long uqReferenceRefNestId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(uqReferenceRefNestId), entityType);
    }

    private WhiteUqReferenceRefNestCB buildPKCB(Long uqReferenceRefNestId) {
        assertObjectNotNull("uqReferenceRefNestId", uqReferenceRefNestId);
        WhiteUqReferenceRefNestCB cb = newMyConditionBean();
        cb.query().setUqReferenceRefNestId_Equal(uqReferenceRefNestId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteUqReferenceRefNestCB cb = new WhiteUqReferenceRefNestCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteUqReferenceRefNest&gt; whiteUqReferenceRefNestList = whiteUqReferenceRefNestBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (WhiteUqReferenceRefNest whiteUqReferenceRefNest : whiteUqReferenceRefNestList) {
     *     ... = whiteUqReferenceRefNest.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteUqReferenceRefNest. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteUqReferenceRefNest> selectList(WhiteUqReferenceRefNestCB cb) {
        return doSelectList(cb, WhiteUqReferenceRefNest.class);
    }

    protected <ENTITY extends WhiteUqReferenceRefNest> ListResultBean<ENTITY> doSelectList(WhiteUqReferenceRefNestCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, WhiteUqReferenceRefNestCB>() {
            public List<ENTITY> callbackSelectList(WhiteUqReferenceRefNestCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * WhiteUqReferenceRefNestCB cb = new WhiteUqReferenceRefNestCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteUqReferenceRefNest&gt; page = whiteUqReferenceRefNestBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteUqReferenceRefNest whiteUqReferenceRefNest : page) {
     *     ... = whiteUqReferenceRefNest.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteUqReferenceRefNest. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteUqReferenceRefNest> selectPage(WhiteUqReferenceRefNestCB cb) {
        return doSelectPage(cb, WhiteUqReferenceRefNest.class);
    }

    protected <ENTITY extends WhiteUqReferenceRefNest> PagingResultBean<ENTITY> doSelectPage(WhiteUqReferenceRefNestCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, WhiteUqReferenceRefNestCB>() {
            public int callbackSelectCount(WhiteUqReferenceRefNestCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteUqReferenceRefNestCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * WhiteUqReferenceRefNestCB cb = new WhiteUqReferenceRefNestCB();
     * cb.query().setFoo...(value);
     * whiteUqReferenceRefNestBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteUqReferenceRefNest&gt;() {
     *     public void handle(WhiteUqReferenceRefNest entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteUqReferenceRefNest. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteUqReferenceRefNest. (NotNull)
     */
    public void selectCursor(WhiteUqReferenceRefNestCB cb, EntityRowHandler<WhiteUqReferenceRefNest> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, WhiteUqReferenceRefNest.class);
    }

    protected <ENTITY extends WhiteUqReferenceRefNest> void doSelectCursor(WhiteUqReferenceRefNestCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<WhiteUqReferenceRefNest>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        helpSelectCursorInternally(cb, entityRowHandler, entityType, new InternalSelectCursorCallback<ENTITY, WhiteUqReferenceRefNestCB>() {
            public void callbackSelectCursor(WhiteUqReferenceRefNestCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) { delegateSelectCursor(cb, entityRowHandler, entityType); }
            public List<ENTITY> callbackSelectList(WhiteUqReferenceRefNestCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteUqReferenceRefNestBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteUqReferenceRefNestCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (NullAllowed)
     */
    public <RESULT> SLFunction<WhiteUqReferenceRefNestCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends WhiteUqReferenceRefNestCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
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
    /**
     * Pull out the list of foreign table 'WhiteUqReferenceRef'.
     * @param whiteUqReferenceRefNestList The list of whiteUqReferenceRefNest. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteUqReferenceRef> pulloutWhiteUqReferenceRef(List<WhiteUqReferenceRefNest> whiteUqReferenceRefNestList) {
        return helpPulloutInternally(whiteUqReferenceRefNestList, new InternalPulloutCallback<WhiteUqReferenceRefNest, WhiteUqReferenceRef>() {
            public WhiteUqReferenceRef getFr(WhiteUqReferenceRefNest e) { return e.getWhiteUqReferenceRef(); }
            public boolean hasRf() { return true; }
            public void setRfLs(WhiteUqReferenceRef e, List<WhiteUqReferenceRefNest> ls)
            { e.setWhiteUqReferenceRefNestList(ls); }
        });
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key uqReferenceRefNestId.
     * @param whiteUqReferenceRefNestList The list of whiteUqReferenceRefNest. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractUqReferenceRefNestIdList(List<WhiteUqReferenceRefNest> whiteUqReferenceRefNestList) {
        return helpExtractListInternally(whiteUqReferenceRefNestList, new InternalExtractCallback<WhiteUqReferenceRefNest, Long>() {
            public Long getCV(WhiteUqReferenceRefNest e) { return e.getUqReferenceRefNestId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteUqReferenceRefNest whiteUqReferenceRefNest = new WhiteUqReferenceRefNest();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteUqReferenceRefNest.setFoo...(value);
     * whiteUqReferenceRefNest.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteUqReferenceRefNest.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteUqReferenceRefNest.set...;</span>
     * whiteUqReferenceRefNestBhv.<span style="color: #FD4747">insert</span>(whiteUqReferenceRefNest);
     * ... = whiteUqReferenceRefNest.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteUqReferenceRefNest The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteUqReferenceRefNest whiteUqReferenceRefNest) {
        doInsert(whiteUqReferenceRefNest, null);
    }

    protected void doInsert(WhiteUqReferenceRefNest whiteUqReferenceRefNest, InsertOption<WhiteUqReferenceRefNestCB> option) {
        assertObjectNotNull("whiteUqReferenceRefNest", whiteUqReferenceRefNest);
        prepareInsertOption(option);
        delegateInsert(whiteUqReferenceRefNest, option);
    }

    protected void prepareInsertOption(InsertOption<WhiteUqReferenceRefNestCB> option) {
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
     * WhiteUqReferenceRefNest whiteUqReferenceRefNest = new WhiteUqReferenceRefNest();
     * whiteUqReferenceRefNest.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteUqReferenceRefNest.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteUqReferenceRefNest.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteUqReferenceRefNest.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteUqReferenceRefNest.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteUqReferenceRefNestBhv.<span style="color: #FD4747">update</span>(whiteUqReferenceRefNest);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param whiteUqReferenceRefNest The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final WhiteUqReferenceRefNest whiteUqReferenceRefNest) {
        doUpdate(whiteUqReferenceRefNest, null);
    }

    protected void doUpdate(WhiteUqReferenceRefNest whiteUqReferenceRefNest, final UpdateOption<WhiteUqReferenceRefNestCB> option) {
        assertObjectNotNull("whiteUqReferenceRefNest", whiteUqReferenceRefNest);
        prepareUpdateOption(option);
        helpUpdateInternally(whiteUqReferenceRefNest, new InternalUpdateCallback<WhiteUqReferenceRefNest>() {
            public int callbackDelegateUpdate(WhiteUqReferenceRefNest entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhiteUqReferenceRefNestCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected WhiteUqReferenceRefNestCB createCBForVaryingUpdate() {
        WhiteUqReferenceRefNestCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected WhiteUqReferenceRefNestCB createCBForSpecifiedUpdate() {
        WhiteUqReferenceRefNestCB cb = newMyConditionBean();
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
     * @param whiteUqReferenceRefNest The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteUqReferenceRefNest whiteUqReferenceRefNest) {
        doInesrtOrUpdate(whiteUqReferenceRefNest, null, null);
    }

    protected void doInesrtOrUpdate(WhiteUqReferenceRefNest whiteUqReferenceRefNest, final InsertOption<WhiteUqReferenceRefNestCB> insertOption, final UpdateOption<WhiteUqReferenceRefNestCB> updateOption) {
        helpInsertOrUpdateInternally(whiteUqReferenceRefNest, new InternalInsertOrUpdateCallback<WhiteUqReferenceRefNest, WhiteUqReferenceRefNestCB>() {
            public void callbackInsert(WhiteUqReferenceRefNest entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(WhiteUqReferenceRefNest entity) { doUpdate(entity, updateOption); }
            public WhiteUqReferenceRefNestCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(WhiteUqReferenceRefNestCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<WhiteUqReferenceRefNestCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<WhiteUqReferenceRefNestCB>() : updateOption;
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
     * WhiteUqReferenceRefNest whiteUqReferenceRefNest = new WhiteUqReferenceRefNest();
     * whiteUqReferenceRefNest.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteUqReferenceRefNest.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteUqReferenceRefNestBhv.<span style="color: #FD4747">delete</span>(whiteUqReferenceRefNest);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param whiteUqReferenceRefNest The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteUqReferenceRefNest whiteUqReferenceRefNest) {
        doDelete(whiteUqReferenceRefNest, null);
    }

    protected void doDelete(WhiteUqReferenceRefNest whiteUqReferenceRefNest, final DeleteOption<WhiteUqReferenceRefNestCB> option) {
        assertObjectNotNull("whiteUqReferenceRefNest", whiteUqReferenceRefNest);
        prepareDeleteOption(option);
        helpDeleteInternally(whiteUqReferenceRefNest, new InternalDeleteCallback<WhiteUqReferenceRefNest>() {
            public int callbackDelegateDelete(WhiteUqReferenceRefNest entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhiteUqReferenceRefNestCB> option) {
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
     *     WhiteUqReferenceRefNest whiteUqReferenceRefNest = new WhiteUqReferenceRefNest();
     *     whiteUqReferenceRefNest.setFooName("foo");
     *     if (...) {
     *         whiteUqReferenceRefNest.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteUqReferenceRefNestList.add(whiteUqReferenceRefNest);
     * }
     * whiteUqReferenceRefNestBhv.<span style="color: #FD4747">batchInsert</span>(whiteUqReferenceRefNestList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteUqReferenceRefNestList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteUqReferenceRefNest> whiteUqReferenceRefNestList) {
        InsertOption<WhiteUqReferenceRefNestCB> option = createInsertUpdateOption();
        return doBatchInsert(whiteUqReferenceRefNestList, option);
    }

    protected int[] doBatchInsert(List<WhiteUqReferenceRefNest> whiteUqReferenceRefNestList, InsertOption<WhiteUqReferenceRefNestCB> option) {
        assertObjectNotNull("whiteUqReferenceRefNestList", whiteUqReferenceRefNestList);
        prepareBatchInsertOption(whiteUqReferenceRefNestList, option);
        return delegateBatchInsert(whiteUqReferenceRefNestList, option);
    }

    protected void prepareBatchInsertOption(List<WhiteUqReferenceRefNest> whiteUqReferenceRefNestList, InsertOption<WhiteUqReferenceRefNestCB> option) {
        option.xallowInsertColumnModifiedPropertiesFragmented();
        option.xacceptInsertColumnModifiedPropertiesIfNeeds(whiteUqReferenceRefNestList);
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
     *     WhiteUqReferenceRefNest whiteUqReferenceRefNest = new WhiteUqReferenceRefNest();
     *     whiteUqReferenceRefNest.setFooName("foo");
     *     if (...) {
     *         whiteUqReferenceRefNest.setFooPrice(123);
     *     } else {
     *         whiteUqReferenceRefNest.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteUqReferenceRefNest.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteUqReferenceRefNestList.add(whiteUqReferenceRefNest);
     * }
     * whiteUqReferenceRefNestBhv.<span style="color: #FD4747">batchUpdate</span>(whiteUqReferenceRefNestList);
     * </pre>
     * @param whiteUqReferenceRefNestList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteUqReferenceRefNest> whiteUqReferenceRefNestList) {
        UpdateOption<WhiteUqReferenceRefNestCB> option = createPlainUpdateOption();
        return doBatchUpdate(whiteUqReferenceRefNestList, option);
    }

    protected int[] doBatchUpdate(List<WhiteUqReferenceRefNest> whiteUqReferenceRefNestList, UpdateOption<WhiteUqReferenceRefNestCB> option) {
        assertObjectNotNull("whiteUqReferenceRefNestList", whiteUqReferenceRefNestList);
        prepareBatchUpdateOption(whiteUqReferenceRefNestList, option);
        return delegateBatchUpdate(whiteUqReferenceRefNestList, option);
    }

    protected void prepareBatchUpdateOption(List<WhiteUqReferenceRefNest> whiteUqReferenceRefNestList, UpdateOption<WhiteUqReferenceRefNestCB> option) {
        option.xacceptUpdateColumnModifiedPropertiesIfNeeds(whiteUqReferenceRefNestList);
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
     * whiteUqReferenceRefNestBhv.<span style="color: #FD4747">batchUpdate</span>(whiteUqReferenceRefNestList, new SpecifyQuery<WhiteUqReferenceRefNestCB>() {
     *     public void specify(WhiteUqReferenceRefNestCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span> 
     * whiteUqReferenceRefNestBhv.<span style="color: #FD4747">batchUpdate</span>(whiteUqReferenceRefNestList, new SpecifyQuery<WhiteUqReferenceRefNestCB>() {
     *     public void specify(WhiteUqReferenceRefNestCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteUqReferenceRefNestList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteUqReferenceRefNest> whiteUqReferenceRefNestList, SpecifyQuery<WhiteUqReferenceRefNestCB> updateColumnSpec) {
        return doBatchUpdate(whiteUqReferenceRefNestList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        return doLumpModify(ls, option);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteUqReferenceRefNestList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteUqReferenceRefNest> whiteUqReferenceRefNestList) {
        return doBatchDelete(whiteUqReferenceRefNestList, null);
    }

    protected int[] doBatchDelete(List<WhiteUqReferenceRefNest> whiteUqReferenceRefNestList, DeleteOption<WhiteUqReferenceRefNestCB> option) {
        assertObjectNotNull("whiteUqReferenceRefNestList", whiteUqReferenceRefNestList);
        prepareDeleteOption(option);
        return delegateBatchDelete(whiteUqReferenceRefNestList, option);
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
     * whiteUqReferenceRefNestBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteUqReferenceRefNest, WhiteUqReferenceRefNestCB&gt;() {
     *     public ConditionBean setup(whiteUqReferenceRefNest entity, WhiteUqReferenceRefNestCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteUqReferenceRefNest, WhiteUqReferenceRefNestCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteUqReferenceRefNest, WhiteUqReferenceRefNestCB> setupper, InsertOption<WhiteUqReferenceRefNestCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        WhiteUqReferenceRefNest entity = new WhiteUqReferenceRefNest();
        WhiteUqReferenceRefNestCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected WhiteUqReferenceRefNestCB createCBForQueryInsert() {
        WhiteUqReferenceRefNestCB cb = newMyConditionBean();
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
     * WhiteUqReferenceRefNest whiteUqReferenceRefNest = new WhiteUqReferenceRefNest();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteUqReferenceRefNest.setPK...(value);</span>
     * whiteUqReferenceRefNest.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteUqReferenceRefNest.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteUqReferenceRefNest.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteUqReferenceRefNest.setVersionNo(value);</span>
     * WhiteUqReferenceRefNestCB cb = new WhiteUqReferenceRefNestCB();
     * cb.query().setFoo...(value);
     * whiteUqReferenceRefNestBhv.<span style="color: #FD4747">queryUpdate</span>(whiteUqReferenceRefNest, cb);
     * </pre>
     * @param whiteUqReferenceRefNest The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteUqReferenceRefNest. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteUqReferenceRefNest whiteUqReferenceRefNest, WhiteUqReferenceRefNestCB cb) {
        return doQueryUpdate(whiteUqReferenceRefNest, cb, null);
    }

    protected int doQueryUpdate(WhiteUqReferenceRefNest whiteUqReferenceRefNest, WhiteUqReferenceRefNestCB cb, UpdateOption<WhiteUqReferenceRefNestCB> option) {
        assertObjectNotNull("whiteUqReferenceRefNest", whiteUqReferenceRefNest); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(whiteUqReferenceRefNest, cb, option) : 0;
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (WhiteUqReferenceRefNestCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (WhiteUqReferenceRefNestCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteUqReferenceRefNestCB cb = new WhiteUqReferenceRefNestCB();
     * cb.query().setFoo...(value);
     * whiteUqReferenceRefNestBhv.<span style="color: #FD4747">queryDelete</span>(whiteUqReferenceRefNest, cb);
     * </pre>
     * @param cb The condition-bean of WhiteUqReferenceRefNest. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteUqReferenceRefNestCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteUqReferenceRefNestCB cb, DeleteOption<WhiteUqReferenceRefNestCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, option) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((WhiteUqReferenceRefNestCB)cb); }
        else { return varyingQueryDelete((WhiteUqReferenceRefNestCB)cb, downcast(option)); }
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
     * WhiteUqReferenceRefNest whiteUqReferenceRefNest = new WhiteUqReferenceRefNest();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteUqReferenceRefNest.setFoo...(value);
     * whiteUqReferenceRefNest.setBar...(value);
     * InsertOption<WhiteUqReferenceRefNestCB> option = new InsertOption<WhiteUqReferenceRefNestCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteUqReferenceRefNestBhv.<span style="color: #FD4747">varyingInsert</span>(whiteUqReferenceRefNest, option);
     * ... = whiteUqReferenceRefNest.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteUqReferenceRefNest The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteUqReferenceRefNest whiteUqReferenceRefNest, InsertOption<WhiteUqReferenceRefNestCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteUqReferenceRefNest, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteUqReferenceRefNest whiteUqReferenceRefNest = new WhiteUqReferenceRefNest();
     * whiteUqReferenceRefNest.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteUqReferenceRefNest.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteUqReferenceRefNest.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteUqReferenceRefNestCB&gt; option = new UpdateOption&lt;WhiteUqReferenceRefNestCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteUqReferenceRefNestCB&gt;() {
     *         public void specify(WhiteUqReferenceRefNestCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteUqReferenceRefNestBhv.<span style="color: #FD4747">varyingUpdate</span>(whiteUqReferenceRefNest, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteUqReferenceRefNest The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteUqReferenceRefNest whiteUqReferenceRefNest, UpdateOption<WhiteUqReferenceRefNestCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteUqReferenceRefNest, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteUqReferenceRefNest The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteUqReferenceRefNest whiteUqReferenceRefNest, InsertOption<WhiteUqReferenceRefNestCB> insertOption, UpdateOption<WhiteUqReferenceRefNestCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(whiteUqReferenceRefNest, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteUqReferenceRefNest The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteUqReferenceRefNest whiteUqReferenceRefNest, DeleteOption<WhiteUqReferenceRefNestCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteUqReferenceRefNest, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteUqReferenceRefNestList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteUqReferenceRefNest> whiteUqReferenceRefNestList, InsertOption<WhiteUqReferenceRefNestCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteUqReferenceRefNestList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteUqReferenceRefNestList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteUqReferenceRefNest> whiteUqReferenceRefNestList, UpdateOption<WhiteUqReferenceRefNestCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteUqReferenceRefNestList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteUqReferenceRefNestList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteUqReferenceRefNest> whiteUqReferenceRefNestList, DeleteOption<WhiteUqReferenceRefNestCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteUqReferenceRefNestList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteUqReferenceRefNest, WhiteUqReferenceRefNestCB> setupper, InsertOption<WhiteUqReferenceRefNestCB> option) {
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
     * WhiteUqReferenceRefNest whiteUqReferenceRefNest = new WhiteUqReferenceRefNest();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteUqReferenceRefNest.setPK...(value);</span>
     * whiteUqReferenceRefNest.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteUqReferenceRefNest.setVersionNo(value);</span>
     * WhiteUqReferenceRefNestCB cb = new WhiteUqReferenceRefNestCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteUqReferenceRefNestCB&gt; option = new UpdateOption&lt;WhiteUqReferenceRefNestCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteUqReferenceRefNestCB&gt;() {
     *     public void specify(WhiteUqReferenceRefNestCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteUqReferenceRefNestBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(whiteUqReferenceRefNest, cb, option);
     * </pre>
     * @param whiteUqReferenceRefNest The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteUqReferenceRefNest. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteUqReferenceRefNest whiteUqReferenceRefNest, WhiteUqReferenceRefNestCB cb, UpdateOption<WhiteUqReferenceRefNestCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteUqReferenceRefNest, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteUqReferenceRefNest. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteUqReferenceRefNestCB cb, DeleteOption<WhiteUqReferenceRefNestCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteUqReferenceRefNestBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhiteUqReferenceRefNestCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhiteUqReferenceRefNestCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhiteUqReferenceRefNest> void delegateSelectCursor(WhiteUqReferenceRefNestCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends WhiteUqReferenceRefNest> List<ENTITY> delegateSelectList(WhiteUqReferenceRefNestCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhiteUqReferenceRefNest e, InsertOption<WhiteUqReferenceRefNestCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(WhiteUqReferenceRefNest e, UpdateOption<WhiteUqReferenceRefNestCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return delegateUpdateNonstrict(e, op); }
    protected int delegateUpdateNonstrict(WhiteUqReferenceRefNest e, UpdateOption<WhiteUqReferenceRefNestCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(WhiteUqReferenceRefNest e, DeleteOption<WhiteUqReferenceRefNestCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return delegateDeleteNonstrict(e, op); }
    protected int delegateDeleteNonstrict(WhiteUqReferenceRefNest e, DeleteOption<WhiteUqReferenceRefNestCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<WhiteUqReferenceRefNest> ls, InsertOption<WhiteUqReferenceRefNestCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhiteUqReferenceRefNest> ls, UpdateOption<WhiteUqReferenceRefNestCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhiteUqReferenceRefNest> ls, UpdateOption<WhiteUqReferenceRefNestCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhiteUqReferenceRefNest> ls, DeleteOption<WhiteUqReferenceRefNestCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhiteUqReferenceRefNest> ls, DeleteOption<WhiteUqReferenceRefNestCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhiteUqReferenceRefNest e, WhiteUqReferenceRefNestCB inCB, ConditionBean resCB, InsertOption<WhiteUqReferenceRefNestCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhiteUqReferenceRefNest e, WhiteUqReferenceRefNestCB cb, UpdateOption<WhiteUqReferenceRefNestCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(WhiteUqReferenceRefNestCB cb, DeleteOption<WhiteUqReferenceRefNestCB> op)
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
    protected WhiteUqReferenceRefNest downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, WhiteUqReferenceRefNest.class);
    }

    protected WhiteUqReferenceRefNestCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, WhiteUqReferenceRefNestCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<WhiteUqReferenceRefNest> downcast(List<? extends Entity> entityList) {
        return (List<WhiteUqReferenceRefNest>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteUqReferenceRefNestCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<WhiteUqReferenceRefNestCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteUqReferenceRefNestCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<WhiteUqReferenceRefNestCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteUqReferenceRefNestCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<WhiteUqReferenceRefNestCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteUqReferenceRefNest, WhiteUqReferenceRefNestCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<WhiteUqReferenceRefNest, WhiteUqReferenceRefNestCB>)option;
    }
}
