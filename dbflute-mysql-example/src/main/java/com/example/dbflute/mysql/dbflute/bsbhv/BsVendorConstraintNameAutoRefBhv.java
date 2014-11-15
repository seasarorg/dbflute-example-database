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
 * The behavior of VENDOR_CONSTRAINT_NAME_AUTO_REF as TABLE. <br />
 * <pre>
 * [primary key]
 *     CONSTRAINT_NAME_AUTO_REF_ID
 *
 * [column]
 *     CONSTRAINT_NAME_AUTO_REF_ID, CONSTRAINT_NAME_AUTO_FOO_ID, CONSTRAINT_NAME_AUTO_BAR_ID, CONSTRAINT_NAME_AUTO_QUX_ID, CONSTRAINT_NAME_AUTO_CORGE_ID, CONSTRAINT_NAME_AUTO_UNIQUE
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
 *     vendor_constraint_name_auto_foo, vendor_constraint_name_auto_bar, vendor_constraint_name_auto_qux
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     vendorConstraintNameAutoFoo, vendorConstraintNameAutoBar, vendorConstraintNameAutoQux
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsVendorConstraintNameAutoRefBhv extends AbstractBehaviorWritable<VendorConstraintNameAutoRef, VendorConstraintNameAutoRefCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public VendorConstraintNameAutoRefDbm getDBMeta() { return VendorConstraintNameAutoRefDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public VendorConstraintNameAutoRefDbm getMyDBMeta() { return VendorConstraintNameAutoRefDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public VendorConstraintNameAutoRefCB newConditionBean() { return new VendorConstraintNameAutoRefCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public VendorConstraintNameAutoRef newMyEntity() { return new VendorConstraintNameAutoRef(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public VendorConstraintNameAutoRefCB newMyConditionBean() { return new VendorConstraintNameAutoRefCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * VendorConstraintNameAutoRefCB cb = new VendorConstraintNameAutoRefCB();
     * cb.query().setFoo...(value);
     * int count = vendorConstraintNameAutoRefBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of VendorConstraintNameAutoRef. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(VendorConstraintNameAutoRefCB cb) {
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
     * VendorConstraintNameAutoRefCB cb = new VendorConstraintNameAutoRefCB();
     * cb.query().setFoo...(value);
     * VendorConstraintNameAutoRef vendorConstraintNameAutoRef = vendorConstraintNameAutoRefBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (vendorConstraintNameAutoRef != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = vendorConstraintNameAutoRef.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of VendorConstraintNameAutoRef. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorConstraintNameAutoRef selectEntity(VendorConstraintNameAutoRefCB cb) {
        return facadeSelectEntity(cb);
    }

    protected VendorConstraintNameAutoRef facadeSelectEntity(VendorConstraintNameAutoRefCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorConstraintNameAutoRef> OptionalEntity<ENTITY> doSelectOptionalEntity(VendorConstraintNameAutoRefCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * VendorConstraintNameAutoRefCB cb = new VendorConstraintNameAutoRefCB();
     * cb.query().setFoo...(value);
     * VendorConstraintNameAutoRef vendorConstraintNameAutoRef = vendorConstraintNameAutoRefBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = vendorConstraintNameAutoRef.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of VendorConstraintNameAutoRef. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorConstraintNameAutoRef selectEntityWithDeletedCheck(VendorConstraintNameAutoRefCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param constraintNameAutoRefId : PK, NotNull, DECIMAL(16). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorConstraintNameAutoRef selectByPKValue(Long constraintNameAutoRefId) {
        return facadeSelectByPKValue(constraintNameAutoRefId);
    }

    protected VendorConstraintNameAutoRef facadeSelectByPKValue(Long constraintNameAutoRefId) {
        return doSelectByPK(constraintNameAutoRefId, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorConstraintNameAutoRef> ENTITY doSelectByPK(Long constraintNameAutoRefId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(constraintNameAutoRefId), tp);
    }

    protected <ENTITY extends VendorConstraintNameAutoRef> OptionalEntity<ENTITY> doSelectOptionalByPK(Long constraintNameAutoRefId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(constraintNameAutoRefId, tp), constraintNameAutoRefId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param constraintNameAutoRefId : PK, NotNull, DECIMAL(16). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorConstraintNameAutoRef selectByPKValueWithDeletedCheck(Long constraintNameAutoRefId) {
        return doSelectByPKWithDeletedCheck(constraintNameAutoRefId, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorConstraintNameAutoRef> ENTITY doSelectByPKWithDeletedCheck(Long constraintNameAutoRefId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(constraintNameAutoRefId), tp);
    }

    protected VendorConstraintNameAutoRefCB xprepareCBAsPK(Long constraintNameAutoRefId) {
        assertObjectNotNull("constraintNameAutoRefId", constraintNameAutoRefId);
        return newConditionBean().acceptPK(constraintNameAutoRefId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param constraintNameAutoUnique : UQ, NotNull, VARCHAR(50). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<VendorConstraintNameAutoRef> selectByUniqueOf(String constraintNameAutoUnique) {
        return facadeSelectByUniqueOf(constraintNameAutoUnique);
    }

    protected OptionalEntity<VendorConstraintNameAutoRef> facadeSelectByUniqueOf(String constraintNameAutoUnique) {
        return doSelectByUniqueOf(constraintNameAutoUnique, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorConstraintNameAutoRef> OptionalEntity<ENTITY> doSelectByUniqueOf(String constraintNameAutoUnique, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(constraintNameAutoUnique), tp), constraintNameAutoUnique);
    }

    protected VendorConstraintNameAutoRefCB xprepareCBAsUniqueOf(String constraintNameAutoUnique) {
        assertObjectNotNull("constraintNameAutoUnique", constraintNameAutoUnique);
        return newConditionBean().acceptUniqueOf(constraintNameAutoUnique);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * VendorConstraintNameAutoRefCB cb = new VendorConstraintNameAutoRefCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;VendorConstraintNameAutoRef&gt; vendorConstraintNameAutoRefList = vendorConstraintNameAutoRefBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (VendorConstraintNameAutoRef vendorConstraintNameAutoRef : vendorConstraintNameAutoRefList) {
     *     ... = vendorConstraintNameAutoRef.get...();
     * }
     * </pre>
     * @param cb The condition-bean of VendorConstraintNameAutoRef. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<VendorConstraintNameAutoRef> selectList(VendorConstraintNameAutoRefCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * VendorConstraintNameAutoRefCB cb = new VendorConstraintNameAutoRefCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;VendorConstraintNameAutoRef&gt; page = vendorConstraintNameAutoRefBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (VendorConstraintNameAutoRef vendorConstraintNameAutoRef : page) {
     *     ... = vendorConstraintNameAutoRef.get...();
     * }
     * </pre>
     * @param cb The condition-bean of VendorConstraintNameAutoRef. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<VendorConstraintNameAutoRef> selectPage(VendorConstraintNameAutoRefCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * VendorConstraintNameAutoRefCB cb = new VendorConstraintNameAutoRefCB();
     * cb.query().setFoo...(value);
     * vendorConstraintNameAutoRefBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;VendorConstraintNameAutoRef&gt;() {
     *     public void handle(VendorConstraintNameAutoRef entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of VendorConstraintNameAutoRef. (NotNull)
     * @param entityRowHandler The handler of entity row of VendorConstraintNameAutoRef. (NotNull)
     */
    public void selectCursor(VendorConstraintNameAutoRefCB cb, EntityRowHandler<VendorConstraintNameAutoRef> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * vendorConstraintNameAutoRefBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(VendorConstraintNameAutoRefCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<VendorConstraintNameAutoRefCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param vendorConstraintNameAutoRefList The entity list of vendorConstraintNameAutoRef. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<VendorConstraintNameAutoRef> vendorConstraintNameAutoRefList, ReferrerLoaderHandler<LoaderOfVendorConstraintNameAutoRef> handler) {
        xassLRArg(vendorConstraintNameAutoRefList, handler);
        handler.handle(new LoaderOfVendorConstraintNameAutoRef().ready(vendorConstraintNameAutoRefList, _behaviorSelector));
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
     * @param vendorConstraintNameAutoRef The entity of vendorConstraintNameAutoRef. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(VendorConstraintNameAutoRef vendorConstraintNameAutoRef, ReferrerLoaderHandler<LoaderOfVendorConstraintNameAutoRef> handler) {
        xassLRArg(vendorConstraintNameAutoRef, handler);
        handler.handle(new LoaderOfVendorConstraintNameAutoRef().ready(xnewLRAryLs(vendorConstraintNameAutoRef), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'VendorConstraintNameAutoFoo'.
     * @param vendorConstraintNameAutoRefList The list of vendorConstraintNameAutoRef. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<VendorConstraintNameAutoFoo> pulloutVendorConstraintNameAutoFoo(List<VendorConstraintNameAutoRef> vendorConstraintNameAutoRefList)
    { return helpPulloutInternally(vendorConstraintNameAutoRefList, "vendorConstraintNameAutoFoo"); }

    /**
     * Pull out the list of foreign table 'VendorConstraintNameAutoBar'.
     * @param vendorConstraintNameAutoRefList The list of vendorConstraintNameAutoRef. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<VendorConstraintNameAutoBar> pulloutVendorConstraintNameAutoBar(List<VendorConstraintNameAutoRef> vendorConstraintNameAutoRefList)
    { return helpPulloutInternally(vendorConstraintNameAutoRefList, "vendorConstraintNameAutoBar"); }

    /**
     * Pull out the list of foreign table 'VendorConstraintNameAutoQux'.
     * @param vendorConstraintNameAutoRefList The list of vendorConstraintNameAutoRef. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<VendorConstraintNameAutoQux> pulloutVendorConstraintNameAutoQux(List<VendorConstraintNameAutoRef> vendorConstraintNameAutoRefList)
    { return helpPulloutInternally(vendorConstraintNameAutoRefList, "vendorConstraintNameAutoQux"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key constraintNameAutoRefId.
     * @param vendorConstraintNameAutoRefList The list of vendorConstraintNameAutoRef. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractConstraintNameAutoRefIdList(List<VendorConstraintNameAutoRef> vendorConstraintNameAutoRefList)
    { return helpExtractListInternally(vendorConstraintNameAutoRefList, "constraintNameAutoRefId"); }

    /**
     * Extract the value list of (single) unique key constraintNameAutoUnique.
     * @param vendorConstraintNameAutoRefList The list of vendorConstraintNameAutoRef. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractConstraintNameAutoUniqueList(List<VendorConstraintNameAutoRef> vendorConstraintNameAutoRefList)
    { return helpExtractListInternally(vendorConstraintNameAutoRefList, "constraintNameAutoUnique"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * VendorConstraintNameAutoRef vendorConstraintNameAutoRef = new VendorConstraintNameAutoRef();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorConstraintNameAutoRef.setFoo...(value);
     * vendorConstraintNameAutoRef.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoRef.set...;</span>
     * vendorConstraintNameAutoRefBhv.<span style="color: #DD4747">insert</span>(vendorConstraintNameAutoRef);
     * ... = vendorConstraintNameAutoRef.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param vendorConstraintNameAutoRef The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(VendorConstraintNameAutoRef vendorConstraintNameAutoRef) {
        doInsert(vendorConstraintNameAutoRef, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * VendorConstraintNameAutoRef vendorConstraintNameAutoRef = new VendorConstraintNameAutoRef();
     * vendorConstraintNameAutoRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorConstraintNameAutoRef.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoRef.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendorConstraintNameAutoRef.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     vendorConstraintNameAutoRefBhv.<span style="color: #DD4747">update</span>(vendorConstraintNameAutoRef);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorConstraintNameAutoRef The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(VendorConstraintNameAutoRef vendorConstraintNameAutoRef) {
        doUpdate(vendorConstraintNameAutoRef, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param vendorConstraintNameAutoRef The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(VendorConstraintNameAutoRef vendorConstraintNameAutoRef) {
        doInsertOrUpdate(vendorConstraintNameAutoRef, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * VendorConstraintNameAutoRef vendorConstraintNameAutoRef = new VendorConstraintNameAutoRef();
     * vendorConstraintNameAutoRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendorConstraintNameAutoRef.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     vendorConstraintNameAutoRefBhv.<span style="color: #DD4747">delete</span>(vendorConstraintNameAutoRef);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorConstraintNameAutoRef The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(VendorConstraintNameAutoRef vendorConstraintNameAutoRef) {
        doDelete(vendorConstraintNameAutoRef, null);
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
     *     VendorConstraintNameAutoRef vendorConstraintNameAutoRef = new VendorConstraintNameAutoRef();
     *     vendorConstraintNameAutoRef.setFooName("foo");
     *     if (...) {
     *         vendorConstraintNameAutoRef.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     vendorConstraintNameAutoRefList.add(vendorConstraintNameAutoRef);
     * }
     * vendorConstraintNameAutoRefBhv.<span style="color: #DD4747">batchInsert</span>(vendorConstraintNameAutoRefList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param vendorConstraintNameAutoRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<VendorConstraintNameAutoRef> vendorConstraintNameAutoRefList) {
        return doBatchInsert(vendorConstraintNameAutoRefList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     VendorConstraintNameAutoRef vendorConstraintNameAutoRef = new VendorConstraintNameAutoRef();
     *     vendorConstraintNameAutoRef.setFooName("foo");
     *     if (...) {
     *         vendorConstraintNameAutoRef.setFooPrice(123);
     *     } else {
     *         vendorConstraintNameAutoRef.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//vendorConstraintNameAutoRef.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     vendorConstraintNameAutoRefList.add(vendorConstraintNameAutoRef);
     * }
     * vendorConstraintNameAutoRefBhv.<span style="color: #DD4747">batchUpdate</span>(vendorConstraintNameAutoRefList);
     * </pre>
     * @param vendorConstraintNameAutoRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<VendorConstraintNameAutoRef> vendorConstraintNameAutoRefList) {
        return doBatchUpdate(vendorConstraintNameAutoRefList, null);
    }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * vendorConstraintNameAutoRefBhv.<span style="color: #DD4747">batchUpdate</span>(vendorConstraintNameAutoRefList, new SpecifyQuery<VendorConstraintNameAutoRefCB>() {
     *     public void specify(VendorConstraintNameAutoRefCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * vendorConstraintNameAutoRefBhv.<span style="color: #DD4747">batchUpdate</span>(vendorConstraintNameAutoRefList, new SpecifyQuery<VendorConstraintNameAutoRefCB>() {
     *     public void specify(VendorConstraintNameAutoRefCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param vendorConstraintNameAutoRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<VendorConstraintNameAutoRef> vendorConstraintNameAutoRefList, SpecifyQuery<VendorConstraintNameAutoRefCB> updateColumnSpec) {
        return doBatchUpdate(vendorConstraintNameAutoRefList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param vendorConstraintNameAutoRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<VendorConstraintNameAutoRef> vendorConstraintNameAutoRefList) {
        return doBatchDelete(vendorConstraintNameAutoRefList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * vendorConstraintNameAutoRefBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;VendorConstraintNameAutoRef, VendorConstraintNameAutoRefCB&gt;() {
     *     public ConditionBean setup(VendorConstraintNameAutoRef entity, VendorConstraintNameAutoRefCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<VendorConstraintNameAutoRef, VendorConstraintNameAutoRefCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * VendorConstraintNameAutoRef vendorConstraintNameAutoRef = new VendorConstraintNameAutoRef();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoRef.setPK...(value);</span>
     * vendorConstraintNameAutoRef.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoRef.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoRef.setVersionNo(value);</span>
     * VendorConstraintNameAutoRefCB cb = new VendorConstraintNameAutoRefCB();
     * cb.query().setFoo...(value);
     * vendorConstraintNameAutoRefBhv.<span style="color: #DD4747">queryUpdate</span>(vendorConstraintNameAutoRef, cb);
     * </pre>
     * @param vendorConstraintNameAutoRef The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of VendorConstraintNameAutoRef. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(VendorConstraintNameAutoRef vendorConstraintNameAutoRef, VendorConstraintNameAutoRefCB cb) {
        return doQueryUpdate(vendorConstraintNameAutoRef, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * VendorConstraintNameAutoRefCB cb = new VendorConstraintNameAutoRefCB();
     * cb.query().setFoo...(value);
     * vendorConstraintNameAutoRefBhv.<span style="color: #DD4747">queryDelete</span>(vendorConstraintNameAutoRef, cb);
     * </pre>
     * @param cb The condition-bean of VendorConstraintNameAutoRef. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(VendorConstraintNameAutoRefCB cb) {
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
     * VendorConstraintNameAutoRef vendorConstraintNameAutoRef = new VendorConstraintNameAutoRef();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorConstraintNameAutoRef.setFoo...(value);
     * vendorConstraintNameAutoRef.setBar...(value);
     * InsertOption<VendorConstraintNameAutoRefCB> option = new InsertOption<VendorConstraintNameAutoRefCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * vendorConstraintNameAutoRefBhv.<span style="color: #DD4747">varyingInsert</span>(vendorConstraintNameAutoRef, option);
     * ... = vendorConstraintNameAutoRef.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param vendorConstraintNameAutoRef The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(VendorConstraintNameAutoRef vendorConstraintNameAutoRef, InsertOption<VendorConstraintNameAutoRefCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(vendorConstraintNameAutoRef, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * VendorConstraintNameAutoRef vendorConstraintNameAutoRef = new VendorConstraintNameAutoRef();
     * vendorConstraintNameAutoRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorConstraintNameAutoRef.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendorConstraintNameAutoRef.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;VendorConstraintNameAutoRefCB&gt; option = new UpdateOption&lt;VendorConstraintNameAutoRefCB&gt;();
     *     option.self(new SpecifyQuery&lt;VendorConstraintNameAutoRefCB&gt;() {
     *         public void specify(VendorConstraintNameAutoRefCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     vendorConstraintNameAutoRefBhv.<span style="color: #DD4747">varyingUpdate</span>(vendorConstraintNameAutoRef, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorConstraintNameAutoRef The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(VendorConstraintNameAutoRef vendorConstraintNameAutoRef, UpdateOption<VendorConstraintNameAutoRefCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(vendorConstraintNameAutoRef, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param vendorConstraintNameAutoRef The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(VendorConstraintNameAutoRef vendorConstraintNameAutoRef, InsertOption<VendorConstraintNameAutoRefCB> insertOption, UpdateOption<VendorConstraintNameAutoRefCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdate(vendorConstraintNameAutoRef, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param vendorConstraintNameAutoRef The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(VendorConstraintNameAutoRef vendorConstraintNameAutoRef, DeleteOption<VendorConstraintNameAutoRefCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(vendorConstraintNameAutoRef, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param vendorConstraintNameAutoRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<VendorConstraintNameAutoRef> vendorConstraintNameAutoRefList, InsertOption<VendorConstraintNameAutoRefCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(vendorConstraintNameAutoRefList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param vendorConstraintNameAutoRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<VendorConstraintNameAutoRef> vendorConstraintNameAutoRefList, UpdateOption<VendorConstraintNameAutoRefCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(vendorConstraintNameAutoRefList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param vendorConstraintNameAutoRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<VendorConstraintNameAutoRef> vendorConstraintNameAutoRefList, DeleteOption<VendorConstraintNameAutoRefCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(vendorConstraintNameAutoRefList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<VendorConstraintNameAutoRef, VendorConstraintNameAutoRefCB> setupper, InsertOption<VendorConstraintNameAutoRefCB> option) {
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
     * VendorConstraintNameAutoRef vendorConstraintNameAutoRef = new VendorConstraintNameAutoRef();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoRef.setPK...(value);</span>
     * vendorConstraintNameAutoRef.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoRef.setVersionNo(value);</span>
     * VendorConstraintNameAutoRefCB cb = new VendorConstraintNameAutoRefCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;VendorConstraintNameAutoRefCB&gt; option = new UpdateOption&lt;VendorConstraintNameAutoRefCB&gt;();
     * option.self(new SpecifyQuery&lt;VendorConstraintNameAutoRefCB&gt;() {
     *     public void specify(VendorConstraintNameAutoRefCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * vendorConstraintNameAutoRefBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(vendorConstraintNameAutoRef, cb, option);
     * </pre>
     * @param vendorConstraintNameAutoRef The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of VendorConstraintNameAutoRef. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(VendorConstraintNameAutoRef vendorConstraintNameAutoRef, VendorConstraintNameAutoRefCB cb, UpdateOption<VendorConstraintNameAutoRefCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(vendorConstraintNameAutoRef, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of VendorConstraintNameAutoRef. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(VendorConstraintNameAutoRefCB cb, DeleteOption<VendorConstraintNameAutoRefCB> option) {
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
    public OutsideSqlBasicExecutor<VendorConstraintNameAutoRefBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<VendorConstraintNameAutoRefBhv> facadeExecutor = doOutsideSql();
        return facadeExecutor.xbasicExecutor(); // variable to resolve generic type
    }

    // ===================================================================================
    //                                                                         Hyper Patch
    //                                                                         ===========
    @Override
    protected <RESULT extends VendorConstraintNameAutoRef> org.seasar.dbflute.bhv.core.command.SelectListCBCommand<RESULT> newSelectListCBCommand() {
        return new com.example.dbflute.mysql.dbflute.allcommon.DBFluteConfig.SelectListCBCommandHyperPatch<RESULT>();
    }

    @Override
    protected <RESULT extends VendorConstraintNameAutoRef> org.seasar.dbflute.bhv.core.command.SelectCursorCBCommand<RESULT> newSelectCursorCBCommand() {
        return new com.example.dbflute.mysql.dbflute.allcommon.DBFluteConfig.SelectCursorCBCommandHyperPatch<RESULT>();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends VendorConstraintNameAutoRef> typeOfSelectedEntity() { return VendorConstraintNameAutoRef.class; }
    protected Class<VendorConstraintNameAutoRef> typeOfHandlingEntity() { return VendorConstraintNameAutoRef.class; }
    protected Class<VendorConstraintNameAutoRefCB> typeOfHandlingConditionBean() { return VendorConstraintNameAutoRefCB.class; }
}
