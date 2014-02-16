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
 * The behavior of WHITE_VARIANT_RELATION_REFERRER as TABLE. <br />
 * <pre>
 * [primary key]
 *     REFERRER_ID
 *
 * [column]
 *     REFERRER_ID, VARIANT_MASTER_ID, MASTER_TYPE_CODE
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
 *     WHITE_VARIANT_RELATION_MASTER_FOO(AsVariant), WHITE_VARIANT_RELATION_MASTER_BAR(AsVariant), WHITE_VARIANT_RELATION_MASTER_QUX(AsVariantByQue), WHITE_VARIANT_RELATION_MASTER_CORGE(AsVariantByQuxType)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     whiteVariantRelationMasterFooAsVariant, whiteVariantRelationMasterBarAsVariant, whiteVariantRelationMasterQuxAsVariantByQue, whiteVariantRelationMasterCorgeAsVariantByQuxType
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteVariantRelationReferrerBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_variant_relation_referrer"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return WhiteVariantRelationReferrerDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteVariantRelationReferrerDbm getMyDBMeta() { return WhiteVariantRelationReferrerDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteVariantRelationReferrer newMyEntity() { return new WhiteVariantRelationReferrer(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteVariantRelationReferrerCB newMyConditionBean() { return new WhiteVariantRelationReferrerCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB();
     * cb.query().setFoo...(value);
     * int count = whiteVariantRelationReferrerBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationReferrer. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteVariantRelationReferrerCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteVariantRelationReferrerCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteVariantRelationReferrerCB cb) { // called by selectPage(cb)
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
     * WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB();
     * cb.query().setFoo...(value);
     * WhiteVariantRelationReferrer whiteVariantRelationReferrer = whiteVariantRelationReferrerBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (whiteVariantRelationReferrer != null) {
     *     ... = whiteVariantRelationReferrer.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationReferrer. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteVariantRelationReferrer selectEntity(WhiteVariantRelationReferrerCB cb) {
        return doSelectEntity(cb, WhiteVariantRelationReferrer.class);
    }

    protected <ENTITY extends WhiteVariantRelationReferrer> ENTITY doSelectEntity(final WhiteVariantRelationReferrerCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, WhiteVariantRelationReferrerCB>() {
            public List<ENTITY> callbackSelectList(WhiteVariantRelationReferrerCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB();
     * cb.query().setFoo...(value);
     * WhiteVariantRelationReferrer whiteVariantRelationReferrer = whiteVariantRelationReferrerBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteVariantRelationReferrer.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationReferrer. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteVariantRelationReferrer selectEntityWithDeletedCheck(WhiteVariantRelationReferrerCB cb) {
        return doSelectEntityWithDeletedCheck(cb, WhiteVariantRelationReferrer.class);
    }

    protected <ENTITY extends WhiteVariantRelationReferrer> ENTITY doSelectEntityWithDeletedCheck(final WhiteVariantRelationReferrerCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteVariantRelationReferrerCB>() {
            public List<ENTITY> callbackSelectList(WhiteVariantRelationReferrerCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param referrerId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteVariantRelationReferrer selectByPKValue(Long referrerId) {
        return doSelectByPKValue(referrerId, WhiteVariantRelationReferrer.class);
    }

    protected <ENTITY extends WhiteVariantRelationReferrer> ENTITY doSelectByPKValue(Long referrerId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(referrerId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param referrerId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteVariantRelationReferrer selectByPKValueWithDeletedCheck(Long referrerId) {
        return doSelectByPKValueWithDeletedCheck(referrerId, WhiteVariantRelationReferrer.class);
    }

    protected <ENTITY extends WhiteVariantRelationReferrer> ENTITY doSelectByPKValueWithDeletedCheck(Long referrerId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(referrerId), entityType);
    }

    private WhiteVariantRelationReferrerCB buildPKCB(Long referrerId) {
        assertObjectNotNull("referrerId", referrerId);
        WhiteVariantRelationReferrerCB cb = newMyConditionBean();
        cb.query().setReferrerId_Equal(referrerId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteVariantRelationReferrer&gt; whiteVariantRelationReferrerList = whiteVariantRelationReferrerBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (WhiteVariantRelationReferrer whiteVariantRelationReferrer : whiteVariantRelationReferrerList) {
     *     ... = whiteVariantRelationReferrer.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationReferrer. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteVariantRelationReferrer> selectList(WhiteVariantRelationReferrerCB cb) {
        return doSelectList(cb, WhiteVariantRelationReferrer.class);
    }

    protected <ENTITY extends WhiteVariantRelationReferrer> ListResultBean<ENTITY> doSelectList(WhiteVariantRelationReferrerCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, WhiteVariantRelationReferrerCB>() {
            public List<ENTITY> callbackSelectList(WhiteVariantRelationReferrerCB cb, Class<ENTITY> tp) { return delegateSelectList(cb, tp); } });
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
     * WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteVariantRelationReferrer&gt; page = whiteVariantRelationReferrerBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteVariantRelationReferrer whiteVariantRelationReferrer : page) {
     *     ... = whiteVariantRelationReferrer.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationReferrer. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteVariantRelationReferrer> selectPage(WhiteVariantRelationReferrerCB cb) {
        return doSelectPage(cb, WhiteVariantRelationReferrer.class);
    }

    protected <ENTITY extends WhiteVariantRelationReferrer> PagingResultBean<ENTITY> doSelectPage(WhiteVariantRelationReferrerCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, WhiteVariantRelationReferrerCB>() {
            public int callbackSelectCount(WhiteVariantRelationReferrerCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteVariantRelationReferrerCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB();
     * cb.query().setFoo...(value);
     * whiteVariantRelationReferrerBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteVariantRelationReferrer&gt;() {
     *     public void handle(WhiteVariantRelationReferrer entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationReferrer. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteVariantRelationReferrer. (NotNull)
     */
    public void selectCursor(WhiteVariantRelationReferrerCB cb, EntityRowHandler<WhiteVariantRelationReferrer> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, WhiteVariantRelationReferrer.class);
    }

    protected <ENTITY extends WhiteVariantRelationReferrer> void doSelectCursor(WhiteVariantRelationReferrerCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, WhiteVariantRelationReferrerCB>() {
            public void callbackSelectCursor(WhiteVariantRelationReferrerCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(WhiteVariantRelationReferrerCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteVariantRelationReferrerBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteVariantRelationReferrerCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<WhiteVariantRelationReferrerCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends WhiteVariantRelationReferrerCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends WhiteVariantRelationReferrerCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
     * Pull out the list of foreign table 'WhiteVariantRelationMasterFoo'.
     * @param whiteVariantRelationReferrerList The list of whiteVariantRelationReferrer. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteVariantRelationMasterFoo> pulloutWhiteVariantRelationMasterFooAsVariant(List<WhiteVariantRelationReferrer> whiteVariantRelationReferrerList) {
        return helpPulloutInternally(whiteVariantRelationReferrerList, new InternalPulloutCallback<WhiteVariantRelationReferrer, WhiteVariantRelationMasterFoo>() {
            public WhiteVariantRelationMasterFoo getFr(WhiteVariantRelationReferrer et) { return et.getWhiteVariantRelationMasterFooAsVariant(); }
            public boolean hasRf() { return true; }
            public void setRfLs(WhiteVariantRelationMasterFoo et, List<WhiteVariantRelationReferrer> ls)
            { et.setWhiteVariantRelationReferrerAsVariantList(ls); }
        });
    }
    /**
     * Pull out the list of foreign table 'WhiteVariantRelationMasterBar'.
     * @param whiteVariantRelationReferrerList The list of whiteVariantRelationReferrer. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteVariantRelationMasterBar> pulloutWhiteVariantRelationMasterBarAsVariant(List<WhiteVariantRelationReferrer> whiteVariantRelationReferrerList) {
        return helpPulloutInternally(whiteVariantRelationReferrerList, new InternalPulloutCallback<WhiteVariantRelationReferrer, WhiteVariantRelationMasterBar>() {
            public WhiteVariantRelationMasterBar getFr(WhiteVariantRelationReferrer et) { return et.getWhiteVariantRelationMasterBarAsVariant(); }
            public boolean hasRf() { return true; }
            public void setRfLs(WhiteVariantRelationMasterBar et, List<WhiteVariantRelationReferrer> ls)
            { et.setWhiteVariantRelationReferrerAsVariantList(ls); }
        });
    }
    /**
     * Pull out the list of foreign table 'WhiteVariantRelationMasterQux'.
     * @param whiteVariantRelationReferrerList The list of whiteVariantRelationReferrer. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteVariantRelationMasterQux> pulloutWhiteVariantRelationMasterQuxAsVariantByQue(List<WhiteVariantRelationReferrer> whiteVariantRelationReferrerList) {
        return helpPulloutInternally(whiteVariantRelationReferrerList, new InternalPulloutCallback<WhiteVariantRelationReferrer, WhiteVariantRelationMasterQux>() {
            public WhiteVariantRelationMasterQux getFr(WhiteVariantRelationReferrer et) { return et.getWhiteVariantRelationMasterQuxAsVariantByQue(); }
            public boolean hasRf() { return false; }
            public void setRfLs(WhiteVariantRelationMasterQux et, List<WhiteVariantRelationReferrer> ls)
            { throw new UnsupportedOperationException(); }
        });
    }
    /**
     * Pull out the list of foreign table 'WhiteVariantRelationMasterCorge'.
     * @param whiteVariantRelationReferrerList The list of whiteVariantRelationReferrer. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteVariantRelationMasterCorge> pulloutWhiteVariantRelationMasterCorgeAsVariantByQuxType(List<WhiteVariantRelationReferrer> whiteVariantRelationReferrerList) {
        return helpPulloutInternally(whiteVariantRelationReferrerList, new InternalPulloutCallback<WhiteVariantRelationReferrer, WhiteVariantRelationMasterCorge>() {
            public WhiteVariantRelationMasterCorge getFr(WhiteVariantRelationReferrer et) { return et.getWhiteVariantRelationMasterCorgeAsVariantByQuxType(); }
            public boolean hasRf() { return false; }
            public void setRfLs(WhiteVariantRelationMasterCorge et, List<WhiteVariantRelationReferrer> ls)
            { throw new UnsupportedOperationException(); }
        });
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key referrerId.
     * @param whiteVariantRelationReferrerList The list of whiteVariantRelationReferrer. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractReferrerIdList(List<WhiteVariantRelationReferrer> whiteVariantRelationReferrerList) {
        return helpExtractListInternally(whiteVariantRelationReferrerList, new InternalExtractCallback<WhiteVariantRelationReferrer, Long>() {
            public Long getCV(WhiteVariantRelationReferrer et) { return et.getReferrerId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteVariantRelationReferrer whiteVariantRelationReferrer = new WhiteVariantRelationReferrer();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteVariantRelationReferrer.setFoo...(value);
     * whiteVariantRelationReferrer.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationReferrer.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationReferrer.set...;</span>
     * whiteVariantRelationReferrerBhv.<span style="color: #FD4747">insert</span>(whiteVariantRelationReferrer);
     * ... = whiteVariantRelationReferrer.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteVariantRelationReferrer The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteVariantRelationReferrer whiteVariantRelationReferrer) {
        doInsert(whiteVariantRelationReferrer, null);
    }

    protected void doInsert(WhiteVariantRelationReferrer whiteVariantRelationReferrer, InsertOption<WhiteVariantRelationReferrerCB> op) {
        assertObjectNotNull("whiteVariantRelationReferrer", whiteVariantRelationReferrer);
        prepareInsertOption(op);
        delegateInsert(whiteVariantRelationReferrer, op);
    }

    protected void prepareInsertOption(InsertOption<WhiteVariantRelationReferrerCB> op) {
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
     * WhiteVariantRelationReferrer whiteVariantRelationReferrer = new WhiteVariantRelationReferrer();
     * whiteVariantRelationReferrer.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteVariantRelationReferrer.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationReferrer.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationReferrer.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteVariantRelationReferrer.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteVariantRelationReferrerBhv.<span style="color: #FD4747">update</span>(whiteVariantRelationReferrer);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteVariantRelationReferrer The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final WhiteVariantRelationReferrer whiteVariantRelationReferrer) {
        doUpdate(whiteVariantRelationReferrer, null);
    }

    protected void doUpdate(WhiteVariantRelationReferrer whiteVariantRelationReferrer, final UpdateOption<WhiteVariantRelationReferrerCB> op) {
        assertObjectNotNull("whiteVariantRelationReferrer", whiteVariantRelationReferrer);
        prepareUpdateOption(op);
        helpUpdateInternally(whiteVariantRelationReferrer, new InternalUpdateCallback<WhiteVariantRelationReferrer>() {
            public int callbackDelegateUpdate(WhiteVariantRelationReferrer et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhiteVariantRelationReferrerCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected WhiteVariantRelationReferrerCB createCBForVaryingUpdate() {
        WhiteVariantRelationReferrerCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected WhiteVariantRelationReferrerCB createCBForSpecifiedUpdate() {
        WhiteVariantRelationReferrerCB cb = newMyConditionBean();
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
     * @param whiteVariantRelationReferrer The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteVariantRelationReferrer whiteVariantRelationReferrer) {
        doInesrtOrUpdate(whiteVariantRelationReferrer, null, null);
    }

    protected void doInesrtOrUpdate(WhiteVariantRelationReferrer whiteVariantRelationReferrer, final InsertOption<WhiteVariantRelationReferrerCB> iop, final UpdateOption<WhiteVariantRelationReferrerCB> uop) {
        helpInsertOrUpdateInternally(whiteVariantRelationReferrer, new InternalInsertOrUpdateCallback<WhiteVariantRelationReferrer, WhiteVariantRelationReferrerCB>() {
            public void callbackInsert(WhiteVariantRelationReferrer et) { doInsert(et, iop); }
            public void callbackUpdate(WhiteVariantRelationReferrer et) { doUpdate(et, uop); }
            public WhiteVariantRelationReferrerCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(WhiteVariantRelationReferrerCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<WhiteVariantRelationReferrerCB>();
            uop = uop != null ? uop : new UpdateOption<WhiteVariantRelationReferrerCB>();
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
     * WhiteVariantRelationReferrer whiteVariantRelationReferrer = new WhiteVariantRelationReferrer();
     * whiteVariantRelationReferrer.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteVariantRelationReferrer.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteVariantRelationReferrerBhv.<span style="color: #FD4747">delete</span>(whiteVariantRelationReferrer);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteVariantRelationReferrer The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteVariantRelationReferrer whiteVariantRelationReferrer) {
        doDelete(whiteVariantRelationReferrer, null);
    }

    protected void doDelete(WhiteVariantRelationReferrer whiteVariantRelationReferrer, final DeleteOption<WhiteVariantRelationReferrerCB> op) {
        assertObjectNotNull("whiteVariantRelationReferrer", whiteVariantRelationReferrer);
        prepareDeleteOption(op);
        helpDeleteInternally(whiteVariantRelationReferrer, new InternalDeleteCallback<WhiteVariantRelationReferrer>() {
            public int callbackDelegateDelete(WhiteVariantRelationReferrer et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhiteVariantRelationReferrerCB> op) {
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
     *     WhiteVariantRelationReferrer whiteVariantRelationReferrer = new WhiteVariantRelationReferrer();
     *     whiteVariantRelationReferrer.setFooName("foo");
     *     if (...) {
     *         whiteVariantRelationReferrer.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteVariantRelationReferrerList.add(whiteVariantRelationReferrer);
     * }
     * whiteVariantRelationReferrerBhv.<span style="color: #FD4747">batchInsert</span>(whiteVariantRelationReferrerList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteVariantRelationReferrerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteVariantRelationReferrer> whiteVariantRelationReferrerList) {
        InsertOption<WhiteVariantRelationReferrerCB> op = createInsertUpdateOption();
        return doBatchInsert(whiteVariantRelationReferrerList, op);
    }

    protected int[] doBatchInsert(List<WhiteVariantRelationReferrer> whiteVariantRelationReferrerList, InsertOption<WhiteVariantRelationReferrerCB> op) {
        assertObjectNotNull("whiteVariantRelationReferrerList", whiteVariantRelationReferrerList);
        prepareBatchInsertOption(whiteVariantRelationReferrerList, op);
        return delegateBatchInsert(whiteVariantRelationReferrerList, op);
    }

    protected void prepareBatchInsertOption(List<WhiteVariantRelationReferrer> whiteVariantRelationReferrerList, InsertOption<WhiteVariantRelationReferrerCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(whiteVariantRelationReferrerList);
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
     *     WhiteVariantRelationReferrer whiteVariantRelationReferrer = new WhiteVariantRelationReferrer();
     *     whiteVariantRelationReferrer.setFooName("foo");
     *     if (...) {
     *         whiteVariantRelationReferrer.setFooPrice(123);
     *     } else {
     *         whiteVariantRelationReferrer.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteVariantRelationReferrer.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteVariantRelationReferrerList.add(whiteVariantRelationReferrer);
     * }
     * whiteVariantRelationReferrerBhv.<span style="color: #FD4747">batchUpdate</span>(whiteVariantRelationReferrerList);
     * </pre>
     * @param whiteVariantRelationReferrerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteVariantRelationReferrer> whiteVariantRelationReferrerList) {
        UpdateOption<WhiteVariantRelationReferrerCB> op = createPlainUpdateOption();
        return doBatchUpdate(whiteVariantRelationReferrerList, op);
    }

    protected int[] doBatchUpdate(List<WhiteVariantRelationReferrer> whiteVariantRelationReferrerList, UpdateOption<WhiteVariantRelationReferrerCB> op) {
        assertObjectNotNull("whiteVariantRelationReferrerList", whiteVariantRelationReferrerList);
        prepareBatchUpdateOption(whiteVariantRelationReferrerList, op);
        return delegateBatchUpdate(whiteVariantRelationReferrerList, op);
    }

    protected void prepareBatchUpdateOption(List<WhiteVariantRelationReferrer> whiteVariantRelationReferrerList, UpdateOption<WhiteVariantRelationReferrerCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(whiteVariantRelationReferrerList);
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
     * whiteVariantRelationReferrerBhv.<span style="color: #FD4747">batchUpdate</span>(whiteVariantRelationReferrerList, new SpecifyQuery<WhiteVariantRelationReferrerCB>() {
     *     public void specify(WhiteVariantRelationReferrerCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteVariantRelationReferrerBhv.<span style="color: #FD4747">batchUpdate</span>(whiteVariantRelationReferrerList, new SpecifyQuery<WhiteVariantRelationReferrerCB>() {
     *     public void specify(WhiteVariantRelationReferrerCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteVariantRelationReferrerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteVariantRelationReferrer> whiteVariantRelationReferrerList, SpecifyQuery<WhiteVariantRelationReferrerCB> updateColumnSpec) {
        return doBatchUpdate(whiteVariantRelationReferrerList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteVariantRelationReferrerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteVariantRelationReferrer> whiteVariantRelationReferrerList) {
        return doBatchDelete(whiteVariantRelationReferrerList, null);
    }

    protected int[] doBatchDelete(List<WhiteVariantRelationReferrer> whiteVariantRelationReferrerList, DeleteOption<WhiteVariantRelationReferrerCB> op) {
        assertObjectNotNull("whiteVariantRelationReferrerList", whiteVariantRelationReferrerList);
        prepareDeleteOption(op);
        return delegateBatchDelete(whiteVariantRelationReferrerList, op);
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
     * whiteVariantRelationReferrerBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteVariantRelationReferrer, WhiteVariantRelationReferrerCB&gt;() {
     *     public ConditionBean setup(whiteVariantRelationReferrer entity, WhiteVariantRelationReferrerCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteVariantRelationReferrer, WhiteVariantRelationReferrerCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteVariantRelationReferrer, WhiteVariantRelationReferrerCB> sp, InsertOption<WhiteVariantRelationReferrerCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        WhiteVariantRelationReferrer e = new WhiteVariantRelationReferrer();
        WhiteVariantRelationReferrerCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected WhiteVariantRelationReferrerCB createCBForQueryInsert() {
        WhiteVariantRelationReferrerCB cb = newMyConditionBean();
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
     * WhiteVariantRelationReferrer whiteVariantRelationReferrer = new WhiteVariantRelationReferrer();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationReferrer.setPK...(value);</span>
     * whiteVariantRelationReferrer.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationReferrer.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationReferrer.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationReferrer.setVersionNo(value);</span>
     * WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB();
     * cb.query().setFoo...(value);
     * whiteVariantRelationReferrerBhv.<span style="color: #FD4747">queryUpdate</span>(whiteVariantRelationReferrer, cb);
     * </pre>
     * @param whiteVariantRelationReferrer The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteVariantRelationReferrer. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteVariantRelationReferrer whiteVariantRelationReferrer, WhiteVariantRelationReferrerCB cb) {
        return doQueryUpdate(whiteVariantRelationReferrer, cb, null);
    }

    protected int doQueryUpdate(WhiteVariantRelationReferrer whiteVariantRelationReferrer, WhiteVariantRelationReferrerCB cb, UpdateOption<WhiteVariantRelationReferrerCB> op) {
        assertObjectNotNull("whiteVariantRelationReferrer", whiteVariantRelationReferrer); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(whiteVariantRelationReferrer, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (WhiteVariantRelationReferrerCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (WhiteVariantRelationReferrerCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB();
     * cb.query().setFoo...(value);
     * whiteVariantRelationReferrerBhv.<span style="color: #FD4747">queryDelete</span>(whiteVariantRelationReferrer, cb);
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationReferrer. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteVariantRelationReferrerCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteVariantRelationReferrerCB cb, DeleteOption<WhiteVariantRelationReferrerCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((WhiteVariantRelationReferrerCB)cb); }
        else { return varyingQueryDelete((WhiteVariantRelationReferrerCB)cb, downcast(op)); }
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
     * WhiteVariantRelationReferrer whiteVariantRelationReferrer = new WhiteVariantRelationReferrer();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteVariantRelationReferrer.setFoo...(value);
     * whiteVariantRelationReferrer.setBar...(value);
     * InsertOption<WhiteVariantRelationReferrerCB> option = new InsertOption<WhiteVariantRelationReferrerCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteVariantRelationReferrerBhv.<span style="color: #FD4747">varyingInsert</span>(whiteVariantRelationReferrer, option);
     * ... = whiteVariantRelationReferrer.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteVariantRelationReferrer The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteVariantRelationReferrer whiteVariantRelationReferrer, InsertOption<WhiteVariantRelationReferrerCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteVariantRelationReferrer, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteVariantRelationReferrer whiteVariantRelationReferrer = new WhiteVariantRelationReferrer();
     * whiteVariantRelationReferrer.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteVariantRelationReferrer.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteVariantRelationReferrer.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteVariantRelationReferrerCB&gt; option = new UpdateOption&lt;WhiteVariantRelationReferrerCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteVariantRelationReferrerCB&gt;() {
     *         public void specify(WhiteVariantRelationReferrerCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteVariantRelationReferrerBhv.<span style="color: #FD4747">varyingUpdate</span>(whiteVariantRelationReferrer, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteVariantRelationReferrer The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteVariantRelationReferrer whiteVariantRelationReferrer, UpdateOption<WhiteVariantRelationReferrerCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteVariantRelationReferrer, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteVariantRelationReferrer The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteVariantRelationReferrer whiteVariantRelationReferrer, InsertOption<WhiteVariantRelationReferrerCB> insertOption, UpdateOption<WhiteVariantRelationReferrerCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(whiteVariantRelationReferrer, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteVariantRelationReferrer The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteVariantRelationReferrer whiteVariantRelationReferrer, DeleteOption<WhiteVariantRelationReferrerCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteVariantRelationReferrer, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteVariantRelationReferrerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteVariantRelationReferrer> whiteVariantRelationReferrerList, InsertOption<WhiteVariantRelationReferrerCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteVariantRelationReferrerList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteVariantRelationReferrerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteVariantRelationReferrer> whiteVariantRelationReferrerList, UpdateOption<WhiteVariantRelationReferrerCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteVariantRelationReferrerList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteVariantRelationReferrerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteVariantRelationReferrer> whiteVariantRelationReferrerList, DeleteOption<WhiteVariantRelationReferrerCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteVariantRelationReferrerList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteVariantRelationReferrer, WhiteVariantRelationReferrerCB> setupper, InsertOption<WhiteVariantRelationReferrerCB> option) {
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
     * WhiteVariantRelationReferrer whiteVariantRelationReferrer = new WhiteVariantRelationReferrer();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationReferrer.setPK...(value);</span>
     * whiteVariantRelationReferrer.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationReferrer.setVersionNo(value);</span>
     * WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteVariantRelationReferrerCB&gt; option = new UpdateOption&lt;WhiteVariantRelationReferrerCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteVariantRelationReferrerCB&gt;() {
     *     public void specify(WhiteVariantRelationReferrerCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteVariantRelationReferrerBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(whiteVariantRelationReferrer, cb, option);
     * </pre>
     * @param whiteVariantRelationReferrer The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteVariantRelationReferrer. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteVariantRelationReferrer whiteVariantRelationReferrer, WhiteVariantRelationReferrerCB cb, UpdateOption<WhiteVariantRelationReferrerCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteVariantRelationReferrer, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteVariantRelationReferrer. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteVariantRelationReferrerCB cb, DeleteOption<WhiteVariantRelationReferrerCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteVariantRelationReferrerBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhiteVariantRelationReferrerCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhiteVariantRelationReferrerCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhiteVariantRelationReferrer> void delegateSelectCursor(WhiteVariantRelationReferrerCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends WhiteVariantRelationReferrer> List<ENTITY> delegateSelectList(WhiteVariantRelationReferrerCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhiteVariantRelationReferrer et, InsertOption<WhiteVariantRelationReferrerCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(WhiteVariantRelationReferrer et, UpdateOption<WhiteVariantRelationReferrerCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(WhiteVariantRelationReferrer et, UpdateOption<WhiteVariantRelationReferrerCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(WhiteVariantRelationReferrer et, DeleteOption<WhiteVariantRelationReferrerCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(WhiteVariantRelationReferrer et, DeleteOption<WhiteVariantRelationReferrerCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<WhiteVariantRelationReferrer> ls, InsertOption<WhiteVariantRelationReferrerCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhiteVariantRelationReferrer> ls, UpdateOption<WhiteVariantRelationReferrerCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhiteVariantRelationReferrer> ls, UpdateOption<WhiteVariantRelationReferrerCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhiteVariantRelationReferrer> ls, DeleteOption<WhiteVariantRelationReferrerCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhiteVariantRelationReferrer> ls, DeleteOption<WhiteVariantRelationReferrerCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhiteVariantRelationReferrer et, WhiteVariantRelationReferrerCB inCB, ConditionBean resCB, InsertOption<WhiteVariantRelationReferrerCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhiteVariantRelationReferrer et, WhiteVariantRelationReferrerCB cb, UpdateOption<WhiteVariantRelationReferrerCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(WhiteVariantRelationReferrerCB cb, DeleteOption<WhiteVariantRelationReferrerCB> op)
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
    protected WhiteVariantRelationReferrer downcast(Entity et) {
        return helpEntityDowncastInternally(et, WhiteVariantRelationReferrer.class);
    }

    protected WhiteVariantRelationReferrerCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, WhiteVariantRelationReferrerCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<WhiteVariantRelationReferrer> downcast(List<? extends Entity> ls) {
        return (List<WhiteVariantRelationReferrer>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteVariantRelationReferrerCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<WhiteVariantRelationReferrerCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteVariantRelationReferrerCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<WhiteVariantRelationReferrerCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteVariantRelationReferrerCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<WhiteVariantRelationReferrerCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteVariantRelationReferrer, WhiteVariantRelationReferrerCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<WhiteVariantRelationReferrer, WhiteVariantRelationReferrerCB>)sp;
    }
}
