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
 * The behavior of WHITE_IMPLICIT_CONV_INTEGER as TABLE. <br />
 * <pre>
 * [primary key]
 *     IMPLICIT_CONV_INTEGER_ID
 * 
 * [column]
 *     IMPLICIT_CONV_INTEGER_ID, IMPLICIT_CONV_NUMERIC_ID, IMPLICIT_CONV_STRING_ID, IMPLICIT_CONV_NAME
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
 *     WHITE_IMPLICIT_CONV_NUMERIC, WHITE_IMPLICIT_CONV_STRING
 * 
 * [referrer table]
 *     white_implicit_conv_numeric, white_implicit_conv_string
 * 
 * [foreign property]
 *     whiteImplicitConvNumeric, whiteImplicitConvString
 * 
 * [referrer property]
 *     whiteImplicitConvNumericList, whiteImplicitConvStringList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteImplicitConvIntegerBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_implicit_conv_integer"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return WhiteImplicitConvIntegerDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteImplicitConvIntegerDbm getMyDBMeta() { return WhiteImplicitConvIntegerDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteImplicitConvInteger newMyEntity() { return new WhiteImplicitConvInteger(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteImplicitConvIntegerCB newMyConditionBean() { return new WhiteImplicitConvIntegerCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteImplicitConvIntegerCB cb = new WhiteImplicitConvIntegerCB();
     * cb.query().setFoo...(value);
     * int count = whiteImplicitConvIntegerBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteImplicitConvInteger. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteImplicitConvIntegerCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteImplicitConvIntegerCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteImplicitConvIntegerCB cb) { // called by selectPage(cb)
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
     * WhiteImplicitConvIntegerCB cb = new WhiteImplicitConvIntegerCB();
     * cb.query().setFoo...(value);
     * WhiteImplicitConvInteger whiteImplicitConvInteger = whiteImplicitConvIntegerBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (whiteImplicitConvInteger != null) {
     *     ... = whiteImplicitConvInteger.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteImplicitConvInteger. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteImplicitConvInteger selectEntity(WhiteImplicitConvIntegerCB cb) {
        return doSelectEntity(cb, WhiteImplicitConvInteger.class);
    }

    protected <ENTITY extends WhiteImplicitConvInteger> ENTITY doSelectEntity(final WhiteImplicitConvIntegerCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, entityType, new InternalSelectEntityCallback<ENTITY, WhiteImplicitConvIntegerCB>() {
            public List<ENTITY> callbackSelectList(WhiteImplicitConvIntegerCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * WhiteImplicitConvIntegerCB cb = new WhiteImplicitConvIntegerCB();
     * cb.query().setFoo...(value);
     * WhiteImplicitConvInteger whiteImplicitConvInteger = whiteImplicitConvIntegerBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteImplicitConvInteger.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteImplicitConvInteger. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteImplicitConvInteger selectEntityWithDeletedCheck(WhiteImplicitConvIntegerCB cb) {
        return doSelectEntityWithDeletedCheck(cb, WhiteImplicitConvInteger.class);
    }

    protected <ENTITY extends WhiteImplicitConvInteger> ENTITY doSelectEntityWithDeletedCheck(final WhiteImplicitConvIntegerCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, entityType, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteImplicitConvIntegerCB>() {
            public List<ENTITY> callbackSelectList(WhiteImplicitConvIntegerCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param implicitConvIntegerId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteImplicitConvInteger selectByPKValue(Integer implicitConvIntegerId) {
        return doSelectByPKValue(implicitConvIntegerId, WhiteImplicitConvInteger.class);
    }

    protected <ENTITY extends WhiteImplicitConvInteger> ENTITY doSelectByPKValue(Integer implicitConvIntegerId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(implicitConvIntegerId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param implicitConvIntegerId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteImplicitConvInteger selectByPKValueWithDeletedCheck(Integer implicitConvIntegerId) {
        return doSelectByPKValueWithDeletedCheck(implicitConvIntegerId, WhiteImplicitConvInteger.class);
    }

    protected <ENTITY extends WhiteImplicitConvInteger> ENTITY doSelectByPKValueWithDeletedCheck(Integer implicitConvIntegerId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(implicitConvIntegerId), entityType);
    }

    private WhiteImplicitConvIntegerCB buildPKCB(Integer implicitConvIntegerId) {
        assertObjectNotNull("implicitConvIntegerId", implicitConvIntegerId);
        WhiteImplicitConvIntegerCB cb = newMyConditionBean();
        cb.query().setImplicitConvIntegerId_Equal(implicitConvIntegerId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteImplicitConvIntegerCB cb = new WhiteImplicitConvIntegerCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteImplicitConvInteger&gt; whiteImplicitConvIntegerList = whiteImplicitConvIntegerBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (WhiteImplicitConvInteger whiteImplicitConvInteger : whiteImplicitConvIntegerList) {
     *     ... = whiteImplicitConvInteger.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteImplicitConvInteger. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteImplicitConvInteger> selectList(WhiteImplicitConvIntegerCB cb) {
        return doSelectList(cb, WhiteImplicitConvInteger.class);
    }

    protected <ENTITY extends WhiteImplicitConvInteger> ListResultBean<ENTITY> doSelectList(WhiteImplicitConvIntegerCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, WhiteImplicitConvIntegerCB>() {
            public List<ENTITY> callbackSelectList(WhiteImplicitConvIntegerCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * WhiteImplicitConvIntegerCB cb = new WhiteImplicitConvIntegerCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteImplicitConvInteger&gt; page = whiteImplicitConvIntegerBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteImplicitConvInteger whiteImplicitConvInteger : page) {
     *     ... = whiteImplicitConvInteger.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteImplicitConvInteger. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteImplicitConvInteger> selectPage(WhiteImplicitConvIntegerCB cb) {
        return doSelectPage(cb, WhiteImplicitConvInteger.class);
    }

    protected <ENTITY extends WhiteImplicitConvInteger> PagingResultBean<ENTITY> doSelectPage(WhiteImplicitConvIntegerCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, WhiteImplicitConvIntegerCB>() {
            public int callbackSelectCount(WhiteImplicitConvIntegerCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteImplicitConvIntegerCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * WhiteImplicitConvIntegerCB cb = new WhiteImplicitConvIntegerCB();
     * cb.query().setFoo...(value);
     * whiteImplicitConvIntegerBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteImplicitConvInteger&gt;() {
     *     public void handle(WhiteImplicitConvInteger entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteImplicitConvInteger. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteImplicitConvInteger. (NotNull)
     */
    public void selectCursor(WhiteImplicitConvIntegerCB cb, EntityRowHandler<WhiteImplicitConvInteger> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, WhiteImplicitConvInteger.class);
    }

    protected <ENTITY extends WhiteImplicitConvInteger> void doSelectCursor(WhiteImplicitConvIntegerCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<WhiteImplicitConvInteger>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        helpSelectCursorInternally(cb, entityRowHandler, entityType, new InternalSelectCursorCallback<ENTITY, WhiteImplicitConvIntegerCB>() {
            public void callbackSelectCursor(WhiteImplicitConvIntegerCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) { delegateSelectCursor(cb, entityRowHandler, entityType); }
            public List<ENTITY> callbackSelectList(WhiteImplicitConvIntegerCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteImplicitConvIntegerBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteImplicitConvIntegerCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (NullAllowed)
     */
    public <RESULT> SLFunction<WhiteImplicitConvIntegerCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends WhiteImplicitConvIntegerCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
        assertObjectNotNull("resultType", resultType); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return new SLFunction<CB, RESULT>(cb, resultType);
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
     * @param whiteImplicitConvInteger The entity of whiteImplicitConvInteger. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadWhiteImplicitConvNumericList(WhiteImplicitConvInteger whiteImplicitConvInteger, ConditionBeanSetupper<WhiteImplicitConvNumericCB> conditionBeanSetupper) {
        xassLRArg(whiteImplicitConvInteger, conditionBeanSetupper);
        loadWhiteImplicitConvNumericList(xnewLRLs(whiteImplicitConvInteger), conditionBeanSetupper);
    }
    /**
     * Load referrer of whiteImplicitConvNumericList with the set-upper for condition-bean of referrer. <br />
     * white_implicit_conv_numeric by IMPLICIT_CONV_INTEGER_ID, named 'whiteImplicitConvNumericList'.
     * <pre>
     * whiteImplicitConvIntegerBhv.<span style="color: #FD4747">loadWhiteImplicitConvNumericList</span>(whiteImplicitConvIntegerList, new ConditionBeanSetupper&lt;WhiteImplicitConvNumericCB&gt;() {
     *     public void setup(WhiteImplicitConvNumericCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (WhiteImplicitConvInteger whiteImplicitConvInteger : whiteImplicitConvIntegerList) {
     *     ... = whiteImplicitConvInteger.<span style="color: #FD4747">getWhiteImplicitConvNumericList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setImplicitConvIntegerId_InScope(pkList);
     * cb.query().addOrderBy_ImplicitConvIntegerId_Asc();
     * </pre>
     * @param whiteImplicitConvIntegerList The entity list of whiteImplicitConvInteger. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadWhiteImplicitConvNumericList(List<WhiteImplicitConvInteger> whiteImplicitConvIntegerList, ConditionBeanSetupper<WhiteImplicitConvNumericCB> conditionBeanSetupper) {
        xassLRArg(whiteImplicitConvIntegerList, conditionBeanSetupper);
        loadWhiteImplicitConvNumericList(whiteImplicitConvIntegerList, new LoadReferrerOption<WhiteImplicitConvNumericCB, WhiteImplicitConvNumeric>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param whiteImplicitConvInteger The entity of whiteImplicitConvInteger. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadWhiteImplicitConvNumericList(WhiteImplicitConvInteger whiteImplicitConvInteger, LoadReferrerOption<WhiteImplicitConvNumericCB, WhiteImplicitConvNumeric> loadReferrerOption) {
        xassLRArg(whiteImplicitConvInteger, loadReferrerOption);
        loadWhiteImplicitConvNumericList(xnewLRLs(whiteImplicitConvInteger), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param whiteImplicitConvIntegerList The entity list of whiteImplicitConvInteger. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadWhiteImplicitConvNumericList(List<WhiteImplicitConvInteger> whiteImplicitConvIntegerList, LoadReferrerOption<WhiteImplicitConvNumericCB, WhiteImplicitConvNumeric> loadReferrerOption) {
        xassLRArg(whiteImplicitConvIntegerList, loadReferrerOption);
        if (whiteImplicitConvIntegerList.isEmpty()) { return; }
        final WhiteImplicitConvNumericBhv referrerBhv = xgetBSFLR().select(WhiteImplicitConvNumericBhv.class);
        helpLoadReferrerInternally(whiteImplicitConvIntegerList, loadReferrerOption, new InternalLoadReferrerCallback<WhiteImplicitConvInteger, java.math.BigDecimal, WhiteImplicitConvNumericCB, WhiteImplicitConvNumeric>() {
            public java.math.BigDecimal getPKVal(WhiteImplicitConvInteger e)
            { if (e.getImplicitConvIntegerId() == null) { return null; }
              return new java.math.BigDecimal(e.getImplicitConvIntegerId().toString()); }
            public void setRfLs(WhiteImplicitConvInteger e, List<WhiteImplicitConvNumeric> ls)
            { e.setWhiteImplicitConvNumericList(ls); }
            public WhiteImplicitConvNumericCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(WhiteImplicitConvNumericCB cb, List<java.math.BigDecimal> ls)
            { cb.query().setImplicitConvIntegerId_InScope(ls); }
            public void qyOdFKAsc(WhiteImplicitConvNumericCB cb) { cb.query().addOrderBy_ImplicitConvIntegerId_Asc(); }
            public void spFKCol(WhiteImplicitConvNumericCB cb) { cb.specify().columnImplicitConvIntegerId(); }
            public List<WhiteImplicitConvNumeric> selRfLs(WhiteImplicitConvNumericCB cb) { return referrerBhv.selectList(cb); }
            public java.math.BigDecimal getFKVal(WhiteImplicitConvNumeric e) { return e.getImplicitConvIntegerId(); }
            public void setlcEt(WhiteImplicitConvNumeric re, WhiteImplicitConvInteger le)
            { re.setWhiteImplicitConvInteger(le); }
            public String getRfPrNm() { return "whiteImplicitConvNumericList"; }
        });
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param whiteImplicitConvInteger The entity of whiteImplicitConvInteger. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadWhiteImplicitConvStringList(WhiteImplicitConvInteger whiteImplicitConvInteger, ConditionBeanSetupper<WhiteImplicitConvStringCB> conditionBeanSetupper) {
        xassLRArg(whiteImplicitConvInteger, conditionBeanSetupper);
        loadWhiteImplicitConvStringList(xnewLRLs(whiteImplicitConvInteger), conditionBeanSetupper);
    }
    /**
     * Load referrer of whiteImplicitConvStringList with the set-upper for condition-bean of referrer. <br />
     * white_implicit_conv_string by IMPLICIT_CONV_INTEGER_ID, named 'whiteImplicitConvStringList'.
     * <pre>
     * whiteImplicitConvIntegerBhv.<span style="color: #FD4747">loadWhiteImplicitConvStringList</span>(whiteImplicitConvIntegerList, new ConditionBeanSetupper&lt;WhiteImplicitConvStringCB&gt;() {
     *     public void setup(WhiteImplicitConvStringCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (WhiteImplicitConvInteger whiteImplicitConvInteger : whiteImplicitConvIntegerList) {
     *     ... = whiteImplicitConvInteger.<span style="color: #FD4747">getWhiteImplicitConvStringList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setImplicitConvIntegerId_InScope(pkList);
     * cb.query().addOrderBy_ImplicitConvIntegerId_Asc();
     * </pre>
     * @param whiteImplicitConvIntegerList The entity list of whiteImplicitConvInteger. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadWhiteImplicitConvStringList(List<WhiteImplicitConvInteger> whiteImplicitConvIntegerList, ConditionBeanSetupper<WhiteImplicitConvStringCB> conditionBeanSetupper) {
        xassLRArg(whiteImplicitConvIntegerList, conditionBeanSetupper);
        loadWhiteImplicitConvStringList(whiteImplicitConvIntegerList, new LoadReferrerOption<WhiteImplicitConvStringCB, WhiteImplicitConvString>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param whiteImplicitConvInteger The entity of whiteImplicitConvInteger. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadWhiteImplicitConvStringList(WhiteImplicitConvInteger whiteImplicitConvInteger, LoadReferrerOption<WhiteImplicitConvStringCB, WhiteImplicitConvString> loadReferrerOption) {
        xassLRArg(whiteImplicitConvInteger, loadReferrerOption);
        loadWhiteImplicitConvStringList(xnewLRLs(whiteImplicitConvInteger), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param whiteImplicitConvIntegerList The entity list of whiteImplicitConvInteger. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadWhiteImplicitConvStringList(List<WhiteImplicitConvInteger> whiteImplicitConvIntegerList, LoadReferrerOption<WhiteImplicitConvStringCB, WhiteImplicitConvString> loadReferrerOption) {
        xassLRArg(whiteImplicitConvIntegerList, loadReferrerOption);
        if (whiteImplicitConvIntegerList.isEmpty()) { return; }
        final WhiteImplicitConvStringBhv referrerBhv = xgetBSFLR().select(WhiteImplicitConvStringBhv.class);
        helpLoadReferrerInternally(whiteImplicitConvIntegerList, loadReferrerOption, new InternalLoadReferrerCallback<WhiteImplicitConvInteger, String, WhiteImplicitConvStringCB, WhiteImplicitConvString>() {
            public String getPKVal(WhiteImplicitConvInteger e)
            { if (e.getImplicitConvIntegerId() == null) { return null; }
              return e.getImplicitConvIntegerId().toString(); }
            public void setRfLs(WhiteImplicitConvInteger e, List<WhiteImplicitConvString> ls)
            { e.setWhiteImplicitConvStringList(ls); }
            public WhiteImplicitConvStringCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(WhiteImplicitConvStringCB cb, List<String> ls)
            { cb.query().setImplicitConvIntegerId_InScope(ls); }
            public void qyOdFKAsc(WhiteImplicitConvStringCB cb) { cb.query().addOrderBy_ImplicitConvIntegerId_Asc(); }
            public void spFKCol(WhiteImplicitConvStringCB cb) { cb.specify().columnImplicitConvIntegerId(); }
            public List<WhiteImplicitConvString> selRfLs(WhiteImplicitConvStringCB cb) { return referrerBhv.selectList(cb); }
            public String getFKVal(WhiteImplicitConvString e) { return e.getImplicitConvIntegerId(); }
            public void setlcEt(WhiteImplicitConvString re, WhiteImplicitConvInteger le)
            { re.setWhiteImplicitConvInteger(le); }
            public String getRfPrNm() { return "whiteImplicitConvStringList"; }
        });
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'WhiteImplicitConvNumeric'.
     * @param whiteImplicitConvIntegerList The list of whiteImplicitConvInteger. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteImplicitConvNumeric> pulloutWhiteImplicitConvNumeric(List<WhiteImplicitConvInteger> whiteImplicitConvIntegerList) {
        return helpPulloutInternally(whiteImplicitConvIntegerList, new InternalPulloutCallback<WhiteImplicitConvInteger, WhiteImplicitConvNumeric>() {
            public WhiteImplicitConvNumeric getFr(WhiteImplicitConvInteger e) { return e.getWhiteImplicitConvNumeric(); }
            public boolean hasRf() { return true; }
            public void setRfLs(WhiteImplicitConvNumeric e, List<WhiteImplicitConvInteger> ls)
            { e.setWhiteImplicitConvIntegerList(ls); }
        });
    }
    /**
     * Pull out the list of foreign table 'WhiteImplicitConvString'.
     * @param whiteImplicitConvIntegerList The list of whiteImplicitConvInteger. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteImplicitConvString> pulloutWhiteImplicitConvString(List<WhiteImplicitConvInteger> whiteImplicitConvIntegerList) {
        return helpPulloutInternally(whiteImplicitConvIntegerList, new InternalPulloutCallback<WhiteImplicitConvInteger, WhiteImplicitConvString>() {
            public WhiteImplicitConvString getFr(WhiteImplicitConvInteger e) { return e.getWhiteImplicitConvString(); }
            public boolean hasRf() { return true; }
            public void setRfLs(WhiteImplicitConvString e, List<WhiteImplicitConvInteger> ls)
            { e.setWhiteImplicitConvIntegerList(ls); }
        });
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key implicitConvIntegerId.
     * @param whiteImplicitConvIntegerList The list of whiteImplicitConvInteger. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractImplicitConvIntegerIdList(List<WhiteImplicitConvInteger> whiteImplicitConvIntegerList) {
        return helpExtractListInternally(whiteImplicitConvIntegerList, new InternalExtractCallback<WhiteImplicitConvInteger, Integer>() {
            public Integer getCV(WhiteImplicitConvInteger e) { return e.getImplicitConvIntegerId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteImplicitConvInteger whiteImplicitConvInteger = new WhiteImplicitConvInteger();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteImplicitConvInteger.setFoo...(value);
     * whiteImplicitConvInteger.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvInteger.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvInteger.set...;</span>
     * whiteImplicitConvIntegerBhv.<span style="color: #FD4747">insert</span>(whiteImplicitConvInteger);
     * ... = whiteImplicitConvInteger.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteImplicitConvInteger The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteImplicitConvInteger whiteImplicitConvInteger) {
        doInsert(whiteImplicitConvInteger, null);
    }

    protected void doInsert(WhiteImplicitConvInteger whiteImplicitConvInteger, InsertOption<WhiteImplicitConvIntegerCB> option) {
        assertObjectNotNull("whiteImplicitConvInteger", whiteImplicitConvInteger);
        prepareInsertOption(option);
        delegateInsert(whiteImplicitConvInteger, option);
    }

    protected void prepareInsertOption(InsertOption<WhiteImplicitConvIntegerCB> option) {
        if (option == null) { return; }
        assertInsertOptionStatus(option);
        if (option.hasSpecifiedInsertColumn()) {
            option.resolveInsertColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    @Override
    protected void doCreate(Entity entity, InsertOption<? extends ConditionBean> option) {
        if (option == null) { insert(downcast(entity)); }
        else { varyingInsert(downcast(entity), downcast(option)); }
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteImplicitConvInteger whiteImplicitConvInteger = new WhiteImplicitConvInteger();
     * whiteImplicitConvInteger.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteImplicitConvInteger.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvInteger.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvInteger.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteImplicitConvInteger.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteImplicitConvIntegerBhv.<span style="color: #FD4747">update</span>(whiteImplicitConvInteger);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param whiteImplicitConvInteger The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final WhiteImplicitConvInteger whiteImplicitConvInteger) {
        doUpdate(whiteImplicitConvInteger, null);
    }

    protected void doUpdate(WhiteImplicitConvInteger whiteImplicitConvInteger, final UpdateOption<WhiteImplicitConvIntegerCB> option) {
        assertObjectNotNull("whiteImplicitConvInteger", whiteImplicitConvInteger);
        prepareUpdateOption(option);
        helpUpdateInternally(whiteImplicitConvInteger, new InternalUpdateCallback<WhiteImplicitConvInteger>() {
            public int callbackDelegateUpdate(WhiteImplicitConvInteger entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhiteImplicitConvIntegerCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected WhiteImplicitConvIntegerCB createCBForVaryingUpdate() {
        WhiteImplicitConvIntegerCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected WhiteImplicitConvIntegerCB createCBForSpecifiedUpdate() {
        WhiteImplicitConvIntegerCB cb = newMyConditionBean();
        cb.xsetupForSpecifiedUpdate();
        return cb;
    }

    @Override
    protected void doModify(Entity entity, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { update(downcast(entity)); }
        else { varyingUpdate(downcast(entity), downcast(option)); }
    }

    @Override
    protected void doModifyNonstrict(Entity entity, UpdateOption<? extends ConditionBean> option) {
        doModify(entity, option);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #FD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param whiteImplicitConvInteger The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteImplicitConvInteger whiteImplicitConvInteger) {
        doInesrtOrUpdate(whiteImplicitConvInteger, null, null);
    }

    protected void doInesrtOrUpdate(WhiteImplicitConvInteger whiteImplicitConvInteger, final InsertOption<WhiteImplicitConvIntegerCB> insertOption, final UpdateOption<WhiteImplicitConvIntegerCB> updateOption) {
        helpInsertOrUpdateInternally(whiteImplicitConvInteger, new InternalInsertOrUpdateCallback<WhiteImplicitConvInteger, WhiteImplicitConvIntegerCB>() {
            public void callbackInsert(WhiteImplicitConvInteger entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(WhiteImplicitConvInteger entity) { doUpdate(entity, updateOption); }
            public WhiteImplicitConvIntegerCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(WhiteImplicitConvIntegerCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<WhiteImplicitConvIntegerCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<WhiteImplicitConvIntegerCB>() : updateOption;
            varyingInsertOrUpdate(downcast(entity), downcast(insertOption), downcast(updateOption));
        }
    }

    @Override
    protected void doCreateOrModifyNonstrict(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        doCreateOrModify(entity, insertOption, updateOption);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteImplicitConvInteger whiteImplicitConvInteger = new WhiteImplicitConvInteger();
     * whiteImplicitConvInteger.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteImplicitConvInteger.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteImplicitConvIntegerBhv.<span style="color: #FD4747">delete</span>(whiteImplicitConvInteger);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param whiteImplicitConvInteger The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteImplicitConvInteger whiteImplicitConvInteger) {
        doDelete(whiteImplicitConvInteger, null);
    }

    protected void doDelete(WhiteImplicitConvInteger whiteImplicitConvInteger, final DeleteOption<WhiteImplicitConvIntegerCB> option) {
        assertObjectNotNull("whiteImplicitConvInteger", whiteImplicitConvInteger);
        prepareDeleteOption(option);
        helpDeleteInternally(whiteImplicitConvInteger, new InternalDeleteCallback<WhiteImplicitConvInteger>() {
            public int callbackDelegateDelete(WhiteImplicitConvInteger entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhiteImplicitConvIntegerCB> option) {
        if (option == null) { return; }
        assertDeleteOptionStatus(option);
    }

    @Override
    protected void doRemove(Entity entity, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { delete(downcast(entity)); }
        else { varyingDelete(downcast(entity), downcast(option)); }
    }

    @Override
    protected void doRemoveNonstrict(Entity entity, DeleteOption<? extends ConditionBean> option) {
        doRemove(entity, option);
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
     *     WhiteImplicitConvInteger whiteImplicitConvInteger = new WhiteImplicitConvInteger();
     *     whiteImplicitConvInteger.setFooName("foo");
     *     if (...) {
     *         whiteImplicitConvInteger.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteImplicitConvIntegerList.add(whiteImplicitConvInteger);
     * }
     * whiteImplicitConvIntegerBhv.<span style="color: #FD4747">batchInsert</span>(whiteImplicitConvIntegerList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteImplicitConvIntegerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteImplicitConvInteger> whiteImplicitConvIntegerList) {
        InsertOption<WhiteImplicitConvIntegerCB> option = createInsertUpdateOption();
        return doBatchInsert(whiteImplicitConvIntegerList, option);
    }

    protected int[] doBatchInsert(List<WhiteImplicitConvInteger> whiteImplicitConvIntegerList, InsertOption<WhiteImplicitConvIntegerCB> option) {
        assertObjectNotNull("whiteImplicitConvIntegerList", whiteImplicitConvIntegerList);
        prepareBatchInsertOption(whiteImplicitConvIntegerList, option);
        return delegateBatchInsert(whiteImplicitConvIntegerList, option);
    }

    protected void prepareBatchInsertOption(List<WhiteImplicitConvInteger> whiteImplicitConvIntegerList, InsertOption<WhiteImplicitConvIntegerCB> option) {
        option.xallowInsertColumnModifiedPropertiesFragmented();
        option.xacceptInsertColumnModifiedPropertiesIfNeeds(whiteImplicitConvIntegerList);
        prepareInsertOption(option);
    }

    @Override
    protected int[] doLumpCreate(List<Entity> ls, InsertOption<? extends ConditionBean> option) {
        if (option == null) { return batchInsert(downcast(ls)); }
        else { return varyingBatchInsert(downcast(ls), downcast(option)); }
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #FD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhiteImplicitConvInteger whiteImplicitConvInteger = new WhiteImplicitConvInteger();
     *     whiteImplicitConvInteger.setFooName("foo");
     *     if (...) {
     *         whiteImplicitConvInteger.setFooPrice(123);
     *     } else {
     *         whiteImplicitConvInteger.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteImplicitConvInteger.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteImplicitConvIntegerList.add(whiteImplicitConvInteger);
     * }
     * whiteImplicitConvIntegerBhv.<span style="color: #FD4747">batchUpdate</span>(whiteImplicitConvIntegerList);
     * </pre>
     * @param whiteImplicitConvIntegerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteImplicitConvInteger> whiteImplicitConvIntegerList) {
        UpdateOption<WhiteImplicitConvIntegerCB> option = createPlainUpdateOption();
        return doBatchUpdate(whiteImplicitConvIntegerList, option);
    }

    protected int[] doBatchUpdate(List<WhiteImplicitConvInteger> whiteImplicitConvIntegerList, UpdateOption<WhiteImplicitConvIntegerCB> option) {
        assertObjectNotNull("whiteImplicitConvIntegerList", whiteImplicitConvIntegerList);
        prepareBatchUpdateOption(whiteImplicitConvIntegerList, option);
        return delegateBatchUpdate(whiteImplicitConvIntegerList, option);
    }

    protected void prepareBatchUpdateOption(List<WhiteImplicitConvInteger> whiteImplicitConvIntegerList, UpdateOption<WhiteImplicitConvIntegerCB> option) {
        option.xacceptUpdateColumnModifiedPropertiesIfNeeds(whiteImplicitConvIntegerList);
        prepareUpdateOption(option);
    }

    @Override
    protected int[] doLumpModify(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return batchUpdate(downcast(ls)); }
        else { return varyingBatchUpdate(downcast(ls), downcast(option)); }
    }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span> 
     * whiteImplicitConvIntegerBhv.<span style="color: #FD4747">batchUpdate</span>(whiteImplicitConvIntegerList, new SpecifyQuery<WhiteImplicitConvIntegerCB>() {
     *     public void specify(WhiteImplicitConvIntegerCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span> 
     * whiteImplicitConvIntegerBhv.<span style="color: #FD4747">batchUpdate</span>(whiteImplicitConvIntegerList, new SpecifyQuery<WhiteImplicitConvIntegerCB>() {
     *     public void specify(WhiteImplicitConvIntegerCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteImplicitConvIntegerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteImplicitConvInteger> whiteImplicitConvIntegerList, SpecifyQuery<WhiteImplicitConvIntegerCB> updateColumnSpec) {
        return doBatchUpdate(whiteImplicitConvIntegerList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        return doLumpModify(ls, option);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteImplicitConvIntegerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteImplicitConvInteger> whiteImplicitConvIntegerList) {
        return doBatchDelete(whiteImplicitConvIntegerList, null);
    }

    protected int[] doBatchDelete(List<WhiteImplicitConvInteger> whiteImplicitConvIntegerList, DeleteOption<WhiteImplicitConvIntegerCB> option) {
        assertObjectNotNull("whiteImplicitConvIntegerList", whiteImplicitConvIntegerList);
        prepareDeleteOption(option);
        return delegateBatchDelete(whiteImplicitConvIntegerList, option);
    }

    @Override
    protected int[] doLumpRemove(List<Entity> ls, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return batchDelete(downcast(ls)); }
        else { return varyingBatchDelete(downcast(ls), downcast(option)); }
    }

    @Override
    protected int[] doLumpRemoveNonstrict(List<Entity> ls, DeleteOption<? extends ConditionBean> option) {
        return doLumpRemove(ls, option);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * whiteImplicitConvIntegerBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteImplicitConvInteger, WhiteImplicitConvIntegerCB&gt;() {
     *     public ConditionBean setup(whiteImplicitConvInteger entity, WhiteImplicitConvIntegerCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteImplicitConvInteger, WhiteImplicitConvIntegerCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteImplicitConvInteger, WhiteImplicitConvIntegerCB> setupper, InsertOption<WhiteImplicitConvIntegerCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        WhiteImplicitConvInteger entity = new WhiteImplicitConvInteger();
        WhiteImplicitConvIntegerCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected WhiteImplicitConvIntegerCB createCBForQueryInsert() {
        WhiteImplicitConvIntegerCB cb = newMyConditionBean();
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
     * WhiteImplicitConvInteger whiteImplicitConvInteger = new WhiteImplicitConvInteger();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvInteger.setPK...(value);</span>
     * whiteImplicitConvInteger.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvInteger.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvInteger.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvInteger.setVersionNo(value);</span>
     * WhiteImplicitConvIntegerCB cb = new WhiteImplicitConvIntegerCB();
     * cb.query().setFoo...(value);
     * whiteImplicitConvIntegerBhv.<span style="color: #FD4747">queryUpdate</span>(whiteImplicitConvInteger, cb);
     * </pre>
     * @param whiteImplicitConvInteger The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteImplicitConvInteger. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteImplicitConvInteger whiteImplicitConvInteger, WhiteImplicitConvIntegerCB cb) {
        return doQueryUpdate(whiteImplicitConvInteger, cb, null);
    }

    protected int doQueryUpdate(WhiteImplicitConvInteger whiteImplicitConvInteger, WhiteImplicitConvIntegerCB cb, UpdateOption<WhiteImplicitConvIntegerCB> option) {
        assertObjectNotNull("whiteImplicitConvInteger", whiteImplicitConvInteger); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(whiteImplicitConvInteger, cb, option) : 0;
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (WhiteImplicitConvIntegerCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (WhiteImplicitConvIntegerCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteImplicitConvIntegerCB cb = new WhiteImplicitConvIntegerCB();
     * cb.query().setFoo...(value);
     * whiteImplicitConvIntegerBhv.<span style="color: #FD4747">queryDelete</span>(whiteImplicitConvInteger, cb);
     * </pre>
     * @param cb The condition-bean of WhiteImplicitConvInteger. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteImplicitConvIntegerCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteImplicitConvIntegerCB cb, DeleteOption<WhiteImplicitConvIntegerCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, option) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((WhiteImplicitConvIntegerCB)cb); }
        else { return varyingQueryDelete((WhiteImplicitConvIntegerCB)cb, downcast(option)); }
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
     * WhiteImplicitConvInteger whiteImplicitConvInteger = new WhiteImplicitConvInteger();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteImplicitConvInteger.setFoo...(value);
     * whiteImplicitConvInteger.setBar...(value);
     * InsertOption<WhiteImplicitConvIntegerCB> option = new InsertOption<WhiteImplicitConvIntegerCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteImplicitConvIntegerBhv.<span style="color: #FD4747">varyingInsert</span>(whiteImplicitConvInteger, option);
     * ... = whiteImplicitConvInteger.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteImplicitConvInteger The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteImplicitConvInteger whiteImplicitConvInteger, InsertOption<WhiteImplicitConvIntegerCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteImplicitConvInteger, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteImplicitConvInteger whiteImplicitConvInteger = new WhiteImplicitConvInteger();
     * whiteImplicitConvInteger.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteImplicitConvInteger.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteImplicitConvInteger.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteImplicitConvIntegerCB&gt; option = new UpdateOption&lt;WhiteImplicitConvIntegerCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteImplicitConvIntegerCB&gt;() {
     *         public void specify(WhiteImplicitConvIntegerCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteImplicitConvIntegerBhv.<span style="color: #FD4747">varyingUpdate</span>(whiteImplicitConvInteger, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteImplicitConvInteger The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteImplicitConvInteger whiteImplicitConvInteger, UpdateOption<WhiteImplicitConvIntegerCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteImplicitConvInteger, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteImplicitConvInteger The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteImplicitConvInteger whiteImplicitConvInteger, InsertOption<WhiteImplicitConvIntegerCB> insertOption, UpdateOption<WhiteImplicitConvIntegerCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(whiteImplicitConvInteger, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteImplicitConvInteger The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteImplicitConvInteger whiteImplicitConvInteger, DeleteOption<WhiteImplicitConvIntegerCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteImplicitConvInteger, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteImplicitConvIntegerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteImplicitConvInteger> whiteImplicitConvIntegerList, InsertOption<WhiteImplicitConvIntegerCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteImplicitConvIntegerList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteImplicitConvIntegerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteImplicitConvInteger> whiteImplicitConvIntegerList, UpdateOption<WhiteImplicitConvIntegerCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteImplicitConvIntegerList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteImplicitConvIntegerList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteImplicitConvInteger> whiteImplicitConvIntegerList, DeleteOption<WhiteImplicitConvIntegerCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteImplicitConvIntegerList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteImplicitConvInteger, WhiteImplicitConvIntegerCB> setupper, InsertOption<WhiteImplicitConvIntegerCB> option) {
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
     * WhiteImplicitConvInteger whiteImplicitConvInteger = new WhiteImplicitConvInteger();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvInteger.setPK...(value);</span>
     * whiteImplicitConvInteger.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteImplicitConvInteger.setVersionNo(value);</span>
     * WhiteImplicitConvIntegerCB cb = new WhiteImplicitConvIntegerCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteImplicitConvIntegerCB&gt; option = new UpdateOption&lt;WhiteImplicitConvIntegerCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteImplicitConvIntegerCB&gt;() {
     *     public void specify(WhiteImplicitConvIntegerCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteImplicitConvIntegerBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(whiteImplicitConvInteger, cb, option);
     * </pre>
     * @param whiteImplicitConvInteger The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteImplicitConvInteger. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteImplicitConvInteger whiteImplicitConvInteger, WhiteImplicitConvIntegerCB cb, UpdateOption<WhiteImplicitConvIntegerCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteImplicitConvInteger, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteImplicitConvInteger. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteImplicitConvIntegerCB cb, DeleteOption<WhiteImplicitConvIntegerCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteImplicitConvIntegerBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhiteImplicitConvIntegerCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhiteImplicitConvIntegerCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhiteImplicitConvInteger> void delegateSelectCursor(WhiteImplicitConvIntegerCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends WhiteImplicitConvInteger> List<ENTITY> delegateSelectList(WhiteImplicitConvIntegerCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhiteImplicitConvInteger e, InsertOption<WhiteImplicitConvIntegerCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(WhiteImplicitConvInteger e, UpdateOption<WhiteImplicitConvIntegerCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return delegateUpdateNonstrict(e, op); }
    protected int delegateUpdateNonstrict(WhiteImplicitConvInteger e, UpdateOption<WhiteImplicitConvIntegerCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(WhiteImplicitConvInteger e, DeleteOption<WhiteImplicitConvIntegerCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return delegateDeleteNonstrict(e, op); }
    protected int delegateDeleteNonstrict(WhiteImplicitConvInteger e, DeleteOption<WhiteImplicitConvIntegerCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<WhiteImplicitConvInteger> ls, InsertOption<WhiteImplicitConvIntegerCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhiteImplicitConvInteger> ls, UpdateOption<WhiteImplicitConvIntegerCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhiteImplicitConvInteger> ls, UpdateOption<WhiteImplicitConvIntegerCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhiteImplicitConvInteger> ls, DeleteOption<WhiteImplicitConvIntegerCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhiteImplicitConvInteger> ls, DeleteOption<WhiteImplicitConvIntegerCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhiteImplicitConvInteger e, WhiteImplicitConvIntegerCB inCB, ConditionBean resCB, InsertOption<WhiteImplicitConvIntegerCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhiteImplicitConvInteger e, WhiteImplicitConvIntegerCB cb, UpdateOption<WhiteImplicitConvIntegerCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(WhiteImplicitConvIntegerCB cb, DeleteOption<WhiteImplicitConvIntegerCB> op)
    { if (!processBeforeQueryDelete(cb, op)) { return 0; } return invoke(createQueryDeleteCBCommand(cb, op));  }

    // ===================================================================================
    //                                                                Optimistic Lock Info
    //                                                                ====================
    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean hasVersionNoValue(Entity entity) {
        return false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean hasUpdateDateValue(Entity entity) {
        return false;
    }

    // ===================================================================================
    //                                                                     Downcast Helper
    //                                                                     ===============
    protected WhiteImplicitConvInteger downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, WhiteImplicitConvInteger.class);
    }

    protected WhiteImplicitConvIntegerCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, WhiteImplicitConvIntegerCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<WhiteImplicitConvInteger> downcast(List<? extends Entity> entityList) {
        return (List<WhiteImplicitConvInteger>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteImplicitConvIntegerCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<WhiteImplicitConvIntegerCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteImplicitConvIntegerCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<WhiteImplicitConvIntegerCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteImplicitConvIntegerCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<WhiteImplicitConvIntegerCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteImplicitConvInteger, WhiteImplicitConvIntegerCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<WhiteImplicitConvInteger, WhiteImplicitConvIntegerCB>)option;
    }
}
