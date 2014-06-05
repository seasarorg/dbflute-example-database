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
import org.seasar.dbflute.optional.OptionalEntity;
import org.seasar.dbflute.outsidesql.executor.*;
import com.example.dbflute.mysql.dbflute.exbhv.*;
import com.example.dbflute.mysql.dbflute.exentity.*;
import com.example.dbflute.mysql.dbflute.bsentity.dbmeta.*;
import com.example.dbflute.mysql.dbflute.cbean.*;

/**
 * The behavior of WHITE_VARIANT_RELATION_MASTER_FOO as TABLE. <br />
 * <pre>
 * [primary key]
 *     MASTER_FOO_ID
 *
 * [column]
 *     MASTER_FOO_ID, MASTER_FOO_NAME
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
 *     white_variant_relation_referrer
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whiteVariantRelationReferrerAsVariantList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteVariantRelationMasterFooBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_variant_relation_master_foo"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return WhiteVariantRelationMasterFooDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteVariantRelationMasterFooDbm getMyDBMeta() { return WhiteVariantRelationMasterFooDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteVariantRelationMasterFoo newMyEntity() { return new WhiteVariantRelationMasterFoo(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteVariantRelationMasterFooCB newMyConditionBean() { return new WhiteVariantRelationMasterFooCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteVariantRelationMasterFooCB cb = new WhiteVariantRelationMasterFooCB();
     * cb.query().setFoo...(value);
     * int count = whiteVariantRelationMasterFooBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationMasterFoo. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteVariantRelationMasterFooCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteVariantRelationMasterFooCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteVariantRelationMasterFooCB cb) { // called by selectPage(cb)
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
     * WhiteVariantRelationMasterFooCB cb = new WhiteVariantRelationMasterFooCB();
     * cb.query().setFoo...(value);
     * WhiteVariantRelationMasterFoo whiteVariantRelationMasterFoo = whiteVariantRelationMasterFooBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (whiteVariantRelationMasterFoo != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = whiteVariantRelationMasterFoo.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationMasterFoo. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteVariantRelationMasterFoo selectEntity(WhiteVariantRelationMasterFooCB cb) {
        return doSelectEntity(cb, WhiteVariantRelationMasterFoo.class);
    }

    protected <ENTITY extends WhiteVariantRelationMasterFoo> ENTITY doSelectEntity(WhiteVariantRelationMasterFooCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, WhiteVariantRelationMasterFooCB>() {
            public List<ENTITY> callbackSelectList(WhiteVariantRelationMasterFooCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    protected <ENTITY extends WhiteVariantRelationMasterFoo> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteVariantRelationMasterFooCB cb, Class<ENTITY> tp) {
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
     * WhiteVariantRelationMasterFooCB cb = new WhiteVariantRelationMasterFooCB();
     * cb.query().setFoo...(value);
     * WhiteVariantRelationMasterFoo whiteVariantRelationMasterFoo = whiteVariantRelationMasterFooBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteVariantRelationMasterFoo.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationMasterFoo. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteVariantRelationMasterFoo selectEntityWithDeletedCheck(WhiteVariantRelationMasterFooCB cb) {
        return doSelectEntityWithDeletedCheck(cb, WhiteVariantRelationMasterFoo.class);
    }

    protected <ENTITY extends WhiteVariantRelationMasterFoo> ENTITY doSelectEntityWithDeletedCheck(WhiteVariantRelationMasterFooCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteVariantRelationMasterFooCB>() {
            public List<ENTITY> callbackSelectList(WhiteVariantRelationMasterFooCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param masterFooId : PK, NotNull, BIGINT(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteVariantRelationMasterFoo selectByPKValue(Long masterFooId) {
        return doSelectByPK(masterFooId, WhiteVariantRelationMasterFoo.class);
    }

    protected <ENTITY extends WhiteVariantRelationMasterFoo> ENTITY doSelectByPK(Long masterFooId, Class<ENTITY> entityType) {
        return doSelectEntity(xprepareCBAsPK(masterFooId), entityType);
    }

    protected <ENTITY extends WhiteVariantRelationMasterFoo> OptionalEntity<ENTITY> doSelectOptionalByPK(Long masterFooId, Class<ENTITY> entityType) {
        return createOptionalEntity(doSelectByPK(masterFooId, entityType), masterFooId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param masterFooId : PK, NotNull, BIGINT(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteVariantRelationMasterFoo selectByPKValueWithDeletedCheck(Long masterFooId) {
        return doSelectByPKWithDeletedCheck(masterFooId, WhiteVariantRelationMasterFoo.class);
    }

    protected <ENTITY extends WhiteVariantRelationMasterFoo> ENTITY doSelectByPKWithDeletedCheck(Long masterFooId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(masterFooId), entityType);
    }

    protected WhiteVariantRelationMasterFooCB xprepareCBAsPK(Long masterFooId) {
        assertObjectNotNull("masterFooId", masterFooId);
        WhiteVariantRelationMasterFooCB cb = newMyConditionBean(); cb.acceptPrimaryKey(masterFooId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteVariantRelationMasterFooCB cb = new WhiteVariantRelationMasterFooCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteVariantRelationMasterFoo&gt; whiteVariantRelationMasterFooList = whiteVariantRelationMasterFooBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteVariantRelationMasterFoo whiteVariantRelationMasterFoo : whiteVariantRelationMasterFooList) {
     *     ... = whiteVariantRelationMasterFoo.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationMasterFoo. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteVariantRelationMasterFoo> selectList(WhiteVariantRelationMasterFooCB cb) {
        return doSelectList(cb, WhiteVariantRelationMasterFoo.class);
    }

    protected <ENTITY extends WhiteVariantRelationMasterFoo> ListResultBean<ENTITY> doSelectList(WhiteVariantRelationMasterFooCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, WhiteVariantRelationMasterFooCB>() {
            public List<ENTITY> callbackSelectList(WhiteVariantRelationMasterFooCB lcb, Class<ENTITY> ltp) { return delegateSelectList(lcb, ltp); } });
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
     * WhiteVariantRelationMasterFooCB cb = new WhiteVariantRelationMasterFooCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteVariantRelationMasterFoo&gt; page = whiteVariantRelationMasterFooBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteVariantRelationMasterFoo whiteVariantRelationMasterFoo : page) {
     *     ... = whiteVariantRelationMasterFoo.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationMasterFoo. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteVariantRelationMasterFoo> selectPage(WhiteVariantRelationMasterFooCB cb) {
        return doSelectPage(cb, WhiteVariantRelationMasterFoo.class);
    }

    protected <ENTITY extends WhiteVariantRelationMasterFoo> PagingResultBean<ENTITY> doSelectPage(WhiteVariantRelationMasterFooCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, WhiteVariantRelationMasterFooCB>() {
            public int callbackSelectCount(WhiteVariantRelationMasterFooCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteVariantRelationMasterFooCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * WhiteVariantRelationMasterFooCB cb = new WhiteVariantRelationMasterFooCB();
     * cb.query().setFoo...(value);
     * whiteVariantRelationMasterFooBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteVariantRelationMasterFoo&gt;() {
     *     public void handle(WhiteVariantRelationMasterFoo entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationMasterFoo. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteVariantRelationMasterFoo. (NotNull)
     */
    public void selectCursor(WhiteVariantRelationMasterFooCB cb, EntityRowHandler<WhiteVariantRelationMasterFoo> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, WhiteVariantRelationMasterFoo.class);
    }

    protected <ENTITY extends WhiteVariantRelationMasterFoo> void doSelectCursor(WhiteVariantRelationMasterFooCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, WhiteVariantRelationMasterFooCB>() {
            public void callbackSelectCursor(WhiteVariantRelationMasterFooCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(WhiteVariantRelationMasterFooCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteVariantRelationMasterFooBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteVariantRelationMasterFooCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<WhiteVariantRelationMasterFooCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends WhiteVariantRelationMasterFooCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends WhiteVariantRelationMasterFooCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
     * Load referrer of whiteVariantRelationReferrerAsVariantList by the set-upper of referrer. <br />
     * white_variant_relation_referrer by VARIANT_MASTER_ID, named 'whiteVariantRelationReferrerAsVariantList'.
     * <pre>
     * whiteVariantRelationMasterFooBhv.<span style="color: #DD4747">loadWhiteVariantRelationReferrerAsVariantList</span>(whiteVariantRelationMasterFooList, new ConditionBeanSetupper&lt;WhiteVariantRelationReferrerCB&gt;() {
     *     public void setup(WhiteVariantRelationReferrerCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (WhiteVariantRelationMasterFoo whiteVariantRelationMasterFoo : whiteVariantRelationMasterFooList) {
     *     ... = whiteVariantRelationMasterFoo.<span style="color: #DD4747">getWhiteVariantRelationReferrerAsVariantList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setVariantMasterId_InScope(pkList);
     * cb.query().addOrderBy_VariantMasterId_Asc();
     * </pre>
     * @param whiteVariantRelationMasterFooList The entity list of whiteVariantRelationMasterFoo. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<WhiteVariantRelationReferrer> loadWhiteVariantRelationReferrerAsVariantList(List<WhiteVariantRelationMasterFoo> whiteVariantRelationMasterFooList, ConditionBeanSetupper<WhiteVariantRelationReferrerCB> setupper) {
        xassLRArg(whiteVariantRelationMasterFooList, setupper);
        return doLoadWhiteVariantRelationReferrerAsVariantList(whiteVariantRelationMasterFooList, new LoadReferrerOption<WhiteVariantRelationReferrerCB, WhiteVariantRelationReferrer>().xinit(setupper));
    }

    /**
     * Load referrer of whiteVariantRelationReferrerAsVariantList by the set-upper of referrer. <br />
     * white_variant_relation_referrer by VARIANT_MASTER_ID, named 'whiteVariantRelationReferrerAsVariantList'.
     * <pre>
     * whiteVariantRelationMasterFooBhv.<span style="color: #DD4747">loadWhiteVariantRelationReferrerAsVariantList</span>(whiteVariantRelationMasterFooList, new ConditionBeanSetupper&lt;WhiteVariantRelationReferrerCB&gt;() {
     *     public void setup(WhiteVariantRelationReferrerCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = whiteVariantRelationMasterFoo.<span style="color: #DD4747">getWhiteVariantRelationReferrerAsVariantList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setVariantMasterId_InScope(pkList);
     * cb.query().addOrderBy_VariantMasterId_Asc();
     * </pre>
     * @param whiteVariantRelationMasterFoo The entity of whiteVariantRelationMasterFoo. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<WhiteVariantRelationReferrer> loadWhiteVariantRelationReferrerAsVariantList(WhiteVariantRelationMasterFoo whiteVariantRelationMasterFoo, ConditionBeanSetupper<WhiteVariantRelationReferrerCB> setupper) {
        xassLRArg(whiteVariantRelationMasterFoo, setupper);
        return doLoadWhiteVariantRelationReferrerAsVariantList(xnewLRLs(whiteVariantRelationMasterFoo), new LoadReferrerOption<WhiteVariantRelationReferrerCB, WhiteVariantRelationReferrer>().xinit(setupper));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param whiteVariantRelationMasterFoo The entity of whiteVariantRelationMasterFoo. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<WhiteVariantRelationReferrer> loadWhiteVariantRelationReferrerAsVariantList(WhiteVariantRelationMasterFoo whiteVariantRelationMasterFoo, LoadReferrerOption<WhiteVariantRelationReferrerCB, WhiteVariantRelationReferrer> loadReferrerOption) {
        xassLRArg(whiteVariantRelationMasterFoo, loadReferrerOption);
        return loadWhiteVariantRelationReferrerAsVariantList(xnewLRLs(whiteVariantRelationMasterFoo), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean setupper.} #beforejava8
     * @param whiteVariantRelationMasterFooList The entity list of whiteVariantRelationMasterFoo. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerLoader<WhiteVariantRelationReferrer> loadWhiteVariantRelationReferrerAsVariantList(List<WhiteVariantRelationMasterFoo> whiteVariantRelationMasterFooList, LoadReferrerOption<WhiteVariantRelationReferrerCB, WhiteVariantRelationReferrer> loadReferrerOption) {
        xassLRArg(whiteVariantRelationMasterFooList, loadReferrerOption);
        if (whiteVariantRelationMasterFooList.isEmpty()) { return (NestedReferrerLoader<WhiteVariantRelationReferrer>)EMPTY_LOADER; }
        return doLoadWhiteVariantRelationReferrerAsVariantList(whiteVariantRelationMasterFooList, loadReferrerOption);
    }

    protected NestedReferrerLoader<WhiteVariantRelationReferrer> doLoadWhiteVariantRelationReferrerAsVariantList(List<WhiteVariantRelationMasterFoo> whiteVariantRelationMasterFooList, LoadReferrerOption<WhiteVariantRelationReferrerCB, WhiteVariantRelationReferrer> option) {
        final WhiteVariantRelationReferrerBhv referrerBhv = xgetBSFLR().select(WhiteVariantRelationReferrerBhv.class);
        return helpLoadReferrerInternally(whiteVariantRelationMasterFooList, option, new InternalLoadReferrerCallback<WhiteVariantRelationMasterFoo, Long, WhiteVariantRelationReferrerCB, WhiteVariantRelationReferrer>() {
            public Long getPKVal(WhiteVariantRelationMasterFoo et)
            { return et.getMasterFooId(); }
            public void setRfLs(WhiteVariantRelationMasterFoo et, List<WhiteVariantRelationReferrer> ls)
            { et.setWhiteVariantRelationReferrerAsVariantList(ls); }
            public WhiteVariantRelationReferrerCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(WhiteVariantRelationReferrerCB cb, List<Long> ls)
            { cb.query().setVariantMasterId_InScope(ls); }
            public void qyOdFKAsc(WhiteVariantRelationReferrerCB cb) { cb.query().addOrderBy_VariantMasterId_Asc(); }
            public void spFKCol(WhiteVariantRelationReferrerCB cb) { cb.specify().columnVariantMasterId(); }
            public List<WhiteVariantRelationReferrer> selRfLs(WhiteVariantRelationReferrerCB cb) { return referrerBhv.selectList(cb); }
            public Long getFKVal(WhiteVariantRelationReferrer re) { return re.getVariantMasterId(); }
            public void setlcEt(WhiteVariantRelationReferrer re, WhiteVariantRelationMasterFoo le)
            { re.setWhiteVariantRelationMasterFooAsVariant(le); }
            public String getRfPrNm() { return "whiteVariantRelationReferrerAsVariantList"; }
        });
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key masterFooId.
     * @param whiteVariantRelationMasterFooList The list of whiteVariantRelationMasterFoo. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractMasterFooIdList(List<WhiteVariantRelationMasterFoo> whiteVariantRelationMasterFooList) {
        return helpExtractListInternally(whiteVariantRelationMasterFooList, new InternalExtractCallback<WhiteVariantRelationMasterFoo, Long>() {
            public Long getCV(WhiteVariantRelationMasterFoo et) { return et.getMasterFooId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteVariantRelationMasterFoo whiteVariantRelationMasterFoo = new WhiteVariantRelationMasterFoo();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteVariantRelationMasterFoo.setFoo...(value);
     * whiteVariantRelationMasterFoo.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterFoo.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterFoo.set...;</span>
     * whiteVariantRelationMasterFooBhv.<span style="color: #DD4747">insert</span>(whiteVariantRelationMasterFoo);
     * ... = whiteVariantRelationMasterFoo.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteVariantRelationMasterFoo The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteVariantRelationMasterFoo whiteVariantRelationMasterFoo) {
        doInsert(whiteVariantRelationMasterFoo, null);
    }

    protected void doInsert(WhiteVariantRelationMasterFoo whiteVariantRelationMasterFoo, InsertOption<WhiteVariantRelationMasterFooCB> op) {
        assertObjectNotNull("whiteVariantRelationMasterFoo", whiteVariantRelationMasterFoo);
        prepareInsertOption(op);
        delegateInsert(whiteVariantRelationMasterFoo, op);
    }

    protected void prepareInsertOption(InsertOption<WhiteVariantRelationMasterFooCB> op) {
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
     * WhiteVariantRelationMasterFoo whiteVariantRelationMasterFoo = new WhiteVariantRelationMasterFoo();
     * whiteVariantRelationMasterFoo.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteVariantRelationMasterFoo.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterFoo.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterFoo.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteVariantRelationMasterFoo.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteVariantRelationMasterFooBhv.<span style="color: #DD4747">update</span>(whiteVariantRelationMasterFoo);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteVariantRelationMasterFoo The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final WhiteVariantRelationMasterFoo whiteVariantRelationMasterFoo) {
        doUpdate(whiteVariantRelationMasterFoo, null);
    }

    protected void doUpdate(WhiteVariantRelationMasterFoo whiteVariantRelationMasterFoo, final UpdateOption<WhiteVariantRelationMasterFooCB> op) {
        assertObjectNotNull("whiteVariantRelationMasterFoo", whiteVariantRelationMasterFoo);
        prepareUpdateOption(op);
        helpUpdateInternally(whiteVariantRelationMasterFoo, new InternalUpdateCallback<WhiteVariantRelationMasterFoo>() {
            public int callbackDelegateUpdate(WhiteVariantRelationMasterFoo et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhiteVariantRelationMasterFooCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected WhiteVariantRelationMasterFooCB createCBForVaryingUpdate() {
        WhiteVariantRelationMasterFooCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected WhiteVariantRelationMasterFooCB createCBForSpecifiedUpdate() {
        WhiteVariantRelationMasterFooCB cb = newMyConditionBean();
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
     * @param whiteVariantRelationMasterFoo The entity of insert or update target. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteVariantRelationMasterFoo whiteVariantRelationMasterFoo) {
        doInesrtOrUpdate(whiteVariantRelationMasterFoo, null, null);
    }

    protected void doInesrtOrUpdate(WhiteVariantRelationMasterFoo whiteVariantRelationMasterFoo, final InsertOption<WhiteVariantRelationMasterFooCB> iop, final UpdateOption<WhiteVariantRelationMasterFooCB> uop) {
        helpInsertOrUpdateInternally(whiteVariantRelationMasterFoo, new InternalInsertOrUpdateCallback<WhiteVariantRelationMasterFoo, WhiteVariantRelationMasterFooCB>() {
            public void callbackInsert(WhiteVariantRelationMasterFoo et) { doInsert(et, iop); }
            public void callbackUpdate(WhiteVariantRelationMasterFoo et) { doUpdate(et, uop); }
            public WhiteVariantRelationMasterFooCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(WhiteVariantRelationMasterFooCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<WhiteVariantRelationMasterFooCB>();
            uop = uop != null ? uop : new UpdateOption<WhiteVariantRelationMasterFooCB>();
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
     * WhiteVariantRelationMasterFoo whiteVariantRelationMasterFoo = new WhiteVariantRelationMasterFoo();
     * whiteVariantRelationMasterFoo.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteVariantRelationMasterFoo.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteVariantRelationMasterFooBhv.<span style="color: #DD4747">delete</span>(whiteVariantRelationMasterFoo);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteVariantRelationMasterFoo The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteVariantRelationMasterFoo whiteVariantRelationMasterFoo) {
        doDelete(whiteVariantRelationMasterFoo, null);
    }

    protected void doDelete(WhiteVariantRelationMasterFoo whiteVariantRelationMasterFoo, final DeleteOption<WhiteVariantRelationMasterFooCB> op) {
        assertObjectNotNull("whiteVariantRelationMasterFoo", whiteVariantRelationMasterFoo);
        prepareDeleteOption(op);
        helpDeleteInternally(whiteVariantRelationMasterFoo, new InternalDeleteCallback<WhiteVariantRelationMasterFoo>() {
            public int callbackDelegateDelete(WhiteVariantRelationMasterFoo et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhiteVariantRelationMasterFooCB> op) {
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
     *     WhiteVariantRelationMasterFoo whiteVariantRelationMasterFoo = new WhiteVariantRelationMasterFoo();
     *     whiteVariantRelationMasterFoo.setFooName("foo");
     *     if (...) {
     *         whiteVariantRelationMasterFoo.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteVariantRelationMasterFooList.add(whiteVariantRelationMasterFoo);
     * }
     * whiteVariantRelationMasterFooBhv.<span style="color: #DD4747">batchInsert</span>(whiteVariantRelationMasterFooList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteVariantRelationMasterFooList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteVariantRelationMasterFoo> whiteVariantRelationMasterFooList) {
        InsertOption<WhiteVariantRelationMasterFooCB> op = createInsertUpdateOption();
        return doBatchInsert(whiteVariantRelationMasterFooList, op);
    }

    protected int[] doBatchInsert(List<WhiteVariantRelationMasterFoo> whiteVariantRelationMasterFooList, InsertOption<WhiteVariantRelationMasterFooCB> op) {
        assertObjectNotNull("whiteVariantRelationMasterFooList", whiteVariantRelationMasterFooList);
        prepareBatchInsertOption(whiteVariantRelationMasterFooList, op);
        return delegateBatchInsert(whiteVariantRelationMasterFooList, op);
    }

    protected void prepareBatchInsertOption(List<WhiteVariantRelationMasterFoo> whiteVariantRelationMasterFooList, InsertOption<WhiteVariantRelationMasterFooCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(whiteVariantRelationMasterFooList);
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
     *     WhiteVariantRelationMasterFoo whiteVariantRelationMasterFoo = new WhiteVariantRelationMasterFoo();
     *     whiteVariantRelationMasterFoo.setFooName("foo");
     *     if (...) {
     *         whiteVariantRelationMasterFoo.setFooPrice(123);
     *     } else {
     *         whiteVariantRelationMasterFoo.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteVariantRelationMasterFoo.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteVariantRelationMasterFooList.add(whiteVariantRelationMasterFoo);
     * }
     * whiteVariantRelationMasterFooBhv.<span style="color: #DD4747">batchUpdate</span>(whiteVariantRelationMasterFooList);
     * </pre>
     * @param whiteVariantRelationMasterFooList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteVariantRelationMasterFoo> whiteVariantRelationMasterFooList) {
        UpdateOption<WhiteVariantRelationMasterFooCB> op = createPlainUpdateOption();
        return doBatchUpdate(whiteVariantRelationMasterFooList, op);
    }

    protected int[] doBatchUpdate(List<WhiteVariantRelationMasterFoo> whiteVariantRelationMasterFooList, UpdateOption<WhiteVariantRelationMasterFooCB> op) {
        assertObjectNotNull("whiteVariantRelationMasterFooList", whiteVariantRelationMasterFooList);
        prepareBatchUpdateOption(whiteVariantRelationMasterFooList, op);
        return delegateBatchUpdate(whiteVariantRelationMasterFooList, op);
    }

    protected void prepareBatchUpdateOption(List<WhiteVariantRelationMasterFoo> whiteVariantRelationMasterFooList, UpdateOption<WhiteVariantRelationMasterFooCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(whiteVariantRelationMasterFooList);
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
     * whiteVariantRelationMasterFooBhv.<span style="color: #DD4747">batchUpdate</span>(whiteVariantRelationMasterFooList, new SpecifyQuery<WhiteVariantRelationMasterFooCB>() {
     *     public void specify(WhiteVariantRelationMasterFooCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteVariantRelationMasterFooBhv.<span style="color: #DD4747">batchUpdate</span>(whiteVariantRelationMasterFooList, new SpecifyQuery<WhiteVariantRelationMasterFooCB>() {
     *     public void specify(WhiteVariantRelationMasterFooCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteVariantRelationMasterFooList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteVariantRelationMasterFoo> whiteVariantRelationMasterFooList, SpecifyQuery<WhiteVariantRelationMasterFooCB> updateColumnSpec) {
        return doBatchUpdate(whiteVariantRelationMasterFooList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteVariantRelationMasterFooList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteVariantRelationMasterFoo> whiteVariantRelationMasterFooList) {
        return doBatchDelete(whiteVariantRelationMasterFooList, null);
    }

    protected int[] doBatchDelete(List<WhiteVariantRelationMasterFoo> whiteVariantRelationMasterFooList, DeleteOption<WhiteVariantRelationMasterFooCB> op) {
        assertObjectNotNull("whiteVariantRelationMasterFooList", whiteVariantRelationMasterFooList);
        prepareDeleteOption(op);
        return delegateBatchDelete(whiteVariantRelationMasterFooList, op);
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
     * whiteVariantRelationMasterFooBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteVariantRelationMasterFoo, WhiteVariantRelationMasterFooCB&gt;() {
     *     public ConditionBean setup(whiteVariantRelationMasterFoo entity, WhiteVariantRelationMasterFooCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteVariantRelationMasterFoo, WhiteVariantRelationMasterFooCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteVariantRelationMasterFoo, WhiteVariantRelationMasterFooCB> sp, InsertOption<WhiteVariantRelationMasterFooCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        WhiteVariantRelationMasterFoo e = new WhiteVariantRelationMasterFoo();
        WhiteVariantRelationMasterFooCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected WhiteVariantRelationMasterFooCB createCBForQueryInsert() {
        WhiteVariantRelationMasterFooCB cb = newMyConditionBean();
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
     * WhiteVariantRelationMasterFoo whiteVariantRelationMasterFoo = new WhiteVariantRelationMasterFoo();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterFoo.setPK...(value);</span>
     * whiteVariantRelationMasterFoo.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterFoo.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterFoo.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterFoo.setVersionNo(value);</span>
     * WhiteVariantRelationMasterFooCB cb = new WhiteVariantRelationMasterFooCB();
     * cb.query().setFoo...(value);
     * whiteVariantRelationMasterFooBhv.<span style="color: #DD4747">queryUpdate</span>(whiteVariantRelationMasterFoo, cb);
     * </pre>
     * @param whiteVariantRelationMasterFoo The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteVariantRelationMasterFoo. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteVariantRelationMasterFoo whiteVariantRelationMasterFoo, WhiteVariantRelationMasterFooCB cb) {
        return doQueryUpdate(whiteVariantRelationMasterFoo, cb, null);
    }

    protected int doQueryUpdate(WhiteVariantRelationMasterFoo whiteVariantRelationMasterFoo, WhiteVariantRelationMasterFooCB cb, UpdateOption<WhiteVariantRelationMasterFooCB> op) {
        assertObjectNotNull("whiteVariantRelationMasterFoo", whiteVariantRelationMasterFoo); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(whiteVariantRelationMasterFoo, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (WhiteVariantRelationMasterFooCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (WhiteVariantRelationMasterFooCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteVariantRelationMasterFooCB cb = new WhiteVariantRelationMasterFooCB();
     * cb.query().setFoo...(value);
     * whiteVariantRelationMasterFooBhv.<span style="color: #DD4747">queryDelete</span>(whiteVariantRelationMasterFoo, cb);
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationMasterFoo. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteVariantRelationMasterFooCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteVariantRelationMasterFooCB cb, DeleteOption<WhiteVariantRelationMasterFooCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((WhiteVariantRelationMasterFooCB)cb); }
        else { return varyingQueryDelete((WhiteVariantRelationMasterFooCB)cb, downcast(op)); }
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
     * WhiteVariantRelationMasterFoo whiteVariantRelationMasterFoo = new WhiteVariantRelationMasterFoo();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteVariantRelationMasterFoo.setFoo...(value);
     * whiteVariantRelationMasterFoo.setBar...(value);
     * InsertOption<WhiteVariantRelationMasterFooCB> option = new InsertOption<WhiteVariantRelationMasterFooCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteVariantRelationMasterFooBhv.<span style="color: #DD4747">varyingInsert</span>(whiteVariantRelationMasterFoo, option);
     * ... = whiteVariantRelationMasterFoo.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteVariantRelationMasterFoo The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteVariantRelationMasterFoo whiteVariantRelationMasterFoo, InsertOption<WhiteVariantRelationMasterFooCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteVariantRelationMasterFoo, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteVariantRelationMasterFoo whiteVariantRelationMasterFoo = new WhiteVariantRelationMasterFoo();
     * whiteVariantRelationMasterFoo.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteVariantRelationMasterFoo.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteVariantRelationMasterFoo.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteVariantRelationMasterFooCB&gt; option = new UpdateOption&lt;WhiteVariantRelationMasterFooCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteVariantRelationMasterFooCB&gt;() {
     *         public void specify(WhiteVariantRelationMasterFooCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteVariantRelationMasterFooBhv.<span style="color: #DD4747">varyingUpdate</span>(whiteVariantRelationMasterFoo, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteVariantRelationMasterFoo The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteVariantRelationMasterFoo whiteVariantRelationMasterFoo, UpdateOption<WhiteVariantRelationMasterFooCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteVariantRelationMasterFoo, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteVariantRelationMasterFoo The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteVariantRelationMasterFoo whiteVariantRelationMasterFoo, InsertOption<WhiteVariantRelationMasterFooCB> insertOption, UpdateOption<WhiteVariantRelationMasterFooCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(whiteVariantRelationMasterFoo, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteVariantRelationMasterFoo The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteVariantRelationMasterFoo whiteVariantRelationMasterFoo, DeleteOption<WhiteVariantRelationMasterFooCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteVariantRelationMasterFoo, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteVariantRelationMasterFooList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteVariantRelationMasterFoo> whiteVariantRelationMasterFooList, InsertOption<WhiteVariantRelationMasterFooCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteVariantRelationMasterFooList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteVariantRelationMasterFooList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteVariantRelationMasterFoo> whiteVariantRelationMasterFooList, UpdateOption<WhiteVariantRelationMasterFooCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteVariantRelationMasterFooList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteVariantRelationMasterFooList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteVariantRelationMasterFoo> whiteVariantRelationMasterFooList, DeleteOption<WhiteVariantRelationMasterFooCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteVariantRelationMasterFooList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteVariantRelationMasterFoo, WhiteVariantRelationMasterFooCB> setupper, InsertOption<WhiteVariantRelationMasterFooCB> option) {
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
     * WhiteVariantRelationMasterFoo whiteVariantRelationMasterFoo = new WhiteVariantRelationMasterFoo();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterFoo.setPK...(value);</span>
     * whiteVariantRelationMasterFoo.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationMasterFoo.setVersionNo(value);</span>
     * WhiteVariantRelationMasterFooCB cb = new WhiteVariantRelationMasterFooCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteVariantRelationMasterFooCB&gt; option = new UpdateOption&lt;WhiteVariantRelationMasterFooCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteVariantRelationMasterFooCB&gt;() {
     *     public void specify(WhiteVariantRelationMasterFooCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteVariantRelationMasterFooBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteVariantRelationMasterFoo, cb, option);
     * </pre>
     * @param whiteVariantRelationMasterFoo The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteVariantRelationMasterFoo. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteVariantRelationMasterFoo whiteVariantRelationMasterFoo, WhiteVariantRelationMasterFooCB cb, UpdateOption<WhiteVariantRelationMasterFooCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteVariantRelationMasterFoo, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteVariantRelationMasterFoo. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteVariantRelationMasterFooCB cb, DeleteOption<WhiteVariantRelationMasterFooCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteVariantRelationMasterFooBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhiteVariantRelationMasterFooCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhiteVariantRelationMasterFooCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhiteVariantRelationMasterFoo> void delegateSelectCursor(WhiteVariantRelationMasterFooCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends WhiteVariantRelationMasterFoo> List<ENTITY> delegateSelectList(WhiteVariantRelationMasterFooCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhiteVariantRelationMasterFoo et, InsertOption<WhiteVariantRelationMasterFooCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(WhiteVariantRelationMasterFoo et, UpdateOption<WhiteVariantRelationMasterFooCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(WhiteVariantRelationMasterFoo et, UpdateOption<WhiteVariantRelationMasterFooCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(WhiteVariantRelationMasterFoo et, DeleteOption<WhiteVariantRelationMasterFooCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(WhiteVariantRelationMasterFoo et, DeleteOption<WhiteVariantRelationMasterFooCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<WhiteVariantRelationMasterFoo> ls, InsertOption<WhiteVariantRelationMasterFooCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhiteVariantRelationMasterFoo> ls, UpdateOption<WhiteVariantRelationMasterFooCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhiteVariantRelationMasterFoo> ls, UpdateOption<WhiteVariantRelationMasterFooCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhiteVariantRelationMasterFoo> ls, DeleteOption<WhiteVariantRelationMasterFooCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhiteVariantRelationMasterFoo> ls, DeleteOption<WhiteVariantRelationMasterFooCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhiteVariantRelationMasterFoo et, WhiteVariantRelationMasterFooCB inCB, ConditionBean resCB, InsertOption<WhiteVariantRelationMasterFooCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhiteVariantRelationMasterFoo et, WhiteVariantRelationMasterFooCB cb, UpdateOption<WhiteVariantRelationMasterFooCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(WhiteVariantRelationMasterFooCB cb, DeleteOption<WhiteVariantRelationMasterFooCB> op)
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
    protected WhiteVariantRelationMasterFoo downcast(Entity et) {
        return helpEntityDowncastInternally(et, WhiteVariantRelationMasterFoo.class);
    }

    protected WhiteVariantRelationMasterFooCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, WhiteVariantRelationMasterFooCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<WhiteVariantRelationMasterFoo> downcast(List<? extends Entity> ls) {
        return (List<WhiteVariantRelationMasterFoo>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteVariantRelationMasterFooCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<WhiteVariantRelationMasterFooCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteVariantRelationMasterFooCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<WhiteVariantRelationMasterFooCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteVariantRelationMasterFooCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<WhiteVariantRelationMasterFooCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteVariantRelationMasterFoo, WhiteVariantRelationMasterFooCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<WhiteVariantRelationMasterFoo, WhiteVariantRelationMasterFooCB>)sp;
    }
}
