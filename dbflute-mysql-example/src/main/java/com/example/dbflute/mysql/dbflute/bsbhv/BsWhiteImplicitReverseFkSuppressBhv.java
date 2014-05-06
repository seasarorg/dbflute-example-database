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
 * The behavior of WHITE_IMPLICIT_REVERSE_FK_SUPPRESS as TABLE. <br />
 * <pre>
 * [primary key]
 *     WHITE_IMPLICIT_REVERSE_FK_SUPPRESS_ID
 *
 * [column]
 *     WHITE_IMPLICIT_REVERSE_FK_SUPPRESS_ID, WHITE_IMPLICIT_REVERSE_FK_ID, VALID_BEGIN_DATE, VALID_END_DATE
 *
 * [sequence]
 *     
 *
 * [identity]
 *     WHITE_IMPLICIT_REVERSE_FK_SUPPRESS_ID
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
public abstract class BsWhiteImplicitReverseFkSuppressBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_implicit_reverse_fk_suppress"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return WhiteImplicitReverseFkSuppressDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteImplicitReverseFkSuppressDbm getMyDBMeta() { return WhiteImplicitReverseFkSuppressDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteImplicitReverseFkSuppress newMyEntity() { return new WhiteImplicitReverseFkSuppress(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteImplicitReverseFkSuppressCB newMyConditionBean() { return new WhiteImplicitReverseFkSuppressCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteImplicitReverseFkSuppressCB cb = new WhiteImplicitReverseFkSuppressCB();
     * cb.query().setFoo...(value);
     * int count = whiteImplicitReverseFkSuppressBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteImplicitReverseFkSuppress. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteImplicitReverseFkSuppressCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteImplicitReverseFkSuppressCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteImplicitReverseFkSuppressCB cb) { // called by selectPage(cb)
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
     * WhiteImplicitReverseFkSuppressCB cb = new WhiteImplicitReverseFkSuppressCB();
     * cb.query().setFoo...(value);
     * WhiteImplicitReverseFkSuppress whiteImplicitReverseFkSuppress = whiteImplicitReverseFkSuppressBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (whiteImplicitReverseFkSuppress != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = whiteImplicitReverseFkSuppress.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteImplicitReverseFkSuppress. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteImplicitReverseFkSuppress selectEntity(WhiteImplicitReverseFkSuppressCB cb) {
        return doSelectEntity(cb, WhiteImplicitReverseFkSuppress.class);
    }

    protected <ENTITY extends WhiteImplicitReverseFkSuppress> ENTITY doSelectEntity(WhiteImplicitReverseFkSuppressCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, WhiteImplicitReverseFkSuppressCB>() {
            public List<ENTITY> callbackSelectList(WhiteImplicitReverseFkSuppressCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * WhiteImplicitReverseFkSuppressCB cb = new WhiteImplicitReverseFkSuppressCB();
     * cb.query().setFoo...(value);
     * WhiteImplicitReverseFkSuppress whiteImplicitReverseFkSuppress = whiteImplicitReverseFkSuppressBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteImplicitReverseFkSuppress.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteImplicitReverseFkSuppress. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (point is not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteImplicitReverseFkSuppress selectEntityWithDeletedCheck(WhiteImplicitReverseFkSuppressCB cb) {
        return doSelectEntityWithDeletedCheck(cb, WhiteImplicitReverseFkSuppress.class);
    }

    protected <ENTITY extends WhiteImplicitReverseFkSuppress> ENTITY doSelectEntityWithDeletedCheck(WhiteImplicitReverseFkSuppressCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteImplicitReverseFkSuppressCB>() {
            public List<ENTITY> callbackSelectList(WhiteImplicitReverseFkSuppressCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param whiteImplicitReverseFkSuppressId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteImplicitReverseFkSuppress selectByPKValue(Integer whiteImplicitReverseFkSuppressId) {
        return doSelectByPKValue(whiteImplicitReverseFkSuppressId, WhiteImplicitReverseFkSuppress.class);
    }

    protected <ENTITY extends WhiteImplicitReverseFkSuppress> ENTITY doSelectByPKValue(Integer whiteImplicitReverseFkSuppressId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(whiteImplicitReverseFkSuppressId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param whiteImplicitReverseFkSuppressId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteImplicitReverseFkSuppress selectByPKValueWithDeletedCheck(Integer whiteImplicitReverseFkSuppressId) {
        return doSelectByPKValueWithDeletedCheck(whiteImplicitReverseFkSuppressId, WhiteImplicitReverseFkSuppress.class);
    }

    protected <ENTITY extends WhiteImplicitReverseFkSuppress> ENTITY doSelectByPKValueWithDeletedCheck(Integer whiteImplicitReverseFkSuppressId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(whiteImplicitReverseFkSuppressId), entityType);
    }

    private WhiteImplicitReverseFkSuppressCB buildPKCB(Integer whiteImplicitReverseFkSuppressId) {
        assertObjectNotNull("whiteImplicitReverseFkSuppressId", whiteImplicitReverseFkSuppressId);
        WhiteImplicitReverseFkSuppressCB cb = newMyConditionBean();
        cb.query().setWhiteImplicitReverseFkSuppressId_Equal(whiteImplicitReverseFkSuppressId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteImplicitReverseFkSuppressCB cb = new WhiteImplicitReverseFkSuppressCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteImplicitReverseFkSuppress&gt; whiteImplicitReverseFkSuppressList = whiteImplicitReverseFkSuppressBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteImplicitReverseFkSuppress whiteImplicitReverseFkSuppress : whiteImplicitReverseFkSuppressList) {
     *     ... = whiteImplicitReverseFkSuppress.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteImplicitReverseFkSuppress. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteImplicitReverseFkSuppress> selectList(WhiteImplicitReverseFkSuppressCB cb) {
        return doSelectList(cb, WhiteImplicitReverseFkSuppress.class);
    }

    protected <ENTITY extends WhiteImplicitReverseFkSuppress> ListResultBean<ENTITY> doSelectList(WhiteImplicitReverseFkSuppressCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, WhiteImplicitReverseFkSuppressCB>() {
            public List<ENTITY> callbackSelectList(WhiteImplicitReverseFkSuppressCB lcb, Class<ENTITY> ltp) { return delegateSelectList(lcb, ltp); } });
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
     * WhiteImplicitReverseFkSuppressCB cb = new WhiteImplicitReverseFkSuppressCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteImplicitReverseFkSuppress&gt; page = whiteImplicitReverseFkSuppressBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteImplicitReverseFkSuppress whiteImplicitReverseFkSuppress : page) {
     *     ... = whiteImplicitReverseFkSuppress.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteImplicitReverseFkSuppress. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteImplicitReverseFkSuppress> selectPage(WhiteImplicitReverseFkSuppressCB cb) {
        return doSelectPage(cb, WhiteImplicitReverseFkSuppress.class);
    }

    protected <ENTITY extends WhiteImplicitReverseFkSuppress> PagingResultBean<ENTITY> doSelectPage(WhiteImplicitReverseFkSuppressCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, WhiteImplicitReverseFkSuppressCB>() {
            public int callbackSelectCount(WhiteImplicitReverseFkSuppressCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteImplicitReverseFkSuppressCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * WhiteImplicitReverseFkSuppressCB cb = new WhiteImplicitReverseFkSuppressCB();
     * cb.query().setFoo...(value);
     * whiteImplicitReverseFkSuppressBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteImplicitReverseFkSuppress&gt;() {
     *     public void handle(WhiteImplicitReverseFkSuppress entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteImplicitReverseFkSuppress. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteImplicitReverseFkSuppress. (NotNull)
     */
    public void selectCursor(WhiteImplicitReverseFkSuppressCB cb, EntityRowHandler<WhiteImplicitReverseFkSuppress> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, WhiteImplicitReverseFkSuppress.class);
    }

    protected <ENTITY extends WhiteImplicitReverseFkSuppress> void doSelectCursor(WhiteImplicitReverseFkSuppressCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, WhiteImplicitReverseFkSuppressCB>() {
            public void callbackSelectCursor(WhiteImplicitReverseFkSuppressCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(WhiteImplicitReverseFkSuppressCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteImplicitReverseFkSuppressBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteImplicitReverseFkSuppressCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<WhiteImplicitReverseFkSuppressCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends WhiteImplicitReverseFkSuppressCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends WhiteImplicitReverseFkSuppressCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
     * Extract the value list of (single) primary key whiteImplicitReverseFkSuppressId.
     * @param whiteImplicitReverseFkSuppressList The list of whiteImplicitReverseFkSuppress. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractWhiteImplicitReverseFkSuppressIdList(List<WhiteImplicitReverseFkSuppress> whiteImplicitReverseFkSuppressList) {
        return helpExtractListInternally(whiteImplicitReverseFkSuppressList, new InternalExtractCallback<WhiteImplicitReverseFkSuppress, Integer>() {
            public Integer getCV(WhiteImplicitReverseFkSuppress et) { return et.getWhiteImplicitReverseFkSuppressId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteImplicitReverseFkSuppress whiteImplicitReverseFkSuppress = new WhiteImplicitReverseFkSuppress();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteImplicitReverseFkSuppress.setFoo...(value);
     * whiteImplicitReverseFkSuppress.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteImplicitReverseFkSuppress.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteImplicitReverseFkSuppress.set...;</span>
     * whiteImplicitReverseFkSuppressBhv.<span style="color: #DD4747">insert</span>(whiteImplicitReverseFkSuppress);
     * ... = whiteImplicitReverseFkSuppress.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteImplicitReverseFkSuppress The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteImplicitReverseFkSuppress whiteImplicitReverseFkSuppress) {
        doInsert(whiteImplicitReverseFkSuppress, null);
    }

    protected void doInsert(WhiteImplicitReverseFkSuppress whiteImplicitReverseFkSuppress, InsertOption<WhiteImplicitReverseFkSuppressCB> op) {
        assertObjectNotNull("whiteImplicitReverseFkSuppress", whiteImplicitReverseFkSuppress);
        prepareInsertOption(op);
        delegateInsert(whiteImplicitReverseFkSuppress, op);
    }

    protected void prepareInsertOption(InsertOption<WhiteImplicitReverseFkSuppressCB> op) {
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
     * WhiteImplicitReverseFkSuppress whiteImplicitReverseFkSuppress = new WhiteImplicitReverseFkSuppress();
     * whiteImplicitReverseFkSuppress.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteImplicitReverseFkSuppress.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteImplicitReverseFkSuppress.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteImplicitReverseFkSuppress.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteImplicitReverseFkSuppress.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteImplicitReverseFkSuppressBhv.<span style="color: #DD4747">update</span>(whiteImplicitReverseFkSuppress);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteImplicitReverseFkSuppress The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final WhiteImplicitReverseFkSuppress whiteImplicitReverseFkSuppress) {
        doUpdate(whiteImplicitReverseFkSuppress, null);
    }

    protected void doUpdate(WhiteImplicitReverseFkSuppress whiteImplicitReverseFkSuppress, final UpdateOption<WhiteImplicitReverseFkSuppressCB> op) {
        assertObjectNotNull("whiteImplicitReverseFkSuppress", whiteImplicitReverseFkSuppress);
        prepareUpdateOption(op);
        helpUpdateInternally(whiteImplicitReverseFkSuppress, new InternalUpdateCallback<WhiteImplicitReverseFkSuppress>() {
            public int callbackDelegateUpdate(WhiteImplicitReverseFkSuppress et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhiteImplicitReverseFkSuppressCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected WhiteImplicitReverseFkSuppressCB createCBForVaryingUpdate() {
        WhiteImplicitReverseFkSuppressCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected WhiteImplicitReverseFkSuppressCB createCBForSpecifiedUpdate() {
        WhiteImplicitReverseFkSuppressCB cb = newMyConditionBean();
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
     * @param whiteImplicitReverseFkSuppress The entity of insert or update target. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteImplicitReverseFkSuppress whiteImplicitReverseFkSuppress) {
        doInesrtOrUpdate(whiteImplicitReverseFkSuppress, null, null);
    }

    protected void doInesrtOrUpdate(WhiteImplicitReverseFkSuppress whiteImplicitReverseFkSuppress, final InsertOption<WhiteImplicitReverseFkSuppressCB> iop, final UpdateOption<WhiteImplicitReverseFkSuppressCB> uop) {
        helpInsertOrUpdateInternally(whiteImplicitReverseFkSuppress, new InternalInsertOrUpdateCallback<WhiteImplicitReverseFkSuppress, WhiteImplicitReverseFkSuppressCB>() {
            public void callbackInsert(WhiteImplicitReverseFkSuppress et) { doInsert(et, iop); }
            public void callbackUpdate(WhiteImplicitReverseFkSuppress et) { doUpdate(et, uop); }
            public WhiteImplicitReverseFkSuppressCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(WhiteImplicitReverseFkSuppressCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<WhiteImplicitReverseFkSuppressCB>();
            uop = uop != null ? uop : new UpdateOption<WhiteImplicitReverseFkSuppressCB>();
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
     * WhiteImplicitReverseFkSuppress whiteImplicitReverseFkSuppress = new WhiteImplicitReverseFkSuppress();
     * whiteImplicitReverseFkSuppress.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteImplicitReverseFkSuppress.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteImplicitReverseFkSuppressBhv.<span style="color: #DD4747">delete</span>(whiteImplicitReverseFkSuppress);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteImplicitReverseFkSuppress The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteImplicitReverseFkSuppress whiteImplicitReverseFkSuppress) {
        doDelete(whiteImplicitReverseFkSuppress, null);
    }

    protected void doDelete(WhiteImplicitReverseFkSuppress whiteImplicitReverseFkSuppress, final DeleteOption<WhiteImplicitReverseFkSuppressCB> op) {
        assertObjectNotNull("whiteImplicitReverseFkSuppress", whiteImplicitReverseFkSuppress);
        prepareDeleteOption(op);
        helpDeleteInternally(whiteImplicitReverseFkSuppress, new InternalDeleteCallback<WhiteImplicitReverseFkSuppress>() {
            public int callbackDelegateDelete(WhiteImplicitReverseFkSuppress et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhiteImplicitReverseFkSuppressCB> op) {
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
     *     WhiteImplicitReverseFkSuppress whiteImplicitReverseFkSuppress = new WhiteImplicitReverseFkSuppress();
     *     whiteImplicitReverseFkSuppress.setFooName("foo");
     *     if (...) {
     *         whiteImplicitReverseFkSuppress.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteImplicitReverseFkSuppressList.add(whiteImplicitReverseFkSuppress);
     * }
     * whiteImplicitReverseFkSuppressBhv.<span style="color: #DD4747">batchInsert</span>(whiteImplicitReverseFkSuppressList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteImplicitReverseFkSuppressList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteImplicitReverseFkSuppress> whiteImplicitReverseFkSuppressList) {
        InsertOption<WhiteImplicitReverseFkSuppressCB> op = createInsertUpdateOption();
        return doBatchInsert(whiteImplicitReverseFkSuppressList, op);
    }

    protected int[] doBatchInsert(List<WhiteImplicitReverseFkSuppress> whiteImplicitReverseFkSuppressList, InsertOption<WhiteImplicitReverseFkSuppressCB> op) {
        assertObjectNotNull("whiteImplicitReverseFkSuppressList", whiteImplicitReverseFkSuppressList);
        prepareBatchInsertOption(whiteImplicitReverseFkSuppressList, op);
        return delegateBatchInsert(whiteImplicitReverseFkSuppressList, op);
    }

    protected void prepareBatchInsertOption(List<WhiteImplicitReverseFkSuppress> whiteImplicitReverseFkSuppressList, InsertOption<WhiteImplicitReverseFkSuppressCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(whiteImplicitReverseFkSuppressList);
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
     *     WhiteImplicitReverseFkSuppress whiteImplicitReverseFkSuppress = new WhiteImplicitReverseFkSuppress();
     *     whiteImplicitReverseFkSuppress.setFooName("foo");
     *     if (...) {
     *         whiteImplicitReverseFkSuppress.setFooPrice(123);
     *     } else {
     *         whiteImplicitReverseFkSuppress.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteImplicitReverseFkSuppress.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteImplicitReverseFkSuppressList.add(whiteImplicitReverseFkSuppress);
     * }
     * whiteImplicitReverseFkSuppressBhv.<span style="color: #DD4747">batchUpdate</span>(whiteImplicitReverseFkSuppressList);
     * </pre>
     * @param whiteImplicitReverseFkSuppressList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteImplicitReverseFkSuppress> whiteImplicitReverseFkSuppressList) {
        UpdateOption<WhiteImplicitReverseFkSuppressCB> op = createPlainUpdateOption();
        return doBatchUpdate(whiteImplicitReverseFkSuppressList, op);
    }

    protected int[] doBatchUpdate(List<WhiteImplicitReverseFkSuppress> whiteImplicitReverseFkSuppressList, UpdateOption<WhiteImplicitReverseFkSuppressCB> op) {
        assertObjectNotNull("whiteImplicitReverseFkSuppressList", whiteImplicitReverseFkSuppressList);
        prepareBatchUpdateOption(whiteImplicitReverseFkSuppressList, op);
        return delegateBatchUpdate(whiteImplicitReverseFkSuppressList, op);
    }

    protected void prepareBatchUpdateOption(List<WhiteImplicitReverseFkSuppress> whiteImplicitReverseFkSuppressList, UpdateOption<WhiteImplicitReverseFkSuppressCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(whiteImplicitReverseFkSuppressList);
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
     * whiteImplicitReverseFkSuppressBhv.<span style="color: #DD4747">batchUpdate</span>(whiteImplicitReverseFkSuppressList, new SpecifyQuery<WhiteImplicitReverseFkSuppressCB>() {
     *     public void specify(WhiteImplicitReverseFkSuppressCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteImplicitReverseFkSuppressBhv.<span style="color: #DD4747">batchUpdate</span>(whiteImplicitReverseFkSuppressList, new SpecifyQuery<WhiteImplicitReverseFkSuppressCB>() {
     *     public void specify(WhiteImplicitReverseFkSuppressCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteImplicitReverseFkSuppressList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteImplicitReverseFkSuppress> whiteImplicitReverseFkSuppressList, SpecifyQuery<WhiteImplicitReverseFkSuppressCB> updateColumnSpec) {
        return doBatchUpdate(whiteImplicitReverseFkSuppressList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteImplicitReverseFkSuppressList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteImplicitReverseFkSuppress> whiteImplicitReverseFkSuppressList) {
        return doBatchDelete(whiteImplicitReverseFkSuppressList, null);
    }

    protected int[] doBatchDelete(List<WhiteImplicitReverseFkSuppress> whiteImplicitReverseFkSuppressList, DeleteOption<WhiteImplicitReverseFkSuppressCB> op) {
        assertObjectNotNull("whiteImplicitReverseFkSuppressList", whiteImplicitReverseFkSuppressList);
        prepareDeleteOption(op);
        return delegateBatchDelete(whiteImplicitReverseFkSuppressList, op);
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
     * whiteImplicitReverseFkSuppressBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteImplicitReverseFkSuppress, WhiteImplicitReverseFkSuppressCB&gt;() {
     *     public ConditionBean setup(whiteImplicitReverseFkSuppress entity, WhiteImplicitReverseFkSuppressCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteImplicitReverseFkSuppress, WhiteImplicitReverseFkSuppressCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteImplicitReverseFkSuppress, WhiteImplicitReverseFkSuppressCB> sp, InsertOption<WhiteImplicitReverseFkSuppressCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        WhiteImplicitReverseFkSuppress e = new WhiteImplicitReverseFkSuppress();
        WhiteImplicitReverseFkSuppressCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected WhiteImplicitReverseFkSuppressCB createCBForQueryInsert() {
        WhiteImplicitReverseFkSuppressCB cb = newMyConditionBean();
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
     * WhiteImplicitReverseFkSuppress whiteImplicitReverseFkSuppress = new WhiteImplicitReverseFkSuppress();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteImplicitReverseFkSuppress.setPK...(value);</span>
     * whiteImplicitReverseFkSuppress.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteImplicitReverseFkSuppress.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteImplicitReverseFkSuppress.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteImplicitReverseFkSuppress.setVersionNo(value);</span>
     * WhiteImplicitReverseFkSuppressCB cb = new WhiteImplicitReverseFkSuppressCB();
     * cb.query().setFoo...(value);
     * whiteImplicitReverseFkSuppressBhv.<span style="color: #DD4747">queryUpdate</span>(whiteImplicitReverseFkSuppress, cb);
     * </pre>
     * @param whiteImplicitReverseFkSuppress The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteImplicitReverseFkSuppress. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteImplicitReverseFkSuppress whiteImplicitReverseFkSuppress, WhiteImplicitReverseFkSuppressCB cb) {
        return doQueryUpdate(whiteImplicitReverseFkSuppress, cb, null);
    }

    protected int doQueryUpdate(WhiteImplicitReverseFkSuppress whiteImplicitReverseFkSuppress, WhiteImplicitReverseFkSuppressCB cb, UpdateOption<WhiteImplicitReverseFkSuppressCB> op) {
        assertObjectNotNull("whiteImplicitReverseFkSuppress", whiteImplicitReverseFkSuppress); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(whiteImplicitReverseFkSuppress, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (WhiteImplicitReverseFkSuppressCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (WhiteImplicitReverseFkSuppressCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteImplicitReverseFkSuppressCB cb = new WhiteImplicitReverseFkSuppressCB();
     * cb.query().setFoo...(value);
     * whiteImplicitReverseFkSuppressBhv.<span style="color: #DD4747">queryDelete</span>(whiteImplicitReverseFkSuppress, cb);
     * </pre>
     * @param cb The condition-bean of WhiteImplicitReverseFkSuppress. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteImplicitReverseFkSuppressCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteImplicitReverseFkSuppressCB cb, DeleteOption<WhiteImplicitReverseFkSuppressCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((WhiteImplicitReverseFkSuppressCB)cb); }
        else { return varyingQueryDelete((WhiteImplicitReverseFkSuppressCB)cb, downcast(op)); }
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
     * WhiteImplicitReverseFkSuppress whiteImplicitReverseFkSuppress = new WhiteImplicitReverseFkSuppress();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteImplicitReverseFkSuppress.setFoo...(value);
     * whiteImplicitReverseFkSuppress.setBar...(value);
     * InsertOption<WhiteImplicitReverseFkSuppressCB> option = new InsertOption<WhiteImplicitReverseFkSuppressCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteImplicitReverseFkSuppressBhv.<span style="color: #DD4747">varyingInsert</span>(whiteImplicitReverseFkSuppress, option);
     * ... = whiteImplicitReverseFkSuppress.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteImplicitReverseFkSuppress The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteImplicitReverseFkSuppress whiteImplicitReverseFkSuppress, InsertOption<WhiteImplicitReverseFkSuppressCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteImplicitReverseFkSuppress, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteImplicitReverseFkSuppress whiteImplicitReverseFkSuppress = new WhiteImplicitReverseFkSuppress();
     * whiteImplicitReverseFkSuppress.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteImplicitReverseFkSuppress.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteImplicitReverseFkSuppress.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteImplicitReverseFkSuppressCB&gt; option = new UpdateOption&lt;WhiteImplicitReverseFkSuppressCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteImplicitReverseFkSuppressCB&gt;() {
     *         public void specify(WhiteImplicitReverseFkSuppressCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteImplicitReverseFkSuppressBhv.<span style="color: #DD4747">varyingUpdate</span>(whiteImplicitReverseFkSuppress, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteImplicitReverseFkSuppress The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteImplicitReverseFkSuppress whiteImplicitReverseFkSuppress, UpdateOption<WhiteImplicitReverseFkSuppressCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteImplicitReverseFkSuppress, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteImplicitReverseFkSuppress The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteImplicitReverseFkSuppress whiteImplicitReverseFkSuppress, InsertOption<WhiteImplicitReverseFkSuppressCB> insertOption, UpdateOption<WhiteImplicitReverseFkSuppressCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(whiteImplicitReverseFkSuppress, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteImplicitReverseFkSuppress The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteImplicitReverseFkSuppress whiteImplicitReverseFkSuppress, DeleteOption<WhiteImplicitReverseFkSuppressCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteImplicitReverseFkSuppress, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteImplicitReverseFkSuppressList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteImplicitReverseFkSuppress> whiteImplicitReverseFkSuppressList, InsertOption<WhiteImplicitReverseFkSuppressCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteImplicitReverseFkSuppressList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteImplicitReverseFkSuppressList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteImplicitReverseFkSuppress> whiteImplicitReverseFkSuppressList, UpdateOption<WhiteImplicitReverseFkSuppressCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteImplicitReverseFkSuppressList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteImplicitReverseFkSuppressList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteImplicitReverseFkSuppress> whiteImplicitReverseFkSuppressList, DeleteOption<WhiteImplicitReverseFkSuppressCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteImplicitReverseFkSuppressList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteImplicitReverseFkSuppress, WhiteImplicitReverseFkSuppressCB> setupper, InsertOption<WhiteImplicitReverseFkSuppressCB> option) {
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
     * WhiteImplicitReverseFkSuppress whiteImplicitReverseFkSuppress = new WhiteImplicitReverseFkSuppress();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteImplicitReverseFkSuppress.setPK...(value);</span>
     * whiteImplicitReverseFkSuppress.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteImplicitReverseFkSuppress.setVersionNo(value);</span>
     * WhiteImplicitReverseFkSuppressCB cb = new WhiteImplicitReverseFkSuppressCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteImplicitReverseFkSuppressCB&gt; option = new UpdateOption&lt;WhiteImplicitReverseFkSuppressCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteImplicitReverseFkSuppressCB&gt;() {
     *     public void specify(WhiteImplicitReverseFkSuppressCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteImplicitReverseFkSuppressBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteImplicitReverseFkSuppress, cb, option);
     * </pre>
     * @param whiteImplicitReverseFkSuppress The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteImplicitReverseFkSuppress. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteImplicitReverseFkSuppress whiteImplicitReverseFkSuppress, WhiteImplicitReverseFkSuppressCB cb, UpdateOption<WhiteImplicitReverseFkSuppressCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteImplicitReverseFkSuppress, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteImplicitReverseFkSuppress. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteImplicitReverseFkSuppressCB cb, DeleteOption<WhiteImplicitReverseFkSuppressCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteImplicitReverseFkSuppressBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhiteImplicitReverseFkSuppressCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhiteImplicitReverseFkSuppressCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhiteImplicitReverseFkSuppress> void delegateSelectCursor(WhiteImplicitReverseFkSuppressCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends WhiteImplicitReverseFkSuppress> List<ENTITY> delegateSelectList(WhiteImplicitReverseFkSuppressCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhiteImplicitReverseFkSuppress et, InsertOption<WhiteImplicitReverseFkSuppressCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(WhiteImplicitReverseFkSuppress et, UpdateOption<WhiteImplicitReverseFkSuppressCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(WhiteImplicitReverseFkSuppress et, UpdateOption<WhiteImplicitReverseFkSuppressCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(WhiteImplicitReverseFkSuppress et, DeleteOption<WhiteImplicitReverseFkSuppressCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(WhiteImplicitReverseFkSuppress et, DeleteOption<WhiteImplicitReverseFkSuppressCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<WhiteImplicitReverseFkSuppress> ls, InsertOption<WhiteImplicitReverseFkSuppressCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhiteImplicitReverseFkSuppress> ls, UpdateOption<WhiteImplicitReverseFkSuppressCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhiteImplicitReverseFkSuppress> ls, UpdateOption<WhiteImplicitReverseFkSuppressCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhiteImplicitReverseFkSuppress> ls, DeleteOption<WhiteImplicitReverseFkSuppressCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhiteImplicitReverseFkSuppress> ls, DeleteOption<WhiteImplicitReverseFkSuppressCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhiteImplicitReverseFkSuppress et, WhiteImplicitReverseFkSuppressCB inCB, ConditionBean resCB, InsertOption<WhiteImplicitReverseFkSuppressCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhiteImplicitReverseFkSuppress et, WhiteImplicitReverseFkSuppressCB cb, UpdateOption<WhiteImplicitReverseFkSuppressCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(WhiteImplicitReverseFkSuppressCB cb, DeleteOption<WhiteImplicitReverseFkSuppressCB> op)
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
    protected WhiteImplicitReverseFkSuppress downcast(Entity et) {
        return helpEntityDowncastInternally(et, WhiteImplicitReverseFkSuppress.class);
    }

    protected WhiteImplicitReverseFkSuppressCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, WhiteImplicitReverseFkSuppressCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<WhiteImplicitReverseFkSuppress> downcast(List<? extends Entity> ls) {
        return (List<WhiteImplicitReverseFkSuppress>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteImplicitReverseFkSuppressCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<WhiteImplicitReverseFkSuppressCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteImplicitReverseFkSuppressCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<WhiteImplicitReverseFkSuppressCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteImplicitReverseFkSuppressCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<WhiteImplicitReverseFkSuppressCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteImplicitReverseFkSuppress, WhiteImplicitReverseFkSuppressCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<WhiteImplicitReverseFkSuppress, WhiteImplicitReverseFkSuppressCB>)sp;
    }
}
