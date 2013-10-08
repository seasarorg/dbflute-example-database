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
 * The behavior of WHITE_SELF_REFERENCE as TABLE. <br />
 * <pre>
 * [primary key]
 *     SELF_REFERENCE_ID
 * 
 * [column]
 *     SELF_REFERENCE_ID, SELF_REFERENCE_NAME, PARENT_ID
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
 *     white_self_reference, white_self_reference_ref_one(ByParentId)
 * 
 * [referrer table]
 *     white_self_reference, white_self_reference_ref_one
 * 
 * [foreign property]
 *     whiteSelfReferenceSelf, whiteSelfReferenceRefOneByParentId, whiteSelfReferenceRefOneAsOne
 * 
 * [referrer property]
 *     whiteSelfReferenceSelfList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteSelfReferenceBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_self_reference"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return WhiteSelfReferenceDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteSelfReferenceDbm getMyDBMeta() { return WhiteSelfReferenceDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteSelfReference newMyEntity() { return new WhiteSelfReference(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteSelfReferenceCB newMyConditionBean() { return new WhiteSelfReferenceCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteSelfReferenceCB cb = new WhiteSelfReferenceCB();
     * cb.query().setFoo...(value);
     * int count = whiteSelfReferenceBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteSelfReference. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteSelfReferenceCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteSelfReferenceCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteSelfReferenceCB cb) { // called by selectPage(cb)
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
     * WhiteSelfReferenceCB cb = new WhiteSelfReferenceCB();
     * cb.query().setFoo...(value);
     * WhiteSelfReference whiteSelfReference = whiteSelfReferenceBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (whiteSelfReference != null) {
     *     ... = whiteSelfReference.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSelfReference. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSelfReference selectEntity(WhiteSelfReferenceCB cb) {
        return doSelectEntity(cb, WhiteSelfReference.class);
    }

    protected <ENTITY extends WhiteSelfReference> ENTITY doSelectEntity(final WhiteSelfReferenceCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, entityType, new InternalSelectEntityCallback<ENTITY, WhiteSelfReferenceCB>() {
            public List<ENTITY> callbackSelectList(WhiteSelfReferenceCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * WhiteSelfReferenceCB cb = new WhiteSelfReferenceCB();
     * cb.query().setFoo...(value);
     * WhiteSelfReference whiteSelfReference = whiteSelfReferenceBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteSelfReference.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteSelfReference. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSelfReference selectEntityWithDeletedCheck(WhiteSelfReferenceCB cb) {
        return doSelectEntityWithDeletedCheck(cb, WhiteSelfReference.class);
    }

    protected <ENTITY extends WhiteSelfReference> ENTITY doSelectEntityWithDeletedCheck(final WhiteSelfReferenceCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, entityType, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteSelfReferenceCB>() {
            public List<ENTITY> callbackSelectList(WhiteSelfReferenceCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param selfReferenceId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSelfReference selectByPKValue(Long selfReferenceId) {
        return doSelectByPKValue(selfReferenceId, WhiteSelfReference.class);
    }

    protected <ENTITY extends WhiteSelfReference> ENTITY doSelectByPKValue(Long selfReferenceId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(selfReferenceId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param selfReferenceId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSelfReference selectByPKValueWithDeletedCheck(Long selfReferenceId) {
        return doSelectByPKValueWithDeletedCheck(selfReferenceId, WhiteSelfReference.class);
    }

    protected <ENTITY extends WhiteSelfReference> ENTITY doSelectByPKValueWithDeletedCheck(Long selfReferenceId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(selfReferenceId), entityType);
    }

    private WhiteSelfReferenceCB buildPKCB(Long selfReferenceId) {
        assertObjectNotNull("selfReferenceId", selfReferenceId);
        WhiteSelfReferenceCB cb = newMyConditionBean();
        cb.query().setSelfReferenceId_Equal(selfReferenceId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteSelfReferenceCB cb = new WhiteSelfReferenceCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteSelfReference&gt; whiteSelfReferenceList = whiteSelfReferenceBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (WhiteSelfReference whiteSelfReference : whiteSelfReferenceList) {
     *     ... = whiteSelfReference.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSelfReference. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteSelfReference> selectList(WhiteSelfReferenceCB cb) {
        return doSelectList(cb, WhiteSelfReference.class);
    }

    protected <ENTITY extends WhiteSelfReference> ListResultBean<ENTITY> doSelectList(WhiteSelfReferenceCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, WhiteSelfReferenceCB>() {
            public List<ENTITY> callbackSelectList(WhiteSelfReferenceCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * WhiteSelfReferenceCB cb = new WhiteSelfReferenceCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteSelfReference&gt; page = whiteSelfReferenceBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteSelfReference whiteSelfReference : page) {
     *     ... = whiteSelfReference.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSelfReference. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteSelfReference> selectPage(WhiteSelfReferenceCB cb) {
        return doSelectPage(cb, WhiteSelfReference.class);
    }

    protected <ENTITY extends WhiteSelfReference> PagingResultBean<ENTITY> doSelectPage(WhiteSelfReferenceCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, WhiteSelfReferenceCB>() {
            public int callbackSelectCount(WhiteSelfReferenceCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteSelfReferenceCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * WhiteSelfReferenceCB cb = new WhiteSelfReferenceCB();
     * cb.query().setFoo...(value);
     * whiteSelfReferenceBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteSelfReference&gt;() {
     *     public void handle(WhiteSelfReference entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteSelfReference. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteSelfReference. (NotNull)
     */
    public void selectCursor(WhiteSelfReferenceCB cb, EntityRowHandler<WhiteSelfReference> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, WhiteSelfReference.class);
    }

    protected <ENTITY extends WhiteSelfReference> void doSelectCursor(WhiteSelfReferenceCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<WhiteSelfReference>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        helpSelectCursorInternally(cb, entityRowHandler, entityType, new InternalSelectCursorCallback<ENTITY, WhiteSelfReferenceCB>() {
            public void callbackSelectCursor(WhiteSelfReferenceCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) { delegateSelectCursor(cb, entityRowHandler, entityType); }
            public List<ENTITY> callbackSelectList(WhiteSelfReferenceCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteSelfReferenceBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteSelfReferenceCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (NullAllowed)
     */
    public <RESULT> SLFunction<WhiteSelfReferenceCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends WhiteSelfReferenceCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
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
    //                                                                       Load Referrer
    //                                                                       =============
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param whiteSelfReference The entity of whiteSelfReference. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadWhiteSelfReferenceSelfList(WhiteSelfReference whiteSelfReference, ConditionBeanSetupper<WhiteSelfReferenceCB> conditionBeanSetupper) {
        xassLRArg(whiteSelfReference, conditionBeanSetupper);
        loadWhiteSelfReferenceSelfList(xnewLRLs(whiteSelfReference), conditionBeanSetupper);
    }
    /**
     * Load referrer of whiteSelfReferenceSelfList with the set-upper for condition-bean of referrer. <br />
     * white_self_reference by PARENT_ID, named 'whiteSelfReferenceSelfList'.
     * <pre>
     * whiteSelfReferenceBhv.<span style="color: #FD4747">loadWhiteSelfReferenceSelfList</span>(whiteSelfReferenceList, new ConditionBeanSetupper&lt;WhiteSelfReferenceCB&gt;() {
     *     public void setup(WhiteSelfReferenceCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (WhiteSelfReference whiteSelfReference : whiteSelfReferenceList) {
     *     ... = whiteSelfReference.<span style="color: #FD4747">getWhiteSelfReferenceSelfList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setParentId_InScope(pkList);
     * cb.query().addOrderBy_ParentId_Asc();
     * </pre>
     * @param whiteSelfReferenceList The entity list of whiteSelfReference. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadWhiteSelfReferenceSelfList(List<WhiteSelfReference> whiteSelfReferenceList, ConditionBeanSetupper<WhiteSelfReferenceCB> conditionBeanSetupper) {
        xassLRArg(whiteSelfReferenceList, conditionBeanSetupper);
        loadWhiteSelfReferenceSelfList(whiteSelfReferenceList, new LoadReferrerOption<WhiteSelfReferenceCB, WhiteSelfReference>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param whiteSelfReference The entity of whiteSelfReference. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadWhiteSelfReferenceSelfList(WhiteSelfReference whiteSelfReference, LoadReferrerOption<WhiteSelfReferenceCB, WhiteSelfReference> loadReferrerOption) {
        xassLRArg(whiteSelfReference, loadReferrerOption);
        loadWhiteSelfReferenceSelfList(xnewLRLs(whiteSelfReference), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param whiteSelfReferenceList The entity list of whiteSelfReference. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadWhiteSelfReferenceSelfList(List<WhiteSelfReference> whiteSelfReferenceList, LoadReferrerOption<WhiteSelfReferenceCB, WhiteSelfReference> loadReferrerOption) {
        xassLRArg(whiteSelfReferenceList, loadReferrerOption);
        if (whiteSelfReferenceList.isEmpty()) { return; }
        final WhiteSelfReferenceBhv referrerBhv = xgetBSFLR().select(WhiteSelfReferenceBhv.class);
        helpLoadReferrerInternally(whiteSelfReferenceList, loadReferrerOption, new InternalLoadReferrerCallback<WhiteSelfReference, Long, WhiteSelfReferenceCB, WhiteSelfReference>() {
            public Long getPKVal(WhiteSelfReference e)
            { return e.getSelfReferenceId(); }
            public void setRfLs(WhiteSelfReference e, List<WhiteSelfReference> ls)
            { e.setWhiteSelfReferenceSelfList(ls); }
            public WhiteSelfReferenceCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(WhiteSelfReferenceCB cb, List<Long> ls)
            { cb.query().setParentId_InScope(ls); }
            public void qyOdFKAsc(WhiteSelfReferenceCB cb) { cb.query().addOrderBy_ParentId_Asc(); }
            public void spFKCol(WhiteSelfReferenceCB cb) { cb.specify().columnParentId(); }
            public List<WhiteSelfReference> selRfLs(WhiteSelfReferenceCB cb) { return referrerBhv.selectList(cb); }
            public Long getFKVal(WhiteSelfReference e) { return e.getParentId(); }
            public void setlcEt(WhiteSelfReference re, WhiteSelfReference le)
            { re.setWhiteSelfReferenceSelf(le); }
            public String getRfPrNm() { return "whiteSelfReferenceSelfList"; }
        });
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'WhiteSelfReference'.
     * @param whiteSelfReferenceList The list of whiteSelfReference. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteSelfReference> pulloutWhiteSelfReferenceSelf(List<WhiteSelfReference> whiteSelfReferenceList) {
        return helpPulloutInternally(whiteSelfReferenceList, new InternalPulloutCallback<WhiteSelfReference, WhiteSelfReference>() {
            public WhiteSelfReference getFr(WhiteSelfReference e) { return e.getWhiteSelfReferenceSelf(); }
            public boolean hasRf() { return true; }
            public void setRfLs(WhiteSelfReference e, List<WhiteSelfReference> ls)
            { e.setWhiteSelfReferenceSelfList(ls); }
        });
    }
    /**
     * Pull out the list of foreign table 'WhiteSelfReferenceRefOne'.
     * @param whiteSelfReferenceList The list of whiteSelfReference. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteSelfReferenceRefOne> pulloutWhiteSelfReferenceRefOneByParentId(List<WhiteSelfReference> whiteSelfReferenceList) {
        return helpPulloutInternally(whiteSelfReferenceList, new InternalPulloutCallback<WhiteSelfReference, WhiteSelfReferenceRefOne>() {
            public WhiteSelfReferenceRefOne getFr(WhiteSelfReference e) { return e.getWhiteSelfReferenceRefOneByParentId(); }
            public boolean hasRf() { return true; }
            public void setRfLs(WhiteSelfReferenceRefOne e, List<WhiteSelfReference> ls)
            { e.setWhiteSelfReferenceByParentIdList(ls); }
        });
    }
    /**
     * Pull out the list of referrer-as-one table 'WhiteSelfReferenceRefOne'.
     * @param whiteSelfReferenceList The list of whiteSelfReference. (NotNull, EmptyAllowed)
     * @return The list of referrer-as-one table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteSelfReferenceRefOne> pulloutWhiteSelfReferenceRefOneAsOne(List<WhiteSelfReference> whiteSelfReferenceList) {
        return helpPulloutInternally(whiteSelfReferenceList, new InternalPulloutCallback<WhiteSelfReference, WhiteSelfReferenceRefOne>() {
            public WhiteSelfReferenceRefOne getFr(WhiteSelfReference e) { return e.getWhiteSelfReferenceRefOneAsOne(); }
            public boolean hasRf() { return true; }
            public void setRfLs(WhiteSelfReferenceRefOne e, List<WhiteSelfReference> ls)
            { if (!ls.isEmpty()) { e.setWhiteSelfReference(ls.get(0)); } }
        });
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key selfReferenceId.
     * @param whiteSelfReferenceList The list of whiteSelfReference. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractSelfReferenceIdList(List<WhiteSelfReference> whiteSelfReferenceList) {
        return helpExtractListInternally(whiteSelfReferenceList, new InternalExtractCallback<WhiteSelfReference, Long>() {
            public Long getCV(WhiteSelfReference e) { return e.getSelfReferenceId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteSelfReference whiteSelfReference = new WhiteSelfReference();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteSelfReference.setFoo...(value);
     * whiteSelfReference.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSelfReference.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSelfReference.set...;</span>
     * whiteSelfReferenceBhv.<span style="color: #FD4747">insert</span>(whiteSelfReference);
     * ... = whiteSelfReference.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteSelfReference The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteSelfReference whiteSelfReference) {
        doInsert(whiteSelfReference, null);
    }

    protected void doInsert(WhiteSelfReference whiteSelfReference, InsertOption<WhiteSelfReferenceCB> option) {
        assertObjectNotNull("whiteSelfReference", whiteSelfReference);
        prepareInsertOption(option);
        delegateInsert(whiteSelfReference, option);
    }

    protected void prepareInsertOption(InsertOption<WhiteSelfReferenceCB> option) {
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
     * WhiteSelfReference whiteSelfReference = new WhiteSelfReference();
     * whiteSelfReference.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteSelfReference.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSelfReference.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSelfReference.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteSelfReference.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteSelfReferenceBhv.<span style="color: #FD4747">update</span>(whiteSelfReference);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param whiteSelfReference The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final WhiteSelfReference whiteSelfReference) {
        doUpdate(whiteSelfReference, null);
    }

    protected void doUpdate(WhiteSelfReference whiteSelfReference, final UpdateOption<WhiteSelfReferenceCB> option) {
        assertObjectNotNull("whiteSelfReference", whiteSelfReference);
        prepareUpdateOption(option);
        helpUpdateInternally(whiteSelfReference, new InternalUpdateCallback<WhiteSelfReference>() {
            public int callbackDelegateUpdate(WhiteSelfReference entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhiteSelfReferenceCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected WhiteSelfReferenceCB createCBForVaryingUpdate() {
        WhiteSelfReferenceCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected WhiteSelfReferenceCB createCBForSpecifiedUpdate() {
        WhiteSelfReferenceCB cb = newMyConditionBean();
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
     * @param whiteSelfReference The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteSelfReference whiteSelfReference) {
        doInesrtOrUpdate(whiteSelfReference, null, null);
    }

    protected void doInesrtOrUpdate(WhiteSelfReference whiteSelfReference, final InsertOption<WhiteSelfReferenceCB> insertOption, final UpdateOption<WhiteSelfReferenceCB> updateOption) {
        helpInsertOrUpdateInternally(whiteSelfReference, new InternalInsertOrUpdateCallback<WhiteSelfReference, WhiteSelfReferenceCB>() {
            public void callbackInsert(WhiteSelfReference entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(WhiteSelfReference entity) { doUpdate(entity, updateOption); }
            public WhiteSelfReferenceCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(WhiteSelfReferenceCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<WhiteSelfReferenceCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<WhiteSelfReferenceCB>() : updateOption;
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
     * WhiteSelfReference whiteSelfReference = new WhiteSelfReference();
     * whiteSelfReference.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteSelfReference.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteSelfReferenceBhv.<span style="color: #FD4747">delete</span>(whiteSelfReference);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param whiteSelfReference The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteSelfReference whiteSelfReference) {
        doDelete(whiteSelfReference, null);
    }

    protected void doDelete(WhiteSelfReference whiteSelfReference, final DeleteOption<WhiteSelfReferenceCB> option) {
        assertObjectNotNull("whiteSelfReference", whiteSelfReference);
        prepareDeleteOption(option);
        helpDeleteInternally(whiteSelfReference, new InternalDeleteCallback<WhiteSelfReference>() {
            public int callbackDelegateDelete(WhiteSelfReference entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhiteSelfReferenceCB> option) {
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
     *     WhiteSelfReference whiteSelfReference = new WhiteSelfReference();
     *     whiteSelfReference.setFooName("foo");
     *     if (...) {
     *         whiteSelfReference.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteSelfReferenceList.add(whiteSelfReference);
     * }
     * whiteSelfReferenceBhv.<span style="color: #FD4747">batchInsert</span>(whiteSelfReferenceList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteSelfReferenceList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteSelfReference> whiteSelfReferenceList) {
        InsertOption<WhiteSelfReferenceCB> option = createInsertUpdateOption();
        return doBatchInsert(whiteSelfReferenceList, option);
    }

    protected int[] doBatchInsert(List<WhiteSelfReference> whiteSelfReferenceList, InsertOption<WhiteSelfReferenceCB> option) {
        assertObjectNotNull("whiteSelfReferenceList", whiteSelfReferenceList);
        prepareBatchInsertOption(whiteSelfReferenceList, option);
        return delegateBatchInsert(whiteSelfReferenceList, option);
    }

    protected void prepareBatchInsertOption(List<WhiteSelfReference> whiteSelfReferenceList, InsertOption<WhiteSelfReferenceCB> option) {
        option.xallowInsertColumnModifiedPropertiesFragmented();
        option.xacceptInsertColumnModifiedPropertiesIfNeeds(whiteSelfReferenceList);
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
     *     WhiteSelfReference whiteSelfReference = new WhiteSelfReference();
     *     whiteSelfReference.setFooName("foo");
     *     if (...) {
     *         whiteSelfReference.setFooPrice(123);
     *     } else {
     *         whiteSelfReference.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteSelfReference.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteSelfReferenceList.add(whiteSelfReference);
     * }
     * whiteSelfReferenceBhv.<span style="color: #FD4747">batchUpdate</span>(whiteSelfReferenceList);
     * </pre>
     * @param whiteSelfReferenceList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteSelfReference> whiteSelfReferenceList) {
        UpdateOption<WhiteSelfReferenceCB> option = createPlainUpdateOption();
        return doBatchUpdate(whiteSelfReferenceList, option);
    }

    protected int[] doBatchUpdate(List<WhiteSelfReference> whiteSelfReferenceList, UpdateOption<WhiteSelfReferenceCB> option) {
        assertObjectNotNull("whiteSelfReferenceList", whiteSelfReferenceList);
        prepareBatchUpdateOption(whiteSelfReferenceList, option);
        return delegateBatchUpdate(whiteSelfReferenceList, option);
    }

    protected void prepareBatchUpdateOption(List<WhiteSelfReference> whiteSelfReferenceList, UpdateOption<WhiteSelfReferenceCB> option) {
        option.xacceptUpdateColumnModifiedPropertiesIfNeeds(whiteSelfReferenceList);
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
     * whiteSelfReferenceBhv.<span style="color: #FD4747">batchUpdate</span>(whiteSelfReferenceList, new SpecifyQuery<WhiteSelfReferenceCB>() {
     *     public void specify(WhiteSelfReferenceCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span> 
     * whiteSelfReferenceBhv.<span style="color: #FD4747">batchUpdate</span>(whiteSelfReferenceList, new SpecifyQuery<WhiteSelfReferenceCB>() {
     *     public void specify(WhiteSelfReferenceCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteSelfReferenceList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteSelfReference> whiteSelfReferenceList, SpecifyQuery<WhiteSelfReferenceCB> updateColumnSpec) {
        return doBatchUpdate(whiteSelfReferenceList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        return doLumpModify(ls, option);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteSelfReferenceList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteSelfReference> whiteSelfReferenceList) {
        return doBatchDelete(whiteSelfReferenceList, null);
    }

    protected int[] doBatchDelete(List<WhiteSelfReference> whiteSelfReferenceList, DeleteOption<WhiteSelfReferenceCB> option) {
        assertObjectNotNull("whiteSelfReferenceList", whiteSelfReferenceList);
        prepareDeleteOption(option);
        return delegateBatchDelete(whiteSelfReferenceList, option);
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
     * whiteSelfReferenceBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteSelfReference, WhiteSelfReferenceCB&gt;() {
     *     public ConditionBean setup(whiteSelfReference entity, WhiteSelfReferenceCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteSelfReference, WhiteSelfReferenceCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteSelfReference, WhiteSelfReferenceCB> setupper, InsertOption<WhiteSelfReferenceCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        WhiteSelfReference entity = new WhiteSelfReference();
        WhiteSelfReferenceCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected WhiteSelfReferenceCB createCBForQueryInsert() {
        WhiteSelfReferenceCB cb = newMyConditionBean();
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
     * WhiteSelfReference whiteSelfReference = new WhiteSelfReference();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSelfReference.setPK...(value);</span>
     * whiteSelfReference.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSelfReference.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSelfReference.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSelfReference.setVersionNo(value);</span>
     * WhiteSelfReferenceCB cb = new WhiteSelfReferenceCB();
     * cb.query().setFoo...(value);
     * whiteSelfReferenceBhv.<span style="color: #FD4747">queryUpdate</span>(whiteSelfReference, cb);
     * </pre>
     * @param whiteSelfReference The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteSelfReference. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteSelfReference whiteSelfReference, WhiteSelfReferenceCB cb) {
        return doQueryUpdate(whiteSelfReference, cb, null);
    }

    protected int doQueryUpdate(WhiteSelfReference whiteSelfReference, WhiteSelfReferenceCB cb, UpdateOption<WhiteSelfReferenceCB> option) {
        assertObjectNotNull("whiteSelfReference", whiteSelfReference); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(whiteSelfReference, cb, option) : 0;
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (WhiteSelfReferenceCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (WhiteSelfReferenceCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteSelfReferenceCB cb = new WhiteSelfReferenceCB();
     * cb.query().setFoo...(value);
     * whiteSelfReferenceBhv.<span style="color: #FD4747">queryDelete</span>(whiteSelfReference, cb);
     * </pre>
     * @param cb The condition-bean of WhiteSelfReference. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteSelfReferenceCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteSelfReferenceCB cb, DeleteOption<WhiteSelfReferenceCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, option) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((WhiteSelfReferenceCB)cb); }
        else { return varyingQueryDelete((WhiteSelfReferenceCB)cb, downcast(option)); }
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
     * WhiteSelfReference whiteSelfReference = new WhiteSelfReference();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteSelfReference.setFoo...(value);
     * whiteSelfReference.setBar...(value);
     * InsertOption<WhiteSelfReferenceCB> option = new InsertOption<WhiteSelfReferenceCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteSelfReferenceBhv.<span style="color: #FD4747">varyingInsert</span>(whiteSelfReference, option);
     * ... = whiteSelfReference.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteSelfReference The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteSelfReference whiteSelfReference, InsertOption<WhiteSelfReferenceCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteSelfReference, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteSelfReference whiteSelfReference = new WhiteSelfReference();
     * whiteSelfReference.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteSelfReference.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteSelfReference.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteSelfReferenceCB&gt; option = new UpdateOption&lt;WhiteSelfReferenceCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteSelfReferenceCB&gt;() {
     *         public void specify(WhiteSelfReferenceCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteSelfReferenceBhv.<span style="color: #FD4747">varyingUpdate</span>(whiteSelfReference, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSelfReference The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteSelfReference whiteSelfReference, UpdateOption<WhiteSelfReferenceCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteSelfReference, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteSelfReference The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteSelfReference whiteSelfReference, InsertOption<WhiteSelfReferenceCB> insertOption, UpdateOption<WhiteSelfReferenceCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(whiteSelfReference, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteSelfReference The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteSelfReference whiteSelfReference, DeleteOption<WhiteSelfReferenceCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteSelfReference, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteSelfReferenceList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteSelfReference> whiteSelfReferenceList, InsertOption<WhiteSelfReferenceCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteSelfReferenceList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteSelfReferenceList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteSelfReference> whiteSelfReferenceList, UpdateOption<WhiteSelfReferenceCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteSelfReferenceList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteSelfReferenceList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteSelfReference> whiteSelfReferenceList, DeleteOption<WhiteSelfReferenceCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteSelfReferenceList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteSelfReference, WhiteSelfReferenceCB> setupper, InsertOption<WhiteSelfReferenceCB> option) {
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
     * WhiteSelfReference whiteSelfReference = new WhiteSelfReference();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSelfReference.setPK...(value);</span>
     * whiteSelfReference.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSelfReference.setVersionNo(value);</span>
     * WhiteSelfReferenceCB cb = new WhiteSelfReferenceCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteSelfReferenceCB&gt; option = new UpdateOption&lt;WhiteSelfReferenceCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteSelfReferenceCB&gt;() {
     *     public void specify(WhiteSelfReferenceCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteSelfReferenceBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(whiteSelfReference, cb, option);
     * </pre>
     * @param whiteSelfReference The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteSelfReference. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteSelfReference whiteSelfReference, WhiteSelfReferenceCB cb, UpdateOption<WhiteSelfReferenceCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteSelfReference, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteSelfReference. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteSelfReferenceCB cb, DeleteOption<WhiteSelfReferenceCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteSelfReferenceBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhiteSelfReferenceCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhiteSelfReferenceCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhiteSelfReference> void delegateSelectCursor(WhiteSelfReferenceCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends WhiteSelfReference> List<ENTITY> delegateSelectList(WhiteSelfReferenceCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhiteSelfReference e, InsertOption<WhiteSelfReferenceCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(WhiteSelfReference e, UpdateOption<WhiteSelfReferenceCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return delegateUpdateNonstrict(e, op); }
    protected int delegateUpdateNonstrict(WhiteSelfReference e, UpdateOption<WhiteSelfReferenceCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(WhiteSelfReference e, DeleteOption<WhiteSelfReferenceCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return delegateDeleteNonstrict(e, op); }
    protected int delegateDeleteNonstrict(WhiteSelfReference e, DeleteOption<WhiteSelfReferenceCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<WhiteSelfReference> ls, InsertOption<WhiteSelfReferenceCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhiteSelfReference> ls, UpdateOption<WhiteSelfReferenceCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhiteSelfReference> ls, UpdateOption<WhiteSelfReferenceCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhiteSelfReference> ls, DeleteOption<WhiteSelfReferenceCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhiteSelfReference> ls, DeleteOption<WhiteSelfReferenceCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhiteSelfReference e, WhiteSelfReferenceCB inCB, ConditionBean resCB, InsertOption<WhiteSelfReferenceCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhiteSelfReference e, WhiteSelfReferenceCB cb, UpdateOption<WhiteSelfReferenceCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(WhiteSelfReferenceCB cb, DeleteOption<WhiteSelfReferenceCB> op)
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
    protected WhiteSelfReference downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, WhiteSelfReference.class);
    }

    protected WhiteSelfReferenceCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, WhiteSelfReferenceCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<WhiteSelfReference> downcast(List<? extends Entity> entityList) {
        return (List<WhiteSelfReference>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteSelfReferenceCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<WhiteSelfReferenceCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteSelfReferenceCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<WhiteSelfReferenceCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteSelfReferenceCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<WhiteSelfReferenceCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteSelfReference, WhiteSelfReferenceCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<WhiteSelfReference, WhiteSelfReferenceCB>)option;
    }
}
