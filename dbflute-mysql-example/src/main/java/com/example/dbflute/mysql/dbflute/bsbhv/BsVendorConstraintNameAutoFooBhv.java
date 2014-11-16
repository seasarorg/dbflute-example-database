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
public abstract class BsVendorConstraintNameAutoFooBhv extends AbstractBehaviorWritable<VendorConstraintNameAutoFoo, VendorConstraintNameAutoFooCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public VendorConstraintNameAutoFooDbm getDBMeta() { return VendorConstraintNameAutoFooDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public VendorConstraintNameAutoFooDbm getMyDBMeta() { return VendorConstraintNameAutoFooDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public VendorConstraintNameAutoFooCB newConditionBean() { return new VendorConstraintNameAutoFooCB(); }

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
     * int count = vendorConstraintNameAutoFooBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of VendorConstraintNameAutoFoo. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(VendorConstraintNameAutoFooCB cb) {
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
     * VendorConstraintNameAutoFooCB cb = new VendorConstraintNameAutoFooCB();
     * cb.query().setFoo...(value);
     * VendorConstraintNameAutoFoo vendorConstraintNameAutoFoo = vendorConstraintNameAutoFooBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (vendorConstraintNameAutoFoo != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = vendorConstraintNameAutoFoo.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of VendorConstraintNameAutoFoo. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorConstraintNameAutoFoo selectEntity(VendorConstraintNameAutoFooCB cb) {
        return facadeSelectEntity(cb);
    }

    protected VendorConstraintNameAutoFoo facadeSelectEntity(VendorConstraintNameAutoFooCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorConstraintNameAutoFoo> OptionalEntity<ENTITY> doSelectOptionalEntity(VendorConstraintNameAutoFooCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * VendorConstraintNameAutoFooCB cb = new VendorConstraintNameAutoFooCB();
     * cb.query().setFoo...(value);
     * VendorConstraintNameAutoFoo vendorConstraintNameAutoFoo = vendorConstraintNameAutoFooBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = vendorConstraintNameAutoFoo.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of VendorConstraintNameAutoFoo. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorConstraintNameAutoFoo selectEntityWithDeletedCheck(VendorConstraintNameAutoFooCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param constraintNameAutoFooId : PK, NotNull, DECIMAL(16). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorConstraintNameAutoFoo selectByPKValue(Long constraintNameAutoFooId) {
        return facadeSelectByPKValue(constraintNameAutoFooId);
    }

    protected VendorConstraintNameAutoFoo facadeSelectByPKValue(Long constraintNameAutoFooId) {
        return doSelectByPK(constraintNameAutoFooId, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorConstraintNameAutoFoo> ENTITY doSelectByPK(Long constraintNameAutoFooId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(constraintNameAutoFooId), tp);
    }

    protected <ENTITY extends VendorConstraintNameAutoFoo> OptionalEntity<ENTITY> doSelectOptionalByPK(Long constraintNameAutoFooId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(constraintNameAutoFooId, tp), constraintNameAutoFooId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param constraintNameAutoFooId : PK, NotNull, DECIMAL(16). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorConstraintNameAutoFoo selectByPKValueWithDeletedCheck(Long constraintNameAutoFooId) {
        return doSelectByPKWithDeletedCheck(constraintNameAutoFooId, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorConstraintNameAutoFoo> ENTITY doSelectByPKWithDeletedCheck(Long constraintNameAutoFooId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(constraintNameAutoFooId), tp);
    }

    protected VendorConstraintNameAutoFooCB xprepareCBAsPK(Long constraintNameAutoFooId) {
        assertObjectNotNull("constraintNameAutoFooId", constraintNameAutoFooId);
        return newConditionBean().acceptPK(constraintNameAutoFooId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param constraintNameAutoFooName : UQ, NotNull, VARCHAR(50). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<VendorConstraintNameAutoFoo> selectByUniqueOf(String constraintNameAutoFooName) {
        return facadeSelectByUniqueOf(constraintNameAutoFooName);
    }

    protected OptionalEntity<VendorConstraintNameAutoFoo> facadeSelectByUniqueOf(String constraintNameAutoFooName) {
        return doSelectByUniqueOf(constraintNameAutoFooName, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorConstraintNameAutoFoo> OptionalEntity<ENTITY> doSelectByUniqueOf(String constraintNameAutoFooName, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(constraintNameAutoFooName), tp), constraintNameAutoFooName);
    }

    protected VendorConstraintNameAutoFooCB xprepareCBAsUniqueOf(String constraintNameAutoFooName) {
        assertObjectNotNull("constraintNameAutoFooName", constraintNameAutoFooName);
        return newConditionBean().acceptUniqueOf(constraintNameAutoFooName);
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
     * ListResultBean&lt;VendorConstraintNameAutoFoo&gt; vendorConstraintNameAutoFooList = vendorConstraintNameAutoFooBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (VendorConstraintNameAutoFoo vendorConstraintNameAutoFoo : vendorConstraintNameAutoFooList) {
     *     ... = vendorConstraintNameAutoFoo.get...();
     * }
     * </pre>
     * @param cb The condition-bean of VendorConstraintNameAutoFoo. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<VendorConstraintNameAutoFoo> selectList(VendorConstraintNameAutoFooCB cb) {
        return facadeSelectList(cb);
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
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;VendorConstraintNameAutoFoo&gt; page = vendorConstraintNameAutoFooBhv.<span style="color: #DD4747">selectPage</span>(cb);
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
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<VendorConstraintNameAutoFoo> selectPage(VendorConstraintNameAutoFooCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * VendorConstraintNameAutoFooCB cb = new VendorConstraintNameAutoFooCB();
     * cb.query().setFoo...(value);
     * vendorConstraintNameAutoFooBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;VendorConstraintNameAutoFoo&gt;() {
     *     public void handle(VendorConstraintNameAutoFoo entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of VendorConstraintNameAutoFoo. (NotNull)
     * @param entityRowHandler The handler of entity row of VendorConstraintNameAutoFoo. (NotNull)
     */
    public void selectCursor(VendorConstraintNameAutoFooCB cb, EntityRowHandler<VendorConstraintNameAutoFoo> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * vendorConstraintNameAutoFooBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(VendorConstraintNameAutoFooCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<VendorConstraintNameAutoFooCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param vendorConstraintNameAutoFooList The entity list of vendorConstraintNameAutoFoo. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<VendorConstraintNameAutoFoo> vendorConstraintNameAutoFooList, ReferrerLoaderHandler<LoaderOfVendorConstraintNameAutoFoo> handler) {
        xassLRArg(vendorConstraintNameAutoFooList, handler);
        handler.handle(new LoaderOfVendorConstraintNameAutoFoo().ready(vendorConstraintNameAutoFooList, _behaviorSelector));
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
     * @param vendorConstraintNameAutoFoo The entity of vendorConstraintNameAutoFoo. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(VendorConstraintNameAutoFoo vendorConstraintNameAutoFoo, ReferrerLoaderHandler<LoaderOfVendorConstraintNameAutoFoo> handler) {
        xassLRArg(vendorConstraintNameAutoFoo, handler);
        handler.handle(new LoaderOfVendorConstraintNameAutoFoo().ready(xnewLRAryLs(vendorConstraintNameAutoFoo), _behaviorSelector));
    }

    /**
     * Load referrer of vendorConstraintNameAutoRefList by the set-upper of referrer. <br />
     * vendor_constraint_name_auto_ref by CONSTRAINT_NAME_AUTO_FOO_ID, named 'vendorConstraintNameAutoRefList'.
     * <pre>
     * vendorConstraintNameAutoFooBhv.<span style="color: #DD4747">loadVendorConstraintNameAutoRefList</span>(vendorConstraintNameAutoFooList, new ConditionBeanSetupper&lt;VendorConstraintNameAutoRefCB&gt;() {
     *     public void setup(VendorConstraintNameAutoRefCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (VendorConstraintNameAutoFoo vendorConstraintNameAutoFoo : vendorConstraintNameAutoFooList) {
     *     ... = vendorConstraintNameAutoFoo.<span style="color: #DD4747">getVendorConstraintNameAutoRefList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setConstraintNameAutoFooId_InScope(pkList);
     * cb.query().addOrderBy_ConstraintNameAutoFooId_Asc();
     * </pre>
     * @param vendorConstraintNameAutoFooList The entity list of vendorConstraintNameAutoFoo. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<VendorConstraintNameAutoRef> loadVendorConstraintNameAutoRefList(List<VendorConstraintNameAutoFoo> vendorConstraintNameAutoFooList, ConditionBeanSetupper<VendorConstraintNameAutoRefCB> setupper) {
        xassLRArg(vendorConstraintNameAutoFooList, setupper);
        return doLoadVendorConstraintNameAutoRefList(vendorConstraintNameAutoFooList, new LoadReferrerOption<VendorConstraintNameAutoRefCB, VendorConstraintNameAutoRef>().xinit(setupper));
    }

    /**
     * Load referrer of vendorConstraintNameAutoRefList by the set-upper of referrer. <br />
     * vendor_constraint_name_auto_ref by CONSTRAINT_NAME_AUTO_FOO_ID, named 'vendorConstraintNameAutoRefList'.
     * <pre>
     * vendorConstraintNameAutoFooBhv.<span style="color: #DD4747">loadVendorConstraintNameAutoRefList</span>(vendorConstraintNameAutoFooList, new ConditionBeanSetupper&lt;VendorConstraintNameAutoRefCB&gt;() {
     *     public void setup(VendorConstraintNameAutoRefCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = vendorConstraintNameAutoFoo.<span style="color: #DD4747">getVendorConstraintNameAutoRefList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setConstraintNameAutoFooId_InScope(pkList);
     * cb.query().addOrderBy_ConstraintNameAutoFooId_Asc();
     * </pre>
     * @param vendorConstraintNameAutoFoo The entity of vendorConstraintNameAutoFoo. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<VendorConstraintNameAutoRef> loadVendorConstraintNameAutoRefList(VendorConstraintNameAutoFoo vendorConstraintNameAutoFoo, ConditionBeanSetupper<VendorConstraintNameAutoRefCB> setupper) {
        xassLRArg(vendorConstraintNameAutoFoo, setupper);
        return doLoadVendorConstraintNameAutoRefList(xnewLRLs(vendorConstraintNameAutoFoo), new LoadReferrerOption<VendorConstraintNameAutoRefCB, VendorConstraintNameAutoRef>().xinit(setupper));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param vendorConstraintNameAutoFoo The entity of vendorConstraintNameAutoFoo. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<VendorConstraintNameAutoRef> loadVendorConstraintNameAutoRefList(VendorConstraintNameAutoFoo vendorConstraintNameAutoFoo, LoadReferrerOption<VendorConstraintNameAutoRefCB, VendorConstraintNameAutoRef> loadReferrerOption) {
        xassLRArg(vendorConstraintNameAutoFoo, loadReferrerOption);
        return loadVendorConstraintNameAutoRefList(xnewLRLs(vendorConstraintNameAutoFoo), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param vendorConstraintNameAutoFooList The entity list of vendorConstraintNameAutoFoo. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<VendorConstraintNameAutoRef> loadVendorConstraintNameAutoRefList(List<VendorConstraintNameAutoFoo> vendorConstraintNameAutoFooList, LoadReferrerOption<VendorConstraintNameAutoRefCB, VendorConstraintNameAutoRef> loadReferrerOption) {
        xassLRArg(vendorConstraintNameAutoFooList, loadReferrerOption);
        if (vendorConstraintNameAutoFooList.isEmpty()) { return (NestedReferrerListGateway<VendorConstraintNameAutoRef>)EMPTY_NREF_LGWAY; }
        return doLoadVendorConstraintNameAutoRefList(vendorConstraintNameAutoFooList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<VendorConstraintNameAutoRef> doLoadVendorConstraintNameAutoRefList(List<VendorConstraintNameAutoFoo> vendorConstraintNameAutoFooList, LoadReferrerOption<VendorConstraintNameAutoRefCB, VendorConstraintNameAutoRef> option) {
        return helpLoadReferrerInternally(vendorConstraintNameAutoFooList, option, "vendorConstraintNameAutoRefList");
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
    public List<Long> extractConstraintNameAutoFooIdList(List<VendorConstraintNameAutoFoo> vendorConstraintNameAutoFooList)
    { return helpExtractListInternally(vendorConstraintNameAutoFooList, "constraintNameAutoFooId"); }

    /**
     * Extract the value list of (single) unique key constraintNameAutoFooName.
     * @param vendorConstraintNameAutoFooList The list of vendorConstraintNameAutoFoo. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractConstraintNameAutoFooNameList(List<VendorConstraintNameAutoFoo> vendorConstraintNameAutoFooList)
    { return helpExtractListInternally(vendorConstraintNameAutoFooList, "constraintNameAutoFooName"); }

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
     * vendorConstraintNameAutoFooBhv.<span style="color: #DD4747">insert</span>(vendorConstraintNameAutoFoo);
     * ... = vendorConstraintNameAutoFoo.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param vendorConstraintNameAutoFoo The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(VendorConstraintNameAutoFoo vendorConstraintNameAutoFoo) {
        doInsert(vendorConstraintNameAutoFoo, null);
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
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendorConstraintNameAutoFoo.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     vendorConstraintNameAutoFooBhv.<span style="color: #DD4747">update</span>(vendorConstraintNameAutoFoo);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorConstraintNameAutoFoo The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(VendorConstraintNameAutoFoo vendorConstraintNameAutoFoo) {
        doUpdate(vendorConstraintNameAutoFoo, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param vendorConstraintNameAutoFoo The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(VendorConstraintNameAutoFoo vendorConstraintNameAutoFoo) {
        doInsertOrUpdate(vendorConstraintNameAutoFoo, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * VendorConstraintNameAutoFoo vendorConstraintNameAutoFoo = new VendorConstraintNameAutoFoo();
     * vendorConstraintNameAutoFoo.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendorConstraintNameAutoFoo.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     vendorConstraintNameAutoFooBhv.<span style="color: #DD4747">delete</span>(vendorConstraintNameAutoFoo);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorConstraintNameAutoFoo The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(VendorConstraintNameAutoFoo vendorConstraintNameAutoFoo) {
        doDelete(vendorConstraintNameAutoFoo, null);
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
     * vendorConstraintNameAutoFooBhv.<span style="color: #DD4747">batchInsert</span>(vendorConstraintNameAutoFooList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param vendorConstraintNameAutoFooList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<VendorConstraintNameAutoFoo> vendorConstraintNameAutoFooList) {
        return doBatchInsert(vendorConstraintNameAutoFooList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
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
     * vendorConstraintNameAutoFooBhv.<span style="color: #DD4747">batchUpdate</span>(vendorConstraintNameAutoFooList);
     * </pre>
     * @param vendorConstraintNameAutoFooList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<VendorConstraintNameAutoFoo> vendorConstraintNameAutoFooList) {
        return doBatchUpdate(vendorConstraintNameAutoFooList, null);
    }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * vendorConstraintNameAutoFooBhv.<span style="color: #DD4747">batchUpdate</span>(vendorConstraintNameAutoFooList, new SpecifyQuery<VendorConstraintNameAutoFooCB>() {
     *     public void specify(VendorConstraintNameAutoFooCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * vendorConstraintNameAutoFooBhv.<span style="color: #DD4747">batchUpdate</span>(vendorConstraintNameAutoFooList, new SpecifyQuery<VendorConstraintNameAutoFooCB>() {
     *     public void specify(VendorConstraintNameAutoFooCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
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
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<VendorConstraintNameAutoFoo> vendorConstraintNameAutoFooList, SpecifyQuery<VendorConstraintNameAutoFooCB> updateColumnSpec) {
        return doBatchUpdate(vendorConstraintNameAutoFooList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param vendorConstraintNameAutoFooList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<VendorConstraintNameAutoFoo> vendorConstraintNameAutoFooList) {
        return doBatchDelete(vendorConstraintNameAutoFooList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * vendorConstraintNameAutoFooBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;VendorConstraintNameAutoFoo, VendorConstraintNameAutoFooCB&gt;() {
     *     public ConditionBean setup(VendorConstraintNameAutoFoo entity, VendorConstraintNameAutoFooCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<VendorConstraintNameAutoFoo, VendorConstraintNameAutoFooCB> setupper) {
        return doQueryInsert(setupper, null);
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
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoFoo.setVersionNo(value);</span>
     * VendorConstraintNameAutoFooCB cb = new VendorConstraintNameAutoFooCB();
     * cb.query().setFoo...(value);
     * vendorConstraintNameAutoFooBhv.<span style="color: #DD4747">queryUpdate</span>(vendorConstraintNameAutoFoo, cb);
     * </pre>
     * @param vendorConstraintNameAutoFoo The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of VendorConstraintNameAutoFoo. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(VendorConstraintNameAutoFoo vendorConstraintNameAutoFoo, VendorConstraintNameAutoFooCB cb) {
        return doQueryUpdate(vendorConstraintNameAutoFoo, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * VendorConstraintNameAutoFooCB cb = new VendorConstraintNameAutoFooCB();
     * cb.query().setFoo...(value);
     * vendorConstraintNameAutoFooBhv.<span style="color: #DD4747">queryDelete</span>(vendorConstraintNameAutoFoo, cb);
     * </pre>
     * @param cb The condition-bean of VendorConstraintNameAutoFoo. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(VendorConstraintNameAutoFooCB cb) {
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
     * VendorConstraintNameAutoFoo vendorConstraintNameAutoFoo = new VendorConstraintNameAutoFoo();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorConstraintNameAutoFoo.setFoo...(value);
     * vendorConstraintNameAutoFoo.setBar...(value);
     * InsertOption<VendorConstraintNameAutoFooCB> option = new InsertOption<VendorConstraintNameAutoFooCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * vendorConstraintNameAutoFooBhv.<span style="color: #DD4747">varyingInsert</span>(vendorConstraintNameAutoFoo, option);
     * ... = vendorConstraintNameAutoFoo.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param vendorConstraintNameAutoFoo The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
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
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendorConstraintNameAutoFoo.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;VendorConstraintNameAutoFooCB&gt; option = new UpdateOption&lt;VendorConstraintNameAutoFooCB&gt;();
     *     option.self(new SpecifyQuery&lt;VendorConstraintNameAutoFooCB&gt;() {
     *         public void specify(VendorConstraintNameAutoFooCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     vendorConstraintNameAutoFooBhv.<span style="color: #DD4747">varyingUpdate</span>(vendorConstraintNameAutoFoo, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorConstraintNameAutoFoo The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(VendorConstraintNameAutoFoo vendorConstraintNameAutoFoo, UpdateOption<VendorConstraintNameAutoFooCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(vendorConstraintNameAutoFoo, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param vendorConstraintNameAutoFoo The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(VendorConstraintNameAutoFoo vendorConstraintNameAutoFoo, InsertOption<VendorConstraintNameAutoFooCB> insertOption, UpdateOption<VendorConstraintNameAutoFooCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdate(vendorConstraintNameAutoFoo, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param vendorConstraintNameAutoFoo The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
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
     * @param setupper The set-upper of query-insert. (NotNull)
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
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoFoo.setVersionNo(value);</span>
     * VendorConstraintNameAutoFooCB cb = new VendorConstraintNameAutoFooCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;VendorConstraintNameAutoFooCB&gt; option = new UpdateOption&lt;VendorConstraintNameAutoFooCB&gt;();
     * option.self(new SpecifyQuery&lt;VendorConstraintNameAutoFooCB&gt;() {
     *     public void specify(VendorConstraintNameAutoFooCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * vendorConstraintNameAutoFooBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(vendorConstraintNameAutoFoo, cb, option);
     * </pre>
     * @param vendorConstraintNameAutoFoo The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of VendorConstraintNameAutoFoo. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
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
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
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
        OutsideSqlAllFacadeExecutor<VendorConstraintNameAutoFooBhv> facadeExecutor = doOutsideSql();
        return facadeExecutor.xbasicExecutor(); // variable to resolve generic type
    }

    // ===================================================================================
    //                                                                         Hyper Patch
    //                                                                         ===========
    @Override
    protected <RESULT extends VendorConstraintNameAutoFoo> org.seasar.dbflute.bhv.core.command.SelectCursorCBCommand<RESULT> newSelectCursorCBCommand() {
        return new com.example.dbflute.mysql.dbflute.allcommon.DBFluteConfig.SelectCursorCBCommandHyperPatch<RESULT>();
    }

    @Override
    protected <RESULT extends VendorConstraintNameAutoFoo> org.seasar.dbflute.bhv.core.command.SelectListCBCommand<RESULT> newSelectListCBCommand() {
        return new com.example.dbflute.mysql.dbflute.allcommon.DBFluteConfig.SelectListCBCommandHyperPatch<RESULT>();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends VendorConstraintNameAutoFoo> typeOfSelectedEntity() { return VendorConstraintNameAutoFoo.class; }
    protected Class<VendorConstraintNameAutoFoo> typeOfHandlingEntity() { return VendorConstraintNameAutoFoo.class; }
    protected Class<VendorConstraintNameAutoFooCB> typeOfHandlingConditionBean() { return VendorConstraintNameAutoFooCB.class; }
}
