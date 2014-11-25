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
import org.seasar.dbflute.cbean.chelper.HpSLSFunction;
import org.seasar.dbflute.exception.*;
import org.seasar.dbflute.optional.OptionalEntity;
import org.seasar.dbflute.outsidesql.executor.*;
import com.example.dbflute.mysql.dbflute.exbhv.*;
import com.example.dbflute.mysql.dbflute.bsbhv.loader.*;
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
public abstract class BsVendorLargeDataRefBhv extends AbstractBehaviorWritable<VendorLargeDataRef, VendorLargeDataRefCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /** Large Data with AutoPaging */
    public static final String PATH_whitebox_vendorcheck_selectLargeAutoPaging = "whitebox:vendorcheck:selectLargeAutoPaging";
    /** Large Data with ManualPaging */
    public static final String PATH_whitebox_vendorcheck_selectLargeManualPaging = "whitebox:vendorcheck:selectLargeManualPaging";
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public VendorLargeDataRefDbm getDBMeta() { return VendorLargeDataRefDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public VendorLargeDataRefDbm getMyDBMeta() { return VendorLargeDataRefDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public VendorLargeDataRefCB newConditionBean() { return new VendorLargeDataRefCB(); }

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
     * int count = vendorLargeDataRefBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of VendorLargeDataRef. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(VendorLargeDataRefCB cb) {
        return facadeSelectCount(cb);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean. #beforejava8 <br />
     * <span style="color: #AD4747; font-size: 120%">The return might be null if no data, so you should have null check.</span> <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, use selectEntityWithDeletedCheck().</span>
     * <pre>
     * VendorLargeDataRefCB cb = new VendorLargeDataRefCB();
     * cb.query().setFoo...(value);
     * VendorLargeDataRef vendorLargeDataRef = vendorLargeDataRefBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (vendorLargeDataRef != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = vendorLargeDataRef.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of VendorLargeDataRef. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorLargeDataRef selectEntity(VendorLargeDataRefCB cb) {
        return facadeSelectEntity(cb);
    }

    protected VendorLargeDataRef facadeSelectEntity(VendorLargeDataRefCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorLargeDataRef> OptionalEntity<ENTITY> doSelectOptionalEntity(VendorLargeDataRefCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * VendorLargeDataRefCB cb = new VendorLargeDataRefCB();
     * cb.query().setFoo...(value);
     * VendorLargeDataRef vendorLargeDataRef = vendorLargeDataRefBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = vendorLargeDataRef.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of VendorLargeDataRef. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorLargeDataRef selectEntityWithDeletedCheck(VendorLargeDataRefCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param largeDataRefId : PK, NotNull, BIGINT(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorLargeDataRef selectByPKValue(Long largeDataRefId) {
        return facadeSelectByPKValue(largeDataRefId);
    }

    protected VendorLargeDataRef facadeSelectByPKValue(Long largeDataRefId) {
        return doSelectByPK(largeDataRefId, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorLargeDataRef> ENTITY doSelectByPK(Long largeDataRefId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(largeDataRefId), tp);
    }

    protected <ENTITY extends VendorLargeDataRef> OptionalEntity<ENTITY> doSelectOptionalByPK(Long largeDataRefId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(largeDataRefId, tp), largeDataRefId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param largeDataRefId : PK, NotNull, BIGINT(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorLargeDataRef selectByPKValueWithDeletedCheck(Long largeDataRefId) {
        return doSelectByPKWithDeletedCheck(largeDataRefId, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorLargeDataRef> ENTITY doSelectByPKWithDeletedCheck(Long largeDataRefId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(largeDataRefId), tp);
    }

    protected VendorLargeDataRefCB xprepareCBAsPK(Long largeDataRefId) {
        assertObjectNotNull("largeDataRefId", largeDataRefId);
        return newConditionBean().acceptPK(largeDataRefId);
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
     * ListResultBean&lt;VendorLargeDataRef&gt; vendorLargeDataRefList = vendorLargeDataRefBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (VendorLargeDataRef vendorLargeDataRef : vendorLargeDataRefList) {
     *     ... = vendorLargeDataRef.get...();
     * }
     * </pre>
     * @param cb The condition-bean of VendorLargeDataRef. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<VendorLargeDataRef> selectList(VendorLargeDataRefCB cb) {
        return facadeSelectList(cb);
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
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;VendorLargeDataRef&gt; page = vendorLargeDataRefBhv.<span style="color: #DD4747">selectPage</span>(cb);
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
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<VendorLargeDataRef> selectPage(VendorLargeDataRefCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * VendorLargeDataRefCB cb = new VendorLargeDataRefCB();
     * cb.query().setFoo...(value);
     * vendorLargeDataRefBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;VendorLargeDataRef&gt;() {
     *     public void handle(VendorLargeDataRef entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of VendorLargeDataRef. (NotNull)
     * @param entityRowHandler The handler of entity row of VendorLargeDataRef. (NotNull)
     */
    public void selectCursor(VendorLargeDataRefCB cb, EntityRowHandler<VendorLargeDataRef> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * vendorLargeDataRefBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(VendorLargeDataRefCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<VendorLargeDataRefCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
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
     * Load referrer by the the referrer loader. <br />
     * <pre>
     * MemberCB cb = new MemberCB();
     * cb.query().set...
     * List&lt;Member&gt; memberList = memberBhv.selectList(cb);
     * memberBhv.<span style="color: #DD4747">load</span>(memberList, loader -&gt; {
     *     loader.<span style="color: #DD4747">loadPurchaseList</span>(purchaseCB -&gt; {
     *         purchaseCB.query().set...
     *         purchaseCB.query().addOrderBy_PurchasePrice_Desc();
     *     }); <span style="color: #3F7E5E">// you can also load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedList(purchaseLoader -&gt {</span>
     *     <span style="color: #3F7E5E">//    purchaseLoader.loadPurchasePaymentList(...);</span>
     *     <span style="color: #3F7E5E">//});</span>
     *
     *     <span style="color: #3F7E5E">// you can also pull out foreign table and load its referrer</span>
     *     <span style="color: #3F7E5E">// (setupSelect of the foreign table should be called)</span>
     *     <span style="color: #3F7E5E">//loader.pulloutMemberStatus().loadMemberLoginList(...)</span>
     * }
     * for (Member member : memberList) {
     *     List&lt;Purchase&gt; purchaseList = member.<span style="color: #DD4747">getPurchaseList()</span>;
     *     for (Purchase purchase : purchaseList) {
     *         ...
     *     }
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param vendorLargeDataRefList The entity list of vendorLargeDataRef. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<VendorLargeDataRef> vendorLargeDataRefList, ReferrerLoaderHandler<LoaderOfVendorLargeDataRef> handler) {
        xassLRArg(vendorLargeDataRefList, handler);
        handler.handle(new LoaderOfVendorLargeDataRef().ready(vendorLargeDataRefList, _behaviorSelector));
    }

    /**
     * Load referrer of ${referrer.referrerJavaBeansRulePropertyName} by the referrer loader. <br />
     * <pre>
     * MemberCB cb = new MemberCB();
     * cb.query().set...
     * Member member = memberBhv.selectEntityWithDeletedCheck(cb);
     * memberBhv.<span style="color: #DD4747">load</span>(member, loader -&gt; {
     *     loader.<span style="color: #DD4747">loadPurchaseList</span>(purchaseCB -&gt; {
     *         purchaseCB.query().set...
     *         purchaseCB.query().addOrderBy_PurchasePrice_Desc();
     *     }); <span style="color: #3F7E5E">// you can also load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedList(purchaseLoader -&gt {</span>
     *     <span style="color: #3F7E5E">//    purchaseLoader.loadPurchasePaymentList(...);</span>
     *     <span style="color: #3F7E5E">//});</span>
     *
     *     <span style="color: #3F7E5E">// you can also pull out foreign table and load its referrer</span>
     *     <span style="color: #3F7E5E">// (setupSelect of the foreign table should be called)</span>
     *     <span style="color: #3F7E5E">//loader.pulloutMemberStatus().loadMemberLoginList(...)</span>
     * }
     * for (Member member : memberList) {
     *     List&lt;Purchase&gt; purchaseList = member.<span style="color: #DD4747">getPurchaseList()</span>;
     *     for (Purchase purchase : purchaseList) {
     *         ...
     *     }
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param vendorLargeDataRef The entity of vendorLargeDataRef. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(VendorLargeDataRef vendorLargeDataRef, ReferrerLoaderHandler<LoaderOfVendorLargeDataRef> handler) {
        xassLRArg(vendorLargeDataRef, handler);
        handler.handle(new LoaderOfVendorLargeDataRef().ready(xnewLRAryLs(vendorLargeDataRef), _behaviorSelector));
    }

    /**
     * Load referrer of vendorLargeDataRefSelfList by the set-upper of referrer. <br />
     * vendor_large_data_ref by SELF_PARENT_ID, named 'vendorLargeDataRefSelfList'.
     * <pre>
     * vendorLargeDataRefBhv.<span style="color: #DD4747">loadVendorLargeDataRefSelfList</span>(vendorLargeDataRefList, new ConditionBeanSetupper&lt;VendorLargeDataRefCB&gt;() {
     *     public void setup(VendorLargeDataRefCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (VendorLargeDataRef vendorLargeDataRef : vendorLargeDataRefList) {
     *     ... = vendorLargeDataRef.<span style="color: #DD4747">getVendorLargeDataRefSelfList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSelfParentId_InScope(pkList);
     * cb.query().addOrderBy_SelfParentId_Asc();
     * </pre>
     * @param vendorLargeDataRefList The entity list of vendorLargeDataRef. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<VendorLargeDataRef> loadVendorLargeDataRefSelfList(List<VendorLargeDataRef> vendorLargeDataRefList, ConditionBeanSetupper<VendorLargeDataRefCB> setupper) {
        xassLRArg(vendorLargeDataRefList, setupper);
        return doLoadVendorLargeDataRefSelfList(vendorLargeDataRefList, new LoadReferrerOption<VendorLargeDataRefCB, VendorLargeDataRef>().xinit(setupper));
    }

    /**
     * Load referrer of vendorLargeDataRefSelfList by the set-upper of referrer. <br />
     * vendor_large_data_ref by SELF_PARENT_ID, named 'vendorLargeDataRefSelfList'.
     * <pre>
     * vendorLargeDataRefBhv.<span style="color: #DD4747">loadVendorLargeDataRefSelfList</span>(vendorLargeDataRefList, new ConditionBeanSetupper&lt;VendorLargeDataRefCB&gt;() {
     *     public void setup(VendorLargeDataRefCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = vendorLargeDataRef.<span style="color: #DD4747">getVendorLargeDataRefSelfList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSelfParentId_InScope(pkList);
     * cb.query().addOrderBy_SelfParentId_Asc();
     * </pre>
     * @param vendorLargeDataRef The entity of vendorLargeDataRef. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<VendorLargeDataRef> loadVendorLargeDataRefSelfList(VendorLargeDataRef vendorLargeDataRef, ConditionBeanSetupper<VendorLargeDataRefCB> setupper) {
        xassLRArg(vendorLargeDataRef, setupper);
        return doLoadVendorLargeDataRefSelfList(xnewLRLs(vendorLargeDataRef), new LoadReferrerOption<VendorLargeDataRefCB, VendorLargeDataRef>().xinit(setupper));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param vendorLargeDataRef The entity of vendorLargeDataRef. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<VendorLargeDataRef> loadVendorLargeDataRefSelfList(VendorLargeDataRef vendorLargeDataRef, LoadReferrerOption<VendorLargeDataRefCB, VendorLargeDataRef> loadReferrerOption) {
        xassLRArg(vendorLargeDataRef, loadReferrerOption);
        return loadVendorLargeDataRefSelfList(xnewLRLs(vendorLargeDataRef), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param vendorLargeDataRefList The entity list of vendorLargeDataRef. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<VendorLargeDataRef> loadVendorLargeDataRefSelfList(List<VendorLargeDataRef> vendorLargeDataRefList, LoadReferrerOption<VendorLargeDataRefCB, VendorLargeDataRef> loadReferrerOption) {
        xassLRArg(vendorLargeDataRefList, loadReferrerOption);
        if (vendorLargeDataRefList.isEmpty()) { return (NestedReferrerListGateway<VendorLargeDataRef>)EMPTY_NREF_LGWAY; }
        return doLoadVendorLargeDataRefSelfList(vendorLargeDataRefList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<VendorLargeDataRef> doLoadVendorLargeDataRefSelfList(List<VendorLargeDataRef> vendorLargeDataRefList, LoadReferrerOption<VendorLargeDataRefCB, VendorLargeDataRef> option) {
        return helpLoadReferrerInternally(vendorLargeDataRefList, option, "vendorLargeDataRefSelfList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'VendorLargeData'.
     * @param vendorLargeDataRefList The list of vendorLargeDataRef. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<VendorLargeData> pulloutVendorLargeData(List<VendorLargeDataRef> vendorLargeDataRefList)
    { return helpPulloutInternally(vendorLargeDataRefList, "vendorLargeData"); }

    /**
     * Pull out the list of foreign table 'VendorLargeDataRef'.
     * @param vendorLargeDataRefList The list of vendorLargeDataRef. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<VendorLargeDataRef> pulloutVendorLargeDataRefSelf(List<VendorLargeDataRef> vendorLargeDataRefList)
    { return helpPulloutInternally(vendorLargeDataRefList, "vendorLargeDataRefSelf"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key largeDataRefId.
     * @param vendorLargeDataRefList The list of vendorLargeDataRef. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractLargeDataRefIdList(List<VendorLargeDataRef> vendorLargeDataRefList)
    { return helpExtractListInternally(vendorLargeDataRefList, "largeDataRefId"); }

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
     * vendorLargeDataRefBhv.<span style="color: #DD4747">insert</span>(vendorLargeDataRef);
     * ... = vendorLargeDataRef.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param vendorLargeDataRef The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(VendorLargeDataRef vendorLargeDataRef) {
        doInsert(vendorLargeDataRef, null);
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
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendorLargeDataRef.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     vendorLargeDataRefBhv.<span style="color: #DD4747">update</span>(vendorLargeDataRef);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorLargeDataRef The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(VendorLargeDataRef vendorLargeDataRef) {
        doUpdate(vendorLargeDataRef, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param vendorLargeDataRef The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(VendorLargeDataRef vendorLargeDataRef) {
        doInsertOrUpdate(vendorLargeDataRef, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * VendorLargeDataRef vendorLargeDataRef = new VendorLargeDataRef();
     * vendorLargeDataRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendorLargeDataRef.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     vendorLargeDataRefBhv.<span style="color: #DD4747">delete</span>(vendorLargeDataRef);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorLargeDataRef The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(VendorLargeDataRef vendorLargeDataRef) {
        doDelete(vendorLargeDataRef, null);
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
     * vendorLargeDataRefBhv.<span style="color: #DD4747">batchInsert</span>(vendorLargeDataRefList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param vendorLargeDataRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<VendorLargeDataRef> vendorLargeDataRefList) {
        return doBatchInsert(vendorLargeDataRefList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
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
     * vendorLargeDataRefBhv.<span style="color: #DD4747">batchUpdate</span>(vendorLargeDataRefList);
     * </pre>
     * @param vendorLargeDataRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<VendorLargeDataRef> vendorLargeDataRefList) {
        return doBatchUpdate(vendorLargeDataRefList, null);
    }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * vendorLargeDataRefBhv.<span style="color: #DD4747">batchUpdate</span>(vendorLargeDataRefList, new SpecifyQuery<VendorLargeDataRefCB>() {
     *     public void specify(VendorLargeDataRefCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * vendorLargeDataRefBhv.<span style="color: #DD4747">batchUpdate</span>(vendorLargeDataRefList, new SpecifyQuery<VendorLargeDataRefCB>() {
     *     public void specify(VendorLargeDataRefCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
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
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<VendorLargeDataRef> vendorLargeDataRefList, SpecifyQuery<VendorLargeDataRefCB> updateColumnSpec) {
        return doBatchUpdate(vendorLargeDataRefList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param vendorLargeDataRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<VendorLargeDataRef> vendorLargeDataRefList) {
        return doBatchDelete(vendorLargeDataRefList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * vendorLargeDataRefBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;VendorLargeDataRef, VendorLargeDataRefCB&gt;() {
     *     public ConditionBean setup(VendorLargeDataRef entity, VendorLargeDataRefCB intoCB) {
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
     *         <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     *         <span style="color: #3F7E5E">//entity.setVersionNo(value);</span>
     *
     *         return cb;
     *     }
     * });
     * </pre>
     * @param setupper The set-upper of query-insert. (NotNull)
     * @return The inserted count.
     */
    public int queryInsert(QueryInsertSetupper<VendorLargeDataRef, VendorLargeDataRefCB> setupper) {
        return doQueryInsert(setupper, null);
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
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorLargeDataRef.setVersionNo(value);</span>
     * VendorLargeDataRefCB cb = new VendorLargeDataRefCB();
     * cb.query().setFoo...(value);
     * vendorLargeDataRefBhv.<span style="color: #DD4747">queryUpdate</span>(vendorLargeDataRef, cb);
     * </pre>
     * @param vendorLargeDataRef The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of VendorLargeDataRef. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(VendorLargeDataRef vendorLargeDataRef, VendorLargeDataRefCB cb) {
        return doQueryUpdate(vendorLargeDataRef, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * VendorLargeDataRefCB cb = new VendorLargeDataRefCB();
     * cb.query().setFoo...(value);
     * vendorLargeDataRefBhv.<span style="color: #DD4747">queryDelete</span>(vendorLargeDataRef, cb);
     * </pre>
     * @param cb The condition-bean of VendorLargeDataRef. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(VendorLargeDataRefCB cb) {
        return doQueryDelete(cb, null);
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
     * vendorLargeDataRefBhv.<span style="color: #DD4747">varyingInsert</span>(vendorLargeDataRef, option);
     * ... = vendorLargeDataRef.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param vendorLargeDataRef The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
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
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendorLargeDataRef.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;VendorLargeDataRefCB&gt; option = new UpdateOption&lt;VendorLargeDataRefCB&gt;();
     *     option.self(new SpecifyQuery&lt;VendorLargeDataRefCB&gt;() {
     *         public void specify(VendorLargeDataRefCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     vendorLargeDataRefBhv.<span style="color: #DD4747">varyingUpdate</span>(vendorLargeDataRef, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorLargeDataRef The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(VendorLargeDataRef vendorLargeDataRef, UpdateOption<VendorLargeDataRefCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(vendorLargeDataRef, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param vendorLargeDataRef The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(VendorLargeDataRef vendorLargeDataRef, InsertOption<VendorLargeDataRefCB> insertOption, UpdateOption<VendorLargeDataRefCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdate(vendorLargeDataRef, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param vendorLargeDataRef The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
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
     * @param setupper The set-upper of query-insert. (NotNull)
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
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorLargeDataRef.setVersionNo(value);</span>
     * VendorLargeDataRefCB cb = new VendorLargeDataRefCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;VendorLargeDataRefCB&gt; option = new UpdateOption&lt;VendorLargeDataRefCB&gt;();
     * option.self(new SpecifyQuery&lt;VendorLargeDataRefCB&gt;() {
     *     public void specify(VendorLargeDataRefCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * vendorLargeDataRefBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(vendorLargeDataRef, cb, option);
     * </pre>
     * @param vendorLargeDataRef The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of VendorLargeDataRef. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(VendorLargeDataRef vendorLargeDataRef, VendorLargeDataRefCB cb, UpdateOption<VendorLargeDataRefCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(vendorLargeDataRef, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of VendorLargeDataRef. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
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
        OutsideSqlAllFacadeExecutor<VendorLargeDataRefBhv> facadeExecutor = doOutsideSql();
        return facadeExecutor.xbasicExecutor(); // variable to resolve generic type
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends VendorLargeDataRef> typeOfSelectedEntity() { return VendorLargeDataRef.class; }
    protected Class<VendorLargeDataRef> typeOfHandlingEntity() { return VendorLargeDataRef.class; }
    protected Class<VendorLargeDataRefCB> typeOfHandlingConditionBean() { return VendorLargeDataRefCB.class; }
}
