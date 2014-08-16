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
 * The behavior of SYNONYM_NEXT_LINK_TABLE as SYNONYM. <br />
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
public abstract class BsSynonymNextLinkTableBhv extends AbstractBehaviorWritable<SynonymNextLinkTable, SynonymNextLinkTableCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public DBMeta getDBMeta() { return SynonymNextLinkTableDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public SynonymNextLinkTableDbm getMyDBMeta() { return SynonymNextLinkTableDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public SynonymNextLinkTableCB newConditionBean() { return new SynonymNextLinkTableCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public SynonymNextLinkTable newMyEntity() { return new SynonymNextLinkTable(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public SynonymNextLinkTableCB newMyConditionBean() { return new SynonymNextLinkTableCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * SynonymNextLinkTableCB cb = new SynonymNextLinkTableCB();
     * cb.query().setFoo...(value);
     * int count = synonymNextLinkTableBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of SynonymNextLinkTable. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(SynonymNextLinkTableCB cb) {
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
     * SynonymNextLinkTableCB cb = new SynonymNextLinkTableCB();
     * cb.query().setFoo...(value);
     * SynonymNextLinkTable synonymNextLinkTable = synonymNextLinkTableBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (synonymNextLinkTable != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = synonymNextLinkTable.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of SynonymNextLinkTable. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymNextLinkTable selectEntity(SynonymNextLinkTableCB cb) {
        return facadeSelectEntity(cb);
    }

    protected SynonymNextLinkTable facadeSelectEntity(SynonymNextLinkTableCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends SynonymNextLinkTable> OptionalEntity<ENTITY> doSelectOptionalEntity(SynonymNextLinkTableCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * SynonymNextLinkTableCB cb = new SynonymNextLinkTableCB();
     * cb.query().setFoo...(value);
     * SynonymNextLinkTable synonymNextLinkTable = synonymNextLinkTableBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = synonymNextLinkTable.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of SynonymNextLinkTable. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymNextLinkTable selectEntityWithDeletedCheck(SynonymNextLinkTableCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param productId : PK, NotNull, NUMBER(16). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymNextLinkTable selectByPKValue(Long productId) {
        return facadeSelectByPKValue(productId);
    }

    protected SynonymNextLinkTable facadeSelectByPKValue(Long productId) {
        return doSelectByPK(productId, typeOfSelectedEntity());
    }

    protected <ENTITY extends SynonymNextLinkTable> ENTITY doSelectByPK(Long productId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(productId), tp);
    }

    protected <ENTITY extends SynonymNextLinkTable> OptionalEntity<ENTITY> doSelectOptionalByPK(Long productId, Class<? extends ENTITY> tp) {
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
    public SynonymNextLinkTable selectByPKValueWithDeletedCheck(Long productId) {
        return doSelectByPKWithDeletedCheck(productId, typeOfSelectedEntity());
    }

    protected <ENTITY extends SynonymNextLinkTable> ENTITY doSelectByPKWithDeletedCheck(Long productId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(productId), tp);
    }

    protected SynonymNextLinkTableCB xprepareCBAsPK(Long productId) {
        assertObjectNotNull("productId", productId);
        return newConditionBean().acceptPK(productId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * SynonymNextLinkTableCB cb = new SynonymNextLinkTableCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;SynonymNextLinkTable&gt; synonymNextLinkTableList = synonymNextLinkTableBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (SynonymNextLinkTable synonymNextLinkTable : synonymNextLinkTableList) {
     *     ... = synonymNextLinkTable.get...();
     * }
     * </pre>
     * @param cb The condition-bean of SynonymNextLinkTable. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<SynonymNextLinkTable> selectList(SynonymNextLinkTableCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * SynonymNextLinkTableCB cb = new SynonymNextLinkTableCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;SynonymNextLinkTable&gt; page = synonymNextLinkTableBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (SynonymNextLinkTable synonymNextLinkTable : page) {
     *     ... = synonymNextLinkTable.get...();
     * }
     * </pre>
     * @param cb The condition-bean of SynonymNextLinkTable. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<SynonymNextLinkTable> selectPage(SynonymNextLinkTableCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * SynonymNextLinkTableCB cb = new SynonymNextLinkTableCB();
     * cb.query().setFoo...(value);
     * synonymNextLinkTableBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;SynonymNextLinkTable&gt;() {
     *     public void handle(SynonymNextLinkTable entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of SynonymNextLinkTable. (NotNull)
     * @param entityRowHandler The handler of entity row of SynonymNextLinkTable. (NotNull)
     */
    public void selectCursor(SynonymNextLinkTableCB cb, EntityRowHandler<SynonymNextLinkTable> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * synonymNextLinkTableBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(SynonymNextLinkTableCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<SynonymNextLinkTableCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param synonymNextLinkTableList The entity list of synonymNextLinkTable. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<SynonymNextLinkTable> synonymNextLinkTableList, ReferrerLoaderHandler<LoaderOfSynonymNextLinkTable> handler) {
        xassLRArg(synonymNextLinkTableList, handler);
        handler.handle(new LoaderOfSynonymNextLinkTable().ready(synonymNextLinkTableList, _behaviorSelector));
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
     * @param synonymNextLinkTable The entity of synonymNextLinkTable. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(SynonymNextLinkTable synonymNextLinkTable, ReferrerLoaderHandler<LoaderOfSynonymNextLinkTable> handler) {
        xassLRArg(synonymNextLinkTable, handler);
        handler.handle(new LoaderOfSynonymNextLinkTable().ready(xnewLRAryLs(synonymNextLinkTable), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key productId.
     * @param synonymNextLinkTableList The list of synonymNextLinkTable. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractProductIdList(List<SynonymNextLinkTable> synonymNextLinkTableList)
    { return helpExtractListInternally(synonymNextLinkTableList, "productId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * SynonymNextLinkTable synonymNextLinkTable = new SynonymNextLinkTable();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * synonymNextLinkTable.setFoo...(value);
     * synonymNextLinkTable.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymNextLinkTable.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymNextLinkTable.set...;</span>
     * synonymNextLinkTableBhv.<span style="color: #DD4747">insert</span>(synonymNextLinkTable);
     * ... = synonymNextLinkTable.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param synonymNextLinkTable The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(SynonymNextLinkTable synonymNextLinkTable) {
        doInsert(synonymNextLinkTable, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * SynonymNextLinkTable synonymNextLinkTable = new SynonymNextLinkTable();
     * synonymNextLinkTable.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * synonymNextLinkTable.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymNextLinkTable.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymNextLinkTable.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * synonymNextLinkTable.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     synonymNextLinkTableBhv.<span style="color: #DD4747">update</span>(synonymNextLinkTable);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param synonymNextLinkTable The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(SynonymNextLinkTable synonymNextLinkTable) {
        doUpdate(synonymNextLinkTable, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * SynonymNextLinkTable synonymNextLinkTable = new SynonymNextLinkTable();
     * synonymNextLinkTable.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * synonymNextLinkTable.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymNextLinkTable.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymNextLinkTable.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymNextLinkTable.setVersionNo(value);</span>
     * synonymNextLinkTableBhv.<span style="color: #DD4747">updateNonstrict</span>(synonymNextLinkTable);
     * </pre>
     * @param synonymNextLinkTable The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(SynonymNextLinkTable synonymNextLinkTable) {
        doUpdateNonstrict(synonymNextLinkTable, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param synonymNextLinkTable The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(SynonymNextLinkTable synonymNextLinkTable) {
        doInsertOrUpdate(synonymNextLinkTable, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param synonymNextLinkTable The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(SynonymNextLinkTable synonymNextLinkTable) {
        doInsertOrUpdateNonstrict(synonymNextLinkTable, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * SynonymNextLinkTable synonymNextLinkTable = new SynonymNextLinkTable();
     * synonymNextLinkTable.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * synonymNextLinkTable.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     synonymNextLinkTableBhv.<span style="color: #DD4747">delete</span>(synonymNextLinkTable);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param synonymNextLinkTable The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(SynonymNextLinkTable synonymNextLinkTable) {
        doDelete(synonymNextLinkTable, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * SynonymNextLinkTable synonymNextLinkTable = new SynonymNextLinkTable();
     * synonymNextLinkTable.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymNextLinkTable.setVersionNo(value);</span>
     * synonymNextLinkTableBhv.<span style="color: #DD4747">deleteNonstrict</span>(synonymNextLinkTable);
     * </pre>
     * @param synonymNextLinkTable The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(SynonymNextLinkTable synonymNextLinkTable) {
        doDeleteNonstrict(synonymNextLinkTable, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * SynonymNextLinkTable synonymNextLinkTable = new SynonymNextLinkTable();
     * synonymNextLinkTable.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymNextLinkTable.setVersionNo(value);</span>
     * synonymNextLinkTableBhv.<span style="color: #DD4747">deleteNonstrictIgnoreDeleted</span>(synonymNextLinkTable);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param synonymNextLinkTable The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(SynonymNextLinkTable synonymNextLinkTable) {
        doDeleteNonstrictIgnoreDeleted(synonymNextLinkTable, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(SynonymNextLinkTable et, final DeleteOption<SynonymNextLinkTableCB> op) {
        assertObjectNotNull("synonymNextLinkTable", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     SynonymNextLinkTable synonymNextLinkTable = new SynonymNextLinkTable();
     *     synonymNextLinkTable.setFooName("foo");
     *     if (...) {
     *         synonymNextLinkTable.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     synonymNextLinkTableList.add(synonymNextLinkTable);
     * }
     * synonymNextLinkTableBhv.<span style="color: #DD4747">batchInsert</span>(synonymNextLinkTableList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param synonymNextLinkTableList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<SynonymNextLinkTable> synonymNextLinkTableList) {
        return doBatchInsert(synonymNextLinkTableList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     SynonymNextLinkTable synonymNextLinkTable = new SynonymNextLinkTable();
     *     synonymNextLinkTable.setFooName("foo");
     *     if (...) {
     *         synonymNextLinkTable.setFooPrice(123);
     *     } else {
     *         synonymNextLinkTable.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//synonymNextLinkTable.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     synonymNextLinkTableList.add(synonymNextLinkTable);
     * }
     * synonymNextLinkTableBhv.<span style="color: #DD4747">batchUpdate</span>(synonymNextLinkTableList);
     * </pre>
     * @param synonymNextLinkTableList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<SynonymNextLinkTable> synonymNextLinkTableList) {
        return doBatchUpdate(synonymNextLinkTableList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * synonymNextLinkTableBhv.<span style="color: #DD4747">batchUpdate</span>(synonymNextLinkTableList, new SpecifyQuery<SynonymNextLinkTableCB>() {
     *     public void specify(SynonymNextLinkTableCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * synonymNextLinkTableBhv.<span style="color: #DD4747">batchUpdate</span>(synonymNextLinkTableList, new SpecifyQuery<SynonymNextLinkTableCB>() {
     *     public void specify(SynonymNextLinkTableCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param synonymNextLinkTableList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<SynonymNextLinkTable> synonymNextLinkTableList, SpecifyQuery<SynonymNextLinkTableCB> updateColumnSpec) {
        return doBatchUpdate(synonymNextLinkTableList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     SynonymNextLinkTable synonymNextLinkTable = new SynonymNextLinkTable();
     *     synonymNextLinkTable.setFooName("foo");
     *     if (...) {
     *         synonymNextLinkTable.setFooPrice(123);
     *     } else {
     *         synonymNextLinkTable.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//synonymNextLinkTable.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     synonymNextLinkTableList.add(synonymNextLinkTable);
     * }
     * synonymNextLinkTableBhv.<span style="color: #DD4747">batchUpdate</span>(synonymNextLinkTableList);
     * </pre>
     * @param synonymNextLinkTableList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<SynonymNextLinkTable> synonymNextLinkTableList) {
        return doBatchUpdateNonstrict(synonymNextLinkTableList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * synonymNextLinkTableBhv.<span style="color: #DD4747">batchUpdateNonstrict</span>(synonymNextLinkTableList, new SpecifyQuery<SynonymNextLinkTableCB>() {
     *     public void specify(SynonymNextLinkTableCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * synonymNextLinkTableBhv.<span style="color: #DD4747">batchUpdateNonstrict</span>(synonymNextLinkTableList, new SpecifyQuery<SynonymNextLinkTableCB>() {
     *     public void specify(SynonymNextLinkTableCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param synonymNextLinkTableList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<SynonymNextLinkTable> synonymNextLinkTableList, SpecifyQuery<SynonymNextLinkTableCB> updateColumnSpec) {
        return doBatchUpdateNonstrict(synonymNextLinkTableList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param synonymNextLinkTableList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<SynonymNextLinkTable> synonymNextLinkTableList) {
        return doBatchDelete(synonymNextLinkTableList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param synonymNextLinkTableList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<SynonymNextLinkTable> synonymNextLinkTableList) {
        return doBatchDeleteNonstrict(synonymNextLinkTableList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * synonymNextLinkTableBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;SynonymNextLinkTable, SynonymNextLinkTableCB&gt;() {
     *     public ConditionBean setup(SynonymNextLinkTable entity, SynonymNextLinkTableCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<SynonymNextLinkTable, SynonymNextLinkTableCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * SynonymNextLinkTable synonymNextLinkTable = new SynonymNextLinkTable();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//synonymNextLinkTable.setPK...(value);</span>
     * synonymNextLinkTable.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymNextLinkTable.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymNextLinkTable.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymNextLinkTable.setVersionNo(value);</span>
     * SynonymNextLinkTableCB cb = new SynonymNextLinkTableCB();
     * cb.query().setFoo...(value);
     * synonymNextLinkTableBhv.<span style="color: #DD4747">queryUpdate</span>(synonymNextLinkTable, cb);
     * </pre>
     * @param synonymNextLinkTable The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of SynonymNextLinkTable. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(SynonymNextLinkTable synonymNextLinkTable, SynonymNextLinkTableCB cb) {
        return doQueryUpdate(synonymNextLinkTable, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * SynonymNextLinkTableCB cb = new SynonymNextLinkTableCB();
     * cb.query().setFoo...(value);
     * synonymNextLinkTableBhv.<span style="color: #DD4747">queryDelete</span>(synonymNextLinkTable, cb);
     * </pre>
     * @param cb The condition-bean of SynonymNextLinkTable. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(SynonymNextLinkTableCB cb) {
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
     * SynonymNextLinkTable synonymNextLinkTable = new SynonymNextLinkTable();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * synonymNextLinkTable.setFoo...(value);
     * synonymNextLinkTable.setBar...(value);
     * InsertOption<SynonymNextLinkTableCB> option = new InsertOption<SynonymNextLinkTableCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * synonymNextLinkTableBhv.<span style="color: #DD4747">varyingInsert</span>(synonymNextLinkTable, option);
     * ... = synonymNextLinkTable.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param synonymNextLinkTable The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(SynonymNextLinkTable synonymNextLinkTable, InsertOption<SynonymNextLinkTableCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(synonymNextLinkTable, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * SynonymNextLinkTable synonymNextLinkTable = new SynonymNextLinkTable();
     * synonymNextLinkTable.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * synonymNextLinkTable.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * synonymNextLinkTable.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;SynonymNextLinkTableCB&gt; option = new UpdateOption&lt;SynonymNextLinkTableCB&gt;();
     *     option.self(new SpecifyQuery&lt;SynonymNextLinkTableCB&gt;() {
     *         public void specify(SynonymNextLinkTableCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     synonymNextLinkTableBhv.<span style="color: #DD4747">varyingUpdate</span>(synonymNextLinkTable, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param synonymNextLinkTable The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(SynonymNextLinkTable synonymNextLinkTable, UpdateOption<SynonymNextLinkTableCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(synonymNextLinkTable, option);
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * SynonymNextLinkTable synonymNextLinkTable = new SynonymNextLinkTable();
     * synonymNextLinkTable.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * synonymNextLinkTable.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymNextLinkTable.setVersionNo(value);</span>
     * UpdateOption&lt;SynonymNextLinkTableCB&gt; option = new UpdateOption&lt;SynonymNextLinkTableCB&gt;();
     * option.self(new SpecifyQuery&lt;SynonymNextLinkTableCB&gt;() {
     *     public void specify(SynonymNextLinkTableCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * synonymNextLinkTableBhv.<span style="color: #DD4747">varyingUpdateNonstrict</span>(synonymNextLinkTable, option);
     * </pre>
     * @param synonymNextLinkTable The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(SynonymNextLinkTable synonymNextLinkTable, UpdateOption<SynonymNextLinkTableCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdateNonstrict(synonymNextLinkTable, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param synonymNextLinkTable The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(SynonymNextLinkTable synonymNextLinkTable, InsertOption<SynonymNextLinkTableCB> insertOption, UpdateOption<SynonymNextLinkTableCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdate(synonymNextLinkTable, insertOption, updateOption);
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param synonymNextLinkTable The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(SynonymNextLinkTable synonymNextLinkTable, InsertOption<SynonymNextLinkTableCB> insertOption, UpdateOption<SynonymNextLinkTableCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdateNonstrict(synonymNextLinkTable, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param synonymNextLinkTable The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(SynonymNextLinkTable synonymNextLinkTable, DeleteOption<SynonymNextLinkTableCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(synonymNextLinkTable, option);
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as deleteNonstrict(entity).
     * @param synonymNextLinkTable The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(SynonymNextLinkTable synonymNextLinkTable, DeleteOption<SynonymNextLinkTableCB> option) {
        assertDeleteOptionNotNull(option);
        doDeleteNonstrict(synonymNextLinkTable, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param synonymNextLinkTableList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<SynonymNextLinkTable> synonymNextLinkTableList, InsertOption<SynonymNextLinkTableCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(synonymNextLinkTableList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param synonymNextLinkTableList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<SynonymNextLinkTable> synonymNextLinkTableList, UpdateOption<SynonymNextLinkTableCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(synonymNextLinkTableList, option);
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param synonymNextLinkTableList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<SynonymNextLinkTable> synonymNextLinkTableList, UpdateOption<SynonymNextLinkTableCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdateNonstrict(synonymNextLinkTableList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param synonymNextLinkTableList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<SynonymNextLinkTable> synonymNextLinkTableList, DeleteOption<SynonymNextLinkTableCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(synonymNextLinkTableList, option);
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param synonymNextLinkTableList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<SynonymNextLinkTable> synonymNextLinkTableList, DeleteOption<SynonymNextLinkTableCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDeleteNonstrict(synonymNextLinkTableList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<SynonymNextLinkTable, SynonymNextLinkTableCB> setupper, InsertOption<SynonymNextLinkTableCB> option) {
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
     * SynonymNextLinkTable synonymNextLinkTable = new SynonymNextLinkTable();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//synonymNextLinkTable.setPK...(value);</span>
     * synonymNextLinkTable.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymNextLinkTable.setVersionNo(value);</span>
     * SynonymNextLinkTableCB cb = new SynonymNextLinkTableCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;SynonymNextLinkTableCB&gt; option = new UpdateOption&lt;SynonymNextLinkTableCB&gt;();
     * option.self(new SpecifyQuery&lt;SynonymNextLinkTableCB&gt;() {
     *     public void specify(SynonymNextLinkTableCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * synonymNextLinkTableBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(synonymNextLinkTable, cb, option);
     * </pre>
     * @param synonymNextLinkTable The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of SynonymNextLinkTable. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(SynonymNextLinkTable synonymNextLinkTable, SynonymNextLinkTableCB cb, UpdateOption<SynonymNextLinkTableCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(synonymNextLinkTable, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of SynonymNextLinkTable. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(SynonymNextLinkTableCB cb, DeleteOption<SynonymNextLinkTableCB> option) {
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
    public OutsideSqlBasicExecutor<SynonymNextLinkTableBhv> outsideSql() {
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
    protected Class<? extends SynonymNextLinkTable> typeOfSelectedEntity() { return SynonymNextLinkTable.class; }
    protected Class<SynonymNextLinkTable> typeOfHandlingEntity() { return SynonymNextLinkTable.class; }
    protected Class<SynonymNextLinkTableCB> typeOfHandlingConditionBean() { return SynonymNextLinkTableCB.class; }
}
