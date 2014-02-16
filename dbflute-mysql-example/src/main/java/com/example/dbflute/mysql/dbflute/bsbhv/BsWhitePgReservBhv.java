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
 * The behavior of WHITE_PG_RESERV as TABLE. <br />
 * <pre>
 * [primary key]
 *     CLASS
 *
 * [column]
 *     CLASS, CASE, PACKAGE, DEFAULT, NEW, NATIVE, VOID, PUBLIC, PROTECTED, PRIVATE, INTERFACE, ABSTRACT, FINAL, FINALLY, RETURN, DOUBLE, FLOAT, SHORT, TYPE, RESERV_NAME
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
 *     white_pg_reserv_ref
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whitePgReservRefList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhitePgReservBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_pg_reserv"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return WhitePgReservDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhitePgReservDbm getMyDBMeta() { return WhitePgReservDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhitePgReserv newMyEntity() { return new WhitePgReserv(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhitePgReservCB newMyConditionBean() { return new WhitePgReservCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhitePgReservCB cb = new WhitePgReservCB();
     * cb.query().setFoo...(value);
     * int count = whitePgReservBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhitePgReserv. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhitePgReservCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhitePgReservCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhitePgReservCB cb) { // called by selectPage(cb)
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
     * WhitePgReservCB cb = new WhitePgReservCB();
     * cb.query().setFoo...(value);
     * WhitePgReserv whitePgReserv = whitePgReservBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (whitePgReserv != null) {
     *     ... = whitePgReserv.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhitePgReserv. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhitePgReserv selectEntity(WhitePgReservCB cb) {
        return doSelectEntity(cb, WhitePgReserv.class);
    }

    protected <ENTITY extends WhitePgReserv> ENTITY doSelectEntity(final WhitePgReservCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, WhitePgReservCB>() {
            public List<ENTITY> callbackSelectList(WhitePgReservCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * WhitePgReservCB cb = new WhitePgReservCB();
     * cb.query().setFoo...(value);
     * WhitePgReserv whitePgReserv = whitePgReservBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whitePgReserv.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhitePgReserv. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhitePgReserv selectEntityWithDeletedCheck(WhitePgReservCB cb) {
        return doSelectEntityWithDeletedCheck(cb, WhitePgReserv.class);
    }

    protected <ENTITY extends WhitePgReserv> ENTITY doSelectEntityWithDeletedCheck(final WhitePgReservCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhitePgReservCB>() {
            public List<ENTITY> callbackSelectList(WhitePgReservCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param classSynonym The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhitePgReserv selectByPKValue(Integer classSynonym) {
        return doSelectByPKValue(classSynonym, WhitePgReserv.class);
    }

    protected <ENTITY extends WhitePgReserv> ENTITY doSelectByPKValue(Integer classSynonym, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(classSynonym), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param classSynonym The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhitePgReserv selectByPKValueWithDeletedCheck(Integer classSynonym) {
        return doSelectByPKValueWithDeletedCheck(classSynonym, WhitePgReserv.class);
    }

    protected <ENTITY extends WhitePgReserv> ENTITY doSelectByPKValueWithDeletedCheck(Integer classSynonym, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(classSynonym), entityType);
    }

    private WhitePgReservCB buildPKCB(Integer classSynonym) {
        assertObjectNotNull("classSynonym", classSynonym);
        WhitePgReservCB cb = newMyConditionBean();
        cb.query().setClassSynonym_Equal(classSynonym);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhitePgReservCB cb = new WhitePgReservCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhitePgReserv&gt; whitePgReservList = whitePgReservBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (WhitePgReserv whitePgReserv : whitePgReservList) {
     *     ... = whitePgReserv.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhitePgReserv. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhitePgReserv> selectList(WhitePgReservCB cb) {
        return doSelectList(cb, WhitePgReserv.class);
    }

    protected <ENTITY extends WhitePgReserv> ListResultBean<ENTITY> doSelectList(WhitePgReservCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, WhitePgReservCB>() {
            public List<ENTITY> callbackSelectList(WhitePgReservCB cb, Class<ENTITY> tp) { return delegateSelectList(cb, tp); } });
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
     * WhitePgReservCB cb = new WhitePgReservCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhitePgReserv&gt; page = whitePgReservBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhitePgReserv whitePgReserv : page) {
     *     ... = whitePgReserv.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhitePgReserv. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhitePgReserv> selectPage(WhitePgReservCB cb) {
        return doSelectPage(cb, WhitePgReserv.class);
    }

    protected <ENTITY extends WhitePgReserv> PagingResultBean<ENTITY> doSelectPage(WhitePgReservCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, WhitePgReservCB>() {
            public int callbackSelectCount(WhitePgReservCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhitePgReservCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * WhitePgReservCB cb = new WhitePgReservCB();
     * cb.query().setFoo...(value);
     * whitePgReservBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhitePgReserv&gt;() {
     *     public void handle(WhitePgReserv entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhitePgReserv. (NotNull)
     * @param entityRowHandler The handler of entity row of WhitePgReserv. (NotNull)
     */
    public void selectCursor(WhitePgReservCB cb, EntityRowHandler<WhitePgReserv> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, WhitePgReserv.class);
    }

    protected <ENTITY extends WhitePgReserv> void doSelectCursor(WhitePgReservCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, WhitePgReservCB>() {
            public void callbackSelectCursor(WhitePgReservCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(WhitePgReservCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whitePgReservBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhitePgReservCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<WhitePgReservCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends WhitePgReservCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends WhitePgReservCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
    //                                                                       Load Referrer
    //                                                                       =============
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param whitePgReserv The entity of whitePgReserv. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadWhitePgReservRefList(WhitePgReserv whitePgReserv, ConditionBeanSetupper<WhitePgReservRefCB> conditionBeanSetupper) {
        xassLRArg(whitePgReserv, conditionBeanSetupper);
        loadWhitePgReservRefList(xnewLRLs(whitePgReserv), conditionBeanSetupper);
    }
    /**
     * Load referrer of whitePgReservRefList with the set-upper for condition-bean of referrer. <br />
     * white_pg_reserv_ref by CLASS, named 'whitePgReservRefList'.
     * <pre>
     * whitePgReservBhv.<span style="color: #FD4747">loadWhitePgReservRefList</span>(whitePgReservList, new ConditionBeanSetupper&lt;WhitePgReservRefCB&gt;() {
     *     public void setup(WhitePgReservRefCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (WhitePgReserv whitePgReserv : whitePgReservList) {
     *     ... = whitePgReserv.<span style="color: #FD4747">getWhitePgReservRefList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setClassSynonym_InScope(pkList);
     * cb.query().addOrderBy_ClassSynonym_Asc();
     * </pre>
     * @param whitePgReservList The entity list of whitePgReserv. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadWhitePgReservRefList(List<WhitePgReserv> whitePgReservList, ConditionBeanSetupper<WhitePgReservRefCB> conditionBeanSetupper) {
        xassLRArg(whitePgReservList, conditionBeanSetupper);
        loadWhitePgReservRefList(whitePgReservList, new LoadReferrerOption<WhitePgReservRefCB, WhitePgReservRef>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param whitePgReserv The entity of whitePgReserv. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadWhitePgReservRefList(WhitePgReserv whitePgReserv, LoadReferrerOption<WhitePgReservRefCB, WhitePgReservRef> loadReferrerOption) {
        xassLRArg(whitePgReserv, loadReferrerOption);
        loadWhitePgReservRefList(xnewLRLs(whitePgReserv), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param whitePgReservList The entity list of whitePgReserv. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadWhitePgReservRefList(List<WhitePgReserv> whitePgReservList, LoadReferrerOption<WhitePgReservRefCB, WhitePgReservRef> loadReferrerOption) {
        xassLRArg(whitePgReservList, loadReferrerOption);
        if (whitePgReservList.isEmpty()) { return; }
        final WhitePgReservRefBhv referrerBhv = xgetBSFLR().select(WhitePgReservRefBhv.class);
        helpLoadReferrerInternally(whitePgReservList, loadReferrerOption, new InternalLoadReferrerCallback<WhitePgReserv, Integer, WhitePgReservRefCB, WhitePgReservRef>() {
            public Integer getPKVal(WhitePgReserv et)
            { return et.getClassSynonym(); }
            public void setRfLs(WhitePgReserv et, List<WhitePgReservRef> ls)
            { et.setWhitePgReservRefList(ls); }
            public WhitePgReservRefCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(WhitePgReservRefCB cb, List<Integer> ls)
            { cb.query().setClassSynonym_InScope(ls); }
            public void qyOdFKAsc(WhitePgReservRefCB cb) { cb.query().addOrderBy_ClassSynonym_Asc(); }
            public void spFKCol(WhitePgReservRefCB cb) { cb.specify().columnClassSynonym(); }
            public List<WhitePgReservRef> selRfLs(WhitePgReservRefCB cb) { return referrerBhv.selectList(cb); }
            public Integer getFKVal(WhitePgReservRef re) { return re.getClassSynonym(); }
            public void setlcEt(WhitePgReservRef re, WhitePgReserv le)
            { re.setWhitePgReserv(le); }
            public String getRfPrNm() { return "whitePgReservRefList"; }
        });
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key classSynonym.
     * @param whitePgReservList The list of whitePgReserv. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractClassSynonymList(List<WhitePgReserv> whitePgReservList) {
        return helpExtractListInternally(whitePgReservList, new InternalExtractCallback<WhitePgReserv, Integer>() {
            public Integer getCV(WhitePgReserv et) { return et.getClassSynonym(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhitePgReserv whitePgReserv = new WhitePgReserv();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whitePgReserv.setFoo...(value);
     * whitePgReserv.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whitePgReserv.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whitePgReserv.set...;</span>
     * whitePgReservBhv.<span style="color: #FD4747">insert</span>(whitePgReserv);
     * ... = whitePgReserv.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whitePgReserv The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhitePgReserv whitePgReserv) {
        doInsert(whitePgReserv, null);
    }

    protected void doInsert(WhitePgReserv whitePgReserv, InsertOption<WhitePgReservCB> op) {
        assertObjectNotNull("whitePgReserv", whitePgReserv);
        prepareInsertOption(op);
        delegateInsert(whitePgReserv, op);
    }

    protected void prepareInsertOption(InsertOption<WhitePgReservCB> op) {
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
     * WhitePgReserv whitePgReserv = new WhitePgReserv();
     * whitePgReserv.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whitePgReserv.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whitePgReserv.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whitePgReserv.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whitePgReserv.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whitePgReservBhv.<span style="color: #FD4747">update</span>(whitePgReserv);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whitePgReserv The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final WhitePgReserv whitePgReserv) {
        doUpdate(whitePgReserv, null);
    }

    protected void doUpdate(WhitePgReserv whitePgReserv, final UpdateOption<WhitePgReservCB> op) {
        assertObjectNotNull("whitePgReserv", whitePgReserv);
        prepareUpdateOption(op);
        helpUpdateInternally(whitePgReserv, new InternalUpdateCallback<WhitePgReserv>() {
            public int callbackDelegateUpdate(WhitePgReserv et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhitePgReservCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected WhitePgReservCB createCBForVaryingUpdate() {
        WhitePgReservCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected WhitePgReservCB createCBForSpecifiedUpdate() {
        WhitePgReservCB cb = newMyConditionBean();
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
     * @param whitePgReserv The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhitePgReserv whitePgReserv) {
        doInesrtOrUpdate(whitePgReserv, null, null);
    }

    protected void doInesrtOrUpdate(WhitePgReserv whitePgReserv, final InsertOption<WhitePgReservCB> iop, final UpdateOption<WhitePgReservCB> uop) {
        helpInsertOrUpdateInternally(whitePgReserv, new InternalInsertOrUpdateCallback<WhitePgReserv, WhitePgReservCB>() {
            public void callbackInsert(WhitePgReserv et) { doInsert(et, iop); }
            public void callbackUpdate(WhitePgReserv et) { doUpdate(et, uop); }
            public WhitePgReservCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(WhitePgReservCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<WhitePgReservCB>();
            uop = uop != null ? uop : new UpdateOption<WhitePgReservCB>();
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
     * WhitePgReserv whitePgReserv = new WhitePgReserv();
     * whitePgReserv.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whitePgReserv.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whitePgReservBhv.<span style="color: #FD4747">delete</span>(whitePgReserv);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whitePgReserv The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhitePgReserv whitePgReserv) {
        doDelete(whitePgReserv, null);
    }

    protected void doDelete(WhitePgReserv whitePgReserv, final DeleteOption<WhitePgReservCB> op) {
        assertObjectNotNull("whitePgReserv", whitePgReserv);
        prepareDeleteOption(op);
        helpDeleteInternally(whitePgReserv, new InternalDeleteCallback<WhitePgReserv>() {
            public int callbackDelegateDelete(WhitePgReserv et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhitePgReservCB> op) {
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
     *     WhitePgReserv whitePgReserv = new WhitePgReserv();
     *     whitePgReserv.setFooName("foo");
     *     if (...) {
     *         whitePgReserv.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whitePgReservList.add(whitePgReserv);
     * }
     * whitePgReservBhv.<span style="color: #FD4747">batchInsert</span>(whitePgReservList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whitePgReservList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhitePgReserv> whitePgReservList) {
        InsertOption<WhitePgReservCB> op = createInsertUpdateOption();
        return doBatchInsert(whitePgReservList, op);
    }

    protected int[] doBatchInsert(List<WhitePgReserv> whitePgReservList, InsertOption<WhitePgReservCB> op) {
        assertObjectNotNull("whitePgReservList", whitePgReservList);
        prepareBatchInsertOption(whitePgReservList, op);
        return delegateBatchInsert(whitePgReservList, op);
    }

    protected void prepareBatchInsertOption(List<WhitePgReserv> whitePgReservList, InsertOption<WhitePgReservCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(whitePgReservList);
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
     *     WhitePgReserv whitePgReserv = new WhitePgReserv();
     *     whitePgReserv.setFooName("foo");
     *     if (...) {
     *         whitePgReserv.setFooPrice(123);
     *     } else {
     *         whitePgReserv.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whitePgReserv.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whitePgReservList.add(whitePgReserv);
     * }
     * whitePgReservBhv.<span style="color: #FD4747">batchUpdate</span>(whitePgReservList);
     * </pre>
     * @param whitePgReservList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhitePgReserv> whitePgReservList) {
        UpdateOption<WhitePgReservCB> op = createPlainUpdateOption();
        return doBatchUpdate(whitePgReservList, op);
    }

    protected int[] doBatchUpdate(List<WhitePgReserv> whitePgReservList, UpdateOption<WhitePgReservCB> op) {
        assertObjectNotNull("whitePgReservList", whitePgReservList);
        prepareBatchUpdateOption(whitePgReservList, op);
        return delegateBatchUpdate(whitePgReservList, op);
    }

    protected void prepareBatchUpdateOption(List<WhitePgReserv> whitePgReservList, UpdateOption<WhitePgReservCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(whitePgReservList);
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
     * whitePgReservBhv.<span style="color: #FD4747">batchUpdate</span>(whitePgReservList, new SpecifyQuery<WhitePgReservCB>() {
     *     public void specify(WhitePgReservCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whitePgReservBhv.<span style="color: #FD4747">batchUpdate</span>(whitePgReservList, new SpecifyQuery<WhitePgReservCB>() {
     *     public void specify(WhitePgReservCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whitePgReservList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhitePgReserv> whitePgReservList, SpecifyQuery<WhitePgReservCB> updateColumnSpec) {
        return doBatchUpdate(whitePgReservList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whitePgReservList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhitePgReserv> whitePgReservList) {
        return doBatchDelete(whitePgReservList, null);
    }

    protected int[] doBatchDelete(List<WhitePgReserv> whitePgReservList, DeleteOption<WhitePgReservCB> op) {
        assertObjectNotNull("whitePgReservList", whitePgReservList);
        prepareDeleteOption(op);
        return delegateBatchDelete(whitePgReservList, op);
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
     * whitePgReservBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhitePgReserv, WhitePgReservCB&gt;() {
     *     public ConditionBean setup(whitePgReserv entity, WhitePgReservCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhitePgReserv, WhitePgReservCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhitePgReserv, WhitePgReservCB> sp, InsertOption<WhitePgReservCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        WhitePgReserv e = new WhitePgReserv();
        WhitePgReservCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected WhitePgReservCB createCBForQueryInsert() {
        WhitePgReservCB cb = newMyConditionBean();
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
     * WhitePgReserv whitePgReserv = new WhitePgReserv();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whitePgReserv.setPK...(value);</span>
     * whitePgReserv.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whitePgReserv.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whitePgReserv.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whitePgReserv.setVersionNo(value);</span>
     * WhitePgReservCB cb = new WhitePgReservCB();
     * cb.query().setFoo...(value);
     * whitePgReservBhv.<span style="color: #FD4747">queryUpdate</span>(whitePgReserv, cb);
     * </pre>
     * @param whitePgReserv The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhitePgReserv. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhitePgReserv whitePgReserv, WhitePgReservCB cb) {
        return doQueryUpdate(whitePgReserv, cb, null);
    }

    protected int doQueryUpdate(WhitePgReserv whitePgReserv, WhitePgReservCB cb, UpdateOption<WhitePgReservCB> op) {
        assertObjectNotNull("whitePgReserv", whitePgReserv); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(whitePgReserv, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (WhitePgReservCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (WhitePgReservCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhitePgReservCB cb = new WhitePgReservCB();
     * cb.query().setFoo...(value);
     * whitePgReservBhv.<span style="color: #FD4747">queryDelete</span>(whitePgReserv, cb);
     * </pre>
     * @param cb The condition-bean of WhitePgReserv. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhitePgReservCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhitePgReservCB cb, DeleteOption<WhitePgReservCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((WhitePgReservCB)cb); }
        else { return varyingQueryDelete((WhitePgReservCB)cb, downcast(op)); }
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
     * WhitePgReserv whitePgReserv = new WhitePgReserv();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whitePgReserv.setFoo...(value);
     * whitePgReserv.setBar...(value);
     * InsertOption<WhitePgReservCB> option = new InsertOption<WhitePgReservCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whitePgReservBhv.<span style="color: #FD4747">varyingInsert</span>(whitePgReserv, option);
     * ... = whitePgReserv.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whitePgReserv The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhitePgReserv whitePgReserv, InsertOption<WhitePgReservCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whitePgReserv, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhitePgReserv whitePgReserv = new WhitePgReserv();
     * whitePgReserv.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whitePgReserv.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whitePgReserv.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhitePgReservCB&gt; option = new UpdateOption&lt;WhitePgReservCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhitePgReservCB&gt;() {
     *         public void specify(WhitePgReservCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whitePgReservBhv.<span style="color: #FD4747">varyingUpdate</span>(whitePgReserv, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whitePgReserv The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhitePgReserv whitePgReserv, UpdateOption<WhitePgReservCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whitePgReserv, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whitePgReserv The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhitePgReserv whitePgReserv, InsertOption<WhitePgReservCB> insertOption, UpdateOption<WhitePgReservCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(whitePgReserv, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whitePgReserv The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhitePgReserv whitePgReserv, DeleteOption<WhitePgReservCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whitePgReserv, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whitePgReservList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhitePgReserv> whitePgReservList, InsertOption<WhitePgReservCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whitePgReservList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whitePgReservList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhitePgReserv> whitePgReservList, UpdateOption<WhitePgReservCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whitePgReservList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whitePgReservList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhitePgReserv> whitePgReservList, DeleteOption<WhitePgReservCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whitePgReservList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhitePgReserv, WhitePgReservCB> setupper, InsertOption<WhitePgReservCB> option) {
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
     * WhitePgReserv whitePgReserv = new WhitePgReserv();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whitePgReserv.setPK...(value);</span>
     * whitePgReserv.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whitePgReserv.setVersionNo(value);</span>
     * WhitePgReservCB cb = new WhitePgReservCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhitePgReservCB&gt; option = new UpdateOption&lt;WhitePgReservCB&gt;();
     * option.self(new SpecifyQuery&lt;WhitePgReservCB&gt;() {
     *     public void specify(WhitePgReservCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whitePgReservBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(whitePgReserv, cb, option);
     * </pre>
     * @param whitePgReserv The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhitePgReserv. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhitePgReserv whitePgReserv, WhitePgReservCB cb, UpdateOption<WhitePgReservCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whitePgReserv, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhitePgReserv. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhitePgReservCB cb, DeleteOption<WhitePgReservCB> option) {
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
    public OutsideSqlBasicExecutor<WhitePgReservBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhitePgReservCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhitePgReservCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhitePgReserv> void delegateSelectCursor(WhitePgReservCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends WhitePgReserv> List<ENTITY> delegateSelectList(WhitePgReservCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhitePgReserv et, InsertOption<WhitePgReservCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(WhitePgReserv et, UpdateOption<WhitePgReservCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(WhitePgReserv et, UpdateOption<WhitePgReservCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(WhitePgReserv et, DeleteOption<WhitePgReservCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(WhitePgReserv et, DeleteOption<WhitePgReservCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<WhitePgReserv> ls, InsertOption<WhitePgReservCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhitePgReserv> ls, UpdateOption<WhitePgReservCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhitePgReserv> ls, UpdateOption<WhitePgReservCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhitePgReserv> ls, DeleteOption<WhitePgReservCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhitePgReserv> ls, DeleteOption<WhitePgReservCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhitePgReserv et, WhitePgReservCB inCB, ConditionBean resCB, InsertOption<WhitePgReservCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhitePgReserv et, WhitePgReservCB cb, UpdateOption<WhitePgReservCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(WhitePgReservCB cb, DeleteOption<WhitePgReservCB> op)
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
    protected WhitePgReserv downcast(Entity et) {
        return helpEntityDowncastInternally(et, WhitePgReserv.class);
    }

    protected WhitePgReservCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, WhitePgReservCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<WhitePgReserv> downcast(List<? extends Entity> ls) {
        return (List<WhitePgReserv>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhitePgReservCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<WhitePgReservCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhitePgReservCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<WhitePgReservCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhitePgReservCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<WhitePgReservCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhitePgReserv, WhitePgReservCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<WhitePgReserv, WhitePgReservCB>)sp;
    }
}
