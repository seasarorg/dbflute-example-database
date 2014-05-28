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
 * The behavior of WHITE_DEPRECATED_CLS_ELEMENT as TABLE. <br />
 * <pre>
 * [primary key]
 *     DEPRECATED_CLS_ELEMENT_CODE
 *
 * [column]
 *     DEPRECATED_CLS_ELEMENT_CODE, DEPRECATED_CLS_ELEMENT_NAME
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
public abstract class BsWhiteDeprecatedClsElementBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_deprecated_cls_element"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return WhiteDeprecatedClsElementDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteDeprecatedClsElementDbm getMyDBMeta() { return WhiteDeprecatedClsElementDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteDeprecatedClsElement newMyEntity() { return new WhiteDeprecatedClsElement(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteDeprecatedClsElementCB newMyConditionBean() { return new WhiteDeprecatedClsElementCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteDeprecatedClsElementCB cb = new WhiteDeprecatedClsElementCB();
     * cb.query().setFoo...(value);
     * int count = whiteDeprecatedClsElementBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteDeprecatedClsElement. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteDeprecatedClsElementCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteDeprecatedClsElementCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteDeprecatedClsElementCB cb) { // called by selectPage(cb)
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
     * WhiteDeprecatedClsElementCB cb = new WhiteDeprecatedClsElementCB();
     * cb.query().setFoo...(value);
     * WhiteDeprecatedClsElement whiteDeprecatedClsElement = whiteDeprecatedClsElementBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (whiteDeprecatedClsElement != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = whiteDeprecatedClsElement.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteDeprecatedClsElement. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteDeprecatedClsElement selectEntity(WhiteDeprecatedClsElementCB cb) {
        return doSelectEntity(cb, WhiteDeprecatedClsElement.class);
    }

    protected <ENTITY extends WhiteDeprecatedClsElement> ENTITY doSelectEntity(WhiteDeprecatedClsElementCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, WhiteDeprecatedClsElementCB>() {
            public List<ENTITY> callbackSelectList(WhiteDeprecatedClsElementCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    protected <ENTITY extends WhiteDeprecatedClsElement> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteDeprecatedClsElementCB cb, Class<ENTITY> tp) {
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
     * WhiteDeprecatedClsElementCB cb = new WhiteDeprecatedClsElementCB();
     * cb.query().setFoo...(value);
     * WhiteDeprecatedClsElement whiteDeprecatedClsElement = whiteDeprecatedClsElementBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteDeprecatedClsElement.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteDeprecatedClsElement. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteDeprecatedClsElement selectEntityWithDeletedCheck(WhiteDeprecatedClsElementCB cb) {
        return doSelectEntityWithDeletedCheck(cb, WhiteDeprecatedClsElement.class);
    }

    protected <ENTITY extends WhiteDeprecatedClsElement> ENTITY doSelectEntityWithDeletedCheck(WhiteDeprecatedClsElementCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteDeprecatedClsElementCB>() {
            public List<ENTITY> callbackSelectList(WhiteDeprecatedClsElementCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param deprecatedClsElementCode : PK, NotNull, CHAR(3), classification=DeprecatedMapCollaborationType. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteDeprecatedClsElement selectByPKValue(CDef.DeprecatedMapCollaborationType deprecatedClsElementCode) {
        return doSelectByPK(deprecatedClsElementCode, WhiteDeprecatedClsElement.class);
    }

    protected <ENTITY extends WhiteDeprecatedClsElement> ENTITY doSelectByPK(CDef.DeprecatedMapCollaborationType deprecatedClsElementCode, Class<ENTITY> entityType) {
        return doSelectEntity(xprepareCBAsPK(deprecatedClsElementCode), entityType);
    }

    protected <ENTITY extends WhiteDeprecatedClsElement> OptionalEntity<ENTITY> doSelectOptionalByPK(CDef.DeprecatedMapCollaborationType deprecatedClsElementCode, Class<ENTITY> entityType) {
        return createOptionalEntity(doSelectByPK(deprecatedClsElementCode, entityType), deprecatedClsElementCode);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param deprecatedClsElementCode : PK, NotNull, CHAR(3), classification=DeprecatedMapCollaborationType. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteDeprecatedClsElement selectByPKValueWithDeletedCheck(CDef.DeprecatedMapCollaborationType deprecatedClsElementCode) {
        return doSelectByPKWithDeletedCheck(deprecatedClsElementCode, WhiteDeprecatedClsElement.class);
    }

    protected <ENTITY extends WhiteDeprecatedClsElement> ENTITY doSelectByPKWithDeletedCheck(CDef.DeprecatedMapCollaborationType deprecatedClsElementCode, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(deprecatedClsElementCode), entityType);
    }

    protected WhiteDeprecatedClsElementCB xprepareCBAsPK(CDef.DeprecatedMapCollaborationType deprecatedClsElementCode) {
        assertObjectNotNull("deprecatedClsElementCode", deprecatedClsElementCode);
        WhiteDeprecatedClsElementCB cb = newMyConditionBean(); cb.acceptPrimaryKey(deprecatedClsElementCode);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteDeprecatedClsElementCB cb = new WhiteDeprecatedClsElementCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteDeprecatedClsElement&gt; whiteDeprecatedClsElementList = whiteDeprecatedClsElementBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteDeprecatedClsElement whiteDeprecatedClsElement : whiteDeprecatedClsElementList) {
     *     ... = whiteDeprecatedClsElement.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteDeprecatedClsElement. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteDeprecatedClsElement> selectList(WhiteDeprecatedClsElementCB cb) {
        return doSelectList(cb, WhiteDeprecatedClsElement.class);
    }

    protected <ENTITY extends WhiteDeprecatedClsElement> ListResultBean<ENTITY> doSelectList(WhiteDeprecatedClsElementCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, WhiteDeprecatedClsElementCB>() {
            public List<ENTITY> callbackSelectList(WhiteDeprecatedClsElementCB lcb, Class<ENTITY> ltp) { return delegateSelectList(lcb, ltp); } });
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
     * WhiteDeprecatedClsElementCB cb = new WhiteDeprecatedClsElementCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteDeprecatedClsElement&gt; page = whiteDeprecatedClsElementBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteDeprecatedClsElement whiteDeprecatedClsElement : page) {
     *     ... = whiteDeprecatedClsElement.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteDeprecatedClsElement. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteDeprecatedClsElement> selectPage(WhiteDeprecatedClsElementCB cb) {
        return doSelectPage(cb, WhiteDeprecatedClsElement.class);
    }

    protected <ENTITY extends WhiteDeprecatedClsElement> PagingResultBean<ENTITY> doSelectPage(WhiteDeprecatedClsElementCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, WhiteDeprecatedClsElementCB>() {
            public int callbackSelectCount(WhiteDeprecatedClsElementCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteDeprecatedClsElementCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * WhiteDeprecatedClsElementCB cb = new WhiteDeprecatedClsElementCB();
     * cb.query().setFoo...(value);
     * whiteDeprecatedClsElementBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteDeprecatedClsElement&gt;() {
     *     public void handle(WhiteDeprecatedClsElement entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteDeprecatedClsElement. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteDeprecatedClsElement. (NotNull)
     */
    public void selectCursor(WhiteDeprecatedClsElementCB cb, EntityRowHandler<WhiteDeprecatedClsElement> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, WhiteDeprecatedClsElement.class);
    }

    protected <ENTITY extends WhiteDeprecatedClsElement> void doSelectCursor(WhiteDeprecatedClsElementCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, WhiteDeprecatedClsElementCB>() {
            public void callbackSelectCursor(WhiteDeprecatedClsElementCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(WhiteDeprecatedClsElementCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteDeprecatedClsElementBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteDeprecatedClsElementCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<WhiteDeprecatedClsElementCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends WhiteDeprecatedClsElementCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends WhiteDeprecatedClsElementCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
     * Extract the value list of (single) primary key deprecatedClsElementCode.
     * @param whiteDeprecatedClsElementList The list of whiteDeprecatedClsElement. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractDeprecatedClsElementCodeList(List<WhiteDeprecatedClsElement> whiteDeprecatedClsElementList) {
        return helpExtractListInternally(whiteDeprecatedClsElementList, new InternalExtractCallback<WhiteDeprecatedClsElement, String>() {
            public String getCV(WhiteDeprecatedClsElement et) { return et.getDeprecatedClsElementCode(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteDeprecatedClsElement whiteDeprecatedClsElement = new WhiteDeprecatedClsElement();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteDeprecatedClsElement.setFoo...(value);
     * whiteDeprecatedClsElement.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteDeprecatedClsElement.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteDeprecatedClsElement.set...;</span>
     * whiteDeprecatedClsElementBhv.<span style="color: #DD4747">insert</span>(whiteDeprecatedClsElement);
     * ... = whiteDeprecatedClsElement.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteDeprecatedClsElement The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteDeprecatedClsElement whiteDeprecatedClsElement) {
        doInsert(whiteDeprecatedClsElement, null);
    }

    protected void doInsert(WhiteDeprecatedClsElement whiteDeprecatedClsElement, InsertOption<WhiteDeprecatedClsElementCB> op) {
        assertObjectNotNull("whiteDeprecatedClsElement", whiteDeprecatedClsElement);
        prepareInsertOption(op);
        delegateInsert(whiteDeprecatedClsElement, op);
    }

    protected void prepareInsertOption(InsertOption<WhiteDeprecatedClsElementCB> op) {
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
     * WhiteDeprecatedClsElement whiteDeprecatedClsElement = new WhiteDeprecatedClsElement();
     * whiteDeprecatedClsElement.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteDeprecatedClsElement.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteDeprecatedClsElement.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteDeprecatedClsElement.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteDeprecatedClsElement.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteDeprecatedClsElementBhv.<span style="color: #DD4747">update</span>(whiteDeprecatedClsElement);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteDeprecatedClsElement The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final WhiteDeprecatedClsElement whiteDeprecatedClsElement) {
        doUpdate(whiteDeprecatedClsElement, null);
    }

    protected void doUpdate(WhiteDeprecatedClsElement whiteDeprecatedClsElement, final UpdateOption<WhiteDeprecatedClsElementCB> op) {
        assertObjectNotNull("whiteDeprecatedClsElement", whiteDeprecatedClsElement);
        prepareUpdateOption(op);
        helpUpdateInternally(whiteDeprecatedClsElement, new InternalUpdateCallback<WhiteDeprecatedClsElement>() {
            public int callbackDelegateUpdate(WhiteDeprecatedClsElement et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhiteDeprecatedClsElementCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected WhiteDeprecatedClsElementCB createCBForVaryingUpdate() {
        WhiteDeprecatedClsElementCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected WhiteDeprecatedClsElementCB createCBForSpecifiedUpdate() {
        WhiteDeprecatedClsElementCB cb = newMyConditionBean();
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
     * @param whiteDeprecatedClsElement The entity of insert or update target. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteDeprecatedClsElement whiteDeprecatedClsElement) {
        doInesrtOrUpdate(whiteDeprecatedClsElement, null, null);
    }

    protected void doInesrtOrUpdate(WhiteDeprecatedClsElement whiteDeprecatedClsElement, final InsertOption<WhiteDeprecatedClsElementCB> iop, final UpdateOption<WhiteDeprecatedClsElementCB> uop) {
        helpInsertOrUpdateInternally(whiteDeprecatedClsElement, new InternalInsertOrUpdateCallback<WhiteDeprecatedClsElement, WhiteDeprecatedClsElementCB>() {
            public void callbackInsert(WhiteDeprecatedClsElement et) { doInsert(et, iop); }
            public void callbackUpdate(WhiteDeprecatedClsElement et) { doUpdate(et, uop); }
            public WhiteDeprecatedClsElementCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(WhiteDeprecatedClsElementCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<WhiteDeprecatedClsElementCB>();
            uop = uop != null ? uop : new UpdateOption<WhiteDeprecatedClsElementCB>();
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
     * WhiteDeprecatedClsElement whiteDeprecatedClsElement = new WhiteDeprecatedClsElement();
     * whiteDeprecatedClsElement.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteDeprecatedClsElement.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteDeprecatedClsElementBhv.<span style="color: #DD4747">delete</span>(whiteDeprecatedClsElement);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteDeprecatedClsElement The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteDeprecatedClsElement whiteDeprecatedClsElement) {
        doDelete(whiteDeprecatedClsElement, null);
    }

    protected void doDelete(WhiteDeprecatedClsElement whiteDeprecatedClsElement, final DeleteOption<WhiteDeprecatedClsElementCB> op) {
        assertObjectNotNull("whiteDeprecatedClsElement", whiteDeprecatedClsElement);
        prepareDeleteOption(op);
        helpDeleteInternally(whiteDeprecatedClsElement, new InternalDeleteCallback<WhiteDeprecatedClsElement>() {
            public int callbackDelegateDelete(WhiteDeprecatedClsElement et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhiteDeprecatedClsElementCB> op) {
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
     *     WhiteDeprecatedClsElement whiteDeprecatedClsElement = new WhiteDeprecatedClsElement();
     *     whiteDeprecatedClsElement.setFooName("foo");
     *     if (...) {
     *         whiteDeprecatedClsElement.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteDeprecatedClsElementList.add(whiteDeprecatedClsElement);
     * }
     * whiteDeprecatedClsElementBhv.<span style="color: #DD4747">batchInsert</span>(whiteDeprecatedClsElementList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteDeprecatedClsElementList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteDeprecatedClsElement> whiteDeprecatedClsElementList) {
        InsertOption<WhiteDeprecatedClsElementCB> op = createInsertUpdateOption();
        return doBatchInsert(whiteDeprecatedClsElementList, op);
    }

    protected int[] doBatchInsert(List<WhiteDeprecatedClsElement> whiteDeprecatedClsElementList, InsertOption<WhiteDeprecatedClsElementCB> op) {
        assertObjectNotNull("whiteDeprecatedClsElementList", whiteDeprecatedClsElementList);
        prepareBatchInsertOption(whiteDeprecatedClsElementList, op);
        return delegateBatchInsert(whiteDeprecatedClsElementList, op);
    }

    protected void prepareBatchInsertOption(List<WhiteDeprecatedClsElement> whiteDeprecatedClsElementList, InsertOption<WhiteDeprecatedClsElementCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(whiteDeprecatedClsElementList);
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
     *     WhiteDeprecatedClsElement whiteDeprecatedClsElement = new WhiteDeprecatedClsElement();
     *     whiteDeprecatedClsElement.setFooName("foo");
     *     if (...) {
     *         whiteDeprecatedClsElement.setFooPrice(123);
     *     } else {
     *         whiteDeprecatedClsElement.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteDeprecatedClsElement.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteDeprecatedClsElementList.add(whiteDeprecatedClsElement);
     * }
     * whiteDeprecatedClsElementBhv.<span style="color: #DD4747">batchUpdate</span>(whiteDeprecatedClsElementList);
     * </pre>
     * @param whiteDeprecatedClsElementList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteDeprecatedClsElement> whiteDeprecatedClsElementList) {
        UpdateOption<WhiteDeprecatedClsElementCB> op = createPlainUpdateOption();
        return doBatchUpdate(whiteDeprecatedClsElementList, op);
    }

    protected int[] doBatchUpdate(List<WhiteDeprecatedClsElement> whiteDeprecatedClsElementList, UpdateOption<WhiteDeprecatedClsElementCB> op) {
        assertObjectNotNull("whiteDeprecatedClsElementList", whiteDeprecatedClsElementList);
        prepareBatchUpdateOption(whiteDeprecatedClsElementList, op);
        return delegateBatchUpdate(whiteDeprecatedClsElementList, op);
    }

    protected void prepareBatchUpdateOption(List<WhiteDeprecatedClsElement> whiteDeprecatedClsElementList, UpdateOption<WhiteDeprecatedClsElementCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(whiteDeprecatedClsElementList);
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
     * whiteDeprecatedClsElementBhv.<span style="color: #DD4747">batchUpdate</span>(whiteDeprecatedClsElementList, new SpecifyQuery<WhiteDeprecatedClsElementCB>() {
     *     public void specify(WhiteDeprecatedClsElementCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteDeprecatedClsElementBhv.<span style="color: #DD4747">batchUpdate</span>(whiteDeprecatedClsElementList, new SpecifyQuery<WhiteDeprecatedClsElementCB>() {
     *     public void specify(WhiteDeprecatedClsElementCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteDeprecatedClsElementList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteDeprecatedClsElement> whiteDeprecatedClsElementList, SpecifyQuery<WhiteDeprecatedClsElementCB> updateColumnSpec) {
        return doBatchUpdate(whiteDeprecatedClsElementList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteDeprecatedClsElementList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteDeprecatedClsElement> whiteDeprecatedClsElementList) {
        return doBatchDelete(whiteDeprecatedClsElementList, null);
    }

    protected int[] doBatchDelete(List<WhiteDeprecatedClsElement> whiteDeprecatedClsElementList, DeleteOption<WhiteDeprecatedClsElementCB> op) {
        assertObjectNotNull("whiteDeprecatedClsElementList", whiteDeprecatedClsElementList);
        prepareDeleteOption(op);
        return delegateBatchDelete(whiteDeprecatedClsElementList, op);
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
     * whiteDeprecatedClsElementBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteDeprecatedClsElement, WhiteDeprecatedClsElementCB&gt;() {
     *     public ConditionBean setup(whiteDeprecatedClsElement entity, WhiteDeprecatedClsElementCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteDeprecatedClsElement, WhiteDeprecatedClsElementCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteDeprecatedClsElement, WhiteDeprecatedClsElementCB> sp, InsertOption<WhiteDeprecatedClsElementCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        WhiteDeprecatedClsElement e = new WhiteDeprecatedClsElement();
        WhiteDeprecatedClsElementCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected WhiteDeprecatedClsElementCB createCBForQueryInsert() {
        WhiteDeprecatedClsElementCB cb = newMyConditionBean();
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
     * WhiteDeprecatedClsElement whiteDeprecatedClsElement = new WhiteDeprecatedClsElement();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteDeprecatedClsElement.setPK...(value);</span>
     * whiteDeprecatedClsElement.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteDeprecatedClsElement.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteDeprecatedClsElement.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteDeprecatedClsElement.setVersionNo(value);</span>
     * WhiteDeprecatedClsElementCB cb = new WhiteDeprecatedClsElementCB();
     * cb.query().setFoo...(value);
     * whiteDeprecatedClsElementBhv.<span style="color: #DD4747">queryUpdate</span>(whiteDeprecatedClsElement, cb);
     * </pre>
     * @param whiteDeprecatedClsElement The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteDeprecatedClsElement. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteDeprecatedClsElement whiteDeprecatedClsElement, WhiteDeprecatedClsElementCB cb) {
        return doQueryUpdate(whiteDeprecatedClsElement, cb, null);
    }

    protected int doQueryUpdate(WhiteDeprecatedClsElement whiteDeprecatedClsElement, WhiteDeprecatedClsElementCB cb, UpdateOption<WhiteDeprecatedClsElementCB> op) {
        assertObjectNotNull("whiteDeprecatedClsElement", whiteDeprecatedClsElement); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(whiteDeprecatedClsElement, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (WhiteDeprecatedClsElementCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (WhiteDeprecatedClsElementCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteDeprecatedClsElementCB cb = new WhiteDeprecatedClsElementCB();
     * cb.query().setFoo...(value);
     * whiteDeprecatedClsElementBhv.<span style="color: #DD4747">queryDelete</span>(whiteDeprecatedClsElement, cb);
     * </pre>
     * @param cb The condition-bean of WhiteDeprecatedClsElement. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteDeprecatedClsElementCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteDeprecatedClsElementCB cb, DeleteOption<WhiteDeprecatedClsElementCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((WhiteDeprecatedClsElementCB)cb); }
        else { return varyingQueryDelete((WhiteDeprecatedClsElementCB)cb, downcast(op)); }
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
     * WhiteDeprecatedClsElement whiteDeprecatedClsElement = new WhiteDeprecatedClsElement();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteDeprecatedClsElement.setFoo...(value);
     * whiteDeprecatedClsElement.setBar...(value);
     * InsertOption<WhiteDeprecatedClsElementCB> option = new InsertOption<WhiteDeprecatedClsElementCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteDeprecatedClsElementBhv.<span style="color: #DD4747">varyingInsert</span>(whiteDeprecatedClsElement, option);
     * ... = whiteDeprecatedClsElement.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteDeprecatedClsElement The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteDeprecatedClsElement whiteDeprecatedClsElement, InsertOption<WhiteDeprecatedClsElementCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteDeprecatedClsElement, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteDeprecatedClsElement whiteDeprecatedClsElement = new WhiteDeprecatedClsElement();
     * whiteDeprecatedClsElement.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteDeprecatedClsElement.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteDeprecatedClsElement.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteDeprecatedClsElementCB&gt; option = new UpdateOption&lt;WhiteDeprecatedClsElementCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteDeprecatedClsElementCB&gt;() {
     *         public void specify(WhiteDeprecatedClsElementCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteDeprecatedClsElementBhv.<span style="color: #DD4747">varyingUpdate</span>(whiteDeprecatedClsElement, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteDeprecatedClsElement The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteDeprecatedClsElement whiteDeprecatedClsElement, UpdateOption<WhiteDeprecatedClsElementCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteDeprecatedClsElement, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteDeprecatedClsElement The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteDeprecatedClsElement whiteDeprecatedClsElement, InsertOption<WhiteDeprecatedClsElementCB> insertOption, UpdateOption<WhiteDeprecatedClsElementCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(whiteDeprecatedClsElement, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteDeprecatedClsElement The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteDeprecatedClsElement whiteDeprecatedClsElement, DeleteOption<WhiteDeprecatedClsElementCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteDeprecatedClsElement, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteDeprecatedClsElementList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteDeprecatedClsElement> whiteDeprecatedClsElementList, InsertOption<WhiteDeprecatedClsElementCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteDeprecatedClsElementList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteDeprecatedClsElementList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteDeprecatedClsElement> whiteDeprecatedClsElementList, UpdateOption<WhiteDeprecatedClsElementCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteDeprecatedClsElementList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteDeprecatedClsElementList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteDeprecatedClsElement> whiteDeprecatedClsElementList, DeleteOption<WhiteDeprecatedClsElementCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteDeprecatedClsElementList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteDeprecatedClsElement, WhiteDeprecatedClsElementCB> setupper, InsertOption<WhiteDeprecatedClsElementCB> option) {
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
     * WhiteDeprecatedClsElement whiteDeprecatedClsElement = new WhiteDeprecatedClsElement();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteDeprecatedClsElement.setPK...(value);</span>
     * whiteDeprecatedClsElement.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteDeprecatedClsElement.setVersionNo(value);</span>
     * WhiteDeprecatedClsElementCB cb = new WhiteDeprecatedClsElementCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteDeprecatedClsElementCB&gt; option = new UpdateOption&lt;WhiteDeprecatedClsElementCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteDeprecatedClsElementCB&gt;() {
     *     public void specify(WhiteDeprecatedClsElementCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteDeprecatedClsElementBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteDeprecatedClsElement, cb, option);
     * </pre>
     * @param whiteDeprecatedClsElement The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteDeprecatedClsElement. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteDeprecatedClsElement whiteDeprecatedClsElement, WhiteDeprecatedClsElementCB cb, UpdateOption<WhiteDeprecatedClsElementCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteDeprecatedClsElement, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteDeprecatedClsElement. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteDeprecatedClsElementCB cb, DeleteOption<WhiteDeprecatedClsElementCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteDeprecatedClsElementBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhiteDeprecatedClsElementCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhiteDeprecatedClsElementCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhiteDeprecatedClsElement> void delegateSelectCursor(WhiteDeprecatedClsElementCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends WhiteDeprecatedClsElement> List<ENTITY> delegateSelectList(WhiteDeprecatedClsElementCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhiteDeprecatedClsElement et, InsertOption<WhiteDeprecatedClsElementCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(WhiteDeprecatedClsElement et, UpdateOption<WhiteDeprecatedClsElementCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(WhiteDeprecatedClsElement et, UpdateOption<WhiteDeprecatedClsElementCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(WhiteDeprecatedClsElement et, DeleteOption<WhiteDeprecatedClsElementCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(WhiteDeprecatedClsElement et, DeleteOption<WhiteDeprecatedClsElementCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<WhiteDeprecatedClsElement> ls, InsertOption<WhiteDeprecatedClsElementCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhiteDeprecatedClsElement> ls, UpdateOption<WhiteDeprecatedClsElementCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhiteDeprecatedClsElement> ls, UpdateOption<WhiteDeprecatedClsElementCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhiteDeprecatedClsElement> ls, DeleteOption<WhiteDeprecatedClsElementCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhiteDeprecatedClsElement> ls, DeleteOption<WhiteDeprecatedClsElementCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhiteDeprecatedClsElement et, WhiteDeprecatedClsElementCB inCB, ConditionBean resCB, InsertOption<WhiteDeprecatedClsElementCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhiteDeprecatedClsElement et, WhiteDeprecatedClsElementCB cb, UpdateOption<WhiteDeprecatedClsElementCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(WhiteDeprecatedClsElementCB cb, DeleteOption<WhiteDeprecatedClsElementCB> op)
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
    protected WhiteDeprecatedClsElement downcast(Entity et) {
        return helpEntityDowncastInternally(et, WhiteDeprecatedClsElement.class);
    }

    protected WhiteDeprecatedClsElementCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, WhiteDeprecatedClsElementCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<WhiteDeprecatedClsElement> downcast(List<? extends Entity> ls) {
        return (List<WhiteDeprecatedClsElement>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteDeprecatedClsElementCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<WhiteDeprecatedClsElementCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteDeprecatedClsElementCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<WhiteDeprecatedClsElementCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteDeprecatedClsElementCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<WhiteDeprecatedClsElementCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteDeprecatedClsElement, WhiteDeprecatedClsElementCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<WhiteDeprecatedClsElement, WhiteDeprecatedClsElementCB>)sp;
    }
}
