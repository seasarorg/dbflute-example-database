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
 * The behavior of WHITE_SPLIT_MULTIPLE_FK_CHILD as TABLE. <br />
 * <pre>
 * [primary key]
 *     CHILD_ID
 *
 * [column]
 *     CHILD_ID, BASE_ID, CHILD_NAME
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
 *     white_split_multiple_fk_base
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     whiteSplitMultipleFkBase
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteSplitMultipleFkChildBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_split_multiple_fk_child"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return WhiteSplitMultipleFkChildDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteSplitMultipleFkChildDbm getMyDBMeta() { return WhiteSplitMultipleFkChildDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteSplitMultipleFkChild newMyEntity() { return new WhiteSplitMultipleFkChild(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteSplitMultipleFkChildCB newMyConditionBean() { return new WhiteSplitMultipleFkChildCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteSplitMultipleFkChildCB cb = new WhiteSplitMultipleFkChildCB();
     * cb.query().setFoo...(value);
     * int count = whiteSplitMultipleFkChildBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteSplitMultipleFkChild. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteSplitMultipleFkChildCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteSplitMultipleFkChildCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteSplitMultipleFkChildCB cb) { // called by selectPage(cb)
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
     * WhiteSplitMultipleFkChildCB cb = new WhiteSplitMultipleFkChildCB();
     * cb.query().setFoo...(value);
     * WhiteSplitMultipleFkChild whiteSplitMultipleFkChild = whiteSplitMultipleFkChildBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (whiteSplitMultipleFkChild != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = whiteSplitMultipleFkChild.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSplitMultipleFkChild. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSplitMultipleFkChild selectEntity(WhiteSplitMultipleFkChildCB cb) {
        return doSelectEntity(cb, WhiteSplitMultipleFkChild.class);
    }

    protected <ENTITY extends WhiteSplitMultipleFkChild> ENTITY doSelectEntity(WhiteSplitMultipleFkChildCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, WhiteSplitMultipleFkChildCB>() {
            public List<ENTITY> callbackSelectList(WhiteSplitMultipleFkChildCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    protected <ENTITY extends WhiteSplitMultipleFkChild> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteSplitMultipleFkChildCB cb, Class<ENTITY> tp) {
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
     * WhiteSplitMultipleFkChildCB cb = new WhiteSplitMultipleFkChildCB();
     * cb.query().setFoo...(value);
     * WhiteSplitMultipleFkChild whiteSplitMultipleFkChild = whiteSplitMultipleFkChildBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteSplitMultipleFkChild.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteSplitMultipleFkChild. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSplitMultipleFkChild selectEntityWithDeletedCheck(WhiteSplitMultipleFkChildCB cb) {
        return doSelectEntityWithDeletedCheck(cb, WhiteSplitMultipleFkChild.class);
    }

    protected <ENTITY extends WhiteSplitMultipleFkChild> ENTITY doSelectEntityWithDeletedCheck(WhiteSplitMultipleFkChildCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteSplitMultipleFkChildCB>() {
            public List<ENTITY> callbackSelectList(WhiteSplitMultipleFkChildCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param childId : PK, NotNull, BIGINT(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSplitMultipleFkChild selectByPKValue(Long childId) {
        return doSelectByPK(childId, WhiteSplitMultipleFkChild.class);
    }

    protected <ENTITY extends WhiteSplitMultipleFkChild> ENTITY doSelectByPK(Long childId, Class<ENTITY> entityType) {
        return doSelectEntity(xprepareCBAsPK(childId), entityType);
    }

    protected <ENTITY extends WhiteSplitMultipleFkChild> OptionalEntity<ENTITY> doSelectOptionalByPK(Long childId, Class<ENTITY> entityType) {
        return createOptionalEntity(doSelectByPK(childId, entityType), childId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param childId : PK, NotNull, BIGINT(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSplitMultipleFkChild selectByPKValueWithDeletedCheck(Long childId) {
        return doSelectByPKWithDeletedCheck(childId, WhiteSplitMultipleFkChild.class);
    }

    protected <ENTITY extends WhiteSplitMultipleFkChild> ENTITY doSelectByPKWithDeletedCheck(Long childId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(childId), entityType);
    }

    protected WhiteSplitMultipleFkChildCB xprepareCBAsPK(Long childId) {
        assertObjectNotNull("childId", childId);
        WhiteSplitMultipleFkChildCB cb = newMyConditionBean(); cb.acceptPrimaryKey(childId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteSplitMultipleFkChildCB cb = new WhiteSplitMultipleFkChildCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteSplitMultipleFkChild&gt; whiteSplitMultipleFkChildList = whiteSplitMultipleFkChildBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteSplitMultipleFkChild whiteSplitMultipleFkChild : whiteSplitMultipleFkChildList) {
     *     ... = whiteSplitMultipleFkChild.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSplitMultipleFkChild. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteSplitMultipleFkChild> selectList(WhiteSplitMultipleFkChildCB cb) {
        return doSelectList(cb, WhiteSplitMultipleFkChild.class);
    }

    protected <ENTITY extends WhiteSplitMultipleFkChild> ListResultBean<ENTITY> doSelectList(WhiteSplitMultipleFkChildCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, WhiteSplitMultipleFkChildCB>() {
            public List<ENTITY> callbackSelectList(WhiteSplitMultipleFkChildCB lcb, Class<ENTITY> ltp) { return delegateSelectList(lcb, ltp); } });
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
     * WhiteSplitMultipleFkChildCB cb = new WhiteSplitMultipleFkChildCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteSplitMultipleFkChild&gt; page = whiteSplitMultipleFkChildBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteSplitMultipleFkChild whiteSplitMultipleFkChild : page) {
     *     ... = whiteSplitMultipleFkChild.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSplitMultipleFkChild. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteSplitMultipleFkChild> selectPage(WhiteSplitMultipleFkChildCB cb) {
        return doSelectPage(cb, WhiteSplitMultipleFkChild.class);
    }

    protected <ENTITY extends WhiteSplitMultipleFkChild> PagingResultBean<ENTITY> doSelectPage(WhiteSplitMultipleFkChildCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, WhiteSplitMultipleFkChildCB>() {
            public int callbackSelectCount(WhiteSplitMultipleFkChildCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteSplitMultipleFkChildCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * WhiteSplitMultipleFkChildCB cb = new WhiteSplitMultipleFkChildCB();
     * cb.query().setFoo...(value);
     * whiteSplitMultipleFkChildBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteSplitMultipleFkChild&gt;() {
     *     public void handle(WhiteSplitMultipleFkChild entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteSplitMultipleFkChild. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteSplitMultipleFkChild. (NotNull)
     */
    public void selectCursor(WhiteSplitMultipleFkChildCB cb, EntityRowHandler<WhiteSplitMultipleFkChild> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, WhiteSplitMultipleFkChild.class);
    }

    protected <ENTITY extends WhiteSplitMultipleFkChild> void doSelectCursor(WhiteSplitMultipleFkChildCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, WhiteSplitMultipleFkChildCB>() {
            public void callbackSelectCursor(WhiteSplitMultipleFkChildCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(WhiteSplitMultipleFkChildCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteSplitMultipleFkChildBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteSplitMultipleFkChildCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<WhiteSplitMultipleFkChildCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends WhiteSplitMultipleFkChildCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends WhiteSplitMultipleFkChildCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
    /**
     * Pull out the list of foreign table 'WhiteSplitMultipleFkBase'.
     * @param whiteSplitMultipleFkChildList The list of whiteSplitMultipleFkChild. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteSplitMultipleFkBase> pulloutWhiteSplitMultipleFkBase(List<WhiteSplitMultipleFkChild> whiteSplitMultipleFkChildList) {
        return helpPulloutInternally(whiteSplitMultipleFkChildList, new InternalPulloutCallback<WhiteSplitMultipleFkChild, WhiteSplitMultipleFkBase>() {
            public WhiteSplitMultipleFkBase getFr(WhiteSplitMultipleFkChild et)
            { return et.getWhiteSplitMultipleFkBase(); }
            public boolean hasRf() { return true; }
            public void setRfLs(WhiteSplitMultipleFkBase et, List<WhiteSplitMultipleFkChild> ls)
            { et.setWhiteSplitMultipleFkChildList(ls); }
        });
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key childId.
     * @param whiteSplitMultipleFkChildList The list of whiteSplitMultipleFkChild. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractChildIdList(List<WhiteSplitMultipleFkChild> whiteSplitMultipleFkChildList) {
        return helpExtractListInternally(whiteSplitMultipleFkChildList, new InternalExtractCallback<WhiteSplitMultipleFkChild, Long>() {
            public Long getCV(WhiteSplitMultipleFkChild et) { return et.getChildId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteSplitMultipleFkChild whiteSplitMultipleFkChild = new WhiteSplitMultipleFkChild();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteSplitMultipleFkChild.setFoo...(value);
     * whiteSplitMultipleFkChild.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkChild.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkChild.set...;</span>
     * whiteSplitMultipleFkChildBhv.<span style="color: #DD4747">insert</span>(whiteSplitMultipleFkChild);
     * ... = whiteSplitMultipleFkChild.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteSplitMultipleFkChild The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteSplitMultipleFkChild whiteSplitMultipleFkChild) {
        doInsert(whiteSplitMultipleFkChild, null);
    }

    protected void doInsert(WhiteSplitMultipleFkChild whiteSplitMultipleFkChild, InsertOption<WhiteSplitMultipleFkChildCB> op) {
        assertObjectNotNull("whiteSplitMultipleFkChild", whiteSplitMultipleFkChild);
        prepareInsertOption(op);
        delegateInsert(whiteSplitMultipleFkChild, op);
    }

    protected void prepareInsertOption(InsertOption<WhiteSplitMultipleFkChildCB> op) {
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
     * WhiteSplitMultipleFkChild whiteSplitMultipleFkChild = new WhiteSplitMultipleFkChild();
     * whiteSplitMultipleFkChild.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteSplitMultipleFkChild.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkChild.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkChild.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteSplitMultipleFkChild.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteSplitMultipleFkChildBhv.<span style="color: #DD4747">update</span>(whiteSplitMultipleFkChild);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSplitMultipleFkChild The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final WhiteSplitMultipleFkChild whiteSplitMultipleFkChild) {
        doUpdate(whiteSplitMultipleFkChild, null);
    }

    protected void doUpdate(WhiteSplitMultipleFkChild whiteSplitMultipleFkChild, final UpdateOption<WhiteSplitMultipleFkChildCB> op) {
        assertObjectNotNull("whiteSplitMultipleFkChild", whiteSplitMultipleFkChild);
        prepareUpdateOption(op);
        helpUpdateInternally(whiteSplitMultipleFkChild, new InternalUpdateCallback<WhiteSplitMultipleFkChild>() {
            public int callbackDelegateUpdate(WhiteSplitMultipleFkChild et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhiteSplitMultipleFkChildCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected WhiteSplitMultipleFkChildCB createCBForVaryingUpdate() {
        WhiteSplitMultipleFkChildCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected WhiteSplitMultipleFkChildCB createCBForSpecifiedUpdate() {
        WhiteSplitMultipleFkChildCB cb = newMyConditionBean();
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
     * @param whiteSplitMultipleFkChild The entity of insert or update target. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteSplitMultipleFkChild whiteSplitMultipleFkChild) {
        doInesrtOrUpdate(whiteSplitMultipleFkChild, null, null);
    }

    protected void doInesrtOrUpdate(WhiteSplitMultipleFkChild whiteSplitMultipleFkChild, final InsertOption<WhiteSplitMultipleFkChildCB> iop, final UpdateOption<WhiteSplitMultipleFkChildCB> uop) {
        helpInsertOrUpdateInternally(whiteSplitMultipleFkChild, new InternalInsertOrUpdateCallback<WhiteSplitMultipleFkChild, WhiteSplitMultipleFkChildCB>() {
            public void callbackInsert(WhiteSplitMultipleFkChild et) { doInsert(et, iop); }
            public void callbackUpdate(WhiteSplitMultipleFkChild et) { doUpdate(et, uop); }
            public WhiteSplitMultipleFkChildCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(WhiteSplitMultipleFkChildCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<WhiteSplitMultipleFkChildCB>();
            uop = uop != null ? uop : new UpdateOption<WhiteSplitMultipleFkChildCB>();
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
     * WhiteSplitMultipleFkChild whiteSplitMultipleFkChild = new WhiteSplitMultipleFkChild();
     * whiteSplitMultipleFkChild.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteSplitMultipleFkChild.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteSplitMultipleFkChildBhv.<span style="color: #DD4747">delete</span>(whiteSplitMultipleFkChild);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSplitMultipleFkChild The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteSplitMultipleFkChild whiteSplitMultipleFkChild) {
        doDelete(whiteSplitMultipleFkChild, null);
    }

    protected void doDelete(WhiteSplitMultipleFkChild whiteSplitMultipleFkChild, final DeleteOption<WhiteSplitMultipleFkChildCB> op) {
        assertObjectNotNull("whiteSplitMultipleFkChild", whiteSplitMultipleFkChild);
        prepareDeleteOption(op);
        helpDeleteInternally(whiteSplitMultipleFkChild, new InternalDeleteCallback<WhiteSplitMultipleFkChild>() {
            public int callbackDelegateDelete(WhiteSplitMultipleFkChild et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhiteSplitMultipleFkChildCB> op) {
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
     *     WhiteSplitMultipleFkChild whiteSplitMultipleFkChild = new WhiteSplitMultipleFkChild();
     *     whiteSplitMultipleFkChild.setFooName("foo");
     *     if (...) {
     *         whiteSplitMultipleFkChild.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteSplitMultipleFkChildList.add(whiteSplitMultipleFkChild);
     * }
     * whiteSplitMultipleFkChildBhv.<span style="color: #DD4747">batchInsert</span>(whiteSplitMultipleFkChildList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteSplitMultipleFkChildList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteSplitMultipleFkChild> whiteSplitMultipleFkChildList) {
        InsertOption<WhiteSplitMultipleFkChildCB> op = createInsertUpdateOption();
        return doBatchInsert(whiteSplitMultipleFkChildList, op);
    }

    protected int[] doBatchInsert(List<WhiteSplitMultipleFkChild> whiteSplitMultipleFkChildList, InsertOption<WhiteSplitMultipleFkChildCB> op) {
        assertObjectNotNull("whiteSplitMultipleFkChildList", whiteSplitMultipleFkChildList);
        prepareBatchInsertOption(whiteSplitMultipleFkChildList, op);
        return delegateBatchInsert(whiteSplitMultipleFkChildList, op);
    }

    protected void prepareBatchInsertOption(List<WhiteSplitMultipleFkChild> whiteSplitMultipleFkChildList, InsertOption<WhiteSplitMultipleFkChildCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(whiteSplitMultipleFkChildList);
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
     *     WhiteSplitMultipleFkChild whiteSplitMultipleFkChild = new WhiteSplitMultipleFkChild();
     *     whiteSplitMultipleFkChild.setFooName("foo");
     *     if (...) {
     *         whiteSplitMultipleFkChild.setFooPrice(123);
     *     } else {
     *         whiteSplitMultipleFkChild.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteSplitMultipleFkChild.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteSplitMultipleFkChildList.add(whiteSplitMultipleFkChild);
     * }
     * whiteSplitMultipleFkChildBhv.<span style="color: #DD4747">batchUpdate</span>(whiteSplitMultipleFkChildList);
     * </pre>
     * @param whiteSplitMultipleFkChildList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteSplitMultipleFkChild> whiteSplitMultipleFkChildList) {
        UpdateOption<WhiteSplitMultipleFkChildCB> op = createPlainUpdateOption();
        return doBatchUpdate(whiteSplitMultipleFkChildList, op);
    }

    protected int[] doBatchUpdate(List<WhiteSplitMultipleFkChild> whiteSplitMultipleFkChildList, UpdateOption<WhiteSplitMultipleFkChildCB> op) {
        assertObjectNotNull("whiteSplitMultipleFkChildList", whiteSplitMultipleFkChildList);
        prepareBatchUpdateOption(whiteSplitMultipleFkChildList, op);
        return delegateBatchUpdate(whiteSplitMultipleFkChildList, op);
    }

    protected void prepareBatchUpdateOption(List<WhiteSplitMultipleFkChild> whiteSplitMultipleFkChildList, UpdateOption<WhiteSplitMultipleFkChildCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(whiteSplitMultipleFkChildList);
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
     * whiteSplitMultipleFkChildBhv.<span style="color: #DD4747">batchUpdate</span>(whiteSplitMultipleFkChildList, new SpecifyQuery<WhiteSplitMultipleFkChildCB>() {
     *     public void specify(WhiteSplitMultipleFkChildCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteSplitMultipleFkChildBhv.<span style="color: #DD4747">batchUpdate</span>(whiteSplitMultipleFkChildList, new SpecifyQuery<WhiteSplitMultipleFkChildCB>() {
     *     public void specify(WhiteSplitMultipleFkChildCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteSplitMultipleFkChildList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteSplitMultipleFkChild> whiteSplitMultipleFkChildList, SpecifyQuery<WhiteSplitMultipleFkChildCB> updateColumnSpec) {
        return doBatchUpdate(whiteSplitMultipleFkChildList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteSplitMultipleFkChildList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteSplitMultipleFkChild> whiteSplitMultipleFkChildList) {
        return doBatchDelete(whiteSplitMultipleFkChildList, null);
    }

    protected int[] doBatchDelete(List<WhiteSplitMultipleFkChild> whiteSplitMultipleFkChildList, DeleteOption<WhiteSplitMultipleFkChildCB> op) {
        assertObjectNotNull("whiteSplitMultipleFkChildList", whiteSplitMultipleFkChildList);
        prepareDeleteOption(op);
        return delegateBatchDelete(whiteSplitMultipleFkChildList, op);
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
     * whiteSplitMultipleFkChildBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteSplitMultipleFkChild, WhiteSplitMultipleFkChildCB&gt;() {
     *     public ConditionBean setup(whiteSplitMultipleFkChild entity, WhiteSplitMultipleFkChildCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteSplitMultipleFkChild, WhiteSplitMultipleFkChildCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteSplitMultipleFkChild, WhiteSplitMultipleFkChildCB> sp, InsertOption<WhiteSplitMultipleFkChildCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        WhiteSplitMultipleFkChild e = new WhiteSplitMultipleFkChild();
        WhiteSplitMultipleFkChildCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected WhiteSplitMultipleFkChildCB createCBForQueryInsert() {
        WhiteSplitMultipleFkChildCB cb = newMyConditionBean();
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
     * WhiteSplitMultipleFkChild whiteSplitMultipleFkChild = new WhiteSplitMultipleFkChild();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkChild.setPK...(value);</span>
     * whiteSplitMultipleFkChild.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkChild.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkChild.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkChild.setVersionNo(value);</span>
     * WhiteSplitMultipleFkChildCB cb = new WhiteSplitMultipleFkChildCB();
     * cb.query().setFoo...(value);
     * whiteSplitMultipleFkChildBhv.<span style="color: #DD4747">queryUpdate</span>(whiteSplitMultipleFkChild, cb);
     * </pre>
     * @param whiteSplitMultipleFkChild The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteSplitMultipleFkChild. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteSplitMultipleFkChild whiteSplitMultipleFkChild, WhiteSplitMultipleFkChildCB cb) {
        return doQueryUpdate(whiteSplitMultipleFkChild, cb, null);
    }

    protected int doQueryUpdate(WhiteSplitMultipleFkChild whiteSplitMultipleFkChild, WhiteSplitMultipleFkChildCB cb, UpdateOption<WhiteSplitMultipleFkChildCB> op) {
        assertObjectNotNull("whiteSplitMultipleFkChild", whiteSplitMultipleFkChild); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(whiteSplitMultipleFkChild, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (WhiteSplitMultipleFkChildCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (WhiteSplitMultipleFkChildCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteSplitMultipleFkChildCB cb = new WhiteSplitMultipleFkChildCB();
     * cb.query().setFoo...(value);
     * whiteSplitMultipleFkChildBhv.<span style="color: #DD4747">queryDelete</span>(whiteSplitMultipleFkChild, cb);
     * </pre>
     * @param cb The condition-bean of WhiteSplitMultipleFkChild. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteSplitMultipleFkChildCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteSplitMultipleFkChildCB cb, DeleteOption<WhiteSplitMultipleFkChildCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((WhiteSplitMultipleFkChildCB)cb); }
        else { return varyingQueryDelete((WhiteSplitMultipleFkChildCB)cb, downcast(op)); }
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
     * WhiteSplitMultipleFkChild whiteSplitMultipleFkChild = new WhiteSplitMultipleFkChild();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteSplitMultipleFkChild.setFoo...(value);
     * whiteSplitMultipleFkChild.setBar...(value);
     * InsertOption<WhiteSplitMultipleFkChildCB> option = new InsertOption<WhiteSplitMultipleFkChildCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteSplitMultipleFkChildBhv.<span style="color: #DD4747">varyingInsert</span>(whiteSplitMultipleFkChild, option);
     * ... = whiteSplitMultipleFkChild.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteSplitMultipleFkChild The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteSplitMultipleFkChild whiteSplitMultipleFkChild, InsertOption<WhiteSplitMultipleFkChildCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteSplitMultipleFkChild, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteSplitMultipleFkChild whiteSplitMultipleFkChild = new WhiteSplitMultipleFkChild();
     * whiteSplitMultipleFkChild.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteSplitMultipleFkChild.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteSplitMultipleFkChild.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteSplitMultipleFkChildCB&gt; option = new UpdateOption&lt;WhiteSplitMultipleFkChildCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteSplitMultipleFkChildCB&gt;() {
     *         public void specify(WhiteSplitMultipleFkChildCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteSplitMultipleFkChildBhv.<span style="color: #DD4747">varyingUpdate</span>(whiteSplitMultipleFkChild, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSplitMultipleFkChild The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteSplitMultipleFkChild whiteSplitMultipleFkChild, UpdateOption<WhiteSplitMultipleFkChildCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteSplitMultipleFkChild, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteSplitMultipleFkChild The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteSplitMultipleFkChild whiteSplitMultipleFkChild, InsertOption<WhiteSplitMultipleFkChildCB> insertOption, UpdateOption<WhiteSplitMultipleFkChildCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(whiteSplitMultipleFkChild, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteSplitMultipleFkChild The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteSplitMultipleFkChild whiteSplitMultipleFkChild, DeleteOption<WhiteSplitMultipleFkChildCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteSplitMultipleFkChild, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteSplitMultipleFkChildList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteSplitMultipleFkChild> whiteSplitMultipleFkChildList, InsertOption<WhiteSplitMultipleFkChildCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteSplitMultipleFkChildList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteSplitMultipleFkChildList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteSplitMultipleFkChild> whiteSplitMultipleFkChildList, UpdateOption<WhiteSplitMultipleFkChildCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteSplitMultipleFkChildList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteSplitMultipleFkChildList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteSplitMultipleFkChild> whiteSplitMultipleFkChildList, DeleteOption<WhiteSplitMultipleFkChildCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteSplitMultipleFkChildList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteSplitMultipleFkChild, WhiteSplitMultipleFkChildCB> setupper, InsertOption<WhiteSplitMultipleFkChildCB> option) {
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
     * WhiteSplitMultipleFkChild whiteSplitMultipleFkChild = new WhiteSplitMultipleFkChild();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkChild.setPK...(value);</span>
     * whiteSplitMultipleFkChild.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSplitMultipleFkChild.setVersionNo(value);</span>
     * WhiteSplitMultipleFkChildCB cb = new WhiteSplitMultipleFkChildCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteSplitMultipleFkChildCB&gt; option = new UpdateOption&lt;WhiteSplitMultipleFkChildCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteSplitMultipleFkChildCB&gt;() {
     *     public void specify(WhiteSplitMultipleFkChildCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteSplitMultipleFkChildBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteSplitMultipleFkChild, cb, option);
     * </pre>
     * @param whiteSplitMultipleFkChild The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteSplitMultipleFkChild. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteSplitMultipleFkChild whiteSplitMultipleFkChild, WhiteSplitMultipleFkChildCB cb, UpdateOption<WhiteSplitMultipleFkChildCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteSplitMultipleFkChild, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteSplitMultipleFkChild. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteSplitMultipleFkChildCB cb, DeleteOption<WhiteSplitMultipleFkChildCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteSplitMultipleFkChildBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhiteSplitMultipleFkChildCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhiteSplitMultipleFkChildCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhiteSplitMultipleFkChild> void delegateSelectCursor(WhiteSplitMultipleFkChildCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends WhiteSplitMultipleFkChild> List<ENTITY> delegateSelectList(WhiteSplitMultipleFkChildCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhiteSplitMultipleFkChild et, InsertOption<WhiteSplitMultipleFkChildCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(WhiteSplitMultipleFkChild et, UpdateOption<WhiteSplitMultipleFkChildCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(WhiteSplitMultipleFkChild et, UpdateOption<WhiteSplitMultipleFkChildCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(WhiteSplitMultipleFkChild et, DeleteOption<WhiteSplitMultipleFkChildCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(WhiteSplitMultipleFkChild et, DeleteOption<WhiteSplitMultipleFkChildCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<WhiteSplitMultipleFkChild> ls, InsertOption<WhiteSplitMultipleFkChildCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhiteSplitMultipleFkChild> ls, UpdateOption<WhiteSplitMultipleFkChildCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhiteSplitMultipleFkChild> ls, UpdateOption<WhiteSplitMultipleFkChildCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhiteSplitMultipleFkChild> ls, DeleteOption<WhiteSplitMultipleFkChildCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhiteSplitMultipleFkChild> ls, DeleteOption<WhiteSplitMultipleFkChildCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhiteSplitMultipleFkChild et, WhiteSplitMultipleFkChildCB inCB, ConditionBean resCB, InsertOption<WhiteSplitMultipleFkChildCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhiteSplitMultipleFkChild et, WhiteSplitMultipleFkChildCB cb, UpdateOption<WhiteSplitMultipleFkChildCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(WhiteSplitMultipleFkChildCB cb, DeleteOption<WhiteSplitMultipleFkChildCB> op)
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
    protected WhiteSplitMultipleFkChild downcast(Entity et) {
        return helpEntityDowncastInternally(et, WhiteSplitMultipleFkChild.class);
    }

    protected WhiteSplitMultipleFkChildCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, WhiteSplitMultipleFkChildCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<WhiteSplitMultipleFkChild> downcast(List<? extends Entity> ls) {
        return (List<WhiteSplitMultipleFkChild>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteSplitMultipleFkChildCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<WhiteSplitMultipleFkChildCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteSplitMultipleFkChildCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<WhiteSplitMultipleFkChildCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteSplitMultipleFkChildCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<WhiteSplitMultipleFkChildCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteSplitMultipleFkChild, WhiteSplitMultipleFkChildCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<WhiteSplitMultipleFkChild, WhiteSplitMultipleFkChildCB>)sp;
    }
}
