package com.example.dbflute.postgresql.dbflute.bsbhv;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.HpSLSExecutor;
import org.seasar.dbflute.cbean.chelper.HpSLSFunction;
import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.exception.*;
import org.seasar.dbflute.optional.OptionalEntity;
import org.seasar.dbflute.outsidesql.executor.*;
import com.example.dbflute.postgresql.dbflute.exbhv.*;
import com.example.dbflute.postgresql.dbflute.bsbhv.loader.*;
import com.example.dbflute.postgresql.dbflute.exentity.*;
import com.example.dbflute.postgresql.dbflute.bsentity.dbmeta.*;
import com.example.dbflute.postgresql.dbflute.cbean.*;

/**
 * The behavior of vendor_date_pk as TABLE. <br />
 * <pre>
 * [primary key]
 *     foo_date
 *
 * [column]
 *     foo_date, foo_name
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
 *     vendor_date_fk
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     vendorDateFkList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsVendorDatePkBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "vendor_date_pk"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public DBMeta getDBMeta() { return VendorDatePkDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public VendorDatePkDbm getMyDBMeta() { return VendorDatePkDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public VendorDatePk newEntity() { return new VendorDatePk(); }

    /** {@inheritDoc} */
    public VendorDatePkCB newConditionBean() { return new VendorDatePkCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public VendorDatePk newMyEntity() { return new VendorDatePk(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public VendorDatePkCB newMyConditionBean() { return new VendorDatePkCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * VendorDatePkCB cb = new VendorDatePkCB();
     * cb.query().setFoo...(value);
     * int count = vendorDatePkBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of VendorDatePk. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(VendorDatePkCB cb) {
        return facadeSelectCount(cb);
    }

    protected int facadeSelectCount(VendorDatePkCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(VendorDatePkCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(VendorDatePkCB cb) { // called by selectPage(cb)
        assertCBStateValid(cb);
        return delegateSelectCountPlainly(cb);
    }

    protected int doReadCount(ConditionBean cb) { return facadeSelectCount(downcast(cb)); }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean. #beforejava8 <br />
     * <span style="color: #AD4747; font-size: 120%">The return might be null if no data, so you should have null check.</span> <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, use selectEntityWithDeletedCheck().</span>
     * <pre>
     * VendorDatePkCB cb = new VendorDatePkCB();
     * cb.query().setFoo...(value);
     * VendorDatePk vendorDatePk = vendorDatePkBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (vendorDatePk != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = vendorDatePk.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of VendorDatePk. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorDatePk selectEntity(VendorDatePkCB cb) {
        return facadeSelectEntity(cb);
    }

    protected VendorDatePk facadeSelectEntity(VendorDatePkCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorDatePk> ENTITY doSelectEntity(VendorDatePkCB cb, Class<ENTITY> tp) {
        return helpSelectEntityInternally(cb, tp);
    }

    protected <ENTITY extends VendorDatePk> OptionalEntity<ENTITY> doSelectOptionalEntity(VendorDatePkCB cb, Class<ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * VendorDatePkCB cb = new VendorDatePkCB();
     * cb.query().setFoo...(value);
     * VendorDatePk vendorDatePk = vendorDatePkBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = vendorDatePk.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of VendorDatePk. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorDatePk selectEntityWithDeletedCheck(VendorDatePkCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    protected VendorDatePk facadeSelectEntityWithDeletedCheck(VendorDatePkCB cb) {
        return doSelectEntityWithDeletedCheck(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorDatePk> ENTITY doSelectEntityWithDeletedCheck(VendorDatePkCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp);
    }

    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) { return facadeSelectEntityWithDeletedCheck(downcast(cb)); }

    /**
     * Select the entity by the primary-key value.
     * @param fooDate : PK, NotNull, date(13). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorDatePk selectByPKValue(java.util.Date fooDate) {
        return facadeSelectByPKValue(fooDate);
    }

    protected VendorDatePk facadeSelectByPKValue(java.util.Date fooDate) {
        return doSelectByPK(fooDate, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorDatePk> ENTITY doSelectByPK(java.util.Date fooDate, Class<ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(fooDate), tp);
    }

    protected <ENTITY extends VendorDatePk> OptionalEntity<ENTITY> doSelectOptionalByPK(java.util.Date fooDate, Class<ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(fooDate, tp), fooDate);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param fooDate : PK, NotNull, date(13). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorDatePk selectByPKValueWithDeletedCheck(java.util.Date fooDate) {
        return doSelectByPKWithDeletedCheck(fooDate, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorDatePk> ENTITY doSelectByPKWithDeletedCheck(java.util.Date fooDate, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(fooDate), tp);
    }

    protected VendorDatePkCB xprepareCBAsPK(java.util.Date fooDate) {
        assertObjectNotNull("fooDate", fooDate);
        return newConditionBean().acceptPK(fooDate);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * VendorDatePkCB cb = new VendorDatePkCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;VendorDatePk&gt; vendorDatePkList = vendorDatePkBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (VendorDatePk vendorDatePk : vendorDatePkList) {
     *     ... = vendorDatePk.get...();
     * }
     * </pre>
     * @param cb The condition-bean of VendorDatePk. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<VendorDatePk> selectList(VendorDatePkCB cb) {
        return facadeSelectList(cb);
    }

    protected ListResultBean<VendorDatePk> facadeSelectList(VendorDatePkCB cb) {
        return doSelectList(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorDatePk> ListResultBean<ENTITY> doSelectList(VendorDatePkCB cb, Class<ENTITY> tp) {
        return helpSelectListInternally(cb, tp);
    }

    protected ListResultBean<? extends Entity> doReadList(ConditionBean cb) { return facadeSelectList(downcast(cb)); }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * VendorDatePkCB cb = new VendorDatePkCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;VendorDatePk&gt; page = vendorDatePkBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (VendorDatePk vendorDatePk : page) {
     *     ... = vendorDatePk.get...();
     * }
     * </pre>
     * @param cb The condition-bean of VendorDatePk. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<VendorDatePk> selectPage(VendorDatePkCB cb) {
        return facadeSelectPage(cb);
    }

    protected PagingResultBean<VendorDatePk> facadeSelectPage(VendorDatePkCB cb) {
        return doSelectPage(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorDatePk> PagingResultBean<ENTITY> doSelectPage(VendorDatePkCB cb, Class<ENTITY> tp) {
        return helpSelectPageInternally(cb, tp);
    }

    protected PagingResultBean<? extends Entity> doReadPage(ConditionBean cb) { return facadeSelectPage(downcast(cb)); }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * VendorDatePkCB cb = new VendorDatePkCB();
     * cb.query().setFoo...(value);
     * vendorDatePkBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;VendorDatePk&gt;() {
     *     public void handle(VendorDatePk entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of VendorDatePk. (NotNull)
     * @param entityRowHandler The handler of entity row of VendorDatePk. (NotNull)
     */
    public void selectCursor(VendorDatePkCB cb, EntityRowHandler<VendorDatePk> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    protected void facadeSelectCursor(VendorDatePkCB cb, EntityRowHandler<VendorDatePk> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorDatePk> void doSelectCursor(VendorDatePkCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * vendorDatePkBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(VendorDatePkCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<VendorDatePkCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    protected <RESULT> HpSLSFunction<VendorDatePkCB, RESULT> facadeScalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newConditionBean());
    }

    protected <RESULT, CB extends VendorDatePkCB> HpSLSFunction<CB, RESULT> doScalarSelect(final Class<RESULT> tp, final CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        HpSLSExecutor<CB, RESULT> executor = createHpSLSExecutor(); // variable to resolve generic
        return createSLSFunction(cb, tp, executor);
    }

    protected <RESULT> HpSLSFunction<? extends ConditionBean, RESULT> doReadScalar(Class<RESULT> tp) { return facadeScalarSelect(tp); }

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
     * @param vendorDatePkList The entity list of vendorDatePk. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<VendorDatePk> vendorDatePkList, ReferrerLoaderHandler<LoaderOfVendorDatePk> handler) {
        xassLRArg(vendorDatePkList, handler);
        handler.handle(new LoaderOfVendorDatePk().ready(vendorDatePkList, _behaviorSelector));
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
     * @param vendorDatePk The entity of vendorDatePk. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(VendorDatePk vendorDatePk, ReferrerLoaderHandler<LoaderOfVendorDatePk> handler) {
        xassLRArg(vendorDatePk, handler);
        handler.handle(new LoaderOfVendorDatePk().ready(xnewLRAryLs(vendorDatePk), _behaviorSelector));
    }

    /**
     * Load referrer of vendorDateFkList by the set-upper of referrer. <br />
     * vendor_date_fk by bar_date, named 'vendorDateFkList'.
     * <pre>
     * vendorDatePkBhv.<span style="color: #DD4747">loadVendorDateFkList</span>(vendorDatePkList, new ConditionBeanSetupper&lt;VendorDateFkCB&gt;() {
     *     public void setup(VendorDateFkCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (VendorDatePk vendorDatePk : vendorDatePkList) {
     *     ... = vendorDatePk.<span style="color: #DD4747">getVendorDateFkList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setBarDate_InScope(pkList);
     * cb.query().addOrderBy_BarDate_Asc();
     * </pre>
     * @param vendorDatePkList The entity list of vendorDatePk. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<VendorDateFk> loadVendorDateFkList(List<VendorDatePk> vendorDatePkList, ConditionBeanSetupper<VendorDateFkCB> setupper) {
        xassLRArg(vendorDatePkList, setupper);
        return doLoadVendorDateFkList(vendorDatePkList, new LoadReferrerOption<VendorDateFkCB, VendorDateFk>().xinit(setupper));
    }

    /**
     * Load referrer of vendorDateFkList by the set-upper of referrer. <br />
     * vendor_date_fk by bar_date, named 'vendorDateFkList'.
     * <pre>
     * vendorDatePkBhv.<span style="color: #DD4747">loadVendorDateFkList</span>(vendorDatePkList, new ConditionBeanSetupper&lt;VendorDateFkCB&gt;() {
     *     public void setup(VendorDateFkCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = vendorDatePk.<span style="color: #DD4747">getVendorDateFkList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setBarDate_InScope(pkList);
     * cb.query().addOrderBy_BarDate_Asc();
     * </pre>
     * @param vendorDatePk The entity of vendorDatePk. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<VendorDateFk> loadVendorDateFkList(VendorDatePk vendorDatePk, ConditionBeanSetupper<VendorDateFkCB> setupper) {
        xassLRArg(vendorDatePk, setupper);
        return doLoadVendorDateFkList(xnewLRLs(vendorDatePk), new LoadReferrerOption<VendorDateFkCB, VendorDateFk>().xinit(setupper));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param vendorDatePk The entity of vendorDatePk. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<VendorDateFk> loadVendorDateFkList(VendorDatePk vendorDatePk, LoadReferrerOption<VendorDateFkCB, VendorDateFk> loadReferrerOption) {
        xassLRArg(vendorDatePk, loadReferrerOption);
        return loadVendorDateFkList(xnewLRLs(vendorDatePk), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean setupper.} #beforejava8
     * @param vendorDatePkList The entity list of vendorDatePk. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<VendorDateFk> loadVendorDateFkList(List<VendorDatePk> vendorDatePkList, LoadReferrerOption<VendorDateFkCB, VendorDateFk> loadReferrerOption) {
        xassLRArg(vendorDatePkList, loadReferrerOption);
        if (vendorDatePkList.isEmpty()) { return (NestedReferrerListGateway<VendorDateFk>)EMPTY_NREF_LGWAY; }
        return doLoadVendorDateFkList(vendorDatePkList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<VendorDateFk> doLoadVendorDateFkList(List<VendorDatePk> vendorDatePkList, LoadReferrerOption<VendorDateFkCB, VendorDateFk> option) {
        return helpLoadReferrerInternally(vendorDatePkList, option, "vendorDateFkList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key fooDate.
     * @param vendorDatePkList The list of vendorDatePk. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<java.util.Date> extractFooDateList(List<VendorDatePk> vendorDatePkList)
    { return helpExtractListInternally(vendorDatePkList, "fooDate"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * VendorDatePk vendorDatePk = new VendorDatePk();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorDatePk.setFoo...(value);
     * vendorDatePk.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorDatePk.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorDatePk.set...;</span>
     * vendorDatePkBhv.<span style="color: #DD4747">insert</span>(vendorDatePk);
     * ... = vendorDatePk.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param vendorDatePk The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(VendorDatePk vendorDatePk) {
        doInsert(vendorDatePk, null);
    }

    protected void doInsert(VendorDatePk et, InsertOption<VendorDatePkCB> op) {
        assertObjectNotNull("vendorDatePk", et); prepareInsertOption(op); delegateInsert(et, op);
    }

    protected void prepareInsertOption(InsertOption<VendorDatePkCB> op) {
        if (op == null) { return; } assertInsertOptionStatus(op);
        if (op.hasSpecifiedInsertColumn()) { op.resolveInsertColumnSpecification(createCBForSpecifiedUpdate()); }
    }

    protected void doCreate(Entity et, InsertOption<? extends ConditionBean> op) { doInsert(downcast(et), downcast(op)); }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * VendorDatePk vendorDatePk = new VendorDatePk();
     * vendorDatePk.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorDatePk.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorDatePk.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorDatePk.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendorDatePk.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     vendorDatePkBhv.<span style="color: #DD4747">update</span>(vendorDatePk);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorDatePk The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(VendorDatePk vendorDatePk) {
        doUpdate(vendorDatePk, null);
    }

    protected void doUpdate(VendorDatePk et, UpdateOption<VendorDatePkCB> op) {
        assertObjectNotNull("vendorDatePk", et); prepareUpdateOption(op); helpUpdateInternally(et, op);
    }

    protected void prepareUpdateOption(UpdateOption<VendorDatePkCB> op) {
        if (op == null) { return; } assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) { op.resolveSelfSpecification(createCBForVaryingUpdate()); }
        if (op.hasSpecifiedUpdateColumn()) { op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate()); }
    }

    protected VendorDatePkCB createCBForVaryingUpdate()
    { VendorDatePkCB cb = newConditionBean(); cb.xsetupForVaryingUpdate(); return cb; }

    protected VendorDatePkCB createCBForSpecifiedUpdate()
    { VendorDatePkCB cb = newConditionBean(); cb.xsetupForSpecifiedUpdate(); return cb; }

    protected void doModify(Entity et, UpdateOption<? extends ConditionBean> op) { doUpdate(downcast(et), downcast(op)); }

    protected void doModifyNonstrict(Entity et, UpdateOption<? extends ConditionBean> op)
    { doModify(et, op); }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param vendorDatePk The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(VendorDatePk vendorDatePk) {
        doInsertOrUpdate(vendorDatePk, null, null);
    }

    protected void doInsertOrUpdate(VendorDatePk et, InsertOption<VendorDatePkCB> iop, UpdateOption<VendorDatePkCB> uop) {
        assertObjectNotNull("vendorDatePk", et); helpInsertOrUpdateInternally(et, iop, uop);
    }

    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop)
    { doInsertOrUpdate(downcast(et), downcast(iop), downcast(uop)); }

    protected void doCreateOrModifyNonstrict(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop)
    { doCreateOrModify(et, iop, uop); }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * VendorDatePk vendorDatePk = new VendorDatePk();
     * vendorDatePk.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendorDatePk.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     vendorDatePkBhv.<span style="color: #DD4747">delete</span>(vendorDatePk);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorDatePk The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(VendorDatePk vendorDatePk) {
        doDelete(vendorDatePk, null);
    }

    protected void doDelete(VendorDatePk et, final DeleteOption<VendorDatePkCB> op) {
        assertObjectNotNull("vendorDatePk", et); prepareDeleteOption(op); helpDeleteInternally(et, op);
    }

    protected void prepareDeleteOption(DeleteOption<VendorDatePkCB> op) { if (op != null) { assertDeleteOptionStatus(op); } }

    protected void doRemove(Entity et, DeleteOption<? extends ConditionBean> op) { doDelete(downcast(et), downcast(op)); }

    protected void doRemoveNonstrict(Entity et, DeleteOption<? extends ConditionBean> op)
    { doRemove(et, op); }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch-insert the entity list modified-only of same-set columns. (DefaultConstraintsEnabled) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <p><span style="color: #DD4747; font-size: 120%">The columns of least common multiple are registered like this:</span></p>
     * <pre>
     * for (... : ...) {
     *     VendorDatePk vendorDatePk = new VendorDatePk();
     *     vendorDatePk.setFooName("foo");
     *     if (...) {
     *         vendorDatePk.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     vendorDatePkList.add(vendorDatePk);
     * }
     * vendorDatePkBhv.<span style="color: #DD4747">batchInsert</span>(vendorDatePkList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param vendorDatePkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<VendorDatePk> vendorDatePkList) {
        return doBatchInsert(vendorDatePkList, null);
    }

    protected int[] doBatchInsert(List<VendorDatePk> ls, InsertOption<VendorDatePkCB> op) {
        assertObjectNotNull("vendorDatePkList", ls);
        InsertOption<VendorDatePkCB> rlop; if (op != null) { rlop = op; } else { rlop = createPlainInsertOption(); }
        prepareBatchInsertOption(ls, rlop); // required
        return delegateBatchInsert(ls, rlop);
    }

    protected void prepareBatchInsertOption(List<VendorDatePk> ls, InsertOption<VendorDatePkCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(ls);
        prepareInsertOption(op);
    }

    protected int[] doLumpCreate(List<Entity> ls, InsertOption<? extends ConditionBean> op) { return doBatchInsert(downcast(ls), downcast(op)); }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     VendorDatePk vendorDatePk = new VendorDatePk();
     *     vendorDatePk.setFooName("foo");
     *     if (...) {
     *         vendorDatePk.setFooPrice(123);
     *     } else {
     *         vendorDatePk.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//vendorDatePk.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     vendorDatePkList.add(vendorDatePk);
     * }
     * vendorDatePkBhv.<span style="color: #DD4747">batchUpdate</span>(vendorDatePkList);
     * </pre>
     * @param vendorDatePkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<VendorDatePk> vendorDatePkList) {
        return doBatchUpdate(vendorDatePkList, null);
    }

    protected int[] doBatchUpdate(List<VendorDatePk> ls, UpdateOption<VendorDatePkCB> op) {
        assertObjectNotNull("vendorDatePkList", ls);
        UpdateOption<VendorDatePkCB> rlop; if (op != null) { rlop = op; } else { rlop = createPlainUpdateOption(); }
        prepareBatchUpdateOption(ls, rlop); // required
        return delegateBatchUpdate(ls, rlop);
    }

    protected void prepareBatchUpdateOption(List<VendorDatePk> ls, UpdateOption<VendorDatePkCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(ls);
        prepareUpdateOption(op);
    }

    protected int[] doLumpModify(List<Entity> ls, UpdateOption<? extends ConditionBean> op) { return doBatchUpdate(downcast(ls), downcast(op)); }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * vendorDatePkBhv.<span style="color: #DD4747">batchUpdate</span>(vendorDatePkList, new SpecifyQuery<VendorDatePkCB>() {
     *     public void specify(VendorDatePkCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * vendorDatePkBhv.<span style="color: #DD4747">batchUpdate</span>(vendorDatePkList, new SpecifyQuery<VendorDatePkCB>() {
     *     public void specify(VendorDatePkCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param vendorDatePkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<VendorDatePk> vendorDatePkList, SpecifyQuery<VendorDatePkCB> updateColumnSpec) {
        return doBatchUpdate(vendorDatePkList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op)
    { return doLumpModify(ls, op); }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param vendorDatePkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<VendorDatePk> vendorDatePkList) {
        return doBatchDelete(vendorDatePkList, null);
    }

    protected int[] doBatchDelete(List<VendorDatePk> ls, DeleteOption<VendorDatePkCB> op) {
        assertObjectNotNull("vendorDatePkList", ls);
        prepareDeleteOption(op);
        return delegateBatchDelete(ls, op);
    }

    protected int[] doLumpRemove(List<Entity> ls, DeleteOption<? extends ConditionBean> op) { return doBatchDelete(downcast(ls), downcast(op)); }

    protected int[] doLumpRemoveNonstrict(List<Entity> ls, DeleteOption<? extends ConditionBean> op)
    { return doLumpRemove(ls, op); }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * vendorDatePkBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;VendorDatePk, VendorDatePkCB&gt;() {
     *     public ConditionBean setup(vendorDatePk entity, VendorDatePkCB intoCB) {
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
     * @param setupper The setup-per of query-insert. (NotNull)
     * @return The inserted count.
     */
    public int queryInsert(QueryInsertSetupper<VendorDatePk, VendorDatePkCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<VendorDatePk, VendorDatePkCB> sp, InsertOption<VendorDatePkCB> op) {
        assertObjectNotNull("setupper", sp); prepareInsertOption(op);
        VendorDatePk et = newEntity(); VendorDatePkCB cb = createCBForQueryInsert();
        return delegateQueryInsert(et, cb, sp.setup(et, cb), op);
    }

    protected VendorDatePkCB createCBForQueryInsert()
    { VendorDatePkCB cb = newConditionBean(); cb.xsetupForQueryInsert(); return cb; }

    protected int doRangeCreate(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> setupper, InsertOption<? extends ConditionBean> op)
    { return doQueryInsert(downcast(setupper), downcast(op)); }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * VendorDatePk vendorDatePk = new VendorDatePk();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorDatePk.setPK...(value);</span>
     * vendorDatePk.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorDatePk.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorDatePk.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorDatePk.setVersionNo(value);</span>
     * VendorDatePkCB cb = new VendorDatePkCB();
     * cb.query().setFoo...(value);
     * vendorDatePkBhv.<span style="color: #DD4747">queryUpdate</span>(vendorDatePk, cb);
     * </pre>
     * @param vendorDatePk The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of VendorDatePk. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(VendorDatePk vendorDatePk, VendorDatePkCB cb) {
        return doQueryUpdate(vendorDatePk, cb, null);
    }

    protected int doQueryUpdate(VendorDatePk et, VendorDatePkCB cb, UpdateOption<VendorDatePkCB> op) {
        assertObjectNotNull("vendorDatePk", et); assertCBStateValid(cb); prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(et, cb, op) : 0;
    }

    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op)
    { return doQueryUpdate(downcast(et), downcast(cb), downcast(op)); }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * VendorDatePkCB cb = new VendorDatePkCB();
     * cb.query().setFoo...(value);
     * vendorDatePkBhv.<span style="color: #DD4747">queryDelete</span>(vendorDatePk, cb);
     * </pre>
     * @param cb The condition-bean of VendorDatePk. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(VendorDatePkCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(VendorDatePkCB cb, DeleteOption<VendorDatePkCB> op) {
        assertCBStateValid(cb); prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) { return doQueryDelete(downcast(cb), downcast(op)); }

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
     * VendorDatePk vendorDatePk = new VendorDatePk();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorDatePk.setFoo...(value);
     * vendorDatePk.setBar...(value);
     * InsertOption<VendorDatePkCB> option = new InsertOption<VendorDatePkCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * vendorDatePkBhv.<span style="color: #DD4747">varyingInsert</span>(vendorDatePk, option);
     * ... = vendorDatePk.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param vendorDatePk The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(VendorDatePk vendorDatePk, InsertOption<VendorDatePkCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(vendorDatePk, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * VendorDatePk vendorDatePk = new VendorDatePk();
     * vendorDatePk.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorDatePk.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendorDatePk.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;VendorDatePkCB&gt; option = new UpdateOption&lt;VendorDatePkCB&gt;();
     *     option.self(new SpecifyQuery&lt;VendorDatePkCB&gt;() {
     *         public void specify(VendorDatePkCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     vendorDatePkBhv.<span style="color: #DD4747">varyingUpdate</span>(vendorDatePk, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorDatePk The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(VendorDatePk vendorDatePk, UpdateOption<VendorDatePkCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(vendorDatePk, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param vendorDatePk The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(VendorDatePk vendorDatePk, InsertOption<VendorDatePkCB> insertOption, UpdateOption<VendorDatePkCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdate(vendorDatePk, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param vendorDatePk The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(VendorDatePk vendorDatePk, DeleteOption<VendorDatePkCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(vendorDatePk, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param vendorDatePkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<VendorDatePk> vendorDatePkList, InsertOption<VendorDatePkCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(vendorDatePkList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param vendorDatePkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<VendorDatePk> vendorDatePkList, UpdateOption<VendorDatePkCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(vendorDatePkList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param vendorDatePkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<VendorDatePk> vendorDatePkList, DeleteOption<VendorDatePkCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(vendorDatePkList, option);
    }

    // -----------------------------------------------------
    //                                          Query Update
    //                                          ------------
    /**
     * Insert the several entities by query with varying requests (modified-only for fixed value). <br />
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br />
     * Other specifications are same as queryInsert(entity, setupper).
     * @param setupper The setup-per of query-insert. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The inserted count.
     */
    public int varyingQueryInsert(QueryInsertSetupper<VendorDatePk, VendorDatePkCB> setupper, InsertOption<VendorDatePkCB> option) {
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
     * VendorDatePk vendorDatePk = new VendorDatePk();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorDatePk.setPK...(value);</span>
     * vendorDatePk.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorDatePk.setVersionNo(value);</span>
     * VendorDatePkCB cb = new VendorDatePkCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;VendorDatePkCB&gt; option = new UpdateOption&lt;VendorDatePkCB&gt;();
     * option.self(new SpecifyQuery&lt;VendorDatePkCB&gt;() {
     *     public void specify(VendorDatePkCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * vendorDatePkBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(vendorDatePk, cb, option);
     * </pre>
     * @param vendorDatePk The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of VendorDatePk. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(VendorDatePk vendorDatePk, VendorDatePkCB cb, UpdateOption<VendorDatePkCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(vendorDatePk, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of VendorDatePk. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(VendorDatePkCB cb, DeleteOption<VendorDatePkCB> option) {
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
    public OutsideSqlBasicExecutor<VendorDatePkBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    protected Class<VendorDatePk> typeOfSelectedEntity() { return VendorDatePk.class; }
    protected VendorDatePk downcast(Entity et) { return helpEntityDowncastInternally(et, VendorDatePk.class); }
    protected VendorDatePkCB downcast(ConditionBean cb) { return helpConditionBeanDowncastInternally(cb, VendorDatePkCB.class); }
    @SuppressWarnings("unchecked")
    protected List<VendorDatePk> downcast(List<? extends Entity> ls) { return (List<VendorDatePk>)ls; }
    @SuppressWarnings("unchecked")
    protected InsertOption<VendorDatePkCB> downcast(InsertOption<? extends ConditionBean> op) { return (InsertOption<VendorDatePkCB>)op; }
    @SuppressWarnings("unchecked")
    protected UpdateOption<VendorDatePkCB> downcast(UpdateOption<? extends ConditionBean> op) { return (UpdateOption<VendorDatePkCB>)op; }
    @SuppressWarnings("unchecked")
    protected DeleteOption<VendorDatePkCB> downcast(DeleteOption<? extends ConditionBean> op) { return (DeleteOption<VendorDatePkCB>)op; }
    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<VendorDatePk, VendorDatePkCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp)
    { return (QueryInsertSetupper<VendorDatePk, VendorDatePkCB>)sp; }
}
