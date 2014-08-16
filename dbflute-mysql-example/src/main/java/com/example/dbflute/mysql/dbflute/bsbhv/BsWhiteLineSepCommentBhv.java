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
import com.example.dbflute.mysql.dbflute.allcommon.CDef;
import com.example.dbflute.mysql.dbflute.exbhv.*;
import com.example.dbflute.mysql.dbflute.bsbhv.loader.*;
import com.example.dbflute.mysql.dbflute.exentity.*;
import com.example.dbflute.mysql.dbflute.bsentity.dbmeta.*;
import com.example.dbflute.mysql.dbflute.cbean.*;

/**
 * The behavior of WHITE_LINE_SEP_COMMENT as TABLE. <br />
 * <pre>
 * [primary key]
 *     LINE_SEP_COMMENT_CODE
 *
 * [column]
 *     LINE_SEP_COMMENT_CODE, LINE_SEP_COMMENT_NAME
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
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteLineSepCommentBhv extends AbstractBehaviorWritable<WhiteLineSepComment, WhiteLineSepCommentCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public DBMeta getDBMeta() { return WhiteLineSepCommentDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteLineSepCommentDbm getMyDBMeta() { return WhiteLineSepCommentDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhiteLineSepCommentCB newConditionBean() { return new WhiteLineSepCommentCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteLineSepComment newMyEntity() { return new WhiteLineSepComment(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteLineSepCommentCB newMyConditionBean() { return new WhiteLineSepCommentCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteLineSepCommentCB cb = new WhiteLineSepCommentCB();
     * cb.query().setFoo...(value);
     * int count = whiteLineSepCommentBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteLineSepComment. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteLineSepCommentCB cb) {
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
     * WhiteLineSepCommentCB cb = new WhiteLineSepCommentCB();
     * cb.query().setFoo...(value);
     * WhiteLineSepComment whiteLineSepComment = whiteLineSepCommentBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (whiteLineSepComment != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = whiteLineSepComment.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteLineSepComment. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteLineSepComment selectEntity(WhiteLineSepCommentCB cb) {
        return facadeSelectEntity(cb);
    }

    protected WhiteLineSepComment facadeSelectEntity(WhiteLineSepCommentCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteLineSepComment> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteLineSepCommentCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * WhiteLineSepCommentCB cb = new WhiteLineSepCommentCB();
     * cb.query().setFoo...(value);
     * WhiteLineSepComment whiteLineSepComment = whiteLineSepCommentBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteLineSepComment.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteLineSepComment. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteLineSepComment selectEntityWithDeletedCheck(WhiteLineSepCommentCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param lineSepCommentCode : PK, NotNull, CHAR(3), classification=LineSepCommentCls. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteLineSepComment selectByPKValue(CDef.LineSepCommentCls lineSepCommentCode) {
        return facadeSelectByPKValue(lineSepCommentCode);
    }

    protected WhiteLineSepComment facadeSelectByPKValue(CDef.LineSepCommentCls lineSepCommentCode) {
        return doSelectByPK(lineSepCommentCode, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteLineSepComment> ENTITY doSelectByPK(CDef.LineSepCommentCls lineSepCommentCode, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(lineSepCommentCode), tp);
    }

    protected <ENTITY extends WhiteLineSepComment> OptionalEntity<ENTITY> doSelectOptionalByPK(CDef.LineSepCommentCls lineSepCommentCode, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(lineSepCommentCode, tp), lineSepCommentCode);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param lineSepCommentCode : PK, NotNull, CHAR(3), classification=LineSepCommentCls. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteLineSepComment selectByPKValueWithDeletedCheck(CDef.LineSepCommentCls lineSepCommentCode) {
        return doSelectByPKWithDeletedCheck(lineSepCommentCode, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteLineSepComment> ENTITY doSelectByPKWithDeletedCheck(CDef.LineSepCommentCls lineSepCommentCode, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(lineSepCommentCode), tp);
    }

    protected WhiteLineSepCommentCB xprepareCBAsPK(CDef.LineSepCommentCls lineSepCommentCode) {
        assertObjectNotNull("lineSepCommentCode", lineSepCommentCode);
        return newConditionBean().acceptPK(lineSepCommentCode);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteLineSepCommentCB cb = new WhiteLineSepCommentCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteLineSepComment&gt; whiteLineSepCommentList = whiteLineSepCommentBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteLineSepComment whiteLineSepComment : whiteLineSepCommentList) {
     *     ... = whiteLineSepComment.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteLineSepComment. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteLineSepComment> selectList(WhiteLineSepCommentCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * WhiteLineSepCommentCB cb = new WhiteLineSepCommentCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteLineSepComment&gt; page = whiteLineSepCommentBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteLineSepComment whiteLineSepComment : page) {
     *     ... = whiteLineSepComment.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteLineSepComment. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteLineSepComment> selectPage(WhiteLineSepCommentCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteLineSepCommentCB cb = new WhiteLineSepCommentCB();
     * cb.query().setFoo...(value);
     * whiteLineSepCommentBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteLineSepComment&gt;() {
     *     public void handle(WhiteLineSepComment entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteLineSepComment. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteLineSepComment. (NotNull)
     */
    public void selectCursor(WhiteLineSepCommentCB cb, EntityRowHandler<WhiteLineSepComment> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteLineSepCommentBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteLineSepCommentCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhiteLineSepCommentCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param whiteLineSepCommentList The entity list of whiteLineSepComment. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhiteLineSepComment> whiteLineSepCommentList, ReferrerLoaderHandler<LoaderOfWhiteLineSepComment> handler) {
        xassLRArg(whiteLineSepCommentList, handler);
        handler.handle(new LoaderOfWhiteLineSepComment().ready(whiteLineSepCommentList, _behaviorSelector));
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
     * @param whiteLineSepComment The entity of whiteLineSepComment. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhiteLineSepComment whiteLineSepComment, ReferrerLoaderHandler<LoaderOfWhiteLineSepComment> handler) {
        xassLRArg(whiteLineSepComment, handler);
        handler.handle(new LoaderOfWhiteLineSepComment().ready(xnewLRAryLs(whiteLineSepComment), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key lineSepCommentCode.
     * @param whiteLineSepCommentList The list of whiteLineSepComment. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractLineSepCommentCodeList(List<WhiteLineSepComment> whiteLineSepCommentList)
    { return helpExtractListInternally(whiteLineSepCommentList, "lineSepCommentCode"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteLineSepComment whiteLineSepComment = new WhiteLineSepComment();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteLineSepComment.setFoo...(value);
     * whiteLineSepComment.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteLineSepComment.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteLineSepComment.set...;</span>
     * whiteLineSepCommentBhv.<span style="color: #DD4747">insert</span>(whiteLineSepComment);
     * ... = whiteLineSepComment.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteLineSepComment The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteLineSepComment whiteLineSepComment) {
        doInsert(whiteLineSepComment, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteLineSepComment whiteLineSepComment = new WhiteLineSepComment();
     * whiteLineSepComment.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteLineSepComment.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteLineSepComment.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteLineSepComment.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteLineSepComment.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteLineSepCommentBhv.<span style="color: #DD4747">update</span>(whiteLineSepComment);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteLineSepComment The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhiteLineSepComment whiteLineSepComment) {
        doUpdate(whiteLineSepComment, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param whiteLineSepComment The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteLineSepComment whiteLineSepComment) {
        doInsertOrUpdate(whiteLineSepComment, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteLineSepComment whiteLineSepComment = new WhiteLineSepComment();
     * whiteLineSepComment.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteLineSepComment.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteLineSepCommentBhv.<span style="color: #DD4747">delete</span>(whiteLineSepComment);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteLineSepComment The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteLineSepComment whiteLineSepComment) {
        doDelete(whiteLineSepComment, null);
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
     *     WhiteLineSepComment whiteLineSepComment = new WhiteLineSepComment();
     *     whiteLineSepComment.setFooName("foo");
     *     if (...) {
     *         whiteLineSepComment.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteLineSepCommentList.add(whiteLineSepComment);
     * }
     * whiteLineSepCommentBhv.<span style="color: #DD4747">batchInsert</span>(whiteLineSepCommentList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteLineSepCommentList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteLineSepComment> whiteLineSepCommentList) {
        return doBatchInsert(whiteLineSepCommentList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhiteLineSepComment whiteLineSepComment = new WhiteLineSepComment();
     *     whiteLineSepComment.setFooName("foo");
     *     if (...) {
     *         whiteLineSepComment.setFooPrice(123);
     *     } else {
     *         whiteLineSepComment.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteLineSepComment.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteLineSepCommentList.add(whiteLineSepComment);
     * }
     * whiteLineSepCommentBhv.<span style="color: #DD4747">batchUpdate</span>(whiteLineSepCommentList);
     * </pre>
     * @param whiteLineSepCommentList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteLineSepComment> whiteLineSepCommentList) {
        return doBatchUpdate(whiteLineSepCommentList, null);
    }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * whiteLineSepCommentBhv.<span style="color: #DD4747">batchUpdate</span>(whiteLineSepCommentList, new SpecifyQuery<WhiteLineSepCommentCB>() {
     *     public void specify(WhiteLineSepCommentCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteLineSepCommentBhv.<span style="color: #DD4747">batchUpdate</span>(whiteLineSepCommentList, new SpecifyQuery<WhiteLineSepCommentCB>() {
     *     public void specify(WhiteLineSepCommentCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteLineSepCommentList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteLineSepComment> whiteLineSepCommentList, SpecifyQuery<WhiteLineSepCommentCB> updateColumnSpec) {
        return doBatchUpdate(whiteLineSepCommentList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteLineSepCommentList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteLineSepComment> whiteLineSepCommentList) {
        return doBatchDelete(whiteLineSepCommentList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * whiteLineSepCommentBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteLineSepComment, WhiteLineSepCommentCB&gt;() {
     *     public ConditionBean setup(WhiteLineSepComment entity, WhiteLineSepCommentCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteLineSepComment, WhiteLineSepCommentCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteLineSepComment whiteLineSepComment = new WhiteLineSepComment();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteLineSepComment.setPK...(value);</span>
     * whiteLineSepComment.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteLineSepComment.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteLineSepComment.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteLineSepComment.setVersionNo(value);</span>
     * WhiteLineSepCommentCB cb = new WhiteLineSepCommentCB();
     * cb.query().setFoo...(value);
     * whiteLineSepCommentBhv.<span style="color: #DD4747">queryUpdate</span>(whiteLineSepComment, cb);
     * </pre>
     * @param whiteLineSepComment The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteLineSepComment. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteLineSepComment whiteLineSepComment, WhiteLineSepCommentCB cb) {
        return doQueryUpdate(whiteLineSepComment, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteLineSepCommentCB cb = new WhiteLineSepCommentCB();
     * cb.query().setFoo...(value);
     * whiteLineSepCommentBhv.<span style="color: #DD4747">queryDelete</span>(whiteLineSepComment, cb);
     * </pre>
     * @param cb The condition-bean of WhiteLineSepComment. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteLineSepCommentCB cb) {
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
     * WhiteLineSepComment whiteLineSepComment = new WhiteLineSepComment();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteLineSepComment.setFoo...(value);
     * whiteLineSepComment.setBar...(value);
     * InsertOption<WhiteLineSepCommentCB> option = new InsertOption<WhiteLineSepCommentCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteLineSepCommentBhv.<span style="color: #DD4747">varyingInsert</span>(whiteLineSepComment, option);
     * ... = whiteLineSepComment.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteLineSepComment The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteLineSepComment whiteLineSepComment, InsertOption<WhiteLineSepCommentCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteLineSepComment, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteLineSepComment whiteLineSepComment = new WhiteLineSepComment();
     * whiteLineSepComment.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteLineSepComment.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteLineSepComment.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteLineSepCommentCB&gt; option = new UpdateOption&lt;WhiteLineSepCommentCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteLineSepCommentCB&gt;() {
     *         public void specify(WhiteLineSepCommentCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteLineSepCommentBhv.<span style="color: #DD4747">varyingUpdate</span>(whiteLineSepComment, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteLineSepComment The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteLineSepComment whiteLineSepComment, UpdateOption<WhiteLineSepCommentCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteLineSepComment, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteLineSepComment The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteLineSepComment whiteLineSepComment, InsertOption<WhiteLineSepCommentCB> insertOption, UpdateOption<WhiteLineSepCommentCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdate(whiteLineSepComment, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteLineSepComment The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteLineSepComment whiteLineSepComment, DeleteOption<WhiteLineSepCommentCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteLineSepComment, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteLineSepCommentList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteLineSepComment> whiteLineSepCommentList, InsertOption<WhiteLineSepCommentCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteLineSepCommentList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteLineSepCommentList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteLineSepComment> whiteLineSepCommentList, UpdateOption<WhiteLineSepCommentCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteLineSepCommentList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteLineSepCommentList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteLineSepComment> whiteLineSepCommentList, DeleteOption<WhiteLineSepCommentCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteLineSepCommentList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteLineSepComment, WhiteLineSepCommentCB> setupper, InsertOption<WhiteLineSepCommentCB> option) {
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
     * WhiteLineSepComment whiteLineSepComment = new WhiteLineSepComment();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteLineSepComment.setPK...(value);</span>
     * whiteLineSepComment.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteLineSepComment.setVersionNo(value);</span>
     * WhiteLineSepCommentCB cb = new WhiteLineSepCommentCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteLineSepCommentCB&gt; option = new UpdateOption&lt;WhiteLineSepCommentCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteLineSepCommentCB&gt;() {
     *     public void specify(WhiteLineSepCommentCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteLineSepCommentBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteLineSepComment, cb, option);
     * </pre>
     * @param whiteLineSepComment The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteLineSepComment. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteLineSepComment whiteLineSepComment, WhiteLineSepCommentCB cb, UpdateOption<WhiteLineSepCommentCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteLineSepComment, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteLineSepComment. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteLineSepCommentCB cb, DeleteOption<WhiteLineSepCommentCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteLineSepCommentBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends WhiteLineSepComment> typeOfSelectedEntity() { return WhiteLineSepComment.class; }
    protected Class<WhiteLineSepComment> typeOfHandlingEntity() { return WhiteLineSepComment.class; }
    protected Class<WhiteLineSepCommentCB> typeOfHandlingConditionBean() { return WhiteLineSepCommentCB.class; }
}
