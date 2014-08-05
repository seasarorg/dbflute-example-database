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
 * The behavior of WHITE_VARIANT_RELATION_REFERRER as TABLE. <br />
 * <pre>
 * [primary key]
 *     REFERRER_ID
 *
 * [column]
 *     REFERRER_ID, VARIANT_MASTER_ID, MASTER_TYPE_CODE
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
 *     WHITE_VARIANT_RELATION_MASTER_FOO(AsVariant), WHITE_VARIANT_RELATION_MASTER_BAR(AsVariant), WHITE_VARIANT_RELATION_MASTER_QUX(AsVariantByQue), WHITE_VARIANT_RELATION_MASTER_CORGE(AsVariantByQuxType)
 *
 * [referrer table]
 *     white_variant_relation_referrer_ref
 *
 * [foreign property]
 *     whiteVariantRelationMasterFooAsVariant, whiteVariantRelationMasterBarAsVariant, whiteVariantRelationMasterQuxAsVariantByQue, whiteVariantRelationMasterCorgeAsVariantByQuxType
 *
 * [referrer property]
 *     whiteVariantRelationReferrerRefList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteVariantRelationReferrerBhv extends AbstractBehaviorWritable<WhiteVariantRelationReferrer, WhiteVariantRelationReferrerCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public DBMeta getDBMeta() { return WhiteVariantRelationReferrerDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteVariantRelationReferrerDbm getMyDBMeta() { return WhiteVariantRelationReferrerDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhiteVariantRelationReferrerCB newConditionBean() { return new WhiteVariantRelationReferrerCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteVariantRelationReferrer newMyEntity() { return new WhiteVariantRelationReferrer(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteVariantRelationReferrerCB newMyConditionBean() { return new WhiteVariantRelationReferrerCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB();
     * cb.query().setFoo...(value);
     * int count = whiteVariantRelationReferrerBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationReferrer. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteVariantRelationReferrerCB cb) {
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
     * WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB();
     * cb.query().setFoo...(value);
     * WhiteVariantRelationReferrer whiteVariantRelationReferrer = whiteVariantRelationReferrerBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (whiteVariantRelationReferrer != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = whiteVariantRelationReferrer.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationReferrer. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteVariantRelationReferrer selectEntity(WhiteVariantRelationReferrerCB cb) {
        return facadeSelectEntity(cb);
    }

    protected WhiteVariantRelationReferrer facadeSelectEntity(WhiteVariantRelationReferrerCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteVariantRelationReferrer> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteVariantRelationReferrerCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB();
     * cb.query().setFoo...(value);
     * WhiteVariantRelationReferrer whiteVariantRelationReferrer = whiteVariantRelationReferrerBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteVariantRelationReferrer.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationReferrer. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteVariantRelationReferrer selectEntityWithDeletedCheck(WhiteVariantRelationReferrerCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param referrerId : PK, NotNull, BIGINT(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteVariantRelationReferrer selectByPKValue(Long referrerId) {
        return facadeSelectByPKValue(referrerId);
    }

    protected WhiteVariantRelationReferrer facadeSelectByPKValue(Long referrerId) {
        return doSelectByPK(referrerId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteVariantRelationReferrer> ENTITY doSelectByPK(Long referrerId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(referrerId), tp);
    }

    protected <ENTITY extends WhiteVariantRelationReferrer> OptionalEntity<ENTITY> doSelectOptionalByPK(Long referrerId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(referrerId, tp), referrerId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param referrerId : PK, NotNull, BIGINT(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteVariantRelationReferrer selectByPKValueWithDeletedCheck(Long referrerId) {
        return doSelectByPKWithDeletedCheck(referrerId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteVariantRelationReferrer> ENTITY doSelectByPKWithDeletedCheck(Long referrerId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(referrerId), tp);
    }

    protected WhiteVariantRelationReferrerCB xprepareCBAsPK(Long referrerId) {
        assertObjectNotNull("referrerId", referrerId);
        return newConditionBean().acceptPK(referrerId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteVariantRelationReferrer&gt; whiteVariantRelationReferrerList = whiteVariantRelationReferrerBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteVariantRelationReferrer whiteVariantRelationReferrer : whiteVariantRelationReferrerList) {
     *     ... = whiteVariantRelationReferrer.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationReferrer. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteVariantRelationReferrer> selectList(WhiteVariantRelationReferrerCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteVariantRelationReferrer&gt; page = whiteVariantRelationReferrerBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteVariantRelationReferrer whiteVariantRelationReferrer : page) {
     *     ... = whiteVariantRelationReferrer.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationReferrer. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteVariantRelationReferrer> selectPage(WhiteVariantRelationReferrerCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB();
     * cb.query().setFoo...(value);
     * whiteVariantRelationReferrerBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteVariantRelationReferrer&gt;() {
     *     public void handle(WhiteVariantRelationReferrer entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationReferrer. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteVariantRelationReferrer. (NotNull)
     */
    public void selectCursor(WhiteVariantRelationReferrerCB cb, EntityRowHandler<WhiteVariantRelationReferrer> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteVariantRelationReferrerBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteVariantRelationReferrerCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhiteVariantRelationReferrerCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param whiteVariantRelationReferrerList The entity list of whiteVariantRelationReferrer. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhiteVariantRelationReferrer> whiteVariantRelationReferrerList, ReferrerLoaderHandler<LoaderOfWhiteVariantRelationReferrer> handler) {
        xassLRArg(whiteVariantRelationReferrerList, handler);
        handler.handle(new LoaderOfWhiteVariantRelationReferrer().ready(whiteVariantRelationReferrerList, _behaviorSelector));
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
     * @param whiteVariantRelationReferrer The entity of whiteVariantRelationReferrer. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhiteVariantRelationReferrer whiteVariantRelationReferrer, ReferrerLoaderHandler<LoaderOfWhiteVariantRelationReferrer> handler) {
        xassLRArg(whiteVariantRelationReferrer, handler);
        handler.handle(new LoaderOfWhiteVariantRelationReferrer().ready(xnewLRAryLs(whiteVariantRelationReferrer), _behaviorSelector));
    }

    /**
     * Load referrer of whiteVariantRelationReferrerRefList by the set-upper of referrer. <br />
     * white_variant_relation_referrer_ref by REFERRER_ID, named 'whiteVariantRelationReferrerRefList'.
     * <pre>
     * whiteVariantRelationReferrerBhv.<span style="color: #DD4747">loadWhiteVariantRelationReferrerRefList</span>(whiteVariantRelationReferrerList, new ConditionBeanSetupper&lt;WhiteVariantRelationReferrerRefCB&gt;() {
     *     public void setup(WhiteVariantRelationReferrerRefCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (WhiteVariantRelationReferrer whiteVariantRelationReferrer : whiteVariantRelationReferrerList) {
     *     ... = whiteVariantRelationReferrer.<span style="color: #DD4747">getWhiteVariantRelationReferrerRefList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setReferrerId_InScope(pkList);
     * cb.query().addOrderBy_ReferrerId_Asc();
     * </pre>
     * @param whiteVariantRelationReferrerList The entity list of whiteVariantRelationReferrer. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteVariantRelationReferrerRef> loadWhiteVariantRelationReferrerRefList(List<WhiteVariantRelationReferrer> whiteVariantRelationReferrerList, ConditionBeanSetupper<WhiteVariantRelationReferrerRefCB> setupper) {
        xassLRArg(whiteVariantRelationReferrerList, setupper);
        return doLoadWhiteVariantRelationReferrerRefList(whiteVariantRelationReferrerList, new LoadReferrerOption<WhiteVariantRelationReferrerRefCB, WhiteVariantRelationReferrerRef>().xinit(setupper));
    }

    /**
     * Load referrer of whiteVariantRelationReferrerRefList by the set-upper of referrer. <br />
     * white_variant_relation_referrer_ref by REFERRER_ID, named 'whiteVariantRelationReferrerRefList'.
     * <pre>
     * whiteVariantRelationReferrerBhv.<span style="color: #DD4747">loadWhiteVariantRelationReferrerRefList</span>(whiteVariantRelationReferrerList, new ConditionBeanSetupper&lt;WhiteVariantRelationReferrerRefCB&gt;() {
     *     public void setup(WhiteVariantRelationReferrerRefCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = whiteVariantRelationReferrer.<span style="color: #DD4747">getWhiteVariantRelationReferrerRefList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setReferrerId_InScope(pkList);
     * cb.query().addOrderBy_ReferrerId_Asc();
     * </pre>
     * @param whiteVariantRelationReferrer The entity of whiteVariantRelationReferrer. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteVariantRelationReferrerRef> loadWhiteVariantRelationReferrerRefList(WhiteVariantRelationReferrer whiteVariantRelationReferrer, ConditionBeanSetupper<WhiteVariantRelationReferrerRefCB> setupper) {
        xassLRArg(whiteVariantRelationReferrer, setupper);
        return doLoadWhiteVariantRelationReferrerRefList(xnewLRLs(whiteVariantRelationReferrer), new LoadReferrerOption<WhiteVariantRelationReferrerRefCB, WhiteVariantRelationReferrerRef>().xinit(setupper));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param whiteVariantRelationReferrer The entity of whiteVariantRelationReferrer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteVariantRelationReferrerRef> loadWhiteVariantRelationReferrerRefList(WhiteVariantRelationReferrer whiteVariantRelationReferrer, LoadReferrerOption<WhiteVariantRelationReferrerRefCB, WhiteVariantRelationReferrerRef> loadReferrerOption) {
        xassLRArg(whiteVariantRelationReferrer, loadReferrerOption);
        return loadWhiteVariantRelationReferrerRefList(xnewLRLs(whiteVariantRelationReferrer), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param whiteVariantRelationReferrerList The entity list of whiteVariantRelationReferrer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WhiteVariantRelationReferrerRef> loadWhiteVariantRelationReferrerRefList(List<WhiteVariantRelationReferrer> whiteVariantRelationReferrerList, LoadReferrerOption<WhiteVariantRelationReferrerRefCB, WhiteVariantRelationReferrerRef> loadReferrerOption) {
        xassLRArg(whiteVariantRelationReferrerList, loadReferrerOption);
        if (whiteVariantRelationReferrerList.isEmpty()) { return (NestedReferrerListGateway<WhiteVariantRelationReferrerRef>)EMPTY_NREF_LGWAY; }
        return doLoadWhiteVariantRelationReferrerRefList(whiteVariantRelationReferrerList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WhiteVariantRelationReferrerRef> doLoadWhiteVariantRelationReferrerRefList(List<WhiteVariantRelationReferrer> whiteVariantRelationReferrerList, LoadReferrerOption<WhiteVariantRelationReferrerRefCB, WhiteVariantRelationReferrerRef> option) {
        return helpLoadReferrerInternally(whiteVariantRelationReferrerList, option, "whiteVariantRelationReferrerRefList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'WhiteVariantRelationMasterFoo'.
     * @param whiteVariantRelationReferrerList The list of whiteVariantRelationReferrer. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteVariantRelationMasterFoo> pulloutWhiteVariantRelationMasterFooAsVariant(List<WhiteVariantRelationReferrer> whiteVariantRelationReferrerList)
    { return helpPulloutInternally(whiteVariantRelationReferrerList, "whiteVariantRelationMasterFooAsVariant"); }

    /**
     * Pull out the list of foreign table 'WhiteVariantRelationMasterBar'.
     * @param whiteVariantRelationReferrerList The list of whiteVariantRelationReferrer. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteVariantRelationMasterBar> pulloutWhiteVariantRelationMasterBarAsVariant(List<WhiteVariantRelationReferrer> whiteVariantRelationReferrerList)
    { return helpPulloutInternally(whiteVariantRelationReferrerList, "whiteVariantRelationMasterBarAsVariant"); }

    /**
     * Pull out the list of foreign table 'WhiteVariantRelationMasterQux'.
     * @param whiteVariantRelationReferrerList The list of whiteVariantRelationReferrer. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteVariantRelationMasterQux> pulloutWhiteVariantRelationMasterQuxAsVariantByQue(List<WhiteVariantRelationReferrer> whiteVariantRelationReferrerList)
    { return helpPulloutInternally(whiteVariantRelationReferrerList, "whiteVariantRelationMasterQuxAsVariantByQue"); }

    /**
     * Pull out the list of foreign table 'WhiteVariantRelationMasterCorge'.
     * @param whiteVariantRelationReferrerList The list of whiteVariantRelationReferrer. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteVariantRelationMasterCorge> pulloutWhiteVariantRelationMasterCorgeAsVariantByQuxType(List<WhiteVariantRelationReferrer> whiteVariantRelationReferrerList)
    { return helpPulloutInternally(whiteVariantRelationReferrerList, "whiteVariantRelationMasterCorgeAsVariantByQuxType"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key referrerId.
     * @param whiteVariantRelationReferrerList The list of whiteVariantRelationReferrer. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractReferrerIdList(List<WhiteVariantRelationReferrer> whiteVariantRelationReferrerList)
    { return helpExtractListInternally(whiteVariantRelationReferrerList, "referrerId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteVariantRelationReferrer whiteVariantRelationReferrer = new WhiteVariantRelationReferrer();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteVariantRelationReferrer.setFoo...(value);
     * whiteVariantRelationReferrer.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationReferrer.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationReferrer.set...;</span>
     * whiteVariantRelationReferrerBhv.<span style="color: #DD4747">insert</span>(whiteVariantRelationReferrer);
     * ... = whiteVariantRelationReferrer.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteVariantRelationReferrer The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteVariantRelationReferrer whiteVariantRelationReferrer) {
        doInsert(whiteVariantRelationReferrer, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteVariantRelationReferrer whiteVariantRelationReferrer = new WhiteVariantRelationReferrer();
     * whiteVariantRelationReferrer.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteVariantRelationReferrer.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationReferrer.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationReferrer.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteVariantRelationReferrer.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteVariantRelationReferrerBhv.<span style="color: #DD4747">update</span>(whiteVariantRelationReferrer);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteVariantRelationReferrer The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhiteVariantRelationReferrer whiteVariantRelationReferrer) {
        doUpdate(whiteVariantRelationReferrer, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param whiteVariantRelationReferrer The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteVariantRelationReferrer whiteVariantRelationReferrer) {
        doInsertOrUpdate(whiteVariantRelationReferrer, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteVariantRelationReferrer whiteVariantRelationReferrer = new WhiteVariantRelationReferrer();
     * whiteVariantRelationReferrer.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteVariantRelationReferrer.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteVariantRelationReferrerBhv.<span style="color: #DD4747">delete</span>(whiteVariantRelationReferrer);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteVariantRelationReferrer The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteVariantRelationReferrer whiteVariantRelationReferrer) {
        doDelete(whiteVariantRelationReferrer, null);
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
     *     WhiteVariantRelationReferrer whiteVariantRelationReferrer = new WhiteVariantRelationReferrer();
     *     whiteVariantRelationReferrer.setFooName("foo");
     *     if (...) {
     *         whiteVariantRelationReferrer.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteVariantRelationReferrerList.add(whiteVariantRelationReferrer);
     * }
     * whiteVariantRelationReferrerBhv.<span style="color: #DD4747">batchInsert</span>(whiteVariantRelationReferrerList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteVariantRelationReferrerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteVariantRelationReferrer> whiteVariantRelationReferrerList) {
        return doBatchInsert(whiteVariantRelationReferrerList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhiteVariantRelationReferrer whiteVariantRelationReferrer = new WhiteVariantRelationReferrer();
     *     whiteVariantRelationReferrer.setFooName("foo");
     *     if (...) {
     *         whiteVariantRelationReferrer.setFooPrice(123);
     *     } else {
     *         whiteVariantRelationReferrer.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteVariantRelationReferrer.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteVariantRelationReferrerList.add(whiteVariantRelationReferrer);
     * }
     * whiteVariantRelationReferrerBhv.<span style="color: #DD4747">batchUpdate</span>(whiteVariantRelationReferrerList);
     * </pre>
     * @param whiteVariantRelationReferrerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteVariantRelationReferrer> whiteVariantRelationReferrerList) {
        return doBatchUpdate(whiteVariantRelationReferrerList, null);
    }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * whiteVariantRelationReferrerBhv.<span style="color: #DD4747">batchUpdate</span>(whiteVariantRelationReferrerList, new SpecifyQuery<WhiteVariantRelationReferrerCB>() {
     *     public void specify(WhiteVariantRelationReferrerCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteVariantRelationReferrerBhv.<span style="color: #DD4747">batchUpdate</span>(whiteVariantRelationReferrerList, new SpecifyQuery<WhiteVariantRelationReferrerCB>() {
     *     public void specify(WhiteVariantRelationReferrerCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteVariantRelationReferrerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteVariantRelationReferrer> whiteVariantRelationReferrerList, SpecifyQuery<WhiteVariantRelationReferrerCB> updateColumnSpec) {
        return doBatchUpdate(whiteVariantRelationReferrerList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteVariantRelationReferrerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteVariantRelationReferrer> whiteVariantRelationReferrerList) {
        return doBatchDelete(whiteVariantRelationReferrerList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * whiteVariantRelationReferrerBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteVariantRelationReferrer, WhiteVariantRelationReferrerCB&gt;() {
     *     public ConditionBean setup(WhiteVariantRelationReferrer entity, WhiteVariantRelationReferrerCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteVariantRelationReferrer, WhiteVariantRelationReferrerCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteVariantRelationReferrer whiteVariantRelationReferrer = new WhiteVariantRelationReferrer();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationReferrer.setPK...(value);</span>
     * whiteVariantRelationReferrer.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationReferrer.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationReferrer.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationReferrer.setVersionNo(value);</span>
     * WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB();
     * cb.query().setFoo...(value);
     * whiteVariantRelationReferrerBhv.<span style="color: #DD4747">queryUpdate</span>(whiteVariantRelationReferrer, cb);
     * </pre>
     * @param whiteVariantRelationReferrer The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteVariantRelationReferrer. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteVariantRelationReferrer whiteVariantRelationReferrer, WhiteVariantRelationReferrerCB cb) {
        return doQueryUpdate(whiteVariantRelationReferrer, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB();
     * cb.query().setFoo...(value);
     * whiteVariantRelationReferrerBhv.<span style="color: #DD4747">queryDelete</span>(whiteVariantRelationReferrer, cb);
     * </pre>
     * @param cb The condition-bean of WhiteVariantRelationReferrer. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteVariantRelationReferrerCB cb) {
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
     * WhiteVariantRelationReferrer whiteVariantRelationReferrer = new WhiteVariantRelationReferrer();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteVariantRelationReferrer.setFoo...(value);
     * whiteVariantRelationReferrer.setBar...(value);
     * InsertOption<WhiteVariantRelationReferrerCB> option = new InsertOption<WhiteVariantRelationReferrerCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteVariantRelationReferrerBhv.<span style="color: #DD4747">varyingInsert</span>(whiteVariantRelationReferrer, option);
     * ... = whiteVariantRelationReferrer.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteVariantRelationReferrer The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteVariantRelationReferrer whiteVariantRelationReferrer, InsertOption<WhiteVariantRelationReferrerCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteVariantRelationReferrer, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteVariantRelationReferrer whiteVariantRelationReferrer = new WhiteVariantRelationReferrer();
     * whiteVariantRelationReferrer.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteVariantRelationReferrer.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteVariantRelationReferrer.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteVariantRelationReferrerCB&gt; option = new UpdateOption&lt;WhiteVariantRelationReferrerCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteVariantRelationReferrerCB&gt;() {
     *         public void specify(WhiteVariantRelationReferrerCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteVariantRelationReferrerBhv.<span style="color: #DD4747">varyingUpdate</span>(whiteVariantRelationReferrer, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteVariantRelationReferrer The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteVariantRelationReferrer whiteVariantRelationReferrer, UpdateOption<WhiteVariantRelationReferrerCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteVariantRelationReferrer, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteVariantRelationReferrer The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteVariantRelationReferrer whiteVariantRelationReferrer, InsertOption<WhiteVariantRelationReferrerCB> insertOption, UpdateOption<WhiteVariantRelationReferrerCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdate(whiteVariantRelationReferrer, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteVariantRelationReferrer The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteVariantRelationReferrer whiteVariantRelationReferrer, DeleteOption<WhiteVariantRelationReferrerCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteVariantRelationReferrer, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteVariantRelationReferrerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteVariantRelationReferrer> whiteVariantRelationReferrerList, InsertOption<WhiteVariantRelationReferrerCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteVariantRelationReferrerList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteVariantRelationReferrerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteVariantRelationReferrer> whiteVariantRelationReferrerList, UpdateOption<WhiteVariantRelationReferrerCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteVariantRelationReferrerList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteVariantRelationReferrerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteVariantRelationReferrer> whiteVariantRelationReferrerList, DeleteOption<WhiteVariantRelationReferrerCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteVariantRelationReferrerList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteVariantRelationReferrer, WhiteVariantRelationReferrerCB> setupper, InsertOption<WhiteVariantRelationReferrerCB> option) {
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
     * WhiteVariantRelationReferrer whiteVariantRelationReferrer = new WhiteVariantRelationReferrer();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationReferrer.setPK...(value);</span>
     * whiteVariantRelationReferrer.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteVariantRelationReferrer.setVersionNo(value);</span>
     * WhiteVariantRelationReferrerCB cb = new WhiteVariantRelationReferrerCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteVariantRelationReferrerCB&gt; option = new UpdateOption&lt;WhiteVariantRelationReferrerCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteVariantRelationReferrerCB&gt;() {
     *     public void specify(WhiteVariantRelationReferrerCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteVariantRelationReferrerBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteVariantRelationReferrer, cb, option);
     * </pre>
     * @param whiteVariantRelationReferrer The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteVariantRelationReferrer. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteVariantRelationReferrer whiteVariantRelationReferrer, WhiteVariantRelationReferrerCB cb, UpdateOption<WhiteVariantRelationReferrerCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteVariantRelationReferrer, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteVariantRelationReferrer. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteVariantRelationReferrerCB cb, DeleteOption<WhiteVariantRelationReferrerCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteVariantRelationReferrerBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends WhiteVariantRelationReferrer> typeOfSelectedEntity() { return WhiteVariantRelationReferrer.class; }
    protected Class<WhiteVariantRelationReferrer> typeOfHandlingEntity() { return WhiteVariantRelationReferrer.class; }
    protected Class<WhiteVariantRelationReferrerCB> typeOfHandlingConditionBean() { return WhiteVariantRelationReferrerCB.class; }
    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteVariantRelationReferrerCB> downcast(InsertOption<? extends ConditionBean> op) { return (InsertOption<WhiteVariantRelationReferrerCB>)op; }
    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteVariantRelationReferrerCB> downcast(UpdateOption<? extends ConditionBean> op) { return (UpdateOption<WhiteVariantRelationReferrerCB>)op; }
    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteVariantRelationReferrerCB> downcast(DeleteOption<? extends ConditionBean> op) { return (DeleteOption<WhiteVariantRelationReferrerCB>)op; }
    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteVariantRelationReferrer, WhiteVariantRelationReferrerCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp)
    { return (QueryInsertSetupper<WhiteVariantRelationReferrer, WhiteVariantRelationReferrerCB>)sp; }
}
