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
import org.seasar.dbflute.cbean.chelper.HpSLSExecutor;
import org.seasar.dbflute.cbean.chelper.HpSLSFunction;
import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.exception.*;
import org.seasar.dbflute.optional.OptionalEntity;
import org.seasar.dbflute.outsidesql.executor.*;
import com.example.dbflute.mysql.dbflute.exbhv.*;
import com.example.dbflute.mysql.dbflute.bsbhv.loader.*;
import com.example.dbflute.mysql.dbflute.exentity.*;
import com.example.dbflute.mysql.dbflute.bsentity.dbmeta.*;
import com.example.dbflute.mysql.dbflute.cbean.*;

/**
 * The behavior of VENDOR_CONSTRAINT_NAME_AUTO_QUX as TABLE. <br />
 * <pre>
 * [primary key]
 *     CONSTRAINT_NAME_AUTO_QUX_ID
 *
 * [column]
 *     CONSTRAINT_NAME_AUTO_QUX_ID, CONSTRAINT_NAME_AUTO_QUX_NAME
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
public abstract class BsVendorConstraintNameAutoQuxBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "vendor_constraint_name_auto_qux"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public DBMeta getDBMeta() { return VendorConstraintNameAutoQuxDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public VendorConstraintNameAutoQuxDbm getMyDBMeta() { return VendorConstraintNameAutoQuxDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public VendorConstraintNameAutoQux newEntity() { return new VendorConstraintNameAutoQux(); }

    /** {@inheritDoc} */
    public VendorConstraintNameAutoQuxCB newConditionBean() { return new VendorConstraintNameAutoQuxCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public VendorConstraintNameAutoQux newMyEntity() { return new VendorConstraintNameAutoQux(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public VendorConstraintNameAutoQuxCB newMyConditionBean() { return new VendorConstraintNameAutoQuxCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * VendorConstraintNameAutoQuxCB cb = new VendorConstraintNameAutoQuxCB();
     * cb.query().setFoo...(value);
     * int count = vendorConstraintNameAutoQuxBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of VendorConstraintNameAutoQux. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(VendorConstraintNameAutoQuxCB cb) {
        return facadeSelectCount(cb);
    }

    protected int facadeSelectCount(VendorConstraintNameAutoQuxCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(VendorConstraintNameAutoQuxCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(VendorConstraintNameAutoQuxCB cb) { // called by selectPage(cb)
        assertCBStateValid(cb);
        return delegateSelectCountPlainly(cb);
    }

    protected int doReadCount(ConditionBean cb) { return facadeSelectCount(downcast(cb)); }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean. #beforejava8 <br />
     * <span style="color: #AD4747; font-size: 120%">The return might be null if no data, so you should have null check.</span> <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, use selectEntityWithDeletedCheck().</span>
     * <pre>
     * VendorConstraintNameAutoQuxCB cb = new VendorConstraintNameAutoQuxCB();
     * cb.query().setFoo...(value);
     * VendorConstraintNameAutoQux vendorConstraintNameAutoQux = vendorConstraintNameAutoQuxBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (vendorConstraintNameAutoQux != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = vendorConstraintNameAutoQux.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of VendorConstraintNameAutoQux. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorConstraintNameAutoQux selectEntity(VendorConstraintNameAutoQuxCB cb) {
        return facadeSelectEntity(cb);
    }

    protected VendorConstraintNameAutoQux facadeSelectEntity(VendorConstraintNameAutoQuxCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorConstraintNameAutoQux> ENTITY doSelectEntity(VendorConstraintNameAutoQuxCB cb, Class<ENTITY> tp) {
        return helpSelectEntityInternally(cb, tp);
    }

    protected <ENTITY extends VendorConstraintNameAutoQux> OptionalEntity<ENTITY> doSelectOptionalEntity(VendorConstraintNameAutoQuxCB cb, Class<ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * VendorConstraintNameAutoQuxCB cb = new VendorConstraintNameAutoQuxCB();
     * cb.query().setFoo...(value);
     * VendorConstraintNameAutoQux vendorConstraintNameAutoQux = vendorConstraintNameAutoQuxBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = vendorConstraintNameAutoQux.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of VendorConstraintNameAutoQux. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorConstraintNameAutoQux selectEntityWithDeletedCheck(VendorConstraintNameAutoQuxCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    protected VendorConstraintNameAutoQux facadeSelectEntityWithDeletedCheck(VendorConstraintNameAutoQuxCB cb) {
        return doSelectEntityWithDeletedCheck(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorConstraintNameAutoQux> ENTITY doSelectEntityWithDeletedCheck(VendorConstraintNameAutoQuxCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp);
    }

    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) { return facadeSelectEntityWithDeletedCheck(downcast(cb)); }

    /**
     * Select the entity by the primary-key value.
     * @param constraintNameAutoQuxId : PK, NotNull, DECIMAL(16). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorConstraintNameAutoQux selectByPKValue(Long constraintNameAutoQuxId) {
        return facadeSelectByPKValue(constraintNameAutoQuxId);
    }

    protected VendorConstraintNameAutoQux facadeSelectByPKValue(Long constraintNameAutoQuxId) {
        return doSelectByPK(constraintNameAutoQuxId, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorConstraintNameAutoQux> ENTITY doSelectByPK(Long constraintNameAutoQuxId, Class<ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(constraintNameAutoQuxId), tp);
    }

    protected <ENTITY extends VendorConstraintNameAutoQux> OptionalEntity<ENTITY> doSelectOptionalByPK(Long constraintNameAutoQuxId, Class<ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(constraintNameAutoQuxId, tp), constraintNameAutoQuxId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param constraintNameAutoQuxId : PK, NotNull, DECIMAL(16). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorConstraintNameAutoQux selectByPKValueWithDeletedCheck(Long constraintNameAutoQuxId) {
        return doSelectByPKWithDeletedCheck(constraintNameAutoQuxId, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorConstraintNameAutoQux> ENTITY doSelectByPKWithDeletedCheck(Long constraintNameAutoQuxId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(constraintNameAutoQuxId), tp);
    }

    protected VendorConstraintNameAutoQuxCB xprepareCBAsPK(Long constraintNameAutoQuxId) {
        assertObjectNotNull("constraintNameAutoQuxId", constraintNameAutoQuxId);
        return newConditionBean().acceptPK(constraintNameAutoQuxId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param constraintNameAutoQuxName : UQ, NotNull, VARCHAR(50). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<VendorConstraintNameAutoQux> selectByUniqueOf(String constraintNameAutoQuxName) {
        return facadeSelectByUniqueOf(constraintNameAutoQuxName);
    }

    protected OptionalEntity<VendorConstraintNameAutoQux> facadeSelectByUniqueOf(String constraintNameAutoQuxName) {
        return doSelectByUniqueOf(constraintNameAutoQuxName, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorConstraintNameAutoQux> OptionalEntity<ENTITY> doSelectByUniqueOf(String constraintNameAutoQuxName, Class<ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(constraintNameAutoQuxName), tp), constraintNameAutoQuxName);
    }

    protected VendorConstraintNameAutoQuxCB xprepareCBAsUniqueOf(String constraintNameAutoQuxName) {
        assertObjectNotNull("constraintNameAutoQuxName", constraintNameAutoQuxName);
        return newConditionBean().acceptUniqueOf(constraintNameAutoQuxName);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * VendorConstraintNameAutoQuxCB cb = new VendorConstraintNameAutoQuxCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;VendorConstraintNameAutoQux&gt; vendorConstraintNameAutoQuxList = vendorConstraintNameAutoQuxBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (VendorConstraintNameAutoQux vendorConstraintNameAutoQux : vendorConstraintNameAutoQuxList) {
     *     ... = vendorConstraintNameAutoQux.get...();
     * }
     * </pre>
     * @param cb The condition-bean of VendorConstraintNameAutoQux. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<VendorConstraintNameAutoQux> selectList(VendorConstraintNameAutoQuxCB cb) {
        return facadeSelectList(cb);
    }

    protected ListResultBean<VendorConstraintNameAutoQux> facadeSelectList(VendorConstraintNameAutoQuxCB cb) {
        return doSelectList(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorConstraintNameAutoQux> ListResultBean<ENTITY> doSelectList(VendorConstraintNameAutoQuxCB cb, Class<ENTITY> tp) {
        return helpSelectListInternally(cb, tp);
    }

    protected ListResultBean<? extends Entity> doReadList(ConditionBean cb) { return facadeSelectList(downcast(cb)); }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * VendorConstraintNameAutoQuxCB cb = new VendorConstraintNameAutoQuxCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;VendorConstraintNameAutoQux&gt; page = vendorConstraintNameAutoQuxBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (VendorConstraintNameAutoQux vendorConstraintNameAutoQux : page) {
     *     ... = vendorConstraintNameAutoQux.get...();
     * }
     * </pre>
     * @param cb The condition-bean of VendorConstraintNameAutoQux. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<VendorConstraintNameAutoQux> selectPage(VendorConstraintNameAutoQuxCB cb) {
        return facadeSelectPage(cb);
    }

    protected PagingResultBean<VendorConstraintNameAutoQux> facadeSelectPage(VendorConstraintNameAutoQuxCB cb) {
        return doSelectPage(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorConstraintNameAutoQux> PagingResultBean<ENTITY> doSelectPage(VendorConstraintNameAutoQuxCB cb, Class<ENTITY> tp) {
        return helpSelectPageInternally(cb, tp);
    }

    protected PagingResultBean<? extends Entity> doReadPage(ConditionBean cb) { return facadeSelectPage(downcast(cb)); }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * VendorConstraintNameAutoQuxCB cb = new VendorConstraintNameAutoQuxCB();
     * cb.query().setFoo...(value);
     * vendorConstraintNameAutoQuxBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;VendorConstraintNameAutoQux&gt;() {
     *     public void handle(VendorConstraintNameAutoQux entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of VendorConstraintNameAutoQux. (NotNull)
     * @param entityRowHandler The handler of entity row of VendorConstraintNameAutoQux. (NotNull)
     */
    public void selectCursor(VendorConstraintNameAutoQuxCB cb, EntityRowHandler<VendorConstraintNameAutoQux> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    protected void facadeSelectCursor(VendorConstraintNameAutoQuxCB cb, EntityRowHandler<VendorConstraintNameAutoQux> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorConstraintNameAutoQux> void doSelectCursor(VendorConstraintNameAutoQuxCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * vendorConstraintNameAutoQuxBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(VendorConstraintNameAutoQuxCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<VendorConstraintNameAutoQuxCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    protected <RESULT> HpSLSFunction<VendorConstraintNameAutoQuxCB, RESULT> facadeScalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newConditionBean());
    }

    protected <RESULT, CB extends VendorConstraintNameAutoQuxCB> HpSLSFunction<CB, RESULT> doScalarSelect(final Class<RESULT> tp, final CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        HpSLSExecutor<CB, RESULT> executor = createHpSLSExecutor(); // variable to resolve generic
        return createSLSFunction(cb, tp, executor);
    }

    protected <RESULT> HpSLSFunction<? extends ConditionBean, RESULT> doReadScalar(Class<RESULT> tp) { return facadeScalarSelect(tp); }

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
     * @param vendorConstraintNameAutoQuxList The entity list of vendorConstraintNameAutoQux. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<VendorConstraintNameAutoQux> vendorConstraintNameAutoQuxList, ReferrerLoaderHandler<LoaderOfVendorConstraintNameAutoQux> handler) {
        xassLRArg(vendorConstraintNameAutoQuxList, handler);
        handler.handle(new LoaderOfVendorConstraintNameAutoQux().ready(vendorConstraintNameAutoQuxList, _behaviorSelector));
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
     * @param vendorConstraintNameAutoQux The entity of vendorConstraintNameAutoQux. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(VendorConstraintNameAutoQux vendorConstraintNameAutoQux, ReferrerLoaderHandler<LoaderOfVendorConstraintNameAutoQux> handler) {
        xassLRArg(vendorConstraintNameAutoQux, handler);
        handler.handle(new LoaderOfVendorConstraintNameAutoQux().ready(xnewLRAryLs(vendorConstraintNameAutoQux), _behaviorSelector));
    }

    /**
     * Load referrer of vendorConstraintNameAutoRefList by the set-upper of referrer. <br />
     * vendor_constraint_name_auto_ref by CONSTRAINT_NAME_AUTO_QUX_ID, named 'vendorConstraintNameAutoRefList'.
     * <pre>
     * vendorConstraintNameAutoQuxBhv.<span style="color: #DD4747">loadVendorConstraintNameAutoRefList</span>(vendorConstraintNameAutoQuxList, new ConditionBeanSetupper&lt;VendorConstraintNameAutoRefCB&gt;() {
     *     public void setup(VendorConstraintNameAutoRefCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (VendorConstraintNameAutoQux vendorConstraintNameAutoQux : vendorConstraintNameAutoQuxList) {
     *     ... = vendorConstraintNameAutoQux.<span style="color: #DD4747">getVendorConstraintNameAutoRefList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setConstraintNameAutoQuxId_InScope(pkList);
     * cb.query().addOrderBy_ConstraintNameAutoQuxId_Asc();
     * </pre>
     * @param vendorConstraintNameAutoQuxList The entity list of vendorConstraintNameAutoQux. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<VendorConstraintNameAutoRef> loadVendorConstraintNameAutoRefList(List<VendorConstraintNameAutoQux> vendorConstraintNameAutoQuxList, ConditionBeanSetupper<VendorConstraintNameAutoRefCB> setupper) {
        xassLRArg(vendorConstraintNameAutoQuxList, setupper);
        return doLoadVendorConstraintNameAutoRefList(vendorConstraintNameAutoQuxList, new LoadReferrerOption<VendorConstraintNameAutoRefCB, VendorConstraintNameAutoRef>().xinit(setupper));
    }

    /**
     * Load referrer of vendorConstraintNameAutoRefList by the set-upper of referrer. <br />
     * vendor_constraint_name_auto_ref by CONSTRAINT_NAME_AUTO_QUX_ID, named 'vendorConstraintNameAutoRefList'.
     * <pre>
     * vendorConstraintNameAutoQuxBhv.<span style="color: #DD4747">loadVendorConstraintNameAutoRefList</span>(vendorConstraintNameAutoQuxList, new ConditionBeanSetupper&lt;VendorConstraintNameAutoRefCB&gt;() {
     *     public void setup(VendorConstraintNameAutoRefCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = vendorConstraintNameAutoQux.<span style="color: #DD4747">getVendorConstraintNameAutoRefList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setConstraintNameAutoQuxId_InScope(pkList);
     * cb.query().addOrderBy_ConstraintNameAutoQuxId_Asc();
     * </pre>
     * @param vendorConstraintNameAutoQux The entity of vendorConstraintNameAutoQux. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<VendorConstraintNameAutoRef> loadVendorConstraintNameAutoRefList(VendorConstraintNameAutoQux vendorConstraintNameAutoQux, ConditionBeanSetupper<VendorConstraintNameAutoRefCB> setupper) {
        xassLRArg(vendorConstraintNameAutoQux, setupper);
        return doLoadVendorConstraintNameAutoRefList(xnewLRLs(vendorConstraintNameAutoQux), new LoadReferrerOption<VendorConstraintNameAutoRefCB, VendorConstraintNameAutoRef>().xinit(setupper));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param vendorConstraintNameAutoQux The entity of vendorConstraintNameAutoQux. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<VendorConstraintNameAutoRef> loadVendorConstraintNameAutoRefList(VendorConstraintNameAutoQux vendorConstraintNameAutoQux, LoadReferrerOption<VendorConstraintNameAutoRefCB, VendorConstraintNameAutoRef> loadReferrerOption) {
        xassLRArg(vendorConstraintNameAutoQux, loadReferrerOption);
        return loadVendorConstraintNameAutoRefList(xnewLRLs(vendorConstraintNameAutoQux), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean setupper.} #beforejava8
     * @param vendorConstraintNameAutoQuxList The entity list of vendorConstraintNameAutoQux. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<VendorConstraintNameAutoRef> loadVendorConstraintNameAutoRefList(List<VendorConstraintNameAutoQux> vendorConstraintNameAutoQuxList, LoadReferrerOption<VendorConstraintNameAutoRefCB, VendorConstraintNameAutoRef> loadReferrerOption) {
        xassLRArg(vendorConstraintNameAutoQuxList, loadReferrerOption);
        if (vendorConstraintNameAutoQuxList.isEmpty()) { return (NestedReferrerListGateway<VendorConstraintNameAutoRef>)EMPTY_NREF_LGWAY; }
        return doLoadVendorConstraintNameAutoRefList(vendorConstraintNameAutoQuxList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<VendorConstraintNameAutoRef> doLoadVendorConstraintNameAutoRefList(List<VendorConstraintNameAutoQux> vendorConstraintNameAutoQuxList, LoadReferrerOption<VendorConstraintNameAutoRefCB, VendorConstraintNameAutoRef> option) {
        return helpLoadReferrerInternally(vendorConstraintNameAutoQuxList, option, "vendorConstraintNameAutoRefList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key constraintNameAutoQuxId.
     * @param vendorConstraintNameAutoQuxList The list of vendorConstraintNameAutoQux. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractConstraintNameAutoQuxIdList(List<VendorConstraintNameAutoQux> vendorConstraintNameAutoQuxList)
    { return helpExtractListInternally(vendorConstraintNameAutoQuxList, "constraintNameAutoQuxId"); }

    /**
     * Extract the value list of (single) unique key constraintNameAutoQuxName.
     * @param vendorConstraintNameAutoQuxList The list of vendorConstraintNameAutoQux. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractConstraintNameAutoQuxNameList(List<VendorConstraintNameAutoQux> vendorConstraintNameAutoQuxList)
    { return helpExtractListInternally(vendorConstraintNameAutoQuxList, "constraintNameAutoQuxName"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * VendorConstraintNameAutoQux vendorConstraintNameAutoQux = new VendorConstraintNameAutoQux();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorConstraintNameAutoQux.setFoo...(value);
     * vendorConstraintNameAutoQux.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoQux.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoQux.set...;</span>
     * vendorConstraintNameAutoQuxBhv.<span style="color: #DD4747">insert</span>(vendorConstraintNameAutoQux);
     * ... = vendorConstraintNameAutoQux.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param vendorConstraintNameAutoQux The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(VendorConstraintNameAutoQux vendorConstraintNameAutoQux) {
        doInsert(vendorConstraintNameAutoQux, null);
    }

    protected void doInsert(VendorConstraintNameAutoQux et, InsertOption<VendorConstraintNameAutoQuxCB> op) {
        assertObjectNotNull("vendorConstraintNameAutoQux", et); prepareInsertOption(op); delegateInsert(et, op);
    }

    protected void prepareInsertOption(InsertOption<VendorConstraintNameAutoQuxCB> op) {
        if (op == null) { return; } assertInsertOptionStatus(op);
        if (op.hasSpecifiedInsertColumn()) { op.resolveInsertColumnSpecification(createCBForSpecifiedUpdate()); }
    }

    protected void doCreate(Entity et, InsertOption<? extends ConditionBean> op) { doInsert(downcast(et), downcast(op)); }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * VendorConstraintNameAutoQux vendorConstraintNameAutoQux = new VendorConstraintNameAutoQux();
     * vendorConstraintNameAutoQux.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorConstraintNameAutoQux.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoQux.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoQux.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendorConstraintNameAutoQux.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     vendorConstraintNameAutoQuxBhv.<span style="color: #DD4747">update</span>(vendorConstraintNameAutoQux);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorConstraintNameAutoQux The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(VendorConstraintNameAutoQux vendorConstraintNameAutoQux) {
        doUpdate(vendorConstraintNameAutoQux, null);
    }

    protected void doUpdate(VendorConstraintNameAutoQux et, UpdateOption<VendorConstraintNameAutoQuxCB> op) {
        assertObjectNotNull("vendorConstraintNameAutoQux", et); prepareUpdateOption(op); helpUpdateInternally(et, op);
    }

    protected void prepareUpdateOption(UpdateOption<VendorConstraintNameAutoQuxCB> op) {
        if (op == null) { return; } assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) { op.resolveSelfSpecification(createCBForVaryingUpdate()); }
        if (op.hasSpecifiedUpdateColumn()) { op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate()); }
    }

    protected VendorConstraintNameAutoQuxCB createCBForVaryingUpdate()
    { VendorConstraintNameAutoQuxCB cb = newConditionBean(); cb.xsetupForVaryingUpdate(); return cb; }

    protected VendorConstraintNameAutoQuxCB createCBForSpecifiedUpdate()
    { VendorConstraintNameAutoQuxCB cb = newConditionBean(); cb.xsetupForSpecifiedUpdate(); return cb; }

    protected void doModify(Entity et, UpdateOption<? extends ConditionBean> op) { doUpdate(downcast(et), downcast(op)); }

    protected void doModifyNonstrict(Entity et, UpdateOption<? extends ConditionBean> op)
    { doModify(et, op); }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param vendorConstraintNameAutoQux The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(VendorConstraintNameAutoQux vendorConstraintNameAutoQux) {
        doInsertOrUpdate(vendorConstraintNameAutoQux, null, null);
    }

    protected void doInsertOrUpdate(VendorConstraintNameAutoQux et, InsertOption<VendorConstraintNameAutoQuxCB> iop, UpdateOption<VendorConstraintNameAutoQuxCB> uop) {
        assertObjectNotNull("vendorConstraintNameAutoQux", et); helpInsertOrUpdateInternally(et, iop, uop);
    }

    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop)
    { doInsertOrUpdate(downcast(et), downcast(iop), downcast(uop)); }

    protected void doCreateOrModifyNonstrict(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop)
    { doCreateOrModify(et, iop, uop); }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * VendorConstraintNameAutoQux vendorConstraintNameAutoQux = new VendorConstraintNameAutoQux();
     * vendorConstraintNameAutoQux.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendorConstraintNameAutoQux.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     vendorConstraintNameAutoQuxBhv.<span style="color: #DD4747">delete</span>(vendorConstraintNameAutoQux);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorConstraintNameAutoQux The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(VendorConstraintNameAutoQux vendorConstraintNameAutoQux) {
        doDelete(vendorConstraintNameAutoQux, null);
    }

    protected void doDelete(VendorConstraintNameAutoQux et, final DeleteOption<VendorConstraintNameAutoQuxCB> op) {
        assertObjectNotNull("vendorConstraintNameAutoQux", et); prepareDeleteOption(op); helpDeleteInternally(et, op);
    }

    protected void prepareDeleteOption(DeleteOption<VendorConstraintNameAutoQuxCB> op) { if (op != null) { assertDeleteOptionStatus(op); } }

    protected void doRemove(Entity et, DeleteOption<? extends ConditionBean> op) { doDelete(downcast(et), downcast(op)); }

    protected void doRemoveNonstrict(Entity et, DeleteOption<? extends ConditionBean> op)
    { doRemove(et, op); }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch-insert the entity list modified-only of same-set columns. (DefaultConstraintsEnabled) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <p><span style="color: #DD4747; font-size: 120%">The columns of least common multiple are registered like this:</span></p>
     * <pre>
     * for (... : ...) {
     *     VendorConstraintNameAutoQux vendorConstraintNameAutoQux = new VendorConstraintNameAutoQux();
     *     vendorConstraintNameAutoQux.setFooName("foo");
     *     if (...) {
     *         vendorConstraintNameAutoQux.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     vendorConstraintNameAutoQuxList.add(vendorConstraintNameAutoQux);
     * }
     * vendorConstraintNameAutoQuxBhv.<span style="color: #DD4747">batchInsert</span>(vendorConstraintNameAutoQuxList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param vendorConstraintNameAutoQuxList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<VendorConstraintNameAutoQux> vendorConstraintNameAutoQuxList) {
        return doBatchInsert(vendorConstraintNameAutoQuxList, null);
    }

    protected int[] doBatchInsert(List<VendorConstraintNameAutoQux> ls, InsertOption<VendorConstraintNameAutoQuxCB> op) {
        assertObjectNotNull("vendorConstraintNameAutoQuxList", ls);
        InsertOption<VendorConstraintNameAutoQuxCB> rlop; if (op != null) { rlop = op; } else { rlop = createPlainInsertOption(); }
        prepareBatchInsertOption(ls, rlop); // required
        return delegateBatchInsert(ls, rlop);
    }

    protected void prepareBatchInsertOption(List<VendorConstraintNameAutoQux> ls, InsertOption<VendorConstraintNameAutoQuxCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(ls);
        prepareInsertOption(op);
    }

    protected int[] doLumpCreate(List<Entity> ls, InsertOption<? extends ConditionBean> op) { return doBatchInsert(downcast(ls), downcast(op)); }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     VendorConstraintNameAutoQux vendorConstraintNameAutoQux = new VendorConstraintNameAutoQux();
     *     vendorConstraintNameAutoQux.setFooName("foo");
     *     if (...) {
     *         vendorConstraintNameAutoQux.setFooPrice(123);
     *     } else {
     *         vendorConstraintNameAutoQux.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//vendorConstraintNameAutoQux.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     vendorConstraintNameAutoQuxList.add(vendorConstraintNameAutoQux);
     * }
     * vendorConstraintNameAutoQuxBhv.<span style="color: #DD4747">batchUpdate</span>(vendorConstraintNameAutoQuxList);
     * </pre>
     * @param vendorConstraintNameAutoQuxList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<VendorConstraintNameAutoQux> vendorConstraintNameAutoQuxList) {
        return doBatchUpdate(vendorConstraintNameAutoQuxList, null);
    }

    protected int[] doBatchUpdate(List<VendorConstraintNameAutoQux> ls, UpdateOption<VendorConstraintNameAutoQuxCB> op) {
        assertObjectNotNull("vendorConstraintNameAutoQuxList", ls);
        UpdateOption<VendorConstraintNameAutoQuxCB> rlop; if (op != null) { rlop = op; } else { rlop = createPlainUpdateOption(); }
        prepareBatchUpdateOption(ls, rlop); // required
        return delegateBatchUpdate(ls, rlop);
    }

    protected void prepareBatchUpdateOption(List<VendorConstraintNameAutoQux> ls, UpdateOption<VendorConstraintNameAutoQuxCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(ls);
        prepareUpdateOption(op);
    }

    protected int[] doLumpModify(List<Entity> ls, UpdateOption<? extends ConditionBean> op) { return doBatchUpdate(downcast(ls), downcast(op)); }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * vendorConstraintNameAutoQuxBhv.<span style="color: #DD4747">batchUpdate</span>(vendorConstraintNameAutoQuxList, new SpecifyQuery<VendorConstraintNameAutoQuxCB>() {
     *     public void specify(VendorConstraintNameAutoQuxCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * vendorConstraintNameAutoQuxBhv.<span style="color: #DD4747">batchUpdate</span>(vendorConstraintNameAutoQuxList, new SpecifyQuery<VendorConstraintNameAutoQuxCB>() {
     *     public void specify(VendorConstraintNameAutoQuxCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param vendorConstraintNameAutoQuxList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<VendorConstraintNameAutoQux> vendorConstraintNameAutoQuxList, SpecifyQuery<VendorConstraintNameAutoQuxCB> updateColumnSpec) {
        return doBatchUpdate(vendorConstraintNameAutoQuxList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op)
    { return doLumpModify(ls, op); }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param vendorConstraintNameAutoQuxList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<VendorConstraintNameAutoQux> vendorConstraintNameAutoQuxList) {
        return doBatchDelete(vendorConstraintNameAutoQuxList, null);
    }

    protected int[] doBatchDelete(List<VendorConstraintNameAutoQux> ls, DeleteOption<VendorConstraintNameAutoQuxCB> op) {
        assertObjectNotNull("vendorConstraintNameAutoQuxList", ls);
        prepareDeleteOption(op);
        return delegateBatchDelete(ls, op);
    }

    protected int[] doLumpRemove(List<Entity> ls, DeleteOption<? extends ConditionBean> op) { return doBatchDelete(downcast(ls), downcast(op)); }

    protected int[] doLumpRemoveNonstrict(List<Entity> ls, DeleteOption<? extends ConditionBean> op)
    { return doLumpRemove(ls, op); }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * vendorConstraintNameAutoQuxBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;VendorConstraintNameAutoQux, VendorConstraintNameAutoQuxCB&gt;() {
     *     public ConditionBean setup(vendorConstraintNameAutoQux entity, VendorConstraintNameAutoQuxCB intoCB) {
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
     * @param setupper The setup-per of query-insert. (NotNull)
     * @return The inserted count.
     */
    public int queryInsert(QueryInsertSetupper<VendorConstraintNameAutoQux, VendorConstraintNameAutoQuxCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<VendorConstraintNameAutoQux, VendorConstraintNameAutoQuxCB> sp, InsertOption<VendorConstraintNameAutoQuxCB> op) {
        assertObjectNotNull("setupper", sp); prepareInsertOption(op);
        VendorConstraintNameAutoQux et = newEntity(); VendorConstraintNameAutoQuxCB cb = createCBForQueryInsert();
        return delegateQueryInsert(et, cb, sp.setup(et, cb), op);
    }

    protected VendorConstraintNameAutoQuxCB createCBForQueryInsert()
    { VendorConstraintNameAutoQuxCB cb = newConditionBean(); cb.xsetupForQueryInsert(); return cb; }

    protected int doRangeCreate(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> setupper, InsertOption<? extends ConditionBean> op)
    { return doQueryInsert(downcast(setupper), downcast(op)); }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * VendorConstraintNameAutoQux vendorConstraintNameAutoQux = new VendorConstraintNameAutoQux();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoQux.setPK...(value);</span>
     * vendorConstraintNameAutoQux.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoQux.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoQux.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoQux.setVersionNo(value);</span>
     * VendorConstraintNameAutoQuxCB cb = new VendorConstraintNameAutoQuxCB();
     * cb.query().setFoo...(value);
     * vendorConstraintNameAutoQuxBhv.<span style="color: #DD4747">queryUpdate</span>(vendorConstraintNameAutoQux, cb);
     * </pre>
     * @param vendorConstraintNameAutoQux The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of VendorConstraintNameAutoQux. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(VendorConstraintNameAutoQux vendorConstraintNameAutoQux, VendorConstraintNameAutoQuxCB cb) {
        return doQueryUpdate(vendorConstraintNameAutoQux, cb, null);
    }

    protected int doQueryUpdate(VendorConstraintNameAutoQux et, VendorConstraintNameAutoQuxCB cb, UpdateOption<VendorConstraintNameAutoQuxCB> op) {
        assertObjectNotNull("vendorConstraintNameAutoQux", et); assertCBStateValid(cb); prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(et, cb, op) : 0;
    }

    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op)
    { return doQueryUpdate(downcast(et), downcast(cb), downcast(op)); }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * VendorConstraintNameAutoQuxCB cb = new VendorConstraintNameAutoQuxCB();
     * cb.query().setFoo...(value);
     * vendorConstraintNameAutoQuxBhv.<span style="color: #DD4747">queryDelete</span>(vendorConstraintNameAutoQux, cb);
     * </pre>
     * @param cb The condition-bean of VendorConstraintNameAutoQux. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(VendorConstraintNameAutoQuxCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(VendorConstraintNameAutoQuxCB cb, DeleteOption<VendorConstraintNameAutoQuxCB> op) {
        assertCBStateValid(cb); prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) { return doQueryDelete(downcast(cb), downcast(op)); }

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
     * VendorConstraintNameAutoQux vendorConstraintNameAutoQux = new VendorConstraintNameAutoQux();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorConstraintNameAutoQux.setFoo...(value);
     * vendorConstraintNameAutoQux.setBar...(value);
     * InsertOption<VendorConstraintNameAutoQuxCB> option = new InsertOption<VendorConstraintNameAutoQuxCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * vendorConstraintNameAutoQuxBhv.<span style="color: #DD4747">varyingInsert</span>(vendorConstraintNameAutoQux, option);
     * ... = vendorConstraintNameAutoQux.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param vendorConstraintNameAutoQux The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(VendorConstraintNameAutoQux vendorConstraintNameAutoQux, InsertOption<VendorConstraintNameAutoQuxCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(vendorConstraintNameAutoQux, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * VendorConstraintNameAutoQux vendorConstraintNameAutoQux = new VendorConstraintNameAutoQux();
     * vendorConstraintNameAutoQux.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorConstraintNameAutoQux.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendorConstraintNameAutoQux.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;VendorConstraintNameAutoQuxCB&gt; option = new UpdateOption&lt;VendorConstraintNameAutoQuxCB&gt;();
     *     option.self(new SpecifyQuery&lt;VendorConstraintNameAutoQuxCB&gt;() {
     *         public void specify(VendorConstraintNameAutoQuxCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     vendorConstraintNameAutoQuxBhv.<span style="color: #DD4747">varyingUpdate</span>(vendorConstraintNameAutoQux, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorConstraintNameAutoQux The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(VendorConstraintNameAutoQux vendorConstraintNameAutoQux, UpdateOption<VendorConstraintNameAutoQuxCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(vendorConstraintNameAutoQux, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param vendorConstraintNameAutoQux The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(VendorConstraintNameAutoQux vendorConstraintNameAutoQux, InsertOption<VendorConstraintNameAutoQuxCB> insertOption, UpdateOption<VendorConstraintNameAutoQuxCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdate(vendorConstraintNameAutoQux, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param vendorConstraintNameAutoQux The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(VendorConstraintNameAutoQux vendorConstraintNameAutoQux, DeleteOption<VendorConstraintNameAutoQuxCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(vendorConstraintNameAutoQux, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param vendorConstraintNameAutoQuxList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<VendorConstraintNameAutoQux> vendorConstraintNameAutoQuxList, InsertOption<VendorConstraintNameAutoQuxCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(vendorConstraintNameAutoQuxList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param vendorConstraintNameAutoQuxList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<VendorConstraintNameAutoQux> vendorConstraintNameAutoQuxList, UpdateOption<VendorConstraintNameAutoQuxCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(vendorConstraintNameAutoQuxList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param vendorConstraintNameAutoQuxList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<VendorConstraintNameAutoQux> vendorConstraintNameAutoQuxList, DeleteOption<VendorConstraintNameAutoQuxCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(vendorConstraintNameAutoQuxList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<VendorConstraintNameAutoQux, VendorConstraintNameAutoQuxCB> setupper, InsertOption<VendorConstraintNameAutoQuxCB> option) {
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
     * VendorConstraintNameAutoQux vendorConstraintNameAutoQux = new VendorConstraintNameAutoQux();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoQux.setPK...(value);</span>
     * vendorConstraintNameAutoQux.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorConstraintNameAutoQux.setVersionNo(value);</span>
     * VendorConstraintNameAutoQuxCB cb = new VendorConstraintNameAutoQuxCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;VendorConstraintNameAutoQuxCB&gt; option = new UpdateOption&lt;VendorConstraintNameAutoQuxCB&gt;();
     * option.self(new SpecifyQuery&lt;VendorConstraintNameAutoQuxCB&gt;() {
     *     public void specify(VendorConstraintNameAutoQuxCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * vendorConstraintNameAutoQuxBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(vendorConstraintNameAutoQux, cb, option);
     * </pre>
     * @param vendorConstraintNameAutoQux The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of VendorConstraintNameAutoQux. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(VendorConstraintNameAutoQux vendorConstraintNameAutoQux, VendorConstraintNameAutoQuxCB cb, UpdateOption<VendorConstraintNameAutoQuxCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(vendorConstraintNameAutoQux, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of VendorConstraintNameAutoQux. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(VendorConstraintNameAutoQuxCB cb, DeleteOption<VendorConstraintNameAutoQuxCB> option) {
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
    public OutsideSqlBasicExecutor<VendorConstraintNameAutoQuxBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    protected Class<VendorConstraintNameAutoQux> typeOfSelectedEntity() { return VendorConstraintNameAutoQux.class; }
    protected VendorConstraintNameAutoQux downcast(Entity et) { return helpEntityDowncastInternally(et, VendorConstraintNameAutoQux.class); }
    protected VendorConstraintNameAutoQuxCB downcast(ConditionBean cb) { return helpConditionBeanDowncastInternally(cb, VendorConstraintNameAutoQuxCB.class); }
    @SuppressWarnings("unchecked")
    protected List<VendorConstraintNameAutoQux> downcast(List<? extends Entity> ls) { return (List<VendorConstraintNameAutoQux>)ls; }
    @SuppressWarnings("unchecked")
    protected InsertOption<VendorConstraintNameAutoQuxCB> downcast(InsertOption<? extends ConditionBean> op) { return (InsertOption<VendorConstraintNameAutoQuxCB>)op; }
    @SuppressWarnings("unchecked")
    protected UpdateOption<VendorConstraintNameAutoQuxCB> downcast(UpdateOption<? extends ConditionBean> op) { return (UpdateOption<VendorConstraintNameAutoQuxCB>)op; }
    @SuppressWarnings("unchecked")
    protected DeleteOption<VendorConstraintNameAutoQuxCB> downcast(DeleteOption<? extends ConditionBean> op) { return (DeleteOption<VendorConstraintNameAutoQuxCB>)op; }
    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<VendorConstraintNameAutoQux, VendorConstraintNameAutoQuxCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp)
    { return (QueryInsertSetupper<VendorConstraintNameAutoQux, VendorConstraintNameAutoQuxCB>)sp; }
}
