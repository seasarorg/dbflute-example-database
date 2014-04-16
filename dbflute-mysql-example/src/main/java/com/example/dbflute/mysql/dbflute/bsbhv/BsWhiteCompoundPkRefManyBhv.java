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
 * The behavior of WHITE_COMPOUND_PK_REF_MANY as TABLE. <br />
 * <pre>
 * [primary key]
 *     MULTIPLE_FIRST_ID, MULTIPLE_SECOND_ID
 *
 * [column]
 *     MULTIPLE_FIRST_ID, MULTIPLE_SECOND_ID, REF_MANY_FIRST_ID, REF_MANY_SECOND_ID, REF_MANY_CODE, REF_MANY_NAME
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
 *     WHITE_COMPOUND_PK(ToPK)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     whiteCompoundPkToPK
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteCompoundPkRefManyBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_compound_pk_ref_many"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return WhiteCompoundPkRefManyDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteCompoundPkRefManyDbm getMyDBMeta() { return WhiteCompoundPkRefManyDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteCompoundPkRefMany newMyEntity() { return new WhiteCompoundPkRefMany(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteCompoundPkRefManyCB newMyConditionBean() { return new WhiteCompoundPkRefManyCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteCompoundPkRefManyCB cb = new WhiteCompoundPkRefManyCB();
     * cb.query().setFoo...(value);
     * int count = whiteCompoundPkRefManyBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteCompoundPkRefMany. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteCompoundPkRefManyCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteCompoundPkRefManyCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteCompoundPkRefManyCB cb) { // called by selectPage(cb)
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
     * WhiteCompoundPkRefManyCB cb = new WhiteCompoundPkRefManyCB();
     * cb.query().setFoo...(value);
     * WhiteCompoundPkRefMany whiteCompoundPkRefMany = whiteCompoundPkRefManyBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (whiteCompoundPkRefMany != null) {
     *     ... = whiteCompoundPkRefMany.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteCompoundPkRefMany. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteCompoundPkRefMany selectEntity(WhiteCompoundPkRefManyCB cb) {
        return doSelectEntity(cb, WhiteCompoundPkRefMany.class);
    }

    protected <ENTITY extends WhiteCompoundPkRefMany> ENTITY doSelectEntity(WhiteCompoundPkRefManyCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, WhiteCompoundPkRefManyCB>() {
            public List<ENTITY> callbackSelectList(WhiteCompoundPkRefManyCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * WhiteCompoundPkRefManyCB cb = new WhiteCompoundPkRefManyCB();
     * cb.query().setFoo...(value);
     * WhiteCompoundPkRefMany whiteCompoundPkRefMany = whiteCompoundPkRefManyBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteCompoundPkRefMany.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteCompoundPkRefMany. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteCompoundPkRefMany selectEntityWithDeletedCheck(WhiteCompoundPkRefManyCB cb) {
        return doSelectEntityWithDeletedCheck(cb, WhiteCompoundPkRefMany.class);
    }

    protected <ENTITY extends WhiteCompoundPkRefMany> ENTITY doSelectEntityWithDeletedCheck(WhiteCompoundPkRefManyCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteCompoundPkRefManyCB>() {
            public List<ENTITY> callbackSelectList(WhiteCompoundPkRefManyCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param multipleFirstId The one of primary key. (NotNull)
     * @param multipleSecondId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteCompoundPkRefMany selectByPKValue(Integer multipleFirstId, Integer multipleSecondId) {
        return doSelectByPKValue(multipleFirstId, multipleSecondId, WhiteCompoundPkRefMany.class);
    }

    protected <ENTITY extends WhiteCompoundPkRefMany> ENTITY doSelectByPKValue(Integer multipleFirstId, Integer multipleSecondId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(multipleFirstId, multipleSecondId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param multipleFirstId The one of primary key. (NotNull)
     * @param multipleSecondId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteCompoundPkRefMany selectByPKValueWithDeletedCheck(Integer multipleFirstId, Integer multipleSecondId) {
        return doSelectByPKValueWithDeletedCheck(multipleFirstId, multipleSecondId, WhiteCompoundPkRefMany.class);
    }

    protected <ENTITY extends WhiteCompoundPkRefMany> ENTITY doSelectByPKValueWithDeletedCheck(Integer multipleFirstId, Integer multipleSecondId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(multipleFirstId, multipleSecondId), entityType);
    }

    private WhiteCompoundPkRefManyCB buildPKCB(Integer multipleFirstId, Integer multipleSecondId) {
        assertObjectNotNull("multipleFirstId", multipleFirstId);assertObjectNotNull("multipleSecondId", multipleSecondId);
        WhiteCompoundPkRefManyCB cb = newMyConditionBean();
        cb.query().setMultipleFirstId_Equal(multipleFirstId);cb.query().setMultipleSecondId_Equal(multipleSecondId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteCompoundPkRefManyCB cb = new WhiteCompoundPkRefManyCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteCompoundPkRefMany&gt; whiteCompoundPkRefManyList = whiteCompoundPkRefManyBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (WhiteCompoundPkRefMany whiteCompoundPkRefMany : whiteCompoundPkRefManyList) {
     *     ... = whiteCompoundPkRefMany.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteCompoundPkRefMany. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteCompoundPkRefMany> selectList(WhiteCompoundPkRefManyCB cb) {
        return doSelectList(cb, WhiteCompoundPkRefMany.class);
    }

    protected <ENTITY extends WhiteCompoundPkRefMany> ListResultBean<ENTITY> doSelectList(WhiteCompoundPkRefManyCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, WhiteCompoundPkRefManyCB>() {
            public List<ENTITY> callbackSelectList(WhiteCompoundPkRefManyCB lcb, Class<ENTITY> ltp) { return delegateSelectList(lcb, ltp); } });
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
     * WhiteCompoundPkRefManyCB cb = new WhiteCompoundPkRefManyCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteCompoundPkRefMany&gt; page = whiteCompoundPkRefManyBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteCompoundPkRefMany whiteCompoundPkRefMany : page) {
     *     ... = whiteCompoundPkRefMany.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteCompoundPkRefMany. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteCompoundPkRefMany> selectPage(WhiteCompoundPkRefManyCB cb) {
        return doSelectPage(cb, WhiteCompoundPkRefMany.class);
    }

    protected <ENTITY extends WhiteCompoundPkRefMany> PagingResultBean<ENTITY> doSelectPage(WhiteCompoundPkRefManyCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, WhiteCompoundPkRefManyCB>() {
            public int callbackSelectCount(WhiteCompoundPkRefManyCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteCompoundPkRefManyCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * WhiteCompoundPkRefManyCB cb = new WhiteCompoundPkRefManyCB();
     * cb.query().setFoo...(value);
     * whiteCompoundPkRefManyBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteCompoundPkRefMany&gt;() {
     *     public void handle(WhiteCompoundPkRefMany entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteCompoundPkRefMany. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteCompoundPkRefMany. (NotNull)
     */
    public void selectCursor(WhiteCompoundPkRefManyCB cb, EntityRowHandler<WhiteCompoundPkRefMany> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, WhiteCompoundPkRefMany.class);
    }

    protected <ENTITY extends WhiteCompoundPkRefMany> void doSelectCursor(WhiteCompoundPkRefManyCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, WhiteCompoundPkRefManyCB>() {
            public void callbackSelectCursor(WhiteCompoundPkRefManyCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(WhiteCompoundPkRefManyCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteCompoundPkRefManyBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteCompoundPkRefManyCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<WhiteCompoundPkRefManyCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends WhiteCompoundPkRefManyCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends WhiteCompoundPkRefManyCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
     * Pull out the list of foreign table 'WhiteCompoundPk'.
     * @param whiteCompoundPkRefManyList The list of whiteCompoundPkRefMany. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteCompoundPk> pulloutWhiteCompoundPkToPK(List<WhiteCompoundPkRefMany> whiteCompoundPkRefManyList) {
        return helpPulloutInternally(whiteCompoundPkRefManyList, new InternalPulloutCallback<WhiteCompoundPkRefMany, WhiteCompoundPk>() {
            public WhiteCompoundPk getFr(WhiteCompoundPkRefMany et) { return et.getWhiteCompoundPkToPK(); }
            public boolean hasRf() { return true; }
            public void setRfLs(WhiteCompoundPk et, List<WhiteCompoundPkRefMany> ls)
            { et.setWhiteCompoundPkRefManyToPKList(ls); }
        });
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteCompoundPkRefMany whiteCompoundPkRefMany = new WhiteCompoundPkRefMany();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteCompoundPkRefMany.setFoo...(value);
     * whiteCompoundPkRefMany.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteCompoundPkRefMany.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteCompoundPkRefMany.set...;</span>
     * whiteCompoundPkRefManyBhv.<span style="color: #FD4747">insert</span>(whiteCompoundPkRefMany);
     * ... = whiteCompoundPkRefMany.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteCompoundPkRefMany The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteCompoundPkRefMany whiteCompoundPkRefMany) {
        doInsert(whiteCompoundPkRefMany, null);
    }

    protected void doInsert(WhiteCompoundPkRefMany whiteCompoundPkRefMany, InsertOption<WhiteCompoundPkRefManyCB> op) {
        assertObjectNotNull("whiteCompoundPkRefMany", whiteCompoundPkRefMany);
        prepareInsertOption(op);
        delegateInsert(whiteCompoundPkRefMany, op);
    }

    protected void prepareInsertOption(InsertOption<WhiteCompoundPkRefManyCB> op) {
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
     * WhiteCompoundPkRefMany whiteCompoundPkRefMany = new WhiteCompoundPkRefMany();
     * whiteCompoundPkRefMany.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteCompoundPkRefMany.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteCompoundPkRefMany.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteCompoundPkRefMany.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteCompoundPkRefMany.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteCompoundPkRefManyBhv.<span style="color: #FD4747">update</span>(whiteCompoundPkRefMany);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteCompoundPkRefMany The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final WhiteCompoundPkRefMany whiteCompoundPkRefMany) {
        doUpdate(whiteCompoundPkRefMany, null);
    }

    protected void doUpdate(WhiteCompoundPkRefMany whiteCompoundPkRefMany, final UpdateOption<WhiteCompoundPkRefManyCB> op) {
        assertObjectNotNull("whiteCompoundPkRefMany", whiteCompoundPkRefMany);
        prepareUpdateOption(op);
        helpUpdateInternally(whiteCompoundPkRefMany, new InternalUpdateCallback<WhiteCompoundPkRefMany>() {
            public int callbackDelegateUpdate(WhiteCompoundPkRefMany et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhiteCompoundPkRefManyCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected WhiteCompoundPkRefManyCB createCBForVaryingUpdate() {
        WhiteCompoundPkRefManyCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected WhiteCompoundPkRefManyCB createCBForSpecifiedUpdate() {
        WhiteCompoundPkRefManyCB cb = newMyConditionBean();
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
     * @param whiteCompoundPkRefMany The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteCompoundPkRefMany whiteCompoundPkRefMany) {
        doInesrtOrUpdate(whiteCompoundPkRefMany, null, null);
    }

    protected void doInesrtOrUpdate(WhiteCompoundPkRefMany whiteCompoundPkRefMany, final InsertOption<WhiteCompoundPkRefManyCB> iop, final UpdateOption<WhiteCompoundPkRefManyCB> uop) {
        helpInsertOrUpdateInternally(whiteCompoundPkRefMany, new InternalInsertOrUpdateCallback<WhiteCompoundPkRefMany, WhiteCompoundPkRefManyCB>() {
            public void callbackInsert(WhiteCompoundPkRefMany et) { doInsert(et, iop); }
            public void callbackUpdate(WhiteCompoundPkRefMany et) { doUpdate(et, uop); }
            public WhiteCompoundPkRefManyCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(WhiteCompoundPkRefManyCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<WhiteCompoundPkRefManyCB>();
            uop = uop != null ? uop : new UpdateOption<WhiteCompoundPkRefManyCB>();
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
     * WhiteCompoundPkRefMany whiteCompoundPkRefMany = new WhiteCompoundPkRefMany();
     * whiteCompoundPkRefMany.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteCompoundPkRefMany.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteCompoundPkRefManyBhv.<span style="color: #FD4747">delete</span>(whiteCompoundPkRefMany);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteCompoundPkRefMany The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteCompoundPkRefMany whiteCompoundPkRefMany) {
        doDelete(whiteCompoundPkRefMany, null);
    }

    protected void doDelete(WhiteCompoundPkRefMany whiteCompoundPkRefMany, final DeleteOption<WhiteCompoundPkRefManyCB> op) {
        assertObjectNotNull("whiteCompoundPkRefMany", whiteCompoundPkRefMany);
        prepareDeleteOption(op);
        helpDeleteInternally(whiteCompoundPkRefMany, new InternalDeleteCallback<WhiteCompoundPkRefMany>() {
            public int callbackDelegateDelete(WhiteCompoundPkRefMany et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhiteCompoundPkRefManyCB> op) {
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
     *     WhiteCompoundPkRefMany whiteCompoundPkRefMany = new WhiteCompoundPkRefMany();
     *     whiteCompoundPkRefMany.setFooName("foo");
     *     if (...) {
     *         whiteCompoundPkRefMany.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteCompoundPkRefManyList.add(whiteCompoundPkRefMany);
     * }
     * whiteCompoundPkRefManyBhv.<span style="color: #FD4747">batchInsert</span>(whiteCompoundPkRefManyList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteCompoundPkRefManyList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteCompoundPkRefMany> whiteCompoundPkRefManyList) {
        InsertOption<WhiteCompoundPkRefManyCB> op = createInsertUpdateOption();
        return doBatchInsert(whiteCompoundPkRefManyList, op);
    }

    protected int[] doBatchInsert(List<WhiteCompoundPkRefMany> whiteCompoundPkRefManyList, InsertOption<WhiteCompoundPkRefManyCB> op) {
        assertObjectNotNull("whiteCompoundPkRefManyList", whiteCompoundPkRefManyList);
        prepareBatchInsertOption(whiteCompoundPkRefManyList, op);
        return delegateBatchInsert(whiteCompoundPkRefManyList, op);
    }

    protected void prepareBatchInsertOption(List<WhiteCompoundPkRefMany> whiteCompoundPkRefManyList, InsertOption<WhiteCompoundPkRefManyCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(whiteCompoundPkRefManyList);
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
     *     WhiteCompoundPkRefMany whiteCompoundPkRefMany = new WhiteCompoundPkRefMany();
     *     whiteCompoundPkRefMany.setFooName("foo");
     *     if (...) {
     *         whiteCompoundPkRefMany.setFooPrice(123);
     *     } else {
     *         whiteCompoundPkRefMany.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteCompoundPkRefMany.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteCompoundPkRefManyList.add(whiteCompoundPkRefMany);
     * }
     * whiteCompoundPkRefManyBhv.<span style="color: #FD4747">batchUpdate</span>(whiteCompoundPkRefManyList);
     * </pre>
     * @param whiteCompoundPkRefManyList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteCompoundPkRefMany> whiteCompoundPkRefManyList) {
        UpdateOption<WhiteCompoundPkRefManyCB> op = createPlainUpdateOption();
        return doBatchUpdate(whiteCompoundPkRefManyList, op);
    }

    protected int[] doBatchUpdate(List<WhiteCompoundPkRefMany> whiteCompoundPkRefManyList, UpdateOption<WhiteCompoundPkRefManyCB> op) {
        assertObjectNotNull("whiteCompoundPkRefManyList", whiteCompoundPkRefManyList);
        prepareBatchUpdateOption(whiteCompoundPkRefManyList, op);
        return delegateBatchUpdate(whiteCompoundPkRefManyList, op);
    }

    protected void prepareBatchUpdateOption(List<WhiteCompoundPkRefMany> whiteCompoundPkRefManyList, UpdateOption<WhiteCompoundPkRefManyCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(whiteCompoundPkRefManyList);
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
     * whiteCompoundPkRefManyBhv.<span style="color: #FD4747">batchUpdate</span>(whiteCompoundPkRefManyList, new SpecifyQuery<WhiteCompoundPkRefManyCB>() {
     *     public void specify(WhiteCompoundPkRefManyCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteCompoundPkRefManyBhv.<span style="color: #FD4747">batchUpdate</span>(whiteCompoundPkRefManyList, new SpecifyQuery<WhiteCompoundPkRefManyCB>() {
     *     public void specify(WhiteCompoundPkRefManyCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteCompoundPkRefManyList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteCompoundPkRefMany> whiteCompoundPkRefManyList, SpecifyQuery<WhiteCompoundPkRefManyCB> updateColumnSpec) {
        return doBatchUpdate(whiteCompoundPkRefManyList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteCompoundPkRefManyList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteCompoundPkRefMany> whiteCompoundPkRefManyList) {
        return doBatchDelete(whiteCompoundPkRefManyList, null);
    }

    protected int[] doBatchDelete(List<WhiteCompoundPkRefMany> whiteCompoundPkRefManyList, DeleteOption<WhiteCompoundPkRefManyCB> op) {
        assertObjectNotNull("whiteCompoundPkRefManyList", whiteCompoundPkRefManyList);
        prepareDeleteOption(op);
        return delegateBatchDelete(whiteCompoundPkRefManyList, op);
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
     * whiteCompoundPkRefManyBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteCompoundPkRefMany, WhiteCompoundPkRefManyCB&gt;() {
     *     public ConditionBean setup(whiteCompoundPkRefMany entity, WhiteCompoundPkRefManyCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteCompoundPkRefMany, WhiteCompoundPkRefManyCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteCompoundPkRefMany, WhiteCompoundPkRefManyCB> sp, InsertOption<WhiteCompoundPkRefManyCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        WhiteCompoundPkRefMany e = new WhiteCompoundPkRefMany();
        WhiteCompoundPkRefManyCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected WhiteCompoundPkRefManyCB createCBForQueryInsert() {
        WhiteCompoundPkRefManyCB cb = newMyConditionBean();
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
     * WhiteCompoundPkRefMany whiteCompoundPkRefMany = new WhiteCompoundPkRefMany();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteCompoundPkRefMany.setPK...(value);</span>
     * whiteCompoundPkRefMany.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteCompoundPkRefMany.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteCompoundPkRefMany.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteCompoundPkRefMany.setVersionNo(value);</span>
     * WhiteCompoundPkRefManyCB cb = new WhiteCompoundPkRefManyCB();
     * cb.query().setFoo...(value);
     * whiteCompoundPkRefManyBhv.<span style="color: #FD4747">queryUpdate</span>(whiteCompoundPkRefMany, cb);
     * </pre>
     * @param whiteCompoundPkRefMany The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteCompoundPkRefMany. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteCompoundPkRefMany whiteCompoundPkRefMany, WhiteCompoundPkRefManyCB cb) {
        return doQueryUpdate(whiteCompoundPkRefMany, cb, null);
    }

    protected int doQueryUpdate(WhiteCompoundPkRefMany whiteCompoundPkRefMany, WhiteCompoundPkRefManyCB cb, UpdateOption<WhiteCompoundPkRefManyCB> op) {
        assertObjectNotNull("whiteCompoundPkRefMany", whiteCompoundPkRefMany); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(whiteCompoundPkRefMany, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (WhiteCompoundPkRefManyCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (WhiteCompoundPkRefManyCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteCompoundPkRefManyCB cb = new WhiteCompoundPkRefManyCB();
     * cb.query().setFoo...(value);
     * whiteCompoundPkRefManyBhv.<span style="color: #FD4747">queryDelete</span>(whiteCompoundPkRefMany, cb);
     * </pre>
     * @param cb The condition-bean of WhiteCompoundPkRefMany. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteCompoundPkRefManyCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteCompoundPkRefManyCB cb, DeleteOption<WhiteCompoundPkRefManyCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((WhiteCompoundPkRefManyCB)cb); }
        else { return varyingQueryDelete((WhiteCompoundPkRefManyCB)cb, downcast(op)); }
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
     * WhiteCompoundPkRefMany whiteCompoundPkRefMany = new WhiteCompoundPkRefMany();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteCompoundPkRefMany.setFoo...(value);
     * whiteCompoundPkRefMany.setBar...(value);
     * InsertOption<WhiteCompoundPkRefManyCB> option = new InsertOption<WhiteCompoundPkRefManyCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteCompoundPkRefManyBhv.<span style="color: #FD4747">varyingInsert</span>(whiteCompoundPkRefMany, option);
     * ... = whiteCompoundPkRefMany.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteCompoundPkRefMany The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteCompoundPkRefMany whiteCompoundPkRefMany, InsertOption<WhiteCompoundPkRefManyCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteCompoundPkRefMany, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteCompoundPkRefMany whiteCompoundPkRefMany = new WhiteCompoundPkRefMany();
     * whiteCompoundPkRefMany.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteCompoundPkRefMany.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteCompoundPkRefMany.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteCompoundPkRefManyCB&gt; option = new UpdateOption&lt;WhiteCompoundPkRefManyCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteCompoundPkRefManyCB&gt;() {
     *         public void specify(WhiteCompoundPkRefManyCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteCompoundPkRefManyBhv.<span style="color: #FD4747">varyingUpdate</span>(whiteCompoundPkRefMany, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteCompoundPkRefMany The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteCompoundPkRefMany whiteCompoundPkRefMany, UpdateOption<WhiteCompoundPkRefManyCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteCompoundPkRefMany, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteCompoundPkRefMany The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteCompoundPkRefMany whiteCompoundPkRefMany, InsertOption<WhiteCompoundPkRefManyCB> insertOption, UpdateOption<WhiteCompoundPkRefManyCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(whiteCompoundPkRefMany, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteCompoundPkRefMany The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteCompoundPkRefMany whiteCompoundPkRefMany, DeleteOption<WhiteCompoundPkRefManyCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteCompoundPkRefMany, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteCompoundPkRefManyList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteCompoundPkRefMany> whiteCompoundPkRefManyList, InsertOption<WhiteCompoundPkRefManyCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteCompoundPkRefManyList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteCompoundPkRefManyList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteCompoundPkRefMany> whiteCompoundPkRefManyList, UpdateOption<WhiteCompoundPkRefManyCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteCompoundPkRefManyList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteCompoundPkRefManyList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteCompoundPkRefMany> whiteCompoundPkRefManyList, DeleteOption<WhiteCompoundPkRefManyCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteCompoundPkRefManyList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteCompoundPkRefMany, WhiteCompoundPkRefManyCB> setupper, InsertOption<WhiteCompoundPkRefManyCB> option) {
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
     * WhiteCompoundPkRefMany whiteCompoundPkRefMany = new WhiteCompoundPkRefMany();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteCompoundPkRefMany.setPK...(value);</span>
     * whiteCompoundPkRefMany.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteCompoundPkRefMany.setVersionNo(value);</span>
     * WhiteCompoundPkRefManyCB cb = new WhiteCompoundPkRefManyCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteCompoundPkRefManyCB&gt; option = new UpdateOption&lt;WhiteCompoundPkRefManyCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteCompoundPkRefManyCB&gt;() {
     *     public void specify(WhiteCompoundPkRefManyCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteCompoundPkRefManyBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(whiteCompoundPkRefMany, cb, option);
     * </pre>
     * @param whiteCompoundPkRefMany The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteCompoundPkRefMany. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteCompoundPkRefMany whiteCompoundPkRefMany, WhiteCompoundPkRefManyCB cb, UpdateOption<WhiteCompoundPkRefManyCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteCompoundPkRefMany, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteCompoundPkRefMany. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteCompoundPkRefManyCB cb, DeleteOption<WhiteCompoundPkRefManyCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteCompoundPkRefManyBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhiteCompoundPkRefManyCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhiteCompoundPkRefManyCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhiteCompoundPkRefMany> void delegateSelectCursor(WhiteCompoundPkRefManyCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends WhiteCompoundPkRefMany> List<ENTITY> delegateSelectList(WhiteCompoundPkRefManyCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhiteCompoundPkRefMany et, InsertOption<WhiteCompoundPkRefManyCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(WhiteCompoundPkRefMany et, UpdateOption<WhiteCompoundPkRefManyCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(WhiteCompoundPkRefMany et, UpdateOption<WhiteCompoundPkRefManyCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(WhiteCompoundPkRefMany et, DeleteOption<WhiteCompoundPkRefManyCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(WhiteCompoundPkRefMany et, DeleteOption<WhiteCompoundPkRefManyCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<WhiteCompoundPkRefMany> ls, InsertOption<WhiteCompoundPkRefManyCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhiteCompoundPkRefMany> ls, UpdateOption<WhiteCompoundPkRefManyCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhiteCompoundPkRefMany> ls, UpdateOption<WhiteCompoundPkRefManyCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhiteCompoundPkRefMany> ls, DeleteOption<WhiteCompoundPkRefManyCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhiteCompoundPkRefMany> ls, DeleteOption<WhiteCompoundPkRefManyCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhiteCompoundPkRefMany et, WhiteCompoundPkRefManyCB inCB, ConditionBean resCB, InsertOption<WhiteCompoundPkRefManyCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhiteCompoundPkRefMany et, WhiteCompoundPkRefManyCB cb, UpdateOption<WhiteCompoundPkRefManyCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(WhiteCompoundPkRefManyCB cb, DeleteOption<WhiteCompoundPkRefManyCB> op)
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
    protected WhiteCompoundPkRefMany downcast(Entity et) {
        return helpEntityDowncastInternally(et, WhiteCompoundPkRefMany.class);
    }

    protected WhiteCompoundPkRefManyCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, WhiteCompoundPkRefManyCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<WhiteCompoundPkRefMany> downcast(List<? extends Entity> ls) {
        return (List<WhiteCompoundPkRefMany>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteCompoundPkRefManyCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<WhiteCompoundPkRefManyCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteCompoundPkRefManyCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<WhiteCompoundPkRefManyCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteCompoundPkRefManyCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<WhiteCompoundPkRefManyCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteCompoundPkRefMany, WhiteCompoundPkRefManyCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<WhiteCompoundPkRefMany, WhiteCompoundPkRefManyCB>)sp;
    }
}
