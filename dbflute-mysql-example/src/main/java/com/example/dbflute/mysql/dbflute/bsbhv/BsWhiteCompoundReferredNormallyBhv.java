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
import org.seasar.dbflute.outsidesql.executor.*;
import com.example.dbflute.mysql.dbflute.exbhv.*;
import com.example.dbflute.mysql.dbflute.exentity.*;
import com.example.dbflute.mysql.dbflute.bsentity.dbmeta.*;
import com.example.dbflute.mysql.dbflute.cbean.*;

/**
 * The behavior of WHITE_COMPOUND_REFERRED_NORMALLY as TABLE. <br />
 * <pre>
 * [primary key]
 *     REFERRED_ID
 *
 * [column]
 *     REFERRED_ID, REFERRED_NAME
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
 *     white_compound_pk
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whiteCompoundPkList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteCompoundReferredNormallyBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_compound_referred_normally"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return WhiteCompoundReferredNormallyDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteCompoundReferredNormallyDbm getMyDBMeta() { return WhiteCompoundReferredNormallyDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteCompoundReferredNormally newMyEntity() { return new WhiteCompoundReferredNormally(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteCompoundReferredNormallyCB newMyConditionBean() { return new WhiteCompoundReferredNormallyCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteCompoundReferredNormallyCB cb = new WhiteCompoundReferredNormallyCB();
     * cb.query().setFoo...(value);
     * int count = whiteCompoundReferredNormallyBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteCompoundReferredNormally. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteCompoundReferredNormallyCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteCompoundReferredNormallyCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteCompoundReferredNormallyCB cb) { // called by selectPage(cb)
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
     * Select the entity by the condition-bean. <br />
     * <span style="color: #AD4747; font-size: 120%">The return might be null if no data, so you should have null check.</span> <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, use selectEntityWithDeletedCheck().</span>
     * <pre>
     * WhiteCompoundReferredNormallyCB cb = new WhiteCompoundReferredNormallyCB();
     * cb.query().setFoo...(value);
     * WhiteCompoundReferredNormally whiteCompoundReferredNormally = whiteCompoundReferredNormallyBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (whiteCompoundReferredNormally != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = whiteCompoundReferredNormally.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteCompoundReferredNormally. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteCompoundReferredNormally selectEntity(WhiteCompoundReferredNormallyCB cb) {
        return doSelectEntity(cb, WhiteCompoundReferredNormally.class);
    }

    protected <ENTITY extends WhiteCompoundReferredNormally> ENTITY doSelectEntity(WhiteCompoundReferredNormallyCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, WhiteCompoundReferredNormallyCB>() {
            public List<ENTITY> callbackSelectList(WhiteCompoundReferredNormallyCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * WhiteCompoundReferredNormallyCB cb = new WhiteCompoundReferredNormallyCB();
     * cb.query().setFoo...(value);
     * WhiteCompoundReferredNormally whiteCompoundReferredNormally = whiteCompoundReferredNormallyBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteCompoundReferredNormally.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteCompoundReferredNormally. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (point is not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteCompoundReferredNormally selectEntityWithDeletedCheck(WhiteCompoundReferredNormallyCB cb) {
        return doSelectEntityWithDeletedCheck(cb, WhiteCompoundReferredNormally.class);
    }

    protected <ENTITY extends WhiteCompoundReferredNormally> ENTITY doSelectEntityWithDeletedCheck(WhiteCompoundReferredNormallyCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteCompoundReferredNormallyCB>() {
            public List<ENTITY> callbackSelectList(WhiteCompoundReferredNormallyCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param referredId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteCompoundReferredNormally selectByPKValue(Integer referredId) {
        return doSelectByPKValue(referredId, WhiteCompoundReferredNormally.class);
    }

    protected <ENTITY extends WhiteCompoundReferredNormally> ENTITY doSelectByPKValue(Integer referredId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(referredId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param referredId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteCompoundReferredNormally selectByPKValueWithDeletedCheck(Integer referredId) {
        return doSelectByPKValueWithDeletedCheck(referredId, WhiteCompoundReferredNormally.class);
    }

    protected <ENTITY extends WhiteCompoundReferredNormally> ENTITY doSelectByPKValueWithDeletedCheck(Integer referredId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(referredId), entityType);
    }

    private WhiteCompoundReferredNormallyCB buildPKCB(Integer referredId) {
        assertObjectNotNull("referredId", referredId);
        WhiteCompoundReferredNormallyCB cb = newMyConditionBean();
        cb.query().setReferredId_Equal(referredId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteCompoundReferredNormallyCB cb = new WhiteCompoundReferredNormallyCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteCompoundReferredNormally&gt; whiteCompoundReferredNormallyList = whiteCompoundReferredNormallyBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteCompoundReferredNormally whiteCompoundReferredNormally : whiteCompoundReferredNormallyList) {
     *     ... = whiteCompoundReferredNormally.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteCompoundReferredNormally. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteCompoundReferredNormally> selectList(WhiteCompoundReferredNormallyCB cb) {
        return doSelectList(cb, WhiteCompoundReferredNormally.class);
    }

    protected <ENTITY extends WhiteCompoundReferredNormally> ListResultBean<ENTITY> doSelectList(WhiteCompoundReferredNormallyCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, WhiteCompoundReferredNormallyCB>() {
            public List<ENTITY> callbackSelectList(WhiteCompoundReferredNormallyCB lcb, Class<ENTITY> ltp) { return delegateSelectList(lcb, ltp); } });
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
     * WhiteCompoundReferredNormallyCB cb = new WhiteCompoundReferredNormallyCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteCompoundReferredNormally&gt; page = whiteCompoundReferredNormallyBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteCompoundReferredNormally whiteCompoundReferredNormally : page) {
     *     ... = whiteCompoundReferredNormally.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteCompoundReferredNormally. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteCompoundReferredNormally> selectPage(WhiteCompoundReferredNormallyCB cb) {
        return doSelectPage(cb, WhiteCompoundReferredNormally.class);
    }

    protected <ENTITY extends WhiteCompoundReferredNormally> PagingResultBean<ENTITY> doSelectPage(WhiteCompoundReferredNormallyCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, WhiteCompoundReferredNormallyCB>() {
            public int callbackSelectCount(WhiteCompoundReferredNormallyCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteCompoundReferredNormallyCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * WhiteCompoundReferredNormallyCB cb = new WhiteCompoundReferredNormallyCB();
     * cb.query().setFoo...(value);
     * whiteCompoundReferredNormallyBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteCompoundReferredNormally&gt;() {
     *     public void handle(WhiteCompoundReferredNormally entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteCompoundReferredNormally. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteCompoundReferredNormally. (NotNull)
     */
    public void selectCursor(WhiteCompoundReferredNormallyCB cb, EntityRowHandler<WhiteCompoundReferredNormally> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, WhiteCompoundReferredNormally.class);
    }

    protected <ENTITY extends WhiteCompoundReferredNormally> void doSelectCursor(WhiteCompoundReferredNormallyCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, WhiteCompoundReferredNormallyCB>() {
            public void callbackSelectCursor(WhiteCompoundReferredNormallyCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(WhiteCompoundReferredNormallyCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteCompoundReferredNormallyBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteCompoundReferredNormallyCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<WhiteCompoundReferredNormallyCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends WhiteCompoundReferredNormallyCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends WhiteCompoundReferredNormallyCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
     * Load referrer of whiteCompoundPkList by the set-upper of referrer. <br />
     * white_compound_pk by REFERRED_ID, named 'whiteCompoundPkList'.
     * <pre>
     * whiteCompoundReferredNormallyBhv.<span style="color: #DD4747">loadWhiteCompoundPkList</span>(whiteCompoundReferredNormallyList, new ConditionBeanSetupper&lt;WhiteCompoundPkCB&gt;() {
     *     public void setup(WhiteCompoundPkCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here by calling like '}).withNestedList(new ...)'</span>
     * for (WhiteCompoundReferredNormally whiteCompoundReferredNormally : whiteCompoundReferredNormallyList) {
     *     ... = whiteCompoundReferredNormally.<span style="color: #DD4747">getWhiteCompoundPkList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setReferredId_InScope(pkList);
     * cb.query().addOrderBy_ReferredId_Asc();
     * </pre>
     * @param whiteCompoundReferredNormally The entity of whiteCompoundReferredNormally. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<WhiteCompoundPk> loadWhiteCompoundPkList(WhiteCompoundReferredNormally whiteCompoundReferredNormally, ConditionBeanSetupper<WhiteCompoundPkCB> conditionBeanSetupper) {
        xassLRArg(whiteCompoundReferredNormally, conditionBeanSetupper);
        return loadWhiteCompoundPkList(xnewLRLs(whiteCompoundReferredNormally), conditionBeanSetupper);
    }

    /**
     * Load referrer of whiteCompoundPkList by the set-upper of referrer. <br />
     * white_compound_pk by REFERRED_ID, named 'whiteCompoundPkList'.
     * <pre>
     * whiteCompoundReferredNormallyBhv.<span style="color: #DD4747">loadWhiteCompoundPkList</span>(whiteCompoundReferredNormallyList, new ConditionBeanSetupper&lt;WhiteCompoundPkCB&gt;() {
     *     public void setup(WhiteCompoundPkCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here by calling like '}).withNestedList(new ...)'</span>
     * for (WhiteCompoundReferredNormally whiteCompoundReferredNormally : whiteCompoundReferredNormallyList) {
     *     ... = whiteCompoundReferredNormally.<span style="color: #DD4747">getWhiteCompoundPkList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setReferredId_InScope(pkList);
     * cb.query().addOrderBy_ReferredId_Asc();
     * </pre>
     * @param whiteCompoundReferredNormallyList The entity list of whiteCompoundReferredNormally. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<WhiteCompoundPk> loadWhiteCompoundPkList(List<WhiteCompoundReferredNormally> whiteCompoundReferredNormallyList, ConditionBeanSetupper<WhiteCompoundPkCB> conditionBeanSetupper) {
        xassLRArg(whiteCompoundReferredNormallyList, conditionBeanSetupper);
        return loadWhiteCompoundPkList(whiteCompoundReferredNormallyList, new LoadReferrerOption<WhiteCompoundPkCB, WhiteCompoundPk>().xinit(conditionBeanSetupper));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param whiteCompoundReferredNormally The entity of whiteCompoundReferredNormally. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<WhiteCompoundPk> loadWhiteCompoundPkList(WhiteCompoundReferredNormally whiteCompoundReferredNormally, LoadReferrerOption<WhiteCompoundPkCB, WhiteCompoundPk> loadReferrerOption) {
        xassLRArg(whiteCompoundReferredNormally, loadReferrerOption);
        return loadWhiteCompoundPkList(xnewLRLs(whiteCompoundReferredNormally), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param whiteCompoundReferredNormallyList The entity list of whiteCompoundReferredNormally. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerLoader<WhiteCompoundPk> loadWhiteCompoundPkList(List<WhiteCompoundReferredNormally> whiteCompoundReferredNormallyList, LoadReferrerOption<WhiteCompoundPkCB, WhiteCompoundPk> loadReferrerOption) {
        xassLRArg(whiteCompoundReferredNormallyList, loadReferrerOption);
        if (whiteCompoundReferredNormallyList.isEmpty()) { return (NestedReferrerLoader<WhiteCompoundPk>)EMPTY_LOADER; }
        return doLoadWhiteCompoundPkList(whiteCompoundReferredNormallyList, loadReferrerOption);
    }

    protected NestedReferrerLoader<WhiteCompoundPk> doLoadWhiteCompoundPkList(List<WhiteCompoundReferredNormally> whiteCompoundReferredNormallyList, LoadReferrerOption<WhiteCompoundPkCB, WhiteCompoundPk> option) {
        final WhiteCompoundPkBhv referrerBhv = xgetBSFLR().select(WhiteCompoundPkBhv.class);
        return helpLoadReferrerInternally(whiteCompoundReferredNormallyList, option, new InternalLoadReferrerCallback<WhiteCompoundReferredNormally, Integer, WhiteCompoundPkCB, WhiteCompoundPk>() {
            public Integer getPKVal(WhiteCompoundReferredNormally et)
            { return et.getReferredId(); }
            public void setRfLs(WhiteCompoundReferredNormally et, List<WhiteCompoundPk> ls)
            { et.setWhiteCompoundPkList(ls); }
            public WhiteCompoundPkCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(WhiteCompoundPkCB cb, List<Integer> ls)
            { cb.query().setReferredId_InScope(ls); }
            public void qyOdFKAsc(WhiteCompoundPkCB cb) { cb.query().addOrderBy_ReferredId_Asc(); }
            public void spFKCol(WhiteCompoundPkCB cb) { cb.specify().columnReferredId(); }
            public List<WhiteCompoundPk> selRfLs(WhiteCompoundPkCB cb) { return referrerBhv.selectList(cb); }
            public Integer getFKVal(WhiteCompoundPk re) { return re.getReferredId(); }
            public void setlcEt(WhiteCompoundPk re, WhiteCompoundReferredNormally le)
            { re.setWhiteCompoundReferredNormally(le); }
            public String getRfPrNm() { return "whiteCompoundPkList"; }
        });
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key referredId.
     * @param whiteCompoundReferredNormallyList The list of whiteCompoundReferredNormally. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractReferredIdList(List<WhiteCompoundReferredNormally> whiteCompoundReferredNormallyList) {
        return helpExtractListInternally(whiteCompoundReferredNormallyList, new InternalExtractCallback<WhiteCompoundReferredNormally, Integer>() {
            public Integer getCV(WhiteCompoundReferredNormally et) { return et.getReferredId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteCompoundReferredNormally whiteCompoundReferredNormally = new WhiteCompoundReferredNormally();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteCompoundReferredNormally.setFoo...(value);
     * whiteCompoundReferredNormally.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteCompoundReferredNormally.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteCompoundReferredNormally.set...;</span>
     * whiteCompoundReferredNormallyBhv.<span style="color: #DD4747">insert</span>(whiteCompoundReferredNormally);
     * ... = whiteCompoundReferredNormally.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteCompoundReferredNormally The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteCompoundReferredNormally whiteCompoundReferredNormally) {
        doInsert(whiteCompoundReferredNormally, null);
    }

    protected void doInsert(WhiteCompoundReferredNormally whiteCompoundReferredNormally, InsertOption<WhiteCompoundReferredNormallyCB> op) {
        assertObjectNotNull("whiteCompoundReferredNormally", whiteCompoundReferredNormally);
        prepareInsertOption(op);
        delegateInsert(whiteCompoundReferredNormally, op);
    }

    protected void prepareInsertOption(InsertOption<WhiteCompoundReferredNormallyCB> op) {
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
     * WhiteCompoundReferredNormally whiteCompoundReferredNormally = new WhiteCompoundReferredNormally();
     * whiteCompoundReferredNormally.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteCompoundReferredNormally.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteCompoundReferredNormally.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteCompoundReferredNormally.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteCompoundReferredNormally.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteCompoundReferredNormallyBhv.<span style="color: #DD4747">update</span>(whiteCompoundReferredNormally);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteCompoundReferredNormally The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final WhiteCompoundReferredNormally whiteCompoundReferredNormally) {
        doUpdate(whiteCompoundReferredNormally, null);
    }

    protected void doUpdate(WhiteCompoundReferredNormally whiteCompoundReferredNormally, final UpdateOption<WhiteCompoundReferredNormallyCB> op) {
        assertObjectNotNull("whiteCompoundReferredNormally", whiteCompoundReferredNormally);
        prepareUpdateOption(op);
        helpUpdateInternally(whiteCompoundReferredNormally, new InternalUpdateCallback<WhiteCompoundReferredNormally>() {
            public int callbackDelegateUpdate(WhiteCompoundReferredNormally et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhiteCompoundReferredNormallyCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected WhiteCompoundReferredNormallyCB createCBForVaryingUpdate() {
        WhiteCompoundReferredNormallyCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected WhiteCompoundReferredNormallyCB createCBForSpecifiedUpdate() {
        WhiteCompoundReferredNormallyCB cb = newMyConditionBean();
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
     * @param whiteCompoundReferredNormally The entity of insert or update target. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteCompoundReferredNormally whiteCompoundReferredNormally) {
        doInesrtOrUpdate(whiteCompoundReferredNormally, null, null);
    }

    protected void doInesrtOrUpdate(WhiteCompoundReferredNormally whiteCompoundReferredNormally, final InsertOption<WhiteCompoundReferredNormallyCB> iop, final UpdateOption<WhiteCompoundReferredNormallyCB> uop) {
        helpInsertOrUpdateInternally(whiteCompoundReferredNormally, new InternalInsertOrUpdateCallback<WhiteCompoundReferredNormally, WhiteCompoundReferredNormallyCB>() {
            public void callbackInsert(WhiteCompoundReferredNormally et) { doInsert(et, iop); }
            public void callbackUpdate(WhiteCompoundReferredNormally et) { doUpdate(et, uop); }
            public WhiteCompoundReferredNormallyCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(WhiteCompoundReferredNormallyCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<WhiteCompoundReferredNormallyCB>();
            uop = uop != null ? uop : new UpdateOption<WhiteCompoundReferredNormallyCB>();
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
     * WhiteCompoundReferredNormally whiteCompoundReferredNormally = new WhiteCompoundReferredNormally();
     * whiteCompoundReferredNormally.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteCompoundReferredNormally.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteCompoundReferredNormallyBhv.<span style="color: #DD4747">delete</span>(whiteCompoundReferredNormally);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteCompoundReferredNormally The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteCompoundReferredNormally whiteCompoundReferredNormally) {
        doDelete(whiteCompoundReferredNormally, null);
    }

    protected void doDelete(WhiteCompoundReferredNormally whiteCompoundReferredNormally, final DeleteOption<WhiteCompoundReferredNormallyCB> op) {
        assertObjectNotNull("whiteCompoundReferredNormally", whiteCompoundReferredNormally);
        prepareDeleteOption(op);
        helpDeleteInternally(whiteCompoundReferredNormally, new InternalDeleteCallback<WhiteCompoundReferredNormally>() {
            public int callbackDelegateDelete(WhiteCompoundReferredNormally et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhiteCompoundReferredNormallyCB> op) {
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
     *     WhiteCompoundReferredNormally whiteCompoundReferredNormally = new WhiteCompoundReferredNormally();
     *     whiteCompoundReferredNormally.setFooName("foo");
     *     if (...) {
     *         whiteCompoundReferredNormally.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteCompoundReferredNormallyList.add(whiteCompoundReferredNormally);
     * }
     * whiteCompoundReferredNormallyBhv.<span style="color: #DD4747">batchInsert</span>(whiteCompoundReferredNormallyList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteCompoundReferredNormallyList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteCompoundReferredNormally> whiteCompoundReferredNormallyList) {
        InsertOption<WhiteCompoundReferredNormallyCB> op = createInsertUpdateOption();
        return doBatchInsert(whiteCompoundReferredNormallyList, op);
    }

    protected int[] doBatchInsert(List<WhiteCompoundReferredNormally> whiteCompoundReferredNormallyList, InsertOption<WhiteCompoundReferredNormallyCB> op) {
        assertObjectNotNull("whiteCompoundReferredNormallyList", whiteCompoundReferredNormallyList);
        prepareBatchInsertOption(whiteCompoundReferredNormallyList, op);
        return delegateBatchInsert(whiteCompoundReferredNormallyList, op);
    }

    protected void prepareBatchInsertOption(List<WhiteCompoundReferredNormally> whiteCompoundReferredNormallyList, InsertOption<WhiteCompoundReferredNormallyCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(whiteCompoundReferredNormallyList);
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
     *     WhiteCompoundReferredNormally whiteCompoundReferredNormally = new WhiteCompoundReferredNormally();
     *     whiteCompoundReferredNormally.setFooName("foo");
     *     if (...) {
     *         whiteCompoundReferredNormally.setFooPrice(123);
     *     } else {
     *         whiteCompoundReferredNormally.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteCompoundReferredNormally.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteCompoundReferredNormallyList.add(whiteCompoundReferredNormally);
     * }
     * whiteCompoundReferredNormallyBhv.<span style="color: #DD4747">batchUpdate</span>(whiteCompoundReferredNormallyList);
     * </pre>
     * @param whiteCompoundReferredNormallyList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteCompoundReferredNormally> whiteCompoundReferredNormallyList) {
        UpdateOption<WhiteCompoundReferredNormallyCB> op = createPlainUpdateOption();
        return doBatchUpdate(whiteCompoundReferredNormallyList, op);
    }

    protected int[] doBatchUpdate(List<WhiteCompoundReferredNormally> whiteCompoundReferredNormallyList, UpdateOption<WhiteCompoundReferredNormallyCB> op) {
        assertObjectNotNull("whiteCompoundReferredNormallyList", whiteCompoundReferredNormallyList);
        prepareBatchUpdateOption(whiteCompoundReferredNormallyList, op);
        return delegateBatchUpdate(whiteCompoundReferredNormallyList, op);
    }

    protected void prepareBatchUpdateOption(List<WhiteCompoundReferredNormally> whiteCompoundReferredNormallyList, UpdateOption<WhiteCompoundReferredNormallyCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(whiteCompoundReferredNormallyList);
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
     * whiteCompoundReferredNormallyBhv.<span style="color: #DD4747">batchUpdate</span>(whiteCompoundReferredNormallyList, new SpecifyQuery<WhiteCompoundReferredNormallyCB>() {
     *     public void specify(WhiteCompoundReferredNormallyCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteCompoundReferredNormallyBhv.<span style="color: #DD4747">batchUpdate</span>(whiteCompoundReferredNormallyList, new SpecifyQuery<WhiteCompoundReferredNormallyCB>() {
     *     public void specify(WhiteCompoundReferredNormallyCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteCompoundReferredNormallyList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteCompoundReferredNormally> whiteCompoundReferredNormallyList, SpecifyQuery<WhiteCompoundReferredNormallyCB> updateColumnSpec) {
        return doBatchUpdate(whiteCompoundReferredNormallyList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteCompoundReferredNormallyList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteCompoundReferredNormally> whiteCompoundReferredNormallyList) {
        return doBatchDelete(whiteCompoundReferredNormallyList, null);
    }

    protected int[] doBatchDelete(List<WhiteCompoundReferredNormally> whiteCompoundReferredNormallyList, DeleteOption<WhiteCompoundReferredNormallyCB> op) {
        assertObjectNotNull("whiteCompoundReferredNormallyList", whiteCompoundReferredNormallyList);
        prepareDeleteOption(op);
        return delegateBatchDelete(whiteCompoundReferredNormallyList, op);
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
     * whiteCompoundReferredNormallyBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteCompoundReferredNormally, WhiteCompoundReferredNormallyCB&gt;() {
     *     public ConditionBean setup(whiteCompoundReferredNormally entity, WhiteCompoundReferredNormallyCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteCompoundReferredNormally, WhiteCompoundReferredNormallyCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteCompoundReferredNormally, WhiteCompoundReferredNormallyCB> sp, InsertOption<WhiteCompoundReferredNormallyCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        WhiteCompoundReferredNormally e = new WhiteCompoundReferredNormally();
        WhiteCompoundReferredNormallyCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected WhiteCompoundReferredNormallyCB createCBForQueryInsert() {
        WhiteCompoundReferredNormallyCB cb = newMyConditionBean();
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
     * WhiteCompoundReferredNormally whiteCompoundReferredNormally = new WhiteCompoundReferredNormally();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteCompoundReferredNormally.setPK...(value);</span>
     * whiteCompoundReferredNormally.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteCompoundReferredNormally.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteCompoundReferredNormally.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteCompoundReferredNormally.setVersionNo(value);</span>
     * WhiteCompoundReferredNormallyCB cb = new WhiteCompoundReferredNormallyCB();
     * cb.query().setFoo...(value);
     * whiteCompoundReferredNormallyBhv.<span style="color: #DD4747">queryUpdate</span>(whiteCompoundReferredNormally, cb);
     * </pre>
     * @param whiteCompoundReferredNormally The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteCompoundReferredNormally. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteCompoundReferredNormally whiteCompoundReferredNormally, WhiteCompoundReferredNormallyCB cb) {
        return doQueryUpdate(whiteCompoundReferredNormally, cb, null);
    }

    protected int doQueryUpdate(WhiteCompoundReferredNormally whiteCompoundReferredNormally, WhiteCompoundReferredNormallyCB cb, UpdateOption<WhiteCompoundReferredNormallyCB> op) {
        assertObjectNotNull("whiteCompoundReferredNormally", whiteCompoundReferredNormally); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(whiteCompoundReferredNormally, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (WhiteCompoundReferredNormallyCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (WhiteCompoundReferredNormallyCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteCompoundReferredNormallyCB cb = new WhiteCompoundReferredNormallyCB();
     * cb.query().setFoo...(value);
     * whiteCompoundReferredNormallyBhv.<span style="color: #DD4747">queryDelete</span>(whiteCompoundReferredNormally, cb);
     * </pre>
     * @param cb The condition-bean of WhiteCompoundReferredNormally. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteCompoundReferredNormallyCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteCompoundReferredNormallyCB cb, DeleteOption<WhiteCompoundReferredNormallyCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((WhiteCompoundReferredNormallyCB)cb); }
        else { return varyingQueryDelete((WhiteCompoundReferredNormallyCB)cb, downcast(op)); }
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
     * WhiteCompoundReferredNormally whiteCompoundReferredNormally = new WhiteCompoundReferredNormally();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteCompoundReferredNormally.setFoo...(value);
     * whiteCompoundReferredNormally.setBar...(value);
     * InsertOption<WhiteCompoundReferredNormallyCB> option = new InsertOption<WhiteCompoundReferredNormallyCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteCompoundReferredNormallyBhv.<span style="color: #DD4747">varyingInsert</span>(whiteCompoundReferredNormally, option);
     * ... = whiteCompoundReferredNormally.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteCompoundReferredNormally The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteCompoundReferredNormally whiteCompoundReferredNormally, InsertOption<WhiteCompoundReferredNormallyCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteCompoundReferredNormally, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteCompoundReferredNormally whiteCompoundReferredNormally = new WhiteCompoundReferredNormally();
     * whiteCompoundReferredNormally.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteCompoundReferredNormally.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteCompoundReferredNormally.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteCompoundReferredNormallyCB&gt; option = new UpdateOption&lt;WhiteCompoundReferredNormallyCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteCompoundReferredNormallyCB&gt;() {
     *         public void specify(WhiteCompoundReferredNormallyCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteCompoundReferredNormallyBhv.<span style="color: #DD4747">varyingUpdate</span>(whiteCompoundReferredNormally, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteCompoundReferredNormally The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteCompoundReferredNormally whiteCompoundReferredNormally, UpdateOption<WhiteCompoundReferredNormallyCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteCompoundReferredNormally, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteCompoundReferredNormally The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteCompoundReferredNormally whiteCompoundReferredNormally, InsertOption<WhiteCompoundReferredNormallyCB> insertOption, UpdateOption<WhiteCompoundReferredNormallyCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(whiteCompoundReferredNormally, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteCompoundReferredNormally The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteCompoundReferredNormally whiteCompoundReferredNormally, DeleteOption<WhiteCompoundReferredNormallyCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteCompoundReferredNormally, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteCompoundReferredNormallyList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteCompoundReferredNormally> whiteCompoundReferredNormallyList, InsertOption<WhiteCompoundReferredNormallyCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteCompoundReferredNormallyList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteCompoundReferredNormallyList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteCompoundReferredNormally> whiteCompoundReferredNormallyList, UpdateOption<WhiteCompoundReferredNormallyCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteCompoundReferredNormallyList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteCompoundReferredNormallyList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteCompoundReferredNormally> whiteCompoundReferredNormallyList, DeleteOption<WhiteCompoundReferredNormallyCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteCompoundReferredNormallyList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteCompoundReferredNormally, WhiteCompoundReferredNormallyCB> setupper, InsertOption<WhiteCompoundReferredNormallyCB> option) {
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
     * WhiteCompoundReferredNormally whiteCompoundReferredNormally = new WhiteCompoundReferredNormally();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteCompoundReferredNormally.setPK...(value);</span>
     * whiteCompoundReferredNormally.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteCompoundReferredNormally.setVersionNo(value);</span>
     * WhiteCompoundReferredNormallyCB cb = new WhiteCompoundReferredNormallyCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteCompoundReferredNormallyCB&gt; option = new UpdateOption&lt;WhiteCompoundReferredNormallyCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteCompoundReferredNormallyCB&gt;() {
     *     public void specify(WhiteCompoundReferredNormallyCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteCompoundReferredNormallyBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteCompoundReferredNormally, cb, option);
     * </pre>
     * @param whiteCompoundReferredNormally The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteCompoundReferredNormally. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteCompoundReferredNormally whiteCompoundReferredNormally, WhiteCompoundReferredNormallyCB cb, UpdateOption<WhiteCompoundReferredNormallyCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteCompoundReferredNormally, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteCompoundReferredNormally. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteCompoundReferredNormallyCB cb, DeleteOption<WhiteCompoundReferredNormallyCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteCompoundReferredNormallyBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhiteCompoundReferredNormallyCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhiteCompoundReferredNormallyCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhiteCompoundReferredNormally> void delegateSelectCursor(WhiteCompoundReferredNormallyCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends WhiteCompoundReferredNormally> List<ENTITY> delegateSelectList(WhiteCompoundReferredNormallyCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhiteCompoundReferredNormally et, InsertOption<WhiteCompoundReferredNormallyCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(WhiteCompoundReferredNormally et, UpdateOption<WhiteCompoundReferredNormallyCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(WhiteCompoundReferredNormally et, UpdateOption<WhiteCompoundReferredNormallyCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(WhiteCompoundReferredNormally et, DeleteOption<WhiteCompoundReferredNormallyCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(WhiteCompoundReferredNormally et, DeleteOption<WhiteCompoundReferredNormallyCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<WhiteCompoundReferredNormally> ls, InsertOption<WhiteCompoundReferredNormallyCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhiteCompoundReferredNormally> ls, UpdateOption<WhiteCompoundReferredNormallyCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhiteCompoundReferredNormally> ls, UpdateOption<WhiteCompoundReferredNormallyCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhiteCompoundReferredNormally> ls, DeleteOption<WhiteCompoundReferredNormallyCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhiteCompoundReferredNormally> ls, DeleteOption<WhiteCompoundReferredNormallyCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhiteCompoundReferredNormally et, WhiteCompoundReferredNormallyCB inCB, ConditionBean resCB, InsertOption<WhiteCompoundReferredNormallyCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhiteCompoundReferredNormally et, WhiteCompoundReferredNormallyCB cb, UpdateOption<WhiteCompoundReferredNormallyCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(WhiteCompoundReferredNormallyCB cb, DeleteOption<WhiteCompoundReferredNormallyCB> op)
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
    protected WhiteCompoundReferredNormally downcast(Entity et) {
        return helpEntityDowncastInternally(et, WhiteCompoundReferredNormally.class);
    }

    protected WhiteCompoundReferredNormallyCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, WhiteCompoundReferredNormallyCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<WhiteCompoundReferredNormally> downcast(List<? extends Entity> ls) {
        return (List<WhiteCompoundReferredNormally>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteCompoundReferredNormallyCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<WhiteCompoundReferredNormallyCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteCompoundReferredNormallyCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<WhiteCompoundReferredNormallyCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteCompoundReferredNormallyCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<WhiteCompoundReferredNormallyCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteCompoundReferredNormally, WhiteCompoundReferredNormallyCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<WhiteCompoundReferredNormally, WhiteCompoundReferredNormallyCB>)sp;
    }
}
