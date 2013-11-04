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
 * The behavior of WHITE_UQ_REFERENCE_WITHOUT_PK_REF as TABLE. <br />
 * <pre>
 * [primary key]
 *     
 * 
 * [column]
 *     UQ_REFERENCE_REF_ID, UQ_REFERENCE_CODE
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
 *     white_uq_reference_without_pk
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     whiteUqReferenceWithoutPk
 * 
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteUqReferenceWithoutPkRefBhv extends AbstractBehaviorReadable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_uq_reference_without_pk_ref"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return WhiteUqReferenceWithoutPkRefDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteUqReferenceWithoutPkRefDbm getMyDBMeta() { return WhiteUqReferenceWithoutPkRefDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteUqReferenceWithoutPkRef newMyEntity() { return new WhiteUqReferenceWithoutPkRef(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteUqReferenceWithoutPkRefCB newMyConditionBean() { return new WhiteUqReferenceWithoutPkRefCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteUqReferenceWithoutPkRefCB cb = new WhiteUqReferenceWithoutPkRefCB();
     * cb.query().setFoo...(value);
     * int count = whiteUqReferenceWithoutPkRefBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteUqReferenceWithoutPkRef. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteUqReferenceWithoutPkRefCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteUqReferenceWithoutPkRefCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteUqReferenceWithoutPkRefCB cb) { // called by selectPage(cb)
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
     * WhiteUqReferenceWithoutPkRefCB cb = new WhiteUqReferenceWithoutPkRefCB();
     * cb.query().setFoo...(value);
     * WhiteUqReferenceWithoutPkRef whiteUqReferenceWithoutPkRef = whiteUqReferenceWithoutPkRefBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (whiteUqReferenceWithoutPkRef != null) {
     *     ... = whiteUqReferenceWithoutPkRef.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteUqReferenceWithoutPkRef. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteUqReferenceWithoutPkRef selectEntity(WhiteUqReferenceWithoutPkRefCB cb) {
        return doSelectEntity(cb, WhiteUqReferenceWithoutPkRef.class);
    }

    protected <ENTITY extends WhiteUqReferenceWithoutPkRef> ENTITY doSelectEntity(final WhiteUqReferenceWithoutPkRefCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, entityType, new InternalSelectEntityCallback<ENTITY, WhiteUqReferenceWithoutPkRefCB>() {
            public List<ENTITY> callbackSelectList(WhiteUqReferenceWithoutPkRefCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * WhiteUqReferenceWithoutPkRefCB cb = new WhiteUqReferenceWithoutPkRefCB();
     * cb.query().setFoo...(value);
     * WhiteUqReferenceWithoutPkRef whiteUqReferenceWithoutPkRef = whiteUqReferenceWithoutPkRefBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteUqReferenceWithoutPkRef.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteUqReferenceWithoutPkRef. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteUqReferenceWithoutPkRef selectEntityWithDeletedCheck(WhiteUqReferenceWithoutPkRefCB cb) {
        return doSelectEntityWithDeletedCheck(cb, WhiteUqReferenceWithoutPkRef.class);
    }

    protected <ENTITY extends WhiteUqReferenceWithoutPkRef> ENTITY doSelectEntityWithDeletedCheck(final WhiteUqReferenceWithoutPkRefCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, entityType, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteUqReferenceWithoutPkRefCB>() {
            public List<ENTITY> callbackSelectList(WhiteUqReferenceWithoutPkRefCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteUqReferenceWithoutPkRefCB cb = new WhiteUqReferenceWithoutPkRefCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteUqReferenceWithoutPkRef&gt; whiteUqReferenceWithoutPkRefList = whiteUqReferenceWithoutPkRefBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (WhiteUqReferenceWithoutPkRef whiteUqReferenceWithoutPkRef : whiteUqReferenceWithoutPkRefList) {
     *     ... = whiteUqReferenceWithoutPkRef.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteUqReferenceWithoutPkRef. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteUqReferenceWithoutPkRef> selectList(WhiteUqReferenceWithoutPkRefCB cb) {
        return doSelectList(cb, WhiteUqReferenceWithoutPkRef.class);
    }

    protected <ENTITY extends WhiteUqReferenceWithoutPkRef> ListResultBean<ENTITY> doSelectList(WhiteUqReferenceWithoutPkRefCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, WhiteUqReferenceWithoutPkRefCB>() {
            public List<ENTITY> callbackSelectList(WhiteUqReferenceWithoutPkRefCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * WhiteUqReferenceWithoutPkRefCB cb = new WhiteUqReferenceWithoutPkRefCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteUqReferenceWithoutPkRef&gt; page = whiteUqReferenceWithoutPkRefBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteUqReferenceWithoutPkRef whiteUqReferenceWithoutPkRef : page) {
     *     ... = whiteUqReferenceWithoutPkRef.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteUqReferenceWithoutPkRef. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteUqReferenceWithoutPkRef> selectPage(WhiteUqReferenceWithoutPkRefCB cb) {
        return doSelectPage(cb, WhiteUqReferenceWithoutPkRef.class);
    }

    protected <ENTITY extends WhiteUqReferenceWithoutPkRef> PagingResultBean<ENTITY> doSelectPage(WhiteUqReferenceWithoutPkRefCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, WhiteUqReferenceWithoutPkRefCB>() {
            public int callbackSelectCount(WhiteUqReferenceWithoutPkRefCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteUqReferenceWithoutPkRefCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * WhiteUqReferenceWithoutPkRefCB cb = new WhiteUqReferenceWithoutPkRefCB();
     * cb.query().setFoo...(value);
     * whiteUqReferenceWithoutPkRefBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteUqReferenceWithoutPkRef&gt;() {
     *     public void handle(WhiteUqReferenceWithoutPkRef entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteUqReferenceWithoutPkRef. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteUqReferenceWithoutPkRef. (NotNull)
     */
    public void selectCursor(WhiteUqReferenceWithoutPkRefCB cb, EntityRowHandler<WhiteUqReferenceWithoutPkRef> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, WhiteUqReferenceWithoutPkRef.class);
    }

    protected <ENTITY extends WhiteUqReferenceWithoutPkRef> void doSelectCursor(WhiteUqReferenceWithoutPkRefCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<WhiteUqReferenceWithoutPkRef>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        helpSelectCursorInternally(cb, entityRowHandler, entityType, new InternalSelectCursorCallback<ENTITY, WhiteUqReferenceWithoutPkRefCB>() {
            public void callbackSelectCursor(WhiteUqReferenceWithoutPkRefCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) { delegateSelectCursor(cb, entityRowHandler, entityType); }
            public List<ENTITY> callbackSelectList(WhiteUqReferenceWithoutPkRefCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteUqReferenceWithoutPkRefBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteUqReferenceWithoutPkRefCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (NullAllowed)
     */
    public <RESULT> SLFunction<WhiteUqReferenceWithoutPkRefCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends WhiteUqReferenceWithoutPkRefCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
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
     * Pull out the list of foreign table 'WhiteUqReferenceWithoutPk'.
     * @param whiteUqReferenceWithoutPkRefList The list of whiteUqReferenceWithoutPkRef. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteUqReferenceWithoutPk> pulloutWhiteUqReferenceWithoutPk(List<WhiteUqReferenceWithoutPkRef> whiteUqReferenceWithoutPkRefList) {
        return helpPulloutInternally(whiteUqReferenceWithoutPkRefList, new InternalPulloutCallback<WhiteUqReferenceWithoutPkRef, WhiteUqReferenceWithoutPk>() {
            public WhiteUqReferenceWithoutPk getFr(WhiteUqReferenceWithoutPkRef e) { return e.getWhiteUqReferenceWithoutPk(); }
            public boolean hasRf() { return true; }
            public void setRfLs(WhiteUqReferenceWithoutPk e, List<WhiteUqReferenceWithoutPkRef> ls)
            { e.setWhiteUqReferenceWithoutPkRefList(ls); }
        });
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============

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
    public OutsideSqlBasicExecutor<WhiteUqReferenceWithoutPkRefBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhiteUqReferenceWithoutPkRefCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhiteUqReferenceWithoutPkRefCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhiteUqReferenceWithoutPkRef> void delegateSelectCursor(WhiteUqReferenceWithoutPkRefCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends WhiteUqReferenceWithoutPkRef> List<ENTITY> delegateSelectList(WhiteUqReferenceWithoutPkRefCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

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
    protected WhiteUqReferenceWithoutPkRef downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, WhiteUqReferenceWithoutPkRef.class);
    }

    protected WhiteUqReferenceWithoutPkRefCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, WhiteUqReferenceWithoutPkRefCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<WhiteUqReferenceWithoutPkRef> downcast(List<? extends Entity> entityList) {
        return (List<WhiteUqReferenceWithoutPkRef>)entityList;
    }
}
