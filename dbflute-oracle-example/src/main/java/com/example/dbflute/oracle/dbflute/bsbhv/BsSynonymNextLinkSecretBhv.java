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
 * The behavior of SYNONYM_NEXT_LINK_SECRET as SYNONYM. <br />
 * <pre>
 * [primary key]
 *     SECRET_CODE
 *
 * [column]
 *     SECRET_CODE, SECRET_NAME, SECRET_AUTH_CODE
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
 * @author oracleman
 */
public abstract class BsSynonymNextLinkSecretBhv extends AbstractBehaviorWritable<SynonymNextLinkSecret, SynonymNextLinkSecretCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public SynonymNextLinkSecretDbm getDBMeta() { return SynonymNextLinkSecretDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public SynonymNextLinkSecretDbm getMyDBMeta() { return SynonymNextLinkSecretDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public SynonymNextLinkSecretCB newConditionBean() { return new SynonymNextLinkSecretCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public SynonymNextLinkSecret newMyEntity() { return new SynonymNextLinkSecret(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public SynonymNextLinkSecretCB newMyConditionBean() { return new SynonymNextLinkSecretCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * SynonymNextLinkSecretCB cb = new SynonymNextLinkSecretCB();
     * cb.query().setFoo...(value);
     * int count = synonymNextLinkSecretBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of SynonymNextLinkSecret. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(SynonymNextLinkSecretCB cb) {
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
     * SynonymNextLinkSecretCB cb = new SynonymNextLinkSecretCB();
     * cb.query().setFoo...(value);
     * SynonymNextLinkSecret synonymNextLinkSecret = synonymNextLinkSecretBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (synonymNextLinkSecret != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = synonymNextLinkSecret.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of SynonymNextLinkSecret. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymNextLinkSecret selectEntity(SynonymNextLinkSecretCB cb) {
        return facadeSelectEntity(cb);
    }

    protected SynonymNextLinkSecret facadeSelectEntity(SynonymNextLinkSecretCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends SynonymNextLinkSecret> OptionalEntity<ENTITY> doSelectOptionalEntity(SynonymNextLinkSecretCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * SynonymNextLinkSecretCB cb = new SynonymNextLinkSecretCB();
     * cb.query().setFoo...(value);
     * SynonymNextLinkSecret synonymNextLinkSecret = synonymNextLinkSecretBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = synonymNextLinkSecret.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of SynonymNextLinkSecret. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymNextLinkSecret selectEntityWithDeletedCheck(SynonymNextLinkSecretCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param secretCode : PK, NotNull, CHAR(3). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymNextLinkSecret selectByPKValue(String secretCode) {
        return facadeSelectByPKValue(secretCode);
    }

    protected SynonymNextLinkSecret facadeSelectByPKValue(String secretCode) {
        return doSelectByPK(secretCode, typeOfSelectedEntity());
    }

    protected <ENTITY extends SynonymNextLinkSecret> ENTITY doSelectByPK(String secretCode, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(secretCode), tp);
    }

    protected <ENTITY extends SynonymNextLinkSecret> OptionalEntity<ENTITY> doSelectOptionalByPK(String secretCode, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(secretCode, tp), secretCode);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param secretCode : PK, NotNull, CHAR(3). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymNextLinkSecret selectByPKValueWithDeletedCheck(String secretCode) {
        return doSelectByPKWithDeletedCheck(secretCode, typeOfSelectedEntity());
    }

    protected <ENTITY extends SynonymNextLinkSecret> ENTITY doSelectByPKWithDeletedCheck(String secretCode, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(secretCode), tp);
    }

    protected SynonymNextLinkSecretCB xprepareCBAsPK(String secretCode) {
        assertObjectNotNull("secretCode", secretCode);
        return newConditionBean().acceptPK(secretCode);
    }

    /**
     * Select the entity by the unique-key value.
     * @param secretName : UQ, NotNull, VARCHAR2(50). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<SynonymNextLinkSecret> selectByUniqueOf(String secretName) {
        return facadeSelectByUniqueOf(secretName);
    }

    protected OptionalEntity<SynonymNextLinkSecret> facadeSelectByUniqueOf(String secretName) {
        return doSelectByUniqueOf(secretName, typeOfSelectedEntity());
    }

    protected <ENTITY extends SynonymNextLinkSecret> OptionalEntity<ENTITY> doSelectByUniqueOf(String secretName, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(secretName), tp), secretName);
    }

    protected SynonymNextLinkSecretCB xprepareCBAsUniqueOf(String secretName) {
        assertObjectNotNull("secretName", secretName);
        return newConditionBean().acceptUniqueOf(secretName);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * SynonymNextLinkSecretCB cb = new SynonymNextLinkSecretCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;SynonymNextLinkSecret&gt; synonymNextLinkSecretList = synonymNextLinkSecretBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (SynonymNextLinkSecret synonymNextLinkSecret : synonymNextLinkSecretList) {
     *     ... = synonymNextLinkSecret.get...();
     * }
     * </pre>
     * @param cb The condition-bean of SynonymNextLinkSecret. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<SynonymNextLinkSecret> selectList(SynonymNextLinkSecretCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * SynonymNextLinkSecretCB cb = new SynonymNextLinkSecretCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;SynonymNextLinkSecret&gt; page = synonymNextLinkSecretBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (SynonymNextLinkSecret synonymNextLinkSecret : page) {
     *     ... = synonymNextLinkSecret.get...();
     * }
     * </pre>
     * @param cb The condition-bean of SynonymNextLinkSecret. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<SynonymNextLinkSecret> selectPage(SynonymNextLinkSecretCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * SynonymNextLinkSecretCB cb = new SynonymNextLinkSecretCB();
     * cb.query().setFoo...(value);
     * synonymNextLinkSecretBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;SynonymNextLinkSecret&gt;() {
     *     public void handle(SynonymNextLinkSecret entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of SynonymNextLinkSecret. (NotNull)
     * @param entityRowHandler The handler of entity row of SynonymNextLinkSecret. (NotNull)
     */
    public void selectCursor(SynonymNextLinkSecretCB cb, EntityRowHandler<SynonymNextLinkSecret> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * synonymNextLinkSecretBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(SynonymNextLinkSecretCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<SynonymNextLinkSecretCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param synonymNextLinkSecretList The entity list of synonymNextLinkSecret. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<SynonymNextLinkSecret> synonymNextLinkSecretList, ReferrerLoaderHandler<LoaderOfSynonymNextLinkSecret> handler) {
        xassLRArg(synonymNextLinkSecretList, handler);
        handler.handle(new LoaderOfSynonymNextLinkSecret().ready(synonymNextLinkSecretList, _behaviorSelector));
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
     * @param synonymNextLinkSecret The entity of synonymNextLinkSecret. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(SynonymNextLinkSecret synonymNextLinkSecret, ReferrerLoaderHandler<LoaderOfSynonymNextLinkSecret> handler) {
        xassLRArg(synonymNextLinkSecret, handler);
        handler.handle(new LoaderOfSynonymNextLinkSecret().ready(xnewLRAryLs(synonymNextLinkSecret), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key secretCode.
     * @param synonymNextLinkSecretList The list of synonymNextLinkSecret. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractSecretCodeList(List<SynonymNextLinkSecret> synonymNextLinkSecretList)
    { return helpExtractListInternally(synonymNextLinkSecretList, "secretCode"); }

    /**
     * Extract the value list of (single) unique key secretName.
     * @param synonymNextLinkSecretList The list of synonymNextLinkSecret. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractSecretNameList(List<SynonymNextLinkSecret> synonymNextLinkSecretList)
    { return helpExtractListInternally(synonymNextLinkSecretList, "secretName"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * SynonymNextLinkSecret synonymNextLinkSecret = new SynonymNextLinkSecret();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * synonymNextLinkSecret.setFoo...(value);
     * synonymNextLinkSecret.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSecret.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSecret.set...;</span>
     * synonymNextLinkSecretBhv.<span style="color: #DD4747">insert</span>(synonymNextLinkSecret);
     * ... = synonymNextLinkSecret.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param synonymNextLinkSecret The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(SynonymNextLinkSecret synonymNextLinkSecret) {
        doInsert(synonymNextLinkSecret, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * SynonymNextLinkSecret synonymNextLinkSecret = new SynonymNextLinkSecret();
     * synonymNextLinkSecret.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * synonymNextLinkSecret.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSecret.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSecret.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * synonymNextLinkSecret.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     synonymNextLinkSecretBhv.<span style="color: #DD4747">update</span>(synonymNextLinkSecret);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param synonymNextLinkSecret The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(SynonymNextLinkSecret synonymNextLinkSecret) {
        doUpdate(synonymNextLinkSecret, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param synonymNextLinkSecret The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(SynonymNextLinkSecret synonymNextLinkSecret) {
        doInsertOrUpdate(synonymNextLinkSecret, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * SynonymNextLinkSecret synonymNextLinkSecret = new SynonymNextLinkSecret();
     * synonymNextLinkSecret.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * synonymNextLinkSecret.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     synonymNextLinkSecretBhv.<span style="color: #DD4747">delete</span>(synonymNextLinkSecret);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param synonymNextLinkSecret The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(SynonymNextLinkSecret synonymNextLinkSecret) {
        doDelete(synonymNextLinkSecret, null);
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
     *     SynonymNextLinkSecret synonymNextLinkSecret = new SynonymNextLinkSecret();
     *     synonymNextLinkSecret.setFooName("foo");
     *     if (...) {
     *         synonymNextLinkSecret.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     synonymNextLinkSecretList.add(synonymNextLinkSecret);
     * }
     * synonymNextLinkSecretBhv.<span style="color: #DD4747">batchInsert</span>(synonymNextLinkSecretList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param synonymNextLinkSecretList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<SynonymNextLinkSecret> synonymNextLinkSecretList) {
        return doBatchInsert(synonymNextLinkSecretList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     SynonymNextLinkSecret synonymNextLinkSecret = new SynonymNextLinkSecret();
     *     synonymNextLinkSecret.setFooName("foo");
     *     if (...) {
     *         synonymNextLinkSecret.setFooPrice(123);
     *     } else {
     *         synonymNextLinkSecret.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//synonymNextLinkSecret.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     synonymNextLinkSecretList.add(synonymNextLinkSecret);
     * }
     * synonymNextLinkSecretBhv.<span style="color: #DD4747">batchUpdate</span>(synonymNextLinkSecretList);
     * </pre>
     * @param synonymNextLinkSecretList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<SynonymNextLinkSecret> synonymNextLinkSecretList) {
        return doBatchUpdate(synonymNextLinkSecretList, null);
    }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * synonymNextLinkSecretBhv.<span style="color: #DD4747">batchUpdate</span>(synonymNextLinkSecretList, new SpecifyQuery<SynonymNextLinkSecretCB>() {
     *     public void specify(SynonymNextLinkSecretCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * synonymNextLinkSecretBhv.<span style="color: #DD4747">batchUpdate</span>(synonymNextLinkSecretList, new SpecifyQuery<SynonymNextLinkSecretCB>() {
     *     public void specify(SynonymNextLinkSecretCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param synonymNextLinkSecretList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<SynonymNextLinkSecret> synonymNextLinkSecretList, SpecifyQuery<SynonymNextLinkSecretCB> updateColumnSpec) {
        return doBatchUpdate(synonymNextLinkSecretList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param synonymNextLinkSecretList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<SynonymNextLinkSecret> synonymNextLinkSecretList) {
        return doBatchDelete(synonymNextLinkSecretList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * synonymNextLinkSecretBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;SynonymNextLinkSecret, SynonymNextLinkSecretCB&gt;() {
     *     public ConditionBean setup(SynonymNextLinkSecret entity, SynonymNextLinkSecretCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<SynonymNextLinkSecret, SynonymNextLinkSecretCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * SynonymNextLinkSecret synonymNextLinkSecret = new SynonymNextLinkSecret();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSecret.setPK...(value);</span>
     * synonymNextLinkSecret.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSecret.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSecret.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSecret.setVersionNo(value);</span>
     * SynonymNextLinkSecretCB cb = new SynonymNextLinkSecretCB();
     * cb.query().setFoo...(value);
     * synonymNextLinkSecretBhv.<span style="color: #DD4747">queryUpdate</span>(synonymNextLinkSecret, cb);
     * </pre>
     * @param synonymNextLinkSecret The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of SynonymNextLinkSecret. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(SynonymNextLinkSecret synonymNextLinkSecret, SynonymNextLinkSecretCB cb) {
        return doQueryUpdate(synonymNextLinkSecret, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * SynonymNextLinkSecretCB cb = new SynonymNextLinkSecretCB();
     * cb.query().setFoo...(value);
     * synonymNextLinkSecretBhv.<span style="color: #DD4747">queryDelete</span>(synonymNextLinkSecret, cb);
     * </pre>
     * @param cb The condition-bean of SynonymNextLinkSecret. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(SynonymNextLinkSecretCB cb) {
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
     * SynonymNextLinkSecret synonymNextLinkSecret = new SynonymNextLinkSecret();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * synonymNextLinkSecret.setFoo...(value);
     * synonymNextLinkSecret.setBar...(value);
     * InsertOption<SynonymNextLinkSecretCB> option = new InsertOption<SynonymNextLinkSecretCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * synonymNextLinkSecretBhv.<span style="color: #DD4747">varyingInsert</span>(synonymNextLinkSecret, option);
     * ... = synonymNextLinkSecret.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param synonymNextLinkSecret The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(SynonymNextLinkSecret synonymNextLinkSecret, InsertOption<SynonymNextLinkSecretCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(synonymNextLinkSecret, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * SynonymNextLinkSecret synonymNextLinkSecret = new SynonymNextLinkSecret();
     * synonymNextLinkSecret.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * synonymNextLinkSecret.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * synonymNextLinkSecret.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;SynonymNextLinkSecretCB&gt; option = new UpdateOption&lt;SynonymNextLinkSecretCB&gt;();
     *     option.self(new SpecifyQuery&lt;SynonymNextLinkSecretCB&gt;() {
     *         public void specify(SynonymNextLinkSecretCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     synonymNextLinkSecretBhv.<span style="color: #DD4747">varyingUpdate</span>(synonymNextLinkSecret, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param synonymNextLinkSecret The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(SynonymNextLinkSecret synonymNextLinkSecret, UpdateOption<SynonymNextLinkSecretCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(synonymNextLinkSecret, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param synonymNextLinkSecret The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(SynonymNextLinkSecret synonymNextLinkSecret, InsertOption<SynonymNextLinkSecretCB> insertOption, UpdateOption<SynonymNextLinkSecretCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdate(synonymNextLinkSecret, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param synonymNextLinkSecret The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(SynonymNextLinkSecret synonymNextLinkSecret, DeleteOption<SynonymNextLinkSecretCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(synonymNextLinkSecret, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param synonymNextLinkSecretList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<SynonymNextLinkSecret> synonymNextLinkSecretList, InsertOption<SynonymNextLinkSecretCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(synonymNextLinkSecretList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param synonymNextLinkSecretList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<SynonymNextLinkSecret> synonymNextLinkSecretList, UpdateOption<SynonymNextLinkSecretCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(synonymNextLinkSecretList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param synonymNextLinkSecretList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<SynonymNextLinkSecret> synonymNextLinkSecretList, DeleteOption<SynonymNextLinkSecretCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(synonymNextLinkSecretList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<SynonymNextLinkSecret, SynonymNextLinkSecretCB> setupper, InsertOption<SynonymNextLinkSecretCB> option) {
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
     * SynonymNextLinkSecret synonymNextLinkSecret = new SynonymNextLinkSecret();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSecret.setPK...(value);</span>
     * synonymNextLinkSecret.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSecret.setVersionNo(value);</span>
     * SynonymNextLinkSecretCB cb = new SynonymNextLinkSecretCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;SynonymNextLinkSecretCB&gt; option = new UpdateOption&lt;SynonymNextLinkSecretCB&gt;();
     * option.self(new SpecifyQuery&lt;SynonymNextLinkSecretCB&gt;() {
     *     public void specify(SynonymNextLinkSecretCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * synonymNextLinkSecretBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(synonymNextLinkSecret, cb, option);
     * </pre>
     * @param synonymNextLinkSecret The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of SynonymNextLinkSecret. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(SynonymNextLinkSecret synonymNextLinkSecret, SynonymNextLinkSecretCB cb, UpdateOption<SynonymNextLinkSecretCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(synonymNextLinkSecret, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of SynonymNextLinkSecret. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(SynonymNextLinkSecretCB cb, DeleteOption<SynonymNextLinkSecretCB> option) {
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
    public OutsideSqlBasicExecutor<SynonymNextLinkSecretBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<SynonymNextLinkSecretBhv> facadeExecutor = doOutsideSql();
        return facadeExecutor.xbasicExecutor(); // variable to resolve generic type
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends SynonymNextLinkSecret> typeOfSelectedEntity() { return SynonymNextLinkSecret.class; }
    protected Class<SynonymNextLinkSecret> typeOfHandlingEntity() { return SynonymNextLinkSecret.class; }
    protected Class<SynonymNextLinkSecretCB> typeOfHandlingConditionBean() { return SynonymNextLinkSecretCB.class; }
}
