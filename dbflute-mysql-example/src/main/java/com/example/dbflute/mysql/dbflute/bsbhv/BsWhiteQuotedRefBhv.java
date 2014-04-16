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
 * The behavior of WHITE_QUOTED_REF as TABLE. <br />
 * <pre>
 * [primary key]
 *     WHERE
 *
 * [column]
 *     WHERE, ORDER
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
 *     white_quoted
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     whiteQuoted
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteQuotedRefBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_quoted_ref"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return WhiteQuotedRefDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteQuotedRefDbm getMyDBMeta() { return WhiteQuotedRefDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteQuotedRef newMyEntity() { return new WhiteQuotedRef(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteQuotedRefCB newMyConditionBean() { return new WhiteQuotedRefCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteQuotedRefCB cb = new WhiteQuotedRefCB();
     * cb.query().setFoo...(value);
     * int count = whiteQuotedRefBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteQuotedRef. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteQuotedRefCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteQuotedRefCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteQuotedRefCB cb) { // called by selectPage(cb)
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
     * WhiteQuotedRefCB cb = new WhiteQuotedRefCB();
     * cb.query().setFoo...(value);
     * WhiteQuotedRef whiteQuotedRef = whiteQuotedRefBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (whiteQuotedRef != null) {
     *     ... = whiteQuotedRef.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteQuotedRef. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteQuotedRef selectEntity(WhiteQuotedRefCB cb) {
        return doSelectEntity(cb, WhiteQuotedRef.class);
    }

    protected <ENTITY extends WhiteQuotedRef> ENTITY doSelectEntity(WhiteQuotedRefCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, WhiteQuotedRefCB>() {
            public List<ENTITY> callbackSelectList(WhiteQuotedRefCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * WhiteQuotedRefCB cb = new WhiteQuotedRefCB();
     * cb.query().setFoo...(value);
     * WhiteQuotedRef whiteQuotedRef = whiteQuotedRefBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteQuotedRef.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteQuotedRef. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteQuotedRef selectEntityWithDeletedCheck(WhiteQuotedRefCB cb) {
        return doSelectEntityWithDeletedCheck(cb, WhiteQuotedRef.class);
    }

    protected <ENTITY extends WhiteQuotedRef> ENTITY doSelectEntityWithDeletedCheck(WhiteQuotedRefCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteQuotedRefCB>() {
            public List<ENTITY> callbackSelectList(WhiteQuotedRefCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param where The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteQuotedRef selectByPKValue(Integer where) {
        return doSelectByPKValue(where, WhiteQuotedRef.class);
    }

    protected <ENTITY extends WhiteQuotedRef> ENTITY doSelectByPKValue(Integer where, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(where), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param where The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteQuotedRef selectByPKValueWithDeletedCheck(Integer where) {
        return doSelectByPKValueWithDeletedCheck(where, WhiteQuotedRef.class);
    }

    protected <ENTITY extends WhiteQuotedRef> ENTITY doSelectByPKValueWithDeletedCheck(Integer where, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(where), entityType);
    }

    private WhiteQuotedRefCB buildPKCB(Integer where) {
        assertObjectNotNull("where", where);
        WhiteQuotedRefCB cb = newMyConditionBean();
        cb.query().setWhere_Equal(where);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteQuotedRefCB cb = new WhiteQuotedRefCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteQuotedRef&gt; whiteQuotedRefList = whiteQuotedRefBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (WhiteQuotedRef whiteQuotedRef : whiteQuotedRefList) {
     *     ... = whiteQuotedRef.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteQuotedRef. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteQuotedRef> selectList(WhiteQuotedRefCB cb) {
        return doSelectList(cb, WhiteQuotedRef.class);
    }

    protected <ENTITY extends WhiteQuotedRef> ListResultBean<ENTITY> doSelectList(WhiteQuotedRefCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, WhiteQuotedRefCB>() {
            public List<ENTITY> callbackSelectList(WhiteQuotedRefCB lcb, Class<ENTITY> ltp) { return delegateSelectList(lcb, ltp); } });
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
     * WhiteQuotedRefCB cb = new WhiteQuotedRefCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteQuotedRef&gt; page = whiteQuotedRefBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteQuotedRef whiteQuotedRef : page) {
     *     ... = whiteQuotedRef.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteQuotedRef. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteQuotedRef> selectPage(WhiteQuotedRefCB cb) {
        return doSelectPage(cb, WhiteQuotedRef.class);
    }

    protected <ENTITY extends WhiteQuotedRef> PagingResultBean<ENTITY> doSelectPage(WhiteQuotedRefCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, WhiteQuotedRefCB>() {
            public int callbackSelectCount(WhiteQuotedRefCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteQuotedRefCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * WhiteQuotedRefCB cb = new WhiteQuotedRefCB();
     * cb.query().setFoo...(value);
     * whiteQuotedRefBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteQuotedRef&gt;() {
     *     public void handle(WhiteQuotedRef entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteQuotedRef. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteQuotedRef. (NotNull)
     */
    public void selectCursor(WhiteQuotedRefCB cb, EntityRowHandler<WhiteQuotedRef> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, WhiteQuotedRef.class);
    }

    protected <ENTITY extends WhiteQuotedRef> void doSelectCursor(WhiteQuotedRefCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, WhiteQuotedRefCB>() {
            public void callbackSelectCursor(WhiteQuotedRefCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(WhiteQuotedRefCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteQuotedRefBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteQuotedRefCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<WhiteQuotedRefCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends WhiteQuotedRefCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends WhiteQuotedRefCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
     * Pull out the list of foreign table 'WhiteQuoted'.
     * @param whiteQuotedRefList The list of whiteQuotedRef. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteQuoted> pulloutWhiteQuoted(List<WhiteQuotedRef> whiteQuotedRefList) {
        return helpPulloutInternally(whiteQuotedRefList, new InternalPulloutCallback<WhiteQuotedRef, WhiteQuoted>() {
            public WhiteQuoted getFr(WhiteQuotedRef et) { return et.getWhiteQuoted(); }
            public boolean hasRf() { return true; }
            public void setRfLs(WhiteQuoted et, List<WhiteQuotedRef> ls)
            { et.setWhiteQuotedRefList(ls); }
        });
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key where.
     * @param whiteQuotedRefList The list of whiteQuotedRef. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractWhereList(List<WhiteQuotedRef> whiteQuotedRefList) {
        return helpExtractListInternally(whiteQuotedRefList, new InternalExtractCallback<WhiteQuotedRef, Integer>() {
            public Integer getCV(WhiteQuotedRef et) { return et.getWhere(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteQuotedRef whiteQuotedRef = new WhiteQuotedRef();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteQuotedRef.setFoo...(value);
     * whiteQuotedRef.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteQuotedRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteQuotedRef.set...;</span>
     * whiteQuotedRefBhv.<span style="color: #FD4747">insert</span>(whiteQuotedRef);
     * ... = whiteQuotedRef.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteQuotedRef The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteQuotedRef whiteQuotedRef) {
        doInsert(whiteQuotedRef, null);
    }

    protected void doInsert(WhiteQuotedRef whiteQuotedRef, InsertOption<WhiteQuotedRefCB> op) {
        assertObjectNotNull("whiteQuotedRef", whiteQuotedRef);
        prepareInsertOption(op);
        delegateInsert(whiteQuotedRef, op);
    }

    protected void prepareInsertOption(InsertOption<WhiteQuotedRefCB> op) {
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
     * WhiteQuotedRef whiteQuotedRef = new WhiteQuotedRef();
     * whiteQuotedRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteQuotedRef.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteQuotedRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteQuotedRef.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteQuotedRef.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteQuotedRefBhv.<span style="color: #FD4747">update</span>(whiteQuotedRef);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteQuotedRef The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final WhiteQuotedRef whiteQuotedRef) {
        doUpdate(whiteQuotedRef, null);
    }

    protected void doUpdate(WhiteQuotedRef whiteQuotedRef, final UpdateOption<WhiteQuotedRefCB> op) {
        assertObjectNotNull("whiteQuotedRef", whiteQuotedRef);
        prepareUpdateOption(op);
        helpUpdateInternally(whiteQuotedRef, new InternalUpdateCallback<WhiteQuotedRef>() {
            public int callbackDelegateUpdate(WhiteQuotedRef et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhiteQuotedRefCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected WhiteQuotedRefCB createCBForVaryingUpdate() {
        WhiteQuotedRefCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected WhiteQuotedRefCB createCBForSpecifiedUpdate() {
        WhiteQuotedRefCB cb = newMyConditionBean();
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
     * @param whiteQuotedRef The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteQuotedRef whiteQuotedRef) {
        doInesrtOrUpdate(whiteQuotedRef, null, null);
    }

    protected void doInesrtOrUpdate(WhiteQuotedRef whiteQuotedRef, final InsertOption<WhiteQuotedRefCB> iop, final UpdateOption<WhiteQuotedRefCB> uop) {
        helpInsertOrUpdateInternally(whiteQuotedRef, new InternalInsertOrUpdateCallback<WhiteQuotedRef, WhiteQuotedRefCB>() {
            public void callbackInsert(WhiteQuotedRef et) { doInsert(et, iop); }
            public void callbackUpdate(WhiteQuotedRef et) { doUpdate(et, uop); }
            public WhiteQuotedRefCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(WhiteQuotedRefCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<WhiteQuotedRefCB>();
            uop = uop != null ? uop : new UpdateOption<WhiteQuotedRefCB>();
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
     * WhiteQuotedRef whiteQuotedRef = new WhiteQuotedRef();
     * whiteQuotedRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteQuotedRef.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteQuotedRefBhv.<span style="color: #FD4747">delete</span>(whiteQuotedRef);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteQuotedRef The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteQuotedRef whiteQuotedRef) {
        doDelete(whiteQuotedRef, null);
    }

    protected void doDelete(WhiteQuotedRef whiteQuotedRef, final DeleteOption<WhiteQuotedRefCB> op) {
        assertObjectNotNull("whiteQuotedRef", whiteQuotedRef);
        prepareDeleteOption(op);
        helpDeleteInternally(whiteQuotedRef, new InternalDeleteCallback<WhiteQuotedRef>() {
            public int callbackDelegateDelete(WhiteQuotedRef et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhiteQuotedRefCB> op) {
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
     *     WhiteQuotedRef whiteQuotedRef = new WhiteQuotedRef();
     *     whiteQuotedRef.setFooName("foo");
     *     if (...) {
     *         whiteQuotedRef.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteQuotedRefList.add(whiteQuotedRef);
     * }
     * whiteQuotedRefBhv.<span style="color: #FD4747">batchInsert</span>(whiteQuotedRefList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteQuotedRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteQuotedRef> whiteQuotedRefList) {
        InsertOption<WhiteQuotedRefCB> op = createInsertUpdateOption();
        return doBatchInsert(whiteQuotedRefList, op);
    }

    protected int[] doBatchInsert(List<WhiteQuotedRef> whiteQuotedRefList, InsertOption<WhiteQuotedRefCB> op) {
        assertObjectNotNull("whiteQuotedRefList", whiteQuotedRefList);
        prepareBatchInsertOption(whiteQuotedRefList, op);
        return delegateBatchInsert(whiteQuotedRefList, op);
    }

    protected void prepareBatchInsertOption(List<WhiteQuotedRef> whiteQuotedRefList, InsertOption<WhiteQuotedRefCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(whiteQuotedRefList);
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
     *     WhiteQuotedRef whiteQuotedRef = new WhiteQuotedRef();
     *     whiteQuotedRef.setFooName("foo");
     *     if (...) {
     *         whiteQuotedRef.setFooPrice(123);
     *     } else {
     *         whiteQuotedRef.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteQuotedRef.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteQuotedRefList.add(whiteQuotedRef);
     * }
     * whiteQuotedRefBhv.<span style="color: #FD4747">batchUpdate</span>(whiteQuotedRefList);
     * </pre>
     * @param whiteQuotedRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteQuotedRef> whiteQuotedRefList) {
        UpdateOption<WhiteQuotedRefCB> op = createPlainUpdateOption();
        return doBatchUpdate(whiteQuotedRefList, op);
    }

    protected int[] doBatchUpdate(List<WhiteQuotedRef> whiteQuotedRefList, UpdateOption<WhiteQuotedRefCB> op) {
        assertObjectNotNull("whiteQuotedRefList", whiteQuotedRefList);
        prepareBatchUpdateOption(whiteQuotedRefList, op);
        return delegateBatchUpdate(whiteQuotedRefList, op);
    }

    protected void prepareBatchUpdateOption(List<WhiteQuotedRef> whiteQuotedRefList, UpdateOption<WhiteQuotedRefCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(whiteQuotedRefList);
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
     * whiteQuotedRefBhv.<span style="color: #FD4747">batchUpdate</span>(whiteQuotedRefList, new SpecifyQuery<WhiteQuotedRefCB>() {
     *     public void specify(WhiteQuotedRefCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteQuotedRefBhv.<span style="color: #FD4747">batchUpdate</span>(whiteQuotedRefList, new SpecifyQuery<WhiteQuotedRefCB>() {
     *     public void specify(WhiteQuotedRefCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteQuotedRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteQuotedRef> whiteQuotedRefList, SpecifyQuery<WhiteQuotedRefCB> updateColumnSpec) {
        return doBatchUpdate(whiteQuotedRefList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteQuotedRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteQuotedRef> whiteQuotedRefList) {
        return doBatchDelete(whiteQuotedRefList, null);
    }

    protected int[] doBatchDelete(List<WhiteQuotedRef> whiteQuotedRefList, DeleteOption<WhiteQuotedRefCB> op) {
        assertObjectNotNull("whiteQuotedRefList", whiteQuotedRefList);
        prepareDeleteOption(op);
        return delegateBatchDelete(whiteQuotedRefList, op);
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
     * whiteQuotedRefBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteQuotedRef, WhiteQuotedRefCB&gt;() {
     *     public ConditionBean setup(whiteQuotedRef entity, WhiteQuotedRefCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteQuotedRef, WhiteQuotedRefCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteQuotedRef, WhiteQuotedRefCB> sp, InsertOption<WhiteQuotedRefCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        WhiteQuotedRef e = new WhiteQuotedRef();
        WhiteQuotedRefCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected WhiteQuotedRefCB createCBForQueryInsert() {
        WhiteQuotedRefCB cb = newMyConditionBean();
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
     * WhiteQuotedRef whiteQuotedRef = new WhiteQuotedRef();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteQuotedRef.setPK...(value);</span>
     * whiteQuotedRef.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteQuotedRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteQuotedRef.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteQuotedRef.setVersionNo(value);</span>
     * WhiteQuotedRefCB cb = new WhiteQuotedRefCB();
     * cb.query().setFoo...(value);
     * whiteQuotedRefBhv.<span style="color: #FD4747">queryUpdate</span>(whiteQuotedRef, cb);
     * </pre>
     * @param whiteQuotedRef The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteQuotedRef. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteQuotedRef whiteQuotedRef, WhiteQuotedRefCB cb) {
        return doQueryUpdate(whiteQuotedRef, cb, null);
    }

    protected int doQueryUpdate(WhiteQuotedRef whiteQuotedRef, WhiteQuotedRefCB cb, UpdateOption<WhiteQuotedRefCB> op) {
        assertObjectNotNull("whiteQuotedRef", whiteQuotedRef); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(whiteQuotedRef, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (WhiteQuotedRefCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (WhiteQuotedRefCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteQuotedRefCB cb = new WhiteQuotedRefCB();
     * cb.query().setFoo...(value);
     * whiteQuotedRefBhv.<span style="color: #FD4747">queryDelete</span>(whiteQuotedRef, cb);
     * </pre>
     * @param cb The condition-bean of WhiteQuotedRef. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteQuotedRefCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteQuotedRefCB cb, DeleteOption<WhiteQuotedRefCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((WhiteQuotedRefCB)cb); }
        else { return varyingQueryDelete((WhiteQuotedRefCB)cb, downcast(op)); }
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
     * WhiteQuotedRef whiteQuotedRef = new WhiteQuotedRef();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteQuotedRef.setFoo...(value);
     * whiteQuotedRef.setBar...(value);
     * InsertOption<WhiteQuotedRefCB> option = new InsertOption<WhiteQuotedRefCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteQuotedRefBhv.<span style="color: #FD4747">varyingInsert</span>(whiteQuotedRef, option);
     * ... = whiteQuotedRef.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteQuotedRef The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteQuotedRef whiteQuotedRef, InsertOption<WhiteQuotedRefCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteQuotedRef, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteQuotedRef whiteQuotedRef = new WhiteQuotedRef();
     * whiteQuotedRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteQuotedRef.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteQuotedRef.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteQuotedRefCB&gt; option = new UpdateOption&lt;WhiteQuotedRefCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteQuotedRefCB&gt;() {
     *         public void specify(WhiteQuotedRefCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteQuotedRefBhv.<span style="color: #FD4747">varyingUpdate</span>(whiteQuotedRef, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteQuotedRef The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteQuotedRef whiteQuotedRef, UpdateOption<WhiteQuotedRefCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteQuotedRef, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteQuotedRef The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteQuotedRef whiteQuotedRef, InsertOption<WhiteQuotedRefCB> insertOption, UpdateOption<WhiteQuotedRefCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(whiteQuotedRef, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteQuotedRef The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteQuotedRef whiteQuotedRef, DeleteOption<WhiteQuotedRefCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteQuotedRef, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteQuotedRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteQuotedRef> whiteQuotedRefList, InsertOption<WhiteQuotedRefCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteQuotedRefList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteQuotedRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteQuotedRef> whiteQuotedRefList, UpdateOption<WhiteQuotedRefCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteQuotedRefList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteQuotedRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteQuotedRef> whiteQuotedRefList, DeleteOption<WhiteQuotedRefCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteQuotedRefList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteQuotedRef, WhiteQuotedRefCB> setupper, InsertOption<WhiteQuotedRefCB> option) {
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
     * WhiteQuotedRef whiteQuotedRef = new WhiteQuotedRef();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteQuotedRef.setPK...(value);</span>
     * whiteQuotedRef.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteQuotedRef.setVersionNo(value);</span>
     * WhiteQuotedRefCB cb = new WhiteQuotedRefCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteQuotedRefCB&gt; option = new UpdateOption&lt;WhiteQuotedRefCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteQuotedRefCB&gt;() {
     *     public void specify(WhiteQuotedRefCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteQuotedRefBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(whiteQuotedRef, cb, option);
     * </pre>
     * @param whiteQuotedRef The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteQuotedRef. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteQuotedRef whiteQuotedRef, WhiteQuotedRefCB cb, UpdateOption<WhiteQuotedRefCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteQuotedRef, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteQuotedRef. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteQuotedRefCB cb, DeleteOption<WhiteQuotedRefCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteQuotedRefBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhiteQuotedRefCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhiteQuotedRefCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhiteQuotedRef> void delegateSelectCursor(WhiteQuotedRefCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends WhiteQuotedRef> List<ENTITY> delegateSelectList(WhiteQuotedRefCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhiteQuotedRef et, InsertOption<WhiteQuotedRefCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(WhiteQuotedRef et, UpdateOption<WhiteQuotedRefCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(WhiteQuotedRef et, UpdateOption<WhiteQuotedRefCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(WhiteQuotedRef et, DeleteOption<WhiteQuotedRefCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(WhiteQuotedRef et, DeleteOption<WhiteQuotedRefCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<WhiteQuotedRef> ls, InsertOption<WhiteQuotedRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhiteQuotedRef> ls, UpdateOption<WhiteQuotedRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhiteQuotedRef> ls, UpdateOption<WhiteQuotedRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhiteQuotedRef> ls, DeleteOption<WhiteQuotedRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhiteQuotedRef> ls, DeleteOption<WhiteQuotedRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhiteQuotedRef et, WhiteQuotedRefCB inCB, ConditionBean resCB, InsertOption<WhiteQuotedRefCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhiteQuotedRef et, WhiteQuotedRefCB cb, UpdateOption<WhiteQuotedRefCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(WhiteQuotedRefCB cb, DeleteOption<WhiteQuotedRefCB> op)
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
    protected WhiteQuotedRef downcast(Entity et) {
        return helpEntityDowncastInternally(et, WhiteQuotedRef.class);
    }

    protected WhiteQuotedRefCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, WhiteQuotedRefCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<WhiteQuotedRef> downcast(List<? extends Entity> ls) {
        return (List<WhiteQuotedRef>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteQuotedRefCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<WhiteQuotedRefCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteQuotedRefCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<WhiteQuotedRefCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteQuotedRefCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<WhiteQuotedRefCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteQuotedRef, WhiteQuotedRefCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<WhiteQuotedRef, WhiteQuotedRefCB>)sp;
    }
}
