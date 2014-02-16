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
public abstract class BsWhiteImplicitConvNumericBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_implicit_conv_numeric"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return WhiteImplicitConvNumericDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteImplicitConvNumericDbm getMyDBMeta() { return WhiteImplicitConvNumericDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

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
     * int count = whiteImplicitConvNumericBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteImplicitConvNumeric. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteImplicitConvNumericCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteImplicitConvNumericCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteImplicitConvNumericCB cb) { // called by selectPage(cb)
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
     * WhiteImplicitConvNumericCB cb = new WhiteImplicitConvNumericCB();
     * cb.query().setFoo...(value);
     * WhiteImplicitConvNumeric whiteImplicitConvNumeric = whiteImplicitConvNumericBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (whiteImplicitConvNumeric != null) {
     *     ... = whiteImplicitConvNumeric.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteImplicitConvNumeric. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteImplicitConvNumeric selectEntity(WhiteImplicitConvNumericCB cb) {
        return doSelectEntity(cb, WhiteImplicitConvNumeric.class);
    }

    protected <ENTITY extends WhiteImplicitConvNumeric> ENTITY doSelectEntity(final WhiteImplicitConvNumericCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, WhiteImplicitConvNumericCB>() {
            public List<ENTITY> callbackSelectList(WhiteImplicitConvNumericCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * WhiteImplicitConvNumericCB cb = new WhiteImplicitConvNumericCB();
     * cb.query().setFoo...(value);
     * WhiteImplicitConvNumeric whiteImplicitConvNumeric = whiteImplicitConvNumericBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteImplicitConvNumeric.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteImplicitConvNumeric. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteImplicitConvNumeric selectEntityWithDeletedCheck(WhiteImplicitConvNumericCB cb) {
        return doSelectEntityWithDeletedCheck(cb, WhiteImplicitConvNumeric.class);
    }

    protected <ENTITY extends WhiteImplicitConvNumeric> ENTITY doSelectEntityWithDeletedCheck(final WhiteImplicitConvNumericCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteImplicitConvNumericCB>() {
            public List<ENTITY> callbackSelectList(WhiteImplicitConvNumericCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param implicitConvNumericId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteImplicitConvNumeric selectByPKValue(java.math.BigDecimal implicitConvNumericId) {
        return doSelectByPKValue(implicitConvNumericId, WhiteImplicitConvNumeric.class);
    }

    protected <ENTITY extends WhiteImplicitConvNumeric> ENTITY doSelectByPKValue(java.math.BigDecimal implicitConvNumericId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(implicitConvNumericId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param implicitConvNumericId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteImplicitConvNumeric selectByPKValueWithDeletedCheck(java.math.BigDecimal implicitConvNumericId) {
        return doSelectByPKValueWithDeletedCheck(implicitConvNumericId, WhiteImplicitConvNumeric.class);
    }

    protected <ENTITY extends WhiteImplicitConvNumeric> ENTITY doSelectByPKValueWithDeletedCheck(java.math.BigDecimal implicitConvNumericId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(implicitConvNumericId), entityType);
    }

    private WhiteImplicitConvNumericCB buildPKCB(java.math.BigDecimal implicitConvNumericId) {
        assertObjectNotNull("implicitConvNumericId", implicitConvNumericId);
        WhiteImplicitConvNumericCB cb = newMyConditionBean();
        cb.query().setImplicitConvNumericId_Equal(implicitConvNumericId);
        return cb;
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
     * ListResultBean&lt;WhiteImplicitConvNumeric&gt; whiteImplicitConvNumericList = whiteImplicitConvNumericBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (WhiteImplicitConvNumeric whiteImplicitConvNumeric : whiteImplicitConvNumericList) {
     *     ... = whiteImplicitConvNumeric.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteImplicitConvNumeric. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteImplicitConvNumeric> selectList(WhiteImplicitConvNumericCB cb) {
        return doSelectList(cb, WhiteImplicitConvNumeric.class);
    }

    protected <ENTITY extends WhiteImplicitConvNumeric> ListResultBean<ENTITY> doSelectList(WhiteImplicitConvNumericCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, WhiteImplicitConvNumericCB>() {
            public List<ENTITY> callbackSelectList(WhiteImplicitConvNumericCB cb, Class<ENTITY> tp) { return delegateSelectList(cb, tp); } });
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
     * WhiteImplicitConvNumericCB cb = new WhiteImplicitConvNumericCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteImplicitConvNumeric&gt; page = whiteImplicitConvNumericBhv.<span style="color: #FD4747">selectPage</span>(cb);
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
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteImplicitConvNumeric> selectPage(WhiteImplicitConvNumericCB cb) {
        return doSelectPage(cb, WhiteImplicitConvNumeric.class);
    }

    protected <ENTITY extends WhiteImplicitConvNumeric> PagingResultBean<ENTITY> doSelectPage(WhiteImplicitConvNumericCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, WhiteImplicitConvNumericCB>() {
            public int callbackSelectCount(WhiteImplicitConvNumericCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteImplicitConvNumericCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * WhiteImplicitConvNumericCB cb = new WhiteImplicitConvNumericCB();
     * cb.query().setFoo...(value);
     * whiteImplicitConvNumericBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteImplicitConvNumeric&gt;() {
     *     public void handle(WhiteImplicitConvNumeric entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteImplicitConvNumeric. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteImplicitConvNumeric. (NotNull)
     */
    public void selectCursor(WhiteImplicitConvNumericCB cb, EntityRowHandler<WhiteImplicitConvNumeric> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, WhiteImplicitConvNumeric.class);
    }

    protected <ENTITY extends WhiteImplicitConvNumeric> void doSelectCursor(WhiteImplicitConvNumericCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, WhiteImplicitConvNumericCB>() {
            public void callbackSelectCursor(WhiteImplicitConvNumericCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(WhiteImplicitConvNumericCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteImplicitConvNumericBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteImplicitConvNumericCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<WhiteImplicitConvNumericCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends WhiteImplicitConvNumericCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends WhiteImplicitConvNumericCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
     * @param whiteImplicitConvNumeric The entity of whiteImplicitConvNumeric. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadWhiteImplicitConvIntegerList(WhiteImplicitConvNumeric whiteImplicitConvNumeric, ConditionBeanSetupper<WhiteImplicitConvIntegerCB> conditionBeanSetupper) {
        xassLRArg(whiteImplicitConvNumeric, conditionBeanSetupper);
        loadWhiteImplicitConvIntegerList(xnewLRLs(whiteImplicitConvNumeric), conditionBeanSetupper);
    }
    /**
     * Load referrer of whiteImplicitConvIntegerList with the set-upper for condition-bean of referrer. <br />
     * white_implicit_conv_integer by IMPLICIT_CONV_NUMERIC_ID, named 'whiteImplicitConvIntegerList'.
     * <pre>
     * whiteImplicitConvNumericBhv.<span style="color: #FD4747">loadWhiteImplicitConvIntegerList</span>(whiteImplicitConvNumericList, new ConditionBeanSetupper&lt;WhiteImplicitConvIntegerCB&gt;() {
     *     public void setup(WhiteImplicitConvIntegerCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (WhiteImplicitConvNumeric whiteImplicitConvNumeric : whiteImplicitConvNumericList) {
     *     ... = whiteImplicitConvNumeric.<span style="color: #FD4747">getWhiteImplicitConvIntegerList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setImplicitConvNumericId_InScope(pkList);
     * cb.query().addOrderBy_ImplicitConvNumericId_Asc();
     * </pre>
     * @param whiteImplicitConvNumericList The entity list of whiteImplicitConvNumeric. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadWhiteImplicitConvIntegerList(List<WhiteImplicitConvNumeric> whiteImplicitConvNumericList, ConditionBeanSetupper<WhiteImplicitConvIntegerCB> conditionBeanSetupper) {
        xassLRArg(whiteImplicitConvNumericList, conditionBeanSetupper);
        loadWhiteImplicitConvIntegerList(whiteImplicitConvNumericList, new LoadReferrerOption<WhiteImplicitConvIntegerCB, WhiteImplicitConvInteger>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param whiteImplicitConvNumeric The entity of whiteImplicitConvNumeric. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadWhiteImplicitConvIntegerList(WhiteImplicitConvNumeric whiteImplicitConvNumeric, LoadReferrerOption<WhiteImplicitConvIntegerCB, WhiteImplicitConvInteger> loadReferrerOption) {
        xassLRArg(whiteImplicitConvNumeric, loadReferrerOption);
        loadWhiteImplicitConvIntegerList(xnewLRLs(whiteImplicitConvNumeric), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param whiteImplicitConvNumericList The entity list of whiteImplicitConvNumeric. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadWhiteImplicitConvIntegerList(List<WhiteImplicitConvNumeric> whiteImplicitConvNumericList, LoadReferrerOption<WhiteImplicitConvIntegerCB, WhiteImplicitConvInteger> loadReferrerOption) {
        xassLRArg(whiteImplicitConvNumericList, loadReferrerOption);
        if (whiteImplicitConvNumericList.isEmpty()) { return; }
        final WhiteImplicitConvIntegerBhv referrerBhv = xgetBSFLR().select(WhiteImplicitConvIntegerBhv.class);
        helpLoadReferrerInternally(whiteImplicitConvNumericList, loadReferrerOption, new InternalLoadReferrerCallback<WhiteImplicitConvNumeric, Integer, WhiteImplicitConvIntegerCB, WhiteImplicitConvInteger>() {
            public Integer getPKVal(WhiteImplicitConvNumeric et)
            { if (et.getImplicitConvNumericId() == null) { return null; }
              return Integer.valueOf(et.getImplicitConvNumericId().toString()); }
            public void setRfLs(WhiteImplicitConvNumeric et, List<WhiteImplicitConvInteger> ls)
            { et.setWhiteImplicitConvIntegerList(ls); }
            public WhiteImplicitConvIntegerCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(WhiteImplicitConvIntegerCB cb, List<Integer> ls)
            { cb.query().setImplicitConvNumericId_InScope(ls); }
            public void qyOdFKAsc(WhiteImplicitConvIntegerCB cb) { cb.query().addOrderBy_ImplicitConvNumericId_Asc(); }
            public void spFKCol(WhiteImplicitConvIntegerCB cb) { cb.specify().columnImplicitConvNumericId(); }
            public List<WhiteImplicitConvInteger> selRfLs(WhiteImplicitConvIntegerCB cb) { return referrerBhv.selectList(cb); }
            public Integer getFKVal(WhiteImplicitConvInteger re) { return re.getImplicitConvNumericId(); }
            public void setlcEt(WhiteImplicitConvInteger re, WhiteImplicitConvNumeric le)
            { re.setWhiteImplicitConvNumeric(le); }
            public String getRfPrNm() { return "whiteImplicitConvIntegerList"; }
        });
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param whiteImplicitConvNumeric The entity of whiteImplicitConvNumeric. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadWhiteImplicitConvStringList(WhiteImplicitConvNumeric whiteImplicitConvNumeric, ConditionBeanSetupper<WhiteImplicitConvStringCB> conditionBeanSetupper) {
        xassLRArg(whiteImplicitConvNumeric, conditionBeanSetupper);
        loadWhiteImplicitConvStringList(xnewLRLs(whiteImplicitConvNumeric), conditionBeanSetupper);
    }
    /**
     * Load referrer of whiteImplicitConvStringList with the set-upper for condition-bean of referrer. <br />
     * white_implicit_conv_string by IMPLICIT_CONV_NUMERIC_ID, named 'whiteImplicitConvStringList'.
     * <pre>
     * whiteImplicitConvNumericBhv.<span style="color: #FD4747">loadWhiteImplicitConvStringList</span>(whiteImplicitConvNumericList, new ConditionBeanSetupper&lt;WhiteImplicitConvStringCB&gt;() {
     *     public void setup(WhiteImplicitConvStringCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (WhiteImplicitConvNumeric whiteImplicitConvNumeric : whiteImplicitConvNumericList) {
     *     ... = whiteImplicitConvNumeric.<span style="color: #FD4747">getWhiteImplicitConvStringList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setImplicitConvNumericId_InScope(pkList);
     * cb.query().addOrderBy_ImplicitConvNumericId_Asc();
     * </pre>
     * @param whiteImplicitConvNumericList The entity list of whiteImplicitConvNumeric. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadWhiteImplicitConvStringList(List<WhiteImplicitConvNumeric> whiteImplicitConvNumericList, ConditionBeanSetupper<WhiteImplicitConvStringCB> conditionBeanSetupper) {
        xassLRArg(whiteImplicitConvNumericList, conditionBeanSetupper);
        loadWhiteImplicitConvStringList(whiteImplicitConvNumericList, new LoadReferrerOption<WhiteImplicitConvStringCB, WhiteImplicitConvString>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param whiteImplicitConvNumeric The entity of whiteImplicitConvNumeric. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadWhiteImplicitConvStringList(WhiteImplicitConvNumeric whiteImplicitConvNumeric, LoadReferrerOption<WhiteImplicitConvStringCB, WhiteImplicitConvString> loadReferrerOption) {
        xassLRArg(whiteImplicitConvNumeric, loadReferrerOption);
        loadWhiteImplicitConvStringList(xnewLRLs(whiteImplicitConvNumeric), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param whiteImplicitConvNumericList The entity list of whiteImplicitConvNumeric. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadWhiteImplicitConvStringList(List<WhiteImplicitConvNumeric> whiteImplicitConvNumericList, LoadReferrerOption<WhiteImplicitConvStringCB, WhiteImplicitConvString> loadReferrerOption) {
        xassLRArg(whiteImplicitConvNumericList, loadReferrerOption);
        if (whiteImplicitConvNumericList.isEmpty()) { return; }
        final WhiteImplicitConvStringBhv referrerBhv = xgetBSFLR().select(WhiteImplicitConvStringBhv.class);
        helpLoadReferrerInternally(whiteImplicitConvNumericList, loadReferrerOption, new InternalLoadReferrerCallback<WhiteImplicitConvNumeric, String, WhiteImplicitConvStringCB, WhiteImplicitConvString>() {
            public String getPKVal(WhiteImplicitConvNumeric et)
            { if (et.getImplicitConvNumericId() == null) { return null; }
              return et.getImplicitConvNumericId().toString(); }
            public void setRfLs(WhiteImplicitConvNumeric et, List<WhiteImplicitConvString> ls)
            { et.setWhiteImplicitConvStringList(ls); }
            public WhiteImplicitConvStringCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(WhiteImplicitConvStringCB cb, List<String> ls)
            { cb.query().setImplicitConvNumericId_InScope(ls); }
            public void qyOdFKAsc(WhiteImplicitConvStringCB cb) { cb.query().addOrderBy_ImplicitConvNumericId_Asc(); }
            public void spFKCol(WhiteImplicitConvStringCB cb) { cb.specify().columnImplicitConvNumericId(); }
            public List<WhiteImplicitConvString> selRfLs(WhiteImplicitConvStringCB cb) { return referrerBhv.selectList(cb); }
            public String getFKVal(WhiteImplicitConvString re) { return re.getImplicitConvNumericId(); }
            public void setlcEt(WhiteImplicitConvString re, WhiteImplicitConvNumeric le)
            { re.setWhiteImplicitConvNumeric(le); }
            public String getRfPrNm() { return "whiteImplicitConvStringList"; }
        });
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'WhiteImplicitConvInteger'.
     * @param whiteImplicitConvNumericList The list of whiteImplicitConvNumeric. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteImplicitConvInteger> pulloutWhiteImplicitConvInteger(List<WhiteImplicitConvNumeric> whiteImplicitConvNumericList) {
        return helpPulloutInternally(whiteImplicitConvNumericList, new InternalPulloutCallback<WhiteImplicitConvNumeric, WhiteImplicitConvInteger>() {
            public WhiteImplicitConvInteger getFr(WhiteImplicitConvNumeric et) { return et.getWhiteImplicitConvInteger(); }
            public boolean hasRf() { return true; }
            public void setRfLs(WhiteImplicitConvInteger et, List<WhiteImplicitConvNumeric> ls)
            { et.setWhiteImplicitConvNumericList(ls); }
        });
    }
    /**
     * Pull out the list of foreign table 'WhiteImplicitConvString'.
     * @param whiteImplicitConvNumericList The list of whiteImplicitConvNumeric. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteImplicitConvString> pulloutWhiteImplicitConvString(List<WhiteImplicitConvNumeric> whiteImplicitConvNumericList) {
        return helpPulloutInternally(whiteImplicitConvNumericList, new InternalPulloutCallback<WhiteImplicitConvNumeric, WhiteImplicitConvString>() {
            public WhiteImplicitConvString getFr(WhiteImplicitConvNumeric et) { return et.getWhiteImplicitConvString(); }
            public boolean hasRf() { return true; }
            public void setRfLs(WhiteImplicitConvString et, List<WhiteImplicitConvNumeric> ls)
            { et.setWhiteImplicitConvNumericList(ls); }
        });
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key implicitConvNumericId.
     * @param whiteImplicitConvNumericList The list of whiteImplicitConvNumeric. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<java.math.BigDecimal> extractImplicitConvNumericIdList(List<WhiteImplicitConvNumeric> whiteImplicitConvNumericList) {
        return helpExtractListInternally(whiteImplicitConvNumericList, new InternalExtractCallback<WhiteImplicitConvNumeric, java.math.BigDecimal>() {
            public java.math.BigDecimal getCV(WhiteImplicitConvNumeric et) { return et.getImplicitConvNumericId(); }
        });
    }

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
     * whiteImplicitConvNumericBhv.<span style="color: #FD4747">insert</span>(whiteImplicitConvNumeric);
     * ... = whiteImplicitConvNumeric.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteImplicitConvNumeric The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteImplicitConvNumeric whiteImplicitConvNumeric) {
        doInsert(whiteImplicitConvNumeric, null);
    }

    protected void doInsert(WhiteImplicitConvNumeric whiteImplicitConvNumeric, InsertOption<WhiteImplicitConvNumericCB> op) {
        assertObjectNotNull("whiteImplicitConvNumeric", whiteImplicitConvNumeric);
        prepareInsertOption(op);
        delegateInsert(whiteImplicitConvNumeric, op);
    }

    protected void prepareInsertOption(InsertOption<WhiteImplicitConvNumericCB> op) {
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
     * WhiteImplicitConvNumeric whiteImplicitConvNumeric = new WhiteImplicitConvNumeric();
     * whiteImplicitConvNumeric.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteImplicitConvNumeric.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvNumeric.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvNumeric.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteImplicitConvNumeric.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteImplicitConvNumericBhv.<span style="color: #FD4747">update</span>(whiteImplicitConvNumeric);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteImplicitConvNumeric The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final WhiteImplicitConvNumeric whiteImplicitConvNumeric) {
        doUpdate(whiteImplicitConvNumeric, null);
    }

    protected void doUpdate(WhiteImplicitConvNumeric whiteImplicitConvNumeric, final UpdateOption<WhiteImplicitConvNumericCB> op) {
        assertObjectNotNull("whiteImplicitConvNumeric", whiteImplicitConvNumeric);
        prepareUpdateOption(op);
        helpUpdateInternally(whiteImplicitConvNumeric, new InternalUpdateCallback<WhiteImplicitConvNumeric>() {
            public int callbackDelegateUpdate(WhiteImplicitConvNumeric et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhiteImplicitConvNumericCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected WhiteImplicitConvNumericCB createCBForVaryingUpdate() {
        WhiteImplicitConvNumericCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected WhiteImplicitConvNumericCB createCBForSpecifiedUpdate() {
        WhiteImplicitConvNumericCB cb = newMyConditionBean();
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
     * @param whiteImplicitConvNumeric The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteImplicitConvNumeric whiteImplicitConvNumeric) {
        doInesrtOrUpdate(whiteImplicitConvNumeric, null, null);
    }

    protected void doInesrtOrUpdate(WhiteImplicitConvNumeric whiteImplicitConvNumeric, final InsertOption<WhiteImplicitConvNumericCB> iop, final UpdateOption<WhiteImplicitConvNumericCB> uop) {
        helpInsertOrUpdateInternally(whiteImplicitConvNumeric, new InternalInsertOrUpdateCallback<WhiteImplicitConvNumeric, WhiteImplicitConvNumericCB>() {
            public void callbackInsert(WhiteImplicitConvNumeric et) { doInsert(et, iop); }
            public void callbackUpdate(WhiteImplicitConvNumeric et) { doUpdate(et, uop); }
            public WhiteImplicitConvNumericCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(WhiteImplicitConvNumericCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<WhiteImplicitConvNumericCB>();
            uop = uop != null ? uop : new UpdateOption<WhiteImplicitConvNumericCB>();
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
     * WhiteImplicitConvNumeric whiteImplicitConvNumeric = new WhiteImplicitConvNumeric();
     * whiteImplicitConvNumeric.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteImplicitConvNumeric.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteImplicitConvNumericBhv.<span style="color: #FD4747">delete</span>(whiteImplicitConvNumeric);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteImplicitConvNumeric The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteImplicitConvNumeric whiteImplicitConvNumeric) {
        doDelete(whiteImplicitConvNumeric, null);
    }

    protected void doDelete(WhiteImplicitConvNumeric whiteImplicitConvNumeric, final DeleteOption<WhiteImplicitConvNumericCB> op) {
        assertObjectNotNull("whiteImplicitConvNumeric", whiteImplicitConvNumeric);
        prepareDeleteOption(op);
        helpDeleteInternally(whiteImplicitConvNumeric, new InternalDeleteCallback<WhiteImplicitConvNumeric>() {
            public int callbackDelegateDelete(WhiteImplicitConvNumeric et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhiteImplicitConvNumericCB> op) {
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
     * whiteImplicitConvNumericBhv.<span style="color: #FD4747">batchInsert</span>(whiteImplicitConvNumericList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteImplicitConvNumericList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteImplicitConvNumeric> whiteImplicitConvNumericList) {
        InsertOption<WhiteImplicitConvNumericCB> op = createInsertUpdateOption();
        return doBatchInsert(whiteImplicitConvNumericList, op);
    }

    protected int[] doBatchInsert(List<WhiteImplicitConvNumeric> whiteImplicitConvNumericList, InsertOption<WhiteImplicitConvNumericCB> op) {
        assertObjectNotNull("whiteImplicitConvNumericList", whiteImplicitConvNumericList);
        prepareBatchInsertOption(whiteImplicitConvNumericList, op);
        return delegateBatchInsert(whiteImplicitConvNumericList, op);
    }

    protected void prepareBatchInsertOption(List<WhiteImplicitConvNumeric> whiteImplicitConvNumericList, InsertOption<WhiteImplicitConvNumericCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(whiteImplicitConvNumericList);
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
     * whiteImplicitConvNumericBhv.<span style="color: #FD4747">batchUpdate</span>(whiteImplicitConvNumericList);
     * </pre>
     * @param whiteImplicitConvNumericList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteImplicitConvNumeric> whiteImplicitConvNumericList) {
        UpdateOption<WhiteImplicitConvNumericCB> op = createPlainUpdateOption();
        return doBatchUpdate(whiteImplicitConvNumericList, op);
    }

    protected int[] doBatchUpdate(List<WhiteImplicitConvNumeric> whiteImplicitConvNumericList, UpdateOption<WhiteImplicitConvNumericCB> op) {
        assertObjectNotNull("whiteImplicitConvNumericList", whiteImplicitConvNumericList);
        prepareBatchUpdateOption(whiteImplicitConvNumericList, op);
        return delegateBatchUpdate(whiteImplicitConvNumericList, op);
    }

    protected void prepareBatchUpdateOption(List<WhiteImplicitConvNumeric> whiteImplicitConvNumericList, UpdateOption<WhiteImplicitConvNumericCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(whiteImplicitConvNumericList);
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
     * whiteImplicitConvNumericBhv.<span style="color: #FD4747">batchUpdate</span>(whiteImplicitConvNumericList, new SpecifyQuery<WhiteImplicitConvNumericCB>() {
     *     public void specify(WhiteImplicitConvNumericCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteImplicitConvNumericBhv.<span style="color: #FD4747">batchUpdate</span>(whiteImplicitConvNumericList, new SpecifyQuery<WhiteImplicitConvNumericCB>() {
     *     public void specify(WhiteImplicitConvNumericCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
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
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteImplicitConvNumeric> whiteImplicitConvNumericList, SpecifyQuery<WhiteImplicitConvNumericCB> updateColumnSpec) {
        return doBatchUpdate(whiteImplicitConvNumericList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteImplicitConvNumericList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteImplicitConvNumeric> whiteImplicitConvNumericList) {
        return doBatchDelete(whiteImplicitConvNumericList, null);
    }

    protected int[] doBatchDelete(List<WhiteImplicitConvNumeric> whiteImplicitConvNumericList, DeleteOption<WhiteImplicitConvNumericCB> op) {
        assertObjectNotNull("whiteImplicitConvNumericList", whiteImplicitConvNumericList);
        prepareDeleteOption(op);
        return delegateBatchDelete(whiteImplicitConvNumericList, op);
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
     * whiteImplicitConvNumericBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteImplicitConvNumeric, WhiteImplicitConvNumericCB&gt;() {
     *     public ConditionBean setup(whiteImplicitConvNumeric entity, WhiteImplicitConvNumericCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteImplicitConvNumeric, WhiteImplicitConvNumericCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteImplicitConvNumeric, WhiteImplicitConvNumericCB> sp, InsertOption<WhiteImplicitConvNumericCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        WhiteImplicitConvNumeric e = new WhiteImplicitConvNumeric();
        WhiteImplicitConvNumericCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected WhiteImplicitConvNumericCB createCBForQueryInsert() {
        WhiteImplicitConvNumericCB cb = newMyConditionBean();
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
     * WhiteImplicitConvNumeric whiteImplicitConvNumeric = new WhiteImplicitConvNumeric();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvNumeric.setPK...(value);</span>
     * whiteImplicitConvNumeric.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvNumeric.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvNumeric.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvNumeric.setVersionNo(value);</span>
     * WhiteImplicitConvNumericCB cb = new WhiteImplicitConvNumericCB();
     * cb.query().setFoo...(value);
     * whiteImplicitConvNumericBhv.<span style="color: #FD4747">queryUpdate</span>(whiteImplicitConvNumeric, cb);
     * </pre>
     * @param whiteImplicitConvNumeric The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteImplicitConvNumeric. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteImplicitConvNumeric whiteImplicitConvNumeric, WhiteImplicitConvNumericCB cb) {
        return doQueryUpdate(whiteImplicitConvNumeric, cb, null);
    }

    protected int doQueryUpdate(WhiteImplicitConvNumeric whiteImplicitConvNumeric, WhiteImplicitConvNumericCB cb, UpdateOption<WhiteImplicitConvNumericCB> op) {
        assertObjectNotNull("whiteImplicitConvNumeric", whiteImplicitConvNumeric); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(whiteImplicitConvNumeric, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (WhiteImplicitConvNumericCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (WhiteImplicitConvNumericCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteImplicitConvNumericCB cb = new WhiteImplicitConvNumericCB();
     * cb.query().setFoo...(value);
     * whiteImplicitConvNumericBhv.<span style="color: #FD4747">queryDelete</span>(whiteImplicitConvNumeric, cb);
     * </pre>
     * @param cb The condition-bean of WhiteImplicitConvNumeric. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteImplicitConvNumericCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteImplicitConvNumericCB cb, DeleteOption<WhiteImplicitConvNumericCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((WhiteImplicitConvNumericCB)cb); }
        else { return varyingQueryDelete((WhiteImplicitConvNumericCB)cb, downcast(op)); }
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
     * whiteImplicitConvNumericBhv.<span style="color: #FD4747">varyingInsert</span>(whiteImplicitConvNumeric, option);
     * ... = whiteImplicitConvNumeric.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteImplicitConvNumeric The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
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
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteImplicitConvNumeric.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteImplicitConvNumericCB&gt; option = new UpdateOption&lt;WhiteImplicitConvNumericCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteImplicitConvNumericCB&gt;() {
     *         public void specify(WhiteImplicitConvNumericCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteImplicitConvNumericBhv.<span style="color: #FD4747">varyingUpdate</span>(whiteImplicitConvNumeric, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteImplicitConvNumeric The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteImplicitConvNumeric whiteImplicitConvNumeric, UpdateOption<WhiteImplicitConvNumericCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteImplicitConvNumeric, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteImplicitConvNumeric The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteImplicitConvNumeric whiteImplicitConvNumeric, InsertOption<WhiteImplicitConvNumericCB> insertOption, UpdateOption<WhiteImplicitConvNumericCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(whiteImplicitConvNumeric, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteImplicitConvNumeric The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
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
     * @param setupper The setup-per of query-insert. (NotNull)
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
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvNumeric.setVersionNo(value);</span>
     * WhiteImplicitConvNumericCB cb = new WhiteImplicitConvNumericCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteImplicitConvNumericCB&gt; option = new UpdateOption&lt;WhiteImplicitConvNumericCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteImplicitConvNumericCB&gt;() {
     *     public void specify(WhiteImplicitConvNumericCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteImplicitConvNumericBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(whiteImplicitConvNumeric, cb, option);
     * </pre>
     * @param whiteImplicitConvNumeric The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteImplicitConvNumeric. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
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
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
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
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhiteImplicitConvNumericCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhiteImplicitConvNumericCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhiteImplicitConvNumeric> void delegateSelectCursor(WhiteImplicitConvNumericCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends WhiteImplicitConvNumeric> List<ENTITY> delegateSelectList(WhiteImplicitConvNumericCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhiteImplicitConvNumeric et, InsertOption<WhiteImplicitConvNumericCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(WhiteImplicitConvNumeric et, UpdateOption<WhiteImplicitConvNumericCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(WhiteImplicitConvNumeric et, UpdateOption<WhiteImplicitConvNumericCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(WhiteImplicitConvNumeric et, DeleteOption<WhiteImplicitConvNumericCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(WhiteImplicitConvNumeric et, DeleteOption<WhiteImplicitConvNumericCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<WhiteImplicitConvNumeric> ls, InsertOption<WhiteImplicitConvNumericCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhiteImplicitConvNumeric> ls, UpdateOption<WhiteImplicitConvNumericCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhiteImplicitConvNumeric> ls, UpdateOption<WhiteImplicitConvNumericCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhiteImplicitConvNumeric> ls, DeleteOption<WhiteImplicitConvNumericCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhiteImplicitConvNumeric> ls, DeleteOption<WhiteImplicitConvNumericCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhiteImplicitConvNumeric et, WhiteImplicitConvNumericCB inCB, ConditionBean resCB, InsertOption<WhiteImplicitConvNumericCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhiteImplicitConvNumeric et, WhiteImplicitConvNumericCB cb, UpdateOption<WhiteImplicitConvNumericCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(WhiteImplicitConvNumericCB cb, DeleteOption<WhiteImplicitConvNumericCB> op)
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
    protected WhiteImplicitConvNumeric downcast(Entity et) {
        return helpEntityDowncastInternally(et, WhiteImplicitConvNumeric.class);
    }

    protected WhiteImplicitConvNumericCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, WhiteImplicitConvNumericCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<WhiteImplicitConvNumeric> downcast(List<? extends Entity> ls) {
        return (List<WhiteImplicitConvNumeric>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteImplicitConvNumericCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<WhiteImplicitConvNumericCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteImplicitConvNumericCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<WhiteImplicitConvNumericCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteImplicitConvNumericCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<WhiteImplicitConvNumericCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteImplicitConvNumeric, WhiteImplicitConvNumericCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<WhiteImplicitConvNumeric, WhiteImplicitConvNumericCB>)sp;
    }
}
