package com.example.dbflute.oracle.dbflute.bsbhv;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.HpSLSFunction;
import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.exception.*;
import org.seasar.dbflute.optional.OptionalEntity;
import org.seasar.dbflute.outsidesql.executor.*;
import com.example.dbflute.oracle.dbflute.exbhv.*;
import com.example.dbflute.oracle.dbflute.bsbhv.loader.*;
import com.example.dbflute.oracle.dbflute.exentity.*;
import com.example.dbflute.oracle.dbflute.bsentity.dbmeta.*;
import com.example.dbflute.oracle.dbflute.cbean.*;

/**
 * The behavior of (隣のスキーマ)NEXT_SCHEMA_PRODUCT as TABLE. <br />
 * <pre>
 * [primary key]
 *     PRODUCT_ID
 *
 * [column]
 *     PRODUCT_ID, PRODUCT_NAME, PRODUCT_HANDLE_CODE, PRODUCT_STATUS_CODE, REGISTER_DATETIME, REGISTER_USER, REGISTER_PROCESS, UPDATE_DATETIME, UPDATE_USER, UPDATE_PROCESS, VERSION_NO
 *
 * [sequence]
 *     NEXTEXAMPLEDB.SEQ_NEXT_SCHEMA_PRODUCT
 *
 * [identity]
 *     
 *
 * [version-no]
 *     VERSION_NO
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
public abstract class BsNextSchemaProductBhv extends AbstractBehaviorWritable<NextSchemaProduct, NextSchemaProductCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public DBMeta getDBMeta() { return NextSchemaProductDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public NextSchemaProductDbm getMyDBMeta() { return NextSchemaProductDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public NextSchemaProductCB newConditionBean() { return new NextSchemaProductCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public NextSchemaProduct newMyEntity() { return new NextSchemaProduct(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public NextSchemaProductCB newMyConditionBean() { return new NextSchemaProductCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * NextSchemaProductCB cb = new NextSchemaProductCB();
     * cb.query().setFoo...(value);
     * int count = nextSchemaProductBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of NextSchemaProduct. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(NextSchemaProductCB cb) {
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
     * NextSchemaProductCB cb = new NextSchemaProductCB();
     * cb.query().setFoo...(value);
     * NextSchemaProduct nextSchemaProduct = nextSchemaProductBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (nextSchemaProduct != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = nextSchemaProduct.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of NextSchemaProduct. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public NextSchemaProduct selectEntity(NextSchemaProductCB cb) {
        return facadeSelectEntity(cb);
    }

    protected NextSchemaProduct facadeSelectEntity(NextSchemaProductCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends NextSchemaProduct> OptionalEntity<ENTITY> doSelectOptionalEntity(NextSchemaProductCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * NextSchemaProductCB cb = new NextSchemaProductCB();
     * cb.query().setFoo...(value);
     * NextSchemaProduct nextSchemaProduct = nextSchemaProductBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = nextSchemaProduct.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of NextSchemaProduct. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public NextSchemaProduct selectEntityWithDeletedCheck(NextSchemaProductCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param productId (隣の商品ID): PK, NotNull, NUMBER(16). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public NextSchemaProduct selectByPKValue(Long productId) {
        return facadeSelectByPKValue(productId);
    }

    protected NextSchemaProduct facadeSelectByPKValue(Long productId) {
        return doSelectByPK(productId, typeOfSelectedEntity());
    }

    protected <ENTITY extends NextSchemaProduct> ENTITY doSelectByPK(Long productId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(productId), tp);
    }

    protected <ENTITY extends NextSchemaProduct> OptionalEntity<ENTITY> doSelectOptionalByPK(Long productId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(productId, tp), productId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param productId (隣の商品ID): PK, NotNull, NUMBER(16). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public NextSchemaProduct selectByPKValueWithDeletedCheck(Long productId) {
        return doSelectByPKWithDeletedCheck(productId, typeOfSelectedEntity());
    }

    protected <ENTITY extends NextSchemaProduct> ENTITY doSelectByPKWithDeletedCheck(Long productId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(productId), tp);
    }

    protected NextSchemaProductCB xprepareCBAsPK(Long productId) {
        assertObjectNotNull("productId", productId);
        return newConditionBean().acceptPK(productId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * NextSchemaProductCB cb = new NextSchemaProductCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;NextSchemaProduct&gt; nextSchemaProductList = nextSchemaProductBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (NextSchemaProduct nextSchemaProduct : nextSchemaProductList) {
     *     ... = nextSchemaProduct.get...();
     * }
     * </pre>
     * @param cb The condition-bean of NextSchemaProduct. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<NextSchemaProduct> selectList(NextSchemaProductCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * NextSchemaProductCB cb = new NextSchemaProductCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;NextSchemaProduct&gt; page = nextSchemaProductBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (NextSchemaProduct nextSchemaProduct : page) {
     *     ... = nextSchemaProduct.get...();
     * }
     * </pre>
     * @param cb The condition-bean of NextSchemaProduct. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<NextSchemaProduct> selectPage(NextSchemaProductCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * NextSchemaProductCB cb = new NextSchemaProductCB();
     * cb.query().setFoo...(value);
     * nextSchemaProductBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;NextSchemaProduct&gt;() {
     *     public void handle(NextSchemaProduct entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of NextSchemaProduct. (NotNull)
     * @param entityRowHandler The handler of entity row of NextSchemaProduct. (NotNull)
     */
    public void selectCursor(NextSchemaProductCB cb, EntityRowHandler<NextSchemaProduct> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * nextSchemaProductBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(NextSchemaProductCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<NextSchemaProductCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    // ===================================================================================
    //                                                                            Sequence
    //                                                                            ========
    /**
     * Select the next value as sequence. <br />
     * This method is called when insert() and set to primary-key automatically.
     * So you don't need to call this as long as you need to get next value before insert().
     * @return The next value. (NotNull)
     */
    public Long selectNextVal() {
        return facadeSelectNextVal();
    }

    protected Long facadeSelectNextVal() {
        return doSelectNextVal(Long.class);
    }

    protected <RESULT> RESULT doSelectNextVal(Class<RESULT> tp) {
        return delegateSelectNextVal(tp);
    }

    @Override
    protected Number doReadNextVal() {
        return facadeSelectNextVal();
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
     * @param nextSchemaProductList The entity list of nextSchemaProduct. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<NextSchemaProduct> nextSchemaProductList, ReferrerLoaderHandler<LoaderOfNextSchemaProduct> handler) {
        xassLRArg(nextSchemaProductList, handler);
        handler.handle(new LoaderOfNextSchemaProduct().ready(nextSchemaProductList, _behaviorSelector));
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
     * @param nextSchemaProduct The entity of nextSchemaProduct. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(NextSchemaProduct nextSchemaProduct, ReferrerLoaderHandler<LoaderOfNextSchemaProduct> handler) {
        xassLRArg(nextSchemaProduct, handler);
        handler.handle(new LoaderOfNextSchemaProduct().ready(xnewLRAryLs(nextSchemaProduct), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'NextSchemaProductStatus'.
     * @param nextSchemaProductList The list of nextSchemaProduct. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<NextSchemaProductStatus> pulloutNextSchemaProductStatus(List<NextSchemaProduct> nextSchemaProductList)
    { return helpPulloutInternally(nextSchemaProductList, "nextSchemaProductStatus"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key productId.
     * @param nextSchemaProductList The list of nextSchemaProduct. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractProductIdList(List<NextSchemaProduct> nextSchemaProductList)
    { return helpExtractListInternally(nextSchemaProductList, "productId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * NextSchemaProduct nextSchemaProduct = new NextSchemaProduct();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * nextSchemaProduct.setFoo...(value);
     * nextSchemaProduct.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//nextSchemaProduct.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//nextSchemaProduct.set...;</span>
     * nextSchemaProductBhv.<span style="color: #DD4747">insert</span>(nextSchemaProduct);
     * ... = nextSchemaProduct.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param nextSchemaProduct The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(NextSchemaProduct nextSchemaProduct) {
        doInsert(nextSchemaProduct, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * NextSchemaProduct nextSchemaProduct = new NextSchemaProduct();
     * nextSchemaProduct.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * nextSchemaProduct.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//nextSchemaProduct.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//nextSchemaProduct.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * nextSchemaProduct.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     nextSchemaProductBhv.<span style="color: #DD4747">update</span>(nextSchemaProduct);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param nextSchemaProduct The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(NextSchemaProduct nextSchemaProduct) {
        doUpdate(nextSchemaProduct, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * NextSchemaProduct nextSchemaProduct = new NextSchemaProduct();
     * nextSchemaProduct.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * nextSchemaProduct.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//nextSchemaProduct.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//nextSchemaProduct.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//nextSchemaProduct.setVersionNo(value);</span>
     * nextSchemaProductBhv.<span style="color: #DD4747">updateNonstrict</span>(nextSchemaProduct);
     * </pre>
     * @param nextSchemaProduct The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(NextSchemaProduct nextSchemaProduct) {
        doUpdateNonstrict(nextSchemaProduct, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param nextSchemaProduct The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(NextSchemaProduct nextSchemaProduct) {
        doInsertOrUpdate(nextSchemaProduct, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param nextSchemaProduct The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(NextSchemaProduct nextSchemaProduct) {
        doInsertOrUpdateNonstrict(nextSchemaProduct, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * NextSchemaProduct nextSchemaProduct = new NextSchemaProduct();
     * nextSchemaProduct.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * nextSchemaProduct.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     nextSchemaProductBhv.<span style="color: #DD4747">delete</span>(nextSchemaProduct);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param nextSchemaProduct The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(NextSchemaProduct nextSchemaProduct) {
        doDelete(nextSchemaProduct, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * NextSchemaProduct nextSchemaProduct = new NextSchemaProduct();
     * nextSchemaProduct.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//nextSchemaProduct.setVersionNo(value);</span>
     * nextSchemaProductBhv.<span style="color: #DD4747">deleteNonstrict</span>(nextSchemaProduct);
     * </pre>
     * @param nextSchemaProduct The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(NextSchemaProduct nextSchemaProduct) {
        doDeleteNonstrict(nextSchemaProduct, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * NextSchemaProduct nextSchemaProduct = new NextSchemaProduct();
     * nextSchemaProduct.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//nextSchemaProduct.setVersionNo(value);</span>
     * nextSchemaProductBhv.<span style="color: #DD4747">deleteNonstrictIgnoreDeleted</span>(nextSchemaProduct);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param nextSchemaProduct The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(NextSchemaProduct nextSchemaProduct) {
        doDeleteNonstrictIgnoreDeleted(nextSchemaProduct, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(NextSchemaProduct et, final DeleteOption<NextSchemaProductCB> op) {
        assertObjectNotNull("nextSchemaProduct", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     NextSchemaProduct nextSchemaProduct = new NextSchemaProduct();
     *     nextSchemaProduct.setFooName("foo");
     *     if (...) {
     *         nextSchemaProduct.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     nextSchemaProductList.add(nextSchemaProduct);
     * }
     * nextSchemaProductBhv.<span style="color: #DD4747">batchInsert</span>(nextSchemaProductList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param nextSchemaProductList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<NextSchemaProduct> nextSchemaProductList) {
        return doBatchInsert(nextSchemaProductList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     NextSchemaProduct nextSchemaProduct = new NextSchemaProduct();
     *     nextSchemaProduct.setFooName("foo");
     *     if (...) {
     *         nextSchemaProduct.setFooPrice(123);
     *     } else {
     *         nextSchemaProduct.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//nextSchemaProduct.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     nextSchemaProductList.add(nextSchemaProduct);
     * }
     * nextSchemaProductBhv.<span style="color: #DD4747">batchUpdate</span>(nextSchemaProductList);
     * </pre>
     * @param nextSchemaProductList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<NextSchemaProduct> nextSchemaProductList) {
        return doBatchUpdate(nextSchemaProductList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * nextSchemaProductBhv.<span style="color: #DD4747">batchUpdate</span>(nextSchemaProductList, new SpecifyQuery<NextSchemaProductCB>() {
     *     public void specify(NextSchemaProductCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * nextSchemaProductBhv.<span style="color: #DD4747">batchUpdate</span>(nextSchemaProductList, new SpecifyQuery<NextSchemaProductCB>() {
     *     public void specify(NextSchemaProductCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param nextSchemaProductList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<NextSchemaProduct> nextSchemaProductList, SpecifyQuery<NextSchemaProductCB> updateColumnSpec) {
        return doBatchUpdate(nextSchemaProductList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     NextSchemaProduct nextSchemaProduct = new NextSchemaProduct();
     *     nextSchemaProduct.setFooName("foo");
     *     if (...) {
     *         nextSchemaProduct.setFooPrice(123);
     *     } else {
     *         nextSchemaProduct.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//nextSchemaProduct.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     nextSchemaProductList.add(nextSchemaProduct);
     * }
     * nextSchemaProductBhv.<span style="color: #DD4747">batchUpdate</span>(nextSchemaProductList);
     * </pre>
     * @param nextSchemaProductList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<NextSchemaProduct> nextSchemaProductList) {
        return doBatchUpdateNonstrict(nextSchemaProductList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * nextSchemaProductBhv.<span style="color: #DD4747">batchUpdateNonstrict</span>(nextSchemaProductList, new SpecifyQuery<NextSchemaProductCB>() {
     *     public void specify(NextSchemaProductCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * nextSchemaProductBhv.<span style="color: #DD4747">batchUpdateNonstrict</span>(nextSchemaProductList, new SpecifyQuery<NextSchemaProductCB>() {
     *     public void specify(NextSchemaProductCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param nextSchemaProductList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<NextSchemaProduct> nextSchemaProductList, SpecifyQuery<NextSchemaProductCB> updateColumnSpec) {
        return doBatchUpdateNonstrict(nextSchemaProductList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param nextSchemaProductList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<NextSchemaProduct> nextSchemaProductList) {
        return doBatchDelete(nextSchemaProductList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param nextSchemaProductList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<NextSchemaProduct> nextSchemaProductList) {
        return doBatchDeleteNonstrict(nextSchemaProductList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * nextSchemaProductBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;NextSchemaProduct, NextSchemaProductCB&gt;() {
     *     public ConditionBean setup(NextSchemaProduct entity, NextSchemaProductCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<NextSchemaProduct, NextSchemaProductCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * NextSchemaProduct nextSchemaProduct = new NextSchemaProduct();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//nextSchemaProduct.setPK...(value);</span>
     * nextSchemaProduct.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//nextSchemaProduct.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//nextSchemaProduct.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//nextSchemaProduct.setVersionNo(value);</span>
     * NextSchemaProductCB cb = new NextSchemaProductCB();
     * cb.query().setFoo...(value);
     * nextSchemaProductBhv.<span style="color: #DD4747">queryUpdate</span>(nextSchemaProduct, cb);
     * </pre>
     * @param nextSchemaProduct The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of NextSchemaProduct. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(NextSchemaProduct nextSchemaProduct, NextSchemaProductCB cb) {
        return doQueryUpdate(nextSchemaProduct, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * NextSchemaProductCB cb = new NextSchemaProductCB();
     * cb.query().setFoo...(value);
     * nextSchemaProductBhv.<span style="color: #DD4747">queryDelete</span>(nextSchemaProduct, cb);
     * </pre>
     * @param cb The condition-bean of NextSchemaProduct. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(NextSchemaProductCB cb) {
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
     * NextSchemaProduct nextSchemaProduct = new NextSchemaProduct();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * nextSchemaProduct.setFoo...(value);
     * nextSchemaProduct.setBar...(value);
     * InsertOption<NextSchemaProductCB> option = new InsertOption<NextSchemaProductCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * nextSchemaProductBhv.<span style="color: #DD4747">varyingInsert</span>(nextSchemaProduct, option);
     * ... = nextSchemaProduct.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param nextSchemaProduct The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(NextSchemaProduct nextSchemaProduct, InsertOption<NextSchemaProductCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(nextSchemaProduct, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * NextSchemaProduct nextSchemaProduct = new NextSchemaProduct();
     * nextSchemaProduct.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * nextSchemaProduct.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * nextSchemaProduct.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;NextSchemaProductCB&gt; option = new UpdateOption&lt;NextSchemaProductCB&gt;();
     *     option.self(new SpecifyQuery&lt;NextSchemaProductCB&gt;() {
     *         public void specify(NextSchemaProductCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     nextSchemaProductBhv.<span style="color: #DD4747">varyingUpdate</span>(nextSchemaProduct, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param nextSchemaProduct The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(NextSchemaProduct nextSchemaProduct, UpdateOption<NextSchemaProductCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(nextSchemaProduct, option);
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * NextSchemaProduct nextSchemaProduct = new NextSchemaProduct();
     * nextSchemaProduct.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * nextSchemaProduct.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//nextSchemaProduct.setVersionNo(value);</span>
     * UpdateOption&lt;NextSchemaProductCB&gt; option = new UpdateOption&lt;NextSchemaProductCB&gt;();
     * option.self(new SpecifyQuery&lt;NextSchemaProductCB&gt;() {
     *     public void specify(NextSchemaProductCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * nextSchemaProductBhv.<span style="color: #DD4747">varyingUpdateNonstrict</span>(nextSchemaProduct, option);
     * </pre>
     * @param nextSchemaProduct The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(NextSchemaProduct nextSchemaProduct, UpdateOption<NextSchemaProductCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdateNonstrict(nextSchemaProduct, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param nextSchemaProduct The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(NextSchemaProduct nextSchemaProduct, InsertOption<NextSchemaProductCB> insertOption, UpdateOption<NextSchemaProductCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdate(nextSchemaProduct, insertOption, updateOption);
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param nextSchemaProduct The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(NextSchemaProduct nextSchemaProduct, InsertOption<NextSchemaProductCB> insertOption, UpdateOption<NextSchemaProductCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdateNonstrict(nextSchemaProduct, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param nextSchemaProduct The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(NextSchemaProduct nextSchemaProduct, DeleteOption<NextSchemaProductCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(nextSchemaProduct, option);
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as deleteNonstrict(entity).
     * @param nextSchemaProduct The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(NextSchemaProduct nextSchemaProduct, DeleteOption<NextSchemaProductCB> option) {
        assertDeleteOptionNotNull(option);
        doDeleteNonstrict(nextSchemaProduct, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param nextSchemaProductList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<NextSchemaProduct> nextSchemaProductList, InsertOption<NextSchemaProductCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(nextSchemaProductList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param nextSchemaProductList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<NextSchemaProduct> nextSchemaProductList, UpdateOption<NextSchemaProductCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(nextSchemaProductList, option);
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param nextSchemaProductList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<NextSchemaProduct> nextSchemaProductList, UpdateOption<NextSchemaProductCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdateNonstrict(nextSchemaProductList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param nextSchemaProductList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<NextSchemaProduct> nextSchemaProductList, DeleteOption<NextSchemaProductCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(nextSchemaProductList, option);
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param nextSchemaProductList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<NextSchemaProduct> nextSchemaProductList, DeleteOption<NextSchemaProductCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDeleteNonstrict(nextSchemaProductList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<NextSchemaProduct, NextSchemaProductCB> setupper, InsertOption<NextSchemaProductCB> option) {
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
     * NextSchemaProduct nextSchemaProduct = new NextSchemaProduct();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//nextSchemaProduct.setPK...(value);</span>
     * nextSchemaProduct.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//nextSchemaProduct.setVersionNo(value);</span>
     * NextSchemaProductCB cb = new NextSchemaProductCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;NextSchemaProductCB&gt; option = new UpdateOption&lt;NextSchemaProductCB&gt;();
     * option.self(new SpecifyQuery&lt;NextSchemaProductCB&gt;() {
     *     public void specify(NextSchemaProductCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * nextSchemaProductBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(nextSchemaProduct, cb, option);
     * </pre>
     * @param nextSchemaProduct The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of NextSchemaProduct. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(NextSchemaProduct nextSchemaProduct, NextSchemaProductCB cb, UpdateOption<NextSchemaProductCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(nextSchemaProduct, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of NextSchemaProduct. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(NextSchemaProductCB cb, DeleteOption<NextSchemaProductCB> option) {
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
    public OutsideSqlBasicExecutor<NextSchemaProductBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                Optimistic Lock Info
    //                                                                ====================
    @Override
    protected boolean hasVersionNoValue(Entity et) { return downcast(et).getVersionNo() != null; }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends NextSchemaProduct> typeOfSelectedEntity() { return NextSchemaProduct.class; }
    protected Class<NextSchemaProduct> typeOfHandlingEntity() { return NextSchemaProduct.class; }
    protected Class<NextSchemaProductCB> typeOfHandlingConditionBean() { return NextSchemaProductCB.class; }
}
