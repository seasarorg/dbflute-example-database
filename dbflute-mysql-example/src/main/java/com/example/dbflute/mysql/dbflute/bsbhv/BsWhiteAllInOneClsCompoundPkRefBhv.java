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
     * int count = whiteAllInOneClsCompoundPkRefBhv.<span style="color: #FD4747">selectCount</span>(cb);
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
     * Select the entity by the condition-bean.
     * <pre>
     * WhiteAllInOneClsCompoundPkRefCB cb = new WhiteAllInOneClsCompoundPkRefCB();
     * cb.query().setFoo...(value);
     * WhiteAllInOneClsCompoundPkRef whiteAllInOneClsCompoundPkRef = whiteAllInOneClsCompoundPkRefBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (whiteAllInOneClsCompoundPkRef != null) {
     *     ... = whiteAllInOneClsCompoundPkRef.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteAllInOneClsCompoundPkRef. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteAllInOneClsCompoundPkRef selectEntity(WhiteAllInOneClsCompoundPkRefCB cb) {
        return doSelectEntity(cb, WhiteAllInOneClsCompoundPkRef.class);
    }

    protected <ENTITY extends WhiteAllInOneClsCompoundPkRef> ENTITY doSelectEntity(final WhiteAllInOneClsCompoundPkRefCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, entityType, new InternalSelectEntityCallback<ENTITY, WhiteAllInOneClsCompoundPkRefCB>() {
            public List<ENTITY> callbackSelectList(WhiteAllInOneClsCompoundPkRefCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * WhiteAllInOneClsCompoundPkRefCB cb = new WhiteAllInOneClsCompoundPkRefCB();
     * cb.query().setFoo...(value);
     * WhiteAllInOneClsCompoundPkRef whiteAllInOneClsCompoundPkRef = whiteAllInOneClsCompoundPkRefBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteAllInOneClsCompoundPkRef.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteAllInOneClsCompoundPkRef. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteAllInOneClsCompoundPkRef selectEntityWithDeletedCheck(WhiteAllInOneClsCompoundPkRefCB cb) {
        return doSelectEntityWithDeletedCheck(cb, WhiteAllInOneClsCompoundPkRef.class);
    }

    protected <ENTITY extends WhiteAllInOneClsCompoundPkRef> ENTITY doSelectEntityWithDeletedCheck(final WhiteAllInOneClsCompoundPkRefCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, entityType, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteAllInOneClsCompoundPkRefCB>() {
            public List<ENTITY> callbackSelectList(WhiteAllInOneClsCompoundPkRefCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
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
    public WhiteAllInOneClsCompoundPkRef selectByPKValue(String fooCode, String barCode, String quxCode) {
        return doSelectByPKValue(fooCode, barCode, quxCode, WhiteAllInOneClsCompoundPkRef.class);
    }

    protected <ENTITY extends WhiteAllInOneClsCompoundPkRef> ENTITY doSelectByPKValue(String fooCode, String barCode, String quxCode, Class<ENTITY> entityType) {
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
    public WhiteAllInOneClsCompoundPkRef selectByPKValueWithDeletedCheck(String fooCode, String barCode, String quxCode) {
        return doSelectByPKValueWithDeletedCheck(fooCode, barCode, quxCode, WhiteAllInOneClsCompoundPkRef.class);
    }

    protected <ENTITY extends WhiteAllInOneClsCompoundPkRef> ENTITY doSelectByPKValueWithDeletedCheck(String fooCode, String barCode, String quxCode, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(fooCode, barCode, quxCode), entityType);
    }

    private WhiteAllInOneClsCompoundPkRefCB buildPKCB(String fooCode, String barCode, String quxCode) {
        assertObjectNotNull("fooCode", fooCode);assertObjectNotNull("barCode", barCode);assertObjectNotNull("quxCode", quxCode);
        WhiteAllInOneClsCompoundPkRefCB cb = newMyConditionBean();
        cb.query().setFooCode_Equal(fooCode);cb.query().setBarCode_Equal(barCode);cb.query().setQuxCode_Equal(quxCode);
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
     * ListResultBean&lt;WhiteAllInOneClsCompoundPkRef&gt; whiteAllInOneClsCompoundPkRefList = whiteAllInOneClsCompoundPkRefBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (WhiteAllInOneClsCompoundPkRef whiteAllInOneClsCompoundPkRef : whiteAllInOneClsCompoundPkRefList) {
     *     ... = whiteAllInOneClsCompoundPkRef.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteAllInOneClsCompoundPkRef. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteAllInOneClsCompoundPkRef> selectList(WhiteAllInOneClsCompoundPkRefCB cb) {
        return doSelectList(cb, WhiteAllInOneClsCompoundPkRef.class);
    }

    protected <ENTITY extends WhiteAllInOneClsCompoundPkRef> ListResultBean<ENTITY> doSelectList(WhiteAllInOneClsCompoundPkRefCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, WhiteAllInOneClsCompoundPkRefCB>() {
            public List<ENTITY> callbackSelectList(WhiteAllInOneClsCompoundPkRefCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteAllInOneClsCompoundPkRef&gt; page = whiteAllInOneClsCompoundPkRefBhv.<span style="color: #FD4747">selectPage</span>(cb);
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
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteAllInOneClsCompoundPkRef> selectPage(WhiteAllInOneClsCompoundPkRefCB cb) {
        return doSelectPage(cb, WhiteAllInOneClsCompoundPkRef.class);
    }

    protected <ENTITY extends WhiteAllInOneClsCompoundPkRef> PagingResultBean<ENTITY> doSelectPage(WhiteAllInOneClsCompoundPkRefCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, WhiteAllInOneClsCompoundPkRefCB>() {
            public int callbackSelectCount(WhiteAllInOneClsCompoundPkRefCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteAllInOneClsCompoundPkRefCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * whiteAllInOneClsCompoundPkRefBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteAllInOneClsCompoundPkRef&gt;() {
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

    protected <ENTITY extends WhiteAllInOneClsCompoundPkRef> void doSelectCursor(WhiteAllInOneClsCompoundPkRefCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<WhiteAllInOneClsCompoundPkRef>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        helpSelectCursorInternally(cb, entityRowHandler, entityType, new InternalSelectCursorCallback<ENTITY, WhiteAllInOneClsCompoundPkRefCB>() {
            public void callbackSelectCursor(WhiteAllInOneClsCompoundPkRefCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) { delegateSelectCursor(cb, entityRowHandler, entityType); }
            public List<ENTITY> callbackSelectList(WhiteAllInOneClsCompoundPkRefCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteAllInOneClsCompoundPkRefBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteAllInOneClsCompoundPkRefCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (NullAllowed)
     */
    public <RESULT> SLFunction<WhiteAllInOneClsCompoundPkRefCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends WhiteAllInOneClsCompoundPkRefCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
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
     * Pull out the list of foreign table 'WhiteAllInOneClsElement'.
     * @param whiteAllInOneClsCompoundPkRefList The list of whiteAllInOneClsCompoundPkRef. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteAllInOneClsElement> pulloutWhiteAllInOneClsElementAsFoo(List<WhiteAllInOneClsCompoundPkRef> whiteAllInOneClsCompoundPkRefList) {
        return helpPulloutInternally(whiteAllInOneClsCompoundPkRefList, new InternalPulloutCallback<WhiteAllInOneClsCompoundPkRef, WhiteAllInOneClsElement>() {
            public WhiteAllInOneClsElement getFr(WhiteAllInOneClsCompoundPkRef e) { return e.getWhiteAllInOneClsElementAsFoo(); }
            public boolean hasRf() { return false; }
            public void setRfLs(WhiteAllInOneClsElement e, List<WhiteAllInOneClsCompoundPkRef> ls)
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
            public WhiteAllInOneClsElement getFr(WhiteAllInOneClsCompoundPkRef e) { return e.getWhiteAllInOneClsElementAsBar(); }
            public boolean hasRf() { return false; }
            public void setRfLs(WhiteAllInOneClsElement e, List<WhiteAllInOneClsCompoundPkRef> ls)
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
     * whiteAllInOneClsCompoundPkRefBhv.<span style="color: #FD4747">insert</span>(whiteAllInOneClsCompoundPkRef);
     * ... = whiteAllInOneClsCompoundPkRef.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteAllInOneClsCompoundPkRef The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteAllInOneClsCompoundPkRef whiteAllInOneClsCompoundPkRef) {
        doInsert(whiteAllInOneClsCompoundPkRef, null);
    }

    protected void doInsert(WhiteAllInOneClsCompoundPkRef whiteAllInOneClsCompoundPkRef, InsertOption<WhiteAllInOneClsCompoundPkRefCB> option) {
        assertObjectNotNull("whiteAllInOneClsCompoundPkRef", whiteAllInOneClsCompoundPkRef);
        prepareInsertOption(option);
        delegateInsert(whiteAllInOneClsCompoundPkRef, option);
    }

    protected void prepareInsertOption(InsertOption<WhiteAllInOneClsCompoundPkRefCB> option) {
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
     * WhiteAllInOneClsCompoundPkRef whiteAllInOneClsCompoundPkRef = new WhiteAllInOneClsCompoundPkRef();
     * whiteAllInOneClsCompoundPkRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteAllInOneClsCompoundPkRef.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsCompoundPkRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsCompoundPkRef.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteAllInOneClsCompoundPkRef.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteAllInOneClsCompoundPkRefBhv.<span style="color: #FD4747">update</span>(whiteAllInOneClsCompoundPkRef);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param whiteAllInOneClsCompoundPkRef The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final WhiteAllInOneClsCompoundPkRef whiteAllInOneClsCompoundPkRef) {
        doUpdate(whiteAllInOneClsCompoundPkRef, null);
    }

    protected void doUpdate(WhiteAllInOneClsCompoundPkRef whiteAllInOneClsCompoundPkRef, final UpdateOption<WhiteAllInOneClsCompoundPkRefCB> option) {
        assertObjectNotNull("whiteAllInOneClsCompoundPkRef", whiteAllInOneClsCompoundPkRef);
        prepareUpdateOption(option);
        helpUpdateInternally(whiteAllInOneClsCompoundPkRef, new InternalUpdateCallback<WhiteAllInOneClsCompoundPkRef>() {
            public int callbackDelegateUpdate(WhiteAllInOneClsCompoundPkRef entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhiteAllInOneClsCompoundPkRefCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
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
     * @param whiteAllInOneClsCompoundPkRef The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteAllInOneClsCompoundPkRef whiteAllInOneClsCompoundPkRef) {
        doInesrtOrUpdate(whiteAllInOneClsCompoundPkRef, null, null);
    }

    protected void doInesrtOrUpdate(WhiteAllInOneClsCompoundPkRef whiteAllInOneClsCompoundPkRef, final InsertOption<WhiteAllInOneClsCompoundPkRefCB> insertOption, final UpdateOption<WhiteAllInOneClsCompoundPkRefCB> updateOption) {
        helpInsertOrUpdateInternally(whiteAllInOneClsCompoundPkRef, new InternalInsertOrUpdateCallback<WhiteAllInOneClsCompoundPkRef, WhiteAllInOneClsCompoundPkRefCB>() {
            public void callbackInsert(WhiteAllInOneClsCompoundPkRef entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(WhiteAllInOneClsCompoundPkRef entity) { doUpdate(entity, updateOption); }
            public WhiteAllInOneClsCompoundPkRefCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(WhiteAllInOneClsCompoundPkRefCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<WhiteAllInOneClsCompoundPkRefCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<WhiteAllInOneClsCompoundPkRefCB>() : updateOption;
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
     * WhiteAllInOneClsCompoundPkRef whiteAllInOneClsCompoundPkRef = new WhiteAllInOneClsCompoundPkRef();
     * whiteAllInOneClsCompoundPkRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteAllInOneClsCompoundPkRef.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteAllInOneClsCompoundPkRefBhv.<span style="color: #FD4747">delete</span>(whiteAllInOneClsCompoundPkRef);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param whiteAllInOneClsCompoundPkRef The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteAllInOneClsCompoundPkRef whiteAllInOneClsCompoundPkRef) {
        doDelete(whiteAllInOneClsCompoundPkRef, null);
    }

    protected void doDelete(WhiteAllInOneClsCompoundPkRef whiteAllInOneClsCompoundPkRef, final DeleteOption<WhiteAllInOneClsCompoundPkRefCB> option) {
        assertObjectNotNull("whiteAllInOneClsCompoundPkRef", whiteAllInOneClsCompoundPkRef);
        prepareDeleteOption(option);
        helpDeleteInternally(whiteAllInOneClsCompoundPkRef, new InternalDeleteCallback<WhiteAllInOneClsCompoundPkRef>() {
            public int callbackDelegateDelete(WhiteAllInOneClsCompoundPkRef entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhiteAllInOneClsCompoundPkRefCB> option) {
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
     * whiteAllInOneClsCompoundPkRefBhv.<span style="color: #FD4747">batchInsert</span>(whiteAllInOneClsCompoundPkRefList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteAllInOneClsCompoundPkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteAllInOneClsCompoundPkRef> whiteAllInOneClsCompoundPkRefList) {
        InsertOption<WhiteAllInOneClsCompoundPkRefCB> option = createInsertUpdateOption();
        return doBatchInsert(whiteAllInOneClsCompoundPkRefList, option);
    }

    protected int[] doBatchInsert(List<WhiteAllInOneClsCompoundPkRef> whiteAllInOneClsCompoundPkRefList, InsertOption<WhiteAllInOneClsCompoundPkRefCB> option) {
        assertObjectNotNull("whiteAllInOneClsCompoundPkRefList", whiteAllInOneClsCompoundPkRefList);
        prepareBatchInsertOption(whiteAllInOneClsCompoundPkRefList, option);
        return delegateBatchInsert(whiteAllInOneClsCompoundPkRefList, option);
    }

    protected void prepareBatchInsertOption(List<WhiteAllInOneClsCompoundPkRef> whiteAllInOneClsCompoundPkRefList, InsertOption<WhiteAllInOneClsCompoundPkRefCB> option) {
        option.xallowInsertColumnModifiedPropertiesFragmented();
        option.xacceptInsertColumnModifiedPropertiesIfNeeds(whiteAllInOneClsCompoundPkRefList);
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
     * whiteAllInOneClsCompoundPkRefBhv.<span style="color: #FD4747">batchUpdate</span>(whiteAllInOneClsCompoundPkRefList);
     * </pre>
     * @param whiteAllInOneClsCompoundPkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteAllInOneClsCompoundPkRef> whiteAllInOneClsCompoundPkRefList) {
        UpdateOption<WhiteAllInOneClsCompoundPkRefCB> option = createPlainUpdateOption();
        return doBatchUpdate(whiteAllInOneClsCompoundPkRefList, option);
    }

    protected int[] doBatchUpdate(List<WhiteAllInOneClsCompoundPkRef> whiteAllInOneClsCompoundPkRefList, UpdateOption<WhiteAllInOneClsCompoundPkRefCB> option) {
        assertObjectNotNull("whiteAllInOneClsCompoundPkRefList", whiteAllInOneClsCompoundPkRefList);
        prepareBatchUpdateOption(whiteAllInOneClsCompoundPkRefList, option);
        return delegateBatchUpdate(whiteAllInOneClsCompoundPkRefList, option);
    }

    protected void prepareBatchUpdateOption(List<WhiteAllInOneClsCompoundPkRef> whiteAllInOneClsCompoundPkRefList, UpdateOption<WhiteAllInOneClsCompoundPkRefCB> option) {
        option.xacceptUpdateColumnModifiedPropertiesIfNeeds(whiteAllInOneClsCompoundPkRefList);
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
     * whiteAllInOneClsCompoundPkRefBhv.<span style="color: #FD4747">batchUpdate</span>(whiteAllInOneClsCompoundPkRefList, new SpecifyQuery<WhiteAllInOneClsCompoundPkRefCB>() {
     *     public void specify(WhiteAllInOneClsCompoundPkRefCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span> 
     * whiteAllInOneClsCompoundPkRefBhv.<span style="color: #FD4747">batchUpdate</span>(whiteAllInOneClsCompoundPkRefList, new SpecifyQuery<WhiteAllInOneClsCompoundPkRefCB>() {
     *     public void specify(WhiteAllInOneClsCompoundPkRefCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
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
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteAllInOneClsCompoundPkRef> whiteAllInOneClsCompoundPkRefList, SpecifyQuery<WhiteAllInOneClsCompoundPkRefCB> updateColumnSpec) {
        return doBatchUpdate(whiteAllInOneClsCompoundPkRefList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        return doLumpModify(ls, option);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteAllInOneClsCompoundPkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteAllInOneClsCompoundPkRef> whiteAllInOneClsCompoundPkRefList) {
        return doBatchDelete(whiteAllInOneClsCompoundPkRefList, null);
    }

    protected int[] doBatchDelete(List<WhiteAllInOneClsCompoundPkRef> whiteAllInOneClsCompoundPkRefList, DeleteOption<WhiteAllInOneClsCompoundPkRefCB> option) {
        assertObjectNotNull("whiteAllInOneClsCompoundPkRefList", whiteAllInOneClsCompoundPkRefList);
        prepareDeleteOption(option);
        return delegateBatchDelete(whiteAllInOneClsCompoundPkRefList, option);
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
     * whiteAllInOneClsCompoundPkRefBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteAllInOneClsCompoundPkRef, WhiteAllInOneClsCompoundPkRefCB&gt;() {
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

    protected int doQueryInsert(QueryInsertSetupper<WhiteAllInOneClsCompoundPkRef, WhiteAllInOneClsCompoundPkRefCB> setupper, InsertOption<WhiteAllInOneClsCompoundPkRefCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        WhiteAllInOneClsCompoundPkRef entity = new WhiteAllInOneClsCompoundPkRef();
        WhiteAllInOneClsCompoundPkRefCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
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
     * whiteAllInOneClsCompoundPkRefBhv.<span style="color: #FD4747">queryUpdate</span>(whiteAllInOneClsCompoundPkRef, cb);
     * </pre>
     * @param whiteAllInOneClsCompoundPkRef The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteAllInOneClsCompoundPkRef. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteAllInOneClsCompoundPkRef whiteAllInOneClsCompoundPkRef, WhiteAllInOneClsCompoundPkRefCB cb) {
        return doQueryUpdate(whiteAllInOneClsCompoundPkRef, cb, null);
    }

    protected int doQueryUpdate(WhiteAllInOneClsCompoundPkRef whiteAllInOneClsCompoundPkRef, WhiteAllInOneClsCompoundPkRefCB cb, UpdateOption<WhiteAllInOneClsCompoundPkRefCB> option) {
        assertObjectNotNull("whiteAllInOneClsCompoundPkRef", whiteAllInOneClsCompoundPkRef); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(whiteAllInOneClsCompoundPkRef, cb, option) : 0;
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (WhiteAllInOneClsCompoundPkRefCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (WhiteAllInOneClsCompoundPkRefCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteAllInOneClsCompoundPkRefCB cb = new WhiteAllInOneClsCompoundPkRefCB();
     * cb.query().setFoo...(value);
     * whiteAllInOneClsCompoundPkRefBhv.<span style="color: #FD4747">queryDelete</span>(whiteAllInOneClsCompoundPkRef, cb);
     * </pre>
     * @param cb The condition-bean of WhiteAllInOneClsCompoundPkRef. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteAllInOneClsCompoundPkRefCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteAllInOneClsCompoundPkRefCB cb, DeleteOption<WhiteAllInOneClsCompoundPkRefCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, option) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((WhiteAllInOneClsCompoundPkRefCB)cb); }
        else { return varyingQueryDelete((WhiteAllInOneClsCompoundPkRefCB)cb, downcast(option)); }
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
     * whiteAllInOneClsCompoundPkRefBhv.<span style="color: #FD4747">varyingInsert</span>(whiteAllInOneClsCompoundPkRef, option);
     * ... = whiteAllInOneClsCompoundPkRef.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteAllInOneClsCompoundPkRef The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
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
     * whiteAllInOneClsCompoundPkRef.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteAllInOneClsCompoundPkRefCB&gt; option = new UpdateOption&lt;WhiteAllInOneClsCompoundPkRefCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteAllInOneClsCompoundPkRefCB&gt;() {
     *         public void specify(WhiteAllInOneClsCompoundPkRefCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteAllInOneClsCompoundPkRefBhv.<span style="color: #FD4747">varyingUpdate</span>(whiteAllInOneClsCompoundPkRef, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteAllInOneClsCompoundPkRef The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
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
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
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
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
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
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteAllInOneClsCompoundPkRefBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(whiteAllInOneClsCompoundPkRef, cb, option);
     * </pre>
     * @param whiteAllInOneClsCompoundPkRef The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteAllInOneClsCompoundPkRef. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
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
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
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
    protected <ENTITY extends WhiteAllInOneClsCompoundPkRef> void delegateSelectCursor(WhiteAllInOneClsCompoundPkRefCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends WhiteAllInOneClsCompoundPkRef> List<ENTITY> delegateSelectList(WhiteAllInOneClsCompoundPkRefCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhiteAllInOneClsCompoundPkRef e, InsertOption<WhiteAllInOneClsCompoundPkRefCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(WhiteAllInOneClsCompoundPkRef e, UpdateOption<WhiteAllInOneClsCompoundPkRefCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return delegateUpdateNonstrict(e, op); }
    protected int delegateUpdateNonstrict(WhiteAllInOneClsCompoundPkRef e, UpdateOption<WhiteAllInOneClsCompoundPkRefCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(WhiteAllInOneClsCompoundPkRef e, DeleteOption<WhiteAllInOneClsCompoundPkRefCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return delegateDeleteNonstrict(e, op); }
    protected int delegateDeleteNonstrict(WhiteAllInOneClsCompoundPkRef e, DeleteOption<WhiteAllInOneClsCompoundPkRefCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

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

    protected int delegateQueryInsert(WhiteAllInOneClsCompoundPkRef e, WhiteAllInOneClsCompoundPkRefCB inCB, ConditionBean resCB, InsertOption<WhiteAllInOneClsCompoundPkRefCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhiteAllInOneClsCompoundPkRef e, WhiteAllInOneClsCompoundPkRefCB cb, UpdateOption<WhiteAllInOneClsCompoundPkRefCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(WhiteAllInOneClsCompoundPkRefCB cb, DeleteOption<WhiteAllInOneClsCompoundPkRefCB> op)
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
    protected WhiteAllInOneClsCompoundPkRef downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, WhiteAllInOneClsCompoundPkRef.class);
    }

    protected WhiteAllInOneClsCompoundPkRefCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, WhiteAllInOneClsCompoundPkRefCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<WhiteAllInOneClsCompoundPkRef> downcast(List<? extends Entity> entityList) {
        return (List<WhiteAllInOneClsCompoundPkRef>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteAllInOneClsCompoundPkRefCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<WhiteAllInOneClsCompoundPkRefCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteAllInOneClsCompoundPkRefCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<WhiteAllInOneClsCompoundPkRefCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteAllInOneClsCompoundPkRefCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<WhiteAllInOneClsCompoundPkRefCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteAllInOneClsCompoundPkRef, WhiteAllInOneClsCompoundPkRefCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<WhiteAllInOneClsCompoundPkRef, WhiteAllInOneClsCompoundPkRefCB>)option;
    }
}
