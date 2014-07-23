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
 * The behavior of WHITE_STILETTO_ALIAS as TABLE. <br />
 * <pre>
 * [primary key]
 *     STILETTO_ALIAS_ID
 *
 * [column]
 *     STILETTO_ALIAS_ID, FOO, FOO_1, FOO2, FOO_3, FOO4
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
 *     white_stiletto_alias_ref
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whiteStilettoAliasRefList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteStilettoAliasBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_stiletto_alias"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public DBMeta getDBMeta() { return WhiteStilettoAliasDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteStilettoAliasDbm getMyDBMeta() { return WhiteStilettoAliasDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhiteStilettoAlias newEntity() { return new WhiteStilettoAlias(); }

    /** {@inheritDoc} */
    public WhiteStilettoAliasCB newConditionBean() { return new WhiteStilettoAliasCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteStilettoAlias newMyEntity() { return new WhiteStilettoAlias(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteStilettoAliasCB newMyConditionBean() { return new WhiteStilettoAliasCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteStilettoAliasCB cb = new WhiteStilettoAliasCB();
     * cb.query().setFoo...(value);
     * int count = whiteStilettoAliasBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteStilettoAlias. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteStilettoAliasCB cb) {
        return facadeSelectCount(cb);
    }

    protected int facadeSelectCount(WhiteStilettoAliasCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteStilettoAliasCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteStilettoAliasCB cb) { // called by selectPage(cb)
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
     * WhiteStilettoAliasCB cb = new WhiteStilettoAliasCB();
     * cb.query().setFoo...(value);
     * WhiteStilettoAlias whiteStilettoAlias = whiteStilettoAliasBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (whiteStilettoAlias != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = whiteStilettoAlias.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteStilettoAlias. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteStilettoAlias selectEntity(WhiteStilettoAliasCB cb) {
        return facadeSelectEntity(cb);
    }

    protected WhiteStilettoAlias facadeSelectEntity(WhiteStilettoAliasCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteStilettoAlias> ENTITY doSelectEntity(WhiteStilettoAliasCB cb, Class<ENTITY> tp) {
        return helpSelectEntityInternally(cb, tp);
    }

    protected <ENTITY extends WhiteStilettoAlias> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteStilettoAliasCB cb, Class<ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * WhiteStilettoAliasCB cb = new WhiteStilettoAliasCB();
     * cb.query().setFoo...(value);
     * WhiteStilettoAlias whiteStilettoAlias = whiteStilettoAliasBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteStilettoAlias.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteStilettoAlias. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteStilettoAlias selectEntityWithDeletedCheck(WhiteStilettoAliasCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    protected WhiteStilettoAlias facadeSelectEntityWithDeletedCheck(WhiteStilettoAliasCB cb) {
        return doSelectEntityWithDeletedCheck(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteStilettoAlias> ENTITY doSelectEntityWithDeletedCheck(WhiteStilettoAliasCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp);
    }

    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) { return facadeSelectEntityWithDeletedCheck(downcast(cb)); }

    /**
     * Select the entity by the primary-key value.
     * @param stilettoAliasId : PK, NotNull, INT(10). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteStilettoAlias selectByPKValue(Integer stilettoAliasId) {
        return facadeSelectByPKValue(stilettoAliasId);
    }

    protected WhiteStilettoAlias facadeSelectByPKValue(Integer stilettoAliasId) {
        return doSelectByPK(stilettoAliasId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteStilettoAlias> ENTITY doSelectByPK(Integer stilettoAliasId, Class<ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(stilettoAliasId), tp);
    }

    protected <ENTITY extends WhiteStilettoAlias> OptionalEntity<ENTITY> doSelectOptionalByPK(Integer stilettoAliasId, Class<ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(stilettoAliasId, tp), stilettoAliasId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param stilettoAliasId : PK, NotNull, INT(10). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteStilettoAlias selectByPKValueWithDeletedCheck(Integer stilettoAliasId) {
        return doSelectByPKWithDeletedCheck(stilettoAliasId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteStilettoAlias> ENTITY doSelectByPKWithDeletedCheck(Integer stilettoAliasId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(stilettoAliasId), tp);
    }

    protected WhiteStilettoAliasCB xprepareCBAsPK(Integer stilettoAliasId) {
        assertObjectNotNull("stilettoAliasId", stilettoAliasId);
        return newConditionBean().acceptPK(stilettoAliasId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteStilettoAliasCB cb = new WhiteStilettoAliasCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteStilettoAlias&gt; whiteStilettoAliasList = whiteStilettoAliasBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteStilettoAlias whiteStilettoAlias : whiteStilettoAliasList) {
     *     ... = whiteStilettoAlias.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteStilettoAlias. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteStilettoAlias> selectList(WhiteStilettoAliasCB cb) {
        return facadeSelectList(cb);
    }

    protected ListResultBean<WhiteStilettoAlias> facadeSelectList(WhiteStilettoAliasCB cb) {
        return doSelectList(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteStilettoAlias> ListResultBean<ENTITY> doSelectList(WhiteStilettoAliasCB cb, Class<ENTITY> tp) {
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
     * WhiteStilettoAliasCB cb = new WhiteStilettoAliasCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteStilettoAlias&gt; page = whiteStilettoAliasBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteStilettoAlias whiteStilettoAlias : page) {
     *     ... = whiteStilettoAlias.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteStilettoAlias. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteStilettoAlias> selectPage(WhiteStilettoAliasCB cb) {
        return facadeSelectPage(cb);
    }

    protected PagingResultBean<WhiteStilettoAlias> facadeSelectPage(WhiteStilettoAliasCB cb) {
        return doSelectPage(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteStilettoAlias> PagingResultBean<ENTITY> doSelectPage(WhiteStilettoAliasCB cb, Class<ENTITY> tp) {
        return helpSelectPageInternally(cb, tp);
    }

    protected PagingResultBean<? extends Entity> doReadPage(ConditionBean cb) { return facadeSelectPage(downcast(cb)); }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteStilettoAliasCB cb = new WhiteStilettoAliasCB();
     * cb.query().setFoo...(value);
     * whiteStilettoAliasBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteStilettoAlias&gt;() {
     *     public void handle(WhiteStilettoAlias entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteStilettoAlias. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteStilettoAlias. (NotNull)
     */
    public void selectCursor(WhiteStilettoAliasCB cb, EntityRowHandler<WhiteStilettoAlias> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    protected void facadeSelectCursor(WhiteStilettoAliasCB cb, EntityRowHandler<WhiteStilettoAlias> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteStilettoAlias> void doSelectCursor(WhiteStilettoAliasCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
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
     * whiteStilettoAliasBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteStilettoAliasCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhiteStilettoAliasCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    protected <RESULT> HpSLSFunction<WhiteStilettoAliasCB, RESULT> facadeScalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newConditionBean());
    }

    protected <RESULT, CB extends WhiteStilettoAliasCB> HpSLSFunction<CB, RESULT> doScalarSelect(final Class<RESULT> tp, final CB cb) {
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
     * @param whiteStilettoAliasList The entity list of whiteStilettoAlias. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhiteStilettoAlias> whiteStilettoAliasList, ReferrerLoaderHandler<LoaderOfWhiteStilettoAlias> handler) {
        xassLRArg(whiteStilettoAliasList, handler);
        handler.handle(new LoaderOfWhiteStilettoAlias().ready(whiteStilettoAliasList, _behaviorSelector));
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
     * @param whiteStilettoAlias The entity of whiteStilettoAlias. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhiteStilettoAlias whiteStilettoAlias, ReferrerLoaderHandler<LoaderOfWhiteStilettoAlias> handler) {
        xassLRArg(whiteStilettoAlias, handler);
        handler.handle(new LoaderOfWhiteStilettoAlias().ready(xnewLRAryLs(whiteStilettoAlias), _behaviorSelector));
    }

    /**
     * Load referrer of whiteStilettoAliasRefList by the set-upper of referrer. <br />
     * white_stiletto_alias_ref by STILETTO_ALIAS_ID, named 'whiteStilettoAliasRefList'.
     * <pre>
     * whiteStilettoAliasBhv.<span style="color: #DD4747">loadWhiteStilettoAliasRefList</span>(whiteStilettoAliasList, new ConditionBeanSetupper&lt;WhiteStilettoAliasRefCB&gt;() {
     *     public void setup(WhiteStilettoAliasRefCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (WhiteStilettoAlias whiteStilettoAlias : whiteStilettoAliasList) {
     *     ... = whiteStilettoAlias.<span style="color: #DD4747">getWhiteStilettoAliasRefList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStilettoAliasId_InScope(pkList);
     * cb.query().addOrderBy_StilettoAliasId_Asc();
     * </pre>
     * @param whiteStilettoAliasList The entity list of whiteStilettoAlias. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteStilettoAliasRef> loadWhiteStilettoAliasRefList(List<WhiteStilettoAlias> whiteStilettoAliasList, ConditionBeanSetupper<WhiteStilettoAliasRefCB> setupper) {
        xassLRArg(whiteStilettoAliasList, setupper);
        return doLoadWhiteStilettoAliasRefList(whiteStilettoAliasList, new LoadReferrerOption<WhiteStilettoAliasRefCB, WhiteStilettoAliasRef>().xinit(setupper));
    }

    /**
     * Load referrer of whiteStilettoAliasRefList by the set-upper of referrer. <br />
     * white_stiletto_alias_ref by STILETTO_ALIAS_ID, named 'whiteStilettoAliasRefList'.
     * <pre>
     * whiteStilettoAliasBhv.<span style="color: #DD4747">loadWhiteStilettoAliasRefList</span>(whiteStilettoAliasList, new ConditionBeanSetupper&lt;WhiteStilettoAliasRefCB&gt;() {
     *     public void setup(WhiteStilettoAliasRefCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = whiteStilettoAlias.<span style="color: #DD4747">getWhiteStilettoAliasRefList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStilettoAliasId_InScope(pkList);
     * cb.query().addOrderBy_StilettoAliasId_Asc();
     * </pre>
     * @param whiteStilettoAlias The entity of whiteStilettoAlias. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteStilettoAliasRef> loadWhiteStilettoAliasRefList(WhiteStilettoAlias whiteStilettoAlias, ConditionBeanSetupper<WhiteStilettoAliasRefCB> setupper) {
        xassLRArg(whiteStilettoAlias, setupper);
        return doLoadWhiteStilettoAliasRefList(xnewLRLs(whiteStilettoAlias), new LoadReferrerOption<WhiteStilettoAliasRefCB, WhiteStilettoAliasRef>().xinit(setupper));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param whiteStilettoAlias The entity of whiteStilettoAlias. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteStilettoAliasRef> loadWhiteStilettoAliasRefList(WhiteStilettoAlias whiteStilettoAlias, LoadReferrerOption<WhiteStilettoAliasRefCB, WhiteStilettoAliasRef> loadReferrerOption) {
        xassLRArg(whiteStilettoAlias, loadReferrerOption);
        return loadWhiteStilettoAliasRefList(xnewLRLs(whiteStilettoAlias), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean setupper.} #beforejava8
     * @param whiteStilettoAliasList The entity list of whiteStilettoAlias. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WhiteStilettoAliasRef> loadWhiteStilettoAliasRefList(List<WhiteStilettoAlias> whiteStilettoAliasList, LoadReferrerOption<WhiteStilettoAliasRefCB, WhiteStilettoAliasRef> loadReferrerOption) {
        xassLRArg(whiteStilettoAliasList, loadReferrerOption);
        if (whiteStilettoAliasList.isEmpty()) { return (NestedReferrerListGateway<WhiteStilettoAliasRef>)EMPTY_NREF_LGWAY; }
        return doLoadWhiteStilettoAliasRefList(whiteStilettoAliasList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WhiteStilettoAliasRef> doLoadWhiteStilettoAliasRefList(List<WhiteStilettoAlias> whiteStilettoAliasList, LoadReferrerOption<WhiteStilettoAliasRefCB, WhiteStilettoAliasRef> option) {
        return helpLoadReferrerInternally(whiteStilettoAliasList, option, "whiteStilettoAliasRefList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key stilettoAliasId.
     * @param whiteStilettoAliasList The list of whiteStilettoAlias. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractStilettoAliasIdList(List<WhiteStilettoAlias> whiteStilettoAliasList)
    { return helpExtractListInternally(whiteStilettoAliasList, "stilettoAliasId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteStilettoAlias whiteStilettoAlias = new WhiteStilettoAlias();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteStilettoAlias.setFoo...(value);
     * whiteStilettoAlias.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteStilettoAlias.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteStilettoAlias.set...;</span>
     * whiteStilettoAliasBhv.<span style="color: #DD4747">insert</span>(whiteStilettoAlias);
     * ... = whiteStilettoAlias.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteStilettoAlias The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteStilettoAlias whiteStilettoAlias) {
        doInsert(whiteStilettoAlias, null);
    }

    protected void doInsert(WhiteStilettoAlias et, InsertOption<WhiteStilettoAliasCB> op) {
        assertObjectNotNull("whiteStilettoAlias", et); prepareInsertOption(op); delegateInsert(et, op);
    }

    protected void prepareInsertOption(InsertOption<WhiteStilettoAliasCB> op) {
        if (op == null) { return; } assertInsertOptionStatus(op);
        if (op.hasSpecifiedInsertColumn()) { op.resolveInsertColumnSpecification(createCBForSpecifiedUpdate()); }
    }

    protected void doCreate(Entity et, InsertOption<? extends ConditionBean> op) { doInsert(downcast(et), downcast(op)); }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteStilettoAlias whiteStilettoAlias = new WhiteStilettoAlias();
     * whiteStilettoAlias.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteStilettoAlias.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteStilettoAlias.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteStilettoAlias.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteStilettoAlias.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteStilettoAliasBhv.<span style="color: #DD4747">update</span>(whiteStilettoAlias);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteStilettoAlias The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhiteStilettoAlias whiteStilettoAlias) {
        doUpdate(whiteStilettoAlias, null);
    }

    protected void doUpdate(WhiteStilettoAlias et, UpdateOption<WhiteStilettoAliasCB> op) {
        assertObjectNotNull("whiteStilettoAlias", et); prepareUpdateOption(op); helpUpdateInternally(et, op);
    }

    protected void prepareUpdateOption(UpdateOption<WhiteStilettoAliasCB> op) {
        if (op == null) { return; } assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) { op.resolveSelfSpecification(createCBForVaryingUpdate()); }
        if (op.hasSpecifiedUpdateColumn()) { op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate()); }
    }

    protected WhiteStilettoAliasCB createCBForVaryingUpdate()
    { WhiteStilettoAliasCB cb = newConditionBean(); cb.xsetupForVaryingUpdate(); return cb; }

    protected WhiteStilettoAliasCB createCBForSpecifiedUpdate()
    { WhiteStilettoAliasCB cb = newConditionBean(); cb.xsetupForSpecifiedUpdate(); return cb; }

    protected void doModify(Entity et, UpdateOption<? extends ConditionBean> op) { doUpdate(downcast(et), downcast(op)); }

    protected void doModifyNonstrict(Entity et, UpdateOption<? extends ConditionBean> op)
    { doModify(et, op); }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param whiteStilettoAlias The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteStilettoAlias whiteStilettoAlias) {
        doInsertOrUpdate(whiteStilettoAlias, null, null);
    }

    protected void doInsertOrUpdate(WhiteStilettoAlias et, InsertOption<WhiteStilettoAliasCB> iop, UpdateOption<WhiteStilettoAliasCB> uop) {
        assertObjectNotNull("whiteStilettoAlias", et); helpInsertOrUpdateInternally(et, iop, uop);
    }

    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop)
    { doInsertOrUpdate(downcast(et), downcast(iop), downcast(uop)); }

    protected void doCreateOrModifyNonstrict(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop)
    { doCreateOrModify(et, iop, uop); }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteStilettoAlias whiteStilettoAlias = new WhiteStilettoAlias();
     * whiteStilettoAlias.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteStilettoAlias.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteStilettoAliasBhv.<span style="color: #DD4747">delete</span>(whiteStilettoAlias);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteStilettoAlias The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteStilettoAlias whiteStilettoAlias) {
        doDelete(whiteStilettoAlias, null);
    }

    protected void doDelete(WhiteStilettoAlias et, final DeleteOption<WhiteStilettoAliasCB> op) {
        assertObjectNotNull("whiteStilettoAlias", et); prepareDeleteOption(op); helpDeleteInternally(et, op);
    }

    protected void prepareDeleteOption(DeleteOption<WhiteStilettoAliasCB> op) { if (op != null) { assertDeleteOptionStatus(op); } }

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
     *     WhiteStilettoAlias whiteStilettoAlias = new WhiteStilettoAlias();
     *     whiteStilettoAlias.setFooName("foo");
     *     if (...) {
     *         whiteStilettoAlias.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteStilettoAliasList.add(whiteStilettoAlias);
     * }
     * whiteStilettoAliasBhv.<span style="color: #DD4747">batchInsert</span>(whiteStilettoAliasList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteStilettoAliasList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteStilettoAlias> whiteStilettoAliasList) {
        return doBatchInsert(whiteStilettoAliasList, null);
    }

    protected int[] doBatchInsert(List<WhiteStilettoAlias> ls, InsertOption<WhiteStilettoAliasCB> op) {
        assertObjectNotNull("whiteStilettoAliasList", ls);
        InsertOption<WhiteStilettoAliasCB> rlop; if (op != null) { rlop = op; } else { rlop = createPlainInsertOption(); }
        prepareBatchInsertOption(ls, rlop); // required
        return delegateBatchInsert(ls, rlop);
    }

    protected void prepareBatchInsertOption(List<WhiteStilettoAlias> ls, InsertOption<WhiteStilettoAliasCB> op) {
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
     *     WhiteStilettoAlias whiteStilettoAlias = new WhiteStilettoAlias();
     *     whiteStilettoAlias.setFooName("foo");
     *     if (...) {
     *         whiteStilettoAlias.setFooPrice(123);
     *     } else {
     *         whiteStilettoAlias.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteStilettoAlias.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteStilettoAliasList.add(whiteStilettoAlias);
     * }
     * whiteStilettoAliasBhv.<span style="color: #DD4747">batchUpdate</span>(whiteStilettoAliasList);
     * </pre>
     * @param whiteStilettoAliasList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteStilettoAlias> whiteStilettoAliasList) {
        return doBatchUpdate(whiteStilettoAliasList, null);
    }

    protected int[] doBatchUpdate(List<WhiteStilettoAlias> ls, UpdateOption<WhiteStilettoAliasCB> op) {
        assertObjectNotNull("whiteStilettoAliasList", ls);
        UpdateOption<WhiteStilettoAliasCB> rlop; if (op != null) { rlop = op; } else { rlop = createPlainUpdateOption(); }
        prepareBatchUpdateOption(ls, rlop); // required
        return delegateBatchUpdate(ls, rlop);
    }

    protected void prepareBatchUpdateOption(List<WhiteStilettoAlias> ls, UpdateOption<WhiteStilettoAliasCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(ls);
        prepareUpdateOption(op);
    }

    protected int[] doLumpModify(List<Entity> ls, UpdateOption<? extends ConditionBean> op) { return doBatchUpdate(downcast(ls), downcast(op)); }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * whiteStilettoAliasBhv.<span style="color: #DD4747">batchUpdate</span>(whiteStilettoAliasList, new SpecifyQuery<WhiteStilettoAliasCB>() {
     *     public void specify(WhiteStilettoAliasCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteStilettoAliasBhv.<span style="color: #DD4747">batchUpdate</span>(whiteStilettoAliasList, new SpecifyQuery<WhiteStilettoAliasCB>() {
     *     public void specify(WhiteStilettoAliasCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteStilettoAliasList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteStilettoAlias> whiteStilettoAliasList, SpecifyQuery<WhiteStilettoAliasCB> updateColumnSpec) {
        return doBatchUpdate(whiteStilettoAliasList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op)
    { return doLumpModify(ls, op); }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteStilettoAliasList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteStilettoAlias> whiteStilettoAliasList) {
        return doBatchDelete(whiteStilettoAliasList, null);
    }

    protected int[] doBatchDelete(List<WhiteStilettoAlias> ls, DeleteOption<WhiteStilettoAliasCB> op) {
        assertObjectNotNull("whiteStilettoAliasList", ls);
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
     * whiteStilettoAliasBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteStilettoAlias, WhiteStilettoAliasCB&gt;() {
     *     public ConditionBean setup(whiteStilettoAlias entity, WhiteStilettoAliasCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteStilettoAlias, WhiteStilettoAliasCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteStilettoAlias, WhiteStilettoAliasCB> sp, InsertOption<WhiteStilettoAliasCB> op) {
        assertObjectNotNull("setupper", sp); prepareInsertOption(op);
        WhiteStilettoAlias et = newEntity(); WhiteStilettoAliasCB cb = createCBForQueryInsert();
        return delegateQueryInsert(et, cb, sp.setup(et, cb), op);
    }

    protected WhiteStilettoAliasCB createCBForQueryInsert()
    { WhiteStilettoAliasCB cb = newConditionBean(); cb.xsetupForQueryInsert(); return cb; }

    protected int doRangeCreate(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> setupper, InsertOption<? extends ConditionBean> op)
    { return doQueryInsert(downcast(setupper), downcast(op)); }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteStilettoAlias whiteStilettoAlias = new WhiteStilettoAlias();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteStilettoAlias.setPK...(value);</span>
     * whiteStilettoAlias.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteStilettoAlias.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteStilettoAlias.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteStilettoAlias.setVersionNo(value);</span>
     * WhiteStilettoAliasCB cb = new WhiteStilettoAliasCB();
     * cb.query().setFoo...(value);
     * whiteStilettoAliasBhv.<span style="color: #DD4747">queryUpdate</span>(whiteStilettoAlias, cb);
     * </pre>
     * @param whiteStilettoAlias The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteStilettoAlias. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteStilettoAlias whiteStilettoAlias, WhiteStilettoAliasCB cb) {
        return doQueryUpdate(whiteStilettoAlias, cb, null);
    }

    protected int doQueryUpdate(WhiteStilettoAlias et, WhiteStilettoAliasCB cb, UpdateOption<WhiteStilettoAliasCB> op) {
        assertObjectNotNull("whiteStilettoAlias", et); assertCBStateValid(cb); prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(et, cb, op) : 0;
    }

    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op)
    { return doQueryUpdate(downcast(et), downcast(cb), downcast(op)); }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteStilettoAliasCB cb = new WhiteStilettoAliasCB();
     * cb.query().setFoo...(value);
     * whiteStilettoAliasBhv.<span style="color: #DD4747">queryDelete</span>(whiteStilettoAlias, cb);
     * </pre>
     * @param cb The condition-bean of WhiteStilettoAlias. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteStilettoAliasCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteStilettoAliasCB cb, DeleteOption<WhiteStilettoAliasCB> op) {
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
     * WhiteStilettoAlias whiteStilettoAlias = new WhiteStilettoAlias();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteStilettoAlias.setFoo...(value);
     * whiteStilettoAlias.setBar...(value);
     * InsertOption<WhiteStilettoAliasCB> option = new InsertOption<WhiteStilettoAliasCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteStilettoAliasBhv.<span style="color: #DD4747">varyingInsert</span>(whiteStilettoAlias, option);
     * ... = whiteStilettoAlias.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteStilettoAlias The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteStilettoAlias whiteStilettoAlias, InsertOption<WhiteStilettoAliasCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteStilettoAlias, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteStilettoAlias whiteStilettoAlias = new WhiteStilettoAlias();
     * whiteStilettoAlias.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteStilettoAlias.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteStilettoAlias.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteStilettoAliasCB&gt; option = new UpdateOption&lt;WhiteStilettoAliasCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteStilettoAliasCB&gt;() {
     *         public void specify(WhiteStilettoAliasCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteStilettoAliasBhv.<span style="color: #DD4747">varyingUpdate</span>(whiteStilettoAlias, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteStilettoAlias The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteStilettoAlias whiteStilettoAlias, UpdateOption<WhiteStilettoAliasCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteStilettoAlias, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteStilettoAlias The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteStilettoAlias whiteStilettoAlias, InsertOption<WhiteStilettoAliasCB> insertOption, UpdateOption<WhiteStilettoAliasCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdate(whiteStilettoAlias, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteStilettoAlias The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteStilettoAlias whiteStilettoAlias, DeleteOption<WhiteStilettoAliasCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteStilettoAlias, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteStilettoAliasList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteStilettoAlias> whiteStilettoAliasList, InsertOption<WhiteStilettoAliasCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteStilettoAliasList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteStilettoAliasList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteStilettoAlias> whiteStilettoAliasList, UpdateOption<WhiteStilettoAliasCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteStilettoAliasList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteStilettoAliasList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteStilettoAlias> whiteStilettoAliasList, DeleteOption<WhiteStilettoAliasCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteStilettoAliasList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteStilettoAlias, WhiteStilettoAliasCB> setupper, InsertOption<WhiteStilettoAliasCB> option) {
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
     * WhiteStilettoAlias whiteStilettoAlias = new WhiteStilettoAlias();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteStilettoAlias.setPK...(value);</span>
     * whiteStilettoAlias.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteStilettoAlias.setVersionNo(value);</span>
     * WhiteStilettoAliasCB cb = new WhiteStilettoAliasCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteStilettoAliasCB&gt; option = new UpdateOption&lt;WhiteStilettoAliasCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteStilettoAliasCB&gt;() {
     *     public void specify(WhiteStilettoAliasCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteStilettoAliasBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteStilettoAlias, cb, option);
     * </pre>
     * @param whiteStilettoAlias The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteStilettoAlias. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteStilettoAlias whiteStilettoAlias, WhiteStilettoAliasCB cb, UpdateOption<WhiteStilettoAliasCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteStilettoAlias, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteStilettoAlias. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteStilettoAliasCB cb, DeleteOption<WhiteStilettoAliasCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteStilettoAliasBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    protected Class<WhiteStilettoAlias> typeOfSelectedEntity() { return WhiteStilettoAlias.class; }
    protected WhiteStilettoAlias downcast(Entity et) { return helpEntityDowncastInternally(et, WhiteStilettoAlias.class); }
    protected WhiteStilettoAliasCB downcast(ConditionBean cb) { return helpConditionBeanDowncastInternally(cb, WhiteStilettoAliasCB.class); }
    @SuppressWarnings("unchecked")
    protected List<WhiteStilettoAlias> downcast(List<? extends Entity> ls) { return (List<WhiteStilettoAlias>)ls; }
    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteStilettoAliasCB> downcast(InsertOption<? extends ConditionBean> op) { return (InsertOption<WhiteStilettoAliasCB>)op; }
    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteStilettoAliasCB> downcast(UpdateOption<? extends ConditionBean> op) { return (UpdateOption<WhiteStilettoAliasCB>)op; }
    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteStilettoAliasCB> downcast(DeleteOption<? extends ConditionBean> op) { return (DeleteOption<WhiteStilettoAliasCB>)op; }
    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteStilettoAlias, WhiteStilettoAliasCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp)
    { return (QueryInsertSetupper<WhiteStilettoAlias, WhiteStilettoAliasCB>)sp; }
}
