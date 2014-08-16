package com.example.dbflute.sqlserver.dbflute.bsbhv;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.HpSLSFunction;
import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.exception.*;
import org.seasar.dbflute.optional.OptionalEntity;
import org.seasar.dbflute.outsidesql.executor.*;
import com.example.dbflute.sqlserver.dbflute.exbhv.*;
import com.example.dbflute.sqlserver.dbflute.bsbhv.loader.*;
import com.example.dbflute.sqlserver.dbflute.exentity.*;
import com.example.dbflute.sqlserver.dbflute.bsentity.dbmeta.*;
import com.example.dbflute.sqlserver.dbflute.cbean.*;

/**
 * The behavior of VENDOR_SYMMETRIC as TABLE. <br />
 * <pre>
 * [primary key]
 *     VENDOR_SYMMETRIC_ID
 *
 * [column]
 *     VENDOR_SYMMETRIC_ID, PLAIN_TEXT, ENCRYPTED_DATA
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
public abstract class BsVendorSymmetricBhv extends AbstractBehaviorWritable<VendorSymmetric, VendorSymmetricCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    public static final String PATH_various_vendorcheck_executeSymmetricOpen = "various:vendorcheck:executeSymmetricOpen";
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public DBMeta getDBMeta() { return VendorSymmetricDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public VendorSymmetricDbm getMyDBMeta() { return VendorSymmetricDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public VendorSymmetricCB newConditionBean() { return new VendorSymmetricCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public VendorSymmetric newMyEntity() { return new VendorSymmetric(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public VendorSymmetricCB newMyConditionBean() { return new VendorSymmetricCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * VendorSymmetricCB cb = new VendorSymmetricCB();
     * cb.query().setFoo...(value);
     * int count = vendorSymmetricBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of VendorSymmetric. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(VendorSymmetricCB cb) {
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
     * VendorSymmetricCB cb = new VendorSymmetricCB();
     * cb.query().setFoo...(value);
     * VendorSymmetric vendorSymmetric = vendorSymmetricBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (vendorSymmetric != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = vendorSymmetric.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of VendorSymmetric. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorSymmetric selectEntity(VendorSymmetricCB cb) {
        return facadeSelectEntity(cb);
    }

    protected VendorSymmetric facadeSelectEntity(VendorSymmetricCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorSymmetric> OptionalEntity<ENTITY> doSelectOptionalEntity(VendorSymmetricCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * VendorSymmetricCB cb = new VendorSymmetricCB();
     * cb.query().setFoo...(value);
     * VendorSymmetric vendorSymmetric = vendorSymmetricBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = vendorSymmetric.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of VendorSymmetric. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorSymmetric selectEntityWithDeletedCheck(VendorSymmetricCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param vendorSymmetricId : PK, NotNull, numeric(16). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorSymmetric selectByPKValue(Long vendorSymmetricId) {
        return facadeSelectByPKValue(vendorSymmetricId);
    }

    protected VendorSymmetric facadeSelectByPKValue(Long vendorSymmetricId) {
        return doSelectByPK(vendorSymmetricId, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorSymmetric> ENTITY doSelectByPK(Long vendorSymmetricId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(vendorSymmetricId), tp);
    }

    protected <ENTITY extends VendorSymmetric> OptionalEntity<ENTITY> doSelectOptionalByPK(Long vendorSymmetricId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(vendorSymmetricId, tp), vendorSymmetricId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param vendorSymmetricId : PK, NotNull, numeric(16). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorSymmetric selectByPKValueWithDeletedCheck(Long vendorSymmetricId) {
        return doSelectByPKWithDeletedCheck(vendorSymmetricId, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorSymmetric> ENTITY doSelectByPKWithDeletedCheck(Long vendorSymmetricId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(vendorSymmetricId), tp);
    }

    protected VendorSymmetricCB xprepareCBAsPK(Long vendorSymmetricId) {
        assertObjectNotNull("vendorSymmetricId", vendorSymmetricId);
        return newConditionBean().acceptPK(vendorSymmetricId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * VendorSymmetricCB cb = new VendorSymmetricCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;VendorSymmetric&gt; vendorSymmetricList = vendorSymmetricBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (VendorSymmetric vendorSymmetric : vendorSymmetricList) {
     *     ... = vendorSymmetric.get...();
     * }
     * </pre>
     * @param cb The condition-bean of VendorSymmetric. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<VendorSymmetric> selectList(VendorSymmetricCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * VendorSymmetricCB cb = new VendorSymmetricCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;VendorSymmetric&gt; page = vendorSymmetricBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (VendorSymmetric vendorSymmetric : page) {
     *     ... = vendorSymmetric.get...();
     * }
     * </pre>
     * @param cb The condition-bean of VendorSymmetric. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<VendorSymmetric> selectPage(VendorSymmetricCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * VendorSymmetricCB cb = new VendorSymmetricCB();
     * cb.query().setFoo...(value);
     * vendorSymmetricBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;VendorSymmetric&gt;() {
     *     public void handle(VendorSymmetric entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of VendorSymmetric. (NotNull)
     * @param entityRowHandler The handler of entity row of VendorSymmetric. (NotNull)
     */
    public void selectCursor(VendorSymmetricCB cb, EntityRowHandler<VendorSymmetric> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * vendorSymmetricBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(VendorSymmetricCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<VendorSymmetricCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param vendorSymmetricList The entity list of vendorSymmetric. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<VendorSymmetric> vendorSymmetricList, ReferrerLoaderHandler<LoaderOfVendorSymmetric> handler) {
        xassLRArg(vendorSymmetricList, handler);
        handler.handle(new LoaderOfVendorSymmetric().ready(vendorSymmetricList, _behaviorSelector));
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
     * @param vendorSymmetric The entity of vendorSymmetric. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(VendorSymmetric vendorSymmetric, ReferrerLoaderHandler<LoaderOfVendorSymmetric> handler) {
        xassLRArg(vendorSymmetric, handler);
        handler.handle(new LoaderOfVendorSymmetric().ready(xnewLRAryLs(vendorSymmetric), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key vendorSymmetricId.
     * @param vendorSymmetricList The list of vendorSymmetric. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractVendorSymmetricIdList(List<VendorSymmetric> vendorSymmetricList)
    { return helpExtractListInternally(vendorSymmetricList, "vendorSymmetricId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * VendorSymmetric vendorSymmetric = new VendorSymmetric();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorSymmetric.setFoo...(value);
     * vendorSymmetric.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorSymmetric.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorSymmetric.set...;</span>
     * vendorSymmetricBhv.<span style="color: #DD4747">insert</span>(vendorSymmetric);
     * ... = vendorSymmetric.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param vendorSymmetric The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(VendorSymmetric vendorSymmetric) {
        doInsert(vendorSymmetric, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * VendorSymmetric vendorSymmetric = new VendorSymmetric();
     * vendorSymmetric.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorSymmetric.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorSymmetric.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorSymmetric.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendorSymmetric.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     vendorSymmetricBhv.<span style="color: #DD4747">update</span>(vendorSymmetric);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorSymmetric The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(VendorSymmetric vendorSymmetric) {
        doUpdate(vendorSymmetric, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param vendorSymmetric The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(VendorSymmetric vendorSymmetric) {
        doInsertOrUpdate(vendorSymmetric, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * VendorSymmetric vendorSymmetric = new VendorSymmetric();
     * vendorSymmetric.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendorSymmetric.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     vendorSymmetricBhv.<span style="color: #DD4747">delete</span>(vendorSymmetric);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorSymmetric The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(VendorSymmetric vendorSymmetric) {
        doDelete(vendorSymmetric, null);
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
     *     VendorSymmetric vendorSymmetric = new VendorSymmetric();
     *     vendorSymmetric.setFooName("foo");
     *     if (...) {
     *         vendorSymmetric.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     vendorSymmetricList.add(vendorSymmetric);
     * }
     * vendorSymmetricBhv.<span style="color: #DD4747">batchInsert</span>(vendorSymmetricList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param vendorSymmetricList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<VendorSymmetric> vendorSymmetricList) {
        return doBatchInsert(vendorSymmetricList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     VendorSymmetric vendorSymmetric = new VendorSymmetric();
     *     vendorSymmetric.setFooName("foo");
     *     if (...) {
     *         vendorSymmetric.setFooPrice(123);
     *     } else {
     *         vendorSymmetric.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//vendorSymmetric.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     vendorSymmetricList.add(vendorSymmetric);
     * }
     * vendorSymmetricBhv.<span style="color: #DD4747">batchUpdate</span>(vendorSymmetricList);
     * </pre>
     * @param vendorSymmetricList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<VendorSymmetric> vendorSymmetricList) {
        return doBatchUpdate(vendorSymmetricList, null);
    }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * vendorSymmetricBhv.<span style="color: #DD4747">batchUpdate</span>(vendorSymmetricList, new SpecifyQuery<VendorSymmetricCB>() {
     *     public void specify(VendorSymmetricCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * vendorSymmetricBhv.<span style="color: #DD4747">batchUpdate</span>(vendorSymmetricList, new SpecifyQuery<VendorSymmetricCB>() {
     *     public void specify(VendorSymmetricCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param vendorSymmetricList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<VendorSymmetric> vendorSymmetricList, SpecifyQuery<VendorSymmetricCB> updateColumnSpec) {
        return doBatchUpdate(vendorSymmetricList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param vendorSymmetricList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<VendorSymmetric> vendorSymmetricList) {
        return doBatchDelete(vendorSymmetricList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * vendorSymmetricBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;VendorSymmetric, VendorSymmetricCB&gt;() {
     *     public ConditionBean setup(VendorSymmetric entity, VendorSymmetricCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<VendorSymmetric, VendorSymmetricCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * VendorSymmetric vendorSymmetric = new VendorSymmetric();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorSymmetric.setPK...(value);</span>
     * vendorSymmetric.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorSymmetric.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorSymmetric.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorSymmetric.setVersionNo(value);</span>
     * VendorSymmetricCB cb = new VendorSymmetricCB();
     * cb.query().setFoo...(value);
     * vendorSymmetricBhv.<span style="color: #DD4747">queryUpdate</span>(vendorSymmetric, cb);
     * </pre>
     * @param vendorSymmetric The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of VendorSymmetric. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(VendorSymmetric vendorSymmetric, VendorSymmetricCB cb) {
        return doQueryUpdate(vendorSymmetric, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * VendorSymmetricCB cb = new VendorSymmetricCB();
     * cb.query().setFoo...(value);
     * vendorSymmetricBhv.<span style="color: #DD4747">queryDelete</span>(vendorSymmetric, cb);
     * </pre>
     * @param cb The condition-bean of VendorSymmetric. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(VendorSymmetricCB cb) {
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
     * VendorSymmetric vendorSymmetric = new VendorSymmetric();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorSymmetric.setFoo...(value);
     * vendorSymmetric.setBar...(value);
     * InsertOption<VendorSymmetricCB> option = new InsertOption<VendorSymmetricCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * vendorSymmetricBhv.<span style="color: #DD4747">varyingInsert</span>(vendorSymmetric, option);
     * ... = vendorSymmetric.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param vendorSymmetric The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(VendorSymmetric vendorSymmetric, InsertOption<VendorSymmetricCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(vendorSymmetric, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * VendorSymmetric vendorSymmetric = new VendorSymmetric();
     * vendorSymmetric.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorSymmetric.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendorSymmetric.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;VendorSymmetricCB&gt; option = new UpdateOption&lt;VendorSymmetricCB&gt;();
     *     option.self(new SpecifyQuery&lt;VendorSymmetricCB&gt;() {
     *         public void specify(VendorSymmetricCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     vendorSymmetricBhv.<span style="color: #DD4747">varyingUpdate</span>(vendorSymmetric, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorSymmetric The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(VendorSymmetric vendorSymmetric, UpdateOption<VendorSymmetricCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(vendorSymmetric, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param vendorSymmetric The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(VendorSymmetric vendorSymmetric, InsertOption<VendorSymmetricCB> insertOption, UpdateOption<VendorSymmetricCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdate(vendorSymmetric, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param vendorSymmetric The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(VendorSymmetric vendorSymmetric, DeleteOption<VendorSymmetricCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(vendorSymmetric, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param vendorSymmetricList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<VendorSymmetric> vendorSymmetricList, InsertOption<VendorSymmetricCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(vendorSymmetricList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param vendorSymmetricList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<VendorSymmetric> vendorSymmetricList, UpdateOption<VendorSymmetricCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(vendorSymmetricList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param vendorSymmetricList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<VendorSymmetric> vendorSymmetricList, DeleteOption<VendorSymmetricCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(vendorSymmetricList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<VendorSymmetric, VendorSymmetricCB> setupper, InsertOption<VendorSymmetricCB> option) {
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
     * VendorSymmetric vendorSymmetric = new VendorSymmetric();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorSymmetric.setPK...(value);</span>
     * vendorSymmetric.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorSymmetric.setVersionNo(value);</span>
     * VendorSymmetricCB cb = new VendorSymmetricCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;VendorSymmetricCB&gt; option = new UpdateOption&lt;VendorSymmetricCB&gt;();
     * option.self(new SpecifyQuery&lt;VendorSymmetricCB&gt;() {
     *     public void specify(VendorSymmetricCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * vendorSymmetricBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(vendorSymmetric, cb, option);
     * </pre>
     * @param vendorSymmetric The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of VendorSymmetric. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(VendorSymmetric vendorSymmetric, VendorSymmetricCB cb, UpdateOption<VendorSymmetricCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(vendorSymmetric, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of VendorSymmetric. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(VendorSymmetricCB cb, DeleteOption<VendorSymmetricCB> option) {
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
    public OutsideSqlBasicExecutor<VendorSymmetricBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends VendorSymmetric> typeOfSelectedEntity() { return VendorSymmetric.class; }
    protected Class<VendorSymmetric> typeOfHandlingEntity() { return VendorSymmetric.class; }
    protected Class<VendorSymmetricCB> typeOfHandlingConditionBean() { return VendorSymmetricCB.class; }
}
