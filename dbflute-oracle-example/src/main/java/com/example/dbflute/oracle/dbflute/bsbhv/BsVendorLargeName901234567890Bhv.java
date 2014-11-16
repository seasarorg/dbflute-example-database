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
 * The behavior of VENDOR_LARGE_NAME_901234567890 as TABLE. <br />
 * <pre>
 * [primary key]
 *     VENDOR_LARGE_NAME_901234567_ID
 *
 * [column]
 *     VENDOR_LARGE_NAME_901234567_ID, VENDOR_LARGE_NAME_9012345_NAME
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
 *     VENDOR_LARGE_NAME_90123456_REF
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     vendorLargeName90123456RefList
 * </pre>
 * @author oracleman
 */
public abstract class BsVendorLargeName901234567890Bhv extends AbstractBehaviorWritable<VendorLargeName901234567890, VendorLargeName901234567890CB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public VendorLargeName901234567890Dbm getDBMeta() { return VendorLargeName901234567890Dbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public VendorLargeName901234567890Dbm getMyDBMeta() { return VendorLargeName901234567890Dbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public VendorLargeName901234567890CB newConditionBean() { return new VendorLargeName901234567890CB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public VendorLargeName901234567890 newMyEntity() { return new VendorLargeName901234567890(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public VendorLargeName901234567890CB newMyConditionBean() { return new VendorLargeName901234567890CB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * VendorLargeName901234567890CB cb = new VendorLargeName901234567890CB();
     * cb.query().setFoo...(value);
     * int count = vendorLargeName901234567890Bhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of VendorLargeName901234567890. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(VendorLargeName901234567890CB cb) {
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
     * VendorLargeName901234567890CB cb = new VendorLargeName901234567890CB();
     * cb.query().setFoo...(value);
     * VendorLargeName901234567890 vendorLargeName901234567890 = vendorLargeName901234567890Bhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (vendorLargeName901234567890 != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = vendorLargeName901234567890.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of VendorLargeName901234567890. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorLargeName901234567890 selectEntity(VendorLargeName901234567890CB cb) {
        return facadeSelectEntity(cb);
    }

    protected VendorLargeName901234567890 facadeSelectEntity(VendorLargeName901234567890CB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorLargeName901234567890> OptionalEntity<ENTITY> doSelectOptionalEntity(VendorLargeName901234567890CB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * VendorLargeName901234567890CB cb = new VendorLargeName901234567890CB();
     * cb.query().setFoo...(value);
     * VendorLargeName901234567890 vendorLargeName901234567890 = vendorLargeName901234567890Bhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = vendorLargeName901234567890.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of VendorLargeName901234567890. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorLargeName901234567890 selectEntityWithDeletedCheck(VendorLargeName901234567890CB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param vendorLargeName901234567Id : PK, NotNull, NUMBER(16). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorLargeName901234567890 selectByPKValue(Long vendorLargeName901234567Id) {
        return facadeSelectByPKValue(vendorLargeName901234567Id);
    }

    protected VendorLargeName901234567890 facadeSelectByPKValue(Long vendorLargeName901234567Id) {
        return doSelectByPK(vendorLargeName901234567Id, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorLargeName901234567890> ENTITY doSelectByPK(Long vendorLargeName901234567Id, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(vendorLargeName901234567Id), tp);
    }

    protected <ENTITY extends VendorLargeName901234567890> OptionalEntity<ENTITY> doSelectOptionalByPK(Long vendorLargeName901234567Id, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(vendorLargeName901234567Id, tp), vendorLargeName901234567Id);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param vendorLargeName901234567Id : PK, NotNull, NUMBER(16). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorLargeName901234567890 selectByPKValueWithDeletedCheck(Long vendorLargeName901234567Id) {
        return doSelectByPKWithDeletedCheck(vendorLargeName901234567Id, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorLargeName901234567890> ENTITY doSelectByPKWithDeletedCheck(Long vendorLargeName901234567Id, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(vendorLargeName901234567Id), tp);
    }

    protected VendorLargeName901234567890CB xprepareCBAsPK(Long vendorLargeName901234567Id) {
        assertObjectNotNull("vendorLargeName901234567Id", vendorLargeName901234567Id);
        return newConditionBean().acceptPK(vendorLargeName901234567Id);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * VendorLargeName901234567890CB cb = new VendorLargeName901234567890CB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;VendorLargeName901234567890&gt; vendorLargeName901234567890List = vendorLargeName901234567890Bhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (VendorLargeName901234567890 vendorLargeName901234567890 : vendorLargeName901234567890List) {
     *     ... = vendorLargeName901234567890.get...();
     * }
     * </pre>
     * @param cb The condition-bean of VendorLargeName901234567890. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<VendorLargeName901234567890> selectList(VendorLargeName901234567890CB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * VendorLargeName901234567890CB cb = new VendorLargeName901234567890CB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;VendorLargeName901234567890&gt; page = vendorLargeName901234567890Bhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (VendorLargeName901234567890 vendorLargeName901234567890 : page) {
     *     ... = vendorLargeName901234567890.get...();
     * }
     * </pre>
     * @param cb The condition-bean of VendorLargeName901234567890. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<VendorLargeName901234567890> selectPage(VendorLargeName901234567890CB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * VendorLargeName901234567890CB cb = new VendorLargeName901234567890CB();
     * cb.query().setFoo...(value);
     * vendorLargeName901234567890Bhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;VendorLargeName901234567890&gt;() {
     *     public void handle(VendorLargeName901234567890 entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of VendorLargeName901234567890. (NotNull)
     * @param entityRowHandler The handler of entity row of VendorLargeName901234567890. (NotNull)
     */
    public void selectCursor(VendorLargeName901234567890CB cb, EntityRowHandler<VendorLargeName901234567890> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * vendorLargeName901234567890Bhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(VendorLargeName901234567890CB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<VendorLargeName901234567890CB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param vendorLargeName901234567890List The entity list of vendorLargeName901234567890. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<VendorLargeName901234567890> vendorLargeName901234567890List, ReferrerLoaderHandler<LoaderOfVendorLargeName901234567890> handler) {
        xassLRArg(vendorLargeName901234567890List, handler);
        handler.handle(new LoaderOfVendorLargeName901234567890().ready(vendorLargeName901234567890List, _behaviorSelector));
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
     * @param vendorLargeName901234567890 The entity of vendorLargeName901234567890. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(VendorLargeName901234567890 vendorLargeName901234567890, ReferrerLoaderHandler<LoaderOfVendorLargeName901234567890> handler) {
        xassLRArg(vendorLargeName901234567890, handler);
        handler.handle(new LoaderOfVendorLargeName901234567890().ready(xnewLRAryLs(vendorLargeName901234567890), _behaviorSelector));
    }

    /**
     * Load referrer of vendorLargeName90123456RefList by the set-upper of referrer. <br />
     * VENDOR_LARGE_NAME_90123456_REF by VENDOR_LARGE_NAME_901234567_ID, named 'vendorLargeName90123456RefList'.
     * <pre>
     * vendorLargeName901234567890Bhv.<span style="color: #DD4747">loadVendorLargeName90123456RefList</span>(vendorLargeName901234567890List, new ConditionBeanSetupper&lt;VendorLargeName90123456RefCB&gt;() {
     *     public void setup(VendorLargeName90123456RefCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (VendorLargeName901234567890 vendorLargeName901234567890 : vendorLargeName901234567890List) {
     *     ... = vendorLargeName901234567890.<span style="color: #DD4747">getVendorLargeName90123456RefList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setVendorLargeName901234567Id_InScope(pkList);
     * cb.query().addOrderBy_VendorLargeName901234567Id_Asc();
     * </pre>
     * @param vendorLargeName901234567890List The entity list of vendorLargeName901234567890. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<VendorLargeName90123456Ref> loadVendorLargeName90123456RefList(List<VendorLargeName901234567890> vendorLargeName901234567890List, ConditionBeanSetupper<VendorLargeName90123456RefCB> setupper) {
        xassLRArg(vendorLargeName901234567890List, setupper);
        return doLoadVendorLargeName90123456RefList(vendorLargeName901234567890List, new LoadReferrerOption<VendorLargeName90123456RefCB, VendorLargeName90123456Ref>().xinit(setupper));
    }

    /**
     * Load referrer of vendorLargeName90123456RefList by the set-upper of referrer. <br />
     * VENDOR_LARGE_NAME_90123456_REF by VENDOR_LARGE_NAME_901234567_ID, named 'vendorLargeName90123456RefList'.
     * <pre>
     * vendorLargeName901234567890Bhv.<span style="color: #DD4747">loadVendorLargeName90123456RefList</span>(vendorLargeName901234567890List, new ConditionBeanSetupper&lt;VendorLargeName90123456RefCB&gt;() {
     *     public void setup(VendorLargeName90123456RefCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = vendorLargeName901234567890.<span style="color: #DD4747">getVendorLargeName90123456RefList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setVendorLargeName901234567Id_InScope(pkList);
     * cb.query().addOrderBy_VendorLargeName901234567Id_Asc();
     * </pre>
     * @param vendorLargeName901234567890 The entity of vendorLargeName901234567890. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<VendorLargeName90123456Ref> loadVendorLargeName90123456RefList(VendorLargeName901234567890 vendorLargeName901234567890, ConditionBeanSetupper<VendorLargeName90123456RefCB> setupper) {
        xassLRArg(vendorLargeName901234567890, setupper);
        return doLoadVendorLargeName90123456RefList(xnewLRLs(vendorLargeName901234567890), new LoadReferrerOption<VendorLargeName90123456RefCB, VendorLargeName90123456Ref>().xinit(setupper));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param vendorLargeName901234567890 The entity of vendorLargeName901234567890. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<VendorLargeName90123456Ref> loadVendorLargeName90123456RefList(VendorLargeName901234567890 vendorLargeName901234567890, LoadReferrerOption<VendorLargeName90123456RefCB, VendorLargeName90123456Ref> loadReferrerOption) {
        xassLRArg(vendorLargeName901234567890, loadReferrerOption);
        return loadVendorLargeName90123456RefList(xnewLRLs(vendorLargeName901234567890), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param vendorLargeName901234567890List The entity list of vendorLargeName901234567890. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<VendorLargeName90123456Ref> loadVendorLargeName90123456RefList(List<VendorLargeName901234567890> vendorLargeName901234567890List, LoadReferrerOption<VendorLargeName90123456RefCB, VendorLargeName90123456Ref> loadReferrerOption) {
        xassLRArg(vendorLargeName901234567890List, loadReferrerOption);
        if (vendorLargeName901234567890List.isEmpty()) { return (NestedReferrerListGateway<VendorLargeName90123456Ref>)EMPTY_NREF_LGWAY; }
        return doLoadVendorLargeName90123456RefList(vendorLargeName901234567890List, loadReferrerOption);
    }

    protected NestedReferrerListGateway<VendorLargeName90123456Ref> doLoadVendorLargeName90123456RefList(List<VendorLargeName901234567890> vendorLargeName901234567890List, LoadReferrerOption<VendorLargeName90123456RefCB, VendorLargeName90123456Ref> option) {
        return helpLoadReferrerInternally(vendorLargeName901234567890List, option, "vendorLargeName90123456RefList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key vendorLargeName901234567Id.
     * @param vendorLargeName901234567890List The list of vendorLargeName901234567890. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractVendorLargeName901234567IdList(List<VendorLargeName901234567890> vendorLargeName901234567890List)
    { return helpExtractListInternally(vendorLargeName901234567890List, "vendorLargeName901234567Id"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * VendorLargeName901234567890 vendorLargeName901234567890 = new VendorLargeName901234567890();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorLargeName901234567890.setFoo...(value);
     * vendorLargeName901234567890.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorLargeName901234567890.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorLargeName901234567890.set...;</span>
     * vendorLargeName901234567890Bhv.<span style="color: #DD4747">insert</span>(vendorLargeName901234567890);
     * ... = vendorLargeName901234567890.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param vendorLargeName901234567890 The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(VendorLargeName901234567890 vendorLargeName901234567890) {
        doInsert(vendorLargeName901234567890, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * VendorLargeName901234567890 vendorLargeName901234567890 = new VendorLargeName901234567890();
     * vendorLargeName901234567890.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorLargeName901234567890.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorLargeName901234567890.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorLargeName901234567890.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendorLargeName901234567890.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     vendorLargeName901234567890Bhv.<span style="color: #DD4747">update</span>(vendorLargeName901234567890);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorLargeName901234567890 The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(VendorLargeName901234567890 vendorLargeName901234567890) {
        doUpdate(vendorLargeName901234567890, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param vendorLargeName901234567890 The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(VendorLargeName901234567890 vendorLargeName901234567890) {
        doInsertOrUpdate(vendorLargeName901234567890, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * VendorLargeName901234567890 vendorLargeName901234567890 = new VendorLargeName901234567890();
     * vendorLargeName901234567890.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendorLargeName901234567890.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     vendorLargeName901234567890Bhv.<span style="color: #DD4747">delete</span>(vendorLargeName901234567890);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorLargeName901234567890 The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(VendorLargeName901234567890 vendorLargeName901234567890) {
        doDelete(vendorLargeName901234567890, null);
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
     *     VendorLargeName901234567890 vendorLargeName901234567890 = new VendorLargeName901234567890();
     *     vendorLargeName901234567890.setFooName("foo");
     *     if (...) {
     *         vendorLargeName901234567890.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     vendorLargeName901234567890List.add(vendorLargeName901234567890);
     * }
     * vendorLargeName901234567890Bhv.<span style="color: #DD4747">batchInsert</span>(vendorLargeName901234567890List);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param vendorLargeName901234567890List The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<VendorLargeName901234567890> vendorLargeName901234567890List) {
        return doBatchInsert(vendorLargeName901234567890List, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     VendorLargeName901234567890 vendorLargeName901234567890 = new VendorLargeName901234567890();
     *     vendorLargeName901234567890.setFooName("foo");
     *     if (...) {
     *         vendorLargeName901234567890.setFooPrice(123);
     *     } else {
     *         vendorLargeName901234567890.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//vendorLargeName901234567890.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     vendorLargeName901234567890List.add(vendorLargeName901234567890);
     * }
     * vendorLargeName901234567890Bhv.<span style="color: #DD4747">batchUpdate</span>(vendorLargeName901234567890List);
     * </pre>
     * @param vendorLargeName901234567890List The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<VendorLargeName901234567890> vendorLargeName901234567890List) {
        return doBatchUpdate(vendorLargeName901234567890List, null);
    }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * vendorLargeName901234567890Bhv.<span style="color: #DD4747">batchUpdate</span>(vendorLargeName901234567890List, new SpecifyQuery<VendorLargeName901234567890CB>() {
     *     public void specify(VendorLargeName901234567890CB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * vendorLargeName901234567890Bhv.<span style="color: #DD4747">batchUpdate</span>(vendorLargeName901234567890List, new SpecifyQuery<VendorLargeName901234567890CB>() {
     *     public void specify(VendorLargeName901234567890CB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param vendorLargeName901234567890List The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<VendorLargeName901234567890> vendorLargeName901234567890List, SpecifyQuery<VendorLargeName901234567890CB> updateColumnSpec) {
        return doBatchUpdate(vendorLargeName901234567890List, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param vendorLargeName901234567890List The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<VendorLargeName901234567890> vendorLargeName901234567890List) {
        return doBatchDelete(vendorLargeName901234567890List, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * vendorLargeName901234567890Bhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;VendorLargeName901234567890, VendorLargeName901234567890CB&gt;() {
     *     public ConditionBean setup(VendorLargeName901234567890 entity, VendorLargeName901234567890CB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<VendorLargeName901234567890, VendorLargeName901234567890CB> setupper) {
        return doQueryInsert(setupper, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * VendorLargeName901234567890 vendorLargeName901234567890 = new VendorLargeName901234567890();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorLargeName901234567890.setPK...(value);</span>
     * vendorLargeName901234567890.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorLargeName901234567890.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorLargeName901234567890.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorLargeName901234567890.setVersionNo(value);</span>
     * VendorLargeName901234567890CB cb = new VendorLargeName901234567890CB();
     * cb.query().setFoo...(value);
     * vendorLargeName901234567890Bhv.<span style="color: #DD4747">queryUpdate</span>(vendorLargeName901234567890, cb);
     * </pre>
     * @param vendorLargeName901234567890 The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of VendorLargeName901234567890. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(VendorLargeName901234567890 vendorLargeName901234567890, VendorLargeName901234567890CB cb) {
        return doQueryUpdate(vendorLargeName901234567890, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * VendorLargeName901234567890CB cb = new VendorLargeName901234567890CB();
     * cb.query().setFoo...(value);
     * vendorLargeName901234567890Bhv.<span style="color: #DD4747">queryDelete</span>(vendorLargeName901234567890, cb);
     * </pre>
     * @param cb The condition-bean of VendorLargeName901234567890. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(VendorLargeName901234567890CB cb) {
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
     * VendorLargeName901234567890 vendorLargeName901234567890 = new VendorLargeName901234567890();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorLargeName901234567890.setFoo...(value);
     * vendorLargeName901234567890.setBar...(value);
     * InsertOption<VendorLargeName901234567890CB> option = new InsertOption<VendorLargeName901234567890CB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * vendorLargeName901234567890Bhv.<span style="color: #DD4747">varyingInsert</span>(vendorLargeName901234567890, option);
     * ... = vendorLargeName901234567890.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param vendorLargeName901234567890 The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(VendorLargeName901234567890 vendorLargeName901234567890, InsertOption<VendorLargeName901234567890CB> option) {
        assertInsertOptionNotNull(option);
        doInsert(vendorLargeName901234567890, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * VendorLargeName901234567890 vendorLargeName901234567890 = new VendorLargeName901234567890();
     * vendorLargeName901234567890.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorLargeName901234567890.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendorLargeName901234567890.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;VendorLargeName901234567890CB&gt; option = new UpdateOption&lt;VendorLargeName901234567890CB&gt;();
     *     option.self(new SpecifyQuery&lt;VendorLargeName901234567890CB&gt;() {
     *         public void specify(VendorLargeName901234567890CB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     vendorLargeName901234567890Bhv.<span style="color: #DD4747">varyingUpdate</span>(vendorLargeName901234567890, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorLargeName901234567890 The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(VendorLargeName901234567890 vendorLargeName901234567890, UpdateOption<VendorLargeName901234567890CB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(vendorLargeName901234567890, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param vendorLargeName901234567890 The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(VendorLargeName901234567890 vendorLargeName901234567890, InsertOption<VendorLargeName901234567890CB> insertOption, UpdateOption<VendorLargeName901234567890CB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdate(vendorLargeName901234567890, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param vendorLargeName901234567890 The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(VendorLargeName901234567890 vendorLargeName901234567890, DeleteOption<VendorLargeName901234567890CB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(vendorLargeName901234567890, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param vendorLargeName901234567890List The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<VendorLargeName901234567890> vendorLargeName901234567890List, InsertOption<VendorLargeName901234567890CB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(vendorLargeName901234567890List, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param vendorLargeName901234567890List The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<VendorLargeName901234567890> vendorLargeName901234567890List, UpdateOption<VendorLargeName901234567890CB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(vendorLargeName901234567890List, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param vendorLargeName901234567890List The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<VendorLargeName901234567890> vendorLargeName901234567890List, DeleteOption<VendorLargeName901234567890CB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(vendorLargeName901234567890List, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<VendorLargeName901234567890, VendorLargeName901234567890CB> setupper, InsertOption<VendorLargeName901234567890CB> option) {
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
     * VendorLargeName901234567890 vendorLargeName901234567890 = new VendorLargeName901234567890();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorLargeName901234567890.setPK...(value);</span>
     * vendorLargeName901234567890.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorLargeName901234567890.setVersionNo(value);</span>
     * VendorLargeName901234567890CB cb = new VendorLargeName901234567890CB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;VendorLargeName901234567890CB&gt; option = new UpdateOption&lt;VendorLargeName901234567890CB&gt;();
     * option.self(new SpecifyQuery&lt;VendorLargeName901234567890CB&gt;() {
     *     public void specify(VendorLargeName901234567890CB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * vendorLargeName901234567890Bhv.<span style="color: #DD4747">varyingQueryUpdate</span>(vendorLargeName901234567890, cb, option);
     * </pre>
     * @param vendorLargeName901234567890 The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of VendorLargeName901234567890. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(VendorLargeName901234567890 vendorLargeName901234567890, VendorLargeName901234567890CB cb, UpdateOption<VendorLargeName901234567890CB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(vendorLargeName901234567890, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of VendorLargeName901234567890. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(VendorLargeName901234567890CB cb, DeleteOption<VendorLargeName901234567890CB> option) {
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
    public OutsideSqlBasicExecutor<VendorLargeName901234567890Bhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<VendorLargeName901234567890Bhv> facadeExecutor = doOutsideSql();
        return facadeExecutor.xbasicExecutor(); // variable to resolve generic type
    }

    // ===================================================================================
    //                                                                         Hyper Patch
    //                                                                         ===========
    @Override
    protected <RESULT extends VendorLargeName901234567890> org.seasar.dbflute.bhv.core.command.SelectCursorCBCommand<RESULT> newSelectCursorCBCommand() {
        return new com.example.dbflute.oracle.dbflute.allcommon.DBFluteConfig.SelectCursorCBCommandHyperPatch<RESULT>();
    }

    @Override
    protected <RESULT extends VendorLargeName901234567890> org.seasar.dbflute.bhv.core.command.SelectListCBCommand<RESULT> newSelectListCBCommand() {
        return new com.example.dbflute.oracle.dbflute.allcommon.DBFluteConfig.SelectListCBCommandHyperPatch<RESULT>();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends VendorLargeName901234567890> typeOfSelectedEntity() { return VendorLargeName901234567890.class; }
    protected Class<VendorLargeName901234567890> typeOfHandlingEntity() { return VendorLargeName901234567890.class; }
    protected Class<VendorLargeName901234567890CB> typeOfHandlingConditionBean() { return VendorLargeName901234567890CB.class; }
}
