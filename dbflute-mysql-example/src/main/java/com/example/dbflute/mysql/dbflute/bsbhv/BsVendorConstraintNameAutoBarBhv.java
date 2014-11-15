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
public abstract class BsVendorConstraintNameAutoBarBhv extends AbstractBehaviorWritable<VendorConstraintNameAutoBar, VendorConstraintNameAutoBarCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public VendorConstraintNameAutoBarDbm getDBMeta() { return VendorConstraintNameAutoBarDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public VendorConstraintNameAutoBarDbm getMyDBMeta() { return VendorConstraintNameAutoBarDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public VendorConstraintNameAutoBarCB newConditionBean() { return new VendorConstraintNameAutoBarCB(); }

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
     * int count = vendorConstraintNameAutoBarBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of VendorConstraintNameAutoBar. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(VendorConstraintNameAutoBarCB cb) {
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
     * VendorConstraintNameAutoBarCB cb = new VendorConstraintNameAutoBarCB();
     * cb.query().setFoo...(value);
     * VendorConstraintNameAutoBar vendorConstraintNameAutoBar = vendorConstraintNameAutoBarBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (vendorConstraintNameAutoBar != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = vendorConstraintNameAutoBar.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of VendorConstraintNameAutoBar. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorConstraintNameAutoBar selectEntity(VendorConstraintNameAutoBarCB cb) {
        return facadeSelectEntity(cb);
    }

    protected VendorConstraintNameAutoBar facadeSelectEntity(VendorConstraintNameAutoBarCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorConstraintNameAutoBar> OptionalEntity<ENTITY> doSelectOptionalEntity(VendorConstraintNameAutoBarCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * VendorConstraintNameAutoBarCB cb = new VendorConstraintNameAutoBarCB();
     * cb.query().setFoo...(value);
     * VendorConstraintNameAutoBar vendorConstraintNameAutoBar = vendorConstraintNameAutoBarBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = vendorConstraintNameAutoBar.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of VendorConstraintNameAutoBar. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorConstraintNameAutoBar selectEntityWithDeletedCheck(VendorConstraintNameAutoBarCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param constraintNameAutoBarId : PK, NotNull, DECIMAL(16). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorConstraintNameAutoBar selectByPKValue(Long constraintNameAutoBarId) {
        return facadeSelectByPKValue(constraintNameAutoBarId);
    }

    protected VendorConstraintNameAutoBar facadeSelectByPKValue(Long constraintNameAutoBarId) {
        return doSelectByPK(constraintNameAutoBarId, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorConstraintNameAutoBar> ENTITY doSelectByPK(Long constraintNameAutoBarId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(constraintNameAutoBarId), tp);
    }

    protected <ENTITY extends VendorConstraintNameAutoBar> OptionalEntity<ENTITY> doSelectOptionalByPK(Long constraintNameAutoBarId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(constraintNameAutoBarId, tp), constraintNameAutoBarId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param constraintNameAutoBarId : PK, NotNull, DECIMAL(16). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorConstraintNameAutoBar selectByPKValueWithDeletedCheck(Long constraintNameAutoBarId) {
        return doSelectByPKWithDeletedCheck(constraintNameAutoBarId, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorConstraintNameAutoBar> ENTITY doSelectByPKWithDeletedCheck(Long constraintNameAutoBarId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(constraintNameAutoBarId), tp);
    }

    protected VendorConstraintNameAutoBarCB xprepareCBAsPK(Long constraintNameAutoBarId) {
        assertObjectNotNull("constraintNameAutoBarId", constraintNameAutoBarId);
        return newConditionBean().acceptPK(constraintNameAutoBarId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param constraintNameAutoBarName : UQ, NotNull, VARCHAR(50). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<VendorConstraintNameAutoBar> selectByUniqueOf(String constraintNameAutoBarName) {
        return facadeSelectByUniqueOf(constraintNameAutoBarName);
    }

    protected OptionalEntity<VendorConstraintNameAutoBar> facadeSelectByUniqueOf(String constraintNameAutoBarName) {
        return doSelectByUniqueOf(constraintNameAutoBarName, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorConstraintNameAutoBar> OptionalEntity<ENTITY> doSelectByUniqueOf(String constraintNameAutoBarName, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(constraintNameAutoBarName), tp), constraintNameAutoBarName);
    }

    protected VendorConstraintNameAutoBarCB xprepareCBAsUniqueOf(String constraintNameAutoBarName) {
        assertObjectNotNull("constraintNameAutoBarName", constraintNameAutoBarName);
        return newConditionBean().acceptUniqueOf(constraintNameAutoBarName);
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
     * ListResultBean&lt;VendorConstraintNameAutoBar&gt; vendorConstraintNameAutoBarList = vendorConstraintNameAutoBarBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (VendorConstraintNameAutoBar vendorConstraintNameAutoBar : vendorConstraintNameAutoBarList) {
     *     ... = vendorConstraintNameAutoBar.get...();
     * }
     * </pre>
     * @param cb The condition-bean of VendorConstraintNameAutoBar. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<VendorConstraintNameAutoBar> selectList(VendorConstraintNameAutoBarCB cb) {
        return facadeSelectList(cb);
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
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;VendorConstraintNameAutoBar&gt; page = vendorConstraintNameAutoBarBhv.<span style="color: #DD4747">selectPage</span>(cb);
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
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<VendorConstraintNameAutoBar> selectPage(VendorConstraintNameAutoBarCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * VendorConstraintNameAutoBarCB cb = new VendorConstraintNameAutoBarCB();
     * cb.query().setFoo...(value);
     * vendorConstraintNameAutoBarBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;VendorConstraintNameAutoBar&gt;() {
     *     public void handle(VendorConstraintNameAutoBar entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of VendorConstraintNameAutoBar. (NotNull)
     * @param entityRowHandler The handler of entity row of VendorConstraintNameAutoBar. (NotNull)
     */
    public void selectCursor(VendorConstraintNameAutoBarCB cb, EntityRowHandler<VendorConstraintNameAutoBar> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * vendorConstraintNameAutoBarBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(VendorConstraintNameAutoBarCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<VendorConstraintNameAutoBarCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param vendorConstraintNameAutoBarList The entity list of vendorConstraintNameAutoBar. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<VendorConstraintNameAutoBar> vendorConstraintNameAutoBarList, ReferrerLoaderHandler<LoaderOfVendorConstraintNameAutoBar> handler) {
        xassLRArg(vendorConstraintNameAutoBarList, handler);
        handler.handle(new LoaderOfVendorConstraintNameAutoBar().ready(vendorConstraintNameAutoBarList, _behaviorSelector));
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
     * @param vendorConstraintNameAutoBar The entity of vendorConstraintNameAutoBar. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(VendorConstraintNameAutoBar vendorConstraintNameAutoBar, ReferrerLoaderHandler<LoaderOfVendorConstraintNameAutoBar> handler) {
        xassLRArg(vendorConstraintNameAutoBar, handler);
        handler.handle(new LoaderOfVendorConstraintNameAutoBar().ready(xnewLRAryLs(vendorConstraintNameAutoBar), _behaviorSelector));
    }

    /**
     * Load referrer of vendorConstraintNameAutoRefList by the set-upper of referrer. <br />
     * vendor_constraint_name_auto_ref by CONSTRAINT_NAME_AUTO_BAR_ID, named 'vendorConstraintNameAutoRefList'.
     * <pre>
     * vendorConstraintNameAutoBarBhv.<span style="color: #DD4747">loadVendorConstraintNameAutoRefList</span>(vendorConstraintNameAutoBarList, new ConditionBeanSetupper&lt;VendorConstraintNameAutoRefCB&gt;() {
     *     public void setup(VendorConstraintNameAutoRefCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (VendorConstraintNameAutoBar vendorConstraintNameAutoBar : vendorConstraintNameAutoBarList) {
     *     ... = vendorConstraintNameAutoBar.<span style="color: #DD4747">getVendorConstraintNameAutoRefList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setConstraintNameAutoBarId_InScope(pkList);
     * cb.query().addOrderBy_ConstraintNameAutoBarId_Asc();
     * </pre>
     * @param vendorConstraintNameAutoBarList The entity list of vendorConstraintNameAutoBar. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<VendorConstraintNameAutoRef> loadVendorConstraintNameAutoRefList(List<VendorConstraintNameAutoBar> vendorConstraintNameAutoBarList, ConditionBeanSetupper<VendorConstraintNameAutoRefCB> setupper) {
        xassLRArg(vendorConstraintNameAutoBarList, setupper);
        return doLoadVendorConstraintNameAutoRefList(vendorConstraintNameAutoBarList, new LoadReferrerOption<VendorConstraintNameAutoRefCB, VendorConstraintNameAutoRef>().xinit(setupper));
    }

    /**
     * Load referrer of vendorConstraintNameAutoRefList by the set-upper of referrer. <br />
     * vendor_constraint_name_auto_ref by CONSTRAINT_NAME_AUTO_BAR_ID, named 'vendorConstraintNameAutoRefList'.
     * <pre>
     * vendorConstraintNameAutoBarBhv.<span style="color: #DD4747">loadVendorConstraintNameAutoRefList</span>(vendorConstraintNameAutoBarList, new ConditionBeanSetupper&lt;VendorConstraintNameAutoRefCB&gt;() {
     *     public void setup(VendorConstraintNameAutoRefCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = vendorConstraintNameAutoBar.<span style="color: #DD4747">getVendorConstraintNameAutoRefList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setConstraintNameAutoBarId_InScope(pkList);
     * cb.query().addOrderBy_ConstraintNameAutoBarId_Asc();
     * </pre>
     * @param vendorConstraintNameAutoBar The entity of vendorConstraintNameAutoBar. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<VendorConstraintNameAutoRef> loadVendorConstraintNameAutoRefList(VendorConstraintNameAutoBar vendorConstraintNameAutoBar, ConditionBeanSetupper<VendorConstraintNameAutoRefCB> setupper) {
        xassLRArg(vendorConstraintNameAutoBar, setupper);
        return doLoadVendorConstraintNameAutoRefList(xnewLRLs(vendorConstraintNameAutoBar), new LoadReferrerOption<VendorConstraintNameAutoRefCB, VendorConstraintNameAutoRef>().xinit(setupper));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param vendorConstraintNameAutoBar The entity of vendorConstraintNameAutoBar. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<VendorConstraintNameAutoRef> loadVendorConstraintNameAutoRefList(VendorConstraintNameAutoBar vendorConstraintNameAutoBar, LoadReferrerOption<VendorConstraintNameAutoRefCB, VendorConstraintNameAutoRef> loadReferrerOption) {
        xassLRArg(vendorConstraintNameAutoBar, loadReferrerOption);
        return loadVendorConstraintNameAutoRefList(xnewLRLs(vendorConstraintNameAutoBar), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param vendorConstraintNameAutoBarList The entity list of vendorConstraintNameAutoBar. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<VendorConstraintNameAutoRef> loadVendorConstraintNameAutoRefList(List<VendorConstraintNameAutoBar> vendorConstraintNameAutoBarList, LoadReferrerOption<VendorConstraintNameAutoRefCB, VendorConstraintNameAutoRef> loadReferrerOption) {
        xassLRArg(vendorConstraintNameAutoBarList, loadReferrerOption);
        if (vendorConstraintNameAutoBarList.isEmpty()) { return (NestedReferrerListGateway<VendorConstraintNameAutoRef>)EMPTY_NREF_LGWAY; }
        return doLoadVendorConstraintNameAutoRefList(vendorConstraintNameAutoBarList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<VendorConstraintNameAutoRef> doLoadVendorConstraintNameAutoRefList(List<VendorConstraintNameAutoBar> vendorConstraintNameAutoBarList, LoadReferrerOption<VendorConstraintNameAutoRefCB, VendorConstraintNameAutoRef> option) {
        return helpLoadReferrerInternally(vendorConstraintNameAutoBarList, option, "vendorConstraintNameAutoRefList");
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
    public List<Long> extractConstraintNameAutoBarIdList(List<VendorConstraintNameAutoBar> vendorConstraintNameAutoBarList)
    { return helpExtractListInternally(vendorConstraintNameAutoBarList, "constraintNameAutoBarId"); }

    /**
     * Extract the value list of (single) unique key constraintNameAutoBarName.
     * @param vendorConstraintNameAutoBarList The list of vendorConstraintNameAutoBar. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractConstraintNameAutoBarNameList(List<VendorConstraintNameAutoBar> vendorConstraintNameAutoBarList)
    { return helpExtractListInternally(vendorConstraintNameAutoBarList, "constraintNameAutoBarName"); }

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
     * vendorConstraintNameAutoBarBhv.<span style="color: #DD4747">insert</span>(vendorConstraintNameAutoBar);
     * ... = vendorConstraintNameAutoBar.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param vendorConstraintNameAutoBar The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(VendorConstraintNameAutoBar vendorConstraintNameAutoBar) {
        doInsert(vendorConstraintNameAutoBar, null);
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
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendorConstraintNameAutoBar.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     vendorConstraintNameAutoBarBhv.<span style="color: #DD4747">update</span>(vendorConstraintNameAutoBar);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorConstraintNameAutoBar The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(VendorConstraintNameAutoBar vendorConstraintNameAutoBar) {
        doUpdate(vendorConstraintNameAutoBar, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param vendorConstraintNameAutoBar The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(VendorConstraintNameAutoBar vendorConstraintNameAutoBar) {
        doInsertOrUpdate(vendorConstraintNameAutoBar, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * VendorConstraintNameAutoBar vendorConstraintNameAutoBar = new VendorConstraintNameAutoBar();
     * vendorConstraintNameAutoBar.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendorConstraintNameAutoBar.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     vendorConstraintNameAutoBarBhv.<span style="color: #DD4747">delete</span>(vendorConstraintNameAutoBar);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorConstraintNameAutoBar The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(VendorConstraintNameAutoBar vendorConstraintNameAutoBar) {
        doDelete(vendorConstraintNameAutoBar, null);
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
     * vendorConstraintNameAutoBarBhv.<span style="color: #DD4747">batchInsert</span>(vendorConstraintNameAutoBarList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param vendorConstraintNameAutoBarList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<VendorConstraintNameAutoBar> vendorConstraintNameAutoBarList) {
        return doBatchInsert(vendorConstraintNameAutoBarList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
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
     * vendorConstraintNameAutoBarBhv.<span style="color: #DD4747">batchUpdate</span>(vendorConstraintNameAutoBarList);
     * </pre>
     * @param vendorConstraintNameAutoBarList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<VendorConstraintNameAutoBar> vendorConstraintNameAutoBarList) {
        return doBatchUpdate(vendorConstraintNameAutoBarList, null);
    }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * vendorConstraintNameAutoBarBhv.<span style="color: #DD4747">batchUpdate</span>(vendorConstraintNameAutoBarList, new SpecifyQuery<VendorConstraintNameAutoBarCB>() {
     *     public void specify(VendorConstraintNameAutoBarCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * vendorConstraintNameAutoBarBhv.<span style="color: #DD4747">batchUpdate</span>(vendorConstraintNameAutoBarList, new SpecifyQuery<VendorConstraintNameAutoBarCB>() {
     *     public void specify(VendorConstraintNameAutoBarCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
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
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<VendorConstraintNameAutoBar> vendorConstraintNameAutoBarList, SpecifyQuery<VendorConstraintNameAutoBarCB> updateColumnSpec) {
        return doBatchUpdate(vendorConstraintNameAutoBarList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param vendorConstraintNameAutoBarList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<VendorConstraintNameAutoBar> vendorConstraintNameAutoBarList) {
        return doBatchDelete(vendorConstraintNameAutoBarList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * vendorConstraintNameAutoBarBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;VendorConstraintNameAutoBar, VendorConstraintNameAutoBarCB&gt;() {
     *     public ConditionBean setup(VendorConstraintNameAutoBar entity, VendorConstraintNameAutoBarCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<VendorConstraintNameAutoBar, VendorConstraintNameAutoBarCB> setupper) {
        return doQueryInsert(setupper, null);
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
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoBar.setVersionNo(value);</span>
     * VendorConstraintNameAutoBarCB cb = new VendorConstraintNameAutoBarCB();
     * cb.query().setFoo...(value);
     * vendorConstraintNameAutoBarBhv.<span style="color: #DD4747">queryUpdate</span>(vendorConstraintNameAutoBar, cb);
     * </pre>
     * @param vendorConstraintNameAutoBar The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of VendorConstraintNameAutoBar. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(VendorConstraintNameAutoBar vendorConstraintNameAutoBar, VendorConstraintNameAutoBarCB cb) {
        return doQueryUpdate(vendorConstraintNameAutoBar, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * VendorConstraintNameAutoBarCB cb = new VendorConstraintNameAutoBarCB();
     * cb.query().setFoo...(value);
     * vendorConstraintNameAutoBarBhv.<span style="color: #DD4747">queryDelete</span>(vendorConstraintNameAutoBar, cb);
     * </pre>
     * @param cb The condition-bean of VendorConstraintNameAutoBar. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(VendorConstraintNameAutoBarCB cb) {
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
     * VendorConstraintNameAutoBar vendorConstraintNameAutoBar = new VendorConstraintNameAutoBar();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorConstraintNameAutoBar.setFoo...(value);
     * vendorConstraintNameAutoBar.setBar...(value);
     * InsertOption<VendorConstraintNameAutoBarCB> option = new InsertOption<VendorConstraintNameAutoBarCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * vendorConstraintNameAutoBarBhv.<span style="color: #DD4747">varyingInsert</span>(vendorConstraintNameAutoBar, option);
     * ... = vendorConstraintNameAutoBar.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param vendorConstraintNameAutoBar The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
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
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendorConstraintNameAutoBar.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;VendorConstraintNameAutoBarCB&gt; option = new UpdateOption&lt;VendorConstraintNameAutoBarCB&gt;();
     *     option.self(new SpecifyQuery&lt;VendorConstraintNameAutoBarCB&gt;() {
     *         public void specify(VendorConstraintNameAutoBarCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     vendorConstraintNameAutoBarBhv.<span style="color: #DD4747">varyingUpdate</span>(vendorConstraintNameAutoBar, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorConstraintNameAutoBar The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(VendorConstraintNameAutoBar vendorConstraintNameAutoBar, UpdateOption<VendorConstraintNameAutoBarCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(vendorConstraintNameAutoBar, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param vendorConstraintNameAutoBar The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(VendorConstraintNameAutoBar vendorConstraintNameAutoBar, InsertOption<VendorConstraintNameAutoBarCB> insertOption, UpdateOption<VendorConstraintNameAutoBarCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdate(vendorConstraintNameAutoBar, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param vendorConstraintNameAutoBar The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
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
     * @param setupper The set-upper of query-insert. (NotNull)
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
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoBar.setVersionNo(value);</span>
     * VendorConstraintNameAutoBarCB cb = new VendorConstraintNameAutoBarCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;VendorConstraintNameAutoBarCB&gt; option = new UpdateOption&lt;VendorConstraintNameAutoBarCB&gt;();
     * option.self(new SpecifyQuery&lt;VendorConstraintNameAutoBarCB&gt;() {
     *     public void specify(VendorConstraintNameAutoBarCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * vendorConstraintNameAutoBarBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(vendorConstraintNameAutoBar, cb, option);
     * </pre>
     * @param vendorConstraintNameAutoBar The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of VendorConstraintNameAutoBar. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
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
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
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
        OutsideSqlAllFacadeExecutor<VendorConstraintNameAutoBarBhv> facadeExecutor = doOutsideSql();
        return facadeExecutor.xbasicExecutor(); // variable to resolve generic type
    }

    // ===================================================================================
    //                                                                         Hyper Patch
    //                                                                         ===========
    @Override
    protected <RESULT extends VendorConstraintNameAutoBar> org.seasar.dbflute.bhv.core.command.SelectListCBCommand<RESULT> newSelectListCBCommand() {
        return new com.example.dbflute.mysql.dbflute.allcommon.DBFluteConfig.SelectListCBCommandHyperPatch<RESULT>();
    }

    @Override
    protected <RESULT extends VendorConstraintNameAutoBar> org.seasar.dbflute.bhv.core.command.SelectCursorCBCommand<RESULT> newSelectCursorCBCommand() {
        return new com.example.dbflute.mysql.dbflute.allcommon.DBFluteConfig.SelectCursorCBCommandHyperPatch<RESULT>();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends VendorConstraintNameAutoBar> typeOfSelectedEntity() { return VendorConstraintNameAutoBar.class; }
    protected Class<VendorConstraintNameAutoBar> typeOfHandlingEntity() { return VendorConstraintNameAutoBar.class; }
    protected Class<VendorConstraintNameAutoBarCB> typeOfHandlingConditionBean() { return VendorConstraintNameAutoBarCB.class; }
}
