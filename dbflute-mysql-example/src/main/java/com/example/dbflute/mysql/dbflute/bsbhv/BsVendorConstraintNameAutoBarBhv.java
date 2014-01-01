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
 * The behavior of VENDOR_CONSTRAINT_NAME_AUTO_BAR as TABLE. <br />
 * <pre>
 * [primary key]
 *     CONSTRAINT_NAME_AUTO_BAR_ID
 * 
 * [column]
 *     CONSTRAINT_NAME_AUTO_BAR_ID, CONSTRAINT_NAME_AUTO_BAR_NAME
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
 *     vendor_constraint_name_auto_ref
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     vendorConstraintNameAutoRefList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsVendorConstraintNameAutoBarBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "vendor_constraint_name_auto_bar"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return VendorConstraintNameAutoBarDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public VendorConstraintNameAutoBarDbm getMyDBMeta() { return VendorConstraintNameAutoBarDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public VendorConstraintNameAutoBar newMyEntity() { return new VendorConstraintNameAutoBar(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public VendorConstraintNameAutoBarCB newMyConditionBean() { return new VendorConstraintNameAutoBarCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * VendorConstraintNameAutoBarCB cb = new VendorConstraintNameAutoBarCB();
     * cb.query().setFoo...(value);
     * int count = vendorConstraintNameAutoBarBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of VendorConstraintNameAutoBar. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(VendorConstraintNameAutoBarCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(VendorConstraintNameAutoBarCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(VendorConstraintNameAutoBarCB cb) { // called by selectPage(cb)
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
     * VendorConstraintNameAutoBarCB cb = new VendorConstraintNameAutoBarCB();
     * cb.query().setFoo...(value);
     * VendorConstraintNameAutoBar vendorConstraintNameAutoBar = vendorConstraintNameAutoBarBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (vendorConstraintNameAutoBar != null) {
     *     ... = vendorConstraintNameAutoBar.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of VendorConstraintNameAutoBar. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorConstraintNameAutoBar selectEntity(VendorConstraintNameAutoBarCB cb) {
        return doSelectEntity(cb, VendorConstraintNameAutoBar.class);
    }

    protected <ENTITY extends VendorConstraintNameAutoBar> ENTITY doSelectEntity(final VendorConstraintNameAutoBarCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, entityType, new InternalSelectEntityCallback<ENTITY, VendorConstraintNameAutoBarCB>() {
            public List<ENTITY> callbackSelectList(VendorConstraintNameAutoBarCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * VendorConstraintNameAutoBarCB cb = new VendorConstraintNameAutoBarCB();
     * cb.query().setFoo...(value);
     * VendorConstraintNameAutoBar vendorConstraintNameAutoBar = vendorConstraintNameAutoBarBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = vendorConstraintNameAutoBar.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of VendorConstraintNameAutoBar. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorConstraintNameAutoBar selectEntityWithDeletedCheck(VendorConstraintNameAutoBarCB cb) {
        return doSelectEntityWithDeletedCheck(cb, VendorConstraintNameAutoBar.class);
    }

    protected <ENTITY extends VendorConstraintNameAutoBar> ENTITY doSelectEntityWithDeletedCheck(final VendorConstraintNameAutoBarCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, entityType, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, VendorConstraintNameAutoBarCB>() {
            public List<ENTITY> callbackSelectList(VendorConstraintNameAutoBarCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param constraintNameAutoBarId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorConstraintNameAutoBar selectByPKValue(Long constraintNameAutoBarId) {
        return doSelectByPKValue(constraintNameAutoBarId, VendorConstraintNameAutoBar.class);
    }

    protected <ENTITY extends VendorConstraintNameAutoBar> ENTITY doSelectByPKValue(Long constraintNameAutoBarId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(constraintNameAutoBarId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param constraintNameAutoBarId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorConstraintNameAutoBar selectByPKValueWithDeletedCheck(Long constraintNameAutoBarId) {
        return doSelectByPKValueWithDeletedCheck(constraintNameAutoBarId, VendorConstraintNameAutoBar.class);
    }

    protected <ENTITY extends VendorConstraintNameAutoBar> ENTITY doSelectByPKValueWithDeletedCheck(Long constraintNameAutoBarId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(constraintNameAutoBarId), entityType);
    }

    private VendorConstraintNameAutoBarCB buildPKCB(Long constraintNameAutoBarId) {
        assertObjectNotNull("constraintNameAutoBarId", constraintNameAutoBarId);
        VendorConstraintNameAutoBarCB cb = newMyConditionBean();
        cb.query().setConstraintNameAutoBarId_Equal(constraintNameAutoBarId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * VendorConstraintNameAutoBarCB cb = new VendorConstraintNameAutoBarCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;VendorConstraintNameAutoBar&gt; vendorConstraintNameAutoBarList = vendorConstraintNameAutoBarBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (VendorConstraintNameAutoBar vendorConstraintNameAutoBar : vendorConstraintNameAutoBarList) {
     *     ... = vendorConstraintNameAutoBar.get...();
     * }
     * </pre>
     * @param cb The condition-bean of VendorConstraintNameAutoBar. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<VendorConstraintNameAutoBar> selectList(VendorConstraintNameAutoBarCB cb) {
        return doSelectList(cb, VendorConstraintNameAutoBar.class);
    }

    protected <ENTITY extends VendorConstraintNameAutoBar> ListResultBean<ENTITY> doSelectList(VendorConstraintNameAutoBarCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, VendorConstraintNameAutoBarCB>() {
            public List<ENTITY> callbackSelectList(VendorConstraintNameAutoBarCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * VendorConstraintNameAutoBarCB cb = new VendorConstraintNameAutoBarCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;VendorConstraintNameAutoBar&gt; page = vendorConstraintNameAutoBarBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (VendorConstraintNameAutoBar vendorConstraintNameAutoBar : page) {
     *     ... = vendorConstraintNameAutoBar.get...();
     * }
     * </pre>
     * @param cb The condition-bean of VendorConstraintNameAutoBar. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<VendorConstraintNameAutoBar> selectPage(VendorConstraintNameAutoBarCB cb) {
        return doSelectPage(cb, VendorConstraintNameAutoBar.class);
    }

    protected <ENTITY extends VendorConstraintNameAutoBar> PagingResultBean<ENTITY> doSelectPage(VendorConstraintNameAutoBarCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, VendorConstraintNameAutoBarCB>() {
            public int callbackSelectCount(VendorConstraintNameAutoBarCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(VendorConstraintNameAutoBarCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * VendorConstraintNameAutoBarCB cb = new VendorConstraintNameAutoBarCB();
     * cb.query().setFoo...(value);
     * vendorConstraintNameAutoBarBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;VendorConstraintNameAutoBar&gt;() {
     *     public void handle(VendorConstraintNameAutoBar entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of VendorConstraintNameAutoBar. (NotNull)
     * @param entityRowHandler The handler of entity row of VendorConstraintNameAutoBar. (NotNull)
     */
    public void selectCursor(VendorConstraintNameAutoBarCB cb, EntityRowHandler<VendorConstraintNameAutoBar> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, VendorConstraintNameAutoBar.class);
    }

    protected <ENTITY extends VendorConstraintNameAutoBar> void doSelectCursor(VendorConstraintNameAutoBarCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<VendorConstraintNameAutoBar>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        helpSelectCursorInternally(cb, entityRowHandler, entityType, new InternalSelectCursorCallback<ENTITY, VendorConstraintNameAutoBarCB>() {
            public void callbackSelectCursor(VendorConstraintNameAutoBarCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) { delegateSelectCursor(cb, entityRowHandler, entityType); }
            public List<ENTITY> callbackSelectList(VendorConstraintNameAutoBarCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * vendorConstraintNameAutoBarBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(VendorConstraintNameAutoBarCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<VendorConstraintNameAutoBarCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends VendorConstraintNameAutoBarCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
        assertObjectNotNull("resultType", resultType); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, resultType);
    }

    protected <RESULT, CB extends VendorConstraintNameAutoBarCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> resultType) {
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
     * @param vendorConstraintNameAutoBar The entity of vendorConstraintNameAutoBar. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadVendorConstraintNameAutoRefList(VendorConstraintNameAutoBar vendorConstraintNameAutoBar, ConditionBeanSetupper<VendorConstraintNameAutoRefCB> conditionBeanSetupper) {
        xassLRArg(vendorConstraintNameAutoBar, conditionBeanSetupper);
        loadVendorConstraintNameAutoRefList(xnewLRLs(vendorConstraintNameAutoBar), conditionBeanSetupper);
    }
    /**
     * Load referrer of vendorConstraintNameAutoRefList with the set-upper for condition-bean of referrer. <br />
     * vendor_constraint_name_auto_ref by CONSTRAINT_NAME_AUTO_BAR_ID, named 'vendorConstraintNameAutoRefList'.
     * <pre>
     * vendorConstraintNameAutoBarBhv.<span style="color: #FD4747">loadVendorConstraintNameAutoRefList</span>(vendorConstraintNameAutoBarList, new ConditionBeanSetupper&lt;VendorConstraintNameAutoRefCB&gt;() {
     *     public void setup(VendorConstraintNameAutoRefCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (VendorConstraintNameAutoBar vendorConstraintNameAutoBar : vendorConstraintNameAutoBarList) {
     *     ... = vendorConstraintNameAutoBar.<span style="color: #FD4747">getVendorConstraintNameAutoRefList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setConstraintNameAutoBarId_InScope(pkList);
     * cb.query().addOrderBy_ConstraintNameAutoBarId_Asc();
     * </pre>
     * @param vendorConstraintNameAutoBarList The entity list of vendorConstraintNameAutoBar. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadVendorConstraintNameAutoRefList(List<VendorConstraintNameAutoBar> vendorConstraintNameAutoBarList, ConditionBeanSetupper<VendorConstraintNameAutoRefCB> conditionBeanSetupper) {
        xassLRArg(vendorConstraintNameAutoBarList, conditionBeanSetupper);
        loadVendorConstraintNameAutoRefList(vendorConstraintNameAutoBarList, new LoadReferrerOption<VendorConstraintNameAutoRefCB, VendorConstraintNameAutoRef>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param vendorConstraintNameAutoBar The entity of vendorConstraintNameAutoBar. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadVendorConstraintNameAutoRefList(VendorConstraintNameAutoBar vendorConstraintNameAutoBar, LoadReferrerOption<VendorConstraintNameAutoRefCB, VendorConstraintNameAutoRef> loadReferrerOption) {
        xassLRArg(vendorConstraintNameAutoBar, loadReferrerOption);
        loadVendorConstraintNameAutoRefList(xnewLRLs(vendorConstraintNameAutoBar), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param vendorConstraintNameAutoBarList The entity list of vendorConstraintNameAutoBar. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadVendorConstraintNameAutoRefList(List<VendorConstraintNameAutoBar> vendorConstraintNameAutoBarList, LoadReferrerOption<VendorConstraintNameAutoRefCB, VendorConstraintNameAutoRef> loadReferrerOption) {
        xassLRArg(vendorConstraintNameAutoBarList, loadReferrerOption);
        if (vendorConstraintNameAutoBarList.isEmpty()) { return; }
        final VendorConstraintNameAutoRefBhv referrerBhv = xgetBSFLR().select(VendorConstraintNameAutoRefBhv.class);
        helpLoadReferrerInternally(vendorConstraintNameAutoBarList, loadReferrerOption, new InternalLoadReferrerCallback<VendorConstraintNameAutoBar, Long, VendorConstraintNameAutoRefCB, VendorConstraintNameAutoRef>() {
            public Long getPKVal(VendorConstraintNameAutoBar e)
            { return e.getConstraintNameAutoBarId(); }
            public void setRfLs(VendorConstraintNameAutoBar e, List<VendorConstraintNameAutoRef> ls)
            { e.setVendorConstraintNameAutoRefList(ls); }
            public VendorConstraintNameAutoRefCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(VendorConstraintNameAutoRefCB cb, List<Long> ls)
            { cb.query().setConstraintNameAutoBarId_InScope(ls); }
            public void qyOdFKAsc(VendorConstraintNameAutoRefCB cb) { cb.query().addOrderBy_ConstraintNameAutoBarId_Asc(); }
            public void spFKCol(VendorConstraintNameAutoRefCB cb) { cb.specify().columnConstraintNameAutoBarId(); }
            public List<VendorConstraintNameAutoRef> selRfLs(VendorConstraintNameAutoRefCB cb) { return referrerBhv.selectList(cb); }
            public Long getFKVal(VendorConstraintNameAutoRef e) { return e.getConstraintNameAutoBarId(); }
            public void setlcEt(VendorConstraintNameAutoRef re, VendorConstraintNameAutoBar le)
            { re.setVendorConstraintNameAutoBar(le); }
            public String getRfPrNm() { return "vendorConstraintNameAutoRefList"; }
        });
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key constraintNameAutoBarId.
     * @param vendorConstraintNameAutoBarList The list of vendorConstraintNameAutoBar. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractConstraintNameAutoBarIdList(List<VendorConstraintNameAutoBar> vendorConstraintNameAutoBarList) {
        return helpExtractListInternally(vendorConstraintNameAutoBarList, new InternalExtractCallback<VendorConstraintNameAutoBar, Long>() {
            public Long getCV(VendorConstraintNameAutoBar e) { return e.getConstraintNameAutoBarId(); }
        });
    }

    /**
     * Extract the value list of (single) unique key constraintNameAutoBarName.
     * @param vendorConstraintNameAutoBarList The list of vendorConstraintNameAutoBar. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractConstraintNameAutoBarNameList(List<VendorConstraintNameAutoBar> vendorConstraintNameAutoBarList) {
        return helpExtractListInternally(vendorConstraintNameAutoBarList, new InternalExtractCallback<VendorConstraintNameAutoBar, String>() {
            public String getCV(VendorConstraintNameAutoBar e) { return e.getConstraintNameAutoBarName(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * VendorConstraintNameAutoBar vendorConstraintNameAutoBar = new VendorConstraintNameAutoBar();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorConstraintNameAutoBar.setFoo...(value);
     * vendorConstraintNameAutoBar.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoBar.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoBar.set...;</span>
     * vendorConstraintNameAutoBarBhv.<span style="color: #FD4747">insert</span>(vendorConstraintNameAutoBar);
     * ... = vendorConstraintNameAutoBar.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param vendorConstraintNameAutoBar The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(VendorConstraintNameAutoBar vendorConstraintNameAutoBar) {
        doInsert(vendorConstraintNameAutoBar, null);
    }

    protected void doInsert(VendorConstraintNameAutoBar vendorConstraintNameAutoBar, InsertOption<VendorConstraintNameAutoBarCB> option) {
        assertObjectNotNull("vendorConstraintNameAutoBar", vendorConstraintNameAutoBar);
        prepareInsertOption(option);
        delegateInsert(vendorConstraintNameAutoBar, option);
    }

    protected void prepareInsertOption(InsertOption<VendorConstraintNameAutoBarCB> option) {
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
     * VendorConstraintNameAutoBar vendorConstraintNameAutoBar = new VendorConstraintNameAutoBar();
     * vendorConstraintNameAutoBar.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorConstraintNameAutoBar.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoBar.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoBar.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * vendorConstraintNameAutoBar.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     vendorConstraintNameAutoBarBhv.<span style="color: #FD4747">update</span>(vendorConstraintNameAutoBar);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param vendorConstraintNameAutoBar The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final VendorConstraintNameAutoBar vendorConstraintNameAutoBar) {
        doUpdate(vendorConstraintNameAutoBar, null);
    }

    protected void doUpdate(VendorConstraintNameAutoBar vendorConstraintNameAutoBar, final UpdateOption<VendorConstraintNameAutoBarCB> option) {
        assertObjectNotNull("vendorConstraintNameAutoBar", vendorConstraintNameAutoBar);
        prepareUpdateOption(option);
        helpUpdateInternally(vendorConstraintNameAutoBar, new InternalUpdateCallback<VendorConstraintNameAutoBar>() {
            public int callbackDelegateUpdate(VendorConstraintNameAutoBar entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<VendorConstraintNameAutoBarCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected VendorConstraintNameAutoBarCB createCBForVaryingUpdate() {
        VendorConstraintNameAutoBarCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected VendorConstraintNameAutoBarCB createCBForSpecifiedUpdate() {
        VendorConstraintNameAutoBarCB cb = newMyConditionBean();
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
     * @param vendorConstraintNameAutoBar The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(VendorConstraintNameAutoBar vendorConstraintNameAutoBar) {
        doInesrtOrUpdate(vendorConstraintNameAutoBar, null, null);
    }

    protected void doInesrtOrUpdate(VendorConstraintNameAutoBar vendorConstraintNameAutoBar, final InsertOption<VendorConstraintNameAutoBarCB> insertOption, final UpdateOption<VendorConstraintNameAutoBarCB> updateOption) {
        helpInsertOrUpdateInternally(vendorConstraintNameAutoBar, new InternalInsertOrUpdateCallback<VendorConstraintNameAutoBar, VendorConstraintNameAutoBarCB>() {
            public void callbackInsert(VendorConstraintNameAutoBar entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(VendorConstraintNameAutoBar entity) { doUpdate(entity, updateOption); }
            public VendorConstraintNameAutoBarCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(VendorConstraintNameAutoBarCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<VendorConstraintNameAutoBarCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<VendorConstraintNameAutoBarCB>() : updateOption;
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
     * VendorConstraintNameAutoBar vendorConstraintNameAutoBar = new VendorConstraintNameAutoBar();
     * vendorConstraintNameAutoBar.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * vendorConstraintNameAutoBar.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     vendorConstraintNameAutoBarBhv.<span style="color: #FD4747">delete</span>(vendorConstraintNameAutoBar);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param vendorConstraintNameAutoBar The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(VendorConstraintNameAutoBar vendorConstraintNameAutoBar) {
        doDelete(vendorConstraintNameAutoBar, null);
    }

    protected void doDelete(VendorConstraintNameAutoBar vendorConstraintNameAutoBar, final DeleteOption<VendorConstraintNameAutoBarCB> option) {
        assertObjectNotNull("vendorConstraintNameAutoBar", vendorConstraintNameAutoBar);
        prepareDeleteOption(option);
        helpDeleteInternally(vendorConstraintNameAutoBar, new InternalDeleteCallback<VendorConstraintNameAutoBar>() {
            public int callbackDelegateDelete(VendorConstraintNameAutoBar entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<VendorConstraintNameAutoBarCB> option) {
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
     *     VendorConstraintNameAutoBar vendorConstraintNameAutoBar = new VendorConstraintNameAutoBar();
     *     vendorConstraintNameAutoBar.setFooName("foo");
     *     if (...) {
     *         vendorConstraintNameAutoBar.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     vendorConstraintNameAutoBarList.add(vendorConstraintNameAutoBar);
     * }
     * vendorConstraintNameAutoBarBhv.<span style="color: #FD4747">batchInsert</span>(vendorConstraintNameAutoBarList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param vendorConstraintNameAutoBarList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<VendorConstraintNameAutoBar> vendorConstraintNameAutoBarList) {
        InsertOption<VendorConstraintNameAutoBarCB> option = createInsertUpdateOption();
        return doBatchInsert(vendorConstraintNameAutoBarList, option);
    }

    protected int[] doBatchInsert(List<VendorConstraintNameAutoBar> vendorConstraintNameAutoBarList, InsertOption<VendorConstraintNameAutoBarCB> option) {
        assertObjectNotNull("vendorConstraintNameAutoBarList", vendorConstraintNameAutoBarList);
        prepareBatchInsertOption(vendorConstraintNameAutoBarList, option);
        return delegateBatchInsert(vendorConstraintNameAutoBarList, option);
    }

    protected void prepareBatchInsertOption(List<VendorConstraintNameAutoBar> vendorConstraintNameAutoBarList, InsertOption<VendorConstraintNameAutoBarCB> option) {
        option.xallowInsertColumnModifiedPropertiesFragmented();
        option.xacceptInsertColumnModifiedPropertiesIfNeeds(vendorConstraintNameAutoBarList);
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
     *     VendorConstraintNameAutoBar vendorConstraintNameAutoBar = new VendorConstraintNameAutoBar();
     *     vendorConstraintNameAutoBar.setFooName("foo");
     *     if (...) {
     *         vendorConstraintNameAutoBar.setFooPrice(123);
     *     } else {
     *         vendorConstraintNameAutoBar.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//vendorConstraintNameAutoBar.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     vendorConstraintNameAutoBarList.add(vendorConstraintNameAutoBar);
     * }
     * vendorConstraintNameAutoBarBhv.<span style="color: #FD4747">batchUpdate</span>(vendorConstraintNameAutoBarList);
     * </pre>
     * @param vendorConstraintNameAutoBarList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<VendorConstraintNameAutoBar> vendorConstraintNameAutoBarList) {
        UpdateOption<VendorConstraintNameAutoBarCB> option = createPlainUpdateOption();
        return doBatchUpdate(vendorConstraintNameAutoBarList, option);
    }

    protected int[] doBatchUpdate(List<VendorConstraintNameAutoBar> vendorConstraintNameAutoBarList, UpdateOption<VendorConstraintNameAutoBarCB> option) {
        assertObjectNotNull("vendorConstraintNameAutoBarList", vendorConstraintNameAutoBarList);
        prepareBatchUpdateOption(vendorConstraintNameAutoBarList, option);
        return delegateBatchUpdate(vendorConstraintNameAutoBarList, option);
    }

    protected void prepareBatchUpdateOption(List<VendorConstraintNameAutoBar> vendorConstraintNameAutoBarList, UpdateOption<VendorConstraintNameAutoBarCB> option) {
        option.xacceptUpdateColumnModifiedPropertiesIfNeeds(vendorConstraintNameAutoBarList);
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
     * vendorConstraintNameAutoBarBhv.<span style="color: #FD4747">batchUpdate</span>(vendorConstraintNameAutoBarList, new SpecifyQuery<VendorConstraintNameAutoBarCB>() {
     *     public void specify(VendorConstraintNameAutoBarCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span> 
     * vendorConstraintNameAutoBarBhv.<span style="color: #FD4747">batchUpdate</span>(vendorConstraintNameAutoBarList, new SpecifyQuery<VendorConstraintNameAutoBarCB>() {
     *     public void specify(VendorConstraintNameAutoBarCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param vendorConstraintNameAutoBarList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<VendorConstraintNameAutoBar> vendorConstraintNameAutoBarList, SpecifyQuery<VendorConstraintNameAutoBarCB> updateColumnSpec) {
        return doBatchUpdate(vendorConstraintNameAutoBarList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        return doLumpModify(ls, option);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param vendorConstraintNameAutoBarList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<VendorConstraintNameAutoBar> vendorConstraintNameAutoBarList) {
        return doBatchDelete(vendorConstraintNameAutoBarList, null);
    }

    protected int[] doBatchDelete(List<VendorConstraintNameAutoBar> vendorConstraintNameAutoBarList, DeleteOption<VendorConstraintNameAutoBarCB> option) {
        assertObjectNotNull("vendorConstraintNameAutoBarList", vendorConstraintNameAutoBarList);
        prepareDeleteOption(option);
        return delegateBatchDelete(vendorConstraintNameAutoBarList, option);
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
     * vendorConstraintNameAutoBarBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;VendorConstraintNameAutoBar, VendorConstraintNameAutoBarCB&gt;() {
     *     public ConditionBean setup(vendorConstraintNameAutoBar entity, VendorConstraintNameAutoBarCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<VendorConstraintNameAutoBar, VendorConstraintNameAutoBarCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<VendorConstraintNameAutoBar, VendorConstraintNameAutoBarCB> setupper, InsertOption<VendorConstraintNameAutoBarCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        VendorConstraintNameAutoBar entity = new VendorConstraintNameAutoBar();
        VendorConstraintNameAutoBarCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected VendorConstraintNameAutoBarCB createCBForQueryInsert() {
        VendorConstraintNameAutoBarCB cb = newMyConditionBean();
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
     * VendorConstraintNameAutoBar vendorConstraintNameAutoBar = new VendorConstraintNameAutoBar();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoBar.setPK...(value);</span>
     * vendorConstraintNameAutoBar.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoBar.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoBar.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoBar.setVersionNo(value);</span>
     * VendorConstraintNameAutoBarCB cb = new VendorConstraintNameAutoBarCB();
     * cb.query().setFoo...(value);
     * vendorConstraintNameAutoBarBhv.<span style="color: #FD4747">queryUpdate</span>(vendorConstraintNameAutoBar, cb);
     * </pre>
     * @param vendorConstraintNameAutoBar The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of VendorConstraintNameAutoBar. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(VendorConstraintNameAutoBar vendorConstraintNameAutoBar, VendorConstraintNameAutoBarCB cb) {
        return doQueryUpdate(vendorConstraintNameAutoBar, cb, null);
    }

    protected int doQueryUpdate(VendorConstraintNameAutoBar vendorConstraintNameAutoBar, VendorConstraintNameAutoBarCB cb, UpdateOption<VendorConstraintNameAutoBarCB> option) {
        assertObjectNotNull("vendorConstraintNameAutoBar", vendorConstraintNameAutoBar); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(vendorConstraintNameAutoBar, cb, option) : 0;
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (VendorConstraintNameAutoBarCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (VendorConstraintNameAutoBarCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * VendorConstraintNameAutoBarCB cb = new VendorConstraintNameAutoBarCB();
     * cb.query().setFoo...(value);
     * vendorConstraintNameAutoBarBhv.<span style="color: #FD4747">queryDelete</span>(vendorConstraintNameAutoBar, cb);
     * </pre>
     * @param cb The condition-bean of VendorConstraintNameAutoBar. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(VendorConstraintNameAutoBarCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(VendorConstraintNameAutoBarCB cb, DeleteOption<VendorConstraintNameAutoBarCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, option) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((VendorConstraintNameAutoBarCB)cb); }
        else { return varyingQueryDelete((VendorConstraintNameAutoBarCB)cb, downcast(option)); }
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
     * VendorConstraintNameAutoBar vendorConstraintNameAutoBar = new VendorConstraintNameAutoBar();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorConstraintNameAutoBar.setFoo...(value);
     * vendorConstraintNameAutoBar.setBar...(value);
     * InsertOption<VendorConstraintNameAutoBarCB> option = new InsertOption<VendorConstraintNameAutoBarCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * vendorConstraintNameAutoBarBhv.<span style="color: #FD4747">varyingInsert</span>(vendorConstraintNameAutoBar, option);
     * ... = vendorConstraintNameAutoBar.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param vendorConstraintNameAutoBar The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(VendorConstraintNameAutoBar vendorConstraintNameAutoBar, InsertOption<VendorConstraintNameAutoBarCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(vendorConstraintNameAutoBar, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * VendorConstraintNameAutoBar vendorConstraintNameAutoBar = new VendorConstraintNameAutoBar();
     * vendorConstraintNameAutoBar.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorConstraintNameAutoBar.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * vendorConstraintNameAutoBar.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;VendorConstraintNameAutoBarCB&gt; option = new UpdateOption&lt;VendorConstraintNameAutoBarCB&gt;();
     *     option.self(new SpecifyQuery&lt;VendorConstraintNameAutoBarCB&gt;() {
     *         public void specify(VendorConstraintNameAutoBarCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     vendorConstraintNameAutoBarBhv.<span style="color: #FD4747">varyingUpdate</span>(vendorConstraintNameAutoBar, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorConstraintNameAutoBar The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(VendorConstraintNameAutoBar vendorConstraintNameAutoBar, UpdateOption<VendorConstraintNameAutoBarCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(vendorConstraintNameAutoBar, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param vendorConstraintNameAutoBar The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(VendorConstraintNameAutoBar vendorConstraintNameAutoBar, InsertOption<VendorConstraintNameAutoBarCB> insertOption, UpdateOption<VendorConstraintNameAutoBarCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(vendorConstraintNameAutoBar, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param vendorConstraintNameAutoBar The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(VendorConstraintNameAutoBar vendorConstraintNameAutoBar, DeleteOption<VendorConstraintNameAutoBarCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(vendorConstraintNameAutoBar, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param vendorConstraintNameAutoBarList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<VendorConstraintNameAutoBar> vendorConstraintNameAutoBarList, InsertOption<VendorConstraintNameAutoBarCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(vendorConstraintNameAutoBarList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param vendorConstraintNameAutoBarList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<VendorConstraintNameAutoBar> vendorConstraintNameAutoBarList, UpdateOption<VendorConstraintNameAutoBarCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(vendorConstraintNameAutoBarList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param vendorConstraintNameAutoBarList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<VendorConstraintNameAutoBar> vendorConstraintNameAutoBarList, DeleteOption<VendorConstraintNameAutoBarCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(vendorConstraintNameAutoBarList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<VendorConstraintNameAutoBar, VendorConstraintNameAutoBarCB> setupper, InsertOption<VendorConstraintNameAutoBarCB> option) {
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
     * VendorConstraintNameAutoBar vendorConstraintNameAutoBar = new VendorConstraintNameAutoBar();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoBar.setPK...(value);</span>
     * vendorConstraintNameAutoBar.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoBar.setVersionNo(value);</span>
     * VendorConstraintNameAutoBarCB cb = new VendorConstraintNameAutoBarCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;VendorConstraintNameAutoBarCB&gt; option = new UpdateOption&lt;VendorConstraintNameAutoBarCB&gt;();
     * option.self(new SpecifyQuery&lt;VendorConstraintNameAutoBarCB&gt;() {
     *     public void specify(VendorConstraintNameAutoBarCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * vendorConstraintNameAutoBarBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(vendorConstraintNameAutoBar, cb, option);
     * </pre>
     * @param vendorConstraintNameAutoBar The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of VendorConstraintNameAutoBar. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(VendorConstraintNameAutoBar vendorConstraintNameAutoBar, VendorConstraintNameAutoBarCB cb, UpdateOption<VendorConstraintNameAutoBarCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(vendorConstraintNameAutoBar, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of VendorConstraintNameAutoBar. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(VendorConstraintNameAutoBarCB cb, DeleteOption<VendorConstraintNameAutoBarCB> option) {
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
    public OutsideSqlBasicExecutor<VendorConstraintNameAutoBarBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(VendorConstraintNameAutoBarCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(VendorConstraintNameAutoBarCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends VendorConstraintNameAutoBar> void delegateSelectCursor(VendorConstraintNameAutoBarCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends VendorConstraintNameAutoBar> List<ENTITY> delegateSelectList(VendorConstraintNameAutoBarCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(VendorConstraintNameAutoBar e, InsertOption<VendorConstraintNameAutoBarCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(VendorConstraintNameAutoBar e, UpdateOption<VendorConstraintNameAutoBarCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return delegateUpdateNonstrict(e, op); }
    protected int delegateUpdateNonstrict(VendorConstraintNameAutoBar e, UpdateOption<VendorConstraintNameAutoBarCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(VendorConstraintNameAutoBar e, DeleteOption<VendorConstraintNameAutoBarCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return delegateDeleteNonstrict(e, op); }
    protected int delegateDeleteNonstrict(VendorConstraintNameAutoBar e, DeleteOption<VendorConstraintNameAutoBarCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<VendorConstraintNameAutoBar> ls, InsertOption<VendorConstraintNameAutoBarCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<VendorConstraintNameAutoBar> ls, UpdateOption<VendorConstraintNameAutoBarCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<VendorConstraintNameAutoBar> ls, UpdateOption<VendorConstraintNameAutoBarCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<VendorConstraintNameAutoBar> ls, DeleteOption<VendorConstraintNameAutoBarCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<VendorConstraintNameAutoBar> ls, DeleteOption<VendorConstraintNameAutoBarCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(VendorConstraintNameAutoBar e, VendorConstraintNameAutoBarCB inCB, ConditionBean resCB, InsertOption<VendorConstraintNameAutoBarCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(VendorConstraintNameAutoBar e, VendorConstraintNameAutoBarCB cb, UpdateOption<VendorConstraintNameAutoBarCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(VendorConstraintNameAutoBarCB cb, DeleteOption<VendorConstraintNameAutoBarCB> op)
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
    protected VendorConstraintNameAutoBar downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, VendorConstraintNameAutoBar.class);
    }

    protected VendorConstraintNameAutoBarCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, VendorConstraintNameAutoBarCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<VendorConstraintNameAutoBar> downcast(List<? extends Entity> entityList) {
        return (List<VendorConstraintNameAutoBar>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<VendorConstraintNameAutoBarCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<VendorConstraintNameAutoBarCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<VendorConstraintNameAutoBarCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<VendorConstraintNameAutoBarCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<VendorConstraintNameAutoBarCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<VendorConstraintNameAutoBarCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<VendorConstraintNameAutoBar, VendorConstraintNameAutoBarCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<VendorConstraintNameAutoBar, VendorConstraintNameAutoBarCB>)option;
    }
}
