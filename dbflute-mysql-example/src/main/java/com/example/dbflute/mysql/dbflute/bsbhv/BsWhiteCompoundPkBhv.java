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
 * The behavior of WHITE_COMPOUND_PK as TABLE. <br />
 * <pre>
 * [primary key]
 *     PK_FIRST_ID, PK_SECOND_ID
 *
 * [column]
 *     PK_FIRST_ID, PK_SECOND_ID, PK_NAME, REFERRED_ID
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
 *     WHITE_COMPOUND_REFERRED_NORMALLY, WHITE_COMPOUND_REFERRED_PRIMARY, WHITE_COMPOUND_PK_REF_MANY(AsMax)
 *
 * [referrer table]
 *     white_compound_pk_ref, white_compound_pk_ref_many
 *
 * [foreign property]
 *     whiteCompoundReferredNormally, whiteCompoundReferredPrimary, whiteCompoundPkRefManyAsMax, whiteCompoundPkRefManyAsMin
 *
 * [referrer property]
 *     whiteCompoundPkRefList, whiteCompoundPkRefManyToPKList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteCompoundPkBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_compound_pk"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return WhiteCompoundPkDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteCompoundPkDbm getMyDBMeta() { return WhiteCompoundPkDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteCompoundPk newMyEntity() { return new WhiteCompoundPk(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteCompoundPkCB newMyConditionBean() { return new WhiteCompoundPkCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteCompoundPkCB cb = new WhiteCompoundPkCB();
     * cb.query().setFoo...(value);
     * int count = whiteCompoundPkBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteCompoundPk. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteCompoundPkCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteCompoundPkCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteCompoundPkCB cb) { // called by selectPage(cb)
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
     * WhiteCompoundPkCB cb = new WhiteCompoundPkCB();
     * cb.query().setFoo...(value);
     * WhiteCompoundPk whiteCompoundPk = whiteCompoundPkBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (whiteCompoundPk != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = whiteCompoundPk.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteCompoundPk. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteCompoundPk selectEntity(WhiteCompoundPkCB cb) {
        return doSelectEntity(cb, WhiteCompoundPk.class);
    }

    protected <ENTITY extends WhiteCompoundPk> ENTITY doSelectEntity(WhiteCompoundPkCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, WhiteCompoundPkCB>() {
            public List<ENTITY> callbackSelectList(WhiteCompoundPkCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * WhiteCompoundPkCB cb = new WhiteCompoundPkCB();
     * cb.query().setFoo...(value);
     * WhiteCompoundPk whiteCompoundPk = whiteCompoundPkBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteCompoundPk.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteCompoundPk. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (point is not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteCompoundPk selectEntityWithDeletedCheck(WhiteCompoundPkCB cb) {
        return doSelectEntityWithDeletedCheck(cb, WhiteCompoundPk.class);
    }

    protected <ENTITY extends WhiteCompoundPk> ENTITY doSelectEntityWithDeletedCheck(WhiteCompoundPkCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteCompoundPkCB>() {
            public List<ENTITY> callbackSelectList(WhiteCompoundPkCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param pkFirstId The one of primary key. (NotNull)
     * @param pkSecondId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteCompoundPk selectByPKValue(Integer pkFirstId, Integer pkSecondId) {
        return doSelectByPKValue(pkFirstId, pkSecondId, WhiteCompoundPk.class);
    }

    protected <ENTITY extends WhiteCompoundPk> ENTITY doSelectByPKValue(Integer pkFirstId, Integer pkSecondId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(pkFirstId, pkSecondId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param pkFirstId The one of primary key. (NotNull)
     * @param pkSecondId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteCompoundPk selectByPKValueWithDeletedCheck(Integer pkFirstId, Integer pkSecondId) {
        return doSelectByPKValueWithDeletedCheck(pkFirstId, pkSecondId, WhiteCompoundPk.class);
    }

    protected <ENTITY extends WhiteCompoundPk> ENTITY doSelectByPKValueWithDeletedCheck(Integer pkFirstId, Integer pkSecondId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(pkFirstId, pkSecondId), entityType);
    }

    private WhiteCompoundPkCB buildPKCB(Integer pkFirstId, Integer pkSecondId) {
        assertObjectNotNull("pkFirstId", pkFirstId);assertObjectNotNull("pkSecondId", pkSecondId);
        WhiteCompoundPkCB cb = newMyConditionBean();
        cb.query().setPkFirstId_Equal(pkFirstId);cb.query().setPkSecondId_Equal(pkSecondId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteCompoundPkCB cb = new WhiteCompoundPkCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteCompoundPk&gt; whiteCompoundPkList = whiteCompoundPkBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteCompoundPk whiteCompoundPk : whiteCompoundPkList) {
     *     ... = whiteCompoundPk.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteCompoundPk. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteCompoundPk> selectList(WhiteCompoundPkCB cb) {
        return doSelectList(cb, WhiteCompoundPk.class);
    }

    protected <ENTITY extends WhiteCompoundPk> ListResultBean<ENTITY> doSelectList(WhiteCompoundPkCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, WhiteCompoundPkCB>() {
            public List<ENTITY> callbackSelectList(WhiteCompoundPkCB lcb, Class<ENTITY> ltp) { return delegateSelectList(lcb, ltp); } });
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
     * WhiteCompoundPkCB cb = new WhiteCompoundPkCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteCompoundPk&gt; page = whiteCompoundPkBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteCompoundPk whiteCompoundPk : page) {
     *     ... = whiteCompoundPk.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteCompoundPk. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteCompoundPk> selectPage(WhiteCompoundPkCB cb) {
        return doSelectPage(cb, WhiteCompoundPk.class);
    }

    protected <ENTITY extends WhiteCompoundPk> PagingResultBean<ENTITY> doSelectPage(WhiteCompoundPkCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, WhiteCompoundPkCB>() {
            public int callbackSelectCount(WhiteCompoundPkCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteCompoundPkCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * WhiteCompoundPkCB cb = new WhiteCompoundPkCB();
     * cb.query().setFoo...(value);
     * whiteCompoundPkBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteCompoundPk&gt;() {
     *     public void handle(WhiteCompoundPk entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteCompoundPk. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteCompoundPk. (NotNull)
     */
    public void selectCursor(WhiteCompoundPkCB cb, EntityRowHandler<WhiteCompoundPk> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, WhiteCompoundPk.class);
    }

    protected <ENTITY extends WhiteCompoundPk> void doSelectCursor(WhiteCompoundPkCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, WhiteCompoundPkCB>() {
            public void callbackSelectCursor(WhiteCompoundPkCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(WhiteCompoundPkCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteCompoundPkBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteCompoundPkCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<WhiteCompoundPkCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends WhiteCompoundPkCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends WhiteCompoundPkCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
     * Load referrer of whiteCompoundPkRefList by the set-upper of referrer. <br />
     * white_compound_pk_ref by REF_FIRST_ID, REF_SECOND_ID, named 'whiteCompoundPkRefList'.
     * <pre>
     * whiteCompoundPkBhv.<span style="color: #DD4747">loadWhiteCompoundPkRefList</span>(whiteCompoundPkList, new ConditionBeanSetupper&lt;WhiteCompoundPkRefCB&gt;() {
     *     public void setup(WhiteCompoundPkRefCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here by calling like '}).withNestedList(new ...)'</span>
     * for (WhiteCompoundPk whiteCompoundPk : whiteCompoundPkList) {
     *     ... = whiteCompoundPk.<span style="color: #DD4747">getWhiteCompoundPkRefList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().set[ForeignKey]_InScope(pkList);
     * cb.query().addOrderBy_[ForeignKey]_Asc();
     * </pre>
     * @param whiteCompoundPk The entity of whiteCompoundPk. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<WhiteCompoundPkRef> loadWhiteCompoundPkRefList(WhiteCompoundPk whiteCompoundPk, ConditionBeanSetupper<WhiteCompoundPkRefCB> conditionBeanSetupper) {
        xassLRArg(whiteCompoundPk, conditionBeanSetupper);
        return loadWhiteCompoundPkRefList(xnewLRLs(whiteCompoundPk), conditionBeanSetupper);
    }

    /**
     * Load referrer of whiteCompoundPkRefList by the set-upper of referrer. <br />
     * white_compound_pk_ref by REF_FIRST_ID, REF_SECOND_ID, named 'whiteCompoundPkRefList'.
     * <pre>
     * whiteCompoundPkBhv.<span style="color: #DD4747">loadWhiteCompoundPkRefList</span>(whiteCompoundPkList, new ConditionBeanSetupper&lt;WhiteCompoundPkRefCB&gt;() {
     *     public void setup(WhiteCompoundPkRefCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here by calling like '}).withNestedList(new ...)'</span>
     * for (WhiteCompoundPk whiteCompoundPk : whiteCompoundPkList) {
     *     ... = whiteCompoundPk.<span style="color: #DD4747">getWhiteCompoundPkRefList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().set[ForeignKey]_InScope(pkList);
     * cb.query().addOrderBy_[ForeignKey]_Asc();
     * </pre>
     * @param whiteCompoundPkList The entity list of whiteCompoundPk. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<WhiteCompoundPkRef> loadWhiteCompoundPkRefList(List<WhiteCompoundPk> whiteCompoundPkList, ConditionBeanSetupper<WhiteCompoundPkRefCB> conditionBeanSetupper) {
        xassLRArg(whiteCompoundPkList, conditionBeanSetupper);
        return loadWhiteCompoundPkRefList(whiteCompoundPkList, new LoadReferrerOption<WhiteCompoundPkRefCB, WhiteCompoundPkRef>().xinit(conditionBeanSetupper));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param whiteCompoundPk The entity of whiteCompoundPk. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<WhiteCompoundPkRef> loadWhiteCompoundPkRefList(WhiteCompoundPk whiteCompoundPk, LoadReferrerOption<WhiteCompoundPkRefCB, WhiteCompoundPkRef> loadReferrerOption) {
        xassLRArg(whiteCompoundPk, loadReferrerOption);
        return loadWhiteCompoundPkRefList(xnewLRLs(whiteCompoundPk), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param whiteCompoundPkList The entity list of whiteCompoundPk. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerLoader<WhiteCompoundPkRef> loadWhiteCompoundPkRefList(List<WhiteCompoundPk> whiteCompoundPkList, LoadReferrerOption<WhiteCompoundPkRefCB, WhiteCompoundPkRef> loadReferrerOption) {
        xassLRArg(whiteCompoundPkList, loadReferrerOption);
        if (whiteCompoundPkList.isEmpty()) { return (NestedReferrerLoader<WhiteCompoundPkRef>)EMPTY_LOADER; }
        return doLoadWhiteCompoundPkRefList(whiteCompoundPkList, loadReferrerOption);
    }

    protected NestedReferrerLoader<WhiteCompoundPkRef> doLoadWhiteCompoundPkRefList(List<WhiteCompoundPk> whiteCompoundPkList, LoadReferrerOption<WhiteCompoundPkRefCB, WhiteCompoundPkRef> option) {
        final WhiteCompoundPkRefBhv referrerBhv = xgetBSFLR().select(WhiteCompoundPkRefBhv.class);
        return helpLoadReferrerInternally(whiteCompoundPkList, option, new InternalLoadReferrerCallback<WhiteCompoundPk, java.util.Map<String, Object>, WhiteCompoundPkRefCB, WhiteCompoundPkRef>() {
            public java.util.Map<String, Object> getPKVal(WhiteCompoundPk et) {
                java.util.Map<String, Object> primaryKeyMap = new java.util.LinkedHashMap<String, Object>();
                primaryKeyMap.put("PkFirstId", et.getPkFirstId());
                primaryKeyMap.put("PkSecondId", et.getPkSecondId());
                return primaryKeyMap;
            }
            public void setRfLs(WhiteCompoundPk et, List<WhiteCompoundPkRef> ls) { et.setWhiteCompoundPkRefList(ls); }
            public WhiteCompoundPkRefCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(WhiteCompoundPkRefCB cb, List<java.util.Map<String, Object>> ls) {
                final String aliasName = cb.getSqlClause().getBasePointAliasName();
                String identity = null;
                StringBuilder sb = new StringBuilder();
                for (java.util.Map<String, Object> primaryKeyMap : ls) {
                    if (sb.length() > 0) { sb.append(")").append(ln()).append("     or ("); }
                    sb.append(aliasName).append(".REF_FIRST_ID = ");
                    identity = "whiteCompoundPkRefListPkFirstId";
                    sb.append(cb.query().xregisterFreeParameterToThemeList(identity, primaryKeyMap.get("PkFirstId")));
                    sb.append(" and ");
                    sb.append(aliasName).append(".REF_SECOND_ID = ");
                    identity = "whiteCompoundPkRefListPkSecondId";
                    sb.append(cb.query().xregisterFreeParameterToThemeList(identity, primaryKeyMap.get("PkSecondId")));
                }
                sb.insert(0, "((").append("))");
                cb.getSqlClause().registerWhereClause(sb.toString(), aliasName);
            }
            public void qyOdFKAsc(WhiteCompoundPkRefCB cb) {
                cb.query().addOrderBy_RefFirstId_Asc();
                cb.query().addOrderBy_RefSecondId_Asc();
            }
            public void spFKCol(WhiteCompoundPkRefCB cb) {
                cb.specify().columnRefFirstId();
                cb.specify().columnRefSecondId();
            }
            public List<WhiteCompoundPkRef> selRfLs(WhiteCompoundPkRefCB cb) { return referrerBhv.selectList(cb); }
            public java.util.Map<String, Object> getFKVal(WhiteCompoundPkRef re) {
                java.util.Map<String, Object> foreignKeyMap = new java.util.LinkedHashMap<String, Object>();
                foreignKeyMap.put("PkFirstId", re.getRefFirstId());
                foreignKeyMap.put("PkSecondId", re.getRefSecondId());
                return foreignKeyMap;
            }
            public void setlcEt(WhiteCompoundPkRef re, WhiteCompoundPk le) { re.setWhiteCompoundPk(le); }
            public String getRfPrNm() { return "whiteCompoundPkRefList"; }
        });
    }

    /**
     * Load referrer of whiteCompoundPkRefManyToPKList by the set-upper of referrer. <br />
     * white_compound_pk_ref_many by REF_MANY_FIRST_ID, REF_MANY_SECOND_ID, named 'whiteCompoundPkRefManyToPKList'.
     * <pre>
     * whiteCompoundPkBhv.<span style="color: #DD4747">loadWhiteCompoundPkRefManyToPKList</span>(whiteCompoundPkList, new ConditionBeanSetupper&lt;WhiteCompoundPkRefManyCB&gt;() {
     *     public void setup(WhiteCompoundPkRefManyCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here by calling like '}).withNestedList(new ...)'</span>
     * for (WhiteCompoundPk whiteCompoundPk : whiteCompoundPkList) {
     *     ... = whiteCompoundPk.<span style="color: #DD4747">getWhiteCompoundPkRefManyToPKList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().set[ForeignKey]_InScope(pkList);
     * cb.query().addOrderBy_[ForeignKey]_Asc();
     * </pre>
     * @param whiteCompoundPk The entity of whiteCompoundPk. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<WhiteCompoundPkRefMany> loadWhiteCompoundPkRefManyToPKList(WhiteCompoundPk whiteCompoundPk, ConditionBeanSetupper<WhiteCompoundPkRefManyCB> conditionBeanSetupper) {
        xassLRArg(whiteCompoundPk, conditionBeanSetupper);
        return loadWhiteCompoundPkRefManyToPKList(xnewLRLs(whiteCompoundPk), conditionBeanSetupper);
    }

    /**
     * Load referrer of whiteCompoundPkRefManyToPKList by the set-upper of referrer. <br />
     * white_compound_pk_ref_many by REF_MANY_FIRST_ID, REF_MANY_SECOND_ID, named 'whiteCompoundPkRefManyToPKList'.
     * <pre>
     * whiteCompoundPkBhv.<span style="color: #DD4747">loadWhiteCompoundPkRefManyToPKList</span>(whiteCompoundPkList, new ConditionBeanSetupper&lt;WhiteCompoundPkRefManyCB&gt;() {
     *     public void setup(WhiteCompoundPkRefManyCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here by calling like '}).withNestedList(new ...)'</span>
     * for (WhiteCompoundPk whiteCompoundPk : whiteCompoundPkList) {
     *     ... = whiteCompoundPk.<span style="color: #DD4747">getWhiteCompoundPkRefManyToPKList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().set[ForeignKey]_InScope(pkList);
     * cb.query().addOrderBy_[ForeignKey]_Asc();
     * </pre>
     * @param whiteCompoundPkList The entity list of whiteCompoundPk. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<WhiteCompoundPkRefMany> loadWhiteCompoundPkRefManyToPKList(List<WhiteCompoundPk> whiteCompoundPkList, ConditionBeanSetupper<WhiteCompoundPkRefManyCB> conditionBeanSetupper) {
        xassLRArg(whiteCompoundPkList, conditionBeanSetupper);
        return loadWhiteCompoundPkRefManyToPKList(whiteCompoundPkList, new LoadReferrerOption<WhiteCompoundPkRefManyCB, WhiteCompoundPkRefMany>().xinit(conditionBeanSetupper));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param whiteCompoundPk The entity of whiteCompoundPk. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<WhiteCompoundPkRefMany> loadWhiteCompoundPkRefManyToPKList(WhiteCompoundPk whiteCompoundPk, LoadReferrerOption<WhiteCompoundPkRefManyCB, WhiteCompoundPkRefMany> loadReferrerOption) {
        xassLRArg(whiteCompoundPk, loadReferrerOption);
        return loadWhiteCompoundPkRefManyToPKList(xnewLRLs(whiteCompoundPk), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param whiteCompoundPkList The entity list of whiteCompoundPk. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerLoader<WhiteCompoundPkRefMany> loadWhiteCompoundPkRefManyToPKList(List<WhiteCompoundPk> whiteCompoundPkList, LoadReferrerOption<WhiteCompoundPkRefManyCB, WhiteCompoundPkRefMany> loadReferrerOption) {
        xassLRArg(whiteCompoundPkList, loadReferrerOption);
        if (whiteCompoundPkList.isEmpty()) { return (NestedReferrerLoader<WhiteCompoundPkRefMany>)EMPTY_LOADER; }
        return doLoadWhiteCompoundPkRefManyToPKList(whiteCompoundPkList, loadReferrerOption);
    }

    protected NestedReferrerLoader<WhiteCompoundPkRefMany> doLoadWhiteCompoundPkRefManyToPKList(List<WhiteCompoundPk> whiteCompoundPkList, LoadReferrerOption<WhiteCompoundPkRefManyCB, WhiteCompoundPkRefMany> option) {
        final WhiteCompoundPkRefManyBhv referrerBhv = xgetBSFLR().select(WhiteCompoundPkRefManyBhv.class);
        return helpLoadReferrerInternally(whiteCompoundPkList, option, new InternalLoadReferrerCallback<WhiteCompoundPk, java.util.Map<String, Object>, WhiteCompoundPkRefManyCB, WhiteCompoundPkRefMany>() {
            public java.util.Map<String, Object> getPKVal(WhiteCompoundPk et) {
                java.util.Map<String, Object> primaryKeyMap = new java.util.LinkedHashMap<String, Object>();
                primaryKeyMap.put("PkFirstId", et.getPkFirstId());
                primaryKeyMap.put("PkSecondId", et.getPkSecondId());
                return primaryKeyMap;
            }
            public void setRfLs(WhiteCompoundPk et, List<WhiteCompoundPkRefMany> ls) { et.setWhiteCompoundPkRefManyToPKList(ls); }
            public WhiteCompoundPkRefManyCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(WhiteCompoundPkRefManyCB cb, List<java.util.Map<String, Object>> ls) {
                final String aliasName = cb.getSqlClause().getBasePointAliasName();
                String identity = null;
                StringBuilder sb = new StringBuilder();
                for (java.util.Map<String, Object> primaryKeyMap : ls) {
                    if (sb.length() > 0) { sb.append(")").append(ln()).append("     or ("); }
                    sb.append(aliasName).append(".REF_MANY_FIRST_ID = ");
                    identity = "whiteCompoundPkRefManyToPKListPkFirstId";
                    sb.append(cb.query().xregisterFreeParameterToThemeList(identity, primaryKeyMap.get("PkFirstId")));
                    sb.append(" and ");
                    sb.append(aliasName).append(".REF_MANY_SECOND_ID = ");
                    identity = "whiteCompoundPkRefManyToPKListPkSecondId";
                    sb.append(cb.query().xregisterFreeParameterToThemeList(identity, primaryKeyMap.get("PkSecondId")));
                }
                sb.insert(0, "((").append("))");
                cb.getSqlClause().registerWhereClause(sb.toString(), aliasName);
            }
            public void qyOdFKAsc(WhiteCompoundPkRefManyCB cb) {
                cb.query().addOrderBy_RefManyFirstId_Asc();
                cb.query().addOrderBy_RefManySecondId_Asc();
            }
            public void spFKCol(WhiteCompoundPkRefManyCB cb) {
                cb.specify().columnRefManyFirstId();
                cb.specify().columnRefManySecondId();
            }
            public List<WhiteCompoundPkRefMany> selRfLs(WhiteCompoundPkRefManyCB cb) { return referrerBhv.selectList(cb); }
            public java.util.Map<String, Object> getFKVal(WhiteCompoundPkRefMany re) {
                java.util.Map<String, Object> foreignKeyMap = new java.util.LinkedHashMap<String, Object>();
                foreignKeyMap.put("PkFirstId", re.getRefManyFirstId());
                foreignKeyMap.put("PkSecondId", re.getRefManySecondId());
                return foreignKeyMap;
            }
            public void setlcEt(WhiteCompoundPkRefMany re, WhiteCompoundPk le) { re.setWhiteCompoundPkToPK(le); }
            public String getRfPrNm() { return "whiteCompoundPkRefManyToPKList"; }
        });
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'WhiteCompoundReferredNormally'.
     * @param whiteCompoundPkList The list of whiteCompoundPk. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteCompoundReferredNormally> pulloutWhiteCompoundReferredNormally(List<WhiteCompoundPk> whiteCompoundPkList) {
        return helpPulloutInternally(whiteCompoundPkList, new InternalPulloutCallback<WhiteCompoundPk, WhiteCompoundReferredNormally>() {
            public WhiteCompoundReferredNormally getFr(WhiteCompoundPk et) { return et.getWhiteCompoundReferredNormally(); }
            public boolean hasRf() { return true; }
            public void setRfLs(WhiteCompoundReferredNormally et, List<WhiteCompoundPk> ls)
            { et.setWhiteCompoundPkList(ls); }
        });
    }
    /**
     * Pull out the list of foreign table 'WhiteCompoundReferredPrimary'.
     * @param whiteCompoundPkList The list of whiteCompoundPk. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteCompoundReferredPrimary> pulloutWhiteCompoundReferredPrimary(List<WhiteCompoundPk> whiteCompoundPkList) {
        return helpPulloutInternally(whiteCompoundPkList, new InternalPulloutCallback<WhiteCompoundPk, WhiteCompoundReferredPrimary>() {
            public WhiteCompoundReferredPrimary getFr(WhiteCompoundPk et) { return et.getWhiteCompoundReferredPrimary(); }
            public boolean hasRf() { return true; }
            public void setRfLs(WhiteCompoundReferredPrimary et, List<WhiteCompoundPk> ls)
            { et.setWhiteCompoundPkList(ls); }
        });
    }
    /**
     * Pull out the list of foreign table 'WhiteCompoundPkRefMany'.
     * @param whiteCompoundPkList The list of whiteCompoundPk. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteCompoundPkRefMany> pulloutWhiteCompoundPkRefManyAsMax(List<WhiteCompoundPk> whiteCompoundPkList) {
        return helpPulloutInternally(whiteCompoundPkList, new InternalPulloutCallback<WhiteCompoundPk, WhiteCompoundPkRefMany>() {
            public WhiteCompoundPkRefMany getFr(WhiteCompoundPk et) { return et.getWhiteCompoundPkRefManyAsMax(); }
            public boolean hasRf() { return false; }
            public void setRfLs(WhiteCompoundPkRefMany et, List<WhiteCompoundPk> ls)
            { throw new UnsupportedOperationException(); }
        });
    }
    /**
     * Pull out the list of foreign table 'WhiteCompoundPkRefMany'.
     * @param whiteCompoundPkList The list of whiteCompoundPk. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteCompoundPkRefMany> pulloutWhiteCompoundPkRefManyAsMin(List<WhiteCompoundPk> whiteCompoundPkList) {
        return helpPulloutInternally(whiteCompoundPkList, new InternalPulloutCallback<WhiteCompoundPk, WhiteCompoundPkRefMany>() {
            public WhiteCompoundPkRefMany getFr(WhiteCompoundPk et) { return et.getWhiteCompoundPkRefManyAsMin(); }
            public boolean hasRf() { return false; }
            public void setRfLs(WhiteCompoundPkRefMany et, List<WhiteCompoundPk> ls)
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
     * WhiteCompoundPk whiteCompoundPk = new WhiteCompoundPk();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteCompoundPk.setFoo...(value);
     * whiteCompoundPk.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteCompoundPk.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteCompoundPk.set...;</span>
     * whiteCompoundPkBhv.<span style="color: #DD4747">insert</span>(whiteCompoundPk);
     * ... = whiteCompoundPk.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteCompoundPk The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteCompoundPk whiteCompoundPk) {
        doInsert(whiteCompoundPk, null);
    }

    protected void doInsert(WhiteCompoundPk whiteCompoundPk, InsertOption<WhiteCompoundPkCB> op) {
        assertObjectNotNull("whiteCompoundPk", whiteCompoundPk);
        prepareInsertOption(op);
        delegateInsert(whiteCompoundPk, op);
    }

    protected void prepareInsertOption(InsertOption<WhiteCompoundPkCB> op) {
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
     * WhiteCompoundPk whiteCompoundPk = new WhiteCompoundPk();
     * whiteCompoundPk.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteCompoundPk.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteCompoundPk.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteCompoundPk.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteCompoundPk.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteCompoundPkBhv.<span style="color: #DD4747">update</span>(whiteCompoundPk);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteCompoundPk The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final WhiteCompoundPk whiteCompoundPk) {
        doUpdate(whiteCompoundPk, null);
    }

    protected void doUpdate(WhiteCompoundPk whiteCompoundPk, final UpdateOption<WhiteCompoundPkCB> op) {
        assertObjectNotNull("whiteCompoundPk", whiteCompoundPk);
        prepareUpdateOption(op);
        helpUpdateInternally(whiteCompoundPk, new InternalUpdateCallback<WhiteCompoundPk>() {
            public int callbackDelegateUpdate(WhiteCompoundPk et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhiteCompoundPkCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected WhiteCompoundPkCB createCBForVaryingUpdate() {
        WhiteCompoundPkCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected WhiteCompoundPkCB createCBForSpecifiedUpdate() {
        WhiteCompoundPkCB cb = newMyConditionBean();
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
     * @param whiteCompoundPk The entity of insert or update target. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteCompoundPk whiteCompoundPk) {
        doInesrtOrUpdate(whiteCompoundPk, null, null);
    }

    protected void doInesrtOrUpdate(WhiteCompoundPk whiteCompoundPk, final InsertOption<WhiteCompoundPkCB> iop, final UpdateOption<WhiteCompoundPkCB> uop) {
        helpInsertOrUpdateInternally(whiteCompoundPk, new InternalInsertOrUpdateCallback<WhiteCompoundPk, WhiteCompoundPkCB>() {
            public void callbackInsert(WhiteCompoundPk et) { doInsert(et, iop); }
            public void callbackUpdate(WhiteCompoundPk et) { doUpdate(et, uop); }
            public WhiteCompoundPkCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(WhiteCompoundPkCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<WhiteCompoundPkCB>();
            uop = uop != null ? uop : new UpdateOption<WhiteCompoundPkCB>();
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
     * WhiteCompoundPk whiteCompoundPk = new WhiteCompoundPk();
     * whiteCompoundPk.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteCompoundPk.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteCompoundPkBhv.<span style="color: #DD4747">delete</span>(whiteCompoundPk);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteCompoundPk The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteCompoundPk whiteCompoundPk) {
        doDelete(whiteCompoundPk, null);
    }

    protected void doDelete(WhiteCompoundPk whiteCompoundPk, final DeleteOption<WhiteCompoundPkCB> op) {
        assertObjectNotNull("whiteCompoundPk", whiteCompoundPk);
        prepareDeleteOption(op);
        helpDeleteInternally(whiteCompoundPk, new InternalDeleteCallback<WhiteCompoundPk>() {
            public int callbackDelegateDelete(WhiteCompoundPk et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhiteCompoundPkCB> op) {
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
     *     WhiteCompoundPk whiteCompoundPk = new WhiteCompoundPk();
     *     whiteCompoundPk.setFooName("foo");
     *     if (...) {
     *         whiteCompoundPk.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteCompoundPkList.add(whiteCompoundPk);
     * }
     * whiteCompoundPkBhv.<span style="color: #DD4747">batchInsert</span>(whiteCompoundPkList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteCompoundPkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteCompoundPk> whiteCompoundPkList) {
        InsertOption<WhiteCompoundPkCB> op = createInsertUpdateOption();
        return doBatchInsert(whiteCompoundPkList, op);
    }

    protected int[] doBatchInsert(List<WhiteCompoundPk> whiteCompoundPkList, InsertOption<WhiteCompoundPkCB> op) {
        assertObjectNotNull("whiteCompoundPkList", whiteCompoundPkList);
        prepareBatchInsertOption(whiteCompoundPkList, op);
        return delegateBatchInsert(whiteCompoundPkList, op);
    }

    protected void prepareBatchInsertOption(List<WhiteCompoundPk> whiteCompoundPkList, InsertOption<WhiteCompoundPkCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(whiteCompoundPkList);
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
     *     WhiteCompoundPk whiteCompoundPk = new WhiteCompoundPk();
     *     whiteCompoundPk.setFooName("foo");
     *     if (...) {
     *         whiteCompoundPk.setFooPrice(123);
     *     } else {
     *         whiteCompoundPk.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteCompoundPk.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteCompoundPkList.add(whiteCompoundPk);
     * }
     * whiteCompoundPkBhv.<span style="color: #DD4747">batchUpdate</span>(whiteCompoundPkList);
     * </pre>
     * @param whiteCompoundPkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteCompoundPk> whiteCompoundPkList) {
        UpdateOption<WhiteCompoundPkCB> op = createPlainUpdateOption();
        return doBatchUpdate(whiteCompoundPkList, op);
    }

    protected int[] doBatchUpdate(List<WhiteCompoundPk> whiteCompoundPkList, UpdateOption<WhiteCompoundPkCB> op) {
        assertObjectNotNull("whiteCompoundPkList", whiteCompoundPkList);
        prepareBatchUpdateOption(whiteCompoundPkList, op);
        return delegateBatchUpdate(whiteCompoundPkList, op);
    }

    protected void prepareBatchUpdateOption(List<WhiteCompoundPk> whiteCompoundPkList, UpdateOption<WhiteCompoundPkCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(whiteCompoundPkList);
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
     * whiteCompoundPkBhv.<span style="color: #DD4747">batchUpdate</span>(whiteCompoundPkList, new SpecifyQuery<WhiteCompoundPkCB>() {
     *     public void specify(WhiteCompoundPkCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteCompoundPkBhv.<span style="color: #DD4747">batchUpdate</span>(whiteCompoundPkList, new SpecifyQuery<WhiteCompoundPkCB>() {
     *     public void specify(WhiteCompoundPkCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteCompoundPkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteCompoundPk> whiteCompoundPkList, SpecifyQuery<WhiteCompoundPkCB> updateColumnSpec) {
        return doBatchUpdate(whiteCompoundPkList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteCompoundPkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteCompoundPk> whiteCompoundPkList) {
        return doBatchDelete(whiteCompoundPkList, null);
    }

    protected int[] doBatchDelete(List<WhiteCompoundPk> whiteCompoundPkList, DeleteOption<WhiteCompoundPkCB> op) {
        assertObjectNotNull("whiteCompoundPkList", whiteCompoundPkList);
        prepareDeleteOption(op);
        return delegateBatchDelete(whiteCompoundPkList, op);
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
     * whiteCompoundPkBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteCompoundPk, WhiteCompoundPkCB&gt;() {
     *     public ConditionBean setup(whiteCompoundPk entity, WhiteCompoundPkCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteCompoundPk, WhiteCompoundPkCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteCompoundPk, WhiteCompoundPkCB> sp, InsertOption<WhiteCompoundPkCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        WhiteCompoundPk e = new WhiteCompoundPk();
        WhiteCompoundPkCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected WhiteCompoundPkCB createCBForQueryInsert() {
        WhiteCompoundPkCB cb = newMyConditionBean();
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
     * WhiteCompoundPk whiteCompoundPk = new WhiteCompoundPk();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteCompoundPk.setPK...(value);</span>
     * whiteCompoundPk.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteCompoundPk.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteCompoundPk.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteCompoundPk.setVersionNo(value);</span>
     * WhiteCompoundPkCB cb = new WhiteCompoundPkCB();
     * cb.query().setFoo...(value);
     * whiteCompoundPkBhv.<span style="color: #DD4747">queryUpdate</span>(whiteCompoundPk, cb);
     * </pre>
     * @param whiteCompoundPk The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteCompoundPk. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteCompoundPk whiteCompoundPk, WhiteCompoundPkCB cb) {
        return doQueryUpdate(whiteCompoundPk, cb, null);
    }

    protected int doQueryUpdate(WhiteCompoundPk whiteCompoundPk, WhiteCompoundPkCB cb, UpdateOption<WhiteCompoundPkCB> op) {
        assertObjectNotNull("whiteCompoundPk", whiteCompoundPk); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(whiteCompoundPk, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (WhiteCompoundPkCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (WhiteCompoundPkCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteCompoundPkCB cb = new WhiteCompoundPkCB();
     * cb.query().setFoo...(value);
     * whiteCompoundPkBhv.<span style="color: #DD4747">queryDelete</span>(whiteCompoundPk, cb);
     * </pre>
     * @param cb The condition-bean of WhiteCompoundPk. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteCompoundPkCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteCompoundPkCB cb, DeleteOption<WhiteCompoundPkCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((WhiteCompoundPkCB)cb); }
        else { return varyingQueryDelete((WhiteCompoundPkCB)cb, downcast(op)); }
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
     * WhiteCompoundPk whiteCompoundPk = new WhiteCompoundPk();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteCompoundPk.setFoo...(value);
     * whiteCompoundPk.setBar...(value);
     * InsertOption<WhiteCompoundPkCB> option = new InsertOption<WhiteCompoundPkCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteCompoundPkBhv.<span style="color: #DD4747">varyingInsert</span>(whiteCompoundPk, option);
     * ... = whiteCompoundPk.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteCompoundPk The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteCompoundPk whiteCompoundPk, InsertOption<WhiteCompoundPkCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteCompoundPk, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteCompoundPk whiteCompoundPk = new WhiteCompoundPk();
     * whiteCompoundPk.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteCompoundPk.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteCompoundPk.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteCompoundPkCB&gt; option = new UpdateOption&lt;WhiteCompoundPkCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteCompoundPkCB&gt;() {
     *         public void specify(WhiteCompoundPkCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteCompoundPkBhv.<span style="color: #DD4747">varyingUpdate</span>(whiteCompoundPk, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteCompoundPk The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteCompoundPk whiteCompoundPk, UpdateOption<WhiteCompoundPkCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteCompoundPk, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteCompoundPk The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteCompoundPk whiteCompoundPk, InsertOption<WhiteCompoundPkCB> insertOption, UpdateOption<WhiteCompoundPkCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(whiteCompoundPk, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteCompoundPk The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteCompoundPk whiteCompoundPk, DeleteOption<WhiteCompoundPkCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteCompoundPk, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteCompoundPkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteCompoundPk> whiteCompoundPkList, InsertOption<WhiteCompoundPkCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteCompoundPkList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteCompoundPkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteCompoundPk> whiteCompoundPkList, UpdateOption<WhiteCompoundPkCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteCompoundPkList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteCompoundPkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteCompoundPk> whiteCompoundPkList, DeleteOption<WhiteCompoundPkCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteCompoundPkList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteCompoundPk, WhiteCompoundPkCB> setupper, InsertOption<WhiteCompoundPkCB> option) {
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
     * WhiteCompoundPk whiteCompoundPk = new WhiteCompoundPk();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteCompoundPk.setPK...(value);</span>
     * whiteCompoundPk.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteCompoundPk.setVersionNo(value);</span>
     * WhiteCompoundPkCB cb = new WhiteCompoundPkCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteCompoundPkCB&gt; option = new UpdateOption&lt;WhiteCompoundPkCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteCompoundPkCB&gt;() {
     *     public void specify(WhiteCompoundPkCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteCompoundPkBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteCompoundPk, cb, option);
     * </pre>
     * @param whiteCompoundPk The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteCompoundPk. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteCompoundPk whiteCompoundPk, WhiteCompoundPkCB cb, UpdateOption<WhiteCompoundPkCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteCompoundPk, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteCompoundPk. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteCompoundPkCB cb, DeleteOption<WhiteCompoundPkCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteCompoundPkBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhiteCompoundPkCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhiteCompoundPkCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhiteCompoundPk> void delegateSelectCursor(WhiteCompoundPkCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends WhiteCompoundPk> List<ENTITY> delegateSelectList(WhiteCompoundPkCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhiteCompoundPk et, InsertOption<WhiteCompoundPkCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(WhiteCompoundPk et, UpdateOption<WhiteCompoundPkCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(WhiteCompoundPk et, UpdateOption<WhiteCompoundPkCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(WhiteCompoundPk et, DeleteOption<WhiteCompoundPkCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(WhiteCompoundPk et, DeleteOption<WhiteCompoundPkCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<WhiteCompoundPk> ls, InsertOption<WhiteCompoundPkCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhiteCompoundPk> ls, UpdateOption<WhiteCompoundPkCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhiteCompoundPk> ls, UpdateOption<WhiteCompoundPkCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhiteCompoundPk> ls, DeleteOption<WhiteCompoundPkCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhiteCompoundPk> ls, DeleteOption<WhiteCompoundPkCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhiteCompoundPk et, WhiteCompoundPkCB inCB, ConditionBean resCB, InsertOption<WhiteCompoundPkCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhiteCompoundPk et, WhiteCompoundPkCB cb, UpdateOption<WhiteCompoundPkCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(WhiteCompoundPkCB cb, DeleteOption<WhiteCompoundPkCB> op)
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
    protected WhiteCompoundPk downcast(Entity et) {
        return helpEntityDowncastInternally(et, WhiteCompoundPk.class);
    }

    protected WhiteCompoundPkCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, WhiteCompoundPkCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<WhiteCompoundPk> downcast(List<? extends Entity> ls) {
        return (List<WhiteCompoundPk>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteCompoundPkCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<WhiteCompoundPkCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteCompoundPkCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<WhiteCompoundPkCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteCompoundPkCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<WhiteCompoundPkCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteCompoundPk, WhiteCompoundPkCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<WhiteCompoundPk, WhiteCompoundPkCB>)sp;
    }
}
