package com.example.dbflute.postgresql.dbflute.bsbhv;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.HpSLSFunction;
import org.seasar.dbflute.exception.*;
import org.seasar.dbflute.optional.OptionalEntity;
import org.seasar.dbflute.outsidesql.executor.*;
import com.example.dbflute.postgresql.dbflute.exbhv.*;
import com.example.dbflute.postgresql.dbflute.bsbhv.loader.*;
import com.example.dbflute.postgresql.dbflute.exentity.*;
import com.example.dbflute.postgresql.dbflute.bsentity.dbmeta.*;
import com.example.dbflute.postgresql.dbflute.cbean.*;

/**
 * The behavior of VENDOR-NON COMPILABLE as TABLE. <br />
 * <pre>
 * [primary key]
 *     NON-COMPILABLE ID
 *
 * [column]
 *     NON-COMPILABLE ID, NON COMPILABLE-NAME, PARENT-ID, Next_ParentID
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
 *     VENDOR-NON COMPILABLE
 *
 * [referrer table]
 *     VENDOR-NON COMPILABLE
 *
 * [foreign property]
 *     vendor_non_compilableByNextParentidSelf, vendor_non_compilableByParent_idSelf
 *
 * [referrer property]
 *     vendor_non_compilableByNextParentidSelfList, vendor_non_compilableByParent_idSelfList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsVendor_non_compilableBhv extends AbstractBehaviorWritable<Vendor_non_compilable, Vendor_non_compilableCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public Vendor_non_compilableDbm getDBMeta() { return Vendor_non_compilableDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public Vendor_non_compilableDbm getMyDBMeta() { return Vendor_non_compilableDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Vendor_non_compilableCB newConditionBean() { return new Vendor_non_compilableCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public Vendor_non_compilable newMyEntity() { return new Vendor_non_compilable(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public Vendor_non_compilableCB newMyConditionBean() { return new Vendor_non_compilableCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * Vendor_non_compilableCB cb = new Vendor_non_compilableCB();
     * cb.query().setFoo...(value);
     * int count = vendor_non_compilableBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of Vendor_non_compilable. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(Vendor_non_compilableCB cb) {
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
     * Vendor_non_compilableCB cb = new Vendor_non_compilableCB();
     * cb.query().setFoo...(value);
     * Vendor_non_compilable vendor_non_compilable = vendor_non_compilableBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (vendor_non_compilable != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = vendor_non_compilable.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of Vendor_non_compilable. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public Vendor_non_compilable selectEntity(Vendor_non_compilableCB cb) {
        return facadeSelectEntity(cb);
    }

    protected Vendor_non_compilable facadeSelectEntity(Vendor_non_compilableCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends Vendor_non_compilable> OptionalEntity<ENTITY> doSelectOptionalEntity(Vendor_non_compilableCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * Vendor_non_compilableCB cb = new Vendor_non_compilableCB();
     * cb.query().setFoo...(value);
     * Vendor_non_compilable vendor_non_compilable = vendor_non_compilableBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = vendor_non_compilable.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of Vendor_non_compilable. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public Vendor_non_compilable selectEntityWithDeletedCheck(Vendor_non_compilableCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param non_compilable_id : PK, NotNull, int4(10). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public Vendor_non_compilable selectByPKValue(Integer non_compilable_id) {
        return facadeSelectByPKValue(non_compilable_id);
    }

    protected Vendor_non_compilable facadeSelectByPKValue(Integer non_compilable_id) {
        return doSelectByPK(non_compilable_id, typeOfSelectedEntity());
    }

    protected <ENTITY extends Vendor_non_compilable> ENTITY doSelectByPK(Integer non_compilable_id, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(non_compilable_id), tp);
    }

    protected <ENTITY extends Vendor_non_compilable> OptionalEntity<ENTITY> doSelectOptionalByPK(Integer non_compilable_id, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(non_compilable_id, tp), non_compilable_id);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param non_compilable_id : PK, NotNull, int4(10). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public Vendor_non_compilable selectByPKValueWithDeletedCheck(Integer non_compilable_id) {
        return doSelectByPKWithDeletedCheck(non_compilable_id, typeOfSelectedEntity());
    }

    protected <ENTITY extends Vendor_non_compilable> ENTITY doSelectByPKWithDeletedCheck(Integer non_compilable_id, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(non_compilable_id), tp);
    }

    protected Vendor_non_compilableCB xprepareCBAsPK(Integer non_compilable_id) {
        assertObjectNotNull("non_compilable_id", non_compilable_id);
        return newConditionBean().acceptPK(non_compilable_id);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * Vendor_non_compilableCB cb = new Vendor_non_compilableCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;Vendor_non_compilable&gt; vendor_non_compilableList = vendor_non_compilableBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (Vendor_non_compilable vendor_non_compilable : vendor_non_compilableList) {
     *     ... = vendor_non_compilable.get...();
     * }
     * </pre>
     * @param cb The condition-bean of Vendor_non_compilable. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<Vendor_non_compilable> selectList(Vendor_non_compilableCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * Vendor_non_compilableCB cb = new Vendor_non_compilableCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;Vendor_non_compilable&gt; page = vendor_non_compilableBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (Vendor_non_compilable vendor_non_compilable : page) {
     *     ... = vendor_non_compilable.get...();
     * }
     * </pre>
     * @param cb The condition-bean of Vendor_non_compilable. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<Vendor_non_compilable> selectPage(Vendor_non_compilableCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * Vendor_non_compilableCB cb = new Vendor_non_compilableCB();
     * cb.query().setFoo...(value);
     * vendor_non_compilableBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;Vendor_non_compilable&gt;() {
     *     public void handle(Vendor_non_compilable entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of Vendor_non_compilable. (NotNull)
     * @param entityRowHandler The handler of entity row of Vendor_non_compilable. (NotNull)
     */
    public void selectCursor(Vendor_non_compilableCB cb, EntityRowHandler<Vendor_non_compilable> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * vendor_non_compilableBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(Vendor_non_compilableCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<Vendor_non_compilableCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param vendor_non_compilableList The entity list of vendor_non_compilable. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<Vendor_non_compilable> vendor_non_compilableList, ReferrerLoaderHandler<LoaderOfVendor_non_compilable> handler) {
        xassLRArg(vendor_non_compilableList, handler);
        handler.handle(new LoaderOfVendor_non_compilable().ready(vendor_non_compilableList, _behaviorSelector));
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
     * @param vendor_non_compilable The entity of vendor_non_compilable. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(Vendor_non_compilable vendor_non_compilable, ReferrerLoaderHandler<LoaderOfVendor_non_compilable> handler) {
        xassLRArg(vendor_non_compilable, handler);
        handler.handle(new LoaderOfVendor_non_compilable().ready(xnewLRAryLs(vendor_non_compilable), _behaviorSelector));
    }

    /**
     * Load referrer of vendor_non_compilableByNextParentidSelfList by the set-upper of referrer. <br />
     * VENDOR-NON COMPILABLE by Next_ParentID, named 'vendor_non_compilableByNextParentidSelfList'.
     * <pre>
     * vendor_non_compilableBhv.<span style="color: #DD4747">loadVendor_non_compilableByNextParentidSelfList</span>(vendor_non_compilableList, new ConditionBeanSetupper&lt;Vendor_non_compilableCB&gt;() {
     *     public void setup(Vendor_non_compilableCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (Vendor_non_compilable vendor_non_compilable : vendor_non_compilableList) {
     *     ... = vendor_non_compilable.<span style="color: #DD4747">getVendor_non_compilableByNextParentidSelfList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setNextParentid_InScope(pkList);
     * cb.query().addOrderBy_NextParentid_Asc();
     * </pre>
     * @param vendor_non_compilableList The entity list of vendor_non_compilable. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<Vendor_non_compilable> loadVendor_non_compilableByNextParentidSelfList(List<Vendor_non_compilable> vendor_non_compilableList, ConditionBeanSetupper<Vendor_non_compilableCB> setupper) {
        xassLRArg(vendor_non_compilableList, setupper);
        return doLoadVendor_non_compilableByNextParentidSelfList(vendor_non_compilableList, new LoadReferrerOption<Vendor_non_compilableCB, Vendor_non_compilable>().xinit(setupper));
    }

    /**
     * Load referrer of vendor_non_compilableByNextParentidSelfList by the set-upper of referrer. <br />
     * VENDOR-NON COMPILABLE by Next_ParentID, named 'vendor_non_compilableByNextParentidSelfList'.
     * <pre>
     * vendor_non_compilableBhv.<span style="color: #DD4747">loadVendor_non_compilableByNextParentidSelfList</span>(vendor_non_compilableList, new ConditionBeanSetupper&lt;Vendor_non_compilableCB&gt;() {
     *     public void setup(Vendor_non_compilableCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = vendor_non_compilable.<span style="color: #DD4747">getVendor_non_compilableByNextParentidSelfList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setNextParentid_InScope(pkList);
     * cb.query().addOrderBy_NextParentid_Asc();
     * </pre>
     * @param vendor_non_compilable The entity of vendor_non_compilable. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<Vendor_non_compilable> loadVendor_non_compilableByNextParentidSelfList(Vendor_non_compilable vendor_non_compilable, ConditionBeanSetupper<Vendor_non_compilableCB> setupper) {
        xassLRArg(vendor_non_compilable, setupper);
        return doLoadVendor_non_compilableByNextParentidSelfList(xnewLRLs(vendor_non_compilable), new LoadReferrerOption<Vendor_non_compilableCB, Vendor_non_compilable>().xinit(setupper));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param vendor_non_compilable The entity of vendor_non_compilable. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<Vendor_non_compilable> loadVendor_non_compilableByNextParentidSelfList(Vendor_non_compilable vendor_non_compilable, LoadReferrerOption<Vendor_non_compilableCB, Vendor_non_compilable> loadReferrerOption) {
        xassLRArg(vendor_non_compilable, loadReferrerOption);
        return loadVendor_non_compilableByNextParentidSelfList(xnewLRLs(vendor_non_compilable), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param vendor_non_compilableList The entity list of vendor_non_compilable. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<Vendor_non_compilable> loadVendor_non_compilableByNextParentidSelfList(List<Vendor_non_compilable> vendor_non_compilableList, LoadReferrerOption<Vendor_non_compilableCB, Vendor_non_compilable> loadReferrerOption) {
        xassLRArg(vendor_non_compilableList, loadReferrerOption);
        if (vendor_non_compilableList.isEmpty()) { return (NestedReferrerListGateway<Vendor_non_compilable>)EMPTY_NREF_LGWAY; }
        return doLoadVendor_non_compilableByNextParentidSelfList(vendor_non_compilableList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<Vendor_non_compilable> doLoadVendor_non_compilableByNextParentidSelfList(List<Vendor_non_compilable> vendor_non_compilableList, LoadReferrerOption<Vendor_non_compilableCB, Vendor_non_compilable> option) {
        return helpLoadReferrerInternally(vendor_non_compilableList, option, "vendor_non_compilableByNextParentidSelfList");
    }

    /**
     * Load referrer of vendor_non_compilableByParent_idSelfList by the set-upper of referrer. <br />
     * VENDOR-NON COMPILABLE by PARENT-ID, named 'vendor_non_compilableByParent_idSelfList'.
     * <pre>
     * vendor_non_compilableBhv.<span style="color: #DD4747">loadVendor_non_compilableByParent_idSelfList</span>(vendor_non_compilableList, new ConditionBeanSetupper&lt;Vendor_non_compilableCB&gt;() {
     *     public void setup(Vendor_non_compilableCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (Vendor_non_compilable vendor_non_compilable : vendor_non_compilableList) {
     *     ... = vendor_non_compilable.<span style="color: #DD4747">getVendor_non_compilableByParent_idSelfList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setParent_id_InScope(pkList);
     * cb.query().addOrderBy_Parent_id_Asc();
     * </pre>
     * @param vendor_non_compilableList The entity list of vendor_non_compilable. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<Vendor_non_compilable> loadVendor_non_compilableByParent_idSelfList(List<Vendor_non_compilable> vendor_non_compilableList, ConditionBeanSetupper<Vendor_non_compilableCB> setupper) {
        xassLRArg(vendor_non_compilableList, setupper);
        return doLoadVendor_non_compilableByParent_idSelfList(vendor_non_compilableList, new LoadReferrerOption<Vendor_non_compilableCB, Vendor_non_compilable>().xinit(setupper));
    }

    /**
     * Load referrer of vendor_non_compilableByParent_idSelfList by the set-upper of referrer. <br />
     * VENDOR-NON COMPILABLE by PARENT-ID, named 'vendor_non_compilableByParent_idSelfList'.
     * <pre>
     * vendor_non_compilableBhv.<span style="color: #DD4747">loadVendor_non_compilableByParent_idSelfList</span>(vendor_non_compilableList, new ConditionBeanSetupper&lt;Vendor_non_compilableCB&gt;() {
     *     public void setup(Vendor_non_compilableCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = vendor_non_compilable.<span style="color: #DD4747">getVendor_non_compilableByParent_idSelfList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setParent_id_InScope(pkList);
     * cb.query().addOrderBy_Parent_id_Asc();
     * </pre>
     * @param vendor_non_compilable The entity of vendor_non_compilable. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<Vendor_non_compilable> loadVendor_non_compilableByParent_idSelfList(Vendor_non_compilable vendor_non_compilable, ConditionBeanSetupper<Vendor_non_compilableCB> setupper) {
        xassLRArg(vendor_non_compilable, setupper);
        return doLoadVendor_non_compilableByParent_idSelfList(xnewLRLs(vendor_non_compilable), new LoadReferrerOption<Vendor_non_compilableCB, Vendor_non_compilable>().xinit(setupper));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param vendor_non_compilable The entity of vendor_non_compilable. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<Vendor_non_compilable> loadVendor_non_compilableByParent_idSelfList(Vendor_non_compilable vendor_non_compilable, LoadReferrerOption<Vendor_non_compilableCB, Vendor_non_compilable> loadReferrerOption) {
        xassLRArg(vendor_non_compilable, loadReferrerOption);
        return loadVendor_non_compilableByParent_idSelfList(xnewLRLs(vendor_non_compilable), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param vendor_non_compilableList The entity list of vendor_non_compilable. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<Vendor_non_compilable> loadVendor_non_compilableByParent_idSelfList(List<Vendor_non_compilable> vendor_non_compilableList, LoadReferrerOption<Vendor_non_compilableCB, Vendor_non_compilable> loadReferrerOption) {
        xassLRArg(vendor_non_compilableList, loadReferrerOption);
        if (vendor_non_compilableList.isEmpty()) { return (NestedReferrerListGateway<Vendor_non_compilable>)EMPTY_NREF_LGWAY; }
        return doLoadVendor_non_compilableByParent_idSelfList(vendor_non_compilableList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<Vendor_non_compilable> doLoadVendor_non_compilableByParent_idSelfList(List<Vendor_non_compilable> vendor_non_compilableList, LoadReferrerOption<Vendor_non_compilableCB, Vendor_non_compilable> option) {
        return helpLoadReferrerInternally(vendor_non_compilableList, option, "vendor_non_compilableByParent_idSelfList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'Vendor_non_compilable'.
     * @param vendor_non_compilableList The list of vendor_non_compilable. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Vendor_non_compilable> pulloutVendor_non_compilableByNextParentidSelf(List<Vendor_non_compilable> vendor_non_compilableList)
    { return helpPulloutInternally(vendor_non_compilableList, "vendor_non_compilableByNextParentidSelf"); }

    /**
     * Pull out the list of foreign table 'Vendor_non_compilable'.
     * @param vendor_non_compilableList The list of vendor_non_compilable. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Vendor_non_compilable> pulloutVendor_non_compilableByParent_idSelf(List<Vendor_non_compilable> vendor_non_compilableList)
    { return helpPulloutInternally(vendor_non_compilableList, "vendor_non_compilableByParent_idSelf"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key non_compilable_id.
     * @param vendor_non_compilableList The list of vendor_non_compilable. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractNon_compilable_idList(List<Vendor_non_compilable> vendor_non_compilableList)
    { return helpExtractListInternally(vendor_non_compilableList, "non_compilable_id"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * Vendor_non_compilable vendor_non_compilable = new Vendor_non_compilable();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendor_non_compilable.setFoo...(value);
     * vendor_non_compilable.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendor_non_compilable.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendor_non_compilable.set...;</span>
     * vendor_non_compilableBhv.<span style="color: #DD4747">insert</span>(vendor_non_compilable);
     * ... = vendor_non_compilable.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param vendor_non_compilable The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(Vendor_non_compilable vendor_non_compilable) {
        doInsert(vendor_non_compilable, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * Vendor_non_compilable vendor_non_compilable = new Vendor_non_compilable();
     * vendor_non_compilable.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendor_non_compilable.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendor_non_compilable.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendor_non_compilable.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendor_non_compilable.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     vendor_non_compilableBhv.<span style="color: #DD4747">update</span>(vendor_non_compilable);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendor_non_compilable The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(Vendor_non_compilable vendor_non_compilable) {
        doUpdate(vendor_non_compilable, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param vendor_non_compilable The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(Vendor_non_compilable vendor_non_compilable) {
        doInsertOrUpdate(vendor_non_compilable, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * Vendor_non_compilable vendor_non_compilable = new Vendor_non_compilable();
     * vendor_non_compilable.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendor_non_compilable.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     vendor_non_compilableBhv.<span style="color: #DD4747">delete</span>(vendor_non_compilable);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendor_non_compilable The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(Vendor_non_compilable vendor_non_compilable) {
        doDelete(vendor_non_compilable, null);
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
     *     Vendor_non_compilable vendor_non_compilable = new Vendor_non_compilable();
     *     vendor_non_compilable.setFooName("foo");
     *     if (...) {
     *         vendor_non_compilable.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     vendor_non_compilableList.add(vendor_non_compilable);
     * }
     * vendor_non_compilableBhv.<span style="color: #DD4747">batchInsert</span>(vendor_non_compilableList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param vendor_non_compilableList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<Vendor_non_compilable> vendor_non_compilableList) {
        return doBatchInsert(vendor_non_compilableList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     Vendor_non_compilable vendor_non_compilable = new Vendor_non_compilable();
     *     vendor_non_compilable.setFooName("foo");
     *     if (...) {
     *         vendor_non_compilable.setFooPrice(123);
     *     } else {
     *         vendor_non_compilable.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//vendor_non_compilable.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     vendor_non_compilableList.add(vendor_non_compilable);
     * }
     * vendor_non_compilableBhv.<span style="color: #DD4747">batchUpdate</span>(vendor_non_compilableList);
     * </pre>
     * @param vendor_non_compilableList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<Vendor_non_compilable> vendor_non_compilableList) {
        return doBatchUpdate(vendor_non_compilableList, null);
    }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * vendor_non_compilableBhv.<span style="color: #DD4747">batchUpdate</span>(vendor_non_compilableList, new SpecifyQuery<Vendor_non_compilableCB>() {
     *     public void specify(Vendor_non_compilableCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * vendor_non_compilableBhv.<span style="color: #DD4747">batchUpdate</span>(vendor_non_compilableList, new SpecifyQuery<Vendor_non_compilableCB>() {
     *     public void specify(Vendor_non_compilableCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param vendor_non_compilableList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<Vendor_non_compilable> vendor_non_compilableList, SpecifyQuery<Vendor_non_compilableCB> updateColumnSpec) {
        return doBatchUpdate(vendor_non_compilableList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param vendor_non_compilableList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<Vendor_non_compilable> vendor_non_compilableList) {
        return doBatchDelete(vendor_non_compilableList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * vendor_non_compilableBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;Vendor_non_compilable, Vendor_non_compilableCB&gt;() {
     *     public ConditionBean setup(Vendor_non_compilable entity, Vendor_non_compilableCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<Vendor_non_compilable, Vendor_non_compilableCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * Vendor_non_compilable vendor_non_compilable = new Vendor_non_compilable();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendor_non_compilable.setPK...(value);</span>
     * vendor_non_compilable.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendor_non_compilable.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendor_non_compilable.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendor_non_compilable.setVersionNo(value);</span>
     * Vendor_non_compilableCB cb = new Vendor_non_compilableCB();
     * cb.query().setFoo...(value);
     * vendor_non_compilableBhv.<span style="color: #DD4747">queryUpdate</span>(vendor_non_compilable, cb);
     * </pre>
     * @param vendor_non_compilable The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of Vendor_non_compilable. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(Vendor_non_compilable vendor_non_compilable, Vendor_non_compilableCB cb) {
        return doQueryUpdate(vendor_non_compilable, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * Vendor_non_compilableCB cb = new Vendor_non_compilableCB();
     * cb.query().setFoo...(value);
     * vendor_non_compilableBhv.<span style="color: #DD4747">queryDelete</span>(vendor_non_compilable, cb);
     * </pre>
     * @param cb The condition-bean of Vendor_non_compilable. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(Vendor_non_compilableCB cb) {
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
     * Vendor_non_compilable vendor_non_compilable = new Vendor_non_compilable();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendor_non_compilable.setFoo...(value);
     * vendor_non_compilable.setBar...(value);
     * InsertOption<Vendor_non_compilableCB> option = new InsertOption<Vendor_non_compilableCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * vendor_non_compilableBhv.<span style="color: #DD4747">varyingInsert</span>(vendor_non_compilable, option);
     * ... = vendor_non_compilable.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param vendor_non_compilable The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(Vendor_non_compilable vendor_non_compilable, InsertOption<Vendor_non_compilableCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(vendor_non_compilable, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * Vendor_non_compilable vendor_non_compilable = new Vendor_non_compilable();
     * vendor_non_compilable.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendor_non_compilable.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendor_non_compilable.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;Vendor_non_compilableCB&gt; option = new UpdateOption&lt;Vendor_non_compilableCB&gt;();
     *     option.self(new SpecifyQuery&lt;Vendor_non_compilableCB&gt;() {
     *         public void specify(Vendor_non_compilableCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     vendor_non_compilableBhv.<span style="color: #DD4747">varyingUpdate</span>(vendor_non_compilable, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendor_non_compilable The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(Vendor_non_compilable vendor_non_compilable, UpdateOption<Vendor_non_compilableCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(vendor_non_compilable, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param vendor_non_compilable The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(Vendor_non_compilable vendor_non_compilable, InsertOption<Vendor_non_compilableCB> insertOption, UpdateOption<Vendor_non_compilableCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdate(vendor_non_compilable, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param vendor_non_compilable The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(Vendor_non_compilable vendor_non_compilable, DeleteOption<Vendor_non_compilableCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(vendor_non_compilable, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param vendor_non_compilableList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<Vendor_non_compilable> vendor_non_compilableList, InsertOption<Vendor_non_compilableCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(vendor_non_compilableList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param vendor_non_compilableList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<Vendor_non_compilable> vendor_non_compilableList, UpdateOption<Vendor_non_compilableCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(vendor_non_compilableList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param vendor_non_compilableList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<Vendor_non_compilable> vendor_non_compilableList, DeleteOption<Vendor_non_compilableCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(vendor_non_compilableList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<Vendor_non_compilable, Vendor_non_compilableCB> setupper, InsertOption<Vendor_non_compilableCB> option) {
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
     * Vendor_non_compilable vendor_non_compilable = new Vendor_non_compilable();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendor_non_compilable.setPK...(value);</span>
     * vendor_non_compilable.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendor_non_compilable.setVersionNo(value);</span>
     * Vendor_non_compilableCB cb = new Vendor_non_compilableCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;Vendor_non_compilableCB&gt; option = new UpdateOption&lt;Vendor_non_compilableCB&gt;();
     * option.self(new SpecifyQuery&lt;Vendor_non_compilableCB&gt;() {
     *     public void specify(Vendor_non_compilableCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * vendor_non_compilableBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(vendor_non_compilable, cb, option);
     * </pre>
     * @param vendor_non_compilable The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of Vendor_non_compilable. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(Vendor_non_compilable vendor_non_compilable, Vendor_non_compilableCB cb, UpdateOption<Vendor_non_compilableCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(vendor_non_compilable, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of Vendor_non_compilable. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(Vendor_non_compilableCB cb, DeleteOption<Vendor_non_compilableCB> option) {
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
    public OutsideSqlBasicExecutor<Vendor_non_compilableBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<Vendor_non_compilableBhv> facadeExecutor = doOutsideSql();
        return facadeExecutor.xbasicExecutor(); // variable to resolve generic type
    }

    // ===================================================================================
    //                                                                         Hyper Patch
    //                                                                         ===========
    @Override
    protected <RESULT extends Vendor_non_compilable> org.seasar.dbflute.bhv.core.command.SelectCursorCBCommand<RESULT> newSelectCursorCBCommand() {
        return new com.example.dbflute.postgresql.dbflute.allcommon.DBFluteConfig.SelectCursorCBCommandHyperPatch<RESULT>();
    }

    @Override
    protected <RESULT extends Vendor_non_compilable> org.seasar.dbflute.bhv.core.command.SelectListCBCommand<RESULT> newSelectListCBCommand() {
        return new com.example.dbflute.postgresql.dbflute.allcommon.DBFluteConfig.SelectListCBCommandHyperPatch<RESULT>();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends Vendor_non_compilable> typeOfSelectedEntity() { return Vendor_non_compilable.class; }
    protected Class<Vendor_non_compilable> typeOfHandlingEntity() { return Vendor_non_compilable.class; }
    protected Class<Vendor_non_compilableCB> typeOfHandlingConditionBean() { return Vendor_non_compilableCB.class; }
}
