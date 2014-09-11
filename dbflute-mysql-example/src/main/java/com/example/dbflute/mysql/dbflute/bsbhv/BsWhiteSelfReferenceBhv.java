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
 * The behavior of WHITE_SELF_REFERENCE as TABLE. <br />
 * <pre>
 * [primary key]
 *     SELF_REFERENCE_ID
 *
 * [column]
 *     SELF_REFERENCE_ID, SELF_REFERENCE_NAME, PARENT_ID
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
 *     white_self_reference, white_self_reference_ref_one(ByParentId)
 *
 * [referrer table]
 *     white_self_reference, white_self_reference_ref_one
 *
 * [foreign property]
 *     whiteSelfReferenceSelf, whiteSelfReferenceRefOneByParentId, whiteSelfReferenceRefOneAsOne
 *
 * [referrer property]
 *     whiteSelfReferenceSelfList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteSelfReferenceBhv extends AbstractBehaviorWritable<WhiteSelfReference, WhiteSelfReferenceCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public WhiteSelfReferenceDbm getDBMeta() { return WhiteSelfReferenceDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteSelfReferenceDbm getMyDBMeta() { return WhiteSelfReferenceDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhiteSelfReferenceCB newConditionBean() { return new WhiteSelfReferenceCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteSelfReference newMyEntity() { return new WhiteSelfReference(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteSelfReferenceCB newMyConditionBean() { return new WhiteSelfReferenceCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteSelfReferenceCB cb = new WhiteSelfReferenceCB();
     * cb.query().setFoo...(value);
     * int count = whiteSelfReferenceBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteSelfReference. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteSelfReferenceCB cb) {
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
     * WhiteSelfReferenceCB cb = new WhiteSelfReferenceCB();
     * cb.query().setFoo...(value);
     * WhiteSelfReference whiteSelfReference = whiteSelfReferenceBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (whiteSelfReference != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = whiteSelfReference.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSelfReference. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSelfReference selectEntity(WhiteSelfReferenceCB cb) {
        return facadeSelectEntity(cb);
    }

    protected WhiteSelfReference facadeSelectEntity(WhiteSelfReferenceCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteSelfReference> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteSelfReferenceCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * WhiteSelfReferenceCB cb = new WhiteSelfReferenceCB();
     * cb.query().setFoo...(value);
     * WhiteSelfReference whiteSelfReference = whiteSelfReferenceBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteSelfReference.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteSelfReference. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSelfReference selectEntityWithDeletedCheck(WhiteSelfReferenceCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param selfReferenceId : PK, NotNull, DECIMAL(16). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSelfReference selectByPKValue(Long selfReferenceId) {
        return facadeSelectByPKValue(selfReferenceId);
    }

    protected WhiteSelfReference facadeSelectByPKValue(Long selfReferenceId) {
        return doSelectByPK(selfReferenceId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteSelfReference> ENTITY doSelectByPK(Long selfReferenceId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(selfReferenceId), tp);
    }

    protected <ENTITY extends WhiteSelfReference> OptionalEntity<ENTITY> doSelectOptionalByPK(Long selfReferenceId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(selfReferenceId, tp), selfReferenceId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param selfReferenceId : PK, NotNull, DECIMAL(16). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSelfReference selectByPKValueWithDeletedCheck(Long selfReferenceId) {
        return doSelectByPKWithDeletedCheck(selfReferenceId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteSelfReference> ENTITY doSelectByPKWithDeletedCheck(Long selfReferenceId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(selfReferenceId), tp);
    }

    protected WhiteSelfReferenceCB xprepareCBAsPK(Long selfReferenceId) {
        assertObjectNotNull("selfReferenceId", selfReferenceId);
        return newConditionBean().acceptPK(selfReferenceId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteSelfReferenceCB cb = new WhiteSelfReferenceCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteSelfReference&gt; whiteSelfReferenceList = whiteSelfReferenceBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteSelfReference whiteSelfReference : whiteSelfReferenceList) {
     *     ... = whiteSelfReference.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSelfReference. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteSelfReference> selectList(WhiteSelfReferenceCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * WhiteSelfReferenceCB cb = new WhiteSelfReferenceCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteSelfReference&gt; page = whiteSelfReferenceBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteSelfReference whiteSelfReference : page) {
     *     ... = whiteSelfReference.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSelfReference. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteSelfReference> selectPage(WhiteSelfReferenceCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteSelfReferenceCB cb = new WhiteSelfReferenceCB();
     * cb.query().setFoo...(value);
     * whiteSelfReferenceBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteSelfReference&gt;() {
     *     public void handle(WhiteSelfReference entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteSelfReference. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteSelfReference. (NotNull)
     */
    public void selectCursor(WhiteSelfReferenceCB cb, EntityRowHandler<WhiteSelfReference> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteSelfReferenceBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteSelfReferenceCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhiteSelfReferenceCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param whiteSelfReferenceList The entity list of whiteSelfReference. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhiteSelfReference> whiteSelfReferenceList, ReferrerLoaderHandler<LoaderOfWhiteSelfReference> handler) {
        xassLRArg(whiteSelfReferenceList, handler);
        handler.handle(new LoaderOfWhiteSelfReference().ready(whiteSelfReferenceList, _behaviorSelector));
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
     * @param whiteSelfReference The entity of whiteSelfReference. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhiteSelfReference whiteSelfReference, ReferrerLoaderHandler<LoaderOfWhiteSelfReference> handler) {
        xassLRArg(whiteSelfReference, handler);
        handler.handle(new LoaderOfWhiteSelfReference().ready(xnewLRAryLs(whiteSelfReference), _behaviorSelector));
    }

    /**
     * Load referrer of whiteSelfReferenceSelfList by the set-upper of referrer. <br />
     * white_self_reference by PARENT_ID, named 'whiteSelfReferenceSelfList'.
     * <pre>
     * whiteSelfReferenceBhv.<span style="color: #DD4747">loadWhiteSelfReferenceSelfList</span>(whiteSelfReferenceList, new ConditionBeanSetupper&lt;WhiteSelfReferenceCB&gt;() {
     *     public void setup(WhiteSelfReferenceCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (WhiteSelfReference whiteSelfReference : whiteSelfReferenceList) {
     *     ... = whiteSelfReference.<span style="color: #DD4747">getWhiteSelfReferenceSelfList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setParentId_InScope(pkList);
     * cb.query().addOrderBy_ParentId_Asc();
     * </pre>
     * @param whiteSelfReferenceList The entity list of whiteSelfReference. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteSelfReference> loadWhiteSelfReferenceSelfList(List<WhiteSelfReference> whiteSelfReferenceList, ConditionBeanSetupper<WhiteSelfReferenceCB> setupper) {
        xassLRArg(whiteSelfReferenceList, setupper);
        return doLoadWhiteSelfReferenceSelfList(whiteSelfReferenceList, new LoadReferrerOption<WhiteSelfReferenceCB, WhiteSelfReference>().xinit(setupper));
    }

    /**
     * Load referrer of whiteSelfReferenceSelfList by the set-upper of referrer. <br />
     * white_self_reference by PARENT_ID, named 'whiteSelfReferenceSelfList'.
     * <pre>
     * whiteSelfReferenceBhv.<span style="color: #DD4747">loadWhiteSelfReferenceSelfList</span>(whiteSelfReferenceList, new ConditionBeanSetupper&lt;WhiteSelfReferenceCB&gt;() {
     *     public void setup(WhiteSelfReferenceCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = whiteSelfReference.<span style="color: #DD4747">getWhiteSelfReferenceSelfList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setParentId_InScope(pkList);
     * cb.query().addOrderBy_ParentId_Asc();
     * </pre>
     * @param whiteSelfReference The entity of whiteSelfReference. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteSelfReference> loadWhiteSelfReferenceSelfList(WhiteSelfReference whiteSelfReference, ConditionBeanSetupper<WhiteSelfReferenceCB> setupper) {
        xassLRArg(whiteSelfReference, setupper);
        return doLoadWhiteSelfReferenceSelfList(xnewLRLs(whiteSelfReference), new LoadReferrerOption<WhiteSelfReferenceCB, WhiteSelfReference>().xinit(setupper));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param whiteSelfReference The entity of whiteSelfReference. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteSelfReference> loadWhiteSelfReferenceSelfList(WhiteSelfReference whiteSelfReference, LoadReferrerOption<WhiteSelfReferenceCB, WhiteSelfReference> loadReferrerOption) {
        xassLRArg(whiteSelfReference, loadReferrerOption);
        return loadWhiteSelfReferenceSelfList(xnewLRLs(whiteSelfReference), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param whiteSelfReferenceList The entity list of whiteSelfReference. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WhiteSelfReference> loadWhiteSelfReferenceSelfList(List<WhiteSelfReference> whiteSelfReferenceList, LoadReferrerOption<WhiteSelfReferenceCB, WhiteSelfReference> loadReferrerOption) {
        xassLRArg(whiteSelfReferenceList, loadReferrerOption);
        if (whiteSelfReferenceList.isEmpty()) { return (NestedReferrerListGateway<WhiteSelfReference>)EMPTY_NREF_LGWAY; }
        return doLoadWhiteSelfReferenceSelfList(whiteSelfReferenceList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WhiteSelfReference> doLoadWhiteSelfReferenceSelfList(List<WhiteSelfReference> whiteSelfReferenceList, LoadReferrerOption<WhiteSelfReferenceCB, WhiteSelfReference> option) {
        return helpLoadReferrerInternally(whiteSelfReferenceList, option, "whiteSelfReferenceSelfList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'WhiteSelfReference'.
     * @param whiteSelfReferenceList The list of whiteSelfReference. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteSelfReference> pulloutWhiteSelfReferenceSelf(List<WhiteSelfReference> whiteSelfReferenceList)
    { return helpPulloutInternally(whiteSelfReferenceList, "whiteSelfReferenceSelf"); }

    /**
     * Pull out the list of foreign table 'WhiteSelfReferenceRefOne'.
     * @param whiteSelfReferenceList The list of whiteSelfReference. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteSelfReferenceRefOne> pulloutWhiteSelfReferenceRefOneByParentId(List<WhiteSelfReference> whiteSelfReferenceList)
    { return helpPulloutInternally(whiteSelfReferenceList, "whiteSelfReferenceRefOneByParentId"); }

    /**
     * Pull out the list of referrer-as-one table 'WhiteSelfReferenceRefOne'.
     * @param whiteSelfReferenceList The list of whiteSelfReference. (NotNull, EmptyAllowed)
     * @return The list of referrer-as-one table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteSelfReferenceRefOne> pulloutWhiteSelfReferenceRefOneAsOne(List<WhiteSelfReference> whiteSelfReferenceList)
    { return helpPulloutInternally(whiteSelfReferenceList, "whiteSelfReferenceRefOneAsOne"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key selfReferenceId.
     * @param whiteSelfReferenceList The list of whiteSelfReference. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractSelfReferenceIdList(List<WhiteSelfReference> whiteSelfReferenceList)
    { return helpExtractListInternally(whiteSelfReferenceList, "selfReferenceId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteSelfReference whiteSelfReference = new WhiteSelfReference();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteSelfReference.setFoo...(value);
     * whiteSelfReference.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSelfReference.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSelfReference.set...;</span>
     * whiteSelfReferenceBhv.<span style="color: #DD4747">insert</span>(whiteSelfReference);
     * ... = whiteSelfReference.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteSelfReference The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteSelfReference whiteSelfReference) {
        doInsert(whiteSelfReference, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteSelfReference whiteSelfReference = new WhiteSelfReference();
     * whiteSelfReference.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteSelfReference.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSelfReference.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSelfReference.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteSelfReference.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteSelfReferenceBhv.<span style="color: #DD4747">update</span>(whiteSelfReference);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSelfReference The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhiteSelfReference whiteSelfReference) {
        doUpdate(whiteSelfReference, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param whiteSelfReference The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteSelfReference whiteSelfReference) {
        doInsertOrUpdate(whiteSelfReference, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteSelfReference whiteSelfReference = new WhiteSelfReference();
     * whiteSelfReference.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteSelfReference.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteSelfReferenceBhv.<span style="color: #DD4747">delete</span>(whiteSelfReference);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSelfReference The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteSelfReference whiteSelfReference) {
        doDelete(whiteSelfReference, null);
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
     *     WhiteSelfReference whiteSelfReference = new WhiteSelfReference();
     *     whiteSelfReference.setFooName("foo");
     *     if (...) {
     *         whiteSelfReference.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteSelfReferenceList.add(whiteSelfReference);
     * }
     * whiteSelfReferenceBhv.<span style="color: #DD4747">batchInsert</span>(whiteSelfReferenceList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteSelfReferenceList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteSelfReference> whiteSelfReferenceList) {
        return doBatchInsert(whiteSelfReferenceList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhiteSelfReference whiteSelfReference = new WhiteSelfReference();
     *     whiteSelfReference.setFooName("foo");
     *     if (...) {
     *         whiteSelfReference.setFooPrice(123);
     *     } else {
     *         whiteSelfReference.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteSelfReference.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteSelfReferenceList.add(whiteSelfReference);
     * }
     * whiteSelfReferenceBhv.<span style="color: #DD4747">batchUpdate</span>(whiteSelfReferenceList);
     * </pre>
     * @param whiteSelfReferenceList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteSelfReference> whiteSelfReferenceList) {
        return doBatchUpdate(whiteSelfReferenceList, null);
    }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * whiteSelfReferenceBhv.<span style="color: #DD4747">batchUpdate</span>(whiteSelfReferenceList, new SpecifyQuery<WhiteSelfReferenceCB>() {
     *     public void specify(WhiteSelfReferenceCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteSelfReferenceBhv.<span style="color: #DD4747">batchUpdate</span>(whiteSelfReferenceList, new SpecifyQuery<WhiteSelfReferenceCB>() {
     *     public void specify(WhiteSelfReferenceCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteSelfReferenceList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteSelfReference> whiteSelfReferenceList, SpecifyQuery<WhiteSelfReferenceCB> updateColumnSpec) {
        return doBatchUpdate(whiteSelfReferenceList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteSelfReferenceList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteSelfReference> whiteSelfReferenceList) {
        return doBatchDelete(whiteSelfReferenceList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * whiteSelfReferenceBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteSelfReference, WhiteSelfReferenceCB&gt;() {
     *     public ConditionBean setup(WhiteSelfReference entity, WhiteSelfReferenceCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteSelfReference, WhiteSelfReferenceCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteSelfReference whiteSelfReference = new WhiteSelfReference();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSelfReference.setPK...(value);</span>
     * whiteSelfReference.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSelfReference.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSelfReference.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSelfReference.setVersionNo(value);</span>
     * WhiteSelfReferenceCB cb = new WhiteSelfReferenceCB();
     * cb.query().setFoo...(value);
     * whiteSelfReferenceBhv.<span style="color: #DD4747">queryUpdate</span>(whiteSelfReference, cb);
     * </pre>
     * @param whiteSelfReference The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteSelfReference. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteSelfReference whiteSelfReference, WhiteSelfReferenceCB cb) {
        return doQueryUpdate(whiteSelfReference, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteSelfReferenceCB cb = new WhiteSelfReferenceCB();
     * cb.query().setFoo...(value);
     * whiteSelfReferenceBhv.<span style="color: #DD4747">queryDelete</span>(whiteSelfReference, cb);
     * </pre>
     * @param cb The condition-bean of WhiteSelfReference. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteSelfReferenceCB cb) {
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
     * WhiteSelfReference whiteSelfReference = new WhiteSelfReference();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteSelfReference.setFoo...(value);
     * whiteSelfReference.setBar...(value);
     * InsertOption<WhiteSelfReferenceCB> option = new InsertOption<WhiteSelfReferenceCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteSelfReferenceBhv.<span style="color: #DD4747">varyingInsert</span>(whiteSelfReference, option);
     * ... = whiteSelfReference.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteSelfReference The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteSelfReference whiteSelfReference, InsertOption<WhiteSelfReferenceCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteSelfReference, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteSelfReference whiteSelfReference = new WhiteSelfReference();
     * whiteSelfReference.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteSelfReference.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteSelfReference.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteSelfReferenceCB&gt; option = new UpdateOption&lt;WhiteSelfReferenceCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteSelfReferenceCB&gt;() {
     *         public void specify(WhiteSelfReferenceCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteSelfReferenceBhv.<span style="color: #DD4747">varyingUpdate</span>(whiteSelfReference, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSelfReference The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteSelfReference whiteSelfReference, UpdateOption<WhiteSelfReferenceCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteSelfReference, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteSelfReference The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteSelfReference whiteSelfReference, InsertOption<WhiteSelfReferenceCB> insertOption, UpdateOption<WhiteSelfReferenceCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdate(whiteSelfReference, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteSelfReference The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteSelfReference whiteSelfReference, DeleteOption<WhiteSelfReferenceCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteSelfReference, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteSelfReferenceList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteSelfReference> whiteSelfReferenceList, InsertOption<WhiteSelfReferenceCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteSelfReferenceList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteSelfReferenceList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteSelfReference> whiteSelfReferenceList, UpdateOption<WhiteSelfReferenceCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteSelfReferenceList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteSelfReferenceList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteSelfReference> whiteSelfReferenceList, DeleteOption<WhiteSelfReferenceCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteSelfReferenceList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteSelfReference, WhiteSelfReferenceCB> setupper, InsertOption<WhiteSelfReferenceCB> option) {
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
     * WhiteSelfReference whiteSelfReference = new WhiteSelfReference();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSelfReference.setPK...(value);</span>
     * whiteSelfReference.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSelfReference.setVersionNo(value);</span>
     * WhiteSelfReferenceCB cb = new WhiteSelfReferenceCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteSelfReferenceCB&gt; option = new UpdateOption&lt;WhiteSelfReferenceCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteSelfReferenceCB&gt;() {
     *     public void specify(WhiteSelfReferenceCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteSelfReferenceBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteSelfReference, cb, option);
     * </pre>
     * @param whiteSelfReference The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteSelfReference. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteSelfReference whiteSelfReference, WhiteSelfReferenceCB cb, UpdateOption<WhiteSelfReferenceCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteSelfReference, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteSelfReference. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteSelfReferenceCB cb, DeleteOption<WhiteSelfReferenceCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteSelfReferenceBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends WhiteSelfReference> typeOfSelectedEntity() { return WhiteSelfReference.class; }
    protected Class<WhiteSelfReference> typeOfHandlingEntity() { return WhiteSelfReference.class; }
    protected Class<WhiteSelfReferenceCB> typeOfHandlingConditionBean() { return WhiteSelfReferenceCB.class; }
}
