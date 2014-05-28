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
import com.example.dbflute.mysql.dbflute.allcommon.CDef;
import com.example.dbflute.mysql.dbflute.exbhv.*;
import com.example.dbflute.mysql.dbflute.exentity.*;
import com.example.dbflute.mysql.dbflute.bsentity.dbmeta.*;
import com.example.dbflute.mysql.dbflute.cbean.*;

/**
 * The behavior of WHITE_UQ_CLASSIFICATION as TABLE. <br />
 * <pre>
 * [primary key]
 *     UQ_CLS_ID
 *
 * [column]
 *     UQ_CLS_ID, UQ_CLS_CODE
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
public abstract class BsWhiteUqClassificationBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_uq_classification"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return WhiteUqClassificationDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteUqClassificationDbm getMyDBMeta() { return WhiteUqClassificationDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteUqClassification newMyEntity() { return new WhiteUqClassification(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteUqClassificationCB newMyConditionBean() { return new WhiteUqClassificationCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteUqClassificationCB cb = new WhiteUqClassificationCB();
     * cb.query().setFoo...(value);
     * int count = whiteUqClassificationBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteUqClassification. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteUqClassificationCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteUqClassificationCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteUqClassificationCB cb) { // called by selectPage(cb)
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
     * WhiteUqClassificationCB cb = new WhiteUqClassificationCB();
     * cb.query().setFoo...(value);
     * WhiteUqClassification whiteUqClassification = whiteUqClassificationBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (whiteUqClassification != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = whiteUqClassification.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteUqClassification. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteUqClassification selectEntity(WhiteUqClassificationCB cb) {
        return doSelectEntity(cb, WhiteUqClassification.class);
    }

    protected <ENTITY extends WhiteUqClassification> ENTITY doSelectEntity(WhiteUqClassificationCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, WhiteUqClassificationCB>() {
            public List<ENTITY> callbackSelectList(WhiteUqClassificationCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    protected <ENTITY extends WhiteUqClassification> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteUqClassificationCB cb, Class<ENTITY> tp) {
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
     * WhiteUqClassificationCB cb = new WhiteUqClassificationCB();
     * cb.query().setFoo...(value);
     * WhiteUqClassification whiteUqClassification = whiteUqClassificationBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteUqClassification.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteUqClassification. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteUqClassification selectEntityWithDeletedCheck(WhiteUqClassificationCB cb) {
        return doSelectEntityWithDeletedCheck(cb, WhiteUqClassification.class);
    }

    protected <ENTITY extends WhiteUqClassification> ENTITY doSelectEntityWithDeletedCheck(WhiteUqClassificationCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteUqClassificationCB>() {
            public List<ENTITY> callbackSelectList(WhiteUqClassificationCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param uqClsId : PK, NotNull, DECIMAL(16). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteUqClassification selectByPKValue(Long uqClsId) {
        return doSelectByPK(uqClsId, WhiteUqClassification.class);
    }

    protected <ENTITY extends WhiteUqClassification> ENTITY doSelectByPK(Long uqClsId, Class<ENTITY> entityType) {
        return doSelectEntity(xprepareCBAsPK(uqClsId), entityType);
    }

    protected <ENTITY extends WhiteUqClassification> OptionalEntity<ENTITY> doSelectOptionalByPK(Long uqClsId, Class<ENTITY> entityType) {
        return createOptionalEntity(doSelectByPK(uqClsId, entityType), uqClsId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param uqClsId : PK, NotNull, DECIMAL(16). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteUqClassification selectByPKValueWithDeletedCheck(Long uqClsId) {
        return doSelectByPKWithDeletedCheck(uqClsId, WhiteUqClassification.class);
    }

    protected <ENTITY extends WhiteUqClassification> ENTITY doSelectByPKWithDeletedCheck(Long uqClsId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(uqClsId), entityType);
    }

    protected WhiteUqClassificationCB xprepareCBAsPK(Long uqClsId) {
        assertObjectNotNull("uqClsId", uqClsId);
        WhiteUqClassificationCB cb = newMyConditionBean(); cb.acceptPrimaryKey(uqClsId);
        return cb;
    }

    /**
     * Select the entity by the unique-key value.
     * @param uqClsCode : UQ, NotNull, CHAR(3), classification=UQClassificationType. (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteUqClassification> selectByUniqueOf(CDef.UQClassificationType uqClsCode) {
        return doSelectByUniqueOf(uqClsCode, WhiteUqClassification.class);
    }

    protected <ENTITY extends WhiteUqClassification> OptionalEntity<ENTITY> doSelectByUniqueOf(CDef.UQClassificationType uqClsCode, Class<ENTITY> entityType) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(uqClsCode), entityType), uqClsCode);
    }

    protected WhiteUqClassificationCB xprepareCBAsUniqueOf(CDef.UQClassificationType uqClsCode) {
        assertObjectNotNull("uqClsCode", uqClsCode);
        WhiteUqClassificationCB cb = newMyConditionBean(); cb.acceptUniqueOf(uqClsCode);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteUqClassificationCB cb = new WhiteUqClassificationCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteUqClassification&gt; whiteUqClassificationList = whiteUqClassificationBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteUqClassification whiteUqClassification : whiteUqClassificationList) {
     *     ... = whiteUqClassification.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteUqClassification. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteUqClassification> selectList(WhiteUqClassificationCB cb) {
        return doSelectList(cb, WhiteUqClassification.class);
    }

    protected <ENTITY extends WhiteUqClassification> ListResultBean<ENTITY> doSelectList(WhiteUqClassificationCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, WhiteUqClassificationCB>() {
            public List<ENTITY> callbackSelectList(WhiteUqClassificationCB lcb, Class<ENTITY> ltp) { return delegateSelectList(lcb, ltp); } });
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
     * WhiteUqClassificationCB cb = new WhiteUqClassificationCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteUqClassification&gt; page = whiteUqClassificationBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteUqClassification whiteUqClassification : page) {
     *     ... = whiteUqClassification.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteUqClassification. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteUqClassification> selectPage(WhiteUqClassificationCB cb) {
        return doSelectPage(cb, WhiteUqClassification.class);
    }

    protected <ENTITY extends WhiteUqClassification> PagingResultBean<ENTITY> doSelectPage(WhiteUqClassificationCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, WhiteUqClassificationCB>() {
            public int callbackSelectCount(WhiteUqClassificationCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteUqClassificationCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * WhiteUqClassificationCB cb = new WhiteUqClassificationCB();
     * cb.query().setFoo...(value);
     * whiteUqClassificationBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteUqClassification&gt;() {
     *     public void handle(WhiteUqClassification entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteUqClassification. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteUqClassification. (NotNull)
     */
    public void selectCursor(WhiteUqClassificationCB cb, EntityRowHandler<WhiteUqClassification> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, WhiteUqClassification.class);
    }

    protected <ENTITY extends WhiteUqClassification> void doSelectCursor(WhiteUqClassificationCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, WhiteUqClassificationCB>() {
            public void callbackSelectCursor(WhiteUqClassificationCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(WhiteUqClassificationCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteUqClassificationBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteUqClassificationCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<WhiteUqClassificationCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends WhiteUqClassificationCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends WhiteUqClassificationCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
     * Extract the value list of (single) primary key uqClsId.
     * @param whiteUqClassificationList The list of whiteUqClassification. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractUqClsIdList(List<WhiteUqClassification> whiteUqClassificationList) {
        return helpExtractListInternally(whiteUqClassificationList, new InternalExtractCallback<WhiteUqClassification, Long>() {
            public Long getCV(WhiteUqClassification et) { return et.getUqClsId(); }
        });
    }

    /**
     * Extract the value list of (single) unique key uqClsCode.
     * @param whiteUqClassificationList The list of whiteUqClassification. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractUqClsCodeList(List<WhiteUqClassification> whiteUqClassificationList) {
        return helpExtractListInternally(whiteUqClassificationList, new InternalExtractCallback<WhiteUqClassification, String>() {
            public String getCV(WhiteUqClassification et) { return et.getUqClsCode(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteUqClassification whiteUqClassification = new WhiteUqClassification();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteUqClassification.setFoo...(value);
     * whiteUqClassification.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteUqClassification.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteUqClassification.set...;</span>
     * whiteUqClassificationBhv.<span style="color: #DD4747">insert</span>(whiteUqClassification);
     * ... = whiteUqClassification.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteUqClassification The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteUqClassification whiteUqClassification) {
        doInsert(whiteUqClassification, null);
    }

    protected void doInsert(WhiteUqClassification whiteUqClassification, InsertOption<WhiteUqClassificationCB> op) {
        assertObjectNotNull("whiteUqClassification", whiteUqClassification);
        prepareInsertOption(op);
        delegateInsert(whiteUqClassification, op);
    }

    protected void prepareInsertOption(InsertOption<WhiteUqClassificationCB> op) {
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
     * WhiteUqClassification whiteUqClassification = new WhiteUqClassification();
     * whiteUqClassification.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteUqClassification.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteUqClassification.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteUqClassification.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteUqClassification.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteUqClassificationBhv.<span style="color: #DD4747">update</span>(whiteUqClassification);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteUqClassification The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final WhiteUqClassification whiteUqClassification) {
        doUpdate(whiteUqClassification, null);
    }

    protected void doUpdate(WhiteUqClassification whiteUqClassification, final UpdateOption<WhiteUqClassificationCB> op) {
        assertObjectNotNull("whiteUqClassification", whiteUqClassification);
        prepareUpdateOption(op);
        helpUpdateInternally(whiteUqClassification, new InternalUpdateCallback<WhiteUqClassification>() {
            public int callbackDelegateUpdate(WhiteUqClassification et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhiteUqClassificationCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected WhiteUqClassificationCB createCBForVaryingUpdate() {
        WhiteUqClassificationCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected WhiteUqClassificationCB createCBForSpecifiedUpdate() {
        WhiteUqClassificationCB cb = newMyConditionBean();
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
     * @param whiteUqClassification The entity of insert or update target. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteUqClassification whiteUqClassification) {
        doInesrtOrUpdate(whiteUqClassification, null, null);
    }

    protected void doInesrtOrUpdate(WhiteUqClassification whiteUqClassification, final InsertOption<WhiteUqClassificationCB> iop, final UpdateOption<WhiteUqClassificationCB> uop) {
        helpInsertOrUpdateInternally(whiteUqClassification, new InternalInsertOrUpdateCallback<WhiteUqClassification, WhiteUqClassificationCB>() {
            public void callbackInsert(WhiteUqClassification et) { doInsert(et, iop); }
            public void callbackUpdate(WhiteUqClassification et) { doUpdate(et, uop); }
            public WhiteUqClassificationCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(WhiteUqClassificationCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<WhiteUqClassificationCB>();
            uop = uop != null ? uop : new UpdateOption<WhiteUqClassificationCB>();
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
     * WhiteUqClassification whiteUqClassification = new WhiteUqClassification();
     * whiteUqClassification.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteUqClassification.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteUqClassificationBhv.<span style="color: #DD4747">delete</span>(whiteUqClassification);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteUqClassification The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteUqClassification whiteUqClassification) {
        doDelete(whiteUqClassification, null);
    }

    protected void doDelete(WhiteUqClassification whiteUqClassification, final DeleteOption<WhiteUqClassificationCB> op) {
        assertObjectNotNull("whiteUqClassification", whiteUqClassification);
        prepareDeleteOption(op);
        helpDeleteInternally(whiteUqClassification, new InternalDeleteCallback<WhiteUqClassification>() {
            public int callbackDelegateDelete(WhiteUqClassification et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhiteUqClassificationCB> op) {
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
     *     WhiteUqClassification whiteUqClassification = new WhiteUqClassification();
     *     whiteUqClassification.setFooName("foo");
     *     if (...) {
     *         whiteUqClassification.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteUqClassificationList.add(whiteUqClassification);
     * }
     * whiteUqClassificationBhv.<span style="color: #DD4747">batchInsert</span>(whiteUqClassificationList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteUqClassificationList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteUqClassification> whiteUqClassificationList) {
        InsertOption<WhiteUqClassificationCB> op = createInsertUpdateOption();
        return doBatchInsert(whiteUqClassificationList, op);
    }

    protected int[] doBatchInsert(List<WhiteUqClassification> whiteUqClassificationList, InsertOption<WhiteUqClassificationCB> op) {
        assertObjectNotNull("whiteUqClassificationList", whiteUqClassificationList);
        prepareBatchInsertOption(whiteUqClassificationList, op);
        return delegateBatchInsert(whiteUqClassificationList, op);
    }

    protected void prepareBatchInsertOption(List<WhiteUqClassification> whiteUqClassificationList, InsertOption<WhiteUqClassificationCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(whiteUqClassificationList);
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
     *     WhiteUqClassification whiteUqClassification = new WhiteUqClassification();
     *     whiteUqClassification.setFooName("foo");
     *     if (...) {
     *         whiteUqClassification.setFooPrice(123);
     *     } else {
     *         whiteUqClassification.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteUqClassification.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteUqClassificationList.add(whiteUqClassification);
     * }
     * whiteUqClassificationBhv.<span style="color: #DD4747">batchUpdate</span>(whiteUqClassificationList);
     * </pre>
     * @param whiteUqClassificationList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteUqClassification> whiteUqClassificationList) {
        UpdateOption<WhiteUqClassificationCB> op = createPlainUpdateOption();
        return doBatchUpdate(whiteUqClassificationList, op);
    }

    protected int[] doBatchUpdate(List<WhiteUqClassification> whiteUqClassificationList, UpdateOption<WhiteUqClassificationCB> op) {
        assertObjectNotNull("whiteUqClassificationList", whiteUqClassificationList);
        prepareBatchUpdateOption(whiteUqClassificationList, op);
        return delegateBatchUpdate(whiteUqClassificationList, op);
    }

    protected void prepareBatchUpdateOption(List<WhiteUqClassification> whiteUqClassificationList, UpdateOption<WhiteUqClassificationCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(whiteUqClassificationList);
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
     * whiteUqClassificationBhv.<span style="color: #DD4747">batchUpdate</span>(whiteUqClassificationList, new SpecifyQuery<WhiteUqClassificationCB>() {
     *     public void specify(WhiteUqClassificationCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteUqClassificationBhv.<span style="color: #DD4747">batchUpdate</span>(whiteUqClassificationList, new SpecifyQuery<WhiteUqClassificationCB>() {
     *     public void specify(WhiteUqClassificationCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteUqClassificationList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteUqClassification> whiteUqClassificationList, SpecifyQuery<WhiteUqClassificationCB> updateColumnSpec) {
        return doBatchUpdate(whiteUqClassificationList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteUqClassificationList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteUqClassification> whiteUqClassificationList) {
        return doBatchDelete(whiteUqClassificationList, null);
    }

    protected int[] doBatchDelete(List<WhiteUqClassification> whiteUqClassificationList, DeleteOption<WhiteUqClassificationCB> op) {
        assertObjectNotNull("whiteUqClassificationList", whiteUqClassificationList);
        prepareDeleteOption(op);
        return delegateBatchDelete(whiteUqClassificationList, op);
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
     * whiteUqClassificationBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteUqClassification, WhiteUqClassificationCB&gt;() {
     *     public ConditionBean setup(whiteUqClassification entity, WhiteUqClassificationCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteUqClassification, WhiteUqClassificationCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteUqClassification, WhiteUqClassificationCB> sp, InsertOption<WhiteUqClassificationCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        WhiteUqClassification e = new WhiteUqClassification();
        WhiteUqClassificationCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected WhiteUqClassificationCB createCBForQueryInsert() {
        WhiteUqClassificationCB cb = newMyConditionBean();
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
     * WhiteUqClassification whiteUqClassification = new WhiteUqClassification();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteUqClassification.setPK...(value);</span>
     * whiteUqClassification.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteUqClassification.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteUqClassification.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteUqClassification.setVersionNo(value);</span>
     * WhiteUqClassificationCB cb = new WhiteUqClassificationCB();
     * cb.query().setFoo...(value);
     * whiteUqClassificationBhv.<span style="color: #DD4747">queryUpdate</span>(whiteUqClassification, cb);
     * </pre>
     * @param whiteUqClassification The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteUqClassification. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteUqClassification whiteUqClassification, WhiteUqClassificationCB cb) {
        return doQueryUpdate(whiteUqClassification, cb, null);
    }

    protected int doQueryUpdate(WhiteUqClassification whiteUqClassification, WhiteUqClassificationCB cb, UpdateOption<WhiteUqClassificationCB> op) {
        assertObjectNotNull("whiteUqClassification", whiteUqClassification); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(whiteUqClassification, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (WhiteUqClassificationCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (WhiteUqClassificationCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteUqClassificationCB cb = new WhiteUqClassificationCB();
     * cb.query().setFoo...(value);
     * whiteUqClassificationBhv.<span style="color: #DD4747">queryDelete</span>(whiteUqClassification, cb);
     * </pre>
     * @param cb The condition-bean of WhiteUqClassification. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteUqClassificationCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteUqClassificationCB cb, DeleteOption<WhiteUqClassificationCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((WhiteUqClassificationCB)cb); }
        else { return varyingQueryDelete((WhiteUqClassificationCB)cb, downcast(op)); }
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
     * WhiteUqClassification whiteUqClassification = new WhiteUqClassification();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteUqClassification.setFoo...(value);
     * whiteUqClassification.setBar...(value);
     * InsertOption<WhiteUqClassificationCB> option = new InsertOption<WhiteUqClassificationCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteUqClassificationBhv.<span style="color: #DD4747">varyingInsert</span>(whiteUqClassification, option);
     * ... = whiteUqClassification.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteUqClassification The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteUqClassification whiteUqClassification, InsertOption<WhiteUqClassificationCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteUqClassification, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteUqClassification whiteUqClassification = new WhiteUqClassification();
     * whiteUqClassification.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteUqClassification.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteUqClassification.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteUqClassificationCB&gt; option = new UpdateOption&lt;WhiteUqClassificationCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteUqClassificationCB&gt;() {
     *         public void specify(WhiteUqClassificationCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteUqClassificationBhv.<span style="color: #DD4747">varyingUpdate</span>(whiteUqClassification, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteUqClassification The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteUqClassification whiteUqClassification, UpdateOption<WhiteUqClassificationCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteUqClassification, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteUqClassification The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteUqClassification whiteUqClassification, InsertOption<WhiteUqClassificationCB> insertOption, UpdateOption<WhiteUqClassificationCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(whiteUqClassification, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteUqClassification The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteUqClassification whiteUqClassification, DeleteOption<WhiteUqClassificationCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteUqClassification, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteUqClassificationList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteUqClassification> whiteUqClassificationList, InsertOption<WhiteUqClassificationCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteUqClassificationList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteUqClassificationList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteUqClassification> whiteUqClassificationList, UpdateOption<WhiteUqClassificationCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteUqClassificationList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteUqClassificationList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteUqClassification> whiteUqClassificationList, DeleteOption<WhiteUqClassificationCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteUqClassificationList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteUqClassification, WhiteUqClassificationCB> setupper, InsertOption<WhiteUqClassificationCB> option) {
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
     * WhiteUqClassification whiteUqClassification = new WhiteUqClassification();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteUqClassification.setPK...(value);</span>
     * whiteUqClassification.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteUqClassification.setVersionNo(value);</span>
     * WhiteUqClassificationCB cb = new WhiteUqClassificationCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteUqClassificationCB&gt; option = new UpdateOption&lt;WhiteUqClassificationCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteUqClassificationCB&gt;() {
     *     public void specify(WhiteUqClassificationCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteUqClassificationBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteUqClassification, cb, option);
     * </pre>
     * @param whiteUqClassification The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteUqClassification. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteUqClassification whiteUqClassification, WhiteUqClassificationCB cb, UpdateOption<WhiteUqClassificationCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteUqClassification, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteUqClassification. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteUqClassificationCB cb, DeleteOption<WhiteUqClassificationCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteUqClassificationBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhiteUqClassificationCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhiteUqClassificationCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhiteUqClassification> void delegateSelectCursor(WhiteUqClassificationCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends WhiteUqClassification> List<ENTITY> delegateSelectList(WhiteUqClassificationCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhiteUqClassification et, InsertOption<WhiteUqClassificationCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(WhiteUqClassification et, UpdateOption<WhiteUqClassificationCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(WhiteUqClassification et, UpdateOption<WhiteUqClassificationCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(WhiteUqClassification et, DeleteOption<WhiteUqClassificationCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(WhiteUqClassification et, DeleteOption<WhiteUqClassificationCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<WhiteUqClassification> ls, InsertOption<WhiteUqClassificationCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhiteUqClassification> ls, UpdateOption<WhiteUqClassificationCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhiteUqClassification> ls, UpdateOption<WhiteUqClassificationCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhiteUqClassification> ls, DeleteOption<WhiteUqClassificationCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhiteUqClassification> ls, DeleteOption<WhiteUqClassificationCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhiteUqClassification et, WhiteUqClassificationCB inCB, ConditionBean resCB, InsertOption<WhiteUqClassificationCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhiteUqClassification et, WhiteUqClassificationCB cb, UpdateOption<WhiteUqClassificationCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(WhiteUqClassificationCB cb, DeleteOption<WhiteUqClassificationCB> op)
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
    protected WhiteUqClassification downcast(Entity et) {
        return helpEntityDowncastInternally(et, WhiteUqClassification.class);
    }

    protected WhiteUqClassificationCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, WhiteUqClassificationCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<WhiteUqClassification> downcast(List<? extends Entity> ls) {
        return (List<WhiteUqClassification>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteUqClassificationCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<WhiteUqClassificationCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteUqClassificationCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<WhiteUqClassificationCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteUqClassificationCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<WhiteUqClassificationCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteUqClassification, WhiteUqClassificationCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<WhiteUqClassification, WhiteUqClassificationCB>)sp;
    }
}
