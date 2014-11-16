package com.example.dbflute.oracle.dbflute.bsbhv;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.HpSLSFunction;
import org.seasar.dbflute.exception.*;
import org.seasar.dbflute.optional.OptionalEntity;
import org.seasar.dbflute.outsidesql.executor.*;
import com.example.dbflute.oracle.dbflute.exbhv.*;
import com.example.dbflute.oracle.dbflute.bsbhv.loader.*;
import com.example.dbflute.oracle.dbflute.exentity.*;
import com.example.dbflute.oracle.dbflute.bsentity.dbmeta.*;
import com.example.dbflute.oracle.dbflute.cbean.*;

/**
 * The behavior of WHITE_REF_NEXT_TARGET as TABLE. <br />
 * <pre>
 * [primary key]
 *     REF_NEXT_TARGET_ID
 *
 * [column]
 *     REF_NEXT_TARGET_ID, NEXT_TARGET_CODE
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
 *     NEXT_SCHEMA_PRODUCT_STATUS
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     nextSchemaProductStatus
 *
 * [referrer property]
 *     
 * </pre>
 * @author oracleman
 */
public abstract class BsWhiteRefNextTargetBhv extends AbstractBehaviorWritable<WhiteRefNextTarget, WhiteRefNextTargetCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public WhiteRefNextTargetDbm getDBMeta() { return WhiteRefNextTargetDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteRefNextTargetDbm getMyDBMeta() { return WhiteRefNextTargetDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhiteRefNextTargetCB newConditionBean() { return new WhiteRefNextTargetCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteRefNextTarget newMyEntity() { return new WhiteRefNextTarget(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteRefNextTargetCB newMyConditionBean() { return new WhiteRefNextTargetCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteRefNextTargetCB cb = new WhiteRefNextTargetCB();
     * cb.query().setFoo...(value);
     * int count = whiteRefNextTargetBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteRefNextTarget. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteRefNextTargetCB cb) {
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
     * WhiteRefNextTargetCB cb = new WhiteRefNextTargetCB();
     * cb.query().setFoo...(value);
     * WhiteRefNextTarget whiteRefNextTarget = whiteRefNextTargetBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (whiteRefNextTarget != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = whiteRefNextTarget.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteRefNextTarget. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteRefNextTarget selectEntity(WhiteRefNextTargetCB cb) {
        return facadeSelectEntity(cb);
    }

    protected WhiteRefNextTarget facadeSelectEntity(WhiteRefNextTargetCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteRefNextTarget> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteRefNextTargetCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * WhiteRefNextTargetCB cb = new WhiteRefNextTargetCB();
     * cb.query().setFoo...(value);
     * WhiteRefNextTarget whiteRefNextTarget = whiteRefNextTargetBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteRefNextTarget.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteRefNextTarget. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteRefNextTarget selectEntityWithDeletedCheck(WhiteRefNextTargetCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param refNextTargetId : PK, NotNull, NUMBER(16). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteRefNextTarget selectByPKValue(Long refNextTargetId) {
        return facadeSelectByPKValue(refNextTargetId);
    }

    protected WhiteRefNextTarget facadeSelectByPKValue(Long refNextTargetId) {
        return doSelectByPK(refNextTargetId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteRefNextTarget> ENTITY doSelectByPK(Long refNextTargetId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(refNextTargetId), tp);
    }

    protected <ENTITY extends WhiteRefNextTarget> OptionalEntity<ENTITY> doSelectOptionalByPK(Long refNextTargetId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(refNextTargetId, tp), refNextTargetId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param refNextTargetId : PK, NotNull, NUMBER(16). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteRefNextTarget selectByPKValueWithDeletedCheck(Long refNextTargetId) {
        return doSelectByPKWithDeletedCheck(refNextTargetId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteRefNextTarget> ENTITY doSelectByPKWithDeletedCheck(Long refNextTargetId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(refNextTargetId), tp);
    }

    protected WhiteRefNextTargetCB xprepareCBAsPK(Long refNextTargetId) {
        assertObjectNotNull("refNextTargetId", refNextTargetId);
        return newConditionBean().acceptPK(refNextTargetId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteRefNextTargetCB cb = new WhiteRefNextTargetCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteRefNextTarget&gt; whiteRefNextTargetList = whiteRefNextTargetBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteRefNextTarget whiteRefNextTarget : whiteRefNextTargetList) {
     *     ... = whiteRefNextTarget.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteRefNextTarget. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteRefNextTarget> selectList(WhiteRefNextTargetCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * WhiteRefNextTargetCB cb = new WhiteRefNextTargetCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteRefNextTarget&gt; page = whiteRefNextTargetBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteRefNextTarget whiteRefNextTarget : page) {
     *     ... = whiteRefNextTarget.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteRefNextTarget. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteRefNextTarget> selectPage(WhiteRefNextTargetCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteRefNextTargetCB cb = new WhiteRefNextTargetCB();
     * cb.query().setFoo...(value);
     * whiteRefNextTargetBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteRefNextTarget&gt;() {
     *     public void handle(WhiteRefNextTarget entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteRefNextTarget. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteRefNextTarget. (NotNull)
     */
    public void selectCursor(WhiteRefNextTargetCB cb, EntityRowHandler<WhiteRefNextTarget> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteRefNextTargetBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteRefNextTargetCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhiteRefNextTargetCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param whiteRefNextTargetList The entity list of whiteRefNextTarget. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhiteRefNextTarget> whiteRefNextTargetList, ReferrerLoaderHandler<LoaderOfWhiteRefNextTarget> handler) {
        xassLRArg(whiteRefNextTargetList, handler);
        handler.handle(new LoaderOfWhiteRefNextTarget().ready(whiteRefNextTargetList, _behaviorSelector));
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
     * @param whiteRefNextTarget The entity of whiteRefNextTarget. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhiteRefNextTarget whiteRefNextTarget, ReferrerLoaderHandler<LoaderOfWhiteRefNextTarget> handler) {
        xassLRArg(whiteRefNextTarget, handler);
        handler.handle(new LoaderOfWhiteRefNextTarget().ready(xnewLRAryLs(whiteRefNextTarget), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'NextSchemaProductStatus'.
     * @param whiteRefNextTargetList The list of whiteRefNextTarget. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<NextSchemaProductStatus> pulloutNextSchemaProductStatus(List<WhiteRefNextTarget> whiteRefNextTargetList)
    { return helpPulloutInternally(whiteRefNextTargetList, "nextSchemaProductStatus"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key refNextTargetId.
     * @param whiteRefNextTargetList The list of whiteRefNextTarget. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractRefNextTargetIdList(List<WhiteRefNextTarget> whiteRefNextTargetList)
    { return helpExtractListInternally(whiteRefNextTargetList, "refNextTargetId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteRefNextTarget whiteRefNextTarget = new WhiteRefNextTarget();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteRefNextTarget.setFoo...(value);
     * whiteRefNextTarget.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteRefNextTarget.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteRefNextTarget.set...;</span>
     * whiteRefNextTargetBhv.<span style="color: #DD4747">insert</span>(whiteRefNextTarget);
     * ... = whiteRefNextTarget.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteRefNextTarget The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteRefNextTarget whiteRefNextTarget) {
        doInsert(whiteRefNextTarget, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteRefNextTarget whiteRefNextTarget = new WhiteRefNextTarget();
     * whiteRefNextTarget.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteRefNextTarget.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteRefNextTarget.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteRefNextTarget.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteRefNextTarget.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteRefNextTargetBhv.<span style="color: #DD4747">update</span>(whiteRefNextTarget);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteRefNextTarget The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhiteRefNextTarget whiteRefNextTarget) {
        doUpdate(whiteRefNextTarget, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param whiteRefNextTarget The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteRefNextTarget whiteRefNextTarget) {
        doInsertOrUpdate(whiteRefNextTarget, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteRefNextTarget whiteRefNextTarget = new WhiteRefNextTarget();
     * whiteRefNextTarget.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteRefNextTarget.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteRefNextTargetBhv.<span style="color: #DD4747">delete</span>(whiteRefNextTarget);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteRefNextTarget The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteRefNextTarget whiteRefNextTarget) {
        doDelete(whiteRefNextTarget, null);
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
     *     WhiteRefNextTarget whiteRefNextTarget = new WhiteRefNextTarget();
     *     whiteRefNextTarget.setFooName("foo");
     *     if (...) {
     *         whiteRefNextTarget.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteRefNextTargetList.add(whiteRefNextTarget);
     * }
     * whiteRefNextTargetBhv.<span style="color: #DD4747">batchInsert</span>(whiteRefNextTargetList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteRefNextTargetList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteRefNextTarget> whiteRefNextTargetList) {
        return doBatchInsert(whiteRefNextTargetList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhiteRefNextTarget whiteRefNextTarget = new WhiteRefNextTarget();
     *     whiteRefNextTarget.setFooName("foo");
     *     if (...) {
     *         whiteRefNextTarget.setFooPrice(123);
     *     } else {
     *         whiteRefNextTarget.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteRefNextTarget.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteRefNextTargetList.add(whiteRefNextTarget);
     * }
     * whiteRefNextTargetBhv.<span style="color: #DD4747">batchUpdate</span>(whiteRefNextTargetList);
     * </pre>
     * @param whiteRefNextTargetList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteRefNextTarget> whiteRefNextTargetList) {
        return doBatchUpdate(whiteRefNextTargetList, null);
    }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * whiteRefNextTargetBhv.<span style="color: #DD4747">batchUpdate</span>(whiteRefNextTargetList, new SpecifyQuery<WhiteRefNextTargetCB>() {
     *     public void specify(WhiteRefNextTargetCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteRefNextTargetBhv.<span style="color: #DD4747">batchUpdate</span>(whiteRefNextTargetList, new SpecifyQuery<WhiteRefNextTargetCB>() {
     *     public void specify(WhiteRefNextTargetCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteRefNextTargetList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteRefNextTarget> whiteRefNextTargetList, SpecifyQuery<WhiteRefNextTargetCB> updateColumnSpec) {
        return doBatchUpdate(whiteRefNextTargetList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteRefNextTargetList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteRefNextTarget> whiteRefNextTargetList) {
        return doBatchDelete(whiteRefNextTargetList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * whiteRefNextTargetBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteRefNextTarget, WhiteRefNextTargetCB&gt;() {
     *     public ConditionBean setup(WhiteRefNextTarget entity, WhiteRefNextTargetCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteRefNextTarget, WhiteRefNextTargetCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteRefNextTarget whiteRefNextTarget = new WhiteRefNextTarget();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteRefNextTarget.setPK...(value);</span>
     * whiteRefNextTarget.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteRefNextTarget.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteRefNextTarget.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteRefNextTarget.setVersionNo(value);</span>
     * WhiteRefNextTargetCB cb = new WhiteRefNextTargetCB();
     * cb.query().setFoo...(value);
     * whiteRefNextTargetBhv.<span style="color: #DD4747">queryUpdate</span>(whiteRefNextTarget, cb);
     * </pre>
     * @param whiteRefNextTarget The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteRefNextTarget. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteRefNextTarget whiteRefNextTarget, WhiteRefNextTargetCB cb) {
        return doQueryUpdate(whiteRefNextTarget, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteRefNextTargetCB cb = new WhiteRefNextTargetCB();
     * cb.query().setFoo...(value);
     * whiteRefNextTargetBhv.<span style="color: #DD4747">queryDelete</span>(whiteRefNextTarget, cb);
     * </pre>
     * @param cb The condition-bean of WhiteRefNextTarget. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteRefNextTargetCB cb) {
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
     * WhiteRefNextTarget whiteRefNextTarget = new WhiteRefNextTarget();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteRefNextTarget.setFoo...(value);
     * whiteRefNextTarget.setBar...(value);
     * InsertOption<WhiteRefNextTargetCB> option = new InsertOption<WhiteRefNextTargetCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteRefNextTargetBhv.<span style="color: #DD4747">varyingInsert</span>(whiteRefNextTarget, option);
     * ... = whiteRefNextTarget.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteRefNextTarget The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteRefNextTarget whiteRefNextTarget, InsertOption<WhiteRefNextTargetCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteRefNextTarget, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteRefNextTarget whiteRefNextTarget = new WhiteRefNextTarget();
     * whiteRefNextTarget.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteRefNextTarget.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteRefNextTarget.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteRefNextTargetCB&gt; option = new UpdateOption&lt;WhiteRefNextTargetCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteRefNextTargetCB&gt;() {
     *         public void specify(WhiteRefNextTargetCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteRefNextTargetBhv.<span style="color: #DD4747">varyingUpdate</span>(whiteRefNextTarget, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteRefNextTarget The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteRefNextTarget whiteRefNextTarget, UpdateOption<WhiteRefNextTargetCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteRefNextTarget, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteRefNextTarget The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteRefNextTarget whiteRefNextTarget, InsertOption<WhiteRefNextTargetCB> insertOption, UpdateOption<WhiteRefNextTargetCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdate(whiteRefNextTarget, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteRefNextTarget The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteRefNextTarget whiteRefNextTarget, DeleteOption<WhiteRefNextTargetCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteRefNextTarget, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteRefNextTargetList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteRefNextTarget> whiteRefNextTargetList, InsertOption<WhiteRefNextTargetCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteRefNextTargetList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteRefNextTargetList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteRefNextTarget> whiteRefNextTargetList, UpdateOption<WhiteRefNextTargetCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteRefNextTargetList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteRefNextTargetList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteRefNextTarget> whiteRefNextTargetList, DeleteOption<WhiteRefNextTargetCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteRefNextTargetList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteRefNextTarget, WhiteRefNextTargetCB> setupper, InsertOption<WhiteRefNextTargetCB> option) {
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
     * WhiteRefNextTarget whiteRefNextTarget = new WhiteRefNextTarget();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteRefNextTarget.setPK...(value);</span>
     * whiteRefNextTarget.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteRefNextTarget.setVersionNo(value);</span>
     * WhiteRefNextTargetCB cb = new WhiteRefNextTargetCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteRefNextTargetCB&gt; option = new UpdateOption&lt;WhiteRefNextTargetCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteRefNextTargetCB&gt;() {
     *     public void specify(WhiteRefNextTargetCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteRefNextTargetBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteRefNextTarget, cb, option);
     * </pre>
     * @param whiteRefNextTarget The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteRefNextTarget. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteRefNextTarget whiteRefNextTarget, WhiteRefNextTargetCB cb, UpdateOption<WhiteRefNextTargetCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteRefNextTarget, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteRefNextTarget. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteRefNextTargetCB cb, DeleteOption<WhiteRefNextTargetCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteRefNextTargetBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<WhiteRefNextTargetBhv> facadeExecutor = doOutsideSql();
        return facadeExecutor.xbasicExecutor(); // variable to resolve generic type
    }

    // ===================================================================================
    //                                                                         Hyper Patch
    //                                                                         ===========
    @Override
    protected <RESULT extends WhiteRefNextTarget> org.seasar.dbflute.bhv.core.command.SelectCursorCBCommand<RESULT> newSelectCursorCBCommand() {
        return new com.example.dbflute.oracle.dbflute.allcommon.DBFluteConfig.SelectCursorCBCommandHyperPatch<RESULT>();
    }

    @Override
    protected <RESULT extends WhiteRefNextTarget> org.seasar.dbflute.bhv.core.command.SelectListCBCommand<RESULT> newSelectListCBCommand() {
        return new com.example.dbflute.oracle.dbflute.allcommon.DBFluteConfig.SelectListCBCommandHyperPatch<RESULT>();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends WhiteRefNextTarget> typeOfSelectedEntity() { return WhiteRefNextTarget.class; }
    protected Class<WhiteRefNextTarget> typeOfHandlingEntity() { return WhiteRefNextTarget.class; }
    protected Class<WhiteRefNextTargetCB> typeOfHandlingConditionBean() { return WhiteRefNextTargetCB.class; }
}
