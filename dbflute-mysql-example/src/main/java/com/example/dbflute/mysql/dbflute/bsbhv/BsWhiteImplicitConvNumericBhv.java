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
 * The behavior of WHITE_IMPLICIT_CONV_NUMERIC as TABLE. <br />
 * <pre>
 * [primary key]
 *     IMPLICIT_CONV_NUMERIC_ID
 *
 * [column]
 *     IMPLICIT_CONV_NUMERIC_ID, IMPLICIT_CONV_INTEGER_ID, IMPLICIT_CONV_STRING_ID, IMPLICIT_CONV_NAME
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
 *     WHITE_IMPLICIT_CONV_INTEGER, WHITE_IMPLICIT_CONV_STRING
 *
 * [referrer table]
 *     white_implicit_conv_integer, white_implicit_conv_string
 *
 * [foreign property]
 *     whiteImplicitConvInteger, whiteImplicitConvString
 *
 * [referrer property]
 *     whiteImplicitConvIntegerList, whiteImplicitConvStringList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteImplicitConvNumericBhv extends AbstractBehaviorWritable<WhiteImplicitConvNumeric, WhiteImplicitConvNumericCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public DBMeta getDBMeta() { return WhiteImplicitConvNumericDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteImplicitConvNumericDbm getMyDBMeta() { return WhiteImplicitConvNumericDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhiteImplicitConvNumericCB newConditionBean() { return new WhiteImplicitConvNumericCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteImplicitConvNumeric newMyEntity() { return new WhiteImplicitConvNumeric(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteImplicitConvNumericCB newMyConditionBean() { return new WhiteImplicitConvNumericCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteImplicitConvNumericCB cb = new WhiteImplicitConvNumericCB();
     * cb.query().setFoo...(value);
     * int count = whiteImplicitConvNumericBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteImplicitConvNumeric. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteImplicitConvNumericCB cb) {
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
     * WhiteImplicitConvNumericCB cb = new WhiteImplicitConvNumericCB();
     * cb.query().setFoo...(value);
     * WhiteImplicitConvNumeric whiteImplicitConvNumeric = whiteImplicitConvNumericBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (whiteImplicitConvNumeric != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = whiteImplicitConvNumeric.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteImplicitConvNumeric. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteImplicitConvNumeric selectEntity(WhiteImplicitConvNumericCB cb) {
        return facadeSelectEntity(cb);
    }

    protected WhiteImplicitConvNumeric facadeSelectEntity(WhiteImplicitConvNumericCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteImplicitConvNumeric> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteImplicitConvNumericCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * WhiteImplicitConvNumericCB cb = new WhiteImplicitConvNumericCB();
     * cb.query().setFoo...(value);
     * WhiteImplicitConvNumeric whiteImplicitConvNumeric = whiteImplicitConvNumericBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteImplicitConvNumeric.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteImplicitConvNumeric. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteImplicitConvNumeric selectEntityWithDeletedCheck(WhiteImplicitConvNumericCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param implicitConvNumericId : PK, NotNull, DECIMAL(20). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteImplicitConvNumeric selectByPKValue(java.math.BigDecimal implicitConvNumericId) {
        return facadeSelectByPKValue(implicitConvNumericId);
    }

    protected WhiteImplicitConvNumeric facadeSelectByPKValue(java.math.BigDecimal implicitConvNumericId) {
        return doSelectByPK(implicitConvNumericId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteImplicitConvNumeric> ENTITY doSelectByPK(java.math.BigDecimal implicitConvNumericId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(implicitConvNumericId), tp);
    }

    protected <ENTITY extends WhiteImplicitConvNumeric> OptionalEntity<ENTITY> doSelectOptionalByPK(java.math.BigDecimal implicitConvNumericId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(implicitConvNumericId, tp), implicitConvNumericId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param implicitConvNumericId : PK, NotNull, DECIMAL(20). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteImplicitConvNumeric selectByPKValueWithDeletedCheck(java.math.BigDecimal implicitConvNumericId) {
        return doSelectByPKWithDeletedCheck(implicitConvNumericId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteImplicitConvNumeric> ENTITY doSelectByPKWithDeletedCheck(java.math.BigDecimal implicitConvNumericId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(implicitConvNumericId), tp);
    }

    protected WhiteImplicitConvNumericCB xprepareCBAsPK(java.math.BigDecimal implicitConvNumericId) {
        assertObjectNotNull("implicitConvNumericId", implicitConvNumericId);
        return newConditionBean().acceptPK(implicitConvNumericId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteImplicitConvNumericCB cb = new WhiteImplicitConvNumericCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteImplicitConvNumeric&gt; whiteImplicitConvNumericList = whiteImplicitConvNumericBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteImplicitConvNumeric whiteImplicitConvNumeric : whiteImplicitConvNumericList) {
     *     ... = whiteImplicitConvNumeric.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteImplicitConvNumeric. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteImplicitConvNumeric> selectList(WhiteImplicitConvNumericCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * WhiteImplicitConvNumericCB cb = new WhiteImplicitConvNumericCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteImplicitConvNumeric&gt; page = whiteImplicitConvNumericBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteImplicitConvNumeric whiteImplicitConvNumeric : page) {
     *     ... = whiteImplicitConvNumeric.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteImplicitConvNumeric. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteImplicitConvNumeric> selectPage(WhiteImplicitConvNumericCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteImplicitConvNumericCB cb = new WhiteImplicitConvNumericCB();
     * cb.query().setFoo...(value);
     * whiteImplicitConvNumericBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteImplicitConvNumeric&gt;() {
     *     public void handle(WhiteImplicitConvNumeric entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteImplicitConvNumeric. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteImplicitConvNumeric. (NotNull)
     */
    public void selectCursor(WhiteImplicitConvNumericCB cb, EntityRowHandler<WhiteImplicitConvNumeric> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteImplicitConvNumericBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteImplicitConvNumericCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhiteImplicitConvNumericCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param whiteImplicitConvNumericList The entity list of whiteImplicitConvNumeric. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhiteImplicitConvNumeric> whiteImplicitConvNumericList, ReferrerLoaderHandler<LoaderOfWhiteImplicitConvNumeric> handler) {
        xassLRArg(whiteImplicitConvNumericList, handler);
        handler.handle(new LoaderOfWhiteImplicitConvNumeric().ready(whiteImplicitConvNumericList, _behaviorSelector));
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
     * @param whiteImplicitConvNumeric The entity of whiteImplicitConvNumeric. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhiteImplicitConvNumeric whiteImplicitConvNumeric, ReferrerLoaderHandler<LoaderOfWhiteImplicitConvNumeric> handler) {
        xassLRArg(whiteImplicitConvNumeric, handler);
        handler.handle(new LoaderOfWhiteImplicitConvNumeric().ready(xnewLRAryLs(whiteImplicitConvNumeric), _behaviorSelector));
    }

    /**
     * Load referrer of whiteImplicitConvIntegerList by the set-upper of referrer. <br />
     * white_implicit_conv_integer by IMPLICIT_CONV_NUMERIC_ID, named 'whiteImplicitConvIntegerList'.
     * <pre>
     * whiteImplicitConvNumericBhv.<span style="color: #DD4747">loadWhiteImplicitConvIntegerList</span>(whiteImplicitConvNumericList, new ConditionBeanSetupper&lt;WhiteImplicitConvIntegerCB&gt;() {
     *     public void setup(WhiteImplicitConvIntegerCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (WhiteImplicitConvNumeric whiteImplicitConvNumeric : whiteImplicitConvNumericList) {
     *     ... = whiteImplicitConvNumeric.<span style="color: #DD4747">getWhiteImplicitConvIntegerList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setImplicitConvNumericId_InScope(pkList);
     * cb.query().addOrderBy_ImplicitConvNumericId_Asc();
     * </pre>
     * @param whiteImplicitConvNumericList The entity list of whiteImplicitConvNumeric. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteImplicitConvInteger> loadWhiteImplicitConvIntegerList(List<WhiteImplicitConvNumeric> whiteImplicitConvNumericList, ConditionBeanSetupper<WhiteImplicitConvIntegerCB> setupper) {
        xassLRArg(whiteImplicitConvNumericList, setupper);
        return doLoadWhiteImplicitConvIntegerList(whiteImplicitConvNumericList, new LoadReferrerOption<WhiteImplicitConvIntegerCB, WhiteImplicitConvInteger>().xinit(setupper));
    }

    /**
     * Load referrer of whiteImplicitConvIntegerList by the set-upper of referrer. <br />
     * white_implicit_conv_integer by IMPLICIT_CONV_NUMERIC_ID, named 'whiteImplicitConvIntegerList'.
     * <pre>
     * whiteImplicitConvNumericBhv.<span style="color: #DD4747">loadWhiteImplicitConvIntegerList</span>(whiteImplicitConvNumericList, new ConditionBeanSetupper&lt;WhiteImplicitConvIntegerCB&gt;() {
     *     public void setup(WhiteImplicitConvIntegerCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = whiteImplicitConvNumeric.<span style="color: #DD4747">getWhiteImplicitConvIntegerList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setImplicitConvNumericId_InScope(pkList);
     * cb.query().addOrderBy_ImplicitConvNumericId_Asc();
     * </pre>
     * @param whiteImplicitConvNumeric The entity of whiteImplicitConvNumeric. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteImplicitConvInteger> loadWhiteImplicitConvIntegerList(WhiteImplicitConvNumeric whiteImplicitConvNumeric, ConditionBeanSetupper<WhiteImplicitConvIntegerCB> setupper) {
        xassLRArg(whiteImplicitConvNumeric, setupper);
        return doLoadWhiteImplicitConvIntegerList(xnewLRLs(whiteImplicitConvNumeric), new LoadReferrerOption<WhiteImplicitConvIntegerCB, WhiteImplicitConvInteger>().xinit(setupper));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param whiteImplicitConvNumeric The entity of whiteImplicitConvNumeric. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteImplicitConvInteger> loadWhiteImplicitConvIntegerList(WhiteImplicitConvNumeric whiteImplicitConvNumeric, LoadReferrerOption<WhiteImplicitConvIntegerCB, WhiteImplicitConvInteger> loadReferrerOption) {
        xassLRArg(whiteImplicitConvNumeric, loadReferrerOption);
        return loadWhiteImplicitConvIntegerList(xnewLRLs(whiteImplicitConvNumeric), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param whiteImplicitConvNumericList The entity list of whiteImplicitConvNumeric. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WhiteImplicitConvInteger> loadWhiteImplicitConvIntegerList(List<WhiteImplicitConvNumeric> whiteImplicitConvNumericList, LoadReferrerOption<WhiteImplicitConvIntegerCB, WhiteImplicitConvInteger> loadReferrerOption) {
        xassLRArg(whiteImplicitConvNumericList, loadReferrerOption);
        if (whiteImplicitConvNumericList.isEmpty()) { return (NestedReferrerListGateway<WhiteImplicitConvInteger>)EMPTY_NREF_LGWAY; }
        return doLoadWhiteImplicitConvIntegerList(whiteImplicitConvNumericList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WhiteImplicitConvInteger> doLoadWhiteImplicitConvIntegerList(List<WhiteImplicitConvNumeric> whiteImplicitConvNumericList, LoadReferrerOption<WhiteImplicitConvIntegerCB, WhiteImplicitConvInteger> option) {
        return helpLoadReferrerInternally(whiteImplicitConvNumericList, option, "whiteImplicitConvIntegerList");
    }

    /**
     * Load referrer of whiteImplicitConvStringList by the set-upper of referrer. <br />
     * white_implicit_conv_string by IMPLICIT_CONV_NUMERIC_ID, named 'whiteImplicitConvStringList'.
     * <pre>
     * whiteImplicitConvNumericBhv.<span style="color: #DD4747">loadWhiteImplicitConvStringList</span>(whiteImplicitConvNumericList, new ConditionBeanSetupper&lt;WhiteImplicitConvStringCB&gt;() {
     *     public void setup(WhiteImplicitConvStringCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (WhiteImplicitConvNumeric whiteImplicitConvNumeric : whiteImplicitConvNumericList) {
     *     ... = whiteImplicitConvNumeric.<span style="color: #DD4747">getWhiteImplicitConvStringList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setImplicitConvNumericId_InScope(pkList);
     * cb.query().addOrderBy_ImplicitConvNumericId_Asc();
     * </pre>
     * @param whiteImplicitConvNumericList The entity list of whiteImplicitConvNumeric. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteImplicitConvString> loadWhiteImplicitConvStringList(List<WhiteImplicitConvNumeric> whiteImplicitConvNumericList, ConditionBeanSetupper<WhiteImplicitConvStringCB> setupper) {
        xassLRArg(whiteImplicitConvNumericList, setupper);
        return doLoadWhiteImplicitConvStringList(whiteImplicitConvNumericList, new LoadReferrerOption<WhiteImplicitConvStringCB, WhiteImplicitConvString>().xinit(setupper));
    }

    /**
     * Load referrer of whiteImplicitConvStringList by the set-upper of referrer. <br />
     * white_implicit_conv_string by IMPLICIT_CONV_NUMERIC_ID, named 'whiteImplicitConvStringList'.
     * <pre>
     * whiteImplicitConvNumericBhv.<span style="color: #DD4747">loadWhiteImplicitConvStringList</span>(whiteImplicitConvNumericList, new ConditionBeanSetupper&lt;WhiteImplicitConvStringCB&gt;() {
     *     public void setup(WhiteImplicitConvStringCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = whiteImplicitConvNumeric.<span style="color: #DD4747">getWhiteImplicitConvStringList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setImplicitConvNumericId_InScope(pkList);
     * cb.query().addOrderBy_ImplicitConvNumericId_Asc();
     * </pre>
     * @param whiteImplicitConvNumeric The entity of whiteImplicitConvNumeric. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteImplicitConvString> loadWhiteImplicitConvStringList(WhiteImplicitConvNumeric whiteImplicitConvNumeric, ConditionBeanSetupper<WhiteImplicitConvStringCB> setupper) {
        xassLRArg(whiteImplicitConvNumeric, setupper);
        return doLoadWhiteImplicitConvStringList(xnewLRLs(whiteImplicitConvNumeric), new LoadReferrerOption<WhiteImplicitConvStringCB, WhiteImplicitConvString>().xinit(setupper));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param whiteImplicitConvNumeric The entity of whiteImplicitConvNumeric. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteImplicitConvString> loadWhiteImplicitConvStringList(WhiteImplicitConvNumeric whiteImplicitConvNumeric, LoadReferrerOption<WhiteImplicitConvStringCB, WhiteImplicitConvString> loadReferrerOption) {
        xassLRArg(whiteImplicitConvNumeric, loadReferrerOption);
        return loadWhiteImplicitConvStringList(xnewLRLs(whiteImplicitConvNumeric), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param whiteImplicitConvNumericList The entity list of whiteImplicitConvNumeric. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WhiteImplicitConvString> loadWhiteImplicitConvStringList(List<WhiteImplicitConvNumeric> whiteImplicitConvNumericList, LoadReferrerOption<WhiteImplicitConvStringCB, WhiteImplicitConvString> loadReferrerOption) {
        xassLRArg(whiteImplicitConvNumericList, loadReferrerOption);
        if (whiteImplicitConvNumericList.isEmpty()) { return (NestedReferrerListGateway<WhiteImplicitConvString>)EMPTY_NREF_LGWAY; }
        return doLoadWhiteImplicitConvStringList(whiteImplicitConvNumericList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WhiteImplicitConvString> doLoadWhiteImplicitConvStringList(List<WhiteImplicitConvNumeric> whiteImplicitConvNumericList, LoadReferrerOption<WhiteImplicitConvStringCB, WhiteImplicitConvString> option) {
        return helpLoadReferrerInternally(whiteImplicitConvNumericList, option, "whiteImplicitConvStringList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'WhiteImplicitConvInteger'.
     * @param whiteImplicitConvNumericList The list of whiteImplicitConvNumeric. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteImplicitConvInteger> pulloutWhiteImplicitConvInteger(List<WhiteImplicitConvNumeric> whiteImplicitConvNumericList)
    { return helpPulloutInternally(whiteImplicitConvNumericList, "whiteImplicitConvInteger"); }

    /**
     * Pull out the list of foreign table 'WhiteImplicitConvString'.
     * @param whiteImplicitConvNumericList The list of whiteImplicitConvNumeric. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteImplicitConvString> pulloutWhiteImplicitConvString(List<WhiteImplicitConvNumeric> whiteImplicitConvNumericList)
    { return helpPulloutInternally(whiteImplicitConvNumericList, "whiteImplicitConvString"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key implicitConvNumericId.
     * @param whiteImplicitConvNumericList The list of whiteImplicitConvNumeric. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<java.math.BigDecimal> extractImplicitConvNumericIdList(List<WhiteImplicitConvNumeric> whiteImplicitConvNumericList)
    { return helpExtractListInternally(whiteImplicitConvNumericList, "implicitConvNumericId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteImplicitConvNumeric whiteImplicitConvNumeric = new WhiteImplicitConvNumeric();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteImplicitConvNumeric.setFoo...(value);
     * whiteImplicitConvNumeric.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvNumeric.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvNumeric.set...;</span>
     * whiteImplicitConvNumericBhv.<span style="color: #DD4747">insert</span>(whiteImplicitConvNumeric);
     * ... = whiteImplicitConvNumeric.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteImplicitConvNumeric The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteImplicitConvNumeric whiteImplicitConvNumeric) {
        doInsert(whiteImplicitConvNumeric, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteImplicitConvNumeric whiteImplicitConvNumeric = new WhiteImplicitConvNumeric();
     * whiteImplicitConvNumeric.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteImplicitConvNumeric.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvNumeric.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvNumeric.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteImplicitConvNumeric.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteImplicitConvNumericBhv.<span style="color: #DD4747">update</span>(whiteImplicitConvNumeric);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteImplicitConvNumeric The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhiteImplicitConvNumeric whiteImplicitConvNumeric) {
        doUpdate(whiteImplicitConvNumeric, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param whiteImplicitConvNumeric The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteImplicitConvNumeric whiteImplicitConvNumeric) {
        doInsertOrUpdate(whiteImplicitConvNumeric, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteImplicitConvNumeric whiteImplicitConvNumeric = new WhiteImplicitConvNumeric();
     * whiteImplicitConvNumeric.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteImplicitConvNumeric.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteImplicitConvNumericBhv.<span style="color: #DD4747">delete</span>(whiteImplicitConvNumeric);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteImplicitConvNumeric The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteImplicitConvNumeric whiteImplicitConvNumeric) {
        doDelete(whiteImplicitConvNumeric, null);
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
     *     WhiteImplicitConvNumeric whiteImplicitConvNumeric = new WhiteImplicitConvNumeric();
     *     whiteImplicitConvNumeric.setFooName("foo");
     *     if (...) {
     *         whiteImplicitConvNumeric.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteImplicitConvNumericList.add(whiteImplicitConvNumeric);
     * }
     * whiteImplicitConvNumericBhv.<span style="color: #DD4747">batchInsert</span>(whiteImplicitConvNumericList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteImplicitConvNumericList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteImplicitConvNumeric> whiteImplicitConvNumericList) {
        return doBatchInsert(whiteImplicitConvNumericList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhiteImplicitConvNumeric whiteImplicitConvNumeric = new WhiteImplicitConvNumeric();
     *     whiteImplicitConvNumeric.setFooName("foo");
     *     if (...) {
     *         whiteImplicitConvNumeric.setFooPrice(123);
     *     } else {
     *         whiteImplicitConvNumeric.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteImplicitConvNumeric.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteImplicitConvNumericList.add(whiteImplicitConvNumeric);
     * }
     * whiteImplicitConvNumericBhv.<span style="color: #DD4747">batchUpdate</span>(whiteImplicitConvNumericList);
     * </pre>
     * @param whiteImplicitConvNumericList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteImplicitConvNumeric> whiteImplicitConvNumericList) {
        return doBatchUpdate(whiteImplicitConvNumericList, null);
    }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * whiteImplicitConvNumericBhv.<span style="color: #DD4747">batchUpdate</span>(whiteImplicitConvNumericList, new SpecifyQuery<WhiteImplicitConvNumericCB>() {
     *     public void specify(WhiteImplicitConvNumericCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteImplicitConvNumericBhv.<span style="color: #DD4747">batchUpdate</span>(whiteImplicitConvNumericList, new SpecifyQuery<WhiteImplicitConvNumericCB>() {
     *     public void specify(WhiteImplicitConvNumericCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteImplicitConvNumericList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteImplicitConvNumeric> whiteImplicitConvNumericList, SpecifyQuery<WhiteImplicitConvNumericCB> updateColumnSpec) {
        return doBatchUpdate(whiteImplicitConvNumericList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteImplicitConvNumericList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteImplicitConvNumeric> whiteImplicitConvNumericList) {
        return doBatchDelete(whiteImplicitConvNumericList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * whiteImplicitConvNumericBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteImplicitConvNumeric, WhiteImplicitConvNumericCB&gt;() {
     *     public ConditionBean setup(WhiteImplicitConvNumeric entity, WhiteImplicitConvNumericCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteImplicitConvNumeric, WhiteImplicitConvNumericCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteImplicitConvNumeric whiteImplicitConvNumeric = new WhiteImplicitConvNumeric();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvNumeric.setPK...(value);</span>
     * whiteImplicitConvNumeric.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvNumeric.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvNumeric.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvNumeric.setVersionNo(value);</span>
     * WhiteImplicitConvNumericCB cb = new WhiteImplicitConvNumericCB();
     * cb.query().setFoo...(value);
     * whiteImplicitConvNumericBhv.<span style="color: #DD4747">queryUpdate</span>(whiteImplicitConvNumeric, cb);
     * </pre>
     * @param whiteImplicitConvNumeric The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteImplicitConvNumeric. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteImplicitConvNumeric whiteImplicitConvNumeric, WhiteImplicitConvNumericCB cb) {
        return doQueryUpdate(whiteImplicitConvNumeric, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteImplicitConvNumericCB cb = new WhiteImplicitConvNumericCB();
     * cb.query().setFoo...(value);
     * whiteImplicitConvNumericBhv.<span style="color: #DD4747">queryDelete</span>(whiteImplicitConvNumeric, cb);
     * </pre>
     * @param cb The condition-bean of WhiteImplicitConvNumeric. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteImplicitConvNumericCB cb) {
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
     * WhiteImplicitConvNumeric whiteImplicitConvNumeric = new WhiteImplicitConvNumeric();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteImplicitConvNumeric.setFoo...(value);
     * whiteImplicitConvNumeric.setBar...(value);
     * InsertOption<WhiteImplicitConvNumericCB> option = new InsertOption<WhiteImplicitConvNumericCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteImplicitConvNumericBhv.<span style="color: #DD4747">varyingInsert</span>(whiteImplicitConvNumeric, option);
     * ... = whiteImplicitConvNumeric.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteImplicitConvNumeric The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteImplicitConvNumeric whiteImplicitConvNumeric, InsertOption<WhiteImplicitConvNumericCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteImplicitConvNumeric, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteImplicitConvNumeric whiteImplicitConvNumeric = new WhiteImplicitConvNumeric();
     * whiteImplicitConvNumeric.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteImplicitConvNumeric.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteImplicitConvNumeric.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteImplicitConvNumericCB&gt; option = new UpdateOption&lt;WhiteImplicitConvNumericCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteImplicitConvNumericCB&gt;() {
     *         public void specify(WhiteImplicitConvNumericCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteImplicitConvNumericBhv.<span style="color: #DD4747">varyingUpdate</span>(whiteImplicitConvNumeric, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteImplicitConvNumeric The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteImplicitConvNumeric whiteImplicitConvNumeric, UpdateOption<WhiteImplicitConvNumericCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteImplicitConvNumeric, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteImplicitConvNumeric The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteImplicitConvNumeric whiteImplicitConvNumeric, InsertOption<WhiteImplicitConvNumericCB> insertOption, UpdateOption<WhiteImplicitConvNumericCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdate(whiteImplicitConvNumeric, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteImplicitConvNumeric The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteImplicitConvNumeric whiteImplicitConvNumeric, DeleteOption<WhiteImplicitConvNumericCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteImplicitConvNumeric, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteImplicitConvNumericList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteImplicitConvNumeric> whiteImplicitConvNumericList, InsertOption<WhiteImplicitConvNumericCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteImplicitConvNumericList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteImplicitConvNumericList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteImplicitConvNumeric> whiteImplicitConvNumericList, UpdateOption<WhiteImplicitConvNumericCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteImplicitConvNumericList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteImplicitConvNumericList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteImplicitConvNumeric> whiteImplicitConvNumericList, DeleteOption<WhiteImplicitConvNumericCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteImplicitConvNumericList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteImplicitConvNumeric, WhiteImplicitConvNumericCB> setupper, InsertOption<WhiteImplicitConvNumericCB> option) {
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
     * WhiteImplicitConvNumeric whiteImplicitConvNumeric = new WhiteImplicitConvNumeric();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvNumeric.setPK...(value);</span>
     * whiteImplicitConvNumeric.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvNumeric.setVersionNo(value);</span>
     * WhiteImplicitConvNumericCB cb = new WhiteImplicitConvNumericCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteImplicitConvNumericCB&gt; option = new UpdateOption&lt;WhiteImplicitConvNumericCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteImplicitConvNumericCB&gt;() {
     *     public void specify(WhiteImplicitConvNumericCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteImplicitConvNumericBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteImplicitConvNumeric, cb, option);
     * </pre>
     * @param whiteImplicitConvNumeric The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteImplicitConvNumeric. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteImplicitConvNumeric whiteImplicitConvNumeric, WhiteImplicitConvNumericCB cb, UpdateOption<WhiteImplicitConvNumericCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteImplicitConvNumeric, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteImplicitConvNumeric. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteImplicitConvNumericCB cb, DeleteOption<WhiteImplicitConvNumericCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteImplicitConvNumericBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends WhiteImplicitConvNumeric> typeOfSelectedEntity() { return WhiteImplicitConvNumeric.class; }
    protected Class<WhiteImplicitConvNumeric> typeOfHandlingEntity() { return WhiteImplicitConvNumeric.class; }
    protected Class<WhiteImplicitConvNumericCB> typeOfHandlingConditionBean() { return WhiteImplicitConvNumericCB.class; }
    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteImplicitConvNumericCB> downcast(InsertOption<? extends ConditionBean> op) { return (InsertOption<WhiteImplicitConvNumericCB>)op; }
    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteImplicitConvNumericCB> downcast(UpdateOption<? extends ConditionBean> op) { return (UpdateOption<WhiteImplicitConvNumericCB>)op; }
    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteImplicitConvNumericCB> downcast(DeleteOption<? extends ConditionBean> op) { return (DeleteOption<WhiteImplicitConvNumericCB>)op; }
    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteImplicitConvNumeric, WhiteImplicitConvNumericCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp)
    { return (QueryInsertSetupper<WhiteImplicitConvNumeric, WhiteImplicitConvNumericCB>)sp; }
}
