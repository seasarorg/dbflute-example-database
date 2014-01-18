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
 * The behavior of WHITE_ALL_IN_ONE_CLS_ELEMENT as TABLE. <br />
 * <pre>
 * [primary key]
 *     CLS_CATEGORY_CODE, CLS_ELEMENT_CODE
 *
 * [column]
 *     CLS_CATEGORY_CODE, CLS_ELEMENT_CODE, CLS_ELEMENT_NAME, ATTRIBUTE_EXP
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
 *     white_all_in_one_cls_category
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     whiteAllInOneClsCategory
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteAllInOneClsElementBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_all_in_one_cls_element"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return WhiteAllInOneClsElementDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteAllInOneClsElementDbm getMyDBMeta() { return WhiteAllInOneClsElementDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteAllInOneClsElement newMyEntity() { return new WhiteAllInOneClsElement(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteAllInOneClsElementCB newMyConditionBean() { return new WhiteAllInOneClsElementCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteAllInOneClsElementCB cb = new WhiteAllInOneClsElementCB();
     * cb.query().setFoo...(value);
     * int count = whiteAllInOneClsElementBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteAllInOneClsElement. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteAllInOneClsElementCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteAllInOneClsElementCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteAllInOneClsElementCB cb) { // called by selectPage(cb)
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
     * WhiteAllInOneClsElementCB cb = new WhiteAllInOneClsElementCB();
     * cb.query().setFoo...(value);
     * WhiteAllInOneClsElement whiteAllInOneClsElement = whiteAllInOneClsElementBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (whiteAllInOneClsElement != null) {
     *     ... = whiteAllInOneClsElement.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteAllInOneClsElement. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteAllInOneClsElement selectEntity(WhiteAllInOneClsElementCB cb) {
        return doSelectEntity(cb, WhiteAllInOneClsElement.class);
    }

    protected <ENTITY extends WhiteAllInOneClsElement> ENTITY doSelectEntity(final WhiteAllInOneClsElementCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, entityType, new InternalSelectEntityCallback<ENTITY, WhiteAllInOneClsElementCB>() {
            public List<ENTITY> callbackSelectList(WhiteAllInOneClsElementCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * WhiteAllInOneClsElementCB cb = new WhiteAllInOneClsElementCB();
     * cb.query().setFoo...(value);
     * WhiteAllInOneClsElement whiteAllInOneClsElement = whiteAllInOneClsElementBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteAllInOneClsElement.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteAllInOneClsElement. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteAllInOneClsElement selectEntityWithDeletedCheck(WhiteAllInOneClsElementCB cb) {
        return doSelectEntityWithDeletedCheck(cb, WhiteAllInOneClsElement.class);
    }

    protected <ENTITY extends WhiteAllInOneClsElement> ENTITY doSelectEntityWithDeletedCheck(final WhiteAllInOneClsElementCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, entityType, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteAllInOneClsElementCB>() {
            public List<ENTITY> callbackSelectList(WhiteAllInOneClsElementCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param clsCategoryCode The one of primary key. (NotNull)
     * @param clsElementCode The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteAllInOneClsElement selectByPKValue(String clsCategoryCode, String clsElementCode) {
        return doSelectByPKValue(clsCategoryCode, clsElementCode, WhiteAllInOneClsElement.class);
    }

    protected <ENTITY extends WhiteAllInOneClsElement> ENTITY doSelectByPKValue(String clsCategoryCode, String clsElementCode, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(clsCategoryCode, clsElementCode), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param clsCategoryCode The one of primary key. (NotNull)
     * @param clsElementCode The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteAllInOneClsElement selectByPKValueWithDeletedCheck(String clsCategoryCode, String clsElementCode) {
        return doSelectByPKValueWithDeletedCheck(clsCategoryCode, clsElementCode, WhiteAllInOneClsElement.class);
    }

    protected <ENTITY extends WhiteAllInOneClsElement> ENTITY doSelectByPKValueWithDeletedCheck(String clsCategoryCode, String clsElementCode, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(clsCategoryCode, clsElementCode), entityType);
    }

    private WhiteAllInOneClsElementCB buildPKCB(String clsCategoryCode, String clsElementCode) {
        assertObjectNotNull("clsCategoryCode", clsCategoryCode);assertObjectNotNull("clsElementCode", clsElementCode);
        WhiteAllInOneClsElementCB cb = newMyConditionBean();
        cb.query().setClsCategoryCode_Equal(clsCategoryCode);cb.query().setClsElementCode_Equal(clsElementCode);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteAllInOneClsElementCB cb = new WhiteAllInOneClsElementCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteAllInOneClsElement&gt; whiteAllInOneClsElementList = whiteAllInOneClsElementBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (WhiteAllInOneClsElement whiteAllInOneClsElement : whiteAllInOneClsElementList) {
     *     ... = whiteAllInOneClsElement.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteAllInOneClsElement. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteAllInOneClsElement> selectList(WhiteAllInOneClsElementCB cb) {
        return doSelectList(cb, WhiteAllInOneClsElement.class);
    }

    protected <ENTITY extends WhiteAllInOneClsElement> ListResultBean<ENTITY> doSelectList(WhiteAllInOneClsElementCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, WhiteAllInOneClsElementCB>() {
            public List<ENTITY> callbackSelectList(WhiteAllInOneClsElementCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * WhiteAllInOneClsElementCB cb = new WhiteAllInOneClsElementCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteAllInOneClsElement&gt; page = whiteAllInOneClsElementBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteAllInOneClsElement whiteAllInOneClsElement : page) {
     *     ... = whiteAllInOneClsElement.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteAllInOneClsElement. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteAllInOneClsElement> selectPage(WhiteAllInOneClsElementCB cb) {
        return doSelectPage(cb, WhiteAllInOneClsElement.class);
    }

    protected <ENTITY extends WhiteAllInOneClsElement> PagingResultBean<ENTITY> doSelectPage(WhiteAllInOneClsElementCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, WhiteAllInOneClsElementCB>() {
            public int callbackSelectCount(WhiteAllInOneClsElementCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteAllInOneClsElementCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * WhiteAllInOneClsElementCB cb = new WhiteAllInOneClsElementCB();
     * cb.query().setFoo...(value);
     * whiteAllInOneClsElementBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteAllInOneClsElement&gt;() {
     *     public void handle(WhiteAllInOneClsElement entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteAllInOneClsElement. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteAllInOneClsElement. (NotNull)
     */
    public void selectCursor(WhiteAllInOneClsElementCB cb, EntityRowHandler<WhiteAllInOneClsElement> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, WhiteAllInOneClsElement.class);
    }

    protected <ENTITY extends WhiteAllInOneClsElement> void doSelectCursor(WhiteAllInOneClsElementCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<WhiteAllInOneClsElement>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        helpSelectCursorInternally(cb, entityRowHandler, entityType, new InternalSelectCursorCallback<ENTITY, WhiteAllInOneClsElementCB>() {
            public void callbackSelectCursor(WhiteAllInOneClsElementCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) { delegateSelectCursor(cb, entityRowHandler, entityType); }
            public List<ENTITY> callbackSelectList(WhiteAllInOneClsElementCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteAllInOneClsElementBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteAllInOneClsElementCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<WhiteAllInOneClsElementCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends WhiteAllInOneClsElementCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
        assertObjectNotNull("resultType", resultType); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, resultType);
    }

    protected <RESULT, CB extends WhiteAllInOneClsElementCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> resultType) {
        return new SLFunction<CB, RESULT>(cb, resultType);
    }

    protected <RESULT> SLFunction<? extends ConditionBean, RESULT> doReadScalar(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
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
     * Pull out the list of foreign table 'WhiteAllInOneClsCategory'.
     * @param whiteAllInOneClsElementList The list of whiteAllInOneClsElement. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteAllInOneClsCategory> pulloutWhiteAllInOneClsCategory(List<WhiteAllInOneClsElement> whiteAllInOneClsElementList) {
        return helpPulloutInternally(whiteAllInOneClsElementList, new InternalPulloutCallback<WhiteAllInOneClsElement, WhiteAllInOneClsCategory>() {
            public WhiteAllInOneClsCategory getFr(WhiteAllInOneClsElement e) { return e.getWhiteAllInOneClsCategory(); }
            public boolean hasRf() { return true; }
            public void setRfLs(WhiteAllInOneClsCategory e, List<WhiteAllInOneClsElement> ls)
            { e.setWhiteAllInOneClsElementList(ls); }
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
     * WhiteAllInOneClsElement whiteAllInOneClsElement = new WhiteAllInOneClsElement();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteAllInOneClsElement.setFoo...(value);
     * whiteAllInOneClsElement.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsElement.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsElement.set...;</span>
     * whiteAllInOneClsElementBhv.<span style="color: #FD4747">insert</span>(whiteAllInOneClsElement);
     * ... = whiteAllInOneClsElement.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteAllInOneClsElement The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteAllInOneClsElement whiteAllInOneClsElement) {
        doInsert(whiteAllInOneClsElement, null);
    }

    protected void doInsert(WhiteAllInOneClsElement whiteAllInOneClsElement, InsertOption<WhiteAllInOneClsElementCB> option) {
        assertObjectNotNull("whiteAllInOneClsElement", whiteAllInOneClsElement);
        prepareInsertOption(option);
        delegateInsert(whiteAllInOneClsElement, option);
    }

    protected void prepareInsertOption(InsertOption<WhiteAllInOneClsElementCB> option) {
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
     * WhiteAllInOneClsElement whiteAllInOneClsElement = new WhiteAllInOneClsElement();
     * whiteAllInOneClsElement.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteAllInOneClsElement.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsElement.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsElement.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteAllInOneClsElement.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteAllInOneClsElementBhv.<span style="color: #FD4747">update</span>(whiteAllInOneClsElement);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteAllInOneClsElement The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final WhiteAllInOneClsElement whiteAllInOneClsElement) {
        doUpdate(whiteAllInOneClsElement, null);
    }

    protected void doUpdate(WhiteAllInOneClsElement whiteAllInOneClsElement, final UpdateOption<WhiteAllInOneClsElementCB> option) {
        assertObjectNotNull("whiteAllInOneClsElement", whiteAllInOneClsElement);
        prepareUpdateOption(option);
        helpUpdateInternally(whiteAllInOneClsElement, new InternalUpdateCallback<WhiteAllInOneClsElement>() {
            public int callbackDelegateUpdate(WhiteAllInOneClsElement entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhiteAllInOneClsElementCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected WhiteAllInOneClsElementCB createCBForVaryingUpdate() {
        WhiteAllInOneClsElementCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected WhiteAllInOneClsElementCB createCBForSpecifiedUpdate() {
        WhiteAllInOneClsElementCB cb = newMyConditionBean();
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
     * @param whiteAllInOneClsElement The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteAllInOneClsElement whiteAllInOneClsElement) {
        doInesrtOrUpdate(whiteAllInOneClsElement, null, null);
    }

    protected void doInesrtOrUpdate(WhiteAllInOneClsElement whiteAllInOneClsElement, final InsertOption<WhiteAllInOneClsElementCB> insertOption, final UpdateOption<WhiteAllInOneClsElementCB> updateOption) {
        helpInsertOrUpdateInternally(whiteAllInOneClsElement, new InternalInsertOrUpdateCallback<WhiteAllInOneClsElement, WhiteAllInOneClsElementCB>() {
            public void callbackInsert(WhiteAllInOneClsElement entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(WhiteAllInOneClsElement entity) { doUpdate(entity, updateOption); }
            public WhiteAllInOneClsElementCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(WhiteAllInOneClsElementCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<WhiteAllInOneClsElementCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<WhiteAllInOneClsElementCB>() : updateOption;
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
     * WhiteAllInOneClsElement whiteAllInOneClsElement = new WhiteAllInOneClsElement();
     * whiteAllInOneClsElement.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteAllInOneClsElement.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteAllInOneClsElementBhv.<span style="color: #FD4747">delete</span>(whiteAllInOneClsElement);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteAllInOneClsElement The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteAllInOneClsElement whiteAllInOneClsElement) {
        doDelete(whiteAllInOneClsElement, null);
    }

    protected void doDelete(WhiteAllInOneClsElement whiteAllInOneClsElement, final DeleteOption<WhiteAllInOneClsElementCB> option) {
        assertObjectNotNull("whiteAllInOneClsElement", whiteAllInOneClsElement);
        prepareDeleteOption(option);
        helpDeleteInternally(whiteAllInOneClsElement, new InternalDeleteCallback<WhiteAllInOneClsElement>() {
            public int callbackDelegateDelete(WhiteAllInOneClsElement entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhiteAllInOneClsElementCB> option) {
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
     *     WhiteAllInOneClsElement whiteAllInOneClsElement = new WhiteAllInOneClsElement();
     *     whiteAllInOneClsElement.setFooName("foo");
     *     if (...) {
     *         whiteAllInOneClsElement.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteAllInOneClsElementList.add(whiteAllInOneClsElement);
     * }
     * whiteAllInOneClsElementBhv.<span style="color: #FD4747">batchInsert</span>(whiteAllInOneClsElementList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteAllInOneClsElementList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteAllInOneClsElement> whiteAllInOneClsElementList) {
        InsertOption<WhiteAllInOneClsElementCB> option = createInsertUpdateOption();
        return doBatchInsert(whiteAllInOneClsElementList, option);
    }

    protected int[] doBatchInsert(List<WhiteAllInOneClsElement> whiteAllInOneClsElementList, InsertOption<WhiteAllInOneClsElementCB> option) {
        assertObjectNotNull("whiteAllInOneClsElementList", whiteAllInOneClsElementList);
        prepareBatchInsertOption(whiteAllInOneClsElementList, option);
        return delegateBatchInsert(whiteAllInOneClsElementList, option);
    }

    protected void prepareBatchInsertOption(List<WhiteAllInOneClsElement> whiteAllInOneClsElementList, InsertOption<WhiteAllInOneClsElementCB> option) {
        option.xallowInsertColumnModifiedPropertiesFragmented();
        option.xacceptInsertColumnModifiedPropertiesIfNeeds(whiteAllInOneClsElementList);
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
     *     WhiteAllInOneClsElement whiteAllInOneClsElement = new WhiteAllInOneClsElement();
     *     whiteAllInOneClsElement.setFooName("foo");
     *     if (...) {
     *         whiteAllInOneClsElement.setFooPrice(123);
     *     } else {
     *         whiteAllInOneClsElement.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteAllInOneClsElement.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteAllInOneClsElementList.add(whiteAllInOneClsElement);
     * }
     * whiteAllInOneClsElementBhv.<span style="color: #FD4747">batchUpdate</span>(whiteAllInOneClsElementList);
     * </pre>
     * @param whiteAllInOneClsElementList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteAllInOneClsElement> whiteAllInOneClsElementList) {
        UpdateOption<WhiteAllInOneClsElementCB> option = createPlainUpdateOption();
        return doBatchUpdate(whiteAllInOneClsElementList, option);
    }

    protected int[] doBatchUpdate(List<WhiteAllInOneClsElement> whiteAllInOneClsElementList, UpdateOption<WhiteAllInOneClsElementCB> option) {
        assertObjectNotNull("whiteAllInOneClsElementList", whiteAllInOneClsElementList);
        prepareBatchUpdateOption(whiteAllInOneClsElementList, option);
        return delegateBatchUpdate(whiteAllInOneClsElementList, option);
    }

    protected void prepareBatchUpdateOption(List<WhiteAllInOneClsElement> whiteAllInOneClsElementList, UpdateOption<WhiteAllInOneClsElementCB> option) {
        option.xacceptUpdateColumnModifiedPropertiesIfNeeds(whiteAllInOneClsElementList);
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
     * whiteAllInOneClsElementBhv.<span style="color: #FD4747">batchUpdate</span>(whiteAllInOneClsElementList, new SpecifyQuery<WhiteAllInOneClsElementCB>() {
     *     public void specify(WhiteAllInOneClsElementCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteAllInOneClsElementBhv.<span style="color: #FD4747">batchUpdate</span>(whiteAllInOneClsElementList, new SpecifyQuery<WhiteAllInOneClsElementCB>() {
     *     public void specify(WhiteAllInOneClsElementCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteAllInOneClsElementList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteAllInOneClsElement> whiteAllInOneClsElementList, SpecifyQuery<WhiteAllInOneClsElementCB> updateColumnSpec) {
        return doBatchUpdate(whiteAllInOneClsElementList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        return doLumpModify(ls, option);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteAllInOneClsElementList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteAllInOneClsElement> whiteAllInOneClsElementList) {
        return doBatchDelete(whiteAllInOneClsElementList, null);
    }

    protected int[] doBatchDelete(List<WhiteAllInOneClsElement> whiteAllInOneClsElementList, DeleteOption<WhiteAllInOneClsElementCB> option) {
        assertObjectNotNull("whiteAllInOneClsElementList", whiteAllInOneClsElementList);
        prepareDeleteOption(option);
        return delegateBatchDelete(whiteAllInOneClsElementList, option);
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
     * whiteAllInOneClsElementBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteAllInOneClsElement, WhiteAllInOneClsElementCB&gt;() {
     *     public ConditionBean setup(whiteAllInOneClsElement entity, WhiteAllInOneClsElementCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteAllInOneClsElement, WhiteAllInOneClsElementCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteAllInOneClsElement, WhiteAllInOneClsElementCB> setupper, InsertOption<WhiteAllInOneClsElementCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        WhiteAllInOneClsElement entity = new WhiteAllInOneClsElement();
        WhiteAllInOneClsElementCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected WhiteAllInOneClsElementCB createCBForQueryInsert() {
        WhiteAllInOneClsElementCB cb = newMyConditionBean();
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
     * WhiteAllInOneClsElement whiteAllInOneClsElement = new WhiteAllInOneClsElement();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsElement.setPK...(value);</span>
     * whiteAllInOneClsElement.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsElement.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsElement.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsElement.setVersionNo(value);</span>
     * WhiteAllInOneClsElementCB cb = new WhiteAllInOneClsElementCB();
     * cb.query().setFoo...(value);
     * whiteAllInOneClsElementBhv.<span style="color: #FD4747">queryUpdate</span>(whiteAllInOneClsElement, cb);
     * </pre>
     * @param whiteAllInOneClsElement The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteAllInOneClsElement. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteAllInOneClsElement whiteAllInOneClsElement, WhiteAllInOneClsElementCB cb) {
        return doQueryUpdate(whiteAllInOneClsElement, cb, null);
    }

    protected int doQueryUpdate(WhiteAllInOneClsElement whiteAllInOneClsElement, WhiteAllInOneClsElementCB cb, UpdateOption<WhiteAllInOneClsElementCB> option) {
        assertObjectNotNull("whiteAllInOneClsElement", whiteAllInOneClsElement); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(whiteAllInOneClsElement, cb, option) : 0;
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (WhiteAllInOneClsElementCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (WhiteAllInOneClsElementCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteAllInOneClsElementCB cb = new WhiteAllInOneClsElementCB();
     * cb.query().setFoo...(value);
     * whiteAllInOneClsElementBhv.<span style="color: #FD4747">queryDelete</span>(whiteAllInOneClsElement, cb);
     * </pre>
     * @param cb The condition-bean of WhiteAllInOneClsElement. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteAllInOneClsElementCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteAllInOneClsElementCB cb, DeleteOption<WhiteAllInOneClsElementCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, option) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((WhiteAllInOneClsElementCB)cb); }
        else { return varyingQueryDelete((WhiteAllInOneClsElementCB)cb, downcast(option)); }
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
     * WhiteAllInOneClsElement whiteAllInOneClsElement = new WhiteAllInOneClsElement();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteAllInOneClsElement.setFoo...(value);
     * whiteAllInOneClsElement.setBar...(value);
     * InsertOption<WhiteAllInOneClsElementCB> option = new InsertOption<WhiteAllInOneClsElementCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteAllInOneClsElementBhv.<span style="color: #FD4747">varyingInsert</span>(whiteAllInOneClsElement, option);
     * ... = whiteAllInOneClsElement.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteAllInOneClsElement The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteAllInOneClsElement whiteAllInOneClsElement, InsertOption<WhiteAllInOneClsElementCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteAllInOneClsElement, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteAllInOneClsElement whiteAllInOneClsElement = new WhiteAllInOneClsElement();
     * whiteAllInOneClsElement.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteAllInOneClsElement.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteAllInOneClsElement.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteAllInOneClsElementCB&gt; option = new UpdateOption&lt;WhiteAllInOneClsElementCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteAllInOneClsElementCB&gt;() {
     *         public void specify(WhiteAllInOneClsElementCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteAllInOneClsElementBhv.<span style="color: #FD4747">varyingUpdate</span>(whiteAllInOneClsElement, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteAllInOneClsElement The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteAllInOneClsElement whiteAllInOneClsElement, UpdateOption<WhiteAllInOneClsElementCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteAllInOneClsElement, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteAllInOneClsElement The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteAllInOneClsElement whiteAllInOneClsElement, InsertOption<WhiteAllInOneClsElementCB> insertOption, UpdateOption<WhiteAllInOneClsElementCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(whiteAllInOneClsElement, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteAllInOneClsElement The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteAllInOneClsElement whiteAllInOneClsElement, DeleteOption<WhiteAllInOneClsElementCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteAllInOneClsElement, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteAllInOneClsElementList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteAllInOneClsElement> whiteAllInOneClsElementList, InsertOption<WhiteAllInOneClsElementCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteAllInOneClsElementList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteAllInOneClsElementList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteAllInOneClsElement> whiteAllInOneClsElementList, UpdateOption<WhiteAllInOneClsElementCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteAllInOneClsElementList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteAllInOneClsElementList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteAllInOneClsElement> whiteAllInOneClsElementList, DeleteOption<WhiteAllInOneClsElementCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteAllInOneClsElementList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteAllInOneClsElement, WhiteAllInOneClsElementCB> setupper, InsertOption<WhiteAllInOneClsElementCB> option) {
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
     * WhiteAllInOneClsElement whiteAllInOneClsElement = new WhiteAllInOneClsElement();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsElement.setPK...(value);</span>
     * whiteAllInOneClsElement.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsElement.setVersionNo(value);</span>
     * WhiteAllInOneClsElementCB cb = new WhiteAllInOneClsElementCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteAllInOneClsElementCB&gt; option = new UpdateOption&lt;WhiteAllInOneClsElementCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteAllInOneClsElementCB&gt;() {
     *     public void specify(WhiteAllInOneClsElementCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteAllInOneClsElementBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(whiteAllInOneClsElement, cb, option);
     * </pre>
     * @param whiteAllInOneClsElement The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteAllInOneClsElement. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteAllInOneClsElement whiteAllInOneClsElement, WhiteAllInOneClsElementCB cb, UpdateOption<WhiteAllInOneClsElementCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteAllInOneClsElement, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteAllInOneClsElement. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteAllInOneClsElementCB cb, DeleteOption<WhiteAllInOneClsElementCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteAllInOneClsElementBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhiteAllInOneClsElementCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhiteAllInOneClsElementCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhiteAllInOneClsElement> void delegateSelectCursor(WhiteAllInOneClsElementCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends WhiteAllInOneClsElement> List<ENTITY> delegateSelectList(WhiteAllInOneClsElementCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhiteAllInOneClsElement e, InsertOption<WhiteAllInOneClsElementCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(WhiteAllInOneClsElement e, UpdateOption<WhiteAllInOneClsElementCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return delegateUpdateNonstrict(e, op); }
    protected int delegateUpdateNonstrict(WhiteAllInOneClsElement e, UpdateOption<WhiteAllInOneClsElementCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(WhiteAllInOneClsElement e, DeleteOption<WhiteAllInOneClsElementCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return delegateDeleteNonstrict(e, op); }
    protected int delegateDeleteNonstrict(WhiteAllInOneClsElement e, DeleteOption<WhiteAllInOneClsElementCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<WhiteAllInOneClsElement> ls, InsertOption<WhiteAllInOneClsElementCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhiteAllInOneClsElement> ls, UpdateOption<WhiteAllInOneClsElementCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhiteAllInOneClsElement> ls, UpdateOption<WhiteAllInOneClsElementCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhiteAllInOneClsElement> ls, DeleteOption<WhiteAllInOneClsElementCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhiteAllInOneClsElement> ls, DeleteOption<WhiteAllInOneClsElementCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhiteAllInOneClsElement e, WhiteAllInOneClsElementCB inCB, ConditionBean resCB, InsertOption<WhiteAllInOneClsElementCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhiteAllInOneClsElement e, WhiteAllInOneClsElementCB cb, UpdateOption<WhiteAllInOneClsElementCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(WhiteAllInOneClsElementCB cb, DeleteOption<WhiteAllInOneClsElementCB> op)
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
    protected WhiteAllInOneClsElement downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, WhiteAllInOneClsElement.class);
    }

    protected WhiteAllInOneClsElementCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, WhiteAllInOneClsElementCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<WhiteAllInOneClsElement> downcast(List<? extends Entity> entityList) {
        return (List<WhiteAllInOneClsElement>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteAllInOneClsElementCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<WhiteAllInOneClsElementCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteAllInOneClsElementCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<WhiteAllInOneClsElementCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteAllInOneClsElementCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<WhiteAllInOneClsElementCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteAllInOneClsElement, WhiteAllInOneClsElementCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<WhiteAllInOneClsElement, WhiteAllInOneClsElementCB>)option;
    }
}
