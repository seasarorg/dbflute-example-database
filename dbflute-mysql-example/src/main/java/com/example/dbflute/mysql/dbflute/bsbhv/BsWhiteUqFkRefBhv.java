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
 * The behavior of WHITE_UQ_FK_REF as TABLE. <br />
 * <pre>
 * [primary key]
 *     UQ_FK_REF_ID
 *
 * [column]
 *     UQ_FK_REF_ID, FK_TO_PK_ID, FK_TO_UQ_CODE, COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE
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
 *     white_uq_fk
 *
 * [referrer table]
 *     white_uq_fk_ref_nest
 *
 * [foreign property]
 *     whiteUqFkByFkToPkId, whiteUqFkByFkToUqCode
 *
 * [referrer property]
 *     whiteUqFkRefNestList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteUqFkRefBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_uq_fk_ref"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public DBMeta getDBMeta() { return WhiteUqFkRefDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteUqFkRefDbm getMyDBMeta() { return WhiteUqFkRefDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhiteUqFkRef newEntity() { return new WhiteUqFkRef(); }

    /** {@inheritDoc} */
    public WhiteUqFkRefCB newConditionBean() { return new WhiteUqFkRefCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteUqFkRef newMyEntity() { return new WhiteUqFkRef(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteUqFkRefCB newMyConditionBean() { return new WhiteUqFkRefCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteUqFkRefCB cb = new WhiteUqFkRefCB();
     * cb.query().setFoo...(value);
     * int count = whiteUqFkRefBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteUqFkRef. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteUqFkRefCB cb) {
        return facadeSelectCount(cb);
    }

    protected int facadeSelectCount(WhiteUqFkRefCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteUqFkRefCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteUqFkRefCB cb) { // called by selectPage(cb)
        assertCBStateValid(cb);
        return delegateSelectCountPlainly(cb);
    }

    @Override
    protected int doReadCount(ConditionBean cb) {
        return facadeSelectCount(downcast(cb));
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean. #beforejava8 <br />
     * <span style="color: #AD4747; font-size: 120%">The return might be null if no data, so you should have null check.</span> <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, use selectEntityWithDeletedCheck().</span>
     * <pre>
     * WhiteUqFkRefCB cb = new WhiteUqFkRefCB();
     * cb.query().setFoo...(value);
     * WhiteUqFkRef whiteUqFkRef = whiteUqFkRefBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (whiteUqFkRef != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = whiteUqFkRef.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteUqFkRef. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteUqFkRef selectEntity(WhiteUqFkRefCB cb) {
        return facadeSelectEntity(cb);
    }

    protected WhiteUqFkRef facadeSelectEntity(WhiteUqFkRefCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteUqFkRef> ENTITY doSelectEntity(WhiteUqFkRefCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, WhiteUqFkRefCB>() {
            public List<ENTITY> callbackSelectList(WhiteUqFkRefCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    protected <ENTITY extends WhiteUqFkRef> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteUqFkRefCB cb, Class<ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return facadeSelectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * WhiteUqFkRefCB cb = new WhiteUqFkRefCB();
     * cb.query().setFoo...(value);
     * WhiteUqFkRef whiteUqFkRef = whiteUqFkRefBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteUqFkRef.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteUqFkRef. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteUqFkRef selectEntityWithDeletedCheck(WhiteUqFkRefCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    protected WhiteUqFkRef facadeSelectEntityWithDeletedCheck(WhiteUqFkRefCB cb) {
        return doSelectEntityWithDeletedCheck(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteUqFkRef> ENTITY doSelectEntityWithDeletedCheck(WhiteUqFkRefCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteUqFkRefCB>() {
            public List<ENTITY> callbackSelectList(WhiteUqFkRefCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return facadeSelectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param uqFkRefId : PK, NotNull, DECIMAL(16). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteUqFkRef selectByPKValue(Long uqFkRefId) {
        return facadeSelectByPKValue(uqFkRefId);
    }

    protected WhiteUqFkRef facadeSelectByPKValue(Long uqFkRefId) {
        return doSelectByPK(uqFkRefId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteUqFkRef> ENTITY doSelectByPK(Long uqFkRefId, Class<ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(uqFkRefId), tp);
    }

    protected <ENTITY extends WhiteUqFkRef> OptionalEntity<ENTITY> doSelectOptionalByPK(Long uqFkRefId, Class<ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(uqFkRefId, tp), uqFkRefId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param uqFkRefId : PK, NotNull, DECIMAL(16). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteUqFkRef selectByPKValueWithDeletedCheck(Long uqFkRefId) {
        return doSelectByPKWithDeletedCheck(uqFkRefId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteUqFkRef> ENTITY doSelectByPKWithDeletedCheck(Long uqFkRefId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(uqFkRefId), tp);
    }

    protected WhiteUqFkRefCB xprepareCBAsPK(Long uqFkRefId) {
        assertObjectNotNull("uqFkRefId", uqFkRefId);
        return newConditionBean().acceptPK(uqFkRefId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param compoundUqFirstCode : UQ+, NotNull, CHAR(3). (NotNull)
     * @param compoundUqSecondCode : +UQ, NotNull, CHAR(3). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteUqFkRef> selectByUniqueOf(String compoundUqFirstCode, String compoundUqSecondCode) {
        return facadeSelectByUniqueOf(compoundUqFirstCode, compoundUqSecondCode);
    }

    protected OptionalEntity<WhiteUqFkRef> facadeSelectByUniqueOf(String compoundUqFirstCode, String compoundUqSecondCode) {
        return doSelectByUniqueOf(compoundUqFirstCode, compoundUqSecondCode, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteUqFkRef> OptionalEntity<ENTITY> doSelectByUniqueOf(String compoundUqFirstCode, String compoundUqSecondCode, Class<ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(compoundUqFirstCode, compoundUqSecondCode), tp), compoundUqFirstCode, compoundUqSecondCode);
    }

    protected WhiteUqFkRefCB xprepareCBAsUniqueOf(String compoundUqFirstCode, String compoundUqSecondCode) {
        assertObjectNotNull("compoundUqFirstCode", compoundUqFirstCode);assertObjectNotNull("compoundUqSecondCode", compoundUqSecondCode);
        return newConditionBean().acceptUniqueOf(compoundUqFirstCode, compoundUqSecondCode);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteUqFkRefCB cb = new WhiteUqFkRefCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteUqFkRef&gt; whiteUqFkRefList = whiteUqFkRefBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteUqFkRef whiteUqFkRef : whiteUqFkRefList) {
     *     ... = whiteUqFkRef.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteUqFkRef. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteUqFkRef> selectList(WhiteUqFkRefCB cb) {
        return facadeSelectList(cb);
    }

    protected ListResultBean<WhiteUqFkRef> facadeSelectList(WhiteUqFkRefCB cb) {
        return doSelectList(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteUqFkRef> ListResultBean<ENTITY> doSelectList(WhiteUqFkRefCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, WhiteUqFkRefCB>() {
            public List<ENTITY> callbackSelectList(WhiteUqFkRefCB lcb, Class<ENTITY> ltp) { return delegateSelectList(lcb, ltp); } });
    }

    @Override
    protected ListResultBean<? extends Entity> doReadList(ConditionBean cb) {
        return facadeSelectList(downcast(cb));
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * WhiteUqFkRefCB cb = new WhiteUqFkRefCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteUqFkRef&gt; page = whiteUqFkRefBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteUqFkRef whiteUqFkRef : page) {
     *     ... = whiteUqFkRef.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteUqFkRef. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteUqFkRef> selectPage(WhiteUqFkRefCB cb) {
        return facadeSelectPage(cb);
    }

    protected PagingResultBean<WhiteUqFkRef> facadeSelectPage(WhiteUqFkRefCB cb) {
        return doSelectPage(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteUqFkRef> PagingResultBean<ENTITY> doSelectPage(WhiteUqFkRefCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, WhiteUqFkRefCB>() {
            public int callbackSelectCount(WhiteUqFkRefCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteUqFkRefCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    @Override
    protected PagingResultBean<? extends Entity> doReadPage(ConditionBean cb) {
        return facadeSelectPage(downcast(cb));
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteUqFkRefCB cb = new WhiteUqFkRefCB();
     * cb.query().setFoo...(value);
     * whiteUqFkRefBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteUqFkRef&gt;() {
     *     public void handle(WhiteUqFkRef entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteUqFkRef. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteUqFkRef. (NotNull)
     */
    public void selectCursor(WhiteUqFkRefCB cb, EntityRowHandler<WhiteUqFkRef> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    protected void facadeSelectCursor(WhiteUqFkRefCB cb, EntityRowHandler<WhiteUqFkRef> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteUqFkRef> void doSelectCursor(WhiteUqFkRefCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, WhiteUqFkRefCB>() {
            public void callbackSelectCursor(WhiteUqFkRefCB lcb, EntityRowHandler<ENTITY> lhandler, Class<ENTITY> ltp) { delegateSelectCursor(lcb, lhandler, ltp); }
            public List<ENTITY> callbackSelectList(WhiteUqFkRefCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteUqFkRefBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteUqFkRefCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhiteUqFkRefCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    protected <RESULT> HpSLSFunction<WhiteUqFkRefCB, RESULT> facadeScalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newConditionBean());
    }

    protected <RESULT, CB extends WhiteUqFkRefCB> HpSLSFunction<CB, RESULT> doScalarSelect(final Class<RESULT> tp, final CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        HpSLSExecutor<CB, RESULT> executor = createHpSLSExecutor(); // variable to resolve generic
        return createSLSFunction(cb, tp, executor);
    }

    protected <RESULT> HpSLSFunction<? extends ConditionBean, RESULT> doReadScalar(Class<RESULT> tp) {
        return facadeScalarSelect(tp);
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
     * @param whiteUqFkRefList The entity list of whiteUqFkRef. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhiteUqFkRef> whiteUqFkRefList, ReferrerLoaderHandler<LoaderOfWhiteUqFkRef> handler) {
        xassLRArg(whiteUqFkRefList, handler);
        handler.handle(new LoaderOfWhiteUqFkRef().ready(whiteUqFkRefList, _behaviorSelector));
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
     * @param whiteUqFkRef The entity of whiteUqFkRef. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhiteUqFkRef whiteUqFkRef, ReferrerLoaderHandler<LoaderOfWhiteUqFkRef> handler) {
        xassLRArg(whiteUqFkRef, handler);
        handler.handle(new LoaderOfWhiteUqFkRef().ready(xnewLRAryLs(whiteUqFkRef), _behaviorSelector));
    }

    /**
     * Load referrer of whiteUqFkRefNestList by the set-upper of referrer. <br />
     * white_uq_fk_ref_nest by COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE, named 'whiteUqFkRefNestList'.
     * <pre>
     * whiteUqFkRefBhv.<span style="color: #DD4747">loadWhiteUqFkRefNestList</span>(whiteUqFkRefList, new ConditionBeanSetupper&lt;WhiteUqFkRefNestCB&gt;() {
     *     public void setup(WhiteUqFkRefNestCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (WhiteUqFkRef whiteUqFkRef : whiteUqFkRefList) {
     *     ... = whiteUqFkRef.<span style="color: #DD4747">getWhiteUqFkRefNestList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().set[ForeignKey]_InScope(pkList);
     * cb.query().addOrderBy_[ForeignKey]_Asc();
     * </pre>
     * @param whiteUqFkRefList The entity list of whiteUqFkRef. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteUqFkRefNest> loadWhiteUqFkRefNestList(List<WhiteUqFkRef> whiteUqFkRefList, ConditionBeanSetupper<WhiteUqFkRefNestCB> setupper) {
        xassLRArg(whiteUqFkRefList, setupper);
        return doLoadWhiteUqFkRefNestList(whiteUqFkRefList, new LoadReferrerOption<WhiteUqFkRefNestCB, WhiteUqFkRefNest>().xinit(setupper));
    }

    /**
     * Load referrer of whiteUqFkRefNestList by the set-upper of referrer. <br />
     * white_uq_fk_ref_nest by COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE, named 'whiteUqFkRefNestList'.
     * <pre>
     * whiteUqFkRefBhv.<span style="color: #DD4747">loadWhiteUqFkRefNestList</span>(whiteUqFkRefList, new ConditionBeanSetupper&lt;WhiteUqFkRefNestCB&gt;() {
     *     public void setup(WhiteUqFkRefNestCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = whiteUqFkRef.<span style="color: #DD4747">getWhiteUqFkRefNestList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().set[ForeignKey]_InScope(pkList);
     * cb.query().addOrderBy_[ForeignKey]_Asc();
     * </pre>
     * @param whiteUqFkRef The entity of whiteUqFkRef. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteUqFkRefNest> loadWhiteUqFkRefNestList(WhiteUqFkRef whiteUqFkRef, ConditionBeanSetupper<WhiteUqFkRefNestCB> setupper) {
        xassLRArg(whiteUqFkRef, setupper);
        return doLoadWhiteUqFkRefNestList(xnewLRLs(whiteUqFkRef), new LoadReferrerOption<WhiteUqFkRefNestCB, WhiteUqFkRefNest>().xinit(setupper));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param whiteUqFkRef The entity of whiteUqFkRef. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteUqFkRefNest> loadWhiteUqFkRefNestList(WhiteUqFkRef whiteUqFkRef, LoadReferrerOption<WhiteUqFkRefNestCB, WhiteUqFkRefNest> loadReferrerOption) {
        xassLRArg(whiteUqFkRef, loadReferrerOption);
        return loadWhiteUqFkRefNestList(xnewLRLs(whiteUqFkRef), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean setupper.} #beforejava8
     * @param whiteUqFkRefList The entity list of whiteUqFkRef. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WhiteUqFkRefNest> loadWhiteUqFkRefNestList(List<WhiteUqFkRef> whiteUqFkRefList, LoadReferrerOption<WhiteUqFkRefNestCB, WhiteUqFkRefNest> loadReferrerOption) {
        xassLRArg(whiteUqFkRefList, loadReferrerOption);
        if (whiteUqFkRefList.isEmpty()) { return (NestedReferrerListGateway<WhiteUqFkRefNest>)EMPTY_NREF_LGWAY; }
        return doLoadWhiteUqFkRefNestList(whiteUqFkRefList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WhiteUqFkRefNest> doLoadWhiteUqFkRefNestList(List<WhiteUqFkRef> whiteUqFkRefList, LoadReferrerOption<WhiteUqFkRefNestCB, WhiteUqFkRefNest> option) {
        final WhiteUqFkRefNestBhv referrerBhv = xgetBSFLR().select(WhiteUqFkRefNestBhv.class);
        return helpLoadReferrerInternally(whiteUqFkRefList, option, new InternalLoadReferrerCallback<WhiteUqFkRef, java.util.Map<String, Object>, WhiteUqFkRefNestCB, WhiteUqFkRefNest>() {
            public java.util.Map<String, Object> getPKVal(WhiteUqFkRef et) {
                java.util.Map<String, Object> primaryKeyMap = new java.util.LinkedHashMap<String, Object>();
                primaryKeyMap.put("CompoundUqFirstCode", et.getCompoundUqFirstCode());
                primaryKeyMap.put("CompoundUqSecondCode", et.getCompoundUqSecondCode());
                return primaryKeyMap;
            }
            public void setRfLs(WhiteUqFkRef et, List<WhiteUqFkRefNest> ls) { et.setWhiteUqFkRefNestList(ls); }
            public WhiteUqFkRefNestCB newMyCB() { return referrerBhv.newConditionBean(); }
            public void qyFKIn(WhiteUqFkRefNestCB cb, List<java.util.Map<String, Object>> ls) {
                final String aliasName = cb.getSqlClause().getBasePointAliasName();
                String identity = null;
                StringBuilder sb = new StringBuilder();
                for (java.util.Map<String, Object> primaryKeyMap : ls) {
                    if (sb.length() > 0) { sb.append(")").append(ln()).append("     or ("); }
                    sb.append(aliasName).append(".COMPOUND_UQ_FIRST_CODE = ");
                    identity = "whiteUqFkRefNestListCompoundUqFirstCode";
                    sb.append(cb.query().xregisterFreeParameterToThemeList(identity, primaryKeyMap.get("CompoundUqFirstCode")));
                    sb.append(" and ");
                    sb.append(aliasName).append(".COMPOUND_UQ_SECOND_CODE = ");
                    identity = "whiteUqFkRefNestListCompoundUqSecondCode";
                    sb.append(cb.query().xregisterFreeParameterToThemeList(identity, primaryKeyMap.get("CompoundUqSecondCode")));
                }
                sb.insert(0, "((").append("))");
                cb.getSqlClause().registerWhereClause(sb.toString(), aliasName);
            }
            public void qyOdFKAsc(WhiteUqFkRefNestCB cb) {
                cb.query().addOrderBy_CompoundUqFirstCode_Asc();
                cb.query().addOrderBy_CompoundUqSecondCode_Asc();
            }
            public void spFKCol(WhiteUqFkRefNestCB cb) {
                cb.specify().columnCompoundUqFirstCode();
                cb.specify().columnCompoundUqSecondCode();
            }
            public List<WhiteUqFkRefNest> selRfLs(WhiteUqFkRefNestCB cb) { return referrerBhv.selectList(cb); }
            public java.util.Map<String, Object> getFKVal(WhiteUqFkRefNest re) {
                java.util.Map<String, Object> foreignKeyMap = new java.util.LinkedHashMap<String, Object>();
                foreignKeyMap.put("CompoundUqFirstCode", re.getCompoundUqFirstCode());
                foreignKeyMap.put("CompoundUqSecondCode", re.getCompoundUqSecondCode());
                return foreignKeyMap;
            }
            public void setlcEt(WhiteUqFkRefNest re, WhiteUqFkRef le)
            { re.setWhiteUqFkRef(le); }
            public String getRfPrNm() { return "whiteUqFkRefNestList"; }
        });
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'WhiteUqFk'.
     * @param whiteUqFkRefList The list of whiteUqFkRef. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteUqFk> pulloutWhiteUqFkByFkToPkId(List<WhiteUqFkRef> whiteUqFkRefList) {
        return helpPulloutInternally(whiteUqFkRefList, new InternalPulloutCallback<WhiteUqFkRef, WhiteUqFk>() {
            public WhiteUqFk getFr(WhiteUqFkRef et)
            { return et.getWhiteUqFkByFkToPkId(); }
            public boolean hasRf() { return true; }
            public void setRfLs(WhiteUqFk et, List<WhiteUqFkRef> ls)
            { et.setWhiteUqFkRefByFkToPkIdList(ls); }
        });
    }

    /**
     * Pull out the list of foreign table 'WhiteUqFk'.
     * @param whiteUqFkRefList The list of whiteUqFkRef. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteUqFk> pulloutWhiteUqFkByFkToUqCode(List<WhiteUqFkRef> whiteUqFkRefList) {
        return helpPulloutInternally(whiteUqFkRefList, new InternalPulloutCallback<WhiteUqFkRef, WhiteUqFk>() {
            public WhiteUqFk getFr(WhiteUqFkRef et)
            { return et.getWhiteUqFkByFkToUqCode(); }
            public boolean hasRf() { return true; }
            public void setRfLs(WhiteUqFk et, List<WhiteUqFkRef> ls)
            { et.setWhiteUqFkRefByFkToUqCodeList(ls); }
        });
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key uqFkRefId.
     * @param whiteUqFkRefList The list of whiteUqFkRef. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractUqFkRefIdList(List<WhiteUqFkRef> whiteUqFkRefList) {
        return helpExtractListInternally(whiteUqFkRefList, new InternalExtractCallback<WhiteUqFkRef, Long>() {
            public Long getCV(WhiteUqFkRef et) { return et.getUqFkRefId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteUqFkRef whiteUqFkRef = new WhiteUqFkRef();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteUqFkRef.setFoo...(value);
     * whiteUqFkRef.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteUqFkRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteUqFkRef.set...;</span>
     * whiteUqFkRefBhv.<span style="color: #DD4747">insert</span>(whiteUqFkRef);
     * ... = whiteUqFkRef.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteUqFkRef The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteUqFkRef whiteUqFkRef) {
        doInsert(whiteUqFkRef, null);
    }

    protected void doInsert(WhiteUqFkRef et, InsertOption<WhiteUqFkRefCB> op) {
        assertObjectNotNull("whiteUqFkRef", et);
        prepareInsertOption(op);
        delegateInsert(et, op);
    }

    protected void prepareInsertOption(InsertOption<WhiteUqFkRefCB> op) {
        if (op == null) { return; }
        assertInsertOptionStatus(op);
        if (op.hasSpecifiedInsertColumn()) {
            op.resolveInsertColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    @Override
    protected void doCreate(Entity et, InsertOption<? extends ConditionBean> op) {
        doInsert(downcast(et), downcast(op));
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteUqFkRef whiteUqFkRef = new WhiteUqFkRef();
     * whiteUqFkRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteUqFkRef.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteUqFkRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteUqFkRef.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteUqFkRef.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteUqFkRefBhv.<span style="color: #DD4747">update</span>(whiteUqFkRef);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteUqFkRef The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhiteUqFkRef whiteUqFkRef) {
        doUpdate(whiteUqFkRef, null);
    }

    protected void doUpdate(WhiteUqFkRef et, final UpdateOption<WhiteUqFkRefCB> op) {
        assertObjectNotNull("whiteUqFkRef", et);
        prepareUpdateOption(op);
        helpUpdateInternally(et, new InternalUpdateCallback<WhiteUqFkRef>() {
            public int callbackDelegateUpdate(WhiteUqFkRef let) { return delegateUpdate(let, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhiteUqFkRefCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) { op.resolveSelfSpecification(createCBForVaryingUpdate()); }
        if (op.hasSpecifiedUpdateColumn()) { op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate()); }
    }

    protected WhiteUqFkRefCB createCBForVaryingUpdate()
    { WhiteUqFkRefCB cb = newConditionBean(); cb.xsetupForVaryingUpdate(); return cb; }

    protected WhiteUqFkRefCB createCBForSpecifiedUpdate()
    { WhiteUqFkRefCB cb = newConditionBean(); cb.xsetupForSpecifiedUpdate(); return cb; }

    @Override
    protected void doModify(Entity et, UpdateOption<? extends ConditionBean> op) {
        doUpdate(downcast(et), downcast(op));
    }

    @Override
    protected void doModifyNonstrict(Entity et, UpdateOption<? extends ConditionBean> op) {
        doModify(et, op);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param whiteUqFkRef The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteUqFkRef whiteUqFkRef) {
        doInsertOrUpdate(whiteUqFkRef, null, null);
    }

    protected void doInsertOrUpdate(WhiteUqFkRef et, final InsertOption<WhiteUqFkRefCB> iop, final UpdateOption<WhiteUqFkRefCB> uop) {
        assertObjectNotNull("whiteUqFkRef", et);
        helpInsertOrUpdateInternally(et, new InternalInsertOrUpdateCallback<WhiteUqFkRef, WhiteUqFkRefCB>() {
            public void callbackInsert(WhiteUqFkRef let) { doInsert(let, iop); }
            public void callbackUpdate(WhiteUqFkRef let) { doUpdate(let, uop); }
            public WhiteUqFkRefCB callbackNewMyConditionBean() { return newConditionBean(); }
            public int callbackSelectCount(WhiteUqFkRefCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        doInsertOrUpdate(downcast(et), downcast(iop), downcast(uop));
    }

    @Override
    protected void doCreateOrModifyNonstrict(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        doCreateOrModify(et, iop, uop);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteUqFkRef whiteUqFkRef = new WhiteUqFkRef();
     * whiteUqFkRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteUqFkRef.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteUqFkRefBhv.<span style="color: #DD4747">delete</span>(whiteUqFkRef);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteUqFkRef The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteUqFkRef whiteUqFkRef) {
        doDelete(whiteUqFkRef, null);
    }

    protected void doDelete(WhiteUqFkRef et, final DeleteOption<WhiteUqFkRefCB> op) {
        assertObjectNotNull("whiteUqFkRef", et);
        prepareDeleteOption(op);
        helpDeleteInternally(et, new InternalDeleteCallback<WhiteUqFkRef>() {
            public int callbackDelegateDelete(WhiteUqFkRef let) { return delegateDelete(let, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhiteUqFkRefCB> op)
    { if (op != null) { assertDeleteOptionStatus(op); } }

    @Override
    protected void doRemove(Entity et, DeleteOption<? extends ConditionBean> op) {
        doDelete(downcast(et), downcast(op));
    }

    @Override
    protected void doRemoveNonstrict(Entity et, DeleteOption<? extends ConditionBean> op) {
        doRemove(et, op);
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
     *     WhiteUqFkRef whiteUqFkRef = new WhiteUqFkRef();
     *     whiteUqFkRef.setFooName("foo");
     *     if (...) {
     *         whiteUqFkRef.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteUqFkRefList.add(whiteUqFkRef);
     * }
     * whiteUqFkRefBhv.<span style="color: #DD4747">batchInsert</span>(whiteUqFkRefList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteUqFkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteUqFkRef> whiteUqFkRefList) {
        return doBatchInsert(whiteUqFkRefList, null);
    }

    protected int[] doBatchInsert(List<WhiteUqFkRef> ls, InsertOption<WhiteUqFkRefCB> op) {
        assertObjectNotNull("whiteUqFkRefList", ls);
        InsertOption<WhiteUqFkRefCB> rlop; if (op != null) { rlop = op; } else { rlop = createPlainInsertOption(); }
        prepareBatchInsertOption(ls, rlop); // required
        return delegateBatchInsert(ls, rlop);
    }

    protected void prepareBatchInsertOption(List<WhiteUqFkRef> ls, InsertOption<WhiteUqFkRefCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(ls);
        prepareInsertOption(op);
    }

    @Override
    protected int[] doLumpCreate(List<Entity> ls, InsertOption<? extends ConditionBean> op) {
        return doBatchInsert(downcast(ls), downcast(op));
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhiteUqFkRef whiteUqFkRef = new WhiteUqFkRef();
     *     whiteUqFkRef.setFooName("foo");
     *     if (...) {
     *         whiteUqFkRef.setFooPrice(123);
     *     } else {
     *         whiteUqFkRef.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteUqFkRef.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteUqFkRefList.add(whiteUqFkRef);
     * }
     * whiteUqFkRefBhv.<span style="color: #DD4747">batchUpdate</span>(whiteUqFkRefList);
     * </pre>
     * @param whiteUqFkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteUqFkRef> whiteUqFkRefList) {
        return doBatchUpdate(whiteUqFkRefList, null);
    }

    protected int[] doBatchUpdate(List<WhiteUqFkRef> ls, UpdateOption<WhiteUqFkRefCB> op) {
        assertObjectNotNull("whiteUqFkRefList", ls);
        UpdateOption<WhiteUqFkRefCB> rlop; if (op != null) { rlop = op; } else { rlop = createPlainUpdateOption(); }
        prepareBatchUpdateOption(ls, rlop); // required
        return delegateBatchUpdate(ls, rlop);
    }

    protected void prepareBatchUpdateOption(List<WhiteUqFkRef> ls, UpdateOption<WhiteUqFkRefCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(ls);
        prepareUpdateOption(op);
    }

    @Override
    protected int[] doLumpModify(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doBatchUpdate(downcast(ls), downcast(op));
    }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * whiteUqFkRefBhv.<span style="color: #DD4747">batchUpdate</span>(whiteUqFkRefList, new SpecifyQuery<WhiteUqFkRefCB>() {
     *     public void specify(WhiteUqFkRefCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteUqFkRefBhv.<span style="color: #DD4747">batchUpdate</span>(whiteUqFkRefList, new SpecifyQuery<WhiteUqFkRefCB>() {
     *     public void specify(WhiteUqFkRefCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteUqFkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteUqFkRef> whiteUqFkRefList, SpecifyQuery<WhiteUqFkRefCB> updateColumnSpec) {
        return doBatchUpdate(whiteUqFkRefList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteUqFkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteUqFkRef> whiteUqFkRefList) {
        return doBatchDelete(whiteUqFkRefList, null);
    }

    protected int[] doBatchDelete(List<WhiteUqFkRef> ls, DeleteOption<WhiteUqFkRefCB> op) {
        assertObjectNotNull("whiteUqFkRefList", ls);
        prepareDeleteOption(op);
        return delegateBatchDelete(ls, op);
    }

    @Override
    protected int[] doLumpRemove(List<Entity> ls, DeleteOption<? extends ConditionBean> op) {
        return doBatchDelete(downcast(ls), downcast(op));
    }

    @Override
    protected int[] doLumpRemoveNonstrict(List<Entity> ls, DeleteOption<? extends ConditionBean> op) {
        return doLumpRemove(ls, op);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * whiteUqFkRefBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteUqFkRef, WhiteUqFkRefCB&gt;() {
     *     public ConditionBean setup(whiteUqFkRef entity, WhiteUqFkRefCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteUqFkRef, WhiteUqFkRefCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteUqFkRef, WhiteUqFkRefCB> sp, InsertOption<WhiteUqFkRefCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        WhiteUqFkRef et = newEntity();
        WhiteUqFkRefCB cb = createCBForQueryInsert();
        return delegateQueryInsert(et, cb, sp.setup(et, cb), op);
    }

    protected WhiteUqFkRefCB createCBForQueryInsert()
    { WhiteUqFkRefCB cb = newConditionBean(); cb.xsetupForQueryInsert(); return cb; }

    @Override
    protected int doRangeCreate(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> setupper, InsertOption<? extends ConditionBean> op) {
        return doQueryInsert(downcast(setupper), downcast(op));
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteUqFkRef whiteUqFkRef = new WhiteUqFkRef();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteUqFkRef.setPK...(value);</span>
     * whiteUqFkRef.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteUqFkRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteUqFkRef.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteUqFkRef.setVersionNo(value);</span>
     * WhiteUqFkRefCB cb = new WhiteUqFkRefCB();
     * cb.query().setFoo...(value);
     * whiteUqFkRefBhv.<span style="color: #DD4747">queryUpdate</span>(whiteUqFkRef, cb);
     * </pre>
     * @param whiteUqFkRef The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteUqFkRef. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteUqFkRef whiteUqFkRef, WhiteUqFkRefCB cb) {
        return doQueryUpdate(whiteUqFkRef, cb, null);
    }

    protected int doQueryUpdate(WhiteUqFkRef et, WhiteUqFkRefCB cb, UpdateOption<WhiteUqFkRefCB> op) {
        assertObjectNotNull("whiteUqFkRef", et); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(et, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        return doQueryUpdate(downcast(et), downcast(cb), downcast(op));
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteUqFkRefCB cb = new WhiteUqFkRefCB();
     * cb.query().setFoo...(value);
     * whiteUqFkRefBhv.<span style="color: #DD4747">queryDelete</span>(whiteUqFkRef, cb);
     * </pre>
     * @param cb The condition-bean of WhiteUqFkRef. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteUqFkRefCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteUqFkRefCB cb, DeleteOption<WhiteUqFkRefCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        return doQueryDelete(downcast(cb), downcast(op));
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
     * WhiteUqFkRef whiteUqFkRef = new WhiteUqFkRef();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteUqFkRef.setFoo...(value);
     * whiteUqFkRef.setBar...(value);
     * InsertOption<WhiteUqFkRefCB> option = new InsertOption<WhiteUqFkRefCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteUqFkRefBhv.<span style="color: #DD4747">varyingInsert</span>(whiteUqFkRef, option);
     * ... = whiteUqFkRef.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteUqFkRef The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteUqFkRef whiteUqFkRef, InsertOption<WhiteUqFkRefCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteUqFkRef, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteUqFkRef whiteUqFkRef = new WhiteUqFkRef();
     * whiteUqFkRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteUqFkRef.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteUqFkRef.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteUqFkRefCB&gt; option = new UpdateOption&lt;WhiteUqFkRefCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteUqFkRefCB&gt;() {
     *         public void specify(WhiteUqFkRefCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteUqFkRefBhv.<span style="color: #DD4747">varyingUpdate</span>(whiteUqFkRef, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteUqFkRef The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteUqFkRef whiteUqFkRef, UpdateOption<WhiteUqFkRefCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteUqFkRef, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteUqFkRef The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteUqFkRef whiteUqFkRef, InsertOption<WhiteUqFkRefCB> insertOption, UpdateOption<WhiteUqFkRefCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdate(whiteUqFkRef, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteUqFkRef The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteUqFkRef whiteUqFkRef, DeleteOption<WhiteUqFkRefCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteUqFkRef, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteUqFkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteUqFkRef> whiteUqFkRefList, InsertOption<WhiteUqFkRefCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteUqFkRefList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteUqFkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteUqFkRef> whiteUqFkRefList, UpdateOption<WhiteUqFkRefCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteUqFkRefList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteUqFkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteUqFkRef> whiteUqFkRefList, DeleteOption<WhiteUqFkRefCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteUqFkRefList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteUqFkRef, WhiteUqFkRefCB> setupper, InsertOption<WhiteUqFkRefCB> option) {
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
     * WhiteUqFkRef whiteUqFkRef = new WhiteUqFkRef();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteUqFkRef.setPK...(value);</span>
     * whiteUqFkRef.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteUqFkRef.setVersionNo(value);</span>
     * WhiteUqFkRefCB cb = new WhiteUqFkRefCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteUqFkRefCB&gt; option = new UpdateOption&lt;WhiteUqFkRefCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteUqFkRefCB&gt;() {
     *     public void specify(WhiteUqFkRefCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteUqFkRefBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteUqFkRef, cb, option);
     * </pre>
     * @param whiteUqFkRef The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteUqFkRef. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteUqFkRef whiteUqFkRef, WhiteUqFkRefCB cb, UpdateOption<WhiteUqFkRefCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteUqFkRef, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteUqFkRef. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteUqFkRefCB cb, DeleteOption<WhiteUqFkRefCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteUqFkRefBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhiteUqFkRefCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhiteUqFkRefCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhiteUqFkRef> void delegateSelectCursor(WhiteUqFkRefCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends WhiteUqFkRef> List<ENTITY> delegateSelectList(WhiteUqFkRefCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhiteUqFkRef et, InsertOption<WhiteUqFkRefCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(WhiteUqFkRef et, UpdateOption<WhiteUqFkRefCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(WhiteUqFkRef et, UpdateOption<WhiteUqFkRefCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(WhiteUqFkRef et, DeleteOption<WhiteUqFkRefCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(WhiteUqFkRef et, DeleteOption<WhiteUqFkRefCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<WhiteUqFkRef> ls, InsertOption<WhiteUqFkRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhiteUqFkRef> ls, UpdateOption<WhiteUqFkRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhiteUqFkRef> ls, UpdateOption<WhiteUqFkRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhiteUqFkRef> ls, DeleteOption<WhiteUqFkRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhiteUqFkRef> ls, DeleteOption<WhiteUqFkRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhiteUqFkRef et, WhiteUqFkRefCB inCB, ConditionBean resCB, InsertOption<WhiteUqFkRefCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhiteUqFkRef et, WhiteUqFkRefCB cb, UpdateOption<WhiteUqFkRefCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(WhiteUqFkRefCB cb, DeleteOption<WhiteUqFkRefCB> op)
    { if (!processBeforeQueryDelete(cb, op)) { return 0; } return invoke(createQueryDeleteCBCommand(cb, op));  }

    // ===================================================================================
    //                                                                Optimistic Lock Info
    //                                                                ====================
    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean hasVersionNoValue(Entity et) {
        return false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean hasUpdateDateValue(Entity et) {
        return false;
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    protected Class<WhiteUqFkRef> typeOfSelectedEntity()
    { return WhiteUqFkRef.class; }

    protected WhiteUqFkRef downcast(Entity et)
    { return helpEntityDowncastInternally(et, WhiteUqFkRef.class); }

    protected WhiteUqFkRefCB downcast(ConditionBean cb)
    { return helpConditionBeanDowncastInternally(cb, WhiteUqFkRefCB.class); }

    @SuppressWarnings("unchecked")
    protected List<WhiteUqFkRef> downcast(List<? extends Entity> ls)
    { return (List<WhiteUqFkRef>)ls; }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteUqFkRefCB> downcast(InsertOption<? extends ConditionBean> op)
    { return (InsertOption<WhiteUqFkRefCB>)op; }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteUqFkRefCB> downcast(UpdateOption<? extends ConditionBean> op)
    { return (UpdateOption<WhiteUqFkRefCB>)op; }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteUqFkRefCB> downcast(DeleteOption<? extends ConditionBean> op)
    { return (DeleteOption<WhiteUqFkRefCB>)op; }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteUqFkRef, WhiteUqFkRefCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp)
    { return (QueryInsertSetupper<WhiteUqFkRef, WhiteUqFkRefCB>)sp; }
}
