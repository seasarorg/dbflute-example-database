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
import com.example.dbflute.mysql.dbflute.exbhv.*;
import com.example.dbflute.mysql.dbflute.exentity.*;
import com.example.dbflute.mysql.dbflute.bsentity.dbmeta.*;
import com.example.dbflute.mysql.dbflute.cbean.*;

/**
 * The behavior of WHITE_COMPOUND_REFERRED_PRIMARY as TABLE. <br />
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
public abstract class BsWhiteCompoundReferredPrimaryBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_compound_referred_primary"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return WhiteCompoundReferredPrimaryDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteCompoundReferredPrimaryDbm getMyDBMeta() { return WhiteCompoundReferredPrimaryDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteCompoundReferredPrimary newMyEntity() { return new WhiteCompoundReferredPrimary(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteCompoundReferredPrimaryCB newMyConditionBean() { return new WhiteCompoundReferredPrimaryCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteCompoundReferredPrimaryCB cb = new WhiteCompoundReferredPrimaryCB();
     * cb.query().setFoo...(value);
     * int count = whiteCompoundReferredPrimaryBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteCompoundReferredPrimary. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteCompoundReferredPrimaryCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteCompoundReferredPrimaryCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteCompoundReferredPrimaryCB cb) { // called by selectPage(cb)
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
     * WhiteCompoundReferredPrimaryCB cb = new WhiteCompoundReferredPrimaryCB();
     * cb.query().setFoo...(value);
     * WhiteCompoundReferredPrimary whiteCompoundReferredPrimary = whiteCompoundReferredPrimaryBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (whiteCompoundReferredPrimary != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = whiteCompoundReferredPrimary.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteCompoundReferredPrimary. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteCompoundReferredPrimary selectEntity(WhiteCompoundReferredPrimaryCB cb) {
        return doSelectEntity(cb, WhiteCompoundReferredPrimary.class);
    }

    protected <ENTITY extends WhiteCompoundReferredPrimary> ENTITY doSelectEntity(WhiteCompoundReferredPrimaryCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, WhiteCompoundReferredPrimaryCB>() {
            public List<ENTITY> callbackSelectList(WhiteCompoundReferredPrimaryCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    protected <ENTITY extends WhiteCompoundReferredPrimary> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteCompoundReferredPrimaryCB cb, Class<ENTITY> tp) {
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
     * WhiteCompoundReferredPrimaryCB cb = new WhiteCompoundReferredPrimaryCB();
     * cb.query().setFoo...(value);
     * WhiteCompoundReferredPrimary whiteCompoundReferredPrimary = whiteCompoundReferredPrimaryBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteCompoundReferredPrimary.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteCompoundReferredPrimary. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteCompoundReferredPrimary selectEntityWithDeletedCheck(WhiteCompoundReferredPrimaryCB cb) {
        return doSelectEntityWithDeletedCheck(cb, WhiteCompoundReferredPrimary.class);
    }

    protected <ENTITY extends WhiteCompoundReferredPrimary> ENTITY doSelectEntityWithDeletedCheck(WhiteCompoundReferredPrimaryCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteCompoundReferredPrimaryCB>() {
            public List<ENTITY> callbackSelectList(WhiteCompoundReferredPrimaryCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param referredId : PK, NotNull, INT(10). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteCompoundReferredPrimary selectByPKValue(Integer referredId) {
        return doSelectByPK(referredId, WhiteCompoundReferredPrimary.class);
    }

    protected <ENTITY extends WhiteCompoundReferredPrimary> ENTITY doSelectByPK(Integer referredId, Class<ENTITY> entityType) {
        return doSelectEntity(xprepareCBAsPK(referredId), entityType);
    }

    protected <ENTITY extends WhiteCompoundReferredPrimary> OptionalEntity<ENTITY> doSelectOptionalByPK(Integer referredId, Class<ENTITY> entityType) {
        return createOptionalEntity(doSelectByPK(referredId, entityType), referredId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param referredId : PK, NotNull, INT(10). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteCompoundReferredPrimary selectByPKValueWithDeletedCheck(Integer referredId) {
        return doSelectByPKWithDeletedCheck(referredId, WhiteCompoundReferredPrimary.class);
    }

    protected <ENTITY extends WhiteCompoundReferredPrimary> ENTITY doSelectByPKWithDeletedCheck(Integer referredId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(referredId), entityType);
    }

    protected WhiteCompoundReferredPrimaryCB xprepareCBAsPK(Integer referredId) {
        assertObjectNotNull("referredId", referredId);
        WhiteCompoundReferredPrimaryCB cb = newMyConditionBean(); cb.acceptPrimaryKey(referredId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteCompoundReferredPrimaryCB cb = new WhiteCompoundReferredPrimaryCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteCompoundReferredPrimary&gt; whiteCompoundReferredPrimaryList = whiteCompoundReferredPrimaryBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteCompoundReferredPrimary whiteCompoundReferredPrimary : whiteCompoundReferredPrimaryList) {
     *     ... = whiteCompoundReferredPrimary.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteCompoundReferredPrimary. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteCompoundReferredPrimary> selectList(WhiteCompoundReferredPrimaryCB cb) {
        return doSelectList(cb, WhiteCompoundReferredPrimary.class);
    }

    protected <ENTITY extends WhiteCompoundReferredPrimary> ListResultBean<ENTITY> doSelectList(WhiteCompoundReferredPrimaryCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, WhiteCompoundReferredPrimaryCB>() {
            public List<ENTITY> callbackSelectList(WhiteCompoundReferredPrimaryCB lcb, Class<ENTITY> ltp) { return delegateSelectList(lcb, ltp); } });
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
     * WhiteCompoundReferredPrimaryCB cb = new WhiteCompoundReferredPrimaryCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteCompoundReferredPrimary&gt; page = whiteCompoundReferredPrimaryBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteCompoundReferredPrimary whiteCompoundReferredPrimary : page) {
     *     ... = whiteCompoundReferredPrimary.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteCompoundReferredPrimary. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteCompoundReferredPrimary> selectPage(WhiteCompoundReferredPrimaryCB cb) {
        return doSelectPage(cb, WhiteCompoundReferredPrimary.class);
    }

    protected <ENTITY extends WhiteCompoundReferredPrimary> PagingResultBean<ENTITY> doSelectPage(WhiteCompoundReferredPrimaryCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, WhiteCompoundReferredPrimaryCB>() {
            public int callbackSelectCount(WhiteCompoundReferredPrimaryCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteCompoundReferredPrimaryCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * WhiteCompoundReferredPrimaryCB cb = new WhiteCompoundReferredPrimaryCB();
     * cb.query().setFoo...(value);
     * whiteCompoundReferredPrimaryBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteCompoundReferredPrimary&gt;() {
     *     public void handle(WhiteCompoundReferredPrimary entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteCompoundReferredPrimary. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteCompoundReferredPrimary. (NotNull)
     */
    public void selectCursor(WhiteCompoundReferredPrimaryCB cb, EntityRowHandler<WhiteCompoundReferredPrimary> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, WhiteCompoundReferredPrimary.class);
    }

    protected <ENTITY extends WhiteCompoundReferredPrimary> void doSelectCursor(WhiteCompoundReferredPrimaryCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, WhiteCompoundReferredPrimaryCB>() {
            public void callbackSelectCursor(WhiteCompoundReferredPrimaryCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(WhiteCompoundReferredPrimaryCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteCompoundReferredPrimaryBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteCompoundReferredPrimaryCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<WhiteCompoundReferredPrimaryCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends WhiteCompoundReferredPrimaryCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends WhiteCompoundReferredPrimaryCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
     * white_compound_pk by PK_SECOND_ID, named 'whiteCompoundPkList'.
     * <pre>
     * whiteCompoundReferredPrimaryBhv.<span style="color: #DD4747">loadWhiteCompoundPkList</span>(whiteCompoundReferredPrimaryList, new ConditionBeanSetupper&lt;WhiteCompoundPkCB&gt;() {
     *     public void setup(WhiteCompoundPkCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (WhiteCompoundReferredPrimary whiteCompoundReferredPrimary : whiteCompoundReferredPrimaryList) {
     *     ... = whiteCompoundReferredPrimary.<span style="color: #DD4747">getWhiteCompoundPkList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPkSecondId_InScope(pkList);
     * cb.query().addOrderBy_PkSecondId_Asc();
     * </pre>
     * @param whiteCompoundReferredPrimaryList The entity list of whiteCompoundReferredPrimary. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<WhiteCompoundPk> loadWhiteCompoundPkList(List<WhiteCompoundReferredPrimary> whiteCompoundReferredPrimaryList, ConditionBeanSetupper<WhiteCompoundPkCB> setupper) {
        xassLRArg(whiteCompoundReferredPrimaryList, setupper);
        return doLoadWhiteCompoundPkList(whiteCompoundReferredPrimaryList, new LoadReferrerOption<WhiteCompoundPkCB, WhiteCompoundPk>().xinit(setupper));
    }

    /**
     * Load referrer of whiteCompoundPkList by the set-upper of referrer. <br />
     * white_compound_pk by PK_SECOND_ID, named 'whiteCompoundPkList'.
     * <pre>
     * whiteCompoundReferredPrimaryBhv.<span style="color: #DD4747">loadWhiteCompoundPkList</span>(whiteCompoundReferredPrimaryList, new ConditionBeanSetupper&lt;WhiteCompoundPkCB&gt;() {
     *     public void setup(WhiteCompoundPkCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = whiteCompoundReferredPrimary.<span style="color: #DD4747">getWhiteCompoundPkList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPkSecondId_InScope(pkList);
     * cb.query().addOrderBy_PkSecondId_Asc();
     * </pre>
     * @param whiteCompoundReferredPrimary The entity of whiteCompoundReferredPrimary. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<WhiteCompoundPk> loadWhiteCompoundPkList(WhiteCompoundReferredPrimary whiteCompoundReferredPrimary, ConditionBeanSetupper<WhiteCompoundPkCB> setupper) {
        xassLRArg(whiteCompoundReferredPrimary, setupper);
        return doLoadWhiteCompoundPkList(xnewLRLs(whiteCompoundReferredPrimary), new LoadReferrerOption<WhiteCompoundPkCB, WhiteCompoundPk>().xinit(setupper));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param whiteCompoundReferredPrimary The entity of whiteCompoundReferredPrimary. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<WhiteCompoundPk> loadWhiteCompoundPkList(WhiteCompoundReferredPrimary whiteCompoundReferredPrimary, LoadReferrerOption<WhiteCompoundPkCB, WhiteCompoundPk> loadReferrerOption) {
        xassLRArg(whiteCompoundReferredPrimary, loadReferrerOption);
        return loadWhiteCompoundPkList(xnewLRLs(whiteCompoundReferredPrimary), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean setupper.} #beforejava8
     * @param whiteCompoundReferredPrimaryList The entity list of whiteCompoundReferredPrimary. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerLoader<WhiteCompoundPk> loadWhiteCompoundPkList(List<WhiteCompoundReferredPrimary> whiteCompoundReferredPrimaryList, LoadReferrerOption<WhiteCompoundPkCB, WhiteCompoundPk> loadReferrerOption) {
        xassLRArg(whiteCompoundReferredPrimaryList, loadReferrerOption);
        if (whiteCompoundReferredPrimaryList.isEmpty()) { return (NestedReferrerLoader<WhiteCompoundPk>)EMPTY_LOADER; }
        return doLoadWhiteCompoundPkList(whiteCompoundReferredPrimaryList, loadReferrerOption);
    }

    protected NestedReferrerLoader<WhiteCompoundPk> doLoadWhiteCompoundPkList(List<WhiteCompoundReferredPrimary> whiteCompoundReferredPrimaryList, LoadReferrerOption<WhiteCompoundPkCB, WhiteCompoundPk> option) {
        final WhiteCompoundPkBhv referrerBhv = xgetBSFLR().select(WhiteCompoundPkBhv.class);
        return helpLoadReferrerInternally(whiteCompoundReferredPrimaryList, option, new InternalLoadReferrerCallback<WhiteCompoundReferredPrimary, Integer, WhiteCompoundPkCB, WhiteCompoundPk>() {
            public Integer getPKVal(WhiteCompoundReferredPrimary et)
            { return et.getReferredId(); }
            public void setRfLs(WhiteCompoundReferredPrimary et, List<WhiteCompoundPk> ls)
            { et.setWhiteCompoundPkList(ls); }
            public WhiteCompoundPkCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(WhiteCompoundPkCB cb, List<Integer> ls)
            { cb.query().setPkSecondId_InScope(ls); }
            public void qyOdFKAsc(WhiteCompoundPkCB cb) { cb.query().addOrderBy_PkSecondId_Asc(); }
            public void spFKCol(WhiteCompoundPkCB cb) { cb.specify().columnPkSecondId(); }
            public List<WhiteCompoundPk> selRfLs(WhiteCompoundPkCB cb) { return referrerBhv.selectList(cb); }
            public Integer getFKVal(WhiteCompoundPk re) { return re.getPkSecondId(); }
            public void setlcEt(WhiteCompoundPk re, WhiteCompoundReferredPrimary le)
            { re.setWhiteCompoundReferredPrimary(le); }
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
     * @param whiteCompoundReferredPrimaryList The list of whiteCompoundReferredPrimary. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractReferredIdList(List<WhiteCompoundReferredPrimary> whiteCompoundReferredPrimaryList) {
        return helpExtractListInternally(whiteCompoundReferredPrimaryList, new InternalExtractCallback<WhiteCompoundReferredPrimary, Integer>() {
            public Integer getCV(WhiteCompoundReferredPrimary et) { return et.getReferredId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteCompoundReferredPrimary whiteCompoundReferredPrimary = new WhiteCompoundReferredPrimary();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteCompoundReferredPrimary.setFoo...(value);
     * whiteCompoundReferredPrimary.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteCompoundReferredPrimary.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteCompoundReferredPrimary.set...;</span>
     * whiteCompoundReferredPrimaryBhv.<span style="color: #DD4747">insert</span>(whiteCompoundReferredPrimary);
     * ... = whiteCompoundReferredPrimary.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteCompoundReferredPrimary The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteCompoundReferredPrimary whiteCompoundReferredPrimary) {
        doInsert(whiteCompoundReferredPrimary, null);
    }

    protected void doInsert(WhiteCompoundReferredPrimary whiteCompoundReferredPrimary, InsertOption<WhiteCompoundReferredPrimaryCB> op) {
        assertObjectNotNull("whiteCompoundReferredPrimary", whiteCompoundReferredPrimary);
        prepareInsertOption(op);
        delegateInsert(whiteCompoundReferredPrimary, op);
    }

    protected void prepareInsertOption(InsertOption<WhiteCompoundReferredPrimaryCB> op) {
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
     * WhiteCompoundReferredPrimary whiteCompoundReferredPrimary = new WhiteCompoundReferredPrimary();
     * whiteCompoundReferredPrimary.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteCompoundReferredPrimary.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteCompoundReferredPrimary.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteCompoundReferredPrimary.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteCompoundReferredPrimary.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteCompoundReferredPrimaryBhv.<span style="color: #DD4747">update</span>(whiteCompoundReferredPrimary);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteCompoundReferredPrimary The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final WhiteCompoundReferredPrimary whiteCompoundReferredPrimary) {
        doUpdate(whiteCompoundReferredPrimary, null);
    }

    protected void doUpdate(WhiteCompoundReferredPrimary whiteCompoundReferredPrimary, final UpdateOption<WhiteCompoundReferredPrimaryCB> op) {
        assertObjectNotNull("whiteCompoundReferredPrimary", whiteCompoundReferredPrimary);
        prepareUpdateOption(op);
        helpUpdateInternally(whiteCompoundReferredPrimary, new InternalUpdateCallback<WhiteCompoundReferredPrimary>() {
            public int callbackDelegateUpdate(WhiteCompoundReferredPrimary et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhiteCompoundReferredPrimaryCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected WhiteCompoundReferredPrimaryCB createCBForVaryingUpdate() {
        WhiteCompoundReferredPrimaryCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected WhiteCompoundReferredPrimaryCB createCBForSpecifiedUpdate() {
        WhiteCompoundReferredPrimaryCB cb = newMyConditionBean();
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
     * @param whiteCompoundReferredPrimary The entity of insert or update target. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteCompoundReferredPrimary whiteCompoundReferredPrimary) {
        doInesrtOrUpdate(whiteCompoundReferredPrimary, null, null);
    }

    protected void doInesrtOrUpdate(WhiteCompoundReferredPrimary whiteCompoundReferredPrimary, final InsertOption<WhiteCompoundReferredPrimaryCB> iop, final UpdateOption<WhiteCompoundReferredPrimaryCB> uop) {
        helpInsertOrUpdateInternally(whiteCompoundReferredPrimary, new InternalInsertOrUpdateCallback<WhiteCompoundReferredPrimary, WhiteCompoundReferredPrimaryCB>() {
            public void callbackInsert(WhiteCompoundReferredPrimary et) { doInsert(et, iop); }
            public void callbackUpdate(WhiteCompoundReferredPrimary et) { doUpdate(et, uop); }
            public WhiteCompoundReferredPrimaryCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(WhiteCompoundReferredPrimaryCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<WhiteCompoundReferredPrimaryCB>();
            uop = uop != null ? uop : new UpdateOption<WhiteCompoundReferredPrimaryCB>();
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
     * WhiteCompoundReferredPrimary whiteCompoundReferredPrimary = new WhiteCompoundReferredPrimary();
     * whiteCompoundReferredPrimary.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteCompoundReferredPrimary.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteCompoundReferredPrimaryBhv.<span style="color: #DD4747">delete</span>(whiteCompoundReferredPrimary);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteCompoundReferredPrimary The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteCompoundReferredPrimary whiteCompoundReferredPrimary) {
        doDelete(whiteCompoundReferredPrimary, null);
    }

    protected void doDelete(WhiteCompoundReferredPrimary whiteCompoundReferredPrimary, final DeleteOption<WhiteCompoundReferredPrimaryCB> op) {
        assertObjectNotNull("whiteCompoundReferredPrimary", whiteCompoundReferredPrimary);
        prepareDeleteOption(op);
        helpDeleteInternally(whiteCompoundReferredPrimary, new InternalDeleteCallback<WhiteCompoundReferredPrimary>() {
            public int callbackDelegateDelete(WhiteCompoundReferredPrimary et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhiteCompoundReferredPrimaryCB> op) {
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
     *     WhiteCompoundReferredPrimary whiteCompoundReferredPrimary = new WhiteCompoundReferredPrimary();
     *     whiteCompoundReferredPrimary.setFooName("foo");
     *     if (...) {
     *         whiteCompoundReferredPrimary.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteCompoundReferredPrimaryList.add(whiteCompoundReferredPrimary);
     * }
     * whiteCompoundReferredPrimaryBhv.<span style="color: #DD4747">batchInsert</span>(whiteCompoundReferredPrimaryList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteCompoundReferredPrimaryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteCompoundReferredPrimary> whiteCompoundReferredPrimaryList) {
        InsertOption<WhiteCompoundReferredPrimaryCB> op = createInsertUpdateOption();
        return doBatchInsert(whiteCompoundReferredPrimaryList, op);
    }

    protected int[] doBatchInsert(List<WhiteCompoundReferredPrimary> whiteCompoundReferredPrimaryList, InsertOption<WhiteCompoundReferredPrimaryCB> op) {
        assertObjectNotNull("whiteCompoundReferredPrimaryList", whiteCompoundReferredPrimaryList);
        prepareBatchInsertOption(whiteCompoundReferredPrimaryList, op);
        return delegateBatchInsert(whiteCompoundReferredPrimaryList, op);
    }

    protected void prepareBatchInsertOption(List<WhiteCompoundReferredPrimary> whiteCompoundReferredPrimaryList, InsertOption<WhiteCompoundReferredPrimaryCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(whiteCompoundReferredPrimaryList);
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
     *     WhiteCompoundReferredPrimary whiteCompoundReferredPrimary = new WhiteCompoundReferredPrimary();
     *     whiteCompoundReferredPrimary.setFooName("foo");
     *     if (...) {
     *         whiteCompoundReferredPrimary.setFooPrice(123);
     *     } else {
     *         whiteCompoundReferredPrimary.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteCompoundReferredPrimary.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteCompoundReferredPrimaryList.add(whiteCompoundReferredPrimary);
     * }
     * whiteCompoundReferredPrimaryBhv.<span style="color: #DD4747">batchUpdate</span>(whiteCompoundReferredPrimaryList);
     * </pre>
     * @param whiteCompoundReferredPrimaryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteCompoundReferredPrimary> whiteCompoundReferredPrimaryList) {
        UpdateOption<WhiteCompoundReferredPrimaryCB> op = createPlainUpdateOption();
        return doBatchUpdate(whiteCompoundReferredPrimaryList, op);
    }

    protected int[] doBatchUpdate(List<WhiteCompoundReferredPrimary> whiteCompoundReferredPrimaryList, UpdateOption<WhiteCompoundReferredPrimaryCB> op) {
        assertObjectNotNull("whiteCompoundReferredPrimaryList", whiteCompoundReferredPrimaryList);
        prepareBatchUpdateOption(whiteCompoundReferredPrimaryList, op);
        return delegateBatchUpdate(whiteCompoundReferredPrimaryList, op);
    }

    protected void prepareBatchUpdateOption(List<WhiteCompoundReferredPrimary> whiteCompoundReferredPrimaryList, UpdateOption<WhiteCompoundReferredPrimaryCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(whiteCompoundReferredPrimaryList);
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
     * whiteCompoundReferredPrimaryBhv.<span style="color: #DD4747">batchUpdate</span>(whiteCompoundReferredPrimaryList, new SpecifyQuery<WhiteCompoundReferredPrimaryCB>() {
     *     public void specify(WhiteCompoundReferredPrimaryCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteCompoundReferredPrimaryBhv.<span style="color: #DD4747">batchUpdate</span>(whiteCompoundReferredPrimaryList, new SpecifyQuery<WhiteCompoundReferredPrimaryCB>() {
     *     public void specify(WhiteCompoundReferredPrimaryCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteCompoundReferredPrimaryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteCompoundReferredPrimary> whiteCompoundReferredPrimaryList, SpecifyQuery<WhiteCompoundReferredPrimaryCB> updateColumnSpec) {
        return doBatchUpdate(whiteCompoundReferredPrimaryList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteCompoundReferredPrimaryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteCompoundReferredPrimary> whiteCompoundReferredPrimaryList) {
        return doBatchDelete(whiteCompoundReferredPrimaryList, null);
    }

    protected int[] doBatchDelete(List<WhiteCompoundReferredPrimary> whiteCompoundReferredPrimaryList, DeleteOption<WhiteCompoundReferredPrimaryCB> op) {
        assertObjectNotNull("whiteCompoundReferredPrimaryList", whiteCompoundReferredPrimaryList);
        prepareDeleteOption(op);
        return delegateBatchDelete(whiteCompoundReferredPrimaryList, op);
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
     * whiteCompoundReferredPrimaryBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteCompoundReferredPrimary, WhiteCompoundReferredPrimaryCB&gt;() {
     *     public ConditionBean setup(whiteCompoundReferredPrimary entity, WhiteCompoundReferredPrimaryCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteCompoundReferredPrimary, WhiteCompoundReferredPrimaryCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteCompoundReferredPrimary, WhiteCompoundReferredPrimaryCB> sp, InsertOption<WhiteCompoundReferredPrimaryCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        WhiteCompoundReferredPrimary e = new WhiteCompoundReferredPrimary();
        WhiteCompoundReferredPrimaryCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected WhiteCompoundReferredPrimaryCB createCBForQueryInsert() {
        WhiteCompoundReferredPrimaryCB cb = newMyConditionBean();
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
     * WhiteCompoundReferredPrimary whiteCompoundReferredPrimary = new WhiteCompoundReferredPrimary();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteCompoundReferredPrimary.setPK...(value);</span>
     * whiteCompoundReferredPrimary.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteCompoundReferredPrimary.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteCompoundReferredPrimary.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteCompoundReferredPrimary.setVersionNo(value);</span>
     * WhiteCompoundReferredPrimaryCB cb = new WhiteCompoundReferredPrimaryCB();
     * cb.query().setFoo...(value);
     * whiteCompoundReferredPrimaryBhv.<span style="color: #DD4747">queryUpdate</span>(whiteCompoundReferredPrimary, cb);
     * </pre>
     * @param whiteCompoundReferredPrimary The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteCompoundReferredPrimary. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteCompoundReferredPrimary whiteCompoundReferredPrimary, WhiteCompoundReferredPrimaryCB cb) {
        return doQueryUpdate(whiteCompoundReferredPrimary, cb, null);
    }

    protected int doQueryUpdate(WhiteCompoundReferredPrimary whiteCompoundReferredPrimary, WhiteCompoundReferredPrimaryCB cb, UpdateOption<WhiteCompoundReferredPrimaryCB> op) {
        assertObjectNotNull("whiteCompoundReferredPrimary", whiteCompoundReferredPrimary); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(whiteCompoundReferredPrimary, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (WhiteCompoundReferredPrimaryCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (WhiteCompoundReferredPrimaryCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteCompoundReferredPrimaryCB cb = new WhiteCompoundReferredPrimaryCB();
     * cb.query().setFoo...(value);
     * whiteCompoundReferredPrimaryBhv.<span style="color: #DD4747">queryDelete</span>(whiteCompoundReferredPrimary, cb);
     * </pre>
     * @param cb The condition-bean of WhiteCompoundReferredPrimary. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteCompoundReferredPrimaryCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteCompoundReferredPrimaryCB cb, DeleteOption<WhiteCompoundReferredPrimaryCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((WhiteCompoundReferredPrimaryCB)cb); }
        else { return varyingQueryDelete((WhiteCompoundReferredPrimaryCB)cb, downcast(op)); }
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
     * WhiteCompoundReferredPrimary whiteCompoundReferredPrimary = new WhiteCompoundReferredPrimary();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteCompoundReferredPrimary.setFoo...(value);
     * whiteCompoundReferredPrimary.setBar...(value);
     * InsertOption<WhiteCompoundReferredPrimaryCB> option = new InsertOption<WhiteCompoundReferredPrimaryCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteCompoundReferredPrimaryBhv.<span style="color: #DD4747">varyingInsert</span>(whiteCompoundReferredPrimary, option);
     * ... = whiteCompoundReferredPrimary.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteCompoundReferredPrimary The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteCompoundReferredPrimary whiteCompoundReferredPrimary, InsertOption<WhiteCompoundReferredPrimaryCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteCompoundReferredPrimary, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteCompoundReferredPrimary whiteCompoundReferredPrimary = new WhiteCompoundReferredPrimary();
     * whiteCompoundReferredPrimary.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteCompoundReferredPrimary.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteCompoundReferredPrimary.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteCompoundReferredPrimaryCB&gt; option = new UpdateOption&lt;WhiteCompoundReferredPrimaryCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteCompoundReferredPrimaryCB&gt;() {
     *         public void specify(WhiteCompoundReferredPrimaryCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteCompoundReferredPrimaryBhv.<span style="color: #DD4747">varyingUpdate</span>(whiteCompoundReferredPrimary, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteCompoundReferredPrimary The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteCompoundReferredPrimary whiteCompoundReferredPrimary, UpdateOption<WhiteCompoundReferredPrimaryCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteCompoundReferredPrimary, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteCompoundReferredPrimary The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteCompoundReferredPrimary whiteCompoundReferredPrimary, InsertOption<WhiteCompoundReferredPrimaryCB> insertOption, UpdateOption<WhiteCompoundReferredPrimaryCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(whiteCompoundReferredPrimary, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteCompoundReferredPrimary The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteCompoundReferredPrimary whiteCompoundReferredPrimary, DeleteOption<WhiteCompoundReferredPrimaryCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteCompoundReferredPrimary, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteCompoundReferredPrimaryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteCompoundReferredPrimary> whiteCompoundReferredPrimaryList, InsertOption<WhiteCompoundReferredPrimaryCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteCompoundReferredPrimaryList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteCompoundReferredPrimaryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteCompoundReferredPrimary> whiteCompoundReferredPrimaryList, UpdateOption<WhiteCompoundReferredPrimaryCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteCompoundReferredPrimaryList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteCompoundReferredPrimaryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteCompoundReferredPrimary> whiteCompoundReferredPrimaryList, DeleteOption<WhiteCompoundReferredPrimaryCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteCompoundReferredPrimaryList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteCompoundReferredPrimary, WhiteCompoundReferredPrimaryCB> setupper, InsertOption<WhiteCompoundReferredPrimaryCB> option) {
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
     * WhiteCompoundReferredPrimary whiteCompoundReferredPrimary = new WhiteCompoundReferredPrimary();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteCompoundReferredPrimary.setPK...(value);</span>
     * whiteCompoundReferredPrimary.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteCompoundReferredPrimary.setVersionNo(value);</span>
     * WhiteCompoundReferredPrimaryCB cb = new WhiteCompoundReferredPrimaryCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteCompoundReferredPrimaryCB&gt; option = new UpdateOption&lt;WhiteCompoundReferredPrimaryCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteCompoundReferredPrimaryCB&gt;() {
     *     public void specify(WhiteCompoundReferredPrimaryCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteCompoundReferredPrimaryBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteCompoundReferredPrimary, cb, option);
     * </pre>
     * @param whiteCompoundReferredPrimary The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteCompoundReferredPrimary. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteCompoundReferredPrimary whiteCompoundReferredPrimary, WhiteCompoundReferredPrimaryCB cb, UpdateOption<WhiteCompoundReferredPrimaryCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteCompoundReferredPrimary, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteCompoundReferredPrimary. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteCompoundReferredPrimaryCB cb, DeleteOption<WhiteCompoundReferredPrimaryCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteCompoundReferredPrimaryBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhiteCompoundReferredPrimaryCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhiteCompoundReferredPrimaryCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhiteCompoundReferredPrimary> void delegateSelectCursor(WhiteCompoundReferredPrimaryCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends WhiteCompoundReferredPrimary> List<ENTITY> delegateSelectList(WhiteCompoundReferredPrimaryCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhiteCompoundReferredPrimary et, InsertOption<WhiteCompoundReferredPrimaryCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(WhiteCompoundReferredPrimary et, UpdateOption<WhiteCompoundReferredPrimaryCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(WhiteCompoundReferredPrimary et, UpdateOption<WhiteCompoundReferredPrimaryCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(WhiteCompoundReferredPrimary et, DeleteOption<WhiteCompoundReferredPrimaryCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(WhiteCompoundReferredPrimary et, DeleteOption<WhiteCompoundReferredPrimaryCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<WhiteCompoundReferredPrimary> ls, InsertOption<WhiteCompoundReferredPrimaryCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhiteCompoundReferredPrimary> ls, UpdateOption<WhiteCompoundReferredPrimaryCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhiteCompoundReferredPrimary> ls, UpdateOption<WhiteCompoundReferredPrimaryCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhiteCompoundReferredPrimary> ls, DeleteOption<WhiteCompoundReferredPrimaryCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhiteCompoundReferredPrimary> ls, DeleteOption<WhiteCompoundReferredPrimaryCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhiteCompoundReferredPrimary et, WhiteCompoundReferredPrimaryCB inCB, ConditionBean resCB, InsertOption<WhiteCompoundReferredPrimaryCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhiteCompoundReferredPrimary et, WhiteCompoundReferredPrimaryCB cb, UpdateOption<WhiteCompoundReferredPrimaryCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(WhiteCompoundReferredPrimaryCB cb, DeleteOption<WhiteCompoundReferredPrimaryCB> op)
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
    protected WhiteCompoundReferredPrimary downcast(Entity et) {
        return helpEntityDowncastInternally(et, WhiteCompoundReferredPrimary.class);
    }

    protected WhiteCompoundReferredPrimaryCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, WhiteCompoundReferredPrimaryCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<WhiteCompoundReferredPrimary> downcast(List<? extends Entity> ls) {
        return (List<WhiteCompoundReferredPrimary>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteCompoundReferredPrimaryCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<WhiteCompoundReferredPrimaryCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteCompoundReferredPrimaryCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<WhiteCompoundReferredPrimaryCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteCompoundReferredPrimaryCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<WhiteCompoundReferredPrimaryCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteCompoundReferredPrimary, WhiteCompoundReferredPrimaryCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<WhiteCompoundReferredPrimary, WhiteCompoundReferredPrimaryCB>)sp;
    }
}
