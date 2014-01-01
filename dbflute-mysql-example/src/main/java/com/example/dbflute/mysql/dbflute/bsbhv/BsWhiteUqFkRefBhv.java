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
 * The behavior of WHITE_UQ_FK_REF as TABLE. <br />
 * <pre>
 * [primary key]
 *     UQ_FK_REF_ID
 * 
 * [column]
 *     UQ_FK_REF_ID, FK_TO_PK_ID, FK_TO_UQ_CODE, COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE
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
 *     white_uq_fk
 * 
 * [referrer table]
 *     white_uq_fk_ref_nest
 * 
 * [foreign property]
 *     whiteUqFkByFkToPkId, whiteUqFkByFkToUqCode
 * 
 * [referrer property]
 *     whiteUqFkRefNestList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteUqFkRefBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_uq_fk_ref"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return WhiteUqFkRefDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteUqFkRefDbm getMyDBMeta() { return WhiteUqFkRefDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteUqFkRef newMyEntity() { return new WhiteUqFkRef(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteUqFkRefCB newMyConditionBean() { return new WhiteUqFkRefCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteUqFkRefCB cb = new WhiteUqFkRefCB();
     * cb.query().setFoo...(value);
     * int count = whiteUqFkRefBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteUqFkRef. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteUqFkRefCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteUqFkRefCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteUqFkRefCB cb) { // called by selectPage(cb)
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
     * WhiteUqFkRefCB cb = new WhiteUqFkRefCB();
     * cb.query().setFoo...(value);
     * WhiteUqFkRef whiteUqFkRef = whiteUqFkRefBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (whiteUqFkRef != null) {
     *     ... = whiteUqFkRef.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteUqFkRef. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteUqFkRef selectEntity(WhiteUqFkRefCB cb) {
        return doSelectEntity(cb, WhiteUqFkRef.class);
    }

    protected <ENTITY extends WhiteUqFkRef> ENTITY doSelectEntity(final WhiteUqFkRefCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, entityType, new InternalSelectEntityCallback<ENTITY, WhiteUqFkRefCB>() {
            public List<ENTITY> callbackSelectList(WhiteUqFkRefCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * WhiteUqFkRefCB cb = new WhiteUqFkRefCB();
     * cb.query().setFoo...(value);
     * WhiteUqFkRef whiteUqFkRef = whiteUqFkRefBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteUqFkRef.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteUqFkRef. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteUqFkRef selectEntityWithDeletedCheck(WhiteUqFkRefCB cb) {
        return doSelectEntityWithDeletedCheck(cb, WhiteUqFkRef.class);
    }

    protected <ENTITY extends WhiteUqFkRef> ENTITY doSelectEntityWithDeletedCheck(final WhiteUqFkRefCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, entityType, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteUqFkRefCB>() {
            public List<ENTITY> callbackSelectList(WhiteUqFkRefCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param uqFkRefId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteUqFkRef selectByPKValue(Long uqFkRefId) {
        return doSelectByPKValue(uqFkRefId, WhiteUqFkRef.class);
    }

    protected <ENTITY extends WhiteUqFkRef> ENTITY doSelectByPKValue(Long uqFkRefId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(uqFkRefId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param uqFkRefId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteUqFkRef selectByPKValueWithDeletedCheck(Long uqFkRefId) {
        return doSelectByPKValueWithDeletedCheck(uqFkRefId, WhiteUqFkRef.class);
    }

    protected <ENTITY extends WhiteUqFkRef> ENTITY doSelectByPKValueWithDeletedCheck(Long uqFkRefId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(uqFkRefId), entityType);
    }

    private WhiteUqFkRefCB buildPKCB(Long uqFkRefId) {
        assertObjectNotNull("uqFkRefId", uqFkRefId);
        WhiteUqFkRefCB cb = newMyConditionBean();
        cb.query().setUqFkRefId_Equal(uqFkRefId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteUqFkRefCB cb = new WhiteUqFkRefCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteUqFkRef&gt; whiteUqFkRefList = whiteUqFkRefBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (WhiteUqFkRef whiteUqFkRef : whiteUqFkRefList) {
     *     ... = whiteUqFkRef.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteUqFkRef. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteUqFkRef> selectList(WhiteUqFkRefCB cb) {
        return doSelectList(cb, WhiteUqFkRef.class);
    }

    protected <ENTITY extends WhiteUqFkRef> ListResultBean<ENTITY> doSelectList(WhiteUqFkRefCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, WhiteUqFkRefCB>() {
            public List<ENTITY> callbackSelectList(WhiteUqFkRefCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * WhiteUqFkRefCB cb = new WhiteUqFkRefCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteUqFkRef&gt; page = whiteUqFkRefBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteUqFkRef whiteUqFkRef : page) {
     *     ... = whiteUqFkRef.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteUqFkRef. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteUqFkRef> selectPage(WhiteUqFkRefCB cb) {
        return doSelectPage(cb, WhiteUqFkRef.class);
    }

    protected <ENTITY extends WhiteUqFkRef> PagingResultBean<ENTITY> doSelectPage(WhiteUqFkRefCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, WhiteUqFkRefCB>() {
            public int callbackSelectCount(WhiteUqFkRefCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteUqFkRefCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * WhiteUqFkRefCB cb = new WhiteUqFkRefCB();
     * cb.query().setFoo...(value);
     * whiteUqFkRefBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteUqFkRef&gt;() {
     *     public void handle(WhiteUqFkRef entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteUqFkRef. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteUqFkRef. (NotNull)
     */
    public void selectCursor(WhiteUqFkRefCB cb, EntityRowHandler<WhiteUqFkRef> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, WhiteUqFkRef.class);
    }

    protected <ENTITY extends WhiteUqFkRef> void doSelectCursor(WhiteUqFkRefCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<WhiteUqFkRef>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        helpSelectCursorInternally(cb, entityRowHandler, entityType, new InternalSelectCursorCallback<ENTITY, WhiteUqFkRefCB>() {
            public void callbackSelectCursor(WhiteUqFkRefCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) { delegateSelectCursor(cb, entityRowHandler, entityType); }
            public List<ENTITY> callbackSelectList(WhiteUqFkRefCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteUqFkRefBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteUqFkRefCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<WhiteUqFkRefCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends WhiteUqFkRefCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
        assertObjectNotNull("resultType", resultType); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, resultType);
    }

    protected <RESULT, CB extends WhiteUqFkRefCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> resultType) {
        return new SLFunction<CB, RESULT>(cb, resultType);
    }

    protected <RESULT> SLFunction<? extends ConditionBean, RESULT> doReadScalar(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
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
     * @param whiteUqFkRef The entity of whiteUqFkRef. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadWhiteUqFkRefNestList(WhiteUqFkRef whiteUqFkRef, ConditionBeanSetupper<WhiteUqFkRefNestCB> conditionBeanSetupper) {
        xassLRArg(whiteUqFkRef, conditionBeanSetupper);
        loadWhiteUqFkRefNestList(xnewLRLs(whiteUqFkRef), conditionBeanSetupper);
    }
    /**
     * Load referrer of whiteUqFkRefNestList with the set-upper for condition-bean of referrer. <br />
     * white_uq_fk_ref_nest by COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE, named 'whiteUqFkRefNestList'.
     * <pre>
     * whiteUqFkRefBhv.<span style="color: #FD4747">loadWhiteUqFkRefNestList</span>(whiteUqFkRefList, new ConditionBeanSetupper&lt;WhiteUqFkRefNestCB&gt;() {
     *     public void setup(WhiteUqFkRefNestCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (WhiteUqFkRef whiteUqFkRef : whiteUqFkRefList) {
     *     ... = whiteUqFkRef.<span style="color: #FD4747">getWhiteUqFkRefNestList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().set[ForeignKey]_InScope(pkList);
     * cb.query().addOrderBy_[ForeignKey]_Asc();
     * </pre>
     * @param whiteUqFkRefList The entity list of whiteUqFkRef. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadWhiteUqFkRefNestList(List<WhiteUqFkRef> whiteUqFkRefList, ConditionBeanSetupper<WhiteUqFkRefNestCB> conditionBeanSetupper) {
        xassLRArg(whiteUqFkRefList, conditionBeanSetupper);
        loadWhiteUqFkRefNestList(whiteUqFkRefList, new LoadReferrerOption<WhiteUqFkRefNestCB, WhiteUqFkRefNest>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param whiteUqFkRef The entity of whiteUqFkRef. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadWhiteUqFkRefNestList(WhiteUqFkRef whiteUqFkRef, LoadReferrerOption<WhiteUqFkRefNestCB, WhiteUqFkRefNest> loadReferrerOption) {
        xassLRArg(whiteUqFkRef, loadReferrerOption);
        loadWhiteUqFkRefNestList(xnewLRLs(whiteUqFkRef), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param whiteUqFkRefList The entity list of whiteUqFkRef. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadWhiteUqFkRefNestList(List<WhiteUqFkRef> whiteUqFkRefList, LoadReferrerOption<WhiteUqFkRefNestCB, WhiteUqFkRefNest> loadReferrerOption) {
        xassLRArg(whiteUqFkRefList, loadReferrerOption);
        if (whiteUqFkRefList.isEmpty()) { return; }
        final WhiteUqFkRefNestBhv referrerBhv = xgetBSFLR().select(WhiteUqFkRefNestBhv.class);
        helpLoadReferrerInternally(whiteUqFkRefList, loadReferrerOption, new InternalLoadReferrerCallback<WhiteUqFkRef, java.util.Map<String, Object>, WhiteUqFkRefNestCB, WhiteUqFkRefNest>() {
            public java.util.Map<String, Object> getPKVal(WhiteUqFkRef e) {
                java.util.Map<String, Object> primaryKeyMap = new java.util.LinkedHashMap<String, Object>();
                primaryKeyMap.put("CompoundUqFirstCode", e.getCompoundUqFirstCode());
                primaryKeyMap.put("CompoundUqSecondCode", e.getCompoundUqSecondCode());
                return primaryKeyMap;
            }
            public void setRfLs(WhiteUqFkRef e, List<WhiteUqFkRefNest> ls) { e.setWhiteUqFkRefNestList(ls); }
            public WhiteUqFkRefNestCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(WhiteUqFkRefNestCB cb, List<java.util.Map<String, Object>> ls) {
                final String aliasName = cb.getSqlClause().getBasePointAliasName();
                String identity = null;
                StringBuilder sb = new StringBuilder();
                for (java.util.Map<String, Object> primaryKeyMap : ls) {
                    if (sb.length() > 0) { sb.append(")").append(ln()).append("     or ("); }
                    sb.append(aliasName).append(".COMPOUND_UQ_FIRST_CODE = ");
                    identity = "whiteUqFkRefNestListCompoundUqFirstCode";
                    sb.append(cb.query().xregisterFreeParameterToThemeList(identity, primaryKeyMap.get("CompoundUqFirstCode")));
                    sb.append(" and ");
                    sb.append(aliasName).append(".COMPOUND_UQ_SECOND_CODE = ");
                    identity = "whiteUqFkRefNestListCompoundUqSecondCode";
                    sb.append(cb.query().xregisterFreeParameterToThemeList(identity, primaryKeyMap.get("CompoundUqSecondCode")));
                }
                sb.insert(0, "((").append("))");
                cb.getSqlClause().registerWhereClause(sb.toString(), aliasName);
            }
            public void qyOdFKAsc(WhiteUqFkRefNestCB cb) {
                cb.query().addOrderBy_CompoundUqFirstCode_Asc();
                cb.query().addOrderBy_CompoundUqSecondCode_Asc();
            }
            public void spFKCol(WhiteUqFkRefNestCB cb) {
                cb.specify().columnCompoundUqFirstCode();
                cb.specify().columnCompoundUqSecondCode();
            }
            public List<WhiteUqFkRefNest> selRfLs(WhiteUqFkRefNestCB cb) { return referrerBhv.selectList(cb); }
            public java.util.Map<String, Object> getFKVal(WhiteUqFkRefNest e) {
                java.util.Map<String, Object> foreignKeyMap = new java.util.LinkedHashMap<String, Object>();
                foreignKeyMap.put("CompoundUqFirstCode", e.getCompoundUqFirstCode());
                foreignKeyMap.put("CompoundUqSecondCode", e.getCompoundUqSecondCode());
                return foreignKeyMap;
            }
            public void setlcEt(WhiteUqFkRefNest re, WhiteUqFkRef le) { re.setWhiteUqFkRef(le); }
            public String getRfPrNm() { return "whiteUqFkRefNestList"; }
        });
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'WhiteUqFk'.
     * @param whiteUqFkRefList The list of whiteUqFkRef. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteUqFk> pulloutWhiteUqFkByFkToPkId(List<WhiteUqFkRef> whiteUqFkRefList) {
        return helpPulloutInternally(whiteUqFkRefList, new InternalPulloutCallback<WhiteUqFkRef, WhiteUqFk>() {
            public WhiteUqFk getFr(WhiteUqFkRef e) { return e.getWhiteUqFkByFkToPkId(); }
            public boolean hasRf() { return true; }
            public void setRfLs(WhiteUqFk e, List<WhiteUqFkRef> ls)
            { e.setWhiteUqFkRefByFkToPkIdList(ls); }
        });
    }
    /**
     * Pull out the list of foreign table 'WhiteUqFk'.
     * @param whiteUqFkRefList The list of whiteUqFkRef. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteUqFk> pulloutWhiteUqFkByFkToUqCode(List<WhiteUqFkRef> whiteUqFkRefList) {
        return helpPulloutInternally(whiteUqFkRefList, new InternalPulloutCallback<WhiteUqFkRef, WhiteUqFk>() {
            public WhiteUqFk getFr(WhiteUqFkRef e) { return e.getWhiteUqFkByFkToUqCode(); }
            public boolean hasRf() { return true; }
            public void setRfLs(WhiteUqFk e, List<WhiteUqFkRef> ls)
            { e.setWhiteUqFkRefByFkToUqCodeList(ls); }
        });
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key uqFkRefId.
     * @param whiteUqFkRefList The list of whiteUqFkRef. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractUqFkRefIdList(List<WhiteUqFkRef> whiteUqFkRefList) {
        return helpExtractListInternally(whiteUqFkRefList, new InternalExtractCallback<WhiteUqFkRef, Long>() {
            public Long getCV(WhiteUqFkRef e) { return e.getUqFkRefId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteUqFkRef whiteUqFkRef = new WhiteUqFkRef();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteUqFkRef.setFoo...(value);
     * whiteUqFkRef.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteUqFkRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteUqFkRef.set...;</span>
     * whiteUqFkRefBhv.<span style="color: #FD4747">insert</span>(whiteUqFkRef);
     * ... = whiteUqFkRef.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteUqFkRef The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteUqFkRef whiteUqFkRef) {
        doInsert(whiteUqFkRef, null);
    }

    protected void doInsert(WhiteUqFkRef whiteUqFkRef, InsertOption<WhiteUqFkRefCB> option) {
        assertObjectNotNull("whiteUqFkRef", whiteUqFkRef);
        prepareInsertOption(option);
        delegateInsert(whiteUqFkRef, option);
    }

    protected void prepareInsertOption(InsertOption<WhiteUqFkRefCB> option) {
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
     * WhiteUqFkRef whiteUqFkRef = new WhiteUqFkRef();
     * whiteUqFkRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteUqFkRef.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteUqFkRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteUqFkRef.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteUqFkRef.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteUqFkRefBhv.<span style="color: #FD4747">update</span>(whiteUqFkRef);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param whiteUqFkRef The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final WhiteUqFkRef whiteUqFkRef) {
        doUpdate(whiteUqFkRef, null);
    }

    protected void doUpdate(WhiteUqFkRef whiteUqFkRef, final UpdateOption<WhiteUqFkRefCB> option) {
        assertObjectNotNull("whiteUqFkRef", whiteUqFkRef);
        prepareUpdateOption(option);
        helpUpdateInternally(whiteUqFkRef, new InternalUpdateCallback<WhiteUqFkRef>() {
            public int callbackDelegateUpdate(WhiteUqFkRef entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhiteUqFkRefCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected WhiteUqFkRefCB createCBForVaryingUpdate() {
        WhiteUqFkRefCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected WhiteUqFkRefCB createCBForSpecifiedUpdate() {
        WhiteUqFkRefCB cb = newMyConditionBean();
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
     * @param whiteUqFkRef The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteUqFkRef whiteUqFkRef) {
        doInesrtOrUpdate(whiteUqFkRef, null, null);
    }

    protected void doInesrtOrUpdate(WhiteUqFkRef whiteUqFkRef, final InsertOption<WhiteUqFkRefCB> insertOption, final UpdateOption<WhiteUqFkRefCB> updateOption) {
        helpInsertOrUpdateInternally(whiteUqFkRef, new InternalInsertOrUpdateCallback<WhiteUqFkRef, WhiteUqFkRefCB>() {
            public void callbackInsert(WhiteUqFkRef entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(WhiteUqFkRef entity) { doUpdate(entity, updateOption); }
            public WhiteUqFkRefCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(WhiteUqFkRefCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<WhiteUqFkRefCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<WhiteUqFkRefCB>() : updateOption;
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
     * WhiteUqFkRef whiteUqFkRef = new WhiteUqFkRef();
     * whiteUqFkRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteUqFkRef.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteUqFkRefBhv.<span style="color: #FD4747">delete</span>(whiteUqFkRef);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param whiteUqFkRef The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteUqFkRef whiteUqFkRef) {
        doDelete(whiteUqFkRef, null);
    }

    protected void doDelete(WhiteUqFkRef whiteUqFkRef, final DeleteOption<WhiteUqFkRefCB> option) {
        assertObjectNotNull("whiteUqFkRef", whiteUqFkRef);
        prepareDeleteOption(option);
        helpDeleteInternally(whiteUqFkRef, new InternalDeleteCallback<WhiteUqFkRef>() {
            public int callbackDelegateDelete(WhiteUqFkRef entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhiteUqFkRefCB> option) {
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
     *     WhiteUqFkRef whiteUqFkRef = new WhiteUqFkRef();
     *     whiteUqFkRef.setFooName("foo");
     *     if (...) {
     *         whiteUqFkRef.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteUqFkRefList.add(whiteUqFkRef);
     * }
     * whiteUqFkRefBhv.<span style="color: #FD4747">batchInsert</span>(whiteUqFkRefList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteUqFkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteUqFkRef> whiteUqFkRefList) {
        InsertOption<WhiteUqFkRefCB> option = createInsertUpdateOption();
        return doBatchInsert(whiteUqFkRefList, option);
    }

    protected int[] doBatchInsert(List<WhiteUqFkRef> whiteUqFkRefList, InsertOption<WhiteUqFkRefCB> option) {
        assertObjectNotNull("whiteUqFkRefList", whiteUqFkRefList);
        prepareBatchInsertOption(whiteUqFkRefList, option);
        return delegateBatchInsert(whiteUqFkRefList, option);
    }

    protected void prepareBatchInsertOption(List<WhiteUqFkRef> whiteUqFkRefList, InsertOption<WhiteUqFkRefCB> option) {
        option.xallowInsertColumnModifiedPropertiesFragmented();
        option.xacceptInsertColumnModifiedPropertiesIfNeeds(whiteUqFkRefList);
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
     *     WhiteUqFkRef whiteUqFkRef = new WhiteUqFkRef();
     *     whiteUqFkRef.setFooName("foo");
     *     if (...) {
     *         whiteUqFkRef.setFooPrice(123);
     *     } else {
     *         whiteUqFkRef.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteUqFkRef.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteUqFkRefList.add(whiteUqFkRef);
     * }
     * whiteUqFkRefBhv.<span style="color: #FD4747">batchUpdate</span>(whiteUqFkRefList);
     * </pre>
     * @param whiteUqFkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteUqFkRef> whiteUqFkRefList) {
        UpdateOption<WhiteUqFkRefCB> option = createPlainUpdateOption();
        return doBatchUpdate(whiteUqFkRefList, option);
    }

    protected int[] doBatchUpdate(List<WhiteUqFkRef> whiteUqFkRefList, UpdateOption<WhiteUqFkRefCB> option) {
        assertObjectNotNull("whiteUqFkRefList", whiteUqFkRefList);
        prepareBatchUpdateOption(whiteUqFkRefList, option);
        return delegateBatchUpdate(whiteUqFkRefList, option);
    }

    protected void prepareBatchUpdateOption(List<WhiteUqFkRef> whiteUqFkRefList, UpdateOption<WhiteUqFkRefCB> option) {
        option.xacceptUpdateColumnModifiedPropertiesIfNeeds(whiteUqFkRefList);
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
     * whiteUqFkRefBhv.<span style="color: #FD4747">batchUpdate</span>(whiteUqFkRefList, new SpecifyQuery<WhiteUqFkRefCB>() {
     *     public void specify(WhiteUqFkRefCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span> 
     * whiteUqFkRefBhv.<span style="color: #FD4747">batchUpdate</span>(whiteUqFkRefList, new SpecifyQuery<WhiteUqFkRefCB>() {
     *     public void specify(WhiteUqFkRefCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteUqFkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteUqFkRef> whiteUqFkRefList, SpecifyQuery<WhiteUqFkRefCB> updateColumnSpec) {
        return doBatchUpdate(whiteUqFkRefList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        return doLumpModify(ls, option);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteUqFkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteUqFkRef> whiteUqFkRefList) {
        return doBatchDelete(whiteUqFkRefList, null);
    }

    protected int[] doBatchDelete(List<WhiteUqFkRef> whiteUqFkRefList, DeleteOption<WhiteUqFkRefCB> option) {
        assertObjectNotNull("whiteUqFkRefList", whiteUqFkRefList);
        prepareDeleteOption(option);
        return delegateBatchDelete(whiteUqFkRefList, option);
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
     * whiteUqFkRefBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteUqFkRef, WhiteUqFkRefCB&gt;() {
     *     public ConditionBean setup(whiteUqFkRef entity, WhiteUqFkRefCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteUqFkRef, WhiteUqFkRefCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteUqFkRef, WhiteUqFkRefCB> setupper, InsertOption<WhiteUqFkRefCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        WhiteUqFkRef entity = new WhiteUqFkRef();
        WhiteUqFkRefCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected WhiteUqFkRefCB createCBForQueryInsert() {
        WhiteUqFkRefCB cb = newMyConditionBean();
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
     * WhiteUqFkRef whiteUqFkRef = new WhiteUqFkRef();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteUqFkRef.setPK...(value);</span>
     * whiteUqFkRef.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteUqFkRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteUqFkRef.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteUqFkRef.setVersionNo(value);</span>
     * WhiteUqFkRefCB cb = new WhiteUqFkRefCB();
     * cb.query().setFoo...(value);
     * whiteUqFkRefBhv.<span style="color: #FD4747">queryUpdate</span>(whiteUqFkRef, cb);
     * </pre>
     * @param whiteUqFkRef The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteUqFkRef. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteUqFkRef whiteUqFkRef, WhiteUqFkRefCB cb) {
        return doQueryUpdate(whiteUqFkRef, cb, null);
    }

    protected int doQueryUpdate(WhiteUqFkRef whiteUqFkRef, WhiteUqFkRefCB cb, UpdateOption<WhiteUqFkRefCB> option) {
        assertObjectNotNull("whiteUqFkRef", whiteUqFkRef); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(whiteUqFkRef, cb, option) : 0;
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (WhiteUqFkRefCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (WhiteUqFkRefCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteUqFkRefCB cb = new WhiteUqFkRefCB();
     * cb.query().setFoo...(value);
     * whiteUqFkRefBhv.<span style="color: #FD4747">queryDelete</span>(whiteUqFkRef, cb);
     * </pre>
     * @param cb The condition-bean of WhiteUqFkRef. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteUqFkRefCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteUqFkRefCB cb, DeleteOption<WhiteUqFkRefCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, option) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((WhiteUqFkRefCB)cb); }
        else { return varyingQueryDelete((WhiteUqFkRefCB)cb, downcast(option)); }
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
     * WhiteUqFkRef whiteUqFkRef = new WhiteUqFkRef();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteUqFkRef.setFoo...(value);
     * whiteUqFkRef.setBar...(value);
     * InsertOption<WhiteUqFkRefCB> option = new InsertOption<WhiteUqFkRefCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteUqFkRefBhv.<span style="color: #FD4747">varyingInsert</span>(whiteUqFkRef, option);
     * ... = whiteUqFkRef.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteUqFkRef The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteUqFkRef whiteUqFkRef, InsertOption<WhiteUqFkRefCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteUqFkRef, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteUqFkRef whiteUqFkRef = new WhiteUqFkRef();
     * whiteUqFkRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteUqFkRef.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteUqFkRef.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteUqFkRefCB&gt; option = new UpdateOption&lt;WhiteUqFkRefCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteUqFkRefCB&gt;() {
     *         public void specify(WhiteUqFkRefCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteUqFkRefBhv.<span style="color: #FD4747">varyingUpdate</span>(whiteUqFkRef, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteUqFkRef The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteUqFkRef whiteUqFkRef, UpdateOption<WhiteUqFkRefCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteUqFkRef, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteUqFkRef The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteUqFkRef whiteUqFkRef, InsertOption<WhiteUqFkRefCB> insertOption, UpdateOption<WhiteUqFkRefCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(whiteUqFkRef, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteUqFkRef The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteUqFkRef whiteUqFkRef, DeleteOption<WhiteUqFkRefCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteUqFkRef, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteUqFkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteUqFkRef> whiteUqFkRefList, InsertOption<WhiteUqFkRefCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteUqFkRefList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteUqFkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteUqFkRef> whiteUqFkRefList, UpdateOption<WhiteUqFkRefCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteUqFkRefList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteUqFkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteUqFkRef> whiteUqFkRefList, DeleteOption<WhiteUqFkRefCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteUqFkRefList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteUqFkRef, WhiteUqFkRefCB> setupper, InsertOption<WhiteUqFkRefCB> option) {
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
     * WhiteUqFkRef whiteUqFkRef = new WhiteUqFkRef();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteUqFkRef.setPK...(value);</span>
     * whiteUqFkRef.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteUqFkRef.setVersionNo(value);</span>
     * WhiteUqFkRefCB cb = new WhiteUqFkRefCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteUqFkRefCB&gt; option = new UpdateOption&lt;WhiteUqFkRefCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteUqFkRefCB&gt;() {
     *     public void specify(WhiteUqFkRefCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteUqFkRefBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(whiteUqFkRef, cb, option);
     * </pre>
     * @param whiteUqFkRef The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteUqFkRef. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteUqFkRef whiteUqFkRef, WhiteUqFkRefCB cb, UpdateOption<WhiteUqFkRefCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteUqFkRef, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteUqFkRef. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteUqFkRefCB cb, DeleteOption<WhiteUqFkRefCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteUqFkRefBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhiteUqFkRefCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhiteUqFkRefCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhiteUqFkRef> void delegateSelectCursor(WhiteUqFkRefCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends WhiteUqFkRef> List<ENTITY> delegateSelectList(WhiteUqFkRefCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhiteUqFkRef e, InsertOption<WhiteUqFkRefCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(WhiteUqFkRef e, UpdateOption<WhiteUqFkRefCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return delegateUpdateNonstrict(e, op); }
    protected int delegateUpdateNonstrict(WhiteUqFkRef e, UpdateOption<WhiteUqFkRefCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(WhiteUqFkRef e, DeleteOption<WhiteUqFkRefCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return delegateDeleteNonstrict(e, op); }
    protected int delegateDeleteNonstrict(WhiteUqFkRef e, DeleteOption<WhiteUqFkRefCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<WhiteUqFkRef> ls, InsertOption<WhiteUqFkRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhiteUqFkRef> ls, UpdateOption<WhiteUqFkRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhiteUqFkRef> ls, UpdateOption<WhiteUqFkRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhiteUqFkRef> ls, DeleteOption<WhiteUqFkRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhiteUqFkRef> ls, DeleteOption<WhiteUqFkRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhiteUqFkRef e, WhiteUqFkRefCB inCB, ConditionBean resCB, InsertOption<WhiteUqFkRefCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhiteUqFkRef e, WhiteUqFkRefCB cb, UpdateOption<WhiteUqFkRefCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(WhiteUqFkRefCB cb, DeleteOption<WhiteUqFkRefCB> op)
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
    protected WhiteUqFkRef downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, WhiteUqFkRef.class);
    }

    protected WhiteUqFkRefCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, WhiteUqFkRefCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<WhiteUqFkRef> downcast(List<? extends Entity> entityList) {
        return (List<WhiteUqFkRef>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteUqFkRefCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<WhiteUqFkRefCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteUqFkRefCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<WhiteUqFkRefCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteUqFkRefCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<WhiteUqFkRefCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteUqFkRef, WhiteUqFkRefCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<WhiteUqFkRef, WhiteUqFkRefCB>)option;
    }
}
