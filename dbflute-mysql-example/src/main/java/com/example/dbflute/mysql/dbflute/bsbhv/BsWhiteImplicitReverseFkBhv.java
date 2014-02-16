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
import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.outsidesql.executor.*;
import com.example.dbflute.mysql.dbflute.exbhv.*;
import com.example.dbflute.mysql.dbflute.exentity.*;
import com.example.dbflute.mysql.dbflute.bsentity.dbmeta.*;
import com.example.dbflute.mysql.dbflute.cbean.*;

/**
 * The behavior of WHITE_IMPLICIT_REVERSE_FK as TABLE. <br />
 * <pre>
 * [primary key]
 *     WHITE_IMPLICIT_REVERSE_FK_ID
 *
 * [column]
 *     WHITE_IMPLICIT_REVERSE_FK_ID, WHITE_IMPLICIT_REVERSE_FK_NAME
 *
 * [sequence]
 *     
 *
 * [identity]
 *     WHITE_IMPLICIT_REVERSE_FK_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     WHITE_IMPLICIT_REVERSE_FK_REF(WithImplicitReverseFK), WHITE_IMPLICIT_REVERSE_FK_SUPPRESS(SuppressImplicitReverseFK)
 *
 * [referrer table]
 *     white_implicit_reverse_fk_ref
 *
 * [foreign property]
 *     whiteImplicitReverseFkRefWithImplicitReverseFK, whiteImplicitReverseFkSuppressSuppressImplicitReverseFK
 *
 * [referrer property]
 *     whiteImplicitReverseFkRefList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteImplicitReverseFkBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_implicit_reverse_fk"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return WhiteImplicitReverseFkDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteImplicitReverseFkDbm getMyDBMeta() { return WhiteImplicitReverseFkDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteImplicitReverseFk newMyEntity() { return new WhiteImplicitReverseFk(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteImplicitReverseFkCB newMyConditionBean() { return new WhiteImplicitReverseFkCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteImplicitReverseFkCB cb = new WhiteImplicitReverseFkCB();
     * cb.query().setFoo...(value);
     * int count = whiteImplicitReverseFkBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteImplicitReverseFk. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteImplicitReverseFkCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteImplicitReverseFkCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteImplicitReverseFkCB cb) { // called by selectPage(cb)
        assertCBStateValid(cb);
        return delegateSelectCountPlainly(cb);
    }

    @Override
    protected int doReadCount(ConditionBean cb) {
        return selectCount(downcast(cb));
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * <pre>
     * WhiteImplicitReverseFkCB cb = new WhiteImplicitReverseFkCB();
     * cb.query().setFoo...(value);
     * WhiteImplicitReverseFk whiteImplicitReverseFk = whiteImplicitReverseFkBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (whiteImplicitReverseFk != null) {
     *     ... = whiteImplicitReverseFk.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteImplicitReverseFk. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteImplicitReverseFk selectEntity(WhiteImplicitReverseFkCB cb) {
        return doSelectEntity(cb, WhiteImplicitReverseFk.class);
    }

    protected <ENTITY extends WhiteImplicitReverseFk> ENTITY doSelectEntity(final WhiteImplicitReverseFkCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, WhiteImplicitReverseFkCB>() {
            public List<ENTITY> callbackSelectList(WhiteImplicitReverseFkCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * WhiteImplicitReverseFkCB cb = new WhiteImplicitReverseFkCB();
     * cb.query().setFoo...(value);
     * WhiteImplicitReverseFk whiteImplicitReverseFk = whiteImplicitReverseFkBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteImplicitReverseFk.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteImplicitReverseFk. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteImplicitReverseFk selectEntityWithDeletedCheck(WhiteImplicitReverseFkCB cb) {
        return doSelectEntityWithDeletedCheck(cb, WhiteImplicitReverseFk.class);
    }

    protected <ENTITY extends WhiteImplicitReverseFk> ENTITY doSelectEntityWithDeletedCheck(final WhiteImplicitReverseFkCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteImplicitReverseFkCB>() {
            public List<ENTITY> callbackSelectList(WhiteImplicitReverseFkCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param whiteImplicitReverseFkId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteImplicitReverseFk selectByPKValue(Integer whiteImplicitReverseFkId) {
        return doSelectByPKValue(whiteImplicitReverseFkId, WhiteImplicitReverseFk.class);
    }

    protected <ENTITY extends WhiteImplicitReverseFk> ENTITY doSelectByPKValue(Integer whiteImplicitReverseFkId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(whiteImplicitReverseFkId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param whiteImplicitReverseFkId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteImplicitReverseFk selectByPKValueWithDeletedCheck(Integer whiteImplicitReverseFkId) {
        return doSelectByPKValueWithDeletedCheck(whiteImplicitReverseFkId, WhiteImplicitReverseFk.class);
    }

    protected <ENTITY extends WhiteImplicitReverseFk> ENTITY doSelectByPKValueWithDeletedCheck(Integer whiteImplicitReverseFkId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(whiteImplicitReverseFkId), entityType);
    }

    private WhiteImplicitReverseFkCB buildPKCB(Integer whiteImplicitReverseFkId) {
        assertObjectNotNull("whiteImplicitReverseFkId", whiteImplicitReverseFkId);
        WhiteImplicitReverseFkCB cb = newMyConditionBean();
        cb.query().setWhiteImplicitReverseFkId_Equal(whiteImplicitReverseFkId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteImplicitReverseFkCB cb = new WhiteImplicitReverseFkCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteImplicitReverseFk&gt; whiteImplicitReverseFkList = whiteImplicitReverseFkBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (WhiteImplicitReverseFk whiteImplicitReverseFk : whiteImplicitReverseFkList) {
     *     ... = whiteImplicitReverseFk.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteImplicitReverseFk. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteImplicitReverseFk> selectList(WhiteImplicitReverseFkCB cb) {
        return doSelectList(cb, WhiteImplicitReverseFk.class);
    }

    protected <ENTITY extends WhiteImplicitReverseFk> ListResultBean<ENTITY> doSelectList(WhiteImplicitReverseFkCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, WhiteImplicitReverseFkCB>() {
            public List<ENTITY> callbackSelectList(WhiteImplicitReverseFkCB cb, Class<ENTITY> tp) { return delegateSelectList(cb, tp); } });
    }

    @Override
    protected ListResultBean<? extends Entity> doReadList(ConditionBean cb) {
        return selectList(downcast(cb));
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * WhiteImplicitReverseFkCB cb = new WhiteImplicitReverseFkCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteImplicitReverseFk&gt; page = whiteImplicitReverseFkBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteImplicitReverseFk whiteImplicitReverseFk : page) {
     *     ... = whiteImplicitReverseFk.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteImplicitReverseFk. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteImplicitReverseFk> selectPage(WhiteImplicitReverseFkCB cb) {
        return doSelectPage(cb, WhiteImplicitReverseFk.class);
    }

    protected <ENTITY extends WhiteImplicitReverseFk> PagingResultBean<ENTITY> doSelectPage(WhiteImplicitReverseFkCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, WhiteImplicitReverseFkCB>() {
            public int callbackSelectCount(WhiteImplicitReverseFkCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteImplicitReverseFkCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    @Override
    protected PagingResultBean<? extends Entity> doReadPage(ConditionBean cb) {
        return selectPage(downcast(cb));
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteImplicitReverseFkCB cb = new WhiteImplicitReverseFkCB();
     * cb.query().setFoo...(value);
     * whiteImplicitReverseFkBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteImplicitReverseFk&gt;() {
     *     public void handle(WhiteImplicitReverseFk entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteImplicitReverseFk. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteImplicitReverseFk. (NotNull)
     */
    public void selectCursor(WhiteImplicitReverseFkCB cb, EntityRowHandler<WhiteImplicitReverseFk> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, WhiteImplicitReverseFk.class);
    }

    protected <ENTITY extends WhiteImplicitReverseFk> void doSelectCursor(WhiteImplicitReverseFkCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, WhiteImplicitReverseFkCB>() {
            public void callbackSelectCursor(WhiteImplicitReverseFkCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(WhiteImplicitReverseFkCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteImplicitReverseFkBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteImplicitReverseFkCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<WhiteImplicitReverseFkCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends WhiteImplicitReverseFkCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends WhiteImplicitReverseFkCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
        return new SLFunction<CB, RESULT>(cb, tp);
    }

    protected <RESULT> SLFunction<? extends ConditionBean, RESULT> doReadScalar(Class<RESULT> tp) {
        return doScalarSelect(tp, newMyConditionBean());
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
     * {Refer to overload method that has an argument of the list of entity.}
     * @param whiteImplicitReverseFk The entity of whiteImplicitReverseFk. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadWhiteImplicitReverseFkRefList(WhiteImplicitReverseFk whiteImplicitReverseFk, ConditionBeanSetupper<WhiteImplicitReverseFkRefCB> conditionBeanSetupper) {
        xassLRArg(whiteImplicitReverseFk, conditionBeanSetupper);
        loadWhiteImplicitReverseFkRefList(xnewLRLs(whiteImplicitReverseFk), conditionBeanSetupper);
    }
    /**
     * Load referrer of whiteImplicitReverseFkRefList with the set-upper for condition-bean of referrer. <br />
     * white_implicit_reverse_fk_ref by WHITE_IMPLICIT_REVERSE_FK_ID, named 'whiteImplicitReverseFkRefList'. <br />
     * This relation is auto-detected as implicit reverse FK.
     * <pre>
     * whiteImplicitReverseFkBhv.<span style="color: #FD4747">loadWhiteImplicitReverseFkRefList</span>(whiteImplicitReverseFkList, new ConditionBeanSetupper&lt;WhiteImplicitReverseFkRefCB&gt;() {
     *     public void setup(WhiteImplicitReverseFkRefCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (WhiteImplicitReverseFk whiteImplicitReverseFk : whiteImplicitReverseFkList) {
     *     ... = whiteImplicitReverseFk.<span style="color: #FD4747">getWhiteImplicitReverseFkRefList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setWhiteImplicitReverseFkId_InScope(pkList);
     * cb.query().addOrderBy_WhiteImplicitReverseFkId_Asc();
     * </pre>
     * @param whiteImplicitReverseFkList The entity list of whiteImplicitReverseFk. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadWhiteImplicitReverseFkRefList(List<WhiteImplicitReverseFk> whiteImplicitReverseFkList, ConditionBeanSetupper<WhiteImplicitReverseFkRefCB> conditionBeanSetupper) {
        xassLRArg(whiteImplicitReverseFkList, conditionBeanSetupper);
        loadWhiteImplicitReverseFkRefList(whiteImplicitReverseFkList, new LoadReferrerOption<WhiteImplicitReverseFkRefCB, WhiteImplicitReverseFkRef>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param whiteImplicitReverseFk The entity of whiteImplicitReverseFk. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadWhiteImplicitReverseFkRefList(WhiteImplicitReverseFk whiteImplicitReverseFk, LoadReferrerOption<WhiteImplicitReverseFkRefCB, WhiteImplicitReverseFkRef> loadReferrerOption) {
        xassLRArg(whiteImplicitReverseFk, loadReferrerOption);
        loadWhiteImplicitReverseFkRefList(xnewLRLs(whiteImplicitReverseFk), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param whiteImplicitReverseFkList The entity list of whiteImplicitReverseFk. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadWhiteImplicitReverseFkRefList(List<WhiteImplicitReverseFk> whiteImplicitReverseFkList, LoadReferrerOption<WhiteImplicitReverseFkRefCB, WhiteImplicitReverseFkRef> loadReferrerOption) {
        xassLRArg(whiteImplicitReverseFkList, loadReferrerOption);
        if (whiteImplicitReverseFkList.isEmpty()) { return; }
        final WhiteImplicitReverseFkRefBhv referrerBhv = xgetBSFLR().select(WhiteImplicitReverseFkRefBhv.class);
        helpLoadReferrerInternally(whiteImplicitReverseFkList, loadReferrerOption, new InternalLoadReferrerCallback<WhiteImplicitReverseFk, Integer, WhiteImplicitReverseFkRefCB, WhiteImplicitReverseFkRef>() {
            public Integer getPKVal(WhiteImplicitReverseFk et)
            { return et.getWhiteImplicitReverseFkId(); }
            public void setRfLs(WhiteImplicitReverseFk et, List<WhiteImplicitReverseFkRef> ls)
            { et.setWhiteImplicitReverseFkRefList(ls); }
            public WhiteImplicitReverseFkRefCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(WhiteImplicitReverseFkRefCB cb, List<Integer> ls)
            { cb.query().setWhiteImplicitReverseFkId_InScope(ls); }
            public void qyOdFKAsc(WhiteImplicitReverseFkRefCB cb) { cb.query().addOrderBy_WhiteImplicitReverseFkId_Asc(); }
            public void spFKCol(WhiteImplicitReverseFkRefCB cb) { cb.specify().columnWhiteImplicitReverseFkId(); }
            public List<WhiteImplicitReverseFkRef> selRfLs(WhiteImplicitReverseFkRefCB cb) { return referrerBhv.selectList(cb); }
            public Integer getFKVal(WhiteImplicitReverseFkRef re) { return re.getWhiteImplicitReverseFkId(); }
            public void setlcEt(WhiteImplicitReverseFkRef re, WhiteImplicitReverseFk le)
            { re.setWhiteImplicitReverseFk(le); }
            public String getRfPrNm() { return "whiteImplicitReverseFkRefList"; }
        });
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'WhiteImplicitReverseFkRef'.
     * @param whiteImplicitReverseFkList The list of whiteImplicitReverseFk. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteImplicitReverseFkRef> pulloutWhiteImplicitReverseFkRefWithImplicitReverseFK(List<WhiteImplicitReverseFk> whiteImplicitReverseFkList) {
        return helpPulloutInternally(whiteImplicitReverseFkList, new InternalPulloutCallback<WhiteImplicitReverseFk, WhiteImplicitReverseFkRef>() {
            public WhiteImplicitReverseFkRef getFr(WhiteImplicitReverseFk et) { return et.getWhiteImplicitReverseFkRefWithImplicitReverseFK(); }
            public boolean hasRf() { return false; }
            public void setRfLs(WhiteImplicitReverseFkRef et, List<WhiteImplicitReverseFk> ls)
            { throw new UnsupportedOperationException(); }
        });
    }
    /**
     * Pull out the list of foreign table 'WhiteImplicitReverseFkSuppress'.
     * @param whiteImplicitReverseFkList The list of whiteImplicitReverseFk. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteImplicitReverseFkSuppress> pulloutWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK(List<WhiteImplicitReverseFk> whiteImplicitReverseFkList) {
        return helpPulloutInternally(whiteImplicitReverseFkList, new InternalPulloutCallback<WhiteImplicitReverseFk, WhiteImplicitReverseFkSuppress>() {
            public WhiteImplicitReverseFkSuppress getFr(WhiteImplicitReverseFk et) { return et.getWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK(); }
            public boolean hasRf() { return false; }
            public void setRfLs(WhiteImplicitReverseFkSuppress et, List<WhiteImplicitReverseFk> ls)
            { throw new UnsupportedOperationException(); }
        });
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key whiteImplicitReverseFkId.
     * @param whiteImplicitReverseFkList The list of whiteImplicitReverseFk. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractWhiteImplicitReverseFkIdList(List<WhiteImplicitReverseFk> whiteImplicitReverseFkList) {
        return helpExtractListInternally(whiteImplicitReverseFkList, new InternalExtractCallback<WhiteImplicitReverseFk, Integer>() {
            public Integer getCV(WhiteImplicitReverseFk et) { return et.getWhiteImplicitReverseFkId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteImplicitReverseFk whiteImplicitReverseFk = new WhiteImplicitReverseFk();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteImplicitReverseFk.setFoo...(value);
     * whiteImplicitReverseFk.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteImplicitReverseFk.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteImplicitReverseFk.set...;</span>
     * whiteImplicitReverseFkBhv.<span style="color: #FD4747">insert</span>(whiteImplicitReverseFk);
     * ... = whiteImplicitReverseFk.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteImplicitReverseFk The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteImplicitReverseFk whiteImplicitReverseFk) {
        doInsert(whiteImplicitReverseFk, null);
    }

    protected void doInsert(WhiteImplicitReverseFk whiteImplicitReverseFk, InsertOption<WhiteImplicitReverseFkCB> op) {
        assertObjectNotNull("whiteImplicitReverseFk", whiteImplicitReverseFk);
        prepareInsertOption(op);
        delegateInsert(whiteImplicitReverseFk, op);
    }

    protected void prepareInsertOption(InsertOption<WhiteImplicitReverseFkCB> op) {
        if (op == null) { return; }
        assertInsertOptionStatus(op);
        if (op.hasSpecifiedInsertColumn()) {
            op.resolveInsertColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    @Override
    protected void doCreate(Entity et, InsertOption<? extends ConditionBean> op) {
        if (op == null) { insert(downcast(et)); }
        else { varyingInsert(downcast(et), downcast(op)); }
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteImplicitReverseFk whiteImplicitReverseFk = new WhiteImplicitReverseFk();
     * whiteImplicitReverseFk.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteImplicitReverseFk.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteImplicitReverseFk.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteImplicitReverseFk.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteImplicitReverseFk.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteImplicitReverseFkBhv.<span style="color: #FD4747">update</span>(whiteImplicitReverseFk);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteImplicitReverseFk The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final WhiteImplicitReverseFk whiteImplicitReverseFk) {
        doUpdate(whiteImplicitReverseFk, null);
    }

    protected void doUpdate(WhiteImplicitReverseFk whiteImplicitReverseFk, final UpdateOption<WhiteImplicitReverseFkCB> op) {
        assertObjectNotNull("whiteImplicitReverseFk", whiteImplicitReverseFk);
        prepareUpdateOption(op);
        helpUpdateInternally(whiteImplicitReverseFk, new InternalUpdateCallback<WhiteImplicitReverseFk>() {
            public int callbackDelegateUpdate(WhiteImplicitReverseFk et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhiteImplicitReverseFkCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected WhiteImplicitReverseFkCB createCBForVaryingUpdate() {
        WhiteImplicitReverseFkCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected WhiteImplicitReverseFkCB createCBForSpecifiedUpdate() {
        WhiteImplicitReverseFkCB cb = newMyConditionBean();
        cb.xsetupForSpecifiedUpdate();
        return cb;
    }

    @Override
    protected void doModify(Entity et, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { update(downcast(et)); }
        else { varyingUpdate(downcast(et), downcast(op)); }
    }

    @Override
    protected void doModifyNonstrict(Entity et, UpdateOption<? extends ConditionBean> op) {
        doModify(et, op);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #FD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param whiteImplicitReverseFk The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteImplicitReverseFk whiteImplicitReverseFk) {
        doInesrtOrUpdate(whiteImplicitReverseFk, null, null);
    }

    protected void doInesrtOrUpdate(WhiteImplicitReverseFk whiteImplicitReverseFk, final InsertOption<WhiteImplicitReverseFkCB> iop, final UpdateOption<WhiteImplicitReverseFkCB> uop) {
        helpInsertOrUpdateInternally(whiteImplicitReverseFk, new InternalInsertOrUpdateCallback<WhiteImplicitReverseFk, WhiteImplicitReverseFkCB>() {
            public void callbackInsert(WhiteImplicitReverseFk et) { doInsert(et, iop); }
            public void callbackUpdate(WhiteImplicitReverseFk et) { doUpdate(et, uop); }
            public WhiteImplicitReverseFkCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(WhiteImplicitReverseFkCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<WhiteImplicitReverseFkCB>();
            uop = uop != null ? uop : new UpdateOption<WhiteImplicitReverseFkCB>();
            varyingInsertOrUpdate(downcast(et), downcast(iop), downcast(uop));
        }
    }

    @Override
    protected void doCreateOrModifyNonstrict(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        doCreateOrModify(et, iop, uop);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteImplicitReverseFk whiteImplicitReverseFk = new WhiteImplicitReverseFk();
     * whiteImplicitReverseFk.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteImplicitReverseFk.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteImplicitReverseFkBhv.<span style="color: #FD4747">delete</span>(whiteImplicitReverseFk);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteImplicitReverseFk The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteImplicitReverseFk whiteImplicitReverseFk) {
        doDelete(whiteImplicitReverseFk, null);
    }

    protected void doDelete(WhiteImplicitReverseFk whiteImplicitReverseFk, final DeleteOption<WhiteImplicitReverseFkCB> op) {
        assertObjectNotNull("whiteImplicitReverseFk", whiteImplicitReverseFk);
        prepareDeleteOption(op);
        helpDeleteInternally(whiteImplicitReverseFk, new InternalDeleteCallback<WhiteImplicitReverseFk>() {
            public int callbackDelegateDelete(WhiteImplicitReverseFk et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhiteImplicitReverseFkCB> op) {
        if (op == null) { return; }
        assertDeleteOptionStatus(op);
    }

    @Override
    protected void doRemove(Entity et, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { delete(downcast(et)); }
        else { varyingDelete(downcast(et), downcast(op)); }
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
     * <p><span style="color: #FD4747; font-size: 120%">The columns of least common multiple are registered like this:</span></p>
     * <pre>
     * for (... : ...) {
     *     WhiteImplicitReverseFk whiteImplicitReverseFk = new WhiteImplicitReverseFk();
     *     whiteImplicitReverseFk.setFooName("foo");
     *     if (...) {
     *         whiteImplicitReverseFk.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteImplicitReverseFkList.add(whiteImplicitReverseFk);
     * }
     * whiteImplicitReverseFkBhv.<span style="color: #FD4747">batchInsert</span>(whiteImplicitReverseFkList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteImplicitReverseFkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteImplicitReverseFk> whiteImplicitReverseFkList) {
        InsertOption<WhiteImplicitReverseFkCB> op = createInsertUpdateOption();
        return doBatchInsert(whiteImplicitReverseFkList, op);
    }

    protected int[] doBatchInsert(List<WhiteImplicitReverseFk> whiteImplicitReverseFkList, InsertOption<WhiteImplicitReverseFkCB> op) {
        assertObjectNotNull("whiteImplicitReverseFkList", whiteImplicitReverseFkList);
        prepareBatchInsertOption(whiteImplicitReverseFkList, op);
        return delegateBatchInsert(whiteImplicitReverseFkList, op);
    }

    protected void prepareBatchInsertOption(List<WhiteImplicitReverseFk> whiteImplicitReverseFkList, InsertOption<WhiteImplicitReverseFkCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(whiteImplicitReverseFkList);
        prepareInsertOption(op);
    }

    @Override
    protected int[] doLumpCreate(List<Entity> ls, InsertOption<? extends ConditionBean> op) {
        if (op == null) { return batchInsert(downcast(ls)); }
        else { return varyingBatchInsert(downcast(ls), downcast(op)); }
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #FD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhiteImplicitReverseFk whiteImplicitReverseFk = new WhiteImplicitReverseFk();
     *     whiteImplicitReverseFk.setFooName("foo");
     *     if (...) {
     *         whiteImplicitReverseFk.setFooPrice(123);
     *     } else {
     *         whiteImplicitReverseFk.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteImplicitReverseFk.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteImplicitReverseFkList.add(whiteImplicitReverseFk);
     * }
     * whiteImplicitReverseFkBhv.<span style="color: #FD4747">batchUpdate</span>(whiteImplicitReverseFkList);
     * </pre>
     * @param whiteImplicitReverseFkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteImplicitReverseFk> whiteImplicitReverseFkList) {
        UpdateOption<WhiteImplicitReverseFkCB> op = createPlainUpdateOption();
        return doBatchUpdate(whiteImplicitReverseFkList, op);
    }

    protected int[] doBatchUpdate(List<WhiteImplicitReverseFk> whiteImplicitReverseFkList, UpdateOption<WhiteImplicitReverseFkCB> op) {
        assertObjectNotNull("whiteImplicitReverseFkList", whiteImplicitReverseFkList);
        prepareBatchUpdateOption(whiteImplicitReverseFkList, op);
        return delegateBatchUpdate(whiteImplicitReverseFkList, op);
    }

    protected void prepareBatchUpdateOption(List<WhiteImplicitReverseFk> whiteImplicitReverseFkList, UpdateOption<WhiteImplicitReverseFkCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(whiteImplicitReverseFkList);
        prepareUpdateOption(op);
    }

    @Override
    protected int[] doLumpModify(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return batchUpdate(downcast(ls)); }
        else { return varyingBatchUpdate(downcast(ls), downcast(op)); }
    }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * whiteImplicitReverseFkBhv.<span style="color: #FD4747">batchUpdate</span>(whiteImplicitReverseFkList, new SpecifyQuery<WhiteImplicitReverseFkCB>() {
     *     public void specify(WhiteImplicitReverseFkCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteImplicitReverseFkBhv.<span style="color: #FD4747">batchUpdate</span>(whiteImplicitReverseFkList, new SpecifyQuery<WhiteImplicitReverseFkCB>() {
     *     public void specify(WhiteImplicitReverseFkCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteImplicitReverseFkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteImplicitReverseFk> whiteImplicitReverseFkList, SpecifyQuery<WhiteImplicitReverseFkCB> updateColumnSpec) {
        return doBatchUpdate(whiteImplicitReverseFkList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteImplicitReverseFkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteImplicitReverseFk> whiteImplicitReverseFkList) {
        return doBatchDelete(whiteImplicitReverseFkList, null);
    }

    protected int[] doBatchDelete(List<WhiteImplicitReverseFk> whiteImplicitReverseFkList, DeleteOption<WhiteImplicitReverseFkCB> op) {
        assertObjectNotNull("whiteImplicitReverseFkList", whiteImplicitReverseFkList);
        prepareDeleteOption(op);
        return delegateBatchDelete(whiteImplicitReverseFkList, op);
    }

    @Override
    protected int[] doLumpRemove(List<Entity> ls, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return batchDelete(downcast(ls)); }
        else { return varyingBatchDelete(downcast(ls), downcast(op)); }
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
     * whiteImplicitReverseFkBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteImplicitReverseFk, WhiteImplicitReverseFkCB&gt;() {
     *     public ConditionBean setup(whiteImplicitReverseFk entity, WhiteImplicitReverseFkCB intoCB) {
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
     *         <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     *         <span style="color: #3F7E5E">//entity.setVersionNo(value);</span>
     *
     *         return cb;
     *     }
     * });
     * </pre>
     * @param setupper The setup-per of query-insert. (NotNull)
     * @return The inserted count.
     */
    public int queryInsert(QueryInsertSetupper<WhiteImplicitReverseFk, WhiteImplicitReverseFkCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteImplicitReverseFk, WhiteImplicitReverseFkCB> sp, InsertOption<WhiteImplicitReverseFkCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        WhiteImplicitReverseFk e = new WhiteImplicitReverseFk();
        WhiteImplicitReverseFkCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected WhiteImplicitReverseFkCB createCBForQueryInsert() {
        WhiteImplicitReverseFkCB cb = newMyConditionBean();
        cb.xsetupForQueryInsert();
        return cb;
    }

    @Override
    protected int doRangeCreate(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> setupper, InsertOption<? extends ConditionBean> option) {
        if (option == null) { return queryInsert(downcast(setupper)); }
        else { return varyingQueryInsert(downcast(setupper), downcast(option)); }
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteImplicitReverseFk whiteImplicitReverseFk = new WhiteImplicitReverseFk();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteImplicitReverseFk.setPK...(value);</span>
     * whiteImplicitReverseFk.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteImplicitReverseFk.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteImplicitReverseFk.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteImplicitReverseFk.setVersionNo(value);</span>
     * WhiteImplicitReverseFkCB cb = new WhiteImplicitReverseFkCB();
     * cb.query().setFoo...(value);
     * whiteImplicitReverseFkBhv.<span style="color: #FD4747">queryUpdate</span>(whiteImplicitReverseFk, cb);
     * </pre>
     * @param whiteImplicitReverseFk The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteImplicitReverseFk. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteImplicitReverseFk whiteImplicitReverseFk, WhiteImplicitReverseFkCB cb) {
        return doQueryUpdate(whiteImplicitReverseFk, cb, null);
    }

    protected int doQueryUpdate(WhiteImplicitReverseFk whiteImplicitReverseFk, WhiteImplicitReverseFkCB cb, UpdateOption<WhiteImplicitReverseFkCB> op) {
        assertObjectNotNull("whiteImplicitReverseFk", whiteImplicitReverseFk); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(whiteImplicitReverseFk, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (WhiteImplicitReverseFkCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (WhiteImplicitReverseFkCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteImplicitReverseFkCB cb = new WhiteImplicitReverseFkCB();
     * cb.query().setFoo...(value);
     * whiteImplicitReverseFkBhv.<span style="color: #FD4747">queryDelete</span>(whiteImplicitReverseFk, cb);
     * </pre>
     * @param cb The condition-bean of WhiteImplicitReverseFk. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteImplicitReverseFkCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteImplicitReverseFkCB cb, DeleteOption<WhiteImplicitReverseFkCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((WhiteImplicitReverseFkCB)cb); }
        else { return varyingQueryDelete((WhiteImplicitReverseFkCB)cb, downcast(op)); }
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
     * WhiteImplicitReverseFk whiteImplicitReverseFk = new WhiteImplicitReverseFk();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteImplicitReverseFk.setFoo...(value);
     * whiteImplicitReverseFk.setBar...(value);
     * InsertOption<WhiteImplicitReverseFkCB> option = new InsertOption<WhiteImplicitReverseFkCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteImplicitReverseFkBhv.<span style="color: #FD4747">varyingInsert</span>(whiteImplicitReverseFk, option);
     * ... = whiteImplicitReverseFk.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteImplicitReverseFk The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteImplicitReverseFk whiteImplicitReverseFk, InsertOption<WhiteImplicitReverseFkCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteImplicitReverseFk, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteImplicitReverseFk whiteImplicitReverseFk = new WhiteImplicitReverseFk();
     * whiteImplicitReverseFk.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteImplicitReverseFk.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteImplicitReverseFk.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteImplicitReverseFkCB&gt; option = new UpdateOption&lt;WhiteImplicitReverseFkCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteImplicitReverseFkCB&gt;() {
     *         public void specify(WhiteImplicitReverseFkCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteImplicitReverseFkBhv.<span style="color: #FD4747">varyingUpdate</span>(whiteImplicitReverseFk, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteImplicitReverseFk The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteImplicitReverseFk whiteImplicitReverseFk, UpdateOption<WhiteImplicitReverseFkCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteImplicitReverseFk, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteImplicitReverseFk The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteImplicitReverseFk whiteImplicitReverseFk, InsertOption<WhiteImplicitReverseFkCB> insertOption, UpdateOption<WhiteImplicitReverseFkCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(whiteImplicitReverseFk, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteImplicitReverseFk The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteImplicitReverseFk whiteImplicitReverseFk, DeleteOption<WhiteImplicitReverseFkCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteImplicitReverseFk, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteImplicitReverseFkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteImplicitReverseFk> whiteImplicitReverseFkList, InsertOption<WhiteImplicitReverseFkCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteImplicitReverseFkList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteImplicitReverseFkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteImplicitReverseFk> whiteImplicitReverseFkList, UpdateOption<WhiteImplicitReverseFkCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteImplicitReverseFkList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteImplicitReverseFkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteImplicitReverseFk> whiteImplicitReverseFkList, DeleteOption<WhiteImplicitReverseFkCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteImplicitReverseFkList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteImplicitReverseFk, WhiteImplicitReverseFkCB> setupper, InsertOption<WhiteImplicitReverseFkCB> option) {
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
     * WhiteImplicitReverseFk whiteImplicitReverseFk = new WhiteImplicitReverseFk();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteImplicitReverseFk.setPK...(value);</span>
     * whiteImplicitReverseFk.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteImplicitReverseFk.setVersionNo(value);</span>
     * WhiteImplicitReverseFkCB cb = new WhiteImplicitReverseFkCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteImplicitReverseFkCB&gt; option = new UpdateOption&lt;WhiteImplicitReverseFkCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteImplicitReverseFkCB&gt;() {
     *     public void specify(WhiteImplicitReverseFkCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteImplicitReverseFkBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(whiteImplicitReverseFk, cb, option);
     * </pre>
     * @param whiteImplicitReverseFk The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteImplicitReverseFk. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteImplicitReverseFk whiteImplicitReverseFk, WhiteImplicitReverseFkCB cb, UpdateOption<WhiteImplicitReverseFkCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteImplicitReverseFk, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteImplicitReverseFk. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteImplicitReverseFkCB cb, DeleteOption<WhiteImplicitReverseFkCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteImplicitReverseFkBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhiteImplicitReverseFkCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhiteImplicitReverseFkCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhiteImplicitReverseFk> void delegateSelectCursor(WhiteImplicitReverseFkCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends WhiteImplicitReverseFk> List<ENTITY> delegateSelectList(WhiteImplicitReverseFkCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhiteImplicitReverseFk et, InsertOption<WhiteImplicitReverseFkCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(WhiteImplicitReverseFk et, UpdateOption<WhiteImplicitReverseFkCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(WhiteImplicitReverseFk et, UpdateOption<WhiteImplicitReverseFkCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(WhiteImplicitReverseFk et, DeleteOption<WhiteImplicitReverseFkCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(WhiteImplicitReverseFk et, DeleteOption<WhiteImplicitReverseFkCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<WhiteImplicitReverseFk> ls, InsertOption<WhiteImplicitReverseFkCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhiteImplicitReverseFk> ls, UpdateOption<WhiteImplicitReverseFkCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhiteImplicitReverseFk> ls, UpdateOption<WhiteImplicitReverseFkCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhiteImplicitReverseFk> ls, DeleteOption<WhiteImplicitReverseFkCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhiteImplicitReverseFk> ls, DeleteOption<WhiteImplicitReverseFkCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhiteImplicitReverseFk et, WhiteImplicitReverseFkCB inCB, ConditionBean resCB, InsertOption<WhiteImplicitReverseFkCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhiteImplicitReverseFk et, WhiteImplicitReverseFkCB cb, UpdateOption<WhiteImplicitReverseFkCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(WhiteImplicitReverseFkCB cb, DeleteOption<WhiteImplicitReverseFkCB> op)
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
    //                                                                     Downcast Helper
    //                                                                     ===============
    protected WhiteImplicitReverseFk downcast(Entity et) {
        return helpEntityDowncastInternally(et, WhiteImplicitReverseFk.class);
    }

    protected WhiteImplicitReverseFkCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, WhiteImplicitReverseFkCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<WhiteImplicitReverseFk> downcast(List<? extends Entity> ls) {
        return (List<WhiteImplicitReverseFk>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteImplicitReverseFkCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<WhiteImplicitReverseFkCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteImplicitReverseFkCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<WhiteImplicitReverseFkCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteImplicitReverseFkCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<WhiteImplicitReverseFkCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteImplicitReverseFk, WhiteImplicitReverseFkCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<WhiteImplicitReverseFk, WhiteImplicitReverseFkCB>)sp;
    }
}
