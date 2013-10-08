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
 * The behavior of WHITE_UQ_REFERENCE_REF as TABLE. <br />
 * <pre>
 * [primary key]
 *     UQ_REFERENCE_REF_ID
 * 
 * [column]
 *     UQ_REFERENCE_REF_ID, FK_TO_PK_ID, FK_TO_UQ_CODE, COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE
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
 *     white_uq_reference
 * 
 * [referrer table]
 *     white_uq_reference_ref_nest
 * 
 * [foreign property]
 *     whiteUqReferenceByFkToPkId, whiteUqReferenceByFkToUqCode
 * 
 * [referrer property]
 *     whiteUqReferenceRefNestList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteUqReferenceRefBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_uq_reference_ref"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return WhiteUqReferenceRefDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteUqReferenceRefDbm getMyDBMeta() { return WhiteUqReferenceRefDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteUqReferenceRef newMyEntity() { return new WhiteUqReferenceRef(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteUqReferenceRefCB newMyConditionBean() { return new WhiteUqReferenceRefCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteUqReferenceRefCB cb = new WhiteUqReferenceRefCB();
     * cb.query().setFoo...(value);
     * int count = whiteUqReferenceRefBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteUqReferenceRef. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteUqReferenceRefCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteUqReferenceRefCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteUqReferenceRefCB cb) { // called by selectPage(cb)
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
     * WhiteUqReferenceRefCB cb = new WhiteUqReferenceRefCB();
     * cb.query().setFoo...(value);
     * WhiteUqReferenceRef whiteUqReferenceRef = whiteUqReferenceRefBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (whiteUqReferenceRef != null) {
     *     ... = whiteUqReferenceRef.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteUqReferenceRef. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteUqReferenceRef selectEntity(WhiteUqReferenceRefCB cb) {
        return doSelectEntity(cb, WhiteUqReferenceRef.class);
    }

    protected <ENTITY extends WhiteUqReferenceRef> ENTITY doSelectEntity(final WhiteUqReferenceRefCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, entityType, new InternalSelectEntityCallback<ENTITY, WhiteUqReferenceRefCB>() {
            public List<ENTITY> callbackSelectList(WhiteUqReferenceRefCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * WhiteUqReferenceRefCB cb = new WhiteUqReferenceRefCB();
     * cb.query().setFoo...(value);
     * WhiteUqReferenceRef whiteUqReferenceRef = whiteUqReferenceRefBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteUqReferenceRef.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteUqReferenceRef. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteUqReferenceRef selectEntityWithDeletedCheck(WhiteUqReferenceRefCB cb) {
        return doSelectEntityWithDeletedCheck(cb, WhiteUqReferenceRef.class);
    }

    protected <ENTITY extends WhiteUqReferenceRef> ENTITY doSelectEntityWithDeletedCheck(final WhiteUqReferenceRefCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, entityType, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteUqReferenceRefCB>() {
            public List<ENTITY> callbackSelectList(WhiteUqReferenceRefCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param uqReferenceRefId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteUqReferenceRef selectByPKValue(Long uqReferenceRefId) {
        return doSelectByPKValue(uqReferenceRefId, WhiteUqReferenceRef.class);
    }

    protected <ENTITY extends WhiteUqReferenceRef> ENTITY doSelectByPKValue(Long uqReferenceRefId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(uqReferenceRefId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param uqReferenceRefId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteUqReferenceRef selectByPKValueWithDeletedCheck(Long uqReferenceRefId) {
        return doSelectByPKValueWithDeletedCheck(uqReferenceRefId, WhiteUqReferenceRef.class);
    }

    protected <ENTITY extends WhiteUqReferenceRef> ENTITY doSelectByPKValueWithDeletedCheck(Long uqReferenceRefId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(uqReferenceRefId), entityType);
    }

    private WhiteUqReferenceRefCB buildPKCB(Long uqReferenceRefId) {
        assertObjectNotNull("uqReferenceRefId", uqReferenceRefId);
        WhiteUqReferenceRefCB cb = newMyConditionBean();
        cb.query().setUqReferenceRefId_Equal(uqReferenceRefId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteUqReferenceRefCB cb = new WhiteUqReferenceRefCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteUqReferenceRef&gt; whiteUqReferenceRefList = whiteUqReferenceRefBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (WhiteUqReferenceRef whiteUqReferenceRef : whiteUqReferenceRefList) {
     *     ... = whiteUqReferenceRef.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteUqReferenceRef. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteUqReferenceRef> selectList(WhiteUqReferenceRefCB cb) {
        return doSelectList(cb, WhiteUqReferenceRef.class);
    }

    protected <ENTITY extends WhiteUqReferenceRef> ListResultBean<ENTITY> doSelectList(WhiteUqReferenceRefCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, WhiteUqReferenceRefCB>() {
            public List<ENTITY> callbackSelectList(WhiteUqReferenceRefCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * WhiteUqReferenceRefCB cb = new WhiteUqReferenceRefCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteUqReferenceRef&gt; page = whiteUqReferenceRefBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteUqReferenceRef whiteUqReferenceRef : page) {
     *     ... = whiteUqReferenceRef.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteUqReferenceRef. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteUqReferenceRef> selectPage(WhiteUqReferenceRefCB cb) {
        return doSelectPage(cb, WhiteUqReferenceRef.class);
    }

    protected <ENTITY extends WhiteUqReferenceRef> PagingResultBean<ENTITY> doSelectPage(WhiteUqReferenceRefCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, WhiteUqReferenceRefCB>() {
            public int callbackSelectCount(WhiteUqReferenceRefCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteUqReferenceRefCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * WhiteUqReferenceRefCB cb = new WhiteUqReferenceRefCB();
     * cb.query().setFoo...(value);
     * whiteUqReferenceRefBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteUqReferenceRef&gt;() {
     *     public void handle(WhiteUqReferenceRef entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteUqReferenceRef. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteUqReferenceRef. (NotNull)
     */
    public void selectCursor(WhiteUqReferenceRefCB cb, EntityRowHandler<WhiteUqReferenceRef> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, WhiteUqReferenceRef.class);
    }

    protected <ENTITY extends WhiteUqReferenceRef> void doSelectCursor(WhiteUqReferenceRefCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<WhiteUqReferenceRef>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        helpSelectCursorInternally(cb, entityRowHandler, entityType, new InternalSelectCursorCallback<ENTITY, WhiteUqReferenceRefCB>() {
            public void callbackSelectCursor(WhiteUqReferenceRefCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) { delegateSelectCursor(cb, entityRowHandler, entityType); }
            public List<ENTITY> callbackSelectList(WhiteUqReferenceRefCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteUqReferenceRefBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteUqReferenceRefCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (NullAllowed)
     */
    public <RESULT> SLFunction<WhiteUqReferenceRefCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends WhiteUqReferenceRefCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
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
     * @param whiteUqReferenceRef The entity of whiteUqReferenceRef. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadWhiteUqReferenceRefNestList(WhiteUqReferenceRef whiteUqReferenceRef, ConditionBeanSetupper<WhiteUqReferenceRefNestCB> conditionBeanSetupper) {
        xassLRArg(whiteUqReferenceRef, conditionBeanSetupper);
        loadWhiteUqReferenceRefNestList(xnewLRLs(whiteUqReferenceRef), conditionBeanSetupper);
    }
    /**
     * Load referrer of whiteUqReferenceRefNestList with the set-upper for condition-bean of referrer. <br />
     * white_uq_reference_ref_nest by COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE, named 'whiteUqReferenceRefNestList'.
     * <pre>
     * whiteUqReferenceRefBhv.<span style="color: #FD4747">loadWhiteUqReferenceRefNestList</span>(whiteUqReferenceRefList, new ConditionBeanSetupper&lt;WhiteUqReferenceRefNestCB&gt;() {
     *     public void setup(WhiteUqReferenceRefNestCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (WhiteUqReferenceRef whiteUqReferenceRef : whiteUqReferenceRefList) {
     *     ... = whiteUqReferenceRef.<span style="color: #FD4747">getWhiteUqReferenceRefNestList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().set[ForeignKey]_InScope(pkList);
     * cb.query().addOrderBy_[ForeignKey]_Asc();
     * </pre>
     * @param whiteUqReferenceRefList The entity list of whiteUqReferenceRef. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadWhiteUqReferenceRefNestList(List<WhiteUqReferenceRef> whiteUqReferenceRefList, ConditionBeanSetupper<WhiteUqReferenceRefNestCB> conditionBeanSetupper) {
        xassLRArg(whiteUqReferenceRefList, conditionBeanSetupper);
        loadWhiteUqReferenceRefNestList(whiteUqReferenceRefList, new LoadReferrerOption<WhiteUqReferenceRefNestCB, WhiteUqReferenceRefNest>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param whiteUqReferenceRef The entity of whiteUqReferenceRef. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadWhiteUqReferenceRefNestList(WhiteUqReferenceRef whiteUqReferenceRef, LoadReferrerOption<WhiteUqReferenceRefNestCB, WhiteUqReferenceRefNest> loadReferrerOption) {
        xassLRArg(whiteUqReferenceRef, loadReferrerOption);
        loadWhiteUqReferenceRefNestList(xnewLRLs(whiteUqReferenceRef), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param whiteUqReferenceRefList The entity list of whiteUqReferenceRef. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadWhiteUqReferenceRefNestList(List<WhiteUqReferenceRef> whiteUqReferenceRefList, LoadReferrerOption<WhiteUqReferenceRefNestCB, WhiteUqReferenceRefNest> loadReferrerOption) {
        xassLRArg(whiteUqReferenceRefList, loadReferrerOption);
        if (whiteUqReferenceRefList.isEmpty()) { return; }
        final WhiteUqReferenceRefNestBhv referrerBhv = xgetBSFLR().select(WhiteUqReferenceRefNestBhv.class);
        helpLoadReferrerInternally(whiteUqReferenceRefList, loadReferrerOption, new InternalLoadReferrerCallback<WhiteUqReferenceRef, java.util.Map<String, Object>, WhiteUqReferenceRefNestCB, WhiteUqReferenceRefNest>() {
            public java.util.Map<String, Object> getPKVal(WhiteUqReferenceRef e) {
                java.util.Map<String, Object> primaryKeyMap = new java.util.LinkedHashMap<String, Object>();
                primaryKeyMap.put("CompoundUqFirstCode", e.getCompoundUqFirstCode());
                primaryKeyMap.put("CompoundUqSecondCode", e.getCompoundUqSecondCode());
                return primaryKeyMap;
            }
            public void setRfLs(WhiteUqReferenceRef e, List<WhiteUqReferenceRefNest> ls) { e.setWhiteUqReferenceRefNestList(ls); }
            public WhiteUqReferenceRefNestCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(WhiteUqReferenceRefNestCB cb, List<java.util.Map<String, Object>> ls) {
                final String aliasName = cb.getSqlClause().getBasePointAliasName();
                String identity = null;
                StringBuilder sb = new StringBuilder();
                for (java.util.Map<String, Object> primaryKeyMap : ls) {
                    if (sb.length() > 0) { sb.append(")").append(ln()).append("     or ("); }
                    sb.append(aliasName).append(".COMPOUND_UQ_FIRST_CODE = ");
                    identity = "whiteUqReferenceRefNestListCompoundUqFirstCode";
                    sb.append(cb.query().xregisterFreeParameterToThemeList(identity, primaryKeyMap.get("CompoundUqFirstCode")));
                    sb.append(" and ");
                    sb.append(aliasName).append(".COMPOUND_UQ_SECOND_CODE = ");
                    identity = "whiteUqReferenceRefNestListCompoundUqSecondCode";
                    sb.append(cb.query().xregisterFreeParameterToThemeList(identity, primaryKeyMap.get("CompoundUqSecondCode")));
                }
                sb.insert(0, "((").append("))");
                cb.getSqlClause().registerWhereClause(sb.toString(), aliasName);
            }
            public void qyOdFKAsc(WhiteUqReferenceRefNestCB cb) {
                cb.query().addOrderBy_CompoundUqFirstCode_Asc();
                cb.query().addOrderBy_CompoundUqSecondCode_Asc();
            }
            public void spFKCol(WhiteUqReferenceRefNestCB cb) {
                cb.specify().columnCompoundUqFirstCode();
                cb.specify().columnCompoundUqSecondCode();
            }
            public List<WhiteUqReferenceRefNest> selRfLs(WhiteUqReferenceRefNestCB cb) { return referrerBhv.selectList(cb); }
            public java.util.Map<String, Object> getFKVal(WhiteUqReferenceRefNest e) {
                java.util.Map<String, Object> foreignKeyMap = new java.util.LinkedHashMap<String, Object>();
                foreignKeyMap.put("CompoundUqFirstCode", e.getCompoundUqFirstCode());
                foreignKeyMap.put("CompoundUqSecondCode", e.getCompoundUqSecondCode());
                return foreignKeyMap;
            }
            public void setlcEt(WhiteUqReferenceRefNest re, WhiteUqReferenceRef le) { re.setWhiteUqReferenceRef(le); }
            public String getRfPrNm() { return "whiteUqReferenceRefNestList"; }
        });
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'WhiteUqReference'.
     * @param whiteUqReferenceRefList The list of whiteUqReferenceRef. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteUqReference> pulloutWhiteUqReferenceByFkToPkId(List<WhiteUqReferenceRef> whiteUqReferenceRefList) {
        return helpPulloutInternally(whiteUqReferenceRefList, new InternalPulloutCallback<WhiteUqReferenceRef, WhiteUqReference>() {
            public WhiteUqReference getFr(WhiteUqReferenceRef e) { return e.getWhiteUqReferenceByFkToPkId(); }
            public boolean hasRf() { return true; }
            public void setRfLs(WhiteUqReference e, List<WhiteUqReferenceRef> ls)
            { e.setWhiteUqReferenceRefByFkToPkIdList(ls); }
        });
    }
    /**
     * Pull out the list of foreign table 'WhiteUqReference'.
     * @param whiteUqReferenceRefList The list of whiteUqReferenceRef. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteUqReference> pulloutWhiteUqReferenceByFkToUqCode(List<WhiteUqReferenceRef> whiteUqReferenceRefList) {
        return helpPulloutInternally(whiteUqReferenceRefList, new InternalPulloutCallback<WhiteUqReferenceRef, WhiteUqReference>() {
            public WhiteUqReference getFr(WhiteUqReferenceRef e) { return e.getWhiteUqReferenceByFkToUqCode(); }
            public boolean hasRf() { return true; }
            public void setRfLs(WhiteUqReference e, List<WhiteUqReferenceRef> ls)
            { e.setWhiteUqReferenceRefByFkToUqCodeList(ls); }
        });
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key uqReferenceRefId.
     * @param whiteUqReferenceRefList The list of whiteUqReferenceRef. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractUqReferenceRefIdList(List<WhiteUqReferenceRef> whiteUqReferenceRefList) {
        return helpExtractListInternally(whiteUqReferenceRefList, new InternalExtractCallback<WhiteUqReferenceRef, Long>() {
            public Long getCV(WhiteUqReferenceRef e) { return e.getUqReferenceRefId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteUqReferenceRef whiteUqReferenceRef = new WhiteUqReferenceRef();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteUqReferenceRef.setFoo...(value);
     * whiteUqReferenceRef.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteUqReferenceRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteUqReferenceRef.set...;</span>
     * whiteUqReferenceRefBhv.<span style="color: #FD4747">insert</span>(whiteUqReferenceRef);
     * ... = whiteUqReferenceRef.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteUqReferenceRef The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteUqReferenceRef whiteUqReferenceRef) {
        doInsert(whiteUqReferenceRef, null);
    }

    protected void doInsert(WhiteUqReferenceRef whiteUqReferenceRef, InsertOption<WhiteUqReferenceRefCB> option) {
        assertObjectNotNull("whiteUqReferenceRef", whiteUqReferenceRef);
        prepareInsertOption(option);
        delegateInsert(whiteUqReferenceRef, option);
    }

    protected void prepareInsertOption(InsertOption<WhiteUqReferenceRefCB> option) {
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
     * WhiteUqReferenceRef whiteUqReferenceRef = new WhiteUqReferenceRef();
     * whiteUqReferenceRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteUqReferenceRef.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteUqReferenceRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteUqReferenceRef.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteUqReferenceRef.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteUqReferenceRefBhv.<span style="color: #FD4747">update</span>(whiteUqReferenceRef);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param whiteUqReferenceRef The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final WhiteUqReferenceRef whiteUqReferenceRef) {
        doUpdate(whiteUqReferenceRef, null);
    }

    protected void doUpdate(WhiteUqReferenceRef whiteUqReferenceRef, final UpdateOption<WhiteUqReferenceRefCB> option) {
        assertObjectNotNull("whiteUqReferenceRef", whiteUqReferenceRef);
        prepareUpdateOption(option);
        helpUpdateInternally(whiteUqReferenceRef, new InternalUpdateCallback<WhiteUqReferenceRef>() {
            public int callbackDelegateUpdate(WhiteUqReferenceRef entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhiteUqReferenceRefCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected WhiteUqReferenceRefCB createCBForVaryingUpdate() {
        WhiteUqReferenceRefCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected WhiteUqReferenceRefCB createCBForSpecifiedUpdate() {
        WhiteUqReferenceRefCB cb = newMyConditionBean();
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
     * @param whiteUqReferenceRef The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteUqReferenceRef whiteUqReferenceRef) {
        doInesrtOrUpdate(whiteUqReferenceRef, null, null);
    }

    protected void doInesrtOrUpdate(WhiteUqReferenceRef whiteUqReferenceRef, final InsertOption<WhiteUqReferenceRefCB> insertOption, final UpdateOption<WhiteUqReferenceRefCB> updateOption) {
        helpInsertOrUpdateInternally(whiteUqReferenceRef, new InternalInsertOrUpdateCallback<WhiteUqReferenceRef, WhiteUqReferenceRefCB>() {
            public void callbackInsert(WhiteUqReferenceRef entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(WhiteUqReferenceRef entity) { doUpdate(entity, updateOption); }
            public WhiteUqReferenceRefCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(WhiteUqReferenceRefCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<WhiteUqReferenceRefCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<WhiteUqReferenceRefCB>() : updateOption;
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
     * WhiteUqReferenceRef whiteUqReferenceRef = new WhiteUqReferenceRef();
     * whiteUqReferenceRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteUqReferenceRef.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteUqReferenceRefBhv.<span style="color: #FD4747">delete</span>(whiteUqReferenceRef);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param whiteUqReferenceRef The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteUqReferenceRef whiteUqReferenceRef) {
        doDelete(whiteUqReferenceRef, null);
    }

    protected void doDelete(WhiteUqReferenceRef whiteUqReferenceRef, final DeleteOption<WhiteUqReferenceRefCB> option) {
        assertObjectNotNull("whiteUqReferenceRef", whiteUqReferenceRef);
        prepareDeleteOption(option);
        helpDeleteInternally(whiteUqReferenceRef, new InternalDeleteCallback<WhiteUqReferenceRef>() {
            public int callbackDelegateDelete(WhiteUqReferenceRef entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhiteUqReferenceRefCB> option) {
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
     *     WhiteUqReferenceRef whiteUqReferenceRef = new WhiteUqReferenceRef();
     *     whiteUqReferenceRef.setFooName("foo");
     *     if (...) {
     *         whiteUqReferenceRef.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteUqReferenceRefList.add(whiteUqReferenceRef);
     * }
     * whiteUqReferenceRefBhv.<span style="color: #FD4747">batchInsert</span>(whiteUqReferenceRefList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteUqReferenceRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteUqReferenceRef> whiteUqReferenceRefList) {
        InsertOption<WhiteUqReferenceRefCB> option = createInsertUpdateOption();
        return doBatchInsert(whiteUqReferenceRefList, option);
    }

    protected int[] doBatchInsert(List<WhiteUqReferenceRef> whiteUqReferenceRefList, InsertOption<WhiteUqReferenceRefCB> option) {
        assertObjectNotNull("whiteUqReferenceRefList", whiteUqReferenceRefList);
        prepareBatchInsertOption(whiteUqReferenceRefList, option);
        return delegateBatchInsert(whiteUqReferenceRefList, option);
    }

    protected void prepareBatchInsertOption(List<WhiteUqReferenceRef> whiteUqReferenceRefList, InsertOption<WhiteUqReferenceRefCB> option) {
        option.xallowInsertColumnModifiedPropertiesFragmented();
        option.xacceptInsertColumnModifiedPropertiesIfNeeds(whiteUqReferenceRefList);
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
     *     WhiteUqReferenceRef whiteUqReferenceRef = new WhiteUqReferenceRef();
     *     whiteUqReferenceRef.setFooName("foo");
     *     if (...) {
     *         whiteUqReferenceRef.setFooPrice(123);
     *     } else {
     *         whiteUqReferenceRef.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteUqReferenceRef.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteUqReferenceRefList.add(whiteUqReferenceRef);
     * }
     * whiteUqReferenceRefBhv.<span style="color: #FD4747">batchUpdate</span>(whiteUqReferenceRefList);
     * </pre>
     * @param whiteUqReferenceRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteUqReferenceRef> whiteUqReferenceRefList) {
        UpdateOption<WhiteUqReferenceRefCB> option = createPlainUpdateOption();
        return doBatchUpdate(whiteUqReferenceRefList, option);
    }

    protected int[] doBatchUpdate(List<WhiteUqReferenceRef> whiteUqReferenceRefList, UpdateOption<WhiteUqReferenceRefCB> option) {
        assertObjectNotNull("whiteUqReferenceRefList", whiteUqReferenceRefList);
        prepareBatchUpdateOption(whiteUqReferenceRefList, option);
        return delegateBatchUpdate(whiteUqReferenceRefList, option);
    }

    protected void prepareBatchUpdateOption(List<WhiteUqReferenceRef> whiteUqReferenceRefList, UpdateOption<WhiteUqReferenceRefCB> option) {
        option.xacceptUpdateColumnModifiedPropertiesIfNeeds(whiteUqReferenceRefList);
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
     * whiteUqReferenceRefBhv.<span style="color: #FD4747">batchUpdate</span>(whiteUqReferenceRefList, new SpecifyQuery<WhiteUqReferenceRefCB>() {
     *     public void specify(WhiteUqReferenceRefCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span> 
     * whiteUqReferenceRefBhv.<span style="color: #FD4747">batchUpdate</span>(whiteUqReferenceRefList, new SpecifyQuery<WhiteUqReferenceRefCB>() {
     *     public void specify(WhiteUqReferenceRefCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteUqReferenceRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteUqReferenceRef> whiteUqReferenceRefList, SpecifyQuery<WhiteUqReferenceRefCB> updateColumnSpec) {
        return doBatchUpdate(whiteUqReferenceRefList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        return doLumpModify(ls, option);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteUqReferenceRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteUqReferenceRef> whiteUqReferenceRefList) {
        return doBatchDelete(whiteUqReferenceRefList, null);
    }

    protected int[] doBatchDelete(List<WhiteUqReferenceRef> whiteUqReferenceRefList, DeleteOption<WhiteUqReferenceRefCB> option) {
        assertObjectNotNull("whiteUqReferenceRefList", whiteUqReferenceRefList);
        prepareDeleteOption(option);
        return delegateBatchDelete(whiteUqReferenceRefList, option);
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
     * whiteUqReferenceRefBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteUqReferenceRef, WhiteUqReferenceRefCB&gt;() {
     *     public ConditionBean setup(whiteUqReferenceRef entity, WhiteUqReferenceRefCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteUqReferenceRef, WhiteUqReferenceRefCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteUqReferenceRef, WhiteUqReferenceRefCB> setupper, InsertOption<WhiteUqReferenceRefCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        WhiteUqReferenceRef entity = new WhiteUqReferenceRef();
        WhiteUqReferenceRefCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected WhiteUqReferenceRefCB createCBForQueryInsert() {
        WhiteUqReferenceRefCB cb = newMyConditionBean();
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
     * WhiteUqReferenceRef whiteUqReferenceRef = new WhiteUqReferenceRef();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteUqReferenceRef.setPK...(value);</span>
     * whiteUqReferenceRef.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteUqReferenceRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteUqReferenceRef.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteUqReferenceRef.setVersionNo(value);</span>
     * WhiteUqReferenceRefCB cb = new WhiteUqReferenceRefCB();
     * cb.query().setFoo...(value);
     * whiteUqReferenceRefBhv.<span style="color: #FD4747">queryUpdate</span>(whiteUqReferenceRef, cb);
     * </pre>
     * @param whiteUqReferenceRef The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteUqReferenceRef. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteUqReferenceRef whiteUqReferenceRef, WhiteUqReferenceRefCB cb) {
        return doQueryUpdate(whiteUqReferenceRef, cb, null);
    }

    protected int doQueryUpdate(WhiteUqReferenceRef whiteUqReferenceRef, WhiteUqReferenceRefCB cb, UpdateOption<WhiteUqReferenceRefCB> option) {
        assertObjectNotNull("whiteUqReferenceRef", whiteUqReferenceRef); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(whiteUqReferenceRef, cb, option) : 0;
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (WhiteUqReferenceRefCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (WhiteUqReferenceRefCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteUqReferenceRefCB cb = new WhiteUqReferenceRefCB();
     * cb.query().setFoo...(value);
     * whiteUqReferenceRefBhv.<span style="color: #FD4747">queryDelete</span>(whiteUqReferenceRef, cb);
     * </pre>
     * @param cb The condition-bean of WhiteUqReferenceRef. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteUqReferenceRefCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteUqReferenceRefCB cb, DeleteOption<WhiteUqReferenceRefCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, option) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((WhiteUqReferenceRefCB)cb); }
        else { return varyingQueryDelete((WhiteUqReferenceRefCB)cb, downcast(option)); }
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
     * WhiteUqReferenceRef whiteUqReferenceRef = new WhiteUqReferenceRef();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteUqReferenceRef.setFoo...(value);
     * whiteUqReferenceRef.setBar...(value);
     * InsertOption<WhiteUqReferenceRefCB> option = new InsertOption<WhiteUqReferenceRefCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteUqReferenceRefBhv.<span style="color: #FD4747">varyingInsert</span>(whiteUqReferenceRef, option);
     * ... = whiteUqReferenceRef.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteUqReferenceRef The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteUqReferenceRef whiteUqReferenceRef, InsertOption<WhiteUqReferenceRefCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteUqReferenceRef, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteUqReferenceRef whiteUqReferenceRef = new WhiteUqReferenceRef();
     * whiteUqReferenceRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteUqReferenceRef.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteUqReferenceRef.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteUqReferenceRefCB&gt; option = new UpdateOption&lt;WhiteUqReferenceRefCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteUqReferenceRefCB&gt;() {
     *         public void specify(WhiteUqReferenceRefCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteUqReferenceRefBhv.<span style="color: #FD4747">varyingUpdate</span>(whiteUqReferenceRef, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteUqReferenceRef The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteUqReferenceRef whiteUqReferenceRef, UpdateOption<WhiteUqReferenceRefCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteUqReferenceRef, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteUqReferenceRef The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteUqReferenceRef whiteUqReferenceRef, InsertOption<WhiteUqReferenceRefCB> insertOption, UpdateOption<WhiteUqReferenceRefCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(whiteUqReferenceRef, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteUqReferenceRef The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteUqReferenceRef whiteUqReferenceRef, DeleteOption<WhiteUqReferenceRefCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteUqReferenceRef, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteUqReferenceRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteUqReferenceRef> whiteUqReferenceRefList, InsertOption<WhiteUqReferenceRefCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteUqReferenceRefList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteUqReferenceRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteUqReferenceRef> whiteUqReferenceRefList, UpdateOption<WhiteUqReferenceRefCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteUqReferenceRefList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteUqReferenceRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteUqReferenceRef> whiteUqReferenceRefList, DeleteOption<WhiteUqReferenceRefCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteUqReferenceRefList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteUqReferenceRef, WhiteUqReferenceRefCB> setupper, InsertOption<WhiteUqReferenceRefCB> option) {
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
     * WhiteUqReferenceRef whiteUqReferenceRef = new WhiteUqReferenceRef();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteUqReferenceRef.setPK...(value);</span>
     * whiteUqReferenceRef.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteUqReferenceRef.setVersionNo(value);</span>
     * WhiteUqReferenceRefCB cb = new WhiteUqReferenceRefCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteUqReferenceRefCB&gt; option = new UpdateOption&lt;WhiteUqReferenceRefCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteUqReferenceRefCB&gt;() {
     *     public void specify(WhiteUqReferenceRefCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteUqReferenceRefBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(whiteUqReferenceRef, cb, option);
     * </pre>
     * @param whiteUqReferenceRef The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteUqReferenceRef. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteUqReferenceRef whiteUqReferenceRef, WhiteUqReferenceRefCB cb, UpdateOption<WhiteUqReferenceRefCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteUqReferenceRef, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteUqReferenceRef. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteUqReferenceRefCB cb, DeleteOption<WhiteUqReferenceRefCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteUqReferenceRefBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhiteUqReferenceRefCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhiteUqReferenceRefCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhiteUqReferenceRef> void delegateSelectCursor(WhiteUqReferenceRefCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends WhiteUqReferenceRef> List<ENTITY> delegateSelectList(WhiteUqReferenceRefCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhiteUqReferenceRef e, InsertOption<WhiteUqReferenceRefCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(WhiteUqReferenceRef e, UpdateOption<WhiteUqReferenceRefCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return delegateUpdateNonstrict(e, op); }
    protected int delegateUpdateNonstrict(WhiteUqReferenceRef e, UpdateOption<WhiteUqReferenceRefCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(WhiteUqReferenceRef e, DeleteOption<WhiteUqReferenceRefCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return delegateDeleteNonstrict(e, op); }
    protected int delegateDeleteNonstrict(WhiteUqReferenceRef e, DeleteOption<WhiteUqReferenceRefCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<WhiteUqReferenceRef> ls, InsertOption<WhiteUqReferenceRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhiteUqReferenceRef> ls, UpdateOption<WhiteUqReferenceRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhiteUqReferenceRef> ls, UpdateOption<WhiteUqReferenceRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhiteUqReferenceRef> ls, DeleteOption<WhiteUqReferenceRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhiteUqReferenceRef> ls, DeleteOption<WhiteUqReferenceRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhiteUqReferenceRef e, WhiteUqReferenceRefCB inCB, ConditionBean resCB, InsertOption<WhiteUqReferenceRefCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhiteUqReferenceRef e, WhiteUqReferenceRefCB cb, UpdateOption<WhiteUqReferenceRefCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(WhiteUqReferenceRefCB cb, DeleteOption<WhiteUqReferenceRefCB> op)
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
    protected WhiteUqReferenceRef downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, WhiteUqReferenceRef.class);
    }

    protected WhiteUqReferenceRefCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, WhiteUqReferenceRefCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<WhiteUqReferenceRef> downcast(List<? extends Entity> entityList) {
        return (List<WhiteUqReferenceRef>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteUqReferenceRefCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<WhiteUqReferenceRefCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteUqReferenceRefCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<WhiteUqReferenceRefCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteUqReferenceRefCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<WhiteUqReferenceRefCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteUqReferenceRef, WhiteUqReferenceRefCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<WhiteUqReferenceRef, WhiteUqReferenceRefCB>)option;
    }
}
