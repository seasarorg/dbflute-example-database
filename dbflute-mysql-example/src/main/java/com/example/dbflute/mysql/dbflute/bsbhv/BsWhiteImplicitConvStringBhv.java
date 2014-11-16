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
 * The behavior of WHITE_IMPLICIT_CONV_STRING as TABLE. <br />
 * <pre>
 * [primary key]
 *     IMPLICIT_CONV_STRING_ID
 *
 * [column]
 *     IMPLICIT_CONV_STRING_ID, IMPLICIT_CONV_INTEGER_ID, IMPLICIT_CONV_NUMERIC_ID, IMPLICIT_CONV_NAME
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
 *     WHITE_IMPLICIT_CONV_INTEGER, WHITE_IMPLICIT_CONV_NUMERIC
 *
 * [referrer table]
 *     white_implicit_conv_integer, white_implicit_conv_numeric
 *
 * [foreign property]
 *     whiteImplicitConvInteger, whiteImplicitConvNumeric
 *
 * [referrer property]
 *     whiteImplicitConvIntegerList, whiteImplicitConvNumericList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteImplicitConvStringBhv extends AbstractBehaviorWritable<WhiteImplicitConvString, WhiteImplicitConvStringCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public WhiteImplicitConvStringDbm getDBMeta() { return WhiteImplicitConvStringDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteImplicitConvStringDbm getMyDBMeta() { return WhiteImplicitConvStringDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhiteImplicitConvStringCB newConditionBean() { return new WhiteImplicitConvStringCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteImplicitConvString newMyEntity() { return new WhiteImplicitConvString(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteImplicitConvStringCB newMyConditionBean() { return new WhiteImplicitConvStringCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteImplicitConvStringCB cb = new WhiteImplicitConvStringCB();
     * cb.query().setFoo...(value);
     * int count = whiteImplicitConvStringBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteImplicitConvString. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteImplicitConvStringCB cb) {
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
     * WhiteImplicitConvStringCB cb = new WhiteImplicitConvStringCB();
     * cb.query().setFoo...(value);
     * WhiteImplicitConvString whiteImplicitConvString = whiteImplicitConvStringBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (whiteImplicitConvString != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = whiteImplicitConvString.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteImplicitConvString. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteImplicitConvString selectEntity(WhiteImplicitConvStringCB cb) {
        return facadeSelectEntity(cb);
    }

    protected WhiteImplicitConvString facadeSelectEntity(WhiteImplicitConvStringCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteImplicitConvString> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteImplicitConvStringCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * WhiteImplicitConvStringCB cb = new WhiteImplicitConvStringCB();
     * cb.query().setFoo...(value);
     * WhiteImplicitConvString whiteImplicitConvString = whiteImplicitConvStringBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteImplicitConvString.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteImplicitConvString. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteImplicitConvString selectEntityWithDeletedCheck(WhiteImplicitConvStringCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param implicitConvStringId : PK, NotNull, VARCHAR(10). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteImplicitConvString selectByPKValue(String implicitConvStringId) {
        return facadeSelectByPKValue(implicitConvStringId);
    }

    protected WhiteImplicitConvString facadeSelectByPKValue(String implicitConvStringId) {
        return doSelectByPK(implicitConvStringId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteImplicitConvString> ENTITY doSelectByPK(String implicitConvStringId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(implicitConvStringId), tp);
    }

    protected <ENTITY extends WhiteImplicitConvString> OptionalEntity<ENTITY> doSelectOptionalByPK(String implicitConvStringId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(implicitConvStringId, tp), implicitConvStringId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param implicitConvStringId : PK, NotNull, VARCHAR(10). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteImplicitConvString selectByPKValueWithDeletedCheck(String implicitConvStringId) {
        return doSelectByPKWithDeletedCheck(implicitConvStringId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteImplicitConvString> ENTITY doSelectByPKWithDeletedCheck(String implicitConvStringId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(implicitConvStringId), tp);
    }

    protected WhiteImplicitConvStringCB xprepareCBAsPK(String implicitConvStringId) {
        assertObjectNotNull("implicitConvStringId", implicitConvStringId);
        return newConditionBean().acceptPK(implicitConvStringId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteImplicitConvStringCB cb = new WhiteImplicitConvStringCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteImplicitConvString&gt; whiteImplicitConvStringList = whiteImplicitConvStringBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteImplicitConvString whiteImplicitConvString : whiteImplicitConvStringList) {
     *     ... = whiteImplicitConvString.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteImplicitConvString. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteImplicitConvString> selectList(WhiteImplicitConvStringCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * WhiteImplicitConvStringCB cb = new WhiteImplicitConvStringCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteImplicitConvString&gt; page = whiteImplicitConvStringBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteImplicitConvString whiteImplicitConvString : page) {
     *     ... = whiteImplicitConvString.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteImplicitConvString. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteImplicitConvString> selectPage(WhiteImplicitConvStringCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteImplicitConvStringCB cb = new WhiteImplicitConvStringCB();
     * cb.query().setFoo...(value);
     * whiteImplicitConvStringBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteImplicitConvString&gt;() {
     *     public void handle(WhiteImplicitConvString entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteImplicitConvString. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteImplicitConvString. (NotNull)
     */
    public void selectCursor(WhiteImplicitConvStringCB cb, EntityRowHandler<WhiteImplicitConvString> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteImplicitConvStringBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteImplicitConvStringCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhiteImplicitConvStringCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param whiteImplicitConvStringList The entity list of whiteImplicitConvString. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhiteImplicitConvString> whiteImplicitConvStringList, ReferrerLoaderHandler<LoaderOfWhiteImplicitConvString> handler) {
        xassLRArg(whiteImplicitConvStringList, handler);
        handler.handle(new LoaderOfWhiteImplicitConvString().ready(whiteImplicitConvStringList, _behaviorSelector));
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
     * @param whiteImplicitConvString The entity of whiteImplicitConvString. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhiteImplicitConvString whiteImplicitConvString, ReferrerLoaderHandler<LoaderOfWhiteImplicitConvString> handler) {
        xassLRArg(whiteImplicitConvString, handler);
        handler.handle(new LoaderOfWhiteImplicitConvString().ready(xnewLRAryLs(whiteImplicitConvString), _behaviorSelector));
    }

    /**
     * Load referrer of whiteImplicitConvIntegerList by the set-upper of referrer. <br />
     * white_implicit_conv_integer by IMPLICIT_CONV_STRING_ID, named 'whiteImplicitConvIntegerList'.
     * <pre>
     * whiteImplicitConvStringBhv.<span style="color: #DD4747">loadWhiteImplicitConvIntegerList</span>(whiteImplicitConvStringList, new ConditionBeanSetupper&lt;WhiteImplicitConvIntegerCB&gt;() {
     *     public void setup(WhiteImplicitConvIntegerCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (WhiteImplicitConvString whiteImplicitConvString : whiteImplicitConvStringList) {
     *     ... = whiteImplicitConvString.<span style="color: #DD4747">getWhiteImplicitConvIntegerList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setImplicitConvStringId_InScope(pkList);
     * cb.query().addOrderBy_ImplicitConvStringId_Asc();
     * </pre>
     * @param whiteImplicitConvStringList The entity list of whiteImplicitConvString. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteImplicitConvInteger> loadWhiteImplicitConvIntegerList(List<WhiteImplicitConvString> whiteImplicitConvStringList, ConditionBeanSetupper<WhiteImplicitConvIntegerCB> setupper) {
        xassLRArg(whiteImplicitConvStringList, setupper);
        return doLoadWhiteImplicitConvIntegerList(whiteImplicitConvStringList, new LoadReferrerOption<WhiteImplicitConvIntegerCB, WhiteImplicitConvInteger>().xinit(setupper));
    }

    /**
     * Load referrer of whiteImplicitConvIntegerList by the set-upper of referrer. <br />
     * white_implicit_conv_integer by IMPLICIT_CONV_STRING_ID, named 'whiteImplicitConvIntegerList'.
     * <pre>
     * whiteImplicitConvStringBhv.<span style="color: #DD4747">loadWhiteImplicitConvIntegerList</span>(whiteImplicitConvStringList, new ConditionBeanSetupper&lt;WhiteImplicitConvIntegerCB&gt;() {
     *     public void setup(WhiteImplicitConvIntegerCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = whiteImplicitConvString.<span style="color: #DD4747">getWhiteImplicitConvIntegerList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setImplicitConvStringId_InScope(pkList);
     * cb.query().addOrderBy_ImplicitConvStringId_Asc();
     * </pre>
     * @param whiteImplicitConvString The entity of whiteImplicitConvString. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteImplicitConvInteger> loadWhiteImplicitConvIntegerList(WhiteImplicitConvString whiteImplicitConvString, ConditionBeanSetupper<WhiteImplicitConvIntegerCB> setupper) {
        xassLRArg(whiteImplicitConvString, setupper);
        return doLoadWhiteImplicitConvIntegerList(xnewLRLs(whiteImplicitConvString), new LoadReferrerOption<WhiteImplicitConvIntegerCB, WhiteImplicitConvInteger>().xinit(setupper));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param whiteImplicitConvString The entity of whiteImplicitConvString. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteImplicitConvInteger> loadWhiteImplicitConvIntegerList(WhiteImplicitConvString whiteImplicitConvString, LoadReferrerOption<WhiteImplicitConvIntegerCB, WhiteImplicitConvInteger> loadReferrerOption) {
        xassLRArg(whiteImplicitConvString, loadReferrerOption);
        return loadWhiteImplicitConvIntegerList(xnewLRLs(whiteImplicitConvString), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param whiteImplicitConvStringList The entity list of whiteImplicitConvString. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WhiteImplicitConvInteger> loadWhiteImplicitConvIntegerList(List<WhiteImplicitConvString> whiteImplicitConvStringList, LoadReferrerOption<WhiteImplicitConvIntegerCB, WhiteImplicitConvInteger> loadReferrerOption) {
        xassLRArg(whiteImplicitConvStringList, loadReferrerOption);
        if (whiteImplicitConvStringList.isEmpty()) { return (NestedReferrerListGateway<WhiteImplicitConvInteger>)EMPTY_NREF_LGWAY; }
        return doLoadWhiteImplicitConvIntegerList(whiteImplicitConvStringList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WhiteImplicitConvInteger> doLoadWhiteImplicitConvIntegerList(List<WhiteImplicitConvString> whiteImplicitConvStringList, LoadReferrerOption<WhiteImplicitConvIntegerCB, WhiteImplicitConvInteger> option) {
        return helpLoadReferrerInternally(whiteImplicitConvStringList, option, "whiteImplicitConvIntegerList");
    }

    /**
     * Load referrer of whiteImplicitConvNumericList by the set-upper of referrer. <br />
     * white_implicit_conv_numeric by IMPLICIT_CONV_STRING_ID, named 'whiteImplicitConvNumericList'.
     * <pre>
     * whiteImplicitConvStringBhv.<span style="color: #DD4747">loadWhiteImplicitConvNumericList</span>(whiteImplicitConvStringList, new ConditionBeanSetupper&lt;WhiteImplicitConvNumericCB&gt;() {
     *     public void setup(WhiteImplicitConvNumericCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (WhiteImplicitConvString whiteImplicitConvString : whiteImplicitConvStringList) {
     *     ... = whiteImplicitConvString.<span style="color: #DD4747">getWhiteImplicitConvNumericList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setImplicitConvStringId_InScope(pkList);
     * cb.query().addOrderBy_ImplicitConvStringId_Asc();
     * </pre>
     * @param whiteImplicitConvStringList The entity list of whiteImplicitConvString. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteImplicitConvNumeric> loadWhiteImplicitConvNumericList(List<WhiteImplicitConvString> whiteImplicitConvStringList, ConditionBeanSetupper<WhiteImplicitConvNumericCB> setupper) {
        xassLRArg(whiteImplicitConvStringList, setupper);
        return doLoadWhiteImplicitConvNumericList(whiteImplicitConvStringList, new LoadReferrerOption<WhiteImplicitConvNumericCB, WhiteImplicitConvNumeric>().xinit(setupper));
    }

    /**
     * Load referrer of whiteImplicitConvNumericList by the set-upper of referrer. <br />
     * white_implicit_conv_numeric by IMPLICIT_CONV_STRING_ID, named 'whiteImplicitConvNumericList'.
     * <pre>
     * whiteImplicitConvStringBhv.<span style="color: #DD4747">loadWhiteImplicitConvNumericList</span>(whiteImplicitConvStringList, new ConditionBeanSetupper&lt;WhiteImplicitConvNumericCB&gt;() {
     *     public void setup(WhiteImplicitConvNumericCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = whiteImplicitConvString.<span style="color: #DD4747">getWhiteImplicitConvNumericList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setImplicitConvStringId_InScope(pkList);
     * cb.query().addOrderBy_ImplicitConvStringId_Asc();
     * </pre>
     * @param whiteImplicitConvString The entity of whiteImplicitConvString. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteImplicitConvNumeric> loadWhiteImplicitConvNumericList(WhiteImplicitConvString whiteImplicitConvString, ConditionBeanSetupper<WhiteImplicitConvNumericCB> setupper) {
        xassLRArg(whiteImplicitConvString, setupper);
        return doLoadWhiteImplicitConvNumericList(xnewLRLs(whiteImplicitConvString), new LoadReferrerOption<WhiteImplicitConvNumericCB, WhiteImplicitConvNumeric>().xinit(setupper));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param whiteImplicitConvString The entity of whiteImplicitConvString. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteImplicitConvNumeric> loadWhiteImplicitConvNumericList(WhiteImplicitConvString whiteImplicitConvString, LoadReferrerOption<WhiteImplicitConvNumericCB, WhiteImplicitConvNumeric> loadReferrerOption) {
        xassLRArg(whiteImplicitConvString, loadReferrerOption);
        return loadWhiteImplicitConvNumericList(xnewLRLs(whiteImplicitConvString), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param whiteImplicitConvStringList The entity list of whiteImplicitConvString. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WhiteImplicitConvNumeric> loadWhiteImplicitConvNumericList(List<WhiteImplicitConvString> whiteImplicitConvStringList, LoadReferrerOption<WhiteImplicitConvNumericCB, WhiteImplicitConvNumeric> loadReferrerOption) {
        xassLRArg(whiteImplicitConvStringList, loadReferrerOption);
        if (whiteImplicitConvStringList.isEmpty()) { return (NestedReferrerListGateway<WhiteImplicitConvNumeric>)EMPTY_NREF_LGWAY; }
        return doLoadWhiteImplicitConvNumericList(whiteImplicitConvStringList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WhiteImplicitConvNumeric> doLoadWhiteImplicitConvNumericList(List<WhiteImplicitConvString> whiteImplicitConvStringList, LoadReferrerOption<WhiteImplicitConvNumericCB, WhiteImplicitConvNumeric> option) {
        return helpLoadReferrerInternally(whiteImplicitConvStringList, option, "whiteImplicitConvNumericList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'WhiteImplicitConvInteger'.
     * @param whiteImplicitConvStringList The list of whiteImplicitConvString. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteImplicitConvInteger> pulloutWhiteImplicitConvInteger(List<WhiteImplicitConvString> whiteImplicitConvStringList)
    { return helpPulloutInternally(whiteImplicitConvStringList, "whiteImplicitConvInteger"); }

    /**
     * Pull out the list of foreign table 'WhiteImplicitConvNumeric'.
     * @param whiteImplicitConvStringList The list of whiteImplicitConvString. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteImplicitConvNumeric> pulloutWhiteImplicitConvNumeric(List<WhiteImplicitConvString> whiteImplicitConvStringList)
    { return helpPulloutInternally(whiteImplicitConvStringList, "whiteImplicitConvNumeric"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key implicitConvStringId.
     * @param whiteImplicitConvStringList The list of whiteImplicitConvString. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractImplicitConvStringIdList(List<WhiteImplicitConvString> whiteImplicitConvStringList)
    { return helpExtractListInternally(whiteImplicitConvStringList, "implicitConvStringId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteImplicitConvString whiteImplicitConvString = new WhiteImplicitConvString();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteImplicitConvString.setFoo...(value);
     * whiteImplicitConvString.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvString.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvString.set...;</span>
     * whiteImplicitConvStringBhv.<span style="color: #DD4747">insert</span>(whiteImplicitConvString);
     * ... = whiteImplicitConvString.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteImplicitConvString The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteImplicitConvString whiteImplicitConvString) {
        doInsert(whiteImplicitConvString, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteImplicitConvString whiteImplicitConvString = new WhiteImplicitConvString();
     * whiteImplicitConvString.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteImplicitConvString.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvString.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvString.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteImplicitConvString.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteImplicitConvStringBhv.<span style="color: #DD4747">update</span>(whiteImplicitConvString);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteImplicitConvString The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhiteImplicitConvString whiteImplicitConvString) {
        doUpdate(whiteImplicitConvString, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param whiteImplicitConvString The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteImplicitConvString whiteImplicitConvString) {
        doInsertOrUpdate(whiteImplicitConvString, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteImplicitConvString whiteImplicitConvString = new WhiteImplicitConvString();
     * whiteImplicitConvString.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteImplicitConvString.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteImplicitConvStringBhv.<span style="color: #DD4747">delete</span>(whiteImplicitConvString);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteImplicitConvString The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteImplicitConvString whiteImplicitConvString) {
        doDelete(whiteImplicitConvString, null);
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
     *     WhiteImplicitConvString whiteImplicitConvString = new WhiteImplicitConvString();
     *     whiteImplicitConvString.setFooName("foo");
     *     if (...) {
     *         whiteImplicitConvString.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteImplicitConvStringList.add(whiteImplicitConvString);
     * }
     * whiteImplicitConvStringBhv.<span style="color: #DD4747">batchInsert</span>(whiteImplicitConvStringList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteImplicitConvStringList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteImplicitConvString> whiteImplicitConvStringList) {
        return doBatchInsert(whiteImplicitConvStringList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhiteImplicitConvString whiteImplicitConvString = new WhiteImplicitConvString();
     *     whiteImplicitConvString.setFooName("foo");
     *     if (...) {
     *         whiteImplicitConvString.setFooPrice(123);
     *     } else {
     *         whiteImplicitConvString.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteImplicitConvString.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteImplicitConvStringList.add(whiteImplicitConvString);
     * }
     * whiteImplicitConvStringBhv.<span style="color: #DD4747">batchUpdate</span>(whiteImplicitConvStringList);
     * </pre>
     * @param whiteImplicitConvStringList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteImplicitConvString> whiteImplicitConvStringList) {
        return doBatchUpdate(whiteImplicitConvStringList, null);
    }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * whiteImplicitConvStringBhv.<span style="color: #DD4747">batchUpdate</span>(whiteImplicitConvStringList, new SpecifyQuery<WhiteImplicitConvStringCB>() {
     *     public void specify(WhiteImplicitConvStringCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteImplicitConvStringBhv.<span style="color: #DD4747">batchUpdate</span>(whiteImplicitConvStringList, new SpecifyQuery<WhiteImplicitConvStringCB>() {
     *     public void specify(WhiteImplicitConvStringCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteImplicitConvStringList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteImplicitConvString> whiteImplicitConvStringList, SpecifyQuery<WhiteImplicitConvStringCB> updateColumnSpec) {
        return doBatchUpdate(whiteImplicitConvStringList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteImplicitConvStringList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteImplicitConvString> whiteImplicitConvStringList) {
        return doBatchDelete(whiteImplicitConvStringList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * whiteImplicitConvStringBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteImplicitConvString, WhiteImplicitConvStringCB&gt;() {
     *     public ConditionBean setup(WhiteImplicitConvString entity, WhiteImplicitConvStringCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteImplicitConvString, WhiteImplicitConvStringCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteImplicitConvString whiteImplicitConvString = new WhiteImplicitConvString();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvString.setPK...(value);</span>
     * whiteImplicitConvString.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvString.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvString.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvString.setVersionNo(value);</span>
     * WhiteImplicitConvStringCB cb = new WhiteImplicitConvStringCB();
     * cb.query().setFoo...(value);
     * whiteImplicitConvStringBhv.<span style="color: #DD4747">queryUpdate</span>(whiteImplicitConvString, cb);
     * </pre>
     * @param whiteImplicitConvString The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteImplicitConvString. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteImplicitConvString whiteImplicitConvString, WhiteImplicitConvStringCB cb) {
        return doQueryUpdate(whiteImplicitConvString, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteImplicitConvStringCB cb = new WhiteImplicitConvStringCB();
     * cb.query().setFoo...(value);
     * whiteImplicitConvStringBhv.<span style="color: #DD4747">queryDelete</span>(whiteImplicitConvString, cb);
     * </pre>
     * @param cb The condition-bean of WhiteImplicitConvString. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteImplicitConvStringCB cb) {
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
     * WhiteImplicitConvString whiteImplicitConvString = new WhiteImplicitConvString();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteImplicitConvString.setFoo...(value);
     * whiteImplicitConvString.setBar...(value);
     * InsertOption<WhiteImplicitConvStringCB> option = new InsertOption<WhiteImplicitConvStringCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteImplicitConvStringBhv.<span style="color: #DD4747">varyingInsert</span>(whiteImplicitConvString, option);
     * ... = whiteImplicitConvString.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteImplicitConvString The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteImplicitConvString whiteImplicitConvString, InsertOption<WhiteImplicitConvStringCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteImplicitConvString, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteImplicitConvString whiteImplicitConvString = new WhiteImplicitConvString();
     * whiteImplicitConvString.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteImplicitConvString.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteImplicitConvString.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteImplicitConvStringCB&gt; option = new UpdateOption&lt;WhiteImplicitConvStringCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteImplicitConvStringCB&gt;() {
     *         public void specify(WhiteImplicitConvStringCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteImplicitConvStringBhv.<span style="color: #DD4747">varyingUpdate</span>(whiteImplicitConvString, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteImplicitConvString The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteImplicitConvString whiteImplicitConvString, UpdateOption<WhiteImplicitConvStringCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteImplicitConvString, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteImplicitConvString The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteImplicitConvString whiteImplicitConvString, InsertOption<WhiteImplicitConvStringCB> insertOption, UpdateOption<WhiteImplicitConvStringCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdate(whiteImplicitConvString, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteImplicitConvString The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteImplicitConvString whiteImplicitConvString, DeleteOption<WhiteImplicitConvStringCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteImplicitConvString, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteImplicitConvStringList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteImplicitConvString> whiteImplicitConvStringList, InsertOption<WhiteImplicitConvStringCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteImplicitConvStringList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteImplicitConvStringList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteImplicitConvString> whiteImplicitConvStringList, UpdateOption<WhiteImplicitConvStringCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteImplicitConvStringList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteImplicitConvStringList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteImplicitConvString> whiteImplicitConvStringList, DeleteOption<WhiteImplicitConvStringCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteImplicitConvStringList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteImplicitConvString, WhiteImplicitConvStringCB> setupper, InsertOption<WhiteImplicitConvStringCB> option) {
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
     * WhiteImplicitConvString whiteImplicitConvString = new WhiteImplicitConvString();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvString.setPK...(value);</span>
     * whiteImplicitConvString.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvString.setVersionNo(value);</span>
     * WhiteImplicitConvStringCB cb = new WhiteImplicitConvStringCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteImplicitConvStringCB&gt; option = new UpdateOption&lt;WhiteImplicitConvStringCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteImplicitConvStringCB&gt;() {
     *     public void specify(WhiteImplicitConvStringCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteImplicitConvStringBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteImplicitConvString, cb, option);
     * </pre>
     * @param whiteImplicitConvString The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteImplicitConvString. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteImplicitConvString whiteImplicitConvString, WhiteImplicitConvStringCB cb, UpdateOption<WhiteImplicitConvStringCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteImplicitConvString, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteImplicitConvString. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteImplicitConvStringCB cb, DeleteOption<WhiteImplicitConvStringCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteImplicitConvStringBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<WhiteImplicitConvStringBhv> facadeExecutor = doOutsideSql();
        return facadeExecutor.xbasicExecutor(); // variable to resolve generic type
    }

    // ===================================================================================
    //                                                                         Hyper Patch
    //                                                                         ===========
    @Override
    protected <RESULT extends WhiteImplicitConvString> org.seasar.dbflute.bhv.core.command.SelectCursorCBCommand<RESULT> newSelectCursorCBCommand() {
        return new com.example.dbflute.mysql.dbflute.allcommon.DBFluteConfig.SelectCursorCBCommandHyperPatch<RESULT>();
    }

    @Override
    protected <RESULT extends WhiteImplicitConvString> org.seasar.dbflute.bhv.core.command.SelectListCBCommand<RESULT> newSelectListCBCommand() {
        return new com.example.dbflute.mysql.dbflute.allcommon.DBFluteConfig.SelectListCBCommandHyperPatch<RESULT>();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends WhiteImplicitConvString> typeOfSelectedEntity() { return WhiteImplicitConvString.class; }
    protected Class<WhiteImplicitConvString> typeOfHandlingEntity() { return WhiteImplicitConvString.class; }
    protected Class<WhiteImplicitConvStringCB> typeOfHandlingConditionBean() { return WhiteImplicitConvStringCB.class; }
}
