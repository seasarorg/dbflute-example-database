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
 * The behavior of WHITE_COMPOUND_PK_REF as TABLE. <br />
 * <pre>
 * [primary key]
 *     MULTIPLE_FIRST_ID, MULTIPLE_SECOND_ID
 * 
 * [column]
 *     MULTIPLE_FIRST_ID, MULTIPLE_SECOND_ID, REF_FIRST_ID, REF_SECOND_ID
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
 *     white_compound_pk
 * 
 * [referrer table]
 *     white_compound_pk_ref_nest
 * 
 * [foreign property]
 *     whiteCompoundPk
 * 
 * [referrer property]
 *     whiteCompoundPkRefNestByQuxMultipleIdList, whiteCompoundPkRefNestByFooMultipleIdList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteCompoundPkRefBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_compound_pk_ref"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return WhiteCompoundPkRefDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteCompoundPkRefDbm getMyDBMeta() { return WhiteCompoundPkRefDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteCompoundPkRef newMyEntity() { return new WhiteCompoundPkRef(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteCompoundPkRefCB newMyConditionBean() { return new WhiteCompoundPkRefCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteCompoundPkRefCB cb = new WhiteCompoundPkRefCB();
     * cb.query().setFoo...(value);
     * int count = whiteCompoundPkRefBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteCompoundPkRef. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteCompoundPkRefCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteCompoundPkRefCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteCompoundPkRefCB cb) { // called by selectPage(cb)
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
     * WhiteCompoundPkRefCB cb = new WhiteCompoundPkRefCB();
     * cb.query().setFoo...(value);
     * WhiteCompoundPkRef whiteCompoundPkRef = whiteCompoundPkRefBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (whiteCompoundPkRef != null) {
     *     ... = whiteCompoundPkRef.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteCompoundPkRef. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteCompoundPkRef selectEntity(WhiteCompoundPkRefCB cb) {
        return doSelectEntity(cb, WhiteCompoundPkRef.class);
    }

    protected <ENTITY extends WhiteCompoundPkRef> ENTITY doSelectEntity(final WhiteCompoundPkRefCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, entityType, new InternalSelectEntityCallback<ENTITY, WhiteCompoundPkRefCB>() {
            public List<ENTITY> callbackSelectList(WhiteCompoundPkRefCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * WhiteCompoundPkRefCB cb = new WhiteCompoundPkRefCB();
     * cb.query().setFoo...(value);
     * WhiteCompoundPkRef whiteCompoundPkRef = whiteCompoundPkRefBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteCompoundPkRef.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteCompoundPkRef. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteCompoundPkRef selectEntityWithDeletedCheck(WhiteCompoundPkRefCB cb) {
        return doSelectEntityWithDeletedCheck(cb, WhiteCompoundPkRef.class);
    }

    protected <ENTITY extends WhiteCompoundPkRef> ENTITY doSelectEntityWithDeletedCheck(final WhiteCompoundPkRefCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, entityType, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteCompoundPkRefCB>() {
            public List<ENTITY> callbackSelectList(WhiteCompoundPkRefCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param multipleFirstId The one of primary key. (NotNull)
     * @param multipleSecondId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteCompoundPkRef selectByPKValue(Integer multipleFirstId, Integer multipleSecondId) {
        return doSelectByPKValue(multipleFirstId, multipleSecondId, WhiteCompoundPkRef.class);
    }

    protected <ENTITY extends WhiteCompoundPkRef> ENTITY doSelectByPKValue(Integer multipleFirstId, Integer multipleSecondId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(multipleFirstId, multipleSecondId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param multipleFirstId The one of primary key. (NotNull)
     * @param multipleSecondId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteCompoundPkRef selectByPKValueWithDeletedCheck(Integer multipleFirstId, Integer multipleSecondId) {
        return doSelectByPKValueWithDeletedCheck(multipleFirstId, multipleSecondId, WhiteCompoundPkRef.class);
    }

    protected <ENTITY extends WhiteCompoundPkRef> ENTITY doSelectByPKValueWithDeletedCheck(Integer multipleFirstId, Integer multipleSecondId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(multipleFirstId, multipleSecondId), entityType);
    }

    private WhiteCompoundPkRefCB buildPKCB(Integer multipleFirstId, Integer multipleSecondId) {
        assertObjectNotNull("multipleFirstId", multipleFirstId);assertObjectNotNull("multipleSecondId", multipleSecondId);
        WhiteCompoundPkRefCB cb = newMyConditionBean();
        cb.query().setMultipleFirstId_Equal(multipleFirstId);cb.query().setMultipleSecondId_Equal(multipleSecondId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteCompoundPkRefCB cb = new WhiteCompoundPkRefCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteCompoundPkRef&gt; whiteCompoundPkRefList = whiteCompoundPkRefBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (WhiteCompoundPkRef whiteCompoundPkRef : whiteCompoundPkRefList) {
     *     ... = whiteCompoundPkRef.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteCompoundPkRef. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteCompoundPkRef> selectList(WhiteCompoundPkRefCB cb) {
        return doSelectList(cb, WhiteCompoundPkRef.class);
    }

    protected <ENTITY extends WhiteCompoundPkRef> ListResultBean<ENTITY> doSelectList(WhiteCompoundPkRefCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, WhiteCompoundPkRefCB>() {
            public List<ENTITY> callbackSelectList(WhiteCompoundPkRefCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * WhiteCompoundPkRefCB cb = new WhiteCompoundPkRefCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteCompoundPkRef&gt; page = whiteCompoundPkRefBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteCompoundPkRef whiteCompoundPkRef : page) {
     *     ... = whiteCompoundPkRef.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteCompoundPkRef. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteCompoundPkRef> selectPage(WhiteCompoundPkRefCB cb) {
        return doSelectPage(cb, WhiteCompoundPkRef.class);
    }

    protected <ENTITY extends WhiteCompoundPkRef> PagingResultBean<ENTITY> doSelectPage(WhiteCompoundPkRefCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, WhiteCompoundPkRefCB>() {
            public int callbackSelectCount(WhiteCompoundPkRefCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteCompoundPkRefCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * WhiteCompoundPkRefCB cb = new WhiteCompoundPkRefCB();
     * cb.query().setFoo...(value);
     * whiteCompoundPkRefBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteCompoundPkRef&gt;() {
     *     public void handle(WhiteCompoundPkRef entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteCompoundPkRef. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteCompoundPkRef. (NotNull)
     */
    public void selectCursor(WhiteCompoundPkRefCB cb, EntityRowHandler<WhiteCompoundPkRef> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, WhiteCompoundPkRef.class);
    }

    protected <ENTITY extends WhiteCompoundPkRef> void doSelectCursor(WhiteCompoundPkRefCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<WhiteCompoundPkRef>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        helpSelectCursorInternally(cb, entityRowHandler, entityType, new InternalSelectCursorCallback<ENTITY, WhiteCompoundPkRefCB>() {
            public void callbackSelectCursor(WhiteCompoundPkRefCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) { delegateSelectCursor(cb, entityRowHandler, entityType); }
            public List<ENTITY> callbackSelectList(WhiteCompoundPkRefCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteCompoundPkRefBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteCompoundPkRefCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (NullAllowed)
     */
    public <RESULT> SLFunction<WhiteCompoundPkRefCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends WhiteCompoundPkRefCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
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
     * @param whiteCompoundPkRef The entity of whiteCompoundPkRef. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadWhiteCompoundPkRefNestByQuxMultipleIdList(WhiteCompoundPkRef whiteCompoundPkRef, ConditionBeanSetupper<WhiteCompoundPkRefNestCB> conditionBeanSetupper) {
        xassLRArg(whiteCompoundPkRef, conditionBeanSetupper);
        loadWhiteCompoundPkRefNestByQuxMultipleIdList(xnewLRLs(whiteCompoundPkRef), conditionBeanSetupper);
    }
    /**
     * Load referrer of whiteCompoundPkRefNestByQuxMultipleIdList with the set-upper for condition-bean of referrer. <br />
     * white_compound_pk_ref_nest by BAR_MULTIPLE_ID, QUX_MULTIPLE_ID, named 'whiteCompoundPkRefNestByQuxMultipleIdList'.
     * <pre>
     * whiteCompoundPkRefBhv.<span style="color: #FD4747">loadWhiteCompoundPkRefNestByQuxMultipleIdList</span>(whiteCompoundPkRefList, new ConditionBeanSetupper&lt;WhiteCompoundPkRefNestCB&gt;() {
     *     public void setup(WhiteCompoundPkRefNestCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (WhiteCompoundPkRef whiteCompoundPkRef : whiteCompoundPkRefList) {
     *     ... = whiteCompoundPkRef.<span style="color: #FD4747">getWhiteCompoundPkRefNestByQuxMultipleIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().set[ForeignKey]_InScope(pkList);
     * cb.query().addOrderBy_[ForeignKey]_Asc();
     * </pre>
     * @param whiteCompoundPkRefList The entity list of whiteCompoundPkRef. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadWhiteCompoundPkRefNestByQuxMultipleIdList(List<WhiteCompoundPkRef> whiteCompoundPkRefList, ConditionBeanSetupper<WhiteCompoundPkRefNestCB> conditionBeanSetupper) {
        xassLRArg(whiteCompoundPkRefList, conditionBeanSetupper);
        loadWhiteCompoundPkRefNestByQuxMultipleIdList(whiteCompoundPkRefList, new LoadReferrerOption<WhiteCompoundPkRefNestCB, WhiteCompoundPkRefNest>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param whiteCompoundPkRef The entity of whiteCompoundPkRef. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadWhiteCompoundPkRefNestByQuxMultipleIdList(WhiteCompoundPkRef whiteCompoundPkRef, LoadReferrerOption<WhiteCompoundPkRefNestCB, WhiteCompoundPkRefNest> loadReferrerOption) {
        xassLRArg(whiteCompoundPkRef, loadReferrerOption);
        loadWhiteCompoundPkRefNestByQuxMultipleIdList(xnewLRLs(whiteCompoundPkRef), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param whiteCompoundPkRefList The entity list of whiteCompoundPkRef. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadWhiteCompoundPkRefNestByQuxMultipleIdList(List<WhiteCompoundPkRef> whiteCompoundPkRefList, LoadReferrerOption<WhiteCompoundPkRefNestCB, WhiteCompoundPkRefNest> loadReferrerOption) {
        xassLRArg(whiteCompoundPkRefList, loadReferrerOption);
        if (whiteCompoundPkRefList.isEmpty()) { return; }
        final WhiteCompoundPkRefNestBhv referrerBhv = xgetBSFLR().select(WhiteCompoundPkRefNestBhv.class);
        helpLoadReferrerInternally(whiteCompoundPkRefList, loadReferrerOption, new InternalLoadReferrerCallback<WhiteCompoundPkRef, java.util.Map<String, Object>, WhiteCompoundPkRefNestCB, WhiteCompoundPkRefNest>() {
            public java.util.Map<String, Object> getPKVal(WhiteCompoundPkRef e) {
                java.util.Map<String, Object> primaryKeyMap = new java.util.LinkedHashMap<String, Object>();
                primaryKeyMap.put("MultipleFirstId", e.getMultipleFirstId());
                primaryKeyMap.put("MultipleSecondId", e.getMultipleSecondId());
                return primaryKeyMap;
            }
            public void setRfLs(WhiteCompoundPkRef e, List<WhiteCompoundPkRefNest> ls) { e.setWhiteCompoundPkRefNestByQuxMultipleIdList(ls); }
            public WhiteCompoundPkRefNestCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(WhiteCompoundPkRefNestCB cb, List<java.util.Map<String, Object>> ls) {
                final String aliasName = cb.getSqlClause().getBasePointAliasName();
                String identity = null;
                StringBuilder sb = new StringBuilder();
                for (java.util.Map<String, Object> primaryKeyMap : ls) {
                    if (sb.length() > 0) { sb.append(")").append(ln()).append("     or ("); }
                    sb.append(aliasName).append(".BAR_MULTIPLE_ID = ");
                    identity = "whiteCompoundPkRefNestByQuxMultipleIdListMultipleFirstId";
                    sb.append(cb.query().xregisterFreeParameterToThemeList(identity, primaryKeyMap.get("MultipleFirstId")));
                    sb.append(" and ");
                    sb.append(aliasName).append(".QUX_MULTIPLE_ID = ");
                    identity = "whiteCompoundPkRefNestByQuxMultipleIdListMultipleSecondId";
                    sb.append(cb.query().xregisterFreeParameterToThemeList(identity, primaryKeyMap.get("MultipleSecondId")));
                }
                sb.insert(0, "((").append("))");
                cb.getSqlClause().registerWhereClause(sb.toString(), aliasName);
            }
            public void qyOdFKAsc(WhiteCompoundPkRefNestCB cb) {
                cb.query().addOrderBy_BarMultipleId_Asc();
                cb.query().addOrderBy_QuxMultipleId_Asc();
            }
            public void spFKCol(WhiteCompoundPkRefNestCB cb) {
                cb.specify().columnBarMultipleId();
                cb.specify().columnQuxMultipleId();
            }
            public List<WhiteCompoundPkRefNest> selRfLs(WhiteCompoundPkRefNestCB cb) { return referrerBhv.selectList(cb); }
            public java.util.Map<String, Object> getFKVal(WhiteCompoundPkRefNest e) {
                java.util.Map<String, Object> foreignKeyMap = new java.util.LinkedHashMap<String, Object>();
                foreignKeyMap.put("MultipleFirstId", e.getBarMultipleId());
                foreignKeyMap.put("MultipleSecondId", e.getQuxMultipleId());
                return foreignKeyMap;
            }
            public void setlcEt(WhiteCompoundPkRefNest re, WhiteCompoundPkRef le) { re.setWhiteCompoundPkRefByQuxMultipleId(le); }
            public String getRfPrNm() { return "whiteCompoundPkRefNestByQuxMultipleIdList"; }
        });
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param whiteCompoundPkRef The entity of whiteCompoundPkRef. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadWhiteCompoundPkRefNestByFooMultipleIdList(WhiteCompoundPkRef whiteCompoundPkRef, ConditionBeanSetupper<WhiteCompoundPkRefNestCB> conditionBeanSetupper) {
        xassLRArg(whiteCompoundPkRef, conditionBeanSetupper);
        loadWhiteCompoundPkRefNestByFooMultipleIdList(xnewLRLs(whiteCompoundPkRef), conditionBeanSetupper);
    }
    /**
     * Load referrer of whiteCompoundPkRefNestByFooMultipleIdList with the set-upper for condition-bean of referrer. <br />
     * white_compound_pk_ref_nest by FOO_MULTIPLE_ID, BAR_MULTIPLE_ID, named 'whiteCompoundPkRefNestByFooMultipleIdList'.
     * <pre>
     * whiteCompoundPkRefBhv.<span style="color: #FD4747">loadWhiteCompoundPkRefNestByFooMultipleIdList</span>(whiteCompoundPkRefList, new ConditionBeanSetupper&lt;WhiteCompoundPkRefNestCB&gt;() {
     *     public void setup(WhiteCompoundPkRefNestCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (WhiteCompoundPkRef whiteCompoundPkRef : whiteCompoundPkRefList) {
     *     ... = whiteCompoundPkRef.<span style="color: #FD4747">getWhiteCompoundPkRefNestByFooMultipleIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().set[ForeignKey]_InScope(pkList);
     * cb.query().addOrderBy_[ForeignKey]_Asc();
     * </pre>
     * @param whiteCompoundPkRefList The entity list of whiteCompoundPkRef. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadWhiteCompoundPkRefNestByFooMultipleIdList(List<WhiteCompoundPkRef> whiteCompoundPkRefList, ConditionBeanSetupper<WhiteCompoundPkRefNestCB> conditionBeanSetupper) {
        xassLRArg(whiteCompoundPkRefList, conditionBeanSetupper);
        loadWhiteCompoundPkRefNestByFooMultipleIdList(whiteCompoundPkRefList, new LoadReferrerOption<WhiteCompoundPkRefNestCB, WhiteCompoundPkRefNest>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param whiteCompoundPkRef The entity of whiteCompoundPkRef. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadWhiteCompoundPkRefNestByFooMultipleIdList(WhiteCompoundPkRef whiteCompoundPkRef, LoadReferrerOption<WhiteCompoundPkRefNestCB, WhiteCompoundPkRefNest> loadReferrerOption) {
        xassLRArg(whiteCompoundPkRef, loadReferrerOption);
        loadWhiteCompoundPkRefNestByFooMultipleIdList(xnewLRLs(whiteCompoundPkRef), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param whiteCompoundPkRefList The entity list of whiteCompoundPkRef. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadWhiteCompoundPkRefNestByFooMultipleIdList(List<WhiteCompoundPkRef> whiteCompoundPkRefList, LoadReferrerOption<WhiteCompoundPkRefNestCB, WhiteCompoundPkRefNest> loadReferrerOption) {
        xassLRArg(whiteCompoundPkRefList, loadReferrerOption);
        if (whiteCompoundPkRefList.isEmpty()) { return; }
        final WhiteCompoundPkRefNestBhv referrerBhv = xgetBSFLR().select(WhiteCompoundPkRefNestBhv.class);
        helpLoadReferrerInternally(whiteCompoundPkRefList, loadReferrerOption, new InternalLoadReferrerCallback<WhiteCompoundPkRef, java.util.Map<String, Object>, WhiteCompoundPkRefNestCB, WhiteCompoundPkRefNest>() {
            public java.util.Map<String, Object> getPKVal(WhiteCompoundPkRef e) {
                java.util.Map<String, Object> primaryKeyMap = new java.util.LinkedHashMap<String, Object>();
                primaryKeyMap.put("MultipleFirstId", e.getMultipleFirstId());
                primaryKeyMap.put("MultipleSecondId", e.getMultipleSecondId());
                return primaryKeyMap;
            }
            public void setRfLs(WhiteCompoundPkRef e, List<WhiteCompoundPkRefNest> ls) { e.setWhiteCompoundPkRefNestByFooMultipleIdList(ls); }
            public WhiteCompoundPkRefNestCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(WhiteCompoundPkRefNestCB cb, List<java.util.Map<String, Object>> ls) {
                final String aliasName = cb.getSqlClause().getBasePointAliasName();
                String identity = null;
                StringBuilder sb = new StringBuilder();
                for (java.util.Map<String, Object> primaryKeyMap : ls) {
                    if (sb.length() > 0) { sb.append(")").append(ln()).append("     or ("); }
                    sb.append(aliasName).append(".FOO_MULTIPLE_ID = ");
                    identity = "whiteCompoundPkRefNestByFooMultipleIdListMultipleFirstId";
                    sb.append(cb.query().xregisterFreeParameterToThemeList(identity, primaryKeyMap.get("MultipleFirstId")));
                    sb.append(" and ");
                    sb.append(aliasName).append(".BAR_MULTIPLE_ID = ");
                    identity = "whiteCompoundPkRefNestByFooMultipleIdListMultipleSecondId";
                    sb.append(cb.query().xregisterFreeParameterToThemeList(identity, primaryKeyMap.get("MultipleSecondId")));
                }
                sb.insert(0, "((").append("))");
                cb.getSqlClause().registerWhereClause(sb.toString(), aliasName);
            }
            public void qyOdFKAsc(WhiteCompoundPkRefNestCB cb) {
                cb.query().addOrderBy_FooMultipleId_Asc();
                cb.query().addOrderBy_BarMultipleId_Asc();
            }
            public void spFKCol(WhiteCompoundPkRefNestCB cb) {
                cb.specify().columnFooMultipleId();
                cb.specify().columnBarMultipleId();
            }
            public List<WhiteCompoundPkRefNest> selRfLs(WhiteCompoundPkRefNestCB cb) { return referrerBhv.selectList(cb); }
            public java.util.Map<String, Object> getFKVal(WhiteCompoundPkRefNest e) {
                java.util.Map<String, Object> foreignKeyMap = new java.util.LinkedHashMap<String, Object>();
                foreignKeyMap.put("MultipleFirstId", e.getFooMultipleId());
                foreignKeyMap.put("MultipleSecondId", e.getBarMultipleId());
                return foreignKeyMap;
            }
            public void setlcEt(WhiteCompoundPkRefNest re, WhiteCompoundPkRef le) { re.setWhiteCompoundPkRefByFooMultipleId(le); }
            public String getRfPrNm() { return "whiteCompoundPkRefNestByFooMultipleIdList"; }
        });
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'WhiteCompoundPk'.
     * @param whiteCompoundPkRefList The list of whiteCompoundPkRef. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteCompoundPk> pulloutWhiteCompoundPk(List<WhiteCompoundPkRef> whiteCompoundPkRefList) {
        return helpPulloutInternally(whiteCompoundPkRefList, new InternalPulloutCallback<WhiteCompoundPkRef, WhiteCompoundPk>() {
            public WhiteCompoundPk getFr(WhiteCompoundPkRef e) { return e.getWhiteCompoundPk(); }
            public boolean hasRf() { return true; }
            public void setRfLs(WhiteCompoundPk e, List<WhiteCompoundPkRef> ls)
            { e.setWhiteCompoundPkRefList(ls); }
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
     * WhiteCompoundPkRef whiteCompoundPkRef = new WhiteCompoundPkRef();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteCompoundPkRef.setFoo...(value);
     * whiteCompoundPkRef.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteCompoundPkRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteCompoundPkRef.set...;</span>
     * whiteCompoundPkRefBhv.<span style="color: #FD4747">insert</span>(whiteCompoundPkRef);
     * ... = whiteCompoundPkRef.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteCompoundPkRef The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteCompoundPkRef whiteCompoundPkRef) {
        doInsert(whiteCompoundPkRef, null);
    }

    protected void doInsert(WhiteCompoundPkRef whiteCompoundPkRef, InsertOption<WhiteCompoundPkRefCB> option) {
        assertObjectNotNull("whiteCompoundPkRef", whiteCompoundPkRef);
        prepareInsertOption(option);
        delegateInsert(whiteCompoundPkRef, option);
    }

    protected void prepareInsertOption(InsertOption<WhiteCompoundPkRefCB> option) {
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
     * WhiteCompoundPkRef whiteCompoundPkRef = new WhiteCompoundPkRef();
     * whiteCompoundPkRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteCompoundPkRef.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteCompoundPkRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteCompoundPkRef.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteCompoundPkRef.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteCompoundPkRefBhv.<span style="color: #FD4747">update</span>(whiteCompoundPkRef);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param whiteCompoundPkRef The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final WhiteCompoundPkRef whiteCompoundPkRef) {
        doUpdate(whiteCompoundPkRef, null);
    }

    protected void doUpdate(WhiteCompoundPkRef whiteCompoundPkRef, final UpdateOption<WhiteCompoundPkRefCB> option) {
        assertObjectNotNull("whiteCompoundPkRef", whiteCompoundPkRef);
        prepareUpdateOption(option);
        helpUpdateInternally(whiteCompoundPkRef, new InternalUpdateCallback<WhiteCompoundPkRef>() {
            public int callbackDelegateUpdate(WhiteCompoundPkRef entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhiteCompoundPkRefCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected WhiteCompoundPkRefCB createCBForVaryingUpdate() {
        WhiteCompoundPkRefCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected WhiteCompoundPkRefCB createCBForSpecifiedUpdate() {
        WhiteCompoundPkRefCB cb = newMyConditionBean();
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
     * @param whiteCompoundPkRef The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteCompoundPkRef whiteCompoundPkRef) {
        doInesrtOrUpdate(whiteCompoundPkRef, null, null);
    }

    protected void doInesrtOrUpdate(WhiteCompoundPkRef whiteCompoundPkRef, final InsertOption<WhiteCompoundPkRefCB> insertOption, final UpdateOption<WhiteCompoundPkRefCB> updateOption) {
        helpInsertOrUpdateInternally(whiteCompoundPkRef, new InternalInsertOrUpdateCallback<WhiteCompoundPkRef, WhiteCompoundPkRefCB>() {
            public void callbackInsert(WhiteCompoundPkRef entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(WhiteCompoundPkRef entity) { doUpdate(entity, updateOption); }
            public WhiteCompoundPkRefCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(WhiteCompoundPkRefCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<WhiteCompoundPkRefCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<WhiteCompoundPkRefCB>() : updateOption;
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
     * WhiteCompoundPkRef whiteCompoundPkRef = new WhiteCompoundPkRef();
     * whiteCompoundPkRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteCompoundPkRef.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteCompoundPkRefBhv.<span style="color: #FD4747">delete</span>(whiteCompoundPkRef);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param whiteCompoundPkRef The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteCompoundPkRef whiteCompoundPkRef) {
        doDelete(whiteCompoundPkRef, null);
    }

    protected void doDelete(WhiteCompoundPkRef whiteCompoundPkRef, final DeleteOption<WhiteCompoundPkRefCB> option) {
        assertObjectNotNull("whiteCompoundPkRef", whiteCompoundPkRef);
        prepareDeleteOption(option);
        helpDeleteInternally(whiteCompoundPkRef, new InternalDeleteCallback<WhiteCompoundPkRef>() {
            public int callbackDelegateDelete(WhiteCompoundPkRef entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhiteCompoundPkRefCB> option) {
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
     *     WhiteCompoundPkRef whiteCompoundPkRef = new WhiteCompoundPkRef();
     *     whiteCompoundPkRef.setFooName("foo");
     *     if (...) {
     *         whiteCompoundPkRef.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteCompoundPkRefList.add(whiteCompoundPkRef);
     * }
     * whiteCompoundPkRefBhv.<span style="color: #FD4747">batchInsert</span>(whiteCompoundPkRefList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteCompoundPkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteCompoundPkRef> whiteCompoundPkRefList) {
        InsertOption<WhiteCompoundPkRefCB> option = createInsertUpdateOption();
        return doBatchInsert(whiteCompoundPkRefList, option);
    }

    protected int[] doBatchInsert(List<WhiteCompoundPkRef> whiteCompoundPkRefList, InsertOption<WhiteCompoundPkRefCB> option) {
        assertObjectNotNull("whiteCompoundPkRefList", whiteCompoundPkRefList);
        prepareBatchInsertOption(whiteCompoundPkRefList, option);
        return delegateBatchInsert(whiteCompoundPkRefList, option);
    }

    protected void prepareBatchInsertOption(List<WhiteCompoundPkRef> whiteCompoundPkRefList, InsertOption<WhiteCompoundPkRefCB> option) {
        option.xallowInsertColumnModifiedPropertiesFragmented();
        option.xacceptInsertColumnModifiedPropertiesIfNeeds(whiteCompoundPkRefList);
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
     *     WhiteCompoundPkRef whiteCompoundPkRef = new WhiteCompoundPkRef();
     *     whiteCompoundPkRef.setFooName("foo");
     *     if (...) {
     *         whiteCompoundPkRef.setFooPrice(123);
     *     } else {
     *         whiteCompoundPkRef.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteCompoundPkRef.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteCompoundPkRefList.add(whiteCompoundPkRef);
     * }
     * whiteCompoundPkRefBhv.<span style="color: #FD4747">batchUpdate</span>(whiteCompoundPkRefList);
     * </pre>
     * @param whiteCompoundPkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteCompoundPkRef> whiteCompoundPkRefList) {
        UpdateOption<WhiteCompoundPkRefCB> option = createPlainUpdateOption();
        return doBatchUpdate(whiteCompoundPkRefList, option);
    }

    protected int[] doBatchUpdate(List<WhiteCompoundPkRef> whiteCompoundPkRefList, UpdateOption<WhiteCompoundPkRefCB> option) {
        assertObjectNotNull("whiteCompoundPkRefList", whiteCompoundPkRefList);
        prepareBatchUpdateOption(whiteCompoundPkRefList, option);
        return delegateBatchUpdate(whiteCompoundPkRefList, option);
    }

    protected void prepareBatchUpdateOption(List<WhiteCompoundPkRef> whiteCompoundPkRefList, UpdateOption<WhiteCompoundPkRefCB> option) {
        option.xacceptUpdateColumnModifiedPropertiesIfNeeds(whiteCompoundPkRefList);
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
     * whiteCompoundPkRefBhv.<span style="color: #FD4747">batchUpdate</span>(whiteCompoundPkRefList, new SpecifyQuery<WhiteCompoundPkRefCB>() {
     *     public void specify(WhiteCompoundPkRefCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span> 
     * whiteCompoundPkRefBhv.<span style="color: #FD4747">batchUpdate</span>(whiteCompoundPkRefList, new SpecifyQuery<WhiteCompoundPkRefCB>() {
     *     public void specify(WhiteCompoundPkRefCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteCompoundPkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteCompoundPkRef> whiteCompoundPkRefList, SpecifyQuery<WhiteCompoundPkRefCB> updateColumnSpec) {
        return doBatchUpdate(whiteCompoundPkRefList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        return doLumpModify(ls, option);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteCompoundPkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteCompoundPkRef> whiteCompoundPkRefList) {
        return doBatchDelete(whiteCompoundPkRefList, null);
    }

    protected int[] doBatchDelete(List<WhiteCompoundPkRef> whiteCompoundPkRefList, DeleteOption<WhiteCompoundPkRefCB> option) {
        assertObjectNotNull("whiteCompoundPkRefList", whiteCompoundPkRefList);
        prepareDeleteOption(option);
        return delegateBatchDelete(whiteCompoundPkRefList, option);
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
     * whiteCompoundPkRefBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteCompoundPkRef, WhiteCompoundPkRefCB&gt;() {
     *     public ConditionBean setup(whiteCompoundPkRef entity, WhiteCompoundPkRefCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteCompoundPkRef, WhiteCompoundPkRefCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteCompoundPkRef, WhiteCompoundPkRefCB> setupper, InsertOption<WhiteCompoundPkRefCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        WhiteCompoundPkRef entity = new WhiteCompoundPkRef();
        WhiteCompoundPkRefCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected WhiteCompoundPkRefCB createCBForQueryInsert() {
        WhiteCompoundPkRefCB cb = newMyConditionBean();
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
     * WhiteCompoundPkRef whiteCompoundPkRef = new WhiteCompoundPkRef();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteCompoundPkRef.setPK...(value);</span>
     * whiteCompoundPkRef.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteCompoundPkRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteCompoundPkRef.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteCompoundPkRef.setVersionNo(value);</span>
     * WhiteCompoundPkRefCB cb = new WhiteCompoundPkRefCB();
     * cb.query().setFoo...(value);
     * whiteCompoundPkRefBhv.<span style="color: #FD4747">queryUpdate</span>(whiteCompoundPkRef, cb);
     * </pre>
     * @param whiteCompoundPkRef The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteCompoundPkRef. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteCompoundPkRef whiteCompoundPkRef, WhiteCompoundPkRefCB cb) {
        return doQueryUpdate(whiteCompoundPkRef, cb, null);
    }

    protected int doQueryUpdate(WhiteCompoundPkRef whiteCompoundPkRef, WhiteCompoundPkRefCB cb, UpdateOption<WhiteCompoundPkRefCB> option) {
        assertObjectNotNull("whiteCompoundPkRef", whiteCompoundPkRef); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(whiteCompoundPkRef, cb, option) : 0;
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (WhiteCompoundPkRefCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (WhiteCompoundPkRefCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteCompoundPkRefCB cb = new WhiteCompoundPkRefCB();
     * cb.query().setFoo...(value);
     * whiteCompoundPkRefBhv.<span style="color: #FD4747">queryDelete</span>(whiteCompoundPkRef, cb);
     * </pre>
     * @param cb The condition-bean of WhiteCompoundPkRef. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteCompoundPkRefCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteCompoundPkRefCB cb, DeleteOption<WhiteCompoundPkRefCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, option) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((WhiteCompoundPkRefCB)cb); }
        else { return varyingQueryDelete((WhiteCompoundPkRefCB)cb, downcast(option)); }
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
     * WhiteCompoundPkRef whiteCompoundPkRef = new WhiteCompoundPkRef();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteCompoundPkRef.setFoo...(value);
     * whiteCompoundPkRef.setBar...(value);
     * InsertOption<WhiteCompoundPkRefCB> option = new InsertOption<WhiteCompoundPkRefCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteCompoundPkRefBhv.<span style="color: #FD4747">varyingInsert</span>(whiteCompoundPkRef, option);
     * ... = whiteCompoundPkRef.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteCompoundPkRef The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteCompoundPkRef whiteCompoundPkRef, InsertOption<WhiteCompoundPkRefCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteCompoundPkRef, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteCompoundPkRef whiteCompoundPkRef = new WhiteCompoundPkRef();
     * whiteCompoundPkRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteCompoundPkRef.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteCompoundPkRef.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteCompoundPkRefCB&gt; option = new UpdateOption&lt;WhiteCompoundPkRefCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteCompoundPkRefCB&gt;() {
     *         public void specify(WhiteCompoundPkRefCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteCompoundPkRefBhv.<span style="color: #FD4747">varyingUpdate</span>(whiteCompoundPkRef, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteCompoundPkRef The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteCompoundPkRef whiteCompoundPkRef, UpdateOption<WhiteCompoundPkRefCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteCompoundPkRef, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteCompoundPkRef The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteCompoundPkRef whiteCompoundPkRef, InsertOption<WhiteCompoundPkRefCB> insertOption, UpdateOption<WhiteCompoundPkRefCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(whiteCompoundPkRef, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteCompoundPkRef The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteCompoundPkRef whiteCompoundPkRef, DeleteOption<WhiteCompoundPkRefCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteCompoundPkRef, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteCompoundPkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteCompoundPkRef> whiteCompoundPkRefList, InsertOption<WhiteCompoundPkRefCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteCompoundPkRefList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteCompoundPkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteCompoundPkRef> whiteCompoundPkRefList, UpdateOption<WhiteCompoundPkRefCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteCompoundPkRefList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteCompoundPkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteCompoundPkRef> whiteCompoundPkRefList, DeleteOption<WhiteCompoundPkRefCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteCompoundPkRefList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteCompoundPkRef, WhiteCompoundPkRefCB> setupper, InsertOption<WhiteCompoundPkRefCB> option) {
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
     * WhiteCompoundPkRef whiteCompoundPkRef = new WhiteCompoundPkRef();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteCompoundPkRef.setPK...(value);</span>
     * whiteCompoundPkRef.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteCompoundPkRef.setVersionNo(value);</span>
     * WhiteCompoundPkRefCB cb = new WhiteCompoundPkRefCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteCompoundPkRefCB&gt; option = new UpdateOption&lt;WhiteCompoundPkRefCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteCompoundPkRefCB&gt;() {
     *     public void specify(WhiteCompoundPkRefCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteCompoundPkRefBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(whiteCompoundPkRef, cb, option);
     * </pre>
     * @param whiteCompoundPkRef The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteCompoundPkRef. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteCompoundPkRef whiteCompoundPkRef, WhiteCompoundPkRefCB cb, UpdateOption<WhiteCompoundPkRefCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteCompoundPkRef, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteCompoundPkRef. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteCompoundPkRefCB cb, DeleteOption<WhiteCompoundPkRefCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteCompoundPkRefBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhiteCompoundPkRefCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhiteCompoundPkRefCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhiteCompoundPkRef> void delegateSelectCursor(WhiteCompoundPkRefCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends WhiteCompoundPkRef> List<ENTITY> delegateSelectList(WhiteCompoundPkRefCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhiteCompoundPkRef e, InsertOption<WhiteCompoundPkRefCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(WhiteCompoundPkRef e, UpdateOption<WhiteCompoundPkRefCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return delegateUpdateNonstrict(e, op); }
    protected int delegateUpdateNonstrict(WhiteCompoundPkRef e, UpdateOption<WhiteCompoundPkRefCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(WhiteCompoundPkRef e, DeleteOption<WhiteCompoundPkRefCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return delegateDeleteNonstrict(e, op); }
    protected int delegateDeleteNonstrict(WhiteCompoundPkRef e, DeleteOption<WhiteCompoundPkRefCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<WhiteCompoundPkRef> ls, InsertOption<WhiteCompoundPkRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhiteCompoundPkRef> ls, UpdateOption<WhiteCompoundPkRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhiteCompoundPkRef> ls, UpdateOption<WhiteCompoundPkRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhiteCompoundPkRef> ls, DeleteOption<WhiteCompoundPkRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhiteCompoundPkRef> ls, DeleteOption<WhiteCompoundPkRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhiteCompoundPkRef e, WhiteCompoundPkRefCB inCB, ConditionBean resCB, InsertOption<WhiteCompoundPkRefCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhiteCompoundPkRef e, WhiteCompoundPkRefCB cb, UpdateOption<WhiteCompoundPkRefCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(WhiteCompoundPkRefCB cb, DeleteOption<WhiteCompoundPkRefCB> op)
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
    protected WhiteCompoundPkRef downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, WhiteCompoundPkRef.class);
    }

    protected WhiteCompoundPkRefCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, WhiteCompoundPkRefCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<WhiteCompoundPkRef> downcast(List<? extends Entity> entityList) {
        return (List<WhiteCompoundPkRef>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteCompoundPkRefCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<WhiteCompoundPkRefCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteCompoundPkRefCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<WhiteCompoundPkRefCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteCompoundPkRefCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<WhiteCompoundPkRefCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteCompoundPkRef, WhiteCompoundPkRefCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<WhiteCompoundPkRef, WhiteCompoundPkRefCB>)option;
    }
}
