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
 * The behavior of WHITE_ALL_IN_ONE_CLS_NORMAL_COL_REF as TABLE. <br />
 * <pre>
 * [primary key]
 *     FOO_CODE, BAR_CODE, QUX_CODE
 *
 * [column]
 *     CLS_REF_ID, FOO_CODE, BAR_CODE, QUX_CODE
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
 *     WHITE_ALL_IN_ONE_CLS_ELEMENT(AsFoo)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     whiteAllInOneClsElementAsFoo, whiteAllInOneClsElementAsBar
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteAllInOneClsNormalColRefBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_all_in_one_cls_normal_col_ref"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return WhiteAllInOneClsNormalColRefDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteAllInOneClsNormalColRefDbm getMyDBMeta() { return WhiteAllInOneClsNormalColRefDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteAllInOneClsNormalColRef newMyEntity() { return new WhiteAllInOneClsNormalColRef(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteAllInOneClsNormalColRefCB newMyConditionBean() { return new WhiteAllInOneClsNormalColRefCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteAllInOneClsNormalColRefCB cb = new WhiteAllInOneClsNormalColRefCB();
     * cb.query().setFoo...(value);
     * int count = whiteAllInOneClsNormalColRefBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteAllInOneClsNormalColRef. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteAllInOneClsNormalColRefCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteAllInOneClsNormalColRefCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteAllInOneClsNormalColRefCB cb) { // called by selectPage(cb)
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
     * WhiteAllInOneClsNormalColRefCB cb = new WhiteAllInOneClsNormalColRefCB();
     * cb.query().setFoo...(value);
     * WhiteAllInOneClsNormalColRef whiteAllInOneClsNormalColRef = whiteAllInOneClsNormalColRefBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (whiteAllInOneClsNormalColRef != null) {
     *     ... = whiteAllInOneClsNormalColRef.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteAllInOneClsNormalColRef. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteAllInOneClsNormalColRef selectEntity(WhiteAllInOneClsNormalColRefCB cb) {
        return doSelectEntity(cb, WhiteAllInOneClsNormalColRef.class);
    }

    protected <ENTITY extends WhiteAllInOneClsNormalColRef> ENTITY doSelectEntity(WhiteAllInOneClsNormalColRefCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, WhiteAllInOneClsNormalColRefCB>() {
            public List<ENTITY> callbackSelectList(WhiteAllInOneClsNormalColRefCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * WhiteAllInOneClsNormalColRefCB cb = new WhiteAllInOneClsNormalColRefCB();
     * cb.query().setFoo...(value);
     * WhiteAllInOneClsNormalColRef whiteAllInOneClsNormalColRef = whiteAllInOneClsNormalColRefBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteAllInOneClsNormalColRef.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteAllInOneClsNormalColRef. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteAllInOneClsNormalColRef selectEntityWithDeletedCheck(WhiteAllInOneClsNormalColRefCB cb) {
        return doSelectEntityWithDeletedCheck(cb, WhiteAllInOneClsNormalColRef.class);
    }

    protected <ENTITY extends WhiteAllInOneClsNormalColRef> ENTITY doSelectEntityWithDeletedCheck(WhiteAllInOneClsNormalColRefCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteAllInOneClsNormalColRefCB>() {
            public List<ENTITY> callbackSelectList(WhiteAllInOneClsNormalColRefCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param fooCode The one of primary key. (NotNull)
     * @param barCode The one of primary key. (NotNull)
     * @param quxCode The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteAllInOneClsNormalColRef selectByPKValue(String fooCode, String barCode, String quxCode) {
        return doSelectByPKValue(fooCode, barCode, quxCode, WhiteAllInOneClsNormalColRef.class);
    }

    protected <ENTITY extends WhiteAllInOneClsNormalColRef> ENTITY doSelectByPKValue(String fooCode, String barCode, String quxCode, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(fooCode, barCode, quxCode), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param fooCode The one of primary key. (NotNull)
     * @param barCode The one of primary key. (NotNull)
     * @param quxCode The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteAllInOneClsNormalColRef selectByPKValueWithDeletedCheck(String fooCode, String barCode, String quxCode) {
        return doSelectByPKValueWithDeletedCheck(fooCode, barCode, quxCode, WhiteAllInOneClsNormalColRef.class);
    }

    protected <ENTITY extends WhiteAllInOneClsNormalColRef> ENTITY doSelectByPKValueWithDeletedCheck(String fooCode, String barCode, String quxCode, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(fooCode, barCode, quxCode), entityType);
    }

    private WhiteAllInOneClsNormalColRefCB buildPKCB(String fooCode, String barCode, String quxCode) {
        assertObjectNotNull("fooCode", fooCode);assertObjectNotNull("barCode", barCode);assertObjectNotNull("quxCode", quxCode);
        WhiteAllInOneClsNormalColRefCB cb = newMyConditionBean();
        cb.query().setFooCode_Equal(fooCode);cb.query().setBarCode_Equal(barCode);cb.query().setQuxCode_Equal(quxCode);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteAllInOneClsNormalColRefCB cb = new WhiteAllInOneClsNormalColRefCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteAllInOneClsNormalColRef&gt; whiteAllInOneClsNormalColRefList = whiteAllInOneClsNormalColRefBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (WhiteAllInOneClsNormalColRef whiteAllInOneClsNormalColRef : whiteAllInOneClsNormalColRefList) {
     *     ... = whiteAllInOneClsNormalColRef.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteAllInOneClsNormalColRef. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteAllInOneClsNormalColRef> selectList(WhiteAllInOneClsNormalColRefCB cb) {
        return doSelectList(cb, WhiteAllInOneClsNormalColRef.class);
    }

    protected <ENTITY extends WhiteAllInOneClsNormalColRef> ListResultBean<ENTITY> doSelectList(WhiteAllInOneClsNormalColRefCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, WhiteAllInOneClsNormalColRefCB>() {
            public List<ENTITY> callbackSelectList(WhiteAllInOneClsNormalColRefCB lcb, Class<ENTITY> ltp) { return delegateSelectList(lcb, ltp); } });
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
     * WhiteAllInOneClsNormalColRefCB cb = new WhiteAllInOneClsNormalColRefCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteAllInOneClsNormalColRef&gt; page = whiteAllInOneClsNormalColRefBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteAllInOneClsNormalColRef whiteAllInOneClsNormalColRef : page) {
     *     ... = whiteAllInOneClsNormalColRef.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteAllInOneClsNormalColRef. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteAllInOneClsNormalColRef> selectPage(WhiteAllInOneClsNormalColRefCB cb) {
        return doSelectPage(cb, WhiteAllInOneClsNormalColRef.class);
    }

    protected <ENTITY extends WhiteAllInOneClsNormalColRef> PagingResultBean<ENTITY> doSelectPage(WhiteAllInOneClsNormalColRefCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, WhiteAllInOneClsNormalColRefCB>() {
            public int callbackSelectCount(WhiteAllInOneClsNormalColRefCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteAllInOneClsNormalColRefCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * WhiteAllInOneClsNormalColRefCB cb = new WhiteAllInOneClsNormalColRefCB();
     * cb.query().setFoo...(value);
     * whiteAllInOneClsNormalColRefBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteAllInOneClsNormalColRef&gt;() {
     *     public void handle(WhiteAllInOneClsNormalColRef entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteAllInOneClsNormalColRef. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteAllInOneClsNormalColRef. (NotNull)
     */
    public void selectCursor(WhiteAllInOneClsNormalColRefCB cb, EntityRowHandler<WhiteAllInOneClsNormalColRef> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, WhiteAllInOneClsNormalColRef.class);
    }

    protected <ENTITY extends WhiteAllInOneClsNormalColRef> void doSelectCursor(WhiteAllInOneClsNormalColRefCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, WhiteAllInOneClsNormalColRefCB>() {
            public void callbackSelectCursor(WhiteAllInOneClsNormalColRefCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(WhiteAllInOneClsNormalColRefCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteAllInOneClsNormalColRefBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteAllInOneClsNormalColRefCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<WhiteAllInOneClsNormalColRefCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends WhiteAllInOneClsNormalColRefCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends WhiteAllInOneClsNormalColRefCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
     * Pull out the list of foreign table 'WhiteAllInOneClsElement'.
     * @param whiteAllInOneClsNormalColRefList The list of whiteAllInOneClsNormalColRef. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteAllInOneClsElement> pulloutWhiteAllInOneClsElementAsFoo(List<WhiteAllInOneClsNormalColRef> whiteAllInOneClsNormalColRefList) {
        return helpPulloutInternally(whiteAllInOneClsNormalColRefList, new InternalPulloutCallback<WhiteAllInOneClsNormalColRef, WhiteAllInOneClsElement>() {
            public WhiteAllInOneClsElement getFr(WhiteAllInOneClsNormalColRef et) { return et.getWhiteAllInOneClsElementAsFoo(); }
            public boolean hasRf() { return false; }
            public void setRfLs(WhiteAllInOneClsElement et, List<WhiteAllInOneClsNormalColRef> ls)
            { throw new UnsupportedOperationException(); }
        });
    }
    /**
     * Pull out the list of foreign table 'WhiteAllInOneClsElement'.
     * @param whiteAllInOneClsNormalColRefList The list of whiteAllInOneClsNormalColRef. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteAllInOneClsElement> pulloutWhiteAllInOneClsElementAsBar(List<WhiteAllInOneClsNormalColRef> whiteAllInOneClsNormalColRefList) {
        return helpPulloutInternally(whiteAllInOneClsNormalColRefList, new InternalPulloutCallback<WhiteAllInOneClsNormalColRef, WhiteAllInOneClsElement>() {
            public WhiteAllInOneClsElement getFr(WhiteAllInOneClsNormalColRef et) { return et.getWhiteAllInOneClsElementAsBar(); }
            public boolean hasRf() { return false; }
            public void setRfLs(WhiteAllInOneClsElement et, List<WhiteAllInOneClsNormalColRef> ls)
            { throw new UnsupportedOperationException(); }
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
     * WhiteAllInOneClsNormalColRef whiteAllInOneClsNormalColRef = new WhiteAllInOneClsNormalColRef();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteAllInOneClsNormalColRef.setFoo...(value);
     * whiteAllInOneClsNormalColRef.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsNormalColRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsNormalColRef.set...;</span>
     * whiteAllInOneClsNormalColRefBhv.<span style="color: #FD4747">insert</span>(whiteAllInOneClsNormalColRef);
     * ... = whiteAllInOneClsNormalColRef.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteAllInOneClsNormalColRef The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteAllInOneClsNormalColRef whiteAllInOneClsNormalColRef) {
        doInsert(whiteAllInOneClsNormalColRef, null);
    }

    protected void doInsert(WhiteAllInOneClsNormalColRef whiteAllInOneClsNormalColRef, InsertOption<WhiteAllInOneClsNormalColRefCB> op) {
        assertObjectNotNull("whiteAllInOneClsNormalColRef", whiteAllInOneClsNormalColRef);
        prepareInsertOption(op);
        delegateInsert(whiteAllInOneClsNormalColRef, op);
    }

    protected void prepareInsertOption(InsertOption<WhiteAllInOneClsNormalColRefCB> op) {
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
     * WhiteAllInOneClsNormalColRef whiteAllInOneClsNormalColRef = new WhiteAllInOneClsNormalColRef();
     * whiteAllInOneClsNormalColRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteAllInOneClsNormalColRef.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsNormalColRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsNormalColRef.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteAllInOneClsNormalColRef.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteAllInOneClsNormalColRefBhv.<span style="color: #FD4747">update</span>(whiteAllInOneClsNormalColRef);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteAllInOneClsNormalColRef The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final WhiteAllInOneClsNormalColRef whiteAllInOneClsNormalColRef) {
        doUpdate(whiteAllInOneClsNormalColRef, null);
    }

    protected void doUpdate(WhiteAllInOneClsNormalColRef whiteAllInOneClsNormalColRef, final UpdateOption<WhiteAllInOneClsNormalColRefCB> op) {
        assertObjectNotNull("whiteAllInOneClsNormalColRef", whiteAllInOneClsNormalColRef);
        prepareUpdateOption(op);
        helpUpdateInternally(whiteAllInOneClsNormalColRef, new InternalUpdateCallback<WhiteAllInOneClsNormalColRef>() {
            public int callbackDelegateUpdate(WhiteAllInOneClsNormalColRef et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhiteAllInOneClsNormalColRefCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected WhiteAllInOneClsNormalColRefCB createCBForVaryingUpdate() {
        WhiteAllInOneClsNormalColRefCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected WhiteAllInOneClsNormalColRefCB createCBForSpecifiedUpdate() {
        WhiteAllInOneClsNormalColRefCB cb = newMyConditionBean();
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
     * @param whiteAllInOneClsNormalColRef The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteAllInOneClsNormalColRef whiteAllInOneClsNormalColRef) {
        doInesrtOrUpdate(whiteAllInOneClsNormalColRef, null, null);
    }

    protected void doInesrtOrUpdate(WhiteAllInOneClsNormalColRef whiteAllInOneClsNormalColRef, final InsertOption<WhiteAllInOneClsNormalColRefCB> iop, final UpdateOption<WhiteAllInOneClsNormalColRefCB> uop) {
        helpInsertOrUpdateInternally(whiteAllInOneClsNormalColRef, new InternalInsertOrUpdateCallback<WhiteAllInOneClsNormalColRef, WhiteAllInOneClsNormalColRefCB>() {
            public void callbackInsert(WhiteAllInOneClsNormalColRef et) { doInsert(et, iop); }
            public void callbackUpdate(WhiteAllInOneClsNormalColRef et) { doUpdate(et, uop); }
            public WhiteAllInOneClsNormalColRefCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(WhiteAllInOneClsNormalColRefCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<WhiteAllInOneClsNormalColRefCB>();
            uop = uop != null ? uop : new UpdateOption<WhiteAllInOneClsNormalColRefCB>();
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
     * WhiteAllInOneClsNormalColRef whiteAllInOneClsNormalColRef = new WhiteAllInOneClsNormalColRef();
     * whiteAllInOneClsNormalColRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteAllInOneClsNormalColRef.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteAllInOneClsNormalColRefBhv.<span style="color: #FD4747">delete</span>(whiteAllInOneClsNormalColRef);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteAllInOneClsNormalColRef The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteAllInOneClsNormalColRef whiteAllInOneClsNormalColRef) {
        doDelete(whiteAllInOneClsNormalColRef, null);
    }

    protected void doDelete(WhiteAllInOneClsNormalColRef whiteAllInOneClsNormalColRef, final DeleteOption<WhiteAllInOneClsNormalColRefCB> op) {
        assertObjectNotNull("whiteAllInOneClsNormalColRef", whiteAllInOneClsNormalColRef);
        prepareDeleteOption(op);
        helpDeleteInternally(whiteAllInOneClsNormalColRef, new InternalDeleteCallback<WhiteAllInOneClsNormalColRef>() {
            public int callbackDelegateDelete(WhiteAllInOneClsNormalColRef et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhiteAllInOneClsNormalColRefCB> op) {
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
     *     WhiteAllInOneClsNormalColRef whiteAllInOneClsNormalColRef = new WhiteAllInOneClsNormalColRef();
     *     whiteAllInOneClsNormalColRef.setFooName("foo");
     *     if (...) {
     *         whiteAllInOneClsNormalColRef.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteAllInOneClsNormalColRefList.add(whiteAllInOneClsNormalColRef);
     * }
     * whiteAllInOneClsNormalColRefBhv.<span style="color: #FD4747">batchInsert</span>(whiteAllInOneClsNormalColRefList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteAllInOneClsNormalColRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteAllInOneClsNormalColRef> whiteAllInOneClsNormalColRefList) {
        InsertOption<WhiteAllInOneClsNormalColRefCB> op = createInsertUpdateOption();
        return doBatchInsert(whiteAllInOneClsNormalColRefList, op);
    }

    protected int[] doBatchInsert(List<WhiteAllInOneClsNormalColRef> whiteAllInOneClsNormalColRefList, InsertOption<WhiteAllInOneClsNormalColRefCB> op) {
        assertObjectNotNull("whiteAllInOneClsNormalColRefList", whiteAllInOneClsNormalColRefList);
        prepareBatchInsertOption(whiteAllInOneClsNormalColRefList, op);
        return delegateBatchInsert(whiteAllInOneClsNormalColRefList, op);
    }

    protected void prepareBatchInsertOption(List<WhiteAllInOneClsNormalColRef> whiteAllInOneClsNormalColRefList, InsertOption<WhiteAllInOneClsNormalColRefCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(whiteAllInOneClsNormalColRefList);
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
     *     WhiteAllInOneClsNormalColRef whiteAllInOneClsNormalColRef = new WhiteAllInOneClsNormalColRef();
     *     whiteAllInOneClsNormalColRef.setFooName("foo");
     *     if (...) {
     *         whiteAllInOneClsNormalColRef.setFooPrice(123);
     *     } else {
     *         whiteAllInOneClsNormalColRef.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteAllInOneClsNormalColRef.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteAllInOneClsNormalColRefList.add(whiteAllInOneClsNormalColRef);
     * }
     * whiteAllInOneClsNormalColRefBhv.<span style="color: #FD4747">batchUpdate</span>(whiteAllInOneClsNormalColRefList);
     * </pre>
     * @param whiteAllInOneClsNormalColRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteAllInOneClsNormalColRef> whiteAllInOneClsNormalColRefList) {
        UpdateOption<WhiteAllInOneClsNormalColRefCB> op = createPlainUpdateOption();
        return doBatchUpdate(whiteAllInOneClsNormalColRefList, op);
    }

    protected int[] doBatchUpdate(List<WhiteAllInOneClsNormalColRef> whiteAllInOneClsNormalColRefList, UpdateOption<WhiteAllInOneClsNormalColRefCB> op) {
        assertObjectNotNull("whiteAllInOneClsNormalColRefList", whiteAllInOneClsNormalColRefList);
        prepareBatchUpdateOption(whiteAllInOneClsNormalColRefList, op);
        return delegateBatchUpdate(whiteAllInOneClsNormalColRefList, op);
    }

    protected void prepareBatchUpdateOption(List<WhiteAllInOneClsNormalColRef> whiteAllInOneClsNormalColRefList, UpdateOption<WhiteAllInOneClsNormalColRefCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(whiteAllInOneClsNormalColRefList);
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
     * whiteAllInOneClsNormalColRefBhv.<span style="color: #FD4747">batchUpdate</span>(whiteAllInOneClsNormalColRefList, new SpecifyQuery<WhiteAllInOneClsNormalColRefCB>() {
     *     public void specify(WhiteAllInOneClsNormalColRefCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteAllInOneClsNormalColRefBhv.<span style="color: #FD4747">batchUpdate</span>(whiteAllInOneClsNormalColRefList, new SpecifyQuery<WhiteAllInOneClsNormalColRefCB>() {
     *     public void specify(WhiteAllInOneClsNormalColRefCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteAllInOneClsNormalColRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteAllInOneClsNormalColRef> whiteAllInOneClsNormalColRefList, SpecifyQuery<WhiteAllInOneClsNormalColRefCB> updateColumnSpec) {
        return doBatchUpdate(whiteAllInOneClsNormalColRefList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteAllInOneClsNormalColRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteAllInOneClsNormalColRef> whiteAllInOneClsNormalColRefList) {
        return doBatchDelete(whiteAllInOneClsNormalColRefList, null);
    }

    protected int[] doBatchDelete(List<WhiteAllInOneClsNormalColRef> whiteAllInOneClsNormalColRefList, DeleteOption<WhiteAllInOneClsNormalColRefCB> op) {
        assertObjectNotNull("whiteAllInOneClsNormalColRefList", whiteAllInOneClsNormalColRefList);
        prepareDeleteOption(op);
        return delegateBatchDelete(whiteAllInOneClsNormalColRefList, op);
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
     * whiteAllInOneClsNormalColRefBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteAllInOneClsNormalColRef, WhiteAllInOneClsNormalColRefCB&gt;() {
     *     public ConditionBean setup(whiteAllInOneClsNormalColRef entity, WhiteAllInOneClsNormalColRefCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteAllInOneClsNormalColRef, WhiteAllInOneClsNormalColRefCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteAllInOneClsNormalColRef, WhiteAllInOneClsNormalColRefCB> sp, InsertOption<WhiteAllInOneClsNormalColRefCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        WhiteAllInOneClsNormalColRef e = new WhiteAllInOneClsNormalColRef();
        WhiteAllInOneClsNormalColRefCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected WhiteAllInOneClsNormalColRefCB createCBForQueryInsert() {
        WhiteAllInOneClsNormalColRefCB cb = newMyConditionBean();
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
     * WhiteAllInOneClsNormalColRef whiteAllInOneClsNormalColRef = new WhiteAllInOneClsNormalColRef();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsNormalColRef.setPK...(value);</span>
     * whiteAllInOneClsNormalColRef.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsNormalColRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsNormalColRef.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsNormalColRef.setVersionNo(value);</span>
     * WhiteAllInOneClsNormalColRefCB cb = new WhiteAllInOneClsNormalColRefCB();
     * cb.query().setFoo...(value);
     * whiteAllInOneClsNormalColRefBhv.<span style="color: #FD4747">queryUpdate</span>(whiteAllInOneClsNormalColRef, cb);
     * </pre>
     * @param whiteAllInOneClsNormalColRef The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteAllInOneClsNormalColRef. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteAllInOneClsNormalColRef whiteAllInOneClsNormalColRef, WhiteAllInOneClsNormalColRefCB cb) {
        return doQueryUpdate(whiteAllInOneClsNormalColRef, cb, null);
    }

    protected int doQueryUpdate(WhiteAllInOneClsNormalColRef whiteAllInOneClsNormalColRef, WhiteAllInOneClsNormalColRefCB cb, UpdateOption<WhiteAllInOneClsNormalColRefCB> op) {
        assertObjectNotNull("whiteAllInOneClsNormalColRef", whiteAllInOneClsNormalColRef); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(whiteAllInOneClsNormalColRef, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (WhiteAllInOneClsNormalColRefCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (WhiteAllInOneClsNormalColRefCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteAllInOneClsNormalColRefCB cb = new WhiteAllInOneClsNormalColRefCB();
     * cb.query().setFoo...(value);
     * whiteAllInOneClsNormalColRefBhv.<span style="color: #FD4747">queryDelete</span>(whiteAllInOneClsNormalColRef, cb);
     * </pre>
     * @param cb The condition-bean of WhiteAllInOneClsNormalColRef. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteAllInOneClsNormalColRefCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteAllInOneClsNormalColRefCB cb, DeleteOption<WhiteAllInOneClsNormalColRefCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((WhiteAllInOneClsNormalColRefCB)cb); }
        else { return varyingQueryDelete((WhiteAllInOneClsNormalColRefCB)cb, downcast(op)); }
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
     * WhiteAllInOneClsNormalColRef whiteAllInOneClsNormalColRef = new WhiteAllInOneClsNormalColRef();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteAllInOneClsNormalColRef.setFoo...(value);
     * whiteAllInOneClsNormalColRef.setBar...(value);
     * InsertOption<WhiteAllInOneClsNormalColRefCB> option = new InsertOption<WhiteAllInOneClsNormalColRefCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteAllInOneClsNormalColRefBhv.<span style="color: #FD4747">varyingInsert</span>(whiteAllInOneClsNormalColRef, option);
     * ... = whiteAllInOneClsNormalColRef.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteAllInOneClsNormalColRef The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteAllInOneClsNormalColRef whiteAllInOneClsNormalColRef, InsertOption<WhiteAllInOneClsNormalColRefCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteAllInOneClsNormalColRef, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteAllInOneClsNormalColRef whiteAllInOneClsNormalColRef = new WhiteAllInOneClsNormalColRef();
     * whiteAllInOneClsNormalColRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteAllInOneClsNormalColRef.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteAllInOneClsNormalColRef.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteAllInOneClsNormalColRefCB&gt; option = new UpdateOption&lt;WhiteAllInOneClsNormalColRefCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteAllInOneClsNormalColRefCB&gt;() {
     *         public void specify(WhiteAllInOneClsNormalColRefCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteAllInOneClsNormalColRefBhv.<span style="color: #FD4747">varyingUpdate</span>(whiteAllInOneClsNormalColRef, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteAllInOneClsNormalColRef The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteAllInOneClsNormalColRef whiteAllInOneClsNormalColRef, UpdateOption<WhiteAllInOneClsNormalColRefCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteAllInOneClsNormalColRef, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteAllInOneClsNormalColRef The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteAllInOneClsNormalColRef whiteAllInOneClsNormalColRef, InsertOption<WhiteAllInOneClsNormalColRefCB> insertOption, UpdateOption<WhiteAllInOneClsNormalColRefCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(whiteAllInOneClsNormalColRef, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteAllInOneClsNormalColRef The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteAllInOneClsNormalColRef whiteAllInOneClsNormalColRef, DeleteOption<WhiteAllInOneClsNormalColRefCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteAllInOneClsNormalColRef, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteAllInOneClsNormalColRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteAllInOneClsNormalColRef> whiteAllInOneClsNormalColRefList, InsertOption<WhiteAllInOneClsNormalColRefCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteAllInOneClsNormalColRefList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteAllInOneClsNormalColRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteAllInOneClsNormalColRef> whiteAllInOneClsNormalColRefList, UpdateOption<WhiteAllInOneClsNormalColRefCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteAllInOneClsNormalColRefList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteAllInOneClsNormalColRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteAllInOneClsNormalColRef> whiteAllInOneClsNormalColRefList, DeleteOption<WhiteAllInOneClsNormalColRefCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteAllInOneClsNormalColRefList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteAllInOneClsNormalColRef, WhiteAllInOneClsNormalColRefCB> setupper, InsertOption<WhiteAllInOneClsNormalColRefCB> option) {
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
     * WhiteAllInOneClsNormalColRef whiteAllInOneClsNormalColRef = new WhiteAllInOneClsNormalColRef();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsNormalColRef.setPK...(value);</span>
     * whiteAllInOneClsNormalColRef.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsNormalColRef.setVersionNo(value);</span>
     * WhiteAllInOneClsNormalColRefCB cb = new WhiteAllInOneClsNormalColRefCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteAllInOneClsNormalColRefCB&gt; option = new UpdateOption&lt;WhiteAllInOneClsNormalColRefCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteAllInOneClsNormalColRefCB&gt;() {
     *     public void specify(WhiteAllInOneClsNormalColRefCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteAllInOneClsNormalColRefBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(whiteAllInOneClsNormalColRef, cb, option);
     * </pre>
     * @param whiteAllInOneClsNormalColRef The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteAllInOneClsNormalColRef. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteAllInOneClsNormalColRef whiteAllInOneClsNormalColRef, WhiteAllInOneClsNormalColRefCB cb, UpdateOption<WhiteAllInOneClsNormalColRefCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteAllInOneClsNormalColRef, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteAllInOneClsNormalColRef. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteAllInOneClsNormalColRefCB cb, DeleteOption<WhiteAllInOneClsNormalColRefCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteAllInOneClsNormalColRefBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhiteAllInOneClsNormalColRefCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhiteAllInOneClsNormalColRefCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhiteAllInOneClsNormalColRef> void delegateSelectCursor(WhiteAllInOneClsNormalColRefCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends WhiteAllInOneClsNormalColRef> List<ENTITY> delegateSelectList(WhiteAllInOneClsNormalColRefCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhiteAllInOneClsNormalColRef et, InsertOption<WhiteAllInOneClsNormalColRefCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(WhiteAllInOneClsNormalColRef et, UpdateOption<WhiteAllInOneClsNormalColRefCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(WhiteAllInOneClsNormalColRef et, UpdateOption<WhiteAllInOneClsNormalColRefCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(WhiteAllInOneClsNormalColRef et, DeleteOption<WhiteAllInOneClsNormalColRefCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(WhiteAllInOneClsNormalColRef et, DeleteOption<WhiteAllInOneClsNormalColRefCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<WhiteAllInOneClsNormalColRef> ls, InsertOption<WhiteAllInOneClsNormalColRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhiteAllInOneClsNormalColRef> ls, UpdateOption<WhiteAllInOneClsNormalColRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhiteAllInOneClsNormalColRef> ls, UpdateOption<WhiteAllInOneClsNormalColRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhiteAllInOneClsNormalColRef> ls, DeleteOption<WhiteAllInOneClsNormalColRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhiteAllInOneClsNormalColRef> ls, DeleteOption<WhiteAllInOneClsNormalColRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhiteAllInOneClsNormalColRef et, WhiteAllInOneClsNormalColRefCB inCB, ConditionBean resCB, InsertOption<WhiteAllInOneClsNormalColRefCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhiteAllInOneClsNormalColRef et, WhiteAllInOneClsNormalColRefCB cb, UpdateOption<WhiteAllInOneClsNormalColRefCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(WhiteAllInOneClsNormalColRefCB cb, DeleteOption<WhiteAllInOneClsNormalColRefCB> op)
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
    protected WhiteAllInOneClsNormalColRef downcast(Entity et) {
        return helpEntityDowncastInternally(et, WhiteAllInOneClsNormalColRef.class);
    }

    protected WhiteAllInOneClsNormalColRefCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, WhiteAllInOneClsNormalColRefCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<WhiteAllInOneClsNormalColRef> downcast(List<? extends Entity> ls) {
        return (List<WhiteAllInOneClsNormalColRef>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteAllInOneClsNormalColRefCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<WhiteAllInOneClsNormalColRefCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteAllInOneClsNormalColRefCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<WhiteAllInOneClsNormalColRefCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteAllInOneClsNormalColRefCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<WhiteAllInOneClsNormalColRefCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteAllInOneClsNormalColRef, WhiteAllInOneClsNormalColRefCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<WhiteAllInOneClsNormalColRef, WhiteAllInOneClsNormalColRefCB>)sp;
    }
}
