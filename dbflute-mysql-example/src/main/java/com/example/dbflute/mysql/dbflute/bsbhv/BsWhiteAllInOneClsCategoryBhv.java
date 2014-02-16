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
 * The behavior of WHITE_ALL_IN_ONE_CLS_CATEGORY as TABLE. <br />
 * <pre>
 * [primary key]
 *     CLS_CATEGORY_CODE
 *
 * [column]
 *     CLS_CATEGORY_CODE, CLS_CATEGORY_NAME, DESCRIPTION
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
 *     white_all_in_one_cls_element
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whiteAllInOneClsElementList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteAllInOneClsCategoryBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_all_in_one_cls_category"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return WhiteAllInOneClsCategoryDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteAllInOneClsCategoryDbm getMyDBMeta() { return WhiteAllInOneClsCategoryDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteAllInOneClsCategory newMyEntity() { return new WhiteAllInOneClsCategory(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteAllInOneClsCategoryCB newMyConditionBean() { return new WhiteAllInOneClsCategoryCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteAllInOneClsCategoryCB cb = new WhiteAllInOneClsCategoryCB();
     * cb.query().setFoo...(value);
     * int count = whiteAllInOneClsCategoryBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteAllInOneClsCategory. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteAllInOneClsCategoryCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteAllInOneClsCategoryCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteAllInOneClsCategoryCB cb) { // called by selectPage(cb)
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
     * WhiteAllInOneClsCategoryCB cb = new WhiteAllInOneClsCategoryCB();
     * cb.query().setFoo...(value);
     * WhiteAllInOneClsCategory whiteAllInOneClsCategory = whiteAllInOneClsCategoryBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (whiteAllInOneClsCategory != null) {
     *     ... = whiteAllInOneClsCategory.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteAllInOneClsCategory. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteAllInOneClsCategory selectEntity(WhiteAllInOneClsCategoryCB cb) {
        return doSelectEntity(cb, WhiteAllInOneClsCategory.class);
    }

    protected <ENTITY extends WhiteAllInOneClsCategory> ENTITY doSelectEntity(final WhiteAllInOneClsCategoryCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, WhiteAllInOneClsCategoryCB>() {
            public List<ENTITY> callbackSelectList(WhiteAllInOneClsCategoryCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * WhiteAllInOneClsCategoryCB cb = new WhiteAllInOneClsCategoryCB();
     * cb.query().setFoo...(value);
     * WhiteAllInOneClsCategory whiteAllInOneClsCategory = whiteAllInOneClsCategoryBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteAllInOneClsCategory.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteAllInOneClsCategory. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteAllInOneClsCategory selectEntityWithDeletedCheck(WhiteAllInOneClsCategoryCB cb) {
        return doSelectEntityWithDeletedCheck(cb, WhiteAllInOneClsCategory.class);
    }

    protected <ENTITY extends WhiteAllInOneClsCategory> ENTITY doSelectEntityWithDeletedCheck(final WhiteAllInOneClsCategoryCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteAllInOneClsCategoryCB>() {
            public List<ENTITY> callbackSelectList(WhiteAllInOneClsCategoryCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param clsCategoryCode The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteAllInOneClsCategory selectByPKValue(String clsCategoryCode) {
        return doSelectByPKValue(clsCategoryCode, WhiteAllInOneClsCategory.class);
    }

    protected <ENTITY extends WhiteAllInOneClsCategory> ENTITY doSelectByPKValue(String clsCategoryCode, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(clsCategoryCode), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param clsCategoryCode The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteAllInOneClsCategory selectByPKValueWithDeletedCheck(String clsCategoryCode) {
        return doSelectByPKValueWithDeletedCheck(clsCategoryCode, WhiteAllInOneClsCategory.class);
    }

    protected <ENTITY extends WhiteAllInOneClsCategory> ENTITY doSelectByPKValueWithDeletedCheck(String clsCategoryCode, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(clsCategoryCode), entityType);
    }

    private WhiteAllInOneClsCategoryCB buildPKCB(String clsCategoryCode) {
        assertObjectNotNull("clsCategoryCode", clsCategoryCode);
        WhiteAllInOneClsCategoryCB cb = newMyConditionBean();
        cb.query().setClsCategoryCode_Equal(clsCategoryCode);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteAllInOneClsCategoryCB cb = new WhiteAllInOneClsCategoryCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteAllInOneClsCategory&gt; whiteAllInOneClsCategoryList = whiteAllInOneClsCategoryBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (WhiteAllInOneClsCategory whiteAllInOneClsCategory : whiteAllInOneClsCategoryList) {
     *     ... = whiteAllInOneClsCategory.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteAllInOneClsCategory. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteAllInOneClsCategory> selectList(WhiteAllInOneClsCategoryCB cb) {
        return doSelectList(cb, WhiteAllInOneClsCategory.class);
    }

    protected <ENTITY extends WhiteAllInOneClsCategory> ListResultBean<ENTITY> doSelectList(WhiteAllInOneClsCategoryCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, WhiteAllInOneClsCategoryCB>() {
            public List<ENTITY> callbackSelectList(WhiteAllInOneClsCategoryCB cb, Class<ENTITY> tp) { return delegateSelectList(cb, tp); } });
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
     * WhiteAllInOneClsCategoryCB cb = new WhiteAllInOneClsCategoryCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteAllInOneClsCategory&gt; page = whiteAllInOneClsCategoryBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteAllInOneClsCategory whiteAllInOneClsCategory : page) {
     *     ... = whiteAllInOneClsCategory.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteAllInOneClsCategory. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteAllInOneClsCategory> selectPage(WhiteAllInOneClsCategoryCB cb) {
        return doSelectPage(cb, WhiteAllInOneClsCategory.class);
    }

    protected <ENTITY extends WhiteAllInOneClsCategory> PagingResultBean<ENTITY> doSelectPage(WhiteAllInOneClsCategoryCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, WhiteAllInOneClsCategoryCB>() {
            public int callbackSelectCount(WhiteAllInOneClsCategoryCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteAllInOneClsCategoryCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * WhiteAllInOneClsCategoryCB cb = new WhiteAllInOneClsCategoryCB();
     * cb.query().setFoo...(value);
     * whiteAllInOneClsCategoryBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteAllInOneClsCategory&gt;() {
     *     public void handle(WhiteAllInOneClsCategory entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteAllInOneClsCategory. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteAllInOneClsCategory. (NotNull)
     */
    public void selectCursor(WhiteAllInOneClsCategoryCB cb, EntityRowHandler<WhiteAllInOneClsCategory> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, WhiteAllInOneClsCategory.class);
    }

    protected <ENTITY extends WhiteAllInOneClsCategory> void doSelectCursor(WhiteAllInOneClsCategoryCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, WhiteAllInOneClsCategoryCB>() {
            public void callbackSelectCursor(WhiteAllInOneClsCategoryCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(WhiteAllInOneClsCategoryCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteAllInOneClsCategoryBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteAllInOneClsCategoryCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<WhiteAllInOneClsCategoryCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends WhiteAllInOneClsCategoryCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends WhiteAllInOneClsCategoryCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
     * @param whiteAllInOneClsCategory The entity of whiteAllInOneClsCategory. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadWhiteAllInOneClsElementList(WhiteAllInOneClsCategory whiteAllInOneClsCategory, ConditionBeanSetupper<WhiteAllInOneClsElementCB> conditionBeanSetupper) {
        xassLRArg(whiteAllInOneClsCategory, conditionBeanSetupper);
        loadWhiteAllInOneClsElementList(xnewLRLs(whiteAllInOneClsCategory), conditionBeanSetupper);
    }
    /**
     * Load referrer of whiteAllInOneClsElementList with the set-upper for condition-bean of referrer. <br />
     * white_all_in_one_cls_element by CLS_CATEGORY_CODE, named 'whiteAllInOneClsElementList'.
     * <pre>
     * whiteAllInOneClsCategoryBhv.<span style="color: #FD4747">loadWhiteAllInOneClsElementList</span>(whiteAllInOneClsCategoryList, new ConditionBeanSetupper&lt;WhiteAllInOneClsElementCB&gt;() {
     *     public void setup(WhiteAllInOneClsElementCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (WhiteAllInOneClsCategory whiteAllInOneClsCategory : whiteAllInOneClsCategoryList) {
     *     ... = whiteAllInOneClsCategory.<span style="color: #FD4747">getWhiteAllInOneClsElementList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setClsCategoryCode_InScope(pkList);
     * cb.query().addOrderBy_ClsCategoryCode_Asc();
     * </pre>
     * @param whiteAllInOneClsCategoryList The entity list of whiteAllInOneClsCategory. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadWhiteAllInOneClsElementList(List<WhiteAllInOneClsCategory> whiteAllInOneClsCategoryList, ConditionBeanSetupper<WhiteAllInOneClsElementCB> conditionBeanSetupper) {
        xassLRArg(whiteAllInOneClsCategoryList, conditionBeanSetupper);
        loadWhiteAllInOneClsElementList(whiteAllInOneClsCategoryList, new LoadReferrerOption<WhiteAllInOneClsElementCB, WhiteAllInOneClsElement>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param whiteAllInOneClsCategory The entity of whiteAllInOneClsCategory. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadWhiteAllInOneClsElementList(WhiteAllInOneClsCategory whiteAllInOneClsCategory, LoadReferrerOption<WhiteAllInOneClsElementCB, WhiteAllInOneClsElement> loadReferrerOption) {
        xassLRArg(whiteAllInOneClsCategory, loadReferrerOption);
        loadWhiteAllInOneClsElementList(xnewLRLs(whiteAllInOneClsCategory), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param whiteAllInOneClsCategoryList The entity list of whiteAllInOneClsCategory. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadWhiteAllInOneClsElementList(List<WhiteAllInOneClsCategory> whiteAllInOneClsCategoryList, LoadReferrerOption<WhiteAllInOneClsElementCB, WhiteAllInOneClsElement> loadReferrerOption) {
        xassLRArg(whiteAllInOneClsCategoryList, loadReferrerOption);
        if (whiteAllInOneClsCategoryList.isEmpty()) { return; }
        final WhiteAllInOneClsElementBhv referrerBhv = xgetBSFLR().select(WhiteAllInOneClsElementBhv.class);
        helpLoadReferrerInternally(whiteAllInOneClsCategoryList, loadReferrerOption, new InternalLoadReferrerCallback<WhiteAllInOneClsCategory, String, WhiteAllInOneClsElementCB, WhiteAllInOneClsElement>() {
            public String getPKVal(WhiteAllInOneClsCategory et)
            { return et.getClsCategoryCode(); }
            public void setRfLs(WhiteAllInOneClsCategory et, List<WhiteAllInOneClsElement> ls)
            { et.setWhiteAllInOneClsElementList(ls); }
            public WhiteAllInOneClsElementCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(WhiteAllInOneClsElementCB cb, List<String> ls)
            { cb.query().setClsCategoryCode_InScope(ls); }
            public void qyOdFKAsc(WhiteAllInOneClsElementCB cb) { cb.query().addOrderBy_ClsCategoryCode_Asc(); }
            public void spFKCol(WhiteAllInOneClsElementCB cb) { cb.specify().columnClsCategoryCode(); }
            public List<WhiteAllInOneClsElement> selRfLs(WhiteAllInOneClsElementCB cb) { return referrerBhv.selectList(cb); }
            public String getFKVal(WhiteAllInOneClsElement re) { return re.getClsCategoryCode(); }
            public void setlcEt(WhiteAllInOneClsElement re, WhiteAllInOneClsCategory le)
            { re.setWhiteAllInOneClsCategory(le); }
            public String getRfPrNm() { return "whiteAllInOneClsElementList"; }
        });
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key clsCategoryCode.
     * @param whiteAllInOneClsCategoryList The list of whiteAllInOneClsCategory. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractClsCategoryCodeList(List<WhiteAllInOneClsCategory> whiteAllInOneClsCategoryList) {
        return helpExtractListInternally(whiteAllInOneClsCategoryList, new InternalExtractCallback<WhiteAllInOneClsCategory, String>() {
            public String getCV(WhiteAllInOneClsCategory et) { return et.getClsCategoryCode(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteAllInOneClsCategory whiteAllInOneClsCategory = new WhiteAllInOneClsCategory();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteAllInOneClsCategory.setFoo...(value);
     * whiteAllInOneClsCategory.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsCategory.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsCategory.set...;</span>
     * whiteAllInOneClsCategoryBhv.<span style="color: #FD4747">insert</span>(whiteAllInOneClsCategory);
     * ... = whiteAllInOneClsCategory.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteAllInOneClsCategory The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteAllInOneClsCategory whiteAllInOneClsCategory) {
        doInsert(whiteAllInOneClsCategory, null);
    }

    protected void doInsert(WhiteAllInOneClsCategory whiteAllInOneClsCategory, InsertOption<WhiteAllInOneClsCategoryCB> op) {
        assertObjectNotNull("whiteAllInOneClsCategory", whiteAllInOneClsCategory);
        prepareInsertOption(op);
        delegateInsert(whiteAllInOneClsCategory, op);
    }

    protected void prepareInsertOption(InsertOption<WhiteAllInOneClsCategoryCB> op) {
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
     * WhiteAllInOneClsCategory whiteAllInOneClsCategory = new WhiteAllInOneClsCategory();
     * whiteAllInOneClsCategory.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteAllInOneClsCategory.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsCategory.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsCategory.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteAllInOneClsCategory.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteAllInOneClsCategoryBhv.<span style="color: #FD4747">update</span>(whiteAllInOneClsCategory);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteAllInOneClsCategory The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final WhiteAllInOneClsCategory whiteAllInOneClsCategory) {
        doUpdate(whiteAllInOneClsCategory, null);
    }

    protected void doUpdate(WhiteAllInOneClsCategory whiteAllInOneClsCategory, final UpdateOption<WhiteAllInOneClsCategoryCB> op) {
        assertObjectNotNull("whiteAllInOneClsCategory", whiteAllInOneClsCategory);
        prepareUpdateOption(op);
        helpUpdateInternally(whiteAllInOneClsCategory, new InternalUpdateCallback<WhiteAllInOneClsCategory>() {
            public int callbackDelegateUpdate(WhiteAllInOneClsCategory et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhiteAllInOneClsCategoryCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected WhiteAllInOneClsCategoryCB createCBForVaryingUpdate() {
        WhiteAllInOneClsCategoryCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected WhiteAllInOneClsCategoryCB createCBForSpecifiedUpdate() {
        WhiteAllInOneClsCategoryCB cb = newMyConditionBean();
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
     * @param whiteAllInOneClsCategory The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteAllInOneClsCategory whiteAllInOneClsCategory) {
        doInesrtOrUpdate(whiteAllInOneClsCategory, null, null);
    }

    protected void doInesrtOrUpdate(WhiteAllInOneClsCategory whiteAllInOneClsCategory, final InsertOption<WhiteAllInOneClsCategoryCB> iop, final UpdateOption<WhiteAllInOneClsCategoryCB> uop) {
        helpInsertOrUpdateInternally(whiteAllInOneClsCategory, new InternalInsertOrUpdateCallback<WhiteAllInOneClsCategory, WhiteAllInOneClsCategoryCB>() {
            public void callbackInsert(WhiteAllInOneClsCategory et) { doInsert(et, iop); }
            public void callbackUpdate(WhiteAllInOneClsCategory et) { doUpdate(et, uop); }
            public WhiteAllInOneClsCategoryCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(WhiteAllInOneClsCategoryCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<WhiteAllInOneClsCategoryCB>();
            uop = uop != null ? uop : new UpdateOption<WhiteAllInOneClsCategoryCB>();
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
     * WhiteAllInOneClsCategory whiteAllInOneClsCategory = new WhiteAllInOneClsCategory();
     * whiteAllInOneClsCategory.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteAllInOneClsCategory.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteAllInOneClsCategoryBhv.<span style="color: #FD4747">delete</span>(whiteAllInOneClsCategory);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteAllInOneClsCategory The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteAllInOneClsCategory whiteAllInOneClsCategory) {
        doDelete(whiteAllInOneClsCategory, null);
    }

    protected void doDelete(WhiteAllInOneClsCategory whiteAllInOneClsCategory, final DeleteOption<WhiteAllInOneClsCategoryCB> op) {
        assertObjectNotNull("whiteAllInOneClsCategory", whiteAllInOneClsCategory);
        prepareDeleteOption(op);
        helpDeleteInternally(whiteAllInOneClsCategory, new InternalDeleteCallback<WhiteAllInOneClsCategory>() {
            public int callbackDelegateDelete(WhiteAllInOneClsCategory et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhiteAllInOneClsCategoryCB> op) {
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
     *     WhiteAllInOneClsCategory whiteAllInOneClsCategory = new WhiteAllInOneClsCategory();
     *     whiteAllInOneClsCategory.setFooName("foo");
     *     if (...) {
     *         whiteAllInOneClsCategory.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteAllInOneClsCategoryList.add(whiteAllInOneClsCategory);
     * }
     * whiteAllInOneClsCategoryBhv.<span style="color: #FD4747">batchInsert</span>(whiteAllInOneClsCategoryList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteAllInOneClsCategoryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteAllInOneClsCategory> whiteAllInOneClsCategoryList) {
        InsertOption<WhiteAllInOneClsCategoryCB> op = createInsertUpdateOption();
        return doBatchInsert(whiteAllInOneClsCategoryList, op);
    }

    protected int[] doBatchInsert(List<WhiteAllInOneClsCategory> whiteAllInOneClsCategoryList, InsertOption<WhiteAllInOneClsCategoryCB> op) {
        assertObjectNotNull("whiteAllInOneClsCategoryList", whiteAllInOneClsCategoryList);
        prepareBatchInsertOption(whiteAllInOneClsCategoryList, op);
        return delegateBatchInsert(whiteAllInOneClsCategoryList, op);
    }

    protected void prepareBatchInsertOption(List<WhiteAllInOneClsCategory> whiteAllInOneClsCategoryList, InsertOption<WhiteAllInOneClsCategoryCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(whiteAllInOneClsCategoryList);
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
     *     WhiteAllInOneClsCategory whiteAllInOneClsCategory = new WhiteAllInOneClsCategory();
     *     whiteAllInOneClsCategory.setFooName("foo");
     *     if (...) {
     *         whiteAllInOneClsCategory.setFooPrice(123);
     *     } else {
     *         whiteAllInOneClsCategory.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteAllInOneClsCategory.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteAllInOneClsCategoryList.add(whiteAllInOneClsCategory);
     * }
     * whiteAllInOneClsCategoryBhv.<span style="color: #FD4747">batchUpdate</span>(whiteAllInOneClsCategoryList);
     * </pre>
     * @param whiteAllInOneClsCategoryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteAllInOneClsCategory> whiteAllInOneClsCategoryList) {
        UpdateOption<WhiteAllInOneClsCategoryCB> op = createPlainUpdateOption();
        return doBatchUpdate(whiteAllInOneClsCategoryList, op);
    }

    protected int[] doBatchUpdate(List<WhiteAllInOneClsCategory> whiteAllInOneClsCategoryList, UpdateOption<WhiteAllInOneClsCategoryCB> op) {
        assertObjectNotNull("whiteAllInOneClsCategoryList", whiteAllInOneClsCategoryList);
        prepareBatchUpdateOption(whiteAllInOneClsCategoryList, op);
        return delegateBatchUpdate(whiteAllInOneClsCategoryList, op);
    }

    protected void prepareBatchUpdateOption(List<WhiteAllInOneClsCategory> whiteAllInOneClsCategoryList, UpdateOption<WhiteAllInOneClsCategoryCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(whiteAllInOneClsCategoryList);
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
     * whiteAllInOneClsCategoryBhv.<span style="color: #FD4747">batchUpdate</span>(whiteAllInOneClsCategoryList, new SpecifyQuery<WhiteAllInOneClsCategoryCB>() {
     *     public void specify(WhiteAllInOneClsCategoryCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteAllInOneClsCategoryBhv.<span style="color: #FD4747">batchUpdate</span>(whiteAllInOneClsCategoryList, new SpecifyQuery<WhiteAllInOneClsCategoryCB>() {
     *     public void specify(WhiteAllInOneClsCategoryCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteAllInOneClsCategoryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteAllInOneClsCategory> whiteAllInOneClsCategoryList, SpecifyQuery<WhiteAllInOneClsCategoryCB> updateColumnSpec) {
        return doBatchUpdate(whiteAllInOneClsCategoryList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteAllInOneClsCategoryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteAllInOneClsCategory> whiteAllInOneClsCategoryList) {
        return doBatchDelete(whiteAllInOneClsCategoryList, null);
    }

    protected int[] doBatchDelete(List<WhiteAllInOneClsCategory> whiteAllInOneClsCategoryList, DeleteOption<WhiteAllInOneClsCategoryCB> op) {
        assertObjectNotNull("whiteAllInOneClsCategoryList", whiteAllInOneClsCategoryList);
        prepareDeleteOption(op);
        return delegateBatchDelete(whiteAllInOneClsCategoryList, op);
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
     * whiteAllInOneClsCategoryBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteAllInOneClsCategory, WhiteAllInOneClsCategoryCB&gt;() {
     *     public ConditionBean setup(whiteAllInOneClsCategory entity, WhiteAllInOneClsCategoryCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteAllInOneClsCategory, WhiteAllInOneClsCategoryCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteAllInOneClsCategory, WhiteAllInOneClsCategoryCB> sp, InsertOption<WhiteAllInOneClsCategoryCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        WhiteAllInOneClsCategory e = new WhiteAllInOneClsCategory();
        WhiteAllInOneClsCategoryCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected WhiteAllInOneClsCategoryCB createCBForQueryInsert() {
        WhiteAllInOneClsCategoryCB cb = newMyConditionBean();
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
     * WhiteAllInOneClsCategory whiteAllInOneClsCategory = new WhiteAllInOneClsCategory();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsCategory.setPK...(value);</span>
     * whiteAllInOneClsCategory.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsCategory.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsCategory.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsCategory.setVersionNo(value);</span>
     * WhiteAllInOneClsCategoryCB cb = new WhiteAllInOneClsCategoryCB();
     * cb.query().setFoo...(value);
     * whiteAllInOneClsCategoryBhv.<span style="color: #FD4747">queryUpdate</span>(whiteAllInOneClsCategory, cb);
     * </pre>
     * @param whiteAllInOneClsCategory The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteAllInOneClsCategory. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteAllInOneClsCategory whiteAllInOneClsCategory, WhiteAllInOneClsCategoryCB cb) {
        return doQueryUpdate(whiteAllInOneClsCategory, cb, null);
    }

    protected int doQueryUpdate(WhiteAllInOneClsCategory whiteAllInOneClsCategory, WhiteAllInOneClsCategoryCB cb, UpdateOption<WhiteAllInOneClsCategoryCB> op) {
        assertObjectNotNull("whiteAllInOneClsCategory", whiteAllInOneClsCategory); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(whiteAllInOneClsCategory, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (WhiteAllInOneClsCategoryCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (WhiteAllInOneClsCategoryCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteAllInOneClsCategoryCB cb = new WhiteAllInOneClsCategoryCB();
     * cb.query().setFoo...(value);
     * whiteAllInOneClsCategoryBhv.<span style="color: #FD4747">queryDelete</span>(whiteAllInOneClsCategory, cb);
     * </pre>
     * @param cb The condition-bean of WhiteAllInOneClsCategory. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteAllInOneClsCategoryCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteAllInOneClsCategoryCB cb, DeleteOption<WhiteAllInOneClsCategoryCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((WhiteAllInOneClsCategoryCB)cb); }
        else { return varyingQueryDelete((WhiteAllInOneClsCategoryCB)cb, downcast(op)); }
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
     * WhiteAllInOneClsCategory whiteAllInOneClsCategory = new WhiteAllInOneClsCategory();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteAllInOneClsCategory.setFoo...(value);
     * whiteAllInOneClsCategory.setBar...(value);
     * InsertOption<WhiteAllInOneClsCategoryCB> option = new InsertOption<WhiteAllInOneClsCategoryCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteAllInOneClsCategoryBhv.<span style="color: #FD4747">varyingInsert</span>(whiteAllInOneClsCategory, option);
     * ... = whiteAllInOneClsCategory.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteAllInOneClsCategory The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteAllInOneClsCategory whiteAllInOneClsCategory, InsertOption<WhiteAllInOneClsCategoryCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteAllInOneClsCategory, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteAllInOneClsCategory whiteAllInOneClsCategory = new WhiteAllInOneClsCategory();
     * whiteAllInOneClsCategory.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteAllInOneClsCategory.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteAllInOneClsCategory.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteAllInOneClsCategoryCB&gt; option = new UpdateOption&lt;WhiteAllInOneClsCategoryCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteAllInOneClsCategoryCB&gt;() {
     *         public void specify(WhiteAllInOneClsCategoryCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteAllInOneClsCategoryBhv.<span style="color: #FD4747">varyingUpdate</span>(whiteAllInOneClsCategory, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteAllInOneClsCategory The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteAllInOneClsCategory whiteAllInOneClsCategory, UpdateOption<WhiteAllInOneClsCategoryCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteAllInOneClsCategory, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteAllInOneClsCategory The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteAllInOneClsCategory whiteAllInOneClsCategory, InsertOption<WhiteAllInOneClsCategoryCB> insertOption, UpdateOption<WhiteAllInOneClsCategoryCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(whiteAllInOneClsCategory, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteAllInOneClsCategory The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteAllInOneClsCategory whiteAllInOneClsCategory, DeleteOption<WhiteAllInOneClsCategoryCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteAllInOneClsCategory, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteAllInOneClsCategoryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteAllInOneClsCategory> whiteAllInOneClsCategoryList, InsertOption<WhiteAllInOneClsCategoryCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteAllInOneClsCategoryList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteAllInOneClsCategoryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteAllInOneClsCategory> whiteAllInOneClsCategoryList, UpdateOption<WhiteAllInOneClsCategoryCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteAllInOneClsCategoryList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteAllInOneClsCategoryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteAllInOneClsCategory> whiteAllInOneClsCategoryList, DeleteOption<WhiteAllInOneClsCategoryCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteAllInOneClsCategoryList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteAllInOneClsCategory, WhiteAllInOneClsCategoryCB> setupper, InsertOption<WhiteAllInOneClsCategoryCB> option) {
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
     * WhiteAllInOneClsCategory whiteAllInOneClsCategory = new WhiteAllInOneClsCategory();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsCategory.setPK...(value);</span>
     * whiteAllInOneClsCategory.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteAllInOneClsCategory.setVersionNo(value);</span>
     * WhiteAllInOneClsCategoryCB cb = new WhiteAllInOneClsCategoryCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteAllInOneClsCategoryCB&gt; option = new UpdateOption&lt;WhiteAllInOneClsCategoryCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteAllInOneClsCategoryCB&gt;() {
     *     public void specify(WhiteAllInOneClsCategoryCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteAllInOneClsCategoryBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(whiteAllInOneClsCategory, cb, option);
     * </pre>
     * @param whiteAllInOneClsCategory The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteAllInOneClsCategory. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteAllInOneClsCategory whiteAllInOneClsCategory, WhiteAllInOneClsCategoryCB cb, UpdateOption<WhiteAllInOneClsCategoryCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteAllInOneClsCategory, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteAllInOneClsCategory. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteAllInOneClsCategoryCB cb, DeleteOption<WhiteAllInOneClsCategoryCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteAllInOneClsCategoryBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhiteAllInOneClsCategoryCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhiteAllInOneClsCategoryCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhiteAllInOneClsCategory> void delegateSelectCursor(WhiteAllInOneClsCategoryCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends WhiteAllInOneClsCategory> List<ENTITY> delegateSelectList(WhiteAllInOneClsCategoryCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhiteAllInOneClsCategory et, InsertOption<WhiteAllInOneClsCategoryCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(WhiteAllInOneClsCategory et, UpdateOption<WhiteAllInOneClsCategoryCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(WhiteAllInOneClsCategory et, UpdateOption<WhiteAllInOneClsCategoryCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(WhiteAllInOneClsCategory et, DeleteOption<WhiteAllInOneClsCategoryCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(WhiteAllInOneClsCategory et, DeleteOption<WhiteAllInOneClsCategoryCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<WhiteAllInOneClsCategory> ls, InsertOption<WhiteAllInOneClsCategoryCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhiteAllInOneClsCategory> ls, UpdateOption<WhiteAllInOneClsCategoryCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhiteAllInOneClsCategory> ls, UpdateOption<WhiteAllInOneClsCategoryCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhiteAllInOneClsCategory> ls, DeleteOption<WhiteAllInOneClsCategoryCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhiteAllInOneClsCategory> ls, DeleteOption<WhiteAllInOneClsCategoryCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhiteAllInOneClsCategory et, WhiteAllInOneClsCategoryCB inCB, ConditionBean resCB, InsertOption<WhiteAllInOneClsCategoryCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhiteAllInOneClsCategory et, WhiteAllInOneClsCategoryCB cb, UpdateOption<WhiteAllInOneClsCategoryCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(WhiteAllInOneClsCategoryCB cb, DeleteOption<WhiteAllInOneClsCategoryCB> op)
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
    protected WhiteAllInOneClsCategory downcast(Entity et) {
        return helpEntityDowncastInternally(et, WhiteAllInOneClsCategory.class);
    }

    protected WhiteAllInOneClsCategoryCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, WhiteAllInOneClsCategoryCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<WhiteAllInOneClsCategory> downcast(List<? extends Entity> ls) {
        return (List<WhiteAllInOneClsCategory>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteAllInOneClsCategoryCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<WhiteAllInOneClsCategoryCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteAllInOneClsCategoryCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<WhiteAllInOneClsCategoryCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteAllInOneClsCategoryCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<WhiteAllInOneClsCategoryCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteAllInOneClsCategory, WhiteAllInOneClsCategoryCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<WhiteAllInOneClsCategory, WhiteAllInOneClsCategoryCB>)sp;
    }
}
