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
 * The behavior of VENDOR_CONSTRAINT_NAME_AUTO_FOO as TABLE. <br />
 * <pre>
 * [primary key]
 *     CONSTRAINT_NAME_AUTO_FOO_ID
 * 
 * [column]
 *     CONSTRAINT_NAME_AUTO_FOO_ID, CONSTRAINT_NAME_AUTO_FOO_NAME
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
public abstract class BsVendorConstraintNameAutoFooBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "vendor_constraint_name_auto_foo"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return VendorConstraintNameAutoFooDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public VendorConstraintNameAutoFooDbm getMyDBMeta() { return VendorConstraintNameAutoFooDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public VendorConstraintNameAutoFoo newMyEntity() { return new VendorConstraintNameAutoFoo(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public VendorConstraintNameAutoFooCB newMyConditionBean() { return new VendorConstraintNameAutoFooCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * VendorConstraintNameAutoFooCB cb = new VendorConstraintNameAutoFooCB();
     * cb.query().setFoo...(value);
     * int count = vendorConstraintNameAutoFooBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of VendorConstraintNameAutoFoo. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(VendorConstraintNameAutoFooCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(VendorConstraintNameAutoFooCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(VendorConstraintNameAutoFooCB cb) { // called by selectPage(cb)
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
     * VendorConstraintNameAutoFooCB cb = new VendorConstraintNameAutoFooCB();
     * cb.query().setFoo...(value);
     * VendorConstraintNameAutoFoo vendorConstraintNameAutoFoo = vendorConstraintNameAutoFooBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (vendorConstraintNameAutoFoo != null) {
     *     ... = vendorConstraintNameAutoFoo.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of VendorConstraintNameAutoFoo. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorConstraintNameAutoFoo selectEntity(VendorConstraintNameAutoFooCB cb) {
        return doSelectEntity(cb, VendorConstraintNameAutoFoo.class);
    }

    protected <ENTITY extends VendorConstraintNameAutoFoo> ENTITY doSelectEntity(final VendorConstraintNameAutoFooCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, entityType, new InternalSelectEntityCallback<ENTITY, VendorConstraintNameAutoFooCB>() {
            public List<ENTITY> callbackSelectList(VendorConstraintNameAutoFooCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * VendorConstraintNameAutoFooCB cb = new VendorConstraintNameAutoFooCB();
     * cb.query().setFoo...(value);
     * VendorConstraintNameAutoFoo vendorConstraintNameAutoFoo = vendorConstraintNameAutoFooBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = vendorConstraintNameAutoFoo.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of VendorConstraintNameAutoFoo. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorConstraintNameAutoFoo selectEntityWithDeletedCheck(VendorConstraintNameAutoFooCB cb) {
        return doSelectEntityWithDeletedCheck(cb, VendorConstraintNameAutoFoo.class);
    }

    protected <ENTITY extends VendorConstraintNameAutoFoo> ENTITY doSelectEntityWithDeletedCheck(final VendorConstraintNameAutoFooCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, entityType, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, VendorConstraintNameAutoFooCB>() {
            public List<ENTITY> callbackSelectList(VendorConstraintNameAutoFooCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param constraintNameAutoFooId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorConstraintNameAutoFoo selectByPKValue(Long constraintNameAutoFooId) {
        return doSelectByPKValue(constraintNameAutoFooId, VendorConstraintNameAutoFoo.class);
    }

    protected <ENTITY extends VendorConstraintNameAutoFoo> ENTITY doSelectByPKValue(Long constraintNameAutoFooId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(constraintNameAutoFooId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param constraintNameAutoFooId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorConstraintNameAutoFoo selectByPKValueWithDeletedCheck(Long constraintNameAutoFooId) {
        return doSelectByPKValueWithDeletedCheck(constraintNameAutoFooId, VendorConstraintNameAutoFoo.class);
    }

    protected <ENTITY extends VendorConstraintNameAutoFoo> ENTITY doSelectByPKValueWithDeletedCheck(Long constraintNameAutoFooId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(constraintNameAutoFooId), entityType);
    }

    private VendorConstraintNameAutoFooCB buildPKCB(Long constraintNameAutoFooId) {
        assertObjectNotNull("constraintNameAutoFooId", constraintNameAutoFooId);
        VendorConstraintNameAutoFooCB cb = newMyConditionBean();
        cb.query().setConstraintNameAutoFooId_Equal(constraintNameAutoFooId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * VendorConstraintNameAutoFooCB cb = new VendorConstraintNameAutoFooCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;VendorConstraintNameAutoFoo&gt; vendorConstraintNameAutoFooList = vendorConstraintNameAutoFooBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (VendorConstraintNameAutoFoo vendorConstraintNameAutoFoo : vendorConstraintNameAutoFooList) {
     *     ... = vendorConstraintNameAutoFoo.get...();
     * }
     * </pre>
     * @param cb The condition-bean of VendorConstraintNameAutoFoo. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<VendorConstraintNameAutoFoo> selectList(VendorConstraintNameAutoFooCB cb) {
        return doSelectList(cb, VendorConstraintNameAutoFoo.class);
    }

    protected <ENTITY extends VendorConstraintNameAutoFoo> ListResultBean<ENTITY> doSelectList(VendorConstraintNameAutoFooCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, VendorConstraintNameAutoFooCB>() {
            public List<ENTITY> callbackSelectList(VendorConstraintNameAutoFooCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * VendorConstraintNameAutoFooCB cb = new VendorConstraintNameAutoFooCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;VendorConstraintNameAutoFoo&gt; page = vendorConstraintNameAutoFooBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (VendorConstraintNameAutoFoo vendorConstraintNameAutoFoo : page) {
     *     ... = vendorConstraintNameAutoFoo.get...();
     * }
     * </pre>
     * @param cb The condition-bean of VendorConstraintNameAutoFoo. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<VendorConstraintNameAutoFoo> selectPage(VendorConstraintNameAutoFooCB cb) {
        return doSelectPage(cb, VendorConstraintNameAutoFoo.class);
    }

    protected <ENTITY extends VendorConstraintNameAutoFoo> PagingResultBean<ENTITY> doSelectPage(VendorConstraintNameAutoFooCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, VendorConstraintNameAutoFooCB>() {
            public int callbackSelectCount(VendorConstraintNameAutoFooCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(VendorConstraintNameAutoFooCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * VendorConstraintNameAutoFooCB cb = new VendorConstraintNameAutoFooCB();
     * cb.query().setFoo...(value);
     * vendorConstraintNameAutoFooBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;VendorConstraintNameAutoFoo&gt;() {
     *     public void handle(VendorConstraintNameAutoFoo entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of VendorConstraintNameAutoFoo. (NotNull)
     * @param entityRowHandler The handler of entity row of VendorConstraintNameAutoFoo. (NotNull)
     */
    public void selectCursor(VendorConstraintNameAutoFooCB cb, EntityRowHandler<VendorConstraintNameAutoFoo> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, VendorConstraintNameAutoFoo.class);
    }

    protected <ENTITY extends VendorConstraintNameAutoFoo> void doSelectCursor(VendorConstraintNameAutoFooCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<VendorConstraintNameAutoFoo>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        helpSelectCursorInternally(cb, entityRowHandler, entityType, new InternalSelectCursorCallback<ENTITY, VendorConstraintNameAutoFooCB>() {
            public void callbackSelectCursor(VendorConstraintNameAutoFooCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) { delegateSelectCursor(cb, entityRowHandler, entityType); }
            public List<ENTITY> callbackSelectList(VendorConstraintNameAutoFooCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * vendorConstraintNameAutoFooBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(VendorConstraintNameAutoFooCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (NullAllowed)
     */
    public <RESULT> SLFunction<VendorConstraintNameAutoFooCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends VendorConstraintNameAutoFooCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
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
     * @param vendorConstraintNameAutoFoo The entity of vendorConstraintNameAutoFoo. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadVendorConstraintNameAutoRefList(VendorConstraintNameAutoFoo vendorConstraintNameAutoFoo, ConditionBeanSetupper<VendorConstraintNameAutoRefCB> conditionBeanSetupper) {
        xassLRArg(vendorConstraintNameAutoFoo, conditionBeanSetupper);
        loadVendorConstraintNameAutoRefList(xnewLRLs(vendorConstraintNameAutoFoo), conditionBeanSetupper);
    }
    /**
     * Load referrer of vendorConstraintNameAutoRefList with the set-upper for condition-bean of referrer. <br />
     * vendor_constraint_name_auto_ref by CONSTRAINT_NAME_AUTO_FOO_ID, named 'vendorConstraintNameAutoRefList'.
     * <pre>
     * vendorConstraintNameAutoFooBhv.<span style="color: #FD4747">loadVendorConstraintNameAutoRefList</span>(vendorConstraintNameAutoFooList, new ConditionBeanSetupper&lt;VendorConstraintNameAutoRefCB&gt;() {
     *     public void setup(VendorConstraintNameAutoRefCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (VendorConstraintNameAutoFoo vendorConstraintNameAutoFoo : vendorConstraintNameAutoFooList) {
     *     ... = vendorConstraintNameAutoFoo.<span style="color: #FD4747">getVendorConstraintNameAutoRefList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setConstraintNameAutoFooId_InScope(pkList);
     * cb.query().addOrderBy_ConstraintNameAutoFooId_Asc();
     * </pre>
     * @param vendorConstraintNameAutoFooList The entity list of vendorConstraintNameAutoFoo. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadVendorConstraintNameAutoRefList(List<VendorConstraintNameAutoFoo> vendorConstraintNameAutoFooList, ConditionBeanSetupper<VendorConstraintNameAutoRefCB> conditionBeanSetupper) {
        xassLRArg(vendorConstraintNameAutoFooList, conditionBeanSetupper);
        loadVendorConstraintNameAutoRefList(vendorConstraintNameAutoFooList, new LoadReferrerOption<VendorConstraintNameAutoRefCB, VendorConstraintNameAutoRef>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param vendorConstraintNameAutoFoo The entity of vendorConstraintNameAutoFoo. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadVendorConstraintNameAutoRefList(VendorConstraintNameAutoFoo vendorConstraintNameAutoFoo, LoadReferrerOption<VendorConstraintNameAutoRefCB, VendorConstraintNameAutoRef> loadReferrerOption) {
        xassLRArg(vendorConstraintNameAutoFoo, loadReferrerOption);
        loadVendorConstraintNameAutoRefList(xnewLRLs(vendorConstraintNameAutoFoo), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param vendorConstraintNameAutoFooList The entity list of vendorConstraintNameAutoFoo. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadVendorConstraintNameAutoRefList(List<VendorConstraintNameAutoFoo> vendorConstraintNameAutoFooList, LoadReferrerOption<VendorConstraintNameAutoRefCB, VendorConstraintNameAutoRef> loadReferrerOption) {
        xassLRArg(vendorConstraintNameAutoFooList, loadReferrerOption);
        if (vendorConstraintNameAutoFooList.isEmpty()) { return; }
        final VendorConstraintNameAutoRefBhv referrerBhv = xgetBSFLR().select(VendorConstraintNameAutoRefBhv.class);
        helpLoadReferrerInternally(vendorConstraintNameAutoFooList, loadReferrerOption, new InternalLoadReferrerCallback<VendorConstraintNameAutoFoo, Long, VendorConstraintNameAutoRefCB, VendorConstraintNameAutoRef>() {
            public Long getPKVal(VendorConstraintNameAutoFoo e)
            { return e.getConstraintNameAutoFooId(); }
            public void setRfLs(VendorConstraintNameAutoFoo e, List<VendorConstraintNameAutoRef> ls)
            { e.setVendorConstraintNameAutoRefList(ls); }
            public VendorConstraintNameAutoRefCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(VendorConstraintNameAutoRefCB cb, List<Long> ls)
            { cb.query().setConstraintNameAutoFooId_InScope(ls); }
            public void qyOdFKAsc(VendorConstraintNameAutoRefCB cb) { cb.query().addOrderBy_ConstraintNameAutoFooId_Asc(); }
            public void spFKCol(VendorConstraintNameAutoRefCB cb) { cb.specify().columnConstraintNameAutoFooId(); }
            public List<VendorConstraintNameAutoRef> selRfLs(VendorConstraintNameAutoRefCB cb) { return referrerBhv.selectList(cb); }
            public Long getFKVal(VendorConstraintNameAutoRef e) { return e.getConstraintNameAutoFooId(); }
            public void setlcEt(VendorConstraintNameAutoRef re, VendorConstraintNameAutoFoo le)
            { re.setVendorConstraintNameAutoFoo(le); }
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
     * Extract the value list of (single) primary key constraintNameAutoFooId.
     * @param vendorConstraintNameAutoFooList The list of vendorConstraintNameAutoFoo. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractConstraintNameAutoFooIdList(List<VendorConstraintNameAutoFoo> vendorConstraintNameAutoFooList) {
        return helpExtractListInternally(vendorConstraintNameAutoFooList, new InternalExtractCallback<VendorConstraintNameAutoFoo, Long>() {
            public Long getCV(VendorConstraintNameAutoFoo e) { return e.getConstraintNameAutoFooId(); }
        });
    }

    /**
     * Extract the value list of (single) unique key constraintNameAutoFooName.
     * @param vendorConstraintNameAutoFooList The list of vendorConstraintNameAutoFoo. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractConstraintNameAutoFooNameList(List<VendorConstraintNameAutoFoo> vendorConstraintNameAutoFooList) {
        return helpExtractListInternally(vendorConstraintNameAutoFooList, new InternalExtractCallback<VendorConstraintNameAutoFoo, String>() {
            public String getCV(VendorConstraintNameAutoFoo e) { return e.getConstraintNameAutoFooName(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * VendorConstraintNameAutoFoo vendorConstraintNameAutoFoo = new VendorConstraintNameAutoFoo();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorConstraintNameAutoFoo.setFoo...(value);
     * vendorConstraintNameAutoFoo.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoFoo.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoFoo.set...;</span>
     * vendorConstraintNameAutoFooBhv.<span style="color: #FD4747">insert</span>(vendorConstraintNameAutoFoo);
     * ... = vendorConstraintNameAutoFoo.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param vendorConstraintNameAutoFoo The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(VendorConstraintNameAutoFoo vendorConstraintNameAutoFoo) {
        doInsert(vendorConstraintNameAutoFoo, null);
    }

    protected void doInsert(VendorConstraintNameAutoFoo vendorConstraintNameAutoFoo, InsertOption<VendorConstraintNameAutoFooCB> option) {
        assertObjectNotNull("vendorConstraintNameAutoFoo", vendorConstraintNameAutoFoo);
        prepareInsertOption(option);
        delegateInsert(vendorConstraintNameAutoFoo, option);
    }

    protected void prepareInsertOption(InsertOption<VendorConstraintNameAutoFooCB> option) {
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
     * VendorConstraintNameAutoFoo vendorConstraintNameAutoFoo = new VendorConstraintNameAutoFoo();
     * vendorConstraintNameAutoFoo.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorConstraintNameAutoFoo.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoFoo.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoFoo.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * vendorConstraintNameAutoFoo.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     vendorConstraintNameAutoFooBhv.<span style="color: #FD4747">update</span>(vendorConstraintNameAutoFoo);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param vendorConstraintNameAutoFoo The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final VendorConstraintNameAutoFoo vendorConstraintNameAutoFoo) {
        doUpdate(vendorConstraintNameAutoFoo, null);
    }

    protected void doUpdate(VendorConstraintNameAutoFoo vendorConstraintNameAutoFoo, final UpdateOption<VendorConstraintNameAutoFooCB> option) {
        assertObjectNotNull("vendorConstraintNameAutoFoo", vendorConstraintNameAutoFoo);
        prepareUpdateOption(option);
        helpUpdateInternally(vendorConstraintNameAutoFoo, new InternalUpdateCallback<VendorConstraintNameAutoFoo>() {
            public int callbackDelegateUpdate(VendorConstraintNameAutoFoo entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<VendorConstraintNameAutoFooCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected VendorConstraintNameAutoFooCB createCBForVaryingUpdate() {
        VendorConstraintNameAutoFooCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected VendorConstraintNameAutoFooCB createCBForSpecifiedUpdate() {
        VendorConstraintNameAutoFooCB cb = newMyConditionBean();
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
     * @param vendorConstraintNameAutoFoo The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(VendorConstraintNameAutoFoo vendorConstraintNameAutoFoo) {
        doInesrtOrUpdate(vendorConstraintNameAutoFoo, null, null);
    }

    protected void doInesrtOrUpdate(VendorConstraintNameAutoFoo vendorConstraintNameAutoFoo, final InsertOption<VendorConstraintNameAutoFooCB> insertOption, final UpdateOption<VendorConstraintNameAutoFooCB> updateOption) {
        helpInsertOrUpdateInternally(vendorConstraintNameAutoFoo, new InternalInsertOrUpdateCallback<VendorConstraintNameAutoFoo, VendorConstraintNameAutoFooCB>() {
            public void callbackInsert(VendorConstraintNameAutoFoo entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(VendorConstraintNameAutoFoo entity) { doUpdate(entity, updateOption); }
            public VendorConstraintNameAutoFooCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(VendorConstraintNameAutoFooCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<VendorConstraintNameAutoFooCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<VendorConstraintNameAutoFooCB>() : updateOption;
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
     * VendorConstraintNameAutoFoo vendorConstraintNameAutoFoo = new VendorConstraintNameAutoFoo();
     * vendorConstraintNameAutoFoo.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * vendorConstraintNameAutoFoo.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     vendorConstraintNameAutoFooBhv.<span style="color: #FD4747">delete</span>(vendorConstraintNameAutoFoo);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param vendorConstraintNameAutoFoo The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(VendorConstraintNameAutoFoo vendorConstraintNameAutoFoo) {
        doDelete(vendorConstraintNameAutoFoo, null);
    }

    protected void doDelete(VendorConstraintNameAutoFoo vendorConstraintNameAutoFoo, final DeleteOption<VendorConstraintNameAutoFooCB> option) {
        assertObjectNotNull("vendorConstraintNameAutoFoo", vendorConstraintNameAutoFoo);
        prepareDeleteOption(option);
        helpDeleteInternally(vendorConstraintNameAutoFoo, new InternalDeleteCallback<VendorConstraintNameAutoFoo>() {
            public int callbackDelegateDelete(VendorConstraintNameAutoFoo entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<VendorConstraintNameAutoFooCB> option) {
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
     *     VendorConstraintNameAutoFoo vendorConstraintNameAutoFoo = new VendorConstraintNameAutoFoo();
     *     vendorConstraintNameAutoFoo.setFooName("foo");
     *     if (...) {
     *         vendorConstraintNameAutoFoo.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     vendorConstraintNameAutoFooList.add(vendorConstraintNameAutoFoo);
     * }
     * vendorConstraintNameAutoFooBhv.<span style="color: #FD4747">batchInsert</span>(vendorConstraintNameAutoFooList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param vendorConstraintNameAutoFooList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<VendorConstraintNameAutoFoo> vendorConstraintNameAutoFooList) {
        InsertOption<VendorConstraintNameAutoFooCB> option = createInsertUpdateOption();
        return doBatchInsert(vendorConstraintNameAutoFooList, option);
    }

    protected int[] doBatchInsert(List<VendorConstraintNameAutoFoo> vendorConstraintNameAutoFooList, InsertOption<VendorConstraintNameAutoFooCB> option) {
        assertObjectNotNull("vendorConstraintNameAutoFooList", vendorConstraintNameAutoFooList);
        prepareBatchInsertOption(vendorConstraintNameAutoFooList, option);
        return delegateBatchInsert(vendorConstraintNameAutoFooList, option);
    }

    protected void prepareBatchInsertOption(List<VendorConstraintNameAutoFoo> vendorConstraintNameAutoFooList, InsertOption<VendorConstraintNameAutoFooCB> option) {
        option.xallowInsertColumnModifiedPropertiesFragmented();
        option.xacceptInsertColumnModifiedPropertiesIfNeeds(vendorConstraintNameAutoFooList);
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
     *     VendorConstraintNameAutoFoo vendorConstraintNameAutoFoo = new VendorConstraintNameAutoFoo();
     *     vendorConstraintNameAutoFoo.setFooName("foo");
     *     if (...) {
     *         vendorConstraintNameAutoFoo.setFooPrice(123);
     *     } else {
     *         vendorConstraintNameAutoFoo.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//vendorConstraintNameAutoFoo.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     vendorConstraintNameAutoFooList.add(vendorConstraintNameAutoFoo);
     * }
     * vendorConstraintNameAutoFooBhv.<span style="color: #FD4747">batchUpdate</span>(vendorConstraintNameAutoFooList);
     * </pre>
     * @param vendorConstraintNameAutoFooList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<VendorConstraintNameAutoFoo> vendorConstraintNameAutoFooList) {
        UpdateOption<VendorConstraintNameAutoFooCB> option = createPlainUpdateOption();
        return doBatchUpdate(vendorConstraintNameAutoFooList, option);
    }

    protected int[] doBatchUpdate(List<VendorConstraintNameAutoFoo> vendorConstraintNameAutoFooList, UpdateOption<VendorConstraintNameAutoFooCB> option) {
        assertObjectNotNull("vendorConstraintNameAutoFooList", vendorConstraintNameAutoFooList);
        prepareBatchUpdateOption(vendorConstraintNameAutoFooList, option);
        return delegateBatchUpdate(vendorConstraintNameAutoFooList, option);
    }

    protected void prepareBatchUpdateOption(List<VendorConstraintNameAutoFoo> vendorConstraintNameAutoFooList, UpdateOption<VendorConstraintNameAutoFooCB> option) {
        option.xacceptUpdateColumnModifiedPropertiesIfNeeds(vendorConstraintNameAutoFooList);
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
     * vendorConstraintNameAutoFooBhv.<span style="color: #FD4747">batchUpdate</span>(vendorConstraintNameAutoFooList, new SpecifyQuery<VendorConstraintNameAutoFooCB>() {
     *     public void specify(VendorConstraintNameAutoFooCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span> 
     * vendorConstraintNameAutoFooBhv.<span style="color: #FD4747">batchUpdate</span>(vendorConstraintNameAutoFooList, new SpecifyQuery<VendorConstraintNameAutoFooCB>() {
     *     public void specify(VendorConstraintNameAutoFooCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param vendorConstraintNameAutoFooList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<VendorConstraintNameAutoFoo> vendorConstraintNameAutoFooList, SpecifyQuery<VendorConstraintNameAutoFooCB> updateColumnSpec) {
        return doBatchUpdate(vendorConstraintNameAutoFooList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        return doLumpModify(ls, option);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param vendorConstraintNameAutoFooList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<VendorConstraintNameAutoFoo> vendorConstraintNameAutoFooList) {
        return doBatchDelete(vendorConstraintNameAutoFooList, null);
    }

    protected int[] doBatchDelete(List<VendorConstraintNameAutoFoo> vendorConstraintNameAutoFooList, DeleteOption<VendorConstraintNameAutoFooCB> option) {
        assertObjectNotNull("vendorConstraintNameAutoFooList", vendorConstraintNameAutoFooList);
        prepareDeleteOption(option);
        return delegateBatchDelete(vendorConstraintNameAutoFooList, option);
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
     * vendorConstraintNameAutoFooBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;VendorConstraintNameAutoFoo, VendorConstraintNameAutoFooCB&gt;() {
     *     public ConditionBean setup(vendorConstraintNameAutoFoo entity, VendorConstraintNameAutoFooCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<VendorConstraintNameAutoFoo, VendorConstraintNameAutoFooCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<VendorConstraintNameAutoFoo, VendorConstraintNameAutoFooCB> setupper, InsertOption<VendorConstraintNameAutoFooCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        VendorConstraintNameAutoFoo entity = new VendorConstraintNameAutoFoo();
        VendorConstraintNameAutoFooCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected VendorConstraintNameAutoFooCB createCBForQueryInsert() {
        VendorConstraintNameAutoFooCB cb = newMyConditionBean();
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
     * VendorConstraintNameAutoFoo vendorConstraintNameAutoFoo = new VendorConstraintNameAutoFoo();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoFoo.setPK...(value);</span>
     * vendorConstraintNameAutoFoo.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoFoo.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoFoo.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoFoo.setVersionNo(value);</span>
     * VendorConstraintNameAutoFooCB cb = new VendorConstraintNameAutoFooCB();
     * cb.query().setFoo...(value);
     * vendorConstraintNameAutoFooBhv.<span style="color: #FD4747">queryUpdate</span>(vendorConstraintNameAutoFoo, cb);
     * </pre>
     * @param vendorConstraintNameAutoFoo The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of VendorConstraintNameAutoFoo. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(VendorConstraintNameAutoFoo vendorConstraintNameAutoFoo, VendorConstraintNameAutoFooCB cb) {
        return doQueryUpdate(vendorConstraintNameAutoFoo, cb, null);
    }

    protected int doQueryUpdate(VendorConstraintNameAutoFoo vendorConstraintNameAutoFoo, VendorConstraintNameAutoFooCB cb, UpdateOption<VendorConstraintNameAutoFooCB> option) {
        assertObjectNotNull("vendorConstraintNameAutoFoo", vendorConstraintNameAutoFoo); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(vendorConstraintNameAutoFoo, cb, option) : 0;
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (VendorConstraintNameAutoFooCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (VendorConstraintNameAutoFooCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * VendorConstraintNameAutoFooCB cb = new VendorConstraintNameAutoFooCB();
     * cb.query().setFoo...(value);
     * vendorConstraintNameAutoFooBhv.<span style="color: #FD4747">queryDelete</span>(vendorConstraintNameAutoFoo, cb);
     * </pre>
     * @param cb The condition-bean of VendorConstraintNameAutoFoo. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(VendorConstraintNameAutoFooCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(VendorConstraintNameAutoFooCB cb, DeleteOption<VendorConstraintNameAutoFooCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, option) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((VendorConstraintNameAutoFooCB)cb); }
        else { return varyingQueryDelete((VendorConstraintNameAutoFooCB)cb, downcast(option)); }
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
     * VendorConstraintNameAutoFoo vendorConstraintNameAutoFoo = new VendorConstraintNameAutoFoo();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorConstraintNameAutoFoo.setFoo...(value);
     * vendorConstraintNameAutoFoo.setBar...(value);
     * InsertOption<VendorConstraintNameAutoFooCB> option = new InsertOption<VendorConstraintNameAutoFooCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * vendorConstraintNameAutoFooBhv.<span style="color: #FD4747">varyingInsert</span>(vendorConstraintNameAutoFoo, option);
     * ... = vendorConstraintNameAutoFoo.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param vendorConstraintNameAutoFoo The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(VendorConstraintNameAutoFoo vendorConstraintNameAutoFoo, InsertOption<VendorConstraintNameAutoFooCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(vendorConstraintNameAutoFoo, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * VendorConstraintNameAutoFoo vendorConstraintNameAutoFoo = new VendorConstraintNameAutoFoo();
     * vendorConstraintNameAutoFoo.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorConstraintNameAutoFoo.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * vendorConstraintNameAutoFoo.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;VendorConstraintNameAutoFooCB&gt; option = new UpdateOption&lt;VendorConstraintNameAutoFooCB&gt;();
     *     option.self(new SpecifyQuery&lt;VendorConstraintNameAutoFooCB&gt;() {
     *         public void specify(VendorConstraintNameAutoFooCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     vendorConstraintNameAutoFooBhv.<span style="color: #FD4747">varyingUpdate</span>(vendorConstraintNameAutoFoo, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorConstraintNameAutoFoo The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(VendorConstraintNameAutoFoo vendorConstraintNameAutoFoo, UpdateOption<VendorConstraintNameAutoFooCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(vendorConstraintNameAutoFoo, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param vendorConstraintNameAutoFoo The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(VendorConstraintNameAutoFoo vendorConstraintNameAutoFoo, InsertOption<VendorConstraintNameAutoFooCB> insertOption, UpdateOption<VendorConstraintNameAutoFooCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(vendorConstraintNameAutoFoo, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param vendorConstraintNameAutoFoo The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(VendorConstraintNameAutoFoo vendorConstraintNameAutoFoo, DeleteOption<VendorConstraintNameAutoFooCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(vendorConstraintNameAutoFoo, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param vendorConstraintNameAutoFooList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<VendorConstraintNameAutoFoo> vendorConstraintNameAutoFooList, InsertOption<VendorConstraintNameAutoFooCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(vendorConstraintNameAutoFooList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param vendorConstraintNameAutoFooList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<VendorConstraintNameAutoFoo> vendorConstraintNameAutoFooList, UpdateOption<VendorConstraintNameAutoFooCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(vendorConstraintNameAutoFooList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param vendorConstraintNameAutoFooList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<VendorConstraintNameAutoFoo> vendorConstraintNameAutoFooList, DeleteOption<VendorConstraintNameAutoFooCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(vendorConstraintNameAutoFooList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<VendorConstraintNameAutoFoo, VendorConstraintNameAutoFooCB> setupper, InsertOption<VendorConstraintNameAutoFooCB> option) {
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
     * VendorConstraintNameAutoFoo vendorConstraintNameAutoFoo = new VendorConstraintNameAutoFoo();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoFoo.setPK...(value);</span>
     * vendorConstraintNameAutoFoo.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoFoo.setVersionNo(value);</span>
     * VendorConstraintNameAutoFooCB cb = new VendorConstraintNameAutoFooCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;VendorConstraintNameAutoFooCB&gt; option = new UpdateOption&lt;VendorConstraintNameAutoFooCB&gt;();
     * option.self(new SpecifyQuery&lt;VendorConstraintNameAutoFooCB&gt;() {
     *     public void specify(VendorConstraintNameAutoFooCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * vendorConstraintNameAutoFooBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(vendorConstraintNameAutoFoo, cb, option);
     * </pre>
     * @param vendorConstraintNameAutoFoo The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of VendorConstraintNameAutoFoo. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(VendorConstraintNameAutoFoo vendorConstraintNameAutoFoo, VendorConstraintNameAutoFooCB cb, UpdateOption<VendorConstraintNameAutoFooCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(vendorConstraintNameAutoFoo, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of VendorConstraintNameAutoFoo. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(VendorConstraintNameAutoFooCB cb, DeleteOption<VendorConstraintNameAutoFooCB> option) {
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
    public OutsideSqlBasicExecutor<VendorConstraintNameAutoFooBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(VendorConstraintNameAutoFooCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(VendorConstraintNameAutoFooCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends VendorConstraintNameAutoFoo> void delegateSelectCursor(VendorConstraintNameAutoFooCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends VendorConstraintNameAutoFoo> List<ENTITY> delegateSelectList(VendorConstraintNameAutoFooCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(VendorConstraintNameAutoFoo e, InsertOption<VendorConstraintNameAutoFooCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(VendorConstraintNameAutoFoo e, UpdateOption<VendorConstraintNameAutoFooCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return delegateUpdateNonstrict(e, op); }
    protected int delegateUpdateNonstrict(VendorConstraintNameAutoFoo e, UpdateOption<VendorConstraintNameAutoFooCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(VendorConstraintNameAutoFoo e, DeleteOption<VendorConstraintNameAutoFooCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return delegateDeleteNonstrict(e, op); }
    protected int delegateDeleteNonstrict(VendorConstraintNameAutoFoo e, DeleteOption<VendorConstraintNameAutoFooCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<VendorConstraintNameAutoFoo> ls, InsertOption<VendorConstraintNameAutoFooCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<VendorConstraintNameAutoFoo> ls, UpdateOption<VendorConstraintNameAutoFooCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<VendorConstraintNameAutoFoo> ls, UpdateOption<VendorConstraintNameAutoFooCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<VendorConstraintNameAutoFoo> ls, DeleteOption<VendorConstraintNameAutoFooCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<VendorConstraintNameAutoFoo> ls, DeleteOption<VendorConstraintNameAutoFooCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(VendorConstraintNameAutoFoo e, VendorConstraintNameAutoFooCB inCB, ConditionBean resCB, InsertOption<VendorConstraintNameAutoFooCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(VendorConstraintNameAutoFoo e, VendorConstraintNameAutoFooCB cb, UpdateOption<VendorConstraintNameAutoFooCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(VendorConstraintNameAutoFooCB cb, DeleteOption<VendorConstraintNameAutoFooCB> op)
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
    protected VendorConstraintNameAutoFoo downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, VendorConstraintNameAutoFoo.class);
    }

    protected VendorConstraintNameAutoFooCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, VendorConstraintNameAutoFooCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<VendorConstraintNameAutoFoo> downcast(List<? extends Entity> entityList) {
        return (List<VendorConstraintNameAutoFoo>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<VendorConstraintNameAutoFooCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<VendorConstraintNameAutoFooCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<VendorConstraintNameAutoFooCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<VendorConstraintNameAutoFooCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<VendorConstraintNameAutoFooCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<VendorConstraintNameAutoFooCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<VendorConstraintNameAutoFoo, VendorConstraintNameAutoFooCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<VendorConstraintNameAutoFoo, VendorConstraintNameAutoFooCB>)option;
    }
}
