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
 * The behavior of SYNONYM_REF_EXCEPT as SYNONYM. <br />
 * <pre>
 * [primary key]
 *     REF_EXCEPT_ID
 *
 * [column]
 *     REF_EXCEPT_ID, EXCEPT_ID
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
 *     SYNONYM_EXCEPT
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     synonymExcept
 *
 * [referrer property]
 *     
 * </pre>
 * @author oracleman
 */
public abstract class BsSynonymRefExceptBhv extends AbstractBehaviorWritable<SynonymRefExcept, SynonymRefExceptCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public SynonymRefExceptDbm getDBMeta() { return SynonymRefExceptDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public SynonymRefExceptDbm getMyDBMeta() { return SynonymRefExceptDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public SynonymRefExceptCB newConditionBean() { return new SynonymRefExceptCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public SynonymRefExcept newMyEntity() { return new SynonymRefExcept(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public SynonymRefExceptCB newMyConditionBean() { return new SynonymRefExceptCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * SynonymRefExceptCB cb = new SynonymRefExceptCB();
     * cb.query().setFoo...(value);
     * int count = synonymRefExceptBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of SynonymRefExcept. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(SynonymRefExceptCB cb) {
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
     * SynonymRefExceptCB cb = new SynonymRefExceptCB();
     * cb.query().setFoo...(value);
     * SynonymRefExcept synonymRefExcept = synonymRefExceptBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (synonymRefExcept != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = synonymRefExcept.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of SynonymRefExcept. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymRefExcept selectEntity(SynonymRefExceptCB cb) {
        return facadeSelectEntity(cb);
    }

    protected SynonymRefExcept facadeSelectEntity(SynonymRefExceptCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends SynonymRefExcept> OptionalEntity<ENTITY> doSelectOptionalEntity(SynonymRefExceptCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * SynonymRefExceptCB cb = new SynonymRefExceptCB();
     * cb.query().setFoo...(value);
     * SynonymRefExcept synonymRefExcept = synonymRefExceptBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = synonymRefExcept.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of SynonymRefExcept. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymRefExcept selectEntityWithDeletedCheck(SynonymRefExceptCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param refExceptId : PK, NotNull, NUMBER(16). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymRefExcept selectByPKValue(Long refExceptId) {
        return facadeSelectByPKValue(refExceptId);
    }

    protected SynonymRefExcept facadeSelectByPKValue(Long refExceptId) {
        return doSelectByPK(refExceptId, typeOfSelectedEntity());
    }

    protected <ENTITY extends SynonymRefExcept> ENTITY doSelectByPK(Long refExceptId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(refExceptId), tp);
    }

    protected <ENTITY extends SynonymRefExcept> OptionalEntity<ENTITY> doSelectOptionalByPK(Long refExceptId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(refExceptId, tp), refExceptId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param refExceptId : PK, NotNull, NUMBER(16). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymRefExcept selectByPKValueWithDeletedCheck(Long refExceptId) {
        return doSelectByPKWithDeletedCheck(refExceptId, typeOfSelectedEntity());
    }

    protected <ENTITY extends SynonymRefExcept> ENTITY doSelectByPKWithDeletedCheck(Long refExceptId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(refExceptId), tp);
    }

    protected SynonymRefExceptCB xprepareCBAsPK(Long refExceptId) {
        assertObjectNotNull("refExceptId", refExceptId);
        return newConditionBean().acceptPK(refExceptId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * SynonymRefExceptCB cb = new SynonymRefExceptCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;SynonymRefExcept&gt; synonymRefExceptList = synonymRefExceptBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (SynonymRefExcept synonymRefExcept : synonymRefExceptList) {
     *     ... = synonymRefExcept.get...();
     * }
     * </pre>
     * @param cb The condition-bean of SynonymRefExcept. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<SynonymRefExcept> selectList(SynonymRefExceptCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * SynonymRefExceptCB cb = new SynonymRefExceptCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;SynonymRefExcept&gt; page = synonymRefExceptBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (SynonymRefExcept synonymRefExcept : page) {
     *     ... = synonymRefExcept.get...();
     * }
     * </pre>
     * @param cb The condition-bean of SynonymRefExcept. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<SynonymRefExcept> selectPage(SynonymRefExceptCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * SynonymRefExceptCB cb = new SynonymRefExceptCB();
     * cb.query().setFoo...(value);
     * synonymRefExceptBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;SynonymRefExcept&gt;() {
     *     public void handle(SynonymRefExcept entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of SynonymRefExcept. (NotNull)
     * @param entityRowHandler The handler of entity row of SynonymRefExcept. (NotNull)
     */
    public void selectCursor(SynonymRefExceptCB cb, EntityRowHandler<SynonymRefExcept> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * synonymRefExceptBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(SynonymRefExceptCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<SynonymRefExceptCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param synonymRefExceptList The entity list of synonymRefExcept. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<SynonymRefExcept> synonymRefExceptList, ReferrerLoaderHandler<LoaderOfSynonymRefExcept> handler) {
        xassLRArg(synonymRefExceptList, handler);
        handler.handle(new LoaderOfSynonymRefExcept().ready(synonymRefExceptList, _behaviorSelector));
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
     * @param synonymRefExcept The entity of synonymRefExcept. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(SynonymRefExcept synonymRefExcept, ReferrerLoaderHandler<LoaderOfSynonymRefExcept> handler) {
        xassLRArg(synonymRefExcept, handler);
        handler.handle(new LoaderOfSynonymRefExcept().ready(xnewLRAryLs(synonymRefExcept), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'SynonymExcept'.
     * @param synonymRefExceptList The list of synonymRefExcept. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<SynonymExcept> pulloutSynonymExcept(List<SynonymRefExcept> synonymRefExceptList)
    { return helpPulloutInternally(synonymRefExceptList, "synonymExcept"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key refExceptId.
     * @param synonymRefExceptList The list of synonymRefExcept. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractRefExceptIdList(List<SynonymRefExcept> synonymRefExceptList)
    { return helpExtractListInternally(synonymRefExceptList, "refExceptId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * SynonymRefExcept synonymRefExcept = new SynonymRefExcept();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * synonymRefExcept.setFoo...(value);
     * synonymRefExcept.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymRefExcept.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymRefExcept.set...;</span>
     * synonymRefExceptBhv.<span style="color: #DD4747">insert</span>(synonymRefExcept);
     * ... = synonymRefExcept.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param synonymRefExcept The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(SynonymRefExcept synonymRefExcept) {
        doInsert(synonymRefExcept, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * SynonymRefExcept synonymRefExcept = new SynonymRefExcept();
     * synonymRefExcept.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * synonymRefExcept.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymRefExcept.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymRefExcept.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * synonymRefExcept.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     synonymRefExceptBhv.<span style="color: #DD4747">update</span>(synonymRefExcept);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param synonymRefExcept The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(SynonymRefExcept synonymRefExcept) {
        doUpdate(synonymRefExcept, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param synonymRefExcept The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(SynonymRefExcept synonymRefExcept) {
        doInsertOrUpdate(synonymRefExcept, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * SynonymRefExcept synonymRefExcept = new SynonymRefExcept();
     * synonymRefExcept.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * synonymRefExcept.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     synonymRefExceptBhv.<span style="color: #DD4747">delete</span>(synonymRefExcept);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param synonymRefExcept The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(SynonymRefExcept synonymRefExcept) {
        doDelete(synonymRefExcept, null);
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
     *     SynonymRefExcept synonymRefExcept = new SynonymRefExcept();
     *     synonymRefExcept.setFooName("foo");
     *     if (...) {
     *         synonymRefExcept.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     synonymRefExceptList.add(synonymRefExcept);
     * }
     * synonymRefExceptBhv.<span style="color: #DD4747">batchInsert</span>(synonymRefExceptList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param synonymRefExceptList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<SynonymRefExcept> synonymRefExceptList) {
        return doBatchInsert(synonymRefExceptList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     SynonymRefExcept synonymRefExcept = new SynonymRefExcept();
     *     synonymRefExcept.setFooName("foo");
     *     if (...) {
     *         synonymRefExcept.setFooPrice(123);
     *     } else {
     *         synonymRefExcept.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//synonymRefExcept.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     synonymRefExceptList.add(synonymRefExcept);
     * }
     * synonymRefExceptBhv.<span style="color: #DD4747">batchUpdate</span>(synonymRefExceptList);
     * </pre>
     * @param synonymRefExceptList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<SynonymRefExcept> synonymRefExceptList) {
        return doBatchUpdate(synonymRefExceptList, null);
    }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * synonymRefExceptBhv.<span style="color: #DD4747">batchUpdate</span>(synonymRefExceptList, new SpecifyQuery<SynonymRefExceptCB>() {
     *     public void specify(SynonymRefExceptCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * synonymRefExceptBhv.<span style="color: #DD4747">batchUpdate</span>(synonymRefExceptList, new SpecifyQuery<SynonymRefExceptCB>() {
     *     public void specify(SynonymRefExceptCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param synonymRefExceptList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<SynonymRefExcept> synonymRefExceptList, SpecifyQuery<SynonymRefExceptCB> updateColumnSpec) {
        return doBatchUpdate(synonymRefExceptList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param synonymRefExceptList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<SynonymRefExcept> synonymRefExceptList) {
        return doBatchDelete(synonymRefExceptList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * synonymRefExceptBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;SynonymRefExcept, SynonymRefExceptCB&gt;() {
     *     public ConditionBean setup(SynonymRefExcept entity, SynonymRefExceptCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<SynonymRefExcept, SynonymRefExceptCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * SynonymRefExcept synonymRefExcept = new SynonymRefExcept();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//synonymRefExcept.setPK...(value);</span>
     * synonymRefExcept.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymRefExcept.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymRefExcept.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymRefExcept.setVersionNo(value);</span>
     * SynonymRefExceptCB cb = new SynonymRefExceptCB();
     * cb.query().setFoo...(value);
     * synonymRefExceptBhv.<span style="color: #DD4747">queryUpdate</span>(synonymRefExcept, cb);
     * </pre>
     * @param synonymRefExcept The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of SynonymRefExcept. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(SynonymRefExcept synonymRefExcept, SynonymRefExceptCB cb) {
        return doQueryUpdate(synonymRefExcept, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * SynonymRefExceptCB cb = new SynonymRefExceptCB();
     * cb.query().setFoo...(value);
     * synonymRefExceptBhv.<span style="color: #DD4747">queryDelete</span>(synonymRefExcept, cb);
     * </pre>
     * @param cb The condition-bean of SynonymRefExcept. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(SynonymRefExceptCB cb) {
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
     * SynonymRefExcept synonymRefExcept = new SynonymRefExcept();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * synonymRefExcept.setFoo...(value);
     * synonymRefExcept.setBar...(value);
     * InsertOption<SynonymRefExceptCB> option = new InsertOption<SynonymRefExceptCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * synonymRefExceptBhv.<span style="color: #DD4747">varyingInsert</span>(synonymRefExcept, option);
     * ... = synonymRefExcept.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param synonymRefExcept The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(SynonymRefExcept synonymRefExcept, InsertOption<SynonymRefExceptCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(synonymRefExcept, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * SynonymRefExcept synonymRefExcept = new SynonymRefExcept();
     * synonymRefExcept.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * synonymRefExcept.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * synonymRefExcept.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;SynonymRefExceptCB&gt; option = new UpdateOption&lt;SynonymRefExceptCB&gt;();
     *     option.self(new SpecifyQuery&lt;SynonymRefExceptCB&gt;() {
     *         public void specify(SynonymRefExceptCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     synonymRefExceptBhv.<span style="color: #DD4747">varyingUpdate</span>(synonymRefExcept, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param synonymRefExcept The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(SynonymRefExcept synonymRefExcept, UpdateOption<SynonymRefExceptCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(synonymRefExcept, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param synonymRefExcept The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(SynonymRefExcept synonymRefExcept, InsertOption<SynonymRefExceptCB> insertOption, UpdateOption<SynonymRefExceptCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdate(synonymRefExcept, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param synonymRefExcept The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(SynonymRefExcept synonymRefExcept, DeleteOption<SynonymRefExceptCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(synonymRefExcept, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param synonymRefExceptList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<SynonymRefExcept> synonymRefExceptList, InsertOption<SynonymRefExceptCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(synonymRefExceptList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param synonymRefExceptList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<SynonymRefExcept> synonymRefExceptList, UpdateOption<SynonymRefExceptCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(synonymRefExceptList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param synonymRefExceptList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<SynonymRefExcept> synonymRefExceptList, DeleteOption<SynonymRefExceptCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(synonymRefExceptList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<SynonymRefExcept, SynonymRefExceptCB> setupper, InsertOption<SynonymRefExceptCB> option) {
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
     * SynonymRefExcept synonymRefExcept = new SynonymRefExcept();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//synonymRefExcept.setPK...(value);</span>
     * synonymRefExcept.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymRefExcept.setVersionNo(value);</span>
     * SynonymRefExceptCB cb = new SynonymRefExceptCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;SynonymRefExceptCB&gt; option = new UpdateOption&lt;SynonymRefExceptCB&gt;();
     * option.self(new SpecifyQuery&lt;SynonymRefExceptCB&gt;() {
     *     public void specify(SynonymRefExceptCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * synonymRefExceptBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(synonymRefExcept, cb, option);
     * </pre>
     * @param synonymRefExcept The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of SynonymRefExcept. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(SynonymRefExcept synonymRefExcept, SynonymRefExceptCB cb, UpdateOption<SynonymRefExceptCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(synonymRefExcept, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of SynonymRefExcept. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(SynonymRefExceptCB cb, DeleteOption<SynonymRefExceptCB> option) {
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
    public OutsideSqlBasicExecutor<SynonymRefExceptBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<SynonymRefExceptBhv> facadeExecutor = doOutsideSql();
        return facadeExecutor.xbasicExecutor(); // variable to resolve generic type
    }

    // ===================================================================================
    //                                                                         Hyper Patch
    //                                                                         ===========
    @Override
    protected <RESULT extends SynonymRefExcept> org.seasar.dbflute.bhv.core.command.SelectCursorCBCommand<RESULT> newSelectCursorCBCommand() {
        return new com.example.dbflute.oracle.dbflute.allcommon.DBFluteConfig.SelectCursorCBCommandHyperPatch<RESULT>();
    }

    @Override
    protected <RESULT extends SynonymRefExcept> org.seasar.dbflute.bhv.core.command.SelectListCBCommand<RESULT> newSelectListCBCommand() {
        return new com.example.dbflute.oracle.dbflute.allcommon.DBFluteConfig.SelectListCBCommandHyperPatch<RESULT>();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends SynonymRefExcept> typeOfSelectedEntity() { return SynonymRefExcept.class; }
    protected Class<SynonymRefExcept> typeOfHandlingEntity() { return SynonymRefExcept.class; }
    protected Class<SynonymRefExceptCB> typeOfHandlingConditionBean() { return SynonymRefExceptCB.class; }
}
