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
 * The behavior of WHITE_UQ_REFERENCE as TABLE. <br />
 * <pre>
 * [primary key]
 *     UQ_REFERENCE_ID
 * 
 * [column]
 *     UQ_REFERENCE_ID, UQ_REFERENCE_CODE
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
 *     white_uq_reference_ref
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     whiteUqReferenceRefByFkToPkIdList, whiteUqReferenceRefByFkToUqCodeList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteUqReferenceBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_uq_reference"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return WhiteUqReferenceDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteUqReferenceDbm getMyDBMeta() { return WhiteUqReferenceDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteUqReference newMyEntity() { return new WhiteUqReference(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteUqReferenceCB newMyConditionBean() { return new WhiteUqReferenceCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteUqReferenceCB cb = new WhiteUqReferenceCB();
     * cb.query().setFoo...(value);
     * int count = whiteUqReferenceBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteUqReference. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteUqReferenceCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteUqReferenceCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteUqReferenceCB cb) { // called by selectPage(cb)
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
     * WhiteUqReferenceCB cb = new WhiteUqReferenceCB();
     * cb.query().setFoo...(value);
     * WhiteUqReference whiteUqReference = whiteUqReferenceBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (whiteUqReference != null) {
     *     ... = whiteUqReference.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteUqReference. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteUqReference selectEntity(WhiteUqReferenceCB cb) {
        return doSelectEntity(cb, WhiteUqReference.class);
    }

    protected <ENTITY extends WhiteUqReference> ENTITY doSelectEntity(final WhiteUqReferenceCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, entityType, new InternalSelectEntityCallback<ENTITY, WhiteUqReferenceCB>() {
            public List<ENTITY> callbackSelectList(WhiteUqReferenceCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * WhiteUqReferenceCB cb = new WhiteUqReferenceCB();
     * cb.query().setFoo...(value);
     * WhiteUqReference whiteUqReference = whiteUqReferenceBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteUqReference.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteUqReference. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteUqReference selectEntityWithDeletedCheck(WhiteUqReferenceCB cb) {
        return doSelectEntityWithDeletedCheck(cb, WhiteUqReference.class);
    }

    protected <ENTITY extends WhiteUqReference> ENTITY doSelectEntityWithDeletedCheck(final WhiteUqReferenceCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, entityType, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteUqReferenceCB>() {
            public List<ENTITY> callbackSelectList(WhiteUqReferenceCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param uqReferenceId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteUqReference selectByPKValue(Long uqReferenceId) {
        return doSelectByPKValue(uqReferenceId, WhiteUqReference.class);
    }

    protected <ENTITY extends WhiteUqReference> ENTITY doSelectByPKValue(Long uqReferenceId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(uqReferenceId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param uqReferenceId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteUqReference selectByPKValueWithDeletedCheck(Long uqReferenceId) {
        return doSelectByPKValueWithDeletedCheck(uqReferenceId, WhiteUqReference.class);
    }

    protected <ENTITY extends WhiteUqReference> ENTITY doSelectByPKValueWithDeletedCheck(Long uqReferenceId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(uqReferenceId), entityType);
    }

    private WhiteUqReferenceCB buildPKCB(Long uqReferenceId) {
        assertObjectNotNull("uqReferenceId", uqReferenceId);
        WhiteUqReferenceCB cb = newMyConditionBean();
        cb.query().setUqReferenceId_Equal(uqReferenceId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteUqReferenceCB cb = new WhiteUqReferenceCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteUqReference&gt; whiteUqReferenceList = whiteUqReferenceBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (WhiteUqReference whiteUqReference : whiteUqReferenceList) {
     *     ... = whiteUqReference.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteUqReference. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteUqReference> selectList(WhiteUqReferenceCB cb) {
        return doSelectList(cb, WhiteUqReference.class);
    }

    protected <ENTITY extends WhiteUqReference> ListResultBean<ENTITY> doSelectList(WhiteUqReferenceCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, WhiteUqReferenceCB>() {
            public List<ENTITY> callbackSelectList(WhiteUqReferenceCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * WhiteUqReferenceCB cb = new WhiteUqReferenceCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteUqReference&gt; page = whiteUqReferenceBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteUqReference whiteUqReference : page) {
     *     ... = whiteUqReference.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteUqReference. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteUqReference> selectPage(WhiteUqReferenceCB cb) {
        return doSelectPage(cb, WhiteUqReference.class);
    }

    protected <ENTITY extends WhiteUqReference> PagingResultBean<ENTITY> doSelectPage(WhiteUqReferenceCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, WhiteUqReferenceCB>() {
            public int callbackSelectCount(WhiteUqReferenceCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteUqReferenceCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * WhiteUqReferenceCB cb = new WhiteUqReferenceCB();
     * cb.query().setFoo...(value);
     * whiteUqReferenceBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteUqReference&gt;() {
     *     public void handle(WhiteUqReference entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteUqReference. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteUqReference. (NotNull)
     */
    public void selectCursor(WhiteUqReferenceCB cb, EntityRowHandler<WhiteUqReference> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, WhiteUqReference.class);
    }

    protected <ENTITY extends WhiteUqReference> void doSelectCursor(WhiteUqReferenceCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<WhiteUqReference>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        helpSelectCursorInternally(cb, entityRowHandler, entityType, new InternalSelectCursorCallback<ENTITY, WhiteUqReferenceCB>() {
            public void callbackSelectCursor(WhiteUqReferenceCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) { delegateSelectCursor(cb, entityRowHandler, entityType); }
            public List<ENTITY> callbackSelectList(WhiteUqReferenceCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteUqReferenceBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteUqReferenceCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (NullAllowed)
     */
    public <RESULT> SLFunction<WhiteUqReferenceCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends WhiteUqReferenceCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
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
     * @param whiteUqReference The entity of whiteUqReference. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadWhiteUqReferenceRefByFkToPkIdList(WhiteUqReference whiteUqReference, ConditionBeanSetupper<WhiteUqReferenceRefCB> conditionBeanSetupper) {
        xassLRArg(whiteUqReference, conditionBeanSetupper);
        loadWhiteUqReferenceRefByFkToPkIdList(xnewLRLs(whiteUqReference), conditionBeanSetupper);
    }
    /**
     * Load referrer of whiteUqReferenceRefByFkToPkIdList with the set-upper for condition-bean of referrer. <br />
     * white_uq_reference_ref by FK_TO_PK_ID, named 'whiteUqReferenceRefByFkToPkIdList'.
     * <pre>
     * whiteUqReferenceBhv.<span style="color: #FD4747">loadWhiteUqReferenceRefByFkToPkIdList</span>(whiteUqReferenceList, new ConditionBeanSetupper&lt;WhiteUqReferenceRefCB&gt;() {
     *     public void setup(WhiteUqReferenceRefCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (WhiteUqReference whiteUqReference : whiteUqReferenceList) {
     *     ... = whiteUqReference.<span style="color: #FD4747">getWhiteUqReferenceRefByFkToPkIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setFkToPkId_InScope(pkList);
     * cb.query().addOrderBy_FkToPkId_Asc();
     * </pre>
     * @param whiteUqReferenceList The entity list of whiteUqReference. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadWhiteUqReferenceRefByFkToPkIdList(List<WhiteUqReference> whiteUqReferenceList, ConditionBeanSetupper<WhiteUqReferenceRefCB> conditionBeanSetupper) {
        xassLRArg(whiteUqReferenceList, conditionBeanSetupper);
        loadWhiteUqReferenceRefByFkToPkIdList(whiteUqReferenceList, new LoadReferrerOption<WhiteUqReferenceRefCB, WhiteUqReferenceRef>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param whiteUqReference The entity of whiteUqReference. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadWhiteUqReferenceRefByFkToPkIdList(WhiteUqReference whiteUqReference, LoadReferrerOption<WhiteUqReferenceRefCB, WhiteUqReferenceRef> loadReferrerOption) {
        xassLRArg(whiteUqReference, loadReferrerOption);
        loadWhiteUqReferenceRefByFkToPkIdList(xnewLRLs(whiteUqReference), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param whiteUqReferenceList The entity list of whiteUqReference. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadWhiteUqReferenceRefByFkToPkIdList(List<WhiteUqReference> whiteUqReferenceList, LoadReferrerOption<WhiteUqReferenceRefCB, WhiteUqReferenceRef> loadReferrerOption) {
        xassLRArg(whiteUqReferenceList, loadReferrerOption);
        if (whiteUqReferenceList.isEmpty()) { return; }
        final WhiteUqReferenceRefBhv referrerBhv = xgetBSFLR().select(WhiteUqReferenceRefBhv.class);
        helpLoadReferrerInternally(whiteUqReferenceList, loadReferrerOption, new InternalLoadReferrerCallback<WhiteUqReference, Long, WhiteUqReferenceRefCB, WhiteUqReferenceRef>() {
            public Long getPKVal(WhiteUqReference e)
            { return e.getUqReferenceId(); }
            public void setRfLs(WhiteUqReference e, List<WhiteUqReferenceRef> ls)
            { e.setWhiteUqReferenceRefByFkToPkIdList(ls); }
            public WhiteUqReferenceRefCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(WhiteUqReferenceRefCB cb, List<Long> ls)
            { cb.query().setFkToPkId_InScope(ls); }
            public void qyOdFKAsc(WhiteUqReferenceRefCB cb) { cb.query().addOrderBy_FkToPkId_Asc(); }
            public void spFKCol(WhiteUqReferenceRefCB cb) { cb.specify().columnFkToPkId(); }
            public List<WhiteUqReferenceRef> selRfLs(WhiteUqReferenceRefCB cb) { return referrerBhv.selectList(cb); }
            public Long getFKVal(WhiteUqReferenceRef e) { return e.getFkToPkId(); }
            public void setlcEt(WhiteUqReferenceRef re, WhiteUqReference le)
            { re.setWhiteUqReferenceByFkToPkId(le); }
            public String getRfPrNm() { return "whiteUqReferenceRefByFkToPkIdList"; }
        });
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param whiteUqReference The entity of whiteUqReference. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadWhiteUqReferenceRefByFkToUqCodeList(WhiteUqReference whiteUqReference, ConditionBeanSetupper<WhiteUqReferenceRefCB> conditionBeanSetupper) {
        xassLRArg(whiteUqReference, conditionBeanSetupper);
        loadWhiteUqReferenceRefByFkToUqCodeList(xnewLRLs(whiteUqReference), conditionBeanSetupper);
    }
    /**
     * Load referrer of whiteUqReferenceRefByFkToUqCodeList with the set-upper for condition-bean of referrer. <br />
     * white_uq_reference_ref by FK_TO_UQ_CODE, named 'whiteUqReferenceRefByFkToUqCodeList'.
     * <pre>
     * whiteUqReferenceBhv.<span style="color: #FD4747">loadWhiteUqReferenceRefByFkToUqCodeList</span>(whiteUqReferenceList, new ConditionBeanSetupper&lt;WhiteUqReferenceRefCB&gt;() {
     *     public void setup(WhiteUqReferenceRefCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (WhiteUqReference whiteUqReference : whiteUqReferenceList) {
     *     ... = whiteUqReference.<span style="color: #FD4747">getWhiteUqReferenceRefByFkToUqCodeList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setFkToUqCode_InScope(pkList);
     * cb.query().addOrderBy_FkToUqCode_Asc();
     * </pre>
     * @param whiteUqReferenceList The entity list of whiteUqReference. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadWhiteUqReferenceRefByFkToUqCodeList(List<WhiteUqReference> whiteUqReferenceList, ConditionBeanSetupper<WhiteUqReferenceRefCB> conditionBeanSetupper) {
        xassLRArg(whiteUqReferenceList, conditionBeanSetupper);
        loadWhiteUqReferenceRefByFkToUqCodeList(whiteUqReferenceList, new LoadReferrerOption<WhiteUqReferenceRefCB, WhiteUqReferenceRef>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param whiteUqReference The entity of whiteUqReference. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadWhiteUqReferenceRefByFkToUqCodeList(WhiteUqReference whiteUqReference, LoadReferrerOption<WhiteUqReferenceRefCB, WhiteUqReferenceRef> loadReferrerOption) {
        xassLRArg(whiteUqReference, loadReferrerOption);
        loadWhiteUqReferenceRefByFkToUqCodeList(xnewLRLs(whiteUqReference), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param whiteUqReferenceList The entity list of whiteUqReference. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadWhiteUqReferenceRefByFkToUqCodeList(List<WhiteUqReference> whiteUqReferenceList, LoadReferrerOption<WhiteUqReferenceRefCB, WhiteUqReferenceRef> loadReferrerOption) {
        xassLRArg(whiteUqReferenceList, loadReferrerOption);
        if (whiteUqReferenceList.isEmpty()) { return; }
        final WhiteUqReferenceRefBhv referrerBhv = xgetBSFLR().select(WhiteUqReferenceRefBhv.class);
        helpLoadReferrerInternally(whiteUqReferenceList, loadReferrerOption, new InternalLoadReferrerCallback<WhiteUqReference, String, WhiteUqReferenceRefCB, WhiteUqReferenceRef>() {
            public String getPKVal(WhiteUqReference e)
            { return e.getUqReferenceCode(); }
            public void setRfLs(WhiteUqReference e, List<WhiteUqReferenceRef> ls)
            { e.setWhiteUqReferenceRefByFkToUqCodeList(ls); }
            public WhiteUqReferenceRefCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(WhiteUqReferenceRefCB cb, List<String> ls)
            { cb.query().setFkToUqCode_InScope(ls); }
            public void qyOdFKAsc(WhiteUqReferenceRefCB cb) { cb.query().addOrderBy_FkToUqCode_Asc(); }
            public void spFKCol(WhiteUqReferenceRefCB cb) { cb.specify().columnFkToUqCode(); }
            public List<WhiteUqReferenceRef> selRfLs(WhiteUqReferenceRefCB cb) { return referrerBhv.selectList(cb); }
            public String getFKVal(WhiteUqReferenceRef e) { return e.getFkToUqCode(); }
            public void setlcEt(WhiteUqReferenceRef re, WhiteUqReference le)
            { re.setWhiteUqReferenceByFkToUqCode(le); }
            public String getRfPrNm() { return "whiteUqReferenceRefByFkToUqCodeList"; }
        });
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key uqReferenceId.
     * @param whiteUqReferenceList The list of whiteUqReference. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractUqReferenceIdList(List<WhiteUqReference> whiteUqReferenceList) {
        return helpExtractListInternally(whiteUqReferenceList, new InternalExtractCallback<WhiteUqReference, Long>() {
            public Long getCV(WhiteUqReference e) { return e.getUqReferenceId(); }
        });
    }

    /**
     * Extract the value list of (single) unique key uqReferenceCode.
     * @param whiteUqReferenceList The list of whiteUqReference. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractUqReferenceCodeList(List<WhiteUqReference> whiteUqReferenceList) {
        return helpExtractListInternally(whiteUqReferenceList, new InternalExtractCallback<WhiteUqReference, String>() {
            public String getCV(WhiteUqReference e) { return e.getUqReferenceCode(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteUqReference whiteUqReference = new WhiteUqReference();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteUqReference.setFoo...(value);
     * whiteUqReference.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteUqReference.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteUqReference.set...;</span>
     * whiteUqReferenceBhv.<span style="color: #FD4747">insert</span>(whiteUqReference);
     * ... = whiteUqReference.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteUqReference The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteUqReference whiteUqReference) {
        doInsert(whiteUqReference, null);
    }

    protected void doInsert(WhiteUqReference whiteUqReference, InsertOption<WhiteUqReferenceCB> option) {
        assertObjectNotNull("whiteUqReference", whiteUqReference);
        prepareInsertOption(option);
        delegateInsert(whiteUqReference, option);
    }

    protected void prepareInsertOption(InsertOption<WhiteUqReferenceCB> option) {
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
     * WhiteUqReference whiteUqReference = new WhiteUqReference();
     * whiteUqReference.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteUqReference.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteUqReference.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteUqReference.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteUqReference.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteUqReferenceBhv.<span style="color: #FD4747">update</span>(whiteUqReference);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param whiteUqReference The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final WhiteUqReference whiteUqReference) {
        doUpdate(whiteUqReference, null);
    }

    protected void doUpdate(WhiteUqReference whiteUqReference, final UpdateOption<WhiteUqReferenceCB> option) {
        assertObjectNotNull("whiteUqReference", whiteUqReference);
        prepareUpdateOption(option);
        helpUpdateInternally(whiteUqReference, new InternalUpdateCallback<WhiteUqReference>() {
            public int callbackDelegateUpdate(WhiteUqReference entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhiteUqReferenceCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected WhiteUqReferenceCB createCBForVaryingUpdate() {
        WhiteUqReferenceCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected WhiteUqReferenceCB createCBForSpecifiedUpdate() {
        WhiteUqReferenceCB cb = newMyConditionBean();
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
     * @param whiteUqReference The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteUqReference whiteUqReference) {
        doInesrtOrUpdate(whiteUqReference, null, null);
    }

    protected void doInesrtOrUpdate(WhiteUqReference whiteUqReference, final InsertOption<WhiteUqReferenceCB> insertOption, final UpdateOption<WhiteUqReferenceCB> updateOption) {
        helpInsertOrUpdateInternally(whiteUqReference, new InternalInsertOrUpdateCallback<WhiteUqReference, WhiteUqReferenceCB>() {
            public void callbackInsert(WhiteUqReference entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(WhiteUqReference entity) { doUpdate(entity, updateOption); }
            public WhiteUqReferenceCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(WhiteUqReferenceCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<WhiteUqReferenceCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<WhiteUqReferenceCB>() : updateOption;
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
     * WhiteUqReference whiteUqReference = new WhiteUqReference();
     * whiteUqReference.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteUqReference.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteUqReferenceBhv.<span style="color: #FD4747">delete</span>(whiteUqReference);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param whiteUqReference The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteUqReference whiteUqReference) {
        doDelete(whiteUqReference, null);
    }

    protected void doDelete(WhiteUqReference whiteUqReference, final DeleteOption<WhiteUqReferenceCB> option) {
        assertObjectNotNull("whiteUqReference", whiteUqReference);
        prepareDeleteOption(option);
        helpDeleteInternally(whiteUqReference, new InternalDeleteCallback<WhiteUqReference>() {
            public int callbackDelegateDelete(WhiteUqReference entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhiteUqReferenceCB> option) {
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
     *     WhiteUqReference whiteUqReference = new WhiteUqReference();
     *     whiteUqReference.setFooName("foo");
     *     if (...) {
     *         whiteUqReference.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteUqReferenceList.add(whiteUqReference);
     * }
     * whiteUqReferenceBhv.<span style="color: #FD4747">batchInsert</span>(whiteUqReferenceList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteUqReferenceList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteUqReference> whiteUqReferenceList) {
        InsertOption<WhiteUqReferenceCB> option = createInsertUpdateOption();
        return doBatchInsert(whiteUqReferenceList, option);
    }

    protected int[] doBatchInsert(List<WhiteUqReference> whiteUqReferenceList, InsertOption<WhiteUqReferenceCB> option) {
        assertObjectNotNull("whiteUqReferenceList", whiteUqReferenceList);
        prepareBatchInsertOption(whiteUqReferenceList, option);
        return delegateBatchInsert(whiteUqReferenceList, option);
    }

    protected void prepareBatchInsertOption(List<WhiteUqReference> whiteUqReferenceList, InsertOption<WhiteUqReferenceCB> option) {
        option.xallowInsertColumnModifiedPropertiesFragmented();
        option.xacceptInsertColumnModifiedPropertiesIfNeeds(whiteUqReferenceList);
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
     *     WhiteUqReference whiteUqReference = new WhiteUqReference();
     *     whiteUqReference.setFooName("foo");
     *     if (...) {
     *         whiteUqReference.setFooPrice(123);
     *     } else {
     *         whiteUqReference.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteUqReference.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteUqReferenceList.add(whiteUqReference);
     * }
     * whiteUqReferenceBhv.<span style="color: #FD4747">batchUpdate</span>(whiteUqReferenceList);
     * </pre>
     * @param whiteUqReferenceList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteUqReference> whiteUqReferenceList) {
        UpdateOption<WhiteUqReferenceCB> option = createPlainUpdateOption();
        return doBatchUpdate(whiteUqReferenceList, option);
    }

    protected int[] doBatchUpdate(List<WhiteUqReference> whiteUqReferenceList, UpdateOption<WhiteUqReferenceCB> option) {
        assertObjectNotNull("whiteUqReferenceList", whiteUqReferenceList);
        prepareBatchUpdateOption(whiteUqReferenceList, option);
        return delegateBatchUpdate(whiteUqReferenceList, option);
    }

    protected void prepareBatchUpdateOption(List<WhiteUqReference> whiteUqReferenceList, UpdateOption<WhiteUqReferenceCB> option) {
        option.xacceptUpdateColumnModifiedPropertiesIfNeeds(whiteUqReferenceList);
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
     * whiteUqReferenceBhv.<span style="color: #FD4747">batchUpdate</span>(whiteUqReferenceList, new SpecifyQuery<WhiteUqReferenceCB>() {
     *     public void specify(WhiteUqReferenceCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span> 
     * whiteUqReferenceBhv.<span style="color: #FD4747">batchUpdate</span>(whiteUqReferenceList, new SpecifyQuery<WhiteUqReferenceCB>() {
     *     public void specify(WhiteUqReferenceCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteUqReferenceList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteUqReference> whiteUqReferenceList, SpecifyQuery<WhiteUqReferenceCB> updateColumnSpec) {
        return doBatchUpdate(whiteUqReferenceList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        return doLumpModify(ls, option);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteUqReferenceList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteUqReference> whiteUqReferenceList) {
        return doBatchDelete(whiteUqReferenceList, null);
    }

    protected int[] doBatchDelete(List<WhiteUqReference> whiteUqReferenceList, DeleteOption<WhiteUqReferenceCB> option) {
        assertObjectNotNull("whiteUqReferenceList", whiteUqReferenceList);
        prepareDeleteOption(option);
        return delegateBatchDelete(whiteUqReferenceList, option);
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
     * whiteUqReferenceBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteUqReference, WhiteUqReferenceCB&gt;() {
     *     public ConditionBean setup(whiteUqReference entity, WhiteUqReferenceCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteUqReference, WhiteUqReferenceCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteUqReference, WhiteUqReferenceCB> setupper, InsertOption<WhiteUqReferenceCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        WhiteUqReference entity = new WhiteUqReference();
        WhiteUqReferenceCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected WhiteUqReferenceCB createCBForQueryInsert() {
        WhiteUqReferenceCB cb = newMyConditionBean();
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
     * WhiteUqReference whiteUqReference = new WhiteUqReference();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteUqReference.setPK...(value);</span>
     * whiteUqReference.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteUqReference.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteUqReference.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteUqReference.setVersionNo(value);</span>
     * WhiteUqReferenceCB cb = new WhiteUqReferenceCB();
     * cb.query().setFoo...(value);
     * whiteUqReferenceBhv.<span style="color: #FD4747">queryUpdate</span>(whiteUqReference, cb);
     * </pre>
     * @param whiteUqReference The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteUqReference. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteUqReference whiteUqReference, WhiteUqReferenceCB cb) {
        return doQueryUpdate(whiteUqReference, cb, null);
    }

    protected int doQueryUpdate(WhiteUqReference whiteUqReference, WhiteUqReferenceCB cb, UpdateOption<WhiteUqReferenceCB> option) {
        assertObjectNotNull("whiteUqReference", whiteUqReference); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(whiteUqReference, cb, option) : 0;
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (WhiteUqReferenceCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (WhiteUqReferenceCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteUqReferenceCB cb = new WhiteUqReferenceCB();
     * cb.query().setFoo...(value);
     * whiteUqReferenceBhv.<span style="color: #FD4747">queryDelete</span>(whiteUqReference, cb);
     * </pre>
     * @param cb The condition-bean of WhiteUqReference. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteUqReferenceCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteUqReferenceCB cb, DeleteOption<WhiteUqReferenceCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, option) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((WhiteUqReferenceCB)cb); }
        else { return varyingQueryDelete((WhiteUqReferenceCB)cb, downcast(option)); }
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
     * WhiteUqReference whiteUqReference = new WhiteUqReference();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteUqReference.setFoo...(value);
     * whiteUqReference.setBar...(value);
     * InsertOption<WhiteUqReferenceCB> option = new InsertOption<WhiteUqReferenceCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteUqReferenceBhv.<span style="color: #FD4747">varyingInsert</span>(whiteUqReference, option);
     * ... = whiteUqReference.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteUqReference The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteUqReference whiteUqReference, InsertOption<WhiteUqReferenceCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteUqReference, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteUqReference whiteUqReference = new WhiteUqReference();
     * whiteUqReference.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteUqReference.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteUqReference.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteUqReferenceCB&gt; option = new UpdateOption&lt;WhiteUqReferenceCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteUqReferenceCB&gt;() {
     *         public void specify(WhiteUqReferenceCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteUqReferenceBhv.<span style="color: #FD4747">varyingUpdate</span>(whiteUqReference, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteUqReference The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteUqReference whiteUqReference, UpdateOption<WhiteUqReferenceCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteUqReference, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteUqReference The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteUqReference whiteUqReference, InsertOption<WhiteUqReferenceCB> insertOption, UpdateOption<WhiteUqReferenceCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(whiteUqReference, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteUqReference The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteUqReference whiteUqReference, DeleteOption<WhiteUqReferenceCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteUqReference, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteUqReferenceList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteUqReference> whiteUqReferenceList, InsertOption<WhiteUqReferenceCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteUqReferenceList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteUqReferenceList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteUqReference> whiteUqReferenceList, UpdateOption<WhiteUqReferenceCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteUqReferenceList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteUqReferenceList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteUqReference> whiteUqReferenceList, DeleteOption<WhiteUqReferenceCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteUqReferenceList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteUqReference, WhiteUqReferenceCB> setupper, InsertOption<WhiteUqReferenceCB> option) {
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
     * WhiteUqReference whiteUqReference = new WhiteUqReference();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteUqReference.setPK...(value);</span>
     * whiteUqReference.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteUqReference.setVersionNo(value);</span>
     * WhiteUqReferenceCB cb = new WhiteUqReferenceCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteUqReferenceCB&gt; option = new UpdateOption&lt;WhiteUqReferenceCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteUqReferenceCB&gt;() {
     *     public void specify(WhiteUqReferenceCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteUqReferenceBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(whiteUqReference, cb, option);
     * </pre>
     * @param whiteUqReference The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteUqReference. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteUqReference whiteUqReference, WhiteUqReferenceCB cb, UpdateOption<WhiteUqReferenceCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteUqReference, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteUqReference. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteUqReferenceCB cb, DeleteOption<WhiteUqReferenceCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteUqReferenceBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhiteUqReferenceCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhiteUqReferenceCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhiteUqReference> void delegateSelectCursor(WhiteUqReferenceCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends WhiteUqReference> List<ENTITY> delegateSelectList(WhiteUqReferenceCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhiteUqReference e, InsertOption<WhiteUqReferenceCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(WhiteUqReference e, UpdateOption<WhiteUqReferenceCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return delegateUpdateNonstrict(e, op); }
    protected int delegateUpdateNonstrict(WhiteUqReference e, UpdateOption<WhiteUqReferenceCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(WhiteUqReference e, DeleteOption<WhiteUqReferenceCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return delegateDeleteNonstrict(e, op); }
    protected int delegateDeleteNonstrict(WhiteUqReference e, DeleteOption<WhiteUqReferenceCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<WhiteUqReference> ls, InsertOption<WhiteUqReferenceCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhiteUqReference> ls, UpdateOption<WhiteUqReferenceCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhiteUqReference> ls, UpdateOption<WhiteUqReferenceCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhiteUqReference> ls, DeleteOption<WhiteUqReferenceCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhiteUqReference> ls, DeleteOption<WhiteUqReferenceCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhiteUqReference e, WhiteUqReferenceCB inCB, ConditionBean resCB, InsertOption<WhiteUqReferenceCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhiteUqReference e, WhiteUqReferenceCB cb, UpdateOption<WhiteUqReferenceCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(WhiteUqReferenceCB cb, DeleteOption<WhiteUqReferenceCB> op)
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
    protected WhiteUqReference downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, WhiteUqReference.class);
    }

    protected WhiteUqReferenceCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, WhiteUqReferenceCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<WhiteUqReference> downcast(List<? extends Entity> entityList) {
        return (List<WhiteUqReference>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteUqReferenceCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<WhiteUqReferenceCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteUqReferenceCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<WhiteUqReferenceCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteUqReferenceCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<WhiteUqReferenceCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteUqReference, WhiteUqReferenceCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<WhiteUqReference, WhiteUqReferenceCB>)option;
    }
}
