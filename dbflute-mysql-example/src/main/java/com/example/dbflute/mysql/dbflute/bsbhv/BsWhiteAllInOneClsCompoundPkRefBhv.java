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
 * The behavior of WHITE_ALL_IN_ONE_CLS_COMPOUND_PK_REF as TABLE. <br />
 * <pre>
 * [primary key]
 *     FOO_CODE, BAR_CODE, QUX_CODE
 *
 * [column]
 *     FOO_CODE, BAR_CODE, QUX_CODE
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
public abstract class BsWhiteAllInOneClsCompoundPkRefBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_all_in_one_cls_compound_pk_ref"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return WhiteAllInOneClsCompoundPkRefDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteAllInOneClsCompoundPkRefDbm getMyDBMeta() { return WhiteAllInOneClsCompoundPkRefDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteAllInOneClsCompoundPkRef newMyEntity() { return new WhiteAllInOneClsCompoundPkRef(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteAllInOneClsCompoundPkRefCB newMyConditionBean() { return new WhiteAllInOneClsCompoundPkRefCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteAllInOneClsCompoundPkRefCB cb = new WhiteAllInOneClsCompoundPkRefCB();
     * cb.query().setFoo...(value);
     * int count = whiteAllInOneClsCompoundPkRefBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteAllInOneClsCompoundPkRef. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteAllInOneClsCompoundPkRefCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteAllInOneClsCompoundPkRefCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteAllInOneClsCompoundPkRefCB cb) { // called by selectPage(cb)
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
     * WhiteAllInOneClsCompoundPkRefCB cb = new WhiteAllInOneClsCompoundPkRefCB();
     * cb.query().setFoo...(value);
     * WhiteAllInOneClsCompoundPkRef whiteAllInOneClsCompoundPkRef = whiteAllInOneClsCompoundPkRefBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (whiteAllInOneClsCompoundPkRef != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = whiteAllInOneClsCompoundPkRef.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteAllInOneClsCompoundPkRef. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteAllInOneClsCompoundPkRef selectEntity(WhiteAllInOneClsCompoundPkRefCB cb) {
        return doSelectEntity(cb, WhiteAllInOneClsCompoundPkRef.class);
    }

    protected <ENTITY extends WhiteAllInOneClsCompoundPkRef> ENTITY doSelectEntity(WhiteAllInOneClsCompoundPkRefCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, WhiteAllInOneClsCompoundPkRefCB>() {
            public List<ENTITY> callbackSelectList(WhiteAllInOneClsCompoundPkRefCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    protected <ENTITY extends WhiteAllInOneClsCompoundPkRef> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteAllInOneClsCompoundPkRefCB cb, Class<ENTITY> tp) {
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
     * WhiteAllInOneClsCompoundPkRefCB cb = new WhiteAllInOneClsCompoundPkRefCB();
     * cb.query().setFoo...(value);
     * WhiteAllInOneClsCompoundPkRef whiteAllInOneClsCompoundPkRef = whiteAllInOneClsCompoundPkRefBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteAllInOneClsCompoundPkRef.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteAllInOneClsCompoundPkRef. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteAllInOneClsCompoundPkRef selectEntityWithDeletedCheck(WhiteAllInOneClsCompoundPkRefCB cb) {
        return doSelectEntityWithDeletedCheck(cb, WhiteAllInOneClsCompoundPkRef.class);
    }

    protected <ENTITY extends WhiteAllInOneClsCompoundPkRef> ENTITY doSelectEntityWithDeletedCheck(WhiteAllInOneClsCompoundPkRefCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteAllInOneClsCompoundPkRefCB>() {
            public List<ENTITY> callbackSelectList(WhiteAllInOneClsCompoundPkRefCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param fooCode : PK, NotNull, CHAR(3), FK to WHITE_ALL_IN_ONE_CLS_ELEMENT. (NotNull)
     * @param barCode : PK, NotNull, CHAR(3), FK to WHITE_ALL_IN_ONE_CLS_ELEMENT. (NotNull)
     * @param quxCode : PK, NotNull, CHAR(3). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteAllInOneClsCompoundPkRef selectByPKValue(String fooCode, String barCode, String quxCode) {
        return doSelectByPK(fooCode, barCode, quxCode, WhiteAllInOneClsCompoundPkRef.class);
    }

    protected <ENTITY extends WhiteAllInOneClsCompoundPkRef> ENTITY doSelectByPK(String fooCode, String barCode, String quxCode, Class<ENTITY> entityType) {
        return doSelectEntity(xprepareCBAsPK(fooCode, barCode, quxCode), entityType);
    }

    protected <ENTITY extends WhiteAllInOneClsCompoundPkRef> OptionalEntity<ENTITY> doSelectOptionalByPK(String fooCode, String barCode, String quxCode, Class<ENTITY> entityType) {
        return createOptionalEntity(doSelectByPK(fooCode, barCode, quxCode, entityType), fooCode, barCode, quxCode);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param fooCode : PK, NotNull, CHAR(3), FK to WHITE_ALL_IN_ONE_CLS_ELEMENT. (NotNull)
     * @param barCode : PK, NotNull, CHAR(3), FK to WHITE_ALL_IN_ONE_CLS_ELEMENT. (NotNull)
     * @param quxCode : PK, NotNull, CHAR(3). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteAllInOneClsCompoundPkRef selectByPKValueWithDeletedCheck(String fooCode, String barCode, String quxCode) {
        return doSelectByPKWithDeletedCheck(fooCode, barCode, quxCode, WhiteAllInOneClsCompoundPkRef.class);
    }

    protected <ENTITY extends WhiteAllInOneClsCompoundPkRef> ENTITY doSelectByPKWithDeletedCheck(String fooCode, String barCode, String quxCode, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(fooCode, barCode, quxCode), entityType);
    }

    protected WhiteAllInOneClsCompoundPkRefCB xprepareCBAsPK(String fooCode, String barCode, String quxCode) {
        assertObjectNotNull("fooCode", fooCode);assertObjectNotNull("barCode", barCode);assertObjectNotNull("quxCode", quxCode);
        WhiteAllInOneClsCompoundPkRefCB cb = newMyConditionBean(); cb.acceptPrimaryKey(fooCode, barCode, quxCode);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteAllInOneClsCompoundPkRefCB cb = new WhiteAllInOneClsCompoundPkRefCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteAllInOneClsCompoundPkRef&gt; whiteAllInOneClsCompoundPkRefList = whiteAllInOneClsCompoundPkRefBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteAllInOneClsCompoundPkRef whiteAllInOneClsCompoundPkRef : whiteAllInOneClsCompoundPkRefList) {
     *     ... = whiteAllInOneClsCompoundPkRef.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteAllInOneClsCompoundPkRef. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteAllInOneClsCompoundPkRef> selectList(WhiteAllInOneClsCompoundPkRefCB cb) {
        return doSelectList(cb, WhiteAllInOneClsCompoundPkRef.class);
    }

    protected <ENTITY extends WhiteAllInOneClsCompoundPkRef> ListResultBean<ENTITY> doSelectList(WhiteAllInOneClsCompoundPkRefCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, WhiteAllInOneClsCompoundPkRefCB>() {
            public List<ENTITY> callbackSelectList(WhiteAllInOneClsCompoundPkRefCB lcb, Class<ENTITY> ltp) { return delegateSelectList(lcb, ltp); } });
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
     * WhiteAllInOneClsCompoundPkRefCB cb = new WhiteAllInOneClsCompoundPkRefCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteAllInOneClsCompoundPkRef&gt; page = whiteAllInOneClsCompoundPkRefBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteAllInOneClsCompoundPkRef whiteAllInOneClsCompoundPkRef : page) {
     *     ... = whiteAllInOneClsCompoundPkRef.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteAllInOneClsCompoundPkRef. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteAllInOneClsCompoundPkRef> selectPage(WhiteAllInOneClsCompoundPkRefCB cb) {
        return doSelectPage(cb, WhiteAllInOneClsCompoundPkRef.class);
    }

    protected <ENTITY extends WhiteAllInOneClsCompoundPkRef> PagingResultBean<ENTITY> doSelectPage(WhiteAllInOneClsCompoundPkRefCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, WhiteAllInOneClsCompoundPkRefCB>() {
            public int callbackSelectCount(WhiteAllInOneClsCompoundPkRefCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteAllInOneClsCompoundPkRefCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * WhiteAllInOneClsCompoundPkRefCB cb = new WhiteAllInOneClsCompoundPkRefCB();
     * cb.query().setFoo...(value);
     * whiteAllInOneClsCompoundPkRefBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteAllInOneClsCompoundPkRef&gt;() {
     *     public void handle(WhiteAllInOneClsCompoundPkRef entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteAllInOneClsCompoundPkRef. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteAllInOneClsCompoundPkRef. (NotNull)
     */
    public void selectCursor(WhiteAllInOneClsCompoundPkRefCB cb, EntityRowHandler<WhiteAllInOneClsCompoundPkRef> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, WhiteAllInOneClsCompoundPkRef.class);
    }

    protected <ENTITY extends WhiteAllInOneClsCompoundPkRef> void doSelectCursor(WhiteAllInOneClsCompoundPkRefCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, WhiteAllInOneClsCompoundPkRefCB>() {
            public void callbackSelectCursor(WhiteAllInOneClsCompoundPkRefCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(WhiteAllInOneClsCompoundPkRefCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteAllInOneClsCompoundPkRefBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteAllInOneClsCompoundPkRefCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<WhiteAllInOneClsCompoundPkRefCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends WhiteAllInOneClsCompoundPkRefCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends WhiteAllInOneClsCompoundPkRefCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
     * @param whiteAllInOneClsCompoundPkRefList The list of whiteAllInOneClsCompoundPkRef. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteAllInOneClsElement> pulloutWhiteAllInOneClsElementAsFoo(List<WhiteAllInOneClsCompoundPkRef> whiteAllInOneClsCompoundPkRefList) {
        return helpPulloutInternally(whiteAllInOneClsCompoundPkRefList, new InternalPulloutCallback<WhiteAllInOneClsCompoundPkRef, WhiteAllInOneClsElement>() {
            public WhiteAllInOneClsElement getFr(WhiteAllInOneClsCompoundPkRef et)
            { return et.getWhiteAllInOneClsElementAsFoo(); }
            public boolean hasRf() { return false; }
            public void setRfLs(WhiteAllInOneClsElement et, List<WhiteAllInOneClsCompoundPkRef> ls)
            { throw new UnsupportedOperationException(); }
        });
    }
    /**
     * Pull out the list of foreign table 'WhiteAllInOneClsElement'.
     * @param whiteAllInOneClsCompoundPkRefList The list of whiteAllInOneClsCompoundPkRef. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteAllInOneClsElement> pulloutWhiteAllInOneClsElementAsBar(List<WhiteAllInOneClsCompoundPkRef> whiteAllInOneClsCompoundPkRefList) {
        return helpPulloutInternally(whiteAllInOneClsCompoundPkRefList, new InternalPulloutCallback<WhiteAllInOneClsCompoundPkRef, WhiteAllInOneClsElement>() {
            public WhiteAllInOneClsElement getFr(WhiteAllInOneClsCompoundPkRef et)
            { return et.getWhiteAllInOneClsElementAsBar(); }
            public boolean hasRf() { return false; }
            public void setRfLs(WhiteAllInOneClsElement et, List<WhiteAllInOneClsCompoundPkRef> ls)
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
     * WhiteAllInOneClsCompoundPkRef whiteAllInOneClsCompoundPkRef = new WhiteAllInOneClsCompoundPkRef();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteAllInOneClsCompoundPkRef.setFoo...(value);
     * whiteAllInOneClsCompoundPkRef.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsCompoundPkRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsCompoundPkRef.set...;</span>
     * whiteAllInOneClsCompoundPkRefBhv.<span style="color: #DD4747">insert</span>(whiteAllInOneClsCompoundPkRef);
     * ... = whiteAllInOneClsCompoundPkRef.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteAllInOneClsCompoundPkRef The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteAllInOneClsCompoundPkRef whiteAllInOneClsCompoundPkRef) {
        doInsert(whiteAllInOneClsCompoundPkRef, null);
    }

    protected void doInsert(WhiteAllInOneClsCompoundPkRef whiteAllInOneClsCompoundPkRef, InsertOption<WhiteAllInOneClsCompoundPkRefCB> op) {
        assertObjectNotNull("whiteAllInOneClsCompoundPkRef", whiteAllInOneClsCompoundPkRef);
        prepareInsertOption(op);
        delegateInsert(whiteAllInOneClsCompoundPkRef, op);
    }

    protected void prepareInsertOption(InsertOption<WhiteAllInOneClsCompoundPkRefCB> op) {
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
     * WhiteAllInOneClsCompoundPkRef whiteAllInOneClsCompoundPkRef = new WhiteAllInOneClsCompoundPkRef();
     * whiteAllInOneClsCompoundPkRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteAllInOneClsCompoundPkRef.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsCompoundPkRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsCompoundPkRef.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteAllInOneClsCompoundPkRef.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteAllInOneClsCompoundPkRefBhv.<span style="color: #DD4747">update</span>(whiteAllInOneClsCompoundPkRef);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteAllInOneClsCompoundPkRef The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final WhiteAllInOneClsCompoundPkRef whiteAllInOneClsCompoundPkRef) {
        doUpdate(whiteAllInOneClsCompoundPkRef, null);
    }

    protected void doUpdate(WhiteAllInOneClsCompoundPkRef whiteAllInOneClsCompoundPkRef, final UpdateOption<WhiteAllInOneClsCompoundPkRefCB> op) {
        assertObjectNotNull("whiteAllInOneClsCompoundPkRef", whiteAllInOneClsCompoundPkRef);
        prepareUpdateOption(op);
        helpUpdateInternally(whiteAllInOneClsCompoundPkRef, new InternalUpdateCallback<WhiteAllInOneClsCompoundPkRef>() {
            public int callbackDelegateUpdate(WhiteAllInOneClsCompoundPkRef et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhiteAllInOneClsCompoundPkRefCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected WhiteAllInOneClsCompoundPkRefCB createCBForVaryingUpdate() {
        WhiteAllInOneClsCompoundPkRefCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected WhiteAllInOneClsCompoundPkRefCB createCBForSpecifiedUpdate() {
        WhiteAllInOneClsCompoundPkRefCB cb = newMyConditionBean();
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
     * @param whiteAllInOneClsCompoundPkRef The entity of insert or update target. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteAllInOneClsCompoundPkRef whiteAllInOneClsCompoundPkRef) {
        doInesrtOrUpdate(whiteAllInOneClsCompoundPkRef, null, null);
    }

    protected void doInesrtOrUpdate(WhiteAllInOneClsCompoundPkRef whiteAllInOneClsCompoundPkRef, final InsertOption<WhiteAllInOneClsCompoundPkRefCB> iop, final UpdateOption<WhiteAllInOneClsCompoundPkRefCB> uop) {
        helpInsertOrUpdateInternally(whiteAllInOneClsCompoundPkRef, new InternalInsertOrUpdateCallback<WhiteAllInOneClsCompoundPkRef, WhiteAllInOneClsCompoundPkRefCB>() {
            public void callbackInsert(WhiteAllInOneClsCompoundPkRef et) { doInsert(et, iop); }
            public void callbackUpdate(WhiteAllInOneClsCompoundPkRef et) { doUpdate(et, uop); }
            public WhiteAllInOneClsCompoundPkRefCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(WhiteAllInOneClsCompoundPkRefCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<WhiteAllInOneClsCompoundPkRefCB>();
            uop = uop != null ? uop : new UpdateOption<WhiteAllInOneClsCompoundPkRefCB>();
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
     * WhiteAllInOneClsCompoundPkRef whiteAllInOneClsCompoundPkRef = new WhiteAllInOneClsCompoundPkRef();
     * whiteAllInOneClsCompoundPkRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteAllInOneClsCompoundPkRef.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteAllInOneClsCompoundPkRefBhv.<span style="color: #DD4747">delete</span>(whiteAllInOneClsCompoundPkRef);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteAllInOneClsCompoundPkRef The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteAllInOneClsCompoundPkRef whiteAllInOneClsCompoundPkRef) {
        doDelete(whiteAllInOneClsCompoundPkRef, null);
    }

    protected void doDelete(WhiteAllInOneClsCompoundPkRef whiteAllInOneClsCompoundPkRef, final DeleteOption<WhiteAllInOneClsCompoundPkRefCB> op) {
        assertObjectNotNull("whiteAllInOneClsCompoundPkRef", whiteAllInOneClsCompoundPkRef);
        prepareDeleteOption(op);
        helpDeleteInternally(whiteAllInOneClsCompoundPkRef, new InternalDeleteCallback<WhiteAllInOneClsCompoundPkRef>() {
            public int callbackDelegateDelete(WhiteAllInOneClsCompoundPkRef et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhiteAllInOneClsCompoundPkRefCB> op) {
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
     *     WhiteAllInOneClsCompoundPkRef whiteAllInOneClsCompoundPkRef = new WhiteAllInOneClsCompoundPkRef();
     *     whiteAllInOneClsCompoundPkRef.setFooName("foo");
     *     if (...) {
     *         whiteAllInOneClsCompoundPkRef.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteAllInOneClsCompoundPkRefList.add(whiteAllInOneClsCompoundPkRef);
     * }
     * whiteAllInOneClsCompoundPkRefBhv.<span style="color: #DD4747">batchInsert</span>(whiteAllInOneClsCompoundPkRefList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteAllInOneClsCompoundPkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteAllInOneClsCompoundPkRef> whiteAllInOneClsCompoundPkRefList) {
        InsertOption<WhiteAllInOneClsCompoundPkRefCB> op = createInsertUpdateOption();
        return doBatchInsert(whiteAllInOneClsCompoundPkRefList, op);
    }

    protected int[] doBatchInsert(List<WhiteAllInOneClsCompoundPkRef> whiteAllInOneClsCompoundPkRefList, InsertOption<WhiteAllInOneClsCompoundPkRefCB> op) {
        assertObjectNotNull("whiteAllInOneClsCompoundPkRefList", whiteAllInOneClsCompoundPkRefList);
        prepareBatchInsertOption(whiteAllInOneClsCompoundPkRefList, op);
        return delegateBatchInsert(whiteAllInOneClsCompoundPkRefList, op);
    }

    protected void prepareBatchInsertOption(List<WhiteAllInOneClsCompoundPkRef> whiteAllInOneClsCompoundPkRefList, InsertOption<WhiteAllInOneClsCompoundPkRefCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(whiteAllInOneClsCompoundPkRefList);
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
     *     WhiteAllInOneClsCompoundPkRef whiteAllInOneClsCompoundPkRef = new WhiteAllInOneClsCompoundPkRef();
     *     whiteAllInOneClsCompoundPkRef.setFooName("foo");
     *     if (...) {
     *         whiteAllInOneClsCompoundPkRef.setFooPrice(123);
     *     } else {
     *         whiteAllInOneClsCompoundPkRef.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteAllInOneClsCompoundPkRef.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteAllInOneClsCompoundPkRefList.add(whiteAllInOneClsCompoundPkRef);
     * }
     * whiteAllInOneClsCompoundPkRefBhv.<span style="color: #DD4747">batchUpdate</span>(whiteAllInOneClsCompoundPkRefList);
     * </pre>
     * @param whiteAllInOneClsCompoundPkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteAllInOneClsCompoundPkRef> whiteAllInOneClsCompoundPkRefList) {
        UpdateOption<WhiteAllInOneClsCompoundPkRefCB> op = createPlainUpdateOption();
        return doBatchUpdate(whiteAllInOneClsCompoundPkRefList, op);
    }

    protected int[] doBatchUpdate(List<WhiteAllInOneClsCompoundPkRef> whiteAllInOneClsCompoundPkRefList, UpdateOption<WhiteAllInOneClsCompoundPkRefCB> op) {
        assertObjectNotNull("whiteAllInOneClsCompoundPkRefList", whiteAllInOneClsCompoundPkRefList);
        prepareBatchUpdateOption(whiteAllInOneClsCompoundPkRefList, op);
        return delegateBatchUpdate(whiteAllInOneClsCompoundPkRefList, op);
    }

    protected void prepareBatchUpdateOption(List<WhiteAllInOneClsCompoundPkRef> whiteAllInOneClsCompoundPkRefList, UpdateOption<WhiteAllInOneClsCompoundPkRefCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(whiteAllInOneClsCompoundPkRefList);
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
     * whiteAllInOneClsCompoundPkRefBhv.<span style="color: #DD4747">batchUpdate</span>(whiteAllInOneClsCompoundPkRefList, new SpecifyQuery<WhiteAllInOneClsCompoundPkRefCB>() {
     *     public void specify(WhiteAllInOneClsCompoundPkRefCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteAllInOneClsCompoundPkRefBhv.<span style="color: #DD4747">batchUpdate</span>(whiteAllInOneClsCompoundPkRefList, new SpecifyQuery<WhiteAllInOneClsCompoundPkRefCB>() {
     *     public void specify(WhiteAllInOneClsCompoundPkRefCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteAllInOneClsCompoundPkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteAllInOneClsCompoundPkRef> whiteAllInOneClsCompoundPkRefList, SpecifyQuery<WhiteAllInOneClsCompoundPkRefCB> updateColumnSpec) {
        return doBatchUpdate(whiteAllInOneClsCompoundPkRefList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteAllInOneClsCompoundPkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteAllInOneClsCompoundPkRef> whiteAllInOneClsCompoundPkRefList) {
        return doBatchDelete(whiteAllInOneClsCompoundPkRefList, null);
    }

    protected int[] doBatchDelete(List<WhiteAllInOneClsCompoundPkRef> whiteAllInOneClsCompoundPkRefList, DeleteOption<WhiteAllInOneClsCompoundPkRefCB> op) {
        assertObjectNotNull("whiteAllInOneClsCompoundPkRefList", whiteAllInOneClsCompoundPkRefList);
        prepareDeleteOption(op);
        return delegateBatchDelete(whiteAllInOneClsCompoundPkRefList, op);
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
     * whiteAllInOneClsCompoundPkRefBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteAllInOneClsCompoundPkRef, WhiteAllInOneClsCompoundPkRefCB&gt;() {
     *     public ConditionBean setup(whiteAllInOneClsCompoundPkRef entity, WhiteAllInOneClsCompoundPkRefCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteAllInOneClsCompoundPkRef, WhiteAllInOneClsCompoundPkRefCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteAllInOneClsCompoundPkRef, WhiteAllInOneClsCompoundPkRefCB> sp, InsertOption<WhiteAllInOneClsCompoundPkRefCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        WhiteAllInOneClsCompoundPkRef e = new WhiteAllInOneClsCompoundPkRef();
        WhiteAllInOneClsCompoundPkRefCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected WhiteAllInOneClsCompoundPkRefCB createCBForQueryInsert() {
        WhiteAllInOneClsCompoundPkRefCB cb = newMyConditionBean();
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
     * WhiteAllInOneClsCompoundPkRef whiteAllInOneClsCompoundPkRef = new WhiteAllInOneClsCompoundPkRef();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsCompoundPkRef.setPK...(value);</span>
     * whiteAllInOneClsCompoundPkRef.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsCompoundPkRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsCompoundPkRef.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsCompoundPkRef.setVersionNo(value);</span>
     * WhiteAllInOneClsCompoundPkRefCB cb = new WhiteAllInOneClsCompoundPkRefCB();
     * cb.query().setFoo...(value);
     * whiteAllInOneClsCompoundPkRefBhv.<span style="color: #DD4747">queryUpdate</span>(whiteAllInOneClsCompoundPkRef, cb);
     * </pre>
     * @param whiteAllInOneClsCompoundPkRef The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteAllInOneClsCompoundPkRef. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteAllInOneClsCompoundPkRef whiteAllInOneClsCompoundPkRef, WhiteAllInOneClsCompoundPkRefCB cb) {
        return doQueryUpdate(whiteAllInOneClsCompoundPkRef, cb, null);
    }

    protected int doQueryUpdate(WhiteAllInOneClsCompoundPkRef whiteAllInOneClsCompoundPkRef, WhiteAllInOneClsCompoundPkRefCB cb, UpdateOption<WhiteAllInOneClsCompoundPkRefCB> op) {
        assertObjectNotNull("whiteAllInOneClsCompoundPkRef", whiteAllInOneClsCompoundPkRef); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(whiteAllInOneClsCompoundPkRef, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (WhiteAllInOneClsCompoundPkRefCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (WhiteAllInOneClsCompoundPkRefCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteAllInOneClsCompoundPkRefCB cb = new WhiteAllInOneClsCompoundPkRefCB();
     * cb.query().setFoo...(value);
     * whiteAllInOneClsCompoundPkRefBhv.<span style="color: #DD4747">queryDelete</span>(whiteAllInOneClsCompoundPkRef, cb);
     * </pre>
     * @param cb The condition-bean of WhiteAllInOneClsCompoundPkRef. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteAllInOneClsCompoundPkRefCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteAllInOneClsCompoundPkRefCB cb, DeleteOption<WhiteAllInOneClsCompoundPkRefCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((WhiteAllInOneClsCompoundPkRefCB)cb); }
        else { return varyingQueryDelete((WhiteAllInOneClsCompoundPkRefCB)cb, downcast(op)); }
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
     * WhiteAllInOneClsCompoundPkRef whiteAllInOneClsCompoundPkRef = new WhiteAllInOneClsCompoundPkRef();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteAllInOneClsCompoundPkRef.setFoo...(value);
     * whiteAllInOneClsCompoundPkRef.setBar...(value);
     * InsertOption<WhiteAllInOneClsCompoundPkRefCB> option = new InsertOption<WhiteAllInOneClsCompoundPkRefCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteAllInOneClsCompoundPkRefBhv.<span style="color: #DD4747">varyingInsert</span>(whiteAllInOneClsCompoundPkRef, option);
     * ... = whiteAllInOneClsCompoundPkRef.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteAllInOneClsCompoundPkRef The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteAllInOneClsCompoundPkRef whiteAllInOneClsCompoundPkRef, InsertOption<WhiteAllInOneClsCompoundPkRefCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteAllInOneClsCompoundPkRef, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteAllInOneClsCompoundPkRef whiteAllInOneClsCompoundPkRef = new WhiteAllInOneClsCompoundPkRef();
     * whiteAllInOneClsCompoundPkRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteAllInOneClsCompoundPkRef.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteAllInOneClsCompoundPkRef.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteAllInOneClsCompoundPkRefCB&gt; option = new UpdateOption&lt;WhiteAllInOneClsCompoundPkRefCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteAllInOneClsCompoundPkRefCB&gt;() {
     *         public void specify(WhiteAllInOneClsCompoundPkRefCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteAllInOneClsCompoundPkRefBhv.<span style="color: #DD4747">varyingUpdate</span>(whiteAllInOneClsCompoundPkRef, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteAllInOneClsCompoundPkRef The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteAllInOneClsCompoundPkRef whiteAllInOneClsCompoundPkRef, UpdateOption<WhiteAllInOneClsCompoundPkRefCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteAllInOneClsCompoundPkRef, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteAllInOneClsCompoundPkRef The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteAllInOneClsCompoundPkRef whiteAllInOneClsCompoundPkRef, InsertOption<WhiteAllInOneClsCompoundPkRefCB> insertOption, UpdateOption<WhiteAllInOneClsCompoundPkRefCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(whiteAllInOneClsCompoundPkRef, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteAllInOneClsCompoundPkRef The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteAllInOneClsCompoundPkRef whiteAllInOneClsCompoundPkRef, DeleteOption<WhiteAllInOneClsCompoundPkRefCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteAllInOneClsCompoundPkRef, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteAllInOneClsCompoundPkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteAllInOneClsCompoundPkRef> whiteAllInOneClsCompoundPkRefList, InsertOption<WhiteAllInOneClsCompoundPkRefCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteAllInOneClsCompoundPkRefList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteAllInOneClsCompoundPkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteAllInOneClsCompoundPkRef> whiteAllInOneClsCompoundPkRefList, UpdateOption<WhiteAllInOneClsCompoundPkRefCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteAllInOneClsCompoundPkRefList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteAllInOneClsCompoundPkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteAllInOneClsCompoundPkRef> whiteAllInOneClsCompoundPkRefList, DeleteOption<WhiteAllInOneClsCompoundPkRefCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteAllInOneClsCompoundPkRefList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteAllInOneClsCompoundPkRef, WhiteAllInOneClsCompoundPkRefCB> setupper, InsertOption<WhiteAllInOneClsCompoundPkRefCB> option) {
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
     * WhiteAllInOneClsCompoundPkRef whiteAllInOneClsCompoundPkRef = new WhiteAllInOneClsCompoundPkRef();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsCompoundPkRef.setPK...(value);</span>
     * whiteAllInOneClsCompoundPkRef.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsCompoundPkRef.setVersionNo(value);</span>
     * WhiteAllInOneClsCompoundPkRefCB cb = new WhiteAllInOneClsCompoundPkRefCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteAllInOneClsCompoundPkRefCB&gt; option = new UpdateOption&lt;WhiteAllInOneClsCompoundPkRefCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteAllInOneClsCompoundPkRefCB&gt;() {
     *     public void specify(WhiteAllInOneClsCompoundPkRefCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteAllInOneClsCompoundPkRefBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteAllInOneClsCompoundPkRef, cb, option);
     * </pre>
     * @param whiteAllInOneClsCompoundPkRef The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteAllInOneClsCompoundPkRef. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteAllInOneClsCompoundPkRef whiteAllInOneClsCompoundPkRef, WhiteAllInOneClsCompoundPkRefCB cb, UpdateOption<WhiteAllInOneClsCompoundPkRefCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteAllInOneClsCompoundPkRef, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteAllInOneClsCompoundPkRef. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteAllInOneClsCompoundPkRefCB cb, DeleteOption<WhiteAllInOneClsCompoundPkRefCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteAllInOneClsCompoundPkRefBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhiteAllInOneClsCompoundPkRefCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhiteAllInOneClsCompoundPkRefCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhiteAllInOneClsCompoundPkRef> void delegateSelectCursor(WhiteAllInOneClsCompoundPkRefCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends WhiteAllInOneClsCompoundPkRef> List<ENTITY> delegateSelectList(WhiteAllInOneClsCompoundPkRefCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhiteAllInOneClsCompoundPkRef et, InsertOption<WhiteAllInOneClsCompoundPkRefCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(WhiteAllInOneClsCompoundPkRef et, UpdateOption<WhiteAllInOneClsCompoundPkRefCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(WhiteAllInOneClsCompoundPkRef et, UpdateOption<WhiteAllInOneClsCompoundPkRefCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(WhiteAllInOneClsCompoundPkRef et, DeleteOption<WhiteAllInOneClsCompoundPkRefCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(WhiteAllInOneClsCompoundPkRef et, DeleteOption<WhiteAllInOneClsCompoundPkRefCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<WhiteAllInOneClsCompoundPkRef> ls, InsertOption<WhiteAllInOneClsCompoundPkRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhiteAllInOneClsCompoundPkRef> ls, UpdateOption<WhiteAllInOneClsCompoundPkRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhiteAllInOneClsCompoundPkRef> ls, UpdateOption<WhiteAllInOneClsCompoundPkRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhiteAllInOneClsCompoundPkRef> ls, DeleteOption<WhiteAllInOneClsCompoundPkRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhiteAllInOneClsCompoundPkRef> ls, DeleteOption<WhiteAllInOneClsCompoundPkRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhiteAllInOneClsCompoundPkRef et, WhiteAllInOneClsCompoundPkRefCB inCB, ConditionBean resCB, InsertOption<WhiteAllInOneClsCompoundPkRefCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhiteAllInOneClsCompoundPkRef et, WhiteAllInOneClsCompoundPkRefCB cb, UpdateOption<WhiteAllInOneClsCompoundPkRefCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(WhiteAllInOneClsCompoundPkRefCB cb, DeleteOption<WhiteAllInOneClsCompoundPkRefCB> op)
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
    protected WhiteAllInOneClsCompoundPkRef downcast(Entity et) {
        return helpEntityDowncastInternally(et, WhiteAllInOneClsCompoundPkRef.class);
    }

    protected WhiteAllInOneClsCompoundPkRefCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, WhiteAllInOneClsCompoundPkRefCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<WhiteAllInOneClsCompoundPkRef> downcast(List<? extends Entity> ls) {
        return (List<WhiteAllInOneClsCompoundPkRef>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteAllInOneClsCompoundPkRefCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<WhiteAllInOneClsCompoundPkRefCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteAllInOneClsCompoundPkRefCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<WhiteAllInOneClsCompoundPkRefCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteAllInOneClsCompoundPkRefCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<WhiteAllInOneClsCompoundPkRefCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteAllInOneClsCompoundPkRef, WhiteAllInOneClsCompoundPkRefCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<WhiteAllInOneClsCompoundPkRef, WhiteAllInOneClsCompoundPkRefCB>)sp;
    }
}
