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
 * The behavior of WHITE_COMPOUND_PK as TABLE. <br />
 * <pre>
 * [primary key]
 *     PK_FIRST_ID, PK_SECOND_ID
 *
 * [column]
 *     PK_FIRST_ID, PK_SECOND_ID, PK_NAME
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
 *     white_compound_pk_ref
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whiteCompoundPkRefList
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
     * int count = whiteCompoundPkBhv.<span style="color: #FD4747">selectCount</span>(cb);
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
     * Select the entity by the condition-bean.
     * <pre>
     * WhiteCompoundPkCB cb = new WhiteCompoundPkCB();
     * cb.query().setFoo...(value);
     * WhiteCompoundPk whiteCompoundPk = whiteCompoundPkBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (whiteCompoundPk != null) {
     *     ... = whiteCompoundPk.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteCompoundPk. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteCompoundPk selectEntity(WhiteCompoundPkCB cb) {
        return doSelectEntity(cb, WhiteCompoundPk.class);
    }

    protected <ENTITY extends WhiteCompoundPk> ENTITY doSelectEntity(final WhiteCompoundPkCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, entityType, new InternalSelectEntityCallback<ENTITY, WhiteCompoundPkCB>() {
            public List<ENTITY> callbackSelectList(WhiteCompoundPkCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * WhiteCompoundPkCB cb = new WhiteCompoundPkCB();
     * cb.query().setFoo...(value);
     * WhiteCompoundPk whiteCompoundPk = whiteCompoundPkBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteCompoundPk.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteCompoundPk. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteCompoundPk selectEntityWithDeletedCheck(WhiteCompoundPkCB cb) {
        return doSelectEntityWithDeletedCheck(cb, WhiteCompoundPk.class);
    }

    protected <ENTITY extends WhiteCompoundPk> ENTITY doSelectEntityWithDeletedCheck(final WhiteCompoundPkCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, entityType, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteCompoundPkCB>() {
            public List<ENTITY> callbackSelectList(WhiteCompoundPkCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
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
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
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
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
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
     * ListResultBean&lt;WhiteCompoundPk&gt; whiteCompoundPkList = whiteCompoundPkBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (WhiteCompoundPk whiteCompoundPk : whiteCompoundPkList) {
     *     ... = whiteCompoundPk.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteCompoundPk. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteCompoundPk> selectList(WhiteCompoundPkCB cb) {
        return doSelectList(cb, WhiteCompoundPk.class);
    }

    protected <ENTITY extends WhiteCompoundPk> ListResultBean<ENTITY> doSelectList(WhiteCompoundPkCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, WhiteCompoundPkCB>() {
            public List<ENTITY> callbackSelectList(WhiteCompoundPkCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteCompoundPk&gt; page = whiteCompoundPkBhv.<span style="color: #FD4747">selectPage</span>(cb);
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
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteCompoundPk> selectPage(WhiteCompoundPkCB cb) {
        return doSelectPage(cb, WhiteCompoundPk.class);
    }

    protected <ENTITY extends WhiteCompoundPk> PagingResultBean<ENTITY> doSelectPage(WhiteCompoundPkCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, WhiteCompoundPkCB>() {
            public int callbackSelectCount(WhiteCompoundPkCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteCompoundPkCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * whiteCompoundPkBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteCompoundPk&gt;() {
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

    protected <ENTITY extends WhiteCompoundPk> void doSelectCursor(WhiteCompoundPkCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<WhiteCompoundPk>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        helpSelectCursorInternally(cb, entityRowHandler, entityType, new InternalSelectCursorCallback<ENTITY, WhiteCompoundPkCB>() {
            public void callbackSelectCursor(WhiteCompoundPkCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) { delegateSelectCursor(cb, entityRowHandler, entityType); }
            public List<ENTITY> callbackSelectList(WhiteCompoundPkCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteCompoundPkBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteCompoundPkCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
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

    protected <RESULT, CB extends WhiteCompoundPkCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
        assertObjectNotNull("resultType", resultType); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, resultType);
    }

    protected <RESULT, CB extends WhiteCompoundPkCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> resultType) {
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
     * @param whiteCompoundPk The entity of whiteCompoundPk. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadWhiteCompoundPkRefList(WhiteCompoundPk whiteCompoundPk, ConditionBeanSetupper<WhiteCompoundPkRefCB> conditionBeanSetupper) {
        xassLRArg(whiteCompoundPk, conditionBeanSetupper);
        loadWhiteCompoundPkRefList(xnewLRLs(whiteCompoundPk), conditionBeanSetupper);
    }
    /**
     * Load referrer of whiteCompoundPkRefList with the set-upper for condition-bean of referrer. <br />
     * white_compound_pk_ref by REF_FIRST_ID, REF_SECOND_ID, named 'whiteCompoundPkRefList'.
     * <pre>
     * whiteCompoundPkBhv.<span style="color: #FD4747">loadWhiteCompoundPkRefList</span>(whiteCompoundPkList, new ConditionBeanSetupper&lt;WhiteCompoundPkRefCB&gt;() {
     *     public void setup(WhiteCompoundPkRefCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (WhiteCompoundPk whiteCompoundPk : whiteCompoundPkList) {
     *     ... = whiteCompoundPk.<span style="color: #FD4747">getWhiteCompoundPkRefList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().set[ForeignKey]_InScope(pkList);
     * cb.query().addOrderBy_[ForeignKey]_Asc();
     * </pre>
     * @param whiteCompoundPkList The entity list of whiteCompoundPk. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadWhiteCompoundPkRefList(List<WhiteCompoundPk> whiteCompoundPkList, ConditionBeanSetupper<WhiteCompoundPkRefCB> conditionBeanSetupper) {
        xassLRArg(whiteCompoundPkList, conditionBeanSetupper);
        loadWhiteCompoundPkRefList(whiteCompoundPkList, new LoadReferrerOption<WhiteCompoundPkRefCB, WhiteCompoundPkRef>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param whiteCompoundPk The entity of whiteCompoundPk. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadWhiteCompoundPkRefList(WhiteCompoundPk whiteCompoundPk, LoadReferrerOption<WhiteCompoundPkRefCB, WhiteCompoundPkRef> loadReferrerOption) {
        xassLRArg(whiteCompoundPk, loadReferrerOption);
        loadWhiteCompoundPkRefList(xnewLRLs(whiteCompoundPk), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param whiteCompoundPkList The entity list of whiteCompoundPk. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadWhiteCompoundPkRefList(List<WhiteCompoundPk> whiteCompoundPkList, LoadReferrerOption<WhiteCompoundPkRefCB, WhiteCompoundPkRef> loadReferrerOption) {
        xassLRArg(whiteCompoundPkList, loadReferrerOption);
        if (whiteCompoundPkList.isEmpty()) { return; }
        final WhiteCompoundPkRefBhv referrerBhv = xgetBSFLR().select(WhiteCompoundPkRefBhv.class);
        helpLoadReferrerInternally(whiteCompoundPkList, loadReferrerOption, new InternalLoadReferrerCallback<WhiteCompoundPk, java.util.Map<String, Object>, WhiteCompoundPkRefCB, WhiteCompoundPkRef>() {
            public java.util.Map<String, Object> getPKVal(WhiteCompoundPk e) {
                java.util.Map<String, Object> primaryKeyMap = new java.util.LinkedHashMap<String, Object>();
                primaryKeyMap.put("PkFirstId", e.getPkFirstId());
                primaryKeyMap.put("PkSecondId", e.getPkSecondId());
                return primaryKeyMap;
            }
            public void setRfLs(WhiteCompoundPk e, List<WhiteCompoundPkRef> ls) { e.setWhiteCompoundPkRefList(ls); }
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
            public java.util.Map<String, Object> getFKVal(WhiteCompoundPkRef e) {
                java.util.Map<String, Object> foreignKeyMap = new java.util.LinkedHashMap<String, Object>();
                foreignKeyMap.put("PkFirstId", e.getRefFirstId());
                foreignKeyMap.put("PkSecondId", e.getRefSecondId());
                return foreignKeyMap;
            }
            public void setlcEt(WhiteCompoundPkRef re, WhiteCompoundPk le) { re.setWhiteCompoundPk(le); }
            public String getRfPrNm() { return "whiteCompoundPkRefList"; }
        });
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================

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
     * whiteCompoundPkBhv.<span style="color: #FD4747">insert</span>(whiteCompoundPk);
     * ... = whiteCompoundPk.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteCompoundPk The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteCompoundPk whiteCompoundPk) {
        doInsert(whiteCompoundPk, null);
    }

    protected void doInsert(WhiteCompoundPk whiteCompoundPk, InsertOption<WhiteCompoundPkCB> option) {
        assertObjectNotNull("whiteCompoundPk", whiteCompoundPk);
        prepareInsertOption(option);
        delegateInsert(whiteCompoundPk, option);
    }

    protected void prepareInsertOption(InsertOption<WhiteCompoundPkCB> option) {
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
     * WhiteCompoundPk whiteCompoundPk = new WhiteCompoundPk();
     * whiteCompoundPk.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteCompoundPk.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteCompoundPk.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteCompoundPk.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteCompoundPk.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteCompoundPkBhv.<span style="color: #FD4747">update</span>(whiteCompoundPk);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteCompoundPk The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final WhiteCompoundPk whiteCompoundPk) {
        doUpdate(whiteCompoundPk, null);
    }

    protected void doUpdate(WhiteCompoundPk whiteCompoundPk, final UpdateOption<WhiteCompoundPkCB> option) {
        assertObjectNotNull("whiteCompoundPk", whiteCompoundPk);
        prepareUpdateOption(option);
        helpUpdateInternally(whiteCompoundPk, new InternalUpdateCallback<WhiteCompoundPk>() {
            public int callbackDelegateUpdate(WhiteCompoundPk entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhiteCompoundPkCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
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
     * @param whiteCompoundPk The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteCompoundPk whiteCompoundPk) {
        doInesrtOrUpdate(whiteCompoundPk, null, null);
    }

    protected void doInesrtOrUpdate(WhiteCompoundPk whiteCompoundPk, final InsertOption<WhiteCompoundPkCB> insertOption, final UpdateOption<WhiteCompoundPkCB> updateOption) {
        helpInsertOrUpdateInternally(whiteCompoundPk, new InternalInsertOrUpdateCallback<WhiteCompoundPk, WhiteCompoundPkCB>() {
            public void callbackInsert(WhiteCompoundPk entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(WhiteCompoundPk entity) { doUpdate(entity, updateOption); }
            public WhiteCompoundPkCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(WhiteCompoundPkCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<WhiteCompoundPkCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<WhiteCompoundPkCB>() : updateOption;
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
     * WhiteCompoundPk whiteCompoundPk = new WhiteCompoundPk();
     * whiteCompoundPk.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteCompoundPk.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteCompoundPkBhv.<span style="color: #FD4747">delete</span>(whiteCompoundPk);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteCompoundPk The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteCompoundPk whiteCompoundPk) {
        doDelete(whiteCompoundPk, null);
    }

    protected void doDelete(WhiteCompoundPk whiteCompoundPk, final DeleteOption<WhiteCompoundPkCB> option) {
        assertObjectNotNull("whiteCompoundPk", whiteCompoundPk);
        prepareDeleteOption(option);
        helpDeleteInternally(whiteCompoundPk, new InternalDeleteCallback<WhiteCompoundPk>() {
            public int callbackDelegateDelete(WhiteCompoundPk entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhiteCompoundPkCB> option) {
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
     * whiteCompoundPkBhv.<span style="color: #FD4747">batchInsert</span>(whiteCompoundPkList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteCompoundPkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteCompoundPk> whiteCompoundPkList) {
        InsertOption<WhiteCompoundPkCB> option = createInsertUpdateOption();
        return doBatchInsert(whiteCompoundPkList, option);
    }

    protected int[] doBatchInsert(List<WhiteCompoundPk> whiteCompoundPkList, InsertOption<WhiteCompoundPkCB> option) {
        assertObjectNotNull("whiteCompoundPkList", whiteCompoundPkList);
        prepareBatchInsertOption(whiteCompoundPkList, option);
        return delegateBatchInsert(whiteCompoundPkList, option);
    }

    protected void prepareBatchInsertOption(List<WhiteCompoundPk> whiteCompoundPkList, InsertOption<WhiteCompoundPkCB> option) {
        option.xallowInsertColumnModifiedPropertiesFragmented();
        option.xacceptInsertColumnModifiedPropertiesIfNeeds(whiteCompoundPkList);
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
     * whiteCompoundPkBhv.<span style="color: #FD4747">batchUpdate</span>(whiteCompoundPkList);
     * </pre>
     * @param whiteCompoundPkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteCompoundPk> whiteCompoundPkList) {
        UpdateOption<WhiteCompoundPkCB> option = createPlainUpdateOption();
        return doBatchUpdate(whiteCompoundPkList, option);
    }

    protected int[] doBatchUpdate(List<WhiteCompoundPk> whiteCompoundPkList, UpdateOption<WhiteCompoundPkCB> option) {
        assertObjectNotNull("whiteCompoundPkList", whiteCompoundPkList);
        prepareBatchUpdateOption(whiteCompoundPkList, option);
        return delegateBatchUpdate(whiteCompoundPkList, option);
    }

    protected void prepareBatchUpdateOption(List<WhiteCompoundPk> whiteCompoundPkList, UpdateOption<WhiteCompoundPkCB> option) {
        option.xacceptUpdateColumnModifiedPropertiesIfNeeds(whiteCompoundPkList);
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
     * whiteCompoundPkBhv.<span style="color: #FD4747">batchUpdate</span>(whiteCompoundPkList, new SpecifyQuery<WhiteCompoundPkCB>() {
     *     public void specify(WhiteCompoundPkCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteCompoundPkBhv.<span style="color: #FD4747">batchUpdate</span>(whiteCompoundPkList, new SpecifyQuery<WhiteCompoundPkCB>() {
     *     public void specify(WhiteCompoundPkCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
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
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteCompoundPk> whiteCompoundPkList, SpecifyQuery<WhiteCompoundPkCB> updateColumnSpec) {
        return doBatchUpdate(whiteCompoundPkList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        return doLumpModify(ls, option);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteCompoundPkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteCompoundPk> whiteCompoundPkList) {
        return doBatchDelete(whiteCompoundPkList, null);
    }

    protected int[] doBatchDelete(List<WhiteCompoundPk> whiteCompoundPkList, DeleteOption<WhiteCompoundPkCB> option) {
        assertObjectNotNull("whiteCompoundPkList", whiteCompoundPkList);
        prepareDeleteOption(option);
        return delegateBatchDelete(whiteCompoundPkList, option);
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
     * whiteCompoundPkBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteCompoundPk, WhiteCompoundPkCB&gt;() {
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

    protected int doQueryInsert(QueryInsertSetupper<WhiteCompoundPk, WhiteCompoundPkCB> setupper, InsertOption<WhiteCompoundPkCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        WhiteCompoundPk entity = new WhiteCompoundPk();
        WhiteCompoundPkCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
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
     * whiteCompoundPkBhv.<span style="color: #FD4747">queryUpdate</span>(whiteCompoundPk, cb);
     * </pre>
     * @param whiteCompoundPk The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteCompoundPk. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteCompoundPk whiteCompoundPk, WhiteCompoundPkCB cb) {
        return doQueryUpdate(whiteCompoundPk, cb, null);
    }

    protected int doQueryUpdate(WhiteCompoundPk whiteCompoundPk, WhiteCompoundPkCB cb, UpdateOption<WhiteCompoundPkCB> option) {
        assertObjectNotNull("whiteCompoundPk", whiteCompoundPk); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(whiteCompoundPk, cb, option) : 0;
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (WhiteCompoundPkCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (WhiteCompoundPkCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteCompoundPkCB cb = new WhiteCompoundPkCB();
     * cb.query().setFoo...(value);
     * whiteCompoundPkBhv.<span style="color: #FD4747">queryDelete</span>(whiteCompoundPk, cb);
     * </pre>
     * @param cb The condition-bean of WhiteCompoundPk. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteCompoundPkCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteCompoundPkCB cb, DeleteOption<WhiteCompoundPkCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, option) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((WhiteCompoundPkCB)cb); }
        else { return varyingQueryDelete((WhiteCompoundPkCB)cb, downcast(option)); }
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
     * whiteCompoundPkBhv.<span style="color: #FD4747">varyingInsert</span>(whiteCompoundPk, option);
     * ... = whiteCompoundPk.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteCompoundPk The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
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
     * whiteCompoundPk.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteCompoundPkCB&gt; option = new UpdateOption&lt;WhiteCompoundPkCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteCompoundPkCB&gt;() {
     *         public void specify(WhiteCompoundPkCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteCompoundPkBhv.<span style="color: #FD4747">varyingUpdate</span>(whiteCompoundPk, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteCompoundPk The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
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
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
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
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
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
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteCompoundPkBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(whiteCompoundPk, cb, option);
     * </pre>
     * @param whiteCompoundPk The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteCompoundPk. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
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
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
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
    protected <ENTITY extends WhiteCompoundPk> void delegateSelectCursor(WhiteCompoundPkCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends WhiteCompoundPk> List<ENTITY> delegateSelectList(WhiteCompoundPkCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhiteCompoundPk e, InsertOption<WhiteCompoundPkCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(WhiteCompoundPk e, UpdateOption<WhiteCompoundPkCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return delegateUpdateNonstrict(e, op); }
    protected int delegateUpdateNonstrict(WhiteCompoundPk e, UpdateOption<WhiteCompoundPkCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(WhiteCompoundPk e, DeleteOption<WhiteCompoundPkCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return delegateDeleteNonstrict(e, op); }
    protected int delegateDeleteNonstrict(WhiteCompoundPk e, DeleteOption<WhiteCompoundPkCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

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

    protected int delegateQueryInsert(WhiteCompoundPk e, WhiteCompoundPkCB inCB, ConditionBean resCB, InsertOption<WhiteCompoundPkCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhiteCompoundPk e, WhiteCompoundPkCB cb, UpdateOption<WhiteCompoundPkCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(WhiteCompoundPkCB cb, DeleteOption<WhiteCompoundPkCB> op)
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
    protected WhiteCompoundPk downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, WhiteCompoundPk.class);
    }

    protected WhiteCompoundPkCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, WhiteCompoundPkCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<WhiteCompoundPk> downcast(List<? extends Entity> entityList) {
        return (List<WhiteCompoundPk>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteCompoundPkCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<WhiteCompoundPkCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteCompoundPkCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<WhiteCompoundPkCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteCompoundPkCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<WhiteCompoundPkCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteCompoundPk, WhiteCompoundPkCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<WhiteCompoundPk, WhiteCompoundPkCB>)option;
    }
}
