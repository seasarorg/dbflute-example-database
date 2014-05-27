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
 * The behavior of WHITE_SUPPRESS_JOIN_SQ_ONE_ADDI as TABLE. <br />
 * <pre>
 * [primary key]
 *     ONE_ADDI_ID
 *
 * [column]
 *     ONE_ADDI_ID, ONE_ADDI_NAME
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
public abstract class BsWhiteSuppressJoinSqOneAddiBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_suppress_join_sq_one_addi"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return WhiteSuppressJoinSqOneAddiDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteSuppressJoinSqOneAddiDbm getMyDBMeta() { return WhiteSuppressJoinSqOneAddiDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteSuppressJoinSqOneAddi newMyEntity() { return new WhiteSuppressJoinSqOneAddi(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteSuppressJoinSqOneAddiCB newMyConditionBean() { return new WhiteSuppressJoinSqOneAddiCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteSuppressJoinSqOneAddiCB cb = new WhiteSuppressJoinSqOneAddiCB();
     * cb.query().setFoo...(value);
     * int count = whiteSuppressJoinSqOneAddiBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteSuppressJoinSqOneAddi. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteSuppressJoinSqOneAddiCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteSuppressJoinSqOneAddiCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteSuppressJoinSqOneAddiCB cb) { // called by selectPage(cb)
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
     * WhiteSuppressJoinSqOneAddiCB cb = new WhiteSuppressJoinSqOneAddiCB();
     * cb.query().setFoo...(value);
     * WhiteSuppressJoinSqOneAddi whiteSuppressJoinSqOneAddi = whiteSuppressJoinSqOneAddiBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (whiteSuppressJoinSqOneAddi != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = whiteSuppressJoinSqOneAddi.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSuppressJoinSqOneAddi. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSuppressJoinSqOneAddi selectEntity(WhiteSuppressJoinSqOneAddiCB cb) {
        return doSelectEntity(cb, WhiteSuppressJoinSqOneAddi.class);
    }

    protected <ENTITY extends WhiteSuppressJoinSqOneAddi> ENTITY doSelectEntity(WhiteSuppressJoinSqOneAddiCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, WhiteSuppressJoinSqOneAddiCB>() {
            public List<ENTITY> callbackSelectList(WhiteSuppressJoinSqOneAddiCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    protected <ENTITY extends WhiteSuppressJoinSqOneAddi> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteSuppressJoinSqOneAddiCB cb, Class<ENTITY> tp) {
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
     * WhiteSuppressJoinSqOneAddiCB cb = new WhiteSuppressJoinSqOneAddiCB();
     * cb.query().setFoo...(value);
     * WhiteSuppressJoinSqOneAddi whiteSuppressJoinSqOneAddi = whiteSuppressJoinSqOneAddiBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteSuppressJoinSqOneAddi.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteSuppressJoinSqOneAddi. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSuppressJoinSqOneAddi selectEntityWithDeletedCheck(WhiteSuppressJoinSqOneAddiCB cb) {
        return doSelectEntityWithDeletedCheck(cb, WhiteSuppressJoinSqOneAddi.class);
    }

    protected <ENTITY extends WhiteSuppressJoinSqOneAddi> ENTITY doSelectEntityWithDeletedCheck(WhiteSuppressJoinSqOneAddiCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteSuppressJoinSqOneAddiCB>() {
            public List<ENTITY> callbackSelectList(WhiteSuppressJoinSqOneAddiCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param oneAddiId : PK, NotNull, INT(10). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSuppressJoinSqOneAddi selectByPKValue(Integer oneAddiId) {
        return doSelectByPK(oneAddiId, WhiteSuppressJoinSqOneAddi.class);
    }

    protected <ENTITY extends WhiteSuppressJoinSqOneAddi> ENTITY doSelectByPK(Integer oneAddiId, Class<ENTITY> entityType) {
        return doSelectEntity(xprepareCBAsPK(oneAddiId), entityType);
    }

    protected <ENTITY extends WhiteSuppressJoinSqOneAddi> OptionalEntity<ENTITY> doSelectOptionalByPK(Integer oneAddiId, Class<ENTITY> entityType) {
        return createOptionalEntity(doSelectByPK(oneAddiId, entityType), oneAddiId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param oneAddiId : PK, NotNull, INT(10). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSuppressJoinSqOneAddi selectByPKValueWithDeletedCheck(Integer oneAddiId) {
        return doSelectByPKWithDeletedCheck(oneAddiId, WhiteSuppressJoinSqOneAddi.class);
    }

    protected <ENTITY extends WhiteSuppressJoinSqOneAddi> ENTITY doSelectByPKWithDeletedCheck(Integer oneAddiId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(oneAddiId), entityType);
    }

    protected WhiteSuppressJoinSqOneAddiCB xprepareCBAsPK(Integer oneAddiId) {
        assertObjectNotNull("oneAddiId", oneAddiId);
        WhiteSuppressJoinSqOneAddiCB cb = newMyConditionBean(); cb.acceptPrimaryKey(oneAddiId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteSuppressJoinSqOneAddiCB cb = new WhiteSuppressJoinSqOneAddiCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteSuppressJoinSqOneAddi&gt; whiteSuppressJoinSqOneAddiList = whiteSuppressJoinSqOneAddiBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteSuppressJoinSqOneAddi whiteSuppressJoinSqOneAddi : whiteSuppressJoinSqOneAddiList) {
     *     ... = whiteSuppressJoinSqOneAddi.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSuppressJoinSqOneAddi. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteSuppressJoinSqOneAddi> selectList(WhiteSuppressJoinSqOneAddiCB cb) {
        return doSelectList(cb, WhiteSuppressJoinSqOneAddi.class);
    }

    protected <ENTITY extends WhiteSuppressJoinSqOneAddi> ListResultBean<ENTITY> doSelectList(WhiteSuppressJoinSqOneAddiCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, WhiteSuppressJoinSqOneAddiCB>() {
            public List<ENTITY> callbackSelectList(WhiteSuppressJoinSqOneAddiCB lcb, Class<ENTITY> ltp) { return delegateSelectList(lcb, ltp); } });
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
     * WhiteSuppressJoinSqOneAddiCB cb = new WhiteSuppressJoinSqOneAddiCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteSuppressJoinSqOneAddi&gt; page = whiteSuppressJoinSqOneAddiBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteSuppressJoinSqOneAddi whiteSuppressJoinSqOneAddi : page) {
     *     ... = whiteSuppressJoinSqOneAddi.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSuppressJoinSqOneAddi. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteSuppressJoinSqOneAddi> selectPage(WhiteSuppressJoinSqOneAddiCB cb) {
        return doSelectPage(cb, WhiteSuppressJoinSqOneAddi.class);
    }

    protected <ENTITY extends WhiteSuppressJoinSqOneAddi> PagingResultBean<ENTITY> doSelectPage(WhiteSuppressJoinSqOneAddiCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, WhiteSuppressJoinSqOneAddiCB>() {
            public int callbackSelectCount(WhiteSuppressJoinSqOneAddiCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteSuppressJoinSqOneAddiCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * WhiteSuppressJoinSqOneAddiCB cb = new WhiteSuppressJoinSqOneAddiCB();
     * cb.query().setFoo...(value);
     * whiteSuppressJoinSqOneAddiBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteSuppressJoinSqOneAddi&gt;() {
     *     public void handle(WhiteSuppressJoinSqOneAddi entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteSuppressJoinSqOneAddi. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteSuppressJoinSqOneAddi. (NotNull)
     */
    public void selectCursor(WhiteSuppressJoinSqOneAddiCB cb, EntityRowHandler<WhiteSuppressJoinSqOneAddi> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, WhiteSuppressJoinSqOneAddi.class);
    }

    protected <ENTITY extends WhiteSuppressJoinSqOneAddi> void doSelectCursor(WhiteSuppressJoinSqOneAddiCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, WhiteSuppressJoinSqOneAddiCB>() {
            public void callbackSelectCursor(WhiteSuppressJoinSqOneAddiCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(WhiteSuppressJoinSqOneAddiCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteSuppressJoinSqOneAddiBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteSuppressJoinSqOneAddiCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<WhiteSuppressJoinSqOneAddiCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends WhiteSuppressJoinSqOneAddiCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends WhiteSuppressJoinSqOneAddiCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
     * Extract the value list of (single) primary key oneAddiId.
     * @param whiteSuppressJoinSqOneAddiList The list of whiteSuppressJoinSqOneAddi. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractOneAddiIdList(List<WhiteSuppressJoinSqOneAddi> whiteSuppressJoinSqOneAddiList) {
        return helpExtractListInternally(whiteSuppressJoinSqOneAddiList, new InternalExtractCallback<WhiteSuppressJoinSqOneAddi, Integer>() {
            public Integer getCV(WhiteSuppressJoinSqOneAddi et) { return et.getOneAddiId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteSuppressJoinSqOneAddi whiteSuppressJoinSqOneAddi = new WhiteSuppressJoinSqOneAddi();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteSuppressJoinSqOneAddi.setFoo...(value);
     * whiteSuppressJoinSqOneAddi.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqOneAddi.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqOneAddi.set...;</span>
     * whiteSuppressJoinSqOneAddiBhv.<span style="color: #DD4747">insert</span>(whiteSuppressJoinSqOneAddi);
     * ... = whiteSuppressJoinSqOneAddi.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteSuppressJoinSqOneAddi The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteSuppressJoinSqOneAddi whiteSuppressJoinSqOneAddi) {
        doInsert(whiteSuppressJoinSqOneAddi, null);
    }

    protected void doInsert(WhiteSuppressJoinSqOneAddi whiteSuppressJoinSqOneAddi, InsertOption<WhiteSuppressJoinSqOneAddiCB> op) {
        assertObjectNotNull("whiteSuppressJoinSqOneAddi", whiteSuppressJoinSqOneAddi);
        prepareInsertOption(op);
        delegateInsert(whiteSuppressJoinSqOneAddi, op);
    }

    protected void prepareInsertOption(InsertOption<WhiteSuppressJoinSqOneAddiCB> op) {
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
     * WhiteSuppressJoinSqOneAddi whiteSuppressJoinSqOneAddi = new WhiteSuppressJoinSqOneAddi();
     * whiteSuppressJoinSqOneAddi.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteSuppressJoinSqOneAddi.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqOneAddi.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqOneAddi.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteSuppressJoinSqOneAddi.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteSuppressJoinSqOneAddiBhv.<span style="color: #DD4747">update</span>(whiteSuppressJoinSqOneAddi);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSuppressJoinSqOneAddi The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final WhiteSuppressJoinSqOneAddi whiteSuppressJoinSqOneAddi) {
        doUpdate(whiteSuppressJoinSqOneAddi, null);
    }

    protected void doUpdate(WhiteSuppressJoinSqOneAddi whiteSuppressJoinSqOneAddi, final UpdateOption<WhiteSuppressJoinSqOneAddiCB> op) {
        assertObjectNotNull("whiteSuppressJoinSqOneAddi", whiteSuppressJoinSqOneAddi);
        prepareUpdateOption(op);
        helpUpdateInternally(whiteSuppressJoinSqOneAddi, new InternalUpdateCallback<WhiteSuppressJoinSqOneAddi>() {
            public int callbackDelegateUpdate(WhiteSuppressJoinSqOneAddi et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhiteSuppressJoinSqOneAddiCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected WhiteSuppressJoinSqOneAddiCB createCBForVaryingUpdate() {
        WhiteSuppressJoinSqOneAddiCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected WhiteSuppressJoinSqOneAddiCB createCBForSpecifiedUpdate() {
        WhiteSuppressJoinSqOneAddiCB cb = newMyConditionBean();
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
     * @param whiteSuppressJoinSqOneAddi The entity of insert or update target. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteSuppressJoinSqOneAddi whiteSuppressJoinSqOneAddi) {
        doInesrtOrUpdate(whiteSuppressJoinSqOneAddi, null, null);
    }

    protected void doInesrtOrUpdate(WhiteSuppressJoinSqOneAddi whiteSuppressJoinSqOneAddi, final InsertOption<WhiteSuppressJoinSqOneAddiCB> iop, final UpdateOption<WhiteSuppressJoinSqOneAddiCB> uop) {
        helpInsertOrUpdateInternally(whiteSuppressJoinSqOneAddi, new InternalInsertOrUpdateCallback<WhiteSuppressJoinSqOneAddi, WhiteSuppressJoinSqOneAddiCB>() {
            public void callbackInsert(WhiteSuppressJoinSqOneAddi et) { doInsert(et, iop); }
            public void callbackUpdate(WhiteSuppressJoinSqOneAddi et) { doUpdate(et, uop); }
            public WhiteSuppressJoinSqOneAddiCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(WhiteSuppressJoinSqOneAddiCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<WhiteSuppressJoinSqOneAddiCB>();
            uop = uop != null ? uop : new UpdateOption<WhiteSuppressJoinSqOneAddiCB>();
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
     * WhiteSuppressJoinSqOneAddi whiteSuppressJoinSqOneAddi = new WhiteSuppressJoinSqOneAddi();
     * whiteSuppressJoinSqOneAddi.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteSuppressJoinSqOneAddi.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteSuppressJoinSqOneAddiBhv.<span style="color: #DD4747">delete</span>(whiteSuppressJoinSqOneAddi);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSuppressJoinSqOneAddi The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteSuppressJoinSqOneAddi whiteSuppressJoinSqOneAddi) {
        doDelete(whiteSuppressJoinSqOneAddi, null);
    }

    protected void doDelete(WhiteSuppressJoinSqOneAddi whiteSuppressJoinSqOneAddi, final DeleteOption<WhiteSuppressJoinSqOneAddiCB> op) {
        assertObjectNotNull("whiteSuppressJoinSqOneAddi", whiteSuppressJoinSqOneAddi);
        prepareDeleteOption(op);
        helpDeleteInternally(whiteSuppressJoinSqOneAddi, new InternalDeleteCallback<WhiteSuppressJoinSqOneAddi>() {
            public int callbackDelegateDelete(WhiteSuppressJoinSqOneAddi et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhiteSuppressJoinSqOneAddiCB> op) {
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
     *     WhiteSuppressJoinSqOneAddi whiteSuppressJoinSqOneAddi = new WhiteSuppressJoinSqOneAddi();
     *     whiteSuppressJoinSqOneAddi.setFooName("foo");
     *     if (...) {
     *         whiteSuppressJoinSqOneAddi.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteSuppressJoinSqOneAddiList.add(whiteSuppressJoinSqOneAddi);
     * }
     * whiteSuppressJoinSqOneAddiBhv.<span style="color: #DD4747">batchInsert</span>(whiteSuppressJoinSqOneAddiList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteSuppressJoinSqOneAddiList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteSuppressJoinSqOneAddi> whiteSuppressJoinSqOneAddiList) {
        InsertOption<WhiteSuppressJoinSqOneAddiCB> op = createInsertUpdateOption();
        return doBatchInsert(whiteSuppressJoinSqOneAddiList, op);
    }

    protected int[] doBatchInsert(List<WhiteSuppressJoinSqOneAddi> whiteSuppressJoinSqOneAddiList, InsertOption<WhiteSuppressJoinSqOneAddiCB> op) {
        assertObjectNotNull("whiteSuppressJoinSqOneAddiList", whiteSuppressJoinSqOneAddiList);
        prepareBatchInsertOption(whiteSuppressJoinSqOneAddiList, op);
        return delegateBatchInsert(whiteSuppressJoinSqOneAddiList, op);
    }

    protected void prepareBatchInsertOption(List<WhiteSuppressJoinSqOneAddi> whiteSuppressJoinSqOneAddiList, InsertOption<WhiteSuppressJoinSqOneAddiCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(whiteSuppressJoinSqOneAddiList);
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
     *     WhiteSuppressJoinSqOneAddi whiteSuppressJoinSqOneAddi = new WhiteSuppressJoinSqOneAddi();
     *     whiteSuppressJoinSqOneAddi.setFooName("foo");
     *     if (...) {
     *         whiteSuppressJoinSqOneAddi.setFooPrice(123);
     *     } else {
     *         whiteSuppressJoinSqOneAddi.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteSuppressJoinSqOneAddi.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteSuppressJoinSqOneAddiList.add(whiteSuppressJoinSqOneAddi);
     * }
     * whiteSuppressJoinSqOneAddiBhv.<span style="color: #DD4747">batchUpdate</span>(whiteSuppressJoinSqOneAddiList);
     * </pre>
     * @param whiteSuppressJoinSqOneAddiList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteSuppressJoinSqOneAddi> whiteSuppressJoinSqOneAddiList) {
        UpdateOption<WhiteSuppressJoinSqOneAddiCB> op = createPlainUpdateOption();
        return doBatchUpdate(whiteSuppressJoinSqOneAddiList, op);
    }

    protected int[] doBatchUpdate(List<WhiteSuppressJoinSqOneAddi> whiteSuppressJoinSqOneAddiList, UpdateOption<WhiteSuppressJoinSqOneAddiCB> op) {
        assertObjectNotNull("whiteSuppressJoinSqOneAddiList", whiteSuppressJoinSqOneAddiList);
        prepareBatchUpdateOption(whiteSuppressJoinSqOneAddiList, op);
        return delegateBatchUpdate(whiteSuppressJoinSqOneAddiList, op);
    }

    protected void prepareBatchUpdateOption(List<WhiteSuppressJoinSqOneAddi> whiteSuppressJoinSqOneAddiList, UpdateOption<WhiteSuppressJoinSqOneAddiCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(whiteSuppressJoinSqOneAddiList);
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
     * whiteSuppressJoinSqOneAddiBhv.<span style="color: #DD4747">batchUpdate</span>(whiteSuppressJoinSqOneAddiList, new SpecifyQuery<WhiteSuppressJoinSqOneAddiCB>() {
     *     public void specify(WhiteSuppressJoinSqOneAddiCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteSuppressJoinSqOneAddiBhv.<span style="color: #DD4747">batchUpdate</span>(whiteSuppressJoinSqOneAddiList, new SpecifyQuery<WhiteSuppressJoinSqOneAddiCB>() {
     *     public void specify(WhiteSuppressJoinSqOneAddiCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteSuppressJoinSqOneAddiList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteSuppressJoinSqOneAddi> whiteSuppressJoinSqOneAddiList, SpecifyQuery<WhiteSuppressJoinSqOneAddiCB> updateColumnSpec) {
        return doBatchUpdate(whiteSuppressJoinSqOneAddiList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteSuppressJoinSqOneAddiList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteSuppressJoinSqOneAddi> whiteSuppressJoinSqOneAddiList) {
        return doBatchDelete(whiteSuppressJoinSqOneAddiList, null);
    }

    protected int[] doBatchDelete(List<WhiteSuppressJoinSqOneAddi> whiteSuppressJoinSqOneAddiList, DeleteOption<WhiteSuppressJoinSqOneAddiCB> op) {
        assertObjectNotNull("whiteSuppressJoinSqOneAddiList", whiteSuppressJoinSqOneAddiList);
        prepareDeleteOption(op);
        return delegateBatchDelete(whiteSuppressJoinSqOneAddiList, op);
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
     * whiteSuppressJoinSqOneAddiBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteSuppressJoinSqOneAddi, WhiteSuppressJoinSqOneAddiCB&gt;() {
     *     public ConditionBean setup(whiteSuppressJoinSqOneAddi entity, WhiteSuppressJoinSqOneAddiCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteSuppressJoinSqOneAddi, WhiteSuppressJoinSqOneAddiCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteSuppressJoinSqOneAddi, WhiteSuppressJoinSqOneAddiCB> sp, InsertOption<WhiteSuppressJoinSqOneAddiCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        WhiteSuppressJoinSqOneAddi e = new WhiteSuppressJoinSqOneAddi();
        WhiteSuppressJoinSqOneAddiCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected WhiteSuppressJoinSqOneAddiCB createCBForQueryInsert() {
        WhiteSuppressJoinSqOneAddiCB cb = newMyConditionBean();
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
     * WhiteSuppressJoinSqOneAddi whiteSuppressJoinSqOneAddi = new WhiteSuppressJoinSqOneAddi();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqOneAddi.setPK...(value);</span>
     * whiteSuppressJoinSqOneAddi.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqOneAddi.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqOneAddi.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqOneAddi.setVersionNo(value);</span>
     * WhiteSuppressJoinSqOneAddiCB cb = new WhiteSuppressJoinSqOneAddiCB();
     * cb.query().setFoo...(value);
     * whiteSuppressJoinSqOneAddiBhv.<span style="color: #DD4747">queryUpdate</span>(whiteSuppressJoinSqOneAddi, cb);
     * </pre>
     * @param whiteSuppressJoinSqOneAddi The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteSuppressJoinSqOneAddi. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteSuppressJoinSqOneAddi whiteSuppressJoinSqOneAddi, WhiteSuppressJoinSqOneAddiCB cb) {
        return doQueryUpdate(whiteSuppressJoinSqOneAddi, cb, null);
    }

    protected int doQueryUpdate(WhiteSuppressJoinSqOneAddi whiteSuppressJoinSqOneAddi, WhiteSuppressJoinSqOneAddiCB cb, UpdateOption<WhiteSuppressJoinSqOneAddiCB> op) {
        assertObjectNotNull("whiteSuppressJoinSqOneAddi", whiteSuppressJoinSqOneAddi); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(whiteSuppressJoinSqOneAddi, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (WhiteSuppressJoinSqOneAddiCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (WhiteSuppressJoinSqOneAddiCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteSuppressJoinSqOneAddiCB cb = new WhiteSuppressJoinSqOneAddiCB();
     * cb.query().setFoo...(value);
     * whiteSuppressJoinSqOneAddiBhv.<span style="color: #DD4747">queryDelete</span>(whiteSuppressJoinSqOneAddi, cb);
     * </pre>
     * @param cb The condition-bean of WhiteSuppressJoinSqOneAddi. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteSuppressJoinSqOneAddiCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteSuppressJoinSqOneAddiCB cb, DeleteOption<WhiteSuppressJoinSqOneAddiCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((WhiteSuppressJoinSqOneAddiCB)cb); }
        else { return varyingQueryDelete((WhiteSuppressJoinSqOneAddiCB)cb, downcast(op)); }
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
     * WhiteSuppressJoinSqOneAddi whiteSuppressJoinSqOneAddi = new WhiteSuppressJoinSqOneAddi();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteSuppressJoinSqOneAddi.setFoo...(value);
     * whiteSuppressJoinSqOneAddi.setBar...(value);
     * InsertOption<WhiteSuppressJoinSqOneAddiCB> option = new InsertOption<WhiteSuppressJoinSqOneAddiCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteSuppressJoinSqOneAddiBhv.<span style="color: #DD4747">varyingInsert</span>(whiteSuppressJoinSqOneAddi, option);
     * ... = whiteSuppressJoinSqOneAddi.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteSuppressJoinSqOneAddi The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteSuppressJoinSqOneAddi whiteSuppressJoinSqOneAddi, InsertOption<WhiteSuppressJoinSqOneAddiCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteSuppressJoinSqOneAddi, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteSuppressJoinSqOneAddi whiteSuppressJoinSqOneAddi = new WhiteSuppressJoinSqOneAddi();
     * whiteSuppressJoinSqOneAddi.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteSuppressJoinSqOneAddi.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteSuppressJoinSqOneAddi.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteSuppressJoinSqOneAddiCB&gt; option = new UpdateOption&lt;WhiteSuppressJoinSqOneAddiCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteSuppressJoinSqOneAddiCB&gt;() {
     *         public void specify(WhiteSuppressJoinSqOneAddiCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteSuppressJoinSqOneAddiBhv.<span style="color: #DD4747">varyingUpdate</span>(whiteSuppressJoinSqOneAddi, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSuppressJoinSqOneAddi The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteSuppressJoinSqOneAddi whiteSuppressJoinSqOneAddi, UpdateOption<WhiteSuppressJoinSqOneAddiCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteSuppressJoinSqOneAddi, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteSuppressJoinSqOneAddi The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteSuppressJoinSqOneAddi whiteSuppressJoinSqOneAddi, InsertOption<WhiteSuppressJoinSqOneAddiCB> insertOption, UpdateOption<WhiteSuppressJoinSqOneAddiCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(whiteSuppressJoinSqOneAddi, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteSuppressJoinSqOneAddi The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteSuppressJoinSqOneAddi whiteSuppressJoinSqOneAddi, DeleteOption<WhiteSuppressJoinSqOneAddiCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteSuppressJoinSqOneAddi, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteSuppressJoinSqOneAddiList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteSuppressJoinSqOneAddi> whiteSuppressJoinSqOneAddiList, InsertOption<WhiteSuppressJoinSqOneAddiCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteSuppressJoinSqOneAddiList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteSuppressJoinSqOneAddiList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteSuppressJoinSqOneAddi> whiteSuppressJoinSqOneAddiList, UpdateOption<WhiteSuppressJoinSqOneAddiCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteSuppressJoinSqOneAddiList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteSuppressJoinSqOneAddiList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteSuppressJoinSqOneAddi> whiteSuppressJoinSqOneAddiList, DeleteOption<WhiteSuppressJoinSqOneAddiCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteSuppressJoinSqOneAddiList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteSuppressJoinSqOneAddi, WhiteSuppressJoinSqOneAddiCB> setupper, InsertOption<WhiteSuppressJoinSqOneAddiCB> option) {
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
     * WhiteSuppressJoinSqOneAddi whiteSuppressJoinSqOneAddi = new WhiteSuppressJoinSqOneAddi();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqOneAddi.setPK...(value);</span>
     * whiteSuppressJoinSqOneAddi.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSuppressJoinSqOneAddi.setVersionNo(value);</span>
     * WhiteSuppressJoinSqOneAddiCB cb = new WhiteSuppressJoinSqOneAddiCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteSuppressJoinSqOneAddiCB&gt; option = new UpdateOption&lt;WhiteSuppressJoinSqOneAddiCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteSuppressJoinSqOneAddiCB&gt;() {
     *     public void specify(WhiteSuppressJoinSqOneAddiCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteSuppressJoinSqOneAddiBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteSuppressJoinSqOneAddi, cb, option);
     * </pre>
     * @param whiteSuppressJoinSqOneAddi The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteSuppressJoinSqOneAddi. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteSuppressJoinSqOneAddi whiteSuppressJoinSqOneAddi, WhiteSuppressJoinSqOneAddiCB cb, UpdateOption<WhiteSuppressJoinSqOneAddiCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteSuppressJoinSqOneAddi, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteSuppressJoinSqOneAddi. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteSuppressJoinSqOneAddiCB cb, DeleteOption<WhiteSuppressJoinSqOneAddiCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteSuppressJoinSqOneAddiBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhiteSuppressJoinSqOneAddiCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhiteSuppressJoinSqOneAddiCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhiteSuppressJoinSqOneAddi> void delegateSelectCursor(WhiteSuppressJoinSqOneAddiCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends WhiteSuppressJoinSqOneAddi> List<ENTITY> delegateSelectList(WhiteSuppressJoinSqOneAddiCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhiteSuppressJoinSqOneAddi et, InsertOption<WhiteSuppressJoinSqOneAddiCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(WhiteSuppressJoinSqOneAddi et, UpdateOption<WhiteSuppressJoinSqOneAddiCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(WhiteSuppressJoinSqOneAddi et, UpdateOption<WhiteSuppressJoinSqOneAddiCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(WhiteSuppressJoinSqOneAddi et, DeleteOption<WhiteSuppressJoinSqOneAddiCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(WhiteSuppressJoinSqOneAddi et, DeleteOption<WhiteSuppressJoinSqOneAddiCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<WhiteSuppressJoinSqOneAddi> ls, InsertOption<WhiteSuppressJoinSqOneAddiCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhiteSuppressJoinSqOneAddi> ls, UpdateOption<WhiteSuppressJoinSqOneAddiCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhiteSuppressJoinSqOneAddi> ls, UpdateOption<WhiteSuppressJoinSqOneAddiCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhiteSuppressJoinSqOneAddi> ls, DeleteOption<WhiteSuppressJoinSqOneAddiCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhiteSuppressJoinSqOneAddi> ls, DeleteOption<WhiteSuppressJoinSqOneAddiCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhiteSuppressJoinSqOneAddi et, WhiteSuppressJoinSqOneAddiCB inCB, ConditionBean resCB, InsertOption<WhiteSuppressJoinSqOneAddiCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhiteSuppressJoinSqOneAddi et, WhiteSuppressJoinSqOneAddiCB cb, UpdateOption<WhiteSuppressJoinSqOneAddiCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(WhiteSuppressJoinSqOneAddiCB cb, DeleteOption<WhiteSuppressJoinSqOneAddiCB> op)
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
    protected WhiteSuppressJoinSqOneAddi downcast(Entity et) {
        return helpEntityDowncastInternally(et, WhiteSuppressJoinSqOneAddi.class);
    }

    protected WhiteSuppressJoinSqOneAddiCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, WhiteSuppressJoinSqOneAddiCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<WhiteSuppressJoinSqOneAddi> downcast(List<? extends Entity> ls) {
        return (List<WhiteSuppressJoinSqOneAddi>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteSuppressJoinSqOneAddiCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<WhiteSuppressJoinSqOneAddiCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteSuppressJoinSqOneAddiCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<WhiteSuppressJoinSqOneAddiCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteSuppressJoinSqOneAddiCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<WhiteSuppressJoinSqOneAddiCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteSuppressJoinSqOneAddi, WhiteSuppressJoinSqOneAddiCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<WhiteSuppressJoinSqOneAddi, WhiteSuppressJoinSqOneAddiCB>)sp;
    }
}
