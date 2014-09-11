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
 * The behavior of vendor_large_data as TABLE. <br />
 * <pre>
 * [primary key]
 *     large_data_id
 *
 * [column]
 *     large_data_id, string_index, string_no_index, string_unique_index, intflg_index, numeric_integer_index, numeric_integer_no_index
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
 *     vendor_large_data_ref
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     vendorLargeDataRefList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsVendorLargeDataBhv extends AbstractBehaviorWritable<VendorLargeData, VendorLargeDataCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public VendorLargeDataDbm getDBMeta() { return VendorLargeDataDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public VendorLargeDataDbm getMyDBMeta() { return VendorLargeDataDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public VendorLargeDataCB newConditionBean() { return new VendorLargeDataCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public VendorLargeData newMyEntity() { return new VendorLargeData(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public VendorLargeDataCB newMyConditionBean() { return new VendorLargeDataCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * VendorLargeDataCB cb = new VendorLargeDataCB();
     * cb.query().setFoo...(value);
     * int count = vendorLargeDataBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of VendorLargeData. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(VendorLargeDataCB cb) {
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
     * VendorLargeDataCB cb = new VendorLargeDataCB();
     * cb.query().setFoo...(value);
     * VendorLargeData vendorLargeData = vendorLargeDataBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (vendorLargeData != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = vendorLargeData.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of VendorLargeData. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorLargeData selectEntity(VendorLargeDataCB cb) {
        return facadeSelectEntity(cb);
    }

    protected VendorLargeData facadeSelectEntity(VendorLargeDataCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorLargeData> OptionalEntity<ENTITY> doSelectOptionalEntity(VendorLargeDataCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * VendorLargeDataCB cb = new VendorLargeDataCB();
     * cb.query().setFoo...(value);
     * VendorLargeData vendorLargeData = vendorLargeDataBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = vendorLargeData.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of VendorLargeData. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorLargeData selectEntityWithDeletedCheck(VendorLargeDataCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param largeDataId : PK, NotNull, int8(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorLargeData selectByPKValue(Long largeDataId) {
        return facadeSelectByPKValue(largeDataId);
    }

    protected VendorLargeData facadeSelectByPKValue(Long largeDataId) {
        return doSelectByPK(largeDataId, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorLargeData> ENTITY doSelectByPK(Long largeDataId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(largeDataId), tp);
    }

    protected <ENTITY extends VendorLargeData> OptionalEntity<ENTITY> doSelectOptionalByPK(Long largeDataId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(largeDataId, tp), largeDataId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param largeDataId : PK, NotNull, int8(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorLargeData selectByPKValueWithDeletedCheck(Long largeDataId) {
        return doSelectByPKWithDeletedCheck(largeDataId, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorLargeData> ENTITY doSelectByPKWithDeletedCheck(Long largeDataId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(largeDataId), tp);
    }

    protected VendorLargeDataCB xprepareCBAsPK(Long largeDataId) {
        assertObjectNotNull("largeDataId", largeDataId);
        return newConditionBean().acceptPK(largeDataId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param stringUniqueIndex : UQ, NotNull, varchar(200). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<VendorLargeData> selectByUniqueOf(String stringUniqueIndex) {
        return facadeSelectByUniqueOf(stringUniqueIndex);
    }

    protected OptionalEntity<VendorLargeData> facadeSelectByUniqueOf(String stringUniqueIndex) {
        return doSelectByUniqueOf(stringUniqueIndex, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorLargeData> OptionalEntity<ENTITY> doSelectByUniqueOf(String stringUniqueIndex, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(stringUniqueIndex), tp), stringUniqueIndex);
    }

    protected VendorLargeDataCB xprepareCBAsUniqueOf(String stringUniqueIndex) {
        assertObjectNotNull("stringUniqueIndex", stringUniqueIndex);
        return newConditionBean().acceptUniqueOf(stringUniqueIndex);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * VendorLargeDataCB cb = new VendorLargeDataCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;VendorLargeData&gt; vendorLargeDataList = vendorLargeDataBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (VendorLargeData vendorLargeData : vendorLargeDataList) {
     *     ... = vendorLargeData.get...();
     * }
     * </pre>
     * @param cb The condition-bean of VendorLargeData. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<VendorLargeData> selectList(VendorLargeDataCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * VendorLargeDataCB cb = new VendorLargeDataCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;VendorLargeData&gt; page = vendorLargeDataBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (VendorLargeData vendorLargeData : page) {
     *     ... = vendorLargeData.get...();
     * }
     * </pre>
     * @param cb The condition-bean of VendorLargeData. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<VendorLargeData> selectPage(VendorLargeDataCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * VendorLargeDataCB cb = new VendorLargeDataCB();
     * cb.query().setFoo...(value);
     * vendorLargeDataBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;VendorLargeData&gt;() {
     *     public void handle(VendorLargeData entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of VendorLargeData. (NotNull)
     * @param entityRowHandler The handler of entity row of VendorLargeData. (NotNull)
     */
    public void selectCursor(VendorLargeDataCB cb, EntityRowHandler<VendorLargeData> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * vendorLargeDataBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(VendorLargeDataCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<VendorLargeDataCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param vendorLargeDataList The entity list of vendorLargeData. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<VendorLargeData> vendorLargeDataList, ReferrerLoaderHandler<LoaderOfVendorLargeData> handler) {
        xassLRArg(vendorLargeDataList, handler);
        handler.handle(new LoaderOfVendorLargeData().ready(vendorLargeDataList, _behaviorSelector));
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
     * @param vendorLargeData The entity of vendorLargeData. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(VendorLargeData vendorLargeData, ReferrerLoaderHandler<LoaderOfVendorLargeData> handler) {
        xassLRArg(vendorLargeData, handler);
        handler.handle(new LoaderOfVendorLargeData().ready(xnewLRAryLs(vendorLargeData), _behaviorSelector));
    }

    /**
     * Load referrer of vendorLargeDataRefList by the set-upper of referrer. <br />
     * vendor_large_data_ref by large_data_id, named 'vendorLargeDataRefList'.
     * <pre>
     * vendorLargeDataBhv.<span style="color: #DD4747">loadVendorLargeDataRefList</span>(vendorLargeDataList, new ConditionBeanSetupper&lt;VendorLargeDataRefCB&gt;() {
     *     public void setup(VendorLargeDataRefCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (VendorLargeData vendorLargeData : vendorLargeDataList) {
     *     ... = vendorLargeData.<span style="color: #DD4747">getVendorLargeDataRefList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLargeDataId_InScope(pkList);
     * cb.query().addOrderBy_LargeDataId_Asc();
     * </pre>
     * @param vendorLargeDataList The entity list of vendorLargeData. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<VendorLargeDataRef> loadVendorLargeDataRefList(List<VendorLargeData> vendorLargeDataList, ConditionBeanSetupper<VendorLargeDataRefCB> setupper) {
        xassLRArg(vendorLargeDataList, setupper);
        return doLoadVendorLargeDataRefList(vendorLargeDataList, new LoadReferrerOption<VendorLargeDataRefCB, VendorLargeDataRef>().xinit(setupper));
    }

    /**
     * Load referrer of vendorLargeDataRefList by the set-upper of referrer. <br />
     * vendor_large_data_ref by large_data_id, named 'vendorLargeDataRefList'.
     * <pre>
     * vendorLargeDataBhv.<span style="color: #DD4747">loadVendorLargeDataRefList</span>(vendorLargeDataList, new ConditionBeanSetupper&lt;VendorLargeDataRefCB&gt;() {
     *     public void setup(VendorLargeDataRefCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = vendorLargeData.<span style="color: #DD4747">getVendorLargeDataRefList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLargeDataId_InScope(pkList);
     * cb.query().addOrderBy_LargeDataId_Asc();
     * </pre>
     * @param vendorLargeData The entity of vendorLargeData. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<VendorLargeDataRef> loadVendorLargeDataRefList(VendorLargeData vendorLargeData, ConditionBeanSetupper<VendorLargeDataRefCB> setupper) {
        xassLRArg(vendorLargeData, setupper);
        return doLoadVendorLargeDataRefList(xnewLRLs(vendorLargeData), new LoadReferrerOption<VendorLargeDataRefCB, VendorLargeDataRef>().xinit(setupper));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param vendorLargeData The entity of vendorLargeData. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<VendorLargeDataRef> loadVendorLargeDataRefList(VendorLargeData vendorLargeData, LoadReferrerOption<VendorLargeDataRefCB, VendorLargeDataRef> loadReferrerOption) {
        xassLRArg(vendorLargeData, loadReferrerOption);
        return loadVendorLargeDataRefList(xnewLRLs(vendorLargeData), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param vendorLargeDataList The entity list of vendorLargeData. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<VendorLargeDataRef> loadVendorLargeDataRefList(List<VendorLargeData> vendorLargeDataList, LoadReferrerOption<VendorLargeDataRefCB, VendorLargeDataRef> loadReferrerOption) {
        xassLRArg(vendorLargeDataList, loadReferrerOption);
        if (vendorLargeDataList.isEmpty()) { return (NestedReferrerListGateway<VendorLargeDataRef>)EMPTY_NREF_LGWAY; }
        return doLoadVendorLargeDataRefList(vendorLargeDataList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<VendorLargeDataRef> doLoadVendorLargeDataRefList(List<VendorLargeData> vendorLargeDataList, LoadReferrerOption<VendorLargeDataRefCB, VendorLargeDataRef> option) {
        return helpLoadReferrerInternally(vendorLargeDataList, option, "vendorLargeDataRefList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key largeDataId.
     * @param vendorLargeDataList The list of vendorLargeData. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractLargeDataIdList(List<VendorLargeData> vendorLargeDataList)
    { return helpExtractListInternally(vendorLargeDataList, "largeDataId"); }

    /**
     * Extract the value list of (single) unique key stringUniqueIndex.
     * @param vendorLargeDataList The list of vendorLargeData. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractStringUniqueIndexList(List<VendorLargeData> vendorLargeDataList)
    { return helpExtractListInternally(vendorLargeDataList, "stringUniqueIndex"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * VendorLargeData vendorLargeData = new VendorLargeData();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorLargeData.setFoo...(value);
     * vendorLargeData.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorLargeData.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorLargeData.set...;</span>
     * vendorLargeDataBhv.<span style="color: #DD4747">insert</span>(vendorLargeData);
     * ... = vendorLargeData.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param vendorLargeData The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(VendorLargeData vendorLargeData) {
        doInsert(vendorLargeData, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * VendorLargeData vendorLargeData = new VendorLargeData();
     * vendorLargeData.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorLargeData.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorLargeData.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorLargeData.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendorLargeData.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     vendorLargeDataBhv.<span style="color: #DD4747">update</span>(vendorLargeData);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorLargeData The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(VendorLargeData vendorLargeData) {
        doUpdate(vendorLargeData, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param vendorLargeData The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(VendorLargeData vendorLargeData) {
        doInsertOrUpdate(vendorLargeData, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * VendorLargeData vendorLargeData = new VendorLargeData();
     * vendorLargeData.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendorLargeData.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     vendorLargeDataBhv.<span style="color: #DD4747">delete</span>(vendorLargeData);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorLargeData The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(VendorLargeData vendorLargeData) {
        doDelete(vendorLargeData, null);
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
     *     VendorLargeData vendorLargeData = new VendorLargeData();
     *     vendorLargeData.setFooName("foo");
     *     if (...) {
     *         vendorLargeData.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     vendorLargeDataList.add(vendorLargeData);
     * }
     * vendorLargeDataBhv.<span style="color: #DD4747">batchInsert</span>(vendorLargeDataList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param vendorLargeDataList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<VendorLargeData> vendorLargeDataList) {
        return doBatchInsert(vendorLargeDataList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     VendorLargeData vendorLargeData = new VendorLargeData();
     *     vendorLargeData.setFooName("foo");
     *     if (...) {
     *         vendorLargeData.setFooPrice(123);
     *     } else {
     *         vendorLargeData.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//vendorLargeData.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     vendorLargeDataList.add(vendorLargeData);
     * }
     * vendorLargeDataBhv.<span style="color: #DD4747">batchUpdate</span>(vendorLargeDataList);
     * </pre>
     * @param vendorLargeDataList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<VendorLargeData> vendorLargeDataList) {
        return doBatchUpdate(vendorLargeDataList, null);
    }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * vendorLargeDataBhv.<span style="color: #DD4747">batchUpdate</span>(vendorLargeDataList, new SpecifyQuery<VendorLargeDataCB>() {
     *     public void specify(VendorLargeDataCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * vendorLargeDataBhv.<span style="color: #DD4747">batchUpdate</span>(vendorLargeDataList, new SpecifyQuery<VendorLargeDataCB>() {
     *     public void specify(VendorLargeDataCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param vendorLargeDataList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<VendorLargeData> vendorLargeDataList, SpecifyQuery<VendorLargeDataCB> updateColumnSpec) {
        return doBatchUpdate(vendorLargeDataList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param vendorLargeDataList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<VendorLargeData> vendorLargeDataList) {
        return doBatchDelete(vendorLargeDataList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * vendorLargeDataBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;VendorLargeData, VendorLargeDataCB&gt;() {
     *     public ConditionBean setup(VendorLargeData entity, VendorLargeDataCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<VendorLargeData, VendorLargeDataCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * VendorLargeData vendorLargeData = new VendorLargeData();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorLargeData.setPK...(value);</span>
     * vendorLargeData.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorLargeData.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorLargeData.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorLargeData.setVersionNo(value);</span>
     * VendorLargeDataCB cb = new VendorLargeDataCB();
     * cb.query().setFoo...(value);
     * vendorLargeDataBhv.<span style="color: #DD4747">queryUpdate</span>(vendorLargeData, cb);
     * </pre>
     * @param vendorLargeData The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of VendorLargeData. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(VendorLargeData vendorLargeData, VendorLargeDataCB cb) {
        return doQueryUpdate(vendorLargeData, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * VendorLargeDataCB cb = new VendorLargeDataCB();
     * cb.query().setFoo...(value);
     * vendorLargeDataBhv.<span style="color: #DD4747">queryDelete</span>(vendorLargeData, cb);
     * </pre>
     * @param cb The condition-bean of VendorLargeData. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(VendorLargeDataCB cb) {
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
     * VendorLargeData vendorLargeData = new VendorLargeData();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorLargeData.setFoo...(value);
     * vendorLargeData.setBar...(value);
     * InsertOption<VendorLargeDataCB> option = new InsertOption<VendorLargeDataCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * vendorLargeDataBhv.<span style="color: #DD4747">varyingInsert</span>(vendorLargeData, option);
     * ... = vendorLargeData.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param vendorLargeData The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(VendorLargeData vendorLargeData, InsertOption<VendorLargeDataCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(vendorLargeData, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * VendorLargeData vendorLargeData = new VendorLargeData();
     * vendorLargeData.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorLargeData.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendorLargeData.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;VendorLargeDataCB&gt; option = new UpdateOption&lt;VendorLargeDataCB&gt;();
     *     option.self(new SpecifyQuery&lt;VendorLargeDataCB&gt;() {
     *         public void specify(VendorLargeDataCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     vendorLargeDataBhv.<span style="color: #DD4747">varyingUpdate</span>(vendorLargeData, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorLargeData The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(VendorLargeData vendorLargeData, UpdateOption<VendorLargeDataCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(vendorLargeData, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param vendorLargeData The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(VendorLargeData vendorLargeData, InsertOption<VendorLargeDataCB> insertOption, UpdateOption<VendorLargeDataCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdate(vendorLargeData, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param vendorLargeData The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(VendorLargeData vendorLargeData, DeleteOption<VendorLargeDataCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(vendorLargeData, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param vendorLargeDataList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<VendorLargeData> vendorLargeDataList, InsertOption<VendorLargeDataCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(vendorLargeDataList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param vendorLargeDataList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<VendorLargeData> vendorLargeDataList, UpdateOption<VendorLargeDataCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(vendorLargeDataList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param vendorLargeDataList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<VendorLargeData> vendorLargeDataList, DeleteOption<VendorLargeDataCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(vendorLargeDataList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<VendorLargeData, VendorLargeDataCB> setupper, InsertOption<VendorLargeDataCB> option) {
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
     * VendorLargeData vendorLargeData = new VendorLargeData();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorLargeData.setPK...(value);</span>
     * vendorLargeData.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorLargeData.setVersionNo(value);</span>
     * VendorLargeDataCB cb = new VendorLargeDataCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;VendorLargeDataCB&gt; option = new UpdateOption&lt;VendorLargeDataCB&gt;();
     * option.self(new SpecifyQuery&lt;VendorLargeDataCB&gt;() {
     *     public void specify(VendorLargeDataCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * vendorLargeDataBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(vendorLargeData, cb, option);
     * </pre>
     * @param vendorLargeData The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of VendorLargeData. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(VendorLargeData vendorLargeData, VendorLargeDataCB cb, UpdateOption<VendorLargeDataCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(vendorLargeData, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of VendorLargeData. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(VendorLargeDataCB cb, DeleteOption<VendorLargeDataCB> option) {
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
    public OutsideSqlBasicExecutor<VendorLargeDataBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends VendorLargeData> typeOfSelectedEntity() { return VendorLargeData.class; }
    protected Class<VendorLargeData> typeOfHandlingEntity() { return VendorLargeData.class; }
    protected Class<VendorLargeDataCB> typeOfHandlingConditionBean() { return VendorLargeDataCB.class; }
}
