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
import org.seasar.dbflute.exception.*;
import org.seasar.dbflute.optional.*;
import org.seasar.dbflute.outsidesql.executor.*;
import com.example.dbflute.mysql.dbflute.exbhv.*;
import com.example.dbflute.mysql.dbflute.exentity.*;
import com.example.dbflute.mysql.dbflute.bsentity.dbmeta.*;
import com.example.dbflute.mysql.dbflute.cbean.*;

/**
 * The behavior of WHITE_MYSELF as TABLE. <br />
 * <pre>
 * [primary key]
 *     MYSELF_ID
 *
 * [column]
 *     MYSELF_ID, MYSELF_NAME
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
 *     white_myself_check
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whiteMyselfCheckList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteMyselfBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_myself"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return WhiteMyselfDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteMyselfDbm getMyDBMeta() { return WhiteMyselfDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteMyself newMyEntity() { return new WhiteMyself(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteMyselfCB newMyConditionBean() { return new WhiteMyselfCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteMyselfCB cb = new WhiteMyselfCB();
     * cb.query().setFoo...(value);
     * int count = whiteMyselfBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteMyself. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteMyselfCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteMyselfCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteMyselfCB cb) { // called by selectPage(cb)
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
     * Select the entity by the condition-bean. #beforejava8 <br />
     * <span style="color: #AD4747; font-size: 120%">The return might be null if no data, so you should have null check.</span> <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, use selectEntityWithDeletedCheck().</span>
     * <pre>
     * WhiteMyselfCB cb = new WhiteMyselfCB();
     * cb.query().setFoo...(value);
     * WhiteMyself whiteMyself = whiteMyselfBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (whiteMyself != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = whiteMyself.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteMyself. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteMyself selectEntity(WhiteMyselfCB cb) {
        return doSelectEntity(cb, WhiteMyself.class);
    }

    protected <ENTITY extends WhiteMyself> ENTITY doSelectEntity(WhiteMyselfCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, WhiteMyselfCB>() {
            public List<ENTITY> callbackSelectList(WhiteMyselfCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    protected <ENTITY extends WhiteMyself> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteMyselfCB cb, Class<ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * WhiteMyselfCB cb = new WhiteMyselfCB();
     * cb.query().setFoo...(value);
     * WhiteMyself whiteMyself = whiteMyselfBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteMyself.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteMyself. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteMyself selectEntityWithDeletedCheck(WhiteMyselfCB cb) {
        return doSelectEntityWithDeletedCheck(cb, WhiteMyself.class);
    }

    protected <ENTITY extends WhiteMyself> ENTITY doSelectEntityWithDeletedCheck(WhiteMyselfCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteMyselfCB>() {
            public List<ENTITY> callbackSelectList(WhiteMyselfCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param myselfId : PK, NotNull, INT(10). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteMyself selectByPKValue(Integer myselfId) {
        return doSelectByPK(myselfId, WhiteMyself.class);
    }

    protected <ENTITY extends WhiteMyself> ENTITY doSelectByPK(Integer myselfId, Class<ENTITY> entityType) {
        return doSelectEntity(xprepareCBAsPK(myselfId), entityType);
    }

    protected <ENTITY extends WhiteMyself> OptionalEntity<ENTITY> doSelectOptionalByPK(Integer myselfId, Class<ENTITY> entityType) {
        return createOptionalEntity(doSelectByPK(myselfId, entityType), myselfId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param myselfId : PK, NotNull, INT(10). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteMyself selectByPKValueWithDeletedCheck(Integer myselfId) {
        return doSelectByPKWithDeletedCheck(myselfId, WhiteMyself.class);
    }

    protected <ENTITY extends WhiteMyself> ENTITY doSelectByPKWithDeletedCheck(Integer myselfId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(myselfId), entityType);
    }

    protected WhiteMyselfCB xprepareCBAsPK(Integer myselfId) {
        assertObjectNotNull("myselfId", myselfId);
        WhiteMyselfCB cb = newMyConditionBean(); cb.acceptPrimaryKey(myselfId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteMyselfCB cb = new WhiteMyselfCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteMyself&gt; whiteMyselfList = whiteMyselfBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteMyself whiteMyself : whiteMyselfList) {
     *     ... = whiteMyself.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteMyself. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteMyself> selectList(WhiteMyselfCB cb) {
        return doSelectList(cb, WhiteMyself.class);
    }

    protected <ENTITY extends WhiteMyself> ListResultBean<ENTITY> doSelectList(WhiteMyselfCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, WhiteMyselfCB>() {
            public List<ENTITY> callbackSelectList(WhiteMyselfCB lcb, Class<ENTITY> ltp) { return delegateSelectList(lcb, ltp); } });
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
     * WhiteMyselfCB cb = new WhiteMyselfCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteMyself&gt; page = whiteMyselfBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteMyself whiteMyself : page) {
     *     ... = whiteMyself.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteMyself. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteMyself> selectPage(WhiteMyselfCB cb) {
        return doSelectPage(cb, WhiteMyself.class);
    }

    protected <ENTITY extends WhiteMyself> PagingResultBean<ENTITY> doSelectPage(WhiteMyselfCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, WhiteMyselfCB>() {
            public int callbackSelectCount(WhiteMyselfCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteMyselfCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * WhiteMyselfCB cb = new WhiteMyselfCB();
     * cb.query().setFoo...(value);
     * whiteMyselfBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteMyself&gt;() {
     *     public void handle(WhiteMyself entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteMyself. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteMyself. (NotNull)
     */
    public void selectCursor(WhiteMyselfCB cb, EntityRowHandler<WhiteMyself> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, WhiteMyself.class);
    }

    protected <ENTITY extends WhiteMyself> void doSelectCursor(WhiteMyselfCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, WhiteMyselfCB>() {
            public void callbackSelectCursor(WhiteMyselfCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(WhiteMyselfCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteMyselfBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteMyselfCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<WhiteMyselfCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends WhiteMyselfCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends WhiteMyselfCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
     * Load referrer of whiteMyselfCheckList by the set-upper of referrer. <br />
     * white_myself_check by MYSELF_ID, named 'whiteMyselfCheckList'.
     * <pre>
     * whiteMyselfBhv.<span style="color: #DD4747">loadWhiteMyselfCheckList</span>(whiteMyselfList, new ConditionBeanSetupper&lt;WhiteMyselfCheckCB&gt;() {
     *     public void setup(WhiteMyselfCheckCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (WhiteMyself whiteMyself : whiteMyselfList) {
     *     ... = whiteMyself.<span style="color: #DD4747">getWhiteMyselfCheckList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMyselfId_InScope(pkList);
     * cb.query().addOrderBy_MyselfId_Asc();
     * </pre>
     * @param whiteMyselfList The entity list of whiteMyself. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<WhiteMyselfCheck> loadWhiteMyselfCheckList(List<WhiteMyself> whiteMyselfList, ConditionBeanSetupper<WhiteMyselfCheckCB> setupper) {
        xassLRArg(whiteMyselfList, setupper);
        return doLoadWhiteMyselfCheckList(whiteMyselfList, new LoadReferrerOption<WhiteMyselfCheckCB, WhiteMyselfCheck>().xinit(setupper));
    }

    /**
     * Load referrer of whiteMyselfCheckList by the set-upper of referrer. <br />
     * white_myself_check by MYSELF_ID, named 'whiteMyselfCheckList'.
     * <pre>
     * whiteMyselfBhv.<span style="color: #DD4747">loadWhiteMyselfCheckList</span>(whiteMyselfList, new ConditionBeanSetupper&lt;WhiteMyselfCheckCB&gt;() {
     *     public void setup(WhiteMyselfCheckCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = whiteMyself.<span style="color: #DD4747">getWhiteMyselfCheckList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMyselfId_InScope(pkList);
     * cb.query().addOrderBy_MyselfId_Asc();
     * </pre>
     * @param whiteMyself The entity of whiteMyself. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<WhiteMyselfCheck> loadWhiteMyselfCheckList(WhiteMyself whiteMyself, ConditionBeanSetupper<WhiteMyselfCheckCB> setupper) {
        xassLRArg(whiteMyself, setupper);
        return doLoadWhiteMyselfCheckList(xnewLRLs(whiteMyself), new LoadReferrerOption<WhiteMyselfCheckCB, WhiteMyselfCheck>().xinit(setupper));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param whiteMyself The entity of whiteMyself. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<WhiteMyselfCheck> loadWhiteMyselfCheckList(WhiteMyself whiteMyself, LoadReferrerOption<WhiteMyselfCheckCB, WhiteMyselfCheck> loadReferrerOption) {
        xassLRArg(whiteMyself, loadReferrerOption);
        return loadWhiteMyselfCheckList(xnewLRLs(whiteMyself), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean setupper.} #beforejava8
     * @param whiteMyselfList The entity list of whiteMyself. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerLoader<WhiteMyselfCheck> loadWhiteMyselfCheckList(List<WhiteMyself> whiteMyselfList, LoadReferrerOption<WhiteMyselfCheckCB, WhiteMyselfCheck> loadReferrerOption) {
        xassLRArg(whiteMyselfList, loadReferrerOption);
        if (whiteMyselfList.isEmpty()) { return (NestedReferrerLoader<WhiteMyselfCheck>)EMPTY_LOADER; }
        return doLoadWhiteMyselfCheckList(whiteMyselfList, loadReferrerOption);
    }

    protected NestedReferrerLoader<WhiteMyselfCheck> doLoadWhiteMyselfCheckList(List<WhiteMyself> whiteMyselfList, LoadReferrerOption<WhiteMyselfCheckCB, WhiteMyselfCheck> option) {
        final WhiteMyselfCheckBhv referrerBhv = xgetBSFLR().select(WhiteMyselfCheckBhv.class);
        return helpLoadReferrerInternally(whiteMyselfList, option, new InternalLoadReferrerCallback<WhiteMyself, Integer, WhiteMyselfCheckCB, WhiteMyselfCheck>() {
            public Integer getPKVal(WhiteMyself et)
            { return et.getMyselfId(); }
            public void setRfLs(WhiteMyself et, List<WhiteMyselfCheck> ls)
            { et.setWhiteMyselfCheckList(ls); }
            public WhiteMyselfCheckCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(WhiteMyselfCheckCB cb, List<Integer> ls)
            { cb.query().setMyselfId_InScope(ls); }
            public void qyOdFKAsc(WhiteMyselfCheckCB cb) { cb.query().addOrderBy_MyselfId_Asc(); }
            public void spFKCol(WhiteMyselfCheckCB cb) { cb.specify().columnMyselfId(); }
            public List<WhiteMyselfCheck> selRfLs(WhiteMyselfCheckCB cb) { return referrerBhv.selectList(cb); }
            public Integer getFKVal(WhiteMyselfCheck re) { return re.getMyselfId(); }
            public void setlcEt(WhiteMyselfCheck re, WhiteMyself le)
            { re.setWhiteMyself(le); }
            public String getRfPrNm() { return "whiteMyselfCheckList"; }
        });
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key myselfId.
     * @param whiteMyselfList The list of whiteMyself. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractMyselfIdList(List<WhiteMyself> whiteMyselfList) {
        return helpExtractListInternally(whiteMyselfList, new InternalExtractCallback<WhiteMyself, Integer>() {
            public Integer getCV(WhiteMyself et) { return et.getMyselfId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteMyself whiteMyself = new WhiteMyself();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteMyself.setFoo...(value);
     * whiteMyself.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteMyself.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteMyself.set...;</span>
     * whiteMyselfBhv.<span style="color: #DD4747">insert</span>(whiteMyself);
     * ... = whiteMyself.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteMyself The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteMyself whiteMyself) {
        doInsert(whiteMyself, null);
    }

    protected void doInsert(WhiteMyself whiteMyself, InsertOption<WhiteMyselfCB> op) {
        assertObjectNotNull("whiteMyself", whiteMyself);
        prepareInsertOption(op);
        delegateInsert(whiteMyself, op);
    }

    protected void prepareInsertOption(InsertOption<WhiteMyselfCB> op) {
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
     * WhiteMyself whiteMyself = new WhiteMyself();
     * whiteMyself.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteMyself.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteMyself.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteMyself.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteMyself.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteMyselfBhv.<span style="color: #DD4747">update</span>(whiteMyself);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteMyself The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final WhiteMyself whiteMyself) {
        doUpdate(whiteMyself, null);
    }

    protected void doUpdate(WhiteMyself whiteMyself, final UpdateOption<WhiteMyselfCB> op) {
        assertObjectNotNull("whiteMyself", whiteMyself);
        prepareUpdateOption(op);
        helpUpdateInternally(whiteMyself, new InternalUpdateCallback<WhiteMyself>() {
            public int callbackDelegateUpdate(WhiteMyself et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhiteMyselfCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected WhiteMyselfCB createCBForVaryingUpdate() {
        WhiteMyselfCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected WhiteMyselfCB createCBForSpecifiedUpdate() {
        WhiteMyselfCB cb = newMyConditionBean();
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
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param whiteMyself The entity of insert or update target. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteMyself whiteMyself) {
        doInesrtOrUpdate(whiteMyself, null, null);
    }

    protected void doInesrtOrUpdate(WhiteMyself whiteMyself, final InsertOption<WhiteMyselfCB> iop, final UpdateOption<WhiteMyselfCB> uop) {
        helpInsertOrUpdateInternally(whiteMyself, new InternalInsertOrUpdateCallback<WhiteMyself, WhiteMyselfCB>() {
            public void callbackInsert(WhiteMyself et) { doInsert(et, iop); }
            public void callbackUpdate(WhiteMyself et) { doUpdate(et, uop); }
            public WhiteMyselfCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(WhiteMyselfCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<WhiteMyselfCB>();
            uop = uop != null ? uop : new UpdateOption<WhiteMyselfCB>();
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
     * WhiteMyself whiteMyself = new WhiteMyself();
     * whiteMyself.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteMyself.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteMyselfBhv.<span style="color: #DD4747">delete</span>(whiteMyself);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteMyself The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteMyself whiteMyself) {
        doDelete(whiteMyself, null);
    }

    protected void doDelete(WhiteMyself whiteMyself, final DeleteOption<WhiteMyselfCB> op) {
        assertObjectNotNull("whiteMyself", whiteMyself);
        prepareDeleteOption(op);
        helpDeleteInternally(whiteMyself, new InternalDeleteCallback<WhiteMyself>() {
            public int callbackDelegateDelete(WhiteMyself et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhiteMyselfCB> op) {
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
     * <p><span style="color: #DD4747; font-size: 120%">The columns of least common multiple are registered like this:</span></p>
     * <pre>
     * for (... : ...) {
     *     WhiteMyself whiteMyself = new WhiteMyself();
     *     whiteMyself.setFooName("foo");
     *     if (...) {
     *         whiteMyself.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteMyselfList.add(whiteMyself);
     * }
     * whiteMyselfBhv.<span style="color: #DD4747">batchInsert</span>(whiteMyselfList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteMyselfList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteMyself> whiteMyselfList) {
        InsertOption<WhiteMyselfCB> op = createInsertUpdateOption();
        return doBatchInsert(whiteMyselfList, op);
    }

    protected int[] doBatchInsert(List<WhiteMyself> whiteMyselfList, InsertOption<WhiteMyselfCB> op) {
        assertObjectNotNull("whiteMyselfList", whiteMyselfList);
        prepareBatchInsertOption(whiteMyselfList, op);
        return delegateBatchInsert(whiteMyselfList, op);
    }

    protected void prepareBatchInsertOption(List<WhiteMyself> whiteMyselfList, InsertOption<WhiteMyselfCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(whiteMyselfList);
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
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhiteMyself whiteMyself = new WhiteMyself();
     *     whiteMyself.setFooName("foo");
     *     if (...) {
     *         whiteMyself.setFooPrice(123);
     *     } else {
     *         whiteMyself.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteMyself.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteMyselfList.add(whiteMyself);
     * }
     * whiteMyselfBhv.<span style="color: #DD4747">batchUpdate</span>(whiteMyselfList);
     * </pre>
     * @param whiteMyselfList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteMyself> whiteMyselfList) {
        UpdateOption<WhiteMyselfCB> op = createPlainUpdateOption();
        return doBatchUpdate(whiteMyselfList, op);
    }

    protected int[] doBatchUpdate(List<WhiteMyself> whiteMyselfList, UpdateOption<WhiteMyselfCB> op) {
        assertObjectNotNull("whiteMyselfList", whiteMyselfList);
        prepareBatchUpdateOption(whiteMyselfList, op);
        return delegateBatchUpdate(whiteMyselfList, op);
    }

    protected void prepareBatchUpdateOption(List<WhiteMyself> whiteMyselfList, UpdateOption<WhiteMyselfCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(whiteMyselfList);
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
     * whiteMyselfBhv.<span style="color: #DD4747">batchUpdate</span>(whiteMyselfList, new SpecifyQuery<WhiteMyselfCB>() {
     *     public void specify(WhiteMyselfCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteMyselfBhv.<span style="color: #DD4747">batchUpdate</span>(whiteMyselfList, new SpecifyQuery<WhiteMyselfCB>() {
     *     public void specify(WhiteMyselfCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteMyselfList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteMyself> whiteMyselfList, SpecifyQuery<WhiteMyselfCB> updateColumnSpec) {
        return doBatchUpdate(whiteMyselfList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteMyselfList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteMyself> whiteMyselfList) {
        return doBatchDelete(whiteMyselfList, null);
    }

    protected int[] doBatchDelete(List<WhiteMyself> whiteMyselfList, DeleteOption<WhiteMyselfCB> op) {
        assertObjectNotNull("whiteMyselfList", whiteMyselfList);
        prepareDeleteOption(op);
        return delegateBatchDelete(whiteMyselfList, op);
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
     * whiteMyselfBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteMyself, WhiteMyselfCB&gt;() {
     *     public ConditionBean setup(whiteMyself entity, WhiteMyselfCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteMyself, WhiteMyselfCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteMyself, WhiteMyselfCB> sp, InsertOption<WhiteMyselfCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        WhiteMyself e = new WhiteMyself();
        WhiteMyselfCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected WhiteMyselfCB createCBForQueryInsert() {
        WhiteMyselfCB cb = newMyConditionBean();
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
     * WhiteMyself whiteMyself = new WhiteMyself();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteMyself.setPK...(value);</span>
     * whiteMyself.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteMyself.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteMyself.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteMyself.setVersionNo(value);</span>
     * WhiteMyselfCB cb = new WhiteMyselfCB();
     * cb.query().setFoo...(value);
     * whiteMyselfBhv.<span style="color: #DD4747">queryUpdate</span>(whiteMyself, cb);
     * </pre>
     * @param whiteMyself The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteMyself. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteMyself whiteMyself, WhiteMyselfCB cb) {
        return doQueryUpdate(whiteMyself, cb, null);
    }

    protected int doQueryUpdate(WhiteMyself whiteMyself, WhiteMyselfCB cb, UpdateOption<WhiteMyselfCB> op) {
        assertObjectNotNull("whiteMyself", whiteMyself); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(whiteMyself, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (WhiteMyselfCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (WhiteMyselfCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteMyselfCB cb = new WhiteMyselfCB();
     * cb.query().setFoo...(value);
     * whiteMyselfBhv.<span style="color: #DD4747">queryDelete</span>(whiteMyself, cb);
     * </pre>
     * @param cb The condition-bean of WhiteMyself. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteMyselfCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteMyselfCB cb, DeleteOption<WhiteMyselfCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((WhiteMyselfCB)cb); }
        else { return varyingQueryDelete((WhiteMyselfCB)cb, downcast(op)); }
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
     * WhiteMyself whiteMyself = new WhiteMyself();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteMyself.setFoo...(value);
     * whiteMyself.setBar...(value);
     * InsertOption<WhiteMyselfCB> option = new InsertOption<WhiteMyselfCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteMyselfBhv.<span style="color: #DD4747">varyingInsert</span>(whiteMyself, option);
     * ... = whiteMyself.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteMyself The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteMyself whiteMyself, InsertOption<WhiteMyselfCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteMyself, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteMyself whiteMyself = new WhiteMyself();
     * whiteMyself.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteMyself.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteMyself.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteMyselfCB&gt; option = new UpdateOption&lt;WhiteMyselfCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteMyselfCB&gt;() {
     *         public void specify(WhiteMyselfCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteMyselfBhv.<span style="color: #DD4747">varyingUpdate</span>(whiteMyself, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteMyself The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteMyself whiteMyself, UpdateOption<WhiteMyselfCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteMyself, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteMyself The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteMyself whiteMyself, InsertOption<WhiteMyselfCB> insertOption, UpdateOption<WhiteMyselfCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(whiteMyself, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteMyself The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteMyself whiteMyself, DeleteOption<WhiteMyselfCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteMyself, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteMyselfList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteMyself> whiteMyselfList, InsertOption<WhiteMyselfCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteMyselfList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteMyselfList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteMyself> whiteMyselfList, UpdateOption<WhiteMyselfCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteMyselfList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteMyselfList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteMyself> whiteMyselfList, DeleteOption<WhiteMyselfCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteMyselfList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteMyself, WhiteMyselfCB> setupper, InsertOption<WhiteMyselfCB> option) {
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
     * WhiteMyself whiteMyself = new WhiteMyself();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteMyself.setPK...(value);</span>
     * whiteMyself.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteMyself.setVersionNo(value);</span>
     * WhiteMyselfCB cb = new WhiteMyselfCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteMyselfCB&gt; option = new UpdateOption&lt;WhiteMyselfCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteMyselfCB&gt;() {
     *     public void specify(WhiteMyselfCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteMyselfBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteMyself, cb, option);
     * </pre>
     * @param whiteMyself The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteMyself. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteMyself whiteMyself, WhiteMyselfCB cb, UpdateOption<WhiteMyselfCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteMyself, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteMyself. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteMyselfCB cb, DeleteOption<WhiteMyselfCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteMyselfBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhiteMyselfCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhiteMyselfCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhiteMyself> void delegateSelectCursor(WhiteMyselfCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends WhiteMyself> List<ENTITY> delegateSelectList(WhiteMyselfCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhiteMyself et, InsertOption<WhiteMyselfCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(WhiteMyself et, UpdateOption<WhiteMyselfCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(WhiteMyself et, UpdateOption<WhiteMyselfCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(WhiteMyself et, DeleteOption<WhiteMyselfCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(WhiteMyself et, DeleteOption<WhiteMyselfCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<WhiteMyself> ls, InsertOption<WhiteMyselfCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhiteMyself> ls, UpdateOption<WhiteMyselfCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhiteMyself> ls, UpdateOption<WhiteMyselfCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhiteMyself> ls, DeleteOption<WhiteMyselfCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhiteMyself> ls, DeleteOption<WhiteMyselfCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhiteMyself et, WhiteMyselfCB inCB, ConditionBean resCB, InsertOption<WhiteMyselfCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhiteMyself et, WhiteMyselfCB cb, UpdateOption<WhiteMyselfCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(WhiteMyselfCB cb, DeleteOption<WhiteMyselfCB> op)
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
    protected WhiteMyself downcast(Entity et) {
        return helpEntityDowncastInternally(et, WhiteMyself.class);
    }

    protected WhiteMyselfCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, WhiteMyselfCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<WhiteMyself> downcast(List<? extends Entity> ls) {
        return (List<WhiteMyself>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteMyselfCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<WhiteMyselfCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteMyselfCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<WhiteMyselfCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteMyselfCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<WhiteMyselfCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteMyself, WhiteMyselfCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<WhiteMyself, WhiteMyselfCB>)sp;
    }
}
