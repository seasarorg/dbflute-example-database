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
 * The behavior of VENDOR_LARGE_DATA_REF as TABLE. <br />
 * <pre>
 * [primary key]
 *     LARGE_DATA_REF_ID
 *
 * [column]
 *     LARGE_DATA_REF_ID, LARGE_DATA_ID, DATE_INDEX, DATE_NO_INDEX, TIMESTAMP_INDEX, TIMESTAMP_NO_INDEX, NULLABLE_DECIMAL_INDEX, NULLABLE_DECIMAL_NO_INDEX, SELF_PARENT_ID
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
 *     vendor_large_data, vendor_large_data_ref
 *
 * [referrer table]
 *     vendor_large_data_ref
 *
 * [foreign property]
 *     vendorLargeData, vendorLargeDataRefSelf
 *
 * [referrer property]
 *     vendorLargeDataRefSelfList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsVendorLargeDataRefBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "vendor_large_data_ref"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return VendorLargeDataRefDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public VendorLargeDataRefDbm getMyDBMeta() { return VendorLargeDataRefDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public VendorLargeDataRef newMyEntity() { return new VendorLargeDataRef(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public VendorLargeDataRefCB newMyConditionBean() { return new VendorLargeDataRefCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * VendorLargeDataRefCB cb = new VendorLargeDataRefCB();
     * cb.query().setFoo...(value);
     * int count = vendorLargeDataRefBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of VendorLargeDataRef. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(VendorLargeDataRefCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(VendorLargeDataRefCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(VendorLargeDataRefCB cb) { // called by selectPage(cb)
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
     * VendorLargeDataRefCB cb = new VendorLargeDataRefCB();
     * cb.query().setFoo...(value);
     * VendorLargeDataRef vendorLargeDataRef = vendorLargeDataRefBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (vendorLargeDataRef != null) {
     *     ... = vendorLargeDataRef.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of VendorLargeDataRef. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorLargeDataRef selectEntity(VendorLargeDataRefCB cb) {
        return doSelectEntity(cb, VendorLargeDataRef.class);
    }

    protected <ENTITY extends VendorLargeDataRef> ENTITY doSelectEntity(final VendorLargeDataRefCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, entityType, new InternalSelectEntityCallback<ENTITY, VendorLargeDataRefCB>() {
            public List<ENTITY> callbackSelectList(VendorLargeDataRefCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * VendorLargeDataRefCB cb = new VendorLargeDataRefCB();
     * cb.query().setFoo...(value);
     * VendorLargeDataRef vendorLargeDataRef = vendorLargeDataRefBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = vendorLargeDataRef.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of VendorLargeDataRef. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorLargeDataRef selectEntityWithDeletedCheck(VendorLargeDataRefCB cb) {
        return doSelectEntityWithDeletedCheck(cb, VendorLargeDataRef.class);
    }

    protected <ENTITY extends VendorLargeDataRef> ENTITY doSelectEntityWithDeletedCheck(final VendorLargeDataRefCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, entityType, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, VendorLargeDataRefCB>() {
            public List<ENTITY> callbackSelectList(VendorLargeDataRefCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param largeDataRefId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorLargeDataRef selectByPKValue(Long largeDataRefId) {
        return doSelectByPKValue(largeDataRefId, VendorLargeDataRef.class);
    }

    protected <ENTITY extends VendorLargeDataRef> ENTITY doSelectByPKValue(Long largeDataRefId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(largeDataRefId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param largeDataRefId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorLargeDataRef selectByPKValueWithDeletedCheck(Long largeDataRefId) {
        return doSelectByPKValueWithDeletedCheck(largeDataRefId, VendorLargeDataRef.class);
    }

    protected <ENTITY extends VendorLargeDataRef> ENTITY doSelectByPKValueWithDeletedCheck(Long largeDataRefId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(largeDataRefId), entityType);
    }

    private VendorLargeDataRefCB buildPKCB(Long largeDataRefId) {
        assertObjectNotNull("largeDataRefId", largeDataRefId);
        VendorLargeDataRefCB cb = newMyConditionBean();
        cb.query().setLargeDataRefId_Equal(largeDataRefId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * VendorLargeDataRefCB cb = new VendorLargeDataRefCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;VendorLargeDataRef&gt; vendorLargeDataRefList = vendorLargeDataRefBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (VendorLargeDataRef vendorLargeDataRef : vendorLargeDataRefList) {
     *     ... = vendorLargeDataRef.get...();
     * }
     * </pre>
     * @param cb The condition-bean of VendorLargeDataRef. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<VendorLargeDataRef> selectList(VendorLargeDataRefCB cb) {
        return doSelectList(cb, VendorLargeDataRef.class);
    }

    protected <ENTITY extends VendorLargeDataRef> ListResultBean<ENTITY> doSelectList(VendorLargeDataRefCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, VendorLargeDataRefCB>() {
            public List<ENTITY> callbackSelectList(VendorLargeDataRefCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * VendorLargeDataRefCB cb = new VendorLargeDataRefCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;VendorLargeDataRef&gt; page = vendorLargeDataRefBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (VendorLargeDataRef vendorLargeDataRef : page) {
     *     ... = vendorLargeDataRef.get...();
     * }
     * </pre>
     * @param cb The condition-bean of VendorLargeDataRef. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<VendorLargeDataRef> selectPage(VendorLargeDataRefCB cb) {
        return doSelectPage(cb, VendorLargeDataRef.class);
    }

    protected <ENTITY extends VendorLargeDataRef> PagingResultBean<ENTITY> doSelectPage(VendorLargeDataRefCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, VendorLargeDataRefCB>() {
            public int callbackSelectCount(VendorLargeDataRefCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(VendorLargeDataRefCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * VendorLargeDataRefCB cb = new VendorLargeDataRefCB();
     * cb.query().setFoo...(value);
     * vendorLargeDataRefBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;VendorLargeDataRef&gt;() {
     *     public void handle(VendorLargeDataRef entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of VendorLargeDataRef. (NotNull)
     * @param entityRowHandler The handler of entity row of VendorLargeDataRef. (NotNull)
     */
    public void selectCursor(VendorLargeDataRefCB cb, EntityRowHandler<VendorLargeDataRef> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, VendorLargeDataRef.class);
    }

    protected <ENTITY extends VendorLargeDataRef> void doSelectCursor(VendorLargeDataRefCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<VendorLargeDataRef>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        helpSelectCursorInternally(cb, entityRowHandler, entityType, new InternalSelectCursorCallback<ENTITY, VendorLargeDataRefCB>() {
            public void callbackSelectCursor(VendorLargeDataRefCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) { delegateSelectCursor(cb, entityRowHandler, entityType); }
            public List<ENTITY> callbackSelectList(VendorLargeDataRefCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * vendorLargeDataRefBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(VendorLargeDataRefCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<VendorLargeDataRefCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends VendorLargeDataRefCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
        assertObjectNotNull("resultType", resultType); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, resultType);
    }

    protected <RESULT, CB extends VendorLargeDataRefCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> resultType) {
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
     * @param vendorLargeDataRef The entity of vendorLargeDataRef. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadVendorLargeDataRefSelfList(VendorLargeDataRef vendorLargeDataRef, ConditionBeanSetupper<VendorLargeDataRefCB> conditionBeanSetupper) {
        xassLRArg(vendorLargeDataRef, conditionBeanSetupper);
        loadVendorLargeDataRefSelfList(xnewLRLs(vendorLargeDataRef), conditionBeanSetupper);
    }
    /**
     * Load referrer of vendorLargeDataRefSelfList with the set-upper for condition-bean of referrer. <br />
     * vendor_large_data_ref by SELF_PARENT_ID, named 'vendorLargeDataRefSelfList'.
     * <pre>
     * vendorLargeDataRefBhv.<span style="color: #FD4747">loadVendorLargeDataRefSelfList</span>(vendorLargeDataRefList, new ConditionBeanSetupper&lt;VendorLargeDataRefCB&gt;() {
     *     public void setup(VendorLargeDataRefCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (VendorLargeDataRef vendorLargeDataRef : vendorLargeDataRefList) {
     *     ... = vendorLargeDataRef.<span style="color: #FD4747">getVendorLargeDataRefSelfList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setSelfParentId_InScope(pkList);
     * cb.query().addOrderBy_SelfParentId_Asc();
     * </pre>
     * @param vendorLargeDataRefList The entity list of vendorLargeDataRef. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadVendorLargeDataRefSelfList(List<VendorLargeDataRef> vendorLargeDataRefList, ConditionBeanSetupper<VendorLargeDataRefCB> conditionBeanSetupper) {
        xassLRArg(vendorLargeDataRefList, conditionBeanSetupper);
        loadVendorLargeDataRefSelfList(vendorLargeDataRefList, new LoadReferrerOption<VendorLargeDataRefCB, VendorLargeDataRef>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param vendorLargeDataRef The entity of vendorLargeDataRef. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadVendorLargeDataRefSelfList(VendorLargeDataRef vendorLargeDataRef, LoadReferrerOption<VendorLargeDataRefCB, VendorLargeDataRef> loadReferrerOption) {
        xassLRArg(vendorLargeDataRef, loadReferrerOption);
        loadVendorLargeDataRefSelfList(xnewLRLs(vendorLargeDataRef), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param vendorLargeDataRefList The entity list of vendorLargeDataRef. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadVendorLargeDataRefSelfList(List<VendorLargeDataRef> vendorLargeDataRefList, LoadReferrerOption<VendorLargeDataRefCB, VendorLargeDataRef> loadReferrerOption) {
        xassLRArg(vendorLargeDataRefList, loadReferrerOption);
        if (vendorLargeDataRefList.isEmpty()) { return; }
        final VendorLargeDataRefBhv referrerBhv = xgetBSFLR().select(VendorLargeDataRefBhv.class);
        helpLoadReferrerInternally(vendorLargeDataRefList, loadReferrerOption, new InternalLoadReferrerCallback<VendorLargeDataRef, Long, VendorLargeDataRefCB, VendorLargeDataRef>() {
            public Long getPKVal(VendorLargeDataRef e)
            { return e.getLargeDataRefId(); }
            public void setRfLs(VendorLargeDataRef e, List<VendorLargeDataRef> ls)
            { e.setVendorLargeDataRefSelfList(ls); }
            public VendorLargeDataRefCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(VendorLargeDataRefCB cb, List<Long> ls)
            { cb.query().setSelfParentId_InScope(ls); }
            public void qyOdFKAsc(VendorLargeDataRefCB cb) { cb.query().addOrderBy_SelfParentId_Asc(); }
            public void spFKCol(VendorLargeDataRefCB cb) { cb.specify().columnSelfParentId(); }
            public List<VendorLargeDataRef> selRfLs(VendorLargeDataRefCB cb) { return referrerBhv.selectList(cb); }
            public Long getFKVal(VendorLargeDataRef e) { return e.getSelfParentId(); }
            public void setlcEt(VendorLargeDataRef re, VendorLargeDataRef le)
            { re.setVendorLargeDataRefSelf(le); }
            public String getRfPrNm() { return "vendorLargeDataRefSelfList"; }
        });
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'VendorLargeData'.
     * @param vendorLargeDataRefList The list of vendorLargeDataRef. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<VendorLargeData> pulloutVendorLargeData(List<VendorLargeDataRef> vendorLargeDataRefList) {
        return helpPulloutInternally(vendorLargeDataRefList, new InternalPulloutCallback<VendorLargeDataRef, VendorLargeData>() {
            public VendorLargeData getFr(VendorLargeDataRef e) { return e.getVendorLargeData(); }
            public boolean hasRf() { return true; }
            public void setRfLs(VendorLargeData e, List<VendorLargeDataRef> ls)
            { e.setVendorLargeDataRefList(ls); }
        });
    }
    /**
     * Pull out the list of foreign table 'VendorLargeDataRef'.
     * @param vendorLargeDataRefList The list of vendorLargeDataRef. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<VendorLargeDataRef> pulloutVendorLargeDataRefSelf(List<VendorLargeDataRef> vendorLargeDataRefList) {
        return helpPulloutInternally(vendorLargeDataRefList, new InternalPulloutCallback<VendorLargeDataRef, VendorLargeDataRef>() {
            public VendorLargeDataRef getFr(VendorLargeDataRef e) { return e.getVendorLargeDataRefSelf(); }
            public boolean hasRf() { return true; }
            public void setRfLs(VendorLargeDataRef e, List<VendorLargeDataRef> ls)
            { e.setVendorLargeDataRefSelfList(ls); }
        });
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key largeDataRefId.
     * @param vendorLargeDataRefList The list of vendorLargeDataRef. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractLargeDataRefIdList(List<VendorLargeDataRef> vendorLargeDataRefList) {
        return helpExtractListInternally(vendorLargeDataRefList, new InternalExtractCallback<VendorLargeDataRef, Long>() {
            public Long getCV(VendorLargeDataRef e) { return e.getLargeDataRefId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * VendorLargeDataRef vendorLargeDataRef = new VendorLargeDataRef();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorLargeDataRef.setFoo...(value);
     * vendorLargeDataRef.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorLargeDataRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorLargeDataRef.set...;</span>
     * vendorLargeDataRefBhv.<span style="color: #FD4747">insert</span>(vendorLargeDataRef);
     * ... = vendorLargeDataRef.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param vendorLargeDataRef The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(VendorLargeDataRef vendorLargeDataRef) {
        doInsert(vendorLargeDataRef, null);
    }

    protected void doInsert(VendorLargeDataRef vendorLargeDataRef, InsertOption<VendorLargeDataRefCB> option) {
        assertObjectNotNull("vendorLargeDataRef", vendorLargeDataRef);
        prepareInsertOption(option);
        delegateInsert(vendorLargeDataRef, option);
    }

    protected void prepareInsertOption(InsertOption<VendorLargeDataRefCB> option) {
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
     * VendorLargeDataRef vendorLargeDataRef = new VendorLargeDataRef();
     * vendorLargeDataRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorLargeDataRef.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorLargeDataRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorLargeDataRef.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * vendorLargeDataRef.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     vendorLargeDataRefBhv.<span style="color: #FD4747">update</span>(vendorLargeDataRef);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorLargeDataRef The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final VendorLargeDataRef vendorLargeDataRef) {
        doUpdate(vendorLargeDataRef, null);
    }

    protected void doUpdate(VendorLargeDataRef vendorLargeDataRef, final UpdateOption<VendorLargeDataRefCB> option) {
        assertObjectNotNull("vendorLargeDataRef", vendorLargeDataRef);
        prepareUpdateOption(option);
        helpUpdateInternally(vendorLargeDataRef, new InternalUpdateCallback<VendorLargeDataRef>() {
            public int callbackDelegateUpdate(VendorLargeDataRef entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<VendorLargeDataRefCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected VendorLargeDataRefCB createCBForVaryingUpdate() {
        VendorLargeDataRefCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected VendorLargeDataRefCB createCBForSpecifiedUpdate() {
        VendorLargeDataRefCB cb = newMyConditionBean();
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
     * @param vendorLargeDataRef The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(VendorLargeDataRef vendorLargeDataRef) {
        doInesrtOrUpdate(vendorLargeDataRef, null, null);
    }

    protected void doInesrtOrUpdate(VendorLargeDataRef vendorLargeDataRef, final InsertOption<VendorLargeDataRefCB> insertOption, final UpdateOption<VendorLargeDataRefCB> updateOption) {
        helpInsertOrUpdateInternally(vendorLargeDataRef, new InternalInsertOrUpdateCallback<VendorLargeDataRef, VendorLargeDataRefCB>() {
            public void callbackInsert(VendorLargeDataRef entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(VendorLargeDataRef entity) { doUpdate(entity, updateOption); }
            public VendorLargeDataRefCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(VendorLargeDataRefCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<VendorLargeDataRefCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<VendorLargeDataRefCB>() : updateOption;
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
     * VendorLargeDataRef vendorLargeDataRef = new VendorLargeDataRef();
     * vendorLargeDataRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * vendorLargeDataRef.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     vendorLargeDataRefBhv.<span style="color: #FD4747">delete</span>(vendorLargeDataRef);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorLargeDataRef The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(VendorLargeDataRef vendorLargeDataRef) {
        doDelete(vendorLargeDataRef, null);
    }

    protected void doDelete(VendorLargeDataRef vendorLargeDataRef, final DeleteOption<VendorLargeDataRefCB> option) {
        assertObjectNotNull("vendorLargeDataRef", vendorLargeDataRef);
        prepareDeleteOption(option);
        helpDeleteInternally(vendorLargeDataRef, new InternalDeleteCallback<VendorLargeDataRef>() {
            public int callbackDelegateDelete(VendorLargeDataRef entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<VendorLargeDataRefCB> option) {
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
     *     VendorLargeDataRef vendorLargeDataRef = new VendorLargeDataRef();
     *     vendorLargeDataRef.setFooName("foo");
     *     if (...) {
     *         vendorLargeDataRef.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     vendorLargeDataRefList.add(vendorLargeDataRef);
     * }
     * vendorLargeDataRefBhv.<span style="color: #FD4747">batchInsert</span>(vendorLargeDataRefList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param vendorLargeDataRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<VendorLargeDataRef> vendorLargeDataRefList) {
        InsertOption<VendorLargeDataRefCB> option = createInsertUpdateOption();
        return doBatchInsert(vendorLargeDataRefList, option);
    }

    protected int[] doBatchInsert(List<VendorLargeDataRef> vendorLargeDataRefList, InsertOption<VendorLargeDataRefCB> option) {
        assertObjectNotNull("vendorLargeDataRefList", vendorLargeDataRefList);
        prepareBatchInsertOption(vendorLargeDataRefList, option);
        return delegateBatchInsert(vendorLargeDataRefList, option);
    }

    protected void prepareBatchInsertOption(List<VendorLargeDataRef> vendorLargeDataRefList, InsertOption<VendorLargeDataRefCB> option) {
        option.xallowInsertColumnModifiedPropertiesFragmented();
        option.xacceptInsertColumnModifiedPropertiesIfNeeds(vendorLargeDataRefList);
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
     *     VendorLargeDataRef vendorLargeDataRef = new VendorLargeDataRef();
     *     vendorLargeDataRef.setFooName("foo");
     *     if (...) {
     *         vendorLargeDataRef.setFooPrice(123);
     *     } else {
     *         vendorLargeDataRef.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//vendorLargeDataRef.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     vendorLargeDataRefList.add(vendorLargeDataRef);
     * }
     * vendorLargeDataRefBhv.<span style="color: #FD4747">batchUpdate</span>(vendorLargeDataRefList);
     * </pre>
     * @param vendorLargeDataRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<VendorLargeDataRef> vendorLargeDataRefList) {
        UpdateOption<VendorLargeDataRefCB> option = createPlainUpdateOption();
        return doBatchUpdate(vendorLargeDataRefList, option);
    }

    protected int[] doBatchUpdate(List<VendorLargeDataRef> vendorLargeDataRefList, UpdateOption<VendorLargeDataRefCB> option) {
        assertObjectNotNull("vendorLargeDataRefList", vendorLargeDataRefList);
        prepareBatchUpdateOption(vendorLargeDataRefList, option);
        return delegateBatchUpdate(vendorLargeDataRefList, option);
    }

    protected void prepareBatchUpdateOption(List<VendorLargeDataRef> vendorLargeDataRefList, UpdateOption<VendorLargeDataRefCB> option) {
        option.xacceptUpdateColumnModifiedPropertiesIfNeeds(vendorLargeDataRefList);
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
     * vendorLargeDataRefBhv.<span style="color: #FD4747">batchUpdate</span>(vendorLargeDataRefList, new SpecifyQuery<VendorLargeDataRefCB>() {
     *     public void specify(VendorLargeDataRefCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * vendorLargeDataRefBhv.<span style="color: #FD4747">batchUpdate</span>(vendorLargeDataRefList, new SpecifyQuery<VendorLargeDataRefCB>() {
     *     public void specify(VendorLargeDataRefCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param vendorLargeDataRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<VendorLargeDataRef> vendorLargeDataRefList, SpecifyQuery<VendorLargeDataRefCB> updateColumnSpec) {
        return doBatchUpdate(vendorLargeDataRefList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        return doLumpModify(ls, option);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param vendorLargeDataRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<VendorLargeDataRef> vendorLargeDataRefList) {
        return doBatchDelete(vendorLargeDataRefList, null);
    }

    protected int[] doBatchDelete(List<VendorLargeDataRef> vendorLargeDataRefList, DeleteOption<VendorLargeDataRefCB> option) {
        assertObjectNotNull("vendorLargeDataRefList", vendorLargeDataRefList);
        prepareDeleteOption(option);
        return delegateBatchDelete(vendorLargeDataRefList, option);
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
     * vendorLargeDataRefBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;VendorLargeDataRef, VendorLargeDataRefCB&gt;() {
     *     public ConditionBean setup(vendorLargeDataRef entity, VendorLargeDataRefCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<VendorLargeDataRef, VendorLargeDataRefCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<VendorLargeDataRef, VendorLargeDataRefCB> setupper, InsertOption<VendorLargeDataRefCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        VendorLargeDataRef entity = new VendorLargeDataRef();
        VendorLargeDataRefCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected VendorLargeDataRefCB createCBForQueryInsert() {
        VendorLargeDataRefCB cb = newMyConditionBean();
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
     * VendorLargeDataRef vendorLargeDataRef = new VendorLargeDataRef();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorLargeDataRef.setPK...(value);</span>
     * vendorLargeDataRef.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorLargeDataRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorLargeDataRef.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorLargeDataRef.setVersionNo(value);</span>
     * VendorLargeDataRefCB cb = new VendorLargeDataRefCB();
     * cb.query().setFoo...(value);
     * vendorLargeDataRefBhv.<span style="color: #FD4747">queryUpdate</span>(vendorLargeDataRef, cb);
     * </pre>
     * @param vendorLargeDataRef The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of VendorLargeDataRef. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(VendorLargeDataRef vendorLargeDataRef, VendorLargeDataRefCB cb) {
        return doQueryUpdate(vendorLargeDataRef, cb, null);
    }

    protected int doQueryUpdate(VendorLargeDataRef vendorLargeDataRef, VendorLargeDataRefCB cb, UpdateOption<VendorLargeDataRefCB> option) {
        assertObjectNotNull("vendorLargeDataRef", vendorLargeDataRef); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(vendorLargeDataRef, cb, option) : 0;
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (VendorLargeDataRefCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (VendorLargeDataRefCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * VendorLargeDataRefCB cb = new VendorLargeDataRefCB();
     * cb.query().setFoo...(value);
     * vendorLargeDataRefBhv.<span style="color: #FD4747">queryDelete</span>(vendorLargeDataRef, cb);
     * </pre>
     * @param cb The condition-bean of VendorLargeDataRef. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(VendorLargeDataRefCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(VendorLargeDataRefCB cb, DeleteOption<VendorLargeDataRefCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, option) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((VendorLargeDataRefCB)cb); }
        else { return varyingQueryDelete((VendorLargeDataRefCB)cb, downcast(option)); }
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
     * VendorLargeDataRef vendorLargeDataRef = new VendorLargeDataRef();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorLargeDataRef.setFoo...(value);
     * vendorLargeDataRef.setBar...(value);
     * InsertOption<VendorLargeDataRefCB> option = new InsertOption<VendorLargeDataRefCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * vendorLargeDataRefBhv.<span style="color: #FD4747">varyingInsert</span>(vendorLargeDataRef, option);
     * ... = vendorLargeDataRef.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param vendorLargeDataRef The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(VendorLargeDataRef vendorLargeDataRef, InsertOption<VendorLargeDataRefCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(vendorLargeDataRef, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * VendorLargeDataRef vendorLargeDataRef = new VendorLargeDataRef();
     * vendorLargeDataRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorLargeDataRef.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * vendorLargeDataRef.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;VendorLargeDataRefCB&gt; option = new UpdateOption&lt;VendorLargeDataRefCB&gt;();
     *     option.self(new SpecifyQuery&lt;VendorLargeDataRefCB&gt;() {
     *         public void specify(VendorLargeDataRefCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     vendorLargeDataRefBhv.<span style="color: #FD4747">varyingUpdate</span>(vendorLargeDataRef, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorLargeDataRef The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(VendorLargeDataRef vendorLargeDataRef, UpdateOption<VendorLargeDataRefCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(vendorLargeDataRef, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param vendorLargeDataRef The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(VendorLargeDataRef vendorLargeDataRef, InsertOption<VendorLargeDataRefCB> insertOption, UpdateOption<VendorLargeDataRefCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(vendorLargeDataRef, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param vendorLargeDataRef The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(VendorLargeDataRef vendorLargeDataRef, DeleteOption<VendorLargeDataRefCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(vendorLargeDataRef, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param vendorLargeDataRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<VendorLargeDataRef> vendorLargeDataRefList, InsertOption<VendorLargeDataRefCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(vendorLargeDataRefList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param vendorLargeDataRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<VendorLargeDataRef> vendorLargeDataRefList, UpdateOption<VendorLargeDataRefCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(vendorLargeDataRefList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param vendorLargeDataRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<VendorLargeDataRef> vendorLargeDataRefList, DeleteOption<VendorLargeDataRefCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(vendorLargeDataRefList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<VendorLargeDataRef, VendorLargeDataRefCB> setupper, InsertOption<VendorLargeDataRefCB> option) {
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
     * VendorLargeDataRef vendorLargeDataRef = new VendorLargeDataRef();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorLargeDataRef.setPK...(value);</span>
     * vendorLargeDataRef.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorLargeDataRef.setVersionNo(value);</span>
     * VendorLargeDataRefCB cb = new VendorLargeDataRefCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;VendorLargeDataRefCB&gt; option = new UpdateOption&lt;VendorLargeDataRefCB&gt;();
     * option.self(new SpecifyQuery&lt;VendorLargeDataRefCB&gt;() {
     *     public void specify(VendorLargeDataRefCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * vendorLargeDataRefBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(vendorLargeDataRef, cb, option);
     * </pre>
     * @param vendorLargeDataRef The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of VendorLargeDataRef. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(VendorLargeDataRef vendorLargeDataRef, VendorLargeDataRefCB cb, UpdateOption<VendorLargeDataRefCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(vendorLargeDataRef, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of VendorLargeDataRef. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(VendorLargeDataRefCB cb, DeleteOption<VendorLargeDataRefCB> option) {
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
    public OutsideSqlBasicExecutor<VendorLargeDataRefBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(VendorLargeDataRefCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(VendorLargeDataRefCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends VendorLargeDataRef> void delegateSelectCursor(VendorLargeDataRefCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends VendorLargeDataRef> List<ENTITY> delegateSelectList(VendorLargeDataRefCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(VendorLargeDataRef e, InsertOption<VendorLargeDataRefCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(VendorLargeDataRef e, UpdateOption<VendorLargeDataRefCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return delegateUpdateNonstrict(e, op); }
    protected int delegateUpdateNonstrict(VendorLargeDataRef e, UpdateOption<VendorLargeDataRefCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(VendorLargeDataRef e, DeleteOption<VendorLargeDataRefCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return delegateDeleteNonstrict(e, op); }
    protected int delegateDeleteNonstrict(VendorLargeDataRef e, DeleteOption<VendorLargeDataRefCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<VendorLargeDataRef> ls, InsertOption<VendorLargeDataRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<VendorLargeDataRef> ls, UpdateOption<VendorLargeDataRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<VendorLargeDataRef> ls, UpdateOption<VendorLargeDataRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<VendorLargeDataRef> ls, DeleteOption<VendorLargeDataRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<VendorLargeDataRef> ls, DeleteOption<VendorLargeDataRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(VendorLargeDataRef e, VendorLargeDataRefCB inCB, ConditionBean resCB, InsertOption<VendorLargeDataRefCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(VendorLargeDataRef e, VendorLargeDataRefCB cb, UpdateOption<VendorLargeDataRefCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(VendorLargeDataRefCB cb, DeleteOption<VendorLargeDataRefCB> op)
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
    protected VendorLargeDataRef downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, VendorLargeDataRef.class);
    }

    protected VendorLargeDataRefCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, VendorLargeDataRefCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<VendorLargeDataRef> downcast(List<? extends Entity> entityList) {
        return (List<VendorLargeDataRef>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<VendorLargeDataRefCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<VendorLargeDataRefCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<VendorLargeDataRefCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<VendorLargeDataRefCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<VendorLargeDataRefCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<VendorLargeDataRefCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<VendorLargeDataRef, VendorLargeDataRefCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<VendorLargeDataRef, VendorLargeDataRefCB>)option;
    }
}
