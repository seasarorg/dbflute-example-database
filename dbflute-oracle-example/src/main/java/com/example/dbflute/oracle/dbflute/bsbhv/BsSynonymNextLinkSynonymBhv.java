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
 * The behavior of SYNONYM_NEXT_LINK_SYNONYM as SYNONYM. <br />
 * <pre>
 * [primary key]
 *     PRODUCT_ID
 *
 * [column]
 *     PRODUCT_ID, PRODUCT_NAME, PRODUCT_HANDLE_CODE, PRODUCT_STATUS_CODE, REGISTER_DATETIME, REGISTER_USER, REGISTER_PROCESS, UPDATE_DATETIME, UPDATE_USER, UPDATE_PROCESS, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     VERSION_NO
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
 * @author oracleman
 */
public abstract class BsSynonymNextLinkSynonymBhv extends AbstractBehaviorWritable<SynonymNextLinkSynonym, SynonymNextLinkSynonymCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public SynonymNextLinkSynonymDbm getDBMeta() { return SynonymNextLinkSynonymDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public SynonymNextLinkSynonymDbm getMyDBMeta() { return SynonymNextLinkSynonymDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public SynonymNextLinkSynonymCB newConditionBean() { return new SynonymNextLinkSynonymCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public SynonymNextLinkSynonym newMyEntity() { return new SynonymNextLinkSynonym(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public SynonymNextLinkSynonymCB newMyConditionBean() { return new SynonymNextLinkSynonymCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * SynonymNextLinkSynonymCB cb = new SynonymNextLinkSynonymCB();
     * cb.query().setFoo...(value);
     * int count = synonymNextLinkSynonymBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of SynonymNextLinkSynonym. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(SynonymNextLinkSynonymCB cb) {
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
     * SynonymNextLinkSynonymCB cb = new SynonymNextLinkSynonymCB();
     * cb.query().setFoo...(value);
     * SynonymNextLinkSynonym synonymNextLinkSynonym = synonymNextLinkSynonymBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (synonymNextLinkSynonym != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = synonymNextLinkSynonym.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of SynonymNextLinkSynonym. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymNextLinkSynonym selectEntity(SynonymNextLinkSynonymCB cb) {
        return facadeSelectEntity(cb);
    }

    protected SynonymNextLinkSynonym facadeSelectEntity(SynonymNextLinkSynonymCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends SynonymNextLinkSynonym> OptionalEntity<ENTITY> doSelectOptionalEntity(SynonymNextLinkSynonymCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * SynonymNextLinkSynonymCB cb = new SynonymNextLinkSynonymCB();
     * cb.query().setFoo...(value);
     * SynonymNextLinkSynonym synonymNextLinkSynonym = synonymNextLinkSynonymBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = synonymNextLinkSynonym.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of SynonymNextLinkSynonym. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymNextLinkSynonym selectEntityWithDeletedCheck(SynonymNextLinkSynonymCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param productId : PK, NotNull, NUMBER(16). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymNextLinkSynonym selectByPKValue(Long productId) {
        return facadeSelectByPKValue(productId);
    }

    protected SynonymNextLinkSynonym facadeSelectByPKValue(Long productId) {
        return doSelectByPK(productId, typeOfSelectedEntity());
    }

    protected <ENTITY extends SynonymNextLinkSynonym> ENTITY doSelectByPK(Long productId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(productId), tp);
    }

    protected <ENTITY extends SynonymNextLinkSynonym> OptionalEntity<ENTITY> doSelectOptionalByPK(Long productId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(productId, tp), productId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param productId : PK, NotNull, NUMBER(16). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymNextLinkSynonym selectByPKValueWithDeletedCheck(Long productId) {
        return doSelectByPKWithDeletedCheck(productId, typeOfSelectedEntity());
    }

    protected <ENTITY extends SynonymNextLinkSynonym> ENTITY doSelectByPKWithDeletedCheck(Long productId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(productId), tp);
    }

    protected SynonymNextLinkSynonymCB xprepareCBAsPK(Long productId) {
        assertObjectNotNull("productId", productId);
        return newConditionBean().acceptPK(productId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * SynonymNextLinkSynonymCB cb = new SynonymNextLinkSynonymCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;SynonymNextLinkSynonym&gt; synonymNextLinkSynonymList = synonymNextLinkSynonymBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (SynonymNextLinkSynonym synonymNextLinkSynonym : synonymNextLinkSynonymList) {
     *     ... = synonymNextLinkSynonym.get...();
     * }
     * </pre>
     * @param cb The condition-bean of SynonymNextLinkSynonym. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<SynonymNextLinkSynonym> selectList(SynonymNextLinkSynonymCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * SynonymNextLinkSynonymCB cb = new SynonymNextLinkSynonymCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;SynonymNextLinkSynonym&gt; page = synonymNextLinkSynonymBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (SynonymNextLinkSynonym synonymNextLinkSynonym : page) {
     *     ... = synonymNextLinkSynonym.get...();
     * }
     * </pre>
     * @param cb The condition-bean of SynonymNextLinkSynonym. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<SynonymNextLinkSynonym> selectPage(SynonymNextLinkSynonymCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * SynonymNextLinkSynonymCB cb = new SynonymNextLinkSynonymCB();
     * cb.query().setFoo...(value);
     * synonymNextLinkSynonymBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;SynonymNextLinkSynonym&gt;() {
     *     public void handle(SynonymNextLinkSynonym entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of SynonymNextLinkSynonym. (NotNull)
     * @param entityRowHandler The handler of entity row of SynonymNextLinkSynonym. (NotNull)
     */
    public void selectCursor(SynonymNextLinkSynonymCB cb, EntityRowHandler<SynonymNextLinkSynonym> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * synonymNextLinkSynonymBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(SynonymNextLinkSynonymCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<SynonymNextLinkSynonymCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param synonymNextLinkSynonymList The entity list of synonymNextLinkSynonym. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<SynonymNextLinkSynonym> synonymNextLinkSynonymList, ReferrerLoaderHandler<LoaderOfSynonymNextLinkSynonym> handler) {
        xassLRArg(synonymNextLinkSynonymList, handler);
        handler.handle(new LoaderOfSynonymNextLinkSynonym().ready(synonymNextLinkSynonymList, _behaviorSelector));
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
     * @param synonymNextLinkSynonym The entity of synonymNextLinkSynonym. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(SynonymNextLinkSynonym synonymNextLinkSynonym, ReferrerLoaderHandler<LoaderOfSynonymNextLinkSynonym> handler) {
        xassLRArg(synonymNextLinkSynonym, handler);
        handler.handle(new LoaderOfSynonymNextLinkSynonym().ready(xnewLRAryLs(synonymNextLinkSynonym), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key productId.
     * @param synonymNextLinkSynonymList The list of synonymNextLinkSynonym. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractProductIdList(List<SynonymNextLinkSynonym> synonymNextLinkSynonymList)
    { return helpExtractListInternally(synonymNextLinkSynonymList, "productId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * SynonymNextLinkSynonym synonymNextLinkSynonym = new SynonymNextLinkSynonym();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * synonymNextLinkSynonym.setFoo...(value);
     * synonymNextLinkSynonym.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSynonym.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSynonym.set...;</span>
     * synonymNextLinkSynonymBhv.<span style="color: #DD4747">insert</span>(synonymNextLinkSynonym);
     * ... = synonymNextLinkSynonym.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param synonymNextLinkSynonym The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(SynonymNextLinkSynonym synonymNextLinkSynonym) {
        doInsert(synonymNextLinkSynonym, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * SynonymNextLinkSynonym synonymNextLinkSynonym = new SynonymNextLinkSynonym();
     * synonymNextLinkSynonym.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * synonymNextLinkSynonym.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSynonym.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSynonym.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * synonymNextLinkSynonym.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     synonymNextLinkSynonymBhv.<span style="color: #DD4747">update</span>(synonymNextLinkSynonym);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param synonymNextLinkSynonym The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(SynonymNextLinkSynonym synonymNextLinkSynonym) {
        doUpdate(synonymNextLinkSynonym, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * SynonymNextLinkSynonym synonymNextLinkSynonym = new SynonymNextLinkSynonym();
     * synonymNextLinkSynonym.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * synonymNextLinkSynonym.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSynonym.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSynonym.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSynonym.setVersionNo(value);</span>
     * synonymNextLinkSynonymBhv.<span style="color: #DD4747">updateNonstrict</span>(synonymNextLinkSynonym);
     * </pre>
     * @param synonymNextLinkSynonym The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(SynonymNextLinkSynonym synonymNextLinkSynonym) {
        doUpdateNonstrict(synonymNextLinkSynonym, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param synonymNextLinkSynonym The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(SynonymNextLinkSynonym synonymNextLinkSynonym) {
        doInsertOrUpdate(synonymNextLinkSynonym, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param synonymNextLinkSynonym The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(SynonymNextLinkSynonym synonymNextLinkSynonym) {
        doInsertOrUpdateNonstrict(synonymNextLinkSynonym, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * SynonymNextLinkSynonym synonymNextLinkSynonym = new SynonymNextLinkSynonym();
     * synonymNextLinkSynonym.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * synonymNextLinkSynonym.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     synonymNextLinkSynonymBhv.<span style="color: #DD4747">delete</span>(synonymNextLinkSynonym);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param synonymNextLinkSynonym The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(SynonymNextLinkSynonym synonymNextLinkSynonym) {
        doDelete(synonymNextLinkSynonym, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * SynonymNextLinkSynonym synonymNextLinkSynonym = new SynonymNextLinkSynonym();
     * synonymNextLinkSynonym.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSynonym.setVersionNo(value);</span>
     * synonymNextLinkSynonymBhv.<span style="color: #DD4747">deleteNonstrict</span>(synonymNextLinkSynonym);
     * </pre>
     * @param synonymNextLinkSynonym The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(SynonymNextLinkSynonym synonymNextLinkSynonym) {
        doDeleteNonstrict(synonymNextLinkSynonym, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * SynonymNextLinkSynonym synonymNextLinkSynonym = new SynonymNextLinkSynonym();
     * synonymNextLinkSynonym.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSynonym.setVersionNo(value);</span>
     * synonymNextLinkSynonymBhv.<span style="color: #DD4747">deleteNonstrictIgnoreDeleted</span>(synonymNextLinkSynonym);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param synonymNextLinkSynonym The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(SynonymNextLinkSynonym synonymNextLinkSynonym) {
        doDeleteNonstrictIgnoreDeleted(synonymNextLinkSynonym, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(SynonymNextLinkSynonym et, final DeleteOption<SynonymNextLinkSynonymCB> op) {
        assertObjectNotNull("synonymNextLinkSynonym", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     SynonymNextLinkSynonym synonymNextLinkSynonym = new SynonymNextLinkSynonym();
     *     synonymNextLinkSynonym.setFooName("foo");
     *     if (...) {
     *         synonymNextLinkSynonym.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     synonymNextLinkSynonymList.add(synonymNextLinkSynonym);
     * }
     * synonymNextLinkSynonymBhv.<span style="color: #DD4747">batchInsert</span>(synonymNextLinkSynonymList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param synonymNextLinkSynonymList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<SynonymNextLinkSynonym> synonymNextLinkSynonymList) {
        return doBatchInsert(synonymNextLinkSynonymList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     SynonymNextLinkSynonym synonymNextLinkSynonym = new SynonymNextLinkSynonym();
     *     synonymNextLinkSynonym.setFooName("foo");
     *     if (...) {
     *         synonymNextLinkSynonym.setFooPrice(123);
     *     } else {
     *         synonymNextLinkSynonym.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//synonymNextLinkSynonym.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     synonymNextLinkSynonymList.add(synonymNextLinkSynonym);
     * }
     * synonymNextLinkSynonymBhv.<span style="color: #DD4747">batchUpdate</span>(synonymNextLinkSynonymList);
     * </pre>
     * @param synonymNextLinkSynonymList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<SynonymNextLinkSynonym> synonymNextLinkSynonymList) {
        return doBatchUpdate(synonymNextLinkSynonymList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * synonymNextLinkSynonymBhv.<span style="color: #DD4747">batchUpdate</span>(synonymNextLinkSynonymList, new SpecifyQuery<SynonymNextLinkSynonymCB>() {
     *     public void specify(SynonymNextLinkSynonymCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * synonymNextLinkSynonymBhv.<span style="color: #DD4747">batchUpdate</span>(synonymNextLinkSynonymList, new SpecifyQuery<SynonymNextLinkSynonymCB>() {
     *     public void specify(SynonymNextLinkSynonymCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param synonymNextLinkSynonymList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<SynonymNextLinkSynonym> synonymNextLinkSynonymList, SpecifyQuery<SynonymNextLinkSynonymCB> updateColumnSpec) {
        return doBatchUpdate(synonymNextLinkSynonymList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     SynonymNextLinkSynonym synonymNextLinkSynonym = new SynonymNextLinkSynonym();
     *     synonymNextLinkSynonym.setFooName("foo");
     *     if (...) {
     *         synonymNextLinkSynonym.setFooPrice(123);
     *     } else {
     *         synonymNextLinkSynonym.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//synonymNextLinkSynonym.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     synonymNextLinkSynonymList.add(synonymNextLinkSynonym);
     * }
     * synonymNextLinkSynonymBhv.<span style="color: #DD4747">batchUpdate</span>(synonymNextLinkSynonymList);
     * </pre>
     * @param synonymNextLinkSynonymList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<SynonymNextLinkSynonym> synonymNextLinkSynonymList) {
        return doBatchUpdateNonstrict(synonymNextLinkSynonymList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * synonymNextLinkSynonymBhv.<span style="color: #DD4747">batchUpdateNonstrict</span>(synonymNextLinkSynonymList, new SpecifyQuery<SynonymNextLinkSynonymCB>() {
     *     public void specify(SynonymNextLinkSynonymCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * synonymNextLinkSynonymBhv.<span style="color: #DD4747">batchUpdateNonstrict</span>(synonymNextLinkSynonymList, new SpecifyQuery<SynonymNextLinkSynonymCB>() {
     *     public void specify(SynonymNextLinkSynonymCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param synonymNextLinkSynonymList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<SynonymNextLinkSynonym> synonymNextLinkSynonymList, SpecifyQuery<SynonymNextLinkSynonymCB> updateColumnSpec) {
        return doBatchUpdateNonstrict(synonymNextLinkSynonymList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param synonymNextLinkSynonymList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<SynonymNextLinkSynonym> synonymNextLinkSynonymList) {
        return doBatchDelete(synonymNextLinkSynonymList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param synonymNextLinkSynonymList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<SynonymNextLinkSynonym> synonymNextLinkSynonymList) {
        return doBatchDeleteNonstrict(synonymNextLinkSynonymList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * synonymNextLinkSynonymBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;SynonymNextLinkSynonym, SynonymNextLinkSynonymCB&gt;() {
     *     public ConditionBean setup(SynonymNextLinkSynonym entity, SynonymNextLinkSynonymCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<SynonymNextLinkSynonym, SynonymNextLinkSynonymCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * SynonymNextLinkSynonym synonymNextLinkSynonym = new SynonymNextLinkSynonym();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSynonym.setPK...(value);</span>
     * synonymNextLinkSynonym.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSynonym.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSynonym.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSynonym.setVersionNo(value);</span>
     * SynonymNextLinkSynonymCB cb = new SynonymNextLinkSynonymCB();
     * cb.query().setFoo...(value);
     * synonymNextLinkSynonymBhv.<span style="color: #DD4747">queryUpdate</span>(synonymNextLinkSynonym, cb);
     * </pre>
     * @param synonymNextLinkSynonym The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of SynonymNextLinkSynonym. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(SynonymNextLinkSynonym synonymNextLinkSynonym, SynonymNextLinkSynonymCB cb) {
        return doQueryUpdate(synonymNextLinkSynonym, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * SynonymNextLinkSynonymCB cb = new SynonymNextLinkSynonymCB();
     * cb.query().setFoo...(value);
     * synonymNextLinkSynonymBhv.<span style="color: #DD4747">queryDelete</span>(synonymNextLinkSynonym, cb);
     * </pre>
     * @param cb The condition-bean of SynonymNextLinkSynonym. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(SynonymNextLinkSynonymCB cb) {
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
     * SynonymNextLinkSynonym synonymNextLinkSynonym = new SynonymNextLinkSynonym();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * synonymNextLinkSynonym.setFoo...(value);
     * synonymNextLinkSynonym.setBar...(value);
     * InsertOption<SynonymNextLinkSynonymCB> option = new InsertOption<SynonymNextLinkSynonymCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * synonymNextLinkSynonymBhv.<span style="color: #DD4747">varyingInsert</span>(synonymNextLinkSynonym, option);
     * ... = synonymNextLinkSynonym.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param synonymNextLinkSynonym The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(SynonymNextLinkSynonym synonymNextLinkSynonym, InsertOption<SynonymNextLinkSynonymCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(synonymNextLinkSynonym, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * SynonymNextLinkSynonym synonymNextLinkSynonym = new SynonymNextLinkSynonym();
     * synonymNextLinkSynonym.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * synonymNextLinkSynonym.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * synonymNextLinkSynonym.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;SynonymNextLinkSynonymCB&gt; option = new UpdateOption&lt;SynonymNextLinkSynonymCB&gt;();
     *     option.self(new SpecifyQuery&lt;SynonymNextLinkSynonymCB&gt;() {
     *         public void specify(SynonymNextLinkSynonymCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     synonymNextLinkSynonymBhv.<span style="color: #DD4747">varyingUpdate</span>(synonymNextLinkSynonym, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param synonymNextLinkSynonym The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(SynonymNextLinkSynonym synonymNextLinkSynonym, UpdateOption<SynonymNextLinkSynonymCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(synonymNextLinkSynonym, option);
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * SynonymNextLinkSynonym synonymNextLinkSynonym = new SynonymNextLinkSynonym();
     * synonymNextLinkSynonym.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * synonymNextLinkSynonym.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSynonym.setVersionNo(value);</span>
     * UpdateOption&lt;SynonymNextLinkSynonymCB&gt; option = new UpdateOption&lt;SynonymNextLinkSynonymCB&gt;();
     * option.self(new SpecifyQuery&lt;SynonymNextLinkSynonymCB&gt;() {
     *     public void specify(SynonymNextLinkSynonymCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * synonymNextLinkSynonymBhv.<span style="color: #DD4747">varyingUpdateNonstrict</span>(synonymNextLinkSynonym, option);
     * </pre>
     * @param synonymNextLinkSynonym The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(SynonymNextLinkSynonym synonymNextLinkSynonym, UpdateOption<SynonymNextLinkSynonymCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdateNonstrict(synonymNextLinkSynonym, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param synonymNextLinkSynonym The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(SynonymNextLinkSynonym synonymNextLinkSynonym, InsertOption<SynonymNextLinkSynonymCB> insertOption, UpdateOption<SynonymNextLinkSynonymCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdate(synonymNextLinkSynonym, insertOption, updateOption);
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param synonymNextLinkSynonym The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(SynonymNextLinkSynonym synonymNextLinkSynonym, InsertOption<SynonymNextLinkSynonymCB> insertOption, UpdateOption<SynonymNextLinkSynonymCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdateNonstrict(synonymNextLinkSynonym, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param synonymNextLinkSynonym The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(SynonymNextLinkSynonym synonymNextLinkSynonym, DeleteOption<SynonymNextLinkSynonymCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(synonymNextLinkSynonym, option);
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as deleteNonstrict(entity).
     * @param synonymNextLinkSynonym The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(SynonymNextLinkSynonym synonymNextLinkSynonym, DeleteOption<SynonymNextLinkSynonymCB> option) {
        assertDeleteOptionNotNull(option);
        doDeleteNonstrict(synonymNextLinkSynonym, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param synonymNextLinkSynonymList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<SynonymNextLinkSynonym> synonymNextLinkSynonymList, InsertOption<SynonymNextLinkSynonymCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(synonymNextLinkSynonymList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param synonymNextLinkSynonymList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<SynonymNextLinkSynonym> synonymNextLinkSynonymList, UpdateOption<SynonymNextLinkSynonymCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(synonymNextLinkSynonymList, option);
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param synonymNextLinkSynonymList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<SynonymNextLinkSynonym> synonymNextLinkSynonymList, UpdateOption<SynonymNextLinkSynonymCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdateNonstrict(synonymNextLinkSynonymList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param synonymNextLinkSynonymList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<SynonymNextLinkSynonym> synonymNextLinkSynonymList, DeleteOption<SynonymNextLinkSynonymCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(synonymNextLinkSynonymList, option);
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param synonymNextLinkSynonymList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<SynonymNextLinkSynonym> synonymNextLinkSynonymList, DeleteOption<SynonymNextLinkSynonymCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDeleteNonstrict(synonymNextLinkSynonymList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<SynonymNextLinkSynonym, SynonymNextLinkSynonymCB> setupper, InsertOption<SynonymNextLinkSynonymCB> option) {
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
     * SynonymNextLinkSynonym synonymNextLinkSynonym = new SynonymNextLinkSynonym();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSynonym.setPK...(value);</span>
     * synonymNextLinkSynonym.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSynonym.setVersionNo(value);</span>
     * SynonymNextLinkSynonymCB cb = new SynonymNextLinkSynonymCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;SynonymNextLinkSynonymCB&gt; option = new UpdateOption&lt;SynonymNextLinkSynonymCB&gt;();
     * option.self(new SpecifyQuery&lt;SynonymNextLinkSynonymCB&gt;() {
     *     public void specify(SynonymNextLinkSynonymCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * synonymNextLinkSynonymBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(synonymNextLinkSynonym, cb, option);
     * </pre>
     * @param synonymNextLinkSynonym The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of SynonymNextLinkSynonym. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(SynonymNextLinkSynonym synonymNextLinkSynonym, SynonymNextLinkSynonymCB cb, UpdateOption<SynonymNextLinkSynonymCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(synonymNextLinkSynonym, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of SynonymNextLinkSynonym. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(SynonymNextLinkSynonymCB cb, DeleteOption<SynonymNextLinkSynonymCB> option) {
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
    public OutsideSqlBasicExecutor<SynonymNextLinkSynonymBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<SynonymNextLinkSynonymBhv> facadeExecutor = doOutsideSql();
        return facadeExecutor.xbasicExecutor(); // variable to resolve generic type
    }

    // ===================================================================================
    //                                                                Optimistic Lock Info
    //                                                                ====================
    @Override
    protected boolean hasVersionNoValue(Entity et) { return downcast(et).getVersionNo() != null; }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends SynonymNextLinkSynonym> typeOfSelectedEntity() { return SynonymNextLinkSynonym.class; }
    protected Class<SynonymNextLinkSynonym> typeOfHandlingEntity() { return SynonymNextLinkSynonym.class; }
    protected Class<SynonymNextLinkSynonymCB> typeOfHandlingConditionBean() { return SynonymNextLinkSynonymCB.class; }
}
