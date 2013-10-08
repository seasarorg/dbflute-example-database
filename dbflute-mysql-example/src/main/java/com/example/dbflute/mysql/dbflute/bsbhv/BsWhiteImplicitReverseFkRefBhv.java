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
 * The behavior of WHITE_IMPLICIT_REVERSE_FK_REF as TABLE. <br />
 * <pre>
 * [primary key]
 *     WHITE_IMPLICIT_REVERSE_FK_REF_ID
 * 
 * [column]
 *     WHITE_IMPLICIT_REVERSE_FK_REF_ID, WHITE_IMPLICIT_REVERSE_FK_ID, VALID_BEGIN_DATE, VALID_END_DATE
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     WHITE_IMPLICIT_REVERSE_FK_REF_ID
 * 
 * [version-no]
 *     
 * 
 * [foreign table]
 *     white_implicit_reverse_fk
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     whiteImplicitReverseFk
 * 
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteImplicitReverseFkRefBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_implicit_reverse_fk_ref"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return WhiteImplicitReverseFkRefDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteImplicitReverseFkRefDbm getMyDBMeta() { return WhiteImplicitReverseFkRefDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteImplicitReverseFkRef newMyEntity() { return new WhiteImplicitReverseFkRef(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteImplicitReverseFkRefCB newMyConditionBean() { return new WhiteImplicitReverseFkRefCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteImplicitReverseFkRefCB cb = new WhiteImplicitReverseFkRefCB();
     * cb.query().setFoo...(value);
     * int count = whiteImplicitReverseFkRefBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteImplicitReverseFkRef. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteImplicitReverseFkRefCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteImplicitReverseFkRefCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteImplicitReverseFkRefCB cb) { // called by selectPage(cb)
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
     * WhiteImplicitReverseFkRefCB cb = new WhiteImplicitReverseFkRefCB();
     * cb.query().setFoo...(value);
     * WhiteImplicitReverseFkRef whiteImplicitReverseFkRef = whiteImplicitReverseFkRefBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (whiteImplicitReverseFkRef != null) {
     *     ... = whiteImplicitReverseFkRef.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteImplicitReverseFkRef. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteImplicitReverseFkRef selectEntity(WhiteImplicitReverseFkRefCB cb) {
        return doSelectEntity(cb, WhiteImplicitReverseFkRef.class);
    }

    protected <ENTITY extends WhiteImplicitReverseFkRef> ENTITY doSelectEntity(final WhiteImplicitReverseFkRefCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, entityType, new InternalSelectEntityCallback<ENTITY, WhiteImplicitReverseFkRefCB>() {
            public List<ENTITY> callbackSelectList(WhiteImplicitReverseFkRefCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * WhiteImplicitReverseFkRefCB cb = new WhiteImplicitReverseFkRefCB();
     * cb.query().setFoo...(value);
     * WhiteImplicitReverseFkRef whiteImplicitReverseFkRef = whiteImplicitReverseFkRefBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteImplicitReverseFkRef.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteImplicitReverseFkRef. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteImplicitReverseFkRef selectEntityWithDeletedCheck(WhiteImplicitReverseFkRefCB cb) {
        return doSelectEntityWithDeletedCheck(cb, WhiteImplicitReverseFkRef.class);
    }

    protected <ENTITY extends WhiteImplicitReverseFkRef> ENTITY doSelectEntityWithDeletedCheck(final WhiteImplicitReverseFkRefCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, entityType, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteImplicitReverseFkRefCB>() {
            public List<ENTITY> callbackSelectList(WhiteImplicitReverseFkRefCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param whiteImplicitReverseFkRefId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteImplicitReverseFkRef selectByPKValue(Integer whiteImplicitReverseFkRefId) {
        return doSelectByPKValue(whiteImplicitReverseFkRefId, WhiteImplicitReverseFkRef.class);
    }

    protected <ENTITY extends WhiteImplicitReverseFkRef> ENTITY doSelectByPKValue(Integer whiteImplicitReverseFkRefId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(whiteImplicitReverseFkRefId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param whiteImplicitReverseFkRefId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteImplicitReverseFkRef selectByPKValueWithDeletedCheck(Integer whiteImplicitReverseFkRefId) {
        return doSelectByPKValueWithDeletedCheck(whiteImplicitReverseFkRefId, WhiteImplicitReverseFkRef.class);
    }

    protected <ENTITY extends WhiteImplicitReverseFkRef> ENTITY doSelectByPKValueWithDeletedCheck(Integer whiteImplicitReverseFkRefId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(whiteImplicitReverseFkRefId), entityType);
    }

    private WhiteImplicitReverseFkRefCB buildPKCB(Integer whiteImplicitReverseFkRefId) {
        assertObjectNotNull("whiteImplicitReverseFkRefId", whiteImplicitReverseFkRefId);
        WhiteImplicitReverseFkRefCB cb = newMyConditionBean();
        cb.query().setWhiteImplicitReverseFkRefId_Equal(whiteImplicitReverseFkRefId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteImplicitReverseFkRefCB cb = new WhiteImplicitReverseFkRefCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteImplicitReverseFkRef&gt; whiteImplicitReverseFkRefList = whiteImplicitReverseFkRefBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (WhiteImplicitReverseFkRef whiteImplicitReverseFkRef : whiteImplicitReverseFkRefList) {
     *     ... = whiteImplicitReverseFkRef.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteImplicitReverseFkRef. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteImplicitReverseFkRef> selectList(WhiteImplicitReverseFkRefCB cb) {
        return doSelectList(cb, WhiteImplicitReverseFkRef.class);
    }

    protected <ENTITY extends WhiteImplicitReverseFkRef> ListResultBean<ENTITY> doSelectList(WhiteImplicitReverseFkRefCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, WhiteImplicitReverseFkRefCB>() {
            public List<ENTITY> callbackSelectList(WhiteImplicitReverseFkRefCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * WhiteImplicitReverseFkRefCB cb = new WhiteImplicitReverseFkRefCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteImplicitReverseFkRef&gt; page = whiteImplicitReverseFkRefBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteImplicitReverseFkRef whiteImplicitReverseFkRef : page) {
     *     ... = whiteImplicitReverseFkRef.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteImplicitReverseFkRef. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteImplicitReverseFkRef> selectPage(WhiteImplicitReverseFkRefCB cb) {
        return doSelectPage(cb, WhiteImplicitReverseFkRef.class);
    }

    protected <ENTITY extends WhiteImplicitReverseFkRef> PagingResultBean<ENTITY> doSelectPage(WhiteImplicitReverseFkRefCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, WhiteImplicitReverseFkRefCB>() {
            public int callbackSelectCount(WhiteImplicitReverseFkRefCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteImplicitReverseFkRefCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * WhiteImplicitReverseFkRefCB cb = new WhiteImplicitReverseFkRefCB();
     * cb.query().setFoo...(value);
     * whiteImplicitReverseFkRefBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteImplicitReverseFkRef&gt;() {
     *     public void handle(WhiteImplicitReverseFkRef entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteImplicitReverseFkRef. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteImplicitReverseFkRef. (NotNull)
     */
    public void selectCursor(WhiteImplicitReverseFkRefCB cb, EntityRowHandler<WhiteImplicitReverseFkRef> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, WhiteImplicitReverseFkRef.class);
    }

    protected <ENTITY extends WhiteImplicitReverseFkRef> void doSelectCursor(WhiteImplicitReverseFkRefCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<WhiteImplicitReverseFkRef>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        helpSelectCursorInternally(cb, entityRowHandler, entityType, new InternalSelectCursorCallback<ENTITY, WhiteImplicitReverseFkRefCB>() {
            public void callbackSelectCursor(WhiteImplicitReverseFkRefCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) { delegateSelectCursor(cb, entityRowHandler, entityType); }
            public List<ENTITY> callbackSelectList(WhiteImplicitReverseFkRefCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteImplicitReverseFkRefBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteImplicitReverseFkRefCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (NullAllowed)
     */
    public <RESULT> SLFunction<WhiteImplicitReverseFkRefCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends WhiteImplicitReverseFkRefCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
        assertObjectNotNull("resultType", resultType); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return new SLFunction<CB, RESULT>(cb, resultType);
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
     * Pull out the list of foreign table 'WhiteImplicitReverseFk'.
     * @param whiteImplicitReverseFkRefList The list of whiteImplicitReverseFkRef. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteImplicitReverseFk> pulloutWhiteImplicitReverseFk(List<WhiteImplicitReverseFkRef> whiteImplicitReverseFkRefList) {
        return helpPulloutInternally(whiteImplicitReverseFkRefList, new InternalPulloutCallback<WhiteImplicitReverseFkRef, WhiteImplicitReverseFk>() {
            public WhiteImplicitReverseFk getFr(WhiteImplicitReverseFkRef e) { return e.getWhiteImplicitReverseFk(); }
            public boolean hasRf() { return true; }
            public void setRfLs(WhiteImplicitReverseFk e, List<WhiteImplicitReverseFkRef> ls)
            { e.setWhiteImplicitReverseFkRefList(ls); }
        });
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key whiteImplicitReverseFkRefId.
     * @param whiteImplicitReverseFkRefList The list of whiteImplicitReverseFkRef. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractWhiteImplicitReverseFkRefIdList(List<WhiteImplicitReverseFkRef> whiteImplicitReverseFkRefList) {
        return helpExtractListInternally(whiteImplicitReverseFkRefList, new InternalExtractCallback<WhiteImplicitReverseFkRef, Integer>() {
            public Integer getCV(WhiteImplicitReverseFkRef e) { return e.getWhiteImplicitReverseFkRefId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteImplicitReverseFkRef whiteImplicitReverseFkRef = new WhiteImplicitReverseFkRef();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteImplicitReverseFkRef.setFoo...(value);
     * whiteImplicitReverseFkRef.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteImplicitReverseFkRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteImplicitReverseFkRef.set...;</span>
     * whiteImplicitReverseFkRefBhv.<span style="color: #FD4747">insert</span>(whiteImplicitReverseFkRef);
     * ... = whiteImplicitReverseFkRef.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteImplicitReverseFkRef The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteImplicitReverseFkRef whiteImplicitReverseFkRef) {
        doInsert(whiteImplicitReverseFkRef, null);
    }

    protected void doInsert(WhiteImplicitReverseFkRef whiteImplicitReverseFkRef, InsertOption<WhiteImplicitReverseFkRefCB> option) {
        assertObjectNotNull("whiteImplicitReverseFkRef", whiteImplicitReverseFkRef);
        prepareInsertOption(option);
        delegateInsert(whiteImplicitReverseFkRef, option);
    }

    protected void prepareInsertOption(InsertOption<WhiteImplicitReverseFkRefCB> option) {
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
     * WhiteImplicitReverseFkRef whiteImplicitReverseFkRef = new WhiteImplicitReverseFkRef();
     * whiteImplicitReverseFkRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteImplicitReverseFkRef.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteImplicitReverseFkRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteImplicitReverseFkRef.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteImplicitReverseFkRef.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteImplicitReverseFkRefBhv.<span style="color: #FD4747">update</span>(whiteImplicitReverseFkRef);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param whiteImplicitReverseFkRef The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final WhiteImplicitReverseFkRef whiteImplicitReverseFkRef) {
        doUpdate(whiteImplicitReverseFkRef, null);
    }

    protected void doUpdate(WhiteImplicitReverseFkRef whiteImplicitReverseFkRef, final UpdateOption<WhiteImplicitReverseFkRefCB> option) {
        assertObjectNotNull("whiteImplicitReverseFkRef", whiteImplicitReverseFkRef);
        prepareUpdateOption(option);
        helpUpdateInternally(whiteImplicitReverseFkRef, new InternalUpdateCallback<WhiteImplicitReverseFkRef>() {
            public int callbackDelegateUpdate(WhiteImplicitReverseFkRef entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhiteImplicitReverseFkRefCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected WhiteImplicitReverseFkRefCB createCBForVaryingUpdate() {
        WhiteImplicitReverseFkRefCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected WhiteImplicitReverseFkRefCB createCBForSpecifiedUpdate() {
        WhiteImplicitReverseFkRefCB cb = newMyConditionBean();
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
     * @param whiteImplicitReverseFkRef The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteImplicitReverseFkRef whiteImplicitReverseFkRef) {
        doInesrtOrUpdate(whiteImplicitReverseFkRef, null, null);
    }

    protected void doInesrtOrUpdate(WhiteImplicitReverseFkRef whiteImplicitReverseFkRef, final InsertOption<WhiteImplicitReverseFkRefCB> insertOption, final UpdateOption<WhiteImplicitReverseFkRefCB> updateOption) {
        helpInsertOrUpdateInternally(whiteImplicitReverseFkRef, new InternalInsertOrUpdateCallback<WhiteImplicitReverseFkRef, WhiteImplicitReverseFkRefCB>() {
            public void callbackInsert(WhiteImplicitReverseFkRef entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(WhiteImplicitReverseFkRef entity) { doUpdate(entity, updateOption); }
            public WhiteImplicitReverseFkRefCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(WhiteImplicitReverseFkRefCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<WhiteImplicitReverseFkRefCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<WhiteImplicitReverseFkRefCB>() : updateOption;
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
     * WhiteImplicitReverseFkRef whiteImplicitReverseFkRef = new WhiteImplicitReverseFkRef();
     * whiteImplicitReverseFkRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteImplicitReverseFkRef.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteImplicitReverseFkRefBhv.<span style="color: #FD4747">delete</span>(whiteImplicitReverseFkRef);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param whiteImplicitReverseFkRef The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteImplicitReverseFkRef whiteImplicitReverseFkRef) {
        doDelete(whiteImplicitReverseFkRef, null);
    }

    protected void doDelete(WhiteImplicitReverseFkRef whiteImplicitReverseFkRef, final DeleteOption<WhiteImplicitReverseFkRefCB> option) {
        assertObjectNotNull("whiteImplicitReverseFkRef", whiteImplicitReverseFkRef);
        prepareDeleteOption(option);
        helpDeleteInternally(whiteImplicitReverseFkRef, new InternalDeleteCallback<WhiteImplicitReverseFkRef>() {
            public int callbackDelegateDelete(WhiteImplicitReverseFkRef entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhiteImplicitReverseFkRefCB> option) {
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
     *     WhiteImplicitReverseFkRef whiteImplicitReverseFkRef = new WhiteImplicitReverseFkRef();
     *     whiteImplicitReverseFkRef.setFooName("foo");
     *     if (...) {
     *         whiteImplicitReverseFkRef.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteImplicitReverseFkRefList.add(whiteImplicitReverseFkRef);
     * }
     * whiteImplicitReverseFkRefBhv.<span style="color: #FD4747">batchInsert</span>(whiteImplicitReverseFkRefList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteImplicitReverseFkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteImplicitReverseFkRef> whiteImplicitReverseFkRefList) {
        InsertOption<WhiteImplicitReverseFkRefCB> option = createInsertUpdateOption();
        return doBatchInsert(whiteImplicitReverseFkRefList, option);
    }

    protected int[] doBatchInsert(List<WhiteImplicitReverseFkRef> whiteImplicitReverseFkRefList, InsertOption<WhiteImplicitReverseFkRefCB> option) {
        assertObjectNotNull("whiteImplicitReverseFkRefList", whiteImplicitReverseFkRefList);
        prepareBatchInsertOption(whiteImplicitReverseFkRefList, option);
        return delegateBatchInsert(whiteImplicitReverseFkRefList, option);
    }

    protected void prepareBatchInsertOption(List<WhiteImplicitReverseFkRef> whiteImplicitReverseFkRefList, InsertOption<WhiteImplicitReverseFkRefCB> option) {
        option.xallowInsertColumnModifiedPropertiesFragmented();
        option.xacceptInsertColumnModifiedPropertiesIfNeeds(whiteImplicitReverseFkRefList);
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
     *     WhiteImplicitReverseFkRef whiteImplicitReverseFkRef = new WhiteImplicitReverseFkRef();
     *     whiteImplicitReverseFkRef.setFooName("foo");
     *     if (...) {
     *         whiteImplicitReverseFkRef.setFooPrice(123);
     *     } else {
     *         whiteImplicitReverseFkRef.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteImplicitReverseFkRef.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteImplicitReverseFkRefList.add(whiteImplicitReverseFkRef);
     * }
     * whiteImplicitReverseFkRefBhv.<span style="color: #FD4747">batchUpdate</span>(whiteImplicitReverseFkRefList);
     * </pre>
     * @param whiteImplicitReverseFkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteImplicitReverseFkRef> whiteImplicitReverseFkRefList) {
        UpdateOption<WhiteImplicitReverseFkRefCB> option = createPlainUpdateOption();
        return doBatchUpdate(whiteImplicitReverseFkRefList, option);
    }

    protected int[] doBatchUpdate(List<WhiteImplicitReverseFkRef> whiteImplicitReverseFkRefList, UpdateOption<WhiteImplicitReverseFkRefCB> option) {
        assertObjectNotNull("whiteImplicitReverseFkRefList", whiteImplicitReverseFkRefList);
        prepareBatchUpdateOption(whiteImplicitReverseFkRefList, option);
        return delegateBatchUpdate(whiteImplicitReverseFkRefList, option);
    }

    protected void prepareBatchUpdateOption(List<WhiteImplicitReverseFkRef> whiteImplicitReverseFkRefList, UpdateOption<WhiteImplicitReverseFkRefCB> option) {
        option.xacceptUpdateColumnModifiedPropertiesIfNeeds(whiteImplicitReverseFkRefList);
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
     * whiteImplicitReverseFkRefBhv.<span style="color: #FD4747">batchUpdate</span>(whiteImplicitReverseFkRefList, new SpecifyQuery<WhiteImplicitReverseFkRefCB>() {
     *     public void specify(WhiteImplicitReverseFkRefCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span> 
     * whiteImplicitReverseFkRefBhv.<span style="color: #FD4747">batchUpdate</span>(whiteImplicitReverseFkRefList, new SpecifyQuery<WhiteImplicitReverseFkRefCB>() {
     *     public void specify(WhiteImplicitReverseFkRefCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteImplicitReverseFkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteImplicitReverseFkRef> whiteImplicitReverseFkRefList, SpecifyQuery<WhiteImplicitReverseFkRefCB> updateColumnSpec) {
        return doBatchUpdate(whiteImplicitReverseFkRefList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        return doLumpModify(ls, option);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteImplicitReverseFkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteImplicitReverseFkRef> whiteImplicitReverseFkRefList) {
        return doBatchDelete(whiteImplicitReverseFkRefList, null);
    }

    protected int[] doBatchDelete(List<WhiteImplicitReverseFkRef> whiteImplicitReverseFkRefList, DeleteOption<WhiteImplicitReverseFkRefCB> option) {
        assertObjectNotNull("whiteImplicitReverseFkRefList", whiteImplicitReverseFkRefList);
        prepareDeleteOption(option);
        return delegateBatchDelete(whiteImplicitReverseFkRefList, option);
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
     * whiteImplicitReverseFkRefBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteImplicitReverseFkRef, WhiteImplicitReverseFkRefCB&gt;() {
     *     public ConditionBean setup(whiteImplicitReverseFkRef entity, WhiteImplicitReverseFkRefCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteImplicitReverseFkRef, WhiteImplicitReverseFkRefCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteImplicitReverseFkRef, WhiteImplicitReverseFkRefCB> setupper, InsertOption<WhiteImplicitReverseFkRefCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        WhiteImplicitReverseFkRef entity = new WhiteImplicitReverseFkRef();
        WhiteImplicitReverseFkRefCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected WhiteImplicitReverseFkRefCB createCBForQueryInsert() {
        WhiteImplicitReverseFkRefCB cb = newMyConditionBean();
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
     * WhiteImplicitReverseFkRef whiteImplicitReverseFkRef = new WhiteImplicitReverseFkRef();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteImplicitReverseFkRef.setPK...(value);</span>
     * whiteImplicitReverseFkRef.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteImplicitReverseFkRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteImplicitReverseFkRef.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteImplicitReverseFkRef.setVersionNo(value);</span>
     * WhiteImplicitReverseFkRefCB cb = new WhiteImplicitReverseFkRefCB();
     * cb.query().setFoo...(value);
     * whiteImplicitReverseFkRefBhv.<span style="color: #FD4747">queryUpdate</span>(whiteImplicitReverseFkRef, cb);
     * </pre>
     * @param whiteImplicitReverseFkRef The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteImplicitReverseFkRef. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteImplicitReverseFkRef whiteImplicitReverseFkRef, WhiteImplicitReverseFkRefCB cb) {
        return doQueryUpdate(whiteImplicitReverseFkRef, cb, null);
    }

    protected int doQueryUpdate(WhiteImplicitReverseFkRef whiteImplicitReverseFkRef, WhiteImplicitReverseFkRefCB cb, UpdateOption<WhiteImplicitReverseFkRefCB> option) {
        assertObjectNotNull("whiteImplicitReverseFkRef", whiteImplicitReverseFkRef); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(whiteImplicitReverseFkRef, cb, option) : 0;
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (WhiteImplicitReverseFkRefCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (WhiteImplicitReverseFkRefCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteImplicitReverseFkRefCB cb = new WhiteImplicitReverseFkRefCB();
     * cb.query().setFoo...(value);
     * whiteImplicitReverseFkRefBhv.<span style="color: #FD4747">queryDelete</span>(whiteImplicitReverseFkRef, cb);
     * </pre>
     * @param cb The condition-bean of WhiteImplicitReverseFkRef. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteImplicitReverseFkRefCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteImplicitReverseFkRefCB cb, DeleteOption<WhiteImplicitReverseFkRefCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, option) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((WhiteImplicitReverseFkRefCB)cb); }
        else { return varyingQueryDelete((WhiteImplicitReverseFkRefCB)cb, downcast(option)); }
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
     * WhiteImplicitReverseFkRef whiteImplicitReverseFkRef = new WhiteImplicitReverseFkRef();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteImplicitReverseFkRef.setFoo...(value);
     * whiteImplicitReverseFkRef.setBar...(value);
     * InsertOption<WhiteImplicitReverseFkRefCB> option = new InsertOption<WhiteImplicitReverseFkRefCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteImplicitReverseFkRefBhv.<span style="color: #FD4747">varyingInsert</span>(whiteImplicitReverseFkRef, option);
     * ... = whiteImplicitReverseFkRef.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteImplicitReverseFkRef The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteImplicitReverseFkRef whiteImplicitReverseFkRef, InsertOption<WhiteImplicitReverseFkRefCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteImplicitReverseFkRef, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteImplicitReverseFkRef whiteImplicitReverseFkRef = new WhiteImplicitReverseFkRef();
     * whiteImplicitReverseFkRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteImplicitReverseFkRef.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteImplicitReverseFkRef.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteImplicitReverseFkRefCB&gt; option = new UpdateOption&lt;WhiteImplicitReverseFkRefCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteImplicitReverseFkRefCB&gt;() {
     *         public void specify(WhiteImplicitReverseFkRefCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteImplicitReverseFkRefBhv.<span style="color: #FD4747">varyingUpdate</span>(whiteImplicitReverseFkRef, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteImplicitReverseFkRef The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteImplicitReverseFkRef whiteImplicitReverseFkRef, UpdateOption<WhiteImplicitReverseFkRefCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteImplicitReverseFkRef, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteImplicitReverseFkRef The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteImplicitReverseFkRef whiteImplicitReverseFkRef, InsertOption<WhiteImplicitReverseFkRefCB> insertOption, UpdateOption<WhiteImplicitReverseFkRefCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(whiteImplicitReverseFkRef, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteImplicitReverseFkRef The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteImplicitReverseFkRef whiteImplicitReverseFkRef, DeleteOption<WhiteImplicitReverseFkRefCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteImplicitReverseFkRef, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteImplicitReverseFkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteImplicitReverseFkRef> whiteImplicitReverseFkRefList, InsertOption<WhiteImplicitReverseFkRefCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteImplicitReverseFkRefList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteImplicitReverseFkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteImplicitReverseFkRef> whiteImplicitReverseFkRefList, UpdateOption<WhiteImplicitReverseFkRefCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteImplicitReverseFkRefList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteImplicitReverseFkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteImplicitReverseFkRef> whiteImplicitReverseFkRefList, DeleteOption<WhiteImplicitReverseFkRefCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteImplicitReverseFkRefList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteImplicitReverseFkRef, WhiteImplicitReverseFkRefCB> setupper, InsertOption<WhiteImplicitReverseFkRefCB> option) {
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
     * WhiteImplicitReverseFkRef whiteImplicitReverseFkRef = new WhiteImplicitReverseFkRef();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteImplicitReverseFkRef.setPK...(value);</span>
     * whiteImplicitReverseFkRef.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteImplicitReverseFkRef.setVersionNo(value);</span>
     * WhiteImplicitReverseFkRefCB cb = new WhiteImplicitReverseFkRefCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteImplicitReverseFkRefCB&gt; option = new UpdateOption&lt;WhiteImplicitReverseFkRefCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteImplicitReverseFkRefCB&gt;() {
     *     public void specify(WhiteImplicitReverseFkRefCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteImplicitReverseFkRefBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(whiteImplicitReverseFkRef, cb, option);
     * </pre>
     * @param whiteImplicitReverseFkRef The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteImplicitReverseFkRef. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteImplicitReverseFkRef whiteImplicitReverseFkRef, WhiteImplicitReverseFkRefCB cb, UpdateOption<WhiteImplicitReverseFkRefCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteImplicitReverseFkRef, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteImplicitReverseFkRef. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteImplicitReverseFkRefCB cb, DeleteOption<WhiteImplicitReverseFkRefCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteImplicitReverseFkRefBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhiteImplicitReverseFkRefCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhiteImplicitReverseFkRefCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhiteImplicitReverseFkRef> void delegateSelectCursor(WhiteImplicitReverseFkRefCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends WhiteImplicitReverseFkRef> List<ENTITY> delegateSelectList(WhiteImplicitReverseFkRefCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhiteImplicitReverseFkRef e, InsertOption<WhiteImplicitReverseFkRefCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(WhiteImplicitReverseFkRef e, UpdateOption<WhiteImplicitReverseFkRefCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return delegateUpdateNonstrict(e, op); }
    protected int delegateUpdateNonstrict(WhiteImplicitReverseFkRef e, UpdateOption<WhiteImplicitReverseFkRefCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(WhiteImplicitReverseFkRef e, DeleteOption<WhiteImplicitReverseFkRefCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return delegateDeleteNonstrict(e, op); }
    protected int delegateDeleteNonstrict(WhiteImplicitReverseFkRef e, DeleteOption<WhiteImplicitReverseFkRefCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<WhiteImplicitReverseFkRef> ls, InsertOption<WhiteImplicitReverseFkRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhiteImplicitReverseFkRef> ls, UpdateOption<WhiteImplicitReverseFkRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhiteImplicitReverseFkRef> ls, UpdateOption<WhiteImplicitReverseFkRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhiteImplicitReverseFkRef> ls, DeleteOption<WhiteImplicitReverseFkRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhiteImplicitReverseFkRef> ls, DeleteOption<WhiteImplicitReverseFkRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhiteImplicitReverseFkRef e, WhiteImplicitReverseFkRefCB inCB, ConditionBean resCB, InsertOption<WhiteImplicitReverseFkRefCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhiteImplicitReverseFkRef e, WhiteImplicitReverseFkRefCB cb, UpdateOption<WhiteImplicitReverseFkRefCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(WhiteImplicitReverseFkRefCB cb, DeleteOption<WhiteImplicitReverseFkRefCB> op)
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
    protected WhiteImplicitReverseFkRef downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, WhiteImplicitReverseFkRef.class);
    }

    protected WhiteImplicitReverseFkRefCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, WhiteImplicitReverseFkRefCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<WhiteImplicitReverseFkRef> downcast(List<? extends Entity> entityList) {
        return (List<WhiteImplicitReverseFkRef>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteImplicitReverseFkRefCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<WhiteImplicitReverseFkRefCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteImplicitReverseFkRefCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<WhiteImplicitReverseFkRefCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteImplicitReverseFkRefCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<WhiteImplicitReverseFkRefCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteImplicitReverseFkRef, WhiteImplicitReverseFkRefCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<WhiteImplicitReverseFkRef, WhiteImplicitReverseFkRefCB>)option;
    }
}
